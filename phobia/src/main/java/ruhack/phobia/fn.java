/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_7439
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import net.minecraft.class_243;
import net.minecraft.class_7439;
import ruhack.phobia.aw;
import ruhack.phobia.bu;
import ruhack.phobia.cj;
import ruhack.phobia.cq;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.ee;
import ruhack.phobia.jx;
import ruhack.phobia.kf;
import ruhack.phobia.pp;
import ruhack.phobia.ps;

public final class fn
extends ds {
    private final ps timer;
    private int pass;
    public static final int b;
    private final LinkedHashSet<String> successfulReports;
    private static final long on = 440264333424578206L;
    private final LinkedHashSet<String> onlineStaff;
    private int processedCount;
    private int totalItems;
    private static long[] hkdu;
    private static int[] hkdi;
    private long delayMs;
    private final kf mode;
    public static final boolean a;
    private static final Pattern KILLER_SUCCESS;
    private boolean invalidServerReported;
    private static final long NORMAL_DELAY_MS = 1500L;
    private static final List<String> REPORT_REASONS;
    private final List<String> queue;
    private static final Set<String> STAFF_NAMES;
    private static long[] hkdv;
    private static final Pattern PLAYER_NOT_FOUND;
    public static final boolean c;
    private boolean blocked;
    private static int[] hkdh;
    private int currentIndex;
    private static final Pattern REPORT_SUCCESS;
    private static final long RESPONSE_TIMEOUT_MS = 3500L;
    private boolean waitingResponse;
    private static final long TEST_DELAY_MS = 11000L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isSupportedServer() {
        block85: {
            block84: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hlgk", hkdt(int ), (int)255)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == fn.hkdj("hlgl", hkdg(int ), (int)451)) break;
                    v0 /* !! */  = (long)fn.hkdj("hlgm", hkdg(int ), (int)452);
                }
                var4_1 = fn.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hlgn", hkdt(int ), (int)256)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == fn.hkdj("hlgo", hkdg(int ), (int)453)) break;
                    v1 /* !! */  = (long)fn.hkdj("hlgp", hkdg(int ), (int)454);
                }
                var3_2 /* !! */  = fn.b;
                v2 /* !! */  = fn.on;
                if (true) ** GOTO lbl17
                block52: while (true) {
                    v2 /* !! */  = (long)(v3 - fn.hkdj("hlgq", hkdt(int ), (int)257));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -593202026: {
                            v3 = fn.hkdj("hlgr", hkdt(int ), (int)258);
                            continue block52;
                        }
                        case 554421918: {
                            break block52;
                        }
                        case 1113470174: {
                            v3 = fn.hkdj("hlgs", hkdt(int ), (int)259);
                            continue block52;
                        }
                    }
                    break;
                }
                var2_3 = fn.a;
                if (var4_1) {
                    throw null;
lbl29:
                    // 9 sources

                    return (boolean)fn.hkdj("hlgt", hkdg(int ), (int)455);
                }
                if (var2_3 || var2_3) ** GOTO lbl29
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hlgu", hkdt(int ), (int)260)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fn.hkdj("hlgv", hkdg(int ), (int)456)) break;
                    v4 /* !! */  = (long)fn.hkdj("hlgw", hkdg(int ), (int)457);
                }
                v5 /* !! */  = fn.on;
                if (true) ** GOTO lbl41
                block55: while (true) {
                    v5 /* !! */  = (long)(v6 - fn.hkdj("hlgx", hkdt(int ), (int)261));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1645489972: {
                            v6 = fn.hkdj("hlgy", hkdt(int ), (int)262);
                            continue block55;
                        }
                        case 152570817: {
                            v6 = fn.hkdj("hlgz", hkdt(int ), (int)263);
                            continue block55;
                        }
                        case 554421918: {
                            break block55;
                        }
                        case 1407467360: {
                            v6 = fn.hkdj("hlha", hkdt(int ), (int)264);
                            continue block55;
                        }
                    }
                    break;
                }
                if (fn.mc.method_1562() == null) break block84;
                if (var2_3) ** GOTO lbl29
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hlhb", hkdt(int ), (int)265)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fn.hkdj("hlhc", hkdg(int ), (int)458)) break;
                    v7 /* !! */  = (long)fn.hkdj("hlhd", hkdg(int ), (int)459);
                }
                v8 /* !! */  = fn.on;
                if (true) ** GOTO lbl64
                block57: while (true) {
                    v8 /* !! */  = (long)(v9 - fn.hkdj("hlhe", hkdt(int ), (int)266));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -952607517: {
                            v9 = fn.hkdj("hlhf", hkdt(int ), (int)267);
                            continue block57;
                        }
                        case 172991351: {
                            v9 = fn.hkdj("hlhg", hkdt(int ), (int)268);
                            continue block57;
                        }
                        case 554421918: {
                            break block57;
                        }
                        case 709299536: {
                            v9 = fn.hkdj("hlhh", hkdt(int ), (int)269);
                            continue block57;
                        }
                    }
                    break;
                }
                v10 = fn.mc.method_1562();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = fn.on - fn.hkdj("hlhi", hkdt(int ), (int)270)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fn.hkdj("hlhj", hkdg(int ), (int)460)) break;
                    v11 /* !! */  = (long)fn.hkdj("hlhk", hkdg(int ), (int)461);
                }
                if (v10.method_45734() != null) break block85;
                if (var2_3) ** GOTO lbl29
            }
            if (var2_3 || var2_3) ** GOTO lbl29
            return (boolean)fn.hkdj("hlhl", hkdg(int ), (int)462);
        }
        if (var2_3 || var2_3) ** GOTO lbl29
        v12 /* !! */  = fn.on;
        if (true) ** GOTO lbl93
        block59: while (true) {
            v12 /* !! */  = (long)(v13 - fn.hkdj("hlhm", hkdt(int ), (int)271));
lbl93:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case 554421918: {
                    break block59;
                }
                case 864210410: {
                    v13 = fn.hkdj("hlhn", hkdt(int ), (int)272);
                    continue block59;
                }
                case 1013764917: {
                    v13 = fn.hkdj("hlho", hkdt(int ), (int)273);
                    continue block59;
                }
            }
            break;
        }
        v14 /* !! */  = fn.on;
        if (true) ** GOTO lbl106
        block60: while (true) {
            v14 /* !! */  = (long)(fn.hkdj("hlhq", hkdt(int ), (int)275) - fn.hkdj("hlhp", hkdt(int ), (int)274));
lbl106:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 554421918: {
                    break block60;
                }
                case 1796159308: {
                    continue block60;
                }
            }
            break;
        }
        v15 = fn.mc.method_1562();
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = fn.on - fn.hkdj("hlhr", hkdt(int ), (int)276)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == fn.hkdj("hlhs", hkdg(int ), (int)463)) break;
            v16 /* !! */  = (long)fn.hkdj("hlht", hkdg(int ), (int)464);
        }
        v17 = v15.method_45734();
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_6 = fn.on - fn.hkdj("hlhu", hkdt(int ), (int)277)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == fn.hkdj("hlhv", hkdg(int ), (int)465)) break;
            v18 /* !! */  = (long)fn.hkdj("hlhw", hkdg(int ), (int)466);
        }
        var1_4 = v17.field_3761;
        if (var2_3 || var2_3) ** GOTO lbl29
        if (var1_4 == null) ** GOTO lbl160
        if (var2_3) ** GOTO lbl29
        v19 /* !! */  = fn.on;
        if (true) ** GOTO lbl131
        block63: while (true) {
            v19 /* !! */  = (long)(v20 - fn.hkdj("hlhx", hkdt(int ), (int)278));
lbl131:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case -169845482: {
                    v20 = fn.hkdj("hlhy", hkdt(int ), (int)279);
                    continue block63;
                }
                case 554421918: {
                    break block63;
                }
                case 1142952438: {
                    v20 = fn.hkdj("hlhz", hkdt(int ), (int)280);
                    continue block63;
                }
            }
            break;
        }
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_7 = fn.on - fn.hkdj("hlia", hkdt(int ), (int)281)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == fn.hkdj("hlib", hkdg(int ), (int)467)) break;
            v21 /* !! */  = (long)fn.hkdj("hlic", hkdg(int ), (int)468);
        }
        v22 = var1_4.toLowerCase(Locale.ROOT);
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_8 = fn.on - fn.hkdj("hlid", hkdt(int ), (int)282)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == fn.hkdj("hlie", hkdg(int ), (int)469)) break;
            v23 /* !! */  = (long)fn.hkdj("hlif", hkdg(int ), (int)470);
        }
        if (!v22.contains("reallyworld")) ** GOTO lbl160
        if (var2_3) ** GOTO lbl29
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v24 = fn.hkdj("hlig", hkdg(int ), (int)471);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl160:
            // 2 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            v24 = fn.hkdj("hlih", hkdg(int ), (int)472);
lbl163:
            // 2 sources

            return (boolean)v24;
            case 0: {
                do {
                    var3_2 /* !! */  = (int)fn.hkdj("hlii", hkdg(int ), (int)473);
                } while (!var4_1);
                throw null;
            }
            case 1: {
                var3_2 /* !! */  = (int)fn.hkdj("hlij", hkdg(int ), (int)474);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 2: {
                var3_2 /* !! */  = (int)fn.hkdj("hlik", hkdg(int ), (int)475);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 3: {
                var3_2 /* !! */  = (int)fn.hkdj("hlil", hkdg(int ), (int)476);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 4: {
                var3_2 /* !! */  = (int)fn.hkdj("hlim", hkdg(int ), (int)477);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl189:
            // 3 sources

            case 5: {
                var3_2 /* !! */  = (int)fn.hkdj("hlin", hkdg(int ), (int)478);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl221
            }
lbl194:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)fn.hkdj("hlio", hkdg(int ), (int)479);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
            case 7: {
                do {
                    var3_2 /* !! */  = (int)fn.hkdj("hlip", hkdg(int ), (int)480);
                } while (!var4_1);
                throw null;
            }
lbl204:
            // 3 sources

            case 8: {
                var3_2 /* !! */  = (int)fn.hkdj("hliq", hkdg(int ), (int)481);
                if (!var4_1) ** GOTO lbl194
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)fn.hkdj("hlir", hkdg(int ), (int)482);
                if (var4_1) {
                    throw null;
                }
            }
lbl212:
            // 4 sources

            case 10: {
                var3_2 /* !! */  = (int)fn.hkdj("hlis", hkdg(int ), (int)483);
                if (!var4_1) ** GOTO lbl204
                throw null;
            }
lbl216:
            // 2 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fn.hkdj("hlit", hkdg(int ), (int)484);
                    if (!var4_1) ** GOTO lbl189
                    throw null;
                }
            }
lbl221:
            // 4 sources

            case 12: {
                var3_2 /* !! */  = (int)fn.hkdj("hliu", hkdg(int ), (int)485);
                if (!var4_1) ** GOTO lbl189
                throw null;
            }
lbl225:
            // 3 sources

            case 13: {
                var3_2 /* !! */  = (int)fn.hkdj("hliv", hkdg(int ), (int)486);
                if (!var4_1) ** GOTO lbl212
                throw null;
            }
            case 14: {
                var3_2 /* !! */  = (int)fn.hkdj("hliw", hkdg(int ), (int)487);
                if (!var4_1) ** GOTO lbl216
                throw null;
            }
lbl233:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)fn.hkdj("hlix", hkdg(int ), (int)488);
                if (!var4_1) ** GOTO lbl221
                throw null;
            }
            case 16: 
        }
        var3_2 /* !! */  = (int)fn.hkdj("hliy", hkdg(int ), (int)489);
        ** while (!var4_1)
lbl240:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public Set<String> getOnlineStaff() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = on - fn.hkdj("hksy", hkdt(int ), (int)115)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == fn.hkdj("hksz", hkdg(int ), (int)286)) break;
            object = fn.hkdj("hkta", hkdg(int ), (int)287);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = on - fn.hkdj("hktb", hkdt(int ), (int)116)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == fn.hkdj("hktc", hkdg(int ), (int)288)) break;
            object = fn.hkdj("hktd", hkdg(int ), (int)289);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = on - fn.hkdj("hkte", hkdt(int ), (int)117)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == fn.hkdj("hktf", hkdg(int ), (int)290)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = fn.hkdj("hktg", hkdg(int ), (int)291);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object = on;
        boolean bl4 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - fn.hkdj("hkth", hkdt(int ), (int)118);
            }
            switch ((int)object) {
                case 554421918: {
                    break block9;
                }
                case 1230890472: {
                    callSite = fn.hkdj("hkti", hkdt(int ), (int)119);
                    continue block9;
                }
                case 1389990386: {
                    callSite = fn.hkdj("hktj", hkdt(int ), (int)120);
                    continue block9;
                }
                case 2025740237: {
                    callSite = fn.hkdj("hktk", hkdt(int ), (int)121);
                    continue block9;
                }
            }
            break;
        }
        while (true) {
            long l5;
            Object object2;
            if ((object2 = (l5 = on - fn.hkdj("hktl", hkdt(int ), (int)122)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object2 == fn.hkdj("hktm", hkdg(int ), (int)292)) {
                return Set.copyOf(this.onlineStaff);
            }
            object2 = fn.hkdj("hktn", hkdg(int ), (int)293);
        }
    }

    private static /* synthetic */ void hlkq() {
        fn.hkdh[400] = 1711842337;
        fn.hkdh[401] = -1511031488;
        fn.hkdh[402] = -1451540084;
        fn.hkdh[403] = -912002919;
        fn.hkdh[404] = -1805995898;
        fn.hkdh[405] = 2109953881;
        fn.hkdh[406] = -672790869;
        fn.hkdh[407] = -1666955627;
        fn.hkdh[408] = -1968139468;
        fn.hkdh[409] = -1245464301;
        fn.hkdh[410] = -1884562221;
        fn.hkdh[411] = -1078035052;
        fn.hkdh[412] = 952888446;
        fn.hkdh[413] = -2044358495;
        fn.hkdh[414] = 1491533579;
        fn.hkdh[415] = -1581527100;
        fn.hkdh[416] = -539768437;
        fn.hkdh[417] = -71551874;
        fn.hkdh[418] = 574719399;
        fn.hkdh[419] = -714463515;
        fn.hkdh[420] = 886923271;
        fn.hkdh[421] = 1871228799;
        fn.hkdh[422] = 319689778;
        fn.hkdh[423] = 351835547;
        fn.hkdh[424] = 429283770;
        fn.hkdh[425] = -512866042;
        fn.hkdh[426] = -1963681292;
        fn.hkdh[427] = -274512383;
        fn.hkdh[428] = -1620854999;
        fn.hkdh[429] = -1631473251;
        fn.hkdh[430] = -287980811;
        fn.hkdh[431] = 1843787499;
        fn.hkdh[432] = -1048508261;
        fn.hkdh[433] = -2001311575;
        fn.hkdh[434] = 298242493;
        fn.hkdh[435] = 1149491051;
        fn.hkdh[436] = -148784622;
        fn.hkdh[437] = 1727292866;
        fn.hkdh[438] = 706438363;
        fn.hkdh[439] = 336297159;
        fn.hkdh[440] = -1919006243;
        fn.hkdh[441] = 1701908695;
        fn.hkdh[442] = 862762029;
        fn.hkdh[443] = -1268620664;
        fn.hkdh[444] = 51045724;
        fn.hkdh[445] = 50217930;
        fn.hkdh[446] = 1127400919;
        fn.hkdh[447] = 895204188;
        fn.hkdh[448] = -2146190979;
        fn.hkdh[449] = 882340100;
        fn.hkdh[450] = 1939124574;
        fn.hkdh[451] = 505560946;
        fn.hkdh[452] = -979360;
        fn.hkdh[453] = -1830665395;
        fn.hkdh[454] = 761658627;
        fn.hkdh[455] = -1387503872;
        fn.hkdh[456] = 163085469;
        fn.hkdh[457] = -367416947;
        fn.hkdh[458] = -462301346;
        fn.hkdh[459] = -2058743084;
        fn.hkdh[460] = 389895920;
        fn.hkdh[461] = -1875735118;
        fn.hkdh[462] = -259581267;
        fn.hkdh[463] = 1135010272;
        fn.hkdh[464] = 607663244;
        fn.hkdh[465] = 777892354;
        fn.hkdh[466] = 1841489822;
        fn.hkdh[467] = -2096791213;
        fn.hkdh[468] = -763729492;
        fn.hkdh[469] = -584183689;
        fn.hkdh[470] = -1516814337;
        fn.hkdh[471] = -1995898074;
        fn.hkdh[472] = -1435871101;
        fn.hkdh[473] = 274078489;
        fn.hkdh[474] = 1987319328;
        fn.hkdh[475] = 787665696;
        fn.hkdh[476] = 1583717518;
        fn.hkdh[477] = 1027838876;
        fn.hkdh[478] = -1612762011;
        fn.hkdh[479] = 470557112;
        fn.hkdh[480] = -1549804129;
        fn.hkdh[481] = 1512978058;
        fn.hkdh[482] = -17468637;
        fn.hkdh[483] = -156117130;
        fn.hkdh[484] = -2089672758;
        fn.hkdh[485] = 2097600986;
        fn.hkdh[486] = 1292947500;
        fn.hkdh[487] = -742375869;
        fn.hkdh[488] = -1146439176;
        fn.hkdh[489] = -434216016;
        fn.hkdh[490] = -1738556792;
        fn.hkdh[491] = -1942718134;
        fn.hkdh[492] = -1243542592;
        fn.hkdh[493] = -74011217;
        fn.hkdh[494] = 970256135;
        fn.hkdh[495] = 1356489830;
        fn.hkdh[496] = -789693211;
        fn.hkdh[497] = -1947740055;
        fn.hkdh[498] = 1722064604;
        fn.hkdh[499] = 1237253367;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onInput(cj var1_1) {
        block45: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hknv", hkdt(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == fn.hkdj("hknw", hkdg(int ), (int)209)) break;
                v0 /* !! */  = (long)fn.hkdj("hknx", hkdg(int ), (int)210);
            }
            var4_2 = fn.c;
            v1 /* !! */  = fn.on;
            if (true) ** GOTO lbl12
            block30: while (true) {
                v1 /* !! */  = (long)(v2 - fn.hkdj("hkny", hkdt(int ), (int)60));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1901423301: {
                        v2 = fn.hkdj("hknz", hkdt(int ), (int)61);
                        continue block30;
                    }
                    case -1024747069: {
                        v2 = fn.hkdj("hkoa", hkdt(int ), (int)62);
                        continue block30;
                    }
                    case -1005456147: {
                        v2 = fn.hkdj("hkob", hkdt(int ), (int)63);
                        continue block30;
                    }
                    case 554421918: {
                        break block30;
                    }
                }
                break;
            }
            var3_3 /* !! */  = fn.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hkoc", hkdt(int ), (int)64)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == fn.hkdj("hkod", hkdg(int ), (int)211)) break;
                v3 /* !! */  = (long)fn.hkdj("hkoe", hkdg(int ), (int)212);
            }
            var2_4 = fn.a;
            if (var4_2) {
                throw null;
lbl34:
                // 5 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl34
            v4 /* !! */  = fn.on;
            if (true) ** GOTO lbl41
            block33: while (true) {
                v4 /* !! */  = (long)(v5 - fn.hkdj("hkof", hkdt(int ), (int)65));
lbl41:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1874211913: {
                        v5 = fn.hkdj("hkog", hkdt(int ), (int)66);
                        continue block33;
                    }
                    case 554421918: {
                        break block33;
                    }
                    case 710613012: {
                        v5 = fn.hkdj("hkoh", hkdt(int ), (int)67);
                        continue block33;
                    }
                    case 1903400620: {
                        v5 = fn.hkdj("hkoi", hkdt(int ), (int)68);
                        continue block33;
                    }
                }
                break;
            }
            if (!this.blocked) break block45;
            if (var2_4 || var2_4) ** GOTO lbl34
            v6 /* !! */  = fn.on;
            if (true) ** GOTO lbl59
            block34: while (true) {
                v6 /* !! */  = (long)(v7 - fn.hkdj("hkoj", hkdt(int ), (int)69));
lbl59:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1342677123: {
                        v7 = fn.hkdj("hkok", hkdt(int ), (int)70);
                        continue block34;
                    }
                    case -318781060: {
                        v7 = fn.hkdj("hkol", hkdt(int ), (int)71);
                        continue block34;
                    }
                    case 554421918: {
                        break block34;
                    }
                    case 1727308911: {
                        v7 = fn.hkdj("hkom", hkdt(int ), (int)72);
                        continue block34;
                    }
                }
                break;
            }
            var1_1.inputNone();
            if (var2_4) ** GOTO lbl34
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block18 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl81:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)fn.hkdj("hkon", hkdg(int ), (int)213);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 1: {
                var3_3 /* !! */  = (int)fn.hkdj("hkoo", hkdg(int ), (int)214);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)fn.hkdj("hkop", hkdg(int ), (int)215);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)fn.hkdj("hkoq", hkdg(int ), (int)216);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl99:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)fn.hkdj("hkor", hkdg(int ), (int)217);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)fn.hkdj("hkos", hkdg(int ), (int)218);
                if (var4_2) {
                    throw null;
                }
            }
lbl107:
            // 4 sources

            case 6: {
                var3_3 /* !! */  = (int)fn.hkdj("hkot", hkdg(int ), (int)219);
                if (!var4_2) ** GOTO lbl99
                throw null;
            }
lbl111:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fn.hkdj("hkou", hkdg(int ), (int)220);
                    if (!var4_2) break block18;
                    throw null;
                }
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)fn.hkdj("hkov", hkdg(int ), (int)221);
        ** while (!var4_2)
lbl119:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hllh() {
        fn.hkdi[100] = 1759605811;
        fn.hkdi[101] = 1296684639;
        fn.hkdi[102] = 226051355;
        fn.hkdi[103] = 1289267798;
        fn.hkdi[104] = -1867813174;
        fn.hkdi[105] = -351531974;
        fn.hkdi[106] = 2091875522;
        fn.hkdi[107] = 2006319824;
        fn.hkdi[108] = -2025103994;
        fn.hkdi[109] = 283898149;
        fn.hkdi[110] = -1631503707;
        fn.hkdi[111] = -1461690687;
        fn.hkdi[112] = 995714382;
        fn.hkdi[113] = -1306251800;
        fn.hkdi[114] = -962710853;
        fn.hkdi[115] = -1235202676;
        fn.hkdi[116] = -1882093320;
        fn.hkdi[117] = 504303825;
        fn.hkdi[118] = 1959748556;
        fn.hkdi[119] = -1983353768;
        fn.hkdi[120] = -550268198;
        fn.hkdi[121] = 755497395;
        fn.hkdi[122] = 103656740;
        fn.hkdi[123] = -1459430486;
        fn.hkdi[124] = 2042594208;
        fn.hkdi[125] = 1328087601;
        fn.hkdi[126] = 1988070275;
        fn.hkdi[127] = -1811027121;
        fn.hkdi[128] = 218733151;
        fn.hkdi[129] = 1879336508;
        fn.hkdi[130] = -1140772521;
        fn.hkdi[131] = 1805459582;
        fn.hkdi[132] = 591284714;
        fn.hkdi[133] = 913141977;
        fn.hkdi[134] = -1319539156;
        fn.hkdi[135] = -1925055938;
        fn.hkdi[136] = 85962596;
        fn.hkdi[137] = -1638076121;
        fn.hkdi[138] = 884021603;
        fn.hkdi[139] = 1345460229;
        fn.hkdi[140] = -129278442;
        fn.hkdi[141] = -247891040;
        fn.hkdi[142] = -339086303;
        fn.hkdi[143] = -151607647;
        fn.hkdi[144] = -588213118;
        fn.hkdi[145] = -427033697;
        fn.hkdi[146] = 156055178;
        fn.hkdi[147] = -2002045093;
        fn.hkdi[148] = -1341378888;
        fn.hkdi[149] = 816666913;
        fn.hkdi[150] = -27706321;
        fn.hkdi[151] = 1177576793;
        fn.hkdi[152] = 583068135;
        fn.hkdi[153] = -561891633;
        fn.hkdi[154] = 1742275524;
        fn.hkdi[155] = 655945028;
        fn.hkdi[156] = -776483530;
        fn.hkdi[157] = 153488443;
        fn.hkdi[158] = -391678442;
        fn.hkdi[159] = 1834883882;
        fn.hkdi[160] = 1239272404;
        fn.hkdi[161] = -88661910;
        fn.hkdi[162] = 1529587771;
        fn.hkdi[163] = 1213379236;
        fn.hkdi[164] = -544148403;
        fn.hkdi[165] = -561436526;
        fn.hkdi[166] = -1506112246;
        fn.hkdi[167] = 1830401339;
        fn.hkdi[168] = -341786337;
        fn.hkdi[169] = -1558409437;
        fn.hkdi[170] = 0xCDDC9CD;
        fn.hkdi[171] = -547837177;
        fn.hkdi[172] = -1683333491;
        fn.hkdi[173] = -812341493;
        fn.hkdi[174] = 2120655413;
        fn.hkdi[175] = 640897433;
        fn.hkdi[176] = -1835861582;
        fn.hkdi[177] = -112767178;
        fn.hkdi[178] = -416338034;
        fn.hkdi[179] = 1108923674;
        fn.hkdi[180] = -680563496;
        fn.hkdi[181] = 1453640276;
        fn.hkdi[182] = -371501261;
        fn.hkdi[183] = -1245120589;
        fn.hkdi[184] = 1447681290;
        fn.hkdi[185] = -1151414562;
        fn.hkdi[186] = -1878117309;
        fn.hkdi[187] = 1249495855;
        fn.hkdi[188] = -1540678425;
        fn.hkdi[189] = 1923224409;
        fn.hkdi[190] = 799008916;
        fn.hkdi[191] = 980213983;
        fn.hkdi[192] = 131524792;
        fn.hkdi[193] = -811214116;
        fn.hkdi[194] = -240449305;
        fn.hkdi[195] = -1731390530;
        fn.hkdi[196] = -2012786747;
        fn.hkdi[197] = -1895217712;
        fn.hkdi[198] = -1970792355;
        fn.hkdi[199] = -6532908;
    }

    public static /* synthetic */ CallSite hkdj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hkdw", hkdt(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fn.hkdj("hkdx", hkdg(int ), (int)9)) break;
            v0 /* !! */  = (long)fn.hkdj("hkdy", hkdg(int ), (int)10);
        }
        var3_1 = fn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hkdz", hkdt(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fn.hkdj("hkea", hkdg(int ), (int)11)) break;
            v1 /* !! */  = (long)fn.hkdj("hkeb", hkdg(int ), (int)12);
        }
        var2_2 /* !! */  = fn.b;
        v2 /* !! */  = fn.on;
        if (true) ** GOTO lbl17
        block78: while (true) {
            v2 /* !! */  = (long)(v3 - fn.hkdj("hkec", hkdt(int ), (int)2));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1617066429: {
                    v3 = fn.hkdj("hked", hkdt(int ), (int)3);
                    continue block78;
                }
                case -1367145426: {
                    v3 = fn.hkdj("hkee", hkdt(int ), (int)4);
                    continue block78;
                }
                case -518750541: {
                    v3 = fn.hkdj("hkef", hkdt(int ), (int)5);
                    continue block78;
                }
                case 554421918: {
                    break block78;
                }
            }
            break;
        }
        var1_3 = fn.a;
        if (var3_1) {
            throw null;
lbl32:
            // 12 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 /* !! */  = fn.on;
        if (true) ** GOTO lbl39
        block80: while (true) {
            v4 /* !! */  = (long)(v5 - fn.hkdj("hkeg", hkdt(int ), (int)6));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1937078920: {
                    v5 = fn.hkdj("hkeh", hkdt(int ), (int)7);
                    continue block80;
                }
                case -1200506632: {
                    v5 = fn.hkdj("hkei", hkdt(int ), (int)8);
                    continue block80;
                }
                case -842768050: {
                    v5 = fn.hkdj("hkej", hkdt(int ), (int)9);
                    continue block80;
                }
                case 554421918: {
                    break block80;
                }
            }
            break;
        }
        v6 /* !! */  = fn.on;
        if (true) ** GOTO lbl55
        block81: while (true) {
            v6 /* !! */  = (long)(v7 - fn.hkdj("hkek", hkdt(int ), (int)10));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1039735196: {
                    v7 = fn.hkdj("hkel", hkdt(int ), (int)11);
                    continue block81;
                }
                case -864076971: {
                    v7 = fn.hkdj("hkem", hkdt(int ), (int)12);
                    continue block81;
                }
                case 554421918: {
                    break block81;
                }
                case 751335434: {
                    v7 = fn.hkdj("hken", hkdt(int ), (int)13);
                    continue block81;
                }
            }
            break;
        }
        this.onlineStaff.clear();
        if (var1_3 || var1_3) ** GOTO lbl32
        v8 /* !! */  = fn.on;
        if (true) ** GOTO lbl73
        block82: while (true) {
            v8 /* !! */  = (long)(fn.hkdj("hkep", hkdt(int ), (int)15) - fn.hkdj("hkeo", hkdt(int ), (int)14));
lbl73:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1036602284: {
                    continue block82;
                }
                case 554421918: {
                    break block82;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hkeq", hkdt(int ), (int)16)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == fn.hkdj("hker", hkdg(int ), (int)13)) break;
            v9 /* !! */  = (long)fn.hkdj("hkes", hkdg(int ), (int)14);
        }
        this.successfulReports.clear();
        if (var1_3 || var1_3) ** GOTO lbl32
        v10 = fn.hkdj("hket", hkdg(int ), (int)15);
        v11 /* !! */  = fn.on;
        if (true) ** GOTO lbl90
        block84: while (true) {
            v11 /* !! */  = (long)(v12 - fn.hkdj("hkeu", hkdt(int ), (int)17));
lbl90:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1005703262: {
                    v12 = fn.hkdj("hkev", hkdt(int ), (int)18);
                    continue block84;
                }
                case 554421918: {
                    break block84;
                }
                case 655283693: {
                    v12 = fn.hkdj("hkew", hkdt(int ), (int)19);
                    continue block84;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hkex", hkdt(int ), (int)20)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == fn.hkdj("hkey", hkdg(int ), (int)16)) break;
            v13 /* !! */  = (long)fn.hkdj("hkez", hkdg(int ), (int)17);
        }
        this.startPass((int)v10, fn.STAFF_NAMES);
        if (var1_3 || var1_3) ** GOTO lbl32
        v14 = fn.hkdj("hkfa", hkdg(int ), (int)18);
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_4 = fn.on - fn.hkdj("hkfb", hkdt(int ), (int)21)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == fn.hkdj("hkfc", hkdg(int ), (int)19)) break;
            v15 /* !! */  = (long)fn.hkdj("hkfd", hkdg(int ), (int)20);
        }
        this.processedCount = (int)v14;
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = fn.on - fn.hkdj("hkfe", hkdt(int ), (int)22)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == fn.hkdj("hkff", hkdg(int ), (int)21)) break;
            v16 /* !! */  = (long)fn.hkdj("hkfg", hkdg(int ), (int)22);
        }
        v17 /* !! */  = fn.on;
        if (true) ** GOTO lbl123
        block88: while (true) {
            v17 /* !! */  = (long)(fn.hkdj("hkfi", hkdt(int ), (int)24) - fn.hkdj("hkfh", hkdt(int ), (int)23));
lbl123:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1412813504: {
                    continue block88;
                }
                case 554421918: {
                    break block88;
                }
            }
            break;
        }
        v18 = fn.STAFF_NAMES.size();
        v19 /* !! */  = fn.on;
        if (true) ** GOTO lbl133
        block89: while (true) {
            v19 /* !! */  = (long)(v20 - fn.hkdj("hkfj", hkdt(int ), (int)25));
lbl133:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case 378310085: {
                    v20 = fn.hkdj("hkfk", hkdt(int ), (int)26);
                    continue block89;
                }
                case 554421918: {
                    break block89;
                }
                case 1828579788: {
                    v20 = fn.hkdj("hkfl", hkdt(int ), (int)27);
                    continue block89;
                }
            }
            break;
        }
        this.totalItems = v18;
        if (var1_3 || var1_3) ** GOTO lbl32
        v21 = fn.hkdj("hkfm", hkdt(int ), (int)28);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_6 = fn.on - fn.hkdj("hkfn", hkdt(int ), (int)29)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == fn.hkdj("hkfo", hkdg(int ), (int)23)) break;
            v22 /* !! */  = (long)fn.hkdj("hkfp", hkdg(int ), (int)24);
        }
        this.delayMs = (long)v21;
        if (var1_3 || var1_3) ** GOTO lbl32
        v23 = fn.hkdj("hkfq", hkdg(int ), (int)25);
        v24 /* !! */  = fn.on;
        if (true) ** GOTO lbl157
        block91: while (true) {
            v24 /* !! */  = (long)(fn.hkdj("hkfs", hkdt(int ), (int)31) - fn.hkdj("hkfr", hkdt(int ), (int)30));
lbl157:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case 128316409: {
                    continue block91;
                }
                case 554421918: {
                    break block91;
                }
            }
            break;
        }
        this.waitingResponse = v23;
        if (var1_3 || var1_3) ** GOTO lbl32
        v25 = fn.hkdj("hkft", hkdg(int ), (int)26);
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_7 = fn.on - fn.hkdj("hkfu", hkdt(int ), (int)32)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == fn.hkdj("hkfv", hkdg(int ), (int)27)) break;
            v26 /* !! */  = (long)fn.hkdj("hkfw", hkdg(int ), (int)28);
        }
        this.blocked = v25;
        if (var1_3 || var1_3) ** GOTO lbl32
        v27 = fn.hkdj("hkfx", hkdg(int ), (int)29);
        while (true) {
            if ((v28 /* !! */  = (cfr_temp_8 = fn.on - fn.hkdj("hkfy", hkdt(int ), (int)33)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v28 /* !! */  == fn.hkdj("hkfz", hkdg(int ), (int)30)) break;
            v28 /* !! */  = (long)fn.hkdj("hkga", hkdg(int ), (int)31);
        }
        this.invalidServerReported = v27;
        if (var1_3 || var1_3) ** GOTO lbl32
        v29 /* !! */  = fn.on;
        if (true) ** GOTO lbl184
        block94: while (true) {
            v29 /* !! */  = (long)(v30 - fn.hkdj("hkgb", hkdt(int ), (int)34));
lbl184:
            // 2 sources

            switch ((int)v29 /* !! */ ) {
                case -99171778: {
                    v30 = fn.hkdj("hkgc", hkdt(int ), (int)35);
                    continue block94;
                }
                case 554421918: {
                    break block94;
                }
                case 882834139: {
                    v30 = fn.hkdj("hkgd", hkdt(int ), (int)36);
                    continue block94;
                }
                case 1042736735: {
                    v30 = fn.hkdj("hkge", hkdt(int ), (int)37);
                    continue block94;
                }
            }
            break;
        }
        v31 /* !! */  = fn.on;
        if (true) ** GOTO lbl200
        block95: while (true) {
            v31 /* !! */  = (long)(fn.hkdj("hkgg", hkdt(int ), (int)39) - fn.hkdj("hkgf", hkdt(int ), (int)38));
lbl200:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case 554421918: {
                    break block95;
                }
                case 2029670790: {
                    continue block95;
                }
            }
            break;
        }
        this.timer.reset();
        if (var1_3) ** GOTO lbl32
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
                var2_2 /* !! */  = (int)fn.hkdj("hkgh", hkdg(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 1: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgi", hkdg(int ), (int)33);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
lbl223:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgj", hkdg(int ), (int)34);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl228:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgk", hkdg(int ), (int)35);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 4: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgl", hkdg(int ), (int)36);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl254
            }
lbl238:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgm", hkdg(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl243:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgn", hkdg(int ), (int)38);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl267
            }
lbl248:
            // 4 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fn.hkdj("hkgo", hkdg(int ), (int)39);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl267
                    break;
                }
            }
lbl254:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgp", hkdg(int ), (int)40);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl271
            }
            case 9: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgq", hkdg(int ), (int)41);
                if (!var3_1) ** GOTO lbl243
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgr", hkdg(int ), (int)42);
                if (!var3_1) ** GOTO lbl248
                throw null;
            }
lbl267:
            // 4 sources

            case 11: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgs", hkdg(int ), (int)43);
                if (!var3_1) ** GOTO lbl248
                throw null;
            }
lbl271:
            // 4 sources

            case 12: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgt", hkdg(int ), (int)44);
                if (!var3_1) break;
                throw null;
            }
lbl275:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgu", hkdg(int ), (int)45);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl293
            }
            case 14: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgv", hkdg(int ), (int)46);
                if (!var3_1) ** GOTO lbl248
                throw null;
            }
            case 15: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgw", hkdg(int ), (int)47);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl305
            }
            case 16: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgx", hkdg(int ), (int)48);
                if (!var3_1) ** GOTO lbl238
                throw null;
            }
lbl293:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgy", hkdg(int ), (int)49);
                if (!var3_1) ** GOTO lbl223
                throw null;
            }
lbl297:
            // 2 sources

            case 18: {
                var2_2 /* !! */  = (int)fn.hkdj("hkgz", hkdg(int ), (int)50);
                if (!var3_1) ** GOTO lbl254
                throw null;
            }
lbl301:
            // 2 sources

            case 19: {
                var2_2 /* !! */  = (int)fn.hkdj("hkha", hkdg(int ), (int)51);
                if (!var3_1) ** GOTO lbl228
                throw null;
            }
lbl305:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)fn.hkdj("hkhb", hkdg(int ), (int)52);
                if (!var3_1) ** GOTO lbl271
                throw null;
            }
lbl309:
            // 3 sources

            case 21: {
                var2_2 /* !! */  = (int)fn.hkdj("hkhc", hkdg(int ), (int)53);
                if (!var3_1) ** GOTO lbl301
                throw null;
            }
            case 22: {
                var2_2 /* !! */  = (int)fn.hkdj("hkhd", hkdg(int ), (int)54);
                if (!var3_1) ** GOTO lbl267
                throw null;
            }
            case 23: 
        }
        var2_2 /* !! */  = (int)fn.hkdj("hkhe", hkdg(int ), (int)55);
        ** while (!var3_1)
lbl320:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = fn.on;
        if (true) ** GOTO lbl5
        block37: while (true) {
            v0 /* !! */  = (long)(v1 - fn.hkdj("hkhf", hkdt(int ), (int)40));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1333662638: {
                    v1 = fn.hkdj("hkhg", hkdt(int ), (int)41);
                    continue block37;
                }
                case 39336909: {
                    v1 = fn.hkdj("hkhh", hkdt(int ), (int)42);
                    continue block37;
                }
                case 554421918: {
                    break block37;
                }
            }
            break;
        }
        var3_1 = fn.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hkhi", hkdt(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fn.hkdj("hkhj", hkdg(int ), (int)56)) break;
            v2 /* !! */  = (long)fn.hkdj("hkhk", hkdg(int ), (int)57);
        }
        var2_2 /* !! */  = fn.b;
        v3 /* !! */  = fn.on;
        if (true) ** GOTO lbl25
        block39: while (true) {
            v3 /* !! */  = (long)(v4 - fn.hkdj("hkhl", hkdt(int ), (int)44));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 0xEB7E7E: {
                    v4 = fn.hkdj("hkhm", hkdt(int ), (int)45);
                    continue block39;
                }
                case 554421918: {
                    break block39;
                }
                case 1542788548: {
                    v4 = fn.hkdj("hkhn", hkdt(int ), (int)46);
                    continue block39;
                }
            }
            break;
        }
        var1_3 = fn.a;
        if (var3_1) {
            throw null;
lbl37:
            // 5 sources

            return;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl37
                v5 /* !! */  = fn.on;
                if (true) ** GOTO lbl48
                block41: while (true) {
                    v5 /* !! */  = (long)(v6 - fn.hkdj("hkho", hkdt(int ), (int)47));
lbl48:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -910014066: {
                            v6 = fn.hkdj("hkhp", hkdt(int ), (int)48);
                            continue block41;
                        }
                        case 374480895: {
                            v6 = fn.hkdj("hkhq", hkdt(int ), (int)49);
                            continue block41;
                        }
                        case 554421918: {
                            break block41;
                        }
                        case 1680155480: {
                            v6 = fn.hkdj("hkhr", hkdt(int ), (int)50);
                            continue block41;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hkhs", hkdt(int ), (int)51)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fn.hkdj("hkht", hkdg(int ), (int)58)) break;
                    v7 /* !! */  = (long)fn.hkdj("hkhu", hkdg(int ), (int)59);
                }
                this.queue.clear();
                if (var1_3 || var1_3) ** GOTO lbl37
                v8 = fn.hkdj("hkhv", hkdg(int ), (int)60);
                v9 /* !! */  = fn.on;
                if (true) ** GOTO lbl72
                block43: while (true) {
                    v9 /* !! */  = (long)(v10 - fn.hkdj("hkhw", hkdt(int ), (int)52));
lbl72:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -766845115: {
                            v10 = fn.hkdj("hkhx", hkdt(int ), (int)53);
                            continue block43;
                        }
                        case -611434400: {
                            v10 = fn.hkdj("hkhy", hkdt(int ), (int)54);
                            continue block43;
                        }
                        case 554421918: {
                            break block43;
                        }
                    }
                    break;
                }
                this.waitingResponse = v8;
                if (var1_3 || var1_3) ** GOTO lbl37
                v11 = fn.hkdj("hkhz", hkdg(int ), (int)61);
                v12 /* !! */  = fn.on;
                if (true) ** GOTO lbl88
                block44: while (true) {
                    v12 /* !! */  = (long)(fn.hkdj("hkib", hkdt(int ), (int)56) - fn.hkdj("hkia", hkdt(int ), (int)55));
lbl88:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 30124436: {
                            continue block44;
                        }
                        case 554421918: {
                            break block44;
                        }
                    }
                    break;
                }
                this.blocked = v11;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fn.hkdj("hkic", hkdg(int ), (int)62);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl122
                    break;
                }
            }
lbl103:
            // 3 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)fn.hkdj("hkid", hkdg(int ), (int)63);
                } while (!var3_1);
                throw null;
            }
lbl108:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)fn.hkdj("hkie", hkdg(int ), (int)64);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 3: {
                var2_2 /* !! */  = (int)fn.hkdj("hkif", hkdg(int ), (int)65);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)fn.hkdj("hkig", hkdg(int ), (int)66);
                } while (!var3_1);
                throw null;
            }
lbl122:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)fn.hkdj("hkih", hkdg(int ), (int)67);
                if (!var3_1) ** GOTO lbl108
                throw null;
            }
lbl126:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)fn.hkdj("hkii", hkdg(int ), (int)68);
                if (!var3_1) break;
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)fn.hkdj("hkij", hkdg(int ), (int)69);
                if (!var3_1) ** GOTO lbl126
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fn.hkdj("hkik", hkdg(int ), (int)70);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)fn.hkdj("hkil", hkdg(int ), (int)71);
        ** while (!var3_1)
lbl141:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hlnv() {
        fn.hkdv[100] = 2199303683023116645L;
        fn.hkdv[101] = 7800884738300765714L;
        fn.hkdv[102] = 6834933379647794719L;
        fn.hkdv[103] = 5936657951029800279L;
        fn.hkdv[104] = 7768772473363630248L;
        fn.hkdv[105] = -7082434615776384593L;
        fn.hkdv[106] = -6838622859426503374L;
        fn.hkdv[107] = -967131897959026147L;
        fn.hkdv[108] = 4109732371958967148L;
        fn.hkdv[109] = 2850377805882279100L;
        fn.hkdv[110] = -6802937048947626601L;
        fn.hkdv[111] = 5198189698725549321L;
        fn.hkdv[112] = -89608026789609728L;
        fn.hkdv[113] = -1674009557850907656L;
        fn.hkdv[114] = 8297499466958359864L;
        fn.hkdv[115] = -3980073368947453581L;
        fn.hkdv[116] = 7787618135353145892L;
        fn.hkdv[117] = 3384856450582638202L;
        fn.hkdv[118] = 7754139838585098285L;
        fn.hkdv[119] = 8573599956234837759L;
        fn.hkdv[120] = -2114234605353873059L;
        fn.hkdv[121] = -404115316512341714L;
        fn.hkdv[122] = -7447506182802199373L;
        fn.hkdv[123] = 2064487298259767231L;
        fn.hkdv[124] = 8740174910119079999L;
        fn.hkdv[125] = -4228460378866310017L;
        fn.hkdv[126] = 2034365528952122040L;
        fn.hkdv[127] = 4787605846431449542L;
        fn.hkdv[128] = -8361294584395205410L;
        fn.hkdv[129] = -8152456198421681913L;
        fn.hkdv[130] = -71925367107017239L;
        fn.hkdv[131] = 3645427645680630409L;
        fn.hkdv[132] = -2872545476588273570L;
        fn.hkdv[133] = -2592707650364456093L;
        fn.hkdv[134] = -6503229651142745712L;
        fn.hkdv[135] = -7797826365917619349L;
        fn.hkdv[136] = 5553715346729391337L;
        fn.hkdv[137] = 4812991290648639999L;
        fn.hkdv[138] = 888891990359656978L;
        fn.hkdv[139] = 7398328824004031512L;
        fn.hkdv[140] = -8197864716152854537L;
        fn.hkdv[141] = -6775315150019748520L;
        fn.hkdv[142] = 6472579280019585876L;
        fn.hkdv[143] = -8855297495042608911L;
        fn.hkdv[144] = -230254388036501350L;
        fn.hkdv[145] = 8024522933139759462L;
        fn.hkdv[146] = 7134854863391669028L;
        fn.hkdv[147] = -5469482069094604113L;
        fn.hkdv[148] = -1508305934037720582L;
        fn.hkdv[149] = -2560474594157966759L;
        fn.hkdv[150] = 6911579341479022062L;
        fn.hkdv[151] = -4172140926183541971L;
        fn.hkdv[152] = -7365984709214024941L;
        fn.hkdv[153] = 2468521618949315056L;
        fn.hkdv[154] = -3730471375798465739L;
        fn.hkdv[155] = 3555484947961932844L;
        fn.hkdv[156] = -5741571948137384194L;
        fn.hkdv[157] = -1745244631760872905L;
        fn.hkdv[158] = -603898522145341352L;
        fn.hkdv[159] = -4536844228994397797L;
        fn.hkdv[160] = -4466419019509569976L;
        fn.hkdv[161] = -763722464413915326L;
        fn.hkdv[162] = -8599968780429236630L;
        fn.hkdv[163] = -826527819491125120L;
        fn.hkdv[164] = 2099010277071010489L;
        fn.hkdv[165] = -6890854969604126227L;
        fn.hkdv[166] = 8597986486791027488L;
        fn.hkdv[167] = 6174241747435704215L;
        fn.hkdv[168] = 8874479815364321600L;
        fn.hkdv[169] = -8800061860106833817L;
        fn.hkdv[170] = -4338563389814337550L;
        fn.hkdv[171] = -6246585883145484727L;
        fn.hkdv[172] = -5408402002745430530L;
        fn.hkdv[173] = -540171762803744138L;
        fn.hkdv[174] = 8273782205610652481L;
        fn.hkdv[175] = 8847021189472703321L;
        fn.hkdv[176] = 3173499752063345065L;
        fn.hkdv[177] = -8587211401914766716L;
        fn.hkdv[178] = 5861511405757697079L;
        fn.hkdv[179] = 8021418607329344893L;
        fn.hkdv[180] = 2538585510373893884L;
        fn.hkdv[181] = 7347165646130070453L;
        fn.hkdv[182] = 1444818488287693780L;
        fn.hkdv[183] = -1252914821415088720L;
        fn.hkdv[184] = -2375649226775640858L;
        fn.hkdv[185] = 8126682715755653282L;
        fn.hkdv[186] = -8705729798882418207L;
        fn.hkdv[187] = 1708518247107757946L;
        fn.hkdv[188] = -5705756955422849634L;
        fn.hkdv[189] = 5514848297307030744L;
        fn.hkdv[190] = -2942742319585748690L;
        fn.hkdv[191] = -337291828388770138L;
        fn.hkdv[192] = 2254681670128835803L;
        fn.hkdv[193] = -5865668307661486668L;
        fn.hkdv[194] = -2792071342764235382L;
        fn.hkdv[195] = 5045589383569699363L;
        fn.hkdv[196] = -8521912755958065656L;
        fn.hkdv[197] = 457711011978559056L;
        fn.hkdv[198] = -1642814496567951900L;
        fn.hkdv[199] = -4728472317025722153L;
    }

    private static /* synthetic */ void hlki() {
        fn.hkdh[300] = -84371641;
        fn.hkdh[301] = 787129542;
        fn.hkdh[302] = -1630096345;
        fn.hkdh[303] = 794137710;
        fn.hkdh[304] = 2039931424;
        fn.hkdh[305] = 619885479;
        fn.hkdh[306] = -2118145742;
        fn.hkdh[307] = 646817701;
        fn.hkdh[308] = 816221680;
        fn.hkdh[309] = -1557519804;
        fn.hkdh[310] = 821594760;
        fn.hkdh[311] = -820529912;
        fn.hkdh[312] = 1765137772;
        fn.hkdh[313] = -1733403579;
        fn.hkdh[314] = -1356452873;
        fn.hkdh[315] = 537807000;
        fn.hkdh[316] = -1106072026;
        fn.hkdh[317] = 2077388268;
        fn.hkdh[318] = -237599711;
        fn.hkdh[319] = -135704388;
        fn.hkdh[320] = -2096967098;
        fn.hkdh[321] = 809891353;
        fn.hkdh[322] = 871712863;
        fn.hkdh[323] = 563599750;
        fn.hkdh[324] = 239430195;
        fn.hkdh[325] = -1076945207;
        fn.hkdh[326] = -487275812;
        fn.hkdh[327] = -407279693;
        fn.hkdh[328] = -824124080;
        fn.hkdh[329] = -1648680464;
        fn.hkdh[330] = 2098390567;
        fn.hkdh[331] = 201953869;
        fn.hkdh[332] = -146918491;
        fn.hkdh[333] = -143084796;
        fn.hkdh[334] = -1181610160;
        fn.hkdh[335] = -404808200;
        fn.hkdh[336] = -2063860682;
        fn.hkdh[337] = 1846825718;
        fn.hkdh[338] = 516931310;
        fn.hkdh[339] = -1752978032;
        fn.hkdh[340] = -1938561012;
        fn.hkdh[341] = -820607059;
        fn.hkdh[342] = 2009912689;
        fn.hkdh[343] = -1988698020;
        fn.hkdh[344] = -1247746379;
        fn.hkdh[345] = 1504926995;
        fn.hkdh[346] = -1113729843;
        fn.hkdh[347] = 1185001679;
        fn.hkdh[348] = -1106632182;
        fn.hkdh[349] = 1544275553;
        fn.hkdh[350] = -1092927678;
        fn.hkdh[351] = 620438466;
        fn.hkdh[352] = 999247460;
        fn.hkdh[353] = 1760014561;
        fn.hkdh[354] = 581080771;
        fn.hkdh[355] = -203198629;
        fn.hkdh[356] = 2142602032;
        fn.hkdh[357] = -139523806;
        fn.hkdh[358] = -1428300835;
        fn.hkdh[359] = 1825736129;
        fn.hkdh[360] = -1556360352;
        fn.hkdh[361] = 1227162447;
        fn.hkdh[362] = 1067057928;
        fn.hkdh[363] = -1731240723;
        fn.hkdh[364] = -1942367257;
        fn.hkdh[365] = -3400702;
        fn.hkdh[366] = -681109481;
        fn.hkdh[367] = 890073075;
        fn.hkdh[368] = -1051923523;
        fn.hkdh[369] = 1131781700;
        fn.hkdh[370] = 1289439378;
        fn.hkdh[371] = 2108965112;
        fn.hkdh[372] = 1649928540;
        fn.hkdh[373] = 1693359868;
        fn.hkdh[374] = -897631026;
        fn.hkdh[375] = 1103918720;
        fn.hkdh[376] = -752679641;
        fn.hkdh[377] = 2119749809;
        fn.hkdh[378] = 1252012613;
        fn.hkdh[379] = -635585302;
        fn.hkdh[380] = -1127531788;
        fn.hkdh[381] = 1154183994;
        fn.hkdh[382] = 390244578;
        fn.hkdh[383] = 2064677402;
        fn.hkdh[384] = -177043923;
        fn.hkdh[385] = 35062227;
        fn.hkdh[386] = 1512263576;
        fn.hkdh[387] = -317569337;
        fn.hkdh[388] = 233165307;
        fn.hkdh[389] = 330838935;
        fn.hkdh[390] = 1856937327;
        fn.hkdh[391] = -1012527510;
        fn.hkdh[392] = -1188715566;
        fn.hkdh[393] = -1972354407;
        fn.hkdh[394] = -816504136;
        fn.hkdh[395] = -1483345688;
        fn.hkdh[396] = 320139809;
        fn.hkdh[397] = 2061365473;
        fn.hkdh[398] = 695322769;
        fn.hkdh[399] = -1298136765;
    }

    private static /* synthetic */ void hlkc() {
        fn.hkdh[100] = 1759605875;
        fn.hkdh[101] = 1296684671;
        fn.hkdh[102] = 226051359;
        fn.hkdh[103] = 1289267778;
        fn.hkdh[104] = -1867813183;
        fn.hkdh[105] = -351532031;
        fn.hkdh[106] = 2091875457;
        fn.hkdh[107] = 2006319849;
        fn.hkdh[108] = -2025103968;
        fn.hkdh[109] = 283898160;
        fn.hkdh[110] = -1631503711;
        fn.hkdh[111] = -1461690653;
        fn.hkdh[112] = 995714390;
        fn.hkdh[113] = -1306251830;
        fn.hkdh[114] = -962710900;
        fn.hkdh[115] = -1235202611;
        fn.hkdh[116] = -1882093355;
        fn.hkdh[117] = 504303808;
        fn.hkdh[118] = 1959748607;
        fn.hkdh[119] = -1983353771;
        fn.hkdh[120] = -550268208;
        fn.hkdh[121] = 755497399;
        fn.hkdh[122] = 103656718;
        fn.hkdh[123] = -1459430527;
        fn.hkdh[124] = 2042594181;
        fn.hkdh[125] = 1328087589;
        fn.hkdh[126] = 1988070334;
        fn.hkdh[127] = -1811027076;
        fn.hkdh[128] = 218733085;
        fn.hkdh[129] = 1879336501;
        fn.hkdh[130] = -1140772482;
        fn.hkdh[131] = 1805459533;
        fn.hkdh[132] = 591284697;
        fn.hkdh[133] = 913142004;
        fn.hkdh[134] = -1319539180;
        fn.hkdh[135] = -1925056000;
        fn.hkdh[136] = 85962614;
        fn.hkdh[137] = -1638076111;
        fn.hkdh[138] = 884021580;
        fn.hkdh[139] = 1345460269;
        fn.hkdh[140] = -129278430;
        fn.hkdh[141] = -247890976;
        fn.hkdh[142] = -339086280;
        fn.hkdh[143] = -151607643;
        fn.hkdh[144] = -588213062;
        fn.hkdh[145] = -427033698;
        fn.hkdh[146] = 156055176;
        fn.hkdh[147] = -2002045060;
        fn.hkdh[148] = -1341378906;
        fn.hkdh[149] = 816666884;
        fn.hkdh[150] = -27706361;
        fn.hkdh[151] = 1177576776;
        fn.hkdh[152] = 583068130;
        fn.hkdh[153] = -561891635;
        fn.hkdh[154] = 1742275549;
        fn.hkdh[155] = 655945048;
        fn.hkdh[156] = -776483550;
        fn.hkdh[157] = 153488430;
        fn.hkdh[158] = -391678444;
        fn.hkdh[159] = 1834883862;
        fn.hkdh[160] = 1239272433;
        fn.hkdh[161] = -88661947;
        fn.hkdh[162] = 1529587766;
        fn.hkdh[163] = 1213379231;
        fn.hkdh[164] = -544148415;
        fn.hkdh[165] = -561436481;
        fn.hkdh[166] = -1506112218;
        fn.hkdh[167] = 1830401332;
        fn.hkdh[168] = -341786313;
        fn.hkdh[169] = -1558409418;
        fn.hkdh[170] = 215861741;
        fn.hkdh[171] = -547837138;
        fn.hkdh[172] = -1683333452;
        fn.hkdh[173] = -812341443;
        fn.hkdh[174] = 2120655363;
        fn.hkdh[175] = 640897444;
        fn.hkdh[176] = -1835861585;
        fn.hkdh[177] = -112767232;
        fn.hkdh[178] = -416338042;
        fn.hkdh[179] = 1108923701;
        fn.hkdh[180] = -680563461;
        fn.hkdh[181] = 1453640266;
        fn.hkdh[182] = -371501309;
        fn.hkdh[183] = -1245120617;
        fn.hkdh[184] = 1447681326;
        fn.hkdh[185] = -1151414588;
        fn.hkdh[186] = -1878117255;
        fn.hkdh[187] = 1249495856;
        fn.hkdh[188] = -1540678420;
        fn.hkdh[189] = 1923224419;
        fn.hkdh[190] = 799008923;
        fn.hkdh[191] = 980213974;
        fn.hkdh[192] = 131524759;
        fn.hkdh[193] = -811214094;
        fn.hkdh[194] = -240449334;
        fn.hkdh[195] = -1731390557;
        fn.hkdh[196] = -2012786752;
        fn.hkdh[197] = -1895217673;
        fn.hkdh[198] = -1970792355;
        fn.hkdh[199] = -6532883;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void advance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hkvy", hkdt(int ), (int)150)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fn.hkdj("hkvz", hkdg(int ), (int)329)) break;
            v0 /* !! */  = (long)fn.hkdj("hkwa", hkdg(int ), (int)330);
        }
        var3_1 = fn.c;
        v1 /* !! */  = fn.on;
        if (true) ** GOTO lbl11
        block51: while (true) {
            v1 /* !! */  = (long)(fn.hkdj("hkwc", hkdt(int ), (int)152) - fn.hkdj("hkwb", hkdt(int ), (int)151));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -15255804: {
                    continue block51;
                }
                case 554421918: {
                    break block51;
                }
            }
            break;
        }
        var2_2 /* !! */  = fn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hkwd", hkdt(int ), (int)153)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fn.hkdj("hkwe", hkdg(int ), (int)331)) break;
            v2 /* !! */  = (long)fn.hkdj("hkwf", hkdg(int ), (int)332);
        }
        var1_3 = fn.a;
        if (var3_1) {
            throw null;
lbl25:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hkwg", hkdt(int ), (int)154)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == fn.hkdj("hkwh", hkdg(int ), (int)333)) break;
            v3 /* !! */  = (long)fn.hkdj("hkwi", hkdg(int ), (int)334);
        }
        v4 = this.currentIndex + fn.hkdj("hkwj", hkdg(int ), (int)335);
        v5 /* !! */  = fn.on;
        if (true) ** GOTO lbl38
        block55: while (true) {
            v5 /* !! */  = (long)(v6 - fn.hkdj("hkwk", hkdt(int ), (int)155));
lbl38:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -246454623: {
                    v6 = fn.hkdj("hkwl", hkdt(int ), (int)156);
                    continue block55;
                }
                case 554421918: {
                    break block55;
                }
                case 1178332035: {
                    v6 = fn.hkdj("hkwm", hkdt(int ), (int)157);
                    continue block55;
                }
            }
            break;
        }
        this.currentIndex = v4;
        if (var1_3 || var1_3) ** GOTO lbl25
        v7 /* !! */  = fn.on;
        if (true) ** GOTO lbl53
        block56: while (true) {
            v7 /* !! */  = (long)(v8 - fn.hkdj("hkwn", hkdt(int ), (int)158));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1977593308: {
                    v8 = fn.hkdj("hkwo", hkdt(int ), (int)159);
                    continue block56;
                }
                case 554421918: {
                    break block56;
                }
                case 1273307798: {
                    v8 = fn.hkdj("hkwp", hkdt(int ), (int)160);
                    continue block56;
                }
                case 1320573100: {
                    v8 = fn.hkdj("hkwq", hkdt(int ), (int)161);
                    continue block56;
                }
            }
            break;
        }
        v9 = this.processedCount + fn.hkdj("hkwr", hkdg(int ), (int)336);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hkws", hkdt(int ), (int)162)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == fn.hkdj("hkwt", hkdg(int ), (int)337)) break;
            v10 /* !! */  = (long)fn.hkdj("hkwu", hkdg(int ), (int)338);
        }
        this.processedCount = v9;
        if (var1_3 || var1_3) ** GOTO lbl25
        v11 = fn.hkdj("hkwv", hkdg(int ), (int)339);
        v12 /* !! */  = fn.on;
        if (true) ** GOTO lbl78
        block58: while (true) {
            v12 /* !! */  = (long)(fn.hkdj("hkwx", hkdt(int ), (int)164) - fn.hkdj("hkww", hkdt(int ), (int)163));
lbl78:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -935103131: {
                    continue block58;
                }
                case 554421918: {
                    break block58;
                }
            }
            break;
        }
        this.waitingResponse = v11;
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                v13 /* !! */  = fn.on;
                if (true) ** GOTO lbl93
                block59: while (true) {
                    v13 /* !! */  = (long)(fn.hkdj("hkwz", hkdt(int ), (int)166) - fn.hkdj("hkwy", hkdt(int ), (int)165));
lbl93:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 526915767: {
                            continue block59;
                        }
                        case 554421918: {
                            break block59;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_4 = fn.on - fn.hkdj("hkxa", hkdt(int ), (int)167)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == fn.hkdj("hkxb", hkdg(int ), (int)340)) break;
                    v14 /* !! */  = (long)fn.hkdj("hkxc", hkdg(int ), (int)341);
                }
                if (this.mode.isSelected("\u0422\u0435\u0441\u0442\u043e\u0432\u044b\u0439")) {
                    v15 = fn.hkdj("hkxd", hkdt(int ), (int)168);
                    if (var3_1) {
                        throw null;
                    }
                } else {
                    v15 = fn.hkdj("hkxe", hkdt(int ), (int)169);
                }
                v16 /* !! */  = fn.on;
                if (true) ** GOTO lbl113
                block61: while (true) {
                    v16 /* !! */  = (long)(v17 - fn.hkdj("hkxf", hkdt(int ), (int)170));
lbl113:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case 554421918: {
                            break block61;
                        }
                        case 811236465: {
                            v17 = fn.hkdj("hkxg", hkdt(int ), (int)171);
                            continue block61;
                        }
                        case 1211605968: {
                            v17 = fn.hkdj("hkxh", hkdt(int ), (int)172);
                            continue block61;
                        }
                    }
                    break;
                }
                this.delayMs = (long)v15;
                if (var1_3 || var1_3) ** GOTO lbl25
                v18 /* !! */  = fn.on;
                if (true) ** GOTO lbl128
                block62: while (true) {
                    v18 /* !! */  = (long)(v19 - fn.hkdj("hkxi", hkdt(int ), (int)173));
lbl128:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2133338794: {
                            v19 = fn.hkdj("hkxj", hkdt(int ), (int)174);
                            continue block62;
                        }
                        case -932512384: {
                            v19 = fn.hkdj("hkxk", hkdt(int ), (int)175);
                            continue block62;
                        }
                        case -914853086: {
                            v19 = fn.hkdj("hkxl", hkdt(int ), (int)176);
                            continue block62;
                        }
                        case 554421918: {
                            break block62;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = fn.on - fn.hkdj("hkxm", hkdt(int ), (int)177)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == fn.hkdj("hkxn", hkdg(int ), (int)342)) break;
                    v20 /* !! */  = (long)fn.hkdj("hkxo", hkdg(int ), (int)343);
                }
                this.timer.reset();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl149:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxp", hkdg(int ), (int)344);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl178
            }
lbl154:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxq", hkdg(int ), (int)345);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fn.hkdj("hkxr", hkdg(int ), (int)346);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl174
                    break;
                }
            }
            case 3: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxs", hkdg(int ), (int)347);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 4: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxt", hkdg(int ), (int)348);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl174:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxu", hkdg(int ), (int)349);
                if (var3_1) {
                    throw null;
                }
            }
lbl178:
            // 7 sources

            case 6: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxv", hkdg(int ), (int)350);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl183:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxw", hkdg(int ), (int)351);
                if (!var3_1) ** GOTO lbl174
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxx", hkdg(int ), (int)352);
                if (!var3_1) ** GOTO lbl178
                throw null;
            }
lbl191:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxy", hkdg(int ), (int)353);
                if (!var3_1) ** GOTO lbl178
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)fn.hkdj("hkxz", hkdg(int ), (int)354);
                if (!var3_1) ** GOTO lbl154
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)fn.hkdj("hkya", hkdg(int ), (int)355);
                if (!var3_1) ** GOTO lbl178
                throw null;
            }
lbl203:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)fn.hkdj("hkyb", hkdg(int ), (int)356);
                if (!var3_1) ** GOTO lbl183
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)fn.hkdj("hkyc", hkdg(int ), (int)357);
        ** while (!var3_1)
lbl210:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public fn() {
        var2_1 /* !! */  = fn.b;
        super("StaffExploit", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0438\u0449\u0435\u0442 \u0441\u0442\u0430\u0444\u0444 ReallyWorld \u0447\u0435\u0440\u0435\u0437 \u0440\u0435\u043f\u043e\u0440\u0442\u044b", du.MISC);
        this.mode = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0421\u043f\u043e\u0441\u043e\u0431 \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0438 \u0441\u0442\u0430\u0444\u0444\u0430", "\u041e\u0431\u044b\u0447\u043d\u044b\u0439", new String[]{"\u041e\u0431\u044b\u0447\u043d\u044b\u0439", "\u0422\u0435\u0441\u0442\u043e\u0432\u044b\u0439"});
        this.timer = ps.create();
        this.queue = new ArrayList<String>();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.onlineStaff = new LinkedHashSet<E>();
                this.successfulReports = new LinkedHashSet<E>();
                this.settings(new jx[]{this.mode});
                return;
            }
lbl13:
            // 3 sources

            case 0: {
                var2_1 /* !! */  = (int)fn.hkdj("hkdk", hkdg(int ), (int)0);
                ** GOTO lbl21
            }
lbl16:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)fn.hkdj("hkdl", hkdg(int ), (int)1);
                break;
            }
lbl19:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)fn.hkdj("hkdm", hkdg(int ), (int)2);
            }
lbl21:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)fn.hkdj("hkdn", hkdg(int ), (int)3);
                ** GOTO lbl13
            }
            case 4: {
                var2_1 /* !! */  = (int)fn.hkdj("hkdo", hkdg(int ), (int)4);
            }
            case 5: {
                var2_1 /* !! */  = (int)fn.hkdj("hkdp", hkdg(int ), (int)5);
                ** GOTO lbl13
            }
            case 6: {
                var2_1 /* !! */  = (int)fn.hkdj("hkdq", hkdg(int ), (int)6);
                ** GOTO lbl16
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)fn.hkdj("hkdr", hkdg(int ), (int)7);
                    ** GOTO lbl19
                    break;
                }
            }
            case 8: 
        }
        var2_1 /* !! */  = (int)fn.hkdj("hkds", hkdg(int ), (int)8);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static Set<String> createStaffNames() {
        var9 = fn.c;
        var8_1 /* !! */  = fn.b;
        var7_2 = fn.a;
        if (var9) {
            throw null;
lbl6:
            // 16 sources

            return null;
        }
        if (var7_2 || var7_2) ** GOTO lbl6
        var0_3 = new String[]{"NimuvaM", "N0RK", "tipok12k", "mist1kman", "xproblemaxq", "repaction", "ovs9nka", "lash1k_", "vilkaaa", "alles_fur_dich", "vzrivatelpiva", "MelissAZeRo_", "MsTank", "palpemambo", "6ubaa", "NebesniyDemon_", "Boss_kPOC", "Melankholia", "Flower_lll", "SaskeIzNaruto", "Zloy__banan4ik", "Kramas", "DiraMan", "Kotikk_01", "MoonLight", "maviushka", "InfinityDeath", "MrDomer", "mantastyle", "XenTai4IK", "meowikis", "Mari0netka4iter", "3lobiy_Geniy", "dixenRW", "O_Komary_O", "Zwiex", "MineFix909", "vmbill", "MelissaAZeRo_", "hotwheels", "YamoDaysy", "sraring135", "Roronoa_King", "_Xav1er_", "Pilatazh", "reloadaa423", "Prka1", "wheatley222", "monetka2132", "salocvinina228", "VoidCaster", "Lardi", "S1cr3tNet", "Ambosadoriro4ki", "vkss", "tt_dayener", "FlameRW", "niwones_", "petruco890", "JuliaSwettie", "AQM_Bull", "Regalia", "tragedia", "Evelur", "befushaa", "xWindaTop", "3EFIIPKA_", "Ml_Pelmen", "dashutka123", "peraspeadastr1", "PennyWisse", "hatred_denisska", "Salted_Sugar", "lapinsss", "Akimunia", "Mist1kMan", "xProblemAxq", "almaz_1298", "_qwersii_", "Zlyka_HiFis", "d3fend3r", "lighght_", "VexedUSSS", "nogletchergang", "sheikh_ich", "omega2010", "nelittorg", "soloila", "saxar0_43k", "ne0n0vaa"};
        if (var7_2 || var7_2) ** GOTO lbl6
        var1_4 = new LinkedHashSet<String>();
        if (var7_2 || var7_2) ** GOTO lbl6
        var2_5 = new LinkedHashSet<String>();
        if (var7_2) ** GOTO lbl6
        if (var8_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var7_2) ** GOTO lbl6
                var3_6 = var0_3;
                if (var7_2) ** GOTO lbl6
                var4_7 = var3_6.length;
                if (var7_2) ** GOTO lbl6
                var5_8 = fn.hkdj("hliz", hkdg(int ), (int)490);
                if (var7_2) ** GOTO lbl6
                do {
                    if (var7_2 || var7_2) ** GOTO lbl6
                    if (var5_8 >= var4_7) ** GOTO lbl41
                    if (var7_2) ** GOTO lbl6
                    var6_9 = var3_6[var5_8];
                    if (var7_2 || var7_2) ** GOTO lbl6
                    if (!var2_5.add(var6_9.toLowerCase(Locale.ROOT))) ** GOTO lbl36
                    if (var7_2 || var7_2) ** GOTO lbl6
                    var1_4.add(var6_9);
                    if (var7_2) ** GOTO lbl6
lbl36:
                    // 2 sources

                    if (var7_2 || var7_2) ** GOTO lbl6
                    ++var5_8;
                    if (var7_2) ** GOTO lbl6
                } while (!var9);
                throw null;
lbl41:
                // 1 sources

                if (!var7_2 && !var7_2) ** break;
                ** continue;
                return Collections.unmodifiableSet(var1_4);
            }
lbl44:
            // 2 sources

            case 0: {
                var8_1 /* !! */  = (int)fn.hkdj("hlja", hkdg(int ), (int)491);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 1: {
                var8_1 /* !! */  = (int)fn.hkdj("hljb", hkdg(int ), (int)492);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 2: {
                var8_1 /* !! */  = (int)fn.hkdj("hljc", hkdg(int ), (int)493);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl72
            }
lbl59:
            // 2 sources

            case 3: {
                var8_1 /* !! */  = (int)fn.hkdj("hljd", hkdg(int ), (int)494);
                if (!var9) break;
                throw null;
            }
lbl63:
            // 2 sources

            case 4: {
                var8_1 /* !! */  = (int)fn.hkdj("hlje", hkdg(int ), (int)495);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl68:
            // 2 sources

            case 5: {
                var8_1 /* !! */  = (int)fn.hkdj("hljf", hkdg(int ), (int)496);
                if (!var9) break;
                throw null;
            }
lbl72:
            // 2 sources

            case 6: {
                do {
                    var8_1 /* !! */  = (int)fn.hkdj("hljg", hkdg(int ), (int)497);
                } while (!var9);
                throw null;
            }
            case 7: {
                var8_1 /* !! */  = (int)fn.hkdj("hljh", hkdg(int ), (int)498);
                if (!var9) ** GOTO lbl44
                throw null;
            }
            case 8: {
                var8_1 /* !! */  = (int)fn.hkdj("hlji", hkdg(int ), (int)499);
                if (!var9) ** GOTO lbl59
                throw null;
            }
lbl85:
            // 2 sources

            case 9: {
                var8_1 /* !! */  = (int)fn.hkdj("hljj", hkdg(int ), (int)500);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl90:
            // 2 sources

            case 10: {
                var8_1 /* !! */  = (int)fn.hkdj("hljk", hkdg(int ), (int)501);
                if (!var9) ** GOTO lbl63
                throw null;
            }
lbl94:
            // 3 sources

            case 11: {
                var8_1 /* !! */  = (int)fn.hkdj("hljl", hkdg(int ), (int)502);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl144
            }
lbl99:
            // 2 sources

            case 12: {
                var8_1 /* !! */  = (int)fn.hkdj("hljm", hkdg(int ), (int)503);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl104:
            // 2 sources

            case 13: {
                var8_1 /* !! */  = (int)fn.hkdj("hljn", hkdg(int ), (int)504);
                if (!var9) ** GOTO lbl94
                throw null;
            }
lbl108:
            // 2 sources

            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_1 /* !! */  = (int)fn.hkdj("hljo", hkdg(int ), (int)505);
                    if (!var9) ** GOTO lbl104
                    throw null;
                }
            }
lbl113:
            // 4 sources

            case 15: {
                var8_1 /* !! */  = (int)fn.hkdj("hljp", hkdg(int ), (int)506);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 16: {
                var8_1 /* !! */  = (int)fn.hkdj("hljq", hkdg(int ), (int)507);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl123:
            // 2 sources

            case 17: {
                var8_1 /* !! */  = (int)fn.hkdj("hljr", hkdg(int ), (int)508);
                if (!var9) ** GOTO lbl113
                throw null;
            }
            case 18: {
                var8_1 /* !! */  = (int)fn.hkdj("hljs", hkdg(int ), (int)509);
                if (!var9) ** GOTO lbl99
                throw null;
            }
            case 19: {
                var8_1 /* !! */  = (int)fn.hkdj("hljt", hkdg(int ), (int)510);
                if (var9) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl136:
            // 2 sources

            case 20: {
                var8_1 /* !! */  = (int)fn.hkdj("hlju", hkdg(int ), (int)511);
                if (!var9) ** GOTO lbl123
                throw null;
            }
            case 21: {
                var8_1 /* !! */  = (int)fn.hkdj("hljv", hkdg(int ), (int)512);
                if (!var9) ** GOTO lbl85
                throw null;
            }
lbl144:
            // 3 sources

            case 22: {
                var8_1 /* !! */  = (int)fn.hkdj("hljw", hkdg(int ), (int)513);
                if (!var9) break;
                throw null;
            }
lbl148:
            // 2 sources

            case 23: {
                var8_1 /* !! */  = (int)fn.hkdj("hljx", hkdg(int ), (int)514);
                if (!var9) ** GOTO lbl108
                throw null;
            }
lbl152:
            // 3 sources

            case 24: {
                var8_1 /* !! */  = (int)fn.hkdj("hljy", hkdg(int ), (int)515);
                if (!var9) ** GOTO lbl144
                throw null;
            }
            case 25: {
                var8_1 /* !! */  = (int)fn.hkdj("hljz", hkdg(int ), (int)516);
                if (!var9) ** GOTO lbl152
                throw null;
            }
            case 26: 
        }
        var8_1 /* !! */  = (int)fn.hkdj("hlka", hkdg(int ), (int)517);
        ** while (!var9)
lbl163:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hlme() {
        fn.hkdu[0] = -3250372094884698061L;
        fn.hkdu[1] = -4888311814855472100L;
        fn.hkdu[2] = -2232024201796407160L;
        fn.hkdu[3] = 8724520367873761257L;
        fn.hkdu[4] = -6899360662783104642L;
        fn.hkdu[5] = 2359319508346187866L;
        fn.hkdu[6] = 7221236792129585574L;
        fn.hkdu[7] = -6857655500304631533L;
        fn.hkdu[8] = 8921937217115068436L;
        fn.hkdu[9] = 3724078313046203139L;
        fn.hkdu[10] = 5489981858702691240L;
        fn.hkdu[11] = -5931441454180401598L;
        fn.hkdu[12] = 3315271826250573570L;
        fn.hkdu[13] = 5059064306742443904L;
        fn.hkdu[14] = -7673201377730579553L;
        fn.hkdu[15] = 1079510199047842737L;
        fn.hkdu[16] = 4560327544941751097L;
        fn.hkdu[17] = -6268789637236387518L;
        fn.hkdu[18] = -2481128605431476603L;
        fn.hkdu[19] = -8748284106749040844L;
        fn.hkdu[20] = 5558299155070011387L;
        fn.hkdu[21] = -1653619063645342060L;
        fn.hkdu[22] = 8086969068970703143L;
        fn.hkdu[23] = -4708913058828193863L;
        fn.hkdu[24] = -7724048936040958708L;
        fn.hkdu[25] = 7544274185115048555L;
        fn.hkdu[26] = -7480844685057649254L;
        fn.hkdu[27] = -2240931848351792810L;
        fn.hkdu[28] = -9139062520729822840L;
        fn.hkdu[29] = -8966745508136411327L;
        fn.hkdu[30] = 5363113346248375301L;
        fn.hkdu[31] = 7203513357943548387L;
        fn.hkdu[32] = -6824712181930825367L;
        fn.hkdu[33] = -5266672618052184622L;
        fn.hkdu[34] = 7322759158845618197L;
        fn.hkdu[35] = -1892028733709115749L;
        fn.hkdu[36] = 3460692088291295928L;
        fn.hkdu[37] = -965734838795540950L;
        fn.hkdu[38] = -5876065029064197981L;
        fn.hkdu[39] = 3892576202908982861L;
        fn.hkdu[40] = 674695555550664394L;
        fn.hkdu[41] = -2772901164547190268L;
        fn.hkdu[42] = 1389748314058779882L;
        fn.hkdu[43] = -3455549866911464225L;
        fn.hkdu[44] = -5377347456160962403L;
        fn.hkdu[45] = -3187878398395861804L;
        fn.hkdu[46] = 3361598151553465138L;
        fn.hkdu[47] = 4673687203736938003L;
        fn.hkdu[48] = 4094933692725243841L;
        fn.hkdu[49] = -173485702037503008L;
        fn.hkdu[50] = -911598638983370810L;
        fn.hkdu[51] = 4103667735890313883L;
        fn.hkdu[52] = -5687640068124685299L;
        fn.hkdu[53] = -2275260987134453290L;
        fn.hkdu[54] = 346383412331155677L;
        fn.hkdu[55] = -3213109075713178365L;
        fn.hkdu[56] = 9125254557845334618L;
        fn.hkdu[57] = -4869218932420985258L;
        fn.hkdu[58] = -4395672927267927710L;
        fn.hkdu[59] = 4081157022017512652L;
        fn.hkdu[60] = 8747721616642746793L;
        fn.hkdu[61] = 890782968527427812L;
        fn.hkdu[62] = 2100416575366301017L;
        fn.hkdu[63] = 6972963797712515953L;
        fn.hkdu[64] = 4258060037274717094L;
        fn.hkdu[65] = -8845090508809799394L;
        fn.hkdu[66] = -4275745831473764995L;
        fn.hkdu[67] = -2507549640781556399L;
        fn.hkdu[68] = -1281860372654379305L;
        fn.hkdu[69] = -4512344437393831655L;
        fn.hkdu[70] = -4554933493523096106L;
        fn.hkdu[71] = 3002689070921970856L;
        fn.hkdu[72] = -7507464802835878395L;
        fn.hkdu[73] = 6473095611468842492L;
        fn.hkdu[74] = -8085180427520271295L;
        fn.hkdu[75] = -3328772373638169607L;
        fn.hkdu[76] = -473730998050664994L;
        fn.hkdu[77] = -2327022618494234261L;
        fn.hkdu[78] = 5516086084875621350L;
        fn.hkdu[79] = 7156208165126672095L;
        fn.hkdu[80] = 2997264905846233030L;
        fn.hkdu[81] = -6901430091971710594L;
        fn.hkdu[82] = -6222273098856686600L;
        fn.hkdu[83] = 520536645159749382L;
        fn.hkdu[84] = 1137946384929741020L;
        fn.hkdu[85] = -6908301112919902888L;
        fn.hkdu[86] = -6803744179516003070L;
        fn.hkdu[87] = 2683204545897997403L;
        fn.hkdu[88] = -6487780250248862142L;
        fn.hkdu[89] = -5101721485629421468L;
        fn.hkdu[90] = -8385569579247049583L;
        fn.hkdu[91] = -6659300897304837588L;
        fn.hkdu[92] = -44685176788484105L;
        fn.hkdu[93] = 6950995874538439101L;
        fn.hkdu[94] = -8747070955081426119L;
        fn.hkdu[95] = -7011177595654560005L;
        fn.hkdu[96] = -6799918670704696873L;
        fn.hkdu[97] = 4866109647054487489L;
        fn.hkdu[98] = -8640083946312546914L;
        fn.hkdu[99] = -3927157336434781379L;
    }

    private static /* synthetic */ void hlli() {
        fn.hkdi[200] = 266657508;
        fn.hkdi[201] = -324113673;
        fn.hkdi[202] = -398407894;
        fn.hkdi[203] = 1191903710;
        fn.hkdi[204] = -1874960302;
        fn.hkdi[205] = -1908441937;
        fn.hkdi[206] = -9705337;
        fn.hkdi[207] = -1291256274;
        fn.hkdi[208] = 1759265989;
        fn.hkdi[209] = 645539280;
        fn.hkdi[210] = -1233581631;
        fn.hkdi[211] = 1328647415;
        fn.hkdi[212] = 1727818484;
        fn.hkdi[213] = -2054135000;
        fn.hkdi[214] = -271381041;
        fn.hkdi[215] = 544492678;
        fn.hkdi[216] = -833478694;
        fn.hkdi[217] = 163943551;
        fn.hkdi[218] = -5272644;
        fn.hkdi[219] = 529656465;
        fn.hkdi[220] = -934920401;
        fn.hkdi[221] = -624218380;
        fn.hkdi[222] = -1180086217;
        fn.hkdi[223] = -1452144142;
        fn.hkdi[224] = 207675503;
        fn.hkdi[225] = 339489713;
        fn.hkdi[226] = -1051750042;
        fn.hkdi[227] = 1358798781;
        fn.hkdi[228] = 490909749;
        fn.hkdi[229] = -1439933678;
        fn.hkdi[230] = 448570497;
        fn.hkdi[231] = 2063258412;
        fn.hkdi[232] = -1494874457;
        fn.hkdi[233] = 1763941373;
        fn.hkdi[234] = 1003412510;
        fn.hkdi[235] = -1774039441;
        fn.hkdi[236] = 154921745;
        fn.hkdi[237] = 1009716643;
        fn.hkdi[238] = -2135340246;
        fn.hkdi[239] = -1812640384;
        fn.hkdi[240] = -1662471261;
        fn.hkdi[241] = -529081013;
        fn.hkdi[242] = -230992775;
        fn.hkdi[243] = 1130124217;
        fn.hkdi[244] = -502923897;
        fn.hkdi[245] = 1955561528;
        fn.hkdi[246] = 1455981574;
        fn.hkdi[247] = 337141498;
        fn.hkdi[248] = -915997562;
        fn.hkdi[249] = 1152182324;
        fn.hkdi[250] = 1252232340;
        fn.hkdi[251] = 1359053302;
        fn.hkdi[252] = 1713685956;
        fn.hkdi[253] = 2142736254;
        fn.hkdi[254] = 2121396337;
        fn.hkdi[255] = 800954778;
        fn.hkdi[256] = 2057979034;
        fn.hkdi[257] = -246245201;
        fn.hkdi[258] = -1636283447;
        fn.hkdi[259] = 1499232766;
        fn.hkdi[260] = 1163342753;
        fn.hkdi[261] = 1907158008;
        fn.hkdi[262] = 1025753153;
        fn.hkdi[263] = 2049112020;
        fn.hkdi[264] = 1864296538;
        fn.hkdi[265] = 22964455;
        fn.hkdi[266] = -130834645;
        fn.hkdi[267] = 813030183;
        fn.hkdi[268] = -2077756940;
        fn.hkdi[269] = 1354043508;
        fn.hkdi[270] = -965021046;
        fn.hkdi[271] = 1439417294;
        fn.hkdi[272] = 1343162612;
        fn.hkdi[273] = 449022711;
        fn.hkdi[274] = 284310292;
        fn.hkdi[275] = -995760623;
        fn.hkdi[276] = -2019784195;
        fn.hkdi[277] = 714117382;
        fn.hkdi[278] = 827674275;
        fn.hkdi[279] = 200626436;
        fn.hkdi[280] = 57755905;
        fn.hkdi[281] = -1108891569;
        fn.hkdi[282] = -1991630871;
        fn.hkdi[283] = 1937646896;
        fn.hkdi[284] = 1485581595;
        fn.hkdi[285] = -5442340;
        fn.hkdi[286] = -496159332;
        fn.hkdi[287] = -708420970;
        fn.hkdi[288] = -1715782557;
        fn.hkdi[289] = 800502543;
        fn.hkdi[290] = 1255344498;
        fn.hkdi[291] = 831527803;
        fn.hkdi[292] = 1708157026;
        fn.hkdi[293] = 832023759;
        fn.hkdi[294] = 445438856;
        fn.hkdi[295] = 745651142;
        fn.hkdi[296] = 1445051495;
        fn.hkdi[297] = -926872860;
        fn.hkdi[298] = 1260187492;
        fn.hkdi[299] = 57198055;
    }

    private static /* synthetic */ void hllo() {
        fn.hkdi[300] = -84371642;
        fn.hkdi[301] = -730251946;
        fn.hkdi[302] = -1630096346;
        fn.hkdi[303] = -843797134;
        fn.hkdi[304] = -2039931425;
        fn.hkdi[305] = 328912706;
        fn.hkdi[306] = 2118145741;
        fn.hkdi[307] = -286556573;
        fn.hkdi[308] = 816221681;
        fn.hkdi[309] = -1986159297;
        fn.hkdi[310] = 821594761;
        fn.hkdi[311] = 1325198085;
        fn.hkdi[312] = -1765137773;
        fn.hkdi[313] = -593184773;
        fn.hkdi[314] = -1356452874;
        fn.hkdi[315] = -155822822;
        fn.hkdi[316] = -1106072017;
        fn.hkdi[317] = 2077388260;
        fn.hkdi[318] = -237599699;
        fn.hkdi[319] = -135704386;
        fn.hkdi[320] = -2096967102;
        fn.hkdi[321] = 809891359;
        fn.hkdi[322] = 871712857;
        fn.hkdi[323] = 563599754;
        fn.hkdi[324] = 239430202;
        fn.hkdi[325] = -1076945205;
        fn.hkdi[326] = -487275819;
        fn.hkdi[327] = -407279689;
        fn.hkdi[328] = -824124078;
        fn.hkdi[329] = 1648680463;
        fn.hkdi[330] = 787642350;
        fn.hkdi[331] = 201953868;
        fn.hkdi[332] = -1355542760;
        fn.hkdi[333] = 143084795;
        fn.hkdi[334] = -591692387;
        fn.hkdi[335] = -404808199;
        fn.hkdi[336] = -2063860681;
        fn.hkdi[337] = -1846825719;
        fn.hkdi[338] = -805650816;
        fn.hkdi[339] = -1752978032;
        fn.hkdi[340] = 1938561011;
        fn.hkdi[341] = 412578671;
        fn.hkdi[342] = 2009912688;
        fn.hkdi[343] = 230190583;
        fn.hkdi[344] = -1247746377;
        fn.hkdi[345] = 1504927001;
        fn.hkdi[346] = -1113729841;
        fn.hkdi[347] = 1185001669;
        fn.hkdi[348] = -1106632182;
        fn.hkdi[349] = 1544275563;
        fn.hkdi[350] = -1092927672;
        fn.hkdi[351] = 620438475;
        fn.hkdi[352] = 999247463;
        fn.hkdi[353] = 1760014564;
        fn.hkdi[354] = 581080779;
        fn.hkdi[355] = -203198627;
        fn.hkdi[356] = 2142602042;
        fn.hkdi[357] = -139523800;
        fn.hkdi[358] = 0x55222422;
        fn.hkdi[359] = -1945395334;
        fn.hkdi[360] = 1556360351;
        fn.hkdi[361] = 1550981982;
        fn.hkdi[362] = 1067057929;
        fn.hkdi[363] = 1339295104;
        fn.hkdi[364] = -1942367257;
        fn.hkdi[365] = 3400701;
        fn.hkdi[366] = 1328712580;
        fn.hkdi[367] = 890073074;
        fn.hkdi[368] = -429285889;
        fn.hkdi[369] = -1131781701;
        fn.hkdi[370] = 1770879558;
        fn.hkdi[371] = 2108965105;
        fn.hkdi[372] = 1649928540;
        fn.hkdi[373] = 1693359863;
        fn.hkdi[374] = -897631035;
        fn.hkdi[375] = 1103918727;
        fn.hkdi[376] = -752679645;
        fn.hkdi[377] = 2119749816;
        fn.hkdi[378] = 1252012623;
        fn.hkdi[379] = -635585297;
        fn.hkdi[380] = -1127531789;
        fn.hkdi[381] = 1154183995;
        fn.hkdi[382] = 390244580;
        fn.hkdi[383] = 2064677403;
        fn.hkdi[384] = 1047437899;
        fn.hkdi[385] = 35062226;
        fn.hkdi[386] = 1827864903;
        fn.hkdi[387] = -317569338;
        fn.hkdi[388] = -662468026;
        fn.hkdi[389] = -330838936;
        fn.hkdi[390] = -651881685;
        fn.hkdi[391] = -1012527509;
        fn.hkdi[392] = 1596299647;
        fn.hkdi[393] = 1972354406;
        fn.hkdi[394] = 1177705649;
        fn.hkdi[395] = 1483345687;
        fn.hkdi[396] = -868895844;
        fn.hkdi[397] = 2061365473;
        fn.hkdi[398] = 695322768;
        fn.hkdi[399] = -1113048629;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block133: {
            block132: {
                block131: {
                    block130: {
                        block129: {
                            block128: {
                                block127: {
                                    block126: {
                                        block125: {
                                            var9_2 = fn.c;
                                            var8_3 /* !! */  = fn.b;
                                            var7_4 = fn.a;
                                            if (var9_2) {
                                                throw null;
lbl6:
                                                // 34 sources

                                                return;
                                            }
                                            if (var7_4 || var7_4) ** GOTO lbl6
                                            if (!this.waitingResponse) break block125;
                                            if (var7_4) ** GOTO lbl6
                                            if (var1_1.getType() != cr$Type.RECEIVE) break block125;
                                            if (var7_4 || var7_4) ** GOTO lbl6
                                            var3_5 = var1_1.getPacket();
                                            if (var7_4) ** GOTO lbl6
                                            if (!(var3_5 instanceof class_7439)) break block125;
                                            if (var7_4) ** GOTO lbl6
                                            var2_6 = (class_7439)var3_5;
                                            if (var7_4 || var7_4) ** GOTO lbl6
                                            if (this.currentIndex < this.queue.size()) break block126;
                                            if (var7_4) ** GOTO lbl6
                                        }
                                        if (var7_4 || var7_4) ** GOTO lbl6
                                        return;
                                    }
                                    if (var7_4 || var7_4) ** GOTO lbl6
                                    var3_5 = var2_6.comp_763().getString();
                                    if (var7_4 || var7_4) ** GOTO lbl6
                                    if (var3_5 == null) break block127;
                                    if (var7_4) ** GOTO lbl6
                                    if (var3_5.isBlank()) break block127;
                                    if (var7_4) ** GOTO lbl6
                                    if (!var3_5.startsWith("/")) break block128;
                                    if (var7_4) ** GOTO lbl6
                                }
                                if (var7_4 || var7_4) ** GOTO lbl6
                                return;
                            }
                            if (var7_4 || var7_4) ** GOTO lbl6
                            var4_7 = this.queue.get(this.currentIndex);
                            if (var7_4 || var7_4) ** GOTO lbl6
                            var5_8 = fn.PLAYER_NOT_FOUND.matcher((CharSequence)var3_5).find();
                            if (var7_4 || var7_4) ** GOTO lbl6
                            if (!this.mode.isSelected("\u041e\u0431\u044b\u0447\u043d\u044b\u0439")) break block129;
                            if (var7_4 || var7_4) ** GOTO lbl6
                            v0 = fn.REPORT_SUCCESS.matcher((CharSequence)var3_5).find();
                            if (var9_2) {
                                throw null;
                            }
                            break block130;
                        }
                        if (var7_4 || var7_4) ** GOTO lbl6
                        v0 = var6_9 = fn.KILLER_SUCCESS.matcher((CharSequence)var3_5).find();
                    }
                    if (var7_4 || var7_4) ** GOTO lbl6
                    if (var5_8) break block131;
                    if (var7_4) ** GOTO lbl6
                    if (var6_9) break block131;
                    if (var7_4) ** GOTO lbl6
                    return;
                }
                if (var7_4 || var7_4) ** GOTO lbl6
                var1_1.setCancelled((boolean)fn.hkdj("hklj", hkdg(int ), (int)145));
                if (var7_4 || var7_4) ** GOTO lbl6
                if (!var5_8) break block132;
                if (var7_4 || var7_4) ** GOTO lbl6
                if (this.pass != fn.hkdj("hklk", hkdg(int ), (int)146)) break block133;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.successfulReports.remove(var4_7);
                if (var7_4 || var7_4) ** GOTO lbl6
                this.onlineStaff.remove(var4_7);
                if (var7_4) ** GOTO lbl6
                if (var9_2) {
                    throw null;
                }
                break block133;
            }
            if (var7_4 || var7_4) ** GOTO lbl6
            this.successfulReports.add(var4_7);
            if (var7_4 || var7_4) ** GOTO lbl6
            if (!this.onlineStaff.add(var4_7)) break block133;
            if (var7_4 || var7_4) ** GOTO lbl6
            ee.info("Staff online: " + var4_7);
            if (var7_4) ** GOTO lbl6
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.advance();
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
lbl94:
            // 2 sources

            case 0: {
                var8_3 /* !! */  = (int)fn.hkdj("hkll", hkdg(int ), (int)147);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl99:
            // 2 sources

            case 1: {
                var8_3 /* !! */  = (int)fn.hkdj("hklm", hkdg(int ), (int)148);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 2: {
                var8_3 /* !! */  = (int)fn.hkdj("hkln", hkdg(int ), (int)149);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
            case 3: {
                var8_3 /* !! */  = (int)fn.hkdj("hklo", hkdg(int ), (int)150);
                if (!var9_2) ** GOTO lbl99
                throw null;
            }
            case 4: {
                var8_3 /* !! */  = (int)fn.hkdj("hklp", hkdg(int ), (int)151);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl118:
            // 2 sources

            case 5: {
                var8_3 /* !! */  = (int)fn.hkdj("hklq", hkdg(int ), (int)152);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl123:
            // 4 sources

            case 6: {
                var8_3 /* !! */  = (int)fn.hkdj("hklr", hkdg(int ), (int)153);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl128:
            // 2 sources

            case 7: {
                var8_3 /* !! */  = (int)fn.hkdj("hkls", hkdg(int ), (int)154);
                if (!var9_2) ** GOTO lbl123
                throw null;
            }
            case 8: {
                var8_3 /* !! */  = (int)fn.hkdj("hklt", hkdg(int ), (int)155);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl137:
            // 2 sources

            case 9: {
                var8_3 /* !! */  = (int)fn.hkdj("hklu", hkdg(int ), (int)156);
                if (!var9_2) ** GOTO lbl118
                throw null;
            }
            case 10: {
                var8_3 /* !! */  = (int)fn.hkdj("hklv", hkdg(int ), (int)157);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl146:
            // 2 sources

            case 11: {
                var8_3 /* !! */  = (int)fn.hkdj("hklw", hkdg(int ), (int)158);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl151:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)fn.hkdj("hklx", hkdg(int ), (int)159);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl328
                    break;
                }
            }
lbl157:
            // 2 sources

            case 13: {
                var8_3 /* !! */  = (int)fn.hkdj("hkly", hkdg(int ), (int)160);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl162:
            // 2 sources

            case 14: {
                var8_3 /* !! */  = (int)fn.hkdj("hklz", hkdg(int ), (int)161);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 15: {
                var8_3 /* !! */  = (int)fn.hkdj("hkma", hkdg(int ), (int)162);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl234
            }
            case 16: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmb", hkdg(int ), (int)163);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl274
            }
            case 17: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmc", hkdg(int ), (int)164);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl182:
            // 2 sources

            case 18: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmd", hkdg(int ), (int)165);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl187:
            // 2 sources

            case 19: {
                var8_3 /* !! */  = (int)fn.hkdj("hkme", hkdg(int ), (int)166);
                if (!var9_2) ** GOTO lbl137
                throw null;
            }
            case 20: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmf", hkdg(int ), (int)167);
                if (!var9_2) ** GOTO lbl123
                throw null;
            }
lbl195:
            // 2 sources

            case 21: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmg", hkdg(int ), (int)168);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl200:
            // 2 sources

            case 22: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmh", hkdg(int ), (int)169);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl205:
            // 3 sources

            case 23: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmi", hkdg(int ), (int)170);
                if (!var9_2) ** GOTO lbl146
                throw null;
            }
            case 24: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmj", hkdg(int ), (int)171);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
            case 25: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmk", hkdg(int ), (int)172);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 26: {
                var8_3 /* !! */  = (int)fn.hkdj("hkml", hkdg(int ), (int)173);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl224:
            // 3 sources

            case 27: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmm", hkdg(int ), (int)174);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl229:
            // 3 sources

            case 28: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmn", hkdg(int ), (int)175);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl234:
            // 3 sources

            case 29: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmo", hkdg(int ), (int)176);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 30: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmp", hkdg(int ), (int)177);
                if (!var9_2) ** GOTO lbl200
                throw null;
            }
lbl243:
            // 2 sources

            case 31: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmq", hkdg(int ), (int)178);
                if (!var9_2) ** GOTO lbl224
                throw null;
            }
lbl247:
            // 2 sources

            case 32: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmr", hkdg(int ), (int)179);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl284
            }
            case 33: {
                var8_3 /* !! */  = (int)fn.hkdj("hkms", hkdg(int ), (int)180);
                if (!var9_2) ** GOTO lbl151
                throw null;
            }
lbl256:
            // 3 sources

            case 34: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmt", hkdg(int ), (int)181);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl261:
            // 2 sources

            case 35: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmu", hkdg(int ), (int)182);
                if (!var9_2) ** GOTO lbl234
                throw null;
            }
            case 36: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmv", hkdg(int ), (int)183);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 37: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmw", hkdg(int ), (int)184);
                if (!var9_2) ** GOTO lbl243
                throw null;
            }
lbl274:
            // 2 sources

            case 38: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmx", hkdg(int ), (int)185);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl279:
            // 2 sources

            case 39: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmy", hkdg(int ), (int)186);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl324
            }
lbl284:
            // 3 sources

            case 40: {
                var8_3 /* !! */  = (int)fn.hkdj("hkmz", hkdg(int ), (int)187);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl365
            }
lbl289:
            // 3 sources

            case 41: {
                var8_3 /* !! */  = (int)fn.hkdj("hkna", hkdg(int ), (int)188);
                if (!var9_2) ** GOTO lbl205
                throw null;
            }
lbl293:
            // 2 sources

            case 42: {
                var8_3 /* !! */  = (int)fn.hkdj("hknb", hkdg(int ), (int)189);
                if (!var9_2) ** GOTO lbl256
                throw null;
            }
lbl297:
            // 2 sources

            case 43: {
                var8_3 /* !! */  = (int)fn.hkdj("hknc", hkdg(int ), (int)190);
                if (!var9_2) ** GOTO lbl279
                throw null;
            }
            case 44: {
                var8_3 /* !! */  = (int)fn.hkdj("hknd", hkdg(int ), (int)191);
                if (!var9_2) ** GOTO lbl289
                throw null;
            }
            case 45: {
                var8_3 /* !! */  = (int)fn.hkdj("hkne", hkdg(int ), (int)192);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl310:
            // 5 sources

            case 46: {
                var8_3 /* !! */  = (int)fn.hkdj("hknf", hkdg(int ), (int)193);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl320
            }
lbl315:
            // 3 sources

            case 47: {
                var8_3 /* !! */  = (int)fn.hkdj("hkng", hkdg(int ), (int)194);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl369
            }
lbl320:
            // 2 sources

            case 48: {
                var8_3 /* !! */  = (int)fn.hkdj("hknh", hkdg(int ), (int)195);
                if (!var9_2) ** GOTO lbl162
                throw null;
            }
lbl324:
            // 3 sources

            case 49: {
                var8_3 /* !! */  = (int)fn.hkdj("hkni", hkdg(int ), (int)196);
                if (!var9_2) ** GOTO lbl123
                throw null;
            }
lbl328:
            // 3 sources

            case 50: {
                var8_3 /* !! */  = (int)fn.hkdj("hknj", hkdg(int ), (int)197);
                if (!var9_2) ** GOTO lbl205
                throw null;
            }
lbl332:
            // 2 sources

            case 51: {
                var8_3 /* !! */  = (int)fn.hkdj("hknk", hkdg(int ), (int)198);
                if (!var9_2) ** GOTO lbl94
                throw null;
            }
lbl336:
            // 3 sources

            case 52: {
                var8_3 /* !! */  = (int)fn.hkdj("hknl", hkdg(int ), (int)199);
                if (!var9_2) ** GOTO lbl293
                throw null;
            }
lbl340:
            // 3 sources

            case 53: {
                var8_3 /* !! */  = (int)fn.hkdj("hknm", hkdg(int ), (int)200);
                if (!var9_2) ** GOTO lbl297
                throw null;
            }
            case 54: {
                var8_3 /* !! */  = (int)fn.hkdj("hknn", hkdg(int ), (int)201);
                if (!var9_2) ** GOTO lbl128
                throw null;
            }
lbl348:
            // 2 sources

            case 55: {
                var8_3 /* !! */  = (int)fn.hkdj("hkno", hkdg(int ), (int)202);
                if (!var9_2) ** GOTO lbl224
                throw null;
            }
            case 56: {
                var8_3 /* !! */  = (int)fn.hkdj("hknp", hkdg(int ), (int)203);
                if (!var9_2) ** GOTO lbl310
                throw null;
            }
            case 57: {
                var8_3 /* !! */  = (int)fn.hkdj("hknq", hkdg(int ), (int)204);
                if (!var9_2) ** GOTO lbl310
                throw null;
            }
lbl360:
            // 2 sources

            case 58: {
                do {
                    var8_3 /* !! */  = (int)fn.hkdj("hknr", hkdg(int ), (int)205);
                } while (!var9_2);
                throw null;
            }
lbl365:
            // 5 sources

            case 59: {
                var8_3 /* !! */  = (int)fn.hkdj("hkns", hkdg(int ), (int)206);
                if (!var9_2) ** GOTO lbl340
                throw null;
            }
lbl369:
            // 2 sources

            case 60: {
                var8_3 /* !! */  = (int)fn.hkdj("hknt", hkdg(int ), (int)207);
                if (!var9_2) ** GOTO lbl315
                throw null;
            }
            case 61: 
        }
        var8_3 /* !! */  = (int)fn.hkdj("hknu", hkdg(int ), (int)208);
        ** while (!var9_2)
lbl376:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int getProgressPercent() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hleb", hkdt(int ), (int)228)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fn.hkdj("hlec", hkdg(int ), (int)417)) break;
            v0 /* !! */  = (long)fn.hkdj("hled", hkdg(int ), (int)418);
        }
        var3_1 = fn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hlee", hkdt(int ), (int)229)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fn.hkdj("hlef", hkdg(int ), (int)419)) break;
            v1 /* !! */  = (long)fn.hkdj("hleg", hkdg(int ), (int)420);
        }
        var2_2 /* !! */  = fn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hleh", hkdt(int ), (int)230)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fn.hkdj("hlei", hkdg(int ), (int)421)) break;
            v2 /* !! */  = (long)fn.hkdj("hlej", hkdg(int ), (int)422);
        }
        var1_3 = fn.a;
        if (var3_1) {
            throw null;
lbl24:
            // 4 sources

            return (int)fn.hkdj("hlek", hkdg(int ), (int)423);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl24
                v3 /* !! */  = fn.on;
                if (true) ** GOTO lbl35
                block23: while (true) {
                    v3 /* !! */  = (long)(fn.hkdj("hlem", hkdt(int ), (int)232) - fn.hkdj("hlel", hkdt(int ), (int)231));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 554421918: {
                            break block23;
                        }
                        case 1545210966: {
                            continue block23;
                        }
                    }
                    break;
                }
                if (this.totalItems > 0) ** GOTO lbl43
                if (var1_3) ** GOTO lbl24
                return (int)fn.hkdj("hlen", hkdg(int ), (int)424);
lbl43:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v4 = fn.hkdj("hleo", hkdg(int ), (int)425);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hlep", hkdt(int ), (int)233)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == fn.hkdj("hleq", hkdg(int ), (int)426)) break;
                    v5 /* !! */  = (long)fn.hkdj("hler", hkdg(int ), (int)427);
                }
                v6 = this.processedCount * fn.hkdj("hles", hkdg(int ), (int)428);
                v7 /* !! */  = fn.on;
                if (true) ** GOTO lbl57
                block25: while (true) {
                    v7 /* !! */  = (long)(v8 - fn.hkdj("hlet", hkdt(int ), (int)234));
lbl57:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1619298774: {
                            v8 = fn.hkdj("hleu", hkdt(int ), (int)235);
                            continue block25;
                        }
                        case -1498368321: {
                            v8 = fn.hkdj("hlev", hkdt(int ), (int)236);
                            continue block25;
                        }
                        case 554421918: {
                            break block25;
                        }
                    }
                    break;
                }
                v9 = v6 / this.totalItems;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = fn.on - fn.hkdj("hlew", hkdt(int ), (int)237)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == fn.hkdj("hlex", hkdg(int ), (int)429)) break;
                    v10 /* !! */  = (long)fn.hkdj("hley", hkdg(int ), (int)430);
                }
                return Math.min((int)v4, v9);
            }
lbl74:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)fn.hkdj("hlez", hkdg(int ), (int)431);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl79:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)fn.hkdj("hlfa", hkdg(int ), (int)432);
                    if (!var3_1) ** GOTO lbl74
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)fn.hkdj("hlfb", hkdg(int ), (int)433);
                if (!var3_1) ** GOTO lbl74
                throw null;
            }
lbl88:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)fn.hkdj("hlfc", hkdg(int ), (int)434);
                } while (!var3_1);
                throw null;
            }
lbl93:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)fn.hkdj("hlfd", hkdg(int ), (int)435);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 5: {
                var2_2 /* !! */  = (int)fn.hkdj("hlfe", hkdg(int ), (int)436);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
lbl102:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)fn.hkdj("hlff", hkdg(int ), (int)437);
                if (!var3_1) ** GOTO lbl88
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)fn.hkdj("hlfg", hkdg(int ), (int)438);
        ** while (!var3_1)
lbl109:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onDraw(bu var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hkpz", hkdt(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fn.hkdj("hkqa", hkdg(int ), (int)239)) break;
            v0 /* !! */  = (long)fn.hkdj("hkqb", hkdg(int ), (int)240);
        }
        var8_2 = fn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hkqc", hkdt(int ), (int)86)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fn.hkdj("hkqd", hkdg(int ), (int)241)) break;
            v1 /* !! */  = (long)fn.hkdj("hkqe", hkdg(int ), (int)242);
        }
        var7_3 /* !! */  = fn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hkqf", hkdt(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fn.hkdj("hkqg", hkdg(int ), (int)243)) break;
            v2 /* !! */  = (long)fn.hkdj("hkqh", hkdg(int ), (int)244);
        }
        var6_4 = fn.a;
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_2) {
                    throw null;
lbl24:
                    // 10 sources

                    return;
                }
                if (var6_4 || var6_4) ** GOTO lbl24
                v3 /* !! */  = fn.on;
                if (true) ** GOTO lbl31
                block58: while (true) {
                    v3 /* !! */  = (long)(v4 - fn.hkdj("hkqi", hkdt(int ), (int)88));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -185640999: {
                            v4 = fn.hkdj("hkqj", hkdt(int ), (int)89);
                            continue block58;
                        }
                        case 554421918: {
                            break block58;
                        }
                        case 689672125: {
                            v4 = fn.hkdj("hkqk", hkdt(int ), (int)90);
                            continue block58;
                        }
                        case 1288515997: {
                            v4 = fn.hkdj("hkql", hkdt(int ), (int)91);
                            continue block58;
                        }
                    }
                    break;
                }
                if (!this.blocked) ** GOTO lbl61
                if (var6_4) ** GOTO lbl24
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hkqm", hkdt(int ), (int)92)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fn.hkdj("hkqn", hkdg(int ), (int)245)) break;
                    v5 /* !! */  = (long)fn.hkdj("hkqo", hkdg(int ), (int)246);
                }
                v6 /* !! */  = fn.on;
                if (true) ** GOTO lbl54
                block60: while (true) {
                    v6 /* !! */  = (long)(fn.hkdj("hkqq", hkdt(int ), (int)94) - fn.hkdj("hkqp", hkdt(int ), (int)93));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 505488852: {
                            continue block60;
                        }
                        case 554421918: {
                            break block60;
                        }
                    }
                    break;
                }
                if (fn.mc.field_1724 != null) ** GOTO lbl63
                if (var6_4) ** GOTO lbl24
lbl61:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl24
                return;
lbl63:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl24
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = fn.on - fn.hkdj("hkqr", hkdt(int ), (int)95)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == fn.hkdj("hkqs", hkdg(int ), (int)247)) break;
                    v7 /* !! */  = (long)fn.hkdj("hkqt", hkdg(int ), (int)248);
                }
                var2_5 = var1_1.getDrawContext();
                if (var6_4 || var6_4) ** GOTO lbl24
                v8 /* !! */  = fn.on;
                if (true) ** GOTO lbl75
                block62: while (true) {
                    v8 /* !! */  = (long)(v9 - fn.hkdj("hkqu", hkdt(int ), (int)96));
lbl75:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 554421918: {
                            break block62;
                        }
                        case 749156409: {
                            v9 = fn.hkdj("hkqv", hkdt(int ), (int)97);
                            continue block62;
                        }
                        case 1491436684: {
                            v9 = fn.hkdj("hkqw", hkdt(int ), (int)98);
                            continue block62;
                        }
                    }
                    break;
                }
                v10 = this.getProgressPercent();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = fn.on - fn.hkdj("hkqx", hkdt(int ), (int)99)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fn.hkdj("hkqy", hkdg(int ), (int)249)) break;
                    v11 /* !! */  = (long)fn.hkdj("hkqz", hkdg(int ), (int)250);
                }
                var3_6 = "\u0412\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0434\u0432\u0438\u0433\u0430\u0442\u044c\u0441\u044f \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0438, \u043f\u0440\u043e\u0433\u0440\u0435\u0441\u0441: " + v10 + "%";
                if (var6_4 || var6_4) ** GOTO lbl24
                v12 /* !! */  = fn.on;
                if (true) ** GOTO lbl96
                block64: while (true) {
                    v12 /* !! */  = (long)(v13 - fn.hkdj("hkra", hkdt(int ), (int)100));
lbl96:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1344360836: {
                            v13 = fn.hkdj("hkrb", hkdt(int ), (int)101);
                            continue block64;
                        }
                        case 554421918: {
                            break block64;
                        }
                        case 710881008: {
                            v13 = fn.hkdj("hkrc", hkdt(int ), (int)102);
                            continue block64;
                        }
                        case 863799040: {
                            v13 = fn.hkdj("hkrd", hkdt(int ), (int)103);
                            continue block64;
                        }
                    }
                    break;
                }
                v14 = var2_5.method_51421();
                v15 /* !! */  = fn.on;
                if (true) ** GOTO lbl113
                block65: while (true) {
                    v15 /* !! */  = (long)(v16 - fn.hkdj("hkre", hkdt(int ), (int)104));
lbl113:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1024518168: {
                            v16 = fn.hkdj("hkrf", hkdt(int ), (int)105);
                            continue block65;
                        }
                        case 554421918: {
                            break block65;
                        }
                        case 1911883607: {
                            v16 = fn.hkdj("hkrg", hkdt(int ), (int)106);
                            continue block65;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = fn.on - fn.hkdj("hkrh", hkdt(int ), (int)107)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == fn.hkdj("hkri", hkdg(int ), (int)251)) break;
                    v17 /* !! */  = (long)fn.hkdj("hkrj", hkdg(int ), (int)252);
                }
                v18 = fn.mc.field_1772;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = fn.on - fn.hkdj("hkrk", hkdt(int ), (int)108)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == fn.hkdj("hkrl", hkdg(int ), (int)253)) break;
                    v19 /* !! */  = (long)fn.hkdj("hkrm", hkdg(int ), (int)254);
                }
                var4_7 = (v14 - v18.method_1727(var3_6)) / fn.hkdj("hkrn", hkdg(int ), (int)255);
                if (var6_4 || var6_4) ** GOTO lbl24
                v20 /* !! */  = fn.on;
                if (true) ** GOTO lbl139
                block68: while (true) {
                    v20 /* !! */  = (long)(v21 - fn.hkdj("hkro", hkdt(int ), (int)109));
lbl139:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -937250980: {
                            v21 = fn.hkdj("hkrp", hkdt(int ), (int)110);
                            continue block68;
                        }
                        case -706016466: {
                            v21 = fn.hkdj("hkrq", hkdt(int ), (int)111);
                            continue block68;
                        }
                        case 554421918: {
                            break block68;
                        }
                    }
                    break;
                }
                var5_8 = var2_5.method_51443() / fn.hkdj("hkrr", hkdg(int ), (int)256) + fn.hkdj("hkrs", hkdg(int ), (int)257);
                if (var6_4 || var6_4) ** GOTO lbl24
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_8 = fn.on - fn.hkdj("hkrt", hkdt(int ), (int)112)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == fn.hkdj("hkru", hkdg(int ), (int)258)) break;
                    v22 /* !! */  = (long)fn.hkdj("hkrv", hkdg(int ), (int)259);
                }
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_9 = fn.on - fn.hkdj("hkrw", hkdt(int ), (int)113)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == fn.hkdj("hkrx", hkdg(int ), (int)260)) break;
                    v23 /* !! */  = (long)fn.hkdj("hkry", hkdg(int ), (int)261);
                }
                v24 = fn.mc.field_1772;
                v25 = fn.hkdj("hkrz", hkdg(int ), (int)262);
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_10 = fn.on - fn.hkdj("hksa", hkdt(int ), (int)114)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == fn.hkdj("hksb", hkdg(int ), (int)263)) break;
                    v26 /* !! */  = (long)fn.hkdj("hksc", hkdg(int ), (int)264);
                }
                var2_5.method_25303(v24, var3_6, var4_7, var5_8, (int)v25);
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_3 /* !! */  = (int)fn.hkdj("hksd", hkdg(int ), (int)265);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 1: {
                do {
                    var7_3 /* !! */  = (int)fn.hkdj("hkse", hkdg(int ), (int)266);
                } while (!var8_2);
                throw null;
            }
lbl181:
            // 3 sources

            case 2: {
                var7_3 /* !! */  = (int)fn.hkdj("hksf", hkdg(int ), (int)267);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl186:
            // 3 sources

            case 3: {
                var7_3 /* !! */  = (int)fn.hkdj("hksg", hkdg(int ), (int)268);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl191:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)fn.hkdj("hksh", hkdg(int ), (int)269);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl196:
            // 2 sources

            case 5: {
                var7_3 /* !! */  = (int)fn.hkdj("hksi", hkdg(int ), (int)270);
                if (!var8_2) ** GOTO lbl181
                throw null;
            }
lbl200:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)fn.hkdj("hksj", hkdg(int ), (int)271);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl205:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)fn.hkdj("hksk", hkdg(int ), (int)272);
                if (var8_2) {
                    throw null;
                }
            }
lbl209:
            // 6 sources

            case 8: {
                var7_3 /* !! */  = (int)fn.hkdj("hksl", hkdg(int ), (int)273);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl214:
            // 3 sources

            case 9: {
                var7_3 /* !! */  = (int)fn.hkdj("hksm", hkdg(int ), (int)274);
                if (!var8_2) ** GOTO lbl186
                throw null;
            }
            case 10: {
                var7_3 /* !! */  = (int)fn.hkdj("hksn", hkdg(int ), (int)275);
                if (!var8_2) ** GOTO lbl191
                throw null;
            }
lbl222:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)fn.hkdj("hkso", hkdg(int ), (int)276);
                if (!var8_2) ** GOTO lbl186
                throw null;
            }
            case 12: {
                var7_3 /* !! */  = (int)fn.hkdj("hksp", hkdg(int ), (int)277);
                if (!var8_2) ** GOTO lbl205
                throw null;
            }
            case 13: {
                var7_3 /* !! */  = (int)fn.hkdj("hksq", hkdg(int ), (int)278);
                if (!var8_2) ** GOTO lbl214
                throw null;
            }
            case 14: {
                var7_3 /* !! */  = (int)fn.hkdj("hksr", hkdg(int ), (int)279);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 15: {
                var7_3 /* !! */  = (int)fn.hkdj("hkss", hkdg(int ), (int)280);
                if (var8_2) {
                    throw null;
                }
            }
            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)fn.hkdj("hkst", hkdg(int ), (int)281);
                    if (!var8_2) ** GOTO lbl200
                    throw null;
                }
            }
            case 17: {
                var7_3 /* !! */  = (int)fn.hkdj("hksu", hkdg(int ), (int)282);
                if (!var8_2) ** GOTO lbl209
                throw null;
            }
lbl252:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)fn.hkdj("hksv", hkdg(int ), (int)283);
                if (!var8_2) ** GOTO lbl196
                throw null;
            }
lbl256:
            // 3 sources

            case 19: {
                var7_3 /* !! */  = (int)fn.hkdj("hksw", hkdg(int ), (int)284);
                if (!var8_2) ** GOTO lbl181
                throw null;
            }
            case 20: 
        }
        var7_3 /* !! */  = (int)fn.hkdj("hksx", hkdg(int ), (int)285);
        ** while (!var8_2)
lbl263:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void startPass(int var1_1, Set<String> var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hkyd", hkdt(int ), (int)178)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fn.hkdj("hkye", hkdg(int ), (int)358)) break;
            v0 /* !! */  = (long)fn.hkdj("hkyf", hkdg(int ), (int)359);
        }
        var5_3 = fn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hkyg", hkdt(int ), (int)179)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fn.hkdj("hkyh", hkdg(int ), (int)360)) break;
            v1 /* !! */  = (long)fn.hkdj("hkyi", hkdg(int ), (int)361);
        }
        var4_4 /* !! */  = fn.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hkyj", hkdt(int ), (int)180)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == fn.hkdj("hkyk", hkdg(int ), (int)362)) break;
            v2 /* !! */  = (long)fn.hkdj("hkyl", hkdg(int ), (int)363);
        }
        var3_5 = fn.a;
        if (!var5_3) ** GOTO lbl25
        throw null;
lbl-1000:
        // 5 sources

        {
            if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
            switch (var4_4 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl25:
                // 1 sources

                if (var3_5 || var3_5) ** GOTO lbl-1000
                v3 /* !! */  = fn.on;
                if (true) ** GOTO lbl30
                block33: while (true) {
                    v3 /* !! */  = (long)(fn.hkdj("hkyn", hkdt(int ), (int)182) - fn.hkdj("hkym", hkdt(int ), (int)181));
lbl30:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1422909255: {
                            continue block33;
                        }
                        case 554421918: {
                            break block33;
                        }
                    }
                    break;
                }
                this.pass = var1_1;
                if (var3_5 || var3_5) ** GOTO lbl-1000
                v4 = fn.hkdj("hkyo", hkdg(int ), (int)364);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hkyp", hkdt(int ), (int)183)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fn.hkdj("hkyq", hkdg(int ), (int)365)) break;
                    v5 /* !! */  = (long)fn.hkdj("hkyr", hkdg(int ), (int)366);
                }
                this.currentIndex = (int)v4;
                if (var3_5 || var3_5) ** GOTO lbl-1000
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_4 = fn.on - fn.hkdj("hkys", hkdt(int ), (int)184)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fn.hkdj("hkyt", hkdg(int ), (int)367)) break;
                    v6 /* !! */  = (long)fn.hkdj("hkyu", hkdg(int ), (int)368);
                }
                v7 /* !! */  = fn.on;
                if (true) ** GOTO lbl54
                block36: while (true) {
                    v7 /* !! */  = (long)(v8 - fn.hkdj("hkyv", hkdt(int ), (int)185));
lbl54:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -405815550: {
                            v8 = fn.hkdj("hkyw", hkdt(int ), (int)186);
                            continue block36;
                        }
                        case 554421918: {
                            break block36;
                        }
                        case 1638442742: {
                            v8 = fn.hkdj("hkyx", hkdt(int ), (int)187);
                            continue block36;
                        }
                    }
                    break;
                }
                this.queue.clear();
                if (var3_5 || var3_5) ** GOTO lbl-1000
                v9 /* !! */  = fn.on;
                if (true) ** GOTO lbl69
                block37: while (true) {
                    v9 /* !! */  = (long)(v10 - fn.hkdj("hkyy", hkdt(int ), (int)188));
lbl69:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1667276903: {
                            v10 = fn.hkdj("hkyz", hkdt(int ), (int)189);
                            continue block37;
                        }
                        case -36484467: {
                            v10 = fn.hkdj("hkza", hkdt(int ), (int)190);
                            continue block37;
                        }
                        case 554421918: {
                            break block37;
                        }
                        case 1448269529: {
                            v10 = fn.hkdj("hkzb", hkdt(int ), (int)191);
                            continue block37;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = fn.on - fn.hkdj("hkzc", hkdt(int ), (int)192)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == fn.hkdj("hkzd", hkdg(int ), (int)369)) break;
                    v11 /* !! */  = (long)fn.hkdj("hkze", hkdg(int ), (int)370);
                }
                this.queue.addAll(var2_2);
                if (var3_5 || var3_5) continue block32;
                return;
                case 0: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzf", hkdg(int ), (int)371);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl99
                }
lbl94:
                // 2 sources

                case 1: {
                    do {
                        var4_4 /* !! */  = (int)fn.hkdj("hkzg", hkdg(int ), (int)372);
                    } while (!var5_3);
                    throw null;
                }
lbl99:
                // 3 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_4 /* !! */  = (int)fn.hkdj("hkzh", hkdg(int ), (int)373);
                        if (var5_3) {
                            throw null;
                        }
                        ** GOTO lbl119
                        break;
                    }
                }
                case 3: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzi", hkdg(int ), (int)374);
                    if (!var5_3) break block32;
                    throw null;
                }
                case 4: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzj", hkdg(int ), (int)375);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
lbl114:
                // 2 sources

                case 5: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzk", hkdg(int ), (int)376);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl123
                }
lbl119:
                // 2 sources

                case 6: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzl", hkdg(int ), (int)377);
                    if (!var5_3) ** GOTO lbl114
                    throw null;
                }
lbl123:
                // 2 sources

                case 7: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzm", hkdg(int ), (int)378);
                    if (!var5_3) ** GOTO lbl94
                    throw null;
                }
                case 8: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzn", hkdg(int ), (int)379);
                    if (var5_3) {
                        throw null;
                    }
                    ** GOTO lbl136
                }
                case 9: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzo", hkdg(int ), (int)380);
                    if (var5_3) {
                        throw null;
                    }
                }
lbl136:
                // 5 sources

                case 10: {
                    var4_4 /* !! */  = (int)fn.hkdj("hkzp", hkdg(int ), (int)381);
                    if (!var5_3) ** GOTO lbl99
                    throw null;
                }
                case 11: 
            }
        }
        var4_4 /* !! */  = (int)fn.hkdj("hkzq", hkdg(int ), (int)382);
        ** while (!var5_3)
lbl143:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hllc() {
        fn.hkdi[0] = -1676065456;
        fn.hkdi[1] = 1739374141;
        fn.hkdi[2] = 1006684325;
        fn.hkdi[3] = 1455914601;
        fn.hkdi[4] = -1802674789;
        fn.hkdi[5] = 721174900;
        fn.hkdi[6] = -878988740;
        fn.hkdi[7] = 1696617707;
        fn.hkdi[8] = -137835366;
        fn.hkdi[9] = 2054125496;
        fn.hkdi[10] = 743568273;
        fn.hkdi[11] = -178237721;
        fn.hkdi[12] = 2136506850;
        fn.hkdi[13] = -599753411;
        fn.hkdi[14] = 788720594;
        fn.hkdi[15] = -78468355;
        fn.hkdi[16] = -590179455;
        fn.hkdi[17] = -1026343226;
        fn.hkdi[18] = -1789305395;
        fn.hkdi[19] = 121265186;
        fn.hkdi[20] = -787743238;
        fn.hkdi[21] = 1191706102;
        fn.hkdi[22] = 1691437075;
        fn.hkdi[23] = 873926995;
        fn.hkdi[24] = -806987923;
        fn.hkdi[25] = -1741285058;
        fn.hkdi[26] = 836284403;
        fn.hkdi[27] = 1232803554;
        fn.hkdi[28] = -757122672;
        fn.hkdi[29] = -612114564;
        fn.hkdi[30] = 2103589412;
        fn.hkdi[31] = -350182663;
        fn.hkdi[32] = 648999468;
        fn.hkdi[33] = 1039145936;
        fn.hkdi[34] = 1887777325;
        fn.hkdi[35] = -2108250319;
        fn.hkdi[36] = 365574978;
        fn.hkdi[37] = 560588749;
        fn.hkdi[38] = 728251588;
        fn.hkdi[39] = -1560956777;
        fn.hkdi[40] = -1706602380;
        fn.hkdi[41] = 74613963;
        fn.hkdi[42] = 1308114696;
        fn.hkdi[43] = -167420012;
        fn.hkdi[44] = 1553511972;
        fn.hkdi[45] = -269385272;
        fn.hkdi[46] = 798290613;
        fn.hkdi[47] = 2003484669;
        fn.hkdi[48] = -89494005;
        fn.hkdi[49] = -1839163979;
        fn.hkdi[50] = 495958315;
        fn.hkdi[51] = 291812996;
        fn.hkdi[52] = 1913303335;
        fn.hkdi[53] = 254018646;
        fn.hkdi[54] = -928814971;
        fn.hkdi[55] = 1094601276;
        fn.hkdi[56] = 437850341;
        fn.hkdi[57] = -547840908;
        fn.hkdi[58] = 1546418808;
        fn.hkdi[59] = 1153756639;
        fn.hkdi[60] = 1779161808;
        fn.hkdi[61] = 252454326;
        fn.hkdi[62] = -511916836;
        fn.hkdi[63] = 1031205194;
        fn.hkdi[64] = -1782023902;
        fn.hkdi[65] = 1252035641;
        fn.hkdi[66] = 1027185533;
        fn.hkdi[67] = 596016904;
        fn.hkdi[68] = -666012125;
        fn.hkdi[69] = 1107240848;
        fn.hkdi[70] = -889273274;
        fn.hkdi[71] = -1439508243;
        fn.hkdi[72] = -637474111;
        fn.hkdi[73] = -1326328614;
        fn.hkdi[74] = 1823692906;
        fn.hkdi[75] = 985554836;
        fn.hkdi[76] = -666947724;
        fn.hkdi[77] = -94485934;
        fn.hkdi[78] = 613467671;
        fn.hkdi[79] = 592822127;
        fn.hkdi[80] = 1257623597;
        fn.hkdi[81] = -1504701365;
        fn.hkdi[82] = -1852038665;
        fn.hkdi[83] = 1985559717;
        fn.hkdi[84] = 1068697904;
        fn.hkdi[85] = -673985766;
        fn.hkdi[86] = 900387171;
        fn.hkdi[87] = -853767897;
        fn.hkdi[88] = 1132046073;
        fn.hkdi[89] = -1945971517;
        fn.hkdi[90] = -911797959;
        fn.hkdi[91] = -716479911;
        fn.hkdi[92] = -1483675460;
        fn.hkdi[93] = -54440461;
        fn.hkdi[94] = -1476313294;
        fn.hkdi[95] = -1273109306;
        fn.hkdi[96] = -465310095;
        fn.hkdi[97] = 2073417867;
        fn.hkdi[98] = 520144914;
        fn.hkdi[99] = 2025893956;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block137: {
            block135: {
                block136: {
                    block134: {
                        block133: {
                            var4_2 = fn.c;
                            var3_3 /* !! */  = fn.b;
                            var2_4 = fn.a;
                            if (var4_2) {
                                throw null;
lbl6:
                                // 37 sources

                                return;
                            }
                            if (var2_4 || var2_4) ** GOTO lbl6
                            if (fn.mc.field_1724 == null) break block133;
                            if (var2_4) ** GOTO lbl6
                            if (fn.mc.field_1687 == null) break block133;
                            if (var2_4) ** GOTO lbl6
                            if (fn.mc.method_1562() != null) break block134;
                            if (var2_4) ** GOTO lbl6
                        }
                        if (var2_4 || var2_4) ** GOTO lbl6
                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl6
                    if (this.isSupportedServer()) break block135;
                    if (var2_4 || var2_4) ** GOTO lbl6
                    if (this.invalidServerReported) break block136;
                    if (var2_4 || var2_4) ** GOTO lbl6
                    this.invalidServerReported = fn.hkdj("hkim", hkdg(int ), (int)72);
                    if (var2_4 || var2_4) ** GOTO lbl6
                    pp.brandmessage("StaffExploit \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u0442\u043e\u043b\u044c\u043a\u043e \u043d\u0430 ReallyWorld");
                    if (var2_4) ** GOTO lbl6
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                this.setState((boolean)fn.hkdj("hkin", hkdg(int ), (int)73));
                if (var2_4 || var2_4) ** GOTO lbl6
                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            if (!this.blocked) break block137;
            if (var2_4 || var2_4) ** GOTO lbl6
            fn.mc.field_1724.method_18799(class_243.field_1353);
            if (var2_4) ** GOTO lbl6
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (!this.waitingResponse) ** GOTO lbl53
        if (var2_4 || var2_4) ** GOTO lbl6
        if (!this.timer.hasTimeElapsed((long)fn.hkdj("hkio", hkdt(int ), (int)57))) ** GOTO lbl51
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl6
                this.advance();
                if (var2_4) ** GOTO lbl6
lbl51:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                return;
            }
lbl53:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.currentIndex < this.queue.size()) ** GOTO lbl74
            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.pass != fn.hkdj("hkip", hkdg(int ), (int)74)) ** GOTO lbl69
            if (var2_4 || var2_4) ** GOTO lbl6
            this.startPass((int)fn.hkdj("hkiq", hkdg(int ), (int)75), this.successfulReports);
            if (var2_4 || var2_4) ** GOTO lbl6
            this.totalItems = fn.STAFF_NAMES.size() + this.queue.size();
            if (var2_4 || var2_4) ** GOTO lbl6
            this.delayMs = (long)fn.hkdj("hkir", hkdt(int ), (int)58);
            if (var2_4 || var2_4) ** GOTO lbl6
            this.timer.reset();
            if (var2_4) ** GOTO lbl6
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl72
lbl69:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            this.finishScan();
            if (var2_4) ** GOTO lbl6
lbl72:
            // 2 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            return;
lbl74:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.timer.hasTimeElapsed(this.delayMs)) ** GOTO lbl78
            if (var2_4) ** GOTO lbl6
            return;
lbl78:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl6
            this.sendCheck(this.queue.get(this.currentIndex));
            if (var2_4 || var2_4) ** GOTO lbl6
            this.waitingResponse = fn.hkdj("hkis", hkdg(int ), (int)76);
            if (var2_4 || var2_4) ** GOTO lbl6
            this.timer.reset();
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
            case 0: {
                var3_3 /* !! */  = (int)fn.hkdj("hkit", hkdg(int ), (int)77);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 1: {
                var3_3 /* !! */  = (int)fn.hkdj("hkiu", hkdg(int ), (int)78);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 2: {
                var3_3 /* !! */  = (int)fn.hkdj("hkiv", hkdg(int ), (int)79);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
            case 3: {
                var3_3 /* !! */  = (int)fn.hkdj("hkiw", hkdg(int ), (int)80);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 4: {
                var3_3 /* !! */  = (int)fn.hkdj("hkix", hkdg(int ), (int)81);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
            case 5: {
                var3_3 /* !! */  = (int)fn.hkdj("hkiy", hkdg(int ), (int)82);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl117:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)fn.hkdj("hkiz", hkdg(int ), (int)83);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl122:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)fn.hkdj("hkja", hkdg(int ), (int)84);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl127:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjb", hkdg(int ), (int)85);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl295
            }
lbl132:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjc", hkdg(int ), (int)86);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl371
            }
lbl137:
            // 2 sources

            case 10: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjd", hkdg(int ), (int)87);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 11: {
                var3_3 /* !! */  = (int)fn.hkdj("hkje", hkdg(int ), (int)88);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl147:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjf", hkdg(int ), (int)89);
                if (!var4_2) ** GOTO lbl122
                throw null;
            }
lbl151:
            // 3 sources

            case 13: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjg", hkdg(int ), (int)90);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl156:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjh", hkdg(int ), (int)91);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl242
            }
lbl161:
            // 3 sources

            case 15: {
                var3_3 /* !! */  = (int)fn.hkdj("hkji", hkdg(int ), (int)92);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl359
            }
            case 16: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjj", hkdg(int ), (int)93);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl171:
            // 4 sources

            case 17: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjk", hkdg(int ), (int)94);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl176:
            // 4 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fn.hkdj("hkjl", hkdg(int ), (int)95);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl388
                    break;
                }
            }
            case 19: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjm", hkdg(int ), (int)96);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl187:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjn", hkdg(int ), (int)97);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl224
            }
lbl192:
            // 3 sources

            case 21: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjo", hkdg(int ), (int)98);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl197:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjp", hkdg(int ), (int)99);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl375
            }
            case 23: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjq", hkdg(int ), (int)100);
                if (!var4_2) ** GOTO lbl192
                throw null;
            }
lbl206:
            // 2 sources

            case 24: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjr", hkdg(int ), (int)101);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl211:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjs", hkdg(int ), (int)102);
                if (!var4_2) ** GOTO lbl192
                throw null;
            }
            case 26: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjt", hkdg(int ), (int)103);
                if (!var4_2) ** GOTO lbl176
                throw null;
            }
            case 27: {
                var3_3 /* !! */  = (int)fn.hkdj("hkju", hkdg(int ), (int)104);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl321
            }
lbl224:
            // 2 sources

            case 28: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjv", hkdg(int ), (int)105);
                if (!var4_2) ** GOTO lbl147
                throw null;
            }
lbl228:
            // 2 sources

            case 29: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjw", hkdg(int ), (int)106);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
            case 30: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjx", hkdg(int ), (int)107);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl304
            }
lbl237:
            // 2 sources

            case 31: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjy", hkdg(int ), (int)108);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl242:
            // 3 sources

            case 32: {
                var3_3 /* !! */  = (int)fn.hkdj("hkjz", hkdg(int ), (int)109);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl247:
            // 2 sources

            case 33: {
                var3_3 /* !! */  = (int)fn.hkdj("hkka", hkdg(int ), (int)110);
                if (!var4_2) ** GOTO lbl151
                throw null;
            }
lbl251:
            // 3 sources

            case 34: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkb", hkdg(int ), (int)111);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl256:
            // 3 sources

            case 35: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkc", hkdg(int ), (int)112);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl333
            }
lbl261:
            // 2 sources

            case 36: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkd", hkdg(int ), (int)113);
                if (!var4_2) ** GOTO lbl171
                throw null;
            }
lbl265:
            // 2 sources

            case 37: {
                var3_3 /* !! */  = (int)fn.hkdj("hkke", hkdg(int ), (int)114);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
lbl269:
            // 2 sources

            case 38: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkf", hkdg(int ), (int)115);
                if (!var4_2) ** GOTO lbl256
                throw null;
            }
lbl273:
            // 2 sources

            case 39: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkg", hkdg(int ), (int)116);
                if (!var4_2) ** GOTO lbl247
                throw null;
            }
            case 40: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkh", hkdg(int ), (int)117);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl282:
            // 2 sources

            case 41: {
                var3_3 /* !! */  = (int)fn.hkdj("hkki", hkdg(int ), (int)118);
                if (!var4_2) ** GOTO lbl242
                throw null;
            }
lbl286:
            // 3 sources

            case 42: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkj", hkdg(int ), (int)119);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl329
            }
lbl291:
            // 2 sources

            case 43: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkk", hkdg(int ), (int)120);
                if (!var4_2) ** GOTO lbl117
                throw null;
            }
lbl295:
            // 3 sources

            case 44: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkl", hkdg(int ), (int)121);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl355
            }
            case 45: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkm", hkdg(int ), (int)122);
                if (!var4_2) ** GOTO lbl137
                throw null;
            }
lbl304:
            // 2 sources

            case 46: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkn", hkdg(int ), (int)123);
                if (!var4_2) ** GOTO lbl171
                throw null;
            }
            case 47: {
                var3_3 /* !! */  = (int)fn.hkdj("hkko", hkdg(int ), (int)124);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl388
            }
lbl313:
            // 2 sources

            case 48: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkp", hkdg(int ), (int)125);
                if (!var4_2) ** GOTO lbl197
                throw null;
            }
            case 49: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkq", hkdg(int ), (int)126);
                if (!var4_2) ** GOTO lbl313
                throw null;
            }
lbl321:
            // 2 sources

            case 50: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkr", hkdg(int ), (int)127);
                if (!var4_2) ** GOTO lbl291
                throw null;
            }
            case 51: {
                var3_3 /* !! */  = (int)fn.hkdj("hkks", hkdg(int ), (int)128);
                if (!var4_2) ** GOTO lbl151
                throw null;
            }
lbl329:
            // 3 sources

            case 52: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkt", hkdg(int ), (int)129);
                if (!var4_2) ** GOTO lbl211
                throw null;
            }
lbl333:
            // 2 sources

            case 53: {
                var3_3 /* !! */  = (int)fn.hkdj("hkku", hkdg(int ), (int)130);
                if (!var4_2) ** GOTO lbl161
                throw null;
            }
lbl337:
            // 2 sources

            case 54: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkv", hkdg(int ), (int)131);
                if (!var4_2) ** GOTO lbl295
                throw null;
            }
            case 55: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkw", hkdg(int ), (int)132);
                if (!var4_2) ** GOTO lbl228
                throw null;
            }
            case 56: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkx", hkdg(int ), (int)133);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl367
            }
lbl350:
            // 2 sources

            case 57: {
                var3_3 /* !! */  = (int)fn.hkdj("hkky", hkdg(int ), (int)134);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl380
            }
lbl355:
            // 2 sources

            case 58: {
                var3_3 /* !! */  = (int)fn.hkdj("hkkz", hkdg(int ), (int)135);
                if (!var4_2) ** GOTO lbl337
                throw null;
            }
lbl359:
            // 2 sources

            case 59: {
                var3_3 /* !! */  = (int)fn.hkdj("hkla", hkdg(int ), (int)136);
                if (!var4_2) ** GOTO lbl176
                throw null;
            }
lbl363:
            // 3 sources

            case 60: {
                var3_3 /* !! */  = (int)fn.hkdj("hklb", hkdg(int ), (int)137);
                if (!var4_2) ** GOTO lbl350
                throw null;
            }
lbl367:
            // 4 sources

            case 61: {
                var3_3 /* !! */  = (int)fn.hkdj("hklc", hkdg(int ), (int)138);
                if (!var4_2) ** GOTO lbl161
                throw null;
            }
lbl371:
            // 2 sources

            case 62: {
                var3_3 /* !! */  = (int)fn.hkdj("hkld", hkdg(int ), (int)139);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
lbl375:
            // 2 sources

            case 63: {
                var3_3 /* !! */  = (int)fn.hkdj("hkle", hkdg(int ), (int)140);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl384
            }
lbl380:
            // 2 sources

            case 64: {
                var3_3 /* !! */  = (int)fn.hkdj("hklf", hkdg(int ), (int)141);
                if (!var4_2) ** GOTO lbl127
                throw null;
            }
lbl384:
            // 2 sources

            case 65: {
                var3_3 /* !! */  = (int)fn.hkdj("hklg", hkdg(int ), (int)142);
                if (!var4_2) break;
                throw null;
            }
lbl388:
            // 3 sources

            case 66: {
                var3_3 /* !! */  = (int)fn.hkdj("hklh", hkdg(int ), (int)143);
                if (!var4_2) ** GOTO lbl237
                throw null;
            }
            case 67: 
        }
        var3_3 /* !! */  = (int)fn.hkdj("hkli", hkdg(int ), (int)144);
        ** while (!var4_2)
lbl395:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int hkdg(int n2) {
        return hkdh[n2] ^ hkdi[n2];
    }

    private static /* synthetic */ void hlnd() {
        fn.hkdu[200] = -7456365647892993301L;
        fn.hkdu[201] = 5506591677627291297L;
        fn.hkdu[202] = -9195285597375378831L;
        fn.hkdu[203] = 669799360295901996L;
        fn.hkdu[204] = 8917888401362590934L;
        fn.hkdu[205] = 3743668976441195113L;
        fn.hkdu[206] = -3999763615272609540L;
        fn.hkdu[207] = -9018267815950803277L;
        fn.hkdu[208] = -9186970270602174882L;
        fn.hkdu[209] = -2732498208226781890L;
        fn.hkdu[210] = -2204997380502116856L;
        fn.hkdu[211] = -8891742601571157016L;
        fn.hkdu[212] = -3048276729097882097L;
        fn.hkdu[213] = 5307421980534253988L;
        fn.hkdu[214] = 2641828407198036131L;
        fn.hkdu[215] = 1388419720384353694L;
        fn.hkdu[216] = -234874191317494216L;
        fn.hkdu[217] = -1271747915655445985L;
        fn.hkdu[218] = -6381891537030946396L;
        fn.hkdu[219] = -4464521058059615798L;
        fn.hkdu[220] = -2176154295856882340L;
        fn.hkdu[221] = 8571580379940420190L;
        fn.hkdu[222] = -620146633805501127L;
        fn.hkdu[223] = 7431632541738678092L;
        fn.hkdu[224] = -5405396884688345593L;
        fn.hkdu[225] = -5724381184234444143L;
        fn.hkdu[226] = 4774893868781351375L;
        fn.hkdu[227] = 1470025668243506166L;
        fn.hkdu[228] = -4863984093430070537L;
        fn.hkdu[229] = -5799846610623103644L;
        fn.hkdu[230] = -8896214686914770233L;
        fn.hkdu[231] = -6801249358704183469L;
        fn.hkdu[232] = -6043779579557032890L;
        fn.hkdu[233] = 7779190326861074807L;
        fn.hkdu[234] = 2467883171958858062L;
        fn.hkdu[235] = -3857177348615660335L;
        fn.hkdu[236] = -2074810604544564916L;
        fn.hkdu[237] = 53115019298905922L;
        fn.hkdu[238] = -2121068835828120563L;
        fn.hkdu[239] = 4535633811927879597L;
        fn.hkdu[240] = 9015550546613518146L;
        fn.hkdu[241] = 2843773348530371386L;
        fn.hkdu[242] = -7841396536420969346L;
        fn.hkdu[243] = -1416720810494039176L;
        fn.hkdu[244] = 7384329641975920167L;
        fn.hkdu[245] = -7471024110552417167L;
        fn.hkdu[246] = 4333312562849195391L;
        fn.hkdu[247] = 5238781643190146708L;
        fn.hkdu[248] = 331404901749734078L;
        fn.hkdu[249] = -2478626060125000735L;
        fn.hkdu[250] = 2125367422405105059L;
        fn.hkdu[251] = -2978861643529446249L;
        fn.hkdu[252] = 3362247682195983930L;
        fn.hkdu[253] = 3492232234183605616L;
        fn.hkdu[254] = 8470330483556951418L;
        fn.hkdu[255] = -2102233654405293780L;
        fn.hkdu[256] = -2380078282326109658L;
        fn.hkdu[257] = 5664010421069166225L;
        fn.hkdu[258] = -774789238970176515L;
        fn.hkdu[259] = 3828738235402296087L;
        fn.hkdu[260] = 7408518307326169354L;
        fn.hkdu[261] = 3784159349848434756L;
        fn.hkdu[262] = -1449267301809997270L;
        fn.hkdu[263] = 946635311305529718L;
        fn.hkdu[264] = -2133303913287662143L;
        fn.hkdu[265] = -4707607785502045331L;
        fn.hkdu[266] = -98909925539351130L;
        fn.hkdu[267] = 5216634757483219529L;
        fn.hkdu[268] = 3056948040229100955L;
        fn.hkdu[269] = -2531821315405448280L;
        fn.hkdu[270] = 1201565818447619254L;
        fn.hkdu[271] = -7810225802012287948L;
        fn.hkdu[272] = -4541161832489519670L;
        fn.hkdu[273] = 3273703280820471349L;
        fn.hkdu[274] = 6059306814915078337L;
        fn.hkdu[275] = -6008858069671007751L;
        fn.hkdu[276] = -1160263913794463870L;
        fn.hkdu[277] = -4147280568121307878L;
        fn.hkdu[278] = 8352975119377173919L;
        fn.hkdu[279] = -2613248998319447451L;
        fn.hkdu[280] = -4499150014210669666L;
        fn.hkdu[281] = -3500242126251996246L;
        fn.hkdu[282] = -2946197273581725353L;
    }

    private static /* synthetic */ void hlla() {
        fn.hkdh[500] = 877287675;
        fn.hkdh[501] = 1768477498;
        fn.hkdh[502] = 873485868;
        fn.hkdh[503] = 1878898979;
        fn.hkdh[504] = 1361993097;
        fn.hkdh[505] = -630055848;
        fn.hkdh[506] = 0xA66565A;
        fn.hkdh[507] = -1191087588;
        fn.hkdh[508] = 978390155;
        fn.hkdh[509] = -845284121;
        fn.hkdh[510] = 556815830;
        fn.hkdh[511] = 1891091280;
        fn.hkdh[512] = 1377671369;
        fn.hkdh[513] = 538559950;
        fn.hkdh[514] = -1378296479;
        fn.hkdh[515] = -1094712110;
        fn.hkdh[516] = 94404383;
        fn.hkdh[517] = 825217038;
    }

    private static /* synthetic */ void hloe() {
        fn.hkdv[200] = 3955935312400594566L;
        fn.hkdv[201] = 8163692647890395878L;
        fn.hkdv[202] = -6145245640886111861L;
        fn.hkdv[203] = -971261769801279686L;
        fn.hkdv[204] = 1568441739344202243L;
        fn.hkdv[205] = 204977396453794768L;
        fn.hkdv[206] = 2654663929754659596L;
        fn.hkdv[207] = 6351560404533362095L;
        fn.hkdv[208] = -4287737202116185401L;
        fn.hkdv[209] = -2504703123009520248L;
        fn.hkdv[210] = -2836375974660664231L;
        fn.hkdv[211] = 8433243061854711304L;
        fn.hkdv[212] = -4774626218400038547L;
        fn.hkdv[213] = 5640435089586613664L;
        fn.hkdv[214] = -81271251113716401L;
        fn.hkdv[215] = -7629748440951851640L;
        fn.hkdv[216] = -4387915124783385830L;
        fn.hkdv[217] = -1445426867342869275L;
        fn.hkdv[218] = 6338467152107764154L;
        fn.hkdv[219] = -6038647419371444597L;
        fn.hkdv[220] = 8421174154014399031L;
        fn.hkdv[221] = -3172185828369657309L;
        fn.hkdv[222] = -4504657120513659338L;
        fn.hkdv[223] = 6992146630610235506L;
        fn.hkdv[224] = -2292112973386322627L;
        fn.hkdv[225] = 5780297718836049057L;
        fn.hkdv[226] = -2227193991057298939L;
        fn.hkdv[227] = -6688391700778617771L;
        fn.hkdv[228] = -6144843769213362540L;
        fn.hkdv[229] = 747401622327268567L;
        fn.hkdv[230] = -3603521964838069753L;
        fn.hkdv[231] = -2767297871048654928L;
        fn.hkdv[232] = 3674677370392104920L;
        fn.hkdv[233] = 1528600817600794577L;
        fn.hkdv[234] = 8382303149026637464L;
        fn.hkdv[235] = 3679526913566427238L;
        fn.hkdv[236] = 4553859683842917393L;
        fn.hkdv[237] = -1968198887754451186L;
        fn.hkdv[238] = 7883427503269629699L;
        fn.hkdv[239] = 4791702593304966552L;
        fn.hkdv[240] = 1076067511597095881L;
        fn.hkdv[241] = 240521418430142215L;
        fn.hkdv[242] = -8593469510956679418L;
        fn.hkdv[243] = 5450369270031714480L;
        fn.hkdv[244] = -459432773309301173L;
        fn.hkdv[245] = -6655249401108855715L;
        fn.hkdv[246] = -3159572592112076270L;
        fn.hkdv[247] = -5802453214116391630L;
        fn.hkdv[248] = -1505439628541817855L;
        fn.hkdv[249] = 4102334524646515932L;
        fn.hkdv[250] = 6888388265931059690L;
        fn.hkdv[251] = 161466903205436329L;
        fn.hkdv[252] = 4145737690759307134L;
        fn.hkdv[253] = 7547328853213604065L;
        fn.hkdv[254] = -3553465839908477595L;
        fn.hkdv[255] = -1424980240758401136L;
        fn.hkdv[256] = 5435550165445161560L;
        fn.hkdv[257] = -5195276833739693600L;
        fn.hkdv[258] = -2231723231062363185L;
        fn.hkdv[259] = -2281057982084209898L;
        fn.hkdv[260] = -222726427449911177L;
        fn.hkdv[261] = 6501024137216846291L;
        fn.hkdv[262] = -3820779971504863951L;
        fn.hkdv[263] = 706602290047358706L;
        fn.hkdv[264] = -6160918382583162367L;
        fn.hkdv[265] = 7158233876470275463L;
        fn.hkdv[266] = 664507059643259033L;
        fn.hkdv[267] = 4227214949855680706L;
        fn.hkdv[268] = -4726491325354402972L;
        fn.hkdv[269] = -8913486332304225565L;
        fn.hkdv[270] = 6461959886769935996L;
        fn.hkdv[271] = 8349228646535525718L;
        fn.hkdv[272] = -4196396517651018858L;
        fn.hkdv[273] = 6603421974059930711L;
        fn.hkdv[274] = 6923024413926781622L;
        fn.hkdv[275] = 8510803529189559193L;
        fn.hkdv[276] = 4470159333439342186L;
        fn.hkdv[277] = -6056567525111273170L;
        fn.hkdv[278] = -7391003012011326381L;
        fn.hkdv[279] = -519433812436076575L;
        fn.hkdv[280] = -6876262853297481234L;
        fn.hkdv[281] = 4954584121953023052L;
        fn.hkdv[282] = 6385597814678331383L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void sendCheck(String var1_1) {
        block71: {
            block70: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hkts", hkdt(int ), (int)123)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == fn.hkdj("hktt", hkdg(int ), (int)298)) break;
                    v0 /* !! */  = (long)fn.hkdj("hktu", hkdg(int ), (int)299);
                }
                var4_2 = fn.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hktv", hkdt(int ), (int)124)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == fn.hkdj("hktw", hkdg(int ), (int)300)) break;
                    v1 /* !! */  = (long)fn.hkdj("hktx", hkdg(int ), (int)301);
                }
                var3_3 /* !! */  = fn.b;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hkty", hkdt(int ), (int)125)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == fn.hkdj("hktz", hkdg(int ), (int)302)) break;
                    v2 /* !! */  = (long)fn.hkdj("hkua", hkdg(int ), (int)303);
                }
                var2_4 = fn.a;
                if (var4_2) {
                    throw null;
lbl21:
                    // 6 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl21
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hkub", hkdt(int ), (int)126)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fn.hkdj("hkuc", hkdg(int ), (int)304)) break;
                    v3 /* !! */  = (long)fn.hkdj("hkud", hkdg(int ), (int)305);
                }
                v4 /* !! */  = fn.on;
                if (true) ** GOTO lbl33
                block48: while (true) {
                    v4 /* !! */  = (long)(v5 - fn.hkdj("hkue", hkdt(int ), (int)127));
lbl33:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -166696700: {
                            v5 = fn.hkdj("hkuf", hkdt(int ), (int)128);
                            continue block48;
                        }
                        case 499382780: {
                            v5 = fn.hkdj("hkug", hkdt(int ), (int)129);
                            continue block48;
                        }
                        case 554421918: {
                            break block48;
                        }
                        case 1912320958: {
                            v5 = fn.hkdj("hkuh", hkdt(int ), (int)130);
                            continue block48;
                        }
                    }
                    break;
                }
                if (!this.mode.isSelected("\u0422\u0435\u0441\u0442\u043e\u0432\u044b\u0439")) break block70;
                if (var2_4 || var2_4) ** GOTO lbl21
                v6 /* !! */  = fn.on;
                if (true) ** GOTO lbl51
                block49: while (true) {
                    v6 /* !! */  = (long)(v7 - fn.hkdj("hkui", hkdt(int ), (int)131));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 315789890: {
                            v7 = fn.hkdj("hkuj", hkdt(int ), (int)132);
                            continue block49;
                        }
                        case 554421918: {
                            break block49;
                        }
                        case 804440151: {
                            v7 = fn.hkdj("hkuk", hkdt(int ), (int)133);
                            continue block49;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = fn.on - fn.hkdj("hkul", hkdt(int ), (int)134)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fn.hkdj("hkum", hkdg(int ), (int)306)) break;
                    v8 /* !! */  = (long)fn.hkdj("hkun", hkdg(int ), (int)307);
                }
                v9 = fn.mc.method_1562();
                v10 /* !! */  = fn.on;
                if (true) ** GOTO lbl70
                block51: while (true) {
                    v10 /* !! */  = (long)(v11 - fn.hkdj("hkuo", hkdt(int ), (int)135));
lbl70:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -10305108: {
                            v11 = fn.hkdj("hkup", hkdt(int ), (int)136);
                            continue block51;
                        }
                        case 554421918: {
                            break block51;
                        }
                        case 1725714085: {
                            v11 = fn.hkdj("hkuq", hkdt(int ), (int)137);
                            continue block51;
                        }
                    }
                    break;
                }
                v12 = "killer " + var1_1 + " 10000";
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_5 = fn.on - fn.hkdj("hkur", hkdt(int ), (int)138)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fn.hkdj("hkus", hkdg(int ), (int)308)) break;
                    v13 /* !! */  = (long)fn.hkdj("hkut", hkdg(int ), (int)309);
                }
                v9.method_45730(v12);
                if (var2_4) ** GOTO lbl21
                if (var4_2) {
                    throw null;
                }
                break block71;
            }
            if (var2_4 || var2_4) ** GOTO lbl21
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_6 = fn.on - fn.hkdj("hkuu", hkdt(int ), (int)139)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == fn.hkdj("hkuv", hkdg(int ), (int)310)) break;
                v14 /* !! */  = (long)fn.hkdj("hkuw", hkdg(int ), (int)311);
            }
            v15 /* !! */  = fn.on;
            if (true) ** GOTO lbl101
            block54: while (true) {
                v15 /* !! */  = (long)(v16 - fn.hkdj("hkux", hkdt(int ), (int)140));
lbl101:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1667871314: {
                        v16 = fn.hkdj("hkuy", hkdt(int ), (int)141);
                        continue block54;
                    }
                    case 554421918: {
                        break block54;
                    }
                    case 1221198486: {
                        v16 = fn.hkdj("hkuz", hkdt(int ), (int)142);
                        continue block54;
                    }
                    case 1274469889: {
                        v16 = fn.hkdj("hkva", hkdt(int ), (int)143);
                        continue block54;
                    }
                }
                break;
            }
            v17 = fn.mc.method_1562();
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_7 = fn.on - fn.hkdj("hkvb", hkdt(int ), (int)144)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == fn.hkdj("hkvc", hkdg(int ), (int)312)) break;
                v18 /* !! */  = (long)fn.hkdj("hkvd", hkdg(int ), (int)313);
            }
            v19 = fn.randomReason();
            while (true) {
                if ((v20 /* !! */  = (cfr_temp_8 = fn.on - fn.hkdj("hkve", hkdt(int ), (int)145)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v20 /* !! */  == fn.hkdj("hkvf", hkdg(int ), (int)314)) break;
                v20 /* !! */  = (long)fn.hkdj("hkvg", hkdg(int ), (int)315);
            }
            v21 = "report " + var1_1 + " " + v19;
            v22 /* !! */  = fn.on;
            if (true) ** GOTO lbl130
            block57: while (true) {
                v22 /* !! */  = (long)(v23 - fn.hkdj("hkvh", hkdt(int ), (int)146));
lbl130:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -472579770: {
                        v23 = fn.hkdj("hkvi", hkdt(int ), (int)147);
                        continue block57;
                    }
                    case -284582657: {
                        v23 = fn.hkdj("hkvj", hkdt(int ), (int)148);
                        continue block57;
                    }
                    case 417188364: {
                        v23 = fn.hkdj("hkvk", hkdt(int ), (int)149);
                        continue block57;
                    }
                    case 554421918: {
                        break block57;
                    }
                }
                break;
            }
            v17.method_45730(v21);
            if (var2_4) ** GOTO lbl21
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl151:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvl", hkdg(int ), (int)316);
                if (var4_2) {
                    throw null;
                }
            }
lbl155:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvm", hkdg(int ), (int)317);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl160:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvn", hkdg(int ), (int)318);
                if (!var4_2) ** GOTO lbl151
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fn.hkdj("hkvo", hkdg(int ), (int)319);
                    if (!var4_2) ** GOTO lbl155
                    throw null;
                }
            }
lbl169:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvp", hkdg(int ), (int)320);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl183
            }
            case 5: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvq", hkdg(int ), (int)321);
                if (!var4_2) ** GOTO lbl151
                throw null;
            }
lbl178:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvr", hkdg(int ), (int)322);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl183:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvs", hkdg(int ), (int)323);
                if (!var4_2) ** GOTO lbl178
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvt", hkdg(int ), (int)324);
                if (!var4_2) ** GOTO lbl169
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvu", hkdg(int ), (int)325);
                if (!var4_2) ** GOTO lbl169
                throw null;
            }
lbl195:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvv", hkdg(int ), (int)326);
                if (!var4_2) break;
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)fn.hkdj("hkvw", hkdg(int ), (int)327);
                if (!var4_2) ** GOTO lbl160
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)fn.hkdj("hkvx", hkdg(int ), (int)328);
        ** while (!var4_2)
lbl206:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hlma() {
        fn.hkdi[500] = 877287679;
        fn.hkdi[501] = 1768477498;
        fn.hkdi[502] = 873485882;
        fn.hkdi[503] = 1878898991;
        fn.hkdi[504] = 1361993093;
        fn.hkdi[505] = -630055849;
        fn.hkdi[506] = 174478924;
        fn.hkdi[507] = -1191087586;
        fn.hkdi[508] = 978390157;
        fn.hkdi[509] = -845284110;
        fn.hkdi[510] = 556815822;
        fn.hkdi[511] = 1891091268;
        fn.hkdi[512] = 1377671377;
        fn.hkdi[513] = 538559950;
        fn.hkdi[514] = -1378296463;
        fn.hkdi[515] = -1094712117;
        fn.hkdi[516] = 94404359;
        fn.hkdi[517] = 825217031;
    }

    private static /* synthetic */ void hllv() {
        fn.hkdi[400] = 1711842344;
        fn.hkdi[401] = -1511031482;
        fn.hkdi[402] = -1451540095;
        fn.hkdi[403] = -912002914;
        fn.hkdi[404] = -1805995882;
        fn.hkdi[405] = 2109953886;
        fn.hkdi[406] = -672790873;
        fn.hkdi[407] = -1666955632;
        fn.hkdi[408] = -1968139464;
        fn.hkdi[409] = -1245464295;
        fn.hkdi[410] = -1884562214;
        fn.hkdi[411] = -1078035056;
        fn.hkdi[412] = 952888433;
        fn.hkdi[413] = -2044358483;
        fn.hkdi[414] = 1491533578;
        fn.hkdi[415] = -1581527090;
        fn.hkdi[416] = -539768445;
        fn.hkdi[417] = 71551873;
        fn.hkdi[418] = 746573564;
        fn.hkdi[419] = -714463516;
        fn.hkdi[420] = 816256624;
        fn.hkdi[421] = -1871228800;
        fn.hkdi[422] = -1057836185;
        fn.hkdi[423] = -773549504;
        fn.hkdi[424] = 429283806;
        fn.hkdi[425] = -512865950;
        fn.hkdi[426] = 1963681291;
        fn.hkdi[427] = -889455334;
        fn.hkdi[428] = -1620854963;
        fn.hkdi[429] = -1631473252;
        fn.hkdi[430] = -584598262;
        fn.hkdi[431] = 1843787498;
        fn.hkdi[432] = -1048508257;
        fn.hkdi[433] = -2001311570;
        fn.hkdi[434] = 298242495;
        fn.hkdi[435] = 1149491053;
        fn.hkdi[436] = -148784620;
        fn.hkdi[437] = 1727292871;
        fn.hkdi[438] = 706438364;
        fn.hkdi[439] = 336297158;
        fn.hkdi[440] = -2080019218;
        fn.hkdi[441] = 1701908694;
        fn.hkdi[442] = 46098947;
        fn.hkdi[443] = -1268620663;
        fn.hkdi[444] = 1161842359;
        fn.hkdi[445] = 50217931;
        fn.hkdi[446] = 680274249;
        fn.hkdi[447] = 895204190;
        fn.hkdi[448] = -2146190977;
        fn.hkdi[449] = 882340100;
        fn.hkdi[450] = 1939124572;
        fn.hkdi[451] = -505560947;
        fn.hkdi[452] = 171619613;
        fn.hkdi[453] = -1830665396;
        fn.hkdi[454] = 1072378185;
        fn.hkdi[455] = -1387503872;
        fn.hkdi[456] = 163085468;
        fn.hkdi[457] = 1878904071;
        fn.hkdi[458] = -462301345;
        fn.hkdi[459] = -174269452;
        fn.hkdi[460] = -389895921;
        fn.hkdi[461] = 1495121236;
        fn.hkdi[462] = -259581267;
        fn.hkdi[463] = 1135010273;
        fn.hkdi[464] = -1206482082;
        fn.hkdi[465] = -777892355;
        fn.hkdi[466] = 1357862200;
        fn.hkdi[467] = -2096791214;
        fn.hkdi[468] = -1677393389;
        fn.hkdi[469] = -584183690;
        fn.hkdi[470] = 1668925251;
        fn.hkdi[471] = -1995898073;
        fn.hkdi[472] = -1435871101;
        fn.hkdi[473] = 274078495;
        fn.hkdi[474] = 1987319330;
        fn.hkdi[475] = 787665709;
        fn.hkdi[476] = 1583717509;
        fn.hkdi[477] = 1027838866;
        fn.hkdi[478] = -1612762004;
        fn.hkdi[479] = 470557105;
        fn.hkdi[480] = -1549804130;
        fn.hkdi[481] = 1512978050;
        fn.hkdi[482] = -17468631;
        fn.hkdi[483] = -156117123;
        fn.hkdi[484] = -2089672760;
        fn.hkdi[485] = 2097600983;
        fn.hkdi[486] = 1292947488;
        fn.hkdi[487] = -742375865;
        fn.hkdi[488] = -1146439181;
        fn.hkdi[489] = -434216016;
        fn.hkdi[490] = -1738556792;
        fn.hkdi[491] = -1942718117;
        fn.hkdi[492] = -1243542576;
        fn.hkdi[493] = -74011221;
        fn.hkdi[494] = 970256133;
        fn.hkdi[495] = 1356489847;
        fn.hkdi[496] = -789693205;
        fn.hkdi[497] = -1947740061;
        fn.hkdi[498] = 1722064594;
        fn.hkdi[499] = 1237253365;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onMove(cq var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hkow", hkdt(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == fn.hkdj("hkox", hkdg(int ), (int)222)) break;
            v0 /* !! */  = (long)fn.hkdj("hkoy", hkdg(int ), (int)223);
        }
        var4_2 = fn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hkoz", hkdt(int ), (int)74)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == fn.hkdj("hkpa", hkdg(int ), (int)224)) break;
            v1 /* !! */  = (long)fn.hkdj("hkpb", hkdg(int ), (int)225);
        }
        var3_3 /* !! */  = fn.b;
        v2 /* !! */  = fn.on;
        if (true) ** GOTO lbl19
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - fn.hkdj("hkpc", hkdt(int ), (int)75));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -701139546: {
                    v3 = fn.hkdj("hkpd", hkdt(int ), (int)76);
                    continue block25;
                }
                case 554421918: {
                    break block25;
                }
                case 1239545139: {
                    v3 = fn.hkdj("hkpe", hkdt(int ), (int)77);
                    continue block25;
                }
                case 1332599371: {
                    v3 = fn.hkdj("hkpf", hkdt(int ), (int)78);
                    continue block25;
                }
            }
            break;
        }
        var2_4 = fn.a;
        if (var4_2) {
            throw null;
lbl34:
            // 4 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl34
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hkpg", hkdt(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == fn.hkdj("hkph", hkdg(int ), (int)226)) break;
            v4 /* !! */  = (long)fn.hkdj("hkpi", hkdg(int ), (int)227);
        }
        if (!this.blocked) ** GOTO lbl-1000
        if (var2_4 || var2_4) ** GOTO lbl34
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hkpj", hkdt(int ), (int)80)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == fn.hkdj("hkpk", hkdg(int ), (int)228)) break;
            v5 /* !! */  = (long)fn.hkdj("hkpl", hkdg(int ), (int)229);
        }
        v6 /* !! */  = fn.on;
        if (true) ** GOTO lbl55
        block29: while (true) {
            v6 /* !! */  = (long)(v7 - fn.hkdj("hkpm", hkdt(int ), (int)81));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1905090576: {
                    v7 = fn.hkdj("hkpn", hkdt(int ), (int)82);
                    continue block29;
                }
                case 554421918: {
                    break block29;
                }
                case 1247080451: {
                    v7 = fn.hkdj("hkpo", hkdt(int ), (int)83);
                    continue block29;
                }
                case 2028029876: {
                    v7 = fn.hkdj("hkpp", hkdt(int ), (int)84);
                    continue block29;
                }
            }
            break;
        }
        var1_1.setMovement(class_243.field_1353);
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 3 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)fn.hkdj("hkpq", hkdg(int ), (int)230);
                if (!var4_2) break;
                throw null;
            }
lbl79:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)fn.hkdj("hkpr", hkdg(int ), (int)231);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 2: {
                var3_3 /* !! */  = (int)fn.hkdj("hkps", hkdg(int ), (int)232);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)fn.hkdj("hkpt", hkdg(int ), (int)233);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)fn.hkdj("hkpu", hkdg(int ), (int)234);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 5: {
                var3_3 /* !! */  = (int)fn.hkdj("hkpv", hkdg(int ), (int)235);
                if (!var4_2) break;
                throw null;
            }
lbl102:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)fn.hkdj("hkpw", hkdg(int ), (int)236);
                if (!var4_2) break;
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fn.hkdj("hkpx", hkdg(int ), (int)237);
                    if (!var4_2) ** GOTO lbl79
                    throw null;
                }
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)fn.hkdj("hkpy", hkdg(int ), (int)238);
        ** while (!var4_2)
lbl114:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hlms() {
        fn.hkdu[100] = 8033821072197413082L;
        fn.hkdu[101] = -3832313296491622976L;
        fn.hkdu[102] = -3035961801224579155L;
        fn.hkdu[103] = 1843788026423242621L;
        fn.hkdu[104] = 2909769008447519001L;
        fn.hkdu[105] = -1384842985337786891L;
        fn.hkdu[106] = 8743646868697833167L;
        fn.hkdu[107] = -7031273400358814530L;
        fn.hkdu[108] = -3645646392565458197L;
        fn.hkdu[109] = 2227625290122811215L;
        fn.hkdu[110] = 6376726575271940859L;
        fn.hkdu[111] = -5677641197982388471L;
        fn.hkdu[112] = -7720515929215768958L;
        fn.hkdu[113] = -2694670189002192775L;
        fn.hkdu[114] = -2385406260995799323L;
        fn.hkdu[115] = -6358006546630568639L;
        fn.hkdu[116] = 8511519560390839243L;
        fn.hkdu[117] = 7853991078320482489L;
        fn.hkdu[118] = 2785068930618073003L;
        fn.hkdu[119] = 3202080809935907335L;
        fn.hkdu[120] = -8332001100055831414L;
        fn.hkdu[121] = -8678723958022685459L;
        fn.hkdu[122] = 2296161634132257960L;
        fn.hkdu[123] = 3898826656851712368L;
        fn.hkdu[124] = -2341332559422667452L;
        fn.hkdu[125] = 3493887462209013386L;
        fn.hkdu[126] = 3178598204211425486L;
        fn.hkdu[127] = -8004702654491107071L;
        fn.hkdu[128] = 939449293172017575L;
        fn.hkdu[129] = -2065126794683901144L;
        fn.hkdu[130] = -4314474176867777469L;
        fn.hkdu[131] = -6068684643229778350L;
        fn.hkdu[132] = -7082480242990105787L;
        fn.hkdu[133] = 7952427180344051018L;
        fn.hkdu[134] = -1272972007274438845L;
        fn.hkdu[135] = -375502949061516353L;
        fn.hkdu[136] = 6705808365550914102L;
        fn.hkdu[137] = 7856131936869566964L;
        fn.hkdu[138] = -2894976253560982353L;
        fn.hkdu[139] = -4201663655176334080L;
        fn.hkdu[140] = -8826194028915016550L;
        fn.hkdu[141] = -5867651475269438792L;
        fn.hkdu[142] = 8603470368580275274L;
        fn.hkdu[143] = 2637818375880841317L;
        fn.hkdu[144] = -1580010183457554917L;
        fn.hkdu[145] = -3751281207407828382L;
        fn.hkdu[146] = 6795657375939837614L;
        fn.hkdu[147] = -8167123550004247426L;
        fn.hkdu[148] = -7437934845459836266L;
        fn.hkdu[149] = -3647486526303118322L;
        fn.hkdu[150] = 6122016463375399885L;
        fn.hkdu[151] = 5973007431955508293L;
        fn.hkdu[152] = 3166646667016070371L;
        fn.hkdu[153] = -4792851773916300420L;
        fn.hkdu[154] = -9129655750549029499L;
        fn.hkdu[155] = -325892423756828549L;
        fn.hkdu[156] = -1503909696615910481L;
        fn.hkdu[157] = 4407446405224541547L;
        fn.hkdu[158] = -6802919951184336059L;
        fn.hkdu[159] = 2133674915177452150L;
        fn.hkdu[160] = 6277598487471906361L;
        fn.hkdu[161] = 3625020892707099123L;
        fn.hkdu[162] = -8945956950672462844L;
        fn.hkdu[163] = -7413901399544021042L;
        fn.hkdu[164] = 8476914346418354615L;
        fn.hkdu[165] = 7476434493328549618L;
        fn.hkdu[166] = 4183261973179938791L;
        fn.hkdu[167] = 1378950723331918832L;
        fn.hkdu[168] = 8874479815364316088L;
        fn.hkdu[169] = -8800061860106832453L;
        fn.hkdu[170] = -1552621139042022439L;
        fn.hkdu[171] = 8754767972663299762L;
        fn.hkdu[172] = 1069272209584108978L;
        fn.hkdu[173] = -7408886538661533283L;
        fn.hkdu[174] = -4210446215316469431L;
        fn.hkdu[175] = 1586169815641487011L;
        fn.hkdu[176] = 7096013341089225113L;
        fn.hkdu[177] = 4551238384267384251L;
        fn.hkdu[178] = 2148604982021993756L;
        fn.hkdu[179] = 9168370941396386780L;
        fn.hkdu[180] = -575244521320867633L;
        fn.hkdu[181] = 5898969388198891228L;
        fn.hkdu[182] = 52457389946200348L;
        fn.hkdu[183] = -167575974994995253L;
        fn.hkdu[184] = 7288359803730760750L;
        fn.hkdu[185] = 5884668820877025344L;
        fn.hkdu[186] = -1369363926783937342L;
        fn.hkdu[187] = 5827796356491902775L;
        fn.hkdu[188] = -1191219854028737227L;
        fn.hkdu[189] = -6513442687154367330L;
        fn.hkdu[190] = -2890549325964097113L;
        fn.hkdu[191] = -932984368725001644L;
        fn.hkdu[192] = 3881284266356346394L;
        fn.hkdu[193] = 8798504304329069256L;
        fn.hkdu[194] = 3642168395274453047L;
        fn.hkdu[195] = 2005731262155893386L;
        fn.hkdu[196] = -5676843236886236332L;
        fn.hkdu[197] = -1493940800042833036L;
        fn.hkdu[198] = -3577374422574740953L;
        fn.hkdu[199] = 8982565026615821709L;
    }

    private static /* synthetic */ void hlkd() {
        fn.hkdh[200] = 266657523;
        fn.hkdh[201] = -324113722;
        fn.hkdh[202] = -398407930;
        fn.hkdh[203] = 1191903692;
        fn.hkdh[204] = -1874960292;
        fn.hkdh[205] = -1908441932;
        fn.hkdh[206] = -9705300;
        fn.hkdh[207] = -1291256292;
        fn.hkdh[208] = 1759265993;
        fn.hkdh[209] = 645539281;
        fn.hkdh[210] = 1776830469;
        fn.hkdh[211] = 1328647414;
        fn.hkdh[212] = -1266020865;
        fn.hkdh[213] = -2054135000;
        fn.hkdh[214] = -271381049;
        fn.hkdh[215] = 544492672;
        fn.hkdh[216] = -833478695;
        fn.hkdh[217] = 163943549;
        fn.hkdh[218] = -5272643;
        fn.hkdh[219] = 529656471;
        fn.hkdh[220] = -934920403;
        fn.hkdh[221] = -624218372;
        fn.hkdh[222] = 1180086216;
        fn.hkdh[223] = 1271945732;
        fn.hkdh[224] = 207675502;
        fn.hkdh[225] = 356911054;
        fn.hkdh[226] = 1051750041;
        fn.hkdh[227] = -28648108;
        fn.hkdh[228] = -490909750;
        fn.hkdh[229] = -1457437519;
        fn.hkdh[230] = 448570496;
        fn.hkdh[231] = 2063258408;
        fn.hkdh[232] = -1494874460;
        fn.hkdh[233] = 1763941365;
        fn.hkdh[234] = 1003412506;
        fn.hkdh[235] = -1774039449;
        fn.hkdh[236] = 154921746;
        fn.hkdh[237] = 1009716647;
        fn.hkdh[238] = -2135340245;
        fn.hkdh[239] = -1812640383;
        fn.hkdh[240] = -602946184;
        fn.hkdh[241] = 529081012;
        fn.hkdh[242] = -1377407662;
        fn.hkdh[243] = 1130124216;
        fn.hkdh[244] = 1128031349;
        fn.hkdh[245] = -1955561529;
        fn.hkdh[246] = 480653492;
        fn.hkdh[247] = -337141499;
        fn.hkdh[248] = 664425504;
        fn.hkdh[249] = -1152182325;
        fn.hkdh[250] = 1822704491;
        fn.hkdh[251] = -1359053303;
        fn.hkdh[252] = 689809518;
        fn.hkdh[253] = 2142736255;
        fn.hkdh[254] = -797242346;
        fn.hkdh[255] = 800954776;
        fn.hkdh[256] = 2057979032;
        fn.hkdh[257] = -246245189;
        fn.hkdh[258] = 1636283446;
        fn.hkdh[259] = 1021641352;
        fn.hkdh[260] = -1163342754;
        fn.hkdh[261] = -288973028;
        fn.hkdh[262] = -1025753154;
        fn.hkdh[263] = 2049112021;
        fn.hkdh[264] = -294352804;
        fn.hkdh[265] = 22964470;
        fn.hkdh[266] = -130834642;
        fn.hkdh[267] = 813030186;
        fn.hkdh[268] = -2077756930;
        fn.hkdh[269] = 1354043495;
        fn.hkdh[270] = -965021045;
        fn.hkdh[271] = 1439417291;
        fn.hkdh[272] = 1343162619;
        fn.hkdh[273] = 449022718;
        fn.hkdh[274] = 284310290;
        fn.hkdh[275] = -995760621;
        fn.hkdh[276] = -2019784196;
        fn.hkdh[277] = 714117388;
        fn.hkdh[278] = 827674278;
        fn.hkdh[279] = 200626447;
        fn.hkdh[280] = 57755913;
        fn.hkdh[281] = -1108891578;
        fn.hkdh[282] = -1991630871;
        fn.hkdh[283] = 1937646907;
        fn.hkdh[284] = 1485581592;
        fn.hkdh[285] = -5442349;
        fn.hkdh[286] = 496159331;
        fn.hkdh[287] = -190999047;
        fn.hkdh[288] = 1715782556;
        fn.hkdh[289] = -254147745;
        fn.hkdh[290] = -1255344499;
        fn.hkdh[291] = -1461009768;
        fn.hkdh[292] = 1708157027;
        fn.hkdh[293] = -747236730;
        fn.hkdh[294] = 445438859;
        fn.hkdh[295] = 745651140;
        fn.hkdh[296] = 1445051493;
        fn.hkdh[297] = -926872858;
        fn.hkdh[298] = -1260187493;
        fn.hkdh[299] = 1184461304;
    }

    private static /* synthetic */ void hlnm() {
        fn.hkdv[0] = 1996625666568714528L;
        fn.hkdv[1] = 5431185421066833840L;
        fn.hkdv[2] = -591556229541931708L;
        fn.hkdv[3] = -160442403372110836L;
        fn.hkdv[4] = 216625342263879737L;
        fn.hkdv[5] = -5463199600401654316L;
        fn.hkdv[6] = -402028212251785908L;
        fn.hkdv[7] = -5051554612472210496L;
        fn.hkdv[8] = 4849556372839532587L;
        fn.hkdv[9] = 4840464869109303244L;
        fn.hkdv[10] = 7373865604300562761L;
        fn.hkdv[11] = 2730402054954040664L;
        fn.hkdv[12] = 8373417212838483185L;
        fn.hkdv[13] = -2839084875175430049L;
        fn.hkdv[14] = -8885175896764442722L;
        fn.hkdv[15] = 3295211859964083182L;
        fn.hkdv[16] = 3357359659039398793L;
        fn.hkdv[17] = -6930437835467159335L;
        fn.hkdv[18] = -2581462456832773797L;
        fn.hkdv[19] = 1896278240071242516L;
        fn.hkdv[20] = 5202120058067921878L;
        fn.hkdv[21] = 3261634623046866693L;
        fn.hkdv[22] = 6106103458490753019L;
        fn.hkdv[23] = 1053122234370100810L;
        fn.hkdv[24] = 272009493302234687L;
        fn.hkdv[25] = 3541308646273585572L;
        fn.hkdv[26] = 5754646658505400915L;
        fn.hkdv[27] = -3415632974926147298L;
        fn.hkdv[28] = -9139062520729822840L;
        fn.hkdv[29] = 3695145587520206850L;
        fn.hkdv[30] = -1638118515917332725L;
        fn.hkdv[31] = 6646350012561140207L;
        fn.hkdv[32] = -6010978109038997066L;
        fn.hkdv[33] = -5903949721503495321L;
        fn.hkdv[34] = 1792561801170052992L;
        fn.hkdv[35] = -905291498165794246L;
        fn.hkdv[36] = 361581427404090636L;
        fn.hkdv[37] = 821310560234636996L;
        fn.hkdv[38] = 7187933477447146279L;
        fn.hkdv[39] = 1460056168276858659L;
        fn.hkdv[40] = -6084410427586253459L;
        fn.hkdv[41] = -8470332014147567012L;
        fn.hkdv[42] = -2136166543471613418L;
        fn.hkdv[43] = -414277146828350398L;
        fn.hkdv[44] = 8347005651572071867L;
        fn.hkdv[45] = 2837160811033859469L;
        fn.hkdv[46] = 4585776629578303361L;
        fn.hkdv[47] = -3736666315098147470L;
        fn.hkdv[48] = 7214055398209661956L;
        fn.hkdv[49] = 7564989364504783267L;
        fn.hkdv[50] = -3426578117409477011L;
        fn.hkdv[51] = -4247142671031833168L;
        fn.hkdv[52] = 6688393153492831543L;
        fn.hkdv[53] = -7479809381940644328L;
        fn.hkdv[54] = -4339414377903189768L;
        fn.hkdv[55] = -8623834417298236354L;
        fn.hkdv[56] = 4198350316803230005L;
        fn.hkdv[57] = -4869218932420987910L;
        fn.hkdv[58] = -4395672927267927710L;
        fn.hkdv[59] = -9040274257929677843L;
        fn.hkdv[60] = -3628688881736735361L;
        fn.hkdv[61] = 8464246043337896234L;
        fn.hkdv[62] = -9111898427872439865L;
        fn.hkdv[63] = 8332870375793925658L;
        fn.hkdv[64] = -5254571755765383004L;
        fn.hkdv[65] = -2637441028363951229L;
        fn.hkdv[66] = -4126681742197289799L;
        fn.hkdv[67] = 8632227156458863309L;
        fn.hkdv[68] = -3578208233226905703L;
        fn.hkdv[69] = -6647298307355771232L;
        fn.hkdv[70] = -1671391181310641971L;
        fn.hkdv[71] = -4547991506571403584L;
        fn.hkdv[72] = 6594447340386793891L;
        fn.hkdv[73] = 7797458809496793116L;
        fn.hkdv[74] = 5899099717354017786L;
        fn.hkdv[75] = -7472601845417858325L;
        fn.hkdv[76] = -3893309576982649345L;
        fn.hkdv[77] = 219149164144817149L;
        fn.hkdv[78] = -1268029203918683325L;
        fn.hkdv[79] = 8163637820339799854L;
        fn.hkdv[80] = 6970323762177460822L;
        fn.hkdv[81] = -3580929747235729341L;
        fn.hkdv[82] = -1366528530329956857L;
        fn.hkdv[83] = 6998842935628613157L;
        fn.hkdv[84] = 1796641592782786700L;
        fn.hkdv[85] = 6037338147889483957L;
        fn.hkdv[86] = -7903014031106541191L;
        fn.hkdv[87] = -3533085220106868858L;
        fn.hkdv[88] = 3542814440427983970L;
        fn.hkdv[89] = -6387151015627329856L;
        fn.hkdv[90] = 4627549842234393917L;
        fn.hkdv[91] = -642341763815770455L;
        fn.hkdv[92] = -6434745356081049462L;
        fn.hkdv[93] = -3011858470451975983L;
        fn.hkdv[94] = 7490454002660515544L;
        fn.hkdv[95] = -9094042121911648061L;
        fn.hkdv[96] = -5077775289749971826L;
        fn.hkdv[97] = 4472958053382726489L;
        fn.hkdv[98] = 6041402941341148274L;
        fn.hkdv[99] = -4410378311200943827L;
    }

    private static /* synthetic */ long hkdt(int n2) {
        return hkdu[n2] ^ hkdv[n2];
    }

    static {
        hkdh = new int[518];
        hkdi = new int[518];
        fn.hlkb();
        fn.hlkc();
        fn.hlkd();
        fn.hlki();
        fn.hlkq();
        fn.hlla();
        fn.hllc();
        fn.hllh();
        fn.hlli();
        fn.hllo();
        fn.hllv();
        fn.hlma();
        hkdu = new long[283];
        hkdv = new long[283];
        fn.hlme();
        fn.hlms();
        fn.hlnd();
        fn.hlnm();
        fn.hlnv();
        fn.hloe();
        PLAYER_NOT_FOUND = Pattern.compile("(?iu)(\u0438\u0433\u0440\u043e\u043a\\s+\u043d\u0435\\s+\u043d\u0430\u0439\u0434\u0435\u043d|player\\s+not\\s+found|\u043d\u0435\\s+\u043d\u0430\u0439\u0434\u0435\u043d)");
        REPORT_SUCCESS = Pattern.compile("(?iu)(\u0443\u0441\u043f\u0435\u0448\u043d\\p{L}*\\s+\u043f\u043e\u0434\u0430\u043d\\p{L}*|\u0436\u0430\u043b\u043e\u0431\u0430\\s+(?:\u043e\u0442\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0430|\u043f\u0440\u0438\u043d\u044f\u0442\u0430)|\u0440\u0435\u043f\u043e\u0440\u0442\\s+(?:\u043e\u0442\u043f\u0440\u0430\u0432\u043b\u0435\u043d|\u043f\u0440\u0438\u043d\u044f\u0442)|report\\s+(?:sent|accepted))");
        KILLER_SUCCESS = Pattern.compile("(?iu)(\u043d\u0430\u0437\u043d\u0430\u0447\u0438\u043b\\s+\u043d\u0430\u0433\u0440\u0430\u0434\u0443|\u043d\u0430\u0433\u0440\u0430\u0434\u0430\\s+\u043d\u0430\u0437\u043d\u0430\u0447\u0435\u043d\u0430|killer|bounty)");
        REPORT_REASONS = List.of("Cheats", "KillAura", "Reach", "Aim", "\u041f\u043e\u0434\u043e\u0437\u0440\u0435\u043d\u0438\u0435 \u043d\u0430 \u0447\u0438\u0442\u044b", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442 \u0437\u0430\u043f\u0440\u0435\u0449\u0435\u043d\u043d\u044b\u0439 \u0441\u043e\u0444\u0442", "\u041d\u0430\u0440\u0443\u0448\u0435\u043d\u0438\u0435 \u043f\u0440\u0430\u0432\u0438\u043b \u0447\u0430\u0442\u0430", "\u041e\u0441\u043a\u043e\u0440\u0431\u043b\u044f\u0435\u0442 \u043c\u0435\u043d\u044f", "\u0417\u0430\u0431\u0430\u043d\u044c\u0442\u0435 \u0447\u0438\u0442\u0435\u0440\u0430", "\u0427\u0438\u0442\u0435\u0440");
        STAFF_NAMES = fn.createStaffNames();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void finishScan() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hkzr", hkdt(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == fn.hkdj("hkzs", hkdg(int ), (int)383)) break;
            v0 /* !! */  = (long)fn.hkdj("hkzt", hkdg(int ), (int)384);
        }
        var4_1 = fn.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hkzu", hkdt(int ), (int)194)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == fn.hkdj("hkzv", hkdg(int ), (int)385)) break;
            v1 /* !! */  = (long)fn.hkdj("hkzw", hkdg(int ), (int)386);
        }
        var3_2 /* !! */  = fn.b;
        v2 /* !! */  = fn.on;
        if (true) ** GOTO lbl17
        block64: while (true) {
            v2 /* !! */  = (long)(v3 - fn.hkdj("hkzx", hkdt(int ), (int)195));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1913295109: {
                    v3 = fn.hkdj("hkzy", hkdt(int ), (int)196);
                    continue block64;
                }
                case -464633776: {
                    v3 = fn.hkdj("hkzz", hkdt(int ), (int)197);
                    continue block64;
                }
                case 554421918: {
                    break block64;
                }
                case 1216173382: {
                    v3 = fn.hkdj("hlaa", hkdt(int ), (int)198);
                    continue block64;
                }
            }
            break;
        }
        var2_3 = fn.a;
        if (var4_1) {
            throw null;
lbl32:
            // 8 sources

            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hlab", hkdt(int ), (int)199)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == fn.hkdj("hlac", hkdg(int ), (int)387)) break;
            v4 /* !! */  = (long)fn.hkdj("hlad", hkdg(int ), (int)388);
        }
        v5 /* !! */  = fn.on;
        if (true) ** GOTO lbl44
        block67: while (true) {
            v5 /* !! */  = (long)(v6 - fn.hkdj("hlae", hkdt(int ), (int)200));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 506700293: {
                    v6 = fn.hkdj("hlaf", hkdt(int ), (int)201);
                    continue block67;
                }
                case 554421918: {
                    break block67;
                }
                case 1556166682: {
                    v6 = fn.hkdj("hlag", hkdt(int ), (int)202);
                    continue block67;
                }
                case 1910725732: {
                    v6 = fn.hkdj("hlah", hkdt(int ), (int)203);
                    continue block67;
                }
            }
            break;
        }
        if (!this.onlineStaff.isEmpty()) ** GOTO lbl66
        if (var2_3) ** GOTO lbl32
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl32
                v7 = "StaffExploit: \u0441\u0442\u0430\u0444\u0444 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d";
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
lbl66:
            // 1 sources

            if (var2_3 || var2_3) ** GOTO lbl32
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hlai", hkdt(int ), (int)204)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == fn.hkdj("hlaj", hkdg(int ), (int)389)) break;
                v8 /* !! */  = (long)fn.hkdj("hlak", hkdg(int ), (int)390);
            }
            v9 /* !! */  = fn.on;
            if (true) ** GOTO lbl76
            block69: while (true) {
                v9 /* !! */  = (long)(v10 - fn.hkdj("hlal", hkdt(int ), (int)205));
lbl76:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case 170324587: {
                        v10 = fn.hkdj("hlam", hkdt(int ), (int)206);
                        continue block69;
                    }
                    case 554421918: {
                        break block69;
                    }
                    case 1972473824: {
                        v10 = fn.hkdj("hlan", hkdt(int ), (int)207);
                        continue block69;
                    }
                }
                break;
            }
            v11 = this.onlineStaff.size();
            v12 /* !! */  = fn.on;
            if (true) ** GOTO lbl90
            block70: while (true) {
                v12 /* !! */  = (long)(v13 - fn.hkdj("hlao", hkdt(int ), (int)208));
lbl90:
                // 2 sources

                switch ((int)v12 /* !! */ ) {
                    case -1944805838: {
                        v13 = fn.hkdj("hlap", hkdt(int ), (int)209);
                        continue block70;
                    }
                    case 554421918: {
                        break block70;
                    }
                    case 1563038988: {
                        v13 = fn.hkdj("hlaq", hkdt(int ), (int)210);
                        continue block70;
                    }
                }
                break;
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_4 = fn.on - fn.hkdj("hlar", hkdt(int ), (int)211)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == fn.hkdj("hlas", hkdg(int ), (int)391)) break;
                v14 /* !! */  = (long)fn.hkdj("hlat", hkdg(int ), (int)392);
            }
            v15 = String.join((CharSequence)", ", this.onlineStaff);
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_5 = fn.on - fn.hkdj("hlau", hkdt(int ), (int)212)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == fn.hkdj("hlav", hkdg(int ), (int)393)) {
                    v7 = "StaffExploit: \u043e\u043d\u043b\u0430\u0439\u043d " + v11 + " - " + v15;
                    break;
                }
                v16 /* !! */  = (long)fn.hkdj("hlaw", hkdg(int ), (int)394);
            }
lbl112:
            // 2 sources

            var1_4 = v7;
            if (var2_3 || var2_3) ** GOTO lbl32
            v17 /* !! */  = fn.on;
            if (true) ** GOTO lbl118
            block73: while (true) {
                v17 /* !! */  = (long)(v18 - fn.hkdj("hlax", hkdt(int ), (int)213));
lbl118:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1375110464: {
                        v18 = fn.hkdj("hlay", hkdt(int ), (int)214);
                        continue block73;
                    }
                    case 554421918: {
                        break block73;
                    }
                    case 2128663813: {
                        v18 = fn.hkdj("hlaz", hkdt(int ), (int)215);
                        continue block73;
                    }
                }
                break;
            }
            pp.brandmessage(var1_4);
            if (var2_3 || var2_3) ** GOTO lbl32
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_6 = fn.on - fn.hkdj("hlba", hkdt(int ), (int)216)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == fn.hkdj("hlbb", hkdg(int ), (int)395)) break;
                v19 /* !! */  = (long)fn.hkdj("hlbc", hkdg(int ), (int)396);
            }
            v20 /* !! */  = fn.on;
            if (true) ** GOTO lbl138
            block75: while (true) {
                v20 /* !! */  = (long)(v21 - fn.hkdj("hlbd", hkdt(int ), (int)217));
lbl138:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case 554421918: {
                        break block75;
                    }
                    case 1070867136: {
                        v21 = fn.hkdj("hlbe", hkdt(int ), (int)218);
                        continue block75;
                    }
                    case 2036079661: {
                        v21 = fn.hkdj("hlbf", hkdt(int ), (int)219);
                        continue block75;
                    }
                }
                break;
            }
            v22 = this.onlineStaff.size();
            v23 /* !! */  = fn.on;
            if (true) ** GOTO lbl152
            block76: while (true) {
                v23 /* !! */  = (long)(v24 - fn.hkdj("hlbg", hkdt(int ), (int)220));
lbl152:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -70448204: {
                        v24 = fn.hkdj("hlbh", hkdt(int ), (int)221);
                        continue block76;
                    }
                    case 465785598: {
                        v24 = fn.hkdj("hlbi", hkdt(int ), (int)222);
                        continue block76;
                    }
                    case 554421918: {
                        break block76;
                    }
                }
                break;
            }
            v25 = "\u041f\u0440\u043e\u0432\u0435\u0440\u043a\u0430 \u0441\u0442\u0430\u0444\u0444\u0430 \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u0430: " + v22;
            v26 /* !! */  = fn.on;
            if (true) ** GOTO lbl166
            block77: while (true) {
                v26 /* !! */  = (long)(v27 - fn.hkdj("hldc", hkdt(int ), (int)223));
lbl166:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -552822642: {
                        v27 = fn.hkdj("hldd", hkdt(int ), (int)224);
                        continue block77;
                    }
                    case -384762163: {
                        v27 = fn.hkdj("hlde", hkdt(int ), (int)225);
                        continue block77;
                    }
                    case 399901247: {
                        v27 = fn.hkdj("hldf", hkdt(int ), (int)226);
                        continue block77;
                    }
                    case 554421918: {
                        break block77;
                    }
                }
                break;
            }
            ee.info(v25);
            if (var2_3 || var2_3) ** GOTO lbl32
            v28 = fn.hkdj("hldg", hkdg(int ), (int)397);
            while (true) {
                if ((v29 /* !! */  = (cfr_temp_7 = fn.on - fn.hkdj("hldh", hkdt(int ), (int)227)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v29 /* !! */  == fn.hkdj("hldi", hkdg(int ), (int)398)) break;
                v29 /* !! */  = (long)fn.hkdj("hldj", hkdg(int ), (int)399);
            }
            this.setState((boolean)v28);
            if (!var2_3 && !var2_3) ** break;
            ** continue;
            return;
lbl190:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)fn.hkdj("hldk", hkdg(int ), (int)400);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl233
            }
            case 1: {
                var3_2 /* !! */  = (int)fn.hkdj("hldl", hkdg(int ), (int)401);
                if (!var4_1) break;
                throw null;
            }
lbl199:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)fn.hkdj("hldm", hkdg(int ), (int)402);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl215
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)fn.hkdj("hldn", hkdg(int ), (int)403);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl259
                    break;
                }
            }
            case 4: {
                do {
                    var3_2 /* !! */  = (int)fn.hkdj("hldo", hkdg(int ), (int)404);
                } while (!var4_1);
                throw null;
            }
lbl215:
            // 4 sources

            case 5: {
                var3_2 /* !! */  = (int)fn.hkdj("hldp", hkdg(int ), (int)405);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl220:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)fn.hkdj("hldq", hkdg(int ), (int)406);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl242
            }
            case 7: {
                var3_2 /* !! */  = (int)fn.hkdj("hldr", hkdg(int ), (int)407);
                if (!var4_1) ** GOTO lbl215
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)fn.hkdj("hlds", hkdg(int ), (int)408);
                if (!var4_1) ** GOTO lbl190
                throw null;
            }
lbl233:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)fn.hkdj("hldt", hkdg(int ), (int)409);
                if (!var4_1) ** GOTO lbl199
                throw null;
            }
            case 10: {
                var3_2 /* !! */  = (int)fn.hkdj("hldu", hkdg(int ), (int)410);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl242:
            // 2 sources

            case 11: {
                var3_2 /* !! */  = (int)fn.hkdj("hldv", hkdg(int ), (int)411);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl247:
            // 2 sources

            case 12: {
                var3_2 /* !! */  = (int)fn.hkdj("hldw", hkdg(int ), (int)412);
                if (!var4_1) ** GOTO lbl190
                throw null;
            }
lbl251:
            // 3 sources

            case 13: {
                var3_2 /* !! */  = (int)fn.hkdj("hldx", hkdg(int ), (int)413);
                if (!var4_1) ** GOTO lbl220
                throw null;
            }
            case 14: {
                var3_2 /* !! */  = (int)fn.hkdj("hldy", hkdg(int ), (int)414);
                if (!var4_1) break;
                throw null;
            }
lbl259:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)fn.hkdj("hldz", hkdg(int ), (int)415);
                if (!var4_1) ** GOTO lbl215
                throw null;
            }
            case 16: 
        }
        var3_2 /* !! */  = (int)fn.hkdj("hlea", hkdg(int ), (int)416);
        ** while (!var4_1)
lbl266:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String randomReason() {
        v0 /* !! */  = fn.on;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(fn.hkdj("hlfi", hkdt(int ), (int)239) - fn.hkdj("hlfh", hkdt(int ), (int)238));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1610685302: {
                    continue block29;
                }
                case 554421918: {
                    break block29;
                }
            }
            break;
        }
        var2 = fn.c;
        v1 /* !! */  = fn.on;
        if (true) ** GOTO lbl15
        block30: while (true) {
            v1 /* !! */  = (long)(v2 - fn.hkdj("hlfj", hkdt(int ), (int)240));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2140664813: {
                    v2 = fn.hkdj("hlfk", hkdt(int ), (int)241);
                    continue block30;
                }
                case -1407477351: {
                    v2 = fn.hkdj("hlfl", hkdt(int ), (int)242);
                    continue block30;
                }
                case 554421918: {
                    break block30;
                }
            }
            break;
        }
        var1_1 /* !! */  = fn.b;
        v3 /* !! */  = fn.on;
        if (true) ** GOTO lbl29
        block31: while (true) {
            v3 /* !! */  = (long)(v4 - fn.hkdj("hlfm", hkdt(int ), (int)243));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 445110045: {
                    v4 = fn.hkdj("hlfn", hkdt(int ), (int)244);
                    continue block31;
                }
                case 554421918: {
                    break block31;
                }
                case 1354702831: {
                    v4 = fn.hkdj("hlfo", hkdt(int ), (int)245);
                    continue block31;
                }
                case 1943980962: {
                    v4 = fn.hkdj("hlfp", hkdt(int ), (int)246);
                    continue block31;
                }
            }
            break;
        }
        var0_2 = fn.a;
        if (var2) {
            throw null;
lbl44:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl44
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = fn.on - fn.hkdj("hlfq", hkdt(int ), (int)247)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fn.hkdj("hlfr", hkdg(int ), (int)439)) break;
                    v5 /* !! */  = (long)fn.hkdj("hlfs", hkdg(int ), (int)440);
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = fn.on - fn.hkdj("hlft", hkdt(int ), (int)248)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == fn.hkdj("hlfu", hkdg(int ), (int)441)) break;
                    v6 /* !! */  = (long)fn.hkdj("hlfv", hkdg(int ), (int)442);
                }
                v7 = ThreadLocalRandom.current();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = fn.on - fn.hkdj("hlfw", hkdt(int ), (int)249)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == fn.hkdj("hlfx", hkdg(int ), (int)443)) break;
                    v8 /* !! */  = (long)fn.hkdj("hlfy", hkdg(int ), (int)444);
                }
                v9 /* !! */  = fn.on;
                if (true) ** GOTO lbl71
                block36: while (true) {
                    v9 /* !! */  = (long)(fn.hkdj("hlga", hkdt(int ), (int)251) - fn.hkdj("hlfz", hkdt(int ), (int)250));
lbl71:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 313625670: {
                            continue block36;
                        }
                        case 554421918: {
                            break block36;
                        }
                    }
                    break;
                }
                v10 = fn.REPORT_REASONS.size();
                v11 /* !! */  = fn.on;
                if (true) ** GOTO lbl81
                block37: while (true) {
                    v11 /* !! */  = (long)(fn.hkdj("hlgc", hkdt(int ), (int)253) - fn.hkdj("hlgb", hkdt(int ), (int)252));
lbl81:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1219466491: {
                            continue block37;
                        }
                        case 554421918: {
                            break block37;
                        }
                    }
                    break;
                }
                v12 = v7.nextInt(v10);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = fn.on - fn.hkdj("hlgd", hkdt(int ), (int)254)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == fn.hkdj("hlge", hkdg(int ), (int)445)) break;
                    v13 /* !! */  = (long)fn.hkdj("hlgf", hkdg(int ), (int)446);
                }
                return fn.REPORT_REASONS.get(v12);
            }
            case 0: {
                var1_1 /* !! */  = (int)fn.hkdj("hlgg", hkdg(int ), (int)447);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl98:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)fn.hkdj("hlgh", hkdg(int ), (int)448);
                if (!var2) break;
                throw null;
            }
lbl102:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)fn.hkdj("hlgi", hkdg(int ), (int)449);
                if (!var2) ** GOTO lbl98
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)fn.hkdj("hlgj", hkdg(int ), (int)450);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void hlkb() {
        fn.hkdh[0] = -1676065450;
        fn.hkdh[1] = 1739374138;
        fn.hkdh[2] = 1006684327;
        fn.hkdh[3] = 1455914603;
        fn.hkdh[4] = -1802674786;
        fn.hkdh[5] = 721174896;
        fn.hkdh[6] = -878988748;
        fn.hkdh[7] = 1696617706;
        fn.hkdh[8] = -137835365;
        fn.hkdh[9] = 2054125497;
        fn.hkdh[10] = -1387102447;
        fn.hkdh[11] = -178237722;
        fn.hkdh[12] = 605623567;
        fn.hkdh[13] = 599753410;
        fn.hkdh[14] = -1790461468;
        fn.hkdh[15] = -78468356;
        fn.hkdh[16] = -590179456;
        fn.hkdh[17] = -1314248968;
        fn.hkdh[18] = -1789305395;
        fn.hkdh[19] = 121265187;
        fn.hkdh[20] = 1953122908;
        fn.hkdh[21] = -1191706103;
        fn.hkdh[22] = 81885813;
        fn.hkdh[23] = 873926994;
        fn.hkdh[24] = 2035184669;
        fn.hkdh[25] = -1741285058;
        fn.hkdh[26] = 836284402;
        fn.hkdh[27] = -1232803555;
        fn.hkdh[28] = -1966303972;
        fn.hkdh[29] = -612114564;
        fn.hkdh[30] = -2103589413;
        fn.hkdh[31] = -1555299199;
        fn.hkdh[32] = 648999481;
        fn.hkdh[33] = 1039145946;
        fn.hkdh[34] = 1887777323;
        fn.hkdh[35] = -2108250311;
        fn.hkdh[36] = 365574993;
        fn.hkdh[37] = 560588749;
        fn.hkdh[38] = 728251606;
        fn.hkdh[39] = -1560956782;
        fn.hkdh[40] = -1706602379;
        fn.hkdh[41] = 74613957;
        fn.hkdh[42] = 1308114700;
        fn.hkdh[43] = -167420025;
        fn.hkdh[44] = 1553511989;
        fn.hkdh[45] = -269385272;
        fn.hkdh[46] = 798290592;
        fn.hkdh[47] = 2003484648;
        fn.hkdh[48] = -89493988;
        fn.hkdh[49] = -1839163984;
        fn.hkdh[50] = 495958330;
        fn.hkdh[51] = 291812996;
        fn.hkdh[52] = 1913303344;
        fn.hkdh[53] = 254018645;
        fn.hkdh[54] = -928814955;
        fn.hkdh[55] = 1094601276;
        fn.hkdh[56] = -437850342;
        fn.hkdh[57] = 1079505045;
        fn.hkdh[58] = 1546418809;
        fn.hkdh[59] = -451684624;
        fn.hkdh[60] = 1779161808;
        fn.hkdh[61] = 252454326;
        fn.hkdh[62] = -511916834;
        fn.hkdh[63] = 1031205198;
        fn.hkdh[64] = -1782023899;
        fn.hkdh[65] = 1252035642;
        fn.hkdh[66] = 1027185530;
        fn.hkdh[67] = 596016908;
        fn.hkdh[68] = -666012126;
        fn.hkdh[69] = 1107240854;
        fn.hkdh[70] = -889273265;
        fn.hkdh[71] = -1439508244;
        fn.hkdh[72] = -637474112;
        fn.hkdh[73] = -1326328614;
        fn.hkdh[74] = 1823692907;
        fn.hkdh[75] = 985554838;
        fn.hkdh[76] = -666947723;
        fn.hkdh[77] = -94485931;
        fn.hkdh[78] = 613467682;
        fn.hkdh[79] = 592822135;
        fn.hkdh[80] = 1257623555;
        fn.hkdh[81] = -1504701373;
        fn.hkdh[82] = -1852038695;
        fn.hkdh[83] = 1985559737;
        fn.hkdh[84] = 1068697914;
        fn.hkdh[85] = -673985786;
        fn.hkdh[86] = 900387152;
        fn.hkdh[87] = -853767875;
        fn.hkdh[88] = 1132046061;
        fn.hkdh[89] = -1945971474;
        fn.hkdh[90] = -911797988;
        fn.hkdh[91] = -716479886;
        fn.hkdh[92] = -1483675396;
        fn.hkdh[93] = -54440505;
        fn.hkdh[94] = -1476313299;
        fn.hkdh[95] = -1273109258;
        fn.hkdh[96] = -465310083;
        fn.hkdh[97] = 2073417904;
        fn.hkdh[98] = 520144950;
        fn.hkdh[99] = 2025893960;
    }
}

