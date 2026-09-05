/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;

public class jx {
    private String description;
    private static int[] izdr;
    public static final long qw = 7094409964700223536L;
    public static final boolean a;
    private static long[] izee;
    public static final boolean c;
    private final String name;
    private static int[] izdq;
    private static long[] ized;
    public static final int b;
    private Supplier<Boolean> visible;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getName() {
        v0 /* !! */  = jx.qw;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(jx.izds("izfm", izec(int ), (int)15) - jx.izds("izfl", izec(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -528742129: {
                    continue block14;
                }
                case 1827850288: {
                    break block14;
                }
            }
            break;
        }
        var3_1 = jx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = jx.qw - jx.izds("izfn", izec(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jx.izds("izfo", izdp(int ), (int)27)) break;
            v1 /* !! */  = (long)jx.izds("izfp", izdp(int ), (int)28);
        }
        var2_2 /* !! */  = jx.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = jx.qw - jx.izds("izfq", izec(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == jx.izds("izfr", izdp(int ), (int)29)) break;
                    v2 /* !! */  = (long)jx.izds("izfs", izdp(int ), (int)30);
                }
                var1_3 = jx.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = jx.qw;
                if (true) ** GOTO lbl37
                block18: while (true) {
                    v3 /* !! */  = (long)(jx.izds("izfu", izec(int ), (int)19) - jx.izds("izft", izec(int ), (int)18));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1105926432: {
                            continue block18;
                        }
                        case 1827850288: {
                            break block18;
                        }
                    }
                    break;
                }
                return this.name;
            }
            case 0: {
                var2_2 /* !! */  = (int)jx.izds("izfv", izdp(int ), (int)31);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)jx.izds("izfw", izdp(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)jx.izds("izfx", izdp(int ), (int)33);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)jx.izds("izfy", izdp(int ), (int)34);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int izdp(int n2) {
        return izdq[n2] ^ izdr[n2];
    }

    private static /* synthetic */ void izia() {
        jx.ized[0] = 8528315978809499787L;
        jx.ized[1] = 5706138655045358888L;
        jx.ized[2] = -6236502938017214347L;
        jx.ized[3] = -2175355758180021514L;
        jx.ized[4] = 152064563049205579L;
        jx.ized[5] = 456815800662481659L;
        jx.ized[6] = 7589651892793615486L;
        jx.ized[7] = 7023699435481462320L;
        jx.ized[8] = 6375998436151776069L;
        jx.ized[9] = 7308308563157464512L;
        jx.ized[10] = -1055934891608681325L;
        jx.ized[11] = 6504578043742923344L;
        jx.ized[12] = 9152149407435749632L;
        jx.ized[13] = -5968387352414871823L;
        jx.ized[14] = 3761481356499060776L;
        jx.ized[15] = -2150298956510752250L;
        jx.ized[16] = -6919877772613765981L;
        jx.ized[17] = 6112494947097957695L;
        jx.ized[18] = 267198627778466174L;
        jx.ized[19] = -5260048753298096567L;
        jx.ized[20] = -929306262322723225L;
        jx.ized[21] = 5003740534279041083L;
        jx.ized[22] = -737985170774000122L;
        jx.ized[23] = -7618501253624481053L;
        jx.ized[24] = 262886685159995291L;
        jx.ized[25] = -3512522457081219973L;
        jx.ized[26] = -2428892415049878628L;
        jx.ized[27] = -5811838371578041024L;
        jx.ized[28] = 4937390986415896985L;
        jx.ized[29] = -5196369082265773244L;
        jx.ized[30] = 7050510678206307218L;
        jx.ized[31] = 2991798389549730753L;
        jx.ized[32] = 607851919931257978L;
        jx.ized[33] = 4186968416982832804L;
        jx.ized[34] = -432094843826721288L;
        jx.ized[35] = -4694799579979434030L;
        jx.ized[36] = 5688549743883715103L;
        jx.ized[37] = -6424902332331252416L;
        jx.ized[38] = -7697008989463097432L;
        jx.ized[39] = 2913322412656466787L;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public jx(String string, String string2) {
        int n2 = b;
        this.name = string;
        this.description = string2;
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 3: {
                CallSite callSite = jx.izds("izea", izdp(int ), (int)7);
            }
            case 2: {
                CallSite callSite = jx.izds("izdz", izdp(int ), (int)6);
            }
            case 1: {
                CallSite callSite = jx.izds("izdy", izdp(int ), (int)5);
            }
            case 0: {
                while (true) {
                    CallSite callSite = jx.izds("izdx", izdp(int ), (int)4);
                }
            }
            case 4: 
        }
        while (true) {
            CallSite callSite = jx.izds("izeb", izdp(int ), (int)8);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Supplier<Boolean> getVisible() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jx.qw - jx.izds("izgq", izec(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jx.izds("izgr", izdp(int ), (int)45)) break;
            v0 /* !! */  = (long)jx.izds("izgs", izdp(int ), (int)46);
        }
        var3_1 = jx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = jx.qw - jx.izds("izgt", izec(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == jx.izds("izgu", izdp(int ), (int)47)) break;
            v1 /* !! */  = (long)jx.izds("izgv", izdp(int ), (int)48);
        }
        var2_2 /* !! */  = jx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = jx.qw - jx.izds("izgw", izec(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jx.izds("izgx", izdp(int ), (int)49)) break;
            v2 /* !! */  = (long)jx.izds("izgy", izdp(int ), (int)50);
        }
        var1_3 = jx.a;
        if (var3_1) {
            throw null;
            return null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = jx.qw - jx.izds("izgz", izec(int ), (int)30)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jx.izds("izha", izdp(int ), (int)51)) break;
                    v3 /* !! */  = (long)jx.izds("izhb", izdp(int ), (int)52);
                }
                return this.visible;
            }
lbl37:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jx.izds("izhc", izdp(int ), (int)53);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)jx.izds("izhd", izdp(int ), (int)54);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)jx.izds("izhe", izdp(int ), (int)55);
                if (!var3_1) ** GOTO lbl37
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)jx.izds("izhf", izdp(int ), (int)56);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isVisible() {
        block55: {
            block54: {
                v0 /* !! */  = jx.qw;
                if (true) ** GOTO lbl5
                block35: while (true) {
                    v0 /* !! */  = (long)(jx.izds("izeg", izec(int ), (int)1) - jx.izds("izef", izec(int ), (int)0));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 1827850288: {
                            break block35;
                        }
                        case 1880545206: {
                            continue block35;
                        }
                    }
                    break;
                }
                var3_1 = jx.c;
                v1 /* !! */  = jx.qw;
                if (true) ** GOTO lbl15
                block36: while (true) {
                    v1 /* !! */  = (long)(v2 - jx.izds("izeh", izec(int ), (int)2));
lbl15:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -1579052012: {
                            v2 = jx.izds("izei", izec(int ), (int)3);
                            continue block36;
                        }
                        case -495437270: {
                            v2 = jx.izds("izej", izec(int ), (int)4);
                            continue block36;
                        }
                        case 1827850288: {
                            break block36;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = jx.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = jx.qw - jx.izds("izek", izec(int ), (int)5)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jx.izds("izel", izdp(int ), (int)9)) break;
                    v3 /* !! */  = (long)jx.izds("izem", izdp(int ), (int)10);
                }
                var1_3 = jx.a;
                if (var3_1) {
                    throw null;
lbl34:
                    // 6 sources

                    return (boolean)jx.izds("izen", izdp(int ), (int)11);
                }
                if (var1_3 || var1_3) ** GOTO lbl34
                v4 /* !! */  = jx.qw;
                if (true) ** GOTO lbl41
                block39: while (true) {
                    v4 /* !! */  = (long)(jx.izds("izep", izec(int ), (int)7) - jx.izds("izeo", izec(int ), (int)6));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1363757649: {
                            continue block39;
                        }
                        case 1827850288: {
                            break block39;
                        }
                    }
                    break;
                }
                if (this.visible == null) break block54;
                if (var1_3) ** GOTO lbl34
                v5 /* !! */  = jx.qw;
                if (true) ** GOTO lbl52
                block40: while (true) {
                    v5 /* !! */  = (long)(jx.izds("izer", izec(int ), (int)9) - jx.izds("izeq", izec(int ), (int)8));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1440742228: {
                            continue block40;
                        }
                        case 1827850288: {
                            break block40;
                        }
                    }
                    break;
                }
                v6 /* !! */  = jx.qw;
                if (true) ** GOTO lbl61
                block41: while (true) {
                    v6 /* !! */  = (long)(v7 - jx.izds("izes", izec(int ), (int)10));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 409993506: {
                            v7 = jx.izds("izet", izec(int ), (int)11);
                            continue block41;
                        }
                        case 560606934: {
                            v7 = jx.izds("izeu", izec(int ), (int)12);
                            continue block41;
                        }
                        case 1827850288: {
                            break block41;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = jx.qw - jx.izds("izev", izec(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == jx.izds("izew", izdp(int ), (int)12)) break;
                    v8 /* !! */  = (long)jx.izds("izex", izdp(int ), (int)13);
                }
                if (!this.visible.get().booleanValue()) break block55;
                if (var1_3) ** GOTO lbl34
            }
            if (var1_3 || var1_3) ** GOTO lbl34
            v9 = jx.izds("izey", izdp(int ), (int)14);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl92
        }
        if (var1_3) ** GOTO lbl34
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v9 = jx.izds("izez", izdp(int ), (int)15);
lbl92:
                // 2 sources

                return (boolean)v9;
            }
lbl93:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)jx.izds("izfa", izdp(int ), (int)16);
                if (!var3_1) break;
                throw null;
            }
lbl97:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)jx.izds("izfb", izdp(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl120
            }
            case 2: {
                var2_2 /* !! */  = (int)jx.izds("izfc", izdp(int ), (int)18);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 3: {
                var2_2 /* !! */  = (int)jx.izds("izfd", izdp(int ), (int)19);
                if (!var3_1) ** GOTO lbl93
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)jx.izds("izfe", izdp(int ), (int)20);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl116:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)jx.izds("izff", izdp(int ), (int)21);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
lbl120:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)jx.izds("izfg", izdp(int ), (int)22);
                if (!var3_1) ** GOTO lbl93
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)jx.izds("izfh", izdp(int ), (int)23);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)jx.izds("izfi", izdp(int ), (int)24);
                if (var3_1) {
                    throw null;
                }
            }
            case 9: {
                var2_2 /* !! */  = (int)jx.izds("izfj", izdp(int ), (int)25);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)jx.izds("izfk", izdp(int ), (int)26);
        ** while (!var3_1)
lbl139:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setVisible(Supplier<Boolean> var1_1) {
        v0 /* !! */  = jx.qw;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - jx.izds("izhg", izec(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 293013827: {
                    v1 = jx.izds("izhh", izec(int ), (int)32);
                    continue block18;
                }
                case 1827850288: {
                    break block18;
                }
                case 1958655178: {
                    v1 = jx.izds("izhi", izec(int ), (int)33);
                    continue block18;
                }
            }
            break;
        }
        var4_2 = jx.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jx.qw - jx.izds("izhj", izec(int ), (int)34)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jx.izds("izhk", izdp(int ), (int)57)) break;
            v2 /* !! */  = (long)jx.izds("izhl", izdp(int ), (int)58);
        }
        var3_3 /* !! */  = jx.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = jx.qw;
                if (true) ** GOTO lbl28
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - jx.izds("izhm", izec(int ), (int)35));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1290389094: {
                            v4 = jx.izds("izhn", izec(int ), (int)36);
                            continue block20;
                        }
                        case 72125837: {
                            v4 = jx.izds("izho", izec(int ), (int)37);
                            continue block20;
                        }
                        case 806312834: {
                            v4 = jx.izds("izhp", izec(int ), (int)38);
                            continue block20;
                        }
                        case 1827850288: {
                            break block20;
                        }
                    }
                    break;
                }
                var2_4 = jx.a;
                if (var4_2) {
                    throw null;
lbl43:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = jx.qw - jx.izds("izhq", izec(int ), (int)39)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == jx.izds("izhr", izdp(int ), (int)59)) break;
                    v5 /* !! */  = (long)jx.izds("izhs", izdp(int ), (int)60);
                }
                this.visible = var1_1;
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)jx.izds("izht", izdp(int ), (int)61);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 1: {
                var3_3 /* !! */  = (int)jx.izds("izhu", izdp(int ), (int)62);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)jx.izds("izhv", izdp(int ), (int)63);
                if (!var4_2) break;
                throw null;
            }
lbl68:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)jx.izds("izhw", izdp(int ), (int)64);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)jx.izds("izhx", izdp(int ), (int)65);
        ** while (!var4_2)
lbl76:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public String getDescription() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = qw - jx.izds("izfz", izec(int ), (int)20)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == jx.izds("izga", izdp(int ), (int)35)) break;
            object = jx.izds("izgb", izdp(int ), (int)36);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = qw - jx.izds("izgc", izec(int ), (int)21)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == jx.izds("izgd", izdp(int ), (int)37)) break;
            object = jx.izds("izge", izdp(int ), (int)38);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = qw - jx.izds("izgf", izec(int ), (int)22)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == jx.izds("izgg", izdp(int ), (int)39)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = jx.izds("izgh", izdp(int ), (int)40);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object = qw;
        boolean bl4 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object = callSite - jx.izds("izgi", izec(int ), (int)23);
            }
            switch ((int)object) {
                case -1055424592: {
                    callSite = jx.izds("izgj", izec(int ), (int)24);
                    continue block9;
                }
                case -126213774: {
                    callSite = jx.izds("izgk", izec(int ), (int)25);
                    continue block9;
                }
                case 1827850288: {
                    return this.description;
                }
                case 2010264169: {
                    callSite = jx.izds("izgl", izec(int ), (int)26);
                    continue block9;
                }
            }
            break;
        }
        return this.description;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jx(String var1_1) {
        var3_2 /* !! */  = jx.b;
        super();
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.name = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)jx.izds("izdt", izdp(int ), (int)0);
            }
lbl10:
            // 3 sources

            case 1: {
                while (true) {
                    var3_2 /* !! */  = (int)jx.izds("izdu", izdp(int ), (int)1);
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)jx.izds("izdv", izdp(int ), (int)2);
                    ** GOTO lbl10
                    break;
                }
            }
            case 3: 
        }
        var3_2 /* !! */  = (int)jx.izds("izdw", izdp(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ void izib() {
        jx.izee[0] = -8590160020461804808L;
        jx.izee[1] = -6597139668622460823L;
        jx.izee[2] = 1649303918829520188L;
        jx.izee[3] = -1042029200366348941L;
        jx.izee[4] = 5053863997926286831L;
        jx.izee[5] = 6799418512371033326L;
        jx.izee[6] = 808937625820288603L;
        jx.izee[7] = -8691091024253516549L;
        jx.izee[8] = 5378478573876235288L;
        jx.izee[9] = -8190706710624012923L;
        jx.izee[10] = -3510787329697840564L;
        jx.izee[11] = 4495313318573972823L;
        jx.izee[12] = -7023825485164281411L;
        jx.izee[13] = -6898491386031651637L;
        jx.izee[14] = 4730447126527784370L;
        jx.izee[15] = -7562042375884714194L;
        jx.izee[16] = -2649607507475533827L;
        jx.izee[17] = -7970939548857854929L;
        jx.izee[18] = 7527942357779121072L;
        jx.izee[19] = -7900772940402141997L;
        jx.izee[20] = -3029520673763138507L;
        jx.izee[21] = 5749831162210266559L;
        jx.izee[22] = 8689715907241604362L;
        jx.izee[23] = -7889155848368644758L;
        jx.izee[24] = 553671862896108483L;
        jx.izee[25] = -3760059592884522628L;
        jx.izee[26] = -8691898279248211709L;
        jx.izee[27] = 8537917641108624177L;
        jx.izee[28] = -5149186582544334761L;
        jx.izee[29] = 2948234941656074399L;
        jx.izee[30] = 4531782650384939560L;
        jx.izee[31] = 5966345910970748555L;
        jx.izee[32] = -5216372949818740310L;
        jx.izee[33] = 4983901646461364138L;
        jx.izee[34] = 4484511341382233548L;
        jx.izee[35] = 1463230191063516447L;
        jx.izee[36] = 8914455301044175066L;
        jx.izee[37] = 1885011191220702432L;
        jx.izee[38] = -5670409506743125884L;
        jx.izee[39] = -7303801391789413327L;
    }

    static {
        izdq = new int[66];
        izdr = new int[66];
        jx.izhy();
        jx.izhz();
        ized = new long[40];
        izee = new long[40];
        jx.izia();
        jx.izib();
    }

    private static /* synthetic */ void izhy() {
        jx.izdq[0] = -2021569965;
        jx.izdq[1] = -17562280;
        jx.izdq[2] = 2084153567;
        jx.izdq[3] = -1194363712;
        jx.izdq[4] = -1256851065;
        jx.izdq[5] = 772559127;
        jx.izdq[6] = 1214698699;
        jx.izdq[7] = -60681485;
        jx.izdq[8] = 1791204960;
        jx.izdq[9] = -1142885033;
        jx.izdq[10] = -1337645600;
        jx.izdq[11] = 1496896664;
        jx.izdq[12] = -2065154513;
        jx.izdq[13] = 1433295450;
        jx.izdq[14] = -1984542081;
        jx.izdq[15] = 1549513506;
        jx.izdq[16] = -1206312639;
        jx.izdq[17] = -1645189924;
        jx.izdq[18] = -874003435;
        jx.izdq[19] = -4418980;
        jx.izdq[20] = 1498611236;
        jx.izdq[21] = -1802575748;
        jx.izdq[22] = -699405472;
        jx.izdq[23] = -986075788;
        jx.izdq[24] = 2044380912;
        jx.izdq[25] = -1890903372;
        jx.izdq[26] = -2103756006;
        jx.izdq[27] = 1752806381;
        jx.izdq[28] = 51664792;
        jx.izdq[29] = 1804390713;
        jx.izdq[30] = -1579299002;
        jx.izdq[31] = -651248811;
        jx.izdq[32] = -1275691384;
        jx.izdq[33] = -237069439;
        jx.izdq[34] = 2511131;
        jx.izdq[35] = -1656400343;
        jx.izdq[36] = 1703427875;
        jx.izdq[37] = -1579592493;
        jx.izdq[38] = 1440872313;
        jx.izdq[39] = -62181075;
        jx.izdq[40] = -858190188;
        jx.izdq[41] = 997007836;
        jx.izdq[42] = -159856079;
        jx.izdq[43] = -681724954;
        jx.izdq[44] = 630313372;
        jx.izdq[45] = -1764305726;
        jx.izdq[46] = -1041825859;
        jx.izdq[47] = -557455460;
        jx.izdq[48] = 1334855966;
        jx.izdq[49] = -1494913935;
        jx.izdq[50] = 2139967309;
        jx.izdq[51] = -1103458485;
        jx.izdq[52] = 1838975461;
        jx.izdq[53] = -1657720950;
        jx.izdq[54] = -275039341;
        jx.izdq[55] = -702222065;
        jx.izdq[56] = -1842749015;
        jx.izdq[57] = -2066133117;
        jx.izdq[58] = -1944387819;
        jx.izdq[59] = 1630682713;
        jx.izdq[60] = 631750699;
        jx.izdq[61] = -371653898;
        jx.izdq[62] = 1269272328;
        jx.izdq[63] = 1174712547;
        jx.izdq[64] = -1320252087;
        jx.izdq[65] = 1266702257;
    }

    public static /* synthetic */ CallSite izds(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long izec(int n2) {
        return ized[n2] ^ izee[n2];
    }

    private static /* synthetic */ void izhz() {
        jx.izdr[0] = -2021569968;
        jx.izdr[1] = -17562279;
        jx.izdr[2] = 2084153567;
        jx.izdr[3] = -1194363709;
        jx.izdr[4] = -1256851066;
        jx.izdr[5] = 772559125;
        jx.izdr[6] = 1214698697;
        jx.izdr[7] = -60681486;
        jx.izdr[8] = 1791204961;
        jx.izdr[9] = -1142885034;
        jx.izdr[10] = 827202925;
        jx.izdr[11] = 1496896665;
        jx.izdr[12] = -2065154514;
        jx.izdr[13] = -945482697;
        jx.izdr[14] = -1984542082;
        jx.izdr[15] = 1549513506;
        jx.izdr[16] = -1206312634;
        jx.izdr[17] = -1645189932;
        jx.izdr[18] = -874003437;
        jx.izdr[19] = -4418977;
        jx.izdr[20] = 1498611237;
        jx.izdr[21] = -1802575746;
        jx.izdr[22] = -699405466;
        jx.izdr[23] = -986075789;
        jx.izdr[24] = 2044380918;
        jx.izdr[25] = -1890903374;
        jx.izdr[26] = -2103756003;
        jx.izdr[27] = 1752806380;
        jx.izdr[28] = -695640359;
        jx.izdr[29] = 1804390712;
        jx.izdr[30] = 1986486743;
        jx.izdr[31] = -651248812;
        jx.izdr[32] = -1275691384;
        jx.izdr[33] = -237069439;
        jx.izdr[34] = 2511129;
        jx.izdr[35] = -1656400344;
        jx.izdr[36] = -1429836915;
        jx.izdr[37] = -1579592494;
        jx.izdr[38] = 2023722717;
        jx.izdr[39] = -62181076;
        jx.izdr[40] = -1728592646;
        jx.izdr[41] = 997007837;
        jx.izdr[42] = -159856077;
        jx.izdr[43] = -681724955;
        jx.izdr[44] = 630313373;
        jx.izdr[45] = -1764305725;
        jx.izdr[46] = -764602363;
        jx.izdr[47] = -557455459;
        jx.izdr[48] = 1138460146;
        jx.izdr[49] = -1494913936;
        jx.izdr[50] = 1974850897;
        jx.izdr[51] = -1103458486;
        jx.izdr[52] = 464624764;
        jx.izdr[53] = -1657720951;
        jx.izdr[54] = -275039342;
        jx.izdr[55] = -702222068;
        jx.izdr[56] = -1842749013;
        jx.izdr[57] = -2066133118;
        jx.izdr[58] = -1278201989;
        jx.izdr[59] = 1630682712;
        jx.izdr[60] = -2135070230;
        jx.izdr[61] = -371653900;
        jx.izdr[62] = 1269272329;
        jx.izdr[63] = 1174712551;
        jx.izdr[64] = -1320252088;
        jx.izdr[65] = 1266702256;
    }
}

