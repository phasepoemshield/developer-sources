/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.jx;
import ruhack.phobia.ne;

public abstract class nf
extends ne {
    private static long[] hhub;
    protected float alphaMultiplier;
    public static final boolean a;
    private static int[] hhuh;
    private static int[] hhug;
    public static final boolean c;
    private static long[] hhuc;
    static final long ol = -6814274977766183488L;
    private final jx setting;
    public static final int b;

    private static /* synthetic */ void hicl() {
        nf.hhug[100] = 734994264;
        nf.hhug[101] = 1527540289;
        nf.hhug[102] = 650017825;
        nf.hhug[103] = -799475467;
        nf.hhug[104] = -477466197;
        nf.hhug[105] = 605780661;
        nf.hhug[106] = 258670735;
        nf.hhug[107] = 42146649;
        nf.hhug[108] = 1330130669;
        nf.hhug[109] = -190747415;
        nf.hhug[110] = 1705131429;
        nf.hhug[111] = -628264542;
        nf.hhug[112] = -1414293108;
        nf.hhug[113] = 1343527187;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getAlphaMultiplier() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nf.ol - nf.hhud("hibm", hhua(int ), (int)89)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nf.hhud("hibn", hhuf(int ), (int)98)) break;
            v0 /* !! */  = (long)nf.hhud("hibo", hhuf(int ), (int)99);
        }
        var3_1 = nf.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nf.ol - nf.hhud("hibp", hhua(int ), (int)90)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == nf.hhud("hibq", hhuf(int ), (int)100)) break;
            v1 /* !! */  = (long)nf.hhud("hibr", hhuf(int ), (int)101);
        }
        var2_2 /* !! */  = nf.b;
        v2 /* !! */  = nf.ol;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - nf.hhud("hibs", hhua(int ), (int)91));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1738039720: {
                    v3 = nf.hhud("hibt", hhua(int ), (int)92);
                    continue block14;
                }
                case -462819904: {
                    break block14;
                }
                case -199173373: {
                    v3 = nf.hhud("hibu", hhua(int ), (int)93);
                    continue block14;
                }
                case 378057721: {
                    v3 = nf.hhud("hibv", hhua(int ), (int)94);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = nf.a;
        if (var3_1) {
            throw null;
            return (float)nf.hhud("hibx", hibw(int ), (int)102);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = nf.ol - nf.hhud("hiby", hhua(int ), (int)95)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nf.hhud("hibz", hhuf(int ), (int)103)) break;
                    v4 /* !! */  = (long)nf.hhud("hica", hhuf(int ), (int)104);
                }
                return this.alphaMultiplier;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)nf.hhud("hicb", hhuf(int ), (int)105);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)nf.hhud("hicc", hhuf(int ), (int)106);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)nf.hhud("hicd", hhuf(int ), (int)107);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)nf.hhud("hice", hhuf(int ), (int)108);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void hicn() {
        nf.hhuh[100] = -734994265;
        nf.hhuh[101] = -270155831;
        nf.hhuh[102] = 435249731;
        nf.hhuh[103] = 799475466;
        nf.hhuh[104] = -1918018982;
        nf.hhuh[105] = 605780663;
        nf.hhuh[106] = 258670735;
        nf.hhuh[107] = 42146648;
        nf.hhuh[108] = 1330130668;
        nf.hhuh[109] = -190747413;
        nf.hhuh[110] = 1705131428;
        nf.hhuh[111] = -628264538;
        nf.hhuh[112] = -1414293106;
        nf.hhuh[113] = 1343527187;
    }

    private static /* synthetic */ int hhuf(int n2) {
        return hhug[n2] ^ hhuh[n2];
    }

    private static /* synthetic */ float hibw(int n2) {
        return Float.intBitsToFloat(hhug[n2] ^ hhuh[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Color applyAlpha(Color var1_1, float var2_2) {
        v0 /* !! */  = nf.ol;
        if (true) ** GOTO lbl5
        block41: while (true) {
            v0 /* !! */  = (long)(v1 - nf.hhud("hhzc", hhua(int ), (int)57));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2091099942: {
                    v1 = nf.hhud("hhzd", hhua(int ), (int)58);
                    continue block41;
                }
                case -1320290054: {
                    v1 = nf.hhud("hhze", hhua(int ), (int)59);
                    continue block41;
                }
                case -462819904: {
                    break block41;
                }
                case 2126065863: {
                    v1 = nf.hhud("hhzf", hhua(int ), (int)60);
                    continue block41;
                }
            }
            break;
        }
        var6_3 = nf.c;
        v2 /* !! */  = nf.ol;
        if (true) ** GOTO lbl22
        block42: while (true) {
            v2 /* !! */  = (long)(v3 - nf.hhud("hhzg", hhua(int ), (int)61));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -462819904: {
                    break block42;
                }
                case 119937393: {
                    v3 = nf.hhud("hhzh", hhua(int ), (int)62);
                    continue block42;
                }
                case 1569858518: {
                    v3 = nf.hhud("hhzi", hhua(int ), (int)63);
                    continue block42;
                }
                case 1781213756: {
                    v3 = nf.hhud("hhzj", hhua(int ), (int)64);
                    continue block42;
                }
            }
            break;
        }
        var5_4 /* !! */  = nf.b;
        v4 /* !! */  = nf.ol;
        if (true) ** GOTO lbl39
        block43: while (true) {
            v4 /* !! */  = (long)(v5 - nf.hhud("hhzk", hhua(int ), (int)65));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -462819904: {
                    break block43;
                }
                case 600258412: {
                    v5 = nf.hhud("hhzl", hhua(int ), (int)66);
                    continue block43;
                }
                case 918605763: {
                    v5 = nf.hhud("hhzm", hhua(int ), (int)67);
                    continue block43;
                }
                case 1443358502: {
                    v5 = nf.hhud("hhzn", hhua(int ), (int)68);
                    continue block43;
                }
            }
            break;
        }
        var4_5 = nf.a;
        if (var6_3) {
            throw null;
lbl54:
            // 3 sources

            return null;
        }
        if (var4_5) ** GOTO lbl54
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl54
                v6 = nf.hhud("hhzo", hhuf(int ), (int)68);
                v7 = nf.hhud("hhzp", hhuf(int ), (int)69);
                v8 /* !! */  = nf.ol;
                if (true) ** GOTO lbl67
                block45: while (true) {
                    v8 /* !! */  = (long)(v9 - nf.hhud("hhzq", hhua(int ), (int)69));
lbl67:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1399987178: {
                            v9 = nf.hhud("hhzr", hhua(int ), (int)70);
                            continue block45;
                        }
                        case -462819904: {
                            break block45;
                        }
                        case 1391665741: {
                            v9 = nf.hhud("hhzs", hhua(int ), (int)71);
                            continue block45;
                        }
                        case 1462553308: {
                            v9 = nf.hhud("hhzt", hhua(int ), (int)72);
                            continue block45;
                        }
                    }
                    break;
                }
                v10 = var1_1.getAlpha();
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_0 = nf.ol - nf.hhud("hhzu", hhua(int ), (int)73)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nf.hhud("hhzv", hhuf(int ), (int)70)) break;
                    v11 /* !! */  = (long)nf.hhud("hhzw", hhuf(int ), (int)71);
                }
                v12 = (int)(v10 * this.alphaMultiplier * var2_2);
                v13 /* !! */  = nf.ol;
                if (true) ** GOTO lbl90
                block47: while (true) {
                    v13 /* !! */  = (long)(v14 - nf.hhud("hhzx", hhua(int ), (int)74));
lbl90:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -640323998: {
                            v14 = nf.hhud("hhzy", hhua(int ), (int)75);
                            continue block47;
                        }
                        case -462819904: {
                            break block47;
                        }
                        case 631546528: {
                            v14 = nf.hhud("hhzz", hhua(int ), (int)76);
                            continue block47;
                        }
                    }
                    break;
                }
                v15 = Math.min((int)v7, v12);
                v16 /* !! */  = nf.ol;
                if (true) ** GOTO lbl104
                block48: while (true) {
                    v16 /* !! */  = (long)(nf.hhud("hiab", hhua(int ), (int)78) - nf.hhud("hiaa", hhua(int ), (int)77));
lbl104:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -462819904: {
                            break block48;
                        }
                        case 1301054660: {
                            continue block48;
                        }
                    }
                    break;
                }
                var3_6 = Math.max((int)v6, v15);
                if (!var4_5 && !var4_5) ** break;
                ** continue;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_1 = nf.ol - nf.hhud("hiac", hhua(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == nf.hhud("hiad", hhuf(int ), (int)72)) break;
                    v17 /* !! */  = (long)nf.hhud("hiae", hhuf(int ), (int)73);
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_2 = nf.ol - nf.hhud("hiaf", hhua(int ), (int)80)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == nf.hhud("hiag", hhuf(int ), (int)74)) break;
                    v18 /* !! */  = (long)nf.hhud("hiah", hhuf(int ), (int)75);
                }
                v19 = var1_1.getRed();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = nf.ol - nf.hhud("hiai", hhua(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == nf.hhud("hiaj", hhuf(int ), (int)76)) break;
                    v20 /* !! */  = (long)nf.hhud("hiak", hhuf(int ), (int)77);
                }
                v21 = var1_1.getGreen();
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_4 = nf.ol - nf.hhud("hial", hhua(int ), (int)82)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == nf.hhud("hiam", hhuf(int ), (int)78)) break;
                    v22 /* !! */  = (long)nf.hhud("hian", hhuf(int ), (int)79);
                }
                v23 = var1_1.getBlue();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = nf.ol - nf.hhud("hiao", hhua(int ), (int)83)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == nf.hhud("hiap", hhuf(int ), (int)80)) break;
                    v24 /* !! */  = (long)nf.hhud("hiaq", hhuf(int ), (int)81);
                }
                return new Color(v19, v21, v23, var3_6);
            }
            case 0: {
                do {
                    var5_4 /* !! */  = (int)nf.hhud("hiar", hhuf(int ), (int)82);
                } while (!var6_3);
                throw null;
            }
lbl146:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)nf.hhud("hias", hhuf(int ), (int)83);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl156
                    break;
                }
            }
            case 2: {
                var5_4 /* !! */  = (int)nf.hhud("hiat", hhuf(int ), (int)84);
                if (!var6_3) ** GOTO lbl146
                throw null;
            }
lbl156:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)nf.hhud("hiau", hhuf(int ), (int)85);
                if (!var6_3) break;
                throw null;
            }
            case 4: {
                var5_4 /* !! */  = (int)nf.hhud("hiav", hhuf(int ), (int)86);
                if (!var6_3) ** GOTO lbl146
                throw null;
            }
            case 5: 
        }
        var5_4 /* !! */  = (int)nf.hhud("hiaw", hhuf(int ), (int)87);
        ** while (!var6_3)
lbl167:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setAlphaMultiplier(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nf.ol - nf.hhud("hhue", hhua(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nf.hhud("hhui", hhuf(int ), (int)0)) break;
            v0 /* !! */  = (long)nf.hhud("hhuj", hhuf(int ), (int)1);
        }
        var4_2 = nf.c;
        v1 /* !! */  = nf.ol;
        if (true) ** GOTO lbl12
        block26: while (true) {
            v1 /* !! */  = (long)(v2 - nf.hhud("hhuk", hhua(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -568250515: {
                    v2 = nf.hhud("hhul", hhua(int ), (int)2);
                    continue block26;
                }
                case -462819904: {
                    break block26;
                }
                case 624026988: {
                    v2 = nf.hhud("hhum", hhua(int ), (int)3);
                    continue block26;
                }
                case 1168950636: {
                    v2 = nf.hhud("hhun", hhua(int ), (int)4);
                    continue block26;
                }
            }
            break;
        }
        var3_3 /* !! */  = nf.b;
        v3 /* !! */  = nf.ol;
        if (true) ** GOTO lbl29
        block27: while (true) {
            v3 /* !! */  = (long)(v4 - nf.hhud("hhuo", hhua(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1835511843: {
                    v4 = nf.hhud("hhup", hhua(int ), (int)6);
                    continue block27;
                }
                case -462819904: {
                    break block27;
                }
                case 670915012: {
                    v4 = nf.hhud("hhuq", hhua(int ), (int)7);
                    continue block27;
                }
            }
            break;
        }
        var2_4 = nf.a;
        if (var4_2) {
            throw null;
lbl41:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl41
        v5 /* !! */  = nf.ol;
        if (true) ** GOTO lbl48
        block29: while (true) {
            v5 /* !! */  = (long)(v6 - nf.hhud("hhur", hhua(int ), (int)8));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -576514913: {
                    v6 = nf.hhud("hhus", hhua(int ), (int)9);
                    continue block29;
                }
                case -462819904: {
                    break block29;
                }
                case 291779654: {
                    v6 = nf.hhud("hhut", hhua(int ), (int)10);
                    continue block29;
                }
                case 682156536: {
                    v6 = nf.hhud("hhuu", hhua(int ), (int)11);
                    continue block29;
                }
            }
            break;
        }
        this.alphaMultiplier = var1_1;
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block17 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)nf.hhud("hhuv", hhuf(int ), (int)2);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                var3_3 /* !! */  = (int)nf.hhud("hhuw", hhuf(int ), (int)3);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
lbl78:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)nf.hhud("hhux", hhuf(int ), (int)4);
                    if (!var4_2) break block17;
                    throw null;
                }
            }
lbl83:
            // 3 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)nf.hhud("hhuy", hhuf(int ), (int)5);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)nf.hhud("hhuz", hhuf(int ), (int)6);
                if (!var4_2) ** GOTO lbl78
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)nf.hhud("hhva", hhuf(int ), (int)7);
        ** while (!var4_2)
lbl95:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    protected int applyAlpha(int var1_1) {
        block25: {
            block27: {
                block26: {
                    v0 /* !! */  = nf.ol;
                    block15: while (true) {
                        switch ((int)v0 /* !! */ ) {
                            case -462819904: {
                                break block15;
                            }
                            case 1562744184: {
                                v0 /* !! */  = (long)(nf.hhud("hhwu", hhua(int ), (int)26) - nf.hhud("hhwt", hhua(int ), (int)25));
                                continue block15;
                            }
                        }
                        break;
                    }
                    var4_2 = nf.c;
                    while (true) {
                        if ((v1 /* !! */  = (cfr_temp_1 = nf.ol - nf.hhud("hhwv", hhua(int ), (int)27)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v1 /* !! */  == nf.hhud("hhww", hhuf(int ), (int)39)) break;
                        v1 /* !! */  = (long)nf.hhud("hhwx", hhuf(int ), (int)40);
                    }
                    var3_3 /* !! */  = nf.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_2 = nf.ol - nf.hhud("hhwy", hhua(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == nf.hhud("hhwz", hhuf(int ), (int)41)) {
                            var2_4 = nf.a;
                            if (var4_2) {
                                throw null;
                            }
                            break;
                        }
                        v2 /* !! */  = (long)nf.hhud("hhxa", hhuf(int ), (int)42);
                    }
                    if (var2_4 || var2_4) break block26;
                    v3 /* !! */  = nf.ol;
                    ** GOTO lbl35
                }
                if (var3_3 /* !! */  == 0) return (int)nf.hhud("hhxb", hhuf(int ), (int)43);
                cfr_temp_0 = -2147483648;
lbl31:
                // 2 sources

                block18: while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                        default: {
                            return (int)nf.hhud("hhxb", hhuf(int ), (int)43);
                        }
lbl35:
                        // 1 sources

                        block19: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -462819904: {
                                    return this.applyAlpha(var1_1, 1.0f);
                                }
                                case 1127997024: {
                                    v4 = nf.hhud("hhxd", hhua(int ), (int)30);
                                    ** GOTO lbl44
                                }
                                case 1163904705: {
                                    v4 = nf.hhud("hhxe", hhua(int ), (int)31);
lbl44:
                                    // 2 sources

                                    v3 /* !! */  = (long)(v4 - nf.hhud("hhxc", hhua(int ), (int)29));
                                    continue block19;
                                }
                            }
                            break;
                        }
                        return this.applyAlpha(var1_1, 1.0f);
                        case 0: {
                            ** break;
                        }
                        case 2: {
                            do {
                                var3_3 /* !! */  = (int)nf.hhud("hhxh", hhuf(int ), (int)46);
                            } while (!var4_2);
                            throw null;
                        }
                        case 3: {
                            break block25;
                        }
lbl56:
                        // 2 sources

                        while (true) {
                            var3_3 /* !! */  = (int)nf.hhud("hhxf", hhuf(int ), (int)44);
                            cfr_temp_0 = 1;
                            if (!var4_2) continue block18;
                            throw null;
                        }
                        case 1: 
                    }
                    break;
                }
                break block27;
                ** while (true)
            }
            var3_3 /* !! */  = (int)nf.hhud("hhxg", hhuf(int ), (int)45);
            if (var4_2) {
                throw null;
            }
        }
        var3_3 /* !! */  = (int)nf.hhud("hhxi", hhuf(int ), (int)47);
        ** while (!var4_2)
lbl71:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected int applyAlpha(int var1_1, float var2_2) {
        v0 /* !! */  = nf.ol;
        if (true) ** GOTO lbl5
        block35: while (true) {
            v0 /* !! */  = (long)(nf.hhud("hhvc", hhua(int ), (int)13) - nf.hhud("hhvb", hhua(int ), (int)12));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -462819904: {
                    break block35;
                }
                case 758247272: {
                    continue block35;
                }
            }
            break;
        }
        var10_3 = nf.c;
        v1 /* !! */  = nf.ol;
        if (true) ** GOTO lbl15
        block36: while (true) {
            v1 /* !! */  = (long)(nf.hhud("hhve", hhua(int ), (int)15) - nf.hhud("hhvd", hhua(int ), (int)14));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -715900796: {
                    continue block36;
                }
                case -462819904: {
                    break block36;
                }
            }
            break;
        }
        var9_4 /* !! */  = nf.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nf.ol - nf.hhud("hhvf", hhua(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nf.hhud("hhvg", hhuf(int ), (int)8)) break;
            v2 /* !! */  = (long)nf.hhud("hhvh", hhuf(int ), (int)9);
        }
        var8_5 = nf.a;
        if (var10_3) {
            throw null;
lbl30:
            // 7 sources

            return (int)nf.hhud("hhvi", hhuf(int ), (int)10);
        }
        if (var8_5 || var8_5) ** GOTO lbl30
        var3_6 = var1_1 >> nf.hhud("hhvj", hhuf(int ), (int)11) & nf.hhud("hhvk", hhuf(int ), (int)12);
        if (var8_5 || var8_5) ** GOTO lbl30
        var4_7 = var1_1 >> nf.hhud("hhvl", hhuf(int ), (int)13) & nf.hhud("hhvm", hhuf(int ), (int)14);
        if (var8_5) ** GOTO lbl30
        if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_5) ** GOTO lbl30
                var5_8 = var1_1 >> nf.hhud("hhvn", hhuf(int ), (int)15) & nf.hhud("hhvo", hhuf(int ), (int)16);
                if (var8_5 || var8_5) ** GOTO lbl30
                var6_9 = var1_1 & nf.hhud("hhvp", hhuf(int ), (int)17);
                if (var8_5 || var8_5) ** GOTO lbl30
                v3 = nf.hhud("hhvq", hhuf(int ), (int)18);
                v4 = nf.hhud("hhvr", hhuf(int ), (int)19);
                v5 = var3_6;
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = nf.ol - nf.hhud("hhvs", hhua(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == nf.hhud("hhvt", hhuf(int ), (int)20)) break;
                    v6 /* !! */  = (long)nf.hhud("hhvu", hhuf(int ), (int)21);
                }
                v7 = (int)(v5 * this.alphaMultiplier * var2_2);
                v8 /* !! */  = nf.ol;
                if (true) ** GOTO lbl59
                block40: while (true) {
                    v8 /* !! */  = (long)(v9 - nf.hhud("hhvv", hhua(int ), (int)18));
lbl59:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -604600083: {
                            v9 = nf.hhud("hhvw", hhua(int ), (int)19);
                            continue block40;
                        }
                        case -462819904: {
                            break block40;
                        }
                        case 572216669: {
                            v9 = nf.hhud("hhvx", hhua(int ), (int)20);
                            continue block40;
                        }
                        case 655583375: {
                            v9 = nf.hhud("hhvy", hhua(int ), (int)21);
                            continue block40;
                        }
                    }
                    break;
                }
                v10 = Math.min((int)v4, v7);
                v11 /* !! */  = nf.ol;
                if (true) ** GOTO lbl76
                block41: while (true) {
                    v11 /* !! */  = (long)(v12 - nf.hhud("hhvz", hhua(int ), (int)22));
lbl76:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1813164647: {
                            v12 = nf.hhud("hhwa", hhua(int ), (int)23);
                            continue block41;
                        }
                        case -462819904: {
                            break block41;
                        }
                        case 318798266: {
                            v12 = nf.hhud("hhwb", hhua(int ), (int)24);
                            continue block41;
                        }
                    }
                    break;
                }
                var7_10 = Math.max((int)v3, v10);
                if (!var8_5 && !var8_5) ** break;
                ** continue;
                return var7_10 << nf.hhud("hhwc", hhuf(int ), (int)22) | var4_7 << nf.hhud("hhwd", hhuf(int ), (int)23) | var5_8 << nf.hhud("hhwe", hhuf(int ), (int)24) | var6_9;
            }
lbl89:
            // 2 sources

            case 0: {
                var9_4 /* !! */  = (int)nf.hhud("hhwf", hhuf(int ), (int)25);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 1: {
                var9_4 /* !! */  = (int)nf.hhud("hhwg", hhuf(int ), (int)26);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl127
            }
            case 2: {
                var9_4 /* !! */  = (int)nf.hhud("hhwh", hhuf(int ), (int)27);
                if (!var10_3) ** GOTO lbl89
                throw null;
            }
lbl103:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_4 /* !! */  = (int)nf.hhud("hhwi", hhuf(int ), (int)28);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl118
                    break;
                }
            }
            case 4: {
                var9_4 /* !! */  = (int)nf.hhud("hhwj", hhuf(int ), (int)29);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl114:
            // 2 sources

            case 5: {
                var9_4 /* !! */  = (int)nf.hhud("hhwk", hhuf(int ), (int)30);
                if (!var10_3) ** GOTO lbl103
                throw null;
            }
lbl118:
            // 3 sources

            case 6: {
                var9_4 /* !! */  = (int)nf.hhud("hhwl", hhuf(int ), (int)31);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl123:
            // 2 sources

            case 7: {
                var9_4 /* !! */  = (int)nf.hhud("hhwm", hhuf(int ), (int)32);
                if (!var10_3) ** GOTO lbl118
                throw null;
            }
lbl127:
            // 7 sources

            case 8: {
                var9_4 /* !! */  = (int)nf.hhud("hhwn", hhuf(int ), (int)33);
                if (!var10_3) ** GOTO lbl123
                throw null;
            }
            case 9: {
                var9_4 /* !! */  = (int)nf.hhud("hhwo", hhuf(int ), (int)34);
                if (!var10_3) ** GOTO lbl127
                throw null;
            }
            case 10: {
                var9_4 /* !! */  = (int)nf.hhud("hhwp", hhuf(int ), (int)35);
                if (!var10_3) ** GOTO lbl127
                throw null;
            }
            case 11: {
                var9_4 /* !! */  = (int)nf.hhud("hhwq", hhuf(int ), (int)36);
                if (!var10_3) ** GOTO lbl127
                throw null;
            }
lbl143:
            // 2 sources

            case 12: {
                var9_4 /* !! */  = (int)nf.hhud("hhwr", hhuf(int ), (int)37);
                if (!var10_3) ** GOTO lbl114
                throw null;
            }
            case 13: 
        }
        var9_4 /* !! */  = (int)nf.hhud("hhws", hhuf(int ), (int)38);
        ** while (!var10_3)
lbl150:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hicm() {
        nf.hhuh[0] = 1315773020;
        nf.hhuh[1] = 545804701;
        nf.hhuh[2] = -2099563699;
        nf.hhuh[3] = 606023256;
        nf.hhuh[4] = -132704543;
        nf.hhuh[5] = -481228718;
        nf.hhuh[6] = 340392958;
        nf.hhuh[7] = -200143266;
        nf.hhuh[8] = -279862517;
        nf.hhuh[9] = -241272617;
        nf.hhuh[10] = -1479095321;
        nf.hhuh[11] = -2044174619;
        nf.hhuh[12] = 771002622;
        nf.hhuh[13] = 1274156659;
        nf.hhuh[14] = 1711826210;
        nf.hhuh[15] = 1581043760;
        nf.hhuh[16] = -517125254;
        nf.hhuh[17] = 815350816;
        nf.hhuh[18] = 2065250309;
        nf.hhuh[19] = 1411487832;
        nf.hhuh[20] = 1535484506;
        nf.hhuh[21] = -759925675;
        nf.hhuh[22] = 374630798;
        nf.hhuh[23] = 2144755720;
        nf.hhuh[24] = 1432184361;
        nf.hhuh[25] = 1527070454;
        nf.hhuh[26] = -1540598525;
        nf.hhuh[27] = 159580742;
        nf.hhuh[28] = -432169242;
        nf.hhuh[29] = -391058227;
        nf.hhuh[30] = 1875331061;
        nf.hhuh[31] = 319760356;
        nf.hhuh[32] = 310185920;
        nf.hhuh[33] = -873391536;
        nf.hhuh[34] = 2095994973;
        nf.hhuh[35] = 236321345;
        nf.hhuh[36] = -1566777206;
        nf.hhuh[37] = -1265833495;
        nf.hhuh[38] = 956338219;
        nf.hhuh[39] = -1321166013;
        nf.hhuh[40] = 201990056;
        nf.hhuh[41] = 319171165;
        nf.hhuh[42] = -1050819722;
        nf.hhuh[43] = -1863570650;
        nf.hhuh[44] = -1972622549;
        nf.hhuh[45] = -620120325;
        nf.hhuh[46] = -1649359056;
        nf.hhuh[47] = 1126575222;
        nf.hhuh[48] = -1550290168;
        nf.hhuh[49] = 151086815;
        nf.hhuh[50] = -1479583825;
        nf.hhuh[51] = 1808391236;
        nf.hhuh[52] = -1294457948;
        nf.hhuh[53] = 1642808296;
        nf.hhuh[54] = -289512183;
        nf.hhuh[55] = -1492577651;
        nf.hhuh[56] = -311904201;
        nf.hhuh[57] = 1219834015;
        nf.hhuh[58] = -1338822485;
        nf.hhuh[59] = 237023079;
        nf.hhuh[60] = 1261725319;
        nf.hhuh[61] = 747667156;
        nf.hhuh[62] = -1997094071;
        nf.hhuh[63] = 828447605;
        nf.hhuh[64] = 1893033242;
        nf.hhuh[65] = 2114192671;
        nf.hhuh[66] = -175410421;
        nf.hhuh[67] = -296262108;
        nf.hhuh[68] = -1665839260;
        nf.hhuh[69] = -60365030;
        nf.hhuh[70] = 112381711;
        nf.hhuh[71] = -599023072;
        nf.hhuh[72] = -307293682;
        nf.hhuh[73] = 23980299;
        nf.hhuh[74] = 1419712366;
        nf.hhuh[75] = -31866434;
        nf.hhuh[76] = 1297189576;
        nf.hhuh[77] = 1368501208;
        nf.hhuh[78] = 166713543;
        nf.hhuh[79] = 41002626;
        nf.hhuh[80] = 1896012590;
        nf.hhuh[81] = 379363580;
        nf.hhuh[82] = 765191431;
        nf.hhuh[83] = -510603089;
        nf.hhuh[84] = -128596143;
        nf.hhuh[85] = 319306248;
        nf.hhuh[86] = -634988397;
        nf.hhuh[87] = -1415060438;
        nf.hhuh[88] = 1486822335;
        nf.hhuh[89] = -1193576636;
        nf.hhuh[90] = -1278130316;
        nf.hhuh[91] = 1555298526;
        nf.hhuh[92] = 815941131;
        nf.hhuh[93] = -956323397;
        nf.hhuh[94] = 496759086;
        nf.hhuh[95] = -240681385;
        nf.hhuh[96] = 2043386565;
        nf.hhuh[97] = -1682453193;
        nf.hhuh[98] = -289312752;
        nf.hhuh[99] = -733754840;
    }

    private static /* synthetic */ void hick() {
        nf.hhug[0] = -1315773021;
        nf.hhug[1] = -526694499;
        nf.hhug[2] = -2099563704;
        nf.hhug[3] = 606023257;
        nf.hhug[4] = -132704544;
        nf.hhug[5] = -481228717;
        nf.hhug[6] = 340392956;
        nf.hhug[7] = -200143266;
        nf.hhug[8] = -279862518;
        nf.hhug[9] = -1703010402;
        nf.hhug[10] = -127801599;
        nf.hhug[11] = -2044174595;
        nf.hhug[12] = 771002369;
        nf.hhug[13] = 1274156643;
        nf.hhug[14] = 1711826397;
        nf.hhug[15] = 1581043768;
        nf.hhug[16] = -517125243;
        nf.hhug[17] = 815351007;
        nf.hhug[18] = 2065250309;
        nf.hhug[19] = 1411487911;
        nf.hhug[20] = -1535484507;
        nf.hhug[21] = -1207609362;
        nf.hhug[22] = 374630806;
        nf.hhug[23] = 2144755736;
        nf.hhug[24] = 1432184353;
        nf.hhug[25] = 1527070458;
        nf.hhug[26] = -1540598520;
        nf.hhug[27] = 159580746;
        nf.hhug[28] = -432169244;
        nf.hhug[29] = -391058231;
        nf.hhug[30] = 1875331056;
        nf.hhug[31] = 319760359;
        nf.hhug[32] = 310185925;
        nf.hhug[33] = -873391530;
        nf.hhug[34] = 2095994964;
        nf.hhug[35] = 236321350;
        nf.hhug[36] = -1566777205;
        nf.hhug[37] = -1265833499;
        nf.hhug[38] = 956338217;
        nf.hhug[39] = 1321166012;
        nf.hhug[40] = 1647687929;
        nf.hhug[41] = -319171166;
        nf.hhug[42] = -956379292;
        nf.hhug[43] = 514448098;
        nf.hhug[44] = -1972622550;
        nf.hhug[45] = -620120328;
        nf.hhug[46] = -1649359056;
        nf.hhug[47] = 1126575221;
        nf.hhug[48] = 1550290167;
        nf.hhug[49] = 1590727821;
        nf.hhug[50] = -1479583825;
        nf.hhug[51] = 1808391355;
        nf.hhug[52] = -1294457947;
        nf.hhug[53] = 1160431665;
        nf.hhug[54] = 289512182;
        nf.hhug[55] = -303307054;
        nf.hhug[56] = 311904200;
        nf.hhug[57] = -35977100;
        nf.hhug[58] = 1338822484;
        nf.hhug[59] = -1106492671;
        nf.hhug[60] = -1261725320;
        nf.hhug[61] = 1203807837;
        nf.hhug[62] = -1997094068;
        nf.hhug[63] = 828447605;
        nf.hhug[64] = 1893033242;
        nf.hhug[65] = 2114192667;
        nf.hhug[66] = -175410421;
        nf.hhug[67] = -296262111;
        nf.hhug[68] = -1665839260;
        nf.hhug[69] = -60364827;
        nf.hhug[70] = -112381712;
        nf.hhug[71] = -537076277;
        nf.hhug[72] = 307293681;
        nf.hhug[73] = 890308219;
        nf.hhug[74] = -1419712367;
        nf.hhug[75] = 559552015;
        nf.hhug[76] = -1297189577;
        nf.hhug[77] = -1419148149;
        nf.hhug[78] = -166713544;
        nf.hhug[79] = -457927085;
        nf.hhug[80] = -1896012591;
        nf.hhug[81] = 1654301755;
        nf.hhug[82] = 765191430;
        nf.hhug[83] = -510603091;
        nf.hhug[84] = -128596144;
        nf.hhug[85] = 319306253;
        nf.hhug[86] = -634988397;
        nf.hhug[87] = -1415060434;
        nf.hhug[88] = -1486822336;
        nf.hhug[89] = -967472068;
        nf.hhug[90] = 1278130315;
        nf.hhug[91] = 986830371;
        nf.hhug[92] = 815941130;
        nf.hhug[93] = -1087938336;
        nf.hhug[94] = 496759085;
        nf.hhug[95] = -240681387;
        nf.hhug[96] = 2043386565;
        nf.hhug[97] = -1682453194;
        nf.hhug[98] = 289312751;
        nf.hhug[99] = 154409018;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jx getSetting() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nf.ol - nf.hhud("hiax", hhua(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == nf.hhud("hiay", hhuf(int ), (int)88)) break;
            v0 /* !! */  = (long)nf.hhud("hiaz", hhuf(int ), (int)89);
        }
        var3_1 = nf.c;
        v1 /* !! */  = nf.ol;
        if (true) ** GOTO lbl12
        block11: while (true) {
            v1 /* !! */  = (long)(nf.hhud("hibb", hhua(int ), (int)86) - nf.hhud("hiba", hhua(int ), (int)85));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -462819904: {
                    break block11;
                }
                case -341770330: {
                    continue block11;
                }
            }
            break;
        }
        var2_2 /* !! */  = nf.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = nf.ol - nf.hhud("hibc", hhua(int ), (int)87)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nf.hhud("hibd", hhuf(int ), (int)90)) break;
            v2 /* !! */  = (long)nf.hhud("hibe", hhuf(int ), (int)91);
        }
        var1_3 = nf.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = nf.ol - nf.hhud("hibf", hhua(int ), (int)88)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == nf.hhud("hibg", hhuf(int ), (int)92)) break;
                    v3 /* !! */  = (long)nf.hhud("hibh", hhuf(int ), (int)93);
                }
                return this.setting;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nf.hhud("hibi", hhuf(int ), (int)94);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)nf.hhud("hibj", hhuf(int ), (int)95);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)nf.hhud("hibk", hhuf(int ), (int)96);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)nf.hhud("hibl", hhuf(int ), (int)97);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hico() {
        nf.hhub[0] = 5631700959296646617L;
        nf.hhub[1] = 4558582049684044774L;
        nf.hhub[2] = -2856919901518418646L;
        nf.hhub[3] = -4863441397626295080L;
        nf.hhub[4] = 8006525299172880827L;
        nf.hhub[5] = -5419580815510458871L;
        nf.hhub[6] = -5170711805574145943L;
        nf.hhub[7] = -4763377145901674473L;
        nf.hhub[8] = 386595841494660751L;
        nf.hhub[9] = 5117215874880752644L;
        nf.hhub[10] = -7206237919007805735L;
        nf.hhub[11] = -8801561473359988607L;
        nf.hhub[12] = 8661637914123241299L;
        nf.hhub[13] = 1583328696736350776L;
        nf.hhub[14] = 8940948764924585760L;
        nf.hhub[15] = -6047144716285813604L;
        nf.hhub[16] = -6026260306382813023L;
        nf.hhub[17] = -5906187157081915553L;
        nf.hhub[18] = -80205562802584672L;
        nf.hhub[19] = -1702921612756679659L;
        nf.hhub[20] = 292972824768389930L;
        nf.hhub[21] = 2841704767147850080L;
        nf.hhub[22] = -2453485169839298100L;
        nf.hhub[23] = 5760669887180837600L;
        nf.hhub[24] = -2073962967486403779L;
        nf.hhub[25] = -3382485537416462215L;
        nf.hhub[26] = 8813588052273187239L;
        nf.hhub[27] = 3672563908744280370L;
        nf.hhub[28] = 7833273549916822234L;
        nf.hhub[29] = -1436794715870244855L;
        nf.hhub[30] = -5915899458909594514L;
        nf.hhub[31] = -9056943406854994086L;
        nf.hhub[32] = 4986315882185924552L;
        nf.hhub[33] = 7350513941650318862L;
        nf.hhub[34] = -1842658756649910833L;
        nf.hhub[35] = 1606926677220047976L;
        nf.hhub[36] = 9067135005878155995L;
        nf.hhub[37] = 7593975828219092629L;
        nf.hhub[38] = -4881937925462106389L;
        nf.hhub[39] = -2070728808718664346L;
        nf.hhub[40] = 1920257292294629494L;
        nf.hhub[41] = -1300349924456939889L;
        nf.hhub[42] = -99912623249474444L;
        nf.hhub[43] = -6612768074216551532L;
        nf.hhub[44] = 64776943362889894L;
        nf.hhub[45] = -7895090133959561488L;
        nf.hhub[46] = -2626943851741094541L;
        nf.hhub[47] = -4142185783959005183L;
        nf.hhub[48] = -8408745969823632010L;
        nf.hhub[49] = -3624026371525603106L;
        nf.hhub[50] = 2785322581851041734L;
        nf.hhub[51] = 5453604745186976266L;
        nf.hhub[52] = -54278385661641606L;
        nf.hhub[53] = -9111485771348634968L;
        nf.hhub[54] = -7294608863852868577L;
        nf.hhub[55] = -7549022744853910531L;
        nf.hhub[56] = 7054810058103830115L;
        nf.hhub[57] = 4821143547865592112L;
        nf.hhub[58] = 1917825028052843995L;
        nf.hhub[59] = 2958691560423046883L;
        nf.hhub[60] = -1995589409532902447L;
        nf.hhub[61] = -7868926707008232747L;
        nf.hhub[62] = 3076747619811277479L;
        nf.hhub[63] = 5642991906620727406L;
        nf.hhub[64] = 3003401501692082695L;
        nf.hhub[65] = 23226019074388748L;
        nf.hhub[66] = 2328710865076014918L;
        nf.hhub[67] = -8766764425364738994L;
        nf.hhub[68] = 367726873608010587L;
        nf.hhub[69] = -878567471667218501L;
        nf.hhub[70] = 7544197474365332019L;
        nf.hhub[71] = 7081419274864754556L;
        nf.hhub[72] = -4114110146406709768L;
        nf.hhub[73] = -7862532725469905745L;
        nf.hhub[74] = 5233223557576472956L;
        nf.hhub[75] = 2210250856531902070L;
        nf.hhub[76] = -2544038728216080209L;
        nf.hhub[77] = 9119134969001447405L;
        nf.hhub[78] = 2634333376145978047L;
        nf.hhub[79] = 7260592214094835914L;
        nf.hhub[80] = 711260142727348279L;
        nf.hhub[81] = 2792569569184412659L;
        nf.hhub[82] = 4432446817632829984L;
        nf.hhub[83] = -1787015269977365978L;
        nf.hhub[84] = -6437157363232638633L;
        nf.hhub[85] = 5038150341156305428L;
        nf.hhub[86] = -1610728776013192468L;
        nf.hhub[87] = 5510288217055686749L;
        nf.hhub[88] = -8602059671846843472L;
        nf.hhub[89] = 7788556764322085609L;
        nf.hhub[90] = 7434214643372972627L;
        nf.hhub[91] = -4493768133128812196L;
        nf.hhub[92] = 5225293789244304202L;
        nf.hhub[93] = 7001692905329993951L;
        nf.hhub[94] = -3382528349418432821L;
        nf.hhub[95] = -6620087327008170190L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public nf(jx var1_1) {
        var3_2 /* !! */  = nf.b;
        var2_3 = nf.a;
        super();
        this.alphaMultiplier = 1.0f;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.setting = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)nf.hhud("hicf", hhuf(int ), (int)109);
            }
lbl12:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)nf.hhud("hicg", hhuf(int ), (int)110);
                ** GOTO lbl19
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)nf.hhud("hich", hhuf(int ), (int)111);
                    ** GOTO lbl12
                    break;
                }
            }
lbl19:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)nf.hhud("hici", hhuf(int ), (int)112);
            }
            case 4: 
        }
        var3_2 /* !! */  = (int)nf.hhud("hicj", hhuf(int ), (int)113);
        ** while (true)
    }

    private static /* synthetic */ void hicp() {
        nf.hhuc[0] = -8388434757734535136L;
        nf.hhuc[1] = 3586518065819468363L;
        nf.hhuc[2] = 682017122156591899L;
        nf.hhuc[3] = -8862619007022911274L;
        nf.hhuc[4] = -7929218871614941202L;
        nf.hhuc[5] = -5453316884192781487L;
        nf.hhuc[6] = 141677086584670369L;
        nf.hhuc[7] = 8602997001593618048L;
        nf.hhuc[8] = 5866597057651580377L;
        nf.hhuc[9] = -882498970171413186L;
        nf.hhuc[10] = 5129666184582223325L;
        nf.hhuc[11] = -3748478324714163298L;
        nf.hhuc[12] = -957022927585775536L;
        nf.hhuc[13] = -7031898252755792724L;
        nf.hhuc[14] = 7766060487530690738L;
        nf.hhuc[15] = -1256937492051438029L;
        nf.hhuc[16] = 3082137698393139933L;
        nf.hhuc[17] = -6252411668461512265L;
        nf.hhuc[18] = -7463201413491837549L;
        nf.hhuc[19] = -3102388923077724197L;
        nf.hhuc[20] = -8490362218602350437L;
        nf.hhuc[21] = -5773173589663608063L;
        nf.hhuc[22] = 5350163961394921087L;
        nf.hhuc[23] = 4863894643926453795L;
        nf.hhuc[24] = -8654267090281720256L;
        nf.hhuc[25] = 2836775410331491233L;
        nf.hhuc[26] = -3589971812474459709L;
        nf.hhuc[27] = -3618761644178521720L;
        nf.hhuc[28] = 6344173554756616628L;
        nf.hhuc[29] = -4866653269992740085L;
        nf.hhuc[30] = -7765525082085951138L;
        nf.hhuc[31] = -1709622718285132141L;
        nf.hhuc[32] = 1698078962438490023L;
        nf.hhuc[33] = 742092477695067568L;
        nf.hhuc[34] = -4333469398235550335L;
        nf.hhuc[35] = 7462235438070806589L;
        nf.hhuc[36] = -6684425478900837820L;
        nf.hhuc[37] = 2561039320066227880L;
        nf.hhuc[38] = -743643863198426850L;
        nf.hhuc[39] = -246181507129760760L;
        nf.hhuc[40] = -5178615124038985840L;
        nf.hhuc[41] = 7376729089807632474L;
        nf.hhuc[42] = -2144409893328777226L;
        nf.hhuc[43] = 5233715762640878133L;
        nf.hhuc[44] = 1249401319171822975L;
        nf.hhuc[45] = -7473423239271010425L;
        nf.hhuc[46] = 5142888437881698938L;
        nf.hhuc[47] = 4399237638245288331L;
        nf.hhuc[48] = -377512408918466176L;
        nf.hhuc[49] = -2978330538067115781L;
        nf.hhuc[50] = -3059087190884968203L;
        nf.hhuc[51] = 8916510499660553838L;
        nf.hhuc[52] = 1011048236050846047L;
        nf.hhuc[53] = -6317916159556070907L;
        nf.hhuc[54] = 8647661149442287094L;
        nf.hhuc[55] = 9079701473113190573L;
        nf.hhuc[56] = 2640109125382377092L;
        nf.hhuc[57] = 5478724631568165480L;
        nf.hhuc[58] = -8685516273008678639L;
        nf.hhuc[59] = -5943933099091093037L;
        nf.hhuc[60] = 6198232706453947895L;
        nf.hhuc[61] = -4862506490938980978L;
        nf.hhuc[62] = 6773002982451401589L;
        nf.hhuc[63] = -329062698755381486L;
        nf.hhuc[64] = -1910669460007657232L;
        nf.hhuc[65] = -5324344957528539224L;
        nf.hhuc[66] = 6318979604008916150L;
        nf.hhuc[67] = -896403339610022610L;
        nf.hhuc[68] = 4052855393448953959L;
        nf.hhuc[69] = 2748331789870794640L;
        nf.hhuc[70] = -1440388364901664833L;
        nf.hhuc[71] = 5708814651656508568L;
        nf.hhuc[72] = -5850726538142333489L;
        nf.hhuc[73] = -5128406418037762081L;
        nf.hhuc[74] = 6960233302433160483L;
        nf.hhuc[75] = 6939061713977953714L;
        nf.hhuc[76] = 2629381101336019750L;
        nf.hhuc[77] = 4786544643679824881L;
        nf.hhuc[78] = 4756869830947029389L;
        nf.hhuc[79] = -8728805823925136074L;
        nf.hhuc[80] = -1662832441826144877L;
        nf.hhuc[81] = -6920565591273479217L;
        nf.hhuc[82] = -3924004711872414545L;
        nf.hhuc[83] = -6785272887595577737L;
        nf.hhuc[84] = 5509327064206578056L;
        nf.hhuc[85] = -230478126337945498L;
        nf.hhuc[86] = 6198578758732622442L;
        nf.hhuc[87] = 5492284107816782515L;
        nf.hhuc[88] = 1660371058986016786L;
        nf.hhuc[89] = -8918614904702866838L;
        nf.hhuc[90] = -3851606757814619279L;
        nf.hhuc[91] = 2011873710523446318L;
        nf.hhuc[92] = -4701011277109116995L;
        nf.hhuc[93] = -7233154544418568540L;
        nf.hhuc[94] = -2116495144535251885L;
        nf.hhuc[95] = -9025127891108645391L;
    }

    public static /* synthetic */ CallSite hhud(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Color applyAlpha(Color var1_1) {
        v0 /* !! */  = nf.ol;
        if (true) ** GOTO lbl5
        block39: while (true) {
            v0 /* !! */  = (long)(v1 - nf.hhud("hhxj", hhua(int ), (int)32));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -462819904: {
                    break block39;
                }
                case -174182985: {
                    v1 = nf.hhud("hhxk", hhua(int ), (int)33);
                    continue block39;
                }
                case 320190580: {
                    v1 = nf.hhud("hhxl", hhua(int ), (int)34);
                    continue block39;
                }
                case 667115777: {
                    v1 = nf.hhud("hhxm", hhua(int ), (int)35);
                    continue block39;
                }
            }
            break;
        }
        var5_2 = nf.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nf.ol - nf.hhud("hhxn", hhua(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nf.hhud("hhxo", hhuf(int ), (int)48)) break;
            v2 /* !! */  = (long)nf.hhud("hhxp", hhuf(int ), (int)49);
        }
        var4_3 /* !! */  = nf.b;
        v3 /* !! */  = nf.ol;
        if (true) ** GOTO lbl28
        block41: while (true) {
            v3 /* !! */  = (long)(v4 - nf.hhud("hhxq", hhua(int ), (int)37));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1630953169: {
                    v4 = nf.hhud("hhxr", hhua(int ), (int)38);
                    continue block41;
                }
                case -462819904: {
                    break block41;
                }
                case 581364077: {
                    v4 = nf.hhud("hhxs", hhua(int ), (int)39);
                    continue block41;
                }
                case 970090963: {
                    v4 = nf.hhud("hhxt", hhua(int ), (int)40);
                    continue block41;
                }
            }
            break;
        }
        var3_4 = nf.a;
        if (var5_2) {
            throw null;
lbl43:
            // 2 sources

            return null;
        }
        if (var3_4 || var3_4) ** GOTO lbl43
        v5 = nf.hhud("hhxu", hhuf(int ), (int)50);
        v6 = nf.hhud("hhxv", hhuf(int ), (int)51);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_1 = nf.ol - nf.hhud("hhxw", hhua(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == nf.hhud("hhxx", hhuf(int ), (int)52)) break;
            v7 /* !! */  = (long)nf.hhud("hhxy", hhuf(int ), (int)53);
        }
        v8 = var1_1.getAlpha();
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = nf.ol - nf.hhud("hhxz", hhua(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == nf.hhud("hhya", hhuf(int ), (int)54)) break;
            v9 /* !! */  = (long)nf.hhud("hhyb", hhuf(int ), (int)55);
        }
        v10 = (int)(v8 * this.alphaMultiplier);
        v11 /* !! */  = nf.ol;
        if (true) ** GOTO lbl64
        block45: while (true) {
            v11 /* !! */  = (long)(nf.hhud("hhyd", hhua(int ), (int)44) - nf.hhud("hhyc", hhua(int ), (int)43));
lbl64:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1038424086: {
                    continue block45;
                }
                case -462819904: {
                    break block45;
                }
            }
            break;
        }
        v12 = Math.min((int)v6, v10);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_3 = nf.ol - nf.hhud("hhye", hhua(int ), (int)45)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == nf.hhud("hhyf", hhuf(int ), (int)56)) break;
            v13 /* !! */  = (long)nf.hhud("hhyg", hhuf(int ), (int)57);
        }
        var2_5 = Math.max((int)v5, v12);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** continue;
                v14 /* !! */  = nf.ol;
                if (true) ** GOTO lbl84
                block47: while (true) {
                    v14 /* !! */  = (long)(nf.hhud("hhyi", hhua(int ), (int)47) - nf.hhud("hhyh", hhua(int ), (int)46));
lbl84:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -462819904: {
                            break block47;
                        }
                        case 304045437: {
                            continue block47;
                        }
                    }
                    break;
                }
                v15 /* !! */  = nf.ol;
                if (true) ** GOTO lbl93
                block48: while (true) {
                    v15 /* !! */  = (long)(v16 - nf.hhud("hhyj", hhua(int ), (int)48));
lbl93:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -462819904: {
                            break block48;
                        }
                        case 350212539: {
                            v16 = nf.hhud("hhyk", hhua(int ), (int)49);
                            continue block48;
                        }
                        case 763676460: {
                            v16 = nf.hhud("hhyl", hhua(int ), (int)50);
                            continue block48;
                        }
                        case 1496069511: {
                            v16 = nf.hhud("hhym", hhua(int ), (int)51);
                            continue block48;
                        }
                    }
                    break;
                }
                v17 = var1_1.getRed();
                v18 /* !! */  = nf.ol;
                if (true) ** GOTO lbl110
                block49: while (true) {
                    v18 /* !! */  = (long)(v19 - nf.hhud("hhyn", hhua(int ), (int)52));
lbl110:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1206345207: {
                            v19 = nf.hhud("hhyo", hhua(int ), (int)53);
                            continue block49;
                        }
                        case -462819904: {
                            break block49;
                        }
                        case 133558185: {
                            v19 = nf.hhud("hhyp", hhua(int ), (int)54);
                            continue block49;
                        }
                    }
                    break;
                }
                v20 = var1_1.getGreen();
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_4 = nf.ol - nf.hhud("hhyq", hhua(int ), (int)55)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == nf.hhud("hhyr", hhuf(int ), (int)58)) break;
                    v21 /* !! */  = (long)nf.hhud("hhys", hhuf(int ), (int)59);
                }
                v22 = var1_1.getBlue();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = nf.ol - nf.hhud("hhyt", hhua(int ), (int)56)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == nf.hhud("hhyu", hhuf(int ), (int)60)) break;
                    v23 /* !! */  = (long)nf.hhud("hhyv", hhuf(int ), (int)61);
                }
                return new Color(v17, v20, v22, var2_5);
            }
lbl132:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)nf.hhud("hhyw", hhuf(int ), (int)62);
                if (var5_2) {
                    throw null;
                }
            }
lbl136:
            // 4 sources

            case 1: {
                var4_3 /* !! */  = (int)nf.hhud("hhyx", hhuf(int ), (int)63);
                if (!var5_2) ** GOTO lbl132
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)nf.hhud("hhyy", hhuf(int ), (int)64);
                    if (!var5_2) ** GOTO lbl136
                    throw null;
                }
            }
lbl145:
            // 2 sources

            case 3: {
                do {
                    var4_3 /* !! */  = (int)nf.hhud("hhyz", hhuf(int ), (int)65);
                } while (!var5_2);
                throw null;
            }
            case 4: {
                var4_3 /* !! */  = (int)nf.hhud("hhza", hhuf(int ), (int)66);
                if (!var5_2) ** GOTO lbl145
                throw null;
            }
            case 5: 
        }
        var4_3 /* !! */  = (int)nf.hhud("hhzb", hhuf(int ), (int)67);
        ** while (!var5_2)
lbl157:
        // 1 sources

        throw null;
    }

    static {
        hhug = new int[114];
        hhuh = new int[114];
        nf.hick();
        nf.hicl();
        nf.hicm();
        nf.hicn();
        hhub = new long[96];
        hhuc = new long[96];
        nf.hico();
        nf.hicp();
    }

    private static /* synthetic */ long hhua(int n2) {
        return hhub[n2] ^ hhuc[n2];
    }
}

