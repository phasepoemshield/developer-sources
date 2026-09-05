/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class gw$FinderState
extends Enum<gw$FinderState> {
    public static final /* enum */ gw$FinderState EXPLORING;
    public static final boolean c;
    private static long[] btal;
    private static int[] btbe;
    public static final /* enum */ gw$FinderState OPENING_TARGET;
    private static int[] btbd;
    public static final /* enum */ gw$FinderState TELEPORTING_ABOVE_TARGET;
    public static final /* enum */ gw$FinderState STOPPED;
    public static final boolean a;
    private static final /* synthetic */ gw$FinderState[] $VALUES;
    public static final /* enum */ gw$FinderState DEPOSITING;
    public static final /* enum */ gw$FinderState REQUESTING_ENDER_CHEST;
    public static final /* enum */ gw$FinderState TELEPORTING_TO_NEARBY_TARGET;
    public static final /* enum */ gw$FinderState RETURNING_TO_SURFACE;
    public static final /* enum */ gw$FinderState OPENING_ENDER_MENU;
    public static final /* enum */ gw$FinderState WAITING_ENDER_CHEST;
    public static final int b;
    public static final /* enum */ gw$FinderState DESCENDING_TO_TARGET;
    private static long[] btak;
    public static final long eh = 1254424770334816197L;

    private static /* synthetic */ long btaj(int n2) {
        return btak[n2] ^ btal[n2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private gw$FinderState() {
        int n3 = b;
        boolean bl2 = a;
        if (n3 == 0) return;
        switch (n3) {
            default: {
                return;
            }
            case 0: {
                CallSite callSite = gw$FinderState.btam("btcb", btbc(int ), (int)16);
            }
            case 1: {
                CallSite callSite = gw$FinderState.btam("btcc", btbc(int ), (int)17);
            }
            case 2: 
        }
        while (true) {
            CallSite callSite = gw$FinderState.btam("btcd", btbc(int ), (int)18);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gw$FinderState valueOf(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gw$FinderState.eh - gw$FinderState.btam("btbl", btaj(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gw$FinderState.btam("btbm", btbc(int ), (int)6)) break;
            v0 /* !! */  = (long)gw$FinderState.btam("btbn", btbc(int ), (int)7);
        }
        var3_1 = gw$FinderState.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gw$FinderState.eh - gw$FinderState.btam("btbo", btaj(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gw$FinderState.btam("btbp", btbc(int ), (int)8)) break;
            v1 /* !! */  = (long)gw$FinderState.btam("btbq", btbc(int ), (int)9);
        }
        var2_2 /* !! */  = gw$FinderState.b;
        v2 /* !! */  = gw$FinderState.eh;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - gw$FinderState.btam("btbr", btaj(int ), (int)17));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1886735503: {
                    v3 = gw$FinderState.btam("btbs", btaj(int ), (int)18);
                    continue block13;
                }
                case -1321076795: {
                    break block13;
                }
                case -27328906: {
                    v3 = gw$FinderState.btam("btbt", btaj(int ), (int)19);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = gw$FinderState.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gw$FinderState.eh - gw$FinderState.btam("btbu", btaj(int ), (int)20)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gw$FinderState.btam("btbv", btbc(int ), (int)10)) break;
                    v4 /* !! */  = (long)gw$FinderState.btam("btbw", btbc(int ), (int)11);
                }
                return Enum.valueOf(gw$FinderState.class, var0);
            }
lbl45:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)gw$FinderState.btam("btbx", btbc(int ), (int)12);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)gw$FinderState.btam("btby", btbc(int ), (int)13);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)gw$FinderState.btam("btbz", btbc(int ), (int)14);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)gw$FinderState.btam("btca", btbc(int ), (int)15);
        } while (!var3_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ gw$FinderState[] $values() {
        block60: {
            while (true) {
                block61: {
                    if ((v0 /* !! */  = (cfr_temp_1 = gw$FinderState.eh - gw$FinderState.btam("btce", btaj(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  != gw$FinderState.btam("btcf", btbc(int ), (int)19)) break block61;
                    var2 = gw$FinderState.c;
                    v1 /* !! */  = gw$FinderState.eh;
                    if (true) ** GOTO lbl12
                }
                v0 /* !! */  = (long)gw$FinderState.btam("btcg", btbc(int ), (int)20);
            }
            block39: while (true) {
                v1 /* !! */  = (long)(v2 - gw$FinderState.btam("btch", btaj(int ), (int)22));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1321076795: {
                        break block39;
                    }
                    case 1159157087: {
                        v2 = gw$FinderState.btam("btci", btaj(int ), (int)23);
                        continue block39;
                    }
                    case 1987875377: {
                        v2 = gw$FinderState.btam("btcj", btaj(int ), (int)24);
                        continue block39;
                    }
                    case 2027530428: {
                        v2 = gw$FinderState.btam("btck", btaj(int ), (int)25);
                        continue block39;
                    }
                }
                break;
            }
            var1_1 /* !! */  = gw$FinderState.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = gw$FinderState.eh - gw$FinderState.btam("btcl", btaj(int ), (int)26)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == gw$FinderState.btam("btcm", btbc(int ), (int)21)) {
                    var0_2 = gw$FinderState.a;
                    if (var2) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)gw$FinderState.btam("btcn", btbc(int ), (int)22);
            }
            if (var0_2 || var0_2) {
                return null;
            }
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block41: do {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v4 = new gw$FinderState[11];
                        v5 = gw$FinderState.btam("btco", btbc(int ), (int)23);
                        v6 /* !! */  = gw$FinderState.eh;
                        block42: while (true) {
                            switch ((int)v6 /* !! */ ) {
                                case -1770151424: {
                                    v7 = gw$FinderState.btam("btcq", btaj(int ), (int)28);
                                    ** GOTO lbl56
                                }
                                case -1321076795: {
                                    break block42;
                                }
                                case -92535522: {
                                    v7 = gw$FinderState.btam("btcr", btaj(int ), (int)29);
                                    ** GOTO lbl56
                                }
                                case 543868479: {
                                    v7 = gw$FinderState.btam("btcs", btaj(int ), (int)30);
lbl56:
                                    // 3 sources

                                    v6 /* !! */  = (long)(v7 - gw$FinderState.btam("btcp", btaj(int ), (int)27));
                                    continue block42;
                                }
                            }
                            break;
                        }
                        v4[v5] = gw$FinderState.STOPPED;
                        v8 = gw$FinderState.btam("btct", btbc(int ), (int)24);
                        v9 /* !! */  = gw$FinderState.eh;
                        block43: while (true) {
                            switch ((int)v9 /* !! */ ) {
                                case -1321076795: {
                                    break block43;
                                }
                                case -570610887: {
                                    v9 /* !! */  = (long)(gw$FinderState.btam("btcv", btaj(int ), (int)32) - gw$FinderState.btam("btcu", btaj(int ), (int)31));
                                    continue block43;
                                }
                            }
                            break;
                        }
                        v4[v8] = gw$FinderState.EXPLORING;
                        v10 = gw$FinderState.btam("btcw", btbc(int ), (int)25);
                        while (true) {
                            if ((v11 = (cfr_temp_3 = gw$FinderState.eh - gw$FinderState.btam("btcx", btaj(int ), (int)33)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v11 == gw$FinderState.btam("btcy", btbc(int ), (int)26)) {
                                v4[v10] = gw$FinderState.TELEPORTING_ABOVE_TARGET;
                                v12 = gw$FinderState.btam("btcz", btbc(int ), (int)27);
                                ** break;
                            }
                            v11 = -567304211;
                        }
                    }
                    case 0: {
                        ** GOTO lbl150
                    }
                    case 3: {
                        break block60;
                    }
lbl82:
                    // 1 sources

                    while (true) {
                        if ((v13 = (cfr_temp_4 = gw$FinderState.eh - gw$FinderState.btam("btda", btaj(int ), (int)34)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v13 == gw$FinderState.btam("btdb", btbc(int ), (int)28)) break;
                        v13 = -916788896;
                    }
                    v4[v12] = gw$FinderState.TELEPORTING_TO_NEARBY_TARGET;
                    v14 = gw$FinderState.btam("btdc", btbc(int ), (int)29);
                    v15 /* !! */  = gw$FinderState.eh;
                    block46: while (true) {
                        switch ((int)v15 /* !! */ ) {
                            case -1321076795: {
                                break block46;
                            }
                            case -104213337: {
                                v15 /* !! */  = (long)(gw$FinderState.btam("btde", btaj(int ), (int)36) - gw$FinderState.btam("btdd", btaj(int ), (int)35));
                                continue block46;
                            }
                        }
                        break;
                    }
                    v4[v14] = gw$FinderState.DESCENDING_TO_TARGET;
                    v16 = gw$FinderState.btam("btdf", btbc(int ), (int)30);
                    v17 /* !! */  = gw$FinderState.eh;
                    block47: while (true) {
                        switch ((int)v17 /* !! */ ) {
                            case -1321076795: {
                                break block47;
                            }
                            case 1668170963: {
                                v17 /* !! */  = (long)(gw$FinderState.btam("btdh", btaj(int ), (int)38) - gw$FinderState.btam("btdg", btaj(int ), (int)37));
                                continue block47;
                            }
                        }
                        break;
                    }
                    v4[v16] = gw$FinderState.OPENING_TARGET;
                    v18 = gw$FinderState.btam("btdi", btbc(int ), (int)31);
                    while (true) {
                        if ((v19 = (cfr_temp_5 = gw$FinderState.eh - gw$FinderState.btam("btdj", btaj(int ), (int)39)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v19 == gw$FinderState.btam("btdk", btbc(int ), (int)32)) break;
                        v19 = -597233655;
                    }
                    v4[v18] = gw$FinderState.REQUESTING_ENDER_CHEST;
                    v20 = gw$FinderState.btam("btdl", btbc(int ), (int)33);
                    v21 /* !! */  = gw$FinderState.eh;
                    block49: while (true) {
                        switch ((int)v21 /* !! */ ) {
                            case -1321076795: {
                                break block49;
                            }
                            case -675480214: {
                                v21 /* !! */  = (long)(gw$FinderState.btam("btdn", btaj(int ), (int)41) - gw$FinderState.btam("btdm", btaj(int ), (int)40));
                                continue block49;
                            }
                        }
                        break;
                    }
                    v4[v20] = gw$FinderState.OPENING_ENDER_MENU;
                    v22 = gw$FinderState.btam("btdo", btbc(int ), (int)34);
                    while (true) {
                        if ((v23 = (cfr_temp_6 = gw$FinderState.eh - gw$FinderState.btam("btdp", btaj(int ), (int)42)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                        if (v23 == gw$FinderState.btam("btdq", btbc(int ), (int)35)) break;
                        v23 = -1275235745;
                    }
                    v4[v22] = gw$FinderState.WAITING_ENDER_CHEST;
                    v24 = gw$FinderState.btam("btdr", btbc(int ), (int)36);
                    while (true) {
                        if ((v25 = (cfr_temp_7 = gw$FinderState.eh - gw$FinderState.btam("btds", btaj(int ), (int)43)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                        if (v25 == gw$FinderState.btam("btdt", btbc(int ), (int)37)) break;
                        v25 = 1595500641;
                    }
                    v4[v24] = gw$FinderState.DEPOSITING;
                    v26 = gw$FinderState.btam("btdu", btbc(int ), (int)38);
                    v27 /* !! */  = gw$FinderState.eh;
                    block52: while (true) {
                        switch ((int)v27 /* !! */ ) {
                            case -1516454372: {
                                v27 /* !! */  = (long)(gw$FinderState.btam("btdw", btaj(int ), (int)45) - gw$FinderState.btam("btdv", btaj(int ), (int)44));
                                continue block52;
                            }
                            case -1321076795: {
                                break block52;
                            }
                        }
                        break;
                    }
                    v4[v26] = gw$FinderState.RETURNING_TO_SURFACE;
                    return v4;
lbl150:
                    // 2 sources

                    while (true) {
                        var1_1 /* !! */  = (int)gw$FinderState.btam("btdx", btbc(int ), (int)39);
                        cfr_temp_0 = 1;
                        if (!var2) continue block41;
                        throw null;
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)gw$FinderState.btam("btdy", btbc(int ), (int)40);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            } while (true);
            var1_1 /* !! */  = (int)gw$FinderState.btam("btdz", btbc(int ), (int)41);
            if (var2) {
                throw null;
            }
        }
        var1_1 /* !! */  = (int)gw$FinderState.btam("btea", btbc(int ), (int)42);
        ** while (!var2)
lbl168:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void btep() {
        gw$FinderState.btal[0] = 7725320314358112764L;
        gw$FinderState.btal[1] = -3560519167351344448L;
        gw$FinderState.btal[2] = -8153367552816631560L;
        gw$FinderState.btal[3] = 3202888857331995577L;
        gw$FinderState.btal[4] = -2157651523989425738L;
        gw$FinderState.btal[5] = -4445956529550566969L;
        gw$FinderState.btal[6] = 8102606225452105712L;
        gw$FinderState.btal[7] = -6445697467677210892L;
        gw$FinderState.btal[8] = -2726858102456139327L;
        gw$FinderState.btal[9] = -5808847363380007627L;
        gw$FinderState.btal[10] = 6563861227296188942L;
        gw$FinderState.btal[11] = 512772911328458752L;
        gw$FinderState.btal[12] = 8214147798306811460L;
        gw$FinderState.btal[13] = -3650364429597230302L;
        gw$FinderState.btal[14] = 6191741337004352323L;
        gw$FinderState.btal[15] = -3722547455907860237L;
        gw$FinderState.btal[16] = 5266527696860990159L;
        gw$FinderState.btal[17] = -804898074022583178L;
        gw$FinderState.btal[18] = 5220227237884278490L;
        gw$FinderState.btal[19] = -7162306620442150871L;
        gw$FinderState.btal[20] = 1294432008855391670L;
        gw$FinderState.btal[21] = -2585333233910508697L;
        gw$FinderState.btal[22] = -4580592559703600295L;
        gw$FinderState.btal[23] = 3403516649150767606L;
        gw$FinderState.btal[24] = 8343005420489796161L;
        gw$FinderState.btal[25] = 4437173385505033794L;
        gw$FinderState.btal[26] = 1868897306572555225L;
        gw$FinderState.btal[27] = 474033892262791482L;
        gw$FinderState.btal[28] = -4180194192700709819L;
        gw$FinderState.btal[29] = 8468408255414401816L;
        gw$FinderState.btal[30] = 419025382581529671L;
        gw$FinderState.btal[31] = -8091972015859524725L;
        gw$FinderState.btal[32] = -6043303668743191436L;
        gw$FinderState.btal[33] = -7110272091456940186L;
        gw$FinderState.btal[34] = 2166587719779697499L;
        gw$FinderState.btal[35] = 7032240118000910966L;
        gw$FinderState.btal[36] = -7990834828996798459L;
        gw$FinderState.btal[37] = 5011594923148352821L;
        gw$FinderState.btal[38] = 694716483826833695L;
        gw$FinderState.btal[39] = 1012902802354908670L;
        gw$FinderState.btal[40] = -6350546840377656383L;
        gw$FinderState.btal[41] = 8133378778832285372L;
        gw$FinderState.btal[42] = -3561892914545370542L;
        gw$FinderState.btal[43] = 877490262402557051L;
        gw$FinderState.btal[44] = -5314320445759087062L;
        gw$FinderState.btal[45] = -6513707202106105391L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gw$FinderState[] values() {
        v0 /* !! */  = gw$FinderState.eh;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - gw$FinderState.btam("btan", btaj(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1454641455: {
                    v1 = gw$FinderState.btam("btao", btaj(int ), (int)1);
                    continue block28;
                }
                case -1321076795: {
                    break block28;
                }
                case 487697054: {
                    v1 = gw$FinderState.btam("btap", btaj(int ), (int)2);
                    continue block28;
                }
                case 2117807950: {
                    v1 = gw$FinderState.btam("btaq", btaj(int ), (int)3);
                    continue block28;
                }
            }
            break;
        }
        var2 = gw$FinderState.c;
        v2 /* !! */  = gw$FinderState.eh;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - gw$FinderState.btam("btar", btaj(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1788295994: {
                    v3 = gw$FinderState.btam("btas", btaj(int ), (int)5);
                    continue block29;
                }
                case -1321076795: {
                    break block29;
                }
                case -112758378: {
                    v3 = gw$FinderState.btam("btat", btaj(int ), (int)6);
                    continue block29;
                }
                case 1389540981: {
                    v3 = gw$FinderState.btam("btau", btaj(int ), (int)7);
                    continue block29;
                }
            }
            break;
        }
        var1_1 /* !! */  = gw$FinderState.b;
        v4 /* !! */  = gw$FinderState.eh;
        if (true) ** GOTO lbl39
        block30: while (true) {
            v4 /* !! */  = (long)(gw$FinderState.btam("btaw", btaj(int ), (int)9) - gw$FinderState.btam("btav", btaj(int ), (int)8));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1321076795: {
                    break block30;
                }
                case 1546662935: {
                    continue block30;
                }
            }
            break;
        }
        var0_2 = gw$FinderState.a;
        if (!var2) ** GOTO lbl51
        throw null;
        {
            if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
            switch (var1_1 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl51:
                // 1 sources

                if (var0_2 || var0_2) continue block31;
                v5 /* !! */  = gw$FinderState.eh;
                if (true) ** GOTO lbl56
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - gw$FinderState.btam("btax", btaj(int ), (int)10));
lbl56:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1653740696: {
                            v6 = gw$FinderState.btam("btay", btaj(int ), (int)11);
                            continue block32;
                        }
                        case -1321076795: {
                            break block32;
                        }
                        case 1112106751: {
                            v6 = gw$FinderState.btam("btaz", btaj(int ), (int)12);
                            continue block32;
                        }
                        case 1883162238: {
                            v6 = gw$FinderState.btam("btba", btaj(int ), (int)13);
                            continue block32;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = gw$FinderState.eh - gw$FinderState.btam("btbb", btaj(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == gw$FinderState.btam("btbf", btbc(int ), (int)0)) break;
                    v7 /* !! */  = (long)gw$FinderState.btam("btbg", btbc(int ), (int)1);
                }
                return (gw$FinderState[])gw$FinderState.$VALUES.clone();
                case 0: {
                    var1_1 /* !! */  = (int)gw$FinderState.btam("btbh", btbc(int ), (int)2);
                    if (!var2) break block31;
                    throw null;
                }
                case 1: {
                    do {
                        var1_1 /* !! */  = (int)gw$FinderState.btam("btbi", btbc(int ), (int)3);
                    } while (!var2);
                    throw null;
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = (int)gw$FinderState.btam("btbj", btbc(int ), (int)4);
                        if (!var2) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var1_1 /* !! */  = (int)gw$FinderState.btam("btbk", btbc(int ), (int)5);
        ** while (!var2)
lbl92:
        // 1 sources

        throw null;
    }

    static {
        btbd = new int[54];
        btbe = new int[54];
        gw$FinderState.btem();
        gw$FinderState.bten();
        btak = new long[46];
        btal = new long[46];
        gw$FinderState.bteo();
        gw$FinderState.btep();
        STOPPED = new gw$FinderState();
        EXPLORING = new gw$FinderState();
        TELEPORTING_ABOVE_TARGET = new gw$FinderState();
        TELEPORTING_TO_NEARBY_TARGET = new gw$FinderState();
        DESCENDING_TO_TARGET = new gw$FinderState();
        OPENING_TARGET = new gw$FinderState();
        REQUESTING_ENDER_CHEST = new gw$FinderState();
        OPENING_ENDER_MENU = new gw$FinderState();
        WAITING_ENDER_CHEST = new gw$FinderState();
        DEPOSITING = new gw$FinderState();
        RETURNING_TO_SURFACE = new gw$FinderState();
        $VALUES = gw$FinderState.$values();
    }

    public static /* synthetic */ CallSite btam(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bteo() {
        gw$FinderState.btak[0] = 4554781279835140935L;
        gw$FinderState.btak[1] = -5036090010810235369L;
        gw$FinderState.btak[2] = 8840395557839194642L;
        gw$FinderState.btak[3] = -4472787029042280251L;
        gw$FinderState.btak[4] = 7016865807610765355L;
        gw$FinderState.btak[5] = -4571383880352438026L;
        gw$FinderState.btak[6] = 3427019219435925845L;
        gw$FinderState.btak[7] = -7429712550796170540L;
        gw$FinderState.btak[8] = 8259422375144749499L;
        gw$FinderState.btak[9] = -4271873026290080652L;
        gw$FinderState.btak[10] = 9089531040340994971L;
        gw$FinderState.btak[11] = -8527876975691260899L;
        gw$FinderState.btak[12] = -7500872533764430201L;
        gw$FinderState.btak[13] = 2726113977208140396L;
        gw$FinderState.btak[14] = -231287405383338900L;
        gw$FinderState.btak[15] = -7930524058639826256L;
        gw$FinderState.btak[16] = 3046100632207178116L;
        gw$FinderState.btak[17] = -5896157067652121984L;
        gw$FinderState.btak[18] = 7359970329479734012L;
        gw$FinderState.btak[19] = 7724738935206886739L;
        gw$FinderState.btak[20] = 4630302198798815716L;
        gw$FinderState.btak[21] = 8699037435739514877L;
        gw$FinderState.btak[22] = -7615214287543692060L;
        gw$FinderState.btak[23] = 5924140595212404996L;
        gw$FinderState.btak[24] = 34910497831304585L;
        gw$FinderState.btak[25] = -5543173413138477238L;
        gw$FinderState.btak[26] = -7525088498567315314L;
        gw$FinderState.btak[27] = 2404948606695157075L;
        gw$FinderState.btak[28] = 5014145501636805514L;
        gw$FinderState.btak[29] = -6957125343424452256L;
        gw$FinderState.btak[30] = -5869620099147004339L;
        gw$FinderState.btak[31] = 5871858644581497874L;
        gw$FinderState.btak[32] = -7052641197615518501L;
        gw$FinderState.btak[33] = -6971732407059303823L;
        gw$FinderState.btak[34] = -3438433031546129727L;
        gw$FinderState.btak[35] = -760487289309054522L;
        gw$FinderState.btak[36] = 6186098131324615981L;
        gw$FinderState.btak[37] = 4997883279153815384L;
        gw$FinderState.btak[38] = -1323465158771997091L;
        gw$FinderState.btak[39] = 8020458313400050692L;
        gw$FinderState.btak[40] = 5112122992962985366L;
        gw$FinderState.btak[41] = 1092383541769469454L;
        gw$FinderState.btak[42] = 141446828949935987L;
        gw$FinderState.btak[43] = 5852452600943314768L;
        gw$FinderState.btak[44] = 749394260104383594L;
        gw$FinderState.btak[45] = 3541644667026749947L;
    }

    private static /* synthetic */ void btem() {
        gw$FinderState.btbd[0] = -160359562;
        gw$FinderState.btbd[1] = -599156237;
        gw$FinderState.btbd[2] = 736524211;
        gw$FinderState.btbd[3] = 700708248;
        gw$FinderState.btbd[4] = -1945326386;
        gw$FinderState.btbd[5] = 1234706681;
        gw$FinderState.btbd[6] = -82172304;
        gw$FinderState.btbd[7] = -992536266;
        gw$FinderState.btbd[8] = 490433325;
        gw$FinderState.btbd[9] = -1704207416;
        gw$FinderState.btbd[10] = 409815168;
        gw$FinderState.btbd[11] = 664424389;
        gw$FinderState.btbd[12] = -718830665;
        gw$FinderState.btbd[13] = -319269665;
        gw$FinderState.btbd[14] = 1623654654;
        gw$FinderState.btbd[15] = 525881757;
        gw$FinderState.btbd[16] = 1642430274;
        gw$FinderState.btbd[17] = 726529688;
        gw$FinderState.btbd[18] = -967333687;
        gw$FinderState.btbd[19] = 934402869;
        gw$FinderState.btbd[20] = -896636555;
        gw$FinderState.btbd[21] = -961327471;
        gw$FinderState.btbd[22] = 435052642;
        gw$FinderState.btbd[23] = 736359955;
        gw$FinderState.btbd[24] = 1069236997;
        gw$FinderState.btbd[25] = 329235625;
        gw$FinderState.btbd[26] = -377139280;
        gw$FinderState.btbd[27] = 1728762762;
        gw$FinderState.btbd[28] = -557916330;
        gw$FinderState.btbd[29] = 803902801;
        gw$FinderState.btbd[30] = -59062826;
        gw$FinderState.btbd[31] = -511633304;
        gw$FinderState.btbd[32] = -7314726;
        gw$FinderState.btbd[33] = 772045882;
        gw$FinderState.btbd[34] = 139403708;
        gw$FinderState.btbd[35] = -887281005;
        gw$FinderState.btbd[36] = 1690874999;
        gw$FinderState.btbd[37] = 841048127;
        gw$FinderState.btbd[38] = -265297708;
        gw$FinderState.btbd[39] = 69544010;
        gw$FinderState.btbd[40] = 1633918104;
        gw$FinderState.btbd[41] = 1843606861;
        gw$FinderState.btbd[42] = 2127151746;
        gw$FinderState.btbd[43] = -2056215092;
        gw$FinderState.btbd[44] = 823043715;
        gw$FinderState.btbd[45] = -1578612619;
        gw$FinderState.btbd[46] = 501582572;
        gw$FinderState.btbd[47] = -624513386;
        gw$FinderState.btbd[48] = 16313162;
        gw$FinderState.btbd[49] = 1064444726;
        gw$FinderState.btbd[50] = -1690889525;
        gw$FinderState.btbd[51] = 1597237510;
        gw$FinderState.btbd[52] = -138908995;
        gw$FinderState.btbd[53] = -716641741;
    }

    private static /* synthetic */ void bten() {
        gw$FinderState.btbe[0] = -160359561;
        gw$FinderState.btbe[1] = -1139991858;
        gw$FinderState.btbe[2] = 736524210;
        gw$FinderState.btbe[3] = 700708249;
        gw$FinderState.btbe[4] = -1945326386;
        gw$FinderState.btbe[5] = 1234706680;
        gw$FinderState.btbe[6] = 82172303;
        gw$FinderState.btbe[7] = 1569969123;
        gw$FinderState.btbe[8] = -490433326;
        gw$FinderState.btbe[9] = -1400036871;
        gw$FinderState.btbe[10] = -409815169;
        gw$FinderState.btbe[11] = 913106330;
        gw$FinderState.btbe[12] = -718830667;
        gw$FinderState.btbe[13] = -319269665;
        gw$FinderState.btbe[14] = 1623654655;
        gw$FinderState.btbe[15] = 525881757;
        gw$FinderState.btbe[16] = 1642430275;
        gw$FinderState.btbe[17] = 726529689;
        gw$FinderState.btbe[18] = -967333688;
        gw$FinderState.btbe[19] = 934402868;
        gw$FinderState.btbe[20] = -1711369091;
        gw$FinderState.btbe[21] = -961327472;
        gw$FinderState.btbe[22] = -1542518545;
        gw$FinderState.btbe[23] = 736359955;
        gw$FinderState.btbe[24] = 1069236996;
        gw$FinderState.btbe[25] = 329235627;
        gw$FinderState.btbe[26] = -377139279;
        gw$FinderState.btbe[27] = 1728762761;
        gw$FinderState.btbe[28] = -557916329;
        gw$FinderState.btbe[29] = 803902805;
        gw$FinderState.btbe[30] = -59062829;
        gw$FinderState.btbe[31] = -511633298;
        gw$FinderState.btbe[32] = 7314725;
        gw$FinderState.btbe[33] = 772045885;
        gw$FinderState.btbe[34] = 139403700;
        gw$FinderState.btbe[35] = -887281006;
        gw$FinderState.btbe[36] = 1690875006;
        gw$FinderState.btbe[37] = -841048128;
        gw$FinderState.btbe[38] = -265297698;
        gw$FinderState.btbe[39] = 69544010;
        gw$FinderState.btbe[40] = 1633918107;
        gw$FinderState.btbe[41] = 1843606862;
        gw$FinderState.btbe[42] = 2127151746;
        gw$FinderState.btbe[43] = -2056215092;
        gw$FinderState.btbe[44] = 823043714;
        gw$FinderState.btbe[45] = -1578612617;
        gw$FinderState.btbe[46] = 501582575;
        gw$FinderState.btbe[47] = -624513390;
        gw$FinderState.btbe[48] = 16313167;
        gw$FinderState.btbe[49] = 1064444720;
        gw$FinderState.btbe[50] = -1690889524;
        gw$FinderState.btbe[51] = 1597237518;
        gw$FinderState.btbe[52] = -138909004;
        gw$FinderState.btbe[53] = -716641735;
    }

    private static /* synthetic */ int btbc(int n2) {
        return btbd[n2] ^ btbe[n2];
    }
}

