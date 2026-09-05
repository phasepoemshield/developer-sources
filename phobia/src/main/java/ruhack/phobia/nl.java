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
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class nl {
    public static final boolean c;
    public static final long of = -8772822010887779212L;
    private static long[] hfel;
    public static final int b;
    int fps;
    private static int[] hfec;
    public static final boolean a;
    public static final nl INSTANCE;
    private static int[] hfeb;
    final List<Long> records;
    private static long[] hfek;

    static {
        hfeb = new int[54];
        hfec = new int[54];
        nl.hfii();
        nl.hfij();
        hfek = new long[51];
        hfel = new long[51];
        nl.hfik();
        nl.hfil();
        INSTANCE = new nl();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void recordFrame() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nl.of - nl.hfed("hfem", hfej(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nl.hfed("hfen", hfea(int ), (int)5)) break;
            v0 /* !! */  = (long)nl.hfed("hfeo", hfea(int ), (int)6);
        }
        var5_1 = nl.c;
        v1 /* !! */  = nl.of;
        if (true) ** GOTO lbl11
        block53: while (true) {
            v1 /* !! */  = (long)(v2 - nl.hfed("hfep", hfej(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1957802892: {
                    break block53;
                }
                case 791116437: {
                    v2 = nl.hfed("hfeq", hfej(int ), (int)2);
                    continue block53;
                }
                case 1415058379: {
                    v2 = nl.hfed("hfer", hfej(int ), (int)3);
                    continue block53;
                }
            }
            break;
        }
        var4_2 /* !! */  = nl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nl.of - nl.hfed("hfes", hfej(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nl.hfed("hfet", hfea(int ), (int)7)) break;
            v3 /* !! */  = (long)nl.hfed("hfeu", hfea(int ), (int)8);
        }
        var3_3 = nl.a;
        if (var5_1) {
            throw null;
lbl29:
            // 5 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = nl.of - nl.hfed("hfev", hfej(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nl.hfed("hfew", hfea(int ), (int)9)) break;
            v4 /* !! */  = (long)nl.hfed("hfex", hfea(int ), (int)10);
        }
        var1_4 = System.currentTimeMillis();
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl29
                v5 /* !! */  = nl.of;
                if (true) ** GOTO lbl46
                block57: while (true) {
                    v5 /* !! */  = (long)(v6 - nl.hfed("hfey", hfej(int ), (int)6));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1957802892: {
                            break block57;
                        }
                        case -319746384: {
                            v6 = nl.hfed("hfez", hfej(int ), (int)7);
                            continue block57;
                        }
                        case 339626826: {
                            v6 = nl.hfed("hffa", hfej(int ), (int)8);
                            continue block57;
                        }
                    }
                    break;
                }
                v7 /* !! */  = nl.of;
                if (true) ** GOTO lbl59
                block58: while (true) {
                    v7 /* !! */  = (long)(nl.hfed("hffc", hfej(int ), (int)10) - nl.hfed("hffb", hfej(int ), (int)9));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1957802892: {
                            break block58;
                        }
                        case 1808356019: {
                            continue block58;
                        }
                    }
                    break;
                }
                v8 = var1_4;
                v9 /* !! */  = nl.of;
                if (true) ** GOTO lbl69
                block59: while (true) {
                    v9 /* !! */  = (long)(nl.hfed("hffe", hfej(int ), (int)12) - nl.hfed("hffd", hfej(int ), (int)11));
lbl69:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1957802892: {
                            break block59;
                        }
                        case -474852046: {
                            continue block59;
                        }
                    }
                    break;
                }
                this.records.add(v8);
                if (var3_3 || var3_3) ** GOTO lbl29
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_3 = nl.of - nl.hfed("hfff", hfej(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nl.hfed("hffg", hfea(int ), (int)11)) break;
                    v10 /* !! */  = (long)nl.hfed("hffh", hfea(int ), (int)12);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_4 = nl.of - nl.hfed("hffi", hfej(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nl.hfed("hffj", hfea(int ), (int)13)) break;
                    v11 /* !! */  = (long)nl.hfed("hffk", hfea(int ), (int)14);
                }
                v12 = (Predicate<Long>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$recordFrame$0(java.lang.Long ), (Ljava/lang/Long;)Z)();
                v13 /* !! */  = nl.of;
                if (true) ** GOTO lbl92
                block62: while (true) {
                    v13 /* !! */  = (long)(nl.hfed("hffm", hfej(int ), (int)16) - nl.hfed("hffl", hfej(int ), (int)15));
lbl92:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1957802892: {
                            break block62;
                        }
                        case -1591159294: {
                            continue block62;
                        }
                    }
                    break;
                }
                this.records.removeIf(v12);
                if (var3_3 || var3_3) ** GOTO lbl29
                v14 /* !! */  = nl.of;
                if (true) ** GOTO lbl104
                block63: while (true) {
                    v14 /* !! */  = (long)(v15 - nl.hfed("hffn", hfej(int ), (int)17));
lbl104:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1957802892: {
                            break block63;
                        }
                        case -238600351: {
                            v15 = nl.hfed("hffo", hfej(int ), (int)18);
                            continue block63;
                        }
                        case 1580785403: {
                            v15 = nl.hfed("hffp", hfej(int ), (int)19);
                            continue block63;
                        }
                    }
                    break;
                }
                v16 /* !! */  = nl.of;
                if (true) ** GOTO lbl117
                block64: while (true) {
                    v16 /* !! */  = (long)(v17 - nl.hfed("hffq", hfej(int ), (int)20));
lbl117:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1957802892: {
                            break block64;
                        }
                        case -437565216: {
                            v17 = nl.hfed("hffr", hfej(int ), (int)21);
                            continue block64;
                        }
                        case 1643213036: {
                            v17 = nl.hfed("hffs", hfej(int ), (int)22);
                            continue block64;
                        }
                    }
                    break;
                }
                v18 = this.records.size();
                v19 = nl.hfed("hfft", hfea(int ), (int)15);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = nl.of - nl.hfed("hffu", hfej(int ), (int)23)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == nl.hfed("hffv", hfea(int ), (int)16)) break;
                    v20 /* !! */  = (long)nl.hfed("hffw", hfea(int ), (int)17);
                }
                v21 = Math.max(v18, (int)v19);
                v22 /* !! */  = nl.of;
                if (true) ** GOTO lbl138
                block66: while (true) {
                    v22 /* !! */  = (long)(v23 - nl.hfed("hffx", hfej(int ), (int)24));
lbl138:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1957802892: {
                            break block66;
                        }
                        case -710454107: {
                            v23 = nl.hfed("hffy", hfej(int ), (int)25);
                            continue block66;
                        }
                        case 357192374: {
                            v23 = nl.hfed("hffz", hfej(int ), (int)26);
                            continue block66;
                        }
                        case 551931429: {
                            v23 = nl.hfed("hfga", hfej(int ), (int)27);
                            continue block66;
                        }
                    }
                    break;
                }
                this.fps = v21;
                if (var3_3 || var3_3) ** continue;
                return;
            }
            case 0: {
                var4_2 /* !! */  = (int)nl.hfed("hfgb", hfea(int ), (int)18);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl158:
            // 3 sources

            case 1: {
                var4_2 /* !! */  = (int)nl.hfed("hfgc", hfea(int ), (int)19);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl163:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)nl.hfed("hfgd", hfea(int ), (int)20);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl168:
            // 3 sources

            case 3: {
                var4_2 /* !! */  = (int)nl.hfed("hfge", hfea(int ), (int)21);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl173:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)nl.hfed("hfgf", hfea(int ), (int)22);
                    if (!var5_1) ** GOTO lbl163
                    throw null;
                }
            }
            case 5: {
                var4_2 /* !! */  = (int)nl.hfed("hfgg", hfea(int ), (int)23);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 6: {
                var4_2 /* !! */  = (int)nl.hfed("hfgh", hfea(int ), (int)24);
                if (!var5_1) ** GOTO lbl168
                throw null;
            }
lbl187:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)nl.hfed("hfgi", hfea(int ), (int)25);
                if (!var5_1) ** GOTO lbl158
                throw null;
            }
lbl191:
            // 3 sources

            case 8: {
                var4_2 /* !! */  = (int)nl.hfed("hfgj", hfea(int ), (int)26);
                if (!var5_1) ** GOTO lbl173
                throw null;
            }
lbl195:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)nl.hfed("hfgk", hfea(int ), (int)27);
                if (!var5_1) ** GOTO lbl158
                throw null;
            }
            case 10: {
                var4_2 /* !! */  = (int)nl.hfed("hfgl", hfea(int ), (int)28);
                if (!var5_1) ** GOTO lbl168
                throw null;
            }
            case 11: 
        }
        var4_2 /* !! */  = (int)nl.hfed("hfgm", hfea(int ), (int)29);
        ** while (!var5_1)
lbl206:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int hfea(int n2) {
        return hfeb[n2] ^ hfec[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$recordFrame$0(Long var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nl.of - nl.hfed("hfhg", hfej(int ), (int)42)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nl.hfed("hfhh", hfea(int ), (int)35)) break;
            v0 /* !! */  = (long)nl.hfed("hfhi", hfea(int ), (int)36);
        }
        var3_1 = nl.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nl.of - nl.hfed("hfhj", hfej(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nl.hfed("hfhk", hfea(int ), (int)37)) break;
            v1 /* !! */  = (long)nl.hfed("hfhl", hfea(int ), (int)38);
        }
        var2_2 /* !! */  = nl.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nl.of - nl.hfed("hfhm", hfej(int ), (int)44)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nl.hfed("hfhn", hfea(int ), (int)39)) break;
            v2 /* !! */  = (long)nl.hfed("hfho", hfea(int ), (int)40);
        }
        var1_3 = nl.a;
        if (var3_1) {
            throw null;
lbl24:
            // 4 sources

            return (boolean)nl.hfed("hfhp", hfea(int ), (int)41);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = nl.of - nl.hfed("hfhq", hfej(int ), (int)45)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nl.hfed("hfhr", hfea(int ), (int)42)) break;
                    v3 /* !! */  = (long)nl.hfed("hfhs", hfea(int ), (int)43);
                }
                v4 = var0 + nl.hfed("hfht", hfej(int ), (int)46);
                v5 /* !! */  = nl.of;
                if (true) ** GOTO lbl42
                block21: while (true) {
                    v5 /* !! */  = (long)(v6 - nl.hfed("hfhu", hfej(int ), (int)47));
lbl42:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1957802892: {
                            break block21;
                        }
                        case -571304617: {
                            v6 = nl.hfed("hfhv", hfej(int ), (int)48);
                            continue block21;
                        }
                        case 521806601: {
                            v6 = nl.hfed("hfhw", hfej(int ), (int)49);
                            continue block21;
                        }
                        case 1120972616: {
                            v6 = nl.hfed("hfhx", hfej(int ), (int)50);
                            continue block21;
                        }
                    }
                    break;
                }
                if (v4 >= System.currentTimeMillis()) ** GOTO lbl60
                if (var1_3) ** GOTO lbl24
                v7 = nl.hfed("hfhy", hfea(int ), (int)44);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl63
lbl60:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v7 = nl.hfed("hfhz", hfea(int ), (int)45);
lbl63:
                // 2 sources

                return (boolean)v7;
            }
lbl64:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)nl.hfed("hfia", hfea(int ), (int)46);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 1: {
                var2_2 /* !! */  = (int)nl.hfed("hfib", hfea(int ), (int)47);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)nl.hfed("hfic", hfea(int ), (int)48);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)nl.hfed("hfid", hfea(int ), (int)49);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)nl.hfed("hfie", hfea(int ), (int)50);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nl.hfed("hfif", hfea(int ), (int)51);
                    if (!var3_1) break block0;
                    throw null;
                }
            }
lbl91:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)nl.hfed("hfig", hfea(int ), (int)52);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)nl.hfed("hfih", hfea(int ), (int)53);
        ** while (!var3_1)
lbl98:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long hfej(int n2) {
        return hfek[n2] ^ hfel[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public nl() {
        var2_1 /* !! */  = nl.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.records = new ArrayList<Long>();
                this.fps = (int)nl.hfed("hfee", hfea(int ), (int)0);
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)nl.hfed("hfef", hfea(int ), (int)1);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)nl.hfed("hfeg", hfea(int ), (int)2);
                    continue;
                    break;
                }
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)nl.hfed("hfeh", hfea(int ), (int)3);
                }
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)nl.hfed("hfei", hfea(int ), (int)4);
        ** while (true)
    }

    public static /* synthetic */ CallSite hfed(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getFps() {
        v0 /* !! */  = nl.of;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - nl.hfed("hfgn", hfej(int ), (int)28));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1957802892: {
                    break block28;
                }
                case -1627485716: {
                    v1 = nl.hfed("hfgo", hfej(int ), (int)29);
                    continue block28;
                }
                case -229501803: {
                    v1 = nl.hfed("hfgp", hfej(int ), (int)30);
                    continue block28;
                }
                case 419444088: {
                    v1 = nl.hfed("hfgq", hfej(int ), (int)31);
                    continue block28;
                }
            }
            break;
        }
        var3_1 = nl.c;
        v2 /* !! */  = nl.of;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - nl.hfed("hfgr", hfej(int ), (int)32));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1957802892: {
                    break block29;
                }
                case -751516176: {
                    v3 = nl.hfed("hfgs", hfej(int ), (int)33);
                    continue block29;
                }
                case -266434395: {
                    v3 = nl.hfed("hfgt", hfej(int ), (int)34);
                    continue block29;
                }
                case 897060683: {
                    v3 = nl.hfed("hfgu", hfej(int ), (int)35);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = nl.b;
        v4 /* !! */  = nl.of;
        if (true) ** GOTO lbl39
        block30: while (true) {
            v4 /* !! */  = (long)(nl.hfed("hfgw", hfej(int ), (int)37) - nl.hfed("hfgv", hfej(int ), (int)36));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1957802892: {
                    break block30;
                }
                case 1541004337: {
                    continue block30;
                }
            }
            break;
        }
        var1_3 = nl.a;
        if (var3_1) {
            throw null;
            return (int)nl.hfed("hfgx", hfea(int ), (int)30);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v5 /* !! */  = nl.of;
                if (true) ** GOTO lbl57
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - nl.hfed("hfgy", hfej(int ), (int)38));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1957802892: {
                            break block32;
                        }
                        case -905499867: {
                            v6 = nl.hfed("hfgz", hfej(int ), (int)39);
                            continue block32;
                        }
                        case 310130925: {
                            v6 = nl.hfed("hfha", hfej(int ), (int)40);
                            continue block32;
                        }
                        case 564300912: {
                            v6 = nl.hfed("hfhb", hfej(int ), (int)41);
                            continue block32;
                        }
                    }
                    break;
                }
                return this.fps;
            }
lbl70:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)nl.hfed("hfhc", hfea(int ), (int)31);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl79
            }
lbl75:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nl.hfed("hfhd", hfea(int ), (int)32);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
lbl79:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nl.hfed("hfhe", hfea(int ), (int)33);
                    if (!var3_1) ** GOTO lbl75
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nl.hfed("hfhf", hfea(int ), (int)34);
        ** while (!var3_1)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hfij() {
        nl.hfec[0] = -1953854162;
        nl.hfec[1] = -1519384736;
        nl.hfec[2] = -1522819002;
        nl.hfec[3] = -1162779835;
        nl.hfec[4] = 1438901562;
        nl.hfec[5] = -1638957872;
        nl.hfec[6] = 1116595752;
        nl.hfec[7] = 39040617;
        nl.hfec[8] = 1330128990;
        nl.hfec[9] = -201148017;
        nl.hfec[10] = -1222684671;
        nl.hfec[11] = 2139380306;
        nl.hfec[12] = -1823070076;
        nl.hfec[13] = 937042003;
        nl.hfec[14] = 743840390;
        nl.hfec[15] = -249794585;
        nl.hfec[16] = 1195471626;
        nl.hfec[17] = 1853737563;
        nl.hfec[18] = 547475545;
        nl.hfec[19] = 585083776;
        nl.hfec[20] = -1061698948;
        nl.hfec[21] = -2080694277;
        nl.hfec[22] = -1649830479;
        nl.hfec[23] = -612912624;
        nl.hfec[24] = 1535684038;
        nl.hfec[25] = 2083967515;
        nl.hfec[26] = -828754285;
        nl.hfec[27] = -985619381;
        nl.hfec[28] = 183253995;
        nl.hfec[29] = -1118258280;
        nl.hfec[30] = -1008143144;
        nl.hfec[31] = 1209758582;
        nl.hfec[32] = 60959189;
        nl.hfec[33] = 1410575203;
        nl.hfec[34] = 201210425;
        nl.hfec[35] = 788639606;
        nl.hfec[36] = -830471834;
        nl.hfec[37] = -1164694214;
        nl.hfec[38] = 1184231471;
        nl.hfec[39] = 1357863817;
        nl.hfec[40] = 602963402;
        nl.hfec[41] = -1172425339;
        nl.hfec[42] = -2116730101;
        nl.hfec[43] = -713037917;
        nl.hfec[44] = 397209814;
        nl.hfec[45] = 112770600;
        nl.hfec[46] = 1761295320;
        nl.hfec[47] = -1434676887;
        nl.hfec[48] = 1293226056;
        nl.hfec[49] = 542226237;
        nl.hfec[50] = -569143030;
        nl.hfec[51] = -1386370981;
        nl.hfec[52] = 503716919;
        nl.hfec[53] = -1777245422;
    }

    private static /* synthetic */ void hfik() {
        nl.hfek[0] = -2438608769983530825L;
        nl.hfek[1] = -8162178115713186846L;
        nl.hfek[2] = 8054414177530601373L;
        nl.hfek[3] = -5270805530976335877L;
        nl.hfek[4] = 7932595819676088056L;
        nl.hfek[5] = 4021810201363038875L;
        nl.hfek[6] = -2638779115926704589L;
        nl.hfek[7] = 1945235758800334348L;
        nl.hfek[8] = 7032330699469070420L;
        nl.hfek[9] = -652089099861748946L;
        nl.hfek[10] = -3489359770357201892L;
        nl.hfek[11] = 3241676096824702012L;
        nl.hfek[12] = 5417062692374751260L;
        nl.hfek[13] = 1410695714447757345L;
        nl.hfek[14] = -7081713648893354353L;
        nl.hfek[15] = -6874081580012028216L;
        nl.hfek[16] = 2879692438473515207L;
        nl.hfek[17] = -1556409113499100829L;
        nl.hfek[18] = 3636805549856715559L;
        nl.hfek[19] = 3764661503373178565L;
        nl.hfek[20] = -8432446143604485363L;
        nl.hfek[21] = -4267603938073223939L;
        nl.hfek[22] = 1923632536924576379L;
        nl.hfek[23] = 9058325965258160525L;
        nl.hfek[24] = -5202080450442039133L;
        nl.hfek[25] = -3127232237341293111L;
        nl.hfek[26] = -5709896588752090824L;
        nl.hfek[27] = -3324064034397694235L;
        nl.hfek[28] = 3479956626468974377L;
        nl.hfek[29] = -8289629343825393445L;
        nl.hfek[30] = 4879321497637465612L;
        nl.hfek[31] = 5589802655869478931L;
        nl.hfek[32] = -7596249553387861577L;
        nl.hfek[33] = -6260622081313101546L;
        nl.hfek[34] = 715068377315464835L;
        nl.hfek[35] = -7047664789161840590L;
        nl.hfek[36] = -781910572664910805L;
        nl.hfek[37] = -4847147118577770520L;
        nl.hfek[38] = 1401041066754391339L;
        nl.hfek[39] = 2510437948453195394L;
        nl.hfek[40] = 3104947836077641654L;
        nl.hfek[41] = -990715158103837478L;
        nl.hfek[42] = -7477554205733880661L;
        nl.hfek[43] = 7196500847718575949L;
        nl.hfek[44] = -3659264180078146848L;
        nl.hfek[45] = -5096541046222051261L;
        nl.hfek[46] = -2022570948247736846L;
        nl.hfek[47] = 697567103157584290L;
        nl.hfek[48] = 6349417882786537769L;
        nl.hfek[49] = -2231608427376091607L;
        nl.hfek[50] = 3182828293643709698L;
    }

    private static /* synthetic */ void hfii() {
        nl.hfeb[0] = -1953854165;
        nl.hfeb[1] = -1519384736;
        nl.hfeb[2] = -1522819002;
        nl.hfeb[3] = -1162779836;
        nl.hfeb[4] = 1438901562;
        nl.hfeb[5] = 1638957871;
        nl.hfeb[6] = -1288959333;
        nl.hfeb[7] = -39040618;
        nl.hfeb[8] = 1036348644;
        nl.hfeb[9] = 201148016;
        nl.hfeb[10] = 950141547;
        nl.hfeb[11] = -2139380307;
        nl.hfeb[12] = 552516145;
        nl.hfeb[13] = -937042004;
        nl.hfeb[14] = -226936478;
        nl.hfeb[15] = -249794589;
        nl.hfeb[16] = -1195471627;
        nl.hfeb[17] = -2094211331;
        nl.hfeb[18] = 547475539;
        nl.hfeb[19] = 585083778;
        nl.hfeb[20] = -1061698956;
        nl.hfeb[21] = -2080694285;
        nl.hfeb[22] = -1649830474;
        nl.hfeb[23] = -612912621;
        nl.hfeb[24] = 1535684037;
        nl.hfeb[25] = 2083967505;
        nl.hfeb[26] = -828754280;
        nl.hfeb[27] = -985619389;
        nl.hfeb[28] = 183253992;
        nl.hfeb[29] = -1118258277;
        nl.hfeb[30] = 1091536519;
        nl.hfeb[31] = 1209758582;
        nl.hfeb[32] = 60959188;
        nl.hfeb[33] = 1410575202;
        nl.hfeb[34] = 201210426;
        nl.hfeb[35] = -788639607;
        nl.hfeb[36] = 2120468953;
        nl.hfeb[37] = 1164694213;
        nl.hfeb[38] = 1315529992;
        nl.hfeb[39] = -1357863818;
        nl.hfeb[40] = 1730901547;
        nl.hfeb[41] = -1172425340;
        nl.hfeb[42] = 2116730100;
        nl.hfeb[43] = 1497502785;
        nl.hfeb[44] = 397209815;
        nl.hfeb[45] = 112770600;
        nl.hfeb[46] = 1761295326;
        nl.hfeb[47] = -1434676882;
        nl.hfeb[48] = 1293226063;
        nl.hfeb[49] = 542226235;
        nl.hfeb[50] = -569143029;
        nl.hfeb[51] = -1386370984;
        nl.hfeb[52] = 503716915;
        nl.hfeb[53] = -1777245417;
    }

    private static /* synthetic */ void hfil() {
        nl.hfel[0] = 3603534699877500242L;
        nl.hfel[1] = -106130587865320959L;
        nl.hfel[2] = 4600681538525667423L;
        nl.hfel[3] = -1882223504624961127L;
        nl.hfel[4] = 7434395943068664194L;
        nl.hfel[5] = -7136375357332756800L;
        nl.hfel[6] = 1263532778481909867L;
        nl.hfel[7] = 4830797148633638743L;
        nl.hfel[8] = -2448742317355902265L;
        nl.hfel[9] = -958772852256116406L;
        nl.hfel[10] = -106827986860924892L;
        nl.hfel[11] = 6595147247734202132L;
        nl.hfel[12] = -6384651128028108753L;
        nl.hfel[13] = 3407966173208551849L;
        nl.hfel[14] = -6074534203202871692L;
        nl.hfel[15] = 4919199057243355974L;
        nl.hfel[16] = 3752625305416575603L;
        nl.hfel[17] = -4565162183266044533L;
        nl.hfel[18] = -1559431155242843214L;
        nl.hfel[19] = 513990615983536318L;
        nl.hfel[20] = 1751997549988515439L;
        nl.hfel[21] = -6628418746525374434L;
        nl.hfel[22] = 6537244063904821865L;
        nl.hfel[23] = 8567341420977987486L;
        nl.hfel[24] = 6007714118245350766L;
        nl.hfel[25] = -5647170098958777687L;
        nl.hfel[26] = -7329367648015696144L;
        nl.hfel[27] = -1994149701829891020L;
        nl.hfel[28] = 6528008627956514812L;
        nl.hfel[29] = -511297165008741284L;
        nl.hfel[30] = 5355534681900083889L;
        nl.hfel[31] = 7796584231655840126L;
        nl.hfel[32] = 1408346900628980635L;
        nl.hfel[33] = 8726216611729112008L;
        nl.hfel[34] = 3577586185188995000L;
        nl.hfel[35] = 1515680335962133107L;
        nl.hfel[36] = 1783667193272058931L;
        nl.hfel[37] = 6559367237516541492L;
        nl.hfel[38] = -695890762902721112L;
        nl.hfel[39] = -11144121980346237L;
        nl.hfel[40] = 8980492051936251750L;
        nl.hfel[41] = 9142987810647119262L;
        nl.hfel[42] = 1634237549661746134L;
        nl.hfel[43] = 5879290353437203227L;
        nl.hfel[44] = 7369957182585263170L;
        nl.hfel[45] = 880972855898293970L;
        nl.hfel[46] = -2022570948247736806L;
        nl.hfel[47] = -8788162136599296774L;
        nl.hfel[48] = -6928711668110709693L;
        nl.hfel[49] = -7407111439064372479L;
        nl.hfel[50] = 8011454276142018961L;
    }
}

