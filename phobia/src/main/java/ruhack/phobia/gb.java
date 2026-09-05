/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2246
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2246;
import net.minecraft.class_243;
import ruhack.phobia.aw;
import ruhack.phobia.cq;
import ruhack.phobia.d;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.nj;
import ruhack.phobia.nq;
import ruhack.phobia.pn;

public class gb
extends ds {
    private final kb breakThroughWeb;
    private static int[] jcwy = new int[97];
    public static final long ra = 5397312290650917354L;
    private static long[] jcxt;
    public static final int b;
    public static final boolean a;
    private static long[] jcxu;
    private static int[] jcwz;
    public static final boolean c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gb getInstance() {
        block38: {
            v0 /* !! */  = gb.ra;
            if (true) ** GOTO lbl5
            block22: while (true) {
                v0 /* !! */  = (long)(gb.jcxb("jcxy", jcxs(int ), (int)1) - gb.jcxb("jcxw", jcxs(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1575417366: {
                        break block22;
                    }
                    case 2034982256: {
                        continue block22;
                    }
                }
                break;
            }
            var2 = gb.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = gb.ra - gb.jcxb("jcya", jcxs(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == gb.jcxb("jcyb", jcwx(int ), (int)6)) break;
                v1 /* !! */  = (long)gb.jcxb("jcyd", jcwx(int ), (int)7);
            }
            var1_1 /* !! */  = gb.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_1 = gb.ra - gb.jcxb("jcyf", jcxs(int ), (int)3)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == gb.jcxb("jcyg", jcwx(int ), (int)8)) break;
                v2 /* !! */  = (long)gb.jcxb("jcyi", jcwx(int ), (int)9);
            }
            var0_2 = gb.a;
            if (var2) {
                throw null;
lbl25:
                // 5 sources

                return null;
            }
            if (var0_2 || var0_2) ** GOTO lbl25
            v3 /* !! */  = gb.ra;
            if (true) ** GOTO lbl32
            block26: while (true) {
                v3 /* !! */  = (long)(v4 - gb.jcxb("jcyl", jcxs(int ), (int)4));
lbl32:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1575417366: {
                        break block26;
                    }
                    case -449529886: {
                        v4 = gb.jcxb("jcyn", jcxs(int ), (int)5);
                        continue block26;
                    }
                    case 193746802: {
                        v4 = gb.jcxb("jcyo", jcxs(int ), (int)6);
                        continue block26;
                    }
                }
                break;
            }
            if (d.getInstance() == null) break block38;
            if (var0_2) ** GOTO lbl25
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = gb.ra - gb.jcxb("jcyr", jcxs(int ), (int)7)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == gb.jcxb("jcys", jcwx(int ), (int)10)) break;
                v5 /* !! */  = (long)gb.jcxb("jcyt", jcwx(int ), (int)11);
            }
            v6 = d.getInstance();
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = gb.ra - gb.jcxb("jcyu", jcxs(int ), (int)8)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == gb.jcxb("jcyv", jcwx(int ), (int)12)) break;
                v7 /* !! */  = (long)gb.jcxb("jcyw", jcwx(int ), (int)13);
            }
            if (v6.getManager() != null) ** GOTO lbl62
            if (var0_2) ** GOTO lbl25
        }
        if (var0_2 || var0_2) ** GOTO lbl25
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return null;
            }
lbl62:
            // 1 sources

            if (!var0_2 && !var0_2) ** break;
            ** continue;
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_4 = gb.ra - gb.jcxb("jcyx", jcxs(int ), (int)9)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == gb.jcxb("jcyy", jcwx(int ), (int)14)) break;
                v8 /* !! */  = (long)gb.jcxb("jcza", jcwx(int ), (int)15);
            }
            return nj.get(gb.class);
            case 0: {
                var1_1 /* !! */  = (int)gb.jcxb("jczc", jcwx(int ), (int)16);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl75:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)gb.jcxb("jcze", jcwx(int ), (int)17);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)gb.jcxb("jczg", jcwx(int ), (int)18);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl106
            }
            case 3: {
                var1_1 /* !! */  = (int)gb.jcxb("jczj", jcwx(int ), (int)19);
                if (!var2) break;
                throw null;
            }
lbl88:
            // 2 sources

            case 4: {
                do {
                    var1_1 /* !! */  = (int)gb.jcxb("jczl", jcwx(int ), (int)20);
                } while (!var2);
                throw null;
            }
            case 5: {
                var1_1 /* !! */  = (int)gb.jcxb("jczn", jcwx(int ), (int)21);
                if (!var2) ** GOTO lbl75
                throw null;
            }
            case 6: {
                var1_1 /* !! */  = (int)gb.jcxb("jczo", jcwx(int ), (int)22);
                if (!var2) ** GOTO lbl88
                throw null;
            }
lbl101:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)gb.jcxb("jczq", jcwx(int ), (int)23);
                    if (!var2) break block9;
                    throw null;
                }
            }
lbl106:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)gb.jcxb("jczt", jcwx(int ), (int)24);
                if (!var2) ** GOTO lbl101
                throw null;
            }
lbl110:
            // 2 sources

            case 9: {
                var1_1 /* !! */  = (int)gb.jcxb("jczv", jcwx(int ), (int)25);
                if (!var2) break;
                throw null;
            }
            case 10: 
        }
        var1_1 /* !! */  = (int)gb.jcxb("jczx", jcwx(int ), (int)26);
        ** while (!var2)
lbl117:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onMove(cq var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gb.ra - gb.jcxb("jdcp", jcxs(int ), (int)26)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gb.jcxb("jdcq", jcwx(int ), (int)43)) break;
            v0 /* !! */  = (long)gb.jcxb("jdcs", jcwx(int ), (int)44);
        }
        var7_2 = gb.c;
        v1 /* !! */  = gb.ra;
        if (true) ** GOTO lbl11
        block64: while (true) {
            v1 /* !! */  = (long)(v2 - gb.jcxb("jdct", jcxs(int ), (int)27));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1575417366: {
                    break block64;
                }
                case -883138760: {
                    v2 = gb.jcxb("jdcv", jcxs(int ), (int)28);
                    continue block64;
                }
                case 371021905: {
                    v2 = gb.jcxb("jdcw", jcxs(int ), (int)29);
                    continue block64;
                }
                case 1121442850: {
                    v2 = gb.jcxb("jdcy", jcxs(int ), (int)30);
                    continue block64;
                }
            }
            break;
        }
        var6_3 /* !! */  = gb.b;
        v3 /* !! */  = gb.ra;
        if (true) ** GOTO lbl28
        block65: while (true) {
            v3 /* !! */  = (long)(v4 - gb.jcxb("jdcz", jcxs(int ), (int)31));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1575417366: {
                    break block65;
                }
                case -756079412: {
                    v4 = gb.jcxb("jddb", jcxs(int ), (int)32);
                    continue block65;
                }
                case 2140966702: {
                    v4 = gb.jcxb("jddc", jcxs(int ), (int)33);
                    continue block65;
                }
            }
            break;
        }
        var5_4 = gb.a;
        if (var7_2) {
            throw null;
lbl40:
            // 13 sources

            return;
        }
        if (var5_4 || var5_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = gb.ra - gb.jcxb("jddd", jcxs(int ), (int)34)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == gb.jcxb("jdde", jcwx(int ), (int)45)) break;
            v5 /* !! */  = (long)gb.jcxb("jddf", jcwx(int ), (int)46);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = gb.ra - gb.jcxb("jddi", jcxs(int ), (int)35)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == gb.jcxb("jddj", jcwx(int ), (int)47)) break;
            v6 /* !! */  = (long)gb.jcxb("jddn", jcwx(int ), (int)48);
        }
        if (gb.mc.field_1724 == null) ** GOTO lbl101
        if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_4) ** GOTO lbl40
                v7 /* !! */  = gb.ra;
                if (true) ** GOTO lbl62
                block69: while (true) {
                    v7 /* !! */  = (long)(gb.jcxb("jdds", jcxs(int ), (int)37) - gb.jcxb("jddp", jcxs(int ), (int)36));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1575417366: {
                            break block69;
                        }
                        case 1102018876: {
                            continue block69;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = gb.ra - gb.jcxb("jddt", jcxs(int ), (int)38)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == gb.jcxb("jddv", jcwx(int ), (int)49)) break;
                    v8 /* !! */  = (long)gb.jcxb("jddx", jcwx(int ), (int)50);
                }
                if (gb.mc.field_1687 == null) ** GOTO lbl101
                if (var5_4) ** GOTO lbl40
                v9 /* !! */  = gb.ra;
                if (true) ** GOTO lbl78
                block71: while (true) {
                    v9 /* !! */  = (long)(gb.jcxb("jdea", jcxs(int ), (int)40) - gb.jcxb("jddz", jcxs(int ), (int)39));
lbl78:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1575417366: {
                            break block71;
                        }
                        case 1031926384: {
                            continue block71;
                        }
                    }
                    break;
                }
                v10 /* !! */  = gb.ra;
                if (true) ** GOTO lbl87
                block72: while (true) {
                    v10 /* !! */  = (long)(v11 - gb.jcxb("jdec", jcxs(int ), (int)41));
lbl87:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1597749389: {
                            v11 = gb.jcxb("jdee", jcxs(int ), (int)42);
                            continue block72;
                        }
                        case -1575417366: {
                            break block72;
                        }
                        case -1250021410: {
                            v11 = gb.jcxb("jdeg", jcxs(int ), (int)43);
                            continue block72;
                        }
                        case 2145166979: {
                            v11 = gb.jcxb("jdeh", jcxs(int ), (int)44);
                            continue block72;
                        }
                    }
                    break;
                }
                if (pn.isPlayerInBlock(class_2246.field_10343)) ** GOTO lbl103
                if (var5_4) ** GOTO lbl40
lbl101:
                // 3 sources

                if (var5_4 || var5_4) ** GOTO lbl40
                return;
lbl103:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl40
                v12 = gb.jcxb("jdfi", jdfg(int ), (int)45);
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = gb.ra - gb.jcxb("jdfn", jcxs(int ), (int)46)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == gb.jcxb("jdfq", jcwx(int ), (int)51)) break;
                    v13 /* !! */  = (long)gb.jcxb("jdfu", jcwx(int ), (int)52);
                }
                var2_5 = nq.calculateDirection((double)v12);
                if (var5_4 || var5_4) ** GOTO lbl40
                v14 /* !! */  = gb.ra;
                if (true) ** GOTO lbl116
                block74: while (true) {
                    v14 /* !! */  = (long)(gb.jcxb("jdgd", jcxs(int ), (int)48) - gb.jcxb("jdfy", jcxs(int ), (int)47));
lbl116:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1575417366: {
                            break block74;
                        }
                        case -742361201: {
                            continue block74;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_5 = gb.ra - gb.jcxb("jdgh", jcxs(int ), (int)49)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == gb.jcxb("jdgj", jcwx(int ), (int)53)) break;
                    v15 /* !! */  = (long)gb.jcxb("jdgl", jcwx(int ), (int)54);
                }
                v16 = gb.mc.field_1690;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = gb.ra - gb.jcxb("jdgp", jcxs(int ), (int)50)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == gb.jcxb("jdgs", jcwx(int ), (int)55)) break;
                    v17 /* !! */  = (long)gb.jcxb("jdgu", jcwx(int ), (int)56);
                }
                v18 = v16.field_1903;
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_7 = gb.ra - gb.jcxb("jdgx", jcxs(int ), (int)51)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == gb.jcxb("jdha", jcwx(int ), (int)57)) break;
                    v19 /* !! */  = (long)gb.jcxb("jdhc", jcwx(int ), (int)58);
                }
                if (!v18.method_1434()) ** GOTO lbl144
                if (var5_4 || var5_4) ** GOTO lbl40
                v20 /* !! */  = gb.jcxb("jdhg", jdfg(int ), (int)52);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl175
lbl144:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl40
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_8 = gb.ra - gb.jcxb("jdhk", jcxs(int ), (int)53)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == gb.jcxb("jdhm", jcwx(int ), (int)59)) break;
                    v21 /* !! */  = (long)gb.jcxb("jdho", jcwx(int ), (int)60);
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_9 = gb.ra - gb.jcxb("jdhq", jcxs(int ), (int)54)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == gb.jcxb("jdht", jcwx(int ), (int)61)) break;
                    v22 /* !! */  = (long)gb.jcxb("jdhw", jcwx(int ), (int)62);
                }
                v23 = gb.mc.field_1690;
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_10 = gb.ra - gb.jcxb("jdhz", jcxs(int ), (int)55)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == gb.jcxb("jdia", jcwx(int ), (int)63)) break;
                    v24 /* !! */  = (long)gb.jcxb("jdib", jcwx(int ), (int)64);
                }
                v25 = v23.field_1832;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_11 = gb.ra - gb.jcxb("jdig", jcxs(int ), (int)56)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == gb.jcxb("jdik", jcwx(int ), (int)65)) break;
                    v26 /* !! */  = (long)gb.jcxb("jdin", jcwx(int ), (int)66);
                }
                if (!v25.method_1434()) ** GOTO lbl173
                if (var5_4) ** GOTO lbl40
                v20 /* !! */  = gb.jcxb("jdip", jdfg(int ), (int)57);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl175
lbl173:
                // 1 sources

                if (var5_4 || var5_4) ** GOTO lbl40
                v20 /* !! */  = var3_6 = (CallSite)0.0;
lbl175:
                // 3 sources

                if (var5_4 || var5_4) ** GOTO lbl40
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_12 = gb.ra - gb.jcxb("jdjb", jcxs(int ), (int)58)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == gb.jcxb("jdjd", jcwx(int ), (int)67)) break;
                    v27 /* !! */  = (long)gb.jcxb("jdje", jcwx(int ), (int)68);
                }
                v28 = var2_5[0];
                v29 = var2_5[1];
                while (true) {
                    if ((v30 /* !! */  = (cfr_temp_13 = gb.ra - gb.jcxb("jdji", jcxs(int ), (int)59)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v30 /* !! */  == gb.jcxb("jdjk", jcwx(int ), (int)69)) break;
                    v30 /* !! */  = (long)gb.jcxb("jdjo", jcwx(int ), (int)70);
                }
                v31 = new class_243(v28, (double)var3_6, v29);
                v32 /* !! */  = gb.ra;
                if (true) ** GOTO lbl193
                block84: while (true) {
                    v32 /* !! */  = (long)(v33 - gb.jcxb("jdjq", jcxs(int ), (int)60));
lbl193:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1575417366: {
                            break block84;
                        }
                        case 594984504: {
                            v33 = gb.jcxb("jdjr", jcxs(int ), (int)61);
                            continue block84;
                        }
                        case 849204323: {
                            v33 = gb.jcxb("jdjt", jcxs(int ), (int)62);
                            continue block84;
                        }
                        case 1856934689: {
                            v33 = gb.jcxb("jdjv", jcxs(int ), (int)63);
                            continue block84;
                        }
                    }
                    break;
                }
                var1_1.setMovement(v31);
                if (!var5_4 && !var5_4) ** break;
                ** continue;
                return;
            }
lbl209:
            // 3 sources

            case 0: {
                var6_3 /* !! */  = (int)gb.jcxb("jdjz", jcwx(int ), (int)71);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl299
            }
lbl214:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 /* !! */  = (int)gb.jcxb("jdkc", jcwx(int ), (int)72);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl251
                    break;
                }
            }
lbl220:
            // 2 sources

            case 2: {
                var6_3 /* !! */  = (int)gb.jcxb("jdkf", jcwx(int ), (int)73);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl251
            }
lbl225:
            // 2 sources

            case 3: {
                var6_3 /* !! */  = (int)gb.jcxb("jdki", jcwx(int ), (int)74);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
            case 4: {
                var6_3 /* !! */  = (int)gb.jcxb("jdkk", jcwx(int ), (int)75);
                if (!var7_2) ** GOTO lbl209
                throw null;
            }
            case 5: {
                var6_3 /* !! */  = (int)gb.jcxb("jdkl", jcwx(int ), (int)76);
                if (!var7_2) ** GOTO lbl214
                throw null;
            }
lbl238:
            // 2 sources

            case 6: {
                var6_3 /* !! */  = (int)gb.jcxb("jdkm", jcwx(int ), (int)77);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl243:
            // 2 sources

            case 7: {
                var6_3 /* !! */  = (int)gb.jcxb("jdkp", jcwx(int ), (int)78);
                if (!var7_2) ** GOTO lbl220
                throw null;
            }
lbl247:
            // 3 sources

            case 8: {
                var6_3 /* !! */  = (int)gb.jcxb("jdkr", jcwx(int ), (int)79);
                if (!var7_2) ** GOTO lbl214
                throw null;
            }
lbl251:
            // 4 sources

            case 9: {
                var6_3 /* !! */  = (int)gb.jcxb("jdku", jcwx(int ), (int)80);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl256:
            // 3 sources

            case 10: {
                var6_3 /* !! */  = (int)gb.jcxb("jdky", jcwx(int ), (int)81);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 11: {
                var6_3 /* !! */  = (int)gb.jcxb("jdkz", jcwx(int ), (int)82);
                if (!var7_2) ** GOTO lbl247
                throw null;
            }
            case 12: {
                var6_3 /* !! */  = (int)gb.jcxb("jdle", jcwx(int ), (int)83);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl307
            }
            case 13: {
                var6_3 /* !! */  = (int)gb.jcxb("jdlh", jcwx(int ), (int)84);
                if (!var7_2) ** GOTO lbl251
                throw null;
            }
lbl274:
            // 2 sources

            case 14: {
                var6_3 /* !! */  = (int)gb.jcxb("jdlk", jcwx(int ), (int)85);
                if (var7_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 15: {
                var6_3 /* !! */  = (int)gb.jcxb("jdlm", jcwx(int ), (int)86);
                if (!var7_2) ** GOTO lbl238
                throw null;
            }
            case 16: {
                var6_3 /* !! */  = (int)gb.jcxb("jdlp", jcwx(int ), (int)87);
                if (!var7_2) ** GOTO lbl243
                throw null;
            }
            case 17: {
                var6_3 /* !! */  = (int)gb.jcxb("jdlr", jcwx(int ), (int)88);
                if (!var7_2) ** GOTO lbl225
                throw null;
            }
lbl291:
            // 2 sources

            case 18: {
                var6_3 /* !! */  = (int)gb.jcxb("jdlv", jcwx(int ), (int)89);
                if (!var7_2) ** GOTO lbl247
                throw null;
            }
            case 19: {
                var6_3 /* !! */  = (int)gb.jcxb("jdma", jcwx(int ), (int)90);
                if (!var7_2) ** GOTO lbl274
                throw null;
            }
lbl299:
            // 2 sources

            case 20: {
                var6_3 /* !! */  = (int)gb.jcxb("jdme", jcwx(int ), (int)91);
                if (!var7_2) ** GOTO lbl209
                throw null;
            }
            case 21: {
                var6_3 /* !! */  = (int)gb.jcxb("jdmh", jcwx(int ), (int)92);
                if (!var7_2) ** GOTO lbl256
                throw null;
            }
lbl307:
            // 5 sources

            case 22: {
                var6_3 /* !! */  = (int)gb.jcxb("jdml", jcwx(int ), (int)93);
                if (!var7_2) break;
                throw null;
            }
            case 23: {
                var6_3 /* !! */  = (int)gb.jcxb("jdmo", jcwx(int ), (int)94);
                if (!var7_2) break;
                throw null;
            }
lbl315:
            // 2 sources

            case 24: {
                var6_3 /* !! */  = (int)gb.jcxb("jdmq", jcwx(int ), (int)95);
                if (!var7_2) ** GOTO lbl256
                throw null;
            }
            case 25: 
        }
        var6_3 /* !! */  = (int)gb.jcxb("jdmy", jcwx(int ), (int)96);
        ** while (!var7_2)
lbl322:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void jdnt() {
        gb.jcxt[0] = 3051998136098718077L;
        gb.jcxt[1] = 4846166069819509806L;
        gb.jcxt[2] = 7048768329567837393L;
        gb.jcxt[3] = -2598486915888802651L;
        gb.jcxt[4] = 8535779827994952951L;
        gb.jcxt[5] = 333627596817570998L;
        gb.jcxt[6] = 5592978138849421080L;
        gb.jcxt[7] = -4423362216978054356L;
        gb.jcxt[8] = -2284444922305243L;
        gb.jcxt[9] = -6593847932668514938L;
        gb.jcxt[10] = 4446775017555147504L;
        gb.jcxt[11] = 5087028707518252850L;
        gb.jcxt[12] = 2587972155449864921L;
        gb.jcxt[13] = -1890393519394860365L;
        gb.jcxt[14] = 6008005315855273764L;
        gb.jcxt[15] = 450533169562176688L;
        gb.jcxt[16] = 8796813941399103495L;
        gb.jcxt[17] = 258261634756940201L;
        gb.jcxt[18] = 3604859018967950456L;
        gb.jcxt[19] = 2410959399296054392L;
        gb.jcxt[20] = 4341481122943384352L;
        gb.jcxt[21] = 6955394605809908790L;
        gb.jcxt[22] = -4353639430311968119L;
        gb.jcxt[23] = 4325517413912090170L;
        gb.jcxt[24] = 4080868463348792885L;
        gb.jcxt[25] = -3508398752172513498L;
        gb.jcxt[26] = -7037748052184760432L;
        gb.jcxt[27] = -6978524443146229187L;
        gb.jcxt[28] = 2928255642919810720L;
        gb.jcxt[29] = -3443890988055900938L;
        gb.jcxt[30] = 9145702020011667481L;
        gb.jcxt[31] = -3235377457406649799L;
        gb.jcxt[32] = -4342115343002325922L;
        gb.jcxt[33] = -882130156916645471L;
        gb.jcxt[34] = -4748526175813614488L;
        gb.jcxt[35] = 6389673850239725512L;
        gb.jcxt[36] = -9046218033497896463L;
        gb.jcxt[37] = -7938420398334527676L;
        gb.jcxt[38] = 4222780224897527028L;
        gb.jcxt[39] = 1061852448546073717L;
        gb.jcxt[40] = -4033042965309508442L;
        gb.jcxt[41] = 6721506061812251975L;
        gb.jcxt[42] = -7454590607708468664L;
        gb.jcxt[43] = -8213130009091651210L;
        gb.jcxt[44] = -3791601835192925756L;
        gb.jcxt[45] = -3364494580844520404L;
        gb.jcxt[46] = 6874957362274683871L;
        gb.jcxt[47] = 3972058360875366003L;
        gb.jcxt[48] = -3841241133241289849L;
        gb.jcxt[49] = -6663119084723435461L;
        gb.jcxt[50] = 1687406408668061114L;
        gb.jcxt[51] = 2314483939509829208L;
        gb.jcxt[52] = -2161871002372554726L;
        gb.jcxt[53] = 7221313158640704250L;
        gb.jcxt[54] = -2192049418523066750L;
        gb.jcxt[55] = -2316475676394221606L;
        gb.jcxt[56] = 8223034927395099448L;
        gb.jcxt[57] = 3156789412069769046L;
        gb.jcxt[58] = -3303578026356769994L;
        gb.jcxt[59] = -2669080661973976172L;
        gb.jcxt[60] = -934143946552012294L;
        gb.jcxt[61] = 3406265909206729947L;
        gb.jcxt[62] = -2874594630650058714L;
        gb.jcxt[63] = 3457060940910664543L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gb() {
        var2_1 /* !! */  = gb.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super("NoWeb", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0437\u0430\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u0435 \u0432 \u043f\u0430\u0443\u0442\u0438\u043d\u0435", du.MOVEMENT);
                this.breakThroughWeb = new kb("\u041b\u043e\u043c\u0430\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u043f\u0430\u0443\u0442\u0438\u043d\u0443", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0445\u0438\u0442\u0431\u043e\u043a\u0441 \u043f\u0430\u0443\u0442\u0438\u043d\u044b \u0434\u043b\u044f \u043d\u0430\u0432\u0435\u0434\u0435\u043d\u0438\u044f \u0438 \u043b\u043e\u043c\u0430\u043d\u0438\u044f \u0431\u043b\u043e\u043a\u043e\u0432").setValue((boolean)gb.jcxb("jcxd", jcwx(int ), (int)0));
                this.settings(new jx[]{this.breakThroughWeb});
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gb.jcxb("jcxf", jcwx(int ), (int)1);
                    ** GOTO lbl20
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)gb.jcxb("jcxh", jcwx(int ), (int)2);
                ** GOTO lbl20
            }
            case 2: {
                while (true) {
                    var2_1 /* !! */  = (int)gb.jcxb("jcxj", jcwx(int ), (int)3);
                }
            }
lbl20:
            // 3 sources

            case 3: {
                var2_1 /* !! */  = (int)gb.jcxb("jcxl", jcwx(int ), (int)4);
            }
            case 4: 
        }
        var2_1 /* !! */  = (int)gb.jcxb("jcxn", jcwx(int ), (int)5);
        ** while (true)
    }

    private static /* synthetic */ void jdnm() {
        gb.jcwz[0] = -1671063720;
        gb.jcwz[1] = -397023458;
        gb.jcwz[2] = 130179633;
        gb.jcwz[3] = -323187798;
        gb.jcwz[4] = 714749513;
        gb.jcwz[5] = -1226174415;
        gb.jcwz[6] = -1492834591;
        gb.jcwz[7] = 813360612;
        gb.jcwz[8] = -1660936366;
        gb.jcwz[9] = 1828107091;
        gb.jcwz[10] = 1255035660;
        gb.jcwz[11] = -2121015512;
        gb.jcwz[12] = 1053625785;
        gb.jcwz[13] = -12249295;
        gb.jcwz[14] = -190594824;
        gb.jcwz[15] = -158885371;
        gb.jcwz[16] = 1342270667;
        gb.jcwz[17] = -1991435150;
        gb.jcwz[18] = -2049902276;
        gb.jcwz[19] = 484241555;
        gb.jcwz[20] = -128802200;
        gb.jcwz[21] = -1664114540;
        gb.jcwz[22] = -667642508;
        gb.jcwz[23] = 1698115856;
        gb.jcwz[24] = -141247262;
        gb.jcwz[25] = -622797817;
        gb.jcwz[26] = 523552948;
        gb.jcwz[27] = 731074115;
        gb.jcwz[28] = 1196247757;
        gb.jcwz[29] = 1205703926;
        gb.jcwz[30] = 419004693;
        gb.jcwz[31] = 1222376366;
        gb.jcwz[32] = 888410189;
        gb.jcwz[33] = 621031567;
        gb.jcwz[34] = -1117586129;
        gb.jcwz[35] = 337547151;
        gb.jcwz[36] = 2095018147;
        gb.jcwz[37] = -1928039692;
        gb.jcwz[38] = -920029741;
        gb.jcwz[39] = -962325111;
        gb.jcwz[40] = 1936936149;
        gb.jcwz[41] = -924930136;
        gb.jcwz[42] = 1466003774;
        gb.jcwz[43] = 257121369;
        gb.jcwz[44] = 288316747;
        gb.jcwz[45] = 812309930;
        gb.jcwz[46] = -146477860;
        gb.jcwz[47] = -49249642;
        gb.jcwz[48] = -1995646621;
        gb.jcwz[49] = -840769360;
        gb.jcwz[50] = -24457394;
        gb.jcwz[51] = -779770367;
        gb.jcwz[52] = -1211279484;
        gb.jcwz[53] = -1385272020;
        gb.jcwz[54] = 2129133517;
        gb.jcwz[55] = -1746539892;
        gb.jcwz[56] = -650226471;
        gb.jcwz[57] = 1542461010;
        gb.jcwz[58] = 782679256;
        gb.jcwz[59] = 727486901;
        gb.jcwz[60] = -1705013216;
        gb.jcwz[61] = -1972298723;
        gb.jcwz[62] = -158301371;
        gb.jcwz[63] = 1513691402;
        gb.jcwz[64] = -467205439;
        gb.jcwz[65] = -386074284;
        gb.jcwz[66] = 2027197177;
        gb.jcwz[67] = 2048261123;
        gb.jcwz[68] = -2079513135;
        gb.jcwz[69] = -86552779;
        gb.jcwz[70] = -85499325;
        gb.jcwz[71] = -1696176754;
        gb.jcwz[72] = 2114489315;
        gb.jcwz[73] = 138294143;
        gb.jcwz[74] = -781320743;
        gb.jcwz[75] = 1854756278;
        gb.jcwz[76] = -2106870691;
        gb.jcwz[77] = -1743722607;
        gb.jcwz[78] = 1779086683;
        gb.jcwz[79] = 1569296061;
        gb.jcwz[80] = 1458208754;
        gb.jcwz[81] = -227919944;
        gb.jcwz[82] = -60822586;
        gb.jcwz[83] = -1108580456;
        gb.jcwz[84] = -1938569192;
        gb.jcwz[85] = 386124914;
        gb.jcwz[86] = 1686437447;
        gb.jcwz[87] = 36981462;
        gb.jcwz[88] = -2139224134;
        gb.jcwz[89] = -586121672;
        gb.jcwz[90] = -149353158;
        gb.jcwz[91] = 841763642;
        gb.jcwz[92] = 69637694;
        gb.jcwz[93] = 171839032;
        gb.jcwz[94] = 920672459;
        gb.jcwz[95] = 1062727049;
        gb.jcwz[96] = 215682755;
    }

    private static /* synthetic */ int jcwx(int n2) {
        return jcwy[n2] ^ jcwz[n2];
    }

    public static /* synthetic */ CallSite jcxb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void jdoa() {
        gb.jcxu[0] = -6904542793082836524L;
        gb.jcxu[1] = 2862373906500584383L;
        gb.jcxu[2] = 6186043190775009946L;
        gb.jcxu[3] = -457594837156285237L;
        gb.jcxu[4] = 6870808566440508861L;
        gb.jcxu[5] = 6726290167915211661L;
        gb.jcxu[6] = 534353410116694181L;
        gb.jcxu[7] = -5312671430357046705L;
        gb.jcxu[8] = -5064259936421649333L;
        gb.jcxu[9] = -2980319136574817509L;
        gb.jcxu[10] = -620360114959881913L;
        gb.jcxu[11] = -311988032058224109L;
        gb.jcxu[12] = -4639511232727563854L;
        gb.jcxu[13] = 1150292871728221910L;
        gb.jcxu[14] = 842801000939726360L;
        gb.jcxu[15] = -7083489792910074560L;
        gb.jcxu[16] = -5653746941144632579L;
        gb.jcxu[17] = -4882044327106395629L;
        gb.jcxu[18] = 4165704854843409635L;
        gb.jcxu[19] = -5391193965119744325L;
        gb.jcxu[20] = -5992274378673687983L;
        gb.jcxu[21] = -3176340215173162205L;
        gb.jcxu[22] = -4138778655473239343L;
        gb.jcxu[23] = 5633102588034385117L;
        gb.jcxu[24] = -1484213469698459404L;
        gb.jcxu[25] = -4413250921361698700L;
        gb.jcxu[26] = -9056007400914721732L;
        gb.jcxu[27] = 8128610488172469489L;
        gb.jcxu[28] = -2505294357900669135L;
        gb.jcxu[29] = -9116404175661103216L;
        gb.jcxu[30] = -5893050682675300637L;
        gb.jcxu[31] = -4594663671633405122L;
        gb.jcxu[32] = -6259834809266084680L;
        gb.jcxu[33] = 8692920907710410220L;
        gb.jcxu[34] = -5202231271887796914L;
        gb.jcxu[35] = -1848140988886386772L;
        gb.jcxu[36] = -5227897372883344986L;
        gb.jcxu[37] = -7046400608662385167L;
        gb.jcxu[38] = 4430929696115500677L;
        gb.jcxu[39] = 1332481554014839782L;
        gb.jcxu[40] = 3052828984369114662L;
        gb.jcxu[41] = -4179252793545762590L;
        gb.jcxu[42] = 1749576866391342279L;
        gb.jcxu[43] = -8634953928603002001L;
        gb.jcxu[44] = -5757348811891368664L;
        gb.jcxu[45] = -1260230588480733179L;
        gb.jcxu[46] = -4790282884493645012L;
        gb.jcxu[47] = -6729786702016592088L;
        gb.jcxu[48] = -3691508649411877036L;
        gb.jcxu[49] = -9126618818054224734L;
        gb.jcxu[50] = -1904633630834835108L;
        gb.jcxu[51] = -7181655602047194992L;
        gb.jcxu[52] = -2445142742716930436L;
        gb.jcxu[53] = -371031463121831485L;
        gb.jcxu[54] = -1476767746583433069L;
        gb.jcxu[55] = 19481836118651619L;
        gb.jcxu[56] = -4471210268563669292L;
        gb.jcxu[57] = -7772846437900510928L;
        gb.jcxu[58] = -790318159904941401L;
        gb.jcxu[59] = 6238644280050093021L;
        gb.jcxu[60] = 4686839205005220170L;
        gb.jcxu[61] = -8762425733008267608L;
        gb.jcxu[62] = -2913750220215518278L;
        gb.jcxu[63] = 2935024884933300444L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldBreakThroughWeb() {
        block34: {
            block33: {
                v0 /* !! */  = gb.ra;
                if (true) ** GOTO lbl5
                block22: while (true) {
                    v0 /* !! */  = (long)(v1 - gb.jcxb("jdad", jcxs(int ), (int)10));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1575417366: {
                            break block22;
                        }
                        case -353368065: {
                            v1 = gb.jcxb("jdaf", jcxs(int ), (int)11);
                            continue block22;
                        }
                        case 690862402: {
                            v1 = gb.jcxb("jdag", jcxs(int ), (int)12);
                            continue block22;
                        }
                        case 1531052290: {
                            v1 = gb.jcxb("jdai", jcxs(int ), (int)13);
                            continue block22;
                        }
                    }
                    break;
                }
                var3_1 = gb.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_0 = gb.ra - gb.jcxb("jdak", jcxs(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == gb.jcxb("jdam", jcwx(int ), (int)27)) break;
                    v2 /* !! */  = (long)gb.jcxb("jdan", jcwx(int ), (int)28);
                }
                var2_2 = gb.b;
                v3 /* !! */  = gb.ra;
                if (true) ** GOTO lbl29
                block24: while (true) {
                    v3 /* !! */  = (long)(v4 - gb.jcxb("jdao", jcxs(int ), (int)15));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1575417366: {
                            break block24;
                        }
                        case -1340673100: {
                            v4 = gb.jcxb("jdar", jcxs(int ), (int)16);
                            continue block24;
                        }
                        case 62292828: {
                            v4 = gb.jcxb("jdas", jcxs(int ), (int)17);
                            continue block24;
                        }
                    }
                    break;
                }
                var1_3 = gb.a;
                if (var3_1) {
                    throw null;
lbl41:
                    // 4 sources

                    return (boolean)gb.jcxb("jdav", jcwx(int ), (int)29);
                }
                if (var1_3 || var1_3) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gb.ra - gb.jcxb("jdax", jcxs(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gb.jcxb("jdaz", jcwx(int ), (int)30)) break;
                    v5 /* !! */  = (long)gb.jcxb("jdba", jcwx(int ), (int)31);
                }
                if (!this.isState()) break block33;
                if (var1_3) ** GOTO lbl41
                v6 /* !! */  = gb.ra;
                if (true) ** GOTO lbl56
                block27: while (true) {
                    v6 /* !! */  = (long)(v7 - gb.jcxb("jdbc", jcxs(int ), (int)19));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1575417366: {
                            break block27;
                        }
                        case 64461155: {
                            v7 = gb.jcxb("jdbd", jcxs(int ), (int)20);
                            continue block27;
                        }
                        case 1813353736: {
                            v7 = gb.jcxb("jdbe", jcxs(int ), (int)21);
                            continue block27;
                        }
                        case 1827432452: {
                            v7 = gb.jcxb("jdbg", jcxs(int ), (int)22);
                            continue block27;
                        }
                    }
                    break;
                }
                v8 /* !! */  = gb.ra;
                if (true) ** GOTO lbl72
                block28: while (true) {
                    v8 /* !! */  = (long)(v9 - gb.jcxb("jdbi", jcxs(int ), (int)23));
lbl72:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1575417366: {
                            break block28;
                        }
                        case 735042540: {
                            v9 = gb.jcxb("jdbk", jcxs(int ), (int)24);
                            continue block28;
                        }
                        case 1549937284: {
                            v9 = gb.jcxb("jdbm", jcxs(int ), (int)25);
                            continue block28;
                        }
                    }
                    break;
                }
                if (!this.breakThroughWeb.isValue()) break block33;
                if (var1_3) ** GOTO lbl41
                v10 = gb.jcxb("jdbo", jcwx(int ), (int)32);
                if (var3_1) {
                    throw null;
                }
                break block34;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            v10 = gb.jcxb("jdbq", jcwx(int ), (int)33);
        }
        return (boolean)v10;
    }

    private static /* synthetic */ void jdnd() {
        gb.jcwy[0] = -1671063720;
        gb.jcwy[1] = -397023458;
        gb.jcwy[2] = 130179637;
        gb.jcwy[3] = -323187798;
        gb.jcwy[4] = 714749512;
        gb.jcwy[5] = -1226174411;
        gb.jcwy[6] = -1492834592;
        gb.jcwy[7] = 658259691;
        gb.jcwy[8] = -1660936365;
        gb.jcwy[9] = 1022337929;
        gb.jcwy[10] = -1255035661;
        gb.jcwy[11] = 212816047;
        gb.jcwy[12] = 1053625784;
        gb.jcwy[13] = -633108794;
        gb.jcwy[14] = 190594823;
        gb.jcwy[15] = 1736565801;
        gb.jcwy[16] = 1342270667;
        gb.jcwy[17] = -1991435149;
        gb.jcwy[18] = -2049902279;
        gb.jcwy[19] = 484241559;
        gb.jcwy[20] = -128802208;
        gb.jcwy[21] = -1664114542;
        gb.jcwy[22] = -667642500;
        gb.jcwy[23] = 1698115864;
        gb.jcwy[24] = -141247258;
        gb.jcwy[25] = -622797821;
        gb.jcwy[26] = 523552947;
        gb.jcwy[27] = -731074116;
        gb.jcwy[28] = 1897546750;
        gb.jcwy[29] = 1205703926;
        gb.jcwy[30] = 419004692;
        gb.jcwy[31] = 1569758519;
        gb.jcwy[32] = 888410188;
        gb.jcwy[33] = 621031567;
        gb.jcwy[34] = -1117586131;
        gb.jcwy[35] = 337547150;
        gb.jcwy[36] = 2095018155;
        gb.jcwy[37] = -1928039692;
        gb.jcwy[38] = -920029739;
        gb.jcwy[39] = -962325105;
        gb.jcwy[40] = 1936936151;
        gb.jcwy[41] = -924930131;
        gb.jcwy[42] = 1466003774;
        gb.jcwy[43] = 257121368;
        gb.jcwy[44] = -498695642;
        gb.jcwy[45] = 812309931;
        gb.jcwy[46] = -685757375;
        gb.jcwy[47] = -49249641;
        gb.jcwy[48] = -698834277;
        gb.jcwy[49] = -840769359;
        gb.jcwy[50] = 790108167;
        gb.jcwy[51] = -779770368;
        gb.jcwy[52] = -490903475;
        gb.jcwy[53] = -1385272019;
        gb.jcwy[54] = 210892772;
        gb.jcwy[55] = -1746539891;
        gb.jcwy[56] = 1070496803;
        gb.jcwy[57] = 1542461011;
        gb.jcwy[58] = -318792528;
        gb.jcwy[59] = 727486900;
        gb.jcwy[60] = -711030769;
        gb.jcwy[61] = -1972298724;
        gb.jcwy[62] = -1639818;
        gb.jcwy[63] = 1513691403;
        gb.jcwy[64] = -2005116405;
        gb.jcwy[65] = -386074283;
        gb.jcwy[66] = 1988056152;
        gb.jcwy[67] = 2048261122;
        gb.jcwy[68] = -270436009;
        gb.jcwy[69] = -86552780;
        gb.jcwy[70] = 1892703347;
        gb.jcwy[71] = -1696176766;
        gb.jcwy[72] = 2114489315;
        gb.jcwy[73] = 138294139;
        gb.jcwy[74] = -781320745;
        gb.jcwy[75] = 1854756283;
        gb.jcwy[76] = -2106870696;
        gb.jcwy[77] = -1743722615;
        gb.jcwy[78] = 1779086680;
        gb.jcwy[79] = 1569296051;
        gb.jcwy[80] = 1458208752;
        gb.jcwy[81] = -227919944;
        gb.jcwy[82] = -60822590;
        gb.jcwy[83] = -1108580454;
        gb.jcwy[84] = -1938569208;
        gb.jcwy[85] = 386124899;
        gb.jcwy[86] = 1686437452;
        gb.jcwy[87] = 36981440;
        gb.jcwy[88] = -2139224148;
        gb.jcwy[89] = -586121673;
        gb.jcwy[90] = -149353156;
        gb.jcwy[91] = 841763641;
        gb.jcwy[92] = 69637688;
        gb.jcwy[93] = 171839029;
        gb.jcwy[94] = 920672479;
        gb.jcwy[95] = 1062727048;
        gb.jcwy[96] = 215682759;
    }

    static {
        jcwz = new int[97];
        gb.jdnd();
        gb.jdnm();
        jcxt = new long[64];
        jcxu = new long[64];
        gb.jdnt();
        gb.jdoa();
    }

    private static /* synthetic */ double jdfg(int n2) {
        return Double.longBitsToDouble(jcxt[n2] ^ jcxu[n2]);
    }

    private static /* synthetic */ long jcxs(int n2) {
        return jcxt[n2] ^ jcxu[n2];
    }
}

