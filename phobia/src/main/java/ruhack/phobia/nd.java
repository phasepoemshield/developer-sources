/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_3532
 *  net.minecraft.class_5348$class_5246
 *  org.joml.Vector4i
 */
package ruhack.phobia;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Optional;
import java.util.regex.Pattern;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_3532;
import net.minecraft.class_5348;
import org.joml.Vector4i;
import ruhack.phobia.gk;
import ruhack.phobia.nm;

public class nd {
    public static final int red;
    private static int[] hlbs;
    public static final boolean c;
    private static long[] hlbk;
    private static String clientColorMode;
    public static final int orange;
    public static final boolean a;
    private static int clientColorR;
    private static int clientColorB;
    private static int[] clientColors;
    private static long colorTransitionStart;
    public static final int yellow;
    private static long[] hlbl;
    protected static final long oo = -5555000164291779385L;
    public static final int green;
    public static final Pattern FORMATTING_CODE_PATTERN;
    public static final int b;
    private static int[] hlbt;
    private static int clientColorG;

    private static /* synthetic */ void hppc() {
        nd.hlbt[1300] = -550846875;
        nd.hlbt[1301] = 1618122469;
        nd.hlbt[1302] = -1067659774;
        nd.hlbt[1303] = -1959790035;
        nd.hlbt[1304] = -765143073;
        nd.hlbt[1305] = 69765308;
        nd.hlbt[1306] = 378529836;
        nd.hlbt[1307] = 1513569876;
        nd.hlbt[1308] = 1771348760;
        nd.hlbt[1309] = -305969071;
        nd.hlbt[1310] = 1929721731;
        nd.hlbt[1311] = -872350941;
        nd.hlbt[1312] = 516120312;
        nd.hlbt[1313] = 1292255019;
        nd.hlbt[1314] = -307979004;
        nd.hlbt[1315] = 187777245;
        nd.hlbt[1316] = 2098867773;
        nd.hlbt[1317] = 1826067172;
        nd.hlbt[1318] = 1355049542;
        nd.hlbt[1319] = -1789991046;
        nd.hlbt[1320] = 1383345762;
        nd.hlbt[1321] = -1351323283;
        nd.hlbt[1322] = 696421261;
        nd.hlbt[1323] = 290617680;
        nd.hlbt[1324] = 677054920;
        nd.hlbt[1325] = -1129946731;
        nd.hlbt[1326] = -51273031;
        nd.hlbt[1327] = -981498276;
        nd.hlbt[1328] = -1472404631;
        nd.hlbt[1329] = -444411250;
        nd.hlbt[1330] = -825541909;
        nd.hlbt[1331] = 1664233602;
        nd.hlbt[1332] = 2132714733;
        nd.hlbt[1333] = -1715729276;
        nd.hlbt[1334] = 584796794;
        nd.hlbt[1335] = 883771895;
        nd.hlbt[1336] = -704958333;
        nd.hlbt[1337] = -161619999;
        nd.hlbt[1338] = -746722589;
        nd.hlbt[1339] = -1864966105;
        nd.hlbt[1340] = -1073521676;
        nd.hlbt[1341] = 17794252;
        nd.hlbt[1342] = 19667965;
        nd.hlbt[1343] = 1568149721;
        nd.hlbt[1344] = -1099298571;
        nd.hlbt[1345] = -803901711;
        nd.hlbt[1346] = -264960400;
        nd.hlbt[1347] = -1010659951;
        nd.hlbt[1348] = 1774775996;
        nd.hlbt[1349] = 1639324039;
        nd.hlbt[1350] = -643534489;
        nd.hlbt[1351] = -903843531;
        nd.hlbt[1352] = -736106283;
        nd.hlbt[1353] = 1045499790;
        nd.hlbt[1354] = 925785988;
        nd.hlbt[1355] = -1619440653;
        nd.hlbt[1356] = 1287249717;
        nd.hlbt[1357] = -811092903;
        nd.hlbt[1358] = -1560082668;
        nd.hlbt[1359] = 1096911201;
        nd.hlbt[1360] = 419404687;
        nd.hlbt[1361] = 30117963;
        nd.hlbt[1362] = 854432132;
        nd.hlbt[1363] = 1717015781;
        nd.hlbt[1364] = 1668423654;
        nd.hlbt[1365] = -1356978715;
        nd.hlbt[1366] = 626232850;
        nd.hlbt[1367] = 2038718550;
        nd.hlbt[1368] = -1127525789;
        nd.hlbt[1369] = 889885439;
        nd.hlbt[1370] = -1647221817;
        nd.hlbt[1371] = 615198947;
        nd.hlbt[1372] = -480439705;
        nd.hlbt[1373] = -1964932523;
        nd.hlbt[1374] = 428674723;
        nd.hlbt[1375] = -1454451149;
        nd.hlbt[1376] = 883165924;
        nd.hlbt[1377] = 1136931141;
        nd.hlbt[1378] = -1339718630;
        nd.hlbt[1379] = -774852658;
        nd.hlbt[1380] = -427502104;
        nd.hlbt[1381] = 1281494;
        nd.hlbt[1382] = 1487542975;
        nd.hlbt[1383] = -525327173;
        nd.hlbt[1384] = 1845446010;
        nd.hlbt[1385] = 916762876;
        nd.hlbt[1386] = 1769713982;
        nd.hlbt[1387] = -849907351;
        nd.hlbt[1388] = -376642135;
        nd.hlbt[1389] = -1437845223;
        nd.hlbt[1390] = -1046163312;
        nd.hlbt[1391] = -1387466798;
        nd.hlbt[1392] = -350417951;
        nd.hlbt[1393] = -647608121;
        nd.hlbt[1394] = 1230323049;
        nd.hlbt[1395] = 476986845;
        nd.hlbt[1396] = 435292032;
        nd.hlbt[1397] = -1021760044;
        nd.hlbt[1398] = 1090563315;
        nd.hlbt[1399] = 827123203;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int getGreen(int var0) {
        block22: {
            v0 /* !! */  = nd.oo;
            if (true) ** GOTO lbl5
            block12: while (true) {
                v0 /* !! */  = (long)(v1 - nd.hlbm("hnnx", hlbj(int ), (int)369));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1638139514: {
                        v1 = nd.hlbm("hnny", hlbj(int ), (int)370);
                        continue block12;
                    }
                    case -129141631: {
                        v1 = nd.hlbm("hnnz", hlbj(int ), (int)371);
                        continue block12;
                    }
                    case 573138161: {
                        v1 = nd.hlbm("hnoa", hlbj(int ), (int)372);
                        continue block12;
                    }
                    case 1076290759: {
                        break block12;
                    }
                }
                break;
            }
            var3_1 = nd.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnob", hlbj(int ), (int)373)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == nd.hlbm("hnoc", hlbr(int ), (int)846)) break;
                v2 /* !! */  = (long)nd.hlbm("hnod", hlbr(int ), (int)847);
            }
            var2_2 /* !! */  = nd.b;
            while (true) {
                block23: {
                    if ((v3 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnoe", hlbj(int ), (int)374)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  != nd.hlbm("hnof", hlbr(int ), (int)848)) break block23;
                    var1_3 = nd.a;
                    if (var2_2 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v3 /* !! */  = (long)nd.hlbm("hnog", hlbr(int ), (int)849);
            }
            cfr_temp_0 = -2147483648;
            block15: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_1) {
                            throw null;
                        }
                        if (var1_3 || var1_3) {
                            return (int)nd.hlbm("hnoh", hlbr(int ), (int)850);
                        }
                        return var0 >> nd.hlbm("hnoi", hlbr(int ), (int)851) & nd.hlbm("hnoj", hlbr(int ), (int)852);
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        break block22;
                    }
lbl47:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)nd.hlbm("hnok", hlbr(int ), (int)853);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block15;
                        throw null;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)nd.hlbm("hnom", hlbr(int ), (int)855);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)nd.hlbm("hnol", hlbr(int ), (int)854);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)nd.hlbm("hnon", hlbr(int ), (int)856);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hplt() {
        nd.hlbt[0] = 1281157483;
        nd.hlbt[1] = -1887180041;
        nd.hlbt[2] = 1473307305;
        nd.hlbt[3] = 533657118;
        nd.hlbt[4] = 939899699;
        nd.hlbt[5] = -1127059877;
        nd.hlbt[6] = -377689587;
        nd.hlbt[7] = -209355461;
        nd.hlbt[8] = -1667803345;
        nd.hlbt[9] = -160447520;
        nd.hlbt[10] = -1650523535;
        nd.hlbt[11] = 181255886;
        nd.hlbt[12] = 1843386870;
        nd.hlbt[13] = 518750817;
        nd.hlbt[14] = 442032137;
        nd.hlbt[15] = 1272182565;
        nd.hlbt[16] = -1070820096;
        nd.hlbt[17] = 991965735;
        nd.hlbt[18] = -903071582;
        nd.hlbt[19] = 376397156;
        nd.hlbt[20] = -1403546625;
        nd.hlbt[21] = 58063191;
        nd.hlbt[22] = 1317670039;
        nd.hlbt[23] = 5092927;
        nd.hlbt[24] = 2058031710;
        nd.hlbt[25] = 1465385307;
        nd.hlbt[26] = 1695984128;
        nd.hlbt[27] = -1351048645;
        nd.hlbt[28] = -992264371;
        nd.hlbt[29] = -1619142067;
        nd.hlbt[30] = -967002075;
        nd.hlbt[31] = -1766500348;
        nd.hlbt[32] = 111147287;
        nd.hlbt[33] = -909629485;
        nd.hlbt[34] = -137373221;
        nd.hlbt[35] = -1336153117;
        nd.hlbt[36] = 1063861903;
        nd.hlbt[37] = -569280635;
        nd.hlbt[38] = 1602297958;
        nd.hlbt[39] = 1659210321;
        nd.hlbt[40] = 813211129;
        nd.hlbt[41] = 305277734;
        nd.hlbt[42] = 1290514836;
        nd.hlbt[43] = 1127889827;
        nd.hlbt[44] = 338385160;
        nd.hlbt[45] = 394678862;
        nd.hlbt[46] = 2140937395;
        nd.hlbt[47] = 906112100;
        nd.hlbt[48] = 1980428911;
        nd.hlbt[49] = -627292507;
        nd.hlbt[50] = 412216713;
        nd.hlbt[51] = -127982306;
        nd.hlbt[52] = -1991339921;
        nd.hlbt[53] = 25304115;
        nd.hlbt[54] = 124691814;
        nd.hlbt[55] = 764394136;
        nd.hlbt[56] = 291650024;
        nd.hlbt[57] = -212676726;
        nd.hlbt[58] = -768676275;
        nd.hlbt[59] = -110705071;
        nd.hlbt[60] = -1061965623;
        nd.hlbt[61] = -1907150648;
        nd.hlbt[62] = 1514216388;
        nd.hlbt[63] = 1832201061;
        nd.hlbt[64] = -1863934169;
        nd.hlbt[65] = -96143885;
        nd.hlbt[66] = 1405231427;
        nd.hlbt[67] = 235016670;
        nd.hlbt[68] = 1746335214;
        nd.hlbt[69] = 1662069621;
        nd.hlbt[70] = -1003405755;
        nd.hlbt[71] = -2106441336;
        nd.hlbt[72] = 146100121;
        nd.hlbt[73] = 1099310868;
        nd.hlbt[74] = -1743788487;
        nd.hlbt[75] = -361488726;
        nd.hlbt[76] = 439050282;
        nd.hlbt[77] = 319664925;
        nd.hlbt[78] = 334245479;
        nd.hlbt[79] = -1894602918;
        nd.hlbt[80] = 910049476;
        nd.hlbt[81] = -1989581208;
        nd.hlbt[82] = 9832801;
        nd.hlbt[83] = 1191229322;
        nd.hlbt[84] = 741046774;
        nd.hlbt[85] = -621533827;
        nd.hlbt[86] = -303890110;
        nd.hlbt[87] = -287137459;
        nd.hlbt[88] = 1781008622;
        nd.hlbt[89] = 0x1147444;
        nd.hlbt[90] = 1781238525;
        nd.hlbt[91] = -1775116374;
        nd.hlbt[92] = 600989802;
        nd.hlbt[93] = 132308114;
        nd.hlbt[94] = 669746202;
        nd.hlbt[95] = -736537089;
        nd.hlbt[96] = -2022230673;
        nd.hlbt[97] = -42123789;
        nd.hlbt[98] = -1090914995;
        nd.hlbt[99] = 2138170;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int getStaticGradientColor(int var0) {
        var10_1 = nd.c;
        var9_2 /* !! */  = nd.b;
        var8_3 = nd.a;
        if (var10_1) {
            throw null;
lbl6:
            // 18 sources

            return (int)nd.hlbm("hmes", hlbr(int ), (int)385);
        }
        if (var8_3) ** GOTO lbl6
        if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_3) ** GOTO lbl6
                var1_4 = nd.getActiveColorCount();
                if (var8_3 || var8_3) ** GOTO lbl6
                if (var1_4 >= nd.hlbm("hmet", hlbr(int ), (int)386)) ** GOTO lbl20
                if (var8_3 || var8_3) ** GOTO lbl6
                var2_5 = nd.clientColors[0];
                if (var8_3 || var8_3) ** GOTO lbl6
                return nd.rgba(var2_5 >> nd.hlbm("hmeu", hlbr(int ), (int)387) & nd.hlbm("hmev", hlbr(int ), (int)388), var2_5 >> nd.hlbm("hmew", hlbr(int ), (int)389) & nd.hlbm("hmex", hlbr(int ), (int)390), var2_5 & nd.hlbm("hmey", hlbr(int ), (int)391), var0);
lbl20:
                // 1 sources

                if (var8_3 || var8_3) ** GOTO lbl6
                var2_6 = nd.hlbm("hmez", hlzk(int ), (int)392);
                if (var8_3 || var8_3) ** GOTO lbl6
                if (var1_4 != nd.hlbm("hmfa", hlbr(int ), (int)393)) ** GOTO lbl30
                if (var8_3 || var8_3) ** GOTO lbl6
                var3_7 = nd.clientColors[0];
                if (var8_3 || var8_3) ** GOTO lbl6
                var4_9 = nd.clientColors[1];
                if (var8_3 || var8_3) ** GOTO lbl6
                return nd.interpolateColor(var3_7, var4_9, (float)var2_6, var0);
lbl30:
                // 1 sources

                if (var8_3 || var8_3) ** GOTO lbl6
                var3_8 = 1.0f / (float)(var1_4 - nd.hlbm("hmfb", hlbr(int ), (int)394));
                if (var8_3 || var8_3) ** GOTO lbl6
                var4_10 = (int)(var2_6 / var3_8);
                if (var8_3 || var8_3) ** GOTO lbl6
                var4_10 = Math.min(var4_10, var1_4 - nd.hlbm("hmfc", hlbr(int ), (int)395));
                if (var8_3 || var8_3) ** GOTO lbl6
                var5_11 /* !! */  = (var2_6 - (float)var4_10 * var3_8) / var3_8;
                if (var8_3 || var8_3) ** GOTO lbl6
                var5_11 /* !! */  = (reference)Math.max(0.0f, Math.min(1.0f, (float)var5_11 /* !! */ ));
                if (var8_3 || var8_3) ** GOTO lbl6
                var6_12 = nd.clientColors[var4_10];
                if (var8_3 || var8_3) ** GOTO lbl6
                var7_13 = nd.clientColors[var4_10 + 1];
                if (!var8_3 && !var8_3) ** break;
                ** continue;
                return nd.interpolateColor(var6_12, var7_13, (float)var5_11 /* !! */ , var0);
            }
            case 0: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfd", hlbr(int ), (int)396);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl52:
            // 3 sources

            case 1: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfe", hlbr(int ), (int)397);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl57:
            // 3 sources

            case 2: {
                var9_2 /* !! */  = (int)nd.hlbm("hmff", hlbr(int ), (int)398);
                if (!var10_1) break;
                throw null;
            }
lbl61:
            // 2 sources

            case 3: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfg", hlbr(int ), (int)399);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl66:
            // 3 sources

            case 4: {
                do {
                    var9_2 /* !! */  = (int)nd.hlbm("hmfh", hlbr(int ), (int)400);
                } while (!var10_1);
                throw null;
            }
lbl71:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_2 /* !! */  = (int)nd.hlbm("hmfi", hlbr(int ), (int)401);
                    if (var10_1) {
                        throw null;
                    }
                    ** GOTO lbl198
                    break;
                }
            }
lbl77:
            // 2 sources

            case 6: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfj", hlbr(int ), (int)402);
                if (var10_1) {
                    throw null;
                }
            }
            case 7: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfk", hlbr(int ), (int)403);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl86:
            // 2 sources

            case 8: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfl", hlbr(int ), (int)404);
                if (!var10_1) ** GOTO lbl66
                throw null;
            }
            case 9: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfm", hlbr(int ), (int)405);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl95:
            // 2 sources

            case 10: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfn", hlbr(int ), (int)406);
                if (!var10_1) break;
                throw null;
            }
lbl99:
            // 2 sources

            case 11: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfo", hlbr(int ), (int)407);
                if (!var10_1) ** GOTO lbl61
                throw null;
            }
            case 12: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfp", hlbr(int ), (int)408);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 13: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfq", hlbr(int ), (int)409);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 14: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfr", hlbr(int ), (int)410);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl118:
            // 2 sources

            case 15: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfs", hlbr(int ), (int)411);
                if (!var10_1) ** GOTO lbl71
                throw null;
            }
lbl122:
            // 3 sources

            case 16: {
                var9_2 /* !! */  = (int)nd.hlbm("hmft", hlbr(int ), (int)412);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 17: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfu", hlbr(int ), (int)413);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 18: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfv", hlbr(int ), (int)414);
                if (!var10_1) ** GOTO lbl118
                throw null;
            }
lbl136:
            // 2 sources

            case 19: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfw", hlbr(int ), (int)415);
                if (!var10_1) ** GOTO lbl122
                throw null;
            }
lbl140:
            // 2 sources

            case 20: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfx", hlbr(int ), (int)416);
                if (!var10_1) ** GOTO lbl77
                throw null;
            }
lbl144:
            // 2 sources

            case 21: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfy", hlbr(int ), (int)417);
                if (!var10_1) ** GOTO lbl52
                throw null;
            }
lbl148:
            // 3 sources

            case 22: {
                var9_2 /* !! */  = (int)nd.hlbm("hmfz", hlbr(int ), (int)418);
                if (!var10_1) ** GOTO lbl86
                throw null;
            }
lbl152:
            // 2 sources

            case 23: {
                var9_2 /* !! */  = (int)nd.hlbm("hmga", hlbr(int ), (int)419);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl157:
            // 3 sources

            case 24: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgb", hlbr(int ), (int)420);
                if (!var10_1) ** GOTO lbl136
                throw null;
            }
            case 25: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgc", hlbr(int ), (int)421);
                if (!var10_1) ** GOTO lbl148
                throw null;
            }
            case 26: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgd", hlbr(int ), (int)422);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 27: {
                var9_2 /* !! */  = (int)nd.hlbm("hmge", hlbr(int ), (int)423);
                if (!var10_1) ** GOTO lbl95
                throw null;
            }
            case 28: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgf", hlbr(int ), (int)424);
                if (!var10_1) ** GOTO lbl148
                throw null;
            }
            case 29: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgg", hlbr(int ), (int)425);
                if (!var10_1) ** GOTO lbl66
                throw null;
            }
lbl182:
            // 3 sources

            case 30: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgh", hlbr(int ), (int)426);
                if (!var10_1) ** GOTO lbl140
                throw null;
            }
lbl186:
            // 4 sources

            case 31: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgi", hlbr(int ), (int)427);
                if (!var10_1) ** GOTO lbl52
                throw null;
            }
            case 32: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgj", hlbr(int ), (int)428);
                if (!var10_1) ** GOTO lbl57
                throw null;
            }
lbl194:
            // 2 sources

            case 33: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgk", hlbr(int ), (int)429);
                if (!var10_1) ** GOTO lbl144
                throw null;
            }
lbl198:
            // 2 sources

            case 34: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgl", hlbr(int ), (int)430);
                if (!var10_1) ** GOTO lbl57
                throw null;
            }
lbl202:
            // 2 sources

            case 35: {
                var9_2 /* !! */  = (int)nd.hlbm("hmgm", hlbr(int ), (int)431);
                if (!var10_1) ** GOTO lbl71
                throw null;
            }
            case 36: 
        }
        var9_2 /* !! */  = (int)nd.hlbm("hmgn", hlbr(int ), (int)432);
        ** while (!var10_1)
lbl209:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hplq() {
        nd.hlbs[1300] = -550846876;
        nd.hlbs[1301] = -1271092949;
        nd.hlbs[1302] = 1067659773;
        nd.hlbs[1303] = 1826081636;
        nd.hlbs[1304] = 765143072;
        nd.hlbs[1305] = 770473255;
        nd.hlbs[1306] = 378529837;
        nd.hlbs[1307] = 1513569876;
        nd.hlbs[1308] = 1771348760;
        nd.hlbs[1309] = -305969072;
        nd.hlbs[1310] = -1929721732;
        nd.hlbs[1311] = -542312877;
        nd.hlbs[1312] = -516120313;
        nd.hlbs[1313] = -1043524067;
        nd.hlbs[1314] = 307979003;
        nd.hlbs[1315] = -1700111600;
        nd.hlbs[1316] = 2098867768;
        nd.hlbs[1317] = 1826067168;
        nd.hlbs[1318] = 1355049539;
        nd.hlbs[1319] = -1789991044;
        nd.hlbs[1320] = 1383345763;
        nd.hlbs[1321] = -1351323286;
        nd.hlbs[1322] = 696421256;
        nd.hlbs[1323] = 290617682;
        nd.hlbs[1324] = 677054925;
        nd.hlbs[1325] = -1129946724;
        nd.hlbs[1326] = -51273027;
        nd.hlbs[1327] = -981498276;
        nd.hlbs[1328] = -1472404696;
        nd.hlbs[1329] = -444411188;
        nd.hlbs[1330] = -825541976;
        nd.hlbs[1331] = 1664233670;
        nd.hlbs[1332] = 2132714664;
        nd.hlbs[1333] = -1715729214;
        nd.hlbs[1334] = 584796733;
        nd.hlbs[1335] = 883771839;
        nd.hlbs[1336] = -704958262;
        nd.hlbs[1337] = -161620053;
        nd.hlbs[1338] = -746722648;
        nd.hlbs[1339] = -1864966037;
        nd.hlbs[1340] = -1073521735;
        nd.hlbs[1341] = 17794178;
        nd.hlbs[1342] = 19667890;
        nd.hlbs[1343] = 1568149641;
        nd.hlbs[1344] = -1099298652;
        nd.hlbs[1345] = -803901789;
        nd.hlbs[1346] = -264960477;
        nd.hlbs[1347] = -1010659899;
        nd.hlbs[1348] = 1774776041;
        nd.hlbs[1349] = 1639324113;
        nd.hlbs[1350] = -643534544;
        nd.hlbs[1351] = -903843476;
        nd.hlbs[1352] = -736106353;
        nd.hlbs[1353] = 1045499823;
        nd.hlbs[1354] = 925785989;
        nd.hlbs[1355] = -1619440661;
        nd.hlbs[1356] = 1287249692;
        nd.hlbs[1357] = -811092983;
        nd.hlbs[1358] = -1560082564;
        nd.hlbs[1359] = 1096911109;
        nd.hlbs[1360] = 419404763;
        nd.hlbs[1361] = 30117968;
        nd.hlbs[1362] = 854432205;
        nd.hlbs[1363] = 1717015799;
        nd.hlbs[1364] = 1668423656;
        nd.hlbs[1365] = -1356978769;
        nd.hlbs[1366] = 626232891;
        nd.hlbs[1367] = 2038718481;
        nd.hlbs[1368] = -1127525792;
        nd.hlbs[1369] = 889885325;
        nd.hlbs[1370] = -1647221880;
        nd.hlbs[1371] = 615198947;
        nd.hlbs[1372] = -480439720;
        nd.hlbs[1373] = -1964932596;
        nd.hlbs[1374] = 428674702;
        nd.hlbs[1375] = -1454451166;
        nd.hlbs[1376] = 883165864;
        nd.hlbs[1377] = 1136931156;
        nd.hlbs[1378] = -1339718534;
        nd.hlbs[1379] = -774852703;
        nd.hlbs[1380] = -427502128;
        nd.hlbs[1381] = 1281417;
        nd.hlbs[1382] = 1487542946;
        nd.hlbs[1383] = -525327174;
        nd.hlbs[1384] = 1845445932;
        nd.hlbs[1385] = 916762868;
        nd.hlbs[1386] = 1769714035;
        nd.hlbs[1387] = -849907446;
        nd.hlbs[1388] = -376642069;
        nd.hlbs[1389] = -1437845227;
        nd.hlbs[1390] = -1046163304;
        nd.hlbs[1391] = -1387466764;
        nd.hlbs[1392] = -350417994;
        nd.hlbs[1393] = -647608148;
        nd.hlbs[1394] = 1230322957;
        nd.hlbs[1395] = 476986860;
        nd.hlbs[1396] = 435292105;
        nd.hlbs[1397] = -1021760003;
        nd.hlbs[1398] = 1090563307;
        nd.hlbs[1399] = 827123271;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] full(int var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hodt", hlbj(int ), (int)521));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2141748944: {
                    v1 = nd.hlbm("hodu", hlbj(int ), (int)522);
                    continue block21;
                }
                case 190247284: {
                    v1 = nd.hlbm("hodv", hlbj(int ), (int)523);
                    continue block21;
                }
                case 1076290759: {
                    break block21;
                }
                case 1244616341: {
                    v1 = nd.hlbm("hodw", hlbj(int ), (int)524);
                    continue block21;
                }
            }
            break;
        }
        var11_9 = nd.c;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(nd.hlbm("hody", hlbj(int ), (int)526) - nd.hlbm("hodx", hlbj(int ), (int)525));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 944787053: {
                    continue block22;
                }
                case 1076290759: {
                    break block22;
                }
            }
            break;
        }
        var10_10 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl32
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hodz", hlbj(int ), (int)527));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1528498376: {
                    v4 = nd.hlbm("hoea", hlbj(int ), (int)528);
                    continue block23;
                }
                case -378663313: {
                    v4 = nd.hlbm("hoeb", hlbj(int ), (int)529);
                    continue block23;
                }
                case 1076290759: {
                    break block23;
                }
            }
            break;
        }
        var9_11 = nd.a;
        if (var10_10 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_10 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_9) {
                    throw null;
                    return null;
                }
                if (var9_11 || var9_11) ** continue;
                return new int[]{var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8};
            }
            case 0: {
                var10_10 /* !! */  = (int)nd.hlbm("hoec", hlbr(int ), (int)1106);
                if (var11_9) {
                    throw null;
                }
                ** GOTO lbl60
            }
            case 1: {
                var10_10 /* !! */  = (int)nd.hlbm("hoed", hlbr(int ), (int)1107);
                if (var11_9) {
                    throw null;
                }
            }
lbl60:
            // 4 sources

            case 2: {
                do {
                    var10_10 /* !! */  = (int)nd.hlbm("hoee", hlbr(int ), (int)1108);
                } while (!var11_9);
                throw null;
            }
            case 3: 
        }
        do {
            var10_10 /* !! */  = (int)nd.hlbm("hoef", hlbr(int ), (int)1109);
        } while (!var11_9);
        throw null;
    }

    private static /* synthetic */ void hpro() {
        nd.hlbl[100] = -6857706527050065507L;
        nd.hlbl[101] = 6295651165051872071L;
        nd.hlbl[102] = -8523448597259489784L;
        nd.hlbl[103] = 6007465423474949916L;
        nd.hlbl[104] = 6462888007683126441L;
        nd.hlbl[105] = 2678634560658021044L;
        nd.hlbl[106] = -8866014599180743157L;
        nd.hlbl[107] = -1150489214886949471L;
        nd.hlbl[108] = 6788435876137541983L;
        nd.hlbl[109] = -3948551757576708051L;
        nd.hlbl[110] = -4705419514982760831L;
        nd.hlbl[111] = -2578131062614732377L;
        nd.hlbl[112] = -3865247804459014598L;
        nd.hlbl[113] = 2956446962211444462L;
        nd.hlbl[114] = -5612337927669196806L;
        nd.hlbl[115] = 6640796850179875559L;
        nd.hlbl[116] = 1786426208298043506L;
        nd.hlbl[117] = -6045074115149203669L;
        nd.hlbl[118] = -1606989158752844819L;
        nd.hlbl[119] = -6820397963728088489L;
        nd.hlbl[120] = -8866557637208570468L;
        nd.hlbl[121] = -3633955993931221186L;
        nd.hlbl[122] = -465090849116810487L;
        nd.hlbl[123] = -2602605289138944813L;
        nd.hlbl[124] = -5806433973883990709L;
        nd.hlbl[125] = 5922356301445073167L;
        nd.hlbl[126] = 4624153295235203766L;
        nd.hlbl[127] = 2206927125994874204L;
        nd.hlbl[128] = -5355702600140021192L;
        nd.hlbl[129] = -8685920315110340953L;
        nd.hlbl[130] = -1542105285346146149L;
        nd.hlbl[131] = -3317662194186870588L;
        nd.hlbl[132] = -7895977864854719191L;
        nd.hlbl[133] = -6710838747074476538L;
        nd.hlbl[134] = 3582513643325500354L;
        nd.hlbl[135] = 4939032655927998688L;
        nd.hlbl[136] = 8013352545372998481L;
        nd.hlbl[137] = -4435620554803607126L;
        nd.hlbl[138] = 7682688752091812145L;
        nd.hlbl[139] = -1748075693696549569L;
        nd.hlbl[140] = 3206039874874570703L;
        nd.hlbl[141] = 7711936558280424504L;
        nd.hlbl[142] = 4045567571545687494L;
        nd.hlbl[143] = -3059997335584654614L;
        nd.hlbl[144] = -8771522397813615795L;
        nd.hlbl[145] = -8435772000016972865L;
        nd.hlbl[146] = 62734094807940974L;
        nd.hlbl[147] = 7418717342971534581L;
        nd.hlbl[148] = 5603361524434563225L;
        nd.hlbl[149] = -5395244802493578491L;
        nd.hlbl[150] = 4041519078981076784L;
        nd.hlbl[151] = 4947103655456564234L;
        nd.hlbl[152] = 4102896204867389625L;
        nd.hlbl[153] = -2930584968291580161L;
        nd.hlbl[154] = -1520298269032753169L;
        nd.hlbl[155] = 6040610727662470778L;
        nd.hlbl[156] = 8569193390635908021L;
        nd.hlbl[157] = 2552546438671641611L;
        nd.hlbl[158] = 8320995657670432313L;
        nd.hlbl[159] = -7772880656771442209L;
        nd.hlbl[160] = 7560478822777694126L;
        nd.hlbl[161] = -6946672332788070641L;
        nd.hlbl[162] = 4160062257387872397L;
        nd.hlbl[163] = 2310441719053816293L;
        nd.hlbl[164] = 7474919485571494581L;
        nd.hlbl[165] = -2677865836298815088L;
        nd.hlbl[166] = -2951226118762117627L;
        nd.hlbl[167] = 6890180351868215805L;
        nd.hlbl[168] = 6174640098201243449L;
        nd.hlbl[169] = 156566857746163288L;
        nd.hlbl[170] = 7235201728831862840L;
        nd.hlbl[171] = 2568738675563380743L;
        nd.hlbl[172] = -5542747975965119631L;
        nd.hlbl[173] = -547768160218048811L;
        nd.hlbl[174] = -3030885986398299670L;
        nd.hlbl[175] = -4941361666957539479L;
        nd.hlbl[176] = 6095174266427971308L;
        nd.hlbl[177] = 726721877266519612L;
        nd.hlbl[178] = 8096428869995922750L;
        nd.hlbl[179] = -3378639678719134317L;
        nd.hlbl[180] = 2426177888056232851L;
        nd.hlbl[181] = -2914353600496494459L;
        nd.hlbl[182] = 8434290890461430184L;
        nd.hlbl[183] = -6985088641394292592L;
        nd.hlbl[184] = -8095113550656752881L;
        nd.hlbl[185] = -4484026985815557705L;
        nd.hlbl[186] = 3255756994423903833L;
        nd.hlbl[187] = -5095150246732427254L;
        nd.hlbl[188] = -2531263381263788509L;
        nd.hlbl[189] = 2737043455624874596L;
        nd.hlbl[190] = 8553615487729483333L;
        nd.hlbl[191] = 8426100604862048820L;
        nd.hlbl[192] = -5991018095159720796L;
        nd.hlbl[193] = 1928597518642167891L;
        nd.hlbl[194] = -6797725724313011646L;
        nd.hlbl[195] = -8206383881077844887L;
        nd.hlbl[196] = 6932956830734698760L;
        nd.hlbl[197] = 8349477033544842957L;
        nd.hlbl[198] = -2392361793589304797L;
        nd.hlbl[199] = 3451251263161757196L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int toColor(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnig", hlbj(int ), (int)307)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hnih", hlbr(int ), (int)761)) break;
            v0 /* !! */  = (long)nd.hlbm("hnii", hlbr(int ), (int)762);
        }
        var4_1 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnij", hlbj(int ), (int)308)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nd.hlbm("hnik", hlbr(int ), (int)763)) break;
            v1 /* !! */  = (long)nd.hlbm("hnil", hlbr(int ), (int)764);
        }
        var3_2 = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnim", hlbj(int ), (int)309)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nd.hlbm("hnin", hlbr(int ), (int)765)) break;
            v2 /* !! */  = (long)nd.hlbm("hnio", hlbr(int ), (int)766);
        }
        var2_3 = nd.a;
        if (var4_1) {
            throw null;
lbl21:
            // 2 sources

            return (int)nd.hlbm("hnip", hlbr(int ), (int)767);
        }
        if (var2_3 || var2_3) ** GOTO lbl21
        v3 = nd.hlbm("hniq", hlbr(int ), (int)768);
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hnir", hlbj(int ), (int)310)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nd.hlbm("hnis", hlbr(int ), (int)769)) break;
            v4 /* !! */  = (long)nd.hlbm("hnit", hlbr(int ), (int)770);
        }
        v5 = var0.substring((int)v3);
        v6 = nd.hlbm("hniu", hlbr(int ), (int)771);
        v7 /* !! */  = nd.oo;
        if (true) ** GOTO lbl36
        block11: while (true) {
            v7 /* !! */  = (long)(v8 - nd.hlbm("hniv", hlbj(int ), (int)311));
lbl36:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 122382269: {
                    v8 = nd.hlbm("hniw", hlbj(int ), (int)312);
                    continue block11;
                }
                case 1076290759: {
                    break block11;
                }
                case 1777682804: {
                    v8 = nd.hlbm("hnix", hlbj(int ), (int)313);
                    continue block11;
                }
                case 2041431567: {
                    v8 = nd.hlbm("hniy", hlbj(int ), (int)314);
                    continue block11;
                }
            }
            break;
        }
        var1_4 = Integer.parseInt(v5, (int)v6);
        ** while (var2_3 || var2_3)
lbl50:
        // 1 sources

        v9 = nd.hlbm("hniz", hlbr(int ), (int)772);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hnja", hlbj(int ), (int)315)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == nd.hlbm("hnjb", hlbr(int ), (int)773)) break;
            v10 /* !! */  = (long)nd.hlbm("hnjc", hlbr(int ), (int)774);
        }
        return nd.setAlpha(var1_4, (int)v9);
    }

    private static /* synthetic */ void hplm() {
        nd.hlbs[900] = -1033883333;
        nd.hlbs[901] = 1616051324;
        nd.hlbs[902] = 1104113946;
        nd.hlbs[903] = -1800867937;
        nd.hlbs[904] = 450843458;
        nd.hlbs[905] = -1304218716;
        nd.hlbs[906] = -103814025;
        nd.hlbs[907] = -1178546257;
        nd.hlbs[908] = 1881245248;
        nd.hlbs[909] = -1514104741;
        nd.hlbs[910] = -192026669;
        nd.hlbs[911] = 2100471568;
        nd.hlbs[912] = 73422969;
        nd.hlbs[913] = 1220408961;
        nd.hlbs[914] = -1763578214;
        nd.hlbs[915] = -364301381;
        nd.hlbs[916] = -1076159035;
        nd.hlbs[917] = 2036408850;
        nd.hlbs[918] = 1932929246;
        nd.hlbs[919] = -1315087432;
        nd.hlbs[920] = -1612786136;
        nd.hlbs[921] = -62109467;
        nd.hlbs[922] = 1648223925;
        nd.hlbs[923] = 870972599;
        nd.hlbs[924] = 285613162;
        nd.hlbs[925] = 420656910;
        nd.hlbs[926] = -1106937841;
        nd.hlbs[927] = 1595098337;
        nd.hlbs[928] = 178287205;
        nd.hlbs[929] = -602405591;
        nd.hlbs[930] = 609846527;
        nd.hlbs[931] = -1868664594;
        nd.hlbs[932] = -205678721;
        nd.hlbs[933] = 570644145;
        nd.hlbs[934] = -1772675773;
        nd.hlbs[935] = -561511383;
        nd.hlbs[936] = -1612977450;
        nd.hlbs[937] = 1015295860;
        nd.hlbs[938] = -1049113513;
        nd.hlbs[939] = 900498624;
        nd.hlbs[940] = -1450469117;
        nd.hlbs[941] = 356280573;
        nd.hlbs[942] = 505013704;
        nd.hlbs[943] = -339570294;
        nd.hlbs[944] = -1517833848;
        nd.hlbs[945] = -84817445;
        nd.hlbs[946] = -744299580;
        nd.hlbs[947] = 1332677619;
        nd.hlbs[948] = 109792720;
        nd.hlbs[949] = -1211406497;
        nd.hlbs[950] = 415621804;
        nd.hlbs[951] = 1744490987;
        nd.hlbs[952] = 365043485;
        nd.hlbs[953] = -977496718;
        nd.hlbs[954] = 27961767;
        nd.hlbs[955] = -563768168;
        nd.hlbs[956] = 668989281;
        nd.hlbs[957] = -1620591329;
        nd.hlbs[958] = 1866762351;
        nd.hlbs[959] = -1193335819;
        nd.hlbs[960] = 661707793;
        nd.hlbs[961] = -641709969;
        nd.hlbs[962] = -155372502;
        nd.hlbs[963] = -1179893267;
        nd.hlbs[964] = -1042178535;
        nd.hlbs[965] = -487409217;
        nd.hlbs[966] = 1980650484;
        nd.hlbs[967] = 1629059973;
        nd.hlbs[968] = -1150445723;
        nd.hlbs[969] = -842068248;
        nd.hlbs[970] = 1004854833;
        nd.hlbs[971] = -52060050;
        nd.hlbs[972] = -1842728046;
        nd.hlbs[973] = -1169186190;
        nd.hlbs[974] = 1751451684;
        nd.hlbs[975] = -148274732;
        nd.hlbs[976] = -1955263214;
        nd.hlbs[977] = -962745706;
        nd.hlbs[978] = -1634009563;
        nd.hlbs[979] = -756752568;
        nd.hlbs[980] = 112076517;
        nd.hlbs[981] = -924581213;
        nd.hlbs[982] = -552130861;
        nd.hlbs[983] = -1509823165;
        nd.hlbs[984] = -991864398;
        nd.hlbs[985] = -1135447063;
        nd.hlbs[986] = 256875811;
        nd.hlbs[987] = 850026145;
        nd.hlbs[988] = -377386105;
        nd.hlbs[989] = 1361149001;
        nd.hlbs[990] = -186855328;
        nd.hlbs[991] = -1453658100;
        nd.hlbs[992] = 1539456619;
        nd.hlbs[993] = -1254824991;
        nd.hlbs[994] = -899594104;
        nd.hlbs[995] = -1736878429;
        nd.hlbs[996] = -1636233418;
        nd.hlbs[997] = 1013118241;
        nd.hlbs[998] = 464836098;
        nd.hlbs[999] = -1311706684;
    }

    private static /* synthetic */ void hpsf() {
        nd.hlbl[500] = -953765597169662479L;
        nd.hlbl[501] = 3258633626976762296L;
        nd.hlbl[502] = -7193836772693741978L;
        nd.hlbl[503] = -7744266453449264642L;
        nd.hlbl[504] = -8684000022099369475L;
        nd.hlbl[505] = 4093897707198625386L;
        nd.hlbl[506] = 3954883791040357365L;
        nd.hlbl[507] = -3761151871658043816L;
        nd.hlbl[508] = -2397363907733628727L;
        nd.hlbl[509] = -2567653000247220185L;
        nd.hlbl[510] = -6561764274867251033L;
        nd.hlbl[511] = 4203041285280536269L;
        nd.hlbl[512] = -9050413081809035517L;
        nd.hlbl[513] = 7134680067777310730L;
        nd.hlbl[514] = 5729387756275529452L;
        nd.hlbl[515] = -5786479447057209315L;
        nd.hlbl[516] = -5535395957954807250L;
        nd.hlbl[517] = -2511233626744606082L;
        nd.hlbl[518] = -4743469263957844566L;
        nd.hlbl[519] = 5004239686591716320L;
        nd.hlbl[520] = -5856890359871851180L;
        nd.hlbl[521] = 1435158898296443911L;
        nd.hlbl[522] = 8047564497795302121L;
        nd.hlbl[523] = -6993849699544475063L;
        nd.hlbl[524] = 4841195454765548797L;
        nd.hlbl[525] = -5171788587498702765L;
        nd.hlbl[526] = -2839794701742343339L;
        nd.hlbl[527] = 1614593001317827644L;
        nd.hlbl[528] = 7038798857987917495L;
        nd.hlbl[529] = 4308868390573257188L;
        nd.hlbl[530] = -2493043633567521224L;
        nd.hlbl[531] = -8845340467606188467L;
        nd.hlbl[532] = -7919142608939871468L;
        nd.hlbl[533] = -5618254044516221007L;
        nd.hlbl[534] = -1242817418717344156L;
        nd.hlbl[535] = -3672698686792888761L;
        nd.hlbl[536] = -4869112896521893672L;
        nd.hlbl[537] = 6142735494484672313L;
        nd.hlbl[538] = -6046530756213286546L;
        nd.hlbl[539] = -8445881813679309225L;
        nd.hlbl[540] = -5604934052898310075L;
        nd.hlbl[541] = -7426064494930221053L;
        nd.hlbl[542] = -5106980107028636775L;
        nd.hlbl[543] = 4365231048080330236L;
        nd.hlbl[544] = -3283339158030781963L;
        nd.hlbl[545] = 6614721388774680517L;
        nd.hlbl[546] = 9194628297783622810L;
        nd.hlbl[547] = 8261227447689804129L;
        nd.hlbl[548] = -5619097518107495215L;
        nd.hlbl[549] = -8509091187179978203L;
        nd.hlbl[550] = 1965946052401412642L;
        nd.hlbl[551] = -1670939591383720676L;
        nd.hlbl[552] = -187686206828639864L;
        nd.hlbl[553] = -2347330994942884978L;
        nd.hlbl[554] = 8581399404887130117L;
        nd.hlbl[555] = -148996008051019911L;
        nd.hlbl[556] = -2433899056915711433L;
        nd.hlbl[557] = 6297822107501775981L;
        nd.hlbl[558] = -3754267513383024163L;
        nd.hlbl[559] = 3637732808039261621L;
        nd.hlbl[560] = -8032522223661716507L;
        nd.hlbl[561] = -6391187584392918218L;
        nd.hlbl[562] = 4148932590992008888L;
        nd.hlbl[563] = -6732045326974139731L;
        nd.hlbl[564] = -1315694920691337105L;
        nd.hlbl[565] = -6107321843039602367L;
        nd.hlbl[566] = 7674897169856231358L;
        nd.hlbl[567] = -1437390959893474503L;
        nd.hlbl[568] = 318134464294039382L;
        nd.hlbl[569] = -7436724718100768635L;
        nd.hlbl[570] = 4513296228872971633L;
        nd.hlbl[571] = -528950616294555347L;
        nd.hlbl[572] = 5548255308141871355L;
        nd.hlbl[573] = 4603879818874911725L;
        nd.hlbl[574] = 3751993970253710036L;
        nd.hlbl[575] = 5838746827240606957L;
        nd.hlbl[576] = -2076970749590098935L;
        nd.hlbl[577] = 3942770095380690382L;
        nd.hlbl[578] = 405024159452734004L;
        nd.hlbl[579] = -7306733140596536612L;
        nd.hlbl[580] = -1592500608513660833L;
        nd.hlbl[581] = 797410219657236811L;
        nd.hlbl[582] = -890722358903074961L;
        nd.hlbl[583] = 968960123213859756L;
        nd.hlbl[584] = -7461925281271619681L;
        nd.hlbl[585] = -4230743682759315193L;
        nd.hlbl[586] = 5409805638782952298L;
        nd.hlbl[587] = -6292699817975407436L;
        nd.hlbl[588] = -7111870680333032253L;
        nd.hlbl[589] = 7237224046567318711L;
        nd.hlbl[590] = 5225626690490176122L;
        nd.hlbl[591] = 2741282719788295068L;
        nd.hlbl[592] = 4059870125490143243L;
        nd.hlbl[593] = -3719642203889576969L;
        nd.hlbl[594] = -6307958529571755789L;
        nd.hlbl[595] = -3341155423387280650L;
        nd.hlbl[596] = -8192387635136203293L;
        nd.hlbl[597] = -3725985333867024887L;
        nd.hlbl[598] = -2331257885671518826L;
        nd.hlbl[599] = 6195463877259427765L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getClientColorAt(float var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hmho", hlbj(int ), (int)186)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hmhp", hlbr(int ), (int)444)) break;
            v0 /* !! */  = (long)nd.hlbm("hmhq", hlbr(int ), (int)445);
        }
        var3_1 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(nd.hlbm("hmhs", hlbj(int ), (int)188) - nd.hlbm("hmhr", hlbj(int ), (int)187));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1836247509: {
                    continue block16;
                }
                case 1076290759: {
                    break block16;
                }
            }
            break;
        }
        var2_2 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hmht", hlbj(int ), (int)189)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hmhu", hlbr(int ), (int)446)) break;
            v2 /* !! */  = (long)nd.hlbm("hmhv", hlbr(int ), (int)447);
        }
        var1_3 = nd.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return (int)nd.hlbm("hmhw", hlbr(int ), (int)448);
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 = nd.hlbm("hmhx", hlbr(int ), (int)449);
                v4 /* !! */  = nd.oo;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v4 /* !! */  = (long)(v5 - nd.hlbm("hmhy", hlbj(int ), (int)190));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -175505559: {
                            v5 = nd.hlbm("hmhz", hlbj(int ), (int)191);
                            continue block19;
                        }
                        case 751848161: {
                            v5 = nd.hlbm("hmia", hlbj(int ), (int)192);
                            continue block19;
                        }
                        case 1076290759: {
                            break block19;
                        }
                    }
                    break;
                }
                return nd.getClientColorAt(var0, (int)v3);
            }
lbl48:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)nd.hlbm("hmib", hlbr(int ), (int)450);
                } while (!var3_1);
                throw null;
            }
lbl53:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nd.hlbm("hmic", hlbr(int ), (int)451);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nd.hlbm("hmid", hlbr(int ), (int)452);
                if (!var3_1) ** GOTO lbl53
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)nd.hlbm("hmie", hlbr(int ), (int)453);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void hpph() {
        nd.hlbt[1400] = 751323048;
        nd.hlbt[1401] = 1298986125;
        nd.hlbt[1402] = -1570271039;
        nd.hlbt[1403] = 1377463861;
        nd.hlbt[1404] = 434735702;
        nd.hlbt[1405] = -1204655297;
        nd.hlbt[1406] = 1338781182;
        nd.hlbt[1407] = 2097934589;
        nd.hlbt[1408] = -899979085;
        nd.hlbt[1409] = -279422470;
        nd.hlbt[1410] = 319124452;
        nd.hlbt[1411] = 452699363;
        nd.hlbt[1412] = 1887032490;
        nd.hlbt[1413] = 1408627352;
        nd.hlbt[1414] = 1396983156;
        nd.hlbt[1415] = -1366231535;
        nd.hlbt[1416] = -29140038;
        nd.hlbt[1417] = 306035965;
        nd.hlbt[1418] = -1267258781;
        nd.hlbt[1419] = -73525703;
        nd.hlbt[1420] = 1436959500;
        nd.hlbt[1421] = 872186783;
        nd.hlbt[1422] = -2122081453;
        nd.hlbt[1423] = 334243510;
        nd.hlbt[1424] = 981127367;
        nd.hlbt[1425] = -142867384;
        nd.hlbt[1426] = 1112235330;
        nd.hlbt[1427] = -291675919;
        nd.hlbt[1428] = -339192157;
        nd.hlbt[1429] = 836331802;
        nd.hlbt[1430] = 1390911559;
        nd.hlbt[1431] = 1340006662;
        nd.hlbt[1432] = -1917333060;
        nd.hlbt[1433] = -1772368429;
        nd.hlbt[1434] = -773139078;
        nd.hlbt[1435] = 907671206;
        nd.hlbt[1436] = 1081095080;
        nd.hlbt[1437] = 307713362;
        nd.hlbt[1438] = 320172084;
        nd.hlbt[1439] = 1248796734;
        nd.hlbt[1440] = 1061529803;
        nd.hlbt[1441] = 988648282;
        nd.hlbt[1442] = -1309079944;
        nd.hlbt[1443] = -498920359;
        nd.hlbt[1444] = -1603899415;
        nd.hlbt[1445] = 1204047509;
        nd.hlbt[1446] = -674724688;
        nd.hlbt[1447] = -1991738046;
        nd.hlbt[1448] = 214243068;
        nd.hlbt[1449] = -1076371750;
        nd.hlbt[1450] = -1337235301;
        nd.hlbt[1451] = 1157057260;
        nd.hlbt[1452] = -475451065;
        nd.hlbt[1453] = -736187470;
        nd.hlbt[1454] = -19581051;
        nd.hlbt[1455] = 1712111382;
        nd.hlbt[1456] = -498279766;
        nd.hlbt[1457] = 721915672;
        nd.hlbt[1458] = 1417782201;
        nd.hlbt[1459] = -927098966;
        nd.hlbt[1460] = 1467915320;
        nd.hlbt[1461] = 1614094464;
        nd.hlbt[1462] = 1476990260;
        nd.hlbt[1463] = 2062941030;
        nd.hlbt[1464] = -1163622906;
        nd.hlbt[1465] = -1049351142;
        nd.hlbt[1466] = -1802991205;
        nd.hlbt[1467] = 1738083517;
        nd.hlbt[1468] = 1255341933;
        nd.hlbt[1469] = -2006169857;
        nd.hlbt[1470] = 663871612;
        nd.hlbt[1471] = 1283000759;
        nd.hlbt[1472] = -1696784487;
        nd.hlbt[1473] = 141620819;
        nd.hlbt[1474] = 2119970677;
        nd.hlbt[1475] = -505749616;
        nd.hlbt[1476] = 2019180054;
        nd.hlbt[1477] = 1342445588;
        nd.hlbt[1478] = 1866173811;
        nd.hlbt[1479] = -567167689;
        nd.hlbt[1480] = 336088615;
        nd.hlbt[1481] = 759981385;
        nd.hlbt[1482] = -654676253;
        nd.hlbt[1483] = -1947067878;
        nd.hlbt[1484] = 1017777122;
        nd.hlbt[1485] = 1823508383;
        nd.hlbt[1486] = -984471333;
        nd.hlbt[1487] = -1039922071;
        nd.hlbt[1488] = 67183365;
        nd.hlbt[1489] = -474998847;
        nd.hlbt[1490] = -1271164131;
        nd.hlbt[1491] = -306800086;
        nd.hlbt[1492] = -1163187627;
        nd.hlbt[1493] = 1474325087;
        nd.hlbt[1494] = -741087523;
        nd.hlbt[1495] = -2109710336;
        nd.hlbt[1496] = -1242897662;
        nd.hlbt[1497] = 1783937823;
        nd.hlbt[1498] = 1026745044;
        nd.hlbt[1499] = 1691731525;
    }

    private static /* synthetic */ void hpqy() {
        nd.hlbk[400] = 8650193257801109968L;
        nd.hlbk[401] = -8972303640593057012L;
        nd.hlbk[402] = -6945436103975729924L;
        nd.hlbk[403] = 3196298954334154027L;
        nd.hlbk[404] = 4802053441051656147L;
        nd.hlbk[405] = 4869258355297598877L;
        nd.hlbk[406] = 3858249080229882063L;
        nd.hlbk[407] = -1936373783906003884L;
        nd.hlbk[408] = -611680060068642981L;
        nd.hlbk[409] = -2378632337435272560L;
        nd.hlbk[410] = -4927580960026392304L;
        nd.hlbk[411] = -5449202962626944844L;
        nd.hlbk[412] = 994354962159140007L;
        nd.hlbk[413] = -3867738224616036841L;
        nd.hlbk[414] = -6898667387148892670L;
        nd.hlbk[415] = 6602701717445670206L;
        nd.hlbk[416] = -756301583286940454L;
        nd.hlbk[417] = -763302963721113943L;
        nd.hlbk[418] = 720983156656410401L;
        nd.hlbk[419] = 3604777667919484932L;
        nd.hlbk[420] = -6503965620562609012L;
        nd.hlbk[421] = 3395822280739757279L;
        nd.hlbk[422] = 8360338546427190213L;
        nd.hlbk[423] = 1075922083046322143L;
        nd.hlbk[424] = 3664732323981680022L;
        nd.hlbk[425] = -2544338394983038640L;
        nd.hlbk[426] = 5051368227606656538L;
        nd.hlbk[427] = -6602392101077962136L;
        nd.hlbk[428] = -7573636126508417104L;
        nd.hlbk[429] = -47595910930932571L;
        nd.hlbk[430] = 3671001711102028056L;
        nd.hlbk[431] = 5357816471589576646L;
        nd.hlbk[432] = 3592989850054551606L;
        nd.hlbk[433] = 3781470683089290466L;
        nd.hlbk[434] = -2443404566773818862L;
        nd.hlbk[435] = 7659594075462207090L;
        nd.hlbk[436] = 2958648050772135630L;
        nd.hlbk[437] = 597562402888864253L;
        nd.hlbk[438] = -1138600184736024632L;
        nd.hlbk[439] = -7503688686410177119L;
        nd.hlbk[440] = -6617728501757517867L;
        nd.hlbk[441] = 7053576179626152744L;
        nd.hlbk[442] = -6728411635125320149L;
        nd.hlbk[443] = -9133473118450778696L;
        nd.hlbk[444] = -8546631697998388156L;
        nd.hlbk[445] = 8808781223450891092L;
        nd.hlbk[446] = 2250010024680208655L;
        nd.hlbk[447] = -7619304821211294594L;
        nd.hlbk[448] = 1622324900832084585L;
        nd.hlbk[449] = -589945755528047563L;
        nd.hlbk[450] = -6588603856704784729L;
        nd.hlbk[451] = -8575402312461962925L;
        nd.hlbk[452] = -8476897787291258929L;
        nd.hlbk[453] = 6436725394215071352L;
        nd.hlbk[454] = -3623450703050085530L;
        nd.hlbk[455] = -3343000073844516952L;
        nd.hlbk[456] = 2590782521021122610L;
        nd.hlbk[457] = 7981290558589434512L;
        nd.hlbk[458] = 1100448564740016013L;
        nd.hlbk[459] = -7498409472789876107L;
        nd.hlbk[460] = -4454123123071519521L;
        nd.hlbk[461] = -8976712284662549371L;
        nd.hlbk[462] = -2679528993740314091L;
        nd.hlbk[463] = 2019231711263506968L;
        nd.hlbk[464] = -294509043703872416L;
        nd.hlbk[465] = -3696436847191970546L;
        nd.hlbk[466] = -1088507455873588430L;
        nd.hlbk[467] = 3534014554344849692L;
        nd.hlbk[468] = -8323037365820668677L;
        nd.hlbk[469] = -1413643781728897074L;
        nd.hlbk[470] = -6907586974404941257L;
        nd.hlbk[471] = -4484242956476671236L;
        nd.hlbk[472] = 5702641448887504553L;
        nd.hlbk[473] = -7093628046586751111L;
        nd.hlbk[474] = 5153608643972076424L;
        nd.hlbk[475] = 7345030764346963624L;
        nd.hlbk[476] = 1321210413902516611L;
        nd.hlbk[477] = -803605384560932422L;
        nd.hlbk[478] = -7524952930804738614L;
        nd.hlbk[479] = 1118075441639875487L;
        nd.hlbk[480] = 8985698462598062966L;
        nd.hlbk[481] = 4041931771140349376L;
        nd.hlbk[482] = -90311066006226317L;
        nd.hlbk[483] = 4805232927568562357L;
        nd.hlbk[484] = 74628277663726704L;
        nd.hlbk[485] = -5020108253220045399L;
        nd.hlbk[486] = 3010599064324843349L;
        nd.hlbk[487] = -1653419924962912011L;
        nd.hlbk[488] = 226369631555126797L;
        nd.hlbk[489] = -6645663352446826396L;
        nd.hlbk[490] = -288188023119280684L;
        nd.hlbk[491] = 8822496615931440597L;
        nd.hlbk[492] = -8171164499781710117L;
        nd.hlbk[493] = -4968902610821936440L;
        nd.hlbk[494] = 3767703622150089287L;
        nd.hlbk[495] = -7962369053308234816L;
        nd.hlbk[496] = 4967435033847793686L;
        nd.hlbk[497] = 5902689199890449114L;
        nd.hlbk[498] = -6723770005621193500L;
        nd.hlbk[499] = -4380486220218621255L;
    }

    private static /* synthetic */ void hpmc() {
        nd.hlbt[100] = 1111607901;
        nd.hlbt[101] = -639553398;
        nd.hlbt[102] = 1626713492;
        nd.hlbt[103] = 1839093527;
        nd.hlbt[104] = 659275629;
        nd.hlbt[105] = -248544736;
        nd.hlbt[106] = 1919708097;
        nd.hlbt[107] = -1833633486;
        nd.hlbt[108] = 469682057;
        nd.hlbt[109] = 1996861604;
        nd.hlbt[110] = 602413779;
        nd.hlbt[111] = 1712271187;
        nd.hlbt[112] = -514438939;
        nd.hlbt[113] = -1152160601;
        nd.hlbt[114] = 1342062920;
        nd.hlbt[115] = -376967669;
        nd.hlbt[116] = 492996261;
        nd.hlbt[117] = 411927261;
        nd.hlbt[118] = 1830027694;
        nd.hlbt[119] = 1550732905;
        nd.hlbt[120] = 811688656;
        nd.hlbt[121] = 1374977520;
        nd.hlbt[122] = -1645449164;
        nd.hlbt[123] = 230934544;
        nd.hlbt[124] = 1391238723;
        nd.hlbt[125] = 1833556043;
        nd.hlbt[126] = 647626241;
        nd.hlbt[127] = 210172101;
        nd.hlbt[128] = -435940512;
        nd.hlbt[129] = -1918219838;
        nd.hlbt[130] = -207995894;
        nd.hlbt[131] = 831784506;
        nd.hlbt[132] = -2088788726;
        nd.hlbt[133] = 956792610;
        nd.hlbt[134] = -1181118426;
        nd.hlbt[135] = -1591906233;
        nd.hlbt[136] = -789847073;
        nd.hlbt[137] = 120931172;
        nd.hlbt[138] = 536539925;
        nd.hlbt[139] = -1046178330;
        nd.hlbt[140] = -2082474841;
        nd.hlbt[141] = -596987905;
        nd.hlbt[142] = 545640589;
        nd.hlbt[143] = 894377975;
        nd.hlbt[144] = -1768188101;
        nd.hlbt[145] = 1404857043;
        nd.hlbt[146] = -146982580;
        nd.hlbt[147] = -849191352;
        nd.hlbt[148] = -760241552;
        nd.hlbt[149] = 1665613611;
        nd.hlbt[150] = 153055321;
        nd.hlbt[151] = -80509644;
        nd.hlbt[152] = -1313766474;
        nd.hlbt[153] = -659096565;
        nd.hlbt[154] = 616643521;
        nd.hlbt[155] = 1602066377;
        nd.hlbt[156] = 1516162741;
        nd.hlbt[157] = -117919604;
        nd.hlbt[158] = -1897538560;
        nd.hlbt[159] = -1967289692;
        nd.hlbt[160] = 1926843784;
        nd.hlbt[161] = 979913943;
        nd.hlbt[162] = -859264397;
        nd.hlbt[163] = -581208084;
        nd.hlbt[164] = 1246768992;
        nd.hlbt[165] = -1058212685;
        nd.hlbt[166] = 2122985288;
        nd.hlbt[167] = -1156585621;
        nd.hlbt[168] = 1458883922;
        nd.hlbt[169] = -355454939;
        nd.hlbt[170] = -774743359;
        nd.hlbt[171] = 718521357;
        nd.hlbt[172] = -654045693;
        nd.hlbt[173] = 1745086182;
        nd.hlbt[174] = 513422797;
        nd.hlbt[175] = 1250099471;
        nd.hlbt[176] = 729903829;
        nd.hlbt[177] = -1943336436;
        nd.hlbt[178] = -1194103476;
        nd.hlbt[179] = -1309899169;
        nd.hlbt[180] = -348897980;
        nd.hlbt[181] = -294949133;
        nd.hlbt[182] = -566090495;
        nd.hlbt[183] = -1635784608;
        nd.hlbt[184] = 463218557;
        nd.hlbt[185] = -1784259895;
        nd.hlbt[186] = 1866662577;
        nd.hlbt[187] = 935579442;
        nd.hlbt[188] = -657296299;
        nd.hlbt[189] = 915506546;
        nd.hlbt[190] = 976896317;
        nd.hlbt[191] = 1731530294;
        nd.hlbt[192] = -698905988;
        nd.hlbt[193] = 379774636;
        nd.hlbt[194] = -914857742;
        nd.hlbt[195] = 1585524689;
        nd.hlbt[196] = -264073486;
        nd.hlbt[197] = -1660309132;
        nd.hlbt[198] = 1195968799;
        nd.hlbt[199] = 1559722351;
    }

    private static /* synthetic */ void hpnq() {
        nd.hlbt[700] = 434848807;
        nd.hlbt[701] = -2085758709;
        nd.hlbt[702] = 968299874;
        nd.hlbt[703] = -279935069;
        nd.hlbt[704] = 118335981;
        nd.hlbt[705] = -867648105;
        nd.hlbt[706] = -1084757729;
        nd.hlbt[707] = 793816540;
        nd.hlbt[708] = 319121403;
        nd.hlbt[709] = -1486073564;
        nd.hlbt[710] = -644414226;
        nd.hlbt[711] = -603945295;
        nd.hlbt[712] = -272995816;
        nd.hlbt[713] = 466868679;
        nd.hlbt[714] = -181055967;
        nd.hlbt[715] = -860743886;
        nd.hlbt[716] = -550885773;
        nd.hlbt[717] = 1978369653;
        nd.hlbt[718] = 140730552;
        nd.hlbt[719] = 1393913735;
        nd.hlbt[720] = -558297123;
        nd.hlbt[721] = -2079195156;
        nd.hlbt[722] = 1148828090;
        nd.hlbt[723] = -1381778812;
        nd.hlbt[724] = -427159525;
        nd.hlbt[725] = -1398275290;
        nd.hlbt[726] = 2085424385;
        nd.hlbt[727] = 1289464929;
        nd.hlbt[728] = -968236352;
        nd.hlbt[729] = 90792594;
        nd.hlbt[730] = -1457970862;
        nd.hlbt[731] = -600852596;
        nd.hlbt[732] = 943666181;
        nd.hlbt[733] = 1630863966;
        nd.hlbt[734] = -552951720;
        nd.hlbt[735] = -1465058417;
        nd.hlbt[736] = 1543089452;
        nd.hlbt[737] = -963194163;
        nd.hlbt[738] = -827503975;
        nd.hlbt[739] = 1734589547;
        nd.hlbt[740] = -934902113;
        nd.hlbt[741] = -264941420;
        nd.hlbt[742] = 58925816;
        nd.hlbt[743] = -2000112218;
        nd.hlbt[744] = -1325589825;
        nd.hlbt[745] = -917019750;
        nd.hlbt[746] = 836039664;
        nd.hlbt[747] = 1520223221;
        nd.hlbt[748] = 1068055768;
        nd.hlbt[749] = 951051661;
        nd.hlbt[750] = -1052343527;
        nd.hlbt[751] = 859695900;
        nd.hlbt[752] = -1951340648;
        nd.hlbt[753] = 1779544541;
        nd.hlbt[754] = 1955481721;
        nd.hlbt[755] = 938854617;
        nd.hlbt[756] = 715187348;
        nd.hlbt[757] = -2138526893;
        nd.hlbt[758] = 1287789485;
        nd.hlbt[759] = -779566846;
        nd.hlbt[760] = 1370724203;
        nd.hlbt[761] = 1889801980;
        nd.hlbt[762] = 1405399414;
        nd.hlbt[763] = -1433717409;
        nd.hlbt[764] = -207351135;
        nd.hlbt[765] = -217161342;
        nd.hlbt[766] = -480348108;
        nd.hlbt[767] = 1528225121;
        nd.hlbt[768] = -248207781;
        nd.hlbt[769] = -1174216951;
        nd.hlbt[770] = 1850654287;
        nd.hlbt[771] = -1107014390;
        nd.hlbt[772] = 977718295;
        nd.hlbt[773] = -1857587283;
        nd.hlbt[774] = 1017664547;
        nd.hlbt[775] = 260337385;
        nd.hlbt[776] = -912422937;
        nd.hlbt[777] = -678569310;
        nd.hlbt[778] = -1391663707;
        nd.hlbt[779] = -2069363551;
        nd.hlbt[780] = -930046819;
        nd.hlbt[781] = -2032808211;
        nd.hlbt[782] = 2140140125;
        nd.hlbt[783] = -1272358674;
        nd.hlbt[784] = -896571908;
        nd.hlbt[785] = -64165942;
        nd.hlbt[786] = 1016597521;
        nd.hlbt[787] = 1483453256;
        nd.hlbt[788] = -1114684806;
        nd.hlbt[789] = -1265957588;
        nd.hlbt[790] = -1332388888;
        nd.hlbt[791] = -768906486;
        nd.hlbt[792] = 1815206916;
        nd.hlbt[793] = -1527942107;
        nd.hlbt[794] = -967972045;
        nd.hlbt[795] = -494944698;
        nd.hlbt[796] = 1782474289;
        nd.hlbt[797] = 889189588;
        nd.hlbt[798] = -1105235216;
        nd.hlbt[799] = 227311202;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setClientColor(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hmlr", hlbj(int ), (int)230)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hmls", hlbr(int ), (int)507)) break;
            v0 /* !! */  = (long)nd.hlbm("hmlt", hlbr(int ), (int)508);
        }
        var3_1 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl11
        block22: while (true) {
            v1 /* !! */  = (long)(nd.hlbm("hmlv", hlbj(int ), (int)232) - nd.hlbm("hmlu", hlbj(int ), (int)231));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1076290759: {
                    break block22;
                }
                case 1964410887: {
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl21
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - nd.hlbm("hmlw", hlbj(int ), (int)233));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1722795971: {
                    v3 = nd.hlbm("hmlx", hlbj(int ), (int)234);
                    continue block23;
                }
                case 1076290759: {
                    break block23;
                }
                case 1935167303: {
                    v3 = nd.hlbm("hmly", hlbj(int ), (int)235);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = nd.a;
        if (var3_1) {
            throw null;
lbl33:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        v4 = var0 >> nd.hlbm("hmlz", hlbr(int ), (int)509) & nd.hlbm("hmma", hlbr(int ), (int)510);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hmmb", hlbj(int ), (int)236)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nd.hlbm("hmmc", hlbr(int ), (int)511)) break;
            v5 /* !! */  = (long)nd.hlbm("hmmd", hlbr(int ), (int)512);
        }
        nd.clientColorR = v4;
        if (var1_3 || var1_3) ** GOTO lbl33
        v6 = var0 >> nd.hlbm("hmme", hlbr(int ), (int)513) & nd.hlbm("hmmf", hlbr(int ), (int)514);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hmmg", hlbj(int ), (int)237)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == nd.hlbm("hmmh", hlbr(int ), (int)515)) break;
            v7 /* !! */  = (long)nd.hlbm("hmmi", hlbr(int ), (int)516);
        }
        nd.clientColorG = v6;
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl33
                v8 = var0 & nd.hlbm("hmmj", hlbr(int ), (int)517);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hmmk", hlbj(int ), (int)238)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nd.hlbm("hmml", hlbr(int ), (int)518)) break;
                    v9 /* !! */  = (long)nd.hlbm("hmmm", hlbr(int ), (int)519);
                }
                nd.clientColorB = v8;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl66:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nd.hlbm("hmmn", hlbr(int ), (int)520);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl95
                    break;
                }
            }
lbl72:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)nd.hlbm("hmmo", hlbr(int ), (int)521);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 2: {
                var2_2 /* !! */  = (int)nd.hlbm("hmmp", hlbr(int ), (int)522);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 3: {
                var2_2 /* !! */  = (int)nd.hlbm("hmmq", hlbr(int ), (int)523);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
lbl86:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nd.hlbm("hmmr", hlbr(int ), (int)524);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
lbl91:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nd.hlbm("hmms", hlbr(int ), (int)525);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
lbl95:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nd.hlbm("hmmt", hlbr(int ), (int)526);
                if (!var3_1) ** GOTO lbl66
                throw null;
            }
lbl99:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)nd.hlbm("hmmu", hlbr(int ), (int)527);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
lbl103:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)nd.hlbm("hmmv", hlbr(int ), (int)528);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)nd.hlbm("hmmw", hlbr(int ), (int)529);
        ** while (!var3_1)
lbl110:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hplr() {
        nd.hlbs[1400] = 751323014;
        nd.hlbs[1401] = 1298986213;
        nd.hlbs[1402] = -1570271010;
        nd.hlbs[1403] = 1377463829;
        nd.hlbs[1404] = 434735629;
        nd.hlbs[1405] = -1204655277;
        nd.hlbs[1406] = 1338781102;
        nd.hlbs[1407] = 2097934513;
        nd.hlbs[1408] = -899979095;
        nd.hlbs[1409] = -279422574;
        nd.hlbs[1410] = 319124440;
        nd.hlbs[1411] = 452699321;
        nd.hlbs[1412] = 1887032491;
        nd.hlbs[1413] = 1408627441;
        nd.hlbs[1414] = 1396983163;
        nd.hlbs[1415] = -1366231508;
        nd.hlbs[1416] = -29140068;
        nd.hlbs[1417] = 306035857;
        nd.hlbs[1418] = -1267258831;
        nd.hlbs[1419] = -73525634;
        nd.hlbs[1420] = 1436959598;
        nd.hlbs[1421] = 872186764;
        nd.hlbs[1422] = -2122081473;
        nd.hlbs[1423] = 334243478;
        nd.hlbs[1424] = 981127311;
        nd.hlbs[1425] = -142867378;
        nd.hlbs[1426] = 1112235391;
        nd.hlbs[1427] = -291675930;
        nd.hlbs[1428] = -339192147;
        nd.hlbs[1429] = 836331829;
        nd.hlbs[1430] = 1390911566;
        nd.hlbs[1431] = 1340006775;
        nd.hlbs[1432] = -1917333078;
        nd.hlbs[1433] = -1772368431;
        nd.hlbs[1434] = -773139189;
        nd.hlbs[1435] = 907671195;
        nd.hlbs[1436] = 1081095159;
        nd.hlbs[1437] = 307713399;
        nd.hlbs[1438] = 320172089;
        nd.hlbs[1439] = 1248796779;
        nd.hlbs[1440] = 1061529836;
        nd.hlbs[1441] = 988648267;
        nd.hlbs[1442] = -1309079965;
        nd.hlbs[1443] = -498920328;
        nd.hlbs[1444] = -1603899412;
        nd.hlbs[1445] = 1204047569;
        nd.hlbs[1446] = -674724708;
        nd.hlbs[1447] = -1991737986;
        nd.hlbs[1448] = 214242978;
        nd.hlbs[1449] = -1076371837;
        nd.hlbs[1450] = -1337235260;
        nd.hlbs[1451] = 1157057236;
        nd.hlbs[1452] = -475451017;
        nd.hlbs[1453] = -736187419;
        nd.hlbs[1454] = -19581031;
        nd.hlbs[1455] = 1712111476;
        nd.hlbs[1456] = -498279784;
        nd.hlbs[1457] = 721915712;
        nd.hlbs[1458] = 1417782225;
        nd.hlbs[1459] = -927098937;
        nd.hlbs[1460] = 1467915273;
        nd.hlbs[1461] = 1614094555;
        nd.hlbs[1462] = 1476990210;
        nd.hlbs[1463] = 2062941006;
        nd.hlbs[1464] = -1163622852;
        nd.hlbs[1465] = -1049351042;
        nd.hlbs[1466] = -1802991162;
        nd.hlbs[1467] = 1738083498;
        nd.hlbs[1468] = 1255341932;
        nd.hlbs[1469] = 104666068;
        nd.hlbs[1470] = -663871613;
        nd.hlbs[1471] = 192488871;
        nd.hlbs[1472] = 1696784486;
        nd.hlbs[1473] = 829086309;
        nd.hlbs[1474] = -2119970678;
        nd.hlbs[1475] = -278430453;
        nd.hlbs[1476] = -2019180055;
        nd.hlbs[1477] = -2001482844;
        nd.hlbs[1478] = -1866173812;
        nd.hlbs[1479] = -1961207033;
        nd.hlbs[1480] = 336088609;
        nd.hlbs[1481] = 759981385;
        nd.hlbs[1482] = -654676245;
        nd.hlbs[1483] = -1947067887;
        nd.hlbs[1484] = 1017777126;
        nd.hlbs[1485] = 1823508380;
        nd.hlbs[1486] = -984471331;
        nd.hlbs[1487] = -1039922078;
        nd.hlbs[1488] = 67183366;
        nd.hlbs[1489] = -474998844;
        nd.hlbs[1490] = -1271164135;
        nd.hlbs[1491] = -306800081;
        nd.hlbs[1492] = -1163187618;
        nd.hlbs[1493] = 1474325086;
        nd.hlbs[1494] = -307729558;
        nd.hlbs[1495] = -2109710335;
        nd.hlbs[1496] = -829267427;
        nd.hlbs[1497] = -1783937824;
        nd.hlbs[1498] = 785762505;
        nd.hlbs[1499] = 358598144;
    }

    private static /* synthetic */ void hpqs() {
        nd.hlbk[300] = 9163465138144113547L;
        nd.hlbk[301] = 3577080044340989905L;
        nd.hlbk[302] = 9197485306546209186L;
        nd.hlbk[303] = 7544292777029590237L;
        nd.hlbk[304] = -3998313612754841231L;
        nd.hlbk[305] = -1341161672614773165L;
        nd.hlbk[306] = -7102384533150251577L;
        nd.hlbk[307] = 1095286558805663130L;
        nd.hlbk[308] = 1947496944986360690L;
        nd.hlbk[309] = -6729892240710364218L;
        nd.hlbk[310] = -9212933956567278468L;
        nd.hlbk[311] = 4534647660065841532L;
        nd.hlbk[312] = 2624326912073739292L;
        nd.hlbk[313] = 7416523444417753848L;
        nd.hlbk[314] = -1790998754416201857L;
        nd.hlbk[315] = 7354507471314119936L;
        nd.hlbk[316] = -9198068047496707687L;
        nd.hlbk[317] = -66222530410451399L;
        nd.hlbk[318] = 858946772871413088L;
        nd.hlbk[319] = 5827866784312951716L;
        nd.hlbk[320] = 6960786783580570308L;
        nd.hlbk[321] = -8945581502059914585L;
        nd.hlbk[322] = 8737914682894317247L;
        nd.hlbk[323] = 2266640599289024630L;
        nd.hlbk[324] = 4607630690212586084L;
        nd.hlbk[325] = -1590674819928396536L;
        nd.hlbk[326] = -4232229976914212643L;
        nd.hlbk[327] = -818070086174484061L;
        nd.hlbk[328] = -5085096254241962977L;
        nd.hlbk[329] = -1082354112083282928L;
        nd.hlbk[330] = 2727908669411083970L;
        nd.hlbk[331] = -5981183517697429200L;
        nd.hlbk[332] = -8790540843826112910L;
        nd.hlbk[333] = 2110541939897904689L;
        nd.hlbk[334] = 3543094163454395471L;
        nd.hlbk[335] = -340447418275673117L;
        nd.hlbk[336] = -7385577134995371396L;
        nd.hlbk[337] = -3788579787328965081L;
        nd.hlbk[338] = 8088670843852269907L;
        nd.hlbk[339] = 7642706508494073033L;
        nd.hlbk[340] = -6164954363569898790L;
        nd.hlbk[341] = -8183504051994233985L;
        nd.hlbk[342] = 8140945595113673194L;
        nd.hlbk[343] = 3278694304083417974L;
        nd.hlbk[344] = -7971774332649126184L;
        nd.hlbk[345] = 3800710187481235476L;
        nd.hlbk[346] = 1219748072683562330L;
        nd.hlbk[347] = 4431136463090650055L;
        nd.hlbk[348] = -6536281204639871866L;
        nd.hlbk[349] = -1476270942079192047L;
        nd.hlbk[350] = 7966600501995299667L;
        nd.hlbk[351] = 184124149090027882L;
        nd.hlbk[352] = 1177970271298959759L;
        nd.hlbk[353] = 7432254037746107467L;
        nd.hlbk[354] = -6360603700979123416L;
        nd.hlbk[355] = 6275611889763346076L;
        nd.hlbk[356] = -3132335135999873547L;
        nd.hlbk[357] = 7906208423418177968L;
        nd.hlbk[358] = -5677427179078472292L;
        nd.hlbk[359] = 1539057031223167351L;
        nd.hlbk[360] = 3928292628958187216L;
        nd.hlbk[361] = 1918980141595226981L;
        nd.hlbk[362] = -7428950115417615262L;
        nd.hlbk[363] = -1486013683957282285L;
        nd.hlbk[364] = 6018423411267920410L;
        nd.hlbk[365] = -1263361117857285258L;
        nd.hlbk[366] = -571116787953379510L;
        nd.hlbk[367] = 8806407699027027945L;
        nd.hlbk[368] = 4564859912499046991L;
        nd.hlbk[369] = 8899977400690768662L;
        nd.hlbk[370] = 4894090274544957765L;
        nd.hlbk[371] = 5607599161234207895L;
        nd.hlbk[372] = 3642097349070662419L;
        nd.hlbk[373] = -3476380856506872922L;
        nd.hlbk[374] = 25338859444408272L;
        nd.hlbk[375] = 4854808602461632089L;
        nd.hlbk[376] = 2574605374006942009L;
        nd.hlbk[377] = -5628041413304063122L;
        nd.hlbk[378] = -1326284204616699661L;
        nd.hlbk[379] = -7244214355697837448L;
        nd.hlbk[380] = -5588622374062194173L;
        nd.hlbk[381] = 6408102828317717002L;
        nd.hlbk[382] = 7916635858079515215L;
        nd.hlbk[383] = 1253530244553577594L;
        nd.hlbk[384] = 5025437827546481760L;
        nd.hlbk[385] = 3427037650861306663L;
        nd.hlbk[386] = -7611434736375433686L;
        nd.hlbk[387] = 287810987657128572L;
        nd.hlbk[388] = -7293294815845451551L;
        nd.hlbk[389] = -3008235518108515297L;
        nd.hlbk[390] = -4730953857476769810L;
        nd.hlbk[391] = -2544337114677051259L;
        nd.hlbk[392] = -6877645683264279644L;
        nd.hlbk[393] = -2822431138108540367L;
        nd.hlbk[394] = -4474246833195477835L;
        nd.hlbk[395] = 148523416722972963L;
        nd.hlbk[396] = 1705576774751626022L;
        nd.hlbk[397] = -5033274741100053018L;
        nd.hlbk[398] = -8419145712290557382L;
        nd.hlbk[399] = 1068081233039066169L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int multAlpha(int var0, float var1_1) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hmgp", hlbj(int ), (int)172) - nd.hlbm("hmgo", hlbj(int ), (int)171));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 265820759: {
                    continue block30;
                }
                case 1076290759: {
                    break block30;
                }
            }
            break;
        }
        var4_2 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hmgq", hlbj(int ), (int)173)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nd.hlbm("hmgr", hlbr(int ), (int)433)) break;
            v1 /* !! */  = (long)nd.hlbm("hmgs", hlbr(int ), (int)434);
        }
        var3_3 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl21
        block32: while (true) {
            v2 /* !! */  = (long)(nd.hlbm("hmgu", hlbj(int ), (int)175) - nd.hlbm("hmgt", hlbj(int ), (int)174));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1076290759: {
                    break block32;
                }
                case 1259719369: {
                    continue block32;
                }
            }
            break;
        }
        var2_4 = nd.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return (int)nd.hlbm("hmgv", hlbr(int ), (int)435);
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block8 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = nd.oo;
                if (true) ** GOTO lbl39
                block34: while (true) {
                    v3 /* !! */  = (long)(nd.hlbm("hmgx", hlbj(int ), (int)177) - nd.hlbm("hmgw", hlbj(int ), (int)176));
lbl39:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1076290759: {
                            break block34;
                        }
                        case 1587497036: {
                            continue block34;
                        }
                    }
                    break;
                }
                v4 = nd.getRed(var0);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hmgy", hlbj(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nd.hlbm("hmgz", hlbr(int ), (int)436)) break;
                    v5 /* !! */  = (long)nd.hlbm("hmha", hlbr(int ), (int)437);
                }
                v6 = nd.getGreen(var0);
                v7 /* !! */  = nd.oo;
                if (true) ** GOTO lbl55
                block36: while (true) {
                    v7 /* !! */  = (long)(nd.hlbm("hmhc", hlbj(int ), (int)180) - nd.hlbm("hmhb", hlbj(int ), (int)179));
lbl55:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1049339482: {
                            continue block36;
                        }
                        case 1076290759: {
                            break block36;
                        }
                    }
                    break;
                }
                v8 = nd.getBlue(var0);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hmhd", hlbj(int ), (int)181)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nd.hlbm("hmhe", hlbr(int ), (int)438)) break;
                    v9 /* !! */  = (long)nd.hlbm("hmhf", hlbr(int ), (int)439);
                }
                v10 = (float)nd.getAlpha(var0) * var1_1;
                v11 /* !! */  = nd.oo;
                if (true) ** GOTO lbl71
                block38: while (true) {
                    v11 /* !! */  = (long)(nd.hlbm("hmhh", hlbj(int ), (int)183) - nd.hlbm("hmhg", hlbj(int ), (int)182));
lbl71:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 1076290759: {
                            break block38;
                        }
                        case 2003062215: {
                            continue block38;
                        }
                    }
                    break;
                }
                v12 = Math.round(v10);
                v13 /* !! */  = nd.oo;
                if (true) ** GOTO lbl81
                block39: while (true) {
                    v13 /* !! */  = (long)(nd.hlbm("hmhj", hlbj(int ), (int)185) - nd.hlbm("hmhi", hlbj(int ), (int)184));
lbl81:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1895552990: {
                            continue block39;
                        }
                        case 1076290759: {
                            break block39;
                        }
                    }
                    break;
                }
                return nd.rgba(v4, v6, v8, v12);
            }
            case 0: {
                var3_3 /* !! */  = (int)nd.hlbm("hmhk", hlbr(int ), (int)440);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)nd.hlbm("hmhl", hlbr(int ), (int)441);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nd.hlbm("hmhm", hlbr(int ), (int)442);
                    if (!var4_2) break block8;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nd.hlbm("hmhn", hlbr(int ), (int)443);
        ** while (!var4_2)
lbl103:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hplf() {
        nd.hlbs[200] = -240405827;
        nd.hlbs[201] = 162603439;
        nd.hlbs[202] = -1172967704;
        nd.hlbs[203] = 1228385247;
        nd.hlbs[204] = 998320069;
        nd.hlbs[205] = 988807153;
        nd.hlbs[206] = 785438037;
        nd.hlbs[207] = 1725301604;
        nd.hlbs[208] = 1703014723;
        nd.hlbs[209] = -1756233770;
        nd.hlbs[210] = 796195502;
        nd.hlbs[211] = -349263328;
        nd.hlbs[212] = -344696506;
        nd.hlbs[213] = 1094460664;
        nd.hlbs[214] = -1463803812;
        nd.hlbs[215] = 733931496;
        nd.hlbs[216] = -1465380173;
        nd.hlbs[217] = 508407085;
        nd.hlbs[218] = 2145401657;
        nd.hlbs[219] = -1322758222;
        nd.hlbs[220] = 1584969382;
        nd.hlbs[221] = 1135935398;
        nd.hlbs[222] = 1629674564;
        nd.hlbs[223] = 576233135;
        nd.hlbs[224] = 432529989;
        nd.hlbs[225] = -1961014573;
        nd.hlbs[226] = 1362721983;
        nd.hlbs[227] = -1398414293;
        nd.hlbs[228] = -289435272;
        nd.hlbs[229] = -381764121;
        nd.hlbs[230] = 677443691;
        nd.hlbs[231] = -456740315;
        nd.hlbs[232] = -584395448;
        nd.hlbs[233] = 1686179379;
        nd.hlbs[234] = -759113238;
        nd.hlbs[235] = -364354348;
        nd.hlbs[236] = 801923217;
        nd.hlbs[237] = 1960879118;
        nd.hlbs[238] = -132309876;
        nd.hlbs[239] = -2096407160;
        nd.hlbs[240] = -1332039687;
        nd.hlbs[241] = -1695978924;
        nd.hlbs[242] = -1460666932;
        nd.hlbs[243] = -2030712766;
        nd.hlbs[244] = -1005149096;
        nd.hlbs[245] = -1666582171;
        nd.hlbs[246] = 1040945337;
        nd.hlbs[247] = -1901299945;
        nd.hlbs[248] = 1518030704;
        nd.hlbs[249] = 1435692068;
        nd.hlbs[250] = 828346529;
        nd.hlbs[251] = 606422382;
        nd.hlbs[252] = -481646331;
        nd.hlbs[253] = -926046142;
        nd.hlbs[254] = -950481810;
        nd.hlbs[255] = 1783000367;
        nd.hlbs[256] = -532902251;
        nd.hlbs[257] = -287504051;
        nd.hlbs[258] = 1362463756;
        nd.hlbs[259] = -1002949946;
        nd.hlbs[260] = 570458207;
        nd.hlbs[261] = -2141226755;
        nd.hlbs[262] = 2021581817;
        nd.hlbs[263] = -809196175;
        nd.hlbs[264] = 1422661374;
        nd.hlbs[265] = -219893679;
        nd.hlbs[266] = -308131993;
        nd.hlbs[267] = 497653962;
        nd.hlbs[268] = 128626357;
        nd.hlbs[269] = 2115777095;
        nd.hlbs[270] = 9582849;
        nd.hlbs[271] = -1082417115;
        nd.hlbs[272] = 155508048;
        nd.hlbs[273] = -798375283;
        nd.hlbs[274] = -1092629751;
        nd.hlbs[275] = -310152928;
        nd.hlbs[276] = 1132820830;
        nd.hlbs[277] = -26980664;
        nd.hlbs[278] = -1652019783;
        nd.hlbs[279] = -1517080360;
        nd.hlbs[280] = 228251809;
        nd.hlbs[281] = 1012869122;
        nd.hlbs[282] = -393018749;
        nd.hlbs[283] = -403257625;
        nd.hlbs[284] = 1007175611;
        nd.hlbs[285] = -1305444204;
        nd.hlbs[286] = 2001938285;
        nd.hlbs[287] = -531734254;
        nd.hlbs[288] = 384591565;
        nd.hlbs[289] = 1839593568;
        nd.hlbs[290] = 2095389933;
        nd.hlbs[291] = 827506554;
        nd.hlbs[292] = 268329455;
        nd.hlbs[293] = -1017413049;
        nd.hlbs[294] = -89956843;
        nd.hlbs[295] = -1804141386;
        nd.hlbs[296] = 1411004225;
        nd.hlbs[297] = -963114752;
        nd.hlbs[298] = 1224357692;
        nd.hlbs[299] = -1756108960;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int getAlpha(int n2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = oo - nd.hlbm("hnpd", hlbj(int ), (int)380)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == nd.hlbm("hnpe", hlbr(int ), (int)867)) break;
            object = nd.hlbm("hnpf", hlbr(int ), (int)868);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = oo - nd.hlbm("hnpg", hlbj(int ), (int)381)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == nd.hlbm("hnph", hlbr(int ), (int)869)) break;
            object = nd.hlbm("hnpi", hlbr(int ), (int)870);
        }
        int n3 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = oo - nd.hlbm("hnpj", hlbj(int ), (int)382)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == nd.hlbm("hnpk", hlbr(int ), (int)871)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = nd.hlbm("hnpl", hlbr(int ), (int)872);
        }
        if (!bl2 && !bl2) return n2 >> nd.hlbm("hnpn", hlbr(int ), (int)874) & nd.hlbm("hnpo", hlbr(int ), (int)875);
        return (int)nd.hlbm("hnpm", hlbr(int ), (int)873);
    }

    private static /* synthetic */ int hlbr(int n2) {
        return hlbs[n2] ^ hlbt[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int interpolateColor(int var0, int var1_1, float var2_2) {
        var17_3 = nd.c;
        var16_4 /* !! */  = nd.b;
        var15_5 = nd.a;
        if (var17_3) {
            throw null;
lbl6:
            // 15 sources

            return (int)nd.hlbm("hnqp", hlbr(int ), (int)895);
        }
        if (var15_5) ** GOTO lbl6
        if (var16_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_5) ** GOTO lbl6
                var2_2 = Math.min(1.0f, Math.max(0.0f, var2_2));
                if (var15_5 || var15_5) ** GOTO lbl6
                var3_6 = nd.getRed(var0);
                if (var15_5 || var15_5) ** GOTO lbl6
                var4_7 = nd.getGreen(var0);
                if (var15_5 || var15_5) ** GOTO lbl6
                var5_8 = nd.getBlue(var0);
                if (var15_5 || var15_5) ** GOTO lbl6
                var6_9 = nd.getAlpha(var0);
                if (var15_5 || var15_5) ** GOTO lbl6
                var7_10 = nd.getRed(var1_1);
                if (var15_5 || var15_5) ** GOTO lbl6
                var8_11 = nd.getGreen(var1_1);
                if (var15_5 || var15_5) ** GOTO lbl6
                var9_12 = nd.getBlue(var1_1);
                if (var15_5 || var15_5) ** GOTO lbl6
                var10_13 = nd.getAlpha(var1_1);
                if (var15_5 || var15_5) ** GOTO lbl6
                var11_14 = nd.interpolateInt(var3_6, var7_10, var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var12_15 = nd.interpolateInt(var4_7, var8_11, var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var13_16 = nd.interpolateInt(var5_8, var9_12, var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var14_17 = nd.interpolateInt(var6_9, var10_13, var2_2);
                if (!var15_5 && !var15_5) ** break;
                ** continue;
                return var14_17 << nd.hlbm("hnqq", hlbr(int ), (int)896) | var11_14 << nd.hlbm("hnqr", hlbr(int ), (int)897) | var12_15 << nd.hlbm("hnqs", hlbr(int ), (int)898) | var13_16;
            }
lbl41:
            // 2 sources

            case 0: {
                var16_4 /* !! */  = (int)nd.hlbm("hnqt", hlbr(int ), (int)899);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 1: {
                var16_4 /* !! */  = (int)nd.hlbm("hnqu", hlbr(int ), (int)900);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl150
            }
            case 2: {
                var16_4 /* !! */  = (int)nd.hlbm("hnqv", hlbr(int ), (int)901);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 3: {
                var16_4 /* !! */  = (int)nd.hlbm("hnqw", hlbr(int ), (int)902);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl61:
            // 3 sources

            case 4: {
                var16_4 /* !! */  = (int)nd.hlbm("hnqx", hlbr(int ), (int)903);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 5: {
                var16_4 /* !! */  = (int)nd.hlbm("hnqy", hlbr(int ), (int)904);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 6: {
                var16_4 /* !! */  = (int)nd.hlbm("hnqz", hlbr(int ), (int)905);
                if (var17_3) {
                    throw null;
                }
            }
            case 7: {
                var16_4 /* !! */  = (int)nd.hlbm("hnra", hlbr(int ), (int)906);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl80:
            // 5 sources

            case 8: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrb", hlbr(int ), (int)907);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl85:
            // 2 sources

            case 9: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrc", hlbr(int ), (int)908);
                if (!var17_3) ** GOTO lbl80
                throw null;
            }
            case 10: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrd", hlbr(int ), (int)909);
                if (!var17_3) ** GOTO lbl41
                throw null;
            }
lbl93:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var16_4 /* !! */  = (int)nd.hlbm("hnre", hlbr(int ), (int)910);
                    if (!var17_3) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl98:
            // 2 sources

            case 12: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrf", hlbr(int ), (int)911);
                if (!var17_3) ** GOTO lbl61
                throw null;
            }
            case 13: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrg", hlbr(int ), (int)912);
                if (!var17_3) ** GOTO lbl80
                throw null;
            }
lbl106:
            // 4 sources

            case 14: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrh", hlbr(int ), (int)913);
                if (!var17_3) ** GOTO lbl61
                throw null;
            }
            case 15: {
                var16_4 /* !! */  = (int)nd.hlbm("hnri", hlbr(int ), (int)914);
                if (!var17_3) ** GOTO lbl80
                throw null;
            }
lbl114:
            // 2 sources

            case 16: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrj", hlbr(int ), (int)915);
                if (!var17_3) ** GOTO lbl106
                throw null;
            }
lbl118:
            // 3 sources

            case 17: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrk", hlbr(int ), (int)916);
                if (!var17_3) ** GOTO lbl106
                throw null;
            }
lbl122:
            // 2 sources

            case 18: {
                do {
                    var16_4 /* !! */  = (int)nd.hlbm("hnrl", hlbr(int ), (int)917);
                } while (!var17_3);
                throw null;
            }
lbl127:
            // 2 sources

            case 19: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrm", hlbr(int ), (int)918);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 20: {
                do {
                    var16_4 /* !! */  = (int)nd.hlbm("hnrn", hlbr(int ), (int)919);
                } while (!var17_3);
                throw null;
            }
lbl137:
            // 2 sources

            case 21: {
                var16_4 /* !! */  = (int)nd.hlbm("hnro", hlbr(int ), (int)920);
                if (!var17_3) ** GOTO lbl85
                throw null;
            }
lbl141:
            // 3 sources

            case 22: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrp", hlbr(int ), (int)921);
                if (!var17_3) ** GOTO lbl93
                throw null;
            }
lbl145:
            // 2 sources

            case 23: {
                do {
                    var16_4 /* !! */  = (int)nd.hlbm("hnrq", hlbr(int ), (int)922);
                } while (!var17_3);
                throw null;
            }
lbl150:
            // 2 sources

            case 24: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrr", hlbr(int ), (int)923);
                if (!var17_3) ** GOTO lbl98
                throw null;
            }
            case 25: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrs", hlbr(int ), (int)924);
                if (!var17_3) break;
                throw null;
            }
            case 26: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrt", hlbr(int ), (int)925);
                if (!var17_3) ** GOTO lbl145
                throw null;
            }
            case 27: {
                var16_4 /* !! */  = (int)nd.hlbm("hnru", hlbr(int ), (int)926);
                if (!var17_3) ** GOTO lbl80
                throw null;
            }
            case 28: {
                var16_4 /* !! */  = (int)nd.hlbm("hnrv", hlbr(int ), (int)927);
                if (!var17_3) ** GOTO lbl122
                throw null;
            }
            case 29: 
        }
        var16_4 /* !! */  = (int)nd.hlbm("hnrw", hlbr(int ), (int)928);
        ** while (!var17_3)
lbl173:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public static String normalize(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CASE]], but top level block is 27[SWITCH]
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

    private static /* synthetic */ void hprs() {
        nd.hlbl[300] = -4201139569835655939L;
        nd.hlbl[301] = -8972380400815947138L;
        nd.hlbl[302] = 3869533092087382291L;
        nd.hlbl[303] = 2069194867719889024L;
        nd.hlbl[304] = -1560392136725660406L;
        nd.hlbl[305] = -4911775938992042204L;
        nd.hlbl[306] = -6815244575906861186L;
        nd.hlbl[307] = 1023067102325782275L;
        nd.hlbl[308] = -3858071126273891942L;
        nd.hlbl[309] = 1804529864387441963L;
        nd.hlbl[310] = -9128586147971256504L;
        nd.hlbl[311] = -8622710522397996825L;
        nd.hlbl[312] = 8734829905127873539L;
        nd.hlbl[313] = 4605245980451935451L;
        nd.hlbl[314] = 8782582094529120434L;
        nd.hlbl[315] = 569145876688022022L;
        nd.hlbl[316] = -4765932544953106924L;
        nd.hlbl[317] = 8518768906752934778L;
        nd.hlbl[318] = 624307655176947426L;
        nd.hlbl[319] = 4432545769789837809L;
        nd.hlbl[320] = -1593061441858450105L;
        nd.hlbl[321] = 6243827456351856966L;
        nd.hlbl[322] = 5767260977985085230L;
        nd.hlbl[323] = 534116686268640726L;
        nd.hlbl[324] = -6086015468952707690L;
        nd.hlbl[325] = 977165523156760208L;
        nd.hlbl[326] = 3651859398717135110L;
        nd.hlbl[327] = 2176957559102569307L;
        nd.hlbl[328] = 3952233045652138913L;
        nd.hlbl[329] = 5393215207343696384L;
        nd.hlbl[330] = 1627204262725934203L;
        nd.hlbl[331] = -4384055580641247339L;
        nd.hlbl[332] = 8259616198166364752L;
        nd.hlbl[333] = 3842973888350700517L;
        nd.hlbl[334] = 5250639309467655753L;
        nd.hlbl[335] = 5708625425394414973L;
        nd.hlbl[336] = 4655003383482576423L;
        nd.hlbl[337] = 2732960834918100913L;
        nd.hlbl[338] = 4395694284549705154L;
        nd.hlbl[339] = 1807455888183138156L;
        nd.hlbl[340] = 1104642082442541127L;
        nd.hlbl[341] = 8967919635932951512L;
        nd.hlbl[342] = -8216331574468131833L;
        nd.hlbl[343] = -1507860905234112557L;
        nd.hlbl[344] = 274343803575467458L;
        nd.hlbl[345] = -8201869424589225109L;
        nd.hlbl[346] = 1456963392213727373L;
        nd.hlbl[347] = 4013060664561181028L;
        nd.hlbl[348] = 5329809803829220788L;
        nd.hlbl[349] = 2653710697707135700L;
        nd.hlbl[350] = -1863516287789564115L;
        nd.hlbl[351] = -4024906324623169012L;
        nd.hlbl[352] = 2259202575297848601L;
        nd.hlbl[353] = -4727825953793913765L;
        nd.hlbl[354] = 4809155327887727729L;
        nd.hlbl[355] = 645271189019168853L;
        nd.hlbl[356] = 533906337765567031L;
        nd.hlbl[357] = -5340291393177650502L;
        nd.hlbl[358] = 3253259655855390604L;
        nd.hlbl[359] = -4161476013323491524L;
        nd.hlbl[360] = 2601850129831631209L;
        nd.hlbl[361] = -3044509552930323746L;
        nd.hlbl[362] = -5930306255160594760L;
        nd.hlbl[363] = -2451524026146303095L;
        nd.hlbl[364] = -6043899679124824207L;
        nd.hlbl[365] = 5989034377799392309L;
        nd.hlbl[366] = -9119762812969298932L;
        nd.hlbl[367] = -3344640023980023541L;
        nd.hlbl[368] = 6656804243520751120L;
        nd.hlbl[369] = -7153554321056902047L;
        nd.hlbl[370] = 1759285881588202615L;
        nd.hlbl[371] = 2166759069949715728L;
        nd.hlbl[372] = 4354457946572100774L;
        nd.hlbl[373] = -6368429192013878876L;
        nd.hlbl[374] = -7687305119348669730L;
        nd.hlbl[375] = -6858877914968571928L;
        nd.hlbl[376] = -1232108849279956498L;
        nd.hlbl[377] = -6096640032186168629L;
        nd.hlbl[378] = -5171706537116415407L;
        nd.hlbl[379] = -447531748205433334L;
        nd.hlbl[380] = -4394747376332023023L;
        nd.hlbl[381] = -4301804600073321590L;
        nd.hlbl[382] = -4282304206034782047L;
        nd.hlbl[383] = 6801840508025584041L;
        nd.hlbl[384] = 1875923119420676609L;
        nd.hlbl[385] = -2091375630752094775L;
        nd.hlbl[386] = -3162332413194854326L;
        nd.hlbl[387] = -3028145674493231874L;
        nd.hlbl[388] = -4281393507611885646L;
        nd.hlbl[389] = -2225212765346222432L;
        nd.hlbl[390] = 5275912307183698728L;
        nd.hlbl[391] = 2792010004007898507L;
        nd.hlbl[392] = -4421032623515758658L;
        nd.hlbl[393] = -2143281642022130247L;
        nd.hlbl[394] = 8191010472345335630L;
        nd.hlbl[395] = -150591638813829357L;
        nd.hlbl[396] = -9184258726324909380L;
        nd.hlbl[397] = 9094398637159668604L;
        nd.hlbl[398] = 1515179781658551978L;
        nd.hlbl[399] = -1191262560195327804L;
    }

    private static /* synthetic */ void hpow() {
        nd.hlbt[1200] = -1046598585;
        nd.hlbt[1201] = -1030055840;
        nd.hlbt[1202] = 1938677504;
        nd.hlbt[1203] = -359824799;
        nd.hlbt[1204] = -1809219176;
        nd.hlbt[1205] = 256131456;
        nd.hlbt[1206] = 441738524;
        nd.hlbt[1207] = 399977156;
        nd.hlbt[1208] = 130813085;
        nd.hlbt[1209] = 547118903;
        nd.hlbt[1210] = -1512571399;
        nd.hlbt[1211] = -482594496;
        nd.hlbt[1212] = -333805444;
        nd.hlbt[1213] = 178282569;
        nd.hlbt[1214] = -916431213;
        nd.hlbt[1215] = 2137264731;
        nd.hlbt[1216] = -32271080;
        nd.hlbt[1217] = 1457332106;
        nd.hlbt[1218] = -1819577848;
        nd.hlbt[1219] = -1248171669;
        nd.hlbt[1220] = 333921700;
        nd.hlbt[1221] = 1404840169;
        nd.hlbt[1222] = -1243261881;
        nd.hlbt[1223] = 582117175;
        nd.hlbt[1224] = -40381319;
        nd.hlbt[1225] = -1108227408;
        nd.hlbt[1226] = 1861796872;
        nd.hlbt[1227] = 1264094942;
        nd.hlbt[1228] = 1974220842;
        nd.hlbt[1229] = 1826912009;
        nd.hlbt[1230] = 832585723;
        nd.hlbt[1231] = -1110909705;
        nd.hlbt[1232] = 1880675796;
        nd.hlbt[1233] = 1097480643;
        nd.hlbt[1234] = 204424003;
        nd.hlbt[1235] = 1570618617;
        nd.hlbt[1236] = 1107688633;
        nd.hlbt[1237] = -1463728554;
        nd.hlbt[1238] = 529421605;
        nd.hlbt[1239] = -489787171;
        nd.hlbt[1240] = 141514512;
        nd.hlbt[1241] = -797646300;
        nd.hlbt[1242] = 1356587004;
        nd.hlbt[1243] = -1120284927;
        nd.hlbt[1244] = -150889450;
        nd.hlbt[1245] = -349163775;
        nd.hlbt[1246] = 583992176;
        nd.hlbt[1247] = 1283750479;
        nd.hlbt[1248] = -1051144344;
        nd.hlbt[1249] = 1860171934;
        nd.hlbt[1250] = -1609391724;
        nd.hlbt[1251] = 1038872155;
        nd.hlbt[1252] = -865578594;
        nd.hlbt[1253] = 1168971467;
        nd.hlbt[1254] = -406333929;
        nd.hlbt[1255] = -1449893596;
        nd.hlbt[1256] = 660371457;
        nd.hlbt[1257] = -699039928;
        nd.hlbt[1258] = 223536231;
        nd.hlbt[1259] = 1987288618;
        nd.hlbt[1260] = 1176980523;
        nd.hlbt[1261] = 0xDA777DD;
        nd.hlbt[1262] = -1924171691;
        nd.hlbt[1263] = -55231881;
        nd.hlbt[1264] = -1204114676;
        nd.hlbt[1265] = 268977446;
        nd.hlbt[1266] = -582520594;
        nd.hlbt[1267] = -211768317;
        nd.hlbt[1268] = 912012239;
        nd.hlbt[1269] = 1091671224;
        nd.hlbt[1270] = -392196658;
        nd.hlbt[1271] = -896274039;
        nd.hlbt[1272] = -1754927767;
        nd.hlbt[1273] = 375571418;
        nd.hlbt[1274] = -1345161108;
        nd.hlbt[1275] = 1964821861;
        nd.hlbt[1276] = -883553174;
        nd.hlbt[1277] = 1389515053;
        nd.hlbt[1278] = 1338348508;
        nd.hlbt[1279] = 938468312;
        nd.hlbt[1280] = -1732209678;
        nd.hlbt[1281] = 436524661;
        nd.hlbt[1282] = 1264195519;
        nd.hlbt[1283] = 158249259;
        nd.hlbt[1284] = -1937508717;
        nd.hlbt[1285] = -1208002384;
        nd.hlbt[1286] = -544256474;
        nd.hlbt[1287] = 749051394;
        nd.hlbt[1288] = 1253617064;
        nd.hlbt[1289] = -701848838;
        nd.hlbt[1290] = 1580492895;
        nd.hlbt[1291] = 1772938222;
        nd.hlbt[1292] = 1644917726;
        nd.hlbt[1293] = -2039676326;
        nd.hlbt[1294] = 1824923697;
        nd.hlbt[1295] = 287319084;
        nd.hlbt[1296] = -1128677711;
        nd.hlbt[1297] = 794847001;
        nd.hlbt[1298] = -1755421070;
        nd.hlbt[1299] = -1629686289;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int rgba(int var0, int var1_1, int var2_2, float var3_3) {
        block25: {
            v0 /* !! */  = nd.oo;
            block10: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case 1076290759: {
                        break block10;
                    }
                    case 1423854778: {
                        v0 /* !! */  = (long)(nd.hlbm("hnfv", hlbj(int ), (int)277) - nd.hlbm("hnfu", hlbj(int ), (int)276));
                        continue block10;
                    }
                }
                break;
            }
            var6_4 = nd.c;
            while (true) {
                block26: {
                    if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnfw", hlbj(int ), (int)278)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v1 /* !! */  != nd.hlbm("hnfx", hlbr(int ), (int)728)) break block26;
                    var5_5 /* !! */  = nd.b;
                    if (var5_5 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v1 /* !! */  = (long)nd.hlbm("hnfy", hlbr(int ), (int)729);
            }
            cfr_temp_0 = -2147483648;
            block12: do {
                switch (cfr_temp_0 == -2147483648 ? var5_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnfz", hlbj(int ), (int)279)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v2 /* !! */  == nd.hlbm("hnga", hlbr(int ), (int)730)) {
                                var4_6 = nd.a;
                                if (var6_4) {
                                    throw null;
                                }
                                break;
                            }
                            v2 /* !! */  = (long)nd.hlbm("hngb", hlbr(int ), (int)731);
                        }
                        if (var4_6 != false) return (int)nd.hlbm("hngc", hlbr(int ), (int)732);
                        if (var4_6 != false) return (int)nd.hlbm("hngc", hlbr(int ), (int)732);
                        v3 = (int)(var3_3 * nd.hlbm("hngd", hlzk(int ), (int)733));
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hnge", hlbj(int ), (int)280)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == nd.hlbm("hngf", hlbr(int ), (int)734)) {
                                return nd.rgba(var0, var1_1, var2_2, v3);
                            }
                            v4 /* !! */  = (long)nd.hlbm("hngg", hlbr(int ), (int)735);
                        }
                    }
                    case 2: {
                        var5_5 /* !! */  = (int)nd.hlbm("hngj", hlbr(int ), (int)738);
                        if (var6_4) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 3: {
                        break block25;
                    }
lbl53:
                    // 2 sources

                    while (true) {
                        var5_5 /* !! */  = (int)nd.hlbm("hngh", hlbr(int ), (int)736);
                        cfr_temp_0 = 1;
                        if (!var6_4) continue block12;
                        throw null;
                    }
                    case 1: 
                }
                break;
            } while (true);
            var5_5 /* !! */  = (int)nd.hlbm("hngi", hlbr(int ), (int)737);
            if (var6_4) {
                throw null;
            }
        }
        var5_5 /* !! */  = (int)nd.hlbm("hngk", hlbr(int ), (int)739);
        ** while (!var6_4)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int rgb(int var0, int var1_1, int var2_2) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hngm", hlbj(int ), (int)282) - nd.hlbm("hngl", hlbj(int ), (int)281));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -745332577: {
                    continue block25;
                }
                case 1076290759: {
                    break block25;
                }
            }
            break;
        }
        var5_3 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl15
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hngn", hlbj(int ), (int)283));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1780566090: {
                    v2 = nd.hlbm("hngo", hlbj(int ), (int)284);
                    continue block26;
                }
                case -638840554: {
                    v2 = nd.hlbm("hngp", hlbj(int ), (int)285);
                    continue block26;
                }
                case 1076290759: {
                    break block26;
                }
            }
            break;
        }
        var4_4 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl29
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hngq", hlbj(int ), (int)286));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1319689650: {
                    v4 = nd.hlbm("hngr", hlbj(int ), (int)287);
                    continue block27;
                }
                case 100654651: {
                    v4 = nd.hlbm("hngs", hlbj(int ), (int)288);
                    continue block27;
                }
                case 1076290759: {
                    break block27;
                }
            }
            break;
        }
        var3_5 = nd.a;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) {
                    throw null;
                    return (int)nd.hlbm("hngt", hlbr(int ), (int)740);
                }
                if (var3_5 || var3_5) ** continue;
                v5 = nd.hlbm("hngu", hlbr(int ), (int)741);
                v6 /* !! */  = nd.oo;
                if (true) ** GOTO lbl52
                block29: while (true) {
                    v6 /* !! */  = (long)(v7 - nd.hlbm("hngv", hlbj(int ), (int)289));
lbl52:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1306700533: {
                            v7 = nd.hlbm("hngw", hlbj(int ), (int)290);
                            continue block29;
                        }
                        case 646928665: {
                            v7 = nd.hlbm("hngx", hlbj(int ), (int)291);
                            continue block29;
                        }
                        case 1076290759: {
                            break block29;
                        }
                    }
                    break;
                }
                return nd.rgba(var0, var1_1, var2_2, (int)v5);
            }
lbl62:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)nd.hlbm("hngy", hlbr(int ), (int)742);
                if (!var5_3) break;
                throw null;
            }
            case 1: {
                var4_4 /* !! */  = (int)nd.hlbm("hngz", hlbr(int ), (int)743);
                if (!var5_3) break;
                throw null;
            }
            case 2: {
                var4_4 /* !! */  = (int)nd.hlbm("hnha", hlbr(int ), (int)744);
                if (!var5_3) ** GOTO lbl62
                throw null;
            }
            case 3: 
        }
        do {
            var4_4 /* !! */  = (int)nd.hlbm("hnhb", hlbr(int ), (int)745);
        } while (!var5_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int reAlphaInt(int var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnxc", hlbj(int ), (int)448)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hnxd", hlbr(int ), (int)1006)) break;
            v0 /* !! */  = (long)nd.hlbm("hnxe", hlbr(int ), (int)1007);
        }
        var4_2 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnxf", hlbj(int ), (int)449)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nd.hlbm("hnxg", hlbr(int ), (int)1008)) break;
            v1 /* !! */  = (long)nd.hlbm("hnxh", hlbr(int ), (int)1009);
        }
        var3_3 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnxi", hlbj(int ), (int)450)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hnxj", hlbr(int ), (int)1010)) break;
            v2 /* !! */  = (long)nd.hlbm("hnxk", hlbr(int ), (int)1011);
        }
        var2_4 = nd.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (int)nd.hlbm("hnxl", hlbr(int ), (int)1012);
                }
                if (var2_4 || var2_4) ** continue;
                v3 = var1_1;
                v4 = nd.hlbm("hnxm", hlbr(int ), (int)1013);
                v5 = nd.hlbm("hnxn", hlbr(int ), (int)1014);
                v6 /* !! */  = nd.oo;
                if (true) ** GOTO lbl37
                block16: while (true) {
                    v6 /* !! */  = (long)(v7 - nd.hlbm("hnxo", hlbj(int ), (int)451));
lbl37:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -757908195: {
                            v7 = nd.hlbm("hnxp", hlbj(int ), (int)452);
                            continue block16;
                        }
                        case -580486648: {
                            v7 = nd.hlbm("hnxq", hlbj(int ), (int)453);
                            continue block16;
                        }
                        case -566163305: {
                            v7 = nd.hlbm("hnxr", hlbj(int ), (int)454);
                            continue block16;
                        }
                        case 1076290759: {
                            break block16;
                        }
                    }
                    break;
                }
                return Math.clamp((long)v3, (int)v4, (int)v5) << nd.hlbm("hnxs", hlbr(int ), (int)1015) | var0 & nd.hlbm("hnxt", hlbr(int ), (int)1016);
            }
lbl50:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)nd.hlbm("hnxu", hlbr(int ), (int)1017);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl59
            }
lbl55:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)nd.hlbm("hnxv", hlbr(int ), (int)1018);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
lbl59:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nd.hlbm("hnxw", hlbr(int ), (int)1019);
                    if (!var4_2) ** GOTO lbl55
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nd.hlbm("hnxx", hlbr(int ), (int)1020);
        ** while (!var4_2)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int getGradientColor(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlyo", hlbj(int ), (int)157)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hlyp", hlbr(int ), (int)240)) break;
            v0 /* !! */  = (long)nd.hlbm("hlyq", hlbr(int ), (int)241);
        }
        var5_1 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl12
        block38: while (true) {
            v1 /* !! */  = (long)(nd.hlbm("hlys", hlbj(int ), (int)159) - nd.hlbm("hlyr", hlbj(int ), (int)158));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 565319250: {
                    continue block38;
                }
                case 1076290759: {
                    break block38;
                }
            }
            break;
        }
        var4_2 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl22
        block39: while (true) {
            v2 /* !! */  = (long)(nd.hlbm("hlyu", hlbj(int ), (int)161) - nd.hlbm("hlyt", hlbj(int ), (int)160));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1076290759: {
                    break block39;
                }
                case 1777389571: {
                    continue block39;
                }
            }
            break;
        }
        var3_3 = nd.a;
        if (var5_1) {
            throw null;
lbl30:
            // 5 sources

            return (int)nd.hlbm("hlyv", hlbr(int ), (int)242);
        }
        if (var3_3 || var3_3) ** GOTO lbl30
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl37
        block41: while (true) {
            v3 /* !! */  = (long)(nd.hlbm("hlyx", hlbj(int ), (int)163) - nd.hlbm("hlyw", hlbj(int ), (int)162));
lbl37:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1976909275: {
                    continue block41;
                }
                case 1076290759: {
                    break block41;
                }
            }
            break;
        }
        var1_4 = nd.getActiveColorCount();
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl30
                if (var1_4 >= nd.hlbm("hlyy", hlbr(int ), (int)243)) ** GOTO lbl81
                if (var3_3 || var3_3) ** GOTO lbl30
                v4 /* !! */  = nd.oo;
                if (true) ** GOTO lbl53
                block42: while (true) {
                    v4 /* !! */  = (long)(v5 - nd.hlbm("hlyz", hlbj(int ), (int)164));
lbl53:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1315955713: {
                            v5 = nd.hlbm("hlza", hlbj(int ), (int)165);
                            continue block42;
                        }
                        case 1076290759: {
                            break block42;
                        }
                        case 1391520791: {
                            v5 = nd.hlbm("hlzb", hlbj(int ), (int)166);
                            continue block42;
                        }
                    }
                    break;
                }
                var2_5 = nd.clientColors[0];
                if (var3_3 || var3_3) ** GOTO lbl30
                v6 = var2_5 >> nd.hlbm("hlzc", hlbr(int ), (int)244) & nd.hlbm("hlzd", hlbr(int ), (int)245);
                v7 = var2_5 >> nd.hlbm("hlze", hlbr(int ), (int)246) & nd.hlbm("hlzf", hlbr(int ), (int)247);
                v8 = var2_5 & nd.hlbm("hlzg", hlbr(int ), (int)248);
                v9 /* !! */  = nd.oo;
                if (true) ** GOTO lbl71
                block43: while (true) {
                    v9 /* !! */  = (long)(v10 - nd.hlbm("hlzh", hlbj(int ), (int)167));
lbl71:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -480170271: {
                            v10 = nd.hlbm("hlzi", hlbj(int ), (int)168);
                            continue block43;
                        }
                        case 1076290759: {
                            break block43;
                        }
                        case 1298050108: {
                            v10 = nd.hlbm("hlzj", hlbj(int ), (int)169);
                            continue block43;
                        }
                    }
                    break;
                }
                return nd.rgba(v6, v7, v8, var0);
lbl81:
                // 1 sources

                if (var3_3 || var3_3) ** continue;
                v11 = nd.hlbm("hlzl", hlzk(int ), (int)249);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlzm", hlbj(int ), (int)170)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v12 /* !! */  == nd.hlbm("hlzn", hlbr(int ), (int)250)) break;
                    v12 /* !! */  = (long)nd.hlbm("hlzo", hlbr(int ), (int)251);
                }
                return nd.getClientColorAt((float)v11, var0);
            }
lbl90:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzp", hlbr(int ), (int)252);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl95:
            // 3 sources

            case 1: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzq", hlbr(int ), (int)253);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl100:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzr", hlbr(int ), (int)254);
                if (!var5_1) ** GOTO lbl95
                throw null;
            }
            case 3: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzs", hlbr(int ), (int)255);
                if (!var5_1) ** GOTO lbl90
                throw null;
            }
lbl108:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzt", hlbr(int ), (int)256);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl113:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzu", hlbr(int ), (int)257);
                if (!var5_1) ** GOTO lbl95
                throw null;
            }
lbl117:
            // 4 sources

            case 6: {
                do {
                    var4_2 /* !! */  = (int)nd.hlbm("hlzv", hlbr(int ), (int)258);
                } while (!var5_1);
                throw null;
            }
            case 7: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzw", hlbr(int ), (int)259);
                if (!var5_1) ** GOTO lbl117
                throw null;
            }
lbl126:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzx", hlbr(int ), (int)260);
                if (!var5_1) ** GOTO lbl117
                throw null;
            }
            case 9: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzy", hlbr(int ), (int)261);
                if (!var5_1) ** GOTO lbl117
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)nd.hlbm("hlzz", hlbr(int ), (int)262);
                if (!var5_1) ** GOTO lbl100
                throw null;
            }
            case 11: {
                var4_2 /* !! */  = (int)nd.hlbm("hmaa", hlbr(int ), (int)263);
                if (!var5_1) break;
                throw null;
            }
            case 12: 
        }
        do {
            var4_2 /* !! */  = (int)nd.hlbm("hmab", hlbr(int ), (int)264);
        } while (!var5_1);
        throw null;
    }

    private static /* synthetic */ void hpsn() {
        nd.hlbl[600] = -6539528350214787529L;
        nd.hlbl[601] = 2598157570998353686L;
        nd.hlbl[602] = 1217581452388548958L;
        nd.hlbl[603] = -2253456836055054278L;
        nd.hlbl[604] = 2371487934792741105L;
        nd.hlbl[605] = 1219530367019939155L;
        nd.hlbl[606] = 2780016148047517159L;
        nd.hlbl[607] = -5241642135029823174L;
        nd.hlbl[608] = 3657568683847173612L;
        nd.hlbl[609] = 8546262666473645740L;
        nd.hlbl[610] = -3874159797560961697L;
        nd.hlbl[611] = 5861854154395296903L;
        nd.hlbl[612] = -125590766936717979L;
        nd.hlbl[613] = 3383337322909635902L;
        nd.hlbl[614] = -5021601023110462034L;
        nd.hlbl[615] = 1526937757029185709L;
        nd.hlbl[616] = -4281804634473274227L;
        nd.hlbl[617] = -4385013773456410251L;
        nd.hlbl[618] = -8440879066585107657L;
        nd.hlbl[619] = -8855955848933692037L;
        nd.hlbl[620] = -7147748187482221212L;
        nd.hlbl[621] = -6166042823444939317L;
        nd.hlbl[622] = 4410645177078142018L;
        nd.hlbl[623] = -3310919591535829924L;
        nd.hlbl[624] = 6837700353862830793L;
        nd.hlbl[625] = -7869536628075226825L;
        nd.hlbl[626] = -286500871861112354L;
        nd.hlbl[627] = 7245795789073599206L;
        nd.hlbl[628] = 8658018725501510424L;
        nd.hlbl[629] = -6547771541410541864L;
        nd.hlbl[630] = -6184822376292159158L;
        nd.hlbl[631] = -8040736207776227170L;
        nd.hlbl[632] = -1386955408408983851L;
        nd.hlbl[633] = -4364362416248464399L;
        nd.hlbl[634] = 2421920115013623483L;
        nd.hlbl[635] = -4223077667656041385L;
        nd.hlbl[636] = -4729467430935989594L;
        nd.hlbl[637] = -9134190266983619725L;
        nd.hlbl[638] = -4292458589958543201L;
        nd.hlbl[639] = -7569071419494475907L;
        nd.hlbl[640] = -954963212849400513L;
        nd.hlbl[641] = -4668409518819471775L;
        nd.hlbl[642] = -4575766343532303756L;
        nd.hlbl[643] = -1189030563650383015L;
        nd.hlbl[644] = 150568491134985809L;
        nd.hlbl[645] = 8711074969839830785L;
        nd.hlbl[646] = -4735951343569751083L;
        nd.hlbl[647] = -7473641391608889772L;
        nd.hlbl[648] = -4037227619487443070L;
        nd.hlbl[649] = 2384614437668075392L;
        nd.hlbl[650] = -4253418156271619248L;
        nd.hlbl[651] = -900861003289808649L;
        nd.hlbl[652] = -840673965645287162L;
        nd.hlbl[653] = 1631212727533673914L;
        nd.hlbl[654] = -7529003697699632313L;
        nd.hlbl[655] = 7121087857743012075L;
        nd.hlbl[656] = -4477434951248882197L;
        nd.hlbl[657] = 8555632502392226170L;
        nd.hlbl[658] = -3622852244124475173L;
        nd.hlbl[659] = 5589411210427237863L;
        nd.hlbl[660] = -6878913636358083400L;
        nd.hlbl[661] = -4561233558170895707L;
        nd.hlbl[662] = -3029072872480187817L;
        nd.hlbl[663] = -7884776470836786261L;
        nd.hlbl[664] = 7743306846644513940L;
        nd.hlbl[665] = -36250178573957669L;
        nd.hlbl[666] = -2068562292491418614L;
        nd.hlbl[667] = -6619167470246146790L;
        nd.hlbl[668] = -1584517959445811718L;
        nd.hlbl[669] = 490731767452891517L;
        nd.hlbl[670] = 4348220106094846156L;
        nd.hlbl[671] = -5094858832957177044L;
        nd.hlbl[672] = 5248890315754660008L;
        nd.hlbl[673] = -6162339599839209725L;
        nd.hlbl[674] = 8491319199557053511L;
        nd.hlbl[675] = -5217109447603391354L;
        nd.hlbl[676] = -2803082304995320993L;
        nd.hlbl[677] = 1288892981584806223L;
        nd.hlbl[678] = -5524163262987060100L;
        nd.hlbl[679] = 7359164121227682479L;
        nd.hlbl[680] = -7962733222116806260L;
        nd.hlbl[681] = -6640204199493588915L;
        nd.hlbl[682] = 747607518451130940L;
        nd.hlbl[683] = 6047718654425038601L;
        nd.hlbl[684] = -304321341349589760L;
        nd.hlbl[685] = -3580957387171764803L;
        nd.hlbl[686] = -6357962321075464645L;
        nd.hlbl[687] = -2593461223221722481L;
        nd.hlbl[688] = 6316434939466823964L;
        nd.hlbl[689] = -5915383842052219755L;
        nd.hlbl[690] = -8403268396951176585L;
        nd.hlbl[691] = 4496960738926395682L;
        nd.hlbl[692] = 777106485792796296L;
        nd.hlbl[693] = 8768721051578676018L;
    }

    public static /* synthetic */ CallSite hlbm(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void hpqc() {
        nd.hlbk[100] = 6862724157195723366L;
        nd.hlbk[101] = -8275709758553920306L;
        nd.hlbk[102] = -4012331720683352198L;
        nd.hlbk[103] = 7250442769901538441L;
        nd.hlbk[104] = 2008269910918090302L;
        nd.hlbk[105] = 8553796308787352611L;
        nd.hlbk[106] = -6957846097430566993L;
        nd.hlbk[107] = -977057951705987904L;
        nd.hlbk[108] = 1938850867220641888L;
        nd.hlbk[109] = 5827640330000051822L;
        nd.hlbk[110] = -476295220861530921L;
        nd.hlbk[111] = 1541165723150414244L;
        nd.hlbk[112] = 5537071062741824348L;
        nd.hlbk[113] = 7536916561290342010L;
        nd.hlbk[114] = -7655850951175832151L;
        nd.hlbk[115] = 665549707716128395L;
        nd.hlbk[116] = 5471194353511399166L;
        nd.hlbk[117] = 4892080624348143336L;
        nd.hlbk[118] = -8327655861456167171L;
        nd.hlbk[119] = -7839816490334138928L;
        nd.hlbk[120] = 3700808962693202949L;
        nd.hlbk[121] = 8517763645338662558L;
        nd.hlbk[122] = -7805251985509658730L;
        nd.hlbk[123] = -2176240619084121041L;
        nd.hlbk[124] = 3155430117911949503L;
        nd.hlbk[125] = -1509712357947027508L;
        nd.hlbk[126] = -9183875219415409993L;
        nd.hlbk[127] = -3237557319067003971L;
        nd.hlbk[128] = 3211263707199631423L;
        nd.hlbk[129] = 2492980641029117738L;
        nd.hlbk[130] = -5193734179648044618L;
        nd.hlbk[131] = 3461563733124431704L;
        nd.hlbk[132] = 919432261132220232L;
        nd.hlbk[133] = 1151741869791411670L;
        nd.hlbk[134] = 3949486348427063411L;
        nd.hlbk[135] = 5549522228228907060L;
        nd.hlbk[136] = 3124692262237498644L;
        nd.hlbk[137] = -1039005832051021675L;
        nd.hlbk[138] = 5638346811568655123L;
        nd.hlbk[139] = 6966820595055663094L;
        nd.hlbk[140] = -7823184563142521312L;
        nd.hlbk[141] = -8294494125673394898L;
        nd.hlbk[142] = -8357489260791645414L;
        nd.hlbk[143] = -1090167414225610011L;
        nd.hlbk[144] = 4638925992493091221L;
        nd.hlbk[145] = 5256968343161273386L;
        nd.hlbk[146] = 5973608339058456832L;
        nd.hlbk[147] = -928888802008645268L;
        nd.hlbk[148] = -6025376690129758201L;
        nd.hlbk[149] = 4277989769703182126L;
        nd.hlbk[150] = 3691316164854098454L;
        nd.hlbk[151] = 4813485758923831727L;
        nd.hlbk[152] = 2750578033365729099L;
        nd.hlbk[153] = -4079140632371288160L;
        nd.hlbk[154] = -5980921512370975907L;
        nd.hlbk[155] = -2140262628751929805L;
        nd.hlbk[156] = 1447330977209503016L;
        nd.hlbk[157] = 906657667574987173L;
        nd.hlbk[158] = -8731992212149557111L;
        nd.hlbk[159] = -637115575305444667L;
        nd.hlbk[160] = -2861918393221166470L;
        nd.hlbk[161] = 4295326565684202623L;
        nd.hlbk[162] = -1001381129826981889L;
        nd.hlbk[163] = 7110372359919451864L;
        nd.hlbk[164] = -3419662432018958245L;
        nd.hlbk[165] = 80496752744270473L;
        nd.hlbk[166] = -7999315009841056826L;
        nd.hlbk[167] = 5829782746188830352L;
        nd.hlbk[168] = -7169984629342501660L;
        nd.hlbk[169] = 1977096669306569953L;
        nd.hlbk[170] = -4485005090456574138L;
        nd.hlbk[171] = -48193965175610189L;
        nd.hlbk[172] = 8157761001770224596L;
        nd.hlbk[173] = -6212887948479946424L;
        nd.hlbk[174] = -5226165827847721214L;
        nd.hlbk[175] = 1131652248680200485L;
        nd.hlbk[176] = 7197535666212774563L;
        nd.hlbk[177] = 8771992275688879926L;
        nd.hlbk[178] = 4047677364962898827L;
        nd.hlbk[179] = -634931902618097868L;
        nd.hlbk[180] = 7112152379660916374L;
        nd.hlbk[181] = 212023002600456409L;
        nd.hlbk[182] = -7157317352258134769L;
        nd.hlbk[183] = -108906604887288465L;
        nd.hlbk[184] = -3524781191995685096L;
        nd.hlbk[185] = -262108395138351927L;
        nd.hlbk[186] = -2726227417212680720L;
        nd.hlbk[187] = -7509036163899917487L;
        nd.hlbk[188] = 1473399497892090991L;
        nd.hlbk[189] = -462576667004642365L;
        nd.hlbk[190] = 5386733422582093946L;
        nd.hlbk[191] = 4673616241387545316L;
        nd.hlbk[192] = -8001386822423100536L;
        nd.hlbk[193] = -6072156129810783723L;
        nd.hlbk[194] = -7510052317572052360L;
        nd.hlbk[195] = 8468266876920508299L;
        nd.hlbk[196] = 6046455895015292705L;
        nd.hlbk[197] = 6564954323345105719L;
        nd.hlbk[198] = -8992412486913511078L;
        nd.hlbk[199] = 8425882617806665872L;
    }

    private static /* synthetic */ void hprk() {
        nd.hlbk[600] = -8727170800339731507L;
        nd.hlbk[601] = 466265106109277284L;
        nd.hlbk[602] = -1070303522564108790L;
        nd.hlbk[603] = 5300913339655028233L;
        nd.hlbk[604] = 7722418082490639047L;
        nd.hlbk[605] = -3695495381246991211L;
        nd.hlbk[606] = -2278578123541244351L;
        nd.hlbk[607] = 2672339998734236816L;
        nd.hlbk[608] = -746368235443280667L;
        nd.hlbk[609] = -260257610828614025L;
        nd.hlbk[610] = -5341668363402372584L;
        nd.hlbk[611] = 726964552872643479L;
        nd.hlbk[612] = 3201157033914316358L;
        nd.hlbk[613] = 6835155387253114915L;
        nd.hlbk[614] = 4304775826916108457L;
        nd.hlbk[615] = -3084691375098231265L;
        nd.hlbk[616] = 2515202433736112745L;
        nd.hlbk[617] = -3920520273152248119L;
        nd.hlbk[618] = 2075624711292764056L;
        nd.hlbk[619] = 6781608802776619636L;
        nd.hlbk[620] = -4251227526421098097L;
        nd.hlbk[621] = -4645926434168022289L;
        nd.hlbk[622] = 3086762340228052146L;
        nd.hlbk[623] = 787669604751177701L;
        nd.hlbk[624] = -3326495647021342377L;
        nd.hlbk[625] = -791831888723274821L;
        nd.hlbk[626] = 3869909753132186651L;
        nd.hlbk[627] = 3548944855300940718L;
        nd.hlbk[628] = 9073831180998806044L;
        nd.hlbk[629] = 2825263184344109108L;
        nd.hlbk[630] = 7024083949595912346L;
        nd.hlbk[631] = -7663186718378691057L;
        nd.hlbk[632] = 3820207880280096028L;
        nd.hlbk[633] = -9064503870901257790L;
        nd.hlbk[634] = 1710660988658549288L;
        nd.hlbk[635] = 6637027876988517158L;
        nd.hlbk[636] = 814226599574204132L;
        nd.hlbk[637] = -1274454701460291677L;
        nd.hlbk[638] = 356535696052545643L;
        nd.hlbk[639] = -86452806651278357L;
        nd.hlbk[640] = -718129121450745922L;
        nd.hlbk[641] = 3419310241976699368L;
        nd.hlbk[642] = 3528411704709261353L;
        nd.hlbk[643] = -4018594776875490480L;
        nd.hlbk[644] = -9067870444857613916L;
        nd.hlbk[645] = 8785233516464859868L;
        nd.hlbk[646] = 7463696494242750105L;
        nd.hlbk[647] = -2733959474683785779L;
        nd.hlbk[648] = -4169639186853604968L;
        nd.hlbk[649] = 2088423832204701110L;
        nd.hlbk[650] = 6734416377101482498L;
        nd.hlbk[651] = 3544863308864742924L;
        nd.hlbk[652] = 1824124569078617235L;
        nd.hlbk[653] = -6557471733742256918L;
        nd.hlbk[654] = -1894131604211416460L;
        nd.hlbk[655] = 2589583411591673695L;
        nd.hlbk[656] = -1875411068096906311L;
        nd.hlbk[657] = 5401041772536685996L;
        nd.hlbk[658] = -3250202861908466644L;
        nd.hlbk[659] = -806490351550604523L;
        nd.hlbk[660] = -8597301649372839583L;
        nd.hlbk[661] = -2031039498226583992L;
        nd.hlbk[662] = 6661536235939384987L;
        nd.hlbk[663] = 8896111116171266017L;
        nd.hlbk[664] = -8919480301669458536L;
        nd.hlbk[665] = 6030375442361230343L;
        nd.hlbk[666] = 4935660075821260298L;
        nd.hlbk[667] = 6789591487681333419L;
        nd.hlbk[668] = -7249322337712802942L;
        nd.hlbk[669] = -4203404708493342782L;
        nd.hlbk[670] = 1521043226504162006L;
        nd.hlbk[671] = 48277140492317244L;
        nd.hlbk[672] = 6803922140620993974L;
        nd.hlbk[673] = -9122187162945128079L;
        nd.hlbk[674] = 4094855506422676226L;
        nd.hlbk[675] = 4485511836461393862L;
        nd.hlbk[676] = -2881347521037359042L;
        nd.hlbk[677] = 910121575564238083L;
        nd.hlbk[678] = 2619937698997879073L;
        nd.hlbk[679] = -129440496175523019L;
        nd.hlbk[680] = -1939877671085728466L;
        nd.hlbk[681] = -1464960521989964158L;
        nd.hlbk[682] = -1062480716312242860L;
        nd.hlbk[683] = -5058636508186359083L;
        nd.hlbk[684] = 7412976345859861629L;
        nd.hlbk[685] = -6136956248646955075L;
        nd.hlbk[686] = -5403169832422157620L;
        nd.hlbk[687] = -1403494205831538678L;
        nd.hlbk[688] = 1619872007558829671L;
        nd.hlbk[689] = -7560612181303842012L;
        nd.hlbk[690] = -5991700305656882748L;
        nd.hlbk[691] = 7583249727515176290L;
        nd.hlbk[692] = 7114911463933015901L;
        nd.hlbk[693] = -556305450193462705L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getClientColorAt(float var0, int var1_1) {
        block194: {
            block195: {
                block193: {
                    block192: {
                        var18_2 = nd.c;
                        var17_3 /* !! */  = nd.b;
                        var16_4 = nd.a;
                        if (var18_2) {
                            throw null;
lbl6:
                            // 51 sources

                            return (int)nd.hlbm("hmac", hlbr(int ), (int)265);
                        }
                        if (var16_4) ** GOTO lbl6
                        try {
                            block191: {
                                if (var16_4) ** GOTO lbl6
                                var2_5 = gk.getInstance();
                                if (var16_4 || var16_4) ** GOTO lbl6
                                if (var2_5 == null) break block191;
                                if (var16_4 || var16_4) ** GOTO lbl6
                                return var2_5.getColorAt(var0, var1_1);
                            }
                            if (var16_4 || var16_4) ** GOTO lbl6
                            ** if (!var18_2) goto lbl-1000
                        }
                        catch (Throwable var2_6) {
                            if (var16_4) ** GOTO lbl6
                        }
lbl-1000:
                        // 1 sources

                        {
                            throw null;
                        }
lbl-1000:
                        // 1 sources

                        {
                        }
                        if (var16_4 || var16_4) ** GOTO lbl6
                        var2_7 = nd.getActiveColorCount();
                        if (var16_4 || var16_4) ** GOTO lbl6
                        if (var2_7 != 0) break block192;
                        if (var16_4 || var16_4) ** GOTO lbl6
                        return nd.getClientColor(var1_1);
                    }
                    if (var16_4 || var16_4) ** GOTO lbl6
                    if (var2_7 != nd.hlbm("hmad", hlbr(int ), (int)266)) break block193;
                    if (var16_4 || var16_4) ** GOTO lbl6
                    var3_8 = nd.clientColors[0];
                    if (var16_4 || var16_4) ** GOTO lbl6
                    return nd.rgba(var3_8 >> nd.hlbm("hmae", hlbr(int ), (int)267) & nd.hlbm("hmaf", hlbr(int ), (int)268), var3_8 >> nd.hlbm("hmag", hlbr(int ), (int)269) & nd.hlbm("hmah", hlbr(int ), (int)270), var3_8 & nd.hlbm("hmai", hlbr(int ), (int)271), var1_1);
                }
                if (var16_4 || var16_4) ** GOTO lbl6
                if (!nd.clientColorMode.equals("\u041f\u0435\u0440\u0435\u043b\u0438\u0432\u0430\u043d\u0438\u0435")) ** GOTO lbl93
                if (var16_4 || var16_4) ** GOTO lbl6
                var3_9 = System.currentTimeMillis();
                if (var16_4 || var16_4) ** GOTO lbl6
                var5_12 = nd.hlbm("hmaj", hlzk(int ), (int)272);
                if (var16_4 || var16_4) ** GOTO lbl6
                var6_14 = (float)((var3_9 - nd.colorTransitionStart) % (long)var5_12) / var5_12;
                if (var16_4 || var16_4) ** GOTO lbl6
                var7_16 = var0 + var6_14;
                if (var16_4 || var16_4) ** GOTO lbl6
                var8_18 = var7_16 - (float)((int)var7_16);
                if (var16_4 || var16_4) ** GOTO lbl6
                if (var2_7 != nd.hlbm("hmak", hlbr(int ), (int)273)) break block194;
                if (var16_4 || var16_4) ** GOTO lbl6
                var9_19 = nd.clientColors[0];
                if (var16_4 || var16_4) ** GOTO lbl6
                var10_21 = nd.clientColors[1];
                if (var16_4 || var16_4) ** GOTO lbl6
                if (!(var8_18 < nd.hlbm("hmal", hlzk(int ), (int)274))) break block195;
                if (var16_4 || var16_4) ** GOTO lbl6
                return nd.interpolateColor(var9_19, var10_21, var8_18 * 2.0f, var1_1);
            }
            if (var16_4 || var16_4) ** GOTO lbl6
            return nd.interpolateColor(var10_21, var9_19, (var8_18 - nd.hlbm("hmam", hlzk(int ), (int)275)) * 2.0f, var1_1);
        }
        if (var16_4 || var16_4) ** GOTO lbl6
        var9_20 = var2_7;
        if (var16_4 || var16_4) ** GOTO lbl6
        var10_22 = var8_18 * var9_20;
        if (var16_4) ** GOTO lbl6
        if (var17_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var17_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var16_4) ** GOTO lbl6
                var11_23 = (int)var10_22;
                if (var16_4 || var16_4) ** GOTO lbl6
                var12_24 = var10_22 - (float)var11_23;
                if (var16_4 || var16_4) ** GOTO lbl6
                if (var11_23 < var2_7 - nd.hlbm("hman", hlbr(int ), (int)276)) ** GOTO lbl85
                if (var16_4 || var16_4) ** GOTO lbl6
                var13_25 = nd.clientColors[var2_7 - 1];
                if (var16_4 || var16_4) ** GOTO lbl6
                var14_27 = nd.clientColors[0];
                if (var16_4 || var16_4) ** GOTO lbl6
                var15_29 = var10_22 - (float)(var2_7 - nd.hlbm("hmao", hlbr(int ), (int)277));
                if (var16_4 || var16_4) ** GOTO lbl6
                return nd.interpolateColor(var13_25, var14_27, var15_29, var1_1);
lbl85:
                // 1 sources

                if (var16_4 || var16_4) ** GOTO lbl6
                var11_23 = Math.min(var11_23, var2_7 - nd.hlbm("hmap", hlbr(int ), (int)278));
                if (var16_4 || var16_4) ** GOTO lbl6
                var13_26 = nd.clientColors[var11_23];
                if (var16_4 || var16_4) ** GOTO lbl6
                var14_28 = nd.clientColors[var11_23 + 1];
                if (var16_4 || var16_4) ** GOTO lbl6
                return nd.interpolateColor(var13_26, var14_28, var12_24, var1_1);
            }
lbl93:
            // 1 sources

            if (var16_4 || var16_4) ** GOTO lbl6
            var0 = Math.max(0.0f, Math.min(1.0f, var0));
            if (var16_4 || var16_4) ** GOTO lbl6
            if (var2_7 != nd.hlbm("hmaq", hlbr(int ), (int)279)) ** GOTO lbl103
            if (var16_4 || var16_4) ** GOTO lbl6
            var3_10 = nd.clientColors[0];
            if (var16_4 || var16_4) ** GOTO lbl6
            var4_30 = nd.clientColors[1];
            if (var16_4 || var16_4) ** GOTO lbl6
            return nd.interpolateColor(var3_10, var4_30, var0, var1_1);
lbl103:
            // 1 sources

            if (var16_4 || var16_4) ** GOTO lbl6
            var3_11 = 1.0f / (float)(var2_7 - nd.hlbm("hmar", hlbr(int ), (int)280));
            if (var16_4 || var16_4) ** GOTO lbl6
            var4_31 = (int)(var0 / var3_11);
            if (var16_4 || var16_4) ** GOTO lbl6
            var4_31 = Math.min(var4_31, var2_7 - nd.hlbm("hmas", hlbr(int ), (int)281));
            if (var16_4 || var16_4) ** GOTO lbl6
            var5_13 = (var0 - (float)var4_31 * var3_11) / var3_11;
            if (var16_4 || var16_4) ** GOTO lbl6
            var5_13 = Math.max(0.0f, Math.min(1.0f, var5_13));
            if (var16_4 || var16_4) ** GOTO lbl6
            var6_15 = nd.clientColors[var4_31];
            if (var16_4 || var16_4) ** GOTO lbl6
            var7_17 = nd.clientColors[var4_31 + 1];
            if (!var16_4 && !var16_4) ** break;
            ** continue;
            return nd.interpolateColor(var6_15, var7_17, var5_13, var1_1);
            case 0: {
                var17_3 /* !! */  = (int)nd.hlbm("hmat", hlbr(int ), (int)282);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl125:
            // 3 sources

            case 1: {
                var17_3 /* !! */  = (int)nd.hlbm("hmau", hlbr(int ), (int)283);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 2: {
                var17_3 /* !! */  = (int)nd.hlbm("hmav", hlbr(int ), (int)284);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
            case 3: {
                var17_3 /* !! */  = (int)nd.hlbm("hmaw", hlbr(int ), (int)285);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl140:
            // 5 sources

            case 4: {
                var17_3 /* !! */  = (int)nd.hlbm("hmax", hlbr(int ), (int)286);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl494
            }
lbl145:
            // 3 sources

            case 5: {
                var17_3 /* !! */  = (int)nd.hlbm("hmay", hlbr(int ), (int)287);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl539
            }
            case 6: {
                var17_3 /* !! */  = (int)nd.hlbm("hmaz", hlbr(int ), (int)288);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl547
            }
lbl155:
            // 3 sources

            case 7: {
                var17_3 /* !! */  = (int)nd.hlbm("hmba", hlbr(int ), (int)289);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl559
            }
            case 8: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbb", hlbr(int ), (int)290);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl165:
            // 6 sources

            case 9: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbc", hlbr(int ), (int)291);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl434
            }
lbl170:
            // 2 sources

            case 10: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbd", hlbr(int ), (int)292);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl175:
            // 3 sources

            case 11: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbe", hlbr(int ), (int)293);
                if (var18_2) {
                    throw null;
                }
            }
lbl179:
            // 4 sources

            case 12: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbf", hlbr(int ), (int)294);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 13: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbg", hlbr(int ), (int)295);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl551
            }
            case 14: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbh", hlbr(int ), (int)296);
                if (!var18_2) ** GOTO lbl175
                throw null;
            }
lbl193:
            // 3 sources

            case 15: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbi", hlbr(int ), (int)297);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl502
            }
lbl198:
            // 2 sources

            case 16: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbj", hlbr(int ), (int)298);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 17: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbk", hlbr(int ), (int)299);
                if (!var18_2) ** GOTO lbl145
                throw null;
            }
            case 18: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbl", hlbr(int ), (int)300);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 19: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbm", hlbr(int ), (int)301);
                if (!var18_2) ** GOTO lbl140
                throw null;
            }
lbl216:
            // 4 sources

            case 20: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbn", hlbr(int ), (int)302);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl221:
            // 4 sources

            case 21: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbo", hlbr(int ), (int)303);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl510
            }
lbl226:
            // 3 sources

            case 22: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbp", hlbr(int ), (int)304);
                if (!var18_2) ** GOTO lbl145
                throw null;
            }
lbl230:
            // 4 sources

            case 23: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbq", hlbr(int ), (int)305);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl530
            }
            case 24: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbr", hlbr(int ), (int)306);
                if (!var18_2) ** GOTO lbl155
                throw null;
            }
lbl239:
            // 3 sources

            case 25: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbs", hlbr(int ), (int)307);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl361
            }
lbl244:
            // 4 sources

            case 26: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbt", hlbr(int ), (int)308);
                if (!var18_2) ** GOTO lbl140
                throw null;
            }
lbl248:
            // 2 sources

            case 27: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbu", hlbr(int ), (int)309);
                if (!var18_2) ** GOTO lbl193
                throw null;
            }
lbl252:
            // 2 sources

            case 28: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbv", hlbr(int ), (int)310);
                if (!var18_2) ** GOTO lbl165
                throw null;
            }
lbl256:
            // 2 sources

            case 29: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbw", hlbr(int ), (int)311);
                if (!var18_2) ** GOTO lbl170
                throw null;
            }
lbl260:
            // 2 sources

            case 30: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbx", hlbr(int ), (int)312);
                if (!var18_2) ** GOTO lbl198
                throw null;
            }
            case 31: {
                var17_3 /* !! */  = (int)nd.hlbm("hmby", hlbr(int ), (int)313);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl269:
            // 3 sources

            case 32: {
                var17_3 /* !! */  = (int)nd.hlbm("hmbz", hlbr(int ), (int)314);
                if (!var18_2) ** GOTO lbl260
                throw null;
            }
lbl273:
            // 2 sources

            case 33: {
                var17_3 /* !! */  = (int)nd.hlbm("hmca", hlbr(int ), (int)315);
                if (!var18_2) ** GOTO lbl256
                throw null;
            }
lbl277:
            // 2 sources

            case 34: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcb", hlbr(int ), (int)316);
                if (!var18_2) ** GOTO lbl179
                throw null;
            }
            case 35: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcc", hlbr(int ), (int)317);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl286:
            // 2 sources

            case 36: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcd", hlbr(int ), (int)318);
                if (!var18_2) ** GOTO lbl252
                throw null;
            }
            case 37: {
                var17_3 /* !! */  = (int)nd.hlbm("hmce", hlbr(int ), (int)319);
                if (!var18_2) ** GOTO lbl165
                throw null;
            }
            case 38: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcf", hlbr(int ), (int)320);
                if (!var18_2) ** GOTO lbl226
                throw null;
            }
lbl298:
            // 3 sources

            case 39: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcg", hlbr(int ), (int)321);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl551
            }
            case 40: {
                do {
                    var17_3 /* !! */  = (int)nd.hlbm("hmch", hlbr(int ), (int)322);
                } while (!var18_2);
                throw null;
            }
            case 41: {
                var17_3 /* !! */  = (int)nd.hlbm("hmci", hlbr(int ), (int)323);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl322
            }
lbl313:
            // 2 sources

            case 42: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcj", hlbr(int ), (int)324);
                if (!var18_2) ** GOTO lbl277
                throw null;
            }
lbl317:
            // 2 sources

            case 43: {
                var17_3 /* !! */  = (int)nd.hlbm("hmck", hlbr(int ), (int)325);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl339
            }
lbl322:
            // 2 sources

            case 44: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcl", hlbr(int ), (int)326);
                if (!var18_2) ** GOTO lbl125
                throw null;
            }
lbl326:
            // 2 sources

            case 45: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcm", hlbr(int ), (int)327);
                if (!var18_2) ** GOTO lbl155
                throw null;
            }
lbl330:
            // 3 sources

            case 46: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcn", hlbr(int ), (int)328);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl335:
            // 2 sources

            case 47: {
                var17_3 /* !! */  = (int)nd.hlbm("hmco", hlbr(int ), (int)329);
                if (!var18_2) ** GOTO lbl239
                throw null;
            }
lbl339:
            // 2 sources

            case 48: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcp", hlbr(int ), (int)330);
                if (!var18_2) ** GOTO lbl317
                throw null;
            }
            case 49: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcq", hlbr(int ), (int)331);
                if (!var18_2) ** GOTO lbl125
                throw null;
            }
lbl347:
            // 2 sources

            case 50: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcr", hlbr(int ), (int)332);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl563
            }
lbl352:
            // 3 sources

            case 51: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcs", hlbr(int ), (int)333);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl494
            }
            case 52: {
                var17_3 /* !! */  = (int)nd.hlbm("hmct", hlbr(int ), (int)334);
                if (!var18_2) ** GOTO lbl221
                throw null;
            }
lbl361:
            // 2 sources

            case 53: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcu", hlbr(int ), (int)335);
                if (!var18_2) ** GOTO lbl286
                throw null;
            }
lbl365:
            // 2 sources

            case 54: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcv", hlbr(int ), (int)336);
                if (!var18_2) ** GOTO lbl193
                throw null;
            }
lbl369:
            // 2 sources

            case 55: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcw", hlbr(int ), (int)337);
                if (!var18_2) ** GOTO lbl226
                throw null;
            }
            case 56: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcx", hlbr(int ), (int)338);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl559
            }
lbl378:
            // 2 sources

            case 57: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcy", hlbr(int ), (int)339);
                if (!var18_2) ** GOTO lbl239
                throw null;
            }
lbl382:
            // 2 sources

            case 58: {
                var17_3 /* !! */  = (int)nd.hlbm("hmcz", hlbr(int ), (int)340);
                if (!var18_2) ** GOTO lbl269
                throw null;
            }
            case 59: {
                var17_3 /* !! */  = (int)nd.hlbm("hmda", hlbr(int ), (int)341);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl396
            }
lbl391:
            // 3 sources

            case 60: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdb", hlbr(int ), (int)342);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl464
            }
lbl396:
            // 2 sources

            case 61: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdc", hlbr(int ), (int)343);
                if (!var18_2) ** GOTO lbl221
                throw null;
            }
            case 62: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdd", hlbr(int ), (int)344);
                if (!var18_2) ** GOTO lbl165
                throw null;
            }
lbl404:
            // 3 sources

            case 63: {
                var17_3 /* !! */  = (int)nd.hlbm("hmde", hlbr(int ), (int)345);
                if (!var18_2) ** GOTO lbl140
                throw null;
            }
            case 64: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdf", hlbr(int ), (int)346);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl473
            }
            case 65: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdg", hlbr(int ), (int)347);
                if (!var18_2) ** GOTO lbl244
                throw null;
            }
            case 66: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdh", hlbr(int ), (int)348);
                if (!var18_2) ** GOTO lbl298
                throw null;
            }
            case 67: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdi", hlbr(int ), (int)349);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl510
            }
            case 68: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdj", hlbr(int ), (int)350);
                if (!var18_2) ** GOTO lbl298
                throw null;
            }
            case 69: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdk", hlbr(int ), (int)351);
                if (!var18_2) ** GOTO lbl165
                throw null;
            }
lbl434:
            // 3 sources

            case 70: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdl", hlbr(int ), (int)352);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl494
            }
            case 71: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdm", hlbr(int ), (int)353);
                if (!var18_2) ** GOTO lbl404
                throw null;
            }
lbl443:
            // 3 sources

            case 72: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdn", hlbr(int ), (int)354);
                if (!var18_2) ** GOTO lbl365
                throw null;
            }
lbl447:
            // 2 sources

            case 73: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdo", hlbr(int ), (int)355);
                if (!var18_2) ** GOTO lbl347
                throw null;
            }
lbl451:
            // 2 sources

            case 74: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdp", hlbr(int ), (int)356);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl502
            }
            case 75: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdq", hlbr(int ), (int)357);
                if (!var18_2) ** GOTO lbl230
                throw null;
            }
            case 76: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdr", hlbr(int ), (int)358);
                if (!var18_2) ** GOTO lbl230
                throw null;
            }
lbl464:
            // 2 sources

            case 77: {
                var17_3 /* !! */  = (int)nd.hlbm("hmds", hlbr(int ), (int)359);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl498
            }
lbl469:
            // 2 sources

            case 78: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdt", hlbr(int ), (int)360);
                if (!var18_2) ** GOTO lbl221
                throw null;
            }
lbl473:
            // 2 sources

            case 79: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdu", hlbr(int ), (int)361);
                if (!var18_2) ** GOTO lbl382
                throw null;
            }
            case 80: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdv", hlbr(int ), (int)362);
                if (!var18_2) ** GOTO lbl326
                throw null;
            }
            case 81: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdw", hlbr(int ), (int)363);
                if (var18_2) {
                    throw null;
                }
                ** GOTO lbl490
            }
            case 82: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdx", hlbr(int ), (int)364);
                if (!var18_2) ** GOTO lbl165
                throw null;
            }
lbl490:
            // 2 sources

            case 83: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdy", hlbr(int ), (int)365);
                if (!var18_2) ** GOTO lbl230
                throw null;
            }
lbl494:
            // 4 sources

            case 84: {
                var17_3 /* !! */  = (int)nd.hlbm("hmdz", hlbr(int ), (int)366);
                if (!var18_2) ** GOTO lbl469
                throw null;
            }
lbl498:
            // 3 sources

            case 85: {
                var17_3 /* !! */  = (int)nd.hlbm("hmea", hlbr(int ), (int)367);
                if (!var18_2) ** GOTO lbl434
                throw null;
            }
lbl502:
            // 4 sources

            case 86: {
                var17_3 /* !! */  = (int)nd.hlbm("hmeb", hlbr(int ), (int)368);
                if (!var18_2) ** GOTO lbl498
                throw null;
            }
            case 87: {
                var17_3 /* !! */  = (int)nd.hlbm("hmec", hlbr(int ), (int)369);
                if (!var18_2) ** GOTO lbl313
                throw null;
            }
lbl510:
            // 3 sources

            case 88: {
                var17_3 /* !! */  = (int)nd.hlbm("hmed", hlbr(int ), (int)370);
                if (!var18_2) ** GOTO lbl451
                throw null;
            }
lbl514:
            // 2 sources

            case 89: {
                var17_3 /* !! */  = (int)nd.hlbm("hmee", hlbr(int ), (int)371);
                if (!var18_2) ** GOTO lbl404
                throw null;
            }
            case 90: {
                var17_3 /* !! */  = (int)nd.hlbm("hmef", hlbr(int ), (int)372);
                if (!var18_2) ** GOTO lbl216
                throw null;
            }
            case 91: {
                var17_3 /* !! */  = (int)nd.hlbm("hmeg", hlbr(int ), (int)373);
                if (!var18_2) ** GOTO lbl140
                throw null;
            }
            case 92: {
                var17_3 /* !! */  = (int)nd.hlbm("hmeh", hlbr(int ), (int)374);
                if (!var18_2) ** GOTO lbl330
                throw null;
            }
lbl530:
            // 2 sources

            case 93: {
                var17_3 /* !! */  = (int)nd.hlbm("hmei", hlbr(int ), (int)375);
                if (!var18_2) ** GOTO lbl447
                throw null;
            }
lbl534:
            // 2 sources

            case 94: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var17_3 /* !! */  = (int)nd.hlbm("hmej", hlbr(int ), (int)376);
                    if (!var18_2) ** GOTO lbl244
                    throw null;
                }
            }
lbl539:
            // 2 sources

            case 95: {
                var17_3 /* !! */  = (int)nd.hlbm("hmek", hlbr(int ), (int)377);
                if (!var18_2) ** GOTO lbl534
                throw null;
            }
            case 96: {
                var17_3 /* !! */  = (int)nd.hlbm("hmel", hlbr(int ), (int)378);
                if (!var18_2) ** GOTO lbl514
                throw null;
            }
lbl547:
            // 2 sources

            case 97: {
                var17_3 /* !! */  = (int)nd.hlbm("hmem", hlbr(int ), (int)379);
                if (!var18_2) ** GOTO lbl502
                throw null;
            }
lbl551:
            // 3 sources

            case 98: {
                var17_3 /* !! */  = (int)nd.hlbm("hmen", hlbr(int ), (int)380);
                if (!var18_2) ** GOTO lbl216
                throw null;
            }
            case 99: {
                var17_3 /* !! */  = (int)nd.hlbm("hmeo", hlbr(int ), (int)381);
                if (!var18_2) ** GOTO lbl443
                throw null;
            }
lbl559:
            // 3 sources

            case 100: {
                var17_3 /* !! */  = (int)nd.hlbm("hmep", hlbr(int ), (int)382);
                if (!var18_2) ** GOTO lbl335
                throw null;
            }
lbl563:
            // 2 sources

            case 101: {
                var17_3 /* !! */  = (int)nd.hlbm("hmeq", hlbr(int ), (int)383);
                if (!var18_2) ** GOTO lbl244
                throw null;
            }
            case 102: 
        }
        var17_3 /* !! */  = (int)nd.hlbm("hmer", hlbr(int ), (int)384);
        ** while (!var18_2)
lbl570:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int interpolateInt(int var0, int var1_1, double var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnrx", hlbj(int ), (int)390)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hnry", hlbr(int ), (int)929)) break;
            v0 /* !! */  = (long)nd.hlbm("hnrz", hlbr(int ), (int)930);
        }
        var6_3 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl11
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hnsa", hlbj(int ), (int)391));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1802039463: {
                    v2 = nd.hlbm("hnsb", hlbj(int ), (int)392);
                    continue block18;
                }
                case 175801730: {
                    v2 = nd.hlbm("hnsc", hlbj(int ), (int)393);
                    continue block18;
                }
                case 1076290759: {
                    break block18;
                }
                case 1749167601: {
                    v2 = nd.hlbm("hnsd", hlbj(int ), (int)394);
                    continue block18;
                }
            }
            break;
        }
        var5_4 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnse", hlbj(int ), (int)395)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nd.hlbm("hnsf", hlbr(int ), (int)931)) break;
            v3 /* !! */  = (long)nd.hlbm("hnsg", hlbr(int ), (int)932);
        }
        var4_5 = nd.a;
        if (var6_3) {
            throw null;
lbl32:
            // 1 sources

            return (int)nd.hlbm("hnsh", hlbr(int ), (int)933);
        }
        ** while (var4_5 || var4_5)
lbl35:
        // 1 sources

        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 = var0;
                v5 = var1_1;
                v6 = (float)var2_2;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnsi", hlbj(int ), (int)396)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nd.hlbm("hnsj", hlbr(int ), (int)934)) break;
                    v7 /* !! */  = (long)nd.hlbm("hnsk", hlbr(int ), (int)935);
                }
                v8 = nd.interpolateD(v4, v5, v6);
                v9 /* !! */  = nd.oo;
                if (true) ** GOTO lbl51
                block22: while (true) {
                    v9 /* !! */  = (long)(v10 - nd.hlbm("hnsl", hlbj(int ), (int)397));
lbl51:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1431702858: {
                            v10 = nd.hlbm("hnsm", hlbj(int ), (int)398);
                            continue block22;
                        }
                        case -759890849: {
                            v10 = nd.hlbm("hnsn", hlbj(int ), (int)399);
                            continue block22;
                        }
                        case 1076290759: {
                            break block22;
                        }
                    }
                    break;
                }
                return v8.intValue();
            }
            case 0: {
                var5_4 /* !! */  = (int)nd.hlbm("hnso", hlbr(int ), (int)936);
                if (var6_3) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var5_4 /* !! */  = (int)nd.hlbm("hnsp", hlbr(int ), (int)937);
                } while (!var6_3);
                throw null;
            }
            case 2: {
                do {
                    var5_4 /* !! */  = (int)nd.hlbm("hnsq", hlbr(int ), (int)938);
                } while (!var6_3);
                throw null;
            }
            case 3: 
        }
        do {
            var5_4 /* !! */  = (int)nd.hlbm("hnsr", hlbr(int ), (int)939);
        } while (!var6_3);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setClientColors(int[] var0) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block42: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hlsg", hlbj(int ), (int)119) - nd.hlbm("hlsf", hlbj(int ), (int)118));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -155852459: {
                    continue block42;
                }
                case 1076290759: {
                    break block42;
                }
            }
            break;
        }
        var4_1 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlsh", hlbj(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nd.hlbm("hlsi", hlbr(int ), (int)114)) break;
            v1 /* !! */  = (long)nd.hlbm("hlsj", hlbr(int ), (int)115);
        }
        var3_2 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlsk", hlbj(int ), (int)121)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nd.hlbm("hlsl", hlbr(int ), (int)116)) break;
            v2 /* !! */  = (long)nd.hlbm("hlsm", hlbr(int ), (int)117);
        }
        var2_3 = nd.a;
        if (var4_1) {
            throw null;
lbl25:
            // 12 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl25
        if (var0 == null) ** GOTO lbl97
        if (var2_3) ** GOTO lbl25
        if (var0.length <= 0) ** GOTO lbl97
        if (var2_3 || var2_3) ** GOTO lbl25
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 = new int[3];
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hlsn", hlbj(int ), (int)122)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nd.hlbm("hlso", hlbr(int ), (int)118)) break;
                    v4 /* !! */  = (long)nd.hlbm("hlsp", hlbr(int ), (int)119);
                }
                nd.clientColors = v3;
                if (var2_3 || var2_3) ** GOTO lbl25
                var1_4 = nd.hlbm("hlsq", hlbr(int ), (int)120);
                if (var2_3) ** GOTO lbl25
                do {
                    if (var2_3 || var2_3) ** GOTO lbl25
                    v5 = var0.length;
                    v6 = nd.hlbm("hlsr", hlbr(int ), (int)121);
                    v7 /* !! */  = nd.oo;
                    if (true) ** GOTO lbl53
                    block48: while (true) {
                        v7 /* !! */  = (long)(nd.hlbm("hlst", hlbj(int ), (int)124) - nd.hlbm("hlss", hlbj(int ), (int)123));
lbl53:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -96243257: {
                                continue block48;
                            }
                            case 1076290759: {
                                break block48;
                            }
                        }
                        break;
                    }
                    if (var1_4 >= Math.min(v5, (int)v6)) ** GOTO lbl79
                    if (var2_3 || var2_3) ** GOTO lbl25
                    v8 /* !! */  = nd.oo;
                    if (true) ** GOTO lbl64
                    block49: while (true) {
                        v8 /* !! */  = (long)(v9 - nd.hlbm("hlsu", hlbj(int ), (int)125));
lbl64:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1034242961: {
                                v9 = nd.hlbm("hlsv", hlbj(int ), (int)126);
                                continue block49;
                            }
                            case -63521885: {
                                v9 = nd.hlbm("hlsw", hlbj(int ), (int)127);
                                continue block49;
                            }
                            case 1076290759: {
                                break block49;
                            }
                        }
                        break;
                    }
                    nd.clientColors[var1_4] = var0[var1_4];
                    if (var2_3 || var2_3) ** GOTO lbl25
                    ++var1_4;
                    if (var2_3) ** GOTO lbl25
                } while (!var4_1);
                throw null;
lbl79:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl25
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hlsx", hlbj(int ), (int)128)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nd.hlbm("hlsy", hlbr(int ), (int)122)) break;
                    v10 /* !! */  = (long)nd.hlbm("hlsz", hlbr(int ), (int)123);
                }
                v11 = System.currentTimeMillis();
                v12 /* !! */  = nd.oo;
                if (true) ** GOTO lbl90
                block51: while (true) {
                    v12 /* !! */  = (long)(nd.hlbm("hltb", hlbj(int ), (int)130) - nd.hlbm("hlta", hlbj(int ), (int)129));
lbl90:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 451496154: {
                            continue block51;
                        }
                        case 1076290759: {
                            break block51;
                        }
                    }
                    break;
                }
                nd.colorTransitionStart = v11;
                if (var2_3) ** GOTO lbl25
lbl97:
                // 3 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)nd.hlbm("hltc", hlbr(int ), (int)124);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 1: {
                var3_2 /* !! */  = (int)nd.hlbm("hltd", hlbr(int ), (int)125);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl110:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)nd.hlbm("hlte", hlbr(int ), (int)126);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl115:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)nd.hlbm("hltf", hlbr(int ), (int)127);
                if (!var4_1) break;
                throw null;
            }
lbl119:
            // 5 sources

            case 4: {
                var3_2 /* !! */  = (int)nd.hlbm("hltg", hlbr(int ), (int)128);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl124:
            // 4 sources

            case 5: {
                var3_2 /* !! */  = (int)nd.hlbm("hlth", hlbr(int ), (int)129);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 6: {
                var3_2 /* !! */  = (int)nd.hlbm("hlti", hlbr(int ), (int)130);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl134:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)nd.hlbm("hltj", hlbr(int ), (int)131);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl139:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)nd.hlbm("hltk", hlbr(int ), (int)132);
                if (!var4_1) ** GOTO lbl134
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)nd.hlbm("hltl", hlbr(int ), (int)133);
                if (!var4_1) ** GOTO lbl139
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)nd.hlbm("hltm", hlbr(int ), (int)134);
                if (!var4_1) ** GOTO lbl115
                throw null;
            }
lbl151:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)nd.hlbm("hltn", hlbr(int ), (int)135);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 12: {
                var3_2 /* !! */  = (int)nd.hlbm("hlto", hlbr(int ), (int)136);
                if (!var4_1) ** GOTO lbl119
                throw null;
            }
lbl160:
            // 4 sources

            case 13: {
                var3_2 /* !! */  = (int)nd.hlbm("hltp", hlbr(int ), (int)137);
                if (!var4_1) ** GOTO lbl110
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)nd.hlbm("hltq", hlbr(int ), (int)138);
                    if (!var4_1) ** GOTO lbl124
                    throw null;
                }
            }
lbl169:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)nd.hlbm("hltr", hlbr(int ), (int)139);
                if (!var4_1) ** GOTO lbl119
                throw null;
            }
lbl173:
            // 2 sources

            case 16: {
                var3_2 /* !! */  = (int)nd.hlbm("hlts", hlbr(int ), (int)140);
                if (!var4_1) ** GOTO lbl124
                throw null;
            }
            case 17: {
                var3_2 /* !! */  = (int)nd.hlbm("hltt", hlbr(int ), (int)141);
                if (!var4_1) ** GOTO lbl169
                throw null;
            }
lbl181:
            // 2 sources

            case 18: {
                var3_2 /* !! */  = (int)nd.hlbm("hltu", hlbr(int ), (int)142);
                if (!var4_1) ** GOTO lbl160
                throw null;
            }
lbl185:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)nd.hlbm("hltv", hlbr(int ), (int)143);
                if (!var4_1) ** GOTO lbl119
                throw null;
            }
lbl189:
            // 2 sources

            case 20: {
                var3_2 /* !! */  = (int)nd.hlbm("hltw", hlbr(int ), (int)144);
                if (!var4_1) ** GOTO lbl160
                throw null;
            }
            case 21: {
                var3_2 /* !! */  = (int)nd.hlbm("hltx", hlbr(int ), (int)145);
                if (!var4_1) ** GOTO lbl110
                throw null;
            }
            case 22: 
        }
        var3_2 /* !! */  = (int)nd.hlbm("hlty", hlbr(int ), (int)146);
        ** while (!var4_1)
lbl200:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int getColor(int n2, int n3, int n4, int n5) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = oo - nd.hlbm("hlrp", hlbj(int ), (int)113)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == nd.hlbm("hlrq", hlbr(int ), (int)103)) break;
            object = nd.hlbm("hlrr", hlbr(int ), (int)104);
        }
        boolean bl3 = c;
        Object object = oo;
        block5: while (true) {
            switch ((int)object) {
                case 453447674: {
                    object = nd.hlbm("hlrt", hlbj(int ), (int)115) - nd.hlbm("hlrs", hlbj(int ), (int)114);
                    continue block5;
                }
                case 1076290759: {
                    break block5;
                }
            }
            break;
        }
        int n6 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = oo - nd.hlbm("hlru", hlbj(int ), (int)116)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == nd.hlbm("hlrv", hlbr(int ), (int)105)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = nd.hlbm("hlrw", hlbr(int ), (int)106);
        }
        if (bl2) return (int)nd.hlbm("hlrx", hlbr(int ), (int)107);
        if (bl2) return (int)nd.hlbm("hlrx", hlbr(int ), (int)107);
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = oo - nd.hlbm("hlry", hlbj(int ), (int)117)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == nd.hlbm("hlrz", hlbr(int ), (int)108)) {
                return nd.computeColor(n2, n3, n4, n5);
            }
            object3 = nd.hlbm("hlsa", hlbr(int ), (int)109);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int rgba(int var0, int var1_1, int var2_2, int var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnfd", hlbj(int ), (int)271)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hnfe", hlbr(int ), (int)716)) break;
            v0 /* !! */  = (long)nd.hlbm("hnff", hlbr(int ), (int)717);
        }
        var6_4 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hnfg", hlbj(int ), (int)272));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -958638528: {
                    v2 = nd.hlbm("hnfh", hlbj(int ), (int)273);
                    continue block12;
                }
                case -497901812: {
                    v2 = nd.hlbm("hnfi", hlbj(int ), (int)274);
                    continue block12;
                }
                case 1076290759: {
                    break block12;
                }
            }
            break;
        }
        var5_5 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnfj", hlbj(int ), (int)275)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nd.hlbm("hnfk", hlbr(int ), (int)718)) break;
            v3 /* !! */  = (long)nd.hlbm("hnfl", hlbr(int ), (int)719);
        }
        var4_6 = nd.a;
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) {
                    throw null;
                    return (int)nd.hlbm("hnfm", hlbr(int ), (int)720);
                }
                if (var4_6 || var4_6) ** continue;
                return var3_3 << nd.hlbm("hnfn", hlbr(int ), (int)721) | var0 << nd.hlbm("hnfo", hlbr(int ), (int)722) | var1_1 << nd.hlbm("hnfp", hlbr(int ), (int)723) | var2_2;
            }
            case 0: {
                var5_5 /* !! */  = (int)nd.hlbm("hnfq", hlbr(int ), (int)724);
                if (var6_4) {
                    throw null;
                }
            }
            case 1: {
                var5_5 /* !! */  = (int)nd.hlbm("hnfr", hlbr(int ), (int)725);
                if (var6_4) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)nd.hlbm("hnfs", hlbr(int ), (int)726);
                    if (!var6_4) break block5;
                    throw null;
                }
            }
            case 3: 
        }
        var5_5 /* !! */  = (int)nd.hlbm("hnft", hlbr(int ), (int)727);
        ** while (!var6_4)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hpoe() {
        nd.hlbt[900] = -1033883354;
        nd.hlbt[901] = 1616051310;
        nd.hlbt[902] = 1104113936;
        nd.hlbt[903] = -1800867940;
        nd.hlbt[904] = 450843465;
        nd.hlbt[905] = -1304218699;
        nd.hlbt[906] = -103814034;
        nd.hlbt[907] = -1178546270;
        nd.hlbt[908] = 1881245268;
        nd.hlbt[909] = -1514104751;
        nd.hlbt[910] = -192026678;
        nd.hlbt[911] = 2100471583;
        nd.hlbt[912] = 73422965;
        nd.hlbt[913] = 1220408984;
        nd.hlbt[914] = -1763578214;
        nd.hlbt[915] = -364301383;
        nd.hlbt[916] = -1076159031;
        nd.hlbt[917] = 2036408859;
        nd.hlbt[918] = 1932929223;
        nd.hlbt[919] = -1315087445;
        nd.hlbt[920] = -1612786126;
        nd.hlbt[921] = -62109466;
        nd.hlbt[922] = 1648223907;
        nd.hlbt[923] = 870972581;
        nd.hlbt[924] = 285613164;
        nd.hlbt[925] = 420656901;
        nd.hlbt[926] = -1106937829;
        nd.hlbt[927] = 1595098353;
        nd.hlbt[928] = 178287202;
        nd.hlbt[929] = 602405590;
        nd.hlbt[930] = 1615953598;
        nd.hlbt[931] = 1868664593;
        nd.hlbt[932] = 904336466;
        nd.hlbt[933] = 2129517783;
        nd.hlbt[934] = -1772675774;
        nd.hlbt[935] = -496847361;
        nd.hlbt[936] = -1612977452;
        nd.hlbt[937] = 1015295863;
        nd.hlbt[938] = -1049113513;
        nd.hlbt[939] = 900498624;
        nd.hlbt[940] = 1450469116;
        nd.hlbt[941] = -354901906;
        nd.hlbt[942] = 505013705;
        nd.hlbt[943] = -339570295;
        nd.hlbt[944] = -1517833848;
        nd.hlbt[945] = -84817447;
        nd.hlbt[946] = 744299579;
        nd.hlbt[947] = 1275608607;
        nd.hlbt[948] = -109792721;
        nd.hlbt[949] = -2067102771;
        nd.hlbt[950] = 415621806;
        nd.hlbt[951] = 1744490987;
        nd.hlbt[952] = 365043484;
        nd.hlbt[953] = -977496720;
        nd.hlbt[954] = -27961768;
        nd.hlbt[955] = 1975115318;
        nd.hlbt[956] = -668989282;
        nd.hlbt[957] = 859766141;
        nd.hlbt[958] = 1866762350;
        nd.hlbt[959] = -2015419403;
        nd.hlbt[960] = 661707797;
        nd.hlbt[961] = -423606161;
        nd.hlbt[962] = -155372499;
        nd.hlbt[963] = -2035531283;
        nd.hlbt[964] = 1042178534;
        nd.hlbt[965] = -487409218;
        nd.hlbt[966] = 1980650486;
        nd.hlbt[967] = 1629059974;
        nd.hlbt[968] = -1150445721;
        nd.hlbt[969] = 842068247;
        nd.hlbt[970] = -874712790;
        nd.hlbt[971] = 52060049;
        nd.hlbt[972] = 1384588738;
        nd.hlbt[973] = 1169186189;
        nd.hlbt[974] = 1335379026;
        nd.hlbt[975] = -278133256;
        nd.hlbt[976] = -910095086;
        nd.hlbt[977] = -2060866922;
        nd.hlbt[978] = -584122843;
        nd.hlbt[979] = -756752568;
        nd.hlbt[980] = 112076314;
        nd.hlbt[981] = -1952775517;
        nd.hlbt[982] = 552130860;
        nd.hlbt[983] = -1170378558;
        nd.hlbt[984] = 991864397;
        nd.hlbt[985] = -1773125578;
        nd.hlbt[986] = 256875821;
        nd.hlbt[987] = 850026154;
        nd.hlbt[988] = -377386103;
        nd.hlbt[989] = 1361149000;
        nd.hlbt[990] = -186855319;
        nd.hlbt[991] = -1453658100;
        nd.hlbt[992] = 1539456613;
        nd.hlbt[993] = -1254824985;
        nd.hlbt[994] = -899594110;
        nd.hlbt[995] = -1736878422;
        nd.hlbt[996] = -1636233413;
        nd.hlbt[997] = 1013118240;
        nd.hlbt[998] = 464836102;
        nd.hlbt[999] = -1311706688;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int blue(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlon", hlbj(int ), (int)79)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hloo", hlbr(int ), (int)57)) break;
            v0 /* !! */  = (long)nd.hlbm("hlop", hlbr(int ), (int)58);
        }
        var3_1 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hloq", hlbj(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nd.hlbm("hlor", hlbr(int ), (int)59)) break;
            v1 /* !! */  = (long)nd.hlbm("hlos", hlbr(int ), (int)60);
        }
        var2_2 /* !! */  = nd.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = nd.oo;
                if (true) ** GOTO lbl22
                block12: while (true) {
                    v2 /* !! */  = (long)(nd.hlbm("hlou", hlbj(int ), (int)82) - nd.hlbm("hlot", hlbj(int ), (int)81));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1716941679: {
                            continue block12;
                        }
                        case 1076290759: {
                            break block12;
                        }
                    }
                    break;
                }
                var1_3 = nd.a;
                if (var3_1) {
                    throw null;
                    return (int)nd.hlbm("hlov", hlbr(int ), (int)61);
                }
                if (var1_3 || var1_3) ** continue;
                return var0 & nd.hlbm("hlow", hlbr(int ), (int)62);
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)nd.hlbm("hlox", hlbr(int ), (int)63);
                } while (!var3_1);
                throw null;
            }
lbl39:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)nd.hlbm("hloy", hlbr(int ), (int)64);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nd.hlbm("hloz", hlbr(int ), (int)65);
                if (!var3_1) ** GOTO lbl39
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)nd.hlbm("hlpa", hlbr(int ), (int)66);
        } while (!var3_1);
        throw null;
    }

    public nd() {
    }

    private static /* synthetic */ void hpne() {
        nd.hlbt[500] = 1007350699;
        nd.hlbt[501] = 1277720885;
        nd.hlbt[502] = -397002890;
        nd.hlbt[503] = -40770321;
        nd.hlbt[504] = 2050525501;
        nd.hlbt[505] = 773513589;
        nd.hlbt[506] = 597230987;
        nd.hlbt[507] = -1552120868;
        nd.hlbt[508] = -1388817549;
        nd.hlbt[509] = 588829186;
        nd.hlbt[510] = 307978837;
        nd.hlbt[511] = -1381399578;
        nd.hlbt[512] = 253971906;
        nd.hlbt[513] = -1172712665;
        nd.hlbt[514] = 1445149084;
        nd.hlbt[515] = -1225399577;
        nd.hlbt[516] = -1235919850;
        nd.hlbt[517] = 1738652911;
        nd.hlbt[518] = -901306554;
        nd.hlbt[519] = -180163368;
        nd.hlbt[520] = 1001458126;
        nd.hlbt[521] = -970463396;
        nd.hlbt[522] = -1263532117;
        nd.hlbt[523] = -1394664635;
        nd.hlbt[524] = 1161822839;
        nd.hlbt[525] = -551840268;
        nd.hlbt[526] = 1615931700;
        nd.hlbt[527] = 30320058;
        nd.hlbt[528] = 1572145914;
        nd.hlbt[529] = -1806896676;
        nd.hlbt[530] = -296443145;
        nd.hlbt[531] = -2002226927;
        nd.hlbt[532] = 1307549842;
        nd.hlbt[533] = 1400416699;
        nd.hlbt[534] = 1904679204;
        nd.hlbt[535] = 1988103632;
        nd.hlbt[536] = -76486329;
        nd.hlbt[537] = -2128013629;
        nd.hlbt[538] = 1534659679;
        nd.hlbt[539] = -923143789;
        nd.hlbt[540] = -141388824;
        nd.hlbt[541] = -503760459;
        nd.hlbt[542] = -781111965;
        nd.hlbt[543] = -1824458197;
        nd.hlbt[544] = -985747849;
        nd.hlbt[545] = -79739835;
        nd.hlbt[546] = 104639068;
        nd.hlbt[547] = -30569686;
        nd.hlbt[548] = -1933044435;
        nd.hlbt[549] = 1840915819;
        nd.hlbt[550] = 829104788;
        nd.hlbt[551] = -1970679669;
        nd.hlbt[552] = -1994597473;
        nd.hlbt[553] = 1198106728;
        nd.hlbt[554] = -890906719;
        nd.hlbt[555] = 1880808608;
        nd.hlbt[556] = 1719968346;
        nd.hlbt[557] = 613260289;
        nd.hlbt[558] = 972078938;
        nd.hlbt[559] = 198579326;
        nd.hlbt[560] = 2062981713;
        nd.hlbt[561] = 91856423;
        nd.hlbt[562] = 1409697846;
        nd.hlbt[563] = 629071697;
        nd.hlbt[564] = -152347829;
        nd.hlbt[565] = 1153829494;
        nd.hlbt[566] = -956411798;
        nd.hlbt[567] = -1835269839;
        nd.hlbt[568] = 1395467674;
        nd.hlbt[569] = 653604211;
        nd.hlbt[570] = 707624063;
        nd.hlbt[571] = -1227575578;
        nd.hlbt[572] = -612330186;
        nd.hlbt[573] = 1793992445;
        nd.hlbt[574] = -944243363;
        nd.hlbt[575] = -723861594;
        nd.hlbt[576] = 528165051;
        nd.hlbt[577] = -907207718;
        nd.hlbt[578] = -1254225712;
        nd.hlbt[579] = -307901651;
        nd.hlbt[580] = 66904734;
        nd.hlbt[581] = -735916063;
        nd.hlbt[582] = -1049839064;
        nd.hlbt[583] = 871806084;
        nd.hlbt[584] = 1001818748;
        nd.hlbt[585] = 1450456093;
        nd.hlbt[586] = -721579444;
        nd.hlbt[587] = -471576461;
        nd.hlbt[588] = 2128515151;
        nd.hlbt[589] = 579855349;
        nd.hlbt[590] = -1605914607;
        nd.hlbt[591] = 1740364103;
        nd.hlbt[592] = -1753977124;
        nd.hlbt[593] = 755189900;
        nd.hlbt[594] = -1069827633;
        nd.hlbt[595] = 395205334;
        nd.hlbt[596] = 187908463;
        nd.hlbt[597] = -168554902;
        nd.hlbt[598] = -1606661071;
        nd.hlbt[599] = -648389952;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int computeColor(int var0, int var1_1, int var2_2, int var3_3) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hlbn", hlbj(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 658841007: {
                    v1 = nd.hlbm("hlbo", hlbj(int ), (int)1);
                    continue block32;
                }
                case 1076290759: {
                    break block32;
                }
                case 1602758432: {
                    v1 = nd.hlbm("hlbp", hlbj(int ), (int)2);
                    continue block32;
                }
            }
            break;
        }
        var6_4 = nd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlbq", hlbj(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hlbu", hlbr(int ), (int)0)) break;
            v2 /* !! */  = (long)nd.hlbm("hlbv", hlbr(int ), (int)1);
        }
        var5_5 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl26
        block34: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hlbw", hlbj(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2058133408: {
                    v4 = nd.hlbm("hlbx", hlbj(int ), (int)5);
                    continue block34;
                }
                case 314074037: {
                    v4 = nd.hlbm("hlby", hlbj(int ), (int)6);
                    continue block34;
                }
                case 1076290759: {
                    break block34;
                }
                case 1264708924: {
                    v4 = nd.hlbm("hlbz", hlbj(int ), (int)7);
                    continue block34;
                }
            }
            break;
        }
        var4_6 = nd.a;
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) {
                    throw null;
                    return (int)nd.hlbm("hlca", hlbr(int ), (int)2);
                }
                if (var4_6 || var4_6) ** continue;
                v5 = nd.hlbm("hlcb", hlbr(int ), (int)3);
                v6 = nd.hlbm("hlcc", hlbr(int ), (int)4);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlcd", hlbj(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == nd.hlbm("hlce", hlbr(int ), (int)5)) break;
                    v7 /* !! */  = (long)nd.hlbm("hlcf", hlbr(int ), (int)6);
                }
                v8 = class_3532.method_15340((int)var3_3, (int)v5, (int)v6) << nd.hlbm("hlcg", hlbr(int ), (int)7);
                v9 = nd.hlbm("hlch", hlbr(int ), (int)8);
                v10 = nd.hlbm("hlci", hlbr(int ), (int)9);
                v11 /* !! */  = nd.oo;
                if (true) ** GOTO lbl62
                block37: while (true) {
                    v11 /* !! */  = (long)(nd.hlbm("hlck", hlbj(int ), (int)10) - nd.hlbm("hlcj", hlbj(int ), (int)9));
lbl62:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1498224092: {
                            continue block37;
                        }
                        case 1076290759: {
                            break block37;
                        }
                    }
                    break;
                }
                v12 = v8 | class_3532.method_15340((int)var0, (int)v9, (int)v10) << nd.hlbm("hlcl", hlbr(int ), (int)10);
                v13 = nd.hlbm("hlcm", hlbr(int ), (int)11);
                v14 = nd.hlbm("hlcn", hlbr(int ), (int)12);
                v15 /* !! */  = nd.oo;
                if (true) ** GOTO lbl74
                block38: while (true) {
                    v15 /* !! */  = (long)(v16 - nd.hlbm("hlco", hlbj(int ), (int)11));
lbl74:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1632690779: {
                            v16 = nd.hlbm("hlcp", hlbj(int ), (int)12);
                            continue block38;
                        }
                        case 536577816: {
                            v16 = nd.hlbm("hlcq", hlbj(int ), (int)13);
                            continue block38;
                        }
                        case 1076290759: {
                            break block38;
                        }
                        case 1337240368: {
                            v16 = nd.hlbm("hlcr", hlbj(int ), (int)14);
                            continue block38;
                        }
                    }
                    break;
                }
                v17 = v12 | class_3532.method_15340((int)var1_1, (int)v13, (int)v14) << nd.hlbm("hlcs", hlbr(int ), (int)13);
                v18 = nd.hlbm("hlct", hlbr(int ), (int)14);
                v19 = nd.hlbm("hlcu", hlbr(int ), (int)15);
                v20 /* !! */  = nd.oo;
                if (true) ** GOTO lbl93
                block39: while (true) {
                    v20 /* !! */  = (long)(v21 - nd.hlbm("hlcv", hlbj(int ), (int)15));
lbl93:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1083024390: {
                            v21 = nd.hlbm("hlcw", hlbj(int ), (int)16);
                            continue block39;
                        }
                        case 523911324: {
                            v21 = nd.hlbm("hlcx", hlbj(int ), (int)17);
                            continue block39;
                        }
                        case 1076290759: {
                            break block39;
                        }
                    }
                    break;
                }
                return v17 | class_3532.method_15340((int)var2_2, (int)v18, (int)v19);
            }
            case 0: {
                var5_5 /* !! */  = (int)nd.hlbm("hlcy", hlbr(int ), (int)16);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)nd.hlbm("hlcz", hlbr(int ), (int)17);
                    if (!var6_4) break block11;
                    throw null;
                }
            }
lbl113:
            // 2 sources

            case 2: {
                do {
                    var5_5 /* !! */  = (int)nd.hlbm("hlda", hlbr(int ), (int)18);
                } while (!var6_4);
                throw null;
            }
            case 3: 
        }
        var5_5 /* !! */  = (int)nd.hlbm("hldb", hlbr(int ), (int)19);
        ** while (!var6_4)
lbl121:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hprp() {
        nd.hlbl[200] = 3629857702044500535L;
        nd.hlbl[201] = 8369125765256261665L;
        nd.hlbl[202] = 1197166659749587185L;
        nd.hlbl[203] = 9171247630719712314L;
        nd.hlbl[204] = 421773096614064713L;
        nd.hlbl[205] = -139944175644560320L;
        nd.hlbl[206] = -116946633845134499L;
        nd.hlbl[207] = -6378675502862927908L;
        nd.hlbl[208] = 8499657878020254884L;
        nd.hlbl[209] = 4609546593486618787L;
        nd.hlbl[210] = 8718884652626441692L;
        nd.hlbl[211] = 342174963839413106L;
        nd.hlbl[212] = -79854774752529545L;
        nd.hlbl[213] = -5379100609708617070L;
        nd.hlbl[214] = 1502510026375304949L;
        nd.hlbl[215] = 6842552054309591145L;
        nd.hlbl[216] = -6846544006546325759L;
        nd.hlbl[217] = -2338658937699631860L;
        nd.hlbl[218] = 2036655824154032679L;
        nd.hlbl[219] = 2239315031657430354L;
        nd.hlbl[220] = -989779057118764518L;
        nd.hlbl[221] = -8603932658083964914L;
        nd.hlbl[222] = -4215531411709249877L;
        nd.hlbl[223] = 1963586697012053679L;
        nd.hlbl[224] = -5557664307709964425L;
        nd.hlbl[225] = 6752756146431190461L;
        nd.hlbl[226] = 359919389273349950L;
        nd.hlbl[227] = 7262648272079309534L;
        nd.hlbl[228] = 1180008146893961627L;
        nd.hlbl[229] = 1022848790659985765L;
        nd.hlbl[230] = 56210972795040232L;
        nd.hlbl[231] = -6966797064110982818L;
        nd.hlbl[232] = 8010049118289653507L;
        nd.hlbl[233] = 6818178519231505076L;
        nd.hlbl[234] = -7900986853699966604L;
        nd.hlbl[235] = -5139203973968906956L;
        nd.hlbl[236] = -3315506486199008654L;
        nd.hlbl[237] = -793523002134238762L;
        nd.hlbl[238] = -7780435250987738377L;
        nd.hlbl[239] = 1018368559200450246L;
        nd.hlbl[240] = 6614287289190065728L;
        nd.hlbl[241] = 3290887825048442969L;
        nd.hlbl[242] = -2143751690643007022L;
        nd.hlbl[243] = 6423372182478682467L;
        nd.hlbl[244] = -3267239290456667365L;
        nd.hlbl[245] = 7291253740356540973L;
        nd.hlbl[246] = 4494310822193461159L;
        nd.hlbl[247] = 8180405763761173065L;
        nd.hlbl[248] = -7455759135974989547L;
        nd.hlbl[249] = 458865107880364922L;
        nd.hlbl[250] = -2742940827121785572L;
        nd.hlbl[251] = -7357495415259464512L;
        nd.hlbl[252] = -8737644681188091190L;
        nd.hlbl[253] = 5999139859882323270L;
        nd.hlbl[254] = -589575376734226067L;
        nd.hlbl[255] = -2073677175472908877L;
        nd.hlbl[256] = -7481001713980675688L;
        nd.hlbl[257] = -8075368201048468149L;
        nd.hlbl[258] = -3786759881185847288L;
        nd.hlbl[259] = -5747047202132825515L;
        nd.hlbl[260] = 4697722295856161929L;
        nd.hlbl[261] = 6630974608525118474L;
        nd.hlbl[262] = -8655492145239107602L;
        nd.hlbl[263] = 4187349430423661712L;
        nd.hlbl[264] = 52332076978614034L;
        nd.hlbl[265] = 3736157068690724715L;
        nd.hlbl[266] = -4113657092271710290L;
        nd.hlbl[267] = -793960019985982469L;
        nd.hlbl[268] = -8857225802701742715L;
        nd.hlbl[269] = 8434613888691836346L;
        nd.hlbl[270] = 223690612819503138L;
        nd.hlbl[271] = -8262030663656959889L;
        nd.hlbl[272] = -1354384692905915322L;
        nd.hlbl[273] = -1459520714334547561L;
        nd.hlbl[274] = -1965087568095018916L;
        nd.hlbl[275] = -8929397496723522559L;
        nd.hlbl[276] = -3001906924879834091L;
        nd.hlbl[277] = 4913448717411215647L;
        nd.hlbl[278] = 917557193534042876L;
        nd.hlbl[279] = 6611449805944957821L;
        nd.hlbl[280] = 6906511929231663418L;
        nd.hlbl[281] = -3829981876947521700L;
        nd.hlbl[282] = -1334432873192403394L;
        nd.hlbl[283] = -4680131107954001400L;
        nd.hlbl[284] = -3895128661386328825L;
        nd.hlbl[285] = 2897196104813339744L;
        nd.hlbl[286] = -7479943802513191298L;
        nd.hlbl[287] = -3269930449078968569L;
        nd.hlbl[288] = -5187008329316799144L;
        nd.hlbl[289] = -7741480369444035384L;
        nd.hlbl[290] = 162087342319113913L;
        nd.hlbl[291] = -3529314031092590519L;
        nd.hlbl[292] = 556209475218430383L;
        nd.hlbl[293] = 9222325999496343306L;
        nd.hlbl[294] = 3545350361608212267L;
        nd.hlbl[295] = 876024658071082143L;
        nd.hlbl[296] = 1369047185553869029L;
        nd.hlbl[297] = -996135174615691509L;
        nd.hlbl[298] = 6162271586460488276L;
        nd.hlbl[299] = -5094204292825274147L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int interpolateColor(int var0, int var1_1, float var2_2, int var3_3) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block67: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hmif", hlbj(int ), (int)193));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1316930190: {
                    v1 = nd.hlbm("hmig", hlbj(int ), (int)194);
                    continue block67;
                }
                case -1172461252: {
                    v1 = nd.hlbm("hmih", hlbj(int ), (int)195);
                    continue block67;
                }
                case 1076290759: {
                    break block67;
                }
            }
            break;
        }
        var15_4 = nd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hmii", hlbj(int ), (int)196)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nd.hlbm("hmij", hlbr(int ), (int)454)) break;
            v2 /* !! */  = (long)nd.hlbm("hmik", hlbr(int ), (int)455);
        }
        var14_5 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl25
        block69: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hmil", hlbj(int ), (int)197));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -643269949: {
                    v4 = nd.hlbm("hmim", hlbj(int ), (int)198);
                    continue block69;
                }
                case 1076290759: {
                    break block69;
                }
                case 1979392638: {
                    v4 = nd.hlbm("hmin", hlbj(int ), (int)199);
                    continue block69;
                }
                case 2074172886: {
                    v4 = nd.hlbm("hmio", hlbj(int ), (int)200);
                    continue block69;
                }
            }
            break;
        }
        var13_6 = nd.a;
        if (var15_4) {
            throw null;
lbl40:
            // 12 sources

            return (int)nd.hlbm("hmip", hlbr(int ), (int)456);
        }
        if (var13_6 || var13_6) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hmiq", hlbj(int ), (int)201)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nd.hlbm("hmir", hlbr(int ), (int)457)) break;
            v5 /* !! */  = (long)nd.hlbm("hmis", hlbr(int ), (int)458);
        }
        v6 = Math.max(0.0f, var2_2);
        v7 /* !! */  = nd.oo;
        if (true) ** GOTO lbl53
        block72: while (true) {
            v7 /* !! */  = (long)(nd.hlbm("hmiu", hlbj(int ), (int)203) - nd.hlbm("hmit", hlbj(int ), (int)202));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -53421375: {
                    continue block72;
                }
                case 1076290759: {
                    break block72;
                }
            }
            break;
        }
        var2_2 = Math.min(1.0f, v6);
        if (var13_6 || var13_6) ** GOTO lbl40
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hmiv", hlbj(int ), (int)204)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == nd.hlbm("hmiw", hlbr(int ), (int)459)) break;
            v8 /* !! */  = (long)nd.hlbm("hmix", hlbr(int ), (int)460);
        }
        var4_7 = nd.getRed(var0);
        if (var13_6 || var13_6) ** GOTO lbl40
        v9 /* !! */  = nd.oo;
        if (true) ** GOTO lbl71
        block74: while (true) {
            v9 /* !! */  = (long)(v10 - nd.hlbm("hmiy", hlbj(int ), (int)205));
lbl71:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1612119486: {
                    v10 = nd.hlbm("hmiz", hlbj(int ), (int)206);
                    continue block74;
                }
                case -567051112: {
                    v10 = nd.hlbm("hmja", hlbj(int ), (int)207);
                    continue block74;
                }
                case 1076290759: {
                    break block74;
                }
            }
            break;
        }
        var5_8 = nd.getGreen(var0);
        if (var13_6) ** GOTO lbl40
        if (var14_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var13_6) ** GOTO lbl40
                v11 /* !! */  = nd.oo;
                if (true) ** GOTO lbl90
                block75: while (true) {
                    v11 /* !! */  = (long)(v12 - nd.hlbm("hmjb", hlbj(int ), (int)208));
lbl90:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2141468647: {
                            v12 = nd.hlbm("hmjc", hlbj(int ), (int)209);
                            continue block75;
                        }
                        case -2021709357: {
                            v12 = nd.hlbm("hmjd", hlbj(int ), (int)210);
                            continue block75;
                        }
                        case 1076290759: {
                            break block75;
                        }
                        case 1455433781: {
                            v12 = nd.hlbm("hmje", hlbj(int ), (int)211);
                            continue block75;
                        }
                    }
                    break;
                }
                var6_9 = nd.getBlue(var0);
                if (var13_6 || var13_6) ** GOTO lbl40
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hmjf", hlbj(int ), (int)212)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == nd.hlbm("hmjg", hlbr(int ), (int)461)) break;
                    v13 /* !! */  = (long)nd.hlbm("hmjh", hlbr(int ), (int)462);
                }
                var7_10 = nd.getRed(var1_1);
                if (var13_6 || var13_6) ** GOTO lbl40
                v14 /* !! */  = nd.oo;
                if (true) ** GOTO lbl115
                block77: while (true) {
                    v14 /* !! */  = (long)(nd.hlbm("hmjj", hlbj(int ), (int)214) - nd.hlbm("hmji", hlbj(int ), (int)213));
lbl115:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1834488806: {
                            continue block77;
                        }
                        case 1076290759: {
                            break block77;
                        }
                    }
                    break;
                }
                var8_11 = nd.getGreen(var1_1);
                if (var13_6 || var13_6) ** GOTO lbl40
                v15 /* !! */  = nd.oo;
                if (true) ** GOTO lbl126
                block78: while (true) {
                    v15 /* !! */  = (long)(v16 - nd.hlbm("hmjk", hlbj(int ), (int)215));
lbl126:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1212891272: {
                            v16 = nd.hlbm("hmjl", hlbj(int ), (int)216);
                            continue block78;
                        }
                        case -89006809: {
                            v16 = nd.hlbm("hmjm", hlbj(int ), (int)217);
                            continue block78;
                        }
                        case 1076290759: {
                            break block78;
                        }
                    }
                    break;
                }
                var9_12 = nd.getBlue(var1_1);
                if (var13_6 || var13_6) ** GOTO lbl40
                var10_13 = (int)((float)var4_7 + (float)(var7_10 - var4_7) * var2_2);
                if (var13_6 || var13_6) ** GOTO lbl40
                var11_14 = (int)((float)var5_8 + (float)(var8_11 - var5_8) * var2_2);
                if (var13_6 || var13_6) ** GOTO lbl40
                var12_15 = (int)((float)var6_9 + (float)(var9_12 - var6_9) * var2_2);
                if (!var13_6 && !var13_6) ** break;
                ** continue;
                v17 /* !! */  = nd.oo;
                if (true) ** GOTO lbl148
                block79: while (true) {
                    v17 /* !! */  = (long)(v18 - nd.hlbm("hmjn", hlbj(int ), (int)218));
lbl148:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case 1044346963: {
                            v18 = nd.hlbm("hmjo", hlbj(int ), (int)219);
                            continue block79;
                        }
                        case 1076290759: {
                            break block79;
                        }
                        case 1787121235: {
                            v18 = nd.hlbm("hmjp", hlbj(int ), (int)220);
                            continue block79;
                        }
                        case 2091813374: {
                            v18 = nd.hlbm("hmjq", hlbj(int ), (int)221);
                            continue block79;
                        }
                    }
                    break;
                }
                return nd.rgba(var10_13, var11_14, var12_15, var3_3);
            }
lbl161:
            // 2 sources

            case 0: {
                var14_5 /* !! */  = (int)nd.hlbm("hmjr", hlbr(int ), (int)463);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 1: {
                var14_5 /* !! */  = (int)nd.hlbm("hmjs", hlbr(int ), (int)464);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl171:
            // 2 sources

            case 2: {
                var14_5 /* !! */  = (int)nd.hlbm("hmjt", hlbr(int ), (int)465);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl176:
            // 2 sources

            case 3: {
                var14_5 /* !! */  = (int)nd.hlbm("hmju", hlbr(int ), (int)466);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl181:
            // 2 sources

            case 4: {
                var14_5 /* !! */  = (int)nd.hlbm("hmjv", hlbr(int ), (int)467);
                if (!var15_4) ** GOTO lbl176
                throw null;
            }
lbl185:
            // 2 sources

            case 5: {
                var14_5 /* !! */  = (int)nd.hlbm("hmjw", hlbr(int ), (int)468);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl190:
            // 2 sources

            case 6: {
                var14_5 /* !! */  = (int)nd.hlbm("hmjx", hlbr(int ), (int)469);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl195:
            // 3 sources

            case 7: {
                var14_5 /* !! */  = (int)nd.hlbm("hmjy", hlbr(int ), (int)470);
                if (!var15_4) break;
                throw null;
            }
            case 8: {
                var14_5 /* !! */  = (int)nd.hlbm("hmjz", hlbr(int ), (int)471);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 9: {
                var14_5 /* !! */  = (int)nd.hlbm("hmka", hlbr(int ), (int)472);
                if (!var15_4) break;
                throw null;
            }
lbl208:
            // 2 sources

            case 10: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkb", hlbr(int ), (int)473);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl213:
            // 2 sources

            case 11: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkc", hlbr(int ), (int)474);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl218:
            // 3 sources

            case 12: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkd", hlbr(int ), (int)475);
                if (var15_4) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 13: {
                var14_5 /* !! */  = (int)nd.hlbm("hmke", hlbr(int ), (int)476);
                if (!var15_4) ** GOTO lbl195
                throw null;
            }
lbl227:
            // 2 sources

            case 14: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkf", hlbr(int ), (int)477);
                if (!var15_4) ** GOTO lbl190
                throw null;
            }
lbl231:
            // 3 sources

            case 15: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkg", hlbr(int ), (int)478);
                if (!var15_4) ** GOTO lbl218
                throw null;
            }
lbl235:
            // 2 sources

            case 16: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkh", hlbr(int ), (int)479);
                if (!var15_4) ** GOTO lbl181
                throw null;
            }
            case 17: {
                var14_5 /* !! */  = (int)nd.hlbm("hmki", hlbr(int ), (int)480);
                if (!var15_4) ** GOTO lbl231
                throw null;
            }
lbl243:
            // 2 sources

            case 18: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkj", hlbr(int ), (int)481);
                if (!var15_4) ** GOTO lbl171
                throw null;
            }
lbl247:
            // 2 sources

            case 19: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkk", hlbr(int ), (int)482);
                if (!var15_4) ** GOTO lbl231
                throw null;
            }
            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_5 /* !! */  = (int)nd.hlbm("hmkl", hlbr(int ), (int)483);
                    if (!var15_4) ** GOTO lbl213
                    throw null;
                }
            }
lbl256:
            // 3 sources

            case 21: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkm", hlbr(int ), (int)484);
                if (!var15_4) ** GOTO lbl161
                throw null;
            }
lbl260:
            // 2 sources

            case 22: {
                var14_5 /* !! */  = (int)nd.hlbm("hmkn", hlbr(int ), (int)485);
                if (!var15_4) ** GOTO lbl195
                throw null;
            }
            case 23: 
        }
        var14_5 /* !! */  = (int)nd.hlbm("hmko", hlbr(int ), (int)486);
        ** while (!var15_4)
lbl267:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int getClientColorSoft(int var0) {
        v0 /* !! */  = nd.oo;
        block43: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 1076290759: {
                    break block43;
                }
                case 2038271668: {
                    v0 /* !! */  = (long)(nd.hlbm("hmoo", hlbj(int ), (int)252) - nd.hlbm("hmon", hlbj(int ), (int)251));
                    continue block43;
                }
            }
            break;
        }
        var8_1 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl14
        block44: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hmop", hlbj(int ), (int)253));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 246298700: {
                    v2 = nd.hlbm("hmoq", hlbj(int ), (int)254);
                    continue block44;
                }
                case 1076290759: {
                    break block44;
                }
                case 1763561136: {
                    v2 = nd.hlbm("hmor", hlbj(int ), (int)255);
                    continue block44;
                }
                case 1860990103: {
                    v2 = nd.hlbm("hmos", hlbj(int ), (int)256);
                    continue block44;
                }
            }
            break;
        }
        var7_2 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl31
        block45: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hmot", hlbj(int ), (int)257));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1212444455: {
                    v4 = nd.hlbm("hmou", hlbj(int ), (int)258);
                    continue block45;
                }
                case 45070624: {
                    v4 = nd.hlbm("hmov", hlbj(int ), (int)259);
                    continue block45;
                }
                case 1076290759: {
                    break block45;
                }
            }
            break;
        }
        var6_3 = nd.a;
        if (var8_1) {
            throw null;
        }
        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
        v5 /* !! */  = nd.oo;
        if (true) ** GOTO lbl49
        block46: while (true) {
            v5 /* !! */  = (long)(v6 - nd.hlbm("hmox", hlbj(int ), (int)260));
lbl49:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 303966119: {
                    v6 = nd.hlbm("hmoy", hlbj(int ), (int)261);
                    continue block46;
                }
                case 1076290759: {
                    break block46;
                }
                case 1249906481: {
                    v6 = nd.hlbm("hmoz", hlbj(int ), (int)262);
                    continue block46;
                }
                case 1295892689: {
                    v6 = nd.hlbm("hmpa", hlbj(int ), (int)263);
                    continue block46;
                }
            }
            break;
        }
        var1_4 = nd.getClientColor();
        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
        var2_5 = nd.hlbm("hmpb", hlzk(int ), (int)561);
        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hmpc", hlbj(int ), (int)264)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == nd.hlbm("hmpd", hlbr(int ), (int)562)) break;
            v7 /* !! */  = (long)nd.hlbm("hmpe", hlbr(int ), (int)563);
        }
        var3_6 = (int)((float)nd.getRed(var1_4) * var2_5);
        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
        while (true) {
            block68: {
                if ((v8 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hmpf", hlbj(int ), (int)265)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  != nd.hlbm("hmpg", hlbr(int ), (int)564)) break block68;
                var4_7 = (int)((float)nd.getGreen(var1_4) * var2_5);
                if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
                if (var7_2 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v8 /* !! */  = (long)nd.hlbm("hmph", hlbr(int ), (int)565);
        }
        cfr_temp_0 = -2147483648;
        block49: while (true) {
            block69: {
                switch (cfr_temp_0 == -2147483648 ? var7_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hmpi", hlbj(int ), (int)266)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  != nd.hlbm("hmpj", hlbr(int ), (int)566)) ** GOTO lbl99
                            var5_8 = (int)((float)nd.getBlue(var1_4) * var2_5);
                            if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
                            if (var6_3 != false) return (int)nd.hlbm("hmow", hlbr(int ), (int)560);
                            v10 /* !! */  = nd.oo;
                            if (true) ** GOTO lbl155
lbl99:
                            // 1 sources

                            v9 /* !! */  = (long)nd.hlbm("hmpk", hlbr(int ), (int)567);
                        }
                    }
                    case 0: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpp", hlbr(int ), (int)568);
                        cfr_temp_0 = 10;
                        if (var8_1) {
                            throw null;
                        }
                        break block69;
                    }
                    case 1: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpq", hlbr(int ), (int)569);
                        cfr_temp_0 = 12;
                        if (var8_1) {
                            throw null;
                        }
                        break block69;
                    }
                    case 2: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpr", hlbr(int ), (int)570);
                        if (var8_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpx", hlbr(int ), (int)576);
                        if (var8_1) {
                            throw null;
                        }
                    }
                    case 10: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpz", hlbr(int ), (int)578);
                        if (var8_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpu", hlbr(int ), (int)573);
                        if (var8_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpt", hlbr(int ), (int)572);
                        if (var8_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 11: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmqa", hlbr(int ), (int)579);
                        if (var8_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmps", hlbr(int ), (int)571);
                        if (var8_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        ** GOTO lbl148
                    }
                    case 13: lbl-1000:
                    // 2 sources

                    {
                        var7_2 /* !! */  = (int)nd.hlbm("hmqc", hlbr(int ), (int)581);
                        if (var8_1) {
                            throw null;
                        }
lbl148:
                        // 3 sources

                        var7_2 /* !! */  = (int)nd.hlbm("hmpv", hlbr(int ), (int)574);
                        cfr_temp_0 = 9;
                        if (var8_1) {
                            throw null;
                        }
                        break block69;
                    }
                    block51: while (true) {
                        v10 /* !! */  = (long)(v11 - nd.hlbm("hmpl", hlbj(int ), (int)267));
lbl155:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1791814869: {
                                v11 = nd.hlbm("hmpm", hlbj(int ), (int)268);
                                continue block51;
                            }
                            case -731437350: {
                                v11 = nd.hlbm("hmpn", hlbj(int ), (int)269);
                                continue block51;
                            }
                            case 1076290759: {
                                return nd.rgba(var3_6, var4_7, var5_8, var0);
                            }
                            case 1864706385: {
                                v11 = nd.hlbm("hmpo", hlbj(int ), (int)270);
                                continue block51;
                            }
                        }
                        break;
                    }
                    return nd.rgba(var3_6, var4_7, var5_8, var0);
                    case 7: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpw", hlbr(int ), (int)575);
                        if (var8_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var7_2 /* !! */  = (int)nd.hlbm("hmpy", hlbr(int ), (int)577);
                        if (var8_1) {
                            throw null;
                        }
                    }
                    case 12: 
                }
                ** GOTO lbl181
            }
            do {
                if (true) continue block49;
lbl181:
                // 2 sources

                var7_2 /* !! */  = (int)nd.hlbm("hmqb", hlbr(int ), (int)580);
                cfr_temp_0 = 7;
            } while (!var8_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ float hlzk(int n2) {
        return Float.intBitsToFloat(hlbs[n2] ^ hlbt[n2]);
    }

    private static /* synthetic */ void hpmx() {
        nd.hlbt[400] = 180845879;
        nd.hlbt[401] = 523030677;
        nd.hlbt[402] = 1845337610;
        nd.hlbt[403] = -911565413;
        nd.hlbt[404] = -1866104576;
        nd.hlbt[405] = 1146096990;
        nd.hlbt[406] = 953909769;
        nd.hlbt[407] = -1262263420;
        nd.hlbt[408] = -556733988;
        nd.hlbt[409] = -295222378;
        nd.hlbt[410] = -226535603;
        nd.hlbt[411] = 1343102648;
        nd.hlbt[412] = -1670877154;
        nd.hlbt[413] = 1884761130;
        nd.hlbt[414] = 111768265;
        nd.hlbt[415] = 794917763;
        nd.hlbt[416] = 1262481937;
        nd.hlbt[417] = 1865469392;
        nd.hlbt[418] = -1977981861;
        nd.hlbt[419] = -450770179;
        nd.hlbt[420] = -655846359;
        nd.hlbt[421] = -1146754265;
        nd.hlbt[422] = 759837726;
        nd.hlbt[423] = 1557108692;
        nd.hlbt[424] = 1675505787;
        nd.hlbt[425] = -1579962595;
        nd.hlbt[426] = -255483653;
        nd.hlbt[427] = 1969505102;
        nd.hlbt[428] = 1639434606;
        nd.hlbt[429] = -1998505072;
        nd.hlbt[430] = 1191720070;
        nd.hlbt[431] = 2020404877;
        nd.hlbt[432] = -2048920654;
        nd.hlbt[433] = 2052027787;
        nd.hlbt[434] = 1497581765;
        nd.hlbt[435] = -1169278015;
        nd.hlbt[436] = 1296031423;
        nd.hlbt[437] = -1636383310;
        nd.hlbt[438] = -626345581;
        nd.hlbt[439] = 753223263;
        nd.hlbt[440] = -2077819102;
        nd.hlbt[441] = 889330965;
        nd.hlbt[442] = -851645842;
        nd.hlbt[443] = 1344890340;
        nd.hlbt[444] = 1303599793;
        nd.hlbt[445] = -1512366262;
        nd.hlbt[446] = -228255427;
        nd.hlbt[447] = -1902851375;
        nd.hlbt[448] = 2046005841;
        nd.hlbt[449] = -1343844999;
        nd.hlbt[450] = -703589974;
        nd.hlbt[451] = -212400230;
        nd.hlbt[452] = 1389151861;
        nd.hlbt[453] = -1129963993;
        nd.hlbt[454] = 463744942;
        nd.hlbt[455] = 373945166;
        nd.hlbt[456] = 701096908;
        nd.hlbt[457] = 1347435469;
        nd.hlbt[458] = 617857854;
        nd.hlbt[459] = 1694391725;
        nd.hlbt[460] = 1656126988;
        nd.hlbt[461] = -1206836608;
        nd.hlbt[462] = -1899911540;
        nd.hlbt[463] = -491630785;
        nd.hlbt[464] = 916828442;
        nd.hlbt[465] = -1423790194;
        nd.hlbt[466] = 1631890048;
        nd.hlbt[467] = 882359537;
        nd.hlbt[468] = -1013811834;
        nd.hlbt[469] = 1596503402;
        nd.hlbt[470] = 953065486;
        nd.hlbt[471] = -1895463457;
        nd.hlbt[472] = 327412406;
        nd.hlbt[473] = 131617386;
        nd.hlbt[474] = -538465997;
        nd.hlbt[475] = 878009351;
        nd.hlbt[476] = -1857549561;
        nd.hlbt[477] = -724239100;
        nd.hlbt[478] = 1854582199;
        nd.hlbt[479] = 894752754;
        nd.hlbt[480] = 1528377142;
        nd.hlbt[481] = -752541473;
        nd.hlbt[482] = -1009979872;
        nd.hlbt[483] = -23843047;
        nd.hlbt[484] = 19894001;
        nd.hlbt[485] = -1424304678;
        nd.hlbt[486] = -1508800408;
        nd.hlbt[487] = -379419822;
        nd.hlbt[488] = 2141459439;
        nd.hlbt[489] = -213781596;
        nd.hlbt[490] = 2127333555;
        nd.hlbt[491] = 1610723710;
        nd.hlbt[492] = 593532116;
        nd.hlbt[493] = 1977870120;
        nd.hlbt[494] = 1830865840;
        nd.hlbt[495] = 327694767;
        nd.hlbt[496] = 1906423115;
        nd.hlbt[497] = 299689005;
        nd.hlbt[498] = 1011358477;
        nd.hlbt[499] = 1043759629;
    }

    private static /* synthetic */ void hplp() {
        nd.hlbs[1200] = -1046598585;
        nd.hlbs[1201] = -1030055840;
        nd.hlbs[1202] = 1938677504;
        nd.hlbs[1203] = -1021844827;
        nd.hlbs[1204] = -1809219200;
        nd.hlbs[1205] = 256131455;
        nd.hlbs[1206] = 441738508;
        nd.hlbs[1207] = 399977019;
        nd.hlbs[1208] = 130813077;
        nd.hlbs[1209] = 547119048;
        nd.hlbs[1210] = -1512571642;
        nd.hlbs[1211] = -482594472;
        nd.hlbs[1212] = -333805437;
        nd.hlbs[1213] = 178282585;
        nd.hlbs[1214] = -916431252;
        nd.hlbs[1215] = 2137264723;
        nd.hlbs[1216] = -32270873;
        nd.hlbs[1217] = 1457332085;
        nd.hlbs[1218] = -1819577840;
        nd.hlbs[1219] = -1248171653;
        nd.hlbs[1220] = 333921708;
        nd.hlbs[1221] = 1404840184;
        nd.hlbs[1222] = -1243261886;
        nd.hlbs[1223] = 582117175;
        nd.hlbs[1224] = -40381334;
        nd.hlbs[1225] = -1108227418;
        nd.hlbs[1226] = 1861796873;
        nd.hlbs[1227] = 1264094934;
        nd.hlbs[1228] = 1974220846;
        nd.hlbs[1229] = 1826912006;
        nd.hlbs[1230] = 832585712;
        nd.hlbs[1231] = -1110909703;
        nd.hlbs[1232] = 1880675791;
        nd.hlbs[1233] = 1097480660;
        nd.hlbs[1234] = 204424026;
        nd.hlbs[1235] = 1570618614;
        nd.hlbs[1236] = 1107688624;
        nd.hlbs[1237] = -1463728570;
        nd.hlbs[1238] = 529421628;
        nd.hlbs[1239] = -489787185;
        nd.hlbs[1240] = 141514498;
        nd.hlbs[1241] = -797646294;
        nd.hlbs[1242] = 1356587002;
        nd.hlbs[1243] = -1120284912;
        nd.hlbs[1244] = -150889472;
        nd.hlbs[1245] = -349163768;
        nd.hlbs[1246] = 583992191;
        nd.hlbs[1247] = 1283750488;
        nd.hlbs[1248] = -1051144324;
        nd.hlbs[1249] = -1860171935;
        nd.hlbs[1250] = -485272294;
        nd.hlbs[1251] = 1038872154;
        nd.hlbs[1252] = 464500689;
        nd.hlbs[1253] = 1826742333;
        nd.hlbs[1254] = -406333937;
        nd.hlbs[1255] = -1452564773;
        nd.hlbs[1256] = 660371457;
        nd.hlbs[1257] = -699039928;
        nd.hlbs[1258] = 223536229;
        nd.hlbs[1259] = 1987288618;
        nd.hlbs[1260] = -1176980524;
        nd.hlbs[1261] = -437604671;
        nd.hlbs[1262] = 1924171690;
        nd.hlbs[1263] = 1110316680;
        nd.hlbs[1264] = 1711007301;
        nd.hlbs[1265] = 1400325414;
        nd.hlbs[1266] = -582520595;
        nd.hlbs[1267] = -211768318;
        nd.hlbs[1268] = 912012238;
        nd.hlbs[1269] = 1091671225;
        nd.hlbs[1270] = 392196657;
        nd.hlbs[1271] = -1043412490;
        nd.hlbs[1272] = -80518099;
        nd.hlbs[1273] = 375571394;
        nd.hlbs[1274] = -1345161069;
        nd.hlbs[1275] = 1964821861;
        nd.hlbs[1276] = -883553131;
        nd.hlbs[1277] = 1389515061;
        nd.hlbs[1278] = 1329228835;
        nd.hlbs[1279] = 938468305;
        nd.hlbs[1280] = -1732209673;
        nd.hlbs[1281] = 436524656;
        nd.hlbs[1282] = 1264195512;
        nd.hlbs[1283] = 158249262;
        nd.hlbs[1284] = -1937508717;
        nd.hlbs[1285] = -1208002380;
        nd.hlbs[1286] = -544256477;
        nd.hlbs[1287] = 749051399;
        nd.hlbs[1288] = 1253617064;
        nd.hlbs[1289] = 701848837;
        nd.hlbs[1290] = -1104993609;
        nd.hlbs[1291] = -1772938223;
        nd.hlbs[1292] = -1842476921;
        nd.hlbs[1293] = 1258513598;
        nd.hlbs[1294] = 1824923696;
        nd.hlbs[1295] = 352985877;
        nd.hlbs[1296] = 1128677710;
        nd.hlbs[1297] = -436264849;
        nd.hlbs[1298] = 1755421069;
        nd.hlbs[1299] = 2071541556;
    }

    private static /* synthetic */ void hprm() {
        nd.hlbl[0] = -8378519849844495776L;
        nd.hlbl[1] = 5332693638756244648L;
        nd.hlbl[2] = -4194033192099115515L;
        nd.hlbl[3] = 6332619508948432381L;
        nd.hlbl[4] = -8618992729898440381L;
        nd.hlbl[5] = 4303281405754830381L;
        nd.hlbl[6] = 5119657567949114201L;
        nd.hlbl[7] = 1075353419880388293L;
        nd.hlbl[8] = 2673880659333939417L;
        nd.hlbl[9] = -8232075238092907068L;
        nd.hlbl[10] = 4481816205354258412L;
        nd.hlbl[11] = -2808920359966399764L;
        nd.hlbl[12] = 5762440650835096338L;
        nd.hlbl[13] = 5120673968131757587L;
        nd.hlbl[14] = -7843043524321677103L;
        nd.hlbl[15] = 8109454764825925454L;
        nd.hlbl[16] = -2980233756586842826L;
        nd.hlbl[17] = 1121622007802344354L;
        nd.hlbl[18] = -5560856910031720312L;
        nd.hlbl[19] = -2502999661919995959L;
        nd.hlbl[20] = -681011543998165064L;
        nd.hlbl[21] = -4323240907624774767L;
        nd.hlbl[22] = -1602740823399404301L;
        nd.hlbl[23] = 3377513495138599345L;
        nd.hlbl[24] = -496399274836954993L;
        nd.hlbl[25] = 5817778665219693617L;
        nd.hlbl[26] = -2672257999567837290L;
        nd.hlbl[27] = -7342370258579506556L;
        nd.hlbl[28] = 1178989845863929473L;
        nd.hlbl[29] = -2911531800513373367L;
        nd.hlbl[30] = -2305143312552251984L;
        nd.hlbl[31] = -1001444330381264162L;
        nd.hlbl[32] = -5584204324272839868L;
        nd.hlbl[33] = -1304303856626921755L;
        nd.hlbl[34] = 4791317185464474566L;
        nd.hlbl[35] = -5945678123036696845L;
        nd.hlbl[36] = -3540850129574127850L;
        nd.hlbl[37] = -5692784273864659392L;
        nd.hlbl[38] = 9200327565411165108L;
        nd.hlbl[39] = 7826590379803523892L;
        nd.hlbl[40] = -5318788888877693990L;
        nd.hlbl[41] = 1563237653368485034L;
        nd.hlbl[42] = 601428305484320692L;
        nd.hlbl[43] = 5629765366220340802L;
        nd.hlbl[44] = -7122096807535851537L;
        nd.hlbl[45] = 3404524737205271922L;
        nd.hlbl[46] = 1274363607621459671L;
        nd.hlbl[47] = -8661449639849521123L;
        nd.hlbl[48] = 161141690230766220L;
        nd.hlbl[49] = -8185083757077735861L;
        nd.hlbl[50] = 8172516659391485686L;
        nd.hlbl[51] = -6297885505382684864L;
        nd.hlbl[52] = -5932501497050328331L;
        nd.hlbl[53] = -9018967422795725878L;
        nd.hlbl[54] = -4707451924970365731L;
        nd.hlbl[55] = 2693224363689079329L;
        nd.hlbl[56] = -8629315084949050026L;
        nd.hlbl[57] = 2548771600245565005L;
        nd.hlbl[58] = -8311740354613593555L;
        nd.hlbl[59] = -8037468363553184455L;
        nd.hlbl[60] = -7043809270096632917L;
        nd.hlbl[61] = 323952171237663867L;
        nd.hlbl[62] = 8361560238522303758L;
        nd.hlbl[63] = 5737829455745480733L;
        nd.hlbl[64] = -5767195912038353064L;
        nd.hlbl[65] = 4455921121838274526L;
        nd.hlbl[66] = 864835809531060033L;
        nd.hlbl[67] = -6243475372459303898L;
        nd.hlbl[68] = -4110361507911407181L;
        nd.hlbl[69] = -1968610877159439035L;
        nd.hlbl[70] = -6937647622849728739L;
        nd.hlbl[71] = -4622403232203915311L;
        nd.hlbl[72] = 1433705382738498695L;
        nd.hlbl[73] = 1181094069622150987L;
        nd.hlbl[74] = 7643397600974786789L;
        nd.hlbl[75] = 7216588936287790377L;
        nd.hlbl[76] = 2531219952026884155L;
        nd.hlbl[77] = -3327389919915481803L;
        nd.hlbl[78] = 8317701806982199300L;
        nd.hlbl[79] = 3994719363700574009L;
        nd.hlbl[80] = -7731511970068833086L;
        nd.hlbl[81] = -8757894138042656012L;
        nd.hlbl[82] = 995828499589916731L;
        nd.hlbl[83] = 8205238651763150572L;
        nd.hlbl[84] = -4972120626702276036L;
        nd.hlbl[85] = -3293196852151444793L;
        nd.hlbl[86] = -4284290553750877551L;
        nd.hlbl[87] = 9030682317781508502L;
        nd.hlbl[88] = 4944504996417239953L;
        nd.hlbl[89] = 1757703421120805423L;
        nd.hlbl[90] = 8739159711580704876L;
        nd.hlbl[91] = 5759546245523258813L;
        nd.hlbl[92] = 4775058911563707992L;
        nd.hlbl[93] = 1133317035480172749L;
        nd.hlbl[94] = 5454733254277619573L;
        nd.hlbl[95] = -3317298847283298017L;
        nd.hlbl[96] = -1495324347370555475L;
        nd.hlbl[97] = 2230354664534025453L;
        nd.hlbl[98] = -4668881053192090576L;
        nd.hlbl[99] = -830997510727700651L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getClientColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hluz", hlbj(int ), (int)143)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hlva", hlbr(int ), (int)161)) break;
            v0 /* !! */  = (long)nd.hlbm("hlvb", hlbr(int ), (int)162);
        }
        var2 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hlvc", hlbj(int ), (int)144));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1949071943: {
                    v2 = nd.hlbm("hlvd", hlbj(int ), (int)145);
                    continue block12;
                }
                case 1076290759: {
                    break block12;
                }
                case 1240296556: {
                    v2 = nd.hlbm("hlve", hlbj(int ), (int)146);
                    continue block12;
                }
            }
            break;
        }
        var1_1 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlvf", hlbj(int ), (int)147)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nd.hlbm("hlvg", hlbr(int ), (int)163)) break;
            v3 /* !! */  = (long)nd.hlbm("hlvh", hlbr(int ), (int)164);
        }
        var0_2 = nd.a;
        if (var2) {
            throw null;
lbl31:
            // 2 sources

            return (int)nd.hlbm("hlvi", hlbr(int ), (int)165);
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v4 = nd.hlbm("hlvj", hlbr(int ), (int)166);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hlvk", hlbj(int ), (int)148)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == nd.hlbm("hlvl", hlbr(int ), (int)167)) break;
                    v5 /* !! */  = (long)nd.hlbm("hlvm", hlbr(int ), (int)168);
                }
                return nd.getClientColor((int)v4);
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)nd.hlbm("hlvn", hlbr(int ), (int)169);
                } while (!var2);
                throw null;
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)nd.hlbm("hlvo", hlbr(int ), (int)170);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)nd.hlbm("hlvp", hlbr(int ), (int)171);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)nd.hlbm("hlvq", hlbr(int ), (int)172);
        } while (!var2);
        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static int red(int n2) {
        Object object = oo;
        block15: while (true) {
            switch ((int)object) {
                case 1076290759: {
                    break block15;
                }
                case 1588643398: {
                    object = nd.hlbm("hlnf", hlbj(int ), (int)66) - nd.hlbm("hlne", hlbj(int ), (int)65);
                    continue block15;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = oo;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - nd.hlbm("hlng", hlbj(int ), (int)67);
            }
            switch ((int)object2) {
                case 56111609: {
                    callSite = nd.hlbm("hlnh", hlbj(int ), (int)68);
                    continue block16;
                }
                case 813562760: {
                    callSite = nd.hlbm("hlni", hlbj(int ), (int)69);
                    continue block16;
                }
                case 1076290759: {
                    break block16;
                }
                case 1673234219: {
                    callSite = nd.hlbm("hlnj", hlbj(int ), (int)70);
                    continue block16;
                }
            }
            break;
        }
        int n3 = b;
        Object object3 = oo;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object3 = callSite - nd.hlbm("hlnk", hlbj(int ), (int)71);
            }
            switch ((int)object3) {
                case 206041925: {
                    callSite = nd.hlbm("hlnl", hlbj(int ), (int)72);
                    continue block17;
                }
                case 1076290759: {
                    break block17;
                }
                case 1716485494: {
                    callSite = nd.hlbm("hlnn", hlbj(int ), (int)73);
                    continue block17;
                }
            }
            break;
        }
        boolean bl5 = a;
        if (bl2) {
            throw null;
        }
        if (bl5 || bl5) {
            return (int)nd.hlbm("hlno", hlbr(int ), (int)39);
        }
        return n2 >> nd.hlbm("hlnp", hlbr(int ), (int)40) & nd.hlbm("hlnq", hlbr(int ), (int)41);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] diagonal(int var0, int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnzv", hlbj(int ), (int)481)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hnzw", hlbr(int ), (int)1044)) break;
            v0 /* !! */  = (long)nd.hlbm("hnzx", hlbr(int ), (int)1045);
        }
        var7_2 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl12
        block39: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hnzy", hlbj(int ), (int)482));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1508427521: {
                    v2 = nd.hlbm("hnzz", hlbj(int ), (int)483);
                    continue block39;
                }
                case -1082452449: {
                    v2 = nd.hlbm("hoaa", hlbj(int ), (int)484);
                    continue block39;
                }
                case 28104497: {
                    v2 = nd.hlbm("hoab", hlbj(int ), (int)485);
                    continue block39;
                }
                case 1076290759: {
                    break block39;
                }
            }
            break;
        }
        var6_3 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hoac", hlbj(int ), (int)486)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nd.hlbm("hoad", hlbr(int ), (int)1046)) break;
            v3 /* !! */  = (long)nd.hlbm("hoae", hlbr(int ), (int)1047);
        }
        var5_4 = nd.a;
        if (var7_2) {
            throw null;
lbl34:
            // 5 sources

            return null;
        }
        if (var5_4 || var5_4) ** GOTO lbl34
        v4 = nd.hlbm("hoaf", hlzk(int ), (int)1048);
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hoag", hlbj(int ), (int)487)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == nd.hlbm("hoah", hlbr(int ), (int)1049)) break;
            v5 /* !! */  = (long)nd.hlbm("hoai", hlbr(int ), (int)1050);
        }
        var2_5 = nd.blend(var0, var1_1, (float)v4);
        if (var5_4) ** GOTO lbl34
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl34
                v6 = nd.hlbm("hoaj", hlzk(int ), (int)1051);
                v7 /* !! */  = nd.oo;
                if (true) ** GOTO lbl55
                block43: while (true) {
                    v7 /* !! */  = (long)(v8 - nd.hlbm("hoak", hlbj(int ), (int)488));
lbl55:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1897605272: {
                            v8 = nd.hlbm("hoal", hlbj(int ), (int)489);
                            continue block43;
                        }
                        case -1331625569: {
                            v8 = nd.hlbm("hoam", hlbj(int ), (int)490);
                            continue block43;
                        }
                        case 433300053: {
                            v8 = nd.hlbm("hoan", hlbj(int ), (int)491);
                            continue block43;
                        }
                        case 1076290759: {
                            break block43;
                        }
                    }
                    break;
                }
                var3_6 = nd.blend(var0, var1_1, (float)v6);
                if (var5_4 || var5_4) ** GOTO lbl34
                v9 = nd.hlbm("hoao", hlzk(int ), (int)1052);
                v10 /* !! */  = nd.oo;
                if (true) ** GOTO lbl74
                block44: while (true) {
                    v10 /* !! */  = (long)(v11 - nd.hlbm("hoap", hlbj(int ), (int)492));
lbl74:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1283687145: {
                            v11 = nd.hlbm("hoaq", hlbj(int ), (int)493);
                            continue block44;
                        }
                        case 1076290759: {
                            break block44;
                        }
                        case 1283947165: {
                            v11 = nd.hlbm("hoar", hlbj(int ), (int)494);
                            continue block44;
                        }
                        case 1363169346: {
                            v11 = nd.hlbm("hoas", hlbj(int ), (int)495);
                            continue block44;
                        }
                    }
                    break;
                }
                var4_7 = nd.blend(var0, var1_1, (float)v9);
                if (!var5_4 && !var5_4) ** break;
                ** continue;
                v12 = new int[9];
                v12[0] = var0;
                v13 = nd.hlbm("hoat", hlbr(int ), (int)1053);
                v14 = nd.hlbm("hoau", hlzk(int ), (int)1054);
                while (true) {
                    if ((v15 = (cfr_temp_3 = nd.oo - nd.hlbm("hoav", hlbj(int ), (int)496)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 == nd.hlbm("hoaw", hlbr(int ), (int)1055)) break;
                    v15 = -1790295156;
                }
                v12[v13] = nd.blend(var0, var2_5, (float)v14);
                v12[2] = var2_5;
                v16 = nd.hlbm("hoax", hlbr(int ), (int)1056);
                v17 = nd.hlbm("hoay", hlzk(int ), (int)1057);
                while (true) {
                    if ((v18 = (cfr_temp_4 = nd.oo - nd.hlbm("hoaz", hlbj(int ), (int)497)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v18 == nd.hlbm("hoba", hlbr(int ), (int)1058)) break;
                    v18 = 1097202197;
                }
                v12[v16] = nd.blend(var0, var3_6, (float)v17);
                v12[4] = var4_7;
                v19 = nd.hlbm("hobb", hlbr(int ), (int)1059);
                v20 = nd.hlbm("hobc", hlzk(int ), (int)1060);
                v21 /* !! */  = nd.oo;
                if (true) ** GOTO lbl117
                block47: while (true) {
                    v21 /* !! */  = (long)(nd.hlbm("hobe", hlbj(int ), (int)499) - nd.hlbm("hobd", hlbj(int ), (int)498));
lbl117:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case 1076290759: {
                            break block47;
                        }
                        case 1346266642: {
                            continue block47;
                        }
                    }
                    break;
                }
                v12[v19] = nd.blend(var2_5, var1_1, (float)v20);
                v12[6] = var3_6;
                v22 = nd.hlbm("hobf", hlbr(int ), (int)1061);
                v23 = nd.hlbm("hobg", hlzk(int ), (int)1062);
                v24 /* !! */  = nd.oo;
                if (true) ** GOTO lbl130
                block48: while (true) {
                    v24 /* !! */  = (long)(nd.hlbm("hobi", hlbj(int ), (int)501) - nd.hlbm("hobh", hlbj(int ), (int)500));
lbl130:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 1076290759: {
                            break block48;
                        }
                        case 1445099231: {
                            continue block48;
                        }
                    }
                    break;
                }
                v12[v22] = nd.blend(var3_6, var1_1, (float)v23);
                v12[8] = var1_1;
                return v12;
            }
            case 0: {
                var6_3 /* !! */  = (int)nd.hlbm("hobj", hlbr(int ), (int)1063);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl143:
            // 2 sources

            case 1: {
                var6_3 /* !! */  = (int)nd.hlbm("hobk", hlbr(int ), (int)1064);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 2: {
                var6_3 /* !! */  = (int)nd.hlbm("hobl", hlbr(int ), (int)1065);
                if (!var7_2) break;
                throw null;
            }
lbl152:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)nd.hlbm("hobm", hlbr(int ), (int)1066);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 4: {
                var6_3 /* !! */  = (int)nd.hlbm("hobn", hlbr(int ), (int)1067);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl162:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)nd.hlbm("hobo", hlbr(int ), (int)1068);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl167:
            // 4 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)nd.hlbm("hobp", hlbr(int ), (int)1069);
                    if (!var7_2) ** GOTO lbl162
                    throw null;
                }
            }
lbl172:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)nd.hlbm("hobq", hlbr(int ), (int)1070);
                if (!var7_2) ** GOTO lbl152
                throw null;
            }
lbl176:
            // 2 sources

            case 8: {
                var6_3 /* !! */  = (int)nd.hlbm("hobr", hlbr(int ), (int)1071);
                if (!var7_2) ** GOTO lbl143
                throw null;
            }
            case 9: 
        }
        var6_3 /* !! */  = (int)nd.hlbm("hobs", hlbr(int ), (int)1072);
        ** while (!var7_2)
lbl183:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hpqk() {
        nd.hlbk[200] = 6256521424978154337L;
        nd.hlbk[201] = 5361942918552818717L;
        nd.hlbk[202] = -6144016574834692400L;
        nd.hlbk[203] = 1433501685422252062L;
        nd.hlbk[204] = -6392337997091652286L;
        nd.hlbk[205] = 5698189388146373308L;
        nd.hlbk[206] = -198311000102582926L;
        nd.hlbk[207] = -3968532936683465337L;
        nd.hlbk[208] = 7077129590601744056L;
        nd.hlbk[209] = 796188003784477266L;
        nd.hlbk[210] = 8306319920835487518L;
        nd.hlbk[211] = 3944116009456181778L;
        nd.hlbk[212] = 6912178086719012886L;
        nd.hlbk[213] = 3046586755659143658L;
        nd.hlbk[214] = -1912810810615874827L;
        nd.hlbk[215] = 7369949796189173208L;
        nd.hlbk[216] = 5468122574184759207L;
        nd.hlbk[217] = 8354314552707147250L;
        nd.hlbk[218] = -7272675181015072366L;
        nd.hlbk[219] = 8415945750913493269L;
        nd.hlbk[220] = -8456877335518962835L;
        nd.hlbk[221] = 4894694962740684929L;
        nd.hlbk[222] = -3379523053596103841L;
        nd.hlbk[223] = -5497614563513822980L;
        nd.hlbk[224] = 8521931059152643177L;
        nd.hlbk[225] = 2923941267144803675L;
        nd.hlbk[226] = -5582447813832689426L;
        nd.hlbk[227] = -6062339049343891434L;
        nd.hlbk[228] = -8368138175681499040L;
        nd.hlbk[229] = -970682262838870760L;
        nd.hlbk[230] = -2760812767142933346L;
        nd.hlbk[231] = -4729850441332675475L;
        nd.hlbk[232] = -7936785559184951612L;
        nd.hlbk[233] = -3732999970412155348L;
        nd.hlbk[234] = 3949941459774655743L;
        nd.hlbk[235] = -1284107915473911692L;
        nd.hlbk[236] = -1559481712404921604L;
        nd.hlbk[237] = -5288284022732934668L;
        nd.hlbk[238] = -4913978555769823400L;
        nd.hlbk[239] = 82654511632089519L;
        nd.hlbk[240] = -7648789709687332896L;
        nd.hlbk[241] = 231335033943539898L;
        nd.hlbk[242] = -4307571993114858337L;
        nd.hlbk[243] = -2259409513782646766L;
        nd.hlbk[244] = -4444349007711074743L;
        nd.hlbk[245] = -2274928572081465581L;
        nd.hlbk[246] = 3864820303278169187L;
        nd.hlbk[247] = 7481036431411784135L;
        nd.hlbk[248] = 2607356320117999498L;
        nd.hlbk[249] = -110758032591641251L;
        nd.hlbk[250] = -6046783844247211624L;
        nd.hlbk[251] = -2496139412069166506L;
        nd.hlbk[252] = -4455624421012219234L;
        nd.hlbk[253] = -8387590819095447040L;
        nd.hlbk[254] = 3993209812140365028L;
        nd.hlbk[255] = 428146790153598585L;
        nd.hlbk[256] = 8590128446673772980L;
        nd.hlbk[257] = 8669568865501212764L;
        nd.hlbk[258] = 3322138139042129052L;
        nd.hlbk[259] = -1552876188690203350L;
        nd.hlbk[260] = 6077406986257462348L;
        nd.hlbk[261] = -4329326174373650042L;
        nd.hlbk[262] = 273242472490196899L;
        nd.hlbk[263] = -8988621931422972708L;
        nd.hlbk[264] = 6709736745589786787L;
        nd.hlbk[265] = 5297748823645880785L;
        nd.hlbk[266] = 3061302330673448050L;
        nd.hlbk[267] = 3848591751721194256L;
        nd.hlbk[268] = 6779034589535691035L;
        nd.hlbk[269] = 7956109621328965247L;
        nd.hlbk[270] = -832302696266715325L;
        nd.hlbk[271] = -5945993613805004627L;
        nd.hlbk[272] = -8680295588434311360L;
        nd.hlbk[273] = -327037586460415043L;
        nd.hlbk[274] = -6927172834372402451L;
        nd.hlbk[275] = 5018018768090439662L;
        nd.hlbk[276] = 9003690933611805423L;
        nd.hlbk[277] = 8189854094694691267L;
        nd.hlbk[278] = -8537844852843260890L;
        nd.hlbk[279] = 6312693117785987315L;
        nd.hlbk[280] = 2523889196598696554L;
        nd.hlbk[281] = 9189079445827458440L;
        nd.hlbk[282] = 2131897475057742232L;
        nd.hlbk[283] = -7929055378821622340L;
        nd.hlbk[284] = -1529347942400281635L;
        nd.hlbk[285] = -7480611452637627089L;
        nd.hlbk[286] = -3398530283917358583L;
        nd.hlbk[287] = 6158306159087478857L;
        nd.hlbk[288] = -5617163847723622404L;
        nd.hlbk[289] = -5809774154240967903L;
        nd.hlbk[290] = -1734365865684362234L;
        nd.hlbk[291] = -5050008858948389730L;
        nd.hlbk[292] = 3606936301911619472L;
        nd.hlbk[293] = -7321077995206586516L;
        nd.hlbk[294] = 5600139173134321968L;
        nd.hlbk[295] = -1427949075074031320L;
        nd.hlbk[296] = -460255745515915064L;
        nd.hlbk[297] = 6956881165651958863L;
        nd.hlbk[298] = 8367524710358519082L;
        nd.hlbk[299] = -500869872221977281L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static int colorForRectsBlack$() {
        boolean bl2;
        Object object = oo;
        block19: while (true) {
            switch ((int)object) {
                case -365420514: {
                    object = nd.hlbm("hnla", hlbj(int ), (int)335) - nd.hlbm("hnkz", hlbj(int ), (int)334);
                    continue block19;
                }
                case 1076290759: {
                    break block19;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = oo;
        block20: while (true) {
            switch ((int)object2) {
                case 1076290759: {
                    break block20;
                }
                case 1654087638: {
                    object2 = nd.hlbm("hnlc", hlbj(int ), (int)337) - nd.hlbm("hnlb", hlbj(int ), (int)336);
                    continue block20;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = oo - nd.hlbm("hnld", hlbj(int ), (int)338)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == nd.hlbm("hnle", hlbr(int ), (int)805)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = nd.hlbm("hnlf", hlbr(int ), (int)806);
        }
        if (bl2) return (int)nd.hlbm("hnlg", hlbr(int ), (int)807);
        if (bl2) return (int)nd.hlbm("hnlg", hlbr(int ), (int)807);
        Object object4 = oo;
        boolean bl4 = true;
        block22: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - nd.hlbm("hnlh", hlbj(int ), (int)339);
            }
            switch ((int)object4) {
                case -1882173570: {
                    callSite = nd.hlbm("hnli", hlbj(int ), (int)340);
                    continue block22;
                }
                case -40159581: {
                    callSite = nd.hlbm("hnlj", hlbj(int ), (int)341);
                    continue block22;
                }
                case 715388713: {
                    callSite = nd.hlbm("hnlk", hlbj(int ), (int)342);
                    continue block22;
                }
                case 1076290759: {
                    break block22;
                }
            }
            break;
        }
        CallSite callSite4 = nd.hlbm("hnll", hlbr(int ), (int)808);
        callSite4 = nd.hlbm("hnlm", hlbr(int ), (int)809);
        callSite4 = nd.hlbm("hnln", hlbr(int ), (int)810);
        callSite4 = nd.hlbm("hnlo", hlbr(int ), (int)811);
        Object object5 = oo;
        boolean bl5 = true;
        block23: while (true) {
            CallSite callSite5;
            if (!bl5 || (bl5 = false) || !true) {
                object5 = callSite5 - nd.hlbm("hnlp", hlbj(int ), (int)343);
            }
            switch ((int)object5) {
                case -1307780420: {
                    callSite5 = nd.hlbm("hnlq", hlbj(int ), (int)344);
                    continue block23;
                }
                case -1109065564: {
                    callSite5 = nd.hlbm("hnlr", hlbj(int ), (int)345);
                    continue block23;
                }
                case 1076290759: {
                    break block23;
                }
            }
            break;
        }
        Color color = new Color((int)callSite, (int)callSite2, (int)callSite3, (int)callSite4);
        while (true) {
            long l3;
            Object object6;
            if ((object6 = (l3 = oo - nd.hlbm("hnls", hlbj(int ), (int)346)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object6 == nd.hlbm("hnlt", hlbr(int ), (int)812)) {
                return color.getRGB();
            }
            object6 = nd.hlbm("hnlu", hlbr(int ), (int)813);
        }
    }

    private static /* synthetic */ void hpls() {
        nd.hlbs[1500] = 1377580633;
        nd.hlbs[1501] = 1011323921;
        nd.hlbs[1502] = 1643330335;
        nd.hlbs[1503] = 187068796;
        nd.hlbs[1504] = -983222717;
        nd.hlbs[1505] = -1586935387;
        nd.hlbs[1506] = -1066476110;
        nd.hlbs[1507] = -895107867;
        nd.hlbs[1508] = 35907149;
        nd.hlbs[1509] = -471694805;
        nd.hlbs[1510] = 1228698799;
        nd.hlbs[1511] = 1547460565;
        nd.hlbs[1512] = 45862182;
        nd.hlbs[1513] = 1815103240;
        nd.hlbs[1514] = -142917391;
        nd.hlbs[1515] = -492189478;
        nd.hlbs[1516] = 316331199;
        nd.hlbs[1517] = 1621941025;
        nd.hlbs[1518] = 733885902;
        nd.hlbs[1519] = -638963697;
        nd.hlbs[1520] = 1788082227;
        nd.hlbs[1521] = 1745196292;
        nd.hlbs[1522] = -197824304;
        nd.hlbs[1523] = 608559519;
        nd.hlbs[1524] = 2140649752;
        nd.hlbs[1525] = 1264381203;
        nd.hlbs[1526] = 1467948045;
        nd.hlbs[1527] = 1488868155;
        nd.hlbs[1528] = 1478993274;
        nd.hlbs[1529] = -1580913454;
        nd.hlbs[1530] = 1655302429;
        nd.hlbs[1531] = -1562620890;
        nd.hlbs[1532] = 715664330;
        nd.hlbs[1533] = 135662448;
        nd.hlbs[1534] = 944809367;
        nd.hlbs[1535] = -721209962;
        nd.hlbs[1536] = -398556227;
        nd.hlbs[1537] = 219253790;
        nd.hlbs[1538] = 1173474321;
        nd.hlbs[1539] = 1732160750;
        nd.hlbs[1540] = 83117861;
        nd.hlbs[1541] = 1335401545;
        nd.hlbs[1542] = 1711885107;
        nd.hlbs[1543] = 2110482986;
        nd.hlbs[1544] = 696422834;
        nd.hlbs[1545] = -208678146;
        nd.hlbs[1546] = 1528066497;
        nd.hlbs[1547] = -644457653;
        nd.hlbs[1548] = 984594389;
        nd.hlbs[1549] = 43567025;
        nd.hlbs[1550] = -1783416945;
        nd.hlbs[1551] = -1019798696;
        nd.hlbs[1552] = -1924666109;
        nd.hlbs[1553] = 854192286;
        nd.hlbs[1554] = 1268339772;
        nd.hlbs[1555] = -1583798912;
        nd.hlbs[1556] = 359295615;
        nd.hlbs[1557] = 1145112254;
        nd.hlbs[1558] = 1765071450;
        nd.hlbs[1559] = 1121545468;
        nd.hlbs[1560] = -1721112126;
        nd.hlbs[1561] = 1479030615;
        nd.hlbs[1562] = -1273542364;
        nd.hlbs[1563] = 236206251;
        nd.hlbs[1564] = 890801003;
        nd.hlbs[1565] = -1887001318;
        nd.hlbs[1566] = -1819719104;
        nd.hlbs[1567] = -1439077548;
        nd.hlbs[1568] = -414943160;
        nd.hlbs[1569] = -1074200139;
        nd.hlbs[1570] = -427782812;
        nd.hlbs[1571] = -826566599;
        nd.hlbs[1572] = 699126932;
        nd.hlbs[1573] = 938947162;
        nd.hlbs[1574] = 1169323826;
        nd.hlbs[1575] = 1095797884;
        nd.hlbs[1576] = 956553816;
        nd.hlbs[1577] = -2053610456;
        nd.hlbs[1578] = 888511861;
        nd.hlbs[1579] = -1371526603;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] getClientColorHorizontalGradient() {
        block209: {
            block208: {
                var19 = nd.c;
                var18_1 /* !! */  = nd.b;
                var17_2 = nd.a;
                if (var19) {
                    throw null;
lbl6:
                    // 53 sources

                    return null;
                }
                if (var17_2 || var17_2) ** GOTO lbl6
                var0_3 = nd.getActiveColorCount();
                if (var17_2 || var17_2) ** GOTO lbl6
                if (var0_3 != 0) break block208;
                if (var17_2 || var17_2) ** GOTO lbl6
                return nd.horizontal(nd.getClientColorDark(), nd.getClientColor());
            }
            if (var17_2 || var17_2) ** GOTO lbl6
            if (var0_3 != nd.hlbm("hmqd", hlbr(int ), (int)582)) break block209;
            if (var17_2 || var17_2) ** GOTO lbl6
            var1_4 = nd.clientColors[0];
            if (var17_2 || var17_2) ** GOTO lbl6
            var2_7 = nd.rgba((int)((float)(var1_4 >> nd.hlbm("hmqe", hlbr(int ), (int)583) & nd.hlbm("hmqf", hlbr(int ), (int)584)) * nd.hlbm("hmqg", hlzk(int ), (int)585)), (int)((float)(var1_4 >> nd.hlbm("hmqh", hlbr(int ), (int)586) & nd.hlbm("hmqi", hlbr(int ), (int)587)) * nd.hlbm("hmqj", hlzk(int ), (int)588)), (int)((float)(var1_4 & nd.hlbm("hmqk", hlbr(int ), (int)589)) * nd.hlbm("hmql", hlzk(int ), (int)590)), (int)nd.hlbm("hmqm", hlbr(int ), (int)591));
            if (var17_2 || var17_2) ** GOTO lbl6
            return nd.horizontal(var2_7, var1_4);
        }
        if (var17_2 || var17_2) ** GOTO lbl6
        if (!nd.clientColorMode.equals("\u041f\u0435\u0440\u0435\u043b\u0438\u0432\u0430\u043d\u0438\u0435")) ** GOTO lbl111
        if (var17_2 || var17_2) ** GOTO lbl6
        var1_5 = System.currentTimeMillis();
        if (var17_2 || var17_2) ** GOTO lbl6
        var3_9 = nd.hlbm("hmqn", hlzk(int ), (int)592);
        if (var17_2 || var17_2) ** GOTO lbl6
        var4_11 = (float)((var1_5 - nd.colorTransitionStart) % (long)var3_9) / var3_9;
        if (var17_2 || var17_2) ** GOTO lbl6
        var5_13 = new int[9];
        if (var17_2 || var17_2) ** GOTO lbl6
        var6_15 = nd.hlbm("hmqo", hlbr(int ), (int)593);
        if (var17_2) ** GOTO lbl6
        block110: while (true) {
            block210: {
                block212: {
                    block211: {
                        if (var17_2 || var17_2) ** GOTO lbl6
                        if (var6_15 >= nd.hlbm("hmqp", hlbr(int ), (int)594)) ** GOTO lbl109
                        if (var17_2 || var17_2) ** GOTO lbl6
                        var7_16 = (float)var6_15 / nd.hlbm("hmqq", hlzk(int ), (int)595);
                        if (var17_2 || var17_2) ** GOTO lbl6
                        var8_17 = var7_16 + var4_11;
                        if (var17_2 || var17_2) ** GOTO lbl6
                        var9_18 = var8_17 - (float)((int)var8_17);
                        if (var17_2 || var17_2) ** GOTO lbl6
                        if (var0_3 != nd.hlbm("hmqr", hlbr(int ), (int)596)) break block210;
                        if (var17_2 || var17_2) ** GOTO lbl6
                        var10_19 = nd.clientColors[0];
                        if (var17_2 || var17_2) ** GOTO lbl6
                        var11_21 = nd.clientColors[1];
                        if (var17_2 || var17_2) ** GOTO lbl6
                        if (!(var9_18 < nd.hlbm("hmqs", hlzk(int ), (int)597))) break block211;
                        if (var17_2 || var17_2) ** GOTO lbl6
                        var5_13[var6_15] = nd.interpolateColor(var10_19, var11_21, var9_18 * 2.0f, (int)nd.hlbm("hmqt", hlbr(int ), (int)598));
                        if (var17_2) ** GOTO lbl6
                        if (var19) {
                            throw null;
                        }
                        break block212;
                    }
                    if (var17_2 || var17_2) ** GOTO lbl6
                    var5_13[var6_15] = nd.interpolateColor(var11_21, var10_19, (var9_18 - nd.hlbm("hmqu", hlzk(int ), (int)599)) * 2.0f, (int)nd.hlbm("hmqv", hlbr(int ), (int)600));
                    if (var17_2) ** GOTO lbl6
                }
                if (var17_2 || var17_2) ** GOTO lbl6
                if (var19) {
                    throw null;
                }
                ** GOTO lbl104
            }
            if (var17_2 || var17_2) ** GOTO lbl6
            var10_20 = var0_3;
            if (var17_2 || var17_2) ** GOTO lbl6
            var11_22 = var9_18 * var10_20;
            if (var17_2 || var17_2) ** GOTO lbl6
            var12_23 = (int)var11_22;
            if (var17_2 || var17_2) ** GOTO lbl6
            var13_24 = var11_22 - (float)var12_23;
            if (var17_2 || var17_2) ** GOTO lbl6
            if (var12_23 < var0_3 - nd.hlbm("hmqw", hlbr(int ), (int)601)) ** GOTO lbl95
            if (var17_2 || var17_2) ** GOTO lbl6
            var14_25 = nd.clientColors[var0_3 - 1];
            if (var17_2 || var17_2) ** GOTO lbl6
            var15_26 = nd.clientColors[0];
            if (var17_2 || var17_2) ** GOTO lbl6
            var16_27 = var11_22 - (float)(var0_3 - nd.hlbm("hmqx", hlbr(int ), (int)602));
            if (var17_2 || var17_2) ** GOTO lbl6
            if (var18_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var18_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    var5_13[var6_15] = nd.interpolateColor(var14_25, var15_26, var16_27, (int)nd.hlbm("hmqy", hlbr(int ), (int)603));
                    if (var17_2 || var17_2) ** GOTO lbl6
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl104
                }
lbl95:
                // 1 sources

                if (var17_2 || var17_2) ** GOTO lbl6
                var12_23 = Math.min(var12_23, var0_3 - nd.hlbm("hmqz", hlbr(int ), (int)604));
                if (var17_2 || var17_2) ** GOTO lbl6
                var14_25 = nd.clientColors[var12_23];
                if (var17_2 || var17_2) ** GOTO lbl6
                var15_26 = nd.clientColors[var12_23 + 1];
                if (var17_2 || var17_2) ** GOTO lbl6
                var5_13[var6_15] = nd.interpolateColor(var14_25, var15_26, var13_24, (int)nd.hlbm("hmra", hlbr(int ), (int)605));
                if (var17_2) ** GOTO lbl6
lbl104:
                // 3 sources

                if (var17_2 || var17_2) ** GOTO lbl6
                ++var6_15;
                if (var17_2) ** GOTO lbl6
                if (!var19) continue block110;
                throw null;
lbl109:
                // 1 sources

                if (var17_2 || var17_2) ** GOTO lbl6
                return var5_13;
lbl111:
                // 1 sources

                if (var17_2 || var17_2) ** GOTO lbl6
                if (var0_3 != nd.hlbm("hmrb", hlbr(int ), (int)606)) ** GOTO lbl115
                if (var17_2 || var17_2) ** GOTO lbl6
                return nd.horizontal(nd.clientColors[0], nd.clientColors[1]);
lbl115:
                // 1 sources

                if (var17_2 || var17_2) ** GOTO lbl6
                var1_6 = nd.clientColors[0];
                if (var17_2 || var17_2) ** GOTO lbl6
                var2_8 = nd.clientColors[1];
                if (var17_2 || var17_2) ** GOTO lbl6
                var3_10 = nd.clientColors[2];
                if (var17_2 || var17_2) ** GOTO lbl6
                var4_12 = nd.blend(var1_6, var2_8, (float)nd.hlbm("hmrc", hlzk(int ), (int)607));
                if (var17_2 || var17_2) ** GOTO lbl6
                var5_14 = nd.blend(var2_8, var3_10, (float)nd.hlbm("hmrd", hlzk(int ), (int)608));
                if (!var17_2 && !var17_2) ** break;
                ** continue;
                return new int[]{var1_6, var4_12, var2_8, var5_14, var3_10, var5_14, var2_8, var4_12};
lbl128:
                // 2 sources

                case 0: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmre", hlbr(int ), (int)609);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
lbl133:
                // 3 sources

                case 1: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrf", hlbr(int ), (int)610);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl590
                }
lbl138:
                // 3 sources

                case 2: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrg", hlbr(int ), (int)611);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl364
                }
                case 3: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrh", hlbr(int ), (int)612);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl468
                }
                case 4: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmri", hlbr(int ), (int)613);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
                case 5: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrj", hlbr(int ), (int)614);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl193
                }
                case 6: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrk", hlbr(int ), (int)615);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl566
                }
lbl163:
                // 5 sources

                case 7: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrl", hlbr(int ), (int)616);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl500
                }
lbl168:
                // 2 sources

                case 8: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrm", hlbr(int ), (int)617);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl517
                }
lbl173:
                // 2 sources

                case 9: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrn", hlbr(int ), (int)618);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl227
                }
                case 10: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmro", hlbr(int ), (int)619);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl477
                }
                case 11: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrp", hlbr(int ), (int)620);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl521
                }
lbl188:
                // 2 sources

                case 12: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrq", hlbr(int ), (int)621);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl264
                }
lbl193:
                // 2 sources

                case 13: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrr", hlbr(int ), (int)622);
                    if (!var19) ** GOTO lbl133
                    throw null;
                }
                case 14: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrs", hlbr(int ), (int)623);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl441
                }
lbl202:
                // 2 sources

                case 15: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrt", hlbr(int ), (int)624);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl508
                }
                case 16: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmru", hlbr(int ), (int)625);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl341
                }
                case 17: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrv", hlbr(int ), (int)626);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl259
                }
                case 18: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrw", hlbr(int ), (int)627);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl400
                }
                case 19: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrx", hlbr(int ), (int)628);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl517
                }
lbl227:
                // 2 sources

                case 20: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmry", hlbr(int ), (int)629);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl350
                }
lbl232:
                // 2 sources

                case 21: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmrz", hlbr(int ), (int)630);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl297
                }
                case 22: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsa", hlbr(int ), (int)631);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl255
                }
lbl242:
                // 2 sources

                case 23: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsb", hlbr(int ), (int)632);
                    if (!var19) ** GOTO lbl163
                    throw null;
                }
lbl246:
                // 3 sources

                case 24: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsc", hlbr(int ), (int)633);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl369
                }
                case 25: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsd", hlbr(int ), (int)634);
                    if (!var19) ** GOTO lbl242
                    throw null;
                }
lbl255:
                // 3 sources

                case 26: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmse", hlbr(int ), (int)635);
                    if (!var19) ** GOTO lbl246
                    throw null;
                }
lbl259:
                // 4 sources

                case 27: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsf", hlbr(int ), (int)636);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl504
                }
lbl264:
                // 3 sources

                case 28: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsg", hlbr(int ), (int)637);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl582
                }
                case 29: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsh", hlbr(int ), (int)638);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl437
                }
lbl274:
                // 2 sources

                case 30: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsi", hlbr(int ), (int)639);
                    if (!var19) ** GOTO lbl188
                    throw null;
                }
lbl278:
                // 2 sources

                case 31: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsj", hlbr(int ), (int)640);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl541
                }
lbl283:
                // 3 sources

                case 32: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsk", hlbr(int ), (int)641);
                    if (var19) {
                        throw null;
                    }
                }
                case 33: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsl", hlbr(int ), (int)642);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl517
                }
lbl292:
                // 3 sources

                case 34: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsm", hlbr(int ), (int)643);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl549
                }
lbl297:
                // 4 sources

                case 35: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsn", hlbr(int ), (int)644);
                    if (!var19) ** GOTO lbl283
                    throw null;
                }
                case 36: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmso", hlbr(int ), (int)645);
                    if (!var19) ** GOTO lbl128
                    throw null;
                }
lbl305:
                // 2 sources

                case 37: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsp", hlbr(int ), (int)646);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl400
                }
lbl310:
                // 2 sources

                case 38: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsq", hlbr(int ), (int)647);
                    if (!var19) ** GOTO lbl163
                    throw null;
                }
                case 39: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsr", hlbr(int ), (int)648);
                    if (!var19) ** GOTO lbl255
                    throw null;
                }
lbl318:
                // 3 sources

                case 40: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmss", hlbr(int ), (int)649);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl487
                }
                case 41: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmst", hlbr(int ), (int)650);
                    if (!var19) ** GOTO lbl264
                    throw null;
                }
                case 42: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsu", hlbr(int ), (int)651);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl355
                }
                case 43: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsv", hlbr(int ), (int)652);
                    if (!var19) ** GOTO lbl292
                    throw null;
                }
                case 44: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsw", hlbr(int ), (int)653);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl364
                }
lbl341:
                // 3 sources

                case 45: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsx", hlbr(int ), (int)654);
                    if (!var19) ** GOTO lbl292
                    throw null;
                }
                case 46: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsy", hlbr(int ), (int)655);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl468
                }
lbl350:
                // 3 sources

                case 47: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmsz", hlbr(int ), (int)656);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl445
                }
lbl355:
                // 2 sources

                case 48: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmta", hlbr(int ), (int)657);
                    if (!var19) ** GOTO lbl274
                    throw null;
                }
                case 49: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtb", hlbr(int ), (int)658);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl392
                }
lbl364:
                // 4 sources

                case 50: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtc", hlbr(int ), (int)659);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl454
                }
lbl369:
                // 3 sources

                case 51: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtd", hlbr(int ), (int)660);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl445
                }
                case 52: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmte", hlbr(int ), (int)661);
                    if (!var19) ** GOTO lbl305
                    throw null;
                }
lbl378:
                // 2 sources

                case 53: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtf", hlbr(int ), (int)662);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl468
                }
                case 54: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtg", hlbr(int ), (int)663);
                    if (!var19) ** GOTO lbl297
                    throw null;
                }
                case 55: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmth", hlbr(int ), (int)664);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl603
                }
lbl392:
                // 2 sources

                case 56: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmti", hlbr(int ), (int)665);
                    if (!var19) ** GOTO lbl133
                    throw null;
                }
                case 57: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtj", hlbr(int ), (int)666);
                    if (!var19) ** GOTO lbl278
                    throw null;
                }
lbl400:
                // 3 sources

                case 58: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtk", hlbr(int ), (int)667);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl549
                }
lbl405:
                // 3 sources

                case 59: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtl", hlbr(int ), (int)668);
                    if (!var19) ** GOTO lbl297
                    throw null;
                }
lbl409:
                // 2 sources

                case 60: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtm", hlbr(int ), (int)669);
                    if (!var19) ** GOTO lbl310
                    throw null;
                }
                case 61: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtn", hlbr(int ), (int)670);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl500
                }
lbl418:
                // 3 sources

                case 62: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmto", hlbr(int ), (int)671);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl504
                }
                case 63: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtp", hlbr(int ), (int)672);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl553
                }
                case 64: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtq", hlbr(int ), (int)673);
                    if (!var19) ** GOTO lbl369
                    throw null;
                }
                case 65: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtr", hlbr(int ), (int)674);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl533
                }
lbl437:
                // 2 sources

                case 66: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmts", hlbr(int ), (int)675);
                    if (!var19) ** GOTO lbl409
                    throw null;
                }
lbl441:
                // 3 sources

                case 67: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtt", hlbr(int ), (int)676);
                    if (!var19) ** GOTO lbl318
                    throw null;
                }
lbl445:
                // 3 sources

                case 68: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtu", hlbr(int ), (int)677);
                    if (!var19) ** GOTO lbl232
                    throw null;
                }
                case 69: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtv", hlbr(int ), (int)678);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl468
                }
lbl454:
                // 2 sources

                case 70: {
                    var18_1 /* !! */  = (int)nd.hlbm("hmtw", hlbr(int ), (int)679);
                    if (!var19) ** GOTO lbl441
                    throw null;
                }
lbl458:
                // 2 sources

                case 71: {
                    var18_1 /* !! */  = (int)nd.hlbm("hndt", hlbr(int ), (int)680);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl590
                }
                case 72: {
                    var18_1 /* !! */  = (int)nd.hlbm("hndu", hlbr(int ), (int)681);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl582
                }
lbl468:
                // 5 sources

                case 73: {
                    var18_1 /* !! */  = (int)nd.hlbm("hndv", hlbr(int ), (int)682);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl500
                }
                case 74: {
                    var18_1 /* !! */  = (int)nd.hlbm("hndw", hlbr(int ), (int)683);
                    if (!var19) ** GOTO lbl138
                    throw null;
                }
lbl477:
                // 3 sources

                case 75: {
                    var18_1 /* !! */  = (int)nd.hlbm("hndx", hlbr(int ), (int)684);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl496
                }
                case 76: {
                    var18_1 /* !! */  = (int)nd.hlbm("hndy", hlbr(int ), (int)685);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl558
                }
lbl487:
                // 2 sources

                case 77: {
                    var18_1 /* !! */  = (int)nd.hlbm("hndz", hlbr(int ), (int)686);
                    if (!var19) ** GOTO lbl350
                    throw null;
                }
                case 78: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnea", hlbr(int ), (int)687);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl517
                }
lbl496:
                // 2 sources

                case 79: {
                    var18_1 /* !! */  = (int)nd.hlbm("hneb", hlbr(int ), (int)688);
                    if (!var19) ** GOTO lbl418
                    throw null;
                }
lbl500:
                // 4 sources

                case 80: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnec", hlbr(int ), (int)689);
                    if (!var19) ** GOTO lbl259
                    throw null;
                }
lbl504:
                // 3 sources

                case 81: {
                    var18_1 /* !! */  = (int)nd.hlbm("hned", hlbr(int ), (int)690);
                    if (!var19) ** GOTO lbl458
                    throw null;
                }
lbl508:
                // 3 sources

                case 82: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnee", hlbr(int ), (int)691);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl562
                }
                case 83: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnef", hlbr(int ), (int)692);
                    if (!var19) ** GOTO lbl163
                    throw null;
                }
lbl517:
                // 5 sources

                case 84: {
                    var18_1 /* !! */  = (int)nd.hlbm("hneg", hlbr(int ), (int)693);
                    if (!var19) ** GOTO lbl364
                    throw null;
                }
lbl521:
                // 2 sources

                case 85: {
                    var18_1 /* !! */  = (int)nd.hlbm("hneh", hlbr(int ), (int)694);
                    if (!var19) ** GOTO lbl163
                    throw null;
                }
                case 86: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnei", hlbr(int ), (int)695);
                    if (!var19) ** GOTO lbl508
                    throw null;
                }
lbl529:
                // 2 sources

                case 87: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnej", hlbr(int ), (int)696);
                    if (!var19) ** GOTO lbl405
                    throw null;
                }
lbl533:
                // 2 sources

                case 88: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnek", hlbr(int ), (int)697);
                    if (!var19) ** GOTO lbl318
                    throw null;
                }
lbl537:
                // 2 sources

                case 89: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnel", hlbr(int ), (int)698);
                    if (!var19) ** GOTO lbl283
                    throw null;
                }
lbl541:
                // 2 sources

                case 90: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnem", hlbr(int ), (int)699);
                    if (!var19) ** GOTO lbl378
                    throw null;
                }
                case 91: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnen", hlbr(int ), (int)700);
                    if (!var19) ** GOTO lbl246
                    throw null;
                }
lbl549:
                // 3 sources

                case 92: {
                    var18_1 /* !! */  = (int)nd.hlbm("hneo", hlbr(int ), (int)701);
                    if (!var19) ** GOTO lbl202
                    throw null;
                }
lbl553:
                // 4 sources

                case 93: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnep", hlbr(int ), (int)702);
                    if (var19) {
                        throw null;
                    }
                    ** GOTO lbl603
                }
lbl558:
                // 2 sources

                case 94: {
                    var18_1 /* !! */  = (int)nd.hlbm("hneq", hlbr(int ), (int)703);
                    if (!var19) ** GOTO lbl405
                    throw null;
                }
lbl562:
                // 2 sources

                case 95: {
                    var18_1 /* !! */  = (int)nd.hlbm("hner", hlbr(int ), (int)704);
                    if (!var19) ** GOTO lbl341
                    throw null;
                }
lbl566:
                // 2 sources

                case 96: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnes", hlbr(int ), (int)705);
                    if (!var19) ** GOTO lbl138
                    throw null;
                }
                case 97: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnet", hlbr(int ), (int)706);
                    if (!var19) ** GOTO lbl477
                    throw null;
                }
lbl574:
                // 2 sources

                case 98: {
                    var18_1 /* !! */  = (int)nd.hlbm("hneu", hlbr(int ), (int)707);
                    if (!var19) ** GOTO lbl173
                    throw null;
                }
                case 99: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnev", hlbr(int ), (int)708);
                    if (!var19) ** GOTO lbl529
                    throw null;
                }
lbl582:
                // 3 sources

                case 100: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnew", hlbr(int ), (int)709);
                    if (!var19) ** GOTO lbl418
                    throw null;
                }
                case 101: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnex", hlbr(int ), (int)710);
                    if (!var19) ** GOTO lbl537
                    throw null;
                }
lbl590:
                // 3 sources

                case 102: {
                    var18_1 /* !! */  = (int)nd.hlbm("hney", hlbr(int ), (int)711);
                    if (!var19) ** GOTO lbl574
                    throw null;
                }
                case 103: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var18_1 /* !! */  = (int)nd.hlbm("hnez", hlbr(int ), (int)712);
                        if (!var19) break block110;
                        throw null;
                    }
                }
                case 104: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnfa", hlbr(int ), (int)713);
                    if (!var19) ** GOTO lbl553
                    throw null;
                }
lbl603:
                // 3 sources

                case 105: {
                    var18_1 /* !! */  = (int)nd.hlbm("hnfb", hlbr(int ), (int)714);
                    if (!var19) ** GOTO lbl553
                    throw null;
                }
                case 106: 
            }
            break;
        }
        var18_1 /* !! */  = (int)nd.hlbm("hnfc", hlbr(int ), (int)715);
        ** while (!var19)
lbl610:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static int getRed(int n2) {
        Object object = oo;
        boolean bl2 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - nd.hlbm("hnho", hlbj(int ), (int)296);
            }
            switch ((int)object) {
                case 1076290759: {
                    break block17;
                }
                case 1448232627: {
                    callSite = nd.hlbm("hnhp", hlbj(int ), (int)297);
                    continue block17;
                }
                case 1449683530: {
                    callSite = nd.hlbm("hnhq", hlbj(int ), (int)298);
                    continue block17;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = oo;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - nd.hlbm("hnhr", hlbj(int ), (int)299);
            }
            switch ((int)object2) {
                case -2082764372: {
                    callSite = nd.hlbm("hnhs", hlbj(int ), (int)300);
                    continue block18;
                }
                case -1526002337: {
                    callSite = nd.hlbm("hnht", hlbj(int ), (int)301);
                    continue block18;
                }
                case 1076290759: {
                    break block18;
                }
                case 1592568843: {
                    callSite = nd.hlbm("hnhu", hlbj(int ), (int)302);
                    continue block18;
                }
            }
            break;
        }
        int n3 = b;
        Object object3 = oo;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - nd.hlbm("hnhv", hlbj(int ), (int)303);
            }
            switch ((int)object3) {
                case -2125335653: {
                    callSite = nd.hlbm("hnhw", hlbj(int ), (int)304);
                    continue block19;
                }
                case -1147874728: {
                    callSite = nd.hlbm("hnhx", hlbj(int ), (int)305);
                    continue block19;
                }
                case -20633487: {
                    callSite = nd.hlbm("hnhy", hlbj(int ), (int)306);
                    continue block19;
                }
                case 1076290759: {
                    break block19;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) {
            return (int)nd.hlbm("hnhz", hlbr(int ), (int)754);
        }
        return n2 >> nd.hlbm("hnia", hlbr(int ), (int)755) & nd.hlbm("hnib", hlbr(int ), (int)756);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getClientColorDark() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hmmx", hlbj(int ), (int)239)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hmmy", hlbr(int ), (int)530)) break;
            v0 /* !! */  = (long)nd.hlbm("hmmz", hlbr(int ), (int)531);
        }
        var6 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl11
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hmna", hlbj(int ), (int)240));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -114473697: {
                    v2 = nd.hlbm("hmnb", hlbj(int ), (int)241);
                    continue block24;
                }
                case 1076290759: {
                    break block24;
                }
                case 1108333088: {
                    v2 = nd.hlbm("hmnc", hlbj(int ), (int)242);
                    continue block24;
                }
            }
            break;
        }
        var5_1 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hmnd", hlbj(int ), (int)243)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nd.hlbm("hmne", hlbr(int ), (int)532)) break;
            v3 /* !! */  = (long)nd.hlbm("hmnf", hlbr(int ), (int)533);
        }
        var4_2 = nd.a;
        if (var6) {
            throw null;
lbl29:
            // 6 sources

            return (int)nd.hlbm("hmng", hlbr(int ), (int)534);
        }
        if (var4_2 || var4_2) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hmnh", hlbj(int ), (int)244)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nd.hlbm("hmni", hlbr(int ), (int)535)) break;
            v4 /* !! */  = (long)nd.hlbm("hmnj", hlbr(int ), (int)536);
        }
        var0_3 = nd.getClientColor();
        if (var4_2) ** GOTO lbl29
        if (var5_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) ** GOTO lbl29
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hmnk", hlbj(int ), (int)245)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nd.hlbm("hmnl", hlbr(int ), (int)537)) break;
                    v5 /* !! */  = (long)nd.hlbm("hmnm", hlbr(int ), (int)538);
                }
                var1_4 = (int)((float)nd.getRed(var0_3) * nd.hlbm("hmnn", hlzk(int ), (int)539));
                if (var4_2 || var4_2) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hmno", hlbj(int ), (int)246)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nd.hlbm("hmnp", hlbr(int ), (int)540)) break;
                    v6 /* !! */  = (long)nd.hlbm("hmnq", hlbr(int ), (int)541);
                }
                var2_5 = (int)((float)nd.getGreen(var0_3) * nd.hlbm("hmnr", hlzk(int ), (int)542));
                if (var4_2 || var4_2) ** GOTO lbl29
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = nd.oo - nd.hlbm("hmns", hlbj(int ), (int)247)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nd.hlbm("hmnt", hlbr(int ), (int)543)) break;
                    v7 /* !! */  = (long)nd.hlbm("hmnu", hlbr(int ), (int)544);
                }
                var3_6 = (int)((float)nd.getBlue(var0_3) * nd.hlbm("hmnv", hlzk(int ), (int)545));
                if (!var4_2 && !var4_2) ** break;
                ** continue;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_6 = nd.oo - nd.hlbm("hmnw", hlbj(int ), (int)248)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nd.hlbm("hmnx", hlbr(int ), (int)546)) break;
                    v8 /* !! */  = (long)nd.hlbm("hmny", hlbr(int ), (int)547);
                }
                v9 = nd.getAlpha(var0_3);
                v10 /* !! */  = nd.oo;
                if (true) ** GOTO lbl75
                block32: while (true) {
                    v10 /* !! */  = (long)(nd.hlbm("hmoa", hlbj(int ), (int)250) - nd.hlbm("hmnz", hlbj(int ), (int)249));
lbl75:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -64579373: {
                            continue block32;
                        }
                        case 1076290759: {
                            break block32;
                        }
                    }
                    break;
                }
                return nd.rgba(var1_4, var2_5, var3_6, v9);
            }
lbl81:
            // 2 sources

            case 0: {
                var5_1 /* !! */  = (int)nd.hlbm("hmob", hlbr(int ), (int)548);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 1: {
                var5_1 /* !! */  = (int)nd.hlbm("hmoc", hlbr(int ), (int)549);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_1 /* !! */  = (int)nd.hlbm("hmod", hlbr(int ), (int)550);
                    if (!var6) ** GOTO lbl81
                    throw null;
                }
            }
lbl96:
            // 3 sources

            case 3: {
                var5_1 /* !! */  = (int)nd.hlbm("hmoe", hlbr(int ), (int)551);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl101:
            // 2 sources

            case 4: {
                var5_1 /* !! */  = (int)nd.hlbm("hmof", hlbr(int ), (int)552);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl106:
            // 2 sources

            case 5: {
                var5_1 /* !! */  = (int)nd.hlbm("hmog", hlbr(int ), (int)553);
                if (var6) {
                    throw null;
                }
            }
lbl110:
            // 4 sources

            case 6: {
                var5_1 /* !! */  = (int)nd.hlbm("hmoh", hlbr(int ), (int)554);
                if (var6) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl115:
            // 2 sources

            case 7: {
                var5_1 /* !! */  = (int)nd.hlbm("hmoi", hlbr(int ), (int)555);
                if (!var6) ** GOTO lbl96
                throw null;
            }
lbl119:
            // 3 sources

            case 8: {
                var5_1 /* !! */  = (int)nd.hlbm("hmoj", hlbr(int ), (int)556);
                if (!var6) ** GOTO lbl106
                throw null;
            }
lbl123:
            // 2 sources

            case 9: {
                var5_1 /* !! */  = (int)nd.hlbm("hmok", hlbr(int ), (int)557);
                if (!var6) ** GOTO lbl110
                throw null;
            }
            case 10: {
                var5_1 /* !! */  = (int)nd.hlbm("hmol", hlbr(int ), (int)558);
                if (!var6) ** GOTO lbl115
                throw null;
            }
            case 11: 
        }
        var5_1 /* !! */  = (int)nd.hlbm("hmom", hlbr(int ), (int)559);
        ** while (!var6)
lbl134:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hplh() {
        nd.hlbs[400] = 180845847;
        nd.hlbs[401] = 523030662;
        nd.hlbs[402] = 1845337640;
        nd.hlbs[403] = -911565416;
        nd.hlbs[404] = -1866104543;
        nd.hlbs[405] = 1146096990;
        nd.hlbs[406] = 953909776;
        nd.hlbs[407] = -1262263402;
        nd.hlbs[408] = -556734009;
        nd.hlbs[409] = -295222392;
        nd.hlbs[410] = -226535612;
        nd.hlbs[411] = 1343102654;
        nd.hlbs[412] = -1670877163;
        nd.hlbs[413] = 1884761149;
        nd.hlbs[414] = 111768276;
        nd.hlbs[415] = 794917765;
        nd.hlbs[416] = 1262481951;
        nd.hlbs[417] = 1865469389;
        nd.hlbs[418] = -1977981883;
        nd.hlbs[419] = -450770198;
        nd.hlbs[420] = -655846340;
        nd.hlbs[421] = -1146754244;
        nd.hlbs[422] = 759837727;
        nd.hlbs[423] = 1557108693;
        nd.hlbs[424] = 1675505772;
        nd.hlbs[425] = -1579962620;
        nd.hlbs[426] = -255483660;
        nd.hlbs[427] = 1969505132;
        nd.hlbs[428] = 1639434606;
        nd.hlbs[429] = -1998505087;
        nd.hlbs[430] = 1191720091;
        nd.hlbs[431] = 2020404884;
        nd.hlbs[432] = -2048920688;
        nd.hlbs[433] = -2052027788;
        nd.hlbs[434] = -1155468776;
        nd.hlbs[435] = 2034146803;
        nd.hlbs[436] = -1296031424;
        nd.hlbs[437] = -982300823;
        nd.hlbs[438] = 626345580;
        nd.hlbs[439] = 899367878;
        nd.hlbs[440] = -2077819104;
        nd.hlbs[441] = 889330964;
        nd.hlbs[442] = -851645841;
        nd.hlbs[443] = 1344890341;
        nd.hlbs[444] = -1303599794;
        nd.hlbs[445] = 2008870146;
        nd.hlbs[446] = 228255426;
        nd.hlbs[447] = 1443124595;
        nd.hlbs[448] = -376390523;
        nd.hlbs[449] = -1343844986;
        nd.hlbs[450] = -703589973;
        nd.hlbs[451] = -212400229;
        nd.hlbs[452] = 1389151860;
        nd.hlbs[453] = -1129963993;
        nd.hlbs[454] = -463744943;
        nd.hlbs[455] = 273535713;
        nd.hlbs[456] = 897667509;
        nd.hlbs[457] = -1347435470;
        nd.hlbs[458] = 600999500;
        nd.hlbs[459] = 1694391724;
        nd.hlbs[460] = 34222430;
        nd.hlbs[461] = -1206836607;
        nd.hlbs[462] = 1566117431;
        nd.hlbs[463] = -491630791;
        nd.hlbs[464] = 916828447;
        nd.hlbs[465] = -1423790194;
        nd.hlbs[466] = 1631890062;
        nd.hlbs[467] = 882359549;
        nd.hlbs[468] = -1013811829;
        nd.hlbs[469] = 1596503396;
        nd.hlbs[470] = 953065498;
        nd.hlbs[471] = -1895463461;
        nd.hlbs[472] = 327412402;
        nd.hlbs[473] = 131617388;
        nd.hlbs[474] = -538465998;
        nd.hlbs[475] = 878009346;
        nd.hlbs[476] = -1857549568;
        nd.hlbs[477] = -724239086;
        nd.hlbs[478] = 1854582181;
        nd.hlbs[479] = 894752752;
        nd.hlbs[480] = 1528377148;
        nd.hlbs[481] = -752541484;
        nd.hlbs[482] = -1009979859;
        nd.hlbs[483] = -23843049;
        nd.hlbs[484] = 19894003;
        nd.hlbs[485] = -1424304695;
        nd.hlbs[486] = -1508800392;
        nd.hlbs[487] = 379419821;
        nd.hlbs[488] = 585156650;
        nd.hlbs[489] = -213781595;
        nd.hlbs[490] = -1672771995;
        nd.hlbs[491] = -1610723711;
        nd.hlbs[492] = 1694502431;
        nd.hlbs[493] = 1977870121;
        nd.hlbs[494] = -421033980;
        nd.hlbs[495] = -327694768;
        nd.hlbs[496] = 1393507803;
        nd.hlbs[497] = 299689005;
        nd.hlbs[498] = 1011358477;
        nd.hlbs[499] = 1043759629;
    }

    private static /* synthetic */ void hpre() {
        nd.hlbk[500] = 1341781513428981332L;
        nd.hlbk[501] = 5658316395382237357L;
        nd.hlbk[502] = -3729200602186439435L;
        nd.hlbk[503] = -3014088577719889903L;
        nd.hlbk[504] = -1849417605929090548L;
        nd.hlbk[505] = 5576636485673375164L;
        nd.hlbk[506] = 4828900494648657584L;
        nd.hlbk[507] = 8489535340873224671L;
        nd.hlbk[508] = -6039093349293137385L;
        nd.hlbk[509] = 7005351992409952634L;
        nd.hlbk[510] = -5317525461112952742L;
        nd.hlbk[511] = 4043941147884912757L;
        nd.hlbk[512] = 1409014723409968387L;
        nd.hlbk[513] = -8679490509285319865L;
        nd.hlbk[514] = 2656113731393424310L;
        nd.hlbk[515] = -967658558059671282L;
        nd.hlbk[516] = 4411283187833929481L;
        nd.hlbk[517] = 2928923641280758652L;
        nd.hlbk[518] = -1902202010651416301L;
        nd.hlbk[519] = 8123622441277827129L;
        nd.hlbk[520] = 5449365787490068632L;
        nd.hlbk[521] = 3728637513899217352L;
        nd.hlbk[522] = 5503132981578765225L;
        nd.hlbk[523] = 7075412382869997459L;
        nd.hlbk[524] = 7366892244479996342L;
        nd.hlbk[525] = -1202217108887187880L;
        nd.hlbk[526] = -7013884370486512973L;
        nd.hlbk[527] = 785301943716432440L;
        nd.hlbk[528] = -8071054768737118322L;
        nd.hlbk[529] = 7561107251319209420L;
        nd.hlbk[530] = -9098653602976273106L;
        nd.hlbk[531] = 3166252817293745491L;
        nd.hlbk[532] = -2537026026517544635L;
        nd.hlbk[533] = 2919612540991078830L;
        nd.hlbk[534] = -1016074300711807252L;
        nd.hlbk[535] = -1945957598387425966L;
        nd.hlbk[536] = 1690082985044636185L;
        nd.hlbk[537] = 8737118524197357271L;
        nd.hlbk[538] = -6964432136513754539L;
        nd.hlbk[539] = 1592950684723307212L;
        nd.hlbk[540] = 8044975180503565587L;
        nd.hlbk[541] = 7021861252171434527L;
        nd.hlbk[542] = -7591500431339969300L;
        nd.hlbk[543] = -7239357081761777486L;
        nd.hlbk[544] = 3386632693520532578L;
        nd.hlbk[545] = 1509898361687265534L;
        nd.hlbk[546] = -8364134400920746849L;
        nd.hlbk[547] = 4138972437648628025L;
        nd.hlbk[548] = -6443207069623188207L;
        nd.hlbk[549] = 4294437685736258006L;
        nd.hlbk[550] = 8843461804126943414L;
        nd.hlbk[551] = -251866732415189034L;
        nd.hlbk[552] = -3762013011181427426L;
        nd.hlbk[553] = -2669053838702765958L;
        nd.hlbk[554] = 2070197571223597144L;
        nd.hlbk[555] = 1402272073921319063L;
        nd.hlbk[556] = 192001858220988041L;
        nd.hlbk[557] = 3714473292795488200L;
        nd.hlbk[558] = 614210796127270079L;
        nd.hlbk[559] = -6621668890783770488L;
        nd.hlbk[560] = -3692396040523130713L;
        nd.hlbk[561] = 2218250424920279818L;
        nd.hlbk[562] = 3680891702642948053L;
        nd.hlbk[563] = 4290287265361928397L;
        nd.hlbk[564] = 9134771768269813490L;
        nd.hlbk[565] = -6738431379747447356L;
        nd.hlbk[566] = 7684128903780364894L;
        nd.hlbk[567] = 6452880097385685140L;
        nd.hlbk[568] = -8123211763700703009L;
        nd.hlbk[569] = -2224557662126097786L;
        nd.hlbk[570] = -4039945490433693456L;
        nd.hlbk[571] = 516750633784546048L;
        nd.hlbk[572] = -3722738880250437347L;
        nd.hlbk[573] = -8753690465410050030L;
        nd.hlbk[574] = -6190763559790427405L;
        nd.hlbk[575] = -1654807651549971151L;
        nd.hlbk[576] = 5779001800422015720L;
        nd.hlbk[577] = -8234766451497329060L;
        nd.hlbk[578] = 7300878924456855628L;
        nd.hlbk[579] = 418439284022238150L;
        nd.hlbk[580] = 6681225434820159153L;
        nd.hlbk[581] = -8828123124795622674L;
        nd.hlbk[582] = 8640053631626124656L;
        nd.hlbk[583] = 698827545744988551L;
        nd.hlbk[584] = 6821117727359572884L;
        nd.hlbk[585] = 5815771911868213909L;
        nd.hlbk[586] = -3447343923613166295L;
        nd.hlbk[587] = 739938729693118780L;
        nd.hlbk[588] = -6608117026378564237L;
        nd.hlbk[589] = 5098130602621880994L;
        nd.hlbk[590] = 3460204123380095717L;
        nd.hlbk[591] = -2450816623194650778L;
        nd.hlbk[592] = 4122731245630886565L;
        nd.hlbk[593] = 2407214542913740020L;
        nd.hlbk[594] = 4355651652310006935L;
        nd.hlbk[595] = -3512332857603471133L;
        nd.hlbk[596] = 5228145483537952359L;
        nd.hlbk[597] = -4539138831523258899L;
        nd.hlbk[598] = -688263387491858869L;
        nd.hlbk[599] = 7257770166501503372L;
    }

    static {
        hlbs = new int[1580];
        hlbt = new int[1580];
        nd.hpld();
        nd.hple();
        nd.hplf();
        nd.hplg();
        nd.hplh();
        nd.hpli();
        nd.hplj();
        nd.hplk();
        nd.hpll();
        nd.hplm();
        nd.hpln();
        nd.hplo();
        nd.hplp();
        nd.hplq();
        nd.hplr();
        nd.hpls();
        nd.hplt();
        nd.hpmc();
        nd.hpml();
        nd.hpmq();
        nd.hpmx();
        nd.hpne();
        nd.hpnj();
        nd.hpnq();
        nd.hpnx();
        nd.hpoe();
        nd.hpok();
        nd.hpoq();
        nd.hpow();
        nd.hppc();
        nd.hpph();
        nd.hppm();
        hlbk = new long[694];
        hlbl = new long[694];
        nd.hppu();
        nd.hpqc();
        nd.hpqk();
        nd.hpqs();
        nd.hpqy();
        nd.hpre();
        nd.hprk();
        nd.hprm();
        nd.hpro();
        nd.hprp();
        nd.hprs();
        nd.hpry();
        nd.hpsf();
        nd.hpsn();
        clientColorR = (int)nd.hlbm("hpko", hlbr(int ), (int)1565);
        clientColorG = (int)nd.hlbm("hpkp", hlbr(int ), (int)1566);
        clientColorB = (int)nd.hlbm("hpkq", hlbr(int ), (int)1567);
        clientColors = new int[3];
        clientColorMode = "\u0421\u0442\u0430\u0442\u0438\u0447\u043d\u044b\u0439";
        green = new Color((int)nd.hlbm("hpkr", hlbr(int ), (int)1568), (int)nd.hlbm("hpks", hlbr(int ), (int)1569), (int)nd.hlbm("hpkt", hlbr(int ), (int)1570)).getRGB();
        yellow = new Color((int)nd.hlbm("hpku", hlbr(int ), (int)1571), (int)nd.hlbm("hpkv", hlbr(int ), (int)1572), (int)nd.hlbm("hpkw", hlbr(int ), (int)1573)).getRGB();
        orange = new Color((int)nd.hlbm("hpkx", hlbr(int ), (int)1574), (int)nd.hlbm("hpky", hlbr(int ), (int)1575), (int)nd.hlbm("hpkz", hlbr(int ), (int)1576)).getRGB();
        red = new Color((int)nd.hlbm("hpla", hlbr(int ), (int)1577), (int)nd.hlbm("hplb", hlbr(int ), (int)1578), (int)nd.hlbm("hplc", hlbr(int ), (int)1579)).getRGB();
        colorTransitionStart = System.currentTimeMillis();
        FORMATTING_CODE_PATTERN = Pattern.compile("(?i)\u00a7[0-9a-f-or]");
    }

    private static /* synthetic */ void hppm() {
        nd.hlbt[1500] = -1377580634;
        nd.hlbt[1501] = 849784253;
        nd.hlbt[1502] = -1643330336;
        nd.hlbt[1503] = -1950190486;
        nd.hlbt[1504] = -2045102525;
        nd.hlbt[1505] = -501855835;
        nd.hlbt[1506] = 1066476109;
        nd.hlbt[1507] = 815241067;
        nd.hlbt[1508] = 1096607309;
        nd.hlbt[1509] = -1600290261;
        nd.hlbt[1510] = 1228698798;
        nd.hlbt[1511] = 2113684282;
        nd.hlbt[1512] = 1103416614;
        nd.hlbt[1513] = 793724680;
        nd.hlbt[1514] = -1274789647;
        nd.hlbt[1515] = -1579759398;
        nd.hlbt[1516] = 316331194;
        nd.hlbt[1517] = 1621941024;
        nd.hlbt[1518] = 733885903;
        nd.hlbt[1519] = -638963702;
        nd.hlbt[1520] = 1788082225;
        nd.hlbt[1521] = 1745196291;
        nd.hlbt[1522] = -197824300;
        nd.hlbt[1523] = 608559516;
        nd.hlbt[1524] = 2140649752;
        nd.hlbt[1525] = 1268978412;
        nd.hlbt[1526] = 1467948042;
        nd.hlbt[1527] = 1488868142;
        nd.hlbt[1528] = 1478993262;
        nd.hlbt[1529] = -1580913452;
        nd.hlbt[1530] = 1655302463;
        nd.hlbt[1531] = -1562620868;
        nd.hlbt[1532] = 715664332;
        nd.hlbt[1533] = 135662451;
        nd.hlbt[1534] = 944809371;
        nd.hlbt[1535] = -721209955;
        nd.hlbt[1536] = -398556234;
        nd.hlbt[1537] = 219253766;
        nd.hlbt[1538] = 1173474324;
        nd.hlbt[1539] = 1732160741;
        nd.hlbt[1540] = 83117876;
        nd.hlbt[1541] = 1335401555;
        nd.hlbt[1542] = 1711885095;
        nd.hlbt[1543] = 2110482955;
        nd.hlbt[1544] = 696422817;
        nd.hlbt[1545] = -208678166;
        nd.hlbt[1546] = 1528066500;
        nd.hlbt[1547] = -644457654;
        nd.hlbt[1548] = 984594370;
        nd.hlbt[1549] = 43567020;
        nd.hlbt[1550] = -1783416951;
        nd.hlbt[1551] = -1019798709;
        nd.hlbt[1552] = -1924666087;
        nd.hlbt[1553] = 854192272;
        nd.hlbt[1554] = 1268339763;
        nd.hlbt[1555] = -1583798909;
        nd.hlbt[1556] = 359295611;
        nd.hlbt[1557] = 1145112228;
        nd.hlbt[1558] = 1765071441;
        nd.hlbt[1559] = 1121545434;
        nd.hlbt[1560] = -1721112096;
        nd.hlbt[1561] = 1479030610;
        nd.hlbt[1562] = -1273542343;
        nd.hlbt[1563] = 236206221;
        nd.hlbt[1564] = 890801017;
        nd.hlbt[1565] = -1887001115;
        nd.hlbt[1566] = -1819719104;
        nd.hlbt[1567] = -1439077548;
        nd.hlbt[1568] = -414943224;
        nd.hlbt[1569] = -1074200246;
        nd.hlbt[1570] = -427782876;
        nd.hlbt[1571] = -826566458;
        nd.hlbt[1572] = 699126891;
        nd.hlbt[1573] = 938947098;
        nd.hlbt[1574] = 1169323981;
        nd.hlbt[1575] = 1095798012;
        nd.hlbt[1576] = 956553848;
        nd.hlbt[1577] = -2053610281;
        nd.hlbt[1578] = 888511797;
        nd.hlbt[1579] = -1371526539;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Vector4i multRedAndAlpha(Vector4i var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hllj", hlbj(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hllk", hlbr(int ), (int)29)) break;
            v0 /* !! */  = (long)nd.hlbm("hlll", hlbr(int ), (int)30);
        }
        var5_3 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl11
        block55: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hllm", hlbj(int ), (int)35));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2046440282: {
                    v2 = nd.hlbm("hlln", hlbj(int ), (int)36);
                    continue block55;
                }
                case 1076290759: {
                    break block55;
                }
                case 1742890697: {
                    v2 = nd.hlbm("hllp", hlbj(int ), (int)37);
                    continue block55;
                }
                case 2121439994: {
                    v2 = nd.hlbm("hllq", hlbj(int ), (int)38);
                    continue block55;
                }
            }
            break;
        }
        var4_4 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hllr", hlbj(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nd.hlbm("hlls", hlbr(int ), (int)31)) break;
            v3 /* !! */  = (long)nd.hlbm("hllt", hlbr(int ), (int)32);
        }
        var3_5 = nd.a;
        if (var5_3) {
            throw null;
lbl32:
            // 2 sources

            return null;
        }
        if (var3_5) ** GOTO lbl32
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** continue;
                v4 /* !! */  = nd.oo;
                if (true) ** GOTO lbl43
                block58: while (true) {
                    v4 /* !! */  = (long)(v5 - nd.hlbm("hllu", hlbj(int ), (int)40));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -658406702: {
                            v5 = nd.hlbm("hllw", hlbj(int ), (int)41);
                            continue block58;
                        }
                        case 1076290759: {
                            break block58;
                        }
                        case 1210521505: {
                            v5 = nd.hlbm("hllx", hlbj(int ), (int)42);
                            continue block58;
                        }
                        case 1880454302: {
                            v5 = nd.hlbm("hlly", hlbj(int ), (int)43);
                            continue block58;
                        }
                    }
                    break;
                }
                v6 /* !! */  = nd.oo;
                if (true) ** GOTO lbl59
                block59: while (true) {
                    v6 /* !! */  = (long)(v7 - nd.hlbm("hllz", hlbj(int ), (int)44));
lbl59:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 445718173: {
                            v7 = nd.hlbm("hlmb", hlbj(int ), (int)45);
                            continue block59;
                        }
                        case 664093021: {
                            v7 = nd.hlbm("hlmc", hlbj(int ), (int)46);
                            continue block59;
                        }
                        case 1076290759: {
                            break block59;
                        }
                    }
                    break;
                }
                v8 = var0.x;
                v9 /* !! */  = nd.oo;
                if (true) ** GOTO lbl73
                block60: while (true) {
                    v9 /* !! */  = (long)(nd.hlbm("hlmf", hlbj(int ), (int)48) - nd.hlbm("hlmd", hlbj(int ), (int)47));
lbl73:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1050245367: {
                            continue block60;
                        }
                        case 1076290759: {
                            break block60;
                        }
                    }
                    break;
                }
                v10 = nd.multRedAndAlpha(v8, var1_1, var2_2);
                v11 /* !! */  = nd.oo;
                if (true) ** GOTO lbl83
                block61: while (true) {
                    v11 /* !! */  = (long)(nd.hlbm("hlmh", hlbj(int ), (int)50) - nd.hlbm("hlmg", hlbj(int ), (int)49));
lbl83:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case 471564941: {
                            continue block61;
                        }
                        case 1076290759: {
                            break block61;
                        }
                    }
                    break;
                }
                v12 = var0.y;
                v13 /* !! */  = nd.oo;
                if (true) ** GOTO lbl93
                block62: while (true) {
                    v13 /* !! */  = (long)(v14 - nd.hlbm("hlmi", hlbj(int ), (int)51));
lbl93:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -38504374: {
                            v14 = nd.hlbm("hlmj", hlbj(int ), (int)52);
                            continue block62;
                        }
                        case 1076290759: {
                            break block62;
                        }
                        case 1767797847: {
                            v14 = nd.hlbm("hlmk", hlbj(int ), (int)53);
                            continue block62;
                        }
                    }
                    break;
                }
                v15 = nd.multRedAndAlpha(v12, var1_1, var2_2);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hlml", hlbj(int ), (int)54)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == nd.hlbm("hlmm", hlbr(int ), (int)33)) break;
                    v16 /* !! */  = (long)nd.hlbm("hlmn", hlbr(int ), (int)34);
                }
                v17 = var0.w;
                v18 /* !! */  = nd.oo;
                if (true) ** GOTO lbl113
                block64: while (true) {
                    v18 /* !! */  = (long)(v19 - nd.hlbm("hlmo", hlbj(int ), (int)55));
lbl113:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 802812357: {
                            v19 = nd.hlbm("hlmp", hlbj(int ), (int)56);
                            continue block64;
                        }
                        case 1076290759: {
                            break block64;
                        }
                        case 1593856112: {
                            v19 = nd.hlbm("hlmq", hlbj(int ), (int)57);
                            continue block64;
                        }
                    }
                    break;
                }
                v20 = nd.multRedAndAlpha(v17, var1_1, var2_2);
                v21 /* !! */  = nd.oo;
                if (true) ** GOTO lbl127
                block65: while (true) {
                    v21 /* !! */  = (long)(v22 - nd.hlbm("hlmr", hlbj(int ), (int)58));
lbl127:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2016584585: {
                            v22 = nd.hlbm("hlmt", hlbj(int ), (int)59);
                            continue block65;
                        }
                        case 341969159: {
                            v22 = nd.hlbm("hlmu", hlbj(int ), (int)60);
                            continue block65;
                        }
                        case 1076290759: {
                            break block65;
                        }
                    }
                    break;
                }
                v23 = var0.z;
                v24 /* !! */  = nd.oo;
                if (true) ** GOTO lbl141
                block66: while (true) {
                    v24 /* !! */  = (long)(nd.hlbm("hlmw", hlbj(int ), (int)62) - nd.hlbm("hlmv", hlbj(int ), (int)61));
lbl141:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1749442127: {
                            continue block66;
                        }
                        case 1076290759: {
                            break block66;
                        }
                    }
                    break;
                }
                v25 = nd.multRedAndAlpha(v23, var1_1, var2_2);
                v26 /* !! */  = nd.oo;
                if (true) ** GOTO lbl151
                block67: while (true) {
                    v26 /* !! */  = (long)(nd.hlbm("hlmy", hlbj(int ), (int)64) - nd.hlbm("hlmx", hlbj(int ), (int)63));
lbl151:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1358472920: {
                            continue block67;
                        }
                        case 1076290759: {
                            break block67;
                        }
                    }
                    break;
                }
                return new Vector4i(v10, v15, v20, v25);
            }
            case 0: {
                var4_4 /* !! */  = (int)nd.hlbm("hlmz", hlbr(int ), (int)35);
                if (!var5_3) break;
                throw null;
            }
lbl161:
            // 2 sources

            case 1: {
                do {
                    var4_4 /* !! */  = (int)nd.hlbm("hlna", hlbr(int ), (int)36);
                } while (!var5_3);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)nd.hlbm("hlnb", hlbr(int ), (int)37);
                    if (!var5_3) ** GOTO lbl161
                    throw null;
                }
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)nd.hlbm("hlnc", hlbr(int ), (int)38);
        ** while (!var5_3)
lbl174:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int getClientColor(int var0) {
        block67: {
            block66: {
                var5_1 = nd.c;
                var4_2 /* !! */  = nd.b;
                var3_3 = nd.a;
                if (var5_1) {
                    throw null;
lbl6:
                    // 15 sources

                    return (int)nd.hlbm("hlvr", hlbr(int ), (int)173);
                }
                if (var3_3) ** GOTO lbl6
                try {
                    block65: {
                        if (var3_3) ** GOTO lbl6
                        var1_4 = gk.getInstance();
                        if (var3_3 || var3_3) ** GOTO lbl6
                        if (var1_4 == null) break block65;
                        if (var3_3 || var3_3) ** GOTO lbl6
                        return var1_4.getColorAt(0.0f, var0);
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    ** if (!var5_1) goto lbl-1000
                }
                catch (Throwable var1_5) {
                    if (var3_3) ** GOTO lbl6
                }
lbl-1000:
                // 1 sources

                {
                    throw null;
                }
lbl-1000:
                // 1 sources

                {
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_6 = nd.getActiveColorCount();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (var1_6 != 0) break block66;
                if (var3_3 || var3_3) ** GOTO lbl6
                return nd.rgba(nd.clientColorR, nd.clientColorG, nd.clientColorB, var0);
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            if (var1_6 != nd.hlbm("hlvs", hlbr(int ), (int)174)) break block67;
            if (var3_3 || var3_3) ** GOTO lbl6
            var2_7 = nd.clientColors[0];
            if (var3_3 || var3_3) ** GOTO lbl6
            return nd.rgba(var2_7 >> nd.hlbm("hlvt", hlbr(int ), (int)175) & nd.hlbm("hlvu", hlbr(int ), (int)176), var2_7 >> nd.hlbm("hlvv", hlbr(int ), (int)177) & nd.hlbm("hlvw", hlbr(int ), (int)178), var2_7 & nd.hlbm("hlvx", hlbr(int ), (int)179), var0);
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        if (!nd.clientColorMode.equals("\u041f\u0435\u0440\u0435\u043b\u0438\u0432\u0430\u043d\u0438\u0435")) ** GOTO lbl44
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl6
                return nd.getGradientColor(var0);
            }
lbl44:
            // 1 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            return nd.getStaticGradientColor(var0);
lbl47:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)nd.hlbm("hlvy", hlbr(int ), (int)180);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
            case 1: {
                var4_2 /* !! */  = (int)nd.hlbm("hlvz", hlbr(int ), (int)181);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl57:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwa", hlbr(int ), (int)182);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
            case 3: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwb", hlbr(int ), (int)183);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl67:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwc", hlbr(int ), (int)184);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl72:
            // 3 sources

            case 5: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwd", hlbr(int ), (int)185);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl77:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwe", hlbr(int ), (int)186);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl82:
            // 3 sources

            case 7: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwf", hlbr(int ), (int)187);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl87:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwg", hlbr(int ), (int)188);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 9: {
                do {
                    var4_2 /* !! */  = (int)nd.hlbm("hlwh", hlbr(int ), (int)189);
                } while (!var5_1);
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwi", hlbr(int ), (int)190);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl102:
            // 4 sources

            case 11: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwj", hlbr(int ), (int)191);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl107:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwk", hlbr(int ), (int)192);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 13: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwl", hlbr(int ), (int)193);
                if (!var5_1) ** GOTO lbl72
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwm", hlbr(int ), (int)194);
                if (!var5_1) ** GOTO lbl82
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwn", hlbr(int ), (int)195);
                if (!var5_1) ** GOTO lbl102
                throw null;
            }
            case 16: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwo", hlbr(int ), (int)196);
                if (!var5_1) ** GOTO lbl47
                throw null;
            }
lbl128:
            // 4 sources

            case 17: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwp", hlbr(int ), (int)197);
                if (!var5_1) ** GOTO lbl57
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwq", hlbr(int ), (int)198);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 19: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwr", hlbr(int ), (int)199);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 20: {
                var4_2 /* !! */  = (int)nd.hlbm("hlws", hlbr(int ), (int)200);
                if (!var5_1) ** GOTO lbl102
                throw null;
            }
lbl146:
            // 2 sources

            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)nd.hlbm("hlwt", hlbr(int ), (int)201);
                    if (!var5_1) ** GOTO lbl128
                    throw null;
                }
            }
lbl151:
            // 4 sources

            case 22: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwu", hlbr(int ), (int)202);
                if (!var5_1) ** GOTO lbl102
                throw null;
            }
lbl155:
            // 2 sources

            case 23: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwv", hlbr(int ), (int)203);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl160:
            // 2 sources

            case 24: {
                var4_2 /* !! */  = (int)nd.hlbm("hlww", hlbr(int ), (int)204);
                if (!var5_1) ** GOTO lbl72
                throw null;
            }
lbl164:
            // 4 sources

            case 25: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwx", hlbr(int ), (int)205);
                if (!var5_1) ** GOTO lbl107
                throw null;
            }
lbl168:
            // 2 sources

            case 26: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwy", hlbr(int ), (int)206);
                if (!var5_1) ** GOTO lbl151
                throw null;
            }
            case 27: {
                var4_2 /* !! */  = (int)nd.hlbm("hlwz", hlbr(int ), (int)207);
                if (!var5_1) ** GOTO lbl67
                throw null;
            }
lbl176:
            // 2 sources

            case 28: {
                var4_2 /* !! */  = (int)nd.hlbm("hlxa", hlbr(int ), (int)208);
                if (!var5_1) ** GOTO lbl151
                throw null;
            }
lbl180:
            // 2 sources

            case 29: {
                var4_2 /* !! */  = (int)nd.hlbm("hlxb", hlbr(int ), (int)209);
                if (!var5_1) ** GOTO lbl164
                throw null;
            }
            case 30: 
        }
        var4_2 /* !! */  = (int)nd.hlbm("hlxc", hlbr(int ), (int)210);
        ** while (!var5_1)
lbl187:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hpok() {
        nd.hlbt[1000] = 1270581606;
        nd.hlbt[1001] = 395548269;
        nd.hlbt[1002] = -1573482276;
        nd.hlbt[1003] = -1115587099;
        nd.hlbt[1004] = -568521431;
        nd.hlbt[1005] = 1657175754;
        nd.hlbt[1006] = 202844491;
        nd.hlbt[1007] = -1116974659;
        nd.hlbt[1008] = -995788311;
        nd.hlbt[1009] = 644282261;
        nd.hlbt[1010] = -1514135417;
        nd.hlbt[1011] = -2139048458;
        nd.hlbt[1012] = -1494063763;
        nd.hlbt[1013] = -421972742;
        nd.hlbt[1014] = 1014835559;
        nd.hlbt[1015] = 525635101;
        nd.hlbt[1016] = 436344230;
        nd.hlbt[1017] = -61719617;
        nd.hlbt[1018] = -1829035990;
        nd.hlbt[1019] = -1962645187;
        nd.hlbt[1020] = 651405703;
        nd.hlbt[1021] = -400784500;
        nd.hlbt[1022] = 90860201;
        nd.hlbt[1023] = -313733970;
        nd.hlbt[1024] = 1501874981;
        nd.hlbt[1025] = 1488591646;
        nd.hlbt[1026] = 375377112;
        nd.hlbt[1027] = 1407043952;
        nd.hlbt[1028] = 1376476169;
        nd.hlbt[1029] = -14886621;
        nd.hlbt[1030] = -71775098;
        nd.hlbt[1031] = -6600045;
        nd.hlbt[1032] = 1470757148;
        nd.hlbt[1033] = 557149984;
        nd.hlbt[1034] = -1653745650;
        nd.hlbt[1035] = -1050695570;
        nd.hlbt[1036] = 1229323667;
        nd.hlbt[1037] = -583174520;
        nd.hlbt[1038] = 1624837088;
        nd.hlbt[1039] = 144487370;
        nd.hlbt[1040] = 869837607;
        nd.hlbt[1041] = -608098294;
        nd.hlbt[1042] = 74049802;
        nd.hlbt[1043] = -2019648996;
        nd.hlbt[1044] = -197043798;
        nd.hlbt[1045] = 1959971010;
        nd.hlbt[1046] = -590378144;
        nd.hlbt[1047] = -532660141;
        nd.hlbt[1048] = -855203537;
        nd.hlbt[1049] = -899833709;
        nd.hlbt[1050] = -340937250;
        nd.hlbt[1051] = -39662795;
        nd.hlbt[1052] = 1353767646;
        nd.hlbt[1053] = 312040576;
        nd.hlbt[1054] = 843729873;
        nd.hlbt[1055] = -707383937;
        nd.hlbt[1056] = -1103040207;
        nd.hlbt[1057] = 1673335523;
        nd.hlbt[1058] = -477366245;
        nd.hlbt[1059] = -1743304855;
        nd.hlbt[1060] = -1782676582;
        nd.hlbt[1061] = -655302279;
        nd.hlbt[1062] = -781370781;
        nd.hlbt[1063] = -211643828;
        nd.hlbt[1064] = 169444038;
        nd.hlbt[1065] = 1165188680;
        nd.hlbt[1066] = 159553835;
        nd.hlbt[1067] = 1788875481;
        nd.hlbt[1068] = -1024160026;
        nd.hlbt[1069] = -1842486980;
        nd.hlbt[1070] = 700543594;
        nd.hlbt[1071] = 75748662;
        nd.hlbt[1072] = 1100368696;
        nd.hlbt[1073] = 1117156131;
        nd.hlbt[1074] = 275927568;
        nd.hlbt[1075] = -1604757391;
        nd.hlbt[1076] = 1912411401;
        nd.hlbt[1077] = -542397976;
        nd.hlbt[1078] = 558040087;
        nd.hlbt[1079] = -2008682404;
        nd.hlbt[1080] = -273569479;
        nd.hlbt[1081] = -1494843002;
        nd.hlbt[1082] = 1814803113;
        nd.hlbt[1083] = 288894181;
        nd.hlbt[1084] = 1943674112;
        nd.hlbt[1085] = 981943364;
        nd.hlbt[1086] = 573887869;
        nd.hlbt[1087] = -818954958;
        nd.hlbt[1088] = 2042863325;
        nd.hlbt[1089] = 368385545;
        nd.hlbt[1090] = 1125246571;
        nd.hlbt[1091] = -415978940;
        nd.hlbt[1092] = 1276486679;
        nd.hlbt[1093] = -1966641802;
        nd.hlbt[1094] = -582894752;
        nd.hlbt[1095] = 2117027403;
        nd.hlbt[1096] = 739681896;
        nd.hlbt[1097] = -1039290964;
        nd.hlbt[1098] = -1380942571;
        nd.hlbt[1099] = 160781872;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int[] corners(int var0, int var1_1, int var2_2, int var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hobt", hlbj(int ), (int)502)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hobu", hlbr(int ), (int)1073)) break;
            v0 /* !! */  = (long)nd.hlbm("hobv", hlbr(int ), (int)1074);
        }
        var11_4 = nd.c;
        while (true) {
            block70: {
                if ((v1 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hobw", hlbj(int ), (int)503)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != nd.hlbm("hobx", hlbr(int ), (int)1075)) break block70;
                var10_5 /* !! */  = nd.b;
                if (var10_5 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v1 /* !! */  = (long)nd.hlbm("hoby", hlbr(int ), (int)1076);
        }
        cfr_temp_0 = -2147483648;
        block39: while (true) {
            block71: {
                switch (cfr_temp_0 == -2147483648 ? var10_5 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hobz", hlbj(int ), (int)504)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == nd.hlbm("hoca", hlbr(int ), (int)1077)) {
                                var9_6 = nd.a;
                                if (var11_4) {
                                    throw null;
                                }
                                break;
                            }
                            v2 /* !! */  = (long)nd.hlbm("hocb", hlbr(int ), (int)1078);
                        }
                        if (var9_6 || var9_6) return null;
                        v3 = nd.hlbm("hocc", hlzk(int ), (int)1079);
                        v4 /* !! */  = nd.oo;
                        block41: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -87143707: {
                                    v5 = nd.hlbm("hoce", hlbj(int ), (int)506);
                                    ** GOTO lbl40
                                }
                                case 588301102: {
                                    v5 = nd.hlbm("hocf", hlbj(int ), (int)507);
lbl40:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - nd.hlbm("hocd", hlbj(int ), (int)505));
                                    continue block41;
                                }
                                case 1076290759: {
                                    break block41;
                                }
                            }
                            break;
                        }
                        var4_7 = nd.blend(var0, var1_1, (float)v3);
                        if (var9_6 || var9_6) return null;
                        v6 = nd.hlbm("hocg", hlzk(int ), (int)1080);
                        v7 /* !! */  = nd.oo;
                        block42: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -1183618061: {
                                    v8 = nd.hlbm("hoci", hlbj(int ), (int)509);
                                    ** GOTO lbl55
                                }
                                case -658347914: {
                                    v8 = nd.hlbm("hocj", hlbj(int ), (int)510);
lbl55:
                                    // 2 sources

                                    v7 /* !! */  = (long)(v8 - nd.hlbm("hoch", hlbj(int ), (int)508));
                                    continue block42;
                                }
                                case 1076290759: {
                                    break block42;
                                }
                            }
                            break;
                        }
                        var5_8 = nd.blend(var2_2, var3_3, (float)v6);
                        if (var9_6 || var9_6) return null;
                        v9 = nd.hlbm("hock", hlzk(int ), (int)1081);
                        v10 /* !! */  = nd.oo;
                        block43: while (true) {
                            switch ((int)v10 /* !! */ ) {
                                case 266947055: {
                                    v11 = nd.hlbm("hocm", hlbj(int ), (int)512);
                                    ** GOTO lbl75
                                }
                                case 1076290759: {
                                    break block43;
                                }
                                case 1587511625: {
                                    v11 = nd.hlbm("hocn", hlbj(int ), (int)513);
                                    ** GOTO lbl75
                                }
                                case 2135181552: {
                                    v11 = nd.hlbm("hoco", hlbj(int ), (int)514);
lbl75:
                                    // 3 sources

                                    v10 /* !! */  = (long)(v11 - nd.hlbm("hocl", hlbj(int ), (int)511));
                                    continue block43;
                                }
                            }
                            break;
                        }
                        var6_9 = nd.blend(var0, var2_2, (float)v9);
                        if (var9_6 || var9_6) return null;
                        v12 = nd.hlbm("hocp", hlzk(int ), (int)1082);
                        v13 /* !! */  = nd.oo;
                        block44: while (true) {
                            switch ((int)v13 /* !! */ ) {
                                case 836574279: {
                                    v14 = nd.hlbm("hocr", hlbj(int ), (int)516);
                                    ** GOTO lbl90
                                }
                                case 1076290759: {
                                    break block44;
                                }
                                case 1214712763: {
                                    v14 = nd.hlbm("hocs", hlbj(int ), (int)517);
lbl90:
                                    // 2 sources

                                    v13 /* !! */  = (long)(v14 - nd.hlbm("hocq", hlbj(int ), (int)515));
                                    continue block44;
                                }
                            }
                            break;
                        }
                        var7_10 = nd.blend(var1_1, var3_3, (float)v12);
                        if (var9_6 || var9_6) return null;
                        v15 = nd.hlbm("hoct", hlzk(int ), (int)1083);
                        while (true) {
                            if ((v16 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hocu", hlbj(int ), (int)518)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v16 /* !! */  != nd.hlbm("hocv", hlbr(int ), (int)1084)) ** GOTO lbl101
                            v17 = nd.blend(var0, var3_3, (float)v15);
                            v18 = nd.hlbm("hocx", hlzk(int ), (int)1086);
                            ** GOTO lbl147
lbl101:
                            // 1 sources

                            v16 /* !! */  = (long)nd.hlbm("hocw", hlbr(int ), (int)1085);
                        }
                    }
                    case 0: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodf", hlbr(int ), (int)1092);
                        if (var11_4) {
                            throw null;
                        }
                    }
                    case 1: {
                        do {
                            var10_5 /* !! */  = (int)nd.hlbm("hodg", hlbr(int ), (int)1093);
                        } while (!var11_4);
                        throw null;
                    }
                    case 2: {
                        ** GOTO lbl130
                    }
                    case 8: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodn", hlbr(int ), (int)1100);
                        cfr_temp_0 = 7;
                        if (var11_4) {
                            throw null;
                        }
                        break block71;
                    }
                    case 9: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodo", hlbr(int ), (int)1101);
                        cfr_temp_0 = 3;
                        if (var11_4) {
                            throw null;
                        }
                        break block71;
                    }
                    case 13: {
                        var10_5 /* !! */  = (int)nd.hlbm("hods", hlbr(int ), (int)1105);
                        if (var11_4) {
                            throw null;
                        }
lbl130:
                        // 3 sources

                        var10_5 /* !! */  = (int)nd.hlbm("hodh", hlbr(int ), (int)1094);
                        if (var11_4) {
                            throw null;
                        }
                    }
                    case 11: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodq", hlbr(int ), (int)1103);
                        if (var11_4) {
                            throw null;
                        }
                    }
                    case 5: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodk", hlbr(int ), (int)1097);
                        if (var11_4) {
                            throw null;
                        }
                    }
                    case 10: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodp", hlbr(int ), (int)1102);
                        cfr_temp_0 = 12;
                        if (var11_4) {
                            throw null;
                        }
                        break block71;
                    }
lbl147:
                    // 1 sources

                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_5 = nd.oo - nd.hlbm("hocy", hlbj(int ), (int)519)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == nd.hlbm("hocz", hlbr(int ), (int)1087)) break;
                        v19 /* !! */  = (long)nd.hlbm("hoda", hlbr(int ), (int)1088);
                    }
                    v20 = nd.blend(var1_1, var2_2, (float)v18);
                    v21 = nd.hlbm("hodb", hlzk(int ), (int)1089);
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_6 = nd.oo - nd.hlbm("hodc", hlbj(int ), (int)520)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == nd.hlbm("hodd", hlbr(int ), (int)1090)) {
                            var8_11 = nd.blend(v17, v20, (float)v21);
                            if (var9_6) return null;
                            break;
                        }
                        v22 /* !! */  = (long)nd.hlbm("hode", hlbr(int ), (int)1091);
                    }
                    if (!var9_6) return new int[]{var0, var4_7, var1_1, var6_9, var8_11, var7_10, var2_2, var5_8, var3_3};
                    return null;
                    case 3: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodi", hlbr(int ), (int)1095);
                        if (var11_4) {
                            throw null;
                        }
                    }
                    case 12: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodr", hlbr(int ), (int)1104);
                        if (var11_4) {
                            throw null;
                        }
                    }
                    case 6: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodl", hlbr(int ), (int)1098);
                        if (var11_4) {
                            throw null;
                        }
                    }
                    case 7: {
                        var10_5 /* !! */  = (int)nd.hlbm("hodm", hlbr(int ), (int)1099);
                        if (var11_4) {
                            throw null;
                        }
                    }
                    case 4: 
                }
                ** GOTO lbl185
            }
            do {
                if (true) continue block39;
lbl185:
                // 2 sources

                var10_5 /* !! */  = (int)nd.hlbm("hodj", hlbr(int ), (int)1096);
                cfr_temp_0 = 3;
            } while (!var11_4);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int interpolate(int var0, int var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hphe", hlbj(int ), (int)678)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hphf", hlbr(int ), (int)1493)) break;
            v0 /* !! */  = (long)nd.hlbm("hphg", hlbr(int ), (int)1494);
        }
        var7_3 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hphh", hlbj(int ), (int)679)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nd.hlbm("hphi", hlbr(int ), (int)1495)) break;
            v1 /* !! */  = (long)nd.hlbm("hphj", hlbr(int ), (int)1496);
        }
        var6_4 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hphk", hlbj(int ), (int)680)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hphl", hlbr(int ), (int)1497)) break;
            v2 /* !! */  = (long)nd.hlbm("hphm", hlbr(int ), (int)1498);
        }
        var5_5 = nd.a;
        if (var7_3) {
            throw null;
lbl24:
            // 4 sources

            return (int)nd.hlbm("hphn", hlbr(int ), (int)1499);
        }
        if (var5_5) ** GOTO lbl24
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hpho", hlbj(int ), (int)681)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nd.hlbm("hphp", hlbr(int ), (int)1500)) break;
                    v3 /* !! */  = (long)nd.hlbm("hphq", hlbr(int ), (int)1501);
                }
                var3_6 = nd.rgba(var0);
                if (var5_5 || var5_5) ** GOTO lbl24
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hphr", hlbj(int ), (int)682)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nd.hlbm("hphs", hlbr(int ), (int)1502)) break;
                    v4 /* !! */  = (long)nd.hlbm("hpht", hlbr(int ), (int)1503);
                }
                var4_7 = nd.rgba(var1_1);
                if (!var5_5 && !var5_5) ** break;
                ** continue;
                v5 = var3_6[0] * nd.hlbm("hphu", hlzk(int ), (int)1504);
                v6 = var4_7[0] * nd.hlbm("hphv", hlzk(int ), (int)1505);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_5 = nd.oo - nd.hlbm("hphw", hlbj(int ), (int)683)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == nd.hlbm("hphx", hlbr(int ), (int)1506)) break;
                    v7 /* !! */  = (long)nd.hlbm("hphy", hlbr(int ), (int)1507);
                }
                v8 = (int)nm.interpolate(v5, v6, var2_2);
                v9 = var3_6[1] * nd.hlbm("hphz", hlzk(int ), (int)1508);
                v10 = var4_7[1] * nd.hlbm("hpia", hlzk(int ), (int)1509);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = nd.oo - nd.hlbm("hpib", hlbj(int ), (int)684)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == nd.hlbm("hpic", hlbr(int ), (int)1510)) break;
                    v11 /* !! */  = (long)nd.hlbm("hpid", hlbr(int ), (int)1511);
                }
                v12 = (int)nm.interpolate(v9, v10, var2_2);
                v13 = var3_6[2] * nd.hlbm("hpie", hlzk(int ), (int)1512);
                v14 = var4_7[2] * nd.hlbm("hpif", hlzk(int ), (int)1513);
                v15 /* !! */  = nd.oo;
                if (true) ** GOTO lbl72
                block33: while (true) {
                    v15 /* !! */  = (long)(nd.hlbm("hpih", hlbj(int ), (int)686) - nd.hlbm("hpig", hlbj(int ), (int)685));
lbl72:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 1057013771: {
                            continue block33;
                        }
                        case 1076290759: {
                            break block33;
                        }
                    }
                    break;
                }
                v16 = (int)nm.interpolate(v13, v14, var2_2);
                v17 = var3_6[3] * nd.hlbm("hpii", hlzk(int ), (int)1514);
                v18 = var4_7[3] * nd.hlbm("hpij", hlzk(int ), (int)1515);
                v19 /* !! */  = nd.oo;
                if (true) ** GOTO lbl84
                block34: while (true) {
                    v19 /* !! */  = (long)(v20 - nd.hlbm("hpik", hlbj(int ), (int)687));
lbl84:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1056640335: {
                            v20 = nd.hlbm("hpil", hlbj(int ), (int)688);
                            continue block34;
                        }
                        case 1076290759: {
                            break block34;
                        }
                        case 1109862330: {
                            v20 = nd.hlbm("hpim", hlbj(int ), (int)689);
                            continue block34;
                        }
                        case 1866610132: {
                            v20 = nd.hlbm("hpin", hlbj(int ), (int)690);
                            continue block34;
                        }
                    }
                    break;
                }
                v21 = (int)nm.interpolate(v17, v18, var2_2);
                v22 /* !! */  = nd.oo;
                if (true) ** GOTO lbl101
                block35: while (true) {
                    v22 /* !! */  = (long)(v23 - nd.hlbm("hpio", hlbj(int ), (int)691));
lbl101:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1499546498: {
                            v23 = nd.hlbm("hpip", hlbj(int ), (int)692);
                            continue block35;
                        }
                        case -684543594: {
                            v23 = nd.hlbm("hpiq", hlbj(int ), (int)693);
                            continue block35;
                        }
                        case 1076290759: {
                            break block35;
                        }
                    }
                    break;
                }
                return nd.rgba(v8, v12, v16, v21);
            }
lbl111:
            // 2 sources

            case 0: {
                var6_4 /* !! */  = (int)nd.hlbm("hpir", hlbr(int ), (int)1516);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 1: {
                do {
                    var6_4 /* !! */  = (int)nd.hlbm("hpis", hlbr(int ), (int)1517);
                } while (!var7_3);
                throw null;
            }
lbl121:
            // 4 sources

            case 2: {
                var6_4 /* !! */  = (int)nd.hlbm("hpit", hlbr(int ), (int)1518);
                if (!var7_3) ** GOTO lbl111
                throw null;
            }
            case 3: {
                var6_4 /* !! */  = (int)nd.hlbm("hpiu", hlbr(int ), (int)1519);
                if (!var7_3) ** GOTO lbl121
                throw null;
            }
lbl129:
            // 3 sources

            case 4: {
                var6_4 /* !! */  = (int)nd.hlbm("hpiv", hlbr(int ), (int)1520);
                if (!var7_3) ** GOTO lbl121
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)nd.hlbm("hpiw", hlbr(int ), (int)1521);
                    if (!var7_3) ** GOTO lbl121
                    throw null;
                }
            }
            case 6: {
                var6_4 /* !! */  = (int)nd.hlbm("hpix", hlbr(int ), (int)1522);
                if (!var7_3) ** GOTO lbl129
                throw null;
            }
            case 7: 
        }
        var6_4 /* !! */  = (int)nd.hlbm("hpiy", hlbr(int ), (int)1523);
        ** while (!var7_3)
lbl145:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hpll() {
        nd.hlbs[800] = 1130320056;
        nd.hlbs[801] = 1697696708;
        nd.hlbs[802] = 108643682;
        nd.hlbs[803] = -67161079;
        nd.hlbs[804] = -1412637250;
        nd.hlbs[805] = -77673883;
        nd.hlbs[806] = 564650953;
        nd.hlbs[807] = -559944837;
        nd.hlbs[808] = 1484632429;
        nd.hlbs[809] = -1552307045;
        nd.hlbs[810] = -341291396;
        nd.hlbs[811] = -528835789;
        nd.hlbs[812] = 929855218;
        nd.hlbs[813] = -409571533;
        nd.hlbs[814] = -1682363864;
        nd.hlbs[815] = 654676623;
        nd.hlbs[816] = 441380375;
        nd.hlbs[817] = -289294377;
        nd.hlbs[818] = -635168324;
        nd.hlbs[819] = 405263589;
        nd.hlbs[820] = -1763482813;
        nd.hlbs[821] = -1820737929;
        nd.hlbs[822] = 293491272;
        nd.hlbs[823] = -131451670;
        nd.hlbs[824] = 1202281709;
        nd.hlbs[825] = 1054120416;
        nd.hlbs[826] = 2028047014;
        nd.hlbs[827] = -1020957498;
        nd.hlbs[828] = -1383333739;
        nd.hlbs[829] = 357392695;
        nd.hlbs[830] = 70505495;
        nd.hlbs[831] = -836313193;
        nd.hlbs[832] = -1260297295;
        nd.hlbs[833] = 1519705713;
        nd.hlbs[834] = 195487479;
        nd.hlbs[835] = 127065502;
        nd.hlbs[836] = -1472019647;
        nd.hlbs[837] = 426228233;
        nd.hlbs[838] = 156563992;
        nd.hlbs[839] = -1363931367;
        nd.hlbs[840] = 1316757730;
        nd.hlbs[841] = -365510945;
        nd.hlbs[842] = 1671669999;
        nd.hlbs[843] = 985513;
        nd.hlbs[844] = -747557239;
        nd.hlbs[845] = 845698495;
        nd.hlbs[846] = 10418434;
        nd.hlbs[847] = -607151563;
        nd.hlbs[848] = -1823679114;
        nd.hlbs[849] = -1191548305;
        nd.hlbs[850] = -886913921;
        nd.hlbs[851] = -564169392;
        nd.hlbs[852] = 305901049;
        nd.hlbs[853] = -392748517;
        nd.hlbs[854] = 1476597259;
        nd.hlbs[855] = -452942136;
        nd.hlbs[856] = 1592915292;
        nd.hlbs[857] = -1709295696;
        nd.hlbs[858] = 1724128542;
        nd.hlbs[859] = -1990378688;
        nd.hlbs[860] = -1020070264;
        nd.hlbs[861] = -1112016217;
        nd.hlbs[862] = 288839567;
        nd.hlbs[863] = 1909140527;
        nd.hlbs[864] = 514985033;
        nd.hlbs[865] = -114106351;
        nd.hlbs[866] = 1575428580;
        nd.hlbs[867] = 1765879836;
        nd.hlbs[868] = 146574690;
        nd.hlbs[869] = 1885291662;
        nd.hlbs[870] = 2101157687;
        nd.hlbs[871] = 1797419068;
        nd.hlbs[872] = 300387544;
        nd.hlbs[873] = -1545776556;
        nd.hlbs[874] = 1884187846;
        nd.hlbs[875] = -1004648407;
        nd.hlbs[876] = -739527924;
        nd.hlbs[877] = 1052860593;
        nd.hlbs[878] = -464115014;
        nd.hlbs[879] = 895228869;
        nd.hlbs[880] = -150395859;
        nd.hlbs[881] = 1488177742;
        nd.hlbs[882] = 2145472049;
        nd.hlbs[883] = -726227502;
        nd.hlbs[884] = -1568347952;
        nd.hlbs[885] = 862185585;
        nd.hlbs[886] = 1381889442;
        nd.hlbs[887] = -1380036402;
        nd.hlbs[888] = -1876175819;
        nd.hlbs[889] = -936183358;
        nd.hlbs[890] = 54355964;
        nd.hlbs[891] = -605263196;
        nd.hlbs[892] = -412925335;
        nd.hlbs[893] = -825080129;
        nd.hlbs[894] = -1283243592;
        nd.hlbs[895] = -1336485340;
        nd.hlbs[896] = -331454715;
        nd.hlbs[897] = -665336249;
        nd.hlbs[898] = 937693680;
        nd.hlbs[899] = -1465513641;
    }

    private static /* synthetic */ void hpry() {
        nd.hlbl[400] = 7302396509501218280L;
        nd.hlbl[401] = 6499189190475068858L;
        nd.hlbl[402] = 3506206046373695080L;
        nd.hlbl[403] = -929543021632736833L;
        nd.hlbl[404] = -1763224992889222512L;
        nd.hlbl[405] = -6535498115776900991L;
        nd.hlbl[406] = 3027399843186214821L;
        nd.hlbl[407] = 5978197330148816767L;
        nd.hlbl[408] = -4222467516273407643L;
        nd.hlbl[409] = 1576134208026641507L;
        nd.hlbl[410] = 7417417784383925506L;
        nd.hlbl[411] = 8522792448666499498L;
        nd.hlbl[412] = -1234574988923036913L;
        nd.hlbl[413] = 3065090071456408439L;
        nd.hlbl[414] = -5523326792103017082L;
        nd.hlbl[415] = 7016029106126573446L;
        nd.hlbl[416] = 5389876473518549135L;
        nd.hlbl[417] = -5876854018305962872L;
        nd.hlbl[418] = 1735657657098179565L;
        nd.hlbl[419] = 9005448317494330430L;
        nd.hlbl[420] = 6194125802660759419L;
        nd.hlbl[421] = 6441179916614405861L;
        nd.hlbl[422] = 6693001622101528897L;
        nd.hlbl[423] = -5225107887561369149L;
        nd.hlbl[424] = -6237678174961869976L;
        nd.hlbl[425] = -7550031008937798150L;
        nd.hlbl[426] = 7405057609676030731L;
        nd.hlbl[427] = 2827711791802350670L;
        nd.hlbl[428] = -208716508355118454L;
        nd.hlbl[429] = 4017190248488592959L;
        nd.hlbl[430] = 2312483130516151152L;
        nd.hlbl[431] = 2889775266304696411L;
        nd.hlbl[432] = 8698504676647069251L;
        nd.hlbl[433] = 3139586881983762364L;
        nd.hlbl[434] = -3263480143320102863L;
        nd.hlbl[435] = -7437753314628079444L;
        nd.hlbl[436] = 2144551241927295919L;
        nd.hlbl[437] = 4357562156643989257L;
        nd.hlbl[438] = -3793195807402239323L;
        nd.hlbl[439] = 51923985788289880L;
        nd.hlbl[440] = -713456922123612846L;
        nd.hlbl[441] = 8527485133044077332L;
        nd.hlbl[442] = 6023789973104372341L;
        nd.hlbl[443] = -6607305708217917699L;
        nd.hlbl[444] = -2651651513943211602L;
        nd.hlbl[445] = 1696519962570226904L;
        nd.hlbl[446] = 4064589280128138111L;
        nd.hlbl[447] = 506821988904830091L;
        nd.hlbl[448] = -4671593201303525267L;
        nd.hlbl[449] = -5437686566344887026L;
        nd.hlbl[450] = -640341291161511483L;
        nd.hlbl[451] = 2530403502660689070L;
        nd.hlbl[452] = 6796215383428854302L;
        nd.hlbl[453] = 7846566035844552718L;
        nd.hlbl[454] = -6505608937101400733L;
        nd.hlbl[455] = -7187043334360214543L;
        nd.hlbl[456] = 4090557416259443250L;
        nd.hlbl[457] = 7670608440228149848L;
        nd.hlbl[458] = -4869924320977924018L;
        nd.hlbl[459] = 8058881804588953079L;
        nd.hlbl[460] = -660142928516264556L;
        nd.hlbl[461] = -3374447236281025429L;
        nd.hlbl[462] = -137941857044799731L;
        nd.hlbl[463] = 1654340539996652978L;
        nd.hlbl[464] = -5722666799961440641L;
        nd.hlbl[465] = -8714187411028738973L;
        nd.hlbl[466] = 1807305901193467435L;
        nd.hlbl[467] = -3409263191440447798L;
        nd.hlbl[468] = -8323037365820668525L;
        nd.hlbl[469] = -6033172880987142342L;
        nd.hlbl[470] = 85235615804646559L;
        nd.hlbl[471] = -5854123303311541439L;
        nd.hlbl[472] = -4148134300498025199L;
        nd.hlbl[473] = -1212216426405303L;
        nd.hlbl[474] = 1661764718277557924L;
        nd.hlbl[475] = 4514186623971082606L;
        nd.hlbl[476] = -7653481724319665720L;
        nd.hlbl[477] = -8099568043879368501L;
        nd.hlbl[478] = 9038054063199185022L;
        nd.hlbl[479] = 6949899651642740268L;
        nd.hlbl[480] = -4452662716865403571L;
        nd.hlbl[481] = 6928079298568032038L;
        nd.hlbl[482] = -778266162344153073L;
        nd.hlbl[483] = -5423390391146612084L;
        nd.hlbl[484] = 4410802397009186942L;
        nd.hlbl[485] = -6721316569911633092L;
        nd.hlbl[486] = -2812994335280837629L;
        nd.hlbl[487] = -7068550387680383367L;
        nd.hlbl[488] = -4148829032972354L;
        nd.hlbl[489] = 6830145865994339420L;
        nd.hlbl[490] = -3838192648800120156L;
        nd.hlbl[491] = -1121883506047251306L;
        nd.hlbl[492] = 6985258239928358905L;
        nd.hlbl[493] = 6323019681834279637L;
        nd.hlbl[494] = 5723333853561344443L;
        nd.hlbl[495] = 4477228104620151084L;
        nd.hlbl[496] = 8661252033973819104L;
        nd.hlbl[497] = -6070147988767285312L;
        nd.hlbl[498] = -4144146643511916728L;
        nd.hlbl[499] = 7956462410874292322L;
    }

    private static /* synthetic */ void hppu() {
        nd.hlbk[0] = -1980900687891657975L;
        nd.hlbk[1] = -1643471260791129736L;
        nd.hlbk[2] = 3191070435426524726L;
        nd.hlbk[3] = 2215203236289719705L;
        nd.hlbk[4] = -6535193907000749402L;
        nd.hlbk[5] = 1219859774179954116L;
        nd.hlbk[6] = 5835499889129800588L;
        nd.hlbk[7] = -6252090400996040925L;
        nd.hlbk[8] = 2425425487419057532L;
        nd.hlbk[9] = -3253569505832088465L;
        nd.hlbk[10] = -1152602663483707347L;
        nd.hlbk[11] = 2900820706415109691L;
        nd.hlbk[12] = 4133476462123812903L;
        nd.hlbk[13] = 7434206237752017144L;
        nd.hlbk[14] = -7807991450181604672L;
        nd.hlbk[15] = -103677291078461459L;
        nd.hlbk[16] = 3889368789388464295L;
        nd.hlbk[17] = 4095829714815044959L;
        nd.hlbk[18] = -7545929966982646822L;
        nd.hlbk[19] = -6744871426304004618L;
        nd.hlbk[20] = 6599554562421489090L;
        nd.hlbk[21] = 5879391953871186356L;
        nd.hlbk[22] = 7094808392454435792L;
        nd.hlbk[23] = -2483608147964002798L;
        nd.hlbk[24] = 3930594790231148098L;
        nd.hlbk[25] = -956812362770915306L;
        nd.hlbk[26] = 6687127137779917292L;
        nd.hlbk[27] = 7643905156897855871L;
        nd.hlbk[28] = 2034009519519423097L;
        nd.hlbk[29] = 3564243326615759296L;
        nd.hlbk[30] = -1741933322765512170L;
        nd.hlbk[31] = 4798546154075707401L;
        nd.hlbk[32] = -8321554530717207507L;
        nd.hlbk[33] = -1541699539161274857L;
        nd.hlbk[34] = -2739139656973318154L;
        nd.hlbk[35] = 4881173704458588261L;
        nd.hlbk[36] = -2087864543947831276L;
        nd.hlbk[37] = -7984118444611105226L;
        nd.hlbk[38] = 5324666672695706478L;
        nd.hlbk[39] = -5109794742306418612L;
        nd.hlbk[40] = -1092098218232586805L;
        nd.hlbk[41] = -1246992488679862479L;
        nd.hlbk[42] = 1505331424148087573L;
        nd.hlbk[43] = -6191144038457553787L;
        nd.hlbk[44] = -7235488782525980757L;
        nd.hlbk[45] = -135653800571328199L;
        nd.hlbk[46] = -4115084605629206489L;
        nd.hlbk[47] = 8108116458288681039L;
        nd.hlbk[48] = 4982025411311236879L;
        nd.hlbk[49] = -3346870040291553177L;
        nd.hlbk[50] = 7314693886960024053L;
        nd.hlbk[51] = -4586206841839939197L;
        nd.hlbk[52] = 2616529697810834348L;
        nd.hlbk[53] = -3236432091057890131L;
        nd.hlbk[54] = 8926330537357018027L;
        nd.hlbk[55] = -8804233227582984129L;
        nd.hlbk[56] = 4211362093707054091L;
        nd.hlbk[57] = -540783853743653713L;
        nd.hlbk[58] = 1625102285340540147L;
        nd.hlbk[59] = 7023566433393988879L;
        nd.hlbk[60] = -6811142469293074595L;
        nd.hlbk[61] = 765020576917089252L;
        nd.hlbk[62] = 629921914981102684L;
        nd.hlbk[63] = -7685255373425687211L;
        nd.hlbk[64] = -351148843574130412L;
        nd.hlbk[65] = 7185876902090755916L;
        nd.hlbk[66] = 5483101834478299699L;
        nd.hlbk[67] = -201093800670357958L;
        nd.hlbk[68] = -3473129140450031793L;
        nd.hlbk[69] = -1065447114340087668L;
        nd.hlbk[70] = -3724725191860005700L;
        nd.hlbk[71] = 606342250376787991L;
        nd.hlbk[72] = 7297010773331991903L;
        nd.hlbk[73] = -7482455800598280002L;
        nd.hlbk[74] = -2828673847115373370L;
        nd.hlbk[75] = 2094883335605258795L;
        nd.hlbk[76] = 2222509272655058232L;
        nd.hlbk[77] = -4369201500419545184L;
        nd.hlbk[78] = -3898635402911411016L;
        nd.hlbk[79] = 3196188504597939887L;
        nd.hlbk[80] = -4732621294236717891L;
        nd.hlbk[81] = 3061779327898773540L;
        nd.hlbk[82] = 919044309034582829L;
        nd.hlbk[83] = -469770040422886367L;
        nd.hlbk[84] = 8416316231505800867L;
        nd.hlbk[85] = -3871769430315144939L;
        nd.hlbk[86] = 3281161216868306041L;
        nd.hlbk[87] = 1396199255008916652L;
        nd.hlbk[88] = 7363937668346745228L;
        nd.hlbk[89] = 2359102605053624954L;
        nd.hlbk[90] = -554045975399579197L;
        nd.hlbk[91] = -5910143784411355633L;
        nd.hlbk[92] = -7505599707584546782L;
        nd.hlbk[93] = -3076905468571463882L;
        nd.hlbk[94] = 5364309389296769356L;
        nd.hlbk[95] = -5900898545682422841L;
        nd.hlbk[96] = -8195136073546677983L;
        nd.hlbk[97] = 5207171362122123568L;
        nd.hlbk[98] = -724694472699410938L;
        nd.hlbk[99] = -5187631381100441150L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float[] uniform8(float var0) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hojt", hlbj(int ), (int)592) - nd.hlbm("hojs", hlbj(int ), (int)591));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2050849595: {
                    continue block16;
                }
                case 1076290759: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hoju", hlbj(int ), (int)593));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 438049388: {
                    v2 = nd.hlbm("hojv", hlbj(int ), (int)594);
                    continue block17;
                }
                case 815719535: {
                    v2 = nd.hlbm("hojw", hlbj(int ), (int)595);
                    continue block17;
                }
                case 912160934: {
                    v2 = nd.hlbm("hojx", hlbj(int ), (int)596);
                    continue block17;
                }
                case 1076290759: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hojy", hlbj(int ), (int)597)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nd.hlbm("hojz", hlbr(int ), (int)1191)) break;
            v3 /* !! */  = (long)nd.hlbm("hoka", hlbr(int ), (int)1192);
        }
        var1_3 = nd.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                return new float[]{var0, var0, var0, var0, var0, var0, var0, var0};
            }
            case 0: {
                var2_2 /* !! */  = (int)nd.hlbm("hokb", hlbr(int ), (int)1193);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: {
                var2_2 /* !! */  = (int)nd.hlbm("hokc", hlbr(int ), (int)1194);
                if (!var3_1) break;
                throw null;
            }
lbl54:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)nd.hlbm("hokd", hlbr(int ), (int)1195);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)nd.hlbm("hoke", hlbr(int ), (int)1196);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int alpha(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlpb", hlbj(int ), (int)83)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hlpc", hlbr(int ), (int)67)) break;
            v0 /* !! */  = (long)nd.hlbm("hlpd", hlbr(int ), (int)68);
        }
        var3_1 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlpe", hlbj(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nd.hlbm("hlpf", hlbr(int ), (int)69)) break;
            v1 /* !! */  = (long)nd.hlbm("hlpg", hlbr(int ), (int)70);
        }
        var2_2 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hlph", hlbj(int ), (int)85)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hlpi", hlbr(int ), (int)71)) break;
            v2 /* !! */  = (long)nd.hlbm("hlpj", hlbr(int ), (int)72);
        }
        var1_3 = nd.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)nd.hlbm("hlpk", hlbr(int ), (int)73);
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block9;
                return var0 >> nd.hlbm("hlpl", hlbr(int ), (int)74) & nd.hlbm("hlpm", hlbr(int ), (int)75);
lbl30:
                // 2 sources

                case 0: {
                    do {
                        var2_2 /* !! */  = (int)nd.hlbm("hlpn", hlbr(int ), (int)76);
                    } while (!var3_1);
                    throw null;
                }
lbl35:
                // 2 sources

                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)nd.hlbm("hlpo", hlbr(int ), (int)77);
                        if (!var3_1) ** GOTO lbl30
                        throw null;
                    }
                }
                case 2: {
                    var2_2 /* !! */  = (int)nd.hlbm("hlpp", hlbr(int ), (int)78);
                    if (!var3_1) ** GOTO lbl35
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)nd.hlbm("hlpq", hlbr(int ), (int)79);
        ** while (!var3_1)
lbl47:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int[] horizontal(int var0, int var1_1) {
        block35: {
            block36: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hntx", hlbj(int ), (int)417)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == nd.hlbm("hnty", hlbr(int ), (int)954)) break;
                    v0 /* !! */  = (long)nd.hlbm("hntz", hlbr(int ), (int)955);
                }
                var4_2 = nd.c;
                v1 /* !! */  = nd.oo;
                block22: while (true) {
                    switch ((int)v1 /* !! */ ) {
                        case -1260318445: {
                            v1 /* !! */  = (long)(nd.hlbm("hnub", hlbj(int ), (int)419) - nd.hlbm("hnua", hlbj(int ), (int)418));
                            continue block22;
                        }
                        case 1076290759: {
                            break block22;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = nd.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnuc", hlbj(int ), (int)420)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == nd.hlbm("hnud", hlbr(int ), (int)956)) {
                        var2_4 = nd.a;
                        if (var4_2) {
                            throw null;
                        }
                        break;
                    }
                    v2 /* !! */  = (long)nd.hlbm("hnue", hlbr(int ), (int)957);
                }
                if (var2_4 || var2_4) break block36;
                v3 = new int[9];
                v3[0] = var0;
                v4 = nd.hlbm("hnuf", hlbr(int ), (int)958);
                v5 = nd.hlbm("hnug", hlzk(int ), (int)959);
                v6 /* !! */  = nd.oo;
                ** GOTO lbl39
            }
            if (var3_3 /* !! */  == 0) return null;
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: {
                        return null;
                    }
lbl39:
                    // 1 sources

                    block25: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -266196723: {
                                v7 = nd.hlbm("hnui", hlbj(int ), (int)422);
                                ** GOTO lbl46
                            }
                            case -70957504: {
                                v7 = nd.hlbm("hnuj", hlbj(int ), (int)423);
lbl46:
                                // 2 sources

                                v6 /* !! */  = (long)(v7 - nd.hlbm("hnuh", hlbj(int ), (int)421));
                                continue block25;
                            }
                            case 1076290759: {
                                break block25;
                            }
                        }
                        break;
                    }
                    v3[v4] = nd.blend(var0, var1_1, (float)v5);
                    v3[2] = var1_1;
                    v3[3] = var0;
                    v8 = nd.hlbm("hnuk", hlbr(int ), (int)960);
                    v9 = nd.hlbm("hnul", hlzk(int ), (int)961);
                    v10 /* !! */  = nd.oo;
                    if (true) ** GOTO lbl70
                    case 2: {
                        var3_3 /* !! */  = (int)nd.hlbm("hnuw", hlbr(int ), (int)967);
                        cfr_temp_0 = 1;
                        if (var4_2) {
                            throw null;
                        }
                        break block35;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)nd.hlbm("hnux", hlbr(int ), (int)968);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    block26: while (true) {
                        v10 /* !! */  = (long)(v11 - nd.hlbm("hnum", hlbj(int ), (int)424));
lbl70:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1541804899: {
                                v11 = nd.hlbm("hnun", hlbj(int ), (int)425);
                                continue block26;
                            }
                            case 100510324: {
                                v11 = nd.hlbm("hnuo", hlbj(int ), (int)426);
                                continue block26;
                            }
                            case 777694555: {
                                v11 = nd.hlbm("hnup", hlbj(int ), (int)427);
                                continue block26;
                            }
                            case 1076290759: {
                                break block26;
                            }
                        }
                        break;
                    }
                    v3[v8] = nd.blend(var0, var1_1, (float)v9);
                    v3[5] = var1_1;
                    v3[6] = var0;
                    v12 = nd.hlbm("hnuq", hlbr(int ), (int)962);
                    v13 = nd.hlbm("hnur", hlzk(int ), (int)963);
                    while (true) {
                        if ((v14 = (cfr_temp_3 = nd.oo - nd.hlbm("hnus", hlbj(int ), (int)428)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v14 == nd.hlbm("hnut", hlbr(int ), (int)964)) {
                            v3[v12] = nd.blend(var0, var1_1, (float)v13);
                            v3[8] = var1_1;
                            return v3;
                        }
                        v14 = -375225504;
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)nd.hlbm("hnuu", hlbr(int ), (int)965);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                break;
            }
            ** GOTO lbl104
        }
        do {
            if (true) ** continue;
lbl104:
            // 2 sources

            var3_3 /* !! */  = (int)nd.hlbm("hnuv", hlbr(int ), (int)966);
            cfr_temp_0 = 0;
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setClientColor(int var0, int var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hmkp", hlbj(int ), (int)222)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hmkq", hlbr(int ), (int)487)) break;
            v0 /* !! */  = (long)nd.hlbm("hmkr", hlbr(int ), (int)488);
        }
        var5_3 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hmks", hlbj(int ), (int)223)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nd.hlbm("hmkt", hlbr(int ), (int)489)) break;
            v1 /* !! */  = (long)nd.hlbm("hmku", hlbr(int ), (int)490);
        }
        var4_4 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl17
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - nd.hlbm("hmkv", hlbj(int ), (int)224));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 199047471: {
                    v3 = nd.hlbm("hmkw", hlbj(int ), (int)225);
                    continue block19;
                }
                case 1076290759: {
                    break block19;
                }
                case 1402269868: {
                    v3 = nd.hlbm("hmkx", hlbj(int ), (int)226);
                    continue block19;
                }
            }
            break;
        }
        var3_5 = nd.a;
        if (var5_3) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hmky", hlbj(int ), (int)227)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nd.hlbm("hmkz", hlbr(int ), (int)491)) break;
            v4 /* !! */  = (long)nd.hlbm("hmla", hlbr(int ), (int)492);
        }
        nd.clientColorR = var0;
        if (var3_5 || var3_5) ** GOTO lbl29
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hmlb", hlbj(int ), (int)228)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nd.hlbm("hmlc", hlbr(int ), (int)493)) break;
            v5 /* !! */  = (long)nd.hlbm("hmld", hlbr(int ), (int)494);
        }
        nd.clientColorG = var1_1;
        if (var3_5) ** GOTO lbl29
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hmle", hlbj(int ), (int)229)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nd.hlbm("hmlf", hlbr(int ), (int)495)) break;
                    v6 /* !! */  = (long)nd.hlbm("hmlg", hlbr(int ), (int)496);
                }
                nd.clientColorB = var2_2;
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return;
            }
lbl59:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)nd.hlbm("hmlh", hlbr(int ), (int)497);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl64:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)nd.hlbm("hmli", hlbr(int ), (int)498);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl78
            }
            case 2: {
                var4_4 /* !! */  = (int)nd.hlbm("hmlj", hlbr(int ), (int)499);
                if (!var5_3) break;
                throw null;
            }
            case 3: {
                do {
                    var4_4 /* !! */  = (int)nd.hlbm("hmlk", hlbr(int ), (int)500);
                } while (!var5_3);
                throw null;
            }
lbl78:
            // 3 sources

            case 4: {
                var4_4 /* !! */  = (int)nd.hlbm("hmll", hlbr(int ), (int)501);
                if (!var5_3) ** GOTO lbl64
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)nd.hlbm("hmlm", hlbr(int ), (int)502);
                if (!var5_3) ** GOTO lbl59
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)nd.hlbm("hmln", hlbr(int ), (int)503);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl96
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)nd.hlbm("hmlo", hlbr(int ), (int)504);
                    if (!var5_3) ** GOTO lbl78
                    throw null;
                }
            }
lbl96:
            // 3 sources

            case 8: {
                var4_4 /* !! */  = (int)nd.hlbm("hmlp", hlbr(int ), (int)505);
                if (!var5_3) break;
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)nd.hlbm("hmlq", hlbr(int ), (int)506);
        ** while (!var5_3)
lbl103:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hplg() {
        nd.hlbs[300] = -1207597953;
        nd.hlbs[301] = -584747417;
        nd.hlbs[302] = 2005528447;
        nd.hlbs[303] = 2097488033;
        nd.hlbs[304] = -72759964;
        nd.hlbs[305] = 458227432;
        nd.hlbs[306] = 1914658699;
        nd.hlbs[307] = 408981315;
        nd.hlbs[308] = -1587788770;
        nd.hlbs[309] = 1351801185;
        nd.hlbs[310] = -1611119444;
        nd.hlbs[311] = -1149967382;
        nd.hlbs[312] = -610589935;
        nd.hlbs[313] = 758564144;
        nd.hlbs[314] = 71950781;
        nd.hlbs[315] = 742668067;
        nd.hlbs[316] = -1909833994;
        nd.hlbs[317] = -24575813;
        nd.hlbs[318] = 1196804696;
        nd.hlbs[319] = 712771218;
        nd.hlbs[320] = 921817848;
        nd.hlbs[321] = 1620547650;
        nd.hlbs[322] = 398582881;
        nd.hlbs[323] = 909904887;
        nd.hlbs[324] = 581705288;
        nd.hlbs[325] = 1271540968;
        nd.hlbs[326] = -240781722;
        nd.hlbs[327] = 2031205601;
        nd.hlbs[328] = 1754166022;
        nd.hlbs[329] = -797140005;
        nd.hlbs[330] = 219306343;
        nd.hlbs[331] = 2019979975;
        nd.hlbs[332] = 1240296409;
        nd.hlbs[333] = 87238562;
        nd.hlbs[334] = 1442356662;
        nd.hlbs[335] = 1610251561;
        nd.hlbs[336] = 916666255;
        nd.hlbs[337] = 1800799563;
        nd.hlbs[338] = 1150827405;
        nd.hlbs[339] = -1947752598;
        nd.hlbs[340] = -2013646547;
        nd.hlbs[341] = -992184568;
        nd.hlbs[342] = -182543102;
        nd.hlbs[343] = -1739986226;
        nd.hlbs[344] = 558708108;
        nd.hlbs[345] = -785525933;
        nd.hlbs[346] = 1212882456;
        nd.hlbs[347] = -1185585638;
        nd.hlbs[348] = 1655860474;
        nd.hlbs[349] = 453057749;
        nd.hlbs[350] = 1255984483;
        nd.hlbs[351] = -712194938;
        nd.hlbs[352] = -31687667;
        nd.hlbs[353] = 1114248575;
        nd.hlbs[354] = -677836571;
        nd.hlbs[355] = -1388598239;
        nd.hlbs[356] = 1168724525;
        nd.hlbs[357] = 2009916906;
        nd.hlbs[358] = -317241087;
        nd.hlbs[359] = -359862879;
        nd.hlbs[360] = -510328604;
        nd.hlbs[361] = 207603335;
        nd.hlbs[362] = -1502631664;
        nd.hlbs[363] = -322142429;
        nd.hlbs[364] = -1464181368;
        nd.hlbs[365] = -1787540464;
        nd.hlbs[366] = 565118777;
        nd.hlbs[367] = 1809940456;
        nd.hlbs[368] = -1359849534;
        nd.hlbs[369] = -2026359450;
        nd.hlbs[370] = -372453602;
        nd.hlbs[371] = 520932767;
        nd.hlbs[372] = -868337759;
        nd.hlbs[373] = -331880572;
        nd.hlbs[374] = 285982315;
        nd.hlbs[375] = -1749225218;
        nd.hlbs[376] = -1514651376;
        nd.hlbs[377] = -420808325;
        nd.hlbs[378] = -42976094;
        nd.hlbs[379] = -1223665026;
        nd.hlbs[380] = 285828539;
        nd.hlbs[381] = -1942655918;
        nd.hlbs[382] = -1064559994;
        nd.hlbs[383] = 111888030;
        nd.hlbs[384] = -338034470;
        nd.hlbs[385] = -1464835377;
        nd.hlbs[386] = -2021080009;
        nd.hlbs[387] = -870926391;
        nd.hlbs[388] = -845230675;
        nd.hlbs[389] = -1826079200;
        nd.hlbs[390] = 1834370581;
        nd.hlbs[391] = -1389208819;
        nd.hlbs[392] = 1568836339;
        nd.hlbs[393] = 427893593;
        nd.hlbs[394] = -2139703968;
        nd.hlbs[395] = -191146553;
        nd.hlbs[396] = -2059401434;
        nd.hlbs[397] = 1450937888;
        nd.hlbs[398] = -1253916354;
        nd.hlbs[399] = 42349863;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int colorForRectsCustom$() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnjz", hlbj(int ), (int)323)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hnka", hlbr(int ), (int)790)) break;
            v0 /* !! */  = (long)nd.hlbm("hnkb", hlbr(int ), (int)791);
        }
        var2 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hnkc", hlbj(int ), (int)324));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -835448769: {
                    v2 = nd.hlbm("hnkd", hlbj(int ), (int)325);
                    continue block21;
                }
                case 411614467: {
                    v2 = nd.hlbm("hnke", hlbj(int ), (int)326);
                    continue block21;
                }
                case 1076290759: {
                    break block21;
                }
            }
            break;
        }
        var1_1 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl25
        block22: while (true) {
            v3 /* !! */  = (long)(nd.hlbm("hnkg", hlbj(int ), (int)328) - nd.hlbm("hnkf", hlbj(int ), (int)327));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1041080206: {
                    continue block22;
                }
                case 1076290759: {
                    break block22;
                }
            }
            break;
        }
        var0_2 = nd.a;
        if (!var2) ** GOTO lbl37
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)nd.hlbm("hnkh", hlbr(int ), (int)792);
                }
lbl37:
                // 1 sources

                if (var0_2 || var0_2) continue block23;
                v4 /* !! */  = nd.oo;
                if (true) ** GOTO lbl42
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - nd.hlbm("hnki", hlbj(int ), (int)329));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -237232260: {
                            v5 = nd.hlbm("hnkj", hlbj(int ), (int)330);
                            continue block24;
                        }
                        case 1076290759: {
                            break block24;
                        }
                        case 1876455481: {
                            v5 = nd.hlbm("hnkk", hlbj(int ), (int)331);
                            continue block24;
                        }
                    }
                    break;
                }
                v6 = nd.hlbm("hnkl", hlbr(int ), (int)793);
                v7 = nd.hlbm("hnkm", hlbr(int ), (int)794);
                v8 = nd.hlbm("hnkn", hlbr(int ), (int)795);
                v9 = nd.hlbm("hnko", hlbr(int ), (int)796);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnkp", hlbj(int ), (int)332)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nd.hlbm("hnkq", hlbr(int ), (int)797)) break;
                    v10 /* !! */  = (long)nd.hlbm("hnkr", hlbr(int ), (int)798);
                }
                v11 = new Color((int)v6, (int)v7, (int)v8, (int)v9);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnks", hlbj(int ), (int)333)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nd.hlbm("hnkt", hlbr(int ), (int)799)) break;
                    v12 /* !! */  = (long)nd.hlbm("hnku", hlbr(int ), (int)800);
                }
                return v11.getRGB();
lbl67:
                // 2 sources

                case 0: {
                    var1_1 /* !! */  = (int)nd.hlbm("hnkv", hlbr(int ), (int)801);
                    if (!var2) break block23;
                    throw null;
                }
lbl71:
                // 2 sources

                case 1: {
                    var1_1 /* !! */  = (int)nd.hlbm("hnkw", hlbr(int ), (int)802);
                    if (!var2) ** GOTO lbl67
                    throw null;
                }
                case 2: {
                    var1_1 /* !! */  = (int)nd.hlbm("hnkx", hlbr(int ), (int)803);
                    if (!var2) ** GOTO lbl71
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var1_1 /* !! */  = (int)nd.hlbm("hnky", hlbr(int ), (int)804);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int green(int var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlnw", hlbj(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hlnx", hlbr(int ), (int)46)) break;
            v0 /* !! */  = (long)nd.hlbm("hlny", hlbr(int ), (int)47);
        }
        var3_1 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlnz", hlbj(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nd.hlbm("hloa", hlbr(int ), (int)48)) break;
            v1 /* !! */  = (long)nd.hlbm("hlob", hlbr(int ), (int)49);
        }
        var2_2 /* !! */  = nd.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = nd.oo;
                if (true) ** GOTO lbl22
                block13: while (true) {
                    v2 /* !! */  = (long)(v3 - nd.hlbm("hloc", hlbj(int ), (int)76));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1412944254: {
                            v3 = nd.hlbm("hlod", hlbj(int ), (int)77);
                            continue block13;
                        }
                        case 1076290759: {
                            break block13;
                        }
                        case 1435398042: {
                            v3 = nd.hlbm("hlof", hlbj(int ), (int)78);
                            continue block13;
                        }
                    }
                    break;
                }
                var1_3 = nd.a;
                if (var3_1) {
                    throw null;
                    return (int)nd.hlbm("hlog", hlbr(int ), (int)50);
                }
                if (var1_3 || var1_3) ** continue;
                return var0 >> nd.hlbm("hloh", hlbr(int ), (int)51) & nd.hlbm("hloi", hlbr(int ), (int)52);
            }
            case 0: {
                var2_2 /* !! */  = (int)nd.hlbm("hloj", hlbr(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl48
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nd.hlbm("hlok", hlbr(int ), (int)54);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
lbl48:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)nd.hlbm("hlol", hlbr(int ), (int)55);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nd.hlbm("hlom", hlbr(int ), (int)56);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ Optional lambda$toLegacyText$0(StringBuilder var0, class_2583 var1_1, String var2_2) {
        block74: {
            var5_3 = nd.c;
            var4_4 /* !! */  = nd.b;
            var3_5 = nd.a;
            if (var5_3) {
                throw null;
lbl6:
                // 23 sources

                return null;
            }
            if (var3_5 || var3_5) ** GOTO lbl6
            if (var1_1 == null) break block74;
            if (var3_5) ** GOTO lbl6
            if (var1_1.method_10973() == null) break block74;
            if (var3_5 || var3_5) ** GOTO lbl6
            v0 = new Object[1];
            v0[nd.hlbm("hpiz", hlbr(int ), (int)1524)] = var1_1.method_10973().method_27716() & nd.hlbm("hpja", hlbr(int ), (int)1525);
            var0.append("\u00a7#").append(String.format("%06x", v0));
            if (var3_5) ** GOTO lbl6
        }
        if (var3_5 || var3_5) ** GOTO lbl6
        if (var1_1 == null) ** GOTO lbl55
        if (var3_5 || var3_5) ** GOTO lbl6
        if (!var1_1.method_10984()) ** GOTO lbl31
        if (var3_5) ** GOTO lbl6
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl6
                var0.append("\u00a7l");
                if (var3_5) ** GOTO lbl6
lbl31:
                // 2 sources

                if (var3_5 || var3_5) ** GOTO lbl6
                if (!var1_1.method_10966()) ** GOTO lbl37
                if (var3_5 || var3_5) ** GOTO lbl6
                var0.append("\u00a7o");
                if (var3_5) ** GOTO lbl6
lbl37:
                // 2 sources

                if (var3_5 || var3_5) ** GOTO lbl6
                if (!var1_1.method_10965()) ** GOTO lbl43
                if (var3_5 || var3_5) ** GOTO lbl6
                var0.append("\u00a7n");
                if (var3_5) ** GOTO lbl6
lbl43:
                // 2 sources

                if (var3_5 || var3_5) ** GOTO lbl6
                if (!var1_1.method_10986()) ** GOTO lbl49
                if (var3_5 || var3_5) ** GOTO lbl6
                var0.append("\u00a7m");
                if (var3_5) ** GOTO lbl6
lbl49:
                // 2 sources

                if (var3_5 || var3_5) ** GOTO lbl6
                if (!var1_1.method_10987()) ** GOTO lbl55
                if (var3_5 || var3_5) ** GOTO lbl6
                var0.append("\u00a7k");
                if (var3_5) ** GOTO lbl6
lbl55:
                // 3 sources

                if (var3_5 || var3_5) ** GOTO lbl6
                var0.append(var2_2);
                if (!var3_5 && !var3_5) ** break;
                ** continue;
                return Optional.empty();
            }
lbl61:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjb", hlbr(int ), (int)1526);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl66:
            // 4 sources

            case 1: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjc", hlbr(int ), (int)1527);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl71:
            // 2 sources

            case 2: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjd", hlbr(int ), (int)1528);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 3: {
                var4_4 /* !! */  = (int)nd.hlbm("hpje", hlbr(int ), (int)1529);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl81:
            // 2 sources

            case 4: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjf", hlbr(int ), (int)1530);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl86:
            // 4 sources

            case 5: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjg", hlbr(int ), (int)1531);
                if (!var5_3) ** GOTO lbl66
                throw null;
            }
lbl90:
            // 6 sources

            case 6: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjh", hlbr(int ), (int)1532);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl95:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)nd.hlbm("hpji", hlbr(int ), (int)1533);
                if (!var5_3) ** GOTO lbl90
                throw null;
            }
lbl99:
            // 3 sources

            case 8: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjj", hlbr(int ), (int)1534);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl104:
            // 2 sources

            case 9: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjk", hlbr(int ), (int)1535);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 10: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjl", hlbr(int ), (int)1536);
                if (!var5_3) ** GOTO lbl71
                throw null;
            }
lbl113:
            // 2 sources

            case 11: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjm", hlbr(int ), (int)1537);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl118:
            // 2 sources

            case 12: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjn", hlbr(int ), (int)1538);
                if (!var5_3) ** GOTO lbl90
                throw null;
            }
            case 13: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjo", hlbr(int ), (int)1539);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl127:
            // 2 sources

            case 14: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjp", hlbr(int ), (int)1540);
                if (!var5_3) ** GOTO lbl86
                throw null;
            }
lbl131:
            // 2 sources

            case 15: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjq", hlbr(int ), (int)1541);
                if (!var5_3) ** GOTO lbl99
                throw null;
            }
lbl135:
            // 2 sources

            case 16: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjr", hlbr(int ), (int)1542);
                if (!var5_3) ** GOTO lbl86
                throw null;
            }
lbl139:
            // 3 sources

            case 17: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjs", hlbr(int ), (int)1543);
                if (!var5_3) ** GOTO lbl135
                throw null;
            }
            case 18: {
                do {
                    var4_4 /* !! */  = (int)nd.hlbm("hpjt", hlbr(int ), (int)1544);
                } while (!var5_3);
                throw null;
            }
            case 19: {
                var4_4 /* !! */  = (int)nd.hlbm("hpju", hlbr(int ), (int)1545);
                if (!var5_3) ** GOTO lbl90
                throw null;
            }
lbl152:
            // 3 sources

            case 20: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjv", hlbr(int ), (int)1546);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 21: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjw", hlbr(int ), (int)1547);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)nd.hlbm("hpjx", hlbr(int ), (int)1548);
                    if (!var5_3) ** GOTO lbl104
                    throw null;
                }
            }
            case 23: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjy", hlbr(int ), (int)1549);
                if (!var5_3) ** GOTO lbl95
                throw null;
            }
            case 24: {
                var4_4 /* !! */  = (int)nd.hlbm("hpjz", hlbr(int ), (int)1550);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl176:
            // 2 sources

            case 25: {
                var4_4 /* !! */  = (int)nd.hlbm("hpka", hlbr(int ), (int)1551);
                if (!var5_3) ** GOTO lbl61
                throw null;
            }
lbl180:
            // 2 sources

            case 26: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkb", hlbr(int ), (int)1552);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 27: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkc", hlbr(int ), (int)1553);
                if (!var5_3) ** GOTO lbl127
                throw null;
            }
lbl189:
            // 3 sources

            case 28: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkd", hlbr(int ), (int)1554);
                if (!var5_3) ** GOTO lbl131
                throw null;
            }
lbl193:
            // 3 sources

            case 29: {
                var4_4 /* !! */  = (int)nd.hlbm("hpke", hlbr(int ), (int)1555);
                if (!var5_3) ** GOTO lbl113
                throw null;
            }
            case 30: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkf", hlbr(int ), (int)1556);
                if (!var5_3) ** GOTO lbl66
                throw null;
            }
lbl201:
            // 3 sources

            case 31: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkg", hlbr(int ), (int)1557);
                if (!var5_3) ** GOTO lbl152
                throw null;
            }
lbl205:
            // 2 sources

            case 32: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkh", hlbr(int ), (int)1558);
                if (!var5_3) ** GOTO lbl86
                throw null;
            }
            case 33: {
                var4_4 /* !! */  = (int)nd.hlbm("hpki", hlbr(int ), (int)1559);
                if (!var5_3) ** GOTO lbl90
                throw null;
            }
lbl213:
            // 2 sources

            case 34: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkj", hlbr(int ), (int)1560);
                if (!var5_3) ** GOTO lbl81
                throw null;
            }
            case 35: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkk", hlbr(int ), (int)1561);
                if (!var5_3) ** GOTO lbl66
                throw null;
            }
            case 36: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkl", hlbr(int ), (int)1562);
                if (!var5_3) ** GOTO lbl201
                throw null;
            }
            case 37: {
                var4_4 /* !! */  = (int)nd.hlbm("hpkm", hlbr(int ), (int)1563);
                if (!var5_3) ** GOTO lbl90
                throw null;
            }
            case 38: 
        }
        var4_4 /* !! */  = (int)nd.hlbm("hpkn", hlbr(int ), (int)1564);
        ** while (!var5_3)
lbl232:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int multDark(int var0, float var1_1) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hosa", hlbj(int ), (int)632) - nd.hlbm("hory", hlbj(int ), (int)631));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1076290759: {
                    break block21;
                }
                case 1467741145: {
                    continue block21;
                }
            }
            break;
        }
        var4_2 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hosc", hlbj(int ), (int)633)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nd.hlbm("hose", hlbr(int ), (int)1289)) break;
            v1 /* !! */  = (long)nd.hlbm("hosg", hlbr(int ), (int)1290);
        }
        var3_3 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hosi", hlbj(int ), (int)634)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nd.hlbm("hosj", hlbr(int ), (int)1291)) break;
            v2 /* !! */  = (long)nd.hlbm("hosk", hlbr(int ), (int)1292);
        }
        var2_4 = nd.a;
        if (var4_2) {
            throw null;
lbl25:
            // 1 sources

            return (int)nd.hlbm("hosm", hlbr(int ), (int)1293);
        }
        ** while (var2_4 || var2_4)
lbl28:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hosq", hlbj(int ), (int)635)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == nd.hlbm("hoss", hlbr(int ), (int)1294)) break;
                    v3 /* !! */  = (long)nd.hlbm("hosu", hlbr(int ), (int)1295);
                }
                v4 = (float)nd.red(var0) * var1_1;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hosw", hlbj(int ), (int)636)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nd.hlbm("hosx", hlbr(int ), (int)1296)) break;
                    v5 /* !! */  = (long)nd.hlbm("hosz", hlbr(int ), (int)1297);
                }
                v6 = Math.round(v4);
                v7 /* !! */  = nd.oo;
                if (true) ** GOTO lbl47
                block27: while (true) {
                    v7 /* !! */  = (long)(v8 - nd.hlbm("hotb", hlbj(int ), (int)637));
lbl47:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 204094211: {
                            v8 = nd.hlbm("hotd", hlbj(int ), (int)638);
                            continue block27;
                        }
                        case 1076290759: {
                            break block27;
                        }
                        case 2118108791: {
                            v8 = nd.hlbm("hotf", hlbj(int ), (int)639);
                            continue block27;
                        }
                    }
                    break;
                }
                v9 = (float)nd.green(var0) * var1_1;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hoth", hlbj(int ), (int)640)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nd.hlbm("hotj", hlbr(int ), (int)1298)) break;
                    v10 /* !! */  = (long)nd.hlbm("hotl", hlbr(int ), (int)1299);
                }
                v11 = Math.round(v9);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = nd.oo - nd.hlbm("hotn", hlbj(int ), (int)641)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nd.hlbm("hoto", hlbr(int ), (int)1300)) break;
                    v12 /* !! */  = (long)nd.hlbm("hotq", hlbr(int ), (int)1301);
                }
                v13 = (float)nd.blue(var0) * var1_1;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_6 = nd.oo - nd.hlbm("hott", hlbj(int ), (int)642)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nd.hlbm("hotv", hlbr(int ), (int)1302)) break;
                    v14 /* !! */  = (long)nd.hlbm("hotw", hlbr(int ), (int)1303);
                }
                v15 = Math.round(v13);
                v16 /* !! */  = nd.oo;
                if (true) ** GOTO lbl79
                block31: while (true) {
                    v16 /* !! */  = (long)(v17 - nd.hlbm("hoty", hlbj(int ), (int)643));
lbl79:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -67052165: {
                            v17 = nd.hlbm("houa", hlbj(int ), (int)644);
                            continue block31;
                        }
                        case 305407752: {
                            v17 = nd.hlbm("houc", hlbj(int ), (int)645);
                            continue block31;
                        }
                        case 978336696: {
                            v17 = nd.hlbm("houd", hlbj(int ), (int)646);
                            continue block31;
                        }
                        case 1076290759: {
                            break block31;
                        }
                    }
                    break;
                }
                v18 = nd.alpha(var0);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = nd.oo - nd.hlbm("houf", hlbj(int ), (int)647)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == nd.hlbm("houh", hlbr(int ), (int)1304)) break;
                    v19 /* !! */  = (long)nd.hlbm("houj", hlbr(int ), (int)1305);
                }
                return nd.getColor(v6, v11, v15, v18);
            }
            case 0: {
                var3_3 /* !! */  = (int)nd.hlbm("houl", hlbr(int ), (int)1306);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 1: {
                var3_3 /* !! */  = (int)nd.hlbm("houo", hlbr(int ), (int)1307);
                if (var4_2) {
                    throw null;
                }
            }
lbl107:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nd.hlbm("houq", hlbr(int ), (int)1308);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nd.hlbm("hous", hlbr(int ), (int)1309);
        ** while (!var4_2)
lbl115:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hpli() {
        nd.hlbs[500] = 1007350699;
        nd.hlbs[501] = 1277720882;
        nd.hlbs[502] = -397002895;
        nd.hlbs[503] = -40770325;
        nd.hlbs[504] = 2050525496;
        nd.hlbs[505] = 773513587;
        nd.hlbs[506] = 597230987;
        nd.hlbs[507] = 1552120867;
        nd.hlbs[508] = 81162249;
        nd.hlbs[509] = 588829202;
        nd.hlbs[510] = 307978922;
        nd.hlbs[511] = 1381399577;
        nd.hlbs[512] = 756236951;
        nd.hlbs[513] = -1172712657;
        nd.hlbs[514] = 1445149027;
        nd.hlbs[515] = 1225399576;
        nd.hlbs[516] = 820193922;
        nd.hlbs[517] = 1738652688;
        nd.hlbs[518] = 901306553;
        nd.hlbs[519] = -80608838;
        nd.hlbs[520] = 1001458126;
        nd.hlbs[521] = -970463393;
        nd.hlbs[522] = -1263532126;
        nd.hlbs[523] = -1394664628;
        nd.hlbs[524] = 1161822835;
        nd.hlbs[525] = -551840272;
        nd.hlbs[526] = 1615931702;
        nd.hlbs[527] = 30320063;
        nd.hlbs[528] = 1572145918;
        nd.hlbs[529] = -1806896675;
        nd.hlbs[530] = 296443144;
        nd.hlbs[531] = 2030435547;
        nd.hlbs[532] = -1307549843;
        nd.hlbs[533] = -337383760;
        nd.hlbs[534] = -171839271;
        nd.hlbs[535] = -1988103633;
        nd.hlbs[536] = -1045147210;
        nd.hlbs[537] = -2128013630;
        nd.hlbs[538] = 1277718056;
        nd.hlbs[539] = -164283042;
        nd.hlbs[540] = 141388823;
        nd.hlbs[541] = -1983397721;
        nd.hlbs[542] = -272768594;
        nd.hlbs[543] = 1824458196;
        nd.hlbs[544] = -1447001119;
        nd.hlbs[545] = -973895544;
        nd.hlbs[546] = -104639069;
        nd.hlbs[547] = -26252406;
        nd.hlbs[548] = -1933044440;
        nd.hlbs[549] = 1840915822;
        nd.hlbs[550] = 829104789;
        nd.hlbs[551] = -1970679669;
        nd.hlbs[552] = -1994597483;
        nd.hlbs[553] = 1198106720;
        nd.hlbs[554] = -890906718;
        nd.hlbs[555] = 1880808617;
        nd.hlbs[556] = 1719968348;
        nd.hlbs[557] = 613260294;
        nd.hlbs[558] = 972078931;
        nd.hlbs[559] = 198579327;
        nd.hlbs[560] = 1428958670;
        nd.hlbs[561] = 993350378;
        nd.hlbs[562] = -1409697847;
        nd.hlbs[563] = -507725980;
        nd.hlbs[564] = 152347828;
        nd.hlbs[565] = -1970528454;
        nd.hlbs[566] = 956411797;
        nd.hlbs[567] = -500605956;
        nd.hlbs[568] = 1395467671;
        nd.hlbs[569] = 653604210;
        nd.hlbs[570] = 707624061;
        nd.hlbs[571] = -1227575578;
        nd.hlbs[572] = -612330185;
        nd.hlbs[573] = 1793992447;
        nd.hlbs[574] = -944243370;
        nd.hlbs[575] = -723861589;
        nd.hlbs[576] = 528165050;
        nd.hlbs[577] = -907207713;
        nd.hlbs[578] = -1254225706;
        nd.hlbs[579] = -307901649;
        nd.hlbs[580] = 66904724;
        nd.hlbs[581] = -735916062;
        nd.hlbs[582] = -1049839063;
        nd.hlbs[583] = 871806100;
        nd.hlbs[584] = 1001818755;
        nd.hlbs[585] = 1756952784;
        nd.hlbs[586] = -721579452;
        nd.hlbs[587] = -471576436;
        nd.hlbs[588] = 1074945154;
        nd.hlbs[589] = 579855114;
        nd.hlbs[590] = -1635025700;
        nd.hlbs[591] = 1740364216;
        nd.hlbs[592] = -756535588;
        nd.hlbs[593] = 755189900;
        nd.hlbs[594] = -1069827642;
        nd.hlbs[595] = 1452169942;
        nd.hlbs[596] = 187908461;
        nd.hlbs[597] = -889975190;
        nd.hlbs[598] = -1606660914;
        nd.hlbs[599] = -430286144;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int getActiveColorCount() {
        block20: {
            v0 /* !! */  = nd.oo;
            if (true) ** GOTO lbl5
            block9: while (true) {
                v0 /* !! */  = (long)(nd.hlbm("hlxe", hlbj(int ), (int)150) - nd.hlbm("hlxd", hlbj(int ), (int)149));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -135451751: {
                        continue block9;
                    }
                    case 1076290759: {
                        break block9;
                    }
                }
                break;
            }
            var4 = nd.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlxf", hlbj(int ), (int)151)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == nd.hlbm("hlxg", hlbr(int ), (int)211)) break;
                v1 /* !! */  = (long)nd.hlbm("hlxh", hlbr(int ), (int)212);
            }
            var3_1 = nd.b;
            v2 /* !! */  = nd.oo;
            if (true) ** GOTO lbl22
            block11: while (true) {
                v2 /* !! */  = (long)(v3 - nd.hlbm("hlxi", hlbj(int ), (int)152));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 405575546: {
                        v3 = nd.hlbm("hlxj", hlbj(int ), (int)153);
                        continue block11;
                    }
                    case 1076290759: {
                        break block11;
                    }
                    case 1660253401: {
                        v3 = nd.hlbm("hlxk", hlbj(int ), (int)154);
                        continue block11;
                    }
                }
                break;
            }
            var2_2 = nd.a;
            if (var4) {
                throw null;
lbl34:
                // 10 sources

                return (int)nd.hlbm("hlxl", hlbr(int ), (int)213);
            }
            if (var2_2 || var2_2) ** GOTO lbl34
            var0_3 = nd.hlbm("hlxm", hlbr(int ), (int)214);
            if (var2_2 || var2_2) ** GOTO lbl34
            var1_4 = nd.hlbm("hlxn", hlbr(int ), (int)215);
            if (var2_2) ** GOTO lbl34
            do {
                block21: {
                    if (var2_2 || var2_2) ** GOTO lbl34
                    while (true) {
                        if ((v4 = (cfr_temp_1 = nd.oo - nd.hlbm("hlxo", hlbj(int ), (int)155)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v4 == nd.hlbm("hlxp", hlbr(int ), (int)216)) break;
                        v4 = -1508435955;
                    }
                    if (var1_4 >= nd.clientColors.length) break block20;
                    if (var2_2 || var2_2) ** GOTO lbl34
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hlxq", hlbj(int ), (int)156)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v5 /* !! */  == nd.hlbm("hlxr", hlbr(int ), (int)217)) break;
                        v5 /* !! */  = (long)nd.hlbm("hlxs", hlbr(int ), (int)218);
                    }
                    if (nd.clientColors[var1_4] == 0) break block21;
                    if (var2_2 || var2_2) ** GOTO lbl34
                    var0_3 = var1_4 + nd.hlbm("hlxt", hlbr(int ), (int)219);
                    if (var2_2) ** GOTO lbl34
                }
                if (var2_2 || var2_2) ** GOTO lbl34
                ++var1_4;
                if (var2_2) ** GOTO lbl34
            } while (!var4);
            throw null;
        }
        if (!var2_2 && !var2_2) ** break;
        ** while (true)
        return (int)var0_3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static String toLegacyText(class_2561 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hpfp", hlbj(int ), (int)662)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hpfq", hlbr(int ), (int)1468)) break;
            v0 /* !! */  = (long)nd.hlbm("hpfr", hlbr(int ), (int)1469);
        }
        var4_1 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hpfs", hlbj(int ), (int)663)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nd.hlbm("hpft", hlbr(int ), (int)1470)) break;
            v1 /* !! */  = (long)nd.hlbm("hpfu", hlbr(int ), (int)1471);
        }
        var3_2 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hpfv", hlbj(int ), (int)664)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nd.hlbm("hpfw", hlbr(int ), (int)1472)) break;
            v2 /* !! */  = (long)nd.hlbm("hpfx", hlbr(int ), (int)1473);
        }
        var2_3 = nd.a;
        if (var4_1) {
            throw null;
lbl21:
            // 5 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl21
        if (var0 != null) ** GOTO lbl30
        if (var2_3 || var2_3) ** GOTO lbl21
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return null;
            }
lbl30:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl21
            v3 /* !! */  = nd.oo;
            if (true) ** GOTO lbl35
            block35: while (true) {
                v3 /* !! */  = (long)(v4 - nd.hlbm("hpfy", hlbj(int ), (int)665));
lbl35:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1491567030: {
                        v4 = nd.hlbm("hpfz", hlbj(int ), (int)666);
                        continue block35;
                    }
                    case -1053382706: {
                        v4 = nd.hlbm("hpga", hlbj(int ), (int)667);
                        continue block35;
                    }
                    case -205342693: {
                        v4 = nd.hlbm("hpgb", hlbj(int ), (int)668);
                        continue block35;
                    }
                    case 1076290759: {
                        break block35;
                    }
                }
                break;
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hpgc", hlbj(int ), (int)669)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == nd.hlbm("hpgd", hlbr(int ), (int)1474)) break;
                v5 /* !! */  = (long)nd.hlbm("hpge", hlbr(int ), (int)1475);
            }
            var1_4 = new StringBuilder();
            if (var2_3 || var2_3) ** GOTO lbl21
            v6 /* !! */  = nd.oo;
            if (true) ** GOTO lbl58
            block37: while (true) {
                v6 /* !! */  = (long)(v7 - nd.hlbm("hpgf", hlbj(int ), (int)670));
lbl58:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1467871410: {
                        v7 = nd.hlbm("hpgg", hlbj(int ), (int)671);
                        continue block37;
                    }
                    case 599595825: {
                        v7 = nd.hlbm("hpgh", hlbj(int ), (int)672);
                        continue block37;
                    }
                    case 1076290759: {
                        break block37;
                    }
                }
                break;
            }
            v8 = (class_5348.class_5246)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_2583;Ljava/lang/String;)Ljava/util/Optional;, lambda$toLegacyText$0(java.lang.StringBuilder net.minecraft.class_2583 java.lang.String ), (Lnet/minecraft/class_2583;Ljava/lang/String;)Ljava/util/Optional;)((StringBuilder)var1_4);
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hpgi", hlbj(int ), (int)673)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == nd.hlbm("hpgj", hlbr(int ), (int)1476)) break;
                v9 /* !! */  = (long)nd.hlbm("hpgk", hlbr(int ), (int)1477);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_5 = nd.oo - nd.hlbm("hpgl", hlbj(int ), (int)674)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == nd.hlbm("hpgm", hlbr(int ), (int)1478)) break;
                v10 /* !! */  = (long)nd.hlbm("hpgn", hlbr(int ), (int)1479);
            }
            var0.method_27658(v8, class_2583.field_24360);
            if (var2_3 || var2_3) ** continue;
            v11 /* !! */  = nd.oo;
            if (true) ** GOTO lbl84
            block40: while (true) {
                v11 /* !! */  = (long)(v12 - nd.hlbm("hpgo", hlbj(int ), (int)675));
lbl84:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case 977427518: {
                        v12 = nd.hlbm("hpgp", hlbj(int ), (int)676);
                        continue block40;
                    }
                    case 1076290759: {
                        break block40;
                    }
                    case 2039962455: {
                        v12 = nd.hlbm("hpgq", hlbj(int ), (int)677);
                        continue block40;
                    }
                }
                break;
            }
            return var1_4.toString();
            case 0: {
                var3_2 /* !! */  = (int)nd.hlbm("hpgr", hlbr(int ), (int)1480);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 1: {
                var3_2 /* !! */  = (int)nd.hlbm("hpgs", hlbr(int ), (int)1481);
                if (!var4_1) break;
                throw null;
            }
lbl103:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)nd.hlbm("hpgt", hlbr(int ), (int)1482);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl108:
            // 3 sources

            case 3: {
                var3_2 /* !! */  = (int)nd.hlbm("hpgu", hlbr(int ), (int)1483);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl113:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)nd.hlbm("hpgv", hlbr(int ), (int)1484);
                    if (!var4_1) break block0;
                    throw null;
                }
            }
lbl118:
            // 3 sources

            case 5: {
                do {
                    var3_2 /* !! */  = (int)nd.hlbm("hpgw", hlbr(int ), (int)1485);
                } while (!var4_1);
                throw null;
            }
lbl123:
            // 3 sources

            case 6: {
                var3_2 /* !! */  = (int)nd.hlbm("hpgx", hlbr(int ), (int)1486);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)nd.hlbm("hpgy", hlbr(int ), (int)1487);
                if (!var4_1) ** GOTO lbl123
                throw null;
            }
lbl131:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)nd.hlbm("hpgz", hlbr(int ), (int)1488);
                if (!var4_1) ** GOTO lbl113
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)nd.hlbm("hpha", hlbr(int ), (int)1489);
                if (!var4_1) ** GOTO lbl103
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)nd.hlbm("hphb", hlbr(int ), (int)1490);
                if (!var4_1) ** GOTO lbl131
                throw null;
            }
            case 11: {
                var3_2 /* !! */  = (int)nd.hlbm("hphc", hlbr(int ), (int)1491);
                if (!var4_1) ** GOTO lbl108
                throw null;
            }
            case 12: 
        }
        var3_2 /* !! */  = (int)nd.hlbm("hphd", hlbr(int ), (int)1492);
        ** while (!var4_1)
lbl150:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hpnj() {
        nd.hlbt[600] = -785678134;
        nd.hlbt[601] = -1001860773;
        nd.hlbt[602] = 1661862477;
        nd.hlbt[603] = -1057931017;
        nd.hlbt[604] = 1409751898;
        nd.hlbt[605] = 844505751;
        nd.hlbt[606] = 490171124;
        nd.hlbt[607] = 581715072;
        nd.hlbt[608] = 846879916;
        nd.hlbt[609] = -2066526941;
        nd.hlbt[610] = -2015723702;
        nd.hlbt[611] = -1023614854;
        nd.hlbt[612] = -1600694241;
        nd.hlbt[613] = -2094236554;
        nd.hlbt[614] = -1047105896;
        nd.hlbt[615] = -1826548385;
        nd.hlbt[616] = -706688295;
        nd.hlbt[617] = 830351710;
        nd.hlbt[618] = 2090455904;
        nd.hlbt[619] = -251397495;
        nd.hlbt[620] = -1605064450;
        nd.hlbt[621] = 719319332;
        nd.hlbt[622] = 989504945;
        nd.hlbt[623] = -1713937416;
        nd.hlbt[624] = -2089432545;
        nd.hlbt[625] = 476265198;
        nd.hlbt[626] = -1511358787;
        nd.hlbt[627] = 1685823570;
        nd.hlbt[628] = -287348496;
        nd.hlbt[629] = 1485590372;
        nd.hlbt[630] = 649265576;
        nd.hlbt[631] = -1500081366;
        nd.hlbt[632] = 962882110;
        nd.hlbt[633] = -565000554;
        nd.hlbt[634] = 1255112098;
        nd.hlbt[635] = -1651789948;
        nd.hlbt[636] = -2023252193;
        nd.hlbt[637] = -668962787;
        nd.hlbt[638] = 339090743;
        nd.hlbt[639] = -677734760;
        nd.hlbt[640] = 1681487466;
        nd.hlbt[641] = 1158945151;
        nd.hlbt[642] = -1523304731;
        nd.hlbt[643] = -243114282;
        nd.hlbt[644] = 572182889;
        nd.hlbt[645] = -1824532776;
        nd.hlbt[646] = 291934958;
        nd.hlbt[647] = -698104022;
        nd.hlbt[648] = -2108952627;
        nd.hlbt[649] = -1292848715;
        nd.hlbt[650] = -326124944;
        nd.hlbt[651] = 1518131841;
        nd.hlbt[652] = 1636411105;
        nd.hlbt[653] = 59236931;
        nd.hlbt[654] = 832283570;
        nd.hlbt[655] = -1711487094;
        nd.hlbt[656] = 1288329218;
        nd.hlbt[657] = 944502440;
        nd.hlbt[658] = -1589555265;
        nd.hlbt[659] = 332853440;
        nd.hlbt[660] = -919643570;
        nd.hlbt[661] = 1763347632;
        nd.hlbt[662] = -441963207;
        nd.hlbt[663] = 1634236584;
        nd.hlbt[664] = -2009674852;
        nd.hlbt[665] = 1179222444;
        nd.hlbt[666] = -662678426;
        nd.hlbt[667] = -1892430249;
        nd.hlbt[668] = -1316684629;
        nd.hlbt[669] = 1385217174;
        nd.hlbt[670] = -933629809;
        nd.hlbt[671] = 489291319;
        nd.hlbt[672] = 1297869981;
        nd.hlbt[673] = -138152327;
        nd.hlbt[674] = -1443272055;
        nd.hlbt[675] = 909232906;
        nd.hlbt[676] = -783644763;
        nd.hlbt[677] = -977918705;
        nd.hlbt[678] = -1205131117;
        nd.hlbt[679] = -1424436435;
        nd.hlbt[680] = -217801473;
        nd.hlbt[681] = -1810469973;
        nd.hlbt[682] = 695400291;
        nd.hlbt[683] = 488326689;
        nd.hlbt[684] = 2129641504;
        nd.hlbt[685] = 582006361;
        nd.hlbt[686] = -1272942470;
        nd.hlbt[687] = -1141707193;
        nd.hlbt[688] = -1073706705;
        nd.hlbt[689] = 494560067;
        nd.hlbt[690] = -2012024385;
        nd.hlbt[691] = 1126601450;
        nd.hlbt[692] = -2142836557;
        nd.hlbt[693] = -1384800683;
        nd.hlbt[694] = -150144436;
        nd.hlbt[695] = -161548669;
        nd.hlbt[696] = 876577420;
        nd.hlbt[697] = 1929138980;
        nd.hlbt[698] = 304087170;
        nd.hlbt[699] = 1024914743;
    }

    private static /* synthetic */ long hlbj(int n2) {
        return hlbk[n2] ^ hlbl[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setClientColorMode(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hltz", hlbj(int ), (int)131)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hlua", hlbr(int ), (int)147)) break;
            v0 /* !! */  = (long)nd.hlbm("hlub", hlbr(int ), (int)148);
        }
        var3_1 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl11
        block26: while (true) {
            v1 /* !! */  = (long)(nd.hlbm("hlud", hlbj(int ), (int)133) - nd.hlbm("hluc", hlbj(int ), (int)132));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1076290759: {
                    break block26;
                }
                case 1424126785: {
                    continue block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl21
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - nd.hlbm("hlue", hlbj(int ), (int)134));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1263075214: {
                    v3 = nd.hlbm("hluf", hlbj(int ), (int)135);
                    continue block27;
                }
                case -647197741: {
                    v3 = nd.hlbm("hlug", hlbj(int ), (int)136);
                    continue block27;
                }
                case -292839182: {
                    v3 = nd.hlbm("hluh", hlbj(int ), (int)137);
                    continue block27;
                }
                case 1076290759: {
                    break block27;
                }
            }
            break;
        }
        var1_3 = nd.a;
        if (var3_1) {
            throw null;
lbl36:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        v4 /* !! */  = nd.oo;
        if (true) ** GOTO lbl43
        block29: while (true) {
            v4 /* !! */  = (long)(v5 - nd.hlbm("hlui", hlbj(int ), (int)138));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 34126957: {
                    v5 = nd.hlbm("hluj", hlbj(int ), (int)139);
                    continue block29;
                }
                case 1076290759: {
                    break block29;
                }
                case 2029568947: {
                    v5 = nd.hlbm("hluk", hlbj(int ), (int)140);
                    continue block29;
                }
            }
            break;
        }
        nd.clientColorMode = var0;
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl36
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlul", hlbj(int ), (int)141)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == nd.hlbm("hlum", hlbr(int ), (int)149)) break;
                    v6 /* !! */  = (long)nd.hlbm("hlun", hlbr(int ), (int)150);
                }
                v7 = System.currentTimeMillis();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hluo", hlbj(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nd.hlbm("hlup", hlbr(int ), (int)151)) break;
                    v8 /* !! */  = (long)nd.hlbm("hluq", hlbr(int ), (int)152);
                }
                nd.colorTransitionStart = v7;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl73:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nd.hlbm("hlur", hlbr(int ), (int)153);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl93
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)nd.hlbm("hlus", hlbr(int ), (int)154);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 2: {
                var2_2 /* !! */  = (int)nd.hlbm("hlut", hlbr(int ), (int)155);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl89:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)nd.hlbm("hluu", hlbr(int ), (int)156);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
lbl93:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nd.hlbm("hluv", hlbr(int ), (int)157);
                if (!var3_1) ** GOTO lbl73
                throw null;
            }
lbl97:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nd.hlbm("hluw", hlbr(int ), (int)158);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)nd.hlbm("hlux", hlbr(int ), (int)159);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)nd.hlbm("hluy", hlbr(int ), (int)160);
        ** while (!var3_1)
lbl108:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int getBlue(int var0) {
        block21: {
            v0 /* !! */  = nd.oo;
            if (true) ** GOTO lbl5
            block11: while (true) {
                v0 /* !! */  = (long)(v1 - nd.hlbm("hnoo", hlbj(int ), (int)375));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 653733011: {
                        v1 = nd.hlbm("hnop", hlbj(int ), (int)376);
                        continue block11;
                    }
                    case 1076290759: {
                        break block11;
                    }
                    case 1180551748: {
                        v1 = nd.hlbm("hnoq", hlbj(int ), (int)377);
                        continue block11;
                    }
                }
                break;
            }
            var3_1 = nd.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnor", hlbj(int ), (int)378)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == nd.hlbm("hnos", hlbr(int ), (int)857)) break;
                v2 /* !! */  = (long)nd.hlbm("hnot", hlbr(int ), (int)858);
            }
            var2_2 /* !! */  = nd.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnou", hlbj(int ), (int)379)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == nd.hlbm("hnov", hlbr(int ), (int)859)) {
                    var1_3 = nd.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)nd.hlbm("hnow", hlbr(int ), (int)860);
            }
            if (!var1_3 && !var1_3) {
                return var0 & nd.hlbm("hnoy", hlbr(int ), (int)862);
            }
            if (var2_2 /* !! */  == 0) return (int)nd.hlbm("hnox", hlbr(int ), (int)861);
            cfr_temp_0 = -2147483648;
            block14: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: {
                        return (int)nd.hlbm("hnox", hlbr(int ), (int)861);
                    }
                    case 0: {
                        do {
                            var2_2 /* !! */  = (int)nd.hlbm("hnoz", hlbr(int ), (int)863);
                        } while (!var3_1);
                        throw null;
                    }
                    case 1: {
                        ** break;
                    }
                    case 3: {
                        break block21;
                    }
lbl47:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)nd.hlbm("hnpa", hlbr(int ), (int)864);
                        cfr_temp_0 = 2;
                        if (!var3_1) continue block14;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)nd.hlbm("hnpb", hlbr(int ), (int)865);
            if (var3_1) {
                throw null;
            }
        }
        var2_2 /* !! */  = (int)nd.hlbm("hnpc", hlbr(int ), (int)866);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] solid8(int var0) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hntk", hlbj(int ), (int)412));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 134567904: {
                    v1 = nd.hlbm("hntl", hlbj(int ), (int)413);
                    continue block11;
                }
                case 234931549: {
                    v1 = nd.hlbm("hntm", hlbj(int ), (int)414);
                    continue block11;
                }
                case 1076290759: {
                    break block11;
                }
            }
            break;
        }
        var3_1 = nd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hntn", hlbj(int ), (int)415)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hnto", hlbr(int ), (int)946)) break;
            v2 /* !! */  = (long)nd.hlbm("hntp", hlbr(int ), (int)947);
        }
        var2_2 /* !! */  = nd.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hntq", hlbj(int ), (int)416)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nd.hlbm("hntr", hlbr(int ), (int)948)) break;
                    v3 /* !! */  = (long)nd.hlbm("hnts", hlbr(int ), (int)949);
                }
                var1_3 = nd.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                return new int[]{var0, var0, var0, var0, var0, var0, var0, var0};
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)nd.hlbm("hntt", hlbr(int ), (int)950);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)nd.hlbm("hntu", hlbr(int ), (int)951);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nd.hlbm("hntv", hlbr(int ), (int)952);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)nd.hlbm("hntw", hlbr(int ), (int)953);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int multRedAndAlpha(int var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlpr", hlbj(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hlps", hlbr(int ), (int)80)) break;
            v0 /* !! */  = (long)nd.hlbm("hlpt", hlbr(int ), (int)81);
        }
        var5_3 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl11
        block36: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hlpu", hlbj(int ), (int)87));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1995973033: {
                    v2 = nd.hlbm("hlpv", hlbj(int ), (int)88);
                    continue block36;
                }
                case -1842599518: {
                    v2 = nd.hlbm("hlpw", hlbj(int ), (int)89);
                    continue block36;
                }
                case -1173722495: {
                    v2 = nd.hlbm("hlpx", hlbj(int ), (int)90);
                    continue block36;
                }
                case 1076290759: {
                    break block36;
                }
            }
            break;
        }
        var4_4 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlpy", hlbj(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nd.hlbm("hlpz", hlbr(int ), (int)82)) break;
            v3 /* !! */  = (long)nd.hlbm("hlqa", hlbr(int ), (int)83);
        }
        var3_5 = nd.a;
        if (!var5_3) ** GOTO lbl36
        throw null;
        {
            if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)nd.hlbm("hlqb", hlbr(int ), (int)84);
                }
lbl36:
                // 1 sources

                if (var3_5 || var3_5) continue block38;
                v4 /* !! */  = nd.oo;
                if (true) ** GOTO lbl41
                block39: while (true) {
                    v4 /* !! */  = (long)(v5 - nd.hlbm("hlqc", hlbj(int ), (int)92));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -638248510: {
                            v5 = nd.hlbm("hlqd", hlbj(int ), (int)93);
                            continue block39;
                        }
                        case 635365674: {
                            v5 = nd.hlbm("hlqe", hlbj(int ), (int)94);
                            continue block39;
                        }
                        case 1076290759: {
                            break block39;
                        }
                        case 1307707825: {
                            v5 = nd.hlbm("hlqf", hlbj(int ), (int)95);
                            continue block39;
                        }
                    }
                    break;
                }
                v6 = nd.red(var0);
                v7 = nd.hlbm("hlqg", hlbr(int ), (int)85);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hlqh", hlbj(int ), (int)96)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nd.hlbm("hlqi", hlbr(int ), (int)86)) break;
                    v8 /* !! */  = (long)nd.hlbm("hlqj", hlbr(int ), (int)87);
                }
                v9 = (float)nd.green(var0) / var1_1;
                v10 /* !! */  = nd.oo;
                if (true) ** GOTO lbl65
                block41: while (true) {
                    v10 /* !! */  = (long)(v11 - nd.hlbm("hlqk", hlbj(int ), (int)97));
lbl65:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1479829397: {
                            v11 = nd.hlbm("hlql", hlbj(int ), (int)98);
                            continue block41;
                        }
                        case -504868720: {
                            v11 = nd.hlbm("hlqm", hlbj(int ), (int)99);
                            continue block41;
                        }
                        case 844227344: {
                            v11 = nd.hlbm("hlqn", hlbj(int ), (int)100);
                            continue block41;
                        }
                        case 1076290759: {
                            break block41;
                        }
                    }
                    break;
                }
                v12 = Math.round(v9);
                v13 /* !! */  = nd.oo;
                if (true) ** GOTO lbl82
                block42: while (true) {
                    v13 /* !! */  = (long)(v14 - nd.hlbm("hlqo", hlbj(int ), (int)101));
lbl82:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 284309984: {
                            v14 = nd.hlbm("hlqp", hlbj(int ), (int)102);
                            continue block42;
                        }
                        case 1076290759: {
                            break block42;
                        }
                        case 1561656521: {
                            v14 = nd.hlbm("hlqq", hlbj(int ), (int)103);
                            continue block42;
                        }
                    }
                    break;
                }
                v15 = Math.min((int)v7, v12);
                v16 = nd.hlbm("hlqr", hlbr(int ), (int)88);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hlqs", hlbj(int ), (int)104)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == nd.hlbm("hlqt", hlbr(int ), (int)89)) break;
                    v17 /* !! */  = (long)nd.hlbm("hlqu", hlbr(int ), (int)90);
                }
                v18 = (float)nd.blue(var0) / var1_1;
                v19 /* !! */  = nd.oo;
                if (true) ** GOTO lbl103
                block44: while (true) {
                    v19 /* !! */  = (long)(v20 - nd.hlbm("hlqv", hlbj(int ), (int)105));
lbl103:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1641216725: {
                            v20 = nd.hlbm("hlqw", hlbj(int ), (int)106);
                            continue block44;
                        }
                        case 479901424: {
                            v20 = nd.hlbm("hlqx", hlbj(int ), (int)107);
                            continue block44;
                        }
                        case 1076290759: {
                            break block44;
                        }
                        case 2007761765: {
                            v20 = nd.hlbm("hlqy", hlbj(int ), (int)108);
                            continue block44;
                        }
                    }
                    break;
                }
                v21 = Math.round(v18);
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hlqz", hlbj(int ), (int)109)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == nd.hlbm("hlra", hlbr(int ), (int)91)) break;
                    v22 /* !! */  = (long)nd.hlbm("hlrb", hlbr(int ), (int)92);
                }
                v23 = Math.min((int)v16, v21);
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = nd.oo - nd.hlbm("hlrc", hlbj(int ), (int)110)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == nd.hlbm("hlrd", hlbr(int ), (int)93)) break;
                    v24 /* !! */  = (long)nd.hlbm("hlre", hlbr(int ), (int)94);
                }
                v25 = (float)nd.alpha(var0) * var2_2;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_6 = nd.oo - nd.hlbm("hlrf", hlbj(int ), (int)111)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == nd.hlbm("hlrg", hlbr(int ), (int)95)) break;
                    v26 /* !! */  = (long)nd.hlbm("hlrh", hlbr(int ), (int)96);
                }
                v27 = Math.round(v25);
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_7 = nd.oo - nd.hlbm("hlri", hlbj(int ), (int)112)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == nd.hlbm("hlrj", hlbr(int ), (int)97)) break;
                    v28 /* !! */  = (long)nd.hlbm("hlrk", hlbr(int ), (int)98);
                }
                return nd.getColor(v6, v15, v23, v27);
lbl140:
                // 2 sources

                case 0: {
                    var4_4 /* !! */  = (int)nd.hlbm("hlrl", hlbr(int ), (int)99);
                    if (!var5_3) break block38;
                    throw null;
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_4 /* !! */  = (int)nd.hlbm("hlrm", hlbr(int ), (int)100);
                        if (!var5_3) break block38;
                        throw null;
                    }
                }
                case 2: {
                    var4_4 /* !! */  = (int)nd.hlbm("hlrn", hlbr(int ), (int)101);
                    if (!var5_3) ** GOTO lbl140
                    throw null;
                }
                case 3: 
            }
        }
        var4_4 /* !! */  = (int)nd.hlbm("hlro", hlbr(int ), (int)102);
        ** while (!var5_3)
lbl156:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int withAlpha(int n2, int n3) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = oo - nd.hlbm("honh", hlbj(int ), (int)606)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == nd.hlbm("honj", hlbr(int ), (int)1249)) break;
            object = nd.hlbm("honk", hlbr(int ), (int)1250);
        }
        boolean bl3 = c;
        Object object = oo;
        block5: while (true) {
            switch ((int)object) {
                case -1002262302: {
                    object = nd.hlbm("hono", hlbj(int ), (int)608) - nd.hlbm("honm", hlbj(int ), (int)607);
                    continue block5;
                }
                case 1076290759: {
                    break block5;
                }
            }
            break;
        }
        int n4 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = oo - nd.hlbm("honr", hlbj(int ), (int)609)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == nd.hlbm("hons", hlbr(int ), (int)1251)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = nd.hlbm("honu", hlbr(int ), (int)1252);
        }
        if (!bl2 && !bl2) return n3 << nd.hlbm("honz", hlbr(int ), (int)1254) | n2 & nd.hlbm("hoob", hlbr(int ), (int)1255);
        return (int)nd.hlbm("honx", hlbr(int ), (int)1253);
    }

    private static /* synthetic */ void hple() {
        nd.hlbs[100] = 1111607902;
        nd.hlbs[101] = -639553398;
        nd.hlbs[102] = 1626713493;
        nd.hlbs[103] = -1839093528;
        nd.hlbs[104] = -1943307936;
        nd.hlbs[105] = 248544735;
        nd.hlbs[106] = 2090444018;
        nd.hlbs[107] = 1551509299;
        nd.hlbs[108] = -469682058;
        nd.hlbs[109] = 1189033570;
        nd.hlbs[110] = 602413776;
        nd.hlbs[111] = 1712271184;
        nd.hlbs[112] = -514438940;
        nd.hlbs[113] = -1152160601;
        nd.hlbs[114] = -1342062921;
        nd.hlbs[115] = 1175018706;
        nd.hlbs[116] = -492996262;
        nd.hlbs[117] = -81411728;
        nd.hlbs[118] = -1830027695;
        nd.hlbs[119] = -1751214743;
        nd.hlbs[120] = 811688656;
        nd.hlbs[121] = 1374977523;
        nd.hlbs[122] = -1645449163;
        nd.hlbs[123] = -1655655604;
        nd.hlbs[124] = 1391238741;
        nd.hlbs[125] = 1833556034;
        nd.hlbs[126] = 647626253;
        nd.hlbs[127] = 210172111;
        nd.hlbs[128] = -435940498;
        nd.hlbs[129] = -1918219825;
        nd.hlbs[130] = -207995893;
        nd.hlbs[131] = 831784504;
        nd.hlbs[132] = -2088788733;
        nd.hlbs[133] = 956792621;
        nd.hlbs[134] = -1181118419;
        nd.hlbs[135] = -1591906226;
        nd.hlbs[136] = -789847073;
        nd.hlbs[137] = 120931177;
        nd.hlbs[138] = 536539909;
        nd.hlbs[139] = -1046178321;
        nd.hlbs[140] = -2082474838;
        nd.hlbs[141] = -596987927;
        nd.hlbs[142] = 545640577;
        nd.hlbs[143] = 894377983;
        nd.hlbs[144] = -1768188109;
        nd.hlbs[145] = 1404857052;
        nd.hlbs[146] = -146982582;
        nd.hlbs[147] = 849191351;
        nd.hlbs[148] = -1076886544;
        nd.hlbs[149] = -1665613612;
        nd.hlbs[150] = 1012726836;
        nd.hlbs[151] = 80509643;
        nd.hlbs[152] = 841947686;
        nd.hlbs[153] = -659096562;
        nd.hlbs[154] = 616643520;
        nd.hlbs[155] = 1602066381;
        nd.hlbs[156] = 1516162740;
        nd.hlbs[157] = -117919608;
        nd.hlbs[158] = -1897538559;
        nd.hlbs[159] = -1967289695;
        nd.hlbs[160] = 1926843786;
        nd.hlbs[161] = -979913944;
        nd.hlbs[162] = -1356241022;
        nd.hlbs[163] = -581208083;
        nd.hlbs[164] = -215952301;
        nd.hlbs[165] = 1848380801;
        nd.hlbs[166] = 2122985399;
        nd.hlbs[167] = 1156585620;
        nd.hlbs[168] = 1557846862;
        nd.hlbs[169] = -355454940;
        nd.hlbs[170] = -774743358;
        nd.hlbs[171] = 718521358;
        nd.hlbs[172] = -654045693;
        nd.hlbs[173] = 107988422;
        nd.hlbs[174] = 513422796;
        nd.hlbs[175] = 1250099487;
        nd.hlbs[176] = 729903658;
        nd.hlbs[177] = -1943336444;
        nd.hlbs[178] = -1194103373;
        nd.hlbs[179] = -1309899104;
        nd.hlbs[180] = -348897979;
        nd.hlbs[181] = -294949124;
        nd.hlbs[182] = -566090465;
        nd.hlbs[183] = -1635784599;
        nd.hlbs[184] = 463218540;
        nd.hlbs[185] = -1784259899;
        nd.hlbs[186] = 1866662564;
        nd.hlbs[187] = 935579453;
        nd.hlbs[188] = -657296293;
        nd.hlbs[189] = 915506535;
        nd.hlbs[190] = 976896319;
        nd.hlbs[191] = 1731530278;
        nd.hlbs[192] = -698905989;
        nd.hlbs[193] = 379774646;
        nd.hlbs[194] = -914857751;
        nd.hlbs[195] = 1585524678;
        nd.hlbs[196] = -264073497;
        nd.hlbs[197] = -1660309145;
        nd.hlbs[198] = 1195968782;
        nd.hlbs[199] = 1559722353;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] horizontal8(int var0, int var1_1) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hoeg", hlbj(int ), (int)530));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2080875049: {
                    v1 = nd.hlbm("hoeh", hlbj(int ), (int)531);
                    continue block17;
                }
                case 1076290759: {
                    break block17;
                }
                case 1643317355: {
                    v1 = nd.hlbm("hoei", hlbj(int ), (int)532);
                    continue block17;
                }
            }
            break;
        }
        var5_2 = nd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hoej", hlbj(int ), (int)533)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hoek", hlbr(int ), (int)1110)) break;
            v2 /* !! */  = (long)nd.hlbm("hoel", hlbr(int ), (int)1111);
        }
        var4_3 /* !! */  = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hoem", hlbj(int ), (int)534)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nd.hlbm("hoen", hlbr(int ), (int)1112)) break;
            v3 /* !! */  = (long)nd.hlbm("hoeo", hlbr(int ), (int)1113);
        }
        var3_4 = nd.a;
        if (var5_2) {
            throw null;
lbl31:
            // 3 sources

            return null;
        }
        if (var3_4) ** GOTO lbl31
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl31
                v4 = nd.hlbm("hoep", hlzk(int ), (int)1114);
                v5 /* !! */  = nd.oo;
                if (true) ** GOTO lbl43
                block21: while (true) {
                    v5 /* !! */  = (long)(nd.hlbm("hoer", hlbj(int ), (int)536) - nd.hlbm("hoeq", hlbj(int ), (int)535));
lbl43:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 491129975: {
                            continue block21;
                        }
                        case 1076290759: {
                            break block21;
                        }
                    }
                    break;
                }
                var2_5 = nd.blend(var0, var1_1, (float)v4);
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return new int[]{var0, var2_5, var1_1, var1_1, var1_1, var2_5, var0, var0};
            }
lbl52:
            // 2 sources

            case 0: {
                do {
                    var4_3 /* !! */  = (int)nd.hlbm("hoes", hlbr(int ), (int)1115);
                } while (!var5_2);
                throw null;
            }
            case 1: {
                var4_3 /* !! */  = (int)nd.hlbm("hoet", hlbr(int ), (int)1116);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl67
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)nd.hlbm("hoeu", hlbr(int ), (int)1117);
                    if (!var5_2) break block5;
                    throw null;
                }
            }
lbl67:
            // 2 sources

            case 3: {
                do {
                    var4_3 /* !! */  = (int)nd.hlbm("hoev", hlbr(int ), (int)1118);
                } while (!var5_2);
                throw null;
            }
            case 4: {
                var4_3 /* !! */  = (int)nd.hlbm("hoew", hlbr(int ), (int)1119);
                if (!var5_2) ** GOTO lbl52
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)nd.hlbm("hoex", hlbr(int ), (int)1120);
        ** while (!var5_2)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Double interpolateD(double var0, double var2_1, double var4_2) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hnss", hlbj(int ), (int)400));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 243695893: {
                    v1 = nd.hlbm("hnst", hlbj(int ), (int)401);
                    continue block23;
                }
                case 399290537: {
                    v1 = nd.hlbm("hnsu", hlbj(int ), (int)402);
                    continue block23;
                }
                case 1076290759: {
                    break block23;
                }
            }
            break;
        }
        var8_3 = nd.c;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl19
        block24: while (true) {
            v2 /* !! */  = (long)(v3 - nd.hlbm("hnsv", hlbj(int ), (int)403));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -39904358: {
                    v3 = nd.hlbm("hnsw", hlbj(int ), (int)404);
                    continue block24;
                }
                case 715968863: {
                    v3 = nd.hlbm("hnsx", hlbj(int ), (int)405);
                    continue block24;
                }
                case 915514343: {
                    v3 = nd.hlbm("hnsy", hlbj(int ), (int)406);
                    continue block24;
                }
                case 1076290759: {
                    break block24;
                }
            }
            break;
        }
        var7_4 /* !! */  = nd.b;
        v4 /* !! */  = nd.oo;
        if (true) ** GOTO lbl36
        block25: while (true) {
            v4 /* !! */  = (long)(v5 - nd.hlbm("hnsz", hlbj(int ), (int)407));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1470899535: {
                    v5 = nd.hlbm("hnta", hlbj(int ), (int)408);
                    continue block25;
                }
                case -1128845748: {
                    v5 = nd.hlbm("hntb", hlbj(int ), (int)409);
                    continue block25;
                }
                case 1076290759: {
                    break block25;
                }
                case 1676557742: {
                    v5 = nd.hlbm("hntc", hlbj(int ), (int)410);
                    continue block25;
                }
            }
            break;
        }
        var6_5 = nd.a;
        if (var8_3) {
            throw null;
lbl51:
            // 2 sources

            return null;
        }
        if (var6_5) ** GOTO lbl51
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_5) ** continue;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hntd", hlbj(int ), (int)411)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == nd.hlbm("hnte", hlbr(int ), (int)940)) break;
                    v6 /* !! */  = (long)nd.hlbm("hntf", hlbr(int ), (int)941);
                }
                return var0 + (var2_1 - var0) * var4_2;
            }
lbl65:
            // 3 sources

            case 0: {
                var7_4 /* !! */  = (int)nd.hlbm("hntg", hlbr(int ), (int)942);
                if (var8_3) {
                    throw null;
                }
            }
            case 1: {
                var7_4 /* !! */  = (int)nd.hlbm("hnth", hlbr(int ), (int)943);
                if (!var8_3) ** GOTO lbl65
                throw null;
            }
            case 2: {
                var7_4 /* !! */  = (int)nd.hlbm("hnti", hlbr(int ), (int)944);
                if (!var8_3) ** GOTO lbl65
                throw null;
            }
            case 3: 
        }
        do {
            var7_4 /* !! */  = (int)nd.hlbm("hntj", hlbr(int ), (int)945);
        } while (!var8_3);
        throw null;
    }

    private static /* synthetic */ void hpml() {
        nd.hlbt[200] = -240405831;
        nd.hlbt[201] = 162603431;
        nd.hlbt[202] = -1172967705;
        nd.hlbt[203] = 1228385226;
        nd.hlbt[204] = 998320075;
        nd.hlbt[205] = 988807147;
        nd.hlbt[206] = 785438041;
        nd.hlbt[207] = 1725301611;
        nd.hlbt[208] = 1703014734;
        nd.hlbt[209] = -1756233777;
        nd.hlbt[210] = 796195517;
        nd.hlbt[211] = 349263327;
        nd.hlbt[212] = -1085026189;
        nd.hlbt[213] = -220477004;
        nd.hlbt[214] = -1463803812;
        nd.hlbt[215] = 733931496;
        nd.hlbt[216] = -1465380174;
        nd.hlbt[217] = -508407086;
        nd.hlbt[218] = -109595233;
        nd.hlbt[219] = -1322758221;
        nd.hlbt[220] = 1584969398;
        nd.hlbt[221] = 1135935394;
        nd.hlbt[222] = 1629674571;
        nd.hlbt[223] = 576233123;
        nd.hlbt[224] = 432529990;
        nd.hlbt[225] = -1961014563;
        nd.hlbt[226] = 1362721978;
        nd.hlbt[227] = -1398414304;
        nd.hlbt[228] = -289435277;
        nd.hlbt[229] = -381764126;
        nd.hlbt[230] = 677443681;
        nd.hlbt[231] = -456740305;
        nd.hlbt[232] = -584395456;
        nd.hlbt[233] = 1686179361;
        nd.hlbt[234] = -759113221;
        nd.hlbt[235] = -364354346;
        nd.hlbt[236] = 801923221;
        nd.hlbt[237] = 1960879108;
        nd.hlbt[238] = -132309860;
        nd.hlbt[239] = -2096407143;
        nd.hlbt[240] = 1332039686;
        nd.hlbt[241] = -1622609087;
        nd.hlbt[242] = -643394453;
        nd.hlbt[243] = -2030712768;
        nd.hlbt[244] = -1005149112;
        nd.hlbt[245] = -1666582118;
        nd.hlbt[246] = 1040945329;
        nd.hlbt[247] = -1901299736;
        nd.hlbt[248] = 1518030735;
        nd.hlbt[249] = 1788013604;
        nd.hlbt[250] = 828346528;
        nd.hlbt[251] = -1905782309;
        nd.hlbt[252] = -481646321;
        nd.hlbt[253] = -926046140;
        nd.hlbt[254] = -950481817;
        nd.hlbt[255] = 1783000361;
        nd.hlbt[256] = -532902252;
        nd.hlbt[257] = -287504054;
        nd.hlbt[258] = 1362463751;
        nd.hlbt[259] = -1002949940;
        nd.hlbt[260] = 570458197;
        nd.hlbt[261] = -2141226755;
        nd.hlbt[262] = 2021581817;
        nd.hlbt[263] = -809196168;
        nd.hlbt[264] = 1422661365;
        nd.hlbt[265] = -777791293;
        nd.hlbt[266] = -308131994;
        nd.hlbt[267] = 497653978;
        nd.hlbt[268] = 128626250;
        nd.hlbt[269] = 2115777103;
        nd.hlbt[270] = 9583102;
        nd.hlbt[271] = -1082416934;
        nd.hlbt[272] = 1289264464;
        nd.hlbt[273] = -798375281;
        nd.hlbt[274] = -2116039927;
        nd.hlbt[275] = -763137760;
        nd.hlbt[276] = 1132820831;
        nd.hlbt[277] = -26980663;
        nd.hlbt[278] = -1652019781;
        nd.hlbt[279] = -1517080358;
        nd.hlbt[280] = 228251808;
        nd.hlbt[281] = 1012869120;
        nd.hlbt[282] = -393018677;
        nd.hlbt[283] = -403257669;
        nd.hlbt[284] = 1007175613;
        nd.hlbt[285] = -1305444196;
        nd.hlbt[286] = 2001938246;
        nd.hlbt[287] = -531734202;
        nd.hlbt[288] = 384591575;
        nd.hlbt[289] = 1839593545;
        nd.hlbt[290] = 2095389856;
        nd.hlbt[291] = 827506507;
        nd.hlbt[292] = 268329405;
        nd.hlbt[293] = -1017413090;
        nd.hlbt[294] = -89956853;
        nd.hlbt[295] = -1804141391;
        nd.hlbt[296] = 1411004249;
        nd.hlbt[297] = -963114750;
        nd.hlbt[298] = 1224357643;
        nd.hlbt[299] = -1756108938;
    }

    private static /* synthetic */ void hpoq() {
        nd.hlbt[1100] = -470795594;
        nd.hlbt[1101] = 1354483642;
        nd.hlbt[1102] = -1540507757;
        nd.hlbt[1103] = 1740801282;
        nd.hlbt[1104] = -1427984202;
        nd.hlbt[1105] = 376101813;
        nd.hlbt[1106] = 1179778337;
        nd.hlbt[1107] = -779486416;
        nd.hlbt[1108] = -247864424;
        nd.hlbt[1109] = -1291895939;
        nd.hlbt[1110] = -1521754895;
        nd.hlbt[1111] = 773550459;
        nd.hlbt[1112] = -665183747;
        nd.hlbt[1113] = -278707588;
        nd.hlbt[1114] = 1859792064;
        nd.hlbt[1115] = -1183151418;
        nd.hlbt[1116] = 1448114849;
        nd.hlbt[1117] = 1196929096;
        nd.hlbt[1118] = -749111073;
        nd.hlbt[1119] = -1240020070;
        nd.hlbt[1120] = 1082971903;
        nd.hlbt[1121] = -26705231;
        nd.hlbt[1122] = 173251658;
        nd.hlbt[1123] = 1363830309;
        nd.hlbt[1124] = 611329316;
        nd.hlbt[1125] = -1836114129;
        nd.hlbt[1126] = -114063005;
        nd.hlbt[1127] = 79658778;
        nd.hlbt[1128] = 654047006;
        nd.hlbt[1129] = 530210709;
        nd.hlbt[1130] = -127259892;
        nd.hlbt[1131] = 681228011;
        nd.hlbt[1132] = 1310252125;
        nd.hlbt[1133] = -1833693962;
        nd.hlbt[1134] = -1028540662;
        nd.hlbt[1135] = -659580541;
        nd.hlbt[1136] = 759947074;
        nd.hlbt[1137] = 1729536310;
        nd.hlbt[1138] = -1464373508;
        nd.hlbt[1139] = -1213659200;
        nd.hlbt[1140] = -1894684839;
        nd.hlbt[1141] = 1682113084;
        nd.hlbt[1142] = 1749053514;
        nd.hlbt[1143] = 1853978587;
        nd.hlbt[1144] = 1326663743;
        nd.hlbt[1145] = 1483093392;
        nd.hlbt[1146] = 1121689114;
        nd.hlbt[1147] = -1042993857;
        nd.hlbt[1148] = 1048557624;
        nd.hlbt[1149] = -545621367;
        nd.hlbt[1150] = 1013868150;
        nd.hlbt[1151] = -688354652;
        nd.hlbt[1152] = -1759105788;
        nd.hlbt[1153] = 1851749371;
        nd.hlbt[1154] = -591295362;
        nd.hlbt[1155] = 1806091419;
        nd.hlbt[1156] = 1291642188;
        nd.hlbt[1157] = 2062503672;
        nd.hlbt[1158] = 833459610;
        nd.hlbt[1159] = 501751164;
        nd.hlbt[1160] = -583601628;
        nd.hlbt[1161] = -1937975916;
        nd.hlbt[1162] = 2035268946;
        nd.hlbt[1163] = -617602150;
        nd.hlbt[1164] = -1431078244;
        nd.hlbt[1165] = 419143011;
        nd.hlbt[1166] = 301823507;
        nd.hlbt[1167] = 1658820126;
        nd.hlbt[1168] = -1078907034;
        nd.hlbt[1169] = -95531801;
        nd.hlbt[1170] = -1699890556;
        nd.hlbt[1171] = 281222220;
        nd.hlbt[1172] = -962728513;
        nd.hlbt[1173] = 1057298285;
        nd.hlbt[1174] = 864341359;
        nd.hlbt[1175] = -1575883551;
        nd.hlbt[1176] = -215560580;
        nd.hlbt[1177] = -790349016;
        nd.hlbt[1178] = 1879505190;
        nd.hlbt[1179] = 1035886906;
        nd.hlbt[1180] = 794207698;
        nd.hlbt[1181] = -1483260344;
        nd.hlbt[1182] = 2132527185;
        nd.hlbt[1183] = -727696659;
        nd.hlbt[1184] = -1665702186;
        nd.hlbt[1185] = 1160175590;
        nd.hlbt[1186] = 994631425;
        nd.hlbt[1187] = 170032737;
        nd.hlbt[1188] = 1208085335;
        nd.hlbt[1189] = 487475735;
        nd.hlbt[1190] = 693464222;
        nd.hlbt[1191] = -97157579;
        nd.hlbt[1192] = 1648195868;
        nd.hlbt[1193] = 766850391;
        nd.hlbt[1194] = 546741368;
        nd.hlbt[1195] = -713256431;
        nd.hlbt[1196] = 575489706;
        nd.hlbt[1197] = 149344804;
        nd.hlbt[1198] = -899777747;
        nd.hlbt[1199] = 1464518137;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int withAlpha(int var0, float var1_1) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hoon", hlbj(int ), (int)611) - nd.hlbm("hool", hlbj(int ), (int)610));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -42681997: {
                    continue block15;
                }
                case 1076290759: {
                    break block15;
                }
            }
            break;
        }
        var4_2 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hoop", hlbj(int ), (int)612)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nd.hlbm("hoor", hlbr(int ), (int)1260)) break;
            v1 /* !! */  = (long)nd.hlbm("hoos", hlbr(int ), (int)1261);
        }
        var3_3 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hoov", hlbj(int ), (int)613)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hoox", hlbr(int ), (int)1262)) break;
            v2 /* !! */  = (long)nd.hlbm("hooz", hlbr(int ), (int)1263);
        }
        var2_4 = nd.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (int)nd.hlbm("hopb", hlbr(int ), (int)1264);
                }
                if (var2_4 || var2_4) ** continue;
                v3 = (int)(var1_1 * nd.hlbm("hopd", hlzk(int ), (int)1265));
                v4 /* !! */  = nd.oo;
                if (true) ** GOTO lbl38
                block19: while (true) {
                    v4 /* !! */  = (long)(v5 - nd.hlbm("hopf", hlbj(int ), (int)614));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1982064594: {
                            v5 = nd.hlbm("hopg", hlbj(int ), (int)615);
                            continue block19;
                        }
                        case 1076290759: {
                            break block19;
                        }
                        case 1267389865: {
                            v5 = nd.hlbm("hoph", hlbj(int ), (int)616);
                            continue block19;
                        }
                    }
                    break;
                }
                return nd.withAlpha(var0, v3);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)nd.hlbm("hopi", hlbr(int ), (int)1266);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)nd.hlbm("hopj", hlbr(int ), (int)1267);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)nd.hlbm("hopk", hlbr(int ), (int)1268);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nd.hlbm("hopl", hlbr(int ), (int)1269);
        ** while (!var4_2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static String removeFormatting(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("houy", hlbj(int ), (int)648)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hova", hlbr(int ), (int)1310)) break;
            v0 /* !! */  = (long)nd.hlbm("hovc", hlbr(int ), (int)1311);
        }
        var3_1 = nd.c;
        v1 /* !! */  = nd.oo;
        block33: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1932739049: {
                    v1 /* !! */  = (long)(nd.hlbm("hovf", hlbj(int ), (int)650) - nd.hlbm("hovd", hlbj(int ), (int)649));
                    continue block33;
                }
                case 1076290759: {
                    break block33;
                }
            }
            break;
        }
        var2_2 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl20
        block34: while (true) {
            v2 /* !! */  = (long)(v3 - nd.hlbm("hovh", hlbj(int ), (int)651));
lbl20:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2054484829: {
                    v3 = nd.hlbm("hovi", hlbj(int ), (int)652);
                    continue block34;
                }
                case -1465394068: {
                    v3 = nd.hlbm("hovk", hlbj(int ), (int)653);
                    continue block34;
                }
                case 1076290759: {
                    break block34;
                }
            }
            break;
        }
        var1_3 = nd.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 || var1_3) return null;
        if (var0 == null) ** GOTO lbl49
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block35: while (true) {
            block57: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) return null;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hovm", hlbj(int ), (int)654)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != nd.hlbm("hovo", hlbr(int ), (int)1312)) ** GOTO lbl46
                            if (var0.isEmpty()) {
                                break;
                            }
                            ** GOTO lbl53
lbl46:
                            // 1 sources

                            v4 /* !! */  = (long)nd.hlbm("hovq", hlbr(int ), (int)1313);
                        }
                        if (var1_3) return null;
lbl49:
                        // 2 sources

                        if (var1_3 || var1_3) return null;
                        v5 = null;
                        if (!var3_1) return v5;
                        throw null;
lbl53:
                        // 1 sources

                        if (var1_3 || var1_3) {
                            return null;
                        }
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hovt", hlbj(int ), (int)655)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  != nd.hlbm("hovv", hlbr(int ), (int)1314)) ** GOTO lbl60
                            v7 /* !! */  = nd.oo;
                            if (true) ** GOTO lbl109
lbl60:
                            // 1 sources

                            v6 /* !! */  = (long)nd.hlbm("hovx", hlbr(int ), (int)1315);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)nd.hlbm("howj", hlbr(int ), (int)1316);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block57;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)nd.hlbm("howk", hlbr(int ), (int)1317);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block57;
                    }
                    case 5: {
                        do {
                            var2_2 /* !! */  = (int)nd.hlbm("howo", hlbr(int ), (int)1321);
                        } while (!var3_1);
                        throw null;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)nd.hlbm("howq", hlbr(int ), (int)1322);
                        cfr_temp_0 = 9;
                        if (var3_1) {
                            throw null;
                        }
                        break block57;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)nd.hlbm("hows", hlbr(int ), (int)1323);
                        if (!var3_1) ** break;
                        throw null;
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)nd.hlbm("howv", hlbr(int ), (int)1325);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        ** GOTO lbl99
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)nd.hlbm("howx", hlbr(int ), (int)1326);
                        if (var3_1) {
                            throw null;
                        }
lbl99:
                        // 3 sources

                        var2_2 /* !! */  = (int)nd.hlbm("howl", hlbr(int ), (int)1318);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)nd.hlbm("hown", hlbr(int ), (int)1320);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl134
                    }
                    block39: while (true) {
                        v7 /* !! */  = (long)(v8 - nd.hlbm("hovy", hlbj(int ), (int)656));
lbl109:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -991016726: {
                                v8 = nd.hlbm("howa", hlbj(int ), (int)657);
                                continue block39;
                            }
                            case 1076290759: {
                                break block39;
                            }
                            case 1587881645: {
                                v8 = nd.hlbm("howc", hlbj(int ), (int)658);
                                continue block39;
                            }
                        }
                        break;
                    }
                    v9 = nd.FORMATTING_CODE_PATTERN.matcher(var0);
                    v10 /* !! */  = nd.oo;
                    if (true) ** GOTO lbl123
                    block40: while (true) {
                        v10 /* !! */  = (long)(v11 - nd.hlbm("howe", hlbj(int ), (int)659));
lbl123:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1475461245: {
                                v11 = nd.hlbm("howg", hlbj(int ), (int)660);
                                continue block40;
                            }
                            case -766258700: {
                                v11 = nd.hlbm("howi", hlbj(int ), (int)661);
                                continue block40;
                            }
                            case 1076290759: {
                                break block40;
                            }
                        }
                        break;
                    }
                    v5 = v9.replaceAll("");
                    return v5;
lbl134:
                    // 2 sources

                    case 3: {
                        var2_2 /* !! */  = (int)nd.hlbm("howm", hlbr(int ), (int)1319);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: 
                }
                ** GOTO lbl143
            }
            do {
                if (true) continue block35;
lbl143:
                // 2 sources

                var2_2 /* !! */  = (int)nd.hlbm("howt", hlbr(int ), (int)1324);
                cfr_temp_0 = 3;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int setAlpha(int var0, int var1_1) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hnjk", hlbj(int ), (int)317) - nd.hlbm("hnjj", hlbj(int ), (int)316));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 576207993: {
                    continue block16;
                }
                case 1076290759: {
                    break block16;
                }
            }
            break;
        }
        var4_2 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnjl", hlbj(int ), (int)318)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nd.hlbm("hnjm", hlbr(int ), (int)781)) break;
            v1 /* !! */  = (long)nd.hlbm("hnjn", hlbr(int ), (int)782);
        }
        var3_3 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - nd.hlbm("hnjo", hlbj(int ), (int)319));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1760281254: {
                    v3 = nd.hlbm("hnjp", hlbj(int ), (int)320);
                    continue block18;
                }
                case 376811959: {
                    v3 = nd.hlbm("hnjq", hlbj(int ), (int)321);
                    continue block18;
                }
                case 1076290759: {
                    break block18;
                }
                case 1751187085: {
                    v3 = nd.hlbm("hnjr", hlbj(int ), (int)322);
                    continue block18;
                }
            }
            break;
        }
        var2_4 = nd.a;
        if (!var4_2) ** GOTO lbl41
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)nd.hlbm("hnjs", hlbr(int ), (int)783);
                }
lbl41:
                // 1 sources

                if (var2_4 || var2_4) continue block19;
                return var0 & nd.hlbm("hnjt", hlbr(int ), (int)784) | var1_1 << nd.hlbm("hnju", hlbr(int ), (int)785);
lbl43:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)nd.hlbm("hnjv", hlbr(int ), (int)786);
                        if (!var4_2) break block19;
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)nd.hlbm("hnjw", hlbr(int ), (int)787);
                    if (!var4_2) ** GOTO lbl43
                    throw null;
                }
                case 2: {
                    var3_3 /* !! */  = (int)nd.hlbm("hnjx", hlbr(int ), (int)788);
                    if (!var4_2) break block19;
                    throw null;
                }
                case 3: 
            }
        }
        var3_3 /* !! */  = (int)nd.hlbm("hnjy", hlbr(int ), (int)789);
        ** while (!var4_2)
lbl59:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float[] varying8(float var0, float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hokf", hlbj(int ), (int)598));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1815088520: {
                    v1 = nd.hlbm("hokg", hlbj(int ), (int)599);
                    continue block17;
                }
                case -1642819043: {
                    v1 = nd.hlbm("hokh", hlbj(int ), (int)600);
                    continue block17;
                }
                case -23533770: {
                    v1 = nd.hlbm("hoki", hlbj(int ), (int)601);
                    continue block17;
                }
                case 1076290759: {
                    break block17;
                }
            }
            break;
        }
        var10_8 = nd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hokj", hlbj(int ), (int)602)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hokk", hlbr(int ), (int)1197)) break;
            v2 /* !! */  = (long)nd.hlbm("hokl", hlbr(int ), (int)1198);
        }
        var9_9 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hokm", hlbj(int ), (int)603));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1226711580: {
                    v4 = nd.hlbm("hokn", hlbj(int ), (int)604);
                    continue block19;
                }
                case -808077911: {
                    v4 = nd.hlbm("hoko", hlbj(int ), (int)605);
                    continue block19;
                }
                case 1076290759: {
                    break block19;
                }
            }
            break;
        }
        var8_10 = nd.a;
        if (var10_8) {
            throw null;
lbl41:
            // 2 sources

            return null;
        }
        if (var8_10) ** GOTO lbl41
        if (var9_9 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var9_9 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_10) ** continue;
                return new float[]{var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7};
            }
lbl49:
            // 2 sources

            case 0: {
                var9_9 /* !! */  = (int)nd.hlbm("hokp", hlbr(int ), (int)1199);
                if (var10_8) {
                    throw null;
                }
            }
            case 1: {
                var9_9 /* !! */  = (int)nd.hlbm("hokq", hlbr(int ), (int)1200);
                if (!var10_8) ** GOTO lbl49
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_9 /* !! */  = (int)nd.hlbm("hokr", hlbr(int ), (int)1201);
                    if (!var10_8) break block11;
                    throw null;
                }
            }
            case 3: 
        }
        var9_9 /* !! */  = (int)nd.hlbm("hoks", hlbr(int ), (int)1202);
        ** while (!var10_8)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] corners8(int var0, int var1_1, int var2_2, int var3_3) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block46: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hoft", hlbj(int ), (int)547));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1448084903: {
                    v1 = nd.hlbm("hofu", hlbj(int ), (int)548);
                    continue block46;
                }
                case -324471213: {
                    v1 = nd.hlbm("hofv", hlbj(int ), (int)549);
                    continue block46;
                }
                case 1076290759: {
                    break block46;
                }
                case 1869925837: {
                    v1 = nd.hlbm("hofw", hlbj(int ), (int)550);
                    continue block46;
                }
            }
            break;
        }
        var10_4 = nd.c;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl22
        block47: while (true) {
            v2 /* !! */  = (long)(v3 - nd.hlbm("hofx", hlbj(int ), (int)551));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2114326887: {
                    v3 = nd.hlbm("hofy", hlbj(int ), (int)552);
                    continue block47;
                }
                case -463183902: {
                    v3 = nd.hlbm("hofz", hlbj(int ), (int)553);
                    continue block47;
                }
                case 1076290759: {
                    break block47;
                }
                case 1812422983: {
                    v3 = nd.hlbm("hoga", hlbj(int ), (int)554);
                    continue block47;
                }
            }
            break;
        }
        var9_5 /* !! */  = nd.b;
        v4 /* !! */  = nd.oo;
        if (true) ** GOTO lbl39
        block48: while (true) {
            v4 /* !! */  = (long)(v5 - nd.hlbm("hogb", hlbj(int ), (int)555));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2059315617: {
                    v5 = nd.hlbm("hogc", hlbj(int ), (int)556);
                    continue block48;
                }
                case -967715252: {
                    v5 = nd.hlbm("hogd", hlbj(int ), (int)557);
                    continue block48;
                }
                case -793749390: {
                    v5 = nd.hlbm("hoge", hlbj(int ), (int)558);
                    continue block48;
                }
                case 1076290759: {
                    break block48;
                }
            }
            break;
        }
        var8_6 = nd.a;
        if (var10_4) {
            throw null;
lbl54:
            // 5 sources

            return null;
        }
        if (var9_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_6 || var8_6) ** GOTO lbl54
                v6 = nd.hlbm("hogf", hlzk(int ), (int)1132);
                v7 /* !! */  = nd.oo;
                if (true) ** GOTO lbl65
                block50: while (true) {
                    v7 /* !! */  = (long)(v8 - nd.hlbm("hogg", hlbj(int ), (int)559));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1427300226: {
                            v8 = nd.hlbm("hogh", hlbj(int ), (int)560);
                            continue block50;
                        }
                        case -456915993: {
                            v8 = nd.hlbm("hogi", hlbj(int ), (int)561);
                            continue block50;
                        }
                        case 1076290759: {
                            break block50;
                        }
                    }
                    break;
                }
                var4_7 = nd.blend(var0, var1_1, (float)v6);
                if (var8_6 || var8_6) ** GOTO lbl54
                v9 = nd.hlbm("hogj", hlzk(int ), (int)1133);
                v10 /* !! */  = nd.oo;
                if (true) ** GOTO lbl81
                block51: while (true) {
                    v10 /* !! */  = (long)(v11 - nd.hlbm("hogk", hlbj(int ), (int)562));
lbl81:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 1076290759: {
                            break block51;
                        }
                        case 1559899731: {
                            v11 = nd.hlbm("hogl", hlbj(int ), (int)563);
                            continue block51;
                        }
                        case 2042942563: {
                            v11 = nd.hlbm("hogm", hlbj(int ), (int)564);
                            continue block51;
                        }
                    }
                    break;
                }
                var5_8 = nd.blend(var1_1, var2_2, (float)v9);
                if (var8_6 || var8_6) ** GOTO lbl54
                v12 = nd.hlbm("hogn", hlzk(int ), (int)1134);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hogo", hlbj(int ), (int)565)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == nd.hlbm("hogp", hlbr(int ), (int)1135)) break;
                    v13 /* !! */  = (long)nd.hlbm("hogq", hlbr(int ), (int)1136);
                }
                var6_9 = nd.blend(var2_2, var3_3, (float)v12);
                if (var8_6 || var8_6) ** GOTO lbl54
                v14 = nd.hlbm("hogr", hlzk(int ), (int)1137);
                v15 /* !! */  = nd.oo;
                if (true) ** GOTO lbl106
                block53: while (true) {
                    v15 /* !! */  = (long)(nd.hlbm("hogt", hlbj(int ), (int)567) - nd.hlbm("hogs", hlbj(int ), (int)566));
lbl106:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -839155175: {
                            continue block53;
                        }
                        case 1076290759: {
                            break block53;
                        }
                    }
                    break;
                }
                var7_10 = nd.blend(var3_3, var0, (float)v14);
                if (var8_6 || var8_6) ** continue;
                return new int[]{var0, var4_7, var1_1, var5_8, var2_2, var6_9, var3_3, var7_10};
            }
lbl114:
            // 2 sources

            case 0: {
                var9_5 /* !! */  = (int)nd.hlbm("hogu", hlbr(int ), (int)1138);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl119:
            // 4 sources

            case 1: {
                var9_5 /* !! */  = (int)nd.hlbm("hogv", hlbr(int ), (int)1139);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 2: {
                var9_5 /* !! */  = (int)nd.hlbm("hogw", hlbr(int ), (int)1140);
                if (!var10_4) ** GOTO lbl119
                throw null;
            }
lbl128:
            // 3 sources

            case 3: {
                var9_5 /* !! */  = (int)nd.hlbm("hogx", hlbr(int ), (int)1141);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 4: {
                var9_5 /* !! */  = (int)nd.hlbm("hogy", hlbr(int ), (int)1142);
                if (!var10_4) ** GOTO lbl114
                throw null;
            }
lbl137:
            // 2 sources

            case 5: {
                var9_5 /* !! */  = (int)nd.hlbm("hogz", hlbr(int ), (int)1143);
                if (!var10_4) ** GOTO lbl119
                throw null;
            }
lbl141:
            // 3 sources

            case 6: {
                var9_5 /* !! */  = (int)nd.hlbm("hoha", hlbr(int ), (int)1144);
                if (var10_4) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl146:
            // 2 sources

            case 7: {
                var9_5 /* !! */  = (int)nd.hlbm("hohb", hlbr(int ), (int)1145);
                if (!var10_4) ** GOTO lbl128
                throw null;
            }
            case 8: {
                var9_5 /* !! */  = (int)nd.hlbm("hohc", hlbr(int ), (int)1146);
                if (!var10_4) ** GOTO lbl128
                throw null;
            }
lbl154:
            // 2 sources

            case 9: {
                var9_5 /* !! */  = (int)nd.hlbm("hohd", hlbr(int ), (int)1147);
                if (!var10_4) ** GOTO lbl137
                throw null;
            }
            case 10: {
                var9_5 /* !! */  = (int)nd.hlbm("hohe", hlbr(int ), (int)1148);
                if (!var10_4) ** GOTO lbl119
                throw null;
            }
            case 11: 
        }
        do {
            var9_5 /* !! */  = (int)nd.hlbm("hohf", hlbr(int ), (int)1149);
        } while (!var10_4);
        throw null;
    }

    private static /* synthetic */ void hplj() {
        nd.hlbs[600] = -785678283;
        nd.hlbs[601] = -1001860774;
        nd.hlbs[602] = 1661862476;
        nd.hlbs[603] = -1057931256;
        nd.hlbs[604] = 1409751896;
        nd.hlbs[605] = 844505704;
        nd.hlbs[606] = 490171126;
        nd.hlbs[607] = 497828992;
        nd.hlbs[608] = 226122924;
        nd.hlbs[609] = -2066526880;
        nd.hlbs[610] = -2015723688;
        nd.hlbs[611] = -1023614928;
        nd.hlbs[612] = -1600694153;
        nd.hlbs[613] = -2094236604;
        nd.hlbs[614] = -1047105907;
        nd.hlbs[615] = -1826548395;
        nd.hlbs[616] = -706688284;
        nd.hlbs[617] = 830351670;
        nd.hlbs[618] = 2090455912;
        nd.hlbs[619] = -251397412;
        nd.hlbs[620] = -1605064467;
        nd.hlbs[621] = 719319410;
        nd.hlbs[622] = 989505020;
        nd.hlbs[623] = -1713937433;
        nd.hlbs[624] = -2089432523;
        nd.hlbs[625] = 476265169;
        nd.hlbs[626] = -1511358723;
        nd.hlbs[627] = 1685823568;
        nd.hlbs[628] = -287348499;
        nd.hlbs[629] = 1485590331;
        nd.hlbs[630] = 649265595;
        nd.hlbs[631] = -1500081311;
        nd.hlbs[632] = 962882054;
        nd.hlbs[633] = -565000510;
        nd.hlbs[634] = 1255112127;
        nd.hlbs[635] = -1651789874;
        nd.hlbs[636] = -2023252188;
        nd.hlbs[637] = -668962749;
        nd.hlbs[638] = 339090770;
        nd.hlbs[639] = -677734694;
        nd.hlbs[640] = 1681487443;
        nd.hlbs[641] = 1158945077;
        nd.hlbs[642] = -1523304759;
        nd.hlbs[643] = -243114257;
        nd.hlbs[644] = 572182907;
        nd.hlbs[645] = -1824532851;
        nd.hlbs[646] = 291934948;
        nd.hlbs[647] = -698104031;
        nd.hlbs[648] = -2108952636;
        nd.hlbs[649] = -1292848730;
        nd.hlbs[650] = -326124999;
        nd.hlbs[651] = 1518131907;
        nd.hlbs[652] = 1636411127;
        nd.hlbs[653] = 59236891;
        nd.hlbs[654] = 832283572;
        nd.hlbs[655] = -1711487055;
        nd.hlbs[656] = 1288329240;
        nd.hlbs[657] = 944502456;
        nd.hlbs[658] = -1589555272;
        nd.hlbs[659] = 332853400;
        nd.hlbs[660] = -919643625;
        nd.hlbs[661] = 1763347686;
        nd.hlbs[662] = -441963259;
        nd.hlbs[663] = 1634236561;
        nd.hlbs[664] = -2009674822;
        nd.hlbs[665] = 1179222443;
        nd.hlbs[666] = -662678461;
        nd.hlbs[667] = -1892430238;
        nd.hlbs[668] = -1316684634;
        nd.hlbs[669] = 1385217242;
        nd.hlbs[670] = -933629799;
        nd.hlbs[671] = 489291366;
        nd.hlbs[672] = 1297870005;
        nd.hlbs[673] = -138152391;
        nd.hlbs[674] = -1443272002;
        nd.hlbs[675] = 909233000;
        nd.hlbs[676] = -783644739;
        nd.hlbs[677] = -977918680;
        nd.hlbs[678] = -1205131120;
        nd.hlbs[679] = -1424436379;
        nd.hlbs[680] = -217801555;
        nd.hlbs[681] = -1810469899;
        nd.hlbs[682] = 695400281;
        nd.hlbs[683] = 488326757;
        nd.hlbs[684] = 2129641544;
        nd.hlbs[685] = 582006278;
        nd.hlbs[686] = -1272942573;
        nd.hlbs[687] = -1141707264;
        nd.hlbs[688] = -1073706743;
        nd.hlbs[689] = 494560028;
        nd.hlbs[690] = -2012024420;
        nd.hlbs[691] = 1126601388;
        nd.hlbs[692] = -2142836590;
        nd.hlbs[693] = -1384800650;
        nd.hlbs[694] = -150144444;
        nd.hlbs[695] = -161548657;
        nd.hlbs[696] = 876577419;
        nd.hlbs[697] = 1929139004;
        nd.hlbs[698] = 304087254;
        nd.hlbs[699] = 1024914783;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int astolfo(int var0, int var1_1, float var2_2, float var3_3, float var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnuy", hlbj(int ), (int)429)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hnuz", hlbr(int ), (int)969)) break;
            v0 /* !! */  = (long)nd.hlbm("hnva", hlbr(int ), (int)970);
        }
        var12_5 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnvb", hlbj(int ), (int)430)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nd.hlbm("hnvc", hlbr(int ), (int)971)) break;
            v1 /* !! */  = (long)nd.hlbm("hnvd", hlbr(int ), (int)972);
        }
        var11_6 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnve", hlbj(int ), (int)431)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nd.hlbm("hnvf", hlbr(int ), (int)973)) break;
            v2 /* !! */  = (long)nd.hlbm("hnvg", hlbr(int ), (int)974);
        }
        var10_7 = nd.a;
        if (var12_5) {
            throw null;
lbl21:
            // 10 sources

            return (int)nd.hlbm("hnvh", hlbr(int ), (int)975);
        }
        if (var10_7 || var10_7) ** GOTO lbl21
        var5_8 = nd.hlbm("hnvi", hlzk(int ), (int)976);
        if (var10_7 || var10_7) ** GOTO lbl21
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl30
        block50: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hnvj", hlbj(int ), (int)432));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1473138252: {
                    v4 = nd.hlbm("hnvk", hlbj(int ), (int)433);
                    continue block50;
                }
                case 1076290759: {
                    break block50;
                }
                case 1667077928: {
                    v4 = nd.hlbm("hnvl", hlbj(int ), (int)434);
                    continue block50;
                }
                case 2093457610: {
                    v4 = nd.hlbm("hnvm", hlbj(int ), (int)435);
                    continue block50;
                }
            }
            break;
        }
        var6_9 = nd.calculateHuyDegrees(var0, var1_1);
        if (var10_7 || var10_7) ** GOTO lbl21
        var7_10 = (var6_9 + (float)var1_1 * var5_8) % nd.hlbm("hnvn", hlzk(int ), (int)977);
        if (var10_7 || var10_7) ** GOTO lbl21
        var7_10 /= nd.hlbm("hnvo", hlzk(int ), (int)978);
        if (var10_7 || var10_7) ** GOTO lbl21
        v5 /* !! */  = nd.oo;
        if (true) ** GOTO lbl52
        block51: while (true) {
            v5 /* !! */  = (long)(nd.hlbm("hnvq", hlbj(int ), (int)437) - nd.hlbm("hnvp", hlbj(int ), (int)436));
lbl52:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 904323213: {
                    continue block51;
                }
                case 1076290759: {
                    break block51;
                }
            }
            break;
        }
        var2_2 = Math.clamp((float)var2_2, (float)0.0f, (float)1.0f);
        if (var10_7 || var10_7) ** GOTO lbl21
        v6 /* !! */  = nd.oo;
        if (true) ** GOTO lbl63
        block52: while (true) {
            v6 /* !! */  = (long)(v7 - nd.hlbm("hnvr", hlbj(int ), (int)438));
lbl63:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 583764895: {
                    v7 = nd.hlbm("hnvs", hlbj(int ), (int)439);
                    continue block52;
                }
                case 706920027: {
                    v7 = nd.hlbm("hnvt", hlbj(int ), (int)440);
                    continue block52;
                }
                case 1004121238: {
                    v7 = nd.hlbm("hnvu", hlbj(int ), (int)441);
                    continue block52;
                }
                case 1076290759: {
                    break block52;
                }
            }
            break;
        }
        var3_3 = Math.clamp((float)var3_3, (float)0.0f, (float)1.0f);
        if (var10_7) ** GOTO lbl21
        if (var11_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_7) ** GOTO lbl21
                v8 /* !! */  = nd.oo;
                if (true) ** GOTO lbl85
                block53: while (true) {
                    v8 /* !! */  = (long)(nd.hlbm("hnvw", hlbj(int ), (int)443) - nd.hlbm("hnvv", hlbj(int ), (int)442));
lbl85:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1608752731: {
                            continue block53;
                        }
                        case 1076290759: {
                            break block53;
                        }
                    }
                    break;
                }
                var8_11 = Color.HSBtoRGB(var7_10, var2_2, var3_3);
                if (var10_7 || var10_7) ** GOTO lbl21
                v9 = nd.hlbm("hnvx", hlbr(int ), (int)979);
                v10 = nd.hlbm("hnvy", hlbr(int ), (int)980);
                v11 = (int)(var4_4 * nd.hlbm("hnvz", hlzk(int ), (int)981));
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = nd.oo - nd.hlbm("hnwa", hlbj(int ), (int)444)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nd.hlbm("hnwb", hlbr(int ), (int)982)) break;
                    v12 /* !! */  = (long)nd.hlbm("hnwc", hlbr(int ), (int)983);
                }
                v13 = Math.min((int)v10, v11);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = nd.oo - nd.hlbm("hnwd", hlbj(int ), (int)445)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nd.hlbm("hnwe", hlbr(int ), (int)984)) break;
                    v14 /* !! */  = (long)nd.hlbm("hnwf", hlbr(int ), (int)985);
                }
                var9_12 = Math.max((int)v9, v13);
                if (!var10_7 && !var10_7) ** break;
                ** continue;
                v15 /* !! */  = nd.oo;
                if (true) ** GOTO lbl113
                block56: while (true) {
                    v15 /* !! */  = (long)(nd.hlbm("hnwh", hlbj(int ), (int)447) - nd.hlbm("hnwg", hlbj(int ), (int)446));
lbl113:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -951173350: {
                            continue block56;
                        }
                        case 1076290759: {
                            break block56;
                        }
                    }
                    break;
                }
                return nd.reAlphaInt(var8_11, var9_12);
            }
lbl119:
            // 3 sources

            case 0: {
                do {
                    var11_6 /* !! */  = (int)nd.hlbm("hnwi", hlbr(int ), (int)986);
                } while (!var12_5);
                throw null;
            }
lbl124:
            // 3 sources

            case 1: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwj", hlbr(int ), (int)987);
                if (var12_5) {
                    throw null;
                }
            }
            case 2: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwk", hlbr(int ), (int)988);
                if (!var12_5) ** GOTO lbl119
                throw null;
            }
lbl132:
            // 2 sources

            case 3: {
                do {
                    var11_6 /* !! */  = (int)nd.hlbm("hnwl", hlbr(int ), (int)989);
                } while (!var12_5);
                throw null;
            }
            case 4: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwm", hlbr(int ), (int)990);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 5: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwn", hlbr(int ), (int)991);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 6: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwo", hlbr(int ), (int)992);
                if (!var12_5) ** GOTO lbl132
                throw null;
            }
lbl151:
            // 4 sources

            case 7: {
                do {
                    var11_6 /* !! */  = (int)nd.hlbm("hnwp", hlbr(int ), (int)993);
                } while (!var12_5);
                throw null;
            }
            case 8: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwq", hlbr(int ), (int)994);
                if (!var12_5) ** GOTO lbl124
                throw null;
            }
            case 9: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwr", hlbr(int ), (int)995);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 10: {
                var11_6 /* !! */  = (int)nd.hlbm("hnws", hlbr(int ), (int)996);
                if (!var12_5) ** GOTO lbl151
                throw null;
            }
            case 11: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwt", hlbr(int ), (int)997);
                if (!var12_5) ** GOTO lbl124
                throw null;
            }
lbl173:
            // 2 sources

            case 12: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwu", hlbr(int ), (int)998);
                if (!var12_5) ** GOTO lbl151
                throw null;
            }
lbl177:
            // 2 sources

            case 13: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwv", hlbr(int ), (int)999);
                if (!var12_5) ** GOTO lbl119
                throw null;
            }
            case 14: {
                var11_6 /* !! */  = (int)nd.hlbm("hnww", hlbr(int ), (int)1000);
                if (var12_5) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl186:
            // 2 sources

            case 15: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwx", hlbr(int ), (int)1001);
                if (!var12_5) ** GOTO lbl151
                throw null;
            }
            case 16: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwy", hlbr(int ), (int)1002);
                if (!var12_5) break;
                throw null;
            }
lbl194:
            // 3 sources

            case 17: {
                var11_6 /* !! */  = (int)nd.hlbm("hnwz", hlbr(int ), (int)1003);
                if (!var12_5) ** GOTO lbl177
                throw null;
            }
lbl198:
            // 2 sources

            case 18: {
                var11_6 /* !! */  = (int)nd.hlbm("hnxa", hlbr(int ), (int)1004);
                if (!var12_5) ** GOTO lbl194
                throw null;
            }
            case 19: 
        }
        do {
            var11_6 /* !! */  = (int)nd.hlbm("hnxb", hlbr(int ), (int)1005);
        } while (!var12_5);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float[] rgba(int var0) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hnpu", hlbj(int ), (int)384) - nd.hlbm("hnpt", hlbj(int ), (int)383));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1076290759: {
                    break block19;
                }
                case 2056400641: {
                    continue block19;
                }
            }
            break;
        }
        var3_1 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hnpv", hlbj(int ), (int)385));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -625229936: {
                    v2 = nd.hlbm("hnpw", hlbj(int ), (int)386);
                    continue block20;
                }
                case -23237667: {
                    v2 = nd.hlbm("hnpx", hlbj(int ), (int)387);
                    continue block20;
                }
                case 1076290759: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl29
        block21: while (true) {
            v3 /* !! */  = (long)(nd.hlbm("hnpz", hlbj(int ), (int)389) - nd.hlbm("hnpy", hlbj(int ), (int)388));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 902532706: {
                    continue block21;
                }
                case 1076290759: {
                    break block21;
                }
            }
            break;
        }
        var1_3 = nd.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 = new float[4];
                v4[nd.hlbm("hnqa", hlbr(int ), (int)880)] = (float)(var0 >> nd.hlbm("hnqb", hlbr(int ), (int)881) & nd.hlbm("hnqc", hlbr(int ), (int)882)) / 255.0f;
                v4[nd.hlbm("hnqd", hlbr(int ), (int)883)] = (float)(var0 >> nd.hlbm("hnqe", hlbr(int ), (int)884) & nd.hlbm("hnqf", hlbr(int ), (int)885)) / 255.0f;
                v4[nd.hlbm("hnqg", hlbr(int ), (int)886)] = (float)(var0 & nd.hlbm("hnqh", hlbr(int ), (int)887)) / 255.0f;
                v4[nd.hlbm("hnqi", hlbr(int ), (int)888)] = (float)(var0 >> nd.hlbm("hnqj", hlbr(int ), (int)889) & nd.hlbm("hnqk", hlbr(int ), (int)890)) / 255.0f;
                return v4;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nd.hlbm("hnql", hlbr(int ), (int)891);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)nd.hlbm("hnqm", hlbr(int ), (int)892);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nd.hlbm("hnqn", hlbr(int ), (int)893);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nd.hlbm("hnqo", hlbr(int ), (int)894);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int calculateHuyDegrees(int var0, int var1_1) {
        v0 /* !! */  = nd.oo;
        block31: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -426205797: {
                    v0 /* !! */  = (long)(nd.hlbm("hnxz", hlbj(int ), (int)456) - nd.hlbm("hnxy", hlbj(int ), (int)455));
                    continue block31;
                }
                case 1076290759: {
                    break block31;
                }
            }
            break;
        }
        var8_2 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl14
        block32: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hnya", hlbj(int ), (int)457));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1875250247: {
                    v2 = nd.hlbm("hnyb", hlbj(int ), (int)458);
                    continue block32;
                }
                case 260450212: {
                    v2 = nd.hlbm("hnyc", hlbj(int ), (int)459);
                    continue block32;
                }
                case 764590684: {
                    v2 = nd.hlbm("hnyd", hlbj(int ), (int)460);
                    continue block32;
                }
                case 1076290759: {
                    break block32;
                }
            }
            break;
        }
        var7_3 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl31
        block33: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hnye", hlbj(int ), (int)461));
lbl31:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1013490451: {
                    v4 = nd.hlbm("hnyf", hlbj(int ), (int)462);
                    continue block33;
                }
                case -624449043: {
                    v4 = nd.hlbm("hnyg", hlbj(int ), (int)463);
                    continue block33;
                }
                case -259749673: {
                    v4 = nd.hlbm("hnyh", hlbj(int ), (int)464);
                    continue block33;
                }
                case 1076290759: {
                    break block33;
                }
            }
            break;
        }
        var6_4 = nd.a;
        if (var8_2) {
            throw null;
        }
        if (var6_4 || var6_4) ** GOTO lbl70
        v5 /* !! */  = nd.oo;
        if (true) ** GOTO lbl51
        block34: while (true) {
            v5 /* !! */  = (long)(v6 - nd.hlbm("hnyj", hlbj(int ), (int)465));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1789302223: {
                    v6 = nd.hlbm("hnyk", hlbj(int ), (int)466);
                    continue block34;
                }
                case -638892558: {
                    v6 = nd.hlbm("hnyl", hlbj(int ), (int)467);
                    continue block34;
                }
                case 1076290759: {
                    break block34;
                }
            }
            break;
        }
        var2_5 = System.currentTimeMillis();
        if (var6_4) ** GOTO lbl70
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block35: while (true) {
            block48: {
                switch (cfr_temp_0 == -2147483648 ? var7_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var6_4) ** GOTO lbl70
                        var4_6 = (var2_5 / (long)var0 + (long)var1_1) % nd.hlbm("hnym", hlbj(int ), (int)468);
                        if (!var6_4 && !var6_4) ** GOTO lbl71
lbl70:
                        // 4 sources

                        return (int)nd.hlbm("hnyi", hlbr(int ), (int)1021);
lbl71:
                        // 1 sources

                        return (int)var4_6;
                    }
                    case 0: {
                        var7_3 /* !! */  = (int)nd.hlbm("hnyn", hlbr(int ), (int)1022);
                        cfr_temp_0 = 6;
                        if (var8_2) {
                            throw null;
                        }
                        break block48;
                    }
                    case 2: {
                        ** GOTO lbl88
                    }
                    case 5: {
                        var7_3 /* !! */  = (int)nd.hlbm("hnys", hlbr(int ), (int)1027);
                        if (!var8_2) ** break;
                        throw null;
                    }
                    case 7: {
                        var7_3 /* !! */  = (int)nd.hlbm("hnyu", hlbr(int ), (int)1029);
                        if (var8_2) {
                            throw null;
                        }
lbl88:
                        // 3 sources

                        var7_3 /* !! */  = (int)nd.hlbm("hnyp", hlbr(int ), (int)1024);
                        if (var8_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var7_3 /* !! */  = (int)nd.hlbm("hnyq", hlbr(int ), (int)1025);
                        if (var8_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        do {
                            var7_3 /* !! */  = (int)nd.hlbm("hnyo", hlbr(int ), (int)1023);
                        } while (!var8_2);
                        throw null;
                    }
                    case 4: {
                        var7_3 /* !! */  = (int)nd.hlbm("hnyr", hlbr(int ), (int)1026);
                        if (var8_2) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl109
            }
            do {
                if (true) continue block35;
lbl109:
                // 2 sources

                var7_3 /* !! */  = (int)nd.hlbm("hnyt", hlbr(int ), (int)1028);
                cfr_temp_0 = 4;
            } while (!var8_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void hpld() {
        nd.hlbs[0] = -1281157484;
        nd.hlbs[1] = 738581731;
        nd.hlbs[2] = -1333055383;
        nd.hlbs[3] = 533657118;
        nd.hlbs[4] = 939899852;
        nd.hlbs[5] = 1127059876;
        nd.hlbs[6] = -1695120956;
        nd.hlbs[7] = -209355485;
        nd.hlbs[8] = -1667803345;
        nd.hlbs[9] = -160447713;
        nd.hlbs[10] = -1650523551;
        nd.hlbs[11] = 181255886;
        nd.hlbs[12] = 1843386633;
        nd.hlbs[13] = 518750825;
        nd.hlbs[14] = 442032137;
        nd.hlbs[15] = 1272182746;
        nd.hlbs[16] = -1070820093;
        nd.hlbs[17] = 991965732;
        nd.hlbs[18] = -903071584;
        nd.hlbs[19] = 376397159;
        nd.hlbs[20] = 1378475622;
        nd.hlbs[21] = 58063190;
        nd.hlbs[22] = -66455477;
        nd.hlbs[23] = -5092928;
        nd.hlbs[24] = 327626002;
        nd.hlbs[25] = 1465385307;
        nd.hlbs[26] = 1695984128;
        nd.hlbs[27] = -1351048645;
        nd.hlbs[28] = -992264372;
        nd.hlbs[29] = -1619142068;
        nd.hlbs[30] = -1137271047;
        nd.hlbs[31] = 1766500347;
        nd.hlbs[32] = -1321927792;
        nd.hlbs[33] = 909629484;
        nd.hlbs[34] = -2133939101;
        nd.hlbs[35] = -1336153119;
        nd.hlbs[36] = 1063861900;
        nd.hlbs[37] = -569280634;
        nd.hlbs[38] = 1602297958;
        nd.hlbs[39] = -778601444;
        nd.hlbs[40] = 813211113;
        nd.hlbs[41] = 305277913;
        nd.hlbs[42] = 1290514836;
        nd.hlbs[43] = 1127889825;
        nd.hlbs[44] = 338385163;
        nd.hlbs[45] = 394678861;
        nd.hlbs[46] = 2140937394;
        nd.hlbs[47] = -1288971242;
        nd.hlbs[48] = -1980428912;
        nd.hlbs[49] = -1559722464;
        nd.hlbs[50] = -585904167;
        nd.hlbs[51] = -127982314;
        nd.hlbs[52] = -1991339888;
        nd.hlbs[53] = 25304114;
        nd.hlbs[54] = 124691813;
        nd.hlbs[55] = 764394139;
        nd.hlbs[56] = 291650025;
        nd.hlbs[57] = 212676725;
        nd.hlbs[58] = -1425340037;
        nd.hlbs[59] = 110705070;
        nd.hlbs[60] = 1856898452;
        nd.hlbs[61] = -79642662;
        nd.hlbs[62] = 1514216251;
        nd.hlbs[63] = 1832201063;
        nd.hlbs[64] = -1863934172;
        nd.hlbs[65] = -96143885;
        nd.hlbs[66] = 1405231427;
        nd.hlbs[67] = 235016671;
        nd.hlbs[68] = 532092519;
        nd.hlbs[69] = -1662069622;
        nd.hlbs[70] = 1360234387;
        nd.hlbs[71] = 2106441335;
        nd.hlbs[72] = 933469733;
        nd.hlbs[73] = -770539508;
        nd.hlbs[74] = -1743788511;
        nd.hlbs[75] = -361488811;
        nd.hlbs[76] = 439050280;
        nd.hlbs[77] = 319664924;
        nd.hlbs[78] = 334245479;
        nd.hlbs[79] = -1894602917;
        nd.hlbs[80] = -910049477;
        nd.hlbs[81] = 182118301;
        nd.hlbs[82] = -9832802;
        nd.hlbs[83] = -496740674;
        nd.hlbs[84] = -652399607;
        nd.hlbs[85] = -621533822;
        nd.hlbs[86] = 303890109;
        nd.hlbs[87] = -1511135409;
        nd.hlbs[88] = 1781008401;
        nd.hlbs[89] = -18117701;
        nd.hlbs[90] = -528484898;
        nd.hlbs[91] = -1775116373;
        nd.hlbs[92] = 1323083261;
        nd.hlbs[93] = -132308115;
        nd.hlbs[94] = -1536211309;
        nd.hlbs[95] = 736537088;
        nd.hlbs[96] = 1614113727;
        nd.hlbs[97] = -42123790;
        nd.hlbs[98] = -124733532;
        nd.hlbs[99] = 2138170;
    }

    private static /* synthetic */ void hpln() {
        nd.hlbs[1000] = 1270581614;
        nd.hlbs[1001] = 395548285;
        nd.hlbs[1002] = -1573482284;
        nd.hlbs[1003] = -1115587094;
        nd.hlbs[1004] = -568521427;
        nd.hlbs[1005] = 1657175745;
        nd.hlbs[1006] = 202844490;
        nd.hlbs[1007] = -5169104;
        nd.hlbs[1008] = 995788310;
        nd.hlbs[1009] = -173374374;
        nd.hlbs[1010] = 1514135416;
        nd.hlbs[1011] = 1497656018;
        nd.hlbs[1012] = 27545064;
        nd.hlbs[1013] = -421972742;
        nd.hlbs[1014] = 1014835608;
        nd.hlbs[1015] = 525635077;
        nd.hlbs[1016] = 452848217;
        nd.hlbs[1017] = -61719618;
        nd.hlbs[1018] = -1829035991;
        nd.hlbs[1019] = -1962645186;
        nd.hlbs[1020] = 651405703;
        nd.hlbs[1021] = 1133710310;
        nd.hlbs[1022] = 90860200;
        nd.hlbs[1023] = -313733972;
        nd.hlbs[1024] = 1501874983;
        nd.hlbs[1025] = 1488591646;
        nd.hlbs[1026] = 375377114;
        nd.hlbs[1027] = 1407043958;
        nd.hlbs[1028] = 1376476168;
        nd.hlbs[1029] = -14886620;
        nd.hlbs[1030] = 71775097;
        nd.hlbs[1031] = 1549926664;
        nd.hlbs[1032] = 1470757151;
        nd.hlbs[1033] = 506818336;
        nd.hlbs[1034] = -1653745649;
        nd.hlbs[1035] = -1050695574;
        nd.hlbs[1036] = 1984298387;
        nd.hlbs[1037] = 583174519;
        nd.hlbs[1038] = 1624837093;
        nd.hlbs[1039] = 933016522;
        nd.hlbs[1040] = 869837606;
        nd.hlbs[1041] = -608098294;
        nd.hlbs[1042] = 74049800;
        nd.hlbs[1043] = -2019648993;
        nd.hlbs[1044] = 197043797;
        nd.hlbs[1045] = 1736760712;
        nd.hlbs[1046] = 590378143;
        nd.hlbs[1047] = 1363660187;
        nd.hlbs[1048] = -234446545;
        nd.hlbs[1049] = 899833708;
        nd.hlbs[1050] = -89665727;
        nd.hlbs[1051] = -1029518539;
        nd.hlbs[1052] = 1873861342;
        nd.hlbs[1053] = 312040577;
        nd.hlbs[1054] = 222972881;
        nd.hlbs[1055] = 707383936;
        nd.hlbs[1056] = -1103040206;
        nd.hlbs[1057] = 1555895011;
        nd.hlbs[1058] = 477366244;
        nd.hlbs[1059] = -1743304852;
        nd.hlbs[1060] = -1430355046;
        nd.hlbs[1061] = -655302274;
        nd.hlbs[1062] = -294831517;
        nd.hlbs[1063] = -211643836;
        nd.hlbs[1064] = 169444046;
        nd.hlbs[1065] = 1165188673;
        nd.hlbs[1066] = 159553835;
        nd.hlbs[1067] = 1788875473;
        nd.hlbs[1068] = -1024160026;
        nd.hlbs[1069] = -1842486982;
        nd.hlbs[1070] = 700543594;
        nd.hlbs[1071] = 75748662;
        nd.hlbs[1072] = 1100368698;
        nd.hlbs[1073] = -1117156132;
        nd.hlbs[1074] = 1066848287;
        nd.hlbs[1075] = 1604757390;
        nd.hlbs[1076] = 78452610;
        nd.hlbs[1077] = 542397975;
        nd.hlbs[1078] = 1890608204;
        nd.hlbs[1079] = -1220153252;
        nd.hlbs[1080] = -793663175;
        nd.hlbs[1081] = -1712946810;
        nd.hlbs[1082] = 1395372713;
        nd.hlbs[1083] = 775433445;
        nd.hlbs[1084] = -1943674113;
        nd.hlbs[1085] = 1904607109;
        nd.hlbs[1086] = 490001789;
        nd.hlbs[1087] = 818954957;
        nd.hlbs[1088] = 1112434586;
        nd.hlbs[1089] = 720707081;
        nd.hlbs[1090] = -1125246572;
        nd.hlbs[1091] = 2037329270;
        nd.hlbs[1092] = 1276486687;
        nd.hlbs[1093] = -1966641801;
        nd.hlbs[1094] = -582894740;
        nd.hlbs[1095] = 2117027393;
        nd.hlbs[1096] = 739681889;
        nd.hlbs[1097] = -1039290967;
        nd.hlbs[1098] = -1380942570;
        nd.hlbs[1099] = 160781876;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int colorForTextWhite$() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnlz", hlbj(int ), (int)347)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nd.hlbm("hnma", hlbr(int ), (int)818)) break;
            v0 /* !! */  = (long)nd.hlbm("hnmb", hlbr(int ), (int)819);
        }
        var2 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl11
        block20: while (true) {
            v1 /* !! */  = (long)(nd.hlbm("hnmd", hlbj(int ), (int)349) - nd.hlbm("hnmc", hlbj(int ), (int)348));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -575227083: {
                    continue block20;
                }
                case 1076290759: {
                    break block20;
                }
            }
            break;
        }
        var1_1 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl21
        block21: while (true) {
            v2 /* !! */  = (long)(nd.hlbm("hnmf", hlbj(int ), (int)351) - nd.hlbm("hnme", hlbj(int ), (int)350));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 548904321: {
                    continue block21;
                }
                case 1076290759: {
                    break block21;
                }
            }
            break;
        }
        var0_2 = nd.a;
        if (var2) {
            throw null;
lbl29:
            // 2 sources

            return (int)nd.hlbm("hnmg", hlbr(int ), (int)820);
        }
        if (var0_2) ** GOTO lbl29
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                v3 /* !! */  = nd.oo;
                if (true) ** GOTO lbl40
                block23: while (true) {
                    v3 /* !! */  = (long)(v4 - nd.hlbm("hnmh", hlbj(int ), (int)352));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1448066748: {
                            v4 = nd.hlbm("hnmi", hlbj(int ), (int)353);
                            continue block23;
                        }
                        case 1076290759: {
                            break block23;
                        }
                        case 2019418224: {
                            v4 = nd.hlbm("hnmj", hlbj(int ), (int)354);
                            continue block23;
                        }
                    }
                    break;
                }
                v5 = nd.hlbm("hnmk", hlbr(int ), (int)821);
                v6 = nd.hlbm("hnml", hlbr(int ), (int)822);
                v7 = nd.hlbm("hnmm", hlbr(int ), (int)823);
                v8 = nd.hlbm("hnmn", hlbr(int ), (int)824);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnmo", hlbj(int ), (int)355)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nd.hlbm("hnmp", hlbr(int ), (int)825)) break;
                    v9 /* !! */  = (long)nd.hlbm("hnmq", hlbr(int ), (int)826);
                }
                v10 = new Color((int)v5, (int)v6, (int)v7, (int)v8);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hnmr", hlbj(int ), (int)356)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nd.hlbm("hnms", hlbr(int ), (int)827)) break;
                    v11 /* !! */  = (long)nd.hlbm("hnmt", hlbr(int ), (int)828);
                }
                return v10.getRGB();
            }
lbl65:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)nd.hlbm("hnmu", hlbr(int ), (int)829);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)nd.hlbm("hnmv", hlbr(int ), (int)830);
                if (!var2) ** GOTO lbl65
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)nd.hlbm("hnmw", hlbr(int ), (int)831);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)nd.hlbm("hnmx", hlbr(int ), (int)832);
        ** while (!var2)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int colorForTextCustom$() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnmy", hlbj(int ), (int)357)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hnmz", hlbr(int ), (int)833)) break;
            v0 /* !! */  = (long)nd.hlbm("hnna", hlbr(int ), (int)834);
        }
        var2 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl12
        block25: while (true) {
            v1 /* !! */  = (long)(nd.hlbm("hnnc", hlbj(int ), (int)359) - nd.hlbm("hnnb", hlbj(int ), (int)358));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1686686129: {
                    continue block25;
                }
                case 1076290759: {
                    break block25;
                }
            }
            break;
        }
        var1_1 /* !! */  = nd.b;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(v3 - nd.hlbm("hnnd", hlbj(int ), (int)360));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1076290759: {
                    break block26;
                }
                case 1810943966: {
                    v3 = nd.hlbm("hnne", hlbj(int ), (int)361);
                    continue block26;
                }
                case 2003956520: {
                    v3 = nd.hlbm("hnnf", hlbj(int ), (int)362);
                    continue block26;
                }
            }
            break;
        }
        var0_2 = nd.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return (int)nd.hlbm("hnng", hlbr(int ), (int)835);
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnnh", hlbj(int ), (int)363)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nd.hlbm("hnni", hlbr(int ), (int)836)) break;
                    v4 /* !! */  = (long)nd.hlbm("hnnj", hlbr(int ), (int)837);
                }
                v5 = nd.hlbm("hnnk", hlbr(int ), (int)838);
                v6 = nd.hlbm("hnnl", hlbr(int ), (int)839);
                v7 = nd.hlbm("hnnm", hlbr(int ), (int)840);
                v8 = nd.hlbm("hnnn", hlbr(int ), (int)841);
                v9 /* !! */  = nd.oo;
                if (true) ** GOTO lbl54
                block29: while (true) {
                    v9 /* !! */  = (long)(nd.hlbm("hnnp", hlbj(int ), (int)365) - nd.hlbm("hnno", hlbj(int ), (int)364));
lbl54:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1520277150: {
                            continue block29;
                        }
                        case 1076290759: {
                            break block29;
                        }
                    }
                    break;
                }
                v10 = new Color((int)v5, (int)v6, (int)v7, (int)v8);
                v11 /* !! */  = nd.oo;
                if (true) ** GOTO lbl64
                block30: while (true) {
                    v11 /* !! */  = (long)(v12 - nd.hlbm("hnnq", hlbj(int ), (int)366));
lbl64:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -838038750: {
                            v12 = nd.hlbm("hnnr", hlbj(int ), (int)367);
                            continue block30;
                        }
                        case -348210706: {
                            v12 = nd.hlbm("hnns", hlbj(int ), (int)368);
                            continue block30;
                        }
                        case 1076290759: {
                            break block30;
                        }
                    }
                    break;
                }
                return v10.getRGB();
            }
            case 0: {
                var1_1 /* !! */  = (int)nd.hlbm("hnnt", hlbr(int ), (int)842);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                var1_1 /* !! */  = (int)nd.hlbm("hnnu", hlbr(int ), (int)843);
                if (var2) {
                    throw null;
                }
            }
lbl83:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)nd.hlbm("hnnv", hlbr(int ), (int)844);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)nd.hlbm("hnnw", hlbr(int ), (int)845);
        ** while (!var2)
lbl91:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int blend(int var0, int var1_1, float var2_2) {
        var17_3 = nd.c;
        var16_4 /* !! */  = nd.b;
        var15_5 = nd.a;
        if (var17_3) {
            throw null;
lbl6:
            // 14 sources

            return (int)nd.hlbm("hokt", hlbr(int ), (int)1203);
        }
        if (var15_5 || var15_5) ** GOTO lbl6
        var3_6 = var0 >> nd.hlbm("hoku", hlbr(int ), (int)1204) & nd.hlbm("hokv", hlbr(int ), (int)1205);
        if (var15_5) ** GOTO lbl6
        if (var16_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_5) ** GOTO lbl6
                var4_7 = var0 >> nd.hlbm("hokw", hlbr(int ), (int)1206) & nd.hlbm("hokx", hlbr(int ), (int)1207);
                if (var15_5 || var15_5) ** GOTO lbl6
                var5_8 = var0 >> nd.hlbm("hoky", hlbr(int ), (int)1208) & nd.hlbm("hokz", hlbr(int ), (int)1209);
                if (var15_5 || var15_5) ** GOTO lbl6
                var6_9 = var0 & nd.hlbm("hola", hlbr(int ), (int)1210);
                if (var15_5 || var15_5) ** GOTO lbl6
                var7_10 = var1_1 >> nd.hlbm("holb", hlbr(int ), (int)1211) & nd.hlbm("holc", hlbr(int ), (int)1212);
                if (var15_5 || var15_5) ** GOTO lbl6
                var8_11 = var1_1 >> nd.hlbm("hold", hlbr(int ), (int)1213) & nd.hlbm("hole", hlbr(int ), (int)1214);
                if (var15_5 || var15_5) ** GOTO lbl6
                var9_12 = var1_1 >> nd.hlbm("holf", hlbr(int ), (int)1215) & nd.hlbm("holg", hlbr(int ), (int)1216);
                if (var15_5 || var15_5) ** GOTO lbl6
                var10_13 = var1_1 & nd.hlbm("holh", hlbr(int ), (int)1217);
                if (var15_5 || var15_5) ** GOTO lbl6
                var11_14 = (int)((float)var3_6 + (float)(var7_10 - var3_6) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var12_15 = (int)((float)var4_7 + (float)(var8_11 - var4_7) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var13_16 = (int)((float)var5_8 + (float)(var9_12 - var5_8) * var2_2);
                if (var15_5 || var15_5) ** GOTO lbl6
                var14_17 = (int)((float)var6_9 + (float)(var10_13 - var6_9) * var2_2);
                if (!var15_5 && !var15_5) ** break;
                ** continue;
                return var11_14 << nd.hlbm("holi", hlbr(int ), (int)1218) | var12_15 << nd.hlbm("holj", hlbr(int ), (int)1219) | var13_16 << nd.hlbm("holk", hlbr(int ), (int)1220) | var14_17;
            }
lbl39:
            // 2 sources

            case 0: {
                var16_4 /* !! */  = (int)nd.hlbm("holl", hlbr(int ), (int)1221);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 1: {
                var16_4 /* !! */  = (int)nd.hlbm("holm", hlbr(int ), (int)1222);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl49:
            // 2 sources

            case 2: {
                do {
                    var16_4 /* !! */  = (int)nd.hlbm("holn", hlbr(int ), (int)1223);
                } while (!var17_3);
                throw null;
            }
lbl54:
            // 2 sources

            case 3: {
                var16_4 /* !! */  = (int)nd.hlbm("holo", hlbr(int ), (int)1224);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl59:
            // 2 sources

            case 4: {
                var16_4 /* !! */  = (int)nd.hlbm("holp", hlbr(int ), (int)1225);
                if (!var17_3) break;
                throw null;
            }
lbl63:
            // 2 sources

            case 5: {
                var16_4 /* !! */  = (int)nd.hlbm("holq", hlbr(int ), (int)1226);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl68:
            // 2 sources

            case 6: {
                var16_4 /* !! */  = (int)nd.hlbm("holr", hlbr(int ), (int)1227);
                if (!var17_3) ** GOTO lbl49
                throw null;
            }
            case 7: {
                var16_4 /* !! */  = (int)nd.hlbm("hols", hlbr(int ), (int)1228);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl77:
            // 2 sources

            case 8: {
                var16_4 /* !! */  = (int)nd.hlbm("holt", hlbr(int ), (int)1229);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 9: {
                var16_4 /* !! */  = (int)nd.hlbm("holu", hlbr(int ), (int)1230);
                if (!var17_3) break;
                throw null;
            }
            case 10: {
                var16_4 /* !! */  = (int)nd.hlbm("holv", hlbr(int ), (int)1231);
                if (!var17_3) ** GOTO lbl77
                throw null;
            }
lbl90:
            // 2 sources

            case 11: {
                var16_4 /* !! */  = (int)nd.hlbm("holw", hlbr(int ), (int)1232);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl95:
            // 2 sources

            case 12: {
                var16_4 /* !! */  = (int)nd.hlbm("holx", hlbr(int ), (int)1233);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl137
            }
            case 13: {
                var16_4 /* !! */  = (int)nd.hlbm("holy", hlbr(int ), (int)1234);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl118
            }
            case 14: {
                var16_4 /* !! */  = (int)nd.hlbm("holz", hlbr(int ), (int)1235);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 15: {
                var16_4 /* !! */  = (int)nd.hlbm("homa", hlbr(int ), (int)1236);
                if (!var17_3) break;
                throw null;
            }
lbl114:
            // 2 sources

            case 16: {
                var16_4 /* !! */  = (int)nd.hlbm("homb", hlbr(int ), (int)1237);
                if (!var17_3) ** GOTO lbl39
                throw null;
            }
lbl118:
            // 3 sources

            case 17: {
                var16_4 /* !! */  = (int)nd.hlbm("homc", hlbr(int ), (int)1238);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 18: {
                do {
                    var16_4 /* !! */  = (int)nd.hlbm("homf", hlbr(int ), (int)1239);
                } while (!var17_3);
                throw null;
            }
lbl128:
            // 2 sources

            case 19: {
                var16_4 /* !! */  = (int)nd.hlbm("homi", hlbr(int ), (int)1240);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl133:
            // 2 sources

            case 20: {
                var16_4 /* !! */  = (int)nd.hlbm("homl", hlbr(int ), (int)1241);
                if (!var17_3) ** GOTO lbl68
                throw null;
            }
lbl137:
            // 2 sources

            case 21: {
                var16_4 /* !! */  = (int)nd.hlbm("homo", hlbr(int ), (int)1242);
                if (!var17_3) ** GOTO lbl63
                throw null;
            }
lbl141:
            // 4 sources

            case 22: {
                var16_4 /* !! */  = (int)nd.hlbm("homq", hlbr(int ), (int)1243);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl146:
            // 2 sources

            case 23: {
                var16_4 /* !! */  = (int)nd.hlbm("homr", hlbr(int ), (int)1244);
                if (!var17_3) ** GOTO lbl59
                throw null;
            }
lbl150:
            // 3 sources

            case 24: {
                var16_4 /* !! */  = (int)nd.hlbm("homs", hlbr(int ), (int)1245);
                if (!var17_3) ** GOTO lbl118
                throw null;
            }
lbl154:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_4 /* !! */  = (int)nd.hlbm("homt", hlbr(int ), (int)1246);
                    if (!var17_3) ** GOTO lbl54
                    throw null;
                }
            }
            case 26: {
                var16_4 /* !! */  = (int)nd.hlbm("homx", hlbr(int ), (int)1247);
                if (!var17_3) ** GOTO lbl128
                throw null;
            }
            case 27: 
        }
        var16_4 /* !! */  = (int)nd.hlbm("hona", hlbr(int ), (int)1248);
        ** while (!var17_3)
lbl166:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hpnx() {
        nd.hlbt[800] = 575982310;
        nd.hlbt[801] = 1697696709;
        nd.hlbt[802] = 108643681;
        nd.hlbt[803] = -67161080;
        nd.hlbt[804] = -1412637252;
        nd.hlbt[805] = 77673882;
        nd.hlbt[806] = -83151957;
        nd.hlbt[807] = -1088811051;
        nd.hlbt[808] = 1484632439;
        nd.hlbt[809] = -1552307071;
        nd.hlbt[810] = -341291418;
        nd.hlbt[811] = -528835636;
        nd.hlbt[812] = -929855219;
        nd.hlbt[813] = 981991605;
        nd.hlbt[814] = -1682363861;
        nd.hlbt[815] = 654676622;
        nd.hlbt[816] = 441380375;
        nd.hlbt[817] = -289294378;
        nd.hlbt[818] = 635168323;
        nd.hlbt[819] = 127274189;
        nd.hlbt[820] = -1486784025;
        nd.hlbt[821] = -1820737912;
        nd.hlbt[822] = 293491383;
        nd.hlbt[823] = -131451883;
        nd.hlbt[824] = 1202281490;
        nd.hlbt[825] = -1054120417;
        nd.hlbt[826] = -72116140;
        nd.hlbt[827] = 1020957497;
        nd.hlbt[828] = -509229355;
        nd.hlbt[829] = 357392694;
        nd.hlbt[830] = 70505494;
        nd.hlbt[831] = -836313193;
        nd.hlbt[832] = -1260297296;
        nd.hlbt[833] = -1519705714;
        nd.hlbt[834] = 1385846254;
        nd.hlbt[835] = 827347108;
        nd.hlbt[836] = 1472019646;
        nd.hlbt[837] = 108995334;
        nd.hlbt[838] = 156564122;
        nd.hlbt[839] = -1363931267;
        nd.hlbt[840] = 1316757552;
        nd.hlbt[841] = -365511136;
        nd.hlbt[842] = 1671669999;
        nd.hlbt[843] = 985513;
        nd.hlbt[844] = -747557237;
        nd.hlbt[845] = 845698493;
        nd.hlbt[846] = -10418435;
        nd.hlbt[847] = 1488387037;
        nd.hlbt[848] = -1823679113;
        nd.hlbt[849] = -1126124739;
        nd.hlbt[850] = -1145993484;
        nd.hlbt[851] = -564169384;
        nd.hlbt[852] = 305900806;
        nd.hlbt[853] = -392748517;
        nd.hlbt[854] = 1476597258;
        nd.hlbt[855] = -452942135;
        nd.hlbt[856] = 1592915294;
        nd.hlbt[857] = 1709295695;
        nd.hlbt[858] = 2060539086;
        nd.hlbt[859] = 1990378687;
        nd.hlbt[860] = -841946940;
        nd.hlbt[861] = -1985648853;
        nd.hlbt[862] = 288839536;
        nd.hlbt[863] = 1909140525;
        nd.hlbt[864] = 514985032;
        nd.hlbt[865] = -114106352;
        nd.hlbt[866] = 1575428583;
        nd.hlbt[867] = -1765879837;
        nd.hlbt[868] = 263085904;
        nd.hlbt[869] = 1885291663;
        nd.hlbt[870] = -1954629438;
        nd.hlbt[871] = 1797419069;
        nd.hlbt[872] = -1786091911;
        nd.hlbt[873] = -477875141;
        nd.hlbt[874] = 1884187870;
        nd.hlbt[875] = -1004648234;
        nd.hlbt[876] = -739527922;
        nd.hlbt[877] = 1052860593;
        nd.hlbt[878] = -464115016;
        nd.hlbt[879] = 895228869;
        nd.hlbt[880] = -150395859;
        nd.hlbt[881] = 1488177758;
        nd.hlbt[882] = 2145472206;
        nd.hlbt[883] = -726227501;
        nd.hlbt[884] = -1568347944;
        nd.hlbt[885] = 862185614;
        nd.hlbt[886] = 1381889440;
        nd.hlbt[887] = -1380036559;
        nd.hlbt[888] = -1876175818;
        nd.hlbt[889] = -936183334;
        nd.hlbt[890] = 54355715;
        nd.hlbt[891] = -605263195;
        nd.hlbt[892] = -412925336;
        nd.hlbt[893] = -825080131;
        nd.hlbt[894] = -1283243589;
        nd.hlbt[895] = 1989015705;
        nd.hlbt[896] = -331454691;
        nd.hlbt[897] = -665336233;
        nd.hlbt[898] = 937693688;
        nd.hlbt[899] = -1465513645;
    }

    private static /* synthetic */ void hplk() {
        nd.hlbs[700] = 434848890;
        nd.hlbs[701] = -2085758685;
        nd.hlbs[702] = 968299838;
        nd.hlbs[703] = -279935054;
        nd.hlbs[704] = 118335922;
        nd.hlbs[705] = -867648092;
        nd.hlbs[706] = -1084757741;
        nd.hlbs[707] = 793816477;
        nd.hlbs[708] = 319121387;
        nd.hlbs[709] = -1486073490;
        nd.hlbs[710] = -644414301;
        nd.hlbs[711] = -603945334;
        nd.hlbs[712] = -272995747;
        nd.hlbs[713] = 466868694;
        nd.hlbs[714] = -181055989;
        nd.hlbs[715] = -860743892;
        nd.hlbs[716] = 550885772;
        nd.hlbs[717] = -486635280;
        nd.hlbs[718] = -140730553;
        nd.hlbs[719] = -1270461726;
        nd.hlbs[720] = -1069173358;
        nd.hlbs[721] = -2079195148;
        nd.hlbs[722] = 1148828074;
        nd.hlbs[723] = -1381778804;
        nd.hlbs[724] = -427159528;
        nd.hlbs[725] = -1398275291;
        nd.hlbs[726] = 2085424384;
        nd.hlbs[727] = 1289464931;
        nd.hlbs[728] = -968236351;
        nd.hlbs[729] = -2097556747;
        nd.hlbs[730] = 1457970861;
        nd.hlbs[731] = -1109374469;
        nd.hlbs[732] = 2040422388;
        nd.hlbs[733] = 575275614;
        nd.hlbs[734] = 552951719;
        nd.hlbs[735] = -1685034823;
        nd.hlbs[736] = 1543089452;
        nd.hlbs[737] = -963194163;
        nd.hlbs[738] = -827503976;
        nd.hlbs[739] = 1734589547;
        nd.hlbs[740] = -270367188;
        nd.hlbs[741] = -264941461;
        nd.hlbs[742] = 58925819;
        nd.hlbs[743] = -2000112219;
        nd.hlbs[744] = -1325589826;
        nd.hlbs[745] = -917019752;
        nd.hlbs[746] = -836039665;
        nd.hlbs[747] = -1714881825;
        nd.hlbs[748] = -1068055769;
        nd.hlbs[749] = 1077852622;
        nd.hlbs[750] = -1052343527;
        nd.hlbs[751] = 859695900;
        nd.hlbs[752] = -1951340648;
        nd.hlbs[753] = 1779544540;
        nd.hlbs[754] = 1369858177;
        nd.hlbs[755] = 938854601;
        nd.hlbs[756] = 715187307;
        nd.hlbs[757] = -2138526895;
        nd.hlbs[758] = 1287789487;
        nd.hlbs[759] = -779566846;
        nd.hlbs[760] = 1370724202;
        nd.hlbs[761] = -1889801981;
        nd.hlbs[762] = -1987294355;
        nd.hlbs[763] = 1433717408;
        nd.hlbs[764] = 1379960283;
        nd.hlbs[765] = 217161341;
        nd.hlbs[766] = 2001678103;
        nd.hlbs[767] = -50798094;
        nd.hlbs[768] = -248207782;
        nd.hlbs[769] = 1174216950;
        nd.hlbs[770] = -1143456429;
        nd.hlbs[771] = -1107014374;
        nd.hlbs[772] = 977718504;
        nd.hlbs[773] = 1857587282;
        nd.hlbs[774] = -1493515032;
        nd.hlbs[775] = 260337389;
        nd.hlbs[776] = -912422941;
        nd.hlbs[777] = -678569311;
        nd.hlbs[778] = -1391663711;
        nd.hlbs[779] = -2069363551;
        nd.hlbs[780] = -930046823;
        nd.hlbs[781] = 2032808210;
        nd.hlbs[782] = 119919242;
        nd.hlbs[783] = -220008398;
        nd.hlbs[784] = -898590205;
        nd.hlbs[785] = -64165934;
        nd.hlbs[786] = 1016597523;
        nd.hlbs[787] = 1483453259;
        nd.hlbs[788] = -1114684805;
        nd.hlbs[789] = -1265957588;
        nd.hlbs[790] = 1332388887;
        nd.hlbs[791] = -369323507;
        nd.hlbs[792] = 1331801790;
        nd.hlbs[793] = -1527942018;
        nd.hlbs[794] = -967972084;
        nd.hlbs[795] = -494944622;
        nd.hlbs[796] = 1782474446;
        nd.hlbs[797] = -889189589;
        nd.hlbs[798] = 347850987;
        nd.hlbs[799] = -227311203;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] rainbow8(int var0) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hohg", hlbj(int ), (int)568));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -373266301: {
                    v1 = nd.hlbm("hohh", hlbj(int ), (int)569);
                    continue block39;
                }
                case 1076290759: {
                    break block39;
                }
                case 2041292495: {
                    v1 = nd.hlbm("hohi", hlbj(int ), (int)570);
                    continue block39;
                }
            }
            break;
        }
        var3_1 = nd.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hohj", hlbj(int ), (int)571)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hohk", hlbr(int ), (int)1150)) break;
            v2 /* !! */  = (long)nd.hlbm("hohl", hlbr(int ), (int)1151);
        }
        var2_2 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl26
        block41: while (true) {
            v3 /* !! */  = (long)(nd.hlbm("hohn", hlbj(int ), (int)573) - nd.hlbm("hohm", hlbj(int ), (int)572));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 124817121: {
                    continue block41;
                }
                case 1076290759: {
                    break block41;
                }
            }
            break;
        }
        var1_3 = nd.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 = new int[8];
                v5 = nd.hlbm("hoho", hlbr(int ), (int)1152);
                v6 = nd.hlbm("hohp", hlbr(int ), (int)1153);
                v7 = nd.hlbm("hohq", hlbr(int ), (int)1154);
                v8 = nd.hlbm("hohr", hlbr(int ), (int)1155);
                v9 /* !! */  = nd.oo;
                if (true) ** GOTO lbl50
                block43: while (true) {
                    v9 /* !! */  = (long)(v10 - nd.hlbm("hohs", hlbj(int ), (int)574));
lbl50:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2112914212: {
                            v10 = nd.hlbm("hoht", hlbj(int ), (int)575);
                            continue block43;
                        }
                        case 1076290759: {
                            break block43;
                        }
                        case 1261000524: {
                            v10 = nd.hlbm("hohu", hlbj(int ), (int)576);
                            continue block43;
                        }
                    }
                    break;
                }
                v4[v5] = nd.rgba((int)v6, (int)v7, (int)v8, var0);
                v11 = nd.hlbm("hohv", hlbr(int ), (int)1156);
                v12 = nd.hlbm("hohw", hlbr(int ), (int)1157);
                v13 = nd.hlbm("hohx", hlbr(int ), (int)1158);
                v14 = nd.hlbm("hohy", hlbr(int ), (int)1159);
                v15 /* !! */  = nd.oo;
                if (true) ** GOTO lbl68
                block44: while (true) {
                    v15 /* !! */  = (long)(v16 - nd.hlbm("hohz", hlbj(int ), (int)577));
lbl68:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 1076290759: {
                            break block44;
                        }
                        case 1643080044: {
                            v16 = nd.hlbm("hoia", hlbj(int ), (int)578);
                            continue block44;
                        }
                        case 1940463344: {
                            v16 = nd.hlbm("hoib", hlbj(int ), (int)579);
                            continue block44;
                        }
                        case 2139037101: {
                            v16 = nd.hlbm("hoic", hlbj(int ), (int)580);
                            continue block44;
                        }
                    }
                    break;
                }
                v4[v11] = nd.rgba((int)v12, (int)v13, (int)v14, var0);
                v17 = nd.hlbm("hoid", hlbr(int ), (int)1160);
                v18 = nd.hlbm("hoie", hlbr(int ), (int)1161);
                v19 = nd.hlbm("hoif", hlbr(int ), (int)1162);
                v20 = nd.hlbm("hoig", hlbr(int ), (int)1163);
                v21 /* !! */  = nd.oo;
                if (true) ** GOTO lbl89
                block45: while (true) {
                    v21 /* !! */  = (long)(nd.hlbm("hoii", hlbj(int ), (int)582) - nd.hlbm("hoih", hlbj(int ), (int)581));
lbl89:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -239852594: {
                            continue block45;
                        }
                        case 1076290759: {
                            break block45;
                        }
                    }
                    break;
                }
                v4[v17] = nd.rgba((int)v18, (int)v19, (int)v20, var0);
                v22 = nd.hlbm("hoij", hlbr(int ), (int)1164);
                v23 = nd.hlbm("hoik", hlbr(int ), (int)1165);
                v24 = nd.hlbm("hoil", hlbr(int ), (int)1166);
                v25 = nd.hlbm("hoim", hlbr(int ), (int)1167);
                v26 /* !! */  = nd.oo;
                if (true) ** GOTO lbl103
                block46: while (true) {
                    v26 /* !! */  = (long)(v27 - nd.hlbm("hoin", hlbj(int ), (int)583));
lbl103:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1885698074: {
                            v27 = nd.hlbm("hoio", hlbj(int ), (int)584);
                            continue block46;
                        }
                        case -12895540: {
                            v27 = nd.hlbm("hoip", hlbj(int ), (int)585);
                            continue block46;
                        }
                        case 1076290759: {
                            break block46;
                        }
                    }
                    break;
                }
                v4[v22] = nd.rgba((int)v23, (int)v24, (int)v25, var0);
                v28 = nd.hlbm("hoiq", hlbr(int ), (int)1168);
                v29 = nd.hlbm("hoir", hlbr(int ), (int)1169);
                v30 = nd.hlbm("hois", hlbr(int ), (int)1170);
                v31 = nd.hlbm("hoit", hlbr(int ), (int)1171);
                while (true) {
                    if ((v32 = (cfr_temp_1 = nd.oo - nd.hlbm("hoiu", hlbj(int ), (int)586)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v32 == nd.hlbm("hoiv", hlbr(int ), (int)1172)) break;
                    v32 = 327256545;
                }
                v4[v28] = nd.rgba((int)v29, (int)v30, (int)v31, var0);
                v33 = nd.hlbm("hoiw", hlbr(int ), (int)1173);
                v34 = nd.hlbm("hoix", hlbr(int ), (int)1174);
                v35 = nd.hlbm("hoiy", hlbr(int ), (int)1175);
                v36 = nd.hlbm("hoiz", hlbr(int ), (int)1176);
                v37 /* !! */  = nd.oo;
                if (true) ** GOTO lbl132
                block48: while (true) {
                    v37 /* !! */  = (long)(nd.hlbm("hojb", hlbj(int ), (int)588) - nd.hlbm("hoja", hlbj(int ), (int)587));
lbl132:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case 24768921: {
                            continue block48;
                        }
                        case 1076290759: {
                            break block48;
                        }
                    }
                    break;
                }
                v4[v33] = nd.rgba((int)v34, (int)v35, (int)v36, var0);
                v38 = nd.hlbm("hojc", hlbr(int ), (int)1177);
                v39 = nd.hlbm("hojd", hlbr(int ), (int)1178);
                v40 = nd.hlbm("hoje", hlbr(int ), (int)1179);
                v41 = nd.hlbm("hojf", hlbr(int ), (int)1180);
                while (true) {
                    if ((v42 = (cfr_temp_2 = nd.oo - nd.hlbm("hojg", hlbj(int ), (int)589)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v42 == nd.hlbm("hojh", hlbr(int ), (int)1181)) break;
                    v42 = 185137802;
                }
                v4[v38] = nd.rgba((int)v39, (int)v40, (int)v41, var0);
                v43 = nd.hlbm("hoji", hlbr(int ), (int)1182);
                v44 = nd.hlbm("hojj", hlbr(int ), (int)1183);
                v45 = nd.hlbm("hojk", hlbr(int ), (int)1184);
                v46 = nd.hlbm("hojl", hlbr(int ), (int)1185);
                while (true) {
                    if ((v47 = (cfr_temp_3 = nd.oo - nd.hlbm("hojm", hlbj(int ), (int)590)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v47 == nd.hlbm("hojn", hlbr(int ), (int)1186)) break;
                    v47 = 761968822;
                }
                v4[v43] = nd.rgba((int)v44, (int)v45, (int)v46, var0);
                return v4;
            }
            case 0: {
                var2_2 /* !! */  = (int)nd.hlbm("hojo", hlbr(int ), (int)1187);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)nd.hlbm("hojp", hlbr(int ), (int)1188);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nd.hlbm("hojq", hlbr(int ), (int)1189);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nd.hlbm("hojr", hlbr(int ), (int)1190);
        ** while (!var3_1)
lbl177:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int replAlpha(int var0, int var1_1) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hlke", hlbj(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1212266529: {
                    v1 = nd.hlbm("hlkf", hlbj(int ), (int)19);
                    continue block30;
                }
                case 1076290759: {
                    break block30;
                }
                case 2111495076: {
                    v1 = nd.hlbm("hlkg", hlbj(int ), (int)20);
                    continue block30;
                }
            }
            break;
        }
        var4_2 = nd.c;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl19
        block31: while (true) {
            v2 /* !! */  = (long)(nd.hlbm("hlkj", hlbj(int ), (int)22) - nd.hlbm("hlkh", hlbj(int ), (int)21));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -785326044: {
                    continue block31;
                }
                case 1076290759: {
                    break block31;
                }
            }
            break;
        }
        var3_3 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl29
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hlkk", hlbj(int ), (int)23));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 595042298: {
                    v4 = nd.hlbm("hlkl", hlbj(int ), (int)24);
                    continue block32;
                }
                case 1076290759: {
                    break block32;
                }
                case 1214910425: {
                    v4 = nd.hlbm("hlkm", hlbj(int ), (int)25);
                    continue block32;
                }
            }
            break;
        }
        var2_4 = nd.a;
        if (var4_2) {
            throw null;
lbl41:
            // 2 sources

            return (int)nd.hlbm("hlkn", hlbr(int ), (int)20);
        }
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hlko", hlbj(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nd.hlbm("hlkp", hlbr(int ), (int)21)) break;
                    v5 /* !! */  = (long)nd.hlbm("hlkr", hlbr(int ), (int)22);
                }
                v6 = nd.red(var0);
                v7 /* !! */  = nd.oo;
                if (true) ** GOTO lbl58
                block35: while (true) {
                    v7 /* !! */  = (long)(v8 - nd.hlbm("hlks", hlbj(int ), (int)27));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 379743411: {
                            v8 = nd.hlbm("hlkt", hlbj(int ), (int)28);
                            continue block35;
                        }
                        case 486729380: {
                            v8 = nd.hlbm("hlku", hlbj(int ), (int)29);
                            continue block35;
                        }
                        case 1076290759: {
                            break block35;
                        }
                    }
                    break;
                }
                v9 = nd.green(var0);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hlkv", hlbj(int ), (int)30)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nd.hlbm("hlkw", hlbr(int ), (int)23)) break;
                    v10 /* !! */  = (long)nd.hlbm("hlkx", hlbr(int ), (int)24);
                }
                v11 = nd.blue(var0);
                v12 /* !! */  = nd.oo;
                if (true) ** GOTO lbl78
                block37: while (true) {
                    v12 /* !! */  = (long)(v13 - nd.hlbm("hlky", hlbj(int ), (int)31));
lbl78:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -60061739: {
                            v13 = nd.hlbm("hlkz", hlbj(int ), (int)32);
                            continue block37;
                        }
                        case 1076290759: {
                            break block37;
                        }
                        case 1704964592: {
                            v13 = nd.hlbm("hllb", hlbj(int ), (int)33);
                            continue block37;
                        }
                    }
                    break;
                }
                return nd.getColor(v6, v9, v11, var1_1);
            }
lbl88:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nd.hlbm("hlld", hlbr(int ), (int)25);
                    if (!var4_2) break block14;
                    throw null;
                }
            }
lbl93:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)nd.hlbm("hlle", hlbr(int ), (int)26);
                if (!var4_2) ** GOTO lbl88
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)nd.hlbm("hllf", hlbr(int ), (int)27);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)nd.hlbm("hllg", hlbr(int ), (int)28);
        ** while (!var4_2)
lbl104:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int multiplyAlpha(int var0, float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hopv", hlbj(int ), (int)617)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nd.hlbm("hopx", hlbr(int ), (int)1270)) break;
            v0 /* !! */  = (long)nd.hlbm("hopy", hlbr(int ), (int)1271);
        }
        var6_2 = nd.c;
        v1 /* !! */  = nd.oo;
        if (true) ** GOTO lbl12
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - nd.hlbm("hopz", hlbj(int ), (int)618));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -671621596: {
                    v2 = nd.hlbm("hoqa", hlbj(int ), (int)619);
                    continue block34;
                }
                case 126197595: {
                    v2 = nd.hlbm("hoqc", hlbj(int ), (int)620);
                    continue block34;
                }
                case 1076290759: {
                    break block34;
                }
                case 1108557462: {
                    v2 = nd.hlbm("hoqe", hlbj(int ), (int)621);
                    continue block34;
                }
            }
            break;
        }
        var5_3 /* !! */  = nd.b;
        v3 /* !! */  = nd.oo;
        if (true) ** GOTO lbl29
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - nd.hlbm("hoqg", hlbj(int ), (int)622));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -969956826: {
                    v4 = nd.hlbm("hoqi", hlbj(int ), (int)623);
                    continue block35;
                }
                case 1076290759: {
                    break block35;
                }
                case 1572782365: {
                    v4 = nd.hlbm("hoqk", hlbj(int ), (int)624);
                    continue block35;
                }
            }
            break;
        }
        var4_4 = nd.a;
        if (var6_2) {
            throw null;
lbl41:
            // 5 sources

            return (int)nd.hlbm("hoql", hlbr(int ), (int)1272);
        }
        if (var4_4 || var4_4) ** GOTO lbl41
        var2_5 = var0 >> nd.hlbm("hoqm", hlbr(int ), (int)1273) & nd.hlbm("hoqo", hlbr(int ), (int)1274);
        if (var4_4 || var4_4) ** GOTO lbl41
        var3_6 = (int)((float)var2_5 * var1_1);
        if (var4_4 || var4_4) ** GOTO lbl41
        v5 = nd.hlbm("hoqr", hlbr(int ), (int)1275);
        v6 = nd.hlbm("hoqt", hlbr(int ), (int)1276);
        v7 /* !! */  = nd.oo;
        if (true) ** GOTO lbl54
        block37: while (true) {
            v7 /* !! */  = (long)(v8 - nd.hlbm("hoqv", hlbj(int ), (int)625));
lbl54:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 278525294: {
                    v8 = nd.hlbm("hoqx", hlbj(int ), (int)626);
                    continue block37;
                }
                case 1076290759: {
                    break block37;
                }
                case 1391253111: {
                    v8 = nd.hlbm("hoqz", hlbj(int ), (int)627);
                    continue block37;
                }
                case 1402854222: {
                    v8 = nd.hlbm("horb", hlbj(int ), (int)628);
                    continue block37;
                }
            }
            break;
        }
        v9 = Math.min((int)v6, var3_6);
        v10 /* !! */  = nd.oo;
        if (true) ** GOTO lbl71
        block38: while (true) {
            v10 /* !! */  = (long)(nd.hlbm("horf", hlbj(int ), (int)630) - nd.hlbm("hord", hlbj(int ), (int)629));
lbl71:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case 243550528: {
                    continue block38;
                }
                case 1076290759: {
                    break block38;
                }
            }
            break;
        }
        var3_6 = Math.max((int)v5, v9);
        if (var4_4) ** GOTO lbl41
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_4) ** break;
                ** continue;
                return var3_6 << nd.hlbm("hori", hlbr(int ), (int)1277) | var0 & nd.hlbm("hork", hlbr(int ), (int)1278);
            }
            case 0: {
                var5_3 /* !! */  = (int)nd.hlbm("horm", hlbr(int ), (int)1279);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl89:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)nd.hlbm("horn", hlbr(int ), (int)1280);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl94:
            // 2 sources

            case 2: {
                do {
                    var5_3 /* !! */  = (int)nd.hlbm("horo", hlbr(int ), (int)1281);
                } while (!var6_2);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)nd.hlbm("horp", hlbr(int ), (int)1282);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl122
                    break;
                }
            }
            case 4: {
                var5_3 /* !! */  = (int)nd.hlbm("horq", hlbr(int ), (int)1283);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 5: {
                var5_3 /* !! */  = (int)nd.hlbm("horr", hlbr(int ), (int)1284);
                if (!var6_2) ** GOTO lbl94
                throw null;
            }
            case 6: {
                var5_3 /* !! */  = (int)nd.hlbm("hors", hlbr(int ), (int)1285);
                if (!var6_2) break;
                throw null;
            }
lbl118:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)nd.hlbm("hort", hlbr(int ), (int)1286);
                if (var6_2) {
                    throw null;
                }
            }
lbl122:
            // 6 sources

            case 8: {
                var5_3 /* !! */  = (int)nd.hlbm("horu", hlbr(int ), (int)1287);
                if (!var6_2) ** GOTO lbl89
                throw null;
            }
            case 9: 
        }
        var5_3 /* !! */  = (int)nd.hlbm("horv", hlbr(int ), (int)1288);
        ** while (!var6_2)
lbl129:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] vertical(int var0, int var1_1) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - nd.hlbm("hnyv", hlbj(int ), (int)469));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1703710929: {
                    v1 = nd.hlbm("hnyw", hlbj(int ), (int)470);
                    continue block15;
                }
                case -1140133399: {
                    v1 = nd.hlbm("hnyx", hlbj(int ), (int)471);
                    continue block15;
                }
                case 47372839: {
                    v1 = nd.hlbm("hnyy", hlbj(int ), (int)472);
                    continue block15;
                }
                case 1076290759: {
                    break block15;
                }
            }
            break;
        }
        var4_2 = nd.c;
        v2 /* !! */  = nd.oo;
        if (true) ** GOTO lbl22
        block16: while (true) {
            v2 /* !! */  = (long)(nd.hlbm("hnza", hlbj(int ), (int)474) - nd.hlbm("hnyz", hlbj(int ), (int)473));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1700960633: {
                    continue block16;
                }
                case 1076290759: {
                    break block16;
                }
            }
            break;
        }
        var3_3 = nd.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnzb", hlbj(int ), (int)475)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == nd.hlbm("hnzc", hlbr(int ), (int)1030)) break;
            v3 /* !! */  = (long)nd.hlbm("hnzd", hlbr(int ), (int)1031);
        }
        var2_4 = nd.a;
        if (var4_2) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl40:
        // 1 sources

        v4 = new int[9];
        v4[0] = var0;
        v4[1] = var0;
        v4[2] = var0;
        v5 = nd.hlbm("hnze", hlbr(int ), (int)1032);
        v6 = nd.hlbm("hnzf", hlzk(int ), (int)1033);
        while (true) {
            if ((v7 = (cfr_temp_1 = nd.oo - nd.hlbm("hnzg", hlbj(int ), (int)476)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 == nd.hlbm("hnzh", hlbr(int ), (int)1034)) break;
            v7 = 249948154;
        }
        v4[v5] = nd.blend(var0, var1_1, (float)v6);
        v8 = nd.hlbm("hnzi", hlbr(int ), (int)1035);
        v9 = nd.hlbm("hnzj", hlzk(int ), (int)1036);
        while (true) {
            if ((v10 = (cfr_temp_2 = nd.oo - nd.hlbm("hnzk", hlbj(int ), (int)477)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 == nd.hlbm("hnzl", hlbr(int ), (int)1037)) break;
            v10 = -1465480437;
        }
        v4[v8] = nd.blend(var0, var1_1, (float)v9);
        v11 = nd.hlbm("hnzm", hlbr(int ), (int)1038);
        v12 = nd.hlbm("hnzn", hlzk(int ), (int)1039);
        v13 /* !! */  = nd.oo;
        if (true) ** GOTO lbl68
        block21: while (true) {
            v13 /* !! */  = (long)(v14 - nd.hlbm("hnzo", hlbj(int ), (int)478));
lbl68:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1033035688: {
                    v14 = nd.hlbm("hnzp", hlbj(int ), (int)479);
                    continue block21;
                }
                case 1076290759: {
                    break block21;
                }
                case 1674462944: {
                    v14 = nd.hlbm("hnzq", hlbj(int ), (int)480);
                    continue block21;
                }
            }
            break;
        }
        v4[v11] = nd.blend(var0, var1_1, (float)v12);
        v4[6] = var1_1;
        v4[7] = var1_1;
        v4[8] = var1_1;
        return v4;
    }

    private static /* synthetic */ void hplo() {
        nd.hlbs[1100] = -470795600;
        nd.hlbs[1101] = 1354483639;
        nd.hlbs[1102] = -1540507749;
        nd.hlbs[1103] = 1740801286;
        nd.hlbs[1104] = -1427984201;
        nd.hlbs[1105] = 376101820;
        nd.hlbs[1106] = 1179778337;
        nd.hlbs[1107] = -779486416;
        nd.hlbs[1108] = -247864421;
        nd.hlbs[1109] = -1291895938;
        nd.hlbs[1110] = -1521754896;
        nd.hlbs[1111] = -1070792790;
        nd.hlbs[1112] = 665183746;
        nd.hlbs[1113] = -2032774728;
        nd.hlbs[1114] = 1373252800;
        nd.hlbs[1115] = -1183151421;
        nd.hlbs[1116] = 1448114849;
        nd.hlbs[1117] = 1196929096;
        nd.hlbs[1118] = -749111074;
        nd.hlbs[1119] = -1240020066;
        nd.hlbs[1120] = 1082971898;
        nd.hlbs[1121] = 26705230;
        nd.hlbs[1122] = 1148347526;
        nd.hlbs[1123] = 1850369573;
        nd.hlbs[1124] = -611329317;
        nd.hlbs[1125] = 1233336258;
        nd.hlbs[1126] = -114063002;
        nd.hlbs[1127] = 79658777;
        nd.hlbs[1128] = 654047006;
        nd.hlbs[1129] = 530210705;
        nd.hlbs[1130] = -127259895;
        nd.hlbs[1131] = 681228009;
        nd.hlbs[1132] = 1897454685;
        nd.hlbs[1133] = -1380709130;
        nd.hlbs[1134] = -38684918;
        nd.hlbs[1135] = 659580540;
        nd.hlbs[1136] = 1758962054;
        nd.hlbs[1137] = 1477878070;
        nd.hlbs[1138] = -1464373513;
        nd.hlbs[1139] = -1213659194;
        nd.hlbs[1140] = -1894684835;
        nd.hlbs[1141] = 1682113076;
        nd.hlbs[1142] = 1749053507;
        nd.hlbs[1143] = 1853978588;
        nd.hlbs[1144] = 1326663733;
        nd.hlbs[1145] = 1483093399;
        nd.hlbs[1146] = 1121689116;
        nd.hlbs[1147] = -1042993868;
        nd.hlbs[1148] = 1048557618;
        nd.hlbs[1149] = -545621364;
        nd.hlbs[1150] = -1013868151;
        nd.hlbs[1151] = 459909843;
        nd.hlbs[1152] = -1759105788;
        nd.hlbs[1153] = 1851749124;
        nd.hlbs[1154] = -591295362;
        nd.hlbs[1155] = 1806091419;
        nd.hlbs[1156] = 1291642189;
        nd.hlbs[1157] = 2062503431;
        nd.hlbs[1158] = 833459685;
        nd.hlbs[1159] = 501751164;
        nd.hlbs[1160] = -583601626;
        nd.hlbs[1161] = -1937975957;
        nd.hlbs[1162] = 2035269037;
        nd.hlbs[1163] = -617602150;
        nd.hlbs[1164] = -1431078241;
        nd.hlbs[1165] = 419143011;
        nd.hlbs[1166] = 301823724;
        nd.hlbs[1167] = 1658820126;
        nd.hlbs[1168] = -1078907038;
        nd.hlbs[1169] = -95531801;
        nd.hlbs[1170] = -1699890565;
        nd.hlbs[1171] = 281222323;
        nd.hlbs[1172] = -962728514;
        nd.hlbs[1173] = 1057298280;
        nd.hlbs[1174] = 864341359;
        nd.hlbs[1175] = -1575883618;
        nd.hlbs[1176] = -215560573;
        nd.hlbs[1177] = -790349010;
        nd.hlbs[1178] = 1879505190;
        nd.hlbs[1179] = 1035886906;
        nd.hlbs[1180] = 794207533;
        nd.hlbs[1181] = 1483260343;
        nd.hlbs[1182] = 2132527190;
        nd.hlbs[1183] = -727696750;
        nd.hlbs[1184] = -1665702186;
        nd.hlbs[1185] = 1160175385;
        nd.hlbs[1186] = -994631426;
        nd.hlbs[1187] = 170032738;
        nd.hlbs[1188] = 1208085332;
        nd.hlbs[1189] = 487475732;
        nd.hlbs[1190] = 693464223;
        nd.hlbs[1191] = 97157578;
        nd.hlbs[1192] = 150563714;
        nd.hlbs[1193] = 766850390;
        nd.hlbs[1194] = 546741369;
        nd.hlbs[1195] = -713256429;
        nd.hlbs[1196] = 575489706;
        nd.hlbs[1197] = -149344805;
        nd.hlbs[1198] = 952758865;
        nd.hlbs[1199] = 1464518136;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int[] vertical8(int var0, int var1_1) {
        block37: {
            v0 /* !! */  = nd.oo;
            if (true) ** GOTO lbl5
            block20: while (true) {
                v0 /* !! */  = (long)(v1 - nd.hlbm("hoey", hlbj(int ), (int)537));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1166743477: {
                        v1 = nd.hlbm("hoez", hlbj(int ), (int)538);
                        continue block20;
                    }
                    case -514436064: {
                        v1 = nd.hlbm("hofa", hlbj(int ), (int)539);
                        continue block20;
                    }
                    case 1076290759: {
                        break block20;
                    }
                    case 1874833896: {
                        v1 = nd.hlbm("hofb", hlbj(int ), (int)540);
                        continue block20;
                    }
                }
                break;
            }
            var5_2 = nd.c;
            v2 /* !! */  = nd.oo;
            if (true) ** GOTO lbl22
            block21: while (true) {
                v2 /* !! */  = (long)(v3 - nd.hlbm("hofc", hlbj(int ), (int)541));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2015751974: {
                        v3 = nd.hlbm("hofd", hlbj(int ), (int)542);
                        continue block21;
                    }
                    case 1076290759: {
                        break block21;
                    }
                    case 1146354302: {
                        v3 = nd.hlbm("hofe", hlbj(int ), (int)543);
                        continue block21;
                    }
                    case 1998938591: {
                        v3 = nd.hlbm("hoff", hlbj(int ), (int)544);
                        continue block21;
                    }
                }
                break;
            }
            var4_3 /* !! */  = nd.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hofg", hlbj(int ), (int)545)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == nd.hlbm("hofh", hlbr(int ), (int)1121)) {
                    var3_4 = nd.a;
                    if (var5_2) {
                        throw null;
                    }
                    break;
                }
                v4 /* !! */  = (long)nd.hlbm("hofi", hlbr(int ), (int)1122);
            }
            if (var3_4 || var3_4) return null;
            v5 = nd.hlbm("hofj", hlzk(int ), (int)1123);
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = nd.oo - nd.hlbm("hofk", hlbj(int ), (int)546)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == nd.hlbm("hofl", hlbr(int ), (int)1124)) {
                    var2_5 = nd.blend(var0, var1_1, (float)v5);
                    if (var3_4) return null;
                    break;
                }
                v6 /* !! */  = (long)nd.hlbm("hofm", hlbr(int ), (int)1125);
            }
            if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block24: do {
                switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var3_4) return new int[]{var0, var0, var0, var2_5, var1_1, var1_1, var1_1, var2_5};
                        return null;
                    }
                    case 0: {
                        var4_3 /* !! */  = (int)nd.hlbm("hofn", hlbr(int ), (int)1126);
                        cfr_temp_0 = 1;
                        if (!var5_2) continue block24;
                        throw null;
                    }
                    case 3: {
                        var4_3 /* !! */  = (int)nd.hlbm("hofq", hlbr(int ), (int)1129);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var4_3 /* !! */  = (int)nd.hlbm("hofr", hlbr(int ), (int)1130);
                        if (var5_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** break;
                    }
                    case 5: {
                        break block37;
                    }
lbl80:
                    // 2 sources

                    while (true) {
                        var4_3 /* !! */  = (int)nd.hlbm("hofo", hlbr(int ), (int)1127);
                        cfr_temp_0 = 2;
                        if (!var5_2) continue block24;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var4_3 /* !! */  = (int)nd.hlbm("hofp", hlbr(int ), (int)1128);
            if (!var5_2) ** break;
            throw null;
        }
        var4_3 /* !! */  = (int)nd.hlbm("hofs", hlbr(int ), (int)1131);
        ** while (!var5_2)
lbl94:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hpmq() {
        nd.hlbt[300] = -1207597971;
        nd.hlbt[301] = -584747445;
        nd.hlbt[302] = 2005528394;
        nd.hlbt[303] = 2097488116;
        nd.hlbt[304] = -72759937;
        nd.hlbt[305] = 458227367;
        nd.hlbt[306] = 1914658728;
        nd.hlbt[307] = 408981349;
        nd.hlbt[308] = -1587788782;
        nd.hlbt[309] = 1351801151;
        nd.hlbt[310] = -1611119466;
        nd.hlbt[311] = -1149967447;
        nd.hlbt[312] = -610589930;
        nd.hlbt[313] = 758564121;
        nd.hlbt[314] = 71950756;
        nd.hlbt[315] = 742668102;
        nd.hlbt[316] = -1909834080;
        nd.hlbt[317] = -24575811;
        nd.hlbt[318] = 1196804695;
        nd.hlbt[319] = 712771247;
        nd.hlbt[320] = 921817821;
        nd.hlbt[321] = 1620547611;
        nd.hlbt[322] = 398582847;
        nd.hlbt[323] = 909904840;
        nd.hlbt[324] = 581705284;
        nd.hlbt[325] = 1271540907;
        nd.hlbt[326] = -240781751;
        nd.hlbt[327] = 2031205545;
        nd.hlbt[328] = 1754166026;
        nd.hlbt[329] = -797140010;
        nd.hlbt[330] = 219306321;
        nd.hlbt[331] = 2019979938;
        nd.hlbt[332] = 1240296411;
        nd.hlbt[333] = 87238548;
        nd.hlbt[334] = 1442356731;
        nd.hlbt[335] = 1610251646;
        nd.hlbt[336] = 916666310;
        nd.hlbt[337] = 1800799573;
        nd.hlbt[338] = 1150827459;
        nd.hlbt[339] = -1947752692;
        nd.hlbt[340] = -2013646472;
        nd.hlbt[341] = -992184539;
        nd.hlbt[342] = -182543023;
        nd.hlbt[343] = -1739986214;
        nd.hlbt[344] = 558708140;
        nd.hlbt[345] = -785526006;
        nd.hlbt[346] = 1212882449;
        nd.hlbt[347] = -1185585597;
        nd.hlbt[348] = 1655860450;
        nd.hlbt[349] = 453057712;
        nd.hlbt[350] = 1255984387;
        nd.hlbt[351] = -712194900;
        nd.hlbt[352] = -31687602;
        nd.hlbt[353] = 1114248519;
        nd.hlbt[354] = -677836593;
        nd.hlbt[355] = -1388598262;
        nd.hlbt[356] = 1168724499;
        nd.hlbt[357] = 2009916844;
        nd.hlbt[358] = -317241060;
        nd.hlbt[359] = -359862874;
        nd.hlbt[360] = -510328656;
        nd.hlbt[361] = 207603398;
        nd.hlbt[362] = -1502631647;
        nd.hlbt[363] = -322142428;
        nd.hlbt[364] = -1464181318;
        nd.hlbt[365] = -1787540430;
        nd.hlbt[366] = 565118843;
        nd.hlbt[367] = 1809940417;
        nd.hlbt[368] = -1359849525;
        nd.hlbt[369] = -2026359518;
        nd.hlbt[370] = -372453567;
        nd.hlbt[371] = 520932827;
        nd.hlbt[372] = -868337734;
        nd.hlbt[373] = -331880574;
        nd.hlbt[374] = 285982293;
        nd.hlbt[375] = -1749225290;
        nd.hlbt[376] = -1514651380;
        nd.hlbt[377] = -420808357;
        nd.hlbt[378] = -42976004;
        nd.hlbt[379] = -1223665028;
        nd.hlbt[380] = 285828521;
        nd.hlbt[381] = -1942655876;
        nd.hlbt[382] = -1064559951;
        nd.hlbt[383] = 111888005;
        nd.hlbt[384] = -338034478;
        nd.hlbt[385] = -682721194;
        nd.hlbt[386] = -2021080011;
        nd.hlbt[387] = -870926375;
        nd.hlbt[388] = -845230766;
        nd.hlbt[389] = -1826079192;
        nd.hlbt[390] = 1834370794;
        nd.hlbt[391] = -1389208590;
        nd.hlbt[392] = 1652722419;
        nd.hlbt[393] = 427893595;
        nd.hlbt[394] = -2139703967;
        nd.hlbt[395] = -191146555;
        nd.hlbt[396] = -2059401421;
        nd.hlbt[397] = 1450937902;
        nd.hlbt[398] = -1253916367;
        nd.hlbt[399] = 42349827;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int[] solid(int var0) {
        v0 /* !! */  = nd.oo;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(nd.hlbm("hnhd", hlbj(int ), (int)293) - nd.hlbm("hnhc", hlbj(int ), (int)292));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1076290759: {
                    break block10;
                }
                case 1741470946: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = nd.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = nd.oo - nd.hlbm("hnhe", hlbj(int ), (int)294)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nd.hlbm("hnhf", hlbr(int ), (int)746)) break;
            v1 /* !! */  = (long)nd.hlbm("hnhg", hlbr(int ), (int)747);
        }
        var2_2 /* !! */  = nd.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nd.oo - nd.hlbm("hnhh", hlbj(int ), (int)295)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nd.hlbm("hnhi", hlbr(int ), (int)748)) break;
            v2 /* !! */  = (long)nd.hlbm("hnhj", hlbr(int ), (int)749);
        }
        var1_3 = nd.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block13;
                return new int[]{var0, var0, var0, var0, var0, var0, var0, var0, var0};
lbl33:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)nd.hlbm("hnhk", hlbr(int ), (int)750);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)nd.hlbm("hnhl", hlbr(int ), (int)751);
                        if (!var3_1) ** GOTO lbl33
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)nd.hlbm("hnhm", hlbr(int ), (int)752);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)nd.hlbm("hnhn", hlbr(int ), (int)753);
        ** while (!var3_1)
lbl50:
        // 1 sources

        throw null;
    }
}

