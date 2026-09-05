/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_310;
import ruhack.phobia.nx;
import ruhack.phobia.ny$Phase;
import ruhack.phobia.oc;

public class ny {
    private static int[] lapt = new int[354];
    private static final class_310 mc;
    private static long[] laqd;
    public static final boolean a;
    private Runnable swapAction;
    private ny$Phase phase;
    private long phaseStartTime;
    public static final int b;
    public static final long ts = -5275208794057430758L;
    private final nx movement;
    private oc settings;
    private static long[] laqc;
    private int currentDelay;
    private static int[] lapu;
    public static final boolean c;
    private Runnable onComplete;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ny() {
        var2_1 /* !! */  = ny.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.phase = ny$Phase.IDLE;
                this.movement = new nx();
                this.settings = oc.defaults();
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)ny.lapv("lapw", laps(int ), (int)0);
                }
            }
lbl14:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)ny.lapv("lapx", laps(int ), (int)1);
                break;
            }
            case 2: {
                var2_1 /* !! */  = (int)ny.lapv("lapy", laps(int ), (int)2);
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ny.lapv("lapz", laps(int ), (int)3);
                    ** GOTO lbl14
                    break;
                }
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)ny.lapv("laqa", laps(int ), (int)4);
        ** while (true)
    }

    private static /* synthetic */ long laqb(int n2) {
        return laqc[n2] ^ laqd[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isRunning() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ny.ts - ny.lapv("lbgx", laqb(int ), (int)91)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ny.lapv("lbgy", laps(int ), (int)315)) break;
            v0 /* !! */  = (long)ny.lapv("lbha", laps(int ), (int)316);
        }
        var3_1 = ny.c;
        v1 /* !! */  = ny.ts;
        if (true) ** GOTO lbl12
        block18: while (true) {
            v1 /* !! */  = (long)(v2 - ny.lapv("lbhb", laqb(int ), (int)92));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1940523628: {
                    v2 = ny.lapv("lbhc", laqb(int ), (int)93);
                    continue block18;
                }
                case -1124192409: {
                    v2 = ny.lapv("lbhe", laqb(int ), (int)94);
                    continue block18;
                }
                case -716197422: {
                    v2 = ny.lapv("lbhf", laqb(int ), (int)95);
                    continue block18;
                }
                case 305178906: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = ny.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ny.ts - ny.lapv("lbhg", laqb(int ), (int)96)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ny.lapv("lbhh", laps(int ), (int)317)) break;
            v3 /* !! */  = (long)ny.lapv("lbhi", laps(int ), (int)318);
        }
        var1_3 = ny.a;
        if (var3_1) {
            throw null;
lbl34:
            // 4 sources

            return (boolean)ny.lapv("lbhk", laps(int ), (int)319);
        }
        if (var1_3 || var1_3) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ny.ts - ny.lapv("lbhm", laqb(int ), (int)97)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ny.lapv("lbhn", laps(int ), (int)320)) break;
            v4 /* !! */  = (long)ny.lapv("lbhp", laps(int ), (int)321);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ny.ts - ny.lapv("lbhr", laqb(int ), (int)98)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ny.lapv("lbhs", laps(int ), (int)322)) break;
            v5 /* !! */  = (long)ny.lapv("lbht", laps(int ), (int)323);
        }
        if (this.phase == ny$Phase.IDLE) ** GOTO lbl72
        if (var1_3) ** GOTO lbl34
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_4 = ny.ts - ny.lapv("lbhv", laqb(int ), (int)99)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == ny.lapv("lbhx", laps(int ), (int)324)) break;
            v6 /* !! */  = (long)ny.lapv("lbhz", laps(int ), (int)325);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_5 = ny.ts - ny.lapv("lbia", laqb(int ), (int)100)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == ny.lapv("lbib", laps(int ), (int)326)) break;
            v7 /* !! */  = (long)ny.lapv("lbid", laps(int ), (int)327);
        }
        if (this.phase == ny$Phase.FINISHED) ** GOTO lbl72
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl34
                v8 = ny.lapv("lbif", laps(int ), (int)328);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl75
            }
lbl72:
            // 2 sources

            if (!var1_3 && !var1_3) ** break;
            ** continue;
            v8 = ny.lapv("lbih", laps(int ), (int)329);
lbl75:
            // 2 sources

            return (boolean)v8;
lbl76:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ny.lapv("lbij", laps(int ), (int)330);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ny.lapv("lbik", laps(int ), (int)331);
                    if (!var3_1) ** GOTO lbl76
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ny.lapv("lbim", laps(int ), (int)332);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl96
            }
lbl91:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ny.lapv("lbio", laps(int ), (int)333);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
lbl96:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ny.lapv("lbip", laps(int ), (int)334);
                if (var3_1) {
                    throw null;
                }
            }
lbl100:
            // 6 sources

            case 5: {
                var2_2 /* !! */  = (int)ny.lapv("lbir", laps(int ), (int)335);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl109
            }
            case 6: {
                var2_2 /* !! */  = (int)ny.lapv("lbit", laps(int ), (int)336);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
lbl109:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ny.lapv("lbiv", laps(int ), (int)337);
                if (!var3_1) ** GOTO lbl100
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)ny.lapv("lbiw", laps(int ), (int)338);
        ** while (!var3_1)
lbl116:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lbsw() {
        ny.lapt[300] = -263938757;
        ny.lapt[301] = 1692027852;
        ny.lapt[302] = -2102906564;
        ny.lapt[303] = 854489751;
        ny.lapt[304] = 494341095;
        ny.lapt[305] = 463560054;
        ny.lapt[306] = 149938298;
        ny.lapt[307] = -682619199;
        ny.lapt[308] = -241068190;
        ny.lapt[309] = 1807827481;
        ny.lapt[310] = 1997262222;
        ny.lapt[311] = -1230580866;
        ny.lapt[312] = -975367809;
        ny.lapt[313] = -1614227307;
        ny.lapt[314] = 291309543;
        ny.lapt[315] = -2016465224;
        ny.lapt[316] = 940019712;
        ny.lapt[317] = 202331400;
        ny.lapt[318] = -951089021;
        ny.lapt[319] = 619906523;
        ny.lapt[320] = 490388107;
        ny.lapt[321] = -1853261795;
        ny.lapt[322] = 1075364211;
        ny.lapt[323] = 959790020;
        ny.lapt[324] = -1352071949;
        ny.lapt[325] = 627861461;
        ny.lapt[326] = -1503755527;
        ny.lapt[327] = 1853074775;
        ny.lapt[328] = -913421268;
        ny.lapt[329] = -1172991045;
        ny.lapt[330] = 1635331227;
        ny.lapt[331] = 267915846;
        ny.lapt[332] = -843531527;
        ny.lapt[333] = 1800938723;
        ny.lapt[334] = 183826121;
        ny.lapt[335] = 135030165;
        ny.lapt[336] = -878393210;
        ny.lapt[337] = -1678697938;
        ny.lapt[338] = -639348864;
        ny.lapt[339] = 184485344;
        ny.lapt[340] = 970477428;
        ny.lapt[341] = 891033081;
        ny.lapt[342] = 819116196;
        ny.lapt[343] = -296749063;
        ny.lapt[344] = 1362719284;
        ny.lapt[345] = -1609758040;
        ny.lapt[346] = -208743674;
        ny.lapt[347] = -889473925;
        ny.lapt[348] = -1975303505;
        ny.lapt[349] = -2076181418;
        ny.lapt[350] = -356710376;
        ny.lapt[351] = -115050734;
        ny.lapt[352] = -1231400484;
        ny.lapt[353] = -865694502;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void execute(Runnable var1_1, oc var2_2, Runnable var3_3) {
        block113: {
            v0 /* !! */  = ny.ts;
            if (true) ** GOTO lbl5
            block70: while (true) {
                v0 /* !! */  = (long)(v1 - ny.lapv("laqx", laqb(int ), (int)9));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1489531230: {
                        v1 = ny.lapv("laqy", laqb(int ), (int)10);
                        continue block70;
                    }
                    case 305178906: {
                        break block70;
                    }
                    case 1348018578: {
                        v1 = ny.lapv("laqz", laqb(int ), (int)11);
                        continue block70;
                    }
                }
                break;
            }
            var6_4 = ny.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = ny.ts - ny.lapv("lara", laqb(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ny.lapv("larb", laps(int ), (int)15)) break;
                v2 /* !! */  = (long)ny.lapv("larc", laps(int ), (int)16);
            }
            var5_5 /* !! */  = ny.b;
            v3 /* !! */  = ny.ts;
            if (true) ** GOTO lbl25
            block72: while (true) {
                v3 /* !! */  = (long)(v4 - ny.lapv("lard", laqb(int ), (int)13));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1279054534: {
                        v4 = ny.lapv("lare", laqb(int ), (int)14);
                        continue block72;
                    }
                    case 305178906: {
                        break block72;
                    }
                    case 1938379727: {
                        v4 = ny.lapv("larf", laqb(int ), (int)15);
                        continue block72;
                    }
                }
                break;
            }
            var4_6 = ny.a;
            if (var6_4) {
                throw null;
lbl37:
                // 12 sources

                return;
            }
            if (var4_6 || var4_6) ** GOTO lbl37
            v5 /* !! */  = ny.ts;
            if (true) ** GOTO lbl44
            block74: while (true) {
                v5 /* !! */  = (long)(v6 - ny.lapv("larg", laqb(int ), (int)16));
lbl44:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -338494617: {
                        v6 = ny.lapv("larh", laqb(int ), (int)17);
                        continue block74;
                    }
                    case 305178906: {
                        break block74;
                    }
                    case 891979334: {
                        v6 = ny.lapv("lari", laqb(int ), (int)18);
                        continue block74;
                    }
                    case 1061841378: {
                        v6 = ny.lapv("larj", laqb(int ), (int)19);
                        continue block74;
                    }
                }
                break;
            }
            v7 /* !! */  = ny.ts;
            if (true) ** GOTO lbl60
            block75: while (true) {
                v7 /* !! */  = (long)(v8 - ny.lapv("lark", laqb(int ), (int)20));
lbl60:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -422584957: {
                        v8 = ny.lapv("larl", laqb(int ), (int)21);
                        continue block75;
                    }
                    case 305178906: {
                        break block75;
                    }
                    case 1734755624: {
                        v8 = ny.lapv("larm", laqb(int ), (int)22);
                        continue block75;
                    }
                    case 1781217703: {
                        v8 = ny.lapv("larn", laqb(int ), (int)23);
                        continue block75;
                    }
                }
                break;
            }
            if (this.phase == ny$Phase.IDLE) break block113;
            if (var4_6 || var4_6) ** GOTO lbl37
            return;
        }
        if (var4_6) ** GOTO lbl37
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_6) ** GOTO lbl37
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = ny.ts - ny.lapv("laro", laqb(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ny.lapv("larp", laps(int ), (int)17)) break;
                    v9 /* !! */  = (long)ny.lapv("larq", laps(int ), (int)18);
                }
                this.swapAction = var1_1;
                if (var4_6 || var4_6) ** GOTO lbl37
                if (var2_2 == null) ** GOTO lbl93
                v10 = var2_2;
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl110
lbl93:
                // 1 sources

                v11 /* !! */  = ny.ts;
                if (true) ** GOTO lbl97
                block77: while (true) {
                    v11 /* !! */  = (long)(v12 - ny.lapv("larr", laqb(int ), (int)25));
lbl97:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -813192698: {
                            v12 = ny.lapv("lars", laqb(int ), (int)26);
                            continue block77;
                        }
                        case 305178906: {
                            break block77;
                        }
                        case 870769795: {
                            v12 = ny.lapv("lart", laqb(int ), (int)27);
                            continue block77;
                        }
                        case 1883725405: {
                            v12 = ny.lapv("laru", laqb(int ), (int)28);
                            continue block77;
                        }
                    }
                    break;
                }
                v10 = oc.defaults();
lbl110:
                // 2 sources

                v13 /* !! */  = ny.ts;
                if (true) ** GOTO lbl114
                block78: while (true) {
                    v13 /* !! */  = (long)(ny.lapv("larw", laqb(int ), (int)30) - ny.lapv("larv", laqb(int ), (int)29));
lbl114:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -808935157: {
                            continue block78;
                        }
                        case 305178906: {
                            break block78;
                        }
                    }
                    break;
                }
                this.settings = v10;
                if (var4_6 || var4_6) ** GOTO lbl37
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = ny.ts - ny.lapv("larx", laqb(int ), (int)31)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ny.lapv("lary", laps(int ), (int)19)) break;
                    v14 /* !! */  = (long)ny.lapv("larz", laps(int ), (int)20);
                }
                this.onComplete = var3_3;
                if (var4_6 || var4_6) ** GOTO lbl37
                v15 /* !! */  = ny.ts;
                if (true) ** GOTO lbl132
                block80: while (true) {
                    v15 /* !! */  = (long)(v16 - ny.lapv("lasa", laqb(int ), (int)32));
lbl132:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -988472777: {
                            v16 = ny.lapv("lasb", laqb(int ), (int)33);
                            continue block80;
                        }
                        case 305178906: {
                            break block80;
                        }
                        case 1417564241: {
                            v16 = ny.lapv("lasc", laqb(int ), (int)34);
                            continue block80;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = ny.ts - ny.lapv("lasd", laqb(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ny.lapv("lase", laps(int ), (int)21)) break;
                    v17 /* !! */  = (long)ny.lapv("lasf", laps(int ), (int)22);
                }
                if (!this.settings.shouldStopMovement()) ** GOTO lbl178
                if (var4_6 || var4_6) ** GOTO lbl37
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = ny.ts - ny.lapv("lasg", laqb(int ), (int)36)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ny.lapv("lash", laps(int ), (int)23)) break;
                    v18 /* !! */  = (long)ny.lapv("lasi", laps(int ), (int)24);
                }
                v19 /* !! */  = ny.ts;
                if (true) ** GOTO lbl157
                block83: while (true) {
                    v19 /* !! */  = (long)(ny.lapv("lask", laqb(int ), (int)38) - ny.lapv("lasj", laqb(int ), (int)37));
lbl157:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -525496946: {
                            continue block83;
                        }
                        case 305178906: {
                            break block83;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = ny.ts - ny.lapv("lasl", laqb(int ), (int)39)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ny.lapv("lasm", laps(int ), (int)25)) break;
                    v20 /* !! */  = (long)ny.lapv("lasn", laps(int ), (int)26);
                }
                v21 = this.settings.randomPreStopDelay();
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_6 = ny.ts - ny.lapv("laso", laqb(int ), (int)40)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ny.lapv("lasp", laps(int ), (int)27)) break;
                    v22 /* !! */  = (long)ny.lapv("lasq", laps(int ), (int)28);
                }
                this.startPhase(ny$Phase.PRE_STOP, v21);
                if (var4_6) ** GOTO lbl37
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl206
lbl178:
                // 1 sources

                if (var4_6 || var4_6) ** GOTO lbl37
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = ny.ts - ny.lapv("lasr", laqb(int ), (int)41)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ny.lapv("lass", laps(int ), (int)29)) break;
                    v23 /* !! */  = (long)ny.lapv("last", laps(int ), (int)30);
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = ny.ts - ny.lapv("lasu", laqb(int ), (int)42)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ny.lapv("lasv", laps(int ), (int)31)) break;
                    v24 /* !! */  = (long)ny.lapv("lasw", laps(int ), (int)32);
                }
                v25 /* !! */  = ny.ts;
                if (true) ** GOTO lbl193
                block88: while (true) {
                    v25 /* !! */  = (long)(ny.lapv("lasy", laqb(int ), (int)44) - ny.lapv("lasx", laqb(int ), (int)43));
lbl193:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 305178906: {
                            break block88;
                        }
                        case 468730124: {
                            continue block88;
                        }
                    }
                    break;
                }
                v26 = this.settings.randomPreSwapDelay();
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = ny.ts - ny.lapv("lasz", laqb(int ), (int)45)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == ny.lapv("lata", laps(int ), (int)33)) break;
                    v27 /* !! */  = (long)ny.lapv("latb", laps(int ), (int)34);
                }
                this.startPhase(ny$Phase.PRE_SWAP, v26);
                if (var4_6) ** GOTO lbl37
lbl206:
                // 2 sources

                if (!var4_6 && !var4_6) ** break;
                ** continue;
                return;
            }
lbl209:
            // 2 sources

            case 0: {
                var5_5 /* !! */  = (int)ny.lapv("latc", laps(int ), (int)35);
                if (var6_4) {
                    throw null;
                }
            }
lbl213:
            // 5 sources

            case 1: {
                do {
                    var5_5 /* !! */  = (int)ny.lapv("latd", laps(int ), (int)36);
                } while (!var6_4);
                throw null;
            }
lbl218:
            // 2 sources

            case 2: {
                var5_5 /* !! */  = (int)ny.lapv("late", laps(int ), (int)37);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 3: {
                var5_5 /* !! */  = (int)ny.lapv("latf", laps(int ), (int)38);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl228:
            // 3 sources

            case 4: {
                do {
                    var5_5 /* !! */  = (int)ny.lapv("latg", laps(int ), (int)39);
                } while (!var6_4);
                throw null;
            }
lbl233:
            // 2 sources

            case 5: {
                var5_5 /* !! */  = (int)ny.lapv("lath", laps(int ), (int)40);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 6: {
                var5_5 /* !! */  = (int)ny.lapv("lati", laps(int ), (int)41);
                if (!var6_4) ** GOTO lbl209
                throw null;
            }
lbl242:
            // 2 sources

            case 7: {
                var5_5 /* !! */  = (int)ny.lapv("latj", laps(int ), (int)42);
                if (var6_4) {
                    throw null;
                }
            }
            case 8: {
                var5_5 /* !! */  = (int)ny.lapv("latk", laps(int ), (int)43);
                if (!var6_4) ** GOTO lbl242
                throw null;
            }
lbl250:
            // 2 sources

            case 9: {
                var5_5 /* !! */  = (int)ny.lapv("latl", laps(int ), (int)44);
                if (!var6_4) ** GOTO lbl218
                throw null;
            }
            case 10: {
                do {
                    var5_5 /* !! */  = (int)ny.lapv("latm", laps(int ), (int)45);
                } while (!var6_4);
                throw null;
            }
lbl259:
            // 2 sources

            case 11: {
                var5_5 /* !! */  = (int)ny.lapv("latn", laps(int ), (int)46);
                if (!var6_4) ** GOTO lbl228
                throw null;
            }
lbl263:
            // 2 sources

            case 12: {
                var5_5 /* !! */  = (int)ny.lapv("lato", laps(int ), (int)47);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl268:
            // 2 sources

            case 13: {
                var5_5 /* !! */  = (int)ny.lapv("latp", laps(int ), (int)48);
                if (!var6_4) ** GOTO lbl213
                throw null;
            }
            case 14: {
                var5_5 /* !! */  = (int)ny.lapv("latq", laps(int ), (int)49);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 15: {
                var5_5 /* !! */  = (int)ny.lapv("latr", laps(int ), (int)50);
                if (!var6_4) ** GOTO lbl268
                throw null;
            }
lbl281:
            // 3 sources

            case 16: {
                var5_5 /* !! */  = (int)ny.lapv("lats", laps(int ), (int)51);
                if (!var6_4) ** GOTO lbl233
                throw null;
            }
lbl285:
            // 3 sources

            case 17: {
                var5_5 /* !! */  = (int)ny.lapv("latt", laps(int ), (int)52);
                if (!var6_4) ** GOTO lbl250
                throw null;
            }
            case 18: {
                var5_5 /* !! */  = (int)ny.lapv("latu", laps(int ), (int)53);
                if (!var6_4) ** GOTO lbl228
                throw null;
            }
lbl293:
            // 2 sources

            case 19: {
                var5_5 /* !! */  = (int)ny.lapv("latv", laps(int ), (int)54);
                if (!var6_4) ** GOTO lbl285
                throw null;
            }
            case 20: {
                var5_5 /* !! */  = (int)ny.lapv("latw", laps(int ), (int)55);
                if (!var6_4) ** GOTO lbl285
                throw null;
            }
            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)ny.lapv("latx", laps(int ), (int)56);
                    if (!var6_4) ** GOTO lbl213
                    throw null;
                }
            }
            case 22: 
        }
        var5_5 /* !! */  = (int)ny.lapv("laty", laps(int ), (int)57);
        ** while (!var6_4)
lbl309:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ny$Phase getPhase() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ny.ts - ny.lapv("lbkg", laqb(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ny.lapv("lbki", laps(int ), (int)346)) break;
            v0 /* !! */  = (long)ny.lapv("lbkj", laps(int ), (int)347);
        }
        var3_1 = ny.c;
        v1 /* !! */  = ny.ts;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(v2 - ny.lapv("lbkl", laqb(int ), (int)117));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1702997967: {
                    v2 = ny.lapv("lbkn", laqb(int ), (int)118);
                    continue block11;
                }
                case -1155646275: {
                    v2 = ny.lapv("lbko", laqb(int ), (int)119);
                    continue block11;
                }
                case 305178906: {
                    break block11;
                }
                case 1703946976: {
                    v2 = ny.lapv("lbkp", laqb(int ), (int)120);
                    continue block11;
                }
            }
            break;
        }
        var2_2 = ny.b;
        v3 /* !! */  = ny.ts;
        if (true) ** GOTO lbl29
        block12: while (true) {
            v3 /* !! */  = (long)(ny.lapv("lbkt", laqb(int ), (int)122) - ny.lapv("lbkr", laqb(int ), (int)121));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 305178906: {
                    break block12;
                }
                case 1393892708: {
                    continue block12;
                }
            }
            break;
        }
        var1_3 = ny.a;
        if (var3_1) {
            throw null;
lbl37:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl40:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ny.ts - ny.lapv("lbkv", laqb(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ny.lapv("lbkw", laps(int ), (int)348)) break;
            v4 /* !! */  = (long)ny.lapv("lbky", laps(int ), (int)349);
        }
        return this.phase;
    }

    private static /* synthetic */ void lbsq() {
        ny.lapt[200] = 1675939838;
        ny.lapt[201] = -935494266;
        ny.lapt[202] = -1068013110;
        ny.lapt[203] = 1812564606;
        ny.lapt[204] = -1147498983;
        ny.lapt[205] = 1554404616;
        ny.lapt[206] = 826279327;
        ny.lapt[207] = -1901091013;
        ny.lapt[208] = 1790681302;
        ny.lapt[209] = 1476654337;
        ny.lapt[210] = -585177424;
        ny.lapt[211] = -1307035979;
        ny.lapt[212] = -289801394;
        ny.lapt[213] = 8010441;
        ny.lapt[214] = 255207441;
        ny.lapt[215] = 1426877330;
        ny.lapt[216] = -728965982;
        ny.lapt[217] = -1666510031;
        ny.lapt[218] = -1974296284;
        ny.lapt[219] = 836799610;
        ny.lapt[220] = 54596832;
        ny.lapt[221] = -1477912591;
        ny.lapt[222] = -93281843;
        ny.lapt[223] = 438538057;
        ny.lapt[224] = 1566296667;
        ny.lapt[225] = 1896830474;
        ny.lapt[226] = 1399225582;
        ny.lapt[227] = 1269745485;
        ny.lapt[228] = -1411974148;
        ny.lapt[229] = 972262506;
        ny.lapt[230] = -117977511;
        ny.lapt[231] = 503881817;
        ny.lapt[232] = -1808842900;
        ny.lapt[233] = 1206203285;
        ny.lapt[234] = 897489292;
        ny.lapt[235] = 2058013882;
        ny.lapt[236] = 2087618718;
        ny.lapt[237] = 96248527;
        ny.lapt[238] = -947542351;
        ny.lapt[239] = -1158842961;
        ny.lapt[240] = -1667763219;
        ny.lapt[241] = -1063080005;
        ny.lapt[242] = -293487619;
        ny.lapt[243] = 2019442287;
        ny.lapt[244] = 1083498318;
        ny.lapt[245] = 23562661;
        ny.lapt[246] = 26061502;
        ny.lapt[247] = -513593703;
        ny.lapt[248] = 419682424;
        ny.lapt[249] = -1743208809;
        ny.lapt[250] = 182924954;
        ny.lapt[251] = -646520437;
        ny.lapt[252] = -531754231;
        ny.lapt[253] = 500555100;
        ny.lapt[254] = -74483473;
        ny.lapt[255] = -373512186;
        ny.lapt[256] = -825351124;
        ny.lapt[257] = 1945775031;
        ny.lapt[258] = 1035026705;
        ny.lapt[259] = 1486841325;
        ny.lapt[260] = -1438275952;
        ny.lapt[261] = -1618808138;
        ny.lapt[262] = 1995109311;
        ny.lapt[263] = -1596710829;
        ny.lapt[264] = -1057600687;
        ny.lapt[265] = -420310311;
        ny.lapt[266] = -1618467224;
        ny.lapt[267] = 1640058159;
        ny.lapt[268] = -716540650;
        ny.lapt[269] = -1146083325;
        ny.lapt[270] = 795956876;
        ny.lapt[271] = -82066464;
        ny.lapt[272] = -110064384;
        ny.lapt[273] = 48802646;
        ny.lapt[274] = -473840598;
        ny.lapt[275] = 1375603036;
        ny.lapt[276] = 814112518;
        ny.lapt[277] = 807258874;
        ny.lapt[278] = 234652504;
        ny.lapt[279] = -277381178;
        ny.lapt[280] = 1759298946;
        ny.lapt[281] = 130162809;
        ny.lapt[282] = 1107509180;
        ny.lapt[283] = 664771604;
        ny.lapt[284] = -598842456;
        ny.lapt[285] = 1538188403;
        ny.lapt[286] = -1365957631;
        ny.lapt[287] = -1023774673;
        ny.lapt[288] = -1522813263;
        ny.lapt[289] = -355373891;
        ny.lapt[290] = -3819838;
        ny.lapt[291] = 1088075415;
        ny.lapt[292] = 530202847;
        ny.lapt[293] = -1663998356;
        ny.lapt[294] = -19948928;
        ny.lapt[295] = 1168814059;
        ny.lapt[296] = -1366402186;
        ny.lapt[297] = 603654091;
        ny.lapt[298] = -2054554044;
        ny.lapt[299] = -1515402984;
    }

    private static /* synthetic */ void lbtr() {
        ny.laqc[0] = 1567636530437177833L;
        ny.laqc[1] = 4841173410748841215L;
        ny.laqc[2] = 398541126915184145L;
        ny.laqc[3] = -6708911940428001871L;
        ny.laqc[4] = 920433385813369796L;
        ny.laqc[5] = 3609891024615330210L;
        ny.laqc[6] = -316099993560492365L;
        ny.laqc[7] = -6683697922477692950L;
        ny.laqc[8] = 5279820511551002193L;
        ny.laqc[9] = -3704115533035328466L;
        ny.laqc[10] = 8220069822085869753L;
        ny.laqc[11] = 3101505872754111302L;
        ny.laqc[12] = -3862058264872246231L;
        ny.laqc[13] = -4101567026739640470L;
        ny.laqc[14] = -234579348382728453L;
        ny.laqc[15] = 4626652527561877877L;
        ny.laqc[16] = 6441280919536735373L;
        ny.laqc[17] = 8265626775782227897L;
        ny.laqc[18] = 5424692051041928845L;
        ny.laqc[19] = -66402305297723569L;
        ny.laqc[20] = 1894976801858578147L;
        ny.laqc[21] = 6771540670078552249L;
        ny.laqc[22] = 6866705913685364341L;
        ny.laqc[23] = 2843403574341043502L;
        ny.laqc[24] = -656569585944671991L;
        ny.laqc[25] = 1659100347486299278L;
        ny.laqc[26] = 8464702590669787404L;
        ny.laqc[27] = -3927049413732167348L;
        ny.laqc[28] = -3722080373257401772L;
        ny.laqc[29] = 6483862021659299191L;
        ny.laqc[30] = -3063640391013187185L;
        ny.laqc[31] = -8544736161795212703L;
        ny.laqc[32] = 356217355550638551L;
        ny.laqc[33] = 1921301373350625817L;
        ny.laqc[34] = -8845633512848530948L;
        ny.laqc[35] = 4873701184593843581L;
        ny.laqc[36] = 6978359498208430509L;
        ny.laqc[37] = 2557310489154631408L;
        ny.laqc[38] = -3497022575242132617L;
        ny.laqc[39] = 151588916940143333L;
        ny.laqc[40] = -576206731301547397L;
        ny.laqc[41] = 4912254242623987238L;
        ny.laqc[42] = 3323625835758898096L;
        ny.laqc[43] = -2597821734649676238L;
        ny.laqc[44] = 5069368583243067693L;
        ny.laqc[45] = 6757943047760340959L;
        ny.laqc[46] = 1575464674501642680L;
        ny.laqc[47] = 4140709320236522080L;
        ny.laqc[48] = -5294421754023186232L;
        ny.laqc[49] = -7985409832842834021L;
        ny.laqc[50] = -3383923829799378266L;
        ny.laqc[51] = 2183265671018441212L;
        ny.laqc[52] = 7648327826306240138L;
        ny.laqc[53] = 3671560195733034256L;
        ny.laqc[54] = 4948835837877340772L;
        ny.laqc[55] = 6220823108646424802L;
        ny.laqc[56] = -3429559560580733014L;
        ny.laqc[57] = 7646220701439213333L;
        ny.laqc[58] = 8814543379909038397L;
        ny.laqc[59] = 5237646265015196766L;
        ny.laqc[60] = 9199198272941211267L;
        ny.laqc[61] = 870992210247232822L;
        ny.laqc[62] = -4424084069779235487L;
        ny.laqc[63] = -2335706203026621332L;
        ny.laqc[64] = -6220730650787647018L;
        ny.laqc[65] = 479823768380864967L;
        ny.laqc[66] = -4647674879813856559L;
        ny.laqc[67] = 1809082911884702460L;
        ny.laqc[68] = 8718912951276018378L;
        ny.laqc[69] = 7281937094830599178L;
        ny.laqc[70] = 326189684793636752L;
        ny.laqc[71] = 3116771914611306505L;
        ny.laqc[72] = -2016015703492943385L;
        ny.laqc[73] = 2310959149036556126L;
        ny.laqc[74] = 4086599704444830818L;
        ny.laqc[75] = 8278276254141428358L;
        ny.laqc[76] = 4437288266297494086L;
        ny.laqc[77] = -2400590462485308958L;
        ny.laqc[78] = -7359351217484636141L;
        ny.laqc[79] = -6544795158042339328L;
        ny.laqc[80] = -6111753785284820704L;
        ny.laqc[81] = 3551074478514804499L;
        ny.laqc[82] = 4555449923111790582L;
        ny.laqc[83] = 1777981649796349348L;
        ny.laqc[84] = -6712031518657626800L;
        ny.laqc[85] = 202122923466899704L;
        ny.laqc[86] = 3368286320934112554L;
        ny.laqc[87] = 5003114021998598634L;
        ny.laqc[88] = 2789418352628423641L;
        ny.laqc[89] = -3823093356672804575L;
        ny.laqc[90] = -4814881119300474500L;
        ny.laqc[91] = -6120879713404209265L;
        ny.laqc[92] = -8294844882278627695L;
        ny.laqc[93] = -8233486020354007308L;
        ny.laqc[94] = -5011063379868956291L;
        ny.laqc[95] = 8236643938500809412L;
        ny.laqc[96] = -7939587497862348414L;
        ny.laqc[97] = 3271400081481696848L;
        ny.laqc[98] = -8541230422172211615L;
        ny.laqc[99] = 5230194401287285053L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ny.ts - ny.lapv("lbei", laqb(int ), (int)69)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ny.lapv("lbek", laps(int ), (int)297)) break;
            v0 /* !! */  = (long)ny.lapv("lbem", laps(int ), (int)298);
        }
        var3_1 = ny.c;
        v1 /* !! */  = ny.ts;
        if (true) ** GOTO lbl11
        block46: while (true) {
            v1 /* !! */  = (long)(v2 - ny.lapv("lbeo", laqb(int ), (int)70));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 305178906: {
                    break block46;
                }
                case 762439409: {
                    v2 = ny.lapv("lbeq", laqb(int ), (int)71);
                    continue block46;
                }
                case 1734747332: {
                    v2 = ny.lapv("lber", laqb(int ), (int)72);
                    continue block46;
                }
                case 2024471562: {
                    v2 = ny.lapv("lbet", laqb(int ), (int)73);
                    continue block46;
                }
            }
            break;
        }
        var2_2 /* !! */  = ny.b;
        v3 /* !! */  = ny.ts;
        if (true) ** GOTO lbl28
        block47: while (true) {
            v3 /* !! */  = (long)(v4 - ny.lapv("lbeu", laqb(int ), (int)74));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2018593113: {
                    v4 = ny.lapv("lbew", laqb(int ), (int)75);
                    continue block47;
                }
                case -1293423500: {
                    v4 = ny.lapv("lbex", laqb(int ), (int)76);
                    continue block47;
                }
                case 305178906: {
                    break block47;
                }
            }
            break;
        }
        var1_3 = ny.a;
        if (var3_1) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        v5 /* !! */  = ny.ts;
        if (true) ** GOTO lbl47
        block49: while (true) {
            v5 /* !! */  = (long)(v6 - ny.lapv("lbfa", laqb(int ), (int)77));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -947552022: {
                    v6 = ny.lapv("lbfb", laqb(int ), (int)78);
                    continue block49;
                }
                case 305178906: {
                    break block49;
                }
                case 667350798: {
                    v6 = ny.lapv("lbfc", laqb(int ), (int)79);
                    continue block49;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = ny.ts - ny.lapv("lbfe", laqb(int ), (int)80)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ny.lapv("lbff", laps(int ), (int)299)) break;
            v7 /* !! */  = (long)ny.lapv("lbfh", laps(int ), (int)300);
        }
        this.phase = ny$Phase.IDLE;
        if (var1_3 || var1_3) ** GOTO lbl40
        v8 /* !! */  = ny.ts;
        if (true) ** GOTO lbl67
        block51: while (true) {
            v8 /* !! */  = (long)(ny.lapv("lbfl", laqb(int ), (int)82) - ny.lapv("lbfj", laqb(int ), (int)81));
lbl67:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 305178906: {
                    break block51;
                }
                case 703991226: {
                    continue block51;
                }
            }
            break;
        }
        this.swapAction = null;
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = ny.ts - ny.lapv("lbfn", laqb(int ), (int)83)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ny.lapv("lbfp", laps(int ), (int)301)) break;
                    v9 /* !! */  = (long)ny.lapv("lbfq", laps(int ), (int)302);
                }
                this.onComplete = null;
                if (var1_3 || var1_3) ** GOTO lbl40
                v10 /* !! */  = ny.ts;
                if (true) ** GOTO lbl89
                block53: while (true) {
                    v10 /* !! */  = (long)(v11 - ny.lapv("lbfs", laqb(int ), (int)84));
lbl89:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1547793571: {
                            v11 = ny.lapv("lbft", laqb(int ), (int)85);
                            continue block53;
                        }
                        case 305178906: {
                            break block53;
                        }
                        case 1261402796: {
                            v11 = ny.lapv("lbfv", laqb(int ), (int)86);
                            continue block53;
                        }
                    }
                    break;
                }
                v12 /* !! */  = ny.ts;
                if (true) ** GOTO lbl102
                block54: while (true) {
                    v12 /* !! */  = (long)(v13 - ny.lapv("lbfx", laqb(int ), (int)87));
lbl102:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1206518526: {
                            v13 = ny.lapv("lbfy", laqb(int ), (int)88);
                            continue block54;
                        }
                        case 85787276: {
                            v13 = ny.lapv("lbga", laqb(int ), (int)89);
                            continue block54;
                        }
                        case 305178906: {
                            break block54;
                        }
                        case 522595646: {
                            v13 = ny.lapv("lbgc", laqb(int ), (int)90);
                            continue block54;
                        }
                    }
                    break;
                }
                this.movement.reset();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ny.lapv("lbgd", laps(int ), (int)303);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl123:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ny.lapv("lbge", laps(int ), (int)304);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 2: {
                var2_2 /* !! */  = (int)ny.lapv("lbgf", laps(int ), (int)305);
                if (!var3_1) ** GOTO lbl123
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ny.lapv("lbgg", laps(int ), (int)306);
                    if (!var3_1) ** GOTO lbl123
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)ny.lapv("lbgi", laps(int ), (int)307);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl142:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)ny.lapv("lbgj", laps(int ), (int)308);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)ny.lapv("lbgl", laps(int ), (int)309);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 7: {
                do {
                    var2_2 /* !! */  = (int)ny.lapv("lbgm", laps(int ), (int)310);
                } while (!var3_1);
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ny.lapv("lbgo", laps(int ), (int)311);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl162:
            // 3 sources

            case 9: {
                do {
                    var2_2 /* !! */  = (int)ny.lapv("lbgq", laps(int ), (int)312);
                } while (!var3_1);
                throw null;
            }
lbl167:
            // 4 sources

            case 10: {
                var2_2 /* !! */  = (int)ny.lapv("lbgr", laps(int ), (int)313);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)ny.lapv("lbgt", laps(int ), (int)314);
        ** while (!var3_1)
lbl174:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void tick() {
        block68: {
            block67: {
                block66: {
                    var6_1 = ny.c;
                    var5_2 /* !! */  = ny.b;
                    var4_3 = ny.a;
                    if (var6_1) {
                        throw null;
lbl6:
                        // 17 sources

                        return;
                    }
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (this.phase == ny$Phase.IDLE) break block66;
                    if (var4_3) ** GOTO lbl6
                    if (this.phase != ny$Phase.FINISHED) break block67;
                    if (var4_3) ** GOTO lbl6
                }
                if (var4_3 || var4_3) ** GOTO lbl6
                return;
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            if (ny.mc.field_1724 != null) break block68;
            if (var4_3 || var4_3) ** GOTO lbl6
            this.reset();
            if (var4_3 || var4_3) ** GOTO lbl6
            return;
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var1_4 /* !! */  = ny.lapv("latz", laps(int ), (int)58);
                if (var4_3 || var4_3) ** GOTO lbl6
                var2_5 = ny.lapv("laua", laps(int ), (int)59);
                if (var4_3 || var4_3) ** GOTO lbl6
                var3_6 = ny.lapv("laub", laps(int ), (int)60);
                if (var4_3) ** GOTO lbl6
                do {
                    if (var4_3 || var4_3) ** GOTO lbl6
                    if (var1_4 /* !! */  == false) ** GOTO lbl46
                    if (var4_3) ** GOTO lbl6
                    if (var3_6 >= var2_5) ** GOTO lbl46
                    if (var4_3 || var4_3) ** GOTO lbl6
                    ++var3_6;
                    if (var4_3 || var4_3) ** GOTO lbl6
                    var1_4 /* !! */  = (CallSite)this.processPhase();
                    if (var4_3) ** GOTO lbl6
                } while (!var6_1);
                throw null;
lbl46:
                // 2 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return;
            }
lbl49:
            // 3 sources

            case 0: {
                var5_2 /* !! */  = (int)ny.lapv("lauc", laps(int ), (int)61);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 1: {
                var5_2 /* !! */  = (int)ny.lapv("laud", laps(int ), (int)62);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 2: {
                var5_2 /* !! */  = (int)ny.lapv("laue", laps(int ), (int)63);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var5_2 /* !! */  = (int)ny.lapv("lauf", laps(int ), (int)64);
                    if (!var6_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl69:
            // 2 sources

            case 4: {
                var5_2 /* !! */  = (int)ny.lapv("laug", laps(int ), (int)65);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl74:
            // 2 sources

            case 5: {
                var5_2 /* !! */  = (int)ny.lapv("lauh", laps(int ), (int)66);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl79:
            // 4 sources

            case 6: {
                var5_2 /* !! */  = (int)ny.lapv("laui", laps(int ), (int)67);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 7: {
                var5_2 /* !! */  = (int)ny.lapv("lauj", laps(int ), (int)68);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl89:
            // 2 sources

            case 8: {
                do {
                    var5_2 /* !! */  = (int)ny.lapv("lauk", laps(int ), (int)69);
                } while (!var6_1);
                throw null;
            }
lbl94:
            // 3 sources

            case 9: {
                var5_2 /* !! */  = (int)ny.lapv("laul", laps(int ), (int)70);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
            case 10: {
                var5_2 /* !! */  = (int)ny.lapv("laum", laps(int ), (int)71);
                if (!var6_1) ** GOTO lbl89
                throw null;
            }
            case 11: {
                var5_2 /* !! */  = (int)ny.lapv("laun", laps(int ), (int)72);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl108:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)ny.lapv("lauo", laps(int ), (int)73);
                if (!var6_1) ** GOTO lbl49
                throw null;
            }
            case 13: {
                var5_2 /* !! */  = (int)ny.lapv("laup", laps(int ), (int)74);
                if (!var6_1) ** GOTO lbl69
                throw null;
            }
            case 14: {
                var5_2 /* !! */  = (int)ny.lapv("lauq", laps(int ), (int)75);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl121:
            // 4 sources

            case 15: {
                var5_2 /* !! */  = (int)ny.lapv("laur", laps(int ), (int)76);
                if (!var6_1) ** GOTO lbl49
                throw null;
            }
            case 16: {
                var5_2 /* !! */  = (int)ny.lapv("laus", laps(int ), (int)77);
                if (!var6_1) ** GOTO lbl79
                throw null;
            }
lbl129:
            // 2 sources

            case 17: {
                var5_2 /* !! */  = (int)ny.lapv("laut", laps(int ), (int)78);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl134:
            // 4 sources

            case 18: {
                var5_2 /* !! */  = (int)ny.lapv("lauu", laps(int ), (int)79);
                if (!var6_1) ** GOTO lbl129
                throw null;
            }
lbl138:
            // 3 sources

            case 19: {
                var5_2 /* !! */  = (int)ny.lapv("lauv", laps(int ), (int)80);
                if (!var6_1) ** GOTO lbl79
                throw null;
            }
lbl142:
            // 2 sources

            case 20: {
                var5_2 /* !! */  = (int)ny.lapv("lauw", laps(int ), (int)81);
                if (!var6_1) ** GOTO lbl121
                throw null;
            }
            case 21: {
                var5_2 /* !! */  = (int)ny.lapv("laux", laps(int ), (int)82);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 22: {
                var5_2 /* !! */  = (int)ny.lapv("lauy", laps(int ), (int)83);
                if (!var6_1) ** GOTO lbl74
                throw null;
            }
            case 23: {
                var5_2 /* !! */  = (int)ny.lapv("lauz", laps(int ), (int)84);
                if (!var6_1) ** GOTO lbl134
                throw null;
            }
            case 24: {
                var5_2 /* !! */  = (int)ny.lapv("lava", laps(int ), (int)85);
                if (!var6_1) ** GOTO lbl79
                throw null;
            }
lbl163:
            // 2 sources

            case 25: {
                var5_2 /* !! */  = (int)ny.lapv("lavb", laps(int ), (int)86);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 26: {
                var5_2 /* !! */  = (int)ny.lapv("lavc", laps(int ), (int)87);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl173:
            // 3 sources

            case 27: {
                var5_2 /* !! */  = (int)ny.lapv("lavd", laps(int ), (int)88);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl178:
            // 4 sources

            case 28: {
                var5_2 /* !! */  = (int)ny.lapv("lave", laps(int ), (int)89);
                if (!var6_1) ** GOTO lbl173
                throw null;
            }
lbl182:
            // 2 sources

            case 29: {
                var5_2 /* !! */  = (int)ny.lapv("lavf", laps(int ), (int)90);
                if (!var6_1) ** GOTO lbl121
                throw null;
            }
lbl186:
            // 2 sources

            case 30: {
                var5_2 /* !! */  = (int)ny.lapv("lavg", laps(int ), (int)91);
                if (!var6_1) ** GOTO lbl108
                throw null;
            }
lbl190:
            // 2 sources

            case 31: {
                var5_2 /* !! */  = (int)ny.lapv("lavh", laps(int ), (int)92);
                if (!var6_1) ** GOTO lbl94
                throw null;
            }
            case 32: 
        }
        var5_2 /* !! */  = (int)ny.lapv("lavi", laps(int ), (int)93);
        ** while (!var6_1)
lbl197:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startPhase(ny$Phase var1_1, int var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ny.ts - ny.lapv("lbbn", laqb(int ), (int)46)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ny.lapv("lbbo", laps(int ), (int)254)) break;
            v0 /* !! */  = (long)ny.lapv("lbbp", laps(int ), (int)255);
        }
        var5_3 = ny.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ny.ts - ny.lapv("lbbq", laqb(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ny.lapv("lbbr", laps(int ), (int)256)) break;
            v1 /* !! */  = (long)ny.lapv("lbbs", laps(int ), (int)257);
        }
        var4_4 /* !! */  = ny.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ny.ts - ny.lapv("lbbt", laqb(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ny.lapv("lbbu", laps(int ), (int)258)) break;
            v2 /* !! */  = (long)ny.lapv("lbbv", laps(int ), (int)259);
        }
        var3_5 = ny.a;
        if (var5_3) {
            throw null;
lbl21:
            // 4 sources

            return;
        }
        if (var3_5 || var3_5) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = ny.ts - ny.lapv("lbbw", laqb(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ny.lapv("lbbx", laps(int ), (int)260)) break;
            v3 /* !! */  = (long)ny.lapv("lbby", laps(int ), (int)261);
        }
        this.phase = var1_1;
        if (var3_5 || var3_5) ** GOTO lbl21
        v4 /* !! */  = ny.ts;
        if (true) ** GOTO lbl35
        block27: while (true) {
            v4 /* !! */  = (long)(v5 - ny.lapv("lbbz", laqb(int ), (int)50));
lbl35:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1586255325: {
                    v5 = ny.lapv("lbca", laqb(int ), (int)51);
                    continue block27;
                }
                case 269295773: {
                    v5 = ny.lapv("lbcb", laqb(int ), (int)52);
                    continue block27;
                }
                case 305178906: {
                    break block27;
                }
            }
            break;
        }
        v6 = System.currentTimeMillis();
        v7 /* !! */  = ny.ts;
        if (true) ** GOTO lbl49
        block28: while (true) {
            v7 /* !! */  = (long)(v8 - ny.lapv("lbcc", laqb(int ), (int)53));
lbl49:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 163180137: {
                    v8 = ny.lapv("lbcd", laqb(int ), (int)54);
                    continue block28;
                }
                case 305178906: {
                    break block28;
                }
                case 1800884168: {
                    v8 = ny.lapv("lbce", laqb(int ), (int)55);
                    continue block28;
                }
            }
            break;
        }
        this.phaseStartTime = v6;
        if (var3_5 || var3_5) ** GOTO lbl21
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = ny.ts - ny.lapv("lbcf", laqb(int ), (int)56)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ny.lapv("lbcg", laps(int ), (int)262)) break;
            v9 /* !! */  = (long)ny.lapv("lbch", laps(int ), (int)263);
        }
        this.currentDelay = var2_2;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5 || var3_5) ** continue;
                return;
            }
lbl71:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)ny.lapv("lbci", laps(int ), (int)264);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl91
            }
lbl76:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)ny.lapv("lbcj", laps(int ), (int)265);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 2: {
                var4_4 /* !! */  = (int)ny.lapv("lbck", laps(int ), (int)266);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 3: {
                var4_4 /* !! */  = (int)ny.lapv("lbcl", laps(int ), (int)267);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl91:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)ny.lapv("lbcm", laps(int ), (int)268);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl102
                    break;
                }
            }
lbl97:
            // 3 sources

            case 5: {
                do {
                    var4_4 /* !! */  = (int)ny.lapv("lbcn", laps(int ), (int)269);
                } while (!var5_3);
                throw null;
            }
lbl102:
            // 2 sources

            case 6: {
                var4_4 /* !! */  = (int)ny.lapv("lbco", laps(int ), (int)270);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 7: {
                var4_4 /* !! */  = (int)ny.lapv("lbcp", laps(int ), (int)271);
                if (!var5_3) ** GOTO lbl71
                throw null;
            }
lbl111:
            // 3 sources

            case 8: {
                var4_4 /* !! */  = (int)ny.lapv("lbcq", laps(int ), (int)272);
                if (!var5_3) ** GOTO lbl76
                throw null;
            }
            case 9: 
        }
        var4_4 /* !! */  = (int)ny.lapv("lbcr", laps(int ), (int)273);
        ** while (!var5_3)
lbl118:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lbug() {
        ny.laqd[100] = 4387256218258640300L;
        ny.laqd[101] = -230675747887272374L;
        ny.laqd[102] = -4940589746107527206L;
        ny.laqd[103] = 368754644768628616L;
        ny.laqd[104] = -2352836916468976489L;
        ny.laqd[105] = -1646268611468913351L;
        ny.laqd[106] = -8017006829690437386L;
        ny.laqd[107] = -8571804468614514552L;
        ny.laqd[108] = -1804626733092746837L;
        ny.laqd[109] = 3160519950656310254L;
        ny.laqd[110] = 8909052094673536122L;
        ny.laqd[111] = -1967450608292092563L;
        ny.laqd[112] = 5547585673542317038L;
        ny.laqd[113] = 7160654372282454187L;
        ny.laqd[114] = 1005761263977045810L;
        ny.laqd[115] = 2465588015753913532L;
        ny.laqd[116] = 3168973448585148134L;
        ny.laqd[117] = 8593840775969937613L;
        ny.laqd[118] = 3083408788050205325L;
        ny.laqd[119] = 5034302657221533020L;
        ny.laqd[120] = 8309007382333592192L;
        ny.laqd[121] = 9081243680058432227L;
        ny.laqd[122] = 2558509194656109807L;
        ny.laqd[123] = -7815992352177915027L;
    }

    private static /* synthetic */ void lbto() {
        ny.lapu[300] = -1238689018;
        ny.lapu[301] = 1692027853;
        ny.lapu[302] = -1658346531;
        ny.lapu[303] = 854489746;
        ny.lapu[304] = 494341089;
        ny.lapu[305] = 463560055;
        ny.lapu[306] = 149938289;
        ny.lapu[307] = -682619189;
        ny.lapu[308] = -241068185;
        ny.lapu[309] = 1807827472;
        ny.lapu[310] = 1997262219;
        ny.lapu[311] = -1230580870;
        ny.lapu[312] = -975367811;
        ny.lapu[313] = -1614227306;
        ny.lapu[314] = 291309542;
        ny.lapu[315] = 2016465223;
        ny.lapu[316] = 777454349;
        ny.lapu[317] = 202331401;
        ny.lapu[318] = -704878686;
        ny.lapu[319] = 619906523;
        ny.lapu[320] = 490388106;
        ny.lapu[321] = 514549703;
        ny.lapu[322] = -1075364212;
        ny.lapu[323] = 308725303;
        ny.lapu[324] = 1352071948;
        ny.lapu[325] = 806290816;
        ny.lapu[326] = 1503755526;
        ny.lapu[327] = -722055429;
        ny.lapu[328] = -913421267;
        ny.lapu[329] = -1172991045;
        ny.lapu[330] = 1635331226;
        ny.lapu[331] = 267915841;
        ny.lapu[332] = -843531524;
        ny.lapu[333] = 1800938724;
        ny.lapu[334] = 183826123;
        ny.lapu[335] = 135030165;
        ny.lapu[336] = -878393214;
        ny.lapu[337] = -1678697940;
        ny.lapu[338] = -639348861;
        ny.lapu[339] = -184485345;
        ny.lapu[340] = 2056392563;
        ny.lapu[341] = 891033081;
        ny.lapu[342] = 819116198;
        ny.lapu[343] = -296749061;
        ny.lapu[344] = 1362719285;
        ny.lapu[345] = -1609758038;
        ny.lapu[346] = 208743673;
        ny.lapu[347] = 1752145320;
        ny.lapu[348] = 1975303504;
        ny.lapu[349] = -1024932668;
        ny.lapu[350] = -356710375;
        ny.lapu[351] = -115050736;
        ny.lapu[352] = -1231400484;
        ny.lapu[353] = -865694502;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cancel() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ny.ts - ny.lapv("lbcs", laqb(int ), (int)57)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ny.lapv("lbct", laps(int ), (int)274)) break;
            v0 /* !! */  = (long)ny.lapv("lbcu", laps(int ), (int)275);
        }
        var3_1 = ny.c;
        v1 /* !! */  = ny.ts;
        if (true) ** GOTO lbl11
        block24: while (true) {
            v1 /* !! */  = (long)(ny.lapv("lbcw", laqb(int ), (int)59) - ny.lapv("lbcv", laqb(int ), (int)58));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1545933197: {
                    continue block24;
                }
                case 305178906: {
                    break block24;
                }
            }
            break;
        }
        var2_2 /* !! */  = ny.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ny.ts - ny.lapv("lbcx", laqb(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ny.lapv("lbcy", laps(int ), (int)276)) break;
            v2 /* !! */  = (long)ny.lapv("lbcz", laps(int ), (int)277);
        }
        var1_3 = ny.a;
        if (var3_1) {
            throw null;
lbl25:
            // 5 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ny.ts - ny.lapv("lbda", laqb(int ), (int)61)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ny.lapv("lbdb", laps(int ), (int)278)) break;
            v3 /* !! */  = (long)ny.lapv("lbdc", laps(int ), (int)279);
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = ny.ts - ny.lapv("lbdd", laqb(int ), (int)62)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ny.lapv("lbde", laps(int ), (int)280)) break;
            v4 /* !! */  = (long)ny.lapv("lbdf", laps(int ), (int)281);
        }
        if (!this.movement.isBlocked()) ** GOTO lbl66
        if (var1_3 || var1_3) ** GOTO lbl25
        v5 /* !! */  = ny.ts;
        if (true) ** GOTO lbl44
        block29: while (true) {
            v5 /* !! */  = (long)(v6 - ny.lapv("lbdg", laqb(int ), (int)63));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 192193577: {
                    v6 = ny.lapv("lbdh", laqb(int ), (int)64);
                    continue block29;
                }
                case 305178906: {
                    break block29;
                }
                case 620518688: {
                    v6 = ny.lapv("lbdi", laqb(int ), (int)65);
                    continue block29;
                }
                case 1408113929: {
                    v6 = ny.lapv("lbdj", laqb(int ), (int)66);
                    continue block29;
                }
            }
            break;
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = ny.ts - ny.lapv("lbdk", laqb(int ), (int)67)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ny.lapv("lbdl", laps(int ), (int)282)) break;
            v7 /* !! */  = (long)ny.lapv("lbdm", laps(int ), (int)283);
        }
        this.movement.restoreFromCurrent();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
lbl66:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl25
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = ny.ts - ny.lapv("lbdn", laqb(int ), (int)68)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ny.lapv("lbdo", laps(int ), (int)284)) break;
                    v8 /* !! */  = (long)ny.lapv("lbdp", laps(int ), (int)285);
                }
                this.reset();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ny.lapv("lbdq", laps(int ), (int)286);
                if (var3_1) {
                    throw null;
                }
            }
lbl80:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ny.lapv("lbdr", laps(int ), (int)287);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ny.lapv("lbds", laps(int ), (int)288);
                if (!var3_1) break;
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)ny.lapv("lbdt", laps(int ), (int)289);
                } while (!var3_1);
                throw null;
            }
lbl93:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ny.lapv("lbdu", laps(int ), (int)290);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl98:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ny.lapv("lbdv", laps(int ), (int)291);
                    if (!var3_1) ** GOTO lbl93
                    throw null;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)ny.lapv("lbdw", laps(int ), (int)292);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 7: {
                var2_2 /* !! */  = (int)ny.lapv("lbdx", laps(int ), (int)293);
                if (!var3_1) break;
                throw null;
            }
lbl112:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ny.lapv("lbdy", laps(int ), (int)294);
                if (!var3_1) ** GOTO lbl98
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ny.lapv("lbdz", laps(int ), (int)295);
                if (!var3_1) ** GOTO lbl80
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ny.lapv("lbea", laps(int ), (int)296);
        ** while (!var3_1)
lbl123:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    private boolean processPhase() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 9[SWITCH]
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

    private static /* synthetic */ void lbtf() {
        ny.lapu[100] = -780030631;
        ny.lapu[101] = 83418429;
        ny.lapu[102] = -822211379;
        ny.lapu[103] = 1168130954;
        ny.lapu[104] = -949324176;
        ny.lapu[105] = -151642220;
        ny.lapu[106] = -289133424;
        ny.lapu[107] = -1712111396;
        ny.lapu[108] = 1438216394;
        ny.lapu[109] = -456913847;
        ny.lapu[110] = -549732997;
        ny.lapu[111] = 1327925059;
        ny.lapu[112] = 517195158;
        ny.lapu[113] = -933743732;
        ny.lapu[114] = 2073030550;
        ny.lapu[115] = -1626892458;
        ny.lapu[116] = -1719798690;
        ny.lapu[117] = -1939747755;
        ny.lapu[118] = -1291978432;
        ny.lapu[119] = 1673863656;
        ny.lapu[120] = 829977741;
        ny.lapu[121] = 96932244;
        ny.lapu[122] = 1759673937;
        ny.lapu[123] = -713143719;
        ny.lapu[124] = -1333368016;
        ny.lapu[125] = 998162093;
        ny.lapu[126] = -988560002;
        ny.lapu[127] = -1127007703;
        ny.lapu[128] = 251885824;
        ny.lapu[129] = 824205091;
        ny.lapu[130] = -1394647039;
        ny.lapu[131] = -1632446003;
        ny.lapu[132] = 704242848;
        ny.lapu[133] = 1191011730;
        ny.lapu[134] = -112711815;
        ny.lapu[135] = 1292550853;
        ny.lapu[136] = -201677534;
        ny.lapu[137] = 1228946914;
        ny.lapu[138] = -1316243954;
        ny.lapu[139] = -1262764306;
        ny.lapu[140] = 168628431;
        ny.lapu[141] = 1169018553;
        ny.lapu[142] = -674972456;
        ny.lapu[143] = 881223956;
        ny.lapu[144] = -1356581849;
        ny.lapu[145] = -1200021967;
        ny.lapu[146] = -1829643135;
        ny.lapu[147] = -1748450613;
        ny.lapu[148] = -622586586;
        ny.lapu[149] = 190844363;
        ny.lapu[150] = -67181528;
        ny.lapu[151] = 1679741822;
        ny.lapu[152] = -1805556024;
        ny.lapu[153] = 1782800802;
        ny.lapu[154] = -186082680;
        ny.lapu[155] = 1065723080;
        ny.lapu[156] = 1395290319;
        ny.lapu[157] = -1260681501;
        ny.lapu[158] = 133264729;
        ny.lapu[159] = 515977218;
        ny.lapu[160] = -1332727869;
        ny.lapu[161] = -1454453380;
        ny.lapu[162] = -882908426;
        ny.lapu[163] = -826601188;
        ny.lapu[164] = -1391267526;
        ny.lapu[165] = 243599635;
        ny.lapu[166] = 44370495;
        ny.lapu[167] = -2137451856;
        ny.lapu[168] = 306573401;
        ny.lapu[169] = -1570779847;
        ny.lapu[170] = 710223040;
        ny.lapu[171] = -727193772;
        ny.lapu[172] = -1397639526;
        ny.lapu[173] = 1321056479;
        ny.lapu[174] = 659085074;
        ny.lapu[175] = -1792564177;
        ny.lapu[176] = -478853937;
        ny.lapu[177] = -878541560;
        ny.lapu[178] = -187618431;
        ny.lapu[179] = -590556978;
        ny.lapu[180] = -2132653978;
        ny.lapu[181] = 1950665408;
        ny.lapu[182] = -799141138;
        ny.lapu[183] = -828235720;
        ny.lapu[184] = -1068441363;
        ny.lapu[185] = -77745076;
        ny.lapu[186] = 210866167;
        ny.lapu[187] = -1423694017;
        ny.lapu[188] = 506182104;
        ny.lapu[189] = -1742336606;
        ny.lapu[190] = 1488449620;
        ny.lapu[191] = -500063208;
        ny.lapu[192] = 805141634;
        ny.lapu[193] = -1406179301;
        ny.lapu[194] = 1983887491;
        ny.lapu[195] = -2013254866;
        ny.lapu[196] = 1867832945;
        ny.lapu[197] = 704595302;
        ny.lapu[198] = -2108545625;
        ny.lapu[199] = 636374322;
    }

    private static /* synthetic */ void lbtx() {
        ny.laqc[100] = 736837854673809434L;
        ny.laqc[101] = -6527715971327895773L;
        ny.laqc[102] = 623305172272839018L;
        ny.laqc[103] = 4299228386117608628L;
        ny.laqc[104] = -4304798788388714449L;
        ny.laqc[105] = -8419242956336654622L;
        ny.laqc[106] = 2409016413094759349L;
        ny.laqc[107] = -9170794298398630204L;
        ny.laqc[108] = -5551808004708174095L;
        ny.laqc[109] = 8454364591015930475L;
        ny.laqc[110] = -7043234926554976777L;
        ny.laqc[111] = -4547619002401755023L;
        ny.laqc[112] = 8440656391951023839L;
        ny.laqc[113] = 3901562967331598822L;
        ny.laqc[114] = -4598619885892614614L;
        ny.laqc[115] = 3929421017869067239L;
        ny.laqc[116] = 1963796260024065498L;
        ny.laqc[117] = -3785959932516949799L;
        ny.laqc[118] = -4589330391237618641L;
        ny.laqc[119] = 5207936942469157491L;
        ny.laqc[120] = -9218507170774125216L;
        ny.laqc[121] = 5254433550117560922L;
        ny.laqc[122] = 2671821796415828400L;
        ny.laqc[123] = -2561061319030834906L;
    }

    public static /* synthetic */ CallSite lapv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isBlocking() {
        v0 /* !! */  = ny.ts;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - ny.lapv("lbjb", laqb(int ), (int)101));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -579109673: {
                    v1 = ny.lapv("lbjc", laqb(int ), (int)102);
                    continue block28;
                }
                case -571085362: {
                    v1 = ny.lapv("lbjd", laqb(int ), (int)103);
                    continue block28;
                }
                case 305178906: {
                    break block28;
                }
                case 1846047922: {
                    v1 = ny.lapv("lbjf", laqb(int ), (int)104);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = ny.c;
        v2 /* !! */  = ny.ts;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - ny.lapv("lbjh", laqb(int ), (int)105));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1555198534: {
                    v3 = ny.lapv("lbji", laqb(int ), (int)106);
                    continue block29;
                }
                case -458153027: {
                    v3 = ny.lapv("lbjk", laqb(int ), (int)107);
                    continue block29;
                }
                case 305178906: {
                    break block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = ny.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ny.ts - ny.lapv("lbjl", laqb(int ), (int)108)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ny.lapv("lbjm", laps(int ), (int)339)) break;
            v4 /* !! */  = (long)ny.lapv("lbjn", laps(int ), (int)340);
        }
        var1_3 = ny.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (boolean)ny.lapv("lbjp", laps(int ), (int)341);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = ny.ts;
                if (true) ** GOTO lbl52
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - ny.lapv("lbjr", laqb(int ), (int)109));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1953997496: {
                            v6 = ny.lapv("lbjs", laqb(int ), (int)110);
                            continue block32;
                        }
                        case -1839112560: {
                            v6 = ny.lapv("lbju", laqb(int ), (int)111);
                            continue block32;
                        }
                        case 305178906: {
                            break block32;
                        }
                    }
                    break;
                }
                v7 /* !! */  = ny.ts;
                if (true) ** GOTO lbl65
                block33: while (true) {
                    v7 /* !! */  = (long)(v8 - ny.lapv("lbjv", laqb(int ), (int)112));
lbl65:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2056872867: {
                            v8 = ny.lapv("lbjx", laqb(int ), (int)113);
                            continue block33;
                        }
                        case -1676628613: {
                            v8 = ny.lapv("lbjy", laqb(int ), (int)114);
                            continue block33;
                        }
                        case 305178906: {
                            break block33;
                        }
                        case 1296602590: {
                            v8 = ny.lapv("lbka", laqb(int ), (int)115);
                            continue block33;
                        }
                    }
                    break;
                }
                return this.movement.isBlocked();
            }
lbl78:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ny.lapv("lbkb", laps(int ), (int)342);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ny.lapv("lbkd", laps(int ), (int)343);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ny.lapv("lbke", laps(int ), (int)344);
                if (!var3_1) ** GOTO lbl78
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ny.lapv("lbkf", laps(int ), (int)345);
        ** while (!var3_1)
lbl95:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lbsl() {
        ny.lapt[100] = -780030631;
        ny.lapt[101] = 83418428;
        ny.lapt[102] = -822211379;
        ny.lapt[103] = 1168130955;
        ny.lapt[104] = -949324176;
        ny.lapt[105] = -151642220;
        ny.lapt[106] = -289133423;
        ny.lapt[107] = -1712111395;
        ny.lapt[108] = 1438216394;
        ny.lapt[109] = -456913848;
        ny.lapt[110] = -549732997;
        ny.lapt[111] = 1327925059;
        ny.lapt[112] = 517195158;
        ny.lapt[113] = -933743732;
        ny.lapt[114] = 2073030645;
        ny.lapt[115] = -1626892484;
        ny.lapt[116] = -1719798691;
        ny.lapt[117] = -1939747731;
        ny.lapt[118] = -1291978495;
        ny.lapt[119] = 1673863679;
        ny.lapt[120] = 829977755;
        ny.lapt[121] = 96932333;
        ny.lapt[122] = 1759673934;
        ny.lapt[123] = -713143736;
        ny.lapt[124] = -1333367886;
        ny.lapt[125] = 998162110;
        ny.lapt[126] = -988560014;
        ny.lapt[127] = -1127007715;
        ny.lapt[128] = 251885846;
        ny.lapt[129] = 824205156;
        ny.lapt[130] = -1394646903;
        ny.lapt[131] = -1632445965;
        ny.lapt[132] = 704242933;
        ny.lapt[133] = 1191011787;
        ny.lapt[134] = -112711936;
        ny.lapt[135] = 1292550908;
        ny.lapt[136] = -201677479;
        ny.lapt[137] = 1228946878;
        ny.lapt[138] = -1316243934;
        ny.lapt[139] = -1262764406;
        ny.lapt[140] = 168628471;
        ny.lapt[141] = 1169018498;
        ny.lapt[142] = -674972429;
        ny.lapt[143] = 881224015;
        ny.lapt[144] = -1356581767;
        ny.lapt[145] = -1200021967;
        ny.lapt[146] = -1829643115;
        ny.lapt[147] = -1748450629;
        ny.lapt[148] = -622586511;
        ny.lapt[149] = 190844391;
        ny.lapt[150] = -67181553;
        ny.lapt[151] = 1679741782;
        ny.lapt[152] = -1805556030;
        ny.lapt[153] = 1782800778;
        ny.lapt[154] = -186082647;
        ny.lapt[155] = 1065723063;
        ny.lapt[156] = 1395290328;
        ny.lapt[157] = -1260681597;
        ny.lapt[158] = 133264641;
        ny.lapt[159] = 515977337;
        ny.lapt[160] = -1332727876;
        ny.lapt[161] = -1454453253;
        ny.lapt[162] = -882908437;
        ny.lapt[163] = -826601120;
        ny.lapt[164] = -1391267568;
        ny.lapt[165] = 243599680;
        ny.lapt[166] = 44370438;
        ny.lapt[167] = -2137451981;
        ny.lapt[168] = 306573317;
        ny.lapt[169] = -1570779823;
        ny.lapt[170] = 710223010;
        ny.lapt[171] = -727193823;
        ny.lapt[172] = -1397639465;
        ny.lapt[173] = 1321056431;
        ny.lapt[174] = 659085200;
        ny.lapt[175] = -1792564053;
        ny.lapt[176] = -478853936;
        ny.lapt[177] = -878541531;
        ny.lapt[178] = -187618383;
        ny.lapt[179] = -590556934;
        ny.lapt[180] = -2132654033;
        ny.lapt[181] = 1950665404;
        ny.lapt[182] = -799141189;
        ny.lapt[183] = -828235707;
        ny.lapt[184] = -1068441351;
        ny.lapt[185] = -77745072;
        ny.lapt[186] = 210866070;
        ny.lapt[187] = -1423694032;
        ny.lapt[188] = 506182112;
        ny.lapt[189] = -1742336514;
        ny.lapt[190] = 1488449538;
        ny.lapt[191] = -500063076;
        ny.lapt[192] = 805141723;
        ny.lapt[193] = -1406179279;
        ny.lapt[194] = 1983887557;
        ny.lapt[195] = -2013254870;
        ny.lapt[196] = 1867832894;
        ny.lapt[197] = 704595252;
        ny.lapt[198] = -2108545543;
        ny.lapt[199] = 636374357;
    }

    static {
        lapu = new int[354];
        ny.lbsc();
        ny.lbsl();
        ny.lbsq();
        ny.lbsw();
        ny.lbtb();
        ny.lbtf();
        ny.lbtj();
        ny.lbto();
        laqc = new long[124];
        laqd = new long[124];
        ny.lbtr();
        ny.lbtx();
        ny.lbua();
        ny.lbug();
        mc = class_310.method_1551();
    }

    private static /* synthetic */ void lbsc() {
        ny.lapt[0] = -1972706859;
        ny.lapt[1] = -735215366;
        ny.lapt[2] = -201363149;
        ny.lapt[3] = -73428028;
        ny.lapt[4] = 1200847212;
        ny.lapt[5] = -1732953931;
        ny.lapt[6] = -1338686741;
        ny.lapt[7] = -904347165;
        ny.lapt[8] = -1981446255;
        ny.lapt[9] = 678573916;
        ny.lapt[10] = -1304000;
        ny.lapt[11] = -344755700;
        ny.lapt[12] = 806398753;
        ny.lapt[13] = -25714398;
        ny.lapt[14] = 1175201295;
        ny.lapt[15] = -33969847;
        ny.lapt[16] = -1196227859;
        ny.lapt[17] = -1147282262;
        ny.lapt[18] = -1909542022;
        ny.lapt[19] = -559765714;
        ny.lapt[20] = -987711883;
        ny.lapt[21] = -1014754651;
        ny.lapt[22] = 1173263182;
        ny.lapt[23] = 255347372;
        ny.lapt[24] = 1056914807;
        ny.lapt[25] = -2086999205;
        ny.lapt[26] = 1472809687;
        ny.lapt[27] = -94397753;
        ny.lapt[28] = -1902167657;
        ny.lapt[29] = 1943532452;
        ny.lapt[30] = 365754896;
        ny.lapt[31] = 471017597;
        ny.lapt[32] = -1670794340;
        ny.lapt[33] = -452124118;
        ny.lapt[34] = -587981914;
        ny.lapt[35] = -117918120;
        ny.lapt[36] = 678684093;
        ny.lapt[37] = 855042936;
        ny.lapt[38] = -180952659;
        ny.lapt[39] = -438979698;
        ny.lapt[40] = 678110066;
        ny.lapt[41] = 1005812065;
        ny.lapt[42] = 580696320;
        ny.lapt[43] = 1216587285;
        ny.lapt[44] = 378496245;
        ny.lapt[45] = -569829386;
        ny.lapt[46] = -1289741020;
        ny.lapt[47] = 1296627661;
        ny.lapt[48] = -1831714917;
        ny.lapt[49] = -568188374;
        ny.lapt[50] = 1329612788;
        ny.lapt[51] = 483014267;
        ny.lapt[52] = 1783728386;
        ny.lapt[53] = -668688041;
        ny.lapt[54] = -927213338;
        ny.lapt[55] = 224748690;
        ny.lapt[56] = -1132407644;
        ny.lapt[57] = -2045684546;
        ny.lapt[58] = -654542488;
        ny.lapt[59] = 147376126;
        ny.lapt[60] = -953236207;
        ny.lapt[61] = -1100113114;
        ny.lapt[62] = 2113342736;
        ny.lapt[63] = -1007171172;
        ny.lapt[64] = -1780009397;
        ny.lapt[65] = -2038501727;
        ny.lapt[66] = 1351816669;
        ny.lapt[67] = -2147108392;
        ny.lapt[68] = 700417033;
        ny.lapt[69] = 1242949223;
        ny.lapt[70] = -72208991;
        ny.lapt[71] = -2047373548;
        ny.lapt[72] = -1683328901;
        ny.lapt[73] = -737020367;
        ny.lapt[74] = -652559568;
        ny.lapt[75] = 498790563;
        ny.lapt[76] = -2126156198;
        ny.lapt[77] = -1884923141;
        ny.lapt[78] = 672613235;
        ny.lapt[79] = -1607326756;
        ny.lapt[80] = -1024895935;
        ny.lapt[81] = 771484670;
        ny.lapt[82] = 1926102699;
        ny.lapt[83] = -1942377203;
        ny.lapt[84] = -1511736102;
        ny.lapt[85] = 1028833975;
        ny.lapt[86] = -1855286346;
        ny.lapt[87] = 1602599827;
        ny.lapt[88] = 526816380;
        ny.lapt[89] = -108925470;
        ny.lapt[90] = 2003704914;
        ny.lapt[91] = -612191855;
        ny.lapt[92] = 1745067705;
        ny.lapt[93] = -2132630447;
        ny.lapt[94] = 639097149;
        ny.lapt[95] = 1699044773;
        ny.lapt[96] = 355070321;
        ny.lapt[97] = 932686313;
        ny.lapt[98] = -249874529;
        ny.lapt[99] = 994884057;
    }

    private static /* synthetic */ void lbtb() {
        ny.lapu[0] = -1972706858;
        ny.lapu[1] = -735215362;
        ny.lapu[2] = -201363145;
        ny.lapu[3] = -73428026;
        ny.lapu[4] = 1200847213;
        ny.lapu[5] = 1732953930;
        ny.lapu[6] = 1837151445;
        ny.lapu[7] = -904347166;
        ny.lapu[8] = 672924234;
        ny.lapu[9] = 678573913;
        ny.lapu[10] = -1303995;
        ny.lapu[11] = -344755704;
        ny.lapu[12] = 806398753;
        ny.lapu[13] = -25714398;
        ny.lapu[14] = 1175201292;
        ny.lapu[15] = 33969846;
        ny.lapu[16] = 655330813;
        ny.lapu[17] = 1147282261;
        ny.lapu[18] = -1144092359;
        ny.lapu[19] = 559765713;
        ny.lapu[20] = -1581743336;
        ny.lapu[21] = 1014754650;
        ny.lapu[22] = 538364304;
        ny.lapu[23] = 255347373;
        ny.lapu[24] = 1728275482;
        ny.lapu[25] = 2086999204;
        ny.lapu[26] = -922976962;
        ny.lapu[27] = 94397752;
        ny.lapu[28] = 88780040;
        ny.lapu[29] = -1943532453;
        ny.lapu[30] = -1022438799;
        ny.lapu[31] = -471017598;
        ny.lapu[32] = -929120599;
        ny.lapu[33] = -452124117;
        ny.lapu[34] = 80169582;
        ny.lapu[35] = -117918115;
        ny.lapu[36] = 678684072;
        ny.lapu[37] = 855042930;
        ny.lapu[38] = -180952666;
        ny.lapu[39] = -438979711;
        ny.lapu[40] = 678110074;
        ny.lapu[41] = 1005812077;
        ny.lapu[42] = 580696334;
        ny.lapu[43] = 1216587286;
        ny.lapu[44] = 378496242;
        ny.lapu[45] = -569829402;
        ny.lapu[46] = -1289741002;
        ny.lapu[47] = 1296627675;
        ny.lapu[48] = -1831714918;
        ny.lapu[49] = -568188360;
        ny.lapu[50] = 1329612770;
        ny.lapu[51] = 483014263;
        ny.lapu[52] = 1783728407;
        ny.lapu[53] = -668688059;
        ny.lapu[54] = -927213331;
        ny.lapu[55] = 224748678;
        ny.lapu[56] = -1132407632;
        ny.lapu[57] = -2045684563;
        ny.lapu[58] = -654542487;
        ny.lapu[59] = 147376116;
        ny.lapu[60] = -953236207;
        ny.lapu[61] = -1100113093;
        ny.lapu[62] = 2113342731;
        ny.lapu[63] = -1007171186;
        ny.lapu[64] = -1780009397;
        ny.lapu[65] = -2038501725;
        ny.lapu[66] = 1351816646;
        ny.lapu[67] = -2147108394;
        ny.lapu[68] = 700417054;
        ny.lapu[69] = 1242949226;
        ny.lapu[70] = -72208971;
        ny.lapu[71] = -2047373546;
        ny.lapu[72] = -1683328901;
        ny.lapu[73] = -737020379;
        ny.lapu[74] = -652559555;
        ny.lapu[75] = 498790583;
        ny.lapu[76] = -2126156221;
        ny.lapu[77] = -1884923163;
        ny.lapu[78] = 672613234;
        ny.lapu[79] = -1607326766;
        ny.lapu[80] = -1024895915;
        ny.lapu[81] = 771484657;
        ny.lapu[82] = 1926102713;
        ny.lapu[83] = -1942377209;
        ny.lapu[84] = -1511736121;
        ny.lapu[85] = 1028833973;
        ny.lapu[86] = -1855286353;
        ny.lapu[87] = 1602599821;
        ny.lapu[88] = 526816370;
        ny.lapu[89] = -108925445;
        ny.lapu[90] = 2003704905;
        ny.lapu[91] = -612191862;
        ny.lapu[92] = 1745067699;
        ny.lapu[93] = -2132630440;
        ny.lapu[94] = 639097148;
        ny.lapu[95] = 1699044773;
        ny.lapu[96] = 355070320;
        ny.lapu[97] = 932686312;
        ny.lapu[98] = -249874529;
        ny.lapu[99] = 994884056;
    }

    private static /* synthetic */ void lbtj() {
        ny.lapu[200] = 1675939806;
        ny.lapu[201] = -935494209;
        ny.lapu[202] = -1068013139;
        ny.lapu[203] = 1812564598;
        ny.lapu[204] = -1147498893;
        ny.lapu[205] = 1554404705;
        ny.lapu[206] = 826279344;
        ny.lapu[207] = -1901090949;
        ny.lapu[208] = 1790681174;
        ny.lapu[209] = 1476654393;
        ny.lapu[210] = -585177442;
        ny.lapu[211] = -1307035960;
        ny.lapu[212] = -289801370;
        ny.lapu[213] = 8010459;
        ny.lapu[214] = 255207451;
        ny.lapu[215] = 1426877437;
        ny.lapu[216] = -728965949;
        ny.lapu[217] = -1666509895;
        ny.lapu[218] = -1974296155;
        ny.lapu[219] = 836799527;
        ny.lapu[220] = 54596755;
        ny.lapu[221] = -1477912687;
        ny.lapu[222] = -93281800;
        ny.lapu[223] = 438538068;
        ny.lapu[224] = 1566296579;
        ny.lapu[225] = 1896830503;
        ny.lapu[226] = 1399225523;
        ny.lapu[227] = 1269745514;
        ny.lapu[228] = -1411974260;
        ny.lapu[229] = 972262452;
        ny.lapu[230] = -117977541;
        ny.lapu[231] = 503881780;
        ny.lapu[232] = -1808842889;
        ny.lapu[233] = 1206203294;
        ny.lapu[234] = 897489374;
        ny.lapu[235] = 2058013885;
        ny.lapu[236] = 2087618722;
        ny.lapu[237] = 96248552;
        ny.lapu[238] = -947542469;
        ny.lapu[239] = -1158842911;
        ny.lapu[240] = -1667763324;
        ny.lapu[241] = -1063079957;
        ny.lapu[242] = -293487646;
        ny.lapu[243] = 2019442208;
        ny.lapu[244] = 1083498349;
        ny.lapu[245] = 23562694;
        ny.lapu[246] = 26061367;
        ny.lapu[247] = -513593675;
        ny.lapu[248] = 419682322;
        ny.lapu[249] = -1743208942;
        ny.lapu[250] = 182924955;
        ny.lapu[251] = -646520346;
        ny.lapu[252] = -531754167;
        ny.lapu[253] = 500555098;
        ny.lapu[254] = 74483472;
        ny.lapu[255] = -1394183479;
        ny.lapu[256] = 825351123;
        ny.lapu[257] = -2146745563;
        ny.lapu[258] = -1035026706;
        ny.lapu[259] = -349174020;
        ny.lapu[260] = 1438275951;
        ny.lapu[261] = 4330524;
        ny.lapu[262] = -1995109312;
        ny.lapu[263] = -1215263837;
        ny.lapu[264] = -1057600679;
        ny.lapu[265] = -420310308;
        ny.lapu[266] = -1618467217;
        ny.lapu[267] = 1640058153;
        ny.lapu[268] = -716540650;
        ny.lapu[269] = -1146083328;
        ny.lapu[270] = 795956878;
        ny.lapu[271] = -82066463;
        ny.lapu[272] = -110064384;
        ny.lapu[273] = 48802645;
        ny.lapu[274] = -473840597;
        ny.lapu[275] = 227173463;
        ny.lapu[276] = -814112519;
        ny.lapu[277] = 116226699;
        ny.lapu[278] = 234652505;
        ny.lapu[279] = 1542479007;
        ny.lapu[280] = -1759298947;
        ny.lapu[281] = -1685570161;
        ny.lapu[282] = -1107509181;
        ny.lapu[283] = -346283196;
        ny.lapu[284] = 598842455;
        ny.lapu[285] = 1782621819;
        ny.lapu[286] = -1365957628;
        ny.lapu[287] = -1023774678;
        ny.lapu[288] = -1522813256;
        ny.lapu[289] = -355373895;
        ny.lapu[290] = -3819832;
        ny.lapu[291] = 1088075421;
        ny.lapu[292] = 530202844;
        ny.lapu[293] = -1663998354;
        ny.lapu[294] = -19948923;
        ny.lapu[295] = 1168814062;
        ny.lapu[296] = -1366402192;
        ny.lapu[297] = -603654092;
        ny.lapu[298] = -1517147271;
        ny.lapu[299] = 1515402983;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void execute(Runnable var1_1, oc var2_2) {
        v0 /* !! */  = ny.ts;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - ny.lapv("laqe", laqb(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1470078204: {
                    v1 = ny.lapv("laqf", laqb(int ), (int)1);
                    continue block19;
                }
                case -892438533: {
                    v1 = ny.lapv("laqg", laqb(int ), (int)2);
                    continue block19;
                }
                case 9492561: {
                    v1 = ny.lapv("laqh", laqb(int ), (int)3);
                    continue block19;
                }
                case 305178906: {
                    break block19;
                }
            }
            break;
        }
        var5_3 = ny.c;
        v2 /* !! */  = ny.ts;
        if (true) ** GOTO lbl22
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - ny.lapv("laqi", laqb(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -986139211: {
                    v3 = ny.lapv("laqj", laqb(int ), (int)5);
                    continue block20;
                }
                case 305178906: {
                    break block20;
                }
                case 1390434957: {
                    v3 = ny.lapv("laqk", laqb(int ), (int)6);
                    continue block20;
                }
            }
            break;
        }
        var4_4 /* !! */  = ny.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ny.ts - ny.lapv("laql", laqb(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ny.lapv("laqm", laps(int ), (int)5)) break;
            v4 /* !! */  = (long)ny.lapv("laqn", laps(int ), (int)6);
        }
        var3_5 = ny.a;
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_3) {
                    throw null;
lbl43:
                    // 2 sources

                    return;
                }
                if (var3_5 || var3_5) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ny.ts - ny.lapv("laqo", laqb(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ny.lapv("laqp", laps(int ), (int)7)) break;
                    v5 /* !! */  = (long)ny.lapv("laqq", laps(int ), (int)8);
                }
                this.execute(var1_1, var2_2, null);
                if (var3_5 || var3_5) ** continue;
                return;
            }
            case 0: {
                var4_4 /* !! */  = (int)ny.lapv("laqr", laps(int ), (int)9);
                if (!var5_3) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)ny.lapv("laqs", laps(int ), (int)10);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 2: {
                var4_4 /* !! */  = (int)ny.lapv("laqt", laps(int ), (int)11);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl73
            }
            case 3: {
                do {
                    var4_4 /* !! */  = (int)ny.lapv("laqu", laps(int ), (int)12);
                } while (!var5_3);
                throw null;
            }
lbl73:
            // 3 sources

            case 4: {
                var4_4 /* !! */  = (int)ny.lapv("laqv", laps(int ), (int)13);
                if (!var5_3) ** GOTO lbl58
                throw null;
            }
            case 5: 
        }
        do {
            var4_4 /* !! */  = (int)ny.lapv("laqw", laps(int ), (int)14);
        } while (!var5_3);
        throw null;
    }

    private static /* synthetic */ int laps(int n2) {
        return lapt[n2] ^ lapu[n2];
    }

    private static /* synthetic */ void lbua() {
        ny.laqd[0] = -3183835346728534251L;
        ny.laqd[1] = 3128038684989452844L;
        ny.laqd[2] = -8756824265550751837L;
        ny.laqd[3] = 6409225477326341718L;
        ny.laqd[4] = -5929944369086729188L;
        ny.laqd[5] = 7275514087627047881L;
        ny.laqd[6] = -8953067857310993580L;
        ny.laqd[7] = -2627657378829024892L;
        ny.laqd[8] = -2853305592671884950L;
        ny.laqd[9] = 717010338976708203L;
        ny.laqd[10] = -615886019086389144L;
        ny.laqd[11] = 516025028245180165L;
        ny.laqd[12] = -5094909026154368652L;
        ny.laqd[13] = -1112486149080407868L;
        ny.laqd[14] = -723442614288152787L;
        ny.laqd[15] = 7733506476649286825L;
        ny.laqd[16] = -6078490066645189588L;
        ny.laqd[17] = 3565039267001704882L;
        ny.laqd[18] = 2931136339518183783L;
        ny.laqd[19] = -4336304041414056332L;
        ny.laqd[20] = -6049859688075304566L;
        ny.laqd[21] = -6082319337609154674L;
        ny.laqd[22] = 4151664673300491044L;
        ny.laqd[23] = -6831613825709600793L;
        ny.laqd[24] = -4150534958094363511L;
        ny.laqd[25] = 8977478935159902714L;
        ny.laqd[26] = 8544775176002830547L;
        ny.laqd[27] = -455542549102331389L;
        ny.laqd[28] = 4847859713700773018L;
        ny.laqd[29] = 4357786562142843940L;
        ny.laqd[30] = 1692670598402731088L;
        ny.laqd[31] = -8321917290536473165L;
        ny.laqd[32] = -8990244422681347840L;
        ny.laqd[33] = -6243012929273092807L;
        ny.laqd[34] = -8595245179372160327L;
        ny.laqd[35] = 4651966664795860514L;
        ny.laqd[36] = -4583432937959550291L;
        ny.laqd[37] = 7569656946486584231L;
        ny.laqd[38] = -7052754361714827014L;
        ny.laqd[39] = 6487589819262399632L;
        ny.laqd[40] = 3253376249190541982L;
        ny.laqd[41] = 8999663464700950535L;
        ny.laqd[42] = 8999024289655998336L;
        ny.laqd[43] = -4391626263250641920L;
        ny.laqd[44] = -8336309487133974174L;
        ny.laqd[45] = -4327043360840881975L;
        ny.laqd[46] = 5632131540693319325L;
        ny.laqd[47] = -2872610963863938760L;
        ny.laqd[48] = -870535581634179684L;
        ny.laqd[49] = 8921048513455335056L;
        ny.laqd[50] = -5486938804185749945L;
        ny.laqd[51] = -889198000482309561L;
        ny.laqd[52] = -7928590090585308098L;
        ny.laqd[53] = -2812803886975625433L;
        ny.laqd[54] = -3307608290047953848L;
        ny.laqd[55] = -5701886286724979329L;
        ny.laqd[56] = -2363587299979916570L;
        ny.laqd[57] = -265622178141158399L;
        ny.laqd[58] = -6259307341033861212L;
        ny.laqd[59] = 3055313250921112472L;
        ny.laqd[60] = 1791667345250684277L;
        ny.laqd[61] = -8128905292475582809L;
        ny.laqd[62] = -138670151569575896L;
        ny.laqd[63] = -7932780952177622251L;
        ny.laqd[64] = -2093032369597021960L;
        ny.laqd[65] = -2645830792132220817L;
        ny.laqd[66] = -4872871322276901077L;
        ny.laqd[67] = -1799602544198001649L;
        ny.laqd[68] = -6109554479909999913L;
        ny.laqd[69] = 8576009969629228197L;
        ny.laqd[70] = -1544729963370898924L;
        ny.laqd[71] = -1697900661367530052L;
        ny.laqd[72] = -8809724933069280440L;
        ny.laqd[73] = 547182695184170080L;
        ny.laqd[74] = 1775753196543265920L;
        ny.laqd[75] = 41743337483909841L;
        ny.laqd[76] = -6547051524834765233L;
        ny.laqd[77] = -1128662276393264154L;
        ny.laqd[78] = 3862506707456121435L;
        ny.laqd[79] = -6491793368004782523L;
        ny.laqd[80] = -8896275489842857886L;
        ny.laqd[81] = -2316713539360555138L;
        ny.laqd[82] = -2729112499351149930L;
        ny.laqd[83] = -5912389351957225559L;
        ny.laqd[84] = -8142722011915571326L;
        ny.laqd[85] = 8623430194980084131L;
        ny.laqd[86] = -1014538729101981104L;
        ny.laqd[87] = -7003534696022050257L;
        ny.laqd[88] = -6824017457399936441L;
        ny.laqd[89] = 7844370482424857905L;
        ny.laqd[90] = -2266316214970981622L;
        ny.laqd[91] = 5404832406729085778L;
        ny.laqd[92] = 1250642904879972017L;
        ny.laqd[93] = 1874231410823807057L;
        ny.laqd[94] = -1190301668225841822L;
        ny.laqd[95] = -5522218489514688820L;
        ny.laqd[96] = 383346050499052240L;
        ny.laqd[97] = -6799296431349336210L;
        ny.laqd[98] = 7040631788992182047L;
        ny.laqd[99] = -8469459294199123947L;
    }
}

