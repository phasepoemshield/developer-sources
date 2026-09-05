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
import ruhack.phobia.jx;

public class kg
extends jx {
    private float min;
    private float value;
    public static final int b;
    public static final long tv = -175700340312159955L;
    private boolean integer;
    private String suffix;
    public static final boolean c;
    private float step;
    private static int[] lhrq;
    private static long[] lhsf;
    private float max;
    private static long[] lhse;
    public static final boolean a;
    private static int[] lhrr;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg setMin(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("lido", lhsd(int ), (int)137)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kg.lhrs("lidp", lhru(int ), (int)166)) break;
            v0 /* !! */  = (long)kg.lhrs("lidq", lhru(int ), (int)167);
        }
        var4_2 = kg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lidr", lhsd(int ), (int)138)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kg.lhrs("lids", lhru(int ), (int)168)) break;
            v1 /* !! */  = (long)kg.lhrs("lidt", lhru(int ), (int)169);
        }
        var3_3 /* !! */  = kg.b;
        v2 /* !! */  = kg.tv;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(kg.lhrs("lidv", lhsd(int ), (int)140) - kg.lhrs("lidu", lhsd(int ), (int)139));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1396225747: {
                    break block18;
                }
                case 753030486: {
                    continue block18;
                }
            }
            break;
        }
        var2_4 = kg.a;
        if (var4_2) {
            throw null;
lbl27:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl27
                v3 /* !! */  = kg.tv;
                if (true) ** GOTO lbl38
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - kg.lhrs("lidw", lhsd(int ), (int)141));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1396225747: {
                            break block20;
                        }
                        case -776792728: {
                            v4 = kg.lhrs("lidx", lhsd(int ), (int)142);
                            continue block20;
                        }
                        case 1323073453: {
                            v4 = kg.lhrs("lidy", lhsd(int ), (int)143);
                            continue block20;
                        }
                    }
                    break;
                }
                this.min = var1_1;
                if (var2_4) ** continue;
                return this;
            }
lbl50:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)kg.lhrs("lidz", lhru(int ), (int)170);
                } while (!var4_2);
                throw null;
            }
lbl55:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)kg.lhrs("liea", lhru(int ), (int)171);
                if (!var4_2) ** GOTO lbl50
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)kg.lhrs("lieb", lhru(int ), (int)172);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)kg.lhrs("liec", lhru(int ), (int)173);
                if (!var4_2) ** GOTO lbl55
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)kg.lhrs("lied", lhru(int ), (int)174);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String getSuffix() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("licg", lhsd(int ), (int)124)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kg.lhrs("lich", lhru(int ), (int)145)) break;
            v0 /* !! */  = (long)kg.lhrs("lici", lhru(int ), (int)146);
        }
        var3_1 = kg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("licj", lhsd(int ), (int)125)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kg.lhrs("lick", lhru(int ), (int)147)) break;
            v1 /* !! */  = (long)kg.lhrs("licl", lhru(int ), (int)148);
        }
        var2_2 /* !! */  = kg.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = kg.tv - kg.lhrs("licm", lhsd(int ), (int)126)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kg.lhrs("licn", lhru(int ), (int)149)) break;
            v2 /* !! */  = (long)kg.lhrs("lico", lhru(int ), (int)150);
        }
        var1_3 = kg.a;
        if (var3_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = kg.tv - kg.lhrs("licp", lhsd(int ), (int)127)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == kg.lhrs("licq", lhru(int ), (int)151)) break;
                    v3 /* !! */  = (long)kg.lhrs("licr", lhru(int ), (int)152);
                }
                return this.suffix;
            }
lbl38:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)kg.lhrs("lics", lhru(int ), (int)153);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)kg.lhrs("lict", lhru(int ), (int)154);
                if (!var3_1) ** GOTO lbl38
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)kg.lhrs("licu", lhru(int ), (int)155);
                    if (!var3_1) ** GOTO lbl38
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kg.lhrs("licv", lhru(int ), (int)156);
        ** while (!var3_1)
lbl54:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float lhrp(int n2) {
        return Float.intBitsToFloat(lhrq[n2] ^ lhrr[n2]);
    }

    static {
        lhrq = new int[217];
        lhrr = new int[217];
        kg.ligv();
        kg.ligw();
        kg.ligx();
        kg.ligy();
        kg.ligz();
        kg.liha();
        lhse = new long[171];
        lhsf = new long[171];
        kg.lihb();
        kg.lihc();
        kg.lihd();
        kg.lihe();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public float getMin() {
        boolean bl2;
        Object object = tv;
        boolean bl3 = true;
        block9: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - kg.lhrs("liah", lhsd(int ), (int)100);
            }
            switch ((int)object) {
                case -1445659036: {
                    callSite = kg.lhrs("liai", lhsd(int ), (int)101);
                    continue block9;
                }
                case -1396225747: {
                    break block9;
                }
                case 649742046: {
                    callSite = kg.lhrs("liaj", lhsd(int ), (int)102);
                    continue block9;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = tv - kg.lhrs("liak", lhsd(int ), (int)103)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == kg.lhrs("lial", lhru(int ), (int)118)) break;
            object2 = kg.lhrs("liam", lhru(int ), (int)119);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = tv - kg.lhrs("lian", lhsd(int ), (int)104)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == kg.lhrs("liao", lhru(int ), (int)120)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = kg.lhrs("liap", lhru(int ), (int)121);
        }
        if (bl2) return (float)kg.lhrs("liaq", lhrp(int ), (int)122);
        if (bl2) return (float)kg.lhrs("liaq", lhrp(int ), (int)122);
        Object object4 = tv;
        block12: while (true) {
            switch ((int)object4) {
                case -1554533907: {
                    object4 = kg.lhrs("lias", lhsd(int ), (int)106) - kg.lhrs("liar", lhsd(int ), (int)105);
                    continue block12;
                }
                case -1396225747: {
                    return this.min;
                }
            }
            break;
        }
        return this.min;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public kg range(float var1_1, float var2_2) {
        block54: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lhtm", lhsd(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == kg.lhrs("lhtn", lhru(int ), (int)23)) break;
                v0 /* !! */  = (long)kg.lhrs("lhto", lhru(int ), (int)24);
            }
            var5_3 = kg.c;
            v1 /* !! */  = kg.tv;
            block32: while (true) {
                switch ((int)v1 /* !! */ ) {
                    case -1396225747: {
                        break block32;
                    }
                    case 636828296: {
                        v1 /* !! */  = (long)(kg.lhrs("lhtq", lhsd(int ), (int)20) - kg.lhrs("lhtp", lhsd(int ), (int)19));
                        continue block32;
                    }
                }
                break;
            }
            var4_4 /* !! */  = kg.b;
            v2 /* !! */  = kg.tv;
            if (true) ** GOTO lbl20
            block33: while (true) {
                v2 /* !! */  = (long)(v3 - kg.lhrs("lhtr", lhsd(int ), (int)21));
lbl20:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1396225747: {
                        break block33;
                    }
                    case 392793978: {
                        v3 = kg.lhrs("lhts", lhsd(int ), (int)22);
                        continue block33;
                    }
                    case 1787923059: {
                        v3 = kg.lhrs("lhtt", lhsd(int ), (int)23);
                        continue block33;
                    }
                }
                break;
            }
            var3_5 = kg.a;
            if (var5_3) {
                throw null;
            }
            if (var3_5 || var3_5) return null;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = kg.tv - kg.lhrs("lhtu", lhsd(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == kg.lhrs("lhtv", lhru(int ), (int)25)) {
                    this.min = var1_1;
                    if (var3_5) return null;
                    break;
                }
                v4 /* !! */  = (long)kg.lhrs("lhtw", lhru(int ), (int)26);
            }
            if (var3_5) return null;
            while (true) {
                block55: {
                    if ((v5 /* !! */  = (cfr_temp_3 = kg.tv - kg.lhrs("lhtx", lhsd(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  != kg.lhrs("lhty", lhru(int ), (int)27)) break block55;
                    this.max = var2_2;
                    if (var4_4 /* !! */  != 0) {
                        break;
                    }
                    ** GOTO lbl-1000
                }
                v5 /* !! */  = (long)kg.lhrs("lhtz", lhru(int ), (int)28);
            }
            cfr_temp_0 = -2147483648;
            block36: do {
                switch (cfr_temp_0 == -2147483648 ? var4_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var3_5 || var3_5) return null;
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_4 = kg.tv - kg.lhrs("lhua", lhsd(int ), (int)26)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  != kg.lhrs("lhub", lhru(int ), (int)29)) ** GOTO lbl62
                            v7 /* !! */  = kg.tv;
                            if (true) ** GOTO lbl101
lbl62:
                            // 1 sources

                            v6 /* !! */  = (long)kg.lhrs("lhuc", lhru(int ), (int)30);
                        }
                    }
                    case 0: {
                        var4_4 /* !! */  = (int)kg.lhrs("lhum", lhru(int ), (int)33);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 3: {
                        var4_4 /* !! */  = (int)kg.lhrs("lhup", lhru(int ), (int)36);
                        cfr_temp_0 = 2;
                        if (!var5_3) continue block36;
                        throw null;
                    }
                    case 4: {
                        var4_4 /* !! */  = (int)kg.lhrs("lhuq", lhru(int ), (int)37);
                        cfr_temp_0 = 6;
                        if (!var5_3) continue block36;
                        throw null;
                    }
                    case 5: {
                        var4_4 /* !! */  = (int)kg.lhrs("lhur", lhru(int ), (int)38);
                        if (!var5_3) ** break;
                        throw null;
                    }
                    case 7: {
                        var4_4 /* !! */  = (int)kg.lhrs("lhut", lhru(int ), (int)40);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 6: {
                        var4_4 /* !! */  = (int)kg.lhrs("lhus", lhru(int ), (int)39);
                        if (var5_3) {
                            throw null;
                        }
                    }
                    case 1: {
                        ** GOTO lbl135
                    }
                    case 8: {
                        var4_4 /* !! */  = (int)kg.lhrs("lhuu", lhru(int ), (int)41);
                        cfr_temp_0 = 2;
                        if (!var5_3) continue block36;
                        throw null;
                    }
                    case 9: {
                        break block54;
                    }
                    block38: while (true) {
                        v7 /* !! */  = (long)(v8 - kg.lhrs("lhud", lhsd(int ), (int)27));
lbl101:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1396225747: {
                                break block38;
                            }
                            case -406205660: {
                                v8 = kg.lhrs("lhue", lhsd(int ), (int)28);
                                continue block38;
                            }
                            case 1668897482: {
                                v8 = kg.lhrs("lhuf", lhsd(int ), (int)29);
                                continue block38;
                            }
                        }
                        break;
                    }
                    v9 = Math.min(var2_2, this.value);
                    v10 /* !! */  = kg.tv;
                    if (true) ** GOTO lbl115
                    block39: while (true) {
                        v10 /* !! */  = (long)(v11 - kg.lhrs("lhug", lhsd(int ), (int)30));
lbl115:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1396225747: {
                                break block39;
                            }
                            case 315849187: {
                                v11 = kg.lhrs("lhuh", lhsd(int ), (int)31);
                                continue block39;
                            }
                            case 1116801811: {
                                v11 = kg.lhrs("lhui", lhsd(int ), (int)32);
                                continue block39;
                            }
                        }
                        break;
                    }
                    v12 = Math.max(var1_1, v9);
                    while (true) {
                        if ((v13 /* !! */  = (cfr_temp_5 = kg.tv - kg.lhrs("lhuj", lhsd(int ), (int)33)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v13 /* !! */  == kg.lhrs("lhuk", lhru(int ), (int)31)) {
                            this.value = v12;
                            if (var3_5) return null;
                            break;
                        }
                        v13 /* !! */  = (long)kg.lhrs("lhul", lhru(int ), (int)32);
                    }
                    if (!var3_5) return this;
                    return null;
lbl135:
                    // 2 sources

                    while (true) {
                        var4_4 /* !! */  = (int)kg.lhrs("lhun", lhru(int ), (int)34);
                        cfr_temp_0 = 2;
                        if (!var5_3) continue block36;
                        throw null;
                    }
                    case 2: 
                }
                break;
            } while (true);
            var4_4 /* !! */  = (int)kg.lhrs("lhuo", lhru(int ), (int)35);
            if (!var5_3) ** break;
            throw null;
        }
        var4_4 /* !! */  = (int)kg.lhrs("lhuv", lhru(int ), (int)42);
        ** while (!var5_3)
lbl149:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("lhzo", lhsd(int ), (int)90)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kg.lhrs("lhzp", lhru(int ), (int)109)) break;
            v0 /* !! */  = (long)kg.lhrs("lhzq", lhru(int ), (int)110);
        }
        var3_1 = kg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lhzr", lhsd(int ), (int)91)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kg.lhrs("lhzs", lhru(int ), (int)111)) break;
            v1 /* !! */  = (long)kg.lhrs("lhzt", lhru(int ), (int)112);
        }
        var2_2 = kg.b;
        v2 /* !! */  = kg.tv;
        if (true) ** GOTO lbl19
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - kg.lhrs("lhzu", lhsd(int ), (int)92));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1396225747: {
                    break block14;
                }
                case 330801330: {
                    v3 = kg.lhrs("lhzv", lhsd(int ), (int)93);
                    continue block14;
                }
                case 773368366: {
                    v3 = kg.lhrs("lhzw", lhsd(int ), (int)94);
                    continue block14;
                }
                case 1163813129: {
                    v3 = kg.lhrs("lhzx", lhsd(int ), (int)95);
                    continue block14;
                }
            }
            break;
        }
        var1_3 = kg.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (float)kg.lhrs("lhzy", lhrp(int ), (int)113);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        v4 /* !! */  = kg.tv;
        if (true) ** GOTO lbl41
        block16: while (true) {
            v4 /* !! */  = (long)(v5 - kg.lhrs("lhzz", lhsd(int ), (int)96));
lbl41:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1396225747: {
                    break block16;
                }
                case 362413054: {
                    v5 = kg.lhrs("liaa", lhsd(int ), (int)97);
                    continue block16;
                }
                case 535422483: {
                    v5 = kg.lhrs("liab", lhsd(int ), (int)98);
                    continue block16;
                }
                case 1987755438: {
                    v5 = kg.lhrs("liac", lhsd(int ), (int)99);
                    continue block16;
                }
            }
            break;
        }
        return this.value;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg range(int var1_1, int var2_2) {
        v0 /* !! */  = kg.tv;
        if (true) ** GOTO lbl5
        block47: while (true) {
            v0 /* !! */  = (long)(v1 - kg.lhrs("lhuw", lhsd(int ), (int)34));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1396225747: {
                    break block47;
                }
                case -295589702: {
                    v1 = kg.lhrs("lhux", lhsd(int ), (int)35);
                    continue block47;
                }
                case 534812220: {
                    v1 = kg.lhrs("lhuy", lhsd(int ), (int)36);
                    continue block47;
                }
            }
            break;
        }
        var5_3 = kg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("lhuz", lhsd(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kg.lhrs("lhva", lhru(int ), (int)43)) break;
            v2 /* !! */  = (long)kg.lhrs("lhvb", lhru(int ), (int)44);
        }
        var4_4 /* !! */  = kg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lhvc", lhsd(int ), (int)38)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kg.lhrs("lhvd", lhru(int ), (int)45)) break;
            v3 /* !! */  = (long)kg.lhrs("lhve", lhru(int ), (int)46);
        }
        var3_5 = kg.a;
        if (var5_3) {
            throw null;
lbl29:
            // 6 sources

            return null;
        }
        if (var3_5 || var3_5) ** GOTO lbl29
        v4 = var1_1;
        v5 /* !! */  = kg.tv;
        if (true) ** GOTO lbl37
        block51: while (true) {
            v5 /* !! */  = (long)(v6 - kg.lhrs("lhvf", lhsd(int ), (int)39));
lbl37:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1396225747: {
                    break block51;
                }
                case 60030889: {
                    v6 = kg.lhrs("lhvg", lhsd(int ), (int)40);
                    continue block51;
                }
                case 1185297094: {
                    v6 = kg.lhrs("lhvh", lhsd(int ), (int)41);
                    continue block51;
                }
            }
            break;
        }
        this.min = v4;
        if (var3_5 || var3_5) ** GOTO lbl29
        v7 = var2_2;
        v8 /* !! */  = kg.tv;
        if (true) ** GOTO lbl53
        block52: while (true) {
            v8 /* !! */  = (long)(kg.lhrs("lhvj", lhsd(int ), (int)43) - kg.lhrs("lhvi", lhsd(int ), (int)42));
lbl53:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1396225747: {
                    break block52;
                }
                case 1234711017: {
                    continue block52;
                }
            }
            break;
        }
        this.max = v7;
        if (var3_5 || var3_5) ** GOTO lbl29
        v9 = var1_1;
        v10 = var2_2;
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = kg.tv - kg.lhrs("lhvk", lhsd(int ), (int)44)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == kg.lhrs("lhvl", lhru(int ), (int)47)) break;
            v11 /* !! */  = (long)kg.lhrs("lhvm", lhru(int ), (int)48);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = kg.tv - kg.lhrs("lhvn", lhsd(int ), (int)45)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == kg.lhrs("lhvo", lhru(int ), (int)49)) break;
            v12 /* !! */  = (long)kg.lhrs("lhvp", lhru(int ), (int)50);
        }
        v13 = Math.min(v10, this.value);
        v14 /* !! */  = kg.tv;
        if (true) ** GOTO lbl77
        block55: while (true) {
            v14 /* !! */  = (long)(v15 - kg.lhrs("lhvq", lhsd(int ), (int)46));
lbl77:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1943031877: {
                    v15 = kg.lhrs("lhvr", lhsd(int ), (int)47);
                    continue block55;
                }
                case -1396225747: {
                    break block55;
                }
                case 1397543757: {
                    v15 = kg.lhrs("lhvs", lhsd(int ), (int)48);
                    continue block55;
                }
            }
            break;
        }
        v16 = Math.max(v9, v13);
        v17 /* !! */  = kg.tv;
        if (true) ** GOTO lbl91
        block56: while (true) {
            v17 /* !! */  = (long)(v18 - kg.lhrs("lhvt", lhsd(int ), (int)49));
lbl91:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1396225747: {
                    break block56;
                }
                case -159011930: {
                    v18 = kg.lhrs("lhvu", lhsd(int ), (int)50);
                    continue block56;
                }
                case -114234453: {
                    v18 = kg.lhrs("lhvv", lhsd(int ), (int)51);
                    continue block56;
                }
                case 1050854067: {
                    v18 = kg.lhrs("lhvw", lhsd(int ), (int)52);
                    continue block56;
                }
            }
            break;
        }
        this.value = v16;
        if (var3_5 || var3_5) ** GOTO lbl29
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v19 = kg.lhrs("lhvx", lhru(int ), (int)51);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_4 = kg.tv - kg.lhrs("lhvy", lhsd(int ), (int)53)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == kg.lhrs("lhvz", lhru(int ), (int)52)) break;
                    v20 /* !! */  = (long)kg.lhrs("lhwa", lhru(int ), (int)53);
                }
                this.integer = v19;
                if (var3_5 || var3_5) ** GOTO lbl29
                v21 /* !! */  = kg.tv;
                if (true) ** GOTO lbl120
                block58: while (true) {
                    v21 /* !! */  = (long)(v22 - kg.lhrs("lhwb", lhsd(int ), (int)54));
lbl120:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1396225747: {
                            break block58;
                        }
                        case -1328910550: {
                            v22 = kg.lhrs("lhwc", lhsd(int ), (int)55);
                            continue block58;
                        }
                        case 556575694: {
                            v22 = kg.lhrs("lhwd", lhsd(int ), (int)56);
                            continue block58;
                        }
                        case 1786546543: {
                            v22 = kg.lhrs("lhwe", lhsd(int ), (int)57);
                            continue block58;
                        }
                    }
                    break;
                }
                this.step = 1.0f;
                if (var3_5 || var3_5) ** continue;
                return this;
            }
lbl135:
            // 2 sources

            case 0: {
                do {
                    var4_4 /* !! */  = (int)kg.lhrs("lhwf", lhru(int ), (int)54);
                } while (!var5_3);
                throw null;
            }
lbl140:
            // 2 sources

            case 1: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwg", lhru(int ), (int)55);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
            case 2: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwh", lhru(int ), (int)56);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl184
            }
lbl150:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwi", lhru(int ), (int)57);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl155:
            // 3 sources

            case 4: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwj", lhru(int ), (int)58);
                if (!var5_3) ** GOTO lbl140
                throw null;
            }
            case 5: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwk", lhru(int ), (int)59);
                if (!var5_3) ** GOTO lbl155
                throw null;
            }
            case 6: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwl", lhru(int ), (int)60);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl168:
            // 2 sources

            case 7: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwm", lhru(int ), (int)61);
                if (!var5_3) ** GOTO lbl150
                throw null;
            }
lbl172:
            // 2 sources

            case 8: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwn", lhru(int ), (int)62);
                if (!var5_3) break;
                throw null;
            }
lbl176:
            // 2 sources

            case 9: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwo", lhru(int ), (int)63);
                if (!var5_3) ** GOTO lbl168
                throw null;
            }
lbl180:
            // 3 sources

            case 10: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwp", lhru(int ), (int)64);
                if (!var5_3) ** GOTO lbl135
                throw null;
            }
lbl184:
            // 2 sources

            case 11: {
                var4_4 /* !! */  = (int)kg.lhrs("lhwq", lhru(int ), (int)65);
                if (!var5_3) ** GOTO lbl176
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)kg.lhrs("lhwr", lhru(int ), (int)66);
                    if (!var5_3) ** GOTO lbl155
                    throw null;
                }
            }
            case 13: 
        }
        var4_4 /* !! */  = (int)kg.lhrs("lhws", lhru(int ), (int)67);
        ** while (!var5_3)
lbl196:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getInt() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("lhyf", lhsd(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kg.lhrs("lhyg", lhru(int ), (int)90)) break;
            v0 /* !! */  = (long)kg.lhrs("lhyh", lhru(int ), (int)91);
        }
        var3_1 = kg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lhyi", lhsd(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kg.lhrs("lhyj", lhru(int ), (int)92)) break;
            v1 /* !! */  = (long)kg.lhrs("lhyk", lhru(int ), (int)93);
        }
        var2_2 /* !! */  = kg.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = kg.tv;
                if (true) ** GOTO lbl22
                block18: while (true) {
                    v2 /* !! */  = (long)(v3 - kg.lhrs("lhyl", lhsd(int ), (int)76));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1396225747: {
                            break block18;
                        }
                        case -1287109164: {
                            v3 = kg.lhrs("lhym", lhsd(int ), (int)77);
                            continue block18;
                        }
                        case -744210189: {
                            v3 = kg.lhrs("lhyn", lhsd(int ), (int)78);
                            continue block18;
                        }
                        case -664463855: {
                            v3 = kg.lhrs("lhyo", lhsd(int ), (int)79);
                            continue block18;
                        }
                    }
                    break;
                }
                var1_3 = kg.a;
                if (var3_1) {
                    throw null;
                    return (int)kg.lhrs("lhyp", lhru(int ), (int)94);
                }
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = kg.tv;
                if (true) ** GOTO lbl44
                block20: while (true) {
                    v4 /* !! */  = (long)(kg.lhrs("lhyr", lhsd(int ), (int)81) - kg.lhrs("lhyq", lhsd(int ), (int)80));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1396225747: {
                            break block20;
                        }
                        case 820719906: {
                            continue block20;
                        }
                    }
                    break;
                }
                return (int)this.value;
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)kg.lhrs("lhys", lhru(int ), (int)95);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)kg.lhrs("lhyt", lhru(int ), (int)96);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)kg.lhrs("lhyu", lhru(int ), (int)97);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)kg.lhrs("lhyv", lhru(int ), (int)98);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void lihd() {
        kg.lhsf[0] = -8753782410636603629L;
        kg.lhsf[1] = 8076293898096349170L;
        kg.lhsf[2] = -996634385139453894L;
        kg.lhsf[3] = -2881205179171509262L;
        kg.lhsf[4] = 240715067040823478L;
        kg.lhsf[5] = 5894190603931259623L;
        kg.lhsf[6] = 4970112605537371480L;
        kg.lhsf[7] = -3652792260888666499L;
        kg.lhsf[8] = -5799355885838412165L;
        kg.lhsf[9] = -3437304098675519859L;
        kg.lhsf[10] = 4478658433601566385L;
        kg.lhsf[11] = -5006223028173430086L;
        kg.lhsf[12] = -2764967894085766886L;
        kg.lhsf[13] = -5281974739408597527L;
        kg.lhsf[14] = 2067663463584672416L;
        kg.lhsf[15] = 7722392149590481946L;
        kg.lhsf[16] = -2039126177533999889L;
        kg.lhsf[17] = -5699297674352134849L;
        kg.lhsf[18] = -6949765426187762921L;
        kg.lhsf[19] = -1018596783928383651L;
        kg.lhsf[20] = -4601045205971974870L;
        kg.lhsf[21] = -6847961666208783478L;
        kg.lhsf[22] = -7637927730094610003L;
        kg.lhsf[23] = 7603939323821285774L;
        kg.lhsf[24] = -4151678625235113532L;
        kg.lhsf[25] = 4898938059662470142L;
        kg.lhsf[26] = -4484550221940687075L;
        kg.lhsf[27] = 3564572517355545576L;
        kg.lhsf[28] = 2459805456461857036L;
        kg.lhsf[29] = 5500377913765404735L;
        kg.lhsf[30] = -4575749050946806410L;
        kg.lhsf[31] = 8288455455610007407L;
        kg.lhsf[32] = -8315184829783381665L;
        kg.lhsf[33] = -6551317914310089785L;
        kg.lhsf[34] = -6014691513348975842L;
        kg.lhsf[35] = -2377311220855661211L;
        kg.lhsf[36] = 4969773999819263622L;
        kg.lhsf[37] = -3342304383619524798L;
        kg.lhsf[38] = 8674192467484216601L;
        kg.lhsf[39] = 6245341850433302385L;
        kg.lhsf[40] = 9187924073816037433L;
        kg.lhsf[41] = -8460738061942038669L;
        kg.lhsf[42] = 8014419590722125213L;
        kg.lhsf[43] = 8980175244046077883L;
        kg.lhsf[44] = 2502679352156111089L;
        kg.lhsf[45] = -1433680443008858364L;
        kg.lhsf[46] = 1958110736507540964L;
        kg.lhsf[47] = -8403132843239754066L;
        kg.lhsf[48] = 568543124013900180L;
        kg.lhsf[49] = -7308725257066565021L;
        kg.lhsf[50] = -8171938634554626052L;
        kg.lhsf[51] = -5277822856308083249L;
        kg.lhsf[52] = -5733537186909960160L;
        kg.lhsf[53] = 8810038895309006933L;
        kg.lhsf[54] = 8336964533906622018L;
        kg.lhsf[55] = 4132546542353103267L;
        kg.lhsf[56] = 3294796567432491185L;
        kg.lhsf[57] = 7666054550214945120L;
        kg.lhsf[58] = 6090786780424800014L;
        kg.lhsf[59] = -5854333965299192735L;
        kg.lhsf[60] = -5935761099643193271L;
        kg.lhsf[61] = -6421927882768782864L;
        kg.lhsf[62] = -1546103457173419970L;
        kg.lhsf[63] = -9179878031666914698L;
        kg.lhsf[64] = -4175814703930671823L;
        kg.lhsf[65] = 8527180728979586690L;
        kg.lhsf[66] = -4264909402420041075L;
        kg.lhsf[67] = -3283538906696157944L;
        kg.lhsf[68] = -3243795053876904816L;
        kg.lhsf[69] = 4160164313535740815L;
        kg.lhsf[70] = -6765305583388931003L;
        kg.lhsf[71] = -8687523146717584817L;
        kg.lhsf[72] = 3538901785419470718L;
        kg.lhsf[73] = 57778431190856832L;
        kg.lhsf[74] = -169965028939241455L;
        kg.lhsf[75] = 4149492699379000037L;
        kg.lhsf[76] = -5982745710688190878L;
        kg.lhsf[77] = -5282912649420514273L;
        kg.lhsf[78] = -7611441662058917950L;
        kg.lhsf[79] = 3072346942112440509L;
        kg.lhsf[80] = -6269390126996234949L;
        kg.lhsf[81] = 6310158863793532612L;
        kg.lhsf[82] = 5420675307576711800L;
        kg.lhsf[83] = -5920090284800543134L;
        kg.lhsf[84] = -5927996320469204772L;
        kg.lhsf[85] = -6215126883399897090L;
        kg.lhsf[86] = 2763240161234712463L;
        kg.lhsf[87] = 6237985127362720963L;
        kg.lhsf[88] = 3596151393755045005L;
        kg.lhsf[89] = -6281356800242788011L;
        kg.lhsf[90] = -7119463723642422966L;
        kg.lhsf[91] = -8838346685776976617L;
        kg.lhsf[92] = 1597174723065049197L;
        kg.lhsf[93] = -3146999385744276215L;
        kg.lhsf[94] = 1954429877812022773L;
        kg.lhsf[95] = 6011973958699024090L;
        kg.lhsf[96] = -5357871899537630461L;
        kg.lhsf[97] = 5812536636949065731L;
        kg.lhsf[98] = -8608828758889409377L;
        kg.lhsf[99] = 4320113030880210826L;
    }

    private static /* synthetic */ void lihe() {
        kg.lhsf[100] = 8469138922500942178L;
        kg.lhsf[101] = -5075455757882609855L;
        kg.lhsf[102] = -8659979748439856137L;
        kg.lhsf[103] = 6506727987070592329L;
        kg.lhsf[104] = 9007145502901216122L;
        kg.lhsf[105] = 3333923840000502364L;
        kg.lhsf[106] = -5420056340545354380L;
        kg.lhsf[107] = -6717097990629449943L;
        kg.lhsf[108] = 360991216274191535L;
        kg.lhsf[109] = 7208929800290076109L;
        kg.lhsf[110] = -1734319478509262150L;
        kg.lhsf[111] = -3517917392655588025L;
        kg.lhsf[112] = -6856782217359882487L;
        kg.lhsf[113] = -2789970129137921355L;
        kg.lhsf[114] = 2575698806431933678L;
        kg.lhsf[115] = -7088327243283268083L;
        kg.lhsf[116] = -3249851032283351189L;
        kg.lhsf[117] = -4200394639992731978L;
        kg.lhsf[118] = 3292644428757302608L;
        kg.lhsf[119] = 9026436402171177691L;
        kg.lhsf[120] = 8903658805245642127L;
        kg.lhsf[121] = -7460724189828832942L;
        kg.lhsf[122] = -896236099737542879L;
        kg.lhsf[123] = -3278741382019471509L;
        kg.lhsf[124] = 8499737596623087119L;
        kg.lhsf[125] = 2362500347780681151L;
        kg.lhsf[126] = -7673046742944558621L;
        kg.lhsf[127] = 8326910622608897032L;
        kg.lhsf[128] = 11444870735777680L;
        kg.lhsf[129] = -6889196912873983925L;
        kg.lhsf[130] = 5276703846450368854L;
        kg.lhsf[131] = -311183246359407822L;
        kg.lhsf[132] = -3970970441197750351L;
        kg.lhsf[133] = 4018020856754631300L;
        kg.lhsf[134] = 1502319862484119444L;
        kg.lhsf[135] = -5039531679798388342L;
        kg.lhsf[136] = 6186894211045647567L;
        kg.lhsf[137] = -176322132769365394L;
        kg.lhsf[138] = 424948847111816592L;
        kg.lhsf[139] = 6117361321843582157L;
        kg.lhsf[140] = 4691243783377456553L;
        kg.lhsf[141] = -3454127359527199879L;
        kg.lhsf[142] = 4433021614845485373L;
        kg.lhsf[143] = 4329712309264995088L;
        kg.lhsf[144] = -6367339778604570849L;
        kg.lhsf[145] = 9017886612133752574L;
        kg.lhsf[146] = -2574133590723171613L;
        kg.lhsf[147] = 4071603998394269795L;
        kg.lhsf[148] = -3307723996001238921L;
        kg.lhsf[149] = 9035882983267362170L;
        kg.lhsf[150] = -7488732924713447597L;
        kg.lhsf[151] = -6522266988016996224L;
        kg.lhsf[152] = 363703706184031915L;
        kg.lhsf[153] = 1081399779306017271L;
        kg.lhsf[154] = -5804378362770729478L;
        kg.lhsf[155] = -4424137557898066107L;
        kg.lhsf[156] = -7484300788896546731L;
        kg.lhsf[157] = 5259334145754171238L;
        kg.lhsf[158] = -248555980080217241L;
        kg.lhsf[159] = 984384191583459350L;
        kg.lhsf[160] = 7195270593069185009L;
        kg.lhsf[161] = 2366594272456829839L;
        kg.lhsf[162] = 3279491602950565013L;
        kg.lhsf[163] = -6924218813060520392L;
        kg.lhsf[164] = -4023877520140693839L;
        kg.lhsf[165] = 7096333852531037790L;
        kg.lhsf[166] = -2960433948016374023L;
        kg.lhsf[167] = -7408902676198575708L;
        kg.lhsf[168] = -6153083436982201565L;
        kg.lhsf[169] = 6107401880712182122L;
        kg.lhsf[170] = 1181624592025813907L;
    }

    private static /* synthetic */ void ligw() {
        kg.lhrq[100] = -262284351;
        kg.lhrq[101] = 73502887;
        kg.lhrq[102] = -410786951;
        kg.lhrq[103] = 1180125347;
        kg.lhrq[104] = 35327361;
        kg.lhrq[105] = -376467814;
        kg.lhrq[106] = 46351195;
        kg.lhrq[107] = -1210897717;
        kg.lhrq[108] = 221501994;
        kg.lhrq[109] = 1923836807;
        kg.lhrq[110] = -1175088733;
        kg.lhrq[111] = 1699231023;
        kg.lhrq[112] = 1668735439;
        kg.lhrq[113] = -661222324;
        kg.lhrq[114] = -892658711;
        kg.lhrq[115] = -2043736917;
        kg.lhrq[116] = -951298913;
        kg.lhrq[117] = 894544625;
        kg.lhrq[118] = -883296676;
        kg.lhrq[119] = -1658754533;
        kg.lhrq[120] = 1005891347;
        kg.lhrq[121] = 893192347;
        kg.lhrq[122] = -807355022;
        kg.lhrq[123] = -151495298;
        kg.lhrq[124] = -1335377859;
        kg.lhrq[125] = -1039041572;
        kg.lhrq[126] = -670295403;
        kg.lhrq[127] = -1875516836;
        kg.lhrq[128] = 958234069;
        kg.lhrq[129] = -1663205406;
        kg.lhrq[130] = 426303692;
        kg.lhrq[131] = 771235083;
        kg.lhrq[132] = 1023025702;
        kg.lhrq[133] = 1646454292;
        kg.lhrq[134] = 1061439473;
        kg.lhrq[135] = -655896117;
        kg.lhrq[136] = -388343126;
        kg.lhrq[137] = -861394590;
        kg.lhrq[138] = -981439944;
        kg.lhrq[139] = -1333026731;
        kg.lhrq[140] = 209779725;
        kg.lhrq[141] = 645082750;
        kg.lhrq[142] = -247574639;
        kg.lhrq[143] = -191397227;
        kg.lhrq[144] = -468051283;
        kg.lhrq[145] = -661126039;
        kg.lhrq[146] = -405490318;
        kg.lhrq[147] = -1550806390;
        kg.lhrq[148] = 2058667384;
        kg.lhrq[149] = 1977202931;
        kg.lhrq[150] = 321708617;
        kg.lhrq[151] = 476326831;
        kg.lhrq[152] = -785681552;
        kg.lhrq[153] = -2109144996;
        kg.lhrq[154] = 366002963;
        kg.lhrq[155] = 607334790;
        kg.lhrq[156] = -1158991711;
        kg.lhrq[157] = 272881918;
        kg.lhrq[158] = -1114817921;
        kg.lhrq[159] = -83217112;
        kg.lhrq[160] = -761845503;
        kg.lhrq[161] = -1371731545;
        kg.lhrq[162] = -1669400138;
        kg.lhrq[163] = 1222546517;
        kg.lhrq[164] = -337984408;
        kg.lhrq[165] = -896296101;
        kg.lhrq[166] = -693174853;
        kg.lhrq[167] = 123028750;
        kg.lhrq[168] = 1505256866;
        kg.lhrq[169] = -1086321403;
        kg.lhrq[170] = -644402831;
        kg.lhrq[171] = 1304007424;
        kg.lhrq[172] = 1161449720;
        kg.lhrq[173] = -917547183;
        kg.lhrq[174] = -820132368;
        kg.lhrq[175] = -1787393857;
        kg.lhrq[176] = -560364735;
        kg.lhrq[177] = 457249038;
        kg.lhrq[178] = 699572713;
        kg.lhrq[179] = -668496403;
        kg.lhrq[180] = 1373778976;
        kg.lhrq[181] = -125927055;
        kg.lhrq[182] = -239612824;
        kg.lhrq[183] = -824490504;
        kg.lhrq[184] = -1389747697;
        kg.lhrq[185] = 392331765;
        kg.lhrq[186] = 1112718213;
        kg.lhrq[187] = -133950625;
        kg.lhrq[188] = 1027265961;
        kg.lhrq[189] = -1675120596;
        kg.lhrq[190] = -1140468352;
        kg.lhrq[191] = 1350647094;
        kg.lhrq[192] = 135128401;
        kg.lhrq[193] = 927943408;
        kg.lhrq[194] = -1870088702;
        kg.lhrq[195] = -784947585;
        kg.lhrq[196] = 1846554443;
        kg.lhrq[197] = 1622493691;
        kg.lhrq[198] = 1176607264;
        kg.lhrq[199] = 146761024;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getStep() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("libo", lhsd(int ), (int)117)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kg.lhrs("libp", lhru(int ), (int)134)) break;
            v0 /* !! */  = (long)kg.lhrs("libq", lhru(int ), (int)135);
        }
        var3_1 = kg.c;
        v1 /* !! */  = kg.tv;
        if (true) ** GOTO lbl12
        block7: while (true) {
            v1 /* !! */  = (long)(v2 - kg.lhrs("libr", lhsd(int ), (int)118));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1417864494: {
                    v2 = kg.lhrs("libs", lhsd(int ), (int)119);
                    continue block7;
                }
                case -1396225747: {
                    break block7;
                }
                case -575495496: {
                    v2 = kg.lhrs("libt", lhsd(int ), (int)120);
                    continue block7;
                }
                case 179954514: {
                    v2 = kg.lhrs("libu", lhsd(int ), (int)121);
                    continue block7;
                }
            }
            break;
        }
        var2_2 = kg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("libv", lhsd(int ), (int)122)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kg.lhrs("libw", lhru(int ), (int)136)) break;
            v3 /* !! */  = (long)kg.lhrs("libx", lhru(int ), (int)137);
        }
        var1_3 = kg.a;
        if (var3_1) {
            throw null;
lbl34:
            // 1 sources

            return (float)kg.lhrs("liby", lhrp(int ), (int)138);
        }
        ** while (var1_3 || var1_3)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kg.tv - kg.lhrs("libz", lhsd(int ), (int)123)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == kg.lhrs("lica", lhru(int ), (int)139)) break;
            v4 /* !! */  = (long)kg.lhrs("licb", lhru(int ), (int)140);
        }
        return this.step;
    }

    /*
     * Enabled aggressive block sorting
     */
    public kg setInteger(boolean bl2) {
        boolean bl3;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = tv - kg.lhrs("ligf", lhsd(int ), (int)166)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == kg.lhrs("ligg", lhru(int ), (int)206)) break;
            object = kg.lhrs("ligh", lhru(int ), (int)207);
        }
        boolean bl4 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = tv - kg.lhrs("ligi", lhsd(int ), (int)167)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == kg.lhrs("ligj", lhru(int ), (int)208)) break;
            object = kg.lhrs("ligk", lhru(int ), (int)209);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = tv - kg.lhrs("ligl", lhsd(int ), (int)168)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == kg.lhrs("ligm", lhru(int ), (int)210)) {
                bl3 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object = kg.lhrs("lign", lhru(int ), (int)211);
        }
        if (bl3 || bl3) return null;
        Object object = tv;
        block7: while (true) {
            switch ((int)object) {
                case -1629612966: {
                    object = kg.lhrs("ligp", lhsd(int ), (int)170) - kg.lhrs("ligo", lhsd(int ), (int)169);
                    continue block7;
                }
                case -1396225747: {
                    break block7;
                }
            }
            break;
        }
        this.integer = bl2;
        if (!bl3) return this;
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg suffix(String var1_1) {
        v0 /* !! */  = kg.tv;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - kg.lhrs("lhwt", lhsd(int ), (int)58));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1396225747: {
                    break block20;
                }
                case -452952079: {
                    v1 = kg.lhrs("lhwu", lhsd(int ), (int)59);
                    continue block20;
                }
                case 58587715: {
                    v1 = kg.lhrs("lhwv", lhsd(int ), (int)60);
                    continue block20;
                }
                case 1022158416: {
                    v1 = kg.lhrs("lhww", lhsd(int ), (int)61);
                    continue block20;
                }
            }
            break;
        }
        var4_2 = kg.c;
        v2 /* !! */  = kg.tv;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - kg.lhrs("lhwx", lhsd(int ), (int)62));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1839883134: {
                    v3 = kg.lhrs("lhwy", lhsd(int ), (int)63);
                    continue block21;
                }
                case -1396225747: {
                    break block21;
                }
                case 992006334: {
                    v3 = kg.lhrs("lhwz", lhsd(int ), (int)64);
                    continue block21;
                }
                case 1722630155: {
                    v3 = kg.lhrs("lhxa", lhsd(int ), (int)65);
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = kg.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("lhxb", lhsd(int ), (int)66)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kg.lhrs("lhxc", lhru(int ), (int)68)) break;
            v4 /* !! */  = (long)kg.lhrs("lhxd", lhru(int ), (int)69);
        }
        var2_4 = kg.a;
        if (var4_2) {
            throw null;
lbl43:
            // 3 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lhxe", lhsd(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == kg.lhrs("lhxf", lhru(int ), (int)70)) break;
            v5 /* !! */  = (long)kg.lhrs("lhxg", lhru(int ), (int)71);
        }
        this.suffix = var1_1;
        if (var2_4) ** GOTO lbl43
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
lbl59:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kg.lhrs("lhxh", lhru(int ), (int)72);
                if (var4_2) {
                    throw null;
                }
            }
lbl63:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)kg.lhrs("lhxi", lhru(int ), (int)73);
                if (!var4_2) ** GOTO lbl59
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)kg.lhrs("lhxj", lhru(int ), (int)74);
                } while (!var4_2);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kg.lhrs("lhxk", lhru(int ), (int)75);
                    if (!var4_2) break block12;
                    throw null;
                }
            }
            case 4: {
                var3_3 /* !! */  = (int)kg.lhrs("lhxl", lhru(int ), (int)76);
                if (!var4_2) ** GOTO lbl63
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kg.lhrs("lhxm", lhru(int ), (int)77);
        ** while (!var4_2)
lbl84:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public float getMax() {
        v0 /* !! */  = kg.tv;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - kg.lhrs("liax", lhsd(int ), (int)107));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1662794854: {
                    v1 = kg.lhrs("liay", lhsd(int ), (int)108);
                    continue block21;
                }
                case -1396225747: {
                    break block21;
                }
                case -436160220: {
                    v1 = kg.lhrs("liaz", lhsd(int ), (int)109);
                    continue block21;
                }
                case 1310825389: {
                    v1 = kg.lhrs("liba", lhsd(int ), (int)110);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = kg.c;
        v2 /* !! */  = kg.tv;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - kg.lhrs("libb", lhsd(int ), (int)111));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1396225747: {
                    break block22;
                }
                case 350083683: {
                    v3 = kg.lhrs("libc", lhsd(int ), (int)112);
                    continue block22;
                }
                case 1810359453: {
                    v3 = kg.lhrs("libd", lhsd(int ), (int)113);
                    continue block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = kg.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = kg.tv;
                if (true) ** GOTO lbl39
                block23: while (true) {
                    v4 /* !! */  = (long)(kg.lhrs("libf", lhsd(int ), (int)115) - kg.lhrs("libe", lhsd(int ), (int)114));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1396225747: {
                            break block23;
                        }
                        case 134461367: {
                            continue block23;
                        }
                    }
                    break;
                }
                var1_3 = kg.a;
                if (var3_1) {
                    throw null;
                    return (float)kg.lhrs("libg", lhrp(int ), (int)127);
                }
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("libh", lhsd(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == kg.lhrs("libi", lhru(int ), (int)128)) break;
                    v5 /* !! */  = (long)kg.lhrs("libj", lhru(int ), (int)129);
                }
                return this.max;
            }
lbl57:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)kg.lhrs("libk", lhru(int ), (int)130);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)kg.lhrs("libl", lhru(int ), (int)131);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)kg.lhrs("libm", lhru(int ), (int)132);
                    if (!var3_1) ** GOTO lbl57
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kg.lhrs("libn", lhru(int ), (int)133);
        ** while (!var3_1)
lbl74:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg setSuffix(String var1_1) {
        v0 /* !! */  = kg.tv;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - kg.lhrs("lifn", lhsd(int ), (int)157));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1413054643: {
                    v1 = kg.lhrs("lifo", lhsd(int ), (int)158);
                    continue block18;
                }
                case -1396225747: {
                    break block18;
                }
                case 88208370: {
                    v1 = kg.lhrs("lifp", lhsd(int ), (int)159);
                    continue block18;
                }
                case 1840883760: {
                    v1 = kg.lhrs("lifq", lhsd(int ), (int)160);
                    continue block18;
                }
            }
            break;
        }
        var4_2 = kg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("lifr", lhsd(int ), (int)161)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == kg.lhrs("lifs", lhru(int ), (int)197)) break;
            v2 /* !! */  = (long)kg.lhrs("lift", lhru(int ), (int)198);
        }
        var3_3 /* !! */  = kg.b;
        v3 /* !! */  = kg.tv;
        if (true) ** GOTO lbl28
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - kg.lhrs("lifu", lhsd(int ), (int)162));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2072694562: {
                    v4 = kg.lhrs("lifv", lhsd(int ), (int)163);
                    continue block20;
                }
                case -1987196037: {
                    v4 = kg.lhrs("lifw", lhsd(int ), (int)164);
                    continue block20;
                }
                case -1396225747: {
                    break block20;
                }
            }
            break;
        }
        var2_4 = kg.a;
        if (var4_2) {
            throw null;
lbl40:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lifx", lhsd(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kg.lhrs("lify", lhru(int ), (int)199)) break;
                    v5 /* !! */  = (long)kg.lhrs("lifz", lhru(int ), (int)200);
                }
                this.suffix = var1_1;
                if (var2_4) ** continue;
                return this;
            }
lbl55:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)kg.lhrs("liga", lhru(int ), (int)201);
                if (var4_2) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)kg.lhrs("ligb", lhru(int ), (int)202);
                } while (!var4_2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kg.lhrs("ligc", lhru(int ), (int)203);
                    if (!var4_2) ** GOTO lbl55
                    throw null;
                }
            }
            case 3: {
                do {
                    var3_3 /* !! */  = (int)kg.lhrs("ligd", lhru(int ), (int)204);
                } while (!var4_2);
                throw null;
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)kg.lhrs("lige", lhru(int ), (int)205);
        ** while (!var4_2)
lbl77:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lihc() {
        kg.lhse[100] = -3536448814792166429L;
        kg.lhse[101] = 6101855333069430090L;
        kg.lhse[102] = -7919024846865042996L;
        kg.lhse[103] = -8428928978523460188L;
        kg.lhse[104] = 6239211539412580769L;
        kg.lhse[105] = -4098631063830462152L;
        kg.lhse[106] = -5559396594747281729L;
        kg.lhse[107] = 7518752659754364182L;
        kg.lhse[108] = 4224770199744636276L;
        kg.lhse[109] = -216085954293289483L;
        kg.lhse[110] = 8082829230039860895L;
        kg.lhse[111] = 5080154005595868085L;
        kg.lhse[112] = 4271458583055951602L;
        kg.lhse[113] = 6829066323034614971L;
        kg.lhse[114] = -3094701216486131423L;
        kg.lhse[115] = 4054745874123408181L;
        kg.lhse[116] = -4899179085070570883L;
        kg.lhse[117] = 8057003766642494765L;
        kg.lhse[118] = 4657804014229856247L;
        kg.lhse[119] = 9200061758824117249L;
        kg.lhse[120] = -7000316008257370777L;
        kg.lhse[121] = 3681158371393635650L;
        kg.lhse[122] = 4616143826716533698L;
        kg.lhse[123] = -5536016584044109442L;
        kg.lhse[124] = 2898168776823753079L;
        kg.lhse[125] = -6633700475616668671L;
        kg.lhse[126] = -3640650037106616434L;
        kg.lhse[127] = -818407547278627346L;
        kg.lhse[128] = 728158126923724253L;
        kg.lhse[129] = 89053531818481037L;
        kg.lhse[130] = -3010486932351165023L;
        kg.lhse[131] = 4480349734874127648L;
        kg.lhse[132] = 7041538442627223341L;
        kg.lhse[133] = -6017163200537540484L;
        kg.lhse[134] = -5244940965829942877L;
        kg.lhse[135] = -6456343172833427795L;
        kg.lhse[136] = -8106721867786759853L;
        kg.lhse[137] = -868200027576336486L;
        kg.lhse[138] = 8689316389532272431L;
        kg.lhse[139] = 632401949457974388L;
        kg.lhse[140] = -919386167589199417L;
        kg.lhse[141] = 7802998441251004257L;
        kg.lhse[142] = 7916076452042043132L;
        kg.lhse[143] = -5420235068157831952L;
        kg.lhse[144] = 7175849704706768575L;
        kg.lhse[145] = -8543804621198525119L;
        kg.lhse[146] = -8091079422017815247L;
        kg.lhse[147] = 6161439398887715778L;
        kg.lhse[148] = 1651379697495899666L;
        kg.lhse[149] = 4287419754789248253L;
        kg.lhse[150] = -8607793384525418971L;
        kg.lhse[151] = 6999426933206415534L;
        kg.lhse[152] = -1971612636349105640L;
        kg.lhse[153] = 3200279011267466249L;
        kg.lhse[154] = -9037386112961528525L;
        kg.lhse[155] = 515388101547223864L;
        kg.lhse[156] = 5930344720873123029L;
        kg.lhse[157] = -5884276501925623769L;
        kg.lhse[158] = -5850724830962911833L;
        kg.lhse[159] = 445257617641905455L;
        kg.lhse[160] = -8646432395024325558L;
        kg.lhse[161] = -7330899051892290666L;
        kg.lhse[162] = 4848675021854201870L;
        kg.lhse[163] = -6740898762060616693L;
        kg.lhse[164] = -3784179164962260427L;
        kg.lhse[165] = -3697478795989824554L;
        kg.lhse[166] = 492809546154309642L;
        kg.lhse[167] = -1649419306466345138L;
        kg.lhse[168] = 3240555343350740232L;
        kg.lhse[169] = 4806995577225923267L;
        kg.lhse[170] = 6950543411085183394L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg setMax(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("liee", lhsd(int ), (int)144)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kg.lhrs("lief", lhru(int ), (int)175)) break;
            v0 /* !! */  = (long)kg.lhrs("lieg", lhru(int ), (int)176);
        }
        var4_2 = kg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lieh", lhsd(int ), (int)145)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == kg.lhrs("liei", lhru(int ), (int)177)) break;
            v1 /* !! */  = (long)kg.lhrs("liej", lhru(int ), (int)178);
        }
        var3_3 /* !! */  = kg.b;
        v2 /* !! */  = kg.tv;
        if (true) ** GOTO lbl17
        block14: while (true) {
            v2 /* !! */  = (long)(v3 - kg.lhrs("liek", lhsd(int ), (int)146));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1420281470: {
                    v3 = kg.lhrs("liel", lhsd(int ), (int)147);
                    continue block14;
                }
                case -1396225747: {
                    break block14;
                }
                case -472443215: {
                    v3 = kg.lhrs("liem", lhsd(int ), (int)148);
                    continue block14;
                }
            }
            break;
        }
        var2_4 = kg.a;
        if (var4_2) {
            throw null;
lbl29:
            // 2 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kg.tv - kg.lhrs("lien", lhsd(int ), (int)149)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kg.lhrs("lieo", lhru(int ), (int)179)) break;
            v4 /* !! */  = (long)kg.lhrs("liep", lhru(int ), (int)180);
        }
        this.max = var1_1;
        if (!var2_4) ** break;
        ** while (true)
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return this;
            }
            case 0: {
                var3_3 /* !! */  = (int)kg.lhrs("lieq", lhru(int ), (int)181);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl53
            }
            case 1: {
                var3_3 /* !! */  = (int)kg.lhrs("lier", lhru(int ), (int)182);
                if (!var4_2) break;
                throw null;
            }
lbl53:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)kg.lhrs("lies", lhru(int ), (int)183);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kg.lhrs("liet", lhru(int ), (int)184);
                    if (!var4_2) ** GOTO lbl53
                    throw null;
                }
            }
            case 4: 
        }
        var3_3 /* !! */  = (int)kg.lhrs("lieu", lhru(int ), (int)185);
        ** while (!var4_2)
lbl65:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public kg step(float f2) {
        boolean bl2;
        Object object = tv;
        boolean bl3 = true;
        block5: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - kg.lhrs("lhxn", lhsd(int ), (int)68);
            }
            switch ((int)object) {
                case -1396225747: {
                    break block5;
                }
                case -417247935: {
                    callSite = kg.lhrs("lhxo", lhsd(int ), (int)69);
                    continue block5;
                }
                case 922454588: {
                    callSite = kg.lhrs("lhxp", lhsd(int ), (int)70);
                    continue block5;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = tv - kg.lhrs("lhxq", lhsd(int ), (int)71)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == kg.lhrs("lhxr", lhru(int ), (int)78)) break;
            object2 = kg.lhrs("lhxs", lhru(int ), (int)79);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = tv - kg.lhrs("lhxt", lhsd(int ), (int)72)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == kg.lhrs("lhxu", lhru(int ), (int)80)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = kg.lhrs("lhxv", lhru(int ), (int)81);
        }
        if (bl2 || bl2) return null;
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = tv - kg.lhrs("lhxw", lhsd(int ), (int)73)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == kg.lhrs("lhxx", lhru(int ), (int)82)) {
                this.step = f2;
                if (bl2) return null;
                break;
            }
            object4 = kg.lhrs("lhxy", lhru(int ), (int)83);
        }
        if (!bl2) return this;
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg(String var1_1, String var2_2, float var3_3) {
        var5_4 /* !! */  = kg.b;
        super(var1_1, var2_2);
        this.step = (float)kg.lhrs("lhrt", lhrp(int ), (int)0);
        this.suffix = "";
        this.value = var3_3;
        this.min = var3_3;
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.max = var3_3;
                return;
            }
lbl12:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)kg.lhrs("lhrv", lhru(int ), (int)1);
                ** GOTO lbl24
            }
lbl15:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)kg.lhrs("lhrw", lhru(int ), (int)2);
                ** GOTO lbl30
            }
            case 2: {
                var5_4 /* !! */  = (int)kg.lhrs("lhrx", lhru(int ), (int)3);
                ** GOTO lbl27
            }
            case 3: {
                var5_4 /* !! */  = (int)kg.lhrs("lhry", lhru(int ), (int)4);
                ** GOTO lbl12
            }
lbl24:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)kg.lhrs("lhrz", lhru(int ), (int)5);
                ** GOTO lbl15
            }
lbl27:
            // 2 sources

            case 5: {
                var5_4 /* !! */  = (int)kg.lhrs("lhsa", lhru(int ), (int)6);
                break;
            }
lbl30:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)kg.lhrs("lhsb", lhru(int ), (int)7);
                ** GOTO lbl12
            }
            case 7: 
        }
        while (true) {
            var5_4 /* !! */  = (int)kg.lhrs("lhsc", lhru(int ), (int)8);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg setStep(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("liev", lhsd(int ), (int)150)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kg.lhrs("liew", lhru(int ), (int)186)) break;
            v0 /* !! */  = (long)kg.lhrs("liex", lhru(int ), (int)187);
        }
        var4_2 = kg.c;
        v1 /* !! */  = kg.tv;
        if (true) ** GOTO lbl11
        block14: while (true) {
            v1 /* !! */  = (long)(v2 - kg.lhrs("liey", lhsd(int ), (int)151));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1985586646: {
                    v2 = kg.lhrs("liez", lhsd(int ), (int)152);
                    continue block14;
                }
                case -1557542703: {
                    v2 = kg.lhrs("lifa", lhsd(int ), (int)153);
                    continue block14;
                }
                case -1396225747: {
                    break block14;
                }
                case 1853379502: {
                    v2 = kg.lhrs("lifb", lhsd(int ), (int)154);
                    continue block14;
                }
            }
            break;
        }
        var3_3 /* !! */  = kg.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lifc", lhsd(int ), (int)155)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == kg.lhrs("lifd", lhru(int ), (int)188)) break;
            v3 /* !! */  = (long)kg.lhrs("life", lhru(int ), (int)189);
        }
        var2_4 = kg.a;
        if (var4_2) {
            throw null;
lbl32:
            // 3 sources

            return null;
        }
        if (var2_4) ** GOTO lbl32
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl32
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = kg.tv - kg.lhrs("liff", lhsd(int ), (int)156)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == kg.lhrs("lifg", lhru(int ), (int)190)) break;
                    v4 /* !! */  = (long)kg.lhrs("lifh", lhru(int ), (int)191);
                }
                this.step = var1_1;
                if (var2_4) ** continue;
                return this;
            }
            case 0: {
                var3_3 /* !! */  = (int)kg.lhrs("lifi", lhru(int ), (int)192);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl57
            }
            case 1: {
                var3_3 /* !! */  = (int)kg.lhrs("lifj", lhru(int ), (int)193);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl61
            }
lbl57:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)kg.lhrs("lifk", lhru(int ), (int)194);
                if (var4_2) {
                    throw null;
                }
            }
lbl61:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)kg.lhrs("lifl", lhru(int ), (int)195);
                if (!var4_2) break;
                throw null;
            }
            case 4: 
        }
        do {
            var3_3 /* !! */  = (int)kg.lhrs("lifm", lhru(int ), (int)196);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void ligv() {
        kg.lhrq[0] = -1172326519;
        kg.lhrq[1] = 985522847;
        kg.lhrq[2] = 479461233;
        kg.lhrq[3] = -2119173834;
        kg.lhrq[4] = -1188835540;
        kg.lhrq[5] = -3057892;
        kg.lhrq[6] = 1421198409;
        kg.lhrq[7] = 1717225223;
        kg.lhrq[8] = 1005446163;
        kg.lhrq[9] = -184374154;
        kg.lhrq[10] = 715768142;
        kg.lhrq[11] = 1287130749;
        kg.lhrq[12] = 2127695790;
        kg.lhrq[13] = 1891245755;
        kg.lhrq[14] = -1575946291;
        kg.lhrq[15] = 1496372811;
        kg.lhrq[16] = -959065513;
        kg.lhrq[17] = -1438132504;
        kg.lhrq[18] = 2049145577;
        kg.lhrq[19] = 2119972140;
        kg.lhrq[20] = 153829662;
        kg.lhrq[21] = -572029190;
        kg.lhrq[22] = -1808145572;
        kg.lhrq[23] = 178121626;
        kg.lhrq[24] = -882893952;
        kg.lhrq[25] = 1593574201;
        kg.lhrq[26] = -889121701;
        kg.lhrq[27] = 1403249624;
        kg.lhrq[28] = -1908993070;
        kg.lhrq[29] = 1486140232;
        kg.lhrq[30] = 32327490;
        kg.lhrq[31] = 1760125283;
        kg.lhrq[32] = -960667005;
        kg.lhrq[33] = 785564075;
        kg.lhrq[34] = 1281510762;
        kg.lhrq[35] = -190023179;
        kg.lhrq[36] = 1101467821;
        kg.lhrq[37] = -1923054129;
        kg.lhrq[38] = 1114126947;
        kg.lhrq[39] = 423722180;
        kg.lhrq[40] = -1848707274;
        kg.lhrq[41] = -1522626063;
        kg.lhrq[42] = 1834574855;
        kg.lhrq[43] = -1277826837;
        kg.lhrq[44] = -470262221;
        kg.lhrq[45] = -1225794629;
        kg.lhrq[46] = 529452583;
        kg.lhrq[47] = 1264863223;
        kg.lhrq[48] = 864052471;
        kg.lhrq[49] = 553602809;
        kg.lhrq[50] = -1547905121;
        kg.lhrq[51] = -1105450077;
        kg.lhrq[52] = -936861845;
        kg.lhrq[53] = -1581297056;
        kg.lhrq[54] = 413281230;
        kg.lhrq[55] = 1211806290;
        kg.lhrq[56] = 1068900735;
        kg.lhrq[57] = -16410030;
        kg.lhrq[58] = -1823178199;
        kg.lhrq[59] = -1333898074;
        kg.lhrq[60] = 742675450;
        kg.lhrq[61] = 209601621;
        kg.lhrq[62] = -896731668;
        kg.lhrq[63] = 974360846;
        kg.lhrq[64] = 1745870451;
        kg.lhrq[65] = 979874183;
        kg.lhrq[66] = 500967090;
        kg.lhrq[67] = -1281995289;
        kg.lhrq[68] = 1979052961;
        kg.lhrq[69] = 1838659450;
        kg.lhrq[70] = -82957580;
        kg.lhrq[71] = 451189765;
        kg.lhrq[72] = 1136502805;
        kg.lhrq[73] = 421180672;
        kg.lhrq[74] = 546576867;
        kg.lhrq[75] = -1387364843;
        kg.lhrq[76] = -107683250;
        kg.lhrq[77] = 1863080765;
        kg.lhrq[78] = -1788692122;
        kg.lhrq[79] = 704778681;
        kg.lhrq[80] = -1042165205;
        kg.lhrq[81] = -132250912;
        kg.lhrq[82] = 908624854;
        kg.lhrq[83] = 301768800;
        kg.lhrq[84] = 128326937;
        kg.lhrq[85] = 602119;
        kg.lhrq[86] = 287407630;
        kg.lhrq[87] = -851710579;
        kg.lhrq[88] = -1781355775;
        kg.lhrq[89] = -756546528;
        kg.lhrq[90] = -1187274964;
        kg.lhrq[91] = -1345619415;
        kg.lhrq[92] = -2133164469;
        kg.lhrq[93] = 4148569;
        kg.lhrq[94] = -587954426;
        kg.lhrq[95] = -860181421;
        kg.lhrq[96] = 1610033130;
        kg.lhrq[97] = 76246937;
        kg.lhrq[98] = -1840231725;
        kg.lhrq[99] = 64488015;
    }

    private static /* synthetic */ void lihb() {
        kg.lhse[0] = -8844050170201605334L;
        kg.lhse[1] = 7265745488013342386L;
        kg.lhse[2] = 2407801444287680261L;
        kg.lhse[3] = -1095753768226539814L;
        kg.lhse[4] = -4634968661735853330L;
        kg.lhse[5] = 9186028728436478328L;
        kg.lhse[6] = 2407621123607570978L;
        kg.lhse[7] = 649346399404681747L;
        kg.lhse[8] = -2181426443350599578L;
        kg.lhse[9] = 4858668923134998735L;
        kg.lhse[10] = -4512176004643779605L;
        kg.lhse[11] = 7518217345091277137L;
        kg.lhse[12] = -2840027202349328819L;
        kg.lhse[13] = 3585643352843286415L;
        kg.lhse[14] = -8278098215789364876L;
        kg.lhse[15] = 7847735318665570447L;
        kg.lhse[16] = 3380189771100055341L;
        kg.lhse[17] = -3409433541643601045L;
        kg.lhse[18] = 4850206069580034546L;
        kg.lhse[19] = 3187165443522260893L;
        kg.lhse[20] = 3147500082706680669L;
        kg.lhse[21] = -2532622164008959613L;
        kg.lhse[22] = -656416942011657245L;
        kg.lhse[23] = -2015799362850564480L;
        kg.lhse[24] = 5898391907383670208L;
        kg.lhse[25] = 6347085845824956957L;
        kg.lhse[26] = -1651130312234366806L;
        kg.lhse[27] = -4907993617811098275L;
        kg.lhse[28] = 1339176231662389851L;
        kg.lhse[29] = -8895429354373502027L;
        kg.lhse[30] = 2406266406662105515L;
        kg.lhse[31] = 3485148226953511521L;
        kg.lhse[32] = 6206049251584475292L;
        kg.lhse[33] = 7732255552287130728L;
        kg.lhse[34] = -3876880767661413544L;
        kg.lhse[35] = -5856003584271958162L;
        kg.lhse[36] = 4843026942103655054L;
        kg.lhse[37] = 6347841248181862155L;
        kg.lhse[38] = 4409847839931322259L;
        kg.lhse[39] = 7368624340697150069L;
        kg.lhse[40] = 7296208217571545059L;
        kg.lhse[41] = -4681494684775768580L;
        kg.lhse[42] = -4676395014110184101L;
        kg.lhse[43] = 2299848850425657687L;
        kg.lhse[44] = -7366698295462073197L;
        kg.lhse[45] = 4259490560887032764L;
        kg.lhse[46] = 3919620076499439804L;
        kg.lhse[47] = -4671441177293505970L;
        kg.lhse[48] = -4281366198069732353L;
        kg.lhse[49] = -137775792608445293L;
        kg.lhse[50] = 1983072652104708961L;
        kg.lhse[51] = -5738497912776288049L;
        kg.lhse[52] = -2106682849350190681L;
        kg.lhse[53] = 6171613660085102076L;
        kg.lhse[54] = -4250339668697265901L;
        kg.lhse[55] = 121043916727140862L;
        kg.lhse[56] = 5903920352163199222L;
        kg.lhse[57] = 3942220431239274296L;
        kg.lhse[58] = -7885316619961590927L;
        kg.lhse[59] = 5911672649534404979L;
        kg.lhse[60] = -6963653921843588772L;
        kg.lhse[61] = 1409972899615693398L;
        kg.lhse[62] = -7201163825323294638L;
        kg.lhse[63] = 1084827092360700078L;
        kg.lhse[64] = 1695255299733536693L;
        kg.lhse[65] = -4259444384726903706L;
        kg.lhse[66] = -9178987340099926220L;
        kg.lhse[67] = -4954084482655640361L;
        kg.lhse[68] = -2798855965742132983L;
        kg.lhse[69] = -1827555528315583298L;
        kg.lhse[70] = -4249251650178170441L;
        kg.lhse[71] = -3902030816108978161L;
        kg.lhse[72] = 1342140983262686326L;
        kg.lhse[73] = 5566041998185267475L;
        kg.lhse[74] = -2127988963510134911L;
        kg.lhse[75] = -1870897914784108411L;
        kg.lhse[76] = 5451214826002882058L;
        kg.lhse[77] = 8992552940815509655L;
        kg.lhse[78] = -3886373203357917420L;
        kg.lhse[79] = -8075613719334042906L;
        kg.lhse[80] = -8736693585544802862L;
        kg.lhse[81] = 461761565160493228L;
        kg.lhse[82] = -103521007112586336L;
        kg.lhse[83] = 8836056193694659727L;
        kg.lhse[84] = 4780664965977933003L;
        kg.lhse[85] = 6549015024871293300L;
        kg.lhse[86] = 536363964357124618L;
        kg.lhse[87] = 5163857202053255493L;
        kg.lhse[88] = 5480256841212314301L;
        kg.lhse[89] = 212810446109580842L;
        kg.lhse[90] = 4819532573391442906L;
        kg.lhse[91] = 3693929129361495281L;
        kg.lhse[92] = 120543459267588133L;
        kg.lhse[93] = 1977779969277298134L;
        kg.lhse[94] = 5334684503982797218L;
        kg.lhse[95] = 8577961164075971189L;
        kg.lhse[96] = 2252361829613432930L;
        kg.lhse[97] = 8582271185902675760L;
        kg.lhse[98] = 3611671254543946432L;
        kg.lhse[99] = 6471212703014119684L;
    }

    private static /* synthetic */ void ligz() {
        kg.lhrr[100] = 740594374;
        kg.lhrr[101] = 73502886;
        kg.lhrr[102] = 367904907;
        kg.lhrr[103] = 1180125345;
        kg.lhrr[104] = 35327362;
        kg.lhrr[105] = -376467813;
        kg.lhrr[106] = 46351199;
        kg.lhrr[107] = -1210897714;
        kg.lhrr[108] = 221501993;
        kg.lhrr[109] = 1923836806;
        kg.lhrr[110] = 719457794;
        kg.lhrr[111] = 1699231022;
        kg.lhrr[112] = -1377214143;
        kg.lhrr[113] = -424624272;
        kg.lhrr[114] = -892658709;
        kg.lhrr[115] = -2043736920;
        kg.lhrr[116] = -951298916;
        kg.lhrr[117] = 894544624;
        kg.lhrr[118] = -883296675;
        kg.lhrr[119] = 1754549951;
        kg.lhrr[120] = -1005891348;
        kg.lhrr[121] = 1864565698;
        kg.lhrr[122] = -252991712;
        kg.lhrr[123] = -151495300;
        kg.lhrr[124] = -1335377858;
        kg.lhrr[125] = -1039041572;
        kg.lhrr[126] = -670295401;
        kg.lhrr[127] = -1351198859;
        kg.lhrr[128] = -958234070;
        kg.lhrr[129] = -1203212770;
        kg.lhrr[130] = 426303695;
        kg.lhrr[131] = 771235082;
        kg.lhrr[132] = 1023025703;
        kg.lhrr[133] = 1646454292;
        kg.lhrr[134] = 1061439472;
        kg.lhrr[135] = 897806237;
        kg.lhrr[136] = -388343125;
        kg.lhrr[137] = -905210969;
        kg.lhrr[138] = -79006646;
        kg.lhrr[139] = 1333026730;
        kg.lhrr[140] = 1847072785;
        kg.lhrr[141] = 645082750;
        kg.lhrr[142] = -247574640;
        kg.lhrr[143] = -191397226;
        kg.lhrr[144] = -468051283;
        kg.lhrr[145] = 661126038;
        kg.lhrr[146] = 194898493;
        kg.lhrr[147] = -1550806389;
        kg.lhrr[148] = 1580096288;
        kg.lhrr[149] = -1977202932;
        kg.lhrr[150] = 1459258535;
        kg.lhrr[151] = 476326830;
        kg.lhrr[152] = -696175349;
        kg.lhrr[153] = -2109144993;
        kg.lhrr[154] = 366002961;
        kg.lhrr[155] = 607334788;
        kg.lhrr[156] = -1158991711;
        kg.lhrr[157] = 272881919;
        kg.lhrr[158] = -97463732;
        kg.lhrr[159] = -83217111;
        kg.lhrr[160] = -761845504;
        kg.lhrr[161] = 1978095347;
        kg.lhrr[162] = -1669400138;
        kg.lhrr[163] = 1222546516;
        kg.lhrr[164] = -337984407;
        kg.lhrr[165] = -896296104;
        kg.lhrr[166] = 693174852;
        kg.lhrr[167] = 1651264512;
        kg.lhrr[168] = -1505256867;
        kg.lhrr[169] = 385009653;
        kg.lhrr[170] = -644402832;
        kg.lhrr[171] = 1304007424;
        kg.lhrr[172] = 1161449722;
        kg.lhrr[173] = -917547179;
        kg.lhrr[174] = -820132365;
        kg.lhrr[175] = -1787393858;
        kg.lhrr[176] = 1499442222;
        kg.lhrr[177] = 457249039;
        kg.lhrr[178] = 1022389921;
        kg.lhrr[179] = 668496402;
        kg.lhrr[180] = -986346703;
        kg.lhrr[181] = -125927054;
        kg.lhrr[182] = -239612820;
        kg.lhrr[183] = -824490503;
        kg.lhrr[184] = -1389747700;
        kg.lhrr[185] = 392331765;
        kg.lhrr[186] = -1112718214;
        kg.lhrr[187] = 1689714172;
        kg.lhrr[188] = 1027265960;
        kg.lhrr[189] = 769094991;
        kg.lhrr[190] = -1140468351;
        kg.lhrr[191] = -1308226968;
        kg.lhrr[192] = 135128405;
        kg.lhrr[193] = 927943410;
        kg.lhrr[194] = -1870088704;
        kg.lhrr[195] = -784947586;
        kg.lhrr[196] = 1846554447;
        kg.lhrr[197] = 1622493690;
        kg.lhrr[198] = 1299468877;
        kg.lhrr[199] = 146761025;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kg visible(Supplier<Boolean> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("lhyw", lhsd(int ), (int)82)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kg.lhrs("lhyx", lhru(int ), (int)99)) break;
            v0 /* !! */  = (long)kg.lhrs("lhyy", lhru(int ), (int)100);
        }
        var4_2 = kg.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lhyz", lhsd(int ), (int)83)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == kg.lhrs("lhza", lhru(int ), (int)101)) break;
            v1 /* !! */  = (long)kg.lhrs("lhzb", lhru(int ), (int)102);
        }
        var3_3 /* !! */  = kg.b;
        v2 /* !! */  = kg.tv;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(v3 - kg.lhrs("lhzc", lhsd(int ), (int)84));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1396225747: {
                    break block20;
                }
                case -1349285675: {
                    v3 = kg.lhrs("lhzd", lhsd(int ), (int)85);
                    continue block20;
                }
                case -184938204: {
                    v3 = kg.lhrs("lhze", lhsd(int ), (int)86);
                    continue block20;
                }
            }
            break;
        }
        var2_4 = kg.a;
        if (var4_2) {
            throw null;
lbl31:
            // 3 sources

            return null;
        }
        if (var2_4 || var2_4) ** GOTO lbl31
        v4 /* !! */  = kg.tv;
        if (true) ** GOTO lbl38
        block22: while (true) {
            v4 /* !! */  = (long)(v5 - kg.lhrs("lhzf", lhsd(int ), (int)87));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1396225747: {
                    break block22;
                }
                case -870772776: {
                    v5 = kg.lhrs("lhzg", lhsd(int ), (int)88);
                    continue block22;
                }
                case 875047689: {
                    v5 = kg.lhrs("lhzh", lhsd(int ), (int)89);
                    continue block22;
                }
            }
            break;
        }
        this.setVisible(var1_1);
        if (var2_4) ** GOTO lbl31
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return this;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kg.lhrs("lhzi", lhru(int ), (int)103);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl69
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)kg.lhrs("lhzj", lhru(int ), (int)104);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)kg.lhrs("lhzk", lhru(int ), (int)105);
                if (var4_2) {
                    throw null;
                }
            }
lbl69:
            // 4 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)kg.lhrs("lhzl", lhru(int ), (int)106);
                } while (!var4_2);
                throw null;
            }
            case 4: {
                do {
                    var3_3 /* !! */  = (int)kg.lhrs("lhzm", lhru(int ), (int)107);
                } while (!var4_2);
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kg.lhrs("lhzn", lhru(int ), (int)108);
        ** while (!var4_2)
lbl82:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void liha() {
        kg.lhrr[200] = -2063707428;
        kg.lhrr[201] = -1024310500;
        kg.lhrr[202] = 1575701042;
        kg.lhrr[203] = 29916216;
        kg.lhrr[204] = 180806518;
        kg.lhrr[205] = 465969507;
        kg.lhrr[206] = 967555965;
        kg.lhrr[207] = -477250312;
        kg.lhrr[208] = 110726394;
        kg.lhrr[209] = 1613635316;
        kg.lhrr[210] = -197240130;
        kg.lhrr[211] = -420864238;
        kg.lhrr[212] = -1739379697;
        kg.lhrr[213] = 421805567;
        kg.lhrr[214] = -1326896357;
        kg.lhrr[215] = 1536277345;
        kg.lhrr[216] = 634617573;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setValue(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("lhsg", lhsd(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == kg.lhrs("lhsh", lhru(int ), (int)9)) break;
            v0 /* !! */  = (long)kg.lhrs("lhsi", lhru(int ), (int)10);
        }
        var4_2 = kg.c;
        v1 /* !! */  = kg.tv;
        if (true) ** GOTO lbl11
        block31: while (true) {
            v1 /* !! */  = (long)(v2 - kg.lhrs("lhsj", lhsd(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1442750207: {
                    v2 = kg.lhrs("lhsk", lhsd(int ), (int)2);
                    continue block31;
                }
                case -1396225747: {
                    break block31;
                }
                case -48753003: {
                    v2 = kg.lhrs("lhsl", lhsd(int ), (int)3);
                    continue block31;
                }
                case 59527860: {
                    v2 = kg.lhrs("lhsm", lhsd(int ), (int)4);
                    continue block31;
                }
            }
            break;
        }
        var3_3 /* !! */  = kg.b;
        v3 /* !! */  = kg.tv;
        if (true) ** GOTO lbl28
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - kg.lhrs("lhsn", lhsd(int ), (int)5));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1782266750: {
                    v4 = kg.lhrs("lhso", lhsd(int ), (int)6);
                    continue block32;
                }
                case -1396225747: {
                    break block32;
                }
                case -687392406: {
                    v4 = kg.lhrs("lhsp", lhsd(int ), (int)7);
                    continue block32;
                }
                case -283388786: {
                    v4 = kg.lhrs("lhsq", lhsd(int ), (int)8);
                    continue block32;
                }
            }
            break;
        }
        var2_4 = kg.a;
        if (var4_2) {
            throw null;
lbl43:
            // 2 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl43
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lhsr", lhsd(int ), (int)9)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == kg.lhrs("lhss", lhru(int ), (int)11)) break;
            v5 /* !! */  = (long)kg.lhrs("lhst", lhru(int ), (int)12);
        }
        v6 /* !! */  = kg.tv;
        if (true) ** GOTO lbl55
        block35: while (true) {
            v6 /* !! */  = (long)(v7 - kg.lhrs("lhsu", lhsd(int ), (int)10));
lbl55:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1396225747: {
                    break block35;
                }
                case -1273280417: {
                    v7 = kg.lhrs("lhsv", lhsd(int ), (int)11);
                    continue block35;
                }
                case -296157315: {
                    v7 = kg.lhrs("lhsw", lhsd(int ), (int)12);
                    continue block35;
                }
                case 1391889829: {
                    v7 = kg.lhrs("lhsx", lhsd(int ), (int)13);
                    continue block35;
                }
            }
            break;
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = kg.tv - kg.lhrs("lhsy", lhsd(int ), (int)14)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == kg.lhrs("lhsz", lhru(int ), (int)13)) break;
            v8 /* !! */  = (long)kg.lhrs("lhta", lhru(int ), (int)14);
        }
        v9 = Math.min(this.max, var1_1);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = kg.tv - kg.lhrs("lhtb", lhsd(int ), (int)15)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == kg.lhrs("lhtc", lhru(int ), (int)15)) break;
            v10 /* !! */  = (long)kg.lhrs("lhtd", lhru(int ), (int)16);
        }
        v11 = Math.max(this.min, v9);
        v12 /* !! */  = kg.tv;
        if (true) ** GOTO lbl83
        block38: while (true) {
            v12 /* !! */  = (long)(kg.lhrs("lhtf", lhsd(int ), (int)17) - kg.lhrs("lhte", lhsd(int ), (int)16));
lbl83:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1396225747: {
                    break block38;
                }
                case 1939607479: {
                    continue block38;
                }
            }
            break;
        }
        this.value = v11;
        ** while (var2_4 || var2_4)
lbl90:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block22 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)kg.lhrs("lhtg", lhru(int ), (int)17);
                    if (!var4_2) break block22;
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)kg.lhrs("lhth", lhru(int ), (int)18);
                if (var4_2) {
                    throw null;
                }
            }
lbl103:
            // 5 sources

            case 2: {
                var3_3 /* !! */  = (int)kg.lhrs("lhti", lhru(int ), (int)19);
                if (var4_2) {
                    throw null;
                }
            }
            case 3: {
                var3_3 /* !! */  = (int)kg.lhrs("lhtj", lhru(int ), (int)20);
                if (!var4_2) ** GOTO lbl103
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)kg.lhrs("lhtk", lhru(int ), (int)21);
                if (!var4_2) ** GOTO lbl103
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)kg.lhrs("lhtl", lhru(int ), (int)22);
        ** while (!var4_2)
lbl118:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ligx() {
        kg.lhrq[200] = 1682973917;
        kg.lhrq[201] = -1024310499;
        kg.lhrq[202] = 1575701046;
        kg.lhrq[203] = 29916220;
        kg.lhrq[204] = 180806518;
        kg.lhrq[205] = 465969504;
        kg.lhrq[206] = 967555964;
        kg.lhrq[207] = 1352825910;
        kg.lhrq[208] = -110726395;
        kg.lhrq[209] = 847192118;
        kg.lhrq[210] = -197240129;
        kg.lhrq[211] = 1758917236;
        kg.lhrq[212] = -1739379698;
        kg.lhrq[213] = 421805563;
        kg.lhrq[214] = -1326896358;
        kg.lhrq[215] = 1536277345;
        kg.lhrq[216] = 634617572;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isInteger() {
        v0 /* !! */  = kg.tv;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - kg.lhrs("licw", lhsd(int ), (int)128));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1396225747: {
                    break block17;
                }
                case -1331803696: {
                    v1 = kg.lhrs("licx", lhsd(int ), (int)129);
                    continue block17;
                }
                case 294387786: {
                    v1 = kg.lhrs("licy", lhsd(int ), (int)130);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = kg.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = kg.tv - kg.lhrs("licz", lhsd(int ), (int)131)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kg.lhrs("lida", lhru(int ), (int)157)) break;
            v2 /* !! */  = (long)kg.lhrs("lidb", lhru(int ), (int)158);
        }
        var2_2 /* !! */  = kg.b;
        v3 /* !! */  = kg.tv;
        if (true) ** GOTO lbl26
        block19: while (true) {
            v3 /* !! */  = (long)(v4 - kg.lhrs("lidc", lhsd(int ), (int)132));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1396225747: {
                    break block19;
                }
                case -640109299: {
                    v4 = kg.lhrs("lidd", lhsd(int ), (int)133);
                    continue block19;
                }
                case -587077517: {
                    v4 = kg.lhrs("lide", lhsd(int ), (int)134);
                    continue block19;
                }
                case 1544791018: {
                    v4 = kg.lhrs("lidf", lhsd(int ), (int)135);
                    continue block19;
                }
            }
            break;
        }
        var1_3 = kg.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return (boolean)kg.lhrs("lidg", lhru(int ), (int)159);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kg.tv - kg.lhrs("lidh", lhsd(int ), (int)136)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == kg.lhrs("lidi", lhru(int ), (int)160)) break;
                    v5 /* !! */  = (long)kg.lhrs("lidj", lhru(int ), (int)161);
                }
                return this.integer;
            }
            case 0: {
                var2_2 /* !! */  = (int)kg.lhrs("lidk", lhru(int ), (int)162);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)kg.lhrs("lidl", lhru(int ), (int)163);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)kg.lhrs("lidm", lhru(int ), (int)164);
                    if (!var3_1) break block11;
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)kg.lhrs("lidn", lhru(int ), (int)165);
        ** while (!var3_1)
lbl71:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int lhru(int n2) {
        return lhrq[n2] ^ lhrr[n2];
    }

    public static /* synthetic */ CallSite lhrs(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long lhsd(int n2) {
        return lhse[n2] ^ lhsf[n2];
    }

    private static /* synthetic */ void ligy() {
        kg.lhrr[0] = -2016183484;
        kg.lhrr[1] = 985522842;
        kg.lhrr[2] = 479461238;
        kg.lhrr[3] = -2119173839;
        kg.lhrr[4] = -1188835537;
        kg.lhrr[5] = -3057892;
        kg.lhrr[6] = 1421198408;
        kg.lhrr[7] = 1717225217;
        kg.lhrr[8] = 1005446166;
        kg.lhrr[9] = 184374153;
        kg.lhrr[10] = -1799859677;
        kg.lhrr[11] = 1287130748;
        kg.lhrr[12] = 146250124;
        kg.lhrr[13] = 1891245754;
        kg.lhrr[14] = 413006571;
        kg.lhrr[15] = -1496372812;
        kg.lhrr[16] = 1611897073;
        kg.lhrr[17] = -1438132502;
        kg.lhrr[18] = 2049145581;
        kg.lhrr[19] = 2119972142;
        kg.lhrr[20] = 153829663;
        kg.lhrr[21] = -572029189;
        kg.lhrr[22] = -1808145576;
        kg.lhrr[23] = 178121627;
        kg.lhrr[24] = 1568237894;
        kg.lhrr[25] = 1593574200;
        kg.lhrr[26] = -925538844;
        kg.lhrr[27] = -1403249625;
        kg.lhrr[28] = -205921019;
        kg.lhrr[29] = -1486140233;
        kg.lhrr[30] = -129942495;
        kg.lhrr[31] = 1760125282;
        kg.lhrr[32] = -1910179639;
        kg.lhrr[33] = 785564075;
        kg.lhrr[34] = 1281510763;
        kg.lhrr[35] = -190023172;
        kg.lhrr[36] = 1101467822;
        kg.lhrr[37] = -1923054138;
        kg.lhrr[38] = 1114126951;
        kg.lhrr[39] = 423722188;
        kg.lhrr[40] = -1848707276;
        kg.lhrr[41] = -1522626063;
        kg.lhrr[42] = 1834574855;
        kg.lhrr[43] = -1277826838;
        kg.lhrr[44] = 768536777;
        kg.lhrr[45] = 1225794628;
        kg.lhrr[46] = -1315871807;
        kg.lhrr[47] = 1264863222;
        kg.lhrr[48] = 1506467442;
        kg.lhrr[49] = 553602808;
        kg.lhrr[50] = 396639388;
        kg.lhrr[51] = -1105450078;
        kg.lhrr[52] = 936861844;
        kg.lhrr[53] = 1435345606;
        kg.lhrr[54] = 413281228;
        kg.lhrr[55] = 1211806290;
        kg.lhrr[56] = 1068900732;
        kg.lhrr[57] = -16410030;
        kg.lhrr[58] = -1823178203;
        kg.lhrr[59] = -1333898075;
        kg.lhrr[60] = 742675455;
        kg.lhrr[61] = 209601625;
        kg.lhrr[62] = -896731680;
        kg.lhrr[63] = 974360836;
        kg.lhrr[64] = 1745870452;
        kg.lhrr[65] = 979874186;
        kg.lhrr[66] = 500967089;
        kg.lhrr[67] = -1281995290;
        kg.lhrr[68] = -1979052962;
        kg.lhrr[69] = -829752876;
        kg.lhrr[70] = 82957579;
        kg.lhrr[71] = -465998304;
        kg.lhrr[72] = 1136502806;
        kg.lhrr[73] = 421180676;
        kg.lhrr[74] = 546576867;
        kg.lhrr[75] = -1387364847;
        kg.lhrr[76] = -107683250;
        kg.lhrr[77] = 1863080760;
        kg.lhrr[78] = 1788692121;
        kg.lhrr[79] = -2031864995;
        kg.lhrr[80] = 1042165204;
        kg.lhrr[81] = 25438094;
        kg.lhrr[82] = -908624855;
        kg.lhrr[83] = 191977048;
        kg.lhrr[84] = 128326938;
        kg.lhrr[85] = 602116;
        kg.lhrr[86] = 287407630;
        kg.lhrr[87] = -851710580;
        kg.lhrr[88] = -1781355773;
        kg.lhrr[89] = -756546527;
        kg.lhrr[90] = 1187274963;
        kg.lhrr[91] = 1034343099;
        kg.lhrr[92] = -2133164470;
        kg.lhrr[93] = -252974037;
        kg.lhrr[94] = -1348006388;
        kg.lhrr[95] = -860181423;
        kg.lhrr[96] = 1610033129;
        kg.lhrr[97] = 76246937;
        kg.lhrr[98] = -1840231725;
        kg.lhrr[99] = 64488014;
    }
}

