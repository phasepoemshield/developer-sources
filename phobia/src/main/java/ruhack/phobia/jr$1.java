/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.LinkedHashMap;
import java.util.Map;
import ruhack.phobia.jr;
import ruhack.phobia.jr$CachedName;

class jr$1
extends LinkedHashMap<Integer, jr.CachedName> {
    private static int[] bruw = new int[17];
    private static long[] brvd;
    final /* synthetic */ jr this$0;
    private static final long dz = -4045795844550955400L;
    public static final boolean c;
    private static long[] brve;
    public static final boolean a;
    public static final int b;
    private static int[] brux;

    static {
        brux = new int[17];
        jr$1.brwc();
        jr$1.brwd();
        brvd = new long[9];
        brve = new long[9];
        jr$1.brwe();
        jr$1.brwf();
    }

    private static /* synthetic */ int bruv(int n2) {
        return bruw[n2] ^ brux[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    jr$1(jr var1_1, int var2_2, float var3_3, boolean var4_4) {
        var6_5 /* !! */  = jr$1.b;
        this.this$0 = var1_1;
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var6_5 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    super(var2_2, var3_3, var4_4);
                    return;
                }
                case 2: {
                    var6_5 /* !! */  = (int)jr$1.bruy("brvb", bruv(int ), (int)2);
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var6_5 /* !! */  = (int)jr$1.bruy("bruz", bruv(int ), (int)0);
                }
                case 1: 
            }
            if (true) ** GOTO lbl19
            break;
        }
        while (true) {
            if (true) ** continue;
lbl19:
            // 2 sources

            var6_5 /* !! */  = (int)jr$1.bruy("brva", bruv(int ), (int)1);
            cfr_temp_0 = 0;
        }
    }

    private static /* synthetic */ void brwe() {
        jr$1.brvd[0] = -3746505938674075560L;
        jr$1.brvd[1] = -4990770585395219399L;
        jr$1.brvd[2] = 8963632507234463778L;
        jr$1.brvd[3] = 4161434417189970247L;
        jr$1.brvd[4] = -4924943753011463151L;
        jr$1.brvd[5] = 3120311919541174489L;
        jr$1.brvd[6] = -2389214778553835979L;
        jr$1.brvd[7] = 1508505178806526611L;
        jr$1.brvd[8] = -8292657278564636913L;
    }

    private static /* synthetic */ void brwc() {
        jr$1.bruw[0] = 921075031;
        jr$1.bruw[1] = -1130499185;
        jr$1.bruw[2] = -837912454;
        jr$1.bruw[3] = 1733602496;
        jr$1.bruw[4] = 2030343331;
        jr$1.bruw[5] = -661046372;
        jr$1.bruw[6] = -1167210111;
        jr$1.bruw[7] = 1083393085;
        jr$1.bruw[8] = -1181108139;
        jr$1.bruw[9] = -1868661886;
        jr$1.bruw[10] = -1042401102;
        jr$1.bruw[11] = 1787617488;
        jr$1.bruw[12] = -557164686;
        jr$1.bruw[13] = 1292120883;
        jr$1.bruw[14] = -1856948303;
        jr$1.bruw[15] = 1011941910;
        jr$1.bruw[16] = -231358769;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, jr.CachedName> var1_1) {
        v0 /* !! */  = jr$1.dz;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(jr$1.bruy("brvg", brvc(int ), (int)1) - jr$1.bruy("brvf", brvc(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1072705320: {
                    continue block24;
                }
                case 1808395896: {
                    break block24;
                }
            }
            break;
        }
        var4_2 = jr$1.c;
        v1 /* !! */  = jr$1.dz;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(jr$1.bruy("brvi", brvc(int ), (int)3) - jr$1.bruy("brvh", brvc(int ), (int)2));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -481969247: {
                    continue block25;
                }
                case 1808395896: {
                    break block25;
                }
            }
            break;
        }
        var3_3 /* !! */  = jr$1.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jr$1.dz - jr$1.bruy("brvj", brvc(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == jr$1.bruy("brvk", bruv(int ), (int)3)) break;
            v2 /* !! */  = (long)jr$1.bruy("brvl", bruv(int ), (int)4);
        }
        var2_4 = jr$1.a;
        if (var4_2) {
            throw null;
lbl30:
            // 3 sources

            return (boolean)jr$1.bruy("brvm", bruv(int ), (int)5);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl30
                v3 /* !! */  = jr$1.dz;
                if (true) ** GOTO lbl40
                block28: while (true) {
                    v3 /* !! */  = (long)(v4 - jr$1.bruy("brvn", brvc(int ), (int)5));
lbl40:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1841878203: {
                            v4 = jr$1.bruy("brvo", brvc(int ), (int)6);
                            continue block28;
                        }
                        case -1689989436: {
                            v4 = jr$1.bruy("brvp", brvc(int ), (int)7);
                            continue block28;
                        }
                        case -1095780984: {
                            v4 = jr$1.bruy("brvq", brvc(int ), (int)8);
                            continue block28;
                        }
                        case 1808395896: {
                            break block28;
                        }
                    }
                    break;
                }
                if (this.size() <= jr$1.bruy("brvr", bruv(int ), (int)6)) ** GOTO lbl58
                if (var2_4) ** GOTO lbl30
                v5 = jr$1.bruy("brvs", bruv(int ), (int)7);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl61
lbl58:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v5 = jr$1.bruy("brvt", bruv(int ), (int)8);
lbl61:
                // 2 sources

                return (boolean)v5;
            }
lbl62:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jr$1.bruy("brvu", bruv(int ), (int)9);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl90
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)jr$1.bruy("brvv", bruv(int ), (int)10);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)jr$1.bruy("brvw", bruv(int ), (int)11);
                } while (!var4_2);
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)jr$1.bruy("brvx", bruv(int ), (int)12);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl82:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)jr$1.bruy("brvy", bruv(int ), (int)13);
                if (var4_2) {
                    throw null;
                }
            }
            case 5: {
                var3_3 /* !! */  = (int)jr$1.bruy("brvz", bruv(int ), (int)14);
                if (!var4_2) ** GOTO lbl62
                throw null;
            }
lbl90:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)jr$1.bruy("brwa", bruv(int ), (int)15);
                if (!var4_2) ** GOTO lbl82
                throw null;
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)jr$1.bruy("brwb", bruv(int ), (int)16);
        ** while (!var4_2)
lbl97:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void brwf() {
        jr$1.brve[0] = -6990758082870007484L;
        jr$1.brve[1] = 8340111213348173649L;
        jr$1.brve[2] = -3831173722864930609L;
        jr$1.brve[3] = -1002996020977335514L;
        jr$1.brve[4] = 7139289574717530152L;
        jr$1.brve[5] = -5230171284094002661L;
        jr$1.brve[6] = 8389698979967741120L;
        jr$1.brve[7] = -1169751919317533442L;
        jr$1.brve[8] = 8339471469687380896L;
    }

    private static /* synthetic */ void brwd() {
        jr$1.brux[0] = 921075030;
        jr$1.brux[1] = -1130499185;
        jr$1.brux[2] = -837912453;
        jr$1.brux[3] = -1733602497;
        jr$1.brux[4] = -43399285;
        jr$1.brux[5] = -661046372;
        jr$1.brux[6] = -1167210367;
        jr$1.brux[7] = 1083393084;
        jr$1.brux[8] = -1181108139;
        jr$1.brux[9] = -1868661887;
        jr$1.brux[10] = -1042401097;
        jr$1.brux[11] = 1787617495;
        jr$1.brux[12] = -557164683;
        jr$1.brux[13] = 1292120885;
        jr$1.brux[14] = -1856948298;
        jr$1.brux[15] = 1011941905;
        jr$1.brux[16] = -231358769;
    }

    public static /* synthetic */ CallSite bruy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long brvc(int n2) {
        return brvd[n2] ^ brve[n2];
    }
}

