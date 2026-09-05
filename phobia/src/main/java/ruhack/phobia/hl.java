/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Supplier;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import ruhack.phobia.a.ay;
import ruhack.phobia.aw;
import ruhack.phobia.bl;
import ruhack.phobia.df;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hn;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.kg;
import ruhack.phobia.nj;

public class hl
extends ds {
    public static final boolean a;
    public final kg elytraForward;
    private class_243 predictedPosition;
    private static int[] cxtc;
    public final kb targetMustFly;
    protected static final long gq = 2896561539525331176L;
    public final kb predictMovement;
    private class_1657 currentTarget;
    public final kg elytraFindRange;
    private static long[] cxsy;
    private static int[] cxtd;
    public final kb onlyAuraTarget;
    public final kg extraHitbox;
    private static long[] cxsx;
    public static final boolean c;
    public static final int b;

    private static /* synthetic */ long cxsw(int n2) {
        return cxsx[n2] ^ cxsy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 computePredictedPosition(class_1309 var1_1) {
        block143: {
            block142: {
                block141: {
                    v0 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl5
                    block93: while (true) {
                        v0 /* !! */  = (long)(hl.cxsz("cyjf", cxsw(int ), (int)198) - hl.cxsz("cyje", cxsw(int ), (int)197));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -2080738320: {
                                continue block93;
                            }
                            case -1586018072: {
                                break block93;
                            }
                        }
                        break;
                    }
                    var11_2 = hl.c;
                    v1 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl15
                    block94: while (true) {
                        v1 /* !! */  = (long)(v2 - hl.cxsz("cyjg", cxsw(int ), (int)199));
lbl15:
                        // 2 sources

                        switch ((int)v1 /* !! */ ) {
                            case -1586018072: {
                                break block94;
                            }
                            case -971332131: {
                                v2 = hl.cxsz("cyjh", cxsw(int ), (int)200);
                                continue block94;
                            }
                            case -409429674: {
                                v2 = hl.cxsz("cyji", cxsw(int ), (int)201);
                                continue block94;
                            }
                        }
                        break;
                    }
                    var10_3 /* !! */  = hl.b;
                    v3 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl29
                    block95: while (true) {
                        v3 /* !! */  = (long)(v4 - hl.cxsz("cyjj", cxsw(int ), (int)202));
lbl29:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1720656797: {
                                v4 = hl.cxsz("cyjk", cxsw(int ), (int)203);
                                continue block95;
                            }
                            case -1586018072: {
                                break block95;
                            }
                            case -413601067: {
                                v4 = hl.cxsz("cyjl", cxsw(int ), (int)204);
                                continue block95;
                            }
                            case 1538373963: {
                                v4 = hl.cxsz("cyjm", cxsw(int ), (int)205);
                                continue block95;
                            }
                        }
                        break;
                    }
                    var9_4 = hl.a;
                    if (var11_2) {
                        throw null;
lbl44:
                        // 15 sources

                        return null;
                    }
                    if (var9_4 || var9_4) ** GOTO lbl44
                    while (true) {
                        if ((v5 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cyjn", cxsw(int ), (int)206)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v5 /* !! */  == hl.cxsz("cyjo", cxtb(int ), (int)218)) break;
                        v5 /* !! */  = (long)hl.cxsz("cyjp", cxtb(int ), (int)219);
                    }
                    var2_5 = var1_1.method_73189();
                    if (var9_4 || var9_4) ** GOTO lbl44
                    v6 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl58
                    block98: while (true) {
                        v6 /* !! */  = (long)(hl.cxsz("cyjr", cxsw(int ), (int)208) - hl.cxsz("cyjq", cxsw(int ), (int)207));
lbl58:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -1586018072: {
                                break block98;
                            }
                            case -1439707780: {
                                continue block98;
                            }
                        }
                        break;
                    }
                    v7 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl67
                    block99: while (true) {
                        v7 /* !! */  = (long)(hl.cxsz("cyjt", cxsw(int ), (int)210) - hl.cxsz("cyjs", cxsw(int ), (int)209));
lbl67:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1586018072: {
                                break block99;
                            }
                            case -1126331852: {
                                continue block99;
                            }
                        }
                        break;
                    }
                    if (this.predictMovement.isValue()) break block141;
                    if (var9_4) ** GOTO lbl44
                    return var2_5;
                }
                if (var9_4 || var9_4) ** GOTO lbl44
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = hl.gq - hl.cxsz("cyju", cxsw(int ), (int)211)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == hl.cxsz("cyjv", cxtb(int ), (int)220)) break;
                    v8 /* !! */  = (long)hl.cxsz("cyjw", cxtb(int ), (int)221);
                }
                v9 /* !! */  = hl.gq;
                if (true) ** GOTO lbl86
                block101: while (true) {
                    v9 /* !! */  = (long)(hl.cxsz("cyjy", cxsw(int ), (int)213) - hl.cxsz("cyjx", cxsw(int ), (int)212));
lbl86:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1586018072: {
                            break block101;
                        }
                        case 571838171: {
                            continue block101;
                        }
                    }
                    break;
                }
                var3_6 /* !! */  = this.elytraForward.getValue();
                if (var9_4 || var9_4) ** GOTO lbl44
                v10 /* !! */  = hl.gq;
                if (true) ** GOTO lbl97
                block102: while (true) {
                    v10 /* !! */  = (long)(hl.cxsz("cyka", cxsw(int ), (int)215) - hl.cxsz("cyjz", cxsw(int ), (int)214));
lbl97:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1586018072: {
                            break block102;
                        }
                        case 1305143445: {
                            continue block102;
                        }
                    }
                    break;
                }
                if (!this.isLeaving(var1_1)) ** GOTO lbl207
                if (var9_4) ** GOTO lbl44
                if (!(var1_1 instanceof class_1657)) ** GOTO lbl207
                if (var9_4) ** GOTO lbl44
                var5_7 = (class_1657)var1_1;
                if (var9_4 || var9_4) ** GOTO lbl44
                v11 /* !! */  = hl.gq;
                if (true) ** GOTO lbl112
                block103: while (true) {
                    v11 /* !! */  = (long)(v12 - hl.cxsz("cykb", cxsw(int ), (int)216));
lbl112:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1586018072: {
                            break block103;
                        }
                        case -1227591812: {
                            v12 = hl.cxsz("cykc", cxsw(int ), (int)217);
                            continue block103;
                        }
                        case 2131534677: {
                            v12 = hl.cxsz("cykd", cxsw(int ), (int)218);
                            continue block103;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = hl.gq - hl.cxsz("cyke", cxsw(int ), (int)219)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == hl.cxsz("cykf", cxtb(int ), (int)222)) break;
                    v13 /* !! */  = (long)hl.cxsz("cykg", cxtb(int ), (int)223);
                }
                if (hl.mc.method_1562() == null) ** GOTO lbl207
                if (var9_4 || var9_4) ** GOTO lbl44
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = hl.gq - hl.cxsz("cykh", cxsw(int ), (int)220)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == hl.cxsz("cyki", cxtb(int ), (int)224)) break;
                    v14 /* !! */  = (long)hl.cxsz("cykj", cxtb(int ), (int)225);
                }
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_4 = hl.gq - hl.cxsz("cykk", cxsw(int ), (int)221)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == hl.cxsz("cykl", cxtb(int ), (int)226)) break;
                    v15 /* !! */  = (long)hl.cxsz("cykm", cxtb(int ), (int)227);
                }
                v16 = hl.mc.method_1562();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = hl.gq - hl.cxsz("cykn", cxsw(int ), (int)222)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == hl.cxsz("cyko", cxtb(int ), (int)228)) break;
                    v17 /* !! */  = (long)hl.cxsz("cykp", cxtb(int ), (int)229);
                }
                v18 = var5_7.method_5667();
                v19 /* !! */  = hl.gq;
                if (true) ** GOTO lbl149
                block108: while (true) {
                    v19 /* !! */  = (long)(v20 - hl.cxsz("cykq", cxsw(int ), (int)223));
lbl149:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1586018072: {
                            break block108;
                        }
                        case 1142427001: {
                            v20 = hl.cxsz("cykr", cxsw(int ), (int)224);
                            continue block108;
                        }
                        case 1564787266: {
                            v20 = hl.cxsz("cyks", cxsw(int ), (int)225);
                            continue block108;
                        }
                    }
                    break;
                }
                var6_8 = v16.method_2871(v18);
                if (var9_4 || var9_4) ** GOTO lbl44
                if (var6_8 != null) break block142;
                if (var9_4) ** GOTO lbl44
                v21 = 0.0;
                if (var11_2) {
                    throw null;
                }
                break block143;
            }
            if (var9_4 || var9_4) ** GOTO lbl44
            v22 /* !! */  = hl.gq;
            if (true) ** GOTO lbl172
            block109: while (true) {
                v22 /* !! */  = (long)(v23 - hl.cxsz("cykt", cxsw(int ), (int)226));
lbl172:
                // 2 sources

                switch ((int)v22 /* !! */ ) {
                    case -1586018072: {
                        break block109;
                    }
                    case -1489143522: {
                        v23 = hl.cxsz("cyku", cxsw(int ), (int)227);
                        continue block109;
                    }
                    case -369238126: {
                        v23 = hl.cxsz("cykv", cxsw(int ), (int)228);
                        continue block109;
                    }
                    case 246957226: {
                        v23 = hl.cxsz("cykw", cxsw(int ), (int)229);
                        continue block109;
                    }
                }
                break;
            }
            v24 = (double)var6_8.method_2959() / hl.cxsz("cykx", cxyt(int ), (int)230);
            v25 = hl.cxsz("cyky", cxyt(int ), (int)231);
            v26 /* !! */  = hl.gq;
            if (true) ** GOTO lbl190
            block110: while (true) {
                v26 /* !! */  = (long)(v27 - hl.cxsz("cykz", cxsw(int ), (int)232));
lbl190:
                // 2 sources

                switch ((int)v26 /* !! */ ) {
                    case -1586018072: {
                        break block110;
                    }
                    case -780953721: {
                        v27 = hl.cxsz("cyla", cxsw(int ), (int)233);
                        continue block110;
                    }
                    case 1785275573: {
                        v27 = hl.cxsz("cylb", cxsw(int ), (int)234);
                        continue block110;
                    }
                }
                break;
            }
            v21 = var7_9 = Math.min(v24, (double)v25);
        }
        if (var9_4 || var9_4) ** GOTO lbl44
        if (var10_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                var3_6 /* !! */  = (double)(hl.cxsz("cylc", cxyt(int ), (int)235) + var7_9);
                if (var9_4) ** GOTO lbl44
lbl207:
                // 4 sources

                if (!var9_4 && !var9_4) ** break;
                ** continue;
                v28 /* !! */  = hl.gq;
                if (true) ** GOTO lbl213
                block111: while (true) {
                    v28 /* !! */  = (long)(v29 - hl.cxsz("cyld", cxsw(int ), (int)236));
lbl213:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -1779859526: {
                            v29 = hl.cxsz("cyle", cxsw(int ), (int)237);
                            continue block111;
                        }
                        case -1586018072: {
                            break block111;
                        }
                        case -1297998216: {
                            v29 = hl.cxsz("cylf", cxsw(int ), (int)238);
                            continue block111;
                        }
                        case 1194233089: {
                            v29 = hl.cxsz("cylg", cxsw(int ), (int)239);
                            continue block111;
                        }
                    }
                    break;
                }
                v30 = var1_1.method_18798();
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_6 = hl.gq - hl.cxsz("cylh", cxsw(int ), (int)240)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == hl.cxsz("cyli", cxtb(int ), (int)230)) break;
                    v31 /* !! */  = (long)hl.cxsz("cylj", cxtb(int ), (int)231);
                }
                v32 = v30.method_1021(var3_6 /* !! */ );
                v33 /* !! */  = hl.gq;
                if (true) ** GOTO lbl236
                block113: while (true) {
                    v33 /* !! */  = (long)(v34 - hl.cxsz("cylk", cxsw(int ), (int)241));
lbl236:
                    // 2 sources

                    switch ((int)v33 /* !! */ ) {
                        case -1586018072: {
                            break block113;
                        }
                        case -1309226731: {
                            v34 = hl.cxsz("cyll", cxsw(int ), (int)242);
                            continue block113;
                        }
                        case 232383885: {
                            v34 = hl.cxsz("cylm", cxsw(int ), (int)243);
                            continue block113;
                        }
                    }
                    break;
                }
                return var2_5.method_1019(v32);
            }
lbl246:
            // 3 sources

            case 0: {
                var10_3 /* !! */  = (int)hl.cxsz("cyln", cxtb(int ), (int)232);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
lbl251:
            // 3 sources

            case 1: {
                var10_3 /* !! */  = (int)hl.cxsz("cylo", cxtb(int ), (int)233);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
            case 2: {
                var10_3 /* !! */  = (int)hl.cxsz("cylp", cxtb(int ), (int)234);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl305
            }
            case 3: {
                var10_3 /* !! */  = (int)hl.cxsz("cylq", cxtb(int ), (int)235);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 4: {
                var10_3 /* !! */  = (int)hl.cxsz("cylr", cxtb(int ), (int)236);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl286
            }
lbl271:
            // 2 sources

            case 5: {
                var10_3 /* !! */  = (int)hl.cxsz("cyls", cxtb(int ), (int)237);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl276:
            // 2 sources

            case 6: {
                var10_3 /* !! */  = (int)hl.cxsz("cylt", cxtb(int ), (int)238);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl281:
            // 3 sources

            case 7: {
                var10_3 /* !! */  = (int)hl.cxsz("cylu", cxtb(int ), (int)239);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl286:
            // 3 sources

            case 8: {
                var10_3 /* !! */  = (int)hl.cxsz("cylv", cxtb(int ), (int)240);
                if (var11_2) {
                    throw null;
                }
            }
lbl290:
            // 5 sources

            case 9: {
                var10_3 /* !! */  = (int)hl.cxsz("cylw", cxtb(int ), (int)241);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl332
            }
lbl295:
            // 2 sources

            case 10: {
                var10_3 /* !! */  = (int)hl.cxsz("cylx", cxtb(int ), (int)242);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl364
            }
            case 11: {
                var10_3 /* !! */  = (int)hl.cxsz("cyly", cxtb(int ), (int)243);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl348
            }
lbl305:
            // 3 sources

            case 12: {
                var10_3 /* !! */  = (int)hl.cxsz("cylz", cxtb(int ), (int)244);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl356
            }
lbl310:
            // 2 sources

            case 13: {
                var10_3 /* !! */  = (int)hl.cxsz("cyma", cxtb(int ), (int)245);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 14: {
                var10_3 /* !! */  = (int)hl.cxsz("cymb", cxtb(int ), (int)246);
                if (!var11_2) ** GOTO lbl251
                throw null;
            }
            case 15: {
                var10_3 /* !! */  = (int)hl.cxsz("cymc", cxtb(int ), (int)247);
                if (!var11_2) ** GOTO lbl251
                throw null;
            }
            case 16: {
                var10_3 /* !! */  = (int)hl.cxsz("cymd", cxtb(int ), (int)248);
                if (!var11_2) ** GOTO lbl246
                throw null;
            }
            case 17: {
                var10_3 /* !! */  = (int)hl.cxsz("cyme", cxtb(int ), (int)249);
                if (var11_2) {
                    throw null;
                }
                ** GOTO lbl360
            }
lbl332:
            // 3 sources

            case 18: {
                var10_3 /* !! */  = (int)hl.cxsz("cymf", cxtb(int ), (int)250);
                if (!var11_2) ** GOTO lbl246
                throw null;
            }
lbl336:
            // 3 sources

            case 19: {
                var10_3 /* !! */  = (int)hl.cxsz("cymg", cxtb(int ), (int)251);
                if (!var11_2) ** GOTO lbl295
                throw null;
            }
lbl340:
            // 2 sources

            case 20: {
                var10_3 /* !! */  = (int)hl.cxsz("cymh", cxtb(int ), (int)252);
                if (!var11_2) ** GOTO lbl276
                throw null;
            }
lbl344:
            // 2 sources

            case 21: {
                var10_3 /* !! */  = (int)hl.cxsz("cymi", cxtb(int ), (int)253);
                if (!var11_2) ** GOTO lbl286
                throw null;
            }
lbl348:
            // 2 sources

            case 22: {
                var10_3 /* !! */  = (int)hl.cxsz("cymj", cxtb(int ), (int)254);
                if (!var11_2) ** GOTO lbl310
                throw null;
            }
            case 23: {
                var10_3 /* !! */  = (int)hl.cxsz("cymk", cxtb(int ), (int)255);
                if (!var11_2) ** GOTO lbl344
                throw null;
            }
lbl356:
            // 2 sources

            case 24: {
                var10_3 /* !! */  = (int)hl.cxsz("cyml", cxtb(int ), (int)256);
                if (!var11_2) ** GOTO lbl290
                throw null;
            }
lbl360:
            // 2 sources

            case 25: {
                var10_3 /* !! */  = (int)hl.cxsz("cymm", cxtb(int ), (int)257);
                if (!var11_2) ** GOTO lbl290
                throw null;
            }
lbl364:
            // 2 sources

            case 26: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var10_3 /* !! */  = (int)hl.cxsz("cymn", cxtb(int ), (int)258);
                    if (!var11_2) ** GOTO lbl271
                    throw null;
                }
            }
            case 27: 
        }
        var10_3 /* !! */  = (int)hl.cxsz("cymo", cxtb(int ), (int)259);
        ** while (!var11_2)
lbl372:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getAimPosition(class_1309 var1_1) {
        v0 /* !! */  = hl.gq;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - hl.cxsz("cydv", cxsw(int ), (int)142));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1646269650: {
                    v1 = hl.cxsz("cydw", cxsw(int ), (int)143);
                    continue block29;
                }
                case -1586018072: {
                    break block29;
                }
                case 181241431: {
                    v1 = hl.cxsz("cydx", cxsw(int ), (int)144);
                    continue block29;
                }
                case 1824309429: {
                    v1 = hl.cxsz("cydy", cxsw(int ), (int)145);
                    continue block29;
                }
            }
            break;
        }
        var4_2 = hl.c;
        v2 /* !! */  = hl.gq;
        if (true) ** GOTO lbl22
        block30: while (true) {
            v2 /* !! */  = (long)(hl.cxsz("cyea", cxsw(int ), (int)147) - hl.cxsz("cydz", cxsw(int ), (int)146));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1586018072: {
                    break block30;
                }
                case 902934534: {
                    continue block30;
                }
            }
            break;
        }
        var3_3 /* !! */  = hl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cyeb", cxsw(int ), (int)148)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == hl.cxsz("cyec", cxtb(int ), (int)134)) break;
            v3 /* !! */  = (long)hl.cxsz("cyed", cxtb(int ), (int)135);
        }
        var2_4 = hl.a;
        if (var4_2) {
            throw null;
lbl37:
            // 4 sources

            return null;
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl37
                v4 /* !! */  = hl.gq;
                if (true) ** GOTO lbl48
                block33: while (true) {
                    v4 /* !! */  = (long)(hl.cxsz("cyef", cxsw(int ), (int)150) - hl.cxsz("cyee", cxsw(int ), (int)149));
lbl48:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1586018072: {
                            break block33;
                        }
                        case 1880243350: {
                            continue block33;
                        }
                    }
                    break;
                }
                if (!this.shouldUseFor(var1_1)) ** GOTO lbl72
                if (var2_4) ** GOTO lbl37
                v5 /* !! */  = hl.gq;
                if (true) ** GOTO lbl59
                block34: while (true) {
                    v5 /* !! */  = (long)(v6 - hl.cxsz("cyeg", cxsw(int ), (int)151));
lbl59:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1692615890: {
                            v6 = hl.cxsz("cyeh", cxsw(int ), (int)152);
                            continue block34;
                        }
                        case -1586018072: {
                            break block34;
                        }
                        case 710312205: {
                            v6 = hl.cxsz("cyei", cxsw(int ), (int)153);
                            continue block34;
                        }
                    }
                    break;
                }
                v7 = this.computePredictedPosition(var1_1);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl82
lbl72:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = hl.gq - hl.cxsz("cyej", cxsw(int ), (int)154)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == hl.cxsz("cyek", cxtb(int ), (int)136)) {
                        v7 = var1_1.method_73189();
                        break;
                    }
                    v8 /* !! */  = (long)hl.cxsz("cyel", cxtb(int ), (int)137);
                }
lbl82:
                // 2 sources

                return v7;
            }
lbl83:
            // 3 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)hl.cxsz("cyem", cxtb(int ), (int)138);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)hl.cxsz("cyen", cxtb(int ), (int)139);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl97
            }
lbl93:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hl.cxsz("cyeo", cxtb(int ), (int)140);
                if (var4_2) {
                    throw null;
                }
            }
lbl97:
            // 5 sources

            case 3: {
                var3_3 /* !! */  = (int)hl.cxsz("cyep", cxtb(int ), (int)141);
                if (!var4_2) ** GOTO lbl83
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)hl.cxsz("cyeq", cxtb(int ), (int)142);
                if (!var4_2) ** GOTO lbl93
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hl.cxsz("cyer", cxtb(int ), (int)143);
                if (!var4_2) ** GOTO lbl97
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hl.cxsz("cyes", cxtb(int ), (int)144);
                    if (!var4_2) ** GOTO lbl83
                    throw null;
                }
            }
            case 7: 
        }
        var3_3 /* !! */  = (int)hl.cxsz("cyet", cxtb(int ), (int)145);
        ** while (!var4_2)
lbl117:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static hl getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cxta", cxsw(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hl.cxsz("cxte", cxtb(int ), (int)0)) break;
            v0 /* !! */  = (long)hl.cxsz("cxtf", cxtb(int ), (int)1);
        }
        var2 = hl.c;
        v1 /* !! */  = hl.gq;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - hl.cxsz("cxtg", cxsw(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1586018072: {
                    break block17;
                }
                case -1355021852: {
                    v2 = hl.cxsz("cxth", cxsw(int ), (int)2);
                    continue block17;
                }
                case 1611559257: {
                    v2 = hl.cxsz("cxti", cxsw(int ), (int)3);
                    continue block17;
                }
            }
            break;
        }
        var1_1 /* !! */  = hl.b;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block5 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = hl.gq;
                if (true) ** GOTO lbl29
                block18: while (true) {
                    v3 /* !! */  = (long)(v4 - hl.cxsz("cxtj", cxsw(int ), (int)4));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1586018072: {
                            break block18;
                        }
                        case -1519210831: {
                            v4 = hl.cxsz("cxtk", cxsw(int ), (int)5);
                            continue block18;
                        }
                        case 1190180191: {
                            v4 = hl.cxsz("cxtl", cxsw(int ), (int)6);
                            continue block18;
                        }
                    }
                    break;
                }
                var0_2 = hl.a;
                if (var2) {
                    throw null;
                    return null;
                }
                if (var0_2 || var0_2) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = hl.gq - hl.cxsz("cxtm", cxsw(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hl.cxsz("cxtn", cxtb(int ), (int)2)) break;
                    v5 /* !! */  = (long)hl.cxsz("cxto", cxtb(int ), (int)3);
                }
                return nj.get(hl.class);
            }
lbl51:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)hl.cxsz("cxtp", cxtb(int ), (int)4);
                } while (!var2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)hl.cxsz("cxtq", cxtb(int ), (int)5);
                    if (!var2) break block5;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)hl.cxsz("cxtr", cxtb(int ), (int)6);
                if (!var2) ** GOTO lbl51
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)hl.cxsz("cxts", cxtb(int ), (int)7);
        ** while (!var2)
lbl68:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1657 getCurrentTarget() {
        v0 /* !! */  = hl.gq;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(hl.cxsz("cygc", cxsw(int ), (int)175) - hl.cxsz("cygb", cxsw(int ), (int)174));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1586018072: {
                    break block19;
                }
                case 126481977: {
                    continue block19;
                }
            }
            break;
        }
        var3_1 = hl.c;
        v1 /* !! */  = hl.gq;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(hl.cxsz("cyge", cxsw(int ), (int)177) - hl.cxsz("cygd", cxsw(int ), (int)176));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1586018072: {
                    break block20;
                }
                case 736192244: {
                    continue block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = hl.b;
        v2 /* !! */  = hl.gq;
        if (true) ** GOTO lbl25
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - hl.cxsz("cygf", cxsw(int ), (int)178));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1586018072: {
                    break block21;
                }
                case -470619452: {
                    v3 = hl.cxsz("cygg", cxsw(int ), (int)179);
                    continue block21;
                }
                case -138287240: {
                    v3 = hl.cxsz("cygh", cxsw(int ), (int)180);
                    continue block21;
                }
            }
            break;
        }
        var1_3 = hl.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block22;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cygi", cxsw(int ), (int)181)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == hl.cxsz("cygj", cxtb(int ), (int)160)) break;
                    v4 /* !! */  = (long)hl.cxsz("cygk", cxtb(int ), (int)161);
                }
                return this.currentTarget;
                case 0: {
                    var2_2 /* !! */  = (int)hl.cxsz("cygl", cxtb(int ), (int)162);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl59
                }
lbl54:
                // 2 sources

                case 1: {
                    do {
                        var2_2 /* !! */  = (int)hl.cxsz("cygm", cxtb(int ), (int)163);
                    } while (!var3_1);
                    throw null;
                }
lbl59:
                // 2 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)hl.cxsz("cygn", cxtb(int ), (int)164);
                        if (!var3_1) ** GOTO lbl54
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)hl.cxsz("cygo", cxtb(int ), (int)165);
        ** while (!var3_1)
lbl67:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cynr() {
        hl.cxtc[100] = -2136433675;
        hl.cxtc[101] = -2085464182;
        hl.cxtc[102] = 403557371;
        hl.cxtc[103] = -582071134;
        hl.cxtc[104] = 1848199712;
        hl.cxtc[105] = -1974104257;
        hl.cxtc[106] = -511740683;
        hl.cxtc[107] = -1922400536;
        hl.cxtc[108] = 1588246073;
        hl.cxtc[109] = -1178003169;
        hl.cxtc[110] = -783437457;
        hl.cxtc[111] = 1415399453;
        hl.cxtc[112] = 2015428551;
        hl.cxtc[113] = -913462622;
        hl.cxtc[114] = -838377976;
        hl.cxtc[115] = 111522216;
        hl.cxtc[116] = -26889122;
        hl.cxtc[117] = 1489098618;
        hl.cxtc[118] = -1743187452;
        hl.cxtc[119] = -613021391;
        hl.cxtc[120] = -610213892;
        hl.cxtc[121] = -2144419752;
        hl.cxtc[122] = -1750409802;
        hl.cxtc[123] = -481030065;
        hl.cxtc[124] = 747960879;
        hl.cxtc[125] = 251279959;
        hl.cxtc[126] = -550995059;
        hl.cxtc[127] = -1742036062;
        hl.cxtc[128] = -471819404;
        hl.cxtc[129] = -1008044314;
        hl.cxtc[130] = 96695709;
        hl.cxtc[131] = -1944039801;
        hl.cxtc[132] = -1101379578;
        hl.cxtc[133] = 1856574184;
        hl.cxtc[134] = -1324873940;
        hl.cxtc[135] = -131056906;
        hl.cxtc[136] = -930501831;
        hl.cxtc[137] = -1392140241;
        hl.cxtc[138] = -1432494569;
        hl.cxtc[139] = -960475683;
        hl.cxtc[140] = 2015808301;
        hl.cxtc[141] = -1006429233;
        hl.cxtc[142] = -1792616112;
        hl.cxtc[143] = 1438531903;
        hl.cxtc[144] = -342428658;
        hl.cxtc[145] = 1784013431;
        hl.cxtc[146] = -1632319929;
        hl.cxtc[147] = 1216561621;
        hl.cxtc[148] = 1324838799;
        hl.cxtc[149] = 75577329;
        hl.cxtc[150] = 614414884;
        hl.cxtc[151] = -1580986880;
        hl.cxtc[152] = -1567090892;
        hl.cxtc[153] = -646009240;
        hl.cxtc[154] = -789162605;
        hl.cxtc[155] = -116050130;
        hl.cxtc[156] = 1262463822;
        hl.cxtc[157] = 2015388275;
        hl.cxtc[158] = 2116950385;
        hl.cxtc[159] = -815249594;
        hl.cxtc[160] = -127019587;
        hl.cxtc[161] = 986310138;
        hl.cxtc[162] = 636536094;
        hl.cxtc[163] = -1893739297;
        hl.cxtc[164] = 177923931;
        hl.cxtc[165] = 855685625;
        hl.cxtc[166] = -2119564945;
        hl.cxtc[167] = -1724607046;
        hl.cxtc[168] = -1013470702;
        hl.cxtc[169] = 623705599;
        hl.cxtc[170] = 701232584;
        hl.cxtc[171] = -2044902449;
        hl.cxtc[172] = -1068276986;
        hl.cxtc[173] = -145300149;
        hl.cxtc[174] = -1079877153;
        hl.cxtc[175] = -697546017;
        hl.cxtc[176] = -1988605169;
        hl.cxtc[177] = 1634760234;
        hl.cxtc[178] = -592261437;
        hl.cxtc[179] = 1288656607;
        hl.cxtc[180] = -2033245646;
        hl.cxtc[181] = 626964091;
        hl.cxtc[182] = -882392890;
        hl.cxtc[183] = 214290257;
        hl.cxtc[184] = -1814149889;
        hl.cxtc[185] = -428477419;
        hl.cxtc[186] = -623457970;
        hl.cxtc[187] = 1110623051;
        hl.cxtc[188] = -1811179094;
        hl.cxtc[189] = 1212832537;
        hl.cxtc[190] = 505007605;
        hl.cxtc[191] = 879295155;
        hl.cxtc[192] = 646959095;
        hl.cxtc[193] = 215023060;
        hl.cxtc[194] = -1559239137;
        hl.cxtc[195] = 2107390200;
        hl.cxtc[196] = -1750760340;
        hl.cxtc[197] = -336003708;
        hl.cxtc[198] = 363052137;
        hl.cxtc[199] = -1649371113;
    }

    private static /* synthetic */ void cyob() {
        hl.cxsy[200] = -2720610304327639534L;
        hl.cxsy[201] = 2355616884380374715L;
        hl.cxsy[202] = 1004123910775966631L;
        hl.cxsy[203] = 8884335713574587538L;
        hl.cxsy[204] = 8450901122927249497L;
        hl.cxsy[205] = -3105055149196139622L;
        hl.cxsy[206] = -7863655350551320292L;
        hl.cxsy[207] = -849023998368303617L;
        hl.cxsy[208] = -8225693150269872506L;
        hl.cxsy[209] = 539557754506828652L;
        hl.cxsy[210] = -878001930690262384L;
        hl.cxsy[211] = -5451944281768760402L;
        hl.cxsy[212] = -1395123191366486862L;
        hl.cxsy[213] = -3498221561160499768L;
        hl.cxsy[214] = 6941701406880378385L;
        hl.cxsy[215] = -7463067592182691163L;
        hl.cxsy[216] = -3091879681204288691L;
        hl.cxsy[217] = -6524225969848531916L;
        hl.cxsy[218] = -1174630042113835430L;
        hl.cxsy[219] = 5051021989343675007L;
        hl.cxsy[220] = -5368042628455124355L;
        hl.cxsy[221] = -1999446152424878408L;
        hl.cxsy[222] = -1520601980056355281L;
        hl.cxsy[223] = 6474660992727825789L;
        hl.cxsy[224] = 3458752296669648208L;
        hl.cxsy[225] = 1556471746339518009L;
        hl.cxsy[226] = 3374507612740047043L;
        hl.cxsy[227] = -2857119803208030048L;
        hl.cxsy[228] = -384086787303642169L;
        hl.cxsy[229] = -7824047231761446031L;
        hl.cxsy[230] = 1035793594050913377L;
        hl.cxsy[231] = -4767753760146356712L;
        hl.cxsy[232] = 7706271171528250602L;
        hl.cxsy[233] = -7895602741255198450L;
        hl.cxsy[234] = -672695860305134314L;
        hl.cxsy[235] = 8731449069346343039L;
        hl.cxsy[236] = 1942289876052072242L;
        hl.cxsy[237] = 7846066826981858604L;
        hl.cxsy[238] = 3532754181926780332L;
        hl.cxsy[239] = 7709990398885007250L;
        hl.cxsy[240] = 4144565602398758104L;
        hl.cxsy[241] = -3090612094017819407L;
        hl.cxsy[242] = 8195671226726099125L;
        hl.cxsy[243] = 4661492412774223965L;
        hl.cxsy[244] = 4504153083766957803L;
        hl.cxsy[245] = -1507164334391955749L;
        hl.cxsy[246] = 153584326206301084L;
        hl.cxsy[247] = -6238223937586666620L;
        hl.cxsy[248] = 8623926427737573110L;
        hl.cxsy[249] = -2504638093285391967L;
    }

    private static /* synthetic */ void cynu() {
        hl.cxtd[100] = -2136433676;
        hl.cxtd[101] = -368809377;
        hl.cxtd[102] = 403557371;
        hl.cxtd[103] = -582071134;
        hl.cxtd[104] = 1848199712;
        hl.cxtd[105] = -1974104258;
        hl.cxtd[106] = -511740683;
        hl.cxtd[107] = -1922400531;
        hl.cxtd[108] = 1588246075;
        hl.cxtd[109] = -1178003185;
        hl.cxtd[110] = -783437467;
        hl.cxtd[111] = 1415399437;
        hl.cxtd[112] = 2015428547;
        hl.cxtd[113] = -913462621;
        hl.cxtd[114] = -838377966;
        hl.cxtd[115] = 111522226;
        hl.cxtd[116] = -26889130;
        hl.cxtd[117] = 1489098600;
        hl.cxtd[118] = -1743187444;
        hl.cxtd[119] = -613021378;
        hl.cxtd[120] = -610213910;
        hl.cxtd[121] = -2144419752;
        hl.cxtd[122] = -1750409793;
        hl.cxtd[123] = -481030069;
        hl.cxtd[124] = 747960886;
        hl.cxtd[125] = 251279962;
        hl.cxtd[126] = -550995064;
        hl.cxtd[127] = -1742036057;
        hl.cxtd[128] = -471819420;
        hl.cxtd[129] = -1008044312;
        hl.cxtd[130] = 96695692;
        hl.cxtd[131] = -1944039777;
        hl.cxtd[132] = -1101379580;
        hl.cxtd[133] = 1856574193;
        hl.cxtd[134] = 1324873939;
        hl.cxtd[135] = 672014513;
        hl.cxtd[136] = -930501832;
        hl.cxtd[137] = 1539360669;
        hl.cxtd[138] = -1432494570;
        hl.cxtd[139] = -960475686;
        hl.cxtd[140] = 2015808303;
        hl.cxtd[141] = -1006429237;
        hl.cxtd[142] = -1792616110;
        hl.cxtd[143] = 1438531897;
        hl.cxtd[144] = -342428659;
        hl.cxtd[145] = 1784013426;
        hl.cxtd[146] = 1632319928;
        hl.cxtd[147] = -1241869300;
        hl.cxtd[148] = 1324838798;
        hl.cxtd[149] = 993636969;
        hl.cxtd[150] = 614414885;
        hl.cxtd[151] = 248280868;
        hl.cxtd[152] = -1567090894;
        hl.cxtd[153] = -646009240;
        hl.cxtd[154] = -789162601;
        hl.cxtd[155] = -116050135;
        hl.cxtd[156] = 1262463818;
        hl.cxtd[157] = 2015388277;
        hl.cxtd[158] = 2116950390;
        hl.cxtd[159] = -815249593;
        hl.cxtd[160] = -127019588;
        hl.cxtd[161] = 878650135;
        hl.cxtd[162] = 636536094;
        hl.cxtd[163] = -1893739297;
        hl.cxtd[164] = 177923930;
        hl.cxtd[165] = 855685626;
        hl.cxtd[166] = -2119564945;
        hl.cxtd[167] = -1724607048;
        hl.cxtd[168] = -1013470702;
        hl.cxtd[169] = 623705596;
        hl.cxtd[170] = 701232607;
        hl.cxtd[171] = -2044902454;
        hl.cxtd[172] = -1068276958;
        hl.cxtd[173] = -145300153;
        hl.cxtd[174] = -1079877153;
        hl.cxtd[175] = -697546026;
        hl.cxtd[176] = -1988605138;
        hl.cxtd[177] = 1634760229;
        hl.cxtd[178] = -592261426;
        hl.cxtd[179] = 1288656580;
        hl.cxtd[180] = -2033245674;
        hl.cxtd[181] = 626964071;
        hl.cxtd[182] = -882392849;
        hl.cxtd[183] = 214290254;
        hl.cxtd[184] = -1814149928;
        hl.cxtd[185] = -428477389;
        hl.cxtd[186] = -623457984;
        hl.cxtd[187] = 1110623081;
        hl.cxtd[188] = -1811179074;
        hl.cxtd[189] = 1212832532;
        hl.cxtd[190] = 505007598;
        hl.cxtd[191] = 879295142;
        hl.cxtd[192] = 646959095;
        hl.cxtd[193] = 215023101;
        hl.cxtd[194] = -1559239157;
        hl.cxtd[195] = 2107390171;
        hl.cxtd[196] = -1750760349;
        hl.cxtd[197] = -336003698;
        hl.cxtd[198] = 363052157;
        hl.cxtd[199] = -1649371134;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1657 resolveTarget() {
        block100: {
            block102: {
                block101: {
                    block99: {
                        block98: {
                            var11_1 = hl.c;
                            var10_2 /* !! */  = hl.b;
                            var9_3 = hl.a;
                            if (var11_1) {
                                throw null;
lbl6:
                                // 27 sources

                                return null;
                            }
                            if (var9_3 || var9_3) ** GOTO lbl6
                            if (hn.getInstance() != null) break block98;
                            if (var9_3) ** GOTO lbl6
                            v0 = null;
                            if (var11_1) {
                                throw null;
                            }
                            break block99;
                        }
                        if (var9_3 || var9_3) ** GOTO lbl6
                        v0 = var1_4 = hn.getInstance().getTarget();
                    }
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!this.onlyAuraTarget.isValue()) break block100;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!(var1_4 instanceof class_1657)) break block101;
                    if (var9_3) ** GOTO lbl6
                    var2_5 = (class_1657)var1_4;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (!this.shouldUseFor((class_1309)var2_5)) break block101;
                    if (var9_3) ** GOTO lbl6
                    v1 = var2_5;
                    if (var11_1) {
                        throw null;
                    }
                    break block102;
                }
                if (var9_3 || var9_3) ** GOTO lbl6
                v1 = null;
            }
            return v1;
        }
        if (var9_3 || var9_3) ** GOTO lbl6
        var2_6 = null;
        if (var9_3 || var9_3) ** GOTO lbl6
        var3_7 /* !! */  = hl.cxsz("cyhh", cxyt(int ), (int)196);
        if (var9_3 || var9_3) ** GOTO lbl6
        var5_8 = hl.mc.field_1687.method_18456().iterator();
        if (var9_3) ** GOTO lbl6
        block51: while (true) {
            block103: {
                if (var9_3 || var9_3) ** GOTO lbl6
                if (!var5_8.hasNext()) ** GOTO lbl77
                if (var9_3) ** GOTO lbl6
                var6_9 = (class_1657)var5_8.next();
                if (var9_3 || var9_3) ** GOTO lbl6
                if (var6_9 == hl.mc.field_1724) continue;
                if (var9_3) ** GOTO lbl6
                if (!this.shouldUseFor((class_1309)var6_9)) continue;
                if (var9_3) ** GOTO lbl6
                if (!dl.isFriend((class_1297)var6_9)) break block103;
                if (var9_3) ** GOTO lbl6
                if (!var11_1) continue;
                throw null;
            }
            if (var9_3 || var9_3) ** GOTO lbl6
            var7_10 = hl.mc.field_1724.method_5858((class_1297)var6_9);
            if (var9_3) ** GOTO lbl6
            if (var10_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var10_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var9_3) ** GOTO lbl6
                    if (!(var7_10 < var3_7 /* !! */ )) ** GOTO lbl73
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var3_7 /* !! */  = (CallSite)var7_10;
                    if (var9_3 || var9_3) ** GOTO lbl6
                    var2_6 = var6_9;
                    if (var9_3) ** GOTO lbl6
lbl73:
                    // 2 sources

                    if (var9_3 || var9_3) ** GOTO lbl6
                    if (var11_1) ** break;
                    continue block51;
                    throw null;
                }
lbl77:
                // 1 sources

                if (!var9_3 && !var9_3) ** break;
                ** continue;
                return var2_6;
lbl80:
                // 3 sources

                case 0: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhi", cxtb(int ), (int)170);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl282
                }
lbl85:
                // 2 sources

                case 1: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhj", cxtb(int ), (int)171);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl122
                }
lbl90:
                // 2 sources

                case 2: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhk", cxtb(int ), (int)172);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
lbl95:
                // 2 sources

                case 3: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhl", cxtb(int ), (int)173);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl118
                }
                case 4: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhm", cxtb(int ), (int)174);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl286
                }
lbl105:
                // 3 sources

                case 5: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhn", cxtb(int ), (int)175);
                    if (!var11_1) ** GOTO lbl95
                    throw null;
                }
lbl109:
                // 2 sources

                case 6: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyho", cxtb(int ), (int)176);
                    if (!var11_1) break block51;
                    throw null;
                }
                case 7: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhp", cxtb(int ), (int)177);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl171
                }
lbl118:
                // 3 sources

                case 8: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhq", cxtb(int ), (int)178);
                    if (!var11_1) ** GOTO lbl109
                    throw null;
                }
lbl122:
                // 3 sources

                case 9: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhr", cxtb(int ), (int)179);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl212
                }
                case 10: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhs", cxtb(int ), (int)180);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl222
                }
lbl132:
                // 2 sources

                case 11: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyht", cxtb(int ), (int)181);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl162
                }
                case 12: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhu", cxtb(int ), (int)182);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl157
                }
lbl142:
                // 2 sources

                case 13: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var10_2 /* !! */  = (int)hl.cxsz("cyhv", cxtb(int ), (int)183);
                        if (var11_1) {
                            throw null;
                        }
                        ** GOTO lbl248
                        break;
                    }
                }
                case 14: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhw", cxtb(int ), (int)184);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl231
                }
lbl153:
                // 2 sources

                case 15: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhx", cxtb(int ), (int)185);
                    if (var11_1) {
                        throw null;
                    }
                }
lbl157:
                // 4 sources

                case 16: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhy", cxtb(int ), (int)186);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl274
                }
lbl162:
                // 2 sources

                case 17: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyhz", cxtb(int ), (int)187);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl207
                }
                case 18: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyia", cxtb(int ), (int)188);
                    if (!var11_1) ** GOTO lbl132
                    throw null;
                }
lbl171:
                // 2 sources

                case 19: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyib", cxtb(int ), (int)189);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl248
                }
lbl176:
                // 3 sources

                case 20: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyic", cxtb(int ), (int)190);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl217
                }
                case 21: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyid", cxtb(int ), (int)191);
                    if (!var11_1) break block51;
                    throw null;
                }
                case 22: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyie", cxtb(int ), (int)192);
                    if (!var11_1) ** GOTO lbl176
                    throw null;
                }
lbl189:
                // 2 sources

                case 23: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyif", cxtb(int ), (int)193);
                    if (!var11_1) ** GOTO lbl85
                    throw null;
                }
                case 24: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyig", cxtb(int ), (int)194);
                    if (!var11_1) ** GOTO lbl122
                    throw null;
                }
                case 25: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyih", cxtb(int ), (int)195);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl240
                }
                case 26: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyii", cxtb(int ), (int)196);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl244
                }
lbl207:
                // 3 sources

                case 27: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyij", cxtb(int ), (int)197);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl290
                }
lbl212:
                // 3 sources

                case 28: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyik", cxtb(int ), (int)198);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl244
                }
lbl217:
                // 2 sources

                case 29: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyil", cxtb(int ), (int)199);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl282
                }
lbl222:
                // 2 sources

                case 30: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyim", cxtb(int ), (int)200);
                    if (!var11_1) ** GOTO lbl176
                    throw null;
                }
                case 31: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyin", cxtb(int ), (int)201);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl274
                }
lbl231:
                // 3 sources

                case 32: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyio", cxtb(int ), (int)202);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl253
                }
lbl236:
                // 2 sources

                case 33: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyip", cxtb(int ), (int)203);
                    if (!var11_1) ** GOTO lbl212
                    throw null;
                }
lbl240:
                // 2 sources

                case 34: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyiq", cxtb(int ), (int)204);
                    if (!var11_1) ** GOTO lbl207
                    throw null;
                }
lbl244:
                // 3 sources

                case 35: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyir", cxtb(int ), (int)205);
                    if (!var11_1) ** GOTO lbl90
                    throw null;
                }
lbl248:
                // 3 sources

                case 36: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyis", cxtb(int ), (int)206);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl270
                }
lbl253:
                // 2 sources

                case 37: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyit", cxtb(int ), (int)207);
                    if (var11_1) {
                        throw null;
                    }
                    ** GOTO lbl266
                }
                case 38: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyiu", cxtb(int ), (int)208);
                    if (!var11_1) ** GOTO lbl142
                    throw null;
                }
                case 39: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyiv", cxtb(int ), (int)209);
                    if (!var11_1) ** GOTO lbl105
                    throw null;
                }
lbl266:
                // 2 sources

                case 40: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyiw", cxtb(int ), (int)210);
                    if (!var11_1) ** GOTO lbl153
                    throw null;
                }
lbl270:
                // 2 sources

                case 41: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyix", cxtb(int ), (int)211);
                    if (!var11_1) ** GOTO lbl236
                    throw null;
                }
lbl274:
                // 3 sources

                case 42: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyiy", cxtb(int ), (int)212);
                    if (!var11_1) ** GOTO lbl80
                    throw null;
                }
                case 43: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyiz", cxtb(int ), (int)213);
                    if (!var11_1) ** GOTO lbl231
                    throw null;
                }
lbl282:
                // 3 sources

                case 44: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyja", cxtb(int ), (int)214);
                    if (!var11_1) ** GOTO lbl80
                    throw null;
                }
lbl286:
                // 2 sources

                case 45: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyjb", cxtb(int ), (int)215);
                    if (!var11_1) ** GOTO lbl105
                    throw null;
                }
lbl290:
                // 2 sources

                case 46: {
                    var10_2 /* !! */  = (int)hl.cxsz("cyjc", cxtb(int ), (int)216);
                    if (!var11_1) ** GOTO lbl118
                    throw null;
                }
                case 47: 
            }
            break;
        }
        var10_2 /* !! */  = (int)hl.cxsz("cyjd", cxtb(int ), (int)217);
        ** while (!var11_1)
lbl297:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cyny() {
        hl.cxsx[200] = 4513839553081161950L;
        hl.cxsx[201] = -7350885297911371047L;
        hl.cxsx[202] = -8783432162522444542L;
        hl.cxsx[203] = 3145946136881828825L;
        hl.cxsx[204] = 6206771232201045543L;
        hl.cxsx[205] = 673043361771752136L;
        hl.cxsx[206] = -8875224768504292123L;
        hl.cxsx[207] = 8707940055920427653L;
        hl.cxsx[208] = -7200349556419794047L;
        hl.cxsx[209] = 79911553674771497L;
        hl.cxsx[210] = -2948661137559668956L;
        hl.cxsx[211] = -4594661171318134994L;
        hl.cxsx[212] = -9173792808565101425L;
        hl.cxsx[213] = 8695094280316760203L;
        hl.cxsx[214] = -2888681046977596448L;
        hl.cxsx[215] = -2754868192544463344L;
        hl.cxsx[216] = -6545398029569107331L;
        hl.cxsx[217] = 6427428922852068757L;
        hl.cxsx[218] = -6281802092698831133L;
        hl.cxsx[219] = 7072678838272223127L;
        hl.cxsx[220] = -7157410360804880297L;
        hl.cxsx[221] = 788576501837554001L;
        hl.cxsx[222] = -8981945826995512186L;
        hl.cxsx[223] = -6689029386469003401L;
        hl.cxsx[224] = -3501502032302436884L;
        hl.cxsx[225] = -1495916240519328466L;
        hl.cxsx[226] = 2305516011299076395L;
        hl.cxsx[227] = 925760668973187889L;
        hl.cxsx[228] = -4650213711693088888L;
        hl.cxsx[229] = 426174014767483657L;
        hl.cxsx[230] = 5626931939178423393L;
        hl.cxsx[231] = -161697241253181928L;
        hl.cxsx[232] = 3947463815964237076L;
        hl.cxsx[233] = -5582469683215051880L;
        hl.cxsx[234] = 8462101886056566745L;
        hl.cxsx[235] = 4119763050918955135L;
        hl.cxsx[236] = 3083760240555253451L;
        hl.cxsx[237] = -2583775811615331720L;
        hl.cxsx[238] = 6580382514144094261L;
        hl.cxsx[239] = -269921723464801923L;
        hl.cxsx[240] = -2512422904421424706L;
        hl.cxsx[241] = 1439740740608665630L;
        hl.cxsx[242] = -8729225147811869191L;
        hl.cxsx[243] = 8543550003121559687L;
        hl.cxsx[244] = 2525296569478827568L;
        hl.cxsx[245] = 6347903454083217425L;
        hl.cxsx[246] = -3218152496070247124L;
        hl.cxsx[247] = 5437006745689216227L;
        hl.cxsx[248] = 3003295964149115657L;
        hl.cxsx[249] = 5351508621795643856L;
    }

    private static /* synthetic */ void cynx() {
        hl.cxsx[100] = -6775399622860606797L;
        hl.cxsx[101] = -1315017206532609119L;
        hl.cxsx[102] = 3462472933028287037L;
        hl.cxsx[103] = 345122580241827795L;
        hl.cxsx[104] = -455894351610126377L;
        hl.cxsx[105] = -7867715595887575969L;
        hl.cxsx[106] = -6530698499033133058L;
        hl.cxsx[107] = -3043598662009748788L;
        hl.cxsx[108] = -1748852648528368772L;
        hl.cxsx[109] = -8882641639881238794L;
        hl.cxsx[110] = -5863522554849116493L;
        hl.cxsx[111] = -5918130251365028383L;
        hl.cxsx[112] = 3462317806696512403L;
        hl.cxsx[113] = -919807749686315244L;
        hl.cxsx[114] = 6146600441956751854L;
        hl.cxsx[115] = -5596721938288317545L;
        hl.cxsx[116] = -1300368173758809247L;
        hl.cxsx[117] = 3298324301627787174L;
        hl.cxsx[118] = -3980048485401927072L;
        hl.cxsx[119] = -5492379765391446991L;
        hl.cxsx[120] = -3447742645677247353L;
        hl.cxsx[121] = 5351788858096382863L;
        hl.cxsx[122] = 1038308913062804729L;
        hl.cxsx[123] = -854062354891426125L;
        hl.cxsx[124] = -3024640928311893951L;
        hl.cxsx[125] = -1818147435143918418L;
        hl.cxsx[126] = -5618613363891909748L;
        hl.cxsx[127] = 5325101526501747319L;
        hl.cxsx[128] = -6586031207126242492L;
        hl.cxsx[129] = -6938262235854649906L;
        hl.cxsx[130] = 6589242027030984726L;
        hl.cxsx[131] = 4661127501897490767L;
        hl.cxsx[132] = 8607133581612120820L;
        hl.cxsx[133] = -6768137931774126410L;
        hl.cxsx[134] = 5441671535951830997L;
        hl.cxsx[135] = 6899558442058192394L;
        hl.cxsx[136] = -1975385338732377237L;
        hl.cxsx[137] = -2777103524618814766L;
        hl.cxsx[138] = 3310161580697769140L;
        hl.cxsx[139] = -8632106417211840659L;
        hl.cxsx[140] = -3776791978983905188L;
        hl.cxsx[141] = 3871656565906408794L;
        hl.cxsx[142] = -340693305355189382L;
        hl.cxsx[143] = 5122270227164237638L;
        hl.cxsx[144] = -9020831081196769436L;
        hl.cxsx[145] = -6307465491213483749L;
        hl.cxsx[146] = -7877193747758018863L;
        hl.cxsx[147] = -6493891760135409305L;
        hl.cxsx[148] = -3432597517175522584L;
        hl.cxsx[149] = -2994168840355670693L;
        hl.cxsx[150] = -85227710680769164L;
        hl.cxsx[151] = -7538936919160274095L;
        hl.cxsx[152] = 2934587794759668438L;
        hl.cxsx[153] = 234825825640797625L;
        hl.cxsx[154] = -8880352287751272274L;
        hl.cxsx[155] = 7928863726300972439L;
        hl.cxsx[156] = -8316878178798875264L;
        hl.cxsx[157] = 420579560315974232L;
        hl.cxsx[158] = 4899080487544163856L;
        hl.cxsx[159] = -6108883518881624451L;
        hl.cxsx[160] = 8681400066257664821L;
        hl.cxsx[161] = 2013933960641716823L;
        hl.cxsx[162] = -2825831663066655278L;
        hl.cxsx[163] = -1302360426062554587L;
        hl.cxsx[164] = 4801449478954856261L;
        hl.cxsx[165] = 7462333295133727331L;
        hl.cxsx[166] = 4596297836929231840L;
        hl.cxsx[167] = 8039993128764456567L;
        hl.cxsx[168] = -6199967872763658515L;
        hl.cxsx[169] = -3332202854661607535L;
        hl.cxsx[170] = -856698480541190447L;
        hl.cxsx[171] = 2556253307559039420L;
        hl.cxsx[172] = -2383195354553113676L;
        hl.cxsx[173] = -1879541120719701524L;
        hl.cxsx[174] = -8473163980765400673L;
        hl.cxsx[175] = 654023688477603892L;
        hl.cxsx[176] = -2245995902173914783L;
        hl.cxsx[177] = -6040248862433881160L;
        hl.cxsx[178] = 2730232737282377227L;
        hl.cxsx[179] = -7309892152105451318L;
        hl.cxsx[180] = 6823981353504912432L;
        hl.cxsx[181] = 3976897068752765387L;
        hl.cxsx[182] = -5171023710175723544L;
        hl.cxsx[183] = -9131835235414506374L;
        hl.cxsx[184] = 3189404530919504415L;
        hl.cxsx[185] = 7201178959676794525L;
        hl.cxsx[186] = -5800244706030324030L;
        hl.cxsx[187] = -70583623988931546L;
        hl.cxsx[188] = -7238271143913675608L;
        hl.cxsx[189] = -2373323529583204980L;
        hl.cxsx[190] = 403455402897089689L;
        hl.cxsx[191] = -4145955159048854996L;
        hl.cxsx[192] = 3407492634299327394L;
        hl.cxsx[193] = -274667247414479895L;
        hl.cxsx[194] = 9166643619794289331L;
        hl.cxsx[195] = 432546868162301449L;
        hl.cxsx[196] = -1029749734382199111L;
        hl.cxsx[197] = 8055181378377913988L;
        hl.cxsx[198] = -2747845600970814282L;
        hl.cxsx[199] = 8184460125805821222L;
    }

    private static /* synthetic */ int cxtb(int n2) {
        return cxtc[n2] ^ cxtd[n2];
    }

    private static /* synthetic */ void cyoa() {
        hl.cxsy[100] = -7968954815532428295L;
        hl.cxsy[101] = 6889346735121520311L;
        hl.cxsy[102] = 2038682241177728430L;
        hl.cxsy[103] = -8441013988973432183L;
        hl.cxsy[104] = -2361338807190787904L;
        hl.cxsy[105] = 1219298529964294806L;
        hl.cxsy[106] = 3992326889839671896L;
        hl.cxsy[107] = -2112248987999358656L;
        hl.cxsy[108] = 5376811344620438038L;
        hl.cxsy[109] = -7868896938242471719L;
        hl.cxsy[110] = 7087020659599227093L;
        hl.cxsy[111] = -3443351934935025970L;
        hl.cxsy[112] = 7594346194351539969L;
        hl.cxsy[113] = 2935055443660400880L;
        hl.cxsy[114] = -7500917042997764873L;
        hl.cxsy[115] = 7720847105094096042L;
        hl.cxsy[116] = 1289198934893815666L;
        hl.cxsy[117] = -634972601112616269L;
        hl.cxsy[118] = -3344244563482295197L;
        hl.cxsy[119] = -7098654934975719401L;
        hl.cxsy[120] = -6585002593177171441L;
        hl.cxsy[121] = 8676915608799530471L;
        hl.cxsy[122] = 2849306569822796011L;
        hl.cxsy[123] = -4138232777564967293L;
        hl.cxsy[124] = -4536633947976240141L;
        hl.cxsy[125] = 7125486478235178396L;
        hl.cxsy[126] = 3791816013005725676L;
        hl.cxsy[127] = 3029308938542405089L;
        hl.cxsy[128] = -8209450543526533797L;
        hl.cxsy[129] = -3293334715263755116L;
        hl.cxsy[130] = 1159965139094378452L;
        hl.cxsy[131] = -8070016724075011260L;
        hl.cxsy[132] = -5646483166529675136L;
        hl.cxsy[133] = 4051369691968256406L;
        hl.cxsy[134] = 521927103692237012L;
        hl.cxsy[135] = 2644408026748519417L;
        hl.cxsy[136] = 3533058419151855062L;
        hl.cxsy[137] = 7629242352953187498L;
        hl.cxsy[138] = -5350608121475661650L;
        hl.cxsy[139] = 2945505173596362162L;
        hl.cxsy[140] = 2415828422744112062L;
        hl.cxsy[141] = -7455851716667857390L;
        hl.cxsy[142] = 185022262941666944L;
        hl.cxsy[143] = 560847977416863743L;
        hl.cxsy[144] = 5797589973067614810L;
        hl.cxsy[145] = 2641289017870941084L;
        hl.cxsy[146] = 2748634199889363719L;
        hl.cxsy[147] = -1526033829100828430L;
        hl.cxsy[148] = -7380966681291751573L;
        hl.cxsy[149] = 6052071018646960380L;
        hl.cxsy[150] = -3812064517511812299L;
        hl.cxsy[151] = -7389611779675321212L;
        hl.cxsy[152] = -7926625166662952729L;
        hl.cxsy[153] = -849934840286252251L;
        hl.cxsy[154] = 5196022085116390626L;
        hl.cxsy[155] = -818681751313550198L;
        hl.cxsy[156] = 4959606222999826747L;
        hl.cxsy[157] = -2486618784203704038L;
        hl.cxsy[158] = -1311665954971738368L;
        hl.cxsy[159] = -7772211980467661348L;
        hl.cxsy[160] = 89077872724394567L;
        hl.cxsy[161] = 8917378567690572685L;
        hl.cxsy[162] = -6958297588888623337L;
        hl.cxsy[163] = 7985797415509441219L;
        hl.cxsy[164] = -6256441805056745926L;
        hl.cxsy[165] = -3187784262515621476L;
        hl.cxsy[166] = -2639000649518120952L;
        hl.cxsy[167] = 8404213214687602161L;
        hl.cxsy[168] = 7069423728646501755L;
        hl.cxsy[169] = -2907777636553257120L;
        hl.cxsy[170] = 931018419017325939L;
        hl.cxsy[171] = -7244158715089649735L;
        hl.cxsy[172] = -2634316965978821774L;
        hl.cxsy[173] = 4722855349469610215L;
        hl.cxsy[174] = 3553061772074391800L;
        hl.cxsy[175] = 7277256907789192674L;
        hl.cxsy[176] = 3195101715762145063L;
        hl.cxsy[177] = -1098399141440153347L;
        hl.cxsy[178] = 8872553752367097138L;
        hl.cxsy[179] = -8502961137118939713L;
        hl.cxsy[180] = -942107629526271065L;
        hl.cxsy[181] = -7258809348130400650L;
        hl.cxsy[182] = -2980788510208240476L;
        hl.cxsy[183] = -3928647862723291953L;
        hl.cxsy[184] = 4393471729154607653L;
        hl.cxsy[185] = -5420344617298023289L;
        hl.cxsy[186] = 9043701656407304571L;
        hl.cxsy[187] = 7101932848490417955L;
        hl.cxsy[188] = 6558308823057056185L;
        hl.cxsy[189] = -7186435134118857061L;
        hl.cxsy[190] = -5170016024339085196L;
        hl.cxsy[191] = -3161228752121878014L;
        hl.cxsy[192] = -1063471987363735163L;
        hl.cxsy[193] = 6681764389534190822L;
        hl.cxsy[194] = 8418346566295957260L;
        hl.cxsy[195] = 884186913978253564L;
        hl.cxsy[196] = -8189118702845206202L;
        hl.cxsy[197] = -3431799055005342608L;
        hl.cxsy[198] = 4040014669328693430L;
        hl.cxsy[199] = -2185190720226172817L;
    }

    private static /* synthetic */ float cxtt(int n2) {
        return Float.intBitsToFloat(cxtc[n2] ^ cxtd[n2]);
    }

    private static /* synthetic */ void cynw() {
        hl.cxsx[0] = 5349349723907309264L;
        hl.cxsx[1] = -7530357037329529052L;
        hl.cxsx[2] = 3361198434789411567L;
        hl.cxsx[3] = -3248017801066201549L;
        hl.cxsx[4] = 8024562200786415910L;
        hl.cxsx[5] = -8381344793462396230L;
        hl.cxsx[6] = 5391044919011277288L;
        hl.cxsx[7] = -6315743004089986316L;
        hl.cxsx[8] = -801423110034933287L;
        hl.cxsx[9] = -6089769859289930641L;
        hl.cxsx[10] = -2834828724314681078L;
        hl.cxsx[11] = 6192771786244864684L;
        hl.cxsx[12] = 478351847940034168L;
        hl.cxsx[13] = -4359801584314529335L;
        hl.cxsx[14] = 1717830217228782635L;
        hl.cxsx[15] = 4458154855259252057L;
        hl.cxsx[16] = 2196573926445342006L;
        hl.cxsx[17] = 2136265722696080133L;
        hl.cxsx[18] = -9164762034003177544L;
        hl.cxsx[19] = -3331920449900521460L;
        hl.cxsx[20] = -8853888115454926788L;
        hl.cxsx[21] = 3159567080557663656L;
        hl.cxsx[22] = -5393673743421085401L;
        hl.cxsx[23] = 8677071264529213180L;
        hl.cxsx[24] = 7420305382961395106L;
        hl.cxsx[25] = -1608805447226694361L;
        hl.cxsx[26] = 3839435968200358770L;
        hl.cxsx[27] = 866111555228682233L;
        hl.cxsx[28] = -3491608122339320624L;
        hl.cxsx[29] = 6273470982408503625L;
        hl.cxsx[30] = 2545840624893603014L;
        hl.cxsx[31] = -9023376510161658315L;
        hl.cxsx[32] = 2444188424678557074L;
        hl.cxsx[33] = 3146480607641407170L;
        hl.cxsx[34] = -3755749139874658332L;
        hl.cxsx[35] = -6398647056640537538L;
        hl.cxsx[36] = 5126400329726845091L;
        hl.cxsx[37] = 7670212138558511520L;
        hl.cxsx[38] = 2246640886664541201L;
        hl.cxsx[39] = -1281564806373352645L;
        hl.cxsx[40] = 3391874459668844996L;
        hl.cxsx[41] = 4367415800494527215L;
        hl.cxsx[42] = 177849201130079368L;
        hl.cxsx[43] = 6485952717300794736L;
        hl.cxsx[44] = 2020611574713206147L;
        hl.cxsx[45] = 1155077565174461300L;
        hl.cxsx[46] = 2305958408671146612L;
        hl.cxsx[47] = 2046963293272839641L;
        hl.cxsx[48] = -5754060950917399227L;
        hl.cxsx[49] = -1609494596321096805L;
        hl.cxsx[50] = -5981331371330690792L;
        hl.cxsx[51] = 4354614808759781503L;
        hl.cxsx[52] = 3111442167746673637L;
        hl.cxsx[53] = 1828083871862039378L;
        hl.cxsx[54] = -7931352369898094943L;
        hl.cxsx[55] = 8646270552230568541L;
        hl.cxsx[56] = -6570577611657586490L;
        hl.cxsx[57] = -2247286508889145651L;
        hl.cxsx[58] = -4611812121947453177L;
        hl.cxsx[59] = 66803770411387958L;
        hl.cxsx[60] = -8788812538863284078L;
        hl.cxsx[61] = -8598992241887035812L;
        hl.cxsx[62] = 4120217204730783818L;
        hl.cxsx[63] = 1054496480730269112L;
        hl.cxsx[64] = 7233570847895460536L;
        hl.cxsx[65] = -7368820708404478871L;
        hl.cxsx[66] = 3353889590644399263L;
        hl.cxsx[67] = 7448473670722747094L;
        hl.cxsx[68] = 8311947868163182179L;
        hl.cxsx[69] = -9171396611704470972L;
        hl.cxsx[70] = -7735866428297862229L;
        hl.cxsx[71] = 3991453700068519054L;
        hl.cxsx[72] = -848502507221576698L;
        hl.cxsx[73] = 6876556935142709L;
        hl.cxsx[74] = -918266240880885240L;
        hl.cxsx[75] = 3216989146665010286L;
        hl.cxsx[76] = -2022361337584205238L;
        hl.cxsx[77] = -2834490418106282633L;
        hl.cxsx[78] = -5893097194430417216L;
        hl.cxsx[79] = -1261019066925677678L;
        hl.cxsx[80] = 6839818086964773680L;
        hl.cxsx[81] = 6097171107505517220L;
        hl.cxsx[82] = 2786938033636690063L;
        hl.cxsx[83] = 6425393204310104279L;
        hl.cxsx[84] = -3089866963941007957L;
        hl.cxsx[85] = -4728780329622080340L;
        hl.cxsx[86] = -7310925638241017488L;
        hl.cxsx[87] = 366462074081812278L;
        hl.cxsx[88] = -7036646554172694185L;
        hl.cxsx[89] = 2941717901899154711L;
        hl.cxsx[90] = -5508470155844825390L;
        hl.cxsx[91] = 2793374032306926415L;
        hl.cxsx[92] = -2132451750844276674L;
        hl.cxsx[93] = -1500012920781962609L;
        hl.cxsx[94] = 4801917026097183596L;
        hl.cxsx[95] = -4490127102278130690L;
        hl.cxsx[96] = -3686889891993654918L;
        hl.cxsx[97] = 4365365546215514275L;
        hl.cxsx[98] = -8268401450401393289L;
        hl.cxsx[99] = 9169871725520921545L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        block113: {
            v0 /* !! */  = hl.gq;
            if (true) ** GOTO lbl5
            block76: while (true) {
                v0 /* !! */  = (long)(v1 - hl.cxsz("cxup", cxsw(int ), (int)8));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1924449847: {
                        v1 = hl.cxsz("cxuq", cxsw(int ), (int)9);
                        continue block76;
                    }
                    case -1586018072: {
                        break block76;
                    }
                    case -1216916497: {
                        v1 = hl.cxsz("cxur", cxsw(int ), (int)10);
                        continue block76;
                    }
                    case 1081675327: {
                        v1 = hl.cxsz("cxus", cxsw(int ), (int)11);
                        continue block76;
                    }
                }
                break;
            }
            var4_2 = hl.c;
            v2 /* !! */  = hl.gq;
            if (true) ** GOTO lbl22
            block77: while (true) {
                v2 /* !! */  = (long)(v3 - hl.cxsz("cxut", cxsw(int ), (int)12));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1586018072: {
                        break block77;
                    }
                    case -135705552: {
                        v3 = hl.cxsz("cxuu", cxsw(int ), (int)13);
                        continue block77;
                    }
                    case 384257208: {
                        v3 = hl.cxsz("cxuv", cxsw(int ), (int)14);
                        continue block77;
                    }
                }
                break;
            }
            var3_3 /* !! */  = hl.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cxuw", cxsw(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == hl.cxsz("cxux", cxtb(int ), (int)29)) break;
                v4 /* !! */  = (long)hl.cxsz("cxuy", cxtb(int ), (int)30);
            }
            var2_4 = hl.a;
            if (var4_2) {
                throw null;
lbl40:
                // 9 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl40
            v5 /* !! */  = hl.gq;
            if (true) ** GOTO lbl47
            block80: while (true) {
                v5 /* !! */  = (long)(hl.cxsz("cxva", cxsw(int ), (int)17) - hl.cxsz("cxuz", cxsw(int ), (int)16));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1868854187: {
                        continue block80;
                    }
                    case -1586018072: {
                        break block80;
                    }
                }
                break;
            }
            v6 /* !! */  = hl.gq;
            if (true) ** GOTO lbl56
            block81: while (true) {
                v6 /* !! */  = (long)(v7 - hl.cxsz("cxvb", cxsw(int ), (int)18));
lbl56:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1617656812: {
                        v7 = hl.cxsz("cxvc", cxsw(int ), (int)19);
                        continue block81;
                    }
                    case -1586018072: {
                        break block81;
                    }
                    case -364322617: {
                        v7 = hl.cxsz("cxvd", cxsw(int ), (int)20);
                        continue block81;
                    }
                    case 1721827378: {
                        v7 = hl.cxsz("cxve", cxsw(int ), (int)21);
                        continue block81;
                    }
                }
                break;
            }
            if (hl.mc.field_1724 == null) break block113;
            if (var2_4) ** GOTO lbl40
            v8 /* !! */  = hl.gq;
            if (true) ** GOTO lbl74
            block82: while (true) {
                v8 /* !! */  = (long)(v9 - hl.cxsz("cxvf", cxsw(int ), (int)22));
lbl74:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -1586018072: {
                        break block82;
                    }
                    case -216369105: {
                        v9 = hl.cxsz("cxvg", cxsw(int ), (int)23);
                        continue block82;
                    }
                    case -205070289: {
                        v9 = hl.cxsz("cxvh", cxsw(int ), (int)24);
                        continue block82;
                    }
                }
                break;
            }
            v10 /* !! */  = hl.gq;
            if (true) ** GOTO lbl87
            block83: while (true) {
                v10 /* !! */  = (long)(v11 - hl.cxsz("cxvi", cxsw(int ), (int)25));
lbl87:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1586018072: {
                        break block83;
                    }
                    case -497127694: {
                        v11 = hl.cxsz("cxvj", cxsw(int ), (int)26);
                        continue block83;
                    }
                    case -280185181: {
                        v11 = hl.cxsz("cxvk", cxsw(int ), (int)27);
                        continue block83;
                    }
                }
                break;
            }
            if (hl.mc.field_1687 != null) ** GOTO lbl135
            if (var2_4) ** GOTO lbl40
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_1 = hl.gq - hl.cxsz("cxvl", cxsw(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == hl.cxsz("cxvm", cxtb(int ), (int)31)) break;
            v12 /* !! */  = (long)hl.cxsz("cxvn", cxtb(int ), (int)32);
        }
        this.currentTarget = null;
        if (var2_4 || var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v13 /* !! */  = hl.gq;
                if (true) ** GOTO lbl114
                block85: while (true) {
                    v13 /* !! */  = (long)(v14 - hl.cxsz("cxvo", cxsw(int ), (int)29));
lbl114:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1586018072: {
                            break block85;
                        }
                        case -927068855: {
                            v14 = hl.cxsz("cxvp", cxsw(int ), (int)30);
                            continue block85;
                        }
                        case -28049862: {
                            v14 = hl.cxsz("cxvq", cxsw(int ), (int)31);
                            continue block85;
                        }
                    }
                    break;
                }
                v15 /* !! */  = hl.gq;
                if (true) ** GOTO lbl127
                block86: while (true) {
                    v15 /* !! */  = (long)(hl.cxsz("cxvs", cxsw(int ), (int)33) - hl.cxsz("cxvr", cxsw(int ), (int)32));
lbl127:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1586018072: {
                            break block86;
                        }
                        case -1294810813: {
                            continue block86;
                        }
                    }
                    break;
                }
                this.predictedPosition = class_243.field_1353;
                if (var2_4 || var2_4) ** GOTO lbl40
                return;
            }
lbl135:
            // 1 sources

            if (var2_4 || var2_4) ** GOTO lbl40
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_2 = hl.gq - hl.cxsz("cxvt", cxsw(int ), (int)34)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == hl.cxsz("cxvu", cxtb(int ), (int)33)) break;
                v16 /* !! */  = (long)hl.cxsz("cxvv", cxtb(int ), (int)34);
            }
            v17 = this.resolveTarget();
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_3 = hl.gq - hl.cxsz("cxvw", cxsw(int ), (int)35)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == hl.cxsz("cxvx", cxtb(int ), (int)35)) break;
                v18 /* !! */  = (long)hl.cxsz("cxvy", cxtb(int ), (int)36);
            }
            this.currentTarget = v17;
            if (var2_4 || var2_4) ** GOTO lbl40
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_4 = hl.gq - hl.cxsz("cxvz", cxsw(int ), (int)36)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == hl.cxsz("cxwa", cxtb(int ), (int)37)) break;
                v19 /* !! */  = (long)hl.cxsz("cxwb", cxtb(int ), (int)38);
            }
            if (this.currentTarget != null) ** GOTO lbl175
            v20 /* !! */  = hl.gq;
            if (true) ** GOTO lbl159
            block90: while (true) {
                v20 /* !! */  = (long)(v21 - hl.cxsz("cxwc", cxsw(int ), (int)37));
lbl159:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1586018072: {
                        break block90;
                    }
                    case -1093332654: {
                        v21 = hl.cxsz("cxwd", cxsw(int ), (int)38);
                        continue block90;
                    }
                    case 204738092: {
                        v21 = hl.cxsz("cxwe", cxsw(int ), (int)39);
                        continue block90;
                    }
                    case 1172406645: {
                        v21 = hl.cxsz("cxwf", cxsw(int ), (int)40);
                        continue block90;
                    }
                }
                break;
            }
            v22 = class_243.field_1353;
            if (var4_2) {
                throw null;
            }
            ** GOTO lbl190
lbl175:
            // 1 sources

            while (true) {
                if ((v23 /* !! */  = (cfr_temp_5 = hl.gq - hl.cxsz("cxwg", cxsw(int ), (int)41)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == hl.cxsz("cxwh", cxtb(int ), (int)39)) break;
                v23 /* !! */  = (long)hl.cxsz("cxwi", cxtb(int ), (int)40);
            }
            v24 /* !! */  = hl.gq;
            if (true) ** GOTO lbl184
            block92: while (true) {
                v24 /* !! */  = (long)(hl.cxsz("cxwk", cxsw(int ), (int)43) - hl.cxsz("cxwj", cxsw(int ), (int)42));
lbl184:
                // 2 sources

                switch ((int)v24 /* !! */ ) {
                    case -1886779316: {
                        continue block92;
                    }
                    case -1586018072: {
                        break block92;
                    }
                }
                break;
            }
            v22 = this.computePredictedPosition((class_1309)this.currentTarget);
lbl190:
            // 2 sources

            v25 /* !! */  = hl.gq;
            if (true) ** GOTO lbl194
            block93: while (true) {
                v25 /* !! */  = (long)(v26 - hl.cxsz("cxwl", cxsw(int ), (int)44));
lbl194:
                // 2 sources

                switch ((int)v25 /* !! */ ) {
                    case -1586018072: {
                        break block93;
                    }
                    case -1279364382: {
                        v26 = hl.cxsz("cxwm", cxsw(int ), (int)45);
                        continue block93;
                    }
                    case 2086143858: {
                        v26 = hl.cxsz("cxwn", cxsw(int ), (int)46);
                        continue block93;
                    }
                }
                break;
            }
            this.predictedPosition = v22;
            if (!var2_4 && !var2_4) ** break;
            ** continue;
            return;
lbl207:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwo", cxtb(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl212:
            // 3 sources

            case 1: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwp", cxtb(int ), (int)42);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl217:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwq", cxtb(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl235
            }
            case 3: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwr", cxtb(int ), (int)44);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl227:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)hl.cxsz("cxws", cxtb(int ), (int)45);
                if (!var4_2) ** GOTO lbl207
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwt", cxtb(int ), (int)46);
                if (!var4_2) ** GOTO lbl217
                throw null;
            }
lbl235:
            // 3 sources

            case 6: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwu", cxtb(int ), (int)47);
                if (!var4_2) ** GOTO lbl212
                throw null;
            }
lbl239:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwv", cxtb(int ), (int)48);
                if (!var4_2) ** GOTO lbl227
                throw null;
            }
lbl243:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)hl.cxsz("cxww", cxtb(int ), (int)49);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl282
            }
lbl248:
            // 2 sources

            case 9: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwx", cxtb(int ), (int)50);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl253:
            // 3 sources

            case 10: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwy", cxtb(int ), (int)51);
                if (!var4_2) ** GOTO lbl248
                throw null;
            }
lbl257:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)hl.cxsz("cxwz", cxtb(int ), (int)52);
                if (!var4_2) ** GOTO lbl235
                throw null;
            }
lbl261:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)hl.cxsz("cxxa", cxtb(int ), (int)53);
                if (!var4_2) ** GOTO lbl239
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)hl.cxsz("cxxb", cxtb(int ), (int)54);
                if (!var4_2) ** GOTO lbl212
                throw null;
            }
            case 14: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hl.cxsz("cxxc", cxtb(int ), (int)55);
                    if (!var4_2) ** GOTO lbl243
                    throw null;
                }
            }
lbl274:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)hl.cxsz("cxxd", cxtb(int ), (int)56);
                if (!var4_2) ** GOTO lbl261
                throw null;
            }
lbl278:
            // 2 sources

            case 16: {
                var3_3 /* !! */  = (int)hl.cxsz("cxxe", cxtb(int ), (int)57);
                if (!var4_2) ** GOTO lbl207
                throw null;
            }
lbl282:
            // 2 sources

            case 17: {
                var3_3 /* !! */  = (int)hl.cxsz("cxxf", cxtb(int ), (int)58);
                if (!var4_2) ** GOTO lbl274
                throw null;
            }
            case 18: 
        }
        var3_3 /* !! */  = (int)hl.cxsz("cxxg", cxtb(int ), (int)59);
        ** while (!var4_2)
lbl289:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onBoundingBox(bl var1_1) {
        block135: {
            block134: {
                block133: {
                    v0 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl5
                    block93: while (true) {
                        v0 /* !! */  = (long)(v1 - hl.cxsz("cxxh", cxsw(int ), (int)47));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -1586018072: {
                                break block93;
                            }
                            case -402024204: {
                                v1 = hl.cxsz("cxxi", cxsw(int ), (int)48);
                                continue block93;
                            }
                            case 1768861851: {
                                v1 = hl.cxsz("cxxj", cxsw(int ), (int)49);
                                continue block93;
                            }
                        }
                        break;
                    }
                    var6_2 = hl.c;
                    v2 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl19
                    block94: while (true) {
                        v2 /* !! */  = (long)(v3 - hl.cxsz("cxxk", cxsw(int ), (int)50));
lbl19:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -1586018072: {
                                break block94;
                            }
                            case 1236424586: {
                                v3 = hl.cxsz("cxxl", cxsw(int ), (int)51);
                                continue block94;
                            }
                            case 1383135076: {
                                v3 = hl.cxsz("cxxm", cxsw(int ), (int)52);
                                continue block94;
                            }
                        }
                        break;
                    }
                    var5_3 /* !! */  = hl.b;
                    while (true) {
                        if ((v4 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cxxn", cxsw(int ), (int)53)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v4 /* !! */  == hl.cxsz("cxxo", cxtb(int ), (int)60)) break;
                        v4 /* !! */  = (long)hl.cxsz("cxxp", cxtb(int ), (int)61);
                    }
                    var4_4 = hl.a;
                    if (var6_2) {
                        throw null;
lbl37:
                        // 12 sources

                        return;
                    }
                    if (var4_4 || var4_4) ** GOTO lbl37
                    v5 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl44
                    block97: while (true) {
                        v5 /* !! */  = (long)(v6 - hl.cxsz("cxxq", cxsw(int ), (int)54));
lbl44:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1586018072: {
                                break block97;
                            }
                            case -560452653: {
                                v6 = hl.cxsz("cxxr", cxsw(int ), (int)55);
                                continue block97;
                            }
                            case 756180815: {
                                v6 = hl.cxsz("cxxs", cxsw(int ), (int)56);
                                continue block97;
                            }
                        }
                        break;
                    }
                    v7 = var1_1.getEntity();
                    v8 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl58
                    block98: while (true) {
                        v8 /* !! */  = (long)(hl.cxsz("cxxu", cxsw(int ), (int)58) - hl.cxsz("cxxt", cxsw(int ), (int)57));
lbl58:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1586018072: {
                                break block98;
                            }
                            case 1310432310: {
                                continue block98;
                            }
                        }
                        break;
                    }
                    if (v7 != this.currentTarget) break block133;
                    if (var4_4) ** GOTO lbl37
                    v9 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl69
                    block99: while (true) {
                        v9 /* !! */  = (long)(hl.cxsz("cxxw", cxsw(int ), (int)60) - hl.cxsz("cxxv", cxsw(int ), (int)59));
lbl69:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1586018072: {
                                break block99;
                            }
                            case 269146013: {
                                continue block99;
                            }
                        }
                        break;
                    }
                    if (this.currentTarget == null) break block133;
                    if (var4_4) ** GOTO lbl37
                    v10 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl80
                    block100: while (true) {
                        v10 /* !! */  = (long)(v11 - hl.cxsz("cxxx", cxsw(int ), (int)61));
lbl80:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1586018072: {
                                break block100;
                            }
                            case 1697891: {
                                v11 = hl.cxsz("cxxy", cxsw(int ), (int)62);
                                continue block100;
                            }
                            case 674113529: {
                                v11 = hl.cxsz("cxxz", cxsw(int ), (int)63);
                                continue block100;
                            }
                        }
                        break;
                    }
                    v12 /* !! */  = hl.gq;
                    if (true) ** GOTO lbl93
                    block101: while (true) {
                        v12 /* !! */  = (long)(v13 - hl.cxsz("cxya", cxsw(int ), (int)64));
lbl93:
                        // 2 sources

                        switch ((int)v12 /* !! */ ) {
                            case -1586018072: {
                                break block101;
                            }
                            case 1064002005: {
                                v13 = hl.cxsz("cxyb", cxsw(int ), (int)65);
                                continue block101;
                            }
                            case 1173741384: {
                                v13 = hl.cxsz("cxyc", cxsw(int ), (int)66);
                                continue block101;
                            }
                        }
                        break;
                    }
                    if (this.shouldUseFor((class_1309)this.currentTarget)) break block134;
                    if (var4_4) ** GOTO lbl37
                }
                if (var4_4 || var4_4) ** GOTO lbl37
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl37
            v14 /* !! */  = hl.gq;
            if (true) ** GOTO lbl113
            block102: while (true) {
                v14 /* !! */  = (long)(v15 - hl.cxsz("cxyd", cxsw(int ), (int)67));
lbl113:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -2108349548: {
                        v15 = hl.cxsz("cxye", cxsw(int ), (int)68);
                        continue block102;
                    }
                    case -1586018072: {
                        break block102;
                    }
                    case -792907423: {
                        v15 = hl.cxsz("cxyf", cxsw(int ), (int)69);
                        continue block102;
                    }
                    case 2073641599: {
                        v15 = hl.cxsz("cxyg", cxsw(int ), (int)70);
                        continue block102;
                    }
                }
                break;
            }
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_1 = hl.gq - hl.cxsz("cxyh", cxsw(int ), (int)71)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == hl.cxsz("cxyi", cxtb(int ), (int)62)) break;
                v16 /* !! */  = (long)hl.cxsz("cxyj", cxtb(int ), (int)63);
            }
            var2_5 = this.extraHitbox.getValue();
            if (var4_4 || var4_4) ** GOTO lbl37
            v17 /* !! */  = hl.gq;
            if (true) ** GOTO lbl136
            block104: while (true) {
                v17 /* !! */  = (long)(v18 - hl.cxsz("cxyk", cxsw(int ), (int)72));
lbl136:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1586018072: {
                        break block104;
                    }
                    case 228581015: {
                        v18 = hl.cxsz("cxyl", cxsw(int ), (int)73);
                        continue block104;
                    }
                    case 385405832: {
                        v18 = hl.cxsz("cxym", cxsw(int ), (int)74);
                        continue block104;
                    }
                }
                break;
            }
            v19 /* !! */  = hl.gq;
            if (true) ** GOTO lbl149
            block105: while (true) {
                v19 /* !! */  = (long)(hl.cxsz("cxyo", cxsw(int ), (int)76) - hl.cxsz("cxyn", cxsw(int ), (int)75));
lbl149:
                // 2 sources

                switch ((int)v19 /* !! */ ) {
                    case -1586018072: {
                        break block105;
                    }
                    case 1954265882: {
                        continue block105;
                    }
                }
                break;
            }
            v20 /* !! */  = hl.gq;
            if (true) ** GOTO lbl158
            block106: while (true) {
                v20 /* !! */  = (long)(v21 - hl.cxsz("cxyp", cxsw(int ), (int)77));
lbl158:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -1586018072: {
                        break block106;
                    }
                    case -370457075: {
                        v21 = hl.cxsz("cxyq", cxsw(int ), (int)78);
                        continue block106;
                    }
                    case 296781302: {
                        v21 = hl.cxsz("cxyr", cxsw(int ), (int)79);
                        continue block106;
                    }
                    case 882332933: {
                        v21 = hl.cxsz("cxys", cxsw(int ), (int)80);
                        continue block106;
                    }
                }
                break;
            }
            if (this.predictedPosition.equals((Object)class_243.field_1353)) break block135;
            if (var4_4 || var4_4) ** GOTO lbl37
            v22 = hl.cxsz("cxyu", cxyt(int ), (int)81);
            v23 /* !! */  = hl.gq;
            if (true) ** GOTO lbl177
            block107: while (true) {
                v23 /* !! */  = (long)(hl.cxsz("cxyw", cxsw(int ), (int)83) - hl.cxsz("cxyv", cxsw(int ), (int)82));
lbl177:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -2020875404: {
                        continue block107;
                    }
                    case -1586018072: {
                        break block107;
                    }
                }
                break;
            }
            while (true) {
                if ((v24 /* !! */  = (cfr_temp_2 = hl.gq - hl.cxsz("cxyx", cxsw(int ), (int)84)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v24 /* !! */  == hl.cxsz("cxyy", cxtb(int ), (int)64)) break;
                v24 /* !! */  = (long)hl.cxsz("cxyz", cxtb(int ), (int)65);
            }
            v25 = this.currentTarget.method_73189();
            while (true) {
                if ((v26 /* !! */  = (cfr_temp_3 = hl.gq - hl.cxsz("cxza", cxsw(int ), (int)85)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v26 /* !! */  == hl.cxsz("cxzb", cxtb(int ), (int)66)) break;
                v26 /* !! */  = (long)hl.cxsz("cxzc", cxtb(int ), (int)67);
            }
            v27 /* !! */  = hl.gq;
            if (true) ** GOTO lbl197
            block110: while (true) {
                v27 /* !! */  = (long)(v28 - hl.cxsz("cxzd", cxsw(int ), (int)86));
lbl197:
                // 2 sources

                switch ((int)v27 /* !! */ ) {
                    case -1586018072: {
                        break block110;
                    }
                    case 1117936107: {
                        v28 = hl.cxsz("cxze", cxsw(int ), (int)87);
                        continue block110;
                    }
                    case 1604793426: {
                        v28 = hl.cxsz("cxzf", cxsw(int ), (int)88);
                        continue block110;
                    }
                    case 2096900094: {
                        v28 = hl.cxsz("cxzg", cxsw(int ), (int)89);
                        continue block110;
                    }
                }
                break;
            }
            v29 = v25.method_1022(this.predictedPosition) * hl.cxsz("cxzh", cxyt(int ), (int)90);
            while (true) {
                if ((v30 /* !! */  = (cfr_temp_4 = hl.gq - hl.cxsz("cxzi", cxsw(int ), (int)91)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v30 /* !! */  == hl.cxsz("cxzj", cxtb(int ), (int)68)) break;
                v30 /* !! */  = (long)hl.cxsz("cxzk", cxtb(int ), (int)69);
            }
            var2_5 += Math.min((double)v22, v29);
            if (var4_4) ** GOTO lbl37
        }
        if (var4_4 || var4_4) ** GOTO lbl37
        while (true) {
            if ((v31 /* !! */  = (cfr_temp_5 = hl.gq - hl.cxsz("cxzl", cxsw(int ), (int)92)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v31 /* !! */  == hl.cxsz("cxzm", cxtb(int ), (int)70)) break;
            v31 /* !! */  = (long)hl.cxsz("cxzn", cxtb(int ), (int)71);
        }
        v32 = var1_1.getBox();
        while (true) {
            if ((v33 /* !! */  = (cfr_temp_6 = hl.gq - hl.cxsz("cxzo", cxsw(int ), (int)93)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v33 /* !! */  == hl.cxsz("cxzp", cxtb(int ), (int)72)) break;
            v33 /* !! */  = (long)hl.cxsz("cxzq", cxtb(int ), (int)73);
        }
        v34 = v32.method_1014(var2_5);
        v35 /* !! */  = hl.gq;
        if (true) ** GOTO lbl235
        block114: while (true) {
            v35 /* !! */  = (long)(v36 - hl.cxsz("cxzr", cxsw(int ), (int)94));
lbl235:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -1626753384: {
                    v36 = hl.cxsz("cxzs", cxsw(int ), (int)95);
                    continue block114;
                }
                case -1586018072: {
                    break block114;
                }
                case 641526945: {
                    v36 = hl.cxsz("cxzt", cxsw(int ), (int)96);
                    continue block114;
                }
                case 1274803304: {
                    v36 = hl.cxsz("cxzu", cxsw(int ), (int)97);
                    continue block114;
                }
            }
            break;
        }
        var1_1.setBox(v34);
        if (var4_4) ** GOTO lbl37
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)hl.cxsz("cxzv", cxtb(int ), (int)74);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl260:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)hl.cxsz("cxzw", cxtb(int ), (int)75);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl331
            }
lbl265:
            // 3 sources

            case 2: {
                var5_3 /* !! */  = (int)hl.cxsz("cxzx", cxtb(int ), (int)76);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl270:
            // 3 sources

            case 3: {
                var5_3 /* !! */  = (int)hl.cxsz("cxzy", cxtb(int ), (int)77);
                if (!var6_2) ** GOTO lbl265
                throw null;
            }
            case 4: {
                var5_3 /* !! */  = (int)hl.cxsz("cxzz", cxtb(int ), (int)78);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl279:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)hl.cxsz("cyaa", cxtb(int ), (int)79);
                if (!var6_2) break;
                throw null;
            }
lbl283:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)hl.cxsz("cyab", cxtb(int ), (int)80);
                if (!var6_2) ** GOTO lbl270
                throw null;
            }
lbl287:
            // 2 sources

            case 7: {
                var5_3 /* !! */  = (int)hl.cxsz("cyac", cxtb(int ), (int)81);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl297
            }
lbl292:
            // 3 sources

            case 8: {
                var5_3 /* !! */  = (int)hl.cxsz("cyad", cxtb(int ), (int)82);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl335
            }
lbl297:
            // 3 sources

            case 9: {
                var5_3 /* !! */  = (int)hl.cxsz("cyae", cxtb(int ), (int)83);
                if (!var6_2) ** GOTO lbl260
                throw null;
            }
            case 10: {
                var5_3 /* !! */  = (int)hl.cxsz("cyaf", cxtb(int ), (int)84);
                if (!var6_2) ** GOTO lbl279
                throw null;
            }
lbl305:
            // 2 sources

            case 11: {
                var5_3 /* !! */  = (int)hl.cxsz("cyag", cxtb(int ), (int)85);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 12: {
                var5_3 /* !! */  = (int)hl.cxsz("cyah", cxtb(int ), (int)86);
                if (!var6_2) ** GOTO lbl270
                throw null;
            }
            case 13: {
                var5_3 /* !! */  = (int)hl.cxsz("cyai", cxtb(int ), (int)87);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 14: {
                var5_3 /* !! */  = (int)hl.cxsz("cyaj", cxtb(int ), (int)88);
                if (!var6_2) ** GOTO lbl283
                throw null;
            }
            case 15: {
                var5_3 /* !! */  = (int)hl.cxsz("cyak", cxtb(int ), (int)89);
                if (!var6_2) ** GOTO lbl265
                throw null;
            }
            case 16: {
                var5_3 /* !! */  = (int)hl.cxsz("cyal", cxtb(int ), (int)90);
                if (!var6_2) break;
                throw null;
            }
lbl331:
            // 3 sources

            case 17: {
                var5_3 /* !! */  = (int)hl.cxsz("cyam", cxtb(int ), (int)91);
                if (!var6_2) ** GOTO lbl292
                throw null;
            }
lbl335:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hl.cxsz("cyan", cxtb(int ), (int)92);
                    if (!var6_2) ** GOTO lbl305
                    throw null;
                }
            }
lbl340:
            // 3 sources

            case 19: {
                var5_3 /* !! */  = (int)hl.cxsz("cyao", cxtb(int ), (int)93);
                if (!var6_2) ** GOTO lbl287
                throw null;
            }
            case 20: 
        }
        var5_3 /* !! */  = (int)hl.cxsz("cyap", cxtb(int ), (int)94);
        ** while (!var6_2)
lbl347:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getPredictedPosition() {
        v0 /* !! */  = hl.gq;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(hl.cxsz("cygq", cxsw(int ), (int)183) - hl.cxsz("cygp", cxsw(int ), (int)182));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1586018072: {
                    break block28;
                }
                case 1521028365: {
                    continue block28;
                }
            }
            break;
        }
        var3_1 = hl.c;
        v1 /* !! */  = hl.gq;
        if (true) ** GOTO lbl15
        block29: while (true) {
            v1 /* !! */  = (long)(v2 - hl.cxsz("cygr", cxsw(int ), (int)184));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1586018072: {
                    break block29;
                }
                case 285528510: {
                    v2 = hl.cxsz("cygs", cxsw(int ), (int)185);
                    continue block29;
                }
                case 1279538397: {
                    v2 = hl.cxsz("cygt", cxsw(int ), (int)186);
                    continue block29;
                }
                case 1994462634: {
                    v2 = hl.cxsz("cygu", cxsw(int ), (int)187);
                    continue block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = hl.b;
        v3 /* !! */  = hl.gq;
        if (true) ** GOTO lbl32
        block30: while (true) {
            v3 /* !! */  = (long)(v4 - hl.cxsz("cygv", cxsw(int ), (int)188));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1586018072: {
                    break block30;
                }
                case -639006315: {
                    v4 = hl.cxsz("cygw", cxsw(int ), (int)189);
                    continue block30;
                }
                case 388663011: {
                    v4 = hl.cxsz("cygx", cxsw(int ), (int)190);
                    continue block30;
                }
                case 1759112673: {
                    v4 = hl.cxsz("cygy", cxsw(int ), (int)191);
                    continue block30;
                }
            }
            break;
        }
        var1_3 = hl.a;
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
                v5 /* !! */  = hl.gq;
                if (true) ** GOTO lbl57
                block32: while (true) {
                    v5 /* !! */  = (long)(v6 - hl.cxsz("cygz", cxsw(int ), (int)192));
lbl57:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1586018072: {
                            break block32;
                        }
                        case -1258925953: {
                            v6 = hl.cxsz("cyha", cxsw(int ), (int)193);
                            continue block32;
                        }
                        case 1181766664: {
                            v6 = hl.cxsz("cyhb", cxsw(int ), (int)194);
                            continue block32;
                        }
                        case 1943465861: {
                            v6 = hl.cxsz("cyhc", cxsw(int ), (int)195);
                            continue block32;
                        }
                    }
                    break;
                }
                return this.predictedPosition;
            }
lbl70:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)hl.cxsz("cyhd", cxtb(int ), (int)166);
                if (!var3_1) break;
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)hl.cxsz("cyhe", cxtb(int ), (int)167);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)hl.cxsz("cyhf", cxtb(int ), (int)168);
                if (!var3_1) ** GOTO lbl70
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)hl.cxsz("cyhg", cxtb(int ), (int)169);
        ** while (!var3_1)
lbl86:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cyns() {
        hl.cxtc[200] = 1137008512;
        hl.cxtc[201] = -373666166;
        hl.cxtc[202] = 606121488;
        hl.cxtc[203] = 462101626;
        hl.cxtc[204] = -180518506;
        hl.cxtc[205] = 57402621;
        hl.cxtc[206] = 469702550;
        hl.cxtc[207] = -728439102;
        hl.cxtc[208] = -897331807;
        hl.cxtc[209] = 571164164;
        hl.cxtc[210] = 1612940719;
        hl.cxtc[211] = 424978916;
        hl.cxtc[212] = 25685244;
        hl.cxtc[213] = -516175600;
        hl.cxtc[214] = -1055671138;
        hl.cxtc[215] = -837270582;
        hl.cxtc[216] = -1019012904;
        hl.cxtc[217] = -94108126;
        hl.cxtc[218] = 1004872041;
        hl.cxtc[219] = -2087188833;
        hl.cxtc[220] = 286701457;
        hl.cxtc[221] = 1936563540;
        hl.cxtc[222] = 1879626765;
        hl.cxtc[223] = -831067081;
        hl.cxtc[224] = -2040718473;
        hl.cxtc[225] = -619927693;
        hl.cxtc[226] = -669149286;
        hl.cxtc[227] = -644761410;
        hl.cxtc[228] = 1462018286;
        hl.cxtc[229] = 171528146;
        hl.cxtc[230] = -1640228959;
        hl.cxtc[231] = -1038693718;
        hl.cxtc[232] = 2011566160;
        hl.cxtc[233] = 607130307;
        hl.cxtc[234] = 273186173;
        hl.cxtc[235] = 574485028;
        hl.cxtc[236] = -1440994453;
        hl.cxtc[237] = -1275125911;
        hl.cxtc[238] = -1242609202;
        hl.cxtc[239] = -2126458599;
        hl.cxtc[240] = 201151615;
        hl.cxtc[241] = 966798219;
        hl.cxtc[242] = 1315011205;
        hl.cxtc[243] = -446914090;
        hl.cxtc[244] = -256366113;
        hl.cxtc[245] = -673161741;
        hl.cxtc[246] = 1235256985;
        hl.cxtc[247] = 1017632595;
        hl.cxtc[248] = -1154812791;
        hl.cxtc[249] = -832976378;
        hl.cxtc[250] = -81957902;
        hl.cxtc[251] = 803019153;
        hl.cxtc[252] = -592354503;
        hl.cxtc[253] = 2032983421;
        hl.cxtc[254] = -387285016;
        hl.cxtc[255] = -2127793766;
        hl.cxtc[256] = 1916159288;
        hl.cxtc[257] = -1711211876;
        hl.cxtc[258] = 1690923310;
        hl.cxtc[259] = -1727206022;
        hl.cxtc[260] = -98611745;
        hl.cxtc[261] = -1215793457;
        hl.cxtc[262] = 153948013;
        hl.cxtc[263] = 146921309;
        hl.cxtc[264] = 881266770;
        hl.cxtc[265] = -713785770;
        hl.cxtc[266] = -1149768770;
        hl.cxtc[267] = 4654070;
        hl.cxtc[268] = -611811722;
        hl.cxtc[269] = 480856906;
        hl.cxtc[270] = 2014003976;
        hl.cxtc[271] = 1034152047;
        hl.cxtc[272] = 1359125360;
        hl.cxtc[273] = -1956459001;
        hl.cxtc[274] = -629086768;
        hl.cxtc[275] = 832343492;
        hl.cxtc[276] = 1223357437;
        hl.cxtc[277] = -601374345;
        hl.cxtc[278] = 1334933324;
        hl.cxtc[279] = 746373343;
        hl.cxtc[280] = -476226749;
    }

    public static /* synthetic */ CallSite cxsz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void cynv() {
        hl.cxtd[200] = 1137008557;
        hl.cxtd[201] = -373666155;
        hl.cxtd[202] = 606121529;
        hl.cxtd[203] = 462101600;
        hl.cxtd[204] = -180518498;
        hl.cxtd[205] = 57402583;
        hl.cxtd[206] = 469702577;
        hl.cxtd[207] = -728439063;
        hl.cxtd[208] = -897331792;
        hl.cxtd[209] = 571164175;
        hl.cxtd[210] = 1612940683;
        hl.cxtd[211] = 424978914;
        hl.cxtd[212] = 25685218;
        hl.cxtd[213] = -516175562;
        hl.cxtd[214] = -1055671150;
        hl.cxtd[215] = -837270584;
        hl.cxtd[216] = -1019012918;
        hl.cxtd[217] = -94108156;
        hl.cxtd[218] = 1004872040;
        hl.cxtd[219] = 1223003721;
        hl.cxtd[220] = -286701458;
        hl.cxtd[221] = 548037662;
        hl.cxtd[222] = 1879626764;
        hl.cxtd[223] = 838751840;
        hl.cxtd[224] = 2040718472;
        hl.cxtd[225] = -113891649;
        hl.cxtd[226] = -669149285;
        hl.cxtd[227] = 413504083;
        hl.cxtd[228] = -1462018287;
        hl.cxtd[229] = -890317064;
        hl.cxtd[230] = -1640228960;
        hl.cxtd[231] = 1673056588;
        hl.cxtd[232] = 2011566149;
        hl.cxtd[233] = 607130321;
        hl.cxtd[234] = 273186166;
        hl.cxtd[235] = 574485044;
        hl.cxtd[236] = -1440994464;
        hl.cxtd[237] = -1275125908;
        hl.cxtd[238] = -1242609206;
        hl.cxtd[239] = -2126458622;
        hl.cxtd[240] = 201151609;
        hl.cxtd[241] = 966798211;
        hl.cxtd[242] = 1315011205;
        hl.cxtd[243] = -446914100;
        hl.cxtd[244] = -256366114;
        hl.cxtd[245] = -673161757;
        hl.cxtd[246] = 1235256974;
        hl.cxtd[247] = 1017632593;
        hl.cxtd[248] = -1154812796;
        hl.cxtd[249] = -832976368;
        hl.cxtd[250] = -81957915;
        hl.cxtd[251] = 803019153;
        hl.cxtd[252] = -592354501;
        hl.cxtd[253] = 2032983399;
        hl.cxtd[254] = -387285000;
        hl.cxtd[255] = -2127793774;
        hl.cxtd[256] = 1916159267;
        hl.cxtd[257] = -1711211898;
        hl.cxtd[258] = 1690923316;
        hl.cxtd[259] = -1727206047;
        hl.cxtd[260] = -98611746;
        hl.cxtd[261] = -1196031914;
        hl.cxtd[262] = 153948012;
        hl.cxtd[263] = 413170417;
        hl.cxtd[264] = 881266771;
        hl.cxtd[265] = 713785769;
        hl.cxtd[266] = 825623828;
        hl.cxtd[267] = 4654071;
        hl.cxtd[268] = 1518209314;
        hl.cxtd[269] = 480856930;
        hl.cxtd[270] = 2014003977;
        hl.cxtd[271] = 1034152047;
        hl.cxtd[272] = 1359125367;
        hl.cxtd[273] = -1956459004;
        hl.cxtd[274] = -629086765;
        hl.cxtd[275] = 832343494;
        hl.cxtd[276] = 1223357438;
        hl.cxtd[277] = -601374350;
        hl.cxtd[278] = 1334933320;
        hl.cxtd[279] = 746373340;
        hl.cxtd[280] = -476226749;
    }

    static {
        cxtc = new int[281];
        cxtd = new int[281];
        hl.cynq();
        hl.cynr();
        hl.cyns();
        hl.cynt();
        hl.cynu();
        hl.cynv();
        cxsx = new long[250];
        cxsy = new long[250];
        hl.cynw();
        hl.cynx();
        hl.cyny();
        hl.cynz();
        hl.cyoa();
        hl.cyob();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isLeaving(class_1309 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cymp", cxsw(int ), (int)244)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == hl.cxsz("cymq", cxtb(int ), (int)260)) break;
            v0 /* !! */  = (long)hl.cxsz("cymr", cxtb(int ), (int)261);
        }
        var4_2 = hl.c;
        v1 /* !! */  = hl.gq;
        if (true) ** GOTO lbl12
        block16: while (true) {
            v1 /* !! */  = (long)(hl.cxsz("cymt", cxsw(int ), (int)246) - hl.cxsz("cyms", cxsw(int ), (int)245));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1586018072: {
                    break block16;
                }
                case 1372667057: {
                    continue block16;
                }
            }
            break;
        }
        var3_3 /* !! */  = hl.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = hl.gq - hl.cxsz("cymu", cxsw(int ), (int)247)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == hl.cxsz("cymv", cxtb(int ), (int)262)) break;
            v2 /* !! */  = (long)hl.cxsz("cymw", cxtb(int ), (int)263);
        }
        var2_4 = hl.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl30:
                    // 4 sources

                    return (boolean)hl.cxsz("cymx", cxtb(int ), (int)264);
                }
                if (var2_4 || var2_4) ** GOTO lbl30
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = hl.gq - hl.cxsz("cymy", cxsw(int ), (int)248)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == hl.cxsz("cymz", cxtb(int ), (int)265)) break;
                    v3 /* !! */  = (long)hl.cxsz("cyna", cxtb(int ), (int)266);
                }
                if (!var1_1.method_6128()) ** GOTO lbl54
                if (var2_4) ** GOTO lbl30
                v4 = (ay)var1_1;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = hl.gq - hl.cxsz("cynb", cxsw(int ), (int)249)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hl.cxsz("cync", cxtb(int ), (int)267)) break;
                    v5 /* !! */  = (long)hl.cxsz("cynd", cxtb(int ), (int)268);
                }
                if (v4.phobia$getTicksSinceLastAttack() <= hl.cxsz("cyne", cxtb(int ), (int)269)) ** GOTO lbl54
                if (var2_4) ** GOTO lbl30
                v6 = hl.cxsz("cynf", cxtb(int ), (int)270);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl57
lbl54:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v6 = hl.cxsz("cyng", cxtb(int ), (int)271);
lbl57:
                // 2 sources

                return (boolean)v6;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)hl.cxsz("cynh", cxtb(int ), (int)272);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)hl.cxsz("cyni", cxtb(int ), (int)273);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl78
            }
lbl68:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)hl.cxsz("cynj", cxtb(int ), (int)274);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl86
            }
lbl73:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)hl.cxsz("cynk", cxtb(int ), (int)275);
                } while (!var4_2);
                throw null;
            }
lbl78:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)hl.cxsz("cynl", cxtb(int ), (int)276);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)hl.cxsz("cynm", cxtb(int ), (int)277);
                if (!var4_2) ** GOTO lbl78
                throw null;
            }
lbl86:
            // 2 sources

            case 6: {
                do {
                    var3_3 /* !! */  = (int)hl.cxsz("cynn", cxtb(int ), (int)278);
                } while (!var4_2);
                throw null;
            }
            case 7: {
                var3_3 /* !! */  = (int)hl.cxsz("cyno", cxtb(int ), (int)279);
                if (!var4_2) ** GOTO lbl73
                throw null;
            }
            case 8: 
        }
        var3_3 /* !! */  = (int)hl.cxsz("cynp", cxtb(int ), (int)280);
        ** while (!var4_2)
lbl98:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cynt() {
        hl.cxtd[0] = -1644340783;
        hl.cxtd[1] = -1523447067;
        hl.cxtd[2] = -566983682;
        hl.cxtd[3] = -1757255437;
        hl.cxtd[4] = 652658646;
        hl.cxtd[5] = -1451620790;
        hl.cxtd[6] = -476157743;
        hl.cxtd[7] = -201614078;
        hl.cxtd[8] = -1194104633;
        hl.cxtd[9] = -1599338871;
        hl.cxtd[10] = -1281315482;
        hl.cxtd[11] = 1517595346;
        hl.cxtd[12] = 1914071386;
        hl.cxtd[13] = 565708363;
        hl.cxtd[14] = 569293354;
        hl.cxtd[15] = 674525785;
        hl.cxtd[16] = -294041176;
        hl.cxtd[17] = 152628071;
        hl.cxtd[18] = 135959264;
        hl.cxtd[19] = 367208459;
        hl.cxtd[20] = -425935387;
        hl.cxtd[21] = -1101379889;
        hl.cxtd[22] = 792439545;
        hl.cxtd[23] = 730215585;
        hl.cxtd[24] = 959515862;
        hl.cxtd[25] = 1894040564;
        hl.cxtd[26] = 1195256616;
        hl.cxtd[27] = -1036792549;
        hl.cxtd[28] = -1699651200;
        hl.cxtd[29] = -1825650093;
        hl.cxtd[30] = 2033816314;
        hl.cxtd[31] = 1592668249;
        hl.cxtd[32] = 700453423;
        hl.cxtd[33] = -449529456;
        hl.cxtd[34] = -2091888119;
        hl.cxtd[35] = -627146817;
        hl.cxtd[36] = 1775415688;
        hl.cxtd[37] = 1662327925;
        hl.cxtd[38] = 1216313080;
        hl.cxtd[39] = 1487353028;
        hl.cxtd[40] = 1955943456;
        hl.cxtd[41] = -395451989;
        hl.cxtd[42] = 227107493;
        hl.cxtd[43] = 241609339;
        hl.cxtd[44] = 1869129590;
        hl.cxtd[45] = 398180045;
        hl.cxtd[46] = 1244904297;
        hl.cxtd[47] = -40337659;
        hl.cxtd[48] = 1201074919;
        hl.cxtd[49] = 1875658010;
        hl.cxtd[50] = -590137261;
        hl.cxtd[51] = -1964441279;
        hl.cxtd[52] = 2002403256;
        hl.cxtd[53] = -1836300954;
        hl.cxtd[54] = -28279798;
        hl.cxtd[55] = -389833963;
        hl.cxtd[56] = 2075872390;
        hl.cxtd[57] = -2064987207;
        hl.cxtd[58] = 878923764;
        hl.cxtd[59] = -328857253;
        hl.cxtd[60] = -1559643103;
        hl.cxtd[61] = -512354013;
        hl.cxtd[62] = -2085522060;
        hl.cxtd[63] = -851265881;
        hl.cxtd[64] = 266578628;
        hl.cxtd[65] = 1527431242;
        hl.cxtd[66] = -52490554;
        hl.cxtd[67] = -864003552;
        hl.cxtd[68] = -1667941610;
        hl.cxtd[69] = -1921019801;
        hl.cxtd[70] = -590187332;
        hl.cxtd[71] = 1850044559;
        hl.cxtd[72] = 203899583;
        hl.cxtd[73] = 1616552003;
        hl.cxtd[74] = 206626986;
        hl.cxtd[75] = -1444984891;
        hl.cxtd[76] = 739428350;
        hl.cxtd[77] = -1663665536;
        hl.cxtd[78] = 318883432;
        hl.cxtd[79] = -884102614;
        hl.cxtd[80] = 1321468091;
        hl.cxtd[81] = 466043674;
        hl.cxtd[82] = 769889664;
        hl.cxtd[83] = -1689512239;
        hl.cxtd[84] = 1316254318;
        hl.cxtd[85] = 1097431542;
        hl.cxtd[86] = -1837362968;
        hl.cxtd[87] = -1514953916;
        hl.cxtd[88] = -1597625447;
        hl.cxtd[89] = 443532293;
        hl.cxtd[90] = -133710629;
        hl.cxtd[91] = 1546184455;
        hl.cxtd[92] = 1037382819;
        hl.cxtd[93] = 45150511;
        hl.cxtd[94] = -1387944466;
        hl.cxtd[95] = 1273198979;
        hl.cxtd[96] = 1279255325;
        hl.cxtd[97] = -846251869;
        hl.cxtd[98] = 596833851;
        hl.cxtd[99] = 1049887348;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_238 getAimBox(class_1309 var1_1) {
        v0 /* !! */  = hl.gq;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - hl.cxsz("cyeu", cxsw(int ), (int)155));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2036230279: {
                    v1 = hl.cxsz("cyev", cxsw(int ), (int)156);
                    continue block36;
                }
                case -1586018072: {
                    break block36;
                }
                case -1259061420: {
                    v1 = hl.cxsz("cyew", cxsw(int ), (int)157);
                    continue block36;
                }
                case 156030283: {
                    v1 = hl.cxsz("cyex", cxsw(int ), (int)158);
                    continue block36;
                }
            }
            break;
        }
        var6_2 = hl.c;
        v2 /* !! */  = hl.gq;
        if (true) ** GOTO lbl22
        block37: while (true) {
            v2 /* !! */  = (long)(hl.cxsz("cyez", cxsw(int ), (int)160) - hl.cxsz("cyey", cxsw(int ), (int)159));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1586018072: {
                    break block37;
                }
                case 1182134356: {
                    continue block37;
                }
            }
            break;
        }
        var5_3 /* !! */  = hl.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cyfa", cxsw(int ), (int)161)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == hl.cxsz("cyfb", cxtb(int ), (int)146)) break;
            v3 /* !! */  = (long)hl.cxsz("cyfc", cxtb(int ), (int)147);
        }
        var4_4 = hl.a;
        if (var6_2) {
            throw null;
lbl36:
            // 4 sources

            return null;
        }
        if (var4_4 || var4_4) ** GOTO lbl36
        v4 /* !! */  = hl.gq;
        if (true) ** GOTO lbl43
        block40: while (true) {
            v4 /* !! */  = (long)(v5 - hl.cxsz("cyfd", cxsw(int ), (int)162));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1586018072: {
                    break block40;
                }
                case -587890915: {
                    v5 = hl.cxsz("cyfe", cxsw(int ), (int)163);
                    continue block40;
                }
                case 1753119064: {
                    v5 = hl.cxsz("cyff", cxsw(int ), (int)164);
                    continue block40;
                }
            }
            break;
        }
        var2_5 = this.getAimPosition(var1_1);
        if (var4_4) ** GOTO lbl36
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl36
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = hl.gq - hl.cxsz("cyfg", cxsw(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == hl.cxsz("cyfh", cxtb(int ), (int)148)) break;
                    v6 /* !! */  = (long)hl.cxsz("cyfi", cxtb(int ), (int)149);
                }
                v7 = var1_1.method_73189();
                v8 /* !! */  = hl.gq;
                if (true) ** GOTO lbl68
                block42: while (true) {
                    v8 /* !! */  = (long)(v9 - hl.cxsz("cyfj", cxsw(int ), (int)166));
lbl68:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1596713044: {
                            v9 = hl.cxsz("cyfk", cxsw(int ), (int)167);
                            continue block42;
                        }
                        case -1586018072: {
                            break block42;
                        }
                        case -1179982900: {
                            v9 = hl.cxsz("cyfl", cxsw(int ), (int)168);
                            continue block42;
                        }
                        case -892282962: {
                            v9 = hl.cxsz("cyfm", cxsw(int ), (int)169);
                            continue block42;
                        }
                    }
                    break;
                }
                var3_6 = var2_5.method_1020(v7);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = hl.gq - hl.cxsz("cyfn", cxsw(int ), (int)170)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == hl.cxsz("cyfo", cxtb(int ), (int)150)) break;
                    v10 /* !! */  = (long)hl.cxsz("cyfp", cxtb(int ), (int)151);
                }
                v11 = var1_1.method_5829();
                v12 /* !! */  = hl.gq;
                if (true) ** GOTO lbl93
                block44: while (true) {
                    v12 /* !! */  = (long)(v13 - hl.cxsz("cyfq", cxsw(int ), (int)171));
lbl93:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1586018072: {
                            break block44;
                        }
                        case -715947490: {
                            v13 = hl.cxsz("cyfr", cxsw(int ), (int)172);
                            continue block44;
                        }
                        case 719867401: {
                            v13 = hl.cxsz("cyfs", cxsw(int ), (int)173);
                            continue block44;
                        }
                    }
                    break;
                }
                return v11.method_997(var3_6);
            }
lbl103:
            // 4 sources

            case 0: {
                var5_3 /* !! */  = (int)hl.cxsz("cyft", cxtb(int ), (int)152);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl108:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)hl.cxsz("cyfu", cxtb(int ), (int)153);
                    if (!var6_2) ** GOTO lbl103
                    throw null;
                }
            }
            case 2: {
                var5_3 /* !! */  = (int)hl.cxsz("cyfv", cxtb(int ), (int)154);
                if (!var6_2) ** GOTO lbl108
                throw null;
            }
lbl117:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)hl.cxsz("cyfw", cxtb(int ), (int)155);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 4: {
                var5_3 /* !! */  = (int)hl.cxsz("cyfx", cxtb(int ), (int)156);
                if (!var6_2) ** GOTO lbl103
                throw null;
            }
lbl126:
            // 2 sources

            case 5: {
                var5_3 /* !! */  = (int)hl.cxsz("cyfy", cxtb(int ), (int)157);
                if (!var6_2) ** GOTO lbl103
                throw null;
            }
            case 6: {
                do {
                    var5_3 /* !! */  = (int)hl.cxsz("cyfz", cxtb(int ), (int)158);
                } while (!var6_2);
                throw null;
            }
            case 7: 
        }
        var5_3 /* !! */  = (int)hl.cxsz("cyga", cxtb(int ), (int)159);
        ** while (!var6_2)
lbl138:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cynq() {
        hl.cxtc[0] = -1644340784;
        hl.cxtc[1] = -2146743296;
        hl.cxtc[2] = 566983681;
        hl.cxtc[3] = 2087457470;
        hl.cxtc[4] = 652658647;
        hl.cxtc[5] = -1451620789;
        hl.cxtc[6] = -476157743;
        hl.cxtc[7] = -201614079;
        hl.cxtc[8] = -115119929;
        hl.cxtc[9] = -519305591;
        hl.cxtc[10] = -244798106;
        hl.cxtc[11] = 450144978;
        hl.cxtc[12] = 1914071387;
        hl.cxtc[13] = 1635255883;
        hl.cxtc[14] = 518961706;
        hl.cxtc[15] = 674525784;
        hl.cxtc[16] = -792036709;
        hl.cxtc[17] = 877930410;
        hl.cxtc[18] = 135959273;
        hl.cxtc[19] = 367208461;
        hl.cxtc[20] = -425935379;
        hl.cxtc[21] = -1101379897;
        hl.cxtc[22] = 792439537;
        hl.cxtc[23] = 730215584;
        hl.cxtc[24] = 959515860;
        hl.cxtc[25] = 1894040573;
        hl.cxtc[26] = 1195256609;
        hl.cxtc[27] = -1036792547;
        hl.cxtc[28] = -1699651196;
        hl.cxtc[29] = -1825650094;
        hl.cxtc[30] = -1998616099;
        hl.cxtc[31] = 1592668248;
        hl.cxtc[32] = 1148987638;
        hl.cxtc[33] = 449529455;
        hl.cxtc[34] = -1165272466;
        hl.cxtc[35] = -627146818;
        hl.cxtc[36] = -1084444050;
        hl.cxtc[37] = 1662327924;
        hl.cxtc[38] = -1439267416;
        hl.cxtc[39] = -1487353029;
        hl.cxtc[40] = -1433142904;
        hl.cxtc[41] = -395451973;
        hl.cxtc[42] = 227107511;
        hl.cxtc[43] = 241609339;
        hl.cxtc[44] = 1869129596;
        hl.cxtc[45] = 398180045;
        hl.cxtc[46] = 1244904289;
        hl.cxtc[47] = -40337663;
        hl.cxtc[48] = 1201074925;
        hl.cxtc[49] = 1875658011;
        hl.cxtc[50] = -590137263;
        hl.cxtc[51] = -1964441261;
        hl.cxtc[52] = 2002403262;
        hl.cxtc[53] = -1836300959;
        hl.cxtc[54] = -28279795;
        hl.cxtc[55] = -389833961;
        hl.cxtc[56] = 2075872390;
        hl.cxtc[57] = -2064987215;
        hl.cxtc[58] = 878923766;
        hl.cxtc[59] = -328857263;
        hl.cxtc[60] = 1559643102;
        hl.cxtc[61] = 1534123573;
        hl.cxtc[62] = 2085522059;
        hl.cxtc[63] = -873458307;
        hl.cxtc[64] = 266578629;
        hl.cxtc[65] = -1766755396;
        hl.cxtc[66] = 52490553;
        hl.cxtc[67] = 772535722;
        hl.cxtc[68] = -1667941609;
        hl.cxtc[69] = -383120191;
        hl.cxtc[70] = -590187331;
        hl.cxtc[71] = -253567079;
        hl.cxtc[72] = -203899584;
        hl.cxtc[73] = -1878677587;
        hl.cxtc[74] = 206627000;
        hl.cxtc[75] = -1444984890;
        hl.cxtc[76] = 739428344;
        hl.cxtc[77] = -1663665528;
        hl.cxtc[78] = 318883435;
        hl.cxtc[79] = -884102623;
        hl.cxtc[80] = 1321468089;
        hl.cxtc[81] = 466043678;
        hl.cxtc[82] = 769889666;
        hl.cxtc[83] = -1689512234;
        hl.cxtc[84] = 1316254309;
        hl.cxtc[85] = 1097431548;
        hl.cxtc[86] = -1837362972;
        hl.cxtc[87] = -1514953910;
        hl.cxtc[88] = -1597625449;
        hl.cxtc[89] = 443532301;
        hl.cxtc[90] = -133710648;
        hl.cxtc[91] = 1546184463;
        hl.cxtc[92] = 1037382817;
        hl.cxtc[93] = 45150510;
        hl.cxtc[94] = -1387944477;
        hl.cxtc[95] = 1273198978;
        hl.cxtc[96] = 1279255324;
        hl.cxtc[97] = -476193317;
        hl.cxtc[98] = -596833852;
        hl.cxtc[99] = 1631986394;
    }

    private static /* synthetic */ void cynz() {
        hl.cxsy[0] = -8566903022445832292L;
        hl.cxsy[1] = -3937511868437532871L;
        hl.cxsy[2] = -8795105364174596292L;
        hl.cxsy[3] = -9180874892429550978L;
        hl.cxsy[4] = 4486710568898109430L;
        hl.cxsy[5] = 3395354612370884572L;
        hl.cxsy[6] = 2771748734737864624L;
        hl.cxsy[7] = -3473371155899364950L;
        hl.cxsy[8] = -6910867737385862090L;
        hl.cxsy[9] = 4835044145453466657L;
        hl.cxsy[10] = 2325640556244249362L;
        hl.cxsy[11] = 6890908771480809059L;
        hl.cxsy[12] = 1601812293656803883L;
        hl.cxsy[13] = 8157522516848766671L;
        hl.cxsy[14] = -482807861888535550L;
        hl.cxsy[15] = -5703653023032160385L;
        hl.cxsy[16] = 8344030214964851735L;
        hl.cxsy[17] = 1335809807223116402L;
        hl.cxsy[18] = -9011345541031746827L;
        hl.cxsy[19] = -6586546897454416619L;
        hl.cxsy[20] = -6132166226293854809L;
        hl.cxsy[21] = 1761172897068207216L;
        hl.cxsy[22] = -9000404158367044451L;
        hl.cxsy[23] = -2388800690844357180L;
        hl.cxsy[24] = 2206351350941532703L;
        hl.cxsy[25] = 4714441288855011357L;
        hl.cxsy[26] = 7113494175197976704L;
        hl.cxsy[27] = 444381267087941539L;
        hl.cxsy[28] = 6962162536954695572L;
        hl.cxsy[29] = -7838506887490908834L;
        hl.cxsy[30] = 2422894095909710112L;
        hl.cxsy[31] = -3364156125051754994L;
        hl.cxsy[32] = -2597899953993864081L;
        hl.cxsy[33] = 3646732045573459753L;
        hl.cxsy[34] = -8159830604687924479L;
        hl.cxsy[35] = 5173226854225218620L;
        hl.cxsy[36] = -7015719860019159332L;
        hl.cxsy[37] = 7070716316138021127L;
        hl.cxsy[38] = -2011933147766039979L;
        hl.cxsy[39] = -4647438661548544610L;
        hl.cxsy[40] = 4033726176692959677L;
        hl.cxsy[41] = 8896221902682487509L;
        hl.cxsy[42] = -5158080199956875771L;
        hl.cxsy[43] = 7648540750439922483L;
        hl.cxsy[44] = 7183621155754330304L;
        hl.cxsy[45] = 4414276753728893097L;
        hl.cxsy[46] = 467343299338541862L;
        hl.cxsy[47] = 7707124460732560979L;
        hl.cxsy[48] = 5585880718375842940L;
        hl.cxsy[49] = 1607722461581883631L;
        hl.cxsy[50] = 745349239878119255L;
        hl.cxsy[51] = -7212264886133829556L;
        hl.cxsy[52] = 9112587018923671654L;
        hl.cxsy[53] = 8272048099596462568L;
        hl.cxsy[54] = 8203851001864897550L;
        hl.cxsy[55] = 6174375061363695528L;
        hl.cxsy[56] = -9155218476527367661L;
        hl.cxsy[57] = -3077911443132682603L;
        hl.cxsy[58] = -4259241856290590501L;
        hl.cxsy[59] = -5217497378077413579L;
        hl.cxsy[60] = -5260775279149721694L;
        hl.cxsy[61] = -4803747752034881053L;
        hl.cxsy[62] = -2735484679336152840L;
        hl.cxsy[63] = -442684377877632854L;
        hl.cxsy[64] = -7689124875077732339L;
        hl.cxsy[65] = -8153765295926056917L;
        hl.cxsy[66] = 3740604512957871662L;
        hl.cxsy[67] = 1096855399747424963L;
        hl.cxsy[68] = 8746517933476535439L;
        hl.cxsy[69] = 3848307348517671404L;
        hl.cxsy[70] = -7253390445255100854L;
        hl.cxsy[71] = 7770062500862067171L;
        hl.cxsy[72] = 1903328514546103179L;
        hl.cxsy[73] = -2545270390213040226L;
        hl.cxsy[74] = 6593907239931504785L;
        hl.cxsy[75] = -4583887364651451239L;
        hl.cxsy[76] = -5310430985724449328L;
        hl.cxsy[77] = -5190226291270201987L;
        hl.cxsy[78] = -8743433843771836427L;
        hl.cxsy[79] = -7418819224900993557L;
        hl.cxsy[80] = -8469601520455195034L;
        hl.cxsy[81] = 7731526859162277058L;
        hl.cxsy[82] = -8235906690637410209L;
        hl.cxsy[83] = -3300913172357937176L;
        hl.cxsy[84] = -4586915829207220130L;
        hl.cxsy[85] = -706657915415379519L;
        hl.cxsy[86] = -1038383148104948564L;
        hl.cxsy[87] = -4906199513950362251L;
        hl.cxsy[88] = 2309640681892650032L;
        hl.cxsy[89] = 5891076471100222182L;
        hl.cxsy[90] = -8346998093389407575L;
        hl.cxsy[91] = -290838096978659159L;
        hl.cxsy[92] = 6953985702523354065L;
        hl.cxsy[93] = -4563365346532513329L;
        hl.cxsy[94] = -2638390253703692741L;
        hl.cxsy[95] = 681565719294522368L;
        hl.cxsy[96] = 5619266117019013332L;
        hl.cxsy[97] = -7296095655661887672L;
        hl.cxsy[98] = 5848969877294087954L;
        hl.cxsy[99] = -7102443286122461855L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldUseFor(class_1309 var1_1) {
        block147: {
            block146: {
                v0 /* !! */  = hl.gq;
                if (true) ** GOTO lbl5
                block100: while (true) {
                    v0 /* !! */  = (long)(v1 - hl.cxsz("cyaq", cxsw(int ), (int)98));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1586018072: {
                            break block100;
                        }
                        case -1211186233: {
                            v1 = hl.cxsz("cyar", cxsw(int ), (int)99);
                            continue block100;
                        }
                        case 1310237425: {
                            v1 = hl.cxsz("cyas", cxsw(int ), (int)100);
                            continue block100;
                        }
                    }
                    break;
                }
                var4_2 = hl.c;
                v2 /* !! */  = hl.gq;
                if (true) ** GOTO lbl19
                block101: while (true) {
                    v2 /* !! */  = (long)(hl.cxsz("cyau", cxsw(int ), (int)102) - hl.cxsz("cyat", cxsw(int ), (int)101));
lbl19:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -2061420739: {
                            continue block101;
                        }
                        case -1586018072: {
                            break block101;
                        }
                    }
                    break;
                }
                var3_3 /* !! */  = hl.b;
                v3 /* !! */  = hl.gq;
                if (true) ** GOTO lbl29
                block102: while (true) {
                    v3 /* !! */  = (long)(v4 - hl.cxsz("cyav", cxsw(int ), (int)103));
lbl29:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1871462857: {
                            v4 = hl.cxsz("cyaw", cxsw(int ), (int)104);
                            continue block102;
                        }
                        case -1586018072: {
                            break block102;
                        }
                        case 146438062: {
                            v4 = hl.cxsz("cyax", cxsw(int ), (int)105);
                            continue block102;
                        }
                    }
                    break;
                }
                var2_4 = hl.a;
                if (var4_2) {
                    throw null;
lbl41:
                    // 17 sources

                    return (boolean)hl.cxsz("cyay", cxtb(int ), (int)95);
                }
                if (var2_4 || var2_4) ** GOTO lbl41
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = hl.gq - hl.cxsz("cyaz", cxsw(int ), (int)106)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == hl.cxsz("cyba", cxtb(int ), (int)96)) break;
                    v5 /* !! */  = (long)hl.cxsz("cybb", cxtb(int ), (int)97);
                }
                if (!this.isState()) break block146;
                if (var2_4) ** GOTO lbl41
                v6 /* !! */  = hl.gq;
                if (true) ** GOTO lbl56
                block105: while (true) {
                    v6 /* !! */  = (long)(v7 - hl.cxsz("cybc", cxsw(int ), (int)107));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1616002497: {
                            v7 = hl.cxsz("cybd", cxsw(int ), (int)108);
                            continue block105;
                        }
                        case -1586018072: {
                            break block105;
                        }
                        case 1294782731: {
                            v7 = hl.cxsz("cybe", cxsw(int ), (int)109);
                            continue block105;
                        }
                        case 2142370142: {
                            v7 = hl.cxsz("cybf", cxsw(int ), (int)110);
                            continue block105;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = hl.gq - hl.cxsz("cybg", cxsw(int ), (int)111)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == hl.cxsz("cybh", cxtb(int ), (int)98)) break;
                    v8 /* !! */  = (long)hl.cxsz("cybi", cxtb(int ), (int)99);
                }
                if (hl.mc.field_1724 == null) break block146;
                if (var2_4) ** GOTO lbl41
                if (var1_1 == null) break block146;
                if (var2_4) ** GOTO lbl41
                v9 /* !! */  = hl.gq;
                if (true) ** GOTO lbl82
                block107: while (true) {
                    v9 /* !! */  = (long)(hl.cxsz("cybk", cxsw(int ), (int)113) - hl.cxsz("cybj", cxsw(int ), (int)112));
lbl82:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1911461878: {
                            continue block107;
                        }
                        case -1586018072: {
                            break block107;
                        }
                    }
                    break;
                }
                v10 /* !! */  = hl.gq;
                if (true) ** GOTO lbl91
                block108: while (true) {
                    v10 /* !! */  = (long)(v11 - hl.cxsz("cybl", cxsw(int ), (int)114));
lbl91:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1586018072: {
                            break block108;
                        }
                        case 1167285969: {
                            v11 = hl.cxsz("cybm", cxsw(int ), (int)115);
                            continue block108;
                        }
                        case 1299906407: {
                            v11 = hl.cxsz("cybn", cxsw(int ), (int)116);
                            continue block108;
                        }
                    }
                    break;
                }
                v12 = hl.mc.field_1724;
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = hl.gq - hl.cxsz("cybo", cxsw(int ), (int)117)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v13 /* !! */  == hl.cxsz("cybp", cxtb(int ), (int)100)) break;
                    v13 /* !! */  = (long)hl.cxsz("cybq", cxtb(int ), (int)101);
                }
                if (v12.method_6128()) break block147;
                if (var2_4) ** GOTO lbl41
            }
            if (var2_4 || var2_4) ** GOTO lbl41
            return (boolean)hl.cxsz("cybr", cxtb(int ), (int)102);
        }
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl41
                if (!(var1_1 instanceof class_1657)) ** GOTO lbl131
                if (var2_4) ** GOTO lbl41
                v14 /* !! */  = hl.gq;
                if (true) ** GOTO lbl124
                block110: while (true) {
                    v14 /* !! */  = (long)(hl.cxsz("cybt", cxsw(int ), (int)119) - hl.cxsz("cybs", cxsw(int ), (int)118));
lbl124:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1892898944: {
                            continue block110;
                        }
                        case -1586018072: {
                            break block110;
                        }
                    }
                    break;
                }
                if (var1_1.method_5805()) ** GOTO lbl133
                if (var2_4) ** GOTO lbl41
lbl131:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl41
                return (boolean)hl.cxsz("cybu", cxtb(int ), (int)103);
lbl133:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl41
                v15 /* !! */  = hl.gq;
                if (true) ** GOTO lbl138
                block111: while (true) {
                    v15 /* !! */  = (long)(v16 - hl.cxsz("cybv", cxsw(int ), (int)120));
lbl138:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1586018072: {
                            break block111;
                        }
                        case -1062372591: {
                            v16 = hl.cxsz("cybw", cxsw(int ), (int)121);
                            continue block111;
                        }
                        case -985102925: {
                            v16 = hl.cxsz("cybx", cxsw(int ), (int)122);
                            continue block111;
                        }
                    }
                    break;
                }
                v17 /* !! */  = hl.gq;
                if (true) ** GOTO lbl151
                block112: while (true) {
                    v17 /* !! */  = (long)(v18 - hl.cxsz("cyby", cxsw(int ), (int)123));
lbl151:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1586018072: {
                            break block112;
                        }
                        case -1523194764: {
                            v18 = hl.cxsz("cybz", cxsw(int ), (int)124);
                            continue block112;
                        }
                        case 1053104881: {
                            v18 = hl.cxsz("cyca", cxsw(int ), (int)125);
                            continue block112;
                        }
                        case 1492733273: {
                            v18 = hl.cxsz("cycb", cxsw(int ), (int)126);
                            continue block112;
                        }
                    }
                    break;
                }
                if (!this.targetMustFly.isValue()) ** GOTO lbl177
                if (var2_4) ** GOTO lbl41
                v19 /* !! */  = hl.gq;
                if (true) ** GOTO lbl169
                block113: while (true) {
                    v19 /* !! */  = (long)(hl.cxsz("cycd", cxsw(int ), (int)128) - hl.cxsz("cycc", cxsw(int ), (int)127));
lbl169:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -1586018072: {
                            break block113;
                        }
                        case -2591658: {
                            continue block113;
                        }
                    }
                    break;
                }
                if (var1_1.method_6128()) ** GOTO lbl177
                if (var2_4) ** GOTO lbl41
                return (boolean)hl.cxsz("cyce", cxtb(int ), (int)104);
lbl177:
                // 2 sources

                if (var2_4 || var2_4) ** GOTO lbl41
                v20 /* !! */  = hl.gq;
                if (true) ** GOTO lbl182
                block114: while (true) {
                    v20 /* !! */  = (long)(v21 - hl.cxsz("cycf", cxsw(int ), (int)129));
lbl182:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1586018072: {
                            break block114;
                        }
                        case -723363634: {
                            v21 = hl.cxsz("cycg", cxsw(int ), (int)130);
                            continue block114;
                        }
                        case -165484189: {
                            v21 = hl.cxsz("cych", cxsw(int ), (int)131);
                            continue block114;
                        }
                        case 384122168: {
                            v21 = hl.cxsz("cyci", cxsw(int ), (int)132);
                            continue block114;
                        }
                    }
                    break;
                }
                v22 /* !! */  = hl.gq;
                if (true) ** GOTO lbl198
                block115: while (true) {
                    v22 /* !! */  = (long)(hl.cxsz("cyck", cxsw(int ), (int)134) - hl.cxsz("cycj", cxsw(int ), (int)133));
lbl198:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1586018072: {
                            break block115;
                        }
                        case -373670554: {
                            continue block115;
                        }
                    }
                    break;
                }
                v23 = hl.mc.field_1724;
                v24 /* !! */  = hl.gq;
                if (true) ** GOTO lbl208
                block116: while (true) {
                    v24 /* !! */  = (long)(hl.cxsz("cycm", cxsw(int ), (int)136) - hl.cxsz("cycl", cxsw(int ), (int)135));
lbl208:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1586018072: {
                            break block116;
                        }
                        case -309643443: {
                            continue block116;
                        }
                    }
                    break;
                }
                v25 = v23.method_5739((class_1297)var1_1);
                v26 /* !! */  = hl.gq;
                if (true) ** GOTO lbl218
                block117: while (true) {
                    v26 /* !! */  = (long)(hl.cxsz("cyco", cxsw(int ), (int)138) - hl.cxsz("cycn", cxsw(int ), (int)137));
lbl218:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1586018072: {
                            break block117;
                        }
                        case -853659456: {
                            continue block117;
                        }
                    }
                    break;
                }
                v27 /* !! */  = hl.gq;
                if (true) ** GOTO lbl227
                block118: while (true) {
                    v27 /* !! */  = (long)(v28 - hl.cxsz("cycp", cxsw(int ), (int)139));
lbl227:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1688535705: {
                            v28 = hl.cxsz("cycq", cxsw(int ), (int)140);
                            continue block118;
                        }
                        case -1586018072: {
                            break block118;
                        }
                        case 1776369426: {
                            v28 = hl.cxsz("cycr", cxsw(int ), (int)141);
                            continue block118;
                        }
                    }
                    break;
                }
                if (!(v25 <= this.elytraFindRange.getValue())) ** GOTO lbl242
                if (var2_4) ** GOTO lbl41
                v29 = hl.cxsz("cycs", cxtb(int ), (int)105);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl245
lbl242:
                // 1 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v29 = hl.cxsz("cyct", cxtb(int ), (int)106);
lbl245:
                // 2 sources

                return (boolean)v29;
            }
            case 0: {
                var3_3 /* !! */  = (int)hl.cxsz("cycu", cxtb(int ), (int)107);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
            case 1: {
                var3_3 /* !! */  = (int)hl.cxsz("cycv", cxtb(int ), (int)108);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl256:
            // 3 sources

            case 2: {
                var3_3 /* !! */  = (int)hl.cxsz("cycw", cxtb(int ), (int)109);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl337
            }
lbl261:
            // 4 sources

            case 3: {
                var3_3 /* !! */  = (int)hl.cxsz("cycx", cxtb(int ), (int)110);
                if (var4_2) {
                    throw null;
                }
            }
lbl265:
            // 7 sources

            case 4: {
                var3_3 /* !! */  = (int)hl.cxsz("cycy", cxtb(int ), (int)111);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl270:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)hl.cxsz("cycz", cxtb(int ), (int)112);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
            case 6: {
                var3_3 /* !! */  = (int)hl.cxsz("cyda", cxtb(int ), (int)113);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl280:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)hl.cxsz("cydb", cxtb(int ), (int)114);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl345
            }
lbl285:
            // 3 sources

            case 8: {
                var3_3 /* !! */  = (int)hl.cxsz("cydc", cxtb(int ), (int)115);
                if (!var4_2) ** GOTO lbl280
                throw null;
            }
            case 9: {
                var3_3 /* !! */  = (int)hl.cxsz("cydd", cxtb(int ), (int)116);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 10: {
                var3_3 /* !! */  = (int)hl.cxsz("cyde", cxtb(int ), (int)117);
                if (!var4_2) ** GOTO lbl261
                throw null;
            }
lbl298:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)hl.cxsz("cydf", cxtb(int ), (int)118);
                if (!var4_2) ** GOTO lbl261
                throw null;
            }
            case 12: {
                var3_3 /* !! */  = (int)hl.cxsz("cydg", cxtb(int ), (int)119);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl358
            }
            case 13: {
                var3_3 /* !! */  = (int)hl.cxsz("cydh", cxtb(int ), (int)120);
                if (!var4_2) ** GOTO lbl265
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)hl.cxsz("cydi", cxtb(int ), (int)121);
                if (!var4_2) ** GOTO lbl298
                throw null;
            }
lbl315:
            // 2 sources

            case 15: {
                var3_3 /* !! */  = (int)hl.cxsz("cydj", cxtb(int ), (int)122);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl358
            }
            case 16: {
                var3_3 /* !! */  = (int)hl.cxsz("cydk", cxtb(int ), (int)123);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl353
            }
            case 17: {
                var3_3 /* !! */  = (int)hl.cxsz("cydl", cxtb(int ), (int)124);
                if (!var4_2) ** GOTO lbl256
                throw null;
            }
lbl329:
            // 2 sources

            case 18: {
                var3_3 /* !! */  = (int)hl.cxsz("cydm", cxtb(int ), (int)125);
                if (!var4_2) ** GOTO lbl256
                throw null;
            }
            case 19: {
                var3_3 /* !! */  = (int)hl.cxsz("cydn", cxtb(int ), (int)126);
                if (!var4_2) ** GOTO lbl329
                throw null;
            }
lbl337:
            // 2 sources

            case 20: {
                var3_3 /* !! */  = (int)hl.cxsz("cydo", cxtb(int ), (int)127);
                if (!var4_2) ** GOTO lbl285
                throw null;
            }
lbl341:
            // 2 sources

            case 21: {
                var3_3 /* !! */  = (int)hl.cxsz("cydp", cxtb(int ), (int)128);
                if (!var4_2) ** GOTO lbl270
                throw null;
            }
lbl345:
            // 3 sources

            case 22: {
                var3_3 /* !! */  = (int)hl.cxsz("cydq", cxtb(int ), (int)129);
                if (!var4_2) ** GOTO lbl265
                throw null;
            }
lbl349:
            // 2 sources

            case 23: {
                var3_3 /* !! */  = (int)hl.cxsz("cydr", cxtb(int ), (int)130);
                if (!var4_2) ** GOTO lbl261
                throw null;
            }
lbl353:
            // 3 sources

            case 24: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)hl.cxsz("cyds", cxtb(int ), (int)131);
                    if (!var4_2) ** GOTO lbl341
                    throw null;
                }
            }
lbl358:
            // 3 sources

            case 25: {
                var3_3 /* !! */  = (int)hl.cxsz("cydt", cxtb(int ), (int)132);
                if (!var4_2) ** GOTO lbl265
                throw null;
            }
            case 26: 
        }
        var3_3 /* !! */  = (int)hl.cxsz("cydu", cxtb(int ), (int)133);
        ** while (!var4_2)
lbl365:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double cxyt(int n2) {
        return Double.longBitsToDouble(cxsx[n2] ^ cxsy[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public hl() {
        var2_1 /* !! */  = hl.b;
        var1_2 = hl.a;
        super("ElytraTarget", "\u041f\u0435\u0440\u0435\u0433\u043e\u043d\u044f\u0435\u0442 \u0446\u0435\u043b\u044c \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445 \u0438 \u0440\u0430\u0441\u0448\u0438\u0440\u044f\u0435\u0442 \u0445\u0438\u0442\u0431\u043e\u043a\u0441 \u0434\u043b\u044f \u043f\u0440\u0435\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u043d\u0438\u044f", du.RAGE);
        this.elytraFindRange = new kg("\u0420\u0430\u0441\u0441\u0442\u043e\u044f\u043d\u0438\u0435 \u043f\u0440\u0435\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u043d\u0438\u044f", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043f\u043e\u0438\u0441\u043a\u0430 \u0446\u0435\u043b\u0438 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445", (float)hl.cxsz("cxtu", cxtt(int ), (int)8)).range((float)hl.cxsz("cxtv", cxtt(int ), (int)9), (float)hl.cxsz("cxtw", cxtt(int ), (int)10)).step((float)hl.cxsz("cxtx", cxtt(int ), (int)11));
        this.predictMovement = new kb("\u041f\u0435\u0440\u0435\u0433\u043e\u043d\u044f\u0442\u044c", "\u0423\u0447\u0438\u0442\u044b\u0432\u0430\u0442\u044c \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0438 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e\u043b\u0435\u0442\u0430 \u0446\u0435\u043b\u0438").setValue((boolean)hl.cxsz("cxty", cxtb(int ), (int)12));
        this.elytraForward = new kg("\u041f\u0435\u0440\u0435\u043b\u0435\u0442", "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u0442\u0438\u043a\u043e\u0432 \u0443\u043f\u0440\u0435\u0436\u0434\u0435\u043d\u0438\u044f \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0446\u0435\u043b\u0438", 2.0f).range(1.0f, (float)hl.cxsz("cxtz", cxtt(int ), (int)13)).step((float)hl.cxsz("cxua", cxtt(int ), (int)14)).visible((Supplier<Boolean>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, isValue(), ()Ljava/lang/Boolean;)((kb)this.predictMovement));
        this.onlyAuraTarget = new kb("\u0422\u043e\u043b\u044c\u043a\u043e \u0442\u0430\u0440\u0433\u0435\u0442 \u0430\u0443\u0440\u044b", "\u041f\u0440\u0438\u043c\u0435\u043d\u044f\u0442\u044c \u043f\u0435\u0440\u0435\u0433\u043e\u043d \u0442\u043e\u043b\u044c\u043a\u043e \u043a \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u0446\u0435\u043b\u0438 KillAura");
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.targetMustFly = new kb("\u0422\u0430\u0440\u0433\u0435\u0442 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0435", "\u0420\u0430\u0431\u043e\u0442\u0430\u0442\u044c \u0442\u043e\u043b\u044c\u043a\u043e \u043f\u043e \u0446\u0435\u043b\u0438, \u043b\u0435\u0442\u044f\u0449\u0435\u0439 \u043d\u0430 \u044d\u043b\u0438\u0442\u0440\u0430\u0445").setValue((boolean)hl.cxsz("cxub", cxtb(int ), (int)15));
                this.extraHitbox = new kg("\u0414\u043e\u043f. \u0445\u0438\u0442\u0431\u043e\u043a\u0441", "\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0435 \u0440\u0430\u0441\u0448\u0438\u0440\u0435\u043d\u0438\u0435 \u0445\u0438\u0442\u0431\u043e\u043a\u0441\u0430 \u043f\u0440\u0438 \u043f\u0440\u0435\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u043d\u0438\u0438", (float)hl.cxsz("cxuc", cxtt(int ), (int)16)).range(0.0f, 1.0f).step((float)hl.cxsz("cxud", cxtt(int ), (int)17));
                this.predictedPosition = class_243.field_1353;
                this.settings(new jx[]{this.elytraFindRange, this.predictMovement, this.elytraForward, this.onlyAuraTarget, this.targetMustFly, this.extraHitbox});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)hl.cxsz("cxue", cxtb(int ), (int)18);
                ** GOTO lbl42
            }
            case 1: {
                var2_1 /* !! */  = (int)hl.cxsz("cxuf", cxtb(int ), (int)19);
                break;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)hl.cxsz("cxug", cxtb(int ), (int)20);
                    ** GOTO lbl48
                    break;
                }
            }
lbl29:
            // 3 sources

            case 3: {
                while (true) {
                    var2_1 /* !! */  = (int)hl.cxsz("cxuh", cxtb(int ), (int)21);
                }
            }
            case 4: {
                var2_1 /* !! */  = (int)hl.cxsz("cxui", cxtb(int ), (int)22);
            }
            case 5: {
                while (true) {
                    var2_1 /* !! */  = (int)hl.cxsz("cxuj", cxtb(int ), (int)23);
                }
            }
            case 6: {
                var2_1 /* !! */  = (int)hl.cxsz("cxuk", cxtb(int ), (int)24);
                ** GOTO lbl45
            }
lbl42:
            // 2 sources

            case 7: {
                var2_1 /* !! */  = (int)hl.cxsz("cxul", cxtb(int ), (int)25);
                ** GOTO lbl29
            }
lbl45:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)hl.cxsz("cxum", cxtb(int ), (int)26);
                ** GOTO lbl29
            }
lbl48:
            // 2 sources

            case 9: {
                var2_1 /* !! */  = (int)hl.cxsz("cxun", cxtb(int ), (int)27);
            }
            case 10: 
        }
        var2_1 /* !! */  = (int)hl.cxsz("cxuo", cxtb(int ), (int)28);
        ** while (true)
    }
}

