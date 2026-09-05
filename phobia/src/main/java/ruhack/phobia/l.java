/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2568
 *  net.minecraft.class_2568$class_10613
 *  net.minecraft.class_5250
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.class_124;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2568;
import net.minecraft.class_5250;
import ruhack.phobia.aa;
import ruhack.phobia.f;
import ruhack.phobia.g;
import ruhack.phobia.i;
import ruhack.phobia.o;

public class l
extends f {
    private static long[] bfwv;
    public static final boolean c;
    public static final int b;
    private static int[] bfnu;
    private static int[] bfnt;
    private static long[] bfww;
    public static final long dd = -6361086885696465607L;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Stream<String> tabComplete(String var1_1, String[] var2_2) {
        block120: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = l.dd - l.bfnv("bfwx", bfwu(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == l.bfnv("bfwy", bfns(int ), (int)232)) break;
                v0 /* !! */  = (long)l.bfnv("bfwz", bfns(int ), (int)233);
            }
            var6_3 = l.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = l.dd - l.bfnv("bfxa", bfwu(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == l.bfnv("bfxb", bfns(int ), (int)234)) break;
                v1 /* !! */  = (long)l.bfnv("bfxc", bfns(int ), (int)235);
            }
            var5_4 /* !! */  = l.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = l.dd - l.bfnv("bfxd", bfwu(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == l.bfnv("bfxe", bfns(int ), (int)236)) break;
                v2 /* !! */  = (long)l.bfnv("bfxf", bfns(int ), (int)237);
            }
            var4_5 = l.a;
            if (var6_3) {
                throw null;
lbl21:
                // 12 sources

                return null;
            }
            if (var4_5 || var4_5) ** GOTO lbl21
            if (var2_2.length != l.bfnv("bfxg", bfns(int ), (int)238)) break block120;
            if (var4_5 || var4_5) ** GOTO lbl21
            v3 /* !! */  = l.dd;
            if (true) ** GOTO lbl30
            block81: while (true) {
                v3 /* !! */  = (long)(l.bfnv("bfxi", bfwu(int ), (int)4) - l.bfnv("bfxh", bfwu(int ), (int)3));
lbl30:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case 274613106: {
                        continue block81;
                    }
                    case 279614777: {
                        break block81;
                    }
                }
                break;
            }
            v4 /* !! */  = l.dd;
            if (true) ** GOTO lbl39
            block82: while (true) {
                v4 /* !! */  = (long)(v5 - l.bfnv("bfxj", bfwu(int ), (int)5));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1585440622: {
                        v5 = l.bfnv("bfxk", bfwu(int ), (int)6);
                        continue block82;
                    }
                    case 279614777: {
                        break block82;
                    }
                    case 1109221760: {
                        v5 = l.bfnv("bfxl", bfwu(int ), (int)7);
                        continue block82;
                    }
                }
                break;
            }
            v6 = new i();
            v7 = new String[]{"load", "save", "reset", "delete", "list", "dir"};
            v8 /* !! */  = l.dd;
            if (true) ** GOTO lbl54
            block83: while (true) {
                v8 /* !! */  = (long)(v9 - l.bfnv("bfxm", bfwu(int ), (int)8));
lbl54:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1030096119: {
                        v9 = l.bfnv("bfxn", bfwu(int ), (int)9);
                        continue block83;
                    }
                    case 279614777: {
                        break block83;
                    }
                    case 1032999695: {
                        v9 = l.bfnv("bfxo", bfwu(int ), (int)10);
                        continue block83;
                    }
                }
                break;
            }
            v10 = v6.append(v7);
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_3 = l.dd - l.bfnv("bfxp", bfwu(int ), (int)11)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == l.bfnv("bfxq", bfns(int ), (int)239)) break;
                v11 /* !! */  = (long)l.bfnv("bfxr", bfns(int ), (int)240);
            }
            v12 = v10.sortAlphabetically();
            v13 = var2_2[0];
            v14 /* !! */  = l.dd;
            if (true) ** GOTO lbl75
            block85: while (true) {
                v14 /* !! */  = (long)(l.bfnv("bfxt", bfwu(int ), (int)13) - l.bfnv("bfxs", bfwu(int ), (int)12));
lbl75:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case 279614777: {
                        break block85;
                    }
                    case 947852656: {
                        continue block85;
                    }
                }
                break;
            }
            v15 = v12.filterPrefix(v13);
            v16 /* !! */  = l.dd;
            if (true) ** GOTO lbl85
            block86: while (true) {
                v16 /* !! */  = (long)(l.bfnv("bfxv", bfwu(int ), (int)15) - l.bfnv("bfxu", bfwu(int ), (int)14));
lbl85:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -814680655: {
                        continue block86;
                    }
                    case 279614777: {
                        break block86;
                    }
                }
                break;
            }
            return v15.stream();
        }
        if (var4_5 || var4_5) ** GOTO lbl21
        if (var2_2.length != l.bfnv("bfxw", bfns(int ), (int)241)) ** GOTO lbl226
        if (var4_5 || var4_5) ** GOTO lbl21
        v17 = var2_2[0];
        v18 /* !! */  = l.dd;
        if (true) ** GOTO lbl100
        block87: while (true) {
            v18 /* !! */  = (long)(v19 - l.bfnv("bfxx", bfwu(int ), (int)16));
lbl100:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1366359498: {
                    v19 = l.bfnv("bfxy", bfwu(int ), (int)17);
                    continue block87;
                }
                case -926423160: {
                    v19 = l.bfnv("bfxz", bfwu(int ), (int)18);
                    continue block87;
                }
                case 279614777: {
                    break block87;
                }
            }
            break;
        }
        var3_6 = v17.toLowerCase();
        if (var4_5 || var4_5) ** GOTO lbl21
        v20 /* !! */  = l.dd;
        if (true) ** GOTO lbl115
        block88: while (true) {
            v20 /* !! */  = (long)(v21 - l.bfnv("bfya", bfwu(int ), (int)19));
lbl115:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case 279614777: {
                    break block88;
                }
                case 784340705: {
                    v21 = l.bfnv("bfyb", bfwu(int ), (int)20);
                    continue block88;
                }
                case 1749024403: {
                    v21 = l.bfnv("bfyc", bfwu(int ), (int)21);
                    continue block88;
                }
            }
            break;
        }
        if (var3_6.equals("load")) ** GOTO lbl168
        if (var4_5) ** GOTO lbl21
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_4 = l.dd - l.bfnv("bfyd", bfwu(int ), (int)22)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == l.bfnv("bfye", bfns(int ), (int)242)) break;
            v22 /* !! */  = (long)l.bfnv("bfyf", bfns(int ), (int)243);
        }
        if (var3_6.equals("save")) ** GOTO lbl168
        if (var4_5) ** GOTO lbl21
        v23 /* !! */  = l.dd;
        if (true) ** GOTO lbl137
        block90: while (true) {
            v23 /* !! */  = (long)(v24 - l.bfnv("bfyg", bfwu(int ), (int)23));
lbl137:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case -1288806099: {
                    v24 = l.bfnv("bfyh", bfwu(int ), (int)24);
                    continue block90;
                }
                case 279614777: {
                    break block90;
                }
                case 725320020: {
                    v24 = l.bfnv("bfyi", bfwu(int ), (int)25);
                    continue block90;
                }
                case 1549953432: {
                    v24 = l.bfnv("bfyj", bfwu(int ), (int)26);
                    continue block90;
                }
            }
            break;
        }
        if (var3_6.equals("delete")) ** GOTO lbl168
        if (var4_5) ** GOTO lbl21
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_5 = l.dd - l.bfnv("bfyk", bfwu(int ), (int)27)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == l.bfnv("bfyl", bfns(int ), (int)244)) break;
            v25 /* !! */  = (long)l.bfnv("bfym", bfns(int ), (int)245);
        }
        if (var3_6.equals("remove")) ** GOTO lbl168
        if (var4_5) ** GOTO lbl21
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_6 = l.dd - l.bfnv("bfyn", bfwu(int ), (int)28)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == l.bfnv("bfyo", bfns(int ), (int)246)) break;
            v26 /* !! */  = (long)l.bfnv("bfyp", bfns(int ), (int)247);
        }
        if (!var3_6.equals("del")) ** GOTO lbl226
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5) ** GOTO lbl21
lbl168:
                // 5 sources

                if (var4_5 || var4_5) ** GOTO lbl21
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_7 = l.dd - l.bfnv("bfyq", bfwu(int ), (int)29)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == l.bfnv("bfyr", bfns(int ), (int)248)) break;
                    v27 /* !! */  = (long)l.bfnv("bfys", bfns(int ), (int)249);
                }
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_8 = l.dd - l.bfnv("bfyt", bfwu(int ), (int)30)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == l.bfnv("bfyu", bfns(int ), (int)250)) break;
                    v28 /* !! */  = (long)l.bfnv("bfyv", bfns(int ), (int)251);
                }
                v29 = new i();
                v30 /* !! */  = l.dd;
                if (true) ** GOTO lbl184
                block95: while (true) {
                    v30 /* !! */  = (long)(l.bfnv("bfyx", bfwu(int ), (int)32) - l.bfnv("bfyw", bfwu(int ), (int)31));
lbl184:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 279614777: {
                            break block95;
                        }
                        case 1523293230: {
                            continue block95;
                        }
                    }
                    break;
                }
                v31 = this.getConfigs();
                v32 = new String[]{};
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_9 = l.dd - l.bfnv("bfyy", bfwu(int ), (int)33)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == l.bfnv("bfyz", bfns(int ), (int)252)) break;
                    v33 /* !! */  = (long)l.bfnv("bfza", bfns(int ), (int)253);
                }
                v34 /* !! */  = l.dd;
                if (true) ** GOTO lbl200
                block97: while (true) {
                    v34 /* !! */  = (long)(v35 - l.bfnv("bfzb", bfwu(int ), (int)34));
lbl200:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case 279614777: {
                            break block97;
                        }
                        case 758286656: {
                            v35 = l.bfnv("bfzc", bfwu(int ), (int)35);
                            continue block97;
                        }
                        case 798855788: {
                            v35 = l.bfnv("bfzd", bfwu(int ), (int)36);
                            continue block97;
                        }
                        case 1739849824: {
                            v35 = l.bfnv("bfze", bfwu(int ), (int)37);
                            continue block97;
                        }
                    }
                    break;
                }
                v36 = v29.append(v31.toArray(v32));
                v37 = var2_2[1];
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_10 = l.dd - l.bfnv("bfzf", bfwu(int ), (int)38)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == l.bfnv("bfzg", bfns(int ), (int)254)) break;
                    v38 /* !! */  = (long)l.bfnv("bfzh", bfns(int ), (int)255);
                }
                v39 = v36.filterPrefix(v37);
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_11 = l.dd - l.bfnv("bfzi", bfwu(int ), (int)39)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == l.bfnv("bfzj", bfns(int ), (int)256)) break;
                    v40 /* !! */  = (long)l.bfnv("bfzk", bfns(int ), (int)257);
                }
                return v39.stream();
            }
lbl226:
            // 2 sources

            if (!var4_5 && !var4_5) ** break;
            ** continue;
            v41 /* !! */  = l.dd;
            if (true) ** GOTO lbl232
            block100: while (true) {
                v41 /* !! */  = (long)(v42 - l.bfnv("bfzl", bfwu(int ), (int)40));
lbl232:
                // 2 sources

                switch ((int)v41 /* !! */ ) {
                    case 2251019: {
                        v42 = l.bfnv("bfzm", bfwu(int ), (int)41);
                        continue block100;
                    }
                    case 279614777: {
                        break block100;
                    }
                    case 963577149: {
                        v42 = l.bfnv("bfzn", bfwu(int ), (int)42);
                        continue block100;
                    }
                }
                break;
            }
            return Stream.empty();
            case 0: {
                var5_4 /* !! */  = (int)l.bfnv("bfzo", bfns(int ), (int)258);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl247:
            // 4 sources

            case 1: {
                var5_4 /* !! */  = (int)l.bfnv("bfzp", bfns(int ), (int)259);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl252:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)l.bfnv("bfzq", bfns(int ), (int)260);
                if (!var6_3) ** GOTO lbl247
                throw null;
            }
lbl256:
            // 2 sources

            case 3: {
                var5_4 /* !! */  = (int)l.bfnv("bfzr", bfns(int ), (int)261);
                if (!var6_3) ** GOTO lbl247
                throw null;
            }
            case 4: {
                var5_4 /* !! */  = (int)l.bfnv("bfzs", bfns(int ), (int)262);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl314
            }
            case 5: {
                var5_4 /* !! */  = (int)l.bfnv("bfzt", bfns(int ), (int)263);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl270:
            // 3 sources

            case 6: {
                var5_4 /* !! */  = (int)l.bfnv("bfzu", bfns(int ), (int)264);
                if (var6_3) {
                    throw null;
                }
            }
            case 7: {
                var5_4 /* !! */  = (int)l.bfnv("bfzv", bfns(int ), (int)265);
                if (!var6_3) ** GOTO lbl270
                throw null;
            }
lbl278:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)l.bfnv("bfzw", bfns(int ), (int)266);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl283:
            // 3 sources

            case 9: {
                var5_4 /* !! */  = (int)l.bfnv("bfzx", bfns(int ), (int)267);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl298
            }
            case 10: {
                var5_4 /* !! */  = (int)l.bfnv("bfzy", bfns(int ), (int)268);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl293:
            // 3 sources

            case 11: {
                var5_4 /* !! */  = (int)l.bfnv("bfzz", bfns(int ), (int)269);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl302
            }
lbl298:
            // 4 sources

            case 12: {
                var5_4 /* !! */  = (int)l.bfnv("bgaa", bfns(int ), (int)270);
                if (!var6_3) ** GOTO lbl270
                throw null;
            }
lbl302:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)l.bfnv("bgab", bfns(int ), (int)271);
                if (!var6_3) ** GOTO lbl256
                throw null;
            }
            case 14: {
                var5_4 /* !! */  = (int)l.bfnv("bgac", bfns(int ), (int)272);
                if (!var6_3) ** GOTO lbl283
                throw null;
            }
lbl310:
            // 3 sources

            case 15: {
                var5_4 /* !! */  = (int)l.bfnv("bgad", bfns(int ), (int)273);
                if (!var6_3) ** GOTO lbl247
                throw null;
            }
lbl314:
            // 2 sources

            case 16: {
                var5_4 /* !! */  = (int)l.bfnv("bgae", bfns(int ), (int)274);
                if (!var6_3) ** GOTO lbl252
                throw null;
            }
            case 17: {
                var5_4 /* !! */  = (int)l.bfnv("bgaf", bfns(int ), (int)275);
                if (!var6_3) ** GOTO lbl293
                throw null;
            }
            case 18: {
                var5_4 /* !! */  = (int)l.bfnv("bgag", bfns(int ), (int)276);
                if (var6_3) {
                    throw null;
                }
            }
            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)l.bfnv("bgah", bfns(int ), (int)277);
                    if (!var6_3) ** GOTO lbl298
                    throw null;
                }
            }
            case 20: {
                var5_4 /* !! */  = (int)l.bfnv("bgai", bfns(int ), (int)278);
                if (!var6_3) ** GOTO lbl298
                throw null;
            }
            case 21: 
        }
        var5_4 /* !! */  = (int)l.bfnv("bgaj", bfns(int ), (int)279);
        ** while (!var6_3)
lbl338:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public String getShortDesc() {
        v0 /* !! */  = l.dd;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(l.bfnv("bgal", bfwu(int ), (int)44) - l.bfnv("bgak", bfwu(int ), (int)43));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -741399202: {
                    continue block16;
                }
                case 279614777: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = l.c;
        v1 /* !! */  = l.dd;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - l.bfnv("bgam", bfwu(int ), (int)45));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -448378566: {
                    v2 = l.bfnv("bgan", bfwu(int ), (int)46);
                    continue block17;
                }
                case 275671884: {
                    v2 = l.bfnv("bgao", bfwu(int ), (int)47);
                    continue block17;
                }
                case 279614777: {
                    break block17;
                }
                case 374822100: {
                    v2 = l.bfnv("bgap", bfwu(int ), (int)48);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = l.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = l.dd - l.bfnv("bgaq", bfwu(int ), (int)49)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == l.bfnv("bgar", bfns(int ), (int)280)) break;
            v3 /* !! */  = (long)l.bfnv("bgas", bfns(int ), (int)281);
        }
        var1_3 = l.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                return "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u043e\u0432\u0430\u0442\u044c \u0441 \u043a\u043e\u043d\u0444\u0438\u0433\u0430\u043c\u0438 \u0432 \u0447\u0438\u0442\u0435";
            }
lbl44:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)l.bfnv("bgat", bfns(int ), (int)282);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl54
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)l.bfnv("bgau", bfns(int ), (int)283);
                } while (!var3_1);
                throw null;
            }
lbl54:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)l.bfnv("bgav", bfns(int ), (int)284);
                    if (!var3_1) ** GOTO lbl44
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)l.bfnv("bgaw", bfns(int ), (int)285);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bhbi() {
        l.bfnu[200] = -179543436;
        l.bfnu[201] = -875238435;
        l.bfnu[202] = 602176086;
        l.bfnu[203] = 1937880715;
        l.bfnu[204] = -1343288440;
        l.bfnu[205] = 559767371;
        l.bfnu[206] = -1882884679;
        l.bfnu[207] = 1298799933;
        l.bfnu[208] = 2080993750;
        l.bfnu[209] = -1766928350;
        l.bfnu[210] = -1475525315;
        l.bfnu[211] = -312270267;
        l.bfnu[212] = 1352452961;
        l.bfnu[213] = 930669791;
        l.bfnu[214] = 230601759;
        l.bfnu[215] = -2062910597;
        l.bfnu[216] = -701337006;
        l.bfnu[217] = -692904099;
        l.bfnu[218] = 1125438824;
        l.bfnu[219] = -257920501;
        l.bfnu[220] = 1273952779;
        l.bfnu[221] = -2095264169;
        l.bfnu[222] = 1453945113;
        l.bfnu[223] = -529458784;
        l.bfnu[224] = -1105657477;
        l.bfnu[225] = -1660153045;
        l.bfnu[226] = 1954058403;
        l.bfnu[227] = -629713474;
        l.bfnu[228] = -544581965;
        l.bfnu[229] = 906035168;
        l.bfnu[230] = -399778148;
        l.bfnu[231] = 1046499695;
        l.bfnu[232] = 1536150960;
        l.bfnu[233] = -1621340895;
        l.bfnu[234] = -1816151339;
        l.bfnu[235] = -1768692018;
        l.bfnu[236] = 1857388226;
        l.bfnu[237] = 1692876893;
        l.bfnu[238] = 1936871835;
        l.bfnu[239] = -986394138;
        l.bfnu[240] = -793532775;
        l.bfnu[241] = -670981026;
        l.bfnu[242] = 1464871074;
        l.bfnu[243] = -1439668864;
        l.bfnu[244] = 312511866;
        l.bfnu[245] = -1056573180;
        l.bfnu[246] = 931135186;
        l.bfnu[247] = 33044302;
        l.bfnu[248] = 802001811;
        l.bfnu[249] = -709923366;
        l.bfnu[250] = 337432533;
        l.bfnu[251] = -259339048;
        l.bfnu[252] = 882975242;
        l.bfnu[253] = -1083544078;
        l.bfnu[254] = -303057644;
        l.bfnu[255] = -513412980;
        l.bfnu[256] = -448923975;
        l.bfnu[257] = 1814673876;
        l.bfnu[258] = 563572830;
        l.bfnu[259] = -1658684026;
        l.bfnu[260] = 807727339;
        l.bfnu[261] = 11951276;
        l.bfnu[262] = 1547325497;
        l.bfnu[263] = 817265814;
        l.bfnu[264] = 1135348424;
        l.bfnu[265] = 452836403;
        l.bfnu[266] = -123283830;
        l.bfnu[267] = -1887848547;
        l.bfnu[268] = 120389026;
        l.bfnu[269] = -1623396618;
        l.bfnu[270] = -401084726;
        l.bfnu[271] = -426691094;
        l.bfnu[272] = 1313641397;
        l.bfnu[273] = 1348373123;
        l.bfnu[274] = 1851681510;
        l.bfnu[275] = -1684441545;
        l.bfnu[276] = -2078035500;
        l.bfnu[277] = -1433445805;
        l.bfnu[278] = -928256683;
        l.bfnu[279] = -1043721935;
        l.bfnu[280] = 643893189;
        l.bfnu[281] = 240304885;
        l.bfnu[282] = 1990420002;
        l.bfnu[283] = -136137173;
        l.bfnu[284] = 1627310219;
        l.bfnu[285] = -1049085749;
        l.bfnu[286] = -482446785;
        l.bfnu[287] = 1358682489;
        l.bfnu[288] = 783264806;
        l.bfnu[289] = 369426107;
        l.bfnu[290] = 1056352340;
        l.bfnu[291] = 664183489;
        l.bfnu[292] = -584863021;
        l.bfnu[293] = 739625249;
        l.bfnu[294] = -1485699095;
        l.bfnu[295] = 422719220;
        l.bfnu[296] = 310365812;
        l.bfnu[297] = 1633725379;
        l.bfnu[298] = -1234056461;
        l.bfnu[299] = 1780918470;
    }

    private static /* synthetic */ void bhbd() {
        l.bfnt[200] = -179543499;
        l.bfnt[201] = -875238498;
        l.bfnt[202] = 602176234;
        l.bfnt[203] = 1937880754;
        l.bfnt[204] = -1343288575;
        l.bfnt[205] = 559767383;
        l.bfnt[206] = -1882884759;
        l.bfnt[207] = 1298799970;
        l.bfnt[208] = 2080993757;
        l.bfnt[209] = -1766928335;
        l.bfnt[210] = -1475525304;
        l.bfnt[211] = -312270095;
        l.bfnt[212] = 1352452911;
        l.bfnt[213] = 930669814;
        l.bfnt[214] = 230601894;
        l.bfnt[215] = -2062910642;
        l.bfnt[216] = -701337081;
        l.bfnt[217] = -692904119;
        l.bfnt[218] = 1125438915;
        l.bfnt[219] = -257920461;
        l.bfnt[220] = 1273952818;
        l.bfnt[221] = -2095264109;
        l.bfnt[222] = 1453945234;
        l.bfnt[223] = -529458692;
        l.bfnt[224] = -1105657564;
        l.bfnt[225] = -1660152930;
        l.bfnt[226] = 1954058379;
        l.bfnt[227] = -629713552;
        l.bfnt[228] = -544581908;
        l.bfnt[229] = 906034987;
        l.bfnt[230] = -399778271;
        l.bfnt[231] = 1046499610;
        l.bfnt[232] = -1536150961;
        l.bfnt[233] = 1794881050;
        l.bfnt[234] = 1816151338;
        l.bfnt[235] = 655907299;
        l.bfnt[236] = -1857388227;
        l.bfnt[237] = -2127745806;
        l.bfnt[238] = 1936871834;
        l.bfnt[239] = 986394137;
        l.bfnt[240] = -1665332158;
        l.bfnt[241] = -670981028;
        l.bfnt[242] = -1464871075;
        l.bfnt[243] = -30052329;
        l.bfnt[244] = -312511867;
        l.bfnt[245] = -1674089719;
        l.bfnt[246] = -931135187;
        l.bfnt[247] = 457361543;
        l.bfnt[248] = -802001812;
        l.bfnt[249] = -1680479168;
        l.bfnt[250] = -337432534;
        l.bfnt[251] = 1034068491;
        l.bfnt[252] = -882975243;
        l.bfnt[253] = -1723807099;
        l.bfnt[254] = -303057643;
        l.bfnt[255] = 241711828;
        l.bfnt[256] = 448923974;
        l.bfnt[257] = -1568048569;
        l.bfnt[258] = 563572824;
        l.bfnt[259] = -1658684028;
        l.bfnt[260] = 807727334;
        l.bfnt[261] = 11951272;
        l.bfnt[262] = 1547325480;
        l.bfnt[263] = 817265798;
        l.bfnt[264] = 1135348441;
        l.bfnt[265] = 452836407;
        l.bfnt[266] = -123283828;
        l.bfnt[267] = -1887848552;
        l.bfnt[268] = 120389043;
        l.bfnt[269] = -1623396621;
        l.bfnt[270] = -401084710;
        l.bfnt[271] = -426691104;
        l.bfnt[272] = 1313641406;
        l.bfnt[273] = 1348373122;
        l.bfnt[274] = 1851681514;
        l.bfnt[275] = -1684441550;
        l.bfnt[276] = -2078035491;
        l.bfnt[277] = -1433445808;
        l.bfnt[278] = -928256674;
        l.bfnt[279] = -1043721930;
        l.bfnt[280] = 643893188;
        l.bfnt[281] = 980658981;
        l.bfnt[282] = 1990420002;
        l.bfnt[283] = -136137176;
        l.bfnt[284] = 1627310217;
        l.bfnt[285] = -1049085750;
        l.bfnt[286] = 482446784;
        l.bfnt[287] = -706704248;
        l.bfnt[288] = -783264807;
        l.bfnt[289] = 1029351484;
        l.bfnt[290] = -1056352341;
        l.bfnt[291] = -1090750479;
        l.bfnt[292] = -584863024;
        l.bfnt[293] = 739625250;
        l.bfnt[294] = -1485699096;
        l.bfnt[295] = 422719222;
        l.bfnt[296] = -310365813;
        l.bfnt[297] = 1306357009;
        l.bfnt[298] = -1234056463;
        l.bfnt[299] = 1780918468;
    }

    private static /* synthetic */ void bhbf() {
        l.bfnt[400] = 2094252218;
        l.bfnt[401] = -1149068415;
        l.bfnt[402] = 277190466;
        l.bfnt[403] = 505485340;
    }

    private static /* synthetic */ void bhbg() {
        l.bfnu[0] = 1694148152;
        l.bfnu[1] = -190590898;
        l.bfnu[2] = -1363541615;
        l.bfnu[3] = -1156245446;
        l.bfnu[4] = -182269284;
        l.bfnu[5] = 1600080009;
        l.bfnu[6] = 1021033417;
        l.bfnu[7] = -1989064869;
        l.bfnu[8] = 756438460;
        l.bfnu[9] = 163420403;
        l.bfnu[10] = -180032196;
        l.bfnu[11] = -312374347;
        l.bfnu[12] = -1310866446;
        l.bfnu[13] = 495594353;
        l.bfnu[14] = -1597796038;
        l.bfnu[15] = -1806120045;
        l.bfnu[16] = -1026959981;
        l.bfnu[17] = -312351684;
        l.bfnu[18] = -1301714317;
        l.bfnu[19] = 890528846;
        l.bfnu[20] = -679884408;
        l.bfnu[21] = 778767080;
        l.bfnu[22] = 1575211436;
        l.bfnu[23] = -1666915086;
        l.bfnu[24] = 1265773853;
        l.bfnu[25] = -172736607;
        l.bfnu[26] = -604685392;
        l.bfnu[27] = 427118368;
        l.bfnu[28] = -21998312;
        l.bfnu[29] = -1942552392;
        l.bfnu[30] = -2127779196;
        l.bfnu[31] = 1795883573;
        l.bfnu[32] = -724315123;
        l.bfnu[33] = -1052867491;
        l.bfnu[34] = -200901155;
        l.bfnu[35] = 204911787;
        l.bfnu[36] = -331841040;
        l.bfnu[37] = 398191278;
        l.bfnu[38] = -1301981482;
        l.bfnu[39] = -1508827201;
        l.bfnu[40] = 150005996;
        l.bfnu[41] = 2082278384;
        l.bfnu[42] = -1710685475;
        l.bfnu[43] = 849625428;
        l.bfnu[44] = -566613134;
        l.bfnu[45] = 499869467;
        l.bfnu[46] = -409689618;
        l.bfnu[47] = 1758222359;
        l.bfnu[48] = -922765420;
        l.bfnu[49] = 1439495323;
        l.bfnu[50] = 722762756;
        l.bfnu[51] = 1978269154;
        l.bfnu[52] = -258581614;
        l.bfnu[53] = -78061227;
        l.bfnu[54] = -888718901;
        l.bfnu[55] = 1873871973;
        l.bfnu[56] = 893095861;
        l.bfnu[57] = 869168615;
        l.bfnu[58] = -1896516455;
        l.bfnu[59] = -822740989;
        l.bfnu[60] = 2136934747;
        l.bfnu[61] = 1033678388;
        l.bfnu[62] = 1004392863;
        l.bfnu[63] = 1444310265;
        l.bfnu[64] = -460723373;
        l.bfnu[65] = 1099777311;
        l.bfnu[66] = -294970277;
        l.bfnu[67] = 280394437;
        l.bfnu[68] = 1075324778;
        l.bfnu[69] = 869152917;
        l.bfnu[70] = -1538452399;
        l.bfnu[71] = 1364199877;
        l.bfnu[72] = -1272060603;
        l.bfnu[73] = -633271855;
        l.bfnu[74] = 1449386489;
        l.bfnu[75] = 1236719389;
        l.bfnu[76] = -2086927759;
        l.bfnu[77] = 1212628442;
        l.bfnu[78] = 1543071482;
        l.bfnu[79] = -797027618;
        l.bfnu[80] = -1526464584;
        l.bfnu[81] = 1840767568;
        l.bfnu[82] = 994237849;
        l.bfnu[83] = 878492771;
        l.bfnu[84] = -1279463498;
        l.bfnu[85] = -1625154967;
        l.bfnu[86] = -266830997;
        l.bfnu[87] = 1786323198;
        l.bfnu[88] = -1325385045;
        l.bfnu[89] = 1832712245;
        l.bfnu[90] = 1719143250;
        l.bfnu[91] = 323494100;
        l.bfnu[92] = -1459729519;
        l.bfnu[93] = 1755653673;
        l.bfnu[94] = -163401050;
        l.bfnu[95] = -1921671675;
        l.bfnu[96] = 1625848433;
        l.bfnu[97] = 34415834;
        l.bfnu[98] = 401954225;
        l.bfnu[99] = -979912177;
    }

    private static /* synthetic */ void bhbl() {
        l.bfwv[0] = 3100401684307068776L;
        l.bfwv[1] = -872276314754129465L;
        l.bfwv[2] = 1989510771674073332L;
        l.bfwv[3] = -6935502815727405306L;
        l.bfwv[4] = 3410820152084087550L;
        l.bfwv[5] = 2873408183588623399L;
        l.bfwv[6] = -1072187273531932306L;
        l.bfwv[7] = 8090817198046249437L;
        l.bfwv[8] = -9008752849502918242L;
        l.bfwv[9] = 1335554929308908275L;
        l.bfwv[10] = 7663515605445253390L;
        l.bfwv[11] = -4224966691927612121L;
        l.bfwv[12] = 6816723179540730730L;
        l.bfwv[13] = -3560400191427242271L;
        l.bfwv[14] = 2563216243883906838L;
        l.bfwv[15] = -1825062343074424998L;
        l.bfwv[16] = 4740759738315809064L;
        l.bfwv[17] = -1718641212893315933L;
        l.bfwv[18] = -208982156580451198L;
        l.bfwv[19] = -5858098195315219731L;
        l.bfwv[20] = -966536121352114087L;
        l.bfwv[21] = 8011918874339748000L;
        l.bfwv[22] = -2758041372370518407L;
        l.bfwv[23] = -7925456235364064112L;
        l.bfwv[24] = 4995593937330981950L;
        l.bfwv[25] = 7231568567786702487L;
        l.bfwv[26] = -4410913795247709029L;
        l.bfwv[27] = 3263976552108960521L;
        l.bfwv[28] = -5937464378523509299L;
        l.bfwv[29] = 6939177484294956191L;
        l.bfwv[30] = -57246029158509367L;
        l.bfwv[31] = 6887188296724182852L;
        l.bfwv[32] = -1594472249934783778L;
        l.bfwv[33] = 6264014360730384152L;
        l.bfwv[34] = -3500166302112004950L;
        l.bfwv[35] = 4595213765574615647L;
        l.bfwv[36] = 993993818117997496L;
        l.bfwv[37] = 4030278496935313016L;
        l.bfwv[38] = -2865953828312028749L;
        l.bfwv[39] = 8532051438059040733L;
        l.bfwv[40] = 2985016087719188204L;
        l.bfwv[41] = 8895527721027815676L;
        l.bfwv[42] = -5245534904977413517L;
        l.bfwv[43] = 7745003443049744282L;
        l.bfwv[44] = 1848939282576621962L;
        l.bfwv[45] = 1088053870040011923L;
        l.bfwv[46] = 3453803861726544453L;
        l.bfwv[47] = 2895598237886095701L;
        l.bfwv[48] = 4068961708610536545L;
        l.bfwv[49] = -5743953071792199224L;
        l.bfwv[50] = 7443842258998481992L;
        l.bfwv[51] = 5561926401017703382L;
        l.bfwv[52] = -8073038676043205531L;
        l.bfwv[53] = 3161368099164000857L;
        l.bfwv[54] = -1471565075557395612L;
        l.bfwv[55] = 4528038731659000335L;
        l.bfwv[56] = -2834368400609553601L;
        l.bfwv[57] = -7843394129971581541L;
        l.bfwv[58] = -7859234759370613595L;
        l.bfwv[59] = 8474626556276420373L;
        l.bfwv[60] = -7756961738758829646L;
        l.bfwv[61] = -1974427177473242732L;
        l.bfwv[62] = -1069214978362060427L;
        l.bfwv[63] = -1633240453514700374L;
        l.bfwv[64] = -4630633872177057014L;
        l.bfwv[65] = 416840077745928103L;
        l.bfwv[66] = -3336873569934915497L;
        l.bfwv[67] = -4903683828224671075L;
        l.bfwv[68] = 5319992646570751801L;
        l.bfwv[69] = -5236882186967561907L;
        l.bfwv[70] = -5005889910379344027L;
        l.bfwv[71] = 606166594166175050L;
        l.bfwv[72] = 3979487590403762011L;
        l.bfwv[73] = -8731895063766891218L;
        l.bfwv[74] = 7859835390781962872L;
        l.bfwv[75] = -1315006286632880906L;
        l.bfwv[76] = 3829753411507563464L;
        l.bfwv[77] = -2627204314102086382L;
        l.bfwv[78] = -5209509721355392668L;
        l.bfwv[79] = 704603290500046374L;
        l.bfwv[80] = 6215344926618924282L;
        l.bfwv[81] = -2915347939551237385L;
        l.bfwv[82] = -8380639837203069373L;
        l.bfwv[83] = 2176744905340331937L;
        l.bfwv[84] = -6713090021918771133L;
        l.bfwv[85] = -3127549057815798044L;
        l.bfwv[86] = 6211045567406121066L;
        l.bfwv[87] = -661318972556488347L;
        l.bfwv[88] = 6509575502679318481L;
        l.bfwv[89] = -3934688023957773841L;
        l.bfwv[90] = -4859642325719979625L;
        l.bfwv[91] = 8285677453272778893L;
        l.bfwv[92] = 8312595463294409242L;
        l.bfwv[93] = -1413690501686544415L;
        l.bfwv[94] = 7945036079468534517L;
        l.bfwv[95] = -5818295219119348939L;
        l.bfwv[96] = -5613373159922825381L;
        l.bfwv[97] = -1572145038074274264L;
        l.bfwv[98] = -9213904277900577459L;
        l.bfwv[99] = -5214964207628517576L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public List<String> getConfigs() {
        v0 /* !! */  = l.dd;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - l.bfnv("bgbm", bfwu(int ), (int)55));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2118432098: {
                    v1 = l.bfnv("bgbn", bfwu(int ), (int)56);
                    continue block21;
                }
                case -964993399: {
                    v1 = l.bfnv("bgbo", bfwu(int ), (int)57);
                    continue block21;
                }
                case 279614777: {
                    break block21;
                }
                case 1999430146: {
                    v1 = l.bfnv("bgbp", bfwu(int ), (int)58);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = l.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = l.dd - l.bfnv("bgbq", bfwu(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == l.bfnv("bgbr", bfns(int ), (int)296)) break;
            v2 /* !! */  = (long)l.bfnv("bgbs", bfns(int ), (int)297);
        }
        var2_2 = l.b;
        v3 /* !! */  = l.dd;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - l.bfnv("bgbt", bfwu(int ), (int)60));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2065433361: {
                    v4 = l.bfnv("bgbu", bfwu(int ), (int)61);
                    continue block23;
                }
                case 279614777: {
                    break block23;
                }
                case 998765387: {
                    v4 = l.bfnv("bgbv", bfwu(int ), (int)62);
                    continue block23;
                }
                case 1460831839: {
                    v4 = l.bfnv("bgbw", bfwu(int ), (int)63);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = l.a;
        if (var3_1) {
            throw null;
lbl44:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl47:
        // 1 sources

        v5 /* !! */  = l.dd;
        if (true) ** GOTO lbl51
        block25: while (true) {
            v5 /* !! */  = (long)(v6 - l.bfnv("bgbx", bfwu(int ), (int)64));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1253379229: {
                    v6 = l.bfnv("bgby", bfwu(int ), (int)65);
                    continue block25;
                }
                case -479820635: {
                    v6 = l.bfnv("bgbz", bfwu(int ), (int)66);
                    continue block25;
                }
                case 279614777: {
                    break block25;
                }
            }
            break;
        }
        v7 = aa.getInstance();
        v8 /* !! */  = l.dd;
        if (true) ** GOTO lbl65
        block26: while (true) {
            v8 /* !! */  = (long)(l.bfnv("bgcb", bfwu(int ), (int)68) - l.bfnv("bgca", bfwu(int ), (int)67));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 279614777: {
                    break block26;
                }
                case 768158688: {
                    continue block26;
                }
            }
            break;
        }
        return v7.listNamedConfigs();
    }

    private static /* synthetic */ void bhbb() {
        l.bfnt[0] = 1694148153;
        l.bfnt[1] = -190590900;
        l.bfnt[2] = -1363541616;
        l.bfnt[3] = 1156245445;
        l.bfnt[4] = -182269284;
        l.bfnt[5] = 1600080008;
        l.bfnt[6] = 1021033419;
        l.bfnt[7] = -1989064872;
        l.bfnt[8] = 756438456;
        l.bfnt[9] = 163420406;
        l.bfnt[10] = -180032198;
        l.bfnt[11] = -312374350;
        l.bfnt[12] = -1310866448;
        l.bfnt[13] = 495594355;
        l.bfnt[14] = -1597796040;
        l.bfnt[15] = -1806120046;
        l.bfnt[16] = -1026959982;
        l.bfnt[17] = -312351683;
        l.bfnt[18] = -1301714318;
        l.bfnt[19] = 890528847;
        l.bfnt[20] = -679884345;
        l.bfnt[21] = 778767002;
        l.bfnt[22] = 1575211313;
        l.bfnt[23] = -1666915193;
        l.bfnt[24] = 1265773959;
        l.bfnt[25] = -172736767;
        l.bfnt[26] = -604685528;
        l.bfnt[27] = 427118344;
        l.bfnt[28] = -21998225;
        l.bfnt[29] = -1942552538;
        l.bfnt[30] = -2127779308;
        l.bfnt[31] = 1795883557;
        l.bfnt[32] = -724315085;
        l.bfnt[33] = -1052867524;
        l.bfnt[34] = -200901172;
        l.bfnt[35] = 204911669;
        l.bfnt[36] = -331841178;
        l.bfnt[37] = 398191309;
        l.bfnt[38] = -1301981680;
        l.bfnt[39] = -1508827216;
        l.bfnt[40] = 150005998;
        l.bfnt[41] = 2082278204;
        l.bfnt[42] = -1710685665;
        l.bfnt[43] = 849625578;
        l.bfnt[44] = -566613246;
        l.bfnt[45] = 499869497;
        l.bfnt[46] = -409689606;
        l.bfnt[47] = 1758222390;
        l.bfnt[48] = -922765318;
        l.bfnt[49] = 1439495254;
        l.bfnt[50] = 722762797;
        l.bfnt[51] = 1978269087;
        l.bfnt[52] = -258581571;
        l.bfnt[53] = -78061115;
        l.bfnt[54] = -888719040;
        l.bfnt[55] = 1873871875;
        l.bfnt[56] = 893095725;
        l.bfnt[57] = 869168590;
        l.bfnt[58] = -1896516548;
        l.bfnt[59] = -822740824;
        l.bfnt[60] = 2136934733;
        l.bfnt[61] = 1033678413;
        l.bfnt[62] = 1004392719;
        l.bfnt[63] = 1444310190;
        l.bfnt[64] = -460723450;
        l.bfnt[65] = 1099777321;
        l.bfnt[66] = -294970311;
        l.bfnt[67] = 280394241;
        l.bfnt[68] = 1075324843;
        l.bfnt[69] = 869152955;
        l.bfnt[70] = -1538452434;
        l.bfnt[71] = 1364199879;
        l.bfnt[72] = -1272060419;
        l.bfnt[73] = -633271816;
        l.bfnt[74] = 1449386472;
        l.bfnt[75] = 1236719401;
        l.bfnt[76] = -2086927626;
        l.bfnt[77] = 1212628320;
        l.bfnt[78] = 1543071301;
        l.bfnt[79] = -797027719;
        l.bfnt[80] = -1526464724;
        l.bfnt[81] = 1840767583;
        l.bfnt[82] = 994237869;
        l.bfnt[83] = 878492677;
        l.bfnt[84] = -1279463644;
        l.bfnt[85] = -1625154836;
        l.bfnt[86] = -266830852;
        l.bfnt[87] = 1786323133;
        l.bfnt[88] = -1325385078;
        l.bfnt[89] = 1832712330;
        l.bfnt[90] = 1719143299;
        l.bfnt[91] = 323494102;
        l.bfnt[92] = -1459729433;
        l.bfnt[93] = 1755653817;
        l.bfnt[94] = -163401050;
        l.bfnt[95] = -1921671476;
        l.bfnt[96] = 1625848346;
        l.bfnt[97] = 34415707;
        l.bfnt[98] = 401954254;
        l.bfnt[99] = -979912118;
    }

    private static /* synthetic */ void bhbh() {
        l.bfnu[100] = -436287502;
        l.bfnu[101] = 235741448;
        l.bfnu[102] = 35540833;
        l.bfnu[103] = 1984546163;
        l.bfnu[104] = 797261362;
        l.bfnu[105] = 1259054558;
        l.bfnu[106] = 206204984;
        l.bfnu[107] = -720108135;
        l.bfnu[108] = 527305432;
        l.bfnu[109] = -544690313;
        l.bfnu[110] = 1900968071;
        l.bfnu[111] = 258962672;
        l.bfnu[112] = 1958913641;
        l.bfnu[113] = 598270372;
        l.bfnu[114] = -1485733414;
        l.bfnu[115] = -1098718887;
        l.bfnu[116] = -1196974885;
        l.bfnu[117] = 846653164;
        l.bfnu[118] = 72354742;
        l.bfnu[119] = 2049510597;
        l.bfnu[120] = -1468282009;
        l.bfnu[121] = 36518867;
        l.bfnu[122] = -1147756671;
        l.bfnu[123] = -1163545572;
        l.bfnu[124] = 105719715;
        l.bfnu[125] = -281351585;
        l.bfnu[126] = -1506918463;
        l.bfnu[127] = 778674272;
        l.bfnu[128] = 1240097743;
        l.bfnu[129] = 1339685335;
        l.bfnu[130] = 1113855625;
        l.bfnu[131] = -593222126;
        l.bfnu[132] = 964297838;
        l.bfnu[133] = 1714853581;
        l.bfnu[134] = 1480136495;
        l.bfnu[135] = -798837036;
        l.bfnu[136] = -1644905704;
        l.bfnu[137] = -1181599905;
        l.bfnu[138] = -425883838;
        l.bfnu[139] = 1894082895;
        l.bfnu[140] = -815129970;
        l.bfnu[141] = -474071112;
        l.bfnu[142] = -232283462;
        l.bfnu[143] = 349805398;
        l.bfnu[144] = -1009518578;
        l.bfnu[145] = 1543367389;
        l.bfnu[146] = 1796460401;
        l.bfnu[147] = 630854219;
        l.bfnu[148] = 1118703081;
        l.bfnu[149] = -485000282;
        l.bfnu[150] = 1246761938;
        l.bfnu[151] = 1336294849;
        l.bfnu[152] = 1422701394;
        l.bfnu[153] = 1515780617;
        l.bfnu[154] = -751057713;
        l.bfnu[155] = -1401388957;
        l.bfnu[156] = -2075738761;
        l.bfnu[157] = -254476130;
        l.bfnu[158] = 1692376856;
        l.bfnu[159] = -1845648621;
        l.bfnu[160] = -520888875;
        l.bfnu[161] = 1667259998;
        l.bfnu[162] = -1326334071;
        l.bfnu[163] = 862836309;
        l.bfnu[164] = 1950486984;
        l.bfnu[165] = 1159827630;
        l.bfnu[166] = 2084318947;
        l.bfnu[167] = -1872108050;
        l.bfnu[168] = 540669793;
        l.bfnu[169] = -468756068;
        l.bfnu[170] = 573830334;
        l.bfnu[171] = 1212515016;
        l.bfnu[172] = 716381051;
        l.bfnu[173] = -557058457;
        l.bfnu[174] = 268035518;
        l.bfnu[175] = -493762792;
        l.bfnu[176] = -1674144496;
        l.bfnu[177] = 740211268;
        l.bfnu[178] = -656563963;
        l.bfnu[179] = 2039044290;
        l.bfnu[180] = 1663009224;
        l.bfnu[181] = 1881543007;
        l.bfnu[182] = -1425116952;
        l.bfnu[183] = -1859006981;
        l.bfnu[184] = -328321069;
        l.bfnu[185] = -1804062689;
        l.bfnu[186] = -38993180;
        l.bfnu[187] = 1293695024;
        l.bfnu[188] = -977518345;
        l.bfnu[189] = -1089932626;
        l.bfnu[190] = -1121178926;
        l.bfnu[191] = 1357445414;
        l.bfnu[192] = 1544319724;
        l.bfnu[193] = -871386952;
        l.bfnu[194] = -551672486;
        l.bfnu[195] = -212777375;
        l.bfnu[196] = 454277351;
        l.bfnu[197] = 831523185;
        l.bfnu[198] = -1234235995;
        l.bfnu[199] = 985333450;
    }

    private static /* synthetic */ long bfwu(int n2) {
        return bfwv[n2] ^ bfww[n2];
    }

    /*
     * Exception decompiling
     */
    @Override
    public void execute(String var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 22[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void bhbm() {
        l.bfwv[100] = 2005579979314134037L;
        l.bfwv[101] = -1173819886216898726L;
        l.bfwv[102] = 2384481025414413119L;
        l.bfwv[103] = 5724074934130553859L;
        l.bfwv[104] = -7092642473122430915L;
        l.bfwv[105] = 2296086431198378659L;
        l.bfwv[106] = 1253708789015042508L;
        l.bfwv[107] = 6304039144899676017L;
        l.bfwv[108] = 2783278682259556527L;
        l.bfwv[109] = 1616854792661117953L;
        l.bfwv[110] = -1936198230871540364L;
        l.bfwv[111] = 7458041517604442408L;
        l.bfwv[112] = -2672705171276932002L;
        l.bfwv[113] = 1765704937360477463L;
        l.bfwv[114] = -8400075694995867645L;
        l.bfwv[115] = 7033768089746847289L;
        l.bfwv[116] = -8741851683778496803L;
        l.bfwv[117] = 6350927485794212746L;
        l.bfwv[118] = -7290521043659215553L;
        l.bfwv[119] = -7197304763323733181L;
        l.bfwv[120] = 4409064346617161170L;
        l.bfwv[121] = 6350937838285786669L;
        l.bfwv[122] = 4009598495504470652L;
        l.bfwv[123] = -406483660759767651L;
        l.bfwv[124] = 5811099656058454512L;
        l.bfwv[125] = -5196965363710785392L;
        l.bfwv[126] = -4548231437288236262L;
        l.bfwv[127] = -3432515927243901564L;
        l.bfwv[128] = -1071251918517478258L;
        l.bfwv[129] = -5146482874887426999L;
        l.bfwv[130] = -6010462729820682701L;
        l.bfwv[131] = 2291768966362527542L;
        l.bfwv[132] = 1645531887108352521L;
        l.bfwv[133] = 4345946103070876366L;
        l.bfwv[134] = 2570238790057238770L;
        l.bfwv[135] = 4909501581007453476L;
        l.bfwv[136] = 5407759160689009397L;
        l.bfwv[137] = -1758956504658623836L;
        l.bfwv[138] = 4705318432306992425L;
        l.bfwv[139] = 7497973595927308833L;
        l.bfwv[140] = -3399811474183715820L;
        l.bfwv[141] = -797272830300345485L;
        l.bfwv[142] = -9133855057200435594L;
        l.bfwv[143] = -3504347006570635008L;
        l.bfwv[144] = -2341720272729563787L;
        l.bfwv[145] = 7701979053198217462L;
        l.bfwv[146] = 6469205368003830917L;
        l.bfwv[147] = 979976954624719318L;
        l.bfwv[148] = 8915177046979966182L;
        l.bfwv[149] = -6996519997208335305L;
        l.bfwv[150] = -3067702295372002778L;
        l.bfwv[151] = -7107896116949925045L;
        l.bfwv[152] = -7295329084408714707L;
        l.bfwv[153] = -5561423518610920596L;
        l.bfwv[154] = 9004449830915928799L;
        l.bfwv[155] = -5306752747431759246L;
        l.bfwv[156] = 2858008619947271158L;
        l.bfwv[157] = 1589250833636503480L;
        l.bfwv[158] = -3202055042210537367L;
        l.bfwv[159] = -463415352068609834L;
        l.bfwv[160] = -3937803074713339150L;
        l.bfwv[161] = 2080910515193958962L;
        l.bfwv[162] = -7463691939940697155L;
        l.bfwv[163] = 1848421847072614347L;
        l.bfwv[164] = 3336024175545412602L;
        l.bfwv[165] = 5908948175363569792L;
        l.bfwv[166] = 1362813755556955316L;
        l.bfwv[167] = 7209206289640164127L;
        l.bfwv[168] = 7209016268324855777L;
        l.bfwv[169] = -811049855320676647L;
        l.bfwv[170] = 8143052902545452555L;
        l.bfwv[171] = 4410036300177355235L;
        l.bfwv[172] = 1451341386895782604L;
        l.bfwv[173] = -6136163986652411862L;
        l.bfwv[174] = -6653729029950637078L;
        l.bfwv[175] = 4404643079423015573L;
        l.bfwv[176] = 2575677015816443744L;
        l.bfwv[177] = -6212874025881481737L;
        l.bfwv[178] = -5384726773879400869L;
        l.bfwv[179] = 3505171041240272970L;
        l.bfwv[180] = 3384640801740213416L;
        l.bfwv[181] = 8101400451260535333L;
        l.bfwv[182] = -3566427370645857932L;
        l.bfwv[183] = -497729320889748286L;
        l.bfwv[184] = 2362801882498485202L;
        l.bfwv[185] = 2155891086908443832L;
        l.bfwv[186] = 5824068735168619523L;
        l.bfwv[187] = -697544665083650111L;
        l.bfwv[188] = -2780746655194745931L;
        l.bfwv[189] = -8381587029731874351L;
        l.bfwv[190] = 3467727163191511405L;
        l.bfwv[191] = 1726031215315687143L;
        l.bfwv[192] = 8551821144091420817L;
        l.bfwv[193] = 5687269131713069906L;
        l.bfwv[194] = 8824029853765129306L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ class_5250 lambda$execute$1(g var0, String var1_1) {
        v0 /* !! */  = l.dd;
        if (true) ** GOTO lbl5
        block148: while (true) {
            v0 /* !! */  = (long)(l.bfnv("bgrb", bfwu(int ), (int)70) - l.bfnv("bgqy", bfwu(int ), (int)69));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 279614777: {
                    break block148;
                }
                case 406856149: {
                    continue block148;
                }
            }
            break;
        }
        var8_2 = l.c;
        v1 /* !! */  = l.dd;
        if (true) ** GOTO lbl15
        block149: while (true) {
            v1 /* !! */  = (long)(v2 - l.bfnv("bgrc", bfwu(int ), (int)71));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -27951311: {
                    v2 = l.bfnv("bgrd", bfwu(int ), (int)72);
                    continue block149;
                }
                case 23110902: {
                    v2 = l.bfnv("bgre", bfwu(int ), (int)73);
                    continue block149;
                }
                case 279614777: {
                    break block149;
                }
            }
            break;
        }
        var7_3 /* !! */  = l.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = l.dd - l.bfnv("bgrh", bfwu(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == l.bfnv("bgri", bfns(int ), (int)302)) break;
            v3 /* !! */  = (long)l.bfnv("bgrl", bfns(int ), (int)303);
        }
        var6_4 = l.a;
        if (var8_2) {
            throw null;
lbl33:
            // 7 sources

            return null;
        }
        if (var6_4 || var6_4) ** GOTO lbl33
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = l.dd - l.bfnv("bgrn", bfwu(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == l.bfnv("bgro", bfns(int ), (int)304)) break;
            v4 /* !! */  = (long)l.bfnv("bgrq", bfns(int ), (int)305);
        }
        v5 = var0.getPrefix();
        v6 /* !! */  = l.dd;
        if (true) ** GOTO lbl46
        block153: while (true) {
            v6 /* !! */  = (long)(v7 - l.bfnv("bgrs", bfwu(int ), (int)76));
lbl46:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1401591063: {
                    v7 = l.bfnv("bgru", bfwu(int ), (int)77);
                    continue block153;
                }
                case -600326458: {
                    v7 = l.bfnv("bgrw", bfwu(int ), (int)78);
                    continue block153;
                }
                case 279614777: {
                    break block153;
                }
                case 1819090551: {
                    v7 = l.bfnv("bgrz", bfwu(int ), (int)79);
                    continue block153;
                }
            }
            break;
        }
        var2_5 = v5 + "config load " + var1_1;
        if (var6_4 || var6_4) ** GOTO lbl33
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = l.dd - l.bfnv("bgsc", bfwu(int ), (int)80)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == l.bfnv("bgse", bfns(int ), (int)306)) break;
            v8 /* !! */  = (long)l.bfnv("bgsg", bfns(int ), (int)307);
        }
        v9 = var0.getPrefix();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = l.dd - l.bfnv("bgsi", bfwu(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == l.bfnv("bgsk", bfns(int ), (int)308)) break;
            v10 /* !! */  = (long)l.bfnv("bgsl", bfns(int ), (int)309);
        }
        var3_6 = v9 + "config delete " + var1_1;
        if (var6_4 || var6_4) ** GOTO lbl33
        v11 /* !! */  = l.dd;
        if (true) ** GOTO lbl77
        block156: while (true) {
            v11 /* !! */  = (long)(l.bfnv("bgsn", bfwu(int ), (int)83) - l.bfnv("bgsm", bfwu(int ), (int)82));
lbl77:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case 279614777: {
                    break block156;
                }
                case 1368121717: {
                    continue block156;
                }
            }
            break;
        }
        v12 = class_2561.method_43470((String)"[");
        v13 /* !! */  = l.dd;
        if (true) ** GOTO lbl87
        block157: while (true) {
            v13 /* !! */  = (long)(l.bfnv("bgsp", bfwu(int ), (int)85) - l.bfnv("bgso", bfwu(int ), (int)84));
lbl87:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -2093888290: {
                    continue block157;
                }
                case 279614777: {
                    break block157;
                }
            }
            break;
        }
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = l.dd - l.bfnv("bgss", bfwu(int ), (int)86)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == l.bfnv("bgsv", bfns(int ), (int)310)) break;
            v14 /* !! */  = (long)l.bfnv("bgsw", bfns(int ), (int)311);
        }
        v15 = v12.method_27692(class_124.field_1080);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = l.dd - l.bfnv("bgsy", bfwu(int ), (int)87)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == l.bfnv("bgsz", bfns(int ), (int)312)) break;
            v16 /* !! */  = (long)l.bfnv("bgtb", bfns(int ), (int)313);
        }
        v17 = class_2561.method_43470((String)"\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c");
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_6 = l.dd - l.bfnv("bgtd", bfwu(int ), (int)88)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == l.bfnv("bgtf", bfns(int ), (int)314)) break;
            v18 /* !! */  = (long)l.bfnv("bgtg", bfns(int ), (int)315);
        }
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_7 = l.dd - l.bfnv("bgth", bfwu(int ), (int)89)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == l.bfnv("bgti", bfns(int ), (int)316)) break;
            v19 /* !! */  = (long)l.bfnv("bgtk", bfns(int ), (int)317);
        }
        v20 = v17.method_27692(class_124.field_1060);
        while (true) {
            if ((v21 /* !! */  = (cfr_temp_8 = l.dd - l.bfnv("bgtl", bfwu(int ), (int)90)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v21 /* !! */  == l.bfnv("bgtm", bfns(int ), (int)318)) break;
            v21 /* !! */  = (long)l.bfnv("bgtn", bfns(int ), (int)319);
        }
        v22 = v15.method_10852((class_2561)v20);
        v23 /* !! */  = l.dd;
        if (true) ** GOTO lbl125
        block163: while (true) {
            v23 /* !! */  = (long)(l.bfnv("bgtp", bfwu(int ), (int)92) - l.bfnv("bgto", bfwu(int ), (int)91));
lbl125:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case 279614777: {
                    break block163;
                }
                case 1396628567: {
                    continue block163;
                }
            }
            break;
        }
        v24 = class_2561.method_43470((String)"]");
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_9 = l.dd - l.bfnv("bgtq", bfwu(int ), (int)93)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == l.bfnv("bgtr", bfns(int ), (int)320)) break;
            v25 /* !! */  = (long)l.bfnv("bgts", bfns(int ), (int)321);
        }
        v26 /* !! */  = l.dd;
        if (true) ** GOTO lbl140
        block165: while (true) {
            v26 /* !! */  = (long)(v27 - l.bfnv("bgtt", bfwu(int ), (int)94));
lbl140:
            // 2 sources

            switch ((int)v26 /* !! */ ) {
                case -521884723: {
                    v27 = l.bfnv("bgtu", bfwu(int ), (int)95);
                    continue block165;
                }
                case 279614777: {
                    break block165;
                }
                case 609477875: {
                    v27 = l.bfnv("bgtw", bfwu(int ), (int)96);
                    continue block165;
                }
                case 1093921598: {
                    v27 = l.bfnv("bgtx", bfwu(int ), (int)97);
                    continue block165;
                }
            }
            break;
        }
        v28 = v24.method_27692(class_124.field_1080);
        v29 /* !! */  = l.dd;
        if (true) ** GOTO lbl157
        block166: while (true) {
            v29 /* !! */  = (long)(l.bfnv("bgtz", bfwu(int ), (int)99) - l.bfnv("bgty", bfwu(int ), (int)98));
lbl157:
            // 2 sources

            switch ((int)v29 /* !! */ ) {
                case 279614777: {
                    break block166;
                }
                case 2011907862: {
                    continue block166;
                }
            }
            break;
        }
        var4_7 = v22.method_10852((class_2561)v28);
        if (var6_4 || var6_4) ** GOTO lbl33
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_10 = l.dd - l.bfnv("bgua", bfwu(int ), (int)100)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == l.bfnv("bgub", bfns(int ), (int)322)) break;
            v30 /* !! */  = (long)l.bfnv("bguc", bfns(int ), (int)323);
        }
        v31 = var4_7.method_10866();
        v32 /* !! */  = l.dd;
        if (true) ** GOTO lbl174
        block168: while (true) {
            v32 /* !! */  = (long)(v33 - l.bfnv("bgud", bfwu(int ), (int)101));
lbl174:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -1914707889: {
                    v33 = l.bfnv("bgue", bfwu(int ), (int)102);
                    continue block168;
                }
                case -444741179: {
                    v33 = l.bfnv("bguf", bfwu(int ), (int)103);
                    continue block168;
                }
                case 279614777: {
                    break block168;
                }
            }
            break;
        }
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_11 = l.dd - l.bfnv("bgug", bfwu(int ), (int)104)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == l.bfnv("bguh", bfns(int ), (int)324)) break;
            v34 /* !! */  = (long)l.bfnv("bgui", bfns(int ), (int)325);
        }
        v35 = "\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433 " + var1_1;
        v36 /* !! */  = l.dd;
        if (true) ** GOTO lbl193
        block170: while (true) {
            v36 /* !! */  = (long)(l.bfnv("bguk", bfwu(int ), (int)106) - l.bfnv("bguj", bfwu(int ), (int)105));
lbl193:
            // 2 sources

            switch ((int)v36 /* !! */ ) {
                case 279614777: {
                    break block170;
                }
                case 1247517861: {
                    continue block170;
                }
            }
            break;
        }
        v37 = class_2561.method_43470((String)v35);
        while (true) {
            if ((v38 /* !! */  = (cfr_temp_12 = l.dd - l.bfnv("bgul", bfwu(int ), (int)107)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v38 /* !! */  == l.bfnv("bgum", bfns(int ), (int)326)) break;
            v38 /* !! */  = (long)l.bfnv("bgun", bfns(int ), (int)327);
        }
        while (true) {
            if ((v39 /* !! */  = (cfr_temp_13 = l.dd - l.bfnv("bguo", bfwu(int ), (int)108)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v39 /* !! */  == l.bfnv("bgup", bfns(int ), (int)328)) break;
            v39 /* !! */  = (long)l.bfnv("bguq", bfns(int ), (int)329);
        }
        v40 = v37.method_27692(class_124.field_1060);
        v41 /* !! */  = l.dd;
        if (true) ** GOTO lbl214
        block173: while (true) {
            v41 /* !! */  = (long)(l.bfnv("bgus", bfwu(int ), (int)110) - l.bfnv("bgur", bfwu(int ), (int)109));
lbl214:
            // 2 sources

            switch ((int)v41 /* !! */ ) {
                case 279614777: {
                    break block173;
                }
                case 1061873178: {
                    continue block173;
                }
            }
            break;
        }
        v42 = new class_2568.class_10613((class_2561)v40);
        v43 /* !! */  = l.dd;
        if (true) ** GOTO lbl224
        block174: while (true) {
            v43 /* !! */  = (long)(l.bfnv("bguu", bfwu(int ), (int)112) - l.bfnv("bgut", bfwu(int ), (int)111));
lbl224:
            // 2 sources

            switch ((int)v43 /* !! */ ) {
                case 279614777: {
                    break block174;
                }
                case 1498370174: {
                    continue block174;
                }
            }
            break;
        }
        v44 = v31.method_10949((class_2568)v42);
        v45 /* !! */  = l.dd;
        if (true) ** GOTO lbl234
        block175: while (true) {
            v45 /* !! */  = (long)(v46 - l.bfnv("bguv", bfwu(int ), (int)113));
lbl234:
            // 2 sources

            switch ((int)v45 /* !! */ ) {
                case 279614777: {
                    break block175;
                }
                case 532458711: {
                    v46 = l.bfnv("bguw", bfwu(int ), (int)114);
                    continue block175;
                }
                case 1872956019: {
                    v46 = l.bfnv("bgux", bfwu(int ), (int)115);
                    continue block175;
                }
            }
            break;
        }
        while (true) {
            if ((v47 /* !! */  = (cfr_temp_14 = l.dd - l.bfnv("bguy", bfwu(int ), (int)116)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v47 /* !! */  == l.bfnv("bguz", bfns(int ), (int)330)) break;
            v47 /* !! */  = (long)l.bfnv("bgva", bfns(int ), (int)331);
        }
        v48 = new class_2558.class_10609(var2_5);
        while (true) {
            if ((v49 /* !! */  = (cfr_temp_15 = l.dd - l.bfnv("bgvb", bfwu(int ), (int)117)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
            if (v49 /* !! */  == l.bfnv("bgvc", bfns(int ), (int)332)) break;
            v49 /* !! */  = (long)l.bfnv("bgvd", bfns(int ), (int)333);
        }
        v50 = v44.method_10958((class_2558)v48);
        v51 /* !! */  = l.dd;
        if (true) ** GOTO lbl259
        block178: while (true) {
            v51 /* !! */  = (long)(v52 - l.bfnv("bgve", bfwu(int ), (int)118));
lbl259:
            // 2 sources

            switch ((int)v51 /* !! */ ) {
                case -1734346866: {
                    v52 = l.bfnv("bgvf", bfwu(int ), (int)119);
                    continue block178;
                }
                case -344458175: {
                    v52 = l.bfnv("bgvg", bfwu(int ), (int)120);
                    continue block178;
                }
                case 279614777: {
                    break block178;
                }
            }
            break;
        }
        var4_7.method_10862(v50);
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4 || var6_4) ** GOTO lbl33
                while (true) {
                    if ((v53 /* !! */  = (cfr_temp_16 = l.dd - l.bfnv("bgvi", bfwu(int ), (int)121)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v53 /* !! */  == l.bfnv("bgvj", bfns(int ), (int)334)) break;
                    v53 /* !! */  = (long)l.bfnv("bgvk", bfns(int ), (int)335);
                }
                v54 = class_2561.method_43470((String)"[");
                while (true) {
                    if ((v55 /* !! */  = (cfr_temp_17 = l.dd - l.bfnv("bgvl", bfwu(int ), (int)122)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v55 /* !! */  == l.bfnv("bgvm", bfns(int ), (int)336)) break;
                    v55 /* !! */  = (long)l.bfnv("bgvn", bfns(int ), (int)337);
                }
                v56 /* !! */  = l.dd;
                if (true) ** GOTO lbl289
                block181: while (true) {
                    v56 /* !! */  = (long)(v57 - l.bfnv("bgvo", bfwu(int ), (int)123));
lbl289:
                    // 2 sources

                    switch ((int)v56 /* !! */ ) {
                        case -1110866829: {
                            v57 = l.bfnv("bgvp", bfwu(int ), (int)124);
                            continue block181;
                        }
                        case 279614777: {
                            break block181;
                        }
                        case 973093721: {
                            v57 = l.bfnv("bgvq", bfwu(int ), (int)125);
                            continue block181;
                        }
                    }
                    break;
                }
                v58 = v54.method_27692(class_124.field_1080);
                while (true) {
                    if ((v59 /* !! */  = (cfr_temp_18 = l.dd - l.bfnv("bgvr", bfwu(int ), (int)126)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v59 /* !! */  == l.bfnv("bgvs", bfns(int ), (int)338)) break;
                    v59 /* !! */  = (long)l.bfnv("bgvt", bfns(int ), (int)339);
                }
                v60 = class_2561.method_43470((String)"\u0423\u0434\u0430\u043b\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433");
                v61 /* !! */  = l.dd;
                if (true) ** GOTO lbl309
                block183: while (true) {
                    v61 /* !! */  = (long)(v62 - l.bfnv("bgvu", bfwu(int ), (int)127));
lbl309:
                    // 2 sources

                    switch ((int)v61 /* !! */ ) {
                        case 279614777: {
                            break block183;
                        }
                        case 329038618: {
                            v62 = l.bfnv("bgvv", bfwu(int ), (int)128);
                            continue block183;
                        }
                        case 994517468: {
                            v62 = l.bfnv("bgvx", bfwu(int ), (int)129);
                            continue block183;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v63 /* !! */  = (cfr_temp_19 = l.dd - l.bfnv("bgvy", bfwu(int ), (int)130)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v63 /* !! */  == l.bfnv("bgvz", bfns(int ), (int)340)) break;
                    v63 /* !! */  = (long)l.bfnv("bgwa", bfns(int ), (int)341);
                }
                v64 = v60.method_27692(class_124.field_1061);
                while (true) {
                    if ((v65 /* !! */  = (cfr_temp_20 = l.dd - l.bfnv("bgwb", bfwu(int ), (int)131)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v65 /* !! */  == l.bfnv("bgwc", bfns(int ), (int)342)) break;
                    v65 /* !! */  = (long)l.bfnv("bgwd", bfns(int ), (int)343);
                }
                v66 = v58.method_10852((class_2561)v64);
                while (true) {
                    if ((v67 /* !! */  = (cfr_temp_21 = l.dd - l.bfnv("bgwe", bfwu(int ), (int)132)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v67 /* !! */  == l.bfnv("bgwf", bfns(int ), (int)344)) break;
                    v67 /* !! */  = (long)l.bfnv("bgwg", bfns(int ), (int)345);
                }
                v68 = class_2561.method_43470((String)"]");
                v69 /* !! */  = l.dd;
                if (true) ** GOTO lbl340
                block187: while (true) {
                    v69 /* !! */  = (long)(l.bfnv("bgwi", bfwu(int ), (int)134) - l.bfnv("bgwh", bfwu(int ), (int)133));
lbl340:
                    // 2 sources

                    switch ((int)v69 /* !! */ ) {
                        case 279614777: {
                            break block187;
                        }
                        case 1980077202: {
                            continue block187;
                        }
                    }
                    break;
                }
                v70 /* !! */  = l.dd;
                if (true) ** GOTO lbl349
                block188: while (true) {
                    v70 /* !! */  = (long)(v71 - l.bfnv("bgwj", bfwu(int ), (int)135));
lbl349:
                    // 2 sources

                    switch ((int)v70 /* !! */ ) {
                        case -1947437455: {
                            v71 = l.bfnv("bgwk", bfwu(int ), (int)136);
                            continue block188;
                        }
                        case -1764134739: {
                            v71 = l.bfnv("bgwl", bfwu(int ), (int)137);
                            continue block188;
                        }
                        case -1225132493: {
                            v71 = l.bfnv("bgwn", bfwu(int ), (int)138);
                            continue block188;
                        }
                        case 279614777: {
                            break block188;
                        }
                    }
                    break;
                }
                v72 = v68.method_27692(class_124.field_1080);
                while (true) {
                    if ((v73 /* !! */  = (cfr_temp_22 = l.dd - l.bfnv("bgwo", bfwu(int ), (int)139)) == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1)) == false) continue;
                    if (v73 /* !! */  == l.bfnv("bgwp", bfns(int ), (int)346)) break;
                    v73 /* !! */  = (long)l.bfnv("bgwq", bfns(int ), (int)347);
                }
                var5_8 = v66.method_10852((class_2561)v72);
                if (var6_4 || var6_4) ** GOTO lbl33
                while (true) {
                    if ((v74 /* !! */  = (cfr_temp_23 = l.dd - l.bfnv("bgwr", bfwu(int ), (int)140)) == 0L ? 0 : (cfr_temp_23 < 0L ? -1 : 1)) == false) continue;
                    if (v74 /* !! */  == l.bfnv("bgws", bfns(int ), (int)348)) break;
                    v74 /* !! */  = (long)l.bfnv("bgwt", bfns(int ), (int)349);
                }
                v75 = var5_8.method_10866();
                v76 /* !! */  = l.dd;
                if (true) ** GOTO lbl379
                block191: while (true) {
                    v76 /* !! */  = (long)(l.bfnv("bgwv", bfwu(int ), (int)142) - l.bfnv("bgwu", bfwu(int ), (int)141));
lbl379:
                    // 2 sources

                    switch ((int)v76 /* !! */ ) {
                        case -1122940536: {
                            continue block191;
                        }
                        case 279614777: {
                            break block191;
                        }
                    }
                    break;
                }
                v77 /* !! */  = l.dd;
                if (true) ** GOTO lbl388
                block192: while (true) {
                    v77 /* !! */  = (long)(v78 - l.bfnv("bgww", bfwu(int ), (int)143));
lbl388:
                    // 2 sources

                    switch ((int)v77 /* !! */ ) {
                        case -1427208983: {
                            v78 = l.bfnv("bgwy", bfwu(int ), (int)144);
                            continue block192;
                        }
                        case 279614777: {
                            break block192;
                        }
                        case 305730877: {
                            v78 = l.bfnv("bgwz", bfwu(int ), (int)145);
                            continue block192;
                        }
                        case 1021352644: {
                            v78 = l.bfnv("bgxa", bfwu(int ), (int)146);
                            continue block192;
                        }
                    }
                    break;
                }
                v79 = "\u0423\u0434\u0430\u043b\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433 " + var1_1;
                v80 /* !! */  = l.dd;
                if (true) ** GOTO lbl405
                block193: while (true) {
                    v80 /* !! */  = (long)(v81 - l.bfnv("bgxb", bfwu(int ), (int)147));
lbl405:
                    // 2 sources

                    switch ((int)v80 /* !! */ ) {
                        case -953685057: {
                            v81 = l.bfnv("bgxc", bfwu(int ), (int)148);
                            continue block193;
                        }
                        case -532343079: {
                            v81 = l.bfnv("bgxd", bfwu(int ), (int)149);
                            continue block193;
                        }
                        case 279614777: {
                            break block193;
                        }
                    }
                    break;
                }
                v82 = class_2561.method_43470((String)v79);
                v83 /* !! */  = l.dd;
                if (true) ** GOTO lbl419
                block194: while (true) {
                    v83 /* !! */  = (long)(v84 - l.bfnv("bgxe", bfwu(int ), (int)150));
lbl419:
                    // 2 sources

                    switch ((int)v83 /* !! */ ) {
                        case 279614777: {
                            break block194;
                        }
                        case 1556912038: {
                            v84 = l.bfnv("bgxf", bfwu(int ), (int)151);
                            continue block194;
                        }
                        case 1691125977: {
                            v84 = l.bfnv("bgxg", bfwu(int ), (int)152);
                            continue block194;
                        }
                    }
                    break;
                }
                v85 /* !! */  = l.dd;
                if (true) ** GOTO lbl432
                block195: while (true) {
                    v85 /* !! */  = (long)(v86 - l.bfnv("bgxh", bfwu(int ), (int)153));
lbl432:
                    // 2 sources

                    switch ((int)v85 /* !! */ ) {
                        case -647530159: {
                            v86 = l.bfnv("bgxj", bfwu(int ), (int)154);
                            continue block195;
                        }
                        case 279614777: {
                            break block195;
                        }
                        case 1507100282: {
                            v86 = l.bfnv("bgxk", bfwu(int ), (int)155);
                            continue block195;
                        }
                        case 1931929220: {
                            v86 = l.bfnv("bgxl", bfwu(int ), (int)156);
                            continue block195;
                        }
                    }
                    break;
                }
                v87 = v82.method_27692(class_124.field_1061);
                while (true) {
                    if ((v88 /* !! */  = (cfr_temp_24 = l.dd - l.bfnv("bgxm", bfwu(int ), (int)157)) == 0L ? 0 : (cfr_temp_24 < 0L ? -1 : 1)) == false) continue;
                    if (v88 /* !! */  == l.bfnv("bgxn", bfns(int ), (int)350)) break;
                    v88 /* !! */  = (long)l.bfnv("bgxo", bfns(int ), (int)351);
                }
                v89 = new class_2568.class_10613((class_2561)v87);
                while (true) {
                    if ((v90 /* !! */  = (cfr_temp_25 = l.dd - l.bfnv("bgxp", bfwu(int ), (int)158)) == 0L ? 0 : (cfr_temp_25 < 0L ? -1 : 1)) == false) continue;
                    if (v90 /* !! */  == l.bfnv("bgxq", bfns(int ), (int)352)) break;
                    v90 /* !! */  = (long)l.bfnv("bgxr", bfns(int ), (int)353);
                }
                v91 = v75.method_10949((class_2568)v89);
                while (true) {
                    if ((v92 /* !! */  = (cfr_temp_26 = l.dd - l.bfnv("bgxs", bfwu(int ), (int)159)) == 0L ? 0 : (cfr_temp_26 < 0L ? -1 : 1)) == false) continue;
                    if (v92 /* !! */  == l.bfnv("bgxt", bfns(int ), (int)354)) break;
                    v92 /* !! */  = (long)l.bfnv("bgxu", bfns(int ), (int)355);
                }
                v93 /* !! */  = l.dd;
                if (true) ** GOTO lbl466
                block199: while (true) {
                    v93 /* !! */  = (long)(v94 - l.bfnv("bgxw", bfwu(int ), (int)160));
lbl466:
                    // 2 sources

                    switch ((int)v93 /* !! */ ) {
                        case -2043181162: {
                            v94 = l.bfnv("bgxx", bfwu(int ), (int)161);
                            continue block199;
                        }
                        case 279614777: {
                            break block199;
                        }
                        case 389762230: {
                            v94 = l.bfnv("bgxy", bfwu(int ), (int)162);
                            continue block199;
                        }
                    }
                    break;
                }
                v95 = new class_2558.class_10609(var3_6);
                while (true) {
                    if ((v96 /* !! */  = (cfr_temp_27 = l.dd - l.bfnv("bgxz", bfwu(int ), (int)163)) == 0L ? 0 : (cfr_temp_27 < 0L ? -1 : 1)) == false) continue;
                    if (v96 /* !! */  == l.bfnv("bgya", bfns(int ), (int)356)) break;
                    v96 /* !! */  = (long)l.bfnv("bgyb", bfns(int ), (int)357);
                }
                v97 = v91.method_10958((class_2558)v95);
                while (true) {
                    if ((v98 /* !! */  = (cfr_temp_28 = l.dd - l.bfnv("bgyc", bfwu(int ), (int)164)) == 0L ? 0 : (cfr_temp_28 < 0L ? -1 : 1)) == false) continue;
                    if (v98 /* !! */  == l.bfnv("bgyd", bfns(int ), (int)358)) break;
                    v98 /* !! */  = (long)l.bfnv("bgye", bfns(int ), (int)359);
                }
                var5_8.method_10862(v97);
                if (var6_4 || var6_4) ** continue;
                while (true) {
                    if ((v99 /* !! */  = (cfr_temp_29 = l.dd - l.bfnv("bgyf", bfwu(int ), (int)165)) == 0L ? 0 : (cfr_temp_29 < 0L ? -1 : 1)) == false) continue;
                    if (v99 /* !! */  == l.bfnv("bgyg", bfns(int ), (int)360)) break;
                    v99 /* !! */  = (long)l.bfnv("bgyh", bfns(int ), (int)361);
                }
                v100 = "  \u00a7b\u25cf \u00a7f" + var1_1 + " ";
                while (true) {
                    if ((v101 /* !! */  = (cfr_temp_30 = l.dd - l.bfnv("bgyi", bfwu(int ), (int)166)) == 0L ? 0 : (cfr_temp_30 < 0L ? -1 : 1)) == false) continue;
                    if (v101 /* !! */  == l.bfnv("bgyj", bfns(int ), (int)362)) break;
                    v101 /* !! */  = (long)l.bfnv("bgyk", bfns(int ), (int)363);
                }
                v102 = class_2561.method_43470((String)v100);
                v103 /* !! */  = l.dd;
                if (true) ** GOTO lbl505
                block204: while (true) {
                    v103 /* !! */  = (long)(l.bfnv("bgym", bfwu(int ), (int)168) - l.bfnv("bgyl", bfwu(int ), (int)167));
lbl505:
                    // 2 sources

                    switch ((int)v103 /* !! */ ) {
                        case 279614777: {
                            break block204;
                        }
                        case 815519248: {
                            continue block204;
                        }
                    }
                    break;
                }
                v104 = v102.method_10852((class_2561)var4_7);
                v105 /* !! */  = l.dd;
                if (true) ** GOTO lbl515
                block205: while (true) {
                    v105 /* !! */  = (long)(v106 - l.bfnv("bgyn", bfwu(int ), (int)169));
lbl515:
                    // 2 sources

                    switch ((int)v105 /* !! */ ) {
                        case -1970365794: {
                            v106 = l.bfnv("bgyo", bfwu(int ), (int)170);
                            continue block205;
                        }
                        case 143977869: {
                            v106 = l.bfnv("bgyp", bfwu(int ), (int)171);
                            continue block205;
                        }
                        case 279614777: {
                            break block205;
                        }
                    }
                    break;
                }
                v107 = class_2561.method_43470((String)" ");
                v108 /* !! */  = l.dd;
                if (true) ** GOTO lbl529
                block206: while (true) {
                    v108 /* !! */  = (long)(v109 - l.bfnv("bgyq", bfwu(int ), (int)172));
lbl529:
                    // 2 sources

                    switch ((int)v108 /* !! */ ) {
                        case -1904361740: {
                            v109 = l.bfnv("bgyr", bfwu(int ), (int)173);
                            continue block206;
                        }
                        case 212969473: {
                            v109 = l.bfnv("bgys", bfwu(int ), (int)174);
                            continue block206;
                        }
                        case 279614777: {
                            break block206;
                        }
                        case 613471532: {
                            v109 = l.bfnv("bgyt", bfwu(int ), (int)175);
                            continue block206;
                        }
                    }
                    break;
                }
                v110 = v104.method_10852((class_2561)v107);
                while (true) {
                    if ((v111 /* !! */  = (cfr_temp_31 = l.dd - l.bfnv("bgyu", bfwu(int ), (int)176)) == 0L ? 0 : (cfr_temp_31 < 0L ? -1 : 1)) == false) continue;
                    if (v111 /* !! */  == l.bfnv("bgyv", bfns(int ), (int)364)) break;
                    v111 /* !! */  = (long)l.bfnv("bgyw", bfns(int ), (int)365);
                }
                return v110.method_10852((class_2561)var5_8);
            }
lbl548:
            // 2 sources

            case 0: {
                var7_3 /* !! */  = (int)l.bfnv("bgyx", bfns(int ), (int)366);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl582
            }
            case 1: {
                do {
                    var7_3 /* !! */  = (int)l.bfnv("bgyy", bfns(int ), (int)367);
                } while (!var8_2);
                throw null;
            }
lbl558:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)l.bfnv("bgyz", bfns(int ), (int)368);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl599
            }
            case 3: {
                do {
                    var7_3 /* !! */  = (int)l.bfnv("bgza", bfns(int ), (int)369);
                } while (!var8_2);
                throw null;
            }
lbl568:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)l.bfnv("bgzb", bfns(int ), (int)370);
                if (!var8_2) ** GOTO lbl558
                throw null;
            }
            case 5: {
                var7_3 /* !! */  = (int)l.bfnv("bgzc", bfns(int ), (int)371);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl587
            }
lbl577:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)l.bfnv("bgzd", bfns(int ), (int)372);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl599
            }
lbl582:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)l.bfnv("bgze", bfns(int ), (int)373);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl612
            }
lbl587:
            // 4 sources

            case 8: {
                var7_3 /* !! */  = (int)l.bfnv("bgzf", bfns(int ), (int)374);
                if (!var8_2) break;
                throw null;
            }
            case 9: {
                var7_3 /* !! */  = (int)l.bfnv("bgzg", bfns(int ), (int)375);
                if (!var8_2) ** GOTO lbl568
                throw null;
            }
            case 10: {
                var7_3 /* !! */  = (int)l.bfnv("bgzh", bfns(int ), (int)376);
                if (!var8_2) ** GOTO lbl548
                throw null;
            }
lbl599:
            // 3 sources

            case 11: {
                var7_3 /* !! */  = (int)l.bfnv("bgzi", bfns(int ), (int)377);
                if (!var8_2) ** GOTO lbl587
                throw null;
            }
            case 12: {
                do {
                    var7_3 /* !! */  = (int)l.bfnv("bgzj", bfns(int ), (int)378);
                } while (!var8_2);
                throw null;
            }
            case 13: {
                var7_3 /* !! */  = (int)l.bfnv("bgzk", bfns(int ), (int)379);
                if (!var8_2) ** GOTO lbl587
                throw null;
            }
lbl612:
            // 2 sources

            case 14: {
                var7_3 /* !! */  = (int)l.bfnv("bgzl", bfns(int ), (int)380);
                if (!var8_2) ** GOTO lbl577
                throw null;
            }
            case 15: 
        }
        do {
            var7_3 /* !! */  = (int)l.bfnv("bgzm", bfns(int ), (int)381);
        } while (!var8_2);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> getLongDesc() {
        boolean bl2;
        Object object = dd;
        block4: while (true) {
            switch ((int)object) {
                case -1486020978: {
                    object = l.bfnv("bgay", bfwu(int ), (int)51) - l.bfnv("bgax", bfwu(int ), (int)50);
                    continue block4;
                }
                case 279614777: {
                    break block4;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = dd - l.bfnv("bgaz", bfwu(int ), (int)52)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == l.bfnv("bgba", bfns(int ), (int)286)) break;
            object2 = l.bfnv("bgbb", bfns(int ), (int)287);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = dd - l.bfnv("bgbc", bfwu(int ), (int)53)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == l.bfnv("bgbd", bfns(int ), (int)288)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = l.bfnv("bgbe", bfns(int ), (int)289);
        }
        if (bl2) return null;
        if (bl2) return null;
        String[] stringArray = new String[]{"\u0421 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u044d\u0442\u043e\u0439 \u043a\u043e\u043c\u0430\u043d\u0434\u044b \u043c\u043e\u0436\u043d\u043e \u0437\u0430\u0433\u0440\u0443\u0436\u0430\u0442\u044c/\u0441\u043e\u0445\u0440\u0430\u043d\u044f\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433\u0438", "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:", "> config load <name> - \u0417\u0430\u0433\u0440\u0443\u0436\u0430\u0435\u0442 \u043a\u043e\u043d\u0444\u0438\u0433.", "> config save <name> - \u0421\u043e\u0445\u0440\u0430\u043d\u044f\u0435\u0442 \u043a\u043e\u043d\u0444\u0438\u0433.", "> config reset - \u0421\u0431\u0440\u0430\u0441\u044b\u0432\u0430\u0435\u0442 \u0432\u0441\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0434\u043e \u0438\u0441\u0445\u043e\u0434\u043d\u044b\u0445.", "> config delete <name> - \u0423\u0434\u0430\u043b\u044f\u0435\u0442 \u043a\u043e\u043d\u0444\u0438\u0433.", "> config list - \u0412\u043e\u0437\u0432\u0440\u0430\u0449\u0430\u0435\u0442 \u0441\u043f\u0438\u0441\u043e\u043a \u043a\u043e\u043d\u0444\u0438\u0433\u043e\u0432", "> config dir - \u041e\u0442\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u043f\u0430\u043f\u043a\u0443 \u0441 \u043a\u043e\u043d\u0444\u0438\u0433\u0430\u043c\u0438."};
        while (true) {
            long l4;
            Object object4;
            if ((object4 = (l4 = dd - l.bfnv("bgbf", bfwu(int ), (int)54)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object4 == l.bfnv("bgbg", bfns(int ), (int)290)) {
                return Arrays.asList(stringArray);
            }
            object4 = l.bfnv("bgbh", bfns(int ), (int)291);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void lambda$execute$0() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = l.dd - l.bfnv("bgzn", bfwu(int ), (int)177)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == l.bfnv("bgzo", bfns(int ), (int)382)) break;
            v0 /* !! */  = (long)l.bfnv("bgzp", bfns(int ), (int)383);
        }
        var3_1 = l.c;
        v1 /* !! */  = l.dd;
        if (true) ** GOTO lbl11
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - l.bfnv("bgzq", bfwu(int ), (int)178));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -523300743: {
                    v2 = l.bfnv("bgzr", bfwu(int ), (int)179);
                    continue block21;
                }
                case 279614777: {
                    break block21;
                }
                case 1939687476: {
                    v2 = l.bfnv("bgzs", bfwu(int ), (int)180);
                    continue block21;
                }
            }
            break;
        }
        var2_2 = l.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = l.dd - l.bfnv("bgzt", bfwu(int ), (int)181)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == l.bfnv("bgzu", bfns(int ), (int)384)) break;
            v3 /* !! */  = (long)l.bfnv("bgzv", bfns(int ), (int)385);
        }
        var1_3 = l.a;
        if (var3_1) {
            throw null;
lbl29:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v4 /* !! */  = l.dd;
        if (true) ** GOTO lbl36
        block24: while (true) {
            v4 /* !! */  = (long)(v5 - l.bfnv("bgzw", bfwu(int ), (int)182));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1791650332: {
                    v5 = l.bfnv("bgzx", bfwu(int ), (int)183);
                    continue block24;
                }
                case -871824955: {
                    v5 = l.bfnv("bgzy", bfwu(int ), (int)184);
                    continue block24;
                }
                case 279614777: {
                    break block24;
                }
                case 292421900: {
                    v5 = l.bfnv("bgzz", bfwu(int ), (int)185);
                    continue block24;
                }
            }
            break;
        }
        v6 = o.getLine();
        v7 /* !! */  = l.dd;
        if (true) ** GOTO lbl53
        block25: while (true) {
            v7 /* !! */  = (long)(l.bfnv("bhab", bfwu(int ), (int)187) - l.bfnv("bhaa", bfwu(int ), (int)186));
lbl53:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 246459865: {
                    continue block25;
                }
                case 279614777: {
                    break block25;
                }
            }
            break;
        }
        v8 = class_2561.method_43470((String)v6);
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_2 = l.dd - l.bfnv("bhac", bfwu(int ), (int)188)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == l.bfnv("bhad", bfns(int ), (int)386)) break;
            v9 /* !! */  = (long)l.bfnv("bhae", bfns(int ), (int)387);
        }
        this.logDirectRaw(v8);
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = l.dd - l.bfnv("bhaf", bfwu(int ), (int)189)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == l.bfnv("bhag", bfns(int ), (int)388)) break;
            v10 /* !! */  = (long)l.bfnv("bhah", bfns(int ), (int)389);
        }
        this.logDirect("\u00a77\u0421\u043f\u0438\u0441\u043e\u043a \u043a\u043e\u043d\u0444\u0438\u0433\u043e\u0432:");
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_4 = l.dd - l.bfnv("bhai", bfwu(int ), (int)190)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == l.bfnv("bhaj", bfns(int ), (int)390)) break;
            v11 /* !! */  = (long)l.bfnv("bhak", bfns(int ), (int)391);
        }
        v12 = o.getLine();
        v13 /* !! */  = l.dd;
        if (true) ** GOTO lbl83
        block29: while (true) {
            v13 /* !! */  = (long)(v14 - l.bfnv("bhal", bfwu(int ), (int)191));
lbl83:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1933318680: {
                    v14 = l.bfnv("bham", bfwu(int ), (int)192);
                    continue block29;
                }
                case -779701425: {
                    v14 = l.bfnv("bhan", bfwu(int ), (int)193);
                    continue block29;
                }
                case 279614777: {
                    break block29;
                }
            }
            break;
        }
        v15 = class_2561.method_43470((String)v12);
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_5 = l.dd - l.bfnv("bhao", bfwu(int ), (int)194)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == l.bfnv("bhap", bfns(int ), (int)392)) break;
            v16 /* !! */  = (long)l.bfnv("bhaq", bfns(int ), (int)393);
        }
        this.logDirectRaw(v15);
        ** while (var1_3 || var1_3)
lbl100:
        // 1 sources

    }

    private static /* synthetic */ void bhbo() {
        l.bfww[100] = -1727754561530195182L;
        l.bfww[101] = 4518145246760400118L;
        l.bfww[102] = 6186936663381014533L;
        l.bfww[103] = 7690887265353045497L;
        l.bfww[104] = 2372888520072484229L;
        l.bfww[105] = -1984462028841990842L;
        l.bfww[106] = 6721818964659130017L;
        l.bfww[107] = 8864877173332711094L;
        l.bfww[108] = 3633816984055399206L;
        l.bfww[109] = -8530746454572744748L;
        l.bfww[110] = -370170139050325743L;
        l.bfww[111] = 6748492986829859877L;
        l.bfww[112] = -8628935988355232999L;
        l.bfww[113] = 7646231827719397425L;
        l.bfww[114] = 7458266762839974258L;
        l.bfww[115] = -2097306178799231099L;
        l.bfww[116] = 1108753939956430358L;
        l.bfww[117] = -6593855985797821229L;
        l.bfww[118] = -99255862753286611L;
        l.bfww[119] = 2490287226442678658L;
        l.bfww[120] = 6911251750774271105L;
        l.bfww[121] = -6843959787919956663L;
        l.bfww[122] = 1390264672260408364L;
        l.bfww[123] = -5154522754459830649L;
        l.bfww[124] = -4622535480755827764L;
        l.bfww[125] = 887720998632958594L;
        l.bfww[126] = 5002397354729974962L;
        l.bfww[127] = -1962583213255920736L;
        l.bfww[128] = 4349741529619587560L;
        l.bfww[129] = -6725807282825515003L;
        l.bfww[130] = 4993691152619153116L;
        l.bfww[131] = 6341872796820288328L;
        l.bfww[132] = 4625991453363235557L;
        l.bfww[133] = -5426799105679069296L;
        l.bfww[134] = -5864646050982917129L;
        l.bfww[135] = -7203043412015025259L;
        l.bfww[136] = -6037437984649753168L;
        l.bfww[137] = -8163421224178029521L;
        l.bfww[138] = -8722200699832021058L;
        l.bfww[139] = -182704186249156529L;
        l.bfww[140] = 8247651510634811292L;
        l.bfww[141] = 1670400082275700155L;
        l.bfww[142] = -8218575551785658088L;
        l.bfww[143] = -1580366837328384561L;
        l.bfww[144] = -2390941404702625318L;
        l.bfww[145] = 1852781935340038723L;
        l.bfww[146] = -3482751548542879284L;
        l.bfww[147] = -6759241101796215610L;
        l.bfww[148] = 3692380393085353136L;
        l.bfww[149] = 3497346350569061015L;
        l.bfww[150] = 6649489100035255632L;
        l.bfww[151] = 3585880774431615234L;
        l.bfww[152] = -4291527344612710499L;
        l.bfww[153] = -2589781249712277975L;
        l.bfww[154] = -8100245741422694118L;
        l.bfww[155] = -7945820626061102585L;
        l.bfww[156] = 1278103691026848634L;
        l.bfww[157] = -5968168811004550222L;
        l.bfww[158] = 1965625546922718943L;
        l.bfww[159] = 313443444917681579L;
        l.bfww[160] = -7781287261069210984L;
        l.bfww[161] = -1233005837915370589L;
        l.bfww[162] = -324096824580839723L;
        l.bfww[163] = 7607302171829037873L;
        l.bfww[164] = 6898129102923347288L;
        l.bfww[165] = -2504529117034733542L;
        l.bfww[166] = -2687621501176286259L;
        l.bfww[167] = 1838811497512171006L;
        l.bfww[168] = 5018979736229156929L;
        l.bfww[169] = 1314816903667801746L;
        l.bfww[170] = -6401549650704252058L;
        l.bfww[171] = -946045272294556882L;
        l.bfww[172] = -9009152904081511475L;
        l.bfww[173] = -4273959376759806760L;
        l.bfww[174] = 5788491799660255127L;
        l.bfww[175] = -2432724964369536034L;
        l.bfww[176] = -7417085031406717130L;
        l.bfww[177] = -6796162911070347846L;
        l.bfww[178] = -2708859048104569044L;
        l.bfww[179] = -38146266133276586L;
        l.bfww[180] = -8809486954046377947L;
        l.bfww[181] = -1722721070338967587L;
        l.bfww[182] = -5793998635579757952L;
        l.bfww[183] = -9154946174566243092L;
        l.bfww[184] = 3414062084259840583L;
        l.bfww[185] = -2909397451923807901L;
        l.bfww[186] = -6827517030527885365L;
        l.bfww[187] = -3271996611824273161L;
        l.bfww[188] = 263030981729116446L;
        l.bfww[189] = 9172656770657098471L;
        l.bfww[190] = -7463206048178880559L;
        l.bfww[191] = -4238028407490078170L;
        l.bfww[192] = 8089478744323594183L;
        l.bfww[193] = -2835634980252091466L;
        l.bfww[194] = -5504270147012377761L;
    }

    private static /* synthetic */ void bhbe() {
        l.bfnt[300] = 920321915;
        l.bfnt[301] = -1486270414;
        l.bfnt[302] = -1976534624;
        l.bfnt[303] = 943142186;
        l.bfnt[304] = 1162751935;
        l.bfnt[305] = -960653192;
        l.bfnt[306] = 886256905;
        l.bfnt[307] = -306622089;
        l.bfnt[308] = -1829703376;
        l.bfnt[309] = 1163092812;
        l.bfnt[310] = 1151355447;
        l.bfnt[311] = -241485868;
        l.bfnt[312] = -883235257;
        l.bfnt[313] = 565080699;
        l.bfnt[314] = 505096444;
        l.bfnt[315] = -607798604;
        l.bfnt[316] = 1631953578;
        l.bfnt[317] = -719939072;
        l.bfnt[318] = -1878265564;
        l.bfnt[319] = 1490215845;
        l.bfnt[320] = 1208358105;
        l.bfnt[321] = 1777370513;
        l.bfnt[322] = -1904925474;
        l.bfnt[323] = -1977415287;
        l.bfnt[324] = 1221312527;
        l.bfnt[325] = -1955763113;
        l.bfnt[326] = -1876011587;
        l.bfnt[327] = -1936814855;
        l.bfnt[328] = 840738087;
        l.bfnt[329] = -274454984;
        l.bfnt[330] = -361668119;
        l.bfnt[331] = -1288218485;
        l.bfnt[332] = -1399666571;
        l.bfnt[333] = 1533931595;
        l.bfnt[334] = -1581667748;
        l.bfnt[335] = 1168041439;
        l.bfnt[336] = 282765872;
        l.bfnt[337] = -1094763846;
        l.bfnt[338] = 807575756;
        l.bfnt[339] = -552930852;
        l.bfnt[340] = -1239729209;
        l.bfnt[341] = -2071981213;
        l.bfnt[342] = -1870460895;
        l.bfnt[343] = -312459445;
        l.bfnt[344] = -830215624;
        l.bfnt[345] = -1210714722;
        l.bfnt[346] = -1317996217;
        l.bfnt[347] = 2035015714;
        l.bfnt[348] = -1388733935;
        l.bfnt[349] = 639138924;
        l.bfnt[350] = -370157968;
        l.bfnt[351] = 2006013734;
        l.bfnt[352] = 1942342709;
        l.bfnt[353] = 951013183;
        l.bfnt[354] = 1223422791;
        l.bfnt[355] = 20197139;
        l.bfnt[356] = -1761588021;
        l.bfnt[357] = -188313913;
        l.bfnt[358] = 1893758539;
        l.bfnt[359] = 620205340;
        l.bfnt[360] = -1161457037;
        l.bfnt[361] = 1832384149;
        l.bfnt[362] = -1885387581;
        l.bfnt[363] = -1753041542;
        l.bfnt[364] = 2133530472;
        l.bfnt[365] = 1473885221;
        l.bfnt[366] = 1369176575;
        l.bfnt[367] = 486150704;
        l.bfnt[368] = 429815752;
        l.bfnt[369] = 543722155;
        l.bfnt[370] = -786431260;
        l.bfnt[371] = -948618200;
        l.bfnt[372] = -142792421;
        l.bfnt[373] = -353261088;
        l.bfnt[374] = -774269727;
        l.bfnt[375] = 2035422724;
        l.bfnt[376] = 941182983;
        l.bfnt[377] = -1633613566;
        l.bfnt[378] = 1396901135;
        l.bfnt[379] = 1900617663;
        l.bfnt[380] = 1120493384;
        l.bfnt[381] = 1088627150;
        l.bfnt[382] = 555608851;
        l.bfnt[383] = -1895955174;
        l.bfnt[384] = -354648770;
        l.bfnt[385] = 1241951389;
        l.bfnt[386] = 1948779897;
        l.bfnt[387] = 1884040594;
        l.bfnt[388] = -1496133004;
        l.bfnt[389] = 206813758;
        l.bfnt[390] = 1627525884;
        l.bfnt[391] = -1303629242;
        l.bfnt[392] = 1973750511;
        l.bfnt[393] = 2117393788;
        l.bfnt[394] = 751289092;
        l.bfnt[395] = 836300588;
        l.bfnt[396] = -1410417311;
        l.bfnt[397] = 194083968;
        l.bfnt[398] = -2118123520;
        l.bfnt[399] = -1886046593;
    }

    private static /* synthetic */ int bfns(int n2) {
        return bfnt[n2] ^ bfnu[n2];
    }

    private static /* synthetic */ void bhbc() {
        l.bfnt[100] = -436287680;
        l.bfnt[101] = 235741586;
        l.bfnt[102] = 35540988;
        l.bfnt[103] = 1984546072;
        l.bfnt[104] = 797261558;
        l.bfnt[105] = 1259054500;
        l.bfnt[106] = 206205031;
        l.bfnt[107] = -720108112;
        l.bfnt[108] = 527305332;
        l.bfnt[109] = -544690349;
        l.bfnt[110] = 1900967956;
        l.bfnt[111] = 258962580;
        l.bfnt[112] = 1958913615;
        l.bfnt[113] = 598270408;
        l.bfnt[114] = -1485733475;
        l.bfnt[115] = -1098718862;
        l.bfnt[116] = -1196974909;
        l.bfnt[117] = 846653178;
        l.bfnt[118] = 72354715;
        l.bfnt[119] = 2049510511;
        l.bfnt[120] = -1468281918;
        l.bfnt[121] = 36518824;
        l.bfnt[122] = -1147756611;
        l.bfnt[123] = -1163545425;
        l.bfnt[124] = 105719714;
        l.bfnt[125] = -281351438;
        l.bfnt[126] = -1506918466;
        l.bfnt[127] = 778674386;
        l.bfnt[128] = 1240097661;
        l.bfnt[129] = 1339685321;
        l.bfnt[130] = 1113855657;
        l.bfnt[131] = -593222073;
        l.bfnt[132] = 964297779;
        l.bfnt[133] = 1714853590;
        l.bfnt[134] = 1480136676;
        l.bfnt[135] = -798837082;
        l.bfnt[136] = -1644905675;
        l.bfnt[137] = -1181599892;
        l.bfnt[138] = -425883833;
        l.bfnt[139] = 1894082888;
        l.bfnt[140] = -815129953;
        l.bfnt[141] = -474071080;
        l.bfnt[142] = -232283427;
        l.bfnt[143] = 349805338;
        l.bfnt[144] = -1009518386;
        l.bfnt[145] = 1543367264;
        l.bfnt[146] = 1796460328;
        l.bfnt[147] = 630854191;
        l.bfnt[148] = 1118703010;
        l.bfnt[149] = -485000210;
        l.bfnt[150] = 1246761931;
        l.bfnt[151] = 1336294822;
        l.bfnt[152] = 1422701508;
        l.bfnt[153] = 1515780701;
        l.bfnt[154] = -751057855;
        l.bfnt[155] = -1401388842;
        l.bfnt[156] = -2075738826;
        l.bfnt[157] = -254476152;
        l.bfnt[158] = 1692377051;
        l.bfnt[159] = -1845648560;
        l.bfnt[160] = -520889084;
        l.bfnt[161] = 1667260098;
        l.bfnt[162] = -1326334075;
        l.bfnt[163] = 862836322;
        l.bfnt[164] = 1950486982;
        l.bfnt[165] = 1159827588;
        l.bfnt[166] = 2084318898;
        l.bfnt[167] = -1872108091;
        l.bfnt[168] = 540669729;
        l.bfnt[169] = -468756212;
        l.bfnt[170] = 573830177;
        l.bfnt[171] = 1212515047;
        l.bfnt[172] = 716380969;
        l.bfnt[173] = -557058503;
        l.bfnt[174] = 268035343;
        l.bfnt[175] = -493762791;
        l.bfnt[176] = -1674144403;
        l.bfnt[177] = 740211229;
        l.bfnt[178] = -656563955;
        l.bfnt[179] = 2039044249;
        l.bfnt[180] = 1663009201;
        l.bfnt[181] = 1881543150;
        l.bfnt[182] = -1425117029;
        l.bfnt[183] = -1859007002;
        l.bfnt[184] = -328321141;
        l.bfnt[185] = -1804062583;
        l.bfnt[186] = -38993250;
        l.bfnt[187] = 1293695120;
        l.bfnt[188] = -977518383;
        l.bfnt[189] = -1089932590;
        l.bfnt[190] = -1121178908;
        l.bfnt[191] = 1357445431;
        l.bfnt[192] = 1544319558;
        l.bfnt[193] = -871386944;
        l.bfnt[194] = -551672355;
        l.bfnt[195] = -212777434;
        l.bfnt[196] = 454277361;
        l.bfnt[197] = 831523135;
        l.bfnt[198] = -1234236129;
        l.bfnt[199] = 985333388;
    }

    public l() {
        int n2 = b;
        super("config", "\u0423\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f\u043c\u0438", "cfg");
    }

    private static /* synthetic */ void bhbj() {
        l.bfnu[300] = 920321912;
        l.bfnu[301] = -1486270414;
        l.bfnu[302] = 1976534623;
        l.bfnu[303] = 1427266877;
        l.bfnu[304] = -1162751936;
        l.bfnu[305] = 1262456888;
        l.bfnu[306] = -886256906;
        l.bfnu[307] = 1574033055;
        l.bfnu[308] = 1829703375;
        l.bfnu[309] = -1699289935;
        l.bfnu[310] = 1151355446;
        l.bfnu[311] = 1824584996;
        l.bfnu[312] = 883235256;
        l.bfnu[313] = -270391739;
        l.bfnu[314] = -505096445;
        l.bfnu[315] = 1970779784;
        l.bfnu[316] = -1631953579;
        l.bfnu[317] = -1080122861;
        l.bfnu[318] = 1878265563;
        l.bfnu[319] = 851974470;
        l.bfnu[320] = -1208358106;
        l.bfnu[321] = 1956623642;
        l.bfnu[322] = 1904925473;
        l.bfnu[323] = 1858375030;
        l.bfnu[324] = -1221312528;
        l.bfnu[325] = -1656035514;
        l.bfnu[326] = 1876011586;
        l.bfnu[327] = 981905796;
        l.bfnu[328] = -840738088;
        l.bfnu[329] = -639398262;
        l.bfnu[330] = -361668120;
        l.bfnu[331] = 968979491;
        l.bfnu[332] = 1399666570;
        l.bfnu[333] = 1855583693;
        l.bfnu[334] = 1581667747;
        l.bfnu[335] = 530173805;
        l.bfnu[336] = -282765873;
        l.bfnu[337] = 74215791;
        l.bfnu[338] = 807575757;
        l.bfnu[339] = -1063401253;
        l.bfnu[340] = 1239729208;
        l.bfnu[341] = 1102284327;
        l.bfnu[342] = 1870460894;
        l.bfnu[343] = 1399029318;
        l.bfnu[344] = 830215623;
        l.bfnu[345] = 949723648;
        l.bfnu[346] = -1317996218;
        l.bfnu[347] = -1872588769;
        l.bfnu[348] = -1388733936;
        l.bfnu[349] = 2030723813;
        l.bfnu[350] = 370157967;
        l.bfnu[351] = 392555912;
        l.bfnu[352] = -1942342710;
        l.bfnu[353] = -1819478458;
        l.bfnu[354] = -1223422792;
        l.bfnu[355] = -982897063;
        l.bfnu[356] = 1761588020;
        l.bfnu[357] = -1279842111;
        l.bfnu[358] = -1893758540;
        l.bfnu[359] = -2129613134;
        l.bfnu[360] = -1161457038;
        l.bfnu[361] = 1723433457;
        l.bfnu[362] = 1885387580;
        l.bfnu[363] = 739780105;
        l.bfnu[364] = -2133530473;
        l.bfnu[365] = -1179574794;
        l.bfnu[366] = 1369176575;
        l.bfnu[367] = 486150704;
        l.bfnu[368] = 429815759;
        l.bfnu[369] = 543722150;
        l.bfnu[370] = -786431264;
        l.bfnu[371] = -948618206;
        l.bfnu[372] = -142792432;
        l.bfnu[373] = -353261083;
        l.bfnu[374] = -774269728;
        l.bfnu[375] = 2035422728;
        l.bfnu[376] = 941182978;
        l.bfnu[377] = -1633613566;
        l.bfnu[378] = 1396901123;
        l.bfnu[379] = 1900617659;
        l.bfnu[380] = 1120493381;
        l.bfnu[381] = 1088627141;
        l.bfnu[382] = -555608852;
        l.bfnu[383] = 1916764115;
        l.bfnu[384] = -354648769;
        l.bfnu[385] = 920003624;
        l.bfnu[386] = -1948779898;
        l.bfnu[387] = 409427734;
        l.bfnu[388] = 1496133003;
        l.bfnu[389] = 1638822640;
        l.bfnu[390] = -1627525885;
        l.bfnu[391] = -2139123841;
        l.bfnu[392] = -1973750512;
        l.bfnu[393] = -385087491;
        l.bfnu[394] = 751289090;
        l.bfnu[395] = 836300591;
        l.bfnu[396] = -1410417304;
        l.bfnu[397] = 194083972;
        l.bfnu[398] = -2118123513;
        l.bfnu[399] = -1886046598;
    }

    private static /* synthetic */ void bhbk() {
        l.bfnu[400] = 2094252223;
        l.bfnu[401] = -1149068409;
        l.bfnu[402] = 277190467;
        l.bfnu[403] = 505485342;
    }

    private static /* synthetic */ void bhbn() {
        l.bfww[0] = 6906058617502175594L;
        l.bfww[1] = 5215446115187919404L;
        l.bfww[2] = -5744949593938890563L;
        l.bfww[3] = 6047268795158635169L;
        l.bfww[4] = -5400193876495675337L;
        l.bfww[5] = -4605971808765826046L;
        l.bfww[6] = -2987390143886113639L;
        l.bfww[7] = 1484258652848600083L;
        l.bfww[8] = 5209432806154157034L;
        l.bfww[9] = -2675019431848329714L;
        l.bfww[10] = 3303187962698259477L;
        l.bfww[11] = 3999889995447501042L;
        l.bfww[12] = 7971707290441652341L;
        l.bfww[13] = 9029280825681843359L;
        l.bfww[14] = 2813354282873344312L;
        l.bfww[15] = 6773854544355483727L;
        l.bfww[16] = 650634064059230353L;
        l.bfww[17] = -6417049621361308588L;
        l.bfww[18] = -6380556599603340694L;
        l.bfww[19] = 142306403317088882L;
        l.bfww[20] = -4816905069786547698L;
        l.bfww[21] = 5358598056182484373L;
        l.bfww[22] = 669182470993758698L;
        l.bfww[23] = 4683143557554947209L;
        l.bfww[24] = -1853004798312090401L;
        l.bfww[25] = -8753440985162835914L;
        l.bfww[26] = -2998690938269599864L;
        l.bfww[27] = 5820753313306130661L;
        l.bfww[28] = -8639020040512295854L;
        l.bfww[29] = 7898469671808840810L;
        l.bfww[30] = 1246962875461614570L;
        l.bfww[31] = 6951561230301555014L;
        l.bfww[32] = 3510100474485678265L;
        l.bfww[33] = 2004731590441892811L;
        l.bfww[34] = -6075754036056434937L;
        l.bfww[35] = -4410636776983100161L;
        l.bfww[36] = -2094672635207720856L;
        l.bfww[37] = 5874544149080003242L;
        l.bfww[38] = 6242269318566679330L;
        l.bfww[39] = 4318079532365246038L;
        l.bfww[40] = 7980960929628201328L;
        l.bfww[41] = -1769913411762132922L;
        l.bfww[42] = -4784598035861300528L;
        l.bfww[43] = -2801764946751967259L;
        l.bfww[44] = 1538507503884730423L;
        l.bfww[45] = -1675538116963725014L;
        l.bfww[46] = 2042398856040549474L;
        l.bfww[47] = -8614101130345617117L;
        l.bfww[48] = -5867150260118672955L;
        l.bfww[49] = 3378900873431949000L;
        l.bfww[50] = 5128370858671398877L;
        l.bfww[51] = 2516399011217480296L;
        l.bfww[52] = 9119300035957234320L;
        l.bfww[53] = -3100716438081811715L;
        l.bfww[54] = -7213316681829487096L;
        l.bfww[55] = -2542703157122024212L;
        l.bfww[56] = -8471651425424594213L;
        l.bfww[57] = -5507596316763513309L;
        l.bfww[58] = 3723993466974116253L;
        l.bfww[59] = 7728481487105702075L;
        l.bfww[60] = -925344561325874875L;
        l.bfww[61] = 5835381391417854273L;
        l.bfww[62] = 7651522944469252247L;
        l.bfww[63] = -861625439035639882L;
        l.bfww[64] = 8290132435559646635L;
        l.bfww[65] = -2157651457473584910L;
        l.bfww[66] = -5140694237979817530L;
        l.bfww[67] = 1255816929935097273L;
        l.bfww[68] = -356131897568529700L;
        l.bfww[69] = -6507083821859398126L;
        l.bfww[70] = -1103225505213665979L;
        l.bfww[71] = 8019756238271818325L;
        l.bfww[72] = -3534180633208113430L;
        l.bfww[73] = 8391352541341847245L;
        l.bfww[74] = 6140402995197284022L;
        l.bfww[75] = 6459820356719653023L;
        l.bfww[76] = 3791847906418888418L;
        l.bfww[77] = -1067642194296872034L;
        l.bfww[78] = 8118375144154761256L;
        l.bfww[79] = -7924039153233940121L;
        l.bfww[80] = 1475611589153266660L;
        l.bfww[81] = 7271973498769539326L;
        l.bfww[82] = 647612190747460277L;
        l.bfww[83] = -2620030530090360089L;
        l.bfww[84] = -2793487733744941120L;
        l.bfww[85] = -5705194731300314064L;
        l.bfww[86] = -3041540884159535177L;
        l.bfww[87] = -736135498211790159L;
        l.bfww[88] = -1780884866701275347L;
        l.bfww[89] = -4345631797518462411L;
        l.bfww[90] = 37454278488044992L;
        l.bfww[91] = 245481148384629079L;
        l.bfww[92] = 2978790885154137087L;
        l.bfww[93] = 3525987331304405244L;
        l.bfww[94] = -4913180981850724794L;
        l.bfww[95] = 6447927274164875830L;
        l.bfww[96] = 323815789287133136L;
        l.bfww[97] = -6976554241309756482L;
        l.bfww[98] = -3225519005393415468L;
        l.bfww[99] = -7686386680072797913L;
    }

    public static /* synthetic */ CallSite bfnv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    static {
        bfnt = new int[404];
        bfnu = new int[404];
        l.bhbb();
        l.bhbc();
        l.bhbd();
        l.bhbe();
        l.bhbf();
        l.bhbg();
        l.bhbh();
        l.bhbi();
        l.bhbj();
        l.bhbk();
        bfwv = new long[195];
        bfww = new long[195];
        l.bhbl();
        l.bhbm();
        l.bhbn();
        l.bhbo();
    }
}

