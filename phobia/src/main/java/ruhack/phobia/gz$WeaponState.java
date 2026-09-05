/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.ObjectMethods
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

record gz$WeaponState(double speed) {
    private static long[] fify;
    private final double speed;
    public static final boolean a;
    private static long[] fifz;
    public static final boolean c;
    private static int[] fifr;
    public static final int b;
    private static int[] fifs;
    private static final long mb = 5966245311014104775L;

    private gz$WeaponState {
        int n2 = b;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public double speed() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gz$WeaponState.mb - gz$WeaponState.fift("fiia", fifx(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gz$WeaponState.fift("fiib", fifq(int ), (int)29)) break;
            v0 /* !! */  = (long)gz$WeaponState.fift("fiic", fifq(int ), (int)30);
        }
        var3_1 = gz$WeaponState.c;
        v1 /* !! */  = gz$WeaponState.mb;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - gz$WeaponState.fift("fiid", fifx(int ), (int)24));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -170529081: {
                    break block12;
                }
                case 184048615: {
                    v2 = gz$WeaponState.fift("fiie", fifx(int ), (int)25);
                    continue block12;
                }
                case 1487006512: {
                    v2 = gz$WeaponState.fift("fiif", fifx(int ), (int)26);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = gz$WeaponState.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gz$WeaponState.mb - gz$WeaponState.fift("fiig", fifx(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gz$WeaponState.fift("fiih", fifq(int ), (int)31)) break;
            v3 /* !! */  = (long)gz$WeaponState.fift("fiii", fifq(int ), (int)32);
        }
        var1_3 = gz$WeaponState.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return (double)gz$WeaponState.fift("fiil", fiij(int ), (int)28);
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gz$WeaponState.mb - gz$WeaponState.fift("fiim", fifx(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gz$WeaponState.fift("fiin", fifq(int ), (int)33)) break;
                    v4 /* !! */  = (long)gz$WeaponState.fift("fiio", fifq(int ), (int)34);
                }
                return this.speed;
            }
lbl45:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)gz$WeaponState.fift("fiip", fifq(int ), (int)35);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)gz$WeaponState.fift("fiiq", fifq(int ), (int)36);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gz$WeaponState.fift("fiir", fifq(int ), (int)37);
                    if (!var3_1) ** GOTO lbl45
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gz$WeaponState.fift("fiis", fifq(int ), (int)38);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean equals(Object var1_1) {
        v0 /* !! */  = gz$WeaponState.mb;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - gz$WeaponState.fift("fihh", fifx(int ), (int)14));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -986882056: {
                    v1 = gz$WeaponState.fift("fihi", fifx(int ), (int)15);
                    continue block17;
                }
                case -170529081: {
                    break block17;
                }
                case 1886241314: {
                    v1 = gz$WeaponState.fift("fihj", fifx(int ), (int)16);
                    continue block17;
                }
            }
            break;
        }
        var4_2 = gz$WeaponState.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gz$WeaponState.mb - gz$WeaponState.fift("fihk", fifx(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gz$WeaponState.fift("fihl", fifq(int ), (int)20)) break;
            v2 /* !! */  = (long)gz$WeaponState.fift("fihm", fifq(int ), (int)21);
        }
        var3_3 /* !! */  = gz$WeaponState.b;
        v3 /* !! */  = gz$WeaponState.mb;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - gz$WeaponState.fift("fihn", fifx(int ), (int)18));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -806947356: {
                    v4 = gz$WeaponState.fift("fiho", fifx(int ), (int)19);
                    continue block19;
                }
                case -170529081: {
                    break block19;
                }
                case -134246415: {
                    v4 = gz$WeaponState.fift("fihp", fifx(int ), (int)20);
                    continue block19;
                }
                case 1061040773: {
                    v4 = gz$WeaponState.fift("fihq", fifx(int ), (int)21);
                    continue block19;
                }
            }
            break;
        }
        var2_4 = gz$WeaponState.a;
        if (var4_2) {
            throw null;
            return (boolean)gz$WeaponState.fift("fihr", fifq(int ), (int)22);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gz$WeaponState.mb - gz$WeaponState.fift("fihs", fifx(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gz$WeaponState.fift("fiht", fifq(int ), (int)23)) break;
                    v5 /* !! */  = (long)gz$WeaponState.fift("fihu", fifq(int ), (int)24);
                }
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gz$WeaponState.class, "speed", "speed"}, this, var1_1);
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)gz$WeaponState.fift("fihv", fifq(int ), (int)25);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)gz$WeaponState.fift("fihx", fifq(int ), (int)26);
                if (!var4_2) break;
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)gz$WeaponState.fift("fihy", fifq(int ), (int)27);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)gz$WeaponState.fift("fihz", fifq(int ), (int)28);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite fift(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        fifr = new int[39];
        fifs = new int[39];
        gz$WeaponState.fiit();
        gz$WeaponState.fiiv();
        fify = new long[30];
        fifz = new long[30];
        gz$WeaponState.fiiz();
        gz$WeaponState.fija();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final String toString() {
        v0 /* !! */  = gz$WeaponState.mb;
        block19: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -170529081: {
                    break block19;
                }
                case 981725842: {
                    v0 /* !! */  = (long)(gz$WeaponState.fift("figb", fifx(int ), (int)1) - gz$WeaponState.fift("figa", fifx(int ), (int)0));
                    continue block19;
                }
            }
            break;
        }
        var3_1 = gz$WeaponState.c;
        v1 /* !! */  = gz$WeaponState.mb;
        if (true) ** GOTO lbl14
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - gz$WeaponState.fift("figc", fifx(int ), (int)2));
lbl14:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1728434064: {
                    v2 = gz$WeaponState.fift("figd", fifx(int ), (int)3);
                    continue block20;
                }
                case -170529081: {
                    break block20;
                }
                case 665230580: {
                    v2 = gz$WeaponState.fift("fige", fifx(int ), (int)4);
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = gz$WeaponState.b;
        v3 /* !! */  = gz$WeaponState.mb;
        block21: while (true) {
            switch ((int)v3 /* !! */ ) {
                case -170529081: {
                    break block21;
                }
                case 193213313: {
                    v3 /* !! */  = (long)(gz$WeaponState.fift("figg", fifx(int ), (int)6) - gz$WeaponState.fift("figf", fifx(int ), (int)5));
                    continue block21;
                }
            }
            break;
        }
        var1_3 = gz$WeaponState.a;
        if (var3_1) {
            throw null;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 != false) return null;
                if (var1_3 != false) return null;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = gz$WeaponState.mb - gz$WeaponState.fift("figh", fifx(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gz$WeaponState.fift("figj", fifq(int ), (int)3)) {
                        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gz$WeaponState.class, "speed", "speed"}, this);
                    }
                    v4 /* !! */  = (long)gz$WeaponState.fift("figk", fifq(int ), (int)4);
                }
            }
            case 0: {
                ** GOTO lbl58
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)gz$WeaponState.fift("fign", fifq(int ), (int)7);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)gz$WeaponState.fift("figo", fifq(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
lbl58:
                // 3 sources

                var2_2 /* !! */  = (int)gz$WeaponState.fift("figl", fifq(int ), (int)5);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: 
        }
        do {
            var2_2 /* !! */  = (int)gz$WeaponState.fift("figm", fifq(int ), (int)6);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void fiiv() {
        gz$WeaponState.fifs[0] = 1166671748;
        gz$WeaponState.fifs[1] = -822850785;
        gz$WeaponState.fifs[2] = -119526884;
        gz$WeaponState.fifs[3] = 877886791;
        gz$WeaponState.fifs[4] = -46542878;
        gz$WeaponState.fifs[5] = 1440857525;
        gz$WeaponState.fifs[6] = -1681272506;
        gz$WeaponState.fifs[7] = 596649559;
        gz$WeaponState.fifs[8] = -1075611167;
        gz$WeaponState.fifs[9] = 1038092573;
        gz$WeaponState.fifs[10] = -258232326;
        gz$WeaponState.fifs[11] = 1499410876;
        gz$WeaponState.fifs[12] = -459087180;
        gz$WeaponState.fifs[13] = 1950585817;
        gz$WeaponState.fifs[14] = 737758645;
        gz$WeaponState.fifs[15] = -356537581;
        gz$WeaponState.fifs[16] = -2008122212;
        gz$WeaponState.fifs[17] = 55642426;
        gz$WeaponState.fifs[18] = -871345580;
        gz$WeaponState.fifs[19] = -396246806;
        gz$WeaponState.fifs[20] = -381394983;
        gz$WeaponState.fifs[21] = 2142505465;
        gz$WeaponState.fifs[22] = -1414305964;
        gz$WeaponState.fifs[23] = 1115005827;
        gz$WeaponState.fifs[24] = -628600392;
        gz$WeaponState.fifs[25] = -1893946519;
        gz$WeaponState.fifs[26] = -364846639;
        gz$WeaponState.fifs[27] = 1519492506;
        gz$WeaponState.fifs[28] = 408991219;
        gz$WeaponState.fifs[29] = 984238257;
        gz$WeaponState.fifs[30] = -1833561034;
        gz$WeaponState.fifs[31] = 977381378;
        gz$WeaponState.fifs[32] = 466456141;
        gz$WeaponState.fifs[33] = 276787165;
        gz$WeaponState.fifs[34] = 526490532;
        gz$WeaponState.fifs[35] = 1942627922;
        gz$WeaponState.fifs[36] = 1288954265;
        gz$WeaponState.fifs[37] = 1462103618;
        gz$WeaponState.fifs[38] = -327455427;
    }

    private static /* synthetic */ void fija() {
        gz$WeaponState.fifz[0] = 2895022833173340809L;
        gz$WeaponState.fifz[1] = 1868173040479240161L;
        gz$WeaponState.fifz[2] = 4501206379389794104L;
        gz$WeaponState.fifz[3] = -7717583465673701238L;
        gz$WeaponState.fifz[4] = -8569232582659422820L;
        gz$WeaponState.fifz[5] = 1532132057852792916L;
        gz$WeaponState.fifz[6] = -6709926096025911973L;
        gz$WeaponState.fifz[7] = 5619614149287315719L;
        gz$WeaponState.fifz[8] = -999005569054843608L;
        gz$WeaponState.fifz[9] = -2571628035558370298L;
        gz$WeaponState.fifz[10] = -8373203447875405930L;
        gz$WeaponState.fifz[11] = 6774935804095437405L;
        gz$WeaponState.fifz[12] = -4816100416568067894L;
        gz$WeaponState.fifz[13] = 2908861982678216569L;
        gz$WeaponState.fifz[14] = -778096176202120274L;
        gz$WeaponState.fifz[15] = 7401444322667988093L;
        gz$WeaponState.fifz[16] = -7618051633249140584L;
        gz$WeaponState.fifz[17] = 8455035669122744533L;
        gz$WeaponState.fifz[18] = 7448980169193594476L;
        gz$WeaponState.fifz[19] = -397489368092574202L;
        gz$WeaponState.fifz[20] = -9160610494309710633L;
        gz$WeaponState.fifz[21] = -4646892917099333624L;
        gz$WeaponState.fifz[22] = -5424224781494081635L;
        gz$WeaponState.fifz[23] = -2066385672332644352L;
        gz$WeaponState.fifz[24] = -4680582191477368605L;
        gz$WeaponState.fifz[25] = -4952914692423492228L;
        gz$WeaponState.fifz[26] = -3060670243714940356L;
        gz$WeaponState.fifz[27] = 2270037784154681055L;
        gz$WeaponState.fifz[28] = 4898792954552872487L;
        gz$WeaponState.fifz[29] = 4969760920769322126L;
    }

    private static /* synthetic */ int fifq(int n2) {
        return fifr[n2] ^ fifs[n2];
    }

    private static /* synthetic */ void fiit() {
        gz$WeaponState.fifr[0] = 1166671748;
        gz$WeaponState.fifr[1] = -822850785;
        gz$WeaponState.fifr[2] = -119526883;
        gz$WeaponState.fifr[3] = 877886790;
        gz$WeaponState.fifr[4] = -607144565;
        gz$WeaponState.fifr[5] = 1440857527;
        gz$WeaponState.fifr[6] = -1681272507;
        gz$WeaponState.fifr[7] = 596649556;
        gz$WeaponState.fifr[8] = -1075611165;
        gz$WeaponState.fifr[9] = -1038092574;
        gz$WeaponState.fifr[10] = -1182006902;
        gz$WeaponState.fifr[11] = -1499410877;
        gz$WeaponState.fifr[12] = 1276410535;
        gz$WeaponState.fifr[13] = 1950585816;
        gz$WeaponState.fifr[14] = 793155261;
        gz$WeaponState.fifr[15] = 1055041231;
        gz$WeaponState.fifr[16] = -2008122211;
        gz$WeaponState.fifr[17] = 55642426;
        gz$WeaponState.fifr[18] = -871345577;
        gz$WeaponState.fifr[19] = -396246807;
        gz$WeaponState.fifr[20] = -381394984;
        gz$WeaponState.fifr[21] = 1436473172;
        gz$WeaponState.fifr[22] = -1414305964;
        gz$WeaponState.fifr[23] = 1115005826;
        gz$WeaponState.fifr[24] = -1779296714;
        gz$WeaponState.fifr[25] = -1893946519;
        gz$WeaponState.fifr[26] = -364846639;
        gz$WeaponState.fifr[27] = 1519492507;
        gz$WeaponState.fifr[28] = 408991217;
        gz$WeaponState.fifr[29] = 984238256;
        gz$WeaponState.fifr[30] = 189968631;
        gz$WeaponState.fifr[31] = -977381379;
        gz$WeaponState.fifr[32] = 1471846878;
        gz$WeaponState.fifr[33] = 276787164;
        gz$WeaponState.fifr[34] = 391549991;
        gz$WeaponState.fifr[35] = 1942627920;
        gz$WeaponState.fifr[36] = 1288954267;
        gz$WeaponState.fifr[37] = 1462103617;
        gz$WeaponState.fifr[38] = -327455425;
    }

    private static /* synthetic */ double fiij(int n2) {
        return Double.longBitsToDouble(fify[n2] ^ fifz[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int hashCode() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gz$WeaponState.mb - gz$WeaponState.fift("figp", fifx(int ), (int)8)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gz$WeaponState.fift("figq", fifq(int ), (int)9)) break;
            v0 /* !! */  = (long)gz$WeaponState.fift("figr", fifq(int ), (int)10);
        }
        var3_1 = gz$WeaponState.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gz$WeaponState.mb - gz$WeaponState.fift("figs", fifx(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gz$WeaponState.fift("figt", fifq(int ), (int)11)) break;
            v1 /* !! */  = (long)gz$WeaponState.fift("figu", fifq(int ), (int)12);
        }
        var2_2 /* !! */  = gz$WeaponState.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_2 = gz$WeaponState.mb - gz$WeaponState.fift("figv", fifx(int ), (int)10)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == gz$WeaponState.fift("figw", fifq(int ), (int)13)) break;
                    v2 /* !! */  = (long)gz$WeaponState.fift("figx", fifq(int ), (int)14);
                }
                var1_3 = gz$WeaponState.a;
                if (var3_1) {
                    throw null;
                    return (int)gz$WeaponState.fift("figy", fifq(int ), (int)15);
                }
                if (var1_3 || var1_3) ** continue;
                v3 /* !! */  = gz$WeaponState.mb;
                if (true) ** GOTO lbl34
                block15: while (true) {
                    v3 /* !! */  = (long)(v4 - gz$WeaponState.fift("figz", fifx(int ), (int)11));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -743948654: {
                            v4 = gz$WeaponState.fift("fiha", fifx(int ), (int)12);
                            continue block15;
                        }
                        case -170529081: {
                            break block15;
                        }
                        case 1513999662: {
                            v4 = gz$WeaponState.fift("fihb", fifx(int ), (int)13);
                            continue block15;
                        }
                    }
                    break;
                }
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gz$WeaponState.class, "speed", "speed"}, this);
            }
            case 0: {
                var2_2 /* !! */  = (int)gz$WeaponState.fift("fihc", fifq(int ), (int)16);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl53
            }
            case 1: {
                var2_2 /* !! */  = (int)gz$WeaponState.fift("fihe", fifq(int ), (int)17);
                if (var3_1) {
                    throw null;
                }
            }
lbl53:
            // 4 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gz$WeaponState.fift("fihf", fifq(int ), (int)18);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gz$WeaponState.fift("fihg", fifq(int ), (int)19);
        ** while (!var3_1)
lbl61:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fiiz() {
        gz$WeaponState.fify[0] = -7352172722952340411L;
        gz$WeaponState.fify[1] = -813621141920930450L;
        gz$WeaponState.fify[2] = 3689931103755436831L;
        gz$WeaponState.fify[3] = -7784705297403637396L;
        gz$WeaponState.fify[4] = 8077391205085057165L;
        gz$WeaponState.fify[5] = -5018949892010684226L;
        gz$WeaponState.fify[6] = 7074996743399100406L;
        gz$WeaponState.fify[7] = 980653499519122045L;
        gz$WeaponState.fify[8] = -8578201333911017702L;
        gz$WeaponState.fify[9] = -4739162154327663467L;
        gz$WeaponState.fify[10] = -8307529115529782045L;
        gz$WeaponState.fify[11] = -1704481925950662978L;
        gz$WeaponState.fify[12] = 4869611474096879950L;
        gz$WeaponState.fify[13] = -6653936866514978103L;
        gz$WeaponState.fify[14] = -5192576112634161766L;
        gz$WeaponState.fify[15] = 2401993690197364961L;
        gz$WeaponState.fify[16] = -3570953455026409301L;
        gz$WeaponState.fify[17] = -3412021136331920262L;
        gz$WeaponState.fify[18] = 2285890647115341693L;
        gz$WeaponState.fify[19] = 7878925934790438197L;
        gz$WeaponState.fify[20] = -6680570276026730261L;
        gz$WeaponState.fify[21] = 7719028634142733136L;
        gz$WeaponState.fify[22] = 6637239881859272453L;
        gz$WeaponState.fify[23] = 4668608127970021998L;
        gz$WeaponState.fify[24] = -4372695714976541471L;
        gz$WeaponState.fify[25] = 2011046221966817526L;
        gz$WeaponState.fify[26] = -551644024994753392L;
        gz$WeaponState.fify[27] = 7669284165665775744L;
        gz$WeaponState.fify[28] = 8943509816771418910L;
        gz$WeaponState.fify[29] = 7996252232147514663L;
    }

    private static /* synthetic */ long fifx(int n2) {
        return fify[n2] ^ fifz[n2];
    }
}

