/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import ruhack.phobia.ak;
import ruhack.phobia.dk;

public final class dl {
    public static final int b;
    private static long[] bxep;
    private static long[] bxen;
    private static final List<dk> friends;
    private static final long eq = 2566515144851199891L;
    public static final boolean c;
    private static int[] bxfa;
    public static final boolean a;
    private static int[] bxey;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void addFriend(String var0) {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block38: while (true) {
            v0 /* !! */  = (long)(v1 - dl.bxet("bxgy", bxek(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1219256180: {
                    v1 = dl.bxet("bxha", bxek(int ), (int)10);
                    continue block38;
                }
                case -799547902: {
                    v1 = dl.bxet("bxhc", bxek(int ), (int)11);
                    continue block38;
                }
                case 528750483: {
                    break block38;
                }
                case 2088097657: {
                    v1 = dl.bxet("bxhe", bxek(int ), (int)12);
                    continue block38;
                }
            }
            break;
        }
        var3_1 = dl.c;
        v2 /* !! */  = dl.eq;
        if (true) ** GOTO lbl22
        block39: while (true) {
            v2 /* !! */  = (long)(dl.bxet("bxhk", bxek(int ), (int)14) - dl.bxet("bxhg", bxek(int ), (int)13));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 528750483: {
                    break block39;
                }
                case 776705626: {
                    continue block39;
                }
            }
            break;
        }
        var2_2 /* !! */  = dl.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxhl", bxek(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dl.bxet("bxhm", bxew(int ), (int)14)) break;
                    v3 /* !! */  = (long)dl.bxet("bxhn", bxew(int ), (int)15);
                }
                var1_3 = dl.a;
                if (var3_1) {
                    throw null;
lbl39:
                    // 4 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl39
                v4 /* !! */  = dl.eq;
                if (true) ** GOTO lbl46
                block42: while (true) {
                    v4 /* !! */  = (long)(v5 - dl.bxet("bxhp", bxek(int ), (int)16));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1746748528: {
                            v5 = dl.bxet("bxhq", bxek(int ), (int)17);
                            continue block42;
                        }
                        case -1453069553: {
                            v5 = dl.bxet("bxhr", bxek(int ), (int)18);
                            continue block42;
                        }
                        case 528750483: {
                            break block42;
                        }
                    }
                    break;
                }
                if (dl.isFriend(var0)) ** GOTO lbl103
                if (var1_3 || var1_3) ** GOTO lbl39
                v6 /* !! */  = dl.eq;
                if (true) ** GOTO lbl61
                block43: while (true) {
                    v6 /* !! */  = (long)(v7 - dl.bxet("bxhs", bxek(int ), (int)19));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1643874792: {
                            v7 = dl.bxet("bxht", bxek(int ), (int)20);
                            continue block43;
                        }
                        case 528750483: {
                            break block43;
                        }
                        case 1215818792: {
                            v7 = dl.bxet("bxhu", bxek(int ), (int)21);
                            continue block43;
                        }
                        case 2131706009: {
                            v7 = dl.bxet("bxhv", bxek(int ), (int)22);
                            continue block43;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxhw", bxek(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == dl.bxet("bxhx", bxew(int ), (int)16)) break;
                    v8 /* !! */  = (long)dl.bxet("bxhy", bxew(int ), (int)17);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxia", bxek(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dl.bxet("bxib", bxew(int ), (int)18)) break;
                    v9 /* !! */  = (long)dl.bxet("bxid", bxew(int ), (int)19);
                }
                v10 = new dk(var0);
                v11 /* !! */  = dl.eq;
                if (true) ** GOTO lbl88
                block46: while (true) {
                    v11 /* !! */  = (long)(v12 - dl.bxet("bxih", bxek(int ), (int)25));
lbl88:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1982154168: {
                            v12 = dl.bxet("bxij", bxek(int ), (int)26);
                            continue block46;
                        }
                        case 528750483: {
                            break block46;
                        }
                        case 767461772: {
                            v12 = dl.bxet("bxil", bxek(int ), (int)27);
                            continue block46;
                        }
                        case 771202923: {
                            v12 = dl.bxet("bxin", bxek(int ), (int)28);
                            continue block46;
                        }
                    }
                    break;
                }
                dl.friends.add(v10);
                if (var1_3) ** GOTO lbl39
lbl103:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl106:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dl.bxet("bxip", bxew(int ), (int)20);
                if (!var3_1) break;
                throw null;
            }
lbl110:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dl.bxet("bxiq", bxew(int ), (int)21);
                    if (!var3_1) ** GOTO lbl106
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)dl.bxet("bxiu", bxew(int ), (int)22);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)dl.bxet("bxiw", bxew(int ), (int)23);
                } while (!var3_1);
                throw null;
            }
lbl125:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)dl.bxet("bxiz", bxew(int ), (int)24);
                if (var3_1) {
                    throw null;
                }
            }
lbl129:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)dl.bxet("bxjb", bxew(int ), (int)25);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
lbl133:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)dl.bxet("bxjd", bxew(int ), (int)26);
                if (!var3_1) ** GOTO lbl110
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)dl.bxet("bxje", bxew(int ), (int)27);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)dl.bxet("bxjh", bxew(int ), (int)28);
        ** while (!var3_1)
lbl144:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isFriend(class_1297 var0) {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - dl.bxet("bxpz", bxek(int ), (int)76));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1448793076: {
                    v1 = dl.bxet("bxqa", bxek(int ), (int)77);
                    continue block24;
                }
                case -1392800602: {
                    v1 = dl.bxet("bxqb", bxek(int ), (int)78);
                    continue block24;
                }
                case -502770094: {
                    v1 = dl.bxet("bxqc", bxek(int ), (int)79);
                    continue block24;
                }
                case 528750483: {
                    break block24;
                }
            }
            break;
        }
        var4_1 = dl.c;
        v2 /* !! */  = dl.eq;
        if (true) ** GOTO lbl22
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - dl.bxet("bxqd", bxek(int ), (int)80));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2124961487: {
                    v3 = dl.bxet("bxqe", bxek(int ), (int)81);
                    continue block25;
                }
                case -1676297252: {
                    v3 = dl.bxet("bxqf", bxek(int ), (int)82);
                    continue block25;
                }
                case 528750483: {
                    break block25;
                }
                case 1347326586: {
                    v3 = dl.bxet("bxqg", bxek(int ), (int)83);
                    continue block25;
                }
            }
            break;
        }
        var3_2 /* !! */  = dl.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxqh", bxek(int ), (int)84)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == dl.bxet("bxqi", bxew(int ), (int)83)) break;
            v4 /* !! */  = (long)dl.bxet("bxqj", bxew(int ), (int)84);
        }
        var2_3 = dl.a;
        if (var4_1) {
            throw null;
lbl43:
            // 4 sources

            return (boolean)dl.bxet("bxqk", bxew(int ), (int)85);
        }
        if (var2_3 || var2_3) ** GOTO lbl43
        if (!(var0 instanceof class_1657)) ** GOTO lbl71
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl43
                var1_4 = (class_1657)var0;
                if (var2_3 || var2_3) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxql", bxek(int ), (int)85)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dl.bxet("bxqm", bxew(int ), (int)86)) break;
                    v5 /* !! */  = (long)dl.bxet("bxqn", bxew(int ), (int)87);
                }
                v6 = var1_4.method_5477();
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxqo", bxek(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == dl.bxet("bxqp", bxew(int ), (int)88)) break;
                    v7 /* !! */  = (long)dl.bxet("bxqq", bxew(int ), (int)89);
                }
                v8 = v6.getString();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = dl.eq - dl.bxet("bxqr", bxek(int ), (int)87)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dl.bxet("bxqs", bxew(int ), (int)90)) break;
                    v9 /* !! */  = (long)dl.bxet("bxqt", bxew(int ), (int)91);
                }
                return dl.isFriend(v8);
            }
lbl71:
            // 1 sources

            if (!var2_3 && !var2_3) ** break;
            ** continue;
            return (boolean)dl.bxet("bxqu", bxew(int ), (int)92);
lbl74:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)dl.bxet("bxqv", bxew(int ), (int)93);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl84
            }
lbl79:
            // 2 sources

            case 1: {
                var3_2 /* !! */  = (int)dl.bxet("bxqw", bxew(int ), (int)94);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl89
            }
lbl84:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)dl.bxet("bxqx", bxew(int ), (int)95);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl89:
            // 3 sources

            case 3: {
                var3_2 /* !! */  = (int)dl.bxet("bxqy", bxew(int ), (int)96);
                if (!var4_1) ** GOTO lbl84
                throw null;
            }
lbl93:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)dl.bxet("bxqz", bxew(int ), (int)97);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl103
                    break;
                }
            }
            case 5: {
                var3_2 /* !! */  = (int)dl.bxet("bxra", bxew(int ), (int)98);
                if (var4_1) {
                    throw null;
                }
            }
lbl103:
            // 4 sources

            case 6: {
                var3_2 /* !! */  = (int)dl.bxet("bxrb", bxew(int ), (int)99);
                if (!var4_1) ** GOTO lbl89
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)dl.bxet("bxrc", bxew(int ), (int)100);
                if (!var4_1) ** GOTO lbl79
                throw null;
            }
            case 8: {
                var3_2 /* !! */  = (int)dl.bxet("bxrd", bxew(int ), (int)101);
                if (!var4_1) ** GOTO lbl74
                throw null;
            }
            case 9: 
        }
        var3_2 /* !! */  = (int)dl.bxet("bxre", bxew(int ), (int)102);
        ** while (!var4_1)
lbl118:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void clear() {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(dl.bxet("bxsh", bxek(int ), (int)103) - dl.bxet("bxsg", bxek(int ), (int)102));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -856349670: {
                    continue block23;
                }
                case 528750483: {
                    break block23;
                }
            }
            break;
        }
        var2 = dl.c;
        v1 /* !! */  = dl.eq;
        if (true) ** GOTO lbl15
        block24: while (true) {
            v1 /* !! */  = (long)(v2 - dl.bxet("bxsi", bxek(int ), (int)104));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1044583703: {
                    v2 = dl.bxet("bxsj", bxek(int ), (int)105);
                    continue block24;
                }
                case -976449881: {
                    v2 = dl.bxet("bxsk", bxek(int ), (int)106);
                    continue block24;
                }
                case -222915782: {
                    v2 = dl.bxet("bxsl", bxek(int ), (int)107);
                    continue block24;
                }
                case 528750483: {
                    break block24;
                }
            }
            break;
        }
        var1_1 /* !! */  = dl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxsm", bxek(int ), (int)108)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dl.bxet("bxsn", bxew(int ), (int)116)) break;
            v3 /* !! */  = (long)dl.bxet("bxso", bxew(int ), (int)117);
        }
        var0_2 = dl.a;
        if (var2) {
            throw null;
lbl36:
            // 2 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl36
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = dl.eq;
                if (true) ** GOTO lbl46
                block27: while (true) {
                    v4 /* !! */  = (long)(v5 - dl.bxet("bxsp", bxek(int ), (int)109));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1550440913: {
                            v5 = dl.bxet("bxsq", bxek(int ), (int)110);
                            continue block27;
                        }
                        case -894567188: {
                            v5 = dl.bxet("bxsr", bxek(int ), (int)111);
                            continue block27;
                        }
                        case 528750483: {
                            break block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxss", bxek(int ), (int)112)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == dl.bxet("bxst", bxew(int ), (int)118)) break;
                    v6 /* !! */  = (long)dl.bxet("bxsu", bxew(int ), (int)119);
                }
                dl.friends.clear();
                if (var0_2 || var0_2) ** continue;
                return;
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)dl.bxet("bxsv", bxew(int ), (int)120);
                } while (!var2);
                throw null;
            }
lbl68:
            // 3 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)dl.bxet("bxsw", bxew(int ), (int)121);
                } while (!var2);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)dl.bxet("bxsx", bxew(int ), (int)122);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var1_1 /* !! */  = (int)dl.bxet("bxsy", bxew(int ), (int)123);
                if (!var2) ** GOTO lbl68
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)dl.bxet("bxsz", bxew(int ), (int)124);
                if (!var2) ** GOTO lbl68
                throw null;
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)dl.bxet("bxta", bxew(int ), (int)125);
        ** while (!var2)
lbl89:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxzf() {
        dl.bxey[100] = 2048735082;
        dl.bxey[101] = 94059505;
        dl.bxey[102] = 611596903;
        dl.bxey[103] = 1398196916;
        dl.bxey[104] = -2109789005;
        dl.bxey[105] = -737892543;
        dl.bxey[106] = -2019045837;
        dl.bxey[107] = -1720954895;
        dl.bxey[108] = -1637828056;
        dl.bxey[109] = -712890734;
        dl.bxey[110] = -2016145026;
        dl.bxey[111] = 1767440672;
        dl.bxey[112] = 1317521887;
        dl.bxey[113] = -1529337379;
        dl.bxey[114] = 512453425;
        dl.bxey[115] = 2094936953;
        dl.bxey[116] = -888331249;
        dl.bxey[117] = -939665189;
        dl.bxey[118] = -856302321;
        dl.bxey[119] = 1200950126;
        dl.bxey[120] = 1701384219;
        dl.bxey[121] = 27390108;
        dl.bxey[122] = 1920978928;
        dl.bxey[123] = -1766976395;
        dl.bxey[124] = 332492972;
        dl.bxey[125] = 1798525905;
        dl.bxey[126] = 249608663;
        dl.bxey[127] = -1651507155;
        dl.bxey[128] = -1381237101;
        dl.bxey[129] = -2121479535;
        dl.bxey[130] = -74256793;
        dl.bxey[131] = -406703735;
        dl.bxey[132] = -1174483657;
        dl.bxey[133] = -1535037298;
        dl.bxey[134] = -142406073;
        dl.bxey[135] = 1403145008;
        dl.bxey[136] = -1651694570;
        dl.bxey[137] = 2103877639;
        dl.bxey[138] = -1061447438;
        dl.bxey[139] = -807334882;
        dl.bxey[140] = 1911402502;
        dl.bxey[141] = 360290666;
        dl.bxey[142] = -1965778333;
        dl.bxey[143] = 1071031557;
        dl.bxey[144] = -947252744;
        dl.bxey[145] = -997067076;
        dl.bxey[146] = 2080566131;
        dl.bxey[147] = -631391968;
        dl.bxey[148] = 1059418434;
        dl.bxey[149] = 2031304613;
        dl.bxey[150] = -1229452526;
        dl.bxey[151] = 712384898;
        dl.bxey[152] = -807508684;
        dl.bxey[153] = -977565594;
        dl.bxey[154] = -284985974;
        dl.bxey[155] = 490123394;
        dl.bxey[156] = -95633772;
        dl.bxey[157] = -542085363;
        dl.bxey[158] = -27523800;
        dl.bxey[159] = -1874344104;
        dl.bxey[160] = -1549365615;
        dl.bxey[161] = -934746429;
        dl.bxey[162] = 1737671692;
        dl.bxey[163] = 974782153;
        dl.bxey[164] = -263685490;
        dl.bxey[165] = -1235299602;
        dl.bxey[166] = 361451467;
        dl.bxey[167] = 1560891514;
        dl.bxey[168] = 2071154878;
        dl.bxey[169] = -450850631;
        dl.bxey[170] = -241608959;
        dl.bxey[171] = 1669590846;
        dl.bxey[172] = -351069339;
        dl.bxey[173] = 498675579;
        dl.bxey[174] = 1939827367;
        dl.bxey[175] = -1335214893;
        dl.bxey[176] = -870947319;
        dl.bxey[177] = 101367818;
        dl.bxey[178] = 1592100500;
        dl.bxey[179] = 1662855586;
        dl.bxey[180] = 1819209535;
        dl.bxey[181] = 2048847410;
        dl.bxey[182] = -368411539;
        dl.bxey[183] = -1922441948;
        dl.bxey[184] = 1956871263;
        dl.bxey[185] = -365611848;
        dl.bxey[186] = 223868080;
        dl.bxey[187] = 1649506667;
        dl.bxey[188] = -1921484940;
        dl.bxey[189] = -555110963;
        dl.bxey[190] = -1477141895;
        dl.bxey[191] = -1489156913;
        dl.bxey[192] = 1728443806;
        dl.bxey[193] = -896354654;
        dl.bxey[194] = -1224837735;
        dl.bxey[195] = -1141672700;
        dl.bxey[196] = -382795911;
        dl.bxey[197] = 380381033;
        dl.bxey[198] = 644513979;
        dl.bxey[199] = -105738489;
    }

    private static /* synthetic */ void bxzn() {
        dl.bxep[100] = -3919020855797963894L;
        dl.bxep[101] = 7427502139164211781L;
        dl.bxep[102] = 2789361788253009974L;
        dl.bxep[103] = -496692494461743810L;
        dl.bxep[104] = -1433941018502514942L;
        dl.bxep[105] = 4705034158745642377L;
        dl.bxep[106] = 2297516890982793969L;
        dl.bxep[107] = 557336977489814019L;
        dl.bxep[108] = 8826775407883571475L;
        dl.bxep[109] = -4732069280799461768L;
        dl.bxep[110] = -8428700227848830420L;
        dl.bxep[111] = 8153830404334573078L;
        dl.bxep[112] = 722212657164713026L;
        dl.bxep[113] = 6073098092249813797L;
        dl.bxep[114] = -5706644799405621896L;
        dl.bxep[115] = -1811559690945760390L;
        dl.bxep[116] = -3152770032018852956L;
        dl.bxep[117] = 7560462898639530669L;
        dl.bxep[118] = 2681117057172417494L;
        dl.bxep[119] = -4791210554859422411L;
        dl.bxep[120] = 1237302394258106913L;
        dl.bxep[121] = 3416780594351575069L;
        dl.bxep[122] = 970793527079344264L;
        dl.bxep[123] = -227801024140934609L;
        dl.bxep[124] = 371497429249159585L;
        dl.bxep[125] = 3972555966261421384L;
        dl.bxep[126] = -1739894338512142176L;
        dl.bxep[127] = -4028520757368552016L;
        dl.bxep[128] = -8073902139527474399L;
        dl.bxep[129] = 8029229241264878874L;
        dl.bxep[130] = 4579649577251238339L;
        dl.bxep[131] = -5848452053211909593L;
        dl.bxep[132] = 4506041666540484475L;
        dl.bxep[133] = 5823122821162508041L;
        dl.bxep[134] = 4138496352215352799L;
        dl.bxep[135] = -6762956999372239507L;
        dl.bxep[136] = -588057889589718865L;
        dl.bxep[137] = -1051118563658644485L;
        dl.bxep[138] = 415347540952125799L;
        dl.bxep[139] = -4347254355377192774L;
        dl.bxep[140] = -516054849809677085L;
        dl.bxep[141] = 384577009700461703L;
        dl.bxep[142] = -823802755774433354L;
        dl.bxep[143] = -2994184755713015568L;
        dl.bxep[144] = 2614295979290288734L;
        dl.bxep[145] = 4450817001833382967L;
        dl.bxep[146] = 2333287398879636916L;
        dl.bxep[147] = -6224778135130552821L;
        dl.bxep[148] = -8625600937165661387L;
        dl.bxep[149] = 4610271039086900815L;
        dl.bxep[150] = -8332589310792030321L;
        dl.bxep[151] = -3497568060352401676L;
        dl.bxep[152] = 6049091346246135431L;
        dl.bxep[153] = -3450140289837769545L;
        dl.bxep[154] = 6788930590560625827L;
        dl.bxep[155] = -7616891377430307873L;
        dl.bxep[156] = -6103193566319437036L;
        dl.bxep[157] = -7864600364380069989L;
        dl.bxep[158] = -2231354265087950740L;
        dl.bxep[159] = -4762436142601101367L;
        dl.bxep[160] = 3676219366529745809L;
        dl.bxep[161] = -5430766294657662579L;
        dl.bxep[162] = -4287123174219497072L;
        dl.bxep[163] = 964288796701553237L;
        dl.bxep[164] = -9082041612408889627L;
        dl.bxep[165] = -250433744182474465L;
        dl.bxep[166] = -212633158650265584L;
        dl.bxep[167] = 4630447199271219946L;
        dl.bxep[168] = -7211531998926990163L;
        dl.bxep[169] = 8486431020009294850L;
        dl.bxep[170] = -4380087155440598779L;
        dl.bxep[171] = -6623933232648280282L;
        dl.bxep[172] = 5243995766634920145L;
        dl.bxep[173] = -3929442861548154965L;
        dl.bxep[174] = 1181588515067442927L;
        dl.bxep[175] = 8398058832092400837L;
        dl.bxep[176] = 5812612809695689780L;
        dl.bxep[177] = -456309800788133960L;
        dl.bxep[178] = 5339058452761096005L;
        dl.bxep[179] = 3217945075798934198L;
        dl.bxep[180] = 8170245451646293155L;
        dl.bxep[181] = -4735245257566381329L;
        dl.bxep[182] = 4986666005716670204L;
        dl.bxep[183] = -1758775923442107828L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void addFriendAndSave(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxmc", bxek(int ), (int)29)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dl.bxet("bxmd", bxew(int ), (int)29)) break;
            v0 /* !! */  = (long)dl.bxet("bxme", bxew(int ), (int)30);
        }
        var3_1 = dl.c;
        v1 /* !! */  = dl.eq;
        if (true) ** GOTO lbl11
        block22: while (true) {
            v1 /* !! */  = (long)(v2 - dl.bxet("bxmf", bxek(int ), (int)30));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1368133454: {
                    v2 = dl.bxet("bxmg", bxek(int ), (int)31);
                    continue block22;
                }
                case 23038235: {
                    v2 = dl.bxet("bxmh", bxek(int ), (int)32);
                    continue block22;
                }
                case 528750483: {
                    break block22;
                }
            }
            break;
        }
        var2_2 /* !! */  = dl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxmi", bxek(int ), (int)33)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dl.bxet("bxmj", bxew(int ), (int)31)) break;
            v3 /* !! */  = (long)dl.bxet("bxmk", bxew(int ), (int)32);
        }
        var1_3 = dl.a;
        if (var3_1) {
            throw null;
lbl29:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxml", bxek(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == dl.bxet("bxmm", bxew(int ), (int)33)) break;
            v4 /* !! */  = (long)dl.bxet("bxmn", bxew(int ), (int)34);
        }
        dl.addFriend(var0);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = dl.eq - dl.bxet("bxmo", bxek(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dl.bxet("bxmp", bxew(int ), (int)35)) break;
                    v5 /* !! */  = (long)dl.bxet("bxmq", bxew(int ), (int)36);
                }
                v6 = ak.getInstance();
                v7 /* !! */  = dl.eq;
                if (true) ** GOTO lbl52
                block27: while (true) {
                    v7 /* !! */  = (long)(v8 - dl.bxet("bxmr", bxek(int ), (int)36));
lbl52:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -927370978: {
                            v8 = dl.bxet("bxms", bxek(int ), (int)37);
                            continue block27;
                        }
                        case 322170624: {
                            v8 = dl.bxet("bxmt", bxek(int ), (int)38);
                            continue block27;
                        }
                        case 528750483: {
                            break block27;
                        }
                        case 1666870229: {
                            v8 = dl.bxet("bxmu", bxek(int ), (int)39);
                            continue block27;
                        }
                    }
                    break;
                }
                v6.save();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl67:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)dl.bxet("bxmv", bxew(int ), (int)37);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl76
            }
            case 1: {
                var2_2 /* !! */  = (int)dl.bxet("bxmw", bxew(int ), (int)38);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
lbl76:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dl.bxet("bxmx", bxew(int ), (int)39);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 3: {
                var2_2 /* !! */  = (int)dl.bxet("bxmy", bxew(int ), (int)40);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)dl.bxet("bxmz", bxew(int ), (int)41);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)dl.bxet("bxna", bxew(int ), (int)42);
                } while (!var3_1);
                throw null;
            }
lbl94:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dl.bxet("bxnb", bxew(int ), (int)43);
                    if (!var3_1) break block5;
                    throw null;
                }
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)dl.bxet("bxnc", bxew(int ), (int)44);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$isFriend$1(String var0, dk var1_1) {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(dl.bxet("bxxt", bxek(int ), (int)169) - dl.bxet("bxxs", bxek(int ), (int)168));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 528750483: {
                    break block14;
                }
                case 1993838188: {
                    continue block14;
                }
            }
            break;
        }
        var4_2 = dl.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxxu", bxek(int ), (int)170)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dl.bxet("bxxv", bxew(int ), (int)192)) break;
            v1 /* !! */  = (long)dl.bxet("bxxw", bxew(int ), (int)193);
        }
        var3_3 /* !! */  = dl.b;
        v2 /* !! */  = dl.eq;
        if (true) ** GOTO lbl21
        block16: while (true) {
            v2 /* !! */  = (long)(dl.bxet("bxxy", bxek(int ), (int)172) - dl.bxet("bxxx", bxek(int ), (int)171));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 528750483: {
                    break block16;
                }
                case 720840547: {
                    continue block16;
                }
            }
            break;
        }
        var2_4 = dl.a;
        if (var4_2) {
            throw null;
lbl29:
            // 1 sources

            return (boolean)dl.bxet("bxxz", bxew(int ), (int)194);
        }
        ** while (var2_4 || var2_4)
lbl32:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxya", bxek(int ), (int)173)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dl.bxet("bxyb", bxew(int ), (int)195)) break;
                    v3 /* !! */  = (long)dl.bxet("bxyc", bxew(int ), (int)196);
                }
                v4 = var1_1.getName();
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxyd", bxek(int ), (int)174)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dl.bxet("bxye", bxew(int ), (int)197)) break;
                    v5 /* !! */  = (long)dl.bxet("bxyf", bxew(int ), (int)198);
                }
                return v4.equalsIgnoreCase(var0);
            }
            case 0: {
                var3_3 /* !! */  = (int)dl.bxet("bxyg", bxew(int ), (int)199);
                if (var4_2) {
                    throw null;
                }
            }
lbl51:
            // 4 sources

            case 1: {
                var3_3 /* !! */  = (int)dl.bxet("bxyh", bxew(int ), (int)200);
                if (!var4_2) break;
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)dl.bxet("bxyi", bxew(int ), (int)201);
                if (!var4_2) ** GOTO lbl51
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)dl.bxet("bxyj", bxew(int ), (int)202);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void removeFriend(String var0) {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - dl.bxet("bxob", bxek(int ), (int)52));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -997727842: {
                    v1 = dl.bxet("bxoc", bxek(int ), (int)53);
                    continue block24;
                }
                case 528750483: {
                    break block24;
                }
                case 1664537726: {
                    v1 = dl.bxet("bxod", bxek(int ), (int)54);
                    continue block24;
                }
            }
            break;
        }
        var3_1 = dl.c;
        v2 /* !! */  = dl.eq;
        if (true) ** GOTO lbl19
        block25: while (true) {
            v2 /* !! */  = (long)(v3 - dl.bxet("bxoe", bxek(int ), (int)55));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -610134114: {
                    v3 = dl.bxet("bxof", bxek(int ), (int)56);
                    continue block25;
                }
                case -580980268: {
                    v3 = dl.bxet("bxog", bxek(int ), (int)57);
                    continue block25;
                }
                case 528750483: {
                    break block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = dl.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxoh", bxek(int ), (int)58)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == dl.bxet("bxoi", bxew(int ), (int)57)) break;
            v4 /* !! */  = (long)dl.bxet("bxoj", bxew(int ), (int)58);
        }
        var1_3 = dl.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl40:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl40
                v5 /* !! */  = dl.eq;
                if (true) ** GOTO lbl47
                block28: while (true) {
                    v5 /* !! */  = (long)(v6 - dl.bxet("bxok", bxek(int ), (int)59));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1282421542: {
                            v6 = dl.bxet("bxol", bxek(int ), (int)60);
                            continue block28;
                        }
                        case -766140993: {
                            v6 = dl.bxet("bxom", bxek(int ), (int)61);
                            continue block28;
                        }
                        case 528750483: {
                            break block28;
                        }
                        case 1835710804: {
                            v6 = dl.bxet("bxon", bxek(int ), (int)62);
                            continue block28;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxoo", bxek(int ), (int)63)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == dl.bxet("bxop", bxew(int ), (int)59)) break;
                    v7 /* !! */  = (long)dl.bxet("bxoq", bxew(int ), (int)60);
                }
                v8 = (Predicate<dk>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$removeFriend$0(java.lang.String ruhack.phobia.dk ), (Lruhack/phobia/dk;)Z)((String)var0);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxor", bxek(int ), (int)64)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dl.bxet("bxos", bxew(int ), (int)61)) break;
                    v9 /* !! */  = (long)dl.bxet("bxot", bxew(int ), (int)62);
                }
                dl.friends.removeIf(v8);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl73:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dl.bxet("bxou", bxew(int ), (int)63);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dl.bxet("bxov", bxew(int ), (int)64);
                    if (!var3_1) ** GOTO lbl73
                    throw null;
                }
            }
lbl83:
            // 3 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)dl.bxet("bxow", bxew(int ), (int)65);
                } while (!var3_1);
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)dl.bxet("bxox", bxew(int ), (int)66);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)dl.bxet("bxoy", bxew(int ), (int)67);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)dl.bxet("bxoz", bxew(int ), (int)68);
        ** while (!var3_1)
lbl100:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxzi() {
        dl.bxfa[100] = 2048735085;
        dl.bxfa[101] = 94059505;
        dl.bxfa[102] = 611596899;
        dl.bxfa[103] = 1398196917;
        dl.bxfa[104] = -834722854;
        dl.bxfa[105] = -737892544;
        dl.bxfa[106] = 557054471;
        dl.bxfa[107] = -1720954896;
        dl.bxfa[108] = -1637828055;
        dl.bxfa[109] = 249674465;
        dl.bxfa[110] = -2016145025;
        dl.bxfa[111] = 1905211836;
        dl.bxfa[112] = 1317521886;
        dl.bxfa[113] = -1529337377;
        dl.bxfa[114] = 512453425;
        dl.bxfa[115] = 2094936954;
        dl.bxfa[116] = 888331248;
        dl.bxfa[117] = -2125458053;
        dl.bxfa[118] = -856302322;
        dl.bxfa[119] = -335658768;
        dl.bxfa[120] = 1701384222;
        dl.bxfa[121] = 27390108;
        dl.bxfa[122] = 1920978930;
        dl.bxfa[123] = -1766976395;
        dl.bxfa[124] = 332492972;
        dl.bxfa[125] = 1798525906;
        dl.bxfa[126] = 249608662;
        dl.bxfa[127] = 700743941;
        dl.bxfa[128] = -1381237102;
        dl.bxfa[129] = -786603926;
        dl.bxfa[130] = -74256799;
        dl.bxfa[131] = -406703734;
        dl.bxfa[132] = -1174483661;
        dl.bxfa[133] = -1535037301;
        dl.bxfa[134] = -142406080;
        dl.bxfa[135] = 1403145009;
        dl.bxfa[136] = -1651694569;
        dl.bxfa[137] = 2103877639;
        dl.bxfa[138] = -1061447437;
        dl.bxfa[139] = -1020461749;
        dl.bxfa[140] = -1911402503;
        dl.bxfa[141] = 868738979;
        dl.bxfa[142] = -1965778334;
        dl.bxfa[143] = 1024465173;
        dl.bxfa[144] = 947252743;
        dl.bxfa[145] = -917679442;
        dl.bxfa[146] = 2080566130;
        dl.bxfa[147] = -279247939;
        dl.bxfa[148] = -1059418435;
        dl.bxfa[149] = 1756533884;
        dl.bxfa[150] = 1229452525;
        dl.bxfa[151] = -282879577;
        dl.bxfa[152] = -807508681;
        dl.bxfa[153] = -977565593;
        dl.bxfa[154] = -284985975;
        dl.bxfa[155] = 490123395;
        dl.bxfa[156] = 95633771;
        dl.bxfa[157] = -1324116191;
        dl.bxfa[158] = 27523799;
        dl.bxfa[159] = 122750783;
        dl.bxfa[160] = -423273396;
        dl.bxfa[161] = -934746430;
        dl.bxfa[162] = 614126563;
        dl.bxfa[163] = 974782154;
        dl.bxfa[164] = -263685491;
        dl.bxfa[165] = -1235299602;
        dl.bxfa[166] = 361451467;
        dl.bxfa[167] = 1560891515;
        dl.bxfa[168] = -1356854458;
        dl.bxfa[169] = -450850632;
        dl.bxfa[170] = 434150354;
        dl.bxfa[171] = 1669590841;
        dl.bxfa[172] = -351069340;
        dl.bxfa[173] = 498675580;
        dl.bxfa[174] = 1939827365;
        dl.bxfa[175] = -1335214892;
        dl.bxfa[176] = -870947315;
        dl.bxfa[177] = 101367816;
        dl.bxfa[178] = 1592100502;
        dl.bxfa[179] = 1662855586;
        dl.bxfa[180] = 1819209534;
        dl.bxfa[181] = 2048847411;
        dl.bxfa[182] = -368411540;
        dl.bxfa[183] = 562597077;
        dl.bxfa[184] = -1956871264;
        dl.bxfa[185] = -53470175;
        dl.bxfa[186] = -223868081;
        dl.bxfa[187] = -984773515;
        dl.bxfa[188] = -1921484938;
        dl.bxfa[189] = -555110961;
        dl.bxfa[190] = -1477141895;
        dl.bxfa[191] = -1489156914;
        dl.bxfa[192] = 1728443807;
        dl.bxfa[193] = -1988102742;
        dl.bxfa[194] = -1224837735;
        dl.bxfa[195] = 1141672699;
        dl.bxfa[196] = 896144405;
        dl.bxfa[197] = 380381032;
        dl.bxfa[198] = 1419219641;
        dl.bxfa[199] = -105738489;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void removeFriend(class_1657 var0) {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - dl.bxet("bxnd", bxek(int ), (int)40));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -702317594: {
                    v1 = dl.bxet("bxne", bxek(int ), (int)41);
                    continue block23;
                }
                case -205376223: {
                    v1 = dl.bxet("bxnf", bxek(int ), (int)42);
                    continue block23;
                }
                case 528750483: {
                    break block23;
                }
            }
            break;
        }
        var3_1 = dl.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxng", bxek(int ), (int)43)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dl.bxet("bxnh", bxew(int ), (int)45)) break;
            v2 /* !! */  = (long)dl.bxet("bxni", bxew(int ), (int)46);
        }
        var2_2 /* !! */  = dl.b;
        v3 /* !! */  = dl.eq;
        if (true) ** GOTO lbl25
        block25: while (true) {
            v3 /* !! */  = (long)(dl.bxet("bxnk", bxek(int ), (int)45) - dl.bxet("bxnj", bxek(int ), (int)44));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 528750483: {
                    break block25;
                }
                case 868740026: {
                    continue block25;
                }
            }
            break;
        }
        var1_3 = dl.a;
        if (var3_1) {
            throw null;
lbl33:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl33
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxnl", bxek(int ), (int)46)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dl.bxet("bxnm", bxew(int ), (int)47)) break;
                    v4 /* !! */  = (long)dl.bxet("bxnn", bxew(int ), (int)48);
                }
                v5 = var0.method_5477();
                v6 /* !! */  = dl.eq;
                if (true) ** GOTO lbl50
                block28: while (true) {
                    v6 /* !! */  = (long)(v7 - dl.bxet("bxno", bxek(int ), (int)47));
lbl50:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -396163766: {
                            v7 = dl.bxet("bxnp", bxek(int ), (int)48);
                            continue block28;
                        }
                        case -271046794: {
                            v7 = dl.bxet("bxnq", bxek(int ), (int)49);
                            continue block28;
                        }
                        case 230234437: {
                            v7 = dl.bxet("bxnr", bxek(int ), (int)50);
                            continue block28;
                        }
                        case 528750483: {
                            break block28;
                        }
                    }
                    break;
                }
                v8 = v5.getString();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxns", bxek(int ), (int)51)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == dl.bxet("bxnt", bxew(int ), (int)49)) break;
                    v9 /* !! */  = (long)dl.bxet("bxnu", bxew(int ), (int)50);
                }
                dl.removeFriend(v8);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)dl.bxet("bxnv", bxew(int ), (int)51);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)dl.bxet("bxnw", bxew(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl81:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)dl.bxet("bxnx", bxew(int ), (int)53);
                } while (!var3_1);
                throw null;
            }
lbl86:
            // 2 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)dl.bxet("bxny", bxew(int ), (int)54);
                } while (!var3_1);
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dl.bxet("bxnz", bxew(int ), (int)55);
                    if (!var3_1) ** GOTO lbl81
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)dl.bxet("bxoa", bxew(int ), (int)56);
        ** while (!var3_1)
lbl99:
        // 1 sources

        throw null;
    }

    static {
        bxey = new int[214];
        bxfa = new int[214];
        dl.bxze();
        dl.bxzf();
        dl.bxzg();
        dl.bxzh();
        dl.bxzi();
        dl.bxzj();
        bxen = new long[184];
        bxep = new long[184];
        dl.bxzk();
        dl.bxzl();
        dl.bxzm();
        dl.bxzn();
        friends = new ArrayList<dk>();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int size() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxve", bxek(int ), (int)138)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dl.bxet("bxvf", bxew(int ), (int)156)) break;
            v0 /* !! */  = (long)dl.bxet("bxvg", bxew(int ), (int)157);
        }
        var2 = dl.c;
        v1 /* !! */  = dl.eq;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(dl.bxet("bxvi", bxek(int ), (int)140) - dl.bxet("bxvh", bxek(int ), (int)139));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -488977355: {
                    continue block16;
                }
                case 528750483: {
                    break block16;
                }
            }
            break;
        }
        var1_1 /* !! */  = dl.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxvj", bxek(int ), (int)141)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == dl.bxet("bxvk", bxew(int ), (int)158)) break;
                    v2 /* !! */  = (long)dl.bxet("bxvl", bxew(int ), (int)159);
                }
                var0_2 = dl.a;
                if (var2) {
                    throw null;
                    return (int)dl.bxet("bxvm", bxew(int ), (int)160);
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxvn", bxek(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dl.bxet("bxvo", bxew(int ), (int)161)) break;
                    v3 /* !! */  = (long)dl.bxet("bxvp", bxew(int ), (int)162);
                }
                v4 /* !! */  = dl.eq;
                if (true) ** GOTO lbl43
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - dl.bxet("bxvq", bxek(int ), (int)143));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1552056028: {
                            v5 = dl.bxet("bxvr", bxek(int ), (int)144);
                            continue block20;
                        }
                        case 132975303: {
                            v5 = dl.bxet("bxvs", bxek(int ), (int)145);
                            continue block20;
                        }
                        case 528750483: {
                            break block20;
                        }
                    }
                    break;
                }
                return dl.friends.size();
            }
            case 0: {
                var1_1 /* !! */  = (int)dl.bxet("bxvt", bxew(int ), (int)163);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)dl.bxet("bxvu", bxew(int ), (int)164);
                if (!var2) break;
                throw null;
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)dl.bxet("bxvv", bxew(int ), (int)165);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)dl.bxet("bxvw", bxew(int ), (int)166);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$removeFriend$0(String var0, dk var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxyk", bxek(int ), (int)175)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dl.bxet("bxyl", bxew(int ), (int)203)) break;
            v0 /* !! */  = (long)dl.bxet("bxym", bxew(int ), (int)204);
        }
        var4_2 = dl.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxyn", bxek(int ), (int)176)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dl.bxet("bxyo", bxew(int ), (int)205)) break;
            v1 /* !! */  = (long)dl.bxet("bxyp", bxew(int ), (int)206);
        }
        var3_3 /* !! */  = dl.b;
        v2 /* !! */  = dl.eq;
        if (true) ** GOTO lbl17
        block18: while (true) {
            v2 /* !! */  = (long)(dl.bxet("bxyr", bxek(int ), (int)178) - dl.bxet("bxyq", bxek(int ), (int)177));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -179155800: {
                    continue block18;
                }
                case 528750483: {
                    break block18;
                }
            }
            break;
        }
        var2_4 = dl.a;
        if (var4_2) {
            throw null;
lbl25:
            // 1 sources

            return (boolean)dl.bxet("bxys", bxew(int ), (int)207);
        }
        ** while (var2_4 || var2_4)
lbl28:
        // 1 sources

        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxyt", bxek(int ), (int)179)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dl.bxet("bxyu", bxew(int ), (int)208)) break;
                    v3 /* !! */  = (long)dl.bxet("bxyv", bxew(int ), (int)209);
                }
                v4 = var1_1.getName();
                v5 /* !! */  = dl.eq;
                if (true) ** GOTO lbl41
                block21: while (true) {
                    v5 /* !! */  = (long)(v6 - dl.bxet("bxyw", bxek(int ), (int)180));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1765733888: {
                            v6 = dl.bxet("bxyx", bxek(int ), (int)181);
                            continue block21;
                        }
                        case -570874727: {
                            v6 = dl.bxet("bxyy", bxek(int ), (int)182);
                            continue block21;
                        }
                        case 97903535: {
                            v6 = dl.bxet("bxyz", bxek(int ), (int)183);
                            continue block21;
                        }
                        case 528750483: {
                            break block21;
                        }
                    }
                    break;
                }
                return v4.equalsIgnoreCase(var0);
            }
            case 0: {
                var3_3 /* !! */  = (int)dl.bxet("bxza", bxew(int ), (int)210);
                if (!var4_2) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)dl.bxet("bxzb", bxew(int ), (int)211);
                    if (!var4_2) break block4;
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)dl.bxet("bxzc", bxew(int ), (int)212);
                if (!var4_2) ** GOTO lbl58
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)dl.bxet("bxzd", bxew(int ), (int)213);
        ** while (!var4_2)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setFriends(List<dk> var0) {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block33: while (true) {
            v0 /* !! */  = (long)(dl.bxet("bxvy", bxek(int ), (int)147) - dl.bxet("bxvx", bxek(int ), (int)146));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1889907647: {
                    continue block33;
                }
                case 528750483: {
                    break block33;
                }
            }
            break;
        }
        var3_1 = dl.c;
        v1 /* !! */  = dl.eq;
        if (true) ** GOTO lbl15
        block34: while (true) {
            v1 /* !! */  = (long)(v2 - dl.bxet("bxvz", bxek(int ), (int)148));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1753956739: {
                    v2 = dl.bxet("bxwa", bxek(int ), (int)149);
                    continue block34;
                }
                case 528750483: {
                    break block34;
                }
                case 1644107545: {
                    v2 = dl.bxet("bxwb", bxek(int ), (int)150);
                    continue block34;
                }
            }
            break;
        }
        var2_2 /* !! */  = dl.b;
        v3 /* !! */  = dl.eq;
        if (true) ** GOTO lbl29
        block35: while (true) {
            v3 /* !! */  = (long)(v4 - dl.bxet("bxwc", bxek(int ), (int)151));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1883313558: {
                    v4 = dl.bxet("bxwd", bxek(int ), (int)152);
                    continue block35;
                }
                case -928073197: {
                    v4 = dl.bxet("bxwe", bxek(int ), (int)153);
                    continue block35;
                }
                case 528750483: {
                    break block35;
                }
            }
            break;
        }
        var1_3 = dl.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl44:
                    // 3 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxwf", bxek(int ), (int)154)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == dl.bxet("bxwg", bxew(int ), (int)167)) break;
                    v5 /* !! */  = (long)dl.bxet("bxwh", bxew(int ), (int)168);
                }
                v6 /* !! */  = dl.eq;
                if (true) ** GOTO lbl57
                block38: while (true) {
                    v6 /* !! */  = (long)(v7 - dl.bxet("bxwi", bxek(int ), (int)155));
lbl57:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case 528750483: {
                            break block38;
                        }
                        case 1647443030: {
                            v7 = dl.bxet("bxwj", bxek(int ), (int)156);
                            continue block38;
                        }
                        case 2074975290: {
                            v7 = dl.bxet("bxwk", bxek(int ), (int)157);
                            continue block38;
                        }
                    }
                    break;
                }
                dl.friends.clear();
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxwl", bxek(int ), (int)158)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == dl.bxet("bxwm", bxew(int ), (int)169)) break;
                    v8 /* !! */  = (long)dl.bxet("bxwn", bxew(int ), (int)170);
                }
                v9 /* !! */  = dl.eq;
                if (true) ** GOTO lbl78
                block40: while (true) {
                    v9 /* !! */  = (long)(dl.bxet("bxwp", bxek(int ), (int)160) - dl.bxet("bxwo", bxek(int ), (int)159));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 528750483: {
                            break block40;
                        }
                        case 1848991364: {
                            continue block40;
                        }
                    }
                    break;
                }
                dl.friends.addAll(var0);
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl87:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dl.bxet("bxwq", bxew(int ), (int)171);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 1: {
                var2_2 /* !! */  = (int)dl.bxet("bxwr", bxew(int ), (int)172);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
lbl97:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dl.bxet("bxws", bxew(int ), (int)173);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl116
            }
            case 3: {
                var2_2 /* !! */  = (int)dl.bxet("bxwt", bxew(int ), (int)174);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dl.bxet("bxwu", bxew(int ), (int)175);
                    if (!var3_1) ** GOTO lbl97
                    throw null;
                }
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)dl.bxet("bxwv", bxew(int ), (int)176);
                } while (!var3_1);
                throw null;
            }
lbl116:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)dl.bxet("bxww", bxew(int ), (int)177);
                if (!var3_1) break;
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)dl.bxet("bxwx", bxew(int ), (int)178);
        ** while (!var3_1)
lbl123:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxzj() {
        dl.bxfa[200] = -1378918231;
        dl.bxfa[201] = -803043687;
        dl.bxfa[202] = 479028951;
        dl.bxfa[203] = -1168635373;
        dl.bxfa[204] = -1456009715;
        dl.bxfa[205] = 1608065122;
        dl.bxfa[206] = 1797913599;
        dl.bxfa[207] = -61571308;
        dl.bxfa[208] = 1371316647;
        dl.bxfa[209] = -1654789758;
        dl.bxfa[210] = -1587447946;
        dl.bxfa[211] = 432938611;
        dl.bxfa[212] = -861885462;
        dl.bxfa[213] = -1508967587;
    }

    private static /* synthetic */ long bxek(int n2) {
        return bxen[n2] ^ bxep[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static boolean isFriend(String string) {
        boolean bl2;
        Object object = eq;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - dl.bxet("bxrf", bxek(int ), (int)88);
            }
            switch ((int)object) {
                case -791631122: {
                    callSite = dl.bxet("bxrg", bxek(int ), (int)89);
                    continue block16;
                }
                case -508592245: {
                    callSite = dl.bxet("bxrh", bxek(int ), (int)90);
                    continue block16;
                }
                case 528750483: {
                    break block16;
                }
                case 919458557: {
                    callSite = dl.bxet("bxri", bxek(int ), (int)91);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = eq - dl.bxet("bxrj", bxek(int ), (int)92)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == dl.bxet("bxrk", bxew(int ), (int)103)) break;
            object2 = dl.bxet("bxrl", bxew(int ), (int)104);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = eq - dl.bxet("bxrm", bxek(int ), (int)93)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == dl.bxet("bxrn", bxew(int ), (int)105)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = dl.bxet("bxro", bxew(int ), (int)106);
        }
        if (bl2) return (boolean)dl.bxet("bxrp", bxew(int ), (int)107);
        if (bl2) return (boolean)dl.bxet("bxrp", bxew(int ), (int)107);
        Object object4 = eq;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite - dl.bxet("bxrq", bxek(int ), (int)94);
            }
            switch ((int)object4) {
                case -125591298: {
                    callSite = dl.bxet("bxrr", bxek(int ), (int)95);
                    continue block19;
                }
                case 528750483: {
                    break block19;
                }
                case 795861962: {
                    callSite = dl.bxet("bxrs", bxek(int ), (int)96);
                    continue block19;
                }
                case 1813523491: {
                    callSite = dl.bxet("bxrt", bxek(int ), (int)97);
                    continue block19;
                }
            }
            break;
        }
        Object object5 = eq;
        block20: while (true) {
            switch ((int)object5) {
                case -602810564: {
                    object5 = dl.bxet("bxrv", bxek(int ), (int)99) - dl.bxet("bxru", bxek(int ), (int)98);
                    continue block20;
                }
                case 528750483: {
                    break block20;
                }
            }
            break;
        }
        Stream stream = friends.stream();
        while (true) {
            long l4;
            Object object6;
            if ((object6 = (l4 = eq - dl.bxet("bxrw", bxek(int ), (int)100)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object6 == dl.bxet("bxrx", bxew(int ), (int)108)) break;
            object6 = dl.bxet("bxry", bxew(int ), (int)109);
        }
        Predicate<dk> predicate = arg_0 -> dl.lambda$isFriend$1(string, arg_0);
        while (true) {
            long l5;
            Object object7;
            if ((object7 = (l5 = eq - dl.bxet("bxrz", bxek(int ), (int)101)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object7 == dl.bxet("bxsa", bxew(int ), (int)110)) {
                return stream.anyMatch(predicate);
            }
            object7 = dl.bxet("bxsb", bxew(int ), (int)111);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void addFriend(class_1657 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxeu", bxek(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dl.bxet("bxfb", bxew(int ), (int)0)) break;
            v0 /* !! */  = (long)dl.bxet("bxfe", bxew(int ), (int)1);
        }
        var3_1 = dl.c;
        v1 /* !! */  = dl.eq;
        if (true) ** GOTO lbl11
        block18: while (true) {
            v1 /* !! */  = (long)(dl.bxet("bxfi", bxek(int ), (int)2) - dl.bxet("bxfg", bxek(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -899237919: {
                    continue block18;
                }
                case 528750483: {
                    break block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = dl.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxfl", bxek(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dl.bxet("bxfm", bxew(int ), (int)2)) break;
            v2 /* !! */  = (long)dl.bxet("bxfn", bxew(int ), (int)3);
        }
        var1_3 = dl.a;
        if (var3_1) {
            throw null;
lbl25:
            // 3 sources

            return;
        }
        if (var1_3) ** GOTO lbl25
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxfo", bxek(int ), (int)4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == dl.bxet("bxfv", bxew(int ), (int)4)) break;
                    v3 /* !! */  = (long)dl.bxet("bxfx", bxew(int ), (int)5);
                }
                v4 = var0.method_5477();
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = dl.eq - dl.bxet("bxfy", bxek(int ), (int)5)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dl.bxet("bxfz", bxew(int ), (int)6)) break;
                    v5 /* !! */  = (long)dl.bxet("bxgb", bxew(int ), (int)7);
                }
                v6 = v4.getString();
                v7 /* !! */  = dl.eq;
                if (true) ** GOTO lbl48
                block23: while (true) {
                    v7 /* !! */  = (long)(v8 - dl.bxet("bxgc", bxek(int ), (int)6));
lbl48:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 117822182: {
                            v8 = dl.bxet("bxgd", bxek(int ), (int)7);
                            continue block23;
                        }
                        case 528750483: {
                            break block23;
                        }
                        case 987632485: {
                            v8 = dl.bxet("bxgj", bxek(int ), (int)8);
                            continue block23;
                        }
                    }
                    break;
                }
                dl.addFriend(v6);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl61:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)dl.bxet("bxgl", bxew(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
            }
lbl65:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)dl.bxet("bxgm", bxew(int ), (int)9);
                if (!var3_1) ** GOTO lbl61
                throw null;
            }
lbl69:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)dl.bxet("bxgn", bxew(int ), (int)10);
                if (!var3_1) ** GOTO lbl65
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)dl.bxet("bxgo", bxew(int ), (int)11);
                if (!var3_1) ** GOTO lbl69
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dl.bxet("bxgq", bxew(int ), (int)12);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)dl.bxet("bxgs", bxew(int ), (int)13);
        ** while (!var3_1)
lbl85:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxzk() {
        dl.bxen[0] = -7866514033153362027L;
        dl.bxen[1] = 184587631079788248L;
        dl.bxen[2] = 6598000408121877244L;
        dl.bxen[3] = 7362548445303243960L;
        dl.bxen[4] = 9195409902349977580L;
        dl.bxen[5] = 9154847596496889550L;
        dl.bxen[6] = -2147869208903631554L;
        dl.bxen[7] = -1101445475319156869L;
        dl.bxen[8] = -5216397052416992547L;
        dl.bxen[9] = -160386189349069741L;
        dl.bxen[10] = 3073974493873856757L;
        dl.bxen[11] = -707981499792092026L;
        dl.bxen[12] = 6873965754921198187L;
        dl.bxen[13] = -3049590231948074533L;
        dl.bxen[14] = -361922375699036726L;
        dl.bxen[15] = 2691640707482861746L;
        dl.bxen[16] = -6516428099756311155L;
        dl.bxen[17] = -447145723532138389L;
        dl.bxen[18] = 1190954718652193656L;
        dl.bxen[19] = 3382968380142255763L;
        dl.bxen[20] = -6080811031665200935L;
        dl.bxen[21] = 8142913220981067440L;
        dl.bxen[22] = -6928760413962606494L;
        dl.bxen[23] = -9127021365191180246L;
        dl.bxen[24] = -7164240090874131678L;
        dl.bxen[25] = -7127852907036927995L;
        dl.bxen[26] = -6150059564506926134L;
        dl.bxen[27] = -1859466051136228756L;
        dl.bxen[28] = 5518910742117563591L;
        dl.bxen[29] = -1871693374303159048L;
        dl.bxen[30] = 7188466988471877154L;
        dl.bxen[31] = -2480033613516650936L;
        dl.bxen[32] = 3456314618645935509L;
        dl.bxen[33] = 5872884157990081567L;
        dl.bxen[34] = -6120850241593692321L;
        dl.bxen[35] = -2710688933299951512L;
        dl.bxen[36] = 6459569860868030810L;
        dl.bxen[37] = -5882694406041485818L;
        dl.bxen[38] = -8427654462946219839L;
        dl.bxen[39] = 8657939890461126399L;
        dl.bxen[40] = 1048641890243824556L;
        dl.bxen[41] = 7651172371973718857L;
        dl.bxen[42] = -4481200852096486400L;
        dl.bxen[43] = -584022704222579609L;
        dl.bxen[44] = 4683495601072090603L;
        dl.bxen[45] = 8366274963343929906L;
        dl.bxen[46] = -8034091267105900559L;
        dl.bxen[47] = 5647675256918401780L;
        dl.bxen[48] = 5372378584086724406L;
        dl.bxen[49] = -350032757049049530L;
        dl.bxen[50] = 8672034896211949486L;
        dl.bxen[51] = 4236782303284351369L;
        dl.bxen[52] = 3046698446459104315L;
        dl.bxen[53] = -6541710568798852303L;
        dl.bxen[54] = 3964065969526514703L;
        dl.bxen[55] = 32409003577324578L;
        dl.bxen[56] = -2220797345345808631L;
        dl.bxen[57] = -8901523963592914811L;
        dl.bxen[58] = -6431633940292188601L;
        dl.bxen[59] = 1055080195664123142L;
        dl.bxen[60] = -608163628904109813L;
        dl.bxen[61] = 7895502567297551849L;
        dl.bxen[62] = -4261352805740941792L;
        dl.bxen[63] = -2701589715455733288L;
        dl.bxen[64] = -6140571935958920078L;
        dl.bxen[65] = 6581028387840944996L;
        dl.bxen[66] = 2376399285622589364L;
        dl.bxen[67] = -5464804267959262720L;
        dl.bxen[68] = 2017858245827895947L;
        dl.bxen[69] = 2545229450910686858L;
        dl.bxen[70] = 3518334043899304837L;
        dl.bxen[71] = 1698350884430241359L;
        dl.bxen[72] = -3466039751313923168L;
        dl.bxen[73] = -1315282333728762407L;
        dl.bxen[74] = 5380072191585175640L;
        dl.bxen[75] = -8949194983487663443L;
        dl.bxen[76] = -4147910231270779917L;
        dl.bxen[77] = -5203224742857877025L;
        dl.bxen[78] = 4332887580166522469L;
        dl.bxen[79] = 4968342018017656629L;
        dl.bxen[80] = 1276021014235077732L;
        dl.bxen[81] = 6433166751869997355L;
        dl.bxen[82] = -4977850499778309569L;
        dl.bxen[83] = -576457891717678450L;
        dl.bxen[84] = 3334734580736638714L;
        dl.bxen[85] = -2699358367503730269L;
        dl.bxen[86] = -4099884976566626323L;
        dl.bxen[87] = -6351255099512277009L;
        dl.bxen[88] = 1153981202140248510L;
        dl.bxen[89] = 8726842849033395987L;
        dl.bxen[90] = 2819405585891461315L;
        dl.bxen[91] = -1872812821037259758L;
        dl.bxen[92] = 5430741301921646624L;
        dl.bxen[93] = -9153024087844752731L;
        dl.bxen[94] = 5506229518164228779L;
        dl.bxen[95] = 6548209409166454396L;
        dl.bxen[96] = 5661961904884083334L;
        dl.bxen[97] = 9130271982355807855L;
        dl.bxen[98] = 2125011657249976268L;
        dl.bxen[99] = -4509795792394382443L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private dl() {
        var2_1 /* !! */  = dl.b;
        var1_2 = dl.a;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)dl.bxet("bxwy", bxew(int ), (int)179);
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)dl.bxet("bxwz", bxew(int ), (int)180);
                    break;
                }
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)dl.bxet("bxxa", bxew(int ), (int)181);
        ** while (true)
    }

    public static /* synthetic */ CallSite bxet(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bxzl() {
        dl.bxen[100] = 3161224747345636496L;
        dl.bxen[101] = -9064781090183215119L;
        dl.bxen[102] = 1474348160116878567L;
        dl.bxen[103] = -3509787928304998229L;
        dl.bxen[104] = 2308160374666092939L;
        dl.bxen[105] = -708750892620719071L;
        dl.bxen[106] = -3898423348727302791L;
        dl.bxen[107] = 4838509257744618274L;
        dl.bxen[108] = 615172013235943516L;
        dl.bxen[109] = 176627718373566614L;
        dl.bxen[110] = 4228209024337560115L;
        dl.bxen[111] = -8625553617642369074L;
        dl.bxen[112] = -3478887006452866017L;
        dl.bxen[113] = 1734764813891971280L;
        dl.bxen[114] = -3556201668603655173L;
        dl.bxen[115] = -6672542626336181805L;
        dl.bxen[116] = 2973245487406625145L;
        dl.bxen[117] = -6082072018107266555L;
        dl.bxen[118] = 8935410730432450343L;
        dl.bxen[119] = 3491620642512592980L;
        dl.bxen[120] = -2172734577458886851L;
        dl.bxen[121] = 3806571322188372145L;
        dl.bxen[122] = -6053069605410443033L;
        dl.bxen[123] = 7976047204092420101L;
        dl.bxen[124] = -902433639354213238L;
        dl.bxen[125] = -8448530691890362313L;
        dl.bxen[126] = -1585631916803696044L;
        dl.bxen[127] = 6714349229879596862L;
        dl.bxen[128] = -1857773011690254205L;
        dl.bxen[129] = -7078121176711773259L;
        dl.bxen[130] = 474361736257344150L;
        dl.bxen[131] = -5774419374789343823L;
        dl.bxen[132] = 7958626211507076271L;
        dl.bxen[133] = -968777862134466927L;
        dl.bxen[134] = 436278043790816587L;
        dl.bxen[135] = -5950964581659319300L;
        dl.bxen[136] = -9178308978263083508L;
        dl.bxen[137] = -5802634818828479195L;
        dl.bxen[138] = 3520453390142153325L;
        dl.bxen[139] = 1055958571252487177L;
        dl.bxen[140] = 5943458519720062343L;
        dl.bxen[141] = 6386048033637004697L;
        dl.bxen[142] = 4542109933548110270L;
        dl.bxen[143] = 7788940884645029860L;
        dl.bxen[144] = 6332935974040958944L;
        dl.bxen[145] = 6806843982523777674L;
        dl.bxen[146] = 3702241047257312161L;
        dl.bxen[147] = -4332138968405082564L;
        dl.bxen[148] = 8731661777015038719L;
        dl.bxen[149] = -4552763326789427839L;
        dl.bxen[150] = -2718574497425546518L;
        dl.bxen[151] = 3040559822809309121L;
        dl.bxen[152] = -155199390961590435L;
        dl.bxen[153] = -7495618279364683993L;
        dl.bxen[154] = 5764494828307091811L;
        dl.bxen[155] = -9106208236858349937L;
        dl.bxen[156] = -887787547242176206L;
        dl.bxen[157] = -8454767562272334776L;
        dl.bxen[158] = 1621674719885585685L;
        dl.bxen[159] = -3193783314163753691L;
        dl.bxen[160] = 4605249079634266302L;
        dl.bxen[161] = 8535250267549375212L;
        dl.bxen[162] = -8364220846940333089L;
        dl.bxen[163] = 7431912669745346052L;
        dl.bxen[164] = -6393356921495458438L;
        dl.bxen[165] = -5889079452777504625L;
        dl.bxen[166] = -4928502986174507550L;
        dl.bxen[167] = 775583385211684603L;
        dl.bxen[168] = 2647136553265828628L;
        dl.bxen[169] = 6567236732082354350L;
        dl.bxen[170] = 9034880582570866980L;
        dl.bxen[171] = 6992270741754926830L;
        dl.bxen[172] = 9185546607319881892L;
        dl.bxen[173] = -8321862074583818239L;
        dl.bxen[174] = -4016618858908556437L;
        dl.bxen[175] = -3254232678473398768L;
        dl.bxen[176] = -8646019099777164627L;
        dl.bxen[177] = -7020823056945547977L;
        dl.bxen[178] = -354541515182675104L;
        dl.bxen[179] = -5694870442154543189L;
        dl.bxen[180] = 8205901077848721037L;
        dl.bxen[181] = 117517399999286645L;
        dl.bxen[182] = -9176234212497969193L;
        dl.bxen[183] = -8471498185012387040L;
    }

    private static /* synthetic */ int bxew(int n2) {
        return bxey[n2] ^ bxfa[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List<dk> getFriends() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxxb", bxek(int ), (int)161)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dl.bxet("bxxc", bxew(int ), (int)182)) break;
            v0 /* !! */  = (long)dl.bxet("bxxd", bxew(int ), (int)183);
        }
        var2 = dl.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxxe", bxek(int ), (int)162)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dl.bxet("bxxf", bxew(int ), (int)184)) break;
            v1 /* !! */  = (long)dl.bxet("bxxg", bxew(int ), (int)185);
        }
        var1_1 = dl.b;
        v2 /* !! */  = dl.eq;
        if (true) ** GOTO lbl19
        block8: while (true) {
            v2 /* !! */  = (long)(v3 - dl.bxet("bxxh", bxek(int ), (int)163));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 528750483: {
                    break block8;
                }
                case 1353694316: {
                    v3 = dl.bxet("bxxi", bxek(int ), (int)164);
                    continue block8;
                }
                case 1810695180: {
                    v3 = dl.bxet("bxxj", bxek(int ), (int)165);
                    continue block8;
                }
                case 1864751324: {
                    v3 = dl.bxet("bxxk", bxek(int ), (int)166);
                    continue block8;
                }
            }
            break;
        }
        var0_2 = dl.a;
        if (var2) {
            throw null;
lbl34:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl37:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxxl", bxek(int ), (int)167)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == dl.bxet("bxxm", bxew(int ), (int)186)) break;
            v4 /* !! */  = (long)dl.bxet("bxxn", bxew(int ), (int)187);
        }
        return dl.friends;
    }

    private static /* synthetic */ void bxze() {
        dl.bxey[0] = 1647315799;
        dl.bxey[1] = -1035024509;
        dl.bxey[2] = 75196240;
        dl.bxey[3] = 1575943441;
        dl.bxey[4] = -1155247711;
        dl.bxey[5] = 299866447;
        dl.bxey[6] = 1782470756;
        dl.bxey[7] = -2052215274;
        dl.bxey[8] = -1517452278;
        dl.bxey[9] = 2101401130;
        dl.bxey[10] = -1310515445;
        dl.bxey[11] = 1463155351;
        dl.bxey[12] = 587619990;
        dl.bxey[13] = -186678164;
        dl.bxey[14] = -718286203;
        dl.bxey[15] = 167170172;
        dl.bxey[16] = -451951776;
        dl.bxey[17] = -144097247;
        dl.bxey[18] = -1599406524;
        dl.bxey[19] = -269076506;
        dl.bxey[20] = 149665714;
        dl.bxey[21] = 676519615;
        dl.bxey[22] = 1872977758;
        dl.bxey[23] = 240288905;
        dl.bxey[24] = 98147774;
        dl.bxey[25] = 170250739;
        dl.bxey[26] = 271181205;
        dl.bxey[27] = -1344409989;
        dl.bxey[28] = -371481415;
        dl.bxey[29] = 733685021;
        dl.bxey[30] = 671431669;
        dl.bxey[31] = 449312679;
        dl.bxey[32] = -706653607;
        dl.bxey[33] = 594909906;
        dl.bxey[34] = -1800056598;
        dl.bxey[35] = -1413253160;
        dl.bxey[36] = -2037385543;
        dl.bxey[37] = -1013830771;
        dl.bxey[38] = -1652103016;
        dl.bxey[39] = 1586326436;
        dl.bxey[40] = -1147296813;
        dl.bxey[41] = 1974394525;
        dl.bxey[42] = -251235509;
        dl.bxey[43] = -482062885;
        dl.bxey[44] = -842938149;
        dl.bxey[45] = 170478958;
        dl.bxey[46] = -432442378;
        dl.bxey[47] = 1217809589;
        dl.bxey[48] = -1229627387;
        dl.bxey[49] = -719037574;
        dl.bxey[50] = 148217496;
        dl.bxey[51] = -105481789;
        dl.bxey[52] = 261579576;
        dl.bxey[53] = -533283615;
        dl.bxey[54] = 1580674940;
        dl.bxey[55] = 1990885732;
        dl.bxey[56] = -20532348;
        dl.bxey[57] = 91231528;
        dl.bxey[58] = 426378848;
        dl.bxey[59] = 1521755621;
        dl.bxey[60] = -1505277270;
        dl.bxey[61] = -146060510;
        dl.bxey[62] = 264701218;
        dl.bxey[63] = 1629098609;
        dl.bxey[64] = -910309103;
        dl.bxey[65] = -1647662298;
        dl.bxey[66] = -437783159;
        dl.bxey[67] = 47419124;
        dl.bxey[68] = -524712764;
        dl.bxey[69] = 372977802;
        dl.bxey[70] = -1864195358;
        dl.bxey[71] = 1721259883;
        dl.bxey[72] = -8821253;
        dl.bxey[73] = -1568863175;
        dl.bxey[74] = 1354801483;
        dl.bxey[75] = -746838839;
        dl.bxey[76] = -156987791;
        dl.bxey[77] = 119850946;
        dl.bxey[78] = -71337854;
        dl.bxey[79] = 606440230;
        dl.bxey[80] = 124354450;
        dl.bxey[81] = 1707068912;
        dl.bxey[82] = -678764378;
        dl.bxey[83] = -120236727;
        dl.bxey[84] = -1387625025;
        dl.bxey[85] = -2039674608;
        dl.bxey[86] = -2017717381;
        dl.bxey[87] = 408313659;
        dl.bxey[88] = 1426420639;
        dl.bxey[89] = -1685119276;
        dl.bxey[90] = -1919663289;
        dl.bxey[91] = -1428332363;
        dl.bxey[92] = -1973406593;
        dl.bxey[93] = -957993749;
        dl.bxey[94] = -1441949750;
        dl.bxey[95] = -1863043088;
        dl.bxey[96] = -1105767143;
        dl.bxey[97] = 1021976308;
        dl.bxey[98] = -1504357237;
        dl.bxey[99] = -1592191102;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void removeFriendAndSave(String var0) {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(dl.bxet("bxpb", bxek(int ), (int)66) - dl.bxet("bxpa", bxek(int ), (int)65));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 104945402: {
                    continue block24;
                }
                case 528750483: {
                    break block24;
                }
            }
            break;
        }
        var3_1 = dl.c;
        v1 /* !! */  = dl.eq;
        if (true) ** GOTO lbl15
        block25: while (true) {
            v1 /* !! */  = (long)(v2 - dl.bxet("bxpc", bxek(int ), (int)67));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1894859690: {
                    v2 = dl.bxet("bxpd", bxek(int ), (int)68);
                    continue block25;
                }
                case -1570962152: {
                    v2 = dl.bxet("bxpe", bxek(int ), (int)69);
                    continue block25;
                }
                case -246467767: {
                    v2 = dl.bxet("bxpf", bxek(int ), (int)70);
                    continue block25;
                }
                case 528750483: {
                    break block25;
                }
            }
            break;
        }
        var2_2 /* !! */  = dl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxpg", bxek(int ), (int)71)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dl.bxet("bxph", bxew(int ), (int)69)) break;
            v3 /* !! */  = (long)dl.bxet("bxpi", bxew(int ), (int)70);
        }
        var1_3 = dl.a;
        if (var3_1) {
            throw null;
lbl36:
            // 3 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxpj", bxek(int ), (int)72)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dl.bxet("bxpk", bxew(int ), (int)71)) break;
                    v4 /* !! */  = (long)dl.bxet("bxpl", bxew(int ), (int)72);
                }
                dl.removeFriend(var0);
                if (var1_3 || var1_3) ** GOTO lbl36
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxpm", bxek(int ), (int)73)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == dl.bxet("bxpn", bxew(int ), (int)73)) break;
                    v5 /* !! */  = (long)dl.bxet("bxpo", bxew(int ), (int)74);
                }
                v6 = ak.getInstance();
                v7 /* !! */  = dl.eq;
                if (true) ** GOTO lbl59
                block30: while (true) {
                    v7 /* !! */  = (long)(dl.bxet("bxpq", bxek(int ), (int)75) - dl.bxet("bxpp", bxek(int ), (int)74));
lbl59:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case 528750483: {
                            break block30;
                        }
                        case 2011674545: {
                            continue block30;
                        }
                    }
                    break;
                }
                v6.save();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)dl.bxet("bxpr", bxew(int ), (int)75);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl77
            }
lbl72:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)dl.bxet("bxps", bxew(int ), (int)76);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl82
            }
lbl77:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)dl.bxet("bxpt", bxew(int ), (int)77);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl82:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)dl.bxet("bxpu", bxew(int ), (int)78);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
lbl86:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)dl.bxet("bxpv", bxew(int ), (int)79);
                    if (!var3_1) ** GOTO lbl77
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)dl.bxet("bxpw", bxew(int ), (int)80);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
lbl95:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)dl.bxet("bxpx", bxew(int ), (int)81);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)dl.bxet("bxpy", bxew(int ), (int)82);
        ** while (!var3_1)
lbl102:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxzm() {
        dl.bxep[0] = -7092887344623528384L;
        dl.bxep[1] = 1498744345468736478L;
        dl.bxep[2] = -4991282741165679022L;
        dl.bxep[3] = 5062299640382960090L;
        dl.bxep[4] = 2732433434584737328L;
        dl.bxep[5] = 2668338494429159836L;
        dl.bxep[6] = 2423798193784885632L;
        dl.bxep[7] = -2226485783005855532L;
        dl.bxep[8] = 3537624672453794826L;
        dl.bxep[9] = -8984793183979448752L;
        dl.bxep[10] = -2877738203985430590L;
        dl.bxep[11] = -464412543933576419L;
        dl.bxep[12] = -244425583441148022L;
        dl.bxep[13] = 1005820982479910075L;
        dl.bxep[14] = -6884127499055922647L;
        dl.bxep[15] = -4258602025151665626L;
        dl.bxep[16] = -2293948768673625283L;
        dl.bxep[17] = 4128922764025059562L;
        dl.bxep[18] = -4829169391634824027L;
        dl.bxep[19] = -3528308460536464817L;
        dl.bxep[20] = -1480521005607866899L;
        dl.bxep[21] = 1182699707403294297L;
        dl.bxep[22] = 5845187881140004338L;
        dl.bxep[23] = 1057910939163917244L;
        dl.bxep[24] = 5844919958931775500L;
        dl.bxep[25] = 6940730490762643771L;
        dl.bxep[26] = -6344988111656469534L;
        dl.bxep[27] = 1484722835041487712L;
        dl.bxep[28] = -1248426018724281012L;
        dl.bxep[29] = 2256053447816010645L;
        dl.bxep[30] = 6071650714216630390L;
        dl.bxep[31] = 6497099714334878006L;
        dl.bxep[32] = 8299804788239692087L;
        dl.bxep[33] = 6351792808119892708L;
        dl.bxep[34] = -3456514988559443239L;
        dl.bxep[35] = 410973641993202903L;
        dl.bxep[36] = 9118077489589518048L;
        dl.bxep[37] = 4531861178378764214L;
        dl.bxep[38] = -550651349752044533L;
        dl.bxep[39] = -1222465133539585561L;
        dl.bxep[40] = -6283735813153331216L;
        dl.bxep[41] = -8965889018802975521L;
        dl.bxep[42] = 2074371071007235899L;
        dl.bxep[43] = -5496370838578224550L;
        dl.bxep[44] = -2735267001247728776L;
        dl.bxep[45] = 868252622994179273L;
        dl.bxep[46] = -6188260504039931241L;
        dl.bxep[47] = 6362956078814373366L;
        dl.bxep[48] = 5513842157466324928L;
        dl.bxep[49] = 8957599910292564655L;
        dl.bxep[50] = -8112957224279039052L;
        dl.bxep[51] = -5479210521047991580L;
        dl.bxep[52] = -2726632335775857112L;
        dl.bxep[53] = -1679246818319042885L;
        dl.bxep[54] = 3151869628197185670L;
        dl.bxep[55] = -7776090427775797697L;
        dl.bxep[56] = -8693128884020847156L;
        dl.bxep[57] = -549536245088601037L;
        dl.bxep[58] = -3677091023226201424L;
        dl.bxep[59] = -5331863170529505217L;
        dl.bxep[60] = 539098137335787922L;
        dl.bxep[61] = -8577451275260406803L;
        dl.bxep[62] = 8670329435939312876L;
        dl.bxep[63] = -6222636866945403668L;
        dl.bxep[64] = 5955143283613176513L;
        dl.bxep[65] = -9092305468377751151L;
        dl.bxep[66] = -7827823582414531001L;
        dl.bxep[67] = -7604068895773257399L;
        dl.bxep[68] = -5456748207701748439L;
        dl.bxep[69] = -4978484738608032568L;
        dl.bxep[70] = 158174588321442032L;
        dl.bxep[71] = 4437590922098973753L;
        dl.bxep[72] = 8415334668950034963L;
        dl.bxep[73] = 5883024037725787278L;
        dl.bxep[74] = -2823649841163363758L;
        dl.bxep[75] = -2480898618862774940L;
        dl.bxep[76] = 667821314929458816L;
        dl.bxep[77] = 7543565091001449783L;
        dl.bxep[78] = 6099457877868881833L;
        dl.bxep[79] = -5708128883847515844L;
        dl.bxep[80] = -7700064047068490679L;
        dl.bxep[81] = -2336445984167825572L;
        dl.bxep[82] = 4748972887605601922L;
        dl.bxep[83] = 5019416307895632701L;
        dl.bxep[84] = -4143015548385319724L;
        dl.bxep[85] = -7833350948473268071L;
        dl.bxep[86] = 7453075945179953580L;
        dl.bxep[87] = 3521047970738864752L;
        dl.bxep[88] = -7513217362854147487L;
        dl.bxep[89] = -3305095504620492116L;
        dl.bxep[90] = 2806504227844080054L;
        dl.bxep[91] = -6560231741284332553L;
        dl.bxep[92] = -8971580771979387158L;
        dl.bxep[93] = 6928584149554860323L;
        dl.bxep[94] = -4494275360068633491L;
        dl.bxep[95] = -7790778093416186148L;
        dl.bxep[96] = 624267445148380488L;
        dl.bxep[97] = 7349238741282959188L;
        dl.bxep[98] = -9063384141628729664L;
        dl.bxep[99] = 303098254856753571L;
    }

    private static /* synthetic */ void bxzg() {
        dl.bxey[200] = -1378918230;
        dl.bxey[201] = -803043688;
        dl.bxey[202] = 479028950;
        dl.bxey[203] = -1168635374;
        dl.bxey[204] = 1191073680;
        dl.bxey[205] = 1608065123;
        dl.bxey[206] = 1893679485;
        dl.bxey[207] = -61571308;
        dl.bxey[208] = 1371316646;
        dl.bxey[209] = -1110079700;
        dl.bxey[210] = -1587447947;
        dl.bxey[211] = 432938608;
        dl.bxey[212] = -861885462;
        dl.bxey[213] = -1508967585;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static List<String> getFriendNames() {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block14: while (true) {
            v0 /* !! */  = (long)(dl.bxet("bxuc", bxek(int ), (int)128) - dl.bxet("bxub", bxek(int ), (int)127));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 470078066: {
                    continue block14;
                }
                case 528750483: {
                    break block14;
                }
            }
            break;
        }
        var2 = dl.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxud", bxek(int ), (int)129)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == dl.bxet("bxue", bxew(int ), (int)138)) break;
            v1 /* !! */  = (long)dl.bxet("bxuf", bxew(int ), (int)139);
        }
        var1_1 /* !! */  = dl.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxug", bxek(int ), (int)130)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dl.bxet("bxuh", bxew(int ), (int)140)) break;
            v2 /* !! */  = (long)dl.bxet("bxui", bxew(int ), (int)141);
        }
        var0_2 = dl.a;
        if (var2) {
            throw null;
lbl25:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl28:
        // 1 sources

        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = dl.eq;
                if (true) ** GOTO lbl35
                block18: while (true) {
                    v3 /* !! */  = (long)(dl.bxet("bxuk", bxek(int ), (int)132) - dl.bxet("bxuj", bxek(int ), (int)131));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 379701475: {
                            continue block18;
                        }
                        case 528750483: {
                            break block18;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = dl.eq - dl.bxet("bxul", bxek(int ), (int)133)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == dl.bxet("bxum", bxew(int ), (int)142)) break;
                    v4 /* !! */  = (long)dl.bxet("bxun", bxew(int ), (int)143);
                }
                v5 = dl.friends.stream();
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = dl.eq - dl.bxet("bxuo", bxek(int ), (int)134)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == dl.bxet("bxup", bxew(int ), (int)144)) break;
                    v6 /* !! */  = (long)dl.bxet("bxuq", bxew(int ), (int)145);
                }
                v7 = (Function<dk, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getName(), (Lruhack/phobia/dk;)Ljava/lang/String;)();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = dl.eq - dl.bxet("bxur", bxek(int ), (int)135)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == dl.bxet("bxus", bxew(int ), (int)146)) break;
                    v8 /* !! */  = (long)dl.bxet("bxut", bxew(int ), (int)147);
                }
                v9 = v5.map(v7);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = dl.eq - dl.bxet("bxuu", bxek(int ), (int)136)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == dl.bxet("bxuv", bxew(int ), (int)148)) break;
                    v10 /* !! */  = (long)dl.bxet("bxuw", bxew(int ), (int)149);
                }
                v11 = Collectors.toList();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_6 = dl.eq - dl.bxet("bxux", bxek(int ), (int)137)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == dl.bxet("bxuy", bxew(int ), (int)150)) break;
                    v12 /* !! */  = (long)dl.bxet("bxuz", bxew(int ), (int)151);
                }
                return v9.collect(v11);
            }
lbl70:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)dl.bxet("bxva", bxew(int ), (int)152);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                do {
                    var1_1 /* !! */  = (int)dl.bxet("bxvb", bxew(int ), (int)153);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)dl.bxet("bxvc", bxew(int ), (int)154);
                if (!var2) ** GOTO lbl70
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)dl.bxet("bxvd", bxew(int ), (int)155);
        ** while (!var2)
lbl87:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void clearAndSave() {
        v0 /* !! */  = dl.eq;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - dl.bxet("bxtb", bxek(int ), (int)113));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -973865918: {
                    v1 = dl.bxet("bxtc", bxek(int ), (int)114);
                    continue block30;
                }
                case -913092167: {
                    v1 = dl.bxet("bxtd", bxek(int ), (int)115);
                    continue block30;
                }
                case 528750483: {
                    break block30;
                }
            }
            break;
        }
        var2 = dl.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dl.eq - dl.bxet("bxte", bxek(int ), (int)116)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dl.bxet("bxtf", bxew(int ), (int)126)) break;
            v2 /* !! */  = (long)dl.bxet("bxtg", bxew(int ), (int)127);
        }
        var1_1 /* !! */  = dl.b;
        v3 /* !! */  = dl.eq;
        if (true) ** GOTO lbl25
        block32: while (true) {
            v3 /* !! */  = (long)(v4 - dl.bxet("bxth", bxek(int ), (int)117));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1541111978: {
                    v4 = dl.bxet("bxti", bxek(int ), (int)118);
                    continue block32;
                }
                case 528750483: {
                    break block32;
                }
                case 693953360: {
                    v4 = dl.bxet("bxtj", bxek(int ), (int)119);
                    continue block32;
                }
            }
            break;
        }
        var0_2 = dl.a;
        if (var2) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl37
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = dl.eq - dl.bxet("bxtk", bxek(int ), (int)120)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == dl.bxet("bxtl", bxew(int ), (int)128)) break;
            v5 /* !! */  = (long)dl.bxet("bxtm", bxew(int ), (int)129);
        }
        dl.clear();
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl37
                v6 /* !! */  = dl.eq;
                if (true) ** GOTO lbl54
                block35: while (true) {
                    v6 /* !! */  = (long)(dl.bxet("bxto", bxek(int ), (int)122) - dl.bxet("bxtn", bxek(int ), (int)121));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -750944050: {
                            continue block35;
                        }
                        case 528750483: {
                            break block35;
                        }
                    }
                    break;
                }
                v7 = ak.getInstance();
                v8 /* !! */  = dl.eq;
                if (true) ** GOTO lbl64
                block36: while (true) {
                    v8 /* !! */  = (long)(v9 - dl.bxet("bxtp", bxek(int ), (int)123));
lbl64:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1228082283: {
                            v9 = dl.bxet("bxtq", bxek(int ), (int)124);
                            continue block36;
                        }
                        case -263571228: {
                            v9 = dl.bxet("bxtr", bxek(int ), (int)125);
                            continue block36;
                        }
                        case 528750483: {
                            break block36;
                        }
                        case 1425460850: {
                            v9 = dl.bxet("bxts", bxek(int ), (int)126);
                            continue block36;
                        }
                    }
                    break;
                }
                v7.save();
                if (var0_2 || var0_2) ** continue;
                return;
            }
            case 0: {
                do {
                    var1_1 /* !! */  = (int)dl.bxet("bxtt", bxew(int ), (int)130);
                } while (!var2);
                throw null;
            }
lbl84:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)dl.bxet("bxtu", bxew(int ), (int)131);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 2: {
                var1_1 /* !! */  = (int)dl.bxet("bxtv", bxew(int ), (int)132);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl106
            }
lbl94:
            // 3 sources

            case 3: {
                var1_1 /* !! */  = (int)dl.bxet("bxtw", bxew(int ), (int)133);
                if (var2) {
                    throw null;
                }
            }
            case 4: {
                var1_1 /* !! */  = (int)dl.bxet("bxtx", bxew(int ), (int)134);
                if (!var2) ** GOTO lbl94
                throw null;
            }
lbl102:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)dl.bxet("bxty", bxew(int ), (int)135);
                if (!var2) ** GOTO lbl94
                throw null;
            }
lbl106:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)dl.bxet("bxtz", bxew(int ), (int)136);
                    if (!var2) ** GOTO lbl84
                    throw null;
                }
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)dl.bxet("bxua", bxew(int ), (int)137);
        ** while (!var2)
lbl114:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bxzh() {
        dl.bxfa[0] = 1647315798;
        dl.bxfa[1] = 296044929;
        dl.bxfa[2] = 75196241;
        dl.bxfa[3] = -511867412;
        dl.bxfa[4] = 1155247710;
        dl.bxfa[5] = 1710779367;
        dl.bxfa[6] = -1782470757;
        dl.bxfa[7] = 344566797;
        dl.bxfa[8] = -1517452274;
        dl.bxfa[9] = 2101401128;
        dl.bxfa[10] = -1310515448;
        dl.bxfa[11] = 1463155349;
        dl.bxfa[12] = 587619990;
        dl.bxfa[13] = -186678164;
        dl.bxfa[14] = -718286204;
        dl.bxfa[15] = -670879477;
        dl.bxfa[16] = -451951775;
        dl.bxfa[17] = -1293528699;
        dl.bxfa[18] = -1599406523;
        dl.bxfa[19] = 1752096842;
        dl.bxfa[20] = 149665719;
        dl.bxfa[21] = 676519609;
        dl.bxfa[22] = 1872977756;
        dl.bxfa[23] = 240288904;
        dl.bxfa[24] = 98147769;
        dl.bxfa[25] = 170250739;
        dl.bxfa[26] = 271181201;
        dl.bxfa[27] = -1344409987;
        dl.bxfa[28] = -371481415;
        dl.bxfa[29] = 733685020;
        dl.bxfa[30] = -211396933;
        dl.bxfa[31] = 449312678;
        dl.bxfa[32] = -1551893312;
        dl.bxfa[33] = -594909907;
        dl.bxfa[34] = 729604885;
        dl.bxfa[35] = -1413253159;
        dl.bxfa[36] = 1520458699;
        dl.bxfa[37] = -1013830769;
        dl.bxfa[38] = -1652103013;
        dl.bxfa[39] = 1586326437;
        dl.bxfa[40] = -1147296811;
        dl.bxfa[41] = 1974394526;
        dl.bxfa[42] = -251235507;
        dl.bxfa[43] = -482062883;
        dl.bxfa[44] = -842938151;
        dl.bxfa[45] = -170478959;
        dl.bxfa[46] = 1508378586;
        dl.bxfa[47] = -1217809590;
        dl.bxfa[48] = -404235035;
        dl.bxfa[49] = -719037573;
        dl.bxfa[50] = -72105670;
        dl.bxfa[51] = -105481792;
        dl.bxfa[52] = 261579576;
        dl.bxfa[53] = -533283611;
        dl.bxfa[54] = 1580674940;
        dl.bxfa[55] = 1990885734;
        dl.bxfa[56] = -20532351;
        dl.bxfa[57] = -91231529;
        dl.bxfa[58] = -952563388;
        dl.bxfa[59] = -1521755622;
        dl.bxfa[60] = -2126305731;
        dl.bxfa[61] = -146060509;
        dl.bxfa[62] = 1513272901;
        dl.bxfa[63] = 1629098609;
        dl.bxfa[64] = -910309101;
        dl.bxfa[65] = -1647662300;
        dl.bxfa[66] = -437783157;
        dl.bxfa[67] = 47419121;
        dl.bxfa[68] = -524712763;
        dl.bxfa[69] = -372977803;
        dl.bxfa[70] = -1435464915;
        dl.bxfa[71] = 1721259882;
        dl.bxfa[72] = 951588554;
        dl.bxfa[73] = -1568863176;
        dl.bxfa[74] = -364021593;
        dl.bxfa[75] = -746838833;
        dl.bxfa[76] = -156987791;
        dl.bxfa[77] = 119850944;
        dl.bxfa[78] = -71337856;
        dl.bxfa[79] = 606440224;
        dl.bxfa[80] = 124354455;
        dl.bxfa[81] = 1707068915;
        dl.bxfa[82] = -678764381;
        dl.bxfa[83] = -120236728;
        dl.bxfa[84] = -2045158378;
        dl.bxfa[85] = -2039674608;
        dl.bxfa[86] = 2017717380;
        dl.bxfa[87] = 2031375409;
        dl.bxfa[88] = 1426420638;
        dl.bxfa[89] = 1296929039;
        dl.bxfa[90] = -1919663290;
        dl.bxfa[91] = 1228229358;
        dl.bxfa[92] = -1973406593;
        dl.bxfa[93] = -957993746;
        dl.bxfa[94] = -1441949758;
        dl.bxfa[95] = -1863043079;
        dl.bxfa[96] = -1105767152;
        dl.bxfa[97] = 1021976306;
        dl.bxfa[98] = -1504357238;
        dl.bxfa[99] = -1592191098;
    }
}

