/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import ruhack.phobia.aw;
import ruhack.phobia.ax$MethodData;
import ruhack.phobia.az;
import ruhack.phobia.bi;

public final class ax {
    public static final boolean c;
    private static int[] dafd;
    private static long[] daey;
    private static final long ha = -2843712639006722044L;
    public static final boolean a;
    private static int[] dafc;
    public static final int b;
    private static final Map<Class<? extends az>, List<ax$MethodData>> REGISTRY_MAP;
    private static long[] daex;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void cleanMap(boolean var0) {
        block77: {
            block76: {
                v0 /* !! */  = ax.ha;
                if (true) ** GOTO lbl5
                block51: while (true) {
                    v0 /* !! */  = (long)(ax.daez("darq", daew(int ), (int)152) - ax.daez("darp", daew(int ), (int)151));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -457754620: {
                            break block51;
                        }
                        case -421879485: {
                            continue block51;
                        }
                    }
                    break;
                }
                var3_1 = ax.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("darr", daew(int ), (int)153)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == ax.daez("dars", dafb(int ), (int)173)) break;
                    v1 /* !! */  = (long)ax.daez("dart", dafb(int ), (int)174);
                }
                var2_2 /* !! */  = ax.b;
                v2 /* !! */  = ax.ha;
                if (true) ** GOTO lbl21
                block53: while (true) {
                    v2 /* !! */  = (long)(v3 - ax.daez("daru", daew(int ), (int)154));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -457754620: {
                            break block53;
                        }
                        case 1621880131: {
                            v3 = ax.daez("darv", daew(int ), (int)155);
                            continue block53;
                        }
                        case 2057927943: {
                            v3 = ax.daez("darw", daew(int ), (int)156);
                            continue block53;
                        }
                    }
                    break;
                }
                var1_3 = ax.a;
                if (var3_1) {
                    throw null;
lbl33:
                    // 7 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl33
                if (!var0) break block76;
                if (var1_3 || var1_3) ** GOTO lbl33
                v4 /* !! */  = ax.ha;
                if (true) ** GOTO lbl42
                block55: while (true) {
                    v4 /* !! */  = (long)(v5 - ax.daez("darx", daew(int ), (int)157));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1500394594: {
                            v5 = ax.daez("dary", daew(int ), (int)158);
                            continue block55;
                        }
                        case -1415848317: {
                            v5 = ax.daez("darz", daew(int ), (int)159);
                            continue block55;
                        }
                        case -457754620: {
                            break block55;
                        }
                        case 228450107: {
                            v5 = ax.daez("dasa", daew(int ), (int)160);
                            continue block55;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ax.ha;
                if (true) ** GOTO lbl58
                block56: while (true) {
                    v6 /* !! */  = (long)(ax.daez("dasc", daew(int ), (int)162) - ax.daez("dasb", daew(int ), (int)161));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -991012419: {
                            continue block56;
                        }
                        case -457754620: {
                            break block56;
                        }
                    }
                    break;
                }
                v7 = ax.REGISTRY_MAP.entrySet();
                v8 /* !! */  = ax.ha;
                if (true) ** GOTO lbl68
                block57: while (true) {
                    v8 /* !! */  = (long)(v9 - ax.daez("dasd", daew(int ), (int)163));
lbl68:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1893478537: {
                            v9 = ax.daez("dase", daew(int ), (int)164);
                            continue block57;
                        }
                        case -457754620: {
                            break block57;
                        }
                        case -144426866: {
                            v9 = ax.daez("dasf", daew(int ), (int)165);
                            continue block57;
                        }
                    }
                    break;
                }
                v10 = (Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$cleanMap$3(java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dasg", daew(int ), (int)166)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ax.daez("dash", dafb(int ), (int)175)) break;
                    v11 /* !! */  = (long)ax.daez("dasi", dafb(int ), (int)176);
                }
                v7.removeIf(v10);
                if (var1_3) ** GOTO lbl33
                if (var3_1) {
                    throw null;
                }
                break block77;
            }
            if (var1_3 || var1_3) ** GOTO lbl33
            v12 /* !! */  = ax.ha;
            if (true) ** GOTO lbl94
            block59: while (true) {
                v12 /* !! */  = (long)(v13 - ax.daez("dasj", daew(int ), (int)167));
lbl94:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1611261080: {
                        v13 = ax.daez("dask", daew(int ), (int)168);
                        continue block59;
                    }
                    case -457754620: {
                        break block59;
                    }
                    case 532110486: {
                        v13 = ax.daez("dasl", daew(int ), (int)169);
                        continue block59;
                    }
                    case 1631152733: {
                        v13 = ax.daez("dasm", daew(int ), (int)170);
                        continue block59;
                    }
                }
                break;
            }
            v14 /* !! */  = ax.ha;
            if (true) ** GOTO lbl110
            block60: while (true) {
                v14 /* !! */  = (long)(v15 - ax.daez("dasn", daew(int ), (int)171));
lbl110:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -457754620: {
                        break block60;
                    }
                    case -168689504: {
                        v15 = ax.daez("daso", daew(int ), (int)172);
                        continue block60;
                    }
                    case 1469928494: {
                        v15 = ax.daez("dasp", daew(int ), (int)173);
                        continue block60;
                    }
                    case 1989473605: {
                        v15 = ax.daez("dasq", daew(int ), (int)174);
                        continue block60;
                    }
                }
                break;
            }
            ax.REGISTRY_MAP.clear();
            if (var1_3) ** GOTO lbl33
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl132:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ax.daez("dasr", dafb(int ), (int)177);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 1: {
                var2_2 /* !! */  = (int)ax.daez("dass", dafb(int ), (int)178);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 2: {
                var2_2 /* !! */  = (int)ax.daez("dast", dafb(int ), (int)179);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 3: {
                var2_2 /* !! */  = (int)ax.daez("dasu", dafb(int ), (int)180);
                if (var3_1) {
                    throw null;
                }
            }
lbl151:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ax.daez("dasv", dafb(int ), (int)181);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl184
                    break;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ax.daez("dasw", dafb(int ), (int)182);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl162:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ax.daez("dasx", dafb(int ), (int)183);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 7: {
                var2_2 /* !! */  = (int)ax.daez("dasy", dafb(int ), (int)184);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl172:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ax.daez("dasz", dafb(int ), (int)185);
                if (!var3_1) ** GOTO lbl151
                throw null;
            }
lbl176:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ax.daez("data", dafb(int ), (int)186);
                if (var3_1) {
                    throw null;
                }
            }
lbl180:
            // 5 sources

            case 10: {
                var2_2 /* !! */  = (int)ax.daez("datb", dafb(int ), (int)187);
                if (!var3_1) ** GOTO lbl162
                throw null;
            }
lbl184:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)ax.daez("datc", dafb(int ), (int)188);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
            case 12: 
        }
        var2_2 /* !! */  = (int)ax.daez("datd", dafb(int ), (int)189);
        ** while (!var3_1)
lbl191:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void invoke(ax$MethodData var0, az var1_1) {
        var6_2 = ax.c;
        var5_3 /* !! */  = ax.b;
        var4_4 = ax.a;
        if (var6_2) {
            throw null;
lbl6:
            // 22 sources

            return;
        }
        if (var4_4) ** GOTO lbl6
        try {
            if (var4_4) ** GOTO lbl6
            var0.target().invoke(var0.source(), new Object[]{var1_1});
            if (var4_4 || var4_4) ** GOTO lbl6
            ** if (!var6_2) goto lbl-1000
        }
        catch (IllegalAccessException var2_5) {
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = "Illegal access to method. ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Method: " + var0.target().getName() + ", ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Argument: " + var1_1.toString() + ", ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Log: " + String.valueOf(var2_5.fillInStackTrace());
            if (var4_4 || var4_4) ** GOTO lbl6
            System.out.println((String)var3_9);
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var6_2) {
                throw null;
            }
        }
        catch (IllegalArgumentException var2_6) {
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = "Illegal arguments passed to method. ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Method: " + var0.target().getName() + ", ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Argument: " + var1_1.toString() + ", ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Log: " + String.valueOf(var2_6.getCause());
            if (var4_4 || var4_4) ** GOTO lbl6
            System.out.println((String)var3_9);
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var6_2) {
                throw null;
            }
        }
        catch (InvocationTargetException var2_7) {
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = "Exception occurred within invoked method. ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Method: " + var0.target().getName() + ", ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Argument: " + var1_1.toString() + ", ";
            if (var4_4 || var4_4) ** GOTO lbl6
            var3_9 = (String)var3_9 + "Log: " + String.valueOf(var2_7.getCause());
            if (var4_4 || var4_4) ** GOTO lbl6
            System.out.println((String)var3_9);
            if (var4_4) ** GOTO lbl6
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
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl65:
            // 3 sources

            case 0: {
                var5_3 /* !! */  = (int)ax.daez("daym", dafb(int ), (int)307);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl108
            }
            case 1: {
                var5_3 /* !! */  = (int)ax.daez("dayn", dafb(int ), (int)308);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl75:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)ax.daez("dayo", dafb(int ), (int)309);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 3: {
                var5_3 /* !! */  = (int)ax.daez("dayp", dafb(int ), (int)310);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 4: {
                var5_3 /* !! */  = (int)ax.daez("dayq", dafb(int ), (int)311);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl90:
            // 3 sources

            case 5: {
                var5_3 /* !! */  = (int)ax.daez("dayr", dafb(int ), (int)312);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
lbl94:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)ax.daez("days", dafb(int ), (int)313);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl99:
            // 3 sources

            case 7: {
                var5_3 /* !! */  = (int)ax.daez("dayt", dafb(int ), (int)314);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 8: {
                var5_3 /* !! */  = (int)ax.daez("dayu", dafb(int ), (int)315);
                if (!var6_2) ** GOTO lbl90
                throw null;
            }
lbl108:
            // 3 sources

            case 9: {
                do {
                    var5_3 /* !! */  = (int)ax.daez("dayv", dafb(int ), (int)316);
                } while (!var6_2);
                throw null;
            }
lbl113:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)ax.daez("dayw", dafb(int ), (int)317);
                if (!var6_2) ** GOTO lbl75
                throw null;
            }
lbl117:
            // 5 sources

            case 11: {
                var5_3 /* !! */  = (int)ax.daez("dayx", dafb(int ), (int)318);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl200
            }
lbl122:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)ax.daez("dayy", dafb(int ), (int)319);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)ax.daez("dayz", dafb(int ), (int)320);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 14: {
                var5_3 /* !! */  = (int)ax.daez("daza", dafb(int ), (int)321);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 15: {
                var5_3 /* !! */  = (int)ax.daez("dazb", dafb(int ), (int)322);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl150
            }
lbl141:
            // 4 sources

            case 16: {
                var5_3 /* !! */  = (int)ax.daez("dazc", dafb(int ), (int)323);
                if (!var6_2) ** GOTO lbl99
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)ax.daez("dazd", dafb(int ), (int)324);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl150:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)ax.daez("daze", dafb(int ), (int)325);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl155:
            // 2 sources

            case 19: {
                var5_3 /* !! */  = (int)ax.daez("dazf", dafb(int ), (int)326);
                if (var6_2) {
                    throw null;
                }
            }
lbl159:
            // 4 sources

            case 20: {
                var5_3 /* !! */  = (int)ax.daez("dazg", dafb(int ), (int)327);
                if (!var6_2) ** GOTO lbl141
                throw null;
            }
lbl163:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)ax.daez("dazh", dafb(int ), (int)328);
                if (!var6_2) ** GOTO lbl65
                throw null;
            }
            case 22: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ax.daez("dazi", dafb(int ), (int)329);
                    if (var6_2) {
                        throw null;
                    }
                    ** GOTO lbl249
                    break;
                }
            }
            case 23: {
                var5_3 /* !! */  = (int)ax.daez("dazj", dafb(int ), (int)330);
                if (!var6_2) ** GOTO lbl122
                throw null;
            }
            case 24: {
                var5_3 /* !! */  = (int)ax.daez("dazk", dafb(int ), (int)331);
                if (!var6_2) ** GOTO lbl163
                throw null;
            }
            case 25: {
                do {
                    var5_3 /* !! */  = (int)ax.daez("dazl", dafb(int ), (int)332);
                } while (!var6_2);
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)ax.daez("dazm", dafb(int ), (int)333);
                if (!var6_2) ** GOTO lbl117
                throw null;
            }
lbl190:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)ax.daez("dazn", dafb(int ), (int)334);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl195:
            // 3 sources

            case 28: {
                do {
                    var5_3 /* !! */  = (int)ax.daez("dazp", dafb(int ), (int)335);
                } while (!var6_2);
                throw null;
            }
lbl200:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)ax.daez("dazq", dafb(int ), (int)336);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl205:
            // 2 sources

            case 30: {
                var5_3 /* !! */  = (int)ax.daez("dazw", dafb(int ), (int)337);
                if (!var6_2) ** GOTO lbl195
                throw null;
            }
            case 31: {
                var5_3 /* !! */  = (int)ax.daez("dazy", dafb(int ), (int)338);
                if (!var6_2) ** GOTO lbl75
                throw null;
            }
lbl213:
            // 3 sources

            case 32: {
                var5_3 /* !! */  = (int)ax.daez("dbaa", dafb(int ), (int)339);
                if (!var6_2) ** GOTO lbl205
                throw null;
            }
lbl217:
            // 3 sources

            case 33: {
                var5_3 /* !! */  = (int)ax.daez("dbab", dafb(int ), (int)340);
                if (!var6_2) ** GOTO lbl99
                throw null;
            }
lbl221:
            // 3 sources

            case 34: {
                var5_3 /* !! */  = (int)ax.daez("dbac", dafb(int ), (int)341);
                if (!var6_2) ** GOTO lbl94
                throw null;
            }
            case 35: {
                var5_3 /* !! */  = (int)ax.daez("dbad", dafb(int ), (int)342);
                if (!var6_2) ** GOTO lbl213
                throw null;
            }
            case 36: {
                var5_3 /* !! */  = (int)ax.daez("dbae", dafb(int ), (int)343);
                if (!var6_2) ** GOTO lbl113
                throw null;
            }
            case 37: {
                var5_3 /* !! */  = (int)ax.daez("dbai", dafb(int ), (int)344);
                if (!var6_2) ** GOTO lbl217
                throw null;
            }
lbl237:
            // 2 sources

            case 38: {
                var5_3 /* !! */  = (int)ax.daez("dbaj", dafb(int ), (int)345);
                if (!var6_2) ** GOTO lbl155
                throw null;
            }
lbl241:
            // 2 sources

            case 39: {
                var5_3 /* !! */  = (int)ax.daez("dbak", dafb(int ), (int)346);
                if (!var6_2) ** GOTO lbl141
                throw null;
            }
            case 40: {
                var5_3 /* !! */  = (int)ax.daez("dbal", dafb(int ), (int)347);
                if (!var6_2) ** GOTO lbl213
                throw null;
            }
lbl249:
            // 2 sources

            case 41: {
                var5_3 /* !! */  = (int)ax.daez("dban", dafb(int ), (int)348);
                if (!var6_2) ** GOTO lbl195
                throw null;
            }
            case 42: 
        }
        var5_3 /* !! */  = (int)ax.daez("dbao", dafb(int ), (int)349);
        ** while (!var6_2)
lbl256:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void sortListValue(Class<? extends az> var0) {
        block68: {
            var10_1 = ax.c;
            var9_2 /* !! */  = ax.b;
            var8_3 = ax.a;
            if (var10_1) {
                throw null;
lbl6:
                // 19 sources

                return;
            }
            if (var8_3 || var8_3) ** GOTO lbl6
            var1_4 = new CopyOnWriteArrayList<ax$MethodData>();
            if (var8_3 || var8_3) ** GOTO lbl6
            var2_5 = bi.VALUE_ARRAY;
            if (var8_3) ** GOTO lbl6
            var3_6 = var2_5.length;
            if (var8_3) ** GOTO lbl6
            var4_7 = ax.daez("date", dafb(int ), (int)190);
            if (var8_3) ** GOTO lbl6
            do {
                block69: {
                    if (var8_3 || var8_3) ** GOTO lbl6
                    if (var4_7 >= var3_6) break block68;
                    if (var8_3) ** GOTO lbl6
                    var5_8 = var2_5[var4_7];
                    if (var8_3 || var8_3) ** GOTO lbl6
                    var6_9 = ax.REGISTRY_MAP.get(var0).iterator();
                    if (var8_3) ** GOTO lbl6
                    do {
                        block70: {
                            if (var8_3 || var8_3) ** GOTO lbl6
                            if (!var6_9.hasNext()) break block69;
                            if (var8_3) ** GOTO lbl6
                            var7_10 = var6_9.next();
                            if (var8_3 || var8_3) ** GOTO lbl6
                            if (var7_10.priority() != var5_8) break block70;
                            if (var8_3 || var8_3) ** GOTO lbl6
                            var1_4.add(var7_10);
                            if (var8_3) ** GOTO lbl6
                        }
                        if (var8_3 || var8_3) ** GOTO lbl6
                    } while (!var10_1);
                    throw null;
                }
                if (var8_3 || var8_3) ** GOTO lbl6
                ++var4_7;
                if (var8_3) ** GOTO lbl6
            } while (!var10_1);
            throw null;
        }
        if (var8_3 || var8_3) ** GOTO lbl6
        ax.REGISTRY_MAP.put(var0, var1_4);
        if (var9_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var8_3 && !var8_3) ** break;
                ** continue;
                return;
            }
lbl56:
            // 2 sources

            case 0: {
                do {
                    var9_2 /* !! */  = (int)ax.daez("datf", dafb(int ), (int)191);
                } while (!var10_1);
                throw null;
            }
            case 1: {
                var9_2 /* !! */  = (int)ax.daez("datg", dafb(int ), (int)192);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl66:
            // 2 sources

            case 2: {
                var9_2 /* !! */  = (int)ax.daez("dath", dafb(int ), (int)193);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl71:
            // 3 sources

            case 3: {
                var9_2 /* !! */  = (int)ax.daez("dati", dafb(int ), (int)194);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 4: {
                var9_2 /* !! */  = (int)ax.daez("datj", dafb(int ), (int)195);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 5: {
                var9_2 /* !! */  = (int)ax.daez("datk", dafb(int ), (int)196);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl86:
            // 2 sources

            case 6: {
                var9_2 /* !! */  = (int)ax.daez("datl", dafb(int ), (int)197);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 7: {
                var9_2 /* !! */  = (int)ax.daez("datm", dafb(int ), (int)198);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl96:
            // 2 sources

            case 8: {
                var9_2 /* !! */  = (int)ax.daez("datn", dafb(int ), (int)199);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl101:
            // 2 sources

            case 9: {
                var9_2 /* !! */  = (int)ax.daez("dato", dafb(int ), (int)200);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl106:
            // 3 sources

            case 10: {
                var9_2 /* !! */  = (int)ax.daez("datp", dafb(int ), (int)201);
                if (!var10_1) ** GOTO lbl71
                throw null;
            }
lbl110:
            // 5 sources

            case 11: {
                var9_2 /* !! */  = (int)ax.daez("datq", dafb(int ), (int)202);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl128
            }
lbl115:
            // 3 sources

            case 12: {
                var9_2 /* !! */  = (int)ax.daez("datr", dafb(int ), (int)203);
                if (!var10_1) ** GOTO lbl106
                throw null;
            }
lbl119:
            // 2 sources

            case 13: {
                var9_2 /* !! */  = (int)ax.daez("dats", dafb(int ), (int)204);
                if (!var10_1) ** GOTO lbl56
                throw null;
            }
            case 14: {
                var9_2 /* !! */  = (int)ax.daez("datt", dafb(int ), (int)205);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
lbl128:
            // 2 sources

            case 15: {
                var9_2 /* !! */  = (int)ax.daez("datu", dafb(int ), (int)206);
                if (!var10_1) ** GOTO lbl110
                throw null;
            }
            case 16: {
                var9_2 /* !! */  = (int)ax.daez("datv", dafb(int ), (int)207);
                if (!var10_1) ** GOTO lbl71
                throw null;
            }
lbl136:
            // 2 sources

            case 17: {
                var9_2 /* !! */  = (int)ax.daez("datw", dafb(int ), (int)208);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl141:
            // 2 sources

            case 18: {
                var9_2 /* !! */  = (int)ax.daez("datx", dafb(int ), (int)209);
                if (var10_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 19: {
                do {
                    var9_2 /* !! */  = (int)ax.daez("daty", dafb(int ), (int)210);
                } while (!var10_1);
                throw null;
            }
lbl151:
            // 2 sources

            case 20: {
                var9_2 /* !! */  = (int)ax.daez("datz", dafb(int ), (int)211);
                if (!var10_1) ** GOTO lbl106
                throw null;
            }
lbl155:
            // 6 sources

            case 21: {
                var9_2 /* !! */  = (int)ax.daez("daua", dafb(int ), (int)212);
                if (!var10_1) ** GOTO lbl66
                throw null;
            }
lbl159:
            // 2 sources

            case 22: {
                var9_2 /* !! */  = (int)ax.daez("daub", dafb(int ), (int)213);
                if (!var10_1) ** GOTO lbl155
                throw null;
            }
lbl163:
            // 4 sources

            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_2 /* !! */  = (int)ax.daez("dauc", dafb(int ), (int)214);
                    if (!var10_1) ** GOTO lbl101
                    throw null;
                }
            }
            case 24: {
                var9_2 /* !! */  = (int)ax.daez("daud", dafb(int ), (int)215);
                if (!var10_1) ** GOTO lbl115
                throw null;
            }
            case 25: {
                var9_2 /* !! */  = (int)ax.daez("daue", dafb(int ), (int)216);
                if (!var10_1) ** GOTO lbl136
                throw null;
            }
            case 26: {
                var9_2 /* !! */  = (int)ax.daez("dauf", dafb(int ), (int)217);
                if (!var10_1) ** GOTO lbl110
                throw null;
            }
lbl180:
            // 2 sources

            case 27: {
                var9_2 /* !! */  = (int)ax.daez("daug", dafb(int ), (int)218);
                if (!var10_1) ** GOTO lbl115
                throw null;
            }
            case 28: {
                var9_2 /* !! */  = (int)ax.daez("dauh", dafb(int ), (int)219);
                if (!var10_1) ** GOTO lbl86
                throw null;
            }
            case 29: {
                var9_2 /* !! */  = (int)ax.daez("daui", dafb(int ), (int)220);
                if (!var10_1) ** GOTO lbl96
                throw null;
            }
            case 30: {
                var9_2 /* !! */  = (int)ax.daez("dauj", dafb(int ), (int)221);
                if (!var10_1) ** GOTO lbl119
                throw null;
            }
            case 31: {
                var9_2 /* !! */  = (int)ax.daez("dauk", dafb(int ), (int)222);
                if (!var10_1) ** GOTO lbl159
                throw null;
            }
            case 32: 
        }
        var9_2 /* !! */  = (int)ax.daez("daul", dafb(int ), (int)223);
        ** while (!var10_1)
lbl203:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dbec() {
        ax.daex[0] = 1511386937850070992L;
        ax.daex[1] = 8517229631504711186L;
        ax.daex[2] = 3630082391771530283L;
        ax.daex[3] = -1657694121479421969L;
        ax.daex[4] = -1311054925445182558L;
        ax.daex[5] = 2388500475216059479L;
        ax.daex[6] = -8968356605675925670L;
        ax.daex[7] = -3793660407580190657L;
        ax.daex[8] = 6671218968524774376L;
        ax.daex[9] = 2178507883668599895L;
        ax.daex[10] = 8482775216337677302L;
        ax.daex[11] = -2954153258908329615L;
        ax.daex[12] = -8937732531649288426L;
        ax.daex[13] = 176480496086422866L;
        ax.daex[14] = 2700754014603057641L;
        ax.daex[15] = 394378281660775196L;
        ax.daex[16] = -5106304844068517623L;
        ax.daex[17] = -7821797586530303328L;
        ax.daex[18] = -6068419811992695306L;
        ax.daex[19] = 1418348354086210579L;
        ax.daex[20] = 4429687366350356144L;
        ax.daex[21] = -8552479383277301133L;
        ax.daex[22] = 6402468268379541381L;
        ax.daex[23] = -678899588368492594L;
        ax.daex[24] = 8141545890755093730L;
        ax.daex[25] = 7332438638402645577L;
        ax.daex[26] = 2940831766855071499L;
        ax.daex[27] = -1338894322630938671L;
        ax.daex[28] = 7212336793082826956L;
        ax.daex[29] = 1986631872146917666L;
        ax.daex[30] = -5722981253490064768L;
        ax.daex[31] = -5155739461088746552L;
        ax.daex[32] = -8701553706762722177L;
        ax.daex[33] = -2154894481928703274L;
        ax.daex[34] = 7999809017252955337L;
        ax.daex[35] = -5822924357473708415L;
        ax.daex[36] = 4566282009187802307L;
        ax.daex[37] = -6419344840764347271L;
        ax.daex[38] = 8555645425643152313L;
        ax.daex[39] = 6904842783358780116L;
        ax.daex[40] = -2673620924783865838L;
        ax.daex[41] = -8183142189216009710L;
        ax.daex[42] = -9010733465097024484L;
        ax.daex[43] = 5035911559729106299L;
        ax.daex[44] = 7353250620228465833L;
        ax.daex[45] = 7180476259968960870L;
        ax.daex[46] = 5897022532743546437L;
        ax.daex[47] = -1310345175085651128L;
        ax.daex[48] = -5560117375574027666L;
        ax.daex[49] = -3468910147021447149L;
        ax.daex[50] = 2799925901954885538L;
        ax.daex[51] = 6878644153845149576L;
        ax.daex[52] = -5787491854851498005L;
        ax.daex[53] = 1522710417988529164L;
        ax.daex[54] = -5294514741145437266L;
        ax.daex[55] = -8487580596789751088L;
        ax.daex[56] = -7164442812495002351L;
        ax.daex[57] = 3938365253445320349L;
        ax.daex[58] = 2114142591376316672L;
        ax.daex[59] = 6168710790807533008L;
        ax.daex[60] = 2817320257993697298L;
        ax.daex[61] = -5498218941161073032L;
        ax.daex[62] = 8467787401259859568L;
        ax.daex[63] = 6548853282070860621L;
        ax.daex[64] = -1695570669903438011L;
        ax.daex[65] = -2331082248995767188L;
        ax.daex[66] = 6112639949707830068L;
        ax.daex[67] = -986138026905102526L;
        ax.daex[68] = 8791659809911200156L;
        ax.daex[69] = 6825035087900927625L;
        ax.daex[70] = 252195219866349375L;
        ax.daex[71] = 9218036546400869958L;
        ax.daex[72] = 5078391466606540431L;
        ax.daex[73] = 8330780784886780925L;
        ax.daex[74] = 3161662262712646306L;
        ax.daex[75] = -6940108036687988880L;
        ax.daex[76] = -367122003391982524L;
        ax.daex[77] = 243020986367577321L;
        ax.daex[78] = -3911343404226835817L;
        ax.daex[79] = 944442428759639695L;
        ax.daex[80] = -8222720990669448373L;
        ax.daex[81] = -2690223486000785499L;
        ax.daex[82] = 4472800250480639165L;
        ax.daex[83] = 4877794271364862462L;
        ax.daex[84] = -7122224211979835122L;
        ax.daex[85] = 54643006534743776L;
        ax.daex[86] = 2316387586900825939L;
        ax.daex[87] = 6961402646826120798L;
        ax.daex[88] = -6931016635033748705L;
        ax.daex[89] = 8659740038190723184L;
        ax.daex[90] = 5268536862133271343L;
        ax.daex[91] = 1087387976453833560L;
        ax.daex[92] = -2188427361074292970L;
        ax.daex[93] = 6454866023951462567L;
        ax.daex[94] = 1071668996549941134L;
        ax.daex[95] = 278696474735317612L;
        ax.daex[96] = 8134457656223699326L;
        ax.daex[97] = -9021832071210224499L;
        ax.daex[98] = -2708451971766346785L;
        ax.daex[99] = 6171512040493510809L;
    }

    private static /* synthetic */ void dbej() {
        ax.daey[200] = 2075556682311768686L;
        ax.daey[201] = 3783043478592473614L;
        ax.daey[202] = 8775681679374478931L;
        ax.daey[203] = 4777559004606067889L;
        ax.daey[204] = -8982927246158350365L;
        ax.daey[205] = -7320019521924520522L;
        ax.daey[206] = 5466383549275293861L;
        ax.daey[207] = 905541873076839944L;
        ax.daey[208] = -770300439165031130L;
        ax.daey[209] = 1109622625907387901L;
        ax.daey[210] = 6053341840855980170L;
        ax.daey[211] = 6962746784054390063L;
        ax.daey[212] = -6302173865390565141L;
        ax.daey[213] = 5284473496884713872L;
        ax.daey[214] = 5821732187309140668L;
        ax.daey[215] = 8709451657209169683L;
        ax.daey[216] = -4332128915351933302L;
        ax.daey[217] = -3680415295212849195L;
        ax.daey[218] = -4851065928380224557L;
        ax.daey[219] = 4453115837487867685L;
        ax.daey[220] = -4720904823670699954L;
        ax.daey[221] = -8231963544275981497L;
        ax.daey[222] = -4991738165288766996L;
        ax.daey[223] = -7901871534847120706L;
        ax.daey[224] = 2387647096812716383L;
        ax.daey[225] = -7855299687425406990L;
        ax.daey[226] = 2082123655788619652L;
        ax.daey[227] = 7164924845704309470L;
        ax.daey[228] = 4959921198817267495L;
        ax.daey[229] = -412897325790142706L;
        ax.daey[230] = 1097930865393896854L;
        ax.daey[231] = 5955833818292199127L;
        ax.daey[232] = 6242164193308170957L;
        ax.daey[233] = 3759548877764425903L;
        ax.daey[234] = 1230732756459423662L;
        ax.daey[235] = 3986181120319928151L;
    }

    public ax() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$removeEntry$2(Class var0, Map.Entry var1_1) {
        v0 /* !! */  = ax.ha;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ax.daez("dbbk", daew(int ), (int)207));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1039611440: {
                    v1 = ax.daez("dbbl", daew(int ), (int)208);
                    continue block17;
                }
                case -457754620: {
                    break block17;
                }
                case 1646309786: {
                    v1 = ax.daez("dbbm", daew(int ), (int)209);
                    continue block17;
                }
                case 1757420284: {
                    v1 = ax.daez("dbbn", daew(int ), (int)210);
                    continue block17;
                }
            }
            break;
        }
        var4_2 = ax.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("dbbo", daew(int ), (int)211)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ax.daez("dbbp", dafb(int ), (int)359)) break;
            v2 /* !! */  = (long)ax.daez("dbbq", dafb(int ), (int)360);
        }
        var3_3 /* !! */  = ax.b;
        v3 /* !! */  = ax.ha;
        if (true) ** GOTO lbl29
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - ax.daez("dbbr", daew(int ), (int)212));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1049592776: {
                    v4 = ax.daez("dbbs", daew(int ), (int)213);
                    continue block19;
                }
                case -457754620: {
                    break block19;
                }
                case 71754759: {
                    v4 = ax.daez("dbbt", daew(int ), (int)214);
                    continue block19;
                }
            }
            break;
        }
        var2_4 = ax.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
                    return (boolean)ax.daez("dbbu", dafb(int ), (int)361);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dbbv", daew(int ), (int)215)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ax.daez("dbbw", dafb(int ), (int)362)) break;
                    v5 /* !! */  = (long)ax.daez("dbbx", dafb(int ), (int)363);
                }
                v6 = (Class)var1_1.getKey();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = ax.ha - ax.daez("dbby", daew(int ), (int)216)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ax.daez("dbbz", dafb(int ), (int)364)) break;
                    v7 /* !! */  = (long)ax.daez("dbca", dafb(int ), (int)365);
                }
                return v6.equals(var0);
            }
lbl61:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)ax.daez("dbcb", dafb(int ), (int)366);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 1: {
                var3_3 /* !! */  = (int)ax.daez("dbcc", dafb(int ), (int)367);
                if (var4_2) {
                    throw null;
                }
            }
lbl70:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ax.daez("dbcd", dafb(int ), (int)368);
                    if (!var4_2) ** GOTO lbl61
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ax.daez("dbce", dafb(int ), (int)369);
        ** while (!var4_2)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dbdy() {
        ax.dafd[0] = -1596034478;
        ax.dafd[1] = -1608665161;
        ax.dafd[2] = 405362101;
        ax.dafd[3] = -1853213007;
        ax.dafd[4] = -171126524;
        ax.dafd[5] = 638823949;
        ax.dafd[6] = -1036249483;
        ax.dafd[7] = -1223805453;
        ax.dafd[8] = 429867595;
        ax.dafd[9] = 66013552;
        ax.dafd[10] = -965419647;
        ax.dafd[11] = 65999583;
        ax.dafd[12] = -857513558;
        ax.dafd[13] = -1384372405;
        ax.dafd[14] = 1683381697;
        ax.dafd[15] = -1435412946;
        ax.dafd[16] = -1839292125;
        ax.dafd[17] = 546382341;
        ax.dafd[18] = 1320016557;
        ax.dafd[19] = 973872523;
        ax.dafd[20] = 322818067;
        ax.dafd[21] = -1588755802;
        ax.dafd[22] = 1252757988;
        ax.dafd[23] = -944360638;
        ax.dafd[24] = 2099505883;
        ax.dafd[25] = -1205550675;
        ax.dafd[26] = -2054009487;
        ax.dafd[27] = -171938505;
        ax.dafd[28] = 743921231;
        ax.dafd[29] = 1082296088;
        ax.dafd[30] = -863414659;
        ax.dafd[31] = 1683195646;
        ax.dafd[32] = -127999512;
        ax.dafd[33] = 1212995857;
        ax.dafd[34] = -2114311760;
        ax.dafd[35] = 1505959807;
        ax.dafd[36] = -2062714825;
        ax.dafd[37] = 1548621427;
        ax.dafd[38] = 29592183;
        ax.dafd[39] = -773294129;
        ax.dafd[40] = -1326068806;
        ax.dafd[41] = -162329610;
        ax.dafd[42] = -1316479952;
        ax.dafd[43] = -988083201;
        ax.dafd[44] = -285031748;
        ax.dafd[45] = -1797617875;
        ax.dafd[46] = 319065523;
        ax.dafd[47] = 1178893922;
        ax.dafd[48] = -1936330297;
        ax.dafd[49] = -860169817;
        ax.dafd[50] = -619598220;
        ax.dafd[51] = -1143779578;
        ax.dafd[52] = -805793377;
        ax.dafd[53] = 1948948288;
        ax.dafd[54] = 1825370192;
        ax.dafd[55] = 1296053289;
        ax.dafd[56] = -1970642776;
        ax.dafd[57] = 2137417139;
        ax.dafd[58] = 1823651460;
        ax.dafd[59] = -1456754318;
        ax.dafd[60] = -1419989504;
        ax.dafd[61] = -865510471;
        ax.dafd[62] = 903409720;
        ax.dafd[63] = -2078711366;
        ax.dafd[64] = -1160399271;
        ax.dafd[65] = 1634136801;
        ax.dafd[66] = 414963688;
        ax.dafd[67] = -765722637;
        ax.dafd[68] = -1692155357;
        ax.dafd[69] = 964858555;
        ax.dafd[70] = -1085223110;
        ax.dafd[71] = -1303386103;
        ax.dafd[72] = -1222487458;
        ax.dafd[73] = -957388332;
        ax.dafd[74] = 1998855864;
        ax.dafd[75] = -1159577911;
        ax.dafd[76] = -1125012685;
        ax.dafd[77] = -2024622496;
        ax.dafd[78] = -713766215;
        ax.dafd[79] = 624705466;
        ax.dafd[80] = -1441487257;
        ax.dafd[81] = -1308594992;
        ax.dafd[82] = -463723904;
        ax.dafd[83] = 772866867;
        ax.dafd[84] = 1378281940;
        ax.dafd[85] = 480538862;
        ax.dafd[86] = 35142977;
        ax.dafd[87] = -10738055;
        ax.dafd[88] = -1564929273;
        ax.dafd[89] = 478148340;
        ax.dafd[90] = 862695349;
        ax.dafd[91] = 199824292;
        ax.dafd[92] = 1542188822;
        ax.dafd[93] = -572330161;
        ax.dafd[94] = -1437299130;
        ax.dafd[95] = 226973773;
        ax.dafd[96] = 724216243;
        ax.dafd[97] = -330446048;
        ax.dafd[98] = 213307676;
        ax.dafd[99] = 1001719591;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$unregister$1(Object var0, ax$MethodData var1_1) {
        v0 /* !! */  = ax.ha;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - ax.daez("dbcf", daew(int ), (int)217));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -457754620: {
                    break block11;
                }
                case 214868265: {
                    v1 = ax.daez("dbcg", daew(int ), (int)218);
                    continue block11;
                }
                case 485855487: {
                    v1 = ax.daez("dbch", daew(int ), (int)219);
                    continue block11;
                }
            }
            break;
        }
        var4_2 = ax.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("dbci", daew(int ), (int)220)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ax.daez("dbcj", dafb(int ), (int)370)) break;
            v2 /* !! */  = (long)ax.daez("dbck", dafb(int ), (int)371);
        }
        var3_3 = ax.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dbcl", daew(int ), (int)221)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ax.daez("dbcm", dafb(int ), (int)372)) break;
            v3 /* !! */  = (long)ax.daez("dbcn", dafb(int ), (int)373);
        }
        var2_4 = ax.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return (boolean)ax.daez("dbco", dafb(int ), (int)374);
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ax.ha - ax.daez("dbcp", daew(int ), (int)222)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ax.daez("dbcq", dafb(int ), (int)375)) break;
            v4 /* !! */  = (long)ax.daez("dbcr", dafb(int ), (int)376);
        }
        v5 = var1_1.source();
        v6 /* !! */  = ax.ha;
        if (true) ** GOTO lbl42
        block16: while (true) {
            v6 /* !! */  = (long)(v7 - ax.daez("dbcs", daew(int ), (int)223));
lbl42:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1031823770: {
                    v7 = ax.daez("dbct", daew(int ), (int)224);
                    continue block16;
                }
                case -1003673735: {
                    v7 = ax.daez("dbcu", daew(int ), (int)225);
                    continue block16;
                }
                case -457754620: {
                    break block16;
                }
                case -118015156: {
                    v7 = ax.daez("dbcv", daew(int ), (int)226);
                    continue block16;
                }
            }
            break;
        }
        return v5.equals(var0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean isMethodBad(Method var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("daum", daew(int ), (int)175)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ax.daez("daun", dafb(int ), (int)224)) break;
            v0 /* !! */  = (long)ax.daez("dauo", dafb(int ), (int)225);
        }
        var3_1 = ax.c;
        v1 /* !! */  = ax.ha;
        if (true) ** GOTO lbl12
        block28: while (true) {
            v1 /* !! */  = (long)(ax.daez("dauq", daew(int ), (int)177) - ax.daez("daup", daew(int ), (int)176));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1050307055: {
                    continue block28;
                }
                case -457754620: {
                    break block28;
                }
            }
            break;
        }
        var2_2 /* !! */  = ax.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("daur", daew(int ), (int)178)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ax.daez("daus", dafb(int ), (int)226)) break;
            v2 /* !! */  = (long)ax.daez("daut", dafb(int ), (int)227);
        }
        var1_3 = ax.a;
        if (var3_1) {
            throw null;
lbl27:
            // 5 sources

            return (boolean)ax.daez("dauu", dafb(int ), (int)228);
        }
        if (var1_3 || var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = ax.ha;
                if (true) ** GOTO lbl37
                block31: while (true) {
                    v3 /* !! */  = (long)(v4 - ax.daez("dauv", daew(int ), (int)179));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -457754620: {
                            break block31;
                        }
                        case 1089944570: {
                            v4 = ax.daez("dauw", daew(int ), (int)180);
                            continue block31;
                        }
                        case 1477157625: {
                            v4 = ax.daez("daux", daew(int ), (int)181);
                            continue block31;
                        }
                        case 1770031090: {
                            v4 = ax.daez("dauy", daew(int ), (int)182);
                            continue block31;
                        }
                    }
                    break;
                }
                if (var0.getParameterTypes().length != ax.daez("dauz", dafb(int ), (int)229)) ** GOTO lbl62
                if (var1_3) ** GOTO lbl27
                v5 /* !! */  = ax.ha;
                if (true) ** GOTO lbl55
                block32: while (true) {
                    v5 /* !! */  = (long)(ax.daez("davb", daew(int ), (int)184) - ax.daez("dava", daew(int ), (int)183));
lbl55:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -457754620: {
                            break block32;
                        }
                        case 876690196: {
                            continue block32;
                        }
                    }
                    break;
                }
                if (var0.isAnnotationPresent(aw.class)) ** GOTO lbl67
                if (var1_3) ** GOTO lbl27
lbl62:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl27
                v6 = ax.daez("davc", dafb(int ), (int)230);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl70
lbl67:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v6 = ax.daez("davd", dafb(int ), (int)231);
lbl70:
                // 2 sources

                return (boolean)v6;
            }
lbl71:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ax.daez("dave", dafb(int ), (int)232);
                if (!var3_1) break;
                throw null;
            }
lbl75:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ax.daez("davf", dafb(int ), (int)233);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ax.daez("davg", dafb(int ), (int)234);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)ax.daez("davh", dafb(int ), (int)235);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ax.daez("davi", dafb(int ), (int)236);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ax.daez("davj", dafb(int ), (int)237);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)ax.daez("davk", dafb(int ), (int)238);
                } while (!var3_1);
                throw null;
            }
lbl101:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ax.daez("davl", dafb(int ), (int)239);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl106:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ax.daez("davm", dafb(int ), (int)240);
                if (var3_1) {
                    throw null;
                }
            }
lbl110:
            // 4 sources

            case 9: {
                var2_2 /* !! */  = (int)ax.daez("davn", dafb(int ), (int)241);
                if (!var3_1) ** GOTO lbl106
                throw null;
            }
            case 10: 
        }
        do {
            var2_2 /* !! */  = (int)ax.daez("davo", dafb(int ), (int)242);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void register(Object var0, Class<? extends az> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("dagw", daew(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ax.daez("dagx", dafb(int ), (int)28)) break;
            v0 /* !! */  = (long)ax.daez("dagy", dafb(int ), (int)29);
        }
        var8_2 = ax.c;
        v1 /* !! */  = ax.ha;
        if (true) ** GOTO lbl11
        block45: while (true) {
            v1 /* !! */  = (long)(v2 - ax.daez("dagz", daew(int ), (int)18));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -457754620: {
                    break block45;
                }
                case 95593882: {
                    v2 = ax.daez("daha", daew(int ), (int)19);
                    continue block45;
                }
                case 1007397608: {
                    v2 = ax.daez("dahb", daew(int ), (int)20);
                    continue block45;
                }
            }
            break;
        }
        var7_3 /* !! */  = ax.b;
        v3 /* !! */  = ax.ha;
        if (true) ** GOTO lbl25
        block46: while (true) {
            v3 /* !! */  = (long)(ax.daez("dahd", daew(int ), (int)22) - ax.daez("dahc", daew(int ), (int)21));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -457754620: {
                    break block46;
                }
                case 1814338955: {
                    continue block46;
                }
            }
            break;
        }
        var6_4 = ax.a;
        if (var8_2) {
            throw null;
lbl33:
            // 14 sources

            return;
        }
        if (var6_4) ** GOTO lbl33
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl33
                v4 /* !! */  = ax.ha;
                if (true) ** GOTO lbl44
                block48: while (true) {
                    v4 /* !! */  = (long)(v5 - ax.daez("dahe", daew(int ), (int)23));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -457754620: {
                            break block48;
                        }
                        case -249856551: {
                            v5 = ax.daez("dahf", daew(int ), (int)24);
                            continue block48;
                        }
                        case -98196113: {
                            v5 = ax.daez("dahg", daew(int ), (int)25);
                            continue block48;
                        }
                        case 349470969: {
                            v5 = ax.daez("dahh", daew(int ), (int)26);
                            continue block48;
                        }
                    }
                    break;
                }
                v6 = var0.getClass();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dahi", daew(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ax.daez("dahj", dafb(int ), (int)30)) break;
                    v7 /* !! */  = (long)ax.daez("dahk", dafb(int ), (int)31);
                }
                var2_5 = v6.getDeclaredMethods();
                if (var6_4) ** GOTO lbl33
                var3_6 = var2_5.length;
                if (var6_4) ** GOTO lbl33
                var4_7 = ax.daez("dahl", dafb(int ), (int)32);
                if (var6_4) ** GOTO lbl33
                do {
                    if (var6_4 || var6_4) ** GOTO lbl33
                    if (var4_7 >= var3_6) ** GOTO lbl101
                    if (var6_4) ** GOTO lbl33
                    var5_8 = var2_5[var4_7];
                    if (var6_4 || var6_4) ** GOTO lbl33
                    v8 /* !! */  = ax.ha;
                    if (true) ** GOTO lbl78
                    block51: while (true) {
                        v8 /* !! */  = (long)(ax.daez("dahn", daew(int ), (int)29) - ax.daez("dahm", daew(int ), (int)28));
lbl78:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -457754620: {
                                break block51;
                            }
                            case 1046969491: {
                                continue block51;
                            }
                        }
                        break;
                    }
                    if (!ax.isMethodBad(var5_8, var1_1)) ** GOTO lbl88
                    if (var6_4 || var6_4) ** GOTO lbl33
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl96
lbl88:
                    // 1 sources

                    if (var6_4 || var6_4) ** GOTO lbl33
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_2 = ax.ha - ax.daez("daho", daew(int ), (int)30)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == ax.daez("dahp", dafb(int ), (int)33)) break;
                        v9 /* !! */  = (long)ax.daez("dahq", dafb(int ), (int)34);
                    }
                    ax.register(var5_8, var0);
                    if (var6_4) ** GOTO lbl33
lbl96:
                    // 2 sources

                    if (var6_4 || var6_4) ** GOTO lbl33
                    ++var4_7;
                    if (var6_4) ** GOTO lbl33
                } while (!var8_2);
                throw null;
lbl101:
                // 1 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
lbl104:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)ax.daez("dahr", dafb(int ), (int)35);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl109:
            // 3 sources

            case 1: {
                var7_3 /* !! */  = (int)ax.daez("dahs", dafb(int ), (int)36);
                if (!var8_2) break;
                throw null;
            }
lbl113:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)ax.daez("daht", dafb(int ), (int)37);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl118:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)ax.daez("dahu", dafb(int ), (int)38);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl123:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)ax.daez("dahv", dafb(int ), (int)39);
                if (!var8_2) ** GOTO lbl104
                throw null;
            }
            case 5: {
                var7_3 /* !! */  = (int)ax.daez("dahw", dafb(int ), (int)40);
                if (!var8_2) ** GOTO lbl109
                throw null;
            }
lbl131:
            // 3 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ax.daez("dahx", dafb(int ), (int)41);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl170
                    break;
                }
            }
lbl137:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)ax.daez("dahy", dafb(int ), (int)42);
                if (!var8_2) ** GOTO lbl131
                throw null;
            }
            case 8: {
                var7_3 /* !! */  = (int)ax.daez("dahz", dafb(int ), (int)43);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 9: {
                var7_3 /* !! */  = (int)ax.daez("daia", dafb(int ), (int)44);
                if (!var8_2) ** GOTO lbl113
                throw null;
            }
lbl150:
            // 2 sources

            case 10: {
                var7_3 /* !! */  = (int)ax.daez("daib", dafb(int ), (int)45);
                if (!var8_2) break;
                throw null;
            }
lbl154:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)ax.daez("daic", dafb(int ), (int)46);
                if (!var8_2) ** GOTO lbl109
                throw null;
            }
            case 12: {
                var7_3 /* !! */  = (int)ax.daez("daid", dafb(int ), (int)47);
                if (!var8_2) ** GOTO lbl154
                throw null;
            }
            case 13: {
                var7_3 /* !! */  = (int)ax.daez("daie", dafb(int ), (int)48);
                if (!var8_2) ** GOTO lbl118
                throw null;
            }
lbl166:
            // 3 sources

            case 14: {
                var7_3 /* !! */  = (int)ax.daez("daif", dafb(int ), (int)49);
                if (var8_2) {
                    throw null;
                }
            }
lbl170:
            // 4 sources

            case 15: {
                var7_3 /* !! */  = (int)ax.daez("daig", dafb(int ), (int)50);
                if (!var8_2) ** GOTO lbl150
                throw null;
            }
lbl174:
            // 3 sources

            case 16: {
                var7_3 /* !! */  = (int)ax.daez("daih", dafb(int ), (int)51);
                if (!var8_2) break;
                throw null;
            }
lbl178:
            // 2 sources

            case 17: {
                do {
                    var7_3 /* !! */  = (int)ax.daez("daii", dafb(int ), (int)52);
                } while (!var8_2);
                throw null;
            }
            case 18: {
                var7_3 /* !! */  = (int)ax.daez("daij", dafb(int ), (int)53);
                if (!var8_2) ** GOTO lbl137
                throw null;
            }
            case 19: {
                var7_3 /* !! */  = (int)ax.daez("daik", dafb(int ), (int)54);
                if (!var8_2) ** GOTO lbl178
                throw null;
            }
            case 20: {
                var7_3 /* !! */  = (int)ax.daez("dail", dafb(int ), (int)55);
                if (!var8_2) ** GOTO lbl174
                throw null;
            }
            case 21: {
                var7_3 /* !! */  = (int)ax.daez("daim", dafb(int ), (int)56);
                if (!var8_2) ** GOTO lbl131
                throw null;
            }
            case 22: 
        }
        var7_3 /* !! */  = (int)ax.daez("dain", dafb(int ), (int)57);
        ** while (!var8_2)
lbl202:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dbea() {
        ax.dafd[200] = 506951345;
        ax.dafd[201] = -2116794648;
        ax.dafd[202] = 1503889893;
        ax.dafd[203] = 625422752;
        ax.dafd[204] = 974042818;
        ax.dafd[205] = -711260389;
        ax.dafd[206] = -231405801;
        ax.dafd[207] = -916044811;
        ax.dafd[208] = 234820461;
        ax.dafd[209] = 1300095775;
        ax.dafd[210] = 875341009;
        ax.dafd[211] = 20407959;
        ax.dafd[212] = 899622100;
        ax.dafd[213] = 1176613117;
        ax.dafd[214] = -140670552;
        ax.dafd[215] = 646065104;
        ax.dafd[216] = 178594421;
        ax.dafd[217] = 1597230939;
        ax.dafd[218] = 1411704924;
        ax.dafd[219] = 73170062;
        ax.dafd[220] = 922211023;
        ax.dafd[221] = 119375449;
        ax.dafd[222] = 1622716952;
        ax.dafd[223] = -2063231149;
        ax.dafd[224] = -466048777;
        ax.dafd[225] = -1073902993;
        ax.dafd[226] = -464868328;
        ax.dafd[227] = 516513243;
        ax.dafd[228] = -740513864;
        ax.dafd[229] = 1648373195;
        ax.dafd[230] = -257851438;
        ax.dafd[231] = -798966708;
        ax.dafd[232] = 947549535;
        ax.dafd[233] = -1426156368;
        ax.dafd[234] = -863711159;
        ax.dafd[235] = 77313357;
        ax.dafd[236] = -742176464;
        ax.dafd[237] = -200578620;
        ax.dafd[238] = -2021531415;
        ax.dafd[239] = -618841453;
        ax.dafd[240] = 1510382574;
        ax.dafd[241] = 1464973506;
        ax.dafd[242] = 633148083;
        ax.dafd[243] = 345315835;
        ax.dafd[244] = -670421374;
        ax.dafd[245] = -331102747;
        ax.dafd[246] = -89207130;
        ax.dafd[247] = 1487953641;
        ax.dafd[248] = 1384175431;
        ax.dafd[249] = -1742750841;
        ax.dafd[250] = -2144418081;
        ax.dafd[251] = 1458117940;
        ax.dafd[252] = 231042251;
        ax.dafd[253] = -1403199877;
        ax.dafd[254] = -138030689;
        ax.dafd[255] = -1127588790;
        ax.dafd[256] = -1909437973;
        ax.dafd[257] = 1625236204;
        ax.dafd[258] = 834435919;
        ax.dafd[259] = -716215150;
        ax.dafd[260] = 1994557713;
        ax.dafd[261] = -7396265;
        ax.dafd[262] = 412625753;
        ax.dafd[263] = -1319209515;
        ax.dafd[264] = 1399016550;
        ax.dafd[265] = -1921481581;
        ax.dafd[266] = -98764411;
        ax.dafd[267] = 213044168;
        ax.dafd[268] = 1839960470;
        ax.dafd[269] = -1094373816;
        ax.dafd[270] = 32321879;
        ax.dafd[271] = -1409042527;
        ax.dafd[272] = -365625898;
        ax.dafd[273] = -1073362270;
        ax.dafd[274] = -1592580171;
        ax.dafd[275] = 1943389932;
        ax.dafd[276] = 257615399;
        ax.dafd[277] = 1587502656;
        ax.dafd[278] = -2002762035;
        ax.dafd[279] = -1324239970;
        ax.dafd[280] = 210573275;
        ax.dafd[281] = -884915854;
        ax.dafd[282] = 1524003893;
        ax.dafd[283] = 446249322;
        ax.dafd[284] = -540531368;
        ax.dafd[285] = 533063588;
        ax.dafd[286] = 369046867;
        ax.dafd[287] = -574395309;
        ax.dafd[288] = -2067842277;
        ax.dafd[289] = -518772204;
        ax.dafd[290] = -1067043330;
        ax.dafd[291] = 1143956610;
        ax.dafd[292] = 358596864;
        ax.dafd[293] = -1128396341;
        ax.dafd[294] = 740496741;
        ax.dafd[295] = -118140071;
        ax.dafd[296] = 521620415;
        ax.dafd[297] = -864740150;
        ax.dafd[298] = 230202671;
        ax.dafd[299] = -1020570169;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void unregister(Object var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("daio", daew(int ), (int)31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ax.daez("daip", dafb(int ), (int)58)) break;
            v0 /* !! */  = (long)ax.daez("daiq", dafb(int ), (int)59);
        }
        var5_1 = ax.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dair", daew(int ), (int)32)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ax.daez("dais", dafb(int ), (int)60)) break;
            v1 /* !! */  = (long)ax.daez("dait", dafb(int ), (int)61);
        }
        var4_2 /* !! */  = ax.b;
        v2 /* !! */  = ax.ha;
        if (true) ** GOTO lbl17
        block52: while (true) {
            v2 /* !! */  = (long)(v3 - ax.daez("daiu", daew(int ), (int)33));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1991805276: {
                    v3 = ax.daez("daiv", daew(int ), (int)34);
                    continue block52;
                }
                case -1890608346: {
                    v3 = ax.daez("daiw", daew(int ), (int)35);
                    continue block52;
                }
                case -457754620: {
                    break block52;
                }
            }
            break;
        }
        var3_3 = ax.a;
        if (var5_1) {
            throw null;
lbl29:
            // 8 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl29
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ax.ha;
                if (true) ** GOTO lbl39
                block54: while (true) {
                    v4 /* !! */  = (long)(ax.daez("daiy", daew(int ), (int)37) - ax.daez("daix", daew(int ), (int)36));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1792341214: {
                            continue block54;
                        }
                        case -457754620: {
                            break block54;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ax.ha - ax.daez("daiz", daew(int ), (int)38)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ax.daez("daja", dafb(int ), (int)62)) break;
                    v5 /* !! */  = (long)ax.daez("dajb", dafb(int ), (int)63);
                }
                v6 = ax.REGISTRY_MAP.values();
                v7 /* !! */  = ax.ha;
                if (true) ** GOTO lbl54
                block56: while (true) {
                    v7 /* !! */  = (long)(v8 - ax.daez("dajc", daew(int ), (int)39));
lbl54:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -889385623: {
                            v8 = ax.daez("dajd", daew(int ), (int)40);
                            continue block56;
                        }
                        case -480228191: {
                            v8 = ax.daez("daje", daew(int ), (int)41);
                            continue block56;
                        }
                        case -457754620: {
                            break block56;
                        }
                        case 1435749943: {
                            v8 = ax.daez("dajf", daew(int ), (int)42);
                            continue block56;
                        }
                    }
                    break;
                }
                var1_4 = v6.iterator();
                if (var3_3) ** GOTO lbl29
                do {
                    if (var3_3 || var3_3) ** GOTO lbl29
                    v9 /* !! */  = ax.ha;
                    if (true) ** GOTO lbl74
                    block58: while (true) {
                        v9 /* !! */  = (long)(v10 - ax.daez("dajg", daew(int ), (int)43));
lbl74:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1561951972: {
                                v10 = ax.daez("dajh", daew(int ), (int)44);
                                continue block58;
                            }
                            case -837539207: {
                                v10 = ax.daez("daji", daew(int ), (int)45);
                                continue block58;
                            }
                            case -457754620: {
                                break block58;
                            }
                        }
                        break;
                    }
                    if (!var1_4.hasNext()) ** GOTO lbl115
                    if (var3_3) ** GOTO lbl29
                    v11 /* !! */  = ax.ha;
                    if (true) ** GOTO lbl89
                    block59: while (true) {
                        v11 /* !! */  = (long)(v12 - ax.daez("dajj", daew(int ), (int)46));
lbl89:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -457754620: {
                                break block59;
                            }
                            case 1536599384: {
                                v12 = ax.daez("dajk", daew(int ), (int)47);
                                continue block59;
                            }
                            case 1927523756: {
                                v12 = ax.daez("dajl", daew(int ), (int)48);
                                continue block59;
                            }
                        }
                        break;
                    }
                    var2_5 = var1_4.next();
                    if (var3_3 || var3_3) ** GOTO lbl29
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_3 = ax.ha - ax.daez("dajm", daew(int ), (int)49)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == ax.daez("dajn", dafb(int ), (int)64)) break;
                        v13 /* !! */  = (long)ax.daez("dajo", dafb(int ), (int)65);
                    }
                    v14 = (Predicate<ax$MethodData>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$unregister$0(java.lang.Object ruhack.phobia.ax$MethodData ), (Lruhack/phobia/ax$MethodData;)Z)((Object)var0);
                    while (true) {
                        if ((v15 /* !! */  = (cfr_temp_4 = ax.ha - ax.daez("dajp", daew(int ), (int)50)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v15 /* !! */  == ax.daez("dajq", dafb(int ), (int)66)) break;
                        v15 /* !! */  = (long)ax.daez("dajr", dafb(int ), (int)67);
                    }
                    var2_5.removeIf(v14);
                    if (var3_3 || var3_3) ** GOTO lbl29
                } while (!var5_1);
                throw null;
lbl115:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl29
                v16 = ax.daez("dajs", dafb(int ), (int)68);
                v17 /* !! */  = ax.ha;
                if (true) ** GOTO lbl121
                block62: while (true) {
                    v17 /* !! */  = (long)(v18 - ax.daez("dajt", daew(int ), (int)51));
lbl121:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1831823929: {
                            v18 = ax.daez("daju", daew(int ), (int)52);
                            continue block62;
                        }
                        case -991838436: {
                            v18 = ax.daez("dajv", daew(int ), (int)53);
                            continue block62;
                        }
                        case -457754620: {
                            break block62;
                        }
                        case 146961020: {
                            v18 = ax.daez("dajw", daew(int ), (int)54);
                            continue block62;
                        }
                    }
                    break;
                }
                ax.cleanMap((boolean)v16);
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl137:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)ax.daez("dajx", dafb(int ), (int)69);
                if (!var5_1) break;
                throw null;
            }
lbl141:
            // 2 sources

            case 1: {
                do {
                    var4_2 /* !! */  = (int)ax.daez("dajy", dafb(int ), (int)70);
                } while (!var5_1);
                throw null;
            }
lbl146:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)ax.daez("dajz", dafb(int ), (int)71);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 3: {
                var4_2 /* !! */  = (int)ax.daez("daka", dafb(int ), (int)72);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl165
            }
            case 4: {
                var4_2 /* !! */  = (int)ax.daez("dakb", dafb(int ), (int)73);
                if (!var5_1) break;
                throw null;
            }
            case 5: {
                do {
                    var4_2 /* !! */  = (int)ax.daez("dakc", dafb(int ), (int)74);
                } while (!var5_1);
                throw null;
            }
lbl165:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ax.daez("dakd", dafb(int ), (int)75);
                    if (!var5_1) ** GOTO lbl137
                    throw null;
                }
            }
lbl170:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)ax.daez("dake", dafb(int ), (int)76);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 8: {
                var4_2 /* !! */  = (int)ax.daez("dakf", dafb(int ), (int)77);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl180:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)ax.daez("dakg", dafb(int ), (int)78);
                if (!var5_1) break;
                throw null;
            }
lbl184:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)ax.daez("dakh", dafb(int ), (int)79);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 11: {
                var4_2 /* !! */  = (int)ax.daez("daki", dafb(int ), (int)80);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 12: {
                var4_2 /* !! */  = (int)ax.daez("dakj", dafb(int ), (int)81);
                if (!var5_1) ** GOTO lbl146
                throw null;
            }
lbl198:
            // 3 sources

            case 13: {
                var4_2 /* !! */  = (int)ax.daez("dakk", dafb(int ), (int)82);
                if (!var5_1) ** GOTO lbl141
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)ax.daez("dakl", dafb(int ), (int)83);
                if (!var5_1) ** GOTO lbl170
                throw null;
            }
lbl206:
            // 2 sources

            case 15: {
                var4_2 /* !! */  = (int)ax.daez("dakm", dafb(int ), (int)84);
                if (!var5_1) ** GOTO lbl184
                throw null;
            }
            case 16: 
        }
        var4_2 /* !! */  = (int)ax.daez("dakn", dafb(int ), (int)85);
        ** while (!var5_1)
lbl213:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dbdz() {
        ax.dafd[100] = 1484219104;
        ax.dafd[101] = 1452444846;
        ax.dafd[102] = -983296149;
        ax.dafd[103] = -1339378704;
        ax.dafd[104] = -935113027;
        ax.dafd[105] = 271252460;
        ax.dafd[106] = -1094609080;
        ax.dafd[107] = 1604643806;
        ax.dafd[108] = 1703578187;
        ax.dafd[109] = -706025840;
        ax.dafd[110] = -2016120758;
        ax.dafd[111] = -515013488;
        ax.dafd[112] = 1933933626;
        ax.dafd[113] = 1407829819;
        ax.dafd[114] = 2143340262;
        ax.dafd[115] = 1019582133;
        ax.dafd[116] = 39495929;
        ax.dafd[117] = 1393358574;
        ax.dafd[118] = 798824102;
        ax.dafd[119] = 546386944;
        ax.dafd[120] = 1032863167;
        ax.dafd[121] = -2048437635;
        ax.dafd[122] = 1886781695;
        ax.dafd[123] = 166148352;
        ax.dafd[124] = 714953050;
        ax.dafd[125] = -937647619;
        ax.dafd[126] = -874682546;
        ax.dafd[127] = 683450838;
        ax.dafd[128] = -467812668;
        ax.dafd[129] = -1489487308;
        ax.dafd[130] = -407695536;
        ax.dafd[131] = -1641375691;
        ax.dafd[132] = -936943207;
        ax.dafd[133] = 487466085;
        ax.dafd[134] = 1159116107;
        ax.dafd[135] = -1018270607;
        ax.dafd[136] = -759493970;
        ax.dafd[137] = 789443187;
        ax.dafd[138] = -686277097;
        ax.dafd[139] = -2037560408;
        ax.dafd[140] = -230199464;
        ax.dafd[141] = 79020433;
        ax.dafd[142] = 1183506336;
        ax.dafd[143] = -1087589430;
        ax.dafd[144] = -1181058466;
        ax.dafd[145] = -454748647;
        ax.dafd[146] = -1086508496;
        ax.dafd[147] = -798694004;
        ax.dafd[148] = 101517535;
        ax.dafd[149] = 476127387;
        ax.dafd[150] = -221605389;
        ax.dafd[151] = 1473511841;
        ax.dafd[152] = -1229778573;
        ax.dafd[153] = -1917861833;
        ax.dafd[154] = 442668216;
        ax.dafd[155] = -152054225;
        ax.dafd[156] = 1936431093;
        ax.dafd[157] = 95076023;
        ax.dafd[158] = 498182925;
        ax.dafd[159] = -1274805489;
        ax.dafd[160] = 623073748;
        ax.dafd[161] = -2064849508;
        ax.dafd[162] = 302235886;
        ax.dafd[163] = 599058719;
        ax.dafd[164] = -2043602043;
        ax.dafd[165] = -809700748;
        ax.dafd[166] = -1924230899;
        ax.dafd[167] = -1084646176;
        ax.dafd[168] = 663328271;
        ax.dafd[169] = -1245801802;
        ax.dafd[170] = -1617610034;
        ax.dafd[171] = -1916415706;
        ax.dafd[172] = -399748825;
        ax.dafd[173] = 935420243;
        ax.dafd[174] = -1332789397;
        ax.dafd[175] = -1626815464;
        ax.dafd[176] = -1414861659;
        ax.dafd[177] = 877550713;
        ax.dafd[178] = 872048940;
        ax.dafd[179] = -134605920;
        ax.dafd[180] = -864431975;
        ax.dafd[181] = -2071394705;
        ax.dafd[182] = 494492477;
        ax.dafd[183] = 1225806218;
        ax.dafd[184] = 609008890;
        ax.dafd[185] = -922563484;
        ax.dafd[186] = 1988720186;
        ax.dafd[187] = -2043641459;
        ax.dafd[188] = -1314341392;
        ax.dafd[189] = 17699837;
        ax.dafd[190] = -445603493;
        ax.dafd[191] = 1855863332;
        ax.dafd[192] = -611621218;
        ax.dafd[193] = -259008313;
        ax.dafd[194] = 773138347;
        ax.dafd[195] = 1410312947;
        ax.dafd[196] = 1320770837;
        ax.dafd[197] = -1079928436;
        ax.dafd[198] = 1184447687;
        ax.dafd[199] = -153273280;
    }

    private static /* synthetic */ void dbdu() {
        ax.dafc[0] = -1596034477;
        ax.dafc[1] = 904882171;
        ax.dafc[2] = 405362101;
        ax.dafc[3] = 1853213006;
        ax.dafc[4] = 1059777707;
        ax.dafc[5] = 638823942;
        ax.dafc[6] = -1036249498;
        ax.dafc[7] = -1223805456;
        ax.dafc[8] = 429867615;
        ax.dafc[9] = 66013556;
        ax.dafc[10] = -965419632;
        ax.dafc[11] = 65999579;
        ax.dafc[12] = -857513563;
        ax.dafc[13] = -1384372404;
        ax.dafc[14] = 1683381698;
        ax.dafc[15] = -1435412952;
        ax.dafc[16] = -1839292122;
        ax.dafc[17] = 546382343;
        ax.dafc[18] = 1320016557;
        ax.dafc[19] = 973872539;
        ax.dafc[20] = 322818079;
        ax.dafc[21] = -1588755786;
        ax.dafc[22] = 1252757987;
        ax.dafc[23] = -944360623;
        ax.dafc[24] = 2099505885;
        ax.dafc[25] = -1205550686;
        ax.dafc[26] = -2054009487;
        ax.dafc[27] = -171938525;
        ax.dafc[28] = 743921230;
        ax.dafc[29] = 1462645738;
        ax.dafc[30] = 863414658;
        ax.dafc[31] = 243180432;
        ax.dafc[32] = -127999512;
        ax.dafc[33] = -1212995858;
        ax.dafc[34] = 486720270;
        ax.dafc[35] = 1505959798;
        ax.dafc[36] = -2062714845;
        ax.dafc[37] = 1548621432;
        ax.dafc[38] = 29592184;
        ax.dafc[39] = -773294117;
        ax.dafc[40] = -1326068807;
        ax.dafc[41] = -162329615;
        ax.dafc[42] = -1316479951;
        ax.dafc[43] = -988083220;
        ax.dafc[44] = -285031759;
        ax.dafc[45] = -1797617881;
        ax.dafc[46] = 319065504;
        ax.dafc[47] = 1178893921;
        ax.dafc[48] = -1936330289;
        ax.dafc[49] = -860169820;
        ax.dafc[50] = -619598240;
        ax.dafc[51] = -1143779561;
        ax.dafc[52] = -805793397;
        ax.dafc[53] = 1948948301;
        ax.dafc[54] = 1825370178;
        ax.dafc[55] = 1296053292;
        ax.dafc[56] = -1970642758;
        ax.dafc[57] = 2137417137;
        ax.dafc[58] = 1823651461;
        ax.dafc[59] = -1756110386;
        ax.dafc[60] = 1419989503;
        ax.dafc[61] = -9552312;
        ax.dafc[62] = -903409721;
        ax.dafc[63] = -1043598199;
        ax.dafc[64] = 1160399270;
        ax.dafc[65] = -1764234917;
        ax.dafc[66] = 414963689;
        ax.dafc[67] = -956486055;
        ax.dafc[68] = -1692155358;
        ax.dafc[69] = 964858549;
        ax.dafc[70] = -1085223126;
        ax.dafc[71] = -1303386111;
        ax.dafc[72] = -1222487460;
        ax.dafc[73] = -957388332;
        ax.dafc[74] = 1998855848;
        ax.dafc[75] = -1159577914;
        ax.dafc[76] = -1125012685;
        ax.dafc[77] = -2024622495;
        ax.dafc[78] = -713766212;
        ax.dafc[79] = 624705450;
        ax.dafc[80] = -1441487261;
        ax.dafc[81] = -1308594979;
        ax.dafc[82] = -463723904;
        ax.dafc[83] = 772866877;
        ax.dafc[84] = 1378281937;
        ax.dafc[85] = 480538857;
        ax.dafc[86] = -35142978;
        ax.dafc[87] = -1234036279;
        ax.dafc[88] = -1564929274;
        ax.dafc[89] = -1903738333;
        ax.dafc[90] = 862695348;
        ax.dafc[91] = 199824294;
        ax.dafc[92] = 1542188819;
        ax.dafc[93] = -572330166;
        ax.dafc[94] = -1437299121;
        ax.dafc[95] = 226973772;
        ax.dafc[96] = 724216251;
        ax.dafc[97] = -330446044;
        ax.dafc[98] = 213307670;
        ax.dafc[99] = 1001719587;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void unregister(Object var0, Class<? extends az> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("dako", daew(int ), (int)55)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ax.daez("dakp", dafb(int ), (int)86)) break;
            v0 /* !! */  = (long)ax.daez("dakq", dafb(int ), (int)87);
        }
        var4_2 = ax.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dakr", daew(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ax.daez("daks", dafb(int ), (int)88)) break;
            v1 /* !! */  = (long)ax.daez("dakt", dafb(int ), (int)89);
        }
        var3_3 /* !! */  = ax.b;
        v2 /* !! */  = ax.ha;
        if (true) ** GOTO lbl19
        block56: while (true) {
            v2 /* !! */  = (long)(ax.daez("dakv", daew(int ), (int)58) - ax.daez("daku", daew(int ), (int)57));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1063450365: {
                    continue block56;
                }
                case -457754620: {
                    break block56;
                }
            }
            break;
        }
        var2_4 = ax.a;
        if (!var4_2) ** GOTO lbl31
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl31:
                // 1 sources

                if (var2_4 || var2_4) continue block57;
                v3 /* !! */  = ax.ha;
                if (true) ** GOTO lbl36
                block58: while (true) {
                    v3 /* !! */  = (long)(ax.daez("dakx", daew(int ), (int)60) - ax.daez("dakw", daew(int ), (int)59));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -457754620: {
                            break block58;
                        }
                        case 1871736193: {
                            continue block58;
                        }
                    }
                    break;
                }
                v4 /* !! */  = ax.ha;
                if (true) ** GOTO lbl45
                block59: while (true) {
                    v4 /* !! */  = (long)(v5 - ax.daez("daky", daew(int ), (int)61));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -457754620: {
                            break block59;
                        }
                        case -213109428: {
                            v5 = ax.daez("dakz", daew(int ), (int)62);
                            continue block59;
                        }
                        case -41285437: {
                            v5 = ax.daez("dala", daew(int ), (int)63);
                            continue block59;
                        }
                        case 641713936: {
                            v5 = ax.daez("dalb", daew(int ), (int)64);
                            continue block59;
                        }
                    }
                    break;
                }
                if (!ax.REGISTRY_MAP.containsKey(var1_1)) ** GOTO lbl136
                if (var2_4 || var2_4) continue block57;
                v6 /* !! */  = ax.ha;
                if (true) ** GOTO lbl63
                block60: while (true) {
                    v6 /* !! */  = (long)(v7 - ax.daez("dalc", daew(int ), (int)65));
lbl63:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1848001832: {
                            v7 = ax.daez("dald", daew(int ), (int)66);
                            continue block60;
                        }
                        case -457754620: {
                            break block60;
                        }
                        case -225174717: {
                            v7 = ax.daez("dale", daew(int ), (int)67);
                            continue block60;
                        }
                        case 1182691332: {
                            v7 = ax.daez("dalf", daew(int ), (int)68);
                            continue block60;
                        }
                    }
                    break;
                }
                v8 /* !! */  = ax.ha;
                if (true) ** GOTO lbl79
                block61: while (true) {
                    v8 /* !! */  = (long)(v9 - ax.daez("dalg", daew(int ), (int)69));
lbl79:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1968768908: {
                            v9 = ax.daez("dalh", daew(int ), (int)70);
                            continue block61;
                        }
                        case -457754620: {
                            break block61;
                        }
                        case 509191113: {
                            v9 = ax.daez("dali", daew(int ), (int)71);
                            continue block61;
                        }
                        case 1028414217: {
                            v9 = ax.daez("dalj", daew(int ), (int)72);
                            continue block61;
                        }
                    }
                    break;
                }
                v10 /* !! */  = ax.ha;
                if (true) ** GOTO lbl95
                block62: while (true) {
                    v10 /* !! */  = (long)(ax.daez("dall", daew(int ), (int)74) - ax.daez("dalk", daew(int ), (int)73));
lbl95:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -457754620: {
                            break block62;
                        }
                        case 894428223: {
                            continue block62;
                        }
                    }
                    break;
                }
                v11 = (Predicate<ax$MethodData>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$unregister$1(java.lang.Object ruhack.phobia.ax$MethodData ), (Lruhack/phobia/ax$MethodData;)Z)((Object)var0);
                v12 /* !! */  = ax.ha;
                if (true) ** GOTO lbl105
                block63: while (true) {
                    v12 /* !! */  = (long)(v13 - ax.daez("dalm", daew(int ), (int)75));
lbl105:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -589734110: {
                            v13 = ax.daez("daln", daew(int ), (int)76);
                            continue block63;
                        }
                        case -457754620: {
                            break block63;
                        }
                        case -67236475: {
                            v13 = ax.daez("dalo", daew(int ), (int)77);
                            continue block63;
                        }
                        case 269795467: {
                            v13 = ax.daez("dalp", daew(int ), (int)78);
                            continue block63;
                        }
                    }
                    break;
                }
                ax.REGISTRY_MAP.get(var1_1).removeIf(v11);
                if (var2_4 || var2_4) continue block57;
                v14 = ax.daez("dalq", dafb(int ), (int)90);
                v15 /* !! */  = ax.ha;
                if (true) ** GOTO lbl125
                block64: while (true) {
                    v15 /* !! */  = (long)(v16 - ax.daez("dalr", daew(int ), (int)79));
lbl125:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1960133428: {
                            v16 = ax.daez("dals", daew(int ), (int)80);
                            continue block64;
                        }
                        case -977206636: {
                            v16 = ax.daez("dalt", daew(int ), (int)81);
                            continue block64;
                        }
                        case -457754620: {
                            break block64;
                        }
                    }
                    break;
                }
                ax.cleanMap((boolean)v14);
                if (var2_4) continue block57;
lbl136:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                continue block57;
                return;
lbl139:
                // 2 sources

                case 0: {
                    var3_3 /* !! */  = (int)ax.daez("dalu", dafb(int ), (int)91);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
lbl144:
                // 2 sources

                case 1: {
                    var3_3 /* !! */  = (int)ax.daez("dalv", dafb(int ), (int)92);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
                case 2: {
                    var3_3 /* !! */  = (int)ax.daez("dalw", dafb(int ), (int)93);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl154:
                // 2 sources

                case 3: {
                    var3_3 /* !! */  = (int)ax.daez("dalx", dafb(int ), (int)94);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl171
                }
                case 4: {
                    var3_3 /* !! */  = (int)ax.daez("daly", dafb(int ), (int)95);
                    if (!var4_2) break block57;
                    throw null;
                }
lbl163:
                // 5 sources

                case 5: {
                    var3_3 /* !! */  = (int)ax.daez("dalz", dafb(int ), (int)96);
                    if (!var4_2) ** GOTO lbl139
                    throw null;
                }
                case 6: {
                    var3_3 /* !! */  = (int)ax.daez("dama", dafb(int ), (int)97);
                    if (!var4_2) ** GOTO lbl154
                    throw null;
                }
lbl171:
                // 2 sources

                case 7: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)ax.daez("damb", dafb(int ), (int)98);
                        if (!var4_2) ** GOTO lbl163
                        throw null;
                    }
                }
                case 8: {
                    var3_3 /* !! */  = (int)ax.daez("damc", dafb(int ), (int)99);
                    if (!var4_2) ** GOTO lbl163
                    throw null;
                }
lbl180:
                // 2 sources

                case 9: {
                    var3_3 /* !! */  = (int)ax.daez("damd", dafb(int ), (int)100);
                    if (!var4_2) ** GOTO lbl144
                    throw null;
                }
                case 10: 
            }
        }
        var3_3 /* !! */  = (int)ax.daez("dame", dafb(int ), (int)101);
        ** while (!var4_2)
lbl187:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void removeEntry(Class<? extends az> var0) {
        block33: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("daqn", daew(int ), (int)141)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ax.daez("daqo", dafb(int ), (int)155)) break;
                v0 /* !! */  = (long)ax.daez("daqp", dafb(int ), (int)156);
            }
            var3_1 = ax.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = ax.ha - ax.daez("daqq", daew(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ax.daez("daqr", dafb(int ), (int)157)) break;
                v1 /* !! */  = (long)ax.daez("daqs", dafb(int ), (int)158);
            }
            var2_2 /* !! */  = ax.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = ax.ha - ax.daez("daqt", daew(int ), (int)143)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ax.daez("daqu", dafb(int ), (int)159)) {
                    var1_3 = ax.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)ax.daez("daqv", dafb(int ), (int)160);
            }
            if (var1_3) return;
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block17: do {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) return;
                        v3 /* !! */  = ax.ha;
                        block18: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -784367303: {
                                    v4 = ax.daez("daqx", daew(int ), (int)145);
                                    ** GOTO lbl42
                                }
                                case -457754620: {
                                    break block18;
                                }
                                case 5527601: {
                                    v4 = ax.daez("daqy", daew(int ), (int)146);
                                    ** GOTO lbl42
                                }
                                case 207518646: {
                                    v4 = ax.daez("daqz", daew(int ), (int)147);
lbl42:
                                    // 3 sources

                                    v3 /* !! */  = (long)(v4 - ax.daez("daqw", daew(int ), (int)144));
                                    continue block18;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_4 = ax.ha - ax.daez("dara", daew(int ), (int)148)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  == ax.daez("darb", dafb(int ), (int)161)) {
                                v6 = ax.REGISTRY_MAP.entrySet();
                                ** break;
                            }
                            v5 /* !! */  = (long)ax.daez("darc", dafb(int ), (int)162);
                        }
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)ax.daez("darl", dafb(int ), (int)169);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        var2_2 /* !! */  = (int)ax.daez("darj", dafb(int ), (int)167);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)ax.daez("dark", dafb(int ), (int)168);
                        cfr_temp_0 = 4;
                        if (!var3_1) continue block17;
                        throw null;
                    }
                    case 3: {
                        ** GOTO lbl84
                    }
                    case 5: {
                        break block33;
                    }
lbl68:
                    // 1 sources

                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_5 = ax.ha - ax.daez("dard", daew(int ), (int)149)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  == ax.daez("dare", dafb(int ), (int)163)) break;
                        v7 /* !! */  = (long)ax.daez("darf", dafb(int ), (int)164);
                    }
                    v8 = (Predicate<Map.Entry>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$removeEntry$2(java.lang.Class java.util.Map$Entry ), (Ljava/util/Map$Entry;)Z)(var0);
                    while (true) {
                        if ((v9 /* !! */  = (cfr_temp_6 = ax.ha - ax.daez("darg", daew(int ), (int)150)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v9 /* !! */  == ax.daez("darh", dafb(int ), (int)165)) {
                            v6.removeIf(v8);
                            if (var1_3) return;
                            break;
                        }
                        v9 /* !! */  = (long)ax.daez("dari", dafb(int ), (int)166);
                    }
                    if (!var1_3) return;
                    return;
lbl84:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)ax.daez("darm", dafb(int ), (int)170);
                        cfr_temp_0 = 4;
                        if (!var3_1) continue block17;
                        throw null;
                    }
                    case 4: 
                }
                break;
            } while (true);
            var2_2 /* !! */  = (int)ax.daez("darn", dafb(int ), (int)171);
            if (!var3_1) ** break;
            throw null;
        }
        var2_2 /* !! */  = (int)ax.daez("daro", dafb(int ), (int)172);
        ** while (!var3_1)
lbl98:
        // 1 sources

        throw null;
    }

    static {
        dafc = new int[392];
        dafd = new int[392];
        ax.dbdu();
        ax.dbdv();
        ax.dbdw();
        ax.dbdx();
        ax.dbdy();
        ax.dbdz();
        ax.dbea();
        ax.dbeb();
        daex = new long[236];
        daey = new long[236];
        ax.dbec();
        ax.dbed();
        ax.dbee();
        ax.dbef();
        ax.dbei();
        ax.dbej();
        REGISTRY_MAP = new HashMap<Class<? extends az>, List<ax$MethodData>>();
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean isMethodBad(Method var0, Class<? extends az> var1_1) {
        block53: {
            block54: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("davp", daew(int ), (int)185)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == ax.daez("davq", dafb(int ), (int)243)) break;
                    v0 /* !! */  = (long)ax.daez("davr", dafb(int ), (int)244);
                }
                var4_2 = ax.c;
                v1 /* !! */  = ax.ha;
                block28: while (true) {
                    switch ((int)v1 /* !! */ ) {
                        case -457754620: {
                            break block28;
                        }
                        case 269919413: {
                            v1 /* !! */  = (long)(ax.daez("davt", daew(int ), (int)187) - ax.daez("davs", daew(int ), (int)186));
                            continue block28;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = ax.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = ax.ha - ax.daez("davu", daew(int ), (int)188)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ax.daez("davv", dafb(int ), (int)245)) {
                        var2_4 = ax.a;
                        if (var4_2) {
                            throw null;
                        }
                        break;
                    }
                    v2 /* !! */  = (long)ax.daez("davw", dafb(int ), (int)246);
                }
                if (var2_4 || var2_4) return (boolean)ax.daez("davx", dafb(int ), (int)247);
                v3 /* !! */  = ax.ha;
                block30: while (true) {
                    switch ((int)v3 /* !! */ ) {
                        case -457754620: {
                            break block30;
                        }
                        case 1051764073: {
                            v3 /* !! */  = (long)(ax.daez("davz", daew(int ), (int)190) - ax.daez("davy", daew(int ), (int)189));
                            continue block30;
                        }
                    }
                    break;
                }
                if (ax.isMethodBad(var0)) break block54;
                if (var2_4) return (boolean)ax.daez("davx", dafb(int ), (int)247);
                v4 /* !! */  = ax.ha;
                if (true) ** GOTO lbl40
                block31: while (true) {
                    v4 /* !! */  = (long)(v5 - ax.daez("dawa", daew(int ), (int)191));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1628993099: {
                            v5 = ax.daez("dawb", daew(int ), (int)192);
                            continue block31;
                        }
                        case -457754620: {
                            break block31;
                        }
                        case 1490421612: {
                            v5 = ax.daez("dawc", daew(int ), (int)193);
                            continue block31;
                        }
                        case 1857096291: {
                            v5 = ax.daez("dawd", daew(int ), (int)194);
                            continue block31;
                        }
                    }
                    break;
                }
                v6 = var0.getParameterTypes()[0];
                while (true) {
                    block55: {
                        if ((v7 /* !! */  = (cfr_temp_3 = ax.ha - ax.daez("dawe", daew(int ), (int)195)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                        if (v7 /* !! */  != ax.daez("dawf", dafb(int ), (int)248)) break block55;
                        if (!v6.equals(var1_1)) {
                            break;
                        }
                        ** GOTO lbl74
                    }
                    v7 /* !! */  = (long)ax.daez("dawg", dafb(int ), (int)249);
                }
                if (var2_4) return (boolean)ax.daez("davx", dafb(int ), (int)247);
            }
            if (var2_4) return (boolean)ax.daez("davx", dafb(int ), (int)247);
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_4) return (boolean)ax.daez("davx", dafb(int ), (int)247);
                        v8 = ax.daez("dawh", dafb(int ), (int)250);
                        if (!var4_2) return (boolean)v8;
                        throw null;
                    }
lbl74:
                    // 1 sources

                    if (var2_4 || var2_4) {
                        return (boolean)ax.daez("davx", dafb(int ), (int)247);
                    }
                    v8 = ax.daez("dawi", dafb(int ), (int)251);
                    return (boolean)v8;
                    case 0: {
                        var3_3 /* !! */  = (int)ax.daez("dawj", dafb(int ), (int)252);
                        cfr_temp_0 = 8;
                        if (var4_2) {
                            throw null;
                        }
                        break block53;
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)ax.daez("dawo", dafb(int ), (int)257);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)ax.daez("dawn", dafb(int ), (int)256);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)ax.daez("dawp", dafb(int ), (int)258);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block53;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)ax.daez("dawq", dafb(int ), (int)259);
                        cfr_temp_0 = 9;
                        if (var4_2) {
                            throw null;
                        }
                        break block53;
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)ax.daez("dawt", dafb(int ), (int)262);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)ax.daez("dawk", dafb(int ), (int)253);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)ax.daez("daws", dafb(int ), (int)261);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)ax.daez("dawl", dafb(int ), (int)254);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 8: {
                        var3_3 /* !! */  = (int)ax.daez("dawr", dafb(int ), (int)260);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                break;
            }
            ** GOTO lbl130
        }
        do {
            if (true) ** continue;
lbl130:
            // 2 sources

            var3_3 /* !! */  = (int)ax.daez("dawm", dafb(int ), (int)255);
            cfr_temp_0 = 1;
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ int dafb(int n2) {
        return dafc[n2] ^ dafd[n2];
    }

    public static /* synthetic */ CallSite daez(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dbeb() {
        ax.dafd[300] = 533242553;
        ax.dafd[301] = 909908610;
        ax.dafd[302] = -934426909;
        ax.dafd[303] = 1697945565;
        ax.dafd[304] = -656089611;
        ax.dafd[305] = 1119894409;
        ax.dafd[306] = -1884867702;
        ax.dafd[307] = -1197040223;
        ax.dafd[308] = 719970404;
        ax.dafd[309] = 582770827;
        ax.dafd[310] = 156105107;
        ax.dafd[311] = -1359362782;
        ax.dafd[312] = 936882796;
        ax.dafd[313] = -202165122;
        ax.dafd[314] = -977605387;
        ax.dafd[315] = -2064165428;
        ax.dafd[316] = 608338083;
        ax.dafd[317] = -177422823;
        ax.dafd[318] = 2116797850;
        ax.dafd[319] = -1289178883;
        ax.dafd[320] = 2092909275;
        ax.dafd[321] = -998828922;
        ax.dafd[322] = 1580845051;
        ax.dafd[323] = 1303410647;
        ax.dafd[324] = -725266594;
        ax.dafd[325] = 1739664213;
        ax.dafd[326] = 127915015;
        ax.dafd[327] = 53459543;
        ax.dafd[328] = -184590726;
        ax.dafd[329] = -2040403532;
        ax.dafd[330] = -585630135;
        ax.dafd[331] = 2045150118;
        ax.dafd[332] = -173358529;
        ax.dafd[333] = -1882390307;
        ax.dafd[334] = 1159141192;
        ax.dafd[335] = -1117759569;
        ax.dafd[336] = 105633414;
        ax.dafd[337] = -1688586801;
        ax.dafd[338] = 1890501937;
        ax.dafd[339] = -353208847;
        ax.dafd[340] = -1024791243;
        ax.dafd[341] = 914035264;
        ax.dafd[342] = 474289075;
        ax.dafd[343] = -1990527595;
        ax.dafd[344] = -1333970238;
        ax.dafd[345] = 595996881;
        ax.dafd[346] = 828022314;
        ax.dafd[347] = -2060644669;
        ax.dafd[348] = 1917945589;
        ax.dafd[349] = -1400989565;
        ax.dafd[350] = 697345521;
        ax.dafd[351] = -1053762711;
        ax.dafd[352] = 576585076;
        ax.dafd[353] = -1200165729;
        ax.dafd[354] = 1557060570;
        ax.dafd[355] = -2133588332;
        ax.dafd[356] = 1851201754;
        ax.dafd[357] = -1145940811;
        ax.dafd[358] = -1360788332;
        ax.dafd[359] = -2030372762;
        ax.dafd[360] = 1073125681;
        ax.dafd[361] = 1310662066;
        ax.dafd[362] = 26443283;
        ax.dafd[363] = -1970230017;
        ax.dafd[364] = -1539136476;
        ax.dafd[365] = -1844400406;
        ax.dafd[366] = -1924073508;
        ax.dafd[367] = -387335698;
        ax.dafd[368] = -774434291;
        ax.dafd[369] = 67595277;
        ax.dafd[370] = 698692073;
        ax.dafd[371] = -338910962;
        ax.dafd[372] = -505579329;
        ax.dafd[373] = 273296953;
        ax.dafd[374] = 1014545539;
        ax.dafd[375] = 2086320961;
        ax.dafd[376] = -1865815845;
        ax.dafd[377] = 1586423707;
        ax.dafd[378] = 821291057;
        ax.dafd[379] = 749830921;
        ax.dafd[380] = 854090444;
        ax.dafd[381] = -1389355133;
        ax.dafd[382] = -722412783;
        ax.dafd[383] = 223835011;
        ax.dafd[384] = -1642073685;
        ax.dafd[385] = 1530007047;
        ax.dafd[386] = 1044158451;
        ax.dafd[387] = -309911317;
        ax.dafd[388] = 618543075;
        ax.dafd[389] = -1770106785;
        ax.dafd[390] = -505926561;
        ax.dafd[391] = -2029150500;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void register(Object var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("dafa", daew(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ax.daez("dafe", dafb(int ), (int)0)) break;
            v0 /* !! */  = (long)ax.daez("daff", dafb(int ), (int)1);
        }
        var7_1 = ax.c;
        v1 /* !! */  = ax.ha;
        if (true) ** GOTO lbl11
        block51: while (true) {
            v1 /* !! */  = (long)(v2 - ax.daez("dafg", daew(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -457754620: {
                    break block51;
                }
                case 34127166: {
                    v2 = ax.daez("dafh", daew(int ), (int)2);
                    continue block51;
                }
                case 950853436: {
                    v2 = ax.daez("dafi", daew(int ), (int)3);
                    continue block51;
                }
            }
            break;
        }
        var6_2 /* !! */  = ax.b;
        v3 /* !! */  = ax.ha;
        if (true) ** GOTO lbl25
        block52: while (true) {
            v3 /* !! */  = (long)(ax.daez("dafk", daew(int ), (int)5) - ax.daez("dafj", daew(int ), (int)4));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -666456412: {
                    continue block52;
                }
                case -457754620: {
                    break block52;
                }
            }
            break;
        }
        var5_3 = ax.a;
        if (var7_1) {
            throw null;
lbl33:
            // 13 sources

            return;
        }
        if (var5_3 || var5_3) ** GOTO lbl33
        v4 /* !! */  = ax.ha;
        if (true) ** GOTO lbl40
        block54: while (true) {
            v4 /* !! */  = (long)(v5 - ax.daez("dafl", daew(int ), (int)6));
lbl40:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2056254511: {
                    v5 = ax.daez("dafm", daew(int ), (int)7);
                    continue block54;
                }
                case -457754620: {
                    break block54;
                }
                case 1955767191: {
                    v5 = ax.daez("dafn", daew(int ), (int)8);
                    continue block54;
                }
                case 2026918150: {
                    v5 = ax.daez("dafo", daew(int ), (int)9);
                    continue block54;
                }
            }
            break;
        }
        v6 = var0.getClass();
        v7 /* !! */  = ax.ha;
        if (true) ** GOTO lbl57
        block55: while (true) {
            v7 /* !! */  = (long)(v8 - ax.daez("dafp", daew(int ), (int)10));
lbl57:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1373032383: {
                    v8 = ax.daez("dafq", daew(int ), (int)11);
                    continue block55;
                }
                case -457754620: {
                    break block55;
                }
                case -80463953: {
                    v8 = ax.daez("dafr", daew(int ), (int)12);
                    continue block55;
                }
            }
            break;
        }
        var1_4 = v6.getDeclaredMethods();
        if (var5_3) ** GOTO lbl33
        var2_5 = var1_4.length;
        if (var5_3) ** GOTO lbl33
        var3_6 = ax.daez("dafs", dafb(int ), (int)2);
        if (var5_3) ** GOTO lbl33
        block56: while (true) {
            if (var6_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_3 || var5_3) ** GOTO lbl33
                    if (var3_6 >= var2_5) ** GOTO lbl112
                    if (var5_3) ** GOTO lbl33
                    var4_7 = var1_4[var3_6];
                    if (var5_3 || var5_3) ** GOTO lbl33
                    v9 /* !! */  = ax.ha;
                    if (true) ** GOTO lbl85
                    block57: while (true) {
                        v9 /* !! */  = (long)(v10 - ax.daez("daft", daew(int ), (int)13));
lbl85:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1227225347: {
                                v10 = ax.daez("dafu", daew(int ), (int)14);
                                continue block57;
                            }
                            case -457754620: {
                                break block57;
                            }
                            case 1730042993: {
                                v10 = ax.daez("dafv", daew(int ), (int)15);
                                continue block57;
                            }
                        }
                        break;
                    }
                    if (!ax.isMethodBad(var4_7)) ** GOTO lbl99
                    if (var5_3 || var5_3) ** GOTO lbl33
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl107
lbl99:
                    // 1 sources

                    if (var5_3 || var5_3) ** GOTO lbl33
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dafw", daew(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == ax.daez("dafx", dafb(int ), (int)3)) break;
                        v11 /* !! */  = (long)ax.daez("dafy", dafb(int ), (int)4);
                    }
                    ax.register(var4_7, var0);
                    if (var5_3) ** GOTO lbl33
lbl107:
                    // 2 sources

                    if (var5_3 || var5_3) ** GOTO lbl33
                    ++var3_6;
                    if (var5_3) ** GOTO lbl33
                    if (!var7_1) continue block56;
                    throw null;
lbl112:
                    // 1 sources

                    if (!var5_3 && !var5_3) ** break;
                    ** continue;
                    return;
                }
                case 0: {
                    var6_2 /* !! */  = (int)ax.daez("dafz", dafb(int ), (int)5);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl168
                }
lbl120:
                // 2 sources

                case 1: {
                    var6_2 /* !! */  = (int)ax.daez("daga", dafb(int ), (int)6);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl204
                }
                case 2: {
                    var6_2 /* !! */  = (int)ax.daez("dagb", dafb(int ), (int)7);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl209
                }
                case 3: {
                    var6_2 /* !! */  = (int)ax.daez("dagc", dafb(int ), (int)8);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl145
                }
                case 4: {
                    var6_2 /* !! */  = (int)ax.daez("dagd", dafb(int ), (int)9);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl178
                }
                case 5: {
                    var6_2 /* !! */  = (int)ax.daez("dage", dafb(int ), (int)10);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
lbl145:
                // 4 sources

                case 6: {
                    var6_2 /* !! */  = (int)ax.daez("dagf", dafb(int ), (int)11);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl154
                }
                case 7: {
                    var6_2 /* !! */  = (int)ax.daez("dagg", dafb(int ), (int)12);
                    if (!var7_1) ** GOTO lbl120
                    throw null;
                }
lbl154:
                // 4 sources

                case 8: {
                    var6_2 /* !! */  = (int)ax.daez("dagh", dafb(int ), (int)13);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl159:
                // 2 sources

                case 9: {
                    var6_2 /* !! */  = (int)ax.daez("dagi", dafb(int ), (int)14);
                    if (!var7_1) ** GOTO lbl145
                    throw null;
                }
                case 10: {
                    var6_2 /* !! */  = (int)ax.daez("dagj", dafb(int ), (int)15);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl195
                }
lbl168:
                // 3 sources

                case 11: {
                    var6_2 /* !! */  = (int)ax.daez("dagk", dafb(int ), (int)16);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl199
                }
                case 12: {
                    var6_2 /* !! */  = (int)ax.daez("dagl", dafb(int ), (int)17);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl178:
                // 3 sources

                case 13: {
                    var6_2 /* !! */  = (int)ax.daez("dagm", dafb(int ), (int)18);
                    if (!var7_1) ** GOTO lbl145
                    throw null;
                }
                case 14: {
                    var6_2 /* !! */  = (int)ax.daez("dagn", dafb(int ), (int)19);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl191
                }
lbl187:
                // 2 sources

                case 15: {
                    var6_2 /* !! */  = (int)ax.daez("dago", dafb(int ), (int)20);
                    if (!var7_1) ** GOTO lbl154
                    throw null;
                }
lbl191:
                // 4 sources

                case 16: {
                    var6_2 /* !! */  = (int)ax.daez("dagp", dafb(int ), (int)21);
                    if (!var7_1) ** GOTO lbl178
                    throw null;
                }
lbl195:
                // 2 sources

                case 17: {
                    var6_2 /* !! */  = (int)ax.daez("dagq", dafb(int ), (int)22);
                    if (!var7_1) ** GOTO lbl187
                    throw null;
                }
lbl199:
                // 2 sources

                case 18: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_2 /* !! */  = (int)ax.daez("dagr", dafb(int ), (int)23);
                        if (!var7_1) ** GOTO lbl159
                        throw null;
                    }
                }
lbl204:
                // 3 sources

                case 19: {
                    var6_2 /* !! */  = (int)ax.daez("dags", dafb(int ), (int)24);
                    if (var7_1) {
                        throw null;
                    }
                    ** GOTO lbl213
                }
lbl209:
                // 2 sources

                case 20: {
                    var6_2 /* !! */  = (int)ax.daez("dagt", dafb(int ), (int)25);
                    if (!var7_1) ** GOTO lbl204
                    throw null;
                }
lbl213:
                // 2 sources

                case 21: {
                    var6_2 /* !! */  = (int)ax.daez("dagu", dafb(int ), (int)26);
                    if (!var7_1) ** GOTO lbl168
                    throw null;
                }
                case 22: 
            }
            break;
        }
        var6_2 /* !! */  = (int)ax.daez("dagv", dafb(int ), (int)27);
        ** while (!var7_1)
lbl220:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long daew(int n2) {
        return daex[n2] ^ daey[n2];
    }

    private static /* synthetic */ void dbei() {
        ax.daey[100] = 6394472371141724206L;
        ax.daey[101] = -5168284490536325959L;
        ax.daey[102] = -3127616615564807957L;
        ax.daey[103] = -4481282066722099339L;
        ax.daey[104] = 2245135676516465610L;
        ax.daey[105] = -4121481099700846786L;
        ax.daey[106] = -6145546476430636118L;
        ax.daey[107] = 1836991300036611902L;
        ax.daey[108] = -1733174655405007368L;
        ax.daey[109] = -7561281708287442339L;
        ax.daey[110] = 5032219331456102629L;
        ax.daey[111] = -6832321678921034907L;
        ax.daey[112] = 6244765029040443776L;
        ax.daey[113] = -3871931325486541445L;
        ax.daey[114] = 1205885383005427335L;
        ax.daey[115] = -5357160824058226765L;
        ax.daey[116] = -176270953568706646L;
        ax.daey[117] = -1583548469216164192L;
        ax.daey[118] = 6042357426781040851L;
        ax.daey[119] = 5789012599639704007L;
        ax.daey[120] = 7369156512897183095L;
        ax.daey[121] = -6560254024598422370L;
        ax.daey[122] = -1281333341292952579L;
        ax.daey[123] = 1550190842152938603L;
        ax.daey[124] = -2559580373149042132L;
        ax.daey[125] = -3531446912135255857L;
        ax.daey[126] = 3999659606034925075L;
        ax.daey[127] = -5652814458147741211L;
        ax.daey[128] = 7929911656379741343L;
        ax.daey[129] = 7355871482611522842L;
        ax.daey[130] = 4413773388667575424L;
        ax.daey[131] = -9041334812285647978L;
        ax.daey[132] = 4776451437429705001L;
        ax.daey[133] = 5291850451094394568L;
        ax.daey[134] = -8864177738547756804L;
        ax.daey[135] = 5597453976895897507L;
        ax.daey[136] = 6543797532081674344L;
        ax.daey[137] = -873643000523522685L;
        ax.daey[138] = -8350006410439074779L;
        ax.daey[139] = -2665903816270814075L;
        ax.daey[140] = 650121812645063591L;
        ax.daey[141] = -6059235767643498097L;
        ax.daey[142] = 6657192637874183469L;
        ax.daey[143] = -2201720599389320021L;
        ax.daey[144] = -8593718158741125901L;
        ax.daey[145] = 1398817192911444818L;
        ax.daey[146] = 5306825956730840539L;
        ax.daey[147] = 1745218047100348614L;
        ax.daey[148] = -74111150523798833L;
        ax.daey[149] = 794037337635334573L;
        ax.daey[150] = 5695089033238387696L;
        ax.daey[151] = -3295867932535779555L;
        ax.daey[152] = -6137192951077131561L;
        ax.daey[153] = 4978730935881612769L;
        ax.daey[154] = 2439025231344554323L;
        ax.daey[155] = -2457849141249473989L;
        ax.daey[156] = 1608149941941540612L;
        ax.daey[157] = -30548828576974763L;
        ax.daey[158] = -8768307620698221276L;
        ax.daey[159] = 8218865303402936665L;
        ax.daey[160] = -6746854286197878784L;
        ax.daey[161] = 3640090010115218084L;
        ax.daey[162] = -2242990831762447412L;
        ax.daey[163] = 1250674805259675825L;
        ax.daey[164] = 1229126981143312034L;
        ax.daey[165] = 1279229151779017403L;
        ax.daey[166] = -4488270014668126518L;
        ax.daey[167] = -4305237454107125445L;
        ax.daey[168] = 6450227752454679326L;
        ax.daey[169] = 6681637566898244706L;
        ax.daey[170] = 2860442972859694592L;
        ax.daey[171] = -1015055580011130079L;
        ax.daey[172] = 3664817458758741241L;
        ax.daey[173] = 7138344723597794330L;
        ax.daey[174] = 3897155521473256044L;
        ax.daey[175] = 2084130103742964126L;
        ax.daey[176] = -5836719714594187347L;
        ax.daey[177] = 8043313252976663921L;
        ax.daey[178] = 8334665193848492668L;
        ax.daey[179] = -231955966392186011L;
        ax.daey[180] = 7320393473457639141L;
        ax.daey[181] = 7171977602432222391L;
        ax.daey[182] = 3479907718051570272L;
        ax.daey[183] = -4590358424441862760L;
        ax.daey[184] = -7482857606536796600L;
        ax.daey[185] = -8060634126653077255L;
        ax.daey[186] = -9169124438324398619L;
        ax.daey[187] = 347237462908019275L;
        ax.daey[188] = 2165962393554623324L;
        ax.daey[189] = 4972950641982092097L;
        ax.daey[190] = 5502458168434982792L;
        ax.daey[191] = 770699494967592466L;
        ax.daey[192] = -3746375443925171216L;
        ax.daey[193] = -9220084870757557655L;
        ax.daey[194] = 2664889860819739065L;
        ax.daey[195] = -3965754989077554399L;
        ax.daey[196] = 614380704115467568L;
        ax.daey[197] = -3791125658246289413L;
        ax.daey[198] = -8820363880839963975L;
        ax.daey[199] = -1719079435605450374L;
    }

    private static /* synthetic */ void dbdx() {
        ax.dafc[300] = 533242521;
        ax.dafc[301] = 909908626;
        ax.dafc[302] = -934426889;
        ax.dafc[303] = 1697945545;
        ax.dafc[304] = -656089630;
        ax.dafc[305] = 1119894435;
        ax.dafc[306] = -1884867699;
        ax.dafc[307] = -1197040200;
        ax.dafc[308] = 719970431;
        ax.dafc[309] = 582770841;
        ax.dafc[310] = 156105102;
        ax.dafc[311] = -1359362769;
        ax.dafc[312] = 936882761;
        ax.dafc[313] = -202165133;
        ax.dafc[314] = -977605383;
        ax.dafc[315] = -2064165402;
        ax.dafc[316] = 608338101;
        ax.dafc[317] = -177422820;
        ax.dafc[318] = 2116797883;
        ax.dafc[319] = -1289178882;
        ax.dafc[320] = 2092909259;
        ax.dafc[321] = -998828909;
        ax.dafc[322] = 1580845027;
        ax.dafc[323] = 1303410626;
        ax.dafc[324] = -725266624;
        ax.dafc[325] = 1739664243;
        ax.dafc[326] = 127915014;
        ax.dafc[327] = 53459574;
        ax.dafc[328] = -184590721;
        ax.dafc[329] = -2040403536;
        ax.dafc[330] = -585630125;
        ax.dafc[331] = 2045150133;
        ax.dafc[332] = -173358547;
        ax.dafc[333] = -1882390326;
        ax.dafc[334] = 1159141197;
        ax.dafc[335] = -1117759579;
        ax.dafc[336] = 105633440;
        ax.dafc[337] = -1688586778;
        ax.dafc[338] = 1890501939;
        ax.dafc[339] = -353208872;
        ax.dafc[340] = -1024791236;
        ax.dafc[341] = 914035299;
        ax.dafc[342] = 474289076;
        ax.dafc[343] = -1990527610;
        ax.dafc[344] = -1333970232;
        ax.dafc[345] = 595996891;
        ax.dafc[346] = 828022331;
        ax.dafc[347] = -2060644660;
        ax.dafc[348] = 1917945555;
        ax.dafc[349] = -1400989543;
        ax.dafc[350] = -697345522;
        ax.dafc[351] = -549173241;
        ax.dafc[352] = 576585077;
        ax.dafc[353] = 291439740;
        ax.dafc[354] = 1557060570;
        ax.dafc[355] = -2133588330;
        ax.dafc[356] = 1851201752;
        ax.dafc[357] = -1145940810;
        ax.dafc[358] = -1360788331;
        ax.dafc[359] = -2030372761;
        ax.dafc[360] = -1111202167;
        ax.dafc[361] = 1310662067;
        ax.dafc[362] = -26443284;
        ax.dafc[363] = 929083721;
        ax.dafc[364] = 0x5BBD5BDB;
        ax.dafc[365] = -1198113765;
        ax.dafc[366] = -1924073507;
        ax.dafc[367] = -387335700;
        ax.dafc[368] = -774434292;
        ax.dafc[369] = 67595278;
        ax.dafc[370] = 698692072;
        ax.dafc[371] = 469656781;
        ax.dafc[372] = 505579328;
        ax.dafc[373] = -1863944518;
        ax.dafc[374] = 1014545539;
        ax.dafc[375] = -2086320962;
        ax.dafc[376] = 459014734;
        ax.dafc[377] = 1586423704;
        ax.dafc[378] = 821291057;
        ax.dafc[379] = 749830922;
        ax.dafc[380] = 854090446;
        ax.dafc[381] = 1389355132;
        ax.dafc[382] = 1781538816;
        ax.dafc[383] = -223835012;
        ax.dafc[384] = 945503045;
        ax.dafc[385] = 1530007047;
        ax.dafc[386] = -1044158452;
        ax.dafc[387] = -2146608182;
        ax.dafc[388] = 618543074;
        ax.dafc[389] = -1770106785;
        ax.dafc[390] = -505926564;
        ax.dafc[391] = -2029150499;
    }

    private static /* synthetic */ void dbee() {
        ax.daex[200] = -699644238556401680L;
        ax.daex[201] = 3922196910580834032L;
        ax.daex[202] = 7661561677222472125L;
        ax.daex[203] = 5422160091677095404L;
        ax.daex[204] = -7658407879055751724L;
        ax.daex[205] = 8745694535474934891L;
        ax.daex[206] = 8456021013275051884L;
        ax.daex[207] = 2869363814662369697L;
        ax.daex[208] = -556179283027112554L;
        ax.daex[209] = 4085546292567827763L;
        ax.daex[210] = -1395239490872885235L;
        ax.daex[211] = -2828384609482276927L;
        ax.daex[212] = -9105583652808608560L;
        ax.daex[213] = 7577742463068304361L;
        ax.daex[214] = 2421461474474842333L;
        ax.daex[215] = 4557902119003075139L;
        ax.daex[216] = -7249554030906483146L;
        ax.daex[217] = 319178750141970895L;
        ax.daex[218] = -7295479405098091157L;
        ax.daex[219] = 4623168540226670274L;
        ax.daex[220] = 3067478524819570599L;
        ax.daex[221] = -4806556146702342438L;
        ax.daex[222] = -2374391082785162765L;
        ax.daex[223] = -8247912373399503639L;
        ax.daex[224] = 2850675530528286965L;
        ax.daex[225] = -2791158038609672481L;
        ax.daex[226] = 9062807341119428205L;
        ax.daex[227] = 5981110273709407557L;
        ax.daex[228] = 6844888168425027756L;
        ax.daex[229] = 1569249278563086625L;
        ax.daex[230] = -3005989291999988595L;
        ax.daex[231] = 5262239174621093698L;
        ax.daex[232] = 3266229728836614109L;
        ax.daex[233] = -2367252427660809066L;
        ax.daex[234] = 3500449579977727326L;
        ax.daex[235] = -6674073034585436221L;
    }

    private static /* synthetic */ void dbdw() {
        ax.dafc[200] = 506951359;
        ax.dafc[201] = -2116794634;
        ax.dafc[202] = 1503889919;
        ax.dafc[203] = 625422760;
        ax.dafc[204] = 974042842;
        ax.dafc[205] = -711260397;
        ax.dafc[206] = -231405798;
        ax.dafc[207] = -916044803;
        ax.dafc[208] = 234820462;
        ax.dafc[209] = 1300095775;
        ax.dafc[210] = 875341007;
        ax.dafc[211] = 20407991;
        ax.dafc[212] = 899622097;
        ax.dafc[213] = 1176613089;
        ax.dafc[214] = -140670557;
        ax.dafc[215] = 646065096;
        ax.dafc[216] = 178594428;
        ax.dafc[217] = 1597230919;
        ax.dafc[218] = 1411704915;
        ax.dafc[219] = 73170055;
        ax.dafc[220] = 922211034;
        ax.dafc[221] = 119375445;
        ax.dafc[222] = 1622716951;
        ax.dafc[223] = -2063231163;
        ax.dafc[224] = 466048776;
        ax.dafc[225] = -1010099415;
        ax.dafc[226] = 464868327;
        ax.dafc[227] = 1889156723;
        ax.dafc[228] = -740513864;
        ax.dafc[229] = 1648373194;
        ax.dafc[230] = -257851437;
        ax.dafc[231] = -798966708;
        ax.dafc[232] = 947549535;
        ax.dafc[233] = -1426156361;
        ax.dafc[234] = -863711168;
        ax.dafc[235] = 77313352;
        ax.dafc[236] = -742176464;
        ax.dafc[237] = -200578612;
        ax.dafc[238] = -2021531411;
        ax.dafc[239] = -618841454;
        ax.dafc[240] = 1510382572;
        ax.dafc[241] = 1464973506;
        ax.dafc[242] = 633148085;
        ax.dafc[243] = -345315836;
        ax.dafc[244] = 1197217828;
        ax.dafc[245] = 331102746;
        ax.dafc[246] = -22328494;
        ax.dafc[247] = 1487953640;
        ax.dafc[248] = -1384175432;
        ax.dafc[249] = -2044731400;
        ax.dafc[250] = -2144418082;
        ax.dafc[251] = 1458117940;
        ax.dafc[252] = 231042251;
        ax.dafc[253] = -1403199877;
        ax.dafc[254] = -138030695;
        ax.dafc[255] = -1127588789;
        ax.dafc[256] = -1909437974;
        ax.dafc[257] = 1625236206;
        ax.dafc[258] = 834435914;
        ax.dafc[259] = -716215147;
        ax.dafc[260] = 1994557721;
        ax.dafc[261] = -7396269;
        ax.dafc[262] = 412625753;
        ax.dafc[263] = -1319209515;
        ax.dafc[264] = 1399016517;
        ax.dafc[265] = -1921481542;
        ax.dafc[266] = -98764413;
        ax.dafc[267] = 213044206;
        ax.dafc[268] = 1839960511;
        ax.dafc[269] = -1094373792;
        ax.dafc[270] = 32321875;
        ax.dafc[271] = -1409042505;
        ax.dafc[272] = -365625897;
        ax.dafc[273] = -1073362249;
        ax.dafc[274] = -1592580186;
        ax.dafc[275] = 1943389938;
        ax.dafc[276] = 257615361;
        ax.dafc[277] = 1587502698;
        ax.dafc[278] = -2002762037;
        ax.dafc[279] = -1324239996;
        ax.dafc[280] = 210573305;
        ax.dafc[281] = -884915884;
        ax.dafc[282] = 1524003880;
        ax.dafc[283] = 446249325;
        ax.dafc[284] = -540531344;
        ax.dafc[285] = 533063608;
        ax.dafc[286] = 369046849;
        ax.dafc[287] = -574395305;
        ax.dafc[288] = -2067842284;
        ax.dafc[289] = -518772223;
        ax.dafc[290] = -1067043366;
        ax.dafc[291] = 1143956646;
        ax.dafc[292] = 358596879;
        ax.dafc[293] = -1128396335;
        ax.dafc[294] = 740496707;
        ax.dafc[295] = -118140074;
        ax.dafc[296] = 521620401;
        ax.dafc[297] = -864740143;
        ax.dafc[298] = 230202665;
        ax.dafc[299] = -1020570153;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$cleanMap$3(Map.Entry var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("dbap", daew(int ), (int)196)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ax.daez("dbaq", dafb(int ), (int)350)) break;
            v0 /* !! */  = (long)ax.daez("dbar", dafb(int ), (int)351);
        }
        var3_1 = ax.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dbas", daew(int ), (int)197)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ax.daez("dbat", dafb(int ), (int)352)) break;
            v1 /* !! */  = (long)ax.daez("dbau", dafb(int ), (int)353);
        }
        var2_2 /* !! */  = ax.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = ax.ha;
                if (true) ** GOTO lbl22
                block23: while (true) {
                    v2 /* !! */  = (long)(ax.daez("dbaw", daew(int ), (int)199) - ax.daez("dbav", daew(int ), (int)198));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -457754620: {
                            break block23;
                        }
                        case 1865014115: {
                            continue block23;
                        }
                    }
                    break;
                }
                var1_3 = ax.a;
                if (var3_1) {
                    throw null;
                    return (boolean)ax.daez("dbax", dafb(int ), (int)354);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = ax.ha;
                if (true) ** GOTO lbl37
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - ax.daez("dbay", daew(int ), (int)200));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1088316763: {
                            v4 = ax.daez("dbaz", daew(int ), (int)201);
                            continue block25;
                        }
                        case -629685816: {
                            v4 = ax.daez("dbba", daew(int ), (int)202);
                            continue block25;
                        }
                        case -532186060: {
                            v4 = ax.daez("dbbb", daew(int ), (int)203);
                            continue block25;
                        }
                        case -457754620: {
                            break block25;
                        }
                    }
                    break;
                }
                v5 = (List)var0.getValue();
                v6 /* !! */  = ax.ha;
                if (true) ** GOTO lbl54
                block26: while (true) {
                    v6 /* !! */  = (long)(v7 - ax.daez("dbbc", daew(int ), (int)204));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1667479657: {
                            v7 = ax.daez("dbbd", daew(int ), (int)205);
                            continue block26;
                        }
                        case -457754620: {
                            break block26;
                        }
                        case 234399496: {
                            v7 = ax.daez("dbbf", daew(int ), (int)206);
                            continue block26;
                        }
                    }
                    break;
                }
                return v5.isEmpty();
            }
lbl64:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)ax.daez("dbbg", dafb(int ), (int)355);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ax.daez("dbbh", dafb(int ), (int)356);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ax.daez("dbbi", dafb(int ), (int)357);
                    if (!var3_1) ** GOTO lbl64
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ax.daez("dbbj", dafb(int ), (int)358);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    /*
     * Exception decompiling
     */
    public static az callEvent(az var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [47[CATCHBLOCK]], but top level block is 2[CASE]
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

    private static /* synthetic */ void dbef() {
        ax.daey[0] = -7329192551983541094L;
        ax.daey[1] = -6755596770684554823L;
        ax.daey[2] = -7462306956385503153L;
        ax.daey[3] = 3957692523005304256L;
        ax.daey[4] = 4464746299118984751L;
        ax.daey[5] = -2289982259901173917L;
        ax.daey[6] = -2999652635719202022L;
        ax.daey[7] = -2390263593128181964L;
        ax.daey[8] = -201072503585737668L;
        ax.daey[9] = -7214403611769658862L;
        ax.daey[10] = 2621083860116005828L;
        ax.daey[11] = 5126251629467440863L;
        ax.daey[12] = -4597000022393864266L;
        ax.daey[13] = 2502201996520333696L;
        ax.daey[14] = -2318181737567888109L;
        ax.daey[15] = -4361915627596342320L;
        ax.daey[16] = -4909823237810484916L;
        ax.daey[17] = 3198612104611692832L;
        ax.daey[18] = -2480476128995535901L;
        ax.daey[19] = -2094020793154475050L;
        ax.daey[20] = 213948063499429453L;
        ax.daey[21] = -5717707343417499056L;
        ax.daey[22] = 6500510832236977144L;
        ax.daey[23] = -1757029967656267439L;
        ax.daey[24] = 4869276823585224408L;
        ax.daey[25] = 5199211527435357884L;
        ax.daey[26] = -8071025069287220338L;
        ax.daey[27] = -5146783174918738426L;
        ax.daey[28] = 4011442706989307411L;
        ax.daey[29] = 3862339284355890721L;
        ax.daey[30] = -2242012774305594176L;
        ax.daey[31] = 8728188866708375018L;
        ax.daey[32] = -8869273160377945789L;
        ax.daey[33] = -6338782405234072010L;
        ax.daey[34] = 4607614731434636768L;
        ax.daey[35] = 8104653509047055686L;
        ax.daey[36] = 383566652612173296L;
        ax.daey[37] = -4720188673442279384L;
        ax.daey[38] = 5802615497342570617L;
        ax.daey[39] = 7558510337664992162L;
        ax.daey[40] = -7719516232489782988L;
        ax.daey[41] = -7223905016487567487L;
        ax.daey[42] = -5153545172577385316L;
        ax.daey[43] = 2392302120964827053L;
        ax.daey[44] = 2638805415963391615L;
        ax.daey[45] = -3098485103374849520L;
        ax.daey[46] = -5812815073291783459L;
        ax.daey[47] = -183696463904422143L;
        ax.daey[48] = 707208079099744100L;
        ax.daey[49] = 3871877473577477777L;
        ax.daey[50] = -5861718029581832412L;
        ax.daey[51] = -6122343240657342619L;
        ax.daey[52] = 3794202425654399486L;
        ax.daey[53] = 1935910881790025836L;
        ax.daey[54] = 336647837644362138L;
        ax.daey[55] = -2168158298661555383L;
        ax.daey[56] = 6293802977606459527L;
        ax.daey[57] = 5732185682429193694L;
        ax.daey[58] = -2092917124763819846L;
        ax.daey[59] = -3338624362514298918L;
        ax.daey[60] = -8034554248111103146L;
        ax.daey[61] = -2789634315927692521L;
        ax.daey[62] = 2856651028550016273L;
        ax.daey[63] = 6370937441102757362L;
        ax.daey[64] = 2041401123258609099L;
        ax.daey[65] = -4879553398445063806L;
        ax.daey[66] = -4177252897264913650L;
        ax.daey[67] = -3062636570458530359L;
        ax.daey[68] = -6372752287386701472L;
        ax.daey[69] = -8483480754443784922L;
        ax.daey[70] = -2172030674495963432L;
        ax.daey[71] = 478296194958125838L;
        ax.daey[72] = 9171792575289950963L;
        ax.daey[73] = 2244231698296498683L;
        ax.daey[74] = 5950036376872378279L;
        ax.daey[75] = -4731328382465559389L;
        ax.daey[76] = -1510560395460913224L;
        ax.daey[77] = -5667892636995465619L;
        ax.daey[78] = -8234777532064348597L;
        ax.daey[79] = 1907000800342169896L;
        ax.daey[80] = -822685696797258058L;
        ax.daey[81] = -1983811598570258887L;
        ax.daey[82] = 1339879540383910568L;
        ax.daey[83] = -4791652241078484226L;
        ax.daey[84] = 7763716805461114208L;
        ax.daey[85] = -3799531574558062005L;
        ax.daey[86] = -6549892547564362060L;
        ax.daey[87] = 8650319064560139882L;
        ax.daey[88] = 6860845988886012284L;
        ax.daey[89] = -5629596082374254705L;
        ax.daey[90] = 7707591927631613555L;
        ax.daey[91] = -6306282214990308231L;
        ax.daey[92] = -4234866887405622752L;
        ax.daey[93] = 6234175164164710992L;
        ax.daey[94] = 491594759389165436L;
        ax.daey[95] = -7572851453438225973L;
        ax.daey[96] = 4116889462464701417L;
        ax.daey[97] = -2477224944048772745L;
        ax.daey[98] = -1906234402428306284L;
        ax.daey[99] = 5045379799960777303L;
    }

    private static /* synthetic */ void dbed() {
        ax.daex[100] = -6173154050190185907L;
        ax.daex[101] = 9147896381607109426L;
        ax.daex[102] = 1764184507747467964L;
        ax.daex[103] = -7471688617326652346L;
        ax.daex[104] = 5181873276534111281L;
        ax.daex[105] = 817555047247271434L;
        ax.daex[106] = 3465296822306222758L;
        ax.daex[107] = 6425887902851578277L;
        ax.daex[108] = -5889377919604663039L;
        ax.daex[109] = 8215683428193910066L;
        ax.daex[110] = -5046252771426029900L;
        ax.daex[111] = -1485882968306261619L;
        ax.daex[112] = 873389047071455562L;
        ax.daex[113] = -5544002000379367617L;
        ax.daex[114] = 6709139115545354791L;
        ax.daex[115] = -7847938848750453732L;
        ax.daex[116] = -5376061234480970064L;
        ax.daex[117] = -3214755845541590850L;
        ax.daex[118] = 8858503458934567646L;
        ax.daex[119] = 8424733194674465029L;
        ax.daex[120] = -2299798228269931558L;
        ax.daex[121] = 6779011633323321288L;
        ax.daex[122] = -6409673973089661834L;
        ax.daex[123] = -3832193092121083540L;
        ax.daex[124] = -8696232508788586964L;
        ax.daex[125] = -7739267925103668485L;
        ax.daex[126] = 6266683660266398878L;
        ax.daex[127] = 2577726548649231457L;
        ax.daex[128] = -3642438904299082297L;
        ax.daex[129] = -86195657456154918L;
        ax.daex[130] = -9219423355301055400L;
        ax.daex[131] = -7308508253942531693L;
        ax.daex[132] = 7481457640416870213L;
        ax.daex[133] = 4158135419025310950L;
        ax.daex[134] = -5954616135753761608L;
        ax.daex[135] = 2179439068219770849L;
        ax.daex[136] = 3528766416037558421L;
        ax.daex[137] = 3975237090108165609L;
        ax.daex[138] = 5251694177274548046L;
        ax.daex[139] = 8800510266517098069L;
        ax.daex[140] = -1283454715801301042L;
        ax.daex[141] = 4395907766967665268L;
        ax.daex[142] = -8831094917079749372L;
        ax.daex[143] = -3358652615071913887L;
        ax.daex[144] = 859113862755417620L;
        ax.daex[145] = -7755683534074327509L;
        ax.daex[146] = -2127277738243656518L;
        ax.daex[147] = -5533998871574235272L;
        ax.daex[148] = 6077808414378023536L;
        ax.daex[149] = -6435563305416748053L;
        ax.daex[150] = -1576045833192010256L;
        ax.daex[151] = 6230308205627946510L;
        ax.daex[152] = -4897424445678695046L;
        ax.daex[153] = 5503531516362381780L;
        ax.daex[154] = -3101226616405088676L;
        ax.daex[155] = 5063820152003063166L;
        ax.daex[156] = 121642290819695661L;
        ax.daex[157] = 5048210317888537124L;
        ax.daex[158] = 55859191273443669L;
        ax.daex[159] = -2333397855999344196L;
        ax.daex[160] = -5973289362463976646L;
        ax.daex[161] = -268846873975144055L;
        ax.daex[162] = -3341844333525951450L;
        ax.daex[163] = -1735476178464072901L;
        ax.daex[164] = -1141566703908836518L;
        ax.daex[165] = -5459134061630914171L;
        ax.daex[166] = -2483033205810578978L;
        ax.daex[167] = -3773574975375234027L;
        ax.daex[168] = -7272463136914979531L;
        ax.daex[169] = 3383361474680575981L;
        ax.daex[170] = 6941627313154007687L;
        ax.daex[171] = 9132002706508008890L;
        ax.daex[172] = -5421829470586183095L;
        ax.daex[173] = -8139617485491079354L;
        ax.daex[174] = 6355843868080881217L;
        ax.daex[175] = 109117317107710741L;
        ax.daex[176] = -3914631312697787208L;
        ax.daex[177] = 8329348090665899291L;
        ax.daex[178] = 7259486866582600019L;
        ax.daex[179] = -4298074101338725966L;
        ax.daex[180] = -2618357654119312722L;
        ax.daex[181] = -2974340644098760076L;
        ax.daex[182] = -5732855483396953948L;
        ax.daex[183] = 4785370105010785278L;
        ax.daex[184] = 2285683664285035391L;
        ax.daex[185] = -3475722795808396135L;
        ax.daex[186] = -6413408035996133164L;
        ax.daex[187] = 4646597983562127688L;
        ax.daex[188] = 5219839678610299144L;
        ax.daex[189] = -2784203086974340711L;
        ax.daex[190] = -8967888734191067481L;
        ax.daex[191] = -2476797015376483185L;
        ax.daex[192] = 5994580609240563961L;
        ax.daex[193] = -2787344831321210061L;
        ax.daex[194] = 7431842651558674712L;
        ax.daex[195] = 3968945223453652135L;
        ax.daex[196] = 1207549505880438544L;
        ax.daex[197] = 5598303041123977016L;
        ax.daex[198] = 4186394506689285657L;
        ax.daex[199] = -2948692140322230366L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$unregister$0(Object var0, ax$MethodData var1_1) {
        v0 /* !! */  = ax.ha;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(v1 - ax.daez("dbda", daew(int ), (int)227));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -821678846: {
                    v1 = ax.daez("dbdb", daew(int ), (int)228);
                    continue block16;
                }
                case -457754620: {
                    break block16;
                }
                case 1694768217: {
                    v1 = ax.daez("dbdc", daew(int ), (int)229);
                    continue block16;
                }
                case 2036902248: {
                    v1 = ax.daez("dbdd", daew(int ), (int)230);
                    continue block16;
                }
            }
            break;
        }
        var4_2 = ax.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("dbde", daew(int ), (int)231)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ax.daez("dbdf", dafb(int ), (int)381)) break;
            v2 /* !! */  = (long)ax.daez("dbdg", dafb(int ), (int)382);
        }
        var3_3 /* !! */  = ax.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("dbdh", daew(int ), (int)232)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ax.daez("dbdi", dafb(int ), (int)383)) break;
            v3 /* !! */  = (long)ax.daez("dbdj", dafb(int ), (int)384);
        }
        var2_4 = ax.a;
        if (var4_2) {
            throw null;
            return (boolean)ax.daez("dbdk", dafb(int ), (int)385);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ax.ha - ax.daez("dbdl", daew(int ), (int)233)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ax.daez("dbdm", dafb(int ), (int)386)) break;
                    v4 /* !! */  = (long)ax.daez("dbdn", dafb(int ), (int)387);
                }
                v5 = var1_1.source();
                v6 /* !! */  = ax.ha;
                if (true) ** GOTO lbl48
                block21: while (true) {
                    v6 /* !! */  = (long)(ax.daez("dbdp", daew(int ), (int)235) - ax.daez("dbdo", daew(int ), (int)234));
lbl48:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1971325962: {
                            continue block21;
                        }
                        case -457754620: {
                            break block21;
                        }
                    }
                    break;
                }
                return v5.equals(var0);
            }
lbl54:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)ax.daez("dbdq", dafb(int ), (int)388);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ax.daez("dbdr", dafb(int ), (int)389);
                    if (!var4_2) ** GOTO lbl54
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)ax.daez("dbds", dafb(int ), (int)390);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ax.daez("dbdt", dafb(int ), (int)391);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void register(Method var0, Object var1_1) {
        block170: {
            block169: {
                v0 /* !! */  = ax.ha;
                if (true) ** GOTO lbl5
                block111: while (true) {
                    v0 /* !! */  = (long)(ax.daez("damg", daew(int ), (int)83) - ax.daez("damf", daew(int ), (int)82));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -457754620: {
                            break block111;
                        }
                        case 1645868905: {
                            continue block111;
                        }
                    }
                    break;
                }
                var6_2 = ax.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_0 = ax.ha - ax.daez("damh", daew(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == ax.daez("dami", dafb(int ), (int)102)) break;
                    v1 /* !! */  = (long)ax.daez("damj", dafb(int ), (int)103);
                }
                var5_3 /* !! */  = ax.b;
                v2 /* !! */  = ax.ha;
                if (true) ** GOTO lbl21
                block113: while (true) {
                    v2 /* !! */  = (long)(ax.daez("daml", daew(int ), (int)86) - ax.daez("damk", daew(int ), (int)85));
lbl21:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -940379067: {
                            continue block113;
                        }
                        case -457754620: {
                            break block113;
                        }
                    }
                    break;
                }
                var4_4 = ax.a;
                if (var6_2) {
                    throw null;
lbl29:
                    // 14 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl29
                v3 /* !! */  = ax.ha;
                if (true) ** GOTO lbl36
                block115: while (true) {
                    v3 /* !! */  = (long)(v4 - ax.daez("damm", daew(int ), (int)87));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1697892172: {
                            v4 = ax.daez("damn", daew(int ), (int)88);
                            continue block115;
                        }
                        case -457754620: {
                            break block115;
                        }
                        case 1880846463: {
                            v4 = ax.daez("damo", daew(int ), (int)89);
                            continue block115;
                        }
                        case 2098780330: {
                            v4 = ax.daez("damp", daew(int ), (int)90);
                            continue block115;
                        }
                    }
                    break;
                }
                var2_5 = var0.getParameterTypes()[0];
                if (var4_4 || var4_4) ** GOTO lbl29
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ax.ha - ax.daez("damq", daew(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ax.daez("damr", dafb(int ), (int)104)) break;
                    v5 /* !! */  = (long)ax.daez("dams", dafb(int ), (int)105);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ax.ha - ax.daez("damt", daew(int ), (int)92)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ax.daez("damu", dafb(int ), (int)106)) break;
                    v6 /* !! */  = (long)ax.daez("damv", dafb(int ), (int)107);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = ax.ha - ax.daez("damw", daew(int ), (int)93)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ax.daez("damx", dafb(int ), (int)108)) break;
                    v7 /* !! */  = (long)ax.daez("damy", dafb(int ), (int)109);
                }
                v8 = var0.getAnnotation(aw.class).value();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = ax.ha - ax.daez("damz", daew(int ), (int)94)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ax.daez("dana", dafb(int ), (int)110)) break;
                    v9 /* !! */  = (long)ax.daez("danb", dafb(int ), (int)111);
                }
                var3_6 = new ax$MethodData(var1_1, var0, v8);
                if (var4_4 || var4_4) ** GOTO lbl29
                v10 /* !! */  = ax.ha;
                if (true) ** GOTO lbl77
                block120: while (true) {
                    v10 /* !! */  = (long)(v11 - ax.daez("danc", daew(int ), (int)95));
lbl77:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2125400878: {
                            v11 = ax.daez("dand", daew(int ), (int)96);
                            continue block120;
                        }
                        case -1274959886: {
                            v11 = ax.daez("dane", daew(int ), (int)97);
                            continue block120;
                        }
                        case -457754620: {
                            break block120;
                        }
                        case 888782443: {
                            v11 = ax.daez("danf", daew(int ), (int)98);
                            continue block120;
                        }
                    }
                    break;
                }
                v12 = var3_6.target();
                v13 /* !! */  = ax.ha;
                if (true) ** GOTO lbl94
                block121: while (true) {
                    v13 /* !! */  = (long)(ax.daez("danh", daew(int ), (int)100) - ax.daez("dang", daew(int ), (int)99));
lbl94:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -457754620: {
                            break block121;
                        }
                        case 2100629270: {
                            continue block121;
                        }
                    }
                    break;
                }
                v14 = var3_6.source();
                v15 /* !! */  = ax.ha;
                if (true) ** GOTO lbl104
                block122: while (true) {
                    v15 /* !! */  = (long)(v16 - ax.daez("dani", daew(int ), (int)101));
lbl104:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -457754620: {
                            break block122;
                        }
                        case 681374330: {
                            v16 = ax.daez("danj", daew(int ), (int)102);
                            continue block122;
                        }
                        case 1450144909: {
                            v16 = ax.daez("dank", daew(int ), (int)103);
                            continue block122;
                        }
                    }
                    break;
                }
                if (v12.canAccess(v14)) break block169;
                if (var4_4 || var4_4) ** GOTO lbl29
                v17 /* !! */  = ax.ha;
                if (true) ** GOTO lbl119
                block123: while (true) {
                    v17 /* !! */  = (long)(ax.daez("danm", daew(int ), (int)105) - ax.daez("danl", daew(int ), (int)104));
lbl119:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1398157630: {
                            continue block123;
                        }
                        case -457754620: {
                            break block123;
                        }
                    }
                    break;
                }
                v18 = var3_6.target();
                v19 = ax.daez("dann", dafb(int ), (int)112);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = ax.ha - ax.daez("dano", daew(int ), (int)106)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ax.daez("danp", dafb(int ), (int)113)) break;
                    v20 /* !! */  = (long)ax.daez("danq", dafb(int ), (int)114);
                }
                v18.setAccessible((boolean)v19);
                if (var4_4) ** GOTO lbl29
            }
            if (var4_4 || var4_4) ** GOTO lbl29
            v21 /* !! */  = ax.ha;
            if (true) ** GOTO lbl139
            block125: while (true) {
                v21 /* !! */  = (long)(v22 - ax.daez("danr", daew(int ), (int)107));
lbl139:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -457754620: {
                        break block125;
                    }
                    case -256046968: {
                        v22 = ax.daez("dans", daew(int ), (int)108);
                        continue block125;
                    }
                    case 216856461: {
                        v22 = ax.daez("dant", daew(int ), (int)109);
                        continue block125;
                    }
                }
                break;
            }
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_6 = ax.ha - ax.daez("danu", daew(int ), (int)110)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == ax.daez("danv", dafb(int ), (int)115)) break;
                v23 /* !! */  = (long)ax.daez("danw", dafb(int ), (int)116);
            }
            if (!ax.REGISTRY_MAP.containsKey(var2_5)) break block170;
            if (var4_4 || var4_4) ** GOTO lbl29
            v24 /* !! */  = ax.ha;
            if (true) ** GOTO lbl159
            block127: while (true) {
                v24 /* !! */  = (long)(v25 - ax.daez("danx", daew(int ), (int)111));
lbl159:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -885011357: {
                        v25 = ax.daez("dany", daew(int ), (int)112);
                        continue block127;
                    }
                    case -457754620: {
                        break block127;
                    }
                    case 508937507: {
                        v25 = ax.daez("danz", daew(int ), (int)113);
                        continue block127;
                    }
                    case 710465359: {
                        v25 = ax.daez("daoa", daew(int ), (int)114);
                        continue block127;
                    }
                }
                break;
            }
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_7 = ax.ha - ax.daez("daob", daew(int ), (int)115)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == ax.daez("daoc", dafb(int ), (int)117)) break;
                v26 /* !! */  = (long)ax.daez("daod", dafb(int ), (int)118);
            }
            v27 /* !! */  = ax.ha;
            if (true) ** GOTO lbl180
            block129: while (true) {
                v27 /* !! */  = (long)(ax.daez("daof", daew(int ), (int)117) - ax.daez("daoe", daew(int ), (int)116));
lbl180:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -457754620: {
                        break block129;
                    }
                    case -396203378: {
                        continue block129;
                    }
                }
                break;
            }
            if (ax.REGISTRY_MAP.get(var2_5).contains((Object)var3_6)) ** GOTO lbl307
            if (var4_4 || var4_4) ** GOTO lbl29
            v28 /* !! */  = ax.ha;
            if (true) ** GOTO lbl191
            block130: while (true) {
                v28 /* !! */  = (long)(ax.daez("daoh", daew(int ), (int)119) - ax.daez("daog", daew(int ), (int)118));
lbl191:
                // 2 sources

                switch ((int)v28 /* !! */ ) {
                    case -1264912474: {
                        continue block130;
                    }
                    case -457754620: {
                        break block130;
                    }
                }
                break;
            }
            v29 /* !! */  = ax.ha;
            if (true) ** GOTO lbl200
            block131: while (true) {
                v29 /* !! */  = (long)(ax.daez("daoj", daew(int ), (int)121) - ax.daez("daoi", daew(int ), (int)120));
lbl200:
                // 2 sources

                switch ((int)v29 /* !! */ ) {
                    case -457754620: {
                        break block131;
                    }
                    case 1359799335: {
                        continue block131;
                    }
                }
                break;
            }
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_8 = ax.ha - ax.daez("daok", daew(int ), (int)122)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == ax.daez("daol", dafb(int ), (int)119)) break;
                v30 /* !! */  = (long)ax.daez("daom", dafb(int ), (int)120);
            }
            ax.REGISTRY_MAP.get(var2_5).add(var3_6);
            if (var4_4 || var4_4) ** GOTO lbl29
            while (true) {
                if ((v31 /* !! */  = (cfr_temp_9 = ax.ha - ax.daez("daon", daew(int ), (int)123)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v31 /* !! */  == ax.daez("daoo", dafb(int ), (int)121)) break;
                v31 /* !! */  = (long)ax.daez("daop", dafb(int ), (int)122);
            }
            ax.sortListValue(var2_5);
            if (var4_4) ** GOTO lbl29
            if (var6_2) {
                throw null;
            }
            ** GOTO lbl307
        }
        if (var4_4 || var4_4) ** GOTO lbl29
        v32 /* !! */  = ax.ha;
        if (true) ** GOTO lbl228
        block134: while (true) {
            v32 /* !! */  = (long)(v33 - ax.daez("daoq", daew(int ), (int)124));
lbl228:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -457754620: {
                    break block134;
                }
                case 2064998327: {
                    v33 = ax.daez("daor", daew(int ), (int)125);
                    continue block134;
                }
                case 2068475940: {
                    v33 = ax.daez("daos", daew(int ), (int)126);
                    continue block134;
                }
            }
            break;
        }
        v34 /* !! */  = ax.ha;
        if (true) ** GOTO lbl241
        block135: while (true) {
            v34 /* !! */  = (long)(v35 - ax.daez("daot", daew(int ), (int)127));
lbl241:
            // 2 sources

            switch ((int)v34 /* !! */ ) {
                case -579093452: {
                    v35 = ax.daez("daou", daew(int ), (int)128);
                    continue block135;
                }
                case -457754620: {
                    break block135;
                }
                case 33396024: {
                    v35 = ax.daez("daov", daew(int ), (int)129);
                    continue block135;
                }
                case 83828309: {
                    v35 = ax.daez("daow", daew(int ), (int)130);
                    continue block135;
                }
            }
            break;
        }
        while (true) {
            if ((v36 /* !! */  = (cfr_temp_10 = ax.ha - ax.daez("daox", daew(int ), (int)131)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v36 /* !! */  == ax.daez("daoy", dafb(int ), (int)123)) break;
            v36 /* !! */  = (long)ax.daez("daoz", dafb(int ), (int)124);
        }
        v37 = new CopyOnWriteArrayList<E>();
        v38 /* !! */  = ax.ha;
        if (true) ** GOTO lbl263
        block137: while (true) {
            v38 /* !! */  = (long)(v39 - ax.daez("dapa", daew(int ), (int)132));
lbl263:
            // 2 sources

            switch ((int)v38 /* !! */ ) {
                case -1651666852: {
                    v39 = ax.daez("dapb", daew(int ), (int)133);
                    continue block137;
                }
                case -457754620: {
                    break block137;
                }
                case 727666580: {
                    v39 = ax.daez("dapc", daew(int ), (int)134);
                    continue block137;
                }
            }
            break;
        }
        ax.REGISTRY_MAP.put(var2_5, v37);
        if (var4_4 || var4_4) ** GOTO lbl29
        v40 /* !! */  = ax.ha;
        if (true) ** GOTO lbl279
        block138: while (true) {
            v40 /* !! */  = (long)(ax.daez("dape", daew(int ), (int)136) - ax.daez("dapd", daew(int ), (int)135));
lbl279:
            // 2 sources

            switch ((int)v40 /* !! */ ) {
                case -1927896466: {
                    continue block138;
                }
                case -457754620: {
                    break block138;
                }
            }
            break;
        }
        v41 /* !! */  = ax.ha;
        if (true) ** GOTO lbl288
        block139: while (true) {
            v41 /* !! */  = (long)(v42 - ax.daez("dapf", daew(int ), (int)137));
lbl288:
            // 2 sources

            switch ((int)v41 /* !! */ ) {
                case -457754620: {
                    break block139;
                }
                case 577837238: {
                    v42 = ax.daez("dapg", daew(int ), (int)138);
                    continue block139;
                }
                case 1763421306: {
                    v42 = ax.daez("daph", daew(int ), (int)139);
                    continue block139;
                }
            }
            break;
        }
        while (true) {
            if ((v43 /* !! */  = (cfr_temp_11 = ax.ha - ax.daez("dapi", daew(int ), (int)140)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v43 /* !! */  == ax.daez("dapj", dafb(int ), (int)125)) break;
            v43 /* !! */  = (long)ax.daez("dapk", dafb(int ), (int)126);
        }
        ax.REGISTRY_MAP.get(var2_5).add(var3_6);
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        block81 : switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl29
lbl307:
                // 3 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)ax.daez("dapl", dafb(int ), (int)127);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
lbl315:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)ax.daez("dapm", dafb(int ), (int)128);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl374
            }
            case 2: {
                var5_3 /* !! */  = (int)ax.daez("dapn", dafb(int ), (int)129);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl401
            }
lbl325:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)ax.daez("dapo", dafb(int ), (int)130);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl406
            }
lbl330:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)ax.daez("dapp", dafb(int ), (int)131);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl387
            }
lbl335:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)ax.daez("dapq", dafb(int ), (int)132);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
            case 6: {
                var5_3 /* !! */  = (int)ax.daez("dapr", dafb(int ), (int)133);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
            case 7: {
                var5_3 /* !! */  = (int)ax.daez("daps", dafb(int ), (int)134);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl350:
            // 3 sources

            case 8: {
                var5_3 /* !! */  = (int)ax.daez("dapt", dafb(int ), (int)135);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
lbl355:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)ax.daez("dapu", dafb(int ), (int)136);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl378
            }
lbl360:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)ax.daez("dapv", dafb(int ), (int)137);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl410
            }
            case 11: {
                var5_3 /* !! */  = (int)ax.daez("dapw", dafb(int ), (int)138);
                if (!var6_2) ** GOTO lbl350
                throw null;
            }
            case 12: {
                var5_3 /* !! */  = (int)ax.daez("dapx", dafb(int ), (int)139);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl414
            }
lbl374:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)ax.daez("dapy", dafb(int ), (int)140);
                if (!var6_2) ** GOTO lbl315
                throw null;
            }
lbl378:
            // 5 sources

            case 14: {
                var5_3 /* !! */  = (int)ax.daez("dapz", dafb(int ), (int)141);
                if (!var6_2) ** GOTO lbl330
                throw null;
            }
            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ax.daez("daqa", dafb(int ), (int)142);
                    if (!var6_2) break block81;
                    throw null;
                }
            }
lbl387:
            // 2 sources

            case 16: {
                var5_3 /* !! */  = (int)ax.daez("daqb", dafb(int ), (int)143);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl423
            }
            case 17: {
                var5_3 /* !! */  = (int)ax.daez("daqc", dafb(int ), (int)144);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl431
            }
            case 18: {
                var5_3 /* !! */  = (int)ax.daez("daqd", dafb(int ), (int)145);
                if (!var6_2) ** GOTO lbl350
                throw null;
            }
lbl401:
            // 2 sources

            case 19: {
                do {
                    var5_3 /* !! */  = (int)ax.daez("daqe", dafb(int ), (int)146);
                } while (!var6_2);
                throw null;
            }
lbl406:
            // 3 sources

            case 20: {
                var5_3 /* !! */  = (int)ax.daez("daqf", dafb(int ), (int)147);
                if (!var6_2) ** GOTO lbl325
                throw null;
            }
lbl410:
            // 2 sources

            case 21: {
                var5_3 /* !! */  = (int)ax.daez("daqg", dafb(int ), (int)148);
                if (!var6_2) ** GOTO lbl335
                throw null;
            }
lbl414:
            // 2 sources

            case 22: {
                do {
                    var5_3 /* !! */  = (int)ax.daez("daqh", dafb(int ), (int)149);
                } while (!var6_2);
                throw null;
            }
lbl419:
            // 3 sources

            case 23: {
                var5_3 /* !! */  = (int)ax.daez("daqi", dafb(int ), (int)150);
                if (!var6_2) ** GOTO lbl360
                throw null;
            }
lbl423:
            // 3 sources

            case 24: {
                var5_3 /* !! */  = (int)ax.daez("daqj", dafb(int ), (int)151);
                if (!var6_2) ** GOTO lbl406
                throw null;
            }
            case 25: {
                var5_3 /* !! */  = (int)ax.daez("daqk", dafb(int ), (int)152);
                if (!var6_2) ** GOTO lbl419
                throw null;
            }
lbl431:
            // 2 sources

            case 26: {
                var5_3 /* !! */  = (int)ax.daez("daql", dafb(int ), (int)153);
                if (!var6_2) ** GOTO lbl378
                throw null;
            }
            case 27: 
        }
        var5_3 /* !! */  = (int)ax.daez("daqm", dafb(int ), (int)154);
        ** while (!var6_2)
lbl438:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void dbdv() {
        ax.dafc[100] = 1484219105;
        ax.dafc[101] = 1452444847;
        ax.dafc[102] = 983296148;
        ax.dafc[103] = 1598167642;
        ax.dafc[104] = -935113028;
        ax.dafc[105] = 258787780;
        ax.dafc[106] = 1094609079;
        ax.dafc[107] = 388747640;
        ax.dafc[108] = -1703578188;
        ax.dafc[109] = -722576631;
        ax.dafc[110] = 2016120757;
        ax.dafc[111] = -75862139;
        ax.dafc[112] = 1933933627;
        ax.dafc[113] = 1407829818;
        ax.dafc[114] = 253774508;
        ax.dafc[115] = -1019582134;
        ax.dafc[116] = -694873860;
        ax.dafc[117] = -1393358575;
        ax.dafc[118] = 1227232166;
        ax.dafc[119] = -546386945;
        ax.dafc[120] = 1483236558;
        ax.dafc[121] = 2048437634;
        ax.dafc[122] = -848994011;
        ax.dafc[123] = -166148353;
        ax.dafc[124] = -725044071;
        ax.dafc[125] = 937647618;
        ax.dafc[126] = 1833385519;
        ax.dafc[127] = 683450823;
        ax.dafc[128] = -467812661;
        ax.dafc[129] = -1489487326;
        ax.dafc[130] = -407695525;
        ax.dafc[131] = -1641375687;
        ax.dafc[132] = -936943216;
        ax.dafc[133] = 487466110;
        ax.dafc[134] = 1159116121;
        ax.dafc[135] = -1018270607;
        ax.dafc[136] = -759493981;
        ax.dafc[137] = 789443186;
        ax.dafc[138] = -686277105;
        ax.dafc[139] = -2037560390;
        ax.dafc[140] = -230199469;
        ax.dafc[141] = 79020438;
        ax.dafc[142] = 1183506347;
        ax.dafc[143] = -1087589421;
        ax.dafc[144] = -1181058490;
        ax.dafc[145] = -454748656;
        ax.dafc[146] = -1086508503;
        ax.dafc[147] = -798694010;
        ax.dafc[148] = 101517528;
        ax.dafc[149] = 476127384;
        ax.dafc[150] = -221605399;
        ax.dafc[151] = 1473511846;
        ax.dafc[152] = -1229778569;
        ax.dafc[153] = -1917861842;
        ax.dafc[154] = 442668212;
        ax.dafc[155] = -152054226;
        ax.dafc[156] = -1281219874;
        ax.dafc[157] = -95076024;
        ax.dafc[158] = 623147132;
        ax.dafc[159] = 1274805488;
        ax.dafc[160] = 1602484350;
        ax.dafc[161] = -2064849507;
        ax.dafc[162] = -672207613;
        ax.dafc[163] = 599058718;
        ax.dafc[164] = -2118747769;
        ax.dafc[165] = -809700747;
        ax.dafc[166] = 613359924;
        ax.dafc[167] = -1084646172;
        ax.dafc[168] = 663328268;
        ax.dafc[169] = -1245801804;
        ax.dafc[170] = -1617610036;
        ax.dafc[171] = -1916415705;
        ax.dafc[172] = -399748829;
        ax.dafc[173] = -935420244;
        ax.dafc[174] = 0x522D225;
        ax.dafc[175] = 1626815463;
        ax.dafc[176] = -1176148322;
        ax.dafc[177] = 877550718;
        ax.dafc[178] = 872048936;
        ax.dafc[179] = -134605913;
        ax.dafc[180] = -864431975;
        ax.dafc[181] = -2071394717;
        ax.dafc[182] = 494492469;
        ax.dafc[183] = 1225806208;
        ax.dafc[184] = 609008880;
        ax.dafc[185] = -922563486;
        ax.dafc[186] = 1988720185;
        ax.dafc[187] = -2043641462;
        ax.dafc[188] = -1314341387;
        ax.dafc[189] = 17699831;
        ax.dafc[190] = -445603493;
        ax.dafc[191] = 1855863337;
        ax.dafc[192] = -611621224;
        ax.dafc[193] = -259008316;
        ax.dafc[194] = 773138355;
        ax.dafc[195] = 1410312935;
        ax.dafc[196] = 1320770831;
        ax.dafc[197] = -1079928424;
        ax.dafc[198] = 1184447683;
        ax.dafc[199] = -153273254;
    }
}

