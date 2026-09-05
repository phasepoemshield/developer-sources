/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1294
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1294;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_3532;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.ke;
import ruhack.phobia.nj;

public class hk
extends ds {
    private static int[] cyvq;
    public static final int b;
    public static final long gu = -2642092630624630102L;
    private static long[] cyvy;
    private final ke criticalModes;
    private static long[] cyvz;
    public static final boolean c;
    public static final boolean a;
    private static int[] cyvp;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isInCobweb() {
        block142: {
            block141: {
                v0 /* !! */  = hk.gu;
                if (true) ** GOTO lbl5
                block86: while (true) {
                    v0 /* !! */  = (long)(v1 - hk.cyvr("cywa", cyvx(int ), (int)0));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case 572701265: {
                            v1 = hk.cyvr("cywb", cyvx(int ), (int)1);
                            continue block86;
                        }
                        case 938543786: {
                            break block86;
                        }
                        case 1264057205: {
                            v1 = hk.cyvr("cywc", cyvx(int ), (int)2);
                            continue block86;
                        }
                    }
                    break;
                }
                var6_1 = hk.c;
                v2 /* !! */  = hk.gu;
                if (true) ** GOTO lbl19
                block87: while (true) {
                    v2 /* !! */  = (long)(v3 - hk.cyvr("cywd", cyvx(int ), (int)3));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -467496621: {
                            v3 = hk.cyvr("cywe", cyvx(int ), (int)4);
                            continue block87;
                        }
                        case 591354024: {
                            v3 = hk.cyvr("cywf", cyvx(int ), (int)5);
                            continue block87;
                        }
                        case 938543786: {
                            break block87;
                        }
                    }
                    break;
                }
                var5_2 /* !! */  = hk.b;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hk.gu - hk.cyvr("cywg", cyvx(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == hk.cyvr("cywh", cyvo(int ), (int)5)) break;
                    v4 /* !! */  = (long)hk.cyvr("cywi", cyvo(int ), (int)6);
                }
                var4_3 = hk.a;
                if (var6_1) {
                    throw null;
lbl37:
                    // 13 sources

                    return (boolean)hk.cyvr("cywj", cyvo(int ), (int)7);
                }
                if (var4_3 || var4_3) ** GOTO lbl37
                v5 /* !! */  = hk.gu;
                if (true) ** GOTO lbl44
                block90: while (true) {
                    v5 /* !! */  = (long)(v6 - hk.cyvr("cywk", cyvx(int ), (int)7));
lbl44:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 938543786: {
                            break block90;
                        }
                        case 940732192: {
                            v6 = hk.cyvr("cywl", cyvx(int ), (int)8);
                            continue block90;
                        }
                        case 1123729689: {
                            v6 = hk.cyvr("cywm", cyvx(int ), (int)9);
                            continue block90;
                        }
                        case 1861805538: {
                            v6 = hk.cyvr("cywn", cyvx(int ), (int)10);
                            continue block90;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = hk.gu - hk.cyvr("cywo", cyvx(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hk.cyvr("cywp", cyvo(int ), (int)8)) break;
                    v7 /* !! */  = (long)hk.cyvr("cywq", cyvo(int ), (int)9);
                }
                if (hk.mc.field_1724 == null) break block141;
                if (var4_3) ** GOTO lbl37
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = hk.gu - hk.cyvr("cywr", cyvx(int ), (int)12)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hk.cyvr("cyws", cyvo(int ), (int)10)) break;
                    v8 /* !! */  = (long)hk.cyvr("cywt", cyvo(int ), (int)11);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = hk.gu - hk.cyvr("cywu", cyvx(int ), (int)13)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hk.cyvr("cywv", cyvo(int ), (int)12)) break;
                    v9 /* !! */  = (long)hk.cyvr("cyww", cyvo(int ), (int)13);
                }
                if (hk.mc.field_1687 != null) break block142;
                if (var4_3) ** GOTO lbl37
            }
            if (var4_3 || var4_3) ** GOTO lbl37
            return (boolean)hk.cyvr("cywx", cyvo(int ), (int)14);
        }
        if (var4_3 || var4_3) ** GOTO lbl37
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = hk.gu - hk.cyvr("cywy", cyvx(int ), (int)14)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hk.cyvr("cywz", cyvo(int ), (int)15)) break;
            v10 /* !! */  = (long)hk.cyvr("cyxa", cyvo(int ), (int)16);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_5 = hk.gu - hk.cyvr("cyxb", cyvx(int ), (int)15)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hk.cyvr("cyxc", cyvo(int ), (int)17)) break;
            v11 /* !! */  = (long)hk.cyvr("cyxd", cyvo(int ), (int)18);
        }
        v12 = hk.mc.field_1724;
        v13 /* !! */  = hk.gu;
        if (true) ** GOTO lbl95
        block96: while (true) {
            v13 /* !! */  = (long)(v14 - hk.cyvr("cyxe", cyvx(int ), (int)16));
lbl95:
            // 2 sources

            switch ((int)v13 /* !! */ ) {
                case -1717411542: {
                    v14 = hk.cyvr("cyxf", cyvx(int ), (int)17);
                    continue block96;
                }
                case 938543786: {
                    break block96;
                }
                case 1897955588: {
                    v14 = hk.cyvr("cyxg", cyvx(int ), (int)18);
                    continue block96;
                }
            }
            break;
        }
        var1_4 = v12.method_5829();
        if (var4_3 || var4_3) ** GOTO lbl37
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_6 = hk.gu - hk.cyvr("cyxh", cyvx(int ), (int)19)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == hk.cyvr("cyxi", cyvo(int ), (int)19)) break;
            v15 /* !! */  = (long)hk.cyvr("cyxj", cyvo(int ), (int)20);
        }
        v16 = var1_4.field_1323;
        v17 /* !! */  = hk.gu;
        if (true) ** GOTO lbl116
        block98: while (true) {
            v17 /* !! */  = (long)(v18 - hk.cyvr("cyxk", cyvx(int ), (int)20));
lbl116:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case 424938586: {
                    v18 = hk.cyvr("cyxl", cyvx(int ), (int)21);
                    continue block98;
                }
                case 938543786: {
                    break block98;
                }
                case 1992249725: {
                    v18 = hk.cyvr("cyxm", cyvx(int ), (int)22);
                    continue block98;
                }
            }
            break;
        }
        v19 = class_3532.method_15357((double)v16);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_7 = hk.gu - hk.cyvr("cyxn", cyvx(int ), (int)23)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == hk.cyvr("cyxo", cyvo(int ), (int)21)) break;
            v20 /* !! */  = (long)hk.cyvr("cyxp", cyvo(int ), (int)22);
        }
        v21 = var1_4.field_1322;
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_8 = hk.gu - hk.cyvr("cyxq", cyvx(int ), (int)24)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == hk.cyvr("cyxr", cyvo(int ), (int)23)) break;
            v22 /* !! */  = (long)hk.cyvr("cyxs", cyvo(int ), (int)24);
        }
        v23 = class_3532.method_15357((double)v21);
        v24 /* !! */  = hk.gu;
        if (true) ** GOTO lbl142
        block101: while (true) {
            v24 /* !! */  = (long)(hk.cyvr("cyxu", cyvx(int ), (int)26) - hk.cyvr("cyxt", cyvx(int ), (int)25));
lbl142:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -57706970: {
                    continue block101;
                }
                case 938543786: {
                    break block101;
                }
            }
            break;
        }
        v25 = var1_4.field_1321;
        while (true) {
            if ((v26 /* !! */  = (cfr_temp_9 = hk.gu - hk.cyvr("cyxv", cyvx(int ), (int)27)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v26 /* !! */  == hk.cyvr("cyxw", cyvo(int ), (int)25)) break;
            v26 /* !! */  = (long)hk.cyvr("cyxx", cyvo(int ), (int)26);
        }
        v27 = class_3532.method_15357((double)v25);
        while (true) {
            if ((v28 /* !! */  = (cfr_temp_10 = hk.gu - hk.cyvr("cyxy", cyvx(int ), (int)28)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v28 /* !! */  == hk.cyvr("cyxz", cyvo(int ), (int)27)) break;
            v28 /* !! */  = (long)hk.cyvr("cyya", cyvo(int ), (int)28);
        }
        v29 = var1_4.field_1320;
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_11 = hk.gu - hk.cyvr("cyyb", cyvx(int ), (int)29)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == hk.cyvr("cyyc", cyvo(int ), (int)29)) break;
            v30 /* !! */  = (long)hk.cyvr("cyyd", cyvo(int ), (int)30);
        }
        v31 = class_3532.method_15357((double)v29);
        v32 /* !! */  = hk.gu;
        if (true) ** GOTO lbl170
        block105: while (true) {
            v32 /* !! */  = (long)(v33 - hk.cyvr("cyye", cyvx(int ), (int)30));
lbl170:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -1718123849: {
                    v33 = hk.cyvr("cyyf", cyvx(int ), (int)31);
                    continue block105;
                }
                case -1509640489: {
                    v33 = hk.cyvr("cyyg", cyvx(int ), (int)32);
                    continue block105;
                }
                case 938543786: {
                    break block105;
                }
            }
            break;
        }
        v34 = var1_4.field_1325;
        while (true) {
            if ((v35 /* !! */  = (cfr_temp_12 = hk.gu - hk.cyvr("cyyh", cyvx(int ), (int)33)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v35 /* !! */  == hk.cyvr("cyyi", cyvo(int ), (int)31)) break;
            v35 /* !! */  = (long)hk.cyvr("cyyj", cyvo(int ), (int)32);
        }
        v36 = class_3532.method_15357((double)v34);
        v37 /* !! */  = hk.gu;
        if (true) ** GOTO lbl190
        block107: while (true) {
            v37 /* !! */  = (long)(v38 - hk.cyvr("cyyk", cyvx(int ), (int)34));
lbl190:
            // 2 sources

            switch ((int)v37 /* !! */ ) {
                case 938543786: {
                    break block107;
                }
                case 1306853070: {
                    v38 = hk.cyvr("cyyl", cyvx(int ), (int)35);
                    continue block107;
                }
                case 1388752838: {
                    v38 = hk.cyvr("cyym", cyvx(int ), (int)36);
                    continue block107;
                }
                case 1960731330: {
                    v38 = hk.cyvr("cyyn", cyvx(int ), (int)37);
                    continue block107;
                }
            }
            break;
        }
        v39 = var1_4.field_1324;
        while (true) {
            if ((v40 /* !! */  = (cfr_temp_13 = hk.gu - hk.cyvr("cyyo", cyvx(int ), (int)38)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v40 /* !! */  == hk.cyvr("cyyp", cyvo(int ), (int)33)) break;
            v40 /* !! */  = (long)hk.cyvr("cyyq", cyvo(int ), (int)34);
        }
        v41 = class_3532.method_15357((double)v39);
        while (true) {
            if ((v42 /* !! */  = (cfr_temp_14 = hk.gu - hk.cyvr("cyyr", cyvx(int ), (int)39)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
            if (v42 /* !! */  == hk.cyvr("cyys", cyvo(int ), (int)35)) break;
            v42 /* !! */  = (long)hk.cyvr("cyyt", cyvo(int ), (int)36);
        }
        v43 = class_2338.method_10094((int)v19, (int)v23, (int)v27, (int)v31, (int)v36, (int)v41);
        v44 /* !! */  = hk.gu;
        if (true) ** GOTO lbl219
        block110: while (true) {
            v44 /* !! */  = (long)(v45 - hk.cyvr("cyyu", cyvx(int ), (int)40));
lbl219:
            // 2 sources

            switch ((int)v44 /* !! */ ) {
                case -1035263633: {
                    v45 = hk.cyvr("cyyv", cyvx(int ), (int)41);
                    continue block110;
                }
                case -826079617: {
                    v45 = hk.cyvr("cyyw", cyvx(int ), (int)42);
                    continue block110;
                }
                case 481057113: {
                    v45 = hk.cyvr("cyyx", cyvx(int ), (int)43);
                    continue block110;
                }
                case 938543786: {
                    break block110;
                }
            }
            break;
        }
        var2_5 = v43.iterator();
        if (var4_3) ** GOTO lbl37
        block111: while (true) {
            block143: {
                if (var4_3 || var4_3) ** GOTO lbl37
                while (true) {
                    if ((v46 /* !! */  = (cfr_temp_15 = hk.gu - hk.cyvr("cyyy", cyvx(int ), (int)44)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v46 /* !! */  == hk.cyvr("cyyz", cyvo(int ), (int)37)) break;
                    v46 /* !! */  = (long)hk.cyvr("cyza", cyvo(int ), (int)38);
                }
                if (!var2_5.hasNext()) ** GOTO lbl305
                if (var4_3) ** GOTO lbl37
                while (true) {
                    if ((v47 /* !! */  = (cfr_temp_16 = hk.gu - hk.cyvr("cyzb", cyvx(int ), (int)45)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v47 /* !! */  == hk.cyvr("cyzc", cyvo(int ), (int)39)) break;
                    v47 /* !! */  = (long)hk.cyvr("cyzd", cyvo(int ), (int)40);
                }
                var3_6 = (class_2338)var2_5.next();
                if (var4_3 || var4_3) ** GOTO lbl37
                v48 /* !! */  = hk.gu;
                if (true) ** GOTO lbl253
                block114: while (true) {
                    v48 /* !! */  = (long)(v49 - hk.cyvr("cyze", cyvx(int ), (int)46));
lbl253:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case -714812295: {
                            v49 = hk.cyvr("cyzf", cyvx(int ), (int)47);
                            continue block114;
                        }
                        case 534303469: {
                            v49 = hk.cyvr("cyzg", cyvx(int ), (int)48);
                            continue block114;
                        }
                        case 938543786: {
                            break block114;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v50 /* !! */  = (cfr_temp_17 = hk.gu - hk.cyvr("cyzh", cyvx(int ), (int)49)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v50 /* !! */  == hk.cyvr("cyzi", cyvo(int ), (int)41)) break;
                    v50 /* !! */  = (long)hk.cyvr("cyzj", cyvo(int ), (int)42);
                }
                v51 = hk.mc.field_1687;
                v52 /* !! */  = hk.gu;
                if (true) ** GOTO lbl272
                block116: while (true) {
                    v52 /* !! */  = (long)(v53 - hk.cyvr("cyzk", cyvx(int ), (int)50));
lbl272:
                    // 2 sources

                    switch ((int)v52 /* !! */ ) {
                        case -1843772278: {
                            v53 = hk.cyvr("cyzl", cyvx(int ), (int)51);
                            continue block116;
                        }
                        case -185743426: {
                            v53 = hk.cyvr("cyzm", cyvx(int ), (int)52);
                            continue block116;
                        }
                        case 938543786: {
                            break block116;
                        }
                        case 1555408009: {
                            v53 = hk.cyvr("cyzn", cyvx(int ), (int)53);
                            continue block116;
                        }
                    }
                    break;
                }
                v54 = v51.method_8320(var3_6);
                while (true) {
                    if ((v55 /* !! */  = (cfr_temp_18 = hk.gu - hk.cyvr("cyzo", cyvx(int ), (int)54)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v55 /* !! */  == hk.cyvr("cyzp", cyvo(int ), (int)43)) break;
                    v55 /* !! */  = (long)hk.cyvr("cyzq", cyvo(int ), (int)44);
                }
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_19 = hk.gu - hk.cyvr("cyzr", cyvx(int ), (int)55)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == hk.cyvr("cyzs", cyvo(int ), (int)45)) break;
                    v56 /* !! */  = (long)hk.cyvr("cyzt", cyvo(int ), (int)46);
                }
                if (!v54.method_27852(class_2246.field_10343)) break block143;
                if (var4_3 || var4_3) ** GOTO lbl37
                return (boolean)hk.cyvr("cyzu", cyvo(int ), (int)47);
            }
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var4_3 || var4_3) ** GOTO lbl37
                    if (!var6_1) continue block111;
                    throw null;
                }
lbl305:
                // 1 sources

                if (!var4_3 && !var4_3) ** break;
                ** continue;
                return (boolean)hk.cyvr("cyzv", cyvo(int ), (int)48);
                case 0: {
                    var5_2 /* !! */  = (int)hk.cyvr("cyzw", cyvo(int ), (int)49);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl351
                }
lbl313:
                // 2 sources

                case 1: {
                    var5_2 /* !! */  = (int)hk.cyvr("cyzx", cyvo(int ), (int)50);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl381
                }
                case 2: {
                    var5_2 /* !! */  = (int)hk.cyvr("cyzy", cyvo(int ), (int)51);
                    if (var6_1) {
                        throw null;
                    }
                }
lbl322:
                // 4 sources

                case 3: {
                    var5_2 /* !! */  = (int)hk.cyvr("cyzz", cyvo(int ), (int)52);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl377
                }
                case 4: {
                    do {
                        var5_2 /* !! */  = (int)hk.cyvr("czaa", cyvo(int ), (int)53);
                    } while (!var6_1);
                    throw null;
                }
                case 5: {
                    var5_2 /* !! */  = (int)hk.cyvr("czab", cyvo(int ), (int)54);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl381
                }
lbl337:
                // 3 sources

                case 6: {
                    var5_2 /* !! */  = (int)hk.cyvr("czac", cyvo(int ), (int)55);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl390
                }
lbl342:
                // 3 sources

                case 7: {
                    do {
                        var5_2 /* !! */  = (int)hk.cyvr("czad", cyvo(int ), (int)56);
                    } while (!var6_1);
                    throw null;
                }
                case 8: {
                    var5_2 /* !! */  = (int)hk.cyvr("czae", cyvo(int ), (int)57);
                    if (!var6_1) ** GOTO lbl337
                    throw null;
                }
lbl351:
                // 3 sources

                case 9: {
                    var5_2 /* !! */  = (int)hk.cyvr("czaf", cyvo(int ), (int)58);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl360
                }
lbl356:
                // 3 sources

                case 10: {
                    var5_2 /* !! */  = (int)hk.cyvr("czag", cyvo(int ), (int)59);
                    if (!var6_1) break block111;
                    throw null;
                }
lbl360:
                // 2 sources

                case 11: {
                    var5_2 /* !! */  = (int)hk.cyvr("czah", cyvo(int ), (int)60);
                    if (!var6_1) ** GOTO lbl356
                    throw null;
                }
lbl364:
                // 2 sources

                case 12: {
                    var5_2 /* !! */  = (int)hk.cyvr("czai", cyvo(int ), (int)61);
                    if (!var6_1) ** GOTO lbl313
                    throw null;
                }
                case 13: {
                    var5_2 /* !! */  = (int)hk.cyvr("czaj", cyvo(int ), (int)62);
                    if (!var6_1) ** GOTO lbl342
                    throw null;
                }
                case 14: {
                    var5_2 /* !! */  = (int)hk.cyvr("czak", cyvo(int ), (int)63);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl381
                }
lbl377:
                // 3 sources

                case 15: {
                    var5_2 /* !! */  = (int)hk.cyvr("czal", cyvo(int ), (int)64);
                    if (!var6_1) ** GOTO lbl356
                    throw null;
                }
lbl381:
                // 4 sources

                case 16: {
                    var5_2 /* !! */  = (int)hk.cyvr("czam", cyvo(int ), (int)65);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl416
                }
                case 17: {
                    var5_2 /* !! */  = (int)hk.cyvr("czan", cyvo(int ), (int)66);
                    if (!var6_1) ** GOTO lbl342
                    throw null;
                }
lbl390:
                // 2 sources

                case 18: lbl-1000:
                // 2 sources

                {
                    while (true) lbl-1000:
                    // 2 sources

                    {
                        var5_2 /* !! */  = (int)hk.cyvr("czao", cyvo(int ), (int)67);
                        if (!var6_1) ** GOTO lbl-1000
                        throw null;
                    }
                }
                case 19: {
                    var5_2 /* !! */  = (int)hk.cyvr("czap", cyvo(int ), (int)68);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl404
                }
                case 20: {
                    var5_2 /* !! */  = (int)hk.cyvr("czaq", cyvo(int ), (int)69);
                    if (!var6_1) ** GOTO lbl337
                    throw null;
                }
lbl404:
                // 2 sources

                case 21: {
                    var5_2 /* !! */  = (int)hk.cyvr("czar", cyvo(int ), (int)70);
                    if (!var6_1) ** GOTO lbl322
                    throw null;
                }
                case 22: {
                    var5_2 /* !! */  = (int)hk.cyvr("czas", cyvo(int ), (int)71);
                    if (!var6_1) ** GOTO lbl377
                    throw null;
                }
                case 23: {
                    var5_2 /* !! */  = (int)hk.cyvr("czat", cyvo(int ), (int)72);
                    if (!var6_1) ** GOTO lbl351
                    throw null;
                }
lbl416:
                // 2 sources

                case 24: {
                    var5_2 /* !! */  = (int)hk.cyvr("czau", cyvo(int ), (int)73);
                    if (!var6_1) ** GOTO lbl364
                    throw null;
                }
                case 25: 
            }
            break;
        }
        var5_2 /* !! */  = (int)hk.cyvr("czav", cyvo(int ), (int)74);
        ** while (!var6_1)
lbl423:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void czxk() {
        hk.cyvq[100] = -1571196112;
        hk.cyvq[101] = 724426195;
        hk.cyvq[102] = 444951514;
        hk.cyvq[103] = 1672281136;
        hk.cyvq[104] = 313232798;
        hk.cyvq[105] = 700028209;
        hk.cyvq[106] = -515710584;
        hk.cyvq[107] = 448693393;
        hk.cyvq[108] = -1978423127;
        hk.cyvq[109] = 888375085;
        hk.cyvq[110] = 91342101;
        hk.cyvq[111] = 1605415068;
        hk.cyvq[112] = -26340511;
        hk.cyvq[113] = -525791286;
        hk.cyvq[114] = 374619269;
        hk.cyvq[115] = 699233879;
        hk.cyvq[116] = 760082234;
        hk.cyvq[117] = 1103112466;
        hk.cyvq[118] = 2130895863;
        hk.cyvq[119] = -2099951243;
        hk.cyvq[120] = -1856872853;
        hk.cyvq[121] = -475369739;
        hk.cyvq[122] = 1051952120;
        hk.cyvq[123] = -998184530;
        hk.cyvq[124] = -1777338109;
        hk.cyvq[125] = 1198391707;
        hk.cyvq[126] = 1353965262;
        hk.cyvq[127] = 1072245204;
        hk.cyvq[128] = 1551293372;
        hk.cyvq[129] = -700503876;
        hk.cyvq[130] = -305165342;
        hk.cyvq[131] = -1647064733;
        hk.cyvq[132] = 2057140341;
        hk.cyvq[133] = 1945000422;
        hk.cyvq[134] = -1847849293;
        hk.cyvq[135] = -1602553794;
        hk.cyvq[136] = 1721025007;
        hk.cyvq[137] = 226818039;
        hk.cyvq[138] = -1791978044;
        hk.cyvq[139] = -1634040665;
        hk.cyvq[140] = 1563847245;
        hk.cyvq[141] = 60754359;
        hk.cyvq[142] = -2062073737;
        hk.cyvq[143] = -943017332;
        hk.cyvq[144] = 1636234255;
        hk.cyvq[145] = 567534840;
        hk.cyvq[146] = 2074047242;
        hk.cyvq[147] = -1735216409;
        hk.cyvq[148] = 1461520621;
        hk.cyvq[149] = 240876771;
        hk.cyvq[150] = 829730375;
        hk.cyvq[151] = -1654370793;
        hk.cyvq[152] = 925419931;
        hk.cyvq[153] = 578452380;
        hk.cyvq[154] = 1614004070;
        hk.cyvq[155] = 2053986341;
        hk.cyvq[156] = -1613693181;
        hk.cyvq[157] = 1158377579;
        hk.cyvq[158] = -2089457848;
        hk.cyvq[159] = -1678173442;
        hk.cyvq[160] = -702273543;
        hk.cyvq[161] = 658647075;
        hk.cyvq[162] = -1701944598;
        hk.cyvq[163] = 108699463;
        hk.cyvq[164] = -235653175;
        hk.cyvq[165] = -1270507000;
        hk.cyvq[166] = -1234012890;
        hk.cyvq[167] = -1407936816;
        hk.cyvq[168] = -1738423288;
        hk.cyvq[169] = -410262719;
        hk.cyvq[170] = -209674555;
        hk.cyvq[171] = 1958176768;
        hk.cyvq[172] = 781311381;
        hk.cyvq[173] = -1311074075;
        hk.cyvq[174] = -606512158;
        hk.cyvq[175] = -1715661023;
        hk.cyvq[176] = -1403374993;
        hk.cyvq[177] = -1936642977;
        hk.cyvq[178] = -1666805595;
        hk.cyvq[179] = -1546101916;
        hk.cyvq[180] = -285672832;
        hk.cyvq[181] = -906675229;
        hk.cyvq[182] = -2085240015;
        hk.cyvq[183] = 178297453;
        hk.cyvq[184] = -394260282;
        hk.cyvq[185] = -728213262;
        hk.cyvq[186] = -848477882;
        hk.cyvq[187] = 1745690964;
        hk.cyvq[188] = -134603610;
        hk.cyvq[189] = -850664992;
        hk.cyvq[190] = 1550201661;
        hk.cyvq[191] = 452285553;
        hk.cyvq[192] = -76584059;
        hk.cyvq[193] = 1091003468;
        hk.cyvq[194] = -345271040;
        hk.cyvq[195] = 956582373;
        hk.cyvq[196] = 169896325;
        hk.cyvq[197] = -1500842408;
        hk.cyvq[198] = -73168904;
        hk.cyvq[199] = 803804450;
    }

    private static /* synthetic */ void czxh() {
        hk.cyvp[100] = -2024366651;
        hk.cyvp[101] = -724426196;
        hk.cyvp[102] = 1853374029;
        hk.cyvp[103] = 1672281136;
        hk.cyvp[104] = 313232799;
        hk.cyvp[105] = -2105891777;
        hk.cyvp[106] = 515710583;
        hk.cyvp[107] = 1415325900;
        hk.cyvp[108] = -1978423125;
        hk.cyvp[109] = 888375086;
        hk.cyvp[110] = 91342100;
        hk.cyvp[111] = 1605415070;
        hk.cyvp[112] = 26340510;
        hk.cyvp[113] = 1208180530;
        hk.cyvp[114] = -374619270;
        hk.cyvp[115] = 1602480661;
        hk.cyvp[116] = 760082235;
        hk.cyvp[117] = 1975941839;
        hk.cyvp[118] = 2130895862;
        hk.cyvp[119] = 2099951242;
        hk.cyvp[120] = 1307323844;
        hk.cyvp[121] = -475369740;
        hk.cyvp[122] = 182896382;
        hk.cyvp[123] = -998184532;
        hk.cyvp[124] = -1777338109;
        hk.cyvp[125] = 1198391706;
        hk.cyvp[126] = 1353965261;
        hk.cyvp[127] = -1072245205;
        hk.cyvp[128] = 1901322096;
        hk.cyvp[129] = -700503876;
        hk.cyvp[130] = 305165341;
        hk.cyvp[131] = 589469634;
        hk.cyvp[132] = 2057140340;
        hk.cyvp[133] = 1945000422;
        hk.cyvp[134] = -1847849292;
        hk.cyvp[135] = -1602553794;
        hk.cyvp[136] = 1721025007;
        hk.cyvp[137] = 226818032;
        hk.cyvp[138] = -1791978044;
        hk.cyvp[139] = -1634040667;
        hk.cyvp[140] = 1563847240;
        hk.cyvp[141] = 60754352;
        hk.cyvp[142] = -2062073741;
        hk.cyvp[143] = 943017331;
        hk.cyvp[144] = 742517401;
        hk.cyvp[145] = -567534841;
        hk.cyvp[146] = -178887530;
        hk.cyvp[147] = 1735216408;
        hk.cyvp[148] = 1710741374;
        hk.cyvp[149] = 240876771;
        hk.cyvp[150] = -829730376;
        hk.cyvp[151] = 709022696;
        hk.cyvp[152] = 925419930;
        hk.cyvp[153] = 578452380;
        hk.cyvp[154] = 1614004067;
        hk.cyvp[155] = 2053986341;
        hk.cyvp[156] = -1613693184;
        hk.cyvp[157] = 1158377578;
        hk.cyvp[158] = -2089457856;
        hk.cyvp[159] = -1678173447;
        hk.cyvp[160] = -702273538;
        hk.cyvp[161] = 658647072;
        hk.cyvp[162] = -1701944593;
        hk.cyvp[163] = 108699462;
        hk.cyvp[164] = 235653174;
        hk.cyvp[165] = -906833509;
        hk.cyvp[166] = -1234012889;
        hk.cyvp[167] = 536378727;
        hk.cyvp[168] = 1738423287;
        hk.cyvp[169] = 1204291216;
        hk.cyvp[170] = -209674556;
        hk.cyvp[171] = 1958176768;
        hk.cyvp[172] = 781311382;
        hk.cyvp[173] = -1311074066;
        hk.cyvp[174] = -606512155;
        hk.cyvp[175] = -1715661015;
        hk.cyvp[176] = -1403375004;
        hk.cyvp[177] = -1936642984;
        hk.cyvp[178] = -1666805599;
        hk.cyvp[179] = -1546101914;
        hk.cyvp[180] = -285672824;
        hk.cyvp[181] = -906675225;
        hk.cyvp[182] = -2085240014;
        hk.cyvp[183] = 178297450;
        hk.cyvp[184] = -394260281;
        hk.cyvp[185] = -387585117;
        hk.cyvp[186] = -848477882;
        hk.cyvp[187] = 1745690965;
        hk.cyvp[188] = 583178915;
        hk.cyvp[189] = 850664991;
        hk.cyvp[190] = -668091282;
        hk.cyvp[191] = -452285554;
        hk.cyvp[192] = 813666453;
        hk.cyvp[193] = -1091003469;
        hk.cyvp[194] = -834187368;
        hk.cyvp[195] = -956582374;
        hk.cyvp[196] = 1742703171;
        hk.cyvp[197] = -1500842407;
        hk.cyvp[198] = -73168904;
        hk.cyvp[199] = 803804450;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isActiveForCurrentState() {
        v0 /* !! */  = hk.gu;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(hk.cyvr("czsv", cyvx(int ), (int)100) - hk.cyvr("czst", cyvx(int ), (int)99));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 938543786: {
                    break block28;
                }
                case 2016357093: {
                    continue block28;
                }
            }
            break;
        }
        var3_1 = hk.c;
        v1 /* !! */  = hk.gu;
        if (true) ** GOTO lbl15
        block29: while (true) {
            v1 /* !! */  = (long)(hk.cyvr("czsy", cyvx(int ), (int)102) - hk.cyvr("czsx", cyvx(int ), (int)101));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1093463898: {
                    continue block29;
                }
                case 938543786: {
                    break block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = hk.b;
        v2 /* !! */  = hk.gu;
        if (true) ** GOTO lbl25
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - hk.cyvr("czsz", cyvx(int ), (int)103));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1559081701: {
                    v3 = hk.cyvr("cztb", cyvx(int ), (int)104);
                    continue block30;
                }
                case -421903216: {
                    v3 = hk.cyvr("cztf", cyvx(int ), (int)105);
                    continue block30;
                }
                case 938543786: {
                    break block30;
                }
                case 2033797471: {
                    v3 = hk.cyvr("czth", cyvx(int ), (int)106);
                    continue block30;
                }
            }
            break;
        }
        var1_3 = hk.a;
        if (var3_1) {
            throw null;
lbl40:
            // 6 sources

            return (boolean)hk.cyvr("czti", cyvo(int ), (int)163);
        }
        if (var1_3 || var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hk.gu - hk.cyvr("cztl", cyvx(int ), (int)107)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hk.cyvr("cztm", cyvo(int ), (int)164)) break;
                    v4 /* !! */  = (long)hk.cyvr("cztn", cyvo(int ), (int)165);
                }
                if (!this.isState()) ** GOTO lbl75
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hk.gu - hk.cyvr("czto", cyvx(int ), (int)108)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hk.cyvr("cztt", cyvo(int ), (int)166)) break;
                    v5 /* !! */  = (long)hk.cyvr("cztu", cyvo(int ), (int)167);
                }
                if (this.isWebModeActive()) ** GOTO lbl70
                if (var1_3) ** GOTO lbl40
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = hk.gu - hk.cyvr("cztx", cyvx(int ), (int)109)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v6 /* !! */  == hk.cyvr("czty", cyvo(int ), (int)168)) break;
                    v6 /* !! */  = (long)hk.cyvr("cztz", cyvo(int ), (int)169);
                }
                if (!this.isSlowFallingModeActive()) ** GOTO lbl75
                if (var1_3) ** GOTO lbl40
lbl70:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl40
                v7 = hk.cyvr("czua", cyvo(int ), (int)170);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl78
lbl75:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v7 = hk.cyvr("czub", cyvo(int ), (int)171);
lbl78:
                // 2 sources

                return (boolean)v7;
            }
lbl79:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)hk.cyvr("czuf", cyvo(int ), (int)172);
                if (var3_1) {
                    throw null;
                }
            }
lbl83:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)hk.cyvr("czuh", cyvo(int ), (int)173);
                if (!var3_1) break;
                throw null;
            }
lbl87:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hk.cyvr("czui", cyvo(int ), (int)174);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hk.cyvr("czuj", cyvo(int ), (int)175);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl114
                    break;
                }
            }
lbl97:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hk.cyvr("czul", cyvo(int ), (int)176);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)hk.cyvr("czum", cyvo(int ), (int)177);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hk.cyvr("czun", cyvo(int ), (int)178);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)hk.cyvr("czuo", cyvo(int ), (int)179);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
lbl114:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)hk.cyvr("czup", cyvo(int ), (int)180);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
lbl118:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)hk.cyvr("czuq", cyvo(int ), (int)181);
                if (!var3_1) ** GOTO lbl97
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)hk.cyvr("czur", cyvo(int ), (int)182);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)hk.cyvr("czus", cyvo(int ), (int)183);
        ** while (!var3_1)
lbl129:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hk() {
        var2_1 /* !! */  = hk.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("Criticals", "\u0411\u044c\u0435\u0442 \u043a\u0440\u0438\u0442\u0430\u043c\u0438 \u043f\u043e\u0434 \u044d\u0444\u0444\u0435\u043a\u0442 \u043f\u043b\u0430\u0432\u043d\u043e\u0433\u043e \u043f\u0430\u0434\u0435\u043d\u0438\u044f / \u0432 \u043f\u0430\u0443\u0442\u0438\u043d\u0435", du.RAGE);
                this.criticalModes = new ke("\u041a\u0440\u0438\u0442\u043e\u0432\u0430\u0442\u044c", "\u0413\u0434\u0435 Criticals \u0431\u0443\u0434\u0435\u0442 \u0440\u0430\u0431\u043e\u0442\u0430\u0442\u044c").value(new String[]{"\u0412 \u043f\u0430\u0443\u0442\u0438\u043d\u0435", "\u041f\u043e\u0434 \u043f\u043b\u0430\u0432\u043a\u043e\u0439"}).selected(new String[]{"\u0412 \u043f\u0430\u0443\u0442\u0438\u043d\u0435", "\u041f\u043e\u0434 \u043f\u043b\u0430\u0432\u043a\u043e\u0439"});
                this.settings(new jx[]{this.criticalModes});
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)hk.cyvr("cyvs", cyvo(int ), (int)0);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)hk.cyvr("cyvt", cyvo(int ), (int)1);
                break;
            }
            case 2: {
                var2_1 /* !! */  = (int)hk.cyvr("cyvu", cyvo(int ), (int)2);
                ** GOTO lbl9
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hk.cyvr("cyvv", cyvo(int ), (int)3);
                    break;
                }
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)hk.cyvr("cyvw", cyvo(int ), (int)4);
        ** while (true)
    }

    private static /* synthetic */ void czxl() {
        hk.cyvq[200] = -1753425355;
        hk.cyvq[201] = 361524356;
        hk.cyvq[202] = -536913862;
        hk.cyvq[203] = 1986408838;
        hk.cyvq[204] = -2076453142;
        hk.cyvq[205] = -1174196472;
        hk.cyvq[206] = 2013555223;
        hk.cyvq[207] = -516257457;
        hk.cyvq[208] = 2026690758;
        hk.cyvq[209] = -1493603628;
        hk.cyvq[210] = -446777893;
        hk.cyvq[211] = -619971336;
        hk.cyvq[212] = -1700090436;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean isSlowFallingModeEnabled() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = gu - hk.cyvr("czdd", cyvx(int ), (int)78)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == hk.cyvr("czde", cyvo(int ), (int)112)) break;
            object = hk.cyvr("czdf", cyvo(int ), (int)113);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = gu - hk.cyvr("czdg", cyvx(int ), (int)79)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == hk.cyvr("czdh", cyvo(int ), (int)114)) break;
            object = hk.cyvr("czdi", cyvo(int ), (int)115);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = gu - hk.cyvr("czdj", cyvx(int ), (int)80)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == hk.cyvr("czdk", cyvo(int ), (int)116)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = hk.cyvr("czdl", cyvo(int ), (int)117);
        }
        if (bl2) return (boolean)hk.cyvr("czdm", cyvo(int ), (int)118);
        if (bl2) return (boolean)hk.cyvr("czdm", cyvo(int ), (int)118);
        while (true) {
            long l5;
            Object object;
            if ((object = (l5 = gu - hk.cyvr("czdn", cyvx(int ), (int)81)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object == hk.cyvr("czdo", cyvo(int ), (int)119)) break;
            object = hk.cyvr("czdp", cyvo(int ), (int)120);
        }
        while (true) {
            long l6;
            Object object;
            if ((object = (l6 = gu - hk.cyvr("czdq", cyvx(int ), (int)82)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
            if (object == hk.cyvr("czdr", cyvo(int ), (int)121)) {
                return this.criticalModes.isSelected("\u041f\u043e\u0434 \u043f\u043b\u0430\u0432\u043a\u043e\u0439");
            }
            object = hk.cyvr("czds", cyvo(int ), (int)122);
        }
    }

    public static /* synthetic */ CallSite cyvr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void czxj() {
        hk.cyvq[0] = -1994252796;
        hk.cyvq[1] = -452588548;
        hk.cyvq[2] = 1922438876;
        hk.cyvq[3] = -669154798;
        hk.cyvq[4] = 928785099;
        hk.cyvq[5] = 1201502122;
        hk.cyvq[6] = 127726180;
        hk.cyvq[7] = 261955617;
        hk.cyvq[8] = 1615492593;
        hk.cyvq[9] = 1057082834;
        hk.cyvq[10] = -285944515;
        hk.cyvq[11] = 577757073;
        hk.cyvq[12] = -2065108344;
        hk.cyvq[13] = -1378655303;
        hk.cyvq[14] = -170521228;
        hk.cyvq[15] = -1056335587;
        hk.cyvq[16] = -1255397614;
        hk.cyvq[17] = 1863457093;
        hk.cyvq[18] = 1351882249;
        hk.cyvq[19] = -1706283478;
        hk.cyvq[20] = -754654426;
        hk.cyvq[21] = 1845438523;
        hk.cyvq[22] = -543834478;
        hk.cyvq[23] = -1482757291;
        hk.cyvq[24] = 1344902999;
        hk.cyvq[25] = 215562821;
        hk.cyvq[26] = 1653910708;
        hk.cyvq[27] = -1366728259;
        hk.cyvq[28] = -1784693434;
        hk.cyvq[29] = 1981719110;
        hk.cyvq[30] = 1556498634;
        hk.cyvq[31] = -1621464884;
        hk.cyvq[32] = 1033571655;
        hk.cyvq[33] = -967334984;
        hk.cyvq[34] = 1884771374;
        hk.cyvq[35] = -574163309;
        hk.cyvq[36] = -1750107216;
        hk.cyvq[37] = 240497495;
        hk.cyvq[38] = 728908462;
        hk.cyvq[39] = 399243863;
        hk.cyvq[40] = 605106286;
        hk.cyvq[41] = 25752106;
        hk.cyvq[42] = 525177238;
        hk.cyvq[43] = -2000094733;
        hk.cyvq[44] = 1498648061;
        hk.cyvq[45] = 1008477641;
        hk.cyvq[46] = -1266230679;
        hk.cyvq[47] = -1874253509;
        hk.cyvq[48] = 1463738756;
        hk.cyvq[49] = 1528338905;
        hk.cyvq[50] = -746839173;
        hk.cyvq[51] = -1232599796;
        hk.cyvq[52] = 1452132365;
        hk.cyvq[53] = 1057206113;
        hk.cyvq[54] = -1811416232;
        hk.cyvq[55] = 1096021888;
        hk.cyvq[56] = 1218379297;
        hk.cyvq[57] = -461083870;
        hk.cyvq[58] = -824213447;
        hk.cyvq[59] = -1274473962;
        hk.cyvq[60] = -1393578904;
        hk.cyvq[61] = 2053400219;
        hk.cyvq[62] = -2060427374;
        hk.cyvq[63] = -348538983;
        hk.cyvq[64] = -52428564;
        hk.cyvq[65] = -1277585286;
        hk.cyvq[66] = -1760336010;
        hk.cyvq[67] = 2051431350;
        hk.cyvq[68] = -807487201;
        hk.cyvq[69] = 12562511;
        hk.cyvq[70] = -565425607;
        hk.cyvq[71] = -335992882;
        hk.cyvq[72] = -13318110;
        hk.cyvq[73] = 23001474;
        hk.cyvq[74] = -87066538;
        hk.cyvq[75] = 1925839239;
        hk.cyvq[76] = 45167763;
        hk.cyvq[77] = -71680689;
        hk.cyvq[78] = 464471650;
        hk.cyvq[79] = 676727501;
        hk.cyvq[80] = -53457107;
        hk.cyvq[81] = -1241624882;
        hk.cyvq[82] = -152784622;
        hk.cyvq[83] = 1259042908;
        hk.cyvq[84] = 2071688493;
        hk.cyvq[85] = 460409424;
        hk.cyvq[86] = 2121373537;
        hk.cyvq[87] = 1856442176;
        hk.cyvq[88] = 1364929934;
        hk.cyvq[89] = 742014560;
        hk.cyvq[90] = -654143454;
        hk.cyvq[91] = -1497917866;
        hk.cyvq[92] = 1321561290;
        hk.cyvq[93] = -714186607;
        hk.cyvq[94] = -1816725649;
        hk.cyvq[95] = -1256271684;
        hk.cyvq[96] = 806455793;
        hk.cyvq[97] = 76741594;
        hk.cyvq[98] = 2041261119;
        hk.cyvq[99] = -703494055;
    }

    static {
        cyvp = new int[213];
        cyvq = new int[213];
        hk.czxg();
        hk.czxh();
        hk.czxi();
        hk.czxj();
        hk.czxk();
        hk.czxl();
        cyvy = new long[143];
        cyvz = new long[143];
        hk.czxm();
        hk.czxn();
        hk.czxo();
        hk.czxp();
    }

    private static /* synthetic */ void czxm() {
        hk.cyvy[0] = -3183892623849554203L;
        hk.cyvy[1] = -6105647833396455517L;
        hk.cyvy[2] = -2811502709681607821L;
        hk.cyvy[3] = 1696664890033432758L;
        hk.cyvy[4] = -4429725403777020851L;
        hk.cyvy[5] = 2329080145467059472L;
        hk.cyvy[6] = -7600019785506239047L;
        hk.cyvy[7] = -4709459411827676427L;
        hk.cyvy[8] = -7363464682247731923L;
        hk.cyvy[9] = 7982355465854901666L;
        hk.cyvy[10] = -8746059974398838885L;
        hk.cyvy[11] = 2569759496892199438L;
        hk.cyvy[12] = 437677061584667914L;
        hk.cyvy[13] = 2155316815107221384L;
        hk.cyvy[14] = 8047514737087288100L;
        hk.cyvy[15] = 6510220095841392435L;
        hk.cyvy[16] = 3835593094371845904L;
        hk.cyvy[17] = -5644253443164270815L;
        hk.cyvy[18] = 1158219999573528315L;
        hk.cyvy[19] = -8786127374567378594L;
        hk.cyvy[20] = 3987382462031417709L;
        hk.cyvy[21] = -646336295327637546L;
        hk.cyvy[22] = 4899538657894517670L;
        hk.cyvy[23] = 8226868756096625782L;
        hk.cyvy[24] = -1083175254483318926L;
        hk.cyvy[25] = 4021717444013353843L;
        hk.cyvy[26] = -2899876476046110092L;
        hk.cyvy[27] = -6212040348714766225L;
        hk.cyvy[28] = 4696735825246102648L;
        hk.cyvy[29] = 7649301678646432584L;
        hk.cyvy[30] = -4404202893917236231L;
        hk.cyvy[31] = -4577091342814268436L;
        hk.cyvy[32] = -4714562352727042172L;
        hk.cyvy[33] = -3558709786919388749L;
        hk.cyvy[34] = -2941907375727658393L;
        hk.cyvy[35] = 3809489279751946150L;
        hk.cyvy[36] = 1142547252014752473L;
        hk.cyvy[37] = -3173278040368225562L;
        hk.cyvy[38] = 3957569056062771476L;
        hk.cyvy[39] = 4229783436658948520L;
        hk.cyvy[40] = 2884944239765450423L;
        hk.cyvy[41] = -557063197589118034L;
        hk.cyvy[42] = -1082058931126258808L;
        hk.cyvy[43] = -196027960353166639L;
        hk.cyvy[44] = -6390060107925965659L;
        hk.cyvy[45] = 6253783017552885944L;
        hk.cyvy[46] = 5964868718843463037L;
        hk.cyvy[47] = 5066406516685090314L;
        hk.cyvy[48] = -228368303354707085L;
        hk.cyvy[49] = 1356205980446494424L;
        hk.cyvy[50] = 6904423594880895393L;
        hk.cyvy[51] = -3665116366609305302L;
        hk.cyvy[52] = -1617525371170683525L;
        hk.cyvy[53] = 1238608687943585910L;
        hk.cyvy[54] = 1847191419365136086L;
        hk.cyvy[55] = -4844847128064850496L;
        hk.cyvy[56] = -6890211571064059928L;
        hk.cyvy[57] = -5703832650797800472L;
        hk.cyvy[58] = -4166759765736745301L;
        hk.cyvy[59] = -6589161179571359077L;
        hk.cyvy[60] = -227260265010889450L;
        hk.cyvy[61] = -8768069069766210482L;
        hk.cyvy[62] = 373114121862697310L;
        hk.cyvy[63] = 5466711388850929274L;
        hk.cyvy[64] = -5167049343450454505L;
        hk.cyvy[65] = -200263960398243640L;
        hk.cyvy[66] = 336084553754529246L;
        hk.cyvy[67] = -285996708946153680L;
        hk.cyvy[68] = -3829829047551173303L;
        hk.cyvy[69] = 7168284043171285988L;
        hk.cyvy[70] = -7140506155102427488L;
        hk.cyvy[71] = 3209933386459715832L;
        hk.cyvy[72] = -4516367044690048603L;
        hk.cyvy[73] = -5480108102020300714L;
        hk.cyvy[74] = 468470553797524513L;
        hk.cyvy[75] = 4902954934587696893L;
        hk.cyvy[76] = -6068703627367476274L;
        hk.cyvy[77] = 4120382916200282190L;
        hk.cyvy[78] = 2945119401968466342L;
        hk.cyvy[79] = 192884817771626862L;
        hk.cyvy[80] = 698978492956467772L;
        hk.cyvy[81] = -8754378957166123496L;
        hk.cyvy[82] = -2595050851981786187L;
        hk.cyvy[83] = -4659228526237531749L;
        hk.cyvy[84] = 3893004930525337324L;
        hk.cyvy[85] = -6344189522973867891L;
        hk.cyvy[86] = 3229655233760496763L;
        hk.cyvy[87] = 7655681926893265553L;
        hk.cyvy[88] = 4357278759993571408L;
        hk.cyvy[89] = 7704881838242357297L;
        hk.cyvy[90] = -6419324920211388631L;
        hk.cyvy[91] = 7260605788800770915L;
        hk.cyvy[92] = -3268195472986439194L;
        hk.cyvy[93] = -2097307983397991459L;
        hk.cyvy[94] = -3390980168480611173L;
        hk.cyvy[95] = 1767451971718599262L;
        hk.cyvy[96] = -1198348485960452139L;
        hk.cyvy[97] = 5258913957182384041L;
        hk.cyvy[98] = 5115432402291079354L;
        hk.cyvy[99] = -6257613790086971130L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSlowFallingCriticalWindow() {
        block60: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hk.gu - hk.cyvr("czut", cyvx(int ), (int)110)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hk.cyvr("czuu", cyvo(int ), (int)184)) break;
                v0 /* !! */  = (long)hk.cyvr("czuv", cyvo(int ), (int)185);
            }
            var3_1 = hk.c;
            v1 /* !! */  = hk.gu;
            if (true) ** GOTO lbl11
            block38: while (true) {
                v1 /* !! */  = (long)(v2 - hk.cyvr("czuw", cyvx(int ), (int)111));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -521097529: {
                        v2 = hk.cyvr("czux", cyvx(int ), (int)112);
                        continue block38;
                    }
                    case -292020896: {
                        v2 = hk.cyvr("czuy", cyvx(int ), (int)113);
                        continue block38;
                    }
                    case 55932903: {
                        v2 = hk.cyvr("czuz", cyvx(int ), (int)114);
                        continue block38;
                    }
                    case 938543786: {
                        break block38;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hk.b;
            v3 /* !! */  = hk.gu;
            if (true) ** GOTO lbl28
            block39: while (true) {
                v3 /* !! */  = (long)(v4 - hk.cyvr("czvb", cyvx(int ), (int)115));
lbl28:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -400218998: {
                        v4 = hk.cyvr("czvc", cyvx(int ), (int)116);
                        continue block39;
                    }
                    case 938543786: {
                        break block39;
                    }
                    case 1859165758: {
                        v4 = hk.cyvr("czvd", cyvx(int ), (int)117);
                        continue block39;
                    }
                }
                break;
            }
            var1_3 = hk.a;
            if (var3_1) {
                throw null;
lbl40:
                // 6 sources

                return (boolean)hk.cyvr("czve", cyvo(int ), (int)186);
            }
            if (var1_3 || var1_3) ** GOTO lbl40
            v5 /* !! */  = hk.gu;
            if (true) ** GOTO lbl47
            block41: while (true) {
                v5 /* !! */  = (long)(v6 - hk.cyvr("czvf", cyvx(int ), (int)118));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1565788730: {
                        v6 = hk.cyvr("czvg", cyvx(int ), (int)119);
                        continue block41;
                    }
                    case -739200153: {
                        v6 = hk.cyvr("czvh", cyvx(int ), (int)120);
                        continue block41;
                    }
                    case 938543786: {
                        break block41;
                    }
                    case 1725624460: {
                        v6 = hk.cyvr("czvi", cyvx(int ), (int)121);
                        continue block41;
                    }
                }
                break;
            }
            if (!this.isSlowFallingModeActive()) break block60;
            if (var1_3) ** GOTO lbl40
            v7 /* !! */  = hk.gu;
            if (true) ** GOTO lbl65
            block42: while (true) {
                v7 /* !! */  = (long)(hk.cyvr("czvk", cyvx(int ), (int)123) - hk.cyvr("czvj", cyvx(int ), (int)122));
lbl65:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case 938543786: {
                        break block42;
                    }
                    case 1549251992: {
                        continue block42;
                    }
                }
                break;
            }
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = hk.gu - hk.cyvr("czvl", cyvx(int ), (int)124)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == hk.cyvr("czvm", cyvo(int ), (int)187)) break;
                v8 /* !! */  = (long)hk.cyvr("czvn", cyvo(int ), (int)188);
            }
            v9 = hk.mc.field_1724;
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_2 = hk.gu - hk.cyvr("czvo", cyvx(int ), (int)125)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == hk.cyvr("czvp", cyvo(int ), (int)189)) break;
                v10 /* !! */  = (long)hk.cyvr("czvq", cyvo(int ), (int)190);
            }
            v11 = v9.method_18798();
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_3 = hk.gu - hk.cyvr("czvr", cyvx(int ), (int)126)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == hk.cyvr("czvs", cyvo(int ), (int)191)) break;
                v12 /* !! */  = (long)hk.cyvr("czvu", cyvo(int ), (int)192);
            }
            if (!(v11.field_1351 < 0.0)) break block60;
            if (var1_3) ** GOTO lbl40
            while (true) {
                if ((v13 /* !! */  = (cfr_temp_4 = hk.gu - hk.cyvr("czvv", cyvx(int ), (int)127)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v13 /* !! */  == hk.cyvr("czvw", cyvo(int ), (int)193)) break;
                v13 /* !! */  = (long)hk.cyvr("czvx", cyvo(int ), (int)194);
            }
            while (true) {
                if ((v14 /* !! */  = (cfr_temp_5 = hk.gu - hk.cyvr("czvy", cyvx(int ), (int)128)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v14 /* !! */  == hk.cyvr("czvz", cyvo(int ), (int)195)) break;
                v14 /* !! */  = (long)hk.cyvr("czwa", cyvo(int ), (int)196);
            }
            v15 = hk.mc.field_1724;
            v16 /* !! */  = hk.gu;
            if (true) ** GOTO lbl104
            block48: while (true) {
                v16 /* !! */  = (long)(hk.cyvr("czwc", cyvx(int ), (int)130) - hk.cyvr("czwb", cyvx(int ), (int)129));
lbl104:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -849327801: {
                        continue block48;
                    }
                    case 938543786: {
                        break block48;
                    }
                }
                break;
            }
            if (!(v15.field_6017 > 0.0)) break block60;
            if (var1_3) ** GOTO lbl40
            v17 = hk.cyvr("czwe", cyvo(int ), (int)197);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl123
        }
        if (var1_3) ** GOTO lbl40
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v17 = hk.cyvr("czwf", cyvo(int ), (int)198);
lbl123:
                // 2 sources

                return (boolean)v17;
            }
lbl124:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hk.cyvr("czwg", cyvo(int ), (int)199);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hk.cyvr("czwh", cyvo(int ), (int)200);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hk.cyvr("czwi", cyvo(int ), (int)201);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl153
            }
            case 3: {
                var2_2 /* !! */  = (int)hk.cyvr("czwj", cyvo(int ), (int)202);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)hk.cyvr("czwk", cyvo(int ), (int)203);
                } while (!var3_1);
                throw null;
            }
lbl148:
            // 3 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hk.cyvr("czwl", cyvo(int ), (int)204);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl153:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hk.cyvr("czwm", cyvo(int ), (int)205);
                if (!var3_1) ** GOTO lbl148
                throw null;
            }
lbl157:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hk.cyvr("czwn", cyvo(int ), (int)206);
                if (!var3_1) ** GOTO lbl124
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)hk.cyvr("czwo", cyvo(int ), (int)207);
                if (!var3_1) ** GOTO lbl157
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)hk.cyvr("czwp", cyvo(int ), (int)208);
        ** while (!var3_1)
lbl168:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long cyvx(int n2) {
        return cyvy[n2] ^ cyvz[n2];
    }

    private static /* synthetic */ void czxo() {
        hk.cyvz[0] = -8305580536614747880L;
        hk.cyvz[1] = -8969421812759733419L;
        hk.cyvz[2] = -8102334709146523849L;
        hk.cyvz[3] = -4700112941410345103L;
        hk.cyvz[4] = 5255583852675123524L;
        hk.cyvz[5] = 7093934826719467693L;
        hk.cyvz[6] = 4340464768780704584L;
        hk.cyvz[7] = -6077925541201785919L;
        hk.cyvz[8] = -7848712043904669660L;
        hk.cyvz[9] = 4029230047935207699L;
        hk.cyvz[10] = -2279516961638995490L;
        hk.cyvz[11] = 6022860282177207622L;
        hk.cyvz[12] = -9222358031112136303L;
        hk.cyvz[13] = -3300974535272582511L;
        hk.cyvz[14] = -6983401467856963024L;
        hk.cyvz[15] = -3528409957355839111L;
        hk.cyvz[16] = -9025167178831239027L;
        hk.cyvz[17] = -4847408015494129112L;
        hk.cyvz[18] = -3388615539787925308L;
        hk.cyvz[19] = -8023898487107317536L;
        hk.cyvz[20] = -5688945399119937169L;
        hk.cyvz[21] = 2252503249106715437L;
        hk.cyvz[22] = 8359354102420096833L;
        hk.cyvz[23] = 7090923668249774542L;
        hk.cyvz[24] = 3834136648113452218L;
        hk.cyvz[25] = 2245868865887122912L;
        hk.cyvz[26] = -6801218756764913058L;
        hk.cyvz[27] = -6540592000243986634L;
        hk.cyvz[28] = 7354501633847158457L;
        hk.cyvz[29] = 7701374063943620274L;
        hk.cyvz[30] = 7914724501339962937L;
        hk.cyvz[31] = -8222844682551930913L;
        hk.cyvz[32] = 8912282435313341950L;
        hk.cyvz[33] = -2856709346728404110L;
        hk.cyvz[34] = 4481048255292099428L;
        hk.cyvz[35] = 7602160816752309044L;
        hk.cyvz[36] = -4469088157223507095L;
        hk.cyvz[37] = 7766824258716446794L;
        hk.cyvz[38] = 881525979271164467L;
        hk.cyvz[39] = 651308211343773390L;
        hk.cyvz[40] = -717870902250575795L;
        hk.cyvz[41] = 4533167151078429451L;
        hk.cyvz[42] = -8558338926627212378L;
        hk.cyvz[43] = -5450428133811816342L;
        hk.cyvz[44] = -8985180323782048806L;
        hk.cyvz[45] = 6474766276858247256L;
        hk.cyvz[46] = -5613982151784485469L;
        hk.cyvz[47] = -9020408755409501377L;
        hk.cyvz[48] = 1947443315448370226L;
        hk.cyvz[49] = 2425122750523165492L;
        hk.cyvz[50] = -4023248613757458776L;
        hk.cyvz[51] = -2837915138287710238L;
        hk.cyvz[52] = -9026060181631976902L;
        hk.cyvz[53] = 4026194639850594118L;
        hk.cyvz[54] = 1330089487063065880L;
        hk.cyvz[55] = -8451579154178017920L;
        hk.cyvz[56] = -5803282789630567100L;
        hk.cyvz[57] = -7615187043245306168L;
        hk.cyvz[58] = 1630698693843627242L;
        hk.cyvz[59] = -907464325844111734L;
        hk.cyvz[60] = 1865021098943414564L;
        hk.cyvz[61] = -6097903681897823738L;
        hk.cyvz[62] = -8832265110642481488L;
        hk.cyvz[63] = -4408565261736079922L;
        hk.cyvz[64] = -3491676029635460037L;
        hk.cyvz[65] = 3743823278005947500L;
        hk.cyvz[66] = -5820912163379496719L;
        hk.cyvz[67] = 1137752074284468605L;
        hk.cyvz[68] = -3413540766041975126L;
        hk.cyvz[69] = -3739554948932921967L;
        hk.cyvz[70] = 7427486710189285891L;
        hk.cyvz[71] = -6254825596963353251L;
        hk.cyvz[72] = 2802172380400477979L;
        hk.cyvz[73] = -4022082123688030165L;
        hk.cyvz[74] = 567093207401251401L;
        hk.cyvz[75] = 2355390418710831089L;
        hk.cyvz[76] = 4200971945179728018L;
        hk.cyvz[77] = 7356020326180887695L;
        hk.cyvz[78] = -3967904877215779226L;
        hk.cyvz[79] = 8461068816324869959L;
        hk.cyvz[80] = -4536857924761798755L;
        hk.cyvz[81] = -31324055679846207L;
        hk.cyvz[82] = 8885376319189892871L;
        hk.cyvz[83] = -5753820433974916765L;
        hk.cyvz[84] = 1383945361493335910L;
        hk.cyvz[85] = 5095938995901624241L;
        hk.cyvz[86] = -1709117886374510069L;
        hk.cyvz[87] = 2759636058409079167L;
        hk.cyvz[88] = 4264250699437313404L;
        hk.cyvz[89] = -4135981885949204445L;
        hk.cyvz[90] = 6666853298889348570L;
        hk.cyvz[91] = 552484685114844891L;
        hk.cyvz[92] = 1151207826084528542L;
        hk.cyvz[93] = 2287479560972879476L;
        hk.cyvz[94] = -7356737220237209785L;
        hk.cyvz[95] = -270500008104880931L;
        hk.cyvz[96] = 8700929117177714368L;
        hk.cyvz[97] = 5387227449349187158L;
        hk.cyvz[98] = 7012083243186573987L;
        hk.cyvz[99] = 8654764190081462853L;
    }

    private static /* synthetic */ void czxn() {
        hk.cyvy[100] = -8600576189389656947L;
        hk.cyvy[101] = -1124464776614254573L;
        hk.cyvy[102] = 5104954378834802355L;
        hk.cyvy[103] = -335048142737396327L;
        hk.cyvy[104] = -5533015188232785832L;
        hk.cyvy[105] = 3997947260676897840L;
        hk.cyvy[106] = 7422876671851558795L;
        hk.cyvy[107] = -3650934243437149906L;
        hk.cyvy[108] = 70553502103612034L;
        hk.cyvy[109] = -5978878101608692701L;
        hk.cyvy[110] = -4664307440410861266L;
        hk.cyvy[111] = 1499674941637651949L;
        hk.cyvy[112] = 5612983217865603938L;
        hk.cyvy[113] = -6317650808476649184L;
        hk.cyvy[114] = 8279290357312769461L;
        hk.cyvy[115] = -149411132435403774L;
        hk.cyvy[116] = 1928935347361093358L;
        hk.cyvy[117] = -7464908569421518974L;
        hk.cyvy[118] = -2061789211013642646L;
        hk.cyvy[119] = -1919261314362855266L;
        hk.cyvy[120] = 4057865246518797141L;
        hk.cyvy[121] = -7755855747550921372L;
        hk.cyvy[122] = -4309980360902163848L;
        hk.cyvy[123] = -6475534663502133644L;
        hk.cyvy[124] = -7677488750660921519L;
        hk.cyvy[125] = -900372487224583462L;
        hk.cyvy[126] = -5416518267374698948L;
        hk.cyvy[127] = 1068968809653584319L;
        hk.cyvy[128] = -2055439716006639376L;
        hk.cyvy[129] = 793663803822840159L;
        hk.cyvy[130] = -3215126127796810749L;
        hk.cyvy[131] = -8205519002704935735L;
        hk.cyvy[132] = -7152650192175858757L;
        hk.cyvy[133] = -4635616710719343360L;
        hk.cyvy[134] = -2129880600736747781L;
        hk.cyvy[135] = 414969911804373191L;
        hk.cyvy[136] = -3084805918424744739L;
        hk.cyvy[137] = -2465225238580446282L;
        hk.cyvy[138] = 5420662841677695665L;
        hk.cyvy[139] = -654885309444659299L;
        hk.cyvy[140] = 8035258805745733337L;
        hk.cyvy[141] = -3809176563449392697L;
        hk.cyvy[142] = 2047568623447595885L;
    }

    private static /* synthetic */ void czxi() {
        hk.cyvp[200] = -1753425347;
        hk.cyvp[201] = 361524355;
        hk.cyvp[202] = -536913862;
        hk.cyvp[203] = 1986408839;
        hk.cyvp[204] = -2076453142;
        hk.cyvp[205] = -1174196466;
        hk.cyvp[206] = 2013555223;
        hk.cyvp[207] = -516257459;
        hk.cyvp[208] = 2026690757;
        hk.cyvp[209] = -1493603625;
        hk.cyvp[210] = -446777896;
        hk.cyvp[211] = -619971334;
        hk.cyvp[212] = -1700090434;
    }

    private static /* synthetic */ void czxg() {
        hk.cyvp[0] = -1994252800;
        hk.cyvp[1] = -452588547;
        hk.cyvp[2] = 1922438872;
        hk.cyvp[3] = -669154798;
        hk.cyvp[4] = 928785097;
        hk.cyvp[5] = 1201502123;
        hk.cyvp[6] = 1837007143;
        hk.cyvp[7] = 261955617;
        hk.cyvp[8] = -1615492594;
        hk.cyvp[9] = -131624458;
        hk.cyvp[10] = -285944516;
        hk.cyvp[11] = -1435810216;
        hk.cyvp[12] = -2065108343;
        hk.cyvp[13] = 1051116667;
        hk.cyvp[14] = -170521228;
        hk.cyvp[15] = 1056335586;
        hk.cyvp[16] = 452518099;
        hk.cyvp[17] = 1863457092;
        hk.cyvp[18] = 987372646;
        hk.cyvp[19] = 1706283477;
        hk.cyvp[20] = -790409897;
        hk.cyvp[21] = -1845438524;
        hk.cyvp[22] = -1276794836;
        hk.cyvp[23] = -1482757292;
        hk.cyvp[24] = 859178691;
        hk.cyvp[25] = -215562822;
        hk.cyvp[26] = -1745247120;
        hk.cyvp[27] = 1366728258;
        hk.cyvp[28] = 688251956;
        hk.cyvp[29] = -1981719111;
        hk.cyvp[30] = 97307957;
        hk.cyvp[31] = 1621464883;
        hk.cyvp[32] = 2013932593;
        hk.cyvp[33] = 967334983;
        hk.cyvp[34] = -979705610;
        hk.cyvp[35] = 574163308;
        hk.cyvp[36] = 1769547179;
        hk.cyvp[37] = -240497496;
        hk.cyvp[38] = -1341362039;
        hk.cyvp[39] = -399243864;
        hk.cyvp[40] = 679818137;
        hk.cyvp[41] = -25752107;
        hk.cyvp[42] = -1397197051;
        hk.cyvp[43] = 2000094732;
        hk.cyvp[44] = -1179743962;
        hk.cyvp[45] = -1008477642;
        hk.cyvp[46] = -1911184665;
        hk.cyvp[47] = -1874253510;
        hk.cyvp[48] = 1463738756;
        hk.cyvp[49] = 1528338899;
        hk.cyvp[50] = -746839181;
        hk.cyvp[51] = -1232599807;
        hk.cyvp[52] = 1452132365;
        hk.cyvp[53] = 1057206113;
        hk.cyvp[54] = -1811416241;
        hk.cyvp[55] = 1096021900;
        hk.cyvp[56] = 1218379310;
        hk.cyvp[57] = -461083860;
        hk.cyvp[58] = -824213471;
        hk.cyvp[59] = -1274473959;
        hk.cyvp[60] = -1393578887;
        hk.cyvp[61] = 2053400202;
        hk.cyvp[62] = -2060427361;
        hk.cyvp[63] = -348538979;
        hk.cyvp[64] = -52428567;
        hk.cyvp[65] = -1277585294;
        hk.cyvp[66] = -1760336010;
        hk.cyvp[67] = 2051431358;
        hk.cyvp[68] = -807487226;
        hk.cyvp[69] = 12562504;
        hk.cyvp[70] = -565425615;
        hk.cyvp[71] = -335992892;
        hk.cyvp[72] = -13318110;
        hk.cyvp[73] = 23001479;
        hk.cyvp[74] = -87066544;
        hk.cyvp[75] = -1925839240;
        hk.cyvp[76] = 1555203405;
        hk.cyvp[77] = 71680688;
        hk.cyvp[78] = -865194471;
        hk.cyvp[79] = 676727501;
        hk.cyvp[80] = -53457108;
        hk.cyvp[81] = 1630545339;
        hk.cyvp[82] = -152784621;
        hk.cyvp[83] = 1568532171;
        hk.cyvp[84] = -2071688494;
        hk.cyvp[85] = 1721169378;
        hk.cyvp[86] = -2121373538;
        hk.cyvp[87] = 1706327283;
        hk.cyvp[88] = 1364929935;
        hk.cyvp[89] = 742014560;
        hk.cyvp[90] = -654143450;
        hk.cyvp[91] = -1497917865;
        hk.cyvp[92] = 1321561293;
        hk.cyvp[93] = -714186601;
        hk.cyvp[94] = -1816725656;
        hk.cyvp[95] = -1256271681;
        hk.cyvp[96] = 806455792;
        hk.cyvp[97] = 76741599;
        hk.cyvp[98] = 2041261113;
        hk.cyvp[99] = 703494054;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean isSlowFallingModeActive() {
        CallSite callSite;
        boolean bl2;
        block22: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = gu - hk.cyvr("czqn", cyvx(int ), (int)91)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == hk.cyvr("czqp", cyvo(int ), (int)143)) break;
                object = hk.cyvr("czqs", cyvo(int ), (int)144);
            }
            boolean bl3 = c;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = gu - hk.cyvr("czqu", cyvx(int ), (int)92)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object == hk.cyvr("czqv", cyvo(int ), (int)145)) break;
                object = hk.cyvr("czqw", cyvo(int ), (int)146);
            }
            int n2 = b;
            while (true) {
                long l4;
                Object object;
                if ((object = (l4 = gu - hk.cyvr("czqz", cyvx(int ), (int)93)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object == hk.cyvr("czrb", cyvo(int ), (int)147)) {
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    break;
                }
                object = hk.cyvr("czrd", cyvo(int ), (int)148);
            }
            if (bl2 || bl2) return (boolean)hk.cyvr("czre", cyvo(int ), (int)149);
            while (true) {
                long l5;
                Object object;
                if ((object = (l5 = gu - hk.cyvr("czrg", cyvx(int ), (int)94)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object == hk.cyvr("czri", cyvo(int ), (int)150)) {
                    if (this.isSlowFallingModeEnabled()) {
                        break;
                    }
                    break block22;
                }
                object = hk.cyvr("czrj", cyvo(int ), (int)151);
            }
            if (bl2) return (boolean)hk.cyvr("czre", cyvo(int ), (int)149);
            Object object = gu;
            boolean bl4 = true;
            block10: while (true) {
                CallSite callSite2;
                if (!bl4 || (bl4 = false) || !true) {
                    object = callSite2 - hk.cyvr("czrl", cyvx(int ), (int)95);
                }
                switch ((int)object) {
                    case 70154233: {
                        callSite2 = hk.cyvr("czrq", cyvx(int ), (int)96);
                        continue block10;
                    }
                    case 132411381: {
                        callSite2 = hk.cyvr("czrr", cyvx(int ), (int)97);
                        continue block10;
                    }
                    case 938543786: {
                        break block10;
                    }
                    case 1601497598: {
                        callSite2 = hk.cyvr("czrt", cyvx(int ), (int)98);
                        continue block10;
                    }
                }
                break;
            }
            if (this.hasSlowFalling()) {
                if (bl2) return (boolean)hk.cyvr("czre", cyvo(int ), (int)149);
                callSite = hk.cyvr("czru", cyvo(int ), (int)152);
                if (!bl3) return (boolean)callSite;
                throw null;
            }
        }
        if (bl2 || bl2) {
            return (boolean)hk.cyvr("czre", cyvo(int ), (int)149);
        }
        callSite = hk.cyvr("czrv", cyvo(int ), (int)153);
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isWebModeEnabled() {
        v0 /* !! */  = hk.gu;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(hk.cyvr("czcl", cyvx(int ), (int)73) - hk.cyvr("czck", cyvx(int ), (int)72));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 938543786: {
                    break block10;
                }
                case 1394585061: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = hk.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = hk.gu - hk.cyvr("czcm", cyvx(int ), (int)74)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hk.cyvr("czcn", cyvo(int ), (int)99)) break;
            v1 /* !! */  = (long)hk.cyvr("czco", cyvo(int ), (int)100);
        }
        var2_2 /* !! */  = hk.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hk.gu - hk.cyvr("czcp", cyvx(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hk.cyvr("czcq", cyvo(int ), (int)101)) break;
            v2 /* !! */  = (long)hk.cyvr("czcr", cyvo(int ), (int)102);
        }
        var1_3 = hk.a;
        if (var3_1) {
            throw null;
            return (boolean)hk.cyvr("czcs", cyvo(int ), (int)103);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hk.gu - hk.cyvr("czct", cyvx(int ), (int)76)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hk.cyvr("czcu", cyvo(int ), (int)104)) break;
                    v3 /* !! */  = (long)hk.cyvr("czcv", cyvo(int ), (int)105);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = hk.gu - hk.cyvr("czcw", cyvx(int ), (int)77)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hk.cyvr("czcx", cyvo(int ), (int)106)) break;
                    v4 /* !! */  = (long)hk.cyvr("czcy", cyvo(int ), (int)107);
                }
                return this.criticalModes.isSelected("\u0412 \u043f\u0430\u0443\u0442\u0438\u043d\u0435");
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hk.cyvr("czcz", cyvo(int ), (int)108);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hk.cyvr("czda", cyvo(int ), (int)109);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hk.cyvr("czdb", cyvo(int ), (int)110);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hk.cyvr("czdc", cyvo(int ), (int)111);
        ** while (!var3_1)
lbl63:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isWebModeActive() {
        block39: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = hk.gu - hk.cyvr("czoo", cyvx(int ), (int)83)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == hk.cyvr("czop", cyvo(int ), (int)127)) break;
                v0 /* !! */  = (long)hk.cyvr("czoq", cyvo(int ), (int)128);
            }
            var3_1 = hk.c;
            v1 /* !! */  = hk.gu;
            if (true) ** GOTO lbl12
            block24: while (true) {
                v1 /* !! */  = (long)(hk.cyvr("czoy", cyvx(int ), (int)85) - hk.cyvr("czos", cyvx(int ), (int)84));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 938543786: {
                        break block24;
                    }
                    case 2013146835: {
                        continue block24;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hk.b;
            v2 /* !! */  = hk.gu;
            if (true) ** GOTO lbl22
            block25: while (true) {
                v2 /* !! */  = (long)(hk.cyvr("czpa", cyvx(int ), (int)87) - hk.cyvr("czoz", cyvx(int ), (int)86));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1853204390: {
                        continue block25;
                    }
                    case 938543786: {
                        break block25;
                    }
                }
                break;
            }
            var1_3 = hk.a;
            if (var3_1) {
                throw null;
lbl30:
                // 5 sources

                return (boolean)hk.cyvr("czpb", cyvo(int ), (int)129);
            }
            if (var1_3 || var1_3) ** GOTO lbl30
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = hk.gu - hk.cyvr("czpc", cyvx(int ), (int)88)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == hk.cyvr("czpe", cyvo(int ), (int)130)) break;
                v3 /* !! */  = (long)hk.cyvr("czpg", cyvo(int ), (int)131);
            }
            if (!this.isWebModeEnabled()) break block39;
            if (var1_3) ** GOTO lbl30
            v4 /* !! */  = hk.gu;
            if (true) ** GOTO lbl45
            block28: while (true) {
                v4 /* !! */  = (long)(hk.cyvr("czpm", cyvx(int ), (int)90) - hk.cyvr("czpl", cyvx(int ), (int)89));
lbl45:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -917018903: {
                        continue block28;
                    }
                    case 938543786: {
                        break block28;
                    }
                }
                break;
            }
            if (!this.isInCobweb()) break block39;
            if (var1_3) ** GOTO lbl30
            v5 = hk.cyvr("czpn", cyvo(int ), (int)132);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl64
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block12 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v5 = hk.cyvr("czpp", cyvo(int ), (int)133);
lbl64:
                // 2 sources

                return (boolean)v5;
            }
            case 0: {
                var2_2 /* !! */  = (int)hk.cyvr("czpr", cyvo(int ), (int)134);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl92
            }
lbl70:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hk.cyvr("czpt", cyvo(int ), (int)135);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 2: {
                var2_2 /* !! */  = (int)hk.cyvr("czpw", cyvo(int ), (int)136);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
lbl79:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)hk.cyvr("czpz", cyvo(int ), (int)137);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                do {
                    var2_2 /* !! */  = (int)hk.cyvr("czqb", cyvo(int ), (int)138);
                } while (!var3_1);
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hk.cyvr("czqc", cyvo(int ), (int)139);
                if (!var3_1) break;
                throw null;
            }
lbl92:
            // 2 sources

            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hk.cyvr("czqe", cyvo(int ), (int)140);
                    if (!var3_1) break block12;
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)hk.cyvr("czqg", cyvo(int ), (int)141);
                if (!var3_1) ** GOTO lbl79
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)hk.cyvr("czqj", cyvo(int ), (int)142);
        ** while (!var3_1)
lbl104:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean hasSlowFalling() {
        block52: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = hk.gu - hk.cyvr("czaw", cyvx(int ), (int)56)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == hk.cyvr("czax", cyvo(int ), (int)75)) break;
                v0 /* !! */  = (long)hk.cyvr("czay", cyvo(int ), (int)76);
            }
            var3_1 = hk.c;
            while (true) {
                block53: {
                    if ((v1 /* !! */  = (cfr_temp_2 = hk.gu - hk.cyvr("czaz", cyvx(int ), (int)57)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  != hk.cyvr("czba", cyvo(int ), (int)77)) break block53;
                    var2_2 /* !! */  = hk.b;
                    v2 /* !! */  = hk.gu;
                    if (true) ** GOTO lbl18
                }
                v1 /* !! */  = (long)hk.cyvr("czbb", cyvo(int ), (int)78);
            }
            block29: while (true) {
                v2 /* !! */  = (long)(v3 - hk.cyvr("czbc", cyvx(int ), (int)58));
lbl18:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case 15913689: {
                        v3 = hk.cyvr("czbd", cyvx(int ), (int)59);
                        continue block29;
                    }
                    case 132380648: {
                        v3 = hk.cyvr("czbe", cyvx(int ), (int)60);
                        continue block29;
                    }
                    case 938543786: {
                        break block29;
                    }
                    case 1286108590: {
                        v3 = hk.cyvr("czbf", cyvx(int ), (int)61);
                        continue block29;
                    }
                }
                break;
            }
            var1_3 = hk.a;
            if (var3_1) {
                throw null;
            }
            if (!var1_3 && !var1_3) ** GOTO lbl56
            block30: while (true) {
                if (var2_2 /* !! */  == 0) return (boolean)hk.cyvr("czbg", cyvo(int ), (int)79);
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                        default: {
                            return (boolean)hk.cyvr("czbg", cyvo(int ), (int)79);
                        }
                        case 7: {
                            var2_2 /* !! */  = (int)hk.cyvr("czci", cyvo(int ), (int)97);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 0: {
                            var2_2 /* !! */  = (int)hk.cyvr("czcb", cyvo(int ), (int)90);
                            cfr_temp_0 = 2;
                            if (var3_1) {
                                throw null;
                            }
                            break block52;
                        }
                        case 8: {
                            var2_2 /* !! */  = (int)hk.cyvr("czcj", cyvo(int ), (int)98);
                            if (var3_1) {
                                throw null;
                            }
                            ** GOTO lbl-1000
                        }
lbl56:
                        // 1 sources

                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = hk.gu - hk.cyvr("czbh", cyvx(int ), (int)62)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  == hk.cyvr("czbi", cyvo(int ), (int)80)) break;
                            v4 /* !! */  = (long)hk.cyvr("czbj", cyvo(int ), (int)81);
                        }
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_4 = hk.gu - hk.cyvr("czbk", cyvx(int ), (int)63)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v5 /* !! */  != hk.cyvr("czbl", cyvo(int ), (int)82)) ** GOTO lbl67
                            if (hk.mc.field_1724 != null) {
                                break;
                            }
                            ** GOTO lbl-1000
lbl67:
                            // 1 sources

                            v5 /* !! */  = (long)hk.cyvr("czbm", cyvo(int ), (int)83);
                        }
                        if (var1_3) continue block30;
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_5 = hk.gu - hk.cyvr("czbn", cyvx(int ), (int)64)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  == hk.cyvr("czbo", cyvo(int ), (int)84)) break;
                            v6 /* !! */  = (long)hk.cyvr("czbp", cyvo(int ), (int)85);
                        }
                        v7 /* !! */  = hk.gu;
                        block35: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case 938543786: {
                                    break block35;
                                }
                                case 1010330687: {
                                    v7 /* !! */  = (long)(hk.cyvr("czbr", cyvx(int ), (int)66) - hk.cyvr("czbq", cyvx(int ), (int)65));
                                    continue block35;
                                }
                            }
                            break;
                        }
                        v8 = hk.mc.field_1724;
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_6 = hk.gu - hk.cyvr("czbs", cyvx(int ), (int)67)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v9 /* !! */  != hk.cyvr("czbt", cyvo(int ), (int)86)) ** GOTO lbl89
                            v10 /* !! */  = hk.gu;
                            if (true) ** GOTO lbl93
lbl89:
                            // 1 sources

                            v9 /* !! */  = (long)hk.cyvr("czbu", cyvo(int ), (int)87);
                        }
                        block37: while (true) {
                            v10 /* !! */  = (long)(v11 - hk.cyvr("czbv", cyvx(int ), (int)68));
lbl93:
                            // 2 sources

                            switch ((int)v10 /* !! */ ) {
                                case -611523244: {
                                    v11 = hk.cyvr("czbw", cyvx(int ), (int)69);
                                    continue block37;
                                }
                                case -414475366: {
                                    v11 = hk.cyvr("czbx", cyvx(int ), (int)70);
                                    continue block37;
                                }
                                case 739599023: {
                                    v11 = hk.cyvr("czby", cyvx(int ), (int)71);
                                    continue block37;
                                }
                                case 938543786: {
                                    break block37;
                                }
                            }
                            break;
                        }
                        if (v8.method_6059(class_1294.field_5906)) {
                            if (var1_3) continue block30;
                            v12 = hk.cyvr("czbz", cyvo(int ), (int)88);
                            if (!var3_1) return (boolean)v12;
                            throw null;
                        } else lbl-1000:
                        // 2 sources

                        {
                            if (!var1_3 && !var1_3) ** break;
                            continue block30;
                            v12 = hk.cyvr("czca", cyvo(int ), (int)89);
                        }
                        return (boolean)v12;
                        case 1: {
                            var2_2 /* !! */  = (int)hk.cyvr("czcc", cyvo(int ), (int)91);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 2: lbl-1000:
                        // 2 sources

                        {
                            var2_2 /* !! */  = (int)hk.cyvr("czcd", cyvo(int ), (int)92);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 3: {
                            var2_2 /* !! */  = (int)hk.cyvr("czce", cyvo(int ), (int)93);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 6: {
                            var2_2 /* !! */  = (int)hk.cyvr("czch", cyvo(int ), (int)96);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 5: {
                            var2_2 /* !! */  = (int)hk.cyvr("czcg", cyvo(int ), (int)95);
                            if (var3_1) {
                                throw null;
                            }
                        }
                        case 4: 
                    }
                    break;
                }
                break;
            }
            ** GOTO lbl139
        }
        do {
            if (true) ** continue;
lbl139:
            // 2 sources

            var2_2 /* !! */  = (int)hk.cyvr("czcf", cyvo(int ), (int)94);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static hk getInstance() {
        v0 /* !! */  = hk.gu;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - hk.cyvr("czwq", cyvx(int ), (int)131));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -660608940: {
                    v1 = hk.cyvr("czwr", cyvx(int ), (int)132);
                    continue block26;
                }
                case 938543786: {
                    break block26;
                }
                case 993796886: {
                    v1 = hk.cyvr("czws", cyvx(int ), (int)133);
                    continue block26;
                }
            }
            break;
        }
        var2 = hk.c;
        v2 /* !! */  = hk.gu;
        if (true) ** GOTO lbl19
        block27: while (true) {
            v2 /* !! */  = (long)(v3 - hk.cyvr("czwt", cyvx(int ), (int)134));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 938543786: {
                    break block27;
                }
                case 1156389948: {
                    v3 = hk.cyvr("czwu", cyvx(int ), (int)135);
                    continue block27;
                }
                case 1256852726: {
                    v3 = hk.cyvr("czwv", cyvx(int ), (int)136);
                    continue block27;
                }
            }
            break;
        }
        var1_1 /* !! */  = hk.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = hk.gu;
                if (true) ** GOTO lbl36
                block28: while (true) {
                    v4 /* !! */  = (long)(v5 - hk.cyvr("czww", cyvx(int ), (int)137));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1354307643: {
                            v5 = hk.cyvr("czwx", cyvx(int ), (int)138);
                            continue block28;
                        }
                        case 938543786: {
                            break block28;
                        }
                        case 1888691629: {
                            v5 = hk.cyvr("czwy", cyvx(int ), (int)139);
                            continue block28;
                        }
                    }
                    break;
                }
                var0_2 = hk.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v6 /* !! */  = hk.gu;
                if (true) ** GOTO lbl55
                block30: while (true) {
                    v6 /* !! */  = (long)(v7 - hk.cyvr("czwz", cyvx(int ), (int)140));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1497085560: {
                            v7 = hk.cyvr("czxa", cyvx(int ), (int)141);
                            continue block30;
                        }
                        case 938543786: {
                            break block30;
                        }
                        case 1381939765: {
                            v7 = hk.cyvr("czxb", cyvx(int ), (int)142);
                            continue block30;
                        }
                    }
                    break;
                }
                return nj.get(hk.class);
            }
lbl65:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)hk.cyvr("czxc", cyvo(int ), (int)209);
                if (var2) {
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)hk.cyvr("czxd", cyvo(int ), (int)210);
                if (!var2) ** GOTO lbl65
                throw null;
            }
            case 2: {
                do {
                    var1_1 /* !! */  = (int)hk.cyvr("czxe", cyvo(int ), (int)211);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)hk.cyvr("czxf", cyvo(int ), (int)212);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ int cyvo(int n2) {
        return cyvp[n2] ^ cyvq[n2];
    }

    private static /* synthetic */ void czxp() {
        hk.cyvz[100] = 7939946055046787932L;
        hk.cyvz[101] = 6062620438207629221L;
        hk.cyvz[102] = -4387526638181549610L;
        hk.cyvz[103] = 3683509509970897721L;
        hk.cyvz[104] = -2533265312224940618L;
        hk.cyvz[105] = 8545405332581370145L;
        hk.cyvz[106] = -2057825436609827127L;
        hk.cyvz[107] = -8274066461016149842L;
        hk.cyvz[108] = -7276322678366326194L;
        hk.cyvz[109] = -11478159541826399L;
        hk.cyvz[110] = 8749646323761762535L;
        hk.cyvz[111] = 4311445227467868442L;
        hk.cyvz[112] = 1845444156328971989L;
        hk.cyvz[113] = -5597213307683906923L;
        hk.cyvz[114] = 6147817414441805941L;
        hk.cyvz[115] = -5973480320316348592L;
        hk.cyvz[116] = -6050589581166950080L;
        hk.cyvz[117] = 1738331733925270486L;
        hk.cyvz[118] = 2383850661038153048L;
        hk.cyvz[119] = -2348955702857364227L;
        hk.cyvz[120] = 1280563425668527627L;
        hk.cyvz[121] = -6506740149935484803L;
        hk.cyvz[122] = -3945403773153450700L;
        hk.cyvz[123] = 9072629044983905769L;
        hk.cyvz[124] = 3965412428276798166L;
        hk.cyvz[125] = -5135630677551696479L;
        hk.cyvz[126] = -3051352900500805261L;
        hk.cyvz[127] = -3182146666719270368L;
        hk.cyvz[128] = -9216012800798427530L;
        hk.cyvz[129] = -5349466918788063365L;
        hk.cyvz[130] = -8184057733363156961L;
        hk.cyvz[131] = -5383067571612225233L;
        hk.cyvz[132] = 817310148835989909L;
        hk.cyvz[133] = 7806992363576025971L;
        hk.cyvz[134] = -8033300482386646897L;
        hk.cyvz[135] = 8428390759712613867L;
        hk.cyvz[136] = 3035879613941526200L;
        hk.cyvz[137] = -8938181423094120013L;
        hk.cyvz[138] = 2033329697914230154L;
        hk.cyvz[139] = 1702069623286375750L;
        hk.cyvz[140] = -820783890217946160L;
        hk.cyvz[141] = -4332721105036331522L;
        hk.cyvz[142] = -6164870427921914668L;
    }
}

