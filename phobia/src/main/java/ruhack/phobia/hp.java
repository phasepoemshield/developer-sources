/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Objects;
import java.util.function.Predicate;
import net.minecraft.class_1309;
import ruhack.phobia.aw;
import ruhack.phobia.cj;
import ruhack.phobia.da;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hp$1;
import ruhack.phobia.hy;
import ruhack.phobia.ik;
import ruhack.phobia.ik$EntityFilter;
import ruhack.phobia.in;
import ruhack.phobia.in$SwapSettingsProvider;
import ruhack.phobia.io;
import ruhack.phobia.io$SwapSettingsProvider;
import ruhack.phobia.ip;
import ruhack.phobia.iq;
import ruhack.phobia.ir;
import ruhack.phobia.is;
import ruhack.phobia.it$Stage;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kf;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.nn;
import ruhack.phobia.nv;
import ruhack.phobia.oc;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;
import ruhack.phobia.ov$VecRotation;
import ruhack.phobia.pr;

public class hp
extends ds {
    private static int[] cbai = new int[615];
    private static long[] cbab;
    private class_1309 target;
    private final kf modeSetting;
    public static final int b;
    private static int[] cbaj;
    public static final boolean c;
    private final is stageHandler;
    private final kg height;
    private final ik targetFinder;
    private final kb predictMovement;
    private final iq flightController;
    private final pr fireworkTimer;
    private final in armorSwapHandler;
    private final kb autoEquipChest;
    private final kf serverMode;
    private final ke targetType;
    protected static final long ff = 5592923507871639399L;
    private static long[] cbaa;
    private final ir predictor;
    private final ip attackHandler;
    public static final boolean a;
    private final io fireworkHandler;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        block150: {
            v0 /* !! */  = hp.ff;
            if (true) ** GOTO lbl5
            block98: while (true) {
                v0 /* !! */  = (long)(v1 - hp.cbac("cbki", cazz(int ), (int)122));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -876527731: {
                        v1 = hp.cbac("cbkj", cazz(int ), (int)123);
                        continue block98;
                    }
                    case 494282542: {
                        v1 = hp.cbac("cbkk", cazz(int ), (int)124);
                        continue block98;
                    }
                    case 898253614: {
                        v1 = hp.cbac("cbkl", cazz(int ), (int)125);
                        continue block98;
                    }
                    case 1050601319: {
                        break block98;
                    }
                }
                break;
            }
            var3_1 = hp.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cbkm", cazz(int ), (int)126)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == hp.cbac("cbkn", cbah(int ), (int)139)) break;
                v2 /* !! */  = (long)hp.cbac("cbko", cbah(int ), (int)140);
            }
            var2_2 /* !! */  = hp.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("cbkp", cazz(int ), (int)127)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == hp.cbac("cbkq", cbah(int ), (int)141)) break;
                v3 /* !! */  = (long)hp.cbac("cbkr", cbah(int ), (int)142);
            }
            var1_3 = hp.a;
            if (var3_1) {
                throw null;
lbl32:
                // 14 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl32
            v4 /* !! */  = hp.ff;
            if (true) ** GOTO lbl39
            block102: while (true) {
                v4 /* !! */  = (long)(hp.cbac("cbkt", cazz(int ), (int)129) - hp.cbac("cbks", cazz(int ), (int)128));
lbl39:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case 1050601319: {
                        break block102;
                    }
                    case 2025023563: {
                        continue block102;
                    }
                }
                break;
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("cbku", cazz(int ), (int)130)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == hp.cbac("cbkv", cbah(int ), (int)143)) break;
                v5 /* !! */  = (long)hp.cbac("cbkw", cbah(int ), (int)144);
            }
            if (!this.autoEquipChest.isValue()) break block150;
            if (var1_3) ** GOTO lbl32
            v6 /* !! */  = hp.ff;
            if (true) ** GOTO lbl55
            block104: while (true) {
                v6 /* !! */  = (long)(hp.cbac("cbky", cazz(int ), (int)132) - hp.cbac("cbkx", cazz(int ), (int)131));
lbl55:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1425530904: {
                        continue block104;
                    }
                    case 1050601319: {
                        break block104;
                    }
                }
                break;
            }
            v7 /* !! */  = hp.ff;
            if (true) ** GOTO lbl64
            block105: while (true) {
                v7 /* !! */  = (long)(v8 - hp.cbac("cbkz", cazz(int ), (int)133));
lbl64:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1543008452: {
                        v8 = hp.cbac("cbla", cazz(int ), (int)134);
                        continue block105;
                    }
                    case -806597929: {
                        v8 = hp.cbac("cblb", cazz(int ), (int)135);
                        continue block105;
                    }
                    case 1050601319: {
                        break block105;
                    }
                    case 1813692538: {
                        v8 = hp.cbac("cblc", cazz(int ), (int)136);
                        continue block105;
                    }
                }
                break;
            }
            if (hp.mc.field_1724 == null) break block150;
            if (var1_3 || var1_3) ** GOTO lbl32
            v9 /* !! */  = hp.ff;
            if (true) ** GOTO lbl82
            block106: while (true) {
                v9 /* !! */  = (long)(v10 - hp.cbac("cbld", cazz(int ), (int)137));
lbl82:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1456698233: {
                        v10 = hp.cbac("cble", cazz(int ), (int)138);
                        continue block106;
                    }
                    case -1271024762: {
                        v10 = hp.cbac("cblf", cazz(int ), (int)139);
                        continue block106;
                    }
                    case -694087132: {
                        v10 = hp.cbac("cblg", cazz(int ), (int)140);
                        continue block106;
                    }
                    case 1050601319: {
                        break block106;
                    }
                }
                break;
            }
            this.equipChestplateOnDisable();
            if (var1_3) ** GOTO lbl32
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_3 = hp.ff - hp.cbac("cblh", cazz(int ), (int)141)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hp.cbac("cbli", cbah(int ), (int)145)) break;
            v11 /* !! */  = (long)hp.cbac("cblj", cbah(int ), (int)146);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = hp.ff - hp.cbac("cblk", cazz(int ), (int)142)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == hp.cbac("cbll", cbah(int ), (int)147)) break;
            v12 /* !! */  = (long)hp.cbac("cblm", cbah(int ), (int)148);
        }
        this.attackHandler.releaseMace();
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_5 = hp.ff - hp.cbac("cbln", cazz(int ), (int)143)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == hp.cbac("cblo", cbah(int ), (int)149)) break;
            v13 /* !! */  = (long)hp.cbac("cblp", cbah(int ), (int)150);
        }
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = hp.ff - hp.cbac("cblq", cazz(int ), (int)144)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == hp.cbac("cblr", cbah(int ), (int)151)) break;
            v14 /* !! */  = (long)hp.cbac("cbls", cbah(int ), (int)152);
        }
        this.armorSwapHandler.forceRestore();
        if (var1_3 || var1_3) ** GOTO lbl32
        v15 /* !! */  = hp.ff;
        if (true) ** GOTO lbl126
        block111: while (true) {
            v15 /* !! */  = (long)(v16 - hp.cbac("cblt", cazz(int ), (int)145));
lbl126:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -87047430: {
                    v16 = hp.cbac("cblu", cazz(int ), (int)146);
                    continue block111;
                }
                case 1050601319: {
                    break block111;
                }
                case 1406987437: {
                    v16 = hp.cbac("cblv", cazz(int ), (int)147);
                    continue block111;
                }
            }
            break;
        }
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_7 = hp.ff - hp.cbac("cblw", cazz(int ), (int)148)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == hp.cbac("cblx", cbah(int ), (int)153)) break;
            v17 /* !! */  = (long)hp.cbac("cbly", cbah(int ), (int)154);
        }
        this.fireworkHandler.forceRestore();
        if (var1_3 || var1_3) ** GOTO lbl32
        v18 /* !! */  = hp.ff;
        if (true) ** GOTO lbl146
        block113: while (true) {
            v18 /* !! */  = (long)(v19 - hp.cbac("cblz", cazz(int ), (int)149));
lbl146:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -1593222605: {
                    v19 = hp.cbac("cbma", cazz(int ), (int)150);
                    continue block113;
                }
                case -721196214: {
                    v19 = hp.cbac("cbmb", cazz(int ), (int)151);
                    continue block113;
                }
                case 1050601319: {
                    break block113;
                }
                case 2067997209: {
                    v19 = hp.cbac("cbmc", cazz(int ), (int)152);
                    continue block113;
                }
            }
            break;
        }
        this.target = null;
        if (var1_3 || var1_3) ** GOTO lbl32
        v20 /* !! */  = hp.ff;
        if (true) ** GOTO lbl164
        block114: while (true) {
            v20 /* !! */  = (long)(v21 - hp.cbac("cbmd", cazz(int ), (int)153));
lbl164:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -573764424: {
                    v21 = hp.cbac("cbme", cazz(int ), (int)154);
                    continue block114;
                }
                case 1050601319: {
                    break block114;
                }
                case 1795053108: {
                    v21 = hp.cbac("cbmf", cazz(int ), (int)155);
                    continue block114;
                }
                case 2145331139: {
                    v21 = hp.cbac("cbmg", cazz(int ), (int)156);
                    continue block114;
                }
            }
            break;
        }
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_8 = hp.ff - hp.cbac("cbmh", cazz(int ), (int)157)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == hp.cbac("cbmi", cbah(int ), (int)155)) break;
            v22 /* !! */  = (long)hp.cbac("cbmj", cbah(int ), (int)156);
        }
        this.targetFinder.releaseTarget();
        if (var1_3 || var1_3) ** GOTO lbl32
        v23 /* !! */  = hp.ff;
        if (true) ** GOTO lbl187
        block116: while (true) {
            v23 /* !! */  = (long)(v24 - hp.cbac("cbmk", cazz(int ), (int)158));
lbl187:
            // 2 sources

            switch ((int)v23 /* !! */ ) {
                case 553130975: {
                    v24 = hp.cbac("cbml", cazz(int ), (int)159);
                    continue block116;
                }
                case 1050601319: {
                    break block116;
                }
                case 1194222292: {
                    v24 = hp.cbac("cbmm", cazz(int ), (int)160);
                    continue block116;
                }
                case 1393020192: {
                    v24 = hp.cbac("cbmn", cazz(int ), (int)161);
                    continue block116;
                }
            }
            break;
        }
        v25 /* !! */  = hp.ff;
        if (true) ** GOTO lbl203
        block117: while (true) {
            v25 /* !! */  = (long)(hp.cbac("cbmp", cazz(int ), (int)163) - hp.cbac("cbmo", cazz(int ), (int)162));
lbl203:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case 1050601319: {
                    break block117;
                }
                case 1894523260: {
                    continue block117;
                }
            }
            break;
        }
        this.armorSwapHandler.reset();
        if (var1_3 || var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v26 /* !! */  = hp.ff;
                if (true) ** GOTO lbl217
                block118: while (true) {
                    v26 /* !! */  = (long)(hp.cbac("cbmr", cazz(int ), (int)165) - hp.cbac("cbmq", cazz(int ), (int)164));
lbl217:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -2061817754: {
                            continue block118;
                        }
                        case 1050601319: {
                            break block118;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_9 = hp.ff - hp.cbac("cbms", cazz(int ), (int)166)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == hp.cbac("cbmt", cbah(int ), (int)157)) break;
                    v27 /* !! */  = (long)hp.cbac("cbmu", cbah(int ), (int)158);
                }
                this.fireworkHandler.reset();
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_10 = hp.ff - hp.cbac("cbmv", cazz(int ), (int)167)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == hp.cbac("cbmw", cbah(int ), (int)159)) break;
                    v28 /* !! */  = (long)hp.cbac("cbmx", cbah(int ), (int)160);
                }
                v29 /* !! */  = hp.ff;
                if (true) ** GOTO lbl238
                block121: while (true) {
                    v29 /* !! */  = (long)(v30 - hp.cbac("cbmy", cazz(int ), (int)168));
lbl238:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1824571360: {
                            v30 = hp.cbac("cbmz", cazz(int ), (int)169);
                            continue block121;
                        }
                        case -1272593778: {
                            v30 = hp.cbac("cbna", cazz(int ), (int)170);
                            continue block121;
                        }
                        case -1045251044: {
                            v30 = hp.cbac("cbnb", cazz(int ), (int)171);
                            continue block121;
                        }
                        case 1050601319: {
                            break block121;
                        }
                    }
                    break;
                }
                this.predictor.reset();
                if (var1_3 || var1_3) ** GOTO lbl32
                v31 /* !! */  = hp.ff;
                if (true) ** GOTO lbl256
                block122: while (true) {
                    v31 /* !! */  = (long)(v32 - hp.cbac("cbnc", cazz(int ), (int)172));
lbl256:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -650862542: {
                            v32 = hp.cbac("cbnd", cazz(int ), (int)173);
                            continue block122;
                        }
                        case 1050601319: {
                            break block122;
                        }
                        case 1294535073: {
                            v32 = hp.cbac("cbne", cazz(int ), (int)174);
                            continue block122;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_11 = hp.ff - hp.cbac("cbnf", cazz(int ), (int)175)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == hp.cbac("cbng", cbah(int ), (int)161)) break;
                    v33 /* !! */  = (long)hp.cbac("cbnh", cbah(int ), (int)162);
                }
                ot.INSTANCE.clear();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("cbni", cbah(int ), (int)163);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("cbnj", cbah(int ), (int)164);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl372
            }
            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("cbnk", cbah(int ), (int)165);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl385
            }
lbl288:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)hp.cbac("cbnl", cbah(int ), (int)166);
                if (var3_1) {
                    throw null;
                }
            }
lbl292:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)hp.cbac("cbnm", cbah(int ), (int)167);
                if (!var3_1) ** GOTO lbl288
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hp.cbac("cbnn", cbah(int ), (int)168);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 6: {
                var2_2 /* !! */  = (int)hp.cbac("cbno", cbah(int ), (int)169);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl306:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)hp.cbac("cbnp", cbah(int ), (int)170);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 8: {
                var2_2 /* !! */  = (int)hp.cbac("cbnq", cbah(int ), (int)171);
                if (!var3_1) ** GOTO lbl288
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)hp.cbac("cbnr", cbah(int ), (int)172);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl330
            }
            case 10: {
                var2_2 /* !! */  = (int)hp.cbac("cbns", cbah(int ), (int)173);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl325:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hp.cbac("cbnt", cbah(int ), (int)174);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl330:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)hp.cbac("cbnu", cbah(int ), (int)175);
                if (var3_1) {
                    throw null;
                }
            }
lbl334:
            // 4 sources

            case 13: {
                var2_2 /* !! */  = (int)hp.cbac("cbnv", cbah(int ), (int)176);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl372
            }
            case 14: {
                var2_2 /* !! */  = (int)hp.cbac("cbnw", cbah(int ), (int)177);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl344:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)hp.cbac("cbnx", cbah(int ), (int)178);
                if (!var3_1) ** GOTO lbl325
                throw null;
            }
lbl348:
            // 3 sources

            case 16: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("cbny", cbah(int ), (int)179);
                } while (!var3_1);
                throw null;
            }
lbl353:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)hp.cbac("cbnz", cbah(int ), (int)180);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl385
            }
            case 18: {
                var2_2 /* !! */  = (int)hp.cbac("cboa", cbah(int ), (int)181);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 19: {
                var2_2 /* !! */  = (int)hp.cbac("cbob", cbah(int ), (int)182);
                if (!var3_1) ** GOTO lbl334
                throw null;
            }
lbl367:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)hp.cbac("cboc", cbah(int ), (int)183);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl372:
            // 3 sources

            case 21: {
                var2_2 /* !! */  = (int)hp.cbac("cbod", cbah(int ), (int)184);
                if (!var3_1) ** GOTO lbl292
                throw null;
            }
            case 22: {
                var2_2 /* !! */  = (int)hp.cbac("cboe", cbah(int ), (int)185);
                if (!var3_1) ** GOTO lbl353
                throw null;
            }
lbl380:
            // 2 sources

            case 23: {
                var2_2 /* !! */  = (int)hp.cbac("cbof", cbah(int ), (int)186);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl385:
            // 3 sources

            case 24: {
                var2_2 /* !! */  = (int)hp.cbac("cbog", cbah(int ), (int)187);
                if (!var3_1) ** GOTO lbl344
                throw null;
            }
lbl389:
            // 4 sources

            case 25: {
                var2_2 /* !! */  = (int)hp.cbac("cboh", cbah(int ), (int)188);
                if (!var3_1) ** GOTO lbl344
                throw null;
            }
lbl393:
            // 2 sources

            case 26: {
                var2_2 /* !! */  = (int)hp.cbac("cboi", cbah(int ), (int)189);
                if (!var3_1) ** GOTO lbl306
                throw null;
            }
            case 27: 
        }
        do {
            var2_2 /* !! */  = (int)hp.cbac("cboj", cbah(int ), (int)190);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ccvw() {
        hp.cbaj[300] = -901424513;
        hp.cbaj[301] = -1091217297;
        hp.cbaj[302] = -1835864563;
        hp.cbaj[303] = 1511691744;
        hp.cbaj[304] = 1992436674;
        hp.cbaj[305] = 688343800;
        hp.cbaj[306] = 130408035;
        hp.cbaj[307] = -1030659168;
        hp.cbaj[308] = -682161254;
        hp.cbaj[309] = 750399305;
        hp.cbaj[310] = -1619174832;
        hp.cbaj[311] = -2120251496;
        hp.cbaj[312] = -647198598;
        hp.cbaj[313] = 493070832;
        hp.cbaj[314] = 1623181799;
        hp.cbaj[315] = -1633643857;
        hp.cbaj[316] = 389257421;
        hp.cbaj[317] = 1854195524;
        hp.cbaj[318] = -628235738;
        hp.cbaj[319] = 1411605663;
        hp.cbaj[320] = -1879057625;
        hp.cbaj[321] = -1881798269;
        hp.cbaj[322] = -353828280;
        hp.cbaj[323] = 1726570679;
        hp.cbaj[324] = -1727453763;
        hp.cbaj[325] = 763606330;
        hp.cbaj[326] = 1766953559;
        hp.cbaj[327] = -820139300;
        hp.cbaj[328] = 1114773783;
        hp.cbaj[329] = 1907884009;
        hp.cbaj[330] = 1806972676;
        hp.cbaj[331] = -850087728;
        hp.cbaj[332] = 1612229123;
        hp.cbaj[333] = -431553306;
        hp.cbaj[334] = 1423306426;
        hp.cbaj[335] = 1462010806;
        hp.cbaj[336] = -1534011700;
        hp.cbaj[337] = 1412080769;
        hp.cbaj[338] = 867986416;
        hp.cbaj[339] = -1792358955;
        hp.cbaj[340] = -973538388;
        hp.cbaj[341] = -1464159896;
        hp.cbaj[342] = 1704018110;
        hp.cbaj[343] = 1851601052;
        hp.cbaj[344] = 727349886;
        hp.cbaj[345] = 1349521485;
        hp.cbaj[346] = -330059853;
        hp.cbaj[347] = -1899104539;
        hp.cbaj[348] = -851400265;
        hp.cbaj[349] = 987596669;
        hp.cbaj[350] = -1604632938;
        hp.cbaj[351] = -1608999747;
        hp.cbaj[352] = -1594930304;
        hp.cbaj[353] = -215342256;
        hp.cbaj[354] = 150372140;
        hp.cbaj[355] = 615259544;
        hp.cbaj[356] = -964568167;
        hp.cbaj[357] = -1494213861;
        hp.cbaj[358] = 919732265;
        hp.cbaj[359] = -453575010;
        hp.cbaj[360] = -1522332473;
        hp.cbaj[361] = 595438643;
        hp.cbaj[362] = -82769774;
        hp.cbaj[363] = 862607083;
        hp.cbaj[364] = -1578153267;
        hp.cbaj[365] = -1935408750;
        hp.cbaj[366] = -1931610568;
        hp.cbaj[367] = -1076246132;
        hp.cbaj[368] = -1313409269;
        hp.cbaj[369] = 1273565165;
        hp.cbaj[370] = -352712546;
        hp.cbaj[371] = -1870965446;
        hp.cbaj[372] = -1767922937;
        hp.cbaj[373] = -1126762882;
        hp.cbaj[374] = 1102093880;
        hp.cbaj[375] = -1631879529;
        hp.cbaj[376] = 847456093;
        hp.cbaj[377] = 1932000484;
        hp.cbaj[378] = 400369287;
        hp.cbaj[379] = -592225608;
        hp.cbaj[380] = 292861427;
        hp.cbaj[381] = -702936249;
        hp.cbaj[382] = 1754636645;
        hp.cbaj[383] = -1969865245;
        hp.cbaj[384] = 1764252528;
        hp.cbaj[385] = -859897665;
        hp.cbaj[386] = -1959968863;
        hp.cbaj[387] = -1132129639;
        hp.cbaj[388] = -1546869778;
        hp.cbaj[389] = 1418824694;
        hp.cbaj[390] = -93849394;
        hp.cbaj[391] = 2073140438;
        hp.cbaj[392] = 1468880621;
        hp.cbaj[393] = 904686091;
        hp.cbaj[394] = -972200;
        hp.cbaj[395] = 1486630294;
        hp.cbaj[396] = -202277237;
        hp.cbaj[397] = 192688057;
        hp.cbaj[398] = -1078684713;
        hp.cbaj[399] = -1453684069;
    }

    private static /* synthetic */ void ccwe() {
        hp.cbaa[400] = 6757201378080743294L;
        hp.cbaa[401] = 4892286169235056469L;
        hp.cbaa[402] = 6345168050602933933L;
        hp.cbaa[403] = 3165247958561322721L;
        hp.cbaa[404] = -1556547113654195137L;
        hp.cbaa[405] = -7666067394777880309L;
        hp.cbaa[406] = 9184154865212673428L;
        hp.cbaa[407] = -441680558507412875L;
        hp.cbaa[408] = 6247472985246217821L;
        hp.cbaa[409] = -430094566310833529L;
        hp.cbaa[410] = 5189563037487518627L;
        hp.cbaa[411] = 3074306603482016737L;
        hp.cbaa[412] = -5383918400346493928L;
        hp.cbaa[413] = -4390804126478435057L;
        hp.cbaa[414] = 835670005927012427L;
        hp.cbaa[415] = 1131564898726865100L;
        hp.cbaa[416] = 6511548271956983472L;
        hp.cbaa[417] = -7480475410544833142L;
        hp.cbaa[418] = -8748607692601597486L;
        hp.cbaa[419] = -394617534204609738L;
        hp.cbaa[420] = -6923137701598826126L;
        hp.cbaa[421] = -8702224780402849593L;
        hp.cbaa[422] = -5657865085263467438L;
        hp.cbaa[423] = -4503958434324936570L;
        hp.cbaa[424] = 8486867475653133411L;
        hp.cbaa[425] = 4610103301165117177L;
        hp.cbaa[426] = 7371957083146991063L;
        hp.cbaa[427] = 57187161057351962L;
        hp.cbaa[428] = -213927566790024916L;
        hp.cbaa[429] = 1708557791661162093L;
        hp.cbaa[430] = 3318162152253950294L;
        hp.cbaa[431] = -92289213451306642L;
        hp.cbaa[432] = -2425635776002900898L;
        hp.cbaa[433] = -715105764811374416L;
        hp.cbaa[434] = 1320174663993301196L;
        hp.cbaa[435] = 2506497462234913192L;
        hp.cbaa[436] = 8330276768194620559L;
        hp.cbaa[437] = 836108028855694864L;
        hp.cbaa[438] = -2703159014042408023L;
        hp.cbaa[439] = -5313839971762195550L;
        hp.cbaa[440] = -8070280830659500717L;
        hp.cbaa[441] = -9095937840104629064L;
        hp.cbaa[442] = 5344598354253994426L;
        hp.cbaa[443] = 6158767699284896437L;
        hp.cbaa[444] = -3153273322773103543L;
        hp.cbaa[445] = -3673413734876121299L;
        hp.cbaa[446] = 3629075788913147976L;
        hp.cbaa[447] = 6246911306356880482L;
        hp.cbaa[448] = 4609215517664995797L;
        hp.cbaa[449] = 8419560127941004428L;
        hp.cbaa[450] = 782719993263966118L;
        hp.cbaa[451] = 8416413631374598102L;
        hp.cbaa[452] = 3130001281932911345L;
        hp.cbaa[453] = -5499289914610759662L;
        hp.cbaa[454] = -3672785728194425082L;
        hp.cbaa[455] = 3569520713928008631L;
        hp.cbaa[456] = 6903215932145077565L;
        hp.cbaa[457] = -5498800540803165877L;
        hp.cbaa[458] = -3084797548706139449L;
        hp.cbaa[459] = -5350394312758287277L;
        hp.cbaa[460] = -8949965062237944956L;
        hp.cbaa[461] = -5412886656177683690L;
        hp.cbaa[462] = -7244915281471277635L;
        hp.cbaa[463] = 5099247881578678449L;
        hp.cbaa[464] = 5024208483078781080L;
        hp.cbaa[465] = -7896850837985919344L;
        hp.cbaa[466] = -7139507752323519384L;
        hp.cbaa[467] = 4512545285637388121L;
        hp.cbaa[468] = 2614501271286525683L;
        hp.cbaa[469] = 1931390003123390199L;
        hp.cbaa[470] = 566926141144427275L;
        hp.cbaa[471] = -7683695201104664166L;
        hp.cbaa[472] = -4315619505875234975L;
        hp.cbaa[473] = -3034534169781081430L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block70: {
            block69: {
                var4_2 = hp.c;
                var3_3 /* !! */  = hp.b;
                var2_4 = hp.a;
                if (var4_2) {
                    throw null;
lbl6:
                    // 19 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                if (hp.mc.field_1724 == null) break block69;
                if (var2_4) ** GOTO lbl6
                if (hp.mc.field_1687 != null) break block70;
                if (var2_4) ** GOTO lbl6
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            this.resetAllStates();
            if (var2_4 || var2_4) ** GOTO lbl6
            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (this.isSilentMode()) ** GOTO lbl29
        if (var2_4 || var2_4) ** GOTO lbl6
        this.armorSwapHandler.processLoop();
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** GOTO lbl6
                this.fireworkHandler.processLoop();
                if (var2_4) ** GOTO lbl6
lbl29:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (this.armorSwapHandler.isActive()) ** GOTO lbl34
                if (var2_4) ** GOTO lbl6
                if (!this.fireworkHandler.isActive()) ** GOTO lbl36
                if (var2_4) ** GOTO lbl6
lbl34:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                return;
lbl36:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                if (this.target == null) ** GOTO lbl41
                if (var2_4) ** GOTO lbl6
                if (this.target.method_5805()) ** GOTO lbl43
                if (var2_4) ** GOTO lbl6
lbl41:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                return;
lbl43:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl6
                this.processStage();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl48:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)hp.cbac("cbyx", cbah(int ), (int)314);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl53:
            // 2 sources

            case 1: {
                var3_3 /* !! */  = (int)hp.cbac("cbyy", cbah(int ), (int)315);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                var3_3 /* !! */  = (int)hp.cbac("cbyz", cbah(int ), (int)316);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
            case 3: {
                var3_3 /* !! */  = (int)hp.cbac("cbza", cbah(int ), (int)317);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
lbl67:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hp.cbac("cbzb", cbah(int ), (int)318);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl72:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hp.cbac("cbzc", cbah(int ), (int)319);
                if (var4_2) {
                    throw null;
                }
            }
            case 6: {
                var3_3 /* !! */  = (int)hp.cbac("cbzd", cbah(int ), (int)320);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl81:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)hp.cbac("cbze", cbah(int ), (int)321);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
            case 8: {
                var3_3 /* !! */  = (int)hp.cbac("cbzf", cbah(int ), (int)322);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
lbl90:
            // 4 sources

            case 9: {
                var3_3 /* !! */  = (int)hp.cbac("cbzg", cbah(int ), (int)323);
                if (!var4_2) ** GOTO lbl81
                throw null;
            }
lbl94:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)hp.cbac("cbzh", cbah(int ), (int)324);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
            case 11: {
                var3_3 /* !! */  = (int)hp.cbac("cbzi", cbah(int ), (int)325);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 12: {
                var3_3 /* !! */  = (int)hp.cbac("cbzj", cbah(int ), (int)326);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 13: {
                var3_3 /* !! */  = (int)hp.cbac("cbzk", cbah(int ), (int)327);
                if (!var4_2) ** GOTO lbl90
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)hp.cbac("cbzl", cbah(int ), (int)328);
                if (!var4_2) break;
                throw null;
            }
            case 15: {
                var3_3 /* !! */  = (int)hp.cbac("cbzm", cbah(int ), (int)329);
                if (!var4_2) ** GOTO lbl67
                throw null;
            }
lbl121:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)hp.cbac("cbzn", cbah(int ), (int)330);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl126:
            // 3 sources

            case 17: {
                var3_3 /* !! */  = (int)hp.cbac("cbzo", cbah(int ), (int)331);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)hp.cbac("cbzp", cbah(int ), (int)332);
                if (!var4_2) ** GOTO lbl90
                throw null;
            }
lbl134:
            // 3 sources

            case 19: {
                var3_3 /* !! */  = (int)hp.cbac("cbzq", cbah(int ), (int)333);
                if (!var4_2) ** GOTO lbl72
                throw null;
            }
lbl138:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)hp.cbac("cbzr", cbah(int ), (int)334);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl143:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)hp.cbac("cbzs", cbah(int ), (int)335);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 22: {
                var3_3 /* !! */  = (int)hp.cbac("cbzt", cbah(int ), (int)336);
                if (!var4_2) ** GOTO lbl48
                throw null;
            }
lbl152:
            // 3 sources

            case 23: {
                var3_3 /* !! */  = (int)hp.cbac("cbzu", cbah(int ), (int)337);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
lbl156:
            // 2 sources

            case 24: {
                var3_3 /* !! */  = (int)hp.cbac("cbzv", cbah(int ), (int)338);
                if (!var4_2) break;
                throw null;
            }
lbl160:
            // 2 sources

            case 25: {
                var3_3 /* !! */  = (int)hp.cbac("cbzw", cbah(int ), (int)339);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 26: {
                var3_3 /* !! */  = (int)hp.cbac("cbzx", cbah(int ), (int)340);
                if (!var4_2) ** GOTO lbl126
                throw null;
            }
lbl168:
            // 2 sources

            case 27: {
                var3_3 /* !! */  = (int)hp.cbac("cbzy", cbah(int ), (int)341);
                if (var4_2) {
                    throw null;
                }
            }
            case 28: {
                var3_3 /* !! */  = (int)hp.cbac("cbzz", cbah(int ), (int)342);
                if (!var4_2) ** GOTO lbl121
                throw null;
            }
lbl176:
            // 2 sources

            case 29: {
                var3_3 /* !! */  = (int)hp.cbac("ccaa", cbah(int ), (int)343);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hp.cbac("ccab", cbah(int ), (int)344);
                    if (!var4_2) ** GOTO lbl138
                    throw null;
                }
            }
lbl186:
            // 2 sources

            case 31: {
                var3_3 /* !! */  = (int)hp.cbac("ccac", cbah(int ), (int)345);
                if (!var4_2) ** GOTO lbl143
                throw null;
            }
lbl190:
            // 3 sources

            case 32: {
                var3_3 /* !! */  = (int)hp.cbac("ccad", cbah(int ), (int)346);
                if (!var4_2) ** GOTO lbl186
                throw null;
            }
lbl194:
            // 3 sources

            case 33: {
                var3_3 /* !! */  = (int)hp.cbac("ccae", cbah(int ), (int)347);
                if (!var4_2) ** GOTO lbl168
                throw null;
            }
            case 34: 
        }
        var3_3 /* !! */  = (int)hp.cbac("ccaf", cbah(int ), (int)348);
        ** while (!var4_2)
lbl201:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void handlePostRotation() {
        block82: {
            block81: {
                block80: {
                    block79: {
                        block78: {
                            var3_1 = hp.c;
                            var2_2 /* !! */  = hp.b;
                            var1_3 = hp.a;
                            if (var3_1) {
                                throw null;
lbl6:
                                // 23 sources

                                return;
                            }
                            if (var1_3 || var1_3) ** GOTO lbl6
                            if (this.target == null) break block78;
                            if (var1_3) ** GOTO lbl6
                            if (this.target.method_5805()) break block79;
                            if (var1_3) ** GOTO lbl6
                        }
                        if (var1_3 || var1_3) ** GOTO lbl6
                        return;
                    }
                    if (var1_3 || var1_3) ** GOTO lbl6
                    if (this.stageHandler.getStage() == it$Stage.ATTACKING) break block80;
                    if (var1_3) ** GOTO lbl6
                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl6
                if (this.armorSwapHandler.isActive()) break block81;
                if (var1_3) ** GOTO lbl6
                if (!this.fireworkHandler.isActive()) break block82;
                if (var1_3) ** GOTO lbl6
            }
            if (var1_3 || var1_3) ** GOTO lbl6
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl6
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!nv.hasElytra()) ** GOTO lbl40
                if (var1_3) ** GOTO lbl6
                if (!hp.mc.field_1724.method_6128()) ** GOTO lbl40
                if (var1_3) ** GOTO lbl6
                return;
lbl40:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl6
                if (this.attackHandler.shouldAttack(this.target)) ** GOTO lbl44
                if (var1_3) ** GOTO lbl6
                return;
lbl44:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl6
                this.attackHandler.performAttack(this.target);
                if (var1_3 || var1_3) ** GOTO lbl6
                if (!this.isReallyWorldMode()) ** GOTO lbl54
                if (var1_3 || var1_3) ** GOTO lbl6
                this.setState((boolean)hp.cbac("cbxh", cbah(int ), (int)272));
                if (var1_3) ** GOTO lbl6
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl59
lbl54:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl6
                this.stageHandler.setStage(it$Stage.FLYING_UP);
                if (var1_3 || var1_3) ** GOTO lbl6
                this.fireworkTimer.reset();
                if (var1_3) ** GOTO lbl6
lbl59:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl62:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("cbxi", cbah(int ), (int)273);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl67:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("cbxj", cbah(int ), (int)274);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl72:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("cbxk", cbah(int ), (int)275);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl137
            }
lbl77:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hp.cbac("cbxl", cbah(int ), (int)276);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl82:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)hp.cbac("cbxm", cbah(int ), (int)277);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl87:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)hp.cbac("cbxn", cbah(int ), (int)278);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)hp.cbac("cbxo", cbah(int ), (int)279);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl96:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)hp.cbac("cbxp", cbah(int ), (int)280);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl101:
            // 4 sources

            case 8: {
                var2_2 /* !! */  = (int)hp.cbac("cbxq", cbah(int ), (int)281);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 9: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("cbxr", cbah(int ), (int)282);
                } while (!var3_1);
                throw null;
            }
lbl111:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hp.cbac("cbxs", cbah(int ), (int)283);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl116:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)hp.cbac("cbxt", cbah(int ), (int)284);
                if (!var3_1) ** GOTO lbl77
                throw null;
            }
lbl120:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)hp.cbac("cbxu", cbah(int ), (int)285);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl125:
            // 4 sources

            case 13: {
                var2_2 /* !! */  = (int)hp.cbac("cbxv", cbah(int ), (int)286);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
lbl129:
            // 4 sources

            case 14: {
                var2_2 /* !! */  = (int)hp.cbac("cbxw", cbah(int ), (int)287);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
lbl133:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)hp.cbac("cbxx", cbah(int ), (int)288);
                if (!var3_1) ** GOTO lbl111
                throw null;
            }
lbl137:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)hp.cbac("cbxy", cbah(int ), (int)289);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl180
            }
lbl142:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)hp.cbac("cbxz", cbah(int ), (int)290);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl168
            }
            case 18: {
                var2_2 /* !! */  = (int)hp.cbac("cbya", cbah(int ), (int)291);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)hp.cbac("cbyb", cbah(int ), (int)292);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)hp.cbac("cbyc", cbah(int ), (int)293);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl160:
            // 2 sources

            case 21: {
                var2_2 /* !! */  = (int)hp.cbac("cbyd", cbah(int ), (int)294);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
            case 22: {
                var2_2 /* !! */  = (int)hp.cbac("cbye", cbah(int ), (int)295);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
lbl168:
            // 4 sources

            case 23: {
                var2_2 /* !! */  = (int)hp.cbac("cbyf", cbah(int ), (int)296);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
lbl172:
            // 2 sources

            case 24: {
                var2_2 /* !! */  = (int)hp.cbac("cbyg", cbah(int ), (int)297);
                if (!var3_1) ** GOTO lbl67
                throw null;
            }
            case 25: {
                var2_2 /* !! */  = (int)hp.cbac("cbyh", cbah(int ), (int)298);
                if (!var3_1) ** GOTO lbl82
                throw null;
            }
lbl180:
            // 3 sources

            case 26: {
                var2_2 /* !! */  = (int)hp.cbac("cbyi", cbah(int ), (int)299);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 27: {
                var2_2 /* !! */  = (int)hp.cbac("cbyj", cbah(int ), (int)300);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
lbl189:
            // 2 sources

            case 28: {
                var2_2 /* !! */  = (int)hp.cbac("cbyk", cbah(int ), (int)301);
                if (!var3_1) ** GOTO lbl120
                throw null;
            }
            case 29: {
                var2_2 /* !! */  = (int)hp.cbac("cbyl", cbah(int ), (int)302);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
            case 30: {
                var2_2 /* !! */  = (int)hp.cbac("cbym", cbah(int ), (int)303);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
lbl201:
            // 2 sources

            case 31: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hp.cbac("cbyn", cbah(int ), (int)304);
                    if (!var3_1) ** GOTO lbl168
                    throw null;
                }
            }
lbl206:
            // 2 sources

            case 32: {
                var2_2 /* !! */  = (int)hp.cbac("cbyo", cbah(int ), (int)305);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
lbl210:
            // 2 sources

            case 33: {
                var2_2 /* !! */  = (int)hp.cbac("cbyp", cbah(int ), (int)306);
                if (!var3_1) ** GOTO lbl72
                throw null;
            }
            case 34: {
                var2_2 /* !! */  = (int)hp.cbac("cbyq", cbah(int ), (int)307);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
lbl218:
            // 2 sources

            case 35: {
                var2_2 /* !! */  = (int)hp.cbac("cbyr", cbah(int ), (int)308);
                if (!var3_1) ** GOTO lbl168
                throw null;
            }
            case 36: {
                var2_2 /* !! */  = (int)hp.cbac("cbys", cbah(int ), (int)309);
                if (!var3_1) ** GOTO lbl87
                throw null;
            }
            case 37: {
                var2_2 /* !! */  = (int)hp.cbac("cbyt", cbah(int ), (int)310);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
lbl230:
            // 2 sources

            case 38: {
                var2_2 /* !! */  = (int)hp.cbac("cbyu", cbah(int ), (int)311);
                if (!var3_1) ** GOTO lbl160
                throw null;
            }
            case 39: {
                var2_2 /* !! */  = (int)hp.cbac("cbyv", cbah(int ), (int)312);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
            case 40: 
        }
        var2_2 /* !! */  = (int)hp.cbac("cbyw", cbah(int ), (int)313);
        ** while (!var3_1)
lbl241:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void findTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccez", cazz(int ), (int)238)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hp.cbac("ccfa", cbah(int ), (int)422)) break;
            v0 /* !! */  = (long)hp.cbac("ccfb", cbah(int ), (int)423);
        }
        var4_1 = hp.c;
        v1 /* !! */  = hp.ff;
        if (true) ** GOTO lbl11
        block66: while (true) {
            v1 /* !! */  = (long)(hp.cbac("ccfd", cazz(int ), (int)240) - hp.cbac("ccfc", cazz(int ), (int)239));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2037954913: {
                    continue block66;
                }
                case 1050601319: {
                    break block66;
                }
            }
            break;
        }
        var3_2 /* !! */  = hp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccfe", cazz(int ), (int)241)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hp.cbac("ccff", cbah(int ), (int)424)) break;
            v2 /* !! */  = (long)hp.cbac("ccfg", cbah(int ), (int)425);
        }
        var2_3 = hp.a;
        if (var4_1) {
            throw null;
lbl25:
            // 6 sources

            return;
        }
        if (var2_3) ** GOTO lbl25
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl25
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccfh", cazz(int ), (int)242)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == hp.cbac("ccfi", cbah(int ), (int)426)) break;
                    v3 /* !! */  = (long)hp.cbac("ccfj", cbah(int ), (int)427);
                }
                v4 /* !! */  = hp.ff;
                if (true) ** GOTO lbl41
                block70: while (true) {
                    v4 /* !! */  = (long)(v5 - hp.cbac("ccfk", cazz(int ), (int)243));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -582840348: {
                            v5 = hp.cbac("ccfl", cazz(int ), (int)244);
                            continue block70;
                        }
                        case -75260649: {
                            v5 = hp.cbac("ccfm", cazz(int ), (int)245);
                            continue block70;
                        }
                        case 1050601319: {
                            break block70;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = hp.ff - hp.cbac("ccfn", cazz(int ), (int)246)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hp.cbac("ccfo", cbah(int ), (int)428)) break;
                    v6 /* !! */  = (long)hp.cbac("ccfp", cbah(int ), (int)429);
                }
                v7 = this.targetType.getSelected();
                v8 /* !! */  = hp.ff;
                if (true) ** GOTO lbl60
                block72: while (true) {
                    v8 /* !! */  = (long)(v9 - hp.cbac("ccfq", cazz(int ), (int)247));
lbl60:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 682492978: {
                            v9 = hp.cbac("ccfr", cazz(int ), (int)248);
                            continue block72;
                        }
                        case 1050601319: {
                            break block72;
                        }
                        case 1527327838: {
                            v9 = hp.cbac("ccfs", cazz(int ), (int)249);
                            continue block72;
                        }
                        case 1565764388: {
                            v9 = hp.cbac("ccft", cazz(int ), (int)250);
                            continue block72;
                        }
                    }
                    break;
                }
                var1_4 = new ik$EntityFilter(v7);
                if (var2_3 || var2_3) ** GOTO lbl25
                v10 /* !! */  = hp.ff;
                if (true) ** GOTO lbl78
                block73: while (true) {
                    v10 /* !! */  = (long)(v11 - hp.cbac("ccfu", cazz(int ), (int)251));
lbl78:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -20743756: {
                            v11 = hp.cbac("ccfv", cazz(int ), (int)252);
                            continue block73;
                        }
                        case 1050601319: {
                            break block73;
                        }
                        case 1497733847: {
                            v11 = hp.cbac("ccfw", cazz(int ), (int)253);
                            continue block73;
                        }
                        case 2100157629: {
                            v11 = hp.cbac("ccfx", cazz(int ), (int)254);
                            continue block73;
                        }
                    }
                    break;
                }
                v12 /* !! */  = hp.ff;
                if (true) ** GOTO lbl94
                block74: while (true) {
                    v12 /* !! */  = (long)(hp.cbac("ccfz", cazz(int ), (int)256) - hp.cbac("ccfy", cazz(int ), (int)255));
lbl94:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 801840370: {
                            continue block74;
                        }
                        case 1050601319: {
                            break block74;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = hp.ff - hp.cbac("ccga", cazz(int ), (int)257)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hp.cbac("ccgb", cbah(int ), (int)430)) break;
                    v13 /* !! */  = (long)hp.cbac("ccgc", cbah(int ), (int)431);
                }
                v14 = hp.mc.field_1687;
                v15 /* !! */  = hp.ff;
                if (true) ** GOTO lbl109
                block76: while (true) {
                    v15 /* !! */  = (long)(v16 - hp.cbac("ccgd", cazz(int ), (int)258));
lbl109:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -116670558: {
                            v16 = hp.cbac("ccge", cazz(int ), (int)259);
                            continue block76;
                        }
                        case 218248892: {
                            v16 = hp.cbac("ccgf", cazz(int ), (int)260);
                            continue block76;
                        }
                        case 1050601319: {
                            break block76;
                        }
                    }
                    break;
                }
                v17 = v14.method_18112();
                v18 = hp.cbac("ccgg", cbax(int ), (int)432);
                v19 = hp.cbac("ccgh", cbax(int ), (int)433);
                v20 = hp.cbac("ccgi", cbah(int ), (int)434);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = hp.ff - hp.cbac("ccgj", cazz(int ), (int)261)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == hp.cbac("ccgk", cbah(int ), (int)435)) break;
                    v21 /* !! */  = (long)hp.cbac("ccgl", cbah(int ), (int)436);
                }
                this.targetFinder.searchTargets(v17, (float)v18, (float)v19, (boolean)v20);
                if (var2_3 || var2_3) ** GOTO lbl25
                v22 /* !! */  = hp.ff;
                if (true) ** GOTO lbl133
                block78: while (true) {
                    v22 /* !! */  = (long)(v23 - hp.cbac("ccgm", cazz(int ), (int)262));
lbl133:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1313326376: {
                            v23 = hp.cbac("ccgn", cazz(int ), (int)263);
                            continue block78;
                        }
                        case 104774085: {
                            v23 = hp.cbac("ccgo", cazz(int ), (int)264);
                            continue block78;
                        }
                        case 1050601319: {
                            break block78;
                        }
                    }
                    break;
                }
                v24 = var1_4;
                v25 /* !! */  = hp.ff;
                if (true) ** GOTO lbl147
                block79: while (true) {
                    v25 /* !! */  = (long)(v26 - hp.cbac("ccgp", cazz(int ), (int)265));
lbl147:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -2079884050: {
                            v26 = hp.cbac("ccgq", cazz(int ), (int)266);
                            continue block79;
                        }
                        case 1050601319: {
                            break block79;
                        }
                        case 2128874383: {
                            v26 = hp.cbac("ccgr", cazz(int ), (int)267);
                            continue block79;
                        }
                    }
                    break;
                }
                Objects.requireNonNull(v24);
                while (true) {
                    if ((v27 /* !! */  = (cfr_temp_6 = hp.ff - hp.cbac("ccgs", cazz(int ), (int)268)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v27 /* !! */  == hp.cbac("ccgt", cbah(int ), (int)437)) break;
                    v27 /* !! */  = (long)hp.cbac("ccgu", cbah(int ), (int)438);
                }
                v28 = (Predicate<class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isValid(net.minecraft.class_1309 ), (Lnet/minecraft/class_1309;)Z)((ik$EntityFilter)v24);
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_7 = hp.ff - hp.cbac("ccgv", cazz(int ), (int)269)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == hp.cbac("ccgw", cbah(int ), (int)439)) break;
                    v29 /* !! */  = (long)hp.cbac("ccgx", cbah(int ), (int)440);
                }
                this.targetFinder.validateTarget(v28);
                if (var2_3 || var2_3) ** GOTO lbl25
                v30 /* !! */  = hp.ff;
                if (true) ** GOTO lbl175
                block82: while (true) {
                    v30 /* !! */  = (long)(v31 - hp.cbac("ccgy", cazz(int ), (int)270));
lbl175:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1272422340: {
                            v31 = hp.cbac("ccgz", cazz(int ), (int)271);
                            continue block82;
                        }
                        case 92337360: {
                            v31 = hp.cbac("ccha", cazz(int ), (int)272);
                            continue block82;
                        }
                        case 763034613: {
                            v31 = hp.cbac("cchb", cazz(int ), (int)273);
                            continue block82;
                        }
                        case 1050601319: {
                            break block82;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_8 = hp.ff - hp.cbac("cchc", cazz(int ), (int)274)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == hp.cbac("cchd", cbah(int ), (int)441)) break;
                    v32 /* !! */  = (long)hp.cbac("cche", cbah(int ), (int)442);
                }
                v33 = this.targetFinder.getCurrentTarget();
                v34 /* !! */  = hp.ff;
                if (true) ** GOTO lbl197
                block84: while (true) {
                    v34 /* !! */  = (long)(v35 - hp.cbac("cchf", cazz(int ), (int)275));
lbl197:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case 748548546: {
                            v35 = hp.cbac("cchg", cazz(int ), (int)276);
                            continue block84;
                        }
                        case 1050601319: {
                            break block84;
                        }
                        case 2112941195: {
                            v35 = hp.cbac("cchh", cazz(int ), (int)277);
                            continue block84;
                        }
                    }
                    break;
                }
                this.target = v33;
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl210:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)hp.cbac("cchi", cbah(int ), (int)443);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl219
            }
            case 1: {
                var3_2 /* !! */  = (int)hp.cbac("cchj", cbah(int ), (int)444);
                if (!var4_1) ** GOTO lbl210
                throw null;
            }
lbl219:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)hp.cbac("cchk", cbah(int ), (int)445);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl224:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)hp.cbac("cchl", cbah(int ), (int)446);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 4: {
                var3_2 /* !! */  = (int)hp.cbac("cchm", cbah(int ), (int)447);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 5: {
                do {
                    var3_2 /* !! */  = (int)hp.cbac("cchn", cbah(int ), (int)448);
                } while (!var4_1);
                throw null;
            }
lbl239:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)hp.cbac("ccho", cbah(int ), (int)449);
                if (!var4_1) ** GOTO lbl210
                throw null;
            }
            case 7: {
                do {
                    var3_2 /* !! */  = (int)hp.cbac("cchp", cbah(int ), (int)450);
                } while (!var4_1);
                throw null;
            }
lbl248:
            // 2 sources

            case 8: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)hp.cbac("cchq", cbah(int ), (int)451);
                    if (!var4_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl253:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)hp.cbac("cchr", cbah(int ), (int)452);
                if (!var4_1) ** GOTO lbl224
                throw null;
            }
lbl257:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)hp.cbac("cchs", cbah(int ), (int)453);
                if (!var4_1) ** GOTO lbl239
                throw null;
            }
            case 11: 
        }
        var3_2 /* !! */  = (int)hp.cbac("ccht", cbah(int ), (int)454);
        ** while (!var4_1)
lbl264:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getServerMode() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("ccmi", cazz(int ), (int)352));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1216658745: {
                    v1 = hp.cbac("ccmj", cazz(int ), (int)353);
                    continue block25;
                }
                case -689950839: {
                    v1 = hp.cbac("ccmk", cazz(int ), (int)354);
                    continue block25;
                }
                case 1050601319: {
                    break block25;
                }
            }
            break;
        }
        var3_1 = hp.c;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl19
        block26: while (true) {
            v2 /* !! */  = (long)(hp.cbac("ccmm", cazz(int ), (int)356) - hp.cbac("ccml", cazz(int ), (int)355));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1181996824: {
                    continue block26;
                }
                case 1050601319: {
                    break block26;
                }
            }
            break;
        }
        var2_2 /* !! */  = hp.b;
        v3 /* !! */  = hp.ff;
        if (true) ** GOTO lbl29
        block27: while (true) {
            v3 /* !! */  = (long)(hp.cbac("ccmo", cazz(int ), (int)358) - hp.cbac("ccmn", cazz(int ), (int)357));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1522981651: {
                    continue block27;
                }
                case 1050601319: {
                    break block27;
                }
            }
            break;
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = hp.ff;
                if (true) ** GOTO lbl48
                block29: while (true) {
                    v4 /* !! */  = (long)(v5 - hp.cbac("ccmp", cazz(int ), (int)359));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -516443865: {
                            v5 = hp.cbac("ccmq", cazz(int ), (int)360);
                            continue block29;
                        }
                        case 949827565: {
                            v5 = hp.cbac("ccmr", cazz(int ), (int)361);
                            continue block29;
                        }
                        case 1050601319: {
                            break block29;
                        }
                        case 2013611554: {
                            v5 = hp.cbac("ccms", cazz(int ), (int)362);
                            continue block29;
                        }
                    }
                    break;
                }
                return this.serverMode;
            }
            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("ccmt", cbah(int ), (int)499);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl70
            }
            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("ccmu", cbah(int ), (int)500);
                if (var3_1) {
                    throw null;
                }
            }
lbl70:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("ccmv", cbah(int ), (int)501);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hp.cbac("ccmw", cbah(int ), (int)502);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ccvu() {
        hp.cbaj[100] = 1139393986;
        hp.cbaj[101] = -716308632;
        hp.cbaj[102] = 1023747571;
        hp.cbaj[103] = -1348101260;
        hp.cbaj[104] = 1798599538;
        hp.cbaj[105] = 743549733;
        hp.cbaj[106] = -1777220299;
        hp.cbaj[107] = -1932592368;
        hp.cbaj[108] = -1192524515;
        hp.cbaj[109] = 1487413327;
        hp.cbaj[110] = 279347712;
        hp.cbaj[111] = -1646438816;
        hp.cbaj[112] = 528630204;
        hp.cbaj[113] = -497952947;
        hp.cbaj[114] = 789045391;
        hp.cbaj[115] = 1260071522;
        hp.cbaj[116] = -112815682;
        hp.cbaj[117] = 1386548441;
        hp.cbaj[118] = 1545687417;
        hp.cbaj[119] = 1656304675;
        hp.cbaj[120] = 400916851;
        hp.cbaj[121] = -910830;
        hp.cbaj[122] = 1413142673;
        hp.cbaj[123] = -1013566040;
        hp.cbaj[124] = 196921596;
        hp.cbaj[125] = -1413972518;
        hp.cbaj[126] = 1434875290;
        hp.cbaj[127] = -1514232354;
        hp.cbaj[128] = 297036056;
        hp.cbaj[129] = 1239008813;
        hp.cbaj[130] = -30939230;
        hp.cbaj[131] = 700028106;
        hp.cbaj[132] = 2101401785;
        hp.cbaj[133] = -616743818;
        hp.cbaj[134] = -930290784;
        hp.cbaj[135] = 348114629;
        hp.cbaj[136] = 1575120945;
        hp.cbaj[137] = -1146899666;
        hp.cbaj[138] = 1133004572;
        hp.cbaj[139] = -645719624;
        hp.cbaj[140] = -1491138703;
        hp.cbaj[141] = -1115708492;
        hp.cbaj[142] = -1819634749;
        hp.cbaj[143] = 1215069725;
        hp.cbaj[144] = 1414926751;
        hp.cbaj[145] = 323404670;
        hp.cbaj[146] = -896766054;
        hp.cbaj[147] = -794504379;
        hp.cbaj[148] = -279877379;
        hp.cbaj[149] = 268145335;
        hp.cbaj[150] = 525708700;
        hp.cbaj[151] = 29029635;
        hp.cbaj[152] = 1399673567;
        hp.cbaj[153] = -744032713;
        hp.cbaj[154] = 1039033538;
        hp.cbaj[155] = -1195974149;
        hp.cbaj[156] = 1017645397;
        hp.cbaj[157] = -1260273968;
        hp.cbaj[158] = 1496926911;
        hp.cbaj[159] = -1866312880;
        hp.cbaj[160] = -1279637003;
        hp.cbaj[161] = -1456358827;
        hp.cbaj[162] = 1043010794;
        hp.cbaj[163] = -37252515;
        hp.cbaj[164] = 669351722;
        hp.cbaj[165] = 494992823;
        hp.cbaj[166] = -2007665654;
        hp.cbaj[167] = 729576295;
        hp.cbaj[168] = -1515585922;
        hp.cbaj[169] = 1017927707;
        hp.cbaj[170] = 364165741;
        hp.cbaj[171] = -1760712480;
        hp.cbaj[172] = 1652942100;
        hp.cbaj[173] = -1753532638;
        hp.cbaj[174] = -1877038066;
        hp.cbaj[175] = 935658058;
        hp.cbaj[176] = -141167794;
        hp.cbaj[177] = -314550862;
        hp.cbaj[178] = -2034927712;
        hp.cbaj[179] = 451646932;
        hp.cbaj[180] = 2071052899;
        hp.cbaj[181] = -1721948715;
        hp.cbaj[182] = 1982768285;
        hp.cbaj[183] = 1985156829;
        hp.cbaj[184] = 68170390;
        hp.cbaj[185] = -864586528;
        hp.cbaj[186] = -548254050;
        hp.cbaj[187] = 356487354;
        hp.cbaj[188] = 684198059;
        hp.cbaj[189] = 857910743;
        hp.cbaj[190] = 987906541;
        hp.cbaj[191] = 879800486;
        hp.cbaj[192] = 822876725;
        hp.cbaj[193] = 586251838;
        hp.cbaj[194] = 29085039;
        hp.cbaj[195] = -1514517911;
        hp.cbaj[196] = -1649407401;
        hp.cbaj[197] = -288794650;
        hp.cbaj[198] = 266620209;
        hp.cbaj[199] = -1090367157;
    }

    private static /* synthetic */ long cazz(int n2) {
        return cbaa[n2] ^ cbab[n2];
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public kg getHeight() {
        block29: {
            while (true) {
                block28: {
                    if ((v0 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccnn", cazz(int ), (int)367)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v0 /* !! */  != hp.cbac("ccno", cbah(int ), (int)515)) break block28;
                    var3_1 = hp.c;
                    v1 /* !! */  = hp.ff;
                    if (true) ** GOTO lbl13
                }
                v0 /* !! */  = (long)hp.cbac("ccnp", cbah(int ), (int)516);
            }
            block16: while (true) {
                v1 /* !! */  = (long)(v2 - hp.cbac("ccnq", cazz(int ), (int)368));
lbl13:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -2020453913: {
                        v2 = hp.cbac("ccnr", cazz(int ), (int)369);
                        continue block16;
                    }
                    case -436417681: {
                        v2 = hp.cbac("ccns", cazz(int ), (int)370);
                        continue block16;
                    }
                    case 1050601319: {
                        break block16;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hp.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccnt", cazz(int ), (int)371)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v3 /* !! */  == hp.cbac("ccnu", cbah(int ), (int)517)) {
                    var1_3 = hp.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v3 /* !! */  = (long)hp.cbac("ccnv", cbah(int ), (int)518);
            }
            if (var1_3 || var1_3) break block29;
            v4 /* !! */  = hp.ff;
            ** GOTO lbl43
        }
        if (var2_2 /* !! */  == 0) return null;
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: {
                    return null;
                }
lbl43:
                // 1 sources

                block19: while (true) {
                    switch ((int)v4 /* !! */ ) {
                        case 922762315: {
                            v4 /* !! */  = (long)(hp.cbac("ccnx", cazz(int ), (int)373) - hp.cbac("ccnw", cazz(int ), (int)372));
                            continue block19;
                        }
                        case 1050601319: {
                            return this.height;
                        }
                    }
                    break;
                }
                return this.height;
                case 3: {
                    var2_2 /* !! */  = (int)hp.cbac("ccob", cbah(int ), (int)522);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: {
                    var2_2 /* !! */  = (int)hp.cbac("ccny", cbah(int ), (int)519);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hp.cbac("ccnz", cbah(int ), (int)520);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            break;
        }
        if (true) ** GOTO lbl68
        do {
            if (true) ** continue;
lbl68:
            // 2 sources

            var2_2 /* !! */  = (int)hp.cbac("ccoa", cbah(int ), (int)521);
            cfr_temp_0 = 0;
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ccwa() {
        hp.cbaa[0] = 6750585669293137669L;
        hp.cbaa[1] = -2333965284255532805L;
        hp.cbaa[2] = 8403846537876213073L;
        hp.cbaa[3] = -3720263083166891308L;
        hp.cbaa[4] = -6162751269601518447L;
        hp.cbaa[5] = 7179252120840441913L;
        hp.cbaa[6] = -6156586010828378614L;
        hp.cbaa[7] = -7913915615822878217L;
        hp.cbaa[8] = 3485644542849919246L;
        hp.cbaa[9] = -5723515840926323139L;
        hp.cbaa[10] = -4448764977359790421L;
        hp.cbaa[11] = 5901030544418580394L;
        hp.cbaa[12] = 3362420672209655549L;
        hp.cbaa[13] = 1801842978254205817L;
        hp.cbaa[14] = 1653201392888156718L;
        hp.cbaa[15] = -7454314798533862395L;
        hp.cbaa[16] = 4520768400558806366L;
        hp.cbaa[17] = -658439482059321362L;
        hp.cbaa[18] = -389893895818444658L;
        hp.cbaa[19] = -6812889925819475889L;
        hp.cbaa[20] = -7885076374343011691L;
        hp.cbaa[21] = 5856387416928419661L;
        hp.cbaa[22] = 5538447918340910002L;
        hp.cbaa[23] = 2539531134389152720L;
        hp.cbaa[24] = -5591923684383147770L;
        hp.cbaa[25] = -261696620643877487L;
        hp.cbaa[26] = 1247433390792316538L;
        hp.cbaa[27] = -4524550149674931527L;
        hp.cbaa[28] = -7943809868367058508L;
        hp.cbaa[29] = 1082637585366174547L;
        hp.cbaa[30] = -3940333192236133697L;
        hp.cbaa[31] = 5519276747105125851L;
        hp.cbaa[32] = 5327630610881217351L;
        hp.cbaa[33] = -2565800380365094355L;
        hp.cbaa[34] = -6483296394139094635L;
        hp.cbaa[35] = -6338462030217202663L;
        hp.cbaa[36] = 8707908506797753416L;
        hp.cbaa[37] = -2643310276477054952L;
        hp.cbaa[38] = -5749317027492036808L;
        hp.cbaa[39] = -3871546958393856135L;
        hp.cbaa[40] = -9016170635926816327L;
        hp.cbaa[41] = -40126379671600334L;
        hp.cbaa[42] = 3998586411647626962L;
        hp.cbaa[43] = -4153909741185780736L;
        hp.cbaa[44] = 3758270711052434761L;
        hp.cbaa[45] = -2673655608172066210L;
        hp.cbaa[46] = 1417198802678303094L;
        hp.cbaa[47] = 7568427115754160360L;
        hp.cbaa[48] = 5742916968038394431L;
        hp.cbaa[49] = 4743645951375552L;
        hp.cbaa[50] = 6795073049716951796L;
        hp.cbaa[51] = -5822558171364700701L;
        hp.cbaa[52] = -1280384843291907187L;
        hp.cbaa[53] = -9142842950116988129L;
        hp.cbaa[54] = 4816826866120706069L;
        hp.cbaa[55] = -2746215779235612757L;
        hp.cbaa[56] = 4354447393260472929L;
        hp.cbaa[57] = -4538767184857385532L;
        hp.cbaa[58] = 8596755405689594234L;
        hp.cbaa[59] = -7250009138115463740L;
        hp.cbaa[60] = -6863051018080566571L;
        hp.cbaa[61] = -6520206184445562798L;
        hp.cbaa[62] = 5507320175811713585L;
        hp.cbaa[63] = 7051372384951095480L;
        hp.cbaa[64] = 3761809205321701490L;
        hp.cbaa[65] = 377357416194573360L;
        hp.cbaa[66] = 1698823354329268388L;
        hp.cbaa[67] = -197501312095410931L;
        hp.cbaa[68] = 5621173638909909264L;
        hp.cbaa[69] = 6510204668990886625L;
        hp.cbaa[70] = 7939192851945200929L;
        hp.cbaa[71] = -1522067609423362228L;
        hp.cbaa[72] = 5237128362424913531L;
        hp.cbaa[73] = -74558682097745989L;
        hp.cbaa[74] = -6800100631822344161L;
        hp.cbaa[75] = -7200845875753840912L;
        hp.cbaa[76] = 9040820251958462634L;
        hp.cbaa[77] = -419487218621141768L;
        hp.cbaa[78] = -5117257223272811049L;
        hp.cbaa[79] = 2968299522283920484L;
        hp.cbaa[80] = 2978251239578944140L;
        hp.cbaa[81] = -5064942768139414507L;
        hp.cbaa[82] = 5734814101792593270L;
        hp.cbaa[83] = -1874961172167385193L;
        hp.cbaa[84] = -3944266355380067244L;
        hp.cbaa[85] = 3086128350201874021L;
        hp.cbaa[86] = 4933494913778782976L;
        hp.cbaa[87] = -2953899630882486644L;
        hp.cbaa[88] = -6957403284854008067L;
        hp.cbaa[89] = 8089928287633002974L;
        hp.cbaa[90] = -8675612547862476145L;
        hp.cbaa[91] = -2957497474230478084L;
        hp.cbaa[92] = 4636242565303988253L;
        hp.cbaa[93] = -6230495261319026851L;
        hp.cbaa[94] = 7569220565201827127L;
        hp.cbaa[95] = -2057054693632966211L;
        hp.cbaa[96] = 4166006938836022689L;
        hp.cbaa[97] = -8194657812565201098L;
        hp.cbaa[98] = -7113178248807934891L;
        hp.cbaa[99] = 103865873503663459L;
    }

    private static /* synthetic */ void ccwg() {
        hp.cbab[100] = -7982535892015041541L;
        hp.cbab[101] = 1524889752344949886L;
        hp.cbab[102] = -315686466704578752L;
        hp.cbab[103] = 5098402017610025276L;
        hp.cbab[104] = -5090195478631987706L;
        hp.cbab[105] = -7378168728391172946L;
        hp.cbab[106] = -1308824730611910317L;
        hp.cbab[107] = 1025662755728528597L;
        hp.cbab[108] = -7236638872959992071L;
        hp.cbab[109] = -7331512418107952833L;
        hp.cbab[110] = 3055663119827840581L;
        hp.cbab[111] = 7645777907522544184L;
        hp.cbab[112] = -6782610750025827878L;
        hp.cbab[113] = -8892531298097764336L;
        hp.cbab[114] = -3424130636410676012L;
        hp.cbab[115] = 5610125810029770608L;
        hp.cbab[116] = 8641400718038018024L;
        hp.cbab[117] = -6776771692171161178L;
        hp.cbab[118] = -9014664817286958153L;
        hp.cbab[119] = 8126854561494865139L;
        hp.cbab[120] = 3482465189077628483L;
        hp.cbab[121] = -6385644594339534449L;
        hp.cbab[122] = 6410281997241210849L;
        hp.cbab[123] = -626175715470374911L;
        hp.cbab[124] = 1391407022877584950L;
        hp.cbab[125] = 1548181845579582903L;
        hp.cbab[126] = -1137481487498733354L;
        hp.cbab[127] = 4530071171478861077L;
        hp.cbab[128] = -7936737934343365715L;
        hp.cbab[129] = -7785521444428558986L;
        hp.cbab[130] = 2219083314309917614L;
        hp.cbab[131] = 2180566496610324659L;
        hp.cbab[132] = -4915398227146501394L;
        hp.cbab[133] = -173117085032368042L;
        hp.cbab[134] = 3886298837556104771L;
        hp.cbab[135] = 978098369867786981L;
        hp.cbab[136] = 9098891331982767238L;
        hp.cbab[137] = -8688178705686889643L;
        hp.cbab[138] = -1943830298863805001L;
        hp.cbab[139] = -3027996123521531274L;
        hp.cbab[140] = 798567725751163203L;
        hp.cbab[141] = 6801676257823709544L;
        hp.cbab[142] = -2012532449308293299L;
        hp.cbab[143] = -5669620104261937601L;
        hp.cbab[144] = 802469927544947588L;
        hp.cbab[145] = 427442754962931456L;
        hp.cbab[146] = 3055356609526147587L;
        hp.cbab[147] = 8892617179993779690L;
        hp.cbab[148] = -2475867021991762967L;
        hp.cbab[149] = -3988466857212305878L;
        hp.cbab[150] = 4369032050250140802L;
        hp.cbab[151] = 4511686854860172654L;
        hp.cbab[152] = 4643102129637467923L;
        hp.cbab[153] = 214775278256830718L;
        hp.cbab[154] = -2054651939706870014L;
        hp.cbab[155] = 313606232461998998L;
        hp.cbab[156] = 5575473121448873587L;
        hp.cbab[157] = -7675826445955580545L;
        hp.cbab[158] = 779147431989009373L;
        hp.cbab[159] = 359475466552456919L;
        hp.cbab[160] = 8674469495753077061L;
        hp.cbab[161] = -3386032840378837479L;
        hp.cbab[162] = 9194672958034621330L;
        hp.cbab[163] = -3933979222028203482L;
        hp.cbab[164] = 8475320806766926585L;
        hp.cbab[165] = -6558879125860456158L;
        hp.cbab[166] = -7879233060207499687L;
        hp.cbab[167] = -6902215381277454121L;
        hp.cbab[168] = -5688920068037276502L;
        hp.cbab[169] = 1971210966189305330L;
        hp.cbab[170] = -6293331831811975373L;
        hp.cbab[171] = 4836726317812854350L;
        hp.cbab[172] = -5539848944394749360L;
        hp.cbab[173] = -6919561433141459326L;
        hp.cbab[174] = -6377631507544060176L;
        hp.cbab[175] = -8351425622746739558L;
        hp.cbab[176] = -8796786028691558763L;
        hp.cbab[177] = -4904316577215820456L;
        hp.cbab[178] = 647623740463270771L;
        hp.cbab[179] = -1733358001197130425L;
        hp.cbab[180] = 927887691029587645L;
        hp.cbab[181] = -7138398040651058159L;
        hp.cbab[182] = -3933620212855371078L;
        hp.cbab[183] = 6788669421891343242L;
        hp.cbab[184] = 5918966095386110944L;
        hp.cbab[185] = -5946753003235086470L;
        hp.cbab[186] = -8607723722183373832L;
        hp.cbab[187] = -8032122587078046414L;
        hp.cbab[188] = 5964927291444573669L;
        hp.cbab[189] = -6574008117552340408L;
        hp.cbab[190] = -7536928026737465702L;
        hp.cbab[191] = -2459671946830492093L;
        hp.cbab[192] = -2012969052905405388L;
        hp.cbab[193] = -4415750887839251778L;
        hp.cbab[194] = 6766197276720929539L;
        hp.cbab[195] = -2418489566616816213L;
        hp.cbab[196] = -6822852168720072322L;
        hp.cbab[197] = -6233166549717944578L;
        hp.cbab[198] = -2420692492608058142L;
        hp.cbab[199] = 1523498375048460544L;
    }

    private static /* synthetic */ void ccwd() {
        hp.cbaa[300] = 5500738089752658826L;
        hp.cbaa[301] = -4769726606096602897L;
        hp.cbaa[302] = 8950927691970702528L;
        hp.cbaa[303] = 4485639657772863163L;
        hp.cbaa[304] = 1509625172972647364L;
        hp.cbaa[305] = -766166414475072161L;
        hp.cbaa[306] = -3089536349237143230L;
        hp.cbaa[307] = -2897653079377828792L;
        hp.cbaa[308] = -2522685348923698165L;
        hp.cbaa[309] = 9037487934587690233L;
        hp.cbaa[310] = 4656865504709732915L;
        hp.cbaa[311] = -1838079649346311339L;
        hp.cbaa[312] = 3003923513683222814L;
        hp.cbaa[313] = 6167318407531089613L;
        hp.cbaa[314] = 1521397817349422560L;
        hp.cbaa[315] = 6957396335080279442L;
        hp.cbaa[316] = 13487526997346600L;
        hp.cbaa[317] = -8718375713994216836L;
        hp.cbaa[318] = 6847926459395218601L;
        hp.cbaa[319] = 983216936480957209L;
        hp.cbaa[320] = 2455953341534232822L;
        hp.cbaa[321] = 8342850660524398584L;
        hp.cbaa[322] = 5949229132484751851L;
        hp.cbaa[323] = 3908931080494789161L;
        hp.cbaa[324] = 6557130449471401251L;
        hp.cbaa[325] = -4890330581356256830L;
        hp.cbaa[326] = 2287791405033562642L;
        hp.cbaa[327] = -3341756753835183910L;
        hp.cbaa[328] = -6100829404043785385L;
        hp.cbaa[329] = 3203787527487515517L;
        hp.cbaa[330] = 4069109862877672687L;
        hp.cbaa[331] = -455765733274282110L;
        hp.cbaa[332] = 1701637167220230551L;
        hp.cbaa[333] = -1075779630570022944L;
        hp.cbaa[334] = -4072341255056176258L;
        hp.cbaa[335] = -6733170439574400346L;
        hp.cbaa[336] = 6723634134505900459L;
        hp.cbaa[337] = -2269114072121587559L;
        hp.cbaa[338] = -7621504646926385240L;
        hp.cbaa[339] = 2415084084263333566L;
        hp.cbaa[340] = 656836079432434877L;
        hp.cbaa[341] = 2761992580155776077L;
        hp.cbaa[342] = -1119279648031187583L;
        hp.cbaa[343] = -6590648115537005119L;
        hp.cbaa[344] = 1415268293647737513L;
        hp.cbaa[345] = 3550178056373689491L;
        hp.cbaa[346] = -2512182575710390070L;
        hp.cbaa[347] = -3574118000400393680L;
        hp.cbaa[348] = 915544682713751735L;
        hp.cbaa[349] = 7342797412662114292L;
        hp.cbaa[350] = 4031346129766902338L;
        hp.cbaa[351] = -7329161595121952289L;
        hp.cbaa[352] = 6466350920908483461L;
        hp.cbaa[353] = -5475983690032108302L;
        hp.cbaa[354] = 5097721012303863754L;
        hp.cbaa[355] = -2767039634025926579L;
        hp.cbaa[356] = 6983747088775009875L;
        hp.cbaa[357] = 8514986337035289561L;
        hp.cbaa[358] = -757035233522586531L;
        hp.cbaa[359] = -4086493537586873288L;
        hp.cbaa[360] = 9136412754209914078L;
        hp.cbaa[361] = 4736486708065663822L;
        hp.cbaa[362] = -1845188062497048463L;
        hp.cbaa[363] = 4226052588550086510L;
        hp.cbaa[364] = -2086150719804275900L;
        hp.cbaa[365] = 48721896332945349L;
        hp.cbaa[366] = 5934281595588273824L;
        hp.cbaa[367] = -6236490197569762377L;
        hp.cbaa[368] = -8736316095542859269L;
        hp.cbaa[369] = 7334622294177435415L;
        hp.cbaa[370] = 3365899787707903704L;
        hp.cbaa[371] = 2997623560139061597L;
        hp.cbaa[372] = 1438038814526169368L;
        hp.cbaa[373] = -2890801251374374070L;
        hp.cbaa[374] = 4378457780685867366L;
        hp.cbaa[375] = 477153780225978628L;
        hp.cbaa[376] = 2704624730399486101L;
        hp.cbaa[377] = -8652824018695247121L;
        hp.cbaa[378] = 3895778733569037211L;
        hp.cbaa[379] = -6271805163478134925L;
        hp.cbaa[380] = 1074154044630673687L;
        hp.cbaa[381] = -3473548999153707478L;
        hp.cbaa[382] = 4109705614399642880L;
        hp.cbaa[383] = -4309892880506124550L;
        hp.cbaa[384] = -5679789932610674075L;
        hp.cbaa[385] = 8441854146253398786L;
        hp.cbaa[386] = 8668017625467681669L;
        hp.cbaa[387] = 6873439672625772761L;
        hp.cbaa[388] = -4752882643151634176L;
        hp.cbaa[389] = 680192620709011665L;
        hp.cbaa[390] = 1643445654287759628L;
        hp.cbaa[391] = -7902453685335911770L;
        hp.cbaa[392] = -3727682103999473725L;
        hp.cbaa[393] = -6605354949001337513L;
        hp.cbaa[394] = -1320946400322084537L;
        hp.cbaa[395] = -777515335999670311L;
        hp.cbaa[396] = -1733156641628221643L;
        hp.cbaa[397] = 3272934786573076242L;
        hp.cbaa[398] = 7219968518586809286L;
        hp.cbaa[399] = -6697688140520098356L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ir getPredictor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccpy", cazz(int ), (int)396)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hp.cbac("ccpz", cbah(int ), (int)549)) break;
            v0 /* !! */  = (long)hp.cbac("ccqa", cbah(int ), (int)550);
        }
        var3_1 = hp.c;
        v1 /* !! */  = hp.ff;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(hp.cbac("ccqc", cazz(int ), (int)398) - hp.cbac("ccqb", cazz(int ), (int)397));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1356012555: {
                    continue block17;
                }
                case 1050601319: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = hp.b;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - hp.cbac("ccqd", cazz(int ), (int)399));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 179046981: {
                    v3 = hp.cbac("ccqe", cazz(int ), (int)400);
                    continue block18;
                }
                case 1050601319: {
                    break block18;
                }
                case 1375596415: {
                    v3 = hp.cbac("ccqf", cazz(int ), (int)401);
                    continue block18;
                }
                case 1417786861: {
                    v3 = hp.cbac("ccqg", cazz(int ), (int)402);
                    continue block18;
                }
            }
            break;
        }
        var1_3 = hp.a;
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
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccqh", cazz(int ), (int)403)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hp.cbac("ccqi", cbah(int ), (int)551)) break;
                    v4 /* !! */  = (long)hp.cbac("ccqj", cbah(int ), (int)552);
                }
                return this.predictor;
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("ccqk", cbah(int ), (int)553);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("ccql", cbah(int ), (int)554);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("ccqm", cbah(int ), (int)555);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hp.cbac("ccqn", cbah(int ), (int)556);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hp() {
        var2_1 /* !! */  = hp.b;
        var1_2 = hp.a;
        super("MaceTarget", "Mace Target", du.RAGE);
        this.serverMode = new kf("\u0421\u0435\u0440\u0432\u0435\u0440", "\u0420\u0435\u0436\u0438\u043c \u0440\u0430\u0431\u043e\u0442\u044b \u043f\u043e\u0434 \u0441\u0435\u0440\u0432\u0435\u0440", "Default", new String[]{"ReallyWorld"}).selected("Default");
        this.modeSetting = new kf("\u0420\u0435\u0436\u0438\u043c", "\u0421\u043f\u043e\u0441\u043e\u0431 \u0441\u0432\u0430\u043f\u0430", "Silent", new String[]{"Silent", "Legit"}).selected("Silent");
        this.height = new kg("\u0412\u044b\u0441\u043e\u0442\u0430", "\u0412\u044b\u0441\u043e\u0442\u0430 \u043f\u043e\u043b\u0451\u0442\u0430 \u043d\u0430\u0434 \u0446\u0435\u043b\u044c\u044e", (float)hp.cbac("cbay", cbax(int ), (int)8)).range((float)hp.cbac("cbaz", cbax(int ), (int)9), (float)hp.cbac("cbba", cbax(int ), (int)10));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.targetType = new ke("\u0426\u0435\u043b\u0438", "\u0422\u0438\u043f\u044b \u0446\u0435\u043b\u0435\u0439").value(new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438", "\u041c\u043e\u0431\u044b", "\u0416\u0438\u0432\u043e\u0442\u043d\u044b\u0435"}).selected(new String[]{"\u0418\u0433\u0440\u043e\u043a\u0438"});
                this.autoEquipChest = new kb("\u0410\u0432\u0442\u043e-\u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a", "\u041e\u0434\u0435\u0432\u0430\u0442\u044c \u043d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a \u043f\u0440\u0438 \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0438").setValue((boolean)hp.cbac("cbbb", cbah(int ), (int)11));
                this.predictMovement = new kb("\u041f\u0440\u0435\u0434\u0443\u0433\u0430\u0434\u044b\u0432\u0430\u043d\u0438\u0435", "\u041f\u0440\u0435\u0434\u0443\u0433\u0430\u0434\u044b\u0432\u0430\u0442\u044c \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u0443\u0431\u0435\u0433\u0430\u044e\u0449\u0435\u0439 \u0446\u0435\u043b\u0438").setValue((boolean)hp.cbac("cbbc", cbah(int ), (int)12));
                this.predictor = new ir();
                this.attackHandler = new ip();
                this.targetFinder = new ik();
                this.fireworkTimer = new pr();
                this.settings(new jx[]{this.serverMode, this.modeSetting, this.height, this.targetType, this.autoEquipChest, this.predictMovement});
                this.flightController = new iq(this.predictor);
                this.armorSwapHandler = new in((in$SwapSettingsProvider)LambdaMetafactory.metafactory(null, null, null, ()Lruhack/phobia/oc;, buildSettings(), ()Lruhack/phobia/oc;)((hp)this));
                this.fireworkHandler = new io((io$SwapSettingsProvider)LambdaMetafactory.metafactory(null, null, null, ()Lruhack/phobia/oc;, buildSettings(), ()Lruhack/phobia/oc;)((hp)this));
                this.stageHandler = new is(this.armorSwapHandler, this.fireworkHandler, this.attackHandler, this.fireworkTimer);
                return;
            }
lbl23:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)hp.cbac("cbbd", cbah(int ), (int)13);
                ** GOTO lbl45
            }
            case 1: {
                var2_1 /* !! */  = (int)hp.cbac("cbbe", cbah(int ), (int)14);
                ** GOTO lbl71
            }
lbl29:
            // 2 sources

            case 2: {
                var2_1 /* !! */  = (int)hp.cbac("cbbf", cbah(int ), (int)15);
                ** GOTO lbl23
            }
lbl32:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)hp.cbac("cbbg", cbah(int ), (int)16);
                ** GOTO lbl60
            }
            case 4: {
                while (true) {
                    var2_1 /* !! */  = (int)hp.cbac("cbbh", cbah(int ), (int)17);
                }
            }
lbl39:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)hp.cbac("cbbi", cbah(int ), (int)18);
                ** GOTO lbl57
            }
            case 6: {
                var2_1 /* !! */  = (int)hp.cbac("cbbj", cbah(int ), (int)19);
                ** GOTO lbl32
            }
lbl45:
            // 3 sources

            case 7: {
                var2_1 /* !! */  = (int)hp.cbac("cbbk", cbah(int ), (int)20);
                break;
            }
            case 8: {
                var2_1 /* !! */  = (int)hp.cbac("cbbl", cbah(int ), (int)21);
                ** GOTO lbl29
            }
            case 9: {
                var2_1 /* !! */  = (int)hp.cbac("cbbm", cbah(int ), (int)22);
                ** GOTO lbl39
            }
lbl54:
            // 2 sources

            case 10: {
                var2_1 /* !! */  = (int)hp.cbac("cbbn", cbah(int ), (int)23);
                break;
            }
lbl57:
            // 2 sources

            case 11: {
                var2_1 /* !! */  = (int)hp.cbac("cbbo", cbah(int ), (int)24);
                ** GOTO lbl54
            }
lbl60:
            // 2 sources

            case 12: {
                while (true) {
                    var2_1 /* !! */  = (int)hp.cbac("cbbp", cbah(int ), (int)25);
                }
            }
lbl64:
            // 2 sources

            case 13: {
                var2_1 /* !! */  = (int)hp.cbac("cbbq", cbah(int ), (int)26);
                ** GOTO lbl71
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hp.cbac("cbbr", cbah(int ), (int)27);
                    ** GOTO lbl45
                    break;
                }
            }
lbl71:
            // 4 sources

            case 15: {
                var2_1 /* !! */  = (int)hp.cbac("cbbs", cbah(int ), (int)28);
                ** GOTO lbl64
            }
            case 16: {
                var2_1 /* !! */  = (int)hp.cbac("cbbt", cbah(int ), (int)29);
                ** GOTO lbl71
            }
            case 17: 
        }
        var2_1 /* !! */  = (int)hp.cbac("cbbu", cbah(int ), (int)30);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isSilentMode() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("cbbv", cazz(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1050601319: {
                    break block22;
                }
                case 1187986699: {
                    v1 = hp.cbac("cbbw", cazz(int ), (int)10);
                    continue block22;
                }
                case 1283670934: {
                    v1 = hp.cbac("cbbx", cazz(int ), (int)11);
                    continue block22;
                }
                case 1709484524: {
                    v1 = hp.cbac("cbby", cazz(int ), (int)12);
                    continue block22;
                }
            }
            break;
        }
        var3_1 = hp.c;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl22
        block23: while (true) {
            v2 /* !! */  = (long)(v3 - hp.cbac("cbbz", cazz(int ), (int)13));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 33772218: {
                    v3 = hp.cbac("cbca", cazz(int ), (int)14);
                    continue block23;
                }
                case 106993289: {
                    v3 = hp.cbac("cbcb", cazz(int ), (int)15);
                    continue block23;
                }
                case 1050601319: {
                    break block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = hp.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cbcc", cazz(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hp.cbac("cbcd", cbah(int ), (int)31)) break;
            v4 /* !! */  = (long)hp.cbac("cbce", cbah(int ), (int)32);
        }
        var1_3 = hp.a;
        if (!var3_1) ** GOTO lbl44
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)hp.cbac("cbcf", cbah(int ), (int)33);
                }
lbl44:
                // 1 sources

                if (var1_3 || var1_3) continue block25;
                v5 /* !! */  = hp.ff;
                if (true) ** GOTO lbl49
                block26: while (true) {
                    v5 /* !! */  = (long)(v6 - hp.cbac("cbcg", cazz(int ), (int)17));
lbl49:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -148336446: {
                            v6 = hp.cbac("cbch", cazz(int ), (int)18);
                            continue block26;
                        }
                        case 1050601319: {
                            break block26;
                        }
                        case 2019743360: {
                            v6 = hp.cbac("cbci", cazz(int ), (int)19);
                            continue block26;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("cbcj", cazz(int ), (int)20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == hp.cbac("cbck", cbah(int ), (int)34)) break;
                    v7 /* !! */  = (long)hp.cbac("cbcl", cbah(int ), (int)35);
                }
                v8 = this.modeSetting.getValue();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("cbcm", cazz(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hp.cbac("cbcn", cbah(int ), (int)36)) break;
                    v9 /* !! */  = (long)hp.cbac("cbco", cbah(int ), (int)37);
                }
                return v8.equals("Silent");
lbl70:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)hp.cbac("cbcp", cbah(int ), (int)38);
                    if (!var3_1) break block25;
                    throw null;
                }
lbl74:
                // 2 sources

                case 1: {
                    var2_2 /* !! */  = (int)hp.cbac("cbcq", cbah(int ), (int)39);
                    if (!var3_1) ** GOTO lbl70
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)hp.cbac("cbcr", cbah(int ), (int)40);
                    if (!var3_1) ** GOTO lbl74
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)hp.cbac("cbcs", cbah(int ), (int)41);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ccvt() {
        hp.cbaj[0] = -72386229;
        hp.cbaj[1] = 888184423;
        hp.cbaj[2] = -1542578787;
        hp.cbaj[3] = 284008171;
        hp.cbaj[4] = -1015246747;
        hp.cbaj[5] = 509010435;
        hp.cbaj[6] = 1339159542;
        hp.cbaj[7] = 1215201312;
        hp.cbaj[8] = -1569155718;
        hp.cbaj[9] = -834735667;
        hp.cbaj[10] = -1191579355;
        hp.cbaj[11] = 1081702399;
        hp.cbaj[12] = 1532208323;
        hp.cbaj[13] = 1025066661;
        hp.cbaj[14] = 657758337;
        hp.cbaj[15] = 829776317;
        hp.cbaj[16] = 678851951;
        hp.cbaj[17] = -49061390;
        hp.cbaj[18] = -985898873;
        hp.cbaj[19] = 772006855;
        hp.cbaj[20] = -1553464764;
        hp.cbaj[21] = -943702818;
        hp.cbaj[22] = 173110798;
        hp.cbaj[23] = 2099922146;
        hp.cbaj[24] = -1931566598;
        hp.cbaj[25] = 1319836692;
        hp.cbaj[26] = -1548747074;
        hp.cbaj[27] = 475000723;
        hp.cbaj[28] = -1470508858;
        hp.cbaj[29] = 324885451;
        hp.cbaj[30] = 805539522;
        hp.cbaj[31] = -1935200603;
        hp.cbaj[32] = 1229225782;
        hp.cbaj[33] = 85344984;
        hp.cbaj[34] = -492025968;
        hp.cbaj[35] = -741768745;
        hp.cbaj[36] = 34966978;
        hp.cbaj[37] = 331113421;
        hp.cbaj[38] = 954043841;
        hp.cbaj[39] = 1431783737;
        hp.cbaj[40] = -1938284642;
        hp.cbaj[41] = 1689273620;
        hp.cbaj[42] = -1303294426;
        hp.cbaj[43] = 668298884;
        hp.cbaj[44] = -322141834;
        hp.cbaj[45] = 474034405;
        hp.cbaj[46] = -387640185;
        hp.cbaj[47] = 1147270419;
        hp.cbaj[48] = 104830865;
        hp.cbaj[49] = -372029985;
        hp.cbaj[50] = -1652374796;
        hp.cbaj[51] = 240330417;
        hp.cbaj[52] = -1736278270;
        hp.cbaj[53] = -363575988;
        hp.cbaj[54] = -1113857391;
        hp.cbaj[55] = -239502005;
        hp.cbaj[56] = 504950750;
        hp.cbaj[57] = -623295363;
        hp.cbaj[58] = -304272842;
        hp.cbaj[59] = -844745847;
        hp.cbaj[60] = 213169182;
        hp.cbaj[61] = 695280706;
        hp.cbaj[62] = 91361967;
        hp.cbaj[63] = 710170123;
        hp.cbaj[64] = 2026595066;
        hp.cbaj[65] = -1308957530;
        hp.cbaj[66] = -1956706845;
        hp.cbaj[67] = -738638403;
        hp.cbaj[68] = -1078927864;
        hp.cbaj[69] = 346857392;
        hp.cbaj[70] = 1646591047;
        hp.cbaj[71] = -1102559623;
        hp.cbaj[72] = 1480935815;
        hp.cbaj[73] = 1493738472;
        hp.cbaj[74] = 1651237046;
        hp.cbaj[75] = 382098102;
        hp.cbaj[76] = 2020731484;
        hp.cbaj[77] = -1067653297;
        hp.cbaj[78] = 1881351034;
        hp.cbaj[79] = -1304202994;
        hp.cbaj[80] = 809119383;
        hp.cbaj[81] = 24890830;
        hp.cbaj[82] = -1942311860;
        hp.cbaj[83] = 1221363214;
        hp.cbaj[84] = 189755778;
        hp.cbaj[85] = 825035394;
        hp.cbaj[86] = -560635826;
        hp.cbaj[87] = -1762522791;
        hp.cbaj[88] = -734415826;
        hp.cbaj[89] = 1042466636;
        hp.cbaj[90] = 979105617;
        hp.cbaj[91] = -76476620;
        hp.cbaj[92] = 169630105;
        hp.cbaj[93] = 2015530277;
        hp.cbaj[94] = -208699357;
        hp.cbaj[95] = -681163323;
        hp.cbaj[96] = -815401748;
        hp.cbaj[97] = 1922342761;
        hp.cbaj[98] = 1499385250;
        hp.cbaj[99] = -1024104233;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public in getArmorSwapHandler() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccri", cazz(int ), (int)420)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hp.cbac("ccrj", cbah(int ), (int)561)) break;
            v0 /* !! */  = (long)hp.cbac("ccrk", cbah(int ), (int)562);
        }
        var3_1 = hp.c;
        v1 /* !! */  = hp.ff;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - hp.cbac("ccrl", cazz(int ), (int)421));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1050601319: {
                    break block17;
                }
                case 1588300473: {
                    v2 = hp.cbac("ccrm", cazz(int ), (int)422);
                    continue block17;
                }
                case 1718440109: {
                    v2 = hp.cbac("ccrn", cazz(int ), (int)423);
                    continue block17;
                }
                case 1925773507: {
                    v2 = hp.cbac("ccro", cazz(int ), (int)424);
                    continue block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = hp.b;
        v3 /* !! */  = hp.ff;
        if (true) ** GOTO lbl29
        block18: while (true) {
            v3 /* !! */  = (long)(hp.cbac("ccrq", cazz(int ), (int)426) - hp.cbac("ccrp", cazz(int ), (int)425));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1050601319: {
                    break block18;
                }
                case 1820795309: {
                    continue block18;
                }
            }
            break;
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccrr", cazz(int ), (int)427)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hp.cbac("ccrs", cbah(int ), (int)563)) break;
                    v4 /* !! */  = (long)hp.cbac("ccrt", cbah(int ), (int)564);
                }
                return this.armorSwapHandler;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("ccru", cbah(int ), (int)565);
                } while (!var3_1);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hp.cbac("ccrv", cbah(int ), (int)566);
                    if (!var3_1) break block10;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("ccrw", cbah(int ), (int)567);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hp.cbac("ccrx", cbah(int ), (int)568);
        ** while (!var3_1)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void resetAllStates() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block77: while (true) {
            v0 /* !! */  = (long)(hp.cbac("ccjz", cazz(int ), (int)313) - hp.cbac("ccjy", cazz(int ), (int)312));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1211548677: {
                    continue block77;
                }
                case 1050601319: {
                    break block77;
                }
            }
            break;
        }
        var3_1 = hp.c;
        v1 /* !! */  = hp.ff;
        if (true) ** GOTO lbl15
        block78: while (true) {
            v1 /* !! */  = (long)(hp.cbac("cckb", cazz(int ), (int)315) - hp.cbac("ccka", cazz(int ), (int)314));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -82915156: {
                    continue block78;
                }
                case 1050601319: {
                    break block78;
                }
            }
            break;
        }
        var2_2 /* !! */  = hp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cckc", cazz(int ), (int)316)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hp.cbac("cckd", cbah(int ), (int)477)) break;
            v2 /* !! */  = (long)hp.cbac("ccke", cbah(int ), (int)478);
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl29:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        v3 /* !! */  = hp.ff;
        if (true) ** GOTO lbl36
        block81: while (true) {
            v3 /* !! */  = (long)(v4 - hp.cbac("cckf", cazz(int ), (int)317));
lbl36:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1681249540: {
                    v4 = hp.cbac("cckg", cazz(int ), (int)318);
                    continue block81;
                }
                case -590139702: {
                    v4 = hp.cbac("cckh", cazz(int ), (int)319);
                    continue block81;
                }
                case 1050601319: {
                    break block81;
                }
            }
            break;
        }
        v5 /* !! */  = hp.ff;
        if (true) ** GOTO lbl49
        block82: while (true) {
            v5 /* !! */  = (long)(v6 - hp.cbac("ccki", cazz(int ), (int)320));
lbl49:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1672635215: {
                    v6 = hp.cbac("cckj", cazz(int ), (int)321);
                    continue block82;
                }
                case -356565961: {
                    v6 = hp.cbac("cckk", cazz(int ), (int)322);
                    continue block82;
                }
                case 622983463: {
                    v6 = hp.cbac("cckl", cazz(int ), (int)323);
                    continue block82;
                }
                case 1050601319: {
                    break block82;
                }
            }
            break;
        }
        this.armorSwapHandler.reset();
        if (var1_3 || var1_3) ** GOTO lbl29
        v7 /* !! */  = hp.ff;
        if (true) ** GOTO lbl67
        block83: while (true) {
            v7 /* !! */  = (long)(v8 - hp.cbac("cckm", cazz(int ), (int)324));
lbl67:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -445802026: {
                    v8 = hp.cbac("cckn", cazz(int ), (int)325);
                    continue block83;
                }
                case 219702863: {
                    v8 = hp.cbac("ccko", cazz(int ), (int)326);
                    continue block83;
                }
                case 829558656: {
                    v8 = hp.cbac("cckp", cazz(int ), (int)327);
                    continue block83;
                }
                case 1050601319: {
                    break block83;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("cckq", cazz(int ), (int)328)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == hp.cbac("cckr", cbah(int ), (int)479)) break;
            v9 /* !! */  = (long)hp.cbac("ccks", cbah(int ), (int)480);
        }
        this.fireworkHandler.reset();
        if (var1_3 || var1_3) ** GOTO lbl29
        v10 /* !! */  = hp.ff;
        if (true) ** GOTO lbl90
        block85: while (true) {
            v10 /* !! */  = (long)(v11 - hp.cbac("cckt", cazz(int ), (int)329));
lbl90:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -426750388: {
                    v11 = hp.cbac("ccku", cazz(int ), (int)330);
                    continue block85;
                }
                case 738324067: {
                    v11 = hp.cbac("cckv", cazz(int ), (int)331);
                    continue block85;
                }
                case 1050601319: {
                    break block85;
                }
            }
            break;
        }
        v12 /* !! */  = hp.ff;
        if (true) ** GOTO lbl103
        block86: while (true) {
            v12 /* !! */  = (long)(v13 - hp.cbac("cckw", cazz(int ), (int)332));
lbl103:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -2073129551: {
                    v13 = hp.cbac("cckx", cazz(int ), (int)333);
                    continue block86;
                }
                case -678495827: {
                    v13 = hp.cbac("ccky", cazz(int ), (int)334);
                    continue block86;
                }
                case -481855144: {
                    v13 = hp.cbac("cckz", cazz(int ), (int)335);
                    continue block86;
                }
                case 1050601319: {
                    break block86;
                }
            }
            break;
        }
        this.attackHandler.reset();
        if (var1_3 || var1_3) ** GOTO lbl29
        v14 /* !! */  = hp.ff;
        if (true) ** GOTO lbl121
        block87: while (true) {
            v14 /* !! */  = (long)(v15 - hp.cbac("ccla", cazz(int ), (int)336));
lbl121:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -740980133: {
                    v15 = hp.cbac("cclb", cazz(int ), (int)337);
                    continue block87;
                }
                case 916569009: {
                    v15 = hp.cbac("cclc", cazz(int ), (int)338);
                    continue block87;
                }
                case 1050601319: {
                    break block87;
                }
                case 1993506246: {
                    v15 = hp.cbac("ccld", cazz(int ), (int)339);
                    continue block87;
                }
            }
            break;
        }
        v16 /* !! */  = hp.ff;
        if (true) ** GOTO lbl137
        block88: while (true) {
            v16 /* !! */  = (long)(v17 - hp.cbac("ccle", cazz(int ), (int)340));
lbl137:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1243502495: {
                    v17 = hp.cbac("cclf", cazz(int ), (int)341);
                    continue block88;
                }
                case 1050601319: {
                    break block88;
                }
                case 1302149704: {
                    v17 = hp.cbac("cclg", cazz(int ), (int)342);
                    continue block88;
                }
            }
            break;
        }
        this.predictor.reset();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl29
                v18 /* !! */  = hp.ff;
                if (true) ** GOTO lbl155
                block89: while (true) {
                    v18 /* !! */  = (long)(v19 - hp.cbac("cclh", cazz(int ), (int)343));
lbl155:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1717166290: {
                            v19 = hp.cbac("ccli", cazz(int ), (int)344);
                            continue block89;
                        }
                        case -1420690563: {
                            v19 = hp.cbac("cclj", cazz(int ), (int)345);
                            continue block89;
                        }
                        case 1050601319: {
                            break block89;
                        }
                        case 1727147242: {
                            v19 = hp.cbac("cclk", cazz(int ), (int)346);
                            continue block89;
                        }
                    }
                    break;
                }
                this.target = null;
                if (var1_3 || var1_3) ** GOTO lbl29
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccll", cazz(int ), (int)347)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == hp.cbac("cclm", cbah(int ), (int)481)) break;
                    v20 /* !! */  = (long)hp.cbac("ccln", cbah(int ), (int)482);
                }
                v21 /* !! */  = hp.ff;
                if (true) ** GOTO lbl178
                block91: while (true) {
                    v21 /* !! */  = (long)(v22 - hp.cbac("cclo", cazz(int ), (int)348));
lbl178:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case 148590101: {
                            v22 = hp.cbac("cclp", cazz(int ), (int)349);
                            continue block91;
                        }
                        case 279122052: {
                            v22 = hp.cbac("cclq", cazz(int ), (int)350);
                            continue block91;
                        }
                        case 1050601319: {
                            break block91;
                        }
                        case 1255521803: {
                            v22 = hp.cbac("cclr", cazz(int ), (int)351);
                            continue block91;
                        }
                    }
                    break;
                }
                this.stageHandler.reset();
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("ccls", cbah(int ), (int)483);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("cclt", cbah(int ), (int)484);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("cclu", cbah(int ), (int)485);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl208:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)hp.cbac("cclv", cbah(int ), (int)486);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 4: {
                var2_2 /* !! */  = (int)hp.cbac("cclw", cbah(int ), (int)487);
                if (var3_1) {
                    throw null;
                }
            }
lbl217:
            // 5 sources

            case 5: {
                var2_2 /* !! */  = (int)hp.cbac("cclx", cbah(int ), (int)488);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 6: {
                var2_2 /* !! */  = (int)hp.cbac("ccly", cbah(int ), (int)489);
                if (var3_1) {
                    throw null;
                }
            }
lbl226:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)hp.cbac("cclz", cbah(int ), (int)490);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 8: {
                var2_2 /* !! */  = (int)hp.cbac("ccma", cbah(int ), (int)491);
                if (var3_1) {
                    throw null;
                }
            }
lbl235:
            // 5 sources

            case 9: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("ccmb", cbah(int ), (int)492);
                } while (!var3_1);
                throw null;
            }
lbl240:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)hp.cbac("ccmc", cbah(int ), (int)493);
                if (!var3_1) ** GOTO lbl217
                throw null;
            }
lbl244:
            // 3 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hp.cbac("ccmd", cbah(int ), (int)494);
                    if (!var3_1) ** GOTO lbl226
                    throw null;
                }
            }
            case 12: {
                var2_2 /* !! */  = (int)hp.cbac("ccme", cbah(int ), (int)495);
                if (!var3_1) ** GOTO lbl235
                throw null;
            }
lbl253:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)hp.cbac("ccmf", cbah(int ), (int)496);
                if (!var3_1) ** GOTO lbl217
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)hp.cbac("ccmg", cbah(int ), (int)497);
                if (!var3_1) ** GOTO lbl208
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)hp.cbac("ccmh", cbah(int ), (int)498);
        ** while (!var3_1)
lbl264:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static hp getInstance() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("cbad", cazz(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1465348377: {
                    v1 = hp.cbac("cbae", cazz(int ), (int)1);
                    continue block11;
                }
                case 1050601319: {
                    break block11;
                }
                case 1437693810: {
                    v1 = hp.cbac("cbaf", cazz(int ), (int)2);
                    continue block11;
                }
            }
            break;
        }
        var2 = hp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cbag", cazz(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hp.cbac("cbak", cbah(int ), (int)0)) break;
            v2 /* !! */  = (long)hp.cbac("cbal", cbah(int ), (int)1);
        }
        var1_1 = hp.b;
        v3 /* !! */  = hp.ff;
        if (true) ** GOTO lbl26
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - hp.cbac("cbam", cazz(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -307699349: {
                    v4 = hp.cbac("cban", cazz(int ), (int)5);
                    continue block13;
                }
                case 1050601319: {
                    break block13;
                }
                case 1159924995: {
                    v4 = hp.cbac("cbao", cazz(int ), (int)6);
                    continue block13;
                }
                case 1381616376: {
                    v4 = hp.cbac("cbap", cazz(int ), (int)7);
                    continue block13;
                }
            }
            break;
        }
        var0_2 = hp.a;
        if (var2) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var0_2 || var0_2)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("cbaq", cazz(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == hp.cbac("cbar", cbah(int ), (int)2)) break;
            v5 /* !! */  = (long)hp.cbac("cbas", cbah(int ), (int)3);
        }
        return nj.get(hp.class);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onInput(cj var1_1) {
        block70: {
            block69: {
                block68: {
                    block67: {
                        var4_2 = hp.c;
                        var3_3 /* !! */  = hp.b;
                        var2_4 = hp.a;
                        if (var4_2) {
                            throw null;
lbl6:
                            // 19 sources

                            return;
                        }
                        if (var2_4 || var2_4) ** GOTO lbl6
                        if (hp.mc.field_1724 != null) break block67;
                        if (var2_4) ** GOTO lbl6
                        return;
                    }
                    if (var2_4 || var2_4) ** GOTO lbl6
                    if (this.armorSwapHandler.getMovement().isBlocked()) break block68;
                    if (var2_4) ** GOTO lbl6
                    if (!this.fireworkHandler.getMovement().isBlocked()) break block69;
                    if (var2_4) ** GOTO lbl6
                }
                if (var2_4 || var2_4) ** GOTO lbl6
                var1_1.setDirectionalLow((boolean)hp.cbac("ccdk", cbah(int ), (int)381), (boolean)hp.cbac("ccdl", cbah(int ), (int)382), (boolean)hp.cbac("ccdm", cbah(int ), (int)383), (boolean)hp.cbac("ccdn", cbah(int ), (int)384));
                if (var2_4 || var2_4) ** GOTO lbl6
                var1_1.setJumping((boolean)hp.cbac("ccdo", cbah(int ), (int)385));
                if (var2_4) ** GOTO lbl6
            }
            if (var2_4 || var2_4) ** GOTO lbl6
            if (this.target == null) ** GOTO lbl-1000
            if (var2_4) ** GOTO lbl6
            if (!nv.hasElytra()) ** GOTO lbl-1000
            if (var2_4) ** GOTO lbl6
            if (this.stageHandler.getStage() != it$Stage.FLYING_UP) ** GOTO lbl-1000
            if (var2_4 || var2_4) ** GOTO lbl6
            if (!hp.mc.field_1724.method_24828()) break block70;
            if (var2_4 || var2_4) ** GOTO lbl6
            var1_1.setJumping((boolean)hp.cbac("ccdp", cbah(int ), (int)386));
            if (var2_4) ** GOTO lbl6
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl-1000
        }
        if (var2_4 || var2_4) ** GOTO lbl6
        if (hp.mc.field_1724.method_6128()) ** GOTO lbl-1000
        if (var2_4) ** GOTO lbl6
        if (hp.mc.field_1724.method_31549().field_7479) ** GOTO lbl-1000
        if (var2_4 || var2_4) ** GOTO lbl6
        if (hp.mc.field_1724.field_6012 % hp.cbac("ccdq", cbah(int ), (int)387) == 0) {
            v0 = hp.cbac("ccdr", cbah(int ), (int)388);
            if (var4_2) {
                throw null;
            }
        } else {
            v0 = hp.cbac("ccds", cbah(int ), (int)389);
        }
        var1_1.setJumping((boolean)v0);
        if (var2_4) ** GOTO lbl6
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 8 sources

            {
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)hp.cbac("ccdt", cbah(int ), (int)390);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl99
            }
            case 1: {
                var3_3 /* !! */  = (int)hp.cbac("ccdu", cbah(int ), (int)391);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl69:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)hp.cbac("ccdv", cbah(int ), (int)392);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 3: {
                var3_3 /* !! */  = (int)hp.cbac("ccdw", cbah(int ), (int)393);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
lbl79:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hp.cbac("ccdx", cbah(int ), (int)394);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
            }
            case 5: {
                var3_3 /* !! */  = (int)hp.cbac("ccdy", cbah(int ), (int)395);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl123
            }
            case 6: {
                var3_3 /* !! */  = (int)hp.cbac("ccdz", cbah(int ), (int)396);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl94:
            // 3 sources

            case 7: {
                var3_3 /* !! */  = (int)hp.cbac("ccea", cbah(int ), (int)397);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl99:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)hp.cbac("cceb", cbah(int ), (int)398);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl104:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hp.cbac("ccec", cbah(int ), (int)399);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl109:
            // 2 sources

            case 10: {
                do {
                    var3_3 /* !! */  = (int)hp.cbac("cced", cbah(int ), (int)400);
                } while (!var4_2);
                throw null;
            }
lbl114:
            // 5 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hp.cbac("ccee", cbah(int ), (int)401);
                    if (!var4_2) ** GOTO lbl109
                    throw null;
                }
            }
            case 12: {
                var3_3 /* !! */  = (int)hp.cbac("ccef", cbah(int ), (int)402);
                if (!var4_2) break;
                throw null;
            }
lbl123:
            // 2 sources

            case 13: {
                var3_3 /* !! */  = (int)hp.cbac("cceg", cbah(int ), (int)403);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl132
            }
lbl128:
            // 2 sources

            case 14: {
                var3_3 /* !! */  = (int)hp.cbac("cceh", cbah(int ), (int)404);
                if (!var4_2) ** GOTO lbl79
                throw null;
            }
lbl132:
            // 3 sources

            case 15: {
                do {
                    var3_3 /* !! */  = (int)hp.cbac("ccei", cbah(int ), (int)405);
                } while (!var4_2);
                throw null;
            }
lbl137:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)hp.cbac("ccej", cbah(int ), (int)406);
                if (!var4_2) ** GOTO lbl128
                throw null;
            }
            case 17: {
                var3_3 /* !! */  = (int)hp.cbac("ccek", cbah(int ), (int)407);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
            case 18: {
                var3_3 /* !! */  = (int)hp.cbac("ccel", cbah(int ), (int)408);
                if (!var4_2) break;
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)hp.cbac("ccem", cbah(int ), (int)409);
                if (!var4_2) ** GOTO lbl114
                throw null;
            }
lbl153:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)hp.cbac("ccen", cbah(int ), (int)410);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 21: {
                var3_3 /* !! */  = (int)hp.cbac("cceo", cbah(int ), (int)411);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl163:
            // 2 sources

            case 22: {
                var3_3 /* !! */  = (int)hp.cbac("ccep", cbah(int ), (int)412);
                if (!var4_2) ** GOTO lbl69
                throw null;
            }
lbl167:
            // 3 sources

            case 23: {
                var3_3 /* !! */  = (int)hp.cbac("cceq", cbah(int ), (int)413);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl196
            }
lbl172:
            // 2 sources

            case 24: {
                var3_3 /* !! */  = (int)hp.cbac("ccer", cbah(int ), (int)414);
                if (!var4_2) ** GOTO lbl132
                throw null;
            }
lbl176:
            // 3 sources

            case 25: {
                var3_3 /* !! */  = (int)hp.cbac("cces", cbah(int ), (int)415);
                if (!var4_2) ** GOTO lbl114
                throw null;
            }
            case 26: {
                var3_3 /* !! */  = (int)hp.cbac("ccet", cbah(int ), (int)416);
                if (!var4_2) ** GOTO lbl167
                throw null;
            }
            case 27: {
                var3_3 /* !! */  = (int)hp.cbac("cceu", cbah(int ), (int)417);
                if (!var4_2) ** GOTO lbl137
                throw null;
            }
            case 28: {
                var3_3 /* !! */  = (int)hp.cbac("ccev", cbah(int ), (int)418);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
lbl192:
            // 2 sources

            case 29: {
                var3_3 /* !! */  = (int)hp.cbac("ccew", cbah(int ), (int)419);
                if (!var4_2) ** GOTO lbl153
                throw null;
            }
lbl196:
            // 3 sources

            case 30: {
                var3_3 /* !! */  = (int)hp.cbac("ccex", cbah(int ), (int)420);
                if (!var4_2) ** GOTO lbl69
                throw null;
            }
            case 31: 
        }
        var3_3 /* !! */  = (int)hp.cbac("ccey", cbah(int ), (int)421);
        ** while (!var4_2)
lbl203:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ccvy() {
        hp.cbaj[500] = -1652295377;
        hp.cbaj[501] = -1940297352;
        hp.cbaj[502] = -840161927;
        hp.cbaj[503] = 732896828;
        hp.cbaj[504] = -1679355950;
        hp.cbaj[505] = 1313750324;
        hp.cbaj[506] = 241686619;
        hp.cbaj[507] = 1481911886;
        hp.cbaj[508] = -823720203;
        hp.cbaj[509] = 1545334311;
        hp.cbaj[510] = -1336252994;
        hp.cbaj[511] = 505218435;
        hp.cbaj[512] = -198224069;
        hp.cbaj[513] = -251577063;
        hp.cbaj[514] = 1279106503;
        hp.cbaj[515] = -713475465;
        hp.cbaj[516] = 1027304201;
        hp.cbaj[517] = -2016039917;
        hp.cbaj[518] = -1035154700;
        hp.cbaj[519] = -1190065376;
        hp.cbaj[520] = -103393346;
        hp.cbaj[521] = 584102042;
        hp.cbaj[522] = 1100731182;
        hp.cbaj[523] = -402481003;
        hp.cbaj[524] = 1620234644;
        hp.cbaj[525] = 977774961;
        hp.cbaj[526] = -1231852255;
        hp.cbaj[527] = -1542504203;
        hp.cbaj[528] = 1245550283;
        hp.cbaj[529] = -880917776;
        hp.cbaj[530] = -1293106144;
        hp.cbaj[531] = 1761883137;
        hp.cbaj[532] = -1192020569;
        hp.cbaj[533] = 833158033;
        hp.cbaj[534] = 1449887514;
        hp.cbaj[535] = -758861064;
        hp.cbaj[536] = 1850451468;
        hp.cbaj[537] = -1659904488;
        hp.cbaj[538] = -2006068323;
        hp.cbaj[539] = 897853451;
        hp.cbaj[540] = -338358806;
        hp.cbaj[541] = -1732465179;
        hp.cbaj[542] = -748783814;
        hp.cbaj[543] = -1991931731;
        hp.cbaj[544] = 1900210247;
        hp.cbaj[545] = 2078975081;
        hp.cbaj[546] = -398357692;
        hp.cbaj[547] = -601368556;
        hp.cbaj[548] = -1741527910;
        hp.cbaj[549] = -1755230732;
        hp.cbaj[550] = 1042304962;
        hp.cbaj[551] = -14976098;
        hp.cbaj[552] = 422214607;
        hp.cbaj[553] = 1614110270;
        hp.cbaj[554] = 662901953;
        hp.cbaj[555] = 154027499;
        hp.cbaj[556] = -2071667531;
        hp.cbaj[557] = 1537112470;
        hp.cbaj[558] = -765438735;
        hp.cbaj[559] = -1063598844;
        hp.cbaj[560] = -1866579703;
        hp.cbaj[561] = -1024854650;
        hp.cbaj[562] = -667914966;
        hp.cbaj[563] = 2026288253;
        hp.cbaj[564] = -2124385669;
        hp.cbaj[565] = -1316360670;
        hp.cbaj[566] = -1020969111;
        hp.cbaj[567] = 792552290;
        hp.cbaj[568] = -2011103007;
        hp.cbaj[569] = 2019075056;
        hp.cbaj[570] = -1752716439;
        hp.cbaj[571] = -1338260056;
        hp.cbaj[572] = -1009161211;
        hp.cbaj[573] = 2076097632;
        hp.cbaj[574] = 480127325;
        hp.cbaj[575] = 1262005257;
        hp.cbaj[576] = -1524512920;
        hp.cbaj[577] = -1730172476;
        hp.cbaj[578] = -1795683142;
        hp.cbaj[579] = 1700325284;
        hp.cbaj[580] = -121601592;
        hp.cbaj[581] = -1203693476;
        hp.cbaj[582] = -510704903;
        hp.cbaj[583] = -1516367567;
        hp.cbaj[584] = 737754413;
        hp.cbaj[585] = -486478491;
        hp.cbaj[586] = 579254613;
        hp.cbaj[587] = -1826451984;
        hp.cbaj[588] = -1857195165;
        hp.cbaj[589] = 397280271;
        hp.cbaj[590] = 1600625325;
        hp.cbaj[591] = 438411148;
        hp.cbaj[592] = 1061693432;
        hp.cbaj[593] = -537697230;
        hp.cbaj[594] = -1150144087;
        hp.cbaj[595] = 118672875;
        hp.cbaj[596] = 1553018722;
        hp.cbaj[597] = 620843736;
        hp.cbaj[598] = 950573299;
        hp.cbaj[599] = 1748495826;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1309 getTarget() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("ccuy", cazz(int ), (int)466));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -335281377: {
                    v1 = hp.cbac("ccuz", cazz(int ), (int)467);
                    continue block19;
                }
                case 877888867: {
                    v1 = hp.cbac("ccva", cazz(int ), (int)468);
                    continue block19;
                }
                case 1050601319: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = hp.c;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl19
        block20: while (true) {
            v2 /* !! */  = (long)(hp.cbac("ccvc", cazz(int ), (int)470) - hp.cbac("ccvb", cazz(int ), (int)469));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 144630020: {
                    continue block20;
                }
                case 1050601319: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = hp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccvd", cazz(int ), (int)471)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hp.cbac("ccve", cbah(int ), (int)609)) break;
            v3 /* !! */  = (long)hp.cbac("ccvf", cbah(int ), (int)610);
        }
        var1_3 = hp.a;
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
                v4 /* !! */  = hp.ff;
                if (true) ** GOTO lbl44
                block23: while (true) {
                    v4 /* !! */  = (long)(hp.cbac("ccvh", cazz(int ), (int)473) - hp.cbac("ccvg", cazz(int ), (int)472));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -481232262: {
                            continue block23;
                        }
                        case 1050601319: {
                            break block23;
                        }
                    }
                    break;
                }
                return this.target;
            }
lbl50:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("ccvi", cbah(int ), (int)611);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl59
            }
            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("ccvj", cbah(int ), (int)612);
                if (!var3_1) ** GOTO lbl50
                throw null;
            }
lbl59:
            // 2 sources

            case 2: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("ccvk", cbah(int ), (int)613);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hp.cbac("ccvl", cbah(int ), (int)614);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onRotationUpdate(da var1_1) {
        block104: {
            block103: {
                var6_2 = hp.c;
                var5_3 /* !! */  = hp.b;
                var4_4 = hp.a;
                if (var6_2) {
                    throw null;
lbl6:
                    // 28 sources

                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (hp.mc.field_1724 == null) break block103;
                if (var4_4) ** GOTO lbl6
                if (hp.mc.field_1687 != null) break block104;
                if (var4_4) ** GOTO lbl6
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        if (var1_1.getType() != 0) ** GOTO lbl60
        if (var4_4 || var4_4) ** GOTO lbl6
        this.updateHandlers();
        if (var4_4 || var4_4) ** GOTO lbl6
        if (this.target == null) ** GOTO lbl29
        if (var4_4) ** GOTO lbl6
        if (this.target.method_5805()) ** GOTO lbl32
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl6
lbl29:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.findTarget();
                if (var4_4) ** GOTO lbl6
lbl32:
                // 2 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (this.target != null) ** GOTO lbl36
                if (var4_4) ** GOTO lbl6
                return;
lbl36:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.predictor.update(this.target);
                if (var4_4 || var4_4) ** GOTO lbl6
                var2_5 = this.stageHandler.getStage();
                if (var4_4 || var4_4) ** GOTO lbl6
                switch (hp$1.$SwitchMap$ruhack$phobia$system$modulesystem$impl$rage$macetarget$state$MaceState$Stage[var2_5.ordinal()]) {
                    case 1: {
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (!nv.hasElytra()) break;
                        if (var4_4) ** GOTO lbl6
                        if (!hp.mc.field_1724.method_6128()) break;
                        if (var4_4 || var4_4) ** GOTO lbl6
                        var3_6 = this.flightController.calculateAngle(this.target, var2_5);
                        if (var4_4 || var4_4) ** GOTO lbl6
                        this.rotateTo(var3_6);
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (!var6_2) break;
                        throw null;
                    }
                    case 2: 
                    case 3: {
                        if (var4_4 || var4_4) ** GOTO lbl6
                        var3_7 = this.flightController.calculateAngle(this.target, var2_5);
                        if (var4_4 || var4_4) ** GOTO lbl6
                        this.rotateTo(var3_7);
                        if (var4_4) ** break;
                    }
                }
lbl60:
                // 6 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (var1_1.getType() != hp.cbac("cbpz", cbah(int ), (int)220)) ** GOTO lbl65
                if (var4_4 || var4_4) ** GOTO lbl6
                this.handlePostRotation();
                if (var4_4) ** GOTO lbl6
lbl65:
                // 2 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl68:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)hp.cbac("cbqa", cbah(int ), (int)221);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                var5_3 /* !! */  = (int)hp.cbac("cbqb", cbah(int ), (int)222);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl78:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)hp.cbac("cbqc", cbah(int ), (int)223);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl161
            }
lbl83:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)hp.cbac("cbqd", cbah(int ), (int)224);
                if (!var6_2) ** GOTO lbl78
                throw null;
            }
lbl87:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)hp.cbac("cbqe", cbah(int ), (int)225);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl92:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)hp.cbac("cbqf", cbah(int ), (int)226);
                if (!var6_2) ** GOTO lbl87
                throw null;
            }
lbl96:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)hp.cbac("cbqg", cbah(int ), (int)227);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl101:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)hp.cbac("cbqh", cbah(int ), (int)228);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 8: {
                var5_3 /* !! */  = (int)hp.cbac("cbqi", cbah(int ), (int)229);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl111:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)hp.cbac("cbqj", cbah(int ), (int)230);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl263
            }
            case 10: {
                var5_3 /* !! */  = (int)hp.cbac("cbqk", cbah(int ), (int)231);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl121:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)hp.cbac("cbql", cbah(int ), (int)232);
                if (!var6_2) ** GOTO lbl96
                throw null;
            }
lbl125:
            // 3 sources

            case 12: {
                var5_3 /* !! */  = (int)hp.cbac("cbqm", cbah(int ), (int)233);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl130:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)hp.cbac("cbvv", cbah(int ), (int)234);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 14: {
                var5_3 /* !! */  = (int)hp.cbac("cbvw", cbah(int ), (int)235);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl192
            }
lbl140:
            // 2 sources

            case 15: {
                var5_3 /* !! */  = (int)hp.cbac("cbvx", cbah(int ), (int)236);
                if (!var6_2) ** GOTO lbl96
                throw null;
            }
lbl144:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)hp.cbac("cbvy", cbah(int ), (int)237);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 17: {
                var5_3 /* !! */  = (int)hp.cbac("cbvz", cbah(int ), (int)238);
                if (!var6_2) break;
                throw null;
            }
lbl153:
            // 2 sources

            case 18: {
                var5_3 /* !! */  = (int)hp.cbac("cbwa", cbah(int ), (int)239);
                if (!var6_2) ** GOTO lbl92
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)hp.cbac("cbwb", cbah(int ), (int)240);
                if (!var6_2) ** GOTO lbl121
                throw null;
            }
lbl161:
            // 3 sources

            case 20: {
                var5_3 /* !! */  = (int)hp.cbac("cbwc", cbah(int ), (int)241);
                if (!var6_2) ** GOTO lbl153
                throw null;
            }
lbl165:
            // 4 sources

            case 21: {
                var5_3 /* !! */  = (int)hp.cbac("cbwd", cbah(int ), (int)242);
                if (!var6_2) ** GOTO lbl111
                throw null;
            }
            case 22: {
                var5_3 /* !! */  = (int)hp.cbac("cbwe", cbah(int ), (int)243);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl201
            }
lbl174:
            // 3 sources

            case 23: {
                var5_3 /* !! */  = (int)hp.cbac("cbwf", cbah(int ), (int)244);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl179:
            // 2 sources

            case 24: {
                var5_3 /* !! */  = (int)hp.cbac("cbwg", cbah(int ), (int)245);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl184:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)hp.cbac("cbwh", cbah(int ), (int)246);
                if (!var6_2) ** GOTO lbl101
                throw null;
            }
            case 26: {
                var5_3 /* !! */  = (int)hp.cbac("cbwi", cbah(int ), (int)247);
                if (!var6_2) break;
                throw null;
            }
lbl192:
            // 2 sources

            case 27: {
                var5_3 /* !! */  = (int)hp.cbac("cbwj", cbah(int ), (int)248);
                if (!var6_2) ** GOTO lbl130
                throw null;
            }
            case 28: {
                do {
                    var5_3 /* !! */  = (int)hp.cbac("cbwk", cbah(int ), (int)249);
                } while (!var6_2);
                throw null;
            }
lbl201:
            // 2 sources

            case 29: {
                var5_3 /* !! */  = (int)hp.cbac("cbwl", cbah(int ), (int)250);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl247
            }
lbl206:
            // 3 sources

            case 30: {
                var5_3 /* !! */  = (int)hp.cbac("cbwm", cbah(int ), (int)251);
                if (!var6_2) ** GOTO lbl144
                throw null;
            }
lbl210:
            // 2 sources

            case 31: {
                var5_3 /* !! */  = (int)hp.cbac("cbwn", cbah(int ), (int)252);
                if (!var6_2) ** GOTO lbl125
                throw null;
            }
            case 32: {
                var5_3 /* !! */  = (int)hp.cbac("cbwo", cbah(int ), (int)253);
                if (!var6_2) ** GOTO lbl121
                throw null;
            }
lbl218:
            // 4 sources

            case 33: {
                var5_3 /* !! */  = (int)hp.cbac("cbwp", cbah(int ), (int)254);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl271
            }
lbl223:
            // 2 sources

            case 34: {
                var5_3 /* !! */  = (int)hp.cbac("cbwq", cbah(int ), (int)255);
                if (!var6_2) ** GOTO lbl165
                throw null;
            }
            case 35: {
                var5_3 /* !! */  = (int)hp.cbac("cbwr", cbah(int ), (int)256);
                if (!var6_2) ** GOTO lbl184
                throw null;
            }
lbl231:
            // 2 sources

            case 36: {
                var5_3 /* !! */  = (int)hp.cbac("cbws", cbah(int ), (int)257);
                if (!var6_2) ** GOTO lbl223
                throw null;
            }
            case 37: {
                var5_3 /* !! */  = (int)hp.cbac("cbwt", cbah(int ), (int)258);
                if (!var6_2) ** GOTO lbl231
                throw null;
            }
            case 38: {
                var5_3 /* !! */  = (int)hp.cbac("cbwu", cbah(int ), (int)259);
                if (!var6_2) ** GOTO lbl206
                throw null;
            }
lbl243:
            // 3 sources

            case 39: {
                var5_3 /* !! */  = (int)hp.cbac("cbwv", cbah(int ), (int)260);
                if (!var6_2) ** GOTO lbl218
                throw null;
            }
lbl247:
            // 2 sources

            case 40: {
                var5_3 /* !! */  = (int)hp.cbac("cbww", cbah(int ), (int)261);
                if (!var6_2) ** GOTO lbl210
                throw null;
            }
            case 41: {
                var5_3 /* !! */  = (int)hp.cbac("cbwx", cbah(int ), (int)262);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
lbl255:
            // 2 sources

            case 42: {
                var5_3 /* !! */  = (int)hp.cbac("cbwy", cbah(int ), (int)263);
                if (!var6_2) ** GOTO lbl161
                throw null;
            }
lbl259:
            // 2 sources

            case 43: {
                var5_3 /* !! */  = (int)hp.cbac("cbwz", cbah(int ), (int)264);
                if (!var6_2) ** GOTO lbl174
                throw null;
            }
lbl263:
            // 2 sources

            case 44: {
                var5_3 /* !! */  = (int)hp.cbac("cbxa", cbah(int ), (int)265);
                if (!var6_2) ** GOTO lbl125
                throw null;
            }
            case 45: {
                var5_3 /* !! */  = (int)hp.cbac("cbxb", cbah(int ), (int)266);
                if (!var6_2) ** GOTO lbl165
                throw null;
            }
lbl271:
            // 2 sources

            case 46: {
                var5_3 /* !! */  = (int)hp.cbac("cbxc", cbah(int ), (int)267);
                if (!var6_2) ** GOTO lbl144
                throw null;
            }
lbl275:
            // 3 sources

            case 47: {
                var5_3 /* !! */  = (int)hp.cbac("cbxd", cbah(int ), (int)268);
                if (!var6_2) ** GOTO lbl68
                throw null;
            }
            case 48: {
                var5_3 /* !! */  = (int)hp.cbac("cbxe", cbah(int ), (int)269);
                if (!var6_2) ** GOTO lbl243
                throw null;
            }
lbl283:
            // 2 sources

            case 49: {
                var5_3 /* !! */  = (int)hp.cbac("cbxf", cbah(int ), (int)270);
                if (!var6_2) ** GOTO lbl179
                throw null;
            }
            case 50: 
        }
        do {
            var5_3 /* !! */  = (int)hp.cbac("cbxg", cbah(int ), (int)271);
        } while (!var6_2);
        throw null;
    }

    private static /* synthetic */ void ccwc() {
        hp.cbaa[200] = 4201682522168927222L;
        hp.cbaa[201] = -2516496036381828687L;
        hp.cbaa[202] = -6399643091074216274L;
        hp.cbaa[203] = -7922740233212109822L;
        hp.cbaa[204] = 6037804235434933807L;
        hp.cbaa[205] = 3399682208696608647L;
        hp.cbaa[206] = 5808506378602502608L;
        hp.cbaa[207] = -8430580297879280201L;
        hp.cbaa[208] = -5788624813527989392L;
        hp.cbaa[209] = 311399758153388460L;
        hp.cbaa[210] = 5608996385203666121L;
        hp.cbaa[211] = 353275682900527253L;
        hp.cbaa[212] = 6361510148244756426L;
        hp.cbaa[213] = 6911155258060354230L;
        hp.cbaa[214] = -5337612735605669046L;
        hp.cbaa[215] = 351496917247953858L;
        hp.cbaa[216] = -8770831218610675239L;
        hp.cbaa[217] = 3488816506004914548L;
        hp.cbaa[218] = 4982759037941320194L;
        hp.cbaa[219] = -1432903456759982203L;
        hp.cbaa[220] = 8057817407599567288L;
        hp.cbaa[221] = -3581212041003613827L;
        hp.cbaa[222] = 1951688999564506875L;
        hp.cbaa[223] = 5011371880082203574L;
        hp.cbaa[224] = 2261647063629322354L;
        hp.cbaa[225] = -5425235011467581742L;
        hp.cbaa[226] = -5195788644181587332L;
        hp.cbaa[227] = 1240761764353308536L;
        hp.cbaa[228] = -9105100887205715799L;
        hp.cbaa[229] = -3958101321390145931L;
        hp.cbaa[230] = -6181905940476266486L;
        hp.cbaa[231] = -3200567299816517928L;
        hp.cbaa[232] = -5829745823197326582L;
        hp.cbaa[233] = 7401152900551418825L;
        hp.cbaa[234] = -9103767753628609313L;
        hp.cbaa[235] = -282504345179175362L;
        hp.cbaa[236] = 5749777798039571920L;
        hp.cbaa[237] = 2960599989973973235L;
        hp.cbaa[238] = -1744817999611896873L;
        hp.cbaa[239] = -4824019704196036102L;
        hp.cbaa[240] = -2666682965283675210L;
        hp.cbaa[241] = 948880667513834387L;
        hp.cbaa[242] = -7932369170296494956L;
        hp.cbaa[243] = -8714337406778885339L;
        hp.cbaa[244] = 984750135233518882L;
        hp.cbaa[245] = -5571325048472502892L;
        hp.cbaa[246] = 614958513721386994L;
        hp.cbaa[247] = -8409280182235531286L;
        hp.cbaa[248] = 2223526966945202356L;
        hp.cbaa[249] = 5736128174482475608L;
        hp.cbaa[250] = -7258649043651225715L;
        hp.cbaa[251] = 4178660660807764187L;
        hp.cbaa[252] = 5552440973931614133L;
        hp.cbaa[253] = 4597807082934193892L;
        hp.cbaa[254] = -3755468257611859478L;
        hp.cbaa[255] = -1372761556039761285L;
        hp.cbaa[256] = -501319855882463869L;
        hp.cbaa[257] = -7306386933469347053L;
        hp.cbaa[258] = 7730386195105779729L;
        hp.cbaa[259] = -2903932316480286968L;
        hp.cbaa[260] = 2248698994252865166L;
        hp.cbaa[261] = -6900040477990533014L;
        hp.cbaa[262] = -22817827999358865L;
        hp.cbaa[263] = 4790663120487630254L;
        hp.cbaa[264] = -5284085007912481804L;
        hp.cbaa[265] = 3430738352587445947L;
        hp.cbaa[266] = -3495527529430189136L;
        hp.cbaa[267] = 1294285935659646912L;
        hp.cbaa[268] = -5055497565912452393L;
        hp.cbaa[269] = -6053383248204610572L;
        hp.cbaa[270] = 3931375358635751433L;
        hp.cbaa[271] = 2858730025705744674L;
        hp.cbaa[272] = -3913779041194385721L;
        hp.cbaa[273] = 1867691294916520288L;
        hp.cbaa[274] = 676691129634526706L;
        hp.cbaa[275] = -2976297076774592393L;
        hp.cbaa[276] = 1640984547286988790L;
        hp.cbaa[277] = 3278297078992374874L;
        hp.cbaa[278] = 2984325559966435704L;
        hp.cbaa[279] = -9024262060483483236L;
        hp.cbaa[280] = 6788512222049346536L;
        hp.cbaa[281] = 2951367055099780868L;
        hp.cbaa[282] = -5849872892936695956L;
        hp.cbaa[283] = 32210735705055764L;
        hp.cbaa[284] = 4401336596364922087L;
        hp.cbaa[285] = 2279636179247002270L;
        hp.cbaa[286] = 6617900638383893652L;
        hp.cbaa[287] = -5698045203364696145L;
        hp.cbaa[288] = 8418908857490684252L;
        hp.cbaa[289] = 3307286619631773899L;
        hp.cbaa[290] = -4647585883019283166L;
        hp.cbaa[291] = -6042303568948238839L;
        hp.cbaa[292] = -6250383274182809388L;
        hp.cbaa[293] = -7173927041174505718L;
        hp.cbaa[294] = 8284006628593952964L;
        hp.cbaa[295] = -3837445463163687633L;
        hp.cbaa[296] = -3824179587649440131L;
        hp.cbaa[297] = -485768637306470611L;
        hp.cbaa[298] = -5821515093211806896L;
        hp.cbaa[299] = 7209903253076684223L;
    }

    private static /* synthetic */ void ccvs() {
        hp.cbai[600] = -1828393736;
        hp.cbai[601] = 1829445561;
        hp.cbai[602] = 903314104;
        hp.cbai[603] = 674807122;
        hp.cbai[604] = -1015663232;
        hp.cbai[605] = -1543316618;
        hp.cbai[606] = -1810680222;
        hp.cbai[607] = -1286407460;
        hp.cbai[608] = 874868249;
        hp.cbai[609] = 1936249549;
        hp.cbai[610] = -952463374;
        hp.cbai[611] = 1712267200;
        hp.cbai[612] = -1273194680;
        hp.cbai[613] = 301828367;
        hp.cbai[614] = -602534442;
    }

    private static /* synthetic */ void ccwi() {
        hp.cbab[300] = -8616865520090320768L;
        hp.cbab[301] = 6030336971282663099L;
        hp.cbab[302] = 5917733886679789713L;
        hp.cbab[303] = 2733222595485551213L;
        hp.cbab[304] = -6849118671697260408L;
        hp.cbab[305] = 9040158158550806732L;
        hp.cbab[306] = -5115940788330861179L;
        hp.cbab[307] = 1755711913449195050L;
        hp.cbab[308] = -4795027939422346278L;
        hp.cbab[309] = 3781894198636839537L;
        hp.cbab[310] = 5968012657959922803L;
        hp.cbab[311] = -2613347777471851614L;
        hp.cbab[312] = 5680107382733292125L;
        hp.cbab[313] = 3244590686083457969L;
        hp.cbab[314] = -7191632691266623949L;
        hp.cbab[315] = -5981537050289908561L;
        hp.cbab[316] = 4953873943360000682L;
        hp.cbab[317] = 5240202711850047854L;
        hp.cbab[318] = 2069941712722923777L;
        hp.cbab[319] = 2650617753392728605L;
        hp.cbab[320] = -7552607507079846217L;
        hp.cbab[321] = 2901092705373444122L;
        hp.cbab[322] = 3403414094895300882L;
        hp.cbab[323] = -1981776570983839328L;
        hp.cbab[324] = -2858715547862186111L;
        hp.cbab[325] = -4790207801990577127L;
        hp.cbab[326] = 7955351032818610046L;
        hp.cbab[327] = 4325276712973552048L;
        hp.cbab[328] = 3963115950213989961L;
        hp.cbab[329] = -8230497050141629994L;
        hp.cbab[330] = -7903914352133670689L;
        hp.cbab[331] = -2357577160106906361L;
        hp.cbab[332] = 3724314130885108295L;
        hp.cbab[333] = 6991696105175515933L;
        hp.cbab[334] = -7051273638771135917L;
        hp.cbab[335] = 7586079843826404972L;
        hp.cbab[336] = 3836597587209482848L;
        hp.cbab[337] = -3514068135098573234L;
        hp.cbab[338] = -5798924929445997500L;
        hp.cbab[339] = -4142868174424709031L;
        hp.cbab[340] = -7286180306414147421L;
        hp.cbab[341] = 7667026003248163028L;
        hp.cbab[342] = -4387785521761706367L;
        hp.cbab[343] = -2352325837150022042L;
        hp.cbab[344] = -1210522550308079591L;
        hp.cbab[345] = 1076853108878597392L;
        hp.cbab[346] = 4016544919505797356L;
        hp.cbab[347] = -8256779766229543844L;
        hp.cbab[348] = -935991804711181098L;
        hp.cbab[349] = 4347932758336041465L;
        hp.cbab[350] = -6358607146128256837L;
        hp.cbab[351] = -2828139308885723172L;
        hp.cbab[352] = -3444747951250384892L;
        hp.cbab[353] = 2867973047977195704L;
        hp.cbab[354] = -7225234645219292599L;
        hp.cbab[355] = -6592413134899303851L;
        hp.cbab[356] = -1831682084146785068L;
        hp.cbab[357] = -28787625365208071L;
        hp.cbab[358] = 7387059468867915468L;
        hp.cbab[359] = -7592829519232527882L;
        hp.cbab[360] = -5488337569960153695L;
        hp.cbab[361] = 5040665501156168790L;
        hp.cbab[362] = -802409367807403459L;
        hp.cbab[363] = 901543125747181627L;
        hp.cbab[364] = 1369524915823834023L;
        hp.cbab[365] = 3314187759033156139L;
        hp.cbab[366] = -6577017864517400998L;
        hp.cbab[367] = -4026488867676570089L;
        hp.cbab[368] = -3212071593673011820L;
        hp.cbab[369] = 2306669937128741784L;
        hp.cbab[370] = 937882783291725314L;
        hp.cbab[371] = 1843821696813452824L;
        hp.cbab[372] = 1829154981605811056L;
        hp.cbab[373] = -1120248628244599278L;
        hp.cbab[374] = -2683222740806076790L;
        hp.cbab[375] = 7106511551755886141L;
        hp.cbab[376] = -4717487128874043739L;
        hp.cbab[377] = 6740738781929834195L;
        hp.cbab[378] = 4360632431270383014L;
        hp.cbab[379] = 120230189287391183L;
        hp.cbab[380] = -2346459535763894059L;
        hp.cbab[381] = 8334993614980110703L;
        hp.cbab[382] = 131230924225025981L;
        hp.cbab[383] = 9191959707170519349L;
        hp.cbab[384] = -6180784736977173549L;
        hp.cbab[385] = -568929498171918034L;
        hp.cbab[386] = 1770572904535362666L;
        hp.cbab[387] = -2666319557113120519L;
        hp.cbab[388] = 1980367953965416737L;
        hp.cbab[389] = -4996974854256168446L;
        hp.cbab[390] = -6359543513858840376L;
        hp.cbab[391] = 6263881316072912038L;
        hp.cbab[392] = 8455333555510494519L;
        hp.cbab[393] = 4426455913623780930L;
        hp.cbab[394] = 3736838643841484673L;
        hp.cbab[395] = -6339720718129257718L;
        hp.cbab[396] = -8064889020003669610L;
        hp.cbab[397] = -8348754112752320337L;
        hp.cbab[398] = -6445697934788050407L;
        hp.cbab[399] = -234165731829622527L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateHandlers() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block73: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("cbes", cazz(int ), (int)54));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -317942880: {
                    v1 = hp.cbac("cbet", cazz(int ), (int)55);
                    continue block73;
                }
                case 45938322: {
                    v1 = hp.cbac("cbeu", cazz(int ), (int)56);
                    continue block73;
                }
                case 1050601319: {
                    break block73;
                }
            }
            break;
        }
        var3_1 = hp.c;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl19
        block74: while (true) {
            v2 /* !! */  = (long)(v3 - hp.cbac("cbev", cazz(int ), (int)57));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -841695983: {
                    v3 = hp.cbac("cbew", cazz(int ), (int)58);
                    continue block74;
                }
                case 1050601319: {
                    break block74;
                }
                case 1409940948: {
                    v3 = hp.cbac("cbex", cazz(int ), (int)59);
                    continue block74;
                }
            }
            break;
        }
        var2_2 /* !! */  = hp.b;
        v4 /* !! */  = hp.ff;
        if (true) ** GOTO lbl33
        block75: while (true) {
            v4 /* !! */  = (long)(hp.cbac("cbez", cazz(int ), (int)61) - hp.cbac("cbey", cazz(int ), (int)60));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1981402278: {
                    continue block75;
                }
                case 1050601319: {
                    break block75;
                }
            }
            break;
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl41:
            // 7 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl41
        v5 /* !! */  = hp.ff;
        if (true) ** GOTO lbl48
        block77: while (true) {
            v5 /* !! */  = (long)(hp.cbac("cbfb", cazz(int ), (int)63) - hp.cbac("cbfa", cazz(int ), (int)62));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -872773212: {
                    continue block77;
                }
                case 1050601319: {
                    break block77;
                }
            }
            break;
        }
        v6 /* !! */  = hp.ff;
        if (true) ** GOTO lbl57
        block78: while (true) {
            v6 /* !! */  = (long)(v7 - hp.cbac("cbfc", cazz(int ), (int)64));
lbl57:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -2058118195: {
                    v7 = hp.cbac("cbfd", cazz(int ), (int)65);
                    continue block78;
                }
                case -990408762: {
                    v7 = hp.cbac("cbfe", cazz(int ), (int)66);
                    continue block78;
                }
                case -446948530: {
                    v7 = hp.cbac("cbff", cazz(int ), (int)67);
                    continue block78;
                }
                case 1050601319: {
                    break block78;
                }
            }
            break;
        }
        v8 = this.isSilentMode();
        v9 /* !! */  = hp.ff;
        if (true) ** GOTO lbl74
        block79: while (true) {
            v9 /* !! */  = (long)(hp.cbac("cbfh", cazz(int ), (int)69) - hp.cbac("cbfg", cazz(int ), (int)68));
lbl74:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 1003518749: {
                    continue block79;
                }
                case 1050601319: {
                    break block79;
                }
            }
            break;
        }
        this.stageHandler.setSilentMode(v8);
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block28 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl41
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cbfi", cazz(int ), (int)70)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hp.cbac("cbfj", cbah(int ), (int)61)) break;
                    v10 /* !! */  = (long)hp.cbac("cbfk", cbah(int ), (int)62);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("cbfl", cazz(int ), (int)71)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == hp.cbac("cbfm", cbah(int ), (int)63)) break;
                    v11 /* !! */  = (long)hp.cbac("cbfn", cbah(int ), (int)64);
                }
                v12 = this.isReallyWorldMode();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("cbfo", cazz(int ), (int)72)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hp.cbac("cbfp", cbah(int ), (int)65)) break;
                    v13 /* !! */  = (long)hp.cbac("cbfq", cbah(int ), (int)66);
                }
                this.stageHandler.setReallyWorldMode(v12);
                if (var1_3 || var1_3) ** GOTO lbl41
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = hp.ff - hp.cbac("cbfr", cazz(int ), (int)73)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hp.cbac("cbfs", cbah(int ), (int)67)) break;
                    v14 /* !! */  = (long)hp.cbac("cbft", cbah(int ), (int)68);
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = hp.ff - hp.cbac("cbfu", cazz(int ), (int)74)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hp.cbac("cbfv", cbah(int ), (int)69)) break;
                    v15 /* !! */  = (long)hp.cbac("cbfw", cbah(int ), (int)70);
                }
                v16 /* !! */  = hp.ff;
                if (true) ** GOTO lbl117
                block85: while (true) {
                    v16 /* !! */  = (long)(v17 - hp.cbac("cbfx", cazz(int ), (int)75));
lbl117:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2023417172: {
                            v17 = hp.cbac("cbfy", cazz(int ), (int)76);
                            continue block85;
                        }
                        case -1876088099: {
                            v17 = hp.cbac("cbfz", cazz(int ), (int)77);
                            continue block85;
                        }
                        case -1378539044: {
                            v17 = hp.cbac("cbga", cazz(int ), (int)78);
                            continue block85;
                        }
                        case 1050601319: {
                            break block85;
                        }
                    }
                    break;
                }
                v18 = this.height.getValue();
                v19 /* !! */  = hp.ff;
                if (true) ** GOTO lbl134
                block86: while (true) {
                    v19 /* !! */  = (long)(v20 - hp.cbac("cbgb", cazz(int ), (int)79));
lbl134:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1850341732: {
                            v20 = hp.cbac("cbgc", cazz(int ), (int)80);
                            continue block86;
                        }
                        case 1050601319: {
                            break block86;
                        }
                        case 1549634451: {
                            v20 = hp.cbac("cbgd", cazz(int ), (int)81);
                            continue block86;
                        }
                        case 1650384758: {
                            v20 = hp.cbac("cbge", cazz(int ), (int)82);
                            continue block86;
                        }
                    }
                    break;
                }
                this.stageHandler.setHeight(v18);
                if (var1_3 || var1_3) ** GOTO lbl41
                v21 /* !! */  = hp.ff;
                if (true) ** GOTO lbl152
                block87: while (true) {
                    v21 /* !! */  = (long)(v22 - hp.cbac("cbgf", cazz(int ), (int)83));
lbl152:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1750175827: {
                            v22 = hp.cbac("cbgg", cazz(int ), (int)84);
                            continue block87;
                        }
                        case 94608828: {
                            v22 = hp.cbac("cbgh", cazz(int ), (int)85);
                            continue block87;
                        }
                        case 1050601319: {
                            break block87;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_5 = hp.ff - hp.cbac("cbgi", cazz(int ), (int)86)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == hp.cbac("cbgj", cbah(int ), (int)71)) break;
                    v23 /* !! */  = (long)hp.cbac("cbgk", cbah(int ), (int)72);
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_6 = hp.ff - hp.cbac("cbgl", cazz(int ), (int)87)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == hp.cbac("cbgm", cbah(int ), (int)73)) break;
                    v24 /* !! */  = (long)hp.cbac("cbgn", cbah(int ), (int)74);
                }
                v25 = this.predictMovement.isValue();
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_7 = hp.ff - hp.cbac("cbgo", cazz(int ), (int)88)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == hp.cbac("cbgp", cbah(int ), (int)75)) break;
                    v26 /* !! */  = (long)hp.cbac("cbgq", cbah(int ), (int)76);
                }
                this.flightController.setPredictionEnabled(v25);
                if (var1_3 || var1_3) ** GOTO lbl41
                v27 /* !! */  = hp.ff;
                if (true) ** GOTO lbl183
                block91: while (true) {
                    v27 /* !! */  = (long)(v28 - hp.cbac("cbgr", cazz(int ), (int)89));
lbl183:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1858239439: {
                            v28 = hp.cbac("cbgs", cazz(int ), (int)90);
                            continue block91;
                        }
                        case -594604220: {
                            v28 = hp.cbac("cbgt", cazz(int ), (int)91);
                            continue block91;
                        }
                        case 1050601319: {
                            break block91;
                        }
                        case 2110445436: {
                            v28 = hp.cbac("cbgu", cazz(int ), (int)92);
                            continue block91;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_8 = hp.ff - hp.cbac("cbgv", cazz(int ), (int)93)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == hp.cbac("cbgw", cbah(int ), (int)77)) break;
                    v29 /* !! */  = (long)hp.cbac("cbgx", cbah(int ), (int)78);
                }
                v30 /* !! */  = hp.ff;
                if (true) ** GOTO lbl204
                block93: while (true) {
                    v30 /* !! */  = (long)(v31 - hp.cbac("cbgy", cazz(int ), (int)94));
lbl204:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -769994477: {
                            v31 = hp.cbac("cbgz", cazz(int ), (int)95);
                            continue block93;
                        }
                        case -225135051: {
                            v31 = hp.cbac("cbha", cazz(int ), (int)96);
                            continue block93;
                        }
                        case 284907469: {
                            v31 = hp.cbac("cbhb", cazz(int ), (int)97);
                            continue block93;
                        }
                        case 1050601319: {
                            break block93;
                        }
                    }
                    break;
                }
                v32 = this.height.getValue();
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_9 = hp.ff - hp.cbac("cbhc", cazz(int ), (int)98)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == hp.cbac("cbhd", cbah(int ), (int)79)) break;
                    v33 /* !! */  = (long)hp.cbac("cbhe", cbah(int ), (int)80);
                }
                this.flightController.setHeight(v32);
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("cbhf", cbah(int ), (int)81);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("cbhg", cbah(int ), (int)82);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl256
            }
            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("cbhh", cbah(int ), (int)83);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 3: {
                var2_2 /* !! */  = (int)hp.cbac("cbhi", cbah(int ), (int)84);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl246:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)hp.cbac("cbhj", cbah(int ), (int)85);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl269
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hp.cbac("cbhk", cbah(int ), (int)86);
                    if (!var3_1) break block28;
                    throw null;
                }
            }
lbl256:
            // 3 sources

            case 6: {
                var2_2 /* !! */  = (int)hp.cbac("cbhl", cbah(int ), (int)87);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 7: {
                var2_2 /* !! */  = (int)hp.cbac("cbhm", cbah(int ), (int)88);
                if (!var3_1) break;
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)hp.cbac("cbhn", cbah(int ), (int)89);
                if (!var3_1) ** GOTO lbl256
                throw null;
            }
lbl269:
            // 3 sources

            case 9: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("cbho", cbah(int ), (int)90);
                } while (!var3_1);
                throw null;
            }
            case 10: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("cbhp", cbah(int ), (int)91);
                } while (!var3_1);
                throw null;
            }
lbl279:
            // 4 sources

            case 11: {
                var2_2 /* !! */  = (int)hp.cbac("cbhq", cbah(int ), (int)92);
                if (!var3_1) break;
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)hp.cbac("cbhr", cbah(int ), (int)93);
                if (!var3_1) ** GOTO lbl279
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)hp.cbac("cbhs", cbah(int ), (int)94);
        ** while (!var3_1)
lbl290:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getPredictMovement() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccph", cazz(int ), (int)389)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hp.cbac("ccpi", cbah(int ), (int)539)) break;
            v0 /* !! */  = (long)hp.cbac("ccpj", cbah(int ), (int)540);
        }
        var3_1 = hp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccpk", cazz(int ), (int)390)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hp.cbac("ccpl", cbah(int ), (int)541)) break;
            v1 /* !! */  = (long)hp.cbac("ccpm", cbah(int ), (int)542);
        }
        var2_2 /* !! */  = hp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccpn", cazz(int ), (int)391)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hp.cbac("ccpo", cbah(int ), (int)543)) break;
            v2 /* !! */  = (long)hp.cbac("ccpp", cbah(int ), (int)544);
        }
        var1_3 = hp.a;
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
                v3 /* !! */  = hp.ff;
                if (true) ** GOTO lbl34
                block16: while (true) {
                    v3 /* !! */  = (long)(v4 - hp.cbac("ccpq", cazz(int ), (int)392));
lbl34:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1493782860: {
                            v4 = hp.cbac("ccpr", cazz(int ), (int)393);
                            continue block16;
                        }
                        case -961257712: {
                            v4 = hp.cbac("ccps", cazz(int ), (int)394);
                            continue block16;
                        }
                        case 1034897757: {
                            v4 = hp.cbac("ccpt", cazz(int ), (int)395);
                            continue block16;
                        }
                        case 1050601319: {
                            break block16;
                        }
                    }
                    break;
                }
                return this.predictMovement;
            }
lbl47:
            // 2 sources

            case 0: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("ccpu", cbah(int ), (int)545);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("ccpv", cbah(int ), (int)546);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)hp.cbac("ccpw", cbah(int ), (int)547);
                } while (!var3_1);
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hp.cbac("ccpx", cbah(int ), (int)548);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void ccvv() {
        hp.cbaj[200] = -1932010205;
        hp.cbaj[201] = -260508784;
        hp.cbaj[202] = -486230460;
        hp.cbaj[203] = 1724773379;
        hp.cbaj[204] = -757208404;
        hp.cbaj[205] = 1969807618;
        hp.cbaj[206] = 1764171416;
        hp.cbaj[207] = -609308525;
        hp.cbaj[208] = -1921142775;
        hp.cbaj[209] = -345900951;
        hp.cbaj[210] = 459403693;
        hp.cbaj[211] = -230813121;
        hp.cbaj[212] = -1201617831;
        hp.cbaj[213] = -1950320019;
        hp.cbaj[214] = 539911219;
        hp.cbaj[215] = -2003919570;
        hp.cbaj[216] = 1100229073;
        hp.cbaj[217] = -1565023947;
        hp.cbaj[218] = -11801390;
        hp.cbaj[219] = -1032437132;
        hp.cbaj[220] = -394165057;
        hp.cbaj[221] = -1317302704;
        hp.cbaj[222] = -544905672;
        hp.cbaj[223] = 898357908;
        hp.cbaj[224] = 513727927;
        hp.cbaj[225] = 562148056;
        hp.cbaj[226] = -270680464;
        hp.cbaj[227] = 1344488517;
        hp.cbaj[228] = -1189358830;
        hp.cbaj[229] = -1264773676;
        hp.cbaj[230] = 654821242;
        hp.cbaj[231] = 623258489;
        hp.cbaj[232] = 1856761240;
        hp.cbaj[233] = 170794206;
        hp.cbaj[234] = 372374807;
        hp.cbaj[235] = 2013510810;
        hp.cbaj[236] = -2108355460;
        hp.cbaj[237] = -353125627;
        hp.cbaj[238] = 325604323;
        hp.cbaj[239] = -422459370;
        hp.cbaj[240] = -1356587896;
        hp.cbaj[241] = -41539084;
        hp.cbaj[242] = 962291113;
        hp.cbaj[243] = 2036210205;
        hp.cbaj[244] = -2011591016;
        hp.cbaj[245] = -614362797;
        hp.cbaj[246] = -142766350;
        hp.cbaj[247] = -1030288727;
        hp.cbaj[248] = -557694644;
        hp.cbaj[249] = -1410776980;
        hp.cbaj[250] = 1398526431;
        hp.cbaj[251] = -2103539266;
        hp.cbaj[252] = 688443896;
        hp.cbaj[253] = -969777647;
        hp.cbaj[254] = -1004432840;
        hp.cbaj[255] = 860564466;
        hp.cbaj[256] = 1192659167;
        hp.cbaj[257] = -571526467;
        hp.cbaj[258] = 1217625796;
        hp.cbaj[259] = -1022428368;
        hp.cbaj[260] = -472230751;
        hp.cbaj[261] = -910003975;
        hp.cbaj[262] = 532626394;
        hp.cbaj[263] = -1552674888;
        hp.cbaj[264] = 423594225;
        hp.cbaj[265] = -2083250175;
        hp.cbaj[266] = 1516413752;
        hp.cbaj[267] = 618345833;
        hp.cbaj[268] = 461722762;
        hp.cbaj[269] = 116919463;
        hp.cbaj[270] = 1474735378;
        hp.cbaj[271] = 1361649986;
        hp.cbaj[272] = -1060953501;
        hp.cbaj[273] = -1521490826;
        hp.cbaj[274] = -1963501970;
        hp.cbaj[275] = 1188231974;
        hp.cbaj[276] = -2118821343;
        hp.cbaj[277] = 1464950553;
        hp.cbaj[278] = -2004674386;
        hp.cbaj[279] = -1249689633;
        hp.cbaj[280] = -2102316084;
        hp.cbaj[281] = -574940674;
        hp.cbaj[282] = 763479662;
        hp.cbaj[283] = 161234788;
        hp.cbaj[284] = -1235905851;
        hp.cbaj[285] = -594998730;
        hp.cbaj[286] = 1837883791;
        hp.cbaj[287] = 208517982;
        hp.cbaj[288] = -629531657;
        hp.cbaj[289] = -358373218;
        hp.cbaj[290] = 1263058580;
        hp.cbaj[291] = 138897896;
        hp.cbaj[292] = -96666803;
        hp.cbaj[293] = -267174845;
        hp.cbaj[294] = 1430980908;
        hp.cbaj[295] = -1578475370;
        hp.cbaj[296] = 153291875;
        hp.cbaj[297] = -1254955262;
        hp.cbaj[298] = 1532526095;
        hp.cbaj[299] = -1602769991;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void rotateTo(ov var1_1) {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block62: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("cchu", cazz(int ), (int)278));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -894150398: {
                    v1 = hp.cbac("cchv", cazz(int ), (int)279);
                    continue block62;
                }
                case 304023256: {
                    v1 = hp.cbac("cchw", cazz(int ), (int)280);
                    continue block62;
                }
                case 1050601319: {
                    break block62;
                }
            }
            break;
        }
        var6_2 = hp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cchx", cazz(int ), (int)281)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hp.cbac("cchy", cbah(int ), (int)455)) break;
            v2 /* !! */  = (long)hp.cbac("cchz", cbah(int ), (int)456);
        }
        var5_3 /* !! */  = hp.b;
        v3 /* !! */  = hp.ff;
        if (true) ** GOTO lbl25
        block64: while (true) {
            v3 /* !! */  = (long)(v4 - hp.cbac("ccia", cazz(int ), (int)282));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 128182090: {
                    v4 = hp.cbac("ccib", cazz(int ), (int)283);
                    continue block64;
                }
                case 1050601319: {
                    break block64;
                }
                case 1643262167: {
                    v4 = hp.cbac("ccic", cazz(int ), (int)284);
                    continue block64;
                }
            }
            break;
        }
        var4_4 = hp.a;
        if (var6_2) {
            throw null;
lbl37:
            // 5 sources

            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl37
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccid", cazz(int ), (int)285)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hp.cbac("ccie", cbah(int ), (int)457)) break;
            v5 /* !! */  = (long)hp.cbac("ccif", cbah(int ), (int)458);
        }
        v6 /* !! */  = hp.ff;
        if (true) ** GOTO lbl49
        block67: while (true) {
            v6 /* !! */  = (long)(v7 - hp.cbac("ccig", cazz(int ), (int)286));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1912299793: {
                    v7 = hp.cbac("ccih", cazz(int ), (int)287);
                    continue block67;
                }
                case 1050601319: {
                    break block67;
                }
                case 1257839317: {
                    v7 = hp.cbac("ccii", cazz(int ), (int)288);
                    continue block67;
                }
                case 1613658281: {
                    v7 = hp.cbac("ccij", cazz(int ), (int)289);
                    continue block67;
                }
            }
            break;
        }
        v8 /* !! */  = hp.ff;
        if (true) ** GOTO lbl65
        block68: while (true) {
            v8 /* !! */  = (long)(hp.cbac("ccil", cazz(int ), (int)291) - hp.cbac("ccik", cazz(int ), (int)290));
lbl65:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 1050601319: {
                    break block68;
                }
                case 1699180768: {
                    continue block68;
                }
            }
            break;
        }
        v9 = new hy();
        v10 = hp.cbac("ccim", cbah(int ), (int)459);
        v11 = hp.cbac("ccin", cbah(int ), (int)460);
        v12 = hp.cbac("ccio", cbah(int ), (int)461);
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccip", cazz(int ), (int)292)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == hp.cbac("cciq", cbah(int ), (int)462)) break;
            v13 /* !! */  = (long)hp.cbac("ccir", cbah(int ), (int)463);
        }
        var2_5 = new os(v9, (boolean)v10, (boolean)v11, (boolean)v12);
        if (var4_4 || var4_4) ** GOTO lbl37
        v14 /* !! */  = hp.ff;
        if (true) ** GOTO lbl85
        block70: while (true) {
            v14 /* !! */  = (long)(hp.cbac("ccit", cazz(int ), (int)294) - hp.cbac("ccis", cazz(int ), (int)293));
lbl85:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 1050601319: {
                    break block70;
                }
                case 1053995420: {
                    continue block70;
                }
            }
            break;
        }
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = hp.ff - hp.cbac("cciu", cazz(int ), (int)295)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == hp.cbac("cciv", cbah(int ), (int)464)) break;
            v15 /* !! */  = (long)hp.cbac("cciw", cbah(int ), (int)465);
        }
        v16 = var1_1.toVector();
        v17 /* !! */  = hp.ff;
        if (true) ** GOTO lbl100
        block72: while (true) {
            v17 /* !! */  = (long)(hp.cbac("cciy", cazz(int ), (int)297) - hp.cbac("ccix", cazz(int ), (int)296));
lbl100:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -295680153: {
                    continue block72;
                }
                case 1050601319: {
                    break block72;
                }
            }
            break;
        }
        var3_6 = new ov$VecRotation(var1_1, v16);
        if (var4_4) ** GOTO lbl37
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl37
                v18 /* !! */  = hp.ff;
                if (true) ** GOTO lbl115
                block73: while (true) {
                    v18 /* !! */  = (long)(v19 - hp.cbac("cciz", cazz(int ), (int)298));
lbl115:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -2079485234: {
                            v19 = hp.cbac("ccja", cazz(int ), (int)299);
                            continue block73;
                        }
                        case -1968924879: {
                            v19 = hp.cbac("ccjb", cazz(int ), (int)300);
                            continue block73;
                        }
                        case -1066830568: {
                            v19 = hp.cbac("ccjc", cazz(int ), (int)301);
                            continue block73;
                        }
                        case 1050601319: {
                            break block73;
                        }
                    }
                    break;
                }
                v20 /* !! */  = hp.ff;
                if (true) ** GOTO lbl131
                block74: while (true) {
                    v20 /* !! */  = (long)(v21 - hp.cbac("ccjd", cazz(int ), (int)302));
lbl131:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -789425355: {
                            v21 = hp.cbac("ccje", cazz(int ), (int)303);
                            continue block74;
                        }
                        case -334682697: {
                            v21 = hp.cbac("ccjf", cazz(int ), (int)304);
                            continue block74;
                        }
                        case 1050601319: {
                            break block74;
                        }
                        case 1227871104: {
                            v21 = hp.cbac("ccjg", cazz(int ), (int)305);
                            continue block74;
                        }
                    }
                    break;
                }
                v22 = hp.cbac("ccjh", cbah(int ), (int)466);
                v23 /* !! */  = hp.ff;
                if (true) ** GOTO lbl148
                block75: while (true) {
                    v23 /* !! */  = (long)(hp.cbac("ccjj", cazz(int ), (int)307) - hp.cbac("ccji", cazz(int ), (int)306));
lbl148:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 870337457: {
                            continue block75;
                        }
                        case 1050601319: {
                            break block75;
                        }
                    }
                    break;
                }
                v24 /* !! */  = hp.ff;
                if (true) ** GOTO lbl157
                block76: while (true) {
                    v24 /* !! */  = (long)(v25 - hp.cbac("ccjk", cazz(int ), (int)308));
lbl157:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -414668580: {
                            v25 = hp.cbac("ccjl", cazz(int ), (int)309);
                            continue block76;
                        }
                        case -55540905: {
                            v25 = hp.cbac("ccjm", cazz(int ), (int)310);
                            continue block76;
                        }
                        case 54814124: {
                            v25 = hp.cbac("ccjn", cazz(int ), (int)311);
                            continue block76;
                        }
                        case 1050601319: {
                            break block76;
                        }
                    }
                    break;
                }
                ot.INSTANCE.rotateTo(var3_6, this.target, (int)v22, var2_5, nn.HIGH_IMPORTANCE_1, this);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
lbl173:
            // 2 sources

            case 0: {
                var5_3 /* !! */  = (int)hp.cbac("ccjo", cbah(int ), (int)467);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 1: {
                var5_3 /* !! */  = (int)hp.cbac("ccjp", cbah(int ), (int)468);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl183:
            // 2 sources

            case 2: {
                do {
                    var5_3 /* !! */  = (int)hp.cbac("ccjq", cbah(int ), (int)469);
                } while (!var6_2);
                throw null;
            }
            case 3: {
                var5_3 /* !! */  = (int)hp.cbac("ccjr", cbah(int ), (int)470);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl202
            }
            case 4: {
                var5_3 /* !! */  = (int)hp.cbac("ccjs", cbah(int ), (int)471);
                if (!var6_2) ** GOTO lbl173
                throw null;
            }
lbl197:
            // 2 sources

            case 5: {
                do {
                    var5_3 /* !! */  = (int)hp.cbac("ccjt", cbah(int ), (int)472);
                } while (!var6_2);
                throw null;
            }
lbl202:
            // 3 sources

            case 6: {
                var5_3 /* !! */  = (int)hp.cbac("ccju", cbah(int ), (int)473);
                if (!var6_2) ** GOTO lbl183
                throw null;
            }
lbl206:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hp.cbac("ccjv", cbah(int ), (int)474);
                    if (!var6_2) ** GOTO lbl197
                    throw null;
                }
            }
lbl211:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)hp.cbac("ccjw", cbah(int ), (int)475);
                if (!var6_2) ** GOTO lbl202
                throw null;
            }
            case 9: 
        }
        var5_3 /* !! */  = (int)hp.cbac("ccjx", cbah(int ), (int)476);
        ** while (!var6_2)
lbl218:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ip getAttackHandler() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccsn", cazz(int ), (int)437)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hp.cbac("ccso", cbah(int ), (int)575)) break;
            v0 /* !! */  = (long)hp.cbac("ccsp", cbah(int ), (int)576);
        }
        var3_1 = hp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccsq", cazz(int ), (int)438)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hp.cbac("ccsr", cbah(int ), (int)577)) break;
            v1 /* !! */  = (long)hp.cbac("ccss", cbah(int ), (int)578);
        }
        var2_2 /* !! */  = hp.b;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl19
        block12: while (true) {
            v2 /* !! */  = (long)(hp.cbac("ccsu", cazz(int ), (int)440) - hp.cbac("ccst", cazz(int ), (int)439));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -417796504: {
                    continue block12;
                }
                case 1050601319: {
                    break block12;
                }
            }
            break;
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl27:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl27
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccsv", cazz(int ), (int)441)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hp.cbac("ccsw", cbah(int ), (int)579)) break;
                    v3 /* !! */  = (long)hp.cbac("ccsx", cbah(int ), (int)580);
                }
                return this.attackHandler;
            }
lbl41:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("ccsy", cbah(int ), (int)581);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl51
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hp.cbac("ccsz", cbah(int ), (int)582);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl51:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("ccta", cbah(int ), (int)583);
                if (!var3_1) ** GOTO lbl41
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hp.cbac("cctb", cbah(int ), (int)584);
        ** while (!var3_1)
lbl58:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void activate() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("cbht", cazz(int ), (int)99)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hp.cbac("cbhu", cbah(int ), (int)95)) break;
            v0 /* !! */  = (long)hp.cbac("cbhv", cbah(int ), (int)96);
        }
        var3_1 = hp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("cbhw", cazz(int ), (int)100)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == hp.cbac("cbhx", cbah(int ), (int)97)) break;
            v1 /* !! */  = (long)hp.cbac("cbhy", cbah(int ), (int)98);
        }
        var2_2 /* !! */  = hp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = hp.ff - hp.cbac("cbhz", cazz(int ), (int)101)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == hp.cbac("cbia", cbah(int ), (int)99)) {
                var1_3 = hp.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)hp.cbac("cbib", cbah(int ), (int)100);
        }
        if (var1_3 || var1_3) return;
        v3 /* !! */  = hp.ff;
        if (true) ** GOTO lbl27
        block39: while (true) {
            v3 /* !! */  = (long)(v4 - hp.cbac("cbic", cazz(int ), (int)102));
lbl27:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1771389018: {
                    v4 = hp.cbac("cbid", cazz(int ), (int)103);
                    continue block39;
                }
                case -1602310366: {
                    v4 = hp.cbac("cbie", cazz(int ), (int)104);
                    continue block39;
                }
                case -971802891: {
                    v4 = hp.cbac("cbif", cazz(int ), (int)105);
                    continue block39;
                }
                case 1050601319: {
                    break block39;
                }
            }
            break;
        }
        v5 /* !! */  = hp.ff;
        if (true) ** GOTO lbl43
        block40: while (true) {
            v5 /* !! */  = (long)(v6 - hp.cbac("cbig", cazz(int ), (int)106));
lbl43:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1215408222: {
                    v6 = hp.cbac("cbih", cazz(int ), (int)107);
                    continue block40;
                }
                case 568783486: {
                    v6 = hp.cbac("cbii", cazz(int ), (int)108);
                    continue block40;
                }
                case 1050601319: {
                    break block40;
                }
            }
            break;
        }
        this.stageHandler.reset();
        if (var1_3 || var1_3) return;
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = hp.ff - hp.cbac("cbij", cazz(int ), (int)109)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == hp.cbac("cbik", cbah(int ), (int)101)) {
                this.target = null;
                if (var1_3) return;
                break;
            }
            v7 /* !! */  = (long)hp.cbac("cbil", cbah(int ), (int)102);
        }
        if (var1_3) return;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_5 = hp.ff - hp.cbac("cbim", cazz(int ), (int)110)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hp.cbac("cbin", cbah(int ), (int)103)) break;
            v8 /* !! */  = (long)hp.cbac("cbio", cbah(int ), (int)104);
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_6 = hp.ff - hp.cbac("cbip", cazz(int ), (int)111)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == hp.cbac("cbiq", cbah(int ), (int)105)) {
                this.attackHandler.reset();
                if (var1_3) return;
                break;
            }
            v9 /* !! */  = (long)hp.cbac("cbir", cbah(int ), (int)106);
        }
        if (var1_3) return;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_7 = hp.ff - hp.cbac("cbis", cazz(int ), (int)112)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == hp.cbac("cbit", cbah(int ), (int)107)) break;
            v10 /* !! */  = (long)hp.cbac("cbiu", cbah(int ), (int)108);
        }
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_8 = hp.ff - hp.cbac("cbiv", cazz(int ), (int)113)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == hp.cbac("cbiw", cbah(int ), (int)109)) {
                this.armorSwapHandler.reset();
                if (var1_3) return;
                break;
            }
            v11 /* !! */  = (long)hp.cbac("cbix", cbah(int ), (int)110);
        }
        if (var1_3) return;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_9 = hp.ff - hp.cbac("cbiy", cazz(int ), (int)114)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == hp.cbac("cbiz", cbah(int ), (int)111)) break;
            v12 /* !! */  = (long)hp.cbac("cbja", cbah(int ), (int)112);
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_10 = hp.ff - hp.cbac("cbjb", cazz(int ), (int)115)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == hp.cbac("cbjc", cbah(int ), (int)113)) {
                this.fireworkHandler.reset();
                if (var1_3) return;
                break;
            }
            v13 /* !! */  = (long)hp.cbac("cbjd", cbah(int ), (int)114);
        }
        if (var1_3) return;
        v14 /* !! */  = hp.ff;
        if (true) ** GOTO lbl109
        block48: while (true) {
            v14 /* !! */  = (long)(v15 - hp.cbac("cbje", cazz(int ), (int)116));
lbl109:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -893938952: {
                    v15 = hp.cbac("cbjf", cazz(int ), (int)117);
                    continue block48;
                }
                case 1050601319: {
                    break block48;
                }
                case 1572990852: {
                    v15 = hp.cbac("cbjg", cazz(int ), (int)118);
                    continue block48;
                }
            }
            break;
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_11 = hp.ff - hp.cbac("cbjh", cazz(int ), (int)119)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == hp.cbac("cbji", cbah(int ), (int)115)) {
                this.predictor.reset();
                if (var1_3) return;
                break;
            }
            v16 /* !! */  = (long)hp.cbac("cbjj", cbah(int ), (int)116);
        }
        if (var1_3) return;
        while (true) {
            if ((v17 /* !! */  = (cfr_temp_12 = hp.ff - hp.cbac("cbjk", cazz(int ), (int)120)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v17 /* !! */  == hp.cbac("cbjl", cbah(int ), (int)117)) break;
            v17 /* !! */  = (long)hp.cbac("cbjm", cbah(int ), (int)118);
        }
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_13 = hp.ff - hp.cbac("cbjn", cazz(int ), (int)121)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == hp.cbac("cbjo", cbah(int ), (int)119)) {
                this.fireworkTimer.reset();
                if (var1_3) return;
                break;
            }
            v18 /* !! */  = (long)hp.cbac("cbjp", cbah(int ), (int)120);
        }
        if (var1_3) {
            return;
        }
        if (var2_2 /* !! */  == 0) return;
        cfr_temp_0 = -2147483648;
        block52: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: {
                    return;
                }
                case 0: {
                    var2_2 /* !! */  = (int)hp.cbac("cbjq", cbah(int ), (int)121);
                    cfr_temp_0 = 6;
                    if (!var3_1) continue block52;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)hp.cbac("cbjt", cbah(int ), (int)124);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 5: {
                    var2_2 /* !! */  = (int)hp.cbac("cbjv", cbah(int ), (int)126);
                    cfr_temp_0 = 15;
                    if (!var3_1) continue block52;
                    throw null;
                }
                case 8: {
                    var2_2 /* !! */  = (int)hp.cbac("cbjy", cbah(int ), (int)129);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 7: {
                    var2_2 /* !! */  = (int)hp.cbac("cbjx", cbah(int ), (int)128);
                    cfr_temp_0 = 16;
                    if (!var3_1) continue block52;
                    throw null;
                }
                case 9: {
                    do {
                        var2_2 /* !! */  = (int)hp.cbac("cbjz", cbah(int ), (int)130);
                    } while (!var3_1);
                    throw null;
                }
                case 11: {
                    var2_2 /* !! */  = (int)hp.cbac("cbkb", cbah(int ), (int)132);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block52;
                    throw null;
                }
                case 13: {
                    var2_2 /* !! */  = (int)hp.cbac("cbkd", cbah(int ), (int)134);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 4: {
                    var2_2 /* !! */  = (int)hp.cbac("cbju", cbah(int ), (int)125);
                    cfr_temp_0 = 12;
                    if (!var3_1) continue block52;
                    throw null;
                }
                case 14: {
                    var2_2 /* !! */  = (int)hp.cbac("cbke", cbah(int ), (int)135);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: {
                    ** GOTO lbl222
                }
                case 15: {
                    var2_2 /* !! */  = (int)hp.cbac("cbkf", cbah(int ), (int)136);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 12: {
                    var2_2 /* !! */  = (int)hp.cbac("cbkc", cbah(int ), (int)133);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 10: {
                    var2_2 /* !! */  = (int)hp.cbac("cbka", cbah(int ), (int)131);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 16: {
                    var2_2 /* !! */  = (int)hp.cbac("cbkg", cbah(int ), (int)137);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 6: {
                    var2_2 /* !! */  = (int)hp.cbac("cbjw", cbah(int ), (int)127);
                    cfr_temp_0 = 2;
                    if (!var3_1) continue block52;
                    throw null;
                }
                case 17: lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hp.cbac("cbkh", cbah(int ), (int)138);
                    if (var3_1) {
                        throw null;
                    }
lbl222:
                    // 3 sources

                    var2_2 /* !! */  = (int)hp.cbac("cbjr", cbah(int ), (int)122);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)hp.cbac("cbjs", cbah(int ), (int)123);
        } while (!var3_1);
        throw null;
    }

    public static /* synthetic */ CallSite cbac(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public iq getFlightController() {
        Object object = ff;
        boolean bl2 = true;
        block24: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - hp.cbac("ccqo", cazz(int ), (int)404);
            }
            switch ((int)object) {
                case -362235709: {
                    callSite = hp.cbac("ccqp", cazz(int ), (int)405);
                    continue block24;
                }
                case -127869558: {
                    callSite = hp.cbac("ccqq", cazz(int ), (int)406);
                    continue block24;
                }
                case 1050601319: {
                    break block24;
                }
                case 1311913811: {
                    callSite = hp.cbac("ccqr", cazz(int ), (int)407);
                    continue block24;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ff;
        boolean bl4 = true;
        block25: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - hp.cbac("ccqs", cazz(int ), (int)408);
            }
            switch ((int)object2) {
                case -904132639: {
                    callSite = hp.cbac("ccqt", cazz(int ), (int)409);
                    continue block25;
                }
                case 524150255: {
                    callSite = hp.cbac("ccqu", cazz(int ), (int)410);
                    continue block25;
                }
                case 979254698: {
                    callSite = hp.cbac("ccqv", cazz(int ), (int)411);
                    continue block25;
                }
                case 1050601319: {
                    break block25;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ff;
        boolean bl5 = true;
        block26: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - hp.cbac("ccqw", cazz(int ), (int)412);
            }
            switch ((int)object3) {
                case -1496285813: {
                    callSite = hp.cbac("ccqx", cazz(int ), (int)413);
                    continue block26;
                }
                case 159299746: {
                    callSite = hp.cbac("ccqy", cazz(int ), (int)414);
                    continue block26;
                }
                case 1050601319: {
                    break block26;
                }
                case 1605678885: {
                    callSite = hp.cbac("ccqz", cazz(int ), (int)415);
                    continue block26;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return null;
        if (bl6) return null;
        Object object4 = ff;
        boolean bl7 = true;
        block27: while (true) {
            CallSite callSite;
            if (!bl7 || (bl7 = false) || !true) {
                object4 = callSite - hp.cbac("ccra", cazz(int ), (int)416);
            }
            switch ((int)object4) {
                case -1502838920: {
                    callSite = hp.cbac("ccrb", cazz(int ), (int)417);
                    continue block27;
                }
                case -1261884198: {
                    callSite = hp.cbac("ccrc", cazz(int ), (int)418);
                    continue block27;
                }
                case 538954599: {
                    callSite = hp.cbac("ccrd", cazz(int ), (int)419);
                    continue block27;
                }
                case 1050601319: {
                    return this.flightController;
                }
            }
            break;
        }
        return this.flightController;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ik getTargetFinder() {
        Object object = ff;
        boolean bl2 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - hp.cbac("cctr", cazz(int ), (int)447);
            }
            switch ((int)object) {
                case -1876047119: {
                    callSite = hp.cbac("ccts", cazz(int ), (int)448);
                    continue block17;
                }
                case -64443209: {
                    callSite = hp.cbac("cctt", cazz(int ), (int)449);
                    continue block17;
                }
                case 502852021: {
                    callSite = hp.cbac("cctu", cazz(int ), (int)450);
                    continue block17;
                }
                case 1050601319: {
                    break block17;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ff;
        boolean bl4 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - hp.cbac("cctv", cazz(int ), (int)451);
            }
            switch ((int)object2) {
                case -520171714: {
                    callSite = hp.cbac("cctw", cazz(int ), (int)452);
                    continue block18;
                }
                case 612549267: {
                    callSite = hp.cbac("cctx", cazz(int ), (int)453);
                    continue block18;
                }
                case 1050601319: {
                    break block18;
                }
                case 1341781005: {
                    callSite = hp.cbac("ccty", cazz(int ), (int)454);
                    continue block18;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ff;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - hp.cbac("cctz", cazz(int ), (int)455);
            }
            switch ((int)object3) {
                case -2143327913: {
                    callSite = hp.cbac("ccua", cazz(int ), (int)456);
                    continue block19;
                }
                case -1648103042: {
                    callSite = hp.cbac("ccub", cazz(int ), (int)457);
                    continue block19;
                }
                case 1050601319: {
                    break block19;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6) return null;
        if (bl6) return null;
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = ff - hp.cbac("ccuc", cazz(int ), (int)458)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == hp.cbac("ccud", cbah(int ), (int)595)) {
                return this.targetFinder;
            }
            object4 = hp.cbac("ccue", cbah(int ), (int)596);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isReallyWorldMode() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("cbct", cazz(int ), (int)22));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1959596657: {
                    v1 = hp.cbac("cbcu", cazz(int ), (int)23);
                    continue block21;
                }
                case 1050601319: {
                    break block21;
                }
                case 1166944238: {
                    v1 = hp.cbac("cbcv", cazz(int ), (int)24);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = hp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cbcw", cazz(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hp.cbac("cbcx", cbah(int ), (int)42)) break;
            v2 /* !! */  = (long)hp.cbac("cbcy", cbah(int ), (int)43);
        }
        var2_2 = hp.b;
        v3 /* !! */  = hp.ff;
        if (true) ** GOTO lbl26
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - hp.cbac("cbcz", cazz(int ), (int)26));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -702040652: {
                    v4 = hp.cbac("cbda", cazz(int ), (int)27);
                    continue block23;
                }
                case 284791074: {
                    v4 = hp.cbac("cbdb", cazz(int ), (int)28);
                    continue block23;
                }
                case 1050601319: {
                    break block23;
                }
            }
            break;
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl38:
            // 1 sources

            return (boolean)hp.cbac("cbdc", cbah(int ), (int)44);
        }
        ** while (var1_3 || var1_3)
lbl41:
        // 1 sources

        v5 /* !! */  = hp.ff;
        if (true) ** GOTO lbl45
        block25: while (true) {
            v5 /* !! */  = (long)(v6 - hp.cbac("cbdd", cazz(int ), (int)29));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 1050601319: {
                    break block25;
                }
                case 1461610834: {
                    v6 = hp.cbac("cbde", cazz(int ), (int)30);
                    continue block25;
                }
                case 1462248560: {
                    v6 = hp.cbac("cbdf", cazz(int ), (int)31);
                    continue block25;
                }
            }
            break;
        }
        v7 /* !! */  = hp.ff;
        if (true) ** GOTO lbl58
        block26: while (true) {
            v7 /* !! */  = (long)(v8 - hp.cbac("cbdg", cazz(int ), (int)32));
lbl58:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -2029517447: {
                    v8 = hp.cbac("cbdh", cazz(int ), (int)33);
                    continue block26;
                }
                case -1766849677: {
                    v8 = hp.cbac("cbdi", cazz(int ), (int)34);
                    continue block26;
                }
                case -193952710: {
                    v8 = hp.cbac("cbdj", cazz(int ), (int)35);
                    continue block26;
                }
                case 1050601319: {
                    break block26;
                }
            }
            break;
        }
        v9 = this.serverMode.getValue();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("cbdk", cazz(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v10 /* !! */  == hp.cbac("cbdl", cbah(int ), (int)45)) break;
            v10 /* !! */  = (long)hp.cbac("cbdm", cbah(int ), (int)46);
        }
        return v9.equals("ReallyWorld");
    }

    static {
        cbaj = new int[615];
        hp.ccvm();
        hp.ccvn();
        hp.ccvo();
        hp.ccvp();
        hp.ccvq();
        hp.ccvr();
        hp.ccvs();
        hp.ccvt();
        hp.ccvu();
        hp.ccvv();
        hp.ccvw();
        hp.ccvx();
        hp.ccvy();
        hp.ccvz();
        cbaa = new long[474];
        cbab = new long[474];
        hp.ccwa();
        hp.ccwb();
        hp.ccwc();
        hp.ccwd();
        hp.ccwe();
        hp.ccwf();
        hp.ccwg();
        hp.ccwh();
        hp.ccwi();
        hp.ccwj();
    }

    private static /* synthetic */ float cbax(int n2) {
        return Float.intBitsToFloat(cbai[n2] ^ cbaj[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void equipChestplateOnDisable() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block32: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("cbok", cazz(int ), (int)176));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1511452097: {
                    v1 = hp.cbac("cbol", cazz(int ), (int)177);
                    continue block32;
                }
                case 1050601319: {
                    break block32;
                }
                case 1634506796: {
                    v1 = hp.cbac("cbom", cazz(int ), (int)178);
                    continue block32;
                }
            }
            break;
        }
        var5_1 = hp.c;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl19
        block33: while (true) {
            v2 /* !! */  = (long)(hp.cbac("cboo", cazz(int ), (int)180) - hp.cbac("cbon", cazz(int ), (int)179));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1144364938: {
                    continue block33;
                }
                case 1050601319: {
                    break block33;
                }
            }
            break;
        }
        var4_2 /* !! */  = hp.b;
        v3 /* !! */  = hp.ff;
        if (true) ** GOTO lbl29
        block34: while (true) {
            v3 /* !! */  = (long)(hp.cbac("cboq", cazz(int ), (int)182) - hp.cbac("cbop", cazz(int ), (int)181));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -454441734: {
                    continue block34;
                }
                case 1050601319: {
                    break block34;
                }
            }
            break;
        }
        var3_3 = hp.a;
        if (var5_1) {
            throw null;
lbl37:
            // 9 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cbor", cazz(int ), (int)183)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == hp.cbac("cbos", cbah(int ), (int)191)) break;
            v4 /* !! */  = (long)hp.cbac("cbot", cbah(int ), (int)192);
        }
        if (!nv.hasElytra()) ** GOTO lbl82
        if (var3_3 || var3_3) ** GOTO lbl37
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("cbou", cazz(int ), (int)184)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == hp.cbac("cbov", cbah(int ), (int)193)) break;
            v5 /* !! */  = (long)hp.cbac("cbow", cbah(int ), (int)194);
        }
        var1_4 = nv.findChestArmorSlot();
        if (var3_3 || var3_3) ** GOTO lbl37
        if (var1_4 == hp.cbac("cbox", cbah(int ), (int)195)) ** GOTO lbl82
        if (var3_3 || var3_3) ** GOTO lbl37
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("cboy", cazz(int ), (int)185)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == hp.cbac("cboz", cbah(int ), (int)196)) break;
            v6 /* !! */  = (long)hp.cbac("cbpa", cbah(int ), (int)197);
        }
        var2_5 = nv.wrapSlot(var1_4);
        if (var3_3) ** GOTO lbl37
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl37
                v7 = hp.cbac("cbpb", cbah(int ), (int)198);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = hp.ff - hp.cbac("cbpc", cazz(int ), (int)186)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hp.cbac("cbpd", cbah(int ), (int)199)) break;
                    v8 /* !! */  = (long)hp.cbac("cbpe", cbah(int ), (int)200);
                }
                nv.swap(var2_5, (int)v7);
                if (var3_3 || var3_3) ** GOTO lbl37
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_4 = hp.ff - hp.cbac("cbpf", cazz(int ), (int)187)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == hp.cbac("cbpg", cbah(int ), (int)201)) break;
                    v9 /* !! */  = (long)hp.cbac("cbph", cbah(int ), (int)202);
                }
                nv.closeScreen();
                if (var3_3) ** GOTO lbl37
lbl82:
                // 3 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return;
            }
lbl85:
            // 3 sources

            case 0: {
                var4_2 /* !! */  = (int)hp.cbac("cbpi", cbah(int ), (int)203);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 1: {
                var4_2 /* !! */  = (int)hp.cbac("cbpj", cbah(int ), (int)204);
                if (!var5_1) ** GOTO lbl85
                throw null;
            }
lbl94:
            // 3 sources

            case 2: {
                var4_2 /* !! */  = (int)hp.cbac("cbpk", cbah(int ), (int)205);
                if (!var5_1) ** GOTO lbl85
                throw null;
            }
            case 3: {
                var4_2 /* !! */  = (int)hp.cbac("cbpl", cbah(int ), (int)206);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
lbl103:
            // 4 sources

            case 4: {
                var4_2 /* !! */  = (int)hp.cbac("cbpm", cbah(int ), (int)207);
                if (!var5_1) ** GOTO lbl94
                throw null;
            }
lbl107:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)hp.cbac("cbpn", cbah(int ), (int)208);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl146
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)hp.cbac("cbpo", cbah(int ), (int)209);
                    if (!var5_1) ** GOTO lbl94
                    throw null;
                }
            }
lbl117:
            // 2 sources

            case 7: {
                var4_2 /* !! */  = (int)hp.cbac("cbpp", cbah(int ), (int)210);
                if (!var5_1) ** GOTO lbl107
                throw null;
            }
            case 8: {
                var4_2 /* !! */  = (int)hp.cbac("cbpq", cbah(int ), (int)211);
                if (!var5_1) ** GOTO lbl103
                throw null;
            }
lbl125:
            // 2 sources

            case 9: {
                var4_2 /* !! */  = (int)hp.cbac("cbpr", cbah(int ), (int)212);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl142
            }
            case 10: {
                var4_2 /* !! */  = (int)hp.cbac("cbps", cbah(int ), (int)213);
                if (!var5_1) ** GOTO lbl103
                throw null;
            }
lbl134:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)hp.cbac("cbpt", cbah(int ), (int)214);
                if (var5_1) {
                    throw null;
                }
            }
            case 12: {
                var4_2 /* !! */  = (int)hp.cbac("cbpu", cbah(int ), (int)215);
                if (!var5_1) ** GOTO lbl125
                throw null;
            }
lbl142:
            // 3 sources

            case 13: {
                var4_2 /* !! */  = (int)hp.cbac("cbpv", cbah(int ), (int)216);
                if (!var5_1) ** GOTO lbl134
                throw null;
            }
lbl146:
            // 2 sources

            case 14: {
                var4_2 /* !! */  = (int)hp.cbac("cbpw", cbah(int ), (int)217);
                if (!var5_1) ** GOTO lbl103
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)hp.cbac("cbpx", cbah(int ), (int)218);
                if (!var5_1) break;
                throw null;
            }
            case 16: 
        }
        var4_2 /* !! */  = (int)hp.cbac("cbpy", cbah(int ), (int)219);
        ** while (!var5_1)
lbl157:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ccvp() {
        hp.cbai[300] = -901424546;
        hp.cbai[301] = -1091217299;
        hp.cbai[302] = -1835864536;
        hp.cbai[303] = 1511691759;
        hp.cbai[304] = 1992436694;
        hp.cbai[305] = 688343791;
        hp.cbai[306] = 130408039;
        hp.cbai[307] = -1030659195;
        hp.cbai[308] = -682161264;
        hp.cbai[309] = 750399314;
        hp.cbai[310] = -1619174826;
        hp.cbai[311] = -2120251513;
        hp.cbai[312] = -647198620;
        hp.cbai[313] = 493070805;
        hp.cbai[314] = 1623181823;
        hp.cbai[315] = -1633643891;
        hp.cbai[316] = 389257412;
        hp.cbai[317] = 1854195544;
        hp.cbai[318] = -628235742;
        hp.cbai[319] = 1411605647;
        hp.cbai[320] = -1879057603;
        hp.cbai[321] = -1881798262;
        hp.cbai[322] = -353828262;
        hp.cbai[323] = 1726570675;
        hp.cbai[324] = -1727453774;
        hp.cbai[325] = 763606305;
        hp.cbai[326] = 1766953537;
        hp.cbai[327] = -820139306;
        hp.cbai[328] = 1114773789;
        hp.cbai[329] = 1907884013;
        hp.cbai[330] = 1806972679;
        hp.cbai[331] = -850087717;
        hp.cbai[332] = 1612229123;
        hp.cbai[333] = -431553340;
        hp.cbai[334] = 1423306400;
        hp.cbai[335] = 1462010804;
        hp.cbai[336] = -1534011710;
        hp.cbai[337] = 1412080786;
        hp.cbai[338] = 867986425;
        hp.cbai[339] = -1792358956;
        hp.cbai[340] = -973538374;
        hp.cbai[341] = -1464159880;
        hp.cbai[342] = 1704018105;
        hp.cbai[343] = 1851601042;
        hp.cbai[344] = 727349882;
        hp.cbai[345] = 1349521477;
        hp.cbai[346] = -330059862;
        hp.cbai[347] = -1899104543;
        hp.cbai[348] = -851400298;
        hp.cbai[349] = 987596668;
        hp.cbai[350] = 836595789;
        hp.cbai[351] = -1608999748;
        hp.cbai[352] = -842580237;
        hp.cbai[353] = -215342255;
        hp.cbai[354] = 1418747181;
        hp.cbai[355] = 615259545;
        hp.cbai[356] = 65007340;
        hp.cbai[357] = -1494213866;
        hp.cbai[358] = 919732268;
        hp.cbai[359] = -453575023;
        hp.cbai[360] = -1522332477;
        hp.cbai[361] = 595438648;
        hp.cbai[362] = -82769768;
        hp.cbai[363] = 862607101;
        hp.cbai[364] = -1578153254;
        hp.cbai[365] = -1935408747;
        hp.cbai[366] = -1931610584;
        hp.cbai[367] = -1076246136;
        hp.cbai[368] = -1313409256;
        hp.cbai[369] = 1273565158;
        hp.cbai[370] = -352712562;
        hp.cbai[371] = -1870965461;
        hp.cbai[372] = -1767922922;
        hp.cbai[373] = -1126762889;
        hp.cbai[374] = 1102093873;
        hp.cbai[375] = -1631879548;
        hp.cbai[376] = 847456082;
        hp.cbai[377] = 1932000492;
        hp.cbai[378] = 400369298;
        hp.cbai[379] = -592225618;
        hp.cbai[380] = 292861429;
        hp.cbai[381] = -702936249;
        hp.cbai[382] = 1754636645;
        hp.cbai[383] = -1969865245;
        hp.cbai[384] = 1764252528;
        hp.cbai[385] = -859897665;
        hp.cbai[386] = -1959968864;
        hp.cbai[387] = -1132129637;
        hp.cbai[388] = -1546869777;
        hp.cbai[389] = 1418824694;
        hp.cbai[390] = -93849396;
        hp.cbai[391] = 2073140431;
        hp.cbai[392] = 1468880616;
        hp.cbai[393] = 904686097;
        hp.cbai[394] = -972206;
        hp.cbai[395] = 1486630295;
        hp.cbai[396] = -202277245;
        hp.cbai[397] = 192688039;
        hp.cbai[398] = -1078684709;
        hp.cbai[399] = -1453684087;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kf getModeSetting() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccmx", cazz(int ), (int)363)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hp.cbac("ccmy", cbah(int ), (int)503)) break;
            v0 /* !! */  = (long)hp.cbac("ccmz", cbah(int ), (int)504);
        }
        var3_1 = hp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccna", cazz(int ), (int)364)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hp.cbac("ccnb", cbah(int ), (int)505)) break;
            v1 /* !! */  = (long)hp.cbac("ccnc", cbah(int ), (int)506);
        }
        var2_2 /* !! */  = hp.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccnd", cazz(int ), (int)365)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hp.cbac("ccne", cbah(int ), (int)507)) break;
            v2 /* !! */  = (long)hp.cbac("ccnf", cbah(int ), (int)508);
        }
        var1_3 = hp.a;
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
                    if ((v3 /* !! */  = (cfr_temp_3 = hp.ff - hp.cbac("ccng", cazz(int ), (int)366)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hp.cbac("ccnh", cbah(int ), (int)509)) break;
                    v3 /* !! */  = (long)hp.cbac("ccni", cbah(int ), (int)510);
                }
                return this.modeSetting;
            }
            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("ccnj", cbah(int ), (int)511);
                if (var3_1) {
                    throw null;
                }
            }
lbl42:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("ccnk", cbah(int ), (int)512);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("ccnl", cbah(int ), (int)513);
                if (!var3_1) ** GOTO lbl42
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hp.cbac("ccnm", cbah(int ), (int)514);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public pr getFireworkTimer() {
        v0 /* !! */  = hp.ff;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - hp.cbac("ccuj", cazz(int ), (int)459));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 919211939: {
                    v1 = hp.cbac("ccuk", cazz(int ), (int)460);
                    continue block15;
                }
                case 1050601319: {
                    break block15;
                }
                case 1324133150: {
                    v1 = hp.cbac("ccul", cazz(int ), (int)461);
                    continue block15;
                }
            }
            break;
        }
        var3_1 = hp.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccum", cazz(int ), (int)462)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hp.cbac("ccun", cbah(int ), (int)601)) break;
            v2 /* !! */  = (long)hp.cbac("ccuo", cbah(int ), (int)602);
        }
        var2_2 /* !! */  = hp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccup", cazz(int ), (int)463)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hp.cbac("ccuq", cbah(int ), (int)603)) break;
            v3 /* !! */  = (long)hp.cbac("ccur", cbah(int ), (int)604);
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = hp.ff;
                if (true) ** GOTO lbl42
                block19: while (true) {
                    v4 /* !! */  = (long)(hp.cbac("ccut", cazz(int ), (int)465) - hp.cbac("ccus", cazz(int ), (int)464));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 542007140: {
                            continue block19;
                        }
                        case 1050601319: {
                            break block19;
                        }
                    }
                    break;
                }
                return this.fireworkTimer;
            }
            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("ccuu", cbah(int ), (int)605);
                if (!var3_1) break;
                throw null;
            }
lbl52:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("ccuv", cbah(int ), (int)606);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("ccuw", cbah(int ), (int)607);
                if (!var3_1) ** GOTO lbl52
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)hp.cbac("ccux", cbah(int ), (int)608);
        } while (!var3_1);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public is getStageHandler() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ff - hp.cbac("cctc", cazz(int ), (int)442)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == hp.cbac("cctd", cbah(int ), (int)585)) break;
            object = hp.cbac("ccte", cbah(int ), (int)586);
        }
        boolean bl3 = c;
        Object object = ff;
        block5: while (true) {
            switch ((int)object) {
                case 1050601319: {
                    break block5;
                }
                case 1150835739: {
                    object = hp.cbac("cctg", cazz(int ), (int)444) - hp.cbac("cctf", cazz(int ), (int)443);
                    continue block5;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object2;
            if ((object2 = (l3 = ff - hp.cbac("ccth", cazz(int ), (int)445)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object2 == hp.cbac("ccti", cbah(int ), (int)587)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object2 = hp.cbac("cctj", cbah(int ), (int)588);
        }
        if (bl2) return null;
        if (bl2) return null;
        while (true) {
            long l4;
            Object object3;
            if ((object3 = (l4 = ff - hp.cbac("cctk", cazz(int ), (int)446)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object3 == hp.cbac("cctl", cbah(int ), (int)589)) {
                return this.stageHandler;
            }
            object3 = hp.cbac("cctm", cbah(int ), (int)590);
        }
    }

    private static /* synthetic */ void ccwf() {
        hp.cbab[0] = -8573512959607536100L;
        hp.cbab[1] = 5447778462251363892L;
        hp.cbab[2] = 1249522303508189714L;
        hp.cbab[3] = -6413258926504338779L;
        hp.cbab[4] = -1202354880619430125L;
        hp.cbab[5] = 9188785133447188639L;
        hp.cbab[6] = -546904920936753696L;
        hp.cbab[7] = 1545057892849498492L;
        hp.cbab[8] = -2742649460326257126L;
        hp.cbab[9] = -1939002225328750796L;
        hp.cbab[10] = -3231763726404172356L;
        hp.cbab[11] = 8951949443666082361L;
        hp.cbab[12] = -998157482028087559L;
        hp.cbab[13] = -7211933512727478136L;
        hp.cbab[14] = 795461830718357733L;
        hp.cbab[15] = 1996988450601687332L;
        hp.cbab[16] = -4183350043251902527L;
        hp.cbab[17] = 6540079409649077131L;
        hp.cbab[18] = -8246874734186693457L;
        hp.cbab[19] = 2745314902829238724L;
        hp.cbab[20] = -3723174172104524496L;
        hp.cbab[21] = 422101801008632674L;
        hp.cbab[22] = -2192152316263154153L;
        hp.cbab[23] = 3712500031969585318L;
        hp.cbab[24] = 6748423873684645270L;
        hp.cbab[25] = -8469571112348097174L;
        hp.cbab[26] = -1768465179767451942L;
        hp.cbab[27] = -8495635649412377042L;
        hp.cbab[28] = 1064704065265255397L;
        hp.cbab[29] = -3168726673413059234L;
        hp.cbab[30] = 6848998761190952840L;
        hp.cbab[31] = -7641684235481991550L;
        hp.cbab[32] = -1711215078351285884L;
        hp.cbab[33] = -3023323361961836001L;
        hp.cbab[34] = -4145139407809123863L;
        hp.cbab[35] = -195615205842103061L;
        hp.cbab[36] = -1918965629325835551L;
        hp.cbab[37] = -8296423782660702543L;
        hp.cbab[38] = -2782499914199720634L;
        hp.cbab[39] = -8427703419550758305L;
        hp.cbab[40] = -3234317646340329066L;
        hp.cbab[41] = 6345901034416066864L;
        hp.cbab[42] = 9142624162483134524L;
        hp.cbab[43] = -2601252239741684600L;
        hp.cbab[44] = -1149639648484033474L;
        hp.cbab[45] = -1308662439398836181L;
        hp.cbab[46] = 6059093452315033363L;
        hp.cbab[47] = -3330021980241558709L;
        hp.cbab[48] = -6029655076498898557L;
        hp.cbab[49] = 5674611673654098786L;
        hp.cbab[50] = 8852466060083581020L;
        hp.cbab[51] = 7320945852315031187L;
        hp.cbab[52] = 4182207188597701038L;
        hp.cbab[53] = 8854490008212244955L;
        hp.cbab[54] = -3081358075336873416L;
        hp.cbab[55] = 3877190183408385386L;
        hp.cbab[56] = -7818244724988762057L;
        hp.cbab[57] = -1544571973610419309L;
        hp.cbab[58] = 2192908864882936999L;
        hp.cbab[59] = -5510922215933363099L;
        hp.cbab[60] = -228862460125990171L;
        hp.cbab[61] = 9203834744777288661L;
        hp.cbab[62] = -5662692251198675317L;
        hp.cbab[63] = 5215045926452585334L;
        hp.cbab[64] = 417116455762452996L;
        hp.cbab[65] = -6370788813011890894L;
        hp.cbab[66] = -3661404946704539038L;
        hp.cbab[67] = -5918592334108074699L;
        hp.cbab[68] = -3894991583069232018L;
        hp.cbab[69] = -9170521199568902356L;
        hp.cbab[70] = -208425658333405440L;
        hp.cbab[71] = 1154309838276529809L;
        hp.cbab[72] = -8244390516745034226L;
        hp.cbab[73] = -386190377524135698L;
        hp.cbab[74] = 7263518247922381446L;
        hp.cbab[75] = -900805863416992101L;
        hp.cbab[76] = -2876752772075946894L;
        hp.cbab[77] = 5316821881688540985L;
        hp.cbab[78] = 3429862236451371331L;
        hp.cbab[79] = -2348897894005052478L;
        hp.cbab[80] = -1724190270724289651L;
        hp.cbab[81] = -3564941775079991991L;
        hp.cbab[82] = 3195136911117224116L;
        hp.cbab[83] = 4036428671425145888L;
        hp.cbab[84] = 3028248201794450527L;
        hp.cbab[85] = 4897532609428697775L;
        hp.cbab[86] = -4509308777953371797L;
        hp.cbab[87] = -4073236006838567390L;
        hp.cbab[88] = -1914453282115180628L;
        hp.cbab[89] = -3059146658791497531L;
        hp.cbab[90] = 5193794440001233534L;
        hp.cbab[91] = 800651472318298032L;
        hp.cbab[92] = -4070498622353883111L;
        hp.cbab[93] = -5857101859839514774L;
        hp.cbab[94] = -1025112383711961053L;
        hp.cbab[95] = -4830881571615795764L;
        hp.cbab[96] = -3551044656316882199L;
        hp.cbab[97] = 826805690184494578L;
        hp.cbab[98] = 5894782503640409254L;
        hp.cbab[99] = 5949809383291876700L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void processStage() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccag", cazz(int ), (int)188)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == hp.cbac("ccah", cbah(int ), (int)349)) break;
            v0 /* !! */  = (long)hp.cbac("ccai", cbah(int ), (int)350);
        }
        var5_1 = hp.c;
        v1 /* !! */  = hp.ff;
        if (true) ** GOTO lbl11
        block83: while (true) {
            v1 /* !! */  = (long)(v2 - hp.cbac("ccaj", cazz(int ), (int)189));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 449486816: {
                    v2 = hp.cbac("ccak", cazz(int ), (int)190);
                    continue block83;
                }
                case 1050601319: {
                    break block83;
                }
                case 1108366510: {
                    v2 = hp.cbac("ccal", cazz(int ), (int)191);
                    continue block83;
                }
            }
            break;
        }
        var4_2 = hp.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccam", cazz(int ), (int)192)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hp.cbac("ccan", cbah(int ), (int)351)) break;
            v3 /* !! */  = (long)hp.cbac("ccao", cbah(int ), (int)352);
        }
        var3_3 = hp.a;
        if (var5_1) {
            throw null;
lbl29:
            // 12 sources

            return;
        }
        if (var3_3 || var3_3) ** GOTO lbl29
        v4 /* !! */  = hp.ff;
        if (true) ** GOTO lbl36
        block86: while (true) {
            v4 /* !! */  = (long)(v5 - hp.cbac("ccap", cazz(int ), (int)193));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1752458481: {
                    v5 = hp.cbac("ccaq", cazz(int ), (int)194);
                    continue block86;
                }
                case 775982020: {
                    v5 = hp.cbac("ccar", cazz(int ), (int)195);
                    continue block86;
                }
                case 1050601319: {
                    break block86;
                }
            }
            break;
        }
        var1_4 = nv.hasElytra();
        if (var3_3 || var3_3) ** GOTO lbl29
        v6 /* !! */  = hp.ff;
        if (true) ** GOTO lbl51
        block87: while (true) {
            v6 /* !! */  = (long)(hp.cbac("ccat", cazz(int ), (int)197) - hp.cbac("ccas", cazz(int ), (int)196));
lbl51:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -478549646: {
                    continue block87;
                }
                case 1050601319: {
                    break block87;
                }
            }
            break;
        }
        v7 /* !! */  = hp.ff;
        if (true) ** GOTO lbl60
        block88: while (true) {
            v7 /* !! */  = (long)(hp.cbac("ccav", cazz(int ), (int)199) - hp.cbac("ccau", cazz(int ), (int)198));
lbl60:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 1050601319: {
                    break block88;
                }
                case 1993878917: {
                    continue block88;
                }
            }
            break;
        }
        var2_5 = this.stageHandler.getStage();
        if (var3_3 || var3_3) ** GOTO lbl29
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccaw", cazz(int ), (int)200)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == hp.cbac("ccax", cbah(int ), (int)353)) break;
            v8 /* !! */  = (long)hp.cbac("ccay", cbah(int ), (int)354);
        }
        v9 /* !! */  = hp.ff;
        if (true) ** GOTO lbl76
        block90: while (true) {
            v9 /* !! */  = (long)(v10 - hp.cbac("ccaz", cazz(int ), (int)201));
lbl76:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -702037110: {
                    v10 = hp.cbac("ccba", cazz(int ), (int)202);
                    continue block90;
                }
                case 34907024: {
                    v10 = hp.cbac("ccbb", cazz(int ), (int)203);
                    continue block90;
                }
                case 1050601319: {
                    break block90;
                }
            }
            break;
        }
        switch (hp$1.$SwitchMap$ruhack$phobia$system$modulesystem$impl$rage$macetarget$state$MaceState$Stage[var2_5.ordinal()]) {
            case 4: {
                if (var3_3 || var3_3) ** GOTO lbl29
                v11 /* !! */  = hp.ff;
                if (true) ** GOTO lbl92
                block91: while (true) {
                    v11 /* !! */  = (long)(v12 - hp.cbac("ccbc", cazz(int ), (int)204));
lbl92:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1698576139: {
                            v12 = hp.cbac("ccbd", cazz(int ), (int)205);
                            continue block91;
                        }
                        case 753694503: {
                            v12 = hp.cbac("ccbe", cazz(int ), (int)206);
                            continue block91;
                        }
                        case 940144305: {
                            v12 = hp.cbac("ccbf", cazz(int ), (int)207);
                            continue block91;
                        }
                        case 1050601319: {
                            break block91;
                        }
                    }
                    break;
                }
                v13 /* !! */  = hp.ff;
                if (true) ** GOTO lbl108
                block92: while (true) {
                    v13 /* !! */  = (long)(v14 - hp.cbac("ccbg", cazz(int ), (int)208));
lbl108:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -2028460340: {
                            v14 = hp.cbac("ccbh", cazz(int ), (int)209);
                            continue block92;
                        }
                        case -1847463791: {
                            v14 = hp.cbac("ccbi", cazz(int ), (int)210);
                            continue block92;
                        }
                        case 1050601319: {
                            break block92;
                        }
                    }
                    break;
                }
                this.stageHandler.handlePrepare(var1_4);
                if (var3_3) ** GOTO lbl29
                if (!var5_1) break;
                throw null;
            }
            case 1: {
                if (var3_3 || var3_3) ** GOTO lbl29
                v15 /* !! */  = hp.ff;
                if (true) ** GOTO lbl127
                block93: while (true) {
                    v15 /* !! */  = (long)(v16 - hp.cbac("ccbj", cazz(int ), (int)211));
lbl127:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case 1050601319: {
                            break block93;
                        }
                        case 1488197062: {
                            v16 = hp.cbac("ccbk", cazz(int ), (int)212);
                            continue block93;
                        }
                        case 1674503331: {
                            v16 = hp.cbac("ccbl", cazz(int ), (int)213);
                            continue block93;
                        }
                    }
                    break;
                }
                v17 /* !! */  = hp.ff;
                if (true) ** GOTO lbl140
                block94: while (true) {
                    v17 /* !! */  = (long)(v18 - hp.cbac("ccbm", cazz(int ), (int)214));
lbl140:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -772192938: {
                            v18 = hp.cbac("ccbn", cazz(int ), (int)215);
                            continue block94;
                        }
                        case -497772208: {
                            v18 = hp.cbac("ccbo", cazz(int ), (int)216);
                            continue block94;
                        }
                        case 1050601319: {
                            break block94;
                        }
                    }
                    break;
                }
                v19 /* !! */  = hp.ff;
                if (true) ** GOTO lbl153
                block95: while (true) {
                    v19 /* !! */  = (long)(v20 - hp.cbac("ccbp", cazz(int ), (int)217));
lbl153:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 1050601319: {
                            break block95;
                        }
                        case 1967218100: {
                            v20 = hp.cbac("ccbq", cazz(int ), (int)218);
                            continue block95;
                        }
                        case 2127904849: {
                            v20 = hp.cbac("ccbr", cazz(int ), (int)219);
                            continue block95;
                        }
                    }
                    break;
                }
                this.stageHandler.handleFlyingUp(this.target, var1_4);
                if (var3_3) ** GOTO lbl29
                if (!var5_1) break;
                throw null;
            }
            case 2: {
                if (var3_3 || var3_3) ** GOTO lbl29
                v21 /* !! */  = hp.ff;
                if (true) ** GOTO lbl172
                block96: while (true) {
                    v21 /* !! */  = (long)(v22 - hp.cbac("ccbs", cazz(int ), (int)220));
lbl172:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -2059193355: {
                            v22 = hp.cbac("ccbt", cazz(int ), (int)221);
                            continue block96;
                        }
                        case -332391694: {
                            v22 = hp.cbac("ccbu", cazz(int ), (int)222);
                            continue block96;
                        }
                        case 1050601319: {
                            break block96;
                        }
                    }
                    break;
                }
                v23 /* !! */  = hp.ff;
                if (true) ** GOTO lbl185
                block97: while (true) {
                    v23 /* !! */  = (long)(v24 - hp.cbac("ccbv", cazz(int ), (int)223));
lbl185:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1398887702: {
                            v24 = hp.cbac("ccbw", cazz(int ), (int)224);
                            continue block97;
                        }
                        case -1353738800: {
                            v24 = hp.cbac("ccbx", cazz(int ), (int)225);
                            continue block97;
                        }
                        case 84929983: {
                            v24 = hp.cbac("ccby", cazz(int ), (int)226);
                            continue block97;
                        }
                        case 1050601319: {
                            break block97;
                        }
                    }
                    break;
                }
                v25 /* !! */  = hp.ff;
                if (true) ** GOTO lbl201
                block98: while (true) {
                    v25 /* !! */  = (long)(v26 - hp.cbac("ccbz", cazz(int ), (int)227));
lbl201:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -776385935: {
                            v26 = hp.cbac("ccca", cazz(int ), (int)228);
                            continue block98;
                        }
                        case 766699648: {
                            v26 = hp.cbac("cccb", cazz(int ), (int)229);
                            continue block98;
                        }
                        case 870835854: {
                            v26 = hp.cbac("cccc", cazz(int ), (int)230);
                            continue block98;
                        }
                        case 1050601319: {
                            break block98;
                        }
                    }
                    break;
                }
                this.stageHandler.handleTargetting(this.target);
                if (var3_3) ** GOTO lbl29
                if (!var5_1) break;
                throw null;
            }
            case 3: {
                if (var3_3 || var3_3) ** GOTO lbl29
                v27 /* !! */  = hp.ff;
                if (true) ** GOTO lbl223
                block99: while (true) {
                    v27 /* !! */  = (long)(v28 - hp.cbac("cccd", cazz(int ), (int)231));
lbl223:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case 898389048: {
                            v28 = hp.cbac("ccce", cazz(int ), (int)232);
                            continue block99;
                        }
                        case 1050601319: {
                            break block99;
                        }
                        case 2060399520: {
                            v28 = hp.cbac("cccf", cazz(int ), (int)233);
                            continue block99;
                        }
                    }
                    break;
                }
                v29 /* !! */  = hp.ff;
                if (true) ** GOTO lbl236
                block100: while (true) {
                    v29 /* !! */  = (long)(v30 - hp.cbac("cccg", cazz(int ), (int)234));
lbl236:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1994986836: {
                            v30 = hp.cbac("ccch", cazz(int ), (int)235);
                            continue block100;
                        }
                        case -1509062582: {
                            v30 = hp.cbac("ccci", cazz(int ), (int)236);
                            continue block100;
                        }
                        case 1050601319: {
                            break block100;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_3 = hp.ff - hp.cbac("cccj", cazz(int ), (int)237)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == hp.cbac("ccck", cbah(int ), (int)355)) break;
                    v31 /* !! */  = (long)hp.cbac("cccl", cbah(int ), (int)356);
                }
                this.stageHandler.handleAttacking(this.target, var1_4);
                if (var3_3) ** break;
            }
        }
        if (!var3_3 && !var3_3) ** break;
        ** while (true)
    }

    private static /* synthetic */ int cbah(int n2) {
        return cbai[n2] ^ cbaj[n2];
    }

    private static /* synthetic */ void ccvm() {
        hp.cbai[0] = 72386228;
        hp.cbai[1] = -1484755615;
        hp.cbai[2] = -1542578788;
        hp.cbai[3] = -1797604041;
        hp.cbai[4] = -1015246747;
        hp.cbai[5] = 509010432;
        hp.cbai[6] = 1339159543;
        hp.cbai[7] = 1215201313;
        hp.cbai[8] = -472345222;
        hp.cbai[9] = -1885408819;
        hp.cbai[10] = -91623131;
        hp.cbai[11] = 1081702398;
        hp.cbai[12] = 1532208322;
        hp.cbai[13] = 1025066658;
        hp.cbai[14] = 657758352;
        hp.cbai[15] = 829776300;
        hp.cbai[16] = 678851949;
        hp.cbai[17] = -49061392;
        hp.cbai[18] = -985898878;
        hp.cbai[19] = 772006861;
        hp.cbai[20] = -1553464760;
        hp.cbai[21] = -943702819;
        hp.cbai[22] = 173110791;
        hp.cbai[23] = 2099922153;
        hp.cbai[24] = -1931566594;
        hp.cbai[25] = 1319836676;
        hp.cbai[26] = -1548747086;
        hp.cbai[27] = 475000725;
        hp.cbai[28] = -1470508842;
        hp.cbai[29] = 324885455;
        hp.cbai[30] = 805539527;
        hp.cbai[31] = -1935200604;
        hp.cbai[32] = 1338744866;
        hp.cbai[33] = 85344985;
        hp.cbai[34] = 492025967;
        hp.cbai[35] = -944982763;
        hp.cbai[36] = -34966979;
        hp.cbai[37] = -1531797032;
        hp.cbai[38] = 954043841;
        hp.cbai[39] = 1431783736;
        hp.cbai[40] = -1938284642;
        hp.cbai[41] = 1689273620;
        hp.cbai[42] = 1303294425;
        hp.cbai[43] = -1985505126;
        hp.cbai[44] = -322141834;
        hp.cbai[45] = 474034404;
        hp.cbai[46] = 1947129662;
        hp.cbai[47] = 1147270418;
        hp.cbai[48] = 104830867;
        hp.cbai[49] = -372029986;
        hp.cbai[50] = -1652374794;
        hp.cbai[51] = 240330416;
        hp.cbai[52] = -1833124756;
        hp.cbai[53] = -363575990;
        hp.cbai[54] = -1113857388;
        hp.cbai[55] = -239502006;
        hp.cbai[56] = 504950747;
        hp.cbai[57] = -623295363;
        hp.cbai[58] = -304272842;
        hp.cbai[59] = -844745844;
        hp.cbai[60] = 213169177;
        hp.cbai[61] = 695280707;
        hp.cbai[62] = 2064666555;
        hp.cbai[63] = 710170122;
        hp.cbai[64] = 3898245;
        hp.cbai[65] = -1308957529;
        hp.cbai[66] = 88377850;
        hp.cbai[67] = -738638404;
        hp.cbai[68] = 1972846444;
        hp.cbai[69] = 346857393;
        hp.cbai[70] = 2085088188;
        hp.cbai[71] = -1102559624;
        hp.cbai[72] = -2087403982;
        hp.cbai[73] = 1493738473;
        hp.cbai[74] = 623319480;
        hp.cbai[75] = -382098103;
        hp.cbai[76] = -1909004090;
        hp.cbai[77] = -1067653298;
        hp.cbai[78] = 2034084105;
        hp.cbai[79] = -1304202993;
        hp.cbai[80] = -227249144;
        hp.cbai[81] = 24890831;
        hp.cbai[82] = -1942311860;
        hp.cbai[83] = 1221363213;
        hp.cbai[84] = 189755790;
        hp.cbai[85] = 825035400;
        hp.cbai[86] = -560635826;
        hp.cbai[87] = -1762522785;
        hp.cbai[88] = -734415836;
        hp.cbai[89] = 1042466631;
        hp.cbai[90] = 979105622;
        hp.cbai[91] = -76476620;
        hp.cbai[92] = 169630098;
        hp.cbai[93] = 2015530287;
        hp.cbai[94] = -208699360;
        hp.cbai[95] = 681163322;
        hp.cbai[96] = -1915941060;
        hp.cbai[97] = 1922342760;
        hp.cbai[98] = -445303482;
        hp.cbai[99] = -1024104234;
    }

    private static /* synthetic */ void ccvz() {
        hp.cbaj[600] = -1828393733;
        hp.cbaj[601] = 1829445560;
        hp.cbaj[602] = -1532930426;
        hp.cbaj[603] = 674807123;
        hp.cbaj[604] = 1897175523;
        hp.cbaj[605] = -1543316618;
        hp.cbaj[606] = -1810680222;
        hp.cbaj[607] = -1286407458;
        hp.cbaj[608] = 874868249;
        hp.cbaj[609] = 1936249548;
        hp.cbaj[610] = 1694332957;
        hp.cbaj[611] = 1712267202;
        hp.cbaj[612] = -1273194680;
        hp.cbaj[613] = 301828367;
        hp.cbaj[614] = -602534442;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ke getTargetType() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccoc", cazz(int ), (int)374)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hp.cbac("ccod", cbah(int ), (int)523)) break;
            v0 /* !! */  = (long)hp.cbac("ccoe", cbah(int ), (int)524);
        }
        var3_1 = hp.c;
        v1 /* !! */  = hp.ff;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(hp.cbac("ccog", cazz(int ), (int)376) - hp.cbac("ccof", cazz(int ), (int)375));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -236752125: {
                    continue block21;
                }
                case 1050601319: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = hp.b;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl22
        block22: while (true) {
            v2 /* !! */  = (long)(v3 - hp.cbac("ccoh", cazz(int ), (int)377));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1409922354: {
                    v3 = hp.cbac("ccoi", cazz(int ), (int)378);
                    continue block22;
                }
                case -499616018: {
                    v3 = hp.cbac("ccoj", cazz(int ), (int)379);
                    continue block22;
                }
                case -224687260: {
                    v3 = hp.cbac("ccok", cazz(int ), (int)380);
                    continue block22;
                }
                case 1050601319: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl37:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v4 /* !! */  = hp.ff;
                if (true) ** GOTO lbl48
                block24: while (true) {
                    v4 /* !! */  = (long)(hp.cbac("ccom", cazz(int ), (int)382) - hp.cbac("ccol", cazz(int ), (int)381));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 1050601319: {
                            break block24;
                        }
                        case 1722537346: {
                            continue block24;
                        }
                    }
                    break;
                }
                return this.targetType;
            }
            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("ccon", cbah(int ), (int)525);
                if (!var3_1) break;
                throw null;
            }
lbl58:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("ccoo", cbah(int ), (int)526);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hp.cbac("ccop", cbah(int ), (int)527);
                    if (!var3_1) ** GOTO lbl58
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hp.cbac("ccoq", cbah(int ), (int)528);
        ** while (!var3_1)
lbl70:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public io getFireworkHandler() {
        boolean bl2;
        Object object = ff;
        block14: while (true) {
            switch ((int)object) {
                case 539482630: {
                    object = hp.cbac("ccrz", cazz(int ), (int)429) - hp.cbac("ccry", cazz(int ), (int)428);
                    continue block14;
                }
                case 1050601319: {
                    break block14;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ff;
        block15: while (true) {
            switch ((int)object2) {
                case 587887171: {
                    object2 = hp.cbac("ccsb", cazz(int ), (int)431) - hp.cbac("ccsa", cazz(int ), (int)430);
                    continue block15;
                }
                case 1050601319: {
                    break block15;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = ff - hp.cbac("ccsc", cazz(int ), (int)432)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == hp.cbac("ccsd", cbah(int ), (int)569)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = hp.cbac("ccse", cbah(int ), (int)570);
        }
        if (bl2) return null;
        if (bl2) return null;
        Object object4 = ff;
        boolean bl4 = true;
        block17: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - hp.cbac("ccsf", cazz(int ), (int)433);
            }
            switch ((int)object4) {
                case 168412246: {
                    callSite = hp.cbac("ccsg", cazz(int ), (int)434);
                    continue block17;
                }
                case 536456269: {
                    callSite = hp.cbac("ccsh", cazz(int ), (int)435);
                    continue block17;
                }
                case 1050601319: {
                    return this.fireworkHandler;
                }
                case 2136388057: {
                    callSite = hp.cbac("ccsi", cazz(int ), (int)436);
                    continue block17;
                }
            }
            break;
        }
        return this.fireworkHandler;
    }

    private static /* synthetic */ void ccwh() {
        hp.cbab[200] = 2370601061689925433L;
        hp.cbab[201] = 6976843561502413490L;
        hp.cbab[202] = -9124002846975004050L;
        hp.cbab[203] = -714360989788779779L;
        hp.cbab[204] = -7657249981030742900L;
        hp.cbab[205] = -2503550262954407975L;
        hp.cbab[206] = 2847808491460613860L;
        hp.cbab[207] = 5400822588129021162L;
        hp.cbab[208] = -926615113276581801L;
        hp.cbab[209] = 5560975767857787599L;
        hp.cbab[210] = -6745875271779316091L;
        hp.cbab[211] = -213638640489859724L;
        hp.cbab[212] = -1193431311300673990L;
        hp.cbab[213] = 8489141922092716963L;
        hp.cbab[214] = 6712322385164936999L;
        hp.cbab[215] = 8819759331432698849L;
        hp.cbab[216] = 6309564201311717076L;
        hp.cbab[217] = 6793624232561066615L;
        hp.cbab[218] = 6690182114355107541L;
        hp.cbab[219] = -8845812295018873650L;
        hp.cbab[220] = 8402332029823433275L;
        hp.cbab[221] = 1993534947774111232L;
        hp.cbab[222] = 166947535389216333L;
        hp.cbab[223] = -6164479774077902678L;
        hp.cbab[224] = 8343131159015592568L;
        hp.cbab[225] = -2047823148783826425L;
        hp.cbab[226] = 9092356844158180227L;
        hp.cbab[227] = -6791070234551225798L;
        hp.cbab[228] = 6886207924609844742L;
        hp.cbab[229] = 2592132449483668970L;
        hp.cbab[230] = -4021499811615941604L;
        hp.cbab[231] = 4633401563195399444L;
        hp.cbab[232] = -4421965422064360873L;
        hp.cbab[233] = -5392027801862429925L;
        hp.cbab[234] = -3754520404786806796L;
        hp.cbab[235] = 2367147206721539107L;
        hp.cbab[236] = -5646213838031669681L;
        hp.cbab[237] = 1832363006133404576L;
        hp.cbab[238] = -1576492958872517242L;
        hp.cbab[239] = -1196058365247126485L;
        hp.cbab[240] = 6142150008462831383L;
        hp.cbab[241] = -6884964249271335148L;
        hp.cbab[242] = 669865287918900636L;
        hp.cbab[243] = -1880470578285157559L;
        hp.cbab[244] = 4619647099071697138L;
        hp.cbab[245] = 6149737118686789203L;
        hp.cbab[246] = 7079637927824216774L;
        hp.cbab[247] = 151696830679628663L;
        hp.cbab[248] = 9037522038287594408L;
        hp.cbab[249] = -7176206366737185293L;
        hp.cbab[250] = 1155189981562463733L;
        hp.cbab[251] = -1508181004710839330L;
        hp.cbab[252] = 1583907206559323249L;
        hp.cbab[253] = 2239344548409344694L;
        hp.cbab[254] = 4912874781291711807L;
        hp.cbab[255] = -8513030349104785609L;
        hp.cbab[256] = -8675700508390156915L;
        hp.cbab[257] = 2135936691799546624L;
        hp.cbab[258] = 4669199333376366709L;
        hp.cbab[259] = -2151277489586995619L;
        hp.cbab[260] = 3070613535046328551L;
        hp.cbab[261] = -168980704528471298L;
        hp.cbab[262] = 4563350548969024435L;
        hp.cbab[263] = 5166947553626127608L;
        hp.cbab[264] = 1526149529676539422L;
        hp.cbab[265] = -5662401112543717878L;
        hp.cbab[266] = 2494802446395353734L;
        hp.cbab[267] = -8524417565100449672L;
        hp.cbab[268] = -2328651301526342189L;
        hp.cbab[269] = -5628420049135922589L;
        hp.cbab[270] = -5959918538711616994L;
        hp.cbab[271] = 1484154068597657036L;
        hp.cbab[272] = 4767143029724665287L;
        hp.cbab[273] = 1387166146732301202L;
        hp.cbab[274] = -5529996059838229099L;
        hp.cbab[275] = 5076942743579975426L;
        hp.cbab[276] = -6710056452684958967L;
        hp.cbab[277] = 8962169216856259553L;
        hp.cbab[278] = -7857866874084106981L;
        hp.cbab[279] = 6145369616822815750L;
        hp.cbab[280] = 680353397580864130L;
        hp.cbab[281] = -7370863082043219266L;
        hp.cbab[282] = -1429915085145201387L;
        hp.cbab[283] = -1448946768639995998L;
        hp.cbab[284] = -1021846398260487554L;
        hp.cbab[285] = 3535420905013121849L;
        hp.cbab[286] = 1053592968940251008L;
        hp.cbab[287] = 3953299960857339022L;
        hp.cbab[288] = 580371428356062099L;
        hp.cbab[289] = -5306016414983027L;
        hp.cbab[290] = -903092930176528780L;
        hp.cbab[291] = -4213483076134825290L;
        hp.cbab[292] = 5096764319996510408L;
        hp.cbab[293] = -3850775515553847880L;
        hp.cbab[294] = -2452134130039099329L;
        hp.cbab[295] = 8296220289959793626L;
        hp.cbab[296] = -3220456841952826667L;
        hp.cbab[297] = 5778159208279796467L;
        hp.cbab[298] = -6721117104817314285L;
        hp.cbab[299] = 3994098294126036042L;
    }

    private static /* synthetic */ void ccwb() {
        hp.cbaa[100] = 8821654112195333814L;
        hp.cbaa[101] = -274536446641406048L;
        hp.cbaa[102] = -8591221256182111994L;
        hp.cbaa[103] = 8698484516308328369L;
        hp.cbaa[104] = 8160284348960645354L;
        hp.cbaa[105] = 5842471679122233432L;
        hp.cbaa[106] = -867654654443176382L;
        hp.cbaa[107] = 1852162442808146067L;
        hp.cbaa[108] = -2785396221848619611L;
        hp.cbaa[109] = 1125924435196870634L;
        hp.cbaa[110] = 2121673144731089338L;
        hp.cbaa[111] = 8070437849874219587L;
        hp.cbaa[112] = -1080384591758104620L;
        hp.cbaa[113] = 2914303262923429490L;
        hp.cbaa[114] = 634505133021687226L;
        hp.cbaa[115] = 9173213785268738567L;
        hp.cbaa[116] = -4473472487313660100L;
        hp.cbaa[117] = 3567442814025079646L;
        hp.cbaa[118] = -47199701122489105L;
        hp.cbaa[119] = 485829977443971908L;
        hp.cbaa[120] = -6103136585540651473L;
        hp.cbaa[121] = -4345501715816599350L;
        hp.cbaa[122] = -491089570427620099L;
        hp.cbaa[123] = 919211094592852148L;
        hp.cbaa[124] = -3133676706075062625L;
        hp.cbaa[125] = -944434699541492722L;
        hp.cbaa[126] = -1471682660272182696L;
        hp.cbaa[127] = 3235327619298696588L;
        hp.cbaa[128] = -7793981538982776830L;
        hp.cbaa[129] = -8022332823406718378L;
        hp.cbaa[130] = 5802479930372988156L;
        hp.cbaa[131] = 4731757190095124775L;
        hp.cbaa[132] = -5235265448683926603L;
        hp.cbaa[133] = 8246692796799837300L;
        hp.cbaa[134] = 5824777675198379455L;
        hp.cbaa[135] = 2264904534548091695L;
        hp.cbaa[136] = 5464009047574028027L;
        hp.cbaa[137] = 6379865009235629665L;
        hp.cbaa[138] = -4950347363081903935L;
        hp.cbaa[139] = -3245831672269481486L;
        hp.cbaa[140] = -3955784275990498232L;
        hp.cbaa[141] = 2647350140542348745L;
        hp.cbaa[142] = 2383468470512709477L;
        hp.cbaa[143] = 3984507544507861241L;
        hp.cbaa[144] = -3842523757465224490L;
        hp.cbaa[145] = -7579254511513943267L;
        hp.cbaa[146] = -3365558562047396411L;
        hp.cbaa[147] = 4533431717268720762L;
        hp.cbaa[148] = -650427099913988915L;
        hp.cbaa[149] = -3679035597194628771L;
        hp.cbaa[150] = -2994989088894441545L;
        hp.cbaa[151] = 8851597478843695696L;
        hp.cbaa[152] = -1461982175319311132L;
        hp.cbaa[153] = -2658662575778643118L;
        hp.cbaa[154] = 4849965354646231854L;
        hp.cbaa[155] = 7273337554636309501L;
        hp.cbaa[156] = -1906440371428195159L;
        hp.cbaa[157] = 8400206264349315735L;
        hp.cbaa[158] = 1587681957827345842L;
        hp.cbaa[159] = -9201881135892888800L;
        hp.cbaa[160] = 252500888338168293L;
        hp.cbaa[161] = -286992716515791817L;
        hp.cbaa[162] = -4527725400706672013L;
        hp.cbaa[163] = -1948101223953190540L;
        hp.cbaa[164] = 3762932835632192673L;
        hp.cbaa[165] = -8216034800679433235L;
        hp.cbaa[166] = -6969859550022936677L;
        hp.cbaa[167] = 4320101298249340976L;
        hp.cbaa[168] = -7753759236264572388L;
        hp.cbaa[169] = -3135523125016352831L;
        hp.cbaa[170] = 5484234700534115356L;
        hp.cbaa[171] = 7670951028268499707L;
        hp.cbaa[172] = 4782471604815035152L;
        hp.cbaa[173] = 7224318338455481438L;
        hp.cbaa[174] = -4417172209374031642L;
        hp.cbaa[175] = 3665665903381682432L;
        hp.cbaa[176] = 9064358851946603862L;
        hp.cbaa[177] = 3599817139029171478L;
        hp.cbaa[178] = -6425281781431809115L;
        hp.cbaa[179] = 8190405509436373850L;
        hp.cbaa[180] = -1858933860769687841L;
        hp.cbaa[181] = -4649355502574064053L;
        hp.cbaa[182] = -1254148055052878225L;
        hp.cbaa[183] = -8080289977385223532L;
        hp.cbaa[184] = -118814272229365518L;
        hp.cbaa[185] = 6993031763497997518L;
        hp.cbaa[186] = 1152026664210120789L;
        hp.cbaa[187] = 3923381880276021550L;
        hp.cbaa[188] = -8091537301849275476L;
        hp.cbaa[189] = -725428409971349438L;
        hp.cbaa[190] = 4803982067058890628L;
        hp.cbaa[191] = 1718201144486889873L;
        hp.cbaa[192] = -3071826198197211343L;
        hp.cbaa[193] = 424100126099872894L;
        hp.cbaa[194] = 6056115263976064707L;
        hp.cbaa[195] = 1868135536067719029L;
        hp.cbaa[196] = 511405906675808782L;
        hp.cbaa[197] = -9130022337434305495L;
        hp.cbaa[198] = -5439336554982506756L;
        hp.cbaa[199] = 3659782822986860898L;
    }

    private static /* synthetic */ void ccvx() {
        hp.cbaj[400] = -1833554447;
        hp.cbaj[401] = 1218576568;
        hp.cbaj[402] = 1759134887;
        hp.cbaj[403] = 394202733;
        hp.cbaj[404] = 233487120;
        hp.cbaj[405] = 1228921186;
        hp.cbaj[406] = -1793372488;
        hp.cbaj[407] = 65225890;
        hp.cbaj[408] = -2010488947;
        hp.cbaj[409] = 298667674;
        hp.cbaj[410] = 1412321954;
        hp.cbaj[411] = 1678345823;
        hp.cbaj[412] = -249924359;
        hp.cbaj[413] = -1155667991;
        hp.cbaj[414] = -1788331781;
        hp.cbaj[415] = -746759394;
        hp.cbaj[416] = 789823557;
        hp.cbaj[417] = 1882224617;
        hp.cbaj[418] = -1231115028;
        hp.cbaj[419] = 1020436913;
        hp.cbaj[420] = -1706000268;
        hp.cbaj[421] = -403630362;
        hp.cbaj[422] = 1969239186;
        hp.cbaj[423] = -951213119;
        hp.cbaj[424] = -1200604320;
        hp.cbaj[425] = -534317917;
        hp.cbaj[426] = -747727009;
        hp.cbaj[427] = -1360607520;
        hp.cbaj[428] = 2097652558;
        hp.cbaj[429] = -840359321;
        hp.cbaj[430] = 374144869;
        hp.cbaj[431] = -1870845484;
        hp.cbaj[432] = 365561028;
        hp.cbaj[433] = -2128837626;
        hp.cbaj[434] = 268363694;
        hp.cbaj[435] = -1095092923;
        hp.cbaj[436] = 793206455;
        hp.cbaj[437] = 864042250;
        hp.cbaj[438] = -1498419858;
        hp.cbaj[439] = 869739403;
        hp.cbaj[440] = 2010113967;
        hp.cbaj[441] = -280258734;
        hp.cbaj[442] = 735876804;
        hp.cbaj[443] = 1889721648;
        hp.cbaj[444] = -481836761;
        hp.cbaj[445] = 631498449;
        hp.cbaj[446] = 1562638006;
        hp.cbaj[447] = 264815564;
        hp.cbaj[448] = 1781521777;
        hp.cbaj[449] = 869010040;
        hp.cbaj[450] = 744566849;
        hp.cbaj[451] = 1941880537;
        hp.cbaj[452] = 2076823934;
        hp.cbaj[453] = -1697178813;
        hp.cbaj[454] = -1317160356;
        hp.cbaj[455] = -1550537881;
        hp.cbaj[456] = -1001819701;
        hp.cbaj[457] = -1334939668;
        hp.cbaj[458] = -1230730136;
        hp.cbaj[459] = -1033993827;
        hp.cbaj[460] = -670236167;
        hp.cbaj[461] = -414156978;
        hp.cbaj[462] = 2134042887;
        hp.cbaj[463] = 388779312;
        hp.cbaj[464] = -1725307271;
        hp.cbaj[465] = -122019855;
        hp.cbaj[466] = 715478116;
        hp.cbaj[467] = 332502333;
        hp.cbaj[468] = -1027840874;
        hp.cbaj[469] = -1956836087;
        hp.cbaj[470] = -706870944;
        hp.cbaj[471] = 378914182;
        hp.cbaj[472] = 429277829;
        hp.cbaj[473] = -1508780386;
        hp.cbaj[474] = 811508440;
        hp.cbaj[475] = 1390610782;
        hp.cbaj[476] = 1963385330;
        hp.cbaj[477] = 161299488;
        hp.cbaj[478] = 1042354210;
        hp.cbaj[479] = 1345345725;
        hp.cbaj[480] = 781171749;
        hp.cbaj[481] = -1340797486;
        hp.cbaj[482] = 2039648540;
        hp.cbaj[483] = -639000010;
        hp.cbaj[484] = 1501320176;
        hp.cbaj[485] = -761324815;
        hp.cbaj[486] = -1909365453;
        hp.cbaj[487] = -1501744826;
        hp.cbaj[488] = 457330485;
        hp.cbaj[489] = 700566616;
        hp.cbaj[490] = 864463581;
        hp.cbaj[491] = -1273825950;
        hp.cbaj[492] = 1562210970;
        hp.cbaj[493] = -1854715063;
        hp.cbaj[494] = 619665848;
        hp.cbaj[495] = -81476025;
        hp.cbaj[496] = 1115298609;
        hp.cbaj[497] = 63698547;
        hp.cbaj[498] = -1290544777;
        hp.cbaj[499] = 823448218;
    }

    private static /* synthetic */ void ccvr() {
        hp.cbai[500] = -1652295380;
        hp.cbai[501] = -1940297350;
        hp.cbai[502] = -840161927;
        hp.cbai[503] = 732896829;
        hp.cbai[504] = 1295523133;
        hp.cbai[505] = 1313750325;
        hp.cbai[506] = -1277519010;
        hp.cbai[507] = 1481911887;
        hp.cbai[508] = 1524862665;
        hp.cbai[509] = 1545334310;
        hp.cbai[510] = 1293803291;
        hp.cbai[511] = 505218434;
        hp.cbai[512] = -198224072;
        hp.cbai[513] = -251577064;
        hp.cbai[514] = 1279106501;
        hp.cbai[515] = 713475464;
        hp.cbai[516] = -895230527;
        hp.cbai[517] = -2016039918;
        hp.cbai[518] = 1170660710;
        hp.cbai[519] = -1190065376;
        hp.cbai[520] = -103393346;
        hp.cbai[521] = 584102040;
        hp.cbai[522] = 1100731181;
        hp.cbai[523] = -402481004;
        hp.cbai[524] = 2053829210;
        hp.cbai[525] = 977774960;
        hp.cbai[526] = -1231852254;
        hp.cbai[527] = -1542504203;
        hp.cbai[528] = 1245550282;
        hp.cbai[529] = -880917775;
        hp.cbai[530] = -1704388957;
        hp.cbai[531] = 1761883136;
        hp.cbai[532] = 1062116859;
        hp.cbai[533] = 833158032;
        hp.cbai[534] = 1483089167;
        hp.cbai[535] = -758861061;
        hp.cbai[536] = 1850451470;
        hp.cbai[537] = -1659904486;
        hp.cbai[538] = -2006068323;
        hp.cbai[539] = 897853450;
        hp.cbai[540] = 68928779;
        hp.cbai[541] = -1732465180;
        hp.cbai[542] = -626426071;
        hp.cbai[543] = -1991931732;
        hp.cbai[544] = -159351286;
        hp.cbai[545] = 2078975081;
        hp.cbai[546] = -398357690;
        hp.cbai[547] = -601368555;
        hp.cbai[548] = -1741527912;
        hp.cbai[549] = 1755230731;
        hp.cbai[550] = 1798758796;
        hp.cbai[551] = -14976097;
        hp.cbai[552] = 1485148274;
        hp.cbai[553] = 1614110271;
        hp.cbai[554] = 662901953;
        hp.cbai[555] = 154027498;
        hp.cbai[556] = -2071667529;
        hp.cbai[557] = 1537112468;
        hp.cbai[558] = -765438736;
        hp.cbai[559] = -1063598844;
        hp.cbai[560] = -1866579702;
        hp.cbai[561] = -1024854649;
        hp.cbai[562] = 1696473604;
        hp.cbai[563] = 2026288252;
        hp.cbai[564] = -1420695883;
        hp.cbai[565] = -1316360670;
        hp.cbai[566] = -1020969109;
        hp.cbai[567] = 792552291;
        hp.cbai[568] = -2011103005;
        hp.cbai[569] = -2019075057;
        hp.cbai[570] = 1793456507;
        hp.cbai[571] = -1338260056;
        hp.cbai[572] = -1009161211;
        hp.cbai[573] = 2076097634;
        hp.cbai[574] = 480127327;
        hp.cbai[575] = -1262005258;
        hp.cbai[576] = 130355926;
        hp.cbai[577] = -1730172475;
        hp.cbai[578] = 368786536;
        hp.cbai[579] = 1700325285;
        hp.cbai[580] = 1952850424;
        hp.cbai[581] = -1203693476;
        hp.cbai[582] = -510704904;
        hp.cbai[583] = -1516367565;
        hp.cbai[584] = 737754414;
        hp.cbai[585] = -486478492;
        hp.cbai[586] = -333225226;
        hp.cbai[587] = -1826451983;
        hp.cbai[588] = -1486893606;
        hp.cbai[589] = 397280270;
        hp.cbai[590] = -14990673;
        hp.cbai[591] = 438411149;
        hp.cbai[592] = 1061693434;
        hp.cbai[593] = -537697230;
        hp.cbai[594] = -1150144086;
        hp.cbai[595] = 118672874;
        hp.cbai[596] = 1671105088;
        hp.cbai[597] = 620843736;
        hp.cbai[598] = 950573298;
        hp.cbai[599] = 1748495825;
    }

    private static /* synthetic */ void ccvq() {
        hp.cbai[400] = -1833554441;
        hp.cbai[401] = 1218576567;
        hp.cbai[402] = 1759134880;
        hp.cbai[403] = 394202741;
        hp.cbai[404] = 233487126;
        hp.cbai[405] = 1228921209;
        hp.cbai[406] = -1793372493;
        hp.cbai[407] = 65225917;
        hp.cbai[408] = -2010488960;
        hp.cbai[409] = 298667653;
        hp.cbai[410] = 1412321972;
        hp.cbai[411] = 1678345795;
        hp.cbai[412] = -249924355;
        hp.cbai[413] = -1155667999;
        hp.cbai[414] = -1788331786;
        hp.cbai[415] = -746759412;
        hp.cbai[416] = 789823566;
        hp.cbai[417] = 1882224637;
        hp.cbai[418] = -1231115026;
        hp.cbai[419] = 1020436898;
        hp.cbai[420] = -1706000274;
        hp.cbai[421] = -403630359;
        hp.cbai[422] = 1969239187;
        hp.cbai[423] = 690243223;
        hp.cbai[424] = -1200604319;
        hp.cbai[425] = -1811016042;
        hp.cbai[426] = -747727010;
        hp.cbai[427] = 1739756620;
        hp.cbai[428] = -2097652559;
        hp.cbai[429] = 84983530;
        hp.cbai[430] = 374144868;
        hp.cbai[431] = -1606732403;
        hp.cbai[432] = 1456080068;
        hp.cbai[433] = -1029143546;
        hp.cbai[434] = 268363695;
        hp.cbai[435] = 1095092922;
        hp.cbai[436] = -152817160;
        hp.cbai[437] = -864042251;
        hp.cbai[438] = -1206387212;
        hp.cbai[439] = 869739402;
        hp.cbai[440] = -1912068107;
        hp.cbai[441] = -280258733;
        hp.cbai[442] = 122819066;
        hp.cbai[443] = 1889721655;
        hp.cbai[444] = -481836762;
        hp.cbai[445] = 631498454;
        hp.cbai[446] = 1562638004;
        hp.cbai[447] = 264815556;
        hp.cbai[448] = 1781521787;
        hp.cbai[449] = 869010034;
        hp.cbai[450] = 744566857;
        hp.cbai[451] = 1941880536;
        hp.cbai[452] = 2076823932;
        hp.cbai[453] = -1697178808;
        hp.cbai[454] = -1317160358;
        hp.cbai[455] = -1550537882;
        hp.cbai[456] = 1915313460;
        hp.cbai[457] = -1334939667;
        hp.cbai[458] = 181971967;
        hp.cbai[459] = -1033993828;
        hp.cbai[460] = -670236167;
        hp.cbai[461] = -414156978;
        hp.cbai[462] = 2134042886;
        hp.cbai[463] = -572095230;
        hp.cbai[464] = -1725307272;
        hp.cbai[465] = -1590687934;
        hp.cbai[466] = 715478117;
        hp.cbai[467] = 332502330;
        hp.cbai[468] = -1027840877;
        hp.cbai[469] = -1956836086;
        hp.cbai[470] = -706870942;
        hp.cbai[471] = 378914180;
        hp.cbai[472] = 429277824;
        hp.cbai[473] = -1508780389;
        hp.cbai[474] = 811508446;
        hp.cbai[475] = 1390610781;
        hp.cbai[476] = 1963385335;
        hp.cbai[477] = 161299489;
        hp.cbai[478] = 1777278428;
        hp.cbai[479] = 1345345724;
        hp.cbai[480] = -1867038500;
        hp.cbai[481] = -1340797485;
        hp.cbai[482] = 1195652661;
        hp.cbai[483] = -639000015;
        hp.cbai[484] = 1501320186;
        hp.cbai[485] = -761324816;
        hp.cbai[486] = -1909365447;
        hp.cbai[487] = -1501744830;
        hp.cbai[488] = 457330483;
        hp.cbai[489] = 700566610;
        hp.cbai[490] = 864463569;
        hp.cbai[491] = -1273825944;
        hp.cbai[492] = 1562210962;
        hp.cbai[493] = -1854715069;
        hp.cbai[494] = 619665840;
        hp.cbai[495] = -81476020;
        hp.cbai[496] = 1115298619;
        hp.cbai[497] = 63698557;
        hp.cbai[498] = -1290544769;
        hp.cbai[499] = 823448216;
    }

    private static /* synthetic */ void ccvo() {
        hp.cbai[200] = 389896374;
        hp.cbai[201] = -260508783;
        hp.cbai[202] = 1259871236;
        hp.cbai[203] = 1724773390;
        hp.cbai[204] = -757208403;
        hp.cbai[205] = 1969807618;
        hp.cbai[206] = 1764171416;
        hp.cbai[207] = -609308519;
        hp.cbai[208] = -1921142777;
        hp.cbai[209] = -345900960;
        hp.cbai[210] = 459403709;
        hp.cbai[211] = -230813135;
        hp.cbai[212] = -1201617835;
        hp.cbai[213] = -1950320030;
        hp.cbai[214] = 539911220;
        hp.cbai[215] = -2003919579;
        hp.cbai[216] = 1100229075;
        hp.cbai[217] = -1565023943;
        hp.cbai[218] = -11801381;
        hp.cbai[219] = -1032437128;
        hp.cbai[220] = -394165059;
        hp.cbai[221] = -1317302688;
        hp.cbai[222] = -544905669;
        hp.cbai[223] = 898357950;
        hp.cbai[224] = 513727909;
        hp.cbai[225] = 562148056;
        hp.cbai[226] = -270680458;
        hp.cbai[227] = 1344488536;
        hp.cbai[228] = -1189358786;
        hp.cbai[229] = -1264773687;
        hp.cbai[230] = 654821211;
        hp.cbai[231] = 623258452;
        hp.cbai[232] = 1856761234;
        hp.cbai[233] = 170794181;
        hp.cbai[234] = 372374815;
        hp.cbai[235] = 2013510837;
        hp.cbai[236] = -2108355484;
        hp.cbai[237] = -353125603;
        hp.cbai[238] = 325604321;
        hp.cbai[239] = -422459337;
        hp.cbai[240] = -1356587858;
        hp.cbai[241] = -41539105;
        hp.cbai[242] = 962291126;
        hp.cbai[243] = 2036210237;
        hp.cbai[244] = -2011590977;
        hp.cbai[245] = -614362785;
        hp.cbai[246] = -142766365;
        hp.cbai[247] = -1030288725;
        hp.cbai[248] = -557694654;
        hp.cbai[249] = -1410776970;
        hp.cbai[250] = 1398526418;
        hp.cbai[251] = -2103539287;
        hp.cbai[252] = 688443887;
        hp.cbai[253] = -969777638;
        hp.cbai[254] = -1004432833;
        hp.cbai[255] = 860564419;
        hp.cbai[256] = 1192659141;
        hp.cbai[257] = -571526497;
        hp.cbai[258] = 1217625817;
        hp.cbai[259] = -1022428381;
        hp.cbai[260] = -472230726;
        hp.cbai[261] = -910003992;
        hp.cbai[262] = 532626425;
        hp.cbai[263] = -1552674883;
        hp.cbai[264] = 423594204;
        hp.cbai[265] = -2083250168;
        hp.cbai[266] = 1516413736;
        hp.cbai[267] = 618345840;
        hp.cbai[268] = 461722766;
        hp.cbai[269] = 116919457;
        hp.cbai[270] = 1474735390;
        hp.cbai[271] = 1361650018;
        hp.cbai[272] = -1060953501;
        hp.cbai[273] = -1521490819;
        hp.cbai[274] = -1963501982;
        hp.cbai[275] = 1188231940;
        hp.cbai[276] = -2118821315;
        hp.cbai[277] = 1464950591;
        hp.cbai[278] = -2004674390;
        hp.cbai[279] = -1249689663;
        hp.cbai[280] = -2102316077;
        hp.cbai[281] = -574940711;
        hp.cbai[282] = 763479657;
        hp.cbai[283] = 161234800;
        hp.cbai[284] = -1235905819;
        hp.cbai[285] = -594998742;
        hp.cbai[286] = 1837883800;
        hp.cbai[287] = 208518013;
        hp.cbai[288] = -629531661;
        hp.cbai[289] = -358373236;
        hp.cbai[290] = 1263058620;
        hp.cbai[291] = 138897892;
        hp.cbai[292] = -96666816;
        hp.cbai[293] = -267174813;
        hp.cbai[294] = 1430980877;
        hp.cbai[295] = -1578475344;
        hp.cbai[296] = 153291887;
        hp.cbai[297] = -1254955226;
        hp.cbai[298] = 1532526093;
        hp.cbai[299] = -1602769996;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public kb getAutoEquipChest() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("ccor", cazz(int ), (int)383)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hp.cbac("ccos", cbah(int ), (int)529)) break;
            v0 /* !! */  = (long)hp.cbac("ccot", cbah(int ), (int)530);
        }
        var3_1 = hp.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = hp.ff - hp.cbac("ccou", cazz(int ), (int)384)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == hp.cbac("ccov", cbah(int ), (int)531)) break;
            v1 /* !! */  = (long)hp.cbac("ccow", cbah(int ), (int)532);
        }
        var2_2 /* !! */  = hp.b;
        v2 /* !! */  = hp.ff;
        if (true) ** GOTO lbl19
        block13: while (true) {
            v2 /* !! */  = (long)(v3 - hp.cbac("ccox", cazz(int ), (int)385));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1676529362: {
                    v3 = hp.cbac("ccoy", cazz(int ), (int)386);
                    continue block13;
                }
                case 1050601319: {
                    break block13;
                }
                case 1171257214: {
                    v3 = hp.cbac("ccoz", cazz(int ), (int)387);
                    continue block13;
                }
            }
            break;
        }
        var1_3 = hp.a;
        if (var3_1) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = hp.ff - hp.cbac("ccpa", cazz(int ), (int)388)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hp.cbac("ccpb", cbah(int ), (int)533)) break;
                    v4 /* !! */  = (long)hp.cbac("ccpc", cbah(int ), (int)534);
                }
                return this.autoEquipChest;
            }
lbl45:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hp.cbac("ccpd", cbah(int ), (int)535);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl55
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)hp.cbac("ccpe", cbah(int ), (int)536);
                if (!var3_1) ** GOTO lbl45
                throw null;
            }
lbl55:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("ccpf", cbah(int ), (int)537);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hp.cbac("ccpg", cbah(int ), (int)538);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private oc buildSettings() {
        block50: {
            v0 /* !! */  = hp.ff;
            if (true) ** GOTO lbl5
            block36: while (true) {
                v0 /* !! */  = (long)(hp.cbac("cbds", cazz(int ), (int)38) - hp.cbac("cbdr", cazz(int ), (int)37));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -73624392: {
                        continue block36;
                    }
                    case 1050601319: {
                        break block36;
                    }
                }
                break;
            }
            var3_1 = hp.c;
            v1 /* !! */  = hp.ff;
            if (true) ** GOTO lbl15
            block37: while (true) {
                v1 /* !! */  = (long)(v2 - hp.cbac("cbdt", cazz(int ), (int)39));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -2109400981: {
                        v2 = hp.cbac("cbdu", cazz(int ), (int)40);
                        continue block37;
                    }
                    case -1489314857: {
                        v2 = hp.cbac("cbdv", cazz(int ), (int)41);
                        continue block37;
                    }
                    case 1050601319: {
                        break block37;
                    }
                }
                break;
            }
            var2_2 /* !! */  = hp.b;
            v3 /* !! */  = hp.ff;
            if (true) ** GOTO lbl29
            block38: while (true) {
                v3 /* !! */  = (long)(v4 - hp.cbac("cbdw", cazz(int ), (int)42));
lbl29:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1416209654: {
                        v4 = hp.cbac("cbdx", cazz(int ), (int)43);
                        continue block38;
                    }
                    case 1050601319: {
                        break block38;
                    }
                    case 1606647581: {
                        v4 = hp.cbac("cbdy", cazz(int ), (int)44);
                        continue block38;
                    }
                }
                break;
            }
            var1_3 = hp.a;
            if (var3_1) {
                throw null;
lbl41:
                // 3 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl41
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_0 = hp.ff - hp.cbac("cbdz", cazz(int ), (int)45)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == hp.cbac("cbea", cbah(int ), (int)51)) break;
                v5 /* !! */  = (long)hp.cbac("cbeb", cbah(int ), (int)52);
            }
            if (!this.isSilentMode()) break block50;
            if (var1_3) ** GOTO lbl41
            v6 /* !! */  = hp.ff;
            if (true) ** GOTO lbl56
            block41: while (true) {
                v6 /* !! */  = (long)(v7 - hp.cbac("cbec", cazz(int ), (int)46));
lbl56:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -998034137: {
                        v7 = hp.cbac("cbed", cazz(int ), (int)47);
                        continue block41;
                    }
                    case 347179953: {
                        v7 = hp.cbac("cbee", cazz(int ), (int)48);
                        continue block41;
                    }
                    case 816232121: {
                        v7 = hp.cbac("cbef", cazz(int ), (int)49);
                        continue block41;
                    }
                    case 1050601319: {
                        break block41;
                    }
                }
                break;
            }
            v8 = oc.instant();
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl95
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v9 /* !! */  = hp.ff;
                if (true) ** GOTO lbl82
                block42: while (true) {
                    v9 /* !! */  = (long)(v10 - hp.cbac("cbeg", cazz(int ), (int)50));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1805631373: {
                            v10 = hp.cbac("cbeh", cazz(int ), (int)51);
                            continue block42;
                        }
                        case -722834062: {
                            v10 = hp.cbac("cbei", cazz(int ), (int)52);
                            continue block42;
                        }
                        case 1050601319: {
                            break block42;
                        }
                        case 1303522651: {
                            v10 = hp.cbac("cbej", cazz(int ), (int)53);
                            continue block42;
                        }
                    }
                    break;
                }
                v8 = oc.legit();
lbl95:
                // 2 sources

                return v8;
            }
            case 0: {
                var2_2 /* !! */  = (int)hp.cbac("cbek", cbah(int ), (int)53);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)hp.cbac("cbel", cbah(int ), (int)54);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl111
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hp.cbac("cbem", cbah(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl123
            }
lbl111:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)hp.cbac("cben", cbah(int ), (int)56);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)hp.cbac("cbeo", cbah(int ), (int)57);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)hp.cbac("cbep", cbah(int ), (int)58);
                if (!var3_1) ** GOTO lbl111
                throw null;
            }
lbl123:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)hp.cbac("cbeq", cbah(int ), (int)59);
                if (!var3_1) ** GOTO lbl111
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)hp.cbac("cber", cbah(int ), (int)60);
        ** while (!var3_1)
lbl130:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ccvn() {
        hp.cbai[100] = 1417115819;
        hp.cbai[101] = -716308631;
        hp.cbai[102] = 2085715302;
        hp.cbai[103] = -1348101259;
        hp.cbai[104] = 1722527692;
        hp.cbai[105] = 743549732;
        hp.cbai[106] = 153918980;
        hp.cbai[107] = 1932592367;
        hp.cbai[108] = 168090044;
        hp.cbai[109] = 1487413326;
        hp.cbai[110] = 1442880781;
        hp.cbai[111] = -1646438815;
        hp.cbai[112] = -1962595205;
        hp.cbai[113] = -497952948;
        hp.cbai[114] = 179683009;
        hp.cbai[115] = -1260071523;
        hp.cbai[116] = 77422211;
        hp.cbai[117] = 1386548440;
        hp.cbai[118] = 1248360261;
        hp.cbai[119] = -1656304676;
        hp.cbai[120] = 1968816973;
        hp.cbai[121] = -910822;
        hp.cbai[122] = 1413142674;
        hp.cbai[123] = -1013566045;
        hp.cbai[124] = 196921594;
        hp.cbai[125] = -1413972518;
        hp.cbai[126] = 1434875274;
        hp.cbai[127] = -1514232366;
        hp.cbai[128] = 297036058;
        hp.cbai[129] = 1239008808;
        hp.cbai[130] = -30939222;
        hp.cbai[131] = 700028103;
        hp.cbai[132] = 2101401768;
        hp.cbai[133] = -616743815;
        hp.cbai[134] = -930290774;
        hp.cbai[135] = 348114625;
        hp.cbai[136] = 1575120947;
        hp.cbai[137] = -1146899667;
        hp.cbai[138] = 1133004574;
        hp.cbai[139] = -645719623;
        hp.cbai[140] = -431629796;
        hp.cbai[141] = -1115708491;
        hp.cbai[142] = -146581015;
        hp.cbai[143] = -1215069726;
        hp.cbai[144] = 1315244254;
        hp.cbai[145] = -323404671;
        hp.cbai[146] = -85649367;
        hp.cbai[147] = -794504380;
        hp.cbai[148] = -1206581271;
        hp.cbai[149] = 268145334;
        hp.cbai[150] = -181998508;
        hp.cbai[151] = 29029634;
        hp.cbai[152] = 470884803;
        hp.cbai[153] = -744032714;
        hp.cbai[154] = -760125051;
        hp.cbai[155] = -1195974150;
        hp.cbai[156] = 1484245924;
        hp.cbai[157] = -1260273967;
        hp.cbai[158] = -1105679010;
        hp.cbai[159] = -1866312879;
        hp.cbai[160] = 2103292821;
        hp.cbai[161] = -1456358828;
        hp.cbai[162] = -1247147147;
        hp.cbai[163] = -37252515;
        hp.cbai[164] = 669351720;
        hp.cbai[165] = 494992812;
        hp.cbai[166] = -2007665656;
        hp.cbai[167] = 729576289;
        hp.cbai[168] = -1515585925;
        hp.cbai[169] = 1017927694;
        hp.cbai[170] = 364165753;
        hp.cbai[171] = -1760712466;
        hp.cbai[172] = 1652942082;
        hp.cbai[173] = -1753532624;
        hp.cbai[174] = -1877038060;
        hp.cbai[175] = 935658078;
        hp.cbai[176] = -141167805;
        hp.cbai[177] = -314550853;
        hp.cbai[178] = -2034927712;
        hp.cbai[179] = 451646933;
        hp.cbai[180] = 2071052918;
        hp.cbai[181] = -1721948705;
        hp.cbai[182] = 1982768262;
        hp.cbai[183] = 1985156825;
        hp.cbai[184] = 68170383;
        hp.cbai[185] = -864586501;
        hp.cbai[186] = -548254069;
        hp.cbai[187] = 356487340;
        hp.cbai[188] = 684198060;
        hp.cbai[189] = 857910722;
        hp.cbai[190] = 987906551;
        hp.cbai[191] = 879800487;
        hp.cbai[192] = 1422088805;
        hp.cbai[193] = 586251839;
        hp.cbai[194] = -1868562792;
        hp.cbai[195] = 1514517910;
        hp.cbai[196] = -1649407402;
        hp.cbai[197] = 594317813;
        hp.cbai[198] = 266620215;
        hp.cbai[199] = -1090367158;
    }

    private static /* synthetic */ void ccwj() {
        hp.cbab[400] = 8266511484185143089L;
        hp.cbab[401] = -1160372279100782708L;
        hp.cbab[402] = 9208279811009402124L;
        hp.cbab[403] = 2038931451478729071L;
        hp.cbab[404] = 1612216060726590113L;
        hp.cbab[405] = 6545153904021093446L;
        hp.cbab[406] = -847676391676791157L;
        hp.cbab[407] = 1748194531070395335L;
        hp.cbab[408] = 966527898496120557L;
        hp.cbab[409] = -6659765960637397516L;
        hp.cbab[410] = -7506996650691695879L;
        hp.cbab[411] = -3407105778754479380L;
        hp.cbab[412] = 7506795806081139133L;
        hp.cbab[413] = -105773691103787156L;
        hp.cbab[414] = 4766203613269886576L;
        hp.cbab[415] = -1117935992553184449L;
        hp.cbab[416] = -3449185645323817459L;
        hp.cbab[417] = -4176276929595444491L;
        hp.cbab[418] = -2923172079085557211L;
        hp.cbab[419] = 8702501998778525906L;
        hp.cbab[420] = 6541987444257933990L;
        hp.cbab[421] = 8725338572667634701L;
        hp.cbab[422] = 3262643448402838231L;
        hp.cbab[423] = -2912726305904671150L;
        hp.cbab[424] = 4345135579821924798L;
        hp.cbab[425] = -2960431886493369317L;
        hp.cbab[426] = 2438381202741281986L;
        hp.cbab[427] = 3745873418214165468L;
        hp.cbab[428] = -1108754320232591156L;
        hp.cbab[429] = 521263198069563459L;
        hp.cbab[430] = -6345626471763808168L;
        hp.cbab[431] = -9137060330770620035L;
        hp.cbab[432] = -5528192996712491010L;
        hp.cbab[433] = 8409481964481413086L;
        hp.cbab[434] = -5333204145160989803L;
        hp.cbab[435] = 6728641729167869985L;
        hp.cbab[436] = 6025377023800643126L;
        hp.cbab[437] = 6372091948104192568L;
        hp.cbab[438] = 1062598269941321322L;
        hp.cbab[439] = -5350966531860781027L;
        hp.cbab[440] = -2645573230628965202L;
        hp.cbab[441] = 7148990260831058622L;
        hp.cbab[442] = 1036100384171437385L;
        hp.cbab[443] = 7063271271800240589L;
        hp.cbab[444] = 5117699636895943678L;
        hp.cbab[445] = 7454101542964201826L;
        hp.cbab[446] = -6276549494930790419L;
        hp.cbab[447] = 600445413468742528L;
        hp.cbab[448] = 4919544749260524476L;
        hp.cbab[449] = 7791642298480391692L;
        hp.cbab[450] = 8123173884919298579L;
        hp.cbab[451] = 4645132890886620161L;
        hp.cbab[452] = -1022544099346361058L;
        hp.cbab[453] = -2720428951969488076L;
        hp.cbab[454] = 558165579240925502L;
        hp.cbab[455] = 3803013112106301633L;
        hp.cbab[456] = -6172443060535313732L;
        hp.cbab[457] = -8958603011309772774L;
        hp.cbab[458] = -7404035154441743107L;
        hp.cbab[459] = 2531380820856487639L;
        hp.cbab[460] = -4787033113102857635L;
        hp.cbab[461] = -7485521829974524140L;
        hp.cbab[462] = -7750795304264107991L;
        hp.cbab[463] = -197110575466420355L;
        hp.cbab[464] = -794531030767580022L;
        hp.cbab[465] = 4688763536225062009L;
        hp.cbab[466] = -5721426743860178922L;
        hp.cbab[467] = -2504115624007093165L;
        hp.cbab[468] = 6328377920903421696L;
        hp.cbab[469] = 3151942124605727458L;
        hp.cbab[470] = -7588321448167976356L;
        hp.cbab[471] = 6236082842594293609L;
        hp.cbab[472] = -989822739934454688L;
        hp.cbab[473] = 7363406658684398334L;
    }
}

