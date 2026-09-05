/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

final class dw$RollingText {
    private long switchAt;
    private String current;
    private static final long ma = -4031307623732918029L;
    private static long[] fhft;
    public static final boolean a;
    private String previous;
    public static final boolean c;
    private static int[] fhfx;
    public static final int b;
    private static int[] fhfy;
    private static long[] fhfs;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void update(String var1_1, long var2_2) {
        v0 /* !! */  = dw$RollingText.ma;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(dw$RollingText.fhfu("fhgd", fhfr(int ), (int)2) - dw$RollingText.fhfu("fhgc", fhfr(int ), (int)1));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1466771143: {
                    continue block45;
                }
                case 856901875: {
                    break block45;
                }
            }
            break;
        }
        var6_3 = dw$RollingText.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dw$RollingText.ma - dw$RollingText.fhfu("fhge", fhfr(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dw$RollingText.fhfu("fhgf", fhfw(int ), (int)3)) break;
            v1 /* !! */  = (long)dw$RollingText.fhfu("fhgg", fhfw(int ), (int)4);
        }
        var5_4 /* !! */  = dw$RollingText.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = dw$RollingText.ma - dw$RollingText.fhfu("fhgh", fhfr(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dw$RollingText.fhfu("fhgi", fhfw(int ), (int)5)) break;
            v2 /* !! */  = (long)dw$RollingText.fhfu("fhgj", fhfw(int ), (int)6);
        }
        var4_5 = dw$RollingText.a;
        if (var6_3) {
            throw null;
lbl25:
            // 10 sources

            return;
        }
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5 || var4_5) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dw$RollingText.ma - dw$RollingText.fhfu("fhgk", fhfr(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dw$RollingText.fhfu("fhgl", fhfw(int ), (int)7)) break;
                    v3 /* !! */  = (long)dw$RollingText.fhfu("fhgm", fhfw(int ), (int)8);
                }
                if (this.current != null) ** GOTO lbl56
                if (var4_5) ** GOTO lbl25
                v4 /* !! */  = dw$RollingText.ma;
                if (true) ** GOTO lbl42
                block50: while (true) {
                    v4 /* !! */  = (long)(v5 - dw$RollingText.fhfu("fhgn", fhfr(int ), (int)6));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2022787032: {
                            v5 = dw$RollingText.fhfu("fhgo", fhfr(int ), (int)7);
                            continue block50;
                        }
                        case -1817498989: {
                            v5 = dw$RollingText.fhfu("fhgp", fhfr(int ), (int)8);
                            continue block50;
                        }
                        case 856901875: {
                            break block50;
                        }
                    }
                    break;
                }
                this.current = var1_1;
                if (var4_5) ** GOTO lbl25
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl125
lbl56:
                // 1 sources

                if (var4_5 || var4_5) ** GOTO lbl25
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = dw$RollingText.ma - dw$RollingText.fhfu("fhgq", fhfr(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == dw$RollingText.fhfu("fhgr", fhfw(int ), (int)9)) break;
                    v6 /* !! */  = (long)dw$RollingText.fhfu("fhgs", fhfw(int ), (int)10);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = dw$RollingText.ma - dw$RollingText.fhfu("fhgt", fhfr(int ), (int)10)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == dw$RollingText.fhfu("fhgu", fhfw(int ), (int)11)) break;
                    v7 /* !! */  = (long)dw$RollingText.fhfu("fhgv", fhfw(int ), (int)12);
                }
                if (this.current.equals(var1_1)) ** GOTO lbl125
                if (var4_5) ** GOTO lbl25
                v8 /* !! */  = dw$RollingText.ma;
                if (true) ** GOTO lbl73
                block53: while (true) {
                    v8 /* !! */  = (long)(v9 - dw$RollingText.fhfu("fhgw", fhfr(int ), (int)11));
lbl73:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 49971742: {
                            v9 = dw$RollingText.fhfu("fhgx", fhfr(int ), (int)12);
                            continue block53;
                        }
                        case 856901875: {
                            break block53;
                        }
                        case 951913340: {
                            v9 = dw$RollingText.fhfu("fhgy", fhfr(int ), (int)13);
                            continue block53;
                        }
                        case 1146755016: {
                            v9 = dw$RollingText.fhfu("fhgz", fhfr(int ), (int)14);
                            continue block53;
                        }
                    }
                    break;
                }
                if (this.animating(var2_2)) ** GOTO lbl125
                if (var4_5 || var4_5) ** GOTO lbl25
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = dw$RollingText.ma - dw$RollingText.fhfu("fhha", fhfr(int ), (int)15)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == dw$RollingText.fhfu("fhhb", fhfw(int ), (int)13)) break;
                    v10 /* !! */  = (long)dw$RollingText.fhfu("fhhc", fhfw(int ), (int)14);
                }
                v11 /* !! */  = dw$RollingText.ma;
                if (true) ** GOTO lbl96
                block55: while (true) {
                    v11 /* !! */  = (long)(dw$RollingText.fhfu("fhhe", fhfr(int ), (int)17) - dw$RollingText.fhfu("fhhd", fhfr(int ), (int)16));
lbl96:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1289290932: {
                            continue block55;
                        }
                        case 856901875: {
                            break block55;
                        }
                    }
                    break;
                }
                this.previous = this.current;
                if (var4_5 || var4_5) ** GOTO lbl25
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = dw$RollingText.ma - dw$RollingText.fhfu("fhhf", fhfr(int ), (int)18)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == dw$RollingText.fhfu("fhhg", fhfw(int ), (int)15)) break;
                    v12 /* !! */  = (long)dw$RollingText.fhfu("fhhh", fhfw(int ), (int)16);
                }
                this.current = var1_1;
                if (var4_5 || var4_5) ** GOTO lbl25
                v13 /* !! */  = dw$RollingText.ma;
                if (true) ** GOTO lbl114
                block57: while (true) {
                    v13 /* !! */  = (long)(v14 - dw$RollingText.fhfu("fhhi", fhfr(int ), (int)19));
lbl114:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -966907693: {
                            v14 = dw$RollingText.fhfu("fhhj", fhfr(int ), (int)20);
                            continue block57;
                        }
                        case 856901875: {
                            break block57;
                        }
                        case 1467654629: {
                            v14 = dw$RollingText.fhfu("fhhk", fhfr(int ), (int)21);
                            continue block57;
                        }
                    }
                    break;
                }
                this.switchAt = var2_2;
                if (var4_5) ** GOTO lbl25
lbl125:
                // 4 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return;
            }
lbl128:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhl", fhfw(int ), (int)17);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 1: {
                do {
                    var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhm", fhfw(int ), (int)18);
                } while (!var6_3);
                throw null;
            }
lbl138:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhn", fhfw(int ), (int)19);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl158
            }
            case 3: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhho", fhfw(int ), (int)20);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl172
            }
            case 4: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhp", fhfw(int ), (int)21);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 5: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhq", fhfw(int ), (int)22);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl202
            }
lbl158:
            // 4 sources

            case 6: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhr", fhfw(int ), (int)23);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl163:
            // 3 sources

            case 7: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhs", fhfw(int ), (int)24);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl168:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhht", fhfw(int ), (int)25);
                if (!var6_3) ** GOTO lbl128
                throw null;
            }
lbl172:
            // 4 sources

            case 9: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhu", fhfw(int ), (int)26);
                if (!var6_3) ** GOTO lbl138
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhv", fhfw(int ), (int)27);
                if (!var6_3) ** GOTO lbl163
                throw null;
            }
            case 11: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhw", fhfw(int ), (int)28);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 12: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhx", fhfw(int ), (int)29);
                if (!var6_3) ** GOTO lbl163
                throw null;
            }
            case 13: {
                do {
                    var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhy", fhfw(int ), (int)30);
                } while (!var6_3);
                throw null;
            }
lbl194:
            // 2 sources

            case 14: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhhz", fhfw(int ), (int)31);
                if (var6_3) {
                    throw null;
                }
            }
lbl198:
            // 4 sources

            case 15: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhia", fhfw(int ), (int)32);
                if (!var6_3) ** GOTO lbl158
                throw null;
            }
lbl202:
            // 2 sources

            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhib", fhfw(int ), (int)33);
                    if (!var6_3) ** GOTO lbl172
                    throw null;
                }
            }
            case 17: {
                var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhic", fhfw(int ), (int)34);
                if (!var6_3) ** GOTO lbl128
                throw null;
            }
            case 18: 
        }
        var5_4 /* !! */  = (int)dw$RollingText.fhfu("fhid", fhfw(int ), (int)35);
        ** while (!var6_3)
lbl214:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String previous() {
        block37: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = dw$RollingText.ma - dw$RollingText.fhfu("fhmo", fhfr(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == dw$RollingText.fhfu("fhmp", fhfw(int ), (int)88)) break;
                v0 /* !! */  = (long)dw$RollingText.fhfu("fhmq", fhfw(int ), (int)89);
            }
            var3_1 = dw$RollingText.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = dw$RollingText.ma - dw$RollingText.fhfu("fhmr", fhfr(int ), (int)57)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == dw$RollingText.fhfu("fhms", fhfw(int ), (int)90)) break;
                v1 /* !! */  = (long)dw$RollingText.fhfu("fhmt", fhfw(int ), (int)91);
            }
            var2_2 /* !! */  = dw$RollingText.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = dw$RollingText.ma - dw$RollingText.fhfu("fhmv", fhfr(int ), (int)58)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v2 /* !! */  == dw$RollingText.fhfu("fhmz", fhfw(int ), (int)92)) break;
                v2 /* !! */  = (long)dw$RollingText.fhfu("fhnb", fhfw(int ), (int)93);
            }
            var1_3 = dw$RollingText.a;
            if (var3_1) {
                throw null;
lbl24:
                // 4 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl24
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = dw$RollingText.ma - dw$RollingText.fhfu("fhnd", fhfr(int ), (int)59)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == dw$RollingText.fhfu("fhne", fhfw(int ), (int)94)) break;
                v3 /* !! */  = (long)dw$RollingText.fhfu("fhnf", fhfw(int ), (int)95);
            }
            if (this.previous != null) break block37;
            if (var1_3) ** GOTO lbl24
            v4 /* !! */  = dw$RollingText.ma;
            if (true) ** GOTO lbl39
            block21: while (true) {
                v4 /* !! */  = (long)(v5 - dw$RollingText.fhfu("fhnh", fhfr(int ), (int)60));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 340930765: {
                        v5 = dw$RollingText.fhfu("fhni", fhfr(int ), (int)61);
                        continue block21;
                    }
                    case 786528225: {
                        v5 = dw$RollingText.fhfu("fhnj", fhfr(int ), (int)62);
                        continue block21;
                    }
                    case 856901875: {
                        break block21;
                    }
                    case 1877668164: {
                        v5 = dw$RollingText.fhfu("fhnl", fhfr(int ), (int)63);
                        continue block21;
                    }
                }
                break;
            }
            v6 = this.value();
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl70
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = dw$RollingText.ma - dw$RollingText.fhfu("fhnn", fhfr(int ), (int)64)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == dw$RollingText.fhfu("fhnp", fhfw(int ), (int)96)) {
                        v6 = this.previous;
                        break;
                    }
                    v7 /* !! */  = (long)dw$RollingText.fhfu("fhnq", fhfw(int ), (int)97);
                }
lbl70:
                // 2 sources

                return v6;
            }
lbl71:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhnt", fhfw(int ), (int)98);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl80
            }
lbl76:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhnu", fhfw(int ), (int)99);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
lbl80:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhnv", fhfw(int ), (int)100);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl85:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhnw", fhfw(int ), (int)101);
                if (!var3_1) ** GOTO lbl76
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhnx", fhfw(int ), (int)102);
                if (!var3_1) ** GOTO lbl85
                throw null;
            }
lbl93:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhnz", fhfw(int ), (int)103);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhob", fhfw(int ), (int)104);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        do {
            var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhog", fhfw(int ), (int)105);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private dw$RollingText() {
        var2_1 /* !! */  = dw$RollingText.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.switchAt = (long)dw$RollingText.fhfu("fhfv", fhfr(int ), (int)0);
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)dw$RollingText.fhfu("fhfz", fhfw(int ), (int)0);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)dw$RollingText.fhfu("fhga", fhfw(int ), (int)1);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)dw$RollingText.fhfu("fhgb", fhfw(int ), (int)2);
        ** while (true)
    }

    private static /* synthetic */ void fhqn() {
        dw$RollingText.fhft[0] = 8270849834186345425L;
        dw$RollingText.fhft[1] = 3170623054295589074L;
        dw$RollingText.fhft[2] = -4177679630409816490L;
        dw$RollingText.fhft[3] = 2260300978301640698L;
        dw$RollingText.fhft[4] = -768297536846018324L;
        dw$RollingText.fhft[5] = 6126929644479215793L;
        dw$RollingText.fhft[6] = -2186904597694440395L;
        dw$RollingText.fhft[7] = -7360901243251927603L;
        dw$RollingText.fhft[8] = 2433394873553397254L;
        dw$RollingText.fhft[9] = 3380668171370807716L;
        dw$RollingText.fhft[10] = -4852243672572218904L;
        dw$RollingText.fhft[11] = -36120788338935367L;
        dw$RollingText.fhft[12] = 7285259410979710864L;
        dw$RollingText.fhft[13] = -3737906403723590464L;
        dw$RollingText.fhft[14] = -5204434582526948149L;
        dw$RollingText.fhft[15] = -6212859704507896428L;
        dw$RollingText.fhft[16] = 6631026207642343006L;
        dw$RollingText.fhft[17] = -3738293914468142139L;
        dw$RollingText.fhft[18] = 7407838083319703487L;
        dw$RollingText.fhft[19] = 1689104379658279408L;
        dw$RollingText.fhft[20] = 2907365658698924913L;
        dw$RollingText.fhft[21] = 6464281591455886379L;
        dw$RollingText.fhft[22] = 6040613294922213757L;
        dw$RollingText.fhft[23] = 6597517617686053581L;
        dw$RollingText.fhft[24] = -484948736949048925L;
        dw$RollingText.fhft[25] = 7591068608458341441L;
        dw$RollingText.fhft[26] = 6269465100502532509L;
        dw$RollingText.fhft[27] = 5239700476098722594L;
        dw$RollingText.fhft[28] = -4884314209384587838L;
        dw$RollingText.fhft[29] = 5565717667360089188L;
        dw$RollingText.fhft[30] = -5524986541820062665L;
        dw$RollingText.fhft[31] = 4308705495544571399L;
        dw$RollingText.fhft[32] = 7044425191688304580L;
        dw$RollingText.fhft[33] = 1125375323782531585L;
        dw$RollingText.fhft[34] = -2047132178218170982L;
        dw$RollingText.fhft[35] = 976200310562640368L;
        dw$RollingText.fhft[36] = -6587520652577676973L;
        dw$RollingText.fhft[37] = 2312928439272098060L;
        dw$RollingText.fhft[38] = -4560775336095808392L;
        dw$RollingText.fhft[39] = 7978068825275045269L;
        dw$RollingText.fhft[40] = 4260653714003732740L;
        dw$RollingText.fhft[41] = 3914174573726568129L;
        dw$RollingText.fhft[42] = 1410450231134651591L;
        dw$RollingText.fhft[43] = -3326382283141706612L;
        dw$RollingText.fhft[44] = -6601978078925749184L;
        dw$RollingText.fhft[45] = -1778198619366854339L;
        dw$RollingText.fhft[46] = 5963131756989224932L;
        dw$RollingText.fhft[47] = 6837841487185828311L;
        dw$RollingText.fhft[48] = 2598090617057971623L;
        dw$RollingText.fhft[49] = -1291809400393249350L;
        dw$RollingText.fhft[50] = -4608434903016929567L;
        dw$RollingText.fhft[51] = -8331292537172898743L;
        dw$RollingText.fhft[52] = -6057808215492843576L;
        dw$RollingText.fhft[53] = 7122049263959774732L;
        dw$RollingText.fhft[54] = 6590077812295266714L;
        dw$RollingText.fhft[55] = 2052674439416943146L;
        dw$RollingText.fhft[56] = -8105294637600674777L;
        dw$RollingText.fhft[57] = -8579277787652207309L;
        dw$RollingText.fhft[58] = 6420783906393253674L;
        dw$RollingText.fhft[59] = 7537027742254221561L;
        dw$RollingText.fhft[60] = -8590761970113201699L;
        dw$RollingText.fhft[61] = 6573827599909375322L;
        dw$RollingText.fhft[62] = -83030358294501135L;
        dw$RollingText.fhft[63] = -7077442491774398708L;
        dw$RollingText.fhft[64] = -7535232696089771512L;
    }

    private static /* synthetic */ long fhfr(int n2) {
        return fhfs[n2] ^ fhft[n2];
    }

    public static /* synthetic */ CallSite fhfu(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fhpc() {
        dw$RollingText.fhfx[100] = 563577166;
        dw$RollingText.fhfx[101] = 258714508;
        dw$RollingText.fhfx[102] = -171768174;
        dw$RollingText.fhfx[103] = 1199125187;
        dw$RollingText.fhfx[104] = 881392329;
        dw$RollingText.fhfx[105] = -392432225;
    }

    private static /* synthetic */ void fhpx() {
        dw$RollingText.fhfy[100] = 563577160;
        dw$RollingText.fhfy[101] = 258714506;
        dw$RollingText.fhfy[102] = -171768175;
        dw$RollingText.fhfy[103] = 1199125191;
        dw$RollingText.fhfy[104] = 881392328;
        dw$RollingText.fhfy[105] = -392432227;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    boolean animating(long l2) {
        CallSite callSite;
        boolean bl2;
        block28: {
            Object object = ma;
            boolean bl3 = true;
            block11: while (true) {
                CallSite callSite2;
                if (!bl3 || (bl3 = false) || !true) {
                    object = callSite2 - dw$RollingText.fhfu("fhie", fhfr(int ), (int)22);
                }
                switch ((int)object) {
                    case -2019722145: {
                        callSite2 = dw$RollingText.fhfu("fhif", fhfr(int ), (int)23);
                        continue block11;
                    }
                    case -1400898502: {
                        callSite2 = dw$RollingText.fhfu("fhig", fhfr(int ), (int)24);
                        continue block11;
                    }
                    case -14086191: {
                        callSite2 = dw$RollingText.fhfu("fhih", fhfr(int ), (int)25);
                        continue block11;
                    }
                    case 856901875: {
                        break block11;
                    }
                }
                break;
            }
            boolean bl4 = c;
            while (true) {
                long l3;
                Object object2;
                if ((object2 = (l3 = ma - dw$RollingText.fhfu("fhii", fhfr(int ), (int)26)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object2 == dw$RollingText.fhfu("fhij", fhfw(int ), (int)36)) break;
                object2 = dw$RollingText.fhfu("fhik", fhfw(int ), (int)37);
            }
            int n2 = b;
            while (true) {
                long l4;
                Object object3;
                if ((object3 = (l4 = ma - dw$RollingText.fhfu("fhil", fhfr(int ), (int)27)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object3 == dw$RollingText.fhfu("fhim", fhfw(int ), (int)38)) {
                    bl2 = a;
                    if (bl4) {
                        throw null;
                    }
                    break;
                }
                object3 = dw$RollingText.fhfu("fhin", fhfw(int ), (int)39);
            }
            if (bl2 || bl2) return (boolean)dw$RollingText.fhfu("fhio", fhfw(int ), (int)40);
            while (true) {
                long l5;
                Object object4;
                if ((object4 = (l5 = ma - dw$RollingText.fhfu("fhip", fhfr(int ), (int)28)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object4 == dw$RollingText.fhfu("fhiq", fhfw(int ), (int)41)) {
                    if (this.previous != null) {
                        break;
                    }
                    break block28;
                }
                object4 = dw$RollingText.fhfu("fhir", fhfw(int ), (int)42);
            }
            if (bl2) return (boolean)dw$RollingText.fhfu("fhio", fhfw(int ), (int)40);
            Object object5 = ma;
            boolean bl5 = true;
            block15: while (true) {
                CallSite callSite3;
                if (!bl5 || (bl5 = false) || !true) {
                    object5 = callSite3 - dw$RollingText.fhfu("fhis", fhfr(int ), (int)29);
                }
                switch ((int)object5) {
                    case -1483532112: {
                        callSite3 = dw$RollingText.fhfu("fhit", fhfr(int ), (int)30);
                        continue block15;
                    }
                    case 856901875: {
                        break block15;
                    }
                    case 1002749128: {
                        callSite3 = dw$RollingText.fhfu("fhiu", fhfr(int ), (int)31);
                        continue block15;
                    }
                }
                break;
            }
            if (l2 - this.switchAt < dw$RollingText.fhfu("fhiv", fhfr(int ), (int)32)) {
                if (bl2) return (boolean)dw$RollingText.fhfu("fhio", fhfw(int ), (int)40);
                callSite = dw$RollingText.fhfu("fhiw", fhfw(int ), (int)43);
                if (!bl4) return (boolean)callSite;
                throw null;
            }
        }
        if (bl2 || bl2) {
            return (boolean)dw$RollingText.fhfu("fhio", fhfw(int ), (int)40);
        }
        callSite = dw$RollingText.fhfu("fhix", fhfw(int ), (int)44);
        return (boolean)callSite;
    }

    static {
        fhfx = new int[106];
        fhfy = new int[106];
        dw$RollingText.fhom();
        dw$RollingText.fhpc();
        dw$RollingText.fhpi();
        dw$RollingText.fhpx();
        fhfs = new long[65];
        fhft = new long[65];
        dw$RollingText.fhqb();
        dw$RollingText.fhqn();
    }

    private static /* synthetic */ void fhqb() {
        dw$RollingText.fhfs[0] = -8270849834186345426L;
        dw$RollingText.fhfs[1] = 8316345710280471277L;
        dw$RollingText.fhfs[2] = 7385190793724730089L;
        dw$RollingText.fhfs[3] = -4205832289540984857L;
        dw$RollingText.fhfs[4] = -2516753467642284546L;
        dw$RollingText.fhfs[5] = -1863618272496941233L;
        dw$RollingText.fhfs[6] = -8865342754395260169L;
        dw$RollingText.fhfs[7] = 8705081669536700529L;
        dw$RollingText.fhfs[8] = 8085308203761435666L;
        dw$RollingText.fhfs[9] = 8439650635822600147L;
        dw$RollingText.fhfs[10] = -2188966575072826808L;
        dw$RollingText.fhfs[11] = 5076558598459739201L;
        dw$RollingText.fhfs[12] = -69343324151681491L;
        dw$RollingText.fhfs[13] = 4745167534193491033L;
        dw$RollingText.fhfs[14] = -3269926153652556427L;
        dw$RollingText.fhfs[15] = -7984277365767336722L;
        dw$RollingText.fhfs[16] = 1467895664702675943L;
        dw$RollingText.fhfs[17] = -4580286961059006495L;
        dw$RollingText.fhfs[18] = 4779964379068617931L;
        dw$RollingText.fhfs[19] = 2590534517947393025L;
        dw$RollingText.fhfs[20] = 402752265247234019L;
        dw$RollingText.fhfs[21] = 1688843577778386164L;
        dw$RollingText.fhfs[22] = -2915557982886226779L;
        dw$RollingText.fhfs[23] = 1657353030102829086L;
        dw$RollingText.fhfs[24] = -6841690943699664174L;
        dw$RollingText.fhfs[25] = -1005930763631005812L;
        dw$RollingText.fhfs[26] = 8551330845640017989L;
        dw$RollingText.fhfs[27] = 2453678572675168957L;
        dw$RollingText.fhfs[28] = -6401556395751545301L;
        dw$RollingText.fhfs[29] = -5140413779966573983L;
        dw$RollingText.fhfs[30] = 8013777854980842265L;
        dw$RollingText.fhfs[31] = -1725019865331567281L;
        dw$RollingText.fhfs[32] = 7044425191688304320L;
        dw$RollingText.fhfs[33] = 3398526984234116372L;
        dw$RollingText.fhfs[34] = -326168399488525818L;
        dw$RollingText.fhfs[35] = 4980311898165567694L;
        dw$RollingText.fhfs[36] = 7961891523769135739L;
        dw$RollingText.fhfs[37] = -3199431537312301382L;
        dw$RollingText.fhfs[38] = 3518459875955766596L;
        dw$RollingText.fhfs[39] = -5892267966498859063L;
        dw$RollingText.fhfs[40] = -686832700597007455L;
        dw$RollingText.fhfs[41] = 9215566520545179565L;
        dw$RollingText.fhfs[42] = 1410450231134651843L;
        dw$RollingText.fhfs[43] = 5807686324177813451L;
        dw$RollingText.fhfs[44] = 6601978078925749183L;
        dw$RollingText.fhfs[45] = -4858754150093453699L;
        dw$RollingText.fhfs[46] = 4533066713180135253L;
        dw$RollingText.fhfs[47] = -2861929474371076873L;
        dw$RollingText.fhfs[48] = -7269624745175499039L;
        dw$RollingText.fhfs[49] = 1440423733199303869L;
        dw$RollingText.fhfs[50] = -7952718595957457953L;
        dw$RollingText.fhfs[51] = -6316438844009434295L;
        dw$RollingText.fhfs[52] = 6365519482339065569L;
        dw$RollingText.fhfs[53] = 7626569213944836980L;
        dw$RollingText.fhfs[54] = 1959287378513958195L;
        dw$RollingText.fhfs[55] = 4130253051422776833L;
        dw$RollingText.fhfs[56] = 5766195117539154308L;
        dw$RollingText.fhfs[57] = -8645445267244123217L;
        dw$RollingText.fhfs[58] = -7652820785643481449L;
        dw$RollingText.fhfs[59] = 5978816899574429503L;
        dw$RollingText.fhfs[60] = 2955150495047943279L;
        dw$RollingText.fhfs[61] = 6854832035384725965L;
        dw$RollingText.fhfs[62] = 6555098265421292805L;
        dw$RollingText.fhfs[63] = 297093735661093385L;
        dw$RollingText.fhfs[64] = 6964955616721990345L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    void finish(long var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dw$RollingText.ma - dw$RollingText.fhfu("fhjh", fhfr(int ), (int)33)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dw$RollingText.fhfu("fhji", fhfw(int ), (int)54)) break;
            v0 /* !! */  = (long)dw$RollingText.fhfu("fhjj", fhfw(int ), (int)55);
        }
        var5_2 = dw$RollingText.c;
        v1 /* !! */  = dw$RollingText.ma;
        if (true) ** GOTO lbl11
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - dw$RollingText.fhfu("fhjk", fhfr(int ), (int)34));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1937995788: {
                    v2 = dw$RollingText.fhfu("fhjl", fhfr(int ), (int)35);
                    continue block25;
                }
                case -621300934: {
                    v2 = dw$RollingText.fhfu("fhjm", fhfr(int ), (int)36);
                    continue block25;
                }
                case 167762347: {
                    v2 = dw$RollingText.fhfu("fhjn", fhfr(int ), (int)37);
                    continue block25;
                }
                case 856901875: {
                    break block25;
                }
            }
            break;
        }
        var4_3 /* !! */  = dw$RollingText.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dw$RollingText.ma - dw$RollingText.fhfu("fhjo", fhfr(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dw$RollingText.fhfu("fhjp", fhfw(int ), (int)56)) break;
            v3 /* !! */  = (long)dw$RollingText.fhfu("fhjq", fhfw(int ), (int)57);
        }
        var3_4 = dw$RollingText.a;
        if (var5_2) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl32
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dw$RollingText.ma - dw$RollingText.fhfu("fhjr", fhfr(int ), (int)39)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dw$RollingText.fhfu("fhjs", fhfw(int ), (int)58)) break;
                    v4 /* !! */  = (long)dw$RollingText.fhfu("fhjt", fhfw(int ), (int)59);
                }
                if (this.previous == null) ** GOTO lbl71
                if (var3_4) ** GOTO lbl32
                v5 /* !! */  = dw$RollingText.ma;
                if (true) ** GOTO lbl49
                block29: while (true) {
                    v5 /* !! */  = (long)(dw$RollingText.fhfu("fhjv", fhfr(int ), (int)41) - dw$RollingText.fhfu("fhju", fhfr(int ), (int)40));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 856901875: {
                            break block29;
                        }
                        case 1986205496: {
                            continue block29;
                        }
                    }
                    break;
                }
                if (var1_1 - this.switchAt < dw$RollingText.fhfu("fhjw", fhfr(int ), (int)42)) ** GOTO lbl71
                if (var3_4 || var3_4) ** GOTO lbl32
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = dw$RollingText.ma - dw$RollingText.fhfu("fhjx", fhfr(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == dw$RollingText.fhfu("fhjy", fhfw(int ), (int)60)) break;
                    v6 /* !! */  = (long)dw$RollingText.fhfu("fhjz", fhfw(int ), (int)61);
                }
                this.previous = null;
                if (var3_4 || var3_4) ** GOTO lbl32
                v7 = dw$RollingText.fhfu("fhka", fhfr(int ), (int)44);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = dw$RollingText.ma - dw$RollingText.fhfu("fhkb", fhfr(int ), (int)45)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == dw$RollingText.fhfu("fhkc", fhfw(int ), (int)62)) break;
                    v8 /* !! */  = (long)dw$RollingText.fhfu("fhkd", fhfw(int ), (int)63);
                }
                this.switchAt = (long)v7;
                if (var3_4) ** GOTO lbl32
lbl71:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
lbl74:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhke", fhfw(int ), (int)64);
                if (!var5_2) break;
                throw null;
            }
            case 1: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkf", fhfw(int ), (int)65);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl98
            }
            case 2: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkg", fhfw(int ), (int)66);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl88:
            // 2 sources

            case 3: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkh", fhfw(int ), (int)67);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl119
            }
lbl93:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhki", fhfw(int ), (int)68);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl98:
            // 3 sources

            case 5: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkj", fhfw(int ), (int)69);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
            case 6: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkk", fhfw(int ), (int)70);
                if (!var5_2) ** GOTO lbl74
                throw null;
            }
lbl107:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkl", fhfw(int ), (int)71);
                if (!var5_2) ** GOTO lbl93
                throw null;
            }
lbl111:
            // 3 sources

            case 8: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkm", fhfw(int ), (int)72);
                if (!var5_2) ** GOTO lbl98
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkn", fhfw(int ), (int)73);
                if (!var5_2) ** GOTO lbl88
                throw null;
            }
lbl119:
            // 2 sources

            case 10: {
                do {
                    var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhko", fhfw(int ), (int)74);
                } while (!var5_2);
                throw null;
            }
            case 11: 
        }
        do {
            var4_3 /* !! */  = (int)dw$RollingText.fhfu("fhkq", fhfw(int ), (int)75);
        } while (!var5_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    String value() {
        block41: {
            v0 /* !! */  = dw$RollingText.ma;
            if (true) ** GOTO lbl5
            block24: while (true) {
                v0 /* !! */  = (long)(dw$RollingText.fhfu("fhku", fhfr(int ), (int)47) - dw$RollingText.fhfu("fhkt", fhfr(int ), (int)46));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -577536177: {
                        continue block24;
                    }
                    case 856901875: {
                        break block24;
                    }
                }
                break;
            }
            var3_1 = dw$RollingText.c;
            v1 /* !! */  = dw$RollingText.ma;
            if (true) ** GOTO lbl15
            block25: while (true) {
                v1 /* !! */  = (long)(v2 - dw$RollingText.fhfu("fhkx", fhfr(int ), (int)48));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1258963098: {
                        v2 = dw$RollingText.fhfu("fhla", fhfr(int ), (int)49);
                        continue block25;
                    }
                    case 456335094: {
                        v2 = dw$RollingText.fhfu("fhlb", fhfr(int ), (int)50);
                        continue block25;
                    }
                    case 856901875: {
                        break block25;
                    }
                }
                break;
            }
            var2_2 /* !! */  = dw$RollingText.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = dw$RollingText.ma - dw$RollingText.fhfu("fhlc", fhfr(int ), (int)51)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == dw$RollingText.fhfu("fhld", fhfw(int ), (int)76)) break;
                v3 /* !! */  = (long)dw$RollingText.fhfu("fhle", fhfw(int ), (int)77);
            }
            var1_3 = dw$RollingText.a;
            if (var3_1) {
                throw null;
lbl34:
                // 4 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = dw$RollingText.ma - dw$RollingText.fhfu("fhlg", fhfr(int ), (int)52)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == dw$RollingText.fhfu("fhli", fhfw(int ), (int)78)) break;
                v4 /* !! */  = (long)dw$RollingText.fhfu("fhlo", fhfw(int ), (int)79);
            }
            if (this.current != null) break block41;
            if (var1_3) ** GOTO lbl34
            v5 = "0:00";
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl70
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v6 /* !! */  = dw$RollingText.ma;
                if (true) ** GOTO lbl60
                block29: while (true) {
                    v6 /* !! */  = (long)(v7 - dw$RollingText.fhfu("fhlq", fhfr(int ), (int)53));
lbl60:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 856901875: {
                            break block29;
                        }
                        case 1455333606: {
                            v7 = dw$RollingText.fhfu("fhls", fhfr(int ), (int)54);
                            continue block29;
                        }
                        case 2093110873: {
                            v7 = dw$RollingText.fhfu("fhlu", fhfr(int ), (int)55);
                            continue block29;
                        }
                    }
                    break;
                }
                v5 = this.current;
lbl70:
                // 2 sources

                return v5;
            }
lbl71:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhlw", fhfw(int ), (int)80);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl80
            }
lbl76:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhly", fhfw(int ), (int)81);
                if (!var3_1) break;
                throw null;
            }
lbl80:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhmc", fhfw(int ), (int)82);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 3: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhmd", fhfw(int ), (int)83);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 4: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhmf", fhfw(int ), (int)84);
                if (!var3_1) ** GOTO lbl71
                throw null;
            }
lbl94:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhmg", fhfw(int ), (int)85);
                    if (!var3_1) ** GOTO lbl76
                    throw null;
                }
            }
lbl99:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhmi", fhfw(int ), (int)86);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)dw$RollingText.fhfu("fhmk", fhfw(int ), (int)87);
        ** while (!var3_1)
lbl106:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int fhfw(int n2) {
        return fhfx[n2] ^ fhfy[n2];
    }

    private static /* synthetic */ void fhom() {
        dw$RollingText.fhfx[0] = -1143628602;
        dw$RollingText.fhfx[1] = -2022131548;
        dw$RollingText.fhfx[2] = -2089385757;
        dw$RollingText.fhfx[3] = -697548729;
        dw$RollingText.fhfx[4] = -1337982643;
        dw$RollingText.fhfx[5] = 2112623628;
        dw$RollingText.fhfx[6] = -1097104387;
        dw$RollingText.fhfx[7] = 111915434;
        dw$RollingText.fhfx[8] = 1983617730;
        dw$RollingText.fhfx[9] = -323648699;
        dw$RollingText.fhfx[10] = -1704771670;
        dw$RollingText.fhfx[11] = 1276774205;
        dw$RollingText.fhfx[12] = 1767904400;
        dw$RollingText.fhfx[13] = -1448792965;
        dw$RollingText.fhfx[14] = -988267568;
        dw$RollingText.fhfx[15] = -873039662;
        dw$RollingText.fhfx[16] = 1115145312;
        dw$RollingText.fhfx[17] = -299600423;
        dw$RollingText.fhfx[18] = -2050925658;
        dw$RollingText.fhfx[19] = 1816492061;
        dw$RollingText.fhfx[20] = 1222831687;
        dw$RollingText.fhfx[21] = -216159480;
        dw$RollingText.fhfx[22] = -229845701;
        dw$RollingText.fhfx[23] = 718182705;
        dw$RollingText.fhfx[24] = -1812152134;
        dw$RollingText.fhfx[25] = -2134675598;
        dw$RollingText.fhfx[26] = -537329446;
        dw$RollingText.fhfx[27] = 428137575;
        dw$RollingText.fhfx[28] = -1154699687;
        dw$RollingText.fhfx[29] = -1801475790;
        dw$RollingText.fhfx[30] = 1151489382;
        dw$RollingText.fhfx[31] = 342097929;
        dw$RollingText.fhfx[32] = -302070414;
        dw$RollingText.fhfx[33] = 975132895;
        dw$RollingText.fhfx[34] = -1122166467;
        dw$RollingText.fhfx[35] = -1609608024;
        dw$RollingText.fhfx[36] = -655325767;
        dw$RollingText.fhfx[37] = 1528984615;
        dw$RollingText.fhfx[38] = 1244715274;
        dw$RollingText.fhfx[39] = -427501884;
        dw$RollingText.fhfx[40] = -1895292094;
        dw$RollingText.fhfx[41] = 1583612701;
        dw$RollingText.fhfx[42] = -238195657;
        dw$RollingText.fhfx[43] = 466121826;
        dw$RollingText.fhfx[44] = 898674255;
        dw$RollingText.fhfx[45] = -210367118;
        dw$RollingText.fhfx[46] = -261202091;
        dw$RollingText.fhfx[47] = 455307122;
        dw$RollingText.fhfx[48] = -1915580258;
        dw$RollingText.fhfx[49] = 702556484;
        dw$RollingText.fhfx[50] = -896499703;
        dw$RollingText.fhfx[51] = 893933859;
        dw$RollingText.fhfx[52] = -261931114;
        dw$RollingText.fhfx[53] = 342350794;
        dw$RollingText.fhfx[54] = -724474062;
        dw$RollingText.fhfx[55] = -338685766;
        dw$RollingText.fhfx[56] = -1744555530;
        dw$RollingText.fhfx[57] = 1787251371;
        dw$RollingText.fhfx[58] = -973377789;
        dw$RollingText.fhfx[59] = 1198892259;
        dw$RollingText.fhfx[60] = -1262135984;
        dw$RollingText.fhfx[61] = 1333038072;
        dw$RollingText.fhfx[62] = 1420873393;
        dw$RollingText.fhfx[63] = -386111420;
        dw$RollingText.fhfx[64] = -86252383;
        dw$RollingText.fhfx[65] = -490364391;
        dw$RollingText.fhfx[66] = 303091869;
        dw$RollingText.fhfx[67] = -687991770;
        dw$RollingText.fhfx[68] = 1071713063;
        dw$RollingText.fhfx[69] = -1425311718;
        dw$RollingText.fhfx[70] = -973302859;
        dw$RollingText.fhfx[71] = -1450319022;
        dw$RollingText.fhfx[72] = -1787772046;
        dw$RollingText.fhfx[73] = -217183587;
        dw$RollingText.fhfx[74] = -26116732;
        dw$RollingText.fhfx[75] = 2139526003;
        dw$RollingText.fhfx[76] = -1846741008;
        dw$RollingText.fhfx[77] = 797224043;
        dw$RollingText.fhfx[78] = -388855033;
        dw$RollingText.fhfx[79] = -1216820355;
        dw$RollingText.fhfx[80] = -732962273;
        dw$RollingText.fhfx[81] = -694519322;
        dw$RollingText.fhfx[82] = 217459650;
        dw$RollingText.fhfx[83] = 1010771314;
        dw$RollingText.fhfx[84] = 552669211;
        dw$RollingText.fhfx[85] = -325562602;
        dw$RollingText.fhfx[86] = 2059286196;
        dw$RollingText.fhfx[87] = 419613593;
        dw$RollingText.fhfx[88] = -444137244;
        dw$RollingText.fhfx[89] = -1995141382;
        dw$RollingText.fhfx[90] = -1062487699;
        dw$RollingText.fhfx[91] = -673699282;
        dw$RollingText.fhfx[92] = 192495663;
        dw$RollingText.fhfx[93] = 1773175657;
        dw$RollingText.fhfx[94] = -569613357;
        dw$RollingText.fhfx[95] = -1997052235;
        dw$RollingText.fhfx[96] = -200937351;
        dw$RollingText.fhfx[97] = 1062421902;
        dw$RollingText.fhfx[98] = 828753294;
        dw$RollingText.fhfx[99] = 881769407;
    }

    private static /* synthetic */ void fhpi() {
        dw$RollingText.fhfy[0] = -1143628602;
        dw$RollingText.fhfy[1] = -2022131547;
        dw$RollingText.fhfy[2] = -2089385758;
        dw$RollingText.fhfy[3] = 697548728;
        dw$RollingText.fhfy[4] = 1144878730;
        dw$RollingText.fhfy[5] = -2112623629;
        dw$RollingText.fhfy[6] = 1789928199;
        dw$RollingText.fhfy[7] = 111915435;
        dw$RollingText.fhfy[8] = -120554581;
        dw$RollingText.fhfy[9] = 323648698;
        dw$RollingText.fhfy[10] = 1501518940;
        dw$RollingText.fhfy[11] = -1276774206;
        dw$RollingText.fhfy[12] = 1731068760;
        dw$RollingText.fhfy[13] = 1448792964;
        dw$RollingText.fhfy[14] = -2034006776;
        dw$RollingText.fhfy[15] = 873039661;
        dw$RollingText.fhfy[16] = -1184857731;
        dw$RollingText.fhfy[17] = -299600432;
        dw$RollingText.fhfy[18] = -2050925653;
        dw$RollingText.fhfy[19] = 1816492044;
        dw$RollingText.fhfy[20] = 1222831689;
        dw$RollingText.fhfy[21] = -216159475;
        dw$RollingText.fhfy[22] = -229845697;
        dw$RollingText.fhfy[23] = 718182707;
        dw$RollingText.fhfy[24] = -1812152149;
        dw$RollingText.fhfy[25] = -2134675587;
        dw$RollingText.fhfy[26] = -537329452;
        dw$RollingText.fhfy[27] = 428137568;
        dw$RollingText.fhfy[28] = -1154699682;
        dw$RollingText.fhfy[29] = -1801475788;
        dw$RollingText.fhfy[30] = 1151489378;
        dw$RollingText.fhfy[31] = 342097926;
        dw$RollingText.fhfy[32] = -302070406;
        dw$RollingText.fhfy[33] = 975132891;
        dw$RollingText.fhfy[34] = -1122166468;
        dw$RollingText.fhfy[35] = -1609608026;
        dw$RollingText.fhfy[36] = 655325766;
        dw$RollingText.fhfy[37] = -560673673;
        dw$RollingText.fhfy[38] = -1244715275;
        dw$RollingText.fhfy[39] = -432161721;
        dw$RollingText.fhfy[40] = -1895292094;
        dw$RollingText.fhfy[41] = -1583612702;
        dw$RollingText.fhfy[42] = -1136769472;
        dw$RollingText.fhfy[43] = 466121827;
        dw$RollingText.fhfy[44] = 898674255;
        dw$RollingText.fhfy[45] = -210367117;
        dw$RollingText.fhfy[46] = -261202093;
        dw$RollingText.fhfy[47] = 455307123;
        dw$RollingText.fhfy[48] = -1915580260;
        dw$RollingText.fhfy[49] = 702556485;
        dw$RollingText.fhfy[50] = -896499702;
        dw$RollingText.fhfy[51] = 893933859;
        dw$RollingText.fhfy[52] = -261931120;
        dw$RollingText.fhfy[53] = 342350794;
        dw$RollingText.fhfy[54] = 724474061;
        dw$RollingText.fhfy[55] = 1400454210;
        dw$RollingText.fhfy[56] = 1744555529;
        dw$RollingText.fhfy[57] = 1296990973;
        dw$RollingText.fhfy[58] = -973377790;
        dw$RollingText.fhfy[59] = -1553992249;
        dw$RollingText.fhfy[60] = -1262135983;
        dw$RollingText.fhfy[61] = -131789417;
        dw$RollingText.fhfy[62] = -1420873394;
        dw$RollingText.fhfy[63] = -2063858201;
        dw$RollingText.fhfy[64] = -86252382;
        dw$RollingText.fhfy[65] = -490364385;
        dw$RollingText.fhfy[66] = 303091867;
        dw$RollingText.fhfy[67] = -687991762;
        dw$RollingText.fhfy[68] = 1071713059;
        dw$RollingText.fhfy[69] = -1425311715;
        dw$RollingText.fhfy[70] = -973302852;
        dw$RollingText.fhfy[71] = -1450319015;
        dw$RollingText.fhfy[72] = -1787772047;
        dw$RollingText.fhfy[73] = -217183587;
        dw$RollingText.fhfy[74] = -26116724;
        dw$RollingText.fhfy[75] = 2139526007;
        dw$RollingText.fhfy[76] = 1846741007;
        dw$RollingText.fhfy[77] = 163402471;
        dw$RollingText.fhfy[78] = 388855032;
        dw$RollingText.fhfy[79] = -249275975;
        dw$RollingText.fhfy[80] = -732962279;
        dw$RollingText.fhfy[81] = -694519327;
        dw$RollingText.fhfy[82] = 217459651;
        dw$RollingText.fhfy[83] = 1010771313;
        dw$RollingText.fhfy[84] = 552669213;
        dw$RollingText.fhfy[85] = -325562607;
        dw$RollingText.fhfy[86] = 2059286195;
        dw$RollingText.fhfy[87] = 419613593;
        dw$RollingText.fhfy[88] = 444137243;
        dw$RollingText.fhfy[89] = -1716689349;
        dw$RollingText.fhfy[90] = 1062487698;
        dw$RollingText.fhfy[91] = 1646162820;
        dw$RollingText.fhfy[92] = -192495664;
        dw$RollingText.fhfy[93] = -2144437211;
        dw$RollingText.fhfy[94] = 569613356;
        dw$RollingText.fhfy[95] = -467211123;
        dw$RollingText.fhfy[96] = 200937350;
        dw$RollingText.fhfy[97] = -1566810885;
        dw$RollingText.fhfy[98] = 828753292;
        dw$RollingText.fhfy[99] = 881769405;
    }
}

