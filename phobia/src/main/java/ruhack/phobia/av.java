/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_332;
import ruhack.phobia.aj;
import ruhack.phobia.ar;
import ruhack.phobia.au;
import ruhack.phobia.av$HudPosition;
import ruhack.phobia.cr;
import ruhack.phobia.dv;
import ruhack.phobia.dw;
import ruhack.phobia.dx;
import ruhack.phobia.dy;
import ruhack.phobia.dz;
import ruhack.phobia.ea;
import ruhack.phobia.ec;
import ruhack.phobia.ed;
import ruhack.phobia.ee;
import ruhack.phobia.ef;
import ruhack.phobia.eg;
import ruhack.phobia.ki;

public class av {
    private static int[] dbwn = new int[615];
    protected static final long hd = -437573143025302170L;
    public static final boolean c;
    private static long[] dbwj;
    private eg watermark;
    public static final boolean a;
    private final List<au> elements;
    public static final int b;
    private long activeViewportKey;
    private static long[] dbwi;
    private final Map<Long, Map<String, av$HudPosition>> viewportLayouts;
    private static int[] dbwo;
    private boolean initialized;
    private boolean watermarkRenderedBelowPlayerList;

    private static /* synthetic */ void ddir() {
        av.dbwo[200] = -140470442;
        av.dbwo[201] = 1564343491;
        av.dbwo[202] = -1109445770;
        av.dbwo[203] = 1965086020;
        av.dbwo[204] = -1819207367;
        av.dbwo[205] = -1042692131;
        av.dbwo[206] = 1772597553;
        av.dbwo[207] = -776237421;
        av.dbwo[208] = -792722141;
        av.dbwo[209] = 1905218907;
        av.dbwo[210] = -85081081;
        av.dbwo[211] = -1254235030;
        av.dbwo[212] = -2057059616;
        av.dbwo[213] = 1432689747;
        av.dbwo[214] = -348815383;
        av.dbwo[215] = -303234762;
        av.dbwo[216] = 2094100392;
        av.dbwo[217] = 736323242;
        av.dbwo[218] = 522885499;
        av.dbwo[219] = 1468976520;
        av.dbwo[220] = 306795662;
        av.dbwo[221] = -1286754887;
        av.dbwo[222] = -2081222496;
        av.dbwo[223] = -1355707928;
        av.dbwo[224] = -84121937;
        av.dbwo[225] = -590990085;
        av.dbwo[226] = 214590961;
        av.dbwo[227] = -128431572;
        av.dbwo[228] = -205251062;
        av.dbwo[229] = 1708819527;
        av.dbwo[230] = -957978521;
        av.dbwo[231] = 1948427504;
        av.dbwo[232] = 1649122902;
        av.dbwo[233] = -111035851;
        av.dbwo[234] = 1297602198;
        av.dbwo[235] = 1045080903;
        av.dbwo[236] = 1482806868;
        av.dbwo[237] = -2058518791;
        av.dbwo[238] = 1994633784;
        av.dbwo[239] = 1299439469;
        av.dbwo[240] = -1265414044;
        av.dbwo[241] = -1314644529;
        av.dbwo[242] = -1279268192;
        av.dbwo[243] = -187766248;
        av.dbwo[244] = 1801316356;
        av.dbwo[245] = 1313433132;
        av.dbwo[246] = -94373926;
        av.dbwo[247] = -943062836;
        av.dbwo[248] = 581686166;
        av.dbwo[249] = -1612458292;
        av.dbwo[250] = -1628800823;
        av.dbwo[251] = -1739750238;
        av.dbwo[252] = 470252604;
        av.dbwo[253] = 1520102312;
        av.dbwo[254] = -743332281;
        av.dbwo[255] = 960728759;
        av.dbwo[256] = -1151917707;
        av.dbwo[257] = -1542389083;
        av.dbwo[258] = -1737950684;
        av.dbwo[259] = -476654797;
        av.dbwo[260] = -582002318;
        av.dbwo[261] = 34238707;
        av.dbwo[262] = 68120264;
        av.dbwo[263] = 783524194;
        av.dbwo[264] = -1806884769;
        av.dbwo[265] = 2031526678;
        av.dbwo[266] = 2133886228;
        av.dbwo[267] = -1586799556;
        av.dbwo[268] = -593969147;
        av.dbwo[269] = 928421977;
        av.dbwo[270] = -796797122;
        av.dbwo[271] = -526734836;
        av.dbwo[272] = 1146931232;
        av.dbwo[273] = 937223335;
        av.dbwo[274] = 310816008;
        av.dbwo[275] = 154163202;
        av.dbwo[276] = 1316742387;
        av.dbwo[277] = 1946098000;
        av.dbwo[278] = 2140914759;
        av.dbwo[279] = 941462792;
        av.dbwo[280] = -1628451297;
        av.dbwo[281] = -464119523;
        av.dbwo[282] = -1139062835;
        av.dbwo[283] = 358009878;
        av.dbwo[284] = 196981869;
        av.dbwo[285] = 2082401481;
        av.dbwo[286] = 1348959431;
        av.dbwo[287] = -229158971;
        av.dbwo[288] = 1805469642;
        av.dbwo[289] = 963635888;
        av.dbwo[290] = 788240786;
        av.dbwo[291] = 1902912966;
        av.dbwo[292] = 118516649;
        av.dbwo[293] = -539957003;
        av.dbwo[294] = -74128216;
        av.dbwo[295] = -2146668276;
        av.dbwo[296] = 1079037608;
        av.dbwo[297] = 489046012;
        av.dbwo[298] = 449655651;
        av.dbwo[299] = 1653161497;
    }

    private static /* synthetic */ void ddiu() {
        av.dbwo[500] = -959220430;
        av.dbwo[501] = -2111249180;
        av.dbwo[502] = -684110697;
        av.dbwo[503] = 1020864406;
        av.dbwo[504] = 1136896336;
        av.dbwo[505] = -342709886;
        av.dbwo[506] = 358767274;
        av.dbwo[507] = -1143978665;
        av.dbwo[508] = -2081154783;
        av.dbwo[509] = 374220230;
        av.dbwo[510] = -1797173100;
        av.dbwo[511] = 416752205;
        av.dbwo[512] = -1156619268;
        av.dbwo[513] = -1963924385;
        av.dbwo[514] = 1572000390;
        av.dbwo[515] = -2066844122;
        av.dbwo[516] = -1338628191;
        av.dbwo[517] = -595869828;
        av.dbwo[518] = -493934544;
        av.dbwo[519] = 374446408;
        av.dbwo[520] = 1785324102;
        av.dbwo[521] = 1995421403;
        av.dbwo[522] = 223048185;
        av.dbwo[523] = 1172026916;
        av.dbwo[524] = 1069283866;
        av.dbwo[525] = 1775920217;
        av.dbwo[526] = 768069911;
        av.dbwo[527] = -1710016763;
        av.dbwo[528] = -22922041;
        av.dbwo[529] = 1008959507;
        av.dbwo[530] = -476702244;
        av.dbwo[531] = -1867303523;
        av.dbwo[532] = 243362890;
        av.dbwo[533] = 282396557;
        av.dbwo[534] = -1782366744;
        av.dbwo[535] = 280191049;
        av.dbwo[536] = -1309349646;
        av.dbwo[537] = 1634455941;
        av.dbwo[538] = -398613048;
        av.dbwo[539] = -723883358;
        av.dbwo[540] = 379572116;
        av.dbwo[541] = 366388662;
        av.dbwo[542] = -1511276751;
        av.dbwo[543] = 1981580625;
        av.dbwo[544] = 1691886151;
        av.dbwo[545] = -766571467;
        av.dbwo[546] = -619287979;
        av.dbwo[547] = 1470526533;
        av.dbwo[548] = 1745025788;
        av.dbwo[549] = -857906480;
        av.dbwo[550] = 1217043317;
        av.dbwo[551] = 360771123;
        av.dbwo[552] = 1287273100;
        av.dbwo[553] = -326959331;
        av.dbwo[554] = 730606512;
        av.dbwo[555] = -1401248038;
        av.dbwo[556] = 831841131;
        av.dbwo[557] = 408030016;
        av.dbwo[558] = -1951068175;
        av.dbwo[559] = 10472423;
        av.dbwo[560] = 1073159845;
        av.dbwo[561] = 2029093730;
        av.dbwo[562] = 970862011;
        av.dbwo[563] = -2014119807;
        av.dbwo[564] = 2127798634;
        av.dbwo[565] = 64620268;
        av.dbwo[566] = -1326897590;
        av.dbwo[567] = -905245798;
        av.dbwo[568] = 1692362445;
        av.dbwo[569] = 1827801329;
        av.dbwo[570] = -1950797832;
        av.dbwo[571] = 1317506952;
        av.dbwo[572] = -912211512;
        av.dbwo[573] = 1742214123;
        av.dbwo[574] = -1936350750;
        av.dbwo[575] = 1051428563;
        av.dbwo[576] = 1942948739;
        av.dbwo[577] = -606006103;
        av.dbwo[578] = -390654517;
        av.dbwo[579] = 1394061904;
        av.dbwo[580] = -1626836523;
        av.dbwo[581] = 62644360;
        av.dbwo[582] = 2070561855;
        av.dbwo[583] = 345678958;
        av.dbwo[584] = 792177162;
        av.dbwo[585] = 1930062561;
        av.dbwo[586] = -1388183813;
        av.dbwo[587] = -1080150577;
        av.dbwo[588] = -1386509337;
        av.dbwo[589] = 1817468353;
        av.dbwo[590] = -545002100;
        av.dbwo[591] = -769708262;
        av.dbwo[592] = -1543579414;
        av.dbwo[593] = -2017588769;
        av.dbwo[594] = -1869483979;
        av.dbwo[595] = 496319503;
        av.dbwo[596] = 298759125;
        av.dbwo[597] = 1378476490;
        av.dbwo[598] = -573813483;
        av.dbwo[599] = 503217115;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void saveViewportLayout(long var1_1) {
        block76: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("ddbn", dbwh(int ), (int)274)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == av.dbwk("ddbo", dbwm(int ), (int)503)) break;
                v0 /* !! */  = (long)av.dbwk("ddbp", dbwm(int ), (int)504);
            }
            var8_2 = av.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("ddbq", dbwh(int ), (int)275)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == av.dbwk("ddbr", dbwm(int ), (int)505)) break;
                v1 /* !! */  = (long)av.dbwk("ddbs", dbwm(int ), (int)506);
            }
            var7_3 = av.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("ddbt", dbwh(int ), (int)276)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == av.dbwk("ddbu", dbwm(int ), (int)507)) break;
                v2 /* !! */  = (long)av.dbwk("ddbv", dbwm(int ), (int)508);
            }
            var6_4 = av.a;
            if (var8_2) {
                throw null;
lbl21:
                // 9 sources

                return;
            }
            if (var6_4 || var6_4) ** GOTO lbl21
            v3 /* !! */  = av.hd;
            if (true) ** GOTO lbl28
            block59: while (true) {
                v3 /* !! */  = (long)(v4 - av.dbwk("ddbw", dbwh(int ), (int)277));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -973589996: {
                        v4 = av.dbwk("ddbx", dbwh(int ), (int)278);
                        continue block59;
                    }
                    case 1324448222: {
                        v4 = av.dbwk("ddby", dbwh(int ), (int)279);
                        continue block59;
                    }
                    case 1991886182: {
                        break block59;
                    }
                }
                break;
            }
            v5 /* !! */  = av.hd;
            if (true) ** GOTO lbl41
            block60: while (true) {
                v5 /* !! */  = (long)(av.dbwk("ddca", dbwh(int ), (int)281) - av.dbwk("ddbz", dbwh(int ), (int)280));
lbl41:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 648784082: {
                        continue block60;
                    }
                    case 1991886182: {
                        break block60;
                    }
                }
                break;
            }
            var3_5 = new HashMap<String, av$HudPosition>();
            if (var6_4 || var6_4) ** GOTO lbl21
            v6 /* !! */  = av.hd;
            if (true) ** GOTO lbl52
            block61: while (true) {
                v6 /* !! */  = (long)(v7 - av.dbwk("ddcb", dbwh(int ), (int)282));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1168296999: {
                        v7 = av.dbwk("ddcc", dbwh(int ), (int)283);
                        continue block61;
                    }
                    case 1991886182: {
                        break block61;
                    }
                    case 2099363349: {
                        v7 = av.dbwk("ddcd", dbwh(int ), (int)284);
                        continue block61;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = av.hd - av.dbwk("ddce", dbwh(int ), (int)285)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == av.dbwk("ddcf", dbwm(int ), (int)509)) break;
                v8 /* !! */  = (long)av.dbwk("ddcg", dbwm(int ), (int)510);
            }
            var4_6 = this.elements.iterator();
            if (var6_4) ** GOTO lbl21
            do {
                if (var6_4 || var6_4) ** GOTO lbl21
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = av.hd - av.dbwk("ddch", dbwh(int ), (int)286)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == av.dbwk("ddci", dbwm(int ), (int)511)) break;
                    v9 /* !! */  = (long)av.dbwk("ddcj", dbwm(int ), (int)512);
                }
                if (!var4_6.hasNext()) break block76;
                if (var6_4) ** GOTO lbl21
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = av.hd - av.dbwk("ddck", dbwh(int ), (int)287)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == av.dbwk("ddcl", dbwm(int ), (int)513)) break;
                    v10 /* !! */  = (long)av.dbwk("ddcm", dbwm(int ), (int)514);
                }
                var5_7 = var4_6.next();
                if (var6_4 || var6_4) ** GOTO lbl21
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_6 = av.hd - av.dbwk("ddcn", dbwh(int ), (int)288)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == av.dbwk("ddco", dbwm(int ), (int)515)) break;
                    v11 /* !! */  = (long)av.dbwk("ddcp", dbwm(int ), (int)516);
                }
                v12 = var5_7.getName();
                v13 /* !! */  = av.hd;
                if (true) ** GOTO lbl94
                block67: while (true) {
                    v13 /* !! */  = (long)(v14 - av.dbwk("ddcq", dbwh(int ), (int)289));
lbl94:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1190414093: {
                            v14 = av.dbwk("ddcr", dbwh(int ), (int)290);
                            continue block67;
                        }
                        case -831446024: {
                            v14 = av.dbwk("ddcs", dbwh(int ), (int)291);
                            continue block67;
                        }
                        case 1991886182: {
                            break block67;
                        }
                    }
                    break;
                }
                v15 /* !! */  = av.hd;
                if (true) ** GOTO lbl107
                block68: while (true) {
                    v15 /* !! */  = (long)(v16 - av.dbwk("ddct", dbwh(int ), (int)292));
lbl107:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -50938779: {
                            v16 = av.dbwk("ddcu", dbwh(int ), (int)293);
                            continue block68;
                        }
                        case 427425947: {
                            v16 = av.dbwk("ddcv", dbwh(int ), (int)294);
                            continue block68;
                        }
                        case 1757828014: {
                            v16 = av.dbwk("ddcw", dbwh(int ), (int)295);
                            continue block68;
                        }
                        case 1991886182: {
                            break block68;
                        }
                    }
                    break;
                }
                v17 = var5_7.getX();
                v18 /* !! */  = av.hd;
                if (true) ** GOTO lbl124
                block69: while (true) {
                    v18 /* !! */  = (long)(v19 - av.dbwk("ddcx", dbwh(int ), (int)296));
lbl124:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case 781070016: {
                            v19 = av.dbwk("ddcy", dbwh(int ), (int)297);
                            continue block69;
                        }
                        case 830916672: {
                            v19 = av.dbwk("ddcz", dbwh(int ), (int)298);
                            continue block69;
                        }
                        case 1549735550: {
                            v19 = av.dbwk("ddda", dbwh(int ), (int)299);
                            continue block69;
                        }
                        case 1991886182: {
                            break block69;
                        }
                    }
                    break;
                }
                v20 = var5_7.getY();
                v21 /* !! */  = av.hd;
                if (true) ** GOTO lbl141
                block70: while (true) {
                    v21 /* !! */  = (long)(v22 - av.dbwk("dddb", dbwh(int ), (int)300));
lbl141:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2010995659: {
                            v22 = av.dbwk("dddc", dbwh(int ), (int)301);
                            continue block70;
                        }
                        case 250642338: {
                            v22 = av.dbwk("dddd", dbwh(int ), (int)302);
                            continue block70;
                        }
                        case 1991886182: {
                            break block70;
                        }
                    }
                    break;
                }
                v23 = new av$HudPosition(v17, v20);
                v24 /* !! */  = av.hd;
                if (true) ** GOTO lbl155
                block71: while (true) {
                    v24 /* !! */  = (long)(v25 - av.dbwk("ddde", dbwh(int ), (int)303));
lbl155:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case 1323194237: {
                            v25 = av.dbwk("dddf", dbwh(int ), (int)304);
                            continue block71;
                        }
                        case 1750245436: {
                            v25 = av.dbwk("dddg", dbwh(int ), (int)305);
                            continue block71;
                        }
                        case 1991886182: {
                            break block71;
                        }
                    }
                    break;
                }
                var3_5.put(v12, v23);
                if (var6_4 || var6_4) ** GOTO lbl21
            } while (!var8_2);
            throw null;
        }
        if (var6_4 || var6_4) ** GOTO lbl21
        v26 /* !! */  = av.hd;
        if (true) ** GOTO lbl175
        block72: while (true) {
            v26 /* !! */  = (long)(av.dbwk("dddi", dbwh(int ), (int)307) - av.dbwk("dddh", dbwh(int ), (int)306));
lbl175:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case 66295895: {
                    continue block72;
                }
                case 1991886182: {
                    break block72;
                }
            }
            break;
        }
        v27 /* !! */  = av.hd;
        if (true) ** GOTO lbl184
        block73: while (true) {
            v27 /* !! */  = (long)(v28 - av.dbwk("dddj", dbwh(int ), (int)308));
lbl184:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -1661787769: {
                    v28 = av.dbwk("dddk", dbwh(int ), (int)309);
                    continue block73;
                }
                case -967218345: {
                    v28 = av.dbwk("dddl", dbwh(int ), (int)310);
                    continue block73;
                }
                case -34199682: {
                    v28 = av.dbwk("dddm", dbwh(int ), (int)311);
                    continue block73;
                }
                case 1991886182: {
                    break block73;
                }
            }
            break;
        }
        v29 = var1_1;
        v30 /* !! */  = av.hd;
        if (true) ** GOTO lbl201
        block74: while (true) {
            v30 /* !! */  = (long)(av.dbwk("dddo", dbwh(int ), (int)313) - av.dbwk("dddn", dbwh(int ), (int)312));
lbl201:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case -38901123: {
                    continue block74;
                }
                case 1991886182: {
                    break block74;
                }
            }
            break;
        }
        this.viewportLayouts.put(v29, var3_5);
        if (!var6_4 && !var6_4) ** break;
        ** while (true)
    }

    private static /* synthetic */ void ddil() {
        av.dbwn[300] = 1064358159;
        av.dbwn[301] = -110574867;
        av.dbwn[302] = 601291431;
        av.dbwn[303] = 740297615;
        av.dbwn[304] = -1180251521;
        av.dbwn[305] = -533632890;
        av.dbwn[306] = 1647971355;
        av.dbwn[307] = -342355098;
        av.dbwn[308] = -631746304;
        av.dbwn[309] = -154417285;
        av.dbwn[310] = -444814072;
        av.dbwn[311] = -935882459;
        av.dbwn[312] = 2011508786;
        av.dbwn[313] = -318648004;
        av.dbwn[314] = -835952931;
        av.dbwn[315] = -336074810;
        av.dbwn[316] = -1060258186;
        av.dbwn[317] = 278651347;
        av.dbwn[318] = 993531963;
        av.dbwn[319] = -1509323449;
        av.dbwn[320] = -2122191533;
        av.dbwn[321] = -735382877;
        av.dbwn[322] = -1543975991;
        av.dbwn[323] = 1564676610;
        av.dbwn[324] = -1533850523;
        av.dbwn[325] = 1476909916;
        av.dbwn[326] = -583077623;
        av.dbwn[327] = 1513925176;
        av.dbwn[328] = 1845855495;
        av.dbwn[329] = 463691739;
        av.dbwn[330] = 1405351373;
        av.dbwn[331] = 1538988405;
        av.dbwn[332] = 1721393319;
        av.dbwn[333] = 1564205614;
        av.dbwn[334] = 1851800748;
        av.dbwn[335] = -2008229393;
        av.dbwn[336] = 1289493617;
        av.dbwn[337] = -1737538508;
        av.dbwn[338] = -945141260;
        av.dbwn[339] = -601192393;
        av.dbwn[340] = 885334869;
        av.dbwn[341] = -632641119;
        av.dbwn[342] = -13862008;
        av.dbwn[343] = 541454419;
        av.dbwn[344] = 1725250456;
        av.dbwn[345] = -312526652;
        av.dbwn[346] = 551827160;
        av.dbwn[347] = 1974009930;
        av.dbwn[348] = -595010571;
        av.dbwn[349] = -19764513;
        av.dbwn[350] = -1589061596;
        av.dbwn[351] = -791409126;
        av.dbwn[352] = 811891372;
        av.dbwn[353] = 1041080759;
        av.dbwn[354] = 839488009;
        av.dbwn[355] = -1518007813;
        av.dbwn[356] = 1741733668;
        av.dbwn[357] = -1006506629;
        av.dbwn[358] = 319238894;
        av.dbwn[359] = -1583338666;
        av.dbwn[360] = 1744809478;
        av.dbwn[361] = 1432902081;
        av.dbwn[362] = 2018992858;
        av.dbwn[363] = -1428022134;
        av.dbwn[364] = 1642708700;
        av.dbwn[365] = 951109627;
        av.dbwn[366] = -1462862332;
        av.dbwn[367] = -726118018;
        av.dbwn[368] = -833903040;
        av.dbwn[369] = 1578388704;
        av.dbwn[370] = -900453701;
        av.dbwn[371] = -1349202748;
        av.dbwn[372] = -226327522;
        av.dbwn[373] = -777290279;
        av.dbwn[374] = 667083761;
        av.dbwn[375] = -980984210;
        av.dbwn[376] = 402345118;
        av.dbwn[377] = 626422740;
        av.dbwn[378] = -1726235348;
        av.dbwn[379] = 732254313;
        av.dbwn[380] = 795537377;
        av.dbwn[381] = 814493689;
        av.dbwn[382] = -592685753;
        av.dbwn[383] = -414012314;
        av.dbwn[384] = 1083404408;
        av.dbwn[385] = -315816507;
        av.dbwn[386] = 82110790;
        av.dbwn[387] = -1222655023;
        av.dbwn[388] = 1991824056;
        av.dbwn[389] = 711775630;
        av.dbwn[390] = -99780064;
        av.dbwn[391] = 1483299516;
        av.dbwn[392] = -650985296;
        av.dbwn[393] = 535074067;
        av.dbwn[394] = -995401301;
        av.dbwn[395] = 379126462;
        av.dbwn[396] = 640114135;
        av.dbwn[397] = -1639507686;
        av.dbwn[398] = 923181098;
        av.dbwn[399] = 197900190;
    }

    private static /* synthetic */ void ddiv() {
        av.dbwo[600] = -1029534611;
        av.dbwo[601] = -1541802910;
        av.dbwo[602] = -1870197879;
        av.dbwo[603] = -425508179;
        av.dbwo[604] = -886013057;
        av.dbwo[605] = 185211528;
        av.dbwo[606] = 946807247;
        av.dbwo[607] = -1856249720;
        av.dbwo[608] = -1110078685;
        av.dbwo[609] = -967652328;
        av.dbwo[610] = -1939711765;
        av.dbwo[611] = 1064010074;
        av.dbwo[612] = -1752643772;
        av.dbwo[613] = -986722281;
        av.dbwo[614] = 495389389;
    }

    private static /* synthetic */ int dbwm(int n2) {
        return dbwn[n2] ^ dbwo[n2];
    }

    private static /* synthetic */ void ddiz() {
        av.dbwi[300] = 2648631270777474679L;
        av.dbwi[301] = 463619311810727172L;
        av.dbwi[302] = -8878970975604295260L;
        av.dbwi[303] = 8699845541104454063L;
        av.dbwi[304] = -4495611133362961147L;
        av.dbwi[305] = 7481139494964786111L;
        av.dbwi[306] = -5267926203825096979L;
        av.dbwi[307] = -4240432947533147786L;
        av.dbwi[308] = -8841869987710682974L;
        av.dbwi[309] = -6491289292309456761L;
        av.dbwi[310] = 2193620383868578387L;
        av.dbwi[311] = -5709673065875094987L;
        av.dbwi[312] = -569422626708839189L;
        av.dbwi[313] = 4185294019001868754L;
        av.dbwi[314] = 1076504386103963501L;
        av.dbwi[315] = -4857638919733992786L;
        av.dbwi[316] = 6600159897637624137L;
        av.dbwi[317] = -741781766330793371L;
        av.dbwi[318] = 6626773221618718946L;
        av.dbwi[319] = 175063253040621821L;
        av.dbwi[320] = -4516928121420847132L;
        av.dbwi[321] = -5137928568965126930L;
        av.dbwi[322] = 7734642105394548236L;
        av.dbwi[323] = 3459327144492545144L;
        av.dbwi[324] = 8198138037652210654L;
        av.dbwi[325] = -7318689898092441589L;
        av.dbwi[326] = -823188131608985090L;
        av.dbwi[327] = -6855605107529232708L;
        av.dbwi[328] = -1135477109813271513L;
        av.dbwi[329] = -7907193468166294876L;
        av.dbwi[330] = -6939315706213640125L;
        av.dbwi[331] = 2616246707228635090L;
        av.dbwi[332] = -3694354553468461868L;
        av.dbwi[333] = 2016655007303233646L;
        av.dbwi[334] = 4755909143350508928L;
        av.dbwi[335] = -7362837981277963815L;
        av.dbwi[336] = -7530507554607290028L;
        av.dbwi[337] = 9040916893555549611L;
        av.dbwi[338] = -8782498803482296234L;
    }

    static {
        dbwo = new int[615];
        av.ddii();
        av.ddij();
        av.ddik();
        av.ddil();
        av.ddim();
        av.ddin();
        av.ddio();
        av.ddip();
        av.ddiq();
        av.ddir();
        av.ddis();
        av.ddit();
        av.ddiu();
        av.ddiv();
        dbwi = new long[339];
        dbwj = new long[339];
        av.ddiw();
        av.ddix();
        av.ddiy();
        av.ddiz();
        av.ddja();
        av.ddjb();
        av.ddjc();
        av.ddjd();
    }

    private static /* synthetic */ void ddjb() {
        av.dbwj[100] = -3782184709167131916L;
        av.dbwj[101] = 4117364819339289266L;
        av.dbwj[102] = -2299115297835722563L;
        av.dbwj[103] = -7992166581093900837L;
        av.dbwj[104] = 4365307826473585954L;
        av.dbwj[105] = 4265502842622703043L;
        av.dbwj[106] = -3624027980930825251L;
        av.dbwj[107] = 7093259578981809596L;
        av.dbwj[108] = -5689727166902841531L;
        av.dbwj[109] = 4539843939817524237L;
        av.dbwj[110] = 7262551805345880099L;
        av.dbwj[111] = -2008659891769062358L;
        av.dbwj[112] = 8608386688049709453L;
        av.dbwj[113] = 7783908849122267442L;
        av.dbwj[114] = -2015701507415353822L;
        av.dbwj[115] = 709295182281802767L;
        av.dbwj[116] = -3372952660825143707L;
        av.dbwj[117] = 3812680220408268590L;
        av.dbwj[118] = 8258505594105900777L;
        av.dbwj[119] = 1060892551080629578L;
        av.dbwj[120] = 1724981617945763362L;
        av.dbwj[121] = -4825925429008487660L;
        av.dbwj[122] = -107211467125951097L;
        av.dbwj[123] = -7935531458290949715L;
        av.dbwj[124] = 2449762245685391900L;
        av.dbwj[125] = -8584505414883253937L;
        av.dbwj[126] = 4766642612320801395L;
        av.dbwj[127] = -4802249079428332395L;
        av.dbwj[128] = -1636055879964096885L;
        av.dbwj[129] = 227539971257117474L;
        av.dbwj[130] = 7048458595527011269L;
        av.dbwj[131] = 1932993193633798090L;
        av.dbwj[132] = -7535476582007539423L;
        av.dbwj[133] = -4870545944084235590L;
        av.dbwj[134] = -8071017204901720804L;
        av.dbwj[135] = 7605417487010792841L;
        av.dbwj[136] = 3726102315616608737L;
        av.dbwj[137] = 2804864805006934031L;
        av.dbwj[138] = 7878431595222622784L;
        av.dbwj[139] = -7066404717307814008L;
        av.dbwj[140] = 1431925571105714848L;
        av.dbwj[141] = 6780405165493113869L;
        av.dbwj[142] = 4054968325712910326L;
        av.dbwj[143] = -5475982897404947905L;
        av.dbwj[144] = -4812983578389126858L;
        av.dbwj[145] = -1972166346537677083L;
        av.dbwj[146] = -1463672147437100870L;
        av.dbwj[147] = 7834714330743934000L;
        av.dbwj[148] = 3467526215575834582L;
        av.dbwj[149] = 1853938840620964528L;
        av.dbwj[150] = 4088060932911756716L;
        av.dbwj[151] = 7832277385163410021L;
        av.dbwj[152] = -9190848208465914018L;
        av.dbwj[153] = 5120693923264533346L;
        av.dbwj[154] = 1982570424628401760L;
        av.dbwj[155] = 224501992880108787L;
        av.dbwj[156] = 6746468636835325665L;
        av.dbwj[157] = -4294660877558572363L;
        av.dbwj[158] = 3498574098791619232L;
        av.dbwj[159] = 5974132311411726410L;
        av.dbwj[160] = -3164313712303976097L;
        av.dbwj[161] = 5838645229901204133L;
        av.dbwj[162] = 6339301304736107322L;
        av.dbwj[163] = 5650299717422591500L;
        av.dbwj[164] = -5227382864516387002L;
        av.dbwj[165] = 7355226899001810988L;
        av.dbwj[166] = 5277658796274523409L;
        av.dbwj[167] = -2077709493202771941L;
        av.dbwj[168] = -2716802755675551129L;
        av.dbwj[169] = 1316176129993916308L;
        av.dbwj[170] = -8344348246268541521L;
        av.dbwj[171] = -1240518535218960997L;
        av.dbwj[172] = -3514356037729109355L;
        av.dbwj[173] = 3735787611204665217L;
        av.dbwj[174] = -1640145687123416632L;
        av.dbwj[175] = 2570285941256238999L;
        av.dbwj[176] = 8768235396032154394L;
        av.dbwj[177] = -9171720955880872384L;
        av.dbwj[178] = 7187895731600791231L;
        av.dbwj[179] = -45666358100220903L;
        av.dbwj[180] = -2608613643611730153L;
        av.dbwj[181] = -5025926468691352270L;
        av.dbwj[182] = 6273088343667639484L;
        av.dbwj[183] = -6416145166293338278L;
        av.dbwj[184] = 8837137134111279501L;
        av.dbwj[185] = 6909149428889563675L;
        av.dbwj[186] = -5944924142713001948L;
        av.dbwj[187] = 1026250713399403321L;
        av.dbwj[188] = 7559279661820137154L;
        av.dbwj[189] = 2946636364609025969L;
        av.dbwj[190] = 6568094810211818679L;
        av.dbwj[191] = 3697533639948715695L;
        av.dbwj[192] = 7046967828080668186L;
        av.dbwj[193] = -3407075130123035583L;
        av.dbwj[194] = -5110481402521301019L;
        av.dbwj[195] = -7734910275508026L;
        av.dbwj[196] = -8127560080943894272L;
        av.dbwj[197] = -5386253862182222801L;
        av.dbwj[198] = 4101961967355577592L;
        av.dbwj[199] = 5482354517578012857L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void renderWatermarkBelowPlayerList(class_332 var1_1, float var2_2) {
        block73: {
            var8_3 = av.c;
            var7_4 /* !! */  = av.b;
            var6_5 = av.a;
            if (var8_3) {
                throw null;
lbl6:
                // 20 sources

                return;
            }
            if (var6_5 || var6_5) ** GOTO lbl6
            var3_6 = dy.getInstance();
            if (var6_5 || var6_5) ** GOTO lbl6
            if (this.watermarkRenderedBelowPlayerList) break block73;
            if (var6_5) ** GOTO lbl6
            if (var3_6 == null) break block73;
            if (var6_5) ** GOTO lbl6
            if (!var3_6.isState()) break block73;
            if (var6_5) ** GOTO lbl6
            if (this.watermark == null) break block73;
            if (var6_5) ** GOTO lbl6
            if (!this.isElementEnabled(this.watermark, var3_6)) break block73;
            if (var6_5) ** GOTO lbl6
            if (this.watermark.visible()) ** GOTO lbl29
            if (var6_5) ** GOTO lbl6
        }
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_5 || var6_5) ** GOTO lbl6
                return;
            }
lbl29:
            // 1 sources

            if (var6_5 || var6_5) ** GOTO lbl6
            var4_7 = var3_6.getInterfaceScale();
            if (var6_5 || var6_5) ** GOTO lbl6
            this.syncViewportLayout(var4_7);
            if (var6_5 || var6_5) ** GOTO lbl6
            this.watermarkRenderedBelowPlayerList = av.dbwk("dcbu", dbwm(int ), (int)97);
            if (var6_5 || var6_5) ** GOTO lbl6
            dz.beginFrame();
            if (var6_5) ** GOTO lbl6
            try {
                if (var6_5) ** GOTO lbl6
                ki.withContextScale(var4_7, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$renderWatermarkBelowPlayerList$1(float net.minecraft.class_332 float ), ()V)((av)this, (float)var4_7, (class_332)var1_1, (float)var2_2));
                if (var6_5 || var6_5) ** GOTO lbl6
            }
            catch (Throwable var5_8) {
                if (var6_5 || var6_5) ** GOTO lbl6
                dz.endFrame();
                if (var6_5 || var6_5) ** GOTO lbl6
                throw var5_8;
            }
            dz.endFrame();
            if (var6_5 || var6_5) ** GOTO lbl6
            if (var8_3) {
                throw null;
            }
            if (!var6_5 && !var6_5) ** break;
            ** continue;
            return;
            case 0: {
                var7_4 /* !! */  = (int)av.dbwk("dcbv", dbwm(int ), (int)98);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl128
            }
            case 1: {
                var7_4 /* !! */  = (int)av.dbwk("dcbw", dbwm(int ), (int)99);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl65:
            // 3 sources

            case 2: {
                var7_4 /* !! */  = (int)av.dbwk("dcbx", dbwm(int ), (int)100);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl70:
            // 2 sources

            case 3: {
                var7_4 /* !! */  = (int)av.dbwk("dcby", dbwm(int ), (int)101);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl75:
            // 2 sources

            case 4: {
                var7_4 /* !! */  = (int)av.dbwk("dcbz", dbwm(int ), (int)102);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 5: {
                var7_4 /* !! */  = (int)av.dbwk("dcca", dbwm(int ), (int)103);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 6: {
                var7_4 /* !! */  = (int)av.dbwk("dccb", dbwm(int ), (int)104);
                if (!var8_3) ** GOTO lbl75
                throw null;
            }
            case 7: {
                var7_4 /* !! */  = (int)av.dbwk("dccc", dbwm(int ), (int)105);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 8: {
                var7_4 /* !! */  = (int)av.dbwk("dccd", dbwm(int ), (int)106);
                if (!var8_3) ** GOTO lbl70
                throw null;
            }
lbl98:
            // 2 sources

            case 9: {
                var7_4 /* !! */  = (int)av.dbwk("dcce", dbwm(int ), (int)107);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl103:
            // 2 sources

            case 10: {
                var7_4 /* !! */  = (int)av.dbwk("dccf", dbwm(int ), (int)108);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl108:
            // 2 sources

            case 11: {
                var7_4 /* !! */  = (int)av.dbwk("dccg", dbwm(int ), (int)109);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl113:
            // 3 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_4 /* !! */  = (int)av.dbwk("dcch", dbwm(int ), (int)110);
                    if (var8_3) {
                        throw null;
                    }
                    ** GOTO lbl200
                    break;
                }
            }
            case 13: {
                var7_4 /* !! */  = (int)av.dbwk("dcci", dbwm(int ), (int)111);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl124:
            // 4 sources

            case 14: {
                var7_4 /* !! */  = (int)av.dbwk("dccj", dbwm(int ), (int)112);
                if (!var8_3) ** GOTO lbl65
                throw null;
            }
lbl128:
            // 2 sources

            case 15: {
                var7_4 /* !! */  = (int)av.dbwk("dcck", dbwm(int ), (int)113);
                if (!var8_3) ** GOTO lbl65
                throw null;
            }
            case 16: {
                var7_4 /* !! */  = (int)av.dbwk("dccl", dbwm(int ), (int)114);
                if (!var8_3) ** GOTO lbl113
                throw null;
            }
lbl136:
            // 3 sources

            case 17: {
                var7_4 /* !! */  = (int)av.dbwk("dccm", dbwm(int ), (int)115);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl141:
            // 2 sources

            case 18: {
                var7_4 /* !! */  = (int)av.dbwk("dccn", dbwm(int ), (int)116);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 19: {
                var7_4 /* !! */  = (int)av.dbwk("dcco", dbwm(int ), (int)117);
                if (!var8_3) ** GOTO lbl124
                throw null;
            }
            case 20: {
                var7_4 /* !! */  = (int)av.dbwk("dccp", dbwm(int ), (int)118);
                if (!var8_3) ** GOTO lbl108
                throw null;
            }
            case 21: {
                var7_4 /* !! */  = (int)av.dbwk("dccq", dbwm(int ), (int)119);
                if (!var8_3) ** GOTO lbl103
                throw null;
            }
lbl158:
            // 2 sources

            case 22: {
                var7_4 /* !! */  = (int)av.dbwk("dccr", dbwm(int ), (int)120);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 23: {
                var7_4 /* !! */  = (int)av.dbwk("dccs", dbwm(int ), (int)121);
                if (!var8_3) ** GOTO lbl98
                throw null;
            }
lbl167:
            // 4 sources

            case 24: {
                var7_4 /* !! */  = (int)av.dbwk("dcct", dbwm(int ), (int)122);
                if (!var8_3) ** GOTO lbl136
                throw null;
            }
            case 25: {
                var7_4 /* !! */  = (int)av.dbwk("dccu", dbwm(int ), (int)123);
                if (!var8_3) break;
                throw null;
            }
lbl175:
            // 2 sources

            case 26: {
                var7_4 /* !! */  = (int)av.dbwk("dccv", dbwm(int ), (int)124);
                if (var8_3) {
                    throw null;
                }
            }
lbl179:
            // 4 sources

            case 27: {
                var7_4 /* !! */  = (int)av.dbwk("dccw", dbwm(int ), (int)125);
                if (var8_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 28: {
                var7_4 /* !! */  = (int)av.dbwk("dccx", dbwm(int ), (int)126);
                if (!var8_3) ** GOTO lbl141
                throw null;
            }
lbl188:
            // 4 sources

            case 29: {
                var7_4 /* !! */  = (int)av.dbwk("dccy", dbwm(int ), (int)127);
                if (!var8_3) ** GOTO lbl124
                throw null;
            }
lbl192:
            // 3 sources

            case 30: {
                var7_4 /* !! */  = (int)av.dbwk("dccz", dbwm(int ), (int)128);
                if (!var8_3) ** GOTO lbl167
                throw null;
            }
            case 31: {
                var7_4 /* !! */  = (int)av.dbwk("dcda", dbwm(int ), (int)129);
                if (!var8_3) break;
                throw null;
            }
lbl200:
            // 3 sources

            case 32: {
                var7_4 /* !! */  = (int)av.dbwk("dcdb", dbwm(int ), (int)130);
                if (!var8_3) ** GOTO lbl175
                throw null;
            }
lbl204:
            // 2 sources

            case 33: {
                do {
                    var7_4 /* !! */  = (int)av.dbwk("dcdc", dbwm(int ), (int)131);
                } while (!var8_3);
                throw null;
            }
            case 34: 
        }
        var7_4 /* !! */  = (int)av.dbwk("dcdd", dbwm(int ), (int)132);
        ** while (!var8_3)
lbl212:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isInitialized() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcsj", dbwh(int ), (int)182)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == av.dbwk("dcsk", dbwm(int ), (int)359)) break;
            v0 /* !! */  = (long)av.dbwk("dcsl", dbwm(int ), (int)360);
        }
        var3_1 = av.c;
        v1 /* !! */  = av.hd;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - av.dbwk("dcsm", dbwh(int ), (int)183));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1762693271: {
                    v2 = av.dbwk("dcsn", dbwh(int ), (int)184);
                    continue block18;
                }
                case 1435203771: {
                    v2 = av.dbwk("dcso", dbwh(int ), (int)185);
                    continue block18;
                }
                case 1955436626: {
                    v2 = av.dbwk("dcsp", dbwh(int ), (int)186);
                    continue block18;
                }
                case 1991886182: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = av.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = av.hd;
                if (true) ** GOTO lbl32
                block19: while (true) {
                    v3 /* !! */  = (long)(v4 - av.dbwk("dcsq", dbwh(int ), (int)187));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 532559461: {
                            v4 = av.dbwk("dcsr", dbwh(int ), (int)188);
                            continue block19;
                        }
                        case 1117779476: {
                            v4 = av.dbwk("dcss", dbwh(int ), (int)189);
                            continue block19;
                        }
                        case 1991886182: {
                            break block19;
                        }
                    }
                    break;
                }
                var1_3 = av.a;
                if (var3_1) {
                    throw null;
                    return (boolean)av.dbwk("dcst", dbwm(int ), (int)361);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcsu", dbwh(int ), (int)190)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == av.dbwk("dcsv", dbwm(int ), (int)362)) break;
                    v5 /* !! */  = (long)av.dbwk("dcsw", dbwm(int ), (int)363);
                }
                return this.initialized;
            }
lbl54:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)av.dbwk("dcsx", dbwm(int ), (int)364);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)av.dbwk("dcsy", dbwm(int ), (int)365);
                    if (!var3_1) ** GOTO lbl54
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)av.dbwk("dcsz", dbwm(int ), (int)366);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)av.dbwk("dcta", dbwm(int ), (int)367);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ddiw() {
        av.dbwi[0] = 1904094388466306778L;
        av.dbwi[1] = 8422691078245870596L;
        av.dbwi[2] = -7714232413371009180L;
        av.dbwi[3] = -1624363978203740552L;
        av.dbwi[4] = -8065971601689958009L;
        av.dbwi[5] = 7958618780625552311L;
        av.dbwi[6] = -1103460826306798621L;
        av.dbwi[7] = 2114426452872441106L;
        av.dbwi[8] = 547928207322252875L;
        av.dbwi[9] = 2465807732143196016L;
        av.dbwi[10] = -4246942177963030360L;
        av.dbwi[11] = 64805919899131409L;
        av.dbwi[12] = 5597279072859402339L;
        av.dbwi[13] = 103550168284378899L;
        av.dbwi[14] = 1858591049003181979L;
        av.dbwi[15] = -3618952487745405852L;
        av.dbwi[16] = 844394696071116148L;
        av.dbwi[17] = -5236171966075692888L;
        av.dbwi[18] = 1983744182457980720L;
        av.dbwi[19] = 6178781192611719659L;
        av.dbwi[20] = -263426345743398088L;
        av.dbwi[21] = -2175782089138873887L;
        av.dbwi[22] = 7660141543356868112L;
        av.dbwi[23] = -3871370992621864547L;
        av.dbwi[24] = 5306669408461997152L;
        av.dbwi[25] = 3668389516794422928L;
        av.dbwi[26] = 7961965481252703609L;
        av.dbwi[27] = 521114869105261145L;
        av.dbwi[28] = 974898525425513203L;
        av.dbwi[29] = 7294630417069901040L;
        av.dbwi[30] = -4612287340435073437L;
        av.dbwi[31] = -6332799859456662735L;
        av.dbwi[32] = 7872673584504818953L;
        av.dbwi[33] = 349836907954615390L;
        av.dbwi[34] = 48380757467782724L;
        av.dbwi[35] = -100865370819464151L;
        av.dbwi[36] = -8529510466663931738L;
        av.dbwi[37] = 3506943569798946471L;
        av.dbwi[38] = 6330658687303153406L;
        av.dbwi[39] = -6878062052444265106L;
        av.dbwi[40] = 4791443474424365014L;
        av.dbwi[41] = 8067386351586692098L;
        av.dbwi[42] = 2589715023012723490L;
        av.dbwi[43] = -9183717992157715538L;
        av.dbwi[44] = -2957673135499424839L;
        av.dbwi[45] = 3410495392796761892L;
        av.dbwi[46] = 2887896266593871883L;
        av.dbwi[47] = -5401520707827801776L;
        av.dbwi[48] = -3583770389683985954L;
        av.dbwi[49] = -4805410605945946527L;
        av.dbwi[50] = -5597513200476395518L;
        av.dbwi[51] = 4584663834546694082L;
        av.dbwi[52] = -5297459503912821970L;
        av.dbwi[53] = 1707715720192376006L;
        av.dbwi[54] = 6123746200027533727L;
        av.dbwi[55] = 1669857223323026042L;
        av.dbwi[56] = -3079795219978088241L;
        av.dbwi[57] = -4410831237918516508L;
        av.dbwi[58] = 6148505929870825036L;
        av.dbwi[59] = -7874231066173796195L;
        av.dbwi[60] = -8464563296989401140L;
        av.dbwi[61] = 4840159430618621742L;
        av.dbwi[62] = 8012340866355215343L;
        av.dbwi[63] = 1830726126877414731L;
        av.dbwi[64] = 2885457993400556340L;
        av.dbwi[65] = -4463760002043654874L;
        av.dbwi[66] = -8857572803683139841L;
        av.dbwi[67] = -5892573056364465630L;
        av.dbwi[68] = -6770889512950756113L;
        av.dbwi[69] = 2504039006855612355L;
        av.dbwi[70] = -24635922236673074L;
        av.dbwi[71] = 2366197698299123125L;
        av.dbwi[72] = 4525766240462022990L;
        av.dbwi[73] = -4240448238373130347L;
        av.dbwi[74] = -5738522395507228153L;
        av.dbwi[75] = -1308220787034740357L;
        av.dbwi[76] = 9180888744094106734L;
        av.dbwi[77] = 6263414654858417976L;
        av.dbwi[78] = 3086686225655483848L;
        av.dbwi[79] = 6737442625436139407L;
        av.dbwi[80] = 840811348863130128L;
        av.dbwi[81] = -968937864849814335L;
        av.dbwi[82] = 6860038563845415885L;
        av.dbwi[83] = 5709502965861108287L;
        av.dbwi[84] = 5363138310339947133L;
        av.dbwi[85] = -385102164943672139L;
        av.dbwi[86] = -4644132511404343149L;
        av.dbwi[87] = 2193936088334062490L;
        av.dbwi[88] = 3922978813019022154L;
        av.dbwi[89] = -2112687029197933374L;
        av.dbwi[90] = 2834956779916156145L;
        av.dbwi[91] = 1510518216836484331L;
        av.dbwi[92] = -1384217911960852665L;
        av.dbwi[93] = -1700632111829205141L;
        av.dbwi[94] = 3114691894540173720L;
        av.dbwi[95] = -3455504348834465100L;
        av.dbwi[96] = 4008040643982118532L;
        av.dbwi[97] = 8798684339272537302L;
        av.dbwi[98] = -6793421772396636380L;
        av.dbwi[99] = -6092478434092975863L;
    }

    private static /* synthetic */ void ddjd() {
        av.dbwj[300] = -5319098691682457743L;
        av.dbwj[301] = -8735191593524433413L;
        av.dbwj[302] = 7156547848841206717L;
        av.dbwj[303] = 263554236939069744L;
        av.dbwj[304] = -3294096607392454628L;
        av.dbwj[305] = 1666296852685560996L;
        av.dbwj[306] = -8736076115588477922L;
        av.dbwj[307] = -5309973584398469797L;
        av.dbwj[308] = 2697727965565678150L;
        av.dbwj[309] = 4649665765427595529L;
        av.dbwj[310] = 8762938904914117393L;
        av.dbwj[311] = -9033879770941224269L;
        av.dbwj[312] = 3918856758387876919L;
        av.dbwj[313] = -5021985048712632939L;
        av.dbwj[314] = -2127261384040733943L;
        av.dbwj[315] = -7048317864715645924L;
        av.dbwj[316] = -7297917663443039875L;
        av.dbwj[317] = 7369781195190752287L;
        av.dbwj[318] = -7496290645089447213L;
        av.dbwj[319] = -6177142177742259838L;
        av.dbwj[320] = 1047797039899014266L;
        av.dbwj[321] = -3991560597607936186L;
        av.dbwj[322] = -9008165327451607215L;
        av.dbwj[323] = 5397486525737159681L;
        av.dbwj[324] = 667729186743976212L;
        av.dbwj[325] = -6548020546472027823L;
        av.dbwj[326] = -3569341366830353719L;
        av.dbwj[327] = -6264301035735551180L;
        av.dbwj[328] = 29681987938007607L;
        av.dbwj[329] = 1820306684222089366L;
        av.dbwj[330] = -924112800575652200L;
        av.dbwj[331] = 8159784702450962731L;
        av.dbwj[332] = 925958804081816717L;
        av.dbwj[333] = 9026827909998709887L;
        av.dbwj[334] = 2840837051933843018L;
        av.dbwj[335] = 5198114252127860017L;
        av.dbwj[336] = -4579380647960364024L;
        av.dbwj[337] = -6953558559066833605L;
        av.dbwj[338] = 8332067333406433225L;
    }

    public static /* synthetic */ CallSite dbwk(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public List<au> getElements() {
        Object object = hd;
        boolean bl2 = true;
        block10: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - av.dbwk("dcrt", dbwh(int ), (int)174);
            }
            switch ((int)object) {
                case -3394172: {
                    callSite = av.dbwk("dcru", dbwh(int ), (int)175);
                    continue block10;
                }
                case 93092701: {
                    callSite = av.dbwk("dcrv", dbwh(int ), (int)176);
                    continue block10;
                }
                case 1213552862: {
                    callSite = av.dbwk("dcrw", dbwh(int ), (int)177);
                    continue block10;
                }
                case 1991886182: {
                    break block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = hd - av.dbwk("dcrx", dbwh(int ), (int)178)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == av.dbwk("dcry", dbwm(int ), (int)351)) break;
            object2 = av.dbwk("dcrz", dbwm(int ), (int)352);
        }
        int n2 = b;
        Object object3 = hd;
        block12: while (true) {
            switch ((int)object3) {
                case -67035517: {
                    object3 = av.dbwk("dcsb", dbwh(int ), (int)180) - av.dbwk("dcsa", dbwh(int ), (int)179);
                    continue block12;
                }
                case 1991886182: {
                    break block12;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl3) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        while (true) {
            long l3;
            Object object4;
            if ((object4 = (l3 = hd - av.dbwk("dcsc", dbwh(int ), (int)181)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object4 == av.dbwk("dcsd", dbwm(int ), (int)353)) {
                return this.elements;
            }
            object4 = av.dbwk("dcse", dbwm(int ), (int)354);
        }
    }

    private static /* synthetic */ void ddii() {
        av.dbwn[0] = -1670193005;
        av.dbwn[1] = -777878842;
        av.dbwn[2] = 910506593;
        av.dbwn[3] = 1084063095;
        av.dbwn[4] = -421820339;
        av.dbwn[5] = -211094736;
        av.dbwn[6] = -28848428;
        av.dbwn[7] = -256829469;
        av.dbwn[8] = 878929262;
        av.dbwn[9] = 753102734;
        av.dbwn[10] = 1738457013;
        av.dbwn[11] = 824689196;
        av.dbwn[12] = 460615348;
        av.dbwn[13] = -1460482607;
        av.dbwn[14] = 1985774590;
        av.dbwn[15] = -934832262;
        av.dbwn[16] = 60567897;
        av.dbwn[17] = -1278292837;
        av.dbwn[18] = -534361756;
        av.dbwn[19] = -486589163;
        av.dbwn[20] = -728581493;
        av.dbwn[21] = 2033220684;
        av.dbwn[22] = 1688619514;
        av.dbwn[23] = 1879629928;
        av.dbwn[24] = -638562136;
        av.dbwn[25] = -1156524744;
        av.dbwn[26] = -1378612727;
        av.dbwn[27] = -191401747;
        av.dbwn[28] = -1866022506;
        av.dbwn[29] = -1065555047;
        av.dbwn[30] = -1705056555;
        av.dbwn[31] = 116173645;
        av.dbwn[32] = -1403303945;
        av.dbwn[33] = -518752518;
        av.dbwn[34] = -2107009703;
        av.dbwn[35] = -368325827;
        av.dbwn[36] = -947237355;
        av.dbwn[37] = -1145265751;
        av.dbwn[38] = -2004125514;
        av.dbwn[39] = 614855822;
        av.dbwn[40] = 825135107;
        av.dbwn[41] = -1826575300;
        av.dbwn[42] = 1185532397;
        av.dbwn[43] = 1560870346;
        av.dbwn[44] = -127322732;
        av.dbwn[45] = -830400934;
        av.dbwn[46] = -1845789151;
        av.dbwn[47] = 353936772;
        av.dbwn[48] = -1197145869;
        av.dbwn[49] = -1517478898;
        av.dbwn[50] = 206064616;
        av.dbwn[51] = 1619050429;
        av.dbwn[52] = -58349881;
        av.dbwn[53] = -1069769715;
        av.dbwn[54] = 1127875075;
        av.dbwn[55] = 536884626;
        av.dbwn[56] = -1292819761;
        av.dbwn[57] = 989167642;
        av.dbwn[58] = 725338374;
        av.dbwn[59] = 1248252308;
        av.dbwn[60] = 1696666737;
        av.dbwn[61] = 1523577190;
        av.dbwn[62] = 579555066;
        av.dbwn[63] = -1682172777;
        av.dbwn[64] = 1999434041;
        av.dbwn[65] = 232354140;
        av.dbwn[66] = 2069355216;
        av.dbwn[67] = -1227760395;
        av.dbwn[68] = 496232864;
        av.dbwn[69] = -230886485;
        av.dbwn[70] = 1170432774;
        av.dbwn[71] = 960651853;
        av.dbwn[72] = 269589137;
        av.dbwn[73] = -188386962;
        av.dbwn[74] = 1099688572;
        av.dbwn[75] = 607230475;
        av.dbwn[76] = 1798704876;
        av.dbwn[77] = -844946103;
        av.dbwn[78] = -1225570530;
        av.dbwn[79] = 1092049581;
        av.dbwn[80] = -1296182012;
        av.dbwn[81] = 741009613;
        av.dbwn[82] = -684083218;
        av.dbwn[83] = -933704096;
        av.dbwn[84] = -2094060234;
        av.dbwn[85] = 1909089032;
        av.dbwn[86] = -882774801;
        av.dbwn[87] = 214764729;
        av.dbwn[88] = 1980601093;
        av.dbwn[89] = -1729953617;
        av.dbwn[90] = -96771091;
        av.dbwn[91] = -458101768;
        av.dbwn[92] = -918214334;
        av.dbwn[93] = -1461131914;
        av.dbwn[94] = -1491451529;
        av.dbwn[95] = -481075035;
        av.dbwn[96] = 75745157;
        av.dbwn[97] = -1253945895;
        av.dbwn[98] = -1754134819;
        av.dbwn[99] = -1208418602;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void initElements() {
        block65: {
            var3_1 = av.c;
            var2_2 /* !! */  = av.b;
            var1_3 = av.a;
            if (var3_1) {
                throw null;
lbl6:
                // 15 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl6
            if (!this.initialized) break block65;
            if (var1_3) ** GOTO lbl6
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        this.watermark = new eg();
        if (var1_3 || var1_3) ** GOTO lbl6
        this.register(this.watermark);
        if (var1_3 || var1_3) ** GOTO lbl6
        this.register(new ea());
        if (var1_3 || var1_3) ** GOTO lbl6
        this.register(new ee());
        if (var1_3 || var1_3) ** GOTO lbl6
        this.register(new ec());
        if (var1_3 || var1_3) ** GOTO lbl6
        this.register(new dx());
        if (var1_3 || var1_3) ** GOTO lbl6
        this.register(new dv());
        if (var1_3 || var1_3) ** GOTO lbl6
        this.register(new dw());
        if (var1_3 || var1_3) ** GOTO lbl6
        this.register(new ed());
        if (var1_3 || var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.register(new ef());
                if (var1_3 || var1_3) ** GOTO lbl6
                this.initialized = av.dbwk("dbwx", dbwm(int ), (int)8);
                if (var1_3 || var1_3) ** GOTO lbl6
                aj.getInstance().load();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl43:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)av.dbwk("dbwy", dbwm(int ), (int)9);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl67
            }
lbl48:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)av.dbwk("dbwz", dbwm(int ), (int)10);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 2: {
                var2_2 /* !! */  = (int)av.dbwk("dbxa", dbwm(int ), (int)11);
                if (var3_1) {
                    throw null;
                }
            }
lbl57:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)av.dbwk("dbxb", dbwm(int ), (int)12);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl62:
            // 2 sources

            case 4: {
                do {
                    var2_2 /* !! */  = (int)av.dbwk("dbxc", dbwm(int ), (int)13);
                } while (!var3_1);
                throw null;
            }
lbl67:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)av.dbwk("dbxd", dbwm(int ), (int)14);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)av.dbwk("dbxe", dbwm(int ), (int)15);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl76:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)av.dbwk("dbxf", dbwm(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl81:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)av.dbwk("dbxg", dbwm(int ), (int)17);
                if (!var3_1) ** GOTO lbl43
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)av.dbwk("dbxh", dbwm(int ), (int)18);
                if (!var3_1) ** GOTO lbl57
                throw null;
            }
lbl89:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)av.dbwk("dbxi", dbwm(int ), (int)19);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 11: {
                var2_2 /* !! */  = (int)av.dbwk("dbxj", dbwm(int ), (int)20);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)av.dbwk("dbxk", dbwm(int ), (int)21);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 13: {
                var2_2 /* !! */  = (int)av.dbwk("dbxl", dbwm(int ), (int)22);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 14: {
                var2_2 /* !! */  = (int)av.dbwk("dbxm", dbwm(int ), (int)23);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl113:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)av.dbwk("dbxn", dbwm(int ), (int)24);
                if (!var3_1) ** GOTO lbl81
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)av.dbwk("dbxo", dbwm(int ), (int)25);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl122:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)av.dbwk("dbxp", dbwm(int ), (int)26);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 18: {
                var2_2 /* !! */  = (int)av.dbwk("dbxq", dbwm(int ), (int)27);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl132:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)av.dbwk("dbxr", dbwm(int ), (int)28);
                if (!var3_1) ** GOTO lbl113
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)av.dbwk("dbxs", dbwm(int ), (int)29);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)av.dbwk("dbxt", dbwm(int ), (int)30);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl175
                    break;
                }
            }
lbl146:
            // 5 sources

            case 22: {
                var2_2 /* !! */  = (int)av.dbwk("dbxu", dbwm(int ), (int)31);
                if (!var3_1) ** GOTO lbl76
                throw null;
            }
lbl150:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)av.dbwk("dbxv", dbwm(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 24: {
                var2_2 /* !! */  = (int)av.dbwk("dbxw", dbwm(int ), (int)33);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
lbl159:
            // 3 sources

            case 25: {
                var2_2 /* !! */  = (int)av.dbwk("dbxx", dbwm(int ), (int)34);
                if (!var3_1) ** GOTO lbl76
                throw null;
            }
            case 26: {
                var2_2 /* !! */  = (int)av.dbwk("dbxy", dbwm(int ), (int)35);
                if (!var3_1) ** GOTO lbl150
                throw null;
            }
            case 27: {
                var2_2 /* !! */  = (int)av.dbwk("dbxz", dbwm(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
            }
            case 28: {
                var2_2 /* !! */  = (int)av.dbwk("dbya", dbwm(int ), (int)37);
                if (!var3_1) ** GOTO lbl48
                throw null;
            }
lbl175:
            // 5 sources

            case 29: {
                var2_2 /* !! */  = (int)av.dbwk("dbyb", dbwm(int ), (int)38);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
lbl179:
            // 2 sources

            case 30: {
                var2_2 /* !! */  = (int)av.dbwk("dbyc", dbwm(int ), (int)39);
                if (!var3_1) ** GOTO lbl159
                throw null;
            }
            case 31: 
        }
        var2_2 /* !! */  = (int)av.dbwk("dbyd", dbwm(int ), (int)40);
        ** while (!var3_1)
lbl186:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double toHudCoordinate(double var1_1) {
        v0 /* !! */  = av.hd;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(av.dbwk("dcud", dbwh(int ), (int)205) - av.dbwk("dcuc", dbwh(int ), (int)204));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1628174618: {
                    continue block19;
                }
                case 1991886182: {
                    break block19;
                }
            }
            break;
        }
        var5_2 = av.c;
        v1 /* !! */  = av.hd;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(av.dbwk("dcuf", dbwh(int ), (int)207) - av.dbwk("dcue", dbwh(int ), (int)206));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -136053179: {
                    continue block20;
                }
                case 1991886182: {
                    break block20;
                }
            }
            break;
        }
        var4_3 /* !! */  = av.b;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = av.hd;
                if (true) ** GOTO lbl28
                block21: while (true) {
                    v2 /* !! */  = (long)(v3 - av.dbwk("dcug", dbwh(int ), (int)208));
lbl28:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -551999664: {
                            v3 = av.dbwk("dcuh", dbwh(int ), (int)209);
                            continue block21;
                        }
                        case -165394407: {
                            v3 = av.dbwk("dcui", dbwh(int ), (int)210);
                            continue block21;
                        }
                        case 1991886182: {
                            break block21;
                        }
                    }
                    break;
                }
                var3_4 = av.a;
                if (var5_2) {
                    throw null;
                    return (double)av.dbwk("dcuk", dcuj(int ), (int)211);
                }
                if (var3_4 || var3_4) ** continue;
                v4 = av.dbwk("dcul", dctl(int ), (int)381);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcum", dbwh(int ), (int)212)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == av.dbwk("dcun", dbwm(int ), (int)382)) break;
                    v5 /* !! */  = (long)av.dbwk("dcuo", dbwm(int ), (int)383);
                }
                v6 = this.getHudScale();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcup", dbwh(int ), (int)213)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == av.dbwk("dcuq", dbwm(int ), (int)384)) break;
                    v7 /* !! */  = (long)av.dbwk("dcur", dbwm(int ), (int)385);
                }
                return var1_1 / (double)Math.max((float)v4, v6);
            }
            case 0: {
                do {
                    var4_3 /* !! */  = (int)av.dbwk("dcus", dbwm(int ), (int)386);
                } while (!var5_2);
                throw null;
            }
lbl61:
            // 2 sources

            case 1: {
                do {
                    var4_3 /* !! */  = (int)av.dbwk("dcut", dbwm(int ), (int)387);
                } while (!var5_2);
                throw null;
            }
            case 2: {
                var4_3 /* !! */  = (int)av.dbwk("dcuu", dbwm(int ), (int)388);
                if (!var5_2) ** GOTO lbl61
                throw null;
            }
            case 3: 
        }
        do {
            var4_3 /* !! */  = (int)av.dbwk("dcuv", dbwm(int ), (int)389);
        } while (!var5_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void resetLayout() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcmr", dbwh(int ), (int)129)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == av.dbwk("dcms", dbwm(int ), (int)290)) break;
            v0 /* !! */  = (long)av.dbwk("dcmt", dbwm(int ), (int)291);
        }
        var6_1 = av.c;
        v1 /* !! */  = av.hd;
        if (true) ** GOTO lbl11
        block65: while (true) {
            v1 /* !! */  = (long)(v2 - av.dbwk("dcmu", dbwh(int ), (int)130));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2098244331: {
                    v2 = av.dbwk("dcmv", dbwh(int ), (int)131);
                    continue block65;
                }
                case -281655994: {
                    v2 = av.dbwk("dcmw", dbwh(int ), (int)132);
                    continue block65;
                }
                case 1991886182: {
                    break block65;
                }
            }
            break;
        }
        var5_2 /* !! */  = av.b;
        v3 /* !! */  = av.hd;
        if (true) ** GOTO lbl25
        block66: while (true) {
            v3 /* !! */  = (long)(v4 - av.dbwk("dcmx", dbwh(int ), (int)133));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1665339299: {
                    v4 = av.dbwk("dcmy", dbwh(int ), (int)134);
                    continue block66;
                }
                case -702354539: {
                    v4 = av.dbwk("dcmz", dbwh(int ), (int)135);
                    continue block66;
                }
                case 1969230093: {
                    v4 = av.dbwk("dcna", dbwh(int ), (int)136);
                    continue block66;
                }
                case 1991886182: {
                    break block66;
                }
            }
            break;
        }
        var4_3 = av.a;
        if (var6_1) {
            throw null;
lbl40:
            // 13 sources

            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcnb", dbwh(int ), (int)137)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == av.dbwk("dcnc", dbwm(int ), (int)292)) break;
            v5 /* !! */  = (long)av.dbwk("dcnd", dbwm(int ), (int)293);
        }
        v6 /* !! */  = av.hd;
        if (true) ** GOTO lbl52
        block69: while (true) {
            v6 /* !! */  = (long)(v7 - av.dbwk("dcne", dbwh(int ), (int)138));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1929065113: {
                    v7 = av.dbwk("dcnf", dbwh(int ), (int)139);
                    continue block69;
                }
                case 656975423: {
                    v7 = av.dbwk("dcng", dbwh(int ), (int)140);
                    continue block69;
                }
                case 704037807: {
                    v7 = av.dbwk("dcnh", dbwh(int ), (int)141);
                    continue block69;
                }
                case 1991886182: {
                    break block69;
                }
            }
            break;
        }
        var1_4 = this.elements.iterator();
        if (var4_3) ** GOTO lbl40
        block70: while (true) {
            if (var4_3 || var4_3) ** GOTO lbl40
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("dcni", dbwh(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == av.dbwk("dcnj", dbwm(int ), (int)294)) break;
                v8 /* !! */  = (long)av.dbwk("dcnk", dbwm(int ), (int)295);
            }
            if (!var1_4.hasNext()) ** GOTO lbl118
            if (var4_3) ** GOTO lbl40
            v9 /* !! */  = av.hd;
            if (true) ** GOTO lbl79
            block72: while (true) {
                v9 /* !! */  = (long)(av.dbwk("dcnm", dbwh(int ), (int)144) - av.dbwk("dcnl", dbwh(int ), (int)143));
lbl79:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1653340668: {
                        continue block72;
                    }
                    case 1991886182: {
                        break block72;
                    }
                }
                break;
            }
            var2_5 = var1_4.next();
            if (var4_3 || var4_3) ** GOTO lbl40
            if (!(var2_5 instanceof ar)) ** GOTO lbl108
            if (var4_3) ** GOTO lbl40
            var3_6 = (ar)var2_5;
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_3 || var4_3) ** GOTO lbl40
                    v10 /* !! */  = av.hd;
                    if (true) ** GOTO lbl97
                    block73: while (true) {
                        v10 /* !! */  = (long)(v11 - av.dbwk("dcnn", dbwh(int ), (int)145));
lbl97:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -429863650: {
                                v11 = av.dbwk("dcno", dbwh(int ), (int)146);
                                continue block73;
                            }
                            case 86998148: {
                                v11 = av.dbwk("dcnp", dbwh(int ), (int)147);
                                continue block73;
                            }
                            case 1991886182: {
                                break block73;
                            }
                        }
                        break;
                    }
                    var3_6.resetPosition();
                    if (var4_3) ** GOTO lbl40
lbl108:
                    // 2 sources

                    if (var4_3 || var4_3) ** GOTO lbl40
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_3 = av.hd - av.dbwk("dcnq", dbwh(int ), (int)148)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == av.dbwk("dcnr", dbwm(int ), (int)296)) break;
                        v12 /* !! */  = (long)av.dbwk("dcns", dbwm(int ), (int)297);
                    }
                    this.constrainToViewport(var2_5);
                    if (var4_3 || var4_3) ** GOTO lbl40
                    if (!var6_1) continue block70;
                    throw null;
                }
lbl118:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl40
                v13 /* !! */  = av.hd;
                if (true) ** GOTO lbl123
                block75: while (true) {
                    v13 /* !! */  = (long)(v14 - av.dbwk("dcnt", dbwh(int ), (int)149));
lbl123:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1962259524: {
                            v14 = av.dbwk("dcnu", dbwh(int ), (int)150);
                            continue block75;
                        }
                        case -966169281: {
                            v14 = av.dbwk("dcnv", dbwh(int ), (int)151);
                            continue block75;
                        }
                        case -931869840: {
                            v14 = av.dbwk("dcnw", dbwh(int ), (int)152);
                            continue block75;
                        }
                        case 1991886182: {
                            break block75;
                        }
                    }
                    break;
                }
                v15 /* !! */  = av.hd;
                if (true) ** GOTO lbl139
                block76: while (true) {
                    v15 /* !! */  = (long)(v16 - av.dbwk("dcnx", dbwh(int ), (int)153));
lbl139:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 599958118: {
                            v16 = av.dbwk("dcny", dbwh(int ), (int)154);
                            continue block76;
                        }
                        case 1606203480: {
                            v16 = av.dbwk("dcnz", dbwh(int ), (int)155);
                            continue block76;
                        }
                        case 1991886182: {
                            break block76;
                        }
                    }
                    break;
                }
                this.saveViewportLayout(this.activeViewportKey);
                if (var4_3 || var4_3) ** GOTO lbl40
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_4 = av.hd - av.dbwk("dcoa", dbwh(int ), (int)156)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == av.dbwk("dcob", dbwm(int ), (int)298)) break;
                    v17 /* !! */  = (long)av.dbwk("dcoc", dbwm(int ), (int)299);
                }
                this.saveConfig();
                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
                case 0: {
                    var5_2 /* !! */  = (int)av.dbwk("dcod", dbwm(int ), (int)300);
                    if (!var6_1) break block70;
                    throw null;
                }
lbl163:
                // 3 sources

                case 1: {
                    var5_2 /* !! */  = (int)av.dbwk("dcoe", dbwm(int ), (int)301);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
lbl168:
                // 4 sources

                case 2: {
                    var5_2 /* !! */  = (int)av.dbwk("dcof", dbwm(int ), (int)302);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                }
                case 3: {
                    var5_2 /* !! */  = (int)av.dbwk("dcog", dbwm(int ), (int)303);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl234
                }
lbl178:
                // 2 sources

                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_2 /* !! */  = (int)av.dbwk("dcoh", dbwm(int ), (int)304);
                        if (var6_1) {
                            throw null;
                        }
                        ** GOTO lbl188
                        break;
                    }
                }
lbl184:
                // 3 sources

                case 5: {
                    var5_2 /* !! */  = (int)av.dbwk("dcoi", dbwm(int ), (int)305);
                    if (!var6_1) ** GOTO lbl178
                    throw null;
                }
lbl188:
                // 2 sources

                case 6: {
                    var5_2 /* !! */  = (int)av.dbwk("dcoj", dbwm(int ), (int)306);
                    if (!var6_1) ** GOTO lbl168
                    throw null;
                }
lbl192:
                // 2 sources

                case 7: {
                    var5_2 /* !! */  = (int)av.dbwk("dcok", dbwm(int ), (int)307);
                    if (!var6_1) ** GOTO lbl168
                    throw null;
                }
                case 8: {
                    var5_2 /* !! */  = (int)av.dbwk("dcol", dbwm(int ), (int)308);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl247
                }
                case 9: {
                    var5_2 /* !! */  = (int)av.dbwk("dcom", dbwm(int ), (int)309);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl243
                }
                case 10: {
                    var5_2 /* !! */  = (int)av.dbwk("dcon", dbwm(int ), (int)310);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl230
                }
                case 11: {
                    var5_2 /* !! */  = (int)av.dbwk("dcor", dbwm(int ), (int)311);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl225
                }
                case 12: {
                    var5_2 /* !! */  = (int)av.dbwk("dcot", dbwm(int ), (int)312);
                    if (!var6_1) ** GOTO lbl163
                    throw null;
                }
lbl220:
                // 2 sources

                case 13: {
                    var5_2 /* !! */  = (int)av.dbwk("dcou", dbwm(int ), (int)313);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl256
                }
lbl225:
                // 2 sources

                case 14: {
                    do {
                        var5_2 /* !! */  = (int)av.dbwk("dcov", dbwm(int ), (int)314);
                    } while (!var6_1);
                    throw null;
                }
lbl230:
                // 2 sources

                case 15: {
                    var5_2 /* !! */  = (int)av.dbwk("dcow", dbwm(int ), (int)315);
                    if (var6_1) {
                        throw null;
                    }
                }
lbl234:
                // 4 sources

                case 16: {
                    var5_2 /* !! */  = (int)av.dbwk("dcox", dbwm(int ), (int)316);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl252
                }
                case 17: {
                    var5_2 /* !! */  = (int)av.dbwk("dcoy", dbwm(int ), (int)317);
                    if (!var6_1) ** GOTO lbl220
                    throw null;
                }
lbl243:
                // 2 sources

                case 18: {
                    var5_2 /* !! */  = (int)av.dbwk("dcpc", dbwm(int ), (int)318);
                    if (!var6_1) ** GOTO lbl163
                    throw null;
                }
lbl247:
                // 2 sources

                case 19: {
                    var5_2 /* !! */  = (int)av.dbwk("dcpe", dbwm(int ), (int)319);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl264
                }
lbl252:
                // 2 sources

                case 20: {
                    var5_2 /* !! */  = (int)av.dbwk("dcph", dbwm(int ), (int)320);
                    if (var6_1) {
                        throw null;
                    }
                }
lbl256:
                // 4 sources

                case 21: {
                    var5_2 /* !! */  = (int)av.dbwk("dcpj", dbwm(int ), (int)321);
                    if (!var6_1) break block70;
                    throw null;
                }
                case 22: {
                    var5_2 /* !! */  = (int)av.dbwk("dcpk", dbwm(int ), (int)322);
                    if (!var6_1) ** GOTO lbl192
                    throw null;
                }
lbl264:
                // 2 sources

                case 23: {
                    var5_2 /* !! */  = (int)av.dbwk("dcpl", dbwm(int ), (int)323);
                    if (!var6_1) ** GOTO lbl168
                    throw null;
                }
                case 24: 
            }
            break;
        }
        var5_2 /* !! */  = (int)av.dbwk("dcpn", dbwm(int ), (int)324);
        ** while (!var6_1)
lbl271:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isElementEnabled(au var1_1, dy var2_2) {
        v0 /* !! */  = av.hd;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(av.dbwk("dcgk", dbwh(int ), (int)78) - av.dbwk("dcgj", dbwh(int ), (int)77));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 173310373: {
                    continue block25;
                }
                case 1991886182: {
                    break block25;
                }
            }
            break;
        }
        var5_3 = av.c;
        v1 /* !! */  = av.hd;
        if (true) ** GOTO lbl15
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - av.dbwk("dcgl", dbwh(int ), (int)79));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -882572714: {
                    v2 = av.dbwk("dcgm", dbwh(int ), (int)80);
                    continue block26;
                }
                case 321077668: {
                    v2 = av.dbwk("dcgn", dbwh(int ), (int)81);
                    continue block26;
                }
                case 1991886182: {
                    break block26;
                }
            }
            break;
        }
        var4_4 /* !! */  = av.b;
        v3 /* !! */  = av.hd;
        if (true) ** GOTO lbl29
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - av.dbwk("dcgo", dbwh(int ), (int)82));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1006528404: {
                    v4 = av.dbwk("dcgp", dbwh(int ), (int)83);
                    continue block27;
                }
                case 270351599: {
                    v4 = av.dbwk("dcgq", dbwh(int ), (int)84);
                    continue block27;
                }
                case 1033443975: {
                    v4 = av.dbwk("dcgr", dbwh(int ), (int)85);
                    continue block27;
                }
                case 1991886182: {
                    break block27;
                }
            }
            break;
        }
        var3_5 = av.a;
        if (var5_3) {
            throw null;
lbl44:
            // 2 sources

            return (boolean)av.dbwk("dcgs", dbwm(int ), (int)178);
        }
        if (var3_5) ** GOTO lbl44
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcgt", dbwh(int ), (int)86)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == av.dbwk("dcgu", dbwm(int ), (int)179)) break;
                    v5 /* !! */  = (long)av.dbwk("dcgv", dbwm(int ), (int)180);
                }
                v6 = var2_2.interfaceSettings;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcgw", dbwh(int ), (int)87)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == av.dbwk("dcgx", dbwm(int ), (int)181)) break;
                    v7 /* !! */  = (long)av.dbwk("dcgy", dbwm(int ), (int)182);
                }
                v8 = var1_1.getName();
                v9 /* !! */  = av.hd;
                if (true) ** GOTO lbl67
                block31: while (true) {
                    v9 /* !! */  = (long)(av.dbwk("dcha", dbwh(int ), (int)89) - av.dbwk("dcgz", dbwh(int ), (int)88));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -110168121: {
                            continue block31;
                        }
                        case 1991886182: {
                            break block31;
                        }
                    }
                    break;
                }
                return v6.isSelected(v8);
            }
lbl73:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)av.dbwk("dchb", dbwm(int ), (int)183);
                if (!var5_3) break;
                throw null;
            }
            case 1: {
                var4_4 /* !! */  = (int)av.dbwk("dchc", dbwm(int ), (int)184);
                if (!var5_3) ** GOTO lbl73
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)av.dbwk("dchd", dbwm(int ), (int)185);
                    if (!var5_3) break block15;
                    throw null;
                }
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)av.dbwk("dche", dbwm(int ), (int)186);
        ** while (!var5_3)
lbl89:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void saveConfig() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcpv", dbwh(int ), (int)157)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == av.dbwk("dcpw", dbwm(int ), (int)325)) break;
            v0 /* !! */  = (long)av.dbwk("dcpy", dbwm(int ), (int)326);
        }
        var3_1 = av.c;
        v1 /* !! */  = av.hd;
        if (true) ** GOTO lbl11
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - av.dbwk("dcqa", dbwh(int ), (int)158));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1822813766: {
                    v2 = av.dbwk("dcqb", dbwh(int ), (int)159);
                    continue block20;
                }
                case -496736600: {
                    v2 = av.dbwk("dcqd", dbwh(int ), (int)160);
                    continue block20;
                }
                case -5335531: {
                    v2 = av.dbwk("dcqe", dbwh(int ), (int)161);
                    continue block20;
                }
                case 1991886182: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = av.b;
        v3 /* !! */  = av.hd;
        if (true) ** GOTO lbl28
        block21: while (true) {
            v3 /* !! */  = (long)(v4 - av.dbwk("dcqf", dbwh(int ), (int)162));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 122510374: {
                    v4 = av.dbwk("dcqg", dbwh(int ), (int)163);
                    continue block21;
                }
                case 423536403: {
                    v4 = av.dbwk("dcqh", dbwh(int ), (int)164);
                    continue block21;
                }
                case 1991886182: {
                    break block21;
                }
            }
            break;
        }
        var1_3 = av.a;
        if (var3_1) {
            throw null;
lbl40:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcqi", dbwh(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == av.dbwk("dcqk", dbwm(int ), (int)327)) break;
                    v5 /* !! */  = (long)av.dbwk("dcql", dbwm(int ), (int)328);
                }
                v6 = aj.getInstance();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("dcqm", dbwh(int ), (int)166)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == av.dbwk("dcqn", dbwm(int ), (int)329)) break;
                    v7 /* !! */  = (long)av.dbwk("dcqp", dbwm(int ), (int)330);
                }
                v6.save();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)av.dbwk("dcqr", dbwm(int ), (int)331);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)av.dbwk("dcqt", dbwm(int ), (int)332);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)av.dbwk("dcqu", dbwm(int ), (int)333);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)av.dbwk("dcqv", dbwm(int ), (int)334);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)av.dbwk("dcqw", dbwm(int ), (int)335);
                    if (!var3_1) break block11;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)av.dbwk("dcqx", dbwm(int ), (int)336);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$render$0(dy var1_1, float var2_2, class_332 var3_3, float var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 54[DOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void ddiy() {
        av.dbwi[200] = 2275804736704733310L;
        av.dbwi[201] = 5174863018115468935L;
        av.dbwi[202] = -5852723815930865238L;
        av.dbwi[203] = 1067166360923658104L;
        av.dbwi[204] = -2348215974245292729L;
        av.dbwi[205] = 8518741560850932585L;
        av.dbwi[206] = -1701611140268413332L;
        av.dbwi[207] = 2514930514103701834L;
        av.dbwi[208] = -5651610144278855984L;
        av.dbwi[209] = -6458452882877674354L;
        av.dbwi[210] = 2296842181877629806L;
        av.dbwi[211] = -7283560572618342127L;
        av.dbwi[212] = 1084742439229811358L;
        av.dbwi[213] = -6875133430200636363L;
        av.dbwi[214] = 3063279302199977512L;
        av.dbwi[215] = 8581955911959647917L;
        av.dbwi[216] = 144763905387676974L;
        av.dbwi[217] = 1592475756104049340L;
        av.dbwi[218] = -2966263651229950130L;
        av.dbwi[219] = -8158401338777721948L;
        av.dbwi[220] = -6536503289069600169L;
        av.dbwi[221] = -7469170899081303734L;
        av.dbwi[222] = -7295431981810584958L;
        av.dbwi[223] = -4985442858972355740L;
        av.dbwi[224] = -5182438240468726742L;
        av.dbwi[225] = 1561225561694915719L;
        av.dbwi[226] = -3364079898315285490L;
        av.dbwi[227] = -6746001411697116859L;
        av.dbwi[228] = -3987177139578435807L;
        av.dbwi[229] = 5752784825983682793L;
        av.dbwi[230] = 3436502308021264947L;
        av.dbwi[231] = -4656940316578059695L;
        av.dbwi[232] = -3704011043157157957L;
        av.dbwi[233] = 2338455346693431625L;
        av.dbwi[234] = -3234217780716974223L;
        av.dbwi[235] = -6339857678636497212L;
        av.dbwi[236] = 4213642525430584384L;
        av.dbwi[237] = 3134299983392041614L;
        av.dbwi[238] = -7467024658378603898L;
        av.dbwi[239] = -3924482204478190311L;
        av.dbwi[240] = 4738164801996143576L;
        av.dbwi[241] = -340010064098856557L;
        av.dbwi[242] = -6357287724906234450L;
        av.dbwi[243] = 2275955357176223621L;
        av.dbwi[244] = -1538924316037766352L;
        av.dbwi[245] = -2983004601637867065L;
        av.dbwi[246] = 4848385878581659247L;
        av.dbwi[247] = -8670635966268077570L;
        av.dbwi[248] = -6036263366808362848L;
        av.dbwi[249] = 6853148388217297484L;
        av.dbwi[250] = -80148597313411819L;
        av.dbwi[251] = -3048496662741791593L;
        av.dbwi[252] = -5120282212268553473L;
        av.dbwi[253] = 4199035615875459704L;
        av.dbwi[254] = 3478692714534418009L;
        av.dbwi[255] = -5776081879742356353L;
        av.dbwi[256] = 8853283192050631435L;
        av.dbwi[257] = 4748476234770326344L;
        av.dbwi[258] = -6533563142488355381L;
        av.dbwi[259] = 3231474234975166047L;
        av.dbwi[260] = 2268586942645678746L;
        av.dbwi[261] = 2844954209013857081L;
        av.dbwi[262] = 5853608949072629212L;
        av.dbwi[263] = -4815557777310433295L;
        av.dbwi[264] = 873772255121401967L;
        av.dbwi[265] = 8694606513702181305L;
        av.dbwi[266] = -4574316095177978348L;
        av.dbwi[267] = -8395883174533369460L;
        av.dbwi[268] = -8532299504176637312L;
        av.dbwi[269] = 4233862250675853705L;
        av.dbwi[270] = -4893343830665731780L;
        av.dbwi[271] = -4131182997777809150L;
        av.dbwi[272] = 7703287495883019128L;
        av.dbwi[273] = 8884922018857912291L;
        av.dbwi[274] = 1227052657831066205L;
        av.dbwi[275] = 7500368435393180035L;
        av.dbwi[276] = 372878584178325731L;
        av.dbwi[277] = 4914932946574841146L;
        av.dbwi[278] = 8522548599166901393L;
        av.dbwi[279] = -5479367845189640518L;
        av.dbwi[280] = 4281607865064445443L;
        av.dbwi[281] = 7638709333306959801L;
        av.dbwi[282] = 5441734044483151006L;
        av.dbwi[283] = 1811889716886903057L;
        av.dbwi[284] = 2259374694214993666L;
        av.dbwi[285] = -129096003048274339L;
        av.dbwi[286] = 4504071686457203964L;
        av.dbwi[287] = -3370573168090398148L;
        av.dbwi[288] = 7333346852409747672L;
        av.dbwi[289] = 8135253264731706635L;
        av.dbwi[290] = 7389367664544637093L;
        av.dbwi[291] = -1677096844384710005L;
        av.dbwi[292] = -1578207961303919156L;
        av.dbwi[293] = -2474304752188853436L;
        av.dbwi[294] = -7325411904885616559L;
        av.dbwi[295] = 7600920368037718215L;
        av.dbwi[296] = -4860906740052201142L;
        av.dbwi[297] = 4142259923082214671L;
        av.dbwi[298] = 7299716071466100031L;
        av.dbwi[299] = -5704307026209487283L;
    }

    private static /* synthetic */ void ddis() {
        av.dbwo[300] = 1064358155;
        av.dbwo[301] = -110574869;
        av.dbwo[302] = 601291427;
        av.dbwo[303] = 740297631;
        av.dbwo[304] = -1180251540;
        av.dbwo[305] = -533632880;
        av.dbwo[306] = 1647971331;
        av.dbwo[307] = -342355089;
        av.dbwo[308] = -631746303;
        av.dbwo[309] = -154417309;
        av.dbwo[310] = -444814055;
        av.dbwo[311] = -935882463;
        av.dbwo[312] = 2011508775;
        av.dbwo[313] = -318648022;
        av.dbwo[314] = -835952951;
        av.dbwo[315] = -336074796;
        av.dbwo[316] = -1060258187;
        av.dbwo[317] = 278651345;
        av.dbwo[318] = 993531951;
        av.dbwo[319] = -1509323455;
        av.dbwo[320] = -2122191547;
        av.dbwo[321] = -735382880;
        av.dbwo[322] = -1543975998;
        av.dbwo[323] = 1564676620;
        av.dbwo[324] = -1533850509;
        av.dbwo[325] = 1476909917;
        av.dbwo[326] = 119342692;
        av.dbwo[327] = 1513925177;
        av.dbwo[328] = 1162901002;
        av.dbwo[329] = -463691740;
        av.dbwo[330] = 851388004;
        av.dbwo[331] = 1538988400;
        av.dbwo[332] = 1721393316;
        av.dbwo[333] = 1564205614;
        av.dbwo[334] = 1851800749;
        av.dbwo[335] = -2008229393;
        av.dbwo[336] = 1289493620;
        av.dbwo[337] = -1737538507;
        av.dbwo[338] = -820329032;
        av.dbwo[339] = -601192394;
        av.dbwo[340] = 384001180;
        av.dbwo[341] = -632641120;
        av.dbwo[342] = 907385031;
        av.dbwo[343] = 541454418;
        av.dbwo[344] = 431721304;
        av.dbwo[345] = -312526656;
        av.dbwo[346] = 551827165;
        av.dbwo[347] = 1974009934;
        av.dbwo[348] = -595010576;
        av.dbwo[349] = -19764518;
        av.dbwo[350] = -1589061596;
        av.dbwo[351] = -791409125;
        av.dbwo[352] = -718172621;
        av.dbwo[353] = -1041080760;
        av.dbwo[354] = 1347378916;
        av.dbwo[355] = -1518007815;
        av.dbwo[356] = 1741733669;
        av.dbwo[357] = -1006506631;
        av.dbwo[358] = 319238893;
        av.dbwo[359] = -1583338665;
        av.dbwo[360] = -375605984;
        av.dbwo[361] = 1432902081;
        av.dbwo[362] = -2018992859;
        av.dbwo[363] = -1237726964;
        av.dbwo[364] = 1642708703;
        av.dbwo[365] = 951109627;
        av.dbwo[366] = -1462862332;
        av.dbwo[367] = -726118018;
        av.dbwo[368] = -202970616;
        av.dbwo[369] = 1578388705;
        av.dbwo[370] = -296259396;
        av.dbwo[371] = -1349202739;
        av.dbwo[372] = -226327527;
        av.dbwo[373] = -777290279;
        av.dbwo[374] = 667083764;
        av.dbwo[375] = -980984214;
        av.dbwo[376] = 402345110;
        av.dbwo[377] = 626422739;
        av.dbwo[378] = -1726235350;
        av.dbwo[379] = 732254312;
        av.dbwo[380] = 795537381;
        av.dbwo[381] = 212859123;
        av.dbwo[382] = -592685754;
        av.dbwo[383] = -2074860258;
        av.dbwo[384] = 1083404409;
        av.dbwo[385] = -979543104;
        av.dbwo[386] = 82110789;
        av.dbwo[387] = -1222655022;
        av.dbwo[388] = 1991824058;
        av.dbwo[389] = 711775630;
        av.dbwo[390] = -99780063;
        av.dbwo[391] = 487509747;
        av.dbwo[392] = -650985295;
        av.dbwo[393] = 1049922528;
        av.dbwo[394] = -995401302;
        av.dbwo[395] = 750600332;
        av.dbwo[396] = 640114134;
        av.dbwo[397] = -1639507687;
        av.dbwo[398] = 923181102;
        av.dbwo[399] = 197900187;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void constrainToViewport(au var1_1, float var2_2) {
        block140: {
            v0 /* !! */  = av.hd;
            if (true) ** GOTO lbl5
            block94: while (true) {
                v0 /* !! */  = (long)(av.dbwk("dcvs", dbwh(int ), (int)224) - av.dbwk("dcvr", dbwh(int ), (int)223));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2092338648: {
                        continue block94;
                    }
                    case 1991886182: {
                        break block94;
                    }
                }
                break;
            }
            var10_3 = av.c;
            v1 /* !! */  = av.hd;
            if (true) ** GOTO lbl15
            block95: while (true) {
                v1 /* !! */  = (long)(v2 - av.dbwk("dcvt", dbwh(int ), (int)225));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1482466014: {
                        v2 = av.dbwk("dcvu", dbwh(int ), (int)226);
                        continue block95;
                    }
                    case 1411987545: {
                        v2 = av.dbwk("dcvv", dbwh(int ), (int)227);
                        continue block95;
                    }
                    case 1607006626: {
                        v2 = av.dbwk("dcvw", dbwh(int ), (int)228);
                        continue block95;
                    }
                    case 1991886182: {
                        break block95;
                    }
                }
                break;
            }
            var9_4 /* !! */  = av.b;
            v3 /* !! */  = av.hd;
            if (true) ** GOTO lbl32
            block96: while (true) {
                v3 /* !! */  = (long)(av.dbwk("dcvy", dbwh(int ), (int)230) - av.dbwk("dcvx", dbwh(int ), (int)229));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 214034265: {
                        continue block96;
                    }
                    case 1991886182: {
                        break block96;
                    }
                }
                break;
            }
            var8_5 = av.a;
            if (var10_3) {
                throw null;
lbl40:
                // 10 sources

                return;
            }
            if (var8_5 || var8_5) ** GOTO lbl40
            v4 /* !! */  = av.hd;
            if (true) ** GOTO lbl47
            block98: while (true) {
                v4 /* !! */  = (long)(av.dbwk("dcwa", dbwh(int ), (int)232) - av.dbwk("dcvz", dbwh(int ), (int)231));
lbl47:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1427640528: {
                        continue block98;
                    }
                    case 1991886182: {
                        break block98;
                    }
                }
                break;
            }
            if (ki.hasUsableViewport()) break block140;
            if (var8_5 || var8_5) ** GOTO lbl40
            return;
        }
        if (var8_5 || var8_5) ** GOTO lbl40
        var3_6 = av.dbwk("dcwb", dbwm(int ), (int)402);
        if (var8_5 || var8_5) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcwc", dbwh(int ), (int)233)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == av.dbwk("dcwd", dbwm(int ), (int)403)) break;
            v5 /* !! */  = (long)av.dbwk("dcwe", dbwm(int ), (int)404);
        }
        v6 = ki.getFixedScaledWidth();
        v7 = av.dbwk("dcwf", dctl(int ), (int)405);
        v8 /* !! */  = av.hd;
        if (true) ** GOTO lbl70
        block100: while (true) {
            v8 /* !! */  = (long)(v9 - av.dbwk("dcwg", dbwh(int ), (int)234));
lbl70:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1279068670: {
                    v9 = av.dbwk("dcwh", dbwh(int ), (int)235);
                    continue block100;
                }
                case 1620531121: {
                    v9 = av.dbwk("dcwi", dbwh(int ), (int)236);
                    continue block100;
                }
                case 1991886182: {
                    break block100;
                }
            }
            break;
        }
        v10 = v6 / Math.max((float)v7, var2_2);
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcwj", dbwh(int ), (int)237)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == av.dbwk("dcwk", dbwm(int ), (int)406)) break;
            v11 /* !! */  = (long)av.dbwk("dcwl", dbwm(int ), (int)407);
        }
        var4_7 = (int)Math.floor(v10);
        if (var8_5 || var8_5) ** GOTO lbl40
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("dcwm", dbwh(int ), (int)238)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == av.dbwk("dcwn", dbwm(int ), (int)408)) break;
            v12 /* !! */  = (long)av.dbwk("dcwo", dbwm(int ), (int)409);
        }
        v13 = ki.getFixedScaledHeight();
        v14 = av.dbwk("dcwp", dctl(int ), (int)410);
        v15 /* !! */  = av.hd;
        if (true) ** GOTO lbl98
        block103: while (true) {
            v15 /* !! */  = (long)(v16 - av.dbwk("dcwq", dbwh(int ), (int)239));
lbl98:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case 407663499: {
                    v16 = av.dbwk("dcwr", dbwh(int ), (int)240);
                    continue block103;
                }
                case 1443580843: {
                    v16 = av.dbwk("dcws", dbwh(int ), (int)241);
                    continue block103;
                }
                case 1447119942: {
                    v16 = av.dbwk("dcwt", dbwh(int ), (int)242);
                    continue block103;
                }
                case 1991886182: {
                    break block103;
                }
            }
            break;
        }
        v17 = v13 / Math.max((float)v14, var2_2);
        v18 /* !! */  = av.hd;
        if (true) ** GOTO lbl115
        block104: while (true) {
            v18 /* !! */  = (long)(v19 - av.dbwk("dcwu", dbwh(int ), (int)243));
lbl115:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1456009250: {
                    v19 = av.dbwk("dcwv", dbwh(int ), (int)244);
                    continue block104;
                }
                case -666219072: {
                    v19 = av.dbwk("dcww", dbwh(int ), (int)245);
                    continue block104;
                }
                case 1991886182: {
                    break block104;
                }
            }
            break;
        }
        var5_8 = (int)Math.floor(v17);
        if (var8_5 || var8_5) ** GOTO lbl40
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_3 = av.hd - av.dbwk("dcwx", dbwh(int ), (int)246)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == av.dbwk("dcwy", dbwm(int ), (int)411)) break;
            v20 /* !! */  = (long)av.dbwk("dcwz", dbwm(int ), (int)412);
        }
        v21 = var4_7 - var1_1.getWidth() - var3_6;
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_4 = av.hd - av.dbwk("dcxa", dbwh(int ), (int)247)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == av.dbwk("dcxb", dbwm(int ), (int)413)) break;
            v22 /* !! */  = (long)av.dbwk("dcxc", dbwm(int ), (int)414);
        }
        var6_9 = Math.max((int)var3_6, v21);
        if (var8_5 || var8_5) ** GOTO lbl40
        v23 /* !! */  = av.hd;
        if (true) ** GOTO lbl143
        block107: while (true) {
            v23 /* !! */  = (long)(v24 - av.dbwk("dcxd", dbwh(int ), (int)248));
lbl143:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -968076137: {
                    v24 = av.dbwk("dcxe", dbwh(int ), (int)249);
                    continue block107;
                }
                case 1144991820: {
                    v24 = av.dbwk("dcxf", dbwh(int ), (int)250);
                    continue block107;
                }
                case 1991886182: {
                    break block107;
                }
            }
            break;
        }
        v25 = var5_8 - var1_1.getHeight() - var3_6;
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_5 = av.hd - av.dbwk("dcxg", dbwh(int ), (int)251)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == av.dbwk("dcxh", dbwm(int ), (int)415)) break;
            v26 /* !! */  = (long)av.dbwk("dcxi", dbwm(int ), (int)416);
        }
        var7_10 = Math.max((int)var3_6, v25);
        if (var8_5 || var8_5) ** GOTO lbl40
        v27 /* !! */  = av.hd;
        if (true) ** GOTO lbl164
        block109: while (true) {
            v27 /* !! */  = (long)(v28 - av.dbwk("dcxj", dbwh(int ), (int)252));
lbl164:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -2111287633: {
                    v28 = av.dbwk("dcxk", dbwh(int ), (int)253);
                    continue block109;
                }
                case 502549046: {
                    v28 = av.dbwk("dcxl", dbwh(int ), (int)254);
                    continue block109;
                }
                case 1730543321: {
                    v28 = av.dbwk("dcxm", dbwh(int ), (int)255);
                    continue block109;
                }
                case 1991886182: {
                    break block109;
                }
            }
            break;
        }
        v29 = var1_1.getX();
        v30 /* !! */  = av.hd;
        if (true) ** GOTO lbl181
        block110: while (true) {
            v30 /* !! */  = (long)(av.dbwk("dcxo", dbwh(int ), (int)257) - av.dbwk("dcxn", dbwh(int ), (int)256));
lbl181:
            // 2 sources

            switch ((int)v30 /* !! */ ) {
                case 351536222: {
                    continue block110;
                }
                case 1991886182: {
                    break block110;
                }
            }
            break;
        }
        v31 = Math.min(v29, var6_9);
        while (true) {
            if ((v32 /* !! */  = (cfr_temp_6 = av.hd - av.dbwk("dcxp", dbwh(int ), (int)258)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v32 /* !! */  == av.dbwk("dcxq", dbwm(int ), (int)417)) break;
            v32 /* !! */  = (long)av.dbwk("dcxr", dbwm(int ), (int)418);
        }
        v33 = Math.max((int)var3_6, v31);
        v34 /* !! */  = av.hd;
        if (true) ** GOTO lbl197
        block112: while (true) {
            v34 /* !! */  = (long)(v35 - av.dbwk("dcxs", dbwh(int ), (int)259));
lbl197:
            // 2 sources

            switch ((int)v34 /* !! */ ) {
                case -810769989: {
                    v35 = av.dbwk("dcxt", dbwh(int ), (int)260);
                    continue block112;
                }
                case 1200060062: {
                    v35 = av.dbwk("dcxu", dbwh(int ), (int)261);
                    continue block112;
                }
                case 1202306658: {
                    v35 = av.dbwk("dcxv", dbwh(int ), (int)262);
                    continue block112;
                }
                case 1991886182: {
                    break block112;
                }
            }
            break;
        }
        var1_1.setX(v33);
        if (var8_5 || var8_5) ** GOTO lbl40
        v36 /* !! */  = av.hd;
        if (true) ** GOTO lbl215
        block113: while (true) {
            v36 /* !! */  = (long)(v37 - av.dbwk("dcxw", dbwh(int ), (int)263));
lbl215:
            // 2 sources

            switch ((int)v36 /* !! */ ) {
                case 1004463745: {
                    v37 = av.dbwk("dcxx", dbwh(int ), (int)264);
                    continue block113;
                }
                case 1917994283: {
                    v37 = av.dbwk("dcxy", dbwh(int ), (int)265);
                    continue block113;
                }
                case 1991886182: {
                    break block113;
                }
            }
            break;
        }
        v38 = var1_1.getY();
        while (true) {
            if ((v39 /* !! */  = (cfr_temp_7 = av.hd - av.dbwk("dcxz", dbwh(int ), (int)266)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v39 /* !! */  == av.dbwk("dcya", dbwm(int ), (int)419)) break;
            v39 /* !! */  = (long)av.dbwk("dcyb", dbwm(int ), (int)420);
        }
        v40 = Math.min(v38, var7_10);
        v41 /* !! */  = av.hd;
        if (true) ** GOTO lbl235
        block115: while (true) {
            v41 /* !! */  = (long)(v42 - av.dbwk("dcyc", dbwh(int ), (int)267));
lbl235:
            // 2 sources

            switch ((int)v41 /* !! */ ) {
                case -1811495731: {
                    v42 = av.dbwk("dcyd", dbwh(int ), (int)268);
                    continue block115;
                }
                case 1260989299: {
                    v42 = av.dbwk("dcye", dbwh(int ), (int)269);
                    continue block115;
                }
                case 1991886182: {
                    break block115;
                }
            }
            break;
        }
        v43 = Math.max((int)var3_6, v40);
        v44 /* !! */  = av.hd;
        if (true) ** GOTO lbl249
        block116: while (true) {
            v44 /* !! */  = (long)(av.dbwk("dcyg", dbwh(int ), (int)271) - av.dbwk("dcyf", dbwh(int ), (int)270));
lbl249:
            // 2 sources

            switch ((int)v44 /* !! */ ) {
                case -1715411617: {
                    continue block116;
                }
                case 1991886182: {
                    break block116;
                }
            }
            break;
        }
        var1_1.setY(v43);
        if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_5 || var8_5) ** continue;
                return;
            }
lbl260:
            // 2 sources

            case 0: {
                var9_4 /* !! */  = (int)av.dbwk("dcyh", dbwm(int ), (int)421);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl314
            }
lbl265:
            // 2 sources

            case 1: {
                var9_4 /* !! */  = (int)av.dbwk("dcyi", dbwm(int ), (int)422);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 2: {
                var9_4 /* !! */  = (int)av.dbwk("dcyj", dbwm(int ), (int)423);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl290
            }
            case 3: {
                var9_4 /* !! */  = (int)av.dbwk("dcyk", dbwm(int ), (int)424);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl280:
            // 2 sources

            case 4: {
                var9_4 /* !! */  = (int)av.dbwk("dcyl", dbwm(int ), (int)425);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl285:
            // 2 sources

            case 5: {
                var9_4 /* !! */  = (int)av.dbwk("dcym", dbwm(int ), (int)426);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl357
            }
lbl290:
            // 4 sources

            case 6: {
                var9_4 /* !! */  = (int)av.dbwk("dcyn", dbwm(int ), (int)427);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl295:
            // 2 sources

            case 7: {
                var9_4 /* !! */  = (int)av.dbwk("dcyo", dbwm(int ), (int)428);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 8: {
                var9_4 /* !! */  = (int)av.dbwk("dcyp", dbwm(int ), (int)429);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 9: {
                var9_4 /* !! */  = (int)av.dbwk("dcyq", dbwm(int ), (int)430);
                if (!var10_3) ** GOTO lbl280
                throw null;
            }
lbl309:
            // 3 sources

            case 10: {
                var9_4 /* !! */  = (int)av.dbwk("dcyr", dbwm(int ), (int)431);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl314:
            // 3 sources

            case 11: {
                var9_4 /* !! */  = (int)av.dbwk("dcys", dbwm(int ), (int)432);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl319:
            // 2 sources

            case 12: {
                var9_4 /* !! */  = (int)av.dbwk("dcyt", dbwm(int ), (int)433);
                if (var10_3) {
                    throw null;
                }
            }
lbl323:
            // 4 sources

            case 13: {
                var9_4 /* !! */  = (int)av.dbwk("dcyu", dbwm(int ), (int)434);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl328:
            // 2 sources

            case 14: {
                var9_4 /* !! */  = (int)av.dbwk("dcyv", dbwm(int ), (int)435);
                if (var10_3) {
                    throw null;
                }
            }
lbl332:
            // 4 sources

            case 15: {
                var9_4 /* !! */  = (int)av.dbwk("dcyw", dbwm(int ), (int)436);
                if (var10_3) {
                    throw null;
                }
            }
lbl336:
            // 4 sources

            case 16: {
                var9_4 /* !! */  = (int)av.dbwk("dcyx", dbwm(int ), (int)437);
                if (!var10_3) ** GOTO lbl309
                throw null;
            }
            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_4 /* !! */  = (int)av.dbwk("dcyy", dbwm(int ), (int)438);
                    if (!var10_3) ** GOTO lbl295
                    throw null;
                }
            }
            case 18: {
                var9_4 /* !! */  = (int)av.dbwk("dcyz", dbwm(int ), (int)439);
                if (!var10_3) ** GOTO lbl290
                throw null;
            }
            case 19: {
                var9_4 /* !! */  = (int)av.dbwk("dcza", dbwm(int ), (int)440);
                if (!var10_3) ** GOTO lbl265
                throw null;
            }
lbl353:
            // 2 sources

            case 20: {
                var9_4 /* !! */  = (int)av.dbwk("dczb", dbwm(int ), (int)441);
                if (!var10_3) ** GOTO lbl260
                throw null;
            }
lbl357:
            // 2 sources

            case 21: {
                var9_4 /* !! */  = (int)av.dbwk("dczc", dbwm(int ), (int)442);
                if (!var10_3) ** GOTO lbl290
                throw null;
            }
            case 22: 
        }
        var9_4 /* !! */  = (int)av.dbwk("dczd", dbwm(int ), (int)443);
        ** while (!var10_3)
lbl364:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float dctl(int n2) {
        return Float.intBitsToFloat(dbwn[n2] ^ dbwo[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void register(au var1_1) {
        v0 /* !! */  = av.hd;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(av.dbwk("dbyf", dbwh(int ), (int)2) - av.dbwk("dbye", dbwh(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 930643986: {
                    continue block32;
                }
                case 1991886182: {
                    break block32;
                }
            }
            break;
        }
        var4_2 = av.c;
        v1 /* !! */  = av.hd;
        if (true) ** GOTO lbl15
        block33: while (true) {
            v1 /* !! */  = (long)(v2 - av.dbwk("dbyg", dbwh(int ), (int)3));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -638274020: {
                    v2 = av.dbwk("dbyh", dbwh(int ), (int)4);
                    continue block33;
                }
                case 1359916048: {
                    v2 = av.dbwk("dbyi", dbwh(int ), (int)5);
                    continue block33;
                }
                case 1991886182: {
                    break block33;
                }
                case 2118235791: {
                    v2 = av.dbwk("dbyj", dbwh(int ), (int)6);
                    continue block33;
                }
            }
            break;
        }
        var3_3 /* !! */  = av.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = av.hd;
                if (true) ** GOTO lbl35
                block34: while (true) {
                    v3 /* !! */  = (long)(av.dbwk("dbyl", dbwh(int ), (int)8) - av.dbwk("dbyk", dbwh(int ), (int)7));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 203326190: {
                            continue block34;
                        }
                        case 1991886182: {
                            break block34;
                        }
                    }
                    break;
                }
                var2_4 = av.a;
                if (var4_2) {
                    throw null;
lbl43:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl43
                v4 /* !! */  = av.hd;
                if (true) ** GOTO lbl50
                block36: while (true) {
                    v4 /* !! */  = (long)(av.dbwk("dbyn", dbwh(int ), (int)10) - av.dbwk("dbym", dbwh(int ), (int)9));
lbl50:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1656298788: {
                            continue block36;
                        }
                        case 1991886182: {
                            break block36;
                        }
                    }
                    break;
                }
                v5 /* !! */  = av.hd;
                if (true) ** GOTO lbl59
                block37: while (true) {
                    v5 /* !! */  = (long)(v6 - av.dbwk("dbyo", dbwh(int ), (int)11));
lbl59:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 1481067416: {
                            v6 = av.dbwk("dbyp", dbwh(int ), (int)12);
                            continue block37;
                        }
                        case 1505477228: {
                            v6 = av.dbwk("dbyq", dbwh(int ), (int)13);
                            continue block37;
                        }
                        case 1838360853: {
                            v6 = av.dbwk("dbyr", dbwh(int ), (int)14);
                            continue block37;
                        }
                        case 1991886182: {
                            break block37;
                        }
                    }
                    break;
                }
                this.elements.add(var1_1);
                if (var2_4 || var2_4) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)av.dbwk("dbys", dbwm(int ), (int)41);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl86
                    break;
                }
            }
lbl81:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)av.dbwk("dbyt", dbwm(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl86:
            // 3 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)av.dbwk("dbyu", dbwm(int ), (int)43);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)av.dbwk("dbyv", dbwm(int ), (int)44);
                if (!var4_2) ** GOTO lbl86
                throw null;
            }
lbl95:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)av.dbwk("dbyw", dbwm(int ), (int)45);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)av.dbwk("dbyx", dbwm(int ), (int)46);
        ** while (!var4_2)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void loadConfig() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcqy", dbwh(int ), (int)167)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == av.dbwk("dcqz", dbwm(int ), (int)337)) break;
            v0 /* !! */  = (long)av.dbwk("dcra", dbwm(int ), (int)338);
        }
        var3_1 = av.c;
        v1 /* !! */  = av.hd;
        if (true) ** GOTO lbl11
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - av.dbwk("dcrb", dbwh(int ), (int)168));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 911190665: {
                    v2 = av.dbwk("dcrc", dbwh(int ), (int)169);
                    continue block6;
                }
                case 1290397465: {
                    v2 = av.dbwk("dcrd", dbwh(int ), (int)170);
                    continue block6;
                }
                case 1991886182: {
                    break block6;
                }
            }
            break;
        }
        var2_2 = av.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcre", dbwh(int ), (int)171)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == av.dbwk("dcrf", dbwm(int ), (int)339)) break;
            v3 /* !! */  = (long)av.dbwk("dcrg", dbwm(int ), (int)340);
        }
        var1_3 = av.a;
        if (var3_1) {
            throw null;
lbl29:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("dcrh", dbwh(int ), (int)172)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == av.dbwk("dcri", dbwm(int ), (int)341)) break;
            v4 /* !! */  = (long)av.dbwk("dcrj", dbwm(int ), (int)342);
        }
        v5 = aj.getInstance();
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = av.hd - av.dbwk("dcrk", dbwh(int ), (int)173)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == av.dbwk("dcrl", dbwm(int ), (int)343)) break;
            v6 /* !! */  = (long)av.dbwk("dcrm", dbwm(int ), (int)344);
        }
        v5.load();
        ** while (var1_3 || var1_3)
lbl45:
        // 1 sources

    }

    private static /* synthetic */ void ddip() {
        av.dbwo[0] = -1670193005;
        av.dbwo[1] = -777878846;
        av.dbwo[2] = 910506595;
        av.dbwo[3] = 1084063091;
        av.dbwo[4] = -421820343;
        av.dbwo[5] = -211094736;
        av.dbwo[6] = -28848427;
        av.dbwo[7] = -256829471;
        av.dbwo[8] = 878929263;
        av.dbwo[9] = 753102724;
        av.dbwo[10] = 1738457016;
        av.dbwo[11] = 824689215;
        av.dbwo[12] = 460615346;
        av.dbwo[13] = -1460482606;
        av.dbwo[14] = 1985774585;
        av.dbwo[15] = -934832263;
        av.dbwo[16] = 60567897;
        av.dbwo[17] = -1278292862;
        av.dbwo[18] = -534361735;
        av.dbwo[19] = -486589153;
        av.dbwo[20] = -728581500;
        av.dbwo[21] = 2033220674;
        av.dbwo[22] = 1688619500;
        av.dbwo[23] = 1879629948;
        av.dbwo[24] = -638562120;
        av.dbwo[25] = -1156524739;
        av.dbwo[26] = -1378612733;
        av.dbwo[27] = -191401753;
        av.dbwo[28] = -1866022502;
        av.dbwo[29] = -1065555060;
        av.dbwo[30] = -1705056563;
        av.dbwo[31] = 116173656;
        av.dbwo[32] = -1403303942;
        av.dbwo[33] = -518752531;
        av.dbwo[34] = -2107009702;
        av.dbwo[35] = -368325826;
        av.dbwo[36] = -947237357;
        av.dbwo[37] = -1145265742;
        av.dbwo[38] = -2004125535;
        av.dbwo[39] = 614855822;
        av.dbwo[40] = 825135120;
        av.dbwo[41] = -1826575298;
        av.dbwo[42] = 1185532392;
        av.dbwo[43] = 1560870347;
        av.dbwo[44] = -127322730;
        av.dbwo[45] = -830400935;
        av.dbwo[46] = -1845789150;
        av.dbwo[47] = 353936782;
        av.dbwo[48] = -1197145859;
        av.dbwo[49] = -1517478900;
        av.dbwo[50] = 206064609;
        av.dbwo[51] = 1619050417;
        av.dbwo[52] = -58349887;
        av.dbwo[53] = -1069769728;
        av.dbwo[54] = 1127875082;
        av.dbwo[55] = 536884635;
        av.dbwo[56] = -1292819769;
        av.dbwo[57] = 989167639;
        av.dbwo[58] = 725338373;
        av.dbwo[59] = 1248252306;
        av.dbwo[60] = 1696666738;
        av.dbwo[61] = 1523577197;
        av.dbwo[62] = 579555066;
        av.dbwo[63] = -1682172777;
        av.dbwo[64] = 1999434037;
        av.dbwo[65] = 232354112;
        av.dbwo[66] = 2069355229;
        av.dbwo[67] = -1227760386;
        av.dbwo[68] = 496232865;
        av.dbwo[69] = -230886496;
        av.dbwo[70] = 1170432791;
        av.dbwo[71] = 960651841;
        av.dbwo[72] = 269589150;
        av.dbwo[73] = -188386974;
        av.dbwo[74] = 1099688549;
        av.dbwo[75] = 607230480;
        av.dbwo[76] = 1798704888;
        av.dbwo[77] = -844946086;
        av.dbwo[78] = -1225570560;
        av.dbwo[79] = 1092049579;
        av.dbwo[80] = -1296181987;
        av.dbwo[81] = 741009608;
        av.dbwo[82] = -684083202;
        av.dbwo[83] = -933704076;
        av.dbwo[84] = -2094060252;
        av.dbwo[85] = 1909089042;
        av.dbwo[86] = -882774793;
        av.dbwo[87] = 214764735;
        av.dbwo[88] = 1980601105;
        av.dbwo[89] = -1729953613;
        av.dbwo[90] = -96771093;
        av.dbwo[91] = -458101780;
        av.dbwo[92] = -918214313;
        av.dbwo[93] = -1461131917;
        av.dbwo[94] = -1491451549;
        av.dbwo[95] = -481075016;
        av.dbwo[96] = 75745181;
        av.dbwo[97] = -1253945896;
        av.dbwo[98] = -1754134827;
        av.dbwo[99] = -1208418609;
    }

    private static /* synthetic */ void ddik() {
        av.dbwn[200] = -140470464;
        av.dbwn[201] = 1564343519;
        av.dbwn[202] = -1109445762;
        av.dbwn[203] = 1965086016;
        av.dbwn[204] = -1819207379;
        av.dbwn[205] = -1042692155;
        av.dbwn[206] = 1772597567;
        av.dbwn[207] = -776237434;
        av.dbwn[208] = -792722117;
        av.dbwn[209] = 1905218893;
        av.dbwn[210] = -85081065;
        av.dbwn[211] = -1254235025;
        av.dbwn[212] = -2057059603;
        av.dbwn[213] = 1432689751;
        av.dbwn[214] = -348815366;
        av.dbwn[215] = -303234783;
        av.dbwn[216] = 2094100399;
        av.dbwn[217] = 736323242;
        av.dbwn[218] = -522885500;
        av.dbwn[219] = -1278331183;
        av.dbwn[220] = 306795663;
        av.dbwn[221] = -174267929;
        av.dbwn[222] = -2081222495;
        av.dbwn[223] = 1020723752;
        av.dbwn[224] = -84121938;
        av.dbwn[225] = -590990085;
        av.dbwn[226] = 214590945;
        av.dbwn[227] = -128431582;
        av.dbwn[228] = -205251061;
        av.dbwn[229] = 1708819527;
        av.dbwn[230] = -957978511;
        av.dbwn[231] = 1948427488;
        av.dbwn[232] = 1649122883;
        av.dbwn[233] = -111035851;
        av.dbwn[234] = 1297602204;
        av.dbwn[235] = 1045080919;
        av.dbwn[236] = 1482806872;
        av.dbwn[237] = -2058518803;
        av.dbwn[238] = 1994633779;
        av.dbwn[239] = 1299439460;
        av.dbwn[240] = -1265414028;
        av.dbwn[241] = -1314644515;
        av.dbwn[242] = -1279268192;
        av.dbwn[243] = -187766264;
        av.dbwn[244] = 1801316370;
        av.dbwn[245] = 1313433124;
        av.dbwn[246] = -94373942;
        av.dbwn[247] = -943062824;
        av.dbwn[248] = 581686165;
        av.dbwn[249] = -1612458291;
        av.dbwn[250] = -757320165;
        av.dbwn[251] = 1739750237;
        av.dbwn[252] = 1271450242;
        av.dbwn[253] = -1520102313;
        av.dbwn[254] = 798144797;
        av.dbwn[255] = -960728760;
        av.dbwn[256] = -1720020540;
        av.dbwn[257] = -1542389084;
        av.dbwn[258] = -1398887338;
        av.dbwn[259] = 476654796;
        av.dbwn[260] = -1063074691;
        av.dbwn[261] = 34238706;
        av.dbwn[262] = -1221419999;
        av.dbwn[263] = -783524195;
        av.dbwn[264] = -1606842850;
        av.dbwn[265] = 2031526679;
        av.dbwn[266] = 2133886211;
        av.dbwn[267] = -1586799567;
        av.dbwn[268] = -593969143;
        av.dbwn[269] = 928421964;
        av.dbwn[270] = -796797144;
        av.dbwn[271] = -526734848;
        av.dbwn[272] = 1146931243;
        av.dbwn[273] = 937223333;
        av.dbwn[274] = 310816008;
        av.dbwn[275] = 154163220;
        av.dbwn[276] = 1316742369;
        av.dbwn[277] = 1946097992;
        av.dbwn[278] = 2140914760;
        av.dbwn[279] = 941462811;
        av.dbwn[280] = -1628451319;
        av.dbwn[281] = -464119541;
        av.dbwn[282] = -1139062840;
        av.dbwn[283] = 358009874;
        av.dbwn[284] = 196981887;
        av.dbwn[285] = 2082401501;
        av.dbwn[286] = 1348959439;
        av.dbwn[287] = -229158963;
        av.dbwn[288] = 1805469639;
        av.dbwn[289] = 963635897;
        av.dbwn[290] = -788240787;
        av.dbwn[291] = 1151053851;
        av.dbwn[292] = -118516650;
        av.dbwn[293] = -2057909316;
        av.dbwn[294] = 74128215;
        av.dbwn[295] = 2044961107;
        av.dbwn[296] = 1079037609;
        av.dbwn[297] = -878322094;
        av.dbwn[298] = -449655652;
        av.dbwn[299] = 1003849674;
    }

    private static /* synthetic */ void ddin() {
        av.dbwn[500] = -959220438;
        av.dbwn[501] = -2111249168;
        av.dbwn[502] = -684110713;
        av.dbwn[503] = -1020864407;
        av.dbwn[504] = 817679934;
        av.dbwn[505] = -342709885;
        av.dbwn[506] = 1710186226;
        av.dbwn[507] = -1143978666;
        av.dbwn[508] = 1532598719;
        av.dbwn[509] = 374220231;
        av.dbwn[510] = 1179584366;
        av.dbwn[511] = -416752206;
        av.dbwn[512] = -1500393814;
        av.dbwn[513] = -1963924386;
        av.dbwn[514] = -885606797;
        av.dbwn[515] = 2066844121;
        av.dbwn[516] = 1866903504;
        av.dbwn[517] = -595869832;
        av.dbwn[518] = -493934542;
        av.dbwn[519] = 374446410;
        av.dbwn[520] = 1785324102;
        av.dbwn[521] = 1995421387;
        av.dbwn[522] = 223048186;
        av.dbwn[523] = 1172026927;
        av.dbwn[524] = 1069283862;
        av.dbwn[525] = 1775920213;
        av.dbwn[526] = 768069914;
        av.dbwn[527] = -1710016765;
        av.dbwn[528] = -22922045;
        av.dbwn[529] = 1008959511;
        av.dbwn[530] = -476702242;
        av.dbwn[531] = -1867303537;
        av.dbwn[532] = 243362882;
        av.dbwn[533] = 282396557;
        av.dbwn[534] = -1782366744;
        av.dbwn[535] = 280191041;
        av.dbwn[536] = -1309349645;
        av.dbwn[537] = -963655374;
        av.dbwn[538] = 398613047;
        av.dbwn[539] = -668122610;
        av.dbwn[540] = 379572117;
        av.dbwn[541] = 1511184220;
        av.dbwn[542] = 1511276750;
        av.dbwn[543] = -1811060731;
        av.dbwn[544] = 1691886150;
        av.dbwn[545] = -104091445;
        av.dbwn[546] = -619287980;
        av.dbwn[547] = 1470526550;
        av.dbwn[548] = 1745025768;
        av.dbwn[549] = -857906493;
        av.dbwn[550] = 1217043327;
        av.dbwn[551] = 360771107;
        av.dbwn[552] = 1287273102;
        av.dbwn[553] = -326959336;
        av.dbwn[554] = 730606517;
        av.dbwn[555] = -1401248038;
        av.dbwn[556] = 831841120;
        av.dbwn[557] = 408030035;
        av.dbwn[558] = -1951068163;
        av.dbwn[559] = 10472417;
        av.dbwn[560] = 1073159853;
        av.dbwn[561] = 2029093730;
        av.dbwn[562] = 970862009;
        av.dbwn[563] = -2014119803;
        av.dbwn[564] = 2127798639;
        av.dbwn[565] = 64620257;
        av.dbwn[566] = -1326897576;
        av.dbwn[567] = -905245821;
        av.dbwn[568] = 1692362458;
        av.dbwn[569] = 1827801330;
        av.dbwn[570] = -1950797826;
        av.dbwn[571] = 1317506953;
        av.dbwn[572] = -912211473;
        av.dbwn[573] = 1742214120;
        av.dbwn[574] = -1936350744;
        av.dbwn[575] = 1051428575;
        av.dbwn[576] = 1942948741;
        av.dbwn[577] = -606006088;
        av.dbwn[578] = -390654509;
        av.dbwn[579] = 1394061917;
        av.dbwn[580] = -1626836517;
        av.dbwn[581] = 62644381;
        av.dbwn[582] = 2070561840;
        av.dbwn[583] = 345678923;
        av.dbwn[584] = 792177186;
        av.dbwn[585] = 1930062590;
        av.dbwn[586] = -1388183812;
        av.dbwn[587] = -1080150563;
        av.dbwn[588] = -1386509314;
        av.dbwn[589] = 1817468358;
        av.dbwn[590] = -545002065;
        av.dbwn[591] = -769708268;
        av.dbwn[592] = -1543579424;
        av.dbwn[593] = -2017588752;
        av.dbwn[594] = -1869483973;
        av.dbwn[595] = 496319488;
        av.dbwn[596] = 298759160;
        av.dbwn[597] = 1378476484;
        av.dbwn[598] = -573813492;
        av.dbwn[599] = 503217106;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public av() {
        var2_1 /* !! */  = av.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.elements = new ArrayList<au>();
                this.viewportLayouts = new HashMap<Long, Map<String, av$HudPosition>>();
                this.activeViewportKey = (long)av.dbwk("dbwl", dbwh(int ), (int)0);
                this.initialized = av.dbwk("dbwp", dbwm(int ), (int)0);
                return;
            }
lbl11:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)av.dbwk("dbwq", dbwm(int ), (int)1);
            }
            case 1: {
                var2_1 /* !! */  = (int)av.dbwk("dbwr", dbwm(int ), (int)2);
                ** GOTO lbl26
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)av.dbwk("dbws", dbwm(int ), (int)3);
                    ** GOTO lbl26
                    break;
                }
            }
            case 3: {
                var2_1 /* !! */  = (int)av.dbwk("dbwt", dbwm(int ), (int)4);
                break;
            }
            case 4: {
                var2_1 /* !! */  = (int)av.dbwk("dbwu", dbwm(int ), (int)5);
                ** GOTO lbl11
            }
lbl26:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)av.dbwk("dbwv", dbwm(int ), (int)6);
            }
            case 6: 
        }
        var2_1 /* !! */  = (int)av.dbwk("dbww", dbwm(int ), (int)7);
        ** while (true)
    }

    private static /* synthetic */ void ddit() {
        av.dbwo[400] = -913584260;
        av.dbwo[401] = -1001300593;
        av.dbwo[402] = 554210840;
        av.dbwo[403] = 850644528;
        av.dbwo[404] = 129958481;
        av.dbwo[405] = 306855533;
        av.dbwo[406] = 849150138;
        av.dbwo[407] = 12533622;
        av.dbwo[408] = -1331114924;
        av.dbwo[409] = 1173687465;
        av.dbwo[410] = 784391440;
        av.dbwo[411] = 514090832;
        av.dbwo[412] = 270730405;
        av.dbwo[413] = 223264463;
        av.dbwo[414] = -287247427;
        av.dbwo[415] = 1168875539;
        av.dbwo[416] = 790879450;
        av.dbwo[417] = -144602898;
        av.dbwo[418] = 1369454727;
        av.dbwo[419] = 616992578;
        av.dbwo[420] = 1656530568;
        av.dbwo[421] = -1395411288;
        av.dbwo[422] = 217881787;
        av.dbwo[423] = 403064089;
        av.dbwo[424] = -2001220891;
        av.dbwo[425] = -1455174893;
        av.dbwo[426] = 355259239;
        av.dbwo[427] = 1803889839;
        av.dbwo[428] = 1922380002;
        av.dbwo[429] = -382368077;
        av.dbwo[430] = 1219846902;
        av.dbwo[431] = -1143492367;
        av.dbwo[432] = -1128628008;
        av.dbwo[433] = -200541184;
        av.dbwo[434] = -336525494;
        av.dbwo[435] = -264204108;
        av.dbwo[436] = -616096091;
        av.dbwo[437] = 697251029;
        av.dbwo[438] = 995346913;
        av.dbwo[439] = -1710360621;
        av.dbwo[440] = -111452743;
        av.dbwo[441] = 372325258;
        av.dbwo[442] = 157800281;
        av.dbwo[443] = -1362821022;
        av.dbwo[444] = -2019345343;
        av.dbwo[445] = -2056117950;
        av.dbwo[446] = 511945015;
        av.dbwo[447] = 1330862928;
        av.dbwo[448] = 1103466648;
        av.dbwo[449] = 1228006144;
        av.dbwo[450] = -2091603722;
        av.dbwo[451] = -1074806442;
        av.dbwo[452] = -1906455514;
        av.dbwo[453] = 447309252;
        av.dbwo[454] = 2114743736;
        av.dbwo[455] = -1421074105;
        av.dbwo[456] = -266334032;
        av.dbwo[457] = -958607764;
        av.dbwo[458] = -1830648348;
        av.dbwo[459] = -550588370;
        av.dbwo[460] = 1381189599;
        av.dbwo[461] = 799393482;
        av.dbwo[462] = -1448936787;
        av.dbwo[463] = 153601223;
        av.dbwo[464] = 1179959347;
        av.dbwo[465] = -1840329803;
        av.dbwo[466] = 1292985861;
        av.dbwo[467] = -1824229511;
        av.dbwo[468] = -2075426850;
        av.dbwo[469] = -1835642851;
        av.dbwo[470] = -617424356;
        av.dbwo[471] = 2134297986;
        av.dbwo[472] = 1040409071;
        av.dbwo[473] = 1935179104;
        av.dbwo[474] = 1305492774;
        av.dbwo[475] = 1962468211;
        av.dbwo[476] = -1384488525;
        av.dbwo[477] = -224123685;
        av.dbwo[478] = -857989791;
        av.dbwo[479] = -2141992225;
        av.dbwo[480] = 1819064407;
        av.dbwo[481] = -30099774;
        av.dbwo[482] = 2106802518;
        av.dbwo[483] = 2047479631;
        av.dbwo[484] = -1747799854;
        av.dbwo[485] = -359378380;
        av.dbwo[486] = -1059096482;
        av.dbwo[487] = 284235384;
        av.dbwo[488] = 1141724673;
        av.dbwo[489] = -809090423;
        av.dbwo[490] = 905473895;
        av.dbwo[491] = -2075930705;
        av.dbwo[492] = 1923964691;
        av.dbwo[493] = -1953792530;
        av.dbwo[494] = 1136037368;
        av.dbwo[495] = -970168676;
        av.dbwo[496] = 1402076711;
        av.dbwo[497] = -531105484;
        av.dbwo[498] = -808968334;
        av.dbwo[499] = 1126821166;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void render(class_332 var1_1, float var2_2, int var3_3, int var4_4) {
        var10_5 = av.c;
        var9_6 /* !! */  = av.b;
        if (var9_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var8_7 = av.a;
                if (var10_5) {
                    throw null;
lbl9:
                    // 17 sources

                    return;
                }
                if (var8_7 || var8_7) ** GOTO lbl9
                var5_8 = dy.getInstance();
                if (var8_7 || var8_7) ** GOTO lbl9
                if (var5_8 == null) ** GOTO lbl18
                if (var8_7) ** GOTO lbl9
                if (var5_8.isState()) ** GOTO lbl20
                if (var8_7) ** GOTO lbl9
lbl18:
                // 2 sources

                if (var8_7 || var8_7) ** GOTO lbl9
                return;
lbl20:
                // 1 sources

                if (var8_7 || var8_7) ** GOTO lbl9
                var6_9 = var5_8.getInterfaceScale();
                if (var8_7 || var8_7) ** GOTO lbl9
                this.syncViewportLayout(var6_9);
                if (var8_7 || var8_7) ** GOTO lbl9
                dz.beginFrame();
                if (var8_7) ** GOTO lbl9
                try {
                    if (var8_7) ** GOTO lbl9
                    ki.withContextScale(var6_9, (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$render$0(ruhack.phobia.dy float net.minecraft.class_332 float ), ()V)((av)this, (dy)var5_8, (float)var6_9, (class_332)var1_1, (float)var2_2));
                    if (var8_7 || var8_7) ** GOTO lbl9
                }
                catch (Throwable var7_10) {
                    if (var8_7 || var8_7) ** GOTO lbl9
                    dz.endFrame();
                    if (var8_7 || var8_7) ** GOTO lbl9
                    this.watermarkRenderedBelowPlayerList = av.dbwk("dcam", dbwm(int ), (int)63);
                    if (var8_7 || var8_7) ** GOTO lbl9
                    throw var7_10;
                }
                dz.endFrame();
                if (var8_7 || var8_7) ** GOTO lbl9
                this.watermarkRenderedBelowPlayerList = av.dbwk("dcal", dbwm(int ), (int)62);
                if (var8_7 || var8_7) ** GOTO lbl9
                if (var10_5) {
                    throw null;
                }
                if (!var8_7 && !var8_7) ** break;
                ** continue;
                return;
            }
lbl48:
            // 3 sources

            case 0: {
                var9_6 /* !! */  = (int)av.dbwk("dcan", dbwm(int ), (int)64);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl53:
            // 2 sources

            case 1: {
                var9_6 /* !! */  = (int)av.dbwk("dcao", dbwm(int ), (int)65);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl58:
            // 3 sources

            case 2: {
                var9_6 /* !! */  = (int)av.dbwk("dcap", dbwm(int ), (int)66);
                if (!var10_5) ** GOTO lbl53
                throw null;
            }
lbl62:
            // 2 sources

            case 3: {
                var9_6 /* !! */  = (int)av.dbwk("dcaq", dbwm(int ), (int)67);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl67:
            // 2 sources

            case 4: {
                var9_6 /* !! */  = (int)av.dbwk("dcar", dbwm(int ), (int)68);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl72:
            // 3 sources

            case 5: {
                var9_6 /* !! */  = (int)av.dbwk("dcas", dbwm(int ), (int)69);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 6: {
                var9_6 /* !! */  = (int)av.dbwk("dcat", dbwm(int ), (int)70);
                if (!var10_5) ** GOTO lbl62
                throw null;
            }
lbl81:
            // 2 sources

            case 7: {
                var9_6 /* !! */  = (int)av.dbwk("dcau", dbwm(int ), (int)71);
                if (!var10_5) ** GOTO lbl72
                throw null;
            }
lbl85:
            // 2 sources

            case 8: {
                var9_6 /* !! */  = (int)av.dbwk("dcav", dbwm(int ), (int)72);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 9: {
                var9_6 /* !! */  = (int)av.dbwk("dcaw", dbwm(int ), (int)73);
                if (var10_5) {
                    throw null;
                }
            }
            case 10: {
                var9_6 /* !! */  = (int)av.dbwk("dcax", dbwm(int ), (int)74);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 11: {
                var9_6 /* !! */  = (int)av.dbwk("dcay", dbwm(int ), (int)75);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 12: {
                var9_6 /* !! */  = (int)av.dbwk("dcaz", dbwm(int ), (int)76);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl109:
            // 3 sources

            case 13: {
                var9_6 /* !! */  = (int)av.dbwk("dcba", dbwm(int ), (int)77);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl114:
            // 3 sources

            case 14: {
                var9_6 /* !! */  = (int)av.dbwk("dcbb", dbwm(int ), (int)78);
                if (!var10_5) ** GOTO lbl58
                throw null;
            }
            case 15: {
                var9_6 /* !! */  = (int)av.dbwk("dcbc", dbwm(int ), (int)79);
                if (!var10_5) ** GOTO lbl48
                throw null;
            }
lbl122:
            // 2 sources

            case 16: {
                var9_6 /* !! */  = (int)av.dbwk("dcbd", dbwm(int ), (int)80);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl127:
            // 4 sources

            case 17: {
                var9_6 /* !! */  = (int)av.dbwk("dcbe", dbwm(int ), (int)81);
                if (var10_5) {
                    throw null;
                }
                ** GOTO lbl164
            }
lbl132:
            // 2 sources

            case 18: {
                var9_6 /* !! */  = (int)av.dbwk("dcbf", dbwm(int ), (int)82);
                if (!var10_5) ** GOTO lbl58
                throw null;
            }
            case 19: {
                var9_6 /* !! */  = (int)av.dbwk("dcbg", dbwm(int ), (int)83);
                if (!var10_5) ** GOTO lbl81
                throw null;
            }
lbl140:
            // 2 sources

            case 20: {
                var9_6 /* !! */  = (int)av.dbwk("dcbh", dbwm(int ), (int)84);
                if (!var10_5) ** GOTO lbl122
                throw null;
            }
lbl144:
            // 2 sources

            case 21: {
                var9_6 /* !! */  = (int)av.dbwk("dcbi", dbwm(int ), (int)85);
                if (!var10_5) ** GOTO lbl85
                throw null;
            }
lbl148:
            // 3 sources

            case 22: {
                var9_6 /* !! */  = (int)av.dbwk("dcbj", dbwm(int ), (int)86);
                if (!var10_5) ** GOTO lbl48
                throw null;
            }
lbl152:
            // 3 sources

            case 23: {
                var9_6 /* !! */  = (int)av.dbwk("dcbk", dbwm(int ), (int)87);
                if (!var10_5) ** GOTO lbl72
                throw null;
            }
            case 24: {
                var9_6 /* !! */  = (int)av.dbwk("dcbl", dbwm(int ), (int)88);
                if (!var10_5) ** GOTO lbl148
                throw null;
            }
            case 25: {
                var9_6 /* !! */  = (int)av.dbwk("dcbm", dbwm(int ), (int)89);
                if (!var10_5) ** GOTO lbl144
                throw null;
            }
lbl164:
            // 3 sources

            case 26: {
                var9_6 /* !! */  = (int)av.dbwk("dcbn", dbwm(int ), (int)90);
                if (!var10_5) ** GOTO lbl127
                throw null;
            }
lbl168:
            // 3 sources

            case 27: {
                var9_6 /* !! */  = (int)av.dbwk("dcbo", dbwm(int ), (int)91);
                if (!var10_5) ** GOTO lbl67
                throw null;
            }
lbl172:
            // 2 sources

            case 28: {
                var9_6 /* !! */  = (int)av.dbwk("dcbp", dbwm(int ), (int)92);
                if (!var10_5) ** GOTO lbl140
                throw null;
            }
            case 29: {
                var9_6 /* !! */  = (int)av.dbwk("dcbq", dbwm(int ), (int)93);
                if (!var10_5) ** GOTO lbl127
                throw null;
            }
            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_6 /* !! */  = (int)av.dbwk("dcbr", dbwm(int ), (int)94);
                    if (!var10_5) ** GOTO lbl152
                    throw null;
                }
            }
            case 31: {
                var9_6 /* !! */  = (int)av.dbwk("dcbs", dbwm(int ), (int)95);
                if (!var10_5) ** GOTO lbl132
                throw null;
            }
            case 32: 
        }
        var9_6 /* !! */  = (int)av.dbwk("dcbt", dbwm(int ), (int)96);
        ** while (!var10_5)
lbl192:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ddiq() {
        av.dbwo[100] = -1504857659;
        av.dbwo[101] = 1530336220;
        av.dbwo[102] = 1358613324;
        av.dbwo[103] = -2083361115;
        av.dbwo[104] = -1560790231;
        av.dbwo[105] = 2080852703;
        av.dbwo[106] = 39770696;
        av.dbwo[107] = 450161797;
        av.dbwo[108] = -2120951257;
        av.dbwo[109] = 909846238;
        av.dbwo[110] = -1343693598;
        av.dbwo[111] = -1475795735;
        av.dbwo[112] = 981168095;
        av.dbwo[113] = 61711077;
        av.dbwo[114] = -1702301388;
        av.dbwo[115] = 1709834764;
        av.dbwo[116] = -1060452293;
        av.dbwo[117] = 871799490;
        av.dbwo[118] = 2080986103;
        av.dbwo[119] = 745160381;
        av.dbwo[120] = -1339910609;
        av.dbwo[121] = -2081403909;
        av.dbwo[122] = 1974567020;
        av.dbwo[123] = -1186999690;
        av.dbwo[124] = -766873535;
        av.dbwo[125] = 1314877953;
        av.dbwo[126] = -383718784;
        av.dbwo[127] = 1500613293;
        av.dbwo[128] = -1179807413;
        av.dbwo[129] = 780431780;
        av.dbwo[130] = -1005013206;
        av.dbwo[131] = 504653161;
        av.dbwo[132] = 768303487;
        av.dbwo[133] = 1834637054;
        av.dbwo[134] = -337315991;
        av.dbwo[135] = 1868631476;
        av.dbwo[136] = 409826202;
        av.dbwo[137] = 1056451964;
        av.dbwo[138] = 2105143050;
        av.dbwo[139] = 171331736;
        av.dbwo[140] = -550232358;
        av.dbwo[141] = 534041434;
        av.dbwo[142] = 1388127630;
        av.dbwo[143] = -407346745;
        av.dbwo[144] = 1955214777;
        av.dbwo[145] = -2086802449;
        av.dbwo[146] = -2104670136;
        av.dbwo[147] = 253906776;
        av.dbwo[148] = -56453302;
        av.dbwo[149] = -806304589;
        av.dbwo[150] = 239079158;
        av.dbwo[151] = -849140107;
        av.dbwo[152] = -567237951;
        av.dbwo[153] = -13841391;
        av.dbwo[154] = -847697224;
        av.dbwo[155] = -1693790491;
        av.dbwo[156] = 972598656;
        av.dbwo[157] = -1767020268;
        av.dbwo[158] = 780588462;
        av.dbwo[159] = -806319130;
        av.dbwo[160] = -1565012900;
        av.dbwo[161] = 299402134;
        av.dbwo[162] = -942271068;
        av.dbwo[163] = 95809278;
        av.dbwo[164] = 0x6A00A0A;
        av.dbwo[165] = -1070077375;
        av.dbwo[166] = -1123857504;
        av.dbwo[167] = 1705889506;
        av.dbwo[168] = 547505970;
        av.dbwo[169] = 1578789579;
        av.dbwo[170] = 427148611;
        av.dbwo[171] = 2059199325;
        av.dbwo[172] = 1711094926;
        av.dbwo[173] = 1575977188;
        av.dbwo[174] = 964569370;
        av.dbwo[175] = 716085399;
        av.dbwo[176] = 97032125;
        av.dbwo[177] = -2122422107;
        av.dbwo[178] = -752513792;
        av.dbwo[179] = -1892518851;
        av.dbwo[180] = 358014848;
        av.dbwo[181] = 1797035703;
        av.dbwo[182] = -1167829240;
        av.dbwo[183] = -1785490894;
        av.dbwo[184] = -52228946;
        av.dbwo[185] = -1194617313;
        av.dbwo[186] = -1399989084;
        av.dbwo[187] = 1210343858;
        av.dbwo[188] = 1074656215;
        av.dbwo[189] = -1899490322;
        av.dbwo[190] = 1599488344;
        av.dbwo[191] = -1204642990;
        av.dbwo[192] = -1188498710;
        av.dbwo[193] = 1796505953;
        av.dbwo[194] = -1423873381;
        av.dbwo[195] = -1342733652;
        av.dbwo[196] = 698205938;
        av.dbwo[197] = -1304609951;
        av.dbwo[198] = -965355210;
        av.dbwo[199] = 1841152955;
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$renderWatermarkBelowPlayerList$1(float var1_1, class_332 var2_2, float var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 21[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
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
    public void constrainToViewport(au var1_1) {
        v0 /* !! */  = av.hd;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(av.dbwk("dcux", dbwh(int ), (int)215) - av.dbwk("dcuw", dbwh(int ), (int)214));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1005448972: {
                    continue block18;
                }
                case 1991886182: {
                    break block18;
                }
            }
            break;
        }
        var4_2 = av.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcuy", dbwh(int ), (int)216)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == av.dbwk("dcuz", dbwm(int ), (int)390)) break;
            v1 /* !! */  = (long)av.dbwk("dcva", dbwm(int ), (int)391);
        }
        var3_3 /* !! */  = av.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcvb", dbwh(int ), (int)217)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == av.dbwk("dcvc", dbwm(int ), (int)392)) break;
            v2 /* !! */  = (long)av.dbwk("dcvd", dbwm(int ), (int)393);
        }
        var2_4 = av.a;
        if (!var4_2) ** GOTO lbl29
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl29:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl-1000
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("dcve", dbwh(int ), (int)218)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == av.dbwk("dcvf", dbwm(int ), (int)394)) break;
                    v3 /* !! */  = (long)av.dbwk("dcvg", dbwm(int ), (int)395);
                }
                v4 = this.getHudScale();
                v5 /* !! */  = av.hd;
                if (true) ** GOTO lbl40
                block23: while (true) {
                    v5 /* !! */  = (long)(v6 - av.dbwk("dcvh", dbwh(int ), (int)219));
lbl40:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1597793484: {
                            v6 = av.dbwk("dcvi", dbwh(int ), (int)220);
                            continue block23;
                        }
                        case -186022607: {
                            v6 = av.dbwk("dcvj", dbwh(int ), (int)221);
                            continue block23;
                        }
                        case 1336802040: {
                            v6 = av.dbwk("dcvk", dbwh(int ), (int)222);
                            continue block23;
                        }
                        case 1991886182: {
                            break block23;
                        }
                    }
                    break;
                }
                this.constrainToViewport(var1_1, v4);
                if (var2_4 || var2_4) continue block21;
                return;
                case 0: {
                    do {
                        var3_3 /* !! */  = (int)av.dbwk("dcvl", dbwm(int ), (int)396);
                    } while (!var4_2);
                    throw null;
                }
                case 1: {
                    var3_3 /* !! */  = (int)av.dbwk("dcvm", dbwm(int ), (int)397);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var3_3 /* !! */  = (int)av.dbwk("dcvn", dbwm(int ), (int)398);
                    } while (!var4_2);
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)av.dbwk("dcvo", dbwm(int ), (int)399);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)av.dbwk("dcvp", dbwm(int ), (int)400);
                        if (!var4_2) break block21;
                        throw null;
                    }
                }
                case 5: 
            }
        }
        var3_3 /* !! */  = (int)av.dbwk("dcvq", dbwm(int ), (int)401);
        ** while (!var4_2)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ddim() {
        av.dbwn[400] = -913584260;
        av.dbwn[401] = -1001300594;
        av.dbwn[402] = 554210844;
        av.dbwn[403] = 850644529;
        av.dbwn[404] = 254935106;
        av.dbwn[405] = 778692967;
        av.dbwn[406] = -849150139;
        av.dbwn[407] = -212654408;
        av.dbwn[408] = -1331114923;
        av.dbwn[409] = -1896883809;
        av.dbwn[410] = 316869146;
        av.dbwn[411] = -514090833;
        av.dbwn[412] = -1757403771;
        av.dbwn[413] = 223264462;
        av.dbwn[414] = -53914868;
        av.dbwn[415] = 1168875538;
        av.dbwn[416] = -2091991398;
        av.dbwn[417] = 144602897;
        av.dbwn[418] = 1919630057;
        av.dbwn[419] = 616992579;
        av.dbwn[420] = 1712413978;
        av.dbwn[421] = -1395411269;
        av.dbwn[422] = 217881779;
        av.dbwn[423] = 403064087;
        av.dbwn[424] = -2001220875;
        av.dbwn[425] = -1455174894;
        av.dbwn[426] = 355259254;
        av.dbwn[427] = 1803889836;
        av.dbwn[428] = 1922380001;
        av.dbwn[429] = -382368072;
        av.dbwn[430] = 1219846907;
        av.dbwn[431] = -1143492357;
        av.dbwn[432] = -1128628022;
        av.dbwn[433] = -200541173;
        av.dbwn[434] = -336525501;
        av.dbwn[435] = -264204109;
        av.dbwn[436] = -616096077;
        av.dbwn[437] = 697251035;
        av.dbwn[438] = 995346928;
        av.dbwn[439] = -1710360624;
        av.dbwn[440] = -111452756;
        av.dbwn[441] = 372325273;
        av.dbwn[442] = 157800277;
        av.dbwn[443] = -1362821010;
        av.dbwn[444] = -1149179061;
        av.dbwn[445] = -1185810872;
        av.dbwn[446] = 511944983;
        av.dbwn[447] = 1330862946;
        av.dbwn[448] = 1103466624;
        av.dbwn[449] = 1228006180;
        av.dbwn[450] = -2091603733;
        av.dbwn[451] = -1074806458;
        av.dbwn[452] = -1906455535;
        av.dbwn[453] = 447309255;
        av.dbwn[454] = 2114743718;
        av.dbwn[455] = -1421074104;
        av.dbwn[456] = -266334027;
        av.dbwn[457] = -958607798;
        av.dbwn[458] = -1830648332;
        av.dbwn[459] = -550588354;
        av.dbwn[460] = 1381189611;
        av.dbwn[461] = 799393478;
        av.dbwn[462] = -1448936792;
        av.dbwn[463] = 153601248;
        av.dbwn[464] = 1179959324;
        av.dbwn[465] = -1840329853;
        av.dbwn[466] = 1292985872;
        av.dbwn[467] = -1824229541;
        av.dbwn[468] = -2075426879;
        av.dbwn[469] = -1835642871;
        av.dbwn[470] = -617424378;
        av.dbwn[471] = 2134297996;
        av.dbwn[472] = 1040409035;
        av.dbwn[473] = 1935179121;
        av.dbwn[474] = 1305492784;
        av.dbwn[475] = 1962468200;
        av.dbwn[476] = -1384488558;
        av.dbwn[477] = -224123695;
        av.dbwn[478] = -857989775;
        av.dbwn[479] = -2141992204;
        av.dbwn[480] = 1819064444;
        av.dbwn[481] = -30099743;
        av.dbwn[482] = 2106802558;
        av.dbwn[483] = 2047479645;
        av.dbwn[484] = -1747799868;
        av.dbwn[485] = -359378383;
        av.dbwn[486] = -1059096501;
        av.dbwn[487] = 284235386;
        av.dbwn[488] = 1141724672;
        av.dbwn[489] = -809090371;
        av.dbwn[490] = 905473895;
        av.dbwn[491] = -2075930737;
        av.dbwn[492] = 1923964731;
        av.dbwn[493] = -1953792532;
        av.dbwn[494] = 1136037370;
        av.dbwn[495] = -970168673;
        av.dbwn[496] = 1402076722;
        av.dbwn[497] = -531105475;
        av.dbwn[498] = -808968366;
        av.dbwn[499] = 1126821130;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getHudScale() {
        block49: {
            v0 /* !! */  = av.hd;
            if (true) ** GOTO lbl5
            block32: while (true) {
                v0 /* !! */  = (long)(av.dbwk("dctc", dbwh(int ), (int)192) - av.dbwk("dctb", dbwh(int ), (int)191));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1839747730: {
                        continue block32;
                    }
                    case 1991886182: {
                        break block32;
                    }
                }
                break;
            }
            var4_1 = av.c;
            v1 /* !! */  = av.hd;
            if (true) ** GOTO lbl15
            block33: while (true) {
                v1 /* !! */  = (long)(v2 - av.dbwk("dctd", dbwh(int ), (int)193));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -156290945: {
                        v2 = av.dbwk("dcte", dbwh(int ), (int)194);
                        continue block33;
                    }
                    case 855376417: {
                        v2 = av.dbwk("dctf", dbwh(int ), (int)195);
                        continue block33;
                    }
                    case 1062560532: {
                        v2 = av.dbwk("dctg", dbwh(int ), (int)196);
                        continue block33;
                    }
                    case 1991886182: {
                        break block33;
                    }
                }
                break;
            }
            var3_2 /* !! */  = av.b;
            v3 /* !! */  = av.hd;
            if (true) ** GOTO lbl32
            block34: while (true) {
                v3 /* !! */  = (long)(v4 - av.dbwk("dcth", dbwh(int ), (int)197));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 11333825: {
                        v4 = av.dbwk("dcti", dbwh(int ), (int)198);
                        continue block34;
                    }
                    case 62947912: {
                        v4 = av.dbwk("dctj", dbwh(int ), (int)199);
                        continue block34;
                    }
                    case 833353159: {
                        v4 = av.dbwk("dctk", dbwh(int ), (int)200);
                        continue block34;
                    }
                    case 1991886182: {
                        break block34;
                    }
                }
                break;
            }
            var2_3 = av.a;
            if (var4_1) {
                throw null;
lbl47:
                // 4 sources

                return (float)av.dbwk("dctm", dctl(int ), (int)368);
            }
            if (var2_3 || var2_3) ** GOTO lbl47
            v5 /* !! */  = av.hd;
            if (true) ** GOTO lbl54
            block36: while (true) {
                v5 /* !! */  = (long)(av.dbwk("dcto", dbwh(int ), (int)202) - av.dbwk("dctn", dbwh(int ), (int)201));
lbl54:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case 1382187392: {
                        continue block36;
                    }
                    case 1991886182: {
                        break block36;
                    }
                }
                break;
            }
            var1_4 = dy.getInstance();
            if (var2_3 || var2_3) ** GOTO lbl47
            if (var1_4 == null) break block49;
            if (var2_3) ** GOTO lbl47
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dctp", dbwh(int ), (int)203)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == av.dbwk("dctq", dbwm(int ), (int)369)) break;
                v6 /* !! */  = (long)av.dbwk("dctr", dbwm(int ), (int)370);
            }
            v7 = var1_4.getInterfaceScale();
            if (var4_1) {
                throw null;
            }
            ** GOTO lbl79
        }
        if (!var2_3 && !var2_3) ** break;
        ** while (true)
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v7 = 1.0f;
lbl79:
                // 2 sources

                return v7;
            }
            case 0: {
                var3_2 /* !! */  = (int)av.dbwk("dcts", dbwm(int ), (int)371);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 1: {
                var3_2 /* !! */  = (int)av.dbwk("dctt", dbwm(int ), (int)372);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl90:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)av.dbwk("dctu", dbwm(int ), (int)373);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl105
                    break;
                }
            }
lbl96:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)av.dbwk("dctv", dbwm(int ), (int)374);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl101:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)av.dbwk("dctw", dbwm(int ), (int)375);
                if (!var4_1) ** GOTO lbl90
                throw null;
            }
lbl105:
            // 4 sources

            case 5: {
                var3_2 /* !! */  = (int)av.dbwk("dctx", dbwm(int ), (int)376);
                if (!var4_1) ** GOTO lbl101
                throw null;
            }
lbl109:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)av.dbwk("dcty", dbwm(int ), (int)377);
                if (!var4_1) ** GOTO lbl96
                throw null;
            }
lbl113:
            // 2 sources

            case 7: {
                var3_2 /* !! */  = (int)av.dbwk("dctz", dbwm(int ), (int)378);
                if (!var4_1) ** GOTO lbl101
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)av.dbwk("dcua", dbwm(int ), (int)379);
                if (!var4_1) ** GOTO lbl105
                throw null;
            }
            case 9: 
        }
        var3_2 /* !! */  = (int)av.dbwk("dcub", dbwm(int ), (int)380);
        ** while (!var4_1)
lbl124:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void tick() {
        block100: {
            block101: {
                v0 /* !! */  = av.hd;
                if (true) ** GOTO lbl5
                block67: while (true) {
                    v0 /* !! */  = (long)(v1 - av.dbwk("dcde", dbwh(int ), (int)39));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1731042289: {
                            v1 = av.dbwk("dcdf", dbwh(int ), (int)40);
                            continue block67;
                        }
                        case 1173460169: {
                            v1 = av.dbwk("dcdg", dbwh(int ), (int)41);
                            continue block67;
                        }
                        case 1991886182: {
                            break block67;
                        }
                        case 2089145490: {
                            v1 = av.dbwk("dcdh", dbwh(int ), (int)42);
                            continue block67;
                        }
                    }
                    break;
                }
                var6_1 = av.c;
                v2 /* !! */  = av.hd;
                if (true) ** GOTO lbl22
                block68: while (true) {
                    v2 /* !! */  = (long)(v3 - av.dbwk("dcdi", dbwh(int ), (int)43));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1716267650: {
                            v3 = av.dbwk("dcdj", dbwh(int ), (int)44);
                            continue block68;
                        }
                        case -199965515: {
                            v3 = av.dbwk("dcdk", dbwh(int ), (int)45);
                            continue block68;
                        }
                        case 1234186876: {
                            v3 = av.dbwk("dcdl", dbwh(int ), (int)46);
                            continue block68;
                        }
                        case 1991886182: {
                            break block68;
                        }
                    }
                    break;
                }
                var5_2 /* !! */  = av.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dcdm", dbwh(int ), (int)47)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == av.dbwk("dcdn", dbwm(int ), (int)133)) break;
                    v4 /* !! */  = (long)av.dbwk("dcdo", dbwm(int ), (int)134);
                }
                var4_3 = av.a;
                if (var6_1) {
                    throw null;
lbl43:
                    // 12 sources

                    return;
                }
                if (var4_3 || var4_3) ** GOTO lbl43
                v5 /* !! */  = av.hd;
                if (true) ** GOTO lbl50
                block71: while (true) {
                    v5 /* !! */  = (long)(av.dbwk("dcdq", dbwh(int ), (int)49) - av.dbwk("dcdp", dbwh(int ), (int)48));
lbl50:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1613520826: {
                            continue block71;
                        }
                        case 1991886182: {
                            break block71;
                        }
                    }
                    break;
                }
                var1_4 = dy.getInstance();
                if (var4_3 || var4_3) ** GOTO lbl43
                if (var1_4 != null) break block101;
                if (var4_3) ** GOTO lbl43
                return;
            }
            if (var4_3 || var4_3) ** GOTO lbl43
            v6 /* !! */  = av.hd;
            if (true) ** GOTO lbl66
            block72: while (true) {
                v6 /* !! */  = (long)(av.dbwk("dcds", dbwh(int ), (int)51) - av.dbwk("dcdr", dbwh(int ), (int)50));
lbl66:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -102553085: {
                        continue block72;
                    }
                    case 1991886182: {
                        break block72;
                    }
                }
                break;
            }
            v7 /* !! */  = av.hd;
            if (true) ** GOTO lbl75
            block73: while (true) {
                v7 /* !! */  = (long)(v8 - av.dbwk("dcdt", dbwh(int ), (int)52));
lbl75:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1419263790: {
                        v8 = av.dbwk("dcdu", dbwh(int ), (int)53);
                        continue block73;
                    }
                    case -900579473: {
                        v8 = av.dbwk("dcdv", dbwh(int ), (int)54);
                        continue block73;
                    }
                    case 1523716993: {
                        v8 = av.dbwk("dcdw", dbwh(int ), (int)55);
                        continue block73;
                    }
                    case 1991886182: {
                        break block73;
                    }
                }
                break;
            }
            var2_5 = this.elements.iterator();
            if (var4_3) ** GOTO lbl43
            do {
                block102: {
                    if (var4_3 || var4_3) ** GOTO lbl43
                    v9 /* !! */  = av.hd;
                    if (true) ** GOTO lbl95
                    block75: while (true) {
                        v9 /* !! */  = (long)(v10 - av.dbwk("dcdx", dbwh(int ), (int)56));
lbl95:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1072368395: {
                                v10 = av.dbwk("dcdy", dbwh(int ), (int)57);
                                continue block75;
                            }
                            case 1004807267: {
                                v10 = av.dbwk("dcdz", dbwh(int ), (int)58);
                                continue block75;
                            }
                            case 1675862431: {
                                v10 = av.dbwk("dcea", dbwh(int ), (int)59);
                                continue block75;
                            }
                            case 1991886182: {
                                break block75;
                            }
                        }
                        break;
                    }
                    if (!var2_5.hasNext()) break block100;
                    if (var4_3) ** GOTO lbl43
                    v11 /* !! */  = av.hd;
                    if (true) ** GOTO lbl113
                    block76: while (true) {
                        v11 /* !! */  = (long)(v12 - av.dbwk("dceb", dbwh(int ), (int)60));
lbl113:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -394433435: {
                                v12 = av.dbwk("dcec", dbwh(int ), (int)61);
                                continue block76;
                            }
                            case 992961731: {
                                v12 = av.dbwk("dced", dbwh(int ), (int)62);
                                continue block76;
                            }
                            case 1991886182: {
                                break block76;
                            }
                        }
                        break;
                    }
                    var3_6 = var2_5.next();
                    if (var4_3 || var4_3) ** GOTO lbl43
                    v13 /* !! */  = av.hd;
                    if (true) ** GOTO lbl128
                    block77: while (true) {
                        v13 /* !! */  = (long)(v14 - av.dbwk("dcee", dbwh(int ), (int)63));
lbl128:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case 1312398903: {
                                v14 = av.dbwk("dcef", dbwh(int ), (int)64);
                                continue block77;
                            }
                            case 1677340320: {
                                v14 = av.dbwk("dceg", dbwh(int ), (int)65);
                                continue block77;
                            }
                            case 1991886182: {
                                break block77;
                            }
                        }
                        break;
                    }
                    if (!this.isElementEnabled(var3_6, var1_4)) break block102;
                    if (var4_3 || var4_3) ** GOTO lbl43
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dceh", dbwh(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == av.dbwk("dcei", dbwm(int ), (int)135)) break;
                        v15 /* !! */  = (long)av.dbwk("dcej", dbwm(int ), (int)136);
                    }
                    var3_6.tick();
                    if (var4_3) ** GOTO lbl43
                }
                if (var4_3 || var4_3) ** GOTO lbl43
            } while (!var6_1);
            throw null;
        }
        if (!var4_3 && !var4_3) ** break;
        ** while (true)
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        block42 : switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: {
                var5_2 /* !! */  = (int)av.dbwk("dcek", dbwm(int ), (int)137);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl162:
            // 2 sources

            case 1: {
                var5_2 /* !! */  = (int)av.dbwk("dcel", dbwm(int ), (int)138);
                if (!var6_1) break;
                throw null;
            }
            case 2: {
                var5_2 /* !! */  = (int)av.dbwk("dcem", dbwm(int ), (int)139);
                if (!var6_1) ** GOTO lbl162
                throw null;
            }
            case 3: {
                var5_2 /* !! */  = (int)av.dbwk("dcen", dbwm(int ), (int)140);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl175:
            // 3 sources

            case 4: {
                var5_2 /* !! */  = (int)av.dbwk("dceo", dbwm(int ), (int)141);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl180:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)av.dbwk("dcep", dbwm(int ), (int)142);
                    if (!var6_1) break block42;
                    throw null;
                }
            }
lbl185:
            // 2 sources

            case 6: {
                var5_2 /* !! */  = (int)av.dbwk("dceq", dbwm(int ), (int)143);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl200
            }
            case 7: {
                var5_2 /* !! */  = (int)av.dbwk("dcer", dbwm(int ), (int)144);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 8: {
                var5_2 /* !! */  = (int)av.dbwk("dces", dbwm(int ), (int)145);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl200:
            // 3 sources

            case 9: {
                var5_2 /* !! */  = (int)av.dbwk("dcet", dbwm(int ), (int)146);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 10: {
                var5_2 /* !! */  = (int)av.dbwk("dceu", dbwm(int ), (int)147);
                if (!var6_1) ** GOTO lbl175
                throw null;
            }
lbl209:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)av.dbwk("dcev", dbwm(int ), (int)148);
                if (var6_1) {
                    throw null;
                }
            }
            case 12: {
                var5_2 /* !! */  = (int)av.dbwk("dcew", dbwm(int ), (int)149);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl222
            }
            case 13: {
                var5_2 /* !! */  = (int)av.dbwk("dcex", dbwm(int ), (int)150);
                if (!var6_1) ** GOTO lbl180
                throw null;
            }
lbl222:
            // 3 sources

            case 14: {
                var5_2 /* !! */  = (int)av.dbwk("dcey", dbwm(int ), (int)151);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl227:
            // 4 sources

            case 15: {
                var5_2 /* !! */  = (int)av.dbwk("dcez", dbwm(int ), (int)152);
                if (!var6_1) ** GOTO lbl209
                throw null;
            }
lbl231:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)av.dbwk("dcfa", dbwm(int ), (int)153);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl236:
            // 3 sources

            case 17: {
                var5_2 /* !! */  = (int)av.dbwk("dcfb", dbwm(int ), (int)154);
                if (!var6_1) ** GOTO lbl227
                throw null;
            }
lbl240:
            // 2 sources

            case 18: {
                var5_2 /* !! */  = (int)av.dbwk("dcfc", dbwm(int ), (int)155);
                if (!var6_1) ** GOTO lbl200
                throw null;
            }
            case 19: {
                do {
                    var5_2 /* !! */  = (int)av.dbwk("dcfd", dbwm(int ), (int)156);
                } while (!var6_1);
                throw null;
            }
            case 20: {
                var5_2 /* !! */  = (int)av.dbwk("dcfe", dbwm(int ), (int)157);
                if (!var6_1) ** GOTO lbl227
                throw null;
            }
lbl253:
            // 2 sources

            case 21: {
                var5_2 /* !! */  = (int)av.dbwk("dcff", dbwm(int ), (int)158);
                if (!var6_1) ** GOTO lbl185
                throw null;
            }
            case 22: 
        }
        var5_2 /* !! */  = (int)av.dbwk("dcfg", dbwm(int ), (int)159);
        ** while (!var6_1)
lbl260:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ddjc() {
        av.dbwj[200] = 2994352795624446557L;
        av.dbwj[201] = 3130618195630737732L;
        av.dbwj[202] = 7629803177988723341L;
        av.dbwj[203] = -3735899474718014115L;
        av.dbwj[204] = 5446523005187807280L;
        av.dbwj[205] = -3051377428541026837L;
        av.dbwj[206] = 5856510804475479353L;
        av.dbwj[207] = -2055573838036482937L;
        av.dbwj[208] = 8767155850331457180L;
        av.dbwj[209] = 8917300668202806521L;
        av.dbwj[210] = 7117936988209194712L;
        av.dbwj[211] = -6535202720820081791L;
        av.dbwj[212] = -6312451459293047842L;
        av.dbwj[213] = 5502453676793559327L;
        av.dbwj[214] = 1266410394215763512L;
        av.dbwj[215] = -6908414375791155069L;
        av.dbwj[216] = -5915720503190067078L;
        av.dbwj[217] = -1772783225272170531L;
        av.dbwj[218] = 4603203389814453555L;
        av.dbwj[219] = -8092836605767553388L;
        av.dbwj[220] = 2323402690530641743L;
        av.dbwj[221] = 7635342543205593166L;
        av.dbwj[222] = -5020693989615949910L;
        av.dbwj[223] = 1532793811618692658L;
        av.dbwj[224] = -9057384112345186598L;
        av.dbwj[225] = -1237021208395322524L;
        av.dbwj[226] = -6370305939865339730L;
        av.dbwj[227] = 9167761300866152734L;
        av.dbwj[228] = 3443443827852925561L;
        av.dbwj[229] = -469293343880640099L;
        av.dbwj[230] = -359344464214097959L;
        av.dbwj[231] = -5744612239942740228L;
        av.dbwj[232] = -1898596845826417586L;
        av.dbwj[233] = -8533819855095350254L;
        av.dbwj[234] = 2691785482944195811L;
        av.dbwj[235] = 6358119762557055443L;
        av.dbwj[236] = -5235765648928176568L;
        av.dbwj[237] = 5858085247328300199L;
        av.dbwj[238] = 8666627778168552923L;
        av.dbwj[239] = -2633915340695808103L;
        av.dbwj[240] = 2387317344453036562L;
        av.dbwj[241] = -839721863374840844L;
        av.dbwj[242] = 469168554074693717L;
        av.dbwj[243] = -3280650017013549476L;
        av.dbwj[244] = 1935575965668217473L;
        av.dbwj[245] = -1547502592853692527L;
        av.dbwj[246] = 3169811955625067651L;
        av.dbwj[247] = 8366114309856752048L;
        av.dbwj[248] = 1306057800440500528L;
        av.dbwj[249] = -751199717177241320L;
        av.dbwj[250] = 8957836897593138329L;
        av.dbwj[251] = 8777508320839264336L;
        av.dbwj[252] = -1316379996925841952L;
        av.dbwj[253] = 7275252962332451162L;
        av.dbwj[254] = 6371165959198147814L;
        av.dbwj[255] = 4976747243867096416L;
        av.dbwj[256] = -7452833874698035927L;
        av.dbwj[257] = 8410235991064487861L;
        av.dbwj[258] = -5944203598918275748L;
        av.dbwj[259] = -6638389165203157597L;
        av.dbwj[260] = 6665807407203385743L;
        av.dbwj[261] = -664660314986187177L;
        av.dbwj[262] = -5939910008450085770L;
        av.dbwj[263] = -2425897970687351034L;
        av.dbwj[264] = 8732173168281930612L;
        av.dbwj[265] = 6400260666922006973L;
        av.dbwj[266] = 4130542561873651770L;
        av.dbwj[267] = -5217161482543194862L;
        av.dbwj[268] = 2162401634651159353L;
        av.dbwj[269] = 295167539833011267L;
        av.dbwj[270] = -3560149883940828312L;
        av.dbwj[271] = -1993104043945309767L;
        av.dbwj[272] = 7703287492298878087L;
        av.dbwj[273] = -338450017996863517L;
        av.dbwj[274] = 8922247471447905574L;
        av.dbwj[275] = -450589940289598640L;
        av.dbwj[276] = -6810889300882185983L;
        av.dbwj[277] = -6831058306290429584L;
        av.dbwj[278] = 5282003605925434145L;
        av.dbwj[279] = 1885816826280696286L;
        av.dbwj[280] = -1117460659174706231L;
        av.dbwj[281] = 8106798318024501243L;
        av.dbwj[282] = 4898043188734038513L;
        av.dbwj[283] = -1358385751587599736L;
        av.dbwj[284] = -5482434661136790674L;
        av.dbwj[285] = 597035471164917821L;
        av.dbwj[286] = 8200276935497318636L;
        av.dbwj[287] = 7020691780163992805L;
        av.dbwj[288] = 3733412237143330460L;
        av.dbwj[289] = 2613542507679410825L;
        av.dbwj[290] = 8141588873694011849L;
        av.dbwj[291] = -8648293090768086705L;
        av.dbwj[292] = -735100966900749487L;
        av.dbwj[293] = 4420052279861733408L;
        av.dbwj[294] = 5501464573263338338L;
        av.dbwj[295] = -5952074070956262562L;
        av.dbwj[296] = 3546832835903587138L;
        av.dbwj[297] = 6633148471467370374L;
        av.dbwj[298] = -3443192493839119399L;
        av.dbwj[299] = 7051008129998058569L;
    }

    private static /* synthetic */ void ddio() {
        av.dbwn[600] = -1029534595;
        av.dbwn[601] = -1541802893;
        av.dbwn[602] = -1870197884;
        av.dbwn[603] = -425508168;
        av.dbwn[604] = -886013061;
        av.dbwn[605] = 185211560;
        av.dbwn[606] = 946807264;
        av.dbwn[607] = -1856249716;
        av.dbwn[608] = -1110078680;
        av.dbwn[609] = -967652352;
        av.dbwn[610] = -1939711757;
        av.dbwn[611] = 1064010056;
        av.dbwn[612] = -1752643733;
        av.dbwn[613] = -986722280;
        av.dbwn[614] = 495389403;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public au getElementAt(double var1_1, double var3_2) {
        var13_3 = av.c;
        var12_4 /* !! */  = av.b;
        if (var12_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var11_5 = av.a;
                if (var13_3) {
                    throw null;
lbl9:
                    // 16 sources

                    return null;
                }
                if (var11_5 || var11_5) ** GOTO lbl9
                var5_6 = this.toHudCoordinate(var1_1);
                if (var11_5 || var11_5) ** GOTO lbl9
                var7_7 = this.toHudCoordinate(var3_2);
                if (var11_5 || var11_5) ** GOTO lbl9
                var9_8 = this.elements.size() - av.dbwk("dchf", dbwm(int ), (int)187);
                if (var11_5) ** GOTO lbl9
                do {
                    if (var11_5 || var11_5) ** GOTO lbl9
                    if (var9_8 < 0) ** GOTO lbl42
                    if (var11_5 || var11_5) ** GOTO lbl9
                    var10_9 = this.elements.get(var9_8);
                    if (var11_5 || var11_5) ** GOTO lbl9
                    if (!this.isElementEnabled(var10_9)) ** GOTO lbl37
                    if (var11_5) ** GOTO lbl9
                    if (!var10_9.visible()) ** GOTO lbl37
                    if (var11_5 || var11_5) ** GOTO lbl9
                    if (!(var5_6 >= (double)var10_9.getX())) ** GOTO lbl37
                    if (var11_5) ** GOTO lbl9
                    if (!(var5_6 <= (double)(var10_9.getX() + var10_9.getWidth()))) ** GOTO lbl37
                    if (var11_5) ** GOTO lbl9
                    if (!(var7_7 >= (double)var10_9.getY())) ** GOTO lbl37
                    if (var11_5) ** GOTO lbl9
                    if (!(var7_7 <= (double)(var10_9.getY() + var10_9.getHeight()))) ** GOTO lbl37
                    if (var11_5 || var11_5) ** GOTO lbl9
                    return var10_9;
lbl37:
                    // 6 sources

                    if (var11_5 || var11_5) ** GOTO lbl9
                    --var9_8;
                    if (var11_5) ** GOTO lbl9
                } while (!var13_3);
                throw null;
lbl42:
                // 1 sources

                if (!var11_5 && !var11_5) ** break;
                ** continue;
                return null;
            }
lbl45:
            // 2 sources

            case 0: {
                var12_4 /* !! */  = (int)av.dbwk("dchg", dbwm(int ), (int)188);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl50:
            // 2 sources

            case 1: {
                var12_4 /* !! */  = (int)av.dbwk("dchh", dbwm(int ), (int)189);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl55:
            // 3 sources

            case 2: {
                var12_4 /* !! */  = (int)av.dbwk("dchi", dbwm(int ), (int)190);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl74
            }
            case 3: {
                var12_4 /* !! */  = (int)av.dbwk("dchj", dbwm(int ), (int)191);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl65:
            // 2 sources

            case 4: {
                var12_4 /* !! */  = (int)av.dbwk("dchk", dbwm(int ), (int)192);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl82
            }
            case 5: {
                var12_4 /* !! */  = (int)av.dbwk("dchl", dbwm(int ), (int)193);
                if (!var13_3) break;
                throw null;
            }
lbl74:
            // 4 sources

            case 6: {
                var12_4 /* !! */  = (int)av.dbwk("dchm", dbwm(int ), (int)194);
                if (!var13_3) ** GOTO lbl65
                throw null;
            }
            case 7: {
                var12_4 /* !! */  = (int)av.dbwk("dchn", dbwm(int ), (int)195);
                if (!var13_3) ** GOTO lbl55
                throw null;
            }
lbl82:
            // 3 sources

            case 8: {
                var12_4 /* !! */  = (int)av.dbwk("dcho", dbwm(int ), (int)196);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl87:
            // 2 sources

            case 9: {
                var12_4 /* !! */  = (int)av.dbwk("dchp", dbwm(int ), (int)197);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 10: {
                var12_4 /* !! */  = (int)av.dbwk("dchq", dbwm(int ), (int)198);
                if (!var13_3) ** GOTO lbl87
                throw null;
            }
lbl96:
            // 3 sources

            case 11: {
                var12_4 /* !! */  = (int)av.dbwk("dchr", dbwm(int ), (int)199);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_4 /* !! */  = (int)av.dbwk("dchs", dbwm(int ), (int)200);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl132
                    break;
                }
            }
lbl107:
            // 2 sources

            case 13: {
                var12_4 /* !! */  = (int)av.dbwk("dcht", dbwm(int ), (int)201);
                if (!var13_3) ** GOTO lbl50
                throw null;
            }
lbl111:
            // 3 sources

            case 14: {
                var12_4 /* !! */  = (int)av.dbwk("dchu", dbwm(int ), (int)202);
                if (!var13_3) ** GOTO lbl74
                throw null;
            }
lbl115:
            // 2 sources

            case 15: {
                var12_4 /* !! */  = (int)av.dbwk("dchv", dbwm(int ), (int)203);
                if (!var13_3) ** GOTO lbl96
                throw null;
            }
            case 16: {
                var12_4 /* !! */  = (int)av.dbwk("dchw", dbwm(int ), (int)204);
                if (!var13_3) ** GOTO lbl82
                throw null;
            }
            case 17: {
                var12_4 /* !! */  = (int)av.dbwk("dchx", dbwm(int ), (int)205);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl128:
            // 3 sources

            case 18: {
                var12_4 /* !! */  = (int)av.dbwk("dchy", dbwm(int ), (int)206);
                if (!var13_3) break;
                throw null;
            }
lbl132:
            // 2 sources

            case 19: {
                var12_4 /* !! */  = (int)av.dbwk("dchz", dbwm(int ), (int)207);
                if (!var13_3) ** GOTO lbl128
                throw null;
            }
lbl136:
            // 2 sources

            case 20: {
                var12_4 /* !! */  = (int)av.dbwk("dcia", dbwm(int ), (int)208);
                if (!var13_3) ** GOTO lbl55
                throw null;
            }
            case 21: {
                var12_4 /* !! */  = (int)av.dbwk("dcib", dbwm(int ), (int)209);
                if (!var13_3) ** GOTO lbl136
                throw null;
            }
lbl144:
            // 3 sources

            case 22: {
                var12_4 /* !! */  = (int)av.dbwk("dcic", dbwm(int ), (int)210);
                if (!var13_3) ** GOTO lbl74
                throw null;
            }
lbl148:
            // 3 sources

            case 23: {
                var12_4 /* !! */  = (int)av.dbwk("dcid", dbwm(int ), (int)211);
                if (!var13_3) ** GOTO lbl144
                throw null;
            }
lbl152:
            // 2 sources

            case 24: {
                var12_4 /* !! */  = (int)av.dbwk("dcie", dbwm(int ), (int)212);
                if (!var13_3) ** GOTO lbl45
                throw null;
            }
            case 25: {
                var12_4 /* !! */  = (int)av.dbwk("dcif", dbwm(int ), (int)213);
                if (!var13_3) ** GOTO lbl128
                throw null;
            }
            case 26: {
                var12_4 /* !! */  = (int)av.dbwk("dcig", dbwm(int ), (int)214);
                if (!var13_3) ** GOTO lbl107
                throw null;
            }
            case 27: {
                var12_4 /* !! */  = (int)av.dbwk("dcih", dbwm(int ), (int)215);
                if (!var13_3) ** GOTO lbl96
                throw null;
            }
            case 28: 
        }
        var12_4 /* !! */  = (int)av.dbwk("dcii", dbwm(int ), (int)216);
        ** while (!var13_3)
lbl171:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void syncViewportLayout(float var1_1) {
        block111: {
            block110: {
                block109: {
                    var12_2 = av.c;
                    var11_3 /* !! */  = av.b;
                    var10_4 = av.a;
                    if (var12_2) {
                        throw null;
lbl6:
                        // 27 sources

                        return;
                    }
                    if (var10_4 || var10_4) ** GOTO lbl6
                    if (ki.hasUsableViewport()) break block109;
                    if (var10_4 || var10_4) ** GOTO lbl6
                    return;
                }
                if (var10_4 || var10_4) ** GOTO lbl6
                var2_5 = (int)Math.floor((float)ki.getFixedScaledWidth() / Math.max((float)av.dbwk("dcze", dctl(int ), (int)444), var1_1));
                if (var10_4 || var10_4) ** GOTO lbl6
                var3_6 = (int)Math.floor((float)ki.getFixedScaledHeight() / Math.max((float)av.dbwk("dczf", dctl(int ), (int)445), var1_1));
                if (var10_4 || var10_4) ** GOTO lbl6
                var4_7 = (long)var2_5 << av.dbwk("dczg", dbwm(int ), (int)446) | (long)var3_6 & av.dbwk("dczh", dbwh(int ), (int)272);
                if (var10_4 || var10_4) ** GOTO lbl6
                if (this.activeViewportKey != av.dbwk("dczi", dbwh(int ), (int)273)) break block110;
                if (var10_4 || var10_4) ** GOTO lbl6
                this.activeViewportKey = var4_7;
                if (var10_4 || var10_4) ** GOTO lbl6
                this.saveViewportLayout(var4_7);
                if (var10_4 || var10_4) ** GOTO lbl6
                return;
            }
            if (var10_4 || var10_4) ** GOTO lbl6
            if (this.activeViewportKey != var4_7) break block111;
            if (var10_4 || var10_4) ** GOTO lbl6
            return;
        }
        if (var10_4 || var10_4) ** GOTO lbl6
        this.saveViewportLayout(this.activeViewportKey);
        if (var10_4 || var10_4) ** GOTO lbl6
        this.activeViewportKey = var4_7;
        if (var10_4 || var10_4) ** GOTO lbl6
        var6_8 = this.viewportLayouts.get(var4_7);
        if (var10_4 || var10_4) ** GOTO lbl6
        if (var6_8 != null) ** GOTO lbl46
        if (var11_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_4 || var10_4) ** GOTO lbl6
                return;
            }
lbl46:
            // 1 sources

            if (var10_4 || var10_4) ** GOTO lbl6
            var7_9 = this.elements.iterator();
            if (var10_4) ** GOTO lbl6
            do {
                if (var10_4 || var10_4) ** GOTO lbl6
                if (!var7_9.hasNext()) ** GOTO lbl66
                if (var10_4) ** GOTO lbl6
                var8_10 = var7_9.next();
                if (var10_4 || var10_4) ** GOTO lbl6
                var9_11 = var6_8.get(var8_10.getName());
                if (var10_4 || var10_4) ** GOTO lbl6
                if (var9_11 == null) ** GOTO lbl63
                if (var10_4 || var10_4) ** GOTO lbl6
                var8_10.setX(var9_11.x());
                if (var10_4 || var10_4) ** GOTO lbl6
                var8_10.setY(var9_11.y());
                if (var10_4) ** GOTO lbl6
lbl63:
                // 2 sources

                if (var10_4 || var10_4) ** GOTO lbl6
            } while (!var12_2);
            throw null;
lbl66:
            // 1 sources

            if (!var10_4 && !var10_4) ** break;
            ** continue;
            return;
lbl69:
            // 3 sources

            case 0: {
                var11_3 /* !! */  = (int)av.dbwk("dczj", dbwm(int ), (int)447);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl74:
            // 4 sources

            case 1: {
                var11_3 /* !! */  = (int)av.dbwk("dczk", dbwm(int ), (int)448);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 2: {
                var11_3 /* !! */  = (int)av.dbwk("dczl", dbwm(int ), (int)449);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl84:
            // 2 sources

            case 3: {
                var11_3 /* !! */  = (int)av.dbwk("dczm", dbwm(int ), (int)450);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl89:
            // 2 sources

            case 4: {
                var11_3 /* !! */  = (int)av.dbwk("dczn", dbwm(int ), (int)451);
                if (!var12_2) ** GOTO lbl69
                throw null;
            }
lbl93:
            // 2 sources

            case 5: {
                var11_3 /* !! */  = (int)av.dbwk("dczo", dbwm(int ), (int)452);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 6: {
                var11_3 /* !! */  = (int)av.dbwk("dczp", dbwm(int ), (int)453);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl103:
            // 3 sources

            case 7: {
                var11_3 /* !! */  = (int)av.dbwk("dczq", dbwm(int ), (int)454);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 8: {
                var11_3 /* !! */  = (int)av.dbwk("dczr", dbwm(int ), (int)455);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl113:
            // 2 sources

            case 9: {
                var11_3 /* !! */  = (int)av.dbwk("dczs", dbwm(int ), (int)456);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl118:
            // 3 sources

            case 10: {
                var11_3 /* !! */  = (int)av.dbwk("dczt", dbwm(int ), (int)457);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 11: {
                var11_3 /* !! */  = (int)av.dbwk("dczu", dbwm(int ), (int)458);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl128:
            // 3 sources

            case 12: {
                var11_3 /* !! */  = (int)av.dbwk("dczv", dbwm(int ), (int)459);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl133:
            // 2 sources

            case 13: {
                var11_3 /* !! */  = (int)av.dbwk("dczw", dbwm(int ), (int)460);
                if (!var12_2) ** GOTO lbl89
                throw null;
            }
lbl137:
            // 2 sources

            case 14: {
                var11_3 /* !! */  = (int)av.dbwk("dczx", dbwm(int ), (int)461);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl142:
            // 2 sources

            case 15: {
                var11_3 /* !! */  = (int)av.dbwk("dczy", dbwm(int ), (int)462);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl147:
            // 2 sources

            case 16: {
                var11_3 /* !! */  = (int)av.dbwk("dczz", dbwm(int ), (int)463);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl152:
            // 3 sources

            case 17: {
                var11_3 /* !! */  = (int)av.dbwk("ddaa", dbwm(int ), (int)464);
                if (!var12_2) ** GOTO lbl84
                throw null;
            }
            case 18: {
                var11_3 /* !! */  = (int)av.dbwk("ddab", dbwm(int ), (int)465);
                if (!var12_2) ** GOTO lbl74
                throw null;
            }
            case 19: {
                var11_3 /* !! */  = (int)av.dbwk("ddac", dbwm(int ), (int)466);
                if (!var12_2) ** GOTO lbl69
                throw null;
            }
lbl164:
            // 2 sources

            case 20: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_3 /* !! */  = (int)av.dbwk("ddad", dbwm(int ), (int)467);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl188
                    break;
                }
            }
lbl170:
            // 2 sources

            case 21: {
                var11_3 /* !! */  = (int)av.dbwk("ddae", dbwm(int ), (int)468);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 22: {
                var11_3 /* !! */  = (int)av.dbwk("ddaf", dbwm(int ), (int)469);
                if (!var12_2) ** GOTO lbl118
                throw null;
            }
            case 23: {
                var11_3 /* !! */  = (int)av.dbwk("ddag", dbwm(int ), (int)470);
                if (!var12_2) ** GOTO lbl103
                throw null;
            }
lbl183:
            // 2 sources

            case 24: {
                var11_3 /* !! */  = (int)av.dbwk("ddah", dbwm(int ), (int)471);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl188:
            // 2 sources

            case 25: {
                var11_3 /* !! */  = (int)av.dbwk("ddai", dbwm(int ), (int)472);
                if (!var12_2) ** GOTO lbl74
                throw null;
            }
lbl192:
            // 2 sources

            case 26: {
                var11_3 /* !! */  = (int)av.dbwk("ddaj", dbwm(int ), (int)473);
                if (!var12_2) ** GOTO lbl137
                throw null;
            }
lbl196:
            // 3 sources

            case 27: {
                do {
                    var11_3 /* !! */  = (int)av.dbwk("ddak", dbwm(int ), (int)474);
                } while (!var12_2);
                throw null;
            }
            case 28: {
                var11_3 /* !! */  = (int)av.dbwk("ddal", dbwm(int ), (int)475);
                if (!var12_2) break;
                throw null;
            }
lbl205:
            // 3 sources

            case 29: {
                var11_3 /* !! */  = (int)av.dbwk("ddam", dbwm(int ), (int)476);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl210:
            // 2 sources

            case 30: {
                var11_3 /* !! */  = (int)av.dbwk("ddan", dbwm(int ), (int)477);
                if (!var12_2) ** GOTO lbl133
                throw null;
            }
lbl214:
            // 2 sources

            case 31: {
                var11_3 /* !! */  = (int)av.dbwk("ddao", dbwm(int ), (int)478);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl254
            }
            case 32: {
                var11_3 /* !! */  = (int)av.dbwk("ddap", dbwm(int ), (int)479);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 33: {
                var11_3 /* !! */  = (int)av.dbwk("ddaq", dbwm(int ), (int)480);
                if (!var12_2) ** GOTO lbl74
                throw null;
            }
lbl228:
            // 2 sources

            case 34: {
                var11_3 /* !! */  = (int)av.dbwk("ddar", dbwm(int ), (int)481);
                if (!var12_2) ** GOTO lbl113
                throw null;
            }
lbl232:
            // 2 sources

            case 35: {
                var11_3 /* !! */  = (int)av.dbwk("ddas", dbwm(int ), (int)482);
                if (!var12_2) break;
                throw null;
            }
            case 36: {
                var11_3 /* !! */  = (int)av.dbwk("ddat", dbwm(int ), (int)483);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
lbl241:
            // 4 sources

            case 37: {
                var11_3 /* !! */  = (int)av.dbwk("ddau", dbwm(int ), (int)484);
                if (!var12_2) ** GOTO lbl192
                throw null;
            }
lbl245:
            // 4 sources

            case 38: {
                var11_3 /* !! */  = (int)av.dbwk("ddav", dbwm(int ), (int)485);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl280
            }
lbl250:
            // 2 sources

            case 39: {
                var11_3 /* !! */  = (int)av.dbwk("ddaw", dbwm(int ), (int)486);
                if (!var12_2) ** GOTO lbl103
                throw null;
            }
lbl254:
            // 3 sources

            case 40: {
                var11_3 /* !! */  = (int)av.dbwk("ddax", dbwm(int ), (int)487);
                if (!var12_2) ** GOTO lbl170
                throw null;
            }
            case 41: {
                var11_3 /* !! */  = (int)av.dbwk("dday", dbwm(int ), (int)488);
                if (!var12_2) ** GOTO lbl118
                throw null;
            }
            case 42: {
                var11_3 /* !! */  = (int)av.dbwk("ddaz", dbwm(int ), (int)489);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl280
            }
            case 43: {
                var11_3 /* !! */  = (int)av.dbwk("ddba", dbwm(int ), (int)490);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 44: {
                var11_3 /* !! */  = (int)av.dbwk("ddbb", dbwm(int ), (int)491);
                if (!var12_2) ** GOTO lbl128
                throw null;
            }
            case 45: {
                var11_3 /* !! */  = (int)av.dbwk("ddbc", dbwm(int ), (int)492);
                if (!var12_2) ** GOTO lbl210
                throw null;
            }
lbl280:
            // 3 sources

            case 46: {
                var11_3 /* !! */  = (int)av.dbwk("ddbd", dbwm(int ), (int)493);
                if (!var12_2) ** GOTO lbl205
                throw null;
            }
lbl284:
            // 3 sources

            case 47: {
                var11_3 /* !! */  = (int)av.dbwk("ddbe", dbwm(int ), (int)494);
                if (!var12_2) ** GOTO lbl214
                throw null;
            }
lbl288:
            // 2 sources

            case 48: {
                var11_3 /* !! */  = (int)av.dbwk("ddbf", dbwm(int ), (int)495);
                if (!var12_2) ** GOTO lbl241
                throw null;
            }
            case 49: {
                var11_3 /* !! */  = (int)av.dbwk("ddbg", dbwm(int ), (int)496);
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 50: {
                do {
                    var11_3 /* !! */  = (int)av.dbwk("ddbh", dbwm(int ), (int)497);
                } while (!var12_2);
                throw null;
            }
lbl302:
            // 2 sources

            case 51: {
                var11_3 /* !! */  = (int)av.dbwk("ddbi", dbwm(int ), (int)498);
                if (!var12_2) ** GOTO lbl245
                throw null;
            }
            case 52: {
                do {
                    var11_3 /* !! */  = (int)av.dbwk("ddbj", dbwm(int ), (int)499);
                } while (!var12_2);
                throw null;
            }
lbl311:
            // 2 sources

            case 53: {
                var11_3 /* !! */  = (int)av.dbwk("ddbk", dbwm(int ), (int)500);
                if (!var12_2) ** GOTO lbl147
                throw null;
            }
            case 54: {
                var11_3 /* !! */  = (int)av.dbwk("ddbl", dbwm(int ), (int)501);
                if (!var12_2) ** GOTO lbl128
                throw null;
            }
            case 55: 
        }
        var11_3 /* !! */  = (int)av.dbwk("ddbm", dbwm(int ), (int)502);
        ** while (!var12_2)
lbl322:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean mouseClicked(double var1_1, double var3_2, int var5_3) {
        v0 /* !! */  = av.hd;
        if (true) ** GOTO lbl5
        block63: while (true) {
            v0 /* !! */  = (long)(v1 - av.dbwk("dcij", dbwh(int ), (int)90));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2059008733: {
                    v1 = av.dbwk("dcik", dbwh(int ), (int)91);
                    continue block63;
                }
                case -242776741: {
                    v1 = av.dbwk("dcil", dbwh(int ), (int)92);
                    continue block63;
                }
                case 75670586: {
                    v1 = av.dbwk("dcim", dbwh(int ), (int)93);
                    continue block63;
                }
                case 1991886182: {
                    break block63;
                }
            }
            break;
        }
        var14_4 = av.c;
        v2 /* !! */  = av.hd;
        if (true) ** GOTO lbl22
        block64: while (true) {
            v2 /* !! */  = (long)(v3 - av.dbwk("dcin", dbwh(int ), (int)94));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2118551130: {
                    v3 = av.dbwk("dcio", dbwh(int ), (int)95);
                    continue block64;
                }
                case 757463011: {
                    v3 = av.dbwk("dcip", dbwh(int ), (int)96);
                    continue block64;
                }
                case 1991886182: {
                    break block64;
                }
            }
            break;
        }
        var13_5 /* !! */  = av.b;
        v4 /* !! */  = av.hd;
        if (true) ** GOTO lbl36
        block65: while (true) {
            v4 /* !! */  = (long)(v5 - av.dbwk("dciq", dbwh(int ), (int)97));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2034807136: {
                    v5 = av.dbwk("dcir", dbwh(int ), (int)98);
                    continue block65;
                }
                case 1184609392: {
                    v5 = av.dbwk("dcis", dbwh(int ), (int)99);
                    continue block65;
                }
                case 1991886182: {
                    break block65;
                }
            }
            break;
        }
        var12_6 = av.a;
        if (var14_4) {
            throw null;
lbl48:
            // 11 sources

            return (boolean)av.dbwk("dcit", dbwm(int ), (int)217);
        }
        if (var12_6 || var12_6) ** GOTO lbl48
        v6 /* !! */  = av.hd;
        if (true) ** GOTO lbl55
        block67: while (true) {
            v6 /* !! */  = (long)(av.dbwk("dciv", dbwh(int ), (int)101) - av.dbwk("dciu", dbwh(int ), (int)100));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -329094716: {
                    continue block67;
                }
                case 1991886182: {
                    break block67;
                }
            }
            break;
        }
        var6_7 = this.toHudCoordinate(var1_1);
        if (var13_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_6 || var12_6) ** GOTO lbl48
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = av.hd - av.dbwk("dciw", dbwh(int ), (int)102)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == av.dbwk("dcix", dbwm(int ), (int)218)) break;
                    v7 /* !! */  = (long)av.dbwk("dciy", dbwm(int ), (int)219);
                }
                var8_8 = this.toHudCoordinate(var3_2);
                if (var12_6 || var12_6) ** GOTO lbl48
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dciz", dbwh(int ), (int)103)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == av.dbwk("dcja", dbwm(int ), (int)220)) break;
                    v8 /* !! */  = (long)av.dbwk("dcjb", dbwm(int ), (int)221);
                }
                v9 /* !! */  = av.hd;
                if (true) ** GOTO lbl83
                block70: while (true) {
                    v9 /* !! */  = (long)(av.dbwk("dcjd", dbwh(int ), (int)105) - av.dbwk("dcjc", dbwh(int ), (int)104));
lbl83:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 591609200: {
                            continue block70;
                        }
                        case 1991886182: {
                            break block70;
                        }
                    }
                    break;
                }
                var10_9 = this.elements.iterator();
                if (var12_6) ** GOTO lbl48
                do {
                    if (var12_6 || var12_6) ** GOTO lbl48
                    while (true) {
                        if ((v10 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("dcje", dbwh(int ), (int)106)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v10 /* !! */  == av.dbwk("dcjf", dbwm(int ), (int)222)) break;
                        v10 /* !! */  = (long)av.dbwk("dcjg", dbwm(int ), (int)223);
                    }
                    if (!var10_9.hasNext()) ** GOTO lbl145
                    if (var12_6) ** GOTO lbl48
                    v11 /* !! */  = av.hd;
                    if (true) ** GOTO lbl104
                    block73: while (true) {
                        v11 /* !! */  = (long)(v12 - av.dbwk("dcjh", dbwh(int ), (int)107));
lbl104:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -970273924: {
                                v12 = av.dbwk("dcji", dbwh(int ), (int)108);
                                continue block73;
                            }
                            case 1694906708: {
                                v12 = av.dbwk("dcjj", dbwh(int ), (int)109);
                                continue block73;
                            }
                            case 1991886182: {
                                break block73;
                            }
                        }
                        break;
                    }
                    var11_10 = var10_9.next();
                    if (var12_6 || var12_6) ** GOTO lbl48
                    v13 /* !! */  = av.hd;
                    if (true) ** GOTO lbl119
                    block74: while (true) {
                        v13 /* !! */  = (long)(av.dbwk("dcjl", dbwh(int ), (int)111) - av.dbwk("dcjk", dbwh(int ), (int)110));
lbl119:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -2105635101: {
                                continue block74;
                            }
                            case 1991886182: {
                                break block74;
                            }
                        }
                        break;
                    }
                    if (!this.isElementEnabled(var11_10)) ** GOTO lbl142
                    if (var12_6 || var12_6) ** GOTO lbl48
                    v14 /* !! */  = av.hd;
                    if (true) ** GOTO lbl130
                    block75: while (true) {
                        v14 /* !! */  = (long)(v15 - av.dbwk("dcjm", dbwh(int ), (int)112));
lbl130:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -1695585935: {
                                v15 = av.dbwk("dcjn", dbwh(int ), (int)113);
                                continue block75;
                            }
                            case -1136995700: {
                                v15 = av.dbwk("dcjo", dbwh(int ), (int)114);
                                continue block75;
                            }
                            case 1991886182: {
                                break block75;
                            }
                        }
                        break;
                    }
                    if (!var11_10.mouseClicked(var6_7, var8_8, var5_3)) ** GOTO lbl142
                    if (var12_6 || var12_6) ** GOTO lbl48
                    return (boolean)av.dbwk("dcjp", dbwm(int ), (int)224);
lbl142:
                    // 2 sources

                    if (var12_6 || var12_6) ** GOTO lbl48
                } while (!var14_4);
                throw null;
lbl145:
                // 1 sources

                if (!var12_6 && !var12_6) ** break;
                ** continue;
                return (boolean)av.dbwk("dcjq", dbwm(int ), (int)225);
            }
            case 0: {
                var13_5 /* !! */  = (int)av.dbwk("dcjr", dbwm(int ), (int)226);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl153:
            // 2 sources

            case 1: {
                var13_5 /* !! */  = (int)av.dbwk("dcjs", dbwm(int ), (int)227);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl227
            }
            case 2: {
                var13_5 /* !! */  = (int)av.dbwk("dcjt", dbwm(int ), (int)228);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 3: {
                var13_5 /* !! */  = (int)av.dbwk("dcju", dbwm(int ), (int)229);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl168:
            // 2 sources

            case 4: {
                var13_5 /* !! */  = (int)av.dbwk("dcjv", dbwm(int ), (int)230);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 5: {
                var13_5 /* !! */  = (int)av.dbwk("dcjw", dbwm(int ), (int)231);
                if (!var14_4) break;
                throw null;
            }
lbl177:
            // 2 sources

            case 6: {
                var13_5 /* !! */  = (int)av.dbwk("dcjx", dbwm(int ), (int)232);
                if (!var14_4) ** GOTO lbl153
                throw null;
            }
lbl181:
            // 2 sources

            case 7: {
                var13_5 /* !! */  = (int)av.dbwk("dcjy", dbwm(int ), (int)233);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl186:
            // 4 sources

            case 8: {
                var13_5 /* !! */  = (int)av.dbwk("dcjz", dbwm(int ), (int)234);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 9: {
                do {
                    var13_5 /* !! */  = (int)av.dbwk("dcka", dbwm(int ), (int)235);
                } while (!var14_4);
                throw null;
            }
            case 10: {
                var13_5 /* !! */  = (int)av.dbwk("dckb", dbwm(int ), (int)236);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl201:
            // 4 sources

            case 11: {
                var13_5 /* !! */  = (int)av.dbwk("dckc", dbwm(int ), (int)237);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 12: {
                var13_5 /* !! */  = (int)av.dbwk("dckd", dbwm(int ), (int)238);
                if (!var14_4) ** GOTO lbl181
                throw null;
            }
lbl210:
            // 2 sources

            case 13: {
                var13_5 /* !! */  = (int)av.dbwk("dcke", dbwm(int ), (int)239);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl227
            }
lbl215:
            // 4 sources

            case 14: {
                var13_5 /* !! */  = (int)av.dbwk("dckf", dbwm(int ), (int)240);
                if (!var14_4) ** GOTO lbl201
                throw null;
            }
lbl219:
            // 2 sources

            case 15: {
                var13_5 /* !! */  = (int)av.dbwk("dckg", dbwm(int ), (int)241);
                if (!var14_4) ** GOTO lbl186
                throw null;
            }
            case 16: {
                var13_5 /* !! */  = (int)av.dbwk("dckh", dbwm(int ), (int)242);
                if (!var14_4) ** GOTO lbl210
                throw null;
            }
lbl227:
            // 3 sources

            case 17: {
                var13_5 /* !! */  = (int)av.dbwk("dcki", dbwm(int ), (int)243);
                if (var14_4) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl232:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_5 /* !! */  = (int)av.dbwk("dckj", dbwm(int ), (int)244);
                    if (!var14_4) ** GOTO lbl215
                    throw null;
                }
            }
lbl237:
            // 3 sources

            case 19: {
                var13_5 /* !! */  = (int)av.dbwk("dckk", dbwm(int ), (int)245);
                if (!var14_4) ** GOTO lbl219
                throw null;
            }
            case 20: {
                var13_5 /* !! */  = (int)av.dbwk("dckl", dbwm(int ), (int)246);
                if (!var14_4) ** GOTO lbl215
                throw null;
            }
            case 21: {
                var13_5 /* !! */  = (int)av.dbwk("dckm", dbwm(int ), (int)247);
                if (!var14_4) ** GOTO lbl168
                throw null;
            }
            case 22: 
        }
        var13_5 /* !! */  = (int)av.dbwk("dckn", dbwm(int ), (int)248);
        ** while (!var14_4)
lbl252:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ddja() {
        av.dbwj[0] = -7319277648388469030L;
        av.dbwj[1] = 3547801845407084963L;
        av.dbwj[2] = -3919632375780646190L;
        av.dbwj[3] = -786326568938893873L;
        av.dbwj[4] = -8991459523512098064L;
        av.dbwj[5] = -916041042002626648L;
        av.dbwj[6] = 2380916951069167615L;
        av.dbwj[7] = -2313506246059504219L;
        av.dbwj[8] = 6037690424665708562L;
        av.dbwj[9] = 3520271068234040151L;
        av.dbwj[10] = -6272242058359449724L;
        av.dbwj[11] = 2480441153862217937L;
        av.dbwj[12] = -8550540143680597772L;
        av.dbwj[13] = -8202436919099067325L;
        av.dbwj[14] = -6905550661080899184L;
        av.dbwj[15] = 5096236614276825368L;
        av.dbwj[16] = 2198503253206048226L;
        av.dbwj[17] = 3562224268859572479L;
        av.dbwj[18] = 4606687213610682701L;
        av.dbwj[19] = -7693650085081020335L;
        av.dbwj[20] = -6782204693924148068L;
        av.dbwj[21] = -4409537031909990986L;
        av.dbwj[22] = 6148007244498395971L;
        av.dbwj[23] = 7670530841172831543L;
        av.dbwj[24] = 5081432609826490709L;
        av.dbwj[25] = 4915191748800614985L;
        av.dbwj[26] = -1673713553585832154L;
        av.dbwj[27] = -1262976117643035126L;
        av.dbwj[28] = 1159818179969770289L;
        av.dbwj[29] = -6757442886165692983L;
        av.dbwj[30] = -298546237275535812L;
        av.dbwj[31] = -2893446338289932852L;
        av.dbwj[32] = 2326677886072839609L;
        av.dbwj[33] = -6535456367789824948L;
        av.dbwj[34] = 5646192241052203119L;
        av.dbwj[35] = -7749575094883761980L;
        av.dbwj[36] = -6269961502564755111L;
        av.dbwj[37] = 1678064020226837354L;
        av.dbwj[38] = -3501100344559674162L;
        av.dbwj[39] = 1067150563470087959L;
        av.dbwj[40] = -77826634740593748L;
        av.dbwj[41] = -7253276605721270391L;
        av.dbwj[42] = 5005387721377620671L;
        av.dbwj[43] = 3770131358887607676L;
        av.dbwj[44] = -5825077711274599541L;
        av.dbwj[45] = -8658140547505996022L;
        av.dbwj[46] = -2935643948537438516L;
        av.dbwj[47] = 6845319939948146448L;
        av.dbwj[48] = 5772101336551542544L;
        av.dbwj[49] = 6798006715834048761L;
        av.dbwj[50] = -8519113681406198952L;
        av.dbwj[51] = -8104189193185248633L;
        av.dbwj[52] = -2893519543731837596L;
        av.dbwj[53] = -2295358391178862183L;
        av.dbwj[54] = 2258234777160978560L;
        av.dbwj[55] = 7631858640381688175L;
        av.dbwj[56] = -8026234231076932431L;
        av.dbwj[57] = 1650597029071037064L;
        av.dbwj[58] = -6766919696595801131L;
        av.dbwj[59] = -7598163670643579287L;
        av.dbwj[60] = -1609309125164249847L;
        av.dbwj[61] = 1669990334971763616L;
        av.dbwj[62] = 3621981084801178186L;
        av.dbwj[63] = 5877677902320420359L;
        av.dbwj[64] = -4803320817609022370L;
        av.dbwj[65] = -2127247444128499899L;
        av.dbwj[66] = -5137963604806383372L;
        av.dbwj[67] = -7213828375115392414L;
        av.dbwj[68] = 4757271112008611392L;
        av.dbwj[69] = -6305827904435056536L;
        av.dbwj[70] = 1180137486004500182L;
        av.dbwj[71] = 6120358144481388618L;
        av.dbwj[72] = 3660044222563726804L;
        av.dbwj[73] = -7240223221235086123L;
        av.dbwj[74] = -801460642065038643L;
        av.dbwj[75] = 2929727445252207078L;
        av.dbwj[76] = -1503061790543649060L;
        av.dbwj[77] = -1926517444103958292L;
        av.dbwj[78] = 6936997394413283846L;
        av.dbwj[79] = -430658109848943155L;
        av.dbwj[80] = 969848354548248467L;
        av.dbwj[81] = -8949058474284114033L;
        av.dbwj[82] = -7132097593811610530L;
        av.dbwj[83] = 5078390083606443648L;
        av.dbwj[84] = -3173935093788730057L;
        av.dbwj[85] = -8647540558231432901L;
        av.dbwj[86] = -1134747564583155896L;
        av.dbwj[87] = 9207579647028441362L;
        av.dbwj[88] = 7306930254875424152L;
        av.dbwj[89] = 420190070763056505L;
        av.dbwj[90] = -1376615400757164065L;
        av.dbwj[91] = -6696803702587678081L;
        av.dbwj[92] = 3698348408750703365L;
        av.dbwj[93] = -720516900742065442L;
        av.dbwj[94] = -2546480260112687658L;
        av.dbwj[95] = 8049715843847652755L;
        av.dbwj[96] = 2703983137189583788L;
        av.dbwj[97] = -8137233452280863771L;
        av.dbwj[98] = 8296736908558154887L;
        av.dbwj[99] = -2674505517667933957L;
    }

    private static /* synthetic */ void ddix() {
        av.dbwi[100] = -4634595497450011268L;
        av.dbwi[101] = 538921302581311225L;
        av.dbwi[102] = -8395378841950983627L;
        av.dbwi[103] = 8815505543376777810L;
        av.dbwi[104] = 8387264546488750496L;
        av.dbwi[105] = 4945838200942669168L;
        av.dbwi[106] = 1138110360407349669L;
        av.dbwi[107] = -5607662385456241279L;
        av.dbwi[108] = -6111677125346725961L;
        av.dbwi[109] = -4965398206372933019L;
        av.dbwi[110] = -2493330449489820981L;
        av.dbwi[111] = -8289124484430437160L;
        av.dbwi[112] = 7701715526729226096L;
        av.dbwi[113] = -2665126686002667557L;
        av.dbwi[114] = 1350456468633764350L;
        av.dbwi[115] = -2352339078429033737L;
        av.dbwi[116] = -232639516320769984L;
        av.dbwi[117] = 4742761268690385125L;
        av.dbwi[118] = -8864402278081587923L;
        av.dbwi[119] = 4374906782519643254L;
        av.dbwi[120] = -2268154486923388626L;
        av.dbwi[121] = -5806139299797084059L;
        av.dbwi[122] = 47355909756054903L;
        av.dbwi[123] = -7152305611279428600L;
        av.dbwi[124] = 6548625168796299549L;
        av.dbwi[125] = 9112232746306264066L;
        av.dbwi[126] = 3424812421116662717L;
        av.dbwi[127] = 8698789066646181506L;
        av.dbwi[128] = -320345057418106811L;
        av.dbwi[129] = 8232936685444936565L;
        av.dbwi[130] = -4945239147527082586L;
        av.dbwi[131] = 6140988843972152273L;
        av.dbwi[132] = 2489876571069171095L;
        av.dbwi[133] = -2390711972354072428L;
        av.dbwi[134] = -5688896681632610427L;
        av.dbwi[135] = -6664648577771275304L;
        av.dbwi[136] = -6472067715626470990L;
        av.dbwi[137] = 453408282510044749L;
        av.dbwi[138] = -8259714934705294250L;
        av.dbwi[139] = 2942208935647882916L;
        av.dbwi[140] = 5552100076471516772L;
        av.dbwi[141] = 763324238422868190L;
        av.dbwi[142] = 8867371847532565078L;
        av.dbwi[143] = 8358714304843949297L;
        av.dbwi[144] = -6400433031231163586L;
        av.dbwi[145] = -7586705122484046746L;
        av.dbwi[146] = -8158826709881441023L;
        av.dbwi[147] = -2046274718966242976L;
        av.dbwi[148] = -8682444268402168039L;
        av.dbwi[149] = 1994240939094867555L;
        av.dbwi[150] = 9125561836182865273L;
        av.dbwi[151] = 2719330210295284017L;
        av.dbwi[152] = -7124268510318285684L;
        av.dbwi[153] = 1337228345243618960L;
        av.dbwi[154] = -3624069116009555993L;
        av.dbwi[155] = -6809077500127688656L;
        av.dbwi[156] = 8213763875949747863L;
        av.dbwi[157] = 610174355081537296L;
        av.dbwi[158] = -4888089763012371469L;
        av.dbwi[159] = 6496661341898443236L;
        av.dbwi[160] = 6979768300232561761L;
        av.dbwi[161] = 5529554938283158599L;
        av.dbwi[162] = -8802889914055211374L;
        av.dbwi[163] = -4448487268700333033L;
        av.dbwi[164] = -5107870324106434014L;
        av.dbwi[165] = -6570756754712371390L;
        av.dbwi[166] = 8646447646337296631L;
        av.dbwi[167] = 2814263952148274073L;
        av.dbwi[168] = 5453068570344328588L;
        av.dbwi[169] = -5471640874451740960L;
        av.dbwi[170] = -5605525235889891291L;
        av.dbwi[171] = 2602476332392354855L;
        av.dbwi[172] = 7354282251242576293L;
        av.dbwi[173] = -9093140400049909521L;
        av.dbwi[174] = 971240110439309858L;
        av.dbwi[175] = 6980009086763444031L;
        av.dbwi[176] = 2964442389981766143L;
        av.dbwi[177] = -2059894011435675887L;
        av.dbwi[178] = -4803242956788378930L;
        av.dbwi[179] = -2543913799024620680L;
        av.dbwi[180] = 5922393099759857350L;
        av.dbwi[181] = -4409000298373407794L;
        av.dbwi[182] = -7119658276914510888L;
        av.dbwi[183] = -5479312885672473742L;
        av.dbwi[184] = 219678238622963534L;
        av.dbwi[185] = 8747819886531627458L;
        av.dbwi[186] = 4246378173962926208L;
        av.dbwi[187] = -1441788208846926438L;
        av.dbwi[188] = 4513190295951112243L;
        av.dbwi[189] = 2375223507425621082L;
        av.dbwi[190] = 5987115950625415613L;
        av.dbwi[191] = -281313066682920279L;
        av.dbwi[192] = -1136207281550909364L;
        av.dbwi[193] = 5171261129445567972L;
        av.dbwi[194] = -1544016899223370933L;
        av.dbwi[195] = 1150253156664637971L;
        av.dbwi[196] = 5781929317312630388L;
        av.dbwi[197] = -6084705306798569324L;
        av.dbwi[198] = 7599920401216144529L;
        av.dbwi[199] = -8684211251907076612L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void playAppear(String var1_1) {
        v0 /* !! */  = av.hd;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - av.dbwk("dcko", dbwh(int ), (int)115));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1165454819: {
                    v1 = av.dbwk("dckp", dbwh(int ), (int)116);
                    continue block37;
                }
                case -975824962: {
                    v1 = av.dbwk("dckq", dbwh(int ), (int)117);
                    continue block37;
                }
                case 1991886182: {
                    break block37;
                }
            }
            break;
        }
        var7_2 = av.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dckr", dbwh(int ), (int)118)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == av.dbwk("dcks", dbwm(int ), (int)249)) break;
            v2 /* !! */  = (long)av.dbwk("dckt", dbwm(int ), (int)250);
        }
        var6_3 /* !! */  = av.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("dcku", dbwh(int ), (int)119)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == av.dbwk("dckv", dbwm(int ), (int)251)) {
                var5_4 = av.a;
                if (var7_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)av.dbwk("dckw", dbwm(int ), (int)252);
        }
        if (var5_4) return;
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block40: while (true) {
            block84: {
                switch (cfr_temp_0 == -2147483648 ? var6_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var5_4) return;
                        if (var1_1 == null) {
                            if (var5_4) return;
                            return;
                        }
                        if (var5_4 || var5_4) return;
                        v4 /* !! */  = av.hd;
                        block41: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -890298032: {
                                    v5 = av.dbwk("dcky", dbwh(int ), (int)121);
                                    ** GOTO lbl49
                                }
                                case -235950467: {
                                    v5 = av.dbwk("dckz", dbwh(int ), (int)122);
lbl49:
                                    // 2 sources

                                    v4 /* !! */  = (long)(v5 - av.dbwk("dckx", dbwh(int ), (int)120));
                                    continue block41;
                                }
                                case 1991886182: {
                                    break block41;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_3 = av.hd - av.dbwk("dcla", dbwh(int ), (int)123)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  != av.dbwk("dclb", dbwm(int ), (int)253)) ** GOTO lbl59
                            var2_5 = this.elements.iterator();
                            if (var5_4) return;
                            ** GOTO lbl163
lbl59:
                            // 1 sources

                            v6 /* !! */  = (long)av.dbwk("dclc", dbwm(int ), (int)254);
                        }
                    }
                    case 7: {
                        var6_3 /* !! */  = (int)av.dbwk("dclz", dbwm(int ), (int)272);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var6_3 /* !! */  = (int)av.dbwk("dclw", dbwm(int ), (int)269);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var6_3 /* !! */  = (int)av.dbwk("dcly", dbwm(int ), (int)271);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var6_3 /* !! */  = (int)av.dbwk("dcma", dbwm(int ), (int)273);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var6_3 /* !! */  = (int)av.dbwk("dclx", dbwm(int ), (int)270);
                        cfr_temp_0 = 15;
                        if (var7_2) {
                            throw null;
                        }
                        break block84;
                    }
                    case 9: {
                        ** GOTO lbl154
                    }
                    case 11: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmd", dbwm(int ), (int)276);
                        cfr_temp_0 = 17;
                        if (var7_2) {
                            throw null;
                        }
                        break block84;
                    }
                    case 13: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmf", dbwm(int ), (int)278);
                        cfr_temp_0 = 10;
                        if (var7_2) {
                            throw null;
                        }
                        break block84;
                    }
                    case 14: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmg", dbwm(int ), (int)279);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 16: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmi", dbwm(int ), (int)281);
                        cfr_temp_0 = 22;
                        if (var7_2) {
                            throw null;
                        }
                        break block84;
                    }
                    case 18: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmk", dbwm(int ), (int)283);
                        cfr_temp_0 = 17;
                        if (var7_2) {
                            throw null;
                        }
                        break block84;
                    }
                    case 20: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmm", dbwm(int ), (int)285);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 0: {
                        var6_3 /* !! */  = (int)av.dbwk("dcls", dbwm(int ), (int)265);
                        cfr_temp_0 = 10;
                        if (var7_2) {
                            throw null;
                        }
                        break block84;
                    }
                    case 21: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmn", dbwm(int ), (int)286);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var6_3 /* !! */  = (int)av.dbwk("dclt", dbwm(int ), (int)266);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 19: {
                        var6_3 /* !! */  = (int)av.dbwk("dcml", dbwm(int ), (int)284);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 17: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmj", dbwm(int ), (int)282);
                        if (var7_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 23: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmp", dbwm(int ), (int)288);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var6_3 /* !! */  = (int)av.dbwk("dcme", dbwm(int ), (int)277);
                        cfr_temp_0 = 2;
                        if (var7_2) {
                            throw null;
                        }
                        break block84;
                    }
                    case 24: lbl-1000:
                    // 2 sources

                    {
                        var6_3 /* !! */  = (int)av.dbwk("dcmq", dbwm(int ), (int)289);
                        if (var7_2) {
                            throw null;
                        }
lbl154:
                        // 3 sources

                        var6_3 /* !! */  = (int)av.dbwk("dcmb", dbwm(int ), (int)274);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 15: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmh", dbwm(int ), (int)280);
                        cfr_temp_0 = 22;
                        if (var7_2) {
                            throw null;
                        }
                        break block84;
                    }
lbl163:
                    // 2 sources

                    while (!var5_4 && !var5_4) {
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_4 = av.hd - av.dbwk("dcld", dbwh(int ), (int)124)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  != av.dbwk("dcle", dbwm(int ), (int)255)) ** GOTO lbl170
                            if (var2_5.hasNext()) {
                                break;
                            }
                            ** GOTO lbl174
lbl170:
                            // 1 sources

                            v7 /* !! */  = (long)av.dbwk("dclf", dbwm(int ), (int)256);
                        }
                        if (var5_4) return;
                        ** GOTO lbl176
lbl174:
                        // 1 sources

                        if (var5_4 || var5_4) return;
                        return;
lbl176:
                        // 1 sources

                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_5 = av.hd - av.dbwk("dclg", dbwh(int ), (int)125)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  == av.dbwk("dclh", dbwm(int ), (int)257)) {
                                var3_6 = var2_5.next();
                                if (var5_4) return;
                                break;
                            }
                            v8 /* !! */  = (long)av.dbwk("dcli", dbwm(int ), (int)258);
                        }
                        if (var5_4) return;
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_6 = av.hd - av.dbwk("dclj", dbwh(int ), (int)126)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  == av.dbwk("dclk", dbwm(int ), (int)259)) break;
                            v9 /* !! */  = (long)av.dbwk("dcll", dbwm(int ), (int)260);
                        }
                        v10 = var3_6.getName();
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_7 = av.hd - av.dbwk("dclm", dbwh(int ), (int)127)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v11 /* !! */  != av.dbwk("dcln", dbwm(int ), (int)261)) ** GOTO lbl197
                            if (var1_1.equals(v10)) {
                                break;
                            }
                            ** GOTO lbl-1000
lbl197:
                            // 1 sources

                            v11 /* !! */  = (long)av.dbwk("dclo", dbwm(int ), (int)262);
                        }
                        if (var5_4) return;
                        if (var3_6 instanceof ar) {
                            if (var5_4) return;
                            var4_7 = (ar)var3_6;
                            if (var5_4 || var5_4) return;
                        } else lbl-1000:
                        // 2 sources

                        {
                            if (var5_4 || var5_4) return;
                            if (!var7_2) continue;
                            throw null;
                        }
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_8 = av.hd - av.dbwk("dclp", dbwh(int ), (int)128)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  == av.dbwk("dclq", dbwm(int ), (int)263)) {
                                var4_7.playAppear();
                                if (var5_4) return;
                                break;
                            }
                            v12 /* !! */  = (long)av.dbwk("dclr", dbwm(int ), (int)264);
                        }
                        if (var5_4) return;
                        return;
                    }
                    return;
                    case 2: {
                        var6_3 /* !! */  = (int)av.dbwk("dclu", dbwm(int ), (int)267);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var6_3 /* !! */  = (int)av.dbwk("dclv", dbwm(int ), (int)268);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 22: {
                        var6_3 /* !! */  = (int)av.dbwk("dcmo", dbwm(int ), (int)287);
                        if (var7_2) {
                            throw null;
                        }
                    }
                    case 10: 
                }
                ** GOTO lbl236
            }
            do {
                if (true) continue block40;
lbl236:
                // 2 sources

                var6_3 /* !! */  = (int)av.dbwk("dcmc", dbwm(int ), (int)275);
                cfr_temp_0 = 2;
            } while (!var7_2);
            break;
        }
        throw null;
    }

    private static /* synthetic */ double dcuj(int n2) {
        return Double.longBitsToDouble(dbwi[n2] ^ dbwj[n2]);
    }

    private static /* synthetic */ void ddij() {
        av.dbwn[100] = -1504857637;
        av.dbwn[101] = 1530336216;
        av.dbwn[102] = 1358613340;
        av.dbwn[103] = -2083361098;
        av.dbwn[104] = -1560790219;
        av.dbwn[105] = 2080852681;
        av.dbwn[106] = 39770699;
        av.dbwn[107] = 450161798;
        av.dbwn[108] = -2120951237;
        av.dbwn[109] = 909846268;
        av.dbwn[110] = -1343693598;
        av.dbwn[111] = -1475795723;
        av.dbwn[112] = 981168075;
        av.dbwn[113] = 61711093;
        av.dbwn[114] = -1702301397;
        av.dbwn[115] = 1709834773;
        av.dbwn[116] = -1060452315;
        av.dbwn[117] = 871799515;
        av.dbwn[118] = 2080986093;
        av.dbwn[119] = 745160369;
        av.dbwn[120] = -1339910598;
        av.dbwn[121] = -2081403933;
        av.dbwn[122] = 1974567038;
        av.dbwn[123] = -1186999704;
        av.dbwn[124] = -766873531;
        av.dbwn[125] = 1314877975;
        av.dbwn[126] = -383718782;
        av.dbwn[127] = 1500613263;
        av.dbwn[128] = -1179807403;
        av.dbwn[129] = 780431789;
        av.dbwn[130] = -1005013191;
        av.dbwn[131] = 504653165;
        av.dbwn[132] = 768303456;
        av.dbwn[133] = 1834637055;
        av.dbwn[134] = 1823721834;
        av.dbwn[135] = -1868631477;
        av.dbwn[136] = -1292422450;
        av.dbwn[137] = 1056451959;
        av.dbwn[138] = 2105143055;
        av.dbwn[139] = 171331731;
        av.dbwn[140] = -550232369;
        av.dbwn[141] = 534041428;
        av.dbwn[142] = 1388127625;
        av.dbwn[143] = -407346738;
        av.dbwn[144] = 1955214783;
        av.dbwn[145] = -2086802456;
        av.dbwn[146] = -2104670141;
        av.dbwn[147] = 253906760;
        av.dbwn[148] = -56453300;
        av.dbwn[149] = -806304580;
        av.dbwn[150] = 239079167;
        av.dbwn[151] = -849140122;
        av.dbwn[152] = -567237940;
        av.dbwn[153] = -13841384;
        av.dbwn[154] = -847697229;
        av.dbwn[155] = -1693790489;
        av.dbwn[156] = 972598663;
        av.dbwn[157] = -1767020266;
        av.dbwn[158] = 780588451;
        av.dbwn[159] = -806319120;
        av.dbwn[160] = -1565012899;
        av.dbwn[161] = 1081855738;
        av.dbwn[162] = -942271067;
        av.dbwn[163] = -1658741882;
        av.dbwn[164] = 111151627;
        av.dbwn[165] = -1070077376;
        av.dbwn[166] = -1123857504;
        av.dbwn[167] = 1705889504;
        av.dbwn[168] = 547505979;
        av.dbwn[169] = 1578789570;
        av.dbwn[170] = 427148619;
        av.dbwn[171] = 2059199323;
        av.dbwn[172] = 1711094916;
        av.dbwn[173] = 1575977187;
        av.dbwn[174] = 964569368;
        av.dbwn[175] = 716085399;
        av.dbwn[176] = 97032126;
        av.dbwn[177] = -2122422106;
        av.dbwn[178] = -752513792;
        av.dbwn[179] = 1892518850;
        av.dbwn[180] = -1176102625;
        av.dbwn[181] = -1797035704;
        av.dbwn[182] = 527270807;
        av.dbwn[183] = -1785490893;
        av.dbwn[184] = -52228948;
        av.dbwn[185] = -1194617313;
        av.dbwn[186] = -1399989083;
        av.dbwn[187] = 1210343859;
        av.dbwn[188] = 1074656198;
        av.dbwn[189] = -1899490323;
        av.dbwn[190] = 1599488339;
        av.dbwn[191] = -1204642998;
        av.dbwn[192] = -1188498714;
        av.dbwn[193] = 1796505969;
        av.dbwn[194] = -1423873386;
        av.dbwn[195] = -1342733661;
        av.dbwn[196] = 698205934;
        av.dbwn[197] = -1304609934;
        av.dbwn[198] = -965355215;
        av.dbwn[199] = 1841152937;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onPacket(cr var1_1) {
        v0 /* !! */  = av.hd;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(av.dbwk("dbyz", dbwh(int ), (int)16) - av.dbwk("dbyy", dbwh(int ), (int)15));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 658116958: {
                    continue block57;
                }
                case 1991886182: {
                    break block57;
                }
            }
            break;
        }
        var6_2 = av.c;
        v1 /* !! */  = av.hd;
        if (true) ** GOTO lbl15
        block58: while (true) {
            v1 /* !! */  = (long)(v2 - av.dbwk("dbza", dbwh(int ), (int)17));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 51077610: {
                    v2 = av.dbwk("dbzb", dbwh(int ), (int)18);
                    continue block58;
                }
                case 888061599: {
                    v2 = av.dbwk("dbzc", dbwh(int ), (int)19);
                    continue block58;
                }
                case 1991886182: {
                    break block58;
                }
                case 2038609972: {
                    v2 = av.dbwk("dbzd", dbwh(int ), (int)20);
                    continue block58;
                }
            }
            break;
        }
        var5_3 /* !! */  = av.b;
        v3 /* !! */  = av.hd;
        if (true) ** GOTO lbl32
        block59: while (true) {
            v3 /* !! */  = (long)(av.dbwk("dbzf", dbwh(int ), (int)22) - av.dbwk("dbze", dbwh(int ), (int)21));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1605896901: {
                    continue block59;
                }
                case 1991886182: {
                    break block59;
                }
            }
            break;
        }
        var4_4 = av.a;
        if (var6_2) {
            throw null;
lbl40:
            // 7 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl40
        v4 /* !! */  = av.hd;
        if (true) ** GOTO lbl47
        block61: while (true) {
            v4 /* !! */  = (long)(v5 - av.dbwk("dbzg", dbwh(int ), (int)23));
lbl47:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -729487822: {
                    v5 = av.dbwk("dbzh", dbwh(int ), (int)24);
                    continue block61;
                }
                case 443199946: {
                    v5 = av.dbwk("dbzi", dbwh(int ), (int)25);
                    continue block61;
                }
                case 1085954867: {
                    v5 = av.dbwk("dbzj", dbwh(int ), (int)26);
                    continue block61;
                }
                case 1991886182: {
                    break block61;
                }
            }
            break;
        }
        v6 /* !! */  = av.hd;
        if (true) ** GOTO lbl63
        block62: while (true) {
            v6 /* !! */  = (long)(av.dbwk("dbzl", dbwh(int ), (int)28) - av.dbwk("dbzk", dbwh(int ), (int)27));
lbl63:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -59752967: {
                    continue block62;
                }
                case 1991886182: {
                    break block62;
                }
            }
            break;
        }
        var2_5 = this.elements.iterator();
        if (var4_4) ** GOTO lbl40
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                do {
                    if (var4_4 || var4_4) ** GOTO lbl40
                    v7 /* !! */  = av.hd;
                    if (true) ** GOTO lbl79
                    block64: while (true) {
                        v7 /* !! */  = (long)(v8 - av.dbwk("dbzm", dbwh(int ), (int)29));
lbl79:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1560782775: {
                                v8 = av.dbwk("dbzn", dbwh(int ), (int)30);
                                continue block64;
                            }
                            case 114566959: {
                                v8 = av.dbwk("dbzo", dbwh(int ), (int)31);
                                continue block64;
                            }
                            case 1991886182: {
                                break block64;
                            }
                            case 2106384002: {
                                v8 = av.dbwk("dbzp", dbwh(int ), (int)32);
                                continue block64;
                            }
                        }
                        break;
                    }
                    if (!var2_5.hasNext()) ** GOTO lbl124
                    if (var4_4) ** GOTO lbl40
                    v9 /* !! */  = av.hd;
                    if (true) ** GOTO lbl97
                    block65: while (true) {
                        v9 /* !! */  = (long)(v10 - av.dbwk("dbzq", dbwh(int ), (int)33));
lbl97:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1383832102: {
                                v10 = av.dbwk("dbzr", dbwh(int ), (int)34);
                                continue block65;
                            }
                            case 316022967: {
                                v10 = av.dbwk("dbzs", dbwh(int ), (int)35);
                                continue block65;
                            }
                            case 1633575119: {
                                v10 = av.dbwk("dbzt", dbwh(int ), (int)36);
                                continue block65;
                            }
                            case 1991886182: {
                                break block65;
                            }
                        }
                        break;
                    }
                    var3_6 = var2_5.next();
                    if (var4_4 || var4_4) ** GOTO lbl40
                    v11 /* !! */  = av.hd;
                    if (true) ** GOTO lbl115
                    block66: while (true) {
                        v11 /* !! */  = (long)(av.dbwk("dbzv", dbwh(int ), (int)38) - av.dbwk("dbzu", dbwh(int ), (int)37));
lbl115:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1733487788: {
                                continue block66;
                            }
                            case 1991886182: {
                                break block66;
                            }
                        }
                        break;
                    }
                    var3_6.onPacket(var1_1);
                    if (var4_4 || var4_4) ** GOTO lbl40
                } while (!var6_2);
                throw null;
lbl124:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl127:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)av.dbwk("dbzw", dbwm(int ), (int)47);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl132:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)av.dbwk("dbzx", dbwm(int ), (int)48);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl137:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)av.dbwk("dbzy", dbwm(int ), (int)49);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl142:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)av.dbwk("dbzz", dbwm(int ), (int)50);
                if (!var6_2) ** GOTO lbl127
                throw null;
            }
lbl146:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)av.dbwk("dcaa", dbwm(int ), (int)51);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl181
                    break;
                }
            }
lbl152:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)av.dbwk("dcab", dbwm(int ), (int)52);
                if (!var6_2) ** GOTO lbl146
                throw null;
            }
            case 6: {
                var5_3 /* !! */  = (int)av.dbwk("dcac", dbwm(int ), (int)53);
                if (!var6_2) ** GOTO lbl127
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)av.dbwk("dcad", dbwm(int ), (int)54);
                if (var6_2) {
                    throw null;
                }
            }
            case 8: {
                var5_3 /* !! */  = (int)av.dbwk("dcae", dbwm(int ), (int)55);
                if (!var6_2) ** GOTO lbl152
                throw null;
            }
            case 9: {
                var5_3 /* !! */  = (int)av.dbwk("dcaf", dbwm(int ), (int)56);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 10: {
                var5_3 /* !! */  = (int)av.dbwk("dcag", dbwm(int ), (int)57);
                if (!var6_2) ** GOTO lbl142
                throw null;
            }
            case 11: {
                var5_3 /* !! */  = (int)av.dbwk("dcah", dbwm(int ), (int)58);
                if (!var6_2) ** GOTO lbl137
                throw null;
            }
lbl181:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)av.dbwk("dcai", dbwm(int ), (int)59);
                if (!var6_2) ** GOTO lbl132
                throw null;
            }
lbl185:
            // 3 sources

            case 13: {
                do {
                    var5_3 /* !! */  = (int)av.dbwk("dcaj", dbwm(int ), (int)60);
                } while (!var6_2);
                throw null;
            }
            case 14: 
        }
        var5_3 /* !! */  = (int)av.dbwk("dcak", dbwm(int ), (int)61);
        ** while (!var6_2)
lbl193:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long dbwh(int n2) {
        return dbwi[n2] ^ dbwj[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isElementEnabled(au var1_1) {
        v0 /* !! */  = av.hd;
        block27: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1166974369: {
                    v0 /* !! */  = (long)(av.dbwk("dcfi", dbwh(int ), (int)68) - av.dbwk("dcfh", dbwh(int ), (int)67));
                    continue block27;
                }
                case 1991886182: {
                    break block27;
                }
            }
            break;
        }
        var5_2 = av.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = av.hd - av.dbwk("dcfj", dbwh(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == av.dbwk("dcfk", dbwm(int ), (int)160)) break;
            v1 /* !! */  = (long)av.dbwk("dcfl", dbwm(int ), (int)161);
        }
        var4_3 /* !! */  = av.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = av.hd - av.dbwk("dcfm", dbwh(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == av.dbwk("dcfn", dbwm(int ), (int)162)) {
                var3_4 = av.a;
                if (var5_2) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)av.dbwk("dcfo", dbwm(int ), (int)163);
        }
        if (var3_4 || var3_4) return (boolean)av.dbwk("dcfp", dbwm(int ), (int)164);
        v3 /* !! */  = av.hd;
        if (true) ** GOTO lbl30
        block30: while (true) {
            v3 /* !! */  = (long)(v4 - av.dbwk("dcfq", dbwh(int ), (int)71));
lbl30:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1648269727: {
                    v4 = av.dbwk("dcfr", dbwh(int ), (int)72);
                    continue block30;
                }
                case -1049961871: {
                    v4 = av.dbwk("dcfs", dbwh(int ), (int)73);
                    continue block30;
                }
                case 1702836320: {
                    v4 = av.dbwk("dcft", dbwh(int ), (int)74);
                    continue block30;
                }
                case 1991886182: {
                    break block30;
                }
            }
            break;
        }
        var2_5 = dy.getInstance();
        if (var3_4 || var3_4) return (boolean)av.dbwk("dcfp", dbwm(int ), (int)164);
        if (var2_5 == null) ** GOTO lbl64
        if (var3_4) return (boolean)av.dbwk("dcfp", dbwm(int ), (int)164);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block31: do {
            switch (cfr_temp_0 == -2147483648 ? var4_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v5 /* !! */  = av.hd;
                    block32: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -597252909: {
                                v5 /* !! */  = (long)(av.dbwk("dcfv", dbwh(int ), (int)76) - av.dbwk("dcfu", dbwh(int ), (int)75));
                                continue block32;
                            }
                            case 1991886182: {
                                break block32;
                            }
                        }
                        break;
                    }
                    if (this.isElementEnabled(var1_1, var2_5)) {
                        if (var3_4) return (boolean)av.dbwk("dcfp", dbwm(int ), (int)164);
                        v6 = av.dbwk("dcfw", dbwm(int ), (int)165);
                        if (!var5_2) return (boolean)v6;
                        throw null;
                    }
lbl64:
                    // 3 sources

                    if (var3_4 || var3_4) {
                        return (boolean)av.dbwk("dcfp", dbwm(int ), (int)164);
                    }
                    v6 = av.dbwk("dcfx", dbwm(int ), (int)166);
                    return (boolean)v6;
                }
                case 1: {
                    var4_3 /* !! */  = (int)av.dbwk("dcfz", dbwm(int ), (int)168);
                    cfr_temp_0 = 0;
                    if (!var5_2) continue block31;
                    throw null;
                }
                case 2: {
                    ** GOTO lbl103
                }
                case 4: {
                    var4_3 /* !! */  = (int)av.dbwk("dcgc", dbwm(int ), (int)171);
                    cfr_temp_0 = 6;
                    if (!var5_2) continue block31;
                    throw null;
                }
                case 5: {
                    var4_3 /* !! */  = (int)av.dbwk("dcgd", dbwm(int ), (int)172);
                    cfr_temp_0 = 0;
                    if (!var5_2) continue block31;
                    throw null;
                }
                case 7: {
                    var4_3 /* !! */  = (int)av.dbwk("dcgf", dbwm(int ), (int)174);
                    if (var5_2) {
                        throw null;
                    }
                }
                case 8: {
                    var4_3 /* !! */  = (int)av.dbwk("dcgg", dbwm(int ), (int)175);
                    cfr_temp_0 = 6;
                    if (!var5_2) continue block31;
                    throw null;
                }
                case 9: {
                    var4_3 /* !! */  = (int)av.dbwk("dcgh", dbwm(int ), (int)176);
                    cfr_temp_0 = 6;
                    if (!var5_2) continue block31;
                    throw null;
                }
                case 10: {
                    var4_3 /* !! */  = (int)av.dbwk("dcgi", dbwm(int ), (int)177);
                    if (var5_2) {
                        throw null;
                    }
lbl103:
                    // 3 sources

                    var4_3 /* !! */  = (int)av.dbwk("dcga", dbwm(int ), (int)169);
                    if (var5_2) {
                        throw null;
                    }
                }
                case 3: {
                    var4_3 /* !! */  = (int)av.dbwk("dcgb", dbwm(int ), (int)170);
                    if (var5_2) {
                        throw null;
                    }
                }
                case 0: {
                    var4_3 /* !! */  = (int)av.dbwk("dcfy", dbwm(int ), (int)167);
                    if (var5_2) {
                        throw null;
                    }
                }
                case 6: 
            }
            break;
        } while (true);
        do {
            var4_3 /* !! */  = (int)av.dbwk("dcge", dbwm(int ), (int)173);
        } while (!var5_2);
        throw null;
    }
}

