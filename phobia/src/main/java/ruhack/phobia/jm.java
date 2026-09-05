/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11890
 *  net.minecraft.class_408
 *  net.minecraft.class_433
 *  net.minecraft.class_465
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_11890;
import net.minecraft.class_408;
import net.minecraft.class_433;
import net.minecraft.class_465;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.jd;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.mo;
import ruhack.phobia.nd;

public class jm
extends ds {
    private static int[] kqft = new int[103];
    private static int[] kqfu = new int[103];
    public final kb onSelf;
    private long cachedColorMillisecond;
    public static final boolean c;
    static jm instance;
    private static long[] kqfp;
    private int cachedOutlineColor;
    private static final long sv = -1128555723066824226L;
    public static final boolean a;
    private static long[] kqfo;
    static final int FULL_ALPHA = -16777216;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldOutline(class_11890 var1_1) {
        block130: {
            v0 /* !! */  = jm.sv;
            if (true) ** GOTO lbl5
            block88: while (true) {
                v0 /* !! */  = (long)(v1 - jm.kqfq("kqgs", kqfn(int ), (int)9));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1721882146: {
                        break block88;
                    }
                    case 796059395: {
                        v1 = jm.kqfq("kqgt", kqfn(int ), (int)10);
                        continue block88;
                    }
                    case 1174106466: {
                        v1 = jm.kqfq("kqgu", kqfn(int ), (int)11);
                        continue block88;
                    }
                }
                break;
            }
            var4_2 = jm.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = jm.sv - jm.kqfq("kqgv", kqfn(int ), (int)12)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == jm.kqfq("kqgw", kqfs(int ), (int)15)) break;
                v2 /* !! */  = (long)jm.kqfq("kqgx", kqfs(int ), (int)16);
            }
            var3_3 /* !! */  = jm.b;
            v3 /* !! */  = jm.sv;
            if (true) ** GOTO lbl25
            block90: while (true) {
                v3 /* !! */  = (long)(v4 - jm.kqfq("kqgy", kqfn(int ), (int)13));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1721882146: {
                        break block90;
                    }
                    case -676827380: {
                        v4 = jm.kqfq("kqgz", kqfn(int ), (int)14);
                        continue block90;
                    }
                    case 118139958: {
                        v4 = jm.kqfq("kqha", kqfn(int ), (int)15);
                        continue block90;
                    }
                    case 1357189810: {
                        v4 = jm.kqfq("kqhb", kqfn(int ), (int)16);
                        continue block90;
                    }
                }
                break;
            }
            var2_4 = jm.a;
            if (var4_2) {
                throw null;
lbl40:
                // 14 sources

                return (boolean)jm.kqfq("kqhc", kqfs(int ), (int)17);
            }
            if (var2_4 || var2_4) ** GOTO lbl40
            v5 /* !! */  = jm.sv;
            if (true) ** GOTO lbl47
            block92: while (true) {
                v5 /* !! */  = (long)(jm.kqfq("kqhe", kqfn(int ), (int)18) - jm.kqfq("kqhd", kqfn(int ), (int)17));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1721882146: {
                        break block92;
                    }
                    case -56429946: {
                        continue block92;
                    }
                }
                break;
            }
            v6 /* !! */  = jm.sv;
            if (true) ** GOTO lbl56
            block93: while (true) {
                v6 /* !! */  = (long)(v7 - jm.kqfq("kqhf", kqfn(int ), (int)19));
lbl56:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1721882146: {
                        break block93;
                    }
                    case 315747502: {
                        v7 = jm.kqfq("kqhg", kqfn(int ), (int)20);
                        continue block93;
                    }
                    case 1797533108: {
                        v7 = jm.kqfq("kqhh", kqfn(int ), (int)21);
                        continue block93;
                    }
                    case 1995854735: {
                        v7 = jm.kqfq("kqhi", kqfn(int ), (int)22);
                        continue block93;
                    }
                }
                break;
            }
            if (jm.mc.field_1755 == null) break block130;
            if (var2_4) ** GOTO lbl40
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_1 = jm.sv - jm.kqfq("kqhj", kqfn(int ), (int)23)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == jm.kqfq("kqhk", kqfs(int ), (int)18)) break;
                v8 /* !! */  = (long)jm.kqfq("kqhl", kqfs(int ), (int)19);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_2 = jm.sv - jm.kqfq("kqhm", kqfn(int ), (int)24)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == jm.kqfq("kqhn", kqfs(int ), (int)20)) break;
                v9 /* !! */  = (long)jm.kqfq("kqho", kqfs(int ), (int)21);
            }
            if (jm.mc.field_1755 instanceof class_408) break block130;
            if (var2_4) ** GOTO lbl40
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_3 = jm.sv - jm.kqfq("kqhp", kqfn(int ), (int)25)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == jm.kqfq("kqhq", kqfs(int ), (int)22)) break;
                v10 /* !! */  = (long)jm.kqfq("kqhr", kqfs(int ), (int)23);
            }
            v11 /* !! */  = jm.sv;
            if (true) ** GOTO lbl91
            block97: while (true) {
                v11 /* !! */  = (long)(v12 - jm.kqfq("kqhs", kqfn(int ), (int)26));
lbl91:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -1721882146: {
                        break block97;
                    }
                    case 72481494: {
                        v12 = jm.kqfq("kqht", kqfn(int ), (int)27);
                        continue block97;
                    }
                    case 1049200090: {
                        v12 = jm.kqfq("kqhu", kqfn(int ), (int)28);
                        continue block97;
                    }
                    case 1454930291: {
                        v12 = jm.kqfq("kqhv", kqfn(int ), (int)29);
                        continue block97;
                    }
                }
                break;
            }
            if (jm.mc.field_1755 instanceof class_433) break block130;
            if (var2_4) ** GOTO lbl40
            v13 /* !! */  = jm.sv;
            if (true) ** GOTO lbl109
            block98: while (true) {
                v13 /* !! */  = (long)(jm.kqfq("kqhx", kqfn(int ), (int)31) - jm.kqfq("kqhw", kqfn(int ), (int)30));
lbl109:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case -1721882146: {
                        break block98;
                    }
                    case -1175049312: {
                        continue block98;
                    }
                }
                break;
            }
            v14 /* !! */  = jm.sv;
            if (true) ** GOTO lbl118
            block99: while (true) {
                v14 /* !! */  = (long)(jm.kqfq("kqhz", kqfn(int ), (int)33) - jm.kqfq("kqhy", kqfn(int ), (int)32));
lbl118:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -1723196536: {
                        continue block99;
                    }
                    case -1721882146: {
                        break block99;
                    }
                }
                break;
            }
            if (jm.mc.field_1755 instanceof class_465) break block130;
            if (var2_4) ** GOTO lbl40
            v15 /* !! */  = jm.sv;
            if (true) ** GOTO lbl129
            block100: while (true) {
                v15 /* !! */  = (long)(v16 - jm.kqfq("kqia", kqfn(int ), (int)34));
lbl129:
                // 2 sources

                switch ((int)v15 /* !! */ ) {
                    case -1733585874: {
                        v16 = jm.kqfq("kqib", kqfn(int ), (int)35);
                        continue block100;
                    }
                    case -1721882146: {
                        break block100;
                    }
                    case 1719326277: {
                        v16 = jm.kqfq("kqic", kqfn(int ), (int)36);
                        continue block100;
                    }
                }
                break;
            }
            v17 /* !! */  = jm.sv;
            if (true) ** GOTO lbl142
            block101: while (true) {
                v17 /* !! */  = (long)(v18 - jm.kqfq("kqid", kqfn(int ), (int)37));
lbl142:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1721882146: {
                        break block101;
                    }
                    case -1162515212: {
                        v18 = jm.kqfq("kqie", kqfn(int ), (int)38);
                        continue block101;
                    }
                    case 1571241919: {
                        v18 = jm.kqfq("kqif", kqfn(int ), (int)39);
                        continue block101;
                    }
                }
                break;
            }
            if (jm.mc.field_1755 instanceof mo) break block130;
            if (var2_4 || var2_4) ** GOTO lbl40
            return (boolean)jm.kqfq("kqig", kqfs(int ), (int)24);
        }
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl40
                v19 /* !! */  = jm.sv;
                if (true) ** GOTO lbl164
                block102: while (true) {
                    v19 /* !! */  = (long)(jm.kqfq("kqii", kqfn(int ), (int)41) - jm.kqfq("kqih", kqfn(int ), (int)40));
lbl164:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1721882146: {
                            break block102;
                        }
                        case -667043809: {
                            continue block102;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_4 = jm.sv - jm.kqfq("kqij", kqfn(int ), (int)42)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == jm.kqfq("kqik", kqfs(int ), (int)25)) break;
                    v20 /* !! */  = (long)jm.kqfq("kqil", kqfs(int ), (int)26);
                }
                if (jm.mc.field_1724 == null) ** GOTO lbl251
                if (var2_4) ** GOTO lbl40
                v21 /* !! */  = jm.sv;
                if (true) ** GOTO lbl180
                block104: while (true) {
                    v21 /* !! */  = (long)(jm.kqfq("kqin", kqfn(int ), (int)44) - jm.kqfq("kqim", kqfn(int ), (int)43));
lbl180:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1721882146: {
                            break block104;
                        }
                        case -91028510: {
                            continue block104;
                        }
                    }
                    break;
                }
                v22 /* !! */  = jm.sv;
                if (true) ** GOTO lbl189
                block105: while (true) {
                    v22 /* !! */  = (long)(v23 - jm.kqfq("kqio", kqfn(int ), (int)45));
lbl189:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1721882146: {
                            break block105;
                        }
                        case -1225586678: {
                            v23 = jm.kqfq("kqip", kqfn(int ), (int)46);
                            continue block105;
                        }
                        case 277903209: {
                            v23 = jm.kqfq("kqiq", kqfn(int ), (int)47);
                            continue block105;
                        }
                    }
                    break;
                }
                if (var1_1 != jm.mc.field_1724) ** GOTO lbl251
                if (var2_4 || var2_4) ** GOTO lbl40
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_5 = jm.sv - jm.kqfq("kqir", kqfn(int ), (int)48)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == jm.kqfq("kqis", kqfs(int ), (int)27)) break;
                    v24 /* !! */  = (long)jm.kqfq("kqit", kqfs(int ), (int)28);
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_6 = jm.sv - jm.kqfq("kqiu", kqfn(int ), (int)49)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == jm.kqfq("kqiv", kqfs(int ), (int)29)) break;
                    v25 /* !! */  = (long)jm.kqfq("kqiw", kqfs(int ), (int)30);
                }
                if (!this.onSelf.isValue()) ** GOTO lbl248
                if (var2_4) ** GOTO lbl40
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_7 = jm.sv - jm.kqfq("kqix", kqfn(int ), (int)50)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == jm.kqfq("kqiy", kqfs(int ), (int)31)) break;
                    v26 /* !! */  = (long)jm.kqfq("kqiz", kqfs(int ), (int)32);
                }
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_8 = jm.sv - jm.kqfq("kqja", kqfn(int ), (int)51)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == jm.kqfq("kqjb", kqfs(int ), (int)33)) break;
                    v27 /* !! */  = (long)jm.kqfq("kqjc", kqfs(int ), (int)34);
                }
                v28 = jm.mc.field_1690;
                v29 /* !! */  = jm.sv;
                if (true) ** GOTO lbl227
                block110: while (true) {
                    v29 /* !! */  = (long)(v30 - jm.kqfq("kqjd", kqfn(int ), (int)52));
lbl227:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1905502737: {
                            v30 = jm.kqfq("kqje", kqfn(int ), (int)53);
                            continue block110;
                        }
                        case -1721882146: {
                            break block110;
                        }
                        case 1947603401: {
                            v30 = jm.kqfq("kqjf", kqfn(int ), (int)54);
                            continue block110;
                        }
                    }
                    break;
                }
                v31 = v28.method_31044();
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_9 = jm.sv - jm.kqfq("kqjg", kqfn(int ), (int)55)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == jm.kqfq("kqjh", kqfs(int ), (int)35)) break;
                    v32 /* !! */  = (long)jm.kqfq("kqji", kqfs(int ), (int)36);
                }
                if (v31.method_31034()) ** GOTO lbl248
                if (var2_4) ** GOTO lbl40
                v33 = jm.kqfq("kqjj", kqfs(int ), (int)37);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl250
lbl248:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl40
                v33 = jm.kqfq("kqjk", kqfs(int ), (int)38);
lbl250:
                // 2 sources

                return (boolean)v33;
lbl251:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return (boolean)jm.kqfq("kqjl", kqfs(int ), (int)39);
            }
lbl254:
            // 3 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)jm.kqfq("kqjm", kqfs(int ), (int)40);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl279
                    break;
                }
            }
lbl260:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjn", kqfs(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl338
            }
            case 2: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjo", kqfs(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl309
            }
            case 3: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjp", kqfs(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl275:
            // 4 sources

            case 4: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjq", kqfs(int ), (int)44);
                if (!var4_2) break;
                throw null;
            }
lbl279:
            // 3 sources

            case 5: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjr", kqfs(int ), (int)45);
                if (!var4_2) break;
                throw null;
            }
lbl283:
            // 2 sources

            case 6: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjs", kqfs(int ), (int)46);
                if (!var4_2) ** GOTO lbl275
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjt", kqfs(int ), (int)47);
                if (!var4_2) ** GOTO lbl279
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)jm.kqfq("kqju", kqfs(int ), (int)48);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl296:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjv", kqfs(int ), (int)49);
                if (!var4_2) ** GOTO lbl275
                throw null;
            }
lbl300:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjw", kqfs(int ), (int)50);
                if (!var4_2) ** GOTO lbl275
                throw null;
            }
            case 11: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjx", kqfs(int ), (int)51);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl309:
            // 3 sources

            case 12: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjy", kqfs(int ), (int)52);
                if (!var4_2) ** GOTO lbl254
                throw null;
            }
lbl313:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)jm.kqfq("kqjz", kqfs(int ), (int)53);
                if (!var4_2) ** GOTO lbl254
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)jm.kqfq("kqka", kqfs(int ), (int)54);
                if (!var4_2) ** GOTO lbl309
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)jm.kqfq("kqkb", kqfs(int ), (int)55);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl334
            }
            case 16: {
                var3_3 /* !! */  = (int)jm.kqfq("kqkc", kqfs(int ), (int)56);
                if (!var4_2) ** GOTO lbl300
                throw null;
            }
lbl330:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)jm.kqfq("kqkd", kqfs(int ), (int)57);
                if (!var4_2) ** GOTO lbl283
                throw null;
            }
lbl334:
            // 4 sources

            case 18: {
                var3_3 /* !! */  = (int)jm.kqfq("kqke", kqfs(int ), (int)58);
                if (!var4_2) ** GOTO lbl260
                throw null;
            }
lbl338:
            // 2 sources

            case 19: {
                var3_3 /* !! */  = (int)jm.kqfq("kqkf", kqfs(int ), (int)59);
                if (!var4_2) ** GOTO lbl334
                throw null;
            }
            case 20: {
                var3_3 /* !! */  = (int)jm.kqfq("kqkg", kqfs(int ), (int)60);
                if (!var4_2) ** GOTO lbl334
                throw null;
            }
            case 21: {
                var3_3 /* !! */  = (int)jm.kqfq("kqkh", kqfs(int ), (int)61);
                if (!var4_2) ** GOTO lbl300
                throw null;
            }
            case 22: 
        }
        var3_3 /* !! */  = (int)jm.kqfq("kqki", kqfs(int ), (int)62);
        ** while (!var4_2)
lbl353:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public jm() {
        var2_1 /* !! */  = jm.b;
        super("ShaderESP", "Shader outline around players", du.RENDER);
        this.cachedColorMillisecond = (long)jm.kqfq("kqfr", kqfn(int ), (int)0);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.onSelf = new kb("On Self", "Outline your own player in third person");
                jm.instance = this;
                this.settings(new jx[]{this.onSelf});
                return;
            }
            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)jm.kqfq("kqfv", kqfs(int ), (int)0);
                }
            }
lbl15:
            // 3 sources

            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)jm.kqfq("kqfw", kqfs(int ), (int)1);
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)jm.kqfq("kqfx", kqfs(int ), (int)2);
                ** GOTO lbl15
            }
            case 3: {
                var2_1 /* !! */  = (int)jm.kqfq("kqfy", kqfs(int ), (int)3);
                ** GOTO lbl29
            }
            case 4: {
                while (true) {
                    var2_1 /* !! */  = (int)jm.kqfq("kqfz", kqfs(int ), (int)4);
                }
            }
lbl29:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)jm.kqfq("kqga", kqfs(int ), (int)5);
                ** GOTO lbl15
            }
            case 6: 
        }
        while (true) {
            var2_1 /* !! */  = (int)jm.kqfq("kqgb", kqfs(int ), (int)6);
        }
    }

    public static /* synthetic */ CallSite kqfq(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void kqmq() {
        jm.kqft[0] = 1281807401;
        jm.kqft[1] = 490714874;
        jm.kqft[2] = -1222843302;
        jm.kqft[3] = 384750621;
        jm.kqft[4] = -829535096;
        jm.kqft[5] = 828271871;
        jm.kqft[6] = -749158081;
        jm.kqft[7] = 1471662586;
        jm.kqft[8] = -1524672427;
        jm.kqft[9] = 820438056;
        jm.kqft[10] = -1207408654;
        jm.kqft[11] = -2044803809;
        jm.kqft[12] = -370923237;
        jm.kqft[13] = 1900577281;
        jm.kqft[14] = -335584375;
        jm.kqft[15] = -1915450008;
        jm.kqft[16] = -484284526;
        jm.kqft[17] = -1156523468;
        jm.kqft[18] = 1450644353;
        jm.kqft[19] = 1170041500;
        jm.kqft[20] = 737500993;
        jm.kqft[21] = 984783578;
        jm.kqft[22] = 1195975313;
        jm.kqft[23] = -1046295506;
        jm.kqft[24] = -109975421;
        jm.kqft[25] = 172633311;
        jm.kqft[26] = 50943721;
        jm.kqft[27] = 898364335;
        jm.kqft[28] = 820863634;
        jm.kqft[29] = -814617132;
        jm.kqft[30] = 1753921104;
        jm.kqft[31] = 882609471;
        jm.kqft[32] = 1908754325;
        jm.kqft[33] = -217842780;
        jm.kqft[34] = -1333508123;
        jm.kqft[35] = 1989071401;
        jm.kqft[36] = 899394145;
        jm.kqft[37] = 1892418523;
        jm.kqft[38] = 798732062;
        jm.kqft[39] = -1345518135;
        jm.kqft[40] = -2069177345;
        jm.kqft[41] = 1879888868;
        jm.kqft[42] = -1044560392;
        jm.kqft[43] = 1229334473;
        jm.kqft[44] = -41660401;
        jm.kqft[45] = 1422905997;
        jm.kqft[46] = 650249307;
        jm.kqft[47] = 2118981199;
        jm.kqft[48] = 495406163;
        jm.kqft[49] = -1213335239;
        jm.kqft[50] = -290711605;
        jm.kqft[51] = 312136972;
        jm.kqft[52] = 1354116140;
        jm.kqft[53] = 1880617183;
        jm.kqft[54] = 1159143425;
        jm.kqft[55] = 1165005189;
        jm.kqft[56] = -481395221;
        jm.kqft[57] = 552594297;
        jm.kqft[58] = -1921305749;
        jm.kqft[59] = -894070753;
        jm.kqft[60] = -587797387;
        jm.kqft[61] = -2003654237;
        jm.kqft[62] = 1973472835;
        jm.kqft[63] = -995041043;
        jm.kqft[64] = -1222370753;
        jm.kqft[65] = 32313778;
        jm.kqft[66] = -1529861421;
        jm.kqft[67] = -1155755058;
        jm.kqft[68] = 1458341315;
        jm.kqft[69] = 151278223;
        jm.kqft[70] = -1778284731;
        jm.kqft[71] = -1476070333;
        jm.kqft[72] = 707833027;
        jm.kqft[73] = 1932852988;
        jm.kqft[74] = -524402119;
        jm.kqft[75] = 1761083823;
        jm.kqft[76] = 1605926978;
        jm.kqft[77] = 1630411148;
        jm.kqft[78] = -594593629;
        jm.kqft[79] = 2132624883;
        jm.kqft[80] = -962358856;
        jm.kqft[81] = 2143526424;
        jm.kqft[82] = -169189880;
        jm.kqft[83] = -554094556;
        jm.kqft[84] = 1197208079;
        jm.kqft[85] = -2082816519;
        jm.kqft[86] = -700895768;
        jm.kqft[87] = 1196624;
        jm.kqft[88] = -574829292;
        jm.kqft[89] = -1920914991;
        jm.kqft[90] = -1855320219;
        jm.kqft[91] = -53661576;
        jm.kqft[92] = 155942563;
        jm.kqft[93] = -521637217;
        jm.kqft[94] = -1393287596;
        jm.kqft[95] = 2091472430;
        jm.kqft[96] = -1201669341;
        jm.kqft[97] = 905666780;
        jm.kqft[98] = 469765398;
        jm.kqft[99] = -66708416;
    }

    private static /* synthetic */ void kqmv() {
        jm.kqfp[0] = -8671009512341572615L;
        jm.kqfp[1] = 551400819158087942L;
        jm.kqfp[2] = 4862798910610418327L;
        jm.kqfp[3] = -1019331790605417770L;
        jm.kqfp[4] = 1086329409377388785L;
        jm.kqfp[5] = 3520066787558444754L;
        jm.kqfp[6] = -8730603658681952214L;
        jm.kqfp[7] = 8278462271536575648L;
        jm.kqfp[8] = -5033185156826528736L;
        jm.kqfp[9] = -4266822871281450197L;
        jm.kqfp[10] = 1088384578037415764L;
        jm.kqfp[11] = 2092395964021475806L;
        jm.kqfp[12] = 583275940221519371L;
        jm.kqfp[13] = 7388974247157927449L;
        jm.kqfp[14] = -8895194435025801194L;
        jm.kqfp[15] = -3222925824374912117L;
        jm.kqfp[16] = -4890565027933104085L;
        jm.kqfp[17] = -3859199939434678066L;
        jm.kqfp[18] = -117274988792180508L;
        jm.kqfp[19] = 2544528741711405249L;
        jm.kqfp[20] = 7968373261029611159L;
        jm.kqfp[21] = 1675331958471380931L;
        jm.kqfp[22] = -7349483100203687893L;
        jm.kqfp[23] = 4496701042676289406L;
        jm.kqfp[24] = -8388425321817458424L;
        jm.kqfp[25] = 7132065783095521509L;
        jm.kqfp[26] = 3223844010223267375L;
        jm.kqfp[27] = 2939878334958653073L;
        jm.kqfp[28] = 3233243006078189843L;
        jm.kqfp[29] = -1857304952007708762L;
        jm.kqfp[30] = -1641042456501711745L;
        jm.kqfp[31] = -7707817918568625845L;
        jm.kqfp[32] = 5810293582640326425L;
        jm.kqfp[33] = -7261876274926673638L;
        jm.kqfp[34] = 749505712609253234L;
        jm.kqfp[35] = 6408235485998863529L;
        jm.kqfp[36] = 8701545780008804219L;
        jm.kqfp[37] = -5747900776983620577L;
        jm.kqfp[38] = -5549694792472671433L;
        jm.kqfp[39] = 1110052337966871049L;
        jm.kqfp[40] = 3896518241863983149L;
        jm.kqfp[41] = 2384053944223432681L;
        jm.kqfp[42] = -6480117800986239828L;
        jm.kqfp[43] = 5665057369579937009L;
        jm.kqfp[44] = 8148330399259895052L;
        jm.kqfp[45] = 6044209440123862135L;
        jm.kqfp[46] = -8984311320565678166L;
        jm.kqfp[47] = 1728909760980221794L;
        jm.kqfp[48] = -4099047294845786698L;
        jm.kqfp[49] = 156974952920146906L;
        jm.kqfp[50] = 8464437445883150140L;
        jm.kqfp[51] = -1583865077293507398L;
        jm.kqfp[52] = -6438347798182963081L;
        jm.kqfp[53] = 390732305534412242L;
        jm.kqfp[54] = -5721640672740781674L;
        jm.kqfp[55] = 7742027996628010380L;
        jm.kqfp[56] = 8961694828247366788L;
        jm.kqfp[57] = -4797559521065114870L;
        jm.kqfp[58] = -7255464110941803409L;
        jm.kqfp[59] = -5357844650060351620L;
        jm.kqfp[60] = 295133337777193533L;
        jm.kqfp[61] = -4834898462058595714L;
        jm.kqfp[62] = 6193920575109354177L;
        jm.kqfp[63] = -667375479470479967L;
        jm.kqfp[64] = 2873425133881584198L;
        jm.kqfp[65] = -5397035303223933681L;
        jm.kqfp[66] = -6275733424624796365L;
        jm.kqfp[67] = 736137190158317089L;
        jm.kqfp[68] = 2467370676704094575L;
        jm.kqfp[69] = -7094746907898981213L;
        jm.kqfp[70] = 6100367715733113865L;
        jm.kqfp[71] = 8109900576278416772L;
        jm.kqfp[72] = -1746053461969439048L;
        jm.kqfp[73] = 1765403374138446352L;
        jm.kqfp[74] = -7977783182306962636L;
    }

    private static /* synthetic */ void kqms() {
        jm.kqfu[0] = 1281807402;
        jm.kqfu[1] = 490714874;
        jm.kqfu[2] = -1222843302;
        jm.kqfu[3] = 384750616;
        jm.kqfu[4] = -829535095;
        jm.kqfu[5] = 828271866;
        jm.kqfu[6] = -749158084;
        jm.kqfu[7] = 1471662587;
        jm.kqfu[8] = -1586789050;
        jm.kqfu[9] = -820438057;
        jm.kqfu[10] = 50100458;
        jm.kqfu[11] = -2044803811;
        jm.kqfu[12] = -370923239;
        jm.kqfu[13] = 1900577281;
        jm.kqfu[14] = -335584375;
        jm.kqfu[15] = 1915450007;
        jm.kqfu[16] = 1339914895;
        jm.kqfu[17] = -1156523468;
        jm.kqfu[18] = 1450644352;
        jm.kqfu[19] = -2068323476;
        jm.kqfu[20] = 737500992;
        jm.kqfu[21] = -1587893010;
        jm.kqfu[22] = -1195975314;
        jm.kqfu[23] = 444104476;
        jm.kqfu[24] = -109975421;
        jm.kqfu[25] = -172633312;
        jm.kqfu[26] = 2053113507;
        jm.kqfu[27] = -898364336;
        jm.kqfu[28] = -81736033;
        jm.kqfu[29] = -814617131;
        jm.kqfu[30] = 967086665;
        jm.kqfu[31] = -882609472;
        jm.kqfu[32] = -1841557938;
        jm.kqfu[33] = -217842779;
        jm.kqfu[34] = 387392850;
        jm.kqfu[35] = 1989071400;
        jm.kqfu[36] = -1294487995;
        jm.kqfu[37] = 1892418522;
        jm.kqfu[38] = 798732062;
        jm.kqfu[39] = -1345518136;
        jm.kqfu[40] = -2069177347;
        jm.kqfu[41] = 1879888874;
        jm.kqfu[42] = -1044560403;
        jm.kqfu[43] = 1229334477;
        jm.kqfu[44] = -41660409;
        jm.kqfu[45] = 1422905991;
        jm.kqfu[46] = 650249288;
        jm.kqfu[47] = 2118981186;
        jm.kqfu[48] = 495406145;
        jm.kqfu[49] = -1213335244;
        jm.kqfu[50] = -290711604;
        jm.kqfu[51] = 312136960;
        jm.kqfu[52] = 1354116130;
        jm.kqfu[53] = 1880617162;
        jm.kqfu[54] = 1159143433;
        jm.kqfu[55] = 1165005195;
        jm.kqfu[56] = -481395206;
        jm.kqfu[57] = 552594280;
        jm.kqfu[58] = -1921305755;
        jm.kqfu[59] = -894070758;
        jm.kqfu[60] = -587797378;
        jm.kqfu[61] = -2003654233;
        jm.kqfu[62] = 1973472832;
        jm.kqfu[63] = 995041042;
        jm.kqfu[64] = 188878937;
        jm.kqfu[65] = 32313779;
        jm.kqfu[66] = -916967893;
        jm.kqfu[67] = -1155755058;
        jm.kqfu[68] = -1458341316;
        jm.kqfu[69] = -641433555;
        jm.kqfu[70] = -1778284730;
        jm.kqfu[71] = -1476070336;
        jm.kqfu[72] = 707833027;
        jm.kqfu[73] = 1932852991;
        jm.kqfu[74] = 524402118;
        jm.kqfu[75] = 1995109228;
        jm.kqfu[76] = 1762717917;
        jm.kqfu[77] = 1630411149;
        jm.kqfu[78] = -1253123982;
        jm.kqfu[79] = -2132624884;
        jm.kqfu[80] = 1173458226;
        jm.kqfu[81] = -2143526425;
        jm.kqfu[82] = 254830595;
        jm.kqfu[83] = -554094555;
        jm.kqfu[84] = 277864626;
        jm.kqfu[85] = 2094710265;
        jm.kqfu[86] = 700895767;
        jm.kqfu[87] = -158946195;
        jm.kqfu[88] = -574829294;
        jm.kqfu[89] = -1920914992;
        jm.kqfu[90] = -1855320212;
        jm.kqfu[91] = -53661571;
        jm.kqfu[92] = 155942563;
        jm.kqfu[93] = -521637229;
        jm.kqfu[94] = -1393287596;
        jm.kqfu[95] = 2091472427;
        jm.kqfu[96] = -1201669330;
        jm.kqfu[97] = 905666770;
        jm.kqfu[98] = 469765406;
        jm.kqfu[99] = -66708403;
    }

    static {
        jm.kqmq();
        jm.kqmr();
        jm.kqms();
        jm.kqmt();
        kqfo = new long[75];
        kqfp = new long[75];
        jm.kqmu();
        jm.kqmv();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static jm getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = jm.sv - jm.kqfq("kqgc", kqfn(int ), (int)1)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == jm.kqfq("kqgd", kqfs(int ), (int)7)) break;
            v0 /* !! */  = (long)jm.kqfq("kqge", kqfs(int ), (int)8);
        }
        var2 = jm.c;
        v1 /* !! */  = jm.sv;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - jm.kqfq("kqgf", kqfn(int ), (int)2));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1760905736: {
                    v2 = jm.kqfq("kqgg", kqfn(int ), (int)3);
                    continue block17;
                }
                case -1721882146: {
                    break block17;
                }
                case -1616321833: {
                    v2 = jm.kqfq("kqgh", kqfn(int ), (int)4);
                    continue block17;
                }
                case 461731145: {
                    v2 = jm.kqfq("kqgi", kqfn(int ), (int)5);
                    continue block17;
                }
            }
            break;
        }
        var1_1 /* !! */  = jm.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = jm.sv - jm.kqfq("kqgj", kqfn(int ), (int)6)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == jm.kqfq("kqgk", kqfs(int ), (int)9)) break;
                    v3 /* !! */  = (long)jm.kqfq("kqgl", kqfs(int ), (int)10);
                }
                var0_2 = jm.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                v4 /* !! */  = jm.sv;
                if (true) ** GOTO lbl44
                block20: while (true) {
                    v4 /* !! */  = (long)(jm.kqfq("kqgn", kqfn(int ), (int)8) - jm.kqfq("kqgm", kqfn(int ), (int)7));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1721882146: {
                            break block20;
                        }
                        case -71244667: {
                            continue block20;
                        }
                    }
                    break;
                }
                return jm.instance;
            }
lbl50:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)jm.kqfq("kqgo", kqfs(int ), (int)11);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 1: {
                var1_1 /* !! */  = (int)jm.kqfq("kqgp", kqfs(int ), (int)12);
                if (!var2) ** GOTO lbl50
                throw null;
            }
lbl59:
            // 2 sources

            case 2: {
                do {
                    var1_1 /* !! */  = (int)jm.kqfq("kqgq", kqfs(int ), (int)13);
                } while (!var2);
                throw null;
            }
            case 3: 
        }
        do {
            var1_1 /* !! */  = (int)jm.kqfq("kqgr", kqfs(int ), (int)14);
        } while (!var2);
        throw null;
    }

    private static /* synthetic */ void kqmu() {
        jm.kqfo[0] = 552362524513203193L;
        jm.kqfo[1] = -3989815801271998079L;
        jm.kqfo[2] = -6977741979658861112L;
        jm.kqfo[3] = 5682024510976791038L;
        jm.kqfo[4] = 5195385170183441877L;
        jm.kqfo[5] = -4490637508997244865L;
        jm.kqfo[6] = -2036608629859860393L;
        jm.kqfo[7] = 8230233826363696200L;
        jm.kqfo[8] = -2365386095161169514L;
        jm.kqfo[9] = 3531907377233437744L;
        jm.kqfo[10] = -7276580019161732604L;
        jm.kqfo[11] = 820000173257120083L;
        jm.kqfo[12] = 6486813100237727976L;
        jm.kqfo[13] = -2031912464475382486L;
        jm.kqfo[14] = 7148597075659809662L;
        jm.kqfo[15] = -1856936061232515554L;
        jm.kqfo[16] = 4320890517342133132L;
        jm.kqfo[17] = 1070051714672921174L;
        jm.kqfo[18] = -9141535417463382776L;
        jm.kqfo[19] = 2179676302612046209L;
        jm.kqfo[20] = -46102795036416969L;
        jm.kqfo[21] = -7902339122289292551L;
        jm.kqfo[22] = -4020150064144677320L;
        jm.kqfo[23] = -454052212918030024L;
        jm.kqfo[24] = 7401753424611469246L;
        jm.kqfo[25] = 6463571372014878380L;
        jm.kqfo[26] = 6831587808812420676L;
        jm.kqfo[27] = -7858444972571070434L;
        jm.kqfo[28] = 5316257061599342876L;
        jm.kqfo[29] = 6355778455423589714L;
        jm.kqfo[30] = -622455041489153239L;
        jm.kqfo[31] = -1871087950713870378L;
        jm.kqfo[32] = 2354026082555135216L;
        jm.kqfo[33] = 2585234998440479473L;
        jm.kqfo[34] = -62918410867233920L;
        jm.kqfo[35] = -8417665907153848812L;
        jm.kqfo[36] = -4554889538914183161L;
        jm.kqfo[37] = -1367645209935621493L;
        jm.kqfo[38] = -3993531212983923844L;
        jm.kqfo[39] = 5355789158849510230L;
        jm.kqfo[40] = -3964415061191387729L;
        jm.kqfo[41] = -7495232248897409399L;
        jm.kqfo[42] = -5292225688505160882L;
        jm.kqfo[43] = -1777471391194410690L;
        jm.kqfo[44] = 4444080777249124040L;
        jm.kqfo[45] = -6157759700343597424L;
        jm.kqfo[46] = 3354824591308192924L;
        jm.kqfo[47] = 4607116348072329144L;
        jm.kqfo[48] = -313816462232147627L;
        jm.kqfo[49] = -2626230353504389235L;
        jm.kqfo[50] = 4434761697914286903L;
        jm.kqfo[51] = 8050804786155636512L;
        jm.kqfo[52] = 2192883945832466110L;
        jm.kqfo[53] = 7897561012122333818L;
        jm.kqfo[54] = -5893854893063096373L;
        jm.kqfo[55] = -5950305131439395643L;
        jm.kqfo[56] = 164781144352696288L;
        jm.kqfo[57] = 2131087259661071772L;
        jm.kqfo[58] = -3516710463709931544L;
        jm.kqfo[59] = 1843727557759692192L;
        jm.kqfo[60] = 537879342296821090L;
        jm.kqfo[61] = -5795595129062076746L;
        jm.kqfo[62] = 4551434951982525127L;
        jm.kqfo[63] = 2420878683228155894L;
        jm.kqfo[64] = 5994781856462019503L;
        jm.kqfo[65] = 3766107755964241870L;
        jm.kqfo[66] = 1717100987803590562L;
        jm.kqfo[67] = -2423851573474013112L;
        jm.kqfo[68] = 2467370676703914799L;
        jm.kqfo[69] = 7561684612109220420L;
        jm.kqfo[70] = -5858096943842567900L;
        jm.kqfo[71] = 4025067031873084305L;
        jm.kqfo[72] = -5665987093931965290L;
        jm.kqfo[73] = -2719033159882753453L;
        jm.kqfo[74] = -5905519685980439880L;
    }

    private static /* synthetic */ void kqmr() {
        jm.kqft[100] = 162249183;
        jm.kqft[101] = -1868797275;
        jm.kqft[102] = -1134237376;
    }

    private static /* synthetic */ long kqfn(int n2) {
        return kqfo[n2] ^ kqfp[n2];
    }

    private static /* synthetic */ void kqmt() {
        jm.kqfu[100] = 162249182;
        jm.kqfu[101] = -1868797274;
        jm.kqfu[102] = -1134237366;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getOutlineColor() {
        v0 /* !! */  = jm.sv;
        if (true) ** GOTO lbl5
        block30: while (true) {
            v0 /* !! */  = (long)(v1 - jm.kqfq("kqkz", kqfn(int ), (int)61));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1721882146: {
                    break block30;
                }
                case -990085636: {
                    v1 = jm.kqfq("kqla", kqfn(int ), (int)62);
                    continue block30;
                }
                case 886361373: {
                    v1 = jm.kqfq("kqlb", kqfn(int ), (int)63);
                    continue block30;
                }
            }
            break;
        }
        var6_1 = jm.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = jm.sv - jm.kqfq("kqlc", kqfn(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == jm.kqfq("kqld", kqfs(int ), (int)74)) break;
            v2 /* !! */  = (long)jm.kqfq("kqle", kqfs(int ), (int)75);
        }
        var5_2 /* !! */  = jm.b;
        v3 /* !! */  = jm.sv;
        if (true) ** GOTO lbl25
        block32: while (true) {
            v3 /* !! */  = (long)(jm.kqfq("kqlg", kqfn(int ), (int)66) - jm.kqfq("kqlf", kqfn(int ), (int)65));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1962409248: {
                    continue block32;
                }
                case -1721882146: {
                    break block32;
                }
            }
            break;
        }
        var4_3 = jm.a;
        if (!var6_1) ** GOTO lbl37
        throw null;
lbl-1000:
        // 6 sources

        {
            if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var5_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)jm.kqfq("kqlh", kqfs(int ), (int)76);
                }
lbl37:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl-1000
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = jm.sv - jm.kqfq("kqli", kqfn(int ), (int)67)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == jm.kqfq("kqlj", kqfs(int ), (int)77)) break;
                    v4 /* !! */  = (long)jm.kqfq("kqlk", kqfs(int ), (int)78);
                }
                var1_4 = System.nanoTime() / jm.kqfq("kqll", kqfn(int ), (int)68);
                if (var4_3 || var4_3) ** GOTO lbl-1000
                v5 /* !! */  = jm.sv;
                if (true) ** GOTO lbl49
                block35: while (true) {
                    v5 /* !! */  = (long)(jm.kqfq("kqln", kqfn(int ), (int)70) - jm.kqfq("kqlm", kqfn(int ), (int)69));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1721882146: {
                            break block35;
                        }
                        case 428134686: {
                            continue block35;
                        }
                    }
                    break;
                }
                if (this.cachedColorMillisecond != var1_4) ** GOTO lbl62
                if (var4_3 || var4_3) ** GOTO lbl-1000
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = jm.sv - jm.kqfq("kqlo", kqfn(int ), (int)71)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == jm.kqfq("kqlp", kqfs(int ), (int)79)) break;
                    v6 /* !! */  = (long)jm.kqfq("kqlq", kqfs(int ), (int)80);
                }
                return this.cachedOutlineColor;
lbl62:
                // 1 sources

                if (var4_3 || var4_3) ** GOTO lbl-1000
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_3 = jm.sv - jm.kqfq("kqlr", kqfn(int ), (int)72)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == jm.kqfq("kqls", kqfs(int ), (int)81)) break;
                    v7 /* !! */  = (long)jm.kqfq("kqlt", kqfs(int ), (int)82);
                }
                this.cachedColorMillisecond = var1_4;
                if (var4_3 || var4_3) ** GOTO lbl-1000
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_4 = jm.sv - jm.kqfq("kqlu", kqfn(int ), (int)73)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == jm.kqfq("kqlv", kqfs(int ), (int)83)) break;
                    v8 /* !! */  = (long)jm.kqfq("kqlw", kqfs(int ), (int)84);
                }
                var3_5 = nd.getClientColorAt(0.0f);
                if (var4_3 || var4_3) continue block33;
                v9 = var3_5 | jm.kqfq("kqlx", kqfs(int ), (int)85);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_5 = jm.sv - jm.kqfq("kqly", kqfn(int ), (int)74)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == jm.kqfq("kqlz", kqfs(int ), (int)86)) break;
                    v10 /* !! */  = (long)jm.kqfq("kqma", kqfs(int ), (int)87);
                }
                this.cachedOutlineColor = v9;
                return v9;
                case 0: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmb", kqfs(int ), (int)88);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl99
                }
lbl90:
                // 2 sources

                case 1: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmc", kqfs(int ), (int)89);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl105
                }
                case 2: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmd", kqfs(int ), (int)90);
                    if (!var6_1) break block33;
                    throw null;
                }
lbl99:
                // 3 sources

                case 3: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_2 /* !! */  = (int)jm.kqfq("kqme", kqfs(int ), (int)91);
                        if (var6_1) {
                            throw null;
                        }
                        ** GOTO lbl114
                        break;
                    }
                }
lbl105:
                // 2 sources

                case 4: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmf", kqfs(int ), (int)92);
                    if (!var6_1) ** GOTO lbl90
                    throw null;
                }
lbl109:
                // 2 sources

                case 5: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmg", kqfs(int ), (int)93);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl131
                }
lbl114:
                // 4 sources

                case 6: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmh", kqfs(int ), (int)94);
                    if (!var6_1) ** GOTO lbl109
                    throw null;
                }
                case 7: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmi", kqfs(int ), (int)95);
                    if (var6_1) {
                        throw null;
                    }
                    ** GOTO lbl131
                }
                case 8: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmj", kqfs(int ), (int)96);
                    if (!var6_1) ** GOTO lbl99
                    throw null;
                }
                case 9: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmk", kqfs(int ), (int)97);
                    if (!var6_1) ** GOTO lbl114
                    throw null;
                }
lbl131:
                // 3 sources

                case 10: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqml", kqfs(int ), (int)98);
                    if (!var6_1) ** GOTO lbl114
                    throw null;
                }
lbl135:
                // 2 sources

                case 11: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmm", kqfs(int ), (int)99);
                    if (var6_1) {
                        throw null;
                    }
                }
                case 12: {
                    var5_2 /* !! */  = (int)jm.kqfq("kqmn", kqfs(int ), (int)100);
                    if (!var6_1) ** GOTO lbl135
                    throw null;
                }
                case 13: {
                    do {
                        var5_2 /* !! */  = (int)jm.kqfq("kqmo", kqfs(int ), (int)101);
                    } while (!var6_1);
                    throw null;
                }
                case 14: 
            }
        }
        var5_2 /* !! */  = (int)jm.kqfq("kqmp", kqfs(int ), (int)102);
        ** while (!var6_1)
lbl151:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean usesCustomModelOutline(class_11890 class_118902) {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = sv - jm.kqfq("kqkj", kqfn(int ), (int)56)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == jm.kqfq("kqkk", kqfs(int ), (int)63)) break;
            object = jm.kqfq("kqkl", kqfs(int ), (int)64);
        }
        boolean bl3 = c;
        Object object = sv;
        block5: while (true) {
            switch ((int)object) {
                case -1721882146: {
                    break block5;
                }
                case -316312184: {
                    object = jm.kqfq("kqkn", kqfn(int ), (int)58) - jm.kqfq("kqkm", kqfn(int ), (int)57);
                    continue block5;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = sv - jm.kqfq("kqko", kqfn(int ), (int)59)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == jm.kqfq("kqkp", kqfs(int ), (int)65)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = jm.kqfq("kqkq", kqfs(int ), (int)66);
        }
        if (bl2) return (boolean)jm.kqfq("kqkr", kqfs(int ), (int)67);
        if (bl2) return (boolean)jm.kqfq("kqkr", kqfs(int ), (int)67);
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = sv - jm.kqfq("kqks", kqfn(int ), (int)60)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == jm.kqfq("kqkt", kqfs(int ), (int)68)) {
                return jd.appliesTo(class_118902);
            }
            object3 = jm.kqfq("kqku", kqfs(int ), (int)69);
        }
    }

    private static /* synthetic */ int kqfs(int n2) {
        return kqft[n2] ^ kqfu[n2];
    }
}

