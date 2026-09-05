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
import ruhack.phobia.nm;
import ruhack.phobia.ov;
import ruhack.phobia.ow;
import ruhack.phobia.oy;

public class ig
extends hx {
    public static final long lj = -3487039319486521010L;
    private static final float WANDER_THETA = 0.048f;
    private float wanderPitch;
    private static long[] evyy;
    private float noisePitch;
    private int pursueStreak;
    private static int[] evzg;
    private float lastRemPitch;
    private int combatTicks;
    private int attacksSinceBreak;
    private static final int POST_HIT_WINDOW = 1;
    private static int[] evzf;
    public static final int b;
    private int postHitTicks;
    public static final boolean a;
    private int nextWindowBreakAt;
    private int rotationTicks;
    private static final float TREMOR_THETA = 0.24f;
    private float wanderYaw;
    private int recoverTicks;
    private int windowBreakTicks;
    private float lastStepPitch;
    private int lastAttackCount;
    public static final boolean c;
    private int lockSkewTicks;
    private int ticksSinceWindowBreak;
    private static final float TREMOR_SIGMA = 0.39f;
    private float lastStepYaw;
    private static long[] evyx;
    private boolean lockSkewYaw;
    private float lastCloseRatio;
    private int lastEntityId;
    private float noiseYaw;
    private float lastRemYaw;
    private static final float WANDER_SIGMA = 0.12f;
    private static final int COMBAT_SEQUENCE = 40;
    private float speedDrift;
    private final Random random;
    private int spikeGuardTicks;

    private static /* synthetic */ void ezam() {
        ig.evzf[300] = -1967558409;
        ig.evzf[301] = -582440330;
        ig.evzf[302] = 523644641;
        ig.evzf[303] = 1247543591;
        ig.evzf[304] = 1449401310;
        ig.evzf[305] = 912387334;
        ig.evzf[306] = 1281060936;
        ig.evzf[307] = -1356607146;
        ig.evzf[308] = 375453786;
        ig.evzf[309] = -1511698215;
        ig.evzf[310] = 1232812926;
        ig.evzf[311] = 643958063;
        ig.evzf[312] = 751501443;
        ig.evzf[313] = -1141602827;
        ig.evzf[314] = -1009113853;
        ig.evzf[315] = -1676179203;
        ig.evzf[316] = -1176891633;
        ig.evzf[317] = -1874274619;
        ig.evzf[318] = -67806734;
        ig.evzf[319] = -1601338906;
        ig.evzf[320] = -1894010150;
        ig.evzf[321] = 2068581396;
        ig.evzf[322] = -816572323;
        ig.evzf[323] = -436549642;
        ig.evzf[324] = -1059391740;
        ig.evzf[325] = 190077874;
        ig.evzf[326] = -240304281;
        ig.evzf[327] = -556119480;
        ig.evzf[328] = 555618545;
        ig.evzf[329] = 591633750;
        ig.evzf[330] = -959071176;
        ig.evzf[331] = -822726986;
        ig.evzf[332] = 1052368506;
        ig.evzf[333] = -1928701386;
        ig.evzf[334] = -1127729486;
        ig.evzf[335] = 1661330628;
        ig.evzf[336] = 577289797;
        ig.evzf[337] = 1402168901;
        ig.evzf[338] = -1385868982;
        ig.evzf[339] = -1074037147;
        ig.evzf[340] = 617816930;
        ig.evzf[341] = 1688540837;
        ig.evzf[342] = 1703888731;
        ig.evzf[343] = -973142459;
        ig.evzf[344] = -531769025;
        ig.evzf[345] = 143742708;
        ig.evzf[346] = -1707424832;
        ig.evzf[347] = -1310941386;
        ig.evzf[348] = -1996817339;
        ig.evzf[349] = -346155260;
        ig.evzf[350] = 792347031;
        ig.evzf[351] = 882157831;
        ig.evzf[352] = 1261961872;
        ig.evzf[353] = -979114014;
        ig.evzf[354] = 237523019;
        ig.evzf[355] = -1039451308;
        ig.evzf[356] = -1273732630;
        ig.evzf[357] = 855159829;
        ig.evzf[358] = -383219796;
        ig.evzf[359] = 533112940;
        ig.evzf[360] = 1865527253;
        ig.evzf[361] = 1016656076;
        ig.evzf[362] = 478020465;
        ig.evzf[363] = -377298072;
        ig.evzf[364] = -1171830311;
        ig.evzf[365] = 1633793160;
        ig.evzf[366] = -1636714224;
        ig.evzf[367] = -1118178970;
        ig.evzf[368] = 210818697;
        ig.evzf[369] = 72518199;
        ig.evzf[370] = 770834915;
        ig.evzf[371] = 1520421379;
        ig.evzf[372] = 1854946824;
        ig.evzf[373] = -1057622231;
        ig.evzf[374] = 150478742;
        ig.evzf[375] = 663897888;
        ig.evzf[376] = 1929437853;
        ig.evzf[377] = 226230921;
        ig.evzf[378] = -1420320004;
        ig.evzf[379] = 551816617;
        ig.evzf[380] = -2145176095;
        ig.evzf[381] = 759313255;
        ig.evzf[382] = -395907050;
        ig.evzf[383] = 624136048;
        ig.evzf[384] = 241498316;
        ig.evzf[385] = -398925123;
        ig.evzf[386] = 221206927;
        ig.evzf[387] = 1005423643;
        ig.evzf[388] = 1784398330;
        ig.evzf[389] = -330448105;
        ig.evzf[390] = 1086744350;
        ig.evzf[391] = -450054757;
        ig.evzf[392] = -900951830;
        ig.evzf[393] = -1711274872;
        ig.evzf[394] = -1537641389;
        ig.evzf[395] = -1793174845;
        ig.evzf[396] = -1309372030;
        ig.evzf[397] = 885161496;
        ig.evzf[398] = -1886413274;
        ig.evzf[399] = 1133385800;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void scheduleWindowBreak() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("ewdh", evyw(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ig.evza("ewdi", evzk(int ), (int)86)) break;
            v0 /* !! */  = (long)ig.evza("ewdj", evzk(int ), (int)87);
        }
        var3_1 = ig.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("ewdk", evyw(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ig.evza("ewdl", evzk(int ), (int)88)) break;
            v1 /* !! */  = (long)ig.evza("ewdm", evzk(int ), (int)89);
        }
        var2_2 /* !! */  = ig.b;
        v2 /* !! */  = ig.lj;
        if (true) ** GOTO lbl19
        block46: while (true) {
            v2 /* !! */  = (long)(v3 - ig.evza("ewdn", evyw(int ), (int)12));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -906848669: {
                    v3 = ig.evza("ewdo", evyw(int ), (int)13);
                    continue block46;
                }
                case -869293746: {
                    break block46;
                }
                case 576978907: {
                    v3 = ig.evza("ewpq", evyw(int ), (int)14);
                    continue block46;
                }
                case 1829451321: {
                    v3 = ig.evza("ewpr", evyw(int ), (int)15);
                    continue block46;
                }
            }
            break;
        }
        var1_3 = ig.a;
        if (var3_1) {
            throw null;
lbl34:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        v4 = ig.evza("ewps", evzk(int ), (int)90);
        v5 /* !! */  = ig.lj;
        if (true) ** GOTO lbl42
        block48: while (true) {
            v5 /* !! */  = (long)(v6 - ig.evza("ewpt", evyw(int ), (int)16));
lbl42:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2100300600: {
                    v6 = ig.evza("ewpu", evyw(int ), (int)17);
                    continue block48;
                }
                case -869293746: {
                    break block48;
                }
                case -460328477: {
                    v6 = ig.evza("ewpv", evyw(int ), (int)18);
                    continue block48;
                }
            }
            break;
        }
        this.ticksSinceWindowBreak = (int)v4;
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl34
                v7 = ig.evza("ewpw", evzk(int ), (int)91);
                v8 /* !! */  = ig.lj;
                if (true) ** GOTO lbl62
                block49: while (true) {
                    v8 /* !! */  = (long)(ig.evza("ewpy", evyw(int ), (int)20) - ig.evza("ewpx", evyw(int ), (int)19));
lbl62:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -869293746: {
                            break block49;
                        }
                        case 901009494: {
                            continue block49;
                        }
                    }
                    break;
                }
                v9 = ig.evza("ewpz", evzk(int ), (int)92);
                v10 /* !! */  = ig.lj;
                if (true) ** GOTO lbl72
                block50: while (true) {
                    v10 /* !! */  = (long)(v11 - ig.evza("ewqa", evyw(int ), (int)21));
lbl72:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -869293746: {
                            break block50;
                        }
                        case 167083872: {
                            v11 = ig.evza("ewqb", evyw(int ), (int)22);
                            continue block50;
                        }
                        case 387197192: {
                            v11 = ig.evza("ewqc", evyw(int ), (int)23);
                            continue block50;
                        }
                        case 2102001455: {
                            v11 = ig.evza("ewqd", evyw(int ), (int)24);
                            continue block50;
                        }
                    }
                    break;
                }
                v12 = v7 + this.random.nextInt((int)v9);
                v13 /* !! */  = ig.lj;
                if (true) ** GOTO lbl89
                block51: while (true) {
                    v13 /* !! */  = (long)(v14 - ig.evza("ewqe", evyw(int ), (int)25));
lbl89:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -869293746: {
                            break block51;
                        }
                        case -491742701: {
                            v14 = ig.evza("ewqf", evyw(int ), (int)26);
                            continue block51;
                        }
                        case -170207993: {
                            v14 = ig.evza("ewqg", evyw(int ), (int)27);
                            continue block51;
                        }
                        case 1933253203: {
                            v14 = ig.evza("ewqh", evyw(int ), (int)28);
                            continue block51;
                        }
                    }
                    break;
                }
                this.nextWindowBreakAt = (int)v12;
                if (var1_3 || var1_3) ** GOTO lbl34
                v15 = ig.evza("ewqi", evzk(int ), (int)93);
                v16 /* !! */  = ig.lj;
                if (true) ** GOTO lbl108
                block52: while (true) {
                    v16 /* !! */  = (long)(v17 - ig.evza("ewqj", evyw(int ), (int)29));
lbl108:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -869293746: {
                            break block52;
                        }
                        case 1483402470: {
                            v17 = ig.evza("ewqk", evyw(int ), (int)30);
                            continue block52;
                        }
                        case 1743638344: {
                            v17 = ig.evza("ewql", evyw(int ), (int)31);
                            continue block52;
                        }
                    }
                    break;
                }
                this.windowBreakTicks = (int)v15;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ig.evza("ewqm", evzk(int ), (int)94);
                if (var3_1) {
                    throw null;
                }
            }
lbl125:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ig.evza("ewqn", evzk(int ), (int)95);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl130:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ig.evza("ewqo", evzk(int ), (int)96);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl159
                    break;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)ig.evza("ewqp", evzk(int ), (int)97);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
lbl141:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)ig.evza("ewqq", evzk(int ), (int)98);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ig.evza("ewqr", evzk(int ), (int)99);
                if (!var3_1) ** GOTO lbl141
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ig.evza("ewqs", evzk(int ), (int)100);
                if (!var3_1) ** GOTO lbl130
                throw null;
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)ig.evza("ewqt", evzk(int ), (int)101);
                } while (!var3_1);
                throw null;
            }
lbl159:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)ig.evza("ewqu", evzk(int ), (int)102);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)ig.evza("ewqv", evzk(int ), (int)103);
        ** while (!var3_1)
lbl166:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ezjq() {
        ig.evzg[500] = -653144082;
        ig.evzg[501] = 10488618;
        ig.evzg[502] = 1837384556;
        ig.evzg[503] = -745865512;
        ig.evzg[504] = 759787483;
        ig.evzg[505] = -67281702;
        ig.evzg[506] = 522976179;
        ig.evzg[507] = -1048998229;
        ig.evzg[508] = 525104377;
        ig.evzg[509] = -1812752354;
        ig.evzg[510] = 1789039000;
        ig.evzg[511] = -1256668392;
        ig.evzg[512] = -1060125107;
        ig.evzg[513] = -188335586;
        ig.evzg[514] = 965772795;
        ig.evzg[515] = 1182012393;
        ig.evzg[516] = 582255727;
        ig.evzg[517] = -206781858;
        ig.evzg[518] = -1871076654;
        ig.evzg[519] = -807706214;
        ig.evzg[520] = -622884515;
        ig.evzg[521] = 1474074618;
        ig.evzg[522] = -560025323;
        ig.evzg[523] = -1889098179;
        ig.evzg[524] = 1684574604;
        ig.evzg[525] = 1677033267;
        ig.evzg[526] = -1066395140;
        ig.evzg[527] = 579424413;
        ig.evzg[528] = 1584030272;
        ig.evzg[529] = -998153431;
        ig.evzg[530] = 1408034668;
        ig.evzg[531] = -807555674;
        ig.evzg[532] = -1736539876;
        ig.evzg[533] = -1677690902;
        ig.evzg[534] = 336385966;
        ig.evzg[535] = -2098002940;
        ig.evzg[536] = 696537340;
        ig.evzg[537] = -2063140693;
        ig.evzg[538] = -687114143;
        ig.evzg[539] = -43039223;
        ig.evzg[540] = 1459398658;
        ig.evzg[541] = 260179540;
        ig.evzg[542] = -1638564686;
        ig.evzg[543] = 712998355;
        ig.evzg[544] = 104870639;
        ig.evzg[545] = 999123521;
        ig.evzg[546] = 1966654153;
        ig.evzg[547] = -1281337427;
        ig.evzg[548] = -1905772109;
        ig.evzg[549] = -1969471162;
        ig.evzg[550] = 1753922694;
        ig.evzg[551] = -1837470027;
        ig.evzg[552] = -1624860346;
        ig.evzg[553] = 2069025524;
        ig.evzg[554] = 1686122348;
        ig.evzg[555] = -383500353;
        ig.evzg[556] = 927139512;
        ig.evzg[557] = 898636058;
        ig.evzg[558] = 1781301213;
        ig.evzg[559] = -1831475591;
        ig.evzg[560] = 1379987335;
        ig.evzg[561] = 654949262;
        ig.evzg[562] = 1926101895;
        ig.evzg[563] = -1321662257;
        ig.evzg[564] = -1726837968;
        ig.evzg[565] = -1379564499;
        ig.evzg[566] = -1888495842;
        ig.evzg[567] = -1472097135;
        ig.evzg[568] = 1660088840;
        ig.evzg[569] = 1223135007;
        ig.evzg[570] = 1723978571;
        ig.evzg[571] = 438448977;
        ig.evzg[572] = 717901131;
        ig.evzg[573] = 1107082079;
        ig.evzg[574] = 1552989411;
        ig.evzg[575] = 1085905041;
        ig.evzg[576] = 404518005;
        ig.evzg[577] = 1029513082;
        ig.evzg[578] = 491404380;
        ig.evzg[579] = -1744564706;
        ig.evzg[580] = -1179415600;
        ig.evzg[581] = -2017818986;
        ig.evzg[582] = 1604954236;
        ig.evzg[583] = -269557066;
        ig.evzg[584] = -918718386;
        ig.evzg[585] = 1974155701;
        ig.evzg[586] = -967651246;
        ig.evzg[587] = 1369546480;
        ig.evzg[588] = 187448472;
        ig.evzg[589] = 1883347259;
        ig.evzg[590] = 1845162090;
        ig.evzg[591] = 1999316061;
        ig.evzg[592] = -1164536986;
        ig.evzg[593] = -876262739;
        ig.evzg[594] = -502315205;
        ig.evzg[595] = 314514153;
        ig.evzg[596] = -1630053616;
        ig.evzg[597] = -1146421573;
        ig.evzg[598] = -1664353052;
        ig.evzg[599] = -1634578297;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov commitStep(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, boolean var10_10, boolean var11_11) {
        var21_12 = ig.c;
        var20_13 /* !! */  = ig.b;
        var19_14 = ig.a;
        if (var20_13 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_13 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var21_12) {
                    throw null;
lbl9:
                    // 74 sources

                    return null;
                }
                if (var19_14 || var19_14) ** GOTO lbl9
                var12_15 = this.quantizeDelta(var5_5);
                if (var19_14 || var19_14) ** GOTO lbl9
                var13_16 = this.quantizeDelta(var6_6);
                if (var19_14 || var19_14) ** GOTO lbl9
                if (var11_11) {
                    v0 = ig.evza("extk", evzd(int ), (int)654);
                    if (var21_12) {
                        throw null;
                    }
                } else {
                    v0 = ig.evza("extl", evzd(int ), (int)655);
                }
                if (var11_11) {
                    v1 = ig.evza("extm", evzd(int ), (int)656);
                    if (var21_12) {
                        throw null;
                    }
                } else {
                    v1 = ig.evza("extn", evzd(int ), (int)657);
                }
                var12_15 = class_3532.method_15363((float)var12_15, (float)v0, (float)v1);
                if (var19_14 || var19_14) ** GOTO lbl9
                if (var11_11) {
                    v2 = ig.evza("exto", evzd(int ), (int)658);
                    if (var21_12) {
                        throw null;
                    }
                } else {
                    v2 = ig.evza("extp", evzd(int ), (int)659);
                }
                if (var11_11) {
                    v3 = ig.evza("extq", evzd(int ), (int)660);
                    if (var21_12) {
                        throw null;
                    }
                } else {
                    v3 = ig.evza("extr", evzd(int ), (int)661);
                }
                var13_16 = class_3532.method_15363((float)var13_16, (float)v2, (float)v3);
                if (var19_14 || var19_14) ** GOTO lbl9
                if (!var11_11) ** GOTO lbl59
                if (var19_14 || var19_14) ** GOTO lbl9
                var14_17 = Math.abs(var12_15) / (Math.abs(var2_2) + ig.evza("exts", evzd(int ), (int)662));
                if (var19_14 || var19_14) ** GOTO lbl9
                var15_18 = Math.abs(var13_16) / (Math.abs(var3_3) + ig.evza("extt", evzd(int ), (int)663));
                if (var19_14 || var19_14) ** GOTO lbl9
                if (!(var14_17 > ig.evza("extu", evzd(int ), (int)664))) ** GOTO lbl54
                if (var19_14) ** GOTO lbl9
                var12_15 = this.quantizeDelta(var12_15 * this.lerp((float)ig.evza("extv", evzd(int ), (int)665), (float)ig.evza("extw", evzd(int ), (int)666)));
                if (var19_14) ** GOTO lbl9
lbl54:
                // 2 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                if (!(var15_18 > ig.evza("extx", evzd(int ), (int)667))) ** GOTO lbl59
                if (var19_14) ** GOTO lbl9
                var13_16 = this.quantizeDelta(var13_16 * this.lerp((float)ig.evza("exty", evzd(int ), (int)668), (float)ig.evza("extz", evzd(int ), (int)669)));
                if (var19_14) ** GOTO lbl9
lbl59:
                // 3 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                var14_17 = var4_4 * var4_4 + ig.evza("exua", evzd(int ), (int)670);
                if (var19_14 || var19_14) ** GOTO lbl9
                var15_18 = (var12_15 * var2_2 + var13_16 * var3_3) / var14_17;
                if (var19_14 || var19_14) ** GOTO lbl9
                var16_19 = (float)Math.hypot(var12_15, var13_16);
                if (var19_14 || var19_14) ** GOTO lbl9
                if (!var11_11) ** GOTO lbl82
                if (var19_14) ** GOTO lbl9
                if (!(var4_4 < ig.evza("exub", evzd(int ), (int)671))) ** GOTO lbl82
                if (var19_14) ** GOTO lbl9
                if (!(var15_18 > ig.evza("exuc", evzd(int ), (int)672))) ** GOTO lbl82
                if (var19_14 || var19_14) ** GOTO lbl9
                var17_20 = this.deflectStep(var2_2, var3_3, var4_4, var15_18, var12_15, var13_16);
                if (var19_14 || var19_14) ** GOTO lbl9
                var12_15 = this.quantizeDelta(var17_20[0]);
                if (var19_14 || var19_14) ** GOTO lbl9
                var13_16 = this.quantizeDelta(var17_20[1]);
                if (var19_14 || var19_14) ** GOTO lbl9
                var16_19 = (float)Math.hypot(var12_15, var13_16);
                if (var19_14 || var19_14) ** GOTO lbl9
                var15_18 = (var12_15 * var2_2 + var13_16 * var3_3) / var14_17;
                if (var19_14) ** GOTO lbl9
lbl82:
                // 4 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                if (!var11_11) ** GOTO lbl99
                if (var19_14) ** GOTO lbl9
                if (!(var4_4 < ig.evza("exud", evzd(int ), (int)673))) ** GOTO lbl99
                if (var19_14) ** GOTO lbl9
                if (!(var15_18 > ig.evza("exue", evzd(int ), (int)674))) ** GOTO lbl99
                if (var19_14 || var19_14) ** GOTO lbl9
                var17_20 = this.deflectStep(var2_2, var3_3, var4_4, var15_18, var12_15, var13_16);
                if (var19_14 || var19_14) ** GOTO lbl9
                var12_15 = this.quantizeDelta(var17_20[0] * this.lerp((float)ig.evza("exuf", evzd(int ), (int)675), (float)ig.evza("exug", evzd(int ), (int)676)));
                if (var19_14 || var19_14) ** GOTO lbl9
                var13_16 = this.quantizeDelta(var17_20[1] * this.lerp((float)ig.evza("exuh", evzd(int ), (int)677), (float)ig.evza("exui", evzd(int ), (int)678)));
                if (var19_14 || var19_14) ** GOTO lbl9
                var16_19 = (float)Math.hypot(var12_15, var13_16);
                if (var19_14 || var19_14) ** GOTO lbl9
                var15_18 = (var12_15 * var2_2 + var13_16 * var3_3) / var14_17;
                if (var19_14) ** GOTO lbl9
lbl99:
                // 4 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                if (!var11_11) ** GOTO lbl133
                if (var19_14) ** GOTO lbl9
                if (!(var4_4 < ig.evza("exuj", evzd(int ), (int)679))) ** GOTO lbl133
                if (var19_14) ** GOTO lbl9
                if (!(var15_18 > ig.evza("exuk", evzd(int ), (int)680))) ** GOTO lbl133
                if (var19_14 || var19_14) ** GOTO lbl9
                this.lockSkewTicks = (int)ig.evza("exul", evzk(int ), (int)681);
                if (var19_14 || var19_14) ** GOTO lbl9
                if (!this.lockSkewYaw) {
                    v4 /* !! */  = ig.evza("exum", evzk(int ), (int)682);
                    if (var21_12) {
                        throw null;
                    }
                } else {
                    this.lockSkewYaw = ig.evza("exun", evzk(int ), (int)683);
                    v4 /* !! */  = (CallSite)this.lockSkewYaw;
                }
                if (var19_14 || var19_14) ** GOTO lbl9
                this.lastCloseRatio = 0.0f;
                if (var19_14 || var19_14) ** GOTO lbl9
                this.lastStepPitch = 0.0f;
                this.lastStepYaw = 0.0f;
                if (var19_14 || var19_14) ** GOTO lbl9
                var17_21 = var2_2 / (var4_4 + ig.evza("exuo", evzd(int ), (int)684));
                if (var19_14 || var19_14) ** GOTO lbl9
                var18_23 = var3_3 / (var4_4 + ig.evza("exup", evzd(int ), (int)685));
                if (var19_14 || var19_14) ** GOTO lbl9
                var12_15 = this.quantizeDelta(-var18_23 * this.lerp((float)ig.evza("exuq", evzd(int ), (int)686), (float)ig.evza("exur", evzd(int ), (int)687)) + var7_7);
                if (var19_14 || var19_14) ** GOTO lbl9
                var13_16 = this.quantizeDelta(var17_21 * this.lerp((float)ig.evza("exus", evzd(int ), (int)688), (float)ig.evza("exut", evzd(int ), (int)689)) + var8_8);
                if (var19_14 || var19_14) ** GOTO lbl9
                var16_19 = (float)Math.hypot(var12_15, var13_16);
                if (var19_14 || var19_14) ** GOTO lbl9
                var15_18 = (var12_15 * var2_2 + var13_16 * var3_3) / var14_17;
                if (var19_14) ** GOTO lbl9
lbl133:
                // 4 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                if (var11_11) ** GOTO lbl145
                if (var19_14) ** GOTO lbl9
                if (!(var4_4 < ig.evza("exuu", evzd(int ), (int)690))) ** GOTO lbl145
                if (var19_14) ** GOTO lbl9
                if (!(var15_18 > ig.evza("exuv", evzd(int ), (int)691))) ** GOTO lbl145
                if (var19_14 || var19_14) ** GOTO lbl9
                this.spikeGuardTicks = (int)ig.evza("exuw", evzk(int ), (int)692);
                if (var19_14 || var19_14) ** GOTO lbl9
                this.lastCloseRatio = 0.0f;
                if (var19_14 || var19_14) ** GOTO lbl9
                return this.tremorOnly(var1_1, var2_2, var3_3, var7_7, var8_8);
lbl145:
                // 3 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                this.lastStepYaw = var12_15;
                if (var19_14 || var19_14) ** GOTO lbl9
                this.lastStepPitch = var13_16;
                if (var19_14 || var19_14) ** GOTO lbl9
                this.lastCloseRatio = var15_18;
                if (var19_14 || var19_14) ** GOTO lbl9
                if (!var10_10) ** GOTO lbl180
                if (var19_14 || var19_14) ** GOTO lbl9
                this.pursueStreak += ig.evza("exux", evzk(int ), (int)693);
                if (var19_14 || var19_14) ** GOTO lbl9
                if (!var11_11) ** GOTO lbl167
                if (var19_14) ** GOTO lbl9
                if (!(var15_18 > ig.evza("exuy", evzd(int ), (int)694))) ** GOTO lbl167
                if (var19_14) ** GOTO lbl9
                if (!(var4_4 < ig.evza("exuz", evzd(int ), (int)695))) ** GOTO lbl167
                if (var19_14 || var19_14) ** GOTO lbl9
                this.recoverTicks = (int)ig.evza("exva", evzk(int ), (int)696);
                if (var19_14) ** GOTO lbl9
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl180
lbl167:
                // 3 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                if (!(var16_19 > ig.evza("exvb", evzd(int ), (int)697))) ** GOTO lbl175
                if (var19_14 || var19_14) ** GOTO lbl9
                this.recoverTicks = (int)ig.evza("exvc", evzk(int ), (int)698);
                if (var19_14) ** GOTO lbl9
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl180
lbl175:
                // 1 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                if (this.pursueStreak < ig.evza("exvd", evzk(int ), (int)699) + this.random.nextInt((int)ig.evza("exve", evzk(int ), (int)700))) ** GOTO lbl180
                if (var19_14 || var19_14) ** GOTO lbl9
                this.recoverTicks = (int)ig.evza("exvf", evzk(int ), (int)701);
                if (var19_14) ** GOTO lbl9
lbl180:
                // 5 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                if (!var11_11) ** GOTO lbl187
                if (var19_14) ** GOTO lbl9
                v5 = Math.min(var9_9, (float)ig.evza("exvg", evzd(int ), (int)702));
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl189
lbl187:
                // 1 sources

                if (var19_14 || var19_14) ** GOTO lbl9
                v5 = var17_22 = var9_9;
lbl189:
                // 2 sources

                if (!var19_14 && !var19_14) ** break;
                ** continue;
                return this.finishStep(var1_1, var2_2, var3_3, var12_15, var13_16, var17_22);
            }
            case 0: {
                var20_13 /* !! */  = (int)ig.evza("exvh", evzk(int ), (int)703);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl197:
            // 2 sources

            case 1: {
                var20_13 /* !! */  = (int)ig.evza("exvi", evzk(int ), (int)704);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl435
            }
            case 2: {
                var20_13 /* !! */  = (int)ig.evza("exvj", evzk(int ), (int)705);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl440
            }
            case 3: {
                var20_13 /* !! */  = (int)ig.evza("exvk", evzk(int ), (int)706);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl426
            }
lbl212:
            // 3 sources

            case 4: {
                var20_13 /* !! */  = (int)ig.evza("exvl", evzk(int ), (int)707);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl760
            }
            case 5: {
                var20_13 /* !! */  = (int)ig.evza("exvm", evzk(int ), (int)708);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl547
            }
            case 6: {
                var20_13 /* !! */  = (int)ig.evza("exvn", evzk(int ), (int)709);
                if (!var21_12) ** GOTO lbl197
                throw null;
            }
lbl226:
            // 3 sources

            case 7: {
                var20_13 /* !! */  = (int)ig.evza("exvo", evzk(int ), (int)710);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl231:
            // 4 sources

            case 8: {
                var20_13 /* !! */  = (int)ig.evza("exvp", evzk(int ), (int)711);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl575
            }
            case 9: {
                var20_13 /* !! */  = (int)ig.evza("exvq", evzk(int ), (int)712);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl241:
            // 3 sources

            case 10: {
                var20_13 /* !! */  = (int)ig.evza("exvr", evzk(int ), (int)713);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl663
            }
lbl246:
            // 3 sources

            case 11: {
                var20_13 /* !! */  = (int)ig.evza("exvs", evzk(int ), (int)714);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl251:
            // 3 sources

            case 12: {
                var20_13 /* !! */  = (int)ig.evza("exvt", evzk(int ), (int)715);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl256:
            // 2 sources

            case 13: {
                var20_13 /* !! */  = (int)ig.evza("exvu", evzk(int ), (int)716);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl732
            }
            case 14: {
                var20_13 /* !! */  = (int)ig.evza("exvv", evzk(int ), (int)717);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl600
            }
lbl266:
            // 2 sources

            case 15: {
                var20_13 /* !! */  = (int)ig.evza("exvw", evzk(int ), (int)718);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl271:
            // 2 sources

            case 16: {
                var20_13 /* !! */  = (int)ig.evza("exvx", evzk(int ), (int)719);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl400
            }
            case 17: {
                var20_13 /* !! */  = (int)ig.evza("exvy", evzk(int ), (int)720);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl579
            }
lbl281:
            // 5 sources

            case 18: {
                var20_13 /* !! */  = (int)ig.evza("exvz", evzk(int ), (int)721);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl440
            }
lbl286:
            // 3 sources

            case 19: {
                var20_13 /* !! */  = (int)ig.evza("exwa", evzk(int ), (int)722);
                if (!var21_12) ** GOTO lbl271
                throw null;
            }
lbl290:
            // 2 sources

            case 20: {
                var20_13 /* !! */  = (int)ig.evza("exwb", evzk(int ), (int)723);
                if (!var21_12) ** GOTO lbl226
                throw null;
            }
lbl294:
            // 2 sources

            case 21: {
                var20_13 /* !! */  = (int)ig.evza("exwc", evzk(int ), (int)724);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl551
            }
            case 22: {
                var20_13 /* !! */  = (int)ig.evza("exwd", evzk(int ), (int)725);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl563
            }
lbl304:
            // 3 sources

            case 23: {
                var20_13 /* !! */  = (int)ig.evza("exwe", evzk(int ), (int)726);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl431
            }
lbl309:
            // 2 sources

            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_13 /* !! */  = (int)ig.evza("exwf", evzk(int ), (int)727);
                    if (var21_12) {
                        throw null;
                    }
                    ** GOTO lbl453
                    break;
                }
            }
            case 25: {
                var20_13 /* !! */  = (int)ig.evza("exwg", evzk(int ), (int)728);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl588
            }
lbl320:
            // 4 sources

            case 26: {
                var20_13 /* !! */  = (int)ig.evza("exwh", evzk(int ), (int)729);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl386
            }
lbl325:
            // 4 sources

            case 27: {
                var20_13 /* !! */  = (int)ig.evza("exwi", evzk(int ), (int)730);
                if (!var21_12) break;
                throw null;
            }
lbl329:
            // 2 sources

            case 28: {
                var20_13 /* !! */  = (int)ig.evza("exwj", evzk(int ), (int)731);
                if (!var21_12) ** GOTO lbl309
                throw null;
            }
            case 29: {
                var20_13 /* !! */  = (int)ig.evza("exwk", evzk(int ), (int)732);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl338:
            // 3 sources

            case 30: {
                var20_13 /* !! */  = (int)ig.evza("exwl", evzk(int ), (int)733);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl683
            }
            case 31: {
                var20_13 /* !! */  = (int)ig.evza("exwm", evzk(int ), (int)734);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl567
            }
lbl348:
            // 2 sources

            case 32: {
                var20_13 /* !! */  = (int)ig.evza("exwn", evzk(int ), (int)735);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl740
            }
            case 33: {
                var20_13 /* !! */  = (int)ig.evza("exwo", evzk(int ), (int)736);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl744
            }
lbl358:
            // 3 sources

            case 34: {
                var20_13 /* !! */  = (int)ig.evza("exwp", evzk(int ), (int)737);
                if (!var21_12) ** GOTO lbl281
                throw null;
            }
lbl362:
            // 2 sources

            case 35: {
                var20_13 /* !! */  = (int)ig.evza("exwq", evzk(int ), (int)738);
                if (!var21_12) ** GOTO lbl212
                throw null;
            }
            case 36: {
                var20_13 /* !! */  = (int)ig.evza("exwr", evzk(int ), (int)739);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl748
            }
lbl371:
            // 3 sources

            case 37: {
                var20_13 /* !! */  = (int)ig.evza("exws", evzk(int ), (int)740);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl752
            }
lbl376:
            // 2 sources

            case 38: {
                var20_13 /* !! */  = (int)ig.evza("exwt", evzk(int ), (int)741);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl637
            }
lbl381:
            // 2 sources

            case 39: {
                var20_13 /* !! */  = (int)ig.evza("exwu", evzk(int ), (int)742);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl528
            }
lbl386:
            // 2 sources

            case 40: {
                var20_13 /* !! */  = (int)ig.evza("exwv", evzk(int ), (int)743);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl431
            }
            case 41: {
                var20_13 /* !! */  = (int)ig.evza("exww", evzk(int ), (int)744);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl629
            }
            case 42: {
                var20_13 /* !! */  = (int)ig.evza("exwx", evzk(int ), (int)745);
                if (!var21_12) ** GOTO lbl251
                throw null;
            }
lbl400:
            // 3 sources

            case 43: {
                var20_13 /* !! */  = (int)ig.evza("exwy", evzk(int ), (int)746);
                if (!var21_12) break;
                throw null;
            }
            case 44: {
                var20_13 /* !! */  = (int)ig.evza("exwz", evzk(int ), (int)747);
                if (!var21_12) ** GOTO lbl304
                throw null;
            }
            case 45: {
                var20_13 /* !! */  = (int)ig.evza("exxa", evzk(int ), (int)748);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl675
            }
lbl413:
            // 4 sources

            case 46: {
                var20_13 /* !! */  = (int)ig.evza("exxb", evzk(int ), (int)749);
                if (!var21_12) ** GOTO lbl400
                throw null;
            }
lbl417:
            // 2 sources

            case 47: {
                var20_13 /* !! */  = (int)ig.evza("exxc", evzk(int ), (int)750);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl547
            }
            case 48: {
                var20_13 /* !! */  = (int)ig.evza("exxd", evzk(int ), (int)751);
                if (!var21_12) ** GOTO lbl281
                throw null;
            }
lbl426:
            // 2 sources

            case 49: {
                var20_13 /* !! */  = (int)ig.evza("exxe", evzk(int ), (int)752);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl671
            }
lbl431:
            // 3 sources

            case 50: {
                var20_13 /* !! */  = (int)ig.evza("exxf", evzk(int ), (int)753);
                if (!var21_12) ** GOTO lbl266
                throw null;
            }
lbl435:
            // 3 sources

            case 51: {
                var20_13 /* !! */  = (int)ig.evza("exxg", evzk(int ), (int)754);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl712
            }
lbl440:
            // 4 sources

            case 52: {
                var20_13 /* !! */  = (int)ig.evza("exxh", evzk(int ), (int)755);
                if (!var21_12) ** GOTO lbl320
                throw null;
            }
lbl444:
            // 2 sources

            case 53: {
                var20_13 /* !! */  = (int)ig.evza("exxi", evzk(int ), (int)756);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl720
            }
lbl449:
            // 2 sources

            case 54: {
                var20_13 /* !! */  = (int)ig.evza("exxj", evzk(int ), (int)757);
                if (!var21_12) ** GOTO lbl338
                throw null;
            }
lbl453:
            // 2 sources

            case 55: {
                var20_13 /* !! */  = (int)ig.evza("exxk", evzk(int ), (int)758);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl691
            }
lbl458:
            // 2 sources

            case 56: {
                var20_13 /* !! */  = (int)ig.evza("exxl", evzk(int ), (int)759);
                if (!var21_12) ** GOTO lbl449
                throw null;
            }
            case 57: {
                var20_13 /* !! */  = (int)ig.evza("exxm", evzk(int ), (int)760);
                if (!var21_12) ** GOTO lbl290
                throw null;
            }
            case 58: {
                var20_13 /* !! */  = (int)ig.evza("exxn", evzk(int ), (int)761);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl604
            }
lbl471:
            // 3 sources

            case 59: {
                var20_13 /* !! */  = (int)ig.evza("exxo", evzk(int ), (int)762);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl756
            }
lbl476:
            // 3 sources

            case 60: {
                var20_13 /* !! */  = (int)ig.evza("exxp", evzk(int ), (int)763);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl584
            }
            case 61: {
                var20_13 /* !! */  = (int)ig.evza("exxq", evzk(int ), (int)764);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl551
            }
            case 62: {
                var20_13 /* !! */  = (int)ig.evza("exxr", evzk(int ), (int)765);
                if (!var21_12) ** GOTO lbl476
                throw null;
            }
            case 63: {
                var20_13 /* !! */  = (int)ig.evza("exxs", evzk(int ), (int)766);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl608
            }
lbl495:
            // 2 sources

            case 64: {
                var20_13 /* !! */  = (int)ig.evza("exxt", evzk(int ), (int)767);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl524
            }
lbl500:
            // 2 sources

            case 65: {
                var20_13 /* !! */  = (int)ig.evza("exxu", evzk(int ), (int)768);
                if (!var21_12) ** GOTO lbl495
                throw null;
            }
            case 66: {
                var20_13 /* !! */  = (int)ig.evza("exxv", evzk(int ), (int)769);
                if (!var21_12) ** GOTO lbl241
                throw null;
            }
            case 67: {
                var20_13 /* !! */  = (int)ig.evza("exxw", evzk(int ), (int)770);
                if (!var21_12) ** GOTO lbl251
                throw null;
            }
lbl512:
            // 2 sources

            case 68: {
                var20_13 /* !! */  = (int)ig.evza("exxx", evzk(int ), (int)771);
                if (!var21_12) ** GOTO lbl320
                throw null;
            }
            case 69: {
                var20_13 /* !! */  = (int)ig.evza("exxy", evzk(int ), (int)772);
                if (!var21_12) ** GOTO lbl444
                throw null;
            }
lbl520:
            // 3 sources

            case 70: {
                var20_13 /* !! */  = (int)ig.evza("exxz", evzk(int ), (int)773);
                if (!var21_12) ** GOTO lbl440
                throw null;
            }
lbl524:
            // 5 sources

            case 71: {
                var20_13 /* !! */  = (int)ig.evza("exya", evzk(int ), (int)774);
                if (!var21_12) ** GOTO lbl281
                throw null;
            }
lbl528:
            // 2 sources

            case 72: {
                var20_13 /* !! */  = (int)ig.evza("exyb", evzk(int ), (int)775);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl679
            }
lbl533:
            // 2 sources

            case 73: {
                var20_13 /* !! */  = (int)ig.evza("exyc", evzk(int ), (int)776);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl650
            }
            case 74: {
                var20_13 /* !! */  = (int)ig.evza("exyd", evzk(int ), (int)777);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl712
            }
            case 75: {
                var20_13 /* !! */  = (int)ig.evza("exye", evzk(int ), (int)778);
                if (!var21_12) ** GOTO lbl533
                throw null;
            }
lbl547:
            // 3 sources

            case 76: {
                var20_13 /* !! */  = (int)ig.evza("exyf", evzk(int ), (int)779);
                if (!var21_12) ** GOTO lbl325
                throw null;
            }
lbl551:
            // 4 sources

            case 77: {
                var20_13 /* !! */  = (int)ig.evza("exyg", evzk(int ), (int)780);
                if (!var21_12) ** GOTO lbl329
                throw null;
            }
            case 78: {
                var20_13 /* !! */  = (int)ig.evza("exyh", evzk(int ), (int)781);
                if (!var21_12) ** GOTO lbl524
                throw null;
            }
            case 79: {
                var20_13 /* !! */  = (int)ig.evza("exyi", evzk(int ), (int)782);
                if (!var21_12) ** GOTO lbl376
                throw null;
            }
lbl563:
            // 3 sources

            case 80: {
                var20_13 /* !! */  = (int)ig.evza("exyj", evzk(int ), (int)783);
                if (!var21_12) ** GOTO lbl512
                throw null;
            }
lbl567:
            // 2 sources

            case 81: {
                var20_13 /* !! */  = (int)ig.evza("exyk", evzk(int ), (int)784);
                if (!var21_12) ** GOTO lbl362
                throw null;
            }
            case 82: {
                var20_13 /* !! */  = (int)ig.evza("exyl", evzk(int ), (int)785);
                if (!var21_12) ** GOTO lbl241
                throw null;
            }
lbl575:
            // 3 sources

            case 83: {
                var20_13 /* !! */  = (int)ig.evza("exym", evzk(int ), (int)786);
                if (!var21_12) ** GOTO lbl417
                throw null;
            }
lbl579:
            // 2 sources

            case 84: {
                var20_13 /* !! */  = (int)ig.evza("exyn", evzk(int ), (int)787);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl704
            }
lbl584:
            // 2 sources

            case 85: {
                var20_13 /* !! */  = (int)ig.evza("exyo", evzk(int ), (int)788);
                if (!var21_12) ** GOTO lbl524
                throw null;
            }
lbl588:
            // 3 sources

            case 86: {
                var20_13 /* !! */  = (int)ig.evza("exyp", evzk(int ), (int)789);
                if (!var21_12) ** GOTO lbl320
                throw null;
            }
lbl592:
            // 2 sources

            case 87: {
                var20_13 /* !! */  = (int)ig.evza("exyq", evzk(int ), (int)790);
                if (!var21_12) ** GOTO lbl286
                throw null;
            }
lbl596:
            // 3 sources

            case 88: {
                var20_13 /* !! */  = (int)ig.evza("exyr", evzk(int ), (int)791);
                if (!var21_12) ** GOTO lbl575
                throw null;
            }
lbl600:
            // 3 sources

            case 89: {
                var20_13 /* !! */  = (int)ig.evza("exys", evzk(int ), (int)792);
                if (!var21_12) ** GOTO lbl563
                throw null;
            }
lbl604:
            // 2 sources

            case 90: {
                var20_13 /* !! */  = (int)ig.evza("exyt", evzk(int ), (int)793);
                if (!var21_12) ** GOTO lbl435
                throw null;
            }
lbl608:
            // 2 sources

            case 91: {
                var20_13 /* !! */  = (int)ig.evza("exyu", evzk(int ), (int)794);
                if (!var21_12) ** GOTO lbl226
                throw null;
            }
            case 92: {
                var20_13 /* !! */  = (int)ig.evza("exyv", evzk(int ), (int)795);
                if (!var21_12) ** GOTO lbl325
                throw null;
            }
            case 93: {
                var20_13 /* !! */  = (int)ig.evza("exyw", evzk(int ), (int)796);
                if (!var21_12) ** GOTO lbl246
                throw null;
            }
            case 94: {
                var20_13 /* !! */  = (int)ig.evza("exyx", evzk(int ), (int)797);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl671
            }
            case 95: {
                var20_13 /* !! */  = (int)ig.evza("exyy", evzk(int ), (int)798);
                if (!var21_12) ** GOTO lbl381
                throw null;
            }
lbl629:
            // 3 sources

            case 96: {
                var20_13 /* !! */  = (int)ig.evza("exyz", evzk(int ), (int)799);
                if (!var21_12) ** GOTO lbl286
                throw null;
            }
            case 97: {
                var20_13 /* !! */  = (int)ig.evza("exza", evzk(int ), (int)800);
                if (!var21_12) ** GOTO lbl246
                throw null;
            }
lbl637:
            // 2 sources

            case 98: {
                var20_13 /* !! */  = (int)ig.evza("exzb", evzk(int ), (int)801);
                if (!var21_12) ** GOTO lbl325
                throw null;
            }
            case 99: {
                do {
                    var20_13 /* !! */  = (int)ig.evza("exzc", evzk(int ), (int)802);
                } while (!var21_12);
                throw null;
            }
lbl646:
            // 2 sources

            case 100: {
                var20_13 /* !! */  = (int)ig.evza("exzd", evzk(int ), (int)803);
                if (!var21_12) ** GOTO lbl500
                throw null;
            }
lbl650:
            // 2 sources

            case 101: {
                var20_13 /* !! */  = (int)ig.evza("exze", evzk(int ), (int)804);
                if (!var21_12) ** GOTO lbl596
                throw null;
            }
            case 102: {
                var20_13 /* !! */  = (int)ig.evza("exzf", evzk(int ), (int)805);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl675
            }
            case 103: {
                var20_13 /* !! */  = (int)ig.evza("exzg", evzk(int ), (int)806);
                if (!var21_12) ** GOTO lbl629
                throw null;
            }
lbl663:
            // 2 sources

            case 104: {
                var20_13 /* !! */  = (int)ig.evza("exzh", evzk(int ), (int)807);
                if (!var21_12) ** GOTO lbl294
                throw null;
            }
            case 105: {
                var20_13 /* !! */  = (int)ig.evza("exzi", evzk(int ), (int)808);
                if (!var21_12) ** GOTO lbl358
                throw null;
            }
lbl671:
            // 3 sources

            case 106: {
                var20_13 /* !! */  = (int)ig.evza("exzj", evzk(int ), (int)809);
                if (!var21_12) ** GOTO lbl371
                throw null;
            }
lbl675:
            // 4 sources

            case 107: {
                var20_13 /* !! */  = (int)ig.evza("exzk", evzk(int ), (int)810);
                if (!var21_12) ** GOTO lbl471
                throw null;
            }
lbl679:
            // 2 sources

            case 108: {
                var20_13 /* !! */  = (int)ig.evza("exzl", evzk(int ), (int)811);
                if (!var21_12) ** GOTO lbl520
                throw null;
            }
lbl683:
            // 2 sources

            case 109: {
                var20_13 /* !! */  = (int)ig.evza("exzm", evzk(int ), (int)812);
                if (!var21_12) ** GOTO lbl458
                throw null;
            }
lbl687:
            // 2 sources

            case 110: {
                var20_13 /* !! */  = (int)ig.evza("exzn", evzk(int ), (int)813);
                if (!var21_12) ** GOTO lbl231
                throw null;
            }
lbl691:
            // 2 sources

            case 111: {
                var20_13 /* !! */  = (int)ig.evza("exzo", evzk(int ), (int)814);
                if (!var21_12) ** GOTO lbl687
                throw null;
            }
            case 112: {
                var20_13 /* !! */  = (int)ig.evza("exzp", evzk(int ), (int)815);
                if (!var21_12) ** GOTO lbl281
                throw null;
            }
            case 113: {
                var20_13 /* !! */  = (int)ig.evza("exzq", evzk(int ), (int)816);
                if (var21_12) {
                    throw null;
                }
                ** GOTO lbl732
            }
lbl704:
            // 2 sources

            case 114: {
                var20_13 /* !! */  = (int)ig.evza("exzr", evzk(int ), (int)817);
                if (!var21_12) ** GOTO lbl231
                throw null;
            }
            case 115: {
                var20_13 /* !! */  = (int)ig.evza("exzs", evzk(int ), (int)818);
                if (!var21_12) ** GOTO lbl646
                throw null;
            }
lbl712:
            // 3 sources

            case 116: {
                var20_13 /* !! */  = (int)ig.evza("exzt", evzk(int ), (int)819);
                if (!var21_12) ** GOTO lbl348
                throw null;
            }
            case 117: {
                var20_13 /* !! */  = (int)ig.evza("exzu", evzk(int ), (int)820);
                if (!var21_12) ** GOTO lbl256
                throw null;
            }
lbl720:
            // 2 sources

            case 118: {
                var20_13 /* !! */  = (int)ig.evza("exzv", evzk(int ), (int)821);
                if (!var21_12) ** GOTO lbl592
                throw null;
            }
            case 119: {
                var20_13 /* !! */  = (int)ig.evza("exzw", evzk(int ), (int)822);
                if (!var21_12) ** GOTO lbl471
                throw null;
            }
            case 120: {
                var20_13 /* !! */  = (int)ig.evza("exzx", evzk(int ), (int)823);
                if (!var21_12) ** GOTO lbl588
                throw null;
            }
lbl732:
            // 3 sources

            case 121: {
                var20_13 /* !! */  = (int)ig.evza("exzy", evzk(int ), (int)824);
                if (!var21_12) ** GOTO lbl520
                throw null;
            }
            case 122: {
                var20_13 /* !! */  = (int)ig.evza("exzz", evzk(int ), (int)825);
                if (!var21_12) ** GOTO lbl551
                throw null;
            }
lbl740:
            // 2 sources

            case 123: {
                var20_13 /* !! */  = (int)ig.evza("eyaa", evzk(int ), (int)826);
                if (!var21_12) ** GOTO lbl524
                throw null;
            }
lbl744:
            // 2 sources

            case 124: {
                var20_13 /* !! */  = (int)ig.evza("eyab", evzk(int ), (int)827);
                if (!var21_12) ** GOTO lbl596
                throw null;
            }
lbl748:
            // 2 sources

            case 125: {
                var20_13 /* !! */  = (int)ig.evza("eyac", evzk(int ), (int)828);
                if (!var21_12) ** GOTO lbl675
                throw null;
            }
lbl752:
            // 2 sources

            case 126: {
                var20_13 /* !! */  = (int)ig.evza("eyad", evzk(int ), (int)829);
                if (!var21_12) ** GOTO lbl476
                throw null;
            }
lbl756:
            // 2 sources

            case 127: {
                var20_13 /* !! */  = (int)ig.evza("eyae", evzk(int ), (int)830);
                if (!var21_12) ** GOTO lbl358
                throw null;
            }
lbl760:
            // 2 sources

            case 128: {
                var20_13 /* !! */  = (int)ig.evza("eyaf", evzk(int ), (int)831);
                if (!var21_12) ** GOTO lbl231
                throw null;
            }
            case 129: {
                var20_13 /* !! */  = (int)ig.evza("eyag", evzk(int ), (int)832);
                if (!var21_12) ** GOTO lbl600
                throw null;
            }
            case 130: 
        }
        var20_13 /* !! */  = (int)ig.evza("eyah", evzk(int ), (int)833);
        ** while (!var21_12)
lbl771:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float randGauss() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("eyli", evyw(int ), (int)197)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ig.evza("eylj", evzk(int ), (int)1005)) break;
            v0 /* !! */  = (long)ig.evza("eylk", evzk(int ), (int)1006);
        }
        var3_1 = ig.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("eyll", evyw(int ), (int)198)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ig.evza("eylm", evzk(int ), (int)1007)) break;
            v1 /* !! */  = (long)ig.evza("eyln", evzk(int ), (int)1008);
        }
        var2_2 = ig.b;
        v2 /* !! */  = ig.lj;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - ig.evza("eylo", evyw(int ), (int)199));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1064934895: {
                    v3 = ig.evza("eylp", evyw(int ), (int)200);
                    continue block13;
                }
                case -954465624: {
                    v3 = ig.evza("eylq", evyw(int ), (int)201);
                    continue block13;
                }
                case -869293746: {
                    break block13;
                }
                case 520228622: {
                    v3 = ig.evza("eylr", evyw(int ), (int)202);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = ig.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (float)ig.evza("eyls", evzd(int ), (int)1009);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("eylt", evyw(int ), (int)203)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ig.evza("eylu", evzk(int ), (int)1010)) break;
            v4 /* !! */  = (long)ig.evza("eylv", evzk(int ), (int)1011);
        }
        v5 /* !! */  = ig.lj;
        if (true) ** GOTO lbl47
        block16: while (true) {
            v5 /* !! */  = (long)(v6 - ig.evza("eylw", evyw(int ), (int)204));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2068616323: {
                    v6 = ig.evza("eylx", evyw(int ), (int)205);
                    continue block16;
                }
                case -869293746: {
                    break block16;
                }
                case -192746233: {
                    v6 = ig.evza("eyly", evyw(int ), (int)206);
                    continue block16;
                }
            }
            break;
        }
        return (float)this.random.nextGaussian();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("eymx", evyw(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ig.evza("eymy", evzk(int ), (int)1027)) break;
            v0 /* !! */  = (long)ig.evza("eymz", evzk(int ), (int)1028);
        }
        var5_1 = ig.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("eyna", evyw(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ig.evza("eynb", evzk(int ), (int)1029)) break;
            v1 /* !! */  = (long)ig.evza("eync", evzk(int ), (int)1030);
        }
        var4_2 /* !! */  = ig.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("eynd", evyw(int ), (int)218)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ig.evza("eyne", evzk(int ), (int)1031)) break;
            v2 /* !! */  = (long)ig.evza("eytm", evzk(int ), (int)1032);
        }
        var3_3 = ig.a;
        if (var5_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl24
        var1_4 = ig.evza("eyuc", ewsq(int ), (int)219);
        ** while (var3_3 || var3_3)
lbl29:
        // 1 sources

        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ig.lj;
                if (true) ** GOTO lbl36
                block42: while (true) {
                    v3 /* !! */  = (long)(v4 - ig.evza("eyue", evyw(int ), (int)220));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2100558056: {
                            v4 = ig.evza("eyuf", evyw(int ), (int)221);
                            continue block42;
                        }
                        case -869293746: {
                            break block42;
                        }
                        case 1167350677: {
                            v4 = ig.evza("eyug", evyw(int ), (int)222);
                            continue block42;
                        }
                    }
                    break;
                }
                v5 /* !! */  = ig.lj;
                if (true) ** GOTO lbl49
                block43: while (true) {
                    v5 /* !! */  = (long)(v6 - ig.evza("eyui", evyw(int ), (int)223));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1902816470: {
                            v6 = ig.evza("eyuk", evyw(int ), (int)224);
                            continue block43;
                        }
                        case -869293746: {
                            break block43;
                        }
                        case -66726314: {
                            v6 = ig.evza("eyus", evyw(int ), (int)225);
                            continue block43;
                        }
                        case 293764988: {
                            v6 = ig.evza("eyuu", evyw(int ), (int)226);
                            continue block43;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ig.lj;
                if (true) ** GOTO lbl65
                block44: while (true) {
                    v7 /* !! */  = (long)(v8 - ig.evza("eyuv", evyw(int ), (int)227));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1622060246: {
                            v8 = ig.evza("eyuw", evyw(int ), (int)228);
                            continue block44;
                        }
                        case -869293746: {
                            break block44;
                        }
                        case -793153181: {
                            v8 = ig.evza("eyux", evyw(int ), (int)229);
                            continue block44;
                        }
                    }
                    break;
                }
                v9 = (this.random.nextDouble() * ig.evza("eyuy", ewsq(int ), (int)230) - 1.0) * var1_4;
                v10 /* !! */  = ig.lj;
                if (true) ** GOTO lbl79
                block45: while (true) {
                    v10 /* !! */  = (long)(ig.evza("eyvf", evyw(int ), (int)232) - ig.evza("eyuz", evyw(int ), (int)231));
lbl79:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -869293746: {
                            break block45;
                        }
                        case 627799391: {
                            continue block45;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ig.lj - ig.evza("eyvh", evyw(int ), (int)233)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v11 /* !! */  == ig.evza("eyvi", evzk(int ), (int)1033)) break;
                    v11 /* !! */  = (long)ig.evza("eyvk", evzk(int ), (int)1034);
                }
                v12 = (this.random.nextDouble() * ig.evza("eyvl", ewsq(int ), (int)234) - 1.0) * var1_4;
                v13 /* !! */  = ig.lj;
                if (true) ** GOTO lbl95
                block47: while (true) {
                    v13 /* !! */  = (long)(v14 - ig.evza("eyvm", evyw(int ), (int)235));
lbl95:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1817423126: {
                            v14 = ig.evza("eyvn", evyw(int ), (int)236);
                            continue block47;
                        }
                        case -869293746: {
                            break block47;
                        }
                        case 1357630867: {
                            v14 = ig.evza("eyvq", evyw(int ), (int)237);
                            continue block47;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = ig.lj - ig.evza("eyvt", evyw(int ), (int)238)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v15 /* !! */  == ig.evza("eyvv", evzk(int ), (int)1035)) break;
                    v15 /* !! */  = (long)ig.evza("eyvx", evzk(int ), (int)1036);
                }
                v16 = (this.random.nextDouble() * ig.evza("eyvy", ewsq(int ), (int)239) - 1.0) * var1_4;
                v17 /* !! */  = ig.lj;
                if (true) ** GOTO lbl115
                block49: while (true) {
                    v17 /* !! */  = (long)(v18 - ig.evza("eyvz", evyw(int ), (int)240));
lbl115:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -869293746: {
                            break block49;
                        }
                        case 1200377497: {
                            v18 = ig.evza("eywb", evyw(int ), (int)241);
                            continue block49;
                        }
                        case 1427752171: {
                            v18 = ig.evza("eywl", evyw(int ), (int)242);
                            continue block49;
                        }
                    }
                    break;
                }
                return new class_243(v9, v12, v16);
            }
lbl125:
            // 2 sources

            case 0: {
                do {
                    var4_2 /* !! */  = (int)ig.evza("eywn", evzk(int ), (int)1037);
                } while (!var5_1);
                throw null;
            }
            case 1: {
                var4_2 /* !! */  = (int)ig.evza("eywp", evzk(int ), (int)1038);
                if (!var5_1) break;
                throw null;
            }
            case 2: {
                do {
                    var4_2 /* !! */  = (int)ig.evza("eywq", evzk(int ), (int)1039);
                } while (!var5_1);
                throw null;
            }
lbl139:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ig.evza("eywr", evzk(int ), (int)1040);
                    if (!var5_1) ** GOTO lbl125
                    throw null;
                }
            }
            case 4: {
                var4_2 /* !! */  = (int)ig.evza("eyws", evzk(int ), (int)1041);
                if (!var5_1) ** GOTO lbl139
                throw null;
            }
            case 5: 
        }
        var4_2 /* !! */  = (int)ig.evza("eywt", evzk(int ), (int)1042);
        ** while (!var5_1)
lbl151:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ezek() {
        ig.evzf[900] = 2087708205;
        ig.evzf[901] = -48394353;
        ig.evzf[902] = 1539816381;
        ig.evzf[903] = -1713851711;
        ig.evzf[904] = 802478268;
        ig.evzf[905] = 1592594803;
        ig.evzf[906] = -584080034;
        ig.evzf[907] = -1761380262;
        ig.evzf[908] = -2102855191;
        ig.evzf[909] = -1159306704;
        ig.evzf[910] = 28892326;
        ig.evzf[911] = -2091341604;
        ig.evzf[912] = -685827234;
        ig.evzf[913] = 520631414;
        ig.evzf[914] = 762249659;
        ig.evzf[915] = -1458510877;
        ig.evzf[916] = 772378308;
        ig.evzf[917] = 628335816;
        ig.evzf[918] = -281170491;
        ig.evzf[919] = -2017189424;
        ig.evzf[920] = -1626804496;
        ig.evzf[921] = -1700172790;
        ig.evzf[922] = -1350676806;
        ig.evzf[923] = -2132125030;
        ig.evzf[924] = 1456318997;
        ig.evzf[925] = -1167927645;
        ig.evzf[926] = -1882995615;
        ig.evzf[927] = 2014564453;
        ig.evzf[928] = 1766793652;
        ig.evzf[929] = 1729284810;
        ig.evzf[930] = -902514485;
        ig.evzf[931] = 1787355557;
        ig.evzf[932] = 1085567998;
        ig.evzf[933] = 1041980867;
        ig.evzf[934] = -1100947398;
        ig.evzf[935] = -1298431164;
        ig.evzf[936] = 953696644;
        ig.evzf[937] = -527909366;
        ig.evzf[938] = 1334614077;
        ig.evzf[939] = -1561146773;
        ig.evzf[940] = -65927627;
        ig.evzf[941] = 1844081868;
        ig.evzf[942] = -1032115144;
        ig.evzf[943] = -2133182407;
        ig.evzf[944] = 1871107698;
        ig.evzf[945] = -1533800013;
        ig.evzf[946] = 661421889;
        ig.evzf[947] = 705884452;
        ig.evzf[948] = 1046360949;
        ig.evzf[949] = 120030588;
        ig.evzf[950] = -1988683486;
        ig.evzf[951] = 78558194;
        ig.evzf[952] = -1386556250;
        ig.evzf[953] = 1233149919;
        ig.evzf[954] = 855818180;
        ig.evzf[955] = 1002458907;
        ig.evzf[956] = -1297144879;
        ig.evzf[957] = -1566150130;
        ig.evzf[958] = -834478479;
        ig.evzf[959] = 398041210;
        ig.evzf[960] = 464298375;
        ig.evzf[961] = -445104973;
        ig.evzf[962] = -618838598;
        ig.evzf[963] = -1456430658;
        ig.evzf[964] = -946323647;
        ig.evzf[965] = -200203729;
        ig.evzf[966] = -1954809732;
        ig.evzf[967] = -892932181;
        ig.evzf[968] = 2132531848;
        ig.evzf[969] = -1887812092;
        ig.evzf[970] = -1402699857;
        ig.evzf[971] = 1716158740;
        ig.evzf[972] = 208335270;
        ig.evzf[973] = -1169174979;
        ig.evzf[974] = -60425936;
        ig.evzf[975] = 751421127;
        ig.evzf[976] = 2082695544;
        ig.evzf[977] = -1298014475;
        ig.evzf[978] = 1540631374;
        ig.evzf[979] = 333527442;
        ig.evzf[980] = 1741036911;
        ig.evzf[981] = 534732152;
        ig.evzf[982] = 2089060941;
        ig.evzf[983] = -228624907;
        ig.evzf[984] = 900501957;
        ig.evzf[985] = 379338838;
        ig.evzf[986] = -445300948;
        ig.evzf[987] = 1775143543;
        ig.evzf[988] = 1255198429;
        ig.evzf[989] = -991001961;
        ig.evzf[990] = -1929385996;
        ig.evzf[991] = 1243476081;
        ig.evzf[992] = 399979081;
        ig.evzf[993] = 170295094;
        ig.evzf[994] = 777186661;
        ig.evzf[995] = -668779512;
        ig.evzf[996] = 417842708;
        ig.evzf[997] = 314015256;
        ig.evzf[998] = 1536106691;
        ig.evzf[999] = 2035055034;
    }

    private static /* synthetic */ void ezgh() {
        ig.evzg[100] = -278914566;
        ig.evzg[101] = -1071851986;
        ig.evzg[102] = -1088300497;
        ig.evzg[103] = 1153429974;
        ig.evzg[104] = -1419735039;
        ig.evzg[105] = 1389400404;
        ig.evzg[106] = -88287306;
        ig.evzg[107] = -1395319450;
        ig.evzg[108] = -1436699846;
        ig.evzg[109] = 181779248;
        ig.evzg[110] = -255298576;
        ig.evzg[111] = 1623202577;
        ig.evzg[112] = -1790374434;
        ig.evzg[113] = -215661728;
        ig.evzg[114] = 1808508073;
        ig.evzg[115] = -359271962;
        ig.evzg[116] = 1055258283;
        ig.evzg[117] = -459888595;
        ig.evzg[118] = -1367967807;
        ig.evzg[119] = 258505251;
        ig.evzg[120] = -489261030;
        ig.evzg[121] = -131510519;
        ig.evzg[122] = 257538871;
        ig.evzg[123] = 41715135;
        ig.evzg[124] = 1618093591;
        ig.evzg[125] = 1839235070;
        ig.evzg[126] = -1895014204;
        ig.evzg[127] = -468276421;
        ig.evzg[128] = 1210141418;
        ig.evzg[129] = -491717579;
        ig.evzg[130] = 1650530092;
        ig.evzg[131] = 358789264;
        ig.evzg[132] = -76740157;
        ig.evzg[133] = -1088172388;
        ig.evzg[134] = 1755326068;
        ig.evzg[135] = -842983436;
        ig.evzg[136] = 160203954;
        ig.evzg[137] = 2064360429;
        ig.evzg[138] = -981571855;
        ig.evzg[139] = -1489488294;
        ig.evzg[140] = 1183075824;
        ig.evzg[141] = 1651400174;
        ig.evzg[142] = 657383833;
        ig.evzg[143] = 823688415;
        ig.evzg[144] = -1516843613;
        ig.evzg[145] = -1511495183;
        ig.evzg[146] = -1864171461;
        ig.evzg[147] = -970114723;
        ig.evzg[148] = 2024736492;
        ig.evzg[149] = -658947777;
        ig.evzg[150] = 1467424116;
        ig.evzg[151] = 957468867;
        ig.evzg[152] = 331705302;
        ig.evzg[153] = 1332777891;
        ig.evzg[154] = -1526192413;
        ig.evzg[155] = 693378886;
        ig.evzg[156] = 714490803;
        ig.evzg[157] = -137809869;
        ig.evzg[158] = -1989409879;
        ig.evzg[159] = 263676611;
        ig.evzg[160] = -1935397462;
        ig.evzg[161] = -1446268887;
        ig.evzg[162] = -2114385231;
        ig.evzg[163] = 1009008972;
        ig.evzg[164] = 1677033198;
        ig.evzg[165] = -251507957;
        ig.evzg[166] = 2120199685;
        ig.evzg[167] = 1068774370;
        ig.evzg[168] = 42782771;
        ig.evzg[169] = -690796277;
        ig.evzg[170] = 2015561565;
        ig.evzg[171] = -1446880892;
        ig.evzg[172] = -516629072;
        ig.evzg[173] = 1433084807;
        ig.evzg[174] = 714081519;
        ig.evzg[175] = -732142800;
        ig.evzg[176] = 840525639;
        ig.evzg[177] = -1668648353;
        ig.evzg[178] = 590106616;
        ig.evzg[179] = 1139678966;
        ig.evzg[180] = -302595578;
        ig.evzg[181] = 2054719732;
        ig.evzg[182] = -1344182963;
        ig.evzg[183] = 1175667261;
        ig.evzg[184] = 1765691016;
        ig.evzg[185] = 365361687;
        ig.evzg[186] = 745896738;
        ig.evzg[187] = 243708291;
        ig.evzg[188] = -123356461;
        ig.evzg[189] = -231744022;
        ig.evzg[190] = -1003445166;
        ig.evzg[191] = 116335022;
        ig.evzg[192] = 1224533928;
        ig.evzg[193] = -1004409182;
        ig.evzg[194] = -485677093;
        ig.evzg[195] = -1510568843;
        ig.evzg[196] = 183258907;
        ig.evzg[197] = -1989464690;
        ig.evzg[198] = -1638835316;
        ig.evzg[199] = -382073091;
    }

    private static /* synthetic */ void ezcx() {
        ig.evzf[600] = -310401412;
        ig.evzf[601] = 1563693943;
        ig.evzf[602] = -2018684366;
        ig.evzf[603] = -1641353470;
        ig.evzf[604] = -1877440869;
        ig.evzf[605] = 686790430;
        ig.evzf[606] = 22039121;
        ig.evzf[607] = -136074161;
        ig.evzf[608] = -1217469586;
        ig.evzf[609] = 652897849;
        ig.evzf[610] = 225920367;
        ig.evzf[611] = -1750116106;
        ig.evzf[612] = -688590423;
        ig.evzf[613] = 167027466;
        ig.evzf[614] = -2043003964;
        ig.evzf[615] = -987992183;
        ig.evzf[616] = 124396527;
        ig.evzf[617] = 675160494;
        ig.evzf[618] = 1639027527;
        ig.evzf[619] = 1148096090;
        ig.evzf[620] = 1370726158;
        ig.evzf[621] = -219324051;
        ig.evzf[622] = -1863991826;
        ig.evzf[623] = 1738405222;
        ig.evzf[624] = -1092841365;
        ig.evzf[625] = -1485388058;
        ig.evzf[626] = 1119688488;
        ig.evzf[627] = -294946989;
        ig.evzf[628] = 299299242;
        ig.evzf[629] = 346274392;
        ig.evzf[630] = -1018906589;
        ig.evzf[631] = -289833999;
        ig.evzf[632] = 1745524075;
        ig.evzf[633] = 1319419180;
        ig.evzf[634] = 206057035;
        ig.evzf[635] = -834603560;
        ig.evzf[636] = 1615432225;
        ig.evzf[637] = 1903820032;
        ig.evzf[638] = -487108347;
        ig.evzf[639] = -1765575140;
        ig.evzf[640] = -509727791;
        ig.evzf[641] = 1001532996;
        ig.evzf[642] = -23550857;
        ig.evzf[643] = -62276296;
        ig.evzf[644] = -841451977;
        ig.evzf[645] = -2059949127;
        ig.evzf[646] = -784728070;
        ig.evzf[647] = 1276144555;
        ig.evzf[648] = 1275424071;
        ig.evzf[649] = -891280477;
        ig.evzf[650] = -1137152914;
        ig.evzf[651] = 280673383;
        ig.evzf[652] = 1851043347;
        ig.evzf[653] = 670259009;
        ig.evzf[654] = 1216572966;
        ig.evzf[655] = 1297442906;
        ig.evzf[656] = -527598450;
        ig.evzf[657] = -1794528712;
        ig.evzf[658] = -127980531;
        ig.evzf[659] = 159520270;
        ig.evzf[660] = 1277551578;
        ig.evzf[661] = 760974808;
        ig.evzf[662] = 1659846270;
        ig.evzf[663] = 1457974463;
        ig.evzf[664] = -794553181;
        ig.evzf[665] = 1463449472;
        ig.evzf[666] = -1100038898;
        ig.evzf[667] = 87755247;
        ig.evzf[668] = -152710890;
        ig.evzf[669] = -1019413064;
        ig.evzf[670] = -2089212936;
        ig.evzf[671] = -877013198;
        ig.evzf[672] = -950891266;
        ig.evzf[673] = 140180600;
        ig.evzf[674] = 1078969772;
        ig.evzf[675] = -675074314;
        ig.evzf[676] = -893314152;
        ig.evzf[677] = -912936317;
        ig.evzf[678] = 844796591;
        ig.evzf[679] = -2067541911;
        ig.evzf[680] = -1381765097;
        ig.evzf[681] = -749462149;
        ig.evzf[682] = 2064532204;
        ig.evzf[683] = 991411178;
        ig.evzf[684] = -1735135468;
        ig.evzf[685] = -1958545747;
        ig.evzf[686] = -1796660676;
        ig.evzf[687] = 1762100151;
        ig.evzf[688] = -1345248064;
        ig.evzf[689] = 61931512;
        ig.evzf[690] = 1278392956;
        ig.evzf[691] = -107587561;
        ig.evzf[692] = 1741511315;
        ig.evzf[693] = -912698378;
        ig.evzf[694] = 1062792519;
        ig.evzf[695] = -851221196;
        ig.evzf[696] = 1497687421;
        ig.evzf[697] = 464498937;
        ig.evzf[698] = 456960604;
        ig.evzf[699] = 345590330;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float strength() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("ewck", evyw(int ), (int)1)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ig.evza("ewcl", evzk(int ), (int)72)) break;
            v0 /* !! */  = (long)ig.evza("ewcm", evzk(int ), (int)73);
        }
        var3_1 = ig.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("ewcn", evyw(int ), (int)2)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ig.evza("ewco", evzk(int ), (int)74)) break;
            v1 /* !! */  = (long)ig.evza("ewcp", evzk(int ), (int)75);
        }
        var2_2 /* !! */  = ig.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("ewcq", evyw(int ), (int)3)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ig.evza("ewcr", evzk(int ), (int)76)) break;
                    v2 /* !! */  = (long)ig.evza("ewcs", evzk(int ), (int)77);
                }
                var1_3 = ig.a;
                if (var3_1) {
                    throw null;
                    return (float)ig.evza("ewct", evzd(int ), (int)78);
                }
                if (var1_3 || var1_3) ** continue;
                v3 = ig.evza("ewcu", evzd(int ), (int)79);
                v4 /* !! */  = ig.lj;
                if (true) ** GOTO lbl35
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - ig.evza("ewcv", evyw(int ), (int)4));
lbl35:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1582001036: {
                            v5 = ig.evza("ewcw", evyw(int ), (int)5);
                            continue block20;
                        }
                        case -869293746: {
                            break block20;
                        }
                        case -771346014: {
                            v5 = ig.evza("ewcx", evyw(int ), (int)6);
                            continue block20;
                        }
                    }
                    break;
                }
                v6 = v3 + this.speedDrift;
                v7 = ig.evza("ewcy", evzd(int ), (int)80);
                v8 = ig.evza("ewcz", evzd(int ), (int)81);
                v9 /* !! */  = ig.lj;
                if (true) ** GOTO lbl51
                block21: while (true) {
                    v9 /* !! */  = (long)(v10 - ig.evza("ewda", evyw(int ), (int)7));
lbl51:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1297165660: {
                            v10 = ig.evza("ewdb", evyw(int ), (int)8);
                            continue block21;
                        }
                        case -869293746: {
                            break block21;
                        }
                        case 189711170: {
                            v10 = ig.evza("ewdc", evyw(int ), (int)9);
                            continue block21;
                        }
                    }
                    break;
                }
                return class_3532.method_15363((float)v6, (float)v7, (float)v8);
            }
lbl61:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ig.evza("ewdd", evzk(int ), (int)82);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ig.evza("ewde", evzk(int ), (int)83);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ig.evza("ewdf", evzk(int ), (int)84);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ig.evza("ewdg", evzk(int ), (int)85);
        ** while (!var3_1)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long evyw(int n2) {
        return evyx[n2] ^ evyy[n2];
    }

    private static /* synthetic */ void ezfd() {
        ig.evzf[1000] = -1446211340;
        ig.evzf[1001] = -1475192709;
        ig.evzf[1002] = -538796191;
        ig.evzf[1003] = -1547930923;
        ig.evzf[1004] = -329020603;
        ig.evzf[1005] = -547902086;
        ig.evzf[1006] = -395609879;
        ig.evzf[1007] = 832163890;
        ig.evzf[1008] = -642314397;
        ig.evzf[1009] = -892875881;
        ig.evzf[1010] = 204113090;
        ig.evzf[1011] = 867067844;
        ig.evzf[1012] = 2032980913;
        ig.evzf[1013] = -24902865;
        ig.evzf[1014] = 377706914;
        ig.evzf[1015] = 221186606;
        ig.evzf[1016] = 1023248965;
        ig.evzf[1017] = -1866207987;
        ig.evzf[1018] = 1093236269;
        ig.evzf[1019] = 196613685;
        ig.evzf[1020] = 1778731170;
        ig.evzf[1021] = -918166604;
        ig.evzf[1022] = 2034956119;
        ig.evzf[1023] = -1718798869;
        ig.evzf[1024] = 413047111;
        ig.evzf[1025] = -405782615;
        ig.evzf[1026] = 2015173775;
        ig.evzf[1027] = -1580638608;
        ig.evzf[1028] = -860194108;
        ig.evzf[1029] = 1609888674;
        ig.evzf[1030] = -1046378079;
        ig.evzf[1031] = 2061029547;
        ig.evzf[1032] = 1657092024;
        ig.evzf[1033] = -1959218571;
        ig.evzf[1034] = -315126613;
        ig.evzf[1035] = -1943695858;
        ig.evzf[1036] = -316685749;
        ig.evzf[1037] = -1132774456;
        ig.evzf[1038] = -1371647214;
        ig.evzf[1039] = 1019755220;
        ig.evzf[1040] = -352695954;
        ig.evzf[1041] = -847682434;
        ig.evzf[1042] = 7524606;
    }

    private static /* synthetic */ double ewsq(int n2) {
        return Double.longBitsToDouble(evyx[n2] ^ evyy[n2]);
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private ov tremorOnly(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5) {
        v0 /* !! */  = ig.lj;
        block25: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1930284331: {
                    v0 /* !! */  = (long)(ig.evza("ewqx", evyw(int ), (int)33) - ig.evza("ewqw", evyw(int ), (int)32));
                    continue block25;
                }
                case -869293746: {
                    break block25;
                }
            }
            break;
        }
        var8_6 = ig.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("ewqy", evyw(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ig.evza("ewqz", evzk(int ), (int)104)) break;
            v1 /* !! */  = (long)ig.evza("ewra", evzk(int ), (int)105);
        }
        var7_7 /* !! */  = ig.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("ewrb", evyw(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ig.evza("ewrc", evzk(int ), (int)106)) {
                var6_8 = ig.a;
                if (var8_6) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)ig.evza("ewrd", evzk(int ), (int)107);
        }
        if (var6_8 != false) return null;
        if (var6_8 != false) return null;
        v3 = ig.evza("ewre", evzk(int ), (int)108);
        v4 /* !! */  = ig.lj;
        if (true) ** GOTO lbl32
        block28: while (true) {
            v4 /* !! */  = (long)(v5 - ig.evza("ewrf", evyw(int ), (int)36));
lbl32:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2016854518: {
                    v5 = ig.evza("ewrg", evyw(int ), (int)37);
                    continue block28;
                }
                case -869293746: {
                    break block28;
                }
                case -39028150: {
                    v5 = ig.evza("ewrh", evyw(int ), (int)38);
                    continue block28;
                }
                case 964149929: {
                    v5 = ig.evza("ewri", evyw(int ), (int)39);
                    continue block28;
                }
            }
            break;
        }
        this.pursueStreak = (int)v3;
        if (var6_8 != false) return null;
        if (var6_8 != false) return null;
        v6 /* !! */  = ig.lj;
        if (true) ** GOTO lbl51
        block29: while (true) {
            v6 /* !! */  = (long)(v7 - ig.evza("ewrj", evyw(int ), (int)40));
lbl51:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1006353099: {
                    v7 = ig.evza("ewrk", evyw(int ), (int)41);
                    continue block29;
                }
                case -869293746: {
                    break block29;
                }
                case -828677366: {
                    v7 = ig.evza("ewrl", evyw(int ), (int)42);
                    continue block29;
                }
            }
            break;
        }
        this.lastStepPitch = 0.0f;
        while (true) {
            block45: {
                if ((v8 /* !! */  = (cfr_temp_3 = ig.lj - ig.evza("ewrm", evyw(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  != ig.evza("ewrn", evzk(int ), (int)109)) break block45;
                this.lastStepYaw = 0.0f;
                if (var6_8 != false) return null;
                if (var7_7 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v8 /* !! */  = (long)ig.evza("ewro", evzk(int ), (int)110);
        }
        cfr_temp_0 = -2147483648;
        block31: while (true) {
            block46: {
                switch (cfr_temp_0 == -2147483648 ? var7_7 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var6_8 != false) return null;
                        v9 = ig.evza("ewrp", evzd(int ), (int)111);
                        while (true) {
                            if ((v10 /* !! */  = (cfr_temp_4 = ig.lj - ig.evza("ewrq", evyw(int ), (int)44)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v10 /* !! */  == ig.evza("ewrr", evzk(int ), (int)112)) {
                                return this.finishStep(var1_1, var2_2, var3_3, var4_4, var5_5, (float)v9);
                            }
                            v10 /* !! */  = (long)ig.evza("ewrs", evzk(int ), (int)113);
                        }
                    }
                    case 4: {
                        var7_7 /* !! */  = (int)ig.evza("ewrx", evzk(int ), (int)118);
                        cfr_temp_0 = 1;
                        if (var8_6) {
                            throw null;
                        }
                        break block46;
                    }
                    case 5: {
                        var7_7 /* !! */  = (int)ig.evza("ewry", evzk(int ), (int)119);
                        if (var8_6) {
                            throw null;
                        }
                    }
                    case 2: {
                        ** GOTO lbl105
                    }
                    case 7: {
                        ** GOTO lbl102
                    }
                    case 0: {
                        var7_7 /* !! */  = (int)ig.evza("ewrt", evzk(int ), (int)114);
                        if (var8_6) {
                            throw null;
                        }
lbl102:
                        // 3 sources

                        var7_7 /* !! */  = (int)ig.evza("ewsa", evzk(int ), (int)121);
                        if (var8_6) {
                            throw null;
                        }
lbl105:
                        // 3 sources

                        var7_7 /* !! */  = (int)ig.evza("ewrv", evzk(int ), (int)116);
                        if (var8_6) {
                            throw null;
                        }
                    }
                    case 3: {
                        var7_7 /* !! */  = (int)ig.evza("ewrw", evzk(int ), (int)117);
                        cfr_temp_0 = 0;
                        if (var8_6) {
                            throw null;
                        }
                        break block46;
                    }
                    case 1: {
                        var7_7 /* !! */  = (int)ig.evza("ewru", evzk(int ), (int)115);
                        if (var8_6) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl123
            }
            do {
                if (true) continue block31;
lbl123:
                // 2 sources

                var7_7 /* !! */  = (int)ig.evza("ewrz", evzk(int ), (int)120);
                cfr_temp_0 = 1;
            } while (!var8_6);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void ezrc() {
        ig.evyy[200] = 5216144865269723692L;
        ig.evyy[201] = 4025747206312301042L;
        ig.evyy[202] = 3078489754121094960L;
        ig.evyy[203] = -2786405181335883599L;
        ig.evyy[204] = 5867841479530855985L;
        ig.evyy[205] = -6604320749925866161L;
        ig.evyy[206] = 7327026412096595962L;
        ig.evyy[207] = 2667927686749111281L;
        ig.evyy[208] = -6103271101295868073L;
        ig.evyy[209] = 6031414728666553248L;
        ig.evyy[210] = -2747015031554533344L;
        ig.evyy[211] = 4292702240313964470L;
        ig.evyy[212] = -8679252461075031451L;
        ig.evyy[213] = -3756015750330458286L;
        ig.evyy[214] = -4318595235598211352L;
        ig.evyy[215] = 6667687977906567719L;
        ig.evyy[216] = -3834528529867756706L;
        ig.evyy[217] = 3762942340764731015L;
        ig.evyy[218] = -8125471984188033782L;
        ig.evyy[219] = -8128870217358099589L;
        ig.evyy[220] = -5658053923697832345L;
        ig.evyy[221] = -2628607508252660727L;
        ig.evyy[222] = -5384262015198670315L;
        ig.evyy[223] = -4713652368454411499L;
        ig.evyy[224] = -8449574553314449944L;
        ig.evyy[225] = 4044696612684646664L;
        ig.evyy[226] = 792074595128997971L;
        ig.evyy[227] = -5552284783491574431L;
        ig.evyy[228] = 4417321543331886504L;
        ig.evyy[229] = -512460587851968756L;
        ig.evyy[230] = 395470034073272965L;
        ig.evyy[231] = 3867141230904522234L;
        ig.evyy[232] = -5867821664225859186L;
        ig.evyy[233] = -7386711143116930579L;
        ig.evyy[234] = 1103274434335474323L;
        ig.evyy[235] = -6426613215792101452L;
        ig.evyy[236] = 4127320195168169174L;
        ig.evyy[237] = 2130244281933925115L;
        ig.evyy[238] = -6985663413430015630L;
        ig.evyy[239] = 8042814349452982471L;
        ig.evyy[240] = -5497376131788300419L;
        ig.evyy[241] = 1208092075301732336L;
        ig.evyy[242] = -8664619588470104784L;
    }

    private static /* synthetic */ int evzk(int n2) {
        return evzf[n2] ^ evzg[n2];
    }

    private static /* synthetic */ void ezfn() {
        ig.evzg[0] = -336282564;
        ig.evzg[1] = -1570458975;
        ig.evzg[2] = 358942610;
        ig.evzg[3] = 21862425;
        ig.evzg[4] = -1286703492;
        ig.evzg[5] = -1558982988;
        ig.evzg[6] = -858145023;
        ig.evzg[7] = 850088117;
        ig.evzg[8] = -2086335306;
        ig.evzg[9] = -1522281938;
        ig.evzg[10] = 1713289503;
        ig.evzg[11] = 1572065781;
        ig.evzg[12] = -1717908587;
        ig.evzg[13] = 1044913208;
        ig.evzg[14] = 565149888;
        ig.evzg[15] = 1050030621;
        ig.evzg[16] = -388010788;
        ig.evzg[17] = 2060516370;
        ig.evzg[18] = -301698715;
        ig.evzg[19] = -1495725899;
        ig.evzg[20] = -1275918881;
        ig.evzg[21] = 169308286;
        ig.evzg[22] = 1062669521;
        ig.evzg[23] = -45754736;
        ig.evzg[24] = -561714892;
        ig.evzg[25] = -1191511714;
        ig.evzg[26] = -1059220003;
        ig.evzg[27] = -724276726;
        ig.evzg[28] = 309489579;
        ig.evzg[29] = -201826404;
        ig.evzg[30] = 1621427336;
        ig.evzg[31] = 607241104;
        ig.evzg[32] = -1221272454;
        ig.evzg[33] = 1407883081;
        ig.evzg[34] = 973973330;
        ig.evzg[35] = -1489879452;
        ig.evzg[36] = -1932734276;
        ig.evzg[37] = 620044296;
        ig.evzg[38] = 778044873;
        ig.evzg[39] = -768147039;
        ig.evzg[40] = 422380060;
        ig.evzg[41] = 1661568941;
        ig.evzg[42] = 70572131;
        ig.evzg[43] = -376767107;
        ig.evzg[44] = -1727190835;
        ig.evzg[45] = -1167068384;
        ig.evzg[46] = 918825358;
        ig.evzg[47] = 876345550;
        ig.evzg[48] = -1775675203;
        ig.evzg[49] = -1093348985;
        ig.evzg[50] = 316470277;
        ig.evzg[51] = -1757908273;
        ig.evzg[52] = -461293047;
        ig.evzg[53] = 786177444;
        ig.evzg[54] = -913845659;
        ig.evzg[55] = -490513117;
        ig.evzg[56] = -1989290830;
        ig.evzg[57] = -816000646;
        ig.evzg[58] = 91001855;
        ig.evzg[59] = -1109724647;
        ig.evzg[60] = -644095087;
        ig.evzg[61] = 644706358;
        ig.evzg[62] = -1455699217;
        ig.evzg[63] = -515888336;
        ig.evzg[64] = 157541000;
        ig.evzg[65] = 1033161293;
        ig.evzg[66] = 1473947501;
        ig.evzg[67] = -2103403554;
        ig.evzg[68] = 215501818;
        ig.evzg[69] = 302014433;
        ig.evzg[70] = -2078231454;
        ig.evzg[71] = -1338198900;
        ig.evzg[72] = 450644286;
        ig.evzg[73] = 2055254501;
        ig.evzg[74] = -1882471160;
        ig.evzg[75] = 866565200;
        ig.evzg[76] = -1433999690;
        ig.evzg[77] = -1713570886;
        ig.evzg[78] = -642447356;
        ig.evzg[79] = -952851566;
        ig.evzg[80] = 1090841746;
        ig.evzg[81] = 2030228508;
        ig.evzg[82] = 1723971292;
        ig.evzg[83] = 271088582;
        ig.evzg[84] = -1588388427;
        ig.evzg[85] = 229058111;
        ig.evzg[86] = 1348838679;
        ig.evzg[87] = -426135435;
        ig.evzg[88] = -689038570;
        ig.evzg[89] = -415167893;
        ig.evzg[90] = -638930176;
        ig.evzg[91] = 22135769;
        ig.evzg[92] = -1477553141;
        ig.evzg[93] = 206904295;
        ig.evzg[94] = 1148618885;
        ig.evzg[95] = -1227842586;
        ig.evzg[96] = 190624385;
        ig.evzg[97] = 638818417;
        ig.evzg[98] = -945199840;
        ig.evzg[99] = -443195443;
    }

    private static /* synthetic */ void ezpe() {
        ig.evyx[100] = -7019038799617034822L;
        ig.evyx[101] = -913609141174842646L;
        ig.evyx[102] = -4956085997101195427L;
        ig.evyx[103] = -136331893192281358L;
        ig.evyx[104] = 1867760296206850661L;
        ig.evyx[105] = 3154666804097132712L;
        ig.evyx[106] = 8879405509048416202L;
        ig.evyx[107] = 5151333541628826773L;
        ig.evyx[108] = -6999574115648707369L;
        ig.evyx[109] = -7347199920141240432L;
        ig.evyx[110] = -6262031383316153142L;
        ig.evyx[111] = -5774280189483948136L;
        ig.evyx[112] = 8734178552956449364L;
        ig.evyx[113] = 2695632011749557840L;
        ig.evyx[114] = -1550970184125327628L;
        ig.evyx[115] = 8211971892327754197L;
        ig.evyx[116] = 6078522516022612165L;
        ig.evyx[117] = 3673991502603510684L;
        ig.evyx[118] = 7286610169048986946L;
        ig.evyx[119] = -3594908708880338704L;
        ig.evyx[120] = -3323352990452528187L;
        ig.evyx[121] = 3117467193709921922L;
        ig.evyx[122] = -5423648609000940651L;
        ig.evyx[123] = 7169990655233465400L;
        ig.evyx[124] = 163871979185308708L;
        ig.evyx[125] = -4271733707255666460L;
        ig.evyx[126] = 932380135442045959L;
        ig.evyx[127] = 3681323950592971052L;
        ig.evyx[128] = -3412504082528470594L;
        ig.evyx[129] = 1853719083035573850L;
        ig.evyx[130] = -2252019602026908199L;
        ig.evyx[131] = -6519898200536149507L;
        ig.evyx[132] = 7716643882375412289L;
        ig.evyx[133] = 7604958912573509798L;
        ig.evyx[134] = -8268308706938567730L;
        ig.evyx[135] = -473607123152742416L;
        ig.evyx[136] = 1539961634308523563L;
        ig.evyx[137] = 8884529379455063947L;
        ig.evyx[138] = -7668848700579269537L;
        ig.evyx[139] = 8150016200545384830L;
        ig.evyx[140] = -6147075025534203089L;
        ig.evyx[141] = 8309382478679547219L;
        ig.evyx[142] = 3296562552818159771L;
        ig.evyx[143] = -5642641246047039417L;
        ig.evyx[144] = -7473433952370335672L;
        ig.evyx[145] = -6827473736013492711L;
        ig.evyx[146] = -428844372795367148L;
        ig.evyx[147] = -6810537904606491550L;
        ig.evyx[148] = 6356954290005291233L;
        ig.evyx[149] = -3766732114994683205L;
        ig.evyx[150] = 6066358041922124332L;
        ig.evyx[151] = 7813147488384179877L;
        ig.evyx[152] = -3734268849782567900L;
        ig.evyx[153] = -8118839363580505511L;
        ig.evyx[154] = 7791693755696551011L;
        ig.evyx[155] = 6347643595464815822L;
        ig.evyx[156] = 3247895652610891569L;
        ig.evyx[157] = -3546428605986892399L;
        ig.evyx[158] = 4332765694248123512L;
        ig.evyx[159] = -5461669158929429762L;
        ig.evyx[160] = 7766715647780920754L;
        ig.evyx[161] = 3608714465111584872L;
        ig.evyx[162] = 8759557514404416304L;
        ig.evyx[163] = 1984496635092876983L;
        ig.evyx[164] = 4210078496473080133L;
        ig.evyx[165] = 4139969145889692385L;
        ig.evyx[166] = 6083396297325904057L;
        ig.evyx[167] = 7053736187821973903L;
        ig.evyx[168] = 3990297163347141703L;
        ig.evyx[169] = -2008132861776075248L;
        ig.evyx[170] = -826775870428743824L;
        ig.evyx[171] = 3637930914820694146L;
        ig.evyx[172] = 996900442780144351L;
        ig.evyx[173] = -1449252968171387655L;
        ig.evyx[174] = 4944429804326766001L;
        ig.evyx[175] = 7582756246847839754L;
        ig.evyx[176] = 3586399770407090852L;
        ig.evyx[177] = -7916849889170128105L;
        ig.evyx[178] = -5054221641068623240L;
        ig.evyx[179] = -8229114794034791054L;
        ig.evyx[180] = -5251742897783746979L;
        ig.evyx[181] = -2732364805981347164L;
        ig.evyx[182] = 5895153102343145717L;
        ig.evyx[183] = 5804547271749876420L;
        ig.evyx[184] = 2214426995085664406L;
        ig.evyx[185] = -5075205197078945280L;
        ig.evyx[186] = -3946714329027364790L;
        ig.evyx[187] = 8084646522728267735L;
        ig.evyx[188] = 3832358837081727419L;
        ig.evyx[189] = 9118121016335654238L;
        ig.evyx[190] = -5556384922498093819L;
        ig.evyx[191] = 1727633382844106848L;
        ig.evyx[192] = -4133154594297988178L;
        ig.evyx[193] = 3500557353351927598L;
        ig.evyx[194] = 7818267477282334102L;
        ig.evyx[195] = 294796780026307476L;
        ig.evyx[196] = -7420093143861055108L;
        ig.evyx[197] = -8515915026661766553L;
        ig.evyx[198] = 2443347195541486497L;
        ig.evyx[199] = -7519932599760789652L;
    }

    private static /* synthetic */ float evzd(int n2) {
        return Float.intBitsToFloat(evzf[n2] ^ evzg[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void advanceNoise() {
        v0 /* !! */  = ig.lj;
        if (true) ** GOTO lbl5
        block88: while (true) {
            v0 /* !! */  = (long)(ig.evza("eyhh", evyw(int ), (int)144) - ig.evza("eyhg", evyw(int ), (int)143));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1864557634: {
                    continue block88;
                }
                case -869293746: {
                    break block88;
                }
            }
            break;
        }
        var3_1 = ig.c;
        v1 /* !! */  = ig.lj;
        if (true) ** GOTO lbl15
        block89: while (true) {
            v1 /* !! */  = (long)(v2 - ig.evza("eyhi", evyw(int ), (int)145));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1954015320: {
                    v2 = ig.evza("eyhj", evyw(int ), (int)146);
                    continue block89;
                }
                case -869293746: {
                    break block89;
                }
                case 1929380567: {
                    v2 = ig.evza("eyhk", evyw(int ), (int)147);
                    continue block89;
                }
            }
            break;
        }
        var2_2 /* !! */  = ig.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("eyhl", evyw(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ig.evza("eyhm", evzk(int ), (int)953)) break;
            v3 /* !! */  = (long)ig.evza("eyhn", evzk(int ), (int)954);
        }
        var1_3 = ig.a;
        if (var3_1) {
            throw null;
lbl33:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ig.lj;
                if (true) ** GOTO lbl43
                block92: while (true) {
                    v4 /* !! */  = (long)(v5 - ig.evza("eyho", evyw(int ), (int)149));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1961280623: {
                            v5 = ig.evza("eyhp", evyw(int ), (int)150);
                            continue block92;
                        }
                        case -869293746: {
                            break block92;
                        }
                        case -121359473: {
                            v5 = ig.evza("eyhq", evyw(int ), (int)151);
                            continue block92;
                        }
                        case 453228253: {
                            v5 = ig.evza("eyhr", evyw(int ), (int)152);
                            continue block92;
                        }
                    }
                    break;
                }
                v6 = ig.evza("eyhs", evzd(int ), (int)955);
                v7 /* !! */  = ig.lj;
                if (true) ** GOTO lbl60
                block93: while (true) {
                    v7 /* !! */  = (long)(v8 - ig.evza("eyht", evyw(int ), (int)153));
lbl60:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1344542451: {
                            v8 = ig.evza("eyhu", evyw(int ), (int)154);
                            continue block93;
                        }
                        case -869293746: {
                            break block93;
                        }
                        case -558754987: {
                            v8 = ig.evza("eyhv", evyw(int ), (int)155);
                            continue block93;
                        }
                    }
                    break;
                }
                v9 = v6 * this.noiseYaw;
                v10 = ig.evza("eyhw", evzd(int ), (int)956);
                v11 /* !! */  = ig.lj;
                if (true) ** GOTO lbl75
                block94: while (true) {
                    v11 /* !! */  = (long)(v12 - ig.evza("eyhx", evyw(int ), (int)156));
lbl75:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1574803639: {
                            v12 = ig.evza("eyhy", evyw(int ), (int)157);
                            continue block94;
                        }
                        case -869293746: {
                            break block94;
                        }
                        case 1073373684: {
                            v12 = ig.evza("eyhz", evyw(int ), (int)158);
                            continue block94;
                        }
                    }
                    break;
                }
                v13 = this.noiseYaw + (v9 + v10 * this.randGauss());
                v14 /* !! */  = ig.lj;
                if (true) ** GOTO lbl89
                block95: while (true) {
                    v14 /* !! */  = (long)(v15 - ig.evza("eyia", evyw(int ), (int)159));
lbl89:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1455935857: {
                            v15 = ig.evza("eyib", evyw(int ), (int)160);
                            continue block95;
                        }
                        case -869293746: {
                            break block95;
                        }
                        case 2016539913: {
                            v15 = ig.evza("eyic", evyw(int ), (int)161);
                            continue block95;
                        }
                        case 2036358104: {
                            v15 = ig.evza("eyid", evyw(int ), (int)162);
                            continue block95;
                        }
                    }
                    break;
                }
                this.noiseYaw = v13;
                if (var1_3 || var1_3) ** GOTO lbl33
                v16 /* !! */  = ig.lj;
                if (true) ** GOTO lbl107
                block96: while (true) {
                    v16 /* !! */  = (long)(ig.evza("eyif", evyw(int ), (int)164) - ig.evza("eyie", evyw(int ), (int)163));
lbl107:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -869293746: {
                            break block96;
                        }
                        case 1974126227: {
                            continue block96;
                        }
                    }
                    break;
                }
                v17 = ig.evza("eyig", evzd(int ), (int)957);
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("eyih", evyw(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ig.evza("eyii", evzk(int ), (int)958)) break;
                    v18 /* !! */  = (long)ig.evza("eyij", evzk(int ), (int)959);
                }
                v19 = v17 * this.noisePitch;
                v20 = ig.evza("eyik", evzd(int ), (int)960);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("eyil", evyw(int ), (int)166)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ig.evza("eyim", evzk(int ), (int)961)) break;
                    v21 /* !! */  = (long)ig.evza("eyin", evzk(int ), (int)962);
                }
                v22 = this.noisePitch + (v19 + v20 * this.randGauss());
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_3 = ig.lj - ig.evza("eyio", evyw(int ), (int)167)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ig.evza("eyip", evzk(int ), (int)963)) break;
                    v23 /* !! */  = (long)ig.evza("eyiq", evzk(int ), (int)964);
                }
                this.noisePitch = v22;
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_4 = ig.lj - ig.evza("eyir", evyw(int ), (int)168)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ig.evza("eyis", evzk(int ), (int)965)) break;
                    v24 /* !! */  = (long)ig.evza("eyit", evzk(int ), (int)966);
                }
                v25 = ig.evza("eyiu", evzd(int ), (int)967);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_5 = ig.lj - ig.evza("eyiv", evyw(int ), (int)169)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == ig.evza("eyiw", evzk(int ), (int)968)) break;
                    v26 /* !! */  = (long)ig.evza("eyix", evzk(int ), (int)969);
                }
                v27 = v25 * this.wanderYaw;
                v28 = ig.evza("eyiy", evzd(int ), (int)970);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_6 = ig.lj - ig.evza("eyiz", evyw(int ), (int)170)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == ig.evza("eyja", evzk(int ), (int)971)) break;
                    v29 /* !! */  = (long)ig.evza("eyjb", evzk(int ), (int)972);
                }
                v30 = this.wanderYaw + (v27 + v28 * this.randGauss());
                v31 /* !! */  = ig.lj;
                if (true) ** GOTO lbl156
                block103: while (true) {
                    v31 /* !! */  = (long)(v32 - ig.evza("eyjc", evyw(int ), (int)171));
lbl156:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1497772513: {
                            v32 = ig.evza("eyjd", evyw(int ), (int)172);
                            continue block103;
                        }
                        case -997266959: {
                            v32 = ig.evza("eyje", evyw(int ), (int)173);
                            continue block103;
                        }
                        case -869293746: {
                            break block103;
                        }
                        case -303040472: {
                            v32 = ig.evza("eyjf", evyw(int ), (int)174);
                            continue block103;
                        }
                    }
                    break;
                }
                this.wanderYaw = v30;
                if (var1_3 || var1_3) ** GOTO lbl33
                v33 /* !! */  = ig.lj;
                if (true) ** GOTO lbl174
                block104: while (true) {
                    v33 /* !! */  = (long)(ig.evza("eyjh", evyw(int ), (int)176) - ig.evza("eyjg", evyw(int ), (int)175));
lbl174:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -2026151544: {
                            continue block104;
                        }
                        case -869293746: {
                            break block104;
                        }
                    }
                    break;
                }
                v34 = ig.evza("eyji", evzd(int ), (int)973);
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_7 = ig.lj - ig.evza("eyjj", evyw(int ), (int)177)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == ig.evza("eyjk", evzk(int ), (int)974)) break;
                    v35 /* !! */  = (long)ig.evza("eyjl", evzk(int ), (int)975);
                }
                v36 = v34 * this.wanderPitch;
                v37 = ig.evza("eyjm", evzd(int ), (int)976);
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_8 = ig.lj - ig.evza("eyjn", evyw(int ), (int)178)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == ig.evza("eyjo", evzk(int ), (int)977)) break;
                    v38 /* !! */  = (long)ig.evza("eyjp", evzk(int ), (int)978);
                }
                v39 = this.wanderPitch + (v36 + v37 * this.randGauss());
                v40 /* !! */  = ig.lj;
                if (true) ** GOTO lbl197
                block107: while (true) {
                    v40 /* !! */  = (long)(v41 - ig.evza("eyjq", evyw(int ), (int)179));
lbl197:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -1428060584: {
                            v41 = ig.evza("eyjr", evyw(int ), (int)180);
                            continue block107;
                        }
                        case -869293746: {
                            break block107;
                        }
                        case 1310413058: {
                            v41 = ig.evza("eyjs", evyw(int ), (int)181);
                            continue block107;
                        }
                    }
                    break;
                }
                this.wanderPitch = v39;
                if (var1_3 || var1_3) ** GOTO lbl33
                v42 /* !! */  = ig.lj;
                if (true) ** GOTO lbl212
                block108: while (true) {
                    v42 /* !! */  = (long)(v43 - ig.evza("eyjt", evyw(int ), (int)182));
lbl212:
                    // 2 sources

                    switch ((int)v42 /* !! */ ) {
                        case -869293746: {
                            break block108;
                        }
                        case 381363392: {
                            v43 = ig.evza("eyju", evyw(int ), (int)183);
                            continue block108;
                        }
                        case 1070856452: {
                            v43 = ig.evza("eyjv", evyw(int ), (int)184);
                            continue block108;
                        }
                    }
                    break;
                }
                v44 = ig.evza("eyjw", evzd(int ), (int)979);
                while (true) {
                    if ((v45 /* !! */  = (cfr_temp_9 = ig.lj - ig.evza("eyjx", evyw(int ), (int)185)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v45 /* !! */  == ig.evza("eyjy", evzk(int ), (int)980)) break;
                    v45 /* !! */  = (long)ig.evza("eyjz", evzk(int ), (int)981);
                }
                v46 = v44 * this.speedDrift;
                v47 = ig.evza("eyka", evzd(int ), (int)982);
                v48 /* !! */  = ig.lj;
                if (true) ** GOTO lbl233
                block110: while (true) {
                    v48 /* !! */  = (long)(v49 - ig.evza("eykb", evyw(int ), (int)186));
lbl233:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case -869293746: {
                            break block110;
                        }
                        case 1360680441: {
                            v49 = ig.evza("eykc", evyw(int ), (int)187);
                            continue block110;
                        }
                        case 1779847508: {
                            v49 = ig.evza("eykd", evyw(int ), (int)188);
                            continue block110;
                        }
                    }
                    break;
                }
                v50 = this.speedDrift + (v46 + v47 * this.randGauss());
                v51 /* !! */  = ig.lj;
                if (true) ** GOTO lbl247
                block111: while (true) {
                    v51 /* !! */  = (long)(v52 - ig.evza("eyke", evyw(int ), (int)189));
lbl247:
                    // 2 sources

                    switch ((int)v51 /* !! */ ) {
                        case -1734109800: {
                            v52 = ig.evza("eykf", evyw(int ), (int)190);
                            continue block111;
                        }
                        case -916261103: {
                            v52 = ig.evza("eykg", evyw(int ), (int)191);
                            continue block111;
                        }
                        case -869293746: {
                            break block111;
                        }
                    }
                    break;
                }
                this.speedDrift = v50;
                if (var1_3 || var1_3) ** GOTO lbl33
                while (true) {
                    if ((v53 /* !! */  = (cfr_temp_10 = ig.lj - ig.evza("eykh", evyw(int ), (int)192)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v53 /* !! */  == ig.evza("eyki", evzk(int ), (int)983)) break;
                    v53 /* !! */  = (long)ig.evza("eykj", evzk(int ), (int)984);
                }
                v54 = ig.evza("eykk", evzd(int ), (int)985);
                v55 = ig.evza("eykl", evzd(int ), (int)986);
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_11 = ig.lj - ig.evza("eykm", evyw(int ), (int)193)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == ig.evza("eykn", evzk(int ), (int)987)) break;
                    v56 /* !! */  = (long)ig.evza("eyko", evzk(int ), (int)988);
                }
                v57 = class_3532.method_15363((float)this.speedDrift, (float)v54, (float)v55);
                v58 /* !! */  = ig.lj;
                if (true) ** GOTO lbl275
                block114: while (true) {
                    v58 /* !! */  = (long)(v59 - ig.evza("eykp", evyw(int ), (int)194));
lbl275:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -869293746: {
                            break block114;
                        }
                        case -769065216: {
                            v59 = ig.evza("eykq", evyw(int ), (int)195);
                            continue block114;
                        }
                        case -406645499: {
                            v59 = ig.evza("eykr", evyw(int ), (int)196);
                            continue block114;
                        }
                    }
                    break;
                }
                this.speedDrift = v57;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl287:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)ig.evza("eyks", evzk(int ), (int)989);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl292:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ig.evza("eykt", evzk(int ), (int)990);
                if (var3_1) {
                    throw null;
                }
            }
lbl296:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ig.evza("eyku", evzk(int ), (int)991);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)ig.evza("eykv", evzk(int ), (int)992);
                if (var3_1) {
                    throw null;
                }
            }
lbl304:
            // 5 sources

            case 4: {
                var2_2 /* !! */  = (int)ig.evza("eykw", evzk(int ), (int)993);
                if (var3_1) {
                    throw null;
                }
            }
lbl308:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)ig.evza("eykx", evzk(int ), (int)994);
                if (!var3_1) ** GOTO lbl292
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ig.evza("eyky", evzk(int ), (int)995);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)ig.evza("eykz", evzk(int ), (int)996);
                if (!var3_1) ** GOTO lbl287
                throw null;
            }
lbl320:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ig.evza("eyla", evzk(int ), (int)997);
                if (!var3_1) ** GOTO lbl296
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ig.evza("eylb", evzk(int ), (int)998);
                if (!var3_1) ** GOTO lbl320
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ig.evza("eylc", evzk(int ), (int)999);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl342
                    break;
                }
            }
            case 11: {
                var2_2 /* !! */  = (int)ig.evza("eyld", evzk(int ), (int)1000);
                if (!var3_1) ** GOTO lbl304
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ig.evza("eyle", evzk(int ), (int)1001);
                if (!var3_1) ** GOTO lbl287
                throw null;
            }
lbl342:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)ig.evza("eylf", evzk(int ), (int)1002);
                if (!var3_1) ** GOTO lbl287
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)ig.evza("eylg", evzk(int ), (int)1003);
                if (!var3_1) ** GOTO lbl308
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)ig.evza("eylh", evzk(int ), (int)1004);
        ** while (!var3_1)
lbl353:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetState() {
        var3_1 = ig.c;
        var2_2 /* !! */  = ig.b;
        var1_3 = ig.a;
        if (var3_1) {
            throw null;
lbl6:
            // 21 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        this.recoverTicks = (int)ig.evza("ewab", evzk(int ), (int)16);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.pursueStreak = (int)ig.evza("ewac", evzk(int ), (int)17);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastStepPitch = 0.0f;
        this.lastStepYaw = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastRemYaw = (float)ig.evza("ewad", evzd(int ), (int)18);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.lastRemPitch = 0.0f;
        if (var1_3 || var1_3) ** GOTO lbl6
        this.combatTicks = (int)ig.evza("ewae", evzk(int ), (int)19);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.rotationTicks = (int)ig.evza("ewaf", evzk(int ), (int)20);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.ticksSinceWindowBreak = (int)ig.evza("ewag", evzk(int ), (int)21);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.windowBreakTicks = (int)ig.evza("ewah", evzk(int ), (int)22);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.spikeGuardTicks = (int)ig.evza("ewai", evzk(int ), (int)23);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.attacksSinceBreak = (int)ig.evza("ewaj", evzk(int ), (int)24);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lastCloseRatio = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lockSkewTicks = (int)ig.evza("ewal", evzk(int ), (int)25);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.lockSkewYaw = this.random.nextBoolean();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.nextWindowBreakAt = (int)(ig.evza("ewam", evzk(int ), (int)26) + this.random.nextInt((int)ig.evza("ewan", evzk(int ), (int)27)));
                if (var1_3 || var1_3) ** GOTO lbl6
                this.speedDrift = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl6
                this.noiseYaw = this.randGauss();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.noisePitch = this.randGauss();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.wanderYaw = this.randGauss();
                if (var1_3 || var1_3) ** GOTO lbl6
                this.wanderPitch = this.randGauss();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl54:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ig.evza("ewap", evzk(int ), (int)28);
                if (!var3_1) break;
                throw null;
            }
lbl58:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ig.evza("ewaq", evzk(int ), (int)29);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl63:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ig.evza("ewar", evzk(int ), (int)30);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl68:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)ig.evza("ewas", evzk(int ), (int)31);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)ig.evza("ewat", evzk(int ), (int)32);
                } while (!var3_1);
                throw null;
            }
lbl77:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ig.evza("ewau", evzk(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 6: {
                var2_2 /* !! */  = (int)ig.evza("ewav", evzk(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl87:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ig.evza("ewaw", evzk(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 8: {
                var2_2 /* !! */  = (int)ig.evza("ewax", evzk(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl97:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ig.evza("eway", evzk(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 10: {
                var2_2 /* !! */  = (int)ig.evza("ewaz", evzk(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl107:
            // 4 sources

            case 11: {
                var2_2 /* !! */  = (int)ig.evza("ewba", evzk(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 12: {
                var2_2 /* !! */  = (int)ig.evza("ewbb", evzk(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 13: {
                var2_2 /* !! */  = (int)ig.evza("ewbc", evzk(int ), (int)41);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl122:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)ig.evza("ewbd", evzk(int ), (int)42);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)ig.evza("ewbe", evzk(int ), (int)43);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl131:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)ig.evza("ewbf", evzk(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl239
            }
            case 17: {
                var2_2 /* !! */  = (int)ig.evza("ewbg", evzk(int ), (int)45);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl140:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)ig.evza("ewbi", evzk(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 19: {
                var2_2 /* !! */  = (int)ig.evza("ewbj", evzk(int ), (int)47);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
lbl149:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)ig.evza("ewbk", evzk(int ), (int)48);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl154:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)ig.evza("ewbl", evzk(int ), (int)49);
                if (!var3_1) ** GOTO lbl131
                throw null;
            }
lbl158:
            // 2 sources

            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ig.evza("ewbn", evzk(int ), (int)50);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
lbl163:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)ig.evza("ewbo", evzk(int ), (int)51);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 24: {
                var2_2 /* !! */  = (int)ig.evza("ewbp", evzk(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl243
            }
lbl173:
            // 3 sources

            case 25: {
                var2_2 /* !! */  = (int)ig.evza("ewbq", evzk(int ), (int)53);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 26: {
                var2_2 /* !! */  = (int)ig.evza("ewbr", evzk(int ), (int)54);
                if (!var3_1) ** GOTO lbl173
                throw null;
            }
lbl182:
            // 2 sources

            case 27: {
                var2_2 /* !! */  = (int)ig.evza("ewbs", evzk(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
            }
lbl186:
            // 4 sources

            case 28: {
                var2_2 /* !! */  = (int)ig.evza("ewbt", evzk(int ), (int)56);
                if (!var3_1) ** GOTO lbl122
                throw null;
            }
lbl190:
            // 2 sources

            case 29: {
                var2_2 /* !! */  = (int)ig.evza("ewbu", evzk(int ), (int)57);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
lbl194:
            // 2 sources

            case 30: {
                var2_2 /* !! */  = (int)ig.evza("ewbw", evzk(int ), (int)58);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl199:
            // 2 sources

            case 31: {
                var2_2 /* !! */  = (int)ig.evza("ewbx", evzk(int ), (int)59);
                if (!var3_1) ** GOTO lbl186
                throw null;
            }
lbl203:
            // 2 sources

            case 32: {
                var2_2 /* !! */  = (int)ig.evza("ewby", evzk(int ), (int)60);
                if (!var3_1) ** GOTO lbl199
                throw null;
            }
lbl207:
            // 3 sources

            case 33: {
                var2_2 /* !! */  = (int)ig.evza("ewbz", evzk(int ), (int)61);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
lbl211:
            // 2 sources

            case 34: {
                var2_2 /* !! */  = (int)ig.evza("ewca", evzk(int ), (int)62);
                if (!var3_1) ** GOTO lbl107
                throw null;
            }
lbl215:
            // 2 sources

            case 35: {
                var2_2 /* !! */  = (int)ig.evza("ewcb", evzk(int ), (int)63);
                if (!var3_1) ** GOTO lbl54
                throw null;
            }
lbl219:
            // 2 sources

            case 36: {
                var2_2 /* !! */  = (int)ig.evza("ewcc", evzk(int ), (int)64);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
lbl223:
            // 2 sources

            case 37: {
                var2_2 /* !! */  = (int)ig.evza("ewcd", evzk(int ), (int)65);
                if (!var3_1) ** GOTO lbl190
                throw null;
            }
            case 38: {
                var2_2 /* !! */  = (int)ig.evza("ewce", evzk(int ), (int)66);
                if (!var3_1) ** GOTO lbl140
                throw null;
            }
            case 39: {
                var2_2 /* !! */  = (int)ig.evza("ewcf", evzk(int ), (int)67);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
lbl235:
            // 3 sources

            case 40: {
                var2_2 /* !! */  = (int)ig.evza("ewcg", evzk(int ), (int)68);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
lbl239:
            // 2 sources

            case 41: {
                var2_2 /* !! */  = (int)ig.evza("ewch", evzk(int ), (int)69);
                if (var3_1) {
                    throw null;
                }
            }
lbl243:
            // 4 sources

            case 42: {
                var2_2 /* !! */  = (int)ig.evza("ewci", evzk(int ), (int)70);
                if (!var3_1) ** GOTO lbl194
                throw null;
            }
            case 43: 
        }
        var2_2 /* !! */  = (int)ig.evza("ewcj", evzk(int ), (int)71);
        ** while (!var3_1)
lbl250:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ezdi() {
        ig.evzf[700] = 1450453770;
        ig.evzf[701] = -752841860;
        ig.evzf[702] = 437244332;
        ig.evzf[703] = -1655385016;
        ig.evzf[704] = -749232233;
        ig.evzf[705] = -1695074051;
        ig.evzf[706] = -677919881;
        ig.evzf[707] = 1961549056;
        ig.evzf[708] = 81128032;
        ig.evzf[709] = -1434917041;
        ig.evzf[710] = -1913011586;
        ig.evzf[711] = -1675805681;
        ig.evzf[712] = 790971339;
        ig.evzf[713] = 2109550694;
        ig.evzf[714] = -412159277;
        ig.evzf[715] = -398785626;
        ig.evzf[716] = -871746250;
        ig.evzf[717] = -932710424;
        ig.evzf[718] = -539323308;
        ig.evzf[719] = -1825758055;
        ig.evzf[720] = -1953161028;
        ig.evzf[721] = 115434592;
        ig.evzf[722] = 1955883779;
        ig.evzf[723] = -192681171;
        ig.evzf[724] = 646255338;
        ig.evzf[725] = 1089530850;
        ig.evzf[726] = 850742827;
        ig.evzf[727] = 1931206449;
        ig.evzf[728] = 751548741;
        ig.evzf[729] = -991117922;
        ig.evzf[730] = 1919975804;
        ig.evzf[731] = -818477734;
        ig.evzf[732] = 102209651;
        ig.evzf[733] = 0xDFF0F00;
        ig.evzf[734] = -852032535;
        ig.evzf[735] = 189896392;
        ig.evzf[736] = 721864653;
        ig.evzf[737] = -266926136;
        ig.evzf[738] = 1585534133;
        ig.evzf[739] = 885495911;
        ig.evzf[740] = -1258957650;
        ig.evzf[741] = 288577683;
        ig.evzf[742] = 468670178;
        ig.evzf[743] = 2127753502;
        ig.evzf[744] = 360945434;
        ig.evzf[745] = 1980809512;
        ig.evzf[746] = -2143990918;
        ig.evzf[747] = -792728405;
        ig.evzf[748] = 2132545891;
        ig.evzf[749] = -936967749;
        ig.evzf[750] = -1874322792;
        ig.evzf[751] = 2108702740;
        ig.evzf[752] = 40479222;
        ig.evzf[753] = 277021533;
        ig.evzf[754] = 178936509;
        ig.evzf[755] = 656606495;
        ig.evzf[756] = -223519483;
        ig.evzf[757] = 112539453;
        ig.evzf[758] = 685688597;
        ig.evzf[759] = 1039810700;
        ig.evzf[760] = -369906399;
        ig.evzf[761] = 553088273;
        ig.evzf[762] = -1977867209;
        ig.evzf[763] = -2044926632;
        ig.evzf[764] = -14324004;
        ig.evzf[765] = 723375241;
        ig.evzf[766] = -1616266793;
        ig.evzf[767] = -379688068;
        ig.evzf[768] = -128924903;
        ig.evzf[769] = -249933484;
        ig.evzf[770] = -1240801633;
        ig.evzf[771] = -1522308406;
        ig.evzf[772] = -1669869252;
        ig.evzf[773] = 672346361;
        ig.evzf[774] = -1651292081;
        ig.evzf[775] = -154348161;
        ig.evzf[776] = -1225255178;
        ig.evzf[777] = 579369317;
        ig.evzf[778] = 409276450;
        ig.evzf[779] = 1038727011;
        ig.evzf[780] = -327786239;
        ig.evzf[781] = 1896151116;
        ig.evzf[782] = -562780988;
        ig.evzf[783] = -1312185805;
        ig.evzf[784] = -1956068375;
        ig.evzf[785] = -1919182263;
        ig.evzf[786] = -113370724;
        ig.evzf[787] = 373827412;
        ig.evzf[788] = -99017010;
        ig.evzf[789] = 1295654345;
        ig.evzf[790] = -476410567;
        ig.evzf[791] = 55312823;
        ig.evzf[792] = 244321649;
        ig.evzf[793] = -1964613141;
        ig.evzf[794] = -1512337063;
        ig.evzf[795] = -1350903162;
        ig.evzf[796] = 1400981802;
        ig.evzf[797] = 1452004296;
        ig.evzf[798] = -1371680354;
        ig.evzf[799] = 1783415434;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov finishStep(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        v0 /* !! */  = ig.lj;
        if (true) ** GOTO lbl5
        block42: while (true) {
            v0 /* !! */  = (long)(ig.evza("eycg", evyw(int ), (int)94) - ig.evza("eycf", evyw(int ), (int)93));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -869293746: {
                    break block42;
                }
                case 1173300319: {
                    continue block42;
                }
            }
            break;
        }
        var11_7 = ig.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("eych", evyw(int ), (int)95)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ig.evza("eyci", evzk(int ), (int)872)) break;
            v1 /* !! */  = (long)ig.evza("eycj", evzk(int ), (int)873);
        }
        var10_8 /* !! */  = ig.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("eyck", evyw(int ), (int)96)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ig.evza("eycl", evzk(int ), (int)874)) break;
            v2 /* !! */  = (long)ig.evza("eycm", evzk(int ), (int)875);
        }
        var9_9 = ig.a;
        if (var11_7) {
            throw null;
lbl25:
            // 3 sources

            return null;
        }
        if (var9_9 || var9_9) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("eycn", evyw(int ), (int)97)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ig.evza("eyco", evzk(int ), (int)876)) break;
            v3 /* !! */  = (long)ig.evza("eycp", evzk(int ), (int)877);
        }
        v4 = var1_1.getYaw();
        v5 /* !! */  = ig.lj;
        if (true) ** GOTO lbl38
        block47: while (true) {
            v5 /* !! */  = (long)(v6 - ig.evza("eycq", evyw(int ), (int)98));
lbl38:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -869293746: {
                    break block47;
                }
                case 625951691: {
                    v6 = ig.evza("eycr", evyw(int ), (int)99);
                    continue block47;
                }
                case 1140651047: {
                    v6 = ig.evza("eycs", evyw(int ), (int)100);
                    continue block47;
                }
                case 1743436970: {
                    v6 = ig.evza("eyct", evyw(int ), (int)101);
                    continue block47;
                }
            }
            break;
        }
        var7_10 = v4 + ig.clampOvershoot(var4_4, var2_2, var6_6);
        if (var9_9 || var9_9) ** GOTO lbl25
        v7 /* !! */  = ig.lj;
        if (true) ** GOTO lbl56
        block48: while (true) {
            v7 /* !! */  = (long)(v8 - ig.evza("eycu", evyw(int ), (int)102));
lbl56:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -869293746: {
                    break block48;
                }
                case 866396874: {
                    v8 = ig.evza("eycv", evyw(int ), (int)103);
                    continue block48;
                }
                case 1097578532: {
                    v8 = ig.evza("eycw", evyw(int ), (int)104);
                    continue block48;
                }
                case 1972038135: {
                    v8 = ig.evza("eycx", evyw(int ), (int)105);
                    continue block48;
                }
            }
            break;
        }
        v9 = var1_1.getPitch();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = ig.lj - ig.evza("eycy", evyw(int ), (int)106)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ig.evza("eycz", evzk(int ), (int)878)) break;
            v10 /* !! */  = (long)ig.evza("eyda", evzk(int ), (int)879);
        }
        v11 = v9 + ig.clampOvershoot(var5_5, var3_3, var6_6);
        v12 = ig.evza("eydb", evzd(int ), (int)880);
        v13 = ig.evza("eydc", evzd(int ), (int)881);
        v14 /* !! */  = ig.lj;
        if (true) ** GOTO lbl81
        block50: while (true) {
            v14 /* !! */  = (long)(v15 - ig.evza("eydd", evyw(int ), (int)107));
lbl81:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1169340405: {
                    v15 = ig.evza("eyde", evyw(int ), (int)108);
                    continue block50;
                }
                case -869293746: {
                    break block50;
                }
                case 169735672: {
                    v15 = ig.evza("eydf", evyw(int ), (int)109);
                    continue block50;
                }
                case 1558256249: {
                    v15 = ig.evza("eydg", evyw(int ), (int)110);
                    continue block50;
                }
            }
            break;
        }
        var8_11 = class_3532.method_15363((float)v11, (float)v12, (float)v13);
        if (var10_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_9 || var9_9) ** continue;
                v16 /* !! */  = ig.lj;
                if (true) ** GOTO lbl102
                block51: while (true) {
                    v16 /* !! */  = (long)(v17 - ig.evza("eydh", evyw(int ), (int)111));
lbl102:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -869293746: {
                            break block51;
                        }
                        case 521610930: {
                            v17 = ig.evza("eydi", evyw(int ), (int)112);
                            continue block51;
                        }
                        case 1679909162: {
                            v17 = ig.evza("eydj", evyw(int ), (int)113);
                            continue block51;
                        }
                    }
                    break;
                }
                v18 /* !! */  = ig.lj;
                if (true) ** GOTO lbl115
                block52: while (true) {
                    v18 /* !! */  = (long)(v19 - ig.evza("eydk", evyw(int ), (int)114));
lbl115:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1802767995: {
                            v19 = ig.evza("eydl", evyw(int ), (int)115);
                            continue block52;
                        }
                        case -869293746: {
                            break block52;
                        }
                        case -305434443: {
                            v19 = ig.evza("eydm", evyw(int ), (int)116);
                            continue block52;
                        }
                    }
                    break;
                }
                return new ov(var7_10, var8_11);
            }
lbl125:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_8 /* !! */  = (int)ig.evza("eydn", evzk(int ), (int)882);
                    if (var11_7) {
                        throw null;
                    }
                    ** GOTO lbl148
                    break;
                }
            }
lbl131:
            // 2 sources

            case 1: {
                var10_8 /* !! */  = (int)ig.evza("eydo", evzk(int ), (int)883);
                if (var11_7) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl136:
            // 2 sources

            case 2: {
                var10_8 /* !! */  = (int)ig.evza("eydp", evzk(int ), (int)884);
                if (!var11_7) ** GOTO lbl131
                throw null;
            }
lbl140:
            // 2 sources

            case 3: {
                var10_8 /* !! */  = (int)ig.evza("eydq", evzk(int ), (int)885);
                if (!var11_7) ** GOTO lbl125
                throw null;
            }
            case 4: {
                var10_8 /* !! */  = (int)ig.evza("eydr", evzk(int ), (int)886);
                if (!var11_7) ** GOTO lbl136
                throw null;
            }
lbl148:
            // 3 sources

            case 5: {
                var10_8 /* !! */  = (int)ig.evza("eyds", evzk(int ), (int)887);
                if (!var11_7) ** GOTO lbl125
                throw null;
            }
            case 6: {
                var10_8 /* !! */  = (int)ig.evza("eydt", evzk(int ), (int)888);
                if (!var11_7) ** GOTO lbl148
                throw null;
            }
            case 7: 
        }
        var10_8 /* !! */  = (int)ig.evza("eydu", evzk(int ), (int)889);
        ** while (!var11_7)
lbl159:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ezqs() {
        ig.evyy[100] = -6102559503912975750L;
        ig.evyy[101] = 8119687018019379783L;
        ig.evyy[102] = 6151430478400229045L;
        ig.evyy[103] = -8304177994176439589L;
        ig.evyy[104] = 3361748203940184025L;
        ig.evyy[105] = -3451278009411013835L;
        ig.evyy[106] = -1322395993152421220L;
        ig.evyy[107] = -4705779725199961342L;
        ig.evyy[108] = -2106031287712065828L;
        ig.evyy[109] = 8820767852755034121L;
        ig.evyy[110] = -7555988266353574661L;
        ig.evyy[111] = 3444027337133481670L;
        ig.evyy[112] = 5580957675002215940L;
        ig.evyy[113] = 9143500709601320294L;
        ig.evyy[114] = 8920642453063674362L;
        ig.evyy[115] = 7745531472787233182L;
        ig.evyy[116] = -2690222159144181179L;
        ig.evyy[117] = 886194526279536145L;
        ig.evyy[118] = 7286610169048986946L;
        ig.evyy[119] = -1022956935361941264L;
        ig.evyy[120] = -3323352990452528188L;
        ig.evyy[121] = -3117467193709921923L;
        ig.evyy[122] = -812110511931581547L;
        ig.evyy[123] = 7169990655233465402L;
        ig.evyy[124] = 163871979185308710L;
        ig.evyy[125] = 4271733707255666458L;
        ig.evyy[126] = 5540688454148905991L;
        ig.evyy[127] = 3681323950592971055L;
        ig.evyy[128] = -3412504082528470595L;
        ig.evyy[129] = -1853719083035573849L;
        ig.evyy[130] = -6873275769662458407L;
        ig.evyy[131] = -6519898200536149511L;
        ig.evyy[132] = 7716643882375412293L;
        ig.evyy[133] = -7604958912573509798L;
        ig.evyy[134] = -5174180327496931379L;
        ig.evyy[135] = -1789397124548642362L;
        ig.evyy[136] = 5826684295908959778L;
        ig.evyy[137] = 8641278724156643495L;
        ig.evyy[138] = 891671594983698274L;
        ig.evyy[139] = 3053257808835226878L;
        ig.evyy[140] = -3921650547049255885L;
        ig.evyy[141] = 5215304781404174077L;
        ig.evyy[142] = 1775691353950865663L;
        ig.evyy[143] = 5654687628966926776L;
        ig.evyy[144] = -271918588116017675L;
        ig.evyy[145] = -528307969501240649L;
        ig.evyy[146] = 2082460783137794210L;
        ig.evyy[147] = 3920715493684573949L;
        ig.evyy[148] = -955666105209027547L;
        ig.evyy[149] = 8742221608443454866L;
        ig.evyy[150] = -8672083150772628333L;
        ig.evyy[151] = 1638623948051782225L;
        ig.evyy[152] = 9081673804251872352L;
        ig.evyy[153] = -3766502358334343109L;
        ig.evyy[154] = -6139253656218409198L;
        ig.evyy[155] = -3878984689340661738L;
        ig.evyy[156] = -4112027319767633112L;
        ig.evyy[157] = -1967231009328897618L;
        ig.evyy[158] = -5084303416339163561L;
        ig.evyy[159] = 1494712949844269946L;
        ig.evyy[160] = -1431084274470050084L;
        ig.evyy[161] = 7223379199301105186L;
        ig.evyy[162] = 1791784452595153620L;
        ig.evyy[163] = 3559550840613600377L;
        ig.evyy[164] = -6533308039141798241L;
        ig.evyy[165] = 7596906016690325885L;
        ig.evyy[166] = 1557845962654034394L;
        ig.evyy[167] = 7799778826971845591L;
        ig.evyy[168] = -8392168247615225750L;
        ig.evyy[169] = 992892773665558595L;
        ig.evyy[170] = 6945174853092359638L;
        ig.evyy[171] = -3199693218523138171L;
        ig.evyy[172] = 8205426379576694848L;
        ig.evyy[173] = -1426127145435358173L;
        ig.evyy[174] = -8343943453180785700L;
        ig.evyy[175] = 5536161687814223668L;
        ig.evyy[176] = 3766252360986825218L;
        ig.evyy[177] = 1202398666267428416L;
        ig.evyy[178] = -7918430143512347371L;
        ig.evyy[179] = 3641898595709542975L;
        ig.evyy[180] = 2090601503377718294L;
        ig.evyy[181] = 4006918981984114967L;
        ig.evyy[182] = 3173536197470525442L;
        ig.evyy[183] = 5742193289193167888L;
        ig.evyy[184] = 6461124956449567533L;
        ig.evyy[185] = 6576026341239606554L;
        ig.evyy[186] = 8468437127008000171L;
        ig.evyy[187] = 6547719951935541810L;
        ig.evyy[188] = -3091156337434922859L;
        ig.evyy[189] = -7560700391396098514L;
        ig.evyy[190] = 1888738221247321684L;
        ig.evyy[191] = -6243451319122895408L;
        ig.evyy[192] = -6071250397405749138L;
        ig.evyy[193] = 4206489505517493353L;
        ig.evyy[194] = -3777405044427113746L;
        ig.evyy[195] = 1854553410611856345L;
        ig.evyy[196] = 8386829639139814368L;
        ig.evyy[197] = -8812558883527177559L;
        ig.evyy[198] = 2128523121811611868L;
        ig.evyy[199] = 7698061093941104480L;
    }

    private static /* synthetic */ void ezcb() {
        ig.evzf[500] = -432003989;
        ig.evzf[501] = 1070975397;
        ig.evzf[502] = 1354502784;
        ig.evzf[503] = -385225545;
        ig.evzf[504] = 272411988;
        ig.evzf[505] = -972513707;
        ig.evzf[506] = -563348557;
        ig.evzf[507] = -2143711573;
        ig.evzf[508] = 536918068;
        ig.evzf[509] = -738241325;
        ig.evzf[510] = -1432186472;
        ig.evzf[511] = -1979622782;
        ig.evzf[512] = -14049237;
        ig.evzf[513] = 1259009747;
        ig.evzf[514] = 106711350;
        ig.evzf[515] = 1182012392;
        ig.evzf[516] = 582255735;
        ig.evzf[517] = -206781865;
        ig.evzf[518] = -1871076671;
        ig.evzf[519] = -807706215;
        ig.evzf[520] = -622884492;
        ig.evzf[521] = 1474074618;
        ig.evzf[522] = -560025338;
        ig.evzf[523] = -1889098187;
        ig.evzf[524] = 1684574601;
        ig.evzf[525] = 1677033234;
        ig.evzf[526] = -1066395159;
        ig.evzf[527] = 579424444;
        ig.evzf[528] = 1584030295;
        ig.evzf[529] = -998153463;
        ig.evzf[530] = 1408034671;
        ig.evzf[531] = -807555705;
        ig.evzf[532] = -1736539884;
        ig.evzf[533] = -1677690906;
        ig.evzf[534] = 336385974;
        ig.evzf[535] = -2098002943;
        ig.evzf[536] = 696537329;
        ig.evzf[537] = -2063140680;
        ig.evzf[538] = -687114136;
        ig.evzf[539] = -43039189;
        ig.evzf[540] = 1459398696;
        ig.evzf[541] = 260179549;
        ig.evzf[542] = -1638564720;
        ig.evzf[543] = 712998350;
        ig.evzf[544] = 104870633;
        ig.evzf[545] = 999123562;
        ig.evzf[546] = 1966654177;
        ig.evzf[547] = -1281337422;
        ig.evzf[548] = -1905772114;
        ig.evzf[549] = -1969471163;
        ig.evzf[550] = 1753922709;
        ig.evzf[551] = -1837470022;
        ig.evzf[552] = -1624860340;
        ig.evzf[553] = 2069025509;
        ig.evzf[554] = 1686122340;
        ig.evzf[555] = -383500353;
        ig.evzf[556] = 927139474;
        ig.evzf[557] = 898636046;
        ig.evzf[558] = 1781301238;
        ig.evzf[559] = -1470696426;
        ig.evzf[560] = 1379987335;
        ig.evzf[561] = 411776210;
        ig.evzf[562] = 1305011519;
        ig.evzf[563] = -1912514269;
        ig.evzf[564] = -1506714566;
        ig.evzf[565] = -1828108064;
        ig.evzf[566] = -1314039742;
        ig.evzf[567] = -1756444488;
        ig.evzf[568] = 1575709586;
        ig.evzf[569] = 1987974789;
        ig.evzf[570] = 1503696101;
        ig.evzf[571] = 438448976;
        ig.evzf[572] = 366277913;
        ig.evzf[573] = 2126189899;
        ig.evzf[574] = 1670251697;
        ig.evzf[575] = 2147366533;
        ig.evzf[576] = 662311443;
        ig.evzf[577] = 58640496;
        ig.evzf[578] = 573332026;
        ig.evzf[579] = -1509207497;
        ig.evzf[580] = -2063644899;
        ig.evzf[581] = -1172745828;
        ig.evzf[582] = 1638331477;
        ig.evzf[583] = -761123205;
        ig.evzf[584] = -196560191;
        ig.evzf[585] = 1214184250;
        ig.evzf[586] = -73524065;
        ig.evzf[587] = 1872351004;
        ig.evzf[588] = 1258044568;
        ig.evzf[589] = 845257019;
        ig.evzf[590] = 1391364747;
        ig.evzf[591] = 918234205;
        ig.evzf[592] = -76115098;
        ig.evzf[593] = -187729956;
        ig.evzf[594] = -578229969;
        ig.evzf[595] = 314514152;
        ig.evzf[596] = -1630053615;
        ig.evzf[597] = -1146421576;
        ig.evzf[598] = -1664353040;
        ig.evzf[599] = -1634578261;
    }

    private static /* synthetic */ void ezpx() {
        ig.evyx[200] = 6674337234794169804L;
        ig.evyx[201] = 5073436342368985488L;
        ig.evyx[202] = 4500651125568095717L;
        ig.evyx[203] = 5341568329849156003L;
        ig.evyx[204] = -1660200958436324223L;
        ig.evyx[205] = 6077628695165645638L;
        ig.evyx[206] = -940031359666526989L;
        ig.evyx[207] = 7557817615060462977L;
        ig.evyx[208] = -8049399065896474108L;
        ig.evyx[209] = -7053209082764742939L;
        ig.evyx[210] = 8481597560815118520L;
        ig.evyx[211] = -151844702750437128L;
        ig.evyx[212] = -8377356593260791546L;
        ig.evyx[213] = 7340484574327425712L;
        ig.evyx[214] = 4993213612042234086L;
        ig.evyx[215] = 8663830398414378926L;
        ig.evyx[216] = 6256519261049564317L;
        ig.evyx[217] = 253842574043404655L;
        ig.evyx[218] = -1533830082826015707L;
        ig.evyx[219] = -5734303015396951004L;
        ig.evyx[220] = 4263155939083339255L;
        ig.evyx[221] = 1116143312189382675L;
        ig.evyx[222] = 7801062912718363262L;
        ig.evyx[223] = -7077785599032588030L;
        ig.evyx[224] = 5824529259034388790L;
        ig.evyx[225] = -6057743149918977992L;
        ig.evyx[226] = 9042641471888014461L;
        ig.evyx[227] = -4151748435610858031L;
        ig.evyx[228] = 487682884496671292L;
        ig.evyx[229] = 8210793762497804037L;
        ig.evyx[230] = 5007156052500660869L;
        ig.evyx[231] = 6013975821501673714L;
        ig.evyx[232] = -6247244835839889785L;
        ig.evyx[233] = -636040610057142245L;
        ig.evyx[234] = 5714960452762862227L;
        ig.evyx[235] = -2452809795433337110L;
        ig.evyx[236] = 637674316533446854L;
        ig.evyx[237] = 7671754861529821335L;
        ig.evyx[238] = 4278212205104161337L;
        ig.evyx[239] = 3431128331025594567L;
        ig.evyx[240] = 6786252864391934522L;
        ig.evyx[241] = -529273014321695557L;
        ig.evyx[242] = -1714009221746146442L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float[] deflectStep(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("eyai", evyw(int ), (int)82)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ig.evza("eyaj", evzk(int ), (int)834)) break;
            v0 /* !! */  = (long)ig.evza("eyak", evzk(int ), (int)835);
        }
        var15_7 = ig.c;
        v1 /* !! */  = ig.lj;
        if (true) ** GOTO lbl11
        block28: while (true) {
            v1 /* !! */  = (long)(v2 - ig.evza("eyal", evyw(int ), (int)83));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -869293746: {
                    break block28;
                }
                case 1219964681: {
                    v2 = ig.evza("eyam", evyw(int ), (int)84);
                    continue block28;
                }
                case 1730819911: {
                    v2 = ig.evza("eyan", evyw(int ), (int)85);
                    continue block28;
                }
            }
            break;
        }
        var14_8 /* !! */  = ig.b;
        v3 /* !! */  = ig.lj;
        if (true) ** GOTO lbl25
        block29: while (true) {
            v3 /* !! */  = (long)(ig.evza("eyap", evyw(int ), (int)87) - ig.evza("eyao", evyw(int ), (int)86));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -869293746: {
                    break block29;
                }
                case -758142244: {
                    continue block29;
                }
            }
            break;
        }
        var13_9 = ig.a;
        if (var15_7) {
            throw null;
lbl33:
            // 8 sources

            return null;
        }
        if (var13_9 || var13_9) ** GOTO lbl33
        var7_10 = var1_1 / (var3_3 + ig.evza("eyaq", evzd(int ), (int)836));
        if (var13_9 || var13_9) ** GOTO lbl33
        var8_11 = var2_2 / (var3_3 + ig.evza("eyar", evzd(int ), (int)837));
        if (var13_9 || var13_9) ** GOTO lbl33
        v4 = var5_5;
        v5 = var6_6;
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("eyas", evyw(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ig.evza("eyat", evzk(int ), (int)838)) break;
            v6 /* !! */  = (long)ig.evza("eyau", evzk(int ), (int)839);
        }
        var9_12 = (float)Math.hypot(v4, v5);
        if (var13_9 || var13_9) ** GOTO lbl33
        v7 = ig.evza("eyav", evzd(int ), (int)840);
        v8 = ig.evza("eyaw", evzd(int ), (int)841);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("eyax", evyw(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ig.evza("eyay", evzk(int ), (int)842)) break;
            v9 /* !! */  = (long)ig.evza("eyaz", evzk(int ), (int)843);
        }
        v10 = this.lerp((float)v7, (float)v8);
        v11 = (var4_4 - ig.evza("eyba", evzd(int ), (int)844)) / ig.evza("eybb", evzd(int ), (int)845);
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = ig.lj - ig.evza("eybc", evyw(int ), (int)90)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ig.evza("eybd", evzk(int ), (int)846)) break;
            v12 /* !! */  = (long)ig.evza("eybe", evzk(int ), (int)847);
        }
        var10_13 = v10 * class_3532.method_15363((float)v11, (float)0.0f, (float)1.0f);
        if (var13_9 || var13_9) ** GOTO lbl33
        v13 = ig.evza("eybf", evzd(int ), (int)848);
        v14 = ig.evza("eybg", evzd(int ), (int)849);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = ig.lj - ig.evza("eybh", evyw(int ), (int)91)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == ig.evza("eybi", evzk(int ), (int)850)) break;
            v15 /* !! */  = (long)ig.evza("eybj", evzk(int ), (int)851);
        }
        var11_14 = var5_5 - var7_10 * var9_12 * var10_13 - var8_11 * this.lerp((float)v13, (float)v14);
        if (var13_9 || var13_9) ** GOTO lbl33
        v16 = ig.evza("eybk", evzd(int ), (int)852);
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_5 = ig.lj - ig.evza("eybl", evyw(int ), (int)92)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == ig.evza("eybm", evzk(int ), (int)853)) break;
            v17 /* !! */  = (long)ig.evza("eybn", evzk(int ), (int)854);
        }
        var12_15 = var6_6 - var8_11 * var9_12 * var10_13 + var7_10 * this.lerp((float)v16, 1.0f) * ig.evza("eybo", evzd(int ), (int)855);
        if (var13_9) ** GOTO lbl33
        if (var14_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var13_9) ** break;
                ** continue;
                return new float[]{var11_14, var12_15};
            }
            case 0: {
                var14_8 /* !! */  = (int)ig.evza("eybp", evzk(int ), (int)856);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 1: {
                do {
                    var14_8 /* !! */  = (int)ig.evza("eybq", evzk(int ), (int)857);
                } while (!var15_7);
                throw null;
            }
            case 2: {
                var14_8 /* !! */  = (int)ig.evza("eybr", evzk(int ), (int)858);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl103:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var14_8 /* !! */  = (int)ig.evza("eybs", evzk(int ), (int)859);
                    if (!var15_7) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                var14_8 /* !! */  = (int)ig.evza("eybt", evzk(int ), (int)860);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl113:
            // 2 sources

            case 5: {
                var14_8 /* !! */  = (int)ig.evza("eybu", evzk(int ), (int)861);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl118:
            // 2 sources

            case 6: {
                var14_8 /* !! */  = (int)ig.evza("eybv", evzk(int ), (int)862);
                if (!var15_7) ** GOTO lbl103
                throw null;
            }
            case 7: {
                var14_8 /* !! */  = (int)ig.evza("eybw", evzk(int ), (int)863);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl127:
            // 3 sources

            case 8: {
                var14_8 /* !! */  = (int)ig.evza("eybx", evzk(int ), (int)864);
                if (!var15_7) ** GOTO lbl103
                throw null;
            }
lbl131:
            // 2 sources

            case 9: {
                var14_8 /* !! */  = (int)ig.evza("eyby", evzk(int ), (int)865);
                if (!var15_7) ** GOTO lbl113
                throw null;
            }
            case 10: {
                var14_8 /* !! */  = (int)ig.evza("eybz", evzk(int ), (int)866);
                if (!var15_7) ** GOTO lbl127
                throw null;
            }
lbl139:
            // 2 sources

            case 11: {
                var14_8 /* !! */  = (int)ig.evza("eyca", evzk(int ), (int)867);
                if (var15_7) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 12: {
                var14_8 /* !! */  = (int)ig.evza("eycb", evzk(int ), (int)868);
                if (!var15_7) ** GOTO lbl131
                throw null;
            }
            case 13: {
                var14_8 /* !! */  = (int)ig.evza("eycc", evzk(int ), (int)869);
                if (!var15_7) break;
                throw null;
            }
lbl152:
            // 5 sources

            case 14: {
                var14_8 /* !! */  = (int)ig.evza("eycd", evzk(int ), (int)870);
                if (!var15_7) ** GOTO lbl127
                throw null;
            }
            case 15: 
        }
        var14_8 /* !! */  = (int)ig.evza("eyce", evzk(int ), (int)871);
        ** while (!var15_7)
lbl159:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ezkn() {
        ig.evzg[600] = -310401435;
        ig.evzg[601] = 1563693951;
        ig.evzg[602] = -2018684393;
        ig.evzg[603] = -1641353459;
        ig.evzg[604] = -1877440837;
        ig.evzg[605] = 686790407;
        ig.evzg[606] = 22039125;
        ig.evzg[607] = -136074149;
        ig.evzg[608] = -1217469625;
        ig.evzg[609] = 652897808;
        ig.evzg[610] = 225920347;
        ig.evzg[611] = -1750116157;
        ig.evzg[612] = -688590418;
        ig.evzg[613] = 167027476;
        ig.evzg[614] = -2043003941;
        ig.evzg[615] = -987992156;
        ig.evzg[616] = 124396507;
        ig.evzg[617] = 675160455;
        ig.evzg[618] = 1639027567;
        ig.evzg[619] = 1148096088;
        ig.evzg[620] = 1370726163;
        ig.evzg[621] = -219324068;
        ig.evzg[622] = -1863991862;
        ig.evzg[623] = 1738405199;
        ig.evzg[624] = -1092841402;
        ig.evzg[625] = -1485388083;
        ig.evzg[626] = 1119688496;
        ig.evzg[627] = -294946948;
        ig.evzg[628] = 299299238;
        ig.evzg[629] = 346274396;
        ig.evzg[630] = -1018906585;
        ig.evzg[631] = -289834001;
        ig.evzg[632] = 1745524093;
        ig.evzg[633] = 1319419156;
        ig.evzg[634] = 206057070;
        ig.evzg[635] = -834603582;
        ig.evzg[636] = 1615432251;
        ig.evzg[637] = 1903820052;
        ig.evzg[638] = -487108306;
        ig.evzg[639] = -1765575111;
        ig.evzg[640] = -509727794;
        ig.evzg[641] = 1001533005;
        ig.evzg[642] = -23550865;
        ig.evzg[643] = -62276316;
        ig.evzg[644] = -841451978;
        ig.evzg[645] = -2059949174;
        ig.evzg[646] = -784728115;
        ig.evzg[647] = 1276144520;
        ig.evzg[648] = 1275424088;
        ig.evzg[649] = -891280464;
        ig.evzg[650] = -1137152917;
        ig.evzg[651] = 280673406;
        ig.evzg[652] = 1851043345;
        ig.evzg[653] = 670259015;
        ig.evzg[654] = -1970049498;
        ig.evzg[655] = -1887606694;
        ig.evzg[656] = -1566737266;
        ig.evzg[657] = -685659592;
        ig.evzg[658] = 965684237;
        ig.evzg[659] = -932047346;
        ig.evzg[660] = 234218458;
        ig.evzg[661] = 1823182296;
        ig.evzg[662] = 1483484177;
        ig.evzg[663] = 1818623696;
        ig.evzg[664] = -270288201;
        ig.evzg[665] = 1745291044;
        ig.evzg[666] = -2127391240;
        ig.evzg[667] = 981247995;
        ig.evzg[668] = -908549710;
        ig.evzg[669] = -60762802;
        ig.evzg[670] = -1174785641;
        ig.evzg[671] = -1976969422;
        ig.evzg[672] = -114864527;
        ig.evzg[673] = 1227553912;
        ig.evzg[674] = 2130154560;
        ig.evzg[675] = -392944437;
        ig.evzg[676] = -172902321;
        ig.evzg[677] = -155010882;
        ig.evzg[678] = 220868984;
        ig.evzg[679] = -979120023;
        ig.evzg[680] = -1821050326;
        ig.evzg[681] = -749462150;
        ig.evzg[682] = 2064532205;
        ig.evzg[683] = 991411178;
        ig.evzg[684] = -1575944837;
        ig.evzg[685] = -1312693054;
        ig.evzg[686] = -1418675290;
        ig.evzg[687] = 691318916;
        ig.evzg[688] = -1867038042;
        ig.evzg[689] = 1136407349;
        ig.evzg[690] = 229816956;
        ig.evzg[691] = -952020438;
        ig.evzg[692] = 1741511314;
        ig.evzg[693] = -912698377;
        ig.evzg[694] = 28127176;
        ig.evzg[695] = -1941740236;
        ig.evzg[696] = 1497687420;
        ig.evzg[697] = 1513074937;
        ig.evzg[698] = 456960605;
        ig.evzg[699] = 345590334;
    }

    public static /* synthetic */ CallSite evza(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static float clampOvershoot(float var0, float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("eygm", evyw(int ), (int)134)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ig.evza("eygn", evzk(int ), (int)942)) break;
            v0 /* !! */  = (long)ig.evza("eygo", evzk(int ), (int)943);
        }
        var6_3 = ig.c;
        v1 /* !! */  = ig.lj;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - ig.evza("eygp", evyw(int ), (int)135));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2022082569: {
                    v2 = ig.evza("eygq", evyw(int ), (int)136);
                    continue block22;
                }
                case -869293746: {
                    break block22;
                }
                case -625463798: {
                    v2 = ig.evza("eygr", evyw(int ), (int)137);
                    continue block22;
                }
            }
            break;
        }
        var5_4 /* !! */  = ig.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("eygs", evyw(int ), (int)138)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ig.evza("eygt", evzk(int ), (int)944)) break;
            v3 /* !! */  = (long)ig.evza("eygu", evzk(int ), (int)945);
        }
        var4_5 = ig.a;
        if (var6_3) {
            throw null;
lbl31:
            // 3 sources

            return (float)ig.evza("eygv", evzd(int ), (int)946);
        }
        if (var4_5 || var4_5) ** GOTO lbl31
        v4 /* !! */  = ig.lj;
        if (true) ** GOTO lbl38
        block25: while (true) {
            v4 /* !! */  = (long)(ig.evza("eygx", evyw(int ), (int)140) - ig.evza("eygw", evyw(int ), (int)139));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1757022976: {
                    continue block25;
                }
                case -869293746: {
                    break block25;
                }
            }
            break;
        }
        var3_6 = Math.abs(var1_1);
        if (var4_5) ** GOTO lbl31
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_5) ** break;
                ** continue;
                v5 = -var3_6 * var2_2;
                v6 /* !! */  = ig.lj;
                if (true) ** GOTO lbl55
                block26: while (true) {
                    v6 /* !! */  = (long)(ig.evza("eygz", evyw(int ), (int)142) - ig.evza("eygy", evyw(int ), (int)141));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -869293746: {
                            break block26;
                        }
                        case 1507763921: {
                            continue block26;
                        }
                    }
                    break;
                }
                return class_3532.method_15363((float)var0, (float)v5, (float)(var3_6 * var2_2));
            }
            case 0: {
                var5_4 /* !! */  = (int)ig.evza("eyha", evzk(int ), (int)947);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl71
            }
lbl66:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)ig.evza("eyhb", evzk(int ), (int)948);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl76
            }
lbl71:
            // 3 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ig.evza("eyhc", evzk(int ), (int)949);
                    if (!var6_3) ** GOTO lbl66
                    throw null;
                }
            }
lbl76:
            // 3 sources

            case 3: {
                var5_4 /* !! */  = (int)ig.evza("eyhd", evzk(int ), (int)950);
                if (!var6_3) ** GOTO lbl71
                throw null;
            }
            case 4: {
                var5_4 /* !! */  = (int)ig.evza("eyhe", evzk(int ), (int)951);
                if (!var6_3) ** GOTO lbl76
                throw null;
            }
            case 5: 
        }
        var5_4 /* !! */  = (int)ig.evza("eyhf", evzk(int ), (int)952);
        ** while (!var6_3)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ezoq() {
        ig.evyx[0] = -8550378181685596401L;
        ig.evyx[1] = -1827432859002011099L;
        ig.evyx[2] = -4571299501272799506L;
        ig.evyx[3] = 6921651879512349174L;
        ig.evyx[4] = -7933363633509438102L;
        ig.evyx[5] = -970805824391454201L;
        ig.evyx[6] = 3981389472222828710L;
        ig.evyx[7] = 5282173768250037555L;
        ig.evyx[8] = 5427437292412177897L;
        ig.evyx[9] = -113951081373817314L;
        ig.evyx[10] = 2907843461355158569L;
        ig.evyx[11] = -696689598203506784L;
        ig.evyx[12] = -8593452388516593747L;
        ig.evyx[13] = 4113818122822393025L;
        ig.evyx[14] = -4307328129354387705L;
        ig.evyx[15] = 2640042248072951290L;
        ig.evyx[16] = -5806683839697646948L;
        ig.evyx[17] = -3753681824624763659L;
        ig.evyx[18] = -2398198298196456989L;
        ig.evyx[19] = 8170845336851926258L;
        ig.evyx[20] = 9226077551964455L;
        ig.evyx[21] = 3398330719190429492L;
        ig.evyx[22] = -1284273961359680760L;
        ig.evyx[23] = -5581124317039570082L;
        ig.evyx[24] = -8709928445912520186L;
        ig.evyx[25] = 7932860905220728839L;
        ig.evyx[26] = -8073173265181925927L;
        ig.evyx[27] = -7301480059864301062L;
        ig.evyx[28] = 1930559426097422230L;
        ig.evyx[29] = 2591401956453372919L;
        ig.evyx[30] = -640296526932644238L;
        ig.evyx[31] = 2853488480355000116L;
        ig.evyx[32] = -9109771301482206522L;
        ig.evyx[33] = -2834741101824022356L;
        ig.evyx[34] = 7246654049457615230L;
        ig.evyx[35] = -5653496419978443806L;
        ig.evyx[36] = -5358345181043316550L;
        ig.evyx[37] = -6829772807763821752L;
        ig.evyx[38] = 1729937567988369901L;
        ig.evyx[39] = -9087877550627090187L;
        ig.evyx[40] = 6178121379636135096L;
        ig.evyx[41] = 7610241779834888329L;
        ig.evyx[42] = 5998238249756134474L;
        ig.evyx[43] = -7288455513237990112L;
        ig.evyx[44] = -3228409564672643464L;
        ig.evyx[45] = -5369116024375425473L;
        ig.evyx[46] = 6972844015160325372L;
        ig.evyx[47] = 1216015068010103278L;
        ig.evyx[48] = -470363911457994881L;
        ig.evyx[49] = 433517013684066765L;
        ig.evyx[50] = 2875890104527181451L;
        ig.evyx[51] = -2422851275222720336L;
        ig.evyx[52] = -1657908426652017277L;
        ig.evyx[53] = 8082585599082052235L;
        ig.evyx[54] = -7974868380167628579L;
        ig.evyx[55] = 6791533444976670587L;
        ig.evyx[56] = -5632130788402614L;
        ig.evyx[57] = 6334510818042566598L;
        ig.evyx[58] = 872176812901288587L;
        ig.evyx[59] = 3191881253709906460L;
        ig.evyx[60] = 4074501249344103239L;
        ig.evyx[61] = -8140481987905112153L;
        ig.evyx[62] = -4676170032273559578L;
        ig.evyx[63] = 2871766849580089498L;
        ig.evyx[64] = -5906352296964931989L;
        ig.evyx[65] = -2102691103095133465L;
        ig.evyx[66] = -5980664191898251591L;
        ig.evyx[67] = -5461921581189485095L;
        ig.evyx[68] = -6441733301197102951L;
        ig.evyx[69] = 2049366774357104326L;
        ig.evyx[70] = -4681198441620129648L;
        ig.evyx[71] = -1855841410649275442L;
        ig.evyx[72] = -4737116979161606760L;
        ig.evyx[73] = 848594482984851597L;
        ig.evyx[74] = 1731635071900976600L;
        ig.evyx[75] = 6288807474775629195L;
        ig.evyx[76] = 5001650876075091881L;
        ig.evyx[77] = 7113321994076895950L;
        ig.evyx[78] = -4500268450555425719L;
        ig.evyx[79] = 4627569958675920815L;
        ig.evyx[80] = 924673855548028520L;
        ig.evyx[81] = -5976905549484383534L;
        ig.evyx[82] = -7102970783729887942L;
        ig.evyx[83] = 1112242960985767692L;
        ig.evyx[84] = 1031169356783114593L;
        ig.evyx[85] = 4049614965244706553L;
        ig.evyx[86] = -1868883912941274044L;
        ig.evyx[87] = -7680060480212843401L;
        ig.evyx[88] = 7037745638083765257L;
        ig.evyx[89] = 5225447053688914010L;
        ig.evyx[90] = -361178427638230202L;
        ig.evyx[91] = -2727141914503411130L;
        ig.evyx[92] = 6663234733146118047L;
        ig.evyx[93] = 4420707826090525296L;
        ig.evyx[94] = -4766783050146035829L;
        ig.evyx[95] = -8631110322220674665L;
        ig.evyx[96] = 1041584494876398569L;
        ig.evyx[97] = 7428121168042696348L;
        ig.evyx[98] = 5700827330623701696L;
        ig.evyx[99] = 4048895084421995950L;
    }

    private static /* synthetic */ void ezhf() {
        ig.evzg[200] = 1880801381;
        ig.evzg[201] = -1199942567;
        ig.evzg[202] = 31454716;
        ig.evzg[203] = -1894916410;
        ig.evzg[204] = 1339196663;
        ig.evzg[205] = -1066428789;
        ig.evzg[206] = -2098787394;
        ig.evzg[207] = -1502863160;
        ig.evzg[208] = -1976876333;
        ig.evzg[209] = 1622767445;
        ig.evzg[210] = 1046817746;
        ig.evzg[211] = -1742606631;
        ig.evzg[212] = 457125911;
        ig.evzg[213] = -2021476467;
        ig.evzg[214] = 1434406750;
        ig.evzg[215] = -1095612591;
        ig.evzg[216] = -918066214;
        ig.evzg[217] = -1493000202;
        ig.evzg[218] = -770076515;
        ig.evzg[219] = 816521968;
        ig.evzg[220] = 165974075;
        ig.evzg[221] = -1961808955;
        ig.evzg[222] = 1590680854;
        ig.evzg[223] = -443282178;
        ig.evzg[224] = -1852452426;
        ig.evzg[225] = 779409248;
        ig.evzg[226] = -1786046703;
        ig.evzg[227] = -1771333197;
        ig.evzg[228] = 2108833721;
        ig.evzg[229] = 1786255208;
        ig.evzg[230] = 985815622;
        ig.evzg[231] = 169565913;
        ig.evzg[232] = -2107835785;
        ig.evzg[233] = 1739635705;
        ig.evzg[234] = -532719657;
        ig.evzg[235] = 715149999;
        ig.evzg[236] = 1680241147;
        ig.evzg[237] = -993803216;
        ig.evzg[238] = -868745856;
        ig.evzg[239] = -1289767664;
        ig.evzg[240] = 93979263;
        ig.evzg[241] = -1953208851;
        ig.evzg[242] = -1073816563;
        ig.evzg[243] = 1342105300;
        ig.evzg[244] = -988249603;
        ig.evzg[245] = 1593134553;
        ig.evzg[246] = 665780491;
        ig.evzg[247] = 446092150;
        ig.evzg[248] = -195718394;
        ig.evzg[249] = 652172202;
        ig.evzg[250] = 558839746;
        ig.evzg[251] = -931016457;
        ig.evzg[252] = 299290835;
        ig.evzg[253] = -945725787;
        ig.evzg[254] = -1590434462;
        ig.evzg[255] = 755833345;
        ig.evzg[256] = -1422841703;
        ig.evzg[257] = -978282908;
        ig.evzg[258] = 841348219;
        ig.evzg[259] = -1471855026;
        ig.evzg[260] = -1917717471;
        ig.evzg[261] = -1007027239;
        ig.evzg[262] = -1924627534;
        ig.evzg[263] = 1420256586;
        ig.evzg[264] = 535210391;
        ig.evzg[265] = 2047907474;
        ig.evzg[266] = -1625404495;
        ig.evzg[267] = -1728667913;
        ig.evzg[268] = 1917793441;
        ig.evzg[269] = -2104139202;
        ig.evzg[270] = -810880929;
        ig.evzg[271] = -1051689200;
        ig.evzg[272] = 632573107;
        ig.evzg[273] = 1828292719;
        ig.evzg[274] = 1253814609;
        ig.evzg[275] = 1469599345;
        ig.evzg[276] = -1554228063;
        ig.evzg[277] = 142865057;
        ig.evzg[278] = 103165311;
        ig.evzg[279] = -1309401419;
        ig.evzg[280] = 334417781;
        ig.evzg[281] = 1703901306;
        ig.evzg[282] = -981258694;
        ig.evzg[283] = 211577888;
        ig.evzg[284] = -562112894;
        ig.evzg[285] = -1920520621;
        ig.evzg[286] = -120148643;
        ig.evzg[287] = 485063103;
        ig.evzg[288] = 1865678009;
        ig.evzg[289] = 914003958;
        ig.evzg[290] = 485853890;
        ig.evzg[291] = 1553451981;
        ig.evzg[292] = 1436031802;
        ig.evzg[293] = -2072263767;
        ig.evzg[294] = -57891592;
        ig.evzg[295] = -135306152;
        ig.evzg[296] = 183993134;
        ig.evzg[297] = 1301647723;
        ig.evzg[298] = -1900787406;
        ig.evzg[299] = -703617500;
    }

    private static /* synthetic */ void ezlm() {
        ig.evzg[700] = 1450453768;
        ig.evzg[701] = -752841859;
        ig.evzg[702] = 629702584;
        ig.evzg[703] = -1655385009;
        ig.evzg[704] = -749232231;
        ig.evzg[705] = -1695074087;
        ig.evzg[706] = -677919882;
        ig.evzg[707] = 1961549117;
        ig.evzg[708] = 81128161;
        ig.evzg[709] = -1434916998;
        ig.evzg[710] = -1913011707;
        ig.evzg[711] = -1675805616;
        ig.evzg[712] = 790971323;
        ig.evzg[713] = 2109550635;
        ig.evzg[714] = -412159330;
        ig.evzg[715] = -398785754;
        ig.evzg[716] = -871746249;
        ig.evzg[717] = -932710505;
        ig.evzg[718] = -539323278;
        ig.evzg[719] = -1825757995;
        ig.evzg[720] = -1953160970;
        ig.evzg[721] = 115434508;
        ig.evzg[722] = 1955883811;
        ig.evzg[723] = -192681130;
        ig.evzg[724] = 646255288;
        ig.evzg[725] = 1089530753;
        ig.evzg[726] = 850742901;
        ig.evzg[727] = 1931206432;
        ig.evzg[728] = 751548723;
        ig.evzg[729] = -991117862;
        ig.evzg[730] = 1919975749;
        ig.evzg[731] = -818477805;
        ig.evzg[732] = 102209574;
        ig.evzg[733] = 234819433;
        ig.evzg[734] = -852032583;
        ig.evzg[735] = 189896343;
        ig.evzg[736] = 721864620;
        ig.evzg[737] = -266926152;
        ig.evzg[738] = 1585534136;
        ig.evzg[739] = 885495813;
        ig.evzg[740] = -1258957611;
        ig.evzg[741] = 288577669;
        ig.evzg[742] = 468670108;
        ig.evzg[743] = 2127753541;
        ig.evzg[744] = 360945522;
        ig.evzg[745] = 1980809485;
        ig.evzg[746] = -2143991002;
        ig.evzg[747] = -792728393;
        ig.evzg[748] = 2132545839;
        ig.evzg[749] = -936967795;
        ig.evzg[750] = -1874322766;
        ig.evzg[751] = 2108702806;
        ig.evzg[752] = 40479207;
        ig.evzg[753] = 277021445;
        ig.evzg[754] = 0xAAA5AAB;
        ig.evzg[755] = 656606491;
        ig.evzg[756] = -223519437;
        ig.evzg[757] = 112539454;
        ig.evzg[758] = 685688640;
        ig.evzg[759] = 1039810719;
        ig.evzg[760] = -369906364;
        ig.evzg[761] = 553088270;
        ig.evzg[762] = -1977867177;
        ig.evzg[763] = -2044926717;
        ig.evzg[764] = -14323982;
        ig.evzg[765] = 723375323;
        ig.evzg[766] = -1616266814;
        ig.evzg[767] = -379688173;
        ig.evzg[768] = -128924908;
        ig.evzg[769] = -249933475;
        ig.evzg[770] = -1240801616;
        ig.evzg[771] = -1522308439;
        ig.evzg[772] = -1669869294;
        ig.evzg[773] = 672346279;
        ig.evzg[774] = -1651292059;
        ig.evzg[775] = -154348209;
        ig.evzg[776] = -1225255241;
        ig.evzg[777] = 579369319;
        ig.evzg[778] = 409276461;
        ig.evzg[779] = 1038726952;
        ig.evzg[780] = -327786165;
        ig.evzg[781] = 1896151148;
        ig.evzg[782] = -562781043;
        ig.evzg[783] = -1312185841;
        ig.evzg[784] = -1956068384;
        ig.evzg[785] = -1919182232;
        ig.evzg[786] = -113370692;
        ig.evzg[787] = 373827328;
        ig.evzg[788] = -99016980;
        ig.evzg[789] = 1295654391;
        ig.evzg[790] = -476410543;
        ig.evzg[791] = 55312822;
        ig.evzg[792] = 244321560;
        ig.evzg[793] = -1964613153;
        ig.evzg[794] = -1512337091;
        ig.evzg[795] = -1350903146;
        ig.evzg[796] = 1400981846;
        ig.evzg[797] = 1452004249;
        ig.evzg[798] = -1371680262;
        ig.evzg[799] = 1783415499;
    }

    private static /* synthetic */ void ezbk() {
        ig.evzf[400] = -1913365926;
        ig.evzf[401] = -1223380010;
        ig.evzf[402] = -277503593;
        ig.evzf[403] = -575042638;
        ig.evzf[404] = -1803535249;
        ig.evzf[405] = -1719424499;
        ig.evzf[406] = 963266219;
        ig.evzf[407] = 2142080993;
        ig.evzf[408] = -1743948408;
        ig.evzf[409] = -1353718736;
        ig.evzf[410] = 2008633031;
        ig.evzf[411] = -1720249702;
        ig.evzf[412] = -337812939;
        ig.evzf[413] = 1401287842;
        ig.evzf[414] = -838981146;
        ig.evzf[415] = -1516636937;
        ig.evzf[416] = 1858401678;
        ig.evzf[417] = -1037338176;
        ig.evzf[418] = -12137130;
        ig.evzf[419] = 1473217950;
        ig.evzf[420] = -2019551114;
        ig.evzf[421] = -352681795;
        ig.evzf[422] = 1115847671;
        ig.evzf[423] = 1329613577;
        ig.evzf[424] = 1841674852;
        ig.evzf[425] = -633236474;
        ig.evzf[426] = 1112495155;
        ig.evzf[427] = 1686302299;
        ig.evzf[428] = -1479889992;
        ig.evzf[429] = 287244552;
        ig.evzf[430] = -285933882;
        ig.evzf[431] = -874222414;
        ig.evzf[432] = -1188129395;
        ig.evzf[433] = -1531838571;
        ig.evzf[434] = -1417034173;
        ig.evzf[435] = 102497807;
        ig.evzf[436] = -1787844358;
        ig.evzf[437] = -1807423051;
        ig.evzf[438] = -316476620;
        ig.evzf[439] = 785337016;
        ig.evzf[440] = -2118728861;
        ig.evzf[441] = -1793090392;
        ig.evzf[442] = 600328852;
        ig.evzf[443] = -1217276955;
        ig.evzf[444] = -1894301182;
        ig.evzf[445] = 937534864;
        ig.evzf[446] = 1944968847;
        ig.evzf[447] = 1079295297;
        ig.evzf[448] = 326807074;
        ig.evzf[449] = 725085094;
        ig.evzf[450] = -1816740655;
        ig.evzf[451] = -1486204392;
        ig.evzf[452] = 1610741942;
        ig.evzf[453] = -491132770;
        ig.evzf[454] = -327805610;
        ig.evzf[455] = -829233340;
        ig.evzf[456] = 506135950;
        ig.evzf[457] = -1158241220;
        ig.evzf[458] = -972299833;
        ig.evzf[459] = 813633253;
        ig.evzf[460] = 44211512;
        ig.evzf[461] = 91884102;
        ig.evzf[462] = -904582828;
        ig.evzf[463] = 1703748628;
        ig.evzf[464] = 43525481;
        ig.evzf[465] = 756502871;
        ig.evzf[466] = 397899556;
        ig.evzf[467] = -406404592;
        ig.evzf[468] = -1612079565;
        ig.evzf[469] = 1414362071;
        ig.evzf[470] = -1588456547;
        ig.evzf[471] = 142903710;
        ig.evzf[472] = -1227632783;
        ig.evzf[473] = -1452864277;
        ig.evzf[474] = -891876556;
        ig.evzf[475] = 1501911152;
        ig.evzf[476] = 373008124;
        ig.evzf[477] = -297331685;
        ig.evzf[478] = -1791412321;
        ig.evzf[479] = 548402097;
        ig.evzf[480] = -10278307;
        ig.evzf[481] = -521650685;
        ig.evzf[482] = -528767220;
        ig.evzf[483] = -2021358322;
        ig.evzf[484] = -198342236;
        ig.evzf[485] = -710083260;
        ig.evzf[486] = -171820411;
        ig.evzf[487] = 2008395204;
        ig.evzf[488] = 1362829138;
        ig.evzf[489] = -1174767803;
        ig.evzf[490] = 344607125;
        ig.evzf[491] = -1011422349;
        ig.evzf[492] = 2086634796;
        ig.evzf[493] = 746122714;
        ig.evzf[494] = -718430015;
        ig.evzf[495] = -1098343559;
        ig.evzf[496] = -1384055535;
        ig.evzf[497] = 1316707672;
        ig.evzf[498] = -909918946;
        ig.evzf[499] = -1293973495;
    }

    static {
        evzf = new int[1043];
        evzg = new int[1043];
        ig.eyxg();
        ig.eyyf();
        ig.eyzj();
        ig.ezam();
        ig.ezbk();
        ig.ezcb();
        ig.ezcx();
        ig.ezdi();
        ig.ezdv();
        ig.ezek();
        ig.ezfd();
        ig.ezfn();
        ig.ezgh();
        ig.ezhf();
        ig.ezhx();
        ig.eziw();
        ig.ezjq();
        ig.ezkn();
        ig.ezlm();
        ig.ezmg();
        ig.ezne();
        ig.ezoc();
        evyx = new long[243];
        evyy = new long[243];
        ig.ezoq();
        ig.ezpe();
        ig.ezpx();
        ig.ezqe();
        ig.ezqs();
        ig.ezrc();
    }

    /*
     * Enabled aggressive block sorting
     */
    private float quantizeDelta(float f2) {
        boolean bl2 = c;
        int n2 = b;
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
        double d2 = nm.computeGcd();
        if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
        if (d2 <= ig.evza("eydw", ewsq(int ), (int)117)) {
            if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            return f2;
        }
        if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
        Object object = Math.round((double)f2 / d2);
        if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
        if (object == ig.evza("eydx", evyw(int ), (int)118)) {
            if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            if ((double)Math.abs(f2) > d2 * ig.evza("eydy", ewsq(int ), (int)119)) {
                CallSite callSite;
                if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                if (f2 > 0.0f) {
                    if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                    callSite = ig.evza("eydz", evyw(int ), (int)120);
                    if (bl2) {
                        throw null;
                    }
                } else {
                    if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                    callSite = ig.evza("eyea", evyw(int ), (int)121);
                }
                object = callSite;
                if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            }
        }
        if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
        if ((double)Math.abs(f2) > d2 * ig.evza("eyeb", ewsq(int ), (int)122)) {
            if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            if (Math.abs(object) < ig.evza("eyec", evyw(int ), (int)123)) {
                CallSite callSite;
                if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                if (f2 > 0.0f) {
                    if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                    callSite = ig.evza("eyed", evyw(int ), (int)124);
                    if (bl2) {
                        throw null;
                    }
                } else {
                    if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                    callSite = ig.evza("eyee", evyw(int ), (int)125);
                }
                object = callSite;
                if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            }
        }
        if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
        if ((double)Math.abs(f2) > d2 * ig.evza("eyef", ewsq(int ), (int)126)) {
            if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            if (Math.abs(object) < ig.evza("eyeg", evyw(int ), (int)127)) {
                CallSite callSite;
                if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                if (f2 > 0.0f) {
                    if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                    callSite = ig.evza("eyeh", evyw(int ), (int)128);
                    if (bl2) {
                        throw null;
                    }
                } else {
                    if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                    callSite = ig.evza("eyei", evyw(int ), (int)129);
                }
                object = callSite;
                if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            }
        }
        if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
        if ((double)Math.abs(f2) > d2 * ig.evza("eyej", ewsq(int ), (int)130)) {
            if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            if (Math.abs(object) < ig.evza("eyek", evyw(int ), (int)131)) {
                CallSite callSite;
                if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                if (f2 > 0.0f) {
                    if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                    callSite = ig.evza("eyel", evyw(int ), (int)132);
                    if (bl2) {
                        throw null;
                    }
                } else {
                    if (bl3 || bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
                    callSite = ig.evza("eyem", evyw(int ), (int)133);
                }
                object = callSite;
                if (bl3) return (float)ig.evza("eydv", evzd(int ), (int)890);
            }
        }
        if (!bl3 && !bl3) return (float)((double)object * d2);
        return (float)ig.evza("eydv", evzd(int ), (int)890);
    }

    private static /* synthetic */ void ezqe() {
        ig.evyy[0] = -8550378181689056420L;
        ig.evyy[1] = 4428649749135230313L;
        ig.evyy[2] = 137319984500878991L;
        ig.evyy[3] = 1446075496045118300L;
        ig.evyy[4] = -849818316945841256L;
        ig.evyy[5] = 2881798252949879896L;
        ig.evyy[6] = -26821570999928020L;
        ig.evyy[7] = -1438964446532229626L;
        ig.evyy[8] = -6959043780178743116L;
        ig.evyy[9] = -4244224501903478579L;
        ig.evyy[10] = -978050787910710934L;
        ig.evyy[11] = -2866576101244771059L;
        ig.evyy[12] = -3334938812906207080L;
        ig.evyy[13] = -525329205822011969L;
        ig.evyy[14] = -2247234128203587120L;
        ig.evyy[15] = 6931029677601925305L;
        ig.evyy[16] = -1317010424968528116L;
        ig.evyy[17] = -6535593273609633706L;
        ig.evyy[18] = -3167345741822523900L;
        ig.evyy[19] = 6534341197104665479L;
        ig.evyy[20] = -2291788670500847238L;
        ig.evyy[21] = -1131031052327180119L;
        ig.evyy[22] = -8311648747752167735L;
        ig.evyy[23] = 8859695066159143255L;
        ig.evyy[24] = 2665284856698185150L;
        ig.evyy[25] = -2055029971405174882L;
        ig.evyy[26] = -7784484153710943914L;
        ig.evyy[27] = -832184880733099544L;
        ig.evyy[28] = -9368769479702516L;
        ig.evyy[29] = 1099902366859358029L;
        ig.evyy[30] = -4997676038412980616L;
        ig.evyy[31] = -5796899328926490242L;
        ig.evyy[32] = 1936073018250186008L;
        ig.evyy[33] = 1446107406254264413L;
        ig.evyy[34] = -4742669307481823954L;
        ig.evyy[35] = 7002669202671473037L;
        ig.evyy[36] = 4252376855179241321L;
        ig.evyy[37] = 8907268350792229241L;
        ig.evyy[38] = -7977284393154363708L;
        ig.evyy[39] = 3878516040214034562L;
        ig.evyy[40] = 3962412637694419655L;
        ig.evyy[41] = 1212942584842290390L;
        ig.evyy[42] = 5728503500764419069L;
        ig.evyy[43] = 4151376091341025175L;
        ig.evyy[44] = 1344222325648953296L;
        ig.evyy[45] = -2028205070010516164L;
        ig.evyy[46] = -7001608716968239123L;
        ig.evyy[47] = -2165295014576675007L;
        ig.evyy[48] = -8640075555475212943L;
        ig.evyy[49] = 3614381508542837656L;
        ig.evyy[50] = 6054527604688470005L;
        ig.evyy[51] = 4684515991105291357L;
        ig.evyy[52] = -3106449729859837834L;
        ig.evyy[53] = 5749720992104135307L;
        ig.evyy[54] = -1096919091541826204L;
        ig.evyy[55] = -4203322507274968919L;
        ig.evyy[56] = 1205443197020838230L;
        ig.evyy[57] = -6427355223777911778L;
        ig.evyy[58] = 5817282421368938816L;
        ig.evyy[59] = 2662411451572824993L;
        ig.evyy[60] = -5310141298216761309L;
        ig.evyy[61] = 3481070909716588197L;
        ig.evyy[62] = -3620647097026838106L;
        ig.evyy[63] = 6977302489338543717L;
        ig.evyy[64] = 6806763389111881959L;
        ig.evyy[65] = -2508015069558478105L;
        ig.evyy[66] = 490738137721006073L;
        ig.evyy[67] = -3378537039410177068L;
        ig.evyy[68] = -8629131892891163763L;
        ig.evyy[69] = 2562777131877340870L;
        ig.evyy[70] = 2005453517095231940L;
        ig.evyy[71] = -5840645648127647897L;
        ig.evyy[72] = 5261366733347760084L;
        ig.evyy[73] = -2077823314360085875L;
        ig.evyy[74] = -7723490696968215358L;
        ig.evyy[75] = -1170196988480996249L;
        ig.evyy[76] = 6383785235352989039L;
        ig.evyy[77] = 7175565164133756302L;
        ig.evyy[78] = -4282238359002416693L;
        ig.evyy[79] = 9212234379339085743L;
        ig.evyy[80] = 3689884026753513064L;
        ig.evyy[81] = -7864513689124453196L;
        ig.evyy[82] = -3126488401626947162L;
        ig.evyy[83] = -3185122269673228605L;
        ig.evyy[84] = -1187189378023401054L;
        ig.evyy[85] = -3884158592780313404L;
        ig.evyy[86] = 2667258580208982020L;
        ig.evyy[87] = 8307205864658593863L;
        ig.evyy[88] = 7125412694556448076L;
        ig.evyy[89] = 938544938328087925L;
        ig.evyy[90] = -2028610385522756596L;
        ig.evyy[91] = 1031162205402353510L;
        ig.evyy[92] = 27910088912722634L;
        ig.evyy[93] = 3040586507916698534L;
        ig.evyy[94] = -2541114171049626291L;
        ig.evyy[95] = -856142714845397386L;
        ig.evyy[96] = 9062727458208719086L;
        ig.evyy[97] = 7158197124392728634L;
        ig.evyy[98] = 2072437792598736829L;
        ig.evyy[99] = 6267693705467610553L;
    }

    private static /* synthetic */ void ezhx() {
        ig.evzg[300] = -1967558445;
        ig.evzg[301] = -582440323;
        ig.evzg[302] = 523644545;
        ig.evzg[303] = 1247543759;
        ig.evzg[304] = 1449401303;
        ig.evzg[305] = 912387363;
        ig.evzg[306] = 1281060933;
        ig.evzg[307] = -1356607179;
        ig.evzg[308] = 375453930;
        ig.evzg[309] = -1511698261;
        ig.evzg[310] = 1232813025;
        ig.evzg[311] = 643958037;
        ig.evzg[312] = 751501454;
        ig.evzg[313] = -1141602898;
        ig.evzg[314] = -1009113683;
        ig.evzg[315] = -1676179212;
        ig.evzg[316] = -1176891599;
        ig.evzg[317] = -1874274667;
        ig.evzg[318] = -67806928;
        ig.evzg[319] = -1601339071;
        ig.evzg[320] = -1894010244;
        ig.evzg[321] = 2068581470;
        ig.evzg[322] = -816572274;
        ig.evzg[323] = -436549703;
        ig.evzg[324] = -1059391507;
        ig.evzg[325] = 190077856;
        ig.evzg[326] = -240304321;
        ig.evzg[327] = -556119539;
        ig.evzg[328] = 555618467;
        ig.evzg[329] = 591633868;
        ig.evzg[330] = -959071231;
        ig.evzg[331] = -822726975;
        ig.evzg[332] = 1052368504;
        ig.evzg[333] = -1928701259;
        ig.evzg[334] = -1127729649;
        ig.evzg[335] = 1661330518;
        ig.evzg[336] = 577289812;
        ig.evzg[337] = 1402168913;
        ig.evzg[338] = -1385868909;
        ig.evzg[339] = -1074037077;
        ig.evzg[340] = 617817024;
        ig.evzg[341] = 1688540864;
        ig.evzg[342] = 1703888728;
        ig.evzg[343] = -973142369;
        ig.evzg[344] = -531768903;
        ig.evzg[345] = 143742606;
        ig.evzg[346] = -1707424829;
        ig.evzg[347] = -1310941189;
        ig.evzg[348] = -1996817210;
        ig.evzg[349] = -346155211;
        ig.evzg[350] = 792346883;
        ig.evzg[351] = 882157967;
        ig.evzg[352] = 1261961804;
        ig.evzg[353] = -979114011;
        ig.evzg[354] = 237523079;
        ig.evzg[355] = -1039451238;
        ig.evzg[356] = -1273732831;
        ig.evzg[357] = 855159942;
        ig.evzg[358] = -383219792;
        ig.evzg[359] = 533112942;
        ig.evzg[360] = 1865527134;
        ig.evzg[361] = 1016656125;
        ig.evzg[362] = 478020552;
        ig.evzg[363] = -377298092;
        ig.evzg[364] = -1171830408;
        ig.evzg[365] = 1633793198;
        ig.evzg[366] = -1636714191;
        ig.evzg[367] = -1118178900;
        ig.evzg[368] = 210818705;
        ig.evzg[369] = 72518209;
        ig.evzg[370] = 770834913;
        ig.evzg[371] = 1520421464;
        ig.evzg[372] = 1854946827;
        ig.evzg[373] = -1057622103;
        ig.evzg[374] = 150478605;
        ig.evzg[375] = 663897947;
        ig.evzg[376] = 1929437790;
        ig.evzg[377] = 226230882;
        ig.evzg[378] = -1420320220;
        ig.evzg[379] = 551816636;
        ig.evzg[380] = -2145176277;
        ig.evzg[381] = 759313401;
        ig.evzg[382] = -395906818;
        ig.evzg[383] = 624136112;
        ig.evzg[384] = 241498257;
        ig.evzg[385] = -398925103;
        ig.evzg[386] = 221206869;
        ig.evzg[387] = 1005423863;
        ig.evzg[388] = 1784398270;
        ig.evzg[389] = -330448093;
        ig.evzg[390] = 1086744435;
        ig.evzg[391] = -450054778;
        ig.evzg[392] = -900951865;
        ig.evzg[393] = -1711274938;
        ig.evzg[394] = -1537641427;
        ig.evzg[395] = -1793174939;
        ig.evzg[396] = -1309371972;
        ig.evzg[397] = 885161520;
        ig.evzg[398] = -1886413297;
        ig.evzg[399] = 1133385946;
    }

    private static /* synthetic */ void ezdv() {
        ig.evzf[800] = 760210040;
        ig.evzf[801] = -1487748533;
        ig.evzf[802] = 2032364545;
        ig.evzf[803] = 77123278;
        ig.evzf[804] = -1127100753;
        ig.evzf[805] = -254568214;
        ig.evzf[806] = -23485271;
        ig.evzf[807] = -194612622;
        ig.evzf[808] = -673204574;
        ig.evzf[809] = 252987017;
        ig.evzf[810] = 45414704;
        ig.evzf[811] = -1889172340;
        ig.evzf[812] = 590809413;
        ig.evzf[813] = 1465800118;
        ig.evzf[814] = -1081492474;
        ig.evzf[815] = -248967861;
        ig.evzf[816] = 1124182317;
        ig.evzf[817] = -1881114617;
        ig.evzf[818] = 1228319983;
        ig.evzf[819] = 358563050;
        ig.evzf[820] = -927477544;
        ig.evzf[821] = 1979091569;
        ig.evzf[822] = -1713748071;
        ig.evzf[823] = 218316411;
        ig.evzf[824] = 1665529971;
        ig.evzf[825] = -283159629;
        ig.evzf[826] = 1805826519;
        ig.evzf[827] = -1775519216;
        ig.evzf[828] = 1521079568;
        ig.evzf[829] = 592938809;
        ig.evzf[830] = 632533167;
        ig.evzf[831] = 2061709994;
        ig.evzf[832] = 1473693955;
        ig.evzf[833] = 1963313749;
        ig.evzf[834] = -1172525064;
        ig.evzf[835] = -80732897;
        ig.evzf[836] = 1788607203;
        ig.evzf[837] = 1290845667;
        ig.evzf[838] = 1771077706;
        ig.evzf[839] = 929869383;
        ig.evzf[840] = 297180457;
        ig.evzf[841] = -171084708;
        ig.evzf[842] = 758676704;
        ig.evzf[843] = 1695083111;
        ig.evzf[844] = 514266634;
        ig.evzf[845] = 196062260;
        ig.evzf[846] = 1473613481;
        ig.evzf[847] = 441244082;
        ig.evzf[848] = -1279315026;
        ig.evzf[849] = 99925130;
        ig.evzf[850] = -1005868155;
        ig.evzf[851] = -369446835;
        ig.evzf[852] = -1296446857;
        ig.evzf[853] = 1348130559;
        ig.evzf[854] = -1024608107;
        ig.evzf[855] = 1900566996;
        ig.evzf[856] = -667500193;
        ig.evzf[857] = 1643757268;
        ig.evzf[858] = 222454785;
        ig.evzf[859] = -1751771691;
        ig.evzf[860] = 985769660;
        ig.evzf[861] = -1519721280;
        ig.evzf[862] = -1980314472;
        ig.evzf[863] = 999076822;
        ig.evzf[864] = 363575999;
        ig.evzf[865] = 47042280;
        ig.evzf[866] = -477621963;
        ig.evzf[867] = 364828354;
        ig.evzf[868] = 1611384678;
        ig.evzf[869] = 1255407200;
        ig.evzf[870] = 1795104030;
        ig.evzf[871] = 1571524991;
        ig.evzf[872] = -1087819523;
        ig.evzf[873] = -874365802;
        ig.evzf[874] = -1002790781;
        ig.evzf[875] = -2101952034;
        ig.evzf[876] = 1684069061;
        ig.evzf[877] = 1456142014;
        ig.evzf[878] = -1830582204;
        ig.evzf[879] = -2127878408;
        ig.evzf[880] = -2040237035;
        ig.evzf[881] = -239847583;
        ig.evzf[882] = -580680751;
        ig.evzf[883] = -1725839114;
        ig.evzf[884] = 1179773707;
        ig.evzf[885] = 890381712;
        ig.evzf[886] = 1729381861;
        ig.evzf[887] = -969924305;
        ig.evzf[888] = 1126488412;
        ig.evzf[889] = -1354402313;
        ig.evzf[890] = 1133382321;
        ig.evzf[891] = 631497212;
        ig.evzf[892] = -223022338;
        ig.evzf[893] = 3717564;
        ig.evzf[894] = 386924384;
        ig.evzf[895] = 348338876;
        ig.evzf[896] = -257084582;
        ig.evzf[897] = 1516906640;
        ig.evzf[898] = -2128892858;
        ig.evzf[899] = 301753655;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov lockOn(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11) {
        block113: {
            block114: {
                block112: {
                    var23_12 = ig.c;
                    var22_13 /* !! */  = ig.b;
                    var21_14 = ig.a;
                    if (var23_12) {
                        throw null;
lbl6:
                        // 30 sources

                        return null;
                    }
                    if (var21_14 || var21_14) ** GOTO lbl6
                    if (!(var4_4 < ig.evza("expt", evzd(int ), (int)559))) break block112;
                    if (var21_14 || var21_14) ** GOTO lbl6
                    this.pursueStreak = (int)ig.evza("expu", evzk(int ), (int)560);
                    if (var21_14 || var21_14) ** GOTO lbl6
                    return this.finishStep(var1_1, var2_2, var3_3, var5_5, var6_6, (float)ig.evza("expv", evzd(int ), (int)561));
                }
                if (var21_14 || var21_14) ** GOTO lbl6
                var12_15 = class_3532.method_15363((float)(this.lerp((float)ig.evza("expw", evzd(int ), (int)562), (float)ig.evza("expx", evzd(int ), (int)563)) * (ig.evza("expy", evzd(int ), (int)564) + var9_9)), (float)ig.evza("expz", evzd(int ), (int)565), (float)var10_10);
                if (var21_14 || var21_14) ** GOTO lbl6
                var13_16 = class_3532.method_15363((float)(this.lerp((float)ig.evza("exqa", evzd(int ), (int)566), (float)ig.evza("exqb", evzd(int ), (int)567)) * (ig.evza("exqc", evzd(int ), (int)568) + var9_9)), (float)ig.evza("exqd", evzd(int ), (int)569), (float)(var10_10 * ig.evza("exqe", evzd(int ), (int)570)));
                if (var21_14 || var21_14) ** GOTO lbl6
                if (this.lockSkewTicks <= 0) break block113;
                if (var21_14 || var21_14) ** GOTO lbl6
                this.lockSkewTicks -= ig.evza("exqf", evzk(int ), (int)571);
                if (var21_14 || var21_14) ** GOTO lbl6
                if (!this.lockSkewYaw) break block114;
                if (var21_14 || var21_14) ** GOTO lbl6
                var13_16 *= this.lerp((float)ig.evza("exqg", evzd(int ), (int)572), (float)ig.evza("exqh", evzd(int ), (int)573));
                if (var21_14) ** GOTO lbl6
                if (var23_12) {
                    throw null;
                }
                break block113;
            }
            if (var21_14 || var21_14) ** GOTO lbl6
            var12_15 *= this.lerp((float)ig.evza("exqi", evzd(int ), (int)574), (float)ig.evza("exqj", evzd(int ), (int)575));
            if (var21_14) ** GOTO lbl6
        }
        if (var21_14 || var21_14) ** GOTO lbl6
        var12_15 *= ig.evza("exqk", evzd(int ), (int)576) + this.random.nextFloat() * ig.evza("exql", evzd(int ), (int)577);
        if (var21_14 || var21_14) ** GOTO lbl6
        if (var22_13 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_13 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var13_16 *= ig.evza("exqm", evzd(int ), (int)578) + this.random.nextFloat() * ig.evza("exqn", evzd(int ), (int)579);
                if (var21_14 || var21_14) ** GOTO lbl6
                var14_17 = var2_2 * var12_15 - var7_7 * ig.evza("exqo", evzd(int ), (int)580) + var5_5 + this.wanderYaw * this.lerp((float)ig.evza("exqp", evzd(int ), (int)581), (float)ig.evza("exqq", evzd(int ), (int)582));
                if (var21_14 || var21_14) ** GOTO lbl6
                var15_18 = var3_3 * var13_16 - var8_8 * ig.evza("exqr", evzd(int ), (int)583) + var6_6 + this.wanderPitch * this.lerp((float)ig.evza("exqs", evzd(int ), (int)584), (float)ig.evza("exqt", evzd(int ), (int)585));
                if (var21_14 || var21_14) ** GOTO lbl6
                var16_19 = this.lerp((float)ig.evza("exqu", evzd(int ), (int)586), (float)ig.evza("exqv", evzd(int ), (int)587));
                if (var21_14 || var21_14) ** GOTO lbl6
                var14_17 = this.lastStepYaw * var16_19 + var14_17 * (1.0f - var16_19);
                if (var21_14 || var21_14) ** GOTO lbl6
                var15_18 = this.lastStepPitch * var16_19 + var15_18 * (1.0f - var16_19);
                if (var21_14 || var21_14) ** GOTO lbl6
                var17_20 = this.lerp((float)ig.evza("exqw", evzd(int ), (int)588), (float)ig.evza("exqx", evzd(int ), (int)589)) * (ig.evza("exqy", evzd(int ), (int)590) + var9_9);
                if (var21_14 || var21_14) ** GOTO lbl6
                var18_21 = this.lerp((float)ig.evza("exqz", evzd(int ), (int)591), (float)ig.evza("exra", evzd(int ), (int)592)) * (ig.evza("exrb", evzd(int ), (int)593) + var9_9);
                if (var21_14 || var21_14) ** GOTO lbl6
                var19_22 = Math.abs(var14_17);
                if (var21_14 || var21_14) ** GOTO lbl6
                var20_23 = Math.abs(var15_18);
                if (var21_14 || var21_14) ** GOTO lbl6
                if (!(var19_22 > var17_20)) ** GOTO lbl66
                if (var21_14) ** GOTO lbl6
                var14_17 *= var17_20 / var19_22;
                if (var21_14) ** GOTO lbl6
lbl66:
                // 2 sources

                if (var21_14 || var21_14) ** GOTO lbl6
                if (!(var20_23 > var18_21)) ** GOTO lbl71
                if (var21_14) ** GOTO lbl6
                var15_18 *= var18_21 / var20_23;
                if (var21_14) ** GOTO lbl6
lbl71:
                // 2 sources

                if (!var21_14 && !var21_14) ** break;
                ** continue;
                return this.commitStep(var1_1, var2_2, var3_3, var4_4, var14_17, var15_18, var5_5, var6_6, (float)ig.evza("exrc", evzd(int ), (int)594), (boolean)ig.evza("exrd", evzk(int ), (int)595), (boolean)ig.evza("exre", evzk(int ), (int)596));
            }
            case 0: {
                var22_13 /* !! */  = (int)ig.evza("exrf", evzk(int ), (int)597);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 1: {
                var22_13 /* !! */  = (int)ig.evza("exrg", evzk(int ), (int)598);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl84:
            // 2 sources

            case 2: {
                var22_13 /* !! */  = (int)ig.evza("exrh", evzk(int ), (int)599);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl89:
            // 3 sources

            case 3: {
                var22_13 /* !! */  = (int)ig.evza("exri", evzk(int ), (int)600);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl94:
            // 3 sources

            case 4: {
                var22_13 /* !! */  = (int)ig.evza("exrj", evzk(int ), (int)601);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl99:
            // 2 sources

            case 5: {
                var22_13 /* !! */  = (int)ig.evza("exrk", evzk(int ), (int)602);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl104:
            // 4 sources

            case 6: {
                var22_13 /* !! */  = (int)ig.evza("exrl", evzk(int ), (int)603);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl109:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_13 /* !! */  = (int)ig.evza("exrm", evzk(int ), (int)604);
                    if (!var23_12) ** GOTO lbl104
                    throw null;
                }
            }
lbl114:
            // 2 sources

            case 8: {
                var22_13 /* !! */  = (int)ig.evza("exrn", evzk(int ), (int)605);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 9: {
                var22_13 /* !! */  = (int)ig.evza("exro", evzk(int ), (int)606);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 10: {
                var22_13 /* !! */  = (int)ig.evza("exrp", evzk(int ), (int)607);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl129:
            // 3 sources

            case 11: {
                var22_13 /* !! */  = (int)ig.evza("exrq", evzk(int ), (int)608);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl134:
            // 2 sources

            case 12: {
                var22_13 /* !! */  = (int)ig.evza("exrr", evzk(int ), (int)609);
                if (!var23_12) break;
                throw null;
            }
            case 13: {
                var22_13 /* !! */  = (int)ig.evza("exrs", evzk(int ), (int)610);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 14: {
                var22_13 /* !! */  = (int)ig.evza("exrt", evzk(int ), (int)611);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl235
            }
lbl148:
            // 3 sources

            case 15: {
                var22_13 /* !! */  = (int)ig.evza("exru", evzk(int ), (int)612);
                if (!var23_12) ** GOTO lbl89
                throw null;
            }
lbl152:
            // 2 sources

            case 16: {
                var22_13 /* !! */  = (int)ig.evza("exrv", evzk(int ), (int)613);
                if (!var23_12) ** GOTO lbl94
                throw null;
            }
lbl156:
            // 2 sources

            case 17: {
                var22_13 /* !! */  = (int)ig.evza("exrw", evzk(int ), (int)614);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl239
            }
lbl161:
            // 2 sources

            case 18: {
                var22_13 /* !! */  = (int)ig.evza("exrx", evzk(int ), (int)615);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl166:
            // 2 sources

            case 19: {
                var22_13 /* !! */  = (int)ig.evza("exry", evzk(int ), (int)616);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl277
            }
lbl171:
            // 3 sources

            case 20: {
                var22_13 /* !! */  = (int)ig.evza("exrz", evzk(int ), (int)617);
                if (!var23_12) ** GOTO lbl104
                throw null;
            }
            case 21: {
                var22_13 /* !! */  = (int)ig.evza("exsa", evzk(int ), (int)618);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl180:
            // 2 sources

            case 22: {
                var22_13 /* !! */  = (int)ig.evza("exsb", evzk(int ), (int)619);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl185:
            // 3 sources

            case 23: {
                var22_13 /* !! */  = (int)ig.evza("exsc", evzk(int ), (int)620);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl190:
            // 3 sources

            case 24: {
                var22_13 /* !! */  = (int)ig.evza("exsd", evzk(int ), (int)621);
                if (!var23_12) ** GOTO lbl156
                throw null;
            }
            case 25: {
                var22_13 /* !! */  = (int)ig.evza("exse", evzk(int ), (int)622);
                if (!var23_12) ** GOTO lbl171
                throw null;
            }
lbl198:
            // 2 sources

            case 26: {
                var22_13 /* !! */  = (int)ig.evza("exsf", evzk(int ), (int)623);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 27: {
                var22_13 /* !! */  = (int)ig.evza("exsg", evzk(int ), (int)624);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl231
            }
            case 28: {
                var22_13 /* !! */  = (int)ig.evza("exsh", evzk(int ), (int)625);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl213:
            // 2 sources

            case 29: {
                var22_13 /* !! */  = (int)ig.evza("exsi", evzk(int ), (int)626);
                if (!var23_12) ** GOTO lbl148
                throw null;
            }
lbl217:
            // 2 sources

            case 30: {
                var22_13 /* !! */  = (int)ig.evza("exsj", evzk(int ), (int)627);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl321
            }
            case 31: {
                var22_13 /* !! */  = (int)ig.evza("exsk", evzk(int ), (int)628);
                if (!var23_12) ** GOTO lbl94
                throw null;
            }
            case 32: {
                var22_13 /* !! */  = (int)ig.evza("exsl", evzk(int ), (int)629);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl231:
            // 3 sources

            case 33: {
                var22_13 /* !! */  = (int)ig.evza("exsm", evzk(int ), (int)630);
                if (!var23_12) ** GOTO lbl104
                throw null;
            }
lbl235:
            // 3 sources

            case 34: {
                var22_13 /* !! */  = (int)ig.evza("exsn", evzk(int ), (int)631);
                if (!var23_12) ** GOTO lbl89
                throw null;
            }
lbl239:
            // 2 sources

            case 35: {
                var22_13 /* !! */  = (int)ig.evza("exso", evzk(int ), (int)632);
                if (!var23_12) ** GOTO lbl114
                throw null;
            }
lbl243:
            // 2 sources

            case 36: {
                var22_13 /* !! */  = (int)ig.evza("exsp", evzk(int ), (int)633);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl248:
            // 2 sources

            case 37: {
                var22_13 /* !! */  = (int)ig.evza("exsq", evzk(int ), (int)634);
                if (var23_12) {
                    throw null;
                }
            }
            case 38: {
                var22_13 /* !! */  = (int)ig.evza("exsr", evzk(int ), (int)635);
                if (!var23_12) ** GOTO lbl235
                throw null;
            }
lbl256:
            // 3 sources

            case 39: {
                var22_13 /* !! */  = (int)ig.evza("exss", evzk(int ), (int)636);
                if (var23_12) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl261:
            // 3 sources

            case 40: {
                var22_13 /* !! */  = (int)ig.evza("exst", evzk(int ), (int)637);
                if (!var23_12) ** GOTO lbl161
                throw null;
            }
            case 41: {
                var22_13 /* !! */  = (int)ig.evza("exsu", evzk(int ), (int)638);
                if (!var23_12) ** GOTO lbl248
                throw null;
            }
            case 42: {
                var22_13 /* !! */  = (int)ig.evza("exsv", evzk(int ), (int)639);
                if (!var23_12) ** GOTO lbl148
                throw null;
            }
lbl273:
            // 2 sources

            case 43: {
                var22_13 /* !! */  = (int)ig.evza("exsw", evzk(int ), (int)640);
                if (!var23_12) ** GOTO lbl134
                throw null;
            }
lbl277:
            // 3 sources

            case 44: {
                var22_13 /* !! */  = (int)ig.evza("exsx", evzk(int ), (int)641);
                if (!var23_12) ** GOTO lbl84
                throw null;
            }
            case 45: {
                var22_13 /* !! */  = (int)ig.evza("exsy", evzk(int ), (int)642);
                if (!var23_12) ** GOTO lbl190
                throw null;
            }
lbl285:
            // 2 sources

            case 46: {
                var22_13 /* !! */  = (int)ig.evza("exsz", evzk(int ), (int)643);
                if (!var23_12) ** GOTO lbl273
                throw null;
            }
            case 47: {
                var22_13 /* !! */  = (int)ig.evza("exta", evzk(int ), (int)644);
                if (!var23_12) ** GOTO lbl213
                throw null;
            }
            case 48: {
                var22_13 /* !! */  = (int)ig.evza("extb", evzk(int ), (int)645);
                if (!var23_12) ** GOTO lbl166
                throw null;
            }
lbl297:
            // 2 sources

            case 49: {
                var22_13 /* !! */  = (int)ig.evza("extc", evzk(int ), (int)646);
                if (!var23_12) break;
                throw null;
            }
lbl301:
            // 4 sources

            case 50: {
                var22_13 /* !! */  = (int)ig.evza("extd", evzk(int ), (int)647);
                if (!var23_12) ** GOTO lbl261
                throw null;
            }
            case 51: {
                var22_13 /* !! */  = (int)ig.evza("exte", evzk(int ), (int)648);
                if (!var23_12) ** GOTO lbl297
                throw null;
            }
lbl309:
            // 2 sources

            case 52: {
                var22_13 /* !! */  = (int)ig.evza("extf", evzk(int ), (int)649);
                if (!var23_12) ** GOTO lbl99
                throw null;
            }
lbl313:
            // 2 sources

            case 53: {
                var22_13 /* !! */  = (int)ig.evza("extg", evzk(int ), (int)650);
                if (!var23_12) ** GOTO lbl277
                throw null;
            }
            case 54: {
                var22_13 /* !! */  = (int)ig.evza("exth", evzk(int ), (int)651);
                if (!var23_12) ** GOTO lbl129
                throw null;
            }
lbl321:
            // 3 sources

            case 55: {
                var22_13 /* !! */  = (int)ig.evza("exti", evzk(int ), (int)652);
                if (!var23_12) ** GOTO lbl301
                throw null;
            }
            case 56: 
        }
        var22_13 /* !! */  = (int)ig.evza("extj", evzk(int ), (int)653);
        ** while (!var23_12)
lbl328:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ezne() {
        ig.evzg[900] = 2087708168;
        ig.evzg[901] = -48394335;
        ig.evzg[902] = 1539816377;
        ig.evzg[903] = -1713851697;
        ig.evzg[904] = 802478265;
        ig.evzg[905] = 1592594775;
        ig.evzg[906] = -584080056;
        ig.evzg[907] = -1761380236;
        ig.evzg[908] = -2102855219;
        ig.evzg[909] = -1159306729;
        ig.evzg[910] = 28892296;
        ig.evzg[911] = -2091341623;
        ig.evzg[912] = -685827263;
        ig.evzg[913] = 520631366;
        ig.evzg[914] = 762249648;
        ig.evzg[915] = -1458510849;
        ig.evzg[916] = 772378304;
        ig.evzg[917] = 628335835;
        ig.evzg[918] = -281170464;
        ig.evzg[919] = -2017189389;
        ig.evzg[920] = -1626804496;
        ig.evzg[921] = -1700172769;
        ig.evzg[922] = -1350676840;
        ig.evzg[923] = -2132125044;
        ig.evzg[924] = 1456318984;
        ig.evzg[925] = -1167927629;
        ig.evzg[926] = -1882995603;
        ig.evzg[927] = 2014564455;
        ig.evzg[928] = 1766793637;
        ig.evzg[929] = 1729284823;
        ig.evzg[930] = -902514439;
        ig.evzg[931] = 1787355574;
        ig.evzg[932] = 1085567966;
        ig.evzg[933] = 1041980905;
        ig.evzg[934] = -1100947437;
        ig.evzg[935] = -1298431131;
        ig.evzg[936] = 953696661;
        ig.evzg[937] = -527909334;
        ig.evzg[938] = 1334614079;
        ig.evzg[939] = -1561146755;
        ig.evzg[940] = -65927664;
        ig.evzg[941] = 1844081864;
        ig.evzg[942] = 1032115143;
        ig.evzg[943] = -2131737576;
        ig.evzg[944] = 1871107699;
        ig.evzg[945] = 1149255897;
        ig.evzg[946] = 432974241;
        ig.evzg[947] = 705884449;
        ig.evzg[948] = 1046360944;
        ig.evzg[949] = 120030585;
        ig.evzg[950] = -1988683487;
        ig.evzg[951] = 78558192;
        ig.evzg[952] = -1386556249;
        ig.evzg[953] = 1233149918;
        ig.evzg[954] = -990936670;
        ig.evzg[955] = -2051699308;
        ig.evzg[956] = -1939305019;
        ig.evzg[957] = 483635329;
        ig.evzg[958] = 834478478;
        ig.evzg[959] = 2028013116;
        ig.evzg[960] = 627773331;
        ig.evzg[961] = 445104972;
        ig.evzg[962] = -1800389436;
        ig.evzg[963] = 1456430657;
        ig.evzg[964] = 1575166442;
        ig.evzg[965] = -200203730;
        ig.evzg[966] = -1941070119;
        ig.evzg[967] = 2005038093;
        ig.evzg[968] = -2132531849;
        ig.evzg[969] = 1176821636;
        ig.evzg[970] = -1852719840;
        ig.evzg[971] = 1716158741;
        ig.evzg[972] = -424915606;
        ig.evzg[973] = 118183323;
        ig.evzg[974] = -60425935;
        ig.evzg[975] = 1989390085;
        ig.evzg[976] = 1104587767;
        ig.evzg[977] = 1298014474;
        ig.evzg[978] = 87107105;
        ig.evzg[979] = -1365968099;
        ig.evzg[980] = -1741036912;
        ig.evzg[981] = 1522114313;
        ig.evzg[982] = 1099683428;
        ig.evzg[983] = 228624906;
        ig.evzg[984] = 814018579;
        ig.evzg[985] = -1423699526;
        ig.evzg[986] = -657625408;
        ig.evzg[987] = -1775143544;
        ig.evzg[988] = 1250910861;
        ig.evzg[989] = -991001962;
        ig.evzg[990] = -1929385992;
        ig.evzg[991] = 1243476086;
        ig.evzg[992] = 399979087;
        ig.evzg[993] = 170295091;
        ig.evzg[994] = 777186657;
        ig.evzg[995] = -668779506;
        ig.evzg[996] = 417842704;
        ig.evzg[997] = 314015253;
        ig.evzg[998] = 1536106695;
        ig.evzg[999] = 2035055027;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov cruise(ov var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, boolean var12_12, boolean var13_13) {
        block85: {
            var27_14 = ig.c;
            var26_15 /* !! */  = ig.b;
            var25_16 = ig.a;
            if (var27_14) {
                throw null;
lbl6:
                // 22 sources

                return null;
            }
            if (var25_16 || var25_16) ** GOTO lbl6
            if (!(var4_4 < ig.evza("exnj", evzd(int ), (int)497))) break block85;
            if (var25_16 || var25_16) ** GOTO lbl6
            return this.finishStep(var1_1, var2_2, var3_3, var5_5, var6_6, (float)ig.evza("exnk", evzd(int ), (int)498));
        }
        if (var25_16 || var25_16) ** GOTO lbl6
        var14_17 = var2_2 * var9_9 - var7_7 * ig.evza("exnl", evzd(int ), (int)499);
        if (var25_16 || var25_16) ** GOTO lbl6
        var15_18 = var3_3 * var9_9 * this.lerp((float)ig.evza("exnm", evzd(int ), (int)500), (float)ig.evza("exnn", evzd(int ), (int)501)) - var8_8 * ig.evza("exno", evzd(int ), (int)502);
        if (var25_16 || var25_16) ** GOTO lbl6
        var16_19 = Math.min((float)Math.hypot(var14_17, var15_18), var10_10);
        if (var25_16 || var25_16) ** GOTO lbl6
        if (!(var16_19 > ig.evza("exnp", evzd(int ), (int)503))) ** GOTO lbl32
        if (var25_16 || var25_16) ** GOTO lbl6
        var17_20 = var16_19 / (float)Math.hypot(var14_17, var15_18);
        if (var25_16 || var25_16) ** GOTO lbl6
        var14_17 *= var17_20;
        if (var25_16) ** GOTO lbl6
        if (var26_15 /* !! */  == 0) ** GOTO lbl-1000
        switch (var26_15 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var25_16) ** GOTO lbl6
                var15_18 *= var17_20;
                if (var25_16) ** GOTO lbl6
lbl32:
                // 2 sources

                if (var25_16 || var25_16) ** GOTO lbl6
                var17_20 = this.lerp((float)ig.evza("exnq", evzd(int ), (int)504), (float)ig.evza("exnr", evzd(int ), (int)505));
                if (var25_16 || var25_16) ** GOTO lbl6
                var18_21 = this.lastStepYaw * var17_20 + var14_17 * (1.0f - var17_20) + var5_5;
                if (var25_16 || var25_16) ** GOTO lbl6
                var19_22 = this.lastStepPitch * var17_20 + var15_18 * (1.0f - var17_20) + var6_6;
                if (var25_16 || var25_16) ** GOTO lbl6
                var20_23 = (float)Math.toRadians(this.lerp((float)ig.evza("exns", evzd(int ), (int)506), (float)ig.evza("exnt", evzd(int ), (int)507)));
                if (var25_16 || var25_16) ** GOTO lbl6
                var21_24 = (float)Math.cos(var20_23);
                if (var25_16 || var25_16) ** GOTO lbl6
                var22_25 = (float)Math.sin(var20_23);
                if (var25_16 || var25_16) ** GOTO lbl6
                var23_26 = var2_2 / var4_4;
                if (var25_16 || var25_16) ** GOTO lbl6
                var24_27 = var3_3 / var4_4;
                if (var25_16 || var25_16) ** GOTO lbl6
                var18_21 += (var23_26 * var21_24 - var24_27 * var22_25) * this.lerp((float)ig.evza("exnu", evzd(int ), (int)508), (float)ig.evza("exnv", evzd(int ), (int)509)) + this.lerp((float)ig.evza("exnw", evzd(int ), (int)510), 2.0f);
                if (var25_16 || var25_16) ** GOTO lbl6
                var19_22 += (var23_26 * var22_25 + var24_27 * var21_24) * this.lerp((float)ig.evza("exnx", evzd(int ), (int)511), (float)ig.evza("exny", evzd(int ), (int)512)) + this.lerp((float)ig.evza("exnz", evzd(int ), (int)513), (float)ig.evza("exoa", evzd(int ), (int)514));
                if (!var25_16 && !var25_16) ** break;
                ** continue;
                return this.commitStep(var1_1, var2_2, var3_3, var4_4, var18_21, var19_22, var5_5, var6_6, var11_11, var12_12, var13_13);
            }
lbl55:
            // 2 sources

            case 0: {
                var26_15 /* !! */  = (int)ig.evza("exob", evzk(int ), (int)515);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 1: {
                var26_15 /* !! */  = (int)ig.evza("exoc", evzk(int ), (int)516);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl65:
            // 2 sources

            case 2: {
                var26_15 /* !! */  = (int)ig.evza("exod", evzk(int ), (int)517);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl70:
            // 2 sources

            case 3: {
                var26_15 /* !! */  = (int)ig.evza("exoe", evzk(int ), (int)518);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl119
            }
            case 4: {
                var26_15 /* !! */  = (int)ig.evza("exof", evzk(int ), (int)519);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl80:
            // 2 sources

            case 5: {
                var26_15 /* !! */  = (int)ig.evza("exog", evzk(int ), (int)520);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl95
            }
            case 6: {
                var26_15 /* !! */  = (int)ig.evza("exoh", evzk(int ), (int)521);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl220
            }
            case 7: {
                var26_15 /* !! */  = (int)ig.evza("exoi", evzk(int ), (int)522);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl95:
            // 2 sources

            case 8: {
                var26_15 /* !! */  = (int)ig.evza("exoj", evzk(int ), (int)523);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl100:
            // 2 sources

            case 9: {
                var26_15 /* !! */  = (int)ig.evza("exok", evzk(int ), (int)524);
                if (!var27_14) break;
                throw null;
            }
            case 10: {
                var26_15 /* !! */  = (int)ig.evza("exol", evzk(int ), (int)525);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl109:
            // 2 sources

            case 11: {
                var26_15 /* !! */  = (int)ig.evza("exom", evzk(int ), (int)526);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl114:
            // 3 sources

            case 12: {
                do {
                    var26_15 /* !! */  = (int)ig.evza("exon", evzk(int ), (int)527);
                } while (!var27_14);
                throw null;
            }
lbl119:
            // 4 sources

            case 13: {
                var26_15 /* !! */  = (int)ig.evza("exoo", evzk(int ), (int)528);
                if (!var27_14) ** GOTO lbl100
                throw null;
            }
            case 14: {
                var26_15 /* !! */  = (int)ig.evza("exop", evzk(int ), (int)529);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl128:
            // 2 sources

            case 15: {
                var26_15 /* !! */  = (int)ig.evza("exoq", evzk(int ), (int)530);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 16: {
                var26_15 /* !! */  = (int)ig.evza("exor", evzk(int ), (int)531);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl207
            }
lbl138:
            // 3 sources

            case 17: {
                var26_15 /* !! */  = (int)ig.evza("exos", evzk(int ), (int)532);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl143:
            // 4 sources

            case 18: {
                var26_15 /* !! */  = (int)ig.evza("exot", evzk(int ), (int)533);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl148:
            // 3 sources

            case 19: {
                var26_15 /* !! */  = (int)ig.evza("exou", evzk(int ), (int)534);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 20: {
                var26_15 /* !! */  = (int)ig.evza("exov", evzk(int ), (int)535);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl158:
            // 2 sources

            case 21: {
                var26_15 /* !! */  = (int)ig.evza("exow", evzk(int ), (int)536);
                if (!var27_14) ** GOTO lbl55
                throw null;
            }
lbl162:
            // 2 sources

            case 22: {
                var26_15 /* !! */  = (int)ig.evza("exox", evzk(int ), (int)537);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 23: {
                var26_15 /* !! */  = (int)ig.evza("exoy", evzk(int ), (int)538);
                if (!var27_14) ** GOTO lbl80
                throw null;
            }
            case 24: {
                var26_15 /* !! */  = (int)ig.evza("exoz", evzk(int ), (int)539);
                if (!var27_14) ** GOTO lbl143
                throw null;
            }
            case 25: {
                var26_15 /* !! */  = (int)ig.evza("expa", evzk(int ), (int)540);
                if (!var27_14) ** GOTO lbl148
                throw null;
            }
            case 26: {
                var26_15 /* !! */  = (int)ig.evza("expb", evzk(int ), (int)541);
                if (!var27_14) ** GOTO lbl119
                throw null;
            }
lbl183:
            // 2 sources

            case 27: {
                var26_15 /* !! */  = (int)ig.evza("expc", evzk(int ), (int)542);
                if (!var27_14) ** GOTO lbl138
                throw null;
            }
            case 28: {
                var26_15 /* !! */  = (int)ig.evza("expd", evzk(int ), (int)543);
                if (!var27_14) ** GOTO lbl114
                throw null;
            }
lbl191:
            // 3 sources

            case 29: {
                var26_15 /* !! */  = (int)ig.evza("expe", evzk(int ), (int)544);
                if (!var27_14) ** GOTO lbl158
                throw null;
            }
lbl195:
            // 2 sources

            case 30: {
                var26_15 /* !! */  = (int)ig.evza("expf", evzk(int ), (int)545);
                if (!var27_14) ** GOTO lbl114
                throw null;
            }
lbl199:
            // 2 sources

            case 31: {
                var26_15 /* !! */  = (int)ig.evza("expg", evzk(int ), (int)546);
                if (!var27_14) ** GOTO lbl183
                throw null;
            }
            case 32: {
                var26_15 /* !! */  = (int)ig.evza("exph", evzk(int ), (int)547);
                if (!var27_14) ** GOTO lbl65
                throw null;
            }
lbl207:
            // 2 sources

            case 33: {
                var26_15 /* !! */  = (int)ig.evza("expi", evzk(int ), (int)548);
                if (!var27_14) ** GOTO lbl143
                throw null;
            }
lbl211:
            // 6 sources

            case 34: {
                var26_15 /* !! */  = (int)ig.evza("expj", evzk(int ), (int)549);
                if (!var27_14) break;
                throw null;
            }
            case 35: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var26_15 /* !! */  = (int)ig.evza("expk", evzk(int ), (int)550);
                    if (!var27_14) ** GOTO lbl138
                    throw null;
                }
            }
lbl220:
            // 2 sources

            case 36: {
                var26_15 /* !! */  = (int)ig.evza("expl", evzk(int ), (int)551);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl234
            }
lbl225:
            // 2 sources

            case 37: {
                var26_15 /* !! */  = (int)ig.evza("expm", evzk(int ), (int)552);
                if (var27_14) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 38: {
                var26_15 /* !! */  = (int)ig.evza("expn", evzk(int ), (int)553);
                if (!var27_14) ** GOTO lbl119
                throw null;
            }
lbl234:
            // 3 sources

            case 39: {
                var26_15 /* !! */  = (int)ig.evza("expo", evzk(int ), (int)554);
                if (!var27_14) ** GOTO lbl148
                throw null;
            }
            case 40: {
                var26_15 /* !! */  = (int)ig.evza("expp", evzk(int ), (int)555);
                if (!var27_14) ** GOTO lbl234
                throw null;
            }
lbl242:
            // 2 sources

            case 41: {
                var26_15 /* !! */  = (int)ig.evza("expq", evzk(int ), (int)556);
                if (var27_14) {
                    throw null;
                }
            }
lbl246:
            // 4 sources

            case 42: {
                var26_15 /* !! */  = (int)ig.evza("expr", evzk(int ), (int)557);
                if (!var27_14) ** GOTO lbl70
                throw null;
            }
            case 43: 
        }
        var26_15 /* !! */  = (int)ig.evza("exps", evzk(int ), (int)558);
        ** while (!var27_14)
lbl253:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ezoc() {
        ig.evzg[1000] = -1446211337;
        ig.evzg[1001] = -1475192718;
        ig.evzg[1002] = -538796182;
        ig.evzg[1003] = -1547930925;
        ig.evzg[1004] = -329020604;
        ig.evzg[1005] = 547902085;
        ig.evzg[1006] = 330722141;
        ig.evzg[1007] = -832163891;
        ig.evzg[1008] = -2095801155;
        ig.evzg[1009] = -137858329;
        ig.evzg[1010] = 204113091;
        ig.evzg[1011] = 1763088705;
        ig.evzg[1012] = 2032980915;
        ig.evzg[1013] = -24902867;
        ig.evzg[1014] = 377706912;
        ig.evzg[1015] = 221186605;
        ig.evzg[1016] = -1023248966;
        ig.evzg[1017] = -1759175757;
        ig.evzg[1018] = -1093236270;
        ig.evzg[1019] = 1940531843;
        ig.evzg[1020] = 1427383732;
        ig.evzg[1021] = 918166603;
        ig.evzg[1022] = 1091631993;
        ig.evzg[1023] = -1718798871;
        ig.evzg[1024] = 413047109;
        ig.evzg[1025] = -405782615;
        ig.evzg[1026] = 2015173772;
        ig.evzg[1027] = -1580638607;
        ig.evzg[1028] = -487214345;
        ig.evzg[1029] = -1609888675;
        ig.evzg[1030] = -2139858190;
        ig.evzg[1031] = -2061029548;
        ig.evzg[1032] = 1869639439;
        ig.evzg[1033] = 1959218570;
        ig.evzg[1034] = 655192156;
        ig.evzg[1035] = -1943695857;
        ig.evzg[1036] = 1371325161;
        ig.evzg[1037] = -1132774456;
        ig.evzg[1038] = -1371647213;
        ig.evzg[1039] = 1019755223;
        ig.evzg[1040] = -352695955;
        ig.evzg[1041] = -847682435;
        ig.evzg[1042] = 7524602;
    }

    private static /* synthetic */ void eyzj() {
        ig.evzf[200] = 1333569027;
        ig.evzf[201] = -2028195265;
        ig.evzf[202] = 1063756816;
        ig.evzf[203] = -1894916409;
        ig.evzf[204] = 1339196662;
        ig.evzf[205] = -1066428789;
        ig.evzf[206] = -2098787434;
        ig.evzf[207] = -1502863159;
        ig.evzf[208] = -1976876333;
        ig.evzf[209] = 1622767517;
        ig.evzf[210] = 54983896;
        ig.evzf[211] = -1742606687;
        ig.evzf[212] = 664594205;
        ig.evzf[213] = -1192963605;
        ig.evzf[214] = 1779076561;
        ig.evzf[215] = -2115678868;
        ig.evzf[216] = -163738990;
        ig.evzf[217] = -1741574971;
        ig.evzf[218] = -1873178467;
        ig.evzf[219] = 1915167472;
        ig.evzf[220] = 919029553;
        ig.evzf[221] = -1264683028;
        ig.evzf[222] = 1590680854;
        ig.evzf[223] = -443282178;
        ig.evzf[224] = -1364794747;
        ig.evzf[225] = 286437638;
        ig.evzf[226] = -1432100142;
        ig.evzf[227] = -731670093;
        ig.evzf[228] = 1073364921;
        ig.evzf[229] = 1432456946;
        ig.evzf[230] = 88727385;
        ig.evzf[231] = 169565913;
        ig.evzf[232] = -2107835786;
        ig.evzf[233] = 651213817;
        ig.evzf[234] = -550818506;
        ig.evzf[235] = 368163114;
        ig.evzf[236] = 1527097073;
        ig.evzf[237] = -71056336;
        ig.evzf[238] = -217076628;
        ig.evzf[239] = -1946088126;
        ig.evzf[240] = 989619225;
        ig.evzf[241] = -1247005695;
        ig.evzf[242] = -2126752943;
        ig.evzf[243] = 235857620;
        ig.evzf[244] = -2027912707;
        ig.evzf[245] = 1643778544;
        ig.evzf[246] = 405093498;
        ig.evzf[247] = 446092151;
        ig.evzf[248] = -195718393;
        ig.evzf[249] = 652172280;
        ig.evzf[250] = 558839619;
        ig.evzf[251] = -931016628;
        ig.evzf[252] = 299290811;
        ig.evzf[253] = -945725914;
        ig.evzf[254] = -1590434450;
        ig.evzf[255] = 755833422;
        ig.evzf[256] = -1422841811;
        ig.evzf[257] = -978282901;
        ig.evzf[258] = 841348203;
        ig.evzf[259] = -1471855072;
        ig.evzf[260] = -1917717303;
        ig.evzf[261] = -1007027321;
        ig.evzf[262] = -1924627586;
        ig.evzf[263] = 1420256516;
        ig.evzf[264] = 535210250;
        ig.evzf[265] = 2047907376;
        ig.evzf[266] = -1625404590;
        ig.evzf[267] = -1728668119;
        ig.evzf[268] = 1917793312;
        ig.evzf[269] = -2104139129;
        ig.evzf[270] = -810880874;
        ig.evzf[271] = -1051688972;
        ig.evzf[272] = 632573054;
        ig.evzf[273] = 1828292671;
        ig.evzf[274] = 1253814779;
        ig.evzf[275] = 1469599282;
        ig.evzf[276] = -1554228172;
        ig.evzf[277] = 142864962;
        ig.evzf[278] = 103165374;
        ig.evzf[279] = -1309401409;
        ig.evzf[280] = 334417725;
        ig.evzf[281] = 1703901386;
        ig.evzf[282] = -981258566;
        ig.evzf[283] = 211578051;
        ig.evzf[284] = -562112892;
        ig.evzf[285] = -1920520573;
        ig.evzf[286] = -120148616;
        ig.evzf[287] = 485063092;
        ig.evzf[288] = 1865677955;
        ig.evzf[289] = 914003829;
        ig.evzf[290] = 485853853;
        ig.evzf[291] = 1553452006;
        ig.evzf[292] = 1436031963;
        ig.evzf[293] = -2072263788;
        ig.evzf[294] = -57891666;
        ig.evzf[295] = -135306159;
        ig.evzf[296] = 183993094;
        ig.evzf[297] = 1301647668;
        ig.evzf[298] = -1900787321;
        ig.evzf[299] = -703617400;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ig() {
        var2_1 /* !! */  = ig.b;
        super("MLS");
        this.random = new Random((long)(ig.evza("evzb", evyw(int ), (int)0) ^ System.nanoTime()));
        this.lastRemYaw = (float)ig.evza("evzi", evzd(int ), (int)0);
        this.lastAttackCount = (int)ig.evza("evzm", evzk(int ), (int)1);
        this.lastEntityId = (int)ig.evza("evzn", evzk(int ), (int)2);
        this.noiseYaw = this.randGauss();
        this.noisePitch = this.randGauss();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.wanderYaw = this.randGauss();
                this.wanderPitch = this.randGauss();
                this.nextWindowBreakAt = (int)ig.evza("evzo", evzk(int ), (int)3);
                return;
            }
lbl16:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ig.evza("evzp", evzk(int ), (int)4);
                    ** GOTO lbl32
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)ig.evza("evzq", evzk(int ), (int)5);
                break;
            }
lbl23:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)ig.evza("evzr", evzk(int ), (int)6);
                ** GOTO lbl29
            }
            case 3: {
                var2_1 /* !! */  = (int)ig.evza("evzs", evzk(int ), (int)7);
                ** GOTO lbl42
            }
lbl29:
            // 3 sources

            case 4: {
                var2_1 /* !! */  = (int)ig.evza("evzt", evzk(int ), (int)8);
                ** GOTO lbl16
            }
lbl32:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)ig.evza("evzu", evzk(int ), (int)9);
                break;
            }
            case 6: {
                var2_1 /* !! */  = (int)ig.evza("evzv", evzk(int ), (int)10);
            }
            case 7: {
                var2_1 /* !! */  = (int)ig.evza("evzw", evzk(int ), (int)11);
                break;
            }
            case 8: {
                var2_1 /* !! */  = (int)ig.evza("evzx", evzk(int ), (int)12);
            }
lbl42:
            // 3 sources

            case 9: {
                var2_1 /* !! */  = (int)ig.evza("evzy", evzk(int ), (int)13);
                ** GOTO lbl29
            }
            case 10: {
                var2_1 /* !! */  = (int)ig.evza("evzz", evzk(int ), (int)14);
                ** GOTO lbl23
            }
            case 11: 
        }
        var2_1 /* !! */  = (int)ig.evza("ewaa", evzk(int ), (int)15);
        ** while (true)
    }

    private static /* synthetic */ void ezmg() {
        ig.evzg[800] = 760209977;
        ig.evzg[801] = -1487748592;
        ig.evzg[802] = 2032364548;
        ig.evzg[803] = 77123249;
        ig.evzg[804] = -1127100800;
        ig.evzg[805] = -254568281;
        ig.evzg[806] = -23485304;
        ig.evzg[807] = -194612618;
        ig.evzg[808] = -673204493;
        ig.evzg[809] = 252987009;
        ig.evzg[810] = 45414747;
        ig.evzg[811] = -1889172226;
        ig.evzg[812] = 590809458;
        ig.evzg[813] = 1465800187;
        ig.evzg[814] = -1081492435;
        ig.evzg[815] = -248967929;
        ig.evzg[816] = 1124182346;
        ig.evzg[817] = -1881114499;
        ig.evzg[818] = 1228319997;
        ig.evzg[819] = 358562958;
        ig.evzg[820] = -927477558;
        ig.evzg[821] = 1979091570;
        ig.evzg[822] = -1713748017;
        ig.evzg[823] = 218316400;
        ig.evzg[824] = 1665529878;
        ig.evzg[825] = -283159660;
        ig.evzg[826] = 1805826461;
        ig.evzg[827] = -1775519149;
        ig.evzg[828] = 1521079610;
        ig.evzg[829] = 592938860;
        ig.evzg[830] = 632533130;
        ig.evzg[831] = 2061710022;
        ig.evzg[832] = 1473694081;
        ig.evzg[833] = 1963313689;
        ig.evzg[834] = 1172525063;
        ig.evzg[835] = 2065415503;
        ig.evzg[836] = 1343809676;
        ig.evzg[837] = 1987293068;
        ig.evzg[838] = -1771077707;
        ig.evzg[839] = 324430713;
        ig.evzg[840] = 746213860;
        ig.evzg[841] = -877087021;
        ig.evzg[842] = -758676705;
        ig.evzg[843] = 485964994;
        ig.evzg[844] = 550687877;
        ig.evzg[845] = 899739677;
        ig.evzg[846] = -1473613482;
        ig.evzg[847] = 245276096;
        ig.evzg[848] = -1921777821;
        ig.evzg[849] = 980231440;
        ig.evzg[850] = 1005868154;
        ig.evzg[851] = 1733637182;
        ig.evzg[852] = -1944038419;
        ig.evzg[853] = -1348130560;
        ig.evzg[854] = 1336235393;
        ig.evzg[855] = 1309786190;
        ig.evzg[856] = -667500201;
        ig.evzg[857] = 1643757270;
        ig.evzg[858] = 222454798;
        ig.evzg[859] = -1751771683;
        ig.evzg[860] = 985769651;
        ig.evzg[861] = -1519721277;
        ig.evzg[862] = -1980314474;
        ig.evzg[863] = 999076818;
        ig.evzg[864] = 363575990;
        ig.evzg[865] = 47042279;
        ig.evzg[866] = -477621968;
        ig.evzg[867] = 364828362;
        ig.evzg[868] = 1611384685;
        ig.evzg[869] = 1255407213;
        ig.evzg[870] = 1795104031;
        ig.evzg[871] = 1571524978;
        ig.evzg[872] = 1087819522;
        ig.evzg[873] = -2023226443;
        ig.evzg[874] = 1002790780;
        ig.evzg[875] = 1855417118;
        ig.evzg[876] = -1684069062;
        ig.evzg[877] = 1341609122;
        ig.evzg[878] = -1830582203;
        ig.evzg[879] = -266908407;
        ig.evzg[880] = 1154511893;
        ig.evzg[881] = -1291831455;
        ig.evzg[882] = -580680748;
        ig.evzg[883] = -1725839120;
        ig.evzg[884] = 1179773705;
        ig.evzg[885] = 890381713;
        ig.evzg[886] = 1729381857;
        ig.evzg[887] = -969924307;
        ig.evzg[888] = 1126488409;
        ig.evzg[889] = -1354402315;
        ig.evzg[890] = 2090372143;
        ig.evzg[891] = 631497188;
        ig.evzg[892] = -223022367;
        ig.evzg[893] = 3717561;
        ig.evzg[894] = 386924406;
        ig.evzg[895] = 348338833;
        ig.evzg[896] = -257084595;
        ig.evzg[897] = 1516906653;
        ig.evzg[898] = -2128892836;
        ig.evzg[899] = 301753649;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float lerp(float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("eymd", evyw(int ), (int)207)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ig.evza("eyme", evzk(int ), (int)1016)) break;
            v0 /* !! */  = (long)ig.evza("eymf", evzk(int ), (int)1017);
        }
        var5_3 = ig.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("eymg", evyw(int ), (int)208)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ig.evza("eymh", evzk(int ), (int)1018)) break;
            v1 /* !! */  = (long)ig.evza("eymi", evzk(int ), (int)1019);
        }
        var4_4 /* !! */  = ig.b;
        v2 /* !! */  = ig.lj;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - ig.evza("eymj", evyw(int ), (int)209));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1284116713: {
                    v3 = ig.evza("eymk", evyw(int ), (int)210);
                    continue block18;
                }
                case -869293746: {
                    break block18;
                }
                case -500082100: {
                    v3 = ig.evza("eyml", evyw(int ), (int)211);
                    continue block18;
                }
                case 1717953445: {
                    v3 = ig.evza("eymm", evyw(int ), (int)212);
                    continue block18;
                }
            }
            break;
        }
        var3_5 = ig.a;
        if (var5_3) {
            throw null;
lbl34:
            // 2 sources

            return (float)ig.evza("eymn", evzd(int ), (int)1020);
        }
        if (var3_5) ** GOTO lbl34
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** continue;
                v4 /* !! */  = ig.lj;
                if (true) ** GOTO lbl45
                block20: while (true) {
                    v4 /* !! */  = (long)(ig.evza("eymp", evyw(int ), (int)214) - ig.evza("eymo", evyw(int ), (int)213));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -869293746: {
                            break block20;
                        }
                        case 1841404410: {
                            continue block20;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("eymq", evyw(int ), (int)215)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ig.evza("eymr", evzk(int ), (int)1021)) break;
                    v5 /* !! */  = (long)ig.evza("eyms", evzk(int ), (int)1022);
                }
                return var1_1 + this.random.nextFloat() * (var2_2 - var1_1);
            }
            case 0: {
                var4_4 /* !! */  = (int)ig.evza("eymt", evzk(int ), (int)1023);
                if (var5_3) {
                    throw null;
                }
            }
lbl61:
            // 4 sources

            case 1: {
                do {
                    var4_4 /* !! */  = (int)ig.evza("eymu", evzk(int ), (int)1024);
                } while (!var5_3);
                throw null;
            }
            case 2: {
                var4_4 /* !! */  = (int)ig.evza("eymv", evzk(int ), (int)1025);
                if (!var5_3) ** GOTO lbl61
                throw null;
            }
            case 3: 
        }
        do {
            var4_4 /* !! */  = (int)ig.evza("eymw", evzk(int ), (int)1026);
        } while (!var5_3);
        throw null;
    }

    private static /* synthetic */ void eziw() {
        ig.evzg[400] = -1913365769;
        ig.evzg[401] = -1223380164;
        ig.evzg[402] = -277503528;
        ig.evzg[403] = -575042617;
        ig.evzg[404] = -1803535180;
        ig.evzg[405] = -1719424467;
        ig.evzg[406] = 963266088;
        ig.evzg[407] = 2142080848;
        ig.evzg[408] = -1743948314;
        ig.evzg[409] = -1353718670;
        ig.evzg[410] = 2008632951;
        ig.evzg[411] = -1720249664;
        ig.evzg[412] = -337812920;
        ig.evzg[413] = 1401287851;
        ig.evzg[414] = -838981303;
        ig.evzg[415] = -1516637011;
        ig.evzg[416] = 1858401713;
        ig.evzg[417] = -1037338261;
        ig.evzg[418] = -12137057;
        ig.evzg[419] = 1473217881;
        ig.evzg[420] = -2019551060;
        ig.evzg[421] = -352681921;
        ig.evzg[422] = 1115847600;
        ig.evzg[423] = 1329613658;
        ig.evzg[424] = 1841674823;
        ig.evzg[425] = -633236241;
        ig.evzg[426] = 1112495321;
        ig.evzg[427] = 1686302333;
        ig.evzg[428] = -1479890133;
        ig.evzg[429] = 287244547;
        ig.evzg[430] = -285933871;
        ig.evzg[431] = -874222360;
        ig.evzg[432] = -1188129299;
        ig.evzg[433] = -1531838584;
        ig.evzg[434] = -1417034208;
        ig.evzg[435] = 102497918;
        ig.evzg[436] = -1787844446;
        ig.evzg[437] = -1807423213;
        ig.evzg[438] = -316476463;
        ig.evzg[439] = 785336966;
        ig.evzg[440] = -2118728776;
        ig.evzg[441] = -1793090554;
        ig.evzg[442] = 600328806;
        ig.evzg[443] = -1217277042;
        ig.evzg[444] = -1894301181;
        ig.evzg[445] = 937534737;
        ig.evzg[446] = 1944968715;
        ig.evzg[447] = 1079295373;
        ig.evzg[448] = 326807062;
        ig.evzg[449] = 725085179;
        ig.evzg[450] = -1816740849;
        ig.evzg[451] = -1486204345;
        ig.evzg[452] = 1610741972;
        ig.evzg[453] = -491132766;
        ig.evzg[454] = -327805553;
        ig.evzg[455] = -829233163;
        ig.evzg[456] = 506135878;
        ig.evzg[457] = -1158241216;
        ig.evzg[458] = -972299917;
        ig.evzg[459] = 813633060;
        ig.evzg[460] = 44211629;
        ig.evzg[461] = 91884271;
        ig.evzg[462] = -904582754;
        ig.evzg[463] = 1703748829;
        ig.evzg[464] = 43525595;
        ig.evzg[465] = 756502894;
        ig.evzg[466] = 397899616;
        ig.evzg[467] = -406404603;
        ig.evzg[468] = -1612079426;
        ig.evzg[469] = 1414361893;
        ig.evzg[470] = -1588456657;
        ig.evzg[471] = 142903559;
        ig.evzg[472] = -1227632835;
        ig.evzg[473] = -1452864410;
        ig.evzg[474] = -891876457;
        ig.evzg[475] = 1501911215;
        ig.evzg[476] = 373007942;
        ig.evzg[477] = -297331467;
        ig.evzg[478] = -1791412370;
        ig.evzg[479] = 548402009;
        ig.evzg[480] = -10278361;
        ig.evzg[481] = -521650486;
        ig.evzg[482] = -528767157;
        ig.evzg[483] = -2021358262;
        ig.evzg[484] = -198342371;
        ig.evzg[485] = -710083307;
        ig.evzg[486] = -171820489;
        ig.evzg[487] = 2008395101;
        ig.evzg[488] = 1362829098;
        ig.evzg[489] = -1174767743;
        ig.evzg[490] = 344607141;
        ig.evzg[491] = -1011422239;
        ig.evzg[492] = 2086634795;
        ig.evzg[493] = 746122684;
        ig.evzg[494] = -718430049;
        ig.evzg[495] = -1098343487;
        ig.evzg[496] = -1384055511;
        ig.evzg[497] = 1962430263;
        ig.evzg[498] = -163499454;
        ig.evzg[499] = -1880630811;
    }

    private static /* synthetic */ void eyyf() {
        ig.evzf[100] = -278914562;
        ig.evzf[101] = -1071851989;
        ig.evzf[102] = -1088300500;
        ig.evzf[103] = 1153429968;
        ig.evzf[104] = 1419735038;
        ig.evzf[105] = 1096315694;
        ig.evzf[106] = 88287305;
        ig.evzf[107] = 474163384;
        ig.evzf[108] = -1436699846;
        ig.evzf[109] = 181779249;
        ig.evzf[110] = -1720829856;
        ig.evzf[111] = 1598119103;
        ig.evzf[112] = -1790374433;
        ig.evzf[113] = 1334254632;
        ig.evzf[114] = 1808508079;
        ig.evzf[115] = -359271964;
        ig.evzf[116] = 1055258286;
        ig.evzf[117] = -459888596;
        ig.evzf[118] = -1367967804;
        ig.evzf[119] = 258505248;
        ig.evzf[120] = -489261026;
        ig.evzf[121] = -131510516;
        ig.evzf[122] = -257538872;
        ig.evzf[123] = -886486016;
        ig.evzf[124] = -1618093592;
        ig.evzf[125] = -1019627631;
        ig.evzf[126] = 1895014203;
        ig.evzf[127] = 503908822;
        ig.evzf[128] = 2001000224;
        ig.evzf[129] = 491717578;
        ig.evzf[130] = -288110576;
        ig.evzf[131] = -358789265;
        ig.evzf[132] = -1052212240;
        ig.evzf[133] = -1088172387;
        ig.evzf[134] = 74549919;
        ig.evzf[135] = 842983435;
        ig.evzf[136] = 1432102485;
        ig.evzf[137] = -2064360430;
        ig.evzf[138] = -735551246;
        ig.evzf[139] = 1489488293;
        ig.evzf[140] = 1770265004;
        ig.evzf[141] = 1563116374;
        ig.evzf[142] = 1712251289;
        ig.evzf[143] = 823688410;
        ig.evzf[144] = -1516843613;
        ig.evzf[145] = -1511495184;
        ig.evzf[146] = -1864171464;
        ig.evzf[147] = -970114732;
        ig.evzf[148] = 2024736485;
        ig.evzf[149] = -658947783;
        ig.evzf[150] = 1467424120;
        ig.evzf[151] = 957468869;
        ig.evzf[152] = 331705303;
        ig.evzf[153] = 1332777901;
        ig.evzf[154] = -1526192397;
        ig.evzf[155] = 693378884;
        ig.evzf[156] = 714490808;
        ig.evzf[157] = -137809871;
        ig.evzf[158] = -1989409875;
        ig.evzf[159] = 263676621;
        ig.evzf[160] = 212086186;
        ig.evzf[161] = -1446268887;
        ig.evzf[162] = -2114385232;
        ig.evzf[163] = 1009008973;
        ig.evzf[164] = 1677033198;
        ig.evzf[165] = -251507957;
        ig.evzf[166] = 2120199693;
        ig.evzf[167] = 1068774370;
        ig.evzf[168] = 1043269433;
        ig.evzf[169] = -690796229;
        ig.evzf[170] = 2015561564;
        ig.evzf[171] = -1446880891;
        ig.evzf[172] = -537505044;
        ig.evzf[173] = 1806281947;
        ig.evzf[174] = 1441790736;
        ig.evzf[175] = -374758977;
        ig.evzf[176] = 208446920;
        ig.evzf[177] = -1590549581;
        ig.evzf[178] = 493797540;
        ig.evzf[179] = 1139678967;
        ig.evzf[180] = -302595578;
        ig.evzf[181] = 992512244;
        ig.evzf[182] = -1344182964;
        ig.evzf[183] = 1175667261;
        ig.evzf[184] = 682512008;
        ig.evzf[185] = 365361686;
        ig.evzf[186] = 745896738;
        ig.evzf[187] = 1339470211;
        ig.evzf[188] = -1187661101;
        ig.evzf[189] = -231744021;
        ig.evzf[190] = -1003445166;
        ig.evzf[191] = 116335022;
        ig.evzf[192] = 1224533929;
        ig.evzf[193] = -1004409181;
        ig.evzf[194] = -485677094;
        ig.evzf[195] = -1510568844;
        ig.evzf[196] = 898091524;
        ig.evzf[197] = -1241470831;
        ig.evzf[198] = -1638835315;
        ig.evzf[199] = -722023888;
    }

    private static /* synthetic */ void eyxg() {
        ig.evzf[0] = -1802812477;
        ig.evzf[1] = 1570458974;
        ig.evzf[2] = -1788541038;
        ig.evzf[3] = 21862407;
        ig.evzf[4] = -1286703493;
        ig.evzf[5] = -1558982978;
        ig.evzf[6] = -858145015;
        ig.evzf[7] = 850088117;
        ig.evzf[8] = -2086335306;
        ig.evzf[9] = -1522281941;
        ig.evzf[10] = 1713289497;
        ig.evzf[11] = 1572065780;
        ig.evzf[12] = -1717908592;
        ig.evzf[13] = 1044913213;
        ig.evzf[14] = 565149899;
        ig.evzf[15] = 1050030616;
        ig.evzf[16] = -388010788;
        ig.evzf[17] = 2060516370;
        ig.evzf[18] = -1854173542;
        ig.evzf[19] = -1495725899;
        ig.evzf[20] = -1275918881;
        ig.evzf[21] = 169308286;
        ig.evzf[22] = 1062669521;
        ig.evzf[23] = -45754736;
        ig.evzf[24] = -561714892;
        ig.evzf[25] = -1191511714;
        ig.evzf[26] = -1059220025;
        ig.evzf[27] = -724276732;
        ig.evzf[28] = 309489546;
        ig.evzf[29] = -201826427;
        ig.evzf[30] = 1621427370;
        ig.evzf[31] = 607241112;
        ig.evzf[32] = -1221272476;
        ig.evzf[33] = 1407883107;
        ig.evzf[34] = 973973318;
        ig.evzf[35] = -1489879449;
        ig.evzf[36] = -1932734292;
        ig.evzf[37] = 620044316;
        ig.evzf[38] = 778044886;
        ig.evzf[39] = -768147029;
        ig.evzf[40] = 422380057;
        ig.evzf[41] = 1661568941;
        ig.evzf[42] = 70572155;
        ig.evzf[43] = -376767138;
        ig.evzf[44] = -1727190839;
        ig.evzf[45] = -1167068383;
        ig.evzf[46] = 918825375;
        ig.evzf[47] = 876345564;
        ig.evzf[48] = -1775675201;
        ig.evzf[49] = -1093348984;
        ig.evzf[50] = 316470273;
        ig.evzf[51] = -1757908243;
        ig.evzf[52] = -461293040;
        ig.evzf[53] = 786177445;
        ig.evzf[54] = -913845684;
        ig.evzf[55] = -490513145;
        ig.evzf[56] = -1989290848;
        ig.evzf[57] = -816000657;
        ig.evzf[58] = 91001849;
        ig.evzf[59] = -1109724621;
        ig.evzf[60] = -644095082;
        ig.evzf[61] = 644706352;
        ig.evzf[62] = -1455699225;
        ig.evzf[63] = -515888338;
        ig.evzf[64] = 157541033;
        ig.evzf[65] = 1033161282;
        ig.evzf[66] = 1473947494;
        ig.evzf[67] = -2103403524;
        ig.evzf[68] = 215501803;
        ig.evzf[69] = 302014404;
        ig.evzf[70] = -2078231427;
        ig.evzf[71] = -1338198872;
        ig.evzf[72] = -450644287;
        ig.evzf[73] = -2029668709;
        ig.evzf[74] = -1882471159;
        ig.evzf[75] = 13657446;
        ig.evzf[76] = 1433999689;
        ig.evzf[77] = 170306158;
        ig.evzf[78] = -419528420;
        ig.evzf[79] = -133369218;
        ig.evzf[80] = 2116500376;
        ig.evzf[81] = 1179860889;
        ig.evzf[82] = 1723971292;
        ig.evzf[83] = 271088583;
        ig.evzf[84] = -1588388428;
        ig.evzf[85] = 229058111;
        ig.evzf[86] = -1348838680;
        ig.evzf[87] = -1747853233;
        ig.evzf[88] = 689038569;
        ig.evzf[89] = -582126753;
        ig.evzf[90] = -638930176;
        ig.evzf[91] = 22135749;
        ig.evzf[92] = -1477553125;
        ig.evzf[93] = 206904294;
        ig.evzf[94] = 1148618887;
        ig.evzf[95] = -1227842592;
        ig.evzf[96] = 190624391;
        ig.evzf[97] = 638818420;
        ig.evzf[98] = -945199833;
        ig.evzf[99] = -443195448;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float hitRadius(class_1297 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ig.lj - ig.evza("ewsb", evyw(int ), (int)45)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ig.evza("ewsc", evzk(int ), (int)122)) break;
            v0 /* !! */  = (long)ig.evza("ewsd", evzk(int ), (int)123);
        }
        var8_2 = ig.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ig.lj - ig.evza("ewse", evyw(int ), (int)46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ig.evza("ewsf", evzk(int ), (int)124)) break;
            v1 /* !! */  = (long)ig.evza("ewsg", evzk(int ), (int)125);
        }
        var7_3 /* !! */  = ig.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ig.lj - ig.evza("ewsh", evyw(int ), (int)47)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ig.evza("ewsi", evzk(int ), (int)126)) break;
            v2 /* !! */  = (long)ig.evza("ewsj", evzk(int ), (int)127);
        }
        var6_4 = ig.a;
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_2) {
                    throw null;
lbl24:
                    // 8 sources

                    return (float)ig.evza("ewsk", evzd(int ), (int)128);
                }
                if (var6_4 || var6_4) ** GOTO lbl24
                if (var1_1 == null) ** GOTO lbl53
                if (var6_4) ** GOTO lbl24
                v3 /* !! */  = ig.lj;
                if (true) ** GOTO lbl33
                block61: while (true) {
                    v3 /* !! */  = (long)(ig.evza("ewsm", evyw(int ), (int)49) - ig.evza("ewsl", evyw(int ), (int)48));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -869293746: {
                            break block61;
                        }
                        case 318854551: {
                            continue block61;
                        }
                    }
                    break;
                }
                v4 /* !! */  = ig.lj;
                if (true) ** GOTO lbl42
                block62: while (true) {
                    v4 /* !! */  = (long)(v5 - ig.evza("ewsn", evyw(int ), (int)50));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -869293746: {
                            break block62;
                        }
                        case 1709740899: {
                            v5 = ig.evza("ewso", evyw(int ), (int)51);
                            continue block62;
                        }
                        case 1988753158: {
                            v5 = ig.evza("ewsp", evyw(int ), (int)52);
                            continue block62;
                        }
                    }
                    break;
                }
                if (ig.mc.field_1724 != null) ** GOTO lbl55
                if (var6_4) ** GOTO lbl24
lbl53:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl24
                return 2.0f;
lbl55:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl24
                v6 = ig.evza("ewsr", ewsq(int ), (int)53);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = ig.lj - ig.evza("ewss", evyw(int ), (int)54)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ig.evza("ewst", evzk(int ), (int)129)) break;
                    v7 /* !! */  = (long)ig.evza("ewsu", evzk(int ), (int)130);
                }
                v8 /* !! */  = ig.lj;
                if (true) ** GOTO lbl66
                block64: while (true) {
                    v8 /* !! */  = (long)(ig.evza("ewsw", evyw(int ), (int)56) - ig.evza("ewsv", evyw(int ), (int)55));
lbl66:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -869293746: {
                            break block64;
                        }
                        case 121502338: {
                            continue block64;
                        }
                    }
                    break;
                }
                v9 = ig.mc.field_1724;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = ig.lj - ig.evza("ewsx", evyw(int ), (int)57)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ig.evza("ewsy", evzk(int ), (int)131)) break;
                    v10 /* !! */  = (long)ig.evza("ewsz", evzk(int ), (int)132);
                }
                v11 = v9.method_5739(var1_1);
                v12 /* !! */  = ig.lj;
                if (true) ** GOTO lbl82
                block66: while (true) {
                    v12 /* !! */  = (long)(v13 - ig.evza("ewta", evyw(int ), (int)58));
lbl82:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -921638408: {
                            v13 = ig.evza("ewtb", evyw(int ), (int)59);
                            continue block66;
                        }
                        case -869293746: {
                            break block66;
                        }
                        case -325870137: {
                            v13 = ig.evza("ewtc", evyw(int ), (int)60);
                            continue block66;
                        }
                        case 505118388: {
                            v13 = ig.evza("ewtd", evyw(int ), (int)61);
                            continue block66;
                        }
                    }
                    break;
                }
                var2_5 = Math.max((double)v6, v11);
                if (var6_4 || var6_4) ** GOTO lbl24
                v14 /* !! */  = ig.lj;
                if (true) ** GOTO lbl100
                block67: while (true) {
                    v14 /* !! */  = (long)(v15 - ig.evza("ewte", evyw(int ), (int)62));
lbl100:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1461277904: {
                            v15 = ig.evza("ewtf", evyw(int ), (int)63);
                            continue block67;
                        }
                        case -869293746: {
                            break block67;
                        }
                        case -853307592: {
                            v15 = ig.evza("ewtg", evyw(int ), (int)64);
                            continue block67;
                        }
                    }
                    break;
                }
                v16 = (double)var1_1.method_17681() * ig.evza("ewth", ewsq(int ), (int)65) / var2_5;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = ig.lj - ig.evza("ewti", evyw(int ), (int)66)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ig.evza("ewtj", evzk(int ), (int)133)) break;
                    v17 /* !! */  = (long)ig.evza("ewtk", evzk(int ), (int)134);
                }
                v18 = Math.atan(v16);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = ig.lj - ig.evza("ewtl", evyw(int ), (int)67)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ig.evza("ewtm", evzk(int ), (int)135)) break;
                    v19 /* !! */  = (long)ig.evza("ewtn", evzk(int ), (int)136);
                }
                var4_6 = (float)Math.toDegrees(v18);
                if (var6_4 || var6_4) ** GOTO lbl24
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_7 = ig.lj - ig.evza("ewto", evyw(int ), (int)68)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ig.evza("ewtp", evzk(int ), (int)137)) break;
                    v20 /* !! */  = (long)ig.evza("ewtq", evzk(int ), (int)138);
                }
                v21 = (double)var1_1.method_17682() * ig.evza("ewtr", ewsq(int ), (int)69) / var2_5;
                v22 /* !! */  = ig.lj;
                if (true) ** GOTO lbl133
                block71: while (true) {
                    v22 /* !! */  = (long)(v23 - ig.evza("ewts", evyw(int ), (int)70));
lbl133:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1931860436: {
                            v23 = ig.evza("ewtt", evyw(int ), (int)71);
                            continue block71;
                        }
                        case -1793726481: {
                            v23 = ig.evza("ewtu", evyw(int ), (int)72);
                            continue block71;
                        }
                        case -869293746: {
                            break block71;
                        }
                    }
                    break;
                }
                v24 = Math.atan(v21);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_8 = ig.lj - ig.evza("ewtv", evyw(int ), (int)73)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == ig.evza("ewtw", evzk(int ), (int)139)) break;
                    v25 /* !! */  = (long)ig.evza("ewtx", evzk(int ), (int)140);
                }
                var5_7 = (float)Math.toDegrees(v24);
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                v26 /* !! */  = ig.lj;
                if (true) ** GOTO lbl155
                block73: while (true) {
                    v26 /* !! */  = (long)(v27 - ig.evza("ewty", evyw(int ), (int)74));
lbl155:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2127433946: {
                            v27 = ig.evza("ewtz", evyw(int ), (int)75);
                            continue block73;
                        }
                        case -970649441: {
                            v27 = ig.evza("ewua", evyw(int ), (int)76);
                            continue block73;
                        }
                        case -869293746: {
                            break block73;
                        }
                    }
                    break;
                }
                v28 = Math.min(var4_6, var5_7) * ig.evza("ewub", evzd(int ), (int)141);
                v29 = ig.evza("ewuc", evzd(int ), (int)142);
                v30 /* !! */  = ig.lj;
                if (true) ** GOTO lbl170
                block74: while (true) {
                    v30 /* !! */  = (long)(ig.evza("ewue", evyw(int ), (int)78) - ig.evza("ewud", evyw(int ), (int)77));
lbl170:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -2142496001: {
                            continue block74;
                        }
                        case -869293746: {
                            break block74;
                        }
                    }
                    break;
                }
                return class_3532.method_15363((float)v28, (float)1.0f, (float)v29);
            }
            case 0: {
                var7_3 /* !! */  = (int)ig.evza("ewuf", evzk(int ), (int)143);
                if (var8_2) {
                    throw null;
                }
            }
            case 1: {
                var7_3 /* !! */  = (int)ig.evza("ewug", evzk(int ), (int)144);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 2: {
                var7_3 /* !! */  = (int)ig.evza("ewuh", evzk(int ), (int)145);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl190:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)ig.evza("ewui", evzk(int ), (int)146);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl195:
            // 3 sources

            case 4: {
                var7_3 /* !! */  = (int)ig.evza("ewuj", evzk(int ), (int)147);
                if (!var8_2) ** GOTO lbl190
                throw null;
            }
lbl199:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)ig.evza("ewuk", evzk(int ), (int)148);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 6: {
                var7_3 /* !! */  = (int)ig.evza("ewul", evzk(int ), (int)149);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 7: {
                var7_3 /* !! */  = (int)ig.evza("ewum", evzk(int ), (int)150);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 8: {
                var7_3 /* !! */  = (int)ig.evza("ewun", evzk(int ), (int)151);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl219:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)ig.evza("ewuo", evzk(int ), (int)152);
                if (!var8_2) ** GOTO lbl199
                throw null;
            }
lbl223:
            // 3 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ig.evza("ewup", evzk(int ), (int)153);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl238
                    break;
                }
            }
            case 11: {
                var7_3 /* !! */  = (int)ig.evza("ewuq", evzk(int ), (int)154);
                if (!var8_2) ** GOTO lbl195
                throw null;
            }
lbl233:
            // 3 sources

            case 12: {
                do {
                    var7_3 /* !! */  = (int)ig.evza("ewur", evzk(int ), (int)155);
                } while (!var8_2);
                throw null;
            }
lbl238:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)ig.evza("ewus", evzk(int ), (int)156);
                if (!var8_2) ** GOTO lbl195
                throw null;
            }
lbl242:
            // 4 sources

            case 14: {
                var7_3 /* !! */  = (int)ig.evza("ewut", evzk(int ), (int)157);
                if (var8_2) {
                    throw null;
                }
            }
            case 15: {
                var7_3 /* !! */  = (int)ig.evza("ewuu", evzk(int ), (int)158);
                if (!var8_2) ** GOTO lbl223
                throw null;
            }
            case 16: 
        }
        var7_3 /* !! */  = (int)ig.evza("ewuv", evzk(int ), (int)159);
        ** while (!var8_2)
lbl253:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block512: {
            block511: {
                block510: {
                    block509: {
                        block507: {
                            block508: {
                                block506: {
                                    block505: {
                                        block504: {
                                            block503: {
                                                block502: {
                                                    block501: {
                                                        block500: {
                                                            block499: {
                                                                block498: {
                                                                    block497: {
                                                                        block496: {
                                                                            block495: {
                                                                                block494: {
                                                                                    block493: {
                                                                                        block492: {
                                                                                            block491: {
                                                                                                block490: {
                                                                                                    block489: {
                                                                                                        block488: {
                                                                                                            block487: {
                                                                                                                block486: {
                                                                                                                    block485: {
                                                                                                                        block484: {
                                                                                                                            block483: {
                                                                                                                                block482: {
                                                                                                                                    block481: {
                                                                                                                                        block480: {
                                                                                                                                            var33_5 = ig.c;
                                                                                                                                            var32_6 /* !! */  = ig.b;
                                                                                                                                            var31_7 = ig.a;
                                                                                                                                            if (var33_5) {
                                                                                                                                                throw null;
lbl6:
                                                                                                                                                // 133 sources

                                                                                                                                                return null;
                                                                                                                                            }
                                                                                                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                            if (var4_4 != null) break block480;
                                                                                                                                            if (var31_7) ** GOTO lbl6
                                                                                                                                            v0 /* !! */  = ig.evza("ewuw", evzk(int ), (int)160);
                                                                                                                                            if (var33_5) {
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            break block481;
                                                                                                                                        }
                                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                        v0 /* !! */  = var5_8 /* !! */  = (CallSite)var4_4.method_5628();
                                                                                                                                    }
                                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                    if (var5_8 /* !! */  == this.lastEntityId) break block482;
                                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                    this.resetState();
                                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                    this.postHitTicks = (int)ig.evza("ewux", evzk(int ), (int)161);
                                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                    this.lastEntityId = (int)var5_8 /* !! */ ;
                                                                                                                                    if (var31_7) ** GOTO lbl6
                                                                                                                                }
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                var6_9 = d.getInstance().getManager().getAttackPerpetrator().getAttackHandler();
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                var7_10 = var6_9.getCount();
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                if (var7_10 == this.lastAttackCount) break block483;
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.lastAttackCount = var7_10;
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.attacksSinceBreak += ig.evza("ewuy", evzk(int ), (int)162);
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.postHitTicks = (int)ig.evza("ewuz", evzk(int ), (int)163);
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.combatTicks = (int)ig.evza("ewva", evzk(int ), (int)164);
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.pursueStreak = (int)ig.evza("ewvb", evzk(int ), (int)165);
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.lastStepPitch = 0.0f;
                                                                                                                                this.lastStepYaw = 0.0f;
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                if (this.attacksSinceBreak < ig.evza("ewvc", evzk(int ), (int)166)) break block483;
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.attacksSinceBreak = (int)ig.evza("ewvd", evzk(int ), (int)167);
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.scheduleWindowBreak();
                                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                                this.speedDrift = this.randGauss() * ig.evza("ewve", evzd(int ), (int)168);
                                                                                                                                if (var31_7) ** GOTO lbl6
                                                                                                                            }
                                                                                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                            if (this.combatTicks >= ig.evza("ewvf", evzk(int ), (int)169)) break block484;
                                                                                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                            this.combatTicks += ig.evza("ewvg", evzk(int ), (int)170);
                                                                                                                            if (var31_7) ** GOTO lbl6
                                                                                                                        }
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        this.rotationTicks += ig.evza("ewvh", evzk(int ), (int)171);
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        this.advanceNoise();
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var8_11 = this.strength();
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var9_12 = hn.getInstance();
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var10_13 = 0.0f;
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var11_14 = 0.0f;
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        if (var4_4 == null) break block485;
                                                                                                                        if (var31_7) ** GOTO lbl6
                                                                                                                        if (ig.mc.field_1724 == null) break block485;
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var12_15 = Math.max((double)ig.evza("ewvi", ewsq(int ), (int)79), (double)ig.mc.field_1724.method_5739(var4_4));
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var14_17 = (float)Math.toDegrees(Math.atan2((double)var4_4.method_17681() * ig.evza("ewvj", ewsq(int ), (int)80), var12_15));
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var15_18 = (float)Math.toDegrees(Math.atan2((double)var4_4.method_17682() * ig.evza("ewvk", ewsq(int ), (int)81), var12_15));
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var10_13 = this.wanderYaw * var14_17 * ig.evza("ewvl", evzd(int ), (int)172);
                                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                        var11_14 = this.wanderPitch * var15_18 * ig.evza("ewvm", evzd(int ), (int)173);
                                                                                                                        if (var31_7) ** GOTO lbl6
                                                                                                                    }
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var12_16 = new ov(var2_2.getYaw() + var10_13, var2_2.getPitch() + var11_14);
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var13_19 = ow.calculateDelta(var1_1, var12_16);
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var14_17 = var13_19.getYaw();
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var15_18 = var13_19.getPitch();
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var16_20 = (float)Math.hypot(var14_17, var15_18);
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var17_21 = 0.0f;
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var18_22 = 0.0f;
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    if (this.lastRemYaw == ig.evza("ewvn", evzd(int ), (int)174)) break block486;
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var17_21 = var14_17 - this.lastRemYaw;
                                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                    var18_22 = var15_18 - this.lastRemPitch;
                                                                                                                    if (var31_7) ** GOTO lbl6
                                                                                                                }
                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                this.lastRemYaw = var14_17;
                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                this.lastRemPitch = var15_18;
                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                var19_23 = this.noiseYaw * this.lerp((float)ig.evza("ewvo", evzd(int ), (int)175), (float)ig.evza("ewvp", evzd(int ), (int)176));
                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                var20_24 = this.noisePitch * this.lerp((float)ig.evza("ewvq", evzd(int ), (int)177), (float)ig.evza("ewvr", evzd(int ), (int)178));
                                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                                if (var4_4 == null) break block487;
                                                                                                                if (var31_7) ** GOTO lbl6
                                                                                                                if (var9_12 == null) break block487;
                                                                                                                if (var31_7) ** GOTO lbl6
                                                                                                                if (!oy.rayTrace(var9_12.attackDistance(), var4_4.method_5829())) break block487;
                                                                                                                if (var31_7) ** GOTO lbl6
                                                                                                                v1 = ig.evza("ewvs", evzk(int ), (int)179);
                                                                                                                if (var33_5) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                break block488;
                                                                                                            }
                                                                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                            v1 = var21_25 = ig.evza("ewvt", evzk(int ), (int)180);
                                                                                                        }
                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                        var22_26 = this.hitRadius(var4_4);
                                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                        if (var21_25 != false) break block489;
                                                                                                        if (var31_7) ** GOTO lbl6
                                                                                                        if (!(var16_20 < ig.evza("ewvu", evzd(int ), (int)181))) break block490;
                                                                                                        if (var31_7) ** GOTO lbl6
                                                                                                    }
                                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                    v2 = ig.evza("ewvv", evzk(int ), (int)182);
                                                                                                    if (var33_5) {
                                                                                                        throw null;
                                                                                                    }
                                                                                                    break block491;
                                                                                                }
                                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                                v2 = var23_27 = ig.evza("ewvw", evzk(int ), (int)183);
                                                                                            }
                                                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                                                            if (var21_25 != false) break block492;
                                                                                            if (var31_7) ** GOTO lbl6
                                                                                            if (!(var16_20 > ig.evza("ewvx", evzd(int ), (int)184))) break block492;
                                                                                            if (var31_7) ** GOTO lbl6
                                                                                            v3 = ig.evza("ewvy", evzk(int ), (int)185);
                                                                                            if (var33_5) {
                                                                                                throw null;
                                                                                            }
                                                                                            break block493;
                                                                                        }
                                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                                        v3 = var24_28 = ig.evza("ewvz", evzk(int ), (int)186);
                                                                                    }
                                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                                    if (var21_25 != false) break block494;
                                                                                    if (var31_7) ** GOTO lbl6
                                                                                    if (!(var16_20 >= ig.evza("ewwa", evzd(int ), (int)187))) break block494;
                                                                                    if (var31_7) ** GOTO lbl6
                                                                                    if (!(var16_20 <= ig.evza("ewwb", evzd(int ), (int)188))) break block494;
                                                                                    if (var31_7) ** GOTO lbl6
                                                                                    v4 = ig.evza("ewwc", evzk(int ), (int)189);
                                                                                    if (var33_5) {
                                                                                        throw null;
                                                                                    }
                                                                                    break block495;
                                                                                }
                                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                                v4 = var25_29 = ig.evza("ewwd", evzk(int ), (int)190);
                                                                            }
                                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                                            if (var24_28 == false) break block496;
                                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                                            this.ticksSinceWindowBreak = (int)ig.evza("ewwe", evzk(int ), (int)191);
                                                                            if (var31_7) ** GOTO lbl6
                                                                            if (var33_5) {
                                                                                throw null;
                                                                            }
                                                                            break block497;
                                                                        }
                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                        if (var21_25 != false) break block497;
                                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                                        this.ticksSinceWindowBreak += ig.evza("ewwf", evzk(int ), (int)192);
                                                                        if (var31_7) ** GOTO lbl6
                                                                    }
                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                    if (this.recoverTicks <= 0) break block498;
                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                    this.recoverTicks -= ig.evza("ewwg", evzk(int ), (int)193);
                                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                                    return this.tremorOnly(var1_1, var14_17, var15_18, var19_23, var20_24);
                                                                }
                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                if (this.spikeGuardTicks <= 0) break block499;
                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                this.spikeGuardTicks -= ig.evza("ewwh", evzk(int ), (int)194);
                                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                                return this.tremorOnly(var1_1, var14_17, var15_18, var19_23, var20_24);
                                                            }
                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                            if (var21_25 != false) break block500;
                                                            if (var31_7) ** GOTO lbl6
                                                            if (var24_28 != false) break block500;
                                                            if (var31_7) ** GOTO lbl6
                                                            if (this.windowBreakTicks <= 0) break block500;
                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                            this.windowBreakTicks -= ig.evza("ewwi", evzk(int ), (int)195);
                                                            if (var31_7 || var31_7) ** GOTO lbl6
                                                            return this.tremorOnly(var1_1, var14_17, var15_18, var19_23 * ig.evza("ewwj", evzd(int ), (int)196), var20_24 * ig.evza("ewwk", evzd(int ), (int)197));
                                                        }
                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                        if (var21_25 != false) break block501;
                                                        if (var31_7) ** GOTO lbl6
                                                        if (var24_28 != false) break block501;
                                                        if (var31_7) ** GOTO lbl6
                                                        if (this.ticksSinceWindowBreak < this.nextWindowBreakAt) break block501;
                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                        this.scheduleWindowBreak();
                                                        if (var31_7 || var31_7) ** GOTO lbl6
                                                        return this.tremorOnly(var1_1, var14_17, var15_18, var19_23, var20_24);
                                                    }
                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                    if (this.postHitTicks <= 0) break block502;
                                                    if (var31_7) ** GOTO lbl6
                                                    if (var23_27 == false) break block502;
                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                    this.postHitTicks -= ig.evza("ewwl", evzk(int ), (int)198);
                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                    if (!(this.random.nextFloat() < ig.evza("ewwm", evzd(int ), (int)199))) break block502;
                                                    if (var31_7 || var31_7) ** GOTO lbl6
                                                    return this.tremorOnly(var1_1, var14_17, var15_18, var19_23 * ig.evza("ewwn", evzd(int ), (int)200), var20_24 * ig.evza("ewwo", evzd(int ), (int)201));
                                                }
                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                if (!(this.lastCloseRatio > ig.evza("ewwp", evzd(int ), (int)202))) break block503;
                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                this.lockSkewTicks = (int)ig.evza("ewwq", evzk(int ), (int)203);
                                                if (var31_7 || var31_7) ** GOTO lbl6
                                                if (!this.lockSkewYaw) {
                                                    v5 /* !! */  = ig.evza("ewwr", evzk(int ), (int)204);
                                                    if (var33_5) {
                                                        throw null;
                                                    }
                                                } else {
                                                    this.lockSkewYaw = ig.evza("ewws", evzk(int ), (int)205);
                                                    v5 /* !! */  = (CallSite)this.lockSkewYaw;
                                                }
                                                if (var31_7) ** GOTO lbl6
                                            }
                                            if (var31_7 || var31_7) ** GOTO lbl6
                                            if (this.combatTicks > ig.evza("ewwt", evzk(int ), (int)206)) break block504;
                                            if (var31_7) ** GOTO lbl6
                                            v6 = ig.evza("ewwu", evzk(int ), (int)207);
                                            if (var33_5) {
                                                throw null;
                                            }
                                            break block505;
                                        }
                                        if (var31_7 || var31_7) ** GOTO lbl6
                                        v6 = var26_30 = ig.evza("ewwv", evzk(int ), (int)208);
                                    }
                                    if (var31_7 || var31_7) ** GOTO lbl6
                                    if (this.rotationTicks <= ig.evza("ewww", evzk(int ), (int)209)) break block506;
                                    if (var31_7) ** GOTO lbl6
                                    v7 /* !! */  = ig.evza("ewwx", evzd(int ), (int)210);
                                    if (var33_5) {
                                        throw null;
                                    }
                                    break block507;
                                }
                                if (var31_7 || var31_7) ** GOTO lbl6
                                if (this.rotationTicks <= ig.evza("ewwy", evzk(int ), (int)211)) break block508;
                                if (var31_7) ** GOTO lbl6
                                v7 /* !! */  = ig.evza("ewwz", evzd(int ), (int)212);
                                if (var33_5) {
                                    throw null;
                                }
                                break block507;
                            }
                            if (var31_7 || var31_7) ** GOTO lbl6
                            v7 /* !! */  = var27_31 = (CallSite)0.0f;
                        }
                        if (var31_7 || var31_7) ** GOTO lbl6
                        if (var26_30 == false) break block509;
                        if (var31_7) ** GOTO lbl6
                        if (this.postHitTicks > 0) break block509;
                        if (var31_7) ** GOTO lbl6
                        v8 = ig.evza("ewxa", evzd(int ), (int)213);
                        if (var33_5) {
                            throw null;
                        }
                        break block510;
                    }
                    if (var31_7 || var31_7) ** GOTO lbl6
                    v8 = ig.evza("ewxb", evzd(int ), (int)214);
                }
                var28_32 = v8 - var27_31;
                if (var31_7 || var31_7) ** GOTO lbl6
                if (var24_28 == false) break block511;
                if (var31_7 || var31_7) ** GOTO lbl6
                var29_33 = this.lerp((float)ig.evza("ewxc", evzd(int ), (int)215), (float)ig.evza("ewxd", evzd(int ), (int)216)) * (ig.evza("ewxe", evzd(int ), (int)217) + var8_11);
                if (var31_7 || var31_7) ** GOTO lbl6
                var30_36 = this.lerp((float)ig.evza("ewxf", evzd(int ), (int)218), (float)ig.evza("ewxg", evzd(int ), (int)219)) * (ig.evza("ewxh", evzd(int ), (int)220) + var8_11);
                if (var31_7 || var31_7) ** GOTO lbl6
                return this.cruise(var1_1, var14_17, var15_18, var16_20, var19_23, var20_24, var17_21, var18_22, var29_33, var30_36, (float)ig.evza("ewxi", evzd(int ), (int)221), (boolean)ig.evza("ewxj", evzk(int ), (int)222), (boolean)ig.evza("ewxk", evzk(int ), (int)223));
            }
            if (var31_7 || var31_7) ** GOTO lbl6
            if (var25_29 == false) break block512;
            if (var31_7 || var31_7) ** GOTO lbl6
            var29_34 = this.lerp((float)ig.evza("ewxl", evzd(int ), (int)224), (float)ig.evza("ewxm", evzd(int ), (int)225)) * (ig.evza("ewxn", evzd(int ), (int)226) + var8_11);
            if (var31_7 || var31_7) ** GOTO lbl6
            var30_37 = this.lerp((float)ig.evza("ewxo", evzd(int ), (int)227), (float)ig.evza("ewxp", evzd(int ), (int)228)) * (ig.evza("ewxq", evzd(int ), (int)229) + var8_11);
            if (var31_7 || var31_7) ** GOTO lbl6
            return this.cruise(var1_1, var14_17, var15_18, var16_20, var19_23, var20_24, var17_21, var18_22, var29_34, var30_37, (float)ig.evza("ewxr", evzd(int ), (int)230), (boolean)ig.evza("ewxs", evzk(int ), (int)231), (boolean)ig.evza("ewxt", evzk(int ), (int)232));
        }
        if (var31_7 || var31_7) ** GOTO lbl6
        if (var21_25 == false) ** GOTO lbl327
        if (var32_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var32_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var31_7 || var31_7) ** GOTO lbl6
                return this.lockOn(var1_1, var14_17, var15_18, var16_20, var19_23, var20_24, var17_21, var18_22, var8_11, (float)var28_32, var22_26);
            }
lbl327:
            // 1 sources

            if (var31_7 || var31_7) ** GOTO lbl6
            if (!(var16_20 > ig.evza("ewxu", evzd(int ), (int)233))) ** GOTO lbl334
            if (var31_7 || var31_7) ** GOTO lbl6
            v9 = this.lerp((float)ig.evza("ewxv", evzd(int ), (int)234), (float)ig.evza("ewxw", evzd(int ), (int)235)) * (ig.evza("ewxx", evzd(int ), (int)236) + var8_11);
            if (var33_5) {
                throw null;
            }
            ** GOTO lbl336
lbl334:
            // 1 sources

            if (var31_7 || var31_7) ** GOTO lbl6
            v9 = var29_35 = this.lerp((float)ig.evza("ewxy", evzd(int ), (int)237), (float)ig.evza("ewxz", evzd(int ), (int)238)) * (ig.evza("ewya", evzd(int ), (int)239) + var8_11);
lbl336:
            // 2 sources

            if (var31_7 || var31_7) ** GOTO lbl6
            var29_35 = class_3532.method_15363((float)(var29_35 * (ig.evza("ewyb", evzd(int ), (int)240) + this.random.nextFloat() * ig.evza("ewyc", evzd(int ), (int)241))), (float)ig.evza("ewyd", evzd(int ), (int)242), (float)var28_32);
            if (var31_7 || var31_7) ** GOTO lbl6
            var30_38 = this.lerp((float)ig.evza("ewye", evzd(int ), (int)243), (float)ig.evza("ewyf", evzd(int ), (int)244)) * (ig.evza("ewyg", evzd(int ), (int)245) + var8_11);
            if (!var31_7 && !var31_7) ** break;
            ** continue;
            return this.cruise(var1_1, var14_17, var15_18, var16_20, var19_23, var20_24, var17_21, var18_22, var29_35, var30_38, (float)ig.evza("ewyh", evzd(int ), (int)246), (boolean)ig.evza("ewyi", evzk(int ), (int)247), (boolean)ig.evza("ewyj", evzk(int ), (int)248));
lbl343:
            // 2 sources

            case 0: {
                var32_6 /* !! */  = (int)ig.evza("ewyk", evzk(int ), (int)249);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1167
            }
lbl348:
            // 2 sources

            case 1: {
                var32_6 /* !! */  = (int)ig.evza("ewyl", evzk(int ), (int)250);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl628
            }
lbl353:
            // 4 sources

            case 2: {
                var32_6 /* !! */  = (int)ig.evza("ewym", evzk(int ), (int)251);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl482
            }
lbl358:
            // 4 sources

            case 3: {
                var32_6 /* !! */  = (int)ig.evza("ewyn", evzk(int ), (int)252);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl623
            }
lbl363:
            // 2 sources

            case 4: {
                var32_6 /* !! */  = (int)ig.evza("ewyo", evzk(int ), (int)253);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl706
            }
lbl368:
            // 2 sources

            case 5: {
                var32_6 /* !! */  = (int)ig.evza("ewyp", evzk(int ), (int)254);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl546
            }
            case 6: {
                var32_6 /* !! */  = (int)ig.evza("ewyq", evzk(int ), (int)255);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl507
            }
lbl378:
            // 2 sources

            case 7: {
                var32_6 /* !! */  = (int)ig.evza("ewyr", evzk(int ), (int)256);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl532
            }
lbl383:
            // 2 sources

            case 8: {
                var32_6 /* !! */  = (int)ig.evza("ewys", evzk(int ), (int)257);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl865
            }
lbl388:
            // 3 sources

            case 9: {
                var32_6 /* !! */  = (int)ig.evza("ewyt", evzk(int ), (int)258);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1287
            }
lbl393:
            // 2 sources

            case 10: {
                var32_6 /* !! */  = (int)ig.evza("ewyu", evzk(int ), (int)259);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl542
            }
lbl398:
            // 2 sources

            case 11: {
                var32_6 /* !! */  = (int)ig.evza("ewyv", evzk(int ), (int)260);
                if (!var33_5) ** GOTO lbl353
                throw null;
            }
lbl402:
            // 2 sources

            case 12: {
                var32_6 /* !! */  = (int)ig.evza("ewyw", evzk(int ), (int)261);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl921
            }
lbl407:
            // 3 sources

            case 13: {
                var32_6 /* !! */  = (int)ig.evza("ewyx", evzk(int ), (int)262);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1419
            }
            case 14: {
                var32_6 /* !! */  = (int)ig.evza("ewyy", evzk(int ), (int)263);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl542
            }
            case 15: {
                var32_6 /* !! */  = (int)ig.evza("ewyz", evzk(int ), (int)264);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl457
            }
            case 16: {
                do {
                    var32_6 /* !! */  = (int)ig.evza("ewza", evzk(int ), (int)265);
                } while (!var33_5);
                throw null;
            }
lbl427:
            // 3 sources

            case 17: {
                var32_6 /* !! */  = (int)ig.evza("ewzb", evzk(int ), (int)266);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1004
            }
            case 18: {
                var32_6 /* !! */  = (int)ig.evza("ewzf", evzk(int ), (int)267);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1447
            }
lbl437:
            // 2 sources

            case 19: {
                var32_6 /* !! */  = (int)ig.evza("ewzg", evzk(int ), (int)268);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl856
            }
            case 20: {
                var32_6 /* !! */  = (int)ig.evza("ewzi", evzk(int ), (int)269);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl987
            }
            case 21: {
                var32_6 /* !! */  = (int)ig.evza("ewzn", evzk(int ), (int)270);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl891
            }
            case 22: {
                var32_6 /* !! */  = (int)ig.evza("ewzp", evzk(int ), (int)271);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1167
            }
lbl457:
            // 2 sources

            case 23: {
                var32_6 /* !! */  = (int)ig.evza("ewzq", evzk(int ), (int)272);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1273
            }
            case 24: {
                var32_6 /* !! */  = (int)ig.evza("ewzy", evzk(int ), (int)273);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1367
            }
lbl467:
            // 3 sources

            case 25: {
                var32_6 /* !! */  = (int)ig.evza("exab", evzk(int ), (int)274);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl953
            }
            case 26: {
                var32_6 /* !! */  = (int)ig.evza("exah", evzk(int ), (int)275);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1031
            }
            case 27: {
                var32_6 /* !! */  = (int)ig.evza("exak", evzk(int ), (int)276);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1252
            }
lbl482:
            // 2 sources

            case 28: {
                var32_6 /* !! */  = (int)ig.evza("exap", evzk(int ), (int)277);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1090
            }
            case 29: {
                var32_6 /* !! */  = (int)ig.evza("exas", evzk(int ), (int)278);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl788
            }
lbl492:
            // 2 sources

            case 30: {
                var32_6 /* !! */  = (int)ig.evza("exax", evzk(int ), (int)279);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl878
            }
            case 31: {
                var32_6 /* !! */  = (int)ig.evza("exbf", evzk(int ), (int)280);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1239
            }
lbl502:
            // 4 sources

            case 32: {
                var32_6 /* !! */  = (int)ig.evza("exbm", evzk(int ), (int)281);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1018
            }
lbl507:
            // 2 sources

            case 33: {
                var32_6 /* !! */  = (int)ig.evza("exbo", evzk(int ), (int)282);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl753
            }
lbl512:
            // 2 sources

            case 34: {
                var32_6 /* !! */  = (int)ig.evza("exbu", evzk(int ), (int)283);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl527
            }
            case 35: {
                var32_6 /* !! */  = (int)ig.evza("exbv", evzk(int ), (int)284);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1144
            }
lbl522:
            // 3 sources

            case 36: {
                var32_6 /* !! */  = (int)ig.evza("exby", evzk(int ), (int)285);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl900
            }
lbl527:
            // 4 sources

            case 37: {
                var32_6 /* !! */  = (int)ig.evza("excc", evzk(int ), (int)286);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl725
            }
lbl532:
            // 2 sources

            case 38: {
                var32_6 /* !! */  = (int)ig.evza("excg", evzk(int ), (int)287);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl576
            }
lbl537:
            // 2 sources

            case 39: {
                var32_6 /* !! */  = (int)ig.evza("excl", evzk(int ), (int)288);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1367
            }
lbl542:
            // 6 sources

            case 40: {
                var32_6 /* !! */  = (int)ig.evza("excm", evzk(int ), (int)289);
                if (!var33_5) break;
                throw null;
            }
lbl546:
            // 3 sources

            case 41: {
                var32_6 /* !! */  = (int)ig.evza("excn", evzk(int ), (int)290);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1105
            }
lbl551:
            // 2 sources

            case 42: {
                var32_6 /* !! */  = (int)ig.evza("excq", evzk(int ), (int)291);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1239
            }
lbl556:
            // 2 sources

            case 43: {
                var32_6 /* !! */  = (int)ig.evza("excu", evzk(int ), (int)292);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl566
            }
lbl561:
            // 4 sources

            case 44: {
                var32_6 /* !! */  = (int)ig.evza("excw", evzk(int ), (int)293);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1239
            }
lbl566:
            // 3 sources

            case 45: {
                var32_6 /* !! */  = (int)ig.evza("exdd", evzk(int ), (int)294);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1189
            }
            case 46: {
                var32_6 /* !! */  = (int)ig.evza("exdf", evzk(int ), (int)295);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1419
            }
lbl576:
            // 5 sources

            case 47: {
                var32_6 /* !! */  = (int)ig.evza("exdg", evzk(int ), (int)296);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1387
            }
lbl581:
            // 4 sources

            case 48: {
                var32_6 /* !! */  = (int)ig.evza("exdj", evzk(int ), (int)297);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1339
            }
            case 49: {
                var32_6 /* !! */  = (int)ig.evza("exdm", evzk(int ), (int)298);
                if (!var33_5) ** GOTO lbl358
                throw null;
            }
lbl590:
            // 2 sources

            case 50: {
                var32_6 /* !! */  = (int)ig.evza("exdn", evzk(int ), (int)299);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1260
            }
lbl595:
            // 5 sources

            case 51: {
                var32_6 /* !! */  = (int)ig.evza("exdq", evzk(int ), (int)300);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl623
            }
            case 52: {
                var32_6 /* !! */  = (int)ig.evza("exdw", evzk(int ), (int)301);
                if (!var33_5) ** GOTO lbl595
                throw null;
            }
            case 53: {
                var32_6 /* !! */  = (int)ig.evza("exdx", evzk(int ), (int)302);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1395
            }
lbl609:
            // 2 sources

            case 54: {
                var32_6 /* !! */  = (int)ig.evza("exdy", evzk(int ), (int)303);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl788
            }
            case 55: {
                var32_6 /* !! */  = (int)ig.evza("exea", evzk(int ), (int)304);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1176
            }
            case 56: {
                var32_6 /* !! */  = (int)ig.evza("exed", evzk(int ), (int)305);
                if (!var33_5) ** GOTO lbl512
                throw null;
            }
lbl623:
            // 3 sources

            case 57: {
                var32_6 /* !! */  = (int)ig.evza("exeg", evzk(int ), (int)306);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl900
            }
lbl628:
            // 5 sources

            case 58: {
                var32_6 /* !! */  = (int)ig.evza("exei", evzk(int ), (int)307);
                if (!var33_5) ** GOTO lbl576
                throw null;
            }
lbl632:
            // 2 sources

            case 59: {
                var32_6 /* !! */  = (int)ig.evza("exel", evzk(int ), (int)308);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl721
            }
            case 60: {
                var32_6 /* !! */  = (int)ig.evza("exeq", evzk(int ), (int)309);
                if (!var33_5) ** GOTO lbl628
                throw null;
            }
lbl641:
            // 2 sources

            case 61: {
                var32_6 /* !! */  = (int)ig.evza("exer", evzk(int ), (int)310);
                if (!var33_5) ** GOTO lbl353
                throw null;
            }
lbl645:
            // 2 sources

            case 62: {
                var32_6 /* !! */  = (int)ig.evza("exev", evzk(int ), (int)311);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl701
            }
lbl650:
            // 4 sources

            case 63: {
                var32_6 /* !! */  = (int)ig.evza("exez", evzk(int ), (int)312);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl948
            }
            case 64: {
                var32_6 /* !! */  = (int)ig.evza("exfb", evzk(int ), (int)313);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl829
            }
            case 65: {
                var32_6 /* !! */  = (int)ig.evza("exfc", evzk(int ), (int)314);
                if (!var33_5) ** GOTO lbl437
                throw null;
            }
lbl664:
            // 2 sources

            case 66: {
                var32_6 /* !! */  = (int)ig.evza("exfk", evzk(int ), (int)315);
                if (!var33_5) ** GOTO lbl343
                throw null;
            }
lbl668:
            // 3 sources

            case 67: {
                var32_6 /* !! */  = (int)ig.evza("exfm", evzk(int ), (int)316);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1343
            }
lbl673:
            // 3 sources

            case 68: {
                var32_6 /* !! */  = (int)ig.evza("exfq", evzk(int ), (int)317);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl913
            }
lbl678:
            // 2 sources

            case 69: {
                var32_6 /* !! */  = (int)ig.evza("exft", evzk(int ), (int)318);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl820
            }
            case 70: {
                var32_6 /* !! */  = (int)ig.evza("exfu", evzk(int ), (int)319);
                if (!var33_5) ** GOTO lbl537
                throw null;
            }
            case 71: {
                var32_6 /* !! */  = (int)ig.evza("exgb", evzk(int ), (int)320);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1100
            }
            case 72: {
                var32_6 /* !! */  = (int)ig.evza("exgc", evzk(int ), (int)321);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1435
            }
lbl697:
            // 2 sources

            case 73: {
                var32_6 /* !! */  = (int)ig.evza("exgj", evzk(int ), (int)322);
                if (!var33_5) ** GOTO lbl561
                throw null;
            }
lbl701:
            // 3 sources

            case 74: {
                var32_6 /* !! */  = (int)ig.evza("exgk", evzk(int ), (int)323);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1126
            }
lbl706:
            // 3 sources

            case 75: {
                var32_6 /* !! */  = (int)ig.evza("exgn", evzk(int ), (int)324);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1415
            }
            case 76: {
                var32_6 /* !! */  = (int)ig.evza("exgp", evzk(int ), (int)325);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl783
            }
            case 77: {
                var32_6 /* !! */  = (int)ig.evza("exgr", evzk(int ), (int)326);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1435
            }
lbl721:
            // 3 sources

            case 78: {
                var32_6 /* !! */  = (int)ig.evza("exgs", evzk(int ), (int)327);
                if (!var33_5) ** GOTO lbl650
                throw null;
            }
lbl725:
            // 3 sources

            case 79: {
                var32_6 /* !! */  = (int)ig.evza("exgt", evzk(int ), (int)328);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl917
            }
            case 80: {
                var32_6 /* !! */  = (int)ig.evza("exgu", evzk(int ), (int)329);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl874
            }
            case 81: {
                var32_6 /* !! */  = (int)ig.evza("exgv", evzk(int ), (int)330);
                if (!var33_5) ** GOTO lbl551
                throw null;
            }
            case 82: {
                var32_6 /* !! */  = (int)ig.evza("exgw", evzk(int ), (int)331);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1140
            }
            case 83: {
                var32_6 /* !! */  = (int)ig.evza("exgx", evzk(int ), (int)332);
                if (!var33_5) ** GOTO lbl542
                throw null;
            }
lbl748:
            // 2 sources

            case 84: {
                var32_6 /* !! */  = (int)ig.evza("exgz", evzk(int ), (int)333);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl852
            }
lbl753:
            // 2 sources

            case 85: {
                var32_6 /* !! */  = (int)ig.evza("exha", evzk(int ), (int)334);
                if (!var33_5) ** GOTO lbl407
                throw null;
            }
lbl757:
            // 2 sources

            case 86: {
                var32_6 /* !! */  = (int)ig.evza("exhb", evzk(int ), (int)335);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl896
            }
lbl762:
            // 2 sources

            case 87: {
                var32_6 /* !! */  = (int)ig.evza("exhc", evzk(int ), (int)336);
                if (!var33_5) ** GOTO lbl427
                throw null;
            }
lbl766:
            // 2 sources

            case 88: {
                var32_6 /* !! */  = (int)ig.evza("exhd", evzk(int ), (int)337);
                if (!var33_5) ** GOTO lbl725
                throw null;
            }
            case 89: {
                var32_6 /* !! */  = (int)ig.evza("exhe", evzk(int ), (int)338);
                if (!var33_5) ** GOTO lbl595
                throw null;
            }
lbl774:
            // 2 sources

            case 90: {
                var32_6 /* !! */  = (int)ig.evza("exhf", evzk(int ), (int)339);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1109
            }
lbl779:
            // 3 sources

            case 91: {
                var32_6 /* !! */  = (int)ig.evza("exhh", evzk(int ), (int)340);
                if (!var33_5) ** GOTO lbl502
                throw null;
            }
lbl783:
            // 2 sources

            case 92: {
                var32_6 /* !! */  = (int)ig.evza("exhi", evzk(int ), (int)341);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1367
            }
lbl788:
            // 3 sources

            case 93: {
                var32_6 /* !! */  = (int)ig.evza("exhj", evzk(int ), (int)342);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl921
            }
lbl793:
            // 2 sources

            case 94: {
                var32_6 /* !! */  = (int)ig.evza("exhk", evzk(int ), (int)343);
                if (!var33_5) ** GOTO lbl527
                throw null;
            }
lbl797:
            // 2 sources

            case 95: {
                var32_6 /* !! */  = (int)ig.evza("exhl", evzk(int ), (int)344);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1407
            }
            case 96: {
                var32_6 /* !! */  = (int)ig.evza("exhm", evzk(int ), (int)345);
                if (!var33_5) ** GOTO lbl581
                throw null;
            }
            case 97: {
                var32_6 /* !! */  = (int)ig.evza("exho", evzk(int ), (int)346);
                if (!var33_5) ** GOTO lbl576
                throw null;
            }
            case 98: {
                var32_6 /* !! */  = (int)ig.evza("exhp", evzk(int ), (int)347);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1140
            }
            case 99: {
                var32_6 /* !! */  = (int)ig.evza("exhq", evzk(int ), (int)348);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1214
            }
lbl820:
            // 2 sources

            case 100: {
                var32_6 /* !! */  = (int)ig.evza("exhr", evzk(int ), (int)349);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1131
            }
            case 101: {
                var32_6 /* !! */  = (int)ig.evza("exhs", evzk(int ), (int)350);
                if (!var33_5) ** GOTO lbl673
                throw null;
            }
lbl829:
            // 2 sources

            case 102: {
                var32_6 /* !! */  = (int)ig.evza("exht", evzk(int ), (int)351);
                if (!var33_5) ** GOTO lbl706
                throw null;
            }
            case 103: {
                var32_6 /* !! */  = (int)ig.evza("exhu", evzk(int ), (int)352);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl878
            }
            case 104: {
                var32_6 /* !! */  = (int)ig.evza("exhv", evzk(int ), (int)353);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1343
            }
lbl843:
            // 2 sources

            case 105: {
                var32_6 /* !! */  = (int)ig.evza("exhw", evzk(int ), (int)354);
                if (!var33_5) ** GOTO lbl566
                throw null;
            }
            case 106: {
                var32_6 /* !! */  = (int)ig.evza("exhx", evzk(int ), (int)355);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1065
            }
lbl852:
            // 3 sources

            case 107: {
                var32_6 /* !! */  = (int)ig.evza("exhy", evzk(int ), (int)356);
                if (!var33_5) ** GOTO lbl650
                throw null;
            }
lbl856:
            // 2 sources

            case 108: {
                var32_6 /* !! */  = (int)ig.evza("exhz", evzk(int ), (int)357);
                if (!var33_5) ** GOTO lbl378
                throw null;
            }
            case 109: {
                var32_6 /* !! */  = (int)ig.evza("exia", evzk(int ), (int)358);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1022
            }
lbl865:
            // 3 sources

            case 110: {
                var32_6 /* !! */  = (int)ig.evza("exib", evzk(int ), (int)359);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1126
            }
            case 111: {
                var32_6 /* !! */  = (int)ig.evza("exic", evzk(int ), (int)360);
                if (!var33_5) ** GOTO lbl363
                throw null;
            }
lbl874:
            // 3 sources

            case 112: {
                var32_6 /* !! */  = (int)ig.evza("exid", evzk(int ), (int)361);
                if (!var33_5) ** GOTO lbl609
                throw null;
            }
lbl878:
            // 5 sources

            case 113: {
                var32_6 /* !! */  = (int)ig.evza("exie", evzk(int ), (int)362);
                if (!var33_5) ** GOTO lbl678
                throw null;
            }
lbl882:
            // 2 sources

            case 114: {
                var32_6 /* !! */  = (int)ig.evza("exif", evzk(int ), (int)363);
                if (!var33_5) ** GOTO lbl878
                throw null;
            }
            case 115: {
                var32_6 /* !! */  = (int)ig.evza("exig", evzk(int ), (int)364);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1210
            }
lbl891:
            // 3 sources

            case 116: {
                var32_6 /* !! */  = (int)ig.evza("exih", evzk(int ), (int)365);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl953
            }
lbl896:
            // 2 sources

            case 117: {
                var32_6 /* !! */  = (int)ig.evza("exii", evzk(int ), (int)366);
                if (!var33_5) ** GOTO lbl664
                throw null;
            }
lbl900:
            // 3 sources

            case 118: {
                var32_6 /* !! */  = (int)ig.evza("exij", evzk(int ), (int)367);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1214
            }
lbl905:
            // 2 sources

            case 119: {
                var32_6 /* !! */  = (int)ig.evza("exik", evzk(int ), (int)368);
                if (!var33_5) ** GOTO lbl492
                throw null;
            }
            case 120: {
                var32_6 /* !! */  = (int)ig.evza("exil", evzk(int ), (int)369);
                if (!var33_5) ** GOTO lbl628
                throw null;
            }
lbl913:
            // 2 sources

            case 121: {
                var32_6 /* !! */  = (int)ig.evza("exim", evzk(int ), (int)370);
                if (!var33_5) ** GOTO lbl407
                throw null;
            }
lbl917:
            // 2 sources

            case 122: {
                var32_6 /* !! */  = (int)ig.evza("exin", evzk(int ), (int)371);
                if (!var33_5) ** GOTO lbl793
                throw null;
            }
lbl921:
            // 4 sources

            case 123: {
                var32_6 /* !! */  = (int)ig.evza("exio", evzk(int ), (int)372);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1105
            }
lbl926:
            // 2 sources

            case 124: {
                var32_6 /* !! */  = (int)ig.evza("exip", evzk(int ), (int)373);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl972
            }
lbl931:
            // 2 sources

            case 125: {
                var32_6 /* !! */  = (int)ig.evza("exiq", evzk(int ), (int)374);
                if (!var33_5) ** GOTO lbl721
                throw null;
            }
            case 126: {
                var32_6 /* !! */  = (int)ig.evza("exir", evzk(int ), (int)375);
                if (!var33_5) ** GOTO lbl774
                throw null;
            }
lbl939:
            // 3 sources

            case 127: {
                var32_6 /* !! */  = (int)ig.evza("exis", evzk(int ), (int)376);
                if (!var33_5) ** GOTO lbl852
                throw null;
            }
lbl943:
            // 3 sources

            case 128: {
                var32_6 /* !! */  = (int)ig.evza("exit", evzk(int ), (int)377);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1113
            }
lbl948:
            // 2 sources

            case 129: {
                var32_6 /* !! */  = (int)ig.evza("exiu", evzk(int ), (int)378);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1308
            }
lbl953:
            // 3 sources

            case 130: {
                var32_6 /* !! */  = (int)ig.evza("exiv", evzk(int ), (int)379);
                if (!var33_5) ** GOTO lbl939
                throw null;
            }
            case 131: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var32_6 /* !! */  = (int)ig.evza("exiw", evzk(int ), (int)380);
                    if (var33_5) {
                        throw null;
                    }
                    ** GOTO lbl1231
                    break;
                }
            }
            case 132: {
                var32_6 /* !! */  = (int)ig.evza("exix", evzk(int ), (int)381);
                if (!var33_5) ** GOTO lbl502
                throw null;
            }
            case 133: {
                var32_6 /* !! */  = (int)ig.evza("exiy", evzk(int ), (int)382);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1415
            }
lbl972:
            // 2 sources

            case 134: {
                var32_6 /* !! */  = (int)ig.evza("exiz", evzk(int ), (int)383);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1231
            }
            case 135: {
                var32_6 /* !! */  = (int)ig.evza("exja", evzk(int ), (int)384);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1295
            }
            case 136: {
                var32_6 /* !! */  = (int)ig.evza("exjb", evzk(int ), (int)385);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1090
            }
lbl987:
            // 2 sources

            case 137: {
                var32_6 /* !! */  = (int)ig.evza("exjc", evzk(int ), (int)386);
                if (!var33_5) ** GOTO lbl353
                throw null;
            }
lbl991:
            // 2 sources

            case 138: {
                var32_6 /* !! */  = (int)ig.evza("exjd", evzk(int ), (int)387);
                if (!var33_5) ** GOTO lbl527
                throw null;
            }
            case 139: {
                var32_6 /* !! */  = (int)ig.evza("exje", evzk(int ), (int)388);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1387
            }
lbl1000:
            // 2 sources

            case 140: {
                var32_6 /* !! */  = (int)ig.evza("exjf", evzk(int ), (int)389);
                if (!var33_5) ** GOTO lbl576
                throw null;
            }
lbl1004:
            // 2 sources

            case 141: {
                var32_6 /* !! */  = (int)ig.evza("exjg", evzk(int ), (int)390);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1322
            }
            case 142: {
                var32_6 /* !! */  = (int)ig.evza("exjh", evzk(int ), (int)391);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1330
            }
            case 143: {
                var32_6 /* !! */  = (int)ig.evza("exji", evzk(int ), (int)392);
                if (!var33_5) ** GOTO lbl766
                throw null;
            }
lbl1018:
            // 2 sources

            case 144: {
                var32_6 /* !! */  = (int)ig.evza("exjj", evzk(int ), (int)393);
                if (!var33_5) ** GOTO lbl878
                throw null;
            }
lbl1022:
            // 2 sources

            case 145: {
                var32_6 /* !! */  = (int)ig.evza("exjk", evzk(int ), (int)394);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1300
            }
            case 146: {
                var32_6 /* !! */  = (int)ig.evza("exjl", evzk(int ), (int)395);
                if (!var33_5) ** GOTO lbl581
                throw null;
            }
lbl1031:
            // 2 sources

            case 147: {
                var32_6 /* !! */  = (int)ig.evza("exjm", evzk(int ), (int)396);
                if (!var33_5) ** GOTO lbl595
                throw null;
            }
lbl1035:
            // 2 sources

            case 148: {
                var32_6 /* !! */  = (int)ig.evza("exjn", evzk(int ), (int)397);
                if (!var33_5) ** GOTO lbl905
                throw null;
            }
            case 149: {
                var32_6 /* !! */  = (int)ig.evza("exjo", evzk(int ), (int)398);
                if (!var33_5) ** GOTO lbl843
                throw null;
            }
            case 150: {
                var32_6 /* !! */  = (int)ig.evza("exjp", evzk(int ), (int)399);
                if (!var33_5) ** GOTO lbl388
                throw null;
            }
            case 151: {
                var32_6 /* !! */  = (int)ig.evza("exjq", evzk(int ), (int)400);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1158
            }
lbl1052:
            // 2 sources

            case 152: {
                var32_6 /* !! */  = (int)ig.evza("exjr", evzk(int ), (int)401);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1126
            }
            case 153: {
                var32_6 /* !! */  = (int)ig.evza("exjs", evzk(int ), (int)402);
                if (!var33_5) ** GOTO lbl402
                throw null;
            }
            case 154: {
                var32_6 /* !! */  = (int)ig.evza("exjt", evzk(int ), (int)403);
                if (!var33_5) ** GOTO lbl939
                throw null;
            }
lbl1065:
            // 3 sources

            case 155: {
                var32_6 /* !! */  = (int)ig.evza("exju", evzk(int ), (int)404);
                if (!var33_5) ** GOTO lbl943
                throw null;
            }
            case 156: {
                var32_6 /* !! */  = (int)ig.evza("exjv", evzk(int ), (int)405);
                if (!var33_5) ** GOTO lbl991
                throw null;
            }
            case 157: {
                var32_6 /* !! */  = (int)ig.evza("exjw", evzk(int ), (int)406);
                if (!var33_5) ** GOTO lbl502
                throw null;
            }
lbl1077:
            // 2 sources

            case 158: {
                var32_6 /* !! */  = (int)ig.evza("exjx", evzk(int ), (int)407);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1330
            }
lbl1082:
            // 2 sources

            case 159: {
                var32_6 /* !! */  = (int)ig.evza("exjy", evzk(int ), (int)408);
                if (!var33_5) ** GOTO lbl865
                throw null;
            }
            case 160: {
                var32_6 /* !! */  = (int)ig.evza("exjz", evzk(int ), (int)409);
                if (!var33_5) ** GOTO lbl561
                throw null;
            }
lbl1090:
            // 3 sources

            case 161: {
                var32_6 /* !! */  = (int)ig.evza("exka", evzk(int ), (int)410);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1447
            }
            case 162: {
                var32_6 /* !! */  = (int)ig.evza("exkb", evzk(int ), (int)411);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1451
            }
lbl1100:
            // 2 sources

            case 163: {
                var32_6 /* !! */  = (int)ig.evza("exkc", evzk(int ), (int)412);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1269
            }
lbl1105:
            // 3 sources

            case 164: {
                var32_6 /* !! */  = (int)ig.evza("exkd", evzk(int ), (int)413);
                if (!var33_5) ** GOTO lbl943
                throw null;
            }
lbl1109:
            // 2 sources

            case 165: {
                var32_6 /* !! */  = (int)ig.evza("exke", evzk(int ), (int)414);
                if (!var33_5) ** GOTO lbl542
                throw null;
            }
lbl1113:
            // 3 sources

            case 166: {
                var32_6 /* !! */  = (int)ig.evza("exkf", evzk(int ), (int)415);
                if (!var33_5) ** GOTO lbl427
                throw null;
            }
lbl1117:
            // 2 sources

            case 167: {
                var32_6 /* !! */  = (int)ig.evza("exkg", evzk(int ), (int)416);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1383
            }
            case 168: {
                var32_6 /* !! */  = (int)ig.evza("exkh", evzk(int ), (int)417);
                if (!var33_5) ** GOTO lbl779
                throw null;
            }
lbl1126:
            // 4 sources

            case 169: {
                var32_6 /* !! */  = (int)ig.evza("exki", evzk(int ), (int)418);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1265
            }
lbl1131:
            // 2 sources

            case 170: {
                var32_6 /* !! */  = (int)ig.evza("exkj", evzk(int ), (int)419);
                if (!var33_5) ** GOTO lbl797
                throw null;
            }
lbl1135:
            // 2 sources

            case 171: {
                var32_6 /* !! */  = (int)ig.evza("exkk", evzk(int ), (int)420);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1407
            }
lbl1140:
            // 3 sources

            case 172: {
                var32_6 /* !! */  = (int)ig.evza("exkl", evzk(int ), (int)421);
                if (var33_5) {
                    throw null;
                }
            }
lbl1144:
            // 4 sources

            case 173: {
                var32_6 /* !! */  = (int)ig.evza("exkm", evzk(int ), (int)422);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1239
            }
lbl1149:
            // 2 sources

            case 174: {
                var32_6 /* !! */  = (int)ig.evza("exkn", evzk(int ), (int)423);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1447
            }
            case 175: {
                var32_6 /* !! */  = (int)ig.evza("exko", evzk(int ), (int)424);
                if (!var33_5) ** GOTO lbl1052
                throw null;
            }
lbl1158:
            // 3 sources

            case 176: {
                var32_6 /* !! */  = (int)ig.evza("exkp", evzk(int ), (int)425);
                if (!var33_5) ** GOTO lbl1035
                throw null;
            }
            case 177: {
                var32_6 /* !! */  = (int)ig.evza("exkq", evzk(int ), (int)426);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1291
            }
lbl1167:
            // 4 sources

            case 178: {
                var32_6 /* !! */  = (int)ig.evza("exkr", evzk(int ), (int)427);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1282
            }
            case 179: {
                var32_6 /* !! */  = (int)ig.evza("exks", evzk(int ), (int)428);
                if (!var33_5) ** GOTO lbl645
                throw null;
            }
lbl1176:
            // 2 sources

            case 180: {
                var32_6 /* !! */  = (int)ig.evza("exkt", evzk(int ), (int)429);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1347
            }
            case 181: {
                var32_6 /* !! */  = (int)ig.evza("exku", evzk(int ), (int)430);
                if (!var33_5) ** GOTO lbl546
                throw null;
            }
            case 182: {
                var32_6 /* !! */  = (int)ig.evza("exkv", evzk(int ), (int)431);
                if (!var33_5) ** GOTO lbl1113
                throw null;
            }
lbl1189:
            // 2 sources

            case 183: {
                var32_6 /* !! */  = (int)ig.evza("exkw", evzk(int ), (int)432);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1308
            }
lbl1194:
            // 2 sources

            case 184: {
                var32_6 /* !! */  = (int)ig.evza("exkx", evzk(int ), (int)433);
                if (!var33_5) ** GOTO lbl891
                throw null;
            }
            case 185: {
                var32_6 /* !! */  = (int)ig.evza("exky", evzk(int ), (int)434);
                if (!var33_5) ** GOTO lbl926
                throw null;
            }
            case 186: {
                var32_6 /* !! */  = (int)ig.evza("exkz", evzk(int ), (int)435);
                if (!var33_5) ** GOTO lbl748
                throw null;
            }
lbl1206:
            // 2 sources

            case 187: {
                var32_6 /* !! */  = (int)ig.evza("exla", evzk(int ), (int)436);
                if (!var33_5) ** GOTO lbl668
                throw null;
            }
lbl1210:
            // 2 sources

            case 188: {
                var32_6 /* !! */  = (int)ig.evza("exlb", evzk(int ), (int)437);
                if (!var33_5) ** GOTO lbl358
                throw null;
            }
lbl1214:
            // 4 sources

            case 189: {
                var32_6 /* !! */  = (int)ig.evza("exlc", evzk(int ), (int)438);
                if (!var33_5) ** GOTO lbl697
                throw null;
            }
            case 190: {
                var32_6 /* !! */  = (int)ig.evza("exld", evzk(int ), (int)439);
                if (!var33_5) ** GOTO lbl542
                throw null;
            }
            case 191: {
                var32_6 /* !! */  = (int)ig.evza("exle", evzk(int ), (int)440);
                if (!var33_5) ** GOTO lbl1000
                throw null;
            }
            case 192: {
                var32_6 /* !! */  = (int)ig.evza("exlf", evzk(int ), (int)441);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1295
            }
lbl1231:
            // 4 sources

            case 193: {
                var32_6 /* !! */  = (int)ig.evza("exlg", evzk(int ), (int)442);
                if (!var33_5) ** GOTO lbl556
                throw null;
            }
            case 194: {
                var32_6 /* !! */  = (int)ig.evza("exlh", evzk(int ), (int)443);
                if (!var33_5) ** GOTO lbl348
                throw null;
            }
lbl1239:
            // 5 sources

            case 195: {
                do {
                    var32_6 /* !! */  = (int)ig.evza("exli", evzk(int ), (int)444);
                } while (!var33_5);
                throw null;
            }
            case 196: {
                var32_6 /* !! */  = (int)ig.evza("exlj", evzk(int ), (int)445);
                if (!var33_5) ** GOTO lbl874
                throw null;
            }
            case 197: {
                var32_6 /* !! */  = (int)ig.evza("exlk", evzk(int ), (int)446);
                if (!var33_5) ** GOTO lbl388
                throw null;
            }
lbl1252:
            // 3 sources

            case 198: {
                var32_6 /* !! */  = (int)ig.evza("exll", evzk(int ), (int)447);
                if (!var33_5) ** GOTO lbl595
                throw null;
            }
            case 199: {
                var32_6 /* !! */  = (int)ig.evza("exlm", evzk(int ), (int)448);
                if (!var33_5) ** GOTO lbl1117
                throw null;
            }
lbl1260:
            // 3 sources

            case 200: {
                var32_6 /* !! */  = (int)ig.evza("exln", evzk(int ), (int)449);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1423
            }
lbl1265:
            // 2 sources

            case 201: {
                var32_6 /* !! */  = (int)ig.evza("exlo", evzk(int ), (int)450);
                if (!var33_5) ** GOTO lbl1194
                throw null;
            }
lbl1269:
            // 2 sources

            case 202: {
                var32_6 /* !! */  = (int)ig.evza("exlp", evzk(int ), (int)451);
                if (!var33_5) ** GOTO lbl1214
                throw null;
            }
lbl1273:
            // 2 sources

            case 203: {
                var32_6 /* !! */  = (int)ig.evza("exlq", evzk(int ), (int)452);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1383
            }
            case 204: {
                var32_6 /* !! */  = (int)ig.evza("exlr", evzk(int ), (int)453);
                if (!var33_5) ** GOTO lbl701
                throw null;
            }
lbl1282:
            // 2 sources

            case 205: {
                do {
                    var32_6 /* !! */  = (int)ig.evza("exls", evzk(int ), (int)454);
                } while (!var33_5);
                throw null;
            }
lbl1287:
            // 2 sources

            case 206: {
                var32_6 /* !! */  = (int)ig.evza("exlt", evzk(int ), (int)455);
                if (!var33_5) ** GOTO lbl921
                throw null;
            }
lbl1291:
            // 2 sources

            case 207: {
                var32_6 /* !! */  = (int)ig.evza("exlu", evzk(int ), (int)456);
                if (!var33_5) ** GOTO lbl522
                throw null;
            }
lbl1295:
            // 3 sources

            case 208: {
                var32_6 /* !! */  = (int)ig.evza("exlv", evzk(int ), (int)457);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1415
            }
lbl1300:
            // 2 sources

            case 209: {
                var32_6 /* !! */  = (int)ig.evza("exlw", evzk(int ), (int)458);
                if (!var33_5) ** GOTO lbl358
                throw null;
            }
            case 210: {
                var32_6 /* !! */  = (int)ig.evza("exlx", evzk(int ), (int)459);
                if (!var33_5) ** GOTO lbl650
                throw null;
            }
lbl1308:
            // 3 sources

            case 211: {
                var32_6 /* !! */  = (int)ig.evza("exly", evzk(int ), (int)460);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1439
            }
            case 212: {
                var32_6 /* !! */  = (int)ig.evza("exlz", evzk(int ), (int)461);
                if (!var33_5) ** GOTO lbl628
                throw null;
            }
            case 213: {
                var32_6 /* !! */  = (int)ig.evza("exma", evzk(int ), (int)462);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1447
            }
lbl1322:
            // 2 sources

            case 214: {
                var32_6 /* !! */  = (int)ig.evza("exmb", evzk(int ), (int)463);
                if (!var33_5) ** GOTO lbl467
                throw null;
            }
            case 215: {
                var32_6 /* !! */  = (int)ig.evza("exmc", evzk(int ), (int)464);
                if (!var33_5) ** GOTO lbl1077
                throw null;
            }
lbl1330:
            // 3 sources

            case 216: {
                var32_6 /* !! */  = (int)ig.evza("exmd", evzk(int ), (int)465);
                if (!var33_5) ** GOTO lbl581
                throw null;
            }
            case 217: {
                var32_6 /* !! */  = (int)ig.evza("exme", evzk(int ), (int)466);
                if (var33_5) {
                    throw null;
                }
                ** GOTO lbl1431
            }
lbl1339:
            // 2 sources

            case 218: {
                var32_6 /* !! */  = (int)ig.evza("exmf", evzk(int ), (int)467);
                if (!var33_5) ** GOTO lbl1252
                throw null;
            }
lbl1343:
            // 3 sources

            case 219: {
                var32_6 /* !! */  = (int)ig.evza("exmg", evzk(int ), (int)468);
                if (!var33_5) ** GOTO lbl673
                throw null;
            }
lbl1347:
            // 3 sources

            case 220: {
                var32_6 /* !! */  = (int)ig.evza("exmh", evzk(int ), (int)469);
                if (!var33_5) ** GOTO lbl668
                throw null;
            }
            case 221: {
                var32_6 /* !! */  = (int)ig.evza("exmi", evzk(int ), (int)470);
                if (!var33_5) ** GOTO lbl882
                throw null;
            }
            case 222: {
                var32_6 /* !! */  = (int)ig.evza("exmj", evzk(int ), (int)471);
                if (!var33_5) ** GOTO lbl1260
                throw null;
            }
            case 223: {
                var32_6 /* !! */  = (int)ig.evza("exmk", evzk(int ), (int)472);
                if (!var33_5) ** GOTO lbl1347
                throw null;
            }
            case 224: {
                var32_6 /* !! */  = (int)ig.evza("exml", evzk(int ), (int)473);
                if (!var33_5) ** GOTO lbl1167
                throw null;
            }
lbl1367:
            // 5 sources

            case 225: {
                var32_6 /* !! */  = (int)ig.evza("exmm", evzk(int ), (int)474);
                if (!var33_5) ** GOTO lbl368
                throw null;
            }
            case 226: {
                var32_6 /* !! */  = (int)ig.evza("exmn", evzk(int ), (int)475);
                if (!var33_5) ** GOTO lbl590
                throw null;
            }
            case 227: {
                var32_6 /* !! */  = (int)ig.evza("exmo", evzk(int ), (int)476);
                if (!var33_5) ** GOTO lbl1135
                throw null;
            }
            case 228: {
                var32_6 /* !! */  = (int)ig.evza("exmp", evzk(int ), (int)477);
                if (!var33_5) ** GOTO lbl398
                throw null;
            }
lbl1383:
            // 3 sources

            case 229: {
                var32_6 /* !! */  = (int)ig.evza("exmq", evzk(int ), (int)478);
                if (!var33_5) ** GOTO lbl1231
                throw null;
            }
lbl1387:
            // 3 sources

            case 230: {
                var32_6 /* !! */  = (int)ig.evza("exmr", evzk(int ), (int)479);
                if (!var33_5) ** GOTO lbl1158
                throw null;
            }
            case 231: {
                var32_6 /* !! */  = (int)ig.evza("exms", evzk(int ), (int)480);
                if (!var33_5) ** GOTO lbl632
                throw null;
            }
lbl1395:
            // 2 sources

            case 232: {
                var32_6 /* !! */  = (int)ig.evza("exmt", evzk(int ), (int)481);
                if (!var33_5) ** GOTO lbl1206
                throw null;
            }
            case 233: {
                var32_6 /* !! */  = (int)ig.evza("exmu", evzk(int ), (int)482);
                if (!var33_5) ** GOTO lbl467
                throw null;
            }
            case 234: {
                var32_6 /* !! */  = (int)ig.evza("exmv", evzk(int ), (int)483);
                if (!var33_5) ** GOTO lbl522
                throw null;
            }
lbl1407:
            // 3 sources

            case 235: {
                var32_6 /* !! */  = (int)ig.evza("exmw", evzk(int ), (int)484);
                if (!var33_5) ** GOTO lbl393
                throw null;
            }
            case 236: {
                var32_6 /* !! */  = (int)ig.evza("exmx", evzk(int ), (int)485);
                if (!var33_5) ** GOTO lbl1082
                throw null;
            }
lbl1415:
            // 4 sources

            case 237: {
                var32_6 /* !! */  = (int)ig.evza("exmy", evzk(int ), (int)486);
                if (!var33_5) ** GOTO lbl1149
                throw null;
            }
lbl1419:
            // 3 sources

            case 238: {
                var32_6 /* !! */  = (int)ig.evza("exmz", evzk(int ), (int)487);
                if (!var33_5) ** GOTO lbl779
                throw null;
            }
lbl1423:
            // 2 sources

            case 239: {
                var32_6 /* !! */  = (int)ig.evza("exna", evzk(int ), (int)488);
                if (!var33_5) ** GOTO lbl931
                throw null;
            }
            case 240: {
                var32_6 /* !! */  = (int)ig.evza("exnb", evzk(int ), (int)489);
                if (!var33_5) ** GOTO lbl757
                throw null;
            }
lbl1431:
            // 2 sources

            case 241: {
                var32_6 /* !! */  = (int)ig.evza("exnc", evzk(int ), (int)490);
                if (!var33_5) ** GOTO lbl1367
                throw null;
            }
lbl1435:
            // 3 sources

            case 242: {
                var32_6 /* !! */  = (int)ig.evza("exnd", evzk(int ), (int)491);
                if (!var33_5) ** GOTO lbl383
                throw null;
            }
lbl1439:
            // 2 sources

            case 243: {
                var32_6 /* !! */  = (int)ig.evza("exne", evzk(int ), (int)492);
                if (!var33_5) ** GOTO lbl641
                throw null;
            }
            case 244: {
                var32_6 /* !! */  = (int)ig.evza("exnf", evzk(int ), (int)493);
                if (!var33_5) ** GOTO lbl762
                throw null;
            }
lbl1447:
            // 5 sources

            case 245: {
                var32_6 /* !! */  = (int)ig.evza("exng", evzk(int ), (int)494);
                if (!var33_5) ** GOTO lbl1065
                throw null;
            }
lbl1451:
            // 2 sources

            case 246: {
                var32_6 /* !! */  = (int)ig.evza("exnh", evzk(int ), (int)495);
                if (!var33_5) ** GOTO lbl561
                throw null;
            }
            case 247: 
        }
        var32_6 /* !! */  = (int)ig.evza("exni", evzk(int ), (int)496);
        ** while (!var33_5)
lbl1458:
        // 1 sources

        throw null;
    }
}

