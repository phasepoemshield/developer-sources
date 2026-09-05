/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import ruhack.phobia.eh;
import ruhack.phobia.hx;
import ruhack.phobia.im;
import ruhack.phobia.nm;
import ruhack.phobia.ot;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

public class el
extends hx {
    public static final boolean c;
    public static final boolean a;
    private static int[] tia;
    private static long[] tlr;
    private static final long bd = -3310820386474867737L;
    private static long[] tls;
    public static final int b;
    private float lastPitch;
    private float lastYaw;
    private static int[] tib;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = el.bd - el.tic("tlt", tlq(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == el.tic("tlu", thz(int ), (int)90)) break;
            v0 /* !! */  = (long)el.tic("tlv", thz(int ), (int)91);
        }
        var3_1 = el.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = el.bd - el.tic("tlw", tlq(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == el.tic("tlx", thz(int ), (int)92)) break;
            v1 /* !! */  = (long)el.tic("tly", thz(int ), (int)93);
        }
        var2_2 /* !! */  = el.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = el.bd - el.tic("tlz", tlq(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == el.tic("tma", thz(int ), (int)94)) break;
            v2 /* !! */  = (long)el.tic("tmb", thz(int ), (int)95);
        }
        var1_3 = el.a;
        if (!var3_1) ** GOTO lbl28
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl28:
                // 1 sources

                if (var1_3 || var1_3) continue block20;
                v3 /* !! */  = el.bd;
                if (true) ** GOTO lbl33
                block21: while (true) {
                    v3 /* !! */  = (long)(v4 - el.tic("tmc", tlq(int ), (int)3));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1162601422: {
                            v4 = el.tic("tmd", tlq(int ), (int)4);
                            continue block21;
                        }
                        case 1695237095: {
                            break block21;
                        }
                        case 1974419912: {
                            v4 = el.tic("tme", tlq(int ), (int)5);
                            continue block21;
                        }
                    }
                    break;
                }
                v5 /* !! */  = el.bd;
                if (true) ** GOTO lbl46
                block22: while (true) {
                    v5 /* !! */  = (long)(v6 - el.tic("tmf", tlq(int ), (int)6));
lbl46:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -269242451: {
                            v6 = el.tic("tmg", tlq(int ), (int)7);
                            continue block22;
                        }
                        case -150660800: {
                            v6 = el.tic("tmh", tlq(int ), (int)8);
                            continue block22;
                        }
                        case 0x12232211: {
                            v6 = el.tic("tmi", tlq(int ), (int)9);
                            continue block22;
                        }
                        case 1695237095: {
                            break block22;
                        }
                    }
                    break;
                }
                return new class_243(0.0, 0.0, 0.0);
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)el.tic("tmj", thz(int ), (int)96);
                        if (!var3_1) break block20;
                        throw null;
                    }
                }
                case 1: {
                    do {
                        var2_2 /* !! */  = (int)el.tic("tmk", thz(int ), (int)97);
                    } while (!var3_1);
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)el.tic("tml", thz(int ), (int)98);
                    if (!var3_1) break block20;
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)el.tic("tmm", thz(int ), (int)99);
        ** while (!var3_1)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void tmp() {
        el.tlr[0] = -5030372356455832902L;
        el.tlr[1] = 3408371674238182809L;
        el.tlr[2] = 5169739260634188334L;
        el.tlr[3] = 4024423865353538511L;
        el.tlr[4] = -3062064557464407977L;
        el.tlr[5] = -1993306393383694447L;
        el.tlr[6] = 7105334476847030511L;
        el.tlr[7] = 3010344889700845408L;
        el.tlr[8] = 4149151283746127284L;
        el.tlr[9] = 4877295648104137568L;
    }

    static {
        tia = new int[100];
        tib = new int[100];
        el.tmn();
        el.tmo();
        tlr = new long[10];
        tls = new long[10];
        el.tmp();
        el.tmq();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block140: {
            var21_5 = el.c;
            var20_6 /* !! */  = el.b;
            var19_7 = el.a;
            if (var21_5) {
                throw null;
lbl6:
                // 38 sources

                return null;
            }
            if (var19_7 || var19_7) ** GOTO lbl6
            if (var4_4 == null) break block140;
            if (var19_7) ** GOTO lbl6
            if (!eh.getInstance().getPitchCorrecting().isValue()) break block140;
            if (var19_7) ** GOTO lbl6
            var2_2 = ow.calculateAngle(im.brain(var4_4, 0.0f, 2.0f));
            if (var19_7) ** GOTO lbl6
        }
        if (var19_7 || var19_7) ** GOTO lbl6
        var5_8 = ow.calculateDelta(var1_1, var2_2);
        if (var19_7 || var19_7) ** GOTO lbl6
        var6_9 = var5_8.getYaw();
        if (var19_7 || var19_7) ** GOTO lbl6
        var7_10 = var5_8.getPitch();
        if (var20_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var20_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var19_7 || var19_7) ** GOTO lbl6
                var8_11 = (float)Math.hypot(Math.abs(var6_9), Math.abs(var7_10));
                if (var19_7 || var19_7) ** GOTO lbl6
                if (var4_4 == null) ** GOTO lbl62
                if (var19_7 || var19_7) ** GOTO lbl6
                var12_12 = Math.abs(var6_9) + Math.abs(var7_10);
                if (var19_7 || var19_7) ** GOTO lbl6
                var14_14 /* !! */  = eh.getInstance().getSpeed().getValue() / el.tic("tij", tii(int ), (int)5);
                if (var19_7 || var19_7) ** GOTO lbl6
                var15_15 /* !! */  = eh.getInstance().getSpeed().getValue() / 2.0f;
                if (var19_7 || var19_7) ** GOTO lbl6
                var16_16 /* !! */  = eh.getInstance().getSpeed().getValue() / el.tic("tik", tii(int ), (int)6);
                if (var19_7 || var19_7) ** GOTO lbl6
                var17_17 /* !! */  = eh.getInstance().getSpeed().getValue() / el.tic("til", tii(int ), (int)7);
                if (var19_7 || var19_7) ** GOTO lbl6
                if (var4_4 != null) ** GOTO lbl50
                if (var19_7 || var19_7) ** GOTO lbl6
                var14_14 /* !! */  = (float)el.tic("tim", tii(int ), (int)8);
                if (var19_7 || var19_7) ** GOTO lbl6
                var15_15 /* !! */  = (float)el.tic("tin", tii(int ), (int)9);
                if (var19_7 || var19_7) ** GOTO lbl6
                var16_16 /* !! */  = (float)el.tic("tio", tii(int ), (int)10);
                if (var19_7 || var19_7) ** GOTO lbl6
                var17_17 /* !! */  = (float)el.tic("tip", tii(int ), (int)11);
                if (var19_7) ** GOTO lbl6
lbl50:
                // 2 sources

                if (var19_7 || var19_7) ** GOTO lbl6
                var18_18 = Math.max(0.0f, Math.min(1.0f, 1.0f - (float)(var12_12 / (double)var8_11) + el.tic("tiq", tii(int ), (int)12)));
                if (var19_7 || var19_7) ** GOTO lbl6
                var9_19 /* !! */  = (CallSite)(var14_14 /* !! */  + (var15_15 /* !! */  - var14_14 /* !! */ ) * var18_18);
                if (var19_7 || var19_7) ** GOTO lbl6
                var10_20 /* !! */  = (CallSite)(var16_16 /* !! */  + (var17_17 /* !! */  - var16_16 /* !! */ ) * var18_18);
                if (var19_7 || var19_7) ** GOTO lbl6
                var11_21 = var16_16 /* !! */  + (var17_17 /* !! */  * 2.0f - var16_16 /* !! */ ) * var18_18;
                if (var19_7 || var19_7) ** GOTO lbl6
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl69
lbl62:
                // 1 sources

                if (var19_7 || var19_7) ** GOTO lbl6
                var9_19 /* !! */  = el.tic("tir", tii(int ), (int)13);
                if (var19_7 || var19_7) ** GOTO lbl6
                var10_20 /* !! */  = el.tic("tis", tii(int ), (int)14);
                if (var19_7 || var19_7) ** GOTO lbl6
                var11_22 = el.tic("tit", tii(int ), (int)15);
                if (var19_7) ** GOTO lbl6
lbl69:
                // 2 sources

                if (var19_7 || var19_7) ** GOTO lbl6
                if (!eh.getInstance().getPitchCorrecting().isValue()) ** GOTO lbl76
                if (var19_7 || var19_7) ** GOTO lbl6
                el.mc.field_1724.method_36456(ot.INSTANCE.getRotation().getYaw());
                if (var19_7 || var19_7) ** GOTO lbl6
                el.mc.field_1724.method_36457(ot.INSTANCE.getRotation().getPitch());
                if (var19_7) ** GOTO lbl6
lbl76:
                // 2 sources

                if (var19_7 || var19_7) ** GOTO lbl6
                if (!eh.getInstance().getPitchCorrecting().isValue()) ** GOTO lbl80
                if (var19_7 || var19_7) ** GOTO lbl6
                return new ov(var1_1.getYaw() + Math.min(Math.max(var6_9, (float)(-var9_19 /* !! */ )), (float)var9_19 /* !! */ ), var1_1.getPitch() + Math.min(Math.max(var7_10, (float)(-var10_20 /* !! */ )), (float)var10_20 /* !! */ ));
lbl80:
                // 1 sources

                if (var19_7 || var19_7) ** GOTO lbl6
                var12_13 = el.mc.field_1724.method_36455();
                if (var19_7 || var19_7) ** GOTO lbl6
                var13_23 = var12_13 - var1_1.getPitch();
                if (!var19_7 && !var19_7) ** break;
                ** continue;
                return new ov(var1_1.getYaw() + Math.min(Math.max(var6_9, (float)(-var9_19 /* !! */ )), (float)var9_19 /* !! */ ), el.mc.field_1724.method_36455() + nm.randomLerp((float)el.tic("tiu", tii(int ), (int)16), 1.0f));
            }
lbl87:
            // 3 sources

            case 0: {
                var20_6 /* !! */  = (int)el.tic("tiv", thz(int ), (int)17);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl92:
            // 2 sources

            case 1: {
                var20_6 /* !! */  = (int)el.tic("tiw", thz(int ), (int)18);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl382
            }
            case 2: {
                var20_6 /* !! */  = (int)el.tic("tix", thz(int ), (int)19);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl196
            }
            case 3: {
                var20_6 /* !! */  = (int)el.tic("tiy", thz(int ), (int)20);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl382
            }
            case 4: {
                var20_6 /* !! */  = (int)el.tic("tiz", thz(int ), (int)21);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 5: {
                var20_6 /* !! */  = (int)el.tic("tja", thz(int ), (int)22);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl374
            }
lbl117:
            // 2 sources

            case 6: {
                var20_6 /* !! */  = (int)el.tic("tjb", thz(int ), (int)23);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl407
            }
            case 7: {
                var20_6 /* !! */  = (int)el.tic("tjc", thz(int ), (int)24);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl127:
            // 3 sources

            case 8: {
                var20_6 /* !! */  = (int)el.tic("tjd", thz(int ), (int)25);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 9: {
                var20_6 /* !! */  = (int)el.tic("tje", thz(int ), (int)26);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl358
            }
lbl137:
            // 2 sources

            case 10: {
                var20_6 /* !! */  = (int)el.tic("tjf", thz(int ), (int)27);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl296
            }
            case 11: {
                var20_6 /* !! */  = (int)el.tic("tjg", thz(int ), (int)28);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 12: {
                var20_6 /* !! */  = (int)el.tic("tjh", thz(int ), (int)29);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 13: {
                var20_6 /* !! */  = (int)el.tic("tji", thz(int ), (int)30);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl157:
            // 3 sources

            case 14: {
                var20_6 /* !! */  = (int)el.tic("tjj", thz(int ), (int)31);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl162:
            // 3 sources

            case 15: {
                var20_6 /* !! */  = (int)el.tic("tjk", thz(int ), (int)32);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl260
            }
            case 16: {
                var20_6 /* !! */  = (int)el.tic("tjl", thz(int ), (int)33);
                if (!var21_5) ** GOTO lbl127
                throw null;
            }
            case 17: {
                var20_6 /* !! */  = (int)el.tic("tjm", thz(int ), (int)34);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl186
            }
            case 18: {
                var20_6 /* !! */  = (int)el.tic("tjn", thz(int ), (int)35);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 19: {
                var20_6 /* !! */  = (int)el.tic("tjo", thz(int ), (int)36);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl330
            }
lbl186:
            // 4 sources

            case 20: {
                var20_6 /* !! */  = (int)el.tic("tjp", thz(int ), (int)37);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl313
            }
            case 21: {
                var20_6 /* !! */  = (int)el.tic("tjq", thz(int ), (int)38);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl196:
            // 4 sources

            case 22: {
                var20_6 /* !! */  = (int)el.tic("tjr", thz(int ), (int)39);
                if (!var21_5) ** GOTO lbl87
                throw null;
            }
            case 23: {
                var20_6 /* !! */  = (int)el.tic("tjs", thz(int ), (int)40);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl399
            }
lbl205:
            // 3 sources

            case 24: {
                var20_6 /* !! */  = (int)el.tic("tjt", thz(int ), (int)41);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl210:
            // 2 sources

            case 25: {
                var20_6 /* !! */  = (int)el.tic("tju", thz(int ), (int)42);
                if (!var21_5) ** GOTO lbl205
                throw null;
            }
            case 26: {
                var20_6 /* !! */  = (int)el.tic("tjv", thz(int ), (int)43);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl346
            }
            case 27: {
                var20_6 /* !! */  = (int)el.tic("tjw", thz(int ), (int)44);
                if (!var21_5) ** GOTO lbl196
                throw null;
            }
lbl223:
            // 2 sources

            case 28: {
                var20_6 /* !! */  = (int)el.tic("tjx", thz(int ), (int)45);
                if (!var21_5) ** GOTO lbl210
                throw null;
            }
            case 29: {
                var20_6 /* !! */  = (int)el.tic("tjy", thz(int ), (int)46);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl338
            }
lbl232:
            // 2 sources

            case 30: {
                var20_6 /* !! */  = (int)el.tic("tjz", thz(int ), (int)47);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl255
            }
lbl237:
            // 3 sources

            case 31: {
                var20_6 /* !! */  = (int)el.tic("tka", thz(int ), (int)48);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl391
            }
lbl242:
            // 2 sources

            case 32: {
                var20_6 /* !! */  = (int)el.tic("tkb", thz(int ), (int)49);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl300
            }
lbl247:
            // 3 sources

            case 33: {
                var20_6 /* !! */  = (int)el.tic("tkc", thz(int ), (int)50);
                if (!var21_5) ** GOTO lbl87
                throw null;
            }
            case 34: {
                var20_6 /* !! */  = (int)el.tic("tkd", thz(int ), (int)51);
                if (!var21_5) ** GOTO lbl117
                throw null;
            }
lbl255:
            // 4 sources

            case 35: {
                var20_6 /* !! */  = (int)el.tic("tke", thz(int ), (int)52);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl313
            }
lbl260:
            // 2 sources

            case 36: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var20_6 /* !! */  = (int)el.tic("tkf", thz(int ), (int)53);
                    if (var21_5) {
                        throw null;
                    }
                    ** GOTO lbl283
                    break;
                }
            }
lbl266:
            // 3 sources

            case 37: {
                var20_6 /* !! */  = (int)el.tic("tkg", thz(int ), (int)54);
                if (!var21_5) ** GOTO lbl196
                throw null;
            }
            case 38: {
                var20_6 /* !! */  = (int)el.tic("tkh", thz(int ), (int)55);
                if (!var21_5) ** GOTO lbl186
                throw null;
            }
lbl274:
            // 2 sources

            case 39: {
                var20_6 /* !! */  = (int)el.tic("tki", thz(int ), (int)56);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl279:
            // 3 sources

            case 40: {
                var20_6 /* !! */  = (int)el.tic("tkj", thz(int ), (int)57);
                if (!var21_5) ** GOTO lbl223
                throw null;
            }
lbl283:
            // 4 sources

            case 41: {
                var20_6 /* !! */  = (int)el.tic("tkk", thz(int ), (int)58);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl300
            }
            case 42: {
                var20_6 /* !! */  = (int)el.tic("tkl", thz(int ), (int)59);
                if (!var21_5) ** GOTO lbl186
                throw null;
            }
            case 43: {
                var20_6 /* !! */  = (int)el.tic("tkm", thz(int ), (int)60);
                if (!var21_5) ** GOTO lbl279
                throw null;
            }
lbl296:
            // 4 sources

            case 44: {
                var20_6 /* !! */  = (int)el.tic("tkn", thz(int ), (int)61);
                if (!var21_5) ** GOTO lbl205
                throw null;
            }
lbl300:
            // 4 sources

            case 45: {
                var20_6 /* !! */  = (int)el.tic("tko", thz(int ), (int)62);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl346
            }
lbl305:
            // 3 sources

            case 46: {
                var20_6 /* !! */  = (int)el.tic("tkp", thz(int ), (int)63);
                if (!var21_5) ** GOTO lbl137
                throw null;
            }
lbl309:
            // 3 sources

            case 47: {
                var20_6 /* !! */  = (int)el.tic("tkq", thz(int ), (int)64);
                if (!var21_5) ** GOTO lbl305
                throw null;
            }
lbl313:
            // 4 sources

            case 48: {
                var20_6 /* !! */  = (int)el.tic("tkr", thz(int ), (int)65);
                if (!var21_5) ** GOTO lbl309
                throw null;
            }
            case 49: {
                var20_6 /* !! */  = (int)el.tic("tks", thz(int ), (int)66);
                if (!var21_5) ** GOTO lbl309
                throw null;
            }
            case 50: {
                var20_6 /* !! */  = (int)el.tic("tkt", thz(int ), (int)67);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 51: {
                var20_6 /* !! */  = (int)el.tic("tku", thz(int ), (int)68);
                if (!var21_5) break;
                throw null;
            }
lbl330:
            // 2 sources

            case 52: {
                var20_6 /* !! */  = (int)el.tic("tkv", thz(int ), (int)69);
                if (!var21_5) ** GOTO lbl279
                throw null;
            }
            case 53: {
                var20_6 /* !! */  = (int)el.tic("tkw", thz(int ), (int)70);
                if (!var21_5) ** GOTO lbl127
                throw null;
            }
lbl338:
            // 3 sources

            case 54: {
                var20_6 /* !! */  = (int)el.tic("tkx", thz(int ), (int)71);
                if (!var21_5) ** GOTO lbl162
                throw null;
            }
            case 55: {
                var20_6 /* !! */  = (int)el.tic("tky", thz(int ), (int)72);
                if (!var21_5) ** GOTO lbl305
                throw null;
            }
lbl346:
            // 3 sources

            case 56: {
                var20_6 /* !! */  = (int)el.tic("tkz", thz(int ), (int)73);
                if (!var21_5) ** GOTO lbl247
                throw null;
            }
lbl350:
            // 2 sources

            case 57: {
                var20_6 /* !! */  = (int)el.tic("tla", thz(int ), (int)74);
                if (!var21_5) ** GOTO lbl296
                throw null;
            }
lbl354:
            // 2 sources

            case 58: {
                var20_6 /* !! */  = (int)el.tic("tlb", thz(int ), (int)75);
                if (!var21_5) ** GOTO lbl92
                throw null;
            }
lbl358:
            // 2 sources

            case 59: {
                var20_6 /* !! */  = (int)el.tic("tlc", thz(int ), (int)76);
                if (var21_5) {
                    throw null;
                }
            }
lbl362:
            // 4 sources

            case 60: {
                var20_6 /* !! */  = (int)el.tic("tld", thz(int ), (int)77);
                if (!var21_5) ** GOTO lbl242
                throw null;
            }
            case 61: {
                var20_6 /* !! */  = (int)el.tic("tle", thz(int ), (int)78);
                if (!var21_5) ** GOTO lbl247
                throw null;
            }
            case 62: {
                var20_6 /* !! */  = (int)el.tic("tlf", thz(int ), (int)79);
                if (!var21_5) ** GOTO lbl350
                throw null;
            }
lbl374:
            // 2 sources

            case 63: {
                var20_6 /* !! */  = (int)el.tic("tlg", thz(int ), (int)80);
                if (!var21_5) ** GOTO lbl362
                throw null;
            }
lbl378:
            // 2 sources

            case 64: {
                var20_6 /* !! */  = (int)el.tic("tlh", thz(int ), (int)81);
                if (!var21_5) ** GOTO lbl162
                throw null;
            }
lbl382:
            // 3 sources

            case 65: {
                var20_6 /* !! */  = (int)el.tic("tli", thz(int ), (int)82);
                if (!var21_5) ** GOTO lbl354
                throw null;
            }
            case 66: {
                var20_6 /* !! */  = (int)el.tic("tlj", thz(int ), (int)83);
                if (var21_5) {
                    throw null;
                }
                ** GOTO lbl395
            }
lbl391:
            // 2 sources

            case 67: {
                var20_6 /* !! */  = (int)el.tic("tlk", thz(int ), (int)84);
                if (!var21_5) ** GOTO lbl283
                throw null;
            }
lbl395:
            // 2 sources

            case 68: {
                var20_6 /* !! */  = (int)el.tic("tll", thz(int ), (int)85);
                if (!var21_5) ** GOTO lbl255
                throw null;
            }
lbl399:
            // 3 sources

            case 69: {
                var20_6 /* !! */  = (int)el.tic("tlm", thz(int ), (int)86);
                if (!var21_5) ** GOTO lbl274
                throw null;
            }
            case 70: {
                var20_6 /* !! */  = (int)el.tic("tln", thz(int ), (int)87);
                if (!var21_5) ** GOTO lbl300
                throw null;
            }
lbl407:
            // 2 sources

            case 71: {
                var20_6 /* !! */  = (int)el.tic("tlo", thz(int ), (int)88);
                if (!var21_5) ** GOTO lbl378
                throw null;
            }
            case 72: 
        }
        var20_6 /* !! */  = (int)el.tic("tlp", thz(int ), (int)89);
        ** while (!var21_5)
lbl414:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void tmn() {
        el.tia[0] = -1663368743;
        el.tia[1] = -2031878499;
        el.tia[2] = -1548671223;
        el.tia[3] = -417211615;
        el.tia[4] = -1028785713;
        el.tia[5] = 1798988274;
        el.tia[6] = -1155003562;
        el.tia[7] = -1036199740;
        el.tia[8] = -2088060401;
        el.tia[9] = 847048750;
        el.tia[10] = -1557178383;
        el.tia[11] = -2077837557;
        el.tia[12] = 1436886799;
        el.tia[13] = 56556054;
        el.tia[14] = -1622315646;
        el.tia[15] = 1540275675;
        el.tia[16] = -12129755;
        el.tia[17] = -1424784262;
        el.tia[18] = 1957680546;
        el.tia[19] = -1182604343;
        el.tia[20] = -342628251;
        el.tia[21] = 763883586;
        el.tia[22] = -1475108472;
        el.tia[23] = -1765943362;
        el.tia[24] = -1018371680;
        el.tia[25] = 308759161;
        el.tia[26] = -1600730477;
        el.tia[27] = 1050704992;
        el.tia[28] = 1464236925;
        el.tia[29] = -980341798;
        el.tia[30] = 534018201;
        el.tia[31] = -1764953716;
        el.tia[32] = -1157939884;
        el.tia[33] = 1499097979;
        el.tia[34] = 1389909103;
        el.tia[35] = 1922463940;
        el.tia[36] = -152879183;
        el.tia[37] = 1526533085;
        el.tia[38] = 1089684709;
        el.tia[39] = 263899007;
        el.tia[40] = -491744162;
        el.tia[41] = 1601444855;
        el.tia[42] = 2081571655;
        el.tia[43] = -1495095761;
        el.tia[44] = -895767927;
        el.tia[45] = 1841791534;
        el.tia[46] = 1383997924;
        el.tia[47] = -435101185;
        el.tia[48] = -1705298940;
        el.tia[49] = 597089971;
        el.tia[50] = -1628082877;
        el.tia[51] = 2114186797;
        el.tia[52] = 1477922040;
        el.tia[53] = 301072201;
        el.tia[54] = -813707632;
        el.tia[55] = -2030057655;
        el.tia[56] = -1470108340;
        el.tia[57] = -25127172;
        el.tia[58] = -680752020;
        el.tia[59] = -625284416;
        el.tia[60] = 1311434317;
        el.tia[61] = 115485313;
        el.tia[62] = 1675891761;
        el.tia[63] = 562198608;
        el.tia[64] = 257814472;
        el.tia[65] = -448107679;
        el.tia[66] = -561074551;
        el.tia[67] = 358010762;
        el.tia[68] = -877819386;
        el.tia[69] = 82669165;
        el.tia[70] = -45039766;
        el.tia[71] = -670875678;
        el.tia[72] = -1595820102;
        el.tia[73] = -1508738914;
        el.tia[74] = -482395748;
        el.tia[75] = 1850252689;
        el.tia[76] = -1457662947;
        el.tia[77] = -337948184;
        el.tia[78] = 603269426;
        el.tia[79] = -614739964;
        el.tia[80] = -1244067438;
        el.tia[81] = 1815696085;
        el.tia[82] = 1771927391;
        el.tia[83] = -1569280841;
        el.tia[84] = -1459016544;
        el.tia[85] = 1281925947;
        el.tia[86] = -1919791654;
        el.tia[87] = -515198266;
        el.tia[88] = -36045099;
        el.tia[89] = 1558010231;
        el.tia[90] = -1063722482;
        el.tia[91] = 1334179598;
        el.tia[92] = 1500568818;
        el.tia[93] = -168028687;
        el.tia[94] = 1269123271;
        el.tia[95] = 579745322;
        el.tia[96] = 2039187438;
        el.tia[97] = 688302780;
        el.tia[98] = -1841296035;
        el.tia[99] = -2018513656;
    }

    private static /* synthetic */ int thz(int n2) {
        return tia[n2] ^ tib[n2];
    }

    public static /* synthetic */ CallSite tic(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void tmq() {
        el.tls[0] = -4204750228667334864L;
        el.tls[1] = 2539317851554579920L;
        el.tls[2] = 3433442241068329634L;
        el.tls[3] = -9178486786024568032L;
        el.tls[4] = 3808531150841838920L;
        el.tls[5] = -2060284240853693165L;
        el.tls[6] = -4392132941475632535L;
        el.tls[7] = 5310420650917496497L;
        el.tls[8] = 5296926020577760513L;
        el.tls[9] = 3833857286516937709L;
    }

    public el() {
        int n2 = b;
        super("Legit");
        this.lastYaw = 0.0f;
        this.lastPitch = 0.0f;
    }

    private static /* synthetic */ long tlq(int n2) {
        return tlr[n2] ^ tls[n2];
    }

    private static /* synthetic */ void tmo() {
        el.tib[0] = -1663368742;
        el.tib[1] = -2031878497;
        el.tib[2] = -1548671224;
        el.tib[3] = -417211615;
        el.tib[4] = -1028785716;
        el.tib[5] = 733635058;
        el.tib[6] = -85456042;
        el.tib[7] = -2088970044;
        el.tib[8] = -1069630961;
        el.tib[9] = 1908994094;
        el.tib[10] = -526690319;
        el.tib[11] = -946686197;
        el.tib[12] = 352659215;
        el.tib[13] = 1110374934;
        el.tib[14] = -538088062;
        el.tib[15] = 460242395;
        el.tib[16] = 1086777893;
        el.tib[17] = -1424784328;
        el.tib[18] = 1957680569;
        el.tib[19] = -1182604293;
        el.tib[20] = -342628253;
        el.tib[21] = 763883620;
        el.tib[22] = -1475108427;
        el.tib[23] = -1765943394;
        el.tib[24] = -1018371696;
        el.tib[25] = 308759132;
        el.tib[26] = -1600730456;
        el.tib[27] = 1050704961;
        el.tib[28] = 1464236913;
        el.tib[29] = -980341816;
        el.tib[30] = 534018234;
        el.tib[31] = -1764953673;
        el.tib[32] = -1157939894;
        el.tib[33] = 1499097964;
        el.tib[34] = 1389909038;
        el.tib[35] = 1922463873;
        el.tib[36] = -152879196;
        el.tib[37] = 1526533020;
        el.tib[38] = 1089684675;
        el.tib[39] = 263898979;
        el.tib[40] = -491744177;
        el.tib[41] = 1601444846;
        el.tib[42] = 2081571676;
        el.tib[43] = -1495095757;
        el.tib[44] = -895767894;
        el.tib[45] = 1841791537;
        el.tib[46] = 1383997922;
        el.tib[47] = -435101197;
        el.tib[48] = -1705298911;
        el.tib[49] = 597089950;
        el.tib[50] = -1628082839;
        el.tib[51] = 2114186786;
        el.tib[52] = 1477922038;
        el.tib[53] = 301072205;
        el.tib[54] = -813707631;
        el.tib[55] = -2030057650;
        el.tib[56] = -1470108348;
        el.tib[57] = -25127190;
        el.tib[58] = -680752082;
        el.tib[59] = -625284370;
        el.tib[60] = 1311434305;
        el.tib[61] = 115485352;
        el.tib[62] = 1675891755;
        el.tib[63] = 562198638;
        el.tib[64] = 257814467;
        el.tib[65] = -448107660;
        el.tib[66] = -561074517;
        el.tib[67] = 358010762;
        el.tib[68] = -877819387;
        el.tib[69] = 82669166;
        el.tib[70] = -45039760;
        el.tib[71] = -670875682;
        el.tib[72] = -1595820118;
        el.tib[73] = -1508738924;
        el.tib[74] = -482395776;
        el.tib[75] = 1850252734;
        el.tib[76] = -1457662975;
        el.tib[77] = -337948224;
        el.tib[78] = 603269381;
        el.tib[79] = -614739901;
        el.tib[80] = -1244067447;
        el.tib[81] = 1815696084;
        el.tib[82] = 1771927412;
        el.tib[83] = -1569280859;
        el.tib[84] = -1459016520;
        el.tib[85] = 1281925939;
        el.tib[86] = -1919791630;
        el.tib[87] = -515198256;
        el.tib[88] = -36045064;
        el.tib[89] = 1558010226;
        el.tib[90] = 1063722481;
        el.tib[91] = 1041593167;
        el.tib[92] = -1500568819;
        el.tib[93] = -948053791;
        el.tib[94] = -1269123272;
        el.tib[95] = -1849172207;
        el.tib[96] = 2039187439;
        el.tib[97] = 688302781;
        el.tib[98] = -1841296033;
        el.tib[99] = -2018513653;
    }

    private static /* synthetic */ float tii(int n2) {
        return Float.intBitsToFloat(tia[n2] ^ tib[n2]);
    }
}

