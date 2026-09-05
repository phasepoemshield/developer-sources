/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1802
 *  net.minecraft.class_1844
 *  net.minecraft.class_2246
 *  net.minecraft.class_2596
 *  net.minecraft.class_2868
 *  net.minecraft.class_2886
 *  net.minecraft.class_6880
 *  net.minecraft.class_7204
 *  net.minecraft.class_9334
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2246;
import net.minecraft.class_2596;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_6880;
import net.minecraft.class_7204;
import net.minecraft.class_9334;
import ruhack.phobia.aw;
import ruhack.phobia.da;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hg$PotionType;
import ruhack.phobia.hy;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.nn;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;
import ruhack.phobia.pr;

public class hg
extends ds {
    protected static final long ks = -8496700154207989978L;
    private final pr timer;
    private static int[] ejdx = new int[605];
    private int rotationTicks;
    private static long[] ejew;
    private final int ROTATION_WAIT_TICKS = 2;
    private final ke potions;
    private boolean isActivePotion;
    private int selectedSlot;
    public static final boolean c;
    private final float THROW_PITCH = 90.0f;
    public static final int b;
    private final kb autoOff;
    private static int[] ejdy;
    private boolean spoofed;
    public static final boolean a;
    private static long[] ejex;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ class_2596 lambda$throwPotion$0(int var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("engr", ejev(int ), (int)360)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hg.ejdz("engt", ejdw(int ), (int)592)) break;
            v0 /* !! */  = (long)hg.ejdz("engv", ejdw(int ), (int)593);
        }
        var4_2 = hg.c;
        v1 /* !! */  = hg.ks;
        if (true) ** GOTO lbl12
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - hg.ejdz("engx", ejev(int ), (int)361));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 695013158: {
                    break block24;
                }
                case 1090487772: {
                    v2 = hg.ejdz("engy", ejev(int ), (int)362);
                    continue block24;
                }
                case 1866160345: {
                    v2 = hg.ejdz("enhb", ejev(int ), (int)363);
                    continue block24;
                }
            }
            break;
        }
        var3_3 = hg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("enhd", ejev(int ), (int)364)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hg.ejdz("enhf", ejdw(int ), (int)594)) break;
            v3 /* !! */  = (long)hg.ejdz("enhg", ejdw(int ), (int)595);
        }
        var2_4 = hg.a;
        if (var4_2) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var2_4 || var2_4)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("enhj", ejev(int ), (int)365)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hg.ejdz("enhl", ejdw(int ), (int)596)) break;
            v4 /* !! */  = (long)hg.ejdz("enhm", ejdw(int ), (int)597);
        }
        v5 /* !! */  = hg.ks;
        if (true) ** GOTO lbl44
        block28: while (true) {
            v5 /* !! */  = (long)(hg.ejdz("enhs", ejev(int ), (int)367) - hg.ejdz("enhr", ejev(int ), (int)366));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -150348639: {
                    continue block28;
                }
                case 695013158: {
                    break block28;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("enhu", ejev(int ), (int)368)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == hg.ejdz("enhw", ejdw(int ), (int)598)) break;
            v6 /* !! */  = (long)hg.ejdz("enhx", ejdw(int ), (int)599);
        }
        v7 /* !! */  = hg.ks;
        if (true) ** GOTO lbl59
        block30: while (true) {
            v7 /* !! */  = (long)(v8 - hg.ejdz("enhy", ejev(int ), (int)369));
lbl59:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1717874950: {
                    v8 = hg.ejdz("enhz", ejev(int ), (int)370);
                    continue block30;
                }
                case 695013158: {
                    break block30;
                }
                case 712855583: {
                    v8 = hg.ejdz("enie", ejev(int ), (int)371);
                    continue block30;
                }
            }
            break;
        }
        v9 = hg.mc.field_1724;
        v10 /* !! */  = hg.ks;
        if (true) ** GOTO lbl73
        block31: while (true) {
            v10 /* !! */  = (long)(hg.ejdz("enii", ejev(int ), (int)373) - hg.ejdz("enig", ejev(int ), (int)372));
lbl73:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -875552988: {
                    continue block31;
                }
                case 695013158: {
                    break block31;
                }
            }
            break;
        }
        v11 = v9.method_36454();
        v12 = hg.ejdz("enik", ejef(int ), (int)600);
        v13 /* !! */  = hg.ks;
        if (true) ** GOTO lbl84
        block32: while (true) {
            v13 /* !! */  = (long)(v14 - hg.ejdz("enil", ejev(int ), (int)374));
lbl84:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -157225177: {
                    v14 = hg.ejdz("enim", ejev(int ), (int)375);
                    continue block32;
                }
                case 695013158: {
                    break block32;
                }
                case 1285510197: {
                    v14 = hg.ejdz("eniq", ejev(int ), (int)376);
                    continue block32;
                }
            }
            break;
        }
        return new class_2886(class_1268.field_5808, var1_1, v11, (float)v12);
    }

    private static /* synthetic */ void enmu() {
        hg.ejdy[0] = -1992713801;
        hg.ejdy[1] = -779559556;
        hg.ejdy[2] = -990311673;
        hg.ejdy[3] = -1546953021;
        hg.ejdy[4] = -278915406;
        hg.ejdy[5] = -1541831767;
        hg.ejdy[6] = -1667236767;
        hg.ejdy[7] = 1487450872;
        hg.ejdy[8] = -1497867017;
        hg.ejdy[9] = -670222950;
        hg.ejdy[10] = -520845798;
        hg.ejdy[11] = 624343314;
        hg.ejdy[12] = 1251916051;
        hg.ejdy[13] = 424070377;
        hg.ejdy[14] = 1611203375;
        hg.ejdy[15] = 427571700;
        hg.ejdy[16] = 2025704971;
        hg.ejdy[17] = -1357971996;
        hg.ejdy[18] = -477497235;
        hg.ejdy[19] = 151630467;
        hg.ejdy[20] = -876038312;
        hg.ejdy[21] = -16152896;
        hg.ejdy[22] = 1225968461;
        hg.ejdy[23] = 163041816;
        hg.ejdy[24] = 1604827053;
        hg.ejdy[25] = 312388196;
        hg.ejdy[26] = 439075303;
        hg.ejdy[27] = 1455005005;
        hg.ejdy[28] = 509794842;
        hg.ejdy[29] = 1342749331;
        hg.ejdy[30] = 627442778;
        hg.ejdy[31] = 1075490723;
        hg.ejdy[32] = 540285565;
        hg.ejdy[33] = -532478045;
        hg.ejdy[34] = -349330127;
        hg.ejdy[35] = -1818476754;
        hg.ejdy[36] = -1160788857;
        hg.ejdy[37] = 1584612760;
        hg.ejdy[38] = 119410949;
        hg.ejdy[39] = -464071940;
        hg.ejdy[40] = -1180646666;
        hg.ejdy[41] = -1888086846;
        hg.ejdy[42] = 1647893230;
        hg.ejdy[43] = -1397949399;
        hg.ejdy[44] = -864697144;
        hg.ejdy[45] = -1079141450;
        hg.ejdy[46] = -584105068;
        hg.ejdy[47] = 982115800;
        hg.ejdy[48] = -363176177;
        hg.ejdy[49] = 1936809039;
        hg.ejdy[50] = 226598811;
        hg.ejdy[51] = 1342430993;
        hg.ejdy[52] = 631845843;
        hg.ejdy[53] = -1813407039;
        hg.ejdy[54] = -738839767;
        hg.ejdy[55] = -757044743;
        hg.ejdy[56] = 685712182;
        hg.ejdy[57] = -665738770;
        hg.ejdy[58] = -1935425115;
        hg.ejdy[59] = 1055754818;
        hg.ejdy[60] = 235793113;
        hg.ejdy[61] = 623474936;
        hg.ejdy[62] = -55650878;
        hg.ejdy[63] = -906164508;
        hg.ejdy[64] = 399431550;
        hg.ejdy[65] = 1381293591;
        hg.ejdy[66] = -1773861445;
        hg.ejdy[67] = -68840692;
        hg.ejdy[68] = -847483665;
        hg.ejdy[69] = 2058263211;
        hg.ejdy[70] = -1840138273;
        hg.ejdy[71] = -1430711723;
        hg.ejdy[72] = 394536989;
        hg.ejdy[73] = -1334541164;
        hg.ejdy[74] = -585356464;
        hg.ejdy[75] = -1029805003;
        hg.ejdy[76] = -1844461685;
        hg.ejdy[77] = 1398915265;
        hg.ejdy[78] = 263637255;
        hg.ejdy[79] = -1531927879;
        hg.ejdy[80] = 1717011948;
        hg.ejdy[81] = -997057785;
        hg.ejdy[82] = 405012762;
        hg.ejdy[83] = -802414476;
        hg.ejdy[84] = 2078659339;
        hg.ejdy[85] = 1520600883;
        hg.ejdy[86] = -1248511935;
        hg.ejdy[87] = -1068600908;
        hg.ejdy[88] = -986867990;
        hg.ejdy[89] = 590356322;
        hg.ejdy[90] = -1888286112;
        hg.ejdy[91] = 698592030;
        hg.ejdy[92] = -231202823;
        hg.ejdy[93] = 1132454101;
        hg.ejdy[94] = 1231172345;
        hg.ejdy[95] = 1218442192;
        hg.ejdy[96] = 567507370;
        hg.ejdy[97] = 248312421;
        hg.ejdy[98] = -24565800;
        hg.ejdy[99] = -1586959765;
    }

    private static /* synthetic */ void enkj() {
        hg.ejdx[200] = 841517007;
        hg.ejdx[201] = -951394527;
        hg.ejdx[202] = -258117323;
        hg.ejdx[203] = -2048814298;
        hg.ejdx[204] = 735370479;
        hg.ejdx[205] = -709955532;
        hg.ejdx[206] = 928210179;
        hg.ejdx[207] = 743383859;
        hg.ejdx[208] = -1496111424;
        hg.ejdx[209] = -136584487;
        hg.ejdx[210] = -955880263;
        hg.ejdx[211] = -706985495;
        hg.ejdx[212] = 2091797747;
        hg.ejdx[213] = 971215720;
        hg.ejdx[214] = -2112182714;
        hg.ejdx[215] = -547849539;
        hg.ejdx[216] = 1341925469;
        hg.ejdx[217] = -1799135277;
        hg.ejdx[218] = -553996208;
        hg.ejdx[219] = 1546489355;
        hg.ejdx[220] = -657856339;
        hg.ejdx[221] = -440318850;
        hg.ejdx[222] = -1586979583;
        hg.ejdx[223] = 726492887;
        hg.ejdx[224] = -1798882574;
        hg.ejdx[225] = 1453345407;
        hg.ejdx[226] = -1377624475;
        hg.ejdx[227] = -419957369;
        hg.ejdx[228] = 2128725886;
        hg.ejdx[229] = -1195436228;
        hg.ejdx[230] = 219509394;
        hg.ejdx[231] = 1661682461;
        hg.ejdx[232] = -14052109;
        hg.ejdx[233] = 618345118;
        hg.ejdx[234] = 1652583109;
        hg.ejdx[235] = -1769403817;
        hg.ejdx[236] = 1059967888;
        hg.ejdx[237] = -595043606;
        hg.ejdx[238] = -1207343227;
        hg.ejdx[239] = -295519079;
        hg.ejdx[240] = -237064086;
        hg.ejdx[241] = 1253287667;
        hg.ejdx[242] = -1999737266;
        hg.ejdx[243] = 789215170;
        hg.ejdx[244] = -6528212;
        hg.ejdx[245] = -923633946;
        hg.ejdx[246] = 1521033830;
        hg.ejdx[247] = 1900469945;
        hg.ejdx[248] = -540427733;
        hg.ejdx[249] = -947653131;
        hg.ejdx[250] = -1834910488;
        hg.ejdx[251] = -1244739413;
        hg.ejdx[252] = 276856414;
        hg.ejdx[253] = 1453599413;
        hg.ejdx[254] = 1689949852;
        hg.ejdx[255] = 400587158;
        hg.ejdx[256] = -1473090820;
        hg.ejdx[257] = -1034684422;
        hg.ejdx[258] = 218438773;
        hg.ejdx[259] = -1208485241;
        hg.ejdx[260] = -512669531;
        hg.ejdx[261] = 1888420536;
        hg.ejdx[262] = -1168104878;
        hg.ejdx[263] = 2114952586;
        hg.ejdx[264] = 2135177290;
        hg.ejdx[265] = 1600840837;
        hg.ejdx[266] = -610102896;
        hg.ejdx[267] = 807789037;
        hg.ejdx[268] = 820918038;
        hg.ejdx[269] = 1174926459;
        hg.ejdx[270] = -1530011791;
        hg.ejdx[271] = 36642409;
        hg.ejdx[272] = 1235825570;
        hg.ejdx[273] = -804458438;
        hg.ejdx[274] = -757271730;
        hg.ejdx[275] = 263306613;
        hg.ejdx[276] = -1266080317;
        hg.ejdx[277] = -1375165279;
        hg.ejdx[278] = -2006265813;
        hg.ejdx[279] = -1612615157;
        hg.ejdx[280] = 1168153693;
        hg.ejdx[281] = 2097351570;
        hg.ejdx[282] = 1073609761;
        hg.ejdx[283] = 1032994044;
        hg.ejdx[284] = 1832883312;
        hg.ejdx[285] = 765260569;
        hg.ejdx[286] = 352825595;
        hg.ejdx[287] = 293604288;
        hg.ejdx[288] = -1807770452;
        hg.ejdx[289] = 658070245;
        hg.ejdx[290] = -426797293;
        hg.ejdx[291] = 1947909375;
        hg.ejdx[292] = -506417775;
        hg.ejdx[293] = -2112556303;
        hg.ejdx[294] = -40264717;
        hg.ejdx[295] = -1405204264;
        hg.ejdx[296] = 951494450;
        hg.ejdx[297] = 1164805061;
        hg.ejdx[298] = -1923796457;
        hg.ejdx[299] = -931864500;
    }

    private static /* synthetic */ void enpm() {
        hg.ejdy[400] = 976869647;
        hg.ejdy[401] = -1956275850;
        hg.ejdy[402] = -2010936937;
        hg.ejdy[403] = 452867570;
        hg.ejdy[404] = 546718896;
        hg.ejdy[405] = 1303860419;
        hg.ejdy[406] = 787415157;
        hg.ejdy[407] = 2021575194;
        hg.ejdy[408] = -385729072;
        hg.ejdy[409] = -1671940866;
        hg.ejdy[410] = -594159006;
        hg.ejdy[411] = 1821590950;
        hg.ejdy[412] = -91783771;
        hg.ejdy[413] = -1172693582;
        hg.ejdy[414] = -768698585;
        hg.ejdy[415] = 1568992772;
        hg.ejdy[416] = -432547327;
        hg.ejdy[417] = -161722549;
        hg.ejdy[418] = -543579655;
        hg.ejdy[419] = -1833898621;
        hg.ejdy[420] = 1161873656;
        hg.ejdy[421] = 1456458732;
        hg.ejdy[422] = -366561355;
        hg.ejdy[423] = 1636169293;
        hg.ejdy[424] = -1841235259;
        hg.ejdy[425] = -1621314176;
        hg.ejdy[426] = 1848896876;
        hg.ejdy[427] = -1211850603;
        hg.ejdy[428] = -884789779;
        hg.ejdy[429] = 1840707855;
        hg.ejdy[430] = -1730667742;
        hg.ejdy[431] = -1985284084;
        hg.ejdy[432] = 2052039076;
        hg.ejdy[433] = -1203643566;
        hg.ejdy[434] = -1350390061;
        hg.ejdy[435] = -2008617832;
        hg.ejdy[436] = 1706543728;
        hg.ejdy[437] = -1580778872;
        hg.ejdy[438] = 1637297078;
        hg.ejdy[439] = -541943225;
        hg.ejdy[440] = -1521079028;
        hg.ejdy[441] = 1719703946;
        hg.ejdy[442] = 1672141252;
        hg.ejdy[443] = 28875905;
        hg.ejdy[444] = 1496744846;
        hg.ejdy[445] = -1472378851;
        hg.ejdy[446] = 695167355;
        hg.ejdy[447] = -1903304579;
        hg.ejdy[448] = 1320718539;
        hg.ejdy[449] = -1605223289;
        hg.ejdy[450] = -1833070625;
        hg.ejdy[451] = -701388042;
        hg.ejdy[452] = -1249753606;
        hg.ejdy[453] = -1548389788;
        hg.ejdy[454] = 98492097;
        hg.ejdy[455] = -1193556707;
        hg.ejdy[456] = -1279517033;
        hg.ejdy[457] = -378543431;
        hg.ejdy[458] = 1566989635;
        hg.ejdy[459] = -1762917167;
        hg.ejdy[460] = 1801246345;
        hg.ejdy[461] = -1942063836;
        hg.ejdy[462] = -2092468330;
        hg.ejdy[463] = -429307864;
        hg.ejdy[464] = -1096056545;
        hg.ejdy[465] = -1031524287;
        hg.ejdy[466] = -1883914576;
        hg.ejdy[467] = 962565966;
        hg.ejdy[468] = -375566248;
        hg.ejdy[469] = 1624762352;
        hg.ejdy[470] = -2043643306;
        hg.ejdy[471] = 964151404;
        hg.ejdy[472] = 458222887;
        hg.ejdy[473] = -1690129866;
        hg.ejdy[474] = 213452983;
        hg.ejdy[475] = 660701189;
        hg.ejdy[476] = -1711236899;
        hg.ejdy[477] = 2095225707;
        hg.ejdy[478] = -1688920628;
        hg.ejdy[479] = -547148938;
        hg.ejdy[480] = -147368206;
        hg.ejdy[481] = -1296751889;
        hg.ejdy[482] = -730511096;
        hg.ejdy[483] = 254639496;
        hg.ejdy[484] = 1949723830;
        hg.ejdy[485] = -17887804;
        hg.ejdy[486] = -1336655837;
        hg.ejdy[487] = -1938269575;
        hg.ejdy[488] = 668889942;
        hg.ejdy[489] = -810821807;
        hg.ejdy[490] = 703035827;
        hg.ejdy[491] = -2020625186;
        hg.ejdy[492] = 1591143086;
        hg.ejdy[493] = 2032620906;
        hg.ejdy[494] = -1565095079;
        hg.ejdy[495] = 889851417;
        hg.ejdy[496] = 472508572;
        hg.ejdy[497] = -1736507983;
        hg.ejdy[498] = 1019726978;
        hg.ejdy[499] = -677959134;
    }

    private static /* synthetic */ void enqn() {
        hg.ejew[0] = -937358051696177643L;
        hg.ejew[1] = 7495160192297759740L;
        hg.ejew[2] = 6819362953514347576L;
        hg.ejew[3] = -7438715829847320307L;
        hg.ejew[4] = 5775494892134095998L;
        hg.ejew[5] = 6079668629454777468L;
        hg.ejew[6] = 3213815095682604949L;
        hg.ejew[7] = 1456631416131423532L;
        hg.ejew[8] = -4407152223566083670L;
        hg.ejew[9] = -3533886830978891777L;
        hg.ejew[10] = -5645146777709568169L;
        hg.ejew[11] = -4139504069312778722L;
        hg.ejew[12] = -6487069820960716778L;
        hg.ejew[13] = -3646043092028263711L;
        hg.ejew[14] = 6165027750874763772L;
        hg.ejew[15] = -7898822907690487440L;
        hg.ejew[16] = 2988099050014557188L;
        hg.ejew[17] = 1786965859616940223L;
        hg.ejew[18] = -2650586853119752101L;
        hg.ejew[19] = 5816319608646120874L;
        hg.ejew[20] = -8354311480797526110L;
        hg.ejew[21] = 4643156087240499244L;
        hg.ejew[22] = 194766240630661820L;
        hg.ejew[23] = -9148679263947912952L;
        hg.ejew[24] = 6744126093398539243L;
        hg.ejew[25] = -3254358762779669302L;
        hg.ejew[26] = -4632750633425737500L;
        hg.ejew[27] = 5115563234253958943L;
        hg.ejew[28] = 3642428048699663308L;
        hg.ejew[29] = -4703151614099035260L;
        hg.ejew[30] = -7251176514679434199L;
        hg.ejew[31] = -6946458789560733333L;
        hg.ejew[32] = 4458088209636596060L;
        hg.ejew[33] = 3584101243617716454L;
        hg.ejew[34] = 588160391762665300L;
        hg.ejew[35] = 2759577376164085558L;
        hg.ejew[36] = -5259755276455876458L;
        hg.ejew[37] = 4787770980201966862L;
        hg.ejew[38] = 3029779209174728279L;
        hg.ejew[39] = -3282707191580115510L;
        hg.ejew[40] = 4446913041590856445L;
        hg.ejew[41] = -4185441810513732276L;
        hg.ejew[42] = 6516725521593371489L;
        hg.ejew[43] = 8048256226557790798L;
        hg.ejew[44] = 8507325698078683257L;
        hg.ejew[45] = 223739070045409853L;
        hg.ejew[46] = -2600401788044376585L;
        hg.ejew[47] = -5892713871313808442L;
        hg.ejew[48] = 100283042989257279L;
        hg.ejew[49] = -7210350174994217567L;
        hg.ejew[50] = 1398293178630083344L;
        hg.ejew[51] = -3987552205834275216L;
        hg.ejew[52] = -5385136100417880406L;
        hg.ejew[53] = -1193422094547208784L;
        hg.ejew[54] = 5635403934020409778L;
        hg.ejew[55] = -2962613526633277243L;
        hg.ejew[56] = 6361598612533266963L;
        hg.ejew[57] = 7180905192470546982L;
        hg.ejew[58] = 8794917383335140647L;
        hg.ejew[59] = 5821062961316316885L;
        hg.ejew[60] = -1301852745798710124L;
        hg.ejew[61] = -3793205551377856926L;
        hg.ejew[62] = -674225853961003937L;
        hg.ejew[63] = -6060210698979346094L;
        hg.ejew[64] = 2899572810874011726L;
        hg.ejew[65] = 7415994998753972458L;
        hg.ejew[66] = -4050588709721632902L;
        hg.ejew[67] = -4883575375596034456L;
        hg.ejew[68] = 376146298990333160L;
        hg.ejew[69] = -4886093156954038939L;
        hg.ejew[70] = 3785895871638826535L;
        hg.ejew[71] = 4059042295239912471L;
        hg.ejew[72] = -9189203108552512604L;
        hg.ejew[73] = -8585629956406592002L;
        hg.ejew[74] = -2616440192714791938L;
        hg.ejew[75] = 1378167945616149010L;
        hg.ejew[76] = -3303879941316248994L;
        hg.ejew[77] = -3414948331629951261L;
        hg.ejew[78] = -7647789324980779444L;
        hg.ejew[79] = 8688019946989401780L;
        hg.ejew[80] = -581614661600032694L;
        hg.ejew[81] = 3707846422942959236L;
        hg.ejew[82] = 5623375777736697944L;
        hg.ejew[83] = 5382353296801344180L;
        hg.ejew[84] = -1447068737532894055L;
        hg.ejew[85] = -949334974714431622L;
        hg.ejew[86] = -8124435858131108731L;
        hg.ejew[87] = 1607433530370263065L;
        hg.ejew[88] = 3372397919026527045L;
        hg.ejew[89] = 5933707406499929605L;
        hg.ejew[90] = -4400712199652501360L;
        hg.ejew[91] = 4714825274740492663L;
        hg.ejew[92] = -2725687675032731387L;
        hg.ejew[93] = 1052637300635475288L;
        hg.ejew[94] = -270297936656894821L;
        hg.ejew[95] = 2518881567396406019L;
        hg.ejew[96] = 4365041239654519473L;
        hg.ejew[97] = -6414504326834353917L;
        hg.ejew[98] = 4879947247258266022L;
        hg.ejew[99] = -1977130217216991476L;
    }

    private static /* synthetic */ void enoc() {
        hg.ejdy[200] = 841516998;
        hg.ejdy[201] = -951394521;
        hg.ejdy[202] = -258117324;
        hg.ejdy[203] = -2048814301;
        hg.ejdy[204] = 735370470;
        hg.ejdy[205] = 709955531;
        hg.ejdy[206] = 1746439276;
        hg.ejdy[207] = 743383858;
        hg.ejdy[208] = 1496111423;
        hg.ejdy[209] = -274187333;
        hg.ejdy[210] = -955880263;
        hg.ejdy[211] = 706985494;
        hg.ejdy[212] = -1199653818;
        hg.ejdy[213] = -971215721;
        hg.ejdy[214] = -2075771033;
        hg.ejdy[215] = 547849538;
        hg.ejdy[216] = 1044391931;
        hg.ejdy[217] = 1799135276;
        hg.ejdy[218] = -1875291347;
        hg.ejdy[219] = -1546489356;
        hg.ejdy[220] = -875663772;
        hg.ejdy[221] = -440318849;
        hg.ejdy[222] = 1806360074;
        hg.ejdy[223] = -726492888;
        hg.ejdy[224] = 414703101;
        hg.ejdy[225] = -1453345408;
        hg.ejdy[226] = 2135716296;
        hg.ejdy[227] = 419957368;
        hg.ejdy[228] = -1322866683;
        hg.ejdy[229] = -1195436227;
        hg.ejdy[230] = 219509394;
        hg.ejdy[231] = 1661682451;
        hg.ejdy[232] = -14052099;
        hg.ejdy[233] = 618345118;
        hg.ejdy[234] = 1652583107;
        hg.ejdy[235] = -1769403811;
        hg.ejdy[236] = 1059967893;
        hg.ejdy[237] = -595043606;
        hg.ejdy[238] = -1207343227;
        hg.ejdy[239] = -295519077;
        hg.ejdy[240] = -237064089;
        hg.ejdy[241] = 1253287667;
        hg.ejdy[242] = -1999737270;
        hg.ejdy[243] = 789215171;
        hg.ejdy[244] = -6528209;
        hg.ejdy[245] = -923633937;
        hg.ejdy[246] = 1521033837;
        hg.ejdy[247] = -1900469946;
        hg.ejdy[248] = -483601545;
        hg.ejdy[249] = 947653130;
        hg.ejdy[250] = -1590205325;
        hg.ejdy[251] = 1244739412;
        hg.ejdy[252] = -1165366549;
        hg.ejdy[253] = -1453599414;
        hg.ejdy[254] = 1347661159;
        hg.ejdy[255] = -400587159;
        hg.ejdy[256] = -13200999;
        hg.ejdy[257] = 1034684421;
        hg.ejdy[258] = 1523396743;
        hg.ejdy[259] = -1208485247;
        hg.ejdy[260] = -512669525;
        hg.ejdy[261] = 1888420538;
        hg.ejdy[262] = -1168104870;
        hg.ejdy[263] = 2114952603;
        hg.ejdy[264] = 2135177287;
        hg.ejdy[265] = 1600840852;
        hg.ejdy[266] = -610102885;
        hg.ejdy[267] = 807789052;
        hg.ejdy[268] = 820918032;
        hg.ejdy[269] = 1174926448;
        hg.ejdy[270] = -1530011784;
        hg.ejdy[271] = 36642410;
        hg.ejdy[272] = 1235825583;
        hg.ejdy[273] = -804458441;
        hg.ejdy[274] = -757271731;
        hg.ejdy[275] = 263306611;
        hg.ejdy[276] = -1266080301;
        hg.ejdy[277] = -1375165268;
        hg.ejdy[278] = -2006265815;
        hg.ejdy[279] = 1612615156;
        hg.ejdy[280] = -798776353;
        hg.ejdy[281] = -2097351571;
        hg.ejdy[282] = -1684505749;
        hg.ejdy[283] = -1032994045;
        hg.ejdy[284] = 527297836;
        hg.ejdy[285] = -765260570;
        hg.ejdy[286] = 1056378616;
        hg.ejdy[287] = 1395919808;
        hg.ejdy[288] = 1807770451;
        hg.ejdy[289] = 446757508;
        hg.ejdy[290] = -426797294;
        hg.ejdy[291] = 1947909374;
        hg.ejdy[292] = -506417775;
        hg.ejdy[293] = 2112556302;
        hg.ejdy[294] = -104011405;
        hg.ejdy[295] = -1405204261;
        hg.ejdy[296] = -951494451;
        hg.ejdy[297] = 1412669139;
        hg.ejdy[298] = -1923796458;
        hg.ejdy[299] = -931864499;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isActive() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("ekde", ejev(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hg.ejdz("ekdf", ejdw(int ), (int)175)) break;
            v0 /* !! */  = (long)hg.ejdz("ekdg", ejdw(int ), (int)176);
        }
        var3_1 = hg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("ekdh", ejev(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hg.ejdz("ekdi", ejdw(int ), (int)177)) break;
            v1 /* !! */  = (long)hg.ejdz("ekdj", ejdw(int ), (int)178);
        }
        var2_2 /* !! */  = hg.b;
        v2 /* !! */  = hg.ks;
        if (true) ** GOTO lbl19
        block32: while (true) {
            v2 /* !! */  = (long)(v3 - hg.ejdz("ekdk", ejev(int ), (int)87));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 695013158: {
                    break block32;
                }
                case 873432761: {
                    v3 = hg.ejdz("ekdl", ejev(int ), (int)88);
                    continue block32;
                }
                case 1533060548: {
                    v3 = hg.ejdz("ekdm", ejev(int ), (int)89);
                    continue block32;
                }
            }
            break;
        }
        var1_3 = hg.a;
        if (var3_1) {
            throw null;
lbl31:
            // 7 sources

            return (boolean)hg.ejdz("ekdn", ejdw(int ), (int)179);
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("ekdo", ejev(int ), (int)90)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hg.ejdz("ekdp", ejdw(int ), (int)180)) break;
                    v4 /* !! */  = (long)hg.ejdz("ekdq", ejdw(int ), (int)181);
                }
                if (this.isActivePotion) ** GOTO lbl100
                if (var1_3) ** GOTO lbl31
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("ekdr", ejev(int ), (int)91)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hg.ejdz("ekds", ejdw(int ), (int)182)) break;
                    v5 /* !! */  = (long)hg.ejdz("ekdt", ejdw(int ), (int)183);
                }
                v6 /* !! */  = hg.ks;
                if (true) ** GOTO lbl55
                block36: while (true) {
                    v6 /* !! */  = (long)(v7 - hg.ejdz("ekdu", ejev(int ), (int)92));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 695013158: {
                            break block36;
                        }
                        case 939073224: {
                            v7 = hg.ejdz("ekdv", ejev(int ), (int)93);
                            continue block36;
                        }
                        case 1682325272: {
                            v7 = hg.ejdz("ekdw", ejev(int ), (int)94);
                            continue block36;
                        }
                        case 1874669475: {
                            v7 = hg.ejdz("ekdx", ejev(int ), (int)95);
                            continue block36;
                        }
                    }
                    break;
                }
                if (this.canBuff(hg$PotionType.STRENGTH)) ** GOTO lbl100
                if (var1_3) ** GOTO lbl31
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("ekdy", ejev(int ), (int)96)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == hg.ejdz("ekdz", ejdw(int ), (int)184)) break;
                    v8 /* !! */  = (long)hg.ejdz("ekea", ejdw(int ), (int)185);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = hg.ks - hg.ejdz("ekeb", ejev(int ), (int)97)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == hg.ejdz("ekec", ejdw(int ), (int)186)) break;
                    v9 /* !! */  = (long)hg.ejdz("eked", ejdw(int ), (int)187);
                }
                if (this.canBuff(hg$PotionType.SPEED)) ** GOTO lbl100
                if (var1_3) ** GOTO lbl31
                v10 /* !! */  = hg.ks;
                if (true) ** GOTO lbl87
                block39: while (true) {
                    v10 /* !! */  = (long)(hg.ejdz("ekef", ejev(int ), (int)99) - hg.ejdz("ekee", ejev(int ), (int)98));
lbl87:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 136680153: {
                            continue block39;
                        }
                        case 695013158: {
                            break block39;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = hg.ks - hg.ejdz("ekeg", ejev(int ), (int)100)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == hg.ejdz("ekeh", ejdw(int ), (int)188)) break;
                    v11 /* !! */  = (long)hg.ejdz("ekei", ejdw(int ), (int)189);
                }
                if (!this.canBuff(hg$PotionType.FIRE_RESISTANCE)) ** GOTO lbl105
                if (var1_3) ** GOTO lbl31
lbl100:
                // 4 sources

                if (var1_3 || var1_3) ** GOTO lbl31
                v12 = hg.ejdz("ekej", ejdw(int ), (int)190);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
lbl105:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v12 = hg.ejdz("ekek", ejdw(int ), (int)191);
lbl108:
                // 2 sources

                return (boolean)v12;
            }
lbl109:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hg.ejdz("ekel", ejdw(int ), (int)192);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 1: {
                var2_2 /* !! */  = (int)hg.ejdz("ekem", ejdw(int ), (int)193);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 2: {
                var2_2 /* !! */  = (int)hg.ejdz("eken", ejdw(int ), (int)194);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
lbl123:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hg.ejdz("ekeo", ejdw(int ), (int)195);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl128:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hg.ejdz("ekep", ejdw(int ), (int)196);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl133:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hg.ejdz("ekeq", ejdw(int ), (int)197);
                    if (!var3_1) ** GOTO lbl123
                    throw null;
                }
            }
lbl138:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)hg.ejdz("eker", ejdw(int ), (int)198);
                if (!var3_1) ** GOTO lbl128
                throw null;
            }
lbl142:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hg.ejdz("ekes", ejdw(int ), (int)199);
                if (!var3_1) ** GOTO lbl138
                throw null;
            }
lbl146:
            // 2 sources

            case 8: {
                do {
                    var2_2 /* !! */  = (int)hg.ejdz("eket", ejdw(int ), (int)200);
                } while (!var3_1);
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hg.ejdz("ekeu", ejdw(int ), (int)201);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 10: {
                var2_2 /* !! */  = (int)hg.ejdz("ekev", ejdw(int ), (int)202);
                if (!var3_1) ** GOTO lbl138
                throw null;
            }
lbl160:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hg.ejdz("ekew", ejdw(int ), (int)203);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)hg.ejdz("ekex", ejdw(int ), (int)204);
        ** while (!var3_1)
lbl167:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canBuff(hg$PotionType var1_1) {
        block60: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("ejjq", ejev(int ), (int)30)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == hg.ejdz("ejjr", ejdw(int ), (int)112)) break;
                v0 /* !! */  = (long)hg.ejdz("ejjs", ejdw(int ), (int)113);
            }
            var4_2 = hg.c;
            v1 /* !! */  = hg.ks;
            if (true) ** GOTO lbl12
            block37: while (true) {
                v1 /* !! */  = (long)(v2 - hg.ejdz("ejjt", ejev(int ), (int)31));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 695013158: {
                        break block37;
                    }
                    case 915643271: {
                        v2 = hg.ejdz("ejju", ejev(int ), (int)32);
                        continue block37;
                    }
                    case 1058640352: {
                        v2 = hg.ejdz("ejjv", ejev(int ), (int)33);
                        continue block37;
                    }
                    case 1977837592: {
                        v2 = hg.ejdz("ejjw", ejev(int ), (int)34);
                        continue block37;
                    }
                }
                break;
            }
            var3_3 /* !! */  = hg.b;
            v3 /* !! */  = hg.ks;
            if (true) ** GOTO lbl29
            block38: while (true) {
                v3 /* !! */  = (long)(v4 - hg.ejdz("ejjx", ejev(int ), (int)35));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2141362780: {
                        v4 = hg.ejdz("ejjy", ejev(int ), (int)36);
                        continue block38;
                    }
                    case 695013158: {
                        break block38;
                    }
                    case 1859403273: {
                        v4 = hg.ejdz("ejjz", ejev(int ), (int)37);
                        continue block38;
                    }
                    case 1882588928: {
                        v4 = hg.ejdz("ejka", ejev(int ), (int)38);
                        continue block38;
                    }
                }
                break;
            }
            var2_4 = hg.a;
            if (var4_2) {
                throw null;
lbl44:
                // 6 sources

                return (boolean)hg.ejdz("ejkb", ejdw(int ), (int)114);
            }
            if (var2_4 || var2_4) ** GOTO lbl44
            v5 /* !! */  = hg.ks;
            if (true) ** GOTO lbl51
            block40: while (true) {
                v5 /* !! */  = (long)(v6 - hg.ejdz("ejkc", ejev(int ), (int)39));
lbl51:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1438554046: {
                        v6 = hg.ejdz("ejkd", ejev(int ), (int)40);
                        continue block40;
                    }
                    case 472567738: {
                        v6 = hg.ejdz("ejke", ejev(int ), (int)41);
                        continue block40;
                    }
                    case 695013158: {
                        break block40;
                    }
                    case 2049710444: {
                        v6 = hg.ejdz("ejkf", ejev(int ), (int)42);
                        continue block40;
                    }
                }
                break;
            }
            v7 = var1_1.effect;
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("ejkg", ejev(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == hg.ejdz("ejkh", ejdw(int ), (int)115)) break;
                v8 /* !! */  = (long)hg.ejdz("ejki", ejdw(int ), (int)116);
            }
            if (!this.hasEffect(v7)) break block60;
            if (var2_4) ** GOTO lbl44
            return (boolean)hg.ejdz("ejkj", ejdw(int ), (int)117);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl44
                v9 /* !! */  = hg.ks;
                if (true) ** GOTO lbl82
                block42: while (true) {
                    v9 /* !! */  = (long)(hg.ejdz("ejkl", ejev(int ), (int)45) - hg.ejdz("ejkk", ejev(int ), (int)44));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 695013158: {
                            break block42;
                        }
                        case 1111263829: {
                            continue block42;
                        }
                    }
                    break;
                }
                if (!var1_1.isEnabled(this)) ** GOTO lbl101
                if (var2_4) ** GOTO lbl44
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("ejkm", ejev(int ), (int)46)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == hg.ejdz("ejkn", ejdw(int ), (int)118)) break;
                    v10 /* !! */  = (long)hg.ejdz("ejko", ejdw(int ), (int)119);
                }
                if (this.findPotionSlot(var1_1) == hg.ejdz("ejkp", ejdw(int ), (int)120)) ** GOTO lbl101
                if (var2_4) ** GOTO lbl44
                v11 = hg.ejdz("ejkq", ejdw(int ), (int)121);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl104
lbl101:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v11 = hg.ejdz("ejkr", ejdw(int ), (int)122);
lbl104:
                // 2 sources

                return (boolean)v11;
            }
            case 0: {
                var3_3 /* !! */  = (int)hg.ejdz("ejks", ejdw(int ), (int)123);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hg.ejdz("ejkt", ejdw(int ), (int)124);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl148
                    break;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)hg.ejdz("ejku", ejdw(int ), (int)125);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 3: {
                var3_3 /* !! */  = (int)hg.ejdz("ejkv", ejdw(int ), (int)126);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl126:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)hg.ejdz("ejkw", ejdw(int ), (int)127);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)hg.ejdz("ejkx", ejdw(int ), (int)128);
                if (!var4_2) break;
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)hg.ejdz("ejky", ejdw(int ), (int)129);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 7: {
                var3_3 /* !! */  = (int)hg.ejdz("ejkz", ejdw(int ), (int)130);
                if (!var4_2) ** GOTO lbl126
                throw null;
            }
lbl143:
            // 2 sources

            case 8: {
                do {
                    var3_3 /* !! */  = (int)hg.ejdz("ejla", ejdw(int ), (int)131);
                } while (!var4_2);
                throw null;
            }
lbl148:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)hg.ejdz("ejlb", ejdw(int ), (int)132);
                if (var4_2) {
                    throw null;
                }
            }
            case 10: {
                var3_3 /* !! */  = (int)hg.ejdz("ejld", ejdw(int ), (int)133);
                if (!var4_2) ** GOTO lbl148
                throw null;
            }
            case 11: 
        }
        var3_3 /* !! */  = (int)hg.ejdz("ejle", ejdw(int ), (int)134);
        ** while (!var4_2)
lbl159:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void enwq() {
        hg.ejex[300] = 708291814349148795L;
        hg.ejex[301] = 6012881522076194363L;
        hg.ejex[302] = 6158005998346434011L;
        hg.ejex[303] = -8443238889929829971L;
        hg.ejex[304] = 8984401001990734820L;
        hg.ejex[305] = -6476941757696691876L;
        hg.ejex[306] = 9085291170334184864L;
        hg.ejex[307] = 4028628005480491754L;
        hg.ejex[308] = -2453820626185326118L;
        hg.ejex[309] = 3559674508201739734L;
        hg.ejex[310] = -6047267172587695697L;
        hg.ejex[311] = -2361162400339147397L;
        hg.ejex[312] = -1716321798544103368L;
        hg.ejex[313] = -2234144189441573535L;
        hg.ejex[314] = -8382193629683951444L;
        hg.ejex[315] = 5926514851412588439L;
        hg.ejex[316] = 5251980005038741352L;
        hg.ejex[317] = 187298048023842758L;
        hg.ejex[318] = -3694410748211557085L;
        hg.ejex[319] = -6014947603099702398L;
        hg.ejex[320] = -8123670865646880411L;
        hg.ejex[321] = 6631475764036821987L;
        hg.ejex[322] = 4292095385749222484L;
        hg.ejex[323] = 3081709474353401633L;
        hg.ejex[324] = -1387596445404855638L;
        hg.ejex[325] = 769603342829479242L;
        hg.ejex[326] = -6508279637243063176L;
        hg.ejex[327] = 2411501780034536865L;
        hg.ejex[328] = 5521636810433385517L;
        hg.ejex[329] = -759519517668127910L;
        hg.ejex[330] = -7235003444112583328L;
        hg.ejex[331] = 9063437228280331464L;
        hg.ejex[332] = 2710334654432650494L;
        hg.ejex[333] = 8001185733270482800L;
        hg.ejex[334] = -767711417642680918L;
        hg.ejex[335] = 1727526260479832069L;
        hg.ejex[336] = 6594480716944255364L;
        hg.ejex[337] = 6492279619371356961L;
        hg.ejex[338] = -5012074743283635710L;
        hg.ejex[339] = -2788233312149690652L;
        hg.ejex[340] = 5862109794824481706L;
        hg.ejex[341] = -6437752736010524956L;
        hg.ejex[342] = 2268728895275580406L;
        hg.ejex[343] = 1811124144293615599L;
        hg.ejex[344] = 5489766462186448439L;
        hg.ejex[345] = 4567497107699479391L;
        hg.ejex[346] = -3566041366297021564L;
        hg.ejex[347] = -233777865407063129L;
        hg.ejex[348] = 5427896054689326878L;
        hg.ejex[349] = 1899912583672017871L;
        hg.ejex[350] = 612906980278188678L;
        hg.ejex[351] = 7834969525047517597L;
        hg.ejex[352] = -8492711284492744362L;
        hg.ejex[353] = 8267706228196802421L;
        hg.ejex[354] = -1560241976593969748L;
        hg.ejex[355] = -9187440290661534865L;
        hg.ejex[356] = 8769425043935783469L;
        hg.ejex[357] = -854739838492728003L;
        hg.ejex[358] = -3878892723896035224L;
        hg.ejex[359] = -1621651694739226051L;
        hg.ejex[360] = -4354270870310382874L;
        hg.ejex[361] = -538047764745497242L;
        hg.ejex[362] = -1965603513690015150L;
        hg.ejex[363] = 7603177158320207746L;
        hg.ejex[364] = 365122572725775670L;
        hg.ejex[365] = 6992289011398390013L;
        hg.ejex[366] = -6506784407076289131L;
        hg.ejex[367] = -7000342752432074855L;
        hg.ejex[368] = -7903529959342327637L;
        hg.ejex[369] = 1300287205634834420L;
        hg.ejex[370] = 6415816514764658232L;
        hg.ejex[371] = -2403314893102258999L;
        hg.ejex[372] = 7716865722590933124L;
        hg.ejex[373] = -8340676564897852167L;
        hg.ejex[374] = -2537512812901593032L;
        hg.ejex[375] = 6168080849301103672L;
        hg.ejex[376] = -1482282637462028594L;
    }

    private static /* synthetic */ float ejef(int n2) {
        return Float.intBitsToFloat(ejdx[n2] ^ ejdy[n2]);
    }

    private static /* synthetic */ void enlj() {
        hg.ejdx[400] = 976869684;
        hg.ejdx[401] = -1956275857;
        hg.ejdx[402] = -2010936929;
        hg.ejdx[403] = 452867547;
        hg.ejdx[404] = 546718864;
        hg.ejdx[405] = 1303860442;
        hg.ejdx[406] = 787415142;
        hg.ejdx[407] = 2021575193;
        hg.ejdx[408] = -385729063;
        hg.ejdx[409] = -1671940928;
        hg.ejdx[410] = -594159009;
        hg.ejdx[411] = 1821590951;
        hg.ejdx[412] = -91783800;
        hg.ejdx[413] = -1172693626;
        hg.ejdx[414] = -768698581;
        hg.ejdx[415] = 1568992797;
        hg.ejdx[416] = -432547266;
        hg.ejdx[417] = -161722526;
        hg.ejdx[418] = -543579682;
        hg.ejdx[419] = -1833898607;
        hg.ejdx[420] = 1161873644;
        hg.ejdx[421] = 1456458669;
        hg.ejdx[422] = -366561371;
        hg.ejdx[423] = 1636169287;
        hg.ejdx[424] = -1841235204;
        hg.ejdx[425] = -1621314106;
        hg.ejdx[426] = 1848896869;
        hg.ejdx[427] = -1211850565;
        hg.ejdx[428] = -884789761;
        hg.ejdx[429] = 1840707916;
        hg.ejdx[430] = -1730667773;
        hg.ejdx[431] = -1985284063;
        hg.ejdx[432] = 2052039092;
        hg.ejdx[433] = -1203643559;
        hg.ejdx[434] = -1350390028;
        hg.ejdx[435] = -2008617847;
        hg.ejdx[436] = 1706543714;
        hg.ejdx[437] = -1580778859;
        hg.ejdx[438] = 1637297045;
        hg.ejdx[439] = -541943227;
        hg.ejdx[440] = -1521078999;
        hg.ejdx[441] = 1719703940;
        hg.ejdx[442] = 1672141248;
        hg.ejdx[443] = 28875932;
        hg.ejdx[444] = 1496744886;
        hg.ejdx[445] = -1472378849;
        hg.ejdx[446] = 695167322;
        hg.ejdx[447] = -1903304590;
        hg.ejdx[448] = 1320718571;
        hg.ejdx[449] = -1605223280;
        hg.ejdx[450] = -1833070599;
        hg.ejdx[451] = -701388068;
        hg.ejdx[452] = -1249753664;
        hg.ejdx[453] = -1548389772;
        hg.ejdx[454] = 98492124;
        hg.ejdx[455] = -1193556707;
        hg.ejdx[456] = -1279517012;
        hg.ejdx[457] = -378543441;
        hg.ejdx[458] = 1566989681;
        hg.ejdx[459] = -1762917184;
        hg.ejdx[460] = 1801246353;
        hg.ejdx[461] = 1942063835;
        hg.ejdx[462] = -1414708922;
        hg.ejdx[463] = 429307863;
        hg.ejdx[464] = 1997329878;
        hg.ejdx[465] = -1031524287;
        hg.ejdx[466] = -1883914576;
        hg.ejdx[467] = -962565967;
        hg.ejdx[468] = 1550887148;
        hg.ejdx[469] = 1624762352;
        hg.ejdx[470] = 2043643305;
        hg.ejdx[471] = -1733341221;
        hg.ejdx[472] = -458222888;
        hg.ejdx[473] = 1690129865;
        hg.ejdx[474] = 1321621902;
        hg.ejdx[475] = -660701190;
        hg.ejdx[476] = 388083550;
        hg.ejdx[477] = -2095225708;
        hg.ejdx[478] = 893701373;
        hg.ejdx[479] = -547148933;
        hg.ejdx[480] = -147368202;
        hg.ejdx[481] = -1296751900;
        hg.ejdx[482] = -730511103;
        hg.ejdx[483] = 254639502;
        hg.ejdx[484] = 1949723829;
        hg.ejdx[485] = -17887803;
        hg.ejdx[486] = -1336655834;
        hg.ejdx[487] = -1938269583;
        hg.ejdx[488] = 668889944;
        hg.ejdx[489] = -810821796;
        hg.ejdx[490] = 703035831;
        hg.ejdx[491] = -2020625198;
        hg.ejdx[492] = 1591143083;
        hg.ejdx[493] = 2032620906;
        hg.ejdx[494] = 1565095078;
        hg.ejdx[495] = 1102171238;
        hg.ejdx[496] = -472508573;
        hg.ejdx[497] = -214436749;
        hg.ejdx[498] = -1019726979;
        hg.ejdx[499] = -1150282245;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasEffect(class_6880<class_1291> var1_1) {
        v0 /* !! */  = hg.ks;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - hg.ejdz("ejih", ejev(int ), (int)17));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1308204776: {
                    v1 = hg.ejdz("ejii", ejev(int ), (int)18);
                    continue block25;
                }
                case -1011225496: {
                    v1 = hg.ejdz("ejij", ejev(int ), (int)19);
                    continue block25;
                }
                case -668502689: {
                    v1 = hg.ejdz("ejik", ejev(int ), (int)20);
                    continue block25;
                }
                case 695013158: {
                    break block25;
                }
            }
            break;
        }
        var4_2 = hg.c;
        v2 /* !! */  = hg.ks;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(hg.ejdz("ejim", ejev(int ), (int)22) - hg.ejdz("ejil", ejev(int ), (int)21));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 695013158: {
                    break block26;
                }
                case 1152649562: {
                    continue block26;
                }
            }
            break;
        }
        var3_3 /* !! */  = hg.b;
        v3 /* !! */  = hg.ks;
        if (true) ** GOTO lbl32
        block27: while (true) {
            v3 /* !! */  = (long)(hg.ejdz("ejio", ejev(int ), (int)24) - hg.ejdz("ejin", ejev(int ), (int)23));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1327478761: {
                    continue block27;
                }
                case 695013158: {
                    break block27;
                }
            }
            break;
        }
        var2_4 = hg.a;
        if (var4_2) {
            throw null;
lbl40:
            // 4 sources

            return (boolean)hg.ejdz("ejip", ejdw(int ), (int)90);
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("ejiq", ejev(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hg.ejdz("ejir", ejdw(int ), (int)91)) break;
            v4 /* !! */  = (long)hg.ejdz("ejis", ejdw(int ), (int)92);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("ejit", ejev(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hg.ejdz("ejiu", ejdw(int ), (int)93)) break;
            v5 /* !! */  = (long)hg.ejdz("ejiv", ejdw(int ), (int)94);
        }
        if (hg.mc.field_1724 == null) ** GOTO lbl80
        if (var2_4) ** GOTO lbl40
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("ejiw", ejev(int ), (int)27)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == hg.ejdz("ejix", ejdw(int ), (int)95)) break;
            v6 /* !! */  = (long)hg.ejdz("ejiy", ejdw(int ), (int)96);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("ejiz", ejev(int ), (int)28)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hg.ejdz("ejja", ejdw(int ), (int)97)) break;
            v7 /* !! */  = (long)hg.ejdz("ejjb", ejdw(int ), (int)98);
        }
        v8 = hg.mc.field_1724;
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("ejjc", ejev(int ), (int)29)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == hg.ejdz("ejjd", ejdw(int ), (int)99)) break;
            v9 /* !! */  = (long)hg.ejdz("ejje", ejdw(int ), (int)100);
        }
        if (!v8.method_6059(var1_1)) ** GOTO lbl80
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v10 = hg.ejdz("ejjf", ejdw(int ), (int)101);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl80:
            // 2 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v10 = hg.ejdz("ejjg", ejdw(int ), (int)102);
lbl83:
            // 2 sources

            return (boolean)v10;
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hg.ejdz("ejjh", ejdw(int ), (int)103);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl108
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)hg.ejdz("ejji", ejdw(int ), (int)104);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)hg.ejdz("ejjj", ejdw(int ), (int)105);
                } while (!var4_2);
                throw null;
            }
lbl100:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)hg.ejdz("ejjk", ejdw(int ), (int)106);
                if (!var4_2) break;
                throw null;
            }
lbl104:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hg.ejdz("ejjl", ejdw(int ), (int)107);
                if (!var4_2) break;
                throw null;
            }
lbl108:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)hg.ejdz("ejjm", ejdw(int ), (int)108);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 6: {
                var3_3 /* !! */  = (int)hg.ejdz("ejjn", ejdw(int ), (int)109);
                if (!var4_2) ** GOTO lbl104
                throw null;
            }
lbl117:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hg.ejdz("ejjo", ejdw(int ), (int)110);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)hg.ejdz("ejjp", ejdw(int ), (int)111);
        ** while (!var4_2)
lbl124:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ennj() {
        hg.ejdy[100] = -1965401384;
        hg.ejdy[101] = -1253096476;
        hg.ejdy[102] = -1312218058;
        hg.ejdy[103] = 549902348;
        hg.ejdy[104] = -1226096181;
        hg.ejdy[105] = 1542613834;
        hg.ejdy[106] = 418842893;
        hg.ejdy[107] = -787337761;
        hg.ejdy[108] = -554432988;
        hg.ejdy[109] = -256003298;
        hg.ejdy[110] = 1123403014;
        hg.ejdy[111] = -1298249162;
        hg.ejdy[112] = -1775675225;
        hg.ejdy[113] = 1378315699;
        hg.ejdy[114] = -1498938560;
        hg.ejdy[115] = -197108523;
        hg.ejdy[116] = -338675285;
        hg.ejdy[117] = -1668892187;
        hg.ejdy[118] = -1615965960;
        hg.ejdy[119] = 2049929958;
        hg.ejdy[120] = 1742618361;
        hg.ejdy[121] = -1157332692;
        hg.ejdy[122] = 714173584;
        hg.ejdy[123] = -1438677281;
        hg.ejdy[124] = -1942658716;
        hg.ejdy[125] = 692676286;
        hg.ejdy[126] = 877540467;
        hg.ejdy[127] = 998952859;
        hg.ejdy[128] = 336312318;
        hg.ejdy[129] = 1300452499;
        hg.ejdy[130] = -380920677;
        hg.ejdy[131] = -2078238789;
        hg.ejdy[132] = 1330941460;
        hg.ejdy[133] = 519411916;
        hg.ejdy[134] = -862850804;
        hg.ejdy[135] = -669342927;
        hg.ejdy[136] = -1788353956;
        hg.ejdy[137] = -1421672748;
        hg.ejdy[138] = -960384165;
        hg.ejdy[139] = -1578691709;
        hg.ejdy[140] = -1338610256;
        hg.ejdy[141] = 503523483;
        hg.ejdy[142] = -1936938584;
        hg.ejdy[143] = -1616115286;
        hg.ejdy[144] = 720852515;
        hg.ejdy[145] = -20124324;
        hg.ejdy[146] = -1530312780;
        hg.ejdy[147] = -1904220637;
        hg.ejdy[148] = 1138489296;
        hg.ejdy[149] = -1844004571;
        hg.ejdy[150] = -1910765109;
        hg.ejdy[151] = 1926741005;
        hg.ejdy[152] = 1136933525;
        hg.ejdy[153] = 399189696;
        hg.ejdy[154] = -203285549;
        hg.ejdy[155] = -407962254;
        hg.ejdy[156] = -1784406839;
        hg.ejdy[157] = 2032392445;
        hg.ejdy[158] = -2012924537;
        hg.ejdy[159] = -971367619;
        hg.ejdy[160] = -176213517;
        hg.ejdy[161] = -2010044883;
        hg.ejdy[162] = 579641545;
        hg.ejdy[163] = 1645752045;
        hg.ejdy[164] = -989470431;
        hg.ejdy[165] = -1467026508;
        hg.ejdy[166] = -1326531374;
        hg.ejdy[167] = -1615345933;
        hg.ejdy[168] = -1588664203;
        hg.ejdy[169] = -755392707;
        hg.ejdy[170] = -119908907;
        hg.ejdy[171] = -1660716375;
        hg.ejdy[172] = 1181717511;
        hg.ejdy[173] = -1868679732;
        hg.ejdy[174] = -917892985;
        hg.ejdy[175] = 860784658;
        hg.ejdy[176] = 1214548449;
        hg.ejdy[177] = 1861332995;
        hg.ejdy[178] = -589811932;
        hg.ejdy[179] = -782667477;
        hg.ejdy[180] = -2042801450;
        hg.ejdy[181] = -574431166;
        hg.ejdy[182] = 2058831592;
        hg.ejdy[183] = -1886931799;
        hg.ejdy[184] = -1864395110;
        hg.ejdy[185] = -1807129240;
        hg.ejdy[186] = 2057078949;
        hg.ejdy[187] = 751162916;
        hg.ejdy[188] = 998589955;
        hg.ejdy[189] = 300616784;
        hg.ejdy[190] = 1848539898;
        hg.ejdy[191] = -1843357636;
        hg.ejdy[192] = 101189077;
        hg.ejdy[193] = -1355000973;
        hg.ejdy[194] = 2101280029;
        hg.ejdy[195] = -1734397106;
        hg.ejdy[196] = -685548811;
        hg.ejdy[197] = 413336112;
        hg.ejdy[198] = -1320807640;
        hg.ejdy[199] = -1899835956;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int findPotionSlot(hg$PotionType var1_1) {
        block75: {
            var9_2 = hg.c;
            var8_3 /* !! */  = hg.b;
            var7_4 = hg.a;
            if (var9_2) {
                throw null;
lbl6:
                // 20 sources

                return (int)hg.ejdz("ejgr", ejdw(int ), (int)48);
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            if (hg.mc.field_1724 != null) break block75;
            if (var7_4) ** GOTO lbl6
            return (int)hg.ejdz("ejgs", ejdw(int ), (int)49);
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5 = hg.ejdz("ejgt", ejdw(int ), (int)50);
        if (var7_4) ** GOTO lbl6
        block40: while (true) {
            if (var7_4 || var7_4) ** GOTO lbl6
            if (var2_5 >= hg.ejdz("ejgu", ejdw(int ), (int)51)) ** GOTO lbl51
            if (var7_4 || var7_4) ** GOTO lbl6
            var3_6 = hg.mc.field_1724.method_31548().method_5438((int)var2_5);
            if (var7_4 || var7_4) ** GOTO lbl6
            if (!var3_6.method_31574(class_1802.field_8436)) ** GOTO lbl46
            if (var7_4 || var7_4) ** GOTO lbl6
            var4_7 = (class_1844)var3_6.method_58694(class_9334.field_49651);
            if (var7_4 || var7_4) ** GOTO lbl6
            if (var4_7 == null) ** GOTO lbl46
            if (var7_4) ** GOTO lbl6
            if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var8_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var7_4) ** GOTO lbl6
                    var5_8 = var4_7.method_57397().iterator();
                    if (var7_4) ** GOTO lbl6
                    do {
                        if (var7_4 || var7_4) ** GOTO lbl6
                        if (!var5_8.hasNext()) ** GOTO lbl46
                        if (var7_4) ** GOTO lbl6
                        var6_9 = (class_1293)var5_8.next();
                        if (var7_4 || var7_4) ** GOTO lbl6
                        if (var6_9.method_5579() != var1_1.effect) ** GOTO lbl43
                        if (var7_4 || var7_4) ** GOTO lbl6
                        return (int)var2_5;
lbl43:
                        // 1 sources

                        if (var7_4 || var7_4) ** GOTO lbl6
                    } while (!var9_2);
                    throw null;
lbl46:
                    // 3 sources

                    if (var7_4 || var7_4) ** GOTO lbl6
                    ++var2_5;
                    if (var7_4) ** GOTO lbl6
                    if (!var9_2) continue block40;
                    throw null;
                }
lbl51:
                // 1 sources

                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return (int)hg.ejdz("ejgv", ejdw(int ), (int)52);
lbl54:
                // 2 sources

                case 0: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejgw", ejdw(int ), (int)53);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl143
                }
                case 1: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejgx", ejdw(int ), (int)54);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl185
                }
                case 2: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejgy", ejdw(int ), (int)55);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl193
                }
lbl69:
                // 2 sources

                case 3: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejgz", ejdw(int ), (int)56);
                    if (var9_2) {
                        throw null;
                    }
                }
                case 4: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejha", ejdw(int ), (int)57);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl103
                }
lbl78:
                // 2 sources

                case 5: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhb", ejdw(int ), (int)58);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl143
                }
lbl83:
                // 2 sources

                case 6: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhc", ejdw(int ), (int)59);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl88:
                // 3 sources

                case 7: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var8_3 /* !! */  = (int)hg.ejdz("ejhd", ejdw(int ), (int)60);
                        if (var9_2) {
                            throw null;
                        }
                        ** GOTO lbl143
                        break;
                    }
                }
                case 8: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhe", ejdw(int ), (int)61);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl112
                }
                case 9: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhf", ejdw(int ), (int)62);
                    if (!var9_2) ** GOTO lbl54
                    throw null;
                }
lbl103:
                // 2 sources

                case 10: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhg", ejdw(int ), (int)63);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl131
                }
lbl108:
                // 3 sources

                case 11: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhh", ejdw(int ), (int)64);
                    if (!var9_2) ** GOTO lbl83
                    throw null;
                }
lbl112:
                // 4 sources

                case 12: {
                    do {
                        var8_3 /* !! */  = (int)hg.ejdz("ejhi", ejdw(int ), (int)65);
                    } while (!var9_2);
                    throw null;
                }
lbl117:
                // 2 sources

                case 13: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhj", ejdw(int ), (int)66);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl139
                }
lbl122:
                // 2 sources

                case 14: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhk", ejdw(int ), (int)67);
                    if (!var9_2) ** GOTO lbl117
                    throw null;
                }
lbl126:
                // 2 sources

                case 15: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhl", ejdw(int ), (int)68);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl160
                }
lbl131:
                // 2 sources

                case 16: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhm", ejdw(int ), (int)69);
                    if (!var9_2) ** GOTO lbl112
                    throw null;
                }
                case 17: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhn", ejdw(int ), (int)70);
                    if (!var9_2) ** GOTO lbl88
                    throw null;
                }
lbl139:
                // 2 sources

                case 18: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejho", ejdw(int ), (int)71);
                    if (!var9_2) ** GOTO lbl78
                    throw null;
                }
lbl143:
                // 4 sources

                case 19: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhp", ejdw(int ), (int)72);
                    if (!var9_2) ** GOTO lbl122
                    throw null;
                }
lbl147:
                // 2 sources

                case 20: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhq", ejdw(int ), (int)73);
                    if (!var9_2) ** GOTO lbl69
                    throw null;
                }
                case 21: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhr", ejdw(int ), (int)74);
                    if (!var9_2) ** GOTO lbl112
                    throw null;
                }
lbl155:
                // 4 sources

                case 22: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhs", ejdw(int ), (int)75);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl193
                }
lbl160:
                // 3 sources

                case 23: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejht", ejdw(int ), (int)76);
                    if (!var9_2) ** GOTO lbl155
                    throw null;
                }
                case 24: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhu", ejdw(int ), (int)77);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl173
                }
                case 25: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhv", ejdw(int ), (int)78);
                    if (!var9_2) ** GOTO lbl147
                    throw null;
                }
lbl173:
                // 3 sources

                case 26: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhw", ejdw(int ), (int)79);
                    if (!var9_2) ** GOTO lbl155
                    throw null;
                }
lbl177:
                // 2 sources

                case 27: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhx", ejdw(int ), (int)80);
                    if (!var9_2) ** GOTO lbl108
                    throw null;
                }
lbl181:
                // 2 sources

                case 28: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhy", ejdw(int ), (int)81);
                    if (!var9_2) ** GOTO lbl160
                    throw null;
                }
lbl185:
                // 2 sources

                case 29: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejhz", ejdw(int ), (int)82);
                    if (!var9_2) ** GOTO lbl126
                    throw null;
                }
                case 30: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejia", ejdw(int ), (int)83);
                    if (!var9_2) ** GOTO lbl88
                    throw null;
                }
lbl193:
                // 3 sources

                case 31: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejib", ejdw(int ), (int)84);
                    if (!var9_2) ** GOTO lbl181
                    throw null;
                }
                case 32: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejic", ejdw(int ), (int)85);
                    if (!var9_2) ** GOTO lbl108
                    throw null;
                }
                case 33: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejid", ejdw(int ), (int)86);
                    if (!var9_2) ** GOTO lbl155
                    throw null;
                }
lbl205:
                // 2 sources

                case 34: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejie", ejdw(int ), (int)87);
                    if (!var9_2) ** GOTO lbl173
                    throw null;
                }
                case 35: {
                    var8_3 /* !! */  = (int)hg.ejdz("ejif", ejdw(int ), (int)88);
                    if (!var9_2) ** GOTO lbl205
                    throw null;
                }
                case 36: 
            }
            break;
        }
        var8_3 /* !! */  = (int)hg.ejdz("ejig", ejdw(int ), (int)89);
        ** while (!var9_2)
lbl216:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block113: {
            block112: {
                block111: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("elkj", ejev(int ), (int)208)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == hg.ejdz("elkl", ejdw(int ), (int)328)) break;
                        v0 /* !! */  = (long)hg.ejdz("elkn", ejdw(int ), (int)329);
                    }
                    var4_2 = hg.c;
                    v1 /* !! */  = hg.ks;
                    if (true) ** GOTO lbl11
                    block69: while (true) {
                        v1 /* !! */  = (long)(hg.ejdz("elkr", ejev(int ), (int)210) - hg.ejdz("elkp", ejev(int ), (int)209));
lbl11:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case 695013158: {
                                break block69;
                            }
                            case 924693380: {
                                continue block69;
                            }
                        }
                        break;
                    }
                    var3_3 /* !! */  = hg.b;
                    v2 /* !! */  = hg.ks;
                    if (true) ** GOTO lbl21
                    block70: while (true) {
                        v2 /* !! */  = (long)(hg.ejdz("elky", ejev(int ), (int)212) - hg.ejdz("elkw", ejev(int ), (int)211));
lbl21:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -1950175615: {
                                continue block70;
                            }
                            case 695013158: {
                                break block70;
                            }
                        }
                        break;
                    }
                    var2_4 = hg.a;
                    if (var4_2) {
                        throw null;
lbl29:
                        // 16 sources

                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl29
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("ellb", ejev(int ), (int)213)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v3 /* !! */  == hg.ejdz("ellc", ejdw(int ), (int)330)) break;
                        v3 /* !! */  = (long)hg.ejdz("elld", ejdw(int ), (int)331);
                    }
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("elle", ejev(int ), (int)214)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == hg.ejdz("ellf", ejdw(int ), (int)332)) break;
                        v4 /* !! */  = (long)hg.ejdz("elll", ejdw(int ), (int)333);
                    }
                    if (hg.mc.field_1724 == null) break block111;
                    if (var2_4) ** GOTO lbl29
                    v5 /* !! */  = hg.ks;
                    if (true) ** GOTO lbl48
                    block74: while (true) {
                        v5 /* !! */  = (long)(v6 - hg.ejdz("elln", ejev(int ), (int)215));
lbl48:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1755389442: {
                                v6 = hg.ejdz("ello", ejev(int ), (int)216);
                                continue block74;
                            }
                            case -1043738847: {
                                v6 = hg.ejdz("ellp", ejev(int ), (int)217);
                                continue block74;
                            }
                            case 695013158: {
                                break block74;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("ellq", ejev(int ), (int)218)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == hg.ejdz("ells", ejdw(int ), (int)334)) break;
                        v7 /* !! */  = (long)hg.ejdz("ellu", ejdw(int ), (int)335);
                    }
                    if (hg.mc.field_1687 != null) break block112;
                    if (var2_4) ** GOTO lbl29
                }
                if (var2_4 || var2_4) ** GOTO lbl29
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl29
            v8 /* !! */  = hg.ks;
            if (true) ** GOTO lbl73
            block76: while (true) {
                v8 /* !! */  = (long)(v9 - hg.ejdz("ellz", ejev(int ), (int)219));
lbl73:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -161779765: {
                        v9 = hg.ejdz("elmb", ejev(int ), (int)220);
                        continue block76;
                    }
                    case 108916868: {
                        v9 = hg.ejdz("elmc", ejev(int ), (int)221);
                        continue block76;
                    }
                    case 695013158: {
                        break block76;
                    }
                }
                break;
            }
            if (!this.isActivePotion) break block113;
            if (var2_4) ** GOTO lbl29
            v10 /* !! */  = hg.ks;
            if (true) ** GOTO lbl88
            block77: while (true) {
                v10 /* !! */  = (long)(v11 - hg.ejdz("elmf", ejev(int ), (int)222));
lbl88:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -2019866016: {
                        v11 = hg.ejdz("elmg", ejev(int ), (int)223);
                        continue block77;
                    }
                    case -1486997601: {
                        v11 = hg.ejdz("elml", ejev(int ), (int)224);
                        continue block77;
                    }
                    case 695013158: {
                        break block77;
                    }
                }
                break;
            }
            if (this.shouldThrow()) break block113;
            if (var2_4) ** GOTO lbl29
            v12 /* !! */  = hg.ks;
            if (true) ** GOTO lbl103
            block78: while (true) {
                v12 /* !! */  = (long)(v13 - hg.ejdz("elmm", ejev(int ), (int)225));
lbl103:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1654246362: {
                        v13 = hg.ejdz("elmr", ejev(int ), (int)226);
                        continue block78;
                    }
                    case 695013158: {
                        break block78;
                    }
                    case 1213562307: {
                        v13 = hg.ejdz("elms", ejev(int ), (int)227);
                        continue block78;
                    }
                }
                break;
            }
            if (this.spoofed) break block113;
            if (var2_4 || var2_4) ** GOTO lbl29
            v14 = hg.ejdz("elmu", ejdw(int ), (int)336);
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("elmw", ejev(int ), (int)228)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == hg.ejdz("elmy", ejdw(int ), (int)337)) break;
                v15 /* !! */  = (long)hg.ejdz("elmz", ejdw(int ), (int)338);
            }
            this.isActivePotion = v14;
            if (var2_4 || var2_4) ** GOTO lbl29
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_5 = hg.ks - hg.ejdz("elna", ejev(int ), (int)229)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == hg.ejdz("elne", ejdw(int ), (int)339)) break;
                v16 /* !! */  = (long)hg.ejdz("elnf", ejdw(int ), (int)340);
            }
            v17 /* !! */  = hg.ks;
            if (true) ** GOTO lbl131
            block81: while (true) {
                v17 /* !! */  = (long)(v18 - hg.ejdz("elnh", ejev(int ), (int)230));
lbl131:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1334428693: {
                        v18 = hg.ejdz("elnj", ejev(int ), (int)231);
                        continue block81;
                    }
                    case 695013158: {
                        break block81;
                    }
                    case 1388836941: {
                        v18 = hg.ejdz("elnl", ejev(int ), (int)232);
                        continue block81;
                    }
                }
                break;
            }
            if (!this.autoOff.isValue()) break block113;
            if (var2_4 || var2_4) ** GOTO lbl29
            v19 = hg.ejdz("elnn", ejdw(int ), (int)341);
            v20 /* !! */  = hg.ks;
            if (true) ** GOTO lbl147
            block82: while (true) {
                v20 /* !! */  = (long)(v21 - hg.ejdz("elns", ejev(int ), (int)233));
lbl147:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1612707598: {
                        v21 = hg.ejdz("elnt", ejev(int ), (int)234);
                        continue block82;
                    }
                    case -637346938: {
                        v21 = hg.ejdz("elnv", ejev(int ), (int)235);
                        continue block82;
                    }
                    case 522534544: {
                        v21 = hg.ejdz("elnw", ejev(int ), (int)236);
                        continue block82;
                    }
                    case 695013158: {
                        break block82;
                    }
                }
                break;
            }
            this.setState((boolean)v19);
            if (var2_4) ** GOTO lbl29
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_6 = hg.ks - hg.ejdz("elnz", ejev(int ), (int)237)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == hg.ejdz("eloa", ejdw(int ), (int)342)) break;
            v22 /* !! */  = (long)hg.ejdz("elob", ejdw(int ), (int)343);
        }
        if (!this.spoofed) ** GOTO lbl181
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl29
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = hg.ks - hg.ejdz("eloh", ejev(int ), (int)238)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == hg.ejdz("eloj", ejdw(int ), (int)344)) break;
                    v23 /* !! */  = (long)hg.ejdz("elok", ejdw(int ), (int)345);
                }
                this.processThrow();
                if (var2_4) ** GOTO lbl29
lbl181:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)hg.ejdz("elol", ejdw(int ), (int)346);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 1: {
                var3_3 /* !! */  = (int)hg.ejdz("elom", ejdw(int ), (int)347);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl194:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hg.ejdz("elon", ejdw(int ), (int)348);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 3: {
                var3_3 /* !! */  = (int)hg.ejdz("elop", ejdw(int ), (int)349);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl204:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hg.ejdz("eloq", ejdw(int ), (int)350);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl209:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)hg.ejdz("elor", ejdw(int ), (int)351);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl214:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)hg.ejdz("elos", ejdw(int ), (int)352);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl219:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)hg.ejdz("elot", ejdw(int ), (int)353);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 8: {
                var3_3 /* !! */  = (int)hg.ejdz("elou", ejdw(int ), (int)354);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl229:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hg.ejdz("elox", ejdw(int ), (int)355);
                if (!var4_2) ** GOTO lbl194
                throw null;
            }
lbl233:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)hg.ejdz("elpa", ejdw(int ), (int)356);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 11: {
                var3_3 /* !! */  = (int)hg.ejdz("elpg", ejdw(int ), (int)357);
                if (!var4_2) ** GOTO lbl204
                throw null;
            }
lbl242:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)hg.ejdz("elpi", ejdw(int ), (int)358);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl247:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)hg.ejdz("elpj", ejdw(int ), (int)359);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
            case 14: {
                var3_3 /* !! */  = (int)hg.ejdz("elpl", ejdw(int ), (int)360);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
            case 15: {
                var3_3 /* !! */  = (int)hg.ejdz("elpo", ejdw(int ), (int)361);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl276
            }
            case 16: {
                var3_3 /* !! */  = (int)hg.ejdz("elpr", ejdw(int ), (int)362);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl267:
            // 3 sources

            case 17: {
                var3_3 /* !! */  = (int)hg.ejdz("elpu", ejdw(int ), (int)363);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 18: {
                var3_3 /* !! */  = (int)hg.ejdz("elqd", ejdw(int ), (int)364);
                if (!var4_2) ** GOTO lbl209
                throw null;
            }
lbl276:
            // 3 sources

            case 19: {
                var3_3 /* !! */  = (int)hg.ejdz("elqe", ejdw(int ), (int)365);
                if (!var4_2) ** GOTO lbl219
                throw null;
            }
lbl280:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)hg.ejdz("elqf", ejdw(int ), (int)366);
                if (!var4_2) ** GOTO lbl219
                throw null;
            }
lbl284:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)hg.ejdz("elqh", ejdw(int ), (int)367);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl289:
            // 4 sources

            case 22: {
                var3_3 /* !! */  = (int)hg.ejdz("elqk", ejdw(int ), (int)368);
                if (!var4_2) ** GOTO lbl209
                throw null;
            }
lbl293:
            // 2 sources

            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hg.ejdz("elqm", ejdw(int ), (int)369);
                    if (!var4_2) ** GOTO lbl267
                    throw null;
                }
            }
lbl298:
            // 3 sources

            case 24: {
                var3_3 /* !! */  = (int)hg.ejdz("elqo", ejdw(int ), (int)370);
                if (!var4_2) ** GOTO lbl233
                throw null;
            }
lbl302:
            // 3 sources

            case 25: {
                var3_3 /* !! */  = (int)hg.ejdz("elqu", ejdw(int ), (int)371);
                if (!var4_2) ** GOTO lbl298
                throw null;
            }
            case 26: 
        }
        var3_3 /* !! */  = (int)hg.ejdz("elqx", ejdw(int ), (int)372);
        ** while (!var4_2)
lbl309:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void entm() {
        hg.ejew[300] = 2065459102066440149L;
        hg.ejew[301] = -8608845222873642022L;
        hg.ejew[302] = 1316415154001464677L;
        hg.ejew[303] = 5477659621207742534L;
        hg.ejew[304] = 1130022391260695097L;
        hg.ejew[305] = 7217114698184303662L;
        hg.ejew[306] = 76480609785769109L;
        hg.ejew[307] = 7347922563869091916L;
        hg.ejew[308] = 2978956617095652010L;
        hg.ejew[309] = -6678372565843449563L;
        hg.ejew[310] = -6740294168229908618L;
        hg.ejew[311] = 2112585322842306028L;
        hg.ejew[312] = 5839607739821824700L;
        hg.ejew[313] = 654239547119324127L;
        hg.ejew[314] = -6153116638548873580L;
        hg.ejew[315] = 7602246953966160193L;
        hg.ejew[316] = -4957715285105254298L;
        hg.ejew[317] = -2327292118770872281L;
        hg.ejew[318] = 2677086161592369984L;
        hg.ejew[319] = -2540383950072738005L;
        hg.ejew[320] = -6891605707559432020L;
        hg.ejew[321] = -7121696755997962423L;
        hg.ejew[322] = 8228182071545876946L;
        hg.ejew[323] = -6483028612168376744L;
        hg.ejew[324] = 2069347773857195064L;
        hg.ejew[325] = -4106625005161210596L;
        hg.ejew[326] = -8607668340554849809L;
        hg.ejew[327] = -3136457187487012592L;
        hg.ejew[328] = 6371704856539875194L;
        hg.ejew[329] = -3560979594239444330L;
        hg.ejew[330] = 945060220676952664L;
        hg.ejew[331] = 2864287277485789743L;
        hg.ejew[332] = 860444462180909837L;
        hg.ejew[333] = 8123461597069762533L;
        hg.ejew[334] = 5969975335035321822L;
        hg.ejew[335] = -2881723665583008343L;
        hg.ejew[336] = -7461206682972994307L;
        hg.ejew[337] = -8430261963442998597L;
        hg.ejew[338] = 4765717224749544878L;
        hg.ejew[339] = -2725447689497294351L;
        hg.ejew[340] = -1128199686940260325L;
        hg.ejew[341] = -3026018860826412102L;
        hg.ejew[342] = 2972881890127020654L;
        hg.ejew[343] = 8667143319517168325L;
        hg.ejew[344] = 4985737433636353754L;
        hg.ejew[345] = -84103952646513394L;
        hg.ejew[346] = 8808988100624704458L;
        hg.ejew[347] = -5319114993173810399L;
        hg.ejew[348] = -1952065769621020628L;
        hg.ejew[349] = -8288748690574609849L;
        hg.ejew[350] = -3667937511720947530L;
        hg.ejew[351] = -9115696530617628635L;
        hg.ejew[352] = -7950803153663674303L;
        hg.ejew[353] = -3414651424893431054L;
        hg.ejew[354] = 6042169297581729101L;
        hg.ejew[355] = -1017871232904001983L;
        hg.ejew[356] = -6213864958170416781L;
        hg.ejew[357] = 323611675004256199L;
        hg.ejew[358] = -7496766677619117372L;
        hg.ejew[359] = 6820796117526237892L;
        hg.ejew[360] = -1631268309003253703L;
        hg.ejew[361] = 4726250284185120679L;
        hg.ejew[362] = -3043089139751812062L;
        hg.ejew[363] = 4223721955429719213L;
        hg.ejew[364] = 7750325978426205797L;
        hg.ejew[365] = 2214246287198907327L;
        hg.ejew[366] = 2005266934843399163L;
        hg.ejew[367] = 1441815061087113361L;
        hg.ejew[368] = -4560457091878961515L;
        hg.ejew[369] = -7126036817363200305L;
        hg.ejew[370] = 3136350449900177412L;
        hg.ejew[371] = -3389351495168740910L;
        hg.ejew[372] = -2139949054395138425L;
        hg.ejew[373] = 1425911207856181549L;
        hg.ejew[374] = 7429318109232463731L;
        hg.ejew[375] = 2531501899819921072L;
        hg.ejew[376] = 4526274828394315873L;
    }

    private static /* synthetic */ void enua() {
        hg.ejex[0] = -8469691327550224513L;
        hg.ejex[1] = -282254752468111731L;
        hg.ejex[2] = -7387592670471374806L;
        hg.ejex[3] = 1887171976847845626L;
        hg.ejex[4] = 2850540073561446268L;
        hg.ejex[5] = -5411391980727618917L;
        hg.ejex[6] = -5564687058799936037L;
        hg.ejex[7] = -6323711025283036849L;
        hg.ejex[8] = -6805534101719378270L;
        hg.ejex[9] = 5724951373885297651L;
        hg.ejex[10] = -8342123908278469356L;
        hg.ejex[11] = -2815569076506515639L;
        hg.ejex[12] = 1097505319053742388L;
        hg.ejex[13] = 55908628372654841L;
        hg.ejex[14] = 4521950197944999478L;
        hg.ejex[15] = 2984403607259754942L;
        hg.ejex[16] = 2570288212860007825L;
        hg.ejex[17] = 4714294185926843639L;
        hg.ejex[18] = 4347234976192279439L;
        hg.ejex[19] = 1797605420957798045L;
        hg.ejex[20] = -1714966867016073620L;
        hg.ejex[21] = 6574181788770520030L;
        hg.ejex[22] = -1399221352327687306L;
        hg.ejex[23] = 1356082285166125309L;
        hg.ejex[24] = 6190486998048299587L;
        hg.ejex[25] = 1246017967996013651L;
        hg.ejex[26] = 1112524432596832391L;
        hg.ejex[27] = 8381525592175323721L;
        hg.ejex[28] = -408494596905176450L;
        hg.ejex[29] = 761366710134712267L;
        hg.ejex[30] = 715852879088419435L;
        hg.ejex[31] = -7260993154937896943L;
        hg.ejex[32] = -2319216476951410911L;
        hg.ejex[33] = 3529333919794508983L;
        hg.ejex[34] = 8900678658694211712L;
        hg.ejex[35] = 482242691482392575L;
        hg.ejex[36] = 9072199052748929377L;
        hg.ejex[37] = 377175041956986108L;
        hg.ejex[38] = -5167018314201154956L;
        hg.ejex[39] = 2374964768605155324L;
        hg.ejex[40] = -3397914932315709470L;
        hg.ejex[41] = -2206791336523912748L;
        hg.ejex[42] = -4063940319496386275L;
        hg.ejex[43] = -7120137282571474216L;
        hg.ejex[44] = -2212474610594828438L;
        hg.ejex[45] = 7237347797734160087L;
        hg.ejex[46] = 6900056780153862995L;
        hg.ejex[47] = -4852443249090443659L;
        hg.ejex[48] = 8588424301068035485L;
        hg.ejex[49] = -3068377925245643147L;
        hg.ejex[50] = 6006917706301217301L;
        hg.ejex[51] = 6311983079636074906L;
        hg.ejex[52] = 364607467934525209L;
        hg.ejex[53] = 5310319720848099157L;
        hg.ejex[54] = 5304208442888351163L;
        hg.ejex[55] = 4885074756387356442L;
        hg.ejex[56] = 4315660954864009442L;
        hg.ejex[57] = 186062263771069871L;
        hg.ejex[58] = 6533340446028415675L;
        hg.ejex[59] = -3616354689887990336L;
        hg.ejex[60] = -521239458231968280L;
        hg.ejex[61] = -7910339795521747362L;
        hg.ejex[62] = 5852761655945960206L;
        hg.ejex[63] = 1373266790655909439L;
        hg.ejex[64] = -4913374573219568040L;
        hg.ejex[65] = 1336111558414963962L;
        hg.ejex[66] = -6688787682843085866L;
        hg.ejex[67] = -2625473147142624743L;
        hg.ejex[68] = -563606531590596569L;
        hg.ejex[69] = -622655396208498250L;
        hg.ejex[70] = 121754077614621001L;
        hg.ejex[71] = -3764785360811768488L;
        hg.ejex[72] = 2339386444406545852L;
        hg.ejex[73] = -359329025384736408L;
        hg.ejex[74] = -438122541763134775L;
        hg.ejex[75] = -2190916085079653853L;
        hg.ejex[76] = -1121778058912344131L;
        hg.ejex[77] = 6771722446016659478L;
        hg.ejex[78] = 4796791442804028541L;
        hg.ejex[79] = -1473656236184550207L;
        hg.ejex[80] = 1319094411110341326L;
        hg.ejex[81] = 6096191151700879226L;
        hg.ejex[82] = 6717514957155091601L;
        hg.ejex[83] = 778759683954387636L;
        hg.ejex[84] = 3929378024744019501L;
        hg.ejex[85] = -6949254883419226358L;
        hg.ejex[86] = -2729118148081761492L;
        hg.ejex[87] = -1690282603044029885L;
        hg.ejex[88] = 936427273161937437L;
        hg.ejex[89] = 6376260646912898597L;
        hg.ejex[90] = -3711179768772630155L;
        hg.ejex[91] = -780162339276477121L;
        hg.ejex[92] = -7858970335955542013L;
        hg.ejex[93] = -4911502913100923385L;
        hg.ejex[94] = -3685001996869575518L;
        hg.ejex[95] = 6795732082504655096L;
        hg.ejex[96] = -8690722388963928900L;
        hg.ejex[97] = 3834151259781249309L;
        hg.ejex[98] = -4677284025301469834L;
        hg.ejex[99] = 9178947825370514862L;
    }

    private static /* synthetic */ int ejdw(int n2) {
        return ejdx[n2] ^ ejdy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean canBuff() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("ejlh", ejev(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hg.ejdz("ejlj", ejdw(int ), (int)135)) break;
            v0 /* !! */  = (long)hg.ejdz("ejlk", ejdw(int ), (int)136);
        }
        var3_1 = hg.c;
        v1 /* !! */  = hg.ks;
        if (true) ** GOTO lbl12
        block72: while (true) {
            v1 /* !! */  = (long)(hg.ejdz("ejln", ejev(int ), (int)49) - hg.ejdz("ejlm", ejev(int ), (int)48));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1971495168: {
                    continue block72;
                }
                case 695013158: {
                    break block72;
                }
            }
            break;
        }
        var2_2 /* !! */  = hg.b;
        v2 /* !! */  = hg.ks;
        if (true) ** GOTO lbl22
        block73: while (true) {
            v2 /* !! */  = (long)(v3 - hg.ejdz("ejlo", ejev(int ), (int)50));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -128601414: {
                    v3 = hg.ejdz("ejlr", ejev(int ), (int)51);
                    continue block73;
                }
                case 151497920: {
                    v3 = hg.ejdz("ejls", ejev(int ), (int)52);
                    continue block73;
                }
                case 695013158: {
                    break block73;
                }
            }
            break;
        }
        var1_3 = hg.a;
        if (var3_1) {
            throw null;
lbl34:
            // 12 sources

            return (boolean)hg.ejdz("ejlt", ejdw(int ), (int)137);
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        v4 /* !! */  = hg.ks;
        if (true) ** GOTO lbl41
        block75: while (true) {
            v4 /* !! */  = (long)(v5 - hg.ejdz("ejlu", ejev(int ), (int)53));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1628685058: {
                    v5 = hg.ejdz("ejlv", ejev(int ), (int)54);
                    continue block75;
                }
                case 695013158: {
                    break block75;
                }
                case 1516806088: {
                    v5 = hg.ejdz("ejlx", ejev(int ), (int)55);
                    continue block75;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("ejmd", ejev(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == hg.ejdz("ejme", ejdw(int ), (int)138)) break;
            v6 /* !! */  = (long)hg.ejdz("ejmf", ejdw(int ), (int)139);
        }
        if (hg.mc.field_1724 == null) ** GOTO lbl82
        if (var1_3) ** GOTO lbl34
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("ejmg", ejev(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == hg.ejdz("ejmh", ejdw(int ), (int)140)) break;
            v7 /* !! */  = (long)hg.ejdz("ejmi", ejdw(int ), (int)141);
        }
        v8 /* !! */  = hg.ks;
        if (true) ** GOTO lbl68
        block78: while (true) {
            v8 /* !! */  = (long)(v9 - hg.ejdz("ejmk", ejev(int ), (int)58));
lbl68:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1504274323: {
                    v9 = hg.ejdz("ejmn", ejev(int ), (int)59);
                    continue block78;
                }
                case -205153190: {
                    v9 = hg.ejdz("ejmo", ejev(int ), (int)60);
                    continue block78;
                }
                case 695013158: {
                    break block78;
                }
            }
            break;
        }
        if (hg.mc.field_1687 != null) ** GOTO lbl84
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl34
lbl82:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl34
                return (boolean)hg.ejdz("ejms", ejdw(int ), (int)142);
            }
lbl84:
            // 1 sources

            if (var1_3 || var1_3) ** GOTO lbl34
            v10 /* !! */  = hg.ks;
            if (true) ** GOTO lbl89
            block79: while (true) {
                v10 /* !! */  = (long)(v11 - hg.ejdz("ejmu", ejev(int ), (int)61));
lbl89:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 685305933: {
                        v11 = hg.ejdz("ejmv", ejev(int ), (int)62);
                        continue block79;
                    }
                    case 695013158: {
                        break block79;
                    }
                    case 816235556: {
                        v11 = hg.ejdz("ejmw", ejev(int ), (int)63);
                        continue block79;
                    }
                }
                break;
            }
            v12 /* !! */  = hg.ks;
            if (true) ** GOTO lbl102
            block80: while (true) {
                v12 /* !! */  = (long)(hg.ejdz("ejnb", ejev(int ), (int)65) - hg.ejdz("ejmz", ejev(int ), (int)64));
lbl102:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case 100255739: {
                        continue block80;
                    }
                    case 695013158: {
                        break block80;
                    }
                }
                break;
            }
            if (this.canBuff(hg$PotionType.STRENGTH)) ** GOTO lbl150
            if (var1_3) ** GOTO lbl34
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("ejnd", ejev(int ), (int)66)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v13 /* !! */  == hg.ejdz("ejnf", ejdw(int ), (int)143)) break;
                v13 /* !! */  = (long)hg.ejdz("ejnh", ejdw(int ), (int)144);
            }
            v14 /* !! */  = hg.ks;
            if (true) ** GOTO lbl119
            block82: while (true) {
                v14 /* !! */  = (long)(hg.ejdz("ejnk", ejev(int ), (int)68) - hg.ejdz("ejnj", ejev(int ), (int)67));
lbl119:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case 563249888: {
                        continue block82;
                    }
                    case 695013158: {
                        break block82;
                    }
                }
                break;
            }
            if (this.canBuff(hg$PotionType.SPEED)) ** GOTO lbl150
            if (var1_3) ** GOTO lbl34
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("ejno", ejev(int ), (int)69)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v15 /* !! */  == hg.ejdz("ejnq", ejdw(int ), (int)145)) break;
                v15 /* !! */  = (long)hg.ejdz("ejnr", ejdw(int ), (int)146);
            }
            v16 /* !! */  = hg.ks;
            if (true) ** GOTO lbl136
            block84: while (true) {
                v16 /* !! */  = (long)(v17 - hg.ejdz("ejns", ejev(int ), (int)70));
lbl136:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -823970780: {
                        v17 = hg.ejdz("ejnt", ejev(int ), (int)71);
                        continue block84;
                    }
                    case -368445571: {
                        v17 = hg.ejdz("ejnu", ejev(int ), (int)72);
                        continue block84;
                    }
                    case 695013158: {
                        break block84;
                    }
                    case 1458519639: {
                        v17 = hg.ejdz("ejnv", ejev(int ), (int)73);
                        continue block84;
                    }
                }
                break;
            }
            if (!this.canBuff(hg$PotionType.FIRE_RESISTANCE)) ** GOTO lbl208
            if (var1_3) ** GOTO lbl34
lbl150:
            // 3 sources

            if (var1_3 || var1_3) ** GOTO lbl34
            v18 /* !! */  = hg.ks;
            if (true) ** GOTO lbl155
            block85: while (true) {
                v18 /* !! */  = (long)(v19 - hg.ejdz("ejnz", ejev(int ), (int)74));
lbl155:
                // 2 sources

                switch ((int)v18 /* !! */ ) {
                    case 359729500: {
                        v19 = hg.ejdz("ejob", ejev(int ), (int)75);
                        continue block85;
                    }
                    case 695013158: {
                        break block85;
                    }
                    case 1213097246: {
                        v19 = hg.ejdz("ejod", ejev(int ), (int)76);
                        continue block85;
                    }
                    case 1226872268: {
                        v19 = hg.ejdz("ejoe", ejev(int ), (int)77);
                        continue block85;
                    }
                }
                break;
            }
            v20 /* !! */  = hg.ks;
            if (true) ** GOTO lbl171
            block86: while (true) {
                v20 /* !! */  = (long)(v21 - hg.ejdz("ejoi", ejev(int ), (int)78));
lbl171:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1178324318: {
                        v21 = hg.ejdz("ejol", ejev(int ), (int)79);
                        continue block86;
                    }
                    case 95211267: {
                        v21 = hg.ejdz("ejoo", ejev(int ), (int)80);
                        continue block86;
                    }
                    case 695013158: {
                        break block86;
                    }
                }
                break;
            }
            v22 = hg.mc.field_1724;
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_5 = hg.ks - hg.ejdz("ejov", ejev(int ), (int)81)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v23 /* !! */  == hg.ejdz("ejox", ejdw(int ), (int)147)) break;
                v23 /* !! */  = (long)hg.ejdz("ejoy", ejdw(int ), (int)148);
            }
            if (!v22.method_24828()) ** GOTO lbl208
            if (var1_3) ** GOTO lbl34
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_6 = hg.ks - hg.ejdz("ejpb", ejev(int ), (int)82)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v24 /* !! */  == hg.ejdz("ejpd", ejdw(int ), (int)149)) break;
                v24 /* !! */  = (long)hg.ejdz("ejph", ejdw(int ), (int)150);
            }
            v25 = hg.ejdz("ekce", ekcd(int ), (int)83);
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_7 = hg.ks - hg.ejdz("ekcf", ejev(int ), (int)84)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v26 /* !! */  == hg.ejdz("ekcg", ejdw(int ), (int)151)) break;
                v26 /* !! */  = (long)hg.ejdz("ekch", ejdw(int ), (int)152);
            }
            if (!this.timer.finished((double)v25)) ** GOTO lbl208
            if (var1_3) ** GOTO lbl34
            v27 = hg.ejdz("ekci", ejdw(int ), (int)153);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl211
lbl208:
            // 3 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v27 = hg.ejdz("ekcj", ejdw(int ), (int)154);
lbl211:
            // 2 sources

            return (boolean)v27;
            case 0: {
                var2_2 /* !! */  = (int)hg.ejdz("ekck", ejdw(int ), (int)155);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl217:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcl", ejdw(int ), (int)156);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl222:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcm", ejdw(int ), (int)157);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl227:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcn", ejdw(int ), (int)158);
                if (!var3_1) ** GOTO lbl222
                throw null;
            }
lbl231:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hg.ejdz("ekco", ejdw(int ), (int)159);
                if (!var3_1) ** GOTO lbl217
                throw null;
            }
lbl235:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcp", ejdw(int ), (int)160);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl240:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcq", ejdw(int ), (int)161);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl245:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcr", ejdw(int ), (int)162);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 8: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcs", ejdw(int ), (int)163);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl255:
            // 3 sources

            case 9: {
                do {
                    var2_2 /* !! */  = (int)hg.ejdz("ekct", ejdw(int ), (int)164);
                } while (!var3_1);
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcu", ejdw(int ), (int)165);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl265:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcv", ejdw(int ), (int)166);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl287
            }
            case 12: {
                do {
                    var2_2 /* !! */  = (int)hg.ejdz("ekcw", ejdw(int ), (int)167);
                } while (!var3_1);
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcx", ejdw(int ), (int)168);
                if (!var3_1) ** GOTO lbl245
                throw null;
            }
lbl279:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcy", ejdw(int ), (int)169);
                if (!var3_1) ** GOTO lbl231
                throw null;
            }
lbl283:
            // 4 sources

            case 15: {
                var2_2 /* !! */  = (int)hg.ejdz("ekcz", ejdw(int ), (int)170);
                if (!var3_1) ** GOTO lbl265
                throw null;
            }
lbl287:
            // 3 sources

            case 16: {
                var2_2 /* !! */  = (int)hg.ejdz("ekda", ejdw(int ), (int)171);
                if (!var3_1) ** GOTO lbl235
                throw null;
            }
lbl291:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)hg.ejdz("ekdb", ejdw(int ), (int)172);
                if (!var3_1) ** GOTO lbl279
                throw null;
            }
            case 18: {
                var2_2 /* !! */  = (int)hg.ejdz("ekdc", ejdw(int ), (int)173);
                if (!var3_1) ** GOTO lbl240
                throw null;
            }
            case 19: 
        }
        do {
            var2_2 /* !! */  = (int)hg.ejdz("ekdd", ejdw(int ), (int)174);
        } while (!var3_1);
        throw null;
    }

    /*
     * Exception decompiling
     */
    private void sendSequencedPacket(class_7204 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 79[SWITCH]
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

    private static /* synthetic */ long ejev(int n2) {
        return ejew[n2] ^ ejex[n2];
    }

    private static /* synthetic */ void enqg() {
        hg.ejdy[600] = 1616287873;
        hg.ejdy[601] = 192532129;
        hg.ejdy[602] = -330205344;
        hg.ejdy[603] = 1149586948;
        hg.ejdy[604] = 1208568300;
    }

    private static /* synthetic */ void enmb() {
        hg.ejdx[500] = -1720496712;
        hg.ejdx[501] = -1409245802;
        hg.ejdx[502] = 993814551;
        hg.ejdx[503] = -566077097;
        hg.ejdx[504] = -2071525060;
        hg.ejdx[505] = 1494557810;
        hg.ejdx[506] = -1528584877;
        hg.ejdx[507] = 1826126595;
        hg.ejdx[508] = -1269403001;
        hg.ejdx[509] = -951641207;
        hg.ejdx[510] = -922449254;
        hg.ejdx[511] = 382285882;
        hg.ejdx[512] = -1217659006;
        hg.ejdx[513] = 2080057271;
        hg.ejdx[514] = 1310020267;
        hg.ejdx[515] = 62129797;
        hg.ejdx[516] = 588758099;
        hg.ejdx[517] = 1391222228;
        hg.ejdx[518] = -1959273206;
        hg.ejdx[519] = 1426967444;
        hg.ejdx[520] = 2080572378;
        hg.ejdx[521] = 1128344157;
        hg.ejdx[522] = 587879407;
        hg.ejdx[523] = -1820954984;
        hg.ejdx[524] = 663126815;
        hg.ejdx[525] = -1273436051;
        hg.ejdx[526] = 1422304653;
        hg.ejdx[527] = -1858561156;
        hg.ejdx[528] = -539108863;
        hg.ejdx[529] = 326487863;
        hg.ejdx[530] = 1327978741;
        hg.ejdx[531] = -1900350566;
        hg.ejdx[532] = -1978563311;
        hg.ejdx[533] = -542953504;
        hg.ejdx[534] = 1516212064;
        hg.ejdx[535] = -2090932529;
        hg.ejdx[536] = -1774109214;
        hg.ejdx[537] = -91175461;
        hg.ejdx[538] = 334159546;
        hg.ejdx[539] = -963633496;
        hg.ejdx[540] = -841449919;
        hg.ejdx[541] = -2033353430;
        hg.ejdx[542] = 1987672140;
        hg.ejdx[543] = 517346425;
        hg.ejdx[544] = 437730838;
        hg.ejdx[545] = -1731052428;
        hg.ejdx[546] = -1939305716;
        hg.ejdx[547] = -1025299896;
        hg.ejdx[548] = 1407604972;
        hg.ejdx[549] = 669126382;
        hg.ejdx[550] = -1113914236;
        hg.ejdx[551] = -2122019304;
        hg.ejdx[552] = -2002273595;
        hg.ejdx[553] = 1571847290;
        hg.ejdx[554] = -572628010;
        hg.ejdx[555] = 1508632773;
        hg.ejdx[556] = 1438093405;
        hg.ejdx[557] = -1501412139;
        hg.ejdx[558] = -293677228;
        hg.ejdx[559] = 2131002823;
        hg.ejdx[560] = -1808799449;
        hg.ejdx[561] = 60099706;
        hg.ejdx[562] = -1145572188;
        hg.ejdx[563] = -7089594;
        hg.ejdx[564] = 305318561;
        hg.ejdx[565] = -1173001947;
        hg.ejdx[566] = -1098226105;
        hg.ejdx[567] = 1617561573;
        hg.ejdx[568] = 871272717;
        hg.ejdx[569] = -1892472720;
        hg.ejdx[570] = 160034886;
        hg.ejdx[571] = 1039361295;
        hg.ejdx[572] = -956728797;
        hg.ejdx[573] = 1829762762;
        hg.ejdx[574] = -2075420173;
        hg.ejdx[575] = 1357268683;
        hg.ejdx[576] = 163227960;
        hg.ejdx[577] = -1908217608;
        hg.ejdx[578] = -530815730;
        hg.ejdx[579] = -1111595804;
        hg.ejdx[580] = 1938466043;
        hg.ejdx[581] = -933652648;
        hg.ejdx[582] = -331962969;
        hg.ejdx[583] = -789577820;
        hg.ejdx[584] = 1738642937;
        hg.ejdx[585] = -711300722;
        hg.ejdx[586] = -159596940;
        hg.ejdx[587] = -1710702725;
        hg.ejdx[588] = 1897022276;
        hg.ejdx[589] = 1841553466;
        hg.ejdx[590] = 1866468422;
        hg.ejdx[591] = 109954778;
        hg.ejdx[592] = 532634642;
        hg.ejdx[593] = -987043091;
        hg.ejdx[594] = 171979245;
        hg.ejdx[595] = 152303263;
        hg.ejdx[596] = -1472184510;
        hg.ejdx[597] = -486241193;
        hg.ejdx[598] = 1766000816;
        hg.ejdx[599] = -1009096483;
    }

    private static /* synthetic */ void enrl() {
        hg.ejew[100] = -4415887793739275299L;
        hg.ejew[101] = -3140796952290845988L;
        hg.ejew[102] = 7056516958359123840L;
        hg.ejew[103] = 3469748419156160452L;
        hg.ejew[104] = 4525999301432774501L;
        hg.ejew[105] = 944503797991488553L;
        hg.ejew[106] = -7501550982519573557L;
        hg.ejew[107] = -4427517948103778193L;
        hg.ejew[108] = -5668061569137507308L;
        hg.ejew[109] = -4724921417712370336L;
        hg.ejew[110] = -1755018852283941111L;
        hg.ejew[111] = 8589304257725975638L;
        hg.ejew[112] = 1305864909000997062L;
        hg.ejew[113] = -8586217162834653374L;
        hg.ejew[114] = 1212668003586306703L;
        hg.ejew[115] = -3568840179469110308L;
        hg.ejew[116] = -7131215908136226638L;
        hg.ejew[117] = 4433513642918265288L;
        hg.ejew[118] = -1007297627340922394L;
        hg.ejew[119] = 3508330770399633179L;
        hg.ejew[120] = -2906529214234646762L;
        hg.ejew[121] = -797344427750558632L;
        hg.ejew[122] = -3328803143825806047L;
        hg.ejew[123] = 7314301164407121658L;
        hg.ejew[124] = -2149396552883537281L;
        hg.ejew[125] = 7977792076423974687L;
        hg.ejew[126] = -662928148905064992L;
        hg.ejew[127] = -2502628748077397049L;
        hg.ejew[128] = 5273472594895209276L;
        hg.ejew[129] = 8103470999855190307L;
        hg.ejew[130] = 3091476262986218195L;
        hg.ejew[131] = -7749331633472926974L;
        hg.ejew[132] = 5985969551988190724L;
        hg.ejew[133] = -7455584090737017283L;
        hg.ejew[134] = -9099782264527304814L;
        hg.ejew[135] = -4803742670778694466L;
        hg.ejew[136] = -5714336344102421178L;
        hg.ejew[137] = 5732694454295737385L;
        hg.ejew[138] = 297837340428725370L;
        hg.ejew[139] = -5538010073160019901L;
        hg.ejew[140] = 7027176226280061381L;
        hg.ejew[141] = 3736885201684885657L;
        hg.ejew[142] = 3180925567208200167L;
        hg.ejew[143] = 1247405502381980971L;
        hg.ejew[144] = 2830684054346668219L;
        hg.ejew[145] = -1284135067283719855L;
        hg.ejew[146] = -6106600908277589174L;
        hg.ejew[147] = 7341377288636478686L;
        hg.ejew[148] = -8698077495865068856L;
        hg.ejew[149] = 2007492309799178449L;
        hg.ejew[150] = 8900127623899537692L;
        hg.ejew[151] = -4465707571921390705L;
        hg.ejew[152] = -4442917604644243602L;
        hg.ejew[153] = -6423100955923606338L;
        hg.ejew[154] = -4841864563288358528L;
        hg.ejew[155] = -1975668677514356630L;
        hg.ejew[156] = -1068817409430259989L;
        hg.ejew[157] = 8683720073258896590L;
        hg.ejew[158] = -3165404670061556731L;
        hg.ejew[159] = -615693817954284768L;
        hg.ejew[160] = -8454905095130892789L;
        hg.ejew[161] = -6651931813565731635L;
        hg.ejew[162] = -4858018579658022638L;
        hg.ejew[163] = 5436434618074388886L;
        hg.ejew[164] = 8376591003070584378L;
        hg.ejew[165] = -4849994439766081840L;
        hg.ejew[166] = 1789336877272076131L;
        hg.ejew[167] = 354803007234280779L;
        hg.ejew[168] = 4784794161619121903L;
        hg.ejew[169] = 2475086017739676530L;
        hg.ejew[170] = -2858252736080463067L;
        hg.ejew[171] = 2547975065834629633L;
        hg.ejew[172] = -3136889683439401245L;
        hg.ejew[173] = 9077601838352369046L;
        hg.ejew[174] = 8519400425049706034L;
        hg.ejew[175] = -8073239067378982520L;
        hg.ejew[176] = -9152454237676536293L;
        hg.ejew[177] = -7357184471261205333L;
        hg.ejew[178] = 7297536919470360411L;
        hg.ejew[179] = 4548257251111319235L;
        hg.ejew[180] = -1794190933929577727L;
        hg.ejew[181] = 5216337302093731036L;
        hg.ejew[182] = 9020398073972695968L;
        hg.ejew[183] = -6118887756422365949L;
        hg.ejew[184] = -8568204793288269790L;
        hg.ejew[185] = 625943280131727267L;
        hg.ejew[186] = -2402460581531584252L;
        hg.ejew[187] = -9210330475323069565L;
        hg.ejew[188] = -398047379181494958L;
        hg.ejew[189] = 4047597696349724686L;
        hg.ejew[190] = -1544035775249551673L;
        hg.ejew[191] = 5124355573869306705L;
        hg.ejew[192] = 2150578529773268346L;
        hg.ejew[193] = 8634204767245903439L;
        hg.ejew[194] = -2781990375006491385L;
        hg.ejew[195] = 1606074734636402659L;
        hg.ejew[196] = -2542296058836895468L;
        hg.ejew[197] = -6413586101823453594L;
        hg.ejew[198] = 8854582736585975748L;
        hg.ejew[199] = -1326633114053988851L;
    }

    private static /* synthetic */ void enox() {
        hg.ejdy[300] = -546338276;
        hg.ejdy[301] = 703680636;
        hg.ejdy[302] = 89880878;
        hg.ejdy[303] = -992054848;
        hg.ejdy[304] = 1739468020;
        hg.ejdy[305] = 1999276361;
        hg.ejdy[306] = 517166745;
        hg.ejdy[307] = 1518988375;
        hg.ejdy[308] = 2116980083;
        hg.ejdy[309] = -310088323;
        hg.ejdy[310] = -1805737303;
        hg.ejdy[311] = -1724060439;
        hg.ejdy[312] = -762843180;
        hg.ejdy[313] = 1941100504;
        hg.ejdy[314] = -286742318;
        hg.ejdy[315] = 1187978030;
        hg.ejdy[316] = 701861363;
        hg.ejdy[317] = -1872497023;
        hg.ejdy[318] = -667865875;
        hg.ejdy[319] = 728040785;
        hg.ejdy[320] = 1929027816;
        hg.ejdy[321] = -2010430793;
        hg.ejdy[322] = -1411967900;
        hg.ejdy[323] = 944462097;
        hg.ejdy[324] = -93918248;
        hg.ejdy[325] = -616235407;
        hg.ejdy[326] = 52059690;
        hg.ejdy[327] = -1936179240;
        hg.ejdy[328] = -499544872;
        hg.ejdy[329] = -998381557;
        hg.ejdy[330] = 1973300051;
        hg.ejdy[331] = -1783641363;
        hg.ejdy[332] = 1301897709;
        hg.ejdy[333] = 1687087384;
        hg.ejdy[334] = -2076655777;
        hg.ejdy[335] = -651780598;
        hg.ejdy[336] = 264356736;
        hg.ejdy[337] = 2046280882;
        hg.ejdy[338] = 1578178936;
        hg.ejdy[339] = 1624835096;
        hg.ejdy[340] = 610680312;
        hg.ejdy[341] = 1329596017;
        hg.ejdy[342] = 61344928;
        hg.ejdy[343] = 2100235859;
        hg.ejdy[344] = 1990294309;
        hg.ejdy[345] = 1236107711;
        hg.ejdy[346] = -858900728;
        hg.ejdy[347] = 448532915;
        hg.ejdy[348] = 285548714;
        hg.ejdy[349] = 1006394468;
        hg.ejdy[350] = 568200046;
        hg.ejdy[351] = -873142885;
        hg.ejdy[352] = 358937597;
        hg.ejdy[353] = 1157321212;
        hg.ejdy[354] = -1542123059;
        hg.ejdy[355] = 654423904;
        hg.ejdy[356] = 1107173360;
        hg.ejdy[357] = -205766476;
        hg.ejdy[358] = -3964894;
        hg.ejdy[359] = -1759251946;
        hg.ejdy[360] = -807659207;
        hg.ejdy[361] = -2092016828;
        hg.ejdy[362] = -367994281;
        hg.ejdy[363] = 743049628;
        hg.ejdy[364] = 679259800;
        hg.ejdy[365] = -1320591297;
        hg.ejdy[366] = 1734867213;
        hg.ejdy[367] = -640519151;
        hg.ejdy[368] = 1508013886;
        hg.ejdy[369] = 889483947;
        hg.ejdy[370] = -724158309;
        hg.ejdy[371] = -939506043;
        hg.ejdy[372] = 401949549;
        hg.ejdy[373] = 168388564;
        hg.ejdy[374] = -897575851;
        hg.ejdy[375] = -1647286029;
        hg.ejdy[376] = 904295259;
        hg.ejdy[377] = 403611229;
        hg.ejdy[378] = -1230130672;
        hg.ejdy[379] = -530999953;
        hg.ejdy[380] = -582395812;
        hg.ejdy[381] = 1422832279;
        hg.ejdy[382] = 672539109;
        hg.ejdy[383] = -254765413;
        hg.ejdy[384] = -1326578625;
        hg.ejdy[385] = 431399957;
        hg.ejdy[386] = -1153935819;
        hg.ejdy[387] = 636320095;
        hg.ejdy[388] = 1905208055;
        hg.ejdy[389] = -1244118913;
        hg.ejdy[390] = 1576867822;
        hg.ejdy[391] = 1074111960;
        hg.ejdy[392] = 2018114173;
        hg.ejdy[393] = -48765018;
        hg.ejdy[394] = 2127395595;
        hg.ejdy[395] = -2080762992;
        hg.ejdy[396] = 1759579381;
        hg.ejdy[397] = -982909735;
        hg.ejdy[398] = -453142687;
        hg.ejdy[399] = 257428720;
    }

    private static /* synthetic */ void enva() {
        hg.ejex[100] = -5634500231805193393L;
        hg.ejex[101] = -7374227058704597478L;
        hg.ejex[102] = -5262522023553548726L;
        hg.ejex[103] = 6440353689660757813L;
        hg.ejex[104] = 8459142498030802599L;
        hg.ejex[105] = 1956032059065670931L;
        hg.ejex[106] = 6889720455930632303L;
        hg.ejex[107] = -4517795506332989356L;
        hg.ejex[108] = 6464582977606538280L;
        hg.ejex[109] = -8837033389616533566L;
        hg.ejex[110] = -7181012915908407503L;
        hg.ejex[111] = -2259796863117835913L;
        hg.ejex[112] = -7938690061412205562L;
        hg.ejex[113] = -547591854394705454L;
        hg.ejex[114] = 8221112516055444858L;
        hg.ejex[115] = -7300991935962741308L;
        hg.ejex[116] = -203421604531975955L;
        hg.ejex[117] = -5907204274999201106L;
        hg.ejex[118] = -5463260113746896308L;
        hg.ejex[119] = 8103746789505329925L;
        hg.ejex[120] = -2056219653228869566L;
        hg.ejex[121] = 3795439480214673991L;
        hg.ejex[122] = -7938708378497670583L;
        hg.ejex[123] = -6629401378258255973L;
        hg.ejex[124] = -2469975856977379276L;
        hg.ejex[125] = -1539843667201403649L;
        hg.ejex[126] = -5580185751134924528L;
        hg.ejex[127] = -6530857308029239767L;
        hg.ejex[128] = -4681738187360709647L;
        hg.ejex[129] = -566814429628809377L;
        hg.ejex[130] = -1873496740580115728L;
        hg.ejex[131] = 8310828626039815113L;
        hg.ejex[132] = -3468629606437837468L;
        hg.ejex[133] = 8668935797656648296L;
        hg.ejex[134] = 7279266752432954678L;
        hg.ejex[135] = 2202005869074361245L;
        hg.ejex[136] = 3922556204055136134L;
        hg.ejex[137] = -5181708641802141043L;
        hg.ejex[138] = -4877015657371068311L;
        hg.ejex[139] = -6347433174556623597L;
        hg.ejex[140] = 4147023091789553810L;
        hg.ejex[141] = -662721566669559893L;
        hg.ejex[142] = 6294644797449496293L;
        hg.ejex[143] = -1572996059862924715L;
        hg.ejex[144] = -5965148816718055774L;
        hg.ejex[145] = 6287631707670834751L;
        hg.ejex[146] = -4633557426664963102L;
        hg.ejex[147] = 8377912734239101831L;
        hg.ejex[148] = 3940634593971464716L;
        hg.ejex[149] = -982766992500868402L;
        hg.ejex[150] = 1668992743529389543L;
        hg.ejex[151] = -5983104577988918530L;
        hg.ejex[152] = 6663846474459129963L;
        hg.ejex[153] = 2204788559131738749L;
        hg.ejex[154] = 7676447715883044682L;
        hg.ejex[155] = -6057650575716488034L;
        hg.ejex[156] = 2899744242315768788L;
        hg.ejex[157] = -2925144573810495681L;
        hg.ejex[158] = -2679820180780506605L;
        hg.ejex[159] = -8879988328456822742L;
        hg.ejex[160] = -5445722769749483327L;
        hg.ejex[161] = 2913064022832915617L;
        hg.ejex[162] = -2937997375225455708L;
        hg.ejex[163] = 5500810913706770251L;
        hg.ejex[164] = -7107698598364758653L;
        hg.ejex[165] = -6445416093222445057L;
        hg.ejex[166] = 4471869367316336313L;
        hg.ejex[167] = 9121236792804787316L;
        hg.ejex[168] = -8093217583022629014L;
        hg.ejex[169] = -6940498147017083237L;
        hg.ejex[170] = -3077344756573383279L;
        hg.ejex[171] = -1303967931061141321L;
        hg.ejex[172] = -3835696693429461117L;
        hg.ejex[173] = -6749168014771750538L;
        hg.ejex[174] = 7577860805267986958L;
        hg.ejex[175] = -8861344550624407613L;
        hg.ejex[176] = 2650371124844670851L;
        hg.ejex[177] = 8585612733926953332L;
        hg.ejex[178] = 976082025122106735L;
        hg.ejex[179] = -8443565718807216802L;
        hg.ejex[180] = -3631729703933387590L;
        hg.ejex[181] = -4709507819615131621L;
        hg.ejex[182] = -6727576334170570647L;
        hg.ejex[183] = 3685355337737771043L;
        hg.ejex[184] = -895209197247884596L;
        hg.ejex[185] = 631908119451497929L;
        hg.ejex[186] = 8909467683772141695L;
        hg.ejex[187] = 367352072166173478L;
        hg.ejex[188] = 702271632651308296L;
        hg.ejex[189] = -6146714422270739089L;
        hg.ejex[190] = 6900029875355589535L;
        hg.ejex[191] = 4437800781540173263L;
        hg.ejex[192] = -6446312225469857531L;
        hg.ejex[193] = -1394688616057304830L;
        hg.ejex[194] = -294427199116130990L;
        hg.ejex[195] = -1772169332436469121L;
        hg.ejex[196] = 1017802222189769889L;
        hg.ejex[197] = 7841331310314772512L;
        hg.ejex[198] = 3443846947010008019L;
        hg.ejex[199] = -5842751373610848418L;
    }

    private static /* synthetic */ void envx() {
        hg.ejex[200] = 9164137623372938780L;
        hg.ejex[201] = -7241086986321147091L;
        hg.ejex[202] = -5809083960912864353L;
        hg.ejex[203] = -3930483301301475158L;
        hg.ejex[204] = -5187427883258102678L;
        hg.ejex[205] = -5756587874961551094L;
        hg.ejex[206] = 7051836633596070783L;
        hg.ejex[207] = -5989763363511828823L;
        hg.ejex[208] = -7641227056774266738L;
        hg.ejex[209] = 279143831818604624L;
        hg.ejex[210] = 6933589695006494627L;
        hg.ejex[211] = -351039637791718389L;
        hg.ejex[212] = 4039247580287312892L;
        hg.ejex[213] = -5619936104157669607L;
        hg.ejex[214] = 7615364533957995280L;
        hg.ejex[215] = 1106431660246231094L;
        hg.ejex[216] = 1386732496816241026L;
        hg.ejex[217] = 8451928213802479924L;
        hg.ejex[218] = -4851002770385024411L;
        hg.ejex[219] = -865793290536619195L;
        hg.ejex[220] = 1148403430722515523L;
        hg.ejex[221] = -1520570078200031168L;
        hg.ejex[222] = 8467822343666778729L;
        hg.ejex[223] = 505992825435426474L;
        hg.ejex[224] = -7084245505255375686L;
        hg.ejex[225] = -6400307489366690087L;
        hg.ejex[226] = 8622643223983573275L;
        hg.ejex[227] = 4473172449779031868L;
        hg.ejex[228] = 3067360692949485448L;
        hg.ejex[229] = -915538747867467339L;
        hg.ejex[230] = -2215555102822170661L;
        hg.ejex[231] = -1895152170605300469L;
        hg.ejex[232] = -7189454339730098578L;
        hg.ejex[233] = 5292683424342827664L;
        hg.ejex[234] = 407982376518902489L;
        hg.ejex[235] = 1026508313794327238L;
        hg.ejex[236] = -2814518140901390326L;
        hg.ejex[237] = -4062841607747985109L;
        hg.ejex[238] = 8623771013790420780L;
        hg.ejex[239] = -959713909825362790L;
        hg.ejex[240] = -5166292824081572218L;
        hg.ejex[241] = 3416872190295180565L;
        hg.ejex[242] = -327606497576734026L;
        hg.ejex[243] = 4048263876659476319L;
        hg.ejex[244] = -144621056495100416L;
        hg.ejex[245] = -5501891138161289553L;
        hg.ejex[246] = 5044779414658541744L;
        hg.ejex[247] = 4321200399370523141L;
        hg.ejex[248] = -8179858006887784134L;
        hg.ejex[249] = 9049684176432313840L;
        hg.ejex[250] = -6185104681272413286L;
        hg.ejex[251] = 6846598689200213982L;
        hg.ejex[252] = -4551124701453910135L;
        hg.ejex[253] = -4687145129893349385L;
        hg.ejex[254] = -738824797345304225L;
        hg.ejex[255] = -2854674668398054791L;
        hg.ejex[256] = 5148930771960398746L;
        hg.ejex[257] = -4014566893096349388L;
        hg.ejex[258] = -7090668695939366621L;
        hg.ejex[259] = -656837174030429244L;
        hg.ejex[260] = -8507536721250527494L;
        hg.ejex[261] = -2825666910432429970L;
        hg.ejex[262] = -1234365012388378933L;
        hg.ejex[263] = -6860040668895191217L;
        hg.ejex[264] = 1797116974561741776L;
        hg.ejex[265] = 4401826855605243567L;
        hg.ejex[266] = 1870810564973052989L;
        hg.ejex[267] = -1263805792890351005L;
        hg.ejex[268] = -5219634489620476932L;
        hg.ejex[269] = -344233074548608364L;
        hg.ejex[270] = 7109216754404651549L;
        hg.ejex[271] = -7002000549158017439L;
        hg.ejex[272] = 8494906397920166158L;
        hg.ejex[273] = -8782426529366728333L;
        hg.ejex[274] = 7534322126473475853L;
        hg.ejex[275] = -7464998822283988438L;
        hg.ejex[276] = -493697301697334326L;
        hg.ejex[277] = -8231101868659840791L;
        hg.ejex[278] = -7101247858924041527L;
        hg.ejex[279] = 1747679470303702280L;
        hg.ejex[280] = -4793383826988421873L;
        hg.ejex[281] = -5157160349197547906L;
        hg.ejex[282] = -1665675223519437280L;
        hg.ejex[283] = -2508197493984908199L;
        hg.ejex[284] = 5549723399408254643L;
        hg.ejex[285] = 4156665935393595690L;
        hg.ejex[286] = -4600761606832402295L;
        hg.ejex[287] = 7715406615435514315L;
        hg.ejex[288] = 989172382042029530L;
        hg.ejex[289] = 7111144830127281698L;
        hg.ejex[290] = 3397496448683335120L;
        hg.ejex[291] = -7724678488284787527L;
        hg.ejex[292] = 4025527816157136180L;
        hg.ejex[293] = -5056196071702012570L;
        hg.ejex[294] = 4920158563236346533L;
        hg.ejex[295] = -7327550407531045823L;
        hg.ejex[296] = -6377052103254693004L;
        hg.ejex[297] = 4802005363946492163L;
        hg.ejex[298] = 4498033509236562725L;
        hg.ejex[299] = -5981187681517159269L;
    }

    private static /* synthetic */ double ekcd(int n2) {
        return Double.longBitsToDouble(ejew[n2] ^ ejex[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("ejey", ejev(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hg.ejdz("ejez", ejdw(int ), (int)20)) break;
            v0 /* !! */  = (long)hg.ejdz("ejfa", ejdw(int ), (int)21);
        }
        var3_1 = hg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("ejfb", ejev(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hg.ejdz("ejfc", ejdw(int ), (int)22)) break;
            v1 /* !! */  = (long)hg.ejdz("ejfd", ejdw(int ), (int)23);
        }
        var2_2 /* !! */  = hg.b;
        v2 /* !! */  = hg.ks;
        if (true) ** GOTO lbl17
        block38: while (true) {
            v2 /* !! */  = (long)(v3 - hg.ejdz("ejfe", ejev(int ), (int)2));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -317019732: {
                    v3 = hg.ejdz("ejff", ejev(int ), (int)3);
                    continue block38;
                }
                case 695013158: {
                    break block38;
                }
                case 1230774183: {
                    v3 = hg.ejdz("ejfg", ejev(int ), (int)4);
                    continue block38;
                }
            }
            break;
        }
        var1_3 = hg.a;
        if (var3_1) {
            throw null;
lbl29:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v4 = hg.ejdz("ejfh", ejdw(int ), (int)24);
        v5 /* !! */  = hg.ks;
        if (true) ** GOTO lbl37
        block40: while (true) {
            v5 /* !! */  = (long)(v6 - hg.ejdz("ejfi", ejev(int ), (int)5));
lbl37:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1433650868: {
                    v6 = hg.ejdz("ejfj", ejev(int ), (int)6);
                    continue block40;
                }
                case 466828588: {
                    v6 = hg.ejdz("ejfk", ejev(int ), (int)7);
                    continue block40;
                }
                case 695013158: {
                    break block40;
                }
                case 1911309599: {
                    v6 = hg.ejdz("ejfl", ejev(int ), (int)8);
                    continue block40;
                }
            }
            break;
        }
        this.isActivePotion = v4;
        if (var1_3 || var1_3) ** GOTO lbl29
        v7 = hg.ejdz("ejfm", ejdw(int ), (int)25);
        v8 /* !! */  = hg.ks;
        if (true) ** GOTO lbl56
        block41: while (true) {
            v8 /* !! */  = (long)(v9 - hg.ejdz("ejfn", ejev(int ), (int)9));
lbl56:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2099938152: {
                    v9 = hg.ejdz("ejfo", ejev(int ), (int)10);
                    continue block41;
                }
                case 695013158: {
                    break block41;
                }
                case 1898780119: {
                    v9 = hg.ejdz("ejfp", ejev(int ), (int)11);
                    continue block41;
                }
            }
            break;
        }
        this.spoofed = v7;
        if (var1_3 || var1_3) ** GOTO lbl29
        v10 = hg.ejdz("ejfq", ejdw(int ), (int)26);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("ejfr", ejev(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hg.ejdz("ejfs", ejdw(int ), (int)27)) break;
            v11 /* !! */  = (long)hg.ejdz("ejft", ejdw(int ), (int)28);
        }
        this.rotationTicks = (int)v10;
        if (var1_3 || var1_3) ** GOTO lbl29
        v12 = hg.ejdz("ejfu", ejdw(int ), (int)29);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("ejfv", ejev(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == hg.ejdz("ejfw", ejdw(int ), (int)30)) break;
            v13 /* !! */  = (long)hg.ejdz("ejfx", ejdw(int ), (int)31);
        }
        this.selectedSlot = (int)v12;
        if (var1_3 || var1_3) ** GOTO lbl29
        v14 /* !! */  = hg.ks;
        if (true) ** GOTO lbl87
        block44: while (true) {
            v14 /* !! */  = (long)(hg.ejdz("ejfz", ejev(int ), (int)15) - hg.ejdz("ejfy", ejev(int ), (int)14));
lbl87:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1435687647: {
                    continue block44;
                }
                case 695013158: {
                    break block44;
                }
            }
            break;
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("ejga", ejev(int ), (int)16)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == hg.ejdz("ejgb", ejdw(int ), (int)32)) break;
            v15 /* !! */  = (long)hg.ejdz("ejgc", ejdw(int ), (int)33);
        }
        ot.INSTANCE.clear();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl103:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hg.ejdz("ejgd", ejdw(int ), (int)34);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl145
                    break;
                }
            }
lbl109:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)hg.ejdz("ejge", ejdw(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl114:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgf", ejdw(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl119:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgg", ejdw(int ), (int)37);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
lbl123:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgh", ejdw(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl128:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgi", ejdw(int ), (int)39);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgj", ejdw(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl137:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgk", ejdw(int ), (int)41);
                if (!var3_1) ** GOTO lbl128
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgl", ejdw(int ), (int)42);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
lbl145:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgm", ejdw(int ), (int)43);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgn", ejdw(int ), (int)44);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
lbl153:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgo", ejdw(int ), (int)45);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
lbl157:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)hg.ejdz("ejgp", ejdw(int ), (int)46);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)hg.ejdz("ejgq", ejdw(int ), (int)47);
        ** while (!var3_1)
lbl164:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void enmr() {
        hg.ejdx[600] = 585275521;
        hg.ejdx[601] = 192532129;
        hg.ejdx[602] = -330205344;
        hg.ejdx[603] = 1149586951;
        hg.ejdx[604] = 1208568301;
    }

    private static /* synthetic */ void enso() {
        hg.ejew[200] = 878258377027933300L;
        hg.ejew[201] = -1978944949752962848L;
        hg.ejew[202] = 4938952304629795978L;
        hg.ejew[203] = -4292045861335332125L;
        hg.ejew[204] = -2951909574848441627L;
        hg.ejew[205] = -3169197020887509885L;
        hg.ejew[206] = 5167947390249179445L;
        hg.ejew[207] = 4337406661487547388L;
        hg.ejew[208] = -5624108907575255448L;
        hg.ejew[209] = -1482243530234037288L;
        hg.ejew[210] = -7337280779981739242L;
        hg.ejew[211] = 1042851890410680433L;
        hg.ejew[212] = -4535991590980724381L;
        hg.ejew[213] = -4666775972197372967L;
        hg.ejew[214] = -5178080747493666784L;
        hg.ejew[215] = -5769708767079491640L;
        hg.ejew[216] = -1769438001344260456L;
        hg.ejew[217] = -6670863498929939595L;
        hg.ejew[218] = -7716874080295533819L;
        hg.ejew[219] = 5214821680115205792L;
        hg.ejew[220] = -2597864157281821719L;
        hg.ejew[221] = 208396261216469448L;
        hg.ejew[222] = 4832060854773959319L;
        hg.ejew[223] = 73742594416920867L;
        hg.ejew[224] = -4894889582205279956L;
        hg.ejew[225] = 8747004102163769376L;
        hg.ejew[226] = 1048903991341264942L;
        hg.ejew[227] = -6486872128110512660L;
        hg.ejew[228] = 2663604143218198868L;
        hg.ejew[229] = -7022234717719147026L;
        hg.ejew[230] = 7971553484887965017L;
        hg.ejew[231] = 2649161402830746104L;
        hg.ejew[232] = 8814979698853147455L;
        hg.ejew[233] = 6415543171378140244L;
        hg.ejew[234] = 3935036241822706028L;
        hg.ejew[235] = 6929867623848333545L;
        hg.ejew[236] = -3940684307410497526L;
        hg.ejew[237] = -4278758708869411102L;
        hg.ejew[238] = 4800965756828305554L;
        hg.ejew[239] = -4835257737888431909L;
        hg.ejew[240] = 3713677357209640232L;
        hg.ejew[241] = 5788518072919410358L;
        hg.ejew[242] = 3047124294024028807L;
        hg.ejew[243] = -6055086981029768069L;
        hg.ejew[244] = 2629507754650324885L;
        hg.ejew[245] = -2473821609167089793L;
        hg.ejew[246] = -5124537081451826178L;
        hg.ejew[247] = 8633785536244419490L;
        hg.ejew[248] = 8946485258404363537L;
        hg.ejew[249] = -3049146480045581819L;
        hg.ejew[250] = 1035967712017937487L;
        hg.ejew[251] = -1589646039214347497L;
        hg.ejew[252] = -8812861290374022644L;
        hg.ejew[253] = -8051127268763179699L;
        hg.ejew[254] = 1565954780270513337L;
        hg.ejew[255] = -8796387646216127145L;
        hg.ejew[256] = 5467847130069205933L;
        hg.ejew[257] = 7028165757021438457L;
        hg.ejew[258] = 6420143366807598353L;
        hg.ejew[259] = -8435949360826409352L;
        hg.ejew[260] = -4888222982376436526L;
        hg.ejew[261] = -7111107105537319806L;
        hg.ejew[262] = -2734662162740176781L;
        hg.ejew[263] = 7314329643693994303L;
        hg.ejew[264] = -8491093091199023598L;
        hg.ejew[265] = 377282378089039184L;
        hg.ejew[266] = 1025072641563594312L;
        hg.ejew[267] = -7682832259833393029L;
        hg.ejew[268] = -7913443091295385143L;
        hg.ejew[269] = 1132996036500649938L;
        hg.ejew[270] = -3114874529803126335L;
        hg.ejew[271] = 5241085931980160367L;
        hg.ejew[272] = -8165273577326527311L;
        hg.ejew[273] = 7850262316301956932L;
        hg.ejew[274] = 2267875798037256260L;
        hg.ejew[275] = -5321079110216833400L;
        hg.ejew[276] = -8657184082669026585L;
        hg.ejew[277] = 5302065492094740648L;
        hg.ejew[278] = 6598148904269702273L;
        hg.ejew[279] = 1611035286378914495L;
        hg.ejew[280] = 6448591318982724115L;
        hg.ejew[281] = 8385490888150536290L;
        hg.ejew[282] = 1551719361261081856L;
        hg.ejew[283] = 6304276946362347386L;
        hg.ejew[284] = 7216861437475264828L;
        hg.ejew[285] = -7154745497540674149L;
        hg.ejew[286] = -539909946480930919L;
        hg.ejew[287] = 347298539236932355L;
        hg.ejew[288] = 3723729959681866082L;
        hg.ejew[289] = 1019817236354086199L;
        hg.ejew[290] = 4956954119452420521L;
        hg.ejew[291] = -1543229829761439190L;
        hg.ejew[292] = -126773503882899767L;
        hg.ejew[293] = 2042526554290086256L;
        hg.ejew[294] = 7098945397440503512L;
        hg.ejew[295] = 9043502711250487780L;
        hg.ejew[296] = 3445643803772830105L;
        hg.ejew[297] = -7244464737339984211L;
        hg.ejew[298] = 213913204454295730L;
        hg.ejew[299] = -5103839553885109520L;
    }

    private static /* synthetic */ void enkx() {
        hg.ejdx[300] = -546338276;
        hg.ejdx[301] = -703680637;
        hg.ejdx[302] = 1644659995;
        hg.ejdx[303] = 992054847;
        hg.ejdx[304] = -1252838810;
        hg.ejdx[305] = -1999276362;
        hg.ejdx[306] = 769424323;
        hg.ejdx[307] = 1518988371;
        hg.ejdx[308] = 2116980088;
        hg.ejdx[309] = -310088338;
        hg.ejdx[310] = -1805737306;
        hg.ejdx[311] = -1724060444;
        hg.ejdx[312] = -762843173;
        hg.ejdx[313] = 1941100504;
        hg.ejdx[314] = -286742311;
        hg.ejdx[315] = 1187978022;
        hg.ejdx[316] = 701861365;
        hg.ejdx[317] = -1872497013;
        hg.ejdx[318] = -667865857;
        hg.ejdx[319] = 728040796;
        hg.ejdx[320] = 1929027812;
        hg.ejdx[321] = -2010430811;
        hg.ejdx[322] = -1411967896;
        hg.ejdx[323] = 944462082;
        hg.ejdx[324] = -93918254;
        hg.ejdx[325] = -616235419;
        hg.ejdx[326] = 52059694;
        hg.ejdx[327] = -1936179233;
        hg.ejdx[328] = 499544871;
        hg.ejdx[329] = 625038049;
        hg.ejdx[330] = -1973300052;
        hg.ejdx[331] = -1214428197;
        hg.ejdx[332] = -1301897710;
        hg.ejdx[333] = -377435887;
        hg.ejdx[334] = 2076655776;
        hg.ejdx[335] = 1768292006;
        hg.ejdx[336] = 264356736;
        hg.ejdx[337] = -2046280883;
        hg.ejdx[338] = 1801489057;
        hg.ejdx[339] = -1624835097;
        hg.ejdx[340] = -422850628;
        hg.ejdx[341] = 1329596017;
        hg.ejdx[342] = -61344929;
        hg.ejdx[343] = -15289207;
        hg.ejdx[344] = -1990294310;
        hg.ejdx[345] = 1276931481;
        hg.ejdx[346] = -858900708;
        hg.ejdx[347] = 448532900;
        hg.ejdx[348] = 285548735;
        hg.ejdx[349] = 1006394485;
        hg.ejdx[350] = 568200060;
        hg.ejdx[351] = -873142898;
        hg.ejdx[352] = 358937591;
        hg.ejdx[353] = 1157321201;
        hg.ejdx[354] = -1542123047;
        hg.ejdx[355] = 654423907;
        hg.ejdx[356] = 1107173372;
        hg.ejdx[357] = -205766480;
        hg.ejdx[358] = -3964892;
        hg.ejdx[359] = -1759251953;
        hg.ejdx[360] = -807659207;
        hg.ejdx[361] = -2092016826;
        hg.ejdx[362] = -367994278;
        hg.ejdx[363] = 743049605;
        hg.ejdx[364] = 679259802;
        hg.ejdx[365] = -1320591316;
        hg.ejdx[366] = 1734867228;
        hg.ejdx[367] = -640519166;
        hg.ejdx[368] = 1508013863;
        hg.ejdx[369] = 889483948;
        hg.ejdx[370] = -724158311;
        hg.ejdx[371] = -939506029;
        hg.ejdx[372] = 401949556;
        hg.ejdx[373] = 168388565;
        hg.ejdx[374] = -2011163563;
        hg.ejdx[375] = -1647286030;
        hg.ejdx[376] = 904295259;
        hg.ejdx[377] = 403611231;
        hg.ejdx[378] = -1230130671;
        hg.ejdx[379] = -530999953;
        hg.ejdx[380] = -582395812;
        hg.ejdx[381] = 1422832278;
        hg.ejdx[382] = 672539108;
        hg.ejdx[383] = -254765414;
        hg.ejdx[384] = 1326578624;
        hg.ejdx[385] = 431399957;
        hg.ejdx[386] = -1153935819;
        hg.ejdx[387] = 636320095;
        hg.ejdx[388] = 1905208055;
        hg.ejdx[389] = -1244118923;
        hg.ejdx[390] = 1576867817;
        hg.ejdx[391] = 1074111959;
        hg.ejdx[392] = 2018114142;
        hg.ejdx[393] = -48765034;
        hg.ejdx[394] = 2127395646;
        hg.ejdx[395] = -2080762994;
        hg.ejdx[396] = 1759579343;
        hg.ejdx[397] = -982909745;
        hg.ejdx[398] = -453142682;
        hg.ejdx[399] = 257428732;
    }

    public static /* synthetic */ CallSite ejdz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void enju() {
        hg.ejdx[100] = 272632121;
        hg.ejdx[101] = -1253096475;
        hg.ejdx[102] = -1312218058;
        hg.ejdx[103] = 549902350;
        hg.ejdx[104] = -1226096189;
        hg.ejdx[105] = 1542613839;
        hg.ejdx[106] = 418842894;
        hg.ejdx[107] = -787337766;
        hg.ejdx[108] = -554432991;
        hg.ejdx[109] = -256003301;
        hg.ejdx[110] = 1123403013;
        hg.ejdx[111] = -1298249164;
        hg.ejdx[112] = 1775675224;
        hg.ejdx[113] = 1808130255;
        hg.ejdx[114] = -1498938560;
        hg.ejdx[115] = 197108522;
        hg.ejdx[116] = 1508406074;
        hg.ejdx[117] = -1668892187;
        hg.ejdx[118] = -1615965959;
        hg.ejdx[119] = -1639542475;
        hg.ejdx[120] = -1742618362;
        hg.ejdx[121] = -1157332691;
        hg.ejdx[122] = 714173584;
        hg.ejdx[123] = -1438677290;
        hg.ejdx[124] = -1942658717;
        hg.ejdx[125] = 692676282;
        hg.ejdx[126] = 877540469;
        hg.ejdx[127] = 998952860;
        hg.ejdx[128] = 336312317;
        hg.ejdx[129] = 1300452496;
        hg.ejdx[130] = -380920676;
        hg.ejdx[131] = -2078238786;
        hg.ejdx[132] = 1330941459;
        hg.ejdx[133] = 519411919;
        hg.ejdx[134] = -862850804;
        hg.ejdx[135] = 669342926;
        hg.ejdx[136] = 949101310;
        hg.ejdx[137] = -1421672748;
        hg.ejdx[138] = 960384164;
        hg.ejdx[139] = 1913035828;
        hg.ejdx[140] = 1338610255;
        hg.ejdx[141] = 250532039;
        hg.ejdx[142] = -1936938584;
        hg.ejdx[143] = 1616115285;
        hg.ejdx[144] = 905472275;
        hg.ejdx[145] = 20124323;
        hg.ejdx[146] = -1965048583;
        hg.ejdx[147] = 1904220636;
        hg.ejdx[148] = -2026355838;
        hg.ejdx[149] = 1844004570;
        hg.ejdx[150] = -506575227;
        hg.ejdx[151] = -1926741006;
        hg.ejdx[152] = -23780562;
        hg.ejdx[153] = 399189697;
        hg.ejdx[154] = -203285549;
        hg.ejdx[155] = -407962242;
        hg.ejdx[156] = -1784406845;
        hg.ejdx[157] = 2032392446;
        hg.ejdx[158] = -2012924534;
        hg.ejdx[159] = -971367627;
        hg.ejdx[160] = -176213533;
        hg.ejdx[161] = -2010044892;
        hg.ejdx[162] = 579641542;
        hg.ejdx[163] = 1645752047;
        hg.ejdx[164] = -989470417;
        hg.ejdx[165] = -1467026502;
        hg.ejdx[166] = -1326531367;
        hg.ejdx[167] = -1615345929;
        hg.ejdx[168] = -1588664203;
        hg.ejdx[169] = -755392719;
        hg.ejdx[170] = -119908912;
        hg.ejdx[171] = -1660716371;
        hg.ejdx[172] = 1181717509;
        hg.ejdx[173] = -1868679730;
        hg.ejdx[174] = -917892981;
        hg.ejdx[175] = -860784659;
        hg.ejdx[176] = 1881504789;
        hg.ejdx[177] = -1861332996;
        hg.ejdx[178] = 1358785564;
        hg.ejdx[179] = -782667477;
        hg.ejdx[180] = 2042801449;
        hg.ejdx[181] = 1888523961;
        hg.ejdx[182] = -2058831593;
        hg.ejdx[183] = -1920103415;
        hg.ejdx[184] = 1864395109;
        hg.ejdx[185] = -1265467471;
        hg.ejdx[186] = -2057078950;
        hg.ejdx[187] = -1436421499;
        hg.ejdx[188] = -998589956;
        hg.ejdx[189] = -1188038763;
        hg.ejdx[190] = 1848539899;
        hg.ejdx[191] = -1843357636;
        hg.ejdx[192] = 101189074;
        hg.ejdx[193] = -1355000974;
        hg.ejdx[194] = 2101280027;
        hg.ejdx[195] = -1734397110;
        hg.ejdx[196] = -685548803;
        hg.ejdx[197] = 413336112;
        hg.ejdx[198] = -1320807635;
        hg.ejdx[199] = -1899835964;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void resetThrowState() {
        v0 /* !! */  = hg.ks;
        if (true) ** GOTO lbl5
        block50: while (true) {
            v0 /* !! */  = (long)(v1 - hg.ejdz("emar", ejev(int ), (int)239));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1908588393: {
                    v1 = hg.ejdz("emas", ejev(int ), (int)240);
                    continue block50;
                }
                case 313289274: {
                    v1 = hg.ejdz("emat", ejev(int ), (int)241);
                    continue block50;
                }
                case 496659736: {
                    v1 = hg.ejdz("emau", ejev(int ), (int)242);
                    continue block50;
                }
                case 695013158: {
                    break block50;
                }
            }
            break;
        }
        var3_1 = hg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("emav", ejev(int ), (int)243)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hg.ejdz("emax", ejdw(int ), (int)461)) break;
            v2 /* !! */  = (long)hg.ejdz("embe", ejdw(int ), (int)462);
        }
        var2_2 /* !! */  = hg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("embg", ejev(int ), (int)244)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hg.ejdz("embi", ejdw(int ), (int)463)) {
                var1_3 = hg.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)hg.ejdz("embj", ejdw(int ), (int)464);
        }
        if (var1_3 || var1_3) return;
        v4 = hg.ejdz("embk", ejdw(int ), (int)465);
        v5 /* !! */  = hg.ks;
        block53: while (true) {
            switch ((int)v5 /* !! */ ) {
                case -1242704562: {
                    v5 /* !! */  = (long)(hg.ejdz("embo", ejev(int ), (int)246) - hg.ejdz("embm", ejev(int ), (int)245));
                    continue block53;
                }
                case 695013158: {
                    break block53;
                }
            }
            break;
        }
        this.spoofed = v4;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block54: while (true) {
            block90: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 || var1_3) return;
                        v6 = hg.ejdz("embu", ejdw(int ), (int)466);
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("embv", ejev(int ), (int)247)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == hg.ejdz("embw", ejdw(int ), (int)467)) {
                                this.rotationTicks = (int)v6;
                                if (var1_3) return;
                                break;
                            }
                            v7 /* !! */  = (long)hg.ejdz("embx", ejdw(int ), (int)468);
                        }
                        if (var1_3) return;
                        v8 = hg.ejdz("emby", ejdw(int ), (int)469);
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("embz", ejev(int ), (int)248)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  == hg.ejdz("emcb", ejdw(int ), (int)470)) {
                                this.isActivePotion = v8;
                                if (var1_3) return;
                                break;
                            }
                            v9 /* !! */  = (long)hg.ejdz("emcc", ejdw(int ), (int)471);
                        }
                        if (var1_3) return;
                        v10 /* !! */  = hg.ks;
                        block57: while (true) {
                            switch ((int)v10 /* !! */ ) {
                                case -1172039711: {
                                    v11 = hg.ejdz("emce", ejev(int ), (int)250);
                                    ** GOTO lbl78
                                }
                                case -1069818948: {
                                    v11 = hg.ejdz("emcf", ejev(int ), (int)251);
lbl78:
                                    // 2 sources

                                    v10 /* !! */  = (long)(v11 - hg.ejdz("emcd", ejev(int ), (int)249));
                                    continue block57;
                                }
                                case 695013158: {
                                    break block57;
                                }
                            }
                            break;
                        }
                        if (this.selectedSlot == hg.ejdz("emcg", ejdw(int ), (int)472)) ** GOTO lbl207
                        if (var1_3 || var1_3) return;
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_5 = hg.ks - hg.ejdz("emch", ejev(int ), (int)252)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  != hg.ejdz("emci", ejdw(int ), (int)473)) {
                                v12 /* !! */  = (long)hg.ejdz("emcj", ejdw(int ), (int)474);
                                continue;
                            }
                            ** GOTO lbl152
                            break;
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdc", ejdw(int ), (int)479);
                        cfr_temp_0 = 8;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdd", ejdw(int ), (int)480);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdg", ejdw(int ), (int)482);
                        cfr_temp_0 = 12;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdh", ejdw(int ), (int)483);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdl", ejdw(int ), (int)487);
                        cfr_temp_0 = 10;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
                    case 9: {
                        ** GOTO lbl143
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdo", ejdw(int ), (int)490);
                        cfr_temp_0 = 10;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdp", ejdw(int ), (int)491);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 13: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdq", ejdw(int ), (int)492);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
                    case 14: lbl-1000:
                    // 2 sources

                    {
                        var2_2 /* !! */  = (int)hg.ejdz("emds", ejdw(int ), (int)493);
                        if (var3_1) {
                            throw null;
                        }
lbl143:
                        // 3 sources

                        var2_2 /* !! */  = (int)hg.ejdz("emdm", ejdw(int ), (int)488);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdn", ejdw(int ), (int)489);
                        cfr_temp_0 = 5;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
lbl152:
                    // 1 sources

                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_6 = hg.ks - hg.ejdz("emck", ejev(int ), (int)253)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == hg.ejdz("emcl", ejdw(int ), (int)475)) break;
                        v13 /* !! */  = (long)hg.ejdz("emcm", ejdw(int ), (int)476);
                    }
                    v14 = hg.mc.field_1724;
                    v15 /* !! */  = hg.ks;
                    block60: while (true) {
                        switch ((int)v15 /* !! */ ) {
                            case -828249578: {
                                v15 /* !! */  = (long)(hg.ejdz("emcp", ejev(int ), (int)255) - hg.ejdz("emco", ejev(int ), (int)254));
                                continue block60;
                            }
                            case 695013158: {
                                break block60;
                            }
                        }
                        break;
                    }
                    v16 = v14.field_3944;
                    v17 /* !! */  = hg.ks;
                    if (true) ** GOTO lbl171
                    block61: while (true) {
                        v17 /* !! */  = (long)(v18 - hg.ejdz("emcq", ejev(int ), (int)256));
lbl171:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -1986585385: {
                                v18 = hg.ejdz("emcr", ejev(int ), (int)257);
                                continue block61;
                            }
                            case -1306821534: {
                                v18 = hg.ejdz("emcs", ejev(int ), (int)258);
                                continue block61;
                            }
                            case 695013158: {
                                break block61;
                            }
                            case 2046250785: {
                                v18 = hg.ejdz("emct", ejev(int ), (int)259);
                                continue block61;
                            }
                        }
                        break;
                    }
                    v19 /* !! */  = hg.ks;
                    block62: while (true) {
                        switch ((int)v19 /* !! */ ) {
                            case -1840075520: {
                                v19 /* !! */  = (long)(hg.ejdz("emcv", ejev(int ), (int)261) - hg.ejdz("emcu", ejev(int ), (int)260));
                                continue block62;
                            }
                            case 695013158: {
                                break block62;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_7 = hg.ks - hg.ejdz("emcw", ejev(int ), (int)262)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == hg.ejdz("emcy", ejdw(int ), (int)477)) break;
                        v20 /* !! */  = (long)hg.ejdz("emcz", ejdw(int ), (int)478);
                    }
                    v21 = new class_2868(this.selectedSlot);
                    v22 /* !! */  = hg.ks;
                    block64: while (true) {
                        switch ((int)v22 /* !! */ ) {
                            case -2022962228: {
                                v22 /* !! */  = (long)(hg.ejdz("emdb", ejev(int ), (int)264) - hg.ejdz("emda", ejev(int ), (int)263));
                                continue block64;
                            }
                            case 695013158: {
                                break block64;
                            }
                        }
                        break;
                    }
                    v16.method_52787((class_2596)v21);
                    if (var1_3) return;
lbl207:
                    // 2 sources

                    if (!var1_3 && !var1_3) return;
                    return;
                    case 2: {
                        var2_2 /* !! */  = (int)hg.ejdz("emde", ejdw(int ), (int)481);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdi", ejdw(int ), (int)484);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block90;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)hg.ejdz("emdj", ejdw(int ), (int)485);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: 
                }
                ** GOTO lbl228
            }
            do {
                if (true) continue block54;
lbl228:
                // 2 sources

                var2_2 /* !! */  = (int)hg.ejdz("emdk", ejdw(int ), (int)486);
                cfr_temp_0 = 6;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void performRotation() {
        v0 /* !! */  = hg.ks;
        if (true) ** GOTO lbl5
        block94: while (true) {
            v0 /* !! */  = (long)(v1 - hg.ejdz("elas", ejev(int ), (int)155));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 88117108: {
                    v1 = hg.ejdz("elau", ejev(int ), (int)156);
                    continue block94;
                }
                case 695013158: {
                    break block94;
                }
                case 2025872515: {
                    v1 = hg.ejdz("elax", ejev(int ), (int)157);
                    continue block94;
                }
            }
            break;
        }
        var5_1 = hg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("elbc", ejev(int ), (int)158)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hg.ejdz("elbd", ejdw(int ), (int)279)) break;
            v2 /* !! */  = (long)hg.ejdz("elbf", ejdw(int ), (int)280);
        }
        var4_2 /* !! */  = hg.b;
        v3 /* !! */  = hg.ks;
        if (true) ** GOTO lbl25
        block96: while (true) {
            v3 /* !! */  = (long)(v4 - hg.ejdz("elbh", ejev(int ), (int)159));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1323734786: {
                    v4 = hg.ejdz("elbj", ejev(int ), (int)160);
                    continue block96;
                }
                case -916415181: {
                    v4 = hg.ejdz("elbk", ejev(int ), (int)161);
                    continue block96;
                }
                case 695013158: {
                    break block96;
                }
                case 1170351673: {
                    v4 = hg.ejdz("elbr", ejev(int ), (int)162);
                    continue block96;
                }
            }
            break;
        }
        var3_3 = hg.a;
        if (var5_1) {
            throw null;
lbl40:
            // 10 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("elbt", ejev(int ), (int)163)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hg.ejdz("elbu", ejdw(int ), (int)281)) break;
            v5 /* !! */  = (long)hg.ejdz("elbv", ejdw(int ), (int)282);
        }
        v6 /* !! */  = hg.ks;
        if (true) ** GOTO lbl52
        block99: while (true) {
            v6 /* !! */  = (long)(v7 - hg.ejdz("elbx", ejev(int ), (int)164));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 695013158: {
                    break block99;
                }
                case 701759482: {
                    v7 = hg.ejdz("elby", ejev(int ), (int)165);
                    continue block99;
                }
                case 2131996438: {
                    v7 = hg.ejdz("elca", ejev(int ), (int)166);
                    continue block99;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("elcg", ejev(int ), (int)167)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hg.ejdz("elch", ejdw(int ), (int)283)) break;
            v8 /* !! */  = (long)hg.ejdz("elcj", ejdw(int ), (int)284);
        }
        v9 = hg.mc.field_1724;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("elcl", ejev(int ), (int)168)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hg.ejdz("elcm", ejdw(int ), (int)285)) break;
            v10 /* !! */  = (long)hg.ejdz("elcn", ejdw(int ), (int)286);
        }
        v11 = v9.method_36454();
        v12 = hg.ejdz("elco", ejef(int ), (int)287);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("elcr", ejev(int ), (int)169)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == hg.ejdz("elct", ejdw(int ), (int)288)) break;
            v13 /* !! */  = (long)hg.ejdz("elcv", ejdw(int ), (int)289);
        }
        var1_4 = new ov(v11, (float)v12);
        if (var3_3 || var3_3) ** GOTO lbl40
        v14 /* !! */  = hg.ks;
        if (true) ** GOTO lbl85
        block103: while (true) {
            v14 /* !! */  = (long)(hg.ejdz("elcz", ejev(int ), (int)171) - hg.ejdz("elcx", ejev(int ), (int)170));
lbl85:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 695013158: {
                    break block103;
                }
                case 1126266697: {
                    continue block103;
                }
            }
            break;
        }
        v15 /* !! */  = hg.ks;
        if (true) ** GOTO lbl94
        block104: while (true) {
            v15 /* !! */  = (long)(v16 - hg.ejdz("elda", ejev(int ), (int)172));
lbl94:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -242872668: {
                    v16 = hg.ejdz("eldb", ejev(int ), (int)173);
                    continue block104;
                }
                case 695013158: {
                    break block104;
                }
                case 1642473564: {
                    v16 = hg.ejdz("eldc", ejev(int ), (int)174);
                    continue block104;
                }
                case 2023629173: {
                    v16 = hg.ejdz("eldd", ejev(int ), (int)175);
                    continue block104;
                }
            }
            break;
        }
        v17 /* !! */  = hg.ks;
        if (true) ** GOTO lbl110
        block105: while (true) {
            v17 /* !! */  = (long)(hg.ejdz("eldh", ejev(int ), (int)177) - hg.ejdz("eldf", ejev(int ), (int)176));
lbl110:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1062743640: {
                    continue block105;
                }
                case 695013158: {
                    break block105;
                }
            }
            break;
        }
        v18 = new hy();
        v19 = hg.ejdz("eldj", ejdw(int ), (int)290);
        v20 = hg.ejdz("eldl", ejdw(int ), (int)291);
        v21 = hg.ejdz("eldn", ejdw(int ), (int)292);
        v22 /* !! */  = hg.ks;
        if (true) ** GOTO lbl123
        block106: while (true) {
            v22 /* !! */  = (long)(v23 - hg.ejdz("eldq", ejev(int ), (int)178));
lbl123:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case -2014540127: {
                    v23 = hg.ejdz("eldr", ejev(int ), (int)179);
                    continue block106;
                }
                case -595283773: {
                    v23 = hg.ejdz("elds", ejev(int ), (int)180);
                    continue block106;
                }
                case -95947832: {
                    v23 = hg.ejdz("eldy", ejev(int ), (int)181);
                    continue block106;
                }
                case 695013158: {
                    break block106;
                }
            }
            break;
        }
        var2_5 = new os(v18, (boolean)v19, (boolean)v20, (boolean)v21);
        if (var3_3 || var3_3) ** GOTO lbl40
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_5 = hg.ks - hg.ejdz("eleb", ejev(int ), (int)182)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == hg.ejdz("elec", ejdw(int ), (int)293)) break;
            v24 /* !! */  = (long)hg.ejdz("eled", ejdw(int ), (int)294);
        }
        v25 = hg.ejdz("elee", ejdw(int ), (int)295);
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_6 = hg.ks - hg.ejdz("eleg", ejev(int ), (int)183)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == hg.ejdz("elei", ejdw(int ), (int)296)) break;
            v26 /* !! */  = (long)hg.ejdz("eleo", ejdw(int ), (int)297);
        }
        v27 /* !! */  = hg.ks;
        if (true) ** GOTO lbl152
        block109: while (true) {
            v27 /* !! */  = (long)(v28 - hg.ejdz("elep", ejev(int ), (int)184));
lbl152:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -1951184327: {
                    v28 = hg.ejdz("eleq", ejev(int ), (int)185);
                    continue block109;
                }
                case -1531467992: {
                    v28 = hg.ejdz("eles", ejev(int ), (int)186);
                    continue block109;
                }
                case 695013158: {
                    break block109;
                }
            }
            break;
        }
        ot.INSTANCE.rotateTo(var1_4, (int)v25, var2_5, nn.HIGH_IMPORTANCE_1, this);
        if (var3_3 || var3_3) ** GOTO lbl40
        v29 /* !! */  = hg.ks;
        if (true) ** GOTO lbl167
        block110: while (true) {
            v29 /* !! */  = (long)(hg.ejdz("elew", ejev(int ), (int)188) - hg.ejdz("elev", ejev(int ), (int)187));
lbl167:
            // 2 sources

            switch ((int)v29 /* !! */ ) {
                case 482851904: {
                    continue block110;
                }
                case 695013158: {
                    break block110;
                }
            }
            break;
        }
        if (this.spoofed) ** GOTO lbl272
        if (var3_3 || var3_3) ** GOTO lbl40
        v30 = hg.ejdz("elez", ejdw(int ), (int)298);
        v31 /* !! */  = hg.ks;
        if (true) ** GOTO lbl179
        block111: while (true) {
            v31 /* !! */  = (long)(v32 - hg.ejdz("elfc", ejev(int ), (int)189));
lbl179:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case -703576999: {
                    v32 = hg.ejdz("elfe", ejev(int ), (int)190);
                    continue block111;
                }
                case -474164579: {
                    v32 = hg.ejdz("elfi", ejev(int ), (int)191);
                    continue block111;
                }
                case 695013158: {
                    break block111;
                }
                case 2083480987: {
                    v32 = hg.ejdz("elfs", ejev(int ), (int)192);
                    continue block111;
                }
            }
            break;
        }
        this.spoofed = v30;
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl40
                v33 = hg.ejdz("elfw", ejdw(int ), (int)299);
                v34 /* !! */  = hg.ks;
                if (true) ** GOTO lbl201
                block112: while (true) {
                    v34 /* !! */  = (long)(v35 - hg.ejdz("elfy", ejev(int ), (int)193));
lbl201:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -400263717: {
                            v35 = hg.ejdz("elga", ejev(int ), (int)194);
                            continue block112;
                        }
                        case 695013158: {
                            break block112;
                        }
                        case 933126906: {
                            v35 = hg.ejdz("elgb", ejev(int ), (int)195);
                            continue block112;
                        }
                        case 1652381519: {
                            v35 = hg.ejdz("elgc", ejev(int ), (int)196);
                            continue block112;
                        }
                    }
                    break;
                }
                this.isActivePotion = v33;
                if (var3_3 || var3_3) ** GOTO lbl40
                v36 = hg.ejdz("elgk", ejdw(int ), (int)300);
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_7 = hg.ks - hg.ejdz("elgl", ejev(int ), (int)197)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == hg.ejdz("elgm", ejdw(int ), (int)301)) break;
                    v37 /* !! */  = (long)hg.ejdz("elgn", ejdw(int ), (int)302);
                }
                this.rotationTicks = (int)v36;
                if (var3_3 || var3_3) ** GOTO lbl40
                v38 /* !! */  = hg.ks;
                if (true) ** GOTO lbl227
                block114: while (true) {
                    v38 /* !! */  = (long)(hg.ejdz("elgs", ejev(int ), (int)199) - hg.ejdz("elgq", ejev(int ), (int)198));
lbl227:
                    // 2 sources

                    switch ((int)v38 /* !! */ ) {
                        case 695013158: {
                            break block114;
                        }
                        case 1925516262: {
                            continue block114;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v39 /* !! */  = (cfr_temp_8 = hg.ks - hg.ejdz("elgt", ejev(int ), (int)200)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v39 /* !! */  == hg.ejdz("elha", ejdw(int ), (int)303)) break;
                    v39 /* !! */  = (long)hg.ejdz("elhd", ejdw(int ), (int)304);
                }
                v40 = hg.mc.field_1724;
                v41 /* !! */  = hg.ks;
                if (true) ** GOTO lbl242
                block116: while (true) {
                    v41 /* !! */  = (long)(hg.ejdz("elhf", ejev(int ), (int)202) - hg.ejdz("elhe", ejev(int ), (int)201));
lbl242:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case -1132364535: {
                            continue block116;
                        }
                        case 695013158: {
                            break block116;
                        }
                    }
                    break;
                }
                v42 = v40.method_31548();
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_9 = hg.ks - hg.ejdz("elhi", ejev(int ), (int)203)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == hg.ejdz("elhl", ejdw(int ), (int)305)) break;
                    v43 /* !! */  = (long)hg.ejdz("elhn", ejdw(int ), (int)306);
                }
                v44 = v42.method_67532();
                v45 /* !! */  = hg.ks;
                if (true) ** GOTO lbl258
                block118: while (true) {
                    v45 /* !! */  = (long)(v46 - hg.ejdz("elhs", ejev(int ), (int)204));
lbl258:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1425752637: {
                            v46 = hg.ejdz("elhu", ejev(int ), (int)205);
                            continue block118;
                        }
                        case -339386594: {
                            v46 = hg.ejdz("elhw", ejev(int ), (int)206);
                            continue block118;
                        }
                        case 695013158: {
                            break block118;
                        }
                        case 775034195: {
                            v46 = hg.ejdz("elhz", ejev(int ), (int)207);
                            continue block118;
                        }
                    }
                    break;
                }
                this.selectedSlot = v44;
                if (var3_3) ** GOTO lbl40
lbl272:
                // 2 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl275:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)hg.ejdz("elib", ejdw(int ), (int)307);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl322
            }
            case 1: {
                var4_2 /* !! */  = (int)hg.ejdz("elid", ejdw(int ), (int)308);
                if (!var5_1) ** GOTO lbl275
                throw null;
            }
            case 2: {
                var4_2 /* !! */  = (int)hg.ejdz("elig", ejdw(int ), (int)309);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl289:
            // 2 sources

            case 3: {
                var4_2 /* !! */  = (int)hg.ejdz("elim", ejdw(int ), (int)310);
                if (var5_1) {
                    throw null;
                }
            }
            case 4: {
                var4_2 /* !! */  = (int)hg.ejdz("elin", ejdw(int ), (int)311);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl298:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)hg.ejdz("elip", ejdw(int ), (int)312);
                if (!var5_1) break;
                throw null;
            }
lbl302:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)hg.ejdz("elis", ejdw(int ), (int)313);
                if (!var5_1) break;
                throw null;
            }
lbl306:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)hg.ejdz("eliv", ejdw(int ), (int)314);
                if (!var5_1) ** GOTO lbl289
                throw null;
            }
lbl310:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)hg.ejdz("eliw", ejdw(int ), (int)315);
                if (!var5_1) ** GOTO lbl302
                throw null;
            }
            case 9: {
                var4_2 /* !! */  = (int)hg.ejdz("eliy", ejdw(int ), (int)316);
                if (!var5_1) ** GOTO lbl310
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)hg.ejdz("eljf", ejdw(int ), (int)317);
                if (!var5_1) ** GOTO lbl310
                throw null;
            }
lbl322:
            // 3 sources

            case 11: {
                var4_2 /* !! */  = (int)hg.ejdz("eljg", ejdw(int ), (int)318);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl327:
            // 2 sources

            case 12: {
                var4_2 /* !! */  = (int)hg.ejdz("elji", ejdw(int ), (int)319);
                if (!var5_1) ** GOTO lbl275
                throw null;
            }
lbl331:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)hg.ejdz("eljk", ejdw(int ), (int)320);
                if (!var5_1) ** GOTO lbl298
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)hg.ejdz("eljm", ejdw(int ), (int)321);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl340:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)hg.ejdz("eljp", ejdw(int ), (int)322);
                if (!var5_1) ** GOTO lbl322
                throw null;
            }
lbl344:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)hg.ejdz("eljr", ejdw(int ), (int)323);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl349:
            // 2 sources

            case 17: {
                var4_2 /* !! */  = (int)hg.ejdz("eljt", ejdw(int ), (int)324);
                if (!var5_1) ** GOTO lbl327
                throw null;
            }
lbl353:
            // 3 sources

            case 18: {
                var4_2 /* !! */  = (int)hg.ejdz("elju", ejdw(int ), (int)325);
                if (!var5_1) ** GOTO lbl340
                throw null;
            }
            case 19: {
                var4_2 /* !! */  = (int)hg.ejdz("eljy", ejdw(int ), (int)326);
                if (!var5_1) ** GOTO lbl306
                throw null;
            }
            case 20: 
        }
        do {
            var4_2 /* !! */  = (int)hg.ejdz("eljz", ejdw(int ), (int)327);
        } while (!var5_1);
        throw null;
    }

    static {
        ejdy = new int[605];
        hg.enja();
        hg.enju();
        hg.enkj();
        hg.enkx();
        hg.enlj();
        hg.enmb();
        hg.enmr();
        hg.enmu();
        hg.ennj();
        hg.enoc();
        hg.enox();
        hg.enpm();
        hg.enpx();
        hg.enqg();
        ejew = new long[377];
        ejex = new long[377];
        hg.enqn();
        hg.enrl();
        hg.enso();
        hg.entm();
        hg.enua();
        hg.enva();
        hg.envx();
        hg.enwq();
    }

    private static /* synthetic */ void enpx() {
        hg.ejdy[500] = 1720496711;
        hg.ejdy[501] = -1862101105;
        hg.ejdy[502] = -993814552;
        hg.ejdy[503] = -1273601161;
        hg.ejdy[504] = 2071525059;
        hg.ejdy[505] = -1494557811;
        hg.ejdy[506] = 1523944912;
        hg.ejdy[507] = -1826126596;
        hg.ejdy[508] = 482817279;
        hg.ejdy[509] = 951641206;
        hg.ejdy[510] = -771191554;
        hg.ejdy[511] = -382285883;
        hg.ejdy[512] = 557963495;
        hg.ejdy[513] = 2080057250;
        hg.ejdy[514] = 1310020258;
        hg.ejdy[515] = 62129804;
        hg.ejdy[516] = 588758106;
        hg.ejdy[517] = 1391222210;
        hg.ejdy[518] = -1959273191;
        hg.ejdy[519] = 1426967446;
        hg.ejdy[520] = 2080572377;
        hg.ejdy[521] = 1128344154;
        hg.ejdy[522] = 587879418;
        hg.ejdy[523] = -1820954984;
        hg.ejdy[524] = 663126798;
        hg.ejdy[525] = -1273436033;
        hg.ejdy[526] = 1422304668;
        hg.ejdy[527] = -1858561180;
        hg.ejdy[528] = -539108859;
        hg.ejdy[529] = 326487871;
        hg.ejdy[530] = 1327978741;
        hg.ejdy[531] = -1900350583;
        hg.ejdy[532] = -1978563327;
        hg.ejdy[533] = -542953484;
        hg.ejdy[534] = 1516212064;
        hg.ejdy[535] = -2090932539;
        hg.ejdy[536] = -1774109212;
        hg.ejdy[537] = -91175459;
        hg.ejdy[538] = 334159520;
        hg.ejdy[539] = -963633480;
        hg.ejdy[540] = 841449918;
        hg.ejdy[541] = 1702676537;
        hg.ejdy[542] = -1987672141;
        hg.ejdy[543] = 449284864;
        hg.ejdy[544] = -437730839;
        hg.ejdy[545] = -534539165;
        hg.ejdy[546] = 1939305715;
        hg.ejdy[547] = -1161844728;
        hg.ejdy[548] = -1407604973;
        hg.ejdy[549] = -1333626858;
        hg.ejdy[550] = 1113914235;
        hg.ejdy[551] = -1364170896;
        hg.ejdy[552] = 2002273594;
        hg.ejdy[553] = 1162360468;
        hg.ejdy[554] = 572628009;
        hg.ejdy[555] = -280820575;
        hg.ejdy[556] = -1438093406;
        hg.ejdy[557] = 1205853662;
        hg.ejdy[558] = 293677227;
        hg.ejdy[559] = 1767859564;
        hg.ejdy[560] = 1808799448;
        hg.ejdy[561] = 15604438;
        hg.ejdy[562] = -1145572188;
        hg.ejdy[563] = 7089593;
        hg.ejdy[564] = 1241527716;
        hg.ejdy[565] = -1173001947;
        hg.ejdy[566] = -1098226108;
        hg.ejdy[567] = 1617561585;
        hg.ejdy[568] = 871272725;
        hg.ejdy[569] = -1892472712;
        hg.ejdy[570] = 160034901;
        hg.ejdy[571] = 1039361304;
        hg.ejdy[572] = -956728799;
        hg.ejdy[573] = 1829762754;
        hg.ejdy[574] = -2075420185;
        hg.ejdy[575] = 1357268680;
        hg.ejdy[576] = 163227957;
        hg.ejdy[577] = -1908217630;
        hg.ejdy[578] = -530815722;
        hg.ejdy[579] = -1111595786;
        hg.ejdy[580] = 1938466018;
        hg.ejdy[581] = -933652645;
        hg.ejdy[582] = -331962953;
        hg.ejdy[583] = -789577805;
        hg.ejdy[584] = 1738642935;
        hg.ejdy[585] = -711300721;
        hg.ejdy[586] = -159596936;
        hg.ejdy[587] = -1710702724;
        hg.ejdy[588] = 1897022282;
        hg.ejdy[589] = 1841553453;
        hg.ejdy[590] = 1866468421;
        hg.ejdy[591] = 109954769;
        hg.ejdy[592] = -532634643;
        hg.ejdy[593] = -458176253;
        hg.ejdy[594] = -171979246;
        hg.ejdy[595] = -1369680723;
        hg.ejdy[596] = 1472184509;
        hg.ejdy[597] = -1272469840;
        hg.ejdy[598] = -1766000817;
        hg.ejdy[599] = 980815604;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hg() {
        var2_1 /* !! */  = hg.b;
        super("AutoPotion", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043a\u0438\u0434\u0430\u0435\u0442 \u0437\u0435\u043b\u044c\u0435 \u043f\u043e\u0434 \u0438\u0433\u0440\u043e\u043a\u0430", du.RAGE);
        this.autoOff = new kb("\u0410\u0432\u0442\u043e \u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0432\u044b\u043a\u043b\u044e\u0447\u0430\u0442\u044c \u043c\u043e\u0434\u0443\u043b\u044c \u043f\u043e\u0441\u043b\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f").setValue((boolean)hg.ejdz("ejea", ejdw(int ), (int)0));
        this.potions = new ke("\u0411\u0440\u043e\u0441\u0430\u0442\u044c", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u0437\u0435\u043b\u044c\u044f \u0434\u043b\u044f \u0430\u0432\u0442\u043e\u0431\u0440\u043e\u0441\u0430").value(new String[]{"\u0421\u0438\u043b\u0443", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", "\u041e\u0433\u043d\u0435\u0441\u0442\u043e\u0439\u043a\u043e\u0441\u0442\u044c"}).selected(new String[]{"\u0421\u0438\u043b\u0443", "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c"});
        this.timer = new pr();
        this.spoofed = hg.ejdz("ejeb", ejdw(int ), (int)1);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.isActivePotion = hg.ejdz("ejec", ejdw(int ), (int)2);
                this.rotationTicks = (int)hg.ejdz("ejed", ejdw(int ), (int)3);
                this.selectedSlot = (int)hg.ejdz("ejee", ejdw(int ), (int)4);
                this.THROW_PITCH = (float)hg.ejdz("ejeg", ejef(int ), (int)5);
                this.ROTATION_WAIT_TICKS = (int)hg.ejdz("ejeh", ejdw(int ), (int)6);
                this.settings(new jx[]{this.potions, this.autoOff});
                return;
            }
lbl17:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)hg.ejdz("ejei", ejdw(int ), (int)7);
                ** GOTO lbl30
            }
lbl20:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)hg.ejdz("ejej", ejdw(int ), (int)8);
                ** GOTO lbl39
            }
lbl23:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)hg.ejdz("ejek", ejdw(int ), (int)9);
                ** GOTO lbl20
            }
            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)hg.ejdz("ejel", ejdw(int ), (int)10);
                }
            }
lbl30:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)hg.ejdz("ejem", ejdw(int ), (int)11);
                ** GOTO lbl23
            }
lbl33:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)hg.ejdz("ejen", ejdw(int ), (int)12);
                ** GOTO lbl52
            }
lbl36:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)hg.ejdz("ejeo", ejdw(int ), (int)13);
                ** GOTO lbl30
            }
lbl39:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)hg.ejdz("ejep", ejdw(int ), (int)14);
                ** GOTO lbl36
            }
            case 8: {
                var2_1 /* !! */  = (int)hg.ejdz("ejeq", ejdw(int ), (int)15);
                ** GOTO lbl33
            }
            case 9: {
                while (true) {
                    var2_1 /* !! */  = (int)hg.ejdz("ejer", ejdw(int ), (int)16);
                }
            }
            case 10: {
                var2_1 /* !! */  = (int)hg.ejdz("ejes", ejdw(int ), (int)17);
                ** GOTO lbl17
            }
lbl52:
            // 2 sources

            case 11: {
                while (true) {
                    var2_1 /* !! */  = (int)hg.ejdz("ejet", ejdw(int ), (int)18);
                }
            }
            case 12: 
        }
        while (true) {
            var2_1 /* !! */  = (int)hg.ejdz("ejeu", ejdw(int ), (int)19);
        }
    }

    private static /* synthetic */ void enja() {
        hg.ejdx[0] = -1992713801;
        hg.ejdx[1] = -779559556;
        hg.ejdx[2] = -990311673;
        hg.ejdx[3] = -1546953021;
        hg.ejdx[4] = 278915405;
        hg.ejdx[5] = -424836183;
        hg.ejdx[6] = -1667236765;
        hg.ejdx[7] = 1487450873;
        hg.ejdx[8] = -1497867021;
        hg.ejdx[9] = -670222958;
        hg.ejdx[10] = -520845805;
        hg.ejdx[11] = 624343326;
        hg.ejdx[12] = 1251916049;
        hg.ejdx[13] = 424070370;
        hg.ejdx[14] = 1611203364;
        hg.ejdx[15] = 427571704;
        hg.ejdx[16] = 2025704972;
        hg.ejdx[17] = -1357971993;
        hg.ejdx[18] = -477497237;
        hg.ejdx[19] = 151630469;
        hg.ejdx[20] = 876038311;
        hg.ejdx[21] = 1488447956;
        hg.ejdx[22] = -1225968462;
        hg.ejdx[23] = -1562267190;
        hg.ejdx[24] = 1604827053;
        hg.ejdx[25] = 312388196;
        hg.ejdx[26] = 439075303;
        hg.ejdx[27] = -1455005006;
        hg.ejdx[28] = 1240512946;
        hg.ejdx[29] = -1342749332;
        hg.ejdx[30] = -627442779;
        hg.ejdx[31] = 950131071;
        hg.ejdx[32] = -540285566;
        hg.ejdx[33] = -1734192211;
        hg.ejdx[34] = -349330116;
        hg.ejdx[35] = -1818476761;
        hg.ejdx[36] = -1160788852;
        hg.ejdx[37] = 1584612764;
        hg.ejdx[38] = 119410952;
        hg.ejdx[39] = -464071944;
        hg.ejdx[40] = -1180646670;
        hg.ejdx[41] = -1888086845;
        hg.ejdx[42] = 1647893221;
        hg.ejdx[43] = -1397949393;
        hg.ejdx[44] = -864697142;
        hg.ejdx[45] = -1079141451;
        hg.ejdx[46] = -584105069;
        hg.ejdx[47] = 982115802;
        hg.ejdx[48] = -1860722544;
        hg.ejdx[49] = -1936809040;
        hg.ejdx[50] = 226598811;
        hg.ejdx[51] = 1342431000;
        hg.ejdx[52] = -631845844;
        hg.ejdx[53] = -1813407003;
        hg.ejdx[54] = -738839746;
        hg.ejdx[55] = -757044767;
        hg.ejdx[56] = 685712164;
        hg.ejdx[57] = -665738802;
        hg.ejdx[58] = -1935425099;
        hg.ejdx[59] = 1055754845;
        hg.ejdx[60] = 235793114;
        hg.ejdx[61] = 623474926;
        hg.ejdx[62] = -55650868;
        hg.ejdx[63] = -906164540;
        hg.ejdx[64] = 399431547;
        hg.ejdx[65] = 1381293583;
        hg.ejdx[66] = -1773861473;
        hg.ejdx[67] = -68840677;
        hg.ejdx[68] = -847483670;
        hg.ejdx[69] = 2058263207;
        hg.ejdx[70] = -1840138291;
        hg.ejdx[71] = -1430711717;
        hg.ejdx[72] = 394536966;
        hg.ejdx[73] = -1334541131;
        hg.ejdx[74] = -585356479;
        hg.ejdx[75] = -1029805023;
        hg.ejdx[76] = -1844461682;
        hg.ejdx[77] = 1398915296;
        hg.ejdx[78] = 263637263;
        hg.ejdx[79] = -1531927895;
        hg.ejdx[80] = 1717011959;
        hg.ejdx[81] = -997057757;
        hg.ejdx[82] = 405012767;
        hg.ejdx[83] = -802414469;
        hg.ejdx[84] = 2078659347;
        hg.ejdx[85] = 1520600850;
        hg.ejdx[86] = -1248511912;
        hg.ejdx[87] = -1068600912;
        hg.ejdx[88] = -986867995;
        hg.ejdx[89] = 590356341;
        hg.ejdx[90] = -1888286111;
        hg.ejdx[91] = -698592031;
        hg.ejdx[92] = 264607880;
        hg.ejdx[93] = -1132454102;
        hg.ejdx[94] = -2064905603;
        hg.ejdx[95] = -1218442193;
        hg.ejdx[96] = 1685014174;
        hg.ejdx[97] = -248312422;
        hg.ejdx[98] = 770228008;
        hg.ejdx[99] = 1586959764;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void throwPotion(hg$PotionType var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("emdu", ejev(int ), (int)265)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hg.ejdz("emdv", ejdw(int ), (int)494)) break;
            v0 /* !! */  = (long)hg.ejdz("emdw", ejdw(int ), (int)495);
        }
        var5_2 = hg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("emdx", ejev(int ), (int)266)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hg.ejdz("emdy", ejdw(int ), (int)496)) break;
            v1 /* !! */  = (long)hg.ejdz("emdz", ejdw(int ), (int)497);
        }
        var4_3 /* !! */  = hg.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("emea", ejev(int ), (int)267)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == hg.ejdz("emeb", ejdw(int ), (int)498)) break;
                    v2 /* !! */  = (long)hg.ejdz("emec", ejdw(int ), (int)499);
                }
                var3_4 = hg.a;
                if (var5_2) {
                    throw null;
lbl24:
                    // 14 sources

                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("emed", ejev(int ), (int)268)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hg.ejdz("emee", ejdw(int ), (int)500)) break;
                    v3 /* !! */  = (long)hg.ejdz("emeg", ejdw(int ), (int)501);
                }
                if (!var1_1.isEnabled(this)) ** GOTO lbl66
                if (var3_4) ** GOTO lbl24
                v4 /* !! */  = hg.ks;
                if (true) ** GOTO lbl38
                block89: while (true) {
                    v4 /* !! */  = (long)(v5 - hg.ejdz("emeh", ejev(int ), (int)269));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -768076591: {
                            v5 = hg.ejdz("emei", ejev(int ), (int)270);
                            continue block89;
                        }
                        case -519214860: {
                            v5 = hg.ejdz("emrg", ejev(int ), (int)271);
                            continue block89;
                        }
                        case 695013158: {
                            break block89;
                        }
                    }
                    break;
                }
                v6 = var1_1.effect;
                v7 /* !! */  = hg.ks;
                if (true) ** GOTO lbl52
                block90: while (true) {
                    v7 /* !! */  = (long)(v8 - hg.ejdz("emrk", ejev(int ), (int)272));
lbl52:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1606273768: {
                            v8 = hg.ejdz("emrm", ejev(int ), (int)273);
                            continue block90;
                        }
                        case 695013158: {
                            break block90;
                        }
                        case 1311756935: {
                            v8 = hg.ejdz("emrq", ejev(int ), (int)274);
                            continue block90;
                        }
                        case 1667448344: {
                            v8 = hg.ejdz("emrr", ejev(int ), (int)275);
                            continue block90;
                        }
                    }
                    break;
                }
                if (!this.hasEffect(v6)) ** GOTO lbl68
                if (var3_4) ** GOTO lbl24
lbl66:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                return;
lbl68:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                v9 /* !! */  = hg.ks;
                if (true) ** GOTO lbl73
                block91: while (true) {
                    v9 /* !! */  = (long)(v10 - hg.ejdz("emsa", ejev(int ), (int)276));
lbl73:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -813274436: {
                            v10 = hg.ejdz("emsc", ejev(int ), (int)277);
                            continue block91;
                        }
                        case -242642910: {
                            v10 = hg.ejdz("emse", ejev(int ), (int)278);
                            continue block91;
                        }
                        case 695013158: {
                            break block91;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("emsh", ejev(int ), (int)279)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hg.ejdz("emsi", ejdw(int ), (int)502)) break;
                    v11 /* !! */  = (long)hg.ejdz("emsj", ejdw(int ), (int)503);
                }
                if (hg.mc.field_1724 == null) ** GOTO lbl127
                if (var3_4) ** GOTO lbl24
                v12 /* !! */  = hg.ks;
                if (true) ** GOTO lbl93
                block93: while (true) {
                    v12 /* !! */  = (long)(v13 - hg.ejdz("emsm", ejev(int ), (int)280));
lbl93:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 690383551: {
                            v13 = hg.ejdz("emst", ejev(int ), (int)281);
                            continue block93;
                        }
                        case 695013158: {
                            break block93;
                        }
                        case 1699467050: {
                            v13 = hg.ejdz("emsu", ejev(int ), (int)282);
                            continue block93;
                        }
                    }
                    break;
                }
                v14 /* !! */  = hg.ks;
                if (true) ** GOTO lbl106
                block94: while (true) {
                    v14 /* !! */  = (long)(hg.ejdz("emsw", ejev(int ), (int)284) - hg.ejdz("emsv", ejev(int ), (int)283));
lbl106:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -488656336: {
                            continue block94;
                        }
                        case 695013158: {
                            break block94;
                        }
                    }
                    break;
                }
                v15 = hg.mc.field_1724;
                v16 /* !! */  = hg.ks;
                if (true) ** GOTO lbl116
                block95: while (true) {
                    v16 /* !! */  = (long)(v17 - hg.ejdz("emsx", ejev(int ), (int)285));
lbl116:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 695013158: {
                            break block95;
                        }
                        case 965643396: {
                            v17 = hg.ejdz("emsy", ejev(int ), (int)286);
                            continue block95;
                        }
                        case 2120711439: {
                            v17 = hg.ejdz("emtb", ejev(int ), (int)287);
                            continue block95;
                        }
                    }
                    break;
                }
                if (v15.field_3944 != null) ** GOTO lbl129
                if (var3_4) ** GOTO lbl24
lbl127:
                // 2 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                return;
lbl129:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                v18 /* !! */  = hg.ks;
                if (true) ** GOTO lbl134
                block96: while (true) {
                    v18 /* !! */  = (long)(v19 - hg.ejdz("emte", ejev(int ), (int)288));
lbl134:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1909115679: {
                            v19 = hg.ejdz("emtf", ejev(int ), (int)289);
                            continue block96;
                        }
                        case -1798720997: {
                            v19 = hg.ejdz("emth", ejev(int ), (int)290);
                            continue block96;
                        }
                        case 695013158: {
                            break block96;
                        }
                        case 1992654474: {
                            v19 = hg.ejdz("emtj", ejev(int ), (int)291);
                            continue block96;
                        }
                    }
                    break;
                }
                var2_5 = this.findPotionSlot(var1_1);
                if (var3_4 || var3_4) ** GOTO lbl24
                if (var2_5 != hg.ejdz("emtm", ejdw(int ), (int)504)) ** GOTO lbl151
                if (var3_4) ** GOTO lbl24
                return;
lbl151:
                // 1 sources

                if (var3_4 || var3_4) ** GOTO lbl24
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = hg.ks - hg.ejdz("emto", ejev(int ), (int)292)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hg.ejdz("emtv", ejdw(int ), (int)505)) break;
                    v20 /* !! */  = (long)hg.ejdz("emtw", ejdw(int ), (int)506);
                }
                v21 /* !! */  = hg.ks;
                if (true) ** GOTO lbl161
                block98: while (true) {
                    v21 /* !! */  = (long)(v22 - hg.ejdz("emty", ejev(int ), (int)293));
lbl161:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1082574365: {
                            v22 = hg.ejdz("emtz", ejev(int ), (int)294);
                            continue block98;
                        }
                        case 695013158: {
                            break block98;
                        }
                        case 1519699885: {
                            v22 = hg.ejdz("emua", ejev(int ), (int)295);
                            continue block98;
                        }
                    }
                    break;
                }
                v23 = hg.mc.field_1724;
                v24 /* !! */  = hg.ks;
                if (true) ** GOTO lbl175
                block99: while (true) {
                    v24 /* !! */  = (long)(hg.ejdz("emud", ejev(int ), (int)297) - hg.ejdz("emub", ejev(int ), (int)296));
lbl175:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -14472753: {
                            continue block99;
                        }
                        case 695013158: {
                            break block99;
                        }
                    }
                    break;
                }
                v25 = v23.field_3944;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_6 = hg.ks - hg.ejdz("emug", ejev(int ), (int)298)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == hg.ejdz("emui", ejdw(int ), (int)507)) break;
                    v26 /* !! */  = (long)hg.ejdz("emuk", ejdw(int ), (int)508);
                }
                v27 /* !! */  = hg.ks;
                if (true) ** GOTO lbl190
                block101: while (true) {
                    v27 /* !! */  = (long)(v28 - hg.ejdz("emum", ejev(int ), (int)299));
lbl190:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -927800393: {
                            v28 = hg.ejdz("emuo", ejev(int ), (int)300);
                            continue block101;
                        }
                        case -921091514: {
                            v28 = hg.ejdz("emuq", ejev(int ), (int)301);
                            continue block101;
                        }
                        case 695013158: {
                            break block101;
                        }
                        case 1390820719: {
                            v28 = hg.ejdz("emut", ejev(int ), (int)302);
                            continue block101;
                        }
                    }
                    break;
                }
                v29 = new class_2868(var2_5);
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_7 = hg.ks - hg.ejdz("emuv", ejev(int ), (int)303)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == hg.ejdz("emux", ejdw(int ), (int)509)) break;
                    v30 /* !! */  = (long)hg.ejdz("emuz", ejdw(int ), (int)510);
                }
                v25.method_52787((class_2596)v29);
                if (var3_4 || var3_4) ** GOTO lbl24
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_8 = hg.ks - hg.ejdz("emvc", ejev(int ), (int)304)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == hg.ejdz("emvd", ejdw(int ), (int)511)) break;
                    v31 /* !! */  = (long)hg.ejdz("emve", ejdw(int ), (int)512);
                }
                v32 = (class_7204)LambdaMetafactory.metafactory(null, null, null, (I)Lnet/minecraft/class_2596;, lambda$throwPotion$0(int ), (I)Lnet/minecraft/class_2596;)((hg)this);
                v33 /* !! */  = hg.ks;
                if (true) ** GOTO lbl220
                block104: while (true) {
                    v33 /* !! */  = (long)(hg.ejdz("emvi", ejev(int ), (int)306) - hg.ejdz("emvh", ejev(int ), (int)305));
lbl220:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1470056296: {
                            continue block104;
                        }
                        case 695013158: {
                            break block104;
                        }
                    }
                    break;
                }
                this.sendSequencedPacket(v32);
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)hg.ejdz("emvl", ejdw(int ), (int)513);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
            case 1: {
                var4_3 /* !! */  = (int)hg.ejdz("emvo", ejdw(int ), (int)514);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl239:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)hg.ejdz("emvp", ejdw(int ), (int)515);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl244:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)hg.ejdz("emvq", ejdw(int ), (int)516);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl313
                    break;
                }
            }
            case 4: {
                var4_3 /* !! */  = (int)hg.ejdz("emvr", ejdw(int ), (int)517);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 5: {
                var4_3 /* !! */  = (int)hg.ejdz("emvx", ejdw(int ), (int)518);
                if (!var5_2) break;
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)hg.ejdz("emvz", ejdw(int ), (int)519);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
lbl264:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)hg.ejdz("emwb", ejdw(int ), (int)520);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl269:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)hg.ejdz("emwc", ejdw(int ), (int)521);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl308
            }
            case 9: {
                var4_3 /* !! */  = (int)hg.ejdz("emwd", ejdw(int ), (int)522);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl279:
            // 2 sources

            case 10: {
                var4_3 /* !! */  = (int)hg.ejdz("emwe", ejdw(int ), (int)523);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 11: {
                var4_3 /* !! */  = (int)hg.ejdz("emwg", ejdw(int ), (int)524);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 12: {
                var4_3 /* !! */  = (int)hg.ejdz("emwm", ejdw(int ), (int)525);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 13: {
                var4_3 /* !! */  = (int)hg.ejdz("emwo", ejdw(int ), (int)526);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl299:
            // 5 sources

            case 14: {
                var4_3 /* !! */  = (int)hg.ejdz("emwp", ejdw(int ), (int)527);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 15: {
                var4_3 /* !! */  = (int)hg.ejdz("emwq", ejdw(int ), (int)528);
                if (!var5_2) ** GOTO lbl299
                throw null;
            }
lbl308:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)hg.ejdz("emwr", ejdw(int ), (int)529);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl313:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)hg.ejdz("emws", ejdw(int ), (int)530);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl318:
            // 3 sources

            case 18: {
                var4_3 /* !! */  = (int)hg.ejdz("emwu", ejdw(int ), (int)531);
                if (!var5_2) ** GOTO lbl244
                throw null;
            }
lbl322:
            // 2 sources

            case 19: {
                var4_3 /* !! */  = (int)hg.ejdz("emwx", ejdw(int ), (int)532);
                if (!var5_2) ** GOTO lbl279
                throw null;
            }
lbl326:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)hg.ejdz("emwz", ejdw(int ), (int)533);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl331:
            // 2 sources

            case 21: {
                var4_3 /* !! */  = (int)hg.ejdz("emxa", ejdw(int ), (int)534);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl336:
            // 3 sources

            case 22: {
                var4_3 /* !! */  = (int)hg.ejdz("emxb", ejdw(int ), (int)535);
                if (!var5_2) break;
                throw null;
            }
lbl340:
            // 4 sources

            case 23: {
                do {
                    var4_3 /* !! */  = (int)hg.ejdz("emxd", ejdw(int ), (int)536);
                } while (!var5_2);
                throw null;
            }
lbl345:
            // 3 sources

            case 24: {
                var4_3 /* !! */  = (int)hg.ejdz("emxh", ejdw(int ), (int)537);
                if (!var5_2) ** GOTO lbl322
                throw null;
            }
            case 25: {
                var4_3 /* !! */  = (int)hg.ejdz("emxl", ejdw(int ), (int)538);
                if (!var5_2) ** GOTO lbl239
                throw null;
            }
            case 26: 
        }
        var4_3 /* !! */  = (int)hg.ejdz("emxo", ejdw(int ), (int)539);
        ** while (!var5_2)
lbl356:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processThrow() {
        block141: {
            block146: {
                block145: {
                    block144: {
                        block143: {
                            block142: {
                                block140: {
                                    block139: {
                                        block138: {
                                            block137: {
                                                var7_1 = hg.c;
                                                var6_2 /* !! */  = hg.b;
                                                var5_3 = hg.a;
                                                if (var7_1) {
                                                    throw null;
lbl6:
                                                    // 40 sources

                                                    return;
                                                }
                                                if (var5_3 || var5_3) ** GOTO lbl6
                                                this.rotationTicks += hg.ejdz("elrg", ejdw(int ), (int)373);
                                                if (var5_3 || var5_3) ** GOTO lbl6
                                                var1_4 = ot.INSTANCE.getRotation();
                                                if (var5_3 || var5_3) ** GOTO lbl6
                                                if (var1_4 == null) break block137;
                                                if (var5_3) ** GOTO lbl6
                                                if (!(var1_4.getPitch() >= hg.ejdz("elrh", ejef(int ), (int)374))) break block137;
                                                if (var5_3) ** GOTO lbl6
                                                v0 = hg.ejdz("elri", ejdw(int ), (int)375);
                                                if (var7_1) {
                                                    throw null;
                                                }
                                                break block138;
                                            }
                                            if (var5_3 || var5_3) ** GOTO lbl6
                                            v0 = var2_5 = hg.ejdz("elrk", ejdw(int ), (int)376);
                                        }
                                        if (var5_3 || var5_3) ** GOTO lbl6
                                        if (this.rotationTicks < hg.ejdz("elrm", ejdw(int ), (int)377)) break block139;
                                        if (var5_3) ** GOTO lbl6
                                        v1 = hg.ejdz("elrn", ejdw(int ), (int)378);
                                        if (var7_1) {
                                            throw null;
                                        }
                                        break block140;
                                    }
                                    if (var5_3 || var5_3) ** GOTO lbl6
                                    v1 = var3_6 = hg.ejdz("elrt", ejdw(int ), (int)379);
                                }
                                if (var5_3 || var5_3) ** GOTO lbl6
                                if (var2_5 == false) break block141;
                                if (var5_3) ** GOTO lbl6
                                if (var3_6 == false) break block141;
                                if (var5_3 || var5_3) ** GOTO lbl6
                                var4_7 = hg.ejdz("elru", ejdw(int ), (int)380);
                                if (var5_3 || var5_3) ** GOTO lbl6
                                if (!this.canBuff(hg$PotionType.STRENGTH)) break block142;
                                if (var5_3 || var5_3) ** GOTO lbl6
                                this.throwPotion(hg$PotionType.STRENGTH);
                                if (var5_3 || var5_3) ** GOTO lbl6
                                var4_7 = hg.ejdz("elrv", ejdw(int ), (int)381);
                                if (var5_3) ** GOTO lbl6
                            }
                            if (var5_3 || var5_3) ** GOTO lbl6
                            if (!this.canBuff(hg$PotionType.SPEED)) break block143;
                            if (var5_3 || var5_3) ** GOTO lbl6
                            this.throwPotion(hg$PotionType.SPEED);
                            if (var5_3 || var5_3) ** GOTO lbl6
                            var4_7 = hg.ejdz("elrx", ejdw(int ), (int)382);
                            if (var5_3) ** GOTO lbl6
                        }
                        if (var5_3 || var5_3) ** GOTO lbl6
                        if (!this.canBuff(hg$PotionType.FIRE_RESISTANCE)) break block144;
                        if (var5_3 || var5_3) ** GOTO lbl6
                        this.throwPotion(hg$PotionType.FIRE_RESISTANCE);
                        if (var5_3 || var5_3) ** GOTO lbl6
                        var4_7 = hg.ejdz("elry", ejdw(int ), (int)383);
                        if (var5_3) ** GOTO lbl6
                    }
                    if (var5_3 || var5_3) ** GOTO lbl6
                    if (this.selectedSlot == hg.ejdz("elsl", ejdw(int ), (int)384)) break block145;
                    if (var5_3 || var5_3) ** GOTO lbl6
                    hg.mc.field_1724.field_3944.method_52787((class_2596)new class_2868(this.selectedSlot));
                    if (var5_3) ** GOTO lbl6
                }
                if (var5_3 || var5_3) ** GOTO lbl6
                this.timer.reset();
                if (var5_3 || var5_3) ** GOTO lbl6
                this.spoofed = hg.ejdz("elsp", ejdw(int ), (int)385);
                if (var5_3 || var5_3) ** GOTO lbl6
                this.rotationTicks = (int)hg.ejdz("elsx", ejdw(int ), (int)386);
                if (var5_3 || var5_3) ** GOTO lbl6
                this.isActivePotion = hg.ejdz("elsy", ejdw(int ), (int)387);
                if (var5_3 || var5_3) ** GOTO lbl6
                if (this.autoOff.isValue()) break block146;
                if (var5_3) ** GOTO lbl6
                if (var4_7 != false) break block141;
                if (var5_3) ** GOTO lbl6
            }
            if (var5_3 || var5_3) ** GOTO lbl6
            this.setState((boolean)hg.ejdz("elta", ejdw(int ), (int)388));
            if (var5_3) ** GOTO lbl6
        }
        if (var5_3 || var5_3) ** GOTO lbl6
        if (this.rotationTicks <= hg.ejdz("eltd", ejdw(int ), (int)389)) ** GOTO lbl98
        if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3 || var5_3) ** GOTO lbl6
                this.resetThrowState();
                if (var5_3) ** GOTO lbl6
lbl98:
                // 2 sources

                if (!var5_3 && !var5_3) ** break;
                ** continue;
                return;
            }
lbl101:
            // 3 sources

            case 0: {
                var6_2 /* !! */  = (int)hg.ejdz("elth", ejdw(int ), (int)390);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl356
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_2 /* !! */  = (int)hg.ejdz("eltj", ejdw(int ), (int)391);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl334
                    break;
                }
            }
            case 2: {
                var6_2 /* !! */  = (int)hg.ejdz("eltk", ejdw(int ), (int)392);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl117:
            // 3 sources

            case 3: {
                do {
                    var6_2 /* !! */  = (int)hg.ejdz("eltr", ejdw(int ), (int)393);
                } while (!var7_1);
                throw null;
            }
lbl122:
            // 2 sources

            case 4: {
                var6_2 /* !! */  = (int)hg.ejdz("elts", ejdw(int ), (int)394);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl127:
            // 2 sources

            case 5: {
                var6_2 /* !! */  = (int)hg.ejdz("eltu", ejdw(int ), (int)395);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 6: {
                var6_2 /* !! */  = (int)hg.ejdz("eltv", ejdw(int ), (int)396);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl137:
            // 3 sources

            case 7: {
                var6_2 /* !! */  = (int)hg.ejdz("eltx", ejdw(int ), (int)397);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl142:
            // 2 sources

            case 8: {
                var6_2 /* !! */  = (int)hg.ejdz("eltz", ejdw(int ), (int)398);
                if (!var7_1) ** GOTO lbl137
                throw null;
            }
lbl146:
            // 2 sources

            case 9: {
                var6_2 /* !! */  = (int)hg.ejdz("elub", ejdw(int ), (int)399);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl151:
            // 3 sources

            case 10: {
                var6_2 /* !! */  = (int)hg.ejdz("elug", ejdw(int ), (int)400);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl290
            }
            case 11: {
                var6_2 /* !! */  = (int)hg.ejdz("elui", ejdw(int ), (int)401);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl161:
            // 5 sources

            case 12: {
                var6_2 /* !! */  = (int)hg.ejdz("eluk", ejdw(int ), (int)402);
                if (!var7_1) ** GOTO lbl127
                throw null;
            }
            case 13: {
                var6_2 /* !! */  = (int)hg.ejdz("elum", ejdw(int ), (int)403);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl170:
            // 3 sources

            case 14: {
                var6_2 /* !! */  = (int)hg.ejdz("eluo", ejdw(int ), (int)404);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl175:
            // 2 sources

            case 15: {
                var6_2 /* !! */  = (int)hg.ejdz("elup", ejdw(int ), (int)405);
                if (!var7_1) ** GOTO lbl161
                throw null;
            }
            case 16: {
                var6_2 /* !! */  = (int)hg.ejdz("elur", ejdw(int ), (int)406);
                if (!var7_1) ** GOTO lbl101
                throw null;
            }
lbl183:
            // 2 sources

            case 17: {
                var6_2 /* !! */  = (int)hg.ejdz("elux", ejdw(int ), (int)407);
                if (!var7_1) ** GOTO lbl101
                throw null;
            }
lbl187:
            // 3 sources

            case 18: {
                var6_2 /* !! */  = (int)hg.ejdz("eluz", ejdw(int ), (int)408);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl192:
            // 2 sources

            case 19: {
                var6_2 /* !! */  = (int)hg.ejdz("elvb", ejdw(int ), (int)409);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl197:
            // 3 sources

            case 20: {
                var6_2 /* !! */  = (int)hg.ejdz("elvd", ejdw(int ), (int)410);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl372
            }
            case 21: {
                var6_2 /* !! */  = (int)hg.ejdz("elve", ejdw(int ), (int)411);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 22: {
                var6_2 /* !! */  = (int)hg.ejdz("elvg", ejdw(int ), (int)412);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl342
            }
lbl212:
            // 2 sources

            case 23: {
                var6_2 /* !! */  = (int)hg.ejdz("elvh", ejdw(int ), (int)413);
                if (!var7_1) ** GOTO lbl170
                throw null;
            }
lbl216:
            // 2 sources

            case 24: {
                var6_2 /* !! */  = (int)hg.ejdz("elvn", ejdw(int ), (int)414);
                if (var7_1) {
                    throw null;
                }
            }
lbl220:
            // 5 sources

            case 25: {
                var6_2 /* !! */  = (int)hg.ejdz("elvo", ejdw(int ), (int)415);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl225:
            // 3 sources

            case 26: {
                var6_2 /* !! */  = (int)hg.ejdz("elvp", ejdw(int ), (int)416);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 27: {
                var6_2 /* !! */  = (int)hg.ejdz("elvr", ejdw(int ), (int)417);
                if (var7_1) {
                    throw null;
                }
            }
            case 28: {
                var6_2 /* !! */  = (int)hg.ejdz("elvt", ejdw(int ), (int)418);
                if (!var7_1) ** GOTO lbl117
                throw null;
            }
lbl238:
            // 3 sources

            case 29: {
                var6_2 /* !! */  = (int)hg.ejdz("elvv", ejdw(int ), (int)419);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl243:
            // 4 sources

            case 30: {
                var6_2 /* !! */  = (int)hg.ejdz("elvx", ejdw(int ), (int)420);
                if (!var7_1) ** GOTO lbl238
                throw null;
            }
            case 31: {
                var6_2 /* !! */  = (int)hg.ejdz("elwb", ejdw(int ), (int)421);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl376
            }
            case 32: {
                var6_2 /* !! */  = (int)hg.ejdz("elwd", ejdw(int ), (int)422);
                if (!var7_1) ** GOTO lbl187
                throw null;
            }
            case 33: {
                var6_2 /* !! */  = (int)hg.ejdz("elwh", ejdw(int ), (int)423);
                if (!var7_1) ** GOTO lbl192
                throw null;
            }
lbl260:
            // 2 sources

            case 34: {
                var6_2 /* !! */  = (int)hg.ejdz("elwj", ejdw(int ), (int)424);
                if (!var7_1) ** GOTO lbl212
                throw null;
            }
            case 35: {
                var6_2 /* !! */  = (int)hg.ejdz("elwk", ejdw(int ), (int)425);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl342
            }
            case 36: {
                var6_2 /* !! */  = (int)hg.ejdz("elwl", ejdw(int ), (int)426);
                if (!var7_1) ** GOTO lbl122
                throw null;
            }
            case 37: {
                var6_2 /* !! */  = (int)hg.ejdz("elwo", ejdw(int ), (int)427);
                if (!var7_1) ** GOTO lbl151
                throw null;
            }
lbl277:
            // 3 sources

            case 38: {
                var6_2 /* !! */  = (int)hg.ejdz("elwu", ejdw(int ), (int)428);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 39: {
                var6_2 /* !! */  = (int)hg.ejdz("elwx", ejdw(int ), (int)429);
                if (!var7_1) ** GOTO lbl220
                throw null;
            }
lbl286:
            // 2 sources

            case 40: {
                var6_2 /* !! */  = (int)hg.ejdz("elwz", ejdw(int ), (int)430);
                if (!var7_1) ** GOTO lbl197
                throw null;
            }
lbl290:
            // 4 sources

            case 41: {
                var6_2 /* !! */  = (int)hg.ejdz("elxb", ejdw(int ), (int)431);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl295:
            // 3 sources

            case 42: {
                var6_2 /* !! */  = (int)hg.ejdz("elxd", ejdw(int ), (int)432);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl392
            }
lbl300:
            // 2 sources

            case 43: {
                do {
                    var6_2 /* !! */  = (int)hg.ejdz("elxf", ejdw(int ), (int)433);
                } while (!var7_1);
                throw null;
            }
lbl305:
            // 2 sources

            case 44: {
                var6_2 /* !! */  = (int)hg.ejdz("elxg", ejdw(int ), (int)434);
                if (!var7_1) ** GOTO lbl243
                throw null;
            }
            case 45: {
                var6_2 /* !! */  = (int)hg.ejdz("elxn", ejdw(int ), (int)435);
                if (!var7_1) ** GOTO lbl216
                throw null;
            }
lbl313:
            // 2 sources

            case 46: {
                var6_2 /* !! */  = (int)hg.ejdz("elxp", ejdw(int ), (int)436);
                if (!var7_1) ** GOTO lbl220
                throw null;
            }
lbl317:
            // 2 sources

            case 47: {
                var6_2 /* !! */  = (int)hg.ejdz("elxq", ejdw(int ), (int)437);
                if (!var7_1) ** GOTO lbl238
                throw null;
            }
            case 48: {
                var6_2 /* !! */  = (int)hg.ejdz("elxu", ejdw(int ), (int)438);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 49: {
                var6_2 /* !! */  = (int)hg.ejdz("elxx", ejdw(int ), (int)439);
                if (!var7_1) ** GOTO lbl317
                throw null;
            }
            case 50: {
                var6_2 /* !! */  = (int)hg.ejdz("elxz", ejdw(int ), (int)440);
                if (!var7_1) ** GOTO lbl151
                throw null;
            }
lbl334:
            // 3 sources

            case 51: {
                var6_2 /* !! */  = (int)hg.ejdz("elya", ejdw(int ), (int)441);
                if (!var7_1) ** GOTO lbl175
                throw null;
            }
lbl338:
            // 2 sources

            case 52: {
                var6_2 /* !! */  = (int)hg.ejdz("elyh", ejdw(int ), (int)442);
                if (!var7_1) ** GOTO lbl170
                throw null;
            }
lbl342:
            // 3 sources

            case 53: {
                var6_2 /* !! */  = (int)hg.ejdz("elyk", ejdw(int ), (int)443);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl400
            }
            case 54: {
                var6_2 /* !! */  = (int)hg.ejdz("elyo", ejdw(int ), (int)444);
                if (var7_1) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl352:
            // 3 sources

            case 55: {
                var6_2 /* !! */  = (int)hg.ejdz("elyq", ejdw(int ), (int)445);
                if (!var7_1) ** GOTO lbl225
                throw null;
            }
lbl356:
            // 3 sources

            case 56: {
                var6_2 /* !! */  = (int)hg.ejdz("elys", ejdw(int ), (int)446);
                if (!var7_1) ** GOTO lbl137
                throw null;
            }
lbl360:
            // 2 sources

            case 57: {
                var6_2 /* !! */  = (int)hg.ejdz("elyt", ejdw(int ), (int)447);
                if (!var7_1) ** GOTO lbl277
                throw null;
            }
            case 58: {
                var6_2 /* !! */  = (int)hg.ejdz("elyw", ejdw(int ), (int)448);
                if (!var7_1) ** GOTO lbl338
                throw null;
            }
            case 59: {
                var6_2 /* !! */  = (int)hg.ejdz("elzc", ejdw(int ), (int)449);
                if (!var7_1) ** GOTO lbl142
                throw null;
            }
lbl372:
            // 2 sources

            case 60: {
                var6_2 /* !! */  = (int)hg.ejdz("elzg", ejdw(int ), (int)450);
                if (!var7_1) ** GOTO lbl290
                throw null;
            }
lbl376:
            // 4 sources

            case 61: {
                var6_2 /* !! */  = (int)hg.ejdz("elzj", ejdw(int ), (int)451);
                if (!var7_1) ** GOTO lbl161
                throw null;
            }
lbl380:
            // 2 sources

            case 62: {
                var6_2 /* !! */  = (int)hg.ejdz("elzl", ejdw(int ), (int)452);
                if (!var7_1) ** GOTO lbl243
                throw null;
            }
            case 63: {
                var6_2 /* !! */  = (int)hg.ejdz("elzn", ejdw(int ), (int)453);
                if (!var7_1) ** GOTO lbl313
                throw null;
            }
            case 64: {
                var6_2 /* !! */  = (int)hg.ejdz("elzq", ejdw(int ), (int)454);
                if (!var7_1) ** GOTO lbl183
                throw null;
            }
lbl392:
            // 2 sources

            case 65: {
                var6_2 /* !! */  = (int)hg.ejdz("elzt", ejdw(int ), (int)455);
                if (!var7_1) ** GOTO lbl117
                throw null;
            }
            case 66: {
                var6_2 /* !! */  = (int)hg.ejdz("elzy", ejdw(int ), (int)456);
                if (!var7_1) ** GOTO lbl161
                throw null;
            }
lbl400:
            // 2 sources

            case 67: {
                var6_2 /* !! */  = (int)hg.ejdz("emac", ejdw(int ), (int)457);
                if (!var7_1) ** GOTO lbl187
                throw null;
            }
            case 68: {
                var6_2 /* !! */  = (int)hg.ejdz("emad", ejdw(int ), (int)458);
                if (!var7_1) ** GOTO lbl376
                throw null;
            }
            case 69: {
                var6_2 /* !! */  = (int)hg.ejdz("emaf", ejdw(int ), (int)459);
                if (!var7_1) ** GOTO lbl356
                throw null;
            }
            case 70: 
        }
        var6_2 /* !! */  = (int)hg.ejdz("emah", ejdw(int ), (int)460);
        ** while (!var7_1)
lbl415:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onRotationUpdate(da var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("ekhu", ejev(int ), (int)133)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hg.ejdz("ekhv", ejdw(int ), (int)247)) break;
            v0 /* !! */  = (long)hg.ejdz("ekhw", ejdw(int ), (int)248);
        }
        var4_2 = hg.c;
        v1 /* !! */  = hg.ks;
        if (true) ** GOTO lbl12
        block49: while (true) {
            v1 /* !! */  = (long)(v2 - hg.ejdz("ekhx", ejev(int ), (int)134));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -561706393: {
                    v2 = hg.ejdz("ekhy", ejev(int ), (int)135);
                    continue block49;
                }
                case 695013158: {
                    break block49;
                }
                case 1657469927: {
                    v2 = hg.ejdz("ekhz", ejev(int ), (int)136);
                    continue block49;
                }
            }
            break;
        }
        var3_3 /* !! */  = hg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("ekia", ejev(int ), (int)137)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hg.ejdz("ekib", ejdw(int ), (int)249)) break;
            v3 /* !! */  = (long)hg.ejdz("ekic", ejdw(int ), (int)250);
        }
        var2_4 = hg.a;
        if (var4_2) {
            throw null;
lbl31:
            // 11 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("ekid", ejev(int ), (int)138)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == hg.ejdz("ekie", ejdw(int ), (int)251)) break;
            v4 /* !! */  = (long)hg.ejdz("ekif", ejdw(int ), (int)252);
        }
        v5 /* !! */  = hg.ks;
        if (true) ** GOTO lbl44
        block53: while (true) {
            v5 /* !! */  = (long)(v6 - hg.ejdz("ekig", ejev(int ), (int)139));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -541139759: {
                    v6 = hg.ejdz("ekih", ejev(int ), (int)140);
                    continue block53;
                }
                case -319817651: {
                    v6 = hg.ejdz("ekii", ejev(int ), (int)141);
                    continue block53;
                }
                case 695013158: {
                    break block53;
                }
            }
            break;
        }
        if (hg.mc.field_1724 == null) ** GOTO lbl79
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 /* !! */  = hg.ks;
                if (true) ** GOTO lbl62
                block54: while (true) {
                    v7 /* !! */  = (long)(v8 - hg.ejdz("ekij", ejev(int ), (int)142));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 695013158: {
                            break block54;
                        }
                        case 916351982: {
                            v8 = hg.ejdz("ekik", ejev(int ), (int)143);
                            continue block54;
                        }
                        case 1624479821: {
                            v8 = hg.ejdz("ekil", ejev(int ), (int)144);
                            continue block54;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("ekim", ejev(int ), (int)145)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == hg.ejdz("ekin", ejdw(int ), (int)253)) break;
                    v9 /* !! */  = (long)hg.ejdz("ekio", ejdw(int ), (int)254);
                }
                if (hg.mc.field_1687 != null) ** GOTO lbl81
                if (var2_4) ** GOTO lbl31
lbl79:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                return;
lbl81:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("ekip", ejev(int ), (int)146)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == hg.ejdz("ekiq", ejdw(int ), (int)255)) break;
                    v10 /* !! */  = (long)hg.ejdz("ekir", ejdw(int ), (int)256);
                }
                if (var1_1.getType() != 0) ** GOTO lbl132
                if (var2_4 || var2_4) ** GOTO lbl31
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = hg.ks - hg.ejdz("ekis", ejev(int ), (int)147)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == hg.ejdz("ekit", ejdw(int ), (int)257)) break;
                    v11 /* !! */  = (long)hg.ejdz("ekiu", ejdw(int ), (int)258);
                }
                if (this.shouldThrow()) ** GOTO lbl116
                if (var2_4) ** GOTO lbl31
                v12 /* !! */  = hg.ks;
                if (true) ** GOTO lbl102
                block58: while (true) {
                    v12 /* !! */  = (long)(v13 - hg.ejdz("ekiv", ejev(int ), (int)148));
lbl102:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -343752659: {
                            v13 = hg.ejdz("ekiw", ejev(int ), (int)149);
                            continue block58;
                        }
                        case 189967263: {
                            v13 = hg.ejdz("ekix", ejev(int ), (int)150);
                            continue block58;
                        }
                        case 695013158: {
                            break block58;
                        }
                        case 1265311225: {
                            v13 = hg.ejdz("ekiy", ejev(int ), (int)151);
                            continue block58;
                        }
                    }
                    break;
                }
                if (!this.spoofed) ** GOTO lbl132
                if (var2_4) ** GOTO lbl31
lbl116:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl31
                v14 /* !! */  = hg.ks;
                if (true) ** GOTO lbl121
                block59: while (true) {
                    v14 /* !! */  = (long)(v15 - hg.ejdz("ekiz", ejev(int ), (int)152));
lbl121:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1954654604: {
                            v15 = hg.ejdz("ekja", ejev(int ), (int)153);
                            continue block59;
                        }
                        case 695013158: {
                            break block59;
                        }
                        case 1905774790: {
                            v15 = hg.ejdz("ekjb", ejev(int ), (int)154);
                            continue block59;
                        }
                    }
                    break;
                }
                this.performRotation();
                if (var2_4) ** GOTO lbl31
lbl132:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl135:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjc", ejdw(int ), (int)259);
                if (var4_2) {
                    throw null;
                }
            }
lbl139:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjd", ejdw(int ), (int)260);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl144:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hg.ejdz("ekje", ejdw(int ), (int)261);
                if (!var4_2) ** GOTO lbl135
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjf", ejdw(int ), (int)262);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 4: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjg", ejdw(int ), (int)263);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl158:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjh", ejdw(int ), (int)264);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl163:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)hg.ejdz("ekji", ejdw(int ), (int)265);
                if (!var4_2) ** GOTO lbl158
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hg.ejdz("ekjj", ejdw(int ), (int)266);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl216
                    break;
                }
            }
            case 8: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjk", ejdw(int ), (int)267);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl178:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjl", ejdw(int ), (int)268);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl183:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjm", ejdw(int ), (int)269);
                if (!var4_2) ** GOTO lbl144
                throw null;
            }
lbl187:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjn", ejdw(int ), (int)270);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
lbl191:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjo", ejdw(int ), (int)271);
                if (!var4_2) ** GOTO lbl178
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjp", ejdw(int ), (int)272);
                if (var4_2) {
                    throw null;
                }
            }
lbl199:
            // 4 sources

            case 14: {
                var3_3 /* !! */  = (int)hg.ejdz("ekjq", ejdw(int ), (int)273);
                if (!var4_2) ** GOTO lbl139
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)hg.ejdz("ekzm", ejdw(int ), (int)274);
                if (!var4_2) ** GOTO lbl183
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)hg.ejdz("ekzo", ejdw(int ), (int)275);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl212:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)hg.ejdz("ekzq", ejdw(int ), (int)276);
                if (!var4_2) ** GOTO lbl183
                throw null;
            }
lbl216:
            // 3 sources

            case 18: {
                do {
                    var3_3 /* !! */  = (int)hg.ejdz("ekzw", ejdw(int ), (int)277);
                } while (!var4_2);
                throw null;
            }
            case 19: 
        }
        var3_3 /* !! */  = (int)hg.ejdz("ekzy", ejdw(int ), (int)278);
        ** while (!var4_2)
lbl224:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean shouldThrow() {
        v0 /* !! */  = hg.ks;
        if (true) ** GOTO lbl5
        block53: while (true) {
            v0 /* !! */  = (long)(v1 - hg.ejdz("ekey", ejev(int ), (int)101));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 603992813: {
                    v1 = hg.ejdz("ekez", ejev(int ), (int)102);
                    continue block53;
                }
                case 695013158: {
                    break block53;
                }
                case 2059725936: {
                    v1 = hg.ejdz("ekfa", ejev(int ), (int)103);
                    continue block53;
                }
            }
            break;
        }
        var3_1 = hg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hg.ks - hg.ejdz("ekfb", ejev(int ), (int)104)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hg.ejdz("ekfc", ejdw(int ), (int)205)) break;
            v2 /* !! */  = (long)hg.ejdz("ekfd", ejdw(int ), (int)206);
        }
        var2_2 /* !! */  = hg.b;
        v3 /* !! */  = hg.ks;
        if (true) ** GOTO lbl25
        block55: while (true) {
            v3 /* !! */  = (long)(hg.ejdz("ekff", ejev(int ), (int)106) - hg.ejdz("ekfe", ejev(int ), (int)105));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 695013158: {
                    break block55;
                }
                case 1945705329: {
                    continue block55;
                }
            }
            break;
        }
        var1_3 = hg.a;
        if (var3_1) {
            throw null;
lbl33:
            // 10 sources

            return (boolean)hg.ejdz("ekfg", ejdw(int ), (int)207);
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hg.ks - hg.ejdz("ekfh", ejev(int ), (int)107)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hg.ejdz("ekfi", ejdw(int ), (int)208)) break;
                    v4 /* !! */  = (long)hg.ejdz("ekfj", ejdw(int ), (int)209);
                }
                v5 /* !! */  = hg.ks;
                if (true) ** GOTO lbl49
                block58: while (true) {
                    v5 /* !! */  = (long)(v6 - hg.ejdz("ekfk", ejev(int ), (int)108));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 328008418: {
                            v6 = hg.ejdz("ekfl", ejev(int ), (int)109);
                            continue block58;
                        }
                        case 695013158: {
                            break block58;
                        }
                        case 1202901213: {
                            v6 = hg.ejdz("ekfm", ejev(int ), (int)110);
                            continue block58;
                        }
                        case 1550435098: {
                            v6 = hg.ejdz("ekfn", ejev(int ), (int)111);
                            continue block58;
                        }
                    }
                    break;
                }
                if (hg.mc.field_1724 == null) ** GOTO lbl91
                if (var1_3) ** GOTO lbl33
                v7 /* !! */  = hg.ks;
                if (true) ** GOTO lbl67
                block59: while (true) {
                    v7 /* !! */  = (long)(v8 - hg.ejdz("ekfo", ejev(int ), (int)112));
lbl67:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1282568708: {
                            v8 = hg.ejdz("ekfp", ejev(int ), (int)113);
                            continue block59;
                        }
                        case -57968089: {
                            v8 = hg.ejdz("ekfq", ejev(int ), (int)114);
                            continue block59;
                        }
                        case 695013158: {
                            break block59;
                        }
                    }
                    break;
                }
                v9 /* !! */  = hg.ks;
                if (true) ** GOTO lbl80
                block60: while (true) {
                    v9 /* !! */  = (long)(v10 - hg.ejdz("ekfr", ejev(int ), (int)115));
lbl80:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -500116715: {
                            v10 = hg.ejdz("ekfs", ejev(int ), (int)116);
                            continue block60;
                        }
                        case 407337171: {
                            v10 = hg.ejdz("ekft", ejev(int ), (int)117);
                            continue block60;
                        }
                        case 695013158: {
                            break block60;
                        }
                    }
                    break;
                }
                if (hg.mc.field_1687 != null) ** GOTO lbl93
                if (var1_3) ** GOTO lbl33
lbl91:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl33
                return (boolean)hg.ejdz("ekfu", ejdw(int ), (int)210);
lbl93:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = hg.ks - hg.ejdz("ekfv", ejev(int ), (int)118)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hg.ejdz("ekfw", ejdw(int ), (int)211)) break;
                    v11 /* !! */  = (long)hg.ejdz("ekfx", ejdw(int ), (int)212);
                }
                if (!this.isActive()) ** GOTO lbl180
                if (var1_3) ** GOTO lbl33
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_3 = hg.ks - hg.ejdz("ekfy", ejev(int ), (int)119)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == hg.ejdz("ekfz", ejdw(int ), (int)213)) break;
                    v12 /* !! */  = (long)hg.ejdz("ekga", ejdw(int ), (int)214);
                }
                if (!this.canBuff()) ** GOTO lbl180
                if (var1_3) ** GOTO lbl33
                v13 /* !! */  = hg.ks;
                if (true) ** GOTO lbl112
                block63: while (true) {
                    v13 /* !! */  = (long)(hg.ejdz("ekgc", ejev(int ), (int)121) - hg.ejdz("ekgb", ejev(int ), (int)120));
lbl112:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2033506077: {
                            continue block63;
                        }
                        case 695013158: {
                            break block63;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = hg.ks - hg.ejdz("ekgd", ejev(int ), (int)122)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hg.ejdz("ekge", ejdw(int ), (int)215)) break;
                    v14 /* !! */  = (long)hg.ejdz("ekgf", ejdw(int ), (int)216);
                }
                v15 = hg.mc.field_1687;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = hg.ks - hg.ejdz("ekgg", ejev(int ), (int)123)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == hg.ejdz("ekgh", ejdw(int ), (int)217)) break;
                    v16 /* !! */  = (long)hg.ejdz("ekgi", ejdw(int ), (int)218);
                }
                v17 /* !! */  = hg.ks;
                if (true) ** GOTO lbl132
                block66: while (true) {
                    v17 /* !! */  = (long)(v18 - hg.ejdz("ekgj", ejev(int ), (int)124));
lbl132:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -242023180: {
                            v18 = hg.ejdz("ekgk", ejev(int ), (int)125);
                            continue block66;
                        }
                        case 695013158: {
                            break block66;
                        }
                        case 1211190712: {
                            v18 = hg.ejdz("ekgl", ejev(int ), (int)126);
                            continue block66;
                        }
                        case 1971936172: {
                            v18 = hg.ejdz("ekgm", ejev(int ), (int)127);
                            continue block66;
                        }
                    }
                    break;
                }
                v19 = hg.mc.field_1724;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = hg.ks - hg.ejdz("ekgn", ejev(int ), (int)128)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hg.ejdz("ekgo", ejdw(int ), (int)219)) break;
                    v20 /* !! */  = (long)hg.ejdz("ekgp", ejdw(int ), (int)220);
                }
                v21 = v19.method_24515();
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_7 = hg.ks - hg.ejdz("ekgq", ejev(int ), (int)129)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == hg.ejdz("ekgr", ejdw(int ), (int)221)) break;
                    v22 /* !! */  = (long)hg.ejdz("ekgs", ejdw(int ), (int)222);
                }
                v23 = v21.method_10074();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = hg.ks - hg.ejdz("ekgt", ejev(int ), (int)130)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == hg.ejdz("ekgu", ejdw(int ), (int)223)) break;
                    v24 /* !! */  = (long)hg.ejdz("ekgv", ejdw(int ), (int)224);
                }
                v25 = v15.method_8320(v23);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_9 = hg.ks - hg.ejdz("ekgw", ejev(int ), (int)131)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == hg.ejdz("ekgx", ejdw(int ), (int)225)) break;
                    v26 /* !! */  = (long)hg.ejdz("ekgy", ejdw(int ), (int)226);
                }
                v27 = v25.method_26204();
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_10 = hg.ks - hg.ejdz("ekgz", ejev(int ), (int)132)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == hg.ejdz("ekha", ejdw(int ), (int)227)) break;
                    v28 /* !! */  = (long)hg.ejdz("ekhb", ejdw(int ), (int)228);
                }
                if (v27 == class_2246.field_10124) ** GOTO lbl180
                if (var1_3) ** GOTO lbl33
                v29 = hg.ejdz("ekhc", ejdw(int ), (int)229);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl183
lbl180:
                // 3 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v29 = hg.ejdz("ekhd", ejdw(int ), (int)230);
lbl183:
                // 2 sources

                return (boolean)v29;
            }
lbl184:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhe", ejdw(int ), (int)231);
                if (!var3_1) break;
                throw null;
            }
lbl188:
            // 3 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)hg.ejdz("ekhf", ejdw(int ), (int)232);
                } while (!var3_1);
                throw null;
            }
lbl193:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhg", ejdw(int ), (int)233);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhh", ejdw(int ), (int)234);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhi", ejdw(int ), (int)235);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl206:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhj", ejdw(int ), (int)236);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl211:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhk", ejdw(int ), (int)237);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 7: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhl", ejdw(int ), (int)238);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
lbl220:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhm", ejdw(int ), (int)239);
                if (!var3_1) ** GOTO lbl193
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhn", ejdw(int ), (int)240);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
lbl228:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hg.ejdz("ekho", ejdw(int ), (int)241);
                if (!var3_1) ** GOTO lbl193
                throw null;
            }
lbl232:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhp", ejdw(int ), (int)242);
                if (!var3_1) ** GOTO lbl206
                throw null;
            }
lbl236:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hg.ejdz("ekhq", ejdw(int ), (int)243);
                    if (!var3_1) ** GOTO lbl232
                    throw null;
                }
            }
            case 13: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhr", ejdw(int ), (int)244);
                if (!var3_1) ** GOTO lbl211
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)hg.ejdz("ekhs", ejdw(int ), (int)245);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)hg.ejdz("ekht", ejdw(int ), (int)246);
        ** while (!var3_1)
lbl252:
        // 1 sources

        throw null;
    }
}

