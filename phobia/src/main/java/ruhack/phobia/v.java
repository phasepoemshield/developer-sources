/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_124
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_2561
 *  net.minecraft.class_2708
 *  net.minecraft.class_2709
 *  net.minecraft.class_310
 *  net.minecraft.class_5250
 *  net.minecraft.class_742
 */
package ruhack.phobia;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import net.minecraft.class_2708;
import net.minecraft.class_2709;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_742;
import ruhack.phobia.aw;
import ruhack.phobia.ca;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.cy;
import ruhack.phobia.dh;
import ruhack.phobia.dj;
import ruhack.phobia.f;
import ruhack.phobia.fu;
import ruhack.phobia.lv;
import ruhack.phobia.na;
import ruhack.phobia.nd;
import ruhack.phobia.nt;

public final class v
extends f {
    private boolean corrected;
    private double targetY;
    private int pathZ;
    private static final long RETRY_DELAY_MS = 400L;
    private static volatile boolean dragonFlyMovementOverride;
    private static final double COLUMN_RADIUS = 0.1;
    public static final boolean a;
    private long correctionAt;
    private boolean walkingToMarker;
    private String targetName;
    private static int[] qqg;
    public static final int b;
    private static final long CONFIRM_DELAY_MS = 900L;
    private static final long COLUMN_HOLD_MS = 1000L;
    private static long[] qsj;
    private double correctionY;
    private static final double HEIGHT_TOLERANCE = 0.35;
    private double heldMarkerZ;
    private static int[] qqh;
    private long attemptAt;
    public static final boolean c;
    private static final double MARKER_HEIGHT = 400.0;
    private long columnEnteredAt;
    public static final long ax = 1377472541728246128L;
    private int pathX;
    private static final class_310 mc;
    private double heldMarkerX;
    private boolean clipping;
    private static long[] qsk;

    private static /* synthetic */ void soq() {
        v.qqh[400] = 1359260732;
        v.qqh[401] = 1492779890;
        v.qqh[402] = 1553728762;
        v.qqh[403] = 687608292;
        v.qqh[404] = -1714235381;
        v.qqh[405] = 256438125;
        v.qqh[406] = -1445480834;
        v.qqh[407] = -1194100760;
        v.qqh[408] = 125970619;
        v.qqh[409] = 1350801541;
        v.qqh[410] = -214809819;
        v.qqh[411] = 717854382;
        v.qqh[412] = 692013808;
        v.qqh[413] = -1491368457;
        v.qqh[414] = 1731154723;
        v.qqh[415] = -1079765195;
        v.qqh[416] = -2007194742;
        v.qqh[417] = -1756845693;
        v.qqh[418] = 744378993;
        v.qqh[419] = -718281974;
        v.qqh[420] = 631097530;
        v.qqh[421] = 1770972963;
        v.qqh[422] = 1380694504;
        v.qqh[423] = 1357253498;
        v.qqh[424] = 1782190550;
        v.qqh[425] = -1197012810;
        v.qqh[426] = 762306353;
        v.qqh[427] = -808662532;
        v.qqh[428] = -787049838;
        v.qqh[429] = -351646811;
        v.qqh[430] = 1959989292;
        v.qqh[431] = 1818608898;
        v.qqh[432] = 90926077;
        v.qqh[433] = 1366419005;
        v.qqh[434] = -1416403946;
        v.qqh[435] = 1242590091;
        v.qqh[436] = -1609709044;
        v.qqh[437] = 841905545;
        v.qqh[438] = -1481303510;
        v.qqh[439] = 96463508;
        v.qqh[440] = 1070926042;
        v.qqh[441] = 210952528;
        v.qqh[442] = 581356744;
        v.qqh[443] = -1236036527;
        v.qqh[444] = 902411812;
        v.qqh[445] = -678189231;
        v.qqh[446] = -1696886733;
        v.qqh[447] = -1156547613;
        v.qqh[448] = 59409709;
        v.qqh[449] = 1067204289;
        v.qqh[450] = 1106039529;
        v.qqh[451] = 831879605;
        v.qqh[452] = 716466855;
        v.qqh[453] = -664682361;
        v.qqh[454] = 1202858201;
        v.qqh[455] = -2012150161;
        v.qqh[456] = 2011632009;
        v.qqh[457] = 67352779;
        v.qqh[458] = 434580558;
        v.qqh[459] = -831907817;
        v.qqh[460] = -706585262;
        v.qqh[461] = 1614122292;
        v.qqh[462] = 747049496;
        v.qqh[463] = 300440921;
        v.qqh[464] = -1584281488;
        v.qqh[465] = -1623029833;
        v.qqh[466] = -1629544718;
        v.qqh[467] = 1328034691;
        v.qqh[468] = 1319750798;
        v.qqh[469] = -1169205412;
        v.qqh[470] = 475490330;
        v.qqh[471] = 1954537883;
        v.qqh[472] = 1275973337;
        v.qqh[473] = -1621958587;
        v.qqh[474] = 1135059665;
        v.qqh[475] = 828753391;
        v.qqh[476] = -1200145691;
        v.qqh[477] = -1547473540;
        v.qqh[478] = 34355188;
        v.qqh[479] = 545016806;
        v.qqh[480] = 1882818310;
        v.qqh[481] = -1089240700;
        v.qqh[482] = 1424759962;
        v.qqh[483] = -486329829;
        v.qqh[484] = -788260103;
        v.qqh[485] = -65132042;
        v.qqh[486] = -189767188;
        v.qqh[487] = 1114771789;
        v.qqh[488] = -2141536999;
        v.qqh[489] = -337021162;
        v.qqh[490] = -1374556482;
        v.qqh[491] = -993355030;
        v.qqh[492] = 1356801843;
        v.qqh[493] = -570130009;
        v.qqh[494] = 89380934;
        v.qqh[495] = -1355441173;
        v.qqh[496] = 1359991774;
        v.qqh[497] = 1102893084;
        v.qqh[498] = 1720661351;
        v.qqh[499] = 994064537;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public v() {
        var2_1 /* !! */  = v.b;
        super("tp", "\u0412\u044b\u0431\u0438\u0440\u0430\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0430 \u0438 \u043e\u0442\u043c\u0435\u0447\u0430\u0435\u0442 \u043a\u043e\u043b\u043e\u043d\u043d\u0443 \u0434\u043b\u044f \u0432\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430", new String[0]);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.pathX = (int)v.qqi("qqj", qqf(int ), (int)0);
                this.pathZ = (int)v.qqi("qqk", qqf(int ), (int)1);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)v.qqi("qql", qqf(int ), (int)2);
            }
            case 1: {
                var2_1 /* !! */  = (int)v.qqi("qqm", qqf(int ), (int)3);
                break;
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)v.qqi("qqn", qqf(int ), (int)4);
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)v.qqi("qqo", qqf(int ), (int)5);
                    break;
                }
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)v.qqi("qqp", qqf(int ), (int)6);
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void finishClip() {
        block107: {
            v0 /* !! */  = v.ax;
            if (true) ** GOTO lbl5
            block65: while (true) {
                v0 /* !! */  = (long)(v1 - v.qqi("rxx", qss(int ), (int)224));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2121201296: {
                        break block65;
                    }
                    case -1391133270: {
                        v1 = v.qqi("rxy", qss(int ), (int)225);
                        continue block65;
                    }
                    case 1047358691: {
                        v1 = v.qqi("rxz", qss(int ), (int)226);
                        continue block65;
                    }
                }
                break;
            }
            var6_1 = v.c;
            v2 /* !! */  = v.ax;
            if (true) ** GOTO lbl19
            block66: while (true) {
                v2 /* !! */  = (long)(v3 - v.qqi("rya", qss(int ), (int)227));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2121201296: {
                        break block66;
                    }
                    case 1413769271: {
                        v3 = v.qqi("ryb", qss(int ), (int)228);
                        continue block66;
                    }
                    case 1680123128: {
                        v3 = v.qqi("ryc", qss(int ), (int)229);
                        continue block66;
                    }
                }
                break;
            }
            var5_2 /* !! */  = v.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("ryd", qss(int ), (int)230)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == v.qqi("rye", qqf(int ), (int)419)) {
                    var4_3 = v.a;
                    if (var6_1) {
                        throw null;
                    }
                    break;
                }
                v4 /* !! */  = (long)v.qqi("ryf", qqf(int ), (int)420);
            }
            if (var4_3 || var4_3) return;
            v5 /* !! */  = v.ax;
            if (true) ** GOTO lbl43
            block68: while (true) {
                v5 /* !! */  = (long)(v6 - v.qqi("ryg", qss(int ), (int)231));
lbl43:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -2121201296: {
                        break block68;
                    }
                    case -727717997: {
                        v6 = v.qqi("ryh", qss(int ), (int)232);
                        continue block68;
                    }
                    case -68659982: {
                        v6 = v.qqi("ryi", qss(int ), (int)233);
                        continue block68;
                    }
                    case 413070809: {
                        v6 = v.qqi("ryj", qss(int ), (int)234);
                        continue block68;
                    }
                }
                break;
            }
            var1_4 = this.targetName;
            if (var4_3 || var4_3) return;
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block69: do {
                switch (cfr_temp_0 == -2147483648 ? var5_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("ryk", qss(int ), (int)235)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  == v.qqi("ryl", qqf(int ), (int)421)) {
                                var2_5 = this.targetY;
                                if (var4_3) return;
                                break;
                            }
                            v7 /* !! */  = (long)v.qqi("rym", qqf(int ), (int)422);
                        }
                        if (var4_3) return;
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_3 = v.ax - v.qqi("ryn", qss(int ), (int)236)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  == v.qqi("ryo", qqf(int ), (int)423)) {
                                this.clear();
                                if (var4_3) return;
                                break;
                            }
                            v8 /* !! */  = (long)v.qqi("ryp", qqf(int ), (int)424);
                        }
                        if (var4_3) return;
                        v9 /* !! */  = v.ax;
                        block72: while (true) {
                            switch ((int)v9 /* !! */ ) {
                                case -2121201296: {
                                    break block72;
                                }
                                case -64027126: {
                                    v10 = v.qqi("ryr", qss(int ), (int)238);
                                    ** GOTO lbl93
                                }
                                case 166032332: {
                                    v10 = v.qqi("rys", qss(int ), (int)239);
                                    ** GOTO lbl93
                                }
                                case 690593556: {
                                    v10 = v.qqi("ryt", qss(int ), (int)240);
lbl93:
                                    // 3 sources

                                    v9 /* !! */  = (long)(v10 - v.qqi("ryq", qss(int ), (int)237));
                                    continue block72;
                                }
                            }
                            break;
                        }
                        v11 = class_2561.method_43470((String)"\u0412\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u044c\u043d\u044b\u0439 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442 \u043a ");
                        v12 /* !! */  = v.ax;
                        block73: while (true) {
                            switch ((int)v12 /* !! */ ) {
                                case -2121201296: {
                                    break block73;
                                }
                                case 681435559: {
                                    v13 = v.qqi("ryv", qss(int ), (int)242);
                                    ** GOTO lbl106
                                }
                                case 1893014070: {
                                    v13 = v.qqi("ryw", qss(int ), (int)243);
lbl106:
                                    // 2 sources

                                    v12 /* !! */  = (long)(v13 - v.qqi("ryu", qss(int ), (int)241));
                                    continue block73;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v14 /* !! */  = (cfr_temp_4 = v.ax - v.qqi("ryx", qss(int ), (int)244)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v14 /* !! */  == v.qqi("ryy", qqf(int ), (int)425)) {
                                v15 = v11.method_27692(class_124.field_1080);
                                v16 /* !! */  = v.ax;
                                break block107;
                            }
                            v14 /* !! */  = (long)v.qqi("ryz", qqf(int ), (int)426);
                        }
                    }
                    case 0: {
                        var5_2 /* !! */  = (int)v.qqi("saj", qqf(int ), (int)441);
                        if (var6_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 4: {
                        var5_2 /* !! */  = (int)v.qqi("san", qqf(int ), (int)445);
                        cfr_temp_0 = 10;
                        if (!var6_1) continue block69;
                        throw null;
                    }
                    case 5: {
                        var5_2 /* !! */  = (int)v.qqi("sao", qqf(int ), (int)446);
                        cfr_temp_0 = 9;
                        if (!var6_1) continue block69;
                        throw null;
                    }
                    case 6: {
                        var5_2 /* !! */  = (int)v.qqi("sap", qqf(int ), (int)447);
                        if (var6_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** GOTO lbl163
                    }
                    case 7: {
                        var5_2 /* !! */  = (int)v.qqi("saq", qqf(int ), (int)448);
                        cfr_temp_0 = 9;
                        if (!var6_1) continue block69;
                        throw null;
                    }
                    case 10: {
                        var5_2 /* !! */  = (int)v.qqi("sat", qqf(int ), (int)451);
                        if (var6_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var5_2 /* !! */  = (int)v.qqi("sam", qqf(int ), (int)444);
                        if (var6_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var5_2 /* !! */  = (int)v.qqi("sas", qqf(int ), (int)450);
                        if (var6_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var5_2 /* !! */  = (int)v.qqi("sar", qqf(int ), (int)449);
                        cfr_temp_0 = 2;
                        if (!var6_1) continue block69;
                        throw null;
                    }
                    case 11: lbl-1000:
                    // 2 sources

                    {
                        var5_2 /* !! */  = (int)v.qqi("sau", qqf(int ), (int)452);
                        if (var6_1) {
                            throw null;
                        }
lbl163:
                        // 3 sources

                        var5_2 /* !! */  = (int)v.qqi("sak", qqf(int ), (int)442);
                        if (var6_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            } while (true);
            do {
                var5_2 /* !! */  = (int)v.qqi("sal", qqf(int ), (int)443);
            } while (!var6_1);
            throw null;
        }
        block76: while (true) {
            switch ((int)v16 /* !! */ ) {
                case -2121201296: {
                    break block76;
                }
                case 565321991: {
                    v16 /* !! */  = (long)(v.qqi("rzb", qss(int ), (int)246) - v.qqi("rza", qss(int ), (int)245));
                    continue block76;
                }
            }
            break;
        }
        v17 = class_2561.method_43470((String)var1_4);
        while (true) {
            block108: {
                if ((v18 /* !! */  = (cfr_temp_5 = v.ax - v.qqi("rzc", qss(int ), (int)247)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  != v.qqi("rzd", qqf(int ), (int)427)) break block108;
                v19 /* !! */  = v.ax;
                if (true) ** GOTO lbl192
            }
            v18 /* !! */  = (long)v.qqi("rze", qqf(int ), (int)428);
        }
        block78: while (true) {
            v19 /* !! */  = (long)(v20 - v.qqi("rzf", qss(int ), (int)248));
lbl192:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -2121201296: {
                    break block78;
                }
                case 857712173: {
                    v20 = v.qqi("rzg", qss(int ), (int)249);
                    continue block78;
                }
                case 1553182758: {
                    v20 = v.qqi("rzh", qss(int ), (int)250);
                    continue block78;
                }
                case 1993161039: {
                    v20 = v.qqi("rzi", qss(int ), (int)251);
                    continue block78;
                }
            }
            break;
        }
        v21 = v17.method_27692(class_124.field_1068);
        while (true) {
            block109: {
                if ((v22 /* !! */  = (cfr_temp_6 = v.ax - v.qqi("rzj", qss(int ), (int)252)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v22 /* !! */  != v.qqi("rzk", qqf(int ), (int)429)) break block109;
                v23 = v15.method_10852((class_2561)v21);
                v24 /* !! */  = v.ax;
                if (true) ** GOTO lbl216
            }
            v22 /* !! */  = (long)v.qqi("rzl", qqf(int ), (int)430);
        }
        block80: while (true) {
            v24 /* !! */  = (long)(v25 - v.qqi("rzm", qss(int ), (int)253));
lbl216:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -2121201296: {
                    break block80;
                }
                case -670740617: {
                    v25 = v.qqi("rzn", qss(int ), (int)254);
                    continue block80;
                }
                case -52973126: {
                    v25 = v.qqi("rzo", qss(int ), (int)255);
                    continue block80;
                }
            }
            break;
        }
        v26 = new Object[1];
        v27 = v.qqi("rzp", qqf(int ), (int)431);
        while (true) {
            if ((v28 = (cfr_temp_7 = v.ax - v.qqi("rzq", qss(int ), (int)256)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v28 == v.qqi("rzr", qqf(int ), (int)432)) break;
            v28 = 763200944;
        }
        v26[v27] = var2_5;
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_8 = v.ax - v.qqi("rzs", qss(int ), (int)257)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == v.qqi("rzt", qqf(int ), (int)433)) break;
            v29 /* !! */  = (long)v.qqi("rzu", qqf(int ), (int)434);
        }
        v30 = String.format(Locale.ROOT, " (Y %.1f)", v26);
        v31 /* !! */  = v.ax;
        block83: while (true) {
            switch ((int)v31 /* !! */ ) {
                case -2121201296: {
                    break block83;
                }
                case 1809818584: {
                    v31 /* !! */  = (long)(v.qqi("rzw", qss(int ), (int)259) - v.qqi("rzv", qss(int ), (int)258));
                    continue block83;
                }
            }
            break;
        }
        v32 = class_2561.method_43470((String)v30);
        v33 /* !! */  = v.ax;
        if (true) ** GOTO lbl252
        block84: while (true) {
            v33 /* !! */  = (long)(v34 - v.qqi("rzx", qss(int ), (int)260));
lbl252:
            // 2 sources

            switch ((int)v33 /* !! */ ) {
                case -2121201296: {
                    break block84;
                }
                case 281391820: {
                    v34 = v.qqi("rzy", qss(int ), (int)261);
                    continue block84;
                }
                case 695761301: {
                    v34 = v.qqi("rzz", qss(int ), (int)262);
                    continue block84;
                }
            }
            break;
        }
        while (true) {
            if ((v35 /* !! */  = (cfr_temp_9 = v.ax - v.qqi("saa", qss(int ), (int)263)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v35 /* !! */  == v.qqi("sab", qqf(int ), (int)435)) break;
            v35 /* !! */  = (long)v.qqi("sac", qqf(int ), (int)436);
        }
        v36 = v32.method_27692(class_124.field_1080);
        while (true) {
            if ((v37 /* !! */  = (cfr_temp_10 = v.ax - v.qqi("sad", qss(int ), (int)264)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v37 /* !! */  == v.qqi("sae", qqf(int ), (int)437)) break;
            v37 /* !! */  = (long)v.qqi("saf", qqf(int ), (int)438);
        }
        v38 = v23.method_10852((class_2561)v36);
        while (true) {
            if ((v39 /* !! */  = (cfr_temp_11 = v.ax - v.qqi("sag", qss(int ), (int)265)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v39 /* !! */  == v.qqi("sah", qqf(int ), (int)439)) {
                this.logDirect(v38);
                if (var4_3) return;
                break;
            }
            v39 /* !! */  = (long)v.qqi("sai", qqf(int ), (int)440);
        }
        if (!var4_3) return;
    }

    private static /* synthetic */ void soh() {
        v.qqg[200] = -1524480512;
        v.qqg[201] = -816750676;
        v.qqg[202] = -1066762624;
        v.qqg[203] = -1372187142;
        v.qqg[204] = 534137773;
        v.qqg[205] = -1575029294;
        v.qqg[206] = 1743852582;
        v.qqg[207] = -958895044;
        v.qqg[208] = 238160866;
        v.qqg[209] = -92412097;
        v.qqg[210] = -1188249810;
        v.qqg[211] = -184788555;
        v.qqg[212] = -1252319154;
        v.qqg[213] = -1162295054;
        v.qqg[214] = 936217882;
        v.qqg[215] = 935824738;
        v.qqg[216] = 2126428529;
        v.qqg[217] = -1697369379;
        v.qqg[218] = 360437840;
        v.qqg[219] = 438319255;
        v.qqg[220] = 1562051325;
        v.qqg[221] = -1946658746;
        v.qqg[222] = 1411489376;
        v.qqg[223] = 645075433;
        v.qqg[224] = -110256086;
        v.qqg[225] = -95877357;
        v.qqg[226] = -1877811557;
        v.qqg[227] = 1035979107;
        v.qqg[228] = -390499542;
        v.qqg[229] = -888844033;
        v.qqg[230] = 150305342;
        v.qqg[231] = -587485566;
        v.qqg[232] = -246131633;
        v.qqg[233] = -1304908583;
        v.qqg[234] = -1705506657;
        v.qqg[235] = -1103624968;
        v.qqg[236] = -1482750873;
        v.qqg[237] = -1599950192;
        v.qqg[238] = -2093381789;
        v.qqg[239] = -1971767409;
        v.qqg[240] = 639041099;
        v.qqg[241] = -2146747530;
        v.qqg[242] = 1471802037;
        v.qqg[243] = 339360077;
        v.qqg[244] = -2082418170;
        v.qqg[245] = -2015798703;
        v.qqg[246] = 135058454;
        v.qqg[247] = 1125114004;
        v.qqg[248] = 357836526;
        v.qqg[249] = 110428839;
        v.qqg[250] = -1029491796;
        v.qqg[251] = 1322810864;
        v.qqg[252] = -2122369397;
        v.qqg[253] = -989842341;
        v.qqg[254] = 1212938732;
        v.qqg[255] = 677623144;
        v.qqg[256] = 866193919;
        v.qqg[257] = 980395571;
        v.qqg[258] = 109091598;
        v.qqg[259] = -1904209092;
        v.qqg[260] = 1547668541;
        v.qqg[261] = 1808228176;
        v.qqg[262] = 1075063000;
        v.qqg[263] = 1174966201;
        v.qqg[264] = 1144029892;
        v.qqg[265] = 1572908584;
        v.qqg[266] = -1662752476;
        v.qqg[267] = -898062174;
        v.qqg[268] = 411281006;
        v.qqg[269] = -1185368164;
        v.qqg[270] = 2014564744;
        v.qqg[271] = -431244505;
        v.qqg[272] = -1446151154;
        v.qqg[273] = 1686732973;
        v.qqg[274] = -1442210916;
        v.qqg[275] = -1695893221;
        v.qqg[276] = 309018955;
        v.qqg[277] = 1520280679;
        v.qqg[278] = 392183029;
        v.qqg[279] = -1873732682;
        v.qqg[280] = 77446907;
        v.qqg[281] = 845346758;
        v.qqg[282] = 1499347637;
        v.qqg[283] = -2085064502;
        v.qqg[284] = -2113206172;
        v.qqg[285] = 356943571;
        v.qqg[286] = 1721913168;
        v.qqg[287] = 408910818;
        v.qqg[288] = -1474021449;
        v.qqg[289] = -956142175;
        v.qqg[290] = 364705146;
        v.qqg[291] = 293930345;
        v.qqg[292] = 1522104813;
        v.qqg[293] = -1050256047;
        v.qqg[294] = -1091068565;
        v.qqg[295] = 1594927667;
        v.qqg[296] = 1451752;
        v.qqg[297] = 1836457926;
        v.qqg[298] = -5459849;
        v.qqg[299] = -1119894320;
    }

    private static /* synthetic */ void soi() {
        v.qqg[300] = 622715721;
        v.qqg[301] = -1160389117;
        v.qqg[302] = -16362969;
        v.qqg[303] = 572574862;
        v.qqg[304] = 1721440097;
        v.qqg[305] = 1897900037;
        v.qqg[306] = 713938269;
        v.qqg[307] = -1509397427;
        v.qqg[308] = 245753769;
        v.qqg[309] = -129121428;
        v.qqg[310] = 417727952;
        v.qqg[311] = 298927804;
        v.qqg[312] = 945455403;
        v.qqg[313] = 52398219;
        v.qqg[314] = -1291454948;
        v.qqg[315] = 428054280;
        v.qqg[316] = 2138049152;
        v.qqg[317] = 524183728;
        v.qqg[318] = 3437497;
        v.qqg[319] = -1784701069;
        v.qqg[320] = -1117884213;
        v.qqg[321] = 1570178179;
        v.qqg[322] = 1811195273;
        v.qqg[323] = 443634745;
        v.qqg[324] = -1109359922;
        v.qqg[325] = 104464101;
        v.qqg[326] = 1242964222;
        v.qqg[327] = -658904614;
        v.qqg[328] = -136008164;
        v.qqg[329] = -2089334651;
        v.qqg[330] = -812868585;
        v.qqg[331] = 1015330358;
        v.qqg[332] = 1691361917;
        v.qqg[333] = 841492923;
        v.qqg[334] = -1839955992;
        v.qqg[335] = -637836882;
        v.qqg[336] = 1728644697;
        v.qqg[337] = 1995112128;
        v.qqg[338] = 413758360;
        v.qqg[339] = -2133717867;
        v.qqg[340] = -1662058569;
        v.qqg[341] = -484128396;
        v.qqg[342] = 425009117;
        v.qqg[343] = -354494900;
        v.qqg[344] = 1837800963;
        v.qqg[345] = -349402421;
        v.qqg[346] = -99974299;
        v.qqg[347] = -1366837202;
        v.qqg[348] = -736464704;
        v.qqg[349] = -1220942480;
        v.qqg[350] = -359758069;
        v.qqg[351] = -1193971778;
        v.qqg[352] = -1466020789;
        v.qqg[353] = 755805470;
        v.qqg[354] = -13859520;
        v.qqg[355] = -400635307;
        v.qqg[356] = -291300390;
        v.qqg[357] = -1080515058;
        v.qqg[358] = 1061036344;
        v.qqg[359] = -1210026616;
        v.qqg[360] = 1020177395;
        v.qqg[361] = -699002382;
        v.qqg[362] = -852627717;
        v.qqg[363] = -635639377;
        v.qqg[364] = -858203728;
        v.qqg[365] = -76962579;
        v.qqg[366] = 2085752721;
        v.qqg[367] = -488367659;
        v.qqg[368] = 295139537;
        v.qqg[369] = 291515978;
        v.qqg[370] = 1463450743;
        v.qqg[371] = -1300315172;
        v.qqg[372] = 464126736;
        v.qqg[373] = 2146840127;
        v.qqg[374] = 1516767505;
        v.qqg[375] = 1377517449;
        v.qqg[376] = 2120970397;
        v.qqg[377] = 1758021518;
        v.qqg[378] = -1780352438;
        v.qqg[379] = 1944616269;
        v.qqg[380] = -1904062862;
        v.qqg[381] = -1113295372;
        v.qqg[382] = 1906402017;
        v.qqg[383] = 1362629994;
        v.qqg[384] = -173947568;
        v.qqg[385] = 188643681;
        v.qqg[386] = -2113469941;
        v.qqg[387] = 732348878;
        v.qqg[388] = -219986161;
        v.qqg[389] = 528735983;
        v.qqg[390] = 1249252581;
        v.qqg[391] = 2058762868;
        v.qqg[392] = 2119279970;
        v.qqg[393] = 1506948000;
        v.qqg[394] = -1681162629;
        v.qqg[395] = 430021224;
        v.qqg[396] = -2131247777;
        v.qqg[397] = 415205505;
        v.qqg[398] = -486052955;
        v.qqg[399] = 1563842476;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldChange(dh var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("rbn", qss(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == v.qqi("rbo", qqf(int ), (int)229)) break;
            v0 /* !! */  = (long)v.qqi("rbp", qqf(int ), (int)230);
        }
        var4_2 = v.c;
        v1 /* !! */  = v.ax;
        if (true) ** GOTO lbl11
        block7: while (true) {
            v1 /* !! */  = (long)(v2 - v.qqi("rbq", qss(int ), (int)57));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2121201296: {
                    break block7;
                }
                case -2013293955: {
                    v2 = v.qqi("rbr", qss(int ), (int)58);
                    continue block7;
                }
                case -1405084711: {
                    v2 = v.qqi("rbs", qss(int ), (int)59);
                    continue block7;
                }
                case 1104318985: {
                    v2 = v.qqi("rbt", qss(int ), (int)60);
                    continue block7;
                }
            }
            break;
        }
        var3_3 = v.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("rbu", qss(int ), (int)61)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == v.qqi("rbv", qqf(int ), (int)231)) break;
            v3 /* !! */  = (long)v.qqi("rbw", qqf(int ), (int)232);
        }
        var2_4 = v.a;
        if (var4_2) {
            throw null;
lbl32:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("rbx", qss(int ), (int)62)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == v.qqi("rby", qqf(int ), (int)233)) break;
            v4 /* !! */  = (long)v.qqi("rbz", qqf(int ), (int)234);
        }
        this.clear();
        ** while (var2_4 || var2_4)
lbl42:
        // 1 sources

    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void resetClipState() {
        v0 /* !! */  = v.ax;
        if (true) ** GOTO lbl5
        block57: while (true) {
            v0 /* !! */  = (long)(v1 - v.qqi("sav", qss(int ), (int)266));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2141565735: {
                    v1 = v.qqi("saw", qss(int ), (int)267);
                    continue block57;
                }
                case -2121201296: {
                    break block57;
                }
                case -1950792508: {
                    v1 = v.qqi("sax", qss(int ), (int)268);
                    continue block57;
                }
            }
            break;
        }
        var3_1 = v.c;
        v2 /* !! */  = v.ax;
        if (true) ** GOTO lbl19
        block58: while (true) {
            v2 /* !! */  = (long)(v3 - v.qqi("say", qss(int ), (int)269));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2121201296: {
                    break block58;
                }
                case -1750650724: {
                    v3 = v.qqi("saz", qss(int ), (int)270);
                    continue block58;
                }
                case 388597227: {
                    v3 = v.qqi("sba", qss(int ), (int)271);
                    continue block58;
                }
                case 1797323693: {
                    v3 = v.qqi("sbb", qss(int ), (int)272);
                    continue block58;
                }
            }
            break;
        }
        var2_2 /* !! */  = v.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("sbc", qss(int ), (int)273)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == v.qqi("sbd", qqf(int ), (int)453)) {
                var1_3 = v.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v4 /* !! */  = (long)v.qqi("sbe", qqf(int ), (int)454);
        }
        if (var1_3 || var1_3) return;
        v5 = v.qqi("sbf", qqf(int ), (int)455);
        v6 /* !! */  = v.ax;
        if (true) ** GOTO lbl48
        block60: while (true) {
            v6 /* !! */  = (long)(v7 - v.qqi("sbg", qss(int ), (int)274));
lbl48:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2121201296: {
                    break block60;
                }
                case -1303183134: {
                    v7 = v.qqi("sbh", qss(int ), (int)275);
                    continue block60;
                }
                case -684026284: {
                    v7 = v.qqi("sbi", qss(int ), (int)276);
                    continue block60;
                }
                case 1371564306: {
                    v7 = v.qqi("sbj", qss(int ), (int)277);
                    continue block60;
                }
            }
            break;
        }
        this.clipping = v5;
        if (var1_3 || var1_3) return;
        v8 /* !! */  = v.ax;
        block61: while (true) {
            switch ((int)v8 /* !! */ ) {
                case -2121201296: {
                    break block61;
                }
                case -1203836983: {
                    v8 /* !! */  = (long)(v.qqi("sbl", qss(int ), (int)279) - v.qqi("sbk", qss(int ), (int)278));
                    continue block61;
                }
            }
            break;
        }
        this.targetY = 0.0;
        if (var1_3 || var1_3) return;
        v9 = v.qqi("sbm", qss(int ), (int)280);
        v10 /* !! */  = v.ax;
        block62: while (true) {
            switch ((int)v10 /* !! */ ) {
                case -2121201296: {
                    break block62;
                }
                case 1092004114: {
                    v10 /* !! */  = (long)(v.qqi("sbo", qss(int ), (int)282) - v.qqi("sbn", qss(int ), (int)281));
                    continue block62;
                }
            }
            break;
        }
        this.attemptAt = (long)v9;
        if (var1_3 || var1_3) return;
        v11 = v.qqi("sbp", qss(int ), (int)283);
        v12 /* !! */  = v.ax;
        block63: while (true) {
            switch ((int)v12 /* !! */ ) {
                case -2121201296: {
                    break block63;
                }
                case -1449070843: {
                    v12 /* !! */  = (long)(v.qqi("sbr", qss(int ), (int)285) - v.qqi("sbq", qss(int ), (int)284));
                    continue block63;
                }
            }
            break;
        }
        this.correctionAt = (long)v11;
        if (var1_3 || var1_3) return;
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("sbs", qss(int ), (int)286)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v13 /* !! */  == v.qqi("sbt", qqf(int ), (int)456)) {
                this.correctionY = 0.0;
                if (var1_3) return;
                break;
            }
            v13 /* !! */  = (long)v.qqi("sbu", qqf(int ), (int)457);
        }
        if (var1_3) return;
        v14 = v.qqi("sbv", qqf(int ), (int)458);
        v15 /* !! */  = v.ax;
        block65: while (true) {
            switch ((int)v15 /* !! */ ) {
                case -2121201296: {
                    break block65;
                }
                case -1022890179: {
                    v15 /* !! */  = (long)(v.qqi("sbx", qss(int ), (int)288) - v.qqi("sbw", qss(int ), (int)287));
                    continue block65;
                }
            }
            break;
        }
        this.corrected = v14;
        if (var1_3 || var1_3) return;
        v16 /* !! */  = v.ax;
        block66: while (true) {
            switch ((int)v16 /* !! */ ) {
                case -2121201296: {
                    break block66;
                }
                case 1790284197: {
                    v16 /* !! */  = (long)(v.qqi("sbz", qss(int ), (int)290) - v.qqi("sby", qss(int ), (int)289));
                    continue block66;
                }
            }
            break;
        }
        this.resetColumnHold();
        if (var1_3) return;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block67: while (true) {
            block95: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!var1_3) return;
                        return;
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)v.qqi("sca", qqf(int ), (int)459);
                        cfr_temp_0 = 16;
                        if (var3_1) {
                            throw null;
                        }
                        break block95;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)v.qqi("scd", qqf(int ), (int)462);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block95;
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)v.qqi("scf", qqf(int ), (int)464);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block95;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)v.qqi("scg", qqf(int ), (int)465);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)v.qqi("scj", qqf(int ), (int)468);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)v.qqi("scb", qqf(int ), (int)460);
                        cfr_temp_0 = 14;
                        if (var3_1) {
                            throw null;
                        }
                        break block95;
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)v.qqi("scm", qqf(int ), (int)471);
                        cfr_temp_0 = 11;
                        if (var3_1) {
                            throw null;
                        }
                        break block95;
                    }
                    case 13: {
                        var2_2 /* !! */  = (int)v.qqi("scn", qqf(int ), (int)472);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 10: {
                        ** GOTO lbl204
                    }
                    case 14: {
                        var2_2 /* !! */  = (int)v.qqi("sco", qqf(int ), (int)473);
                        cfr_temp_0 = 16;
                        if (var3_1) {
                            throw null;
                        }
                        break block95;
                    }
                    case 15: {
                        do {
                            var2_2 /* !! */  = (int)v.qqi("scp", qqf(int ), (int)474);
                        } while (!var3_1);
                        throw null;
                    }
                    case 16: {
                        var2_2 /* !! */  = (int)v.qqi("scq", qqf(int ), (int)475);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)v.qqi("sce", qqf(int ), (int)463);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        do {
                            var2_2 /* !! */  = (int)v.qqi("sci", qqf(int ), (int)467);
                        } while (!var3_1);
                        throw null;
                    }
                    case 17: {
                        var2_2 /* !! */  = (int)v.qqi("scr", qqf(int ), (int)476);
                        if (var3_1) {
                            throw null;
                        }
lbl204:
                        // 3 sources

                        var2_2 /* !! */  = (int)v.qqi("sck", qqf(int ), (int)469);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 11: {
                        do {
                            var2_2 /* !! */  = (int)v.qqi("scl", qqf(int ), (int)470);
                        } while (!var3_1);
                        throw null;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)v.qqi("scc", qqf(int ), (int)461);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 7: 
                }
                ** GOTO lbl221
            }
            do {
                if (true) continue block67;
lbl221:
                // 2 sources

                var2_2 /* !! */  = (int)v.qqi("sch", qqf(int ), (int)466);
                cfr_temp_0 = 2;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ long qss(int n2) {
        return qsj[n2] ^ qsk[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @aw
    public void onGameLeft(ca ca2) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ax - v.qqi("rcg", qss(int ), (int)63)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == v.qqi("rch", qqf(int ), (int)241)) break;
            object = v.qqi("rci", qqf(int ), (int)242);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ax - v.qqi("rcj", qss(int ), (int)64)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == v.qqi("rck", qqf(int ), (int)243)) break;
            object = v.qqi("rcl", qqf(int ), (int)244);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ax - v.qqi("rcm", qss(int ), (int)65)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == v.qqi("rcn", qqf(int ), (int)245)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = v.qqi("rco", qqf(int ), (int)246);
        }
        if (bl2 || bl2) return;
        Object object = ax;
        boolean bl4 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - v.qqi("rcp", qss(int ), (int)66);
            }
            switch ((int)object) {
                case -2121201296: {
                    break block9;
                }
                case -1055465341: {
                    callSite = v.qqi("rcq", qss(int ), (int)67);
                    continue block9;
                }
                case 1435124675: {
                    callSite = v.qqi("rcr", qss(int ), (int)68);
                    continue block9;
                }
                case 2026417684: {
                    callSite = v.qqi("rcs", qss(int ), (int)69);
                    continue block9;
                }
            }
            break;
        }
        this.clear();
        if (!bl2 && !bl2) return;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetColumnHold() {
        v0 /* !! */  = v.ax;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - v.qqi("scs", qss(int ), (int)291));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2121201296: {
                    break block34;
                }
                case -1514186294: {
                    v1 = v.qqi("sct", qss(int ), (int)292);
                    continue block34;
                }
                case -1308206040: {
                    v1 = v.qqi("scu", qss(int ), (int)293);
                    continue block34;
                }
                case -460803328: {
                    v1 = v.qqi("scv", qss(int ), (int)294);
                    continue block34;
                }
            }
            break;
        }
        var3_1 = v.c;
        v2 /* !! */  = v.ax;
        if (true) ** GOTO lbl22
        block35: while (true) {
            v2 /* !! */  = (long)(v3 - v.qqi("scw", qss(int ), (int)295));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2123277042: {
                    v3 = v.qqi("scx", qss(int ), (int)296);
                    continue block35;
                }
                case -2121201296: {
                    break block35;
                }
                case -2098527989: {
                    v3 = v.qqi("scy", qss(int ), (int)297);
                    continue block35;
                }
                case 173850704: {
                    v3 = v.qqi("scz", qss(int ), (int)298);
                    continue block35;
                }
            }
            break;
        }
        var2_2 /* !! */  = v.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("sda", qss(int ), (int)299)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == v.qqi("sdb", qqf(int ), (int)477)) break;
            v4 /* !! */  = (long)v.qqi("sdc", qqf(int ), (int)478);
        }
        var1_3 = v.a;
        if (var3_1) {
            throw null;
lbl43:
            // 5 sources

            return;
        }
        if (var1_3) ** GOTO lbl43
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl43
                v5 = v.qqi("sdd", qss(int ), (int)300);
                v6 /* !! */  = v.ax;
                if (true) ** GOTO lbl55
                block38: while (true) {
                    v6 /* !! */  = (long)(v7 - v.qqi("sde", qss(int ), (int)301));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -2121201296: {
                            break block38;
                        }
                        case -1717339217: {
                            v7 = v.qqi("sdf", qss(int ), (int)302);
                            continue block38;
                        }
                        case 1365065457: {
                            v7 = v.qqi("sdg", qss(int ), (int)303);
                            continue block38;
                        }
                        case 1458520149: {
                            v7 = v.qqi("sdh", qss(int ), (int)304);
                            continue block38;
                        }
                    }
                    break;
                }
                this.columnEnteredAt = (long)v5;
                if (var1_3 || var1_3) ** GOTO lbl43
                v8 /* !! */  = v.ax;
                if (true) ** GOTO lbl73
                block39: while (true) {
                    v8 /* !! */  = (long)(v.qqi("sdj", qss(int ), (int)306) - v.qqi("sdi", qss(int ), (int)305));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2121201296: {
                            break block39;
                        }
                        case 1071308970: {
                            continue block39;
                        }
                    }
                    break;
                }
                this.heldMarkerX = 0.0;
                if (var1_3 || var1_3) ** GOTO lbl43
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("sdk", qss(int ), (int)307)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == v.qqi("sdl", qqf(int ), (int)479)) break;
                    v9 /* !! */  = (long)v.qqi("sdm", qqf(int ), (int)480);
                }
                this.heldMarkerZ = 0.0;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl89:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)v.qqi("sdn", qqf(int ), (int)481);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 1: {
                var2_2 /* !! */  = (int)v.qqi("sdo", qqf(int ), (int)482);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)v.qqi("sdp", qqf(int ), (int)483);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)v.qqi("sdq", qqf(int ), (int)484);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 4: {
                var2_2 /* !! */  = (int)v.qqi("sdr", qqf(int ), (int)485);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl112:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)v.qqi("sds", qqf(int ), (int)486);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)v.qqi("sdt", qqf(int ), (int)487);
                    if (!var3_1) ** GOTO lbl89
                    throw null;
                }
            }
lbl122:
            // 2 sources

            case 7: {
                do {
                    var2_2 /* !! */  = (int)v.qqi("sdu", qqf(int ), (int)488);
                } while (!var3_1);
                throw null;
            }
lbl127:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)v.qqi("sdv", qqf(int ), (int)489);
                if (!var3_1) ** GOTO lbl112
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)v.qqi("sdw", qqf(int ), (int)490);
        ** while (!var3_1)
lbl134:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void sok() {
        v.qqg[500] = 1454939819;
        v.qqg[501] = -385827923;
        v.qqg[502] = 1149155138;
        v.qqg[503] = -117317496;
        v.qqg[504] = -772110609;
        v.qqg[505] = 271447217;
        v.qqg[506] = -493933329;
        v.qqg[507] = -646467370;
        v.qqg[508] = 1986607210;
        v.qqg[509] = 224362702;
        v.qqg[510] = 112382825;
        v.qqg[511] = 2130100081;
        v.qqg[512] = 1696295607;
        v.qqg[513] = 2090391221;
        v.qqg[514] = -1085391694;
        v.qqg[515] = -2023119644;
        v.qqg[516] = 190096101;
        v.qqg[517] = -1813707029;
        v.qqg[518] = 333235939;
        v.qqg[519] = 439770952;
        v.qqg[520] = -366606963;
        v.qqg[521] = -487286814;
        v.qqg[522] = 564951573;
        v.qqg[523] = 1477562346;
        v.qqg[524] = -1784925259;
        v.qqg[525] = -1656031269;
        v.qqg[526] = 1002069248;
        v.qqg[527] = -1818863430;
        v.qqg[528] = -1191485767;
        v.qqg[529] = -206133116;
        v.qqg[530] = -474638028;
        v.qqg[531] = -1832427176;
        v.qqg[532] = -1477832830;
        v.qqg[533] = -270693849;
        v.qqg[534] = -1681850595;
        v.qqg[535] = 1275314057;
        v.qqg[536] = -1115795709;
        v.qqg[537] = 1566107452;
        v.qqg[538] = 972013737;
        v.qqg[539] = -1467657729;
        v.qqg[540] = 958932328;
        v.qqg[541] = 359868594;
        v.qqg[542] = 955478924;
        v.qqg[543] = 1672233827;
        v.qqg[544] = 1504683413;
        v.qqg[545] = 659771789;
        v.qqg[546] = 2050929223;
        v.qqg[547] = 1966655804;
        v.qqg[548] = -2027161477;
        v.qqg[549] = -461329389;
        v.qqg[550] = -1639912203;
        v.qqg[551] = -310487212;
        v.qqg[552] = -2126767897;
        v.qqg[553] = -2090121873;
        v.qqg[554] = -459980621;
        v.qqg[555] = 1640468454;
        v.qqg[556] = -970900737;
        v.qqg[557] = 1699488504;
        v.qqg[558] = -381196500;
        v.qqg[559] = 483554079;
        v.qqg[560] = -52033215;
        v.qqg[561] = -730181675;
        v.qqg[562] = 1525617850;
        v.qqg[563] = 532714917;
        v.qqg[564] = -1351833264;
        v.qqg[565] = -1905240740;
        v.qqg[566] = 1091925614;
        v.qqg[567] = 486023318;
        v.qqg[568] = 2000749856;
        v.qqg[569] = 2100325028;
        v.qqg[570] = -155325650;
        v.qqg[571] = 1049902385;
        v.qqg[572] = 1904850177;
        v.qqg[573] = -1852225773;
        v.qqg[574] = 1228155964;
        v.qqg[575] = -2130305035;
        v.qqg[576] = -1627800589;
        v.qqg[577] = 1169760716;
        v.qqg[578] = -727418891;
        v.qqg[579] = 2047267013;
        v.qqg[580] = 301030267;
        v.qqg[581] = 404710531;
        v.qqg[582] = -436687105;
        v.qqg[583] = -387006160;
        v.qqg[584] = -497025826;
        v.qqg[585] = 1604449766;
        v.qqg[586] = 1069996814;
        v.qqg[587] = 482907125;
        v.qqg[588] = 1029599049;
        v.qqg[589] = 750209939;
        v.qqg[590] = -1958370048;
        v.qqg[591] = -1202318139;
        v.qqg[592] = -1754620017;
        v.qqg[593] = -1377800629;
        v.qqg[594] = 171877490;
        v.qqg[595] = 721749832;
        v.qqg[596] = 1685422108;
        v.qqg[597] = 1022414492;
        v.qqg[598] = 1002340576;
        v.qqg[599] = 1679498169;
    }

    private static /* synthetic */ void soj() {
        v.qqg[400] = 1359260733;
        v.qqg[401] = -1181499707;
        v.qqg[402] = 1553728762;
        v.qqg[403] = 687608293;
        v.qqg[404] = -288122725;
        v.qqg[405] = -256438126;
        v.qqg[406] = -564853027;
        v.qqg[407] = -1194100754;
        v.qqg[408] = 125970618;
        v.qqg[409] = 1350801537;
        v.qqg[410] = -214809820;
        v.qqg[411] = 717854377;
        v.qqg[412] = 692013811;
        v.qqg[413] = -1491368463;
        v.qqg[414] = 1731154729;
        v.qqg[415] = -1079765187;
        v.qqg[416] = -2007194739;
        v.qqg[417] = -1756845685;
        v.qqg[418] = 744379001;
        v.qqg[419] = 718281973;
        v.qqg[420] = -1970224519;
        v.qqg[421] = -1770972964;
        v.qqg[422] = -542620422;
        v.qqg[423] = -1357253499;
        v.qqg[424] = -1533834570;
        v.qqg[425] = 1197012809;
        v.qqg[426] = -305178350;
        v.qqg[427] = 0x30333603;
        v.qqg[428] = 285845770;
        v.qqg[429] = 351646810;
        v.qqg[430] = -1989642322;
        v.qqg[431] = 1818608898;
        v.qqg[432] = 90926076;
        v.qqg[433] = 1366419004;
        v.qqg[434] = 1556189;
        v.qqg[435] = -1242590092;
        v.qqg[436] = -1266786073;
        v.qqg[437] = -841905546;
        v.qqg[438] = -1744940425;
        v.qqg[439] = 96463509;
        v.qqg[440] = -1899454157;
        v.qqg[441] = 210952536;
        v.qqg[442] = 581356748;
        v.qqg[443] = -1236036523;
        v.qqg[444] = 902411820;
        v.qqg[445] = -678189222;
        v.qqg[446] = -1696886730;
        v.qqg[447] = -1156547606;
        v.qqg[448] = 59409703;
        v.qqg[449] = 1067204299;
        v.qqg[450] = 1106039520;
        v.qqg[451] = 831879604;
        v.qqg[452] = 716466854;
        v.qqg[453] = -664682362;
        v.qqg[454] = 1704979188;
        v.qqg[455] = -2012150161;
        v.qqg[456] = -2011632010;
        v.qqg[457] = 939461091;
        v.qqg[458] = 434580558;
        v.qqg[459] = -831907820;
        v.qqg[460] = -706585251;
        v.qqg[461] = 1614122292;
        v.qqg[462] = 747049491;
        v.qqg[463] = 300440916;
        v.qqg[464] = -1584281474;
        v.qqg[465] = -1623029826;
        v.qqg[466] = -1629544733;
        v.qqg[467] = 1328034696;
        v.qqg[468] = 1319750790;
        v.qqg[469] = -1169205414;
        v.qqg[470] = 475490322;
        v.qqg[471] = 1954537873;
        v.qqg[472] = 1275973333;
        v.qqg[473] = -1621958590;
        v.qqg[474] = 1135059665;
        v.qqg[475] = 828753389;
        v.qqg[476] = -1200145689;
        v.qqg[477] = 1547473539;
        v.qqg[478] = 1313229878;
        v.qqg[479] = 545016807;
        v.qqg[480] = 977034056;
        v.qqg[481] = -1089240704;
        v.qqg[482] = 1424759962;
        v.qqg[483] = -486329831;
        v.qqg[484] = -788260104;
        v.qqg[485] = -65132042;
        v.qqg[486] = -189767190;
        v.qqg[487] = 1114771786;
        v.qqg[488] = -2141536995;
        v.qqg[489] = -337021166;
        v.qqg[490] = -1374556484;
        v.qqg[491] = -993355029;
        v.qqg[492] = 1356801843;
        v.qqg[493] = -570130010;
        v.qqg[494] = 89380934;
        v.qqg[495] = -1355441173;
        v.qqg[496] = 1359991774;
        v.qqg[497] = 1102893084;
        v.qqg[498] = 1720661336;
        v.qqg[499] = 994064525;
    }

    private static /* synthetic */ int qqf(int n2) {
        return qqg[n2] ^ qqh[n2];
    }

    private static /* synthetic */ void sog() {
        v.qqg[100] = 2058614076;
        v.qqg[101] = 135412155;
        v.qqg[102] = 1013492809;
        v.qqg[103] = -152323796;
        v.qqg[104] = 1104941800;
        v.qqg[105] = -100256498;
        v.qqg[106] = 963812889;
        v.qqg[107] = 761227022;
        v.qqg[108] = 1310766296;
        v.qqg[109] = 859326262;
        v.qqg[110] = -838387532;
        v.qqg[111] = -1177230982;
        v.qqg[112] = 1990912560;
        v.qqg[113] = -1631091190;
        v.qqg[114] = 2015391492;
        v.qqg[115] = 978049106;
        v.qqg[116] = -1313111940;
        v.qqg[117] = 1998116742;
        v.qqg[118] = 1628726269;
        v.qqg[119] = -1420026508;
        v.qqg[120] = -466844246;
        v.qqg[121] = -1663894637;
        v.qqg[122] = 611036194;
        v.qqg[123] = 595446893;
        v.qqg[124] = -1786693896;
        v.qqg[125] = 715544652;
        v.qqg[126] = 486460211;
        v.qqg[127] = 1266328630;
        v.qqg[128] = 2000632316;
        v.qqg[129] = -760058352;
        v.qqg[130] = -258936200;
        v.qqg[131] = 151457423;
        v.qqg[132] = -360223410;
        v.qqg[133] = 1930761436;
        v.qqg[134] = 384525588;
        v.qqg[135] = 1130732279;
        v.qqg[136] = -1416384567;
        v.qqg[137] = 1498277040;
        v.qqg[138] = -1780610794;
        v.qqg[139] = -18877879;
        v.qqg[140] = -1692245974;
        v.qqg[141] = -1757291878;
        v.qqg[142] = 672713182;
        v.qqg[143] = 1105526614;
        v.qqg[144] = -1986162265;
        v.qqg[145] = -559490014;
        v.qqg[146] = -511046610;
        v.qqg[147] = 1198498362;
        v.qqg[148] = -855823283;
        v.qqg[149] = -1939516741;
        v.qqg[150] = 1259110057;
        v.qqg[151] = -1617652687;
        v.qqg[152] = -730885738;
        v.qqg[153] = 201212328;
        v.qqg[154] = 1811771151;
        v.qqg[155] = -915396321;
        v.qqg[156] = 1004598070;
        v.qqg[157] = 1637336673;
        v.qqg[158] = -1921796381;
        v.qqg[159] = -1251507346;
        v.qqg[160] = -1854701863;
        v.qqg[161] = 1733178396;
        v.qqg[162] = 2040596532;
        v.qqg[163] = 1243300844;
        v.qqg[164] = -1517870654;
        v.qqg[165] = -777939045;
        v.qqg[166] = -1620768153;
        v.qqg[167] = -750900489;
        v.qqg[168] = -2012552687;
        v.qqg[169] = 942776615;
        v.qqg[170] = -1128601813;
        v.qqg[171] = -433817013;
        v.qqg[172] = 1154732614;
        v.qqg[173] = -1916714064;
        v.qqg[174] = -1344590403;
        v.qqg[175] = 663059849;
        v.qqg[176] = -1662122835;
        v.qqg[177] = -1081629971;
        v.qqg[178] = 1811779210;
        v.qqg[179] = -641938423;
        v.qqg[180] = -1653622878;
        v.qqg[181] = -1158289030;
        v.qqg[182] = 876159825;
        v.qqg[183] = 1351669141;
        v.qqg[184] = -1435987737;
        v.qqg[185] = -124004181;
        v.qqg[186] = 1727118481;
        v.qqg[187] = 1255136872;
        v.qqg[188] = -1623738946;
        v.qqg[189] = 618791282;
        v.qqg[190] = 899189031;
        v.qqg[191] = 1199457195;
        v.qqg[192] = 1665835438;
        v.qqg[193] = -506177395;
        v.qqg[194] = -392185006;
        v.qqg[195] = 678894575;
        v.qqg[196] = 52213397;
        v.qqg[197] = 204176534;
        v.qqg[198] = -1415258854;
        v.qqg[199] = -775548180;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        v0 /* !! */  = v.ax;
        if (true) ** GOTO lbl5
        block78: while (true) {
            v0 /* !! */  = (long)(v1 - v.qqi("qwg", qss(int ), (int)8));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2121201296: {
                    break block78;
                }
                case -290122495: {
                    v1 = v.qqi("qwh", qss(int ), (int)9);
                    continue block78;
                }
                case 805938853: {
                    v1 = v.qqi("qwi", qss(int ), (int)10);
                    continue block78;
                }
                case 1952772479: {
                    v1 = v.qqi("qwj", qss(int ), (int)11);
                    continue block78;
                }
            }
            break;
        }
        var7_2 = v.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("qwk", qss(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == v.qqi("qwl", qqf(int ), (int)141)) break;
            v2 /* !! */  = (long)v.qqi("qwm", qqf(int ), (int)142);
        }
        var6_3 /* !! */  = v.b;
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("qwn", qss(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == v.qqi("qwo", qqf(int ), (int)143)) break;
                    v3 /* !! */  = (long)v.qqi("qwp", qqf(int ), (int)144);
                }
                var5_4 = v.a;
                if (var7_2) {
                    throw null;
lbl35:
                    // 13 sources

                    return;
                }
                if (var5_4 || var5_4) ** GOTO lbl35
                v4 /* !! */  = v.ax;
                if (true) ** GOTO lbl42
                block82: while (true) {
                    v4 /* !! */  = (long)(v.qqi("qwr", qss(int ), (int)15) - v.qqi("qwq", qss(int ), (int)14));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2121201296: {
                            break block82;
                        }
                        case -1997047429: {
                            continue block82;
                        }
                    }
                    break;
                }
                if (!this.clipping) ** GOTO lbl93
                if (var5_4) ** GOTO lbl35
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("qws", qss(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == v.qqi("qwt", qqf(int ), (int)145)) break;
                    v5 /* !! */  = (long)v.qqi("qwu", qqf(int ), (int)146);
                }
                v6 = var1_1.getType();
                v7 /* !! */  = v.ax;
                if (true) ** GOTO lbl59
                block84: while (true) {
                    v7 /* !! */  = (long)(v8 - v.qqi("qwv", qss(int ), (int)17));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2121201296: {
                            break block84;
                        }
                        case -327595225: {
                            v8 = v.qqi("qww", qss(int ), (int)18);
                            continue block84;
                        }
                        case 502782371: {
                            v8 = v.qqi("qwx", qss(int ), (int)19);
                            continue block84;
                        }
                    }
                    break;
                }
                if (v6 != cr$Type.RECEIVE) ** GOTO lbl93
                if (var5_4 || var5_4) ** GOTO lbl35
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = v.ax - v.qqi("qwy", qss(int ), (int)20)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == v.qqi("qwz", qqf(int ), (int)147)) break;
                    v9 /* !! */  = (long)v.qqi("qxa", qqf(int ), (int)148);
                }
                var3_5 = var1_1.getPacket();
                if (var5_4) ** GOTO lbl35
                if (!(var3_5 instanceof class_2708)) ** GOTO lbl93
                if (var5_4) ** GOTO lbl35
                var2_7 = (class_2708)var3_5;
                if (var5_4 || var5_4) ** GOTO lbl35
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = v.ax - v.qqi("qxb", qss(int ), (int)21)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == v.qqi("qxc", qqf(int ), (int)149)) break;
                    v10 /* !! */  = (long)v.qqi("qxd", qqf(int ), (int)150);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = v.ax - v.qqi("qxe", qss(int ), (int)22)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == v.qqi("qxf", qqf(int ), (int)151)) break;
                    v11 /* !! */  = (long)v.qqi("qxg", qqf(int ), (int)152);
                }
                if (v.mc.field_1724 != null) ** GOTO lbl95
                if (var5_4) ** GOTO lbl35
lbl93:
                // 4 sources

                if (var5_4 || var5_4) ** GOTO lbl35
                return;
lbl95:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl35
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = v.ax - v.qqi("qxh", qss(int ), (int)23)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == v.qqi("qxi", qqf(int ), (int)153)) break;
                    v12 /* !! */  = (long)v.qqi("qxj", qqf(int ), (int)154);
                }
                v13 = var2_7.comp_3228();
                v14 /* !! */  = v.ax;
                if (true) ** GOTO lbl106
                block89: while (true) {
                    v14 /* !! */  = (long)(v15 - v.qqi("qxk", qss(int ), (int)24));
lbl106:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2121201296: {
                            break block89;
                        }
                        case 1167865294: {
                            v15 = v.qqi("qxl", qss(int ), (int)25);
                            continue block89;
                        }
                        case 1936734403: {
                            v15 = v.qqi("qxm", qss(int ), (int)26);
                            continue block89;
                        }
                        case 1949154266: {
                            v15 = v.qqi("qxn", qss(int ), (int)27);
                            continue block89;
                        }
                    }
                    break;
                }
                v16 = v13.comp_3148();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_7 = v.ax - v.qqi("qxo", qss(int ), (int)28)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == v.qqi("qxp", qqf(int ), (int)155)) break;
                    v17 /* !! */  = (long)v.qqi("qxq", qqf(int ), (int)156);
                }
                var3_6 = v16.field_1351;
                if (var5_4 || var5_4) ** GOTO lbl35
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_8 = v.ax - v.qqi("qxr", qss(int ), (int)29)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == v.qqi("qxs", qqf(int ), (int)157)) break;
                    v18 /* !! */  = (long)v.qqi("qxt", qqf(int ), (int)158);
                }
                v19 = var2_7.comp_3229();
                v20 /* !! */  = v.ax;
                if (true) ** GOTO lbl136
                block92: while (true) {
                    v20 /* !! */  = (long)(v21 - v.qqi("qxu", qss(int ), (int)30));
lbl136:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -2121201296: {
                            break block92;
                        }
                        case -2095328017: {
                            v21 = v.qqi("qxv", qss(int ), (int)31);
                            continue block92;
                        }
                        case 1414838891: {
                            v21 = v.qqi("qxw", qss(int ), (int)32);
                            continue block92;
                        }
                    }
                    break;
                }
                v22 /* !! */  = v.ax;
                if (true) ** GOTO lbl149
                block93: while (true) {
                    v22 /* !! */  = (long)(v.qqi("qxy", qss(int ), (int)34) - v.qqi("qxx", qss(int ), (int)33));
lbl149:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -2121201296: {
                            break block93;
                        }
                        case -1692373700: {
                            continue block93;
                        }
                    }
                    break;
                }
                if (!v19.contains(class_2709.field_12398)) ** GOTO lbl198
                v23 /* !! */  = v.ax;
                if (true) ** GOTO lbl159
                block94: while (true) {
                    v23 /* !! */  = (long)(v24 - v.qqi("qxz", qss(int ), (int)35));
lbl159:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2121201296: {
                            break block94;
                        }
                        case -771920932: {
                            v24 = v.qqi("qya", qss(int ), (int)36);
                            continue block94;
                        }
                        case 1365977625: {
                            v24 = v.qqi("qyb", qss(int ), (int)37);
                            continue block94;
                        }
                    }
                    break;
                }
                v25 /* !! */  = v.ax;
                if (true) ** GOTO lbl172
                block95: while (true) {
                    v25 /* !! */  = (long)(v26 - v.qqi("qyc", qss(int ), (int)38));
lbl172:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -2121201296: {
                            break block95;
                        }
                        case -1498061898: {
                            v26 = v.qqi("qyd", qss(int ), (int)39);
                            continue block95;
                        }
                        case -245217714: {
                            v26 = v.qqi("qye", qss(int ), (int)40);
                            continue block95;
                        }
                        case 786830065: {
                            v26 = v.qqi("qyf", qss(int ), (int)41);
                            continue block95;
                        }
                    }
                    break;
                }
                v27 = v.mc.field_1724;
                v28 /* !! */  = v.ax;
                if (true) ** GOTO lbl189
                block96: while (true) {
                    v28 /* !! */  = (long)(v.qqi("qyh", qss(int ), (int)43) - v.qqi("qyg", qss(int ), (int)42));
lbl189:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -2121201296: {
                            break block96;
                        }
                        case 1662820085: {
                            continue block96;
                        }
                    }
                    break;
                }
                v29 = v27.method_23318() + var3_6;
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl199
lbl198:
                // 1 sources

                v29 = var3_6;
lbl199:
                // 2 sources

                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_9 = v.ax - v.qqi("qyi", qss(int ), (int)44)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == v.qqi("qyj", qqf(int ), (int)159)) break;
                    v30 /* !! */  = (long)v.qqi("qyk", qqf(int ), (int)160);
                }
                this.correctionY = v29;
                if (var5_4 || var5_4) ** GOTO lbl35
                v31 /* !! */  = v.ax;
                if (true) ** GOTO lbl210
                block98: while (true) {
                    v31 /* !! */  = (long)(v32 - v.qqi("qyl", qss(int ), (int)45));
lbl210:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -2121201296: {
                            break block98;
                        }
                        case -1590999943: {
                            v32 = v.qqi("qym", qss(int ), (int)46);
                            continue block98;
                        }
                        case 608093844: {
                            v32 = v.qqi("qyn", qss(int ), (int)47);
                            continue block98;
                        }
                        case 831661346: {
                            v32 = v.qqi("qyo", qss(int ), (int)48);
                            continue block98;
                        }
                    }
                    break;
                }
                v33 = System.currentTimeMillis();
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_10 = v.ax - v.qqi("qyp", qss(int ), (int)49)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == v.qqi("qyq", qqf(int ), (int)161)) break;
                    v34 /* !! */  = (long)v.qqi("qyr", qqf(int ), (int)162);
                }
                this.correctionAt = v33;
                if (var5_4 || var5_4) ** GOTO lbl35
                v35 = v.qqi("qys", qqf(int ), (int)163);
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_11 = v.ax - v.qqi("qyt", qss(int ), (int)50)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == v.qqi("qyu", qqf(int ), (int)164)) break;
                    v36 /* !! */  = (long)v.qqi("qyv", qqf(int ), (int)165);
                }
                this.corrected = v35;
                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var6_3 /* !! */  = (int)v.qqi("qyw", qqf(int ), (int)166);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl311
            }
lbl245:
            // 3 sources

            case 1: {
                var6_3 /* !! */  = (int)v.qqi("qyx", qqf(int ), (int)167);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl250:
            // 3 sources

            case 2: {
                var6_3 /* !! */  = (int)v.qqi("qyy", qqf(int ), (int)168);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
            case 3: {
                var6_3 /* !! */  = (int)v.qqi("qyz", qqf(int ), (int)169);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl260:
            // 2 sources

            case 4: {
                var6_3 /* !! */  = (int)v.qqi("qza", qqf(int ), (int)170);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl265:
            // 3 sources

            case 5: {
                var6_3 /* !! */  = (int)v.qqi("qzb", qqf(int ), (int)171);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl270:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)v.qqi("qzc", qqf(int ), (int)172);
                if (!var7_2) break;
                throw null;
            }
            case 7: {
                var6_3 /* !! */  = (int)v.qqi("qzd", qqf(int ), (int)173);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 8: {
                var6_3 /* !! */  = (int)v.qqi("qze", qqf(int ), (int)174);
                if (!var7_2) ** GOTO lbl245
                throw null;
            }
lbl283:
            // 2 sources

            case 9: {
                var6_3 /* !! */  = (int)v.qqi("qzf", qqf(int ), (int)175);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl344
            }
lbl288:
            // 2 sources

            case 10: {
                var6_3 /* !! */  = (int)v.qqi("qzg", qqf(int ), (int)176);
                if (!var7_2) ** GOTO lbl250
                throw null;
            }
lbl292:
            // 3 sources

            case 11: {
                var6_3 /* !! */  = (int)v.qqi("qzh", qqf(int ), (int)177);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl297:
            // 2 sources

            case 12: {
                var6_3 /* !! */  = (int)v.qqi("qzi", qqf(int ), (int)178);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
            case 13: {
                var6_3 /* !! */  = (int)v.qqi("qzj", qqf(int ), (int)179);
                if (!var7_2) break;
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)v.qqi("qzk", qqf(int ), (int)180);
                    if (!var7_2) ** GOTO lbl265
                    throw null;
                }
            }
lbl311:
            // 2 sources

            case 15: {
                var6_3 /* !! */  = (int)v.qqi("qzl", qqf(int ), (int)181);
                if (!var7_2) ** GOTO lbl250
                throw null;
            }
lbl315:
            // 2 sources

            case 16: {
                var6_3 /* !! */  = (int)v.qqi("qzm", qqf(int ), (int)182);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl320:
            // 2 sources

            case 17: {
                var6_3 /* !! */  = (int)v.qqi("qzn", qqf(int ), (int)183);
                if (!var7_2) ** GOTO lbl270
                throw null;
            }
            case 18: {
                var6_3 /* !! */  = (int)v.qqi("qzo", qqf(int ), (int)184);
                if (!var7_2) break;
                throw null;
            }
            case 19: {
                var6_3 /* !! */  = (int)v.qqi("qzp", qqf(int ), (int)185);
                if (!var7_2) ** GOTO lbl245
                throw null;
            }
lbl332:
            // 4 sources

            case 20: {
                var6_3 /* !! */  = (int)v.qqi("qzq", qqf(int ), (int)186);
                if (!var7_2) ** GOTO lbl260
                throw null;
            }
            case 21: {
                var6_3 /* !! */  = (int)v.qqi("qzr", qqf(int ), (int)187);
                if (!var7_2) ** GOTO lbl315
                throw null;
            }
lbl340:
            // 2 sources

            case 22: {
                var6_3 /* !! */  = (int)v.qqi("qzs", qqf(int ), (int)188);
                if (!var7_2) ** GOTO lbl320
                throw null;
            }
lbl344:
            // 2 sources

            case 23: {
                var6_3 /* !! */  = (int)v.qqi("qzt", qqf(int ), (int)189);
                if (!var7_2) ** GOTO lbl288
                throw null;
            }
            case 24: 
        }
        var6_3 /* !! */  = (int)v.qqi("qzu", qqf(int ), (int)190);
        ** while (!var7_2)
lbl351:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void sol() {
        v.qqg[600] = -1026538096;
        v.qqg[601] = -1985922310;
        v.qqg[602] = 787286910;
        v.qqg[603] = 1382808625;
        v.qqg[604] = 1160075629;
        v.qqg[605] = -1571348556;
        v.qqg[606] = -1159157950;
        v.qqg[607] = -965812691;
        v.qqg[608] = -1967795977;
        v.qqg[609] = 1451828997;
        v.qqg[610] = 972527006;
        v.qqg[611] = -177684678;
        v.qqg[612] = 1704813805;
        v.qqg[613] = -723381140;
        v.qqg[614] = 817219134;
        v.qqg[615] = 1318449800;
        v.qqg[616] = 428099923;
        v.qqg[617] = 240670047;
        v.qqg[618] = 619989406;
        v.qqg[619] = -374947778;
        v.qqg[620] = -1556725355;
        v.qqg[621] = -1994600221;
        v.qqg[622] = 1586030460;
        v.qqg[623] = 440086509;
        v.qqg[624] = -424933103;
        v.qqg[625] = 1973439621;
        v.qqg[626] = -16374614;
        v.qqg[627] = -834246781;
        v.qqg[628] = 737654997;
        v.qqg[629] = -2056689357;
        v.qqg[630] = 484193654;
        v.qqg[631] = -1712341361;
        v.qqg[632] = 485986139;
        v.qqg[633] = 944677915;
        v.qqg[634] = -1432881152;
        v.qqg[635] = 214293368;
        v.qqg[636] = -1910241654;
        v.qqg[637] = 251839823;
        v.qqg[638] = -1868057376;
        v.qqg[639] = 649435081;
        v.qqg[640] = 1288851571;
        v.qqg[641] = -867740358;
        v.qqg[642] = 2113399363;
        v.qqg[643] = -1342887511;
        v.qqg[644] = -608286843;
        v.qqg[645] = -202848199;
        v.qqg[646] = 2059525713;
        v.qqg[647] = 904005442;
        v.qqg[648] = -929627751;
        v.qqg[649] = -1919817703;
        v.qqg[650] = 760287431;
        v.qqg[651] = -691456866;
        v.qqg[652] = -133738769;
        v.qqg[653] = 1687691524;
        v.qqg[654] = 751191796;
        v.qqg[655] = -1375303641;
        v.qqg[656] = -2056306162;
        v.qqg[657] = 300265845;
        v.qqg[658] = -1382198376;
        v.qqg[659] = -124857063;
        v.qqg[660] = -1155877307;
        v.qqg[661] = 814903929;
        v.qqg[662] = 323739966;
        v.qqg[663] = 55582010;
        v.qqg[664] = -1401110366;
        v.qqg[665] = -1011092987;
        v.qqg[666] = 1686256475;
        v.qqg[667] = 662857210;
        v.qqg[668] = -964726124;
        v.qqg[669] = -1461057273;
        v.qqg[670] = -1220251818;
        v.qqg[671] = 1681744658;
        v.qqg[672] = -572411259;
        v.qqg[673] = 635341503;
        v.qqg[674] = 1725959241;
        v.qqg[675] = -632301230;
    }

    private static /* synthetic */ void sop() {
        v.qqh[300] = 622715722;
        v.qqh[301] = -1160389119;
        v.qqh[302] = -16362969;
        v.qqh[303] = 572574861;
        v.qqh[304] = -1721440098;
        v.qqh[305] = 742273436;
        v.qqh[306] = 713938268;
        v.qqh[307] = -1559331545;
        v.qqh[308] = 245753768;
        v.qqh[309] = -279772638;
        v.qqh[310] = 417727953;
        v.qqh[311] = 1819191861;
        v.qqh[312] = -945455404;
        v.qqh[313] = -2039886456;
        v.qqh[314] = -1291454947;
        v.qqh[315] = -1856824829;
        v.qqh[316] = 2138049168;
        v.qqh[317] = 524183742;
        v.qqh[318] = 3437498;
        v.qqh[319] = -1784701060;
        v.qqh[320] = -1117884210;
        v.qqh[321] = 1570178181;
        v.qqh[322] = 1811195293;
        v.qqh[323] = 443634744;
        v.qqh[324] = -1109359908;
        v.qqh[325] = 104464119;
        v.qqh[326] = 1242964211;
        v.qqh[327] = -658904616;
        v.qqh[328] = -136008177;
        v.qqh[329] = -2089334655;
        v.qqh[330] = -812868577;
        v.qqh[331] = 1015330338;
        v.qqh[332] = 1691361901;
        v.qqh[333] = 841492910;
        v.qqh[334] = -1839955993;
        v.qqh[335] = -637836865;
        v.qqh[336] = 1728644703;
        v.qqh[337] = 1995112137;
        v.qqh[338] = 413758361;
        v.qqh[339] = -434999470;
        v.qqh[340] = -1662058569;
        v.qqh[341] = -484128387;
        v.qqh[342] = 425009116;
        v.qqh[343] = -354494898;
        v.qqh[344] = 1837800970;
        v.qqh[345] = -349402421;
        v.qqh[346] = -99974289;
        v.qqh[347] = -1366837204;
        v.qqh[348] = -736464693;
        v.qqh[349] = -1220942476;
        v.qqh[350] = -359758079;
        v.qqh[351] = -1193971782;
        v.qqh[352] = -1466020785;
        v.qqh[353] = 755805471;
        v.qqh[354] = 2068624686;
        v.qqh[355] = 400635306;
        v.qqh[356] = -1236968537;
        v.qqh[357] = 1080515057;
        v.qqh[358] = 869760603;
        v.qqh[359] = -1210026615;
        v.qqh[360] = 855362136;
        v.qqh[361] = -699002381;
        v.qqh[362] = 282205336;
        v.qqh[363] = -635639378;
        v.qqh[364] = -189684043;
        v.qqh[365] = 76962578;
        v.qqh[366] = 1524038321;
        v.qqh[367] = 488367658;
        v.qqh[368] = -1168333015;
        v.qqh[369] = 291515979;
        v.qqh[370] = 689754413;
        v.qqh[371] = -1300315191;
        v.qqh[372] = 464126726;
        v.qqh[373] = 2146840113;
        v.qqh[374] = 1516767515;
        v.qqh[375] = 1377517470;
        v.qqh[376] = 2120970394;
        v.qqh[377] = 1758021514;
        v.qqh[378] = -1780352446;
        v.qqh[379] = 1944616269;
        v.qqh[380] = -1904062874;
        v.qqh[381] = -1113295390;
        v.qqh[382] = 1906402041;
        v.qqh[383] = 1362629990;
        v.qqh[384] = -173947554;
        v.qqh[385] = 188643699;
        v.qqh[386] = -2113469948;
        v.qqh[387] = 732348874;
        v.qqh[388] = -219986147;
        v.qqh[389] = 528735974;
        v.qqh[390] = 1249252582;
        v.qqh[391] = 2058762865;
        v.qqh[392] = 2119279968;
        v.qqh[393] = 1506948016;
        v.qqh[394] = -1681162638;
        v.qqh[395] = 430021223;
        v.qqh[396] = 2131247776;
        v.qqh[397] = 1554288918;
        v.qqh[398] = -486052956;
        v.qqh[399] = -106044469;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        block84: {
            block83: {
                block82: {
                    block81: {
                        var6_3 = v.c;
                        var5_4 /* !! */  = v.b;
                        var4_5 = v.a;
                        if (var6_3) {
                            throw null;
                        }
                        if (var4_5 || var4_5) return;
                        if (var2_2.length == v.qqi("qqq", qqf(int ), (int)7)) {
                            if (var4_5) return;
                            if (var2_2[0].equalsIgnoreCase("off")) {
                                if (var4_5 || var4_5) return;
                                this.clear();
                                if (var4_5 || var4_5) return;
                                this.logDirect(class_2561.method_43470((String)"TP-\u043c\u0430\u0440\u043a\u0435\u0440 \u043e\u0442\u043a\u043b\u044e\u0447\u0451\u043d.").method_27692(class_124.field_1080));
                                if (var4_5 || var4_5) return;
                                return;
                            }
                        }
                        if (var4_5 || var4_5) return;
                        if (var2_2.length != v.qqi("qqr", qqf(int ), (int)8)) break block81;
                        if (var4_5) return;
                        if (v.mc.field_1687 == null) break block81;
                        if (var4_5) return;
                        if (v.mc.field_1724 != null) break block82;
                        if (var4_5) return;
                    }
                    if (var4_5 || var4_5) return;
                    this.usage();
                    if (var4_5 || var4_5) return;
                    return;
                }
                if (var4_5 || var4_5) return;
                var3_6 = this.findPlayer(var2_2[0]);
                if (var4_5 || var4_5) return;
                if (var3_6 == null) break block83;
                if (var4_5) return;
                if (var3_6 != v.mc.field_1724) ** GOTO lbl47
                if (var4_5) return;
            }
            if (var4_5 || var4_5) return;
            this.logDirect(class_2561.method_43470((String)("\u0418\u0433\u0440\u043e\u043a \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0440\u044f\u0434\u043e\u043c: " + var2_2[0])).method_27692(class_124.field_1061));
            if (var4_5) return;
            if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
lbl42:
            // 2 sources

            block42: while (true) {
                switch (cfr_temp_0 == -2147483648 ? var5_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_5) return;
                        return;
                    }
lbl47:
                    // 1 sources

                    if (var4_5 || var4_5) return;
                    this.targetName = var3_6.method_7334().name();
                    if (var4_5 || var4_5) return;
                    this.resetClipState();
                    if (var4_5 || var4_5) return;
                    this.logDirect(class_2561.method_43470((String)"TP-\u043c\u0430\u0440\u043a\u0435\u0440 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d \u043d\u0430 ").method_27692(class_124.field_1080).method_10852((class_2561)class_2561.method_43470((String)this.targetName).method_27692(class_124.field_1068)));
                    if (!var4_5 && !var4_5) return;
                    return;
                    case 2: {
                        var5_4 /* !! */  = (int)v.qqi("qqu", qqf(int ), (int)11);
                        cfr_temp_0 = 7;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 3: {
                        var5_4 /* !! */  = (int)v.qqi("qqv", qqf(int ), (int)12);
                        cfr_temp_0 = 16;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 7: {
                        var5_4 /* !! */  = (int)v.qqi("qqz", qqf(int ), (int)16);
                        cfr_temp_0 = 17;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 8: {
                        var5_4 /* !! */  = (int)v.qqi("qra", qqf(int ), (int)17);
                        cfr_temp_0 = 10;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 9: {
                        var5_4 /* !! */  = (int)v.qqi("qrb", qqf(int ), (int)18);
                        cfr_temp_0 = 38;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 10: {
                        var5_4 /* !! */  = (int)v.qqi("qrc", qqf(int ), (int)19);
                        cfr_temp_0 = 23;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 11: {
                        var5_4 /* !! */  = (int)v.qqi("qrd", qqf(int ), (int)20);
                        cfr_temp_0 = 24;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 12: {
                        var5_4 /* !! */  = (int)v.qqi("qre", qqf(int ), (int)21);
                        cfr_temp_0 = 38;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 14: {
                        var5_4 /* !! */  = (int)v.qqi("qrg", qqf(int ), (int)23);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 5: {
                        var5_4 /* !! */  = (int)v.qqi("qqx", qqf(int ), (int)14);
                        cfr_temp_0 = 1;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 21: {
                        var5_4 /* !! */  = (int)v.qqi("qrn", qqf(int ), (int)30);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 15: {
                        ** GOTO lbl194
                    }
                    case 23: {
                        var5_4 /* !! */  = (int)v.qqi("qrp", qqf(int ), (int)32);
                        cfr_temp_0 = 17;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 24: {
                        var5_4 /* !! */  = (int)v.qqi("qrq", qqf(int ), (int)33);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 4: {
                        var5_4 /* !! */  = (int)v.qqi("qqw", qqf(int ), (int)13);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 20: {
                        var5_4 /* !! */  = (int)v.qqi("qrm", qqf(int ), (int)29);
                        cfr_temp_0 = 27;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 25: {
                        var5_4 /* !! */  = (int)v.qqi("qrr", qqf(int ), (int)34);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 22: {
                        var5_4 /* !! */  = (int)v.qqi("qro", qqf(int ), (int)31);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 0: {
                        var5_4 /* !! */  = (int)v.qqi("qqs", qqf(int ), (int)9);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 17: {
                        var5_4 /* !! */  = (int)v.qqi("qrj", qqf(int ), (int)26);
                        cfr_temp_0 = 38;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 27: {
                        var5_4 /* !! */  = (int)v.qqi("qrt", qqf(int ), (int)36);
                        cfr_temp_0 = 6;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 29: {
                        var5_4 /* !! */  = (int)v.qqi("qrv", qqf(int ), (int)38);
                        if (!var6_3) ** break;
                        throw null;
                    }
                    case 30: {
                        var5_4 /* !! */  = (int)v.qqi("qrw", qqf(int ), (int)39);
                        cfr_temp_0 = 28;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 31: {
                        var5_4 /* !! */  = (int)v.qqi("qrx", qqf(int ), (int)40);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 26: {
                        var5_4 /* !! */  = (int)v.qqi("qrs", qqf(int ), (int)35);
                        cfr_temp_0 = 1;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 35: {
                        var5_4 /* !! */  = (int)v.qqi("qsb", qqf(int ), (int)44);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 28: {
                        var5_4 /* !! */  = (int)v.qqi("qru", qqf(int ), (int)37);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 1: {
                        var5_4 /* !! */  = (int)v.qqi("qqt", qqf(int ), (int)10);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 34: {
                        var5_4 /* !! */  = (int)v.qqi("qsa", qqf(int ), (int)43);
                        cfr_temp_0 = 32;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 38: {
                        var5_4 /* !! */  = (int)v.qqi("qse", qqf(int ), (int)47);
                        cfr_temp_0 = 16;
                        if (!var6_3) continue block42;
                        throw null;
                    }
                    case 39: {
                        var5_4 /* !! */  = (int)v.qqi("qsf", qqf(int ), (int)48);
                        if (var6_3) {
                            throw null;
                        }
lbl194:
                        // 3 sources

                        var5_4 /* !! */  = (int)v.qqi("qrh", qqf(int ), (int)24);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 32: {
                        var5_4 /* !! */  = (int)v.qqi("qry", qqf(int ), (int)41);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 16: {
                        var5_4 /* !! */  = (int)v.qqi("qri", qqf(int ), (int)25);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 33: {
                        var5_4 /* !! */  = (int)v.qqi("qrz", qqf(int ), (int)42);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 6: {
                        var5_4 /* !! */  = (int)v.qqi("qqy", qqf(int ), (int)15);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 19: {
                        var5_4 /* !! */  = (int)v.qqi("qrl", qqf(int ), (int)28);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 37: {
                        var5_4 /* !! */  = (int)v.qqi("qsd", qqf(int ), (int)46);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 18: {
                        var5_4 /* !! */  = (int)v.qqi("qrk", qqf(int ), (int)27);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 13: {
                        var5_4 /* !! */  = (int)v.qqi("qrf", qqf(int ), (int)22);
                        if (var6_3) {
                            throw null;
                        }
                    }
                    case 36: 
                }
                break;
            }
            break block84;
            ** while (true)
        }
        do {
            var5_4 /* !! */  = (int)v.qqi("qsc", qqf(int ), (int)45);
        } while (!var6_3);
        throw null;
    }

    private static /* synthetic */ void soo() {
        v.qqh[200] = -1524480487;
        v.qqh[201] = -816750674;
        v.qqh[202] = -1066762600;
        v.qqh[203] = -1372187168;
        v.qqh[204] = 534137781;
        v.qqh[205] = -1575029308;
        v.qqh[206] = 1743852600;
        v.qqh[207] = -958895056;
        v.qqh[208] = 238160870;
        v.qqh[209] = -92412102;
        v.qqh[210] = -1188249816;
        v.qqh[211] = -184788561;
        v.qqh[212] = -1252319148;
        v.qqh[213] = -1162295046;
        v.qqh[214] = 936217861;
        v.qqh[215] = 935824741;
        v.qqh[216] = 2126428516;
        v.qqh[217] = -1697369381;
        v.qqh[218] = 360437851;
        v.qqh[219] = 438319250;
        v.qqh[220] = 1562051314;
        v.qqh[221] = -1946658746;
        v.qqh[222] = 1411489405;
        v.qqh[223] = 645075441;
        v.qqh[224] = -110256067;
        v.qqh[225] = -95877348;
        v.qqh[226] = -1877811560;
        v.qqh[227] = 1035979073;
        v.qqh[228] = -390499550;
        v.qqh[229] = 888844032;
        v.qqh[230] = 201663117;
        v.qqh[231] = 587485565;
        v.qqh[232] = 1931931528;
        v.qqh[233] = 1304908582;
        v.qqh[234] = 1327121224;
        v.qqh[235] = -1103624965;
        v.qqh[236] = -1482750877;
        v.qqh[237] = -1599950192;
        v.qqh[238] = -2093381785;
        v.qqh[239] = -1971767412;
        v.qqh[240] = 639041102;
        v.qqh[241] = 2146747529;
        v.qqh[242] = -1251996672;
        v.qqh[243] = 339360076;
        v.qqh[244] = 1220761099;
        v.qqh[245] = -2015798704;
        v.qqh[246] = -1081496988;
        v.qqh[247] = 1125114007;
        v.qqh[248] = 357836525;
        v.qqh[249] = 110428837;
        v.qqh[250] = -1029491799;
        v.qqh[251] = 1322810869;
        v.qqh[252] = -2122369400;
        v.qqh[253] = -989842342;
        v.qqh[254] = -1212938733;
        v.qqh[255] = 1607080903;
        v.qqh[256] = 866193918;
        v.qqh[257] = 641170970;
        v.qqh[258] = -109091599;
        v.qqh[259] = 2017320176;
        v.qqh[260] = 1547668540;
        v.qqh[261] = 1572851547;
        v.qqh[262] = 1075063001;
        v.qqh[263] = 617545164;
        v.qqh[264] = 1144029893;
        v.qqh[265] = 1060115784;
        v.qqh[266] = 1662752475;
        v.qqh[267] = -753135045;
        v.qqh[268] = -411281007;
        v.qqh[269] = 1794712405;
        v.qqh[270] = -2014564745;
        v.qqh[271] = 136355399;
        v.qqh[272] = 1446151153;
        v.qqh[273] = 939034668;
        v.qqh[274] = -1442210915;
        v.qqh[275] = 1997046660;
        v.qqh[276] = -309018956;
        v.qqh[277] = -1086352505;
        v.qqh[278] = 392183029;
        v.qqh[279] = -1873732678;
        v.qqh[280] = 77446907;
        v.qqh[281] = 845346766;
        v.qqh[282] = 1499347637;
        v.qqh[283] = -2085064511;
        v.qqh[284] = -2113206166;
        v.qqh[285] = 356943577;
        v.qqh[286] = 1721913175;
        v.qqh[287] = 408910825;
        v.qqh[288] = -1474021445;
        v.qqh[289] = -956142173;
        v.qqh[290] = 364705148;
        v.qqh[291] = 293930343;
        v.qqh[292] = 1522104805;
        v.qqh[293] = -1050256034;
        v.qqh[294] = 1091068564;
        v.qqh[295] = -1627324361;
        v.qqh[296] = 1451753;
        v.qqh[297] = -1293555475;
        v.qqh[298] = -5459850;
        v.qqh[299] = -1704558666;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(cy var1_1) {
        block165: {
            block164: {
                var14_2 = v.c;
                var13_3 /* !! */  = v.b;
                var12_4 = v.a;
                if (var14_2) {
                    throw null;
lbl6:
                    // 46 sources

                    return;
                }
                if (var12_4 || var12_4) ** GOTO lbl6
                if (this.targetName == null) break block164;
                if (var12_4) ** GOTO lbl6
                if (v.mc.field_1724 == null) break block164;
                if (var12_4) ** GOTO lbl6
                if (v.mc.field_1687 != null) break block165;
                if (var12_4) ** GOTO lbl6
            }
            if (var12_4 || var12_4) ** GOTO lbl6
            return;
        }
        if (var12_4 || var12_4) ** GOTO lbl6
        if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var2_5 = System.currentTimeMillis();
                if (var12_4 || var12_4) ** GOTO lbl6
                if (!this.clipping) ** GOTO lbl32
                if (var12_4 || var12_4) ** GOTO lbl6
                v.dragonFlyMovementOverride = v.qqi("qsg", qqf(int ), (int)49);
                if (var12_4 || var12_4) ** GOTO lbl6
                this.updateClip(var2_5);
                if (var12_4 || var12_4) ** GOTO lbl6
                return;
lbl32:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                var4_6 = this.findPlayer(this.targetName);
                if (var12_4 || var12_4) ** GOTO lbl6
                if (var4_6 == null) ** GOTO lbl39
                if (var12_4) ** GOTO lbl6
                if (var4_6 != v.mc.field_1724) ** GOTO lbl43
                if (var12_4) ** GOTO lbl6
lbl39:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v.dragonFlyMovementOverride = v.qqi("qsh", qqf(int ), (int)50);
                if (var12_4 || var12_4) ** GOTO lbl6
                return;
lbl43:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                var5_7 = Math.floor(var4_6.method_23317()) + v.qqi("qsl", qsi(int ), (int)0);
                if (var12_4 || var12_4) ** GOTO lbl6
                var7_8 = Math.floor(var4_6.method_23321()) + v.qqi("qsm", qsi(int ), (int)1);
                if (var12_4 || var12_4) ** GOTO lbl6
                if (!(Math.abs(v.mc.field_1724.method_23317() - var5_7) <= v.qqi("qsn", qsi(int ), (int)2))) ** GOTO lbl56
                if (var12_4) ** GOTO lbl6
                if (!(Math.abs(v.mc.field_1724.method_23321() - var7_8) <= v.qqi("qso", qsi(int ), (int)3))) ** GOTO lbl56
                if (var12_4) ** GOTO lbl6
                v0 = v.qqi("qsp", qqf(int ), (int)51);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl58
lbl56:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v0 = var9_9 = v.qqi("qsq", qqf(int ), (int)52);
lbl58:
                // 2 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var9_9 != false) ** GOTO lbl66
                if (var12_4 || var12_4) ** GOTO lbl6
                this.resetColumnHold();
                if (var12_4 || var12_4) ** GOTO lbl6
                this.navigateToMarker(var5_7, var7_8);
                if (var12_4 || var12_4) ** GOTO lbl6
                return;
lbl66:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                v.dragonFlyMovementOverride = v.qqi("qsr", qqf(int ), (int)53);
                if (var12_4 || var12_4) ** GOTO lbl6
                this.stopNavigation();
                if (var12_4 || var12_4) ** GOTO lbl6
                v.mc.field_1724.method_18800(0.0, v.mc.field_1724.method_18798().field_1351, 0.0);
                if (var12_4 || var12_4) ** GOTO lbl6
                if (this.columnEnteredAt == v.qqi("qst", qss(int ), (int)4)) ** GOTO lbl79
                if (var12_4) ** GOTO lbl6
                if (Math.abs(var5_7 - this.heldMarkerX) > v.qqi("qsu", qsi(int ), (int)5)) ** GOTO lbl79
                if (var12_4) ** GOTO lbl6
                if (!(Math.abs(var7_8 - this.heldMarkerZ) > v.qqi("qsv", qsi(int ), (int)6))) ** GOTO lbl87
                if (var12_4) ** GOTO lbl6
lbl79:
                // 3 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                this.columnEnteredAt = var2_5;
                if (var12_4 || var12_4) ** GOTO lbl6
                this.heldMarkerX = var5_7;
                if (var12_4 || var12_4) ** GOTO lbl6
                this.heldMarkerZ = var7_8;
                if (var12_4 || var12_4) ** GOTO lbl6
                return;
lbl87:
                // 1 sources

                if (var12_4 || var12_4) ** GOTO lbl6
                if (var2_5 - this.columnEnteredAt < v.qqi("qsw", qss(int ), (int)7)) ** GOTO lbl102
                if (var12_4 || var12_4) ** GOTO lbl6
                var10_10 = Math.rint(var4_6.method_23318() - v.mc.field_1724.method_23318());
                if (var12_4 || var12_4) ** GOTO lbl6
                this.targetY = v.mc.field_1724.method_23318() + var10_10;
                if (var12_4 || var12_4) ** GOTO lbl6
                this.clipping = v.qqi("qsx", qqf(int ), (int)54);
                if (var12_4 || var12_4) ** GOTO lbl6
                this.stopNavigation();
                if (var12_4 || var12_4) ** GOTO lbl6
                this.resetColumnHold();
                if (var12_4 || var12_4) ** GOTO lbl6
                this.sendClipAttempt(var2_5);
                if (var12_4) ** GOTO lbl6
lbl102:
                // 2 sources

                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return;
            }
lbl105:
            // 2 sources

            case 0: {
                var13_3 /* !! */  = (int)v.qqi("qsy", qqf(int ), (int)55);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
            case 1: {
                var13_3 /* !! */  = (int)v.qqi("qsz", qqf(int ), (int)56);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl385
            }
            case 2: {
                var13_3 /* !! */  = (int)v.qqi("qta", qqf(int ), (int)57);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl120:
            // 3 sources

            case 3: {
                var13_3 /* !! */  = (int)v.qqi("qtb", qqf(int ), (int)58);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 4: {
                var13_3 /* !! */  = (int)v.qqi("qtc", qqf(int ), (int)59);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 5: {
                var13_3 /* !! */  = (int)v.qqi("qtd", qqf(int ), (int)60);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl135:
            // 2 sources

            case 6: {
                var13_3 /* !! */  = (int)v.qqi("qte", qqf(int ), (int)61);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl354
            }
lbl140:
            // 2 sources

            case 7: {
                var13_3 /* !! */  = (int)v.qqi("qtf", qqf(int ), (int)62);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl145:
            // 3 sources

            case 8: {
                var13_3 /* !! */  = (int)v.qqi("qtg", qqf(int ), (int)63);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl150:
            // 2 sources

            case 9: {
                var13_3 /* !! */  = (int)v.qqi("qth", qqf(int ), (int)64);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 10: {
                do {
                    var13_3 /* !! */  = (int)v.qqi("qti", qqf(int ), (int)65);
                } while (!var14_2);
                throw null;
            }
lbl160:
            // 3 sources

            case 11: {
                var13_3 /* !! */  = (int)v.qqi("qtj", qqf(int ), (int)66);
                if (!var14_2) break;
                throw null;
            }
lbl164:
            // 2 sources

            case 12: {
                var13_3 /* !! */  = (int)v.qqi("qtk", qqf(int ), (int)67);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl169:
            // 2 sources

            case 13: {
                var13_3 /* !! */  = (int)v.qqi("qtl", qqf(int ), (int)68);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl179
            }
lbl174:
            // 2 sources

            case 14: {
                var13_3 /* !! */  = (int)v.qqi("qtm", qqf(int ), (int)69);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl376
            }
lbl179:
            // 2 sources

            case 15: {
                do {
                    var13_3 /* !! */  = (int)v.qqi("qtn", qqf(int ), (int)70);
                } while (!var14_2);
                throw null;
            }
            case 16: {
                var13_3 /* !! */  = (int)v.qqi("qto", qqf(int ), (int)71);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl410
            }
lbl189:
            // 2 sources

            case 17: {
                var13_3 /* !! */  = (int)v.qqi("qtp", qqf(int ), (int)72);
                if (!var14_2) ** GOTO lbl169
                throw null;
            }
            case 18: {
                var13_3 /* !! */  = (int)v.qqi("qtq", qqf(int ), (int)73);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl198:
            // 3 sources

            case 19: {
                var13_3 /* !! */  = (int)v.qqi("qtr", qqf(int ), (int)74);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl419
            }
            case 20: {
                var13_3 /* !! */  = (int)v.qqi("qts", qqf(int ), (int)75);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl486
            }
            case 21: {
                var13_3 /* !! */  = (int)v.qqi("qtt", qqf(int ), (int)76);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 22: {
                var13_3 /* !! */  = (int)v.qqi("qtu", qqf(int ), (int)77);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl218:
            // 2 sources

            case 23: {
                var13_3 /* !! */  = (int)v.qqi("qtv", qqf(int ), (int)78);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl223:
            // 3 sources

            case 24: {
                var13_3 /* !! */  = (int)v.qqi("qtw", qqf(int ), (int)79);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl228:
            // 2 sources

            case 25: {
                var13_3 /* !! */  = (int)v.qqi("qtx", qqf(int ), (int)80);
                if (!var14_2) ** GOTO lbl164
                throw null;
            }
lbl232:
            // 3 sources

            case 26: {
                var13_3 /* !! */  = (int)v.qqi("qty", qqf(int ), (int)81);
                if (!var14_2) ** GOTO lbl135
                throw null;
            }
lbl236:
            // 4 sources

            case 27: {
                var13_3 /* !! */  = (int)v.qqi("qtz", qqf(int ), (int)82);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl241:
            // 2 sources

            case 28: {
                var13_3 /* !! */  = (int)v.qqi("qua", qqf(int ), (int)83);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl410
            }
            case 29: {
                var13_3 /* !! */  = (int)v.qqi("qub", qqf(int ), (int)84);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl478
            }
lbl251:
            // 2 sources

            case 30: {
                var13_3 /* !! */  = (int)v.qqi("quc", qqf(int ), (int)85);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl256:
            // 3 sources

            case 31: {
                var13_3 /* !! */  = (int)v.qqi("qud", qqf(int ), (int)86);
                if (!var14_2) ** GOTO lbl218
                throw null;
            }
lbl260:
            // 3 sources

            case 32: {
                var13_3 /* !! */  = (int)v.qqi("que", qqf(int ), (int)87);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl265:
            // 3 sources

            case 33: {
                var13_3 /* !! */  = (int)v.qqi("quf", qqf(int ), (int)88);
                if (!var14_2) ** GOTO lbl256
                throw null;
            }
            case 34: {
                var13_3 /* !! */  = (int)v.qqi("qug", qqf(int ), (int)89);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl435
            }
            case 35: {
                var13_3 /* !! */  = (int)v.qqi("quh", qqf(int ), (int)90);
                if (!var14_2) ** GOTO lbl145
                throw null;
            }
lbl278:
            // 3 sources

            case 36: {
                var13_3 /* !! */  = (int)v.qqi("qui", qqf(int ), (int)91);
                if (!var14_2) ** GOTO lbl256
                throw null;
            }
lbl282:
            // 4 sources

            case 37: {
                var13_3 /* !! */  = (int)v.qqi("quj", qqf(int ), (int)92);
                if (!var14_2) ** GOTO lbl260
                throw null;
            }
            case 38: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_3 /* !! */  = (int)v.qqi("quk", qqf(int ), (int)93);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl385
                    break;
                }
            }
            case 39: {
                var13_3 /* !! */  = (int)v.qqi("qul", qqf(int ), (int)94);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl431
            }
lbl297:
            // 2 sources

            case 40: {
                var13_3 /* !! */  = (int)v.qqi("qum", qqf(int ), (int)95);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl478
            }
            case 41: {
                var13_3 /* !! */  = (int)v.qqi("qun", qqf(int ), (int)96);
                if (!var14_2) ** GOTO lbl265
                throw null;
            }
lbl306:
            // 3 sources

            case 42: {
                var13_3 /* !! */  = (int)v.qqi("quo", qqf(int ), (int)97);
                if (!var14_2) ** GOTO lbl140
                throw null;
            }
lbl310:
            // 3 sources

            case 43: {
                var13_3 /* !! */  = (int)v.qqi("qup", qqf(int ), (int)98);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl427
            }
lbl315:
            // 3 sources

            case 44: {
                var13_3 /* !! */  = (int)v.qqi("quq", qqf(int ), (int)99);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl410
            }
lbl320:
            // 3 sources

            case 45: {
                var13_3 /* !! */  = (int)v.qqi("qur", qqf(int ), (int)100);
                if (!var14_2) ** GOTO lbl232
                throw null;
            }
            case 46: {
                var13_3 /* !! */  = (int)v.qqi("qus", qqf(int ), (int)101);
                if (!var14_2) break;
                throw null;
            }
            case 47: {
                var13_3 /* !! */  = (int)v.qqi("qut", qqf(int ), (int)102);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl435
            }
            case 48: {
                var13_3 /* !! */  = (int)v.qqi("quu", qqf(int ), (int)103);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl338:
            // 2 sources

            case 49: {
                var13_3 /* !! */  = (int)v.qqi("quv", qqf(int ), (int)104);
                if (!var14_2) ** GOTO lbl260
                throw null;
            }
            case 50: {
                var13_3 /* !! */  = (int)v.qqi("quw", qqf(int ), (int)105);
                if (!var14_2) ** GOTO lbl251
                throw null;
            }
            case 51: {
                var13_3 /* !! */  = (int)v.qqi("qux", qqf(int ), (int)106);
                if (!var14_2) ** GOTO lbl236
                throw null;
            }
            case 52: {
                var13_3 /* !! */  = (int)v.qqi("quy", qqf(int ), (int)107);
                if (!var14_2) ** GOTO lbl145
                throw null;
            }
lbl354:
            // 2 sources

            case 53: {
                var13_3 /* !! */  = (int)v.qqi("quz", qqf(int ), (int)108);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl486
            }
            case 54: {
                var13_3 /* !! */  = (int)v.qqi("qva", qqf(int ), (int)109);
                if (!var14_2) ** GOTO lbl236
                throw null;
            }
lbl363:
            // 2 sources

            case 55: {
                var13_3 /* !! */  = (int)v.qqi("qvb", qqf(int ), (int)110);
                if (!var14_2) ** GOTO lbl282
                throw null;
            }
            case 56: {
                var13_3 /* !! */  = (int)v.qqi("qvc", qqf(int ), (int)111);
                if (!var14_2) ** GOTO lbl120
                throw null;
            }
            case 57: {
                var13_3 /* !! */  = (int)v.qqi("qvd", qqf(int ), (int)112);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl474
            }
lbl376:
            // 2 sources

            case 58: {
                var13_3 /* !! */  = (int)v.qqi("qve", qqf(int ), (int)113);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl410
            }
            case 59: {
                var13_3 /* !! */  = (int)v.qqi("qvf", qqf(int ), (int)114);
                if (!var14_2) ** GOTO lbl282
                throw null;
            }
lbl385:
            // 3 sources

            case 60: {
                var13_3 /* !! */  = (int)v.qqi("qvg", qqf(int ), (int)115);
                if (!var14_2) ** GOTO lbl241
                throw null;
            }
lbl389:
            // 3 sources

            case 61: {
                var13_3 /* !! */  = (int)v.qqi("qvh", qqf(int ), (int)116);
                if (!var14_2) ** GOTO lbl120
                throw null;
            }
lbl393:
            // 2 sources

            case 62: {
                var13_3 /* !! */  = (int)v.qqi("qvi", qqf(int ), (int)117);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl419
            }
            case 63: {
                var13_3 /* !! */  = (int)v.qqi("qvj", qqf(int ), (int)118);
                if (!var14_2) ** GOTO lbl236
                throw null;
            }
            case 64: {
                var13_3 /* !! */  = (int)v.qqi("qvk", qqf(int ), (int)119);
                if (!var14_2) ** GOTO lbl174
                throw null;
            }
            case 65: {
                var13_3 /* !! */  = (int)v.qqi("qvl", qqf(int ), (int)120);
                if (!var14_2) ** GOTO lbl198
                throw null;
            }
lbl410:
            // 6 sources

            case 66: {
                var13_3 /* !! */  = (int)v.qqi("qvm", qqf(int ), (int)121);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl482
            }
lbl415:
            // 2 sources

            case 67: {
                var13_3 /* !! */  = (int)v.qqi("qvn", qqf(int ), (int)122);
                if (!var14_2) ** GOTO lbl232
                throw null;
            }
lbl419:
            // 4 sources

            case 68: {
                var13_3 /* !! */  = (int)v.qqi("qvo", qqf(int ), (int)123);
                if (!var14_2) ** GOTO lbl160
                throw null;
            }
            case 69: {
                var13_3 /* !! */  = (int)v.qqi("qvp", qqf(int ), (int)124);
                if (!var14_2) ** GOTO lbl389
                throw null;
            }
lbl427:
            // 2 sources

            case 70: {
                var13_3 /* !! */  = (int)v.qqi("qvq", qqf(int ), (int)125);
                if (!var14_2) ** GOTO lbl310
                throw null;
            }
lbl431:
            // 2 sources

            case 71: {
                var13_3 /* !! */  = (int)v.qqi("qvr", qqf(int ), (int)126);
                if (!var14_2) ** GOTO lbl389
                throw null;
            }
lbl435:
            // 3 sources

            case 72: {
                var13_3 /* !! */  = (int)v.qqi("qvs", qqf(int ), (int)127);
                if (var14_2) {
                    throw null;
                }
            }
            case 73: {
                var13_3 /* !! */  = (int)v.qqi("qvt", qqf(int ), (int)128);
                if (!var14_2) ** GOTO lbl415
                throw null;
            }
lbl443:
            // 2 sources

            case 74: {
                var13_3 /* !! */  = (int)v.qqi("qvu", qqf(int ), (int)129);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl474
            }
            case 75: {
                var13_3 /* !! */  = (int)v.qqi("qvv", qqf(int ), (int)130);
                if (!var14_2) ** GOTO lbl310
                throw null;
            }
            case 76: {
                var13_3 /* !! */  = (int)v.qqi("qvw", qqf(int ), (int)131);
                if (!var14_2) ** GOTO lbl228
                throw null;
            }
            case 77: {
                var13_3 /* !! */  = (int)v.qqi("qvx", qqf(int ), (int)132);
                if (!var14_2) ** GOTO lbl410
                throw null;
            }
            case 78: {
                var13_3 /* !! */  = (int)v.qqi("qvy", qqf(int ), (int)133);
                if (!var14_2) ** GOTO lbl306
                throw null;
            }
            case 79: {
                var13_3 /* !! */  = (int)v.qqi("qvz", qqf(int ), (int)134);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl486
            }
            case 80: {
                var13_3 /* !! */  = (int)v.qqi("qwa", qqf(int ), (int)135);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl486
            }
lbl474:
            // 3 sources

            case 81: {
                var13_3 /* !! */  = (int)v.qqi("qwb", qqf(int ), (int)136);
                if (!var14_2) ** GOTO lbl297
                throw null;
            }
lbl478:
            // 3 sources

            case 82: {
                var13_3 /* !! */  = (int)v.qqi("qwc", qqf(int ), (int)137);
                if (!var14_2) ** GOTO lbl105
                throw null;
            }
lbl482:
            // 2 sources

            case 83: {
                var13_3 /* !! */  = (int)v.qqi("qwd", qqf(int ), (int)138);
                if (!var14_2) ** GOTO lbl150
                throw null;
            }
lbl486:
            // 5 sources

            case 84: {
                var13_3 /* !! */  = (int)v.qqi("qwe", qqf(int ), (int)139);
                if (!var14_2) ** GOTO lbl306
                throw null;
            }
            case 85: 
        }
        var13_3 /* !! */  = (int)v.qqi("qwf", qqf(int ), (int)140);
        ** while (!var14_2)
lbl493:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateClip(long var1_1) {
        block111: {
            block113: {
                block112: {
                    while (true) {
                        if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("rlc", qss(int ), (int)170)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v0 /* !! */  == v.qqi("rld", qqf(int ), (int)353)) break;
                        v0 /* !! */  = (long)v.qqi("rle", qqf(int ), (int)354);
                    }
                    var5_2 = v.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("rlf", qss(int ), (int)171)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == v.qqi("rlg", qqf(int ), (int)355)) break;
                        v1 /* !! */  = (long)v.qqi("rlh", qqf(int ), (int)356);
                    }
                    var4_3 /* !! */  = v.b;
                    v2 /* !! */  = v.ax;
                    if (true) ** GOTO lbl17
                    block70: while (true) {
                        v2 /* !! */  = (long)(v3 - v.qqi("rli", qss(int ), (int)172));
lbl17:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -2121201296: {
                                break block70;
                            }
                            case -1956904762: {
                                v3 = v.qqi("rlj", qss(int ), (int)173);
                                continue block70;
                            }
                            case 4975118: {
                                v3 = v.qqi("rlk", qss(int ), (int)174);
                                continue block70;
                            }
                            case 1798836518: {
                                v3 = v.qqi("rll", qss(int ), (int)175);
                                continue block70;
                            }
                        }
                        break;
                    }
                    var3_4 = v.a;
                    if (var5_2) {
                        throw null;
lbl32:
                        // 13 sources

                        return;
                    }
                    if (var3_4 || var3_4) ** GOTO lbl32
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("rlm", qss(int ), (int)176)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == v.qqi("rln", qqf(int ), (int)357)) break;
                        v4 /* !! */  = (long)v.qqi("rlo", qqf(int ), (int)358);
                    }
                    if (!this.corrected) break block111;
                    if (var3_4 || var3_4) ** GOTO lbl32
                    v5 /* !! */  = v.ax;
                    if (true) ** GOTO lbl46
                    block73: while (true) {
                        v5 /* !! */  = (long)(v6 - v.qqi("rlp", qss(int ), (int)177));
lbl46:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -2121201296: {
                                break block73;
                            }
                            case -1564823894: {
                                v6 = v.qqi("rlq", qss(int ), (int)178);
                                continue block73;
                            }
                            case -24804089: {
                                v6 = v.qqi("rlr", qss(int ), (int)179);
                                continue block73;
                            }
                            case 996112596: {
                                v6 = v.qqi("rls", qss(int ), (int)180);
                                continue block73;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_3 = v.ax - v.qqi("rlt", qss(int ), (int)181)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == v.qqi("rlu", qqf(int ), (int)359)) break;
                        v7 /* !! */  = (long)v.qqi("rlv", qqf(int ), (int)360);
                    }
                    v8 /* !! */  = v.ax;
                    if (true) ** GOTO lbl67
                    block75: while (true) {
                        v8 /* !! */  = (long)(v.qqi("rlx", qss(int ), (int)183) - v.qqi("rlw", qss(int ), (int)182));
lbl67:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -2121201296: {
                                break block75;
                            }
                            case -1842218105: {
                                continue block75;
                            }
                        }
                        break;
                    }
                    if (!(Math.abs(this.correctionY - this.targetY) <= v.qqi("rly", qsi(int ), (int)184))) break block112;
                    if (var3_4 || var3_4) ** GOTO lbl32
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_4 = v.ax - v.qqi("rlz", qss(int ), (int)185)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == v.qqi("rma", qqf(int ), (int)361)) break;
                        v9 /* !! */  = (long)v.qqi("rmb", qqf(int ), (int)362);
                    }
                    this.finishClip();
                    if (var3_4) ** GOTO lbl32
                    if (var5_2) {
                        throw null;
                    }
                    break block113;
                }
                if (var3_4 || var3_4) ** GOTO lbl32
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = v.ax - v.qqi("rmc", qss(int ), (int)186)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == v.qqi("rmd", qqf(int ), (int)363)) break;
                    v10 /* !! */  = (long)v.qqi("rme", qqf(int ), (int)364);
                }
                if (var1_1 - this.correctionAt < v.qqi("rmf", qss(int ), (int)187)) break block113;
                if (var3_4 || var3_4) ** GOTO lbl32
                v11 /* !! */  = v.ax;
                if (true) ** GOTO lbl97
                block78: while (true) {
                    v11 /* !! */  = (long)(v12 - v.qqi("rmg", qss(int ), (int)188));
lbl97:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2121201296: {
                            break block78;
                        }
                        case 3760987: {
                            v12 = v.qqi("rmh", qss(int ), (int)189);
                            continue block78;
                        }
                        case 148570760: {
                            v12 = v.qqi("rmi", qss(int ), (int)190);
                            continue block78;
                        }
                        case 582549474: {
                            v12 = v.qqi("rmj", qss(int ), (int)191);
                            continue block78;
                        }
                    }
                    break;
                }
                this.sendClipAttempt(var1_1);
                if (var3_4) ** GOTO lbl32
            }
            if (var3_4 || var3_4) ** GOTO lbl32
            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl32
        v13 /* !! */  = v.ax;
        if (true) ** GOTO lbl120
        block79: while (true) {
            v13 /* !! */  = (long)(v.qqi("rml", qss(int ), (int)193) - v.qqi("rmk", qss(int ), (int)192));
lbl120:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -2121201296: {
                    break block79;
                }
                case -989183053: {
                    continue block79;
                }
            }
            break;
        }
        if (var1_1 - this.attemptAt < v.qqi("rmm", qss(int ), (int)194)) ** GOTO lbl190
        if (var3_4) ** GOTO lbl32
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = v.ax - v.qqi("rmn", qss(int ), (int)195)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == v.qqi("rmo", qqf(int ), (int)365)) break;
            v14 /* !! */  = (long)v.qqi("ruu", qqf(int ), (int)366);
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_7 = v.ax - v.qqi("ruv", qss(int ), (int)196)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == v.qqi("ruw", qqf(int ), (int)367)) break;
            v15 /* !! */  = (long)v.qqi("rux", qqf(int ), (int)368);
        }
        v16 = v.mc.field_1724;
        v17 /* !! */  = v.ax;
        if (true) ** GOTO lbl142
        block82: while (true) {
            v17 /* !! */  = (long)(v.qqi("ruz", qss(int ), (int)198) - v.qqi("ruy", qss(int ), (int)197));
lbl142:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -2121201296: {
                    break block82;
                }
                case -1769046006: {
                    continue block82;
                }
            }
            break;
        }
        v18 = v16.method_23318();
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_8 = v.ax - v.qqi("rva", qss(int ), (int)199)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == v.qqi("rvb", qqf(int ), (int)369)) break;
            v19 /* !! */  = (long)v.qqi("rvc", qqf(int ), (int)370);
        }
        v20 = v18 - this.targetY;
        v21 /* !! */  = v.ax;
        if (true) ** GOTO lbl158
        block84: while (true) {
            v21 /* !! */  = (long)(v22 - v.qqi("rvd", qss(int ), (int)200));
lbl158:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case -2121201296: {
                    break block84;
                }
                case -1032337532: {
                    v22 = v.qqi("rve", qss(int ), (int)201);
                    continue block84;
                }
                case 236715606: {
                    v22 = v.qqi("rvf", qss(int ), (int)202);
                    continue block84;
                }
                case 605649484: {
                    v22 = v.qqi("rvg", qss(int ), (int)203);
                    continue block84;
                }
            }
            break;
        }
        if (!(Math.abs(v20) <= v.qqi("rvh", qsi(int ), (int)204))) ** GOTO lbl190
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl32
                v23 /* !! */  = v.ax;
                if (true) ** GOTO lbl179
                block85: while (true) {
                    v23 /* !! */  = (long)(v24 - v.qqi("rvi", qss(int ), (int)205));
lbl179:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -2121201296: {
                            break block85;
                        }
                        case 159700555: {
                            v24 = v.qqi("rvj", qss(int ), (int)206);
                            continue block85;
                        }
                        case 1802215939: {
                            v24 = v.qqi("rvk", qss(int ), (int)207);
                            continue block85;
                        }
                    }
                    break;
                }
                this.finishClip();
                if (var3_4) ** GOTO lbl32
lbl190:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl193:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)v.qqi("rvl", qqf(int ), (int)371);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl198:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)v.qqi("rvm", qqf(int ), (int)372);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl203:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)v.qqi("rvn", qqf(int ), (int)373);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl208:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)v.qqi("rvo", qqf(int ), (int)374);
                if (!var5_2) break;
                throw null;
            }
            case 4: {
                var4_3 /* !! */  = (int)v.qqi("rvp", qqf(int ), (int)375);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 5: {
                var4_3 /* !! */  = (int)v.qqi("rvq", qqf(int ), (int)376);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl222:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)v.qqi("rvr", qqf(int ), (int)377);
                    if (var5_2) {
                        throw null;
                    }
                    ** GOTO lbl242
                    break;
                }
            }
lbl228:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)v.qqi("rvs", qqf(int ), (int)378);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl233:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)v.qqi("rvt", qqf(int ), (int)379);
                if (!var5_2) ** GOTO lbl193
                throw null;
            }
            case 9: {
                do {
                    var4_3 /* !! */  = (int)v.qqi("rvu", qqf(int ), (int)380);
                } while (!var5_2);
                throw null;
            }
lbl242:
            // 3 sources

            case 10: {
                var4_3 /* !! */  = (int)v.qqi("rvv", qqf(int ), (int)381);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 11: {
                var4_3 /* !! */  = (int)v.qqi("rvw", qqf(int ), (int)382);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl252:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)v.qqi("rvx", qqf(int ), (int)383);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 13: {
                var4_3 /* !! */  = (int)v.qqi("rvy", qqf(int ), (int)384);
                if (!var5_2) ** GOTO lbl203
                throw null;
            }
            case 14: {
                do {
                    var4_3 /* !! */  = (int)v.qqi("rvz", qqf(int ), (int)385);
                } while (!var5_2);
                throw null;
            }
            case 15: {
                var4_3 /* !! */  = (int)v.qqi("rwa", qqf(int ), (int)386);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl271:
            // 2 sources

            case 16: {
                var4_3 /* !! */  = (int)v.qqi("rwb", qqf(int ), (int)387);
                if (!var5_2) ** GOTO lbl242
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)v.qqi("rwc", qqf(int ), (int)388);
                if (!var5_2) ** GOTO lbl198
                throw null;
            }
            case 18: {
                var4_3 /* !! */  = (int)v.qqi("rwd", qqf(int ), (int)389);
                if (!var5_2) ** GOTO lbl233
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)v.qqi("rwe", qqf(int ), (int)390);
                if (!var5_2) ** GOTO lbl228
                throw null;
            }
lbl287:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)v.qqi("rwf", qqf(int ), (int)391);
                if (var5_2) {
                    throw null;
                }
            }
lbl291:
            // 4 sources

            case 21: {
                var4_3 /* !! */  = (int)v.qqi("rwg", qqf(int ), (int)392);
                if (!var5_2) ** GOTO lbl198
                throw null;
            }
lbl295:
            // 4 sources

            case 22: {
                var4_3 /* !! */  = (int)v.qqi("rwh", qqf(int ), (int)393);
                if (!var5_2) ** GOTO lbl222
                throw null;
            }
lbl299:
            // 3 sources

            case 23: {
                do {
                    var4_3 /* !! */  = (int)v.qqi("rwi", qqf(int ), (int)394);
                } while (!var5_2);
                throw null;
            }
            case 24: 
        }
        var4_3 /* !! */  = (int)v.qqi("rwj", qqf(int ), (int)395);
        ** while (!var5_2)
lbl307:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clear() {
        v0 /* !! */  = v.ax;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - v.qqi("rjt", qss(int ), (int)150));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2121201296: {
                    break block45;
                }
                case -2088762659: {
                    v1 = v.qqi("rju", qss(int ), (int)151);
                    continue block45;
                }
                case -893999841: {
                    v1 = v.qqi("rjv", qss(int ), (int)152);
                    continue block45;
                }
                case 443589043: {
                    v1 = v.qqi("rjw", qss(int ), (int)153);
                    continue block45;
                }
            }
            break;
        }
        var3_1 = v.c;
        v2 /* !! */  = v.ax;
        if (true) ** GOTO lbl22
        block46: while (true) {
            v2 /* !! */  = (long)(v.qqi("rjy", qss(int ), (int)155) - v.qqi("rjx", qss(int ), (int)154));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2121201296: {
                    break block46;
                }
                case -1453558236: {
                    continue block46;
                }
            }
            break;
        }
        var2_2 /* !! */  = v.b;
        v3 /* !! */  = v.ax;
        if (true) ** GOTO lbl32
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - v.qqi("rjz", qss(int ), (int)156));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2121201296: {
                    break block47;
                }
                case -339020007: {
                    v4 = v.qqi("rka", qss(int ), (int)157);
                    continue block47;
                }
                case 476829387: {
                    v4 = v.qqi("rkb", qss(int ), (int)158);
                    continue block47;
                }
                case 504698088: {
                    v4 = v.qqi("rkc", qss(int ), (int)159);
                    continue block47;
                }
            }
            break;
        }
        var1_3 = v.a;
        if (var3_1) {
            throw null;
lbl47:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl47
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("rkd", qss(int ), (int)160)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == v.qqi("rke", qqf(int ), (int)338)) break;
            v5 /* !! */  = (long)v.qqi("rkf", qqf(int ), (int)339);
        }
        this.targetName = null;
        if (var1_3 || var1_3) ** GOTO lbl47
        v6 = v.qqi("rkg", qqf(int ), (int)340);
        v7 /* !! */  = v.ax;
        if (true) ** GOTO lbl62
        block50: while (true) {
            v7 /* !! */  = (long)(v8 - v.qqi("rkh", qss(int ), (int)161));
lbl62:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2121201296: {
                    break block50;
                }
                case 1088094490: {
                    v8 = v.qqi("rki", qss(int ), (int)162);
                    continue block50;
                }
                case 1695416337: {
                    v8 = v.qqi("rkj", qss(int ), (int)163);
                    continue block50;
                }
            }
            break;
        }
        v.dragonFlyMovementOverride = v6;
        if (var1_3 || var1_3) ** GOTO lbl47
        v9 /* !! */  = v.ax;
        if (true) ** GOTO lbl77
        block51: while (true) {
            v9 /* !! */  = (long)(v10 - v.qqi("rkk", qss(int ), (int)164));
lbl77:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2121201296: {
                    break block51;
                }
                case -1239856833: {
                    v10 = v.qqi("rkl", qss(int ), (int)165);
                    continue block51;
                }
                case 959206634: {
                    v10 = v.qqi("rkm", qss(int ), (int)166);
                    continue block51;
                }
            }
            break;
        }
        this.stopNavigation();
        if (var1_3) ** GOTO lbl47
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl47
                v11 /* !! */  = v.ax;
                if (true) ** GOTO lbl96
                block52: while (true) {
                    v11 /* !! */  = (long)(v12 - v.qqi("rkn", qss(int ), (int)167));
lbl96:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -2121201296: {
                            break block52;
                        }
                        case -1431664746: {
                            v12 = v.qqi("rko", qss(int ), (int)168);
                            continue block52;
                        }
                        case -361126573: {
                            v12 = v.qqi("rkp", qss(int ), (int)169);
                            continue block52;
                        }
                    }
                    break;
                }
                this.resetClipState();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl109:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)v.qqi("rkq", qqf(int ), (int)341);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl114:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)v.qqi("rkr", qqf(int ), (int)342);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl119:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)v.qqi("rks", qqf(int ), (int)343);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl146
                    break;
                }
            }
lbl125:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)v.qqi("rkt", qqf(int ), (int)344);
                if (!var3_1) ** GOTO lbl109
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)v.qqi("rku", qqf(int ), (int)345);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl134:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)v.qqi("rkv", qqf(int ), (int)346);
                if (var3_1) {
                    throw null;
                }
            }
lbl138:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)v.qqi("rkw", qqf(int ), (int)347);
                if (!var3_1) ** GOTO lbl119
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)v.qqi("rkx", qqf(int ), (int)348);
                if (var3_1) {
                    throw null;
                }
            }
lbl146:
            // 5 sources

            case 8: {
                var2_2 /* !! */  = (int)v.qqi("rky", qqf(int ), (int)349);
                if (var3_1) {
                    throw null;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)v.qqi("rkz", qqf(int ), (int)350);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)v.qqi("rla", qqf(int ), (int)351);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)v.qqi("rlb", qqf(int ), (int)352);
        ** while (!var3_1)
lbl161:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void som() {
        v.qqh[0] = 1701073632;
        v.qqh[1] = 485523215;
        v.qqh[2] = -1586017197;
        v.qqh[3] = 1336113497;
        v.qqh[4] = -1321954261;
        v.qqh[5] = 1216424887;
        v.qqh[6] = 672966289;
        v.qqh[7] = -930318335;
        v.qqh[8] = -2094523117;
        v.qqh[9] = 1341572951;
        v.qqh[10] = -661833670;
        v.qqh[11] = -1168277580;
        v.qqh[12] = 1209071438;
        v.qqh[13] = 1192403972;
        v.qqh[14] = 1879283163;
        v.qqh[15] = 1275302843;
        v.qqh[16] = -1989990984;
        v.qqh[17] = -233476853;
        v.qqh[18] = -979563108;
        v.qqh[19] = -1686409953;
        v.qqh[20] = -1538734199;
        v.qqh[21] = 1558371344;
        v.qqh[22] = 1853628307;
        v.qqh[23] = 1577725548;
        v.qqh[24] = -1543980342;
        v.qqh[25] = 46734458;
        v.qqh[26] = 690595670;
        v.qqh[27] = -1872293962;
        v.qqh[28] = -1078955516;
        v.qqh[29] = 30441742;
        v.qqh[30] = -18445614;
        v.qqh[31] = 218449632;
        v.qqh[32] = -712445637;
        v.qqh[33] = -1952550950;
        v.qqh[34] = 1651049050;
        v.qqh[35] = 2078126107;
        v.qqh[36] = -2106972646;
        v.qqh[37] = 557885523;
        v.qqh[38] = 664653314;
        v.qqh[39] = 1728838317;
        v.qqh[40] = 1541345135;
        v.qqh[41] = -991672383;
        v.qqh[42] = -524882898;
        v.qqh[43] = -1165271565;
        v.qqh[44] = 901801944;
        v.qqh[45] = 1859006427;
        v.qqh[46] = -1353276059;
        v.qqh[47] = 1067129512;
        v.qqh[48] = 450021310;
        v.qqh[49] = -534727763;
        v.qqh[50] = -1237384854;
        v.qqh[51] = 957824676;
        v.qqh[52] = -466719985;
        v.qqh[53] = 1463350730;
        v.qqh[54] = -19779808;
        v.qqh[55] = 182819735;
        v.qqh[56] = 1983341719;
        v.qqh[57] = -344155072;
        v.qqh[58] = 821831235;
        v.qqh[59] = 1124664897;
        v.qqh[60] = -2102056659;
        v.qqh[61] = -99732865;
        v.qqh[62] = -382879274;
        v.qqh[63] = 1199661958;
        v.qqh[64] = 1530358620;
        v.qqh[65] = -1152194970;
        v.qqh[66] = -1640202188;
        v.qqh[67] = 1888543376;
        v.qqh[68] = -1244663888;
        v.qqh[69] = 1976127074;
        v.qqh[70] = 2017661159;
        v.qqh[71] = 589355602;
        v.qqh[72] = -236864828;
        v.qqh[73] = 245693146;
        v.qqh[74] = -51912134;
        v.qqh[75] = 1920014725;
        v.qqh[76] = -1386628361;
        v.qqh[77] = 89550808;
        v.qqh[78] = -1380193267;
        v.qqh[79] = -2011319571;
        v.qqh[80] = -1956914848;
        v.qqh[81] = -1050241810;
        v.qqh[82] = 861938663;
        v.qqh[83] = 1795082720;
        v.qqh[84] = -184834562;
        v.qqh[85] = 1673445207;
        v.qqh[86] = -1015142831;
        v.qqh[87] = -1013308664;
        v.qqh[88] = 844567348;
        v.qqh[89] = -496715173;
        v.qqh[90] = 1402052961;
        v.qqh[91] = 169246055;
        v.qqh[92] = 618460275;
        v.qqh[93] = -1807453704;
        v.qqh[94] = -733653868;
        v.qqh[95] = 169670555;
        v.qqh[96] = 1106261048;
        v.qqh[97] = -535354434;
        v.qqh[98] = 704625121;
        v.qqh[99] = 1293223267;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onWorldRender(dj var1_1) {
        block71: {
            block70: {
                block69: {
                    var14_2 = v.c;
                    var13_3 /* !! */  = v.b;
                    var12_4 = v.a;
                    if (var14_2) {
                        throw null;
lbl6:
                        // 19 sources

                        return;
                    }
                    if (var12_4 || var12_4) ** GOTO lbl6
                    if (this.targetName == null) break block69;
                    if (var12_4) ** GOTO lbl6
                    if (v.mc.field_1724 == null) break block69;
                    if (var12_4) ** GOTO lbl6
                    if (v.mc.field_1687 != null) break block70;
                    if (var12_4) ** GOTO lbl6
                }
                if (var12_4 || var12_4) ** GOTO lbl6
                return;
            }
            if (var12_4 || var12_4) ** GOTO lbl6
            var2_5 = this.findPlayer(this.targetName);
            if (var12_4 || var12_4) ** GOTO lbl6
            if (var2_5 != null) break block71;
            if (var12_4 || var12_4) ** GOTO lbl6
            return;
        }
        if (var12_4) ** GOTO lbl6
        if (var13_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var13_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var12_4) ** GOTO lbl6
                var3_6 = var2_5.method_30950(var1_1.getPartialTicks());
                if (var12_4 || var12_4) ** GOTO lbl6
                var4_7 = Math.floor(var3_6.field_1352) + v.qqi("qzv", qsi(int ), (int)51);
                if (var12_4 || var12_4) ** GOTO lbl6
                var6_8 = Math.floor(var3_6.field_1350) + v.qqi("qzw", qsi(int ), (int)52);
                if (var12_4 || var12_4) ** GOTO lbl6
                var8_9 = Math.floor(var3_6.field_1351) + v.qqi("qzx", qsi(int ), (int)53);
                if (var12_4 || var12_4) ** GOTO lbl6
                var10_10 = lv.getCameraPos();
                if (var12_4 || var12_4) ** GOTO lbl6
                var11_11 = nd.getClientColorAt((float)v.qqi("qzz", qzy(int ), (int)191));
                if (var12_4 || var12_4) ** GOTO lbl6
                lv.begin((boolean)v.qqi("raa", qqf(int ), (int)192));
                if (var12_4 || var12_4) ** GOTO lbl6
                lv.line((float)(var4_7 - var10_10.field_1352), (float)(var8_9 - v.qqi("rab", qsi(int ), (int)54) - var10_10.field_1351), (float)(var6_8 - var10_10.field_1350), (float)(var4_7 - var10_10.field_1352), (float)(var8_9 + v.qqi("rac", qsi(int ), (int)55) - var10_10.field_1351), (float)(var6_8 - var10_10.field_1350), var11_11, 1.0f);
                if (var12_4 || var12_4) ** GOTO lbl6
                lv.end();
                if (!var12_4 && !var12_4) ** break;
                ** continue;
                return;
            }
lbl51:
            // 2 sources

            case 0: {
                do {
                    var13_3 /* !! */  = (int)v.qqi("rad", qqf(int ), (int)193);
                } while (!var14_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var13_3 /* !! */  = (int)v.qqi("rae", qqf(int ), (int)194);
                    if (var14_2) {
                        throw null;
                    }
                    ** GOTO lbl163
                    break;
                }
            }
lbl62:
            // 5 sources

            case 2: {
                var13_3 /* !! */  = (int)v.qqi("raf", qqf(int ), (int)195);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl67:
            // 3 sources

            case 3: {
                var13_3 /* !! */  = (int)v.qqi("rag", qqf(int ), (int)196);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 4: {
                var13_3 /* !! */  = (int)v.qqi("rah", qqf(int ), (int)197);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl77:
            // 4 sources

            case 5: {
                var13_3 /* !! */  = (int)v.qqi("rai", qqf(int ), (int)198);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl82:
            // 3 sources

            case 6: {
                var13_3 /* !! */  = (int)v.qqi("raj", qqf(int ), (int)199);
                if (!var14_2) ** GOTO lbl77
                throw null;
            }
            case 7: {
                var13_3 /* !! */  = (int)v.qqi("rak", qqf(int ), (int)200);
                if (!var14_2) ** GOTO lbl62
                throw null;
            }
            case 8: {
                var13_3 /* !! */  = (int)v.qqi("ral", qqf(int ), (int)201);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl95:
            // 3 sources

            case 9: {
                var13_3 /* !! */  = (int)v.qqi("ram", qqf(int ), (int)202);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 10: {
                var13_3 /* !! */  = (int)v.qqi("ran", qqf(int ), (int)203);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 11: {
                var13_3 /* !! */  = (int)v.qqi("rao", qqf(int ), (int)204);
                if (!var14_2) ** GOTO lbl82
                throw null;
            }
lbl109:
            // 2 sources

            case 12: {
                var13_3 /* !! */  = (int)v.qqi("rap", qqf(int ), (int)205);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl114:
            // 2 sources

            case 13: {
                var13_3 /* !! */  = (int)v.qqi("raq", qqf(int ), (int)206);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl119:
            // 2 sources

            case 14: {
                var13_3 /* !! */  = (int)v.qqi("rar", qqf(int ), (int)207);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 15: {
                var13_3 /* !! */  = (int)v.qqi("ras", qqf(int ), (int)208);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl129:
            // 3 sources

            case 16: {
                var13_3 /* !! */  = (int)v.qqi("rat", qqf(int ), (int)209);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl134:
            // 2 sources

            case 17: {
                var13_3 /* !! */  = (int)v.qqi("rau", qqf(int ), (int)210);
                if (!var14_2) ** GOTO lbl95
                throw null;
            }
            case 18: {
                var13_3 /* !! */  = (int)v.qqi("rav", qqf(int ), (int)211);
                if (!var14_2) ** GOTO lbl77
                throw null;
            }
            case 19: {
                var13_3 /* !! */  = (int)v.qqi("raw", qqf(int ), (int)212);
                if (!var14_2) ** GOTO lbl67
                throw null;
            }
lbl146:
            // 3 sources

            case 20: {
                var13_3 /* !! */  = (int)v.qqi("rax", qqf(int ), (int)213);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 21: {
                var13_3 /* !! */  = (int)v.qqi("ray", qqf(int ), (int)214);
                if (!var14_2) ** GOTO lbl95
                throw null;
            }
lbl155:
            // 2 sources

            case 22: {
                var13_3 /* !! */  = (int)v.qqi("raz", qqf(int ), (int)215);
                if (!var14_2) ** GOTO lbl146
                throw null;
            }
            case 23: {
                var13_3 /* !! */  = (int)v.qqi("rba", qqf(int ), (int)216);
                if (!var14_2) ** GOTO lbl62
                throw null;
            }
lbl163:
            // 2 sources

            case 24: {
                var13_3 /* !! */  = (int)v.qqi("rbb", qqf(int ), (int)217);
                if (var14_2) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl168:
            // 2 sources

            case 25: {
                var13_3 /* !! */  = (int)v.qqi("rbc", qqf(int ), (int)218);
                if (!var14_2) ** GOTO lbl77
                throw null;
            }
lbl172:
            // 2 sources

            case 26: {
                var13_3 /* !! */  = (int)v.qqi("rbd", qqf(int ), (int)219);
                if (!var14_2) ** GOTO lbl62
                throw null;
            }
lbl176:
            // 3 sources

            case 27: {
                var13_3 /* !! */  = (int)v.qqi("rbe", qqf(int ), (int)220);
                if (!var14_2) ** GOTO lbl51
                throw null;
            }
lbl180:
            // 3 sources

            case 28: {
                var13_3 /* !! */  = (int)v.qqi("rbf", qqf(int ), (int)221);
                if (!var14_2) ** GOTO lbl119
                throw null;
            }
            case 29: {
                var13_3 /* !! */  = (int)v.qqi("rbg", qqf(int ), (int)222);
                if (!var14_2) ** GOTO lbl62
                throw null;
            }
lbl188:
            // 3 sources

            case 30: {
                var13_3 /* !! */  = (int)v.qqi("rbh", qqf(int ), (int)223);
                if (!var14_2) ** GOTO lbl129
                throw null;
            }
lbl192:
            // 2 sources

            case 31: {
                var13_3 /* !! */  = (int)v.qqi("rbi", qqf(int ), (int)224);
                if (!var14_2) ** GOTO lbl67
                throw null;
            }
            case 32: {
                var13_3 /* !! */  = (int)v.qqi("rbj", qqf(int ), (int)225);
                if (!var14_2) ** GOTO lbl134
                throw null;
            }
lbl200:
            // 2 sources

            case 33: {
                var13_3 /* !! */  = (int)v.qqi("rbk", qqf(int ), (int)226);
                if (!var14_2) ** GOTO lbl172
                throw null;
            }
            case 34: {
                var13_3 /* !! */  = (int)v.qqi("rbl", qqf(int ), (int)227);
                if (!var14_2) ** GOTO lbl114
                throw null;
            }
            case 35: 
        }
        var13_3 /* !! */  = (int)v.qqi("rbm", qqf(int ), (int)228);
        ** while (!var14_2)
lbl211:
        // 1 sources

        throw null;
    }

    static {
        qqg = new int[676];
        qqh = new int[676];
        v.sof();
        v.sog();
        v.soh();
        v.soi();
        v.soj();
        v.sok();
        v.sol();
        v.som();
        v.son();
        v.soo();
        v.sop();
        v.soq();
        v.sor();
        v.sux();
        qsj = new long[391];
        qsk = new long[391];
        v.suy();
        v.suz();
        v.sva();
        v.svb();
        v.svc();
        v.svd();
        v.sve();
        v.svf();
        mc = class_310.method_1551();
    }

    private static /* synthetic */ void sof() {
        v.qqg[0] = -446410016;
        v.qqg[1] = -1661960433;
        v.qqg[2] = -1586017197;
        v.qqg[3] = 1336113496;
        v.qqg[4] = -1321954263;
        v.qqg[5] = 1216424886;
        v.qqg[6] = 672966290;
        v.qqg[7] = -930318336;
        v.qqg[8] = -2094523118;
        v.qqg[9] = 1341572935;
        v.qqg[10] = -661833677;
        v.qqg[11] = -1168277572;
        v.qqg[12] = 1209071466;
        v.qqg[13] = 1192403969;
        v.qqg[14] = 1879283197;
        v.qqg[15] = 1275302839;
        v.qqg[16] = -1989990979;
        v.qqg[17] = -233476835;
        v.qqg[18] = -979563124;
        v.qqg[19] = -1686409924;
        v.qqg[20] = -1538734202;
        v.qqg[21] = 1558371356;
        v.qqg[22] = 1853628340;
        v.qqg[23] = 1577725558;
        v.qqg[24] = -1543980308;
        v.qqg[25] = 46734432;
        v.qqg[26] = 690595658;
        v.qqg[27] = -1872293958;
        v.qqg[28] = -1078955504;
        v.qqg[29] = 30441772;
        v.qqg[30] = -18445604;
        v.qqg[31] = 218449656;
        v.qqg[32] = -712445644;
        v.qqg[33] = -1952550955;
        v.qqg[34] = 1651049054;
        v.qqg[35] = 2078126107;
        v.qqg[36] = -2106972666;
        v.qqg[37] = 557885535;
        v.qqg[38] = 664653338;
        v.qqg[39] = 1728838324;
        v.qqg[40] = 1541345121;
        v.qqg[41] = -991672351;
        v.qqg[42] = -524882904;
        v.qqg[43] = -1165271570;
        v.qqg[44] = 901801979;
        v.qqg[45] = 1859006431;
        v.qqg[46] = -1353276055;
        v.qqg[47] = 1067129482;
        v.qqg[48] = 450021280;
        v.qqg[49] = -534727763;
        v.qqg[50] = -1237384854;
        v.qqg[51] = 957824677;
        v.qqg[52] = -466719985;
        v.qqg[53] = 1463350730;
        v.qqg[54] = -19779807;
        v.qqg[55] = 182819757;
        v.qqg[56] = 1983341739;
        v.qqg[57] = -344155033;
        v.qqg[58] = 821831278;
        v.qqg[59] = 1124664953;
        v.qqg[60] = -2102056607;
        v.qqg[61] = -99732881;
        v.qqg[62] = -382879343;
        v.qqg[63] = 1199662019;
        v.qqg[64] = 1530358655;
        v.qqg[65] = -1152194974;
        v.qqg[66] = -1640202214;
        v.qqg[67] = 1888543413;
        v.qqg[68] = -1244663879;
        v.qqg[69] = 1976127067;
        v.qqg[70] = 2017661178;
        v.qqg[71] = 589355612;
        v.qqg[72] = -236864787;
        v.qqg[73] = 245693137;
        v.qqg[74] = -51912179;
        v.qqg[75] = 1920014768;
        v.qqg[76] = -1386628371;
        v.qqg[77] = 89550791;
        v.qqg[78] = -1380193220;
        v.qqg[79] = -2011319596;
        v.qqg[80] = -1956914844;
        v.qqg[81] = -1050241888;
        v.qqg[82] = 861938666;
        v.qqg[83] = 1795082662;
        v.qqg[84] = -184834596;
        v.qqg[85] = 1673445147;
        v.qqg[86] = -1015142848;
        v.qqg[87] = -1013308649;
        v.qqg[88] = 844567350;
        v.qqg[89] = -496715147;
        v.qqg[90] = 1402052912;
        v.qqg[91] = 169246059;
        v.qqg[92] = 618460216;
        v.qqg[93] = -1807453753;
        v.qqg[94] = -733653832;
        v.qqg[95] = 169670571;
        v.qqg[96] = 1106261036;
        v.qqg[97] = -535354375;
        v.qqg[98] = 704625073;
        v.qqg[99] = 1293223284;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List<String> getLongDesc() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("rgf", qss(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == v.qqi("rgg", qqf(int ), (int)294)) break;
            v0 /* !! */  = (long)v.qqi("rgh", qqf(int ), (int)295);
        }
        var3_1 = v.c;
        v1 /* !! */  = v.ax;
        if (true) ** GOTO lbl12
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - v.qqi("rgi", qss(int ), (int)114));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2121201296: {
                    break block6;
                }
                case -1490544697: {
                    v2 = v.qqi("rgj", qss(int ), (int)115);
                    continue block6;
                }
                case 922539083: {
                    v2 = v.qqi("rgk", qss(int ), (int)116);
                    continue block6;
                }
            }
            break;
        }
        var2_2 = v.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("rgl", qss(int ), (int)117)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == v.qqi("rgm", qqf(int ), (int)296)) break;
            v3 /* !! */  = (long)v.qqi("rgn", qqf(int ), (int)297);
        }
        var1_3 = v.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("rgo", qss(int ), (int)118)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == v.qqi("rgp", qqf(int ), (int)298)) break;
            v4 /* !! */  = (long)v.qqi("rgq", qqf(int ), (int)299);
        }
        return List.of("\u0418\u0449\u0435\u0442 \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u043d\u043e\u0433\u043e \u0438\u0433\u0440\u043e\u043a\u0430 \u0438 \u0440\u0438\u0441\u0443\u0435\u0442 \u0432\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u044c\u043d\u0443\u044e \u043a\u043e\u043b\u043e\u043d\u043d\u0443 \u043d\u0430 \u0435\u0433\u043e \u043f\u043e\u0437\u0438\u0446\u0438\u0438.", "> tp <\u043d\u0438\u043a> - \u0432\u044b\u0431\u0440\u0430\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430", "> tp off - \u0443\u0431\u0440\u0430\u0442\u044c \u043c\u0430\u0440\u043a\u0435\u0440");
    }

    private static /* synthetic */ float qzy(int n2) {
        return Float.intBitsToFloat(qqg[n2] ^ qqh[n2]);
    }

    private static /* synthetic */ void suy() {
        v.qsj[0] = -3318224496253439357L;
        v.qsj[1] = -8091650485756692083L;
        v.qsj[2] = 1499512822525057901L;
        v.qsj[3] = -1750787653350038108L;
        v.qsj[4] = -1631545640411705891L;
        v.qsj[5] = -5931662675361216884L;
        v.qsj[6] = -6643328379045146592L;
        v.qsj[7] = 6984347072376937523L;
        v.qsj[8] = 7623677683917473334L;
        v.qsj[9] = -1993153789574163016L;
        v.qsj[10] = -3932271981345862330L;
        v.qsj[11] = -6547696955669813621L;
        v.qsj[12] = -5032385640240831937L;
        v.qsj[13] = -6198581728096403242L;
        v.qsj[14] = -5544394429222546914L;
        v.qsj[15] = -4248882992639556550L;
        v.qsj[16] = -4194246561562839969L;
        v.qsj[17] = 8474363750565704641L;
        v.qsj[18] = 7676170055217810202L;
        v.qsj[19] = -4453273932142751196L;
        v.qsj[20] = -687709178181634454L;
        v.qsj[21] = 1063349739010982493L;
        v.qsj[22] = 918989629098356283L;
        v.qsj[23] = 5937283429206411437L;
        v.qsj[24] = -4890680761343929056L;
        v.qsj[25] = 18250369851563666L;
        v.qsj[26] = 6205548718111302162L;
        v.qsj[27] = -1840808160417936494L;
        v.qsj[28] = 4469726430083334122L;
        v.qsj[29] = 5890473701264059612L;
        v.qsj[30] = -4890237044297661860L;
        v.qsj[31] = -5429658609906811249L;
        v.qsj[32] = -5107808673472715301L;
        v.qsj[33] = 5783255779961124086L;
        v.qsj[34] = 960722934376275419L;
        v.qsj[35] = -931394631693259603L;
        v.qsj[36] = -2206147328087521712L;
        v.qsj[37] = 4717850409009078465L;
        v.qsj[38] = -357351671675910491L;
        v.qsj[39] = -162205032244839724L;
        v.qsj[40] = -3943133017785700113L;
        v.qsj[41] = -6055286828133286855L;
        v.qsj[42] = -7022810998422559334L;
        v.qsj[43] = 1063112729188213038L;
        v.qsj[44] = 847718314860185321L;
        v.qsj[45] = 5285437494507399098L;
        v.qsj[46] = -5647150625575338482L;
        v.qsj[47] = 5803059295128561553L;
        v.qsj[48] = 5936352193096947010L;
        v.qsj[49] = 6449018519215024659L;
        v.qsj[50] = -6740881624336687248L;
        v.qsj[51] = 5874476180943589349L;
        v.qsj[52] = -4760163611566764490L;
        v.qsj[53] = 7341402409002308763L;
        v.qsj[54] = 1355572587019018298L;
        v.qsj[55] = 3271895313838496841L;
        v.qsj[56] = 7375992415972222591L;
        v.qsj[57] = -8333700010345433143L;
        v.qsj[58] = -8655527026763468718L;
        v.qsj[59] = -3412302439781926749L;
        v.qsj[60] = 3021163248264224704L;
        v.qsj[61] = 1032309194342316083L;
        v.qsj[62] = 9053857724585015416L;
        v.qsj[63] = -8261867986024777990L;
        v.qsj[64] = -7511899006271263065L;
        v.qsj[65] = 3460166262763685940L;
        v.qsj[66] = -7413925436893443710L;
        v.qsj[67] = 1297883801169186257L;
        v.qsj[68] = -8951964833065494194L;
        v.qsj[69] = 1097151177211701197L;
        v.qsj[70] = -2178756207345746169L;
        v.qsj[71] = 4404794834465147995L;
        v.qsj[72] = -4021818569277782693L;
        v.qsj[73] = -1101317797977259119L;
        v.qsj[74] = 6490143460509396971L;
        v.qsj[75] = 5614210902052398581L;
        v.qsj[76] = -7688702549060632376L;
        v.qsj[77] = 929629738495412682L;
        v.qsj[78] = -1879434661231716857L;
        v.qsj[79] = -2962871310531062969L;
        v.qsj[80] = -4775488656360954997L;
        v.qsj[81] = -9093274140492008654L;
        v.qsj[82] = -534097253646657544L;
        v.qsj[83] = 968492088686587669L;
        v.qsj[84] = 791686570044861398L;
        v.qsj[85] = 2025651174680746401L;
        v.qsj[86] = 7114805674808328691L;
        v.qsj[87] = 5075938604067649198L;
        v.qsj[88] = -7774027950929406386L;
        v.qsj[89] = 7511238968071231875L;
        v.qsj[90] = -526933403168791777L;
        v.qsj[91] = 4973025530017576604L;
        v.qsj[92] = 8289183836851914556L;
        v.qsj[93] = 767632805471256048L;
        v.qsj[94] = 2140689734312552966L;
        v.qsj[95] = -5251301939575628450L;
        v.qsj[96] = 1701033998040611081L;
        v.qsj[97] = 792658126132962286L;
        v.qsj[98] = 2222705813623346574L;
        v.qsj[99] = 6163927996093928623L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void sendClipAttempt(long var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("rwk", qss(int ), (int)208)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == v.qqi("rwl", qqf(int ), (int)396)) break;
            v0 /* !! */  = (long)v.qqi("rwm", qqf(int ), (int)397);
        }
        var5_2 = v.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("rwn", qss(int ), (int)209)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == v.qqi("rwo", qqf(int ), (int)398)) break;
            v1 /* !! */  = (long)v.qqi("rwp", qqf(int ), (int)399);
        }
        var4_3 /* !! */  = v.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("rwq", qss(int ), (int)210)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == v.qqi("rwr", qqf(int ), (int)400)) break;
            v2 /* !! */  = (long)v.qqi("rws", qqf(int ), (int)401);
        }
        var3_4 = v.a;
        if (var5_2) {
            throw null;
lbl21:
            // 5 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl21
        v3 = v.qqi("rwt", qqf(int ), (int)402);
        v4 /* !! */  = v.ax;
        if (true) ** GOTO lbl29
        block34: while (true) {
            v4 /* !! */  = (long)(v5 - v.qqi("rwu", qss(int ), (int)211));
lbl29:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2121201296: {
                    break block34;
                }
                case -2015023379: {
                    v5 = v.qqi("rwv", qss(int ), (int)212);
                    continue block34;
                }
                case -1826227329: {
                    v5 = v.qqi("rww", qss(int ), (int)213);
                    continue block34;
                }
                case 355121786: {
                    v5 = v.qqi("rwx", qss(int ), (int)214);
                    continue block34;
                }
            }
            break;
        }
        this.corrected = v3;
        if (var3_4 || var3_4) ** GOTO lbl21
        v6 = v.qqi("rwy", qss(int ), (int)215);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = v.ax - v.qqi("rwz", qss(int ), (int)216)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == v.qqi("rxa", qqf(int ), (int)403)) break;
            v7 /* !! */  = (long)v.qqi("rxb", qqf(int ), (int)404);
        }
        this.correctionAt = (long)v6;
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl21
                v8 /* !! */  = v.ax;
                if (true) ** GOTO lbl58
                block36: while (true) {
                    v8 /* !! */  = (long)(v.qqi("rxd", qss(int ), (int)218) - v.qqi("rxc", qss(int ), (int)217));
lbl58:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -2121201296: {
                            break block36;
                        }
                        case -2113702717: {
                            continue block36;
                        }
                    }
                    break;
                }
                this.attemptAt = var1_1;
                if (var3_4 || var3_4) ** GOTO lbl21
                v9 /* !! */  = v.ax;
                if (true) ** GOTO lbl69
                block37: while (true) {
                    v9 /* !! */  = (long)(v10 - v.qqi("rxe", qss(int ), (int)219));
lbl69:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -2121201296: {
                            break block37;
                        }
                        case -1569849927: {
                            v10 = v.qqi("rxf", qss(int ), (int)220);
                            continue block37;
                        }
                        case -227000212: {
                            v10 = v.qqi("rxg", qss(int ), (int)221);
                            continue block37;
                        }
                        case 663036572: {
                            v10 = v.qqi("rxh", qss(int ), (int)222);
                            continue block37;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = v.ax - v.qqi("rxi", qss(int ), (int)223)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == v.qqi("rxj", qqf(int ), (int)405)) break;
                    v11 /* !! */  = (long)v.qqi("rxk", qqf(int ), (int)406);
                }
                nt.clipToY(this.targetY);
                if (var3_4 || var3_4) ** continue;
                return;
            }
lbl89:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)v.qqi("rxl", qqf(int ), (int)407);
                if (var5_2) {
                    throw null;
                }
            }
lbl93:
            // 5 sources

            case 1: {
                var4_3 /* !! */  = (int)v.qqi("rxm", qqf(int ), (int)408);
                if (!var5_2) break;
                throw null;
            }
lbl97:
            // 2 sources

            case 2: {
                var4_3 /* !! */  = (int)v.qqi("rxn", qqf(int ), (int)409);
                if (!var5_2) ** GOTO lbl89
                throw null;
            }
lbl101:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)v.qqi("rxo", qqf(int ), (int)410);
                    if (!var5_2) ** GOTO lbl97
                    throw null;
                }
            }
lbl106:
            // 3 sources

            case 4: {
                var4_3 /* !! */  = (int)v.qqi("rxp", qqf(int ), (int)411);
                if (!var5_2) ** GOTO lbl101
                throw null;
            }
            case 5: {
                var4_3 /* !! */  = (int)v.qqi("rxq", qqf(int ), (int)412);
                if (!var5_2) ** GOTO lbl93
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)v.qqi("rxr", qqf(int ), (int)413);
                if (!var5_2) ** GOTO lbl101
                throw null;
            }
            case 7: {
                var4_3 /* !! */  = (int)v.qqi("rxs", qqf(int ), (int)414);
                if (var5_2) {
                    throw null;
                }
            }
            case 8: {
                var4_3 /* !! */  = (int)v.qqi("rxt", qqf(int ), (int)415);
                if (!var5_2) ** GOTO lbl106
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)v.qqi("rxu", qqf(int ), (int)416);
                if (!var5_2) ** GOTO lbl93
                throw null;
            }
            case 10: {
                var4_3 /* !! */  = (int)v.qqi("rxv", qqf(int ), (int)417);
                if (!var5_2) ** GOTO lbl106
                throw null;
            }
            case 11: 
        }
        var4_3 /* !! */  = (int)v.qqi("rxw", qqf(int ), (int)418);
        ** while (!var5_2)
lbl137:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void son() {
        v.qqh[100] = 2058614073;
        v.qqh[101] = 135412218;
        v.qqh[102] = 1013492746;
        v.qqh[103] = -152323743;
        v.qqh[104] = 1104941786;
        v.qqh[105] = -100256490;
        v.qqh[106] = 963812916;
        v.qqh[107] = 761227041;
        v.qqh[108] = 1310766310;
        v.qqh[109] = 859326271;
        v.qqh[110] = -838387526;
        v.qqh[111] = -1177231015;
        v.qqh[112] = 1990912634;
        v.qqh[113] = -1631091128;
        v.qqh[114] = 2015391549;
        v.qqh[115] = 978049138;
        v.qqh[116] = -1313111996;
        v.qqh[117] = 1998116814;
        v.qqh[118] = 1628726271;
        v.qqh[119] = -1420026554;
        v.qqh[120] = -466844179;
        v.qqh[121] = -1663894629;
        v.qqh[122] = 611036273;
        v.qqh[123] = 595446827;
        v.qqh[124] = -1786693933;
        v.qqh[125] = 715544655;
        v.qqh[126] = 486460170;
        v.qqh[127] = 1266328624;
        v.qqh[128] = 2000632315;
        v.qqh[129] = -760058307;
        v.qqh[130] = -258936231;
        v.qqh[131] = 151457446;
        v.qqh[132] = -360223418;
        v.qqh[133] = 1930761362;
        v.qqh[134] = 384525661;
        v.qqh[135] = 1130732257;
        v.qqh[136] = -1416384543;
        v.qqh[137] = 1498277052;
        v.qqh[138] = -1780610796;
        v.qqh[139] = -18877888;
        v.qqh[140] = -1692246014;
        v.qqh[141] = -1757291877;
        v.qqh[142] = -994534548;
        v.qqh[143] = 1105526615;
        v.qqh[144] = 1295061365;
        v.qqh[145] = -559490013;
        v.qqh[146] = 404583934;
        v.qqh[147] = 1198498363;
        v.qqh[148] = 1851819835;
        v.qqh[149] = 1939516740;
        v.qqh[150] = 722059406;
        v.qqh[151] = 1617652686;
        v.qqh[152] = -1064429456;
        v.qqh[153] = 201212329;
        v.qqh[154] = -1298623996;
        v.qqh[155] = 915396320;
        v.qqh[156] = 897269812;
        v.qqh[157] = 1637336672;
        v.qqh[158] = -1517735134;
        v.qqh[159] = -1251507345;
        v.qqh[160] = -805468126;
        v.qqh[161] = 1733178397;
        v.qqh[162] = -1727045711;
        v.qqh[163] = 1243300845;
        v.qqh[164] = 1517870653;
        v.qqh[165] = 1010085651;
        v.qqh[166] = -1620768138;
        v.qqh[167] = -750900493;
        v.qqh[168] = -2012552675;
        v.qqh[169] = 942776614;
        v.qqh[170] = -1128601812;
        v.qqh[171] = -433817000;
        v.qqh[172] = 1154732619;
        v.qqh[173] = -1916714050;
        v.qqh[174] = -1344590401;
        v.qqh[175] = 663059852;
        v.qqh[176] = -1662122836;
        v.qqh[177] = -1081629960;
        v.qqh[178] = 1811779206;
        v.qqh[179] = -641938426;
        v.qqh[180] = -1653622874;
        v.qqh[181] = -1158289030;
        v.qqh[182] = 876159836;
        v.qqh[183] = 1351669147;
        v.qqh[184] = -1435987723;
        v.qqh[185] = -124004173;
        v.qqh[186] = 1727118482;
        v.qqh[187] = 1255136873;
        v.qqh[188] = -1623738945;
        v.qqh[189] = 618791271;
        v.qqh[190] = 899189031;
        v.qqh[191] = 2021540779;
        v.qqh[192] = 1665835439;
        v.qqh[193] = -506177393;
        v.qqh[194] = -392185004;
        v.qqh[195] = 678894575;
        v.qqh[196] = 52213431;
        v.qqh[197] = 204176538;
        v.qqh[198] = -1415258871;
        v.qqh[199] = -775548181;
    }

    private static /* synthetic */ void suz() {
        v.qsj[100] = -334750673904921978L;
        v.qsj[101] = -6684487335652447731L;
        v.qsj[102] = 8361329436006105433L;
        v.qsj[103] = -6904794022749853968L;
        v.qsj[104] = 5889944503170224203L;
        v.qsj[105] = -8962421394491096322L;
        v.qsj[106] = -1084888357341231459L;
        v.qsj[107] = 7671186924374095176L;
        v.qsj[108] = 4250925942745000984L;
        v.qsj[109] = -1796032700555594786L;
        v.qsj[110] = -410652214649067462L;
        v.qsj[111] = -5062574342701928488L;
        v.qsj[112] = -8424704419494879228L;
        v.qsj[113] = -5406196003985342961L;
        v.qsj[114] = -1607873290074373659L;
        v.qsj[115] = 6198048849019586179L;
        v.qsj[116] = -9219374040511440727L;
        v.qsj[117] = 9098811516121854900L;
        v.qsj[118] = -6599810768132976923L;
        v.qsj[119] = 7087141251324114179L;
        v.qsj[120] = 7761896349683078262L;
        v.qsj[121] = -6793290690855544392L;
        v.qsj[122] = -1370502374181525389L;
        v.qsj[123] = 9208331031541722478L;
        v.qsj[124] = 3995135940528890197L;
        v.qsj[125] = 3330286863966130184L;
        v.qsj[126] = -4382182178383314659L;
        v.qsj[127] = -4067701248450335382L;
        v.qsj[128] = 2629822359727667009L;
        v.qsj[129] = 2577693549397490610L;
        v.qsj[130] = -7205011743859458760L;
        v.qsj[131] = 6064507194222675386L;
        v.qsj[132] = 2245237915054158254L;
        v.qsj[133] = -1618218697573891127L;
        v.qsj[134] = -8909616131557825931L;
        v.qsj[135] = -6753463307765641052L;
        v.qsj[136] = -2540382812986660266L;
        v.qsj[137] = 1150569369750356391L;
        v.qsj[138] = 644994656739389994L;
        v.qsj[139] = -7466071922767416282L;
        v.qsj[140] = -3252865302464141388L;
        v.qsj[141] = -2094600870064694327L;
        v.qsj[142] = 1697727063097012583L;
        v.qsj[143] = -6764960952960221073L;
        v.qsj[144] = 6041588860546059212L;
        v.qsj[145] = 8956105468003525471L;
        v.qsj[146] = -2536328674904744286L;
        v.qsj[147] = -1113522258069573802L;
        v.qsj[148] = -3023832496804852951L;
        v.qsj[149] = 7203193578947636305L;
        v.qsj[150] = -7673520519390285915L;
        v.qsj[151] = 6923119775898697461L;
        v.qsj[152] = 3444790067346445625L;
        v.qsj[153] = -7096470141385058165L;
        v.qsj[154] = -7730123832657208008L;
        v.qsj[155] = 9059470858689550063L;
        v.qsj[156] = -1608535072340822702L;
        v.qsj[157] = -3889841491288137014L;
        v.qsj[158] = 7412758326845249030L;
        v.qsj[159] = -5226250932574399380L;
        v.qsj[160] = 5714445577565382128L;
        v.qsj[161] = 375228783318153334L;
        v.qsj[162] = 8551449547026904626L;
        v.qsj[163] = 651446797301586562L;
        v.qsj[164] = -3974578929764305456L;
        v.qsj[165] = 7829915640409492339L;
        v.qsj[166] = 4713060903095118422L;
        v.qsj[167] = 1975493892457704010L;
        v.qsj[168] = 3921481411702350361L;
        v.qsj[169] = 1917492674020406418L;
        v.qsj[170] = 1587612355884689705L;
        v.qsj[171] = 5055293024300966308L;
        v.qsj[172] = -1938783628017579423L;
        v.qsj[173] = -1373799718048747149L;
        v.qsj[174] = -5207304477687885067L;
        v.qsj[175] = 8078734797163611492L;
        v.qsj[176] = 4272119747207690019L;
        v.qsj[177] = -3891427372302241073L;
        v.qsj[178] = -7303692410856360957L;
        v.qsj[179] = 7110131329993966005L;
        v.qsj[180] = 4496558552306652191L;
        v.qsj[181] = 2652661788193072700L;
        v.qsj[182] = -5616459221438718868L;
        v.qsj[183] = -8548191394723387762L;
        v.qsj[184] = 2952266474619681650L;
        v.qsj[185] = 5655594962468673933L;
        v.qsj[186] = 4415415372800673131L;
        v.qsj[187] = 6730064522779985105L;
        v.qsj[188] = -8030425602557375962L;
        v.qsj[189] = 8132491530796859442L;
        v.qsj[190] = -2137445598413606224L;
        v.qsj[191] = 6085562530904203382L;
        v.qsj[192] = 1964151889453155859L;
        v.qsj[193] = -6145766188104143245L;
        v.qsj[194] = -6049518698881120520L;
        v.qsj[195] = -2017188239111789183L;
        v.qsj[196] = 5986753223286793948L;
        v.qsj[197] = 3336429571898980996L;
        v.qsj[198] = -7853835138673472527L;
        v.qsj[199] = 3753265377091847806L;
    }

    private static /* synthetic */ void sva() {
        v.qsj[200] = -4521333235713942566L;
        v.qsj[201] = 1391884121649467139L;
        v.qsj[202] = 4787461559600427099L;
        v.qsj[203] = 7461775397191862855L;
        v.qsj[204] = 5473673964193942596L;
        v.qsj[205] = -3492914143628419200L;
        v.qsj[206] = -2619914263543915934L;
        v.qsj[207] = -8845522294698542369L;
        v.qsj[208] = 6302355531331813929L;
        v.qsj[209] = 5264494896126559492L;
        v.qsj[210] = -1549748814406094771L;
        v.qsj[211] = 541236298034445966L;
        v.qsj[212] = -8535435148514691258L;
        v.qsj[213] = -6794065129853322791L;
        v.qsj[214] = 6976231281389898408L;
        v.qsj[215] = -746133340191462621L;
        v.qsj[216] = 839802912172045872L;
        v.qsj[217] = -8748643031731315802L;
        v.qsj[218] = -2344084638695915951L;
        v.qsj[219] = -1000812484476483289L;
        v.qsj[220] = 5567499826211551015L;
        v.qsj[221] = -6802825985321116271L;
        v.qsj[222] = -4770145321866688281L;
        v.qsj[223] = -6891169856359115102L;
        v.qsj[224] = -745118525800532132L;
        v.qsj[225] = -501991311961902913L;
        v.qsj[226] = 1224426595072737274L;
        v.qsj[227] = 8428362932047431805L;
        v.qsj[228] = 523564962736811802L;
        v.qsj[229] = -8420648675735205853L;
        v.qsj[230] = -5454964949698339600L;
        v.qsj[231] = 2165106759842143769L;
        v.qsj[232] = -7521019406017623723L;
        v.qsj[233] = -2259550135257279425L;
        v.qsj[234] = 4031770081121546347L;
        v.qsj[235] = -3227205074992868745L;
        v.qsj[236] = 3467788020870300173L;
        v.qsj[237] = 1442605292761005928L;
        v.qsj[238] = -6510828276277986023L;
        v.qsj[239] = -5505658557240928763L;
        v.qsj[240] = -4267546368118923383L;
        v.qsj[241] = 4359129331388689137L;
        v.qsj[242] = 7460935772584783541L;
        v.qsj[243] = -8752394381181522686L;
        v.qsj[244] = 3353748222498981098L;
        v.qsj[245] = 2490653440335848057L;
        v.qsj[246] = -7565441807019563254L;
        v.qsj[247] = -4901425039137011727L;
        v.qsj[248] = 8285504691731106105L;
        v.qsj[249] = -7961427117778284879L;
        v.qsj[250] = -8334864241960083779L;
        v.qsj[251] = -2818415541561807240L;
        v.qsj[252] = -5470951557473225152L;
        v.qsj[253] = 6855151604190217181L;
        v.qsj[254] = 3393390546607689726L;
        v.qsj[255] = -6483751934040776879L;
        v.qsj[256] = 129417526991738911L;
        v.qsj[257] = 3343577649769726644L;
        v.qsj[258] = -5242082694440841825L;
        v.qsj[259] = 1775195112245535939L;
        v.qsj[260] = 8659226680237175073L;
        v.qsj[261] = -6821846847961284418L;
        v.qsj[262] = 9013920640171134939L;
        v.qsj[263] = -5243039984037222072L;
        v.qsj[264] = 3229211668622799300L;
        v.qsj[265] = 8173979276308941748L;
        v.qsj[266] = 1997282589903082300L;
        v.qsj[267] = 2900378676005178863L;
        v.qsj[268] = 7841719266009716486L;
        v.qsj[269] = 6773514293996387798L;
        v.qsj[270] = -4535235578919306734L;
        v.qsj[271] = 5840308261832044687L;
        v.qsj[272] = 1648544385907527685L;
        v.qsj[273] = -267309305613502155L;
        v.qsj[274] = 8689525725515928195L;
        v.qsj[275] = 7493133785021718727L;
        v.qsj[276] = -2164478876127862701L;
        v.qsj[277] = -6709526222225073400L;
        v.qsj[278] = 1770020413627182847L;
        v.qsj[279] = 1041331369787317534L;
        v.qsj[280] = -2032630706772708674L;
        v.qsj[281] = -2974846276343752912L;
        v.qsj[282] = 3509775405507883578L;
        v.qsj[283] = -715817595254629613L;
        v.qsj[284] = 821755674850584022L;
        v.qsj[285] = -5398976280689593077L;
        v.qsj[286] = -1920454118149100437L;
        v.qsj[287] = -2973376708412876810L;
        v.qsj[288] = -5898269000266488552L;
        v.qsj[289] = -7831598242413340203L;
        v.qsj[290] = 7149127507767613813L;
        v.qsj[291] = 8451800491555085718L;
        v.qsj[292] = -3129250591381699594L;
        v.qsj[293] = -6926459245879882140L;
        v.qsj[294] = -3206471361923623279L;
        v.qsj[295] = -5883962490212708994L;
        v.qsj[296] = -2340549500502772146L;
        v.qsj[297] = -9043143209161102663L;
        v.qsj[298] = 391266537093914448L;
        v.qsj[299] = 707041785515229089L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$tabComplete$2(String var0, String var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("slq", qss(int ), (int)360)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == v.qqi("slr", qqf(int ), (int)640)) break;
            v0 /* !! */  = (long)v.qqi("sls", qqf(int ), (int)641);
        }
        var4_2 = v.c;
        v1 /* !! */  = v.ax;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(v.qqi("slu", qss(int ), (int)362) - v.qqi("slt", qss(int ), (int)361));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2121201296: {
                    break block22;
                }
                case -2088314599: {
                    continue block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = v.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("slv", qss(int ), (int)363)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == v.qqi("slw", qqf(int ), (int)642)) break;
            v2 /* !! */  = (long)v.qqi("slx", qqf(int ), (int)643);
        }
        var2_4 = v.a;
        if (var4_2) {
            throw null;
            return (boolean)v.qqi("sly", qqf(int ), (int)644);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v3 /* !! */  = v.ax;
                if (true) ** GOTO lbl37
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - v.qqi("slz", qss(int ), (int)364));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2121201296: {
                            break block25;
                        }
                        case 828043584: {
                            v4 = v.qqi("sma", qss(int ), (int)365);
                            continue block25;
                        }
                        case 1338232153: {
                            v4 = v.qqi("smb", qss(int ), (int)366);
                            continue block25;
                        }
                        case 1433137841: {
                            v4 = v.qqi("smc", qss(int ), (int)367);
                            continue block25;
                        }
                    }
                    break;
                }
                v5 /* !! */  = v.ax;
                if (true) ** GOTO lbl53
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - v.qqi("smd", qss(int ), (int)368));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2121201296: {
                            break block26;
                        }
                        case -629459241: {
                            v6 = v.qqi("sme", qss(int ), (int)369);
                            continue block26;
                        }
                        case 403362212: {
                            v6 = v.qqi("smf", qss(int ), (int)370);
                            continue block26;
                        }
                    }
                    break;
                }
                v7 = var1_1.toLowerCase(Locale.ROOT);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("smg", qss(int ), (int)371)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == v.qqi("smh", qqf(int ), (int)645)) break;
                    v8 /* !! */  = (long)v.qqi("smi", qqf(int ), (int)646);
                }
                return v7.startsWith(var0);
            }
            case 0: {
                var3_3 /* !! */  = (int)v.qqi("smj", qqf(int ), (int)647);
                if (!var4_2) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)v.qqi("smk", qqf(int ), (int)648);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)v.qqi("sml", qqf(int ), (int)649);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)v.qqi("smm", qqf(int ), (int)650);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void sux() {
        v.qqh[600] = -1026538096;
        v.qqh[601] = 161561338;
        v.qqh[602] = -1360196738;
        v.qqh[603] = 1382808624;
        v.qqh[604] = -1385173183;
        v.qqh[605] = -1571348552;
        v.qqh[606] = -1159157939;
        v.qqh[607] = -965812696;
        v.qqh[608] = -1967795975;
        v.qqh[609] = 1451829006;
        v.qqh[610] = 972527002;
        v.qqh[611] = -177684674;
        v.qqh[612] = 1704813795;
        v.qqh[613] = -723381145;
        v.qqh[614] = 817219127;
        v.qqh[615] = 1318449799;
        v.qqh[616] = 428099931;
        v.qqh[617] = 240670041;
        v.qqh[618] = 619989400;
        v.qqh[619] = -374947790;
        v.qqh[620] = -1556725359;
        v.qqh[621] = -1994600212;
        v.qqh[622] = 1586030461;
        v.qqh[623] = 582411389;
        v.qqh[624] = -424933104;
        v.qqh[625] = -907490588;
        v.qqh[626] = -16374613;
        v.qqh[627] = 256954841;
        v.qqh[628] = 737654996;
        v.qqh[629] = 1008599443;
        v.qqh[630] = -484193655;
        v.qqh[631] = 1032654429;
        v.qqh[632] = -485986140;
        v.qqh[633] = -1906813778;
        v.qqh[634] = -1432881150;
        v.qqh[635] = 214293371;
        v.qqh[636] = -1910241650;
        v.qqh[637] = 251839822;
        v.qqh[638] = -1868057372;
        v.qqh[639] = 649435081;
        v.qqh[640] = 1288851570;
        v.qqh[641] = -564737366;
        v.qqh[642] = -2113399364;
        v.qqh[643] = -437054477;
        v.qqh[644] = -608286843;
        v.qqh[645] = 202848198;
        v.qqh[646] = 1808379135;
        v.qqh[647] = 904005441;
        v.qqh[648] = -929627752;
        v.qqh[649] = -1919817701;
        v.qqh[650] = 760287428;
        v.qqh[651] = -691456865;
        v.qqh[652] = -995764118;
        v.qqh[653] = 1687691525;
        v.qqh[654] = 939275498;
        v.qqh[655] = 1375303640;
        v.qqh[656] = 166569211;
        v.qqh[657] = 300265847;
        v.qqh[658] = -1382198375;
        v.qqh[659] = -124857062;
        v.qqh[660] = -1155877306;
        v.qqh[661] = 814903928;
        v.qqh[662] = 1714762123;
        v.qqh[663] = 55582011;
        v.qqh[664] = -1401110365;
        v.qqh[665] = -1034180827;
        v.qqh[666] = 1686256474;
        v.qqh[667] = 662857210;
        v.qqh[668] = -964726122;
        v.qqh[669] = -1461057280;
        v.qqh[670] = -1220251824;
        v.qqh[671] = 1681744663;
        v.qqh[672] = -572411263;
        v.qqh[673] = 635341496;
        v.qqh[674] = 1725959246;
        v.qqh[675] = -632301229;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean overridesDragonFlyMovement() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("sie", qss(int ), (int)327)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == v.qqi("sif", qqf(int ), (int)583)) break;
            v0 /* !! */  = (long)v.qqi("sig", qqf(int ), (int)584);
        }
        var2 = v.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("sih", qss(int ), (int)328)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == v.qqi("sii", qqf(int ), (int)585)) break;
            v1 /* !! */  = (long)v.qqi("sij", qqf(int ), (int)586);
        }
        var1_1 /* !! */  = v.b;
        v2 /* !! */  = v.ax;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - v.qqi("sik", qss(int ), (int)329));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2121201296: {
                    break block14;
                }
                case -2048341028: {
                    v3 = v.qqi("sil", qss(int ), (int)330);
                    continue block14;
                }
                case -1779054621: {
                    v3 = v.qqi("sim", qss(int ), (int)331);
                    continue block14;
                }
                case 47577323: {
                    v3 = v.qqi("sin", qss(int ), (int)332);
                    continue block14;
                }
            }
            break;
        }
        var0_2 = v.a;
        if (var2) {
            throw null;
lbl34:
            // 2 sources

            return (boolean)v.qqi("sio", qqf(int ), (int)587);
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("sip", qss(int ), (int)333)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == v.qqi("siq", qqf(int ), (int)588)) break;
                    v4 /* !! */  = (long)v.qqi("sir", qqf(int ), (int)589);
                }
                return v.dragonFlyMovementOverride;
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)v.qqi("sis", qqf(int ), (int)590);
                } while (!var2);
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)v.qqi("sit", qqf(int ), (int)591);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)v.qqi("siu", qqf(int ), (int)592);
                if (!var2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)v.qqi("siv", qqf(int ), (int)593);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ double qsi(int n2) {
        return Double.longBitsToDouble(qsj[n2] ^ qsk[n2]);
    }

    private static /* synthetic */ void sor() {
        v.qqh[500] = 1454939837;
        v.qqh[501] = -385827919;
        v.qqh[502] = 1149155170;
        v.qqh[503] = -117317470;
        v.qqh[504] = -772110598;
        v.qqh[505] = 271447202;
        v.qqh[506] = -493933323;
        v.qqh[507] = -646467356;
        v.qqh[508] = 1986607184;
        v.qqh[509] = 224362688;
        v.qqh[510] = 112382805;
        v.qqh[511] = 2130100062;
        v.qqh[512] = 1696295606;
        v.qqh[513] = 2090391192;
        v.qqh[514] = -1085391739;
        v.qqh[515] = -2023119629;
        v.qqh[516] = 190096080;
        v.qqh[517] = -1813707051;
        v.qqh[518] = 333235947;
        v.qqh[519] = 439770989;
        v.qqh[520] = -366606935;
        v.qqh[521] = -487286814;
        v.qqh[522] = 564951583;
        v.qqh[523] = 1477562307;
        v.qqh[524] = -1784925281;
        v.qqh[525] = -1656031277;
        v.qqh[526] = 1002069254;
        v.qqh[527] = -1818863458;
        v.qqh[528] = -1191485794;
        v.qqh[529] = -206133115;
        v.qqh[530] = -474638049;
        v.qqh[531] = -1832427239;
        v.qqh[532] = -1477832816;
        v.qqh[533] = -270693885;
        v.qqh[534] = -1681850596;
        v.qqh[535] = 1275314120;
        v.qqh[536] = -1115795692;
        v.qqh[537] = 1566107435;
        v.qqh[538] = 972013748;
        v.qqh[539] = -1467657732;
        v.qqh[540] = 958932333;
        v.qqh[541] = 359868561;
        v.qqh[542] = 955478967;
        v.qqh[543] = 1672233796;
        v.qqh[544] = 1504683452;
        v.qqh[545] = 659771810;
        v.qqh[546] = 2050929250;
        v.qqh[547] = 1966655797;
        v.qqh[548] = -2027161487;
        v.qqh[549] = -461329396;
        v.qqh[550] = -1639912204;
        v.qqh[551] = -310487186;
        v.qqh[552] = -2126767873;
        v.qqh[553] = -2090121891;
        v.qqh[554] = -459980672;
        v.qqh[555] = 1640468438;
        v.qqh[556] = -970900785;
        v.qqh[557] = 1699488490;
        v.qqh[558] = -381196539;
        v.qqh[559] = 483554087;
        v.qqh[560] = -52033162;
        v.qqh[561] = -730181647;
        v.qqh[562] = 1525617851;
        v.qqh[563] = 532714928;
        v.qqh[564] = 1351833263;
        v.qqh[565] = -2091951018;
        v.qqh[566] = 1091925615;
        v.qqh[567] = -486023319;
        v.qqh[568] = 2032369828;
        v.qqh[569] = 2100325029;
        v.qqh[570] = -155325650;
        v.qqh[571] = 1049902389;
        v.qqh[572] = 1904850179;
        v.qqh[573] = -1852225774;
        v.qqh[574] = 1228155957;
        v.qqh[575] = -2130305034;
        v.qqh[576] = -1627800587;
        v.qqh[577] = 1169760714;
        v.qqh[578] = -727418884;
        v.qqh[579] = 2047267013;
        v.qqh[580] = 301030269;
        v.qqh[581] = 404710530;
        v.qqh[582] = -436687115;
        v.qqh[583] = -387006159;
        v.qqh[584] = -1222064090;
        v.qqh[585] = -1604449767;
        v.qqh[586] = -1311087916;
        v.qqh[587] = 482907125;
        v.qqh[588] = 1029599048;
        v.qqh[589] = -1692612316;
        v.qqh[590] = -1958370047;
        v.qqh[591] = -1202318138;
        v.qqh[592] = -1754620019;
        v.qqh[593] = -1377800632;
        v.qqh[594] = -171877491;
        v.qqh[595] = 994068368;
        v.qqh[596] = 1685422108;
        v.qqh[597] = 1022414492;
        v.qqh[598] = -1002340577;
        v.qqh[599] = -1141491880;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String lambda$tabComplete$1(class_742 class_7422) {
        boolean bl2;
        Object object = ax;
        block9: while (true) {
            switch ((int)object) {
                case -2121201296: {
                    break block9;
                }
                case -1605944015: {
                    object = v.qqi("smo", qss(int ), (int)373) - v.qqi("smn", qss(int ), (int)372);
                    continue block9;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ax - v.qqi("smp", qss(int ), (int)374)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == v.qqi("smq", qqf(int ), (int)651)) break;
            object2 = v.qqi("smr", qqf(int ), (int)652);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ax - v.qqi("sms", qss(int ), (int)375)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == v.qqi("smt", qqf(int ), (int)653)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = v.qqi("smu", qqf(int ), (int)654);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = ax;
        boolean bl4 = true;
        block12: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - v.qqi("smv", qss(int ), (int)376);
            }
            switch ((int)object4) {
                case -2121201296: {
                    break block12;
                }
                case 647058242: {
                    callSite = v.qqi("smw", qss(int ), (int)377);
                    continue block12;
                }
                case 1950568836: {
                    callSite = v.qqi("smx", qss(int ), (int)378);
                    continue block12;
                }
            }
            break;
        }
        GameProfile gameProfile = class_7422.method_7334();
        while (true) {
            long l4;
            Object object5;
            if ((object5 = (l4 = ax - v.qqi("smy", qss(int ), (int)379)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object5 == v.qqi("smz", qqf(int ), (int)655)) {
                return gameProfile.name();
            }
            object5 = v.qqi("sna", qqf(int ), (int)656);
        }
    }

    private static /* synthetic */ void svf() {
        v.qsk[300] = 6124843251287744697L;
        v.qsk[301] = -1960222419784088160L;
        v.qsk[302] = -4471045097083839906L;
        v.qsk[303] = -2153547414095276365L;
        v.qsk[304] = -4730181197652476088L;
        v.qsk[305] = -7579122911880918306L;
        v.qsk[306] = 4615733612877391118L;
        v.qsk[307] = -2912753984228399828L;
        v.qsk[308] = -1470729233309666856L;
        v.qsk[309] = 937747224451245856L;
        v.qsk[310] = 3591488785990659270L;
        v.qsk[311] = -7407790340274468735L;
        v.qsk[312] = 4546389085650245288L;
        v.qsk[313] = 7813377380174407082L;
        v.qsk[314] = -4054022339166197247L;
        v.qsk[315] = 7454887228042284954L;
        v.qsk[316] = 7731772986963297755L;
        v.qsk[317] = 6666752522325185807L;
        v.qsk[318] = -5208791422691736478L;
        v.qsk[319] = -8464898460742827561L;
        v.qsk[320] = -5110341812775501653L;
        v.qsk[321] = -708429410632397877L;
        v.qsk[322] = -2040846712149295701L;
        v.qsk[323] = 4578803201959492916L;
        v.qsk[324] = -9150077682062130975L;
        v.qsk[325] = 2039034911295510571L;
        v.qsk[326] = 4093010432230247565L;
        v.qsk[327] = -4824701192774505139L;
        v.qsk[328] = -5018263617222695849L;
        v.qsk[329] = -2027724192108980318L;
        v.qsk[330] = 729589765862276990L;
        v.qsk[331] = 2480883023083906657L;
        v.qsk[332] = 485760766999647245L;
        v.qsk[333] = -1993114138621822913L;
        v.qsk[334] = -3018271262611128558L;
        v.qsk[335] = 4642033351373179449L;
        v.qsk[336] = -1638027469077395094L;
        v.qsk[337] = -837294083697042163L;
        v.qsk[338] = -7957003839188843142L;
        v.qsk[339] = 7513499005591048565L;
        v.qsk[340] = 8182419848986586707L;
        v.qsk[341] = 4574297829488484455L;
        v.qsk[342] = -1148757440040833355L;
        v.qsk[343] = 5115425405585935101L;
        v.qsk[344] = -4295256496828114232L;
        v.qsk[345] = -7202278111255516258L;
        v.qsk[346] = -2681343173465633040L;
        v.qsk[347] = 4686982799398425588L;
        v.qsk[348] = 4438109765789359332L;
        v.qsk[349] = -9671175727839643L;
        v.qsk[350] = 1670771521336784468L;
        v.qsk[351] = 4469351623510141486L;
        v.qsk[352] = -551256272593373495L;
        v.qsk[353] = -8236847031622349641L;
        v.qsk[354] = 8143805275617596937L;
        v.qsk[355] = 3632713069210309240L;
        v.qsk[356] = 2502188685601265575L;
        v.qsk[357] = -5667961383322051919L;
        v.qsk[358] = -5126707793908950104L;
        v.qsk[359] = 216444780187968452L;
        v.qsk[360] = -484048127907473828L;
        v.qsk[361] = 1289479153102316947L;
        v.qsk[362] = -6953101223232001312L;
        v.qsk[363] = -1278961028045639765L;
        v.qsk[364] = -3129058364031862079L;
        v.qsk[365] = -4891152766860669825L;
        v.qsk[366] = 6983871838549013488L;
        v.qsk[367] = -6864382384126677704L;
        v.qsk[368] = -2174242984072102177L;
        v.qsk[369] = -1944755936774190175L;
        v.qsk[370] = 1543268887663422389L;
        v.qsk[371] = 8580013537908118461L;
        v.qsk[372] = -8047637284861390217L;
        v.qsk[373] = -805733692703492394L;
        v.qsk[374] = 6584824648362251600L;
        v.qsk[375] = -8906036032495546756L;
        v.qsk[376] = -2812838921069485398L;
        v.qsk[377] = 1605637515937986570L;
        v.qsk[378] = -8068245098764485354L;
        v.qsk[379] = 7055582525420760345L;
        v.qsk[380] = -2951772710504896239L;
        v.qsk[381] = 9043153558776609824L;
        v.qsk[382] = 2084616962326468412L;
        v.qsk[383] = 7026246124414770389L;
        v.qsk[384] = 7703936115648037400L;
        v.qsk[385] = 8053434740734705214L;
        v.qsk[386] = 5273283753837475040L;
        v.qsk[387] = -2859237469180568258L;
        v.qsk[388] = -4742484676653779877L;
        v.qsk[389] = -1122277784564274282L;
        v.qsk[390] = 1615849400717817663L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void navigateToMarker(double var1_1, double var3_2) {
        block133: {
            block132: {
                block131: {
                    block130: {
                        var17_3 = v.c;
                        var16_4 /* !! */  = v.b;
                        var15_5 = v.a;
                        if (var17_3) {
                            throw null;
lbl6:
                            // 38 sources

                            return;
                        }
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var5_6 = var1_1 - v.mc.field_1724.method_23317();
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var7_7 = var3_2 - v.mc.field_1724.method_23321();
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var9_8 = Math.hypot(var5_6, var7_7);
                        if (var15_5 || var15_5) ** GOTO lbl6
                        var11_9 = this.isDragonFlyActive();
                        if (var15_5 || var15_5) ** GOTO lbl6
                        v.dragonFlyMovementOverride = var11_9;
                        if (var15_5 || var15_5) ** GOTO lbl6
                        if (v.mc.field_1724.method_31549().field_7479) break block130;
                        if (var15_5) ** GOTO lbl6
                        if (!var11_9) break block131;
                        if (var15_5) ** GOTO lbl6
                    }
                    if (var15_5 || var15_5) ** GOTO lbl6
                    v0 = v.qqi("sdx", qqf(int ), (int)491);
                    if (var17_3) {
                        throw null;
                    }
                    break block132;
                }
                if (var15_5 || var15_5) ** GOTO lbl6
                v0 = var12_10 = v.qqi("sdy", qqf(int ), (int)492);
            }
            if (var15_5 || var15_5) ** GOTO lbl6
            if (var12_10 != false) break block133;
            if (var15_5) ** GOTO lbl6
            if (!(var9_8 <= v.qqi("sdz", qsi(int ), (int)308))) ** GOTO lbl68
            if (var15_5) ** GOTO lbl6
        }
        if (var15_5) ** GOTO lbl6
        if (var16_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_5) ** GOTO lbl6
                this.stopNavigation();
                if (var15_5 || var15_5) ** GOTO lbl6
                if (var12_10 == false) ** GOTO lbl52
                if (var15_5) ** GOTO lbl6
                v1 = v.qqi("sea", qsi(int ), (int)309);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl54
lbl52:
                // 1 sources

                if (var15_5 || var15_5) ** GOTO lbl6
                v1 = v.qqi("seb", qsi(int ), (int)310);
lbl54:
                // 2 sources

                if (var12_10 != false) {
                    v2 = v.qqi("sec", qsi(int ), (int)311);
                    if (var17_3) {
                        throw null;
                    }
                } else {
                    v2 = v.qqi("sed", qsi(int ), (int)312);
                }
                var13_11 = Math.min((double)v1, var9_8 * v2);
                if (var15_5 || var15_5) ** GOTO lbl6
                if (!(var9_8 > v.qqi("see", qsi(int ), (int)313))) ** GOTO lbl66
                if (var15_5 || var15_5) ** GOTO lbl6
                v.mc.field_1724.method_18800(var5_6 / var9_8 * var13_11, v.mc.field_1724.method_18798().field_1351, var7_7 / var9_8 * var13_11);
                if (var15_5) ** GOTO lbl6
lbl66:
                // 2 sources

                if (var15_5 || var15_5) ** GOTO lbl6
                return;
            }
lbl68:
            // 1 sources

            if (var15_5 || var15_5) ** GOTO lbl6
            var13_12 = (int)Math.floor(var1_1);
            if (var15_5 || var15_5) ** GOTO lbl6
            var14_13 = (int)Math.floor(var3_2);
            if (var15_5 || var15_5) ** GOTO lbl6
            if (!this.walkingToMarker) ** GOTO lbl81
            if (var15_5) ** GOTO lbl6
            if (var13_12 != this.pathX) ** GOTO lbl81
            if (var15_5) ** GOTO lbl6
            if (var14_13 != this.pathZ) ** GOTO lbl81
            if (var15_5) ** GOTO lbl6
            if (na.isPathing()) ** GOTO lbl95
            if (var15_5) ** GOTO lbl6
lbl81:
            // 4 sources

            if (var15_5 || var15_5) ** GOTO lbl6
            na.applySettings((boolean)v.qqi("sef", qqf(int ), (int)493), (boolean)v.qqi("seg", qqf(int ), (int)494));
            if (var15_5 || var15_5) ** GOTO lbl6
            this.walkingToMarker = na.goTo(new class_2338(var13_12, v.mc.field_1724.method_31478(), var14_13), (int)v.qqi("seh", qqf(int ), (int)495));
            if (var15_5 || var15_5) ** GOTO lbl6
            if (this.walkingToMarker) ** GOTO lbl90
            if (var15_5 || var15_5) ** GOTO lbl6
            na.applySettings((boolean)v.qqi("sei", qqf(int ), (int)496), (boolean)v.qqi("sej", qqf(int ), (int)497));
            if (var15_5) ** GOTO lbl6
lbl90:
            // 2 sources

            if (var15_5 || var15_5) ** GOTO lbl6
            this.pathX = var13_12;
            if (var15_5 || var15_5) ** GOTO lbl6
            this.pathZ = var14_13;
            if (var15_5) ** GOTO lbl6
lbl95:
            // 2 sources

            if (!var15_5 && !var15_5) ** break;
            ** continue;
            return;
lbl98:
            // 2 sources

            case 0: {
                var16_4 /* !! */  = (int)v.qqi("sek", qqf(int ), (int)498);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl103:
            // 2 sources

            case 1: {
                var16_4 /* !! */  = (int)v.qqi("sel", qqf(int ), (int)499);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl108:
            // 3 sources

            case 2: {
                var16_4 /* !! */  = (int)v.qqi("sem", qqf(int ), (int)500);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl279
            }
lbl113:
            // 3 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_4 /* !! */  = (int)v.qqi("sen", qqf(int ), (int)501);
                    if (var17_3) {
                        throw null;
                    }
                    ** GOTO lbl348
                    break;
                }
            }
            case 4: {
                var16_4 /* !! */  = (int)v.qqi("seo", qqf(int ), (int)502);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl288
            }
            case 5: {
                var16_4 /* !! */  = (int)v.qqi("sep", qqf(int ), (int)503);
                if (!var17_3) break;
                throw null;
            }
            case 6: {
                var16_4 /* !! */  = (int)v.qqi("seq", qqf(int ), (int)504);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl133:
            // 2 sources

            case 7: {
                var16_4 /* !! */  = (int)v.qqi("ser", qqf(int ), (int)505);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl138:
            // 3 sources

            case 8: {
                var16_4 /* !! */  = (int)v.qqi("ses", qqf(int ), (int)506);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 9: {
                var16_4 /* !! */  = (int)v.qqi("set", qqf(int ), (int)507);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl148:
            // 4 sources

            case 10: {
                var16_4 /* !! */  = (int)v.qqi("seu", qqf(int ), (int)508);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl153:
            // 5 sources

            case 11: {
                var16_4 /* !! */  = (int)v.qqi("sev", qqf(int ), (int)509);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl352
            }
lbl158:
            // 4 sources

            case 12: {
                var16_4 /* !! */  = (int)v.qqi("sew", qqf(int ), (int)510);
                if (!var17_3) ** GOTO lbl148
                throw null;
            }
lbl162:
            // 2 sources

            case 13: {
                var16_4 /* !! */  = (int)v.qqi("sex", qqf(int ), (int)511);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl262
            }
lbl167:
            // 2 sources

            case 14: {
                var16_4 /* !! */  = (int)v.qqi("sey", qqf(int ), (int)512);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl172:
            // 2 sources

            case 15: {
                var16_4 /* !! */  = (int)v.qqi("sez", qqf(int ), (int)513);
                if (!var17_3) ** GOTO lbl158
                throw null;
            }
lbl176:
            // 2 sources

            case 16: {
                var16_4 /* !! */  = (int)v.qqi("sfa", qqf(int ), (int)514);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl181:
            // 2 sources

            case 17: {
                var16_4 /* !! */  = (int)v.qqi("sfb", qqf(int ), (int)515);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl320
            }
            case 18: {
                var16_4 /* !! */  = (int)v.qqi("sfc", qqf(int ), (int)516);
                if (!var17_3) ** GOTO lbl98
                throw null;
            }
            case 19: {
                var16_4 /* !! */  = (int)v.qqi("sfd", qqf(int ), (int)517);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 20: {
                var16_4 /* !! */  = (int)v.qqi("sfe", qqf(int ), (int)518);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl386
            }
            case 21: {
                var16_4 /* !! */  = (int)v.qqi("sff", qqf(int ), (int)519);
                if (!var17_3) ** GOTO lbl158
                throw null;
            }
            case 22: {
                var16_4 /* !! */  = (int)v.qqi("sfg", qqf(int ), (int)520);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl209:
            // 2 sources

            case 23: {
                var16_4 /* !! */  = (int)v.qqi("sfh", qqf(int ), (int)521);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl214:
            // 2 sources

            case 24: {
                var16_4 /* !! */  = (int)v.qqi("sfi", qqf(int ), (int)522);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl381
            }
lbl219:
            // 2 sources

            case 25: {
                var16_4 /* !! */  = (int)v.qqi("sfj", qqf(int ), (int)523);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl390
            }
            case 26: {
                var16_4 /* !! */  = (int)v.qqi("sfk", qqf(int ), (int)524);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl229:
            // 2 sources

            case 27: {
                var16_4 /* !! */  = (int)v.qqi("sfl", qqf(int ), (int)525);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 28: {
                var16_4 /* !! */  = (int)v.qqi("sfm", qqf(int ), (int)526);
                if (!var17_3) ** GOTO lbl133
                throw null;
            }
lbl238:
            // 2 sources

            case 29: {
                var16_4 /* !! */  = (int)v.qqi("sfn", qqf(int ), (int)527);
                if (!var17_3) ** GOTO lbl153
                throw null;
            }
            case 30: {
                var16_4 /* !! */  = (int)v.qqi("sfo", qqf(int ), (int)528);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 31: {
                var16_4 /* !! */  = (int)v.qqi("sfp", qqf(int ), (int)529);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl352
            }
            case 32: {
                var16_4 /* !! */  = (int)v.qqi("sfq", qqf(int ), (int)530);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl386
            }
            case 33: {
                var16_4 /* !! */  = (int)v.qqi("sfr", qqf(int ), (int)531);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl377
            }
lbl262:
            // 5 sources

            case 34: {
                var16_4 /* !! */  = (int)v.qqi("sfs", qqf(int ), (int)532);
                if (!var17_3) ** GOTO lbl162
                throw null;
            }
lbl266:
            // 2 sources

            case 35: {
                var16_4 /* !! */  = (int)v.qqi("sft", qqf(int ), (int)533);
                if (!var17_3) ** GOTO lbl148
                throw null;
            }
            case 36: {
                var16_4 /* !! */  = (int)v.qqi("sfu", qqf(int ), (int)534);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl275:
            // 2 sources

            case 37: {
                var16_4 /* !! */  = (int)v.qqi("sfv", qqf(int ), (int)535);
                if (!var17_3) ** GOTO lbl158
                throw null;
            }
lbl279:
            // 2 sources

            case 38: {
                var16_4 /* !! */  = (int)v.qqi("sfw", qqf(int ), (int)536);
                if (!var17_3) ** GOTO lbl108
                throw null;
            }
lbl283:
            // 2 sources

            case 39: {
                var16_4 /* !! */  = (int)v.qqi("sfx", qqf(int ), (int)537);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl316
            }
lbl288:
            // 3 sources

            case 40: {
                var16_4 /* !! */  = (int)v.qqi("sfy", qqf(int ), (int)538);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl293:
            // 2 sources

            case 41: {
                var16_4 /* !! */  = (int)v.qqi("sfz", qqf(int ), (int)539);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl381
            }
            case 42: {
                var16_4 /* !! */  = (int)v.qqi("sga", qqf(int ), (int)540);
                if (!var17_3) ** GOTO lbl113
                throw null;
            }
            case 43: {
                var16_4 /* !! */  = (int)v.qqi("sgb", qqf(int ), (int)541);
                if (!var17_3) ** GOTO lbl138
                throw null;
            }
lbl306:
            // 2 sources

            case 44: {
                var16_4 /* !! */  = (int)v.qqi("sgc", qqf(int ), (int)542);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl373
            }
            case 45: {
                var16_4 /* !! */  = (int)v.qqi("sgd", qqf(int ), (int)543);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl316:
            // 4 sources

            case 46: {
                var16_4 /* !! */  = (int)v.qqi("sge", qqf(int ), (int)544);
                if (!var17_3) ** GOTO lbl153
                throw null;
            }
lbl320:
            // 2 sources

            case 47: {
                var16_4 /* !! */  = (int)v.qqi("sgf", qqf(int ), (int)545);
                if (!var17_3) ** GOTO lbl153
                throw null;
            }
lbl324:
            // 3 sources

            case 48: {
                var16_4 /* !! */  = (int)v.qqi("sgg", qqf(int ), (int)546);
                if (!var17_3) ** GOTO lbl293
                throw null;
            }
lbl328:
            // 2 sources

            case 49: {
                var16_4 /* !! */  = (int)v.qqi("sgh", qqf(int ), (int)547);
                if (!var17_3) ** GOTO lbl288
                throw null;
            }
            case 50: {
                var16_4 /* !! */  = (int)v.qqi("sgi", qqf(int ), (int)548);
                if (!var17_3) ** GOTO lbl167
                throw null;
            }
            case 51: {
                var16_4 /* !! */  = (int)v.qqi("sgj", qqf(int ), (int)549);
                if (!var17_3) ** GOTO lbl238
                throw null;
            }
            case 52: {
                var16_4 /* !! */  = (int)v.qqi("sgk", qqf(int ), (int)550);
                if (!var17_3) ** GOTO lbl113
                throw null;
            }
            case 53: {
                var16_4 /* !! */  = (int)v.qqi("sgl", qqf(int ), (int)551);
                if (!var17_3) ** GOTO lbl103
                throw null;
            }
lbl348:
            // 5 sources

            case 54: {
                var16_4 /* !! */  = (int)v.qqi("sgm", qqf(int ), (int)552);
                if (!var17_3) ** GOTO lbl153
                throw null;
            }
lbl352:
            // 3 sources

            case 55: {
                var16_4 /* !! */  = (int)v.qqi("sgn", qqf(int ), (int)553);
                if (!var17_3) ** GOTO lbl275
                throw null;
            }
            case 56: {
                var16_4 /* !! */  = (int)v.qqi("sgo", qqf(int ), (int)554);
                if (!var17_3) ** GOTO lbl219
                throw null;
            }
            case 57: {
                var16_4 /* !! */  = (int)v.qqi("sgp", qqf(int ), (int)555);
                if (!var17_3) ** GOTO lbl138
                throw null;
            }
            case 58: {
                var16_4 /* !! */  = (int)v.qqi("sgq", qqf(int ), (int)556);
                if (!var17_3) ** GOTO lbl214
                throw null;
            }
            case 59: {
                var16_4 /* !! */  = (int)v.qqi("sgr", qqf(int ), (int)557);
                if (var17_3) {
                    throw null;
                }
                ** GOTO lbl390
            }
lbl373:
            // 2 sources

            case 60: {
                var16_4 /* !! */  = (int)v.qqi("sgs", qqf(int ), (int)558);
                if (!var17_3) ** GOTO lbl262
                throw null;
            }
lbl377:
            // 2 sources

            case 61: {
                var16_4 /* !! */  = (int)v.qqi("sgt", qqf(int ), (int)559);
                if (!var17_3) ** GOTO lbl108
                throw null;
            }
lbl381:
            // 4 sources

            case 62: {
                do {
                    var16_4 /* !! */  = (int)v.qqi("sgu", qqf(int ), (int)560);
                } while (!var17_3);
                throw null;
            }
lbl386:
            // 3 sources

            case 63: {
                var16_4 /* !! */  = (int)v.qqi("sgv", qqf(int ), (int)561);
                if (!var17_3) ** GOTO lbl148
                throw null;
            }
lbl390:
            // 3 sources

            case 64: {
                var16_4 /* !! */  = (int)v.qqi("sgw", qqf(int ), (int)562);
                if (!var17_3) ** GOTO lbl266
                throw null;
            }
            case 65: 
        }
        var16_4 /* !! */  = (int)v.qqi("sgx", qqf(int ), (int)563);
        ** while (!var17_3)
lbl397:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1657 findPlayer(String var1_1) {
        block100: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("rgv", qss(int ), (int)119)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == v.qqi("rgw", qqf(int ), (int)304)) break;
                v0 /* !! */  = (long)v.qqi("rgx", qqf(int ), (int)305);
            }
            var6_2 = v.c;
            v1 /* !! */  = v.ax;
            if (true) ** GOTO lbl11
            block66: while (true) {
                v1 /* !! */  = (long)(v2 - v.qqi("rgy", qss(int ), (int)120));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -2121201296: {
                        break block66;
                    }
                    case 1508447241: {
                        v2 = v.qqi("rgz", qss(int ), (int)121);
                        continue block66;
                    }
                    case 1970322183: {
                        v2 = v.qqi("rha", qss(int ), (int)122);
                        continue block66;
                    }
                }
                break;
            }
            var5_3 /* !! */  = v.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("rhb", qss(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == v.qqi("rhc", qqf(int ), (int)306)) break;
                v3 /* !! */  = (long)v.qqi("rhd", qqf(int ), (int)307);
            }
            var4_4 = v.a;
            if (var6_2) {
                throw null;
lbl29:
                // 11 sources

                return null;
            }
            if (var4_4 || var4_4) ** GOTO lbl29
            v4 /* !! */  = v.ax;
            if (true) ** GOTO lbl36
            block69: while (true) {
                v4 /* !! */  = (long)(v5 - v.qqi("rhe", qss(int ), (int)124));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2121201296: {
                        break block69;
                    }
                    case -1942033835: {
                        v5 = v.qqi("rhf", qss(int ), (int)125);
                        continue block69;
                    }
                    case -827243891: {
                        v5 = v.qqi("rhg", qss(int ), (int)126);
                        continue block69;
                    }
                    case 672511941: {
                        v5 = v.qqi("rhh", qss(int ), (int)127);
                        continue block69;
                    }
                }
                break;
            }
            v6 /* !! */  = v.ax;
            if (true) ** GOTO lbl52
            block70: while (true) {
                v6 /* !! */  = (long)(v.qqi("rhj", qss(int ), (int)129) - v.qqi("rhi", qss(int ), (int)128));
lbl52:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2121201296: {
                        break block70;
                    }
                    case -604687264: {
                        continue block70;
                    }
                }
                break;
            }
            if (v.mc.field_1687 != null) break block100;
            if (var4_4 || var4_4) ** GOTO lbl29
            return null;
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        v7 /* !! */  = v.ax;
        if (true) ** GOTO lbl66
        block71: while (true) {
            v7 /* !! */  = (long)(v8 - v.qqi("rhk", qss(int ), (int)130));
lbl66:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2121201296: {
                    break block71;
                }
                case 69901376: {
                    v8 = v.qqi("rhl", qss(int ), (int)131);
                    continue block71;
                }
                case 374360792: {
                    v8 = v.qqi("rhm", qss(int ), (int)132);
                    continue block71;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("rhn", qss(int ), (int)133)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == v.qqi("rho", qqf(int ), (int)308)) break;
            v9 /* !! */  = (long)v.qqi("rhp", qqf(int ), (int)309);
        }
        v10 = v.mc.field_1687;
        v11 /* !! */  = v.ax;
        if (true) ** GOTO lbl85
        block73: while (true) {
            v11 /* !! */  = (long)(v12 - v.qqi("rhq", qss(int ), (int)134));
lbl85:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -2121201296: {
                    break block73;
                }
                case -1914761688: {
                    v12 = v.qqi("rhr", qss(int ), (int)135);
                    continue block73;
                }
                case 549526477: {
                    v12 = v.qqi("rhs", qss(int ), (int)136);
                    continue block73;
                }
                case 1158360708: {
                    v12 = v.qqi("rht", qss(int ), (int)137);
                    continue block73;
                }
            }
            break;
        }
        v13 = v10.method_18456();
        v14 /* !! */  = v.ax;
        if (true) ** GOTO lbl102
        block74: while (true) {
            v14 /* !! */  = (long)(v15 - v.qqi("rhu", qss(int ), (int)138));
lbl102:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -2121201296: {
                    break block74;
                }
                case -1780708415: {
                    v15 = v.qqi("rhv", qss(int ), (int)139);
                    continue block74;
                }
                case 56482360: {
                    v15 = v.qqi("rhw", qss(int ), (int)140);
                    continue block74;
                }
            }
            break;
        }
        var2_5 = v13.iterator();
        if (var4_4) ** GOTO lbl29
        block75: while (true) {
            if (var4_4 || var4_4) ** GOTO lbl29
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_3 = v.ax - v.qqi("rhx", qss(int ), (int)141)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == v.qqi("rhy", qqf(int ), (int)310)) break;
                v16 /* !! */  = (long)v.qqi("rhz", qqf(int ), (int)311);
            }
            if (!var2_5.hasNext()) ** GOTO lbl172
            if (var4_4) ** GOTO lbl29
            v17 /* !! */  = v.ax;
            if (true) ** GOTO lbl126
            block77: while (true) {
                v17 /* !! */  = (long)(v18 - v.qqi("ria", qss(int ), (int)142));
lbl126:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -2121201296: {
                        break block77;
                    }
                    case -1137344536: {
                        v18 = v.qqi("rib", qss(int ), (int)143);
                        continue block77;
                    }
                    case -825725107: {
                        v18 = v.qqi("ric", qss(int ), (int)144);
                        continue block77;
                    }
                }
                break;
            }
            var3_6 = (class_1657)var2_5.next();
            if (var4_4) ** GOTO lbl29
            if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_4) ** GOTO lbl29
                    while (true) {
                        if ((v19 /* !! */  = (cfr_temp_4 = v.ax - v.qqi("rid", qss(int ), (int)145)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v19 /* !! */  == v.qqi("rie", qqf(int ), (int)312)) break;
                        v19 /* !! */  = (long)v.qqi("rif", qqf(int ), (int)313);
                    }
                    v20 = var3_6.method_7334();
                    while (true) {
                        if ((v21 /* !! */  = (cfr_temp_5 = v.ax - v.qqi("rig", qss(int ), (int)146)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v21 /* !! */  == v.qqi("rih", qqf(int ), (int)314)) break;
                        v21 /* !! */  = (long)v.qqi("rii", qqf(int ), (int)315);
                    }
                    v22 = v20.name();
                    v23 /* !! */  = v.ax;
                    if (true) ** GOTO lbl157
                    block80: while (true) {
                        v23 /* !! */  = (long)(v24 - v.qqi("rij", qss(int ), (int)147));
lbl157:
                        // 2 sources

                        switch ((int)v23 /* !! */ ) {
                            case -2121201296: {
                                break block80;
                            }
                            case 1674345090: {
                                v24 = v.qqi("rik", qss(int ), (int)148);
                                continue block80;
                            }
                            case 2123963239: {
                                v24 = v.qqi("ril", qss(int ), (int)149);
                                continue block80;
                            }
                        }
                        break;
                    }
                    if (!v22.equalsIgnoreCase(var1_1)) ** GOTO lbl169
                    if (var4_4 || var4_4) ** GOTO lbl29
                    return var3_6;
lbl169:
                    // 1 sources

                    if (var4_4 || var4_4) ** GOTO lbl29
                    if (!var6_2) continue block75;
                    throw null;
                }
lbl172:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return null;
                case 0: {
                    do {
                        var5_3 /* !! */  = (int)v.qqi("riq", qqf(int ), (int)316);
                    } while (!var6_2);
                    throw null;
                }
lbl180:
                // 4 sources

                case 1: {
                    var5_3 /* !! */  = (int)v.qqi("rir", qqf(int ), (int)317);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
                case 2: {
                    var5_3 /* !! */  = (int)v.qqi("riu", qqf(int ), (int)318);
                    if (!var6_2) ** GOTO lbl180
                    throw null;
                }
lbl189:
                // 3 sources

                case 3: {
                    var5_3 /* !! */  = (int)v.qqi("riv", qqf(int ), (int)319);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl249
                }
                case 4: {
                    var5_3 /* !! */  = (int)v.qqi("riw", qqf(int ), (int)320);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl257
                }
lbl199:
                // 3 sources

                case 5: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var5_3 /* !! */  = (int)v.qqi("riy", qqf(int ), (int)321);
                        if (!var6_2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 6: {
                    var5_3 /* !! */  = (int)v.qqi("rja", qqf(int ), (int)322);
                    if (!var6_2) ** GOTO lbl180
                    throw null;
                }
lbl208:
                // 2 sources

                case 7: {
                    var5_3 /* !! */  = (int)v.qqi("rjc", qqf(int ), (int)323);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl228
                }
                case 8: {
                    var5_3 /* !! */  = (int)v.qqi("rjd", qqf(int ), (int)324);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl253
                }
                case 9: {
                    var5_3 /* !! */  = (int)v.qqi("rjf", qqf(int ), (int)325);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl253
                }
lbl223:
                // 2 sources

                case 10: {
                    var5_3 /* !! */  = (int)v.qqi("rjg", qqf(int ), (int)326);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl257
                }
lbl228:
                // 3 sources

                case 11: {
                    var5_3 /* !! */  = (int)v.qqi("rji", qqf(int ), (int)327);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl257
                }
                case 12: {
                    var5_3 /* !! */  = (int)v.qqi("rjj", qqf(int ), (int)328);
                    if (!var6_2) ** GOTO lbl189
                    throw null;
                }
                case 13: {
                    var5_3 /* !! */  = (int)v.qqi("rjk", qqf(int ), (int)329);
                    if (!var6_2) ** GOTO lbl228
                    throw null;
                }
                case 14: {
                    var5_3 /* !! */  = (int)v.qqi("rjl", qqf(int ), (int)330);
                    if (!var6_2) ** GOTO lbl223
                    throw null;
                }
                case 15: {
                    var5_3 /* !! */  = (int)v.qqi("rjm", qqf(int ), (int)331);
                    if (!var6_2) ** GOTO lbl189
                    throw null;
                }
lbl249:
                // 3 sources

                case 16: {
                    var5_3 /* !! */  = (int)v.qqi("rjn", qqf(int ), (int)332);
                    if (!var6_2) ** GOTO lbl208
                    throw null;
                }
lbl253:
                // 3 sources

                case 17: {
                    var5_3 /* !! */  = (int)v.qqi("rjo", qqf(int ), (int)333);
                    if (!var6_2) ** GOTO lbl199
                    throw null;
                }
lbl257:
                // 4 sources

                case 18: {
                    var5_3 /* !! */  = (int)v.qqi("rjp", qqf(int ), (int)334);
                    if (!var6_2) ** GOTO lbl180
                    throw null;
                }
                case 19: {
                    var5_3 /* !! */  = (int)v.qqi("rjq", qqf(int ), (int)335);
                    if (!var6_2) ** GOTO lbl249
                    throw null;
                }
                case 20: {
                    do {
                        var5_3 /* !! */  = (int)v.qqi("rjr", qqf(int ), (int)336);
                    } while (!var6_2);
                    throw null;
                }
                case 21: 
            }
            break;
        }
        var5_3 /* !! */  = (int)v.qqi("rjs", qqf(int ), (int)337);
        ** while (!var6_2)
lbl273:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void usage() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ax - v.qqi("skq", qss(int ), (int)352)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == v.qqi("skr", qqf(int ), (int)622)) break;
            object = v.qqi("sks", qqf(int ), (int)623);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ax - v.qqi("skt", qss(int ), (int)353)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == v.qqi("sku", qqf(int ), (int)624)) break;
            object = v.qqi("skv", qqf(int ), (int)625);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ax - v.qqi("skw", qss(int ), (int)354)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == v.qqi("skx", qqf(int ), (int)626)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = v.qqi("sky", qqf(int ), (int)627);
        }
        if (bl2 || bl2) return;
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = ax - v.qqi("skz", qss(int ), (int)355)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == v.qqi("sla", qqf(int ), (int)628)) break;
            object = v.qqi("slb", qqf(int ), (int)629);
        }
        class_5250 class_52502 = class_2561.method_43470((String)"\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .tp <\u043d\u0438\u043a|off>");
        Object object = ax;
        block8: while (true) {
            switch ((int)object) {
                case -2121201296: {
                    break block8;
                }
                case 682671825: {
                    object = v.qqi("sld", qss(int ), (int)357) - v.qqi("slc", qss(int ), (int)356);
                    continue block8;
                }
            }
            break;
        }
        while (true) {
            long l6;
            Object object2;
            if ((object2 = (l6 = ax - v.qqi("sle", qss(int ), (int)358)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object2 == v.qqi("slf", qqf(int ), (int)630)) break;
            object2 = v.qqi("slg", qqf(int ), (int)631);
        }
        class_5250 class_52503 = class_52502.method_27692(class_124.field_1080);
        while (true) {
            long l7;
            Object object3;
            if ((object3 = (l7 = ax - v.qqi("slh", qss(int ), (int)359)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
            if (object3 == v.qqi("sli", qqf(int ), (int)632)) {
                this.logDirect(class_52503);
                if (bl2) return;
                break;
            }
            object3 = v.qqi("slj", qqf(int ), (int)633);
        }
        if (!bl2) return;
    }

    public static /* synthetic */ CallSite qqi(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        block112: {
            block111: {
                v0 /* !! */  = v.ax;
                if (true) ** GOTO lbl5
                block71: while (true) {
                    v0 /* !! */  = (long)(v1 - v.qqi("rcz", qss(int ), (int)70));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -2121201296: {
                            break block71;
                        }
                        case 458174718: {
                            v1 = v.qqi("rda", qss(int ), (int)71);
                            continue block71;
                        }
                        case 497894108: {
                            v1 = v.qqi("rdb", qss(int ), (int)72);
                            continue block71;
                        }
                        case 1698925382: {
                            v1 = v.qqi("rdc", qss(int ), (int)73);
                            continue block71;
                        }
                    }
                    break;
                }
                var7_3 = v.c;
                v2 /* !! */  = v.ax;
                if (true) ** GOTO lbl22
                block72: while (true) {
                    v2 /* !! */  = (long)(v.qqi("rde", qss(int ), (int)75) - v.qqi("rdd", qss(int ), (int)74));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2121201296: {
                            break block72;
                        }
                        case 817558942: {
                            continue block72;
                        }
                    }
                    break;
                }
                var6_4 /* !! */  = v.b;
                v3 /* !! */  = v.ax;
                if (true) ** GOTO lbl32
                block73: while (true) {
                    v3 /* !! */  = (long)(v.qqi("rdg", qss(int ), (int)77) - v.qqi("rdf", qss(int ), (int)76));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -2121201296: {
                            break block73;
                        }
                        case 1607533722: {
                            continue block73;
                        }
                    }
                    break;
                }
                var5_5 = v.a;
                if (var7_3) {
                    throw null;
lbl40:
                    // 7 sources

                    return null;
                }
                if (var5_5 || var5_5) ** GOTO lbl40
                if (var2_2.length == v.qqi("rdh", qqf(int ), (int)253)) break block111;
                if (var5_5 || var5_5) ** GOTO lbl40
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("rdi", qss(int ), (int)78)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == v.qqi("rdj", qqf(int ), (int)254)) break;
                    v4 /* !! */  = (long)v.qqi("rdk", qqf(int ), (int)255);
                }
                return Stream.empty();
            }
            if (var5_5 || var5_5) ** GOTO lbl40
            v5 = var2_2[0];
            v6 /* !! */  = v.ax;
            if (true) ** GOTO lbl58
            block76: while (true) {
                v6 /* !! */  = (long)(v7 - v.qqi("rdl", qss(int ), (int)79));
lbl58:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2121201296: {
                        break block76;
                    }
                    case -627753256: {
                        v7 = v.qqi("rdm", qss(int ), (int)80);
                        continue block76;
                    }
                    case 743068999: {
                        v7 = v.qqi("rdn", qss(int ), (int)81);
                        continue block76;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("rdo", qss(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == v.qqi("rdp", qqf(int ), (int)256)) break;
                v8 /* !! */  = (long)v.qqi("rdq", qqf(int ), (int)257);
            }
            var3_6 = v5.toLowerCase(Locale.ROOT);
            if (var5_5 || var5_5) ** GOTO lbl40
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("rdr", qss(int ), (int)83)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == v.qqi("rds", qqf(int ), (int)258)) break;
                v9 /* !! */  = (long)v.qqi("rdt", qqf(int ), (int)259);
            }
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = v.ax - v.qqi("rdu", qss(int ), (int)84)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == v.qqi("rdv", qqf(int ), (int)260)) break;
                v10 /* !! */  = (long)v.qqi("rdw", qqf(int ), (int)261);
            }
            if (v.mc.field_1687 != null) break block112;
            if (var5_5) ** GOTO lbl40
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = v.ax - v.qqi("rdx", qss(int ), (int)85)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == v.qqi("rdy", qqf(int ), (int)262)) break;
                v11 /* !! */  = (long)v.qqi("rdz", qqf(int ), (int)263);
            }
            v12 /* !! */  = Stream.empty();
            if (var7_3) {
                throw null;
            }
            ** GOTO lbl178
        }
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        block19 : switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5 || var5_5) ** GOTO lbl40
                v13 /* !! */  = v.ax;
                if (true) ** GOTO lbl104
                block81: while (true) {
                    v13 /* !! */  = (long)(v.qqi("reb", qss(int ), (int)87) - v.qqi("rea", qss(int ), (int)86));
lbl104:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2121201296: {
                            break block81;
                        }
                        case -1553900278: {
                            continue block81;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_5 = v.ax - v.qqi("rec", qss(int ), (int)88)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == v.qqi("red", qqf(int ), (int)264)) break;
                    v14 /* !! */  = (long)v.qqi("ree", qqf(int ), (int)265);
                }
                v15 = v.mc.field_1687;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_6 = v.ax - v.qqi("ref", qss(int ), (int)89)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == v.qqi("reg", qqf(int ), (int)266)) break;
                    v16 /* !! */  = (long)v.qqi("reh", qqf(int ), (int)267);
                }
                v17 = v15.method_18456();
                v18 /* !! */  = v.ax;
                if (true) ** GOTO lbl125
                block84: while (true) {
                    v18 /* !! */  = (long)(v19 - v.qqi("rei", qss(int ), (int)90));
lbl125:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2121201296: {
                            break block84;
                        }
                        case -1635307114: {
                            v19 = v.qqi("rej", qss(int ), (int)91);
                            continue block84;
                        }
                        case 154116330: {
                            v19 = v.qqi("rek", qss(int ), (int)92);
                            continue block84;
                        }
                        case 1465046680: {
                            v19 = v.qqi("rel", qss(int ), (int)93);
                            continue block84;
                        }
                    }
                    break;
                }
                v20 = v17.stream();
                v21 /* !! */  = v.ax;
                if (true) ** GOTO lbl142
                block85: while (true) {
                    v21 /* !! */  = (long)(v22 - v.qqi("rem", qss(int ), (int)94));
lbl142:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2121201296: {
                            break block85;
                        }
                        case 3003285: {
                            v22 = v.qqi("ren", qss(int ), (int)95);
                            continue block85;
                        }
                        case 2063254118: {
                            v22 = v.qqi("reo", qss(int ), (int)96);
                            continue block85;
                        }
                    }
                    break;
                }
                v23 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$tabComplete$0(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = v.ax - v.qqi("rep", qss(int ), (int)97)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == v.qqi("req", qqf(int ), (int)268)) break;
                    v24 /* !! */  = (long)v.qqi("rer", qqf(int ), (int)269);
                }
                v25 = v20.filter(v23);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_8 = v.ax - v.qqi("res", qss(int ), (int)98)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == v.qqi("ret", qqf(int ), (int)270)) break;
                    v26 /* !! */  = (long)v.qqi("reu", qqf(int ), (int)271);
                }
                v27 = (Function<class_742, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$tabComplete$1(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Ljava/lang/String;)();
                v28 /* !! */  = v.ax;
                if (true) ** GOTO lbl168
                block88: while (true) {
                    v28 /* !! */  = (long)(v29 - v.qqi("rev", qss(int ), (int)99));
lbl168:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -2121201296: {
                            break block88;
                        }
                        case -2096802944: {
                            v29 = v.qqi("rew", qss(int ), (int)100);
                            continue block88;
                        }
                        case 2129553921: {
                            v29 = v.qqi("rex", qss(int ), (int)101);
                            continue block88;
                        }
                    }
                    break;
                }
                v12 /* !! */  = var4_7 = v25.map(v27);
lbl178:
                // 2 sources

                if (!var5_5 && !var5_5) ** break;
                ** continue;
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_9 = v.ax - v.qqi("rey", qss(int ), (int)102)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == v.qqi("rez", qqf(int ), (int)272)) break;
                    v30 /* !! */  = (long)v.qqi("rfa", qqf(int ), (int)273);
                }
                v31 = Stream.of("off");
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_10 = v.ax - v.qqi("rfb", qss(int ), (int)103)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == v.qqi("rfc", qqf(int ), (int)274)) break;
                    v32 /* !! */  = (long)v.qqi("rfd", qqf(int ), (int)275);
                }
                v33 = Stream.concat(v31, var4_7);
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_11 = v.ax - v.qqi("rfe", qss(int ), (int)104)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == v.qqi("rff", qqf(int ), (int)276)) break;
                    v34 /* !! */  = (long)v.qqi("rfg", qqf(int ), (int)277);
                }
                v35 = (Predicate<String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$tabComplete$2(java.lang.String java.lang.String ), (Ljava/lang/String;)Z)((String)var3_6);
                v36 /* !! */  = v.ax;
                if (true) ** GOTO lbl202
                block92: while (true) {
                    v36 /* !! */  = (long)(v37 - v.qqi("rfh", qss(int ), (int)105));
lbl202:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -2121201296: {
                            break block92;
                        }
                        case -1402716888: {
                            v37 = v.qqi("rfi", qss(int ), (int)106);
                            continue block92;
                        }
                        case -1351463931: {
                            v37 = v.qqi("rfj", qss(int ), (int)107);
                            continue block92;
                        }
                        case 1377536489: {
                            v37 = v.qqi("rfk", qss(int ), (int)108);
                            continue block92;
                        }
                    }
                    break;
                }
                v38 = v33.filter(v35);
                v39 /* !! */  = v.ax;
                if (true) ** GOTO lbl219
                block93: while (true) {
                    v39 /* !! */  = (long)(v.qqi("rfm", qss(int ), (int)110) - v.qqi("rfl", qss(int ), (int)109));
lbl219:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -2121201296: {
                            break block93;
                        }
                        case -1236739632: {
                            continue block93;
                        }
                    }
                    break;
                }
                v40 /* !! */  = v.ax;
                if (true) ** GOTO lbl228
                block94: while (true) {
                    v40 /* !! */  = (long)(v.qqi("rfo", qss(int ), (int)112) - v.qqi("rfn", qss(int ), (int)111));
lbl228:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -2121201296: {
                            break block94;
                        }
                        case -1903974090: {
                            continue block94;
                        }
                    }
                    break;
                }
                return v38.sorted(String.CASE_INSENSITIVE_ORDER);
            }
            case 0: {
                var6_4 /* !! */  = (int)v.qqi("rfp", qqf(int ), (int)278);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl249
            }
            case 1: {
                do {
                    var6_4 /* !! */  = (int)v.qqi("rfq", qqf(int ), (int)279);
                } while (!var7_3);
                throw null;
            }
lbl244:
            // 2 sources

            case 2: {
                var6_4 /* !! */  = (int)v.qqi("rfr", qqf(int ), (int)280);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl249:
            // 3 sources

            case 3: {
                var6_4 /* !! */  = (int)v.qqi("rfs", qqf(int ), (int)281);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)v.qqi("rft", qqf(int ), (int)282);
                    if (!var7_3) break block19;
                    throw null;
                }
            }
lbl259:
            // 2 sources

            case 5: {
                var6_4 /* !! */  = (int)v.qqi("rfu", qqf(int ), (int)283);
                if (!var7_3) break;
                throw null;
            }
            case 6: {
                var6_4 /* !! */  = (int)v.qqi("rfv", qqf(int ), (int)284);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl295
            }
            case 7: {
                do {
                    var6_4 /* !! */  = (int)v.qqi("rfw", qqf(int ), (int)285);
                } while (!var7_3);
                throw null;
            }
            case 8: {
                var6_4 /* !! */  = (int)v.qqi("rfx", qqf(int ), (int)286);
                if (!var7_3) ** GOTO lbl249
                throw null;
            }
lbl277:
            // 2 sources

            case 9: {
                var6_4 /* !! */  = (int)v.qqi("rfy", qqf(int ), (int)287);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl299
            }
            case 10: {
                var6_4 /* !! */  = (int)v.qqi("rfz", qqf(int ), (int)288);
                if (!var7_3) ** GOTO lbl244
                throw null;
            }
lbl286:
            // 2 sources

            case 11: {
                var6_4 /* !! */  = (int)v.qqi("rga", qqf(int ), (int)289);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl291:
            // 2 sources

            case 12: {
                var6_4 /* !! */  = (int)v.qqi("rgb", qqf(int ), (int)290);
                if (!var7_3) ** GOTO lbl286
                throw null;
            }
lbl295:
            // 3 sources

            case 13: {
                var6_4 /* !! */  = (int)v.qqi("rgc", qqf(int ), (int)291);
                if (!var7_3) ** GOTO lbl277
                throw null;
            }
lbl299:
            // 2 sources

            case 14: {
                do {
                    var6_4 /* !! */  = (int)v.qqi("rgd", qqf(int ), (int)292);
                } while (!var7_3);
                throw null;
            }
            case 15: 
        }
        var6_4 /* !! */  = (int)v.qqi("rge", qqf(int ), (int)293);
        ** while (!var7_3)
lbl307:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void svb() {
        v.qsj[300] = 6124843251287744697L;
        v.qsj[301] = -7425406166444986787L;
        v.qsj[302] = 6624182698651973141L;
        v.qsj[303] = -2658948255187423517L;
        v.qsj[304] = 7724447137821946852L;
        v.qsj[305] = -4600680812582150939L;
        v.qsj[306] = -7622653178281813173L;
        v.qsj[307] = 2958988787194726939L;
        v.qsj[308] = -3142542682898634686L;
        v.qsj[309] = 3662103404370343628L;
        v.qsj[310] = 1039787926459528540L;
        v.qsj[311] = -6419199552275844909L;
        v.qsj[312] = 60443010187413520L;
        v.qsj[313] = 6013580619848771207L;
        v.qsj[314] = -6036694562467162194L;
        v.qsj[315] = 3374734237779542315L;
        v.qsj[316] = -8800114991283554657L;
        v.qsj[317] = 4663770452539082084L;
        v.qsj[318] = 3736144429637680869L;
        v.qsj[319] = 8151780743880159370L;
        v.qsj[320] = -8730213895200361673L;
        v.qsj[321] = -654439130352020658L;
        v.qsj[322] = -1082744947113647481L;
        v.qsj[323] = 6657574537157611387L;
        v.qsj[324] = -8149156861215385671L;
        v.qsj[325] = -8038796462123301728L;
        v.qsj[326] = 7664150878646767699L;
        v.qsj[327] = 7099709337750363958L;
        v.qsj[328] = -3339135748597866579L;
        v.qsj[329] = -1283335962671633164L;
        v.qsj[330] = -3089193856877714938L;
        v.qsj[331] = 3464694965347277092L;
        v.qsj[332] = -8060695107004843241L;
        v.qsj[333] = 4872429743430328714L;
        v.qsj[334] = 4296646070957681913L;
        v.qsj[335] = 7010543780122702555L;
        v.qsj[336] = 4354347145007274536L;
        v.qsj[337] = 809764914220333009L;
        v.qsj[338] = 2091398978944153184L;
        v.qsj[339] = -1041915810459991687L;
        v.qsj[340] = -3263770677607990095L;
        v.qsj[341] = 4358947860669793870L;
        v.qsj[342] = 7119407760939301326L;
        v.qsj[343] = 289097989641263547L;
        v.qsj[344] = -7320076267950799955L;
        v.qsj[345] = 1342753937568564448L;
        v.qsj[346] = 8630680056615907714L;
        v.qsj[347] = 8677345210876127377L;
        v.qsj[348] = 7906330622403112082L;
        v.qsj[349] = -5198382988785407143L;
        v.qsj[350] = 1124319642413344817L;
        v.qsj[351] = -5078717793465850176L;
        v.qsj[352] = 7424947448412028953L;
        v.qsj[353] = 3117596817978195457L;
        v.qsj[354] = -3400187252736349652L;
        v.qsj[355] = -7321210759243064772L;
        v.qsj[356] = -3467687113244117086L;
        v.qsj[357] = -301520752480322681L;
        v.qsj[358] = -2399566827109235225L;
        v.qsj[359] = 1704928537911301021L;
        v.qsj[360] = 8726632104608536245L;
        v.qsj[361] = 6723642644134806785L;
        v.qsj[362] = 463394798062478065L;
        v.qsj[363] = -2724367467368371244L;
        v.qsj[364] = -8829400722344447787L;
        v.qsj[365] = -4733921512388883603L;
        v.qsj[366] = -774639971353322700L;
        v.qsj[367] = 3081784274911151515L;
        v.qsj[368] = 8300113499015597287L;
        v.qsj[369] = -3626217130294675387L;
        v.qsj[370] = -3781691427630049392L;
        v.qsj[371] = 831281828851441500L;
        v.qsj[372] = 5555980815586177177L;
        v.qsj[373] = 6744522695361530206L;
        v.qsj[374] = -6949611670706210844L;
        v.qsj[375] = -8865336382733300674L;
        v.qsj[376] = 2088559845360683551L;
        v.qsj[377] = 5029222132101288169L;
        v.qsj[378] = -8905748067777533598L;
        v.qsj[379] = 8748215014991657508L;
        v.qsj[380] = 2799464956869444846L;
        v.qsj[381] = -3696304222173615658L;
        v.qsj[382] = 4121916346042656478L;
        v.qsj[383] = 5968950820482067334L;
        v.qsj[384] = 2040395539164033377L;
        v.qsj[385] = 905865008282202596L;
        v.qsj[386] = -7259094472941090359L;
        v.qsj[387] = 7231966158363910458L;
        v.qsj[388] = 8692379143303479953L;
        v.qsj[389] = -2235071743722842897L;
        v.qsj[390] = 7942832698257740014L;
    }

    private static /* synthetic */ void svc() {
        v.qsk[0] = -1291604663936716157L;
        v.qsk[1] = -5740771480269293171L;
        v.qsk[2] = 3131918663228474103L;
        v.qsk[3] = -2879371920783442882L;
        v.qsk[4] = -1631545640411705891L;
        v.qsk[5] = -7914237589060005129L;
        v.qsk[6] = -7184839095790599077L;
        v.qsk[7] = 6984347072376938459L;
        v.qsk[8] = -7934647619786179759L;
        v.qsk[9] = -2374372917750300720L;
        v.qsk[10] = -480095650842918190L;
        v.qsk[11] = -7959958578764794462L;
        v.qsk[12] = 5139695999814462609L;
        v.qsk[13] = 1950372582181579354L;
        v.qsk[14] = -1527015439461628259L;
        v.qsk[15] = -5638653456449042355L;
        v.qsk[16] = 5045628522902618501L;
        v.qsk[17] = -1968735830364116152L;
        v.qsk[18] = -5730424687689831807L;
        v.qsk[19] = -5453796127422378048L;
        v.qsk[20] = 6473231399785101171L;
        v.qsk[21] = 5039698847540109064L;
        v.qsk[22] = 4127482937085279807L;
        v.qsk[23] = -4001607361749277097L;
        v.qsk[24] = 657569188850391425L;
        v.qsk[25] = 4206632214331442359L;
        v.qsk[26] = -6153377262506664234L;
        v.qsk[27] = -6102473369495481524L;
        v.qsk[28] = 5160790511148818827L;
        v.qsk[29] = 5990053967058669410L;
        v.qsk[30] = 1862801563110697571L;
        v.qsk[31] = 1383460365926335455L;
        v.qsk[32] = -3796444782577172020L;
        v.qsk[33] = 1277606081370922586L;
        v.qsk[34] = -5102608862813206971L;
        v.qsk[35] = -1115699290689727486L;
        v.qsk[36] = 2193450542230957399L;
        v.qsk[37] = 6309804244165455448L;
        v.qsk[38] = -1043891721789204449L;
        v.qsk[39] = 2857732795569936063L;
        v.qsk[40] = -1029004615365627586L;
        v.qsk[41] = -3823817841387214954L;
        v.qsk[42] = 4077392531061650963L;
        v.qsk[43] = 1236722594978871944L;
        v.qsk[44] = -3452403977084870868L;
        v.qsk[45] = -2373348078162125832L;
        v.qsk[46] = 3087946501748255909L;
        v.qsk[47] = -2193210949749385790L;
        v.qsk[48] = -8737374524302449123L;
        v.qsk[49] = -7202147663624524326L;
        v.qsk[50] = -2606410919133508951L;
        v.qsk[51] = 7955139208788758501L;
        v.qsk[52] = -9074612054587699658L;
        v.qsk[53] = 6485718479801914523L;
        v.qsk[54] = 5955718131401269306L;
        v.qsk[55] = 7854589409664687177L;
        v.qsk[56] = 2234965015250884102L;
        v.qsk[57] = 1701623913246698975L;
        v.qsk[58] = 8609356886897529900L;
        v.qsk[59] = -6841307041126584874L;
        v.qsk[60] = -930512287548387996L;
        v.qsk[61] = 9150966062180485185L;
        v.qsk[62] = 3954966631349654393L;
        v.qsk[63] = -6010003231965514064L;
        v.qsk[64] = 6190269686817995050L;
        v.qsk[65] = -4911455224677616502L;
        v.qsk[66] = 3692472366782705640L;
        v.qsk[67] = -879100426362033867L;
        v.qsk[68] = -6952828375872110922L;
        v.qsk[69] = 9183229644799535857L;
        v.qsk[70] = -4452135342492219490L;
        v.qsk[71] = -3483575629982122955L;
        v.qsk[72] = -3727821674337880810L;
        v.qsk[73] = 2645685136176289610L;
        v.qsk[74] = 2104222660478642035L;
        v.qsk[75] = 9012826996556436213L;
        v.qsk[76] = -7774241002164578432L;
        v.qsk[77] = 4992056223239307447L;
        v.qsk[78] = -3479473753914661019L;
        v.qsk[79] = 233243521909950910L;
        v.qsk[80] = -2595883724363031954L;
        v.qsk[81] = -2485893394628050234L;
        v.qsk[82] = 8583344844665310812L;
        v.qsk[83] = 9073083972430169328L;
        v.qsk[84] = -2651808165264803463L;
        v.qsk[85] = -1539054929504773603L;
        v.qsk[86] = -926828187906771204L;
        v.qsk[87] = -2567569872776804644L;
        v.qsk[88] = 6813242264913002388L;
        v.qsk[89] = 4941629475530895974L;
        v.qsk[90] = 7741524417225695962L;
        v.qsk[91] = 8074189657293273043L;
        v.qsk[92] = -122280101281859233L;
        v.qsk[93] = 9173875179515185117L;
        v.qsk[94] = 3892174127059849686L;
        v.qsk[95] = -5582999785919419677L;
        v.qsk[96] = 1141362888369265712L;
        v.qsk[97] = 6852544762591509353L;
        v.qsk[98] = 5363536580132716914L;
        v.qsk[99] = 867062071968604745L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void stopNavigation() {
        v0 /* !! */  = v.ax;
        if (true) ** GOTO lbl5
        block46: while (true) {
            v0 /* !! */  = (long)(v.qqi("six", qss(int ), (int)335) - v.qqi("siw", qss(int ), (int)334));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2121201296: {
                    break block46;
                }
                case 1387585345: {
                    continue block46;
                }
            }
            break;
        }
        var3_1 = v.c;
        v1 /* !! */  = v.ax;
        if (true) ** GOTO lbl15
        block47: while (true) {
            v1 /* !! */  = (long)(v.qqi("siz", qss(int ), (int)337) - v.qqi("siy", qss(int ), (int)336));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2121201296: {
                    break block47;
                }
                case -1272874328: {
                    continue block47;
                }
            }
            break;
        }
        var2_2 /* !! */  = v.b;
        v2 /* !! */  = v.ax;
        if (true) ** GOTO lbl25
        block48: while (true) {
            v2 /* !! */  = (long)(v3 - v.qqi("sja", qss(int ), (int)338));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2121201296: {
                    break block48;
                }
                case -451844365: {
                    v3 = v.qqi("sjb", qss(int ), (int)339);
                    continue block48;
                }
                case 1555920101: {
                    v3 = v.qqi("sjc", qss(int ), (int)340);
                    continue block48;
                }
            }
            break;
        }
        var1_3 = v.a;
        if (var3_1) {
            throw null;
lbl37:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl37
        v4 /* !! */  = v.ax;
        if (true) ** GOTO lbl44
        block50: while (true) {
            v4 /* !! */  = (long)(v.qqi("sje", qss(int ), (int)342) - v.qqi("sjd", qss(int ), (int)341));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2121201296: {
                    break block50;
                }
                case 362522430: {
                    continue block50;
                }
            }
            break;
        }
        if (!this.walkingToMarker) ** GOTO lbl71
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("sjf", qss(int ), (int)343)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == v.qqi("sjg", qqf(int ), (int)594)) break;
                    v5 /* !! */  = (long)v.qqi("sjh", qqf(int ), (int)595);
                }
                na.stop();
                if (var1_3 || var1_3) ** GOTO lbl37
                v6 = v.qqi("sji", qqf(int ), (int)596);
                v7 = v.qqi("sjj", qqf(int ), (int)597);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("sjk", qss(int ), (int)344)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == v.qqi("sjl", qqf(int ), (int)598)) break;
                    v8 /* !! */  = (long)v.qqi("sjm", qqf(int ), (int)599);
                }
                na.applySettings((boolean)v6, (boolean)v7);
                if (var1_3) ** GOTO lbl37
lbl71:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl37
                v9 = v.qqi("sjn", qqf(int ), (int)600);
                v10 /* !! */  = v.ax;
                if (true) ** GOTO lbl77
                block53: while (true) {
                    v10 /* !! */  = (long)(v.qqi("sjp", qss(int ), (int)346) - v.qqi("sjo", qss(int ), (int)345));
lbl77:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2121201296: {
                            break block53;
                        }
                        case -1540667712: {
                            continue block53;
                        }
                    }
                    break;
                }
                this.walkingToMarker = v9;
                if (var1_3 || var1_3) ** GOTO lbl37
                v11 = v.qqi("sjq", qqf(int ), (int)601);
                v12 /* !! */  = v.ax;
                if (true) ** GOTO lbl89
                block54: while (true) {
                    v12 /* !! */  = (long)(v13 - v.qqi("sjr", qss(int ), (int)347));
lbl89:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -2121201296: {
                            break block54;
                        }
                        case -1085057701: {
                            v13 = v.qqi("sjs", qss(int ), (int)348);
                            continue block54;
                        }
                        case 782738208: {
                            v13 = v.qqi("sjt", qss(int ), (int)349);
                            continue block54;
                        }
                        case 1454078368: {
                            v13 = v.qqi("sju", qss(int ), (int)350);
                            continue block54;
                        }
                    }
                    break;
                }
                this.pathX = (int)v11;
                if (var1_3 || var1_3) ** GOTO lbl37
                v14 = v.qqi("sjv", qqf(int ), (int)602);
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_2 = v.ax - v.qqi("sjw", qss(int ), (int)351)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == v.qqi("sjx", qqf(int ), (int)603)) break;
                    v15 /* !! */  = (long)v.qqi("sjy", qqf(int ), (int)604);
                }
                this.pathZ = (int)v14;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl113:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)v.qqi("sjz", qqf(int ), (int)605);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl118:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)v.qqi("ska", qqf(int ), (int)606);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 2: {
                var2_2 /* !! */  = (int)v.qqi("skb", qqf(int ), (int)607);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)v.qqi("skc", qqf(int ), (int)608);
                    if (!var3_1) ** GOTO lbl113
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)v.qqi("skd", qqf(int ), (int)609);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 5: {
                var2_2 /* !! */  = (int)v.qqi("ske", qqf(int ), (int)610);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 6: {
                var2_2 /* !! */  = (int)v.qqi("skf", qqf(int ), (int)611);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl148:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)v.qqi("skg", qqf(int ), (int)612);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl153:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)v.qqi("skh", qqf(int ), (int)613);
                if (!var3_1) break;
                throw null;
            }
lbl157:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)v.qqi("ski", qqf(int ), (int)614);
                if (!var3_1) ** GOTO lbl153
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)v.qqi("skj", qqf(int ), (int)615);
                if (var3_1) {
                    throw null;
                }
            }
            case 11: {
                var2_2 /* !! */  = (int)v.qqi("skk", qqf(int ), (int)616);
                if (var3_1) {
                    throw null;
                }
            }
lbl169:
            // 4 sources

            case 12: {
                var2_2 /* !! */  = (int)v.qqi("skl", qqf(int ), (int)617);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
            case 13: {
                var2_2 /* !! */  = (int)v.qqi("skm", qqf(int ), (int)618);
                if (!var3_1) ** GOTO lbl169
                throw null;
            }
lbl177:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)v.qqi("skn", qqf(int ), (int)619);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
lbl181:
            // 4 sources

            case 15: {
                var2_2 /* !! */  = (int)v.qqi("sko", qqf(int ), (int)620);
                if (!var3_1) ** GOTO lbl177
                throw null;
            }
            case 16: 
        }
        var2_2 /* !! */  = (int)v.qqi("skp", qqf(int ), (int)621);
        ** while (!var3_1)
lbl188:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void svd() {
        v.qsk[100] = -6228726478736838777L;
        v.qsk[101] = -7885367057036146563L;
        v.qsk[102] = 3383331765369845431L;
        v.qsk[103] = 779516542541404288L;
        v.qsk[104] = 1000410210238030005L;
        v.qsk[105] = -2851975910321364296L;
        v.qsk[106] = -5314496580682958579L;
        v.qsk[107] = 8444122086118194204L;
        v.qsk[108] = -2410018150448981489L;
        v.qsk[109] = 5868382248559664523L;
        v.qsk[110] = 4953996006457429794L;
        v.qsk[111] = 2509077279901416938L;
        v.qsk[112] = -4367620194058173120L;
        v.qsk[113] = -1080351225230245601L;
        v.qsk[114] = 1449761132784268102L;
        v.qsk[115] = 6982019730947090581L;
        v.qsk[116] = 3130762965163981641L;
        v.qsk[117] = -3286383289712168798L;
        v.qsk[118] = 3873579295511137801L;
        v.qsk[119] = 29435768232734091L;
        v.qsk[120] = 2634353960685568503L;
        v.qsk[121] = -4662874709390521220L;
        v.qsk[122] = 3254216709539259819L;
        v.qsk[123] = 8516395067054676626L;
        v.qsk[124] = 6468187187468615605L;
        v.qsk[125] = 8267734403411568707L;
        v.qsk[126] = -695552669949406444L;
        v.qsk[127] = -6113280175322074181L;
        v.qsk[128] = -7009263622773877161L;
        v.qsk[129] = -480433150718009619L;
        v.qsk[130] = 7795662166798318339L;
        v.qsk[131] = -6793303698245240352L;
        v.qsk[132] = -2723987490386372062L;
        v.qsk[133] = 4954638139977621384L;
        v.qsk[134] = -425212775169667001L;
        v.qsk[135] = -5248065813987475715L;
        v.qsk[136] = -5752926320406761289L;
        v.qsk[137] = 4843053388241338522L;
        v.qsk[138] = -997586048747966298L;
        v.qsk[139] = -6024152556726844558L;
        v.qsk[140] = -2376732126639333791L;
        v.qsk[141] = 7667577184633888630L;
        v.qsk[142] = 5235889255393485104L;
        v.qsk[143] = -8906539824783860174L;
        v.qsk[144] = -5080574356603104984L;
        v.qsk[145] = 2436457121983204914L;
        v.qsk[146] = 5097406488281138201L;
        v.qsk[147] = 4344023581434113117L;
        v.qsk[148] = -7791081095779677711L;
        v.qsk[149] = 6022350313619392200L;
        v.qsk[150] = 8189554322505877126L;
        v.qsk[151] = -1061809765741721146L;
        v.qsk[152] = 7238839829530013184L;
        v.qsk[153] = 6445816036311301729L;
        v.qsk[154] = 5805083186641466408L;
        v.qsk[155] = 8260771969333800071L;
        v.qsk[156] = -7173907524051152270L;
        v.qsk[157] = 1729912267475414261L;
        v.qsk[158] = -7130052843477772530L;
        v.qsk[159] = -539965434884115425L;
        v.qsk[160] = -472005635068736403L;
        v.qsk[161] = -5561922439206975551L;
        v.qsk[162] = 2279402075570164828L;
        v.qsk[163] = -3199737925766524520L;
        v.qsk[164] = -4410314952696548159L;
        v.qsk[165] = 3014973136564497383L;
        v.qsk[166] = 8000721648336568643L;
        v.qsk[167] = 324946334016798628L;
        v.qsk[168] = 7218374466631244414L;
        v.qsk[169] = 3197776867298538338L;
        v.qsk[170] = -8348868136950892952L;
        v.qsk[171] = 6939681967758226205L;
        v.qsk[172] = 8908101329123796239L;
        v.qsk[173] = 6335480647005792909L;
        v.qsk[174] = 1732802918833382581L;
        v.qsk[175] = -1167112844479082114L;
        v.qsk[176] = 2540271892506423906L;
        v.qsk[177] = -4178600316638654756L;
        v.qsk[178] = -272753813184398861L;
        v.qsk[179] = 2947131028745193774L;
        v.qsk[180] = -6867693823467709439L;
        v.qsk[181] = -3037082559970536004L;
        v.qsk[182] = -221033096407022952L;
        v.qsk[183] = -6363457917467560100L;
        v.qsk[184] = 1670528499911646484L;
        v.qsk[185] = -184551274682985548L;
        v.qsk[186] = -3491365282621659331L;
        v.qsk[187] = 6730064522779985217L;
        v.qsk[188] = 4457748781166231673L;
        v.qsk[189] = -6201668984437846040L;
        v.qsk[190] = 1854208766919786756L;
        v.qsk[191] = -7972893217040498962L;
        v.qsk[192] = -8387300342567462565L;
        v.qsk[193] = 4123659402654309781L;
        v.qsk[194] = -6049518698881120900L;
        v.qsk[195] = -6566525745253403683L;
        v.qsk[196] = 7066752704666144499L;
        v.qsk[197] = 7244246575968820454L;
        v.qsk[198] = -7469788524275788092L;
        v.qsk[199] = 4395557715532844960L;
    }

    private static /* synthetic */ void sve() {
        v.qsk[200] = 7205710673700403987L;
        v.qsk[201] = -7461427103444515539L;
        v.qsk[202] = -7777060892614434126L;
        v.qsk[203] = -3925596565064542914L;
        v.qsk[204] = 8367691536555829794L;
        v.qsk[205] = 2786264706547521887L;
        v.qsk[206] = -6579413775838487247L;
        v.qsk[207] = -6323687341733795290L;
        v.qsk[208] = 3947876456595954873L;
        v.qsk[209] = -3873880201207041218L;
        v.qsk[210] = 5170385237372881911L;
        v.qsk[211] = -6933559379661008055L;
        v.qsk[212] = 2781740933745816412L;
        v.qsk[213] = -2880910802855762783L;
        v.qsk[214] = 1926757665798479390L;
        v.qsk[215] = -746133340191462621L;
        v.qsk[216] = -6642818092614700665L;
        v.qsk[217] = -1171404786879268196L;
        v.qsk[218] = -4769147642474527866L;
        v.qsk[219] = 5228607139896634328L;
        v.qsk[220] = -4444978056321555832L;
        v.qsk[221] = -6839603525513381604L;
        v.qsk[222] = -8722558287179299363L;
        v.qsk[223] = -2869613825154302236L;
        v.qsk[224] = -6166507053295815048L;
        v.qsk[225] = 3358512781961874180L;
        v.qsk[226] = -2216389016146560756L;
        v.qsk[227] = 1580470612976189284L;
        v.qsk[228] = 5801432560814391466L;
        v.qsk[229] = 1474340507948489343L;
        v.qsk[230] = -7861320620538582852L;
        v.qsk[231] = 9445323371127784L;
        v.qsk[232] = -5074580849254642104L;
        v.qsk[233] = 5437365684220308613L;
        v.qsk[234] = 6146766079079804607L;
        v.qsk[235] = -7957798747037513654L;
        v.qsk[236] = 1764987343011599176L;
        v.qsk[237] = 2592262133613315610L;
        v.qsk[238] = 7013752790935076409L;
        v.qsk[239] = -2258115551892296870L;
        v.qsk[240] = -2928169118230454029L;
        v.qsk[241] = 5930471302887209046L;
        v.qsk[242] = 314501413263138795L;
        v.qsk[243] = 8022638830072544515L;
        v.qsk[244] = 4855725397856589857L;
        v.qsk[245] = 5406966659412717059L;
        v.qsk[246] = -429988375779617537L;
        v.qsk[247] = -2281486617619591426L;
        v.qsk[248] = 7433879970040838231L;
        v.qsk[249] = -6031026383668175103L;
        v.qsk[250] = -1763882612966418630L;
        v.qsk[251] = -8892948530193660781L;
        v.qsk[252] = -7660069699419646445L;
        v.qsk[253] = -2554109240986096868L;
        v.qsk[254] = 1823249145380901891L;
        v.qsk[255] = 1657596793097681974L;
        v.qsk[256] = -4608975068517441936L;
        v.qsk[257] = -3503305816041656603L;
        v.qsk[258] = -738111058450228525L;
        v.qsk[259] = -5714040411241582390L;
        v.qsk[260] = -8074256147049200401L;
        v.qsk[261] = 3747038777808536024L;
        v.qsk[262] = -8254140497489482659L;
        v.qsk[263] = -7513189515142732666L;
        v.qsk[264] = 661786344890960633L;
        v.qsk[265] = -2397533912259365690L;
        v.qsk[266] = -1125615954413914869L;
        v.qsk[267] = -3108753169941385590L;
        v.qsk[268] = 3209566330263477715L;
        v.qsk[269] = -7519372673312189181L;
        v.qsk[270] = -1014159288630898783L;
        v.qsk[271] = -1802596750524439891L;
        v.qsk[272] = -9176792343456044717L;
        v.qsk[273] = 7411875858776420350L;
        v.qsk[274] = -7506867248701716267L;
        v.qsk[275] = -2556211672162661704L;
        v.qsk[276] = -7714439325040416336L;
        v.qsk[277] = -612941803219420061L;
        v.qsk[278] = 3745033566988394525L;
        v.qsk[279] = -1743261514109252723L;
        v.qsk[280] = -2032630706772708674L;
        v.qsk[281] = 7566065696004311224L;
        v.qsk[282] = 6689062102076704118L;
        v.qsk[283] = -715817595254629613L;
        v.qsk[284] = -1364196387628137646L;
        v.qsk[285] = -8574499155479587075L;
        v.qsk[286] = -2937667894644292954L;
        v.qsk[287] = -3400842830154152387L;
        v.qsk[288] = -5967472054208080218L;
        v.qsk[289] = 8515189892608533597L;
        v.qsk[290] = -8606408028596489791L;
        v.qsk[291] = -3265583749965266426L;
        v.qsk[292] = 6406331113321396228L;
        v.qsk[293] = 1941208370770861508L;
        v.qsk[294] = -8029071568564756517L;
        v.qsk[295] = 4313651753216843243L;
        v.qsk[296] = -189259898096743887L;
        v.qsk[297] = -1189190070763250654L;
        v.qsk[298] = 8173902527807750666L;
        v.qsk[299] = 4165825390256419083L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$tabComplete$0(class_742 var0) {
        block42: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("snf", qss(int ), (int)380)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == v.qqi("sng", qqf(int ), (int)661)) break;
                v0 /* !! */  = (long)v.qqi("snh", qqf(int ), (int)662);
            }
            var3_1 = v.c;
            v1 /* !! */  = v.ax;
            if (true) ** GOTO lbl12
            block26: while (true) {
                v1 /* !! */  = (long)(v2 - v.qqi("sni", qss(int ), (int)381));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -2121201296: {
                        break block26;
                    }
                    case -2060135565: {
                        v2 = v.qqi("snj", qss(int ), (int)382);
                        continue block26;
                    }
                    case -1720850170: {
                        v2 = v.qqi("snk", qss(int ), (int)383);
                        continue block26;
                    }
                }
                break;
            }
            var2_2 /* !! */  = v.b;
            v3 /* !! */  = v.ax;
            if (true) ** GOTO lbl26
            block27: while (true) {
                v3 /* !! */  = (long)(v4 - v.qqi("snl", qss(int ), (int)384));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2121201296: {
                        break block27;
                    }
                    case 264308307: {
                        v4 = v.qqi("snm", qss(int ), (int)385);
                        continue block27;
                    }
                    case 932277946: {
                        v4 = v.qqi("snn", qss(int ), (int)386);
                        continue block27;
                    }
                    case 1973268601: {
                        v4 = v.qqi("sno", qss(int ), (int)387);
                        continue block27;
                    }
                }
                break;
            }
            var1_3 = v.a;
            if (var3_1) {
                throw null;
lbl41:
                // 4 sources

                return (boolean)v.qqi("snp", qqf(int ), (int)663);
            }
            if (var1_3 || var1_3) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("snq", qss(int ), (int)388)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == v.qqi("snr", qqf(int ), (int)664)) break;
                v5 /* !! */  = (long)v.qqi("sns", qqf(int ), (int)665);
            }
            v6 /* !! */  = v.ax;
            if (true) ** GOTO lbl54
            block30: while (true) {
                v6 /* !! */  = (long)(v.qqi("snu", qss(int ), (int)390) - v.qqi("snt", qss(int ), (int)389));
lbl54:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -2121201296: {
                        break block30;
                    }
                    case -2000993974: {
                        continue block30;
                    }
                }
                break;
            }
            if (var0 == v.mc.field_1724) break block42;
            if (var1_3) ** GOTO lbl41
            v7 = v.qqi("snv", qqf(int ), (int)666);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl73
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v7 = v.qqi("snw", qqf(int ), (int)667);
lbl73:
                // 2 sources

                return (boolean)v7;
            }
            case 0: {
                var2_2 /* !! */  = (int)v.qqi("snx", qqf(int ), (int)668);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)v.qqi("sny", qqf(int ), (int)669);
                    if (!var3_1) break block15;
                    throw null;
                }
            }
lbl84:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)v.qqi("snz", qqf(int ), (int)670);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl89:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)v.qqi("soa", qqf(int ), (int)671);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)v.qqi("sob", qqf(int ), (int)672);
                if (!var3_1) ** GOTO lbl89
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)v.qqi("soc", qqf(int ), (int)673);
                } while (!var3_1);
                throw null;
            }
lbl102:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)v.qqi("sod", qqf(int ), (int)674);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)v.qqi("soe", qqf(int ), (int)675);
        ** while (!var3_1)
lbl109:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isDragonFlyActive() {
        block55: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = v.ax - v.qqi("sgy", qss(int ), (int)314)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == v.qqi("sgz", qqf(int ), (int)564)) break;
                v0 /* !! */  = (long)v.qqi("sha", qqf(int ), (int)565);
            }
            var4_1 = v.c;
            v1 /* !! */  = v.ax;
            if (true) ** GOTO lbl12
            block36: while (true) {
                v1 /* !! */  = (long)(v.qqi("shc", qss(int ), (int)316) - v.qqi("shb", qss(int ), (int)315));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -2121201296: {
                        break block36;
                    }
                    case -1358548796: {
                        continue block36;
                    }
                }
                break;
            }
            var3_2 /* !! */  = v.b;
            v2 /* !! */  = v.ax;
            if (true) ** GOTO lbl22
            block37: while (true) {
                v2 /* !! */  = (long)(v.qqi("she", qss(int ), (int)318) - v.qqi("shd", qss(int ), (int)317));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -2121201296: {
                        break block37;
                    }
                    case 1846907133: {
                        continue block37;
                    }
                }
                break;
            }
            var2_3 = v.a;
            if (var4_1) {
                throw null;
lbl30:
                // 7 sources

                return (boolean)v.qqi("shf", qqf(int ), (int)566);
            }
            if (var2_3 || var2_3) ** GOTO lbl30
            v3 /* !! */  = v.ax;
            if (true) ** GOTO lbl37
            block39: while (true) {
                v3 /* !! */  = (long)(v.qqi("shh", qss(int ), (int)320) - v.qqi("shg", qss(int ), (int)319));
lbl37:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -2121201296: {
                        break block39;
                    }
                    case 385815339: {
                        continue block39;
                    }
                }
                break;
            }
            var1_4 = fu.getInstance();
            if (var2_3 || var2_3) ** GOTO lbl30
            if (var1_4 == null) break block55;
            if (var2_3) ** GOTO lbl30
            v4 /* !! */  = v.ax;
            if (true) ** GOTO lbl50
            block40: while (true) {
                v4 /* !! */  = (long)(v.qqi("shj", qss(int ), (int)322) - v.qqi("shi", qss(int ), (int)321));
lbl50:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -2121201296: {
                        break block40;
                    }
                    case -334280881: {
                        continue block40;
                    }
                }
                break;
            }
            if (!var1_4.isState()) break block55;
            if (var2_3) ** GOTO lbl30
            v5 /* !! */  = v.ax;
            if (true) ** GOTO lbl61
            block41: while (true) {
                v5 /* !! */  = (long)(v6 - v.qqi("shk", qss(int ), (int)323));
lbl61:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -2121201296: {
                        break block41;
                    }
                    case -115338697: {
                        v6 = v.qqi("shl", qss(int ), (int)324);
                        continue block41;
                    }
                    case 1814824653: {
                        v6 = v.qqi("shm", qss(int ), (int)325);
                        continue block41;
                    }
                }
                break;
            }
            v7 = var1_4.getMode();
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = v.ax - v.qqi("shn", qss(int ), (int)326)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v8 /* !! */  == v.qqi("sho", qqf(int ), (int)567)) break;
                v8 /* !! */  = (long)v.qqi("shp", qqf(int ), (int)568);
            }
            if (!v7.isSelected("Dragon Fly")) break block55;
            if (var2_3) ** GOTO lbl30
            v9 = v.qqi("shq", qqf(int ), (int)569);
            if (var4_1) {
                throw null;
            }
            ** GOTO lbl91
        }
        if (var2_3) ** GOTO lbl30
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                v9 = v.qqi("shr", qqf(int ), (int)570);
lbl91:
                // 2 sources

                return (boolean)v9;
            }
lbl92:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)v.qqi("shs", qqf(int ), (int)571);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl97:
            // 5 sources

            case 1: {
                var3_2 /* !! */  = (int)v.qqi("sht", qqf(int ), (int)572);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl102:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)v.qqi("shu", qqf(int ), (int)573);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)v.qqi("shv", qqf(int ), (int)574);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl133
                    break;
                }
            }
lbl113:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)v.qqi("shw", qqf(int ), (int)575);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
            case 5: {
                var3_2 /* !! */  = (int)v.qqi("shx", qqf(int ), (int)576);
                if (!var4_1) ** GOTO lbl92
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)v.qqi("shy", qqf(int ), (int)577);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)v.qqi("shz", qqf(int ), (int)578);
                if (!var4_1) ** GOTO lbl92
                throw null;
            }
lbl129:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)v.qqi("sia", qqf(int ), (int)579);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
lbl133:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)v.qqi("sib", qqf(int ), (int)580);
                if (!var4_1) ** GOTO lbl102
                throw null;
            }
lbl137:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)v.qqi("sic", qqf(int ), (int)581);
                if (!var4_1) ** GOTO lbl97
                throw null;
            }
            case 11: 
        }
        var3_2 /* !! */  = (int)v.qqi("sid", qqf(int ), (int)582);
        ** while (!var4_1)
lbl144:
        // 1 sources

        throw null;
    }
}

