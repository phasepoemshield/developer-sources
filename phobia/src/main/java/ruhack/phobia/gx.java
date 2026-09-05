/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1934
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_2480
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_2828$class_2830
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1934;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_2828;
import ruhack.phobia.aw;
import ruhack.phobia.ca;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.cy;
import ruhack.phobia.dh;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.g;
import ruhack.phobia.gx$HealthSnapshot;
import ruhack.phobia.gx$State;
import ruhack.phobia.jx;
import ruhack.phobia.kg;
import ruhack.phobia.np;
import ruhack.phobia.pp;
import ruhack.phobia.w;

public final class gx
extends ds {
    private final Map<UUID, gx$HealthSnapshot> healthSnapshots;
    private final Map<class_1792, Integer> lootInventoryBaseline;
    private static int[] fmqo;
    private long stateSince;
    private static final long SPAWN_DELAY_MS = 1000L;
    private static long[] fmrq;
    private gx$State state;
    private long targetLostAt;
    public static final int b;
    private long lastRetargetAt;
    private static final float LETHAL_HEALTH = 1.0f;
    private static final long RECENT_DAMAGE_MS = 1250L;
    public static final boolean c;
    private boolean lootInventoryTracking;
    private int lethalTicks;
    private static final long APPROACH_TIMEOUT_MS = 15000L;
    private class_243 routePosition;
    private static long[] fmrr;
    private static final long RETARGET_DELAY_MS = 100L;
    private final kg escapeDistance;
    private UUID trackedLoot;
    public static final long mq = 8222373113335462389L;
    private class_243 watchedPosition;
    private boolean ownsExploit;
    private final kg playerRadius;
    private UUID watchedPlayer;
    private static final int LETHAL_CONFIRM_TICKS = 2;
    private static final long TARGET_LOST_TIMEOUT_MS = 2000L;
    private long spawnAt;
    private static int[] fmqn;
    private final kg fightDistance;
    private final kg verticalRadius;
    private long lastLootSeenAt;
    private static final float ARM_HEALTH = 4.0f;
    public static final boolean a;

    private static /* synthetic */ void frhp() {
        gx.fmqn[100] = -1544358333;
        gx.fmqn[101] = -41851154;
        gx.fmqn[102] = -1659141894;
        gx.fmqn[103] = -1483036089;
        gx.fmqn[104] = -1011935302;
        gx.fmqn[105] = -2031847888;
        gx.fmqn[106] = 78915879;
        gx.fmqn[107] = 1523655331;
        gx.fmqn[108] = 844117120;
        gx.fmqn[109] = -1087503802;
        gx.fmqn[110] = 1307219400;
        gx.fmqn[111] = 1379081966;
        gx.fmqn[112] = -1136280696;
        gx.fmqn[113] = -1278654146;
        gx.fmqn[114] = -1184958303;
        gx.fmqn[115] = -1879281073;
        gx.fmqn[116] = 1150076565;
        gx.fmqn[117] = 2146854431;
        gx.fmqn[118] = 532781839;
        gx.fmqn[119] = -123238593;
        gx.fmqn[120] = 1240300566;
        gx.fmqn[121] = 612670729;
        gx.fmqn[122] = -169808879;
        gx.fmqn[123] = -1266699354;
        gx.fmqn[124] = 2126494458;
        gx.fmqn[125] = -196986502;
        gx.fmqn[126] = -330935565;
        gx.fmqn[127] = -1475600433;
        gx.fmqn[128] = 973323359;
        gx.fmqn[129] = 530168198;
        gx.fmqn[130] = -691865683;
        gx.fmqn[131] = -708798799;
        gx.fmqn[132] = -1422955224;
        gx.fmqn[133] = -556097624;
        gx.fmqn[134] = 1365330805;
        gx.fmqn[135] = -1852192220;
        gx.fmqn[136] = -109709725;
        gx.fmqn[137] = -102765768;
        gx.fmqn[138] = 586958847;
        gx.fmqn[139] = -655432570;
        gx.fmqn[140] = -1246796173;
        gx.fmqn[141] = 2131579199;
        gx.fmqn[142] = -438344103;
        gx.fmqn[143] = 5823508;
        gx.fmqn[144] = 2141246199;
        gx.fmqn[145] = -574005484;
        gx.fmqn[146] = 612130219;
        gx.fmqn[147] = 1672526374;
        gx.fmqn[148] = 1674916331;
        gx.fmqn[149] = 401398377;
        gx.fmqn[150] = 1019769400;
        gx.fmqn[151] = 874370042;
        gx.fmqn[152] = -1430459724;
        gx.fmqn[153] = 1378604835;
        gx.fmqn[154] = -1801146501;
        gx.fmqn[155] = 150125831;
        gx.fmqn[156] = 1607738859;
        gx.fmqn[157] = 2049430187;
        gx.fmqn[158] = 363513368;
        gx.fmqn[159] = 1417196954;
        gx.fmqn[160] = 500813411;
        gx.fmqn[161] = 1939755388;
        gx.fmqn[162] = -1555909111;
        gx.fmqn[163] = -38228730;
        gx.fmqn[164] = 1608742917;
        gx.fmqn[165] = 293799573;
        gx.fmqn[166] = 139553729;
        gx.fmqn[167] = 1228673721;
        gx.fmqn[168] = -242331468;
        gx.fmqn[169] = 1487722378;
        gx.fmqn[170] = -1573450229;
        gx.fmqn[171] = -1548819822;
        gx.fmqn[172] = -1405352054;
        gx.fmqn[173] = -1578129240;
        gx.fmqn[174] = -842492015;
        gx.fmqn[175] = -395876412;
        gx.fmqn[176] = -990377440;
        gx.fmqn[177] = -374249257;
        gx.fmqn[178] = 1289420255;
        gx.fmqn[179] = -1977122779;
        gx.fmqn[180] = 355373974;
        gx.fmqn[181] = 798925690;
        gx.fmqn[182] = 73362747;
        gx.fmqn[183] = -292275160;
        gx.fmqn[184] = -481249412;
        gx.fmqn[185] = -81008452;
        gx.fmqn[186] = -2027096640;
        gx.fmqn[187] = 2027583284;
        gx.fmqn[188] = 1661742567;
        gx.fmqn[189] = 272346960;
        gx.fmqn[190] = 1632444491;
        gx.fmqn[191] = -1602986030;
        gx.fmqn[192] = 1582035686;
        gx.fmqn[193] = -761503097;
        gx.fmqn[194] = 706811469;
        gx.fmqn[195] = 2011740420;
        gx.fmqn[196] = -1081150692;
        gx.fmqn[197] = 2055527383;
        gx.fmqn[198] = -2043284126;
        gx.fmqn[199] = 336893786;
    }

    private static /* synthetic */ void frpp() {
        gx.fmqo[700] = 1463662337;
        gx.fmqo[701] = -809050529;
        gx.fmqo[702] = -1973693625;
        gx.fmqo[703] = -1914810860;
        gx.fmqo[704] = 299950027;
        gx.fmqo[705] = -1371532001;
        gx.fmqo[706] = 1256468519;
        gx.fmqo[707] = 2006493278;
        gx.fmqo[708] = 317855270;
        gx.fmqo[709] = 1840830324;
        gx.fmqo[710] = 20080174;
        gx.fmqo[711] = 58312419;
        gx.fmqo[712] = -411223519;
        gx.fmqo[713] = -1880108308;
        gx.fmqo[714] = 1576494916;
        gx.fmqo[715] = 2079454875;
        gx.fmqo[716] = 129372198;
        gx.fmqo[717] = 1381356000;
        gx.fmqo[718] = -1815844442;
        gx.fmqo[719] = 5708472;
        gx.fmqo[720] = 953139839;
        gx.fmqo[721] = -757303135;
        gx.fmqo[722] = 1157508876;
        gx.fmqo[723] = 882134777;
        gx.fmqo[724] = -1542686948;
        gx.fmqo[725] = -106393931;
        gx.fmqo[726] = 1910683074;
        gx.fmqo[727] = 611994720;
        gx.fmqo[728] = -1642276505;
        gx.fmqo[729] = -1385210649;
        gx.fmqo[730] = 2041287594;
        gx.fmqo[731] = 38192698;
        gx.fmqo[732] = 383462540;
        gx.fmqo[733] = 881752529;
        gx.fmqo[734] = -939613235;
        gx.fmqo[735] = 335667979;
        gx.fmqo[736] = -1425193430;
        gx.fmqo[737] = -150076553;
        gx.fmqo[738] = 2111138595;
        gx.fmqo[739] = -1574456320;
        gx.fmqo[740] = -279848543;
        gx.fmqo[741] = -2052829868;
        gx.fmqo[742] = 169524277;
        gx.fmqo[743] = -2030651637;
        gx.fmqo[744] = -920641076;
        gx.fmqo[745] = 1291713609;
        gx.fmqo[746] = -1519659516;
        gx.fmqo[747] = -1818569223;
        gx.fmqo[748] = -1582140278;
        gx.fmqo[749] = 2044161490;
        gx.fmqo[750] = 2140278058;
        gx.fmqo[751] = 1612759747;
        gx.fmqo[752] = -1962407302;
        gx.fmqo[753] = 1961418362;
        gx.fmqo[754] = -1198824641;
        gx.fmqo[755] = 1414677795;
        gx.fmqo[756] = -808124667;
        gx.fmqo[757] = 1204421520;
        gx.fmqo[758] = -1686458243;
        gx.fmqo[759] = 546393450;
        gx.fmqo[760] = 1864617120;
        gx.fmqo[761] = -586609637;
        gx.fmqo[762] = 205407143;
        gx.fmqo[763] = -657399664;
        gx.fmqo[764] = 920373586;
        gx.fmqo[765] = 1627143434;
        gx.fmqo[766] = 720772133;
        gx.fmqo[767] = -30920308;
        gx.fmqo[768] = 831809396;
        gx.fmqo[769] = 510491622;
        gx.fmqo[770] = -1806352713;
        gx.fmqo[771] = 1108046729;
        gx.fmqo[772] = 878649707;
        gx.fmqo[773] = -1789919476;
        gx.fmqo[774] = 58612726;
        gx.fmqo[775] = -449042015;
        gx.fmqo[776] = 1174082502;
        gx.fmqo[777] = 501643005;
        gx.fmqo[778] = -426054170;
        gx.fmqo[779] = 1148636916;
        gx.fmqo[780] = 277301818;
        gx.fmqo[781] = -1664080823;
        gx.fmqo[782] = 1373005388;
        gx.fmqo[783] = 479194565;
        gx.fmqo[784] = 1214203305;
        gx.fmqo[785] = 1724861821;
        gx.fmqo[786] = -1798057427;
        gx.fmqo[787] = 1657887842;
        gx.fmqo[788] = 708248801;
        gx.fmqo[789] = 2034196862;
        gx.fmqo[790] = 1103641674;
        gx.fmqo[791] = -139453504;
        gx.fmqo[792] = 2015687525;
        gx.fmqo[793] = -1919756723;
        gx.fmqo[794] = 1641964707;
        gx.fmqo[795] = 835850927;
        gx.fmqo[796] = 2100516501;
        gx.fmqo[797] = 461175127;
        gx.fmqo[798] = -677385156;
        gx.fmqo[799] = -1831352241;
    }

    private static /* synthetic */ void frlr() {
        gx.fmqn[700] = 1463662357;
        gx.fmqn[701] = -809050547;
        gx.fmqn[702] = -1973693602;
        gx.fmqn[703] = -1914810865;
        gx.fmqn[704] = 299950037;
        gx.fmqn[705] = -1371532007;
        gx.fmqn[706] = 1256468525;
        gx.fmqn[707] = 2006493266;
        gx.fmqn[708] = 317855287;
        gx.fmqn[709] = 1840830333;
        gx.fmqn[710] = 20080181;
        gx.fmqn[711] = 58312436;
        gx.fmqn[712] = -411223505;
        gx.fmqn[713] = -1880108299;
        gx.fmqn[714] = 1576494928;
        gx.fmqn[715] = 2079454858;
        gx.fmqn[716] = 129372207;
        gx.fmqn[717] = 1381356026;
        gx.fmqn[718] = -1815844428;
        gx.fmqn[719] = 5708455;
        gx.fmqn[720] = 953139836;
        gx.fmqn[721] = -757303136;
        gx.fmqn[722] = 1157508887;
        gx.fmqn[723] = 882134774;
        gx.fmqn[724] = -1542686971;
        gx.fmqn[725] = -106393952;
        gx.fmqn[726] = 1910683100;
        gx.fmqn[727] = 611994698;
        gx.fmqn[728] = -1642276530;
        gx.fmqn[729] = -1385210631;
        gx.fmqn[730] = 2041287608;
        gx.fmqn[731] = 38192670;
        gx.fmqn[732] = 383462538;
        gx.fmqn[733] = 881752540;
        gx.fmqn[734] = -939613203;
        gx.fmqn[735] = 335667971;
        gx.fmqn[736] = -1425193426;
        gx.fmqn[737] = -150076564;
        gx.fmqn[738] = 2111138600;
        gx.fmqn[739] = -1574456304;
        gx.fmqn[740] = -279848528;
        gx.fmqn[741] = -2052829869;
        gx.fmqn[742] = 169524263;
        gx.fmqn[743] = -2030651613;
        gx.fmqn[744] = -920641084;
        gx.fmqn[745] = 1291713640;
        gx.fmqn[746] = -1519659512;
        gx.fmqn[747] = -1818569261;
        gx.fmqn[748] = -1582140278;
        gx.fmqn[749] = 2044161477;
        gx.fmqn[750] = 2140278068;
        gx.fmqn[751] = 1612759767;
        gx.fmqn[752] = -1962407307;
        gx.fmqn[753] = 1961418343;
        gx.fmqn[754] = -1198824658;
        gx.fmqn[755] = 1414677768;
        gx.fmqn[756] = -808124644;
        gx.fmqn[757] = 1204421507;
        gx.fmqn[758] = -1686458254;
        gx.fmqn[759] = 546393454;
        gx.fmqn[760] = 1864617128;
        gx.fmqn[761] = -586609607;
        gx.fmqn[762] = 205407139;
        gx.fmqn[763] = -657399672;
        gx.fmqn[764] = 920373595;
        gx.fmqn[765] = 1627143444;
        gx.fmqn[766] = 720772138;
        gx.fmqn[767] = -30920306;
        gx.fmqn[768] = 831809406;
        gx.fmqn[769] = 510491623;
        gx.fmqn[770] = 2042009516;
        gx.fmqn[771] = -1108046730;
        gx.fmqn[772] = -1279235684;
        gx.fmqn[773] = -1789919475;
        gx.fmqn[774] = 58612727;
        gx.fmqn[775] = -449042015;
        gx.fmqn[776] = 1174082497;
        gx.fmqn[777] = 501643005;
        gx.fmqn[778] = -426054169;
        gx.fmqn[779] = 1148636913;
        gx.fmqn[780] = 277301823;
        gx.fmqn[781] = -1664080818;
        gx.fmqn[782] = 1373005384;
        gx.fmqn[783] = 479194563;
        gx.fmqn[784] = -647253902;
        gx.fmqn[785] = 1724861815;
        gx.fmqn[786] = -1798057436;
        gx.fmqn[787] = 1657887850;
        gx.fmqn[788] = 708248806;
        gx.fmqn[789] = 2034196856;
        gx.fmqn[790] = 1103641679;
        gx.fmqn[791] = -139453496;
        gx.fmqn[792] = 2015687525;
        gx.fmqn[793] = -1919756675;
        gx.fmqn[794] = 1641964725;
        gx.fmqn[795] = 835850989;
        gx.fmqn[796] = 2100516501;
        gx.fmqn[797] = 461175109;
        gx.fmqn[798] = -677385163;
        gx.fmqn[799] = -1831352216;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void addInventoryCounts(Map<class_1792, Integer> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fpub", fmrp(int ), (int)294)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gx.fmqp("fpuc", fmrd(int ), (int)981)) break;
            v0 /* !! */  = (long)gx.fmqp("fpud", fmrd(int ), (int)982);
        }
        var6_2 = gx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fpue", fmrp(int ), (int)295)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gx.fmqp("fpuf", fmrd(int ), (int)983)) break;
            v1 /* !! */  = (long)gx.fmqp("fpuh", fmrd(int ), (int)984);
        }
        var5_3 /* !! */  = gx.b;
        v2 /* !! */  = gx.mq;
        if (true) ** GOTO lbl17
        block88: while (true) {
            v2 /* !! */  = (long)(v3 - gx.fmqp("fpui", fmrp(int ), (int)296));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1796778921: {
                    v3 = gx.fmqp("fpup", fmrp(int ), (int)297);
                    continue block88;
                }
                case -174380349: {
                    v3 = gx.fmqp("fpuq", fmrp(int ), (int)298);
                    continue block88;
                }
                case 1461008885: {
                    break block88;
                }
            }
            break;
        }
        var4_4 = gx.a;
        if (var6_2) {
            throw null;
lbl29:
            // 13 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        v4 /* !! */  = gx.mq;
        if (true) ** GOTO lbl36
        block90: while (true) {
            v4 /* !! */  = (long)(v5 - gx.fmqp("fpus", fmrp(int ), (int)299));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1234725607: {
                    v5 = gx.fmqp("fpuu", fmrp(int ), (int)300);
                    continue block90;
                }
                case 1461008885: {
                    break block90;
                }
                case 1782795091: {
                    v5 = gx.fmqp("fpux", fmrp(int ), (int)301);
                    continue block90;
                }
                case 1990460208: {
                    v5 = gx.fmqp("fpuy", fmrp(int ), (int)302);
                    continue block90;
                }
            }
            break;
        }
        v6 /* !! */  = gx.mq;
        if (true) ** GOTO lbl52
        block91: while (true) {
            v6 /* !! */  = (long)(v7 - gx.fmqp("fpvh", fmrp(int ), (int)303));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case 827626341: {
                    v7 = gx.fmqp("fpvi", fmrp(int ), (int)304);
                    continue block91;
                }
                case 1425993612: {
                    v7 = gx.fmqp("fpvj", fmrp(int ), (int)305);
                    continue block91;
                }
                case 1461008885: {
                    break block91;
                }
                case 1602978588: {
                    v7 = gx.fmqp("fpvk", fmrp(int ), (int)306);
                    continue block91;
                }
            }
            break;
        }
        v8 = gx.mc.field_1724;
        v9 /* !! */  = gx.mq;
        if (true) ** GOTO lbl69
        block92: while (true) {
            v9 /* !! */  = (long)(gx.fmqp("fpvm", fmrp(int ), (int)308) - gx.fmqp("fpvl", fmrp(int ), (int)307));
lbl69:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 1461008885: {
                    break block92;
                }
                case 2002408416: {
                    continue block92;
                }
            }
            break;
        }
        v10 = v8.method_31548();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fpvn", fmrp(int ), (int)309)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gx.fmqp("fpvt", fmrd(int ), (int)985)) break;
            v11 /* !! */  = (long)gx.fmqp("fpvv", fmrd(int ), (int)986);
        }
        v12 = v10.method_67533();
        v13 /* !! */  = gx.mq;
        if (true) ** GOTO lbl85
        block94: while (true) {
            v13 /* !! */  = (long)(gx.fmqp("fpvz", fmrp(int ), (int)311) - gx.fmqp("fpvx", fmrp(int ), (int)310));
lbl85:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 407759190: {
                    continue block94;
                }
                case 1461008885: {
                    break block94;
                }
            }
            break;
        }
        var2_5 = v12.iterator();
        if (var4_4) ** GOTO lbl29
        block95: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl29
            v14 /* !! */  = gx.mq;
            if (true) ** GOTO lbl98
            block96: while (true) {
                v14 /* !! */  = (long)(v15 - gx.fmqp("fpwa", fmrp(int ), (int)312));
lbl98:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1933447054: {
                        v15 = gx.fmqp("fpwc", fmrp(int ), (int)313);
                        continue block96;
                    }
                    case 1461008885: {
                        break block96;
                    }
                    case 1732791655: {
                        v15 = gx.fmqp("fpwd", fmrp(int ), (int)314);
                        continue block96;
                    }
                }
                break;
            }
            if (!var2_5.hasNext()) ** GOTO lbl160
            if (var4_4) ** GOTO lbl29
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fpwl", fmrp(int ), (int)315)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == gx.fmqp("fpwn", fmrd(int ), (int)987)) break;
                        v16 /* !! */  = (long)gx.fmqp("fpwp", fmrd(int ), (int)988);
                    }
                    var3_6 = (class_1799)var2_5.next();
                    if (var4_4 || var4_4) ** GOTO lbl29
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fpwr", fmrp(int ), (int)316)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v17 /* !! */  == gx.fmqp("fpws", fmrd(int ), (int)989)) break;
                        v17 /* !! */  = (long)gx.fmqp("fpwt", fmrd(int ), (int)990);
                    }
                    if (var3_6.method_7960()) ** GOTO lbl157
                    if (var4_4 || var4_4) ** GOTO lbl29
                    while (true) {
                        if ((v18 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fpwu", fmrp(int ), (int)317)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v18 /* !! */  == gx.fmqp("fpwv", fmrd(int ), (int)991)) break;
                        v18 /* !! */  = (long)gx.fmqp("fpwx", fmrd(int ), (int)992);
                    }
                    v19 = var3_6.method_7909();
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_6 = gx.mq - gx.fmqp("fpwy", fmrp(int ), (int)318)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == gx.fmqp("fpwz", fmrd(int ), (int)993)) break;
                        v20 /* !! */  = (long)gx.fmqp("fpxb", fmrd(int ), (int)994);
                    }
                    v21 = var3_6.method_7947();
                    while (true) {
                        if ((v22 /* !! */  = (cfr_temp_7 = gx.mq - gx.fmqp("fpxc", fmrp(int ), (int)319)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v22 /* !! */  == gx.fmqp("fpxd", fmrd(int ), (int)995)) break;
                        v22 /* !! */  = (long)gx.fmqp("fpxh", fmrd(int ), (int)996);
                    }
                    v23 = v21;
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_8 = gx.mq - gx.fmqp("fpxj", fmrp(int ), (int)320)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == gx.fmqp("fpxk", fmrd(int ), (int)997)) break;
                        v24 /* !! */  = (long)gx.fmqp("fpxl", fmrd(int ), (int)998);
                    }
                    v25 = (BiFunction<Integer, Integer, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, sum(int int ), (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;)();
                    while (true) {
                        if ((v26 /* !! */  = (cfr_temp_9 = gx.mq - gx.fmqp("fpxn", fmrp(int ), (int)321)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v26 /* !! */  == gx.fmqp("fpxo", fmrd(int ), (int)999)) break;
                        v26 /* !! */  = (long)gx.fmqp("fpxq", fmrd(int ), (int)1000);
                    }
                    var1_1.merge(v19, v23, v25);
                    if (var4_4) ** GOTO lbl29
lbl157:
                    // 2 sources

                    if (var4_4 || var4_4) ** GOTO lbl29
                    if (!var6_2) continue block95;
                    throw null;
                }
lbl160:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl29
                v27 /* !! */  = gx.mq;
                if (true) ** GOTO lbl165
                block104: while (true) {
                    v27 /* !! */  = (long)(v28 - gx.fmqp("fpxt", fmrp(int ), (int)322));
lbl165:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1748753178: {
                            v28 = gx.fmqp("fpxu", fmrp(int ), (int)323);
                            continue block104;
                        }
                        case 322069820: {
                            v28 = gx.fmqp("fpxw", fmrp(int ), (int)324);
                            continue block104;
                        }
                        case 1461008885: {
                            break block104;
                        }
                        case 2111382967: {
                            v28 = gx.fmqp("fpxy", fmrp(int ), (int)325);
                            continue block104;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_10 = gx.mq - gx.fmqp("fpya", fmrp(int ), (int)326)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == gx.fmqp("fpyb", fmrd(int ), (int)1001)) break;
                    v29 /* !! */  = (long)gx.fmqp("fpyd", fmrd(int ), (int)1002);
                }
                v30 = gx.mc.field_1724;
                v31 /* !! */  = gx.mq;
                if (true) ** GOTO lbl187
                block106: while (true) {
                    v31 /* !! */  = (long)(v32 - gx.fmqp("fpye", fmrp(int ), (int)327));
lbl187:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -433045379: {
                            v32 = gx.fmqp("fpyf", fmrp(int ), (int)328);
                            continue block106;
                        }
                        case 1461008885: {
                            break block106;
                        }
                        case 1813770099: {
                            v32 = gx.fmqp("fpyg", fmrp(int ), (int)329);
                            continue block106;
                        }
                        case 1926387912: {
                            v32 = gx.fmqp("fpyh", fmrp(int ), (int)330);
                            continue block106;
                        }
                    }
                    break;
                }
                var2_5 = v30.method_6079();
                if (var4_4 || var4_4) ** GOTO lbl29
                v33 /* !! */  = gx.mq;
                if (true) ** GOTO lbl205
                block107: while (true) {
                    v33 /* !! */  = (long)(v34 - gx.fmqp("fpyk", fmrp(int ), (int)331));
lbl205:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1233428559: {
                            v34 = gx.fmqp("fpym", fmrp(int ), (int)332);
                            continue block107;
                        }
                        case -1192726974: {
                            v34 = gx.fmqp("fpyq", fmrp(int ), (int)333);
                            continue block107;
                        }
                        case 1461008885: {
                            break block107;
                        }
                        case 1741682598: {
                            v34 = gx.fmqp("fpyt", fmrp(int ), (int)334);
                            continue block107;
                        }
                    }
                    break;
                }
                if (var2_5.method_7960()) ** GOTO lbl269
                if (var4_4 || var4_4) ** GOTO lbl29
                v35 /* !! */  = gx.mq;
                if (true) ** GOTO lbl223
                block108: while (true) {
                    v35 /* !! */  = (long)(v36 - gx.fmqp("fpyw", fmrp(int ), (int)335));
lbl223:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -2010334721: {
                            v36 = gx.fmqp("fpyy", fmrp(int ), (int)336);
                            continue block108;
                        }
                        case 448940019: {
                            v36 = gx.fmqp("fpza", fmrp(int ), (int)337);
                            continue block108;
                        }
                        case 1461008885: {
                            break block108;
                        }
                        case 1897679714: {
                            v36 = gx.fmqp("fpzb", fmrp(int ), (int)338);
                            continue block108;
                        }
                    }
                    break;
                }
                v37 = var2_5.method_7909();
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_11 = gx.mq - gx.fmqp("fpzd", fmrp(int ), (int)339)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == gx.fmqp("fpzf", fmrd(int ), (int)1003)) break;
                    v38 /* !! */  = (long)gx.fmqp("fpzg", fmrd(int ), (int)1004);
                }
                v39 = var2_5.method_7947();
                v40 /* !! */  = gx.mq;
                if (true) ** GOTO lbl246
                block110: while (true) {
                    v40 /* !! */  = (long)(v41 - gx.fmqp("fpzh", fmrp(int ), (int)340));
lbl246:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case 982570234: {
                            v41 = gx.fmqp("fpzi", fmrp(int ), (int)341);
                            continue block110;
                        }
                        case 1461008885: {
                            break block110;
                        }
                        case 1982910944: {
                            v41 = gx.fmqp("fpzj", fmrp(int ), (int)342);
                            continue block110;
                        }
                    }
                    break;
                }
                v42 = v39;
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_12 = gx.mq - gx.fmqp("fpzl", fmrp(int ), (int)343)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == gx.fmqp("fpzo", fmrd(int ), (int)1005)) break;
                    v43 /* !! */  = (long)gx.fmqp("fpzp", fmrd(int ), (int)1006);
                }
                v44 = (BiFunction<Integer, Integer, Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, sum(int int ), (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;)();
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_13 = gx.mq - gx.fmqp("fpzq", fmrp(int ), (int)344)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == gx.fmqp("fpzr", fmrd(int ), (int)1007)) break;
                    v45 /* !! */  = (long)gx.fmqp("fpzs", fmrd(int ), (int)1008);
                }
                var1_1.merge(v37, v42, v44);
                if (var4_4) ** GOTO lbl29
lbl269:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
                case 0: {
                    var5_3 /* !! */  = (int)gx.fmqp("fpzt", fmrd(int ), (int)1009);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl282
                }
                case 1: {
                    var5_3 /* !! */  = (int)gx.fmqp("fpzu", fmrd(int ), (int)1010);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl343
                }
lbl282:
                // 2 sources

                case 2: {
                    var5_3 /* !! */  = (int)gx.fmqp("fpzx", fmrd(int ), (int)1011);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl302
                }
lbl287:
                // 2 sources

                case 3: {
                    var5_3 /* !! */  = (int)gx.fmqp("fpzz", fmrd(int ), (int)1012);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl320
                }
lbl292:
                // 2 sources

                case 4: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqaa", fmrd(int ), (int)1013);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl330
                }
lbl297:
                // 2 sources

                case 5: {
                    do {
                        var5_3 /* !! */  = (int)gx.fmqp("fqab", fmrd(int ), (int)1014);
                    } while (!var6_2);
                    throw null;
                }
lbl302:
                // 3 sources

                case 6: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqac", fmrd(int ), (int)1015);
                    if (!var6_2) ** GOTO lbl292
                    throw null;
                }
lbl306:
                // 2 sources

                case 7: {
                    do {
                        var5_3 /* !! */  = (int)gx.fmqp("fqad", fmrd(int ), (int)1016);
                    } while (!var6_2);
                    throw null;
                }
                case 8: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqae", fmrd(int ), (int)1017);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl372
                }
                case 9: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqah", fmrd(int ), (int)1018);
                    if (!var6_2) ** GOTO lbl287
                    throw null;
                }
lbl320:
                // 3 sources

                case 10: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqai", fmrd(int ), (int)1019);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl339
                }
lbl325:
                // 2 sources

                case 11: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqaj", fmrd(int ), (int)1020);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl343
                }
lbl330:
                // 2 sources

                case 12: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqal", fmrd(int ), (int)1021);
                    if (!var6_2) ** GOTO lbl297
                    throw null;
                }
                case 13: {
                    do {
                        var5_3 /* !! */  = (int)gx.fmqp("fqan", fmrd(int ), (int)1022);
                    } while (!var6_2);
                    throw null;
                }
lbl339:
                // 3 sources

                case 14: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqap", fmrd(int ), (int)1023);
                    if (!var6_2) ** GOTO lbl325
                    throw null;
                }
lbl343:
                // 3 sources

                case 15: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqar", fmrd(int ), (int)1024);
                    if (var6_2) {
                        throw null;
                    }
                }
                case 16: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqat", fmrd(int ), (int)1025);
                    if (!var6_2) ** GOTO lbl339
                    throw null;
                }
                case 17: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqau", fmrd(int ), (int)1026);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl360
                }
lbl356:
                // 2 sources

                case 18: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqav", fmrd(int ), (int)1027);
                    if (!var6_2) ** GOTO lbl320
                    throw null;
                }
lbl360:
                // 2 sources

                case 19: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqaw", fmrd(int ), (int)1028);
                    if (!var6_2) ** GOTO lbl306
                    throw null;
                }
                case 20: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqax", fmrd(int ), (int)1029);
                    if (!var6_2) break block95;
                    throw null;
                }
lbl368:
                // 2 sources

                case 21: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqay", fmrd(int ), (int)1030);
                    if (!var6_2) ** GOTO lbl302
                    throw null;
                }
lbl372:
                // 2 sources

                case 22: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_3 /* !! */  = (int)gx.fmqp("fqba", fmrd(int ), (int)1031);
                        if (!var6_2) ** GOTO lbl368
                        throw null;
                    }
                }
                case 23: {
                    var5_3 /* !! */  = (int)gx.fmqp("fqbb", fmrd(int ), (int)1032);
                    if (!var6_2) ** GOTO lbl356
                    throw null;
                }
                case 24: 
            }
            break;
        }
        var5_3 /* !! */  = (int)gx.fmqp("fqbc", fmrd(int ), (int)1033);
        ** while (!var6_2)
lbl384:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frpe() {
        gx.fmqo[500] = 739791020;
        gx.fmqo[501] = 17576665;
        gx.fmqo[502] = 61975885;
        gx.fmqo[503] = -1167403331;
        gx.fmqo[504] = -1283814071;
        gx.fmqo[505] = 393555719;
        gx.fmqo[506] = -448913383;
        gx.fmqo[507] = -543546779;
        gx.fmqo[508] = -283145504;
        gx.fmqo[509] = -2145734678;
        gx.fmqo[510] = 163752061;
        gx.fmqo[511] = -1026098458;
        gx.fmqo[512] = -358670545;
        gx.fmqo[513] = -1501582829;
        gx.fmqo[514] = 1369801072;
        gx.fmqo[515] = 242583037;
        gx.fmqo[516] = -1259799642;
        gx.fmqo[517] = -1129333058;
        gx.fmqo[518] = -2062063084;
        gx.fmqo[519] = -1842397695;
        gx.fmqo[520] = 1663823104;
        gx.fmqo[521] = 342113536;
        gx.fmqo[522] = 1838637192;
        gx.fmqo[523] = -1581146009;
        gx.fmqo[524] = -277561755;
        gx.fmqo[525] = 143697659;
        gx.fmqo[526] = -609056743;
        gx.fmqo[527] = -666768960;
        gx.fmqo[528] = -1015978810;
        gx.fmqo[529] = 724827564;
        gx.fmqo[530] = -107399663;
        gx.fmqo[531] = 703126071;
        gx.fmqo[532] = 1506498989;
        gx.fmqo[533] = -2076553924;
        gx.fmqo[534] = -357881468;
        gx.fmqo[535] = 764447753;
        gx.fmqo[536] = -497540446;
        gx.fmqo[537] = -1678103914;
        gx.fmqo[538] = 506002248;
        gx.fmqo[539] = 2023013684;
        gx.fmqo[540] = -322934065;
        gx.fmqo[541] = 546567737;
        gx.fmqo[542] = -1036121532;
        gx.fmqo[543] = 1258389614;
        gx.fmqo[544] = 1682739942;
        gx.fmqo[545] = 1132591182;
        gx.fmqo[546] = 1309042669;
        gx.fmqo[547] = 675776856;
        gx.fmqo[548] = -384836798;
        gx.fmqo[549] = -1979340291;
        gx.fmqo[550] = -513242866;
        gx.fmqo[551] = 678201331;
        gx.fmqo[552] = -1164342196;
        gx.fmqo[553] = -653279237;
        gx.fmqo[554] = -388841785;
        gx.fmqo[555] = -232700078;
        gx.fmqo[556] = 2028323104;
        gx.fmqo[557] = -117061017;
        gx.fmqo[558] = -177685545;
        gx.fmqo[559] = 2123269009;
        gx.fmqo[560] = 1606269039;
        gx.fmqo[561] = -1331593770;
        gx.fmqo[562] = -2144490979;
        gx.fmqo[563] = 1329900293;
        gx.fmqo[564] = -648949850;
        gx.fmqo[565] = 1163065772;
        gx.fmqo[566] = -1938058149;
        gx.fmqo[567] = 1556741812;
        gx.fmqo[568] = 1154845775;
        gx.fmqo[569] = -1672437843;
        gx.fmqo[570] = 199305277;
        gx.fmqo[571] = 738575879;
        gx.fmqo[572] = 663246776;
        gx.fmqo[573] = 655642835;
        gx.fmqo[574] = -7662438;
        gx.fmqo[575] = -1853978178;
        gx.fmqo[576] = 672911569;
        gx.fmqo[577] = 296690529;
        gx.fmqo[578] = -1712420872;
        gx.fmqo[579] = 1313638947;
        gx.fmqo[580] = -938289062;
        gx.fmqo[581] = -27662793;
        gx.fmqo[582] = -893207747;
        gx.fmqo[583] = -1187379864;
        gx.fmqo[584] = 260994340;
        gx.fmqo[585] = 332733400;
        gx.fmqo[586] = 1079123768;
        gx.fmqo[587] = 1320657929;
        gx.fmqo[588] = 1495208085;
        gx.fmqo[589] = -1904346935;
        gx.fmqo[590] = -1029204546;
        gx.fmqo[591] = 2000355148;
        gx.fmqo[592] = 1618351385;
        gx.fmqo[593] = 1480062167;
        gx.fmqo[594] = 1156839711;
        gx.fmqo[595] = 1509191372;
        gx.fmqo[596] = 465672741;
        gx.fmqo[597] = 1632806097;
        gx.fmqo[598] = -224200730;
        gx.fmqo[599] = -827091415;
    }

    private static /* synthetic */ double fmxg(int n2) {
        return Double.longBitsToDouble(fmrq[n2] ^ fmrr[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldChange(dh var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fmvt", fmrp(int ), (int)19)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gx.fmqp("fmvu", fmrd(int ), (int)110)) break;
            v0 /* !! */  = (long)gx.fmqp("fmvv", fmrd(int ), (int)111);
        }
        var4_2 = gx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fmvw", fmrp(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gx.fmqp("fmvx", fmrd(int ), (int)112)) break;
            v1 /* !! */  = (long)gx.fmqp("fmvy", fmrd(int ), (int)113);
        }
        var3_3 /* !! */  = gx.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fmvz", fmrp(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == gx.fmqp("fmwa", fmrd(int ), (int)114)) break;
                    v2 /* !! */  = (long)gx.fmqp("fmwb", fmrd(int ), (int)115);
                }
                var2_4 = gx.a;
                if (var4_2) {
                    throw null;
lbl24:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl24
                v3 = gx.fmqp("fmwc", fmrd(int ), (int)116);
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fmwd", fmrp(int ), (int)22)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == gx.fmqp("fmwe", fmrd(int ), (int)117)) break;
                    v4 /* !! */  = (long)gx.fmqp("fmwf", fmrd(int ), (int)118);
                }
                this.reset((boolean)v3);
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)gx.fmqp("fmwg", fmrd(int ), (int)119);
                } while (!var4_2);
                throw null;
            }
lbl41:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)gx.fmqp("fmwh", fmrd(int ), (int)120);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gx.fmqp("fmwi", fmrd(int ), (int)121);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl57
                    break;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)gx.fmqp("fmwj", fmrd(int ), (int)122);
                } while (!var4_2);
                throw null;
            }
lbl57:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)gx.fmqp("fmwk", fmrd(int ), (int)123);
                if (!var4_2) ** GOTO lbl41
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)gx.fmqp("fmwl", fmrd(int ), (int)124);
        ** while (!var4_2)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasTotemInHands(class_1657 var1_1) {
        block57: {
            v0 /* !! */  = gx.mq;
            if (true) ** GOTO lbl5
            block36: while (true) {
                v0 /* !! */  = (long)(v1 - gx.fmqp("fpbh", fmrp(int ), (int)198));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -947699857: {
                        v1 = gx.fmqp("fpbi", fmrp(int ), (int)199);
                        continue block36;
                    }
                    case -45938139: {
                        v1 = gx.fmqp("fpbj", fmrp(int ), (int)200);
                        continue block36;
                    }
                    case 713076622: {
                        v1 = gx.fmqp("fpbk", fmrp(int ), (int)201);
                        continue block36;
                    }
                    case 1461008885: {
                        break block36;
                    }
                }
                break;
            }
            var4_2 = gx.c;
            v2 /* !! */  = gx.mq;
            if (true) ** GOTO lbl22
            block37: while (true) {
                v2 /* !! */  = (long)(v3 - gx.fmqp("fpbl", fmrp(int ), (int)202));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -435844405: {
                        v3 = gx.fmqp("fpbm", fmrp(int ), (int)203);
                        continue block37;
                    }
                    case 1461008885: {
                        break block37;
                    }
                    case 1957862745: {
                        v3 = gx.fmqp("fpbn", fmrp(int ), (int)204);
                        continue block37;
                    }
                }
                break;
            }
            var3_3 /* !! */  = gx.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fpbo", fmrp(int ), (int)205)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == gx.fmqp("fpbp", fmrd(int ), (int)863)) break;
                v4 /* !! */  = (long)gx.fmqp("fpbq", fmrd(int ), (int)864);
            }
            var2_4 = gx.a;
            if (var4_2) {
                throw null;
lbl40:
                // 5 sources

                return (boolean)gx.fmqp("fpbr", fmrd(int ), (int)865);
            }
            if (var2_4 || var2_4) ** GOTO lbl40
            v5 /* !! */  = gx.mq;
            if (true) ** GOTO lbl47
            block40: while (true) {
                v5 /* !! */  = (long)(v6 - gx.fmqp("fpbs", fmrp(int ), (int)206));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1880523962: {
                        v6 = gx.fmqp("fpbt", fmrp(int ), (int)207);
                        continue block40;
                    }
                    case -446879674: {
                        v6 = gx.fmqp("fpbu", fmrp(int ), (int)208);
                        continue block40;
                    }
                    case 1379350882: {
                        v6 = gx.fmqp("fpbv", fmrp(int ), (int)209);
                        continue block40;
                    }
                    case 1461008885: {
                        break block40;
                    }
                }
                break;
            }
            v7 = var1_1.method_6047();
            v8 /* !! */  = gx.mq;
            if (true) ** GOTO lbl64
            block41: while (true) {
                v8 /* !! */  = (long)(v9 - gx.fmqp("fpbw", fmrp(int ), (int)210));
lbl64:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -2064450476: {
                        v9 = gx.fmqp("fpbx", fmrp(int ), (int)211);
                        continue block41;
                    }
                    case 397074119: {
                        v9 = gx.fmqp("fpby", fmrp(int ), (int)212);
                        continue block41;
                    }
                    case 1086196921: {
                        v9 = gx.fmqp("fpbz", fmrp(int ), (int)213);
                        continue block41;
                    }
                    case 1461008885: {
                        break block41;
                    }
                }
                break;
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fpca", fmrp(int ), (int)214)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == gx.fmqp("fpcb", fmrd(int ), (int)866)) break;
                v10 /* !! */  = (long)gx.fmqp("fpcc", fmrd(int ), (int)867);
            }
            if (v7.method_31574(class_1802.field_8288)) break block57;
            if (var2_4) ** GOTO lbl40
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fpcd", fmrp(int ), (int)215)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == gx.fmqp("fpce", fmrd(int ), (int)868)) break;
                v11 /* !! */  = (long)gx.fmqp("fpcf", fmrd(int ), (int)869);
            }
            v12 = var1_1.method_6079();
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fpcg", fmrp(int ), (int)216)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == gx.fmqp("fpch", fmrd(int ), (int)870)) break;
                v13 /* !! */  = (long)gx.fmqp("fpci", fmrd(int ), (int)871);
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fpcj", fmrp(int ), (int)217)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == gx.fmqp("fpck", fmrd(int ), (int)872)) break;
                v14 /* !! */  = (long)gx.fmqp("fpcl", fmrd(int ), (int)873);
            }
            if (!v12.method_31574(class_1802.field_8288)) ** GOTO lbl110
            if (var2_4) ** GOTO lbl40
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl40
                v15 = gx.fmqp("fpcm", fmrd(int ), (int)874);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl110:
            // 1 sources

            if (!var2_4 && !var2_4) ** break;
            ** continue;
            v15 = gx.fmqp("fpcn", fmrd(int ), (int)875);
lbl113:
            // 2 sources

            return (boolean)v15;
lbl114:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)gx.fmqp("fpco", fmrd(int ), (int)876);
                if (!var4_2) break;
                throw null;
            }
lbl118:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)gx.fmqp("fpcp", fmrd(int ), (int)877);
                if (!var4_2) ** GOTO lbl114
                throw null;
            }
lbl122:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)gx.fmqp("fpcq", fmrd(int ), (int)878);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl127:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)gx.fmqp("fpcr", fmrd(int ), (int)879);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)gx.fmqp("fpcs", fmrd(int ), (int)880);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl137:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)gx.fmqp("fpct", fmrd(int ), (int)881);
                if (!var4_2) ** GOTO lbl118
                throw null;
            }
            case 6: {
                do {
                    var3_3 /* !! */  = (int)gx.fmqp("fpcu", fmrd(int ), (int)882);
                } while (!var4_2);
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gx.fmqp("fpcv", fmrd(int ), (int)883);
                    if (!var4_2) ** GOTO lbl122
                    throw null;
                }
            }
lbl151:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gx.fmqp("fpcw", fmrd(int ), (int)884);
                if (!var4_2) ** GOTO lbl118
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)gx.fmqp("fpcx", fmrd(int ), (int)885);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
            case 10: 
        }
        var3_3 /* !! */  = (int)gx.fmqp("fpcy", fmrd(int ), (int)886);
        ** while (!var4_2)
lbl162:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isValuable(class_1799 var1_1) {
        block36: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fowd", fmrp(int ), (int)189)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == gx.fmqp("fowe", fmrd(int ), (int)769)) break;
                v0 /* !! */  = (long)gx.fmqp("fowf", fmrd(int ), (int)770);
            }
            var4_2 = gx.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fowg", fmrp(int ), (int)190)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == gx.fmqp("fowh", fmrd(int ), (int)771)) break;
                v1 /* !! */  = (long)gx.fmqp("fowi", fmrd(int ), (int)772);
            }
            var3_3 /* !! */  = gx.b;
            v2 /* !! */  = gx.mq;
            if (true) ** GOTO lbl19
            block23: while (true) {
                v2 /* !! */  = (long)(v3 - gx.fmqp("fowp", fmrp(int ), (int)191));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2137151690: {
                        v3 = gx.fmqp("foww", fmrp(int ), (int)192);
                        continue block23;
                    }
                    case -880321188: {
                        v3 = gx.fmqp("fowy", fmrp(int ), (int)193);
                        continue block23;
                    }
                    case 726164359: {
                        v3 = gx.fmqp("fowz", fmrp(int ), (int)194);
                        continue block23;
                    }
                    case 1461008885: {
                        break block23;
                    }
                }
                break;
            }
            var2_4 = gx.a;
            if (var4_2) {
                throw null;
lbl34:
                // 4 sources

                return (boolean)gx.fmqp("foxf", fmrd(int ), (int)773);
            }
            if (var2_4 || var2_4) ** GOTO lbl34
            v4 /* !! */  = gx.mq;
            if (true) ** GOTO lbl41
            block25: while (true) {
                v4 /* !! */  = (long)(v5 - gx.fmqp("foxh", fmrp(int ), (int)195));
lbl41:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1990882966: {
                        v5 = gx.fmqp("foxi", fmrp(int ), (int)196);
                        continue block25;
                    }
                    case -1027077938: {
                        v5 = gx.fmqp("foxj", fmrp(int ), (int)197);
                        continue block25;
                    }
                    case 1461008885: {
                        break block25;
                    }
                }
                break;
            }
            if (this.itemValue(var1_1) <= 0) break block36;
            if (var2_4) ** GOTO lbl34
            v6 = gx.fmqp("foxk", fmrd(int ), (int)774);
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl64
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                v6 = gx.fmqp("foxl", fmrd(int ), (int)775);
lbl64:
                // 2 sources

                return (boolean)v6;
            }
            case 0: {
                var3_3 /* !! */  = (int)gx.fmqp("foxt", fmrd(int ), (int)776);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl70:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)gx.fmqp("foxu", fmrd(int ), (int)777);
                if (!var4_2) break;
                throw null;
            }
lbl74:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gx.fmqp("foxv", fmrd(int ), (int)778);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl84
                    break;
                }
            }
lbl80:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)gx.fmqp("foxw", fmrd(int ), (int)779);
                if (!var4_2) ** GOTO lbl74
                throw null;
            }
lbl84:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gx.fmqp("foxx", fmrd(int ), (int)780);
                if (!var4_2) ** GOTO lbl70
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)gx.fmqp("foxz", fmrd(int ), (int)781);
                if (!var4_2) break;
                throw null;
            }
lbl92:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)gx.fmqp("foyb", fmrd(int ), (int)782);
                if (!var4_2) ** GOTO lbl80
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)gx.fmqp("foye", fmrd(int ), (int)783);
        ** while (!var4_2)
lbl99:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frjt() {
        gx.fmqn[400] = 1939308602;
        gx.fmqn[401] = 210634624;
        gx.fmqn[402] = -812881399;
        gx.fmqn[403] = 73307207;
        gx.fmqn[404] = 332794885;
        gx.fmqn[405] = -2107551033;
        gx.fmqn[406] = -1827422862;
        gx.fmqn[407] = 675156093;
        gx.fmqn[408] = 1092460882;
        gx.fmqn[409] = 893777568;
        gx.fmqn[410] = -2115524098;
        gx.fmqn[411] = 1529512212;
        gx.fmqn[412] = 1002475044;
        gx.fmqn[413] = 1844561715;
        gx.fmqn[414] = 538259510;
        gx.fmqn[415] = -198115878;
        gx.fmqn[416] = -1839989889;
        gx.fmqn[417] = -869449166;
        gx.fmqn[418] = 771215584;
        gx.fmqn[419] = -14736147;
        gx.fmqn[420] = 1098854534;
        gx.fmqn[421] = 223455172;
        gx.fmqn[422] = -2125382975;
        gx.fmqn[423] = 1203814411;
        gx.fmqn[424] = 1160240674;
        gx.fmqn[425] = 1130046556;
        gx.fmqn[426] = 91918219;
        gx.fmqn[427] = -700271158;
        gx.fmqn[428] = 1586705939;
        gx.fmqn[429] = -874518444;
        gx.fmqn[430] = -1643774686;
        gx.fmqn[431] = -1952755714;
        gx.fmqn[432] = 2080527855;
        gx.fmqn[433] = -2088170870;
        gx.fmqn[434] = -607970193;
        gx.fmqn[435] = -1018755335;
        gx.fmqn[436] = 1233386302;
        gx.fmqn[437] = 140951074;
        gx.fmqn[438] = -1364950578;
        gx.fmqn[439] = -982368871;
        gx.fmqn[440] = 2129134593;
        gx.fmqn[441] = 397257180;
        gx.fmqn[442] = 1757066002;
        gx.fmqn[443] = -339465278;
        gx.fmqn[444] = -2075805143;
        gx.fmqn[445] = 83783518;
        gx.fmqn[446] = 1474758211;
        gx.fmqn[447] = -1015293875;
        gx.fmqn[448] = 1251597196;
        gx.fmqn[449] = 1460242058;
        gx.fmqn[450] = 2039177478;
        gx.fmqn[451] = -1824433558;
        gx.fmqn[452] = 818078366;
        gx.fmqn[453] = -2116103254;
        gx.fmqn[454] = 1218277777;
        gx.fmqn[455] = 1660349254;
        gx.fmqn[456] = 734540789;
        gx.fmqn[457] = -1379004888;
        gx.fmqn[458] = -453067022;
        gx.fmqn[459] = -367125214;
        gx.fmqn[460] = -851302754;
        gx.fmqn[461] = 163001843;
        gx.fmqn[462] = 1956412900;
        gx.fmqn[463] = -2002867372;
        gx.fmqn[464] = 1187794507;
        gx.fmqn[465] = -716446262;
        gx.fmqn[466] = 257320713;
        gx.fmqn[467] = -742254530;
        gx.fmqn[468] = 1984486605;
        gx.fmqn[469] = 561917145;
        gx.fmqn[470] = 1804050682;
        gx.fmqn[471] = 374257507;
        gx.fmqn[472] = -2021193910;
        gx.fmqn[473] = 1401759693;
        gx.fmqn[474] = 1300392809;
        gx.fmqn[475] = 1564172148;
        gx.fmqn[476] = -340613752;
        gx.fmqn[477] = -1926609098;
        gx.fmqn[478] = 1990060444;
        gx.fmqn[479] = 1202735972;
        gx.fmqn[480] = -1063131862;
        gx.fmqn[481] = -263532129;
        gx.fmqn[482] = -1219782524;
        gx.fmqn[483] = 2067527515;
        gx.fmqn[484] = 900724114;
        gx.fmqn[485] = 1750697823;
        gx.fmqn[486] = 1563861003;
        gx.fmqn[487] = 622258135;
        gx.fmqn[488] = 1491387322;
        gx.fmqn[489] = 206180866;
        gx.fmqn[490] = 123921448;
        gx.fmqn[491] = 555201189;
        gx.fmqn[492] = 220297907;
        gx.fmqn[493] = 786162576;
        gx.fmqn[494] = 191826564;
        gx.fmqn[495] = -1613880611;
        gx.fmqn[496] = -1382433222;
        gx.fmqn[497] = -1954758173;
        gx.fmqn[498] = -1837039265;
        gx.fmqn[499] = 2105261728;
    }

    private static /* synthetic */ void frkn() {
        gx.fmqn[500] = -1541005330;
        gx.fmqn[501] = 17576664;
        gx.fmqn[502] = -1072479126;
        gx.fmqn[503] = -1167403332;
        gx.fmqn[504] = -1317936426;
        gx.fmqn[505] = 393555718;
        gx.fmqn[506] = 1089887561;
        gx.fmqn[507] = -543546780;
        gx.fmqn[508] = -1814153553;
        gx.fmqn[509] = -2145734677;
        gx.fmqn[510] = -1788670816;
        gx.fmqn[511] = -1026098457;
        gx.fmqn[512] = -1734650364;
        gx.fmqn[513] = -1501582842;
        gx.fmqn[514] = 1369801078;
        gx.fmqn[515] = 242583020;
        gx.fmqn[516] = -1259799638;
        gx.fmqn[517] = -1129333077;
        gx.fmqn[518] = -2062063076;
        gx.fmqn[519] = -1842397687;
        gx.fmqn[520] = 1663823112;
        gx.fmqn[521] = 342113551;
        gx.fmqn[522] = 1838637196;
        gx.fmqn[523] = -1581145995;
        gx.fmqn[524] = -277561755;
        gx.fmqn[525] = 143697633;
        gx.fmqn[526] = -609056749;
        gx.fmqn[527] = -666768951;
        gx.fmqn[528] = -1015978813;
        gx.fmqn[529] = 724827582;
        gx.fmqn[530] = -107399676;
        gx.fmqn[531] = 703126061;
        gx.fmqn[532] = 1506498991;
        gx.fmqn[533] = -2076553921;
        gx.fmqn[534] = -357881467;
        gx.fmqn[535] = 764447753;
        gx.fmqn[536] = -497540427;
        gx.fmqn[537] = -1678103914;
        gx.fmqn[538] = 506002245;
        gx.fmqn[539] = 2023013665;
        gx.fmqn[540] = -1816160976;
        gx.fmqn[541] = 1611920953;
        gx.fmqn[542] = -1036121529;
        gx.fmqn[543] = 1258389629;
        gx.fmqn[544] = 1682739942;
        gx.fmqn[545] = 1132591169;
        gx.fmqn[546] = 1309042665;
        gx.fmqn[547] = 675776858;
        gx.fmqn[548] = -384836792;
        gx.fmqn[549] = -1979340306;
        gx.fmqn[550] = -513242862;
        gx.fmqn[551] = 678201343;
        gx.fmqn[552] = -1164342163;
        gx.fmqn[553] = -653279260;
        gx.fmqn[554] = -388841756;
        gx.fmqn[555] = -232700093;
        gx.fmqn[556] = 2028323111;
        gx.fmqn[557] = -117060997;
        gx.fmqn[558] = -177685549;
        gx.fmqn[559] = 2123269006;
        gx.fmqn[560] = 1606269045;
        gx.fmqn[561] = -1331593786;
        gx.fmqn[562] = -2144490995;
        gx.fmqn[563] = 1329900315;
        gx.fmqn[564] = -648949830;
        gx.fmqn[565] = 1163065789;
        gx.fmqn[566] = -1938058171;
        gx.fmqn[567] = 1556741815;
        gx.fmqn[568] = 1154845786;
        gx.fmqn[569] = -1672437832;
        gx.fmqn[570] = 199305268;
        gx.fmqn[571] = 738575907;
        gx.fmqn[572] = 663246746;
        gx.fmqn[573] = 655642835;
        gx.fmqn[574] = -7662451;
        gx.fmqn[575] = -1853978202;
        gx.fmqn[576] = 672911557;
        gx.fmqn[577] = 296690536;
        gx.fmqn[578] = -1712420870;
        gx.fmqn[579] = 1313638972;
        gx.fmqn[580] = -938289062;
        gx.fmqn[581] = -27662793;
        gx.fmqn[582] = -893207747;
        gx.fmqn[583] = -1187379864;
        gx.fmqn[584] = 260994341;
        gx.fmqn[585] = 332733400;
        gx.fmqn[586] = 1079123761;
        gx.fmqn[587] = 1320657929;
        gx.fmqn[588] = 1495208066;
        gx.fmqn[589] = -1904346915;
        gx.fmqn[590] = -1029204546;
        gx.fmqn[591] = 2000355182;
        gx.fmqn[592] = 1618351382;
        gx.fmqn[593] = 1480062154;
        gx.fmqn[594] = 1156839683;
        gx.fmqn[595] = 1509191360;
        gx.fmqn[596] = 465672705;
        gx.fmqn[597] = 1632806098;
        gx.fmqn[598] = -224200762;
        gx.fmqn[599] = -827091399;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private w exploit() {
        block53: {
            v0 /* !! */  = gx.mq;
            if (true) ** GOTO lbl5
            block26: while (true) {
                v0 /* !! */  = (long)(v1 - gx.fmqp("fqnv", fmrp(int ), (int)416));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1485290247: {
                        v1 = gx.fmqp("fqnw", fmrp(int ), (int)417);
                        continue block26;
                    }
                    case 487378675: {
                        v1 = gx.fmqp("fqnx", fmrp(int ), (int)418);
                        continue block26;
                    }
                    case 1242075244: {
                        v1 = gx.fmqp("fqny", fmrp(int ), (int)419);
                        continue block26;
                    }
                    case 1461008885: {
                        break block26;
                    }
                }
                break;
            }
            var6_1 = gx.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fqnz", fmrp(int ), (int)420)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == gx.fmqp("fqoa", fmrd(int ), (int)1176)) break;
                v2 /* !! */  = (long)gx.fmqp("fqob", fmrd(int ), (int)1177);
            }
            var5_2 /* !! */  = gx.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fqod", fmrp(int ), (int)421)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == gx.fmqp("fqoe", fmrd(int ), (int)1178)) break;
                v3 /* !! */  = (long)gx.fmqp("fqof", fmrd(int ), (int)1179);
            }
            var4_3 = gx.a;
            if (var6_1) {
                throw null;
lbl34:
                // 9 sources

                return null;
            }
            if (var4_3 || var4_3) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fqoj", fmrp(int ), (int)422)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == gx.fmqp("fqok", fmrd(int ), (int)1180)) break;
                v4 /* !! */  = (long)gx.fmqp("fqol", fmrd(int ), (int)1181);
            }
            var1_4 = g.getInstance();
            if (var4_3 || var4_3) ** GOTO lbl34
            if (var1_4 != null) break block53;
            if (var4_3 || var4_3) ** GOTO lbl34
            return null;
        }
        if (var4_3 || var4_3) ** GOTO lbl34
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fqon", fmrp(int ), (int)423)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == gx.fmqp("fqoo", fmrd(int ), (int)1182)) break;
            v5 /* !! */  = (long)gx.fmqp("fqoq", fmrd(int ), (int)1183);
        }
        var2_5 = var1_4.getCommand("exploit");
        if (var4_3 || var4_3) ** GOTO lbl34
        if (!(var2_5 instanceof w)) ** GOTO lbl70
        if (var4_3) ** GOTO lbl34
        var3_6 = (w)var2_5;
        if (var4_3) ** GOTO lbl34
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl34
                v6 = var3_6;
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl73
            }
lbl70:
            // 1 sources

            if (!var4_3 && !var4_3) ** break;
            ** continue;
            v6 = null;
lbl73:
            // 2 sources

            return v6;
            case 0: {
                do {
                    var5_2 /* !! */  = (int)gx.fmqp("fqos", fmrd(int ), (int)1184);
                } while (!var6_1);
                throw null;
            }
lbl79:
            // 3 sources

            case 1: {
                var5_2 /* !! */  = (int)gx.fmqp("fqot", fmrd(int ), (int)1185);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl84:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)gx.fmqp("fqou", fmrd(int ), (int)1186);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 3: {
                var5_2 /* !! */  = (int)gx.fmqp("fqov", fmrd(int ), (int)1187);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl94:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)gx.fmqp("fqox", fmrd(int ), (int)1188);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl99:
            // 3 sources

            case 5: {
                var5_2 /* !! */  = (int)gx.fmqp("fqoy", fmrd(int ), (int)1189);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl104:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)gx.fmqp("fqoz", fmrd(int ), (int)1190);
                if (!var6_1) ** GOTO lbl79
                throw null;
            }
lbl108:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)gx.fmqp("fqpb", fmrd(int ), (int)1191);
                if (!var6_1) break;
                throw null;
            }
            case 8: {
                var5_2 /* !! */  = (int)gx.fmqp("fqpd", fmrd(int ), (int)1192);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl117:
            // 4 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)gx.fmqp("fqpe", fmrd(int ), (int)1193);
                    if (!var6_1) ** GOTO lbl99
                    throw null;
                }
            }
lbl122:
            // 2 sources

            case 10: {
                var5_2 /* !! */  = (int)gx.fmqp("fqpf", fmrd(int ), (int)1194);
                if (!var6_1) ** GOTO lbl84
                throw null;
            }
            case 11: {
                var5_2 /* !! */  = (int)gx.fmqp("fqpg", fmrd(int ), (int)1195);
                if (!var6_1) ** GOTO lbl117
                throw null;
            }
            case 12: {
                var5_2 /* !! */  = (int)gx.fmqp("fqpi", fmrd(int ), (int)1196);
                if (!var6_1) ** GOTO lbl94
                throw null;
            }
lbl134:
            // 2 sources

            case 13: {
                var5_2 /* !! */  = (int)gx.fmqp("fqpj", fmrd(int ), (int)1197);
                if (var6_1) {
                    throw null;
                }
            }
            case 14: {
                var5_2 /* !! */  = (int)gx.fmqp("fqpk", fmrd(int ), (int)1198);
                if (!var6_1) ** GOTO lbl79
                throw null;
            }
            case 15: {
                var5_2 /* !! */  = (int)gx.fmqp("fqpl", fmrd(int ), (int)1199);
                if (!var6_1) ** GOTO lbl99
                throw null;
            }
            case 16: {
                do {
                    var5_2 /* !! */  = (int)gx.fmqp("fqpn", fmrd(int ), (int)1200);
                } while (!var6_1);
                throw null;
            }
            case 17: 
        }
        var5_2 /* !! */  = (int)gx.fmqp("fqpp", fmrd(int ), (int)1201);
        ** while (!var6_1)
lbl154:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void stopOwnedExploit() {
        block71: {
            block70: {
                v0 /* !! */  = gx.mq;
                if (true) ** GOTO lbl5
                block42: while (true) {
                    v0 /* !! */  = (long)(gx.fmqp("fqpw", fmrp(int ), (int)425) - gx.fmqp("fqpt", fmrp(int ), (int)424));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1571823023: {
                            continue block42;
                        }
                        case 1461008885: {
                            break block42;
                        }
                    }
                    break;
                }
                var4_1 = gx.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fqpx", fmrp(int ), (int)426)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == gx.fmqp("fqpy", fmrd(int ), (int)1202)) break;
                    v1 /* !! */  = (long)gx.fmqp("fqpz", fmrd(int ), (int)1203);
                }
                var3_2 /* !! */  = gx.b;
                v2 /* !! */  = gx.mq;
                if (true) ** GOTO lbl21
                block44: while (true) {
                    v2 /* !! */  = (long)(gx.fmqp("fqqb", fmrp(int ), (int)428) - gx.fmqp("fqqa", fmrp(int ), (int)427));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 465095143: {
                            continue block44;
                        }
                        case 1461008885: {
                            break block44;
                        }
                    }
                    break;
                }
                var2_3 = gx.a;
                if (var4_1) {
                    throw null;
lbl29:
                    // 9 sources

                    return;
                }
                if (var2_3 || var2_3) ** GOTO lbl29
                v3 /* !! */  = gx.mq;
                if (true) ** GOTO lbl36
                block46: while (true) {
                    v3 /* !! */  = (long)(v4 - gx.fmqp("fqqc", fmrp(int ), (int)429));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1143130854: {
                            v4 = gx.fmqp("fqqg", fmrp(int ), (int)430);
                            continue block46;
                        }
                        case 1451548829: {
                            v4 = gx.fmqp("fqqh", fmrp(int ), (int)431);
                            continue block46;
                        }
                        case 1461008885: {
                            break block46;
                        }
                        case 1626674876: {
                            v4 = gx.fmqp("fqqj", fmrp(int ), (int)432);
                            continue block46;
                        }
                    }
                    break;
                }
                if (this.ownsExploit) break block70;
                if (var2_3 || var2_3) ** GOTO lbl29
                return;
            }
            if (var2_3 || var2_3) ** GOTO lbl29
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fqql", fmrp(int ), (int)433)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == gx.fmqp("fqqn", fmrd(int ), (int)1204)) break;
                v5 /* !! */  = (long)gx.fmqp("fqqo", fmrd(int ), (int)1205);
            }
            var1_4 = this.exploit();
            if (var2_3 || var2_3) ** GOTO lbl29
            if (var1_4 == null) break block71;
            if (var2_3 || var2_3) ** GOTO lbl29
            v6 /* !! */  = gx.mq;
            if (true) ** GOTO lbl66
            block48: while (true) {
                v6 /* !! */  = (long)(v7 - gx.fmqp("fqqq", fmrp(int ), (int)434));
lbl66:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -219418804: {
                        v7 = gx.fmqp("fqqr", fmrp(int ), (int)435);
                        continue block48;
                    }
                    case 27437304: {
                        v7 = gx.fmqp("fqqt", fmrp(int ), (int)436);
                        continue block48;
                    }
                    case 28936687: {
                        v7 = gx.fmqp("fqqu", fmrp(int ), (int)437);
                        continue block48;
                    }
                    case 1461008885: {
                        break block48;
                    }
                }
                break;
            }
            var1_4.stopAutomated();
            if (var2_3) ** GOTO lbl29
        }
        if (var2_3 || var2_3) ** GOTO lbl29
        v8 = gx.fmqp("fqqw", fmrd(int ), (int)1206);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fqqy", fmrp(int ), (int)438)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == gx.fmqp("fqqz", fmrd(int ), (int)1207)) break;
            v9 /* !! */  = (long)gx.fmqp("fqrb", fmrd(int ), (int)1208);
        }
        this.ownsExploit = v8;
        if (var2_3 || var2_3) ** GOTO lbl29
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fqre", fmrp(int ), (int)439)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gx.fmqp("fqrf", fmrd(int ), (int)1209)) break;
            v10 /* !! */  = (long)gx.fmqp("fqrg", fmrd(int ), (int)1210);
        }
        this.routePosition = null;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl102:
            // 2 sources

            case 0: {
                do {
                    var3_2 /* !! */  = (int)gx.fmqp("fqri", fmrd(int ), (int)1211);
                } while (!var4_1);
                throw null;
            }
            case 1: {
                var3_2 /* !! */  = (int)gx.fmqp("fqrk", fmrd(int ), (int)1212);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl112:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)gx.fmqp("fqrm", fmrd(int ), (int)1213);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl126
                    break;
                }
            }
lbl118:
            // 4 sources

            case 3: {
                var3_2 /* !! */  = (int)gx.fmqp("fqrn", fmrd(int ), (int)1214);
                if (!var4_1) ** GOTO lbl112
                throw null;
            }
            case 4: {
                var3_2 /* !! */  = (int)gx.fmqp("fqrs", fmrd(int ), (int)1215);
                if (var4_1) {
                    throw null;
                }
            }
lbl126:
            // 5 sources

            case 5: {
                var3_2 /* !! */  = (int)gx.fmqp("fqrt", fmrd(int ), (int)1216);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl131:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)gx.fmqp("fqru", fmrd(int ), (int)1217);
                if (!var4_1) ** GOTO lbl126
                throw null;
            }
lbl135:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)gx.fmqp("fqrv", fmrd(int ), (int)1218);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)gx.fmqp("fqrw", fmrd(int ), (int)1219);
                if (!var4_1) ** GOTO lbl135
                throw null;
            }
lbl143:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)gx.fmqp("fqrx", fmrd(int ), (int)1220);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 10: {
                var3_2 /* !! */  = (int)gx.fmqp("fqry", fmrd(int ), (int)1221);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl153:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)gx.fmqp("fqsa", fmrd(int ), (int)1222);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl158:
            // 3 sources

            case 12: {
                do {
                    var3_2 /* !! */  = (int)gx.fmqp("fqsc", fmrd(int ), (int)1223);
                } while (!var4_1);
                throw null;
            }
lbl163:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)gx.fmqp("fqse", fmrd(int ), (int)1224);
                if (!var4_1) ** GOTO lbl102
                throw null;
            }
            case 14: {
                var3_2 /* !! */  = (int)gx.fmqp("fqsf", fmrd(int ), (int)1225);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)gx.fmqp("fqsg", fmrd(int ), (int)1226);
                if (!var4_1) ** GOTO lbl143
                throw null;
            }
lbl175:
            // 3 sources

            case 16: {
                var3_2 /* !! */  = (int)gx.fmqp("fqsh", fmrd(int ), (int)1227);
                if (!var4_1) ** GOTO lbl131
                throw null;
            }
            case 17: {
                var3_2 /* !! */  = (int)gx.fmqp("fqsp", fmrd(int ), (int)1228);
                if (!var4_1) ** GOTO lbl158
                throw null;
            }
            case 18: {
                var3_2 /* !! */  = (int)gx.fmqp("fqsq", fmrd(int ), (int)1229);
                if (!var4_1) ** GOTO lbl118
                throw null;
            }
            case 19: 
        }
        var3_2 /* !! */  = (int)gx.fmqp("fqsr", fmrd(int ), (int)1230);
        ** while (!var4_1)
lbl190:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frje() {
        gx.fmqn[300] = -1802581230;
        gx.fmqn[301] = -20924093;
        gx.fmqn[302] = 743112413;
        gx.fmqn[303] = 1518642635;
        gx.fmqn[304] = 74524267;
        gx.fmqn[305] = 1689471006;
        gx.fmqn[306] = 89683692;
        gx.fmqn[307] = 350864460;
        gx.fmqn[308] = 1861798688;
        gx.fmqn[309] = -116716178;
        gx.fmqn[310] = -1763047908;
        gx.fmqn[311] = 1135982168;
        gx.fmqn[312] = 645755923;
        gx.fmqn[313] = -1886973740;
        gx.fmqn[314] = -505290598;
        gx.fmqn[315] = -1435019212;
        gx.fmqn[316] = -2131494146;
        gx.fmqn[317] = 872261132;
        gx.fmqn[318] = -1019420901;
        gx.fmqn[319] = 632016378;
        gx.fmqn[320] = -1094043966;
        gx.fmqn[321] = 973803782;
        gx.fmqn[322] = -1202796205;
        gx.fmqn[323] = 1533018852;
        gx.fmqn[324] = 1543693590;
        gx.fmqn[325] = -1177305805;
        gx.fmqn[326] = 265484037;
        gx.fmqn[327] = 1686454301;
        gx.fmqn[328] = 1742488985;
        gx.fmqn[329] = 1157225720;
        gx.fmqn[330] = 215388343;
        gx.fmqn[331] = -759220817;
        gx.fmqn[332] = -1800521763;
        gx.fmqn[333] = -522688471;
        gx.fmqn[334] = -953051045;
        gx.fmqn[335] = 1111890996;
        gx.fmqn[336] = 1216155663;
        gx.fmqn[337] = 578539485;
        gx.fmqn[338] = -821584074;
        gx.fmqn[339] = 1978428920;
        gx.fmqn[340] = -1873695419;
        gx.fmqn[341] = -1748424740;
        gx.fmqn[342] = 301805761;
        gx.fmqn[343] = 1547799062;
        gx.fmqn[344] = -1237527565;
        gx.fmqn[345] = 1810275311;
        gx.fmqn[346] = 456790415;
        gx.fmqn[347] = 1135927390;
        gx.fmqn[348] = 349362714;
        gx.fmqn[349] = 340167252;
        gx.fmqn[350] = -68456541;
        gx.fmqn[351] = -1889374141;
        gx.fmqn[352] = -987961835;
        gx.fmqn[353] = 686823930;
        gx.fmqn[354] = 2099155951;
        gx.fmqn[355] = -499323620;
        gx.fmqn[356] = -2052201913;
        gx.fmqn[357] = 700050010;
        gx.fmqn[358] = 2120208817;
        gx.fmqn[359] = 1719713315;
        gx.fmqn[360] = -1061664191;
        gx.fmqn[361] = -302567047;
        gx.fmqn[362] = -331777004;
        gx.fmqn[363] = 1851411919;
        gx.fmqn[364] = 892352749;
        gx.fmqn[365] = 1665718836;
        gx.fmqn[366] = 1764156128;
        gx.fmqn[367] = 1784503842;
        gx.fmqn[368] = 1909937401;
        gx.fmqn[369] = -515278894;
        gx.fmqn[370] = 172727143;
        gx.fmqn[371] = 1913802809;
        gx.fmqn[372] = -1362720836;
        gx.fmqn[373] = -68934692;
        gx.fmqn[374] = 394238644;
        gx.fmqn[375] = -440820940;
        gx.fmqn[376] = 1826855716;
        gx.fmqn[377] = 43226949;
        gx.fmqn[378] = 138732213;
        gx.fmqn[379] = 95739856;
        gx.fmqn[380] = -923850790;
        gx.fmqn[381] = 1892161293;
        gx.fmqn[382] = 1967376474;
        gx.fmqn[383] = 1862816029;
        gx.fmqn[384] = 1941533684;
        gx.fmqn[385] = -2138569658;
        gx.fmqn[386] = 607590093;
        gx.fmqn[387] = 1680428416;
        gx.fmqn[388] = -1470665644;
        gx.fmqn[389] = 1315146730;
        gx.fmqn[390] = 0x13333EE;
        gx.fmqn[391] = 846099000;
        gx.fmqn[392] = -1511553161;
        gx.fmqn[393] = 7228712;
        gx.fmqn[394] = 1941267795;
        gx.fmqn[395] = 1464225816;
        gx.fmqn[396] = -131794052;
        gx.fmqn[397] = -7062091;
        gx.fmqn[398] = -1039232430;
        gx.fmqn[399] = -939070960;
    }

    private static /* synthetic */ void frik() {
        gx.fmqn[200] = 448630021;
        gx.fmqn[201] = -1027425744;
        gx.fmqn[202] = 392736975;
        gx.fmqn[203] = -2011024936;
        gx.fmqn[204] = 1747905627;
        gx.fmqn[205] = -862892371;
        gx.fmqn[206] = -115595925;
        gx.fmqn[207] = -1318808245;
        gx.fmqn[208] = -1055162702;
        gx.fmqn[209] = 826740587;
        gx.fmqn[210] = -1387642114;
        gx.fmqn[211] = -377924473;
        gx.fmqn[212] = 1288309523;
        gx.fmqn[213] = -1166883574;
        gx.fmqn[214] = 1751347360;
        gx.fmqn[215] = -1852931604;
        gx.fmqn[216] = -157733589;
        gx.fmqn[217] = -1931417192;
        gx.fmqn[218] = -209875205;
        gx.fmqn[219] = -2000909324;
        gx.fmqn[220] = 1054815863;
        gx.fmqn[221] = -40573082;
        gx.fmqn[222] = 143015230;
        gx.fmqn[223] = 373870754;
        gx.fmqn[224] = 263634751;
        gx.fmqn[225] = 4797093;
        gx.fmqn[226] = 557990823;
        gx.fmqn[227] = -2332665;
        gx.fmqn[228] = -793345683;
        gx.fmqn[229] = -1040121799;
        gx.fmqn[230] = 1896861487;
        gx.fmqn[231] = 1476920590;
        gx.fmqn[232] = 421718234;
        gx.fmqn[233] = 1876498203;
        gx.fmqn[234] = 749361818;
        gx.fmqn[235] = -1405669581;
        gx.fmqn[236] = -1617418837;
        gx.fmqn[237] = 1442125188;
        gx.fmqn[238] = -1542183925;
        gx.fmqn[239] = 246754659;
        gx.fmqn[240] = -1870734964;
        gx.fmqn[241] = -860726096;
        gx.fmqn[242] = -1744088957;
        gx.fmqn[243] = 693554918;
        gx.fmqn[244] = -1892147605;
        gx.fmqn[245] = -88890394;
        gx.fmqn[246] = -88089645;
        gx.fmqn[247] = 2037034777;
        gx.fmqn[248] = 257925804;
        gx.fmqn[249] = 2109635814;
        gx.fmqn[250] = 1879907316;
        gx.fmqn[251] = -1257744292;
        gx.fmqn[252] = 1961776712;
        gx.fmqn[253] = 1526974386;
        gx.fmqn[254] = -67923635;
        gx.fmqn[255] = 618335814;
        gx.fmqn[256] = -941587885;
        gx.fmqn[257] = 1121052615;
        gx.fmqn[258] = 740281701;
        gx.fmqn[259] = 1303362912;
        gx.fmqn[260] = -83645354;
        gx.fmqn[261] = -494451902;
        gx.fmqn[262] = -2100072495;
        gx.fmqn[263] = 1838200708;
        gx.fmqn[264] = -252514167;
        gx.fmqn[265] = -1108283188;
        gx.fmqn[266] = -1957592638;
        gx.fmqn[267] = -1246675209;
        gx.fmqn[268] = -1047613686;
        gx.fmqn[269] = 1336579434;
        gx.fmqn[270] = -1975537886;
        gx.fmqn[271] = 672531554;
        gx.fmqn[272] = -1616465330;
        gx.fmqn[273] = -338569950;
        gx.fmqn[274] = -1283316137;
        gx.fmqn[275] = 1694964469;
        gx.fmqn[276] = -530827733;
        gx.fmqn[277] = -1833900578;
        gx.fmqn[278] = -1154474071;
        gx.fmqn[279] = 69929936;
        gx.fmqn[280] = 1848865457;
        gx.fmqn[281] = -550956655;
        gx.fmqn[282] = 1151028970;
        gx.fmqn[283] = -957217898;
        gx.fmqn[284] = -1490908816;
        gx.fmqn[285] = -270579793;
        gx.fmqn[286] = 1900332963;
        gx.fmqn[287] = -1326233613;
        gx.fmqn[288] = -1318716343;
        gx.fmqn[289] = 1337591870;
        gx.fmqn[290] = -1237444739;
        gx.fmqn[291] = -28414574;
        gx.fmqn[292] = -2067719785;
        gx.fmqn[293] = -882818276;
        gx.fmqn[294] = 1092456503;
        gx.fmqn[295] = -616233833;
        gx.fmqn[296] = -1353518448;
        gx.fmqn[297] = -211420716;
        gx.fmqn[298] = -224847110;
        gx.fmqn[299] = 1918412557;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gx() {
        var2_1 /* !! */  = gx.b;
        super("TpLoot", "\u0423\u043c\u043d\u043e \u043a\u043b\u0438\u043f\u0430\u0435\u0442\u0441\u044f \u0447\u0435\u0440\u0435\u0437 .exploit \u043a \u0446\u0435\u043d\u043d\u043e\u043c\u0443 PvP-\u0434\u0440\u043e\u043f\u0443", du.PLAYER);
        this.playerRadius = new kg("\u0420\u0430\u0434\u0438\u0443\u0441 \u0438\u0433\u0440\u043e\u043a\u043e\u0432", "\u0413\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u044b\u0439 \u0440\u0430\u0434\u0438\u0443\u0441 \u043f\u043e\u0438\u0441\u043a\u0430 PvP \u043f\u043e\u0434 \u0438\u0433\u0440\u043e\u043a\u043e\u043c", (float)gx.fmqp("fmqq", fmqm(int ), (int)0)).range((float)gx.fmqp("fmqr", fmqm(int ), (int)1), (float)gx.fmqp("fmqs", fmqm(int ), (int)2)).step(1.0f);
        this.verticalRadius = new kg("\u0412\u044b\u0441\u043e\u0442\u0430 \u043f\u043e\u0438\u0441\u043a\u0430", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0432\u044b\u0441\u043e\u0442\u0430 \u0434\u043e PvP \u043f\u043e\u0434 \u0438\u0433\u0440\u043e\u043a\u043e\u043c", (float)gx.fmqp("fmqt", fmqm(int ), (int)3)).range((float)gx.fmqp("fmqu", fmqm(int ), (int)4), (float)gx.fmqp("fmqv", fmqm(int ), (int)5)).step(1.0f);
        this.fightDistance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f PvP", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043c\u0435\u0436\u0434\u0443 \u0434\u0435\u0440\u0443\u0449\u0438\u043c\u0438\u0441\u044f \u0438\u0433\u0440\u043e\u043a\u0430\u043c\u0438", (float)gx.fmqp("fmqw", fmqm(int ), (int)6)).range((float)gx.fmqp("fmqx", fmqm(int ), (int)7), (float)gx.fmqp("fmqy", fmqm(int ), (int)8)).step((float)gx.fmqp("fmqz", fmqm(int ), (int)9));
        this.escapeDistance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043e\u0442\u0445\u043e\u0434\u0430", "\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0441\u043b\u0443\u0447\u0430\u0439\u043d\u043e\u0433\u043e \u043e\u0442\u0445\u043e\u0434\u0430 \u0447\u0435\u0440\u0435\u0437 .exploit", (float)gx.fmqp("fmra", fmqm(int ), (int)10)).range((float)gx.fmqp("fmrb", fmqm(int ), (int)11), (float)gx.fmqp("fmrc", fmqm(int ), (int)12)).step(1.0f);
        this.healthSnapshots = new HashMap<UUID, gx$HealthSnapshot>();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.lootInventoryBaseline = new HashMap<class_1792, Integer>();
                this.state = gx$State.WATCHING;
                this.settings(new jx[]{this.playerRadius, this.verticalRadius, this.fightDistance, this.escapeDistance});
                return;
            }
lbl15:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)gx.fmqp("fmre", fmrd(int ), (int)13);
            }
            case 1: {
                var2_1 /* !! */  = (int)gx.fmqp("fmrf", fmrd(int ), (int)14);
                ** GOTO lbl15
            }
            case 2: {
                var2_1 /* !! */  = (int)gx.fmqp("fmrg", fmrd(int ), (int)15);
                ** GOTO lbl36
            }
lbl23:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)gx.fmqp("fmrh", fmrd(int ), (int)16);
                ** GOTO lbl28
            }
            case 4: {
                var2_1 /* !! */  = (int)gx.fmqp("fmri", fmrd(int ), (int)17);
            }
lbl28:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gx.fmqp("fmrj", fmrd(int ), (int)18);
                    break block0;
                    break;
                }
            }
            case 6: {
                while (true) {
                    var2_1 /* !! */  = (int)gx.fmqp("fmrk", fmrd(int ), (int)19);
                }
            }
lbl36:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)gx.fmqp("fmrl", fmrd(int ), (int)20);
                ** GOTO lbl23
            }
            case 8: {
                var2_1 /* !! */  = (int)gx.fmqp("fmrm", fmrd(int ), (int)21);
                break;
            }
            case 9: {
                var2_1 /* !! */  = (int)gx.fmqp("fmrn", fmrd(int ), (int)22);
                ** GOTO lbl23
            }
            case 10: 
        }
        var2_1 /* !! */  = (int)gx.fmqp("fmro", fmrd(int ), (int)23);
        ** while (true)
    }

    private static /* synthetic */ void frou() {
        gx.fmqo[0] = -1677989200;
        gx.fmqo[1] = -1073137571;
        gx.fmqo[2] = 352655215;
        gx.fmqo[3] = 1479420555;
        gx.fmqo[4] = 1854434490;
        gx.fmqo[5] = -842519292;
        gx.fmqo[6] = -1259522015;
        gx.fmqo[7] = 448084271;
        gx.fmqo[8] = -777557360;
        gx.fmqo[9] = -1055435429;
        gx.fmqo[10] = 1922101892;
        gx.fmqo[11] = -94216548;
        gx.fmqo[12] = 282194821;
        gx.fmqo[13] = 116550992;
        gx.fmqo[14] = 711345995;
        gx.fmqo[15] = -795579229;
        gx.fmqo[16] = -697905362;
        gx.fmqo[17] = 1749232261;
        gx.fmqo[18] = 1277583573;
        gx.fmqo[19] = -1946241812;
        gx.fmqo[20] = -1870031036;
        gx.fmqo[21] = 72489572;
        gx.fmqo[22] = -154003022;
        gx.fmqo[23] = -1457461461;
        gx.fmqo[24] = -1853445084;
        gx.fmqo[25] = 546654001;
        gx.fmqo[26] = -785655524;
        gx.fmqo[27] = 1901582712;
        gx.fmqo[28] = 601132205;
        gx.fmqo[29] = 1198773912;
        gx.fmqo[30] = -1566790974;
        gx.fmqo[31] = 1340895235;
        gx.fmqo[32] = 2138075862;
        gx.fmqo[33] = 865148142;
        gx.fmqo[34] = -827458675;
        gx.fmqo[35] = 530125928;
        gx.fmqo[36] = -111994082;
        gx.fmqo[37] = 1132375039;
        gx.fmqo[38] = -948505597;
        gx.fmqo[39] = 46499373;
        gx.fmqo[40] = -1057457638;
        gx.fmqo[41] = -535006155;
        gx.fmqo[42] = 892573715;
        gx.fmqo[43] = 975893726;
        gx.fmqo[44] = 1606899984;
        gx.fmqo[45] = 593357383;
        gx.fmqo[46] = 853610579;
        gx.fmqo[47] = 1314716822;
        gx.fmqo[48] = 892889011;
        gx.fmqo[49] = 1534514747;
        gx.fmqo[50] = 1006497929;
        gx.fmqo[51] = -341020593;
        gx.fmqo[52] = 851025643;
        gx.fmqo[53] = 1736121560;
        gx.fmqo[54] = 1863834991;
        gx.fmqo[55] = 741172729;
        gx.fmqo[56] = -1612171304;
        gx.fmqo[57] = -2018868136;
        gx.fmqo[58] = -1095236275;
        gx.fmqo[59] = 1341779012;
        gx.fmqo[60] = -171667691;
        gx.fmqo[61] = -882405284;
        gx.fmqo[62] = -368312604;
        gx.fmqo[63] = -2021013057;
        gx.fmqo[64] = 1512732736;
        gx.fmqo[65] = 875276575;
        gx.fmqo[66] = -167562610;
        gx.fmqo[67] = 383686946;
        gx.fmqo[68] = 813483450;
        gx.fmqo[69] = -1959132690;
        gx.fmqo[70] = -260623966;
        gx.fmqo[71] = -194717977;
        gx.fmqo[72] = -837089109;
        gx.fmqo[73] = 2113270487;
        gx.fmqo[74] = 1601675293;
        gx.fmqo[75] = -77614050;
        gx.fmqo[76] = 86297928;
        gx.fmqo[77] = -1579632224;
        gx.fmqo[78] = 892900478;
        gx.fmqo[79] = 280937089;
        gx.fmqo[80] = -964831400;
        gx.fmqo[81] = -2142382598;
        gx.fmqo[82] = -273903120;
        gx.fmqo[83] = -1080439354;
        gx.fmqo[84] = 960176883;
        gx.fmqo[85] = 729576694;
        gx.fmqo[86] = -1883144018;
        gx.fmqo[87] = -109021644;
        gx.fmqo[88] = -103240308;
        gx.fmqo[89] = 1115135928;
        gx.fmqo[90] = -775272286;
        gx.fmqo[91] = -1013948295;
        gx.fmqo[92] = -1424733390;
        gx.fmqo[93] = -860479127;
        gx.fmqo[94] = -317394352;
        gx.fmqo[95] = -1256321350;
        gx.fmqo[96] = 222956562;
        gx.fmqo[97] = 1028544626;
        gx.fmqo[98] = -1505267215;
        gx.fmqo[99] = -1528187158;
    }

    /*
     * Exception decompiling
     */
    @aw
    public void onTick(cy var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[CASE]], but top level block is 7[SWITCH]
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

    private static /* synthetic */ void fros() {
        gx.fmqn[1300] = -1570206493;
        gx.fmqn[1301] = -1838350121;
        gx.fmqn[1302] = -1141185478;
        gx.fmqn[1303] = 1700212860;
        gx.fmqn[1304] = 2101727259;
        gx.fmqn[1305] = -2033219773;
        gx.fmqn[1306] = -32747095;
        gx.fmqn[1307] = 1736201965;
        gx.fmqn[1308] = -857656133;
        gx.fmqn[1309] = 538256330;
        gx.fmqn[1310] = 962332037;
        gx.fmqn[1311] = 582846672;
        gx.fmqn[1312] = 1672281320;
        gx.fmqn[1313] = 944928739;
        gx.fmqn[1314] = 517365217;
        gx.fmqn[1315] = -1737448046;
        gx.fmqn[1316] = -1797807101;
        gx.fmqn[1317] = 67027329;
        gx.fmqn[1318] = -241953913;
        gx.fmqn[1319] = -2019001067;
        gx.fmqn[1320] = 935712343;
        gx.fmqn[1321] = 1755209177;
        gx.fmqn[1322] = 999845759;
        gx.fmqn[1323] = -594773444;
        gx.fmqn[1324] = 1956570373;
        gx.fmqn[1325] = 1427282611;
        gx.fmqn[1326] = -588957217;
        gx.fmqn[1327] = -1457157484;
        gx.fmqn[1328] = -2084685885;
        gx.fmqn[1329] = -506818577;
        gx.fmqn[1330] = 759899738;
        gx.fmqn[1331] = -96803331;
        gx.fmqn[1332] = 1978037285;
        gx.fmqn[1333] = -1750416386;
        gx.fmqn[1334] = 1720633585;
        gx.fmqn[1335] = 1722469994;
        gx.fmqn[1336] = -1694626038;
        gx.fmqn[1337] = -158613619;
        gx.fmqn[1338] = -378808922;
        gx.fmqn[1339] = 2070835936;
        gx.fmqn[1340] = 948550316;
        gx.fmqn[1341] = -1894030078;
        gx.fmqn[1342] = 1631819076;
        gx.fmqn[1343] = 1044415595;
        gx.fmqn[1344] = 1062311696;
        gx.fmqn[1345] = -1416381891;
        gx.fmqn[1346] = -1003844116;
        gx.fmqn[1347] = 972879034;
        gx.fmqn[1348] = 1648449873;
        gx.fmqn[1349] = -1274583854;
    }

    private static /* synthetic */ void frqu() {
        gx.fmqo[900] = 506748646;
        gx.fmqo[901] = 1580144409;
        gx.fmqo[902] = 1589628230;
        gx.fmqo[903] = 872302689;
        gx.fmqo[904] = 1878929035;
        gx.fmqo[905] = 727833181;
        gx.fmqo[906] = 1186106368;
        gx.fmqo[907] = -1153134844;
        gx.fmqo[908] = -1062183429;
        gx.fmqo[909] = -1457988432;
        gx.fmqo[910] = 644388460;
        gx.fmqo[911] = 99316222;
        gx.fmqo[912] = 1904759212;
        gx.fmqo[913] = -943166569;
        gx.fmqo[914] = 332579167;
        gx.fmqo[915] = -1560884369;
        gx.fmqo[916] = -1545408825;
        gx.fmqo[917] = 689231931;
        gx.fmqo[918] = 82930489;
        gx.fmqo[919] = -913703962;
        gx.fmqo[920] = 40188155;
        gx.fmqo[921] = -475800224;
        gx.fmqo[922] = -852651026;
        gx.fmqo[923] = 783029895;
        gx.fmqo[924] = -1731343869;
        gx.fmqo[925] = 838308458;
        gx.fmqo[926] = -1629836112;
        gx.fmqo[927] = 779029026;
        gx.fmqo[928] = -1267158416;
        gx.fmqo[929] = -422147206;
        gx.fmqo[930] = 1744617940;
        gx.fmqo[931] = -1671884177;
        gx.fmqo[932] = -676510200;
        gx.fmqo[933] = -1333097980;
        gx.fmqo[934] = -988631384;
        gx.fmqo[935] = 557096692;
        gx.fmqo[936] = -854680241;
        gx.fmqo[937] = 1021583267;
        gx.fmqo[938] = 1295237909;
        gx.fmqo[939] = -655962863;
        gx.fmqo[940] = -493487710;
        gx.fmqo[941] = 1249218697;
        gx.fmqo[942] = -1015889326;
        gx.fmqo[943] = 2083444079;
        gx.fmqo[944] = -667027319;
        gx.fmqo[945] = -2000290305;
        gx.fmqo[946] = 1723902566;
        gx.fmqo[947] = 619498571;
        gx.fmqo[948] = -788667438;
        gx.fmqo[949] = -447107151;
        gx.fmqo[950] = 474575874;
        gx.fmqo[951] = 1575748882;
        gx.fmqo[952] = 553828049;
        gx.fmqo[953] = 1946900533;
        gx.fmqo[954] = 1764231631;
        gx.fmqo[955] = -1235279858;
        gx.fmqo[956] = 1643934034;
        gx.fmqo[957] = -2011496617;
        gx.fmqo[958] = 1005749715;
        gx.fmqo[959] = -1148701839;
        gx.fmqo[960] = -442453193;
        gx.fmqo[961] = 583683045;
        gx.fmqo[962] = 680663281;
        gx.fmqo[963] = -576336660;
        gx.fmqo[964] = 148671094;
        gx.fmqo[965] = -1608662431;
        gx.fmqo[966] = 1300710121;
        gx.fmqo[967] = -2122393593;
        gx.fmqo[968] = 921392425;
        gx.fmqo[969] = -2056598251;
        gx.fmqo[970] = -1438766679;
        gx.fmqo[971] = -746955690;
        gx.fmqo[972] = -1891271243;
        gx.fmqo[973] = -419248278;
        gx.fmqo[974] = 1585439765;
        gx.fmqo[975] = 2025351914;
        gx.fmqo[976] = 830721326;
        gx.fmqo[977] = -1607275911;
        gx.fmqo[978] = -513331957;
        gx.fmqo[979] = 1304948490;
        gx.fmqo[980] = 1211826170;
        gx.fmqo[981] = 337401379;
        gx.fmqo[982] = 99188915;
        gx.fmqo[983] = -366918916;
        gx.fmqo[984] = -1001689774;
        gx.fmqo[985] = 580875991;
        gx.fmqo[986] = -1563651605;
        gx.fmqo[987] = -203073936;
        gx.fmqo[988] = 602373421;
        gx.fmqo[989] = -707766444;
        gx.fmqo[990] = -341226810;
        gx.fmqo[991] = -655915521;
        gx.fmqo[992] = -1554580268;
        gx.fmqo[993] = 1526201482;
        gx.fmqo[994] = 1585559553;
        gx.fmqo[995] = 1583804536;
        gx.fmqo[996] = -87290004;
        gx.fmqo[997] = -1168262685;
        gx.fmqo[998] = -317600304;
        gx.fmqo[999] = 223517176;
    }

    private static /* synthetic */ void frvx() {
        gx.fmrq[400] = 7115115183532475893L;
        gx.fmrq[401] = 832329154581066153L;
        gx.fmrq[402] = -1393309234613995161L;
        gx.fmrq[403] = 2318155448813259704L;
        gx.fmrq[404] = 7096775259806628014L;
        gx.fmrq[405] = 3474589229419389604L;
        gx.fmrq[406] = -9046597406172857818L;
        gx.fmrq[407] = -8207704930433473865L;
        gx.fmrq[408] = -7379667006561258859L;
        gx.fmrq[409] = -6426701315620490517L;
        gx.fmrq[410] = 347258339517145914L;
        gx.fmrq[411] = -318892106479002846L;
        gx.fmrq[412] = 6195799274681672881L;
        gx.fmrq[413] = 4302988455954105530L;
        gx.fmrq[414] = -4629174975144022114L;
        gx.fmrq[415] = -7996351541652091642L;
        gx.fmrq[416] = -858638588073886484L;
        gx.fmrq[417] = 1918768295009978996L;
        gx.fmrq[418] = 8012484902278935620L;
        gx.fmrq[419] = -5025284637843559890L;
        gx.fmrq[420] = 9123365565759642374L;
        gx.fmrq[421] = -1057306841838305252L;
        gx.fmrq[422] = -5880004720788881242L;
        gx.fmrq[423] = -1237991577445171590L;
        gx.fmrq[424] = 12751614701795523L;
        gx.fmrq[425] = -8434328329057762700L;
        gx.fmrq[426] = -7051146132090758621L;
        gx.fmrq[427] = -8599405093538530942L;
        gx.fmrq[428] = 8284869547964320474L;
        gx.fmrq[429] = 1974181147540010252L;
        gx.fmrq[430] = -8985401884884849951L;
        gx.fmrq[431] = -8499404577166958593L;
        gx.fmrq[432] = -3184516524554853917L;
        gx.fmrq[433] = 7841129260644052905L;
        gx.fmrq[434] = 7408655031694575233L;
        gx.fmrq[435] = -747750089847301452L;
        gx.fmrq[436] = -57405412855756275L;
        gx.fmrq[437] = 5212266203177971614L;
        gx.fmrq[438] = -2193900236213543455L;
        gx.fmrq[439] = 7061533840802289974L;
        gx.fmrq[440] = 2179171862876898977L;
        gx.fmrq[441] = 4053248132311015855L;
        gx.fmrq[442] = 7580384364857606718L;
        gx.fmrq[443] = -787463765688470645L;
        gx.fmrq[444] = -1960205427964905365L;
        gx.fmrq[445] = 7863451961267716833L;
        gx.fmrq[446] = 1363856858867818655L;
        gx.fmrq[447] = 6679613766304597074L;
        gx.fmrq[448] = -1531434246441319250L;
        gx.fmrq[449] = -1285548393636090195L;
        gx.fmrq[450] = 3959589776487135502L;
        gx.fmrq[451] = 1256911837018127558L;
        gx.fmrq[452] = -3203167841609295317L;
        gx.fmrq[453] = 7916523506494131381L;
        gx.fmrq[454] = 1529479491238200909L;
        gx.fmrq[455] = -4333203068618138179L;
        gx.fmrq[456] = 3867280458342988704L;
        gx.fmrq[457] = 6931384558946024755L;
        gx.fmrq[458] = -4338939073276193398L;
        gx.fmrq[459] = -6712415148846370738L;
        gx.fmrq[460] = 7540266566481985999L;
        gx.fmrq[461] = -6712710097075499233L;
        gx.fmrq[462] = 3875439528341931879L;
        gx.fmrq[463] = 4978492453282066636L;
        gx.fmrq[464] = -121853708109245439L;
        gx.fmrq[465] = 7610780378172285514L;
        gx.fmrq[466] = -8997475107599932858L;
        gx.fmrq[467] = 6088856551108380844L;
        gx.fmrq[468] = 8510810166803863730L;
        gx.fmrq[469] = -6394443632048443689L;
        gx.fmrq[470] = 840949931122536984L;
        gx.fmrq[471] = 7415242298451478357L;
        gx.fmrq[472] = -4204483401761172525L;
        gx.fmrq[473] = -4676496498401384654L;
        gx.fmrq[474] = 3801041462116473197L;
        gx.fmrq[475] = 4960508868455580927L;
        gx.fmrq[476] = 7188856176437571952L;
        gx.fmrq[477] = 2465215037282751185L;
        gx.fmrq[478] = -1972517314110943017L;
        gx.fmrq[479] = -6085164309397786419L;
        gx.fmrq[480] = 4401674771925291595L;
        gx.fmrq[481] = 160534906140256730L;
        gx.fmrq[482] = -6277223611574460161L;
        gx.fmrq[483] = 4617467633289157984L;
        gx.fmrq[484] = 4051342817604673255L;
        gx.fmrq[485] = 132853025975072287L;
        gx.fmrq[486] = 8147083281331805200L;
        gx.fmrq[487] = 2404933081108183468L;
        gx.fmrq[488] = -3218996714539805542L;
        gx.fmrq[489] = 8684909371309666044L;
        gx.fmrq[490] = -6543873856431410086L;
        gx.fmrq[491] = 7940331049513166718L;
        gx.fmrq[492] = -239570044970186213L;
        gx.fmrq[493] = 8222297137504887355L;
        gx.fmrq[494] = -1839646874437100010L;
        gx.fmrq[495] = 6407135644690406431L;
        gx.fmrq[496] = 6497875590728915850L;
        gx.fmrq[497] = -551350913032728747L;
        gx.fmrq[498] = 8904232528452827148L;
        gx.fmrq[499] = 1423940904605167108L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clearTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fquv", fmrp(int ), (int)462)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gx.fmqp("fquw", fmrd(int ), (int)1249)) break;
            v0 /* !! */  = (long)gx.fmqp("fquz", fmrd(int ), (int)1250);
        }
        var3_1 = gx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fqvb", fmrp(int ), (int)463)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gx.fmqp("fqvc", fmrd(int ), (int)1251)) break;
            v1 /* !! */  = (long)gx.fmqp("fqvd", fmrd(int ), (int)1252);
        }
        var2_2 /* !! */  = gx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fqve", fmrp(int ), (int)464)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gx.fmqp("fqvf", fmrd(int ), (int)1253)) break;
            v2 /* !! */  = (long)gx.fmqp("fqvg", fmrd(int ), (int)1254);
        }
        var1_3 = gx.a;
        if (var3_1) {
            throw null;
lbl21:
            // 11 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fqvj", fmrp(int ), (int)465)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gx.fmqp("fqvk", fmrd(int ), (int)1255)) break;
            v3 /* !! */  = (long)gx.fmqp("fqvl", fmrd(int ), (int)1256);
        }
        this.watchedPlayer = null;
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fqvn", fmrp(int ), (int)466)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gx.fmqp("fqvo", fmrd(int ), (int)1257)) break;
            v4 /* !! */  = (long)gx.fmqp("fqvp", fmrd(int ), (int)1258);
        }
        this.trackedLoot = null;
        if (var1_3 || var1_3) ** GOTO lbl21
        v5 /* !! */  = gx.mq;
        if (true) ** GOTO lbl42
        block60: while (true) {
            v5 /* !! */  = (long)(v6 - gx.fmqp("fqvr", fmrp(int ), (int)467));
lbl42:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 360944819: {
                    v6 = gx.fmqp("fqvs", fmrp(int ), (int)468);
                    continue block60;
                }
                case 1461008885: {
                    break block60;
                }
                case 2057264757: {
                    v6 = gx.fmqp("fqvt", fmrp(int ), (int)469);
                    continue block60;
                }
            }
            break;
        }
        this.watchedPosition = null;
        if (var1_3 || var1_3) ** GOTO lbl21
        v7 /* !! */  = gx.mq;
        if (true) ** GOTO lbl57
        block61: while (true) {
            v7 /* !! */  = (long)(v8 - gx.fmqp("fqvu", fmrp(int ), (int)470));
lbl57:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -287659481: {
                    v8 = gx.fmqp("fqvv", fmrp(int ), (int)471);
                    continue block61;
                }
                case 515254016: {
                    v8 = gx.fmqp("fqvw", fmrp(int ), (int)472);
                    continue block61;
                }
                case 894093420: {
                    v8 = gx.fmqp("fqvx", fmrp(int ), (int)473);
                    continue block61;
                }
                case 1461008885: {
                    break block61;
                }
            }
            break;
        }
        this.routePosition = null;
        if (var1_3 || var1_3) ** GOTO lbl21
        v9 = gx.fmqp("fqvy", fmrp(int ), (int)474);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fqwa", fmrp(int ), (int)475)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gx.fmqp("fqwc", fmrd(int ), (int)1259)) break;
            v10 /* !! */  = (long)gx.fmqp("fqwd", fmrd(int ), (int)1260);
        }
        this.targetLostAt = (long)v9;
        if (var1_3 || var1_3) ** GOTO lbl21
        v11 = gx.fmqp("fqwe", fmrp(int ), (int)476);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_6 = gx.mq - gx.fmqp("fqwf", fmrp(int ), (int)477)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gx.fmqp("fqwh", fmrd(int ), (int)1261)) break;
            v12 /* !! */  = (long)gx.fmqp("fqwi", fmrd(int ), (int)1262);
        }
        this.lastLootSeenAt = (long)v11;
        if (var1_3 || var1_3) ** GOTO lbl21
        v13 = gx.fmqp("fqwm", fmrd(int ), (int)1263);
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_7 = gx.mq - gx.fmqp("fqwn", fmrp(int ), (int)478)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == gx.fmqp("fqwo", fmrd(int ), (int)1264)) break;
            v14 /* !! */  = (long)gx.fmqp("fqwp", fmrd(int ), (int)1265);
        }
        this.lethalTicks = (int)v13;
        if (var1_3 || var1_3) ** GOTO lbl21
        v15 = gx.fmqp("fqwq", fmrp(int ), (int)479);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_8 = gx.mq - gx.fmqp("fqwr", fmrp(int ), (int)480)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == gx.fmqp("fqwv", fmrd(int ), (int)1266)) break;
            v16 /* !! */  = (long)gx.fmqp("fqwx", fmrd(int ), (int)1267);
        }
        this.spawnAt = (long)v15;
        if (var1_3 || var1_3) ** GOTO lbl21
        v17 /* !! */  = gx.mq;
        if (true) ** GOTO lbl107
        block66: while (true) {
            v17 /* !! */  = (long)(v18 - gx.fmqp("fqwz", fmrp(int ), (int)481));
lbl107:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1153794057: {
                    v18 = gx.fmqp("fqxa", fmrp(int ), (int)482);
                    continue block66;
                }
                case -722874669: {
                    v18 = gx.fmqp("fqxc", fmrp(int ), (int)483);
                    continue block66;
                }
                case 1461008885: {
                    break block66;
                }
            }
            break;
        }
        v19 /* !! */  = gx.mq;
        if (true) ** GOTO lbl120
        block67: while (true) {
            v19 /* !! */  = (long)(v20 - gx.fmqp("fqxd", fmrp(int ), (int)484));
lbl120:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -869902862: {
                    v20 = gx.fmqp("fqxf", fmrp(int ), (int)485);
                    continue block67;
                }
                case 182209810: {
                    v20 = gx.fmqp("fqxg", fmrp(int ), (int)486);
                    continue block67;
                }
                case 1461008885: {
                    break block67;
                }
                case 1813624372: {
                    v20 = gx.fmqp("fqxh", fmrp(int ), (int)487);
                    continue block67;
                }
            }
            break;
        }
        this.lootInventoryBaseline.clear();
        if (var1_3 || var1_3) ** GOTO lbl21
        v21 = gx.fmqp("fqxj", fmrd(int ), (int)1268);
        v22 /* !! */  = gx.mq;
        if (true) ** GOTO lbl139
        block68: while (true) {
            v22 /* !! */  = (long)(v23 - gx.fmqp("fqxk", fmrp(int ), (int)488));
lbl139:
            // 2 sources

            switch ((int)v22 /* !! */ ) {
                case -2119100843: {
                    v23 = gx.fmqp("fqxl", fmrp(int ), (int)489);
                    continue block68;
                }
                case -1296184559: {
                    v23 = gx.fmqp("fqxz", fmrp(int ), (int)490);
                    continue block68;
                }
                case 517104019: {
                    v23 = gx.fmqp("fqyb", fmrp(int ), (int)491);
                    continue block68;
                }
                case 1461008885: {
                    break block68;
                }
            }
            break;
        }
        this.lootInventoryTracking = v21;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl157:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyi", fmrd(int ), (int)1269);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl162:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyj", fmrd(int ), (int)1270);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl167:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyk", fmrd(int ), (int)1271);
                if (!var3_1) break;
                throw null;
            }
lbl171:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyl", fmrd(int ), (int)1272);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl176:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyn", fmrd(int ), (int)1273);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)gx.fmqp("fqyo", fmrd(int ), (int)1274);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyq", fmrd(int ), (int)1275);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl191:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyw", fmrd(int ), (int)1276);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyx", fmrd(int ), (int)1277);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
lbl199:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyy", fmrd(int ), (int)1278);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)gx.fmqp("fqyz", fmrd(int ), (int)1279);
                if (!var3_1) ** GOTO lbl176
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)gx.fmqp("fqza", fmrd(int ), (int)1280);
                if (!var3_1) ** GOTO lbl171
                throw null;
            }
lbl211:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzb", fmrd(int ), (int)1281);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 13: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzd", fmrd(int ), (int)1282);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl221:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzi", fmrd(int ), (int)1283);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
lbl226:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzk", fmrd(int ), (int)1284);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl231:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzm", fmrd(int ), (int)1285);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gx.fmqp("fqzn", fmrd(int ), (int)1286);
                    if (!var3_1) ** GOTO lbl231
                    throw null;
                }
            }
lbl240:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzo", fmrd(int ), (int)1287);
                if (!var3_1) ** GOTO lbl191
                throw null;
            }
lbl244:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzp", fmrd(int ), (int)1288);
                if (!var3_1) ** GOTO lbl211
                throw null;
            }
lbl248:
            // 3 sources

            case 20: {
                do {
                    var2_2 /* !! */  = (int)gx.fmqp("fqzq", fmrd(int ), (int)1289);
                } while (!var3_1);
                throw null;
            }
lbl253:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzv", fmrd(int ), (int)1290);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
lbl257:
            // 3 sources

            case 22: {
                var2_2 /* !! */  = (int)gx.fmqp("fqzw", fmrd(int ), (int)1291);
                if (!var3_1) ** GOTO lbl167
                throw null;
            }
            case 23: 
        }
        var2_2 /* !! */  = (int)gx.fmqp("fqzy", fmrd(int ), (int)1292);
        ** while (!var3_1)
lbl264:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frnm() {
        gx.fmqn[1000] = -1147250723;
        gx.fmqn[1001] = 592558155;
        gx.fmqn[1002] = 515083784;
        gx.fmqn[1003] = 77034882;
        gx.fmqn[1004] = -849084279;
        gx.fmqn[1005] = -802955101;
        gx.fmqn[1006] = -845761475;
        gx.fmqn[1007] = -41643230;
        gx.fmqn[1008] = -1237956498;
        gx.fmqn[1009] = -155210535;
        gx.fmqn[1010] = 1398395280;
        gx.fmqn[1011] = -1745655099;
        gx.fmqn[1012] = -1167815025;
        gx.fmqn[1013] = 1511370538;
        gx.fmqn[1014] = -1458309314;
        gx.fmqn[1015] = 1042636967;
        gx.fmqn[1016] = 234650606;
        gx.fmqn[1017] = 1521033718;
        gx.fmqn[1018] = -1926242358;
        gx.fmqn[1019] = -1092525884;
        gx.fmqn[1020] = -808575654;
        gx.fmqn[1021] = -758060924;
        gx.fmqn[1022] = 1524851476;
        gx.fmqn[1023] = -599527140;
        gx.fmqn[1024] = 1781044465;
        gx.fmqn[1025] = 1677349882;
        gx.fmqn[1026] = 1967513925;
        gx.fmqn[1027] = -1768558261;
        gx.fmqn[1028] = 25943371;
        gx.fmqn[1029] = -1547783709;
        gx.fmqn[1030] = -520265222;
        gx.fmqn[1031] = 625395862;
        gx.fmqn[1032] = -581464807;
        gx.fmqn[1033] = 264580381;
        gx.fmqn[1034] = -264731151;
        gx.fmqn[1035] = -1336796658;
        gx.fmqn[1036] = 1792803581;
        gx.fmqn[1037] = -1836214;
        gx.fmqn[1038] = 1605953206;
        gx.fmqn[1039] = -857285037;
        gx.fmqn[1040] = -1390785197;
        gx.fmqn[1041] = -1171513120;
        gx.fmqn[1042] = -1902952477;
        gx.fmqn[1043] = 574209899;
        gx.fmqn[1044] = -937829932;
        gx.fmqn[1045] = -355658622;
        gx.fmqn[1046] = 781179274;
        gx.fmqn[1047] = -55825138;
        gx.fmqn[1048] = -509230991;
        gx.fmqn[1049] = 933964713;
        gx.fmqn[1050] = -523095293;
        gx.fmqn[1051] = 415059135;
        gx.fmqn[1052] = 1578473156;
        gx.fmqn[1053] = -1145255259;
        gx.fmqn[1054] = 1252008111;
        gx.fmqn[1055] = -1874876860;
        gx.fmqn[1056] = -1533699375;
        gx.fmqn[1057] = 506994192;
        gx.fmqn[1058] = 2031167427;
        gx.fmqn[1059] = -1248325074;
        gx.fmqn[1060] = 1213205188;
        gx.fmqn[1061] = -2143118024;
        gx.fmqn[1062] = 1673566564;
        gx.fmqn[1063] = -232384394;
        gx.fmqn[1064] = -1195765649;
        gx.fmqn[1065] = -1996380495;
        gx.fmqn[1066] = 1353460508;
        gx.fmqn[1067] = -2069701293;
        gx.fmqn[1068] = -681102993;
        gx.fmqn[1069] = 1148256350;
        gx.fmqn[1070] = 2004336995;
        gx.fmqn[1071] = -1351131906;
        gx.fmqn[1072] = -96178457;
        gx.fmqn[1073] = -1164977601;
        gx.fmqn[1074] = -597129849;
        gx.fmqn[1075] = 1070777165;
        gx.fmqn[1076] = -924362254;
        gx.fmqn[1077] = 1719554346;
        gx.fmqn[1078] = 1249094244;
        gx.fmqn[1079] = -658922919;
        gx.fmqn[1080] = -1257240449;
        gx.fmqn[1081] = 246685915;
        gx.fmqn[1082] = -28652512;
        gx.fmqn[1083] = 1607153602;
        gx.fmqn[1084] = -428184985;
        gx.fmqn[1085] = -332683400;
        gx.fmqn[1086] = -870396539;
        gx.fmqn[1087] = -126470418;
        gx.fmqn[1088] = -404439282;
        gx.fmqn[1089] = 465144023;
        gx.fmqn[1090] = 1208898969;
        gx.fmqn[1091] = 0x111D31D;
        gx.fmqn[1092] = -1682878893;
        gx.fmqn[1093] = 1647131474;
        gx.fmqn[1094] = -1763126297;
        gx.fmqn[1095] = 1724653991;
        gx.fmqn[1096] = -1697516168;
        gx.fmqn[1097] = -791551729;
        gx.fmqn[1098] = -1959106165;
        gx.fmqn[1099] = -882979231;
    }

    private static /* synthetic */ void frns() {
        gx.fmqn[1100] = 1641186186;
        gx.fmqn[1101] = -1230707943;
        gx.fmqn[1102] = 1020080230;
        gx.fmqn[1103] = -1597044993;
        gx.fmqn[1104] = -1149278317;
        gx.fmqn[1105] = 1924505282;
        gx.fmqn[1106] = 1050858993;
        gx.fmqn[1107] = 1480834228;
        gx.fmqn[1108] = 826254094;
        gx.fmqn[1109] = 1972007455;
        gx.fmqn[1110] = -1502349424;
        gx.fmqn[1111] = -227601443;
        gx.fmqn[1112] = 1231607279;
        gx.fmqn[1113] = 381734449;
        gx.fmqn[1114] = 779714828;
        gx.fmqn[1115] = -379776180;
        gx.fmqn[1116] = -2090302160;
        gx.fmqn[1117] = 1572452037;
        gx.fmqn[1118] = 942852036;
        gx.fmqn[1119] = -469015468;
        gx.fmqn[1120] = -828218390;
        gx.fmqn[1121] = 660922537;
        gx.fmqn[1122] = 1796206119;
        gx.fmqn[1123] = 26191704;
        gx.fmqn[1124] = 1867008899;
        gx.fmqn[1125] = 1857272523;
        gx.fmqn[1126] = -1871482320;
        gx.fmqn[1127] = 696502347;
        gx.fmqn[1128] = 2114029786;
        gx.fmqn[1129] = -1851798034;
        gx.fmqn[1130] = 337205834;
        gx.fmqn[1131] = -374940303;
        gx.fmqn[1132] = 1774967178;
        gx.fmqn[1133] = 1128265728;
        gx.fmqn[1134] = 588711234;
        gx.fmqn[1135] = 1046615480;
        gx.fmqn[1136] = 1226087310;
        gx.fmqn[1137] = -1173052364;
        gx.fmqn[1138] = -1012742156;
        gx.fmqn[1139] = 1411618470;
        gx.fmqn[1140] = -733946727;
        gx.fmqn[1141] = -1857826966;
        gx.fmqn[1142] = -294671418;
        gx.fmqn[1143] = 1230760186;
        gx.fmqn[1144] = -1410234958;
        gx.fmqn[1145] = 793291169;
        gx.fmqn[1146] = 150105457;
        gx.fmqn[1147] = -613940805;
        gx.fmqn[1148] = 1404015073;
        gx.fmqn[1149] = -1587470289;
        gx.fmqn[1150] = 326056065;
        gx.fmqn[1151] = 248708787;
        gx.fmqn[1152] = -313093394;
        gx.fmqn[1153] = 1412856515;
        gx.fmqn[1154] = 123568141;
        gx.fmqn[1155] = -532757646;
        gx.fmqn[1156] = 571145742;
        gx.fmqn[1157] = 104650701;
        gx.fmqn[1158] = 567118911;
        gx.fmqn[1159] = -800094493;
        gx.fmqn[1160] = -32600099;
        gx.fmqn[1161] = -1453890775;
        gx.fmqn[1162] = -26245044;
        gx.fmqn[1163] = 1689962456;
        gx.fmqn[1164] = 1185847531;
        gx.fmqn[1165] = 587670171;
        gx.fmqn[1166] = 2060921139;
        gx.fmqn[1167] = 921474231;
        gx.fmqn[1168] = 1728003655;
        gx.fmqn[1169] = 914515529;
        gx.fmqn[1170] = 1296379539;
        gx.fmqn[1171] = 1099766455;
        gx.fmqn[1172] = -786919769;
        gx.fmqn[1173] = -1282280718;
        gx.fmqn[1174] = -821016971;
        gx.fmqn[1175] = -1805930611;
        gx.fmqn[1176] = 2103616800;
        gx.fmqn[1177] = 339749972;
        gx.fmqn[1178] = -1929330938;
        gx.fmqn[1179] = 477788686;
        gx.fmqn[1180] = -198376537;
        gx.fmqn[1181] = 1067669081;
        gx.fmqn[1182] = -33599647;
        gx.fmqn[1183] = -1720427230;
        gx.fmqn[1184] = 56821684;
        gx.fmqn[1185] = 1997884971;
        gx.fmqn[1186] = 660469026;
        gx.fmqn[1187] = -1270571766;
        gx.fmqn[1188] = -840645808;
        gx.fmqn[1189] = 102684763;
        gx.fmqn[1190] = 733885166;
        gx.fmqn[1191] = 463855892;
        gx.fmqn[1192] = 986130821;
        gx.fmqn[1193] = -483086394;
        gx.fmqn[1194] = -1411847552;
        gx.fmqn[1195] = -878414596;
        gx.fmqn[1196] = 455772913;
        gx.fmqn[1197] = 1306050466;
        gx.fmqn[1198] = 770417317;
        gx.fmqn[1199] = -610066768;
    }

    private static /* synthetic */ int fmrd(int n2) {
        return fmqn[n2] ^ fmqo[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startExploit(class_243 var1_1, long var2_2) {
        v0 /* !! */  = gx.mq;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(v1 - gx.fmqp("fqft", fmrp(int ), (int)379));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1792940209: {
                    v1 = gx.fmqp("fqfu", fmrp(int ), (int)380);
                    continue block33;
                }
                case 1001200194: {
                    v1 = gx.fmqp("fqfx", fmrp(int ), (int)381);
                    continue block33;
                }
                case 1461008885: {
                    break block33;
                }
            }
            break;
        }
        var7_3 = gx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fqfz", fmrp(int ), (int)382)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gx.fmqp("fqga", fmrd(int ), (int)1078)) break;
            v2 /* !! */  = (long)gx.fmqp("fqgb", fmrd(int ), (int)1079);
        }
        var6_4 /* !! */  = gx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fqgc", fmrp(int ), (int)383)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gx.fmqp("fqgd", fmrd(int ), (int)1080)) break;
            v3 /* !! */  = (long)gx.fmqp("fqgf", fmrd(int ), (int)1081);
        }
        var5_5 = gx.a;
        if (var7_3) {
            throw null;
lbl29:
            // 11 sources

            return;
        }
        if (var5_5 || var5_5) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fqgl", fmrp(int ), (int)384)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gx.fmqp("fqgm", fmrd(int ), (int)1082)) break;
            v4 /* !! */  = (long)gx.fmqp("fqgn", fmrd(int ), (int)1083);
        }
        var4_6 = this.exploit();
        if (var5_5) ** GOTO lbl29
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5) ** GOTO lbl29
                if (var4_6 == null) ** GOTO lbl47
                if (var5_5) ** GOTO lbl29
                if (var1_1 != null) ** GOTO lbl49
                if (var5_5) ** GOTO lbl29
lbl47:
                // 2 sources

                if (var5_5 || var5_5) ** GOTO lbl29
                return;
lbl49:
                // 1 sources

                if (var5_5 || var5_5) ** GOTO lbl29
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fqgp", fmrp(int ), (int)385)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == gx.fmqp("fqgq", fmrd(int ), (int)1084)) break;
                    v5 /* !! */  = (long)gx.fmqp("fqgr", fmrd(int ), (int)1085);
                }
                var4_6.startAutomated(var1_1);
                if (var5_5 || var5_5) ** GOTO lbl29
                v6 /* !! */  = gx.mq;
                if (true) ** GOTO lbl61
                block39: while (true) {
                    v6 /* !! */  = (long)(v7 - gx.fmqp("fqgt", fmrp(int ), (int)386));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 981529044: {
                            v7 = gx.fmqp("fqgu", fmrp(int ), (int)387);
                            continue block39;
                        }
                        case 1461008885: {
                            break block39;
                        }
                        case 1489430590: {
                            v7 = gx.fmqp("fqgv", fmrp(int ), (int)388);
                            continue block39;
                        }
                    }
                    break;
                }
                this.routePosition = var1_1;
                if (var5_5 || var5_5) ** GOTO lbl29
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fqgw", fmrp(int ), (int)389)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gx.fmqp("fqgx", fmrd(int ), (int)1086)) break;
                    v8 /* !! */  = (long)gx.fmqp("fqgy", fmrd(int ), (int)1087);
                }
                this.lastRetargetAt = var2_2;
                if (var5_5 || var5_5) ** GOTO lbl29
                v9 = gx.fmqp("fqgz", fmrd(int ), (int)1088);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fqha", fmrp(int ), (int)390)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == gx.fmqp("fqhd", fmrd(int ), (int)1089)) break;
                    v10 /* !! */  = (long)gx.fmqp("fqhe", fmrd(int ), (int)1090);
                }
                this.ownsExploit = v9;
                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return;
            }
lbl89:
            // 3 sources

            case 0: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhf", fmrd(int ), (int)1091);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 1: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhh", fmrd(int ), (int)1092);
                if (!var7_3) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)gx.fmqp("fqhi", fmrd(int ), (int)1093);
                    if (var7_3) {
                        throw null;
                    }
                    ** GOTO lbl163
                    break;
                }
            }
lbl104:
            // 3 sources

            case 3: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhj", fmrd(int ), (int)1094);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl109:
            // 2 sources

            case 4: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhk", fmrd(int ), (int)1095);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 5: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhn", fmrd(int ), (int)1096);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 6: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhp", fmrd(int ), (int)1097);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl124:
            // 3 sources

            case 7: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhq", fmrd(int ), (int)1098);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl145
            }
lbl129:
            // 4 sources

            case 8: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhr", fmrd(int ), (int)1099);
                if (!var7_3) ** GOTO lbl104
                throw null;
            }
            case 9: {
                var6_4 /* !! */  = (int)gx.fmqp("fqht", fmrd(int ), (int)1100);
                if (!var7_3) ** GOTO lbl129
                throw null;
            }
            case 10: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhu", fmrd(int ), (int)1101);
                if (!var7_3) ** GOTO lbl129
                throw null;
            }
            case 11: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhv", fmrd(int ), (int)1102);
                if (!var7_3) ** GOTO lbl124
                throw null;
            }
lbl145:
            // 3 sources

            case 12: {
                do {
                    var6_4 /* !! */  = (int)gx.fmqp("fqhw", fmrd(int ), (int)1103);
                } while (!var7_3);
                throw null;
            }
            case 13: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhx", fmrd(int ), (int)1104);
                if (!var7_3) ** GOTO lbl129
                throw null;
            }
            case 14: {
                var6_4 /* !! */  = (int)gx.fmqp("fqhz", fmrd(int ), (int)1105);
                if (!var7_3) ** GOTO lbl109
                throw null;
            }
lbl158:
            // 2 sources

            case 15: {
                var6_4 /* !! */  = (int)gx.fmqp("fqia", fmrd(int ), (int)1106);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl163:
            // 2 sources

            case 16: {
                var6_4 /* !! */  = (int)gx.fmqp("fqib", fmrd(int ), (int)1107);
                if (!var7_3) ** GOTO lbl89
                throw null;
            }
            case 17: {
                var6_4 /* !! */  = (int)gx.fmqp("fqid", fmrd(int ), (int)1108);
                if (!var7_3) ** GOTO lbl89
                throw null;
            }
lbl171:
            // 4 sources

            case 18: {
                var6_4 /* !! */  = (int)gx.fmqp("fqie", fmrd(int ), (int)1109);
                if (!var7_3) ** GOTO lbl104
                throw null;
            }
            case 19: {
                do {
                    var6_4 /* !! */  = (int)gx.fmqp("fqih", fmrd(int ), (int)1110);
                } while (!var7_3);
                throw null;
            }
            case 20: 
        }
        var6_4 /* !! */  = (int)gx.fmqp("fqii", fmrd(int ), (int)1111);
        ** while (!var7_3)
lbl183:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frwy() {
        gx.fmrr[0] = 6755130946747288950L;
        gx.fmrr[1] = -172852689520943470L;
        gx.fmrr[2] = -524663313943043083L;
        gx.fmrr[3] = -4534230460682022266L;
        gx.fmrr[4] = -3031298185570496609L;
        gx.fmrr[5] = -8772664097899503980L;
        gx.fmrr[6] = -5057603260554649908L;
        gx.fmrr[7] = 1195848707839497638L;
        gx.fmrr[8] = -6528957334892813118L;
        gx.fmrr[9] = -2499475319236427652L;
        gx.fmrr[10] = -8512345044257946307L;
        gx.fmrr[11] = 6555793934058163988L;
        gx.fmrr[12] = -8694381958319652055L;
        gx.fmrr[13] = -7499175600941060422L;
        gx.fmrr[14] = -5915023280838036850L;
        gx.fmrr[15] = 7881870121335019504L;
        gx.fmrr[16] = -1606031015344323112L;
        gx.fmrr[17] = 6532900993799636200L;
        gx.fmrr[18] = -1527376809270747166L;
        gx.fmrr[19] = -2572144952074598524L;
        gx.fmrr[20] = -2399143087663644038L;
        gx.fmrr[21] = -5190364687701085406L;
        gx.fmrr[22] = -4181001664766133873L;
        gx.fmrr[23] = -8011446830618210997L;
        gx.fmrr[24] = -8427530590902153340L;
        gx.fmrr[25] = -8944300649406357821L;
        gx.fmrr[26] = -9105390069698661679L;
        gx.fmrr[27] = 3901129881506466930L;
        gx.fmrr[28] = -5689078352255606872L;
        gx.fmrr[29] = 5310594825031212333L;
        gx.fmrr[30] = 1099588666825241866L;
        gx.fmrr[31] = -4029352004601387478L;
        gx.fmrr[32] = -5049802137834466747L;
        gx.fmrr[33] = -3990480747748235861L;
        gx.fmrr[34] = -8015163620052809539L;
        gx.fmrr[35] = -3210163681142081404L;
        gx.fmrr[36] = 9029372092777384660L;
        gx.fmrr[37] = -8030063660014375958L;
        gx.fmrr[38] = -8801825471228049594L;
        gx.fmrr[39] = -6067644679592423948L;
        gx.fmrr[40] = -1991046020631156192L;
        gx.fmrr[41] = -1348785181892177883L;
        gx.fmrr[42] = -8997364216596199273L;
        gx.fmrr[43] = 3401911860901615051L;
        gx.fmrr[44] = -3753082259330568145L;
        gx.fmrr[45] = 1152879578479851187L;
        gx.fmrr[46] = -4635240455435914039L;
        gx.fmrr[47] = 5101178258980285138L;
        gx.fmrr[48] = -5214888667050716099L;
        gx.fmrr[49] = -5565597261890027876L;
        gx.fmrr[50] = -5257017048856496259L;
        gx.fmrr[51] = 1132732099405738698L;
        gx.fmrr[52] = 8063524160249255005L;
        gx.fmrr[53] = -1502142466024852667L;
        gx.fmrr[54] = 465774586513412322L;
        gx.fmrr[55] = 1335984405420875513L;
        gx.fmrr[56] = -7439550928239752458L;
        gx.fmrr[57] = 3985799154602901209L;
        gx.fmrr[58] = -5817189081702603980L;
        gx.fmrr[59] = -3099181041295276655L;
        gx.fmrr[60] = 6472073519746826631L;
        gx.fmrr[61] = 3623770047207405547L;
        gx.fmrr[62] = 3078000707755700496L;
        gx.fmrr[63] = -5545712570819182007L;
        gx.fmrr[64] = 6640946976329602007L;
        gx.fmrr[65] = -1369147565574978659L;
        gx.fmrr[66] = -5125803112292423115L;
        gx.fmrr[67] = 4411238382372006164L;
        gx.fmrr[68] = 8435634076175954156L;
        gx.fmrr[69] = 5423048987195638188L;
        gx.fmrr[70] = 818559809147541779L;
        gx.fmrr[71] = -2537648933842636466L;
        gx.fmrr[72] = 7453273657617273513L;
        gx.fmrr[73] = 5199471428065495773L;
        gx.fmrr[74] = -9211640665678646327L;
        gx.fmrr[75] = -119478891594744691L;
        gx.fmrr[76] = -5959725871797554333L;
        gx.fmrr[77] = 7927890194467613621L;
        gx.fmrr[78] = -668613009043875026L;
        gx.fmrr[79] = -8999409802841654808L;
        gx.fmrr[80] = -8273794064203733795L;
        gx.fmrr[81] = 6310340427447469893L;
        gx.fmrr[82] = -6724657006144784752L;
        gx.fmrr[83] = 6603299934860472973L;
        gx.fmrr[84] = -3719569553594053073L;
        gx.fmrr[85] = 1102331555554757056L;
        gx.fmrr[86] = -6199900225197562850L;
        gx.fmrr[87] = 4617790931134054277L;
        gx.fmrr[88] = 975345547979128556L;
        gx.fmrr[89] = 5581233041702693325L;
        gx.fmrr[90] = 1118706465783167299L;
        gx.fmrr[91] = -4583079470769324501L;
        gx.fmrr[92] = 8571722715326285466L;
        gx.fmrr[93] = -9105171405832202681L;
        gx.fmrr[94] = -3231041201725600575L;
        gx.fmrr[95] = 558499831361539712L;
        gx.fmrr[96] = -2586434117659460815L;
        gx.fmrr[97] = -951606048969361287L;
        gx.fmrr[98] = 2366952287541650354L;
        gx.fmrr[99] = 8557905720057558860L;
    }

    private static /* synthetic */ void frsg() {
        gx.fmqo[1200] = 1881098131;
        gx.fmqo[1201] = 1916637550;
        gx.fmqo[1202] = 524442973;
        gx.fmqo[1203] = -592324447;
        gx.fmqo[1204] = 262793933;
        gx.fmqo[1205] = 101568006;
        gx.fmqo[1206] = -300651997;
        gx.fmqo[1207] = 1094133463;
        gx.fmqo[1208] = 1261555291;
        gx.fmqo[1209] = 1877854492;
        gx.fmqo[1210] = -1939010340;
        gx.fmqo[1211] = 489209953;
        gx.fmqo[1212] = 98458029;
        gx.fmqo[1213] = -2036139432;
        gx.fmqo[1214] = 607241385;
        gx.fmqo[1215] = -1381650180;
        gx.fmqo[1216] = 750245717;
        gx.fmqo[1217] = 458500135;
        gx.fmqo[1218] = -245296747;
        gx.fmqo[1219] = 1471803749;
        gx.fmqo[1220] = -228899316;
        gx.fmqo[1221] = 299294094;
        gx.fmqo[1222] = -992729919;
        gx.fmqo[1223] = 425802107;
        gx.fmqo[1224] = -114648135;
        gx.fmqo[1225] = 1729865808;
        gx.fmqo[1226] = 1213292899;
        gx.fmqo[1227] = 1656669497;
        gx.fmqo[1228] = 626926352;
        gx.fmqo[1229] = -97943680;
        gx.fmqo[1230] = 1479541192;
        gx.fmqo[1231] = 114499700;
        gx.fmqo[1232] = 925768113;
        gx.fmqo[1233] = -1530339951;
        gx.fmqo[1234] = 314034525;
        gx.fmqo[1235] = -938668636;
        gx.fmqo[1236] = -186452103;
        gx.fmqo[1237] = 1922559989;
        gx.fmqo[1238] = 1562852409;
        gx.fmqo[1239] = 1173793237;
        gx.fmqo[1240] = 1299741968;
        gx.fmqo[1241] = 7822303;
        gx.fmqo[1242] = 472706957;
        gx.fmqo[1243] = 959013722;
        gx.fmqo[1244] = 1980404891;
        gx.fmqo[1245] = 1798014610;
        gx.fmqo[1246] = -378018763;
        gx.fmqo[1247] = -418367575;
        gx.fmqo[1248] = -242985351;
        gx.fmqo[1249] = -1950447004;
        gx.fmqo[1250] = 346960662;
        gx.fmqo[1251] = -884561607;
        gx.fmqo[1252] = -901004428;
        gx.fmqo[1253] = 578821387;
        gx.fmqo[1254] = -1200548786;
        gx.fmqo[1255] = 491084402;
        gx.fmqo[1256] = 138346368;
        gx.fmqo[1257] = 351765861;
        gx.fmqo[1258] = 1740715941;
        gx.fmqo[1259] = 834604193;
        gx.fmqo[1260] = 792239721;
        gx.fmqo[1261] = -968384436;
        gx.fmqo[1262] = -1152252480;
        gx.fmqo[1263] = -504933297;
        gx.fmqo[1264] = -992883583;
        gx.fmqo[1265] = 388928815;
        gx.fmqo[1266] = 381312157;
        gx.fmqo[1267] = 1192415884;
        gx.fmqo[1268] = -1500479794;
        gx.fmqo[1269] = -1322453542;
        gx.fmqo[1270] = -70091618;
        gx.fmqo[1271] = 1753839118;
        gx.fmqo[1272] = -1980860897;
        gx.fmqo[1273] = -1822678624;
        gx.fmqo[1274] = -1687743820;
        gx.fmqo[1275] = -625785458;
        gx.fmqo[1276] = -258585236;
        gx.fmqo[1277] = 1341663818;
        gx.fmqo[1278] = 1878172980;
        gx.fmqo[1279] = 1887900212;
        gx.fmqo[1280] = 1411703553;
        gx.fmqo[1281] = 2118365757;
        gx.fmqo[1282] = 403696717;
        gx.fmqo[1283] = -1084169619;
        gx.fmqo[1284] = -184868835;
        gx.fmqo[1285] = -1942409906;
        gx.fmqo[1286] = 1320193255;
        gx.fmqo[1287] = -945287013;
        gx.fmqo[1288] = 1786263570;
        gx.fmqo[1289] = -990380391;
        gx.fmqo[1290] = 131023847;
        gx.fmqo[1291] = 440061703;
        gx.fmqo[1292] = 1732120361;
        gx.fmqo[1293] = 1417246486;
        gx.fmqo[1294] = -820335678;
        gx.fmqo[1295] = 1482364858;
        gx.fmqo[1296] = -88795713;
        gx.fmqo[1297] = 244840235;
        gx.fmqo[1298] = 1042171939;
        gx.fmqo[1299] = 143522775;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$updateHealthSnapshots$0(UUID var0) {
        block43: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("frew", fmrp(int ), (int)513)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == gx.fmqp("frex", fmrd(int ), (int)1333)) break;
                v0 /* !! */  = (long)gx.fmqp("frey", fmrd(int ), (int)1334);
            }
            var3_1 = gx.c;
            v1 /* !! */  = gx.mq;
            if (true) ** GOTO lbl12
            block24: while (true) {
                v1 /* !! */  = (long)(gx.fmqp("frfc", fmrp(int ), (int)515) - gx.fmqp("frfa", fmrp(int ), (int)514));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 1461008885: {
                        break block24;
                    }
                    case 1841267553: {
                        continue block24;
                    }
                }
                break;
            }
            var2_2 /* !! */  = gx.b;
            v2 /* !! */  = gx.mq;
            if (true) ** GOTO lbl22
            block25: while (true) {
                v2 /* !! */  = (long)(gx.fmqp("frfg", fmrp(int ), (int)517) - gx.fmqp("frfe", fmrp(int ), (int)516));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 82583516: {
                        continue block25;
                    }
                    case 1461008885: {
                        break block25;
                    }
                }
                break;
            }
            var1_3 = gx.a;
            if (var3_1) {
                throw null;
lbl30:
                // 4 sources

                return (boolean)gx.fmqp("frfi", fmrd(int ), (int)1335);
            }
            if (var1_3 || var1_3) ** GOTO lbl30
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("frfj", fmrp(int ), (int)518)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == gx.fmqp("frfk", fmrd(int ), (int)1336)) break;
                v3 /* !! */  = (long)gx.fmqp("frfl", fmrd(int ), (int)1337);
            }
            v4 /* !! */  = gx.mq;
            if (true) ** GOTO lbl43
            block28: while (true) {
                v4 /* !! */  = (long)(v5 - gx.fmqp("frfn", fmrp(int ), (int)519));
lbl43:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1168483939: {
                        v5 = gx.fmqp("frfp", fmrp(int ), (int)520);
                        continue block28;
                    }
                    case 1059141423: {
                        v5 = gx.fmqp("frfr", fmrp(int ), (int)521);
                        continue block28;
                    }
                    case 1461008885: {
                        break block28;
                    }
                }
                break;
            }
            v6 = gx.mc.field_1687;
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("frfw", fmrp(int ), (int)522)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v7 /* !! */  == gx.fmqp("frfx", fmrd(int ), (int)1338)) break;
                v7 /* !! */  = (long)gx.fmqp("frfy", fmrd(int ), (int)1339);
            }
            if (v6.method_18470(var0) != null) break block43;
            if (var1_3) ** GOTO lbl30
            v8 = gx.fmqp("frga", fmrd(int ), (int)1340);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl73
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v8 = gx.fmqp("frgb", fmrd(int ), (int)1341);
lbl73:
                // 2 sources

                return (boolean)v8;
            }
lbl74:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gx.fmqp("frgd", fmrd(int ), (int)1342);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl79:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gx.fmqp("frgh", fmrd(int ), (int)1343);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gx.fmqp("frgi", fmrd(int ), (int)1344);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl94
                    break;
                }
            }
lbl90:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gx.fmqp("frgj", fmrd(int ), (int)1345);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
lbl94:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)gx.fmqp("frgl", fmrd(int ), (int)1346);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
lbl98:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)gx.fmqp("frgn", fmrd(int ), (int)1347);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)gx.fmqp("frgp", fmrd(int ), (int)1348);
                if (!var3_1) ** GOTO lbl90
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)gx.fmqp("frgr", fmrd(int ), (int)1349);
        ** while (!var3_1)
lbl110:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private class_1657 watchedEntity() {
        v0 /* !! */  = gx.mq;
        block43: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 509274285: {
                    v0 /* !! */  = (long)(gx.fmqp("fpda", fmrp(int ), (int)219) - gx.fmqp("fpcz", fmrp(int ), (int)218));
                    continue block43;
                }
                case 1461008885: {
                    break block43;
                }
            }
            break;
        }
        var3_1 = gx.c;
        v1 /* !! */  = gx.mq;
        if (true) ** GOTO lbl14
        block44: while (true) {
            v1 /* !! */  = (long)(v2 - gx.fmqp("fpdb", fmrp(int ), (int)220));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1796477901: {
                    v2 = gx.fmqp("fpdc", fmrp(int ), (int)221);
                    continue block44;
                }
                case -1455905525: {
                    v2 = gx.fmqp("fpdd", fmrp(int ), (int)222);
                    continue block44;
                }
                case 1461008885: {
                    break block44;
                }
            }
            break;
        }
        var2_2 /* !! */  = gx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fpde", fmrp(int ), (int)223)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gx.fmqp("fpdf", fmrd(int ), (int)887)) {
                var1_3 = gx.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)gx.fmqp("fpdg", fmrd(int ), (int)888);
        }
        if (var1_3 != false) return null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block46: while (true) {
            block77: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3 != false) return null;
                        v4 /* !! */  = gx.mq;
                        block47: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -781002725: {
                                    v4 /* !! */  = (long)(gx.fmqp("fpdi", fmrp(int ), (int)225) - gx.fmqp("fpdh", fmrp(int ), (int)224));
                                    continue block47;
                                }
                                case 1461008885: {
                                    break block47;
                                }
                            }
                            break;
                        }
                        if (this.watchedPlayer == null) ** GOTO lbl80
                        if (var1_3 != false) return null;
                        v5 /* !! */  = gx.mq;
                        block48: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case 21732137: {
                                    v6 = gx.fmqp("fpdk", fmrp(int ), (int)227);
                                    ** GOTO lbl59
                                }
                                case 370517901: {
                                    v6 = gx.fmqp("fpdl", fmrp(int ), (int)228);
lbl59:
                                    // 2 sources

                                    v5 /* !! */  = (long)(v6 - gx.fmqp("fpdj", fmrp(int ), (int)226));
                                    continue block48;
                                }
                                case 1461008885: {
                                    break block48;
                                }
                            }
                            break;
                        }
                        v7 /* !! */  = gx.mq;
                        block49: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case 995521439: {
                                    v8 = gx.fmqp("fpdn", fmrp(int ), (int)230);
                                    ** GOTO lbl76
                                }
                                case 1461008885: {
                                    break block49;
                                }
                                case 1590531482: {
                                    v8 = gx.fmqp("fpdo", fmrp(int ), (int)231);
                                    ** GOTO lbl76
                                }
                                case 1802463867: {
                                    v8 = gx.fmqp("fpdp", fmrp(int ), (int)232);
lbl76:
                                    // 3 sources

                                    v7 /* !! */  = (long)(v8 - gx.fmqp("fpdm", fmrp(int ), (int)229));
                                    continue block49;
                                }
                            }
                            break;
                        }
                        if (gx.mc.field_1687 != null) ** GOTO lbl85
                        if (var1_3 != false) return null;
lbl80:
                        // 2 sources

                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v9 = null;
                        if (var3_1 == false) return v9;
                        throw null;
lbl85:
                        // 1 sources

                        if (var1_3 != false) return null;
                        if (var1_3 != false) return null;
                        v10 /* !! */  = gx.mq;
                        block50: while (true) {
                            switch ((int)v10 /* !! */ ) {
                                case -1841535189: {
                                    v11 = gx.fmqp("fpdr", fmrp(int ), (int)234);
                                    ** GOTO lbl100
                                }
                                case 76279467: {
                                    v11 = gx.fmqp("fpds", fmrp(int ), (int)235);
                                    ** GOTO lbl100
                                }
                                case 1461008885: {
                                    break block50;
                                }
                                case 1875022542: {
                                    v11 = gx.fmqp("fpdt", fmrp(int ), (int)236);
lbl100:
                                    // 3 sources

                                    v10 /* !! */  = (long)(v11 - gx.fmqp("fpdq", fmrp(int ), (int)233));
                                    continue block50;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fpdu", fmrp(int ), (int)237)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v12 /* !! */  != gx.fmqp("fpdv", fmrd(int ), (int)889)) ** GOTO lbl108
                            v13 = gx.mc.field_1687;
                            ** GOTO lbl146
lbl108:
                            // 1 sources

                            v12 /* !! */  = (long)gx.fmqp("fpdw", fmrd(int ), (int)890);
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)gx.fmqp("fped", fmrd(int ), (int)895);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block77;
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)gx.fmqp("fpee", fmrd(int ), (int)896);
                        cfr_temp_0 = 9;
                        if (var3_1) {
                            throw null;
                        }
                        break block77;
                    }
                    case 3: {
                        ** GOTO lbl137
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)gx.fmqp("fpei", fmrd(int ), (int)900);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: {
                        do {
                            var2_2 /* !! */  = (int)gx.fmqp("fpef", fmrd(int ), (int)897);
                        } while (!var3_1);
                        throw null;
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)gx.fmqp("fpen", fmrd(int ), (int)905);
                        if (var3_1) {
                            throw null;
                        }
lbl137:
                        // 3 sources

                        var2_2 /* !! */  = (int)gx.fmqp("fpeg", fmrd(int ), (int)898);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)gx.fmqp("fpek", fmrd(int ), (int)902);
                        cfr_temp_0 = 9;
                        if (var3_1) {
                            throw null;
                        }
                        break block77;
                    }
lbl146:
                    // 1 sources

                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fpdx", fmrp(int ), (int)238)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v14 /* !! */  == gx.fmqp("fpdy", fmrd(int ), (int)891)) break;
                        v14 /* !! */  = (long)gx.fmqp("fpdz", fmrd(int ), (int)892);
                    }
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fpea", fmrp(int ), (int)239)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v15 /* !! */  == gx.fmqp("fpeb", fmrd(int ), (int)893)) {
                            v9 = v13.method_18470(this.watchedPlayer);
                            return v9;
                        }
                        v15 /* !! */  = (long)gx.fmqp("fpec", fmrd(int ), (int)894);
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)gx.fmqp("fpeh", fmrd(int ), (int)899);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)gx.fmqp("fpej", fmrd(int ), (int)901);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)gx.fmqp("fpel", fmrd(int ), (int)903);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 9: 
                }
                ** GOTO lbl177
            }
            do {
                if (true) continue block46;
lbl177:
                // 2 sources

                var2_2 /* !! */  = (int)gx.fmqp("fpem", fmrd(int ), (int)904);
                cfr_temp_0 = 4;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean hasCollectedLoot() {
        block110: {
            v0 /* !! */  = gx.mq;
            if (true) ** GOTO lbl5
            block69: while (true) {
                v0 /* !! */  = (long)(gx.fmqp("fpmh", fmrp(int ), (int)260) - gx.fmqp("fplx", fmrp(int ), (int)259));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 1461008885: {
                        break block69;
                    }
                    case 1517665441: {
                        continue block69;
                    }
                }
                break;
            }
            var6_1 = gx.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fpmi", fmrp(int ), (int)261)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == gx.fmqp("fpmj", fmrd(int ), (int)930)) break;
                v1 /* !! */  = (long)gx.fmqp("fpmk", fmrd(int ), (int)931);
            }
            var5_2 /* !! */  = gx.b;
            v2 /* !! */  = gx.mq;
            if (true) ** GOTO lbl21
            block71: while (true) {
                v2 /* !! */  = (long)(v3 - gx.fmqp("fpml", fmrp(int ), (int)262));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -557819324: {
                        v3 = gx.fmqp("fpmm", fmrp(int ), (int)263);
                        continue block71;
                    }
                    case 304968415: {
                        v3 = gx.fmqp("fpms", fmrp(int ), (int)264);
                        continue block71;
                    }
                    case 1461008885: {
                        break block71;
                    }
                }
                break;
            }
            var4_3 = gx.a;
            if (var6_1) {
                throw null;
lbl33:
                // 12 sources

                return (boolean)gx.fmqp("fpmu", fmrd(int ), (int)932);
            }
            if (var4_3 || var4_3) ** GOTO lbl33
            v4 /* !! */  = gx.mq;
            if (true) ** GOTO lbl40
            block73: while (true) {
                v4 /* !! */  = (long)(v5 - gx.fmqp("fpmw", fmrp(int ), (int)265));
lbl40:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 224180461: {
                        v5 = gx.fmqp("fpmx", fmrp(int ), (int)266);
                        continue block73;
                    }
                    case 818779895: {
                        v5 = gx.fmqp("fpmz", fmrp(int ), (int)267);
                        continue block73;
                    }
                    case 1027274722: {
                        v5 = gx.fmqp("fpnb", fmrp(int ), (int)268);
                        continue block73;
                    }
                    case 1461008885: {
                        break block73;
                    }
                }
                break;
            }
            if (this.lootInventoryTracking) break block110;
            if (var4_3 || var4_3) ** GOTO lbl33
            return (boolean)gx.fmqp("fpnd", fmrd(int ), (int)933);
        }
        if (var4_3 || var4_3) ** GOTO lbl33
        v6 /* !! */  = gx.mq;
        if (true) ** GOTO lbl61
        block74: while (true) {
            v6 /* !! */  = (long)(v7 - gx.fmqp("fpnj", fmrp(int ), (int)269));
lbl61:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1713667816: {
                    v7 = gx.fmqp("fpnk", fmrp(int ), (int)270);
                    continue block74;
                }
                case -1451015704: {
                    v7 = gx.fmqp("fpno", fmrp(int ), (int)271);
                    continue block74;
                }
                case 1461008885: {
                    break block74;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fpnq", fmrp(int ), (int)272)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gx.fmqp("fpnr", fmrd(int ), (int)934)) break;
            v8 /* !! */  = (long)gx.fmqp("fpnu", fmrd(int ), (int)935);
        }
        var1_4 = new HashMap<class_1792, Integer>();
        if (var4_3 || var4_3) ** GOTO lbl33
        v9 /* !! */  = gx.mq;
        if (true) ** GOTO lbl81
        block76: while (true) {
            v9 /* !! */  = (long)(v10 - gx.fmqp("fpnv", fmrp(int ), (int)273));
lbl81:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1920344388: {
                    v10 = gx.fmqp("fpny", fmrp(int ), (int)274);
                    continue block76;
                }
                case 936115964: {
                    v10 = gx.fmqp("fpoe", fmrp(int ), (int)275);
                    continue block76;
                }
                case 1228000722: {
                    v10 = gx.fmqp("fpof", fmrp(int ), (int)276);
                    continue block76;
                }
                case 1461008885: {
                    break block76;
                }
            }
            break;
        }
        this.addInventoryCounts(var1_4);
        if (var4_3 || var4_3) ** GOTO lbl33
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fpoi", fmrp(int ), (int)277)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gx.fmqp("fpok", fmrd(int ), (int)936)) break;
            v11 /* !! */  = (long)gx.fmqp("fpol", fmrd(int ), (int)937);
        }
        v12 = var1_4.entrySet();
        v13 /* !! */  = gx.mq;
        if (true) ** GOTO lbl105
        block78: while (true) {
            v13 /* !! */  = (long)(v14 - gx.fmqp("fpon", fmrp(int ), (int)278));
lbl105:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case 1048625989: {
                    v14 = gx.fmqp("fpoo", fmrp(int ), (int)279);
                    continue block78;
                }
                case 1461008885: {
                    break block78;
                }
                case 1773779936: {
                    v14 = gx.fmqp("fpoq", fmrp(int ), (int)280);
                    continue block78;
                }
            }
            break;
        }
        var2_5 = v12.iterator();
        if (var4_3) ** GOTO lbl33
        block79: while (true) {
            if (var4_3 || var4_3) ** GOTO lbl33
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fpot", fmrp(int ), (int)281)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == gx.fmqp("fpov", fmrd(int ), (int)938)) break;
                v15 /* !! */  = (long)gx.fmqp("fpow", fmrd(int ), (int)939);
            }
            if (!var2_5.hasNext()) ** GOTO lbl197
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_3) ** GOTO lbl33
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fpoz", fmrp(int ), (int)282)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  == gx.fmqp("fppb", fmrd(int ), (int)940)) break;
                        v16 /* !! */  = (long)gx.fmqp("fppd", fmrd(int ), (int)941);
                    }
                    var3_6 = var2_5.next();
                    if (var4_3 || var4_3) ** GOTO lbl33
                    v17 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl139
                    block82: while (true) {
                        v17 /* !! */  = (long)(v18 - gx.fmqp("fppg", fmrp(int ), (int)283));
lbl139:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -387228806: {
                                v18 = gx.fmqp("fpph", fmrp(int ), (int)284);
                                continue block82;
                            }
                            case 472424852: {
                                v18 = gx.fmqp("fppj", fmrp(int ), (int)285);
                                continue block82;
                            }
                            case 1461008885: {
                                break block82;
                            }
                        }
                        break;
                    }
                    v19 = (Integer)var3_6.getValue();
                    v20 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl153
                    block83: while (true) {
                        v20 /* !! */  = (long)(v21 - gx.fmqp("fppk", fmrp(int ), (int)286));
lbl153:
                        // 2 sources

                        switch ((int)v20 /* !! */ ) {
                            case 571955403: {
                                v21 = gx.fmqp("fppm", fmrp(int ), (int)287);
                                continue block83;
                            }
                            case 1461008885: {
                                break block83;
                            }
                            case 1859927234: {
                                v21 = gx.fmqp("fppp", fmrp(int ), (int)288);
                                continue block83;
                            }
                        }
                        break;
                    }
                    v22 = v19;
                    while (true) {
                        if ((v23 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fppv", fmrp(int ), (int)289)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v23 /* !! */  == gx.fmqp("fppz", fmrd(int ), (int)942)) break;
                        v23 /* !! */  = (long)gx.fmqp("fpqa", fmrd(int ), (int)943);
                    }
                    while (true) {
                        if ((v24 /* !! */  = (cfr_temp_6 = gx.mq - gx.fmqp("fpqb", fmrp(int ), (int)290)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v24 /* !! */  == gx.fmqp("fpqd", fmrd(int ), (int)944)) break;
                        v24 /* !! */  = (long)gx.fmqp("fpqe", fmrd(int ), (int)945);
                    }
                    v25 = var3_6.getKey();
                    v26 = gx.fmqp("fpqf", fmrd(int ), (int)946);
                    while (true) {
                        if ((v27 /* !! */  = (cfr_temp_7 = gx.mq - gx.fmqp("fpqi", fmrp(int ), (int)291)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v27 /* !! */  == gx.fmqp("fpql", fmrd(int ), (int)947)) break;
                        v27 /* !! */  = (long)gx.fmqp("fpqm", fmrd(int ), (int)948);
                    }
                    v28 = (int)v26;
                    while (true) {
                        if ((v29 /* !! */  = (cfr_temp_8 = gx.mq - gx.fmqp("fpqo", fmrp(int ), (int)292)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                        if (v29 /* !! */  == gx.fmqp("fpqp", fmrd(int ), (int)949)) break;
                        v29 /* !! */  = (long)gx.fmqp("fpqr", fmrd(int ), (int)950);
                    }
                    while (true) {
                        if ((v30 /* !! */  = (cfr_temp_9 = gx.mq - gx.fmqp("fpqu", fmrp(int ), (int)293)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                        if (v30 /* !! */  == gx.fmqp("fpra", fmrd(int ), (int)951)) break;
                        v30 /* !! */  = (long)gx.fmqp("fprc", fmrd(int ), (int)952);
                    }
                    if (v22 <= this.lootInventoryBaseline.getOrDefault(v25, v28)) ** GOTO lbl194
                    if (var4_3 || var4_3) ** GOTO lbl33
                    return (boolean)gx.fmqp("fprd", fmrd(int ), (int)953);
lbl194:
                    // 1 sources

                    if (var4_3 || var4_3) ** GOTO lbl33
                    if (!var6_1) continue block79;
                    throw null;
                }
lbl197:
                // 1 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return (boolean)gx.fmqp("fprg", fmrd(int ), (int)954);
lbl200:
                // 3 sources

                case 0: {
                    do {
                        var5_2 /* !! */  = (int)gx.fmqp("fprh", fmrd(int ), (int)955);
                    } while (!var6_1);
                    throw null;
                }
lbl205:
                // 2 sources

                case 1: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpri", fmrd(int ), (int)956);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl239
                }
                case 2: {
                    var5_2 /* !! */  = (int)gx.fmqp("fprk", fmrd(int ), (int)957);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl280
                }
lbl215:
                // 2 sources

                case 3: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpro", fmrd(int ), (int)958);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl305
                }
lbl220:
                // 2 sources

                case 4: {
                    var5_2 /* !! */  = (int)gx.fmqp("fprp", fmrd(int ), (int)959);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
lbl225:
                // 2 sources

                case 5: {
                    var5_2 /* !! */  = (int)gx.fmqp("fprr", fmrd(int ), (int)960);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
lbl230:
                // 3 sources

                case 6: {
                    var5_2 /* !! */  = (int)gx.fmqp("fprt", fmrd(int ), (int)961);
                    if (!var6_1) ** GOTO lbl200
                    throw null;
                }
lbl234:
                // 2 sources

                case 7: {
                    var5_2 /* !! */  = (int)gx.fmqp("fprv", fmrd(int ), (int)962);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl301
                }
lbl239:
                // 4 sources

                case 8: {
                    var5_2 /* !! */  = (int)gx.fmqp("fprw", fmrd(int ), (int)963);
                    if (!var6_1) ** GOTO lbl215
                    throw null;
                }
                case 9: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpry", fmrd(int ), (int)964);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl260
                }
                case 10: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsd", fmrd(int ), (int)965);
                    if (!var6_1) ** GOTO lbl225
                    throw null;
                }
                case 11: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpse", fmrd(int ), (int)966);
                    if (!var6_1) ** GOTO lbl234
                    throw null;
                }
lbl256:
                // 4 sources

                case 12: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsf", fmrd(int ), (int)967);
                    if (!var6_1) ** GOTO lbl200
                    throw null;
                }
lbl260:
                // 3 sources

                case 13: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsh", fmrd(int ), (int)968);
                    if (!var6_1) ** GOTO lbl230
                    throw null;
                }
lbl264:
                // 2 sources

                case 14: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsj", fmrd(int ), (int)969);
                    if (!var6_1) ** GOTO lbl239
                    throw null;
                }
                case 15: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsk", fmrd(int ), (int)970);
                    if (!var6_1) ** GOTO lbl256
                    throw null;
                }
                case 16: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsl", fmrd(int ), (int)971);
                    if (!var6_1) ** GOTO lbl220
                    throw null;
                }
                case 17: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsr", fmrd(int ), (int)972);
                    if (!var6_1) ** GOTO lbl230
                    throw null;
                }
lbl280:
                // 2 sources

                case 18: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_2 /* !! */  = (int)gx.fmqp("fpst", fmrd(int ), (int)973);
                        if (!var6_1) ** GOTO lbl239
                        throw null;
                    }
                }
                case 19: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsw", fmrd(int ), (int)974);
                    if (!var6_1) ** GOTO lbl205
                    throw null;
                }
                case 20: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsx", fmrd(int ), (int)975);
                    if (!var6_1) ** GOTO lbl264
                    throw null;
                }
lbl293:
                // 2 sources

                case 21: {
                    var5_2 /* !! */  = (int)gx.fmqp("fpsz", fmrd(int ), (int)976);
                    if (!var6_1) break block79;
                    throw null;
                }
                case 22: {
                    var5_2 /* !! */  = (int)gx.fmqp("fptb", fmrd(int ), (int)977);
                    if (!var6_1) ** GOTO lbl256
                    throw null;
                }
lbl301:
                // 2 sources

                case 23: {
                    var5_2 /* !! */  = (int)gx.fmqp("fptd", fmrd(int ), (int)978);
                    if (!var6_1) ** GOTO lbl256
                    throw null;
                }
lbl305:
                // 2 sources

                case 24: {
                    do {
                        var5_2 /* !! */  = (int)gx.fmqp("fptk", fmrd(int ), (int)979);
                    } while (!var6_1);
                    throw null;
                }
                case 25: 
            }
            break;
        }
        var5_2 /* !! */  = (int)gx.fmqp("fptn", fmrd(int ), (int)980);
        ** while (!var6_1)
lbl313:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isCandidatePlayer(class_1657 var1_1) {
        block103: {
            block102: {
                var13_2 = gx.c;
                var12_3 /* !! */  = gx.b;
                var11_4 = gx.a;
                if (var13_2) {
                    throw null;
                }
                if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                if (var1_1 == gx.mc.field_1724) break block102;
                if (var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                if (var1_1.method_5805()) break block103;
                if (var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
            }
            if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
            return (boolean)gx.fmqp("folo", fmrd(int ), (int)581);
        }
        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
        var2_5 = gx.mc.field_1724.method_73189();
        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
        var3_6 = var1_1.method_73189();
        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
        var4_7 = var2_5.field_1351 - var3_6.field_1351;
        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
        if (var4_7 < gx.fmqp("folq", fmxg(int ), (int)170)) ** GOTO lbl31
        if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block41: while (true) {
            block101: {
                switch (cfr_temp_0 == -2147483648 ? var12_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                        if (!(var4_7 > (double)this.verticalRadius.getValue())) ** GOTO lbl33
                        if (var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
lbl31:
                        // 2 sources

                        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                        return (boolean)gx.fmqp("folt", fmrd(int ), (int)582);
lbl33:
                        // 1 sources

                        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                        var6_8 = var2_5.field_1352 - var3_6.field_1352;
                        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                        var8_9 = var2_5.field_1350 - var3_6.field_1350;
                        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                        if (var6_8 * var6_8 + var8_9 * var8_9 > (double)(this.playerRadius.getValue() * this.playerRadius.getValue())) {
                            if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                            return (boolean)gx.fmqp("folu", fmrd(int ), (int)583);
                        }
                        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                        var10_10 = gx.mc.method_1562().method_2871(var1_1.method_5667());
                        if (var11_4 || var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                        if (var10_10 != null) {
                            if (var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                            if (var10_10.method_2958() != class_1934.field_9220) {
                                if (var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                                if (var10_10.method_2958() != class_1934.field_9219) {
                                    if (var11_4) return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                                    v0 = gx.fmqp("folx", fmrd(int ), (int)584);
                                    if (!var13_2) return (boolean)v0;
                                    throw null;
                                }
                            }
                        }
                        if (var11_4 || var11_4) {
                            return (boolean)gx.fmqp("folm", fmrd(int ), (int)580);
                        }
                        v0 = gx.fmqp("foly", fmrd(int ), (int)585);
                        return (boolean)v0;
                    }
                    case 0: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomd", fmrd(int ), (int)586);
                        cfr_temp_0 = 19;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 2: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomg", fmrd(int ), (int)588);
                        cfr_temp_0 = 13;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 6: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomk", fmrd(int ), (int)592);
                        cfr_temp_0 = 34;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 7: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomn", fmrd(int ), (int)593);
                        cfr_temp_0 = 32;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 12: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomv", fmrd(int ), (int)598);
                        cfr_temp_0 = 32;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 16: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonc", fmrd(int ), (int)602);
                        cfr_temp_0 = 26;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 18: {
                        var12_3 /* !! */  = (int)gx.fmqp("fong", fmrd(int ), (int)604);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomr", fmrd(int ), (int)595);
                        cfr_temp_0 = 3;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 20: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonj", fmrd(int ), (int)606);
                        cfr_temp_0 = 14;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 22: {
                        var12_3 /* !! */  = (int)gx.fmqp("fono", fmrd(int ), (int)608);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        ** break;
                    }
                    case 24: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonq", fmrd(int ), (int)610);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomx", fmrd(int ), (int)599);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var12_3 /* !! */  = (int)gx.fmqp("fone", fmrd(int ), (int)603);
                        cfr_temp_0 = 25;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 27: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonv", fmrd(int ), (int)613);
                        cfr_temp_0 = 30;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 31: {
                        var12_3 /* !! */  = (int)gx.fmqp("fooc", fmrd(int ), (int)617);
                        cfr_temp_0 = 4;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 37: {
                        var12_3 /* !! */  = (int)gx.fmqp("fooo", fmrd(int ), (int)623);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonr", fmrd(int ), (int)611);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 21: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonn", fmrd(int ), (int)607);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 36: {
                        var12_3 /* !! */  = (int)gx.fmqp("foon", fmrd(int ), (int)622);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var12_3 /* !! */  = (int)gx.fmqp("fome", fmrd(int ), (int)587);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomj", fmrd(int ), (int)591);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 32: {
                        var12_3 /* !! */  = (int)gx.fmqp("food", fmrd(int ), (int)618);
                        cfr_temp_0 = 34;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                    }
                    case 38: {
                        ** GOTO lbl231
                    }
lbl173:
                    // 2 sources

                    while (true) {
                        var12_3 /* !! */  = (int)gx.fmqp("fomh", fmrd(int ), (int)589);
                        cfr_temp_0 = 30;
                        if (var13_2) {
                            throw null;
                        }
                        break block101;
                        break;
                    }
                    case 30: {
                        var12_3 /* !! */  = (int)gx.fmqp("foob", fmrd(int ), (int)616);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonb", fmrd(int ), (int)601);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 26: {
                        var12_3 /* !! */  = (int)gx.fmqp("font", fmrd(int ), (int)612);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 19: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonh", fmrd(int ), (int)605);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomz", fmrd(int ), (int)600);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomp", fmrd(int ), (int)594);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomi", fmrd(int ), (int)590);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 35: {
                        var12_3 /* !! */  = (int)gx.fmqp("foom", fmrd(int ), (int)621);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 34: {
                        var12_3 /* !! */  = (int)gx.fmqp("foof", fmrd(int ), (int)620);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        var12_3 /* !! */  = (int)gx.fmqp("fomu", fmrd(int ), (int)597);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 29: {
                        var12_3 /* !! */  = (int)gx.fmqp("fooa", fmrd(int ), (int)615);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var12_3 /* !! */  = (int)gx.fmqp("foms", fmrd(int ), (int)596);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 33: {
                        var12_3 /* !! */  = (int)gx.fmqp("fooe", fmrd(int ), (int)619);
                        if (!var13_2) ** break;
                        throw null;
lbl231:
                        // 2 sources

                        var12_3 /* !! */  = (int)gx.fmqp("foop", fmrd(int ), (int)624);
                        if (!var13_2) ** continue;
                        throw null;
                    }
                    case 23: {
                        var12_3 /* !! */  = (int)gx.fmqp("fonp", fmrd(int ), (int)609);
                        if (var13_2) {
                            throw null;
                        }
                    }
                    case 28: 
                }
                ** GOTO lbl243
            }
            do {
                if (true) continue block41;
lbl243:
                // 2 sources

                var12_3 /* !! */  = (int)gx.fmqp("fonz", fmrd(int ), (int)614);
                cfr_temp_0 = 23;
            } while (!var13_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void frha() {
        gx.fmqn[0] = -647238992;
        gx.fmqn[1] = -2121713571;
        gx.fmqn[2] = 1443174255;
        gx.fmqn[3] = 447621771;
        gx.fmqn[4] = 797469882;
        gx.fmqn[5] = -1899483900;
        gx.fmqn[6] = -198363103;
        gx.fmqn[7] = 1526020399;
        gx.fmqn[8] = -1870173552;
        gx.fmqn[9] = -32025253;
        gx.fmqn[10] = 817427076;
        gx.fmqn[11] = -1144889700;
        gx.fmqn[12] = 1383199621;
        gx.fmqn[13] = 116551001;
        gx.fmqn[14] = 711345986;
        gx.fmqn[15] = -795579228;
        gx.fmqn[16] = -697905372;
        gx.fmqn[17] = 1749232260;
        gx.fmqn[18] = 1277583572;
        gx.fmqn[19] = -1946241812;
        gx.fmqn[20] = -1870031034;
        gx.fmqn[21] = 72489568;
        gx.fmqn[22] = -154003023;
        gx.fmqn[23] = -1457461460;
        gx.fmqn[24] = -1853445084;
        gx.fmqn[25] = 546654005;
        gx.fmqn[26] = -785655522;
        gx.fmqn[27] = 1901582713;
        gx.fmqn[28] = 601132207;
        gx.fmqn[29] = 1198773912;
        gx.fmqn[30] = -1566790973;
        gx.fmqn[31] = 1340895234;
        gx.fmqn[32] = -183492171;
        gx.fmqn[33] = 865148143;
        gx.fmqn[34] = -1188886633;
        gx.fmqn[35] = 530125929;
        gx.fmqn[36] = -111994083;
        gx.fmqn[37] = 1132375036;
        gx.fmqn[38] = -948505597;
        gx.fmqn[39] = 46499372;
        gx.fmqn[40] = -1057457637;
        gx.fmqn[41] = -535006154;
        gx.fmqn[42] = 892573699;
        gx.fmqn[43] = 975893714;
        gx.fmqn[44] = 1606899981;
        gx.fmqn[45] = 593357378;
        gx.fmqn[46] = 853610562;
        gx.fmqn[47] = 1314716800;
        gx.fmqn[48] = 892889012;
        gx.fmqn[49] = 1534514713;
        gx.fmqn[50] = 1006497933;
        gx.fmqn[51] = -341020583;
        gx.fmqn[52] = 851025650;
        gx.fmqn[53] = 1736121543;
        gx.fmqn[54] = 1863834979;
        gx.fmqn[55] = 741172715;
        gx.fmqn[56] = -1612171322;
        gx.fmqn[57] = -2018868146;
        gx.fmqn[58] = -1095236243;
        gx.fmqn[59] = 1341779016;
        gx.fmqn[60] = -171667693;
        gx.fmqn[61] = -882405283;
        gx.fmqn[62] = -368312603;
        gx.fmqn[63] = -2021013059;
        gx.fmqn[64] = 1512732760;
        gx.fmqn[65] = 875276562;
        gx.fmqn[66] = -167562616;
        gx.fmqn[67] = 383686960;
        gx.fmqn[68] = 813483440;
        gx.fmqn[69] = -1959132697;
        gx.fmqn[70] = -260623998;
        gx.fmqn[71] = -194717965;
        gx.fmqn[72] = -837089096;
        gx.fmqn[73] = 2113270481;
        gx.fmqn[74] = 1601675327;
        gx.fmqn[75] = -77614066;
        gx.fmqn[76] = 86297927;
        gx.fmqn[77] = -1579632253;
        gx.fmqn[78] = 892900452;
        gx.fmqn[79] = 280937094;
        gx.fmqn[80] = -964831394;
        gx.fmqn[81] = -2142382616;
        gx.fmqn[82] = -273903120;
        gx.fmqn[83] = -1080439340;
        gx.fmqn[84] = 960176882;
        gx.fmqn[85] = 729576677;
        gx.fmqn[86] = -1883144012;
        gx.fmqn[87] = -109021657;
        gx.fmqn[88] = -103240296;
        gx.fmqn[89] = 1115135905;
        gx.fmqn[90] = -775272270;
        gx.fmqn[91] = -1013948293;
        gx.fmqn[92] = -1424733398;
        gx.fmqn[93] = -860479115;
        gx.fmqn[94] = -317394347;
        gx.fmqn[95] = -1256321365;
        gx.fmqn[96] = 222956571;
        gx.fmqn[97] = 1028544610;
        gx.fmqn[98] = -1505267231;
        gx.fmqn[99] = -1528187142;
    }

    private static /* synthetic */ void frpg() {
        gx.fmqo[600] = 972239669;
        gx.fmqo[601] = -1511795064;
        gx.fmqo[602] = -1304530303;
        gx.fmqo[603] = -368600105;
        gx.fmqo[604] = 556384275;
        gx.fmqo[605] = -2002627128;
        gx.fmqo[606] = -1971876057;
        gx.fmqo[607] = 942373171;
        gx.fmqo[608] = 2142338392;
        gx.fmqo[609] = 1349749894;
        gx.fmqo[610] = 491956214;
        gx.fmqo[611] = 1742649303;
        gx.fmqo[612] = 634788147;
        gx.fmqo[613] = -1036619179;
        gx.fmqo[614] = -845056165;
        gx.fmqo[615] = -1485033426;
        gx.fmqo[616] = 540725352;
        gx.fmqo[617] = -1173782754;
        gx.fmqo[618] = -1345771851;
        gx.fmqo[619] = -777675446;
        gx.fmqo[620] = 53008284;
        gx.fmqo[621] = -1326410480;
        gx.fmqo[622] = -964156612;
        gx.fmqo[623] = 83106292;
        gx.fmqo[624] = -1216047921;
        gx.fmqo[625] = -795142699;
        gx.fmqo[626] = 155835679;
        gx.fmqo[627] = 9100036;
        gx.fmqo[628] = 1444834600;
        gx.fmqo[629] = -1772513531;
        gx.fmqo[630] = 2043991276;
        gx.fmqo[631] = -815088909;
        gx.fmqo[632] = 773597944;
        gx.fmqo[633] = -1017779745;
        gx.fmqo[634] = -184444107;
        gx.fmqo[635] = -214275410;
        gx.fmqo[636] = -1283178504;
        gx.fmqo[637] = 437742134;
        gx.fmqo[638] = 602908271;
        gx.fmqo[639] = 1981832108;
        gx.fmqo[640] = 63203285;
        gx.fmqo[641] = 193513640;
        gx.fmqo[642] = -619240675;
        gx.fmqo[643] = 2139666242;
        gx.fmqo[644] = -207524114;
        gx.fmqo[645] = 1196672022;
        gx.fmqo[646] = -1998249427;
        gx.fmqo[647] = 981661493;
        gx.fmqo[648] = 1016471900;
        gx.fmqo[649] = 666535503;
        gx.fmqo[650] = -125711967;
        gx.fmqo[651] = -486018159;
        gx.fmqo[652] = -1417435598;
        gx.fmqo[653] = 526227470;
        gx.fmqo[654] = 1698065265;
        gx.fmqo[655] = -1825408584;
        gx.fmqo[656] = -134886651;
        gx.fmqo[657] = -757555162;
        gx.fmqo[658] = -1847351633;
        gx.fmqo[659] = 662814909;
        gx.fmqo[660] = -1100872786;
        gx.fmqo[661] = 1008123;
        gx.fmqo[662] = -1672087828;
        gx.fmqo[663] = 346533684;
        gx.fmqo[664] = -2008459814;
        gx.fmqo[665] = -1547419474;
        gx.fmqo[666] = -674049230;
        gx.fmqo[667] = 1114154342;
        gx.fmqo[668] = -1820549631;
        gx.fmqo[669] = -834029498;
        gx.fmqo[670] = 1623809252;
        gx.fmqo[671] = 895999615;
        gx.fmqo[672] = 2083235030;
        gx.fmqo[673] = 595457630;
        gx.fmqo[674] = 829470199;
        gx.fmqo[675] = -892423627;
        gx.fmqo[676] = -81972179;
        gx.fmqo[677] = 239486238;
        gx.fmqo[678] = -699027680;
        gx.fmqo[679] = -1375059459;
        gx.fmqo[680] = 32488974;
        gx.fmqo[681] = 319756712;
        gx.fmqo[682] = 1422195568;
        gx.fmqo[683] = 353196302;
        gx.fmqo[684] = -1155146272;
        gx.fmqo[685] = 520278225;
        gx.fmqo[686] = 690094895;
        gx.fmqo[687] = -2060282674;
        gx.fmqo[688] = 1968818717;
        gx.fmqo[689] = 1420565554;
        gx.fmqo[690] = -1584171499;
        gx.fmqo[691] = -1687929500;
        gx.fmqo[692] = 1861429344;
        gx.fmqo[693] = -2029193015;
        gx.fmqo[694] = -517125132;
        gx.fmqo[695] = -1738888144;
        gx.fmqo[696] = -888639789;
        gx.fmqo[697] = 189567094;
        gx.fmqo[698] = -1144273639;
        gx.fmqo[699] = -1737417680;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateWatching(long var1_1) {
        var7_2 = gx.c;
        var6_3 /* !! */  = gx.b;
        var5_4 = gx.a;
        if (var7_2) {
            throw null;
lbl6:
            // 15 sources

            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        var3_5 = this.findBestLoot(null, (double)gx.fmqp("fmxh", fmxg(int ), (int)30));
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4 || var5_4) ** GOTO lbl6
                if (var3_5 == null) ** GOTO lbl19
                if (var5_4 || var5_4) ** GOTO lbl6
                this.beginLootApproach(var3_5, var1_1, "\u043d\u0430\u0439\u0434\u0435\u043d \u0446\u0435\u043d\u043d\u044b\u0439 \u0434\u0440\u043e\u043f");
                if (var5_4 || var5_4) ** GOTO lbl6
                return;
lbl19:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                var4_6 = this.findFightCandidate(var1_1);
                if (var5_4 || var5_4) ** GOTO lbl6
                if (var4_6 != null) ** GOTO lbl25
                if (var5_4 || var5_4) ** GOTO lbl6
                return;
lbl25:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                this.watchedPlayer = var4_6.method_5667();
                if (var5_4 || var5_4) ** GOTO lbl6
                this.watchedPosition = var4_6.method_73189();
                if (var5_4 || var5_4) ** GOTO lbl6
                this.lethalTicks = (int)gx.fmqp("fmxi", fmrd(int ), (int)138);
                if (var5_4 || var5_4) ** GOTO lbl6
                this.targetLostAt = (long)gx.fmqp("fmxj", fmrp(int ), (int)31);
                if (var5_4 || var5_4) ** GOTO lbl6
                this.state = gx$State.ARMED;
                if (var5_4 || var5_4) ** GOTO lbl6
                this.stateSince = var1_1;
                if (var5_4 || var5_4) ** GOTO lbl6
                pp.brandmessage("TpLoot \u0446\u0435\u043b\u044c \u043f\u043e\u0434\u0433\u043e\u0442\u043e\u0432\u043b\u0435\u043d\u0430 \u2014 " + var4_6.method_7334().name());
                if (var5_4 || var5_4) ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxk", fmrd(int ), (int)139);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl46:
            // 2 sources

            case 1: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxl", fmrd(int ), (int)140);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl51:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxm", fmrd(int ), (int)141);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl56:
            // 3 sources

            case 3: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxn", fmrd(int ), (int)142);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl61:
            // 3 sources

            case 4: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxo", fmrd(int ), (int)143);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
lbl66:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxp", fmrd(int ), (int)144);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl71:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxq", fmrd(int ), (int)145);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 7: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxr", fmrd(int ), (int)146);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 8: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxs", fmrd(int ), (int)147);
                if (!var7_2) ** GOTO lbl56
                throw null;
            }
            case 9: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxt", fmrd(int ), (int)148);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl90:
            // 3 sources

            case 10: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxu", fmrd(int ), (int)149);
                if (!var7_2) ** GOTO lbl66
                throw null;
            }
lbl94:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxv", fmrd(int ), (int)150);
                if (!var7_2) ** GOTO lbl61
                throw null;
            }
lbl98:
            // 2 sources

            case 12: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxw", fmrd(int ), (int)151);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl103:
            // 2 sources

            case 13: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxx", fmrd(int ), (int)152);
                if (!var7_2) ** GOTO lbl51
                throw null;
            }
lbl107:
            // 3 sources

            case 14: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxy", fmrd(int ), (int)153);
                if (var7_2) {
                    throw null;
                }
            }
lbl111:
            // 4 sources

            case 15: {
                var6_3 /* !! */  = (int)gx.fmqp("fmxz", fmrd(int ), (int)154);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl116:
            // 2 sources

            case 16: {
                var6_3 /* !! */  = (int)gx.fmqp("fmya", fmrd(int ), (int)155);
                if (!var7_2) break;
                throw null;
            }
lbl120:
            // 2 sources

            case 17: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyb", fmrd(int ), (int)156);
                if (!var7_2) ** GOTO lbl94
                throw null;
            }
lbl124:
            // 3 sources

            case 18: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyc", fmrd(int ), (int)157);
                if (!var7_2) ** GOTO lbl116
                throw null;
            }
            case 19: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyd", fmrd(int ), (int)158);
                if (!var7_2) ** GOTO lbl111
                throw null;
            }
lbl132:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)gx.fmqp("fmye", fmrd(int ), (int)159);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl154
            }
            case 21: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyf", fmrd(int ), (int)160);
                if (!var7_2) ** GOTO lbl94
                throw null;
            }
            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)gx.fmqp("fmyg", fmrd(int ), (int)161);
                    if (!var7_2) ** GOTO lbl71
                    throw null;
                }
            }
            case 23: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyh", fmrd(int ), (int)162);
                if (!var7_2) ** GOTO lbl132
                throw null;
            }
            case 24: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyi", fmrd(int ), (int)163);
                if (!var7_2) ** GOTO lbl103
                throw null;
            }
lbl154:
            // 3 sources

            case 25: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyj", fmrd(int ), (int)164);
                if (!var7_2) ** GOTO lbl46
                throw null;
            }
lbl158:
            // 2 sources

            case 26: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyk", fmrd(int ), (int)165);
                if (!var7_2) ** GOTO lbl154
                throw null;
            }
lbl162:
            // 3 sources

            case 27: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyl", fmrd(int ), (int)166);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl167:
            // 2 sources

            case 28: {
                var6_3 /* !! */  = (int)gx.fmqp("fmym", fmrd(int ), (int)167);
                if (!var7_2) ** GOTO lbl56
                throw null;
            }
            case 29: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyn", fmrd(int ), (int)168);
                if (!var7_2) ** GOTO lbl90
                throw null;
            }
            case 30: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyo", fmrd(int ), (int)169);
                if (!var7_2) ** GOTO lbl61
                throw null;
            }
lbl179:
            // 3 sources

            case 31: {
                var6_3 /* !! */  = (int)gx.fmqp("fmyp", fmrd(int ), (int)170);
                if (!var7_2) ** GOTO lbl167
                throw null;
            }
            case 32: 
        }
        var6_3 /* !! */  = (int)gx.fmqp("fmyq", fmrd(int ), (int)171);
        ** while (!var7_2)
lbl186:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long fmrp(int n2) {
        return fmrq[n2] ^ fmrr[n2];
    }

    private static /* synthetic */ void frqe() {
        gx.fmqo[800] = -1078400756;
        gx.fmqo[801] = -596119285;
        gx.fmqo[802] = -1864435422;
        gx.fmqo[803] = -1662856766;
        gx.fmqo[804] = -334149559;
        gx.fmqo[805] = 1404093357;
        gx.fmqo[806] = -1748527440;
        gx.fmqo[807] = 1781065506;
        gx.fmqo[808] = 1813256336;
        gx.fmqo[809] = 598505322;
        gx.fmqo[810] = -814721522;
        gx.fmqo[811] = 1483658165;
        gx.fmqo[812] = 1711538962;
        gx.fmqo[813] = -728326229;
        gx.fmqo[814] = 397800186;
        gx.fmqo[815] = -2142915233;
        gx.fmqo[816] = -1615007157;
        gx.fmqo[817] = 2086333357;
        gx.fmqo[818] = -1633287990;
        gx.fmqo[819] = 781729623;
        gx.fmqo[820] = -1079824213;
        gx.fmqo[821] = -1313830319;
        gx.fmqo[822] = 2004411313;
        gx.fmqo[823] = -2051214307;
        gx.fmqo[824] = 1181437304;
        gx.fmqo[825] = -1638435024;
        gx.fmqo[826] = -665085375;
        gx.fmqo[827] = 1427999403;
        gx.fmqo[828] = 708635634;
        gx.fmqo[829] = -2144008974;
        gx.fmqo[830] = 357440304;
        gx.fmqo[831] = 450032362;
        gx.fmqo[832] = 1695604919;
        gx.fmqo[833] = -1510065952;
        gx.fmqo[834] = 123947870;
        gx.fmqo[835] = -1265062553;
        gx.fmqo[836] = -553041559;
        gx.fmqo[837] = -135017546;
        gx.fmqo[838] = -923021290;
        gx.fmqo[839] = 745630278;
        gx.fmqo[840] = -1740092787;
        gx.fmqo[841] = -2128813123;
        gx.fmqo[842] = -916110957;
        gx.fmqo[843] = 612508534;
        gx.fmqo[844] = -1363853387;
        gx.fmqo[845] = -1632969703;
        gx.fmqo[846] = 953909702;
        gx.fmqo[847] = -62380507;
        gx.fmqo[848] = 292334049;
        gx.fmqo[849] = 2063707487;
        gx.fmqo[850] = -1182647466;
        gx.fmqo[851] = -492716170;
        gx.fmqo[852] = 1200330787;
        gx.fmqo[853] = 495307626;
        gx.fmqo[854] = 1724435688;
        gx.fmqo[855] = -1687650191;
        gx.fmqo[856] = 1759233665;
        gx.fmqo[857] = -1995862930;
        gx.fmqo[858] = 1930110112;
        gx.fmqo[859] = -136884933;
        gx.fmqo[860] = 786485022;
        gx.fmqo[861] = 1572957517;
        gx.fmqo[862] = 1734758374;
        gx.fmqo[863] = -1900026175;
        gx.fmqo[864] = -1386720779;
        gx.fmqo[865] = -688751238;
        gx.fmqo[866] = -680017339;
        gx.fmqo[867] = -789079393;
        gx.fmqo[868] = 55217214;
        gx.fmqo[869] = -2069206085;
        gx.fmqo[870] = -1543971713;
        gx.fmqo[871] = -2135876166;
        gx.fmqo[872] = -1926024180;
        gx.fmqo[873] = 1324604135;
        gx.fmqo[874] = -143348901;
        gx.fmqo[875] = -719458350;
        gx.fmqo[876] = -643590597;
        gx.fmqo[877] = -1811927024;
        gx.fmqo[878] = -948662810;
        gx.fmqo[879] = -994707554;
        gx.fmqo[880] = 1405432726;
        gx.fmqo[881] = -1198151779;
        gx.fmqo[882] = -808135999;
        gx.fmqo[883] = 646807222;
        gx.fmqo[884] = -808362235;
        gx.fmqo[885] = 1291354596;
        gx.fmqo[886] = -1057818695;
        gx.fmqo[887] = -1121824184;
        gx.fmqo[888] = -1822235978;
        gx.fmqo[889] = 1239461429;
        gx.fmqo[890] = 1734482156;
        gx.fmqo[891] = -496550804;
        gx.fmqo[892] = 206615492;
        gx.fmqo[893] = -1537991340;
        gx.fmqo[894] = -1998391171;
        gx.fmqo[895] = 831104693;
        gx.fmqo[896] = 1204051817;
        gx.fmqo[897] = 1689389743;
        gx.fmqo[898] = -1929217660;
        gx.fmqo[899] = -1747546489;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1542 trackedLootEntity() {
        block115: {
            block117: {
                block116: {
                    v0 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl5
                    block72: while (true) {
                        v0 /* !! */  = (long)(v1 - gx.fmqp("fqbf", fmrp(int ), (int)345));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -1528209441: {
                                v1 = gx.fmqp("fqbj", fmrp(int ), (int)346);
                                continue block72;
                            }
                            case -1050717517: {
                                v1 = gx.fmqp("fqbl", fmrp(int ), (int)347);
                                continue block72;
                            }
                            case 557487806: {
                                v1 = gx.fmqp("fqbm", fmrp(int ), (int)348);
                                continue block72;
                            }
                            case 1461008885: {
                                break block72;
                            }
                        }
                        break;
                    }
                    var6_1 = gx.c;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fqbn", fmrp(int ), (int)349)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == gx.fmqp("fqbo", fmrd(int ), (int)1034)) break;
                        v2 /* !! */  = (long)gx.fmqp("fqbp", fmrd(int ), (int)1035);
                    }
                    var5_2 /* !! */  = gx.b;
                    v3 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl28
                    block74: while (true) {
                        v3 /* !! */  = (long)(v4 - gx.fmqp("fqbq", fmrp(int ), (int)350));
lbl28:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -485910665: {
                                v4 = gx.fmqp("fqbr", fmrp(int ), (int)351);
                                continue block74;
                            }
                            case 973468405: {
                                v4 = gx.fmqp("fqbs", fmrp(int ), (int)352);
                                continue block74;
                            }
                            case 1461008885: {
                                break block74;
                            }
                        }
                        break;
                    }
                    var4_3 = gx.a;
                    if (var6_1) {
                        throw null;
lbl40:
                        // 15 sources

                        return null;
                    }
                    if (var4_3 || var4_3) ** GOTO lbl40
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fqbu", fmrp(int ), (int)353)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == gx.fmqp("fqbv", fmrd(int ), (int)1036)) break;
                        v5 /* !! */  = (long)gx.fmqp("fqbw", fmrd(int ), (int)1037);
                    }
                    if (this.trackedLoot == null) break block116;
                    if (var4_3) ** GOTO lbl40
                    v6 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl54
                    block77: while (true) {
                        v6 /* !! */  = (long)(v7 - gx.fmqp("fqbx", fmrp(int ), (int)354));
lbl54:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1247539422: {
                                v7 = gx.fmqp("fqcb", fmrp(int ), (int)355);
                                continue block77;
                            }
                            case -932127992: {
                                v7 = gx.fmqp("fqcc", fmrp(int ), (int)356);
                                continue block77;
                            }
                            case 97146144: {
                                v7 = gx.fmqp("fqce", fmrp(int ), (int)357);
                                continue block77;
                            }
                            case 1461008885: {
                                break block77;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fqcf", fmrp(int ), (int)358)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v8 /* !! */  == gx.fmqp("fqcg", fmrd(int ), (int)1038)) break;
                        v8 /* !! */  = (long)gx.fmqp("fqci", fmrd(int ), (int)1039);
                    }
                    if (gx.mc.field_1687 != null) break block117;
                    if (var4_3) ** GOTO lbl40
                }
                if (var4_3 || var4_3) ** GOTO lbl40
                return null;
            }
            if (var4_3 || var4_3) ** GOTO lbl40
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fqck", fmrp(int ), (int)359)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gx.fmqp("fqcl", fmrd(int ), (int)1040)) break;
                v9 /* !! */  = (long)gx.fmqp("fqcm", fmrd(int ), (int)1041);
            }
            v10 /* !! */  = gx.mq;
            if (true) ** GOTO lbl87
            block80: while (true) {
                v10 /* !! */  = (long)(v11 - gx.fmqp("fqcn", fmrp(int ), (int)360));
lbl87:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 931612388: {
                        v11 = gx.fmqp("fqco", fmrp(int ), (int)361);
                        continue block80;
                    }
                    case 1461008885: {
                        break block80;
                    }
                    case 1992959014: {
                        v11 = gx.fmqp("fqcq", fmrp(int ), (int)362);
                        continue block80;
                    }
                }
                break;
            }
            v12 = gx.mc.field_1687;
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fqcr", fmrp(int ), (int)363)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == gx.fmqp("fqcs", fmrd(int ), (int)1042)) break;
                v13 /* !! */  = (long)gx.fmqp("fqcw", fmrd(int ), (int)1043);
            }
            v14 = v12.method_18112();
            v15 /* !! */  = gx.mq;
            if (true) ** GOTO lbl107
            block82: while (true) {
                v15 /* !! */  = (long)(v16 - gx.fmqp("fqcx", fmrp(int ), (int)364));
lbl107:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -615989957: {
                        v16 = gx.fmqp("fqcy", fmrp(int ), (int)365);
                        continue block82;
                    }
                    case -41908132: {
                        v16 = gx.fmqp("fqda", fmrp(int ), (int)366);
                        continue block82;
                    }
                    case 1461008885: {
                        break block82;
                    }
                }
                break;
            }
            var1_4 = v14.iterator();
            if (var4_3) ** GOTO lbl40
            do {
                block118: {
                    if (var4_3 || var4_3) ** GOTO lbl40
                    v17 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl124
                    block84: while (true) {
                        v17 /* !! */  = (long)(v18 - gx.fmqp("fqdb", fmrp(int ), (int)367));
lbl124:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -1372728665: {
                                v18 = gx.fmqp("fqdd", fmrp(int ), (int)368);
                                continue block84;
                            }
                            case 764588891: {
                                v18 = gx.fmqp("fqde", fmrp(int ), (int)369);
                                continue block84;
                            }
                            case 1461008885: {
                                break block84;
                            }
                        }
                        break;
                    }
                    if (!var1_4.hasNext()) break block115;
                    if (var4_3) ** GOTO lbl40
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fqdg", fmrp(int ), (int)370)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == gx.fmqp("fqdh", fmrd(int ), (int)1044)) break;
                        v19 /* !! */  = (long)gx.fmqp("fqdi", fmrd(int ), (int)1045);
                    }
                    var2_5 = (class_1297)var1_4.next();
                    if (var4_3 || var4_3) ** GOTO lbl40
                    if (!(var2_5 instanceof class_1542)) break block118;
                    if (var4_3) ** GOTO lbl40
                    var3_6 = (class_1542)var2_5;
                    if (var4_3 || var4_3) ** GOTO lbl40
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_6 = gx.mq - gx.fmqp("fqdj", fmrp(int ), (int)371)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v20 /* !! */  == gx.fmqp("fqdl", fmrd(int ), (int)1046)) break;
                        v20 /* !! */  = (long)gx.fmqp("fqdm", fmrd(int ), (int)1047);
                    }
                    if (!var3_6.method_5805()) break block118;
                    if (var4_3) ** GOTO lbl40
                    while (true) {
                        if ((v21 /* !! */  = (cfr_temp_7 = gx.mq - gx.fmqp("fqdp", fmrp(int ), (int)372)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v21 /* !! */  == gx.fmqp("fqdq", fmrd(int ), (int)1048)) break;
                        v21 /* !! */  = (long)gx.fmqp("fqdr", fmrd(int ), (int)1049);
                    }
                    v22 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl162
                    block88: while (true) {
                        v22 /* !! */  = (long)(v23 - gx.fmqp("fqdt", fmrp(int ), (int)373));
lbl162:
                        // 2 sources

                        switch ((int)v22 /* !! */ ) {
                            case -1351435959: {
                                v23 = gx.fmqp("fqdu", fmrp(int ), (int)374);
                                continue block88;
                            }
                            case -521357544: {
                                v23 = gx.fmqp("fqdv", fmrp(int ), (int)375);
                                continue block88;
                            }
                            case 305057379: {
                                v23 = gx.fmqp("fqdw", fmrp(int ), (int)376);
                                continue block88;
                            }
                            case 1461008885: {
                                break block88;
                            }
                        }
                        break;
                    }
                    v24 = var3_6.method_5667();
                    v25 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl179
                    block89: while (true) {
                        v25 /* !! */  = (long)(gx.fmqp("fqea", fmrp(int ), (int)378) - gx.fmqp("fqdz", fmrp(int ), (int)377));
lbl179:
                        // 2 sources

                        switch ((int)v25 /* !! */ ) {
                            case 100971172: {
                                continue block89;
                            }
                            case 1461008885: {
                                break block89;
                            }
                        }
                        break;
                    }
                    if (!this.trackedLoot.equals(v24)) break block118;
                    if (var4_3 || var4_3) ** GOTO lbl40
                    return var3_6;
                }
                if (var4_3 || var4_3) ** GOTO lbl40
            } while (!var6_1);
            throw null;
        }
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return null;
            }
lbl198:
            // 2 sources

            case 0: {
                var5_2 /* !! */  = (int)gx.fmqp("fqec", fmrd(int ), (int)1050);
                if (!var6_1) break;
                throw null;
            }
            case 1: {
                var5_2 /* !! */  = (int)gx.fmqp("fqed", fmrd(int ), (int)1051);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl207:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)gx.fmqp("fqef", fmrd(int ), (int)1052);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl212:
            // 2 sources

            case 3: {
                var5_2 /* !! */  = (int)gx.fmqp("fqeg", fmrd(int ), (int)1053);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl217:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)gx.fmqp("fqei", fmrd(int ), (int)1054);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 5: {
                var5_2 /* !! */  = (int)gx.fmqp("fqel", fmrd(int ), (int)1055);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl310
            }
            case 6: {
                var5_2 /* !! */  = (int)gx.fmqp("fqem", fmrd(int ), (int)1056);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 7: {
                var5_2 /* !! */  = (int)gx.fmqp("fqeo", fmrd(int ), (int)1057);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 8: {
                var5_2 /* !! */  = (int)gx.fmqp("fqep", fmrd(int ), (int)1058);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl242:
            // 4 sources

            case 9: {
                var5_2 /* !! */  = (int)gx.fmqp("fqer", fmrd(int ), (int)1059);
                if (!var6_1) ** GOTO lbl198
                throw null;
            }
            case 10: {
                var5_2 /* !! */  = (int)gx.fmqp("fqes", fmrd(int ), (int)1060);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl251:
            // 4 sources

            case 11: {
                var5_2 /* !! */  = (int)gx.fmqp("fqet", fmrd(int ), (int)1061);
                if (!var6_1) ** GOTO lbl242
                throw null;
            }
lbl255:
            // 3 sources

            case 12: {
                var5_2 /* !! */  = (int)gx.fmqp("fqev", fmrd(int ), (int)1062);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl278
            }
            case 13: {
                var5_2 /* !! */  = (int)gx.fmqp("fqew", fmrd(int ), (int)1063);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl265:
            // 3 sources

            case 14: {
                var5_2 /* !! */  = (int)gx.fmqp("fqey", fmrd(int ), (int)1064);
                if (!var6_1) ** GOTO lbl217
                throw null;
            }
            case 15: {
                var5_2 /* !! */  = (int)gx.fmqp("fqez", fmrd(int ), (int)1065);
                if (!var6_1) ** GOTO lbl212
                throw null;
            }
lbl273:
            // 3 sources

            case 16: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfa", fmrd(int ), (int)1066);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl278:
            // 2 sources

            case 17: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfc", fmrd(int ), (int)1067);
                if (!var6_1) ** GOTO lbl242
                throw null;
            }
lbl282:
            // 2 sources

            case 18: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfd", fmrd(int ), (int)1068);
                if (!var6_1) ** GOTO lbl255
                throw null;
            }
            case 19: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfg", fmrd(int ), (int)1069);
                if (!var6_1) ** GOTO lbl251
                throw null;
            }
lbl290:
            // 2 sources

            case 20: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfh", fmrd(int ), (int)1070);
                if (!var6_1) ** GOTO lbl251
                throw null;
            }
lbl294:
            // 2 sources

            case 21: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfj", fmrd(int ), (int)1071);
                if (!var6_1) ** GOTO lbl265
                throw null;
            }
            case 22: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfk", fmrd(int ), (int)1072);
                if (!var6_1) ** GOTO lbl294
                throw null;
            }
lbl302:
            // 2 sources

            case 23: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfl", fmrd(int ), (int)1073);
                if (!var6_1) break;
                throw null;
            }
lbl306:
            // 4 sources

            case 24: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfm", fmrd(int ), (int)1074);
                if (!var6_1) ** GOTO lbl290
                throw null;
            }
lbl310:
            // 2 sources

            case 25: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)gx.fmqp("fqfn", fmrd(int ), (int)1075);
                    if (!var6_1) ** GOTO lbl306
                    throw null;
                }
            }
            case 26: {
                var5_2 /* !! */  = (int)gx.fmqp("fqfp", fmrd(int ), (int)1076);
                if (!var6_1) ** GOTO lbl207
                throw null;
            }
            case 27: 
        }
        var5_2 /* !! */  = (int)gx.fmqp("fqfr", fmrd(int ), (int)1077);
        ** while (!var6_1)
lbl322:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateWaitingSpawn(long var1_1) {
        block87: {
            v0 /* !! */  = gx.mq;
            if (true) ** GOTO lbl5
            block53: while (true) {
                v0 /* !! */  = (long)(gx.fmqp("fnlz", fmrp(int ), (int)41) - gx.fmqp("fnly", fmrp(int ), (int)40));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 677960526: {
                        continue block53;
                    }
                    case 1461008885: {
                        break block53;
                    }
                }
                break;
            }
            var5_2 = gx.c;
            v1 /* !! */  = gx.mq;
            if (true) ** GOTO lbl15
            block54: while (true) {
                v1 /* !! */  = (long)(v2 - gx.fmqp("fnma", fmrp(int ), (int)42));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1667764826: {
                        v2 = gx.fmqp("fnmd", fmrp(int ), (int)43);
                        continue block54;
                    }
                    case -1180671264: {
                        v2 = gx.fmqp("fnme", fmrp(int ), (int)44);
                        continue block54;
                    }
                    case 1461008885: {
                        break block54;
                    }
                }
                break;
            }
            var4_3 /* !! */  = gx.b;
            v3 /* !! */  = gx.mq;
            if (true) ** GOTO lbl29
            block55: while (true) {
                v3 /* !! */  = (long)(gx.fmqp("fnmh", fmrp(int ), (int)46) - gx.fmqp("fnmg", fmrp(int ), (int)45));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2077224611: {
                        continue block55;
                    }
                    case 1461008885: {
                        break block55;
                    }
                }
                break;
            }
            var3_4 = gx.a;
            if (var5_2) {
                throw null;
lbl37:
                // 10 sources

                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl37
            v4 /* !! */  = gx.mq;
            if (true) ** GOTO lbl44
            block57: while (true) {
                v4 /* !! */  = (long)(gx.fmqp("fnmk", fmrp(int ), (int)48) - gx.fmqp("fnmj", fmrp(int ), (int)47));
lbl44:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 1461008885: {
                        break block57;
                    }
                    case 1530556375: {
                        continue block57;
                    }
                }
                break;
            }
            if (var1_1 >= this.spawnAt) break block87;
            if (var3_4 || var3_4) ** GOTO lbl37
            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl37
        v5 /* !! */  = gx.mq;
        if (true) ** GOTO lbl58
        block58: while (true) {
            v5 /* !! */  = (long)(gx.fmqp("fnmo", fmrp(int ), (int)50) - gx.fmqp("fnmm", fmrp(int ), (int)49));
lbl58:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -603798626: {
                    continue block58;
                }
                case 1461008885: {
                    break block58;
                }
            }
            break;
        }
        this.stopOwnedExploit();
        if (var3_4 || var3_4) ** GOTO lbl37
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fnmp", fmrp(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == gx.fmqp("fnmr", fmrd(int ), (int)387)) break;
            v6 /* !! */  = (long)gx.fmqp("fnms", fmrd(int ), (int)388);
        }
        v7 /* !! */  = gx.mq;
        if (true) ** GOTO lbl74
        block60: while (true) {
            v7 /* !! */  = (long)(gx.fmqp("fnmu", fmrp(int ), (int)53) - gx.fmqp("fnmt", fmrp(int ), (int)52));
lbl74:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 602225197: {
                    continue block60;
                }
                case 1461008885: {
                    break block60;
                }
            }
            break;
        }
        v8 = gx.mc.method_1562();
        v9 /* !! */  = gx.mq;
        if (true) ** GOTO lbl84
        block61: while (true) {
            v9 /* !! */  = (long)(v10 - gx.fmqp("fnmv", fmrp(int ), (int)54));
lbl84:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 613585310: {
                    v10 = gx.fmqp("fnmw", fmrp(int ), (int)55);
                    continue block61;
                }
                case 1461008885: {
                    break block61;
                }
                case 1690344816: {
                    v10 = gx.fmqp("fnmy", fmrp(int ), (int)56);
                    continue block61;
                }
            }
            break;
        }
        v8.method_45730("spawn");
        if (var3_4 || var3_4) ** GOTO lbl37
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fnmz", fmrp(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gx.fmqp("fnna", fmrd(int ), (int)389)) break;
            v11 /* !! */  = (long)gx.fmqp("fnnc", fmrd(int ), (int)390);
        }
        this.clearTarget();
        if (var3_4) ** GOTO lbl37
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl37
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fnne", fmrp(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gx.fmqp("fnnf", fmrd(int ), (int)391)) break;
                    v12 /* !! */  = (long)gx.fmqp("fnng", fmrd(int ), (int)392);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fnnh", fmrp(int ), (int)59)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gx.fmqp("fnni", fmrd(int ), (int)393)) break;
                    v13 /* !! */  = (long)gx.fmqp("fnnj", fmrd(int ), (int)394);
                }
                this.state = gx$State.WATCHING;
                if (var3_4 || var3_4) ** GOTO lbl37
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fnnm", fmrp(int ), (int)60)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == gx.fmqp("fnnn", fmrd(int ), (int)395)) break;
                    v14 /* !! */  = (long)gx.fmqp("fnno", fmrd(int ), (int)396);
                }
                this.stateSince = var1_1;
                if (var3_4 || var3_4) ** GOTO lbl37
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fnnq", fmrp(int ), (int)61)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gx.fmqp("fnnr", fmrd(int ), (int)397)) break;
                    v15 /* !! */  = (long)gx.fmqp("fnns", fmrd(int ), (int)398);
                }
                pp.brandmessage("TpLoot \u0437\u0430\u0431\u0440\u0430\u043b \u043b\u0443\u0442, \u043b\u0438\u0432\u0430\u0435\u043c");
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)gx.fmqp("fnnt", fmrd(int ), (int)399);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl139:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)gx.fmqp("fnnv", fmrd(int ), (int)400);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 2: {
                do {
                    var4_3 /* !! */  = (int)gx.fmqp("fnnw", fmrd(int ), (int)401);
                } while (!var5_2);
                throw null;
            }
lbl149:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)gx.fmqp("fnnx", fmrd(int ), (int)402);
                if (var5_2) {
                    throw null;
                }
            }
lbl153:
            // 5 sources

            case 4: {
                var4_3 /* !! */  = (int)gx.fmqp("fnny", fmrd(int ), (int)403);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl193
            }
lbl158:
            // 2 sources

            case 5: {
                do {
                    var4_3 /* !! */  = (int)gx.fmqp("fnnz", fmrd(int ), (int)404);
                } while (!var5_2);
                throw null;
            }
lbl163:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)gx.fmqp("fnoa", fmrd(int ), (int)405);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl206
                    break;
                }
            }
            case 7: {
                var4_3 /* !! */  = (int)gx.fmqp("fnoc", fmrd(int ), (int)406);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl174:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)gx.fmqp("fnoe", fmrd(int ), (int)407);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl179:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)gx.fmqp("fnof", fmrd(int ), (int)408);
                if (!var5_2) ** GOTO lbl158
                throw null;
            }
            case 10: {
                var4_3 /* !! */  = (int)gx.fmqp("fnoh", fmrd(int ), (int)409);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
            case 11: {
                var4_3 /* !! */  = (int)gx.fmqp("fnoi", fmrd(int ), (int)410);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl193:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)gx.fmqp("fnoj", fmrd(int ), (int)411);
                if (var5_2) {
                    throw null;
                }
            }
            case 13: {
                var4_3 /* !! */  = (int)gx.fmqp("fnok", fmrd(int ), (int)412);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 14: {
                var4_3 /* !! */  = (int)gx.fmqp("fnom", fmrd(int ), (int)413);
                if (!var5_2) break;
                throw null;
            }
lbl206:
            // 3 sources

            case 15: {
                var4_3 /* !! */  = (int)gx.fmqp("fnoo", fmrd(int ), (int)414);
                if (!var5_2) ** GOTO lbl153
                throw null;
            }
lbl210:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)gx.fmqp("fnoq", fmrd(int ), (int)415);
                if (!var5_2) ** GOTO lbl163
                throw null;
            }
lbl214:
            // 2 sources

            case 17: {
                var4_3 /* !! */  = (int)gx.fmqp("fnor", fmrd(int ), (int)416);
                if (!var5_2) ** GOTO lbl139
                throw null;
            }
lbl218:
            // 2 sources

            case 18: {
                var4_3 /* !! */  = (int)gx.fmqp("fnot", fmrd(int ), (int)417);
                if (!var5_2) ** GOTO lbl174
                throw null;
            }
lbl222:
            // 2 sources

            case 19: {
                var4_3 /* !! */  = (int)gx.fmqp("fnou", fmrd(int ), (int)418);
                if (!var5_2) ** GOTO lbl153
                throw null;
            }
            case 20: 
        }
        var4_3 /* !! */  = (int)gx.fmqp("fnov", fmrd(int ), (int)419);
        ** while (!var5_2)
lbl229:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frxo() {
        gx.fmrr[100] = -256822481454695807L;
        gx.fmrr[101] = 5926545262065047105L;
        gx.fmrr[102] = -3962648089201219455L;
        gx.fmrr[103] = -4617104855453616305L;
        gx.fmrr[104] = -1506663830911523358L;
        gx.fmrr[105] = 6707667936068025333L;
        gx.fmrr[106] = 815243509225722335L;
        gx.fmrr[107] = -4208389820426300685L;
        gx.fmrr[108] = -6037680550501579845L;
        gx.fmrr[109] = -3565807339655121964L;
        gx.fmrr[110] = -7316130633710666355L;
        gx.fmrr[111] = 3803266059301541522L;
        gx.fmrr[112] = 4704229189799944932L;
        gx.fmrr[113] = -6864314199183990773L;
        gx.fmrr[114] = -3165519529006442722L;
        gx.fmrr[115] = 2082255758917518458L;
        gx.fmrr[116] = -5505680438648296473L;
        gx.fmrr[117] = -8828474416937865283L;
        gx.fmrr[118] = -6367945740825954576L;
        gx.fmrr[119] = -5003382088599803506L;
        gx.fmrr[120] = -8964761392102880309L;
        gx.fmrr[121] = -4008210979317008348L;
        gx.fmrr[122] = 1254307293700550538L;
        gx.fmrr[123] = -7638628647243422043L;
        gx.fmrr[124] = -2541081821089075295L;
        gx.fmrr[125] = -2000353414229205083L;
        gx.fmrr[126] = -4551650098560749738L;
        gx.fmrr[127] = 4176048795758258682L;
        gx.fmrr[128] = 7658404217081255923L;
        gx.fmrr[129] = -2422822420911982920L;
        gx.fmrr[130] = 4918178575673778372L;
        gx.fmrr[131] = 4988032755203231093L;
        gx.fmrr[132] = -1738584092987418778L;
        gx.fmrr[133] = 4923957531673059750L;
        gx.fmrr[134] = 1883227737558913720L;
        gx.fmrr[135] = 8491956767192082967L;
        gx.fmrr[136] = -6307907081098788338L;
        gx.fmrr[137] = 2157391506379931235L;
        gx.fmrr[138] = 5696380986773602927L;
        gx.fmrr[139] = 3395459028830326745L;
        gx.fmrr[140] = -4797391211795484228L;
        gx.fmrr[141] = -2324265066017287408L;
        gx.fmrr[142] = 3493395073789379157L;
        gx.fmrr[143] = 7343066974305814011L;
        gx.fmrr[144] = 3099720047441245376L;
        gx.fmrr[145] = -4565122157474840341L;
        gx.fmrr[146] = 9062275252215241525L;
        gx.fmrr[147] = 9142266276507404009L;
        gx.fmrr[148] = 8259321507019264636L;
        gx.fmrr[149] = 8342599115740689480L;
        gx.fmrr[150] = -5139445441807757394L;
        gx.fmrr[151] = -5723168244418465909L;
        gx.fmrr[152] = 1502782772930483272L;
        gx.fmrr[153] = 6960693615268908675L;
        gx.fmrr[154] = -195087843468222490L;
        gx.fmrr[155] = 7152106943371455024L;
        gx.fmrr[156] = 6084080275707903159L;
        gx.fmrr[157] = 4912921505288055329L;
        gx.fmrr[158] = -7876413099355192368L;
        gx.fmrr[159] = -4875166875846700639L;
        gx.fmrr[160] = -689198154964964096L;
        gx.fmrr[161] = -9036573402220894190L;
        gx.fmrr[162] = 1568611308388309052L;
        gx.fmrr[163] = 7977097892263277611L;
        gx.fmrr[164] = -647516599776187562L;
        gx.fmrr[165] = 5525538679812697941L;
        gx.fmrr[166] = -1824206356109680242L;
        gx.fmrr[167] = 5342523591676030913L;
        gx.fmrr[168] = -624367981699681845L;
        gx.fmrr[169] = 6607528531125002462L;
        gx.fmrr[170] = -2684546334802779006L;
        gx.fmrr[171] = 1936071689241633358L;
        gx.fmrr[172] = 3859343808668371858L;
        gx.fmrr[173] = 1069113106737654583L;
        gx.fmrr[174] = 4890815405870892759L;
        gx.fmrr[175] = -4843391731439588144L;
        gx.fmrr[176] = -5771960597634318021L;
        gx.fmrr[177] = -2522371178570581358L;
        gx.fmrr[178] = -2573431563725490837L;
        gx.fmrr[179] = -5367484243090384397L;
        gx.fmrr[180] = 5709746283563976282L;
        gx.fmrr[181] = -8148817761046288626L;
        gx.fmrr[182] = 1849906318965705134L;
        gx.fmrr[183] = 2452151137000228210L;
        gx.fmrr[184] = -1668620879294806311L;
        gx.fmrr[185] = -2395300073627135283L;
        gx.fmrr[186] = -2069321990428711345L;
        gx.fmrr[187] = -1524712631773226483L;
        gx.fmrr[188] = 828903395083025810L;
        gx.fmrr[189] = 9049029825547805299L;
        gx.fmrr[190] = -1951358887084227908L;
        gx.fmrr[191] = -5500276469433463358L;
        gx.fmrr[192] = 3467030492922692094L;
        gx.fmrr[193] = -1076163367755136000L;
        gx.fmrr[194] = -213032488639025982L;
        gx.fmrr[195] = -8559391184108122427L;
        gx.fmrr[196] = 3710572409739944498L;
        gx.fmrr[197] = -7222527702817068362L;
        gx.fmrr[198] = 9071845617128753563L;
        gx.fmrr[199] = 740779642966754156L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1542 findBestLoot(class_243 var1_1, double var2_2) {
        var18_3 = gx.c;
        var17_4 /* !! */  = gx.b;
        var16_5 = gx.a;
        if (var18_3) {
            throw null;
lbl6:
            // 24 sources

            return null;
        }
        if (var16_5 || var16_5) ** GOTO lbl6
        var4_6 = null;
        if (var16_5 || var16_5) ** GOTO lbl6
        var5_7 /* !! */  = gx.fmqp("fouj", fmxg(int ), (int)187);
        if (var16_5 || var16_5) ** GOTO lbl6
        var7_8 = var2_2 * var2_2;
        if (var16_5 || var16_5) ** GOTO lbl6
        var9_9 = gx.mc.field_1687.method_18112().iterator();
        if (var16_5) ** GOTO lbl6
        block47: while (true) {
            if (var16_5 || var16_5) ** GOTO lbl6
            if (!var9_9.hasNext()) ** GOTO lbl59
            if (var16_5) ** GOTO lbl6
            var10_10 = (class_1297)var9_9.next();
            if (var16_5 || var16_5) ** GOTO lbl6
            if (!(var10_10 instanceof class_1542)) continue;
            if (var16_5) ** GOTO lbl6
            var11_11 = (class_1542)var10_10;
            if (var16_5) ** GOTO lbl6
            if (var17_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var17_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var16_5) ** GOTO lbl6
                    if (!var11_11.method_5805()) continue block47;
                    if (var16_5) ** GOTO lbl6
                    if (this.isValuable(var11_11.method_6983())) ** GOTO lbl37
                    if (var16_5 || var16_5) ** GOTO lbl6
                    if (!var18_3) continue block47;
                    throw null;
lbl37:
                    // 1 sources

                    if (var16_5 || var16_5) ** GOTO lbl6
                    if (var1_1 == null) ** GOTO lbl44
                    if (var16_5) ** GOTO lbl6
                    if (!(var11_11.method_73189().method_1025(var1_1) > var7_8)) ** GOTO lbl44
                    if (var16_5 || var16_5) ** GOTO lbl6
                    if (!var18_3) continue block47;
                    throw null;
lbl44:
                    // 2 sources

                    if (var16_5 || var16_5) ** GOTO lbl6
                    var12_12 = gx.mc.field_1724.method_5858((class_1297)var11_11);
                    if (var16_5 || var16_5) ** GOTO lbl6
                    var14_13 = (double)this.itemValue(var11_11.method_6983()) * gx.fmqp("fouk", fmxg(int ), (int)188) - var12_12;
                    if (var16_5 || var16_5) ** GOTO lbl6
                    if (!(var14_13 > var5_7 /* !! */ )) ** GOTO lbl55
                    if (var16_5 || var16_5) ** GOTO lbl6
                    var5_7 /* !! */  = (CallSite)var14_13;
                    if (var16_5 || var16_5) ** GOTO lbl6
                    var4_6 = var11_11;
                    if (var16_5) ** GOTO lbl6
lbl55:
                    // 2 sources

                    if (var16_5 || var16_5) ** GOTO lbl6
                    if (var18_3) ** break;
                    continue block47;
                    throw null;
                }
lbl59:
                // 1 sources

                if (!var16_5 && !var16_5) ** break;
                ** continue;
                return var4_6;
                case 0: {
                    var17_4 /* !! */  = (int)gx.fmqp("foul", fmrd(int ), (int)725);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl67:
                // 3 sources

                case 1: {
                    var17_4 /* !! */  = (int)gx.fmqp("foum", fmrd(int ), (int)726);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
lbl72:
                // 4 sources

                case 2: {
                    var17_4 /* !! */  = (int)gx.fmqp("foun", fmrd(int ), (int)727);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl204
                }
lbl77:
                // 4 sources

                case 3: {
                    var17_4 /* !! */  = (int)gx.fmqp("fouo", fmrd(int ), (int)728);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl82:
                // 2 sources

                case 4: {
                    var17_4 /* !! */  = (int)gx.fmqp("foup", fmrd(int ), (int)729);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
                case 5: {
                    var17_4 /* !! */  = (int)gx.fmqp("fouq", fmrd(int ), (int)730);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl97
                }
                case 6: {
                    var17_4 /* !! */  = (int)gx.fmqp("four", fmrd(int ), (int)731);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
lbl97:
                // 2 sources

                case 7: {
                    var17_4 /* !! */  = (int)gx.fmqp("fous", fmrd(int ), (int)732);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl249
                }
                case 8: {
                    var17_4 /* !! */  = (int)gx.fmqp("fout", fmrd(int ), (int)733);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
                case 9: {
                    var17_4 /* !! */  = (int)gx.fmqp("fouu", fmrd(int ), (int)734);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl121
                }
lbl112:
                // 2 sources

                case 10: {
                    var17_4 /* !! */  = (int)gx.fmqp("fouv", fmrd(int ), (int)735);
                    if (!var18_3) ** GOTO lbl72
                    throw null;
                }
lbl116:
                // 2 sources

                case 11: {
                    var17_4 /* !! */  = (int)gx.fmqp("fouw", fmrd(int ), (int)736);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
lbl121:
                // 3 sources

                case 12: {
                    var17_4 /* !! */  = (int)gx.fmqp("foux", fmrd(int ), (int)737);
                    if (!var18_3) break block47;
                    throw null;
                }
                case 13: {
                    var17_4 /* !! */  = (int)gx.fmqp("fouy", fmrd(int ), (int)738);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl245
                }
                case 14: {
                    var17_4 /* !! */  = (int)gx.fmqp("fouz", fmrd(int ), (int)739);
                    if (!var18_3) ** GOTO lbl116
                    throw null;
                }
                case 15: {
                    var17_4 /* !! */  = (int)gx.fmqp("fova", fmrd(int ), (int)740);
                    if (!var18_3) ** GOTO lbl72
                    throw null;
                }
                case 16: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var17_4 /* !! */  = (int)gx.fmqp("fovb", fmrd(int ), (int)741);
                        if (var18_3) {
                            throw null;
                        }
                        ** GOTO lbl225
                        break;
                    }
                }
lbl144:
                // 2 sources

                case 17: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovc", fmrd(int ), (int)742);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
lbl149:
                // 2 sources

                case 18: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovd", fmrd(int ), (int)743);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl237
                }
lbl154:
                // 3 sources

                case 19: {
                    var17_4 /* !! */  = (int)gx.fmqp("fove", fmrd(int ), (int)744);
                    if (!var18_3) ** GOTO lbl149
                    throw null;
                }
                case 20: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovf", fmrd(int ), (int)745);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl204
                }
lbl163:
                // 2 sources

                case 21: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovg", fmrd(int ), (int)746);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl168:
                // 3 sources

                case 22: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovh", fmrd(int ), (int)747);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl177
                }
lbl173:
                // 3 sources

                case 23: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovi", fmrd(int ), (int)748);
                    if (!var18_3) ** GOTO lbl82
                    throw null;
                }
lbl177:
                // 3 sources

                case 24: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovj", fmrd(int ), (int)749);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl241
                }
                case 25: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovk", fmrd(int ), (int)750);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
                case 26: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovl", fmrd(int ), (int)751);
                    if (!var18_3) ** GOTO lbl77
                    throw null;
                }
lbl191:
                // 4 sources

                case 27: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovm", fmrd(int ), (int)752);
                    if (!var18_3) ** GOTO lbl77
                    throw null;
                }
lbl195:
                // 3 sources

                case 28: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovn", fmrd(int ), (int)753);
                    if (!var18_3) ** GOTO lbl144
                    throw null;
                }
lbl199:
                // 2 sources

                case 29: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovo", fmrd(int ), (int)754);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl221
                }
lbl204:
                // 3 sources

                case 30: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovp", fmrd(int ), (int)755);
                    if (!var18_3) ** GOTO lbl72
                    throw null;
                }
                case 31: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovq", fmrd(int ), (int)756);
                    if (!var18_3) ** GOTO lbl199
                    throw null;
                }
                case 32: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovr", fmrd(int ), (int)757);
                    if (!var18_3) ** GOTO lbl191
                    throw null;
                }
                case 33: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovs", fmrd(int ), (int)758);
                    if (var18_3) {
                        throw null;
                    }
                    ** GOTO lbl253
                }
lbl221:
                // 2 sources

                case 34: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovt", fmrd(int ), (int)759);
                    if (!var18_3) ** GOTO lbl173
                    throw null;
                }
lbl225:
                // 2 sources

                case 35: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovu", fmrd(int ), (int)760);
                    if (!var18_3) ** GOTO lbl77
                    throw null;
                }
                case 36: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovv", fmrd(int ), (int)761);
                    if (!var18_3) ** GOTO lbl67
                    throw null;
                }
                case 37: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovw", fmrd(int ), (int)762);
                    if (!var18_3) ** GOTO lbl112
                    throw null;
                }
lbl237:
                // 2 sources

                case 38: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovx", fmrd(int ), (int)763);
                    if (!var18_3) ** GOTO lbl121
                    throw null;
                }
lbl241:
                // 3 sources

                case 39: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovy", fmrd(int ), (int)764);
                    if (!var18_3) ** GOTO lbl173
                    throw null;
                }
lbl245:
                // 3 sources

                case 40: {
                    var17_4 /* !! */  = (int)gx.fmqp("fovz", fmrd(int ), (int)765);
                    if (!var18_3) ** GOTO lbl241
                    throw null;
                }
lbl249:
                // 2 sources

                case 41: {
                    var17_4 /* !! */  = (int)gx.fmqp("fowa", fmrd(int ), (int)766);
                    if (!var18_3) ** GOTO lbl245
                    throw null;
                }
lbl253:
                // 2 sources

                case 42: {
                    var17_4 /* !! */  = (int)gx.fmqp("fowb", fmrd(int ), (int)767);
                    if (!var18_3) ** GOTO lbl67
                    throw null;
                }
                case 43: 
            }
            break;
        }
        var17_4 /* !! */  = (int)gx.fmqp("fowc", fmrd(int ), (int)768);
        ** while (!var18_3)
lbl260:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fruf() {
        gx.fmrq[100] = -2402821736036884500L;
        gx.fmrq[101] = 3263134991172103561L;
        gx.fmrq[102] = -2404405058545241602L;
        gx.fmrq[103] = -5415761661093379774L;
        gx.fmrq[104] = -1506663830911523358L;
        gx.fmrq[105] = 606009312414798782L;
        gx.fmrq[106] = -409918575671478485L;
        gx.fmrq[107] = 845497380050638865L;
        gx.fmrq[108] = -2712541510256986816L;
        gx.fmrq[109] = 3665659652365238549L;
        gx.fmrq[110] = 303835664074845259L;
        gx.fmrq[111] = -9147174396403581500L;
        gx.fmrq[112] = -2596960255934842101L;
        gx.fmrq[113] = -5167085363790409287L;
        gx.fmrq[114] = 5580056642260196032L;
        gx.fmrq[115] = -3561129018139607421L;
        gx.fmrq[116] = 6768265534817177782L;
        gx.fmrq[117] = -6952416220770725862L;
        gx.fmrq[118] = 8641251076130026676L;
        gx.fmrq[119] = 4969168469850910383L;
        gx.fmrq[120] = -3479998129238759023L;
        gx.fmrq[121] = 2602292836588698645L;
        gx.fmrq[122] = -1992337574274701082L;
        gx.fmrq[123] = -2577386870269890730L;
        gx.fmrq[124] = 3837517675769317909L;
        gx.fmrq[125] = -2929776761313213188L;
        gx.fmrq[126] = 6876576556332464581L;
        gx.fmrq[127] = 6115662094848909142L;
        gx.fmrq[128] = -6208370904324498134L;
        gx.fmrq[129] = 4817414536810329309L;
        gx.fmrq[130] = 9034738604694342161L;
        gx.fmrq[131] = 1365135776024058534L;
        gx.fmrq[132] = 3523528632416780825L;
        gx.fmrq[133] = -2491598968179854300L;
        gx.fmrq[134] = 1575851088968220353L;
        gx.fmrq[135] = 7146581872724617465L;
        gx.fmrq[136] = -1698721183741268202L;
        gx.fmrq[137] = -2734435551678655973L;
        gx.fmrq[138] = 8369008271435998488L;
        gx.fmrq[139] = -8941370495035073036L;
        gx.fmrq[140] = 6259590668967707977L;
        gx.fmrq[141] = 3685057847345816015L;
        gx.fmrq[142] = 1122249869978813013L;
        gx.fmrq[143] = 6490760744825947643L;
        gx.fmrq[144] = -5770748684242693350L;
        gx.fmrq[145] = -7370061022246090071L;
        gx.fmrq[146] = 7238442676790662607L;
        gx.fmrq[147] = -8484017637839382210L;
        gx.fmrq[148] = 4148561440512355476L;
        gx.fmrq[149] = -7006182693168300705L;
        gx.fmrq[150] = -6015697896320358219L;
        gx.fmrq[151] = 4064182829148372711L;
        gx.fmrq[152] = 5483168239653057964L;
        gx.fmrq[153] = 3501287105656855155L;
        gx.fmrq[154] = 2345636639011254463L;
        gx.fmrq[155] = 7015204830130543404L;
        gx.fmrq[156] = -823818067944395151L;
        gx.fmrq[157] = -5407708314517568876L;
        gx.fmrq[158] = 72733002462052483L;
        gx.fmrq[159] = -4875166875846700471L;
        gx.fmrq[160] = -4994216001794400800L;
        gx.fmrq[161] = 9127679868665302925L;
        gx.fmrq[162] = 2243790993233326082L;
        gx.fmrq[163] = -5294610133823603793L;
        gx.fmrq[164] = -2574642761913717104L;
        gx.fmrq[165] = -7916629804479389379L;
        gx.fmrq[166] = -7475356264757666656L;
        gx.fmrq[167] = 6721862109354763017L;
        gx.fmrq[168] = 1707917404613929403L;
        gx.fmrq[169] = -4315407873342268481L;
        gx.fmrq[170] = -7298484153043852158L;
        gx.fmrq[171] = -4780290604505648409L;
        gx.fmrq[172] = -1065388479773412915L;
        gx.fmrq[173] = 6031567206857563889L;
        gx.fmrq[174] = 8391470184465162332L;
        gx.fmrq[175] = -7544685279512936801L;
        gx.fmrq[176] = -9043716814657011142L;
        gx.fmrq[177] = 5630106305171933205L;
        gx.fmrq[178] = -7145360753113016498L;
        gx.fmrq[179] = 4366812828498097499L;
        gx.fmrq[180] = -4135115998934551727L;
        gx.fmrq[181] = -3742930805099961444L;
        gx.fmrq[182] = 7665046147558739780L;
        gx.fmrq[183] = 756682883798895738L;
        gx.fmrq[184] = -3658136766896113397L;
        gx.fmrq[185] = -2395300073627134417L;
        gx.fmrq[186] = -2069321990428711345L;
        gx.fmrq[187] = 1524224315956599309L;
        gx.fmrq[188] = 5423269906349686162L;
        gx.fmrq[189] = -7001983452747380174L;
        gx.fmrq[190] = -7872257792243062529L;
        gx.fmrq[191] = 6653299027015366037L;
        gx.fmrq[192] = -3264803194370483857L;
        gx.fmrq[193] = 8533365949470183586L;
        gx.fmrq[194] = 8190969920376842702L;
        gx.fmrq[195] = 3876995487186099564L;
        gx.fmrq[196] = -6686777596655763764L;
        gx.fmrq[197] = 2251624002024069577L;
        gx.fmrq[198] = 193890288021027192L;
        gx.fmrq[199] = 4012212365385526556L;
    }

    private static /* synthetic */ void frmj() {
        gx.fmqn[800] = -1078400722;
        gx.fmqn[801] = -596119252;
        gx.fmqn[802] = -1864435411;
        gx.fmqn[803] = -1662856733;
        gx.fmqn[804] = -334149623;
        gx.fmqn[805] = 1404093332;
        gx.fmqn[806] = -1748527462;
        gx.fmqn[807] = 1781065530;
        gx.fmqn[808] = 1813256362;
        gx.fmqn[809] = 598505320;
        gx.fmqn[810] = -814721522;
        gx.fmqn[811] = 1483658160;
        gx.fmqn[812] = 1711538962;
        gx.fmqn[813] = -728326218;
        gx.fmqn[814] = 397800161;
        gx.fmqn[815] = -2142915208;
        gx.fmqn[816] = -1615007114;
        gx.fmqn[817] = 2086333325;
        gx.fmqn[818] = -1633287941;
        gx.fmqn[819] = 781729646;
        gx.fmqn[820] = -1079824250;
        gx.fmqn[821] = -1313830300;
        gx.fmqn[822] = 2004411377;
        gx.fmqn[823] = -2051214298;
        gx.fmqn[824] = 1181437255;
        gx.fmqn[825] = -1638435011;
        gx.fmqn[826] = -665085331;
        gx.fmqn[827] = 1427999388;
        gx.fmqn[828] = 708635568;
        gx.fmqn[829] = -2144009024;
        gx.fmqn[830] = 357440258;
        gx.fmqn[831] = 450032375;
        gx.fmqn[832] = 1695604893;
        gx.fmqn[833] = -1510065977;
        gx.fmqn[834] = 123947865;
        gx.fmqn[835] = -1265062550;
        gx.fmqn[836] = -553041575;
        gx.fmqn[837] = -135017572;
        gx.fmqn[838] = -923021228;
        gx.fmqn[839] = 745630283;
        gx.fmqn[840] = -1740092762;
        gx.fmqn[841] = -2128813155;
        gx.fmqn[842] = -916110949;
        gx.fmqn[843] = 612508470;
        gx.fmqn[844] = -1363853436;
        gx.fmqn[845] = -1632969681;
        gx.fmqn[846] = 953909749;
        gx.fmqn[847] = -62380493;
        gx.fmqn[848] = 292334057;
        gx.fmqn[849] = 2063707509;
        gx.fmqn[850] = -1182647456;
        gx.fmqn[851] = -492716238;
        gx.fmqn[852] = 1200330815;
        gx.fmqn[853] = 495307639;
        gx.fmqn[854] = 1724435672;
        gx.fmqn[855] = -1687650254;
        gx.fmqn[856] = 1759233668;
        gx.fmqn[857] = -1995862913;
        gx.fmqn[858] = 1930110092;
        gx.fmqn[859] = -136884866;
        gx.fmqn[860] = 786485019;
        gx.fmqn[861] = 1572957540;
        gx.fmqn[862] = 1734758357;
        gx.fmqn[863] = -1900026176;
        gx.fmqn[864] = -1228800191;
        gx.fmqn[865] = -688751237;
        gx.fmqn[866] = -680017340;
        gx.fmqn[867] = 340065484;
        gx.fmqn[868] = 55217215;
        gx.fmqn[869] = -1850087398;
        gx.fmqn[870] = -1543971714;
        gx.fmqn[871] = -1347527858;
        gx.fmqn[872] = -1926024179;
        gx.fmqn[873] = -1128253145;
        gx.fmqn[874] = -143348902;
        gx.fmqn[875] = -719458350;
        gx.fmqn[876] = -643590596;
        gx.fmqn[877] = -1811927019;
        gx.fmqn[878] = -948662811;
        gx.fmqn[879] = -994707561;
        gx.fmqn[880] = 1405432725;
        gx.fmqn[881] = -1198151782;
        gx.fmqn[882] = -808135997;
        gx.fmqn[883] = 646807230;
        gx.fmqn[884] = -808362235;
        gx.fmqn[885] = 1291354594;
        gx.fmqn[886] = -1057818703;
        gx.fmqn[887] = -1121824183;
        gx.fmqn[888] = -122125873;
        gx.fmqn[889] = 1239461428;
        gx.fmqn[890] = 1081367403;
        gx.fmqn[891] = -496550803;
        gx.fmqn[892] = 561155389;
        gx.fmqn[893] = -1537991339;
        gx.fmqn[894] = 494902607;
        gx.fmqn[895] = 831104689;
        gx.fmqn[896] = 1204051818;
        gx.fmqn[897] = 1689389734;
        gx.fmqn[898] = -1929217664;
        gx.fmqn[899] = -1747546494;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        var7_2 = gx.c;
        var6_3 /* !! */  = gx.b;
        var5_4 = gx.a;
        if (var7_2) {
            throw null;
lbl6:
            // 18 sources

            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        if (var1_1.getType() != cr$Type.RECEIVE) ** GOTO lbl22
        if (var5_4 || var5_4) ** GOTO lbl6
        var3_5 = var1_1.getPacket();
        if (var5_4) ** GOTO lbl6
        if (!(var3_5 instanceof class_2663)) ** GOTO lbl22
        if (var5_4) ** GOTO lbl6
        var2_6 = (class_2663)var3_5;
        if (var5_4 || var5_4) ** GOTO lbl6
        if (gx.mc.field_1687 != null) ** GOTO lbl24
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl6
lbl22:
                // 3 sources

                if (var5_4 || var5_4) ** GOTO lbl6
                return;
            }
lbl24:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            var3_5 = var2_6.method_11469((class_1937)gx.mc.field_1687);
            if (var5_4 || var5_4) ** GOTO lbl6
            if (!(var3_5 instanceof class_1657)) ** GOTO lbl35
            if (var5_4) ** GOTO lbl6
            var4_7 = (class_1657)var3_5;
            if (var5_4 || var5_4) ** GOTO lbl6
            if (this.watchedPlayer == null) ** GOTO lbl35
            if (var5_4) ** GOTO lbl6
            if (this.watchedPlayer.equals(var4_7.method_5667())) ** GOTO lbl37
            if (var5_4) ** GOTO lbl6
lbl35:
            // 3 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            return;
lbl37:
            // 1 sources

            if (var5_4 || var5_4) ** GOTO lbl6
            if (var2_6.method_11470() != gx.fmqp("fmum", fmrd(int ), (int)77)) ** GOTO lbl42
            if (var5_4 || var5_4) ** GOTO lbl6
            this.abortWatchedTarget();
            if (var5_4) ** GOTO lbl6
lbl42:
            // 2 sources

            if (!var5_4 && !var5_4) ** break;
            ** continue;
            return;
            case 0: {
                var6_3 /* !! */  = (int)gx.fmqp("fmun", fmrd(int ), (int)78);
                if (var7_2) {
                    throw null;
                }
            }
lbl49:
            // 4 sources

            case 1: {
                var6_3 /* !! */  = (int)gx.fmqp("fmuo", fmrd(int ), (int)79);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl54:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)gx.fmqp("fmup", fmrd(int ), (int)80);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl59:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)gx.fmqp("fmuq", fmrd(int ), (int)81);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl72
            }
lbl64:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)gx.fmqp("fmur", fmrd(int ), (int)82);
                if (!var7_2) break;
                throw null;
            }
lbl68:
            // 2 sources

            case 5: {
                var6_3 /* !! */  = (int)gx.fmqp("fmus", fmrd(int ), (int)83);
                if (!var7_2) ** GOTO lbl54
                throw null;
            }
lbl72:
            // 3 sources

            case 6: {
                var6_3 /* !! */  = (int)gx.fmqp("fmut", fmrd(int ), (int)84);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl92
            }
            case 7: {
                var6_3 /* !! */  = (int)gx.fmqp("fmuu", fmrd(int ), (int)85);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 8: {
                var6_3 /* !! */  = (int)gx.fmqp("fmuv", fmrd(int ), (int)86);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl87:
            // 3 sources

            case 9: {
                var6_3 /* !! */  = (int)gx.fmqp("fmuw", fmrd(int ), (int)87);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl92:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)gx.fmqp("fmux", fmrd(int ), (int)88);
                if (!var7_2) ** GOTO lbl87
                throw null;
            }
            case 11: {
                var6_3 /* !! */  = (int)gx.fmqp("fmuy", fmrd(int ), (int)89);
                if (!var7_2) ** GOTO lbl64
                throw null;
            }
            case 12: {
                var6_3 /* !! */  = (int)gx.fmqp("fmuz", fmrd(int ), (int)90);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 13: {
                var6_3 /* !! */  = (int)gx.fmqp("fmva", fmrd(int ), (int)91);
                if (!var7_2) ** GOTO lbl49
                throw null;
            }
lbl109:
            // 2 sources

            case 14: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvb", fmrd(int ), (int)92);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 15: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvc", fmrd(int ), (int)93);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 16: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvd", fmrd(int ), (int)94);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl124:
            // 3 sources

            case 17: {
                var6_3 /* !! */  = (int)gx.fmqp("fmve", fmrd(int ), (int)95);
                if (!var7_2) ** GOTO lbl68
                throw null;
            }
            case 18: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvf", fmrd(int ), (int)96);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl133:
            // 3 sources

            case 19: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvg", fmrd(int ), (int)97);
                if (!var7_2) ** GOTO lbl124
                throw null;
            }
lbl137:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvh", fmrd(int ), (int)98);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl142:
            // 3 sources

            case 21: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvi", fmrd(int ), (int)99);
                if (!var7_2) ** GOTO lbl59
                throw null;
            }
lbl146:
            // 4 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)gx.fmqp("fmvj", fmrd(int ), (int)100);
                    if (!var7_2) ** GOTO lbl109
                    throw null;
                }
            }
lbl151:
            // 3 sources

            case 23: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvk", fmrd(int ), (int)101);
                if (!var7_2) ** GOTO lbl124
                throw null;
            }
lbl155:
            // 2 sources

            case 24: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvl", fmrd(int ), (int)102);
                if (!var7_2) ** GOTO lbl146
                throw null;
            }
lbl159:
            // 2 sources

            case 25: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvm", fmrd(int ), (int)103);
                if (!var7_2) ** GOTO lbl133
                throw null;
            }
lbl163:
            // 2 sources

            case 26: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvn", fmrd(int ), (int)104);
                if (!var7_2) ** GOTO lbl137
                throw null;
            }
lbl167:
            // 2 sources

            case 27: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvo", fmrd(int ), (int)105);
                if (!var7_2) ** GOTO lbl159
                throw null;
            }
lbl171:
            // 2 sources

            case 28: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvp", fmrd(int ), (int)106);
                if (!var7_2) ** GOTO lbl155
                throw null;
            }
            case 29: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvq", fmrd(int ), (int)107);
                if (!var7_2) ** GOTO lbl72
                throw null;
            }
lbl179:
            // 2 sources

            case 30: {
                var6_3 /* !! */  = (int)gx.fmqp("fmvr", fmrd(int ), (int)108);
                if (!var7_2) ** GOTO lbl171
                throw null;
            }
            case 31: 
        }
        var6_3 /* !! */  = (int)gx.fmqp("fmvs", fmrd(int ), (int)109);
        ** while (!var7_2)
lbl186:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void finishLootPosition(class_1542 var1_1) {
        block79: {
            block78: {
                var9_2 = gx.c;
                var8_3 /* !! */  = gx.b;
                var7_4 = gx.a;
                if (var9_2) {
                    throw null;
                }
                if (var7_4 || var7_4) return;
                var2_5 = this.exploit();
                if (var7_4 || var7_4) return;
                if (var1_1 == null) break block78;
                if (var7_4) return;
                if (var2_5 == null) break block79;
                if (var7_4) return;
                if (!var2_5.isActive()) break block79;
                if (var7_4) return;
            }
            if (var7_4 || var7_4) return;
            return;
        }
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block34: while (true) {
            block80: {
                switch (cfr_temp_0 == -2147483648 ? var8_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var7_4 || var7_4) return;
                        var3_6 = var1_1.method_73189();
                        if (var7_4 || var7_4) return;
                        var4_7 = gx.mc.field_1724.method_73189();
                        if (var7_4 || var7_4) return;
                        var5_8 = var4_7.method_1025(new class_243(var3_6.field_1352, var4_7.field_1351, var3_6.field_1350));
                        if (var7_4 || var7_4) return;
                        if (var5_8 > gx.fmqp("fqlt", fmxg(int ), (int)415)) {
                            if (var7_4 || var7_4) return;
                            return;
                        }
                        if (var7_4 || var7_4) return;
                        gx.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(var3_6.field_1352, var3_6.field_1351, var3_6.field_1350, gx.mc.field_1724.method_36454(), gx.mc.field_1724.method_36455(), (boolean)gx.fmqp("fqlu", fmrd(int ), (int)1142), (boolean)gx.fmqp("fqlv", fmrd(int ), (int)1143)));
                        if (var7_4 || var7_4) return;
                        gx.mc.field_1724.method_5814(var3_6.field_1352, var3_6.field_1351, var3_6.field_1350);
                        if (var7_4 || var7_4) return;
                        gx.mc.field_1724.method_18799(class_243.field_1353);
                        if (var7_4 || var7_4) return;
                        gx.mc.field_1724.field_6017 = 0.0;
                        if (!var7_4 && !var7_4) return;
                        return;
                    }
                    case 0: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqlw", fmrd(int ), (int)1144);
                        cfr_temp_0 = 6;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 1: {
                        ** GOTO lbl139
                    }
                    case 6: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmg", fmrd(int ), (int)1150);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmc", fmrd(int ), (int)1147);
                        cfr_temp_0 = 26;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 8: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmk", fmrd(int ), (int)1152);
                        cfr_temp_0 = 23;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 14: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmr", fmrd(int ), (int)1158);
                        cfr_temp_0 = 30;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 15: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqms", fmrd(int ), (int)1159);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmx", fmrd(int ), (int)1161);
                        cfr_temp_0 = 7;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 18: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmz", fmrd(int ), (int)1162);
                        cfr_temp_0 = 29;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 21: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnd", fmrd(int ), (int)1165);
                        cfr_temp_0 = 2;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 23: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnf", fmrd(int ), (int)1167);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 19: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqna", fmrd(int ), (int)1163);
                        cfr_temp_0 = 7;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 24: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnh", fmrd(int ), (int)1168);
                        cfr_temp_0 = 12;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 26: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnk", fmrd(int ), (int)1170);
                        cfr_temp_0 = 28;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 27: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnl", fmrd(int ), (int)1171);
                        cfr_temp_0 = 10;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 28: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnn", fmrd(int ), (int)1172);
                        cfr_temp_0 = 25;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 29: {
                        do {
                            var8_3 /* !! */  = (int)gx.fmqp("fqno", fmrd(int ), (int)1173);
                        } while (!var9_2);
                        throw null;
                    }
                    case 31: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnt", fmrd(int ), (int)1175);
                        if (var9_2) {
                            throw null;
                        }
lbl139:
                        // 3 sources

                        var8_3 /* !! */  = (int)gx.fmqp("fqlx", fmrd(int ), (int)1145);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqni", fmrd(int ), (int)1169);
                        cfr_temp_0 = 20;
                        if (var9_2) {
                            throw null;
                        }
                        break block80;
                    }
                    case 2: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqly", fmrd(int ), (int)1146);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmi", fmrd(int ), (int)1151);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmd", fmrd(int ), (int)1148);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmo", fmrd(int ), (int)1156);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmn", fmrd(int ), (int)1155);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmu", fmrd(int ), (int)1160);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 20: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnc", fmrd(int ), (int)1164);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 22: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqne", fmrd(int ), (int)1166);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmf", fmrd(int ), (int)1149);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqmm", fmrd(int ), (int)1154);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 30: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqnq", fmrd(int ), (int)1174);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var8_3 /* !! */  = (int)gx.fmqp("fqml", fmrd(int ), (int)1153);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 13: 
                }
                ** GOTO lbl201
            }
            do {
                if (true) continue block34;
lbl201:
                // 2 sources

                var8_3 /* !! */  = (int)gx.fmqp("fqmp", fmrd(int ), (int)1157);
                cfr_temp_0 = 2;
            } while (!var9_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void frok() {
        gx.fmqn[1200] = 1881098135;
        gx.fmqn[1201] = 1916637542;
        gx.fmqn[1202] = 524442972;
        gx.fmqn[1203] = -336711639;
        gx.fmqn[1204] = 262793932;
        gx.fmqn[1205] = 2021566789;
        gx.fmqn[1206] = -300651997;
        gx.fmqn[1207] = 1094133462;
        gx.fmqn[1208] = 1086428813;
        gx.fmqn[1209] = 1877854493;
        gx.fmqn[1210] = 1671539294;
        gx.fmqn[1211] = 489209961;
        gx.fmqn[1212] = 98458027;
        gx.fmqn[1213] = -2036139431;
        gx.fmqn[1214] = 607241403;
        gx.fmqn[1215] = -1381650190;
        gx.fmqn[1216] = 750245712;
        gx.fmqn[1217] = 458500150;
        gx.fmqn[1218] = -245296748;
        gx.fmqn[1219] = 1471803746;
        gx.fmqn[1220] = -228899298;
        gx.fmqn[1221] = 299294086;
        gx.fmqn[1222] = -992729907;
        gx.fmqn[1223] = 425802110;
        gx.fmqn[1224] = -114648135;
        gx.fmqn[1225] = 1729865817;
        gx.fmqn[1226] = 1213292904;
        gx.fmqn[1227] = 1656669490;
        gx.fmqn[1228] = 626926367;
        gx.fmqn[1229] = -97943673;
        gx.fmqn[1230] = 1479541209;
        gx.fmqn[1231] = 114499701;
        gx.fmqn[1232] = 970945505;
        gx.fmqn[1233] = -1530339952;
        gx.fmqn[1234] = 1219585393;
        gx.fmqn[1235] = -938668635;
        gx.fmqn[1236] = 388749224;
        gx.fmqn[1237] = 1922559986;
        gx.fmqn[1238] = 1562852414;
        gx.fmqn[1239] = 1173793232;
        gx.fmqn[1240] = 1299741970;
        gx.fmqn[1241] = 7822300;
        gx.fmqn[1242] = 472706953;
        gx.fmqn[1243] = 959013722;
        gx.fmqn[1244] = 1980404890;
        gx.fmqn[1245] = 1798014619;
        gx.fmqn[1246] = -378018765;
        gx.fmqn[1247] = -418367574;
        gx.fmqn[1248] = -242985359;
        gx.fmqn[1249] = -1950447003;
        gx.fmqn[1250] = -1974813159;
        gx.fmqn[1251] = -884561608;
        gx.fmqn[1252] = -1104645337;
        gx.fmqn[1253] = 578821386;
        gx.fmqn[1254] = 1228122862;
        gx.fmqn[1255] = 491084403;
        gx.fmqn[1256] = -744420119;
        gx.fmqn[1257] = 351765860;
        gx.fmqn[1258] = -1786957594;
        gx.fmqn[1259] = 834604192;
        gx.fmqn[1260] = 2123117946;
        gx.fmqn[1261] = -968384435;
        gx.fmqn[1262] = -1682929830;
        gx.fmqn[1263] = -504933297;
        gx.fmqn[1264] = -992883584;
        gx.fmqn[1265] = 286967981;
        gx.fmqn[1266] = -381312158;
        gx.fmqn[1267] = 1132667327;
        gx.fmqn[1268] = -1500479794;
        gx.fmqn[1269] = -1322453558;
        gx.fmqn[1270] = -70091622;
        gx.fmqn[1271] = 1753839135;
        gx.fmqn[1272] = -1980860910;
        gx.fmqn[1273] = -1822678613;
        gx.fmqn[1274] = -1687743839;
        gx.fmqn[1275] = -625785458;
        gx.fmqn[1276] = -258585234;
        gx.fmqn[1277] = 1341663822;
        gx.fmqn[1278] = 1878172982;
        gx.fmqn[1279] = 1887900217;
        gx.fmqn[1280] = 1411703566;
        gx.fmqn[1281] = 2118365753;
        gx.fmqn[1282] = 403696704;
        gx.fmqn[1283] = -1084169608;
        gx.fmqn[1284] = -184868840;
        gx.fmqn[1285] = -1942409890;
        gx.fmqn[1286] = 1320193267;
        gx.fmqn[1287] = -945287031;
        gx.fmqn[1288] = 1786263582;
        gx.fmqn[1289] = -990380403;
        gx.fmqn[1290] = 131023842;
        gx.fmqn[1291] = 440061714;
        gx.fmqn[1292] = 1732120360;
        gx.fmqn[1293] = 1417246487;
        gx.fmqn[1294] = -1587575136;
        gx.fmqn[1295] = 1482364859;
        gx.fmqn[1296] = 28959106;
        gx.fmqn[1297] = 244840234;
        gx.fmqn[1298] = 1808063584;
        gx.fmqn[1299] = 143522774;
    }

    private static /* synthetic */ void frxz() {
        gx.fmrr[500] = -1239691063081778234L;
        gx.fmrr[501] = 3990673545179801002L;
        gx.fmrr[502] = 8620293998887166292L;
        gx.fmrr[503] = -6720533917639450628L;
        gx.fmrr[504] = 5999471145382378340L;
        gx.fmrr[505] = -5071470513408332135L;
        gx.fmrr[506] = -5520735885358070498L;
        gx.fmrr[507] = -4458452169649829603L;
        gx.fmrr[508] = -7873981269503770597L;
        gx.fmrr[509] = -892321105799230734L;
        gx.fmrr[510] = 2061875552317590869L;
        gx.fmrr[511] = 8411329287056002858L;
        gx.fmrr[512] = -6253462827357601941L;
        gx.fmrr[513] = 6242541537033099735L;
        gx.fmrr[514] = -7649134529217024222L;
        gx.fmrr[515] = -1438739028549563108L;
        gx.fmrr[516] = -3343477761356685967L;
        gx.fmrr[517] = 5318612036115819715L;
        gx.fmrr[518] = -2851370853636933571L;
        gx.fmrr[519] = -3714933359370582121L;
        gx.fmrr[520] = -3670836448882315790L;
        gx.fmrr[521] = 8910595903948860792L;
        gx.fmrr[522] = -3509736622245552250L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onGameLeft(ca var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fmwm", fmrp(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gx.fmqp("fmwn", fmrd(int ), (int)125)) break;
            v0 /* !! */  = (long)gx.fmqp("fmwo", fmrd(int ), (int)126);
        }
        var4_2 = gx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fmwp", fmrp(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gx.fmqp("fmwq", fmrd(int ), (int)127)) break;
            v1 /* !! */  = (long)gx.fmqp("fmwr", fmrd(int ), (int)128);
        }
        var3_3 /* !! */  = gx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fmws", fmrp(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gx.fmqp("fmwt", fmrd(int ), (int)129)) break;
            v2 /* !! */  = (long)gx.fmqp("fmwu", fmrd(int ), (int)130);
        }
        var2_4 = gx.a;
        if (var4_2) {
            throw null;
lbl24:
            // 2 sources

            return;
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl24
                v3 = gx.fmqp("fmwv", fmrd(int ), (int)131);
                v4 /* !! */  = gx.mq;
                if (true) ** GOTO lbl35
                block18: while (true) {
                    v4 /* !! */  = (long)(v5 - gx.fmqp("fmww", fmrp(int ), (int)26));
lbl35:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1273193894: {
                            v5 = gx.fmqp("fmwx", fmrp(int ), (int)27);
                            continue block18;
                        }
                        case -420134918: {
                            v5 = gx.fmqp("fmwy", fmrp(int ), (int)28);
                            continue block18;
                        }
                        case 1461008885: {
                            break block18;
                        }
                        case 2141095401: {
                            v5 = gx.fmqp("fmwz", fmrp(int ), (int)29);
                            continue block18;
                        }
                    }
                    break;
                }
                this.reset((boolean)v3);
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)gx.fmqp("fmxa", fmrd(int ), (int)132);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)gx.fmqp("fmxb", fmrd(int ), (int)133);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl60:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)gx.fmqp("fmxc", fmrd(int ), (int)134);
                } while (!var4_2);
                throw null;
            }
lbl65:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)gx.fmqp("fmxd", fmrd(int ), (int)135);
                if (!var4_2) ** GOTO lbl60
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)gx.fmqp("fmxe", fmrd(int ), (int)136);
                if (!var4_2) break;
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)gx.fmqp("fmxf", fmrd(int ), (int)137);
        ** while (!var4_2)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void abortWatchedTarget() {
        v0 /* !! */  = gx.mq;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - gx.fmqp("fqsw", fmrp(int ), (int)440));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -630030581: {
                    v1 = gx.fmqp("fqsx", fmrp(int ), (int)441);
                    continue block45;
                }
                case 1461008885: {
                    break block45;
                }
                case 1754901788: {
                    v1 = gx.fmqp("fqsy", fmrp(int ), (int)442);
                    continue block45;
                }
            }
            break;
        }
        var3_1 = gx.c;
        v2 /* !! */  = gx.mq;
        if (true) ** GOTO lbl19
        block46: while (true) {
            v2 /* !! */  = (long)(v3 - gx.fmqp("fqta", fmrp(int ), (int)443));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1843074204: {
                    v3 = gx.fmqp("fqtb", fmrp(int ), (int)444);
                    continue block46;
                }
                case 1461008885: {
                    break block46;
                }
                case 1535121634: {
                    v3 = gx.fmqp("fqte", fmrp(int ), (int)445);
                    continue block46;
                }
                case 1685179931: {
                    v3 = gx.fmqp("fqtf", fmrp(int ), (int)446);
                    continue block46;
                }
            }
            break;
        }
        var2_2 /* !! */  = gx.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fqtg", fmrp(int ), (int)447)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == gx.fmqp("fqth", fmrd(int ), (int)1231)) break;
            v4 /* !! */  = (long)gx.fmqp("fqti", fmrd(int ), (int)1232);
        }
        var1_3 = gx.a;
        if (var3_1) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        v5 /* !! */  = gx.mq;
        if (true) ** GOTO lbl47
        block49: while (true) {
            v5 /* !! */  = (long)(v6 - gx.fmqp("fqtj", fmrp(int ), (int)448));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 380506465: {
                    v6 = gx.fmqp("fqtk", fmrp(int ), (int)449);
                    continue block49;
                }
                case 868026915: {
                    v6 = gx.fmqp("fqtn", fmrp(int ), (int)450);
                    continue block49;
                }
                case 966838832: {
                    v6 = gx.fmqp("fqto", fmrp(int ), (int)451);
                    continue block49;
                }
                case 1461008885: {
                    break block49;
                }
            }
            break;
        }
        this.stopOwnedExploit();
        if (var1_3 || var1_3) ** GOTO lbl40
        v7 /* !! */  = gx.mq;
        if (true) ** GOTO lbl65
        block50: while (true) {
            v7 /* !! */  = (long)(gx.fmqp("fqtq", fmrp(int ), (int)453) - gx.fmqp("fqtp", fmrp(int ), (int)452));
lbl65:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 1305235671: {
                    continue block50;
                }
                case 1461008885: {
                    break block50;
                }
            }
            break;
        }
        this.clearTarget();
        if (var1_3 || var1_3) ** GOTO lbl40
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fqtr", fmrp(int ), (int)454)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gx.fmqp("fqts", fmrd(int ), (int)1233)) break;
            v8 /* !! */  = (long)gx.fmqp("fqtt", fmrd(int ), (int)1234);
        }
        v9 /* !! */  = gx.mq;
        if (true) ** GOTO lbl81
        block52: while (true) {
            v9 /* !! */  = (long)(v10 - gx.fmqp("fqtu", fmrp(int ), (int)455));
lbl81:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -1274590087: {
                    v10 = gx.fmqp("fqtv", fmrp(int ), (int)456);
                    continue block52;
                }
                case -278162609: {
                    v10 = gx.fmqp("fqtw", fmrp(int ), (int)457);
                    continue block52;
                }
                case 1461008885: {
                    break block52;
                }
            }
            break;
        }
        this.state = gx$State.WATCHING;
        if (var1_3 || var1_3) ** GOTO lbl40
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fqtx", fmrp(int ), (int)458)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == gx.fmqp("fqty", fmrd(int ), (int)1235)) break;
            v11 /* !! */  = (long)gx.fmqp("fqtz", fmrd(int ), (int)1236);
        }
        v12 = System.currentTimeMillis();
        v13 /* !! */  = gx.mq;
        if (true) ** GOTO lbl102
        block54: while (true) {
            v13 /* !! */  = (long)(v14 - gx.fmqp("fqua", fmrp(int ), (int)459));
lbl102:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -572877085: {
                    v14 = gx.fmqp("fqub", fmrp(int ), (int)460);
                    continue block54;
                }
                case 839049036: {
                    v14 = gx.fmqp("fquc", fmrp(int ), (int)461);
                    continue block54;
                }
                case 1461008885: {
                    break block54;
                }
            }
            break;
        }
        this.stateSince = v12;
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
            case 0: {
                do {
                    var2_2 /* !! */  = (int)gx.fmqp("fqud", fmrd(int ), (int)1237);
                } while (!var3_1);
                throw null;
            }
lbl124:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gx.fmqp("fque", fmrd(int ), (int)1238);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl129:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gx.fmqp("fquf", fmrd(int ), (int)1239);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 3: {
                var2_2 /* !! */  = (int)gx.fmqp("fqug", fmrd(int ), (int)1240);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 4: {
                var2_2 /* !! */  = (int)gx.fmqp("fquk", fmrd(int ), (int)1241);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl144:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)gx.fmqp("fqul", fmrd(int ), (int)1242);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
lbl148:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)gx.fmqp("fqun", fmrd(int ), (int)1243);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 7: {
                var2_2 /* !! */  = (int)gx.fmqp("fquo", fmrd(int ), (int)1244);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
lbl157:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)gx.fmqp("fquq", fmrd(int ), (int)1245);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)gx.fmqp("fqur", fmrd(int ), (int)1246);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
lbl165:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)gx.fmqp("fqus", fmrd(int ), (int)1247);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
            case 11: 
        }
        do {
            var2_2 /* !! */  = (int)gx.fmqp("fqut", fmrd(int ), (int)1248);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void frux() {
        gx.fmrq[200] = -85884885520083135L;
        gx.fmrq[201] = 3019179533963844218L;
        gx.fmrq[202] = -2026307061677087561L;
        gx.fmrq[203] = -3141528903485324985L;
        gx.fmrq[204] = -3538240208372225483L;
        gx.fmrq[205] = 8547487716610476424L;
        gx.fmrq[206] = 8411467341670454940L;
        gx.fmrq[207] = 6891077991288521148L;
        gx.fmrq[208] = 7288411437900287654L;
        gx.fmrq[209] = -2162167301902280493L;
        gx.fmrq[210] = 4041509000787679661L;
        gx.fmrq[211] = -5718968026527750202L;
        gx.fmrq[212] = -7725415157632059187L;
        gx.fmrq[213] = -3866815478079281980L;
        gx.fmrq[214] = 6738457191431286675L;
        gx.fmrq[215] = -6793506469881577851L;
        gx.fmrq[216] = 260822131878906477L;
        gx.fmrq[217] = -1277502440917698494L;
        gx.fmrq[218] = -6819522715413444963L;
        gx.fmrq[219] = -2792593113079024548L;
        gx.fmrq[220] = -9178928495267440294L;
        gx.fmrq[221] = 7949640427824432415L;
        gx.fmrq[222] = 7963605029028317713L;
        gx.fmrq[223] = -2875445572882503272L;
        gx.fmrq[224] = -3718839263044681435L;
        gx.fmrq[225] = 4589016679456049076L;
        gx.fmrq[226] = 687113176837600597L;
        gx.fmrq[227] = -3989656560970691047L;
        gx.fmrq[228] = -759557436027822211L;
        gx.fmrq[229] = -5049269490824452532L;
        gx.fmrq[230] = 3691012529358440356L;
        gx.fmrq[231] = 3173169245208866876L;
        gx.fmrq[232] = -4951856909547370203L;
        gx.fmrq[233] = -387399770457963876L;
        gx.fmrq[234] = 2289856673588380682L;
        gx.fmrq[235] = 9021796864332838220L;
        gx.fmrq[236] = 7680527781368457293L;
        gx.fmrq[237] = 9062188108947331528L;
        gx.fmrq[238] = -2660911575420297691L;
        gx.fmrq[239] = -6476468323818670479L;
        gx.fmrq[240] = 7689611172627860271L;
        gx.fmrq[241] = -1778182155331967600L;
        gx.fmrq[242] = 5939997199530164238L;
        gx.fmrq[243] = -8617275794195159294L;
        gx.fmrq[244] = -6120999249809760051L;
        gx.fmrq[245] = -1754442868684296772L;
        gx.fmrq[246] = -5129453039374530663L;
        gx.fmrq[247] = -6299062321023640590L;
        gx.fmrq[248] = -187106722511444460L;
        gx.fmrq[249] = 3445671340074949396L;
        gx.fmrq[250] = 3990283813501477166L;
        gx.fmrq[251] = 8870065664443714629L;
        gx.fmrq[252] = 6416171102677496386L;
        gx.fmrq[253] = 2714508943642267133L;
        gx.fmrq[254] = 3471276404106038699L;
        gx.fmrq[255] = 4984255589696838743L;
        gx.fmrq[256] = -8949748513675741121L;
        gx.fmrq[257] = 989836994945961688L;
        gx.fmrq[258] = 7271745114007120942L;
        gx.fmrq[259] = 4895217540098982845L;
        gx.fmrq[260] = -745749426775389150L;
        gx.fmrq[261] = -790129212393841933L;
        gx.fmrq[262] = -8092042339958984960L;
        gx.fmrq[263] = 7880852296132927772L;
        gx.fmrq[264] = -8224308658859140327L;
        gx.fmrq[265] = -4244469345514568387L;
        gx.fmrq[266] = -3754833862572366220L;
        gx.fmrq[267] = -7415580809342781559L;
        gx.fmrq[268] = -4656973307906167214L;
        gx.fmrq[269] = -9058270983862971741L;
        gx.fmrq[270] = -7441799339375036792L;
        gx.fmrq[271] = 7643057850215190895L;
        gx.fmrq[272] = -8375850641373857374L;
        gx.fmrq[273] = 8476906196172654788L;
        gx.fmrq[274] = 6130854205673480510L;
        gx.fmrq[275] = 1598898526943077402L;
        gx.fmrq[276] = -8259073329031066426L;
        gx.fmrq[277] = 1841059222399864366L;
        gx.fmrq[278] = 5570314440393938708L;
        gx.fmrq[279] = -7543634872559187827L;
        gx.fmrq[280] = -4915856869486853765L;
        gx.fmrq[281] = 8400133010373058302L;
        gx.fmrq[282] = -5795847244565443572L;
        gx.fmrq[283] = -7734582736175196601L;
        gx.fmrq[284] = -8227083264892115839L;
        gx.fmrq[285] = 2581718369168419056L;
        gx.fmrq[286] = 9067409251219424679L;
        gx.fmrq[287] = 1315973042163954363L;
        gx.fmrq[288] = 5146874644796756632L;
        gx.fmrq[289] = -616522666153271313L;
        gx.fmrq[290] = 6715426224315765271L;
        gx.fmrq[291] = -705991725975461462L;
        gx.fmrq[292] = 4789195619134046826L;
        gx.fmrq[293] = -6325841556856698317L;
        gx.fmrq[294] = 3582783657836061989L;
        gx.fmrq[295] = 5292116217378763716L;
        gx.fmrq[296] = -2396916095607530935L;
        gx.fmrq[297] = -3177836815884991453L;
        gx.fmrq[298] = 2969711796102636186L;
        gx.fmrq[299] = 3610198179505134014L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void reset(boolean var1_1) {
        block81: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("frac", fmrp(int ), (int)492)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gx.fmqp("frad", fmrd(int ), (int)1293)) break;
                v0 /* !! */  = (long)gx.fmqp("frae", fmrd(int ), (int)1294);
            }
            var4_2 = gx.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fraf", fmrp(int ), (int)493)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == gx.fmqp("frag", fmrd(int ), (int)1295)) break;
                v1 /* !! */  = (long)gx.fmqp("frai", fmrd(int ), (int)1296);
            }
            var3_3 /* !! */  = gx.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fraj", fmrp(int ), (int)494)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == gx.fmqp("fran", fmrd(int ), (int)1297)) break;
                v2 /* !! */  = (long)gx.fmqp("frao", fmrd(int ), (int)1298);
            }
            var2_4 = gx.a;
            if (var4_2) {
                throw null;
lbl21:
                // 11 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl21
            if (!var1_1) break block81;
            if (var2_4 || var2_4) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fraq", fmrp(int ), (int)495)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gx.fmqp("fras", fmrd(int ), (int)1299)) break;
                v3 /* !! */  = (long)gx.fmqp("frau", fmrd(int ), (int)1300);
            }
            this.stopOwnedExploit();
            if (var2_4) ** GOTO lbl21
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl-1000
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        v4 = gx.fmqp("fraw", fmrd(int ), (int)1301);
        v5 /* !! */  = gx.mq;
        if (true) ** GOTO lbl43
        block53: while (true) {
            v5 /* !! */  = (long)(v6 - gx.fmqp("fray", fmrp(int ), (int)496));
lbl43:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -795575196: {
                    v6 = gx.fmqp("frba", fmrp(int ), (int)497);
                    continue block53;
                }
                case 970696710: {
                    v6 = gx.fmqp("frbc", fmrp(int ), (int)498);
                    continue block53;
                }
                case 1461008885: {
                    break block53;
                }
            }
            break;
        }
        this.ownsExploit = v4;
        if (var2_4 || var2_4) ** GOTO lbl21
        v7 /* !! */  = gx.mq;
        if (true) ** GOTO lbl58
        block54: while (true) {
            v7 /* !! */  = (long)(v8 - gx.fmqp("frbf", fmrp(int ), (int)499));
lbl58:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1328820836: {
                    v8 = gx.fmqp("frbh", fmrp(int ), (int)500);
                    continue block54;
                }
                case -696678526: {
                    v8 = gx.fmqp("frbj", fmrp(int ), (int)501);
                    continue block54;
                }
                case 865566279: {
                    v8 = gx.fmqp("frbk", fmrp(int ), (int)502);
                    continue block54;
                }
                case 1461008885: {
                    break block54;
                }
            }
            break;
        }
        this.routePosition = null;
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("frbm", fmrp(int ), (int)503)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gx.fmqp("frbo", fmrd(int ), (int)1302)) break;
                    v9 /* !! */  = (long)gx.fmqp("frbr", fmrd(int ), (int)1303);
                }
                v10 /* !! */  = gx.mq;
                if (true) ** GOTO lbl85
                block56: while (true) {
                    v10 /* !! */  = (long)(gx.fmqp("frbu", fmrp(int ), (int)505) - gx.fmqp("frbs", fmrp(int ), (int)504));
lbl85:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1962124147: {
                            continue block56;
                        }
                        case 1461008885: {
                            break block56;
                        }
                    }
                    break;
                }
                this.healthSnapshots.clear();
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("frbx", fmrp(int ), (int)506)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == gx.fmqp("frby", fmrd(int ), (int)1304)) break;
                    v11 /* !! */  = (long)gx.fmqp("frbz", fmrd(int ), (int)1305);
                }
                this.clearTarget();
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = gx.mq - gx.fmqp("frcc", fmrp(int ), (int)507)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gx.fmqp("frcd", fmrd(int ), (int)1306)) break;
                    v12 /* !! */  = (long)gx.fmqp("frcf", fmrd(int ), (int)1307);
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_7 = gx.mq - gx.fmqp("frch", fmrp(int ), (int)508)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gx.fmqp("frci", fmrd(int ), (int)1308)) break;
                    v13 /* !! */  = (long)gx.fmqp("frcj", fmrd(int ), (int)1309);
                }
                this.state = gx$State.WATCHING;
                if (var2_4 || var2_4) ** GOTO lbl21
                v14 /* !! */  = gx.mq;
                if (true) ** GOTO lbl115
                block60: while (true) {
                    v14 /* !! */  = (long)(gx.fmqp("frcs", fmrp(int ), (int)510) - gx.fmqp("frck", fmrp(int ), (int)509));
lbl115:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 1428935181: {
                            continue block60;
                        }
                        case 1461008885: {
                            break block60;
                        }
                    }
                    break;
                }
                v15 = System.currentTimeMillis();
                v16 /* !! */  = gx.mq;
                if (true) ** GOTO lbl125
                block61: while (true) {
                    v16 /* !! */  = (long)(gx.fmqp("frcu", fmrp(int ), (int)512) - gx.fmqp("frct", fmrp(int ), (int)511));
lbl125:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1511892399: {
                            continue block61;
                        }
                        case 1461008885: {
                            break block61;
                        }
                    }
                    break;
                }
                this.stateSince = v15;
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)gx.fmqp("frcw", fmrd(int ), (int)1310);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 1: {
                var3_3 /* !! */  = (int)gx.fmqp("frcy", fmrd(int ), (int)1311);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl149
            }
            case 2: {
                var3_3 /* !! */  = (int)gx.fmqp("frda", fmrd(int ), (int)1312);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl149:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)gx.fmqp("frde", fmrd(int ), (int)1313);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl154:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)gx.fmqp("frdf", fmrd(int ), (int)1314);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl159:
            // 4 sources

            case 5: {
                var3_3 /* !! */  = (int)gx.fmqp("frdh", fmrd(int ), (int)1315);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl164:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)gx.fmqp("frdk", fmrd(int ), (int)1316);
                if (!var4_2) ** GOTO lbl159
                throw null;
            }
lbl168:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)gx.fmqp("frdm", fmrd(int ), (int)1317);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl173:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)gx.fmqp("frdo", fmrd(int ), (int)1318);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 9: {
                var3_3 /* !! */  = (int)gx.fmqp("frdq", fmrd(int ), (int)1319);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 10: {
                var3_3 /* !! */  = (int)gx.fmqp("frdt", fmrd(int ), (int)1320);
                if (!var4_2) break;
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)gx.fmqp("frdv", fmrd(int ), (int)1321);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl229
                    break;
                }
            }
            case 12: {
                var3_3 /* !! */  = (int)gx.fmqp("frdx", fmrd(int ), (int)1322);
                if (!var4_2) ** GOTO lbl154
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)gx.fmqp("frdz", fmrd(int ), (int)1323);
                if (!var4_2) ** GOTO lbl173
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)gx.fmqp("frea", fmrd(int ), (int)1324);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
lbl205:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)gx.fmqp("freb", fmrd(int ), (int)1325);
                if (!var4_2) ** GOTO lbl159
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)gx.fmqp("frec", fmrd(int ), (int)1326);
                if (!var4_2) ** GOTO lbl149
                throw null;
            }
lbl213:
            // 4 sources

            case 17: {
                var3_3 /* !! */  = (int)gx.fmqp("freh", fmrd(int ), (int)1327);
                if (!var4_2) ** GOTO lbl159
                throw null;
            }
lbl217:
            // 3 sources

            case 18: {
                var3_3 /* !! */  = (int)gx.fmqp("frek", fmrd(int ), (int)1328);
                if (!var4_2) break;
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)gx.fmqp("frel", fmrd(int ), (int)1329);
                if (!var4_2) ** GOTO lbl213
                throw null;
            }
lbl225:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)gx.fmqp("frem", fmrd(int ), (int)1330);
                if (!var4_2) ** GOTO lbl213
                throw null;
            }
lbl229:
            // 3 sources

            case 21: {
                var3_3 /* !! */  = (int)gx.fmqp("fren", fmrd(int ), (int)1331);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
            case 22: 
        }
        var3_3 /* !! */  = (int)gx.fmqp("frep", fmrd(int ), (int)1332);
        ** while (!var4_2)
lbl236:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        v0 /* !! */  = gx.mq;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(gx.fmqp("fmrt", fmrp(int ), (int)1) - gx.fmqp("fmrs", fmrp(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -452881569: {
                    continue block27;
                }
                case 1461008885: {
                    break block27;
                }
            }
            break;
        }
        var3_1 = gx.c;
        v1 /* !! */  = gx.mq;
        if (true) ** GOTO lbl15
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - gx.fmqp("fmru", fmrp(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -583266390: {
                    v2 = gx.fmqp("fmrv", fmrp(int ), (int)3);
                    continue block28;
                }
                case -359424139: {
                    v2 = gx.fmqp("fmrw", fmrp(int ), (int)4);
                    continue block28;
                }
                case 1461008885: {
                    break block28;
                }
                case 1542283227: {
                    v2 = gx.fmqp("fmrx", fmrp(int ), (int)5);
                    continue block28;
                }
            }
            break;
        }
        var2_2 /* !! */  = gx.b;
        v3 /* !! */  = gx.mq;
        if (true) ** GOTO lbl32
        block29: while (true) {
            v3 /* !! */  = (long)(v4 - gx.fmqp("fmry", fmrp(int ), (int)6));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1860684282: {
                    v4 = gx.fmqp("fmrz", fmrp(int ), (int)7);
                    continue block29;
                }
                case -675080684: {
                    v4 = gx.fmqp("fmsa", fmrp(int ), (int)8);
                    continue block29;
                }
                case 1461008885: {
                    break block29;
                }
            }
            break;
        }
        var1_3 = gx.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 = gx.fmqp("fmsb", fmrd(int ), (int)24);
                v6 /* !! */  = gx.mq;
                if (true) ** GOTO lbl55
                block31: while (true) {
                    v6 /* !! */  = (long)(gx.fmqp("fmsd", fmrp(int ), (int)10) - gx.fmqp("fmsc", fmrp(int ), (int)9));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 1461008885: {
                            break block31;
                        }
                        case 1782420335: {
                            continue block31;
                        }
                    }
                    break;
                }
                this.reset((boolean)v5);
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gx.fmqp("fmse", fmrd(int ), (int)25);
                if (!var3_1) break;
                throw null;
            }
lbl67:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)gx.fmqp("fmsf", fmrd(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl72:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gx.fmqp("fmsg", fmrd(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gx.fmqp("fmsh", fmrd(int ), (int)28);
                    if (!var3_1) ** GOTO lbl67
                    throw null;
                }
            }
lbl82:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)gx.fmqp("fmsi", fmrd(int ), (int)29);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)gx.fmqp("fmsj", fmrd(int ), (int)30);
        ** while (!var3_1)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private class_1657 findFightCandidate(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[CASE]], but top level block is 44[DOLOOP]
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handleMissingTarget(long var1_1) {
        block92: {
            v0 /* !! */  = gx.mq;
            if (true) ** GOTO lbl5
            block59: while (true) {
                v0 /* !! */  = (long)(v1 - gx.fmqp("fnoy", fmrp(int ), (int)62));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 376631295: {
                        v1 = gx.fmqp("fnpa", fmrp(int ), (int)63);
                        continue block59;
                    }
                    case 1461008885: {
                        break block59;
                    }
                    case 1673737960: {
                        v1 = gx.fmqp("fnpb", fmrp(int ), (int)64);
                        continue block59;
                    }
                }
                break;
            }
            var6_2 = gx.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fnpc", fmrp(int ), (int)65)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == gx.fmqp("fnpd", fmrd(int ), (int)420)) break;
                v2 /* !! */  = (long)gx.fmqp("fnpg", fmrd(int ), (int)421);
            }
            var5_3 /* !! */  = gx.b;
            v3 /* !! */  = gx.mq;
            if (true) ** GOTO lbl25
            block61: while (true) {
                v3 /* !! */  = (long)(v4 - gx.fmqp("fnph", fmrp(int ), (int)66));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -904525338: {
                        v4 = gx.fmqp("fnpi", fmrp(int ), (int)67);
                        continue block61;
                    }
                    case 887774333: {
                        v4 = gx.fmqp("fnpj", fmrp(int ), (int)68);
                        continue block61;
                    }
                    case 1461008885: {
                        break block61;
                    }
                    case 1726907520: {
                        v4 = gx.fmqp("fnpk", fmrp(int ), (int)69);
                        continue block61;
                    }
                }
                break;
            }
            var4_4 = gx.a;
            if (var6_2) {
                throw null;
lbl40:
                // 12 sources

                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl40
            v5 /* !! */  = gx.mq;
            if (true) ** GOTO lbl47
            block63: while (true) {
                v5 /* !! */  = (long)(gx.fmqp("fnpn", fmrp(int ), (int)71) - gx.fmqp("fnpm", fmrp(int ), (int)70));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1416390069: {
                        continue block63;
                    }
                    case 1461008885: {
                        break block63;
                    }
                }
                break;
            }
            v6 = gx.fmqp("fnpp", fmxg(int ), (int)72);
            v7 /* !! */  = gx.mq;
            if (true) ** GOTO lbl57
            block64: while (true) {
                v7 /* !! */  = (long)(gx.fmqp("fnpr", fmrp(int ), (int)74) - gx.fmqp("fnpq", fmrp(int ), (int)73));
lbl57:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1937454151: {
                        continue block64;
                    }
                    case 1461008885: {
                        break block64;
                    }
                }
                break;
            }
            var3_5 = this.findBestLoot(this.watchedPosition, (double)v6);
            if (var4_4 || var4_4) ** GOTO lbl40
            if (var3_5 == null) break block92;
            if (var4_4 || var4_4) ** GOTO lbl40
            v8 /* !! */  = gx.mq;
            if (true) ** GOTO lbl70
            block65: while (true) {
                v8 /* !! */  = (long)(gx.fmqp("fnpt", fmrp(int ), (int)76) - gx.fmqp("fnps", fmrp(int ), (int)75));
lbl70:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -849006670: {
                        continue block65;
                    }
                    case 1461008885: {
                        break block65;
                    }
                }
                break;
            }
            this.beginLootApproach(var3_5, var1_1, "\u0434\u0440\u043e\u043f \u0446\u0435\u043b\u0438 \u043f\u043e\u044f\u0432\u0438\u043b\u0441\u044f");
            if (var4_4 || var4_4) ** GOTO lbl40
            return;
        }
        if (var4_4) ** GOTO lbl40
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl40
                v9 /* !! */  = gx.mq;
                if (true) ** GOTO lbl88
                block66: while (true) {
                    v9 /* !! */  = (long)(v10 - gx.fmqp("fnpu", fmrp(int ), (int)77));
lbl88:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 606158270: {
                            v10 = gx.fmqp("fnpv", fmrp(int ), (int)78);
                            continue block66;
                        }
                        case 810483746: {
                            v10 = gx.fmqp("fnpy", fmrp(int ), (int)79);
                            continue block66;
                        }
                        case 1049664826: {
                            v10 = gx.fmqp("fnpz", fmrp(int ), (int)80);
                            continue block66;
                        }
                        case 1461008885: {
                            break block66;
                        }
                    }
                    break;
                }
                if (this.targetLostAt != gx.fmqp("fnqb", fmrp(int ), (int)81)) ** GOTO lbl109
                if (var4_4 || var4_4) ** GOTO lbl40
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fnqc", fmrp(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == gx.fmqp("fnqd", fmrd(int ), (int)422)) break;
                    v11 /* !! */  = (long)gx.fmqp("fnqg", fmrd(int ), (int)423);
                }
                this.targetLostAt = var1_1;
                if (var4_4) ** GOTO lbl40
lbl109:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl40
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fnqi", fmrp(int ), (int)83)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gx.fmqp("fnqj", fmrd(int ), (int)424)) break;
                    v12 /* !! */  = (long)gx.fmqp("fnqk", fmrd(int ), (int)425);
                }
                if (var1_1 - this.targetLostAt < gx.fmqp("fnqm", fmrp(int ), (int)84)) ** GOTO lbl132
                if (var4_4 || var4_4) ** GOTO lbl40
                v13 /* !! */  = gx.mq;
                if (true) ** GOTO lbl121
                block69: while (true) {
                    v13 /* !! */  = (long)(v14 - gx.fmqp("fnqn", fmrp(int ), (int)85));
lbl121:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1111027450: {
                            v14 = gx.fmqp("fnqo", fmrp(int ), (int)86);
                            continue block69;
                        }
                        case -770220224: {
                            v14 = gx.fmqp("fnqp", fmrp(int ), (int)87);
                            continue block69;
                        }
                        case 1461008885: {
                            break block69;
                        }
                    }
                    break;
                }
                this.abortWatchedTarget();
                if (var4_4) ** GOTO lbl40
lbl132:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)gx.fmqp("fnqq", fmrd(int ), (int)426);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 1: {
                var5_3 /* !! */  = (int)gx.fmqp("fnqs", fmrd(int ), (int)427);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl145:
            // 4 sources

            case 2: {
                var5_3 /* !! */  = (int)gx.fmqp("fnqt", fmrd(int ), (int)428);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl150:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)gx.fmqp("fnqu", fmrd(int ), (int)429);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl155:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)gx.fmqp("fnqv", fmrd(int ), (int)430);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
lbl159:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)gx.fmqp("fnqw", fmrd(int ), (int)431);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl164:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)gx.fmqp("fnqz", fmrd(int ), (int)432);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 7: {
                var5_3 /* !! */  = (int)gx.fmqp("fnra", fmrd(int ), (int)433);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 8: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrb", fmrd(int ), (int)434);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
lbl178:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrc", fmrd(int ), (int)435);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 10: {
                var5_3 /* !! */  = (int)gx.fmqp("fnre", fmrd(int ), (int)436);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl188:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrf", fmrd(int ), (int)437);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 12: {
                var5_3 /* !! */  = (int)gx.fmqp("fnri", fmrd(int ), (int)438);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 13: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrj", fmrd(int ), (int)439);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl203:
            // 3 sources

            case 14: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrk", fmrd(int ), (int)440);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
lbl207:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrl", fmrd(int ), (int)441);
                if (!var6_2) ** GOTO lbl164
                throw null;
            }
lbl211:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrn", fmrd(int ), (int)442);
                if (!var6_2) ** GOTO lbl155
                throw null;
            }
lbl215:
            // 2 sources

            case 17: {
                var5_3 /* !! */  = (int)gx.fmqp("fnro", fmrd(int ), (int)443);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
lbl219:
            // 3 sources

            case 18: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrp", fmrd(int ), (int)444);
                if (!var6_2) ** GOTO lbl211
                throw null;
            }
lbl223:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrq", fmrd(int ), (int)445);
                if (!var6_2) ** GOTO lbl178
                throw null;
            }
            case 20: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrs", fmrd(int ), (int)446);
                if (!var6_2) ** GOTO lbl150
                throw null;
            }
lbl231:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)gx.fmqp("fnrt", fmrd(int ), (int)447);
                if (!var6_2) ** GOTO lbl215
                throw null;
            }
            case 22: 
        }
        do {
            var5_3 /* !! */  = (int)gx.fmqp("fnru", fmrd(int ), (int)448);
        } while (!var6_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void beginEscape(long var1_1) {
        block117: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fnwm", fmrp(int ), (int)127)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == gx.fmqp("fnwn", fmrd(int ), (int)491)) break;
                v0 /* !! */  = (long)gx.fmqp("fnwo", fmrd(int ), (int)492);
            }
            var13_2 = gx.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fnwp", fmrp(int ), (int)128)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == gx.fmqp("fnwq", fmrd(int ), (int)493)) break;
                v1 /* !! */  = (long)gx.fmqp("fnwt", fmrd(int ), (int)494);
            }
            var12_3 /* !! */  = gx.b;
            v2 /* !! */  = gx.mq;
            if (true) ** GOTO lbl17
            block79: while (true) {
                v2 /* !! */  = (long)(v3 - gx.fmqp("fnwu", fmrp(int ), (int)129));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -919217611: {
                        v3 = gx.fmqp("fnwv", fmrp(int ), (int)130);
                        continue block79;
                    }
                    case -261561393: {
                        v3 = gx.fmqp("fnwx", fmrp(int ), (int)131);
                        continue block79;
                    }
                    case 1461008885: {
                        break block79;
                    }
                }
                break;
            }
            var11_4 = gx.a;
            if (var13_2) {
                throw null;
lbl29:
                // 12 sources

                return;
            }
            if (var11_4 || var11_4) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fnwy", fmrp(int ), (int)132)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == gx.fmqp("fnwz", fmrd(int ), (int)495)) break;
                v4 /* !! */  = (long)gx.fmqp("fnxa", fmrd(int ), (int)496);
            }
            if (this.hasCollectedLoot()) break block117;
            if (var11_4 || var11_4) ** GOTO lbl29
            return;
        }
        if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_4 || var11_4) ** GOTO lbl29
                v5 /* !! */  = gx.mq;
                if (true) ** GOTO lbl49
                block82: while (true) {
                    v5 /* !! */  = (long)(v6 - gx.fmqp("fnxd", fmrp(int ), (int)133));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 211002813: {
                            v6 = gx.fmqp("fnxe", fmrp(int ), (int)134);
                            continue block82;
                        }
                        case 1266113966: {
                            v6 = gx.fmqp("fnxf", fmrp(int ), (int)135);
                            continue block82;
                        }
                        case 1461008885: {
                            break block82;
                        }
                    }
                    break;
                }
                v7 = ThreadLocalRandom.current();
                v8 = gx.fmqp("fnxh", fmxg(int ), (int)136);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fnxi", fmrp(int ), (int)137)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == gx.fmqp("fnxj", fmrd(int ), (int)497)) break;
                    v9 /* !! */  = (long)gx.fmqp("fnxk", fmrd(int ), (int)498);
                }
                var3_5 = v7.nextDouble((double)v8);
                if (var11_4 || var11_4) ** GOTO lbl29
                v10 /* !! */  = gx.mq;
                if (true) ** GOTO lbl71
                block84: while (true) {
                    v10 /* !! */  = (long)(gx.fmqp("fnxn", fmrp(int ), (int)139) - gx.fmqp("fnxm", fmrp(int ), (int)138));
lbl71:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -223186828: {
                            continue block84;
                        }
                        case 1461008885: {
                            break block84;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fnxo", fmrp(int ), (int)140)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == gx.fmqp("fnxq", fmrd(int ), (int)499)) break;
                    v11 /* !! */  = (long)gx.fmqp("fnxr", fmrd(int ), (int)500);
                }
                var5_6 = this.escapeDistance.getValue();
                if (var11_4 || var11_4) ** GOTO lbl29
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fnxs", fmrp(int ), (int)141)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == gx.fmqp("fnxv", fmrd(int ), (int)501)) break;
                    v12 /* !! */  = (long)gx.fmqp("fnxw", fmrd(int ), (int)502);
                }
                v13 = ThreadLocalRandom.current();
                v14 = var5_6 * gx.fmqp("fnxx", fmxg(int ), (int)142);
                v15 = var5_6 * gx.fmqp("fnxy", fmxg(int ), (int)143);
                v16 /* !! */  = gx.mq;
                if (true) ** GOTO lbl95
                block87: while (true) {
                    v16 /* !! */  = (long)(gx.fmqp("fnyb", fmrp(int ), (int)145) - gx.fmqp("fnya", fmrp(int ), (int)144));
lbl95:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1992908971: {
                            continue block87;
                        }
                        case 1461008885: {
                            break block87;
                        }
                    }
                    break;
                }
                var7_7 = v13.nextDouble(v14, v15);
                if (var11_4 || var11_4) ** GOTO lbl29
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = gx.mq - gx.fmqp("fnyc", fmrp(int ), (int)146)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == gx.fmqp("fnyf", fmrd(int ), (int)503)) break;
                    v17 /* !! */  = (long)gx.fmqp("fnyg", fmrd(int ), (int)504);
                }
                v18 /* !! */  = gx.mq;
                if (true) ** GOTO lbl111
                block89: while (true) {
                    v18 /* !! */  = (long)(v19 - gx.fmqp("fnyh", fmrp(int ), (int)147));
lbl111:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1404107204: {
                            v19 = gx.fmqp("fnyj", fmrp(int ), (int)148);
                            continue block89;
                        }
                        case -1115603629: {
                            v19 = gx.fmqp("fnyk", fmrp(int ), (int)149);
                            continue block89;
                        }
                        case 1461008885: {
                            break block89;
                        }
                    }
                    break;
                }
                v20 = gx.mc.field_1724;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_7 = gx.mq - gx.fmqp("fnyl", fmrp(int ), (int)150)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == gx.fmqp("fnym", fmrd(int ), (int)505)) break;
                    v21 /* !! */  = (long)gx.fmqp("fnys", fmrd(int ), (int)506);
                }
                var9_8 = v20.method_73189();
                if (var11_4 || var11_4) ** GOTO lbl29
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_8 = gx.mq - gx.fmqp("fnyw", fmrp(int ), (int)151)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == gx.fmqp("fnza", fmrd(int ), (int)507)) break;
                    v22 /* !! */  = (long)gx.fmqp("fnzd", fmrd(int ), (int)508);
                }
                v23 = Math.cos(var3_5) * var7_7;
                v24 /* !! */  = gx.mq;
                if (true) ** GOTO lbl138
                block92: while (true) {
                    v24 /* !! */  = (long)(v25 - gx.fmqp("fnze", fmrp(int ), (int)152));
lbl138:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1096687687: {
                            v25 = gx.fmqp("fnzg", fmrp(int ), (int)153);
                            continue block92;
                        }
                        case -310532011: {
                            v25 = gx.fmqp("fnzk", fmrp(int ), (int)154);
                            continue block92;
                        }
                        case 1029406775: {
                            v25 = gx.fmqp("fnzp", fmrp(int ), (int)155);
                            continue block92;
                        }
                        case 1461008885: {
                            break block92;
                        }
                    }
                    break;
                }
                v26 = Math.sin(var3_5) * var7_7;
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = gx.mq - gx.fmqp("fnzq", fmrp(int ), (int)156)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == gx.fmqp("fnzv", fmrd(int ), (int)509)) break;
                    v27 /* !! */  = (long)gx.fmqp("fnzy", fmrd(int ), (int)510);
                }
                var10_9 = var9_8.method_1031(v23, 0.0, v26);
                if (var11_4 || var11_4) ** GOTO lbl29
                v28 /* !! */  = gx.mq;
                if (true) ** GOTO lbl162
                block94: while (true) {
                    v28 /* !! */  = (long)(gx.fmqp("foad", fmrp(int ), (int)158) - gx.fmqp("foab", fmrp(int ), (int)157));
lbl162:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 987032949: {
                            continue block94;
                        }
                        case 1461008885: {
                            break block94;
                        }
                    }
                    break;
                }
                this.startExploit(var10_9, var1_1);
                if (var11_4 || var11_4) ** GOTO lbl29
                v29 = var1_1 + gx.fmqp("foah", fmrp(int ), (int)159);
                v30 /* !! */  = gx.mq;
                if (true) ** GOTO lbl174
                block95: while (true) {
                    v30 /* !! */  = (long)(gx.fmqp("foaq", fmrp(int ), (int)161) - gx.fmqp("foan", fmrp(int ), (int)160));
lbl174:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 1461008885: {
                            break block95;
                        }
                        case 1463164520: {
                            continue block95;
                        }
                    }
                    break;
                }
                this.spawnAt = v29;
                if (var11_4 || var11_4) ** GOTO lbl29
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_10 = gx.mq - gx.fmqp("foau", fmrp(int ), (int)162)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == gx.fmqp("foaw", fmrd(int ), (int)511)) break;
                    v31 /* !! */  = (long)gx.fmqp("foaz", fmrd(int ), (int)512);
                }
                v32 /* !! */  = gx.mq;
                if (true) ** GOTO lbl190
                block97: while (true) {
                    v32 /* !! */  = (long)(v33 - gx.fmqp("fobc", fmrp(int ), (int)163));
lbl190:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -868300832: {
                            v33 = gx.fmqp("fobh", fmrp(int ), (int)164);
                            continue block97;
                        }
                        case -606670364: {
                            v33 = gx.fmqp("fobm", fmrp(int ), (int)165);
                            continue block97;
                        }
                        case 1461008885: {
                            break block97;
                        }
                        case 1996747200: {
                            v33 = gx.fmqp("fobp", fmrp(int ), (int)166);
                            continue block97;
                        }
                    }
                    break;
                }
                this.state = gx$State.WAITING_SPAWN;
                if (var11_4 || var11_4) ** GOTO lbl29
                v34 /* !! */  = gx.mq;
                if (true) ** GOTO lbl208
                block98: while (true) {
                    v34 /* !! */  = (long)(v35 - gx.fmqp("fobs", fmrp(int ), (int)167));
lbl208:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -1812254775: {
                            v35 = gx.fmqp("fobu", fmrp(int ), (int)168);
                            continue block98;
                        }
                        case 1461008885: {
                            break block98;
                        }
                        case 1562610281: {
                            v35 = gx.fmqp("foby", fmrp(int ), (int)169);
                            continue block98;
                        }
                    }
                    break;
                }
                this.stateSince = var1_1;
                if (var11_4 || var11_4) ** continue;
                return;
            }
            case 0: {
                var12_3 /* !! */  = (int)gx.fmqp("focb", fmrd(int ), (int)513);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
lbl225:
            // 6 sources

            case 1: {
                var12_3 /* !! */  = (int)gx.fmqp("foch", fmrd(int ), (int)514);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl270
            }
lbl230:
            // 2 sources

            case 2: {
                do {
                    var12_3 /* !! */  = (int)gx.fmqp("focl", fmrd(int ), (int)515);
                } while (!var13_2);
                throw null;
            }
lbl235:
            // 4 sources

            case 3: {
                var12_3 /* !! */  = (int)gx.fmqp("focm", fmrd(int ), (int)516);
                if (!var13_2) break;
                throw null;
            }
lbl239:
            // 4 sources

            case 4: {
                var12_3 /* !! */  = (int)gx.fmqp("foco", fmrd(int ), (int)517);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl270
            }
            case 5: {
                var12_3 /* !! */  = (int)gx.fmqp("foct", fmrd(int ), (int)518);
                if (!var13_2) break;
                throw null;
            }
lbl248:
            // 2 sources

            case 6: {
                var12_3 /* !! */  = (int)gx.fmqp("focw", fmrd(int ), (int)519);
                if (!var13_2) ** GOTO lbl239
                throw null;
            }
            case 7: {
                var12_3 /* !! */  = (int)gx.fmqp("focy", fmrd(int ), (int)520);
                if (!var13_2) ** GOTO lbl239
                throw null;
            }
            case 8: {
                var12_3 /* !! */  = (int)gx.fmqp("fodg", fmrd(int ), (int)521);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl280
            }
            case 9: {
                var12_3 /* !! */  = (int)gx.fmqp("fodh", fmrd(int ), (int)522);
                if (!var13_2) ** GOTO lbl225
                throw null;
            }
            case 10: {
                var12_3 /* !! */  = (int)gx.fmqp("fodl", fmrd(int ), (int)523);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl270:
            // 4 sources

            case 11: {
                var12_3 /* !! */  = (int)gx.fmqp("fodp", fmrd(int ), (int)524);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl318
            }
            case 12: {
                var12_3 /* !! */  = (int)gx.fmqp("fodq", fmrd(int ), (int)525);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl280:
            // 2 sources

            case 13: {
                var12_3 /* !! */  = (int)gx.fmqp("fodr", fmrd(int ), (int)526);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl326
            }
            case 14: {
                var12_3 /* !! */  = (int)gx.fmqp("fods", fmrd(int ), (int)527);
                if (var13_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl290:
            // 2 sources

            case 15: {
                var12_3 /* !! */  = (int)gx.fmqp("foec", fmrd(int ), (int)528);
                if (!var13_2) ** GOTO lbl230
                throw null;
            }
            case 16: {
                var12_3 /* !! */  = (int)gx.fmqp("foeg", fmrd(int ), (int)529);
                if (!var13_2) ** GOTO lbl225
                throw null;
            }
            case 17: {
                var12_3 /* !! */  = (int)gx.fmqp("foej", fmrd(int ), (int)530);
                if (!var13_2) ** GOTO lbl235
                throw null;
            }
            case 18: {
                var12_3 /* !! */  = (int)gx.fmqp("foen", fmrd(int ), (int)531);
                if (!var13_2) ** GOTO lbl225
                throw null;
            }
lbl306:
            // 2 sources

            case 19: {
                var12_3 /* !! */  = (int)gx.fmqp("foer", fmrd(int ), (int)532);
                if (!var13_2) ** GOTO lbl270
                throw null;
            }
lbl310:
            // 2 sources

            case 20: {
                var12_3 /* !! */  = (int)gx.fmqp("foet", fmrd(int ), (int)533);
                if (!var13_2) ** GOTO lbl239
                throw null;
            }
            case 21: {
                var12_3 /* !! */  = (int)gx.fmqp("foey", fmrd(int ), (int)534);
                if (!var13_2) ** GOTO lbl235
                throw null;
            }
lbl318:
            // 2 sources

            case 22: {
                var12_3 /* !! */  = (int)gx.fmqp("fofg", fmrd(int ), (int)535);
                if (!var13_2) ** GOTO lbl235
                throw null;
            }
            case 23: {
                var12_3 /* !! */  = (int)gx.fmqp("fofl", fmrd(int ), (int)536);
                if (!var13_2) ** GOTO lbl248
                throw null;
            }
lbl326:
            // 2 sources

            case 24: {
                var12_3 /* !! */  = (int)gx.fmqp("fofp", fmrd(int ), (int)537);
                if (!var13_2) ** GOTO lbl225
                throw null;
            }
lbl330:
            // 2 sources

            case 25: {
                var12_3 /* !! */  = (int)gx.fmqp("fofs", fmrd(int ), (int)538);
                if (!var13_2) ** GOTO lbl225
                throw null;
            }
            case 26: 
        }
        do {
            var12_3 /* !! */  = (int)gx.fmqp("foft", fmrd(int ), (int)539);
        } while (!var13_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateApproaching(long var1_1) {
        block202: {
            block201: {
                block200: {
                    var8_2 = gx.c;
                    var7_3 /* !! */  = gx.b;
                    var6_4 = gx.a;
                    if (var8_2) {
                        throw null;
lbl6:
                        // 54 sources

                        return;
                    }
                    if (var6_4 || var6_4) ** GOTO lbl6
                    if (!this.hasCollectedLoot()) break block200;
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.beginEscape(var1_1);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    return;
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                var3_5 = this.trackedLootEntity();
                if (var6_4 || var6_4) ** GOTO lbl6
                if (var3_5 != null) break block201;
                if (var6_4 || var6_4) ** GOTO lbl6
                var3_5 = this.findBestLoot(this.watchedPosition, (double)gx.fmqp("fnbg", fmxg(int ), (int)33));
                if (var6_4 || var6_4) ** GOTO lbl6
                if (var3_5 == null) break block201;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.trackedLoot = var3_5.method_5667();
                if (var6_4) ** GOTO lbl6
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var3_5 == null) ** GOTO lbl61
            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.lootInventoryTracking) break block202;
            if (var6_4 || var6_4) ** GOTO lbl6
            this.beginInventoryTracking();
            if (var6_4 || var6_4) ** GOTO lbl6
            this.watchedPlayer = null;
            if (var6_4) ** GOTO lbl6
        }
        if (var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl6
                this.lastLootSeenAt = var1_1;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.watchedPosition = var3_5.method_73189();
                if (var6_4 || var6_4) ** GOTO lbl6
                this.finishLootPosition(var3_5);
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!(gx.mc.field_1724.method_5858((class_1297)var3_5) > 1.0)) ** GOTO lbl52
                if (var6_4 || var6_4) ** GOTO lbl6
                this.retargetExploit(this.watchedPosition, var1_1);
                if (var6_4) ** GOTO lbl6
lbl52:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                if (!(gx.mc.field_1724.method_5858((class_1297)var3_5) <= 1.0)) ** GOTO lbl59
                if (var6_4 || var6_4) ** GOTO lbl6
                this.state = gx$State.LOOTING;
                if (var6_4 || var6_4) ** GOTO lbl6
                this.stateSince = var1_1;
                if (var6_4) ** GOTO lbl6
lbl59:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                return;
            }
lbl61:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            var4_6 = this.watchedEntity();
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var4_6 == null) ** GOTO lbl110
            if (var6_4) ** GOTO lbl6
            if (!var4_6.method_5805()) ** GOTO lbl110
            if (var6_4 || var6_4) ** GOTO lbl6
            this.targetLostAt = (long)gx.fmqp("fnbn", fmrp(int ), (int)34);
            if (var6_4 || var6_4) ** GOTO lbl6
            this.watchedPosition = var4_6.method_73189();
            if (var6_4 || var6_4) ** GOTO lbl6
            var5_7 = np.total((class_1309)var4_6);
            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.hasTotemInHands(var4_6)) ** GOTO lbl78
            if (var6_4) ** GOTO lbl6
            if (this.isInActiveFight(var4_6, var1_1)) ** GOTO lbl82
            if (var6_4) ** GOTO lbl6
lbl78:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.abortWatchedTarget();
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl82:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (!(var5_7 > gx.fmqp("fnbr", fmqm(int ), (int)227))) ** GOTO lbl104
            if (var6_4 || var6_4) ** GOTO lbl6
            this.stopOwnedExploit();
            if (var6_4 || var6_4) ** GOTO lbl6
            this.lethalTicks = (int)gx.fmqp("fnbu", fmrd(int ), (int)228);
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var5_7 <= gx.fmqp("fnbw", fmqm(int ), (int)229)) {
                v0 = gx$State.ARMED;
                if (var8_2) {
                    throw null;
                }
            } else {
                v0 = this.state = gx$State.WATCHING;
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            if (this.state != gx$State.WATCHING) ** GOTO lbl100
            if (var6_4 || var6_4) ** GOTO lbl6
            this.clearTarget();
            if (var6_4) ** GOTO lbl6
lbl100:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.stateSince = var1_1;
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
lbl104:
            // 1 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.retargetExploit(this.watchedPosition, var1_1);
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var8_2) {
                throw null;
            }
            ** GOTO lbl113
lbl110:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            this.handleMissingTarget(var1_1);
            if (var6_4) ** GOTO lbl6
lbl113:
            // 2 sources

            if (var6_4 || var6_4) ** GOTO lbl6
            if (var1_1 - this.stateSince <= gx.fmqp("fnca", fmrp(int ), (int)35)) ** GOTO lbl118
            if (var6_4 || var6_4) ** GOTO lbl6
            this.abortWatchedTarget();
            if (var6_4) ** GOTO lbl6
lbl118:
            // 2 sources

            if (!var6_4 && !var6_4) ** break;
            ** continue;
            return;
lbl121:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)gx.fmqp("fncc", fmrd(int ), (int)230);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 1: {
                var7_3 /* !! */  = (int)gx.fmqp("fnce", fmrd(int ), (int)231);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl440
            }
lbl131:
            // 3 sources

            case 2: {
                var7_3 /* !! */  = (int)gx.fmqp("fnch", fmrd(int ), (int)232);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl536
            }
            case 3: {
                var7_3 /* !! */  = (int)gx.fmqp("fncj", fmrd(int ), (int)233);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 4: {
                var7_3 /* !! */  = (int)gx.fmqp("fnck", fmrd(int ), (int)234);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl146:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)gx.fmqp("fncl", fmrd(int ), (int)235);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl552
            }
lbl151:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)gx.fmqp("fncm", fmrd(int ), (int)236);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 7: {
                var7_3 /* !! */  = (int)gx.fmqp("fnco", fmrd(int ), (int)237);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl161:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)gx.fmqp("fncp", fmrd(int ), (int)238);
                if (!var8_2) ** GOTO lbl131
                throw null;
            }
            case 9: {
                var7_3 /* !! */  = (int)gx.fmqp("fncr", fmrd(int ), (int)239);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl170:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)gx.fmqp("fncv", fmrd(int ), (int)240);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl175:
            // 3 sources

            case 11: {
                var7_3 /* !! */  = (int)gx.fmqp("fncw", fmrd(int ), (int)241);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl524
            }
            case 12: {
                var7_3 /* !! */  = (int)gx.fmqp("fncx", fmrd(int ), (int)242);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl185:
            // 3 sources

            case 13: {
                var7_3 /* !! */  = (int)gx.fmqp("fncy", fmrd(int ), (int)243);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl190:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)gx.fmqp("fnda", fmrd(int ), (int)244);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl568
            }
lbl195:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)gx.fmqp("fndc", fmrd(int ), (int)245);
                if (!var8_2) break;
                throw null;
            }
lbl199:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)gx.fmqp("fnde", fmrd(int ), (int)246);
                if (!var8_2) ** GOTO lbl146
                throw null;
            }
            case 17: {
                var7_3 /* !! */  = (int)gx.fmqp("fndg", fmrd(int ), (int)247);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl552
            }
lbl208:
            // 3 sources

            case 18: {
                var7_3 /* !! */  = (int)gx.fmqp("fndi", fmrd(int ), (int)248);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl213:
            // 4 sources

            case 19: {
                var7_3 /* !! */  = (int)gx.fmqp("fndl", fmrd(int ), (int)249);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl218:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)gx.fmqp("fndm", fmrd(int ), (int)250);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 21: {
                var7_3 /* !! */  = (int)gx.fmqp("fndn", fmrd(int ), (int)251);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl478
            }
lbl228:
            // 2 sources

            case 22: {
                var7_3 /* !! */  = (int)gx.fmqp("fndo", fmrd(int ), (int)252);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl394
            }
lbl233:
            // 3 sources

            case 23: {
                var7_3 /* !! */  = (int)gx.fmqp("fndq", fmrd(int ), (int)253);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl544
            }
            case 24: {
                var7_3 /* !! */  = (int)gx.fmqp("fnds", fmrd(int ), (int)254);
                if (!var8_2) ** GOTO lbl175
                throw null;
            }
            case 25: {
                var7_3 /* !! */  = (int)gx.fmqp("fndu", fmrd(int ), (int)255);
                if (!var8_2) ** GOTO lbl131
                throw null;
            }
lbl246:
            // 2 sources

            case 26: {
                var7_3 /* !! */  = (int)gx.fmqp("fndx", fmrd(int ), (int)256);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 27: {
                var7_3 /* !! */  = (int)gx.fmqp("fndy", fmrd(int ), (int)257);
                if (!var8_2) ** GOTO lbl151
                throw null;
            }
lbl255:
            // 2 sources

            case 28: {
                var7_3 /* !! */  = (int)gx.fmqp("fndz", fmrd(int ), (int)258);
                if (var8_2) {
                    throw null;
                }
            }
            case 29: {
                var7_3 /* !! */  = (int)gx.fmqp("fnea", fmrd(int ), (int)259);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl448
            }
lbl264:
            // 2 sources

            case 30: {
                var7_3 /* !! */  = (int)gx.fmqp("fnec", fmrd(int ), (int)260);
                if (!var8_2) ** GOTO lbl208
                throw null;
            }
lbl268:
            // 2 sources

            case 31: {
                var7_3 /* !! */  = (int)gx.fmqp("fnee", fmrd(int ), (int)261);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl564
            }
lbl273:
            // 2 sources

            case 32: {
                var7_3 /* !! */  = (int)gx.fmqp("fneg", fmrd(int ), (int)262);
                if (!var8_2) ** GOTO lbl190
                throw null;
            }
lbl277:
            // 2 sources

            case 33: {
                var7_3 /* !! */  = (int)gx.fmqp("fnek", fmrd(int ), (int)263);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 34: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)gx.fmqp("fnel", fmrd(int ), (int)264);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl309
                    break;
                }
            }
            case 35: {
                var7_3 /* !! */  = (int)gx.fmqp("fnem", fmrd(int ), (int)265);
                if (!var8_2) ** GOTO lbl208
                throw null;
            }
lbl292:
            // 3 sources

            case 36: {
                var7_3 /* !! */  = (int)gx.fmqp("fneo", fmrd(int ), (int)266);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl568
            }
lbl297:
            // 3 sources

            case 37: {
                var7_3 /* !! */  = (int)gx.fmqp("fnep", fmrd(int ), (int)267);
                if (!var8_2) ** GOTO lbl277
                throw null;
            }
lbl301:
            // 6 sources

            case 38: {
                var7_3 /* !! */  = (int)gx.fmqp("fnes", fmrd(int ), (int)268);
                if (!var8_2) ** GOTO lbl218
                throw null;
            }
lbl305:
            // 2 sources

            case 39: {
                var7_3 /* !! */  = (int)gx.fmqp("fneu", fmrd(int ), (int)269);
                if (!var8_2) ** GOTO lbl233
                throw null;
            }
lbl309:
            // 3 sources

            case 40: {
                var7_3 /* !! */  = (int)gx.fmqp("fnex", fmrd(int ), (int)270);
                if (var8_2) {
                    throw null;
                }
            }
            case 41: {
                var7_3 /* !! */  = (int)gx.fmqp("fney", fmrd(int ), (int)271);
                if (!var8_2) ** GOTO lbl161
                throw null;
            }
lbl317:
            // 3 sources

            case 42: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfa", fmrd(int ), (int)272);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl544
            }
lbl322:
            // 2 sources

            case 43: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfc", fmrd(int ), (int)273);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl507
            }
lbl327:
            // 2 sources

            case 44: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfe", fmrd(int ), (int)274);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl342
            }
lbl332:
            // 3 sources

            case 45: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfg", fmrd(int ), (int)275);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl427
            }
lbl337:
            // 3 sources

            case 46: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfj", fmrd(int ), (int)276);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl427
            }
lbl342:
            // 2 sources

            case 47: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfl", fmrd(int ), (int)277);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
            case 48: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfn", fmrd(int ), (int)278);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl448
            }
lbl352:
            // 2 sources

            case 49: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfo", fmrd(int ), (int)279);
                if (!var8_2) ** GOTO lbl195
                throw null;
            }
            case 50: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfp", fmrd(int ), (int)280);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl564
            }
lbl361:
            // 2 sources

            case 51: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfq", fmrd(int ), (int)281);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl499
            }
            case 52: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfr", fmrd(int ), (int)282);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
            case 53: {
                var7_3 /* !! */  = (int)gx.fmqp("fnft", fmrd(int ), (int)283);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl520
            }
lbl376:
            // 2 sources

            case 54: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfv", fmrd(int ), (int)284);
                if (!var8_2) ** GOTO lbl322
                throw null;
            }
lbl380:
            // 2 sources

            case 55: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfx", fmrd(int ), (int)285);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl568
            }
            case 56: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfy", fmrd(int ), (int)286);
                if (!var8_2) ** GOTO lbl317
                throw null;
            }
            case 57: {
                var7_3 /* !! */  = (int)gx.fmqp("fnfz", fmrd(int ), (int)287);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl544
            }
lbl394:
            // 2 sources

            case 58: {
                var7_3 /* !! */  = (int)gx.fmqp("fnga", fmrd(int ), (int)288);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl448
            }
lbl399:
            // 3 sources

            case 59: {
                var7_3 /* !! */  = (int)gx.fmqp("fngc", fmrd(int ), (int)289);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl457
            }
lbl404:
            // 2 sources

            case 60: {
                var7_3 /* !! */  = (int)gx.fmqp("fnge", fmrd(int ), (int)290);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl520
            }
            case 61: {
                var7_3 /* !! */  = (int)gx.fmqp("fngg", fmrd(int ), (int)291);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl499
            }
            case 62: {
                var7_3 /* !! */  = (int)gx.fmqp("fngh", fmrd(int ), (int)292);
                if (!var8_2) ** GOTO lbl337
                throw null;
            }
            case 63: {
                var7_3 /* !! */  = (int)gx.fmqp("fngi", fmrd(int ), (int)293);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl487
            }
lbl423:
            // 3 sources

            case 64: {
                var7_3 /* !! */  = (int)gx.fmqp("fngj", fmrd(int ), (int)294);
                if (!var8_2) ** GOTO lbl199
                throw null;
            }
lbl427:
            // 4 sources

            case 65: {
                var7_3 /* !! */  = (int)gx.fmqp("fngl", fmrd(int ), (int)295);
                if (!var8_2) ** GOTO lbl255
                throw null;
            }
            case 66: {
                var7_3 /* !! */  = (int)gx.fmqp("fngn", fmrd(int ), (int)296);
                if (!var8_2) ** GOTO lbl185
                throw null;
            }
            case 67: {
                var7_3 /* !! */  = (int)gx.fmqp("fngo", fmrd(int ), (int)297);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl544
            }
lbl440:
            // 2 sources

            case 68: {
                var7_3 /* !! */  = (int)gx.fmqp("fngp", fmrd(int ), (int)298);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
lbl444:
            // 2 sources

            case 69: {
                var7_3 /* !! */  = (int)gx.fmqp("fngq", fmrd(int ), (int)299);
                if (!var8_2) ** GOTO lbl305
                throw null;
            }
lbl448:
            // 5 sources

            case 70: {
                var7_3 /* !! */  = (int)gx.fmqp("fngr", fmrd(int ), (int)300);
                if (!var8_2) ** GOTO lbl327
                throw null;
            }
            case 71: {
                var7_3 /* !! */  = (int)gx.fmqp("fngs", fmrd(int ), (int)301);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl548
            }
lbl457:
            // 2 sources

            case 72: {
                var7_3 /* !! */  = (int)gx.fmqp("fngt", fmrd(int ), (int)302);
                if (!var8_2) ** GOTO lbl444
                throw null;
            }
            case 73: {
                var7_3 /* !! */  = (int)gx.fmqp("fngv", fmrd(int ), (int)303);
                if (!var8_2) ** GOTO lbl427
                throw null;
            }
            case 74: {
                var7_3 /* !! */  = (int)gx.fmqp("fngw", fmrd(int ), (int)304);
                if (!var8_2) ** GOTO lbl301
                throw null;
            }
            case 75: {
                var7_3 /* !! */  = (int)gx.fmqp("fngx", fmrd(int ), (int)305);
                if (!var8_2) ** GOTO lbl337
                throw null;
            }
            case 76: {
                var7_3 /* !! */  = (int)gx.fmqp("fngy", fmrd(int ), (int)306);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl524
            }
lbl478:
            // 2 sources

            case 77: {
                var7_3 /* !! */  = (int)gx.fmqp("fngz", fmrd(int ), (int)307);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl515
            }
            case 78: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhb", fmrd(int ), (int)308);
                if (!var8_2) ** GOTO lbl297
                throw null;
            }
lbl487:
            // 2 sources

            case 79: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhc", fmrd(int ), (int)309);
                if (!var8_2) ** GOTO lbl301
                throw null;
            }
            case 80: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhd", fmrd(int ), (int)310);
                if (!var8_2) ** GOTO lbl301
                throw null;
            }
            case 81: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhe", fmrd(int ), (int)311);
                if (!var8_2) ** GOTO lbl309
                throw null;
            }
lbl499:
            // 4 sources

            case 82: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhg", fmrd(int ), (int)312);
                if (!var8_2) ** GOTO lbl376
                throw null;
            }
lbl503:
            // 2 sources

            case 83: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhh", fmrd(int ), (int)313);
                if (!var8_2) ** GOTO lbl213
                throw null;
            }
lbl507:
            // 2 sources

            case 84: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhi", fmrd(int ), (int)314);
                if (!var8_2) ** GOTO lbl317
                throw null;
            }
            case 85: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhj", fmrd(int ), (int)315);
                if (!var8_2) ** GOTO lbl301
                throw null;
            }
lbl515:
            // 2 sources

            case 86: {
                do {
                    var7_3 /* !! */  = (int)gx.fmqp("fnhk", fmrd(int ), (int)316);
                } while (!var8_2);
                throw null;
            }
lbl520:
            // 3 sources

            case 87: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhm", fmrd(int ), (int)317);
                if (!var8_2) ** GOTO lbl332
                throw null;
            }
lbl524:
            // 3 sources

            case 88: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhn", fmrd(int ), (int)318);
                if (!var8_2) ** GOTO lbl404
                throw null;
            }
            case 89: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhr", fmrd(int ), (int)319);
                if (!var8_2) ** GOTO lbl268
                throw null;
            }
            case 90: {
                var7_3 /* !! */  = (int)gx.fmqp("fnht", fmrd(int ), (int)320);
                if (!var8_2) ** GOTO lbl273
                throw null;
            }
lbl536:
            // 2 sources

            case 91: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhu", fmrd(int ), (int)321);
                if (!var8_2) ** GOTO lbl185
                throw null;
            }
            case 92: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhw", fmrd(int ), (int)322);
                if (!var8_2) ** GOTO lbl499
                throw null;
            }
lbl544:
            // 5 sources

            case 93: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhx", fmrd(int ), (int)323);
                if (!var8_2) ** GOTO lbl448
                throw null;
            }
lbl548:
            // 2 sources

            case 94: {
                var7_3 /* !! */  = (int)gx.fmqp("fnhz", fmrd(int ), (int)324);
                if (!var8_2) ** GOTO lbl264
                throw null;
            }
lbl552:
            // 3 sources

            case 95: {
                var7_3 /* !! */  = (int)gx.fmqp("fnia", fmrd(int ), (int)325);
                if (!var8_2) ** GOTO lbl161
                throw null;
            }
            case 96: {
                var7_3 /* !! */  = (int)gx.fmqp("fnic", fmrd(int ), (int)326);
                if (!var8_2) ** GOTO lbl380
                throw null;
            }
            case 97: {
                var7_3 /* !! */  = (int)gx.fmqp("fnie", fmrd(int ), (int)327);
                if (!var8_2) ** GOTO lbl361
                throw null;
            }
lbl564:
            // 3 sources

            case 98: {
                var7_3 /* !! */  = (int)gx.fmqp("fnif", fmrd(int ), (int)328);
                if (!var8_2) ** GOTO lbl503
                throw null;
            }
lbl568:
            // 4 sources

            case 99: {
                var7_3 /* !! */  = (int)gx.fmqp("fnih", fmrd(int ), (int)329);
                if (!var8_2) ** GOTO lbl399
                throw null;
            }
            case 100: 
        }
        var7_3 /* !! */  = (int)gx.fmqp("fnij", fmrd(int ), (int)330);
        ** while (!var8_2)
lbl575:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frvj() {
        gx.fmrq[300] = -3544181990022304749L;
        gx.fmrq[301] = -2476649589169792224L;
        gx.fmrq[302] = -1245430161748689925L;
        gx.fmrq[303] = -6311357267402527146L;
        gx.fmrq[304] = -5155383259081945381L;
        gx.fmrq[305] = -5879017151243370872L;
        gx.fmrq[306] = -6358074565372888886L;
        gx.fmrq[307] = 3702762718562532767L;
        gx.fmrq[308] = 5670926206801177216L;
        gx.fmrq[309] = -546782015885137681L;
        gx.fmrq[310] = -8529513132064655895L;
        gx.fmrq[311] = -3871939528335477577L;
        gx.fmrq[312] = -95551805220612206L;
        gx.fmrq[313] = -3984431587171095211L;
        gx.fmrq[314] = 1989766996026246562L;
        gx.fmrq[315] = 1068956005281792281L;
        gx.fmrq[316] = 3805431399027347486L;
        gx.fmrq[317] = -2352339391480309500L;
        gx.fmrq[318] = -1895183281742940597L;
        gx.fmrq[319] = -1370832186185318877L;
        gx.fmrq[320] = -185651250609343378L;
        gx.fmrq[321] = 1991631688615937977L;
        gx.fmrq[322] = 4890246113983477559L;
        gx.fmrq[323] = -1887791394677243494L;
        gx.fmrq[324] = -5361798124151663827L;
        gx.fmrq[325] = -6143577210398840027L;
        gx.fmrq[326] = 4230586281310442673L;
        gx.fmrq[327] = -769888871098316099L;
        gx.fmrq[328] = 3813751637805827319L;
        gx.fmrq[329] = 132423279654025741L;
        gx.fmrq[330] = 9115270257703909693L;
        gx.fmrq[331] = -8556644576705095368L;
        gx.fmrq[332] = 5640508292310912388L;
        gx.fmrq[333] = -2381817741871544742L;
        gx.fmrq[334] = -1822310046934547848L;
        gx.fmrq[335] = -5089301043398357838L;
        gx.fmrq[336] = 4418705181340448247L;
        gx.fmrq[337] = 6346178961896523468L;
        gx.fmrq[338] = -2587094324261994559L;
        gx.fmrq[339] = 883853236854675592L;
        gx.fmrq[340] = -1001817519280200543L;
        gx.fmrq[341] = -7978567002598569732L;
        gx.fmrq[342] = -7991140407113711605L;
        gx.fmrq[343] = -7617587020732890460L;
        gx.fmrq[344] = 8998914992955911626L;
        gx.fmrq[345] = 7867466291929652471L;
        gx.fmrq[346] = -3244778257421379455L;
        gx.fmrq[347] = 2898718555391360278L;
        gx.fmrq[348] = -526874418230690080L;
        gx.fmrq[349] = 8903796383051595171L;
        gx.fmrq[350] = -2012491174413088683L;
        gx.fmrq[351] = 5901110266183433720L;
        gx.fmrq[352] = -8863854008819915492L;
        gx.fmrq[353] = 4769795481712699043L;
        gx.fmrq[354] = 8452485271356354975L;
        gx.fmrq[355] = 3375794931536420733L;
        gx.fmrq[356] = 5062878733344378472L;
        gx.fmrq[357] = 1823521731289967585L;
        gx.fmrq[358] = 2481622869702819713L;
        gx.fmrq[359] = -7040014879061077837L;
        gx.fmrq[360] = -4247971364248302301L;
        gx.fmrq[361] = 4313274886070435765L;
        gx.fmrq[362] = -6868930902710496923L;
        gx.fmrq[363] = -1855111232005701384L;
        gx.fmrq[364] = 4001350742415040914L;
        gx.fmrq[365] = 1977384522157427015L;
        gx.fmrq[366] = 5155188966715536531L;
        gx.fmrq[367] = 1921343190776045973L;
        gx.fmrq[368] = 2275148587661950184L;
        gx.fmrq[369] = -47895433719255495L;
        gx.fmrq[370] = -8614004217277372704L;
        gx.fmrq[371] = 1575675685176748193L;
        gx.fmrq[372] = 460725750496011573L;
        gx.fmrq[373] = -8055109213378853825L;
        gx.fmrq[374] = -1662255766665623100L;
        gx.fmrq[375] = 3202127406658297150L;
        gx.fmrq[376] = 3719938154721699241L;
        gx.fmrq[377] = -4716161972776211580L;
        gx.fmrq[378] = 9191407050522253523L;
        gx.fmrq[379] = -1477006064285550784L;
        gx.fmrq[380] = 8681087063579337593L;
        gx.fmrq[381] = -3970197005741976247L;
        gx.fmrq[382] = -8626832915700914189L;
        gx.fmrq[383] = 212101491521393278L;
        gx.fmrq[384] = 5954439529117676678L;
        gx.fmrq[385] = -1004795264590448983L;
        gx.fmrq[386] = -5673934706363754116L;
        gx.fmrq[387] = 5851404432913134105L;
        gx.fmrq[388] = 6676778490095210306L;
        gx.fmrq[389] = -7393185687845930122L;
        gx.fmrq[390] = 5509780944505494004L;
        gx.fmrq[391] = -7858393516663459608L;
        gx.fmrq[392] = -8675792523581000365L;
        gx.fmrq[393] = 6344218557964249706L;
        gx.fmrq[394] = -2868725151602656461L;
        gx.fmrq[395] = -3281114661411066325L;
        gx.fmrq[396] = -3225324105907159261L;
        gx.fmrq[397] = -8732906701930545473L;
        gx.fmrq[398] = 4392134461492744765L;
        gx.fmrq[399] = -7310124882041314601L;
    }

    private static /* synthetic */ void frmz() {
        gx.fmqn[900] = 506748640;
        gx.fmqn[901] = 1580144415;
        gx.fmqn[902] = 1589628239;
        gx.fmqn[903] = 872302691;
        gx.fmqn[904] = 1878929033;
        gx.fmqn[905] = 727833181;
        gx.fmqn[906] = 1186106369;
        gx.fmqn[907] = -96661144;
        gx.fmqn[908] = 1062183428;
        gx.fmqn[909] = -1248272809;
        gx.fmqn[910] = 644388461;
        gx.fmqn[911] = -868467911;
        gx.fmqn[912] = 1904759213;
        gx.fmqn[913] = -490596712;
        gx.fmqn[914] = 332579166;
        gx.fmqn[915] = -1560884369;
        gx.fmqn[916] = -1545408827;
        gx.fmqn[917] = 689231931;
        gx.fmqn[918] = 82930494;
        gx.fmqn[919] = -913703957;
        gx.fmqn[920] = 40188149;
        gx.fmqn[921] = -475800216;
        gx.fmqn[922] = -852651025;
        gx.fmqn[923] = 783029888;
        gx.fmqn[924] = -1731343869;
        gx.fmqn[925] = 838308463;
        gx.fmqn[926] = -1629836105;
        gx.fmqn[927] = 779029030;
        gx.fmqn[928] = -1267158415;
        gx.fmqn[929] = -422147215;
        gx.fmqn[930] = 1744617941;
        gx.fmqn[931] = -1104112881;
        gx.fmqn[932] = -676510199;
        gx.fmqn[933] = -1333097980;
        gx.fmqn[934] = -988631383;
        gx.fmqn[935] = 560326223;
        gx.fmqn[936] = -854680242;
        gx.fmqn[937] = 770996715;
        gx.fmqn[938] = 1295237908;
        gx.fmqn[939] = -1923312954;
        gx.fmqn[940] = -493487709;
        gx.fmqn[941] = -314542652;
        gx.fmqn[942] = -1015889325;
        gx.fmqn[943] = 1790245557;
        gx.fmqn[944] = -667027320;
        gx.fmqn[945] = 1294269099;
        gx.fmqn[946] = 1723902566;
        gx.fmqn[947] = 619498570;
        gx.fmqn[948] = 845995685;
        gx.fmqn[949] = -447107152;
        gx.fmqn[950] = -688834904;
        gx.fmqn[951] = 1575748883;
        gx.fmqn[952] = -2013155669;
        gx.fmqn[953] = 1946900532;
        gx.fmqn[954] = 1764231631;
        gx.fmqn[955] = -1235279842;
        gx.fmqn[956] = 1643934038;
        gx.fmqn[957] = -2011496617;
        gx.fmqn[958] = 1005749700;
        gx.fmqn[959] = -1148701850;
        gx.fmqn[960] = -442453200;
        gx.fmqn[961] = 583683042;
        gx.fmqn[962] = 680663289;
        gx.fmqn[963] = -576336670;
        gx.fmqn[964] = 148671100;
        gx.fmqn[965] = -1608662418;
        gx.fmqn[966] = 1300710119;
        gx.fmqn[967] = -2122393579;
        gx.fmqn[968] = 921392419;
        gx.fmqn[969] = -2056598268;
        gx.fmqn[970] = -1438766657;
        gx.fmqn[971] = -746955709;
        gx.fmqn[972] = -1891271245;
        gx.fmqn[973] = -419248270;
        gx.fmqn[974] = 1585439748;
        gx.fmqn[975] = 2025351910;
        gx.fmqn[976] = 830721336;
        gx.fmqn[977] = -1607275914;
        gx.fmqn[978] = -513331941;
        gx.fmqn[979] = 1304948504;
        gx.fmqn[980] = 1211826164;
        gx.fmqn[981] = 337401378;
        gx.fmqn[982] = 1569524963;
        gx.fmqn[983] = -366918915;
        gx.fmqn[984] = -2040803921;
        gx.fmqn[985] = 580875990;
        gx.fmqn[986] = -278697608;
        gx.fmqn[987] = 203073935;
        gx.fmqn[988] = 1396356357;
        gx.fmqn[989] = -707766443;
        gx.fmqn[990] = 2116155950;
        gx.fmqn[991] = -655915522;
        gx.fmqn[992] = -1114505002;
        gx.fmqn[993] = 1526201483;
        gx.fmqn[994] = -217584610;
        gx.fmqn[995] = 1583804537;
        gx.fmqn[996] = -457976590;
        gx.fmqn[997] = 1168262684;
        gx.fmqn[998] = 2088662601;
        gx.fmqn[999] = 223517177;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void retargetExploit(class_243 var1_1, long var2_2) {
        block86: {
            block85: {
                block84: {
                    v0 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl5
                    block54: while (true) {
                        v0 /* !! */  = (long)(gx.fmqp("fqil", fmrp(int ), (int)392) - gx.fmqp("fqik", fmrp(int ), (int)391));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -1654070868: {
                                continue block54;
                            }
                            case 1461008885: {
                                break block54;
                            }
                        }
                        break;
                    }
                    var7_3 = gx.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fqim", fmrp(int ), (int)393)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == gx.fmqp("fqin", fmrd(int ), (int)1112)) break;
                        v1 /* !! */  = (long)gx.fmqp("fqio", fmrd(int ), (int)1113);
                    }
                    var6_4 /* !! */  = gx.b;
                    v2 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl21
                    block56: while (true) {
                        v2 /* !! */  = (long)(v3 - gx.fmqp("fqip", fmrp(int ), (int)394));
lbl21:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -233575995: {
                                v3 = gx.fmqp("fqiq", fmrp(int ), (int)395);
                                continue block56;
                            }
                            case 179426567: {
                                v3 = gx.fmqp("fqir", fmrp(int ), (int)396);
                                continue block56;
                            }
                            case 1461008885: {
                                break block56;
                            }
                        }
                        break;
                    }
                    var5_5 = gx.a;
                    if (var7_3) {
                        throw null;
lbl33:
                        // 13 sources

                        return;
                    }
                    if (var5_5 || var5_5) ** GOTO lbl33
                    if (var1_1 == null) break block84;
                    if (var5_5) ** GOTO lbl33
                    v4 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl42
                    block58: while (true) {
                        v4 /* !! */  = (long)(gx.fmqp("fqiv", fmrp(int ), (int)398) - gx.fmqp("fqis", fmrp(int ), (int)397));
lbl42:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -162159093: {
                                continue block58;
                            }
                            case 1461008885: {
                                break block58;
                            }
                        }
                        break;
                    }
                    if (var2_2 - this.lastRetargetAt >= gx.fmqp("fqiw", fmrp(int ), (int)399)) break block85;
                    if (var5_5) ** GOTO lbl33
                }
                if (var5_5 || var5_5) ** GOTO lbl33
                return;
            }
            if (var5_5 || var5_5) ** GOTO lbl33
            v5 /* !! */  = gx.mq;
            if (true) ** GOTO lbl58
            block59: while (true) {
                v5 /* !! */  = (long)(v6 - gx.fmqp("fqiz", fmrp(int ), (int)400));
lbl58:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1981624891: {
                        v6 = gx.fmqp("fqja", fmrp(int ), (int)401);
                        continue block59;
                    }
                    case 664671226: {
                        v6 = gx.fmqp("fqjc", fmrp(int ), (int)402);
                        continue block59;
                    }
                    case 1461008885: {
                        break block59;
                    }
                }
                break;
            }
            var4_6 = this.exploit();
            if (var5_5 || var5_5) ** GOTO lbl33
            v7 /* !! */  = gx.mq;
            if (true) ** GOTO lbl73
            block60: while (true) {
                v7 /* !! */  = (long)(v8 - gx.fmqp("fqjd", fmrp(int ), (int)403));
lbl73:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -2106395478: {
                        v8 = gx.fmqp("fqje", fmrp(int ), (int)404);
                        continue block60;
                    }
                    case -526776525: {
                        v8 = gx.fmqp("fqjg", fmrp(int ), (int)405);
                        continue block60;
                    }
                    case 471550117: {
                        v8 = gx.fmqp("fqjn", fmrp(int ), (int)406);
                        continue block60;
                    }
                    case 1461008885: {
                        break block60;
                    }
                }
                break;
            }
            if (this.routePosition == null) break block86;
            if (var5_5) ** GOTO lbl33
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fqjo", fmrp(int ), (int)407)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == gx.fmqp("fqjp", fmrd(int ), (int)1114)) break;
                v9 /* !! */  = (long)gx.fmqp("fqjq", fmrd(int ), (int)1115);
            }
            v10 /* !! */  = gx.mq;
            if (true) ** GOTO lbl96
            block62: while (true) {
                v10 /* !! */  = (long)(v11 - gx.fmqp("fqjt", fmrp(int ), (int)408));
lbl96:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -900838782: {
                        v11 = gx.fmqp("fqju", fmrp(int ), (int)409);
                        continue block62;
                    }
                    case -387768360: {
                        v11 = gx.fmqp("fqjv", fmrp(int ), (int)410);
                        continue block62;
                    }
                    case 945080070: {
                        v11 = gx.fmqp("fqjx", fmrp(int ), (int)411);
                        continue block62;
                    }
                    case 1461008885: {
                        break block62;
                    }
                }
                break;
            }
            if (this.routePosition.method_1025(var1_1) > gx.fmqp("fqjy", fmxg(int ), (int)412)) break block86;
            if (var5_5) ** GOTO lbl33
            if (var4_6 == null) break block86;
            if (var5_5) ** GOTO lbl33
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fqjz", fmrp(int ), (int)413)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == gx.fmqp("fqkb", fmrd(int ), (int)1116)) break;
                v12 /* !! */  = (long)gx.fmqp("fqkc", fmrd(int ), (int)1117);
            }
            if (var4_6.isActive()) ** GOTO lbl131
            if (var5_5) ** GOTO lbl33
        }
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5 || var5_5) ** GOTO lbl33
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fqke", fmrp(int ), (int)414)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gx.fmqp("fqkf", fmrd(int ), (int)1118)) break;
                    v13 /* !! */  = (long)gx.fmqp("fqkh", fmrd(int ), (int)1119);
                }
                this.startExploit(var1_1, var2_2);
                if (var5_5) ** GOTO lbl33
lbl131:
                // 2 sources

                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return;
            }
lbl134:
            // 3 sources

            case 0: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkj", fmrd(int ), (int)1120);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 1: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkk", fmrd(int ), (int)1121);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl144:
            // 2 sources

            case 2: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkl", fmrd(int ), (int)1122);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 3: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkm", fmrd(int ), (int)1123);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl154:
            // 4 sources

            case 4: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkn", fmrd(int ), (int)1124);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 5: {
                var6_4 /* !! */  = (int)gx.fmqp("fqko", fmrd(int ), (int)1125);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl164:
            // 2 sources

            case 6: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkp", fmrd(int ), (int)1126);
                if (!var7_3) ** GOTO lbl154
                throw null;
            }
            case 7: {
                do {
                    var6_4 /* !! */  = (int)gx.fmqp("fqkq", fmrd(int ), (int)1127);
                } while (!var7_3);
                throw null;
            }
lbl173:
            // 2 sources

            case 8: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkr", fmrd(int ), (int)1128);
                if (!var7_3) ** GOTO lbl134
                throw null;
            }
lbl177:
            // 2 sources

            case 9: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkt", fmrd(int ), (int)1129);
                if (!var7_3) ** GOTO lbl154
                throw null;
            }
lbl181:
            // 2 sources

            case 10: {
                var6_4 /* !! */  = (int)gx.fmqp("fqku", fmrd(int ), (int)1130);
                if (!var7_3) ** GOTO lbl177
                throw null;
            }
lbl185:
            // 2 sources

            case 11: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkv", fmrd(int ), (int)1131);
                if (!var7_3) ** GOTO lbl134
                throw null;
            }
lbl189:
            // 2 sources

            case 12: {
                var6_4 /* !! */  = (int)gx.fmqp("fqky", fmrd(int ), (int)1132);
                if (!var7_3) ** GOTO lbl154
                throw null;
            }
lbl193:
            // 2 sources

            case 13: {
                var6_4 /* !! */  = (int)gx.fmqp("fqkz", fmrd(int ), (int)1133);
                if (!var7_3) ** GOTO lbl185
                throw null;
            }
lbl197:
            // 2 sources

            case 14: {
                var6_4 /* !! */  = (int)gx.fmqp("fqla", fmrd(int ), (int)1134);
                if (!var7_3) ** GOTO lbl144
                throw null;
            }
            case 15: {
                var6_4 /* !! */  = (int)gx.fmqp("fqlc", fmrd(int ), (int)1135);
                if (!var7_3) ** GOTO lbl173
                throw null;
            }
            case 16: {
                var6_4 /* !! */  = (int)gx.fmqp("fqlg", fmrd(int ), (int)1136);
                if (var7_3) {
                    throw null;
                }
            }
lbl209:
            // 5 sources

            case 17: {
                var6_4 /* !! */  = (int)gx.fmqp("fqlh", fmrd(int ), (int)1137);
                if (!var7_3) ** GOTO lbl164
                throw null;
            }
lbl213:
            // 2 sources

            case 18: {
                var6_4 /* !! */  = (int)gx.fmqp("fqli", fmrd(int ), (int)1138);
                if (!var7_3) ** GOTO lbl209
                throw null;
            }
            case 19: {
                var6_4 /* !! */  = (int)gx.fmqp("fqlj", fmrd(int ), (int)1139);
                if (!var7_3) ** GOTO lbl181
                throw null;
            }
lbl221:
            // 2 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var6_4 /* !! */  = (int)gx.fmqp("fqll", fmrd(int ), (int)1140);
                    if (!var7_3) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 21: 
        }
        var6_4 /* !! */  = (int)gx.fmqp("fqlm", fmrd(int ), (int)1141);
        ** while (!var7_3)
lbl229:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frtp() {
        gx.fmrq[0] = 5347143163524962444L;
        gx.fmrq[1] = -7262309177956913585L;
        gx.fmrq[2] = 794589743666410254L;
        gx.fmrq[3] = 8854925011151250169L;
        gx.fmrq[4] = -8403867328370705989L;
        gx.fmrq[5] = 6653285814401835529L;
        gx.fmrq[6] = 4271698183614572406L;
        gx.fmrq[7] = 8513551788814033898L;
        gx.fmrq[8] = -5709061293823450728L;
        gx.fmrq[9] = 7687102863670109020L;
        gx.fmrq[10] = -5857612934700006680L;
        gx.fmrq[11] = -9104755398105962044L;
        gx.fmrq[12] = -7294506910800564113L;
        gx.fmrq[13] = -7592808095569734867L;
        gx.fmrq[14] = -6202509052999276775L;
        gx.fmrq[15] = 4952895428851155037L;
        gx.fmrq[16] = 5194717205740555266L;
        gx.fmrq[17] = -7598533681297929393L;
        gx.fmrq[18] = -5986153295355181430L;
        gx.fmrq[19] = 4798793057513425304L;
        gx.fmrq[20] = -7794634161158810609L;
        gx.fmrq[21] = 1232405654609844633L;
        gx.fmrq[22] = -7316237565312552954L;
        gx.fmrq[23] = 9049362995386873033L;
        gx.fmrq[24] = -1541951758739453164L;
        gx.fmrq[25] = 534550405460930807L;
        gx.fmrq[26] = 2427055365151728991L;
        gx.fmrq[27] = 9002622183606638231L;
        gx.fmrq[28] = 6606528989225843691L;
        gx.fmrq[29] = 648554832536583935L;
        gx.fmrq[30] = 8119279770402163445L;
        gx.fmrq[31] = -4029352004601387478L;
        gx.fmrq[32] = -5049802137834466747L;
        gx.fmrq[33] = -8596537266641410645L;
        gx.fmrq[34] = -8015163620052809539L;
        gx.fmrq[35] = -3210163681142095332L;
        gx.fmrq[36] = 4430070973325265620L;
        gx.fmrq[37] = -5815553101398016111L;
        gx.fmrq[38] = -5035630491536354499L;
        gx.fmrq[39] = -1441321962376081932L;
        gx.fmrq[40] = 7813716723923172388L;
        gx.fmrq[41] = 5930785812138657378L;
        gx.fmrq[42] = -8819674911227725130L;
        gx.fmrq[43] = 3651267979761878379L;
        gx.fmrq[44] = 7787803554403992337L;
        gx.fmrq[45] = 8451157698110483770L;
        gx.fmrq[46] = -3792431480314466274L;
        gx.fmrq[47] = 354456018073211104L;
        gx.fmrq[48] = -2200954310281834841L;
        gx.fmrq[49] = -1980101790284053215L;
        gx.fmrq[50] = 4034745965838252058L;
        gx.fmrq[51] = 6599596771195585576L;
        gx.fmrq[52] = 3733321294405739275L;
        gx.fmrq[53] = 3119167410793955978L;
        gx.fmrq[54] = 430416061949921726L;
        gx.fmrq[55] = -1336285833576882305L;
        gx.fmrq[56] = 7593582334428485106L;
        gx.fmrq[57] = -7833190207152796257L;
        gx.fmrq[58] = -8188660065331611975L;
        gx.fmrq[59] = 7336104146779648630L;
        gx.fmrq[60] = -3622866716299256471L;
        gx.fmrq[61] = -6191727858991922017L;
        gx.fmrq[62] = 1006545851163382903L;
        gx.fmrq[63] = -208283134217192000L;
        gx.fmrq[64] = 5683601467315131396L;
        gx.fmrq[65] = -7852174598708246639L;
        gx.fmrq[66] = -679585697684687514L;
        gx.fmrq[67] = -3766631275919285248L;
        gx.fmrq[68] = -740132494516947713L;
        gx.fmrq[69] = 2887033735987964563L;
        gx.fmrq[70] = 2276157405110356969L;
        gx.fmrq[71] = -4348109054860873537L;
        gx.fmrq[72] = 2829202740214616745L;
        gx.fmrq[73] = -4515380859593611136L;
        gx.fmrq[74] = 6545961362470484778L;
        gx.fmrq[75] = 5571175538332464486L;
        gx.fmrq[76] = 2166383183497661962L;
        gx.fmrq[77] = -5172639637782691231L;
        gx.fmrq[78] = 4111705583411270548L;
        gx.fmrq[79] = -66484639188132615L;
        gx.fmrq[80] = -8972826557015859326L;
        gx.fmrq[81] = 6310340427447469893L;
        gx.fmrq[82] = 1743712707382064416L;
        gx.fmrq[83] = 6266620282279287451L;
        gx.fmrq[84] = -3719569553594054145L;
        gx.fmrq[85] = 3200632607075271340L;
        gx.fmrq[86] = 6138993606349406411L;
        gx.fmrq[87] = 8851903533724382071L;
        gx.fmrq[88] = 8588015561112557950L;
        gx.fmrq[89] = 3897582356558306451L;
        gx.fmrq[90] = -5813266604601273591L;
        gx.fmrq[91] = -8268187018523953590L;
        gx.fmrq[92] = 3425105523758970942L;
        gx.fmrq[93] = -5268147132889634545L;
        gx.fmrq[94] = 3944960102777306484L;
        gx.fmrq[95] = 8691869035965695498L;
        gx.fmrq[96] = -6500893167787367803L;
        gx.fmrq[97] = -3622076307498375245L;
        gx.fmrq[98] = -3832043023260883537L;
        gx.fmrq[99] = 8116349793781380488L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int itemValue(class_1799 var1_1) {
        block146: {
            block145: {
                block144: {
                    block143: {
                        block142: {
                            block141: {
                                block140: {
                                    block139: {
                                        block138: {
                                            block137: {
                                                block136: {
                                                    block135: {
                                                        block134: {
                                                            var6_2 = gx.c;
                                                            var5_3 /* !! */  = gx.b;
                                                            var4_4 = gx.a;
                                                            if (var6_2) {
                                                                throw null;
lbl6:
                                                                // 48 sources

                                                                return (int)gx.fmqp("foyg", fmrd(int ), (int)784);
                                                            }
                                                            if (var4_4 || var4_4) ** GOTO lbl6
                                                            var2_5 = var1_1.method_7909();
                                                            if (var4_4 || var4_4) ** GOTO lbl6
                                                            if (var2_5 == class_1802.field_8833) break block134;
                                                            if (var4_4) ** GOTO lbl6
                                                            if (var2_5 == class_1802.field_49814) break block134;
                                                            if (var4_4) ** GOTO lbl6
                                                            if (var2_5 != class_1802.field_8575) break block135;
                                                            if (var4_4) ** GOTO lbl6
                                                        }
                                                        if (var4_4 || var4_4) ** GOTO lbl6
                                                        return (int)gx.fmqp("foyh", fmrd(int ), (int)785);
                                                    }
                                                    if (var4_4 || var4_4) ** GOTO lbl6
                                                    if (var2_5 == class_1802.field_22022) break block136;
                                                    if (var4_4) ** GOTO lbl6
                                                    if (var2_5 == class_1802.field_22027) break block136;
                                                    if (var4_4) ** GOTO lbl6
                                                    if (var2_5 == class_1802.field_22028) break block136;
                                                    if (var4_4) ** GOTO lbl6
                                                    if (var2_5 == class_1802.field_22029) break block136;
                                                    if (var4_4) ** GOTO lbl6
                                                    if (var2_5 == class_1802.field_22030) break block136;
                                                    if (var4_4) ** GOTO lbl6
                                                    if (var2_5 == class_1802.field_22024) break block136;
                                                    if (var4_4) ** GOTO lbl6
                                                    if (var2_5 == class_1802.field_22025) break block136;
                                                    if (var4_4) ** GOTO lbl6
                                                    if (var2_5 == class_1802.field_22023) break block136;
                                                    if (var4_4) ** GOTO lbl6
                                                    if (var2_5 != class_1802.field_22026) break block137;
                                                    if (var4_4) ** GOTO lbl6
                                                }
                                                if (var4_4 || var4_4) ** GOTO lbl6
                                                return (int)gx.fmqp("foyi", fmrd(int ), (int)786);
                                            }
                                            if (var4_4 || var4_4) ** GOTO lbl6
                                            if (var2_5 == class_1802.field_8288) break block138;
                                            if (var4_4) ** GOTO lbl6
                                            if (var2_5 == class_1802.field_8367) break block138;
                                            if (var4_4) ** GOTO lbl6
                                            if (var2_5 == class_1802.field_8137) break block138;
                                            if (var4_4) ** GOTO lbl6
                                            if (var2_5 != class_1802.field_49813) break block139;
                                            if (var4_4) ** GOTO lbl6
                                        }
                                        if (var4_4 || var4_4) ** GOTO lbl6
                                        return (int)gx.fmqp("foyj", fmrd(int ), (int)787);
                                    }
                                    if (var4_4 || var4_4) ** GOTO lbl6
                                    if (var2_5 == class_1802.field_22020) break block140;
                                    if (var4_4) ** GOTO lbl6
                                    if (var2_5 == class_1802.field_22018) break block140;
                                    if (var4_4) ** GOTO lbl6
                                    if (var2_5 == class_1802.field_22019) break block140;
                                    if (var4_4) ** GOTO lbl6
                                    if (var2_5 != class_1802.field_8301) break block141;
                                    if (var4_4) ** GOTO lbl6
                                }
                                if (var4_4 || var4_4) ** GOTO lbl6
                                return (int)gx.fmqp("foyk", fmrd(int ), (int)788);
                            }
                            if (var4_4 || var4_4) ** GOTO lbl6
                            if (var2_5 == class_1802.field_8547) break block142;
                            if (var4_4) ** GOTO lbl6
                            if (var2_5 == class_1802.field_8802) break block142;
                            if (var4_4) ** GOTO lbl6
                            if (var2_5 == class_1802.field_8805) break block142;
                            if (var4_4) ** GOTO lbl6
                            if (var2_5 == class_1802.field_8058) break block142;
                            if (var4_4) ** GOTO lbl6
                            if (var2_5 == class_1802.field_8348) break block142;
                            if (var4_4) ** GOTO lbl6
                            if (var2_5 == class_1802.field_8285) break block142;
                            if (var4_4) ** GOTO lbl6
                            if (var2_5 == class_1802.field_8377) break block142;
                            if (var4_4) ** GOTO lbl6
                            if (var2_5 != class_1802.field_8556) break block143;
                            if (var4_4) ** GOTO lbl6
                        }
                        if (var4_4 || var4_4) ** GOTO lbl6
                        return (int)gx.fmqp("foyl", fmrd(int ), (int)789);
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    if (var2_5 == class_1802.field_8477) break block144;
                    if (var4_4) ** GOTO lbl6
                    if (var2_5 != class_1802.field_8463) break block145;
                    if (var4_4) ** GOTO lbl6
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                return (int)gx.fmqp("foym", fmrd(int ), (int)790);
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!(var2_5 instanceof class_1747)) break block146;
            if (var4_4) ** GOTO lbl6
            var3_6 = (class_1747)var2_5;
            if (var4_4 || var4_4) ** GOTO lbl6
            if (!(var3_6.method_7711() instanceof class_2480)) break block146;
            if (var4_4) ** GOTO lbl6
            return (int)gx.fmqp("foyn", fmrd(int ), (int)791);
        }
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return (int)gx.fmqp("foyo", fmrd(int ), (int)792);
            }
            case 0: {
                var5_3 /* !! */  = (int)gx.fmqp("foyp", fmrd(int ), (int)793);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl120:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)gx.fmqp("foyq", fmrd(int ), (int)794);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl125:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)gx.fmqp("foyr", fmrd(int ), (int)795);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 3: {
                var5_3 /* !! */  = (int)gx.fmqp("foys", fmrd(int ), (int)796);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl135:
            // 3 sources

            case 4: {
                var5_3 /* !! */  = (int)gx.fmqp("foyt", fmrd(int ), (int)797);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl140:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)gx.fmqp("foyu", fmrd(int ), (int)798);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
lbl145:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)gx.fmqp("foyv", fmrd(int ), (int)799);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl150:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)gx.fmqp("foyw", fmrd(int ), (int)800);
                if (!var6_2) break;
                throw null;
            }
lbl154:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)gx.fmqp("foyx", fmrd(int ), (int)801);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl159:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)gx.fmqp("foyy", fmrd(int ), (int)802);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl184
            }
            case 10: {
                var5_3 /* !! */  = (int)gx.fmqp("foyz", fmrd(int ), (int)803);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl169:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)gx.fmqp("foza", fmrd(int ), (int)804);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl174:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)gx.fmqp("fozb", fmrd(int ), (int)805);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 13: {
                var5_3 /* !! */  = (int)gx.fmqp("fozc", fmrd(int ), (int)806);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl184:
            // 2 sources

            case 14: {
                var5_3 /* !! */  = (int)gx.fmqp("fozd", fmrd(int ), (int)807);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl290
            }
            case 15: {
                var5_3 /* !! */  = (int)gx.fmqp("foze", fmrd(int ), (int)808);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl194:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)gx.fmqp("fozf", fmrd(int ), (int)809);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl372
            }
lbl199:
            // 3 sources

            case 17: {
                var5_3 /* !! */  = (int)gx.fmqp("fozg", fmrd(int ), (int)810);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
            case 18: {
                var5_3 /* !! */  = (int)gx.fmqp("fozh", fmrd(int ), (int)811);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
            case 19: {
                var5_3 /* !! */  = (int)gx.fmqp("fozi", fmrd(int ), (int)812);
                if (!var6_2) ** GOTO lbl194
                throw null;
            }
lbl213:
            // 3 sources

            case 20: {
                var5_3 /* !! */  = (int)gx.fmqp("fozj", fmrd(int ), (int)813);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl218:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)gx.fmqp("fozk", fmrd(int ), (int)814);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
lbl222:
            // 2 sources

            case 22: {
                var5_3 /* !! */  = (int)gx.fmqp("fozl", fmrd(int ), (int)815);
                if (!var6_2) ** GOTO lbl135
                throw null;
            }
lbl226:
            // 4 sources

            case 23: {
                var5_3 /* !! */  = (int)gx.fmqp("fozm", fmrd(int ), (int)816);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
            case 24: {
                var5_3 /* !! */  = (int)gx.fmqp("fozn", fmrd(int ), (int)817);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl235:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)gx.fmqp("fozo", fmrd(int ), (int)818);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 26: {
                var5_3 /* !! */  = (int)gx.fmqp("fozp", fmrd(int ), (int)819);
                if (!var6_2) ** GOTO lbl226
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)gx.fmqp("fozq", fmrd(int ), (int)820);
                if (!var6_2) ** GOTO lbl218
                throw null;
            }
            case 28: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)gx.fmqp("fozr", fmrd(int ), (int)821);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl394
                    break;
                }
            }
            case 29: {
                var5_3 /* !! */  = (int)gx.fmqp("fozs", fmrd(int ), (int)822);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl259:
            // 3 sources

            case 30: {
                var5_3 /* !! */  = (int)gx.fmqp("fozt", fmrd(int ), (int)823);
                if (!var6_2) ** GOTO lbl213
                throw null;
            }
            case 31: {
                var5_3 /* !! */  = (int)gx.fmqp("fozu", fmrd(int ), (int)824);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl268:
            // 3 sources

            case 32: {
                var5_3 /* !! */  = (int)gx.fmqp("fozv", fmrd(int ), (int)825);
                if (!var6_2) ** GOTO lbl259
                throw null;
            }
            case 33: {
                var5_3 /* !! */  = (int)gx.fmqp("fozw", fmrd(int ), (int)826);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl277:
            // 2 sources

            case 34: {
                var5_3 /* !! */  = (int)gx.fmqp("fozx", fmrd(int ), (int)827);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 35: {
                var5_3 /* !! */  = (int)gx.fmqp("fozy", fmrd(int ), (int)828);
                if (!var6_2) ** GOTO lbl150
                throw null;
            }
lbl286:
            // 3 sources

            case 36: {
                var5_3 /* !! */  = (int)gx.fmqp("fozz", fmrd(int ), (int)829);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
lbl290:
            // 3 sources

            case 37: {
                var5_3 /* !! */  = (int)gx.fmqp("fpaa", fmrd(int ), (int)830);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl295:
            // 3 sources

            case 38: {
                var5_3 /* !! */  = (int)gx.fmqp("fpab", fmrd(int ), (int)831);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
            case 39: {
                var5_3 /* !! */  = (int)gx.fmqp("fpac", fmrd(int ), (int)832);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl411
            }
lbl305:
            // 2 sources

            case 40: {
                var5_3 /* !! */  = (int)gx.fmqp("fpad", fmrd(int ), (int)833);
                if (!var6_2) ** GOTO lbl290
                throw null;
            }
lbl309:
            // 2 sources

            case 41: {
                var5_3 /* !! */  = (int)gx.fmqp("fpae", fmrd(int ), (int)834);
                if (!var6_2) ** GOTO lbl213
                throw null;
            }
            case 42: {
                var5_3 /* !! */  = (int)gx.fmqp("fpaf", fmrd(int ), (int)835);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 43: {
                var5_3 /* !! */  = (int)gx.fmqp("fpag", fmrd(int ), (int)836);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl323:
            // 4 sources

            case 44: {
                var5_3 /* !! */  = (int)gx.fmqp("fpah", fmrd(int ), (int)837);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl368
            }
lbl328:
            // 3 sources

            case 45: {
                var5_3 /* !! */  = (int)gx.fmqp("fpai", fmrd(int ), (int)838);
                if (!var6_2) ** GOTO lbl169
                throw null;
            }
            case 46: {
                var5_3 /* !! */  = (int)gx.fmqp("fpaj", fmrd(int ), (int)839);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
lbl336:
            // 2 sources

            case 47: {
                var5_3 /* !! */  = (int)gx.fmqp("fpak", fmrd(int ), (int)840);
                if (!var6_2) ** GOTO lbl226
                throw null;
            }
lbl340:
            // 2 sources

            case 48: {
                var5_3 /* !! */  = (int)gx.fmqp("fpal", fmrd(int ), (int)841);
                if (!var6_2) ** GOTO lbl135
                throw null;
            }
lbl344:
            // 3 sources

            case 49: {
                var5_3 /* !! */  = (int)gx.fmqp("fpam", fmrd(int ), (int)842);
                if (!var6_2) ** GOTO lbl154
                throw null;
            }
lbl348:
            // 2 sources

            case 50: {
                var5_3 /* !! */  = (int)gx.fmqp("fpan", fmrd(int ), (int)843);
                if (!var6_2) ** GOTO lbl323
                throw null;
            }
lbl352:
            // 2 sources

            case 51: {
                var5_3 /* !! */  = (int)gx.fmqp("fpao", fmrd(int ), (int)844);
                if (!var6_2) ** GOTO lbl120
                throw null;
            }
lbl356:
            // 2 sources

            case 52: {
                var5_3 /* !! */  = (int)gx.fmqp("fpap", fmrd(int ), (int)845);
                if (!var6_2) ** GOTO lbl286
                throw null;
            }
lbl360:
            // 3 sources

            case 53: {
                var5_3 /* !! */  = (int)gx.fmqp("fpaq", fmrd(int ), (int)846);
                if (!var6_2) ** GOTO lbl268
                throw null;
            }
            case 54: {
                var5_3 /* !! */  = (int)gx.fmqp("fpar", fmrd(int ), (int)847);
                if (!var6_2) ** GOTO lbl295
                throw null;
            }
lbl368:
            // 2 sources

            case 55: {
                var5_3 /* !! */  = (int)gx.fmqp("fpas", fmrd(int ), (int)848);
                if (!var6_2) ** GOTO lbl199
                throw null;
            }
lbl372:
            // 3 sources

            case 56: {
                var5_3 /* !! */  = (int)gx.fmqp("fpat", fmrd(int ), (int)849);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
lbl377:
            // 4 sources

            case 57: {
                var5_3 /* !! */  = (int)gx.fmqp("fpau", fmrd(int ), (int)850);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
lbl381:
            // 2 sources

            case 58: {
                var5_3 /* !! */  = (int)gx.fmqp("fpav", fmrd(int ), (int)851);
                if (!var6_2) ** GOTO lbl348
                throw null;
            }
            case 59: {
                var5_3 /* !! */  = (int)gx.fmqp("fpaw", fmrd(int ), (int)852);
                if (!var6_2) ** GOTO lbl169
                throw null;
            }
            case 60: {
                var5_3 /* !! */  = (int)gx.fmqp("fpax", fmrd(int ), (int)853);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl415
            }
lbl394:
            // 2 sources

            case 61: {
                var5_3 /* !! */  = (int)gx.fmqp("fpay", fmrd(int ), (int)854);
                if (!var6_2) ** GOTO lbl372
                throw null;
            }
            case 62: {
                var5_3 /* !! */  = (int)gx.fmqp("fpaz", fmrd(int ), (int)855);
                if (!var6_2) ** GOTO lbl199
                throw null;
            }
            case 63: {
                var5_3 /* !! */  = (int)gx.fmqp("fpba", fmrd(int ), (int)856);
                if (!var6_2) ** GOTO lbl174
                throw null;
            }
            case 64: {
                var5_3 /* !! */  = (int)gx.fmqp("fpbb", fmrd(int ), (int)857);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl411:
            // 2 sources

            case 65: {
                var5_3 /* !! */  = (int)gx.fmqp("fpbc", fmrd(int ), (int)858);
                if (!var6_2) ** GOTO lbl226
                throw null;
            }
lbl415:
            // 2 sources

            case 66: {
                var5_3 /* !! */  = (int)gx.fmqp("fpbd", fmrd(int ), (int)859);
                if (!var6_2) ** GOTO lbl336
                throw null;
            }
lbl419:
            // 2 sources

            case 67: {
                var5_3 /* !! */  = (int)gx.fmqp("fpbe", fmrd(int ), (int)860);
                if (!var6_2) ** GOTO lbl159
                throw null;
            }
lbl423:
            // 4 sources

            case 68: {
                var5_3 /* !! */  = (int)gx.fmqp("fpbf", fmrd(int ), (int)861);
                if (!var6_2) ** GOTO lbl125
                throw null;
            }
            case 69: 
        }
        var5_3 /* !! */  = (int)gx.fmqp("fpbg", fmrd(int ), (int)862);
        ** while (!var6_2)
lbl430:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frxv() {
        gx.fmrr[300] = -7962881997547905469L;
        gx.fmrr[301] = 7408182216921924450L;
        gx.fmrr[302] = 5573400428447769534L;
        gx.fmrr[303] = -3844465060368560088L;
        gx.fmrr[304] = 6367722837469854908L;
        gx.fmrr[305] = 4141842630851369559L;
        gx.fmrr[306] = -4582990370179811732L;
        gx.fmrr[307] = 667654542637258231L;
        gx.fmrr[308] = -284808899417263016L;
        gx.fmrr[309] = -5179738386136105627L;
        gx.fmrr[310] = -1775192075464066951L;
        gx.fmrr[311] = 1684828929228363827L;
        gx.fmrr[312] = -6179873126555512341L;
        gx.fmrr[313] = -3383041424211047450L;
        gx.fmrr[314] = 8106699969651842802L;
        gx.fmrr[315] = 8490832964321417130L;
        gx.fmrr[316] = 3138219510411417232L;
        gx.fmrr[317] = 2903866152416854753L;
        gx.fmrr[318] = 4851301467559578909L;
        gx.fmrr[319] = 6123050402998918976L;
        gx.fmrr[320] = -8591582698444631993L;
        gx.fmrr[321] = 1963116484916497394L;
        gx.fmrr[322] = 2832438954290148042L;
        gx.fmrr[323] = -6795099899706040570L;
        gx.fmrr[324] = 5318396601612023397L;
        gx.fmrr[325] = 6884580581200400147L;
        gx.fmrr[326] = 3968324997656065511L;
        gx.fmrr[327] = 8252844010668990156L;
        gx.fmrr[328] = -3404514868072412626L;
        gx.fmrr[329] = 5582432424199083493L;
        gx.fmrr[330] = 6633741780891208737L;
        gx.fmrr[331] = 2070932938117786784L;
        gx.fmrr[332] = -2065237924897524397L;
        gx.fmrr[333] = 4545282556384519820L;
        gx.fmrr[334] = 1761336458414214239L;
        gx.fmrr[335] = 8354187351897674523L;
        gx.fmrr[336] = 7552699676532744960L;
        gx.fmrr[337] = 1611717952871464872L;
        gx.fmrr[338] = -619635397710511692L;
        gx.fmrr[339] = -3013842492830005829L;
        gx.fmrr[340] = 6643704117556001164L;
        gx.fmrr[341] = 7204222770025336998L;
        gx.fmrr[342] = 1336068981557607621L;
        gx.fmrr[343] = 3395982287839968237L;
        gx.fmrr[344] = -4421709296973783969L;
        gx.fmrr[345] = -6837326697389648984L;
        gx.fmrr[346] = 2601572992674606884L;
        gx.fmrr[347] = -4367974035092788965L;
        gx.fmrr[348] = 1343383202469821267L;
        gx.fmrr[349] = -1534695192273091036L;
        gx.fmrr[350] = -2979917015637919478L;
        gx.fmrr[351] = -6249280173645612209L;
        gx.fmrr[352] = 1293292546876153013L;
        gx.fmrr[353] = -6550702853855268141L;
        gx.fmrr[354] = -3014676865693191550L;
        gx.fmrr[355] = -3098565929410896036L;
        gx.fmrr[356] = 8124389118468638445L;
        gx.fmrr[357] = -5816988725403398909L;
        gx.fmrr[358] = 2577118922546797025L;
        gx.fmrr[359] = 3294462940759981856L;
        gx.fmrr[360] = 9097759844005320788L;
        gx.fmrr[361] = -514699478499232681L;
        gx.fmrr[362] = 1531521428672103488L;
        gx.fmrr[363] = 7356790141045355690L;
        gx.fmrr[364] = 7031754426818481555L;
        gx.fmrr[365] = -2470846760946398509L;
        gx.fmrr[366] = -3045060455679258901L;
        gx.fmrr[367] = -9008601990066558242L;
        gx.fmrr[368] = 8253249103318568372L;
        gx.fmrr[369] = 6695172690767287699L;
        gx.fmrr[370] = -3584303991235181206L;
        gx.fmrr[371] = 2268766186249960095L;
        gx.fmrr[372] = -1387330680500522298L;
        gx.fmrr[373] = 3548100096924800334L;
        gx.fmrr[374] = 1079648233672525961L;
        gx.fmrr[375] = 3036476616850721266L;
        gx.fmrr[376] = -8773280892851898294L;
        gx.fmrr[377] = -5513024614152165297L;
        gx.fmrr[378] = -7865745039179664455L;
        gx.fmrr[379] = 7357096223085262288L;
        gx.fmrr[380] = -3975518424279538516L;
        gx.fmrr[381] = 8372041281070342731L;
        gx.fmrr[382] = -7401157557289446506L;
        gx.fmrr[383] = -4443816302944021386L;
        gx.fmrr[384] = -515566164862575367L;
        gx.fmrr[385] = 4198386437090208928L;
        gx.fmrr[386] = -3256999217151111503L;
        gx.fmrr[387] = -1000749397581016283L;
        gx.fmrr[388] = 8135715373952960366L;
        gx.fmrr[389] = 6509644322807217948L;
        gx.fmrr[390] = 7616452277297077814L;
        gx.fmrr[391] = 14933065796555354L;
        gx.fmrr[392] = -356071372722065459L;
        gx.fmrr[393] = 5773276570740237061L;
        gx.fmrr[394] = -7744780883242303651L;
        gx.fmrr[395] = -8797667660610111884L;
        gx.fmrr[396] = 6026095357616974681L;
        gx.fmrr[397] = -7144035297492960179L;
        gx.fmrr[398] = -4907409462612254760L;
        gx.fmrr[399] = -7310124882041314637L;
    }

    private static /* synthetic */ void froy() {
        gx.fmqo[200] = 448630044;
        gx.fmqo[201] = -1027425731;
        gx.fmqo[202] = 392736969;
        gx.fmqo[203] = -2011024958;
        gx.fmqo[204] = 1747905618;
        gx.fmqo[205] = -862892360;
        gx.fmqo[206] = -115595926;
        gx.fmqo[207] = -1318808222;
        gx.fmqo[208] = -1055162716;
        gx.fmqo[209] = 826740569;
        gx.fmqo[210] = -1387642117;
        gx.fmqo[211] = -377924454;
        gx.fmqo[212] = 1288309553;
        gx.fmqo[213] = -1166883546;
        gx.fmqo[214] = 1751347344;
        gx.fmqo[215] = -1852931646;
        gx.fmqo[216] = -157733618;
        gx.fmqo[217] = -1931417186;
        gx.fmqo[218] = -209875219;
        gx.fmqo[219] = -2000909341;
        gx.fmqo[220] = 1054815814;
        gx.fmqo[221] = -40573062;
        gx.fmqo[222] = 143015207;
        gx.fmqo[223] = 373870733;
        gx.fmqo[224] = 263634723;
        gx.fmqo[225] = 4797077;
        gx.fmqo[226] = 557990794;
        gx.fmqo[227] = -1071880185;
        gx.fmqo[228] = -793345683;
        gx.fmqo[229] = -2105475015;
        gx.fmqo[230] = 1896861565;
        gx.fmqo[231] = 1476920660;
        gx.fmqo[232] = 421718149;
        gx.fmqo[233] = 1876498248;
        gx.fmqo[234] = 749361852;
        gx.fmqo[235] = -1405669508;
        gx.fmqo[236] = -1617418771;
        gx.fmqo[237] = 1442125226;
        gx.fmqo[238] = -1542183844;
        gx.fmqo[239] = 246754652;
        gx.fmqo[240] = -1870734892;
        gx.fmqo[241] = -860726085;
        gx.fmqo[242] = -1744088926;
        gx.fmqo[243] = 693554882;
        gx.fmqo[244] = -1892147585;
        gx.fmqo[245] = -88890401;
        gx.fmqo[246] = -88089618;
        gx.fmqo[247] = 2037034829;
        gx.fmqo[248] = 257925797;
        gx.fmqo[249] = 2109635744;
        gx.fmqo[250] = 1879907320;
        gx.fmqo[251] = -1257744285;
        gx.fmqo[252] = 1961776725;
        gx.fmqo[253] = 1526974398;
        gx.fmqo[254] = -67923621;
        gx.fmqo[255] = 618335849;
        gx.fmqo[256] = -941587946;
        gx.fmqo[257] = 1121052554;
        gx.fmqo[258] = 740281687;
        gx.fmqo[259] = 1303362862;
        gx.fmqo[260] = -83645361;
        gx.fmqo[261] = -494451853;
        gx.fmqo[262] = -2100072494;
        gx.fmqo[263] = 1838200743;
        gx.fmqo[264] = -252514071;
        gx.fmqo[265] = -1108283167;
        gx.fmqo[266] = -1957592672;
        gx.fmqo[267] = -1246675231;
        gx.fmqo[268] = -1047613646;
        gx.fmqo[269] = 1336579393;
        gx.fmqo[270] = -1975537917;
        gx.fmqo[271] = 672531506;
        gx.fmqo[272] = -1616465404;
        gx.fmqo[273] = -338569888;
        gx.fmqo[274] = -1283316107;
        gx.fmqo[275] = 1694964402;
        gx.fmqo[276] = -530827738;
        gx.fmqo[277] = -1833900548;
        gx.fmqo[278] = -1154474076;
        gx.fmqo[279] = 69929961;
        gx.fmqo[280] = 1848865521;
        gx.fmqo[281] = -550956648;
        gx.fmqo[282] = 1151028925;
        gx.fmqo[283] = -957217847;
        gx.fmqo[284] = -1490908874;
        gx.fmqo[285] = -270579825;
        gx.fmqo[286] = 1900333037;
        gx.fmqo[287] = -1326233634;
        gx.fmqo[288] = -1318716321;
        gx.fmqo[289] = 1337591916;
        gx.fmqo[290] = -1237444828;
        gx.fmqo[291] = -28414525;
        gx.fmqo[292] = -2067719724;
        gx.fmqo[293] = -882818184;
        gx.fmqo[294] = 1092456475;
        gx.fmqo[295] = -616233769;
        gx.fmqo[296] = -1353518433;
        gx.fmqo[297] = -211420781;
        gx.fmqo[298] = -224847208;
        gx.fmqo[299] = 1918412593;
    }

    private static /* synthetic */ void frpc() {
        gx.fmqo[400] = 1939308593;
        gx.fmqo[401] = 210634631;
        gx.fmqo[402] = -812881379;
        gx.fmqo[403] = 73307201;
        gx.fmqo[404] = 332794891;
        gx.fmqo[405] = -2107551021;
        gx.fmqo[406] = -1827422858;
        gx.fmqo[407] = 675156091;
        gx.fmqo[408] = 1092460886;
        gx.fmqo[409] = 893777572;
        gx.fmqo[410] = -2115524108;
        gx.fmqo[411] = 1529512212;
        gx.fmqo[412] = 1002475062;
        gx.fmqo[413] = 1844561698;
        gx.fmqo[414] = 538259515;
        gx.fmqo[415] = -198115873;
        gx.fmqo[416] = -1839989889;
        gx.fmqo[417] = -869449178;
        gx.fmqo[418] = 771215590;
        gx.fmqo[419] = -14736158;
        gx.fmqo[420] = -1098854535;
        gx.fmqo[421] = -1539675807;
        gx.fmqo[422] = -2125382976;
        gx.fmqo[423] = -537360882;
        gx.fmqo[424] = 1160240675;
        gx.fmqo[425] = 1397289847;
        gx.fmqo[426] = 91918210;
        gx.fmqo[427] = -700271168;
        gx.fmqo[428] = 1586705921;
        gx.fmqo[429] = -874518444;
        gx.fmqo[430] = -1643774668;
        gx.fmqo[431] = -1952755730;
        gx.fmqo[432] = 2080527865;
        gx.fmqo[433] = -2088170880;
        gx.fmqo[434] = -607970199;
        gx.fmqo[435] = -1018755350;
        gx.fmqo[436] = 1233386284;
        gx.fmqo[437] = 140951092;
        gx.fmqo[438] = -1364950563;
        gx.fmqo[439] = -982368879;
        gx.fmqo[440] = 2129134612;
        gx.fmqo[441] = 397257162;
        gx.fmqo[442] = 1757066002;
        gx.fmqo[443] = -339465268;
        gx.fmqo[444] = -2075805143;
        gx.fmqo[445] = 83783517;
        gx.fmqo[446] = 1474758224;
        gx.fmqo[447] = -1015293876;
        gx.fmqo[448] = 1251597189;
        gx.fmqo[449] = -1460242059;
        gx.fmqo[450] = 940120778;
        gx.fmqo[451] = -1824433557;
        gx.fmqo[452] = -304537783;
        gx.fmqo[453] = -2116103253;
        gx.fmqo[454] = 503224039;
        gx.fmqo[455] = 1660349255;
        gx.fmqo[456] = -1104001186;
        gx.fmqo[457] = -1379004887;
        gx.fmqo[458] = -187975964;
        gx.fmqo[459] = -367125213;
        gx.fmqo[460] = 712802914;
        gx.fmqo[461] = 163001842;
        gx.fmqo[462] = 127889969;
        gx.fmqo[463] = -2002867371;
        gx.fmqo[464] = -1100134586;
        gx.fmqo[465] = -716446261;
        gx.fmqo[466] = 2098573669;
        gx.fmqo[467] = -742254534;
        gx.fmqo[468] = 1984486623;
        gx.fmqo[469] = 561917146;
        gx.fmqo[470] = 1804050677;
        gx.fmqo[471] = 374257519;
        gx.fmqo[472] = -2021193893;
        gx.fmqo[473] = 1401759695;
        gx.fmqo[474] = 1300392808;
        gx.fmqo[475] = 1564172159;
        gx.fmqo[476] = -340613733;
        gx.fmqo[477] = -1926609094;
        gx.fmqo[478] = 1990060444;
        gx.fmqo[479] = 1202735968;
        gx.fmqo[480] = -1063131866;
        gx.fmqo[481] = -263532132;
        gx.fmqo[482] = -1219782525;
        gx.fmqo[483] = 2067527499;
        gx.fmqo[484] = 900724096;
        gx.fmqo[485] = 1750697823;
        gx.fmqo[486] = 1563860997;
        gx.fmqo[487] = 622258134;
        gx.fmqo[488] = 1491387311;
        gx.fmqo[489] = 206180869;
        gx.fmqo[490] = 123921444;
        gx.fmqo[491] = 555201188;
        gx.fmqo[492] = -238451615;
        gx.fmqo[493] = 786162577;
        gx.fmqo[494] = 1865641310;
        gx.fmqo[495] = -1613880612;
        gx.fmqo[496] = -2081396180;
        gx.fmqo[497] = -1954758174;
        gx.fmqo[498] = 159528390;
        gx.fmqo[499] = 2105261729;
    }

    private static /* synthetic */ float fmqm(int n2) {
        return Float.intBitsToFloat(fmqn[n2] ^ fmqo[n2]);
    }

    private static /* synthetic */ void frwq() {
        gx.fmrq[500] = -3565837456981755834L;
        gx.fmrq[501] = -8797338249432759990L;
        gx.fmrq[502] = 7607341104657019083L;
        gx.fmrq[503] = -6463314922681700381L;
        gx.fmrq[504] = 2769175757742397417L;
        gx.fmrq[505] = 9215127754911518105L;
        gx.fmrq[506] = -2871333121185527300L;
        gx.fmrq[507] = 2981882904520218447L;
        gx.fmrq[508] = 2206587417301227428L;
        gx.fmrq[509] = 8665780493418648365L;
        gx.fmrq[510] = 2663356053540414476L;
        gx.fmrq[511] = 269311643140142663L;
        gx.fmrq[512] = 8214529742999610461L;
        gx.fmrq[513] = -462347801106876392L;
        gx.fmrq[514] = -6834591608262696585L;
        gx.fmrq[515] = -4842546239273270120L;
        gx.fmrq[516] = -7587488203517354331L;
        gx.fmrq[517] = 5922051957129426329L;
        gx.fmrq[518] = -7064064105302020601L;
        gx.fmrq[519] = 8707560771147265560L;
        gx.fmrq[520] = -3820256991593502499L;
        gx.fmrq[521] = -2501608938917196922L;
        gx.fmrq[522] = -4236345737757990676L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateHealthSnapshots(long var1_1) {
        block67: {
            var11_2 = gx.c;
            var10_3 /* !! */  = gx.b;
            var9_4 = gx.a;
            if (var11_2) {
                throw null;
lbl6:
                // 18 sources

                return;
            }
            if (var9_4 || var9_4) ** GOTO lbl6
            var3_5 = gx.mc.field_1687.method_18456().iterator();
            if (var9_4) ** GOTO lbl6
            do {
                block70: {
                    block69: {
                        block68: {
                            if (var9_4 || var9_4) ** GOTO lbl6
                            if (!var3_5.hasNext()) break block67;
                            if (var9_4) ** GOTO lbl6
                            var4_6 = (class_1657)var3_5.next();
                            if (var9_4 || var9_4) ** GOTO lbl6
                            var5_7 = np.total((class_1309)var4_6);
                            if (var9_4 || var9_4) ** GOTO lbl6
                            var6_8 = this.healthSnapshots.get(var4_6.method_5667());
                            if (var9_4 || var9_4) ** GOTO lbl6
                            if (var6_8 != null) break block68;
                            if (var9_4) ** GOTO lbl6
                            v0 /* !! */  = gx.fmqp("fotb", fmrp(int ), (int)186);
                            if (var11_2) {
                                throw null;
                            }
                            break block69;
                        }
                        if (var9_4 || var9_4) ** GOTO lbl6
                        v0 /* !! */  = var7_9 /* !! */  = (CallSite)var6_8.lastDropAt;
                    }
                    if (var9_4 || var9_4) ** GOTO lbl6
                    if (var6_8 == null) break block70;
                    if (var9_4) ** GOTO lbl6
                    if (!(var5_7 + gx.fmqp("fotc", fmqm(int ), (int)692) < var6_8.health)) break block70;
                    if (var9_4 || var9_4) ** GOTO lbl6
                    var7_9 /* !! */  = (CallSite)var1_1;
                    if (var9_4) ** GOTO lbl6
                }
                if (var9_4 || var9_4) ** GOTO lbl6
                this.healthSnapshots.put(var4_6.method_5667(), new gx$HealthSnapshot(var5_7, (long)var7_9 /* !! */ ));
                if (var9_4 || var9_4) ** GOTO lbl6
            } while (!var11_2);
            throw null;
        }
        if (var9_4) ** GOTO lbl6
        if (var10_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_4) ** GOTO lbl6
                this.healthSnapshots.keySet().removeIf((Predicate<UUID>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$updateHealthSnapshots$0(java.util.UUID ), (Ljava/util/UUID;)Z)());
                if (!var9_4 && !var9_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var10_3 /* !! */  = (int)gx.fmqp("fotd", fmrd(int ), (int)693);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 1: {
                var10_3 /* !! */  = (int)gx.fmqp("fote", fmrd(int ), (int)694);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl120
            }
lbl66:
            // 4 sources

            case 2: {
                var10_3 /* !! */  = (int)gx.fmqp("fotf", fmrd(int ), (int)695);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 3: {
                var10_3 /* !! */  = (int)gx.fmqp("fotg", fmrd(int ), (int)696);
                if (var11_2) {
                    throw null;
                }
            }
            case 4: {
                var10_3 /* !! */  = (int)gx.fmqp("foth", fmrd(int ), (int)697);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
            case 5: {
                var10_3 /* !! */  = (int)gx.fmqp("foti", fmrd(int ), (int)698);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 6: {
                var10_3 /* !! */  = (int)gx.fmqp("fotj", fmrd(int ), (int)699);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl115
            }
            case 7: {
                var10_3 /* !! */  = (int)gx.fmqp("fotk", fmrd(int ), (int)700);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl95:
            // 2 sources

            case 8: {
                var10_3 /* !! */  = (int)gx.fmqp("fotl", fmrd(int ), (int)701);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl100:
            // 2 sources

            case 9: {
                var10_3 /* !! */  = (int)gx.fmqp("fotm", fmrd(int ), (int)702);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 10: {
                var10_3 /* !! */  = (int)gx.fmqp("fotn", fmrd(int ), (int)703);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl110:
            // 2 sources

            case 11: {
                var10_3 /* !! */  = (int)gx.fmqp("foto", fmrd(int ), (int)704);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl115:
            // 3 sources

            case 12: {
                var10_3 /* !! */  = (int)gx.fmqp("fotp", fmrd(int ), (int)705);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl120:
            // 2 sources

            case 13: {
                var10_3 /* !! */  = (int)gx.fmqp("fotq", fmrd(int ), (int)706);
                if (!var11_2) ** GOTO lbl100
                throw null;
            }
lbl124:
            // 2 sources

            case 14: {
                var10_3 /* !! */  = (int)gx.fmqp("fotr", fmrd(int ), (int)707);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl129:
            // 3 sources

            case 15: {
                var10_3 /* !! */  = (int)gx.fmqp("fots", fmrd(int ), (int)708);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl134:
            // 2 sources

            case 16: {
                var10_3 /* !! */  = (int)gx.fmqp("fott", fmrd(int ), (int)709);
                if (!var11_2) ** GOTO lbl66
                throw null;
            }
lbl138:
            // 2 sources

            case 17: {
                var10_3 /* !! */  = (int)gx.fmqp("fotu", fmrd(int ), (int)710);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl143:
            // 2 sources

            case 18: {
                var10_3 /* !! */  = (int)gx.fmqp("fotv", fmrd(int ), (int)711);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl148:
            // 2 sources

            case 19: {
                var10_3 /* !! */  = (int)gx.fmqp("fotw", fmrd(int ), (int)712);
                if (!var11_2) ** GOTO lbl143
                throw null;
            }
lbl152:
            // 3 sources

            case 20: {
                var10_3 /* !! */  = (int)gx.fmqp("fotx", fmrd(int ), (int)713);
                if (!var11_2) ** GOTO lbl66
                throw null;
            }
lbl156:
            // 3 sources

            case 21: {
                var10_3 /* !! */  = (int)gx.fmqp("foty", fmrd(int ), (int)714);
                if (!var11_2) ** GOTO lbl152
                throw null;
            }
lbl160:
            // 2 sources

            case 22: {
                var10_3 /* !! */  = (int)gx.fmqp("fotz", fmrd(int ), (int)715);
                if (!var11_2) ** GOTO lbl66
                throw null;
            }
            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_3 /* !! */  = (int)gx.fmqp("foua", fmrd(int ), (int)716);
                    if (var11_2) {
                        throw null;
                    }
                    ** GOTO lbl190
                    break;
                }
            }
lbl170:
            // 2 sources

            case 24: {
                var10_3 /* !! */  = (int)gx.fmqp("foub", fmrd(int ), (int)717);
                if (!var11_2) ** GOTO lbl156
                throw null;
            }
            case 25: {
                var10_3 /* !! */  = (int)gx.fmqp("fouc", fmrd(int ), (int)718);
                if (!var11_2) ** GOTO lbl138
                throw null;
            }
lbl178:
            // 3 sources

            case 26: {
                var10_3 /* !! */  = (int)gx.fmqp("foud", fmrd(int ), (int)719);
                if (!var11_2) ** GOTO lbl160
                throw null;
            }
            case 27: {
                var10_3 /* !! */  = (int)gx.fmqp("foue", fmrd(int ), (int)720);
                if (!var11_2) break;
                throw null;
            }
            case 28: {
                var10_3 /* !! */  = (int)gx.fmqp("fouf", fmrd(int ), (int)721);
                if (!var11_2) ** GOTO lbl129
                throw null;
            }
lbl190:
            // 5 sources

            case 29: {
                var10_3 /* !! */  = (int)gx.fmqp("foug", fmrd(int ), (int)722);
                if (!var11_2) ** GOTO lbl110
                throw null;
            }
            case 30: {
                do {
                    var10_3 /* !! */  = (int)gx.fmqp("fouh", fmrd(int ), (int)723);
                } while (!var11_2);
                throw null;
            }
            case 31: 
        }
        var10_3 /* !! */  = (int)gx.fmqp("foui", fmrd(int ), (int)724);
        ** while (!var11_2)
lbl202:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frxy() {
        gx.fmrr[400] = 2107147784314906140L;
        gx.fmrr[401] = -42366647464756835L;
        gx.fmrr[402] = 3339433564608837241L;
        gx.fmrr[403] = 2963355261506904168L;
        gx.fmrr[404] = -1387968228576424375L;
        gx.fmrr[405] = 2107024443363987178L;
        gx.fmrr[406] = 5805020313734803746L;
        gx.fmrr[407] = 9098116103664458695L;
        gx.fmrr[408] = -558424168101047293L;
        gx.fmrr[409] = -5466503908064797845L;
        gx.fmrr[410] = -8097014209210222632L;
        gx.fmrr[411] = 7609684944094478722L;
        gx.fmrr[412] = 7665017148618059978L;
        gx.fmrr[413] = -8312730923107049187L;
        gx.fmrr[414] = -5319771197267406651L;
        gx.fmrr[415] = -3385228473178125050L;
        gx.fmrr[416] = -2489203236858349290L;
        gx.fmrr[417] = -6603663102024889459L;
        gx.fmrr[418] = 746396699154984405L;
        gx.fmrr[419] = -5666271749279079004L;
        gx.fmrr[420] = -1999787350597658513L;
        gx.fmrr[421] = -7226072293725050486L;
        gx.fmrr[422] = 5248747191768838006L;
        gx.fmrr[423] = 7196227187507329990L;
        gx.fmrr[424] = 5339602374746463114L;
        gx.fmrr[425] = 4011976428618726715L;
        gx.fmrr[426] = -5475032270393570824L;
        gx.fmrr[427] = 3525621107400503640L;
        gx.fmrr[428] = 6815452095664616972L;
        gx.fmrr[429] = 2308839121512553978L;
        gx.fmrr[430] = 8373541918615341472L;
        gx.fmrr[431] = 375606065975608325L;
        gx.fmrr[432] = 789817591615506245L;
        gx.fmrr[433] = 376078170887396783L;
        gx.fmrr[434] = -4992153209410291544L;
        gx.fmrr[435] = 8000830409080779931L;
        gx.fmrr[436] = -8950088743692179754L;
        gx.fmrr[437] = 3960677984634260292L;
        gx.fmrr[438] = 1585062868680771033L;
        gx.fmrr[439] = 1119589136208672662L;
        gx.fmrr[440] = -2396988745882185159L;
        gx.fmrr[441] = -7111043800345966437L;
        gx.fmrr[442] = -311096146828466252L;
        gx.fmrr[443] = -2113298428843752857L;
        gx.fmrr[444] = -2761978045894397578L;
        gx.fmrr[445] = -6342828251384358054L;
        gx.fmrr[446] = -432034250957544872L;
        gx.fmrr[447] = 1174178987576544587L;
        gx.fmrr[448] = -2057849117882078723L;
        gx.fmrr[449] = 8234685441537245505L;
        gx.fmrr[450] = -3720732923434760796L;
        gx.fmrr[451] = -2493801610413202096L;
        gx.fmrr[452] = -7599077772505774679L;
        gx.fmrr[453] = -82826940904346858L;
        gx.fmrr[454] = -2904497097688098902L;
        gx.fmrr[455] = -4879725990201813820L;
        gx.fmrr[456] = -2207780353850136732L;
        gx.fmrr[457] = 6593955341409195284L;
        gx.fmrr[458] = 2596221577153988102L;
        gx.fmrr[459] = 1129240523762964251L;
        gx.fmrr[460] = 6260751833124888991L;
        gx.fmrr[461] = 2020193781386192670L;
        gx.fmrr[462] = -746112275691123677L;
        gx.fmrr[463] = -166527795622905883L;
        gx.fmrr[464] = 6449957587714849833L;
        gx.fmrr[465] = 6611383757334195076L;
        gx.fmrr[466] = 3975561826660460654L;
        gx.fmrr[467] = 4312438587823887249L;
        gx.fmrr[468] = 850683581376162305L;
        gx.fmrr[469] = -7759311048352622014L;
        gx.fmrr[470] = 2838567100819774113L;
        gx.fmrr[471] = -1212216685806589617L;
        gx.fmrr[472] = 7373517216540532416L;
        gx.fmrr[473] = -6765377403951167494L;
        gx.fmrr[474] = 3801041462116473197L;
        gx.fmrr[475] = -2029958946184601787L;
        gx.fmrr[476] = 7188856176437571952L;
        gx.fmrr[477] = -5276750271538208939L;
        gx.fmrr[478] = -1834646150290350628L;
        gx.fmrr[479] = -6085164309397786419L;
        gx.fmrr[480] = 5350768166161933201L;
        gx.fmrr[481] = 8645857458231513081L;
        gx.fmrr[482] = -2780959115364041275L;
        gx.fmrr[483] = 1829804224366072204L;
        gx.fmrr[484] = -1239227171730932493L;
        gx.fmrr[485] = 1233062678208301249L;
        gx.fmrr[486] = -6018592059705029067L;
        gx.fmrr[487] = -7986082606683522727L;
        gx.fmrr[488] = 2253049306487173808L;
        gx.fmrr[489] = -7530177402762637788L;
        gx.fmrr[490] = -672112282019473290L;
        gx.fmrr[491] = 5508751732331199818L;
        gx.fmrr[492] = -1691911383785733711L;
        gx.fmrr[493] = -4537758884732225042L;
        gx.fmrr[494] = -1422379588083127409L;
        gx.fmrr[495] = 6602195607106233616L;
        gx.fmrr[496] = 1472124030131515543L;
        gx.fmrr[497] = -2263556434256461527L;
        gx.fmrr[498] = -2923796303865325534L;
        gx.fmrr[499] = -243264464057284333L;
    }

    public static /* synthetic */ CallSite fmqp(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void frpa() {
        gx.fmqo[300] = -1802581166;
        gx.fmqo[301] = -20924089;
        gx.fmqo[302] = 743112432;
        gx.fmqo[303] = 1518642640;
        gx.fmqo[304] = 74524199;
        gx.fmqo[305] = 1689471002;
        gx.fmqo[306] = 89683661;
        gx.fmqo[307] = 350864407;
        gx.fmqo[308] = 1861798761;
        gx.fmqo[309] = -116716253;
        gx.fmqo[310] = -1763047887;
        gx.fmqo[311] = 1135982199;
        gx.fmqo[312] = 645755923;
        gx.fmqo[313] = -1886973729;
        gx.fmqo[314] = -505290566;
        gx.fmqo[315] = -1435019155;
        gx.fmqo[316] = -2131494218;
        gx.fmqo[317] = 872261188;
        gx.fmqo[318] = -1019420889;
        gx.fmqo[319] = 632016303;
        gx.fmqo[320] = -1094044001;
        gx.fmqo[321] = 973803799;
        gx.fmqo[322] = -1202796262;
        gx.fmqo[323] = 1533018785;
        gx.fmqo[324] = 1543693624;
        gx.fmqo[325] = -1177305734;
        gx.fmqo[326] = 265484063;
        gx.fmqo[327] = 1686454286;
        gx.fmqo[328] = 1742489006;
        gx.fmqo[329] = 1157225672;
        gx.fmqo[330] = 215388396;
        gx.fmqo[331] = -759220840;
        gx.fmqo[332] = -1800521775;
        gx.fmqo[333] = -522688454;
        gx.fmqo[334] = -953051043;
        gx.fmqo[335] = 1111890975;
        gx.fmqo[336] = 1216155666;
        gx.fmqo[337] = 578539484;
        gx.fmqo[338] = -821584072;
        gx.fmqo[339] = 1978428920;
        gx.fmqo[340] = -1873695396;
        gx.fmqo[341] = -1748424763;
        gx.fmqo[342] = 301805778;
        gx.fmqo[343] = 1547799044;
        gx.fmqo[344] = -1237527585;
        gx.fmqo[345] = 1810275314;
        gx.fmqo[346] = 456790403;
        gx.fmqo[347] = 1135927408;
        gx.fmqo[348] = 349362693;
        gx.fmqo[349] = 340167265;
        gx.fmqo[350] = -68456538;
        gx.fmqo[351] = -1889374094;
        gx.fmqo[352] = -987961825;
        gx.fmqo[353] = 686823912;
        gx.fmqo[354] = 2099155941;
        gx.fmqo[355] = -499323599;
        gx.fmqo[356] = -2052201919;
        gx.fmqo[357] = 700049986;
        gx.fmqo[358] = 2120208825;
        gx.fmqo[359] = 1719713284;
        gx.fmqo[360] = -1061664151;
        gx.fmqo[361] = -302567062;
        gx.fmqo[362] = -331776976;
        gx.fmqo[363] = 1851411935;
        gx.fmqo[364] = 892352742;
        gx.fmqo[365] = 1665718827;
        gx.fmqo[366] = 1764156145;
        gx.fmqo[367] = 1784503817;
        gx.fmqo[368] = 1909937399;
        gx.fmqo[369] = -515278856;
        gx.fmqo[370] = 172727165;
        gx.fmqo[371] = 1913802770;
        gx.fmqo[372] = -1362720847;
        gx.fmqo[373] = -68934664;
        gx.fmqo[374] = 394238647;
        gx.fmqo[375] = -440820988;
        gx.fmqo[376] = 1826855718;
        gx.fmqo[377] = 43226981;
        gx.fmqo[378] = 138732197;
        gx.fmqo[379] = 95739864;
        gx.fmqo[380] = -923850813;
        gx.fmqo[381] = 1892161302;
        gx.fmqo[382] = 1967376504;
        gx.fmqo[383] = 1862816043;
        gx.fmqo[384] = 1941533689;
        gx.fmqo[385] = -2138569639;
        gx.fmqo[386] = 607590089;
        gx.fmqo[387] = 1680428417;
        gx.fmqo[388] = -1647549958;
        gx.fmqo[389] = 1315146731;
        gx.fmqo[390] = 334230284;
        gx.fmqo[391] = 846099001;
        gx.fmqo[392] = 1758652525;
        gx.fmqo[393] = 7228713;
        gx.fmqo[394] = -1185945984;
        gx.fmqo[395] = 1464225817;
        gx.fmqo[396] = 542687819;
        gx.fmqo[397] = -7062092;
        gx.fmqo[398] = 1925758009;
        gx.fmqo[399] = -939070957;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isInActiveFight(class_1657 var1_1, long var2_2) {
        block69: {
            var10_3 = gx.c;
            var9_4 /* !! */  = gx.b;
            var8_5 = gx.a;
            if (var10_3) {
                throw null;
lbl6:
                // 20 sources

                return (boolean)gx.fmqp("foov", fmrd(int ), (int)625);
            }
            if (var8_5 || var8_5) ** GOTO lbl6
            if (this.wasRecentlyDamaged(var1_1, var2_2)) break block69;
            if (var8_5 || var8_5) ** GOTO lbl6
            return (boolean)gx.fmqp("foox", fmrd(int ), (int)626);
        }
        if (var8_5 || var8_5) ** GOTO lbl6
        var4_6 = this.fightDistance.getValue() * this.fightDistance.getValue();
        if (var8_5 || var8_5) ** GOTO lbl6
        var6_7 = gx.mc.field_1687.method_18456().iterator();
        if (var8_5) ** GOTO lbl6
        block37: while (true) {
            if (var8_5) ** GOTO lbl6
            if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var9_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var8_5) ** GOTO lbl6
                    if (!var6_7.hasNext()) ** GOTO lbl51
                    if (var8_5) ** GOTO lbl6
                    var7_8 = (class_1657)var6_7.next();
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (var7_8 == var1_1) continue block37;
                    if (var8_5) ** GOTO lbl6
                    if (var7_8 == gx.mc.field_1724) continue block37;
                    if (var8_5) ** GOTO lbl6
                    if (var7_8.method_5805()) ** GOTO lbl36
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (!var10_3) continue block37;
                    throw null;
lbl36:
                    // 1 sources

                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (!(var1_1.method_5858((class_1297)var7_8) <= var4_6)) ** GOTO lbl47
                    if (var8_5) ** GOTO lbl6
                    if (this.wasRecentlyDamaged(var7_8, var2_2)) ** GOTO lbl45
                    if (var8_5) ** GOTO lbl6
                    if (var1_1.method_6065() == var7_8) ** GOTO lbl45
                    if (var8_5) ** GOTO lbl6
                    if (var7_8.method_6065() != var1_1) ** GOTO lbl47
                    if (var8_5) ** GOTO lbl6
lbl45:
                    // 3 sources

                    if (var8_5 || var8_5) ** GOTO lbl6
                    return (boolean)gx.fmqp("fope", fmrd(int ), (int)627);
lbl47:
                    // 2 sources

                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (var10_3) ** break;
                    continue block37;
                    throw null;
lbl51:
                    // 1 sources

                    if (!var8_5 && !var8_5) ** break;
                    ** continue;
                    return (boolean)gx.fmqp("fopf", fmrd(int ), (int)628);
                }
lbl54:
                // 2 sources

                case 0: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopg", fmrd(int ), (int)629);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl125
                }
                case 1: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopi", fmrd(int ), (int)630);
                    if (!var10_3) break block37;
                    throw null;
                }
                case 2: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopk", fmrd(int ), (int)631);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl68:
                // 2 sources

                case 3: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopl", fmrd(int ), (int)632);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
lbl73:
                // 2 sources

                case 4: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopr", fmrd(int ), (int)633);
                    if (!var10_3) ** GOTO lbl54
                    throw null;
                }
                case 5: {
                    var9_4 /* !! */  = (int)gx.fmqp("fops", fmrd(int ), (int)634);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl152
                }
lbl82:
                // 2 sources

                case 6: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopu", fmrd(int ), (int)635);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl179
                }
lbl87:
                // 2 sources

                case 7: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopv", fmrd(int ), (int)636);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl115
                }
                case 8: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopx", fmrd(int ), (int)637);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
                case 9: {
                    var9_4 /* !! */  = (int)gx.fmqp("fopz", fmrd(int ), (int)638);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl102:
                // 3 sources

                case 10: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqb", fmrd(int ), (int)639);
                    if (!var10_3) ** GOTO lbl87
                    throw null;
                }
                case 11: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqf", fmrd(int ), (int)640);
                    if (!var10_3) ** GOTO lbl82
                    throw null;
                }
lbl110:
                // 3 sources

                case 12: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqh", fmrd(int ), (int)641);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl148
                }
lbl115:
                // 3 sources

                case 13: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqi", fmrd(int ), (int)642);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl183
                }
                case 14: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqj", fmrd(int ), (int)643);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
lbl125:
                // 2 sources

                case 15: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqk", fmrd(int ), (int)644);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
                case 16: {
                    var9_4 /* !! */  = (int)gx.fmqp("foql", fmrd(int ), (int)645);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl187
                }
                case 17: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqn", fmrd(int ), (int)646);
                    if (!var10_3) ** GOTO lbl102
                    throw null;
                }
lbl139:
                // 2 sources

                case 18: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqt", fmrd(int ), (int)647);
                    if (!var10_3) ** GOTO lbl68
                    throw null;
                }
                case 19: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqu", fmrd(int ), (int)648);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
lbl148:
                // 4 sources

                case 20: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqv", fmrd(int ), (int)649);
                    if (!var10_3) ** GOTO lbl139
                    throw null;
                }
lbl152:
                // 4 sources

                case 21: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqw", fmrd(int ), (int)650);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl165
                }
                case 22: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqx", fmrd(int ), (int)651);
                    if (!var10_3) ** GOTO lbl115
                    throw null;
                }
                case 23: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqy", fmrd(int ), (int)652);
                    if (!var10_3) ** GOTO lbl110
                    throw null;
                }
lbl165:
                // 3 sources

                case 24: {
                    var9_4 /* !! */  = (int)gx.fmqp("foqz", fmrd(int ), (int)653);
                    if (!var10_3) ** GOTO lbl102
                    throw null;
                }
                case 25: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var9_4 /* !! */  = (int)gx.fmqp("fora", fmrd(int ), (int)654);
                        if (!var10_3) ** GOTO lbl148
                        throw null;
                    }
                }
                case 26: {
                    var9_4 /* !! */  = (int)gx.fmqp("forb", fmrd(int ), (int)655);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl179:
                // 3 sources

                case 27: {
                    var9_4 /* !! */  = (int)gx.fmqp("forc", fmrd(int ), (int)656);
                    if (!var10_3) ** GOTO lbl110
                    throw null;
                }
lbl183:
                // 2 sources

                case 28: {
                    var9_4 /* !! */  = (int)gx.fmqp("ford", fmrd(int ), (int)657);
                    if (!var10_3) break block37;
                    throw null;
                }
lbl187:
                // 3 sources

                case 29: {
                    var9_4 /* !! */  = (int)gx.fmqp("fore", fmrd(int ), (int)658);
                    if (!var10_3) ** GOTO lbl152
                    throw null;
                }
lbl191:
                // 4 sources

                case 30: {
                    var9_4 /* !! */  = (int)gx.fmqp("forf", fmrd(int ), (int)659);
                    if (!var10_3) ** GOTO lbl165
                    throw null;
                }
                case 31: {
                    var9_4 /* !! */  = (int)gx.fmqp("forg", fmrd(int ), (int)660);
                    if (!var10_3) ** GOTO lbl179
                    throw null;
                }
lbl199:
                // 3 sources

                case 32: {
                    var9_4 /* !! */  = (int)gx.fmqp("forh", fmrd(int ), (int)661);
                    if (!var10_3) ** GOTO lbl73
                    throw null;
                }
                case 33: 
            }
            break;
        }
        var9_4 /* !! */  = (int)gx.fmqp("fori", fmrd(int ), (int)662);
        ** while (!var10_3)
lbl206:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frrf() {
        gx.fmqo[1000] = -220156699;
        gx.fmqo[1001] = 592558154;
        gx.fmqo[1002] = 1408154264;
        gx.fmqo[1003] = 77034883;
        gx.fmqo[1004] = 1221585308;
        gx.fmqo[1005] = -802955102;
        gx.fmqo[1006] = -1371522676;
        gx.fmqo[1007] = -41643229;
        gx.fmqo[1008] = -327792192;
        gx.fmqo[1009] = -155210552;
        gx.fmqo[1010] = 1398395295;
        gx.fmqo[1011] = -1745655092;
        gx.fmqo[1012] = -1167815039;
        gx.fmqo[1013] = 1511370554;
        gx.fmqo[1014] = -1458309331;
        gx.fmqo[1015] = 1042636970;
        gx.fmqo[1016] = 234650614;
        gx.fmqo[1017] = 1521033703;
        gx.fmqo[1018] = -1926242364;
        gx.fmqo[1019] = -1092525877;
        gx.fmqo[1020] = -808575671;
        gx.fmqo[1021] = -758060912;
        gx.fmqo[1022] = 1524851459;
        gx.fmqo[1023] = -599527147;
        gx.fmqo[1024] = 1781044470;
        gx.fmqo[1025] = 1677349873;
        gx.fmqo[1026] = 1967513935;
        gx.fmqo[1027] = -1768558253;
        gx.fmqo[1028] = 25943365;
        gx.fmqo[1029] = -1547783697;
        gx.fmqo[1030] = -520265225;
        gx.fmqo[1031] = 625395856;
        gx.fmqo[1032] = -581464812;
        gx.fmqo[1033] = 264580365;
        gx.fmqo[1034] = -264731152;
        gx.fmqo[1035] = -769690829;
        gx.fmqo[1036] = 1792803580;
        gx.fmqo[1037] = 125106563;
        gx.fmqo[1038] = 1605953207;
        gx.fmqo[1039] = -1922402129;
        gx.fmqo[1040] = -1390785198;
        gx.fmqo[1041] = -1976414759;
        gx.fmqo[1042] = -1902952478;
        gx.fmqo[1043] = -37532360;
        gx.fmqo[1044] = -937829931;
        gx.fmqo[1045] = 1572200714;
        gx.fmqo[1046] = 781179275;
        gx.fmqo[1047] = -1557297170;
        gx.fmqo[1048] = -509230992;
        gx.fmqo[1049] = 672454516;
        gx.fmqo[1050] = -523095286;
        gx.fmqo[1051] = 415059126;
        gx.fmqo[1052] = 1578473167;
        gx.fmqo[1053] = -1145255252;
        gx.fmqo[1054] = 1252008120;
        gx.fmqo[1055] = -1874876861;
        gx.fmqo[1056] = -1533699392;
        gx.fmqo[1057] = 506994184;
        gx.fmqo[1058] = 2031167439;
        gx.fmqo[1059] = -1248325074;
        gx.fmqo[1060] = 1213205206;
        gx.fmqo[1061] = -2143118033;
        gx.fmqo[1062] = 1673566580;
        gx.fmqo[1063] = -232384416;
        gx.fmqo[1064] = -1195765634;
        gx.fmqo[1065] = -1996380490;
        gx.fmqo[1066] = 1353460509;
        gx.fmqo[1067] = -2069701303;
        gx.fmqo[1068] = -681103008;
        gx.fmqo[1069] = 1148256347;
        gx.fmqo[1070] = 2004337012;
        gx.fmqo[1071] = -1351131920;
        gx.fmqo[1072] = -96178460;
        gx.fmqo[1073] = -1164977610;
        gx.fmqo[1074] = -597129854;
        gx.fmqo[1075] = 1070777163;
        gx.fmqo[1076] = -924362249;
        gx.fmqo[1077] = 1719554349;
        gx.fmqo[1078] = 1249094245;
        gx.fmqo[1079] = -1328322830;
        gx.fmqo[1080] = -1257240450;
        gx.fmqo[1081] = -1501304906;
        gx.fmqo[1082] = -28652511;
        gx.fmqo[1083] = 905176283;
        gx.fmqo[1084] = -428184986;
        gx.fmqo[1085] = -1758878006;
        gx.fmqo[1086] = -870396540;
        gx.fmqo[1087] = -1068212087;
        gx.fmqo[1088] = -404439281;
        gx.fmqo[1089] = 465144022;
        gx.fmqo[1090] = 1373266463;
        gx.fmqo[1091] = 0x111D313;
        gx.fmqo[1092] = -1682878895;
        gx.fmqo[1093] = 1647131458;
        gx.fmqo[1094] = -1763126299;
        gx.fmqo[1095] = 1724653992;
        gx.fmqo[1096] = -1697516168;
        gx.fmqo[1097] = -791551741;
        gx.fmqo[1098] = -1959106151;
        gx.fmqo[1099] = -882979222;
    }

    static {
        fmqn = new int[1350];
        fmqo = new int[1350];
        gx.frha();
        gx.frhp();
        gx.frik();
        gx.frje();
        gx.frjt();
        gx.frkn();
        gx.frlc();
        gx.frlr();
        gx.frmj();
        gx.frmz();
        gx.frnm();
        gx.frns();
        gx.frok();
        gx.fros();
        gx.frou();
        gx.frow();
        gx.froy();
        gx.frpa();
        gx.frpc();
        gx.frpe();
        gx.frpg();
        gx.frpp();
        gx.frqe();
        gx.frqu();
        gx.frrf();
        gx.frry();
        gx.frsg();
        gx.frtb();
        fmrq = new long[523];
        fmrr = new long[523];
        gx.frtp();
        gx.fruf();
        gx.frux();
        gx.frvj();
        gx.frvx();
        gx.frwq();
        gx.frwy();
        gx.frxo();
        gx.frxt();
        gx.frxv();
        gx.frxy();
        gx.frxz();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void beginLootApproach(class_1542 var1_1, long var2_2, String var4_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fnry", fmrp(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gx.fmqp("fnrz", fmrd(int ), (int)449)) break;
            v0 /* !! */  = (long)gx.fmqp("fnsa", fmrd(int ), (int)450);
        }
        var7_4 = gx.c;
        v1 /* !! */  = gx.mq;
        if (true) ** GOTO lbl11
        block74: while (true) {
            v1 /* !! */  = (long)(gx.fmqp("fnsc", fmrp(int ), (int)90) - gx.fmqp("fnsb", fmrp(int ), (int)89));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -297563304: {
                    continue block74;
                }
                case 1461008885: {
                    break block74;
                }
            }
            break;
        }
        var6_5 /* !! */  = gx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fnsg", fmrp(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gx.fmqp("fnsh", fmrd(int ), (int)451)) break;
            v2 /* !! */  = (long)gx.fmqp("fnsi", fmrd(int ), (int)452);
        }
        var5_6 = gx.a;
        if (var7_4) {
            throw null;
lbl25:
            // 11 sources

            return;
        }
        if (var5_6 || var5_6) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fnsj", fmrp(int ), (int)92)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gx.fmqp("fnsk", fmrd(int ), (int)453)) break;
            v3 /* !! */  = (long)gx.fmqp("fnsl", fmrd(int ), (int)454);
        }
        v4 = var1_1.method_73189();
        v5 /* !! */  = gx.mq;
        if (true) ** GOTO lbl38
        block78: while (true) {
            v5 /* !! */  = (long)(v6 - gx.fmqp("fnsm", fmrp(int ), (int)93));
lbl38:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1437070359: {
                    v6 = gx.fmqp("fnso", fmrp(int ), (int)94);
                    continue block78;
                }
                case 769021513: {
                    v6 = gx.fmqp("fnsp", fmrp(int ), (int)95);
                    continue block78;
                }
                case 1461008885: {
                    break block78;
                }
            }
            break;
        }
        this.watchedPosition = v4;
        if (var5_6 || var5_6) ** GOTO lbl25
        v7 /* !! */  = gx.mq;
        if (true) ** GOTO lbl53
        block79: while (true) {
            v7 /* !! */  = (long)(v8 - gx.fmqp("fnss", fmrp(int ), (int)96));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 660017051: {
                    v8 = gx.fmqp("fnst", fmrp(int ), (int)97);
                    continue block79;
                }
                case 1198939774: {
                    v8 = gx.fmqp("fnsu", fmrp(int ), (int)98);
                    continue block79;
                }
                case 1461008885: {
                    break block79;
                }
            }
            break;
        }
        this.watchedPlayer = null;
        if (var5_6 || var5_6) ** GOTO lbl25
        v9 /* !! */  = gx.mq;
        if (true) ** GOTO lbl68
        block80: while (true) {
            v9 /* !! */  = (long)(v10 - gx.fmqp("fnsy", fmrp(int ), (int)99));
lbl68:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -505597532: {
                    v10 = gx.fmqp("fnsz", fmrp(int ), (int)100);
                    continue block80;
                }
                case 284200069: {
                    v10 = gx.fmqp("fnta", fmrp(int ), (int)101);
                    continue block80;
                }
                case 1461008885: {
                    break block80;
                }
                case 1546328247: {
                    v10 = gx.fmqp("fntb", fmrp(int ), (int)102);
                    continue block80;
                }
            }
            break;
        }
        v11 = var1_1.method_5667();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fntd", fmrp(int ), (int)103)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gx.fmqp("fnte", fmrd(int ), (int)455)) break;
            v12 /* !! */  = (long)gx.fmqp("fntf", fmrd(int ), (int)456);
        }
        this.trackedLoot = v11;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_6 || var5_6) ** GOTO lbl25
                v13 = gx.fmqp("fnth", fmrp(int ), (int)104);
                v14 /* !! */  = gx.mq;
                if (true) ** GOTO lbl96
                block82: while (true) {
                    v14 /* !! */  = (long)(gx.fmqp("fntj", fmrp(int ), (int)106) - gx.fmqp("fnti", fmrp(int ), (int)105));
lbl96:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1204872273: {
                            continue block82;
                        }
                        case 1461008885: {
                            break block82;
                        }
                    }
                    break;
                }
                this.targetLostAt = (long)v13;
                if (var5_6 || var5_6) ** GOTO lbl25
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fntl", fmrp(int ), (int)107)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gx.fmqp("fntm", fmrd(int ), (int)457)) break;
                    v15 /* !! */  = (long)gx.fmqp("fntn", fmrd(int ), (int)458);
                }
                this.lastLootSeenAt = var2_2;
                if (var5_6 || var5_6) ** GOTO lbl25
                v16 /* !! */  = gx.mq;
                if (true) ** GOTO lbl114
                block84: while (true) {
                    v16 /* !! */  = (long)(v17 - gx.fmqp("fntp", fmrp(int ), (int)108));
lbl114:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -981784150: {
                            v17 = gx.fmqp("fntq", fmrp(int ), (int)109);
                            continue block84;
                        }
                        case 42161332: {
                            v17 = gx.fmqp("fnts", fmrp(int ), (int)110);
                            continue block84;
                        }
                        case 1461008885: {
                            break block84;
                        }
                    }
                    break;
                }
                this.beginInventoryTracking();
                if (var5_6 || var5_6) ** GOTO lbl25
                v18 /* !! */  = gx.mq;
                if (true) ** GOTO lbl129
                block85: while (true) {
                    v18 /* !! */  = (long)(v19 - gx.fmqp("fntt", fmrp(int ), (int)111));
lbl129:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1159775605: {
                            v19 = gx.fmqp("fntu", fmrp(int ), (int)112);
                            continue block85;
                        }
                        case 467259346: {
                            v19 = gx.fmqp("fntv", fmrp(int ), (int)113);
                            continue block85;
                        }
                        case 1319380250: {
                            v19 = gx.fmqp("fntw", fmrp(int ), (int)114);
                            continue block85;
                        }
                        case 1461008885: {
                            break block85;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fnty", fmrp(int ), (int)115)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == gx.fmqp("fnua", fmrd(int ), (int)459)) break;
                    v20 /* !! */  = (long)gx.fmqp("fnub", fmrd(int ), (int)460);
                }
                this.state = gx$State.APPROACHING;
                if (var5_6 || var5_6) ** GOTO lbl25
                v21 /* !! */  = gx.mq;
                if (true) ** GOTO lbl152
                block87: while (true) {
                    v21 /* !! */  = (long)(v22 - gx.fmqp("fnuc", fmrp(int ), (int)116));
lbl152:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1515448931: {
                            v22 = gx.fmqp("fnud", fmrp(int ), (int)117);
                            continue block87;
                        }
                        case -1436540002: {
                            v22 = gx.fmqp("fnue", fmrp(int ), (int)118);
                            continue block87;
                        }
                        case -217252186: {
                            v22 = gx.fmqp("fnuf", fmrp(int ), (int)119);
                            continue block87;
                        }
                        case 1461008885: {
                            break block87;
                        }
                    }
                    break;
                }
                this.stateSince = var2_2;
                if (var5_6 || var5_6) ** GOTO lbl25
                v23 /* !! */  = gx.mq;
                if (true) ** GOTO lbl170
                block88: while (true) {
                    v23 /* !! */  = (long)(v24 - gx.fmqp("fnug", fmrp(int ), (int)120));
lbl170:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2100591496: {
                            v24 = gx.fmqp("fnuj", fmrp(int ), (int)121);
                            continue block88;
                        }
                        case 1096817625: {
                            v24 = gx.fmqp("fnuk", fmrp(int ), (int)122);
                            continue block88;
                        }
                        case 1461008885: {
                            break block88;
                        }
                        case 1514753471: {
                            v24 = gx.fmqp("fnul", fmrp(int ), (int)123);
                            continue block88;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_6 = gx.mq - gx.fmqp("fnun", fmrp(int ), (int)124)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == gx.fmqp("fnup", fmrd(int ), (int)461)) break;
                    v25 /* !! */  = (long)gx.fmqp("fnuq", fmrd(int ), (int)462);
                }
                this.startExploit(this.watchedPosition, var2_2);
                if (var5_6 || var5_6) ** GOTO lbl25
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_7 = gx.mq - gx.fmqp("fnus", fmrp(int ), (int)125)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == gx.fmqp("fnut", fmrd(int ), (int)463)) break;
                    v26 /* !! */  = (long)gx.fmqp("fnuv", fmrd(int ), (int)464);
                }
                v27 = "TpLoot: " + var4_3;
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_8 = gx.mq - gx.fmqp("fnuw", fmrp(int ), (int)126)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == gx.fmqp("fnux", fmrd(int ), (int)465)) break;
                    v28 /* !! */  = (long)gx.fmqp("fnuz", fmrd(int ), (int)466);
                }
                pp.brandmessage(v27);
                if (var5_6 || var5_6) ** continue;
                return;
            }
lbl203:
            // 3 sources

            case 0: {
                var6_5 /* !! */  = (int)gx.fmqp("fnva", fmrd(int ), (int)467);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 1: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvb", fmrd(int ), (int)468);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl213:
            // 2 sources

            case 2: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvd", fmrd(int ), (int)469);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl218:
            // 2 sources

            case 3: {
                var6_5 /* !! */  = (int)gx.fmqp("fnve", fmrd(int ), (int)470);
                if (!var7_4) ** GOTO lbl203
                throw null;
            }
            case 4: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvg", fmrd(int ), (int)471);
                if (!var7_4) ** GOTO lbl203
                throw null;
            }
lbl226:
            // 4 sources

            case 5: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvh", fmrd(int ), (int)472);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 6: {
                do {
                    var6_5 /* !! */  = (int)gx.fmqp("fnvk", fmrd(int ), (int)473);
                } while (!var7_4);
                throw null;
            }
            case 7: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvl", fmrd(int ), (int)474);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl241:
            // 2 sources

            case 8: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvn", fmrd(int ), (int)475);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl246:
            // 2 sources

            case 9: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvo", fmrd(int ), (int)476);
                if (!var7_4) ** GOTO lbl226
                throw null;
            }
lbl250:
            // 2 sources

            case 10: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvq", fmrd(int ), (int)477);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 11: {
                do {
                    var6_5 /* !! */  = (int)gx.fmqp("fnvr", fmrd(int ), (int)478);
                } while (!var7_4);
                throw null;
            }
            case 12: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvt", fmrd(int ), (int)479);
                if (!var7_4) ** GOTO lbl226
                throw null;
            }
lbl264:
            // 2 sources

            case 13: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvu", fmrd(int ), (int)480);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 14: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvv", fmrd(int ), (int)481);
                if (!var7_4) ** GOTO lbl241
                throw null;
            }
lbl273:
            // 5 sources

            case 15: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvx", fmrd(int ), (int)482);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 16: {
                var6_5 /* !! */  = (int)gx.fmqp("fnvy", fmrd(int ), (int)483);
                if (!var7_4) ** GOTO lbl250
                throw null;
            }
            case 17: {
                do {
                    var6_5 /* !! */  = (int)gx.fmqp("fnwa", fmrd(int ), (int)484);
                } while (!var7_4);
                throw null;
            }
            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_5 /* !! */  = (int)gx.fmqp("fnwb", fmrd(int ), (int)485);
                    if (var7_4) {
                        throw null;
                    }
                    ** GOTO lbl301
                    break;
                }
            }
lbl293:
            // 2 sources

            case 19: {
                var6_5 /* !! */  = (int)gx.fmqp("fnwc", fmrd(int ), (int)486);
                if (!var7_4) ** GOTO lbl218
                throw null;
            }
            case 20: {
                var6_5 /* !! */  = (int)gx.fmqp("fnwf", fmrd(int ), (int)487);
                if (!var7_4) ** GOTO lbl273
                throw null;
            }
lbl301:
            // 5 sources

            case 21: {
                var6_5 /* !! */  = (int)gx.fmqp("fnwg", fmrd(int ), (int)488);
                if (!var7_4) ** GOTO lbl213
                throw null;
            }
            case 22: {
                var6_5 /* !! */  = (int)gx.fmqp("fnwi", fmrd(int ), (int)489);
                if (!var7_4) ** GOTO lbl226
                throw null;
            }
            case 23: 
        }
        var6_5 /* !! */  = (int)gx.fmqp("fnwj", fmrd(int ), (int)490);
        ** while (!var7_4)
lbl312:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void beginInventoryTracking() {
        block70: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fpeo", fmrp(int ), (int)240)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == gx.fmqp("fpep", fmrd(int ), (int)906)) break;
                v0 /* !! */  = (long)gx.fmqp("fpeq", fmrd(int ), (int)907);
            }
            var3_1 = gx.c;
            v1 /* !! */  = gx.mq;
            if (true) ** GOTO lbl12
            block43: while (true) {
                v1 /* !! */  = (long)(v2 - gx.fmqp("fper", fmrp(int ), (int)241));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1814433857: {
                        v2 = gx.fmqp("fpes", fmrp(int ), (int)242);
                        continue block43;
                    }
                    case -540639890: {
                        v2 = gx.fmqp("fpet", fmrp(int ), (int)243);
                        continue block43;
                    }
                    case 1461008885: {
                        break block43;
                    }
                }
                break;
            }
            var2_2 /* !! */  = gx.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fpeu", fmrp(int ), (int)244)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == gx.fmqp("fpev", fmrd(int ), (int)908)) break;
                v3 /* !! */  = (long)gx.fmqp("fpew", fmrd(int ), (int)909);
            }
            var1_3 = gx.a;
            if (var3_1) {
                throw null;
lbl31:
                // 6 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl31
            v4 /* !! */  = gx.mq;
            if (true) ** GOTO lbl38
            block46: while (true) {
                v4 /* !! */  = (long)(gx.fmqp("fpey", fmrp(int ), (int)246) - gx.fmqp("fpex", fmrp(int ), (int)245));
lbl38:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 711885653: {
                        continue block46;
                    }
                    case 1461008885: {
                        break block46;
                    }
                }
                break;
            }
            if (!this.lootInventoryTracking) break block70;
            if (var1_3 || var1_3) ** GOTO lbl31
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl31
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("fpez", fmrp(int ), (int)247)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == gx.fmqp("fpfa", fmrd(int ), (int)910)) break;
            v5 /* !! */  = (long)gx.fmqp("fpfb", fmrd(int ), (int)911);
        }
        v6 /* !! */  = gx.mq;
        if (true) ** GOTO lbl58
        block48: while (true) {
            v6 /* !! */  = (long)(v7 - gx.fmqp("fpfc", fmrp(int ), (int)248));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -623182113: {
                    v7 = gx.fmqp("fpfd", fmrp(int ), (int)249);
                    continue block48;
                }
                case 152527674: {
                    v7 = gx.fmqp("fpfe", fmrp(int ), (int)250);
                    continue block48;
                }
                case 199119514: {
                    v7 = gx.fmqp("fpff", fmrp(int ), (int)251);
                    continue block48;
                }
                case 1461008885: {
                    break block48;
                }
            }
            break;
        }
        this.lootInventoryBaseline.clear();
        if (var1_3 || var1_3) ** GOTO lbl31
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("fpfg", fmrp(int ), (int)252)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v8 /* !! */  == gx.fmqp("fpfh", fmrd(int ), (int)912)) break;
            v8 /* !! */  = (long)gx.fmqp("fpfi", fmrd(int ), (int)913);
        }
        v9 /* !! */  = gx.mq;
        if (true) ** GOTO lbl82
        block50: while (true) {
            v9 /* !! */  = (long)(v10 - gx.fmqp("fpfj", fmrp(int ), (int)253));
lbl82:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 424324555: {
                    v10 = gx.fmqp("fpfk", fmrp(int ), (int)254);
                    continue block50;
                }
                case 466977852: {
                    v10 = gx.fmqp("fpfl", fmrp(int ), (int)255);
                    continue block50;
                }
                case 1461008885: {
                    break block50;
                }
                case 1595203976: {
                    v10 = gx.fmqp("fpfm", fmrp(int ), (int)256);
                    continue block50;
                }
            }
            break;
        }
        this.addInventoryCounts(this.lootInventoryBaseline);
        if (var1_3 || var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v11 = gx.fmqp("fpfn", fmrd(int ), (int)914);
                v12 /* !! */  = gx.mq;
                if (true) ** GOTO lbl104
                block51: while (true) {
                    v12 /* !! */  = (long)(gx.fmqp("fpfp", fmrp(int ), (int)258) - gx.fmqp("fpfo", fmrp(int ), (int)257));
lbl104:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 1461008885: {
                            break block51;
                        }
                        case 2143783554: {
                            continue block51;
                        }
                    }
                    break;
                }
                this.lootInventoryTracking = v11;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl112:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gx.fmqp("fpfq", fmrd(int ), (int)915);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl117:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)gx.fmqp("fpfr", fmrd(int ), (int)916);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl145
            }
            case 2: {
                var2_2 /* !! */  = (int)gx.fmqp("fpfs", fmrd(int ), (int)917);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl127:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)gx.fmqp("fpft", fmrd(int ), (int)918);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
lbl132:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)gx.fmqp("fpfu", fmrd(int ), (int)919);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)gx.fmqp("fpfv", fmrd(int ), (int)920);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)gx.fmqp("fpfw", fmrd(int ), (int)921);
                } while (!var3_1);
                throw null;
            }
lbl145:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)gx.fmqp("fpfx", fmrd(int ), (int)922);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
lbl149:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)gx.fmqp("fpfy", fmrd(int ), (int)923);
                if (!var3_1) ** GOTO lbl145
                throw null;
            }
lbl153:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)gx.fmqp("fpfz", fmrd(int ), (int)924);
                if (!var3_1) ** GOTO lbl127
                throw null;
            }
            case 10: {
                do {
                    var2_2 /* !! */  = (int)gx.fmqp("fpga", fmrd(int ), (int)925);
                } while (!var3_1);
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)gx.fmqp("fpgb", fmrd(int ), (int)926);
                if (!var3_1) ** GOTO lbl117
                throw null;
            }
            case 12: {
                do {
                    var2_2 /* !! */  = (int)gx.fmqp("fpgc", fmrd(int ), (int)927);
                } while (!var3_1);
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)gx.fmqp("fplp", fmrd(int ), (int)928);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 14: 
        }
        do {
            var2_2 /* !! */  = (int)gx.fmqp("fplr", fmrd(int ), (int)929);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void frlc() {
        gx.fmqn[600] = 972239676;
        gx.fmqn[601] = -1511795066;
        gx.fmqn[602] = -1304530274;
        gx.fmqn[603] = -368600097;
        gx.fmqn[604] = 556384268;
        gx.fmqn[605] = -2002627132;
        gx.fmqn[606] = -1971876041;
        gx.fmqn[607] = 942373162;
        gx.fmqn[608] = 2142338381;
        gx.fmqn[609] = 1349749927;
        gx.fmqn[610] = 491956176;
        gx.fmqn[611] = 1742649296;
        gx.fmqn[612] = 634788139;
        gx.fmqn[613] = -1036619195;
        gx.fmqn[614] = -845056185;
        gx.fmqn[615] = -1485033419;
        gx.fmqn[616] = 540725321;
        gx.fmqn[617] = -1173782764;
        gx.fmqn[618] = -1345771855;
        gx.fmqn[619] = -777675435;
        gx.fmqn[620] = 53008277;
        gx.fmqn[621] = -1326410472;
        gx.fmqn[622] = -964156625;
        gx.fmqn[623] = 83106277;
        gx.fmqn[624] = -1216047931;
        gx.fmqn[625] = -795142699;
        gx.fmqn[626] = 155835679;
        gx.fmqn[627] = 9100037;
        gx.fmqn[628] = 1444834600;
        gx.fmqn[629] = -1772513533;
        gx.fmqn[630] = 2043991285;
        gx.fmqn[631] = -815088897;
        gx.fmqn[632] = 773597928;
        gx.fmqn[633] = -1017779758;
        gx.fmqn[634] = -184444126;
        gx.fmqn[635] = -214275442;
        gx.fmqn[636] = -1283178517;
        gx.fmqn[637] = 437742112;
        gx.fmqn[638] = 602908284;
        gx.fmqn[639] = 1981832112;
        gx.fmqn[640] = 63203264;
        gx.fmqn[641] = 193513609;
        gx.fmqn[642] = -619240690;
        gx.fmqn[643] = 2139666267;
        gx.fmqn[644] = -207524102;
        gx.fmqn[645] = 1196672029;
        gx.fmqn[646] = -1998249426;
        gx.fmqn[647] = 981661497;
        gx.fmqn[648] = 1016471884;
        gx.fmqn[649] = 666535510;
        gx.fmqn[650] = -125711942;
        gx.fmqn[651] = -486018148;
        gx.fmqn[652] = -1417435612;
        gx.fmqn[653] = 526227462;
        gx.fmqn[654] = 1698065233;
        gx.fmqn[655] = -1825408597;
        gx.fmqn[656] = -134886651;
        gx.fmqn[657] = -757555152;
        gx.fmqn[658] = -1847351633;
        gx.fmqn[659] = 662814877;
        gx.fmqn[660] = -1100872779;
        gx.fmqn[661] = 1008102;
        gx.fmqn[662] = -1672087823;
        gx.fmqn[663] = 346533685;
        gx.fmqn[664] = 133319233;
        gx.fmqn[665] = -1547419473;
        gx.fmqn[666] = -1905759830;
        gx.fmqn[667] = 1114154342;
        gx.fmqn[668] = -1820549632;
        gx.fmqn[669] = 1435185997;
        gx.fmqn[670] = 1623809253;
        gx.fmqn[671] = 461190978;
        gx.fmqn[672] = 2083235031;
        gx.fmqn[673] = -363230727;
        gx.fmqn[674] = 829470198;
        gx.fmqn[675] = -123888864;
        gx.fmqn[676] = -81972180;
        gx.fmqn[677] = 239486238;
        gx.fmqn[678] = -699027668;
        gx.fmqn[679] = -1375059461;
        gx.fmqn[680] = 32488966;
        gx.fmqn[681] = 319756704;
        gx.fmqn[682] = 1422195574;
        gx.fmqn[683] = 353196292;
        gx.fmqn[684] = -1155146264;
        gx.fmqn[685] = 520278230;
        gx.fmqn[686] = 690094889;
        gx.fmqn[687] = -2060282682;
        gx.fmqn[688] = 1968818710;
        gx.fmqn[689] = 1420565554;
        gx.fmqn[690] = -1584171499;
        gx.fmqn[691] = -1687929501;
        gx.fmqn[692] = 1405084845;
        gx.fmqn[693] = -2029193003;
        gx.fmqn[694] = -517125152;
        gx.fmqn[695] = -1738888160;
        gx.fmqn[696] = -888639806;
        gx.fmqn[697] = 189567077;
        gx.fmqn[698] = -1144273662;
        gx.fmqn[699] = -1737417687;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean wasRecentlyDamaged(class_1657 var1_1, long var2_2) {
        block25: {
            block24: {
                block23: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("forj", fmrp(int ), (int)171)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == gx.fmqp("fork", fmrd(int ), (int)663)) break;
                        v0 /* !! */  = (long)gx.fmqp("forl", fmrd(int ), (int)664);
                    }
                    var7_3 = gx.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("form", fmrp(int ), (int)172)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == gx.fmqp("forn", fmrd(int ), (int)665)) break;
                        v1 /* !! */  = (long)gx.fmqp("foro", fmrd(int ), (int)666);
                    }
                    var6_4 = gx.b;
                    v2 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl17
                    block14: while (true) {
                        v2 /* !! */  = (long)(v3 - gx.fmqp("forp", fmrp(int ), (int)173));
lbl17:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case 117703210: {
                                v3 = gx.fmqp("forq", fmrp(int ), (int)174);
                                continue block14;
                            }
                            case 388892338: {
                                v3 = gx.fmqp("forr", fmrp(int ), (int)175);
                                continue block14;
                            }
                            case 949954058: {
                                v3 = gx.fmqp("fors", fmrp(int ), (int)176);
                                continue block14;
                            }
                            case 1461008885: {
                                break block14;
                            }
                        }
                        break;
                    }
                    var5_5 = gx.a;
                    if (var7_3) {
                        throw null;
lbl32:
                        // 7 sources

                        return (boolean)gx.fmqp("fort", fmrd(int ), (int)667);
                    }
                    if (var5_5 || var5_5) ** GOTO lbl32
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = gx.mq - gx.fmqp("foru", fmrp(int ), (int)177)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == gx.fmqp("forv", fmrd(int ), (int)668)) break;
                        v4 /* !! */  = (long)gx.fmqp("forw", fmrd(int ), (int)669);
                    }
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_3 = gx.mq - gx.fmqp("forx", fmrp(int ), (int)178)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == gx.fmqp("fory", fmrd(int ), (int)670)) break;
                        v5 /* !! */  = (long)gx.fmqp("forz", fmrd(int ), (int)671);
                    }
                    v6 = var1_1.method_5667();
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_4 = gx.mq - gx.fmqp("fosa", fmrp(int ), (int)179)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == gx.fmqp("fosb", fmrd(int ), (int)672)) break;
                        v7 /* !! */  = (long)gx.fmqp("fosc", fmrd(int ), (int)673);
                    }
                    var4_6 = this.healthSnapshots.get(v6);
                    if (var5_5 || var5_5) ** GOTO lbl32
                    v8 /* !! */  = gx.mq;
                    if (true) ** GOTO lbl57
                    block19: while (true) {
                        v8 /* !! */  = (long)(v9 - gx.fmqp("fosd", fmrp(int ), (int)180));
lbl57:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1080231942: {
                                v9 = gx.fmqp("fose", fmrp(int ), (int)181);
                                continue block19;
                            }
                            case -573409157: {
                                v9 = gx.fmqp("fosf", fmrp(int ), (int)182);
                                continue block19;
                            }
                            case 1461008885: {
                                break block19;
                            }
                            case 1794602512: {
                                v9 = gx.fmqp("fosg", fmrp(int ), (int)183);
                                continue block19;
                            }
                        }
                        break;
                    }
                    if (var1_1.field_6235 > 0) break block23;
                    if (var5_5) ** GOTO lbl32
                    if (var4_6 == null) break block24;
                    if (var5_5) ** GOTO lbl32
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_5 = gx.mq - gx.fmqp("fosh", fmrp(int ), (int)184)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v10 /* !! */  == gx.fmqp("fosi", fmrd(int ), (int)674)) break;
                        v10 /* !! */  = (long)gx.fmqp("fosj", fmrd(int ), (int)675);
                    }
                    if (var2_2 - var4_6.lastDropAt > gx.fmqp("fosk", fmrp(int ), (int)185)) break block24;
                    if (var5_5) ** GOTO lbl32
                }
                if (var5_5 || var5_5) ** GOTO lbl32
                v11 = gx.fmqp("fosl", fmrd(int ), (int)676);
                if (var7_3) {
                    throw null;
                }
                break block25;
            }
            if (!var5_5 && !var5_5) ** break;
            ** while (true)
            v11 = gx.fmqp("fosm", fmrd(int ), (int)677);
        }
        return (boolean)v11;
    }

    private static /* synthetic */ void frtb() {
        gx.fmqo[1300] = 1716328693;
        gx.fmqo[1301] = -1838350121;
        gx.fmqo[1302] = -1141185477;
        gx.fmqo[1303] = -1211485093;
        gx.fmqo[1304] = 2101727258;
        gx.fmqo[1305] = 1795726254;
        gx.fmqo[1306] = -32747096;
        gx.fmqo[1307] = 390042643;
        gx.fmqo[1308] = -857656134;
        gx.fmqo[1309] = -761320631;
        gx.fmqo[1310] = 962332046;
        gx.fmqo[1311] = 582846674;
        gx.fmqo[1312] = 1672281321;
        gx.fmqo[1313] = 944928744;
        gx.fmqo[1314] = 517365218;
        gx.fmqo[1315] = -1737448045;
        gx.fmqo[1316] = -1797807082;
        gx.fmqo[1317] = 67027333;
        gx.fmqo[1318] = -241953906;
        gx.fmqo[1319] = -2019001087;
        gx.fmqo[1320] = 935712325;
        gx.fmqo[1321] = 1755209161;
        gx.fmqo[1322] = 999845749;
        gx.fmqo[1323] = -594773452;
        gx.fmqo[1324] = 1956570377;
        gx.fmqo[1325] = 1427282623;
        gx.fmqo[1326] = -588957218;
        gx.fmqo[1327] = -1457157481;
        gx.fmqo[1328] = -2084685884;
        gx.fmqo[1329] = -506818583;
        gx.fmqo[1330] = 759899735;
        gx.fmqo[1331] = -96803329;
        gx.fmqo[1332] = 1978037289;
        gx.fmqo[1333] = -1750416385;
        gx.fmqo[1334] = -832558340;
        gx.fmqo[1335] = 1722469995;
        gx.fmqo[1336] = -1694626037;
        gx.fmqo[1337] = -1891341126;
        gx.fmqo[1338] = -378808921;
        gx.fmqo[1339] = 160824771;
        gx.fmqo[1340] = 948550317;
        gx.fmqo[1341] = -1894030078;
        gx.fmqo[1342] = 1631819072;
        gx.fmqo[1343] = 1044415594;
        gx.fmqo[1344] = 1062311701;
        gx.fmqo[1345] = -1416381890;
        gx.fmqo[1346] = -1003844117;
        gx.fmqo[1347] = 972879032;
        gx.fmqo[1348] = 1648449874;
        gx.fmqo[1349] = -1274583856;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateLooting(long var1_1) {
        block111: {
            block113: {
                block112: {
                    block110: {
                        block109: {
                            var7_2 = gx.c;
                            var6_3 /* !! */  = gx.b;
                            var5_4 = gx.a;
                            if (var7_2) {
                                throw null;
lbl6:
                                // 28 sources

                                return;
                            }
                            if (var5_4 || var5_4) ** GOTO lbl6
                            if (!this.hasCollectedLoot()) break block109;
                            if (var5_4 || var5_4) ** GOTO lbl6
                            this.beginEscape(var1_1);
                            if (var5_4 || var5_4) ** GOTO lbl6
                            return;
                        }
                        if (var5_4 || var5_4) ** GOTO lbl6
                        var3_5 = this.trackedLootEntity();
                        if (var5_4 || var5_4) ** GOTO lbl6
                        if (var3_5 != null) break block110;
                        if (var5_4 || var5_4) ** GOTO lbl6
                        var3_5 = this.findBestLoot(gx.mc.field_1724.method_73189(), (double)gx.fmqp("fnin", fmxg(int ), (int)36));
                        if (var5_4 || var5_4) ** GOTO lbl6
                        if (var3_5 == null) break block110;
                        if (var5_4 || var5_4) ** GOTO lbl6
                        this.trackedLoot = var3_5.method_5667();
                        if (var5_4) ** GOTO lbl6
                    }
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (var3_5 == null) break block111;
                    if (var5_4 || var5_4) ** GOTO lbl6
                    this.lastLootSeenAt = var1_1;
                    if (var5_4 || var5_4) ** GOTO lbl6
                    this.watchedPosition = var3_5.method_73189();
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (!(gx.mc.field_1724.method_5858((class_1297)var3_5) > gx.fmqp("fnio", fmxg(int ), (int)37))) break block112;
                    if (var5_4 || var5_4) ** GOTO lbl6
                    this.finishLootPosition(var3_5);
                    if (var5_4 || var5_4) ** GOTO lbl6
                    if (!(gx.mc.field_1724.method_5858((class_1297)var3_5) > gx.fmqp("fnip", fmxg(int ), (int)38))) break block113;
                    if (var5_4 || var5_4) ** GOTO lbl6
                    this.retargetExploit(this.watchedPosition, var1_1);
                    if (var5_4) ** GOTO lbl6
                    if (var7_2) {
                        throw null;
                    }
                    break block113;
                }
                if (var5_4 || var5_4) ** GOTO lbl6
                this.stopOwnedExploit();
                if (var5_4 || var5_4) ** GOTO lbl6
                gx.mc.field_1724.method_18799(class_243.field_1353);
                if (var5_4) ** GOTO lbl6
            }
            if (var5_4 || var5_4) ** GOTO lbl6
            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl6
        var4_6 = this.findBestLoot(this.watchedPosition, (double)gx.fmqp("fnis", fmxg(int ), (int)39));
        if (var5_4 || var5_4) ** GOTO lbl6
        if (var4_6 == null) ** GOTO lbl69
        if (var5_4 || var5_4) ** GOTO lbl6
        this.trackedLoot = var4_6.method_5667();
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4 || var5_4) ** GOTO lbl6
                this.watchedPosition = var4_6.method_73189();
                if (var5_4 || var5_4) ** GOTO lbl6
                this.retargetExploit(this.watchedPosition, var1_1);
                if (var5_4) ** GOTO lbl6
lbl69:
                // 2 sources

                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)gx.fmqp("fniv", fmrd(int ), (int)331);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var6_3 /* !! */  = (int)gx.fmqp("fniw", fmrd(int ), (int)332);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 2: {
                var6_3 /* !! */  = (int)gx.fmqp("fnix", fmrd(int ), (int)333);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl87:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)gx.fmqp("fniy", fmrd(int ), (int)334);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl92:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)gx.fmqp("fnja", fmrd(int ), (int)335);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl97:
            // 3 sources

            case 5: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjb", fmrd(int ), (int)336);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 6: {
                var6_3 /* !! */  = (int)gx.fmqp("fnje", fmrd(int ), (int)337);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl107:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjf", fmrd(int ), (int)338);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 8: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjg", fmrd(int ), (int)339);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl117:
            // 2 sources

            case 9: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjh", fmrd(int ), (int)340);
                if (var7_2) {
                    throw null;
                }
            }
lbl121:
            // 5 sources

            case 10: {
                var6_3 /* !! */  = (int)gx.fmqp("fnji", fmrd(int ), (int)341);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl126:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjj", fmrd(int ), (int)342);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl230
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)gx.fmqp("fnjk", fmrd(int ), (int)343);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl177
                    break;
                }
            }
            case 13: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjm", fmrd(int ), (int)344);
                if (!var7_2) ** GOTO lbl92
                throw null;
            }
lbl141:
            // 2 sources

            case 14: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjo", fmrd(int ), (int)345);
                if (!var7_2) ** GOTO lbl121
                throw null;
            }
lbl145:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjp", fmrd(int ), (int)346);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl150:
            // 4 sources

            case 16: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjq", fmrd(int ), (int)347);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
            case 17: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjr", fmrd(int ), (int)348);
                if (!var7_2) ** GOTO lbl117
                throw null;
            }
lbl159:
            // 2 sources

            case 18: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjs", fmrd(int ), (int)349);
                if (!var7_2) ** GOTO lbl97
                throw null;
            }
            case 19: {
                var6_3 /* !! */  = (int)gx.fmqp("fnju", fmrd(int ), (int)350);
                if (!var7_2) ** GOTO lbl97
                throw null;
            }
            case 20: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjw", fmrd(int ), (int)351);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl268
            }
lbl172:
            // 3 sources

            case 21: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjx", fmrd(int ), (int)352);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl177:
            // 2 sources

            case 22: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjy", fmrd(int ), (int)353);
                if (!var7_2) ** GOTO lbl159
                throw null;
            }
lbl181:
            // 2 sources

            case 23: {
                var6_3 /* !! */  = (int)gx.fmqp("fnjz", fmrd(int ), (int)354);
                if (!var7_2) ** GOTO lbl107
                throw null;
            }
            case 24: {
                var6_3 /* !! */  = (int)gx.fmqp("fnka", fmrd(int ), (int)355);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl190:
            // 4 sources

            case 25: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkc", fmrd(int ), (int)356);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl195:
            // 4 sources

            case 26: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkd", fmrd(int ), (int)357);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 27: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkf", fmrd(int ), (int)358);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl205:
            // 2 sources

            case 28: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkg", fmrd(int ), (int)359);
                if (!var7_2) break;
                throw null;
            }
lbl209:
            // 2 sources

            case 29: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkh", fmrd(int ), (int)360);
                if (!var7_2) ** GOTO lbl145
                throw null;
            }
lbl213:
            // 5 sources

            case 30: {
                var6_3 /* !! */  = (int)gx.fmqp("fnki", fmrd(int ), (int)361);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl218:
            // 2 sources

            case 31: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkj", fmrd(int ), (int)362);
                if (!var7_2) ** GOTO lbl121
                throw null;
            }
lbl222:
            // 2 sources

            case 32: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkk", fmrd(int ), (int)363);
                if (!var7_2) ** GOTO lbl213
                throw null;
            }
lbl226:
            // 2 sources

            case 33: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkn", fmrd(int ), (int)364);
                if (!var7_2) ** GOTO lbl87
                throw null;
            }
lbl230:
            // 2 sources

            case 34: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkp", fmrd(int ), (int)365);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl298
            }
lbl235:
            // 2 sources

            case 35: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkr", fmrd(int ), (int)366);
                if (!var7_2) ** GOTO lbl126
                throw null;
            }
lbl239:
            // 2 sources

            case 36: {
                var6_3 /* !! */  = (int)gx.fmqp("fnks", fmrd(int ), (int)367);
                if (!var7_2) ** GOTO lbl235
                throw null;
            }
lbl243:
            // 3 sources

            case 37: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkt", fmrd(int ), (int)368);
                if (!var7_2) ** GOTO lbl150
                throw null;
            }
            case 38: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkv", fmrd(int ), (int)369);
                if (!var7_2) ** GOTO lbl190
                throw null;
            }
            case 39: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkw", fmrd(int ), (int)370);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl260
            }
lbl256:
            // 2 sources

            case 40: {
                var6_3 /* !! */  = (int)gx.fmqp("fnkx", fmrd(int ), (int)371);
                if (!var7_2) ** GOTO lbl195
                throw null;
            }
lbl260:
            // 3 sources

            case 41: {
                var6_3 /* !! */  = (int)gx.fmqp("fnla", fmrd(int ), (int)372);
                if (!var7_2) ** GOTO lbl226
                throw null;
            }
lbl264:
            // 2 sources

            case 42: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlb", fmrd(int ), (int)373);
                if (!var7_2) ** GOTO lbl195
                throw null;
            }
lbl268:
            // 2 sources

            case 43: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlc", fmrd(int ), (int)374);
                if (!var7_2) ** GOTO lbl213
                throw null;
            }
            case 44: {
                do {
                    var6_3 /* !! */  = (int)gx.fmqp("fnld", fmrd(int ), (int)375);
                } while (!var7_2);
                throw null;
            }
lbl277:
            // 2 sources

            case 45: {
                var6_3 /* !! */  = (int)gx.fmqp("fnle", fmrd(int ), (int)376);
                if (!var7_2) ** GOTO lbl195
                throw null;
            }
            case 46: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlf", fmrd(int ), (int)377);
                if (var7_2) {
                    throw null;
                }
            }
            case 47: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlg", fmrd(int ), (int)378);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl294
            }
            case 48: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlj", fmrd(int ), (int)379);
                if (!var7_2) ** GOTO lbl172
                throw null;
            }
lbl294:
            // 2 sources

            case 49: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlk", fmrd(int ), (int)380);
                if (!var7_2) ** GOTO lbl190
                throw null;
            }
lbl298:
            // 2 sources

            case 50: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlm", fmrd(int ), (int)381);
                if (!var7_2) ** GOTO lbl260
                throw null;
            }
lbl302:
            // 2 sources

            case 51: {
                var6_3 /* !! */  = (int)gx.fmqp("fnln", fmrd(int ), (int)382);
                if (!var7_2) ** GOTO lbl239
                throw null;
            }
lbl306:
            // 2 sources

            case 52: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlo", fmrd(int ), (int)383);
                if (!var7_2) ** GOTO lbl218
                throw null;
            }
            case 53: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlt", fmrd(int ), (int)384);
                if (!var7_2) ** GOTO lbl126
                throw null;
            }
lbl314:
            // 2 sources

            case 54: {
                var6_3 /* !! */  = (int)gx.fmqp("fnlu", fmrd(int ), (int)385);
                if (!var7_2) ** GOTO lbl243
                throw null;
            }
            case 55: 
        }
        var6_3 /* !! */  = (int)gx.fmqp("fnlw", fmrd(int ), (int)386);
        ** while (!var7_2)
lbl321:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gx.mq - gx.fmqp("fmsk", fmrp(int ), (int)11)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gx.fmqp("fmsl", fmrd(int ), (int)31)) break;
            v0 /* !! */  = (long)gx.fmqp("fmsm", fmrd(int ), (int)32);
        }
        var3_1 = gx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gx.mq - gx.fmqp("fmsn", fmrp(int ), (int)12)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gx.fmqp("fmso", fmrd(int ), (int)33)) break;
            v1 /* !! */  = (long)gx.fmqp("fmsp", fmrd(int ), (int)34);
        }
        var2_2 /* !! */  = gx.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = gx.mq;
                if (true) ** GOTO lbl22
                block20: while (true) {
                    v2 /* !! */  = (long)(v3 - gx.fmqp("fmsq", fmrp(int ), (int)13));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case 999836087: {
                            v3 = gx.fmqp("fmsr", fmrp(int ), (int)14);
                            continue block20;
                        }
                        case 1172047395: {
                            v3 = gx.fmqp("fmss", fmrp(int ), (int)15);
                            continue block20;
                        }
                        case 1461008885: {
                            break block20;
                        }
                        case 1849267223: {
                            v3 = gx.fmqp("fmst", fmrp(int ), (int)16);
                            continue block20;
                        }
                    }
                    break;
                }
                var1_3 = gx.a;
                if (var3_1) {
                    throw null;
lbl37:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl37
                v4 = gx.fmqp("fmsu", fmrd(int ), (int)35);
                v5 /* !! */  = gx.mq;
                if (true) ** GOTO lbl45
                block22: while (true) {
                    v5 /* !! */  = (long)(gx.fmqp("fmsw", fmrp(int ), (int)18) - gx.fmqp("fmsv", fmrp(int ), (int)17));
lbl45:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1461008885: {
                            break block22;
                        }
                        case 1472708687: {
                            continue block22;
                        }
                    }
                    break;
                }
                this.reset((boolean)v4);
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)gx.fmqp("fmsx", fmrd(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
            case 1: {
                var2_2 /* !! */  = (int)gx.fmqp("fmsy", fmrd(int ), (int)37);
                if (!var3_1) break;
                throw null;
            }
lbl62:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gx.fmqp("fmsz", fmrd(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)gx.fmqp("fmta", fmrd(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gx.fmqp("fmtb", fmrd(int ), (int)40);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)gx.fmqp("fmtc", fmrd(int ), (int)41);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void frow() {
        gx.fmqo[100] = -1544358336;
        gx.fmqo[101] = -41851162;
        gx.fmqo[102] = -1659141917;
        gx.fmqo[103] = -1483036066;
        gx.fmqo[104] = -1011935306;
        gx.fmqo[105] = -2031847873;
        gx.fmqo[106] = 78915903;
        gx.fmqo[107] = 1523655329;
        gx.fmqo[108] = 844117148;
        gx.fmqo[109] = -1087503796;
        gx.fmqo[110] = 1307219401;
        gx.fmqo[111] = -1919393942;
        gx.fmqo[112] = -1136280695;
        gx.fmqo[113] = -1825968142;
        gx.fmqo[114] = -1184958304;
        gx.fmqo[115] = 1330035953;
        gx.fmqo[116] = 1150076565;
        gx.fmqo[117] = 2146854430;
        gx.fmqo[118] = 831980193;
        gx.fmqo[119] = -123238593;
        gx.fmqo[120] = 1240300565;
        gx.fmqo[121] = 612670728;
        gx.fmqo[122] = -169808875;
        gx.fmqo[123] = -1266699358;
        gx.fmqo[124] = 2126494456;
        gx.fmqo[125] = -196986501;
        gx.fmqo[126] = 621564420;
        gx.fmqo[127] = -1475600434;
        gx.fmqo[128] = 2061246036;
        gx.fmqo[129] = 530168199;
        gx.fmqo[130] = 331734735;
        gx.fmqo[131] = -708798799;
        gx.fmqo[132] = -1422955219;
        gx.fmqo[133] = -556097620;
        gx.fmqo[134] = 1365330804;
        gx.fmqo[135] = -1852192223;
        gx.fmqo[136] = -109709726;
        gx.fmqo[137] = -102765768;
        gx.fmqo[138] = 586958847;
        gx.fmqo[139] = -655432560;
        gx.fmqo[140] = -1246796187;
        gx.fmqo[141] = 2131579173;
        gx.fmqo[142] = -438344098;
        gx.fmqo[143] = 5823488;
        gx.fmqo[144] = 2141246194;
        gx.fmqo[145] = -574005491;
        gx.fmqo[146] = 612130232;
        gx.fmqo[147] = 1672526397;
        gx.fmqo[148] = 1674916334;
        gx.fmqo[149] = 401398385;
        gx.fmqo[150] = 1019769395;
        gx.fmqo[151] = 874370040;
        gx.fmqo[152] = -1430459734;
        gx.fmqo[153] = 1378604853;
        gx.fmqo[154] = -1801146497;
        gx.fmqo[155] = 150125854;
        gx.fmqo[156] = 1607738854;
        gx.fmqo[157] = 2049430192;
        gx.fmqo[158] = 363513349;
        gx.fmqo[159] = 1417196946;
        gx.fmqo[160] = 500813427;
        gx.fmqo[161] = 1939755388;
        gx.fmqo[162] = -1555909079;
        gx.fmqo[163] = -38228708;
        gx.fmqo[164] = 1608742937;
        gx.fmqo[165] = 293799565;
        gx.fmqo[166] = 139553742;
        gx.fmqo[167] = 1228673696;
        gx.fmqo[168] = -242331462;
        gx.fmqo[169] = 1487722372;
        gx.fmqo[170] = -1573450210;
        gx.fmqo[171] = -1548819822;
        gx.fmqo[172] = -319027318;
        gx.fmqo[173] = -1578129239;
        gx.fmqo[174] = -842492015;
        gx.fmqo[175] = -395876410;
        gx.fmqo[176] = -990377456;
        gx.fmqo[177] = -374249262;
        gx.fmqo[178] = 1289420243;
        gx.fmqo[179] = -1977122774;
        gx.fmqo[180] = 355374011;
        gx.fmqo[181] = 798925671;
        gx.fmqo[182] = 73362735;
        gx.fmqo[183] = -292275187;
        gx.fmqo[184] = -481249424;
        gx.fmqo[185] = -81008480;
        gx.fmqo[186] = -2027096601;
        gx.fmqo[187] = 2027583265;
        gx.fmqo[188] = 1661742566;
        gx.fmqo[189] = 272346953;
        gx.fmqo[190] = 1632444526;
        gx.fmqo[191] = -1602985991;
        gx.fmqo[192] = 1582035702;
        gx.fmqo[193] = -761503051;
        gx.fmqo[194] = 706811470;
        gx.fmqo[195] = 2011740452;
        gx.fmqo[196] = -1081150700;
        gx.fmqo[197] = 2055527410;
        gx.fmqo[198] = -2043284148;
        gx.fmqo[199] = 336893822;
    }

    private static /* synthetic */ void frxt() {
        gx.fmrr[200] = -3502388421003510598L;
        gx.fmrr[201] = 7975252866982649712L;
        gx.fmrr[202] = 6143979394779416132L;
        gx.fmrr[203] = -6475945502976871362L;
        gx.fmrr[204] = 82694675973872941L;
        gx.fmrr[205] = -8896748935714485512L;
        gx.fmrr[206] = 4778027392521815527L;
        gx.fmrr[207] = 5189819471864845874L;
        gx.fmrr[208] = -3838209040325110684L;
        gx.fmrr[209] = -2966626371404335632L;
        gx.fmrr[210] = 7427079583883575431L;
        gx.fmrr[211] = -7556355032103671599L;
        gx.fmrr[212] = 2352959994884756171L;
        gx.fmrr[213] = -1242154297719516976L;
        gx.fmrr[214] = 315700669023508883L;
        gx.fmrr[215] = -6005303788613395434L;
        gx.fmrr[216] = -5929492664145672041L;
        gx.fmrr[217] = 8260528438750089690L;
        gx.fmrr[218] = 8085576930082173228L;
        gx.fmrr[219] = 1028824831556125731L;
        gx.fmrr[220] = -5518628725610152430L;
        gx.fmrr[221] = -1962465184035196640L;
        gx.fmrr[222] = 7869576431287206146L;
        gx.fmrr[223] = -3544632849367936478L;
        gx.fmrr[224] = -4294402435185294929L;
        gx.fmrr[225] = -3216073611333075535L;
        gx.fmrr[226] = 1422531151350716005L;
        gx.fmrr[227] = 3327190765038437611L;
        gx.fmrr[228] = 4461152344429896765L;
        gx.fmrr[229] = -6925861371805306701L;
        gx.fmrr[230] = -4872708576083767789L;
        gx.fmrr[231] = 1961130657718162897L;
        gx.fmrr[232] = 8202768990041238373L;
        gx.fmrr[233] = 7668702109573679850L;
        gx.fmrr[234] = -8321651739179399590L;
        gx.fmrr[235] = 8238930853191794728L;
        gx.fmrr[236] = -3289524719322302970L;
        gx.fmrr[237] = -7221385316181512935L;
        gx.fmrr[238] = -3489357770057795369L;
        gx.fmrr[239] = -1558150769918689175L;
        gx.fmrr[240] = 4974760100788073247L;
        gx.fmrr[241] = -2802187277515228319L;
        gx.fmrr[242] = -6432058840613915345L;
        gx.fmrr[243] = 1367359259030613115L;
        gx.fmrr[244] = -3385795378631078234L;
        gx.fmrr[245] = 8577400077279168560L;
        gx.fmrr[246] = 5938252700287428768L;
        gx.fmrr[247] = 420789417299403812L;
        gx.fmrr[248] = 2199563925737159231L;
        gx.fmrr[249] = -5425264131441551995L;
        gx.fmrr[250] = -5422865324558016328L;
        gx.fmrr[251] = -7923408295125611476L;
        gx.fmrr[252] = -6482394838949129582L;
        gx.fmrr[253] = -2380403129715267792L;
        gx.fmrr[254] = 5504063309768227281L;
        gx.fmrr[255] = -2414128062179823826L;
        gx.fmrr[256] = 2505615849313929272L;
        gx.fmrr[257] = -3611171748800268009L;
        gx.fmrr[258] = 1536301107829910782L;
        gx.fmrr[259] = 2333610001483061751L;
        gx.fmrr[260] = -3108789039883517439L;
        gx.fmrr[261] = 4661654793525653313L;
        gx.fmrr[262] = -8643840947815452649L;
        gx.fmrr[263] = -5301202606548246224L;
        gx.fmrr[264] = -8933120080471740556L;
        gx.fmrr[265] = -6795620848501419758L;
        gx.fmrr[266] = 6407789474252035141L;
        gx.fmrr[267] = 6266622114226137695L;
        gx.fmrr[268] = -8587019233452790544L;
        gx.fmrr[269] = 3185001530700318956L;
        gx.fmrr[270] = -6506958424046661410L;
        gx.fmrr[271] = 8768918964176825152L;
        gx.fmrr[272] = -2867368036548549515L;
        gx.fmrr[273] = 8286757157240049410L;
        gx.fmrr[274] = 8091977483714663456L;
        gx.fmrr[275] = -7383334345344909213L;
        gx.fmrr[276] = -1659378550724031661L;
        gx.fmrr[277] = -575865675624252150L;
        gx.fmrr[278] = -7902369743764092873L;
        gx.fmrr[279] = 4439090396083953156L;
        gx.fmrr[280] = 4500624493679000937L;
        gx.fmrr[281] = -6826453481273541155L;
        gx.fmrr[282] = -7108628509696962856L;
        gx.fmrr[283] = -4177157696189894663L;
        gx.fmrr[284] = 1591002661772486980L;
        gx.fmrr[285] = 6862480262548431857L;
        gx.fmrr[286] = -5169043158068109499L;
        gx.fmrr[287] = -3591325561091107148L;
        gx.fmrr[288] = 2782040735483835092L;
        gx.fmrr[289] = 97515675691984969L;
        gx.fmrr[290] = -1065653292800896800L;
        gx.fmrr[291] = -2629624818263993179L;
        gx.fmrr[292] = 2067690864370700336L;
        gx.fmrr[293] = -8317592493476158255L;
        gx.fmrr[294] = 8754415905489732257L;
        gx.fmrr[295] = 8209349485685372336L;
        gx.fmrr[296] = -8672072999273484906L;
        gx.fmrr[297] = -8288382340145132919L;
        gx.fmrr[298] = -6715398538670087114L;
        gx.fmrr[299] = 4745568950050883951L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void updateArmed(long var1_1) {
        var7_2 = gx.c;
        var6_3 /* !! */  = gx.b;
        var5_4 = gx.a;
        if (var7_2) {
            throw null;
        }
        if (var5_4 || var5_4) return;
        var3_5 = this.watchedEntity();
        if (var5_4 || var5_4) return;
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block53: while (true) {
            block124: {
                switch (cfr_temp_0 == -2147483648 ? var6_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_5 == null) ** GOTO lbl18
                        if (var5_4) return;
                        if (var3_5.method_5805()) ** GOTO lbl22
                        if (var5_4) return;
lbl18:
                        // 2 sources

                        if (var5_4 || var5_4) return;
                        this.handleMissingTarget(var1_1);
                        if (var5_4 || var5_4) return;
                        return;
lbl22:
                        // 1 sources

                        if (var5_4 || var5_4) return;
                        this.targetLostAt = (long)gx.fmqp("fmyr", fmrp(int ), (int)32);
                        if (var5_4 || var5_4) return;
                        this.watchedPosition = var3_5.method_73189();
                        if (var5_4 || var5_4) return;
                        var4_6 = np.total((class_1309)var3_5);
                        if (var5_4 || var5_4) return;
                        if (this.hasTotemInHands(var3_5)) ** GOTO lbl35
                        if (var5_4) return;
                        if (var4_6 > gx.fmqp("fmys", fmqm(int ), (int)172)) ** GOTO lbl35
                        if (var5_4) return;
                        if (this.isInActiveFight(var3_5, var1_1)) ** GOTO lbl39
                        if (var5_4) return;
lbl35:
                        // 3 sources

                        if (var5_4 || var5_4) return;
                        this.abortWatchedTarget();
                        if (var5_4 || var5_4) return;
                        return;
lbl39:
                        // 1 sources

                        if (var5_4 || var5_4) return;
                        if (!(var4_6 <= 1.0f)) ** GOTO lbl-1000
                        if (var5_4) return;
                        if (this.wasRecentlyDamaged(var3_5, var1_1)) {
                            if (var5_4 || var5_4) return;
                            this.lethalTicks += gx.fmqp("fmyt", fmrd(int ), (int)173);
                            if (var5_4) return;
                            if (var7_2) {
                                throw null;
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            if (var5_4 || var5_4) return;
                            this.lethalTicks = (int)gx.fmqp("fmyu", fmrd(int ), (int)174);
                            if (var5_4) return;
                        }
                        if (var5_4 || var5_4) return;
                        if (this.lethalTicks >= gx.fmqp("fmyv", fmrd(int ), (int)175)) {
                            if (var5_4 || var5_4) return;
                            this.state = gx$State.APPROACHING;
                            if (var5_4 || var5_4) return;
                            this.stateSince = var1_1;
                            if (var5_4 || var5_4) return;
                            this.startExploit(this.watchedPosition, var1_1);
                            if (var5_4 || var5_4) return;
                            pp.brandmessage("TpLoot \u043d\u0430\u0447\u0438\u043d\u0430\u044e \u043f\u043e\u0434\u0433\u043e\u0442\u043e\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0439 \u043a\u043b\u0438\u043f");
                            if (var5_4) return;
                        }
                        if (!var5_4 && !var5_4) return;
                        return;
                    }
                    case 4: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmza", fmrd(int ), (int)180);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmyy", fmrd(int ), (int)178);
                        cfr_temp_0 = 49;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 5: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzb", fmrd(int ), (int)181);
                        cfr_temp_0 = 29;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 11: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzh", fmrd(int ), (int)187);
                        cfr_temp_0 = 35;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 13: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzj", fmrd(int ), (int)189);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 19: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzp", fmrd(int ), (int)195);
                        cfr_temp_0 = 0;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 21: {
                        do {
                            var6_3 /* !! */  = (int)gx.fmqp("fmzr", fmrd(int ), (int)197);
                        } while (!var7_2);
                        throw null;
                    }
                    case 22: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzs", fmrd(int ), (int)198);
                        cfr_temp_0 = 46;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 27: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzx", fmrd(int ), (int)203);
                        cfr_temp_0 = 14;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 29: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzz", fmrd(int ), (int)205);
                        cfr_temp_0 = 46;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 31: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnab", fmrd(int ), (int)207);
                        cfr_temp_0 = 9;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 36: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnag", fmrd(int ), (int)212);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 32: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnac", fmrd(int ), (int)208);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzd", fmrd(int ), (int)183);
                        cfr_temp_0 = 35;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 37: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnah", fmrd(int ), (int)213);
                        cfr_temp_0 = 15;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 38: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnai", fmrd(int ), (int)214);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmze", fmrd(int ), (int)184);
                        cfr_temp_0 = 43;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 40: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnak", fmrd(int ), (int)216);
                        cfr_temp_0 = 23;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 41: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnal", fmrd(int ), (int)217);
                        cfr_temp_0 = 14;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 42: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnam", fmrd(int ), (int)218);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 30: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnaa", fmrd(int ), (int)206);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzk", fmrd(int ), (int)190);
                        cfr_temp_0 = 18;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 43: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnan", fmrd(int ), (int)219);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 18: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzo", fmrd(int ), (int)194);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmyz", fmrd(int ), (int)179);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzl", fmrd(int ), (int)191);
                        cfr_temp_0 = 33;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 46: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnaq", fmrd(int ), (int)222);
                        cfr_temp_0 = 12;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 47: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnas", fmrd(int ), (int)223);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        do {
                            var6_3 /* !! */  = (int)gx.fmqp("fmzc", fmrd(int ), (int)182);
                        } while (!var7_2);
                        throw null;
                    }
                    case 48: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnav", fmrd(int ), (int)224);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzf", fmrd(int ), (int)185);
                        cfr_temp_0 = 45;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 49: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnax", fmrd(int ), (int)225);
                        cfr_temp_0 = 0;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 50: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnay", fmrd(int ), (int)226);
                        if (var7_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmyw", fmrd(int ), (int)176);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 20: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzq", fmrd(int ), (int)196);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzi", fmrd(int ), (int)188);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 25: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzv", fmrd(int ), (int)201);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 33: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnad", fmrd(int ), (int)209);
                        cfr_temp_0 = 0;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 1: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmyx", fmrd(int ), (int)177);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 35: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnaf", fmrd(int ), (int)211);
                        cfr_temp_0 = 1;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 10: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzg", fmrd(int ), (int)186);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 45: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnap", fmrd(int ), (int)221);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 26: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzw", fmrd(int ), (int)202);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 24: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzu", fmrd(int ), (int)200);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 39: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnaj", fmrd(int ), (int)215);
                        cfr_temp_0 = 10;
                        if (var7_2) {
                            throw null;
                        }
                        break block124;
                    }
                    case 16: lbl-1000:
                    // 2 sources

                    {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzm", fmrd(int ), (int)192);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 23: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzt", fmrd(int ), (int)199);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var6_3 /* !! */  = (int)gx.fmqp("fmzn", fmrd(int ), (int)193);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 34: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnae", fmrd(int ), (int)210);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 44: {
                        var6_3 /* !! */  = (int)gx.fmqp("fnao", fmrd(int ), (int)220);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 28: 
                }
                ** GOTO lbl315
            }
            do {
                if (true) continue block53;
lbl315:
                // 2 sources

                var6_3 /* !! */  = (int)gx.fmqp("fmzy", fmrd(int ), (int)204);
                cfr_temp_0 = 16;
            } while (!var7_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void frry() {
        gx.fmqo[1100] = 1641186179;
        gx.fmqo[1101] = -1230707952;
        gx.fmqo[1102] = 1020080227;
        gx.fmqo[1103] = -1597045001;
        gx.fmqo[1104] = -1149278335;
        gx.fmqo[1105] = 1924505299;
        gx.fmqo[1106] = 1050859005;
        gx.fmqo[1107] = 1480834226;
        gx.fmqo[1108] = 826254080;
        gx.fmqo[1109] = 1972007453;
        gx.fmqo[1110] = -1502349418;
        gx.fmqo[1111] = -227601450;
        gx.fmqo[1112] = 1231607278;
        gx.fmqo[1113] = -1204883262;
        gx.fmqo[1114] = 779714829;
        gx.fmqo[1115] = 1682295114;
        gx.fmqo[1116] = -2090302159;
        gx.fmqo[1117] = 310940919;
        gx.fmqo[1118] = 942852037;
        gx.fmqo[1119] = -1567175757;
        gx.fmqo[1120] = -828218399;
        gx.fmqo[1121] = 660922552;
        gx.fmqo[1122] = 1796206132;
        gx.fmqo[1123] = 26191700;
        gx.fmqo[1124] = 1867008897;
        gx.fmqo[1125] = 1857272539;
        gx.fmqo[1126] = -1871482318;
        gx.fmqo[1127] = 696502345;
        gx.fmqo[1128] = 2114029783;
        gx.fmqo[1129] = -1851798034;
        gx.fmqo[1130] = 337205839;
        gx.fmqo[1131] = -374940303;
        gx.fmqo[1132] = 1774967193;
        gx.fmqo[1133] = 1128265729;
        gx.fmqo[1134] = 588711254;
        gx.fmqo[1135] = 1046615466;
        gx.fmqo[1136] = 1226087299;
        gx.fmqo[1137] = -1173052378;
        gx.fmqo[1138] = -1012742154;
        gx.fmqo[1139] = 1411618471;
        gx.fmqo[1140] = -733946721;
        gx.fmqo[1141] = -1857826969;
        gx.fmqo[1142] = -294671417;
        gx.fmqo[1143] = 1230760186;
        gx.fmqo[1144] = -1410234945;
        gx.fmqo[1145] = 793291169;
        gx.fmqo[1146] = 150105448;
        gx.fmqo[1147] = -613940814;
        gx.fmqo[1148] = 1404015092;
        gx.fmqo[1149] = -1587470301;
        gx.fmqo[1150] = 326056072;
        gx.fmqo[1151] = 248708793;
        gx.fmqo[1152] = -313093405;
        gx.fmqo[1153] = 1412856542;
        gx.fmqo[1154] = 123568137;
        gx.fmqo[1155] = -532757636;
        gx.fmqo[1156] = 571145730;
        gx.fmqo[1157] = 104650716;
        gx.fmqo[1158] = 567118894;
        gx.fmqo[1159] = -800094490;
        gx.fmqo[1160] = -32600127;
        gx.fmqo[1161] = -1453890765;
        gx.fmqo[1162] = -26245026;
        gx.fmqo[1163] = 1689962447;
        gx.fmqo[1164] = 1185847535;
        gx.fmqo[1165] = 587670173;
        gx.fmqo[1166] = 2060921128;
        gx.fmqo[1167] = 921474230;
        gx.fmqo[1168] = 1728003676;
        gx.fmqo[1169] = 914515527;
        gx.fmqo[1170] = 1296379527;
        gx.fmqo[1171] = 1099766446;
        gx.fmqo[1172] = -786919746;
        gx.fmqo[1173] = -1282280727;
        gx.fmqo[1174] = -821016986;
        gx.fmqo[1175] = -1805930602;
        gx.fmqo[1176] = 2103616801;
        gx.fmqo[1177] = 1707304916;
        gx.fmqo[1178] = -1929330937;
        gx.fmqo[1179] = -1317589455;
        gx.fmqo[1180] = -198376538;
        gx.fmqo[1181] = -1380629153;
        gx.fmqo[1182] = -33599648;
        gx.fmqo[1183] = 579689541;
        gx.fmqo[1184] = 56821683;
        gx.fmqo[1185] = 1997884962;
        gx.fmqo[1186] = 660469026;
        gx.fmqo[1187] = -1270571776;
        gx.fmqo[1188] = -840645805;
        gx.fmqo[1189] = 102684763;
        gx.fmqo[1190] = 733885162;
        gx.fmqo[1191] = 463855899;
        gx.fmqo[1192] = 986130821;
        gx.fmqo[1193] = -483086400;
        gx.fmqo[1194] = -1411847543;
        gx.fmqo[1195] = -878414596;
        gx.fmqo[1196] = 455772921;
        gx.fmqo[1197] = 1306050479;
        gx.fmqo[1198] = 770417322;
        gx.fmqo[1199] = -610066784;
    }
}

