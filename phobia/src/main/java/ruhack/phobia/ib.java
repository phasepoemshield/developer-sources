/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.d;
import ruhack.phobia.hn;
import ruhack.phobia.hu;
import ruhack.phobia.hv$AttackPerpetratorConfigurable;
import ruhack.phobia.hx;
import ruhack.phobia.ov;

public final class ib
extends hx {
    private int lastObservedAttack;
    private static long[] gckm;
    private int lastSwingAttack;
    private static final float ATTACK_SPEED = 130.0f;
    private static final long SNAP_SWING_MS = 240L;
    private static final long SNAP_WINDOW_MS = 250L;
    static final long ne = 8179585379977475247L;
    private long lastAttackAt;
    private static final long RETURN_DELAY_MS = 435L;
    private static int[] gcju;
    public static final boolean c;
    private static long[] gckl;
    private static final long JITTER_DURATION_MS = 500L;
    private static final float RETURN_SPEED = 45.0f;
    private int lastUpdateTick;
    private ov cachedRotation;
    public static final int b;
    private static int[] gcjv;
    public static final boolean a;
    private static final int PRE_AIM_TICKS = 2;

    private static /* synthetic */ double gckk(int n2) {
        return Double.longBitsToDouble(gckl[n2] ^ gckm[n2]);
    }

    private static /* synthetic */ void gcyc() {
        ib.gcju[200] = 438241312;
        ib.gcju[201] = 451684119;
        ib.gcju[202] = -1510483857;
        ib.gcju[203] = 2108378965;
        ib.gcju[204] = -2021984303;
        ib.gcju[205] = -744756046;
        ib.gcju[206] = -379890504;
        ib.gcju[207] = 1016963886;
        ib.gcju[208] = 386322639;
        ib.gcju[209] = -87770473;
        ib.gcju[210] = 446075848;
        ib.gcju[211] = 1804366450;
        ib.gcju[212] = -1357571876;
        ib.gcju[213] = -1985759324;
        ib.gcju[214] = 1147857605;
        ib.gcju[215] = -1595017624;
        ib.gcju[216] = 1088042860;
        ib.gcju[217] = -989128947;
        ib.gcju[218] = -978902830;
        ib.gcju[219] = -736829569;
        ib.gcju[220] = -248084338;
        ib.gcju[221] = -2119371653;
        ib.gcju[222] = 2044213739;
        ib.gcju[223] = 1444806214;
        ib.gcju[224] = -1006637127;
        ib.gcju[225] = 1695170152;
        ib.gcju[226] = 2020561588;
        ib.gcju[227] = -253059444;
        ib.gcju[228] = 959356542;
        ib.gcju[229] = -916674371;
        ib.gcju[230] = -600142226;
        ib.gcju[231] = -1495743660;
        ib.gcju[232] = -1247488483;
        ib.gcju[233] = -709312389;
        ib.gcju[234] = 101871162;
        ib.gcju[235] = -1224793710;
        ib.gcju[236] = -825218680;
        ib.gcju[237] = 1074580640;
        ib.gcju[238] = -280273151;
        ib.gcju[239] = 986736808;
        ib.gcju[240] = -1941973931;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block150: {
            block149: {
                block148: {
                    block147: {
                        block146: {
                            var17_5 = ib.c;
                            var16_6 /* !! */  = ib.b;
                            var15_7 = ib.a;
                            if (var17_5) {
                                throw null;
lbl6:
                                // 43 sources

                                return null;
                            }
                            if (var15_7 || var15_7) ** GOTO lbl6
                            if (ib.mc.field_1724 == null) break block146;
                            if (var15_7) ** GOTO lbl6
                            if (var1_1 != null) break block147;
                            if (var15_7) ** GOTO lbl6
                        }
                        if (var15_7 || var15_7) ** GOTO lbl6
                        return var1_1;
                    }
                    if (var15_7 || var15_7) ** GOTO lbl6
                    if (this.lastUpdateTick != ib.mc.field_1724.field_6012) break block148;
                    if (var15_7) ** GOTO lbl6
                    if (this.cachedRotation == null) break block148;
                    if (var15_7 || var15_7) ** GOTO lbl6
                    return this.cachedRotation;
                }
                if (var15_7 || var15_7) ** GOTO lbl6
                this.lastUpdateTick = ib.mc.field_1724.field_6012;
                if (var15_7 || var15_7) ** GOTO lbl6
                var5_8 = hn.getInstance();
                if (var15_7 || var15_7) ** GOTO lbl6
                var6_9 = this.getAttackHandler();
                if (var15_7 || var15_7) ** GOTO lbl6
                var7_10 = this.observeAttack(var6_9);
                if (var15_7 || var15_7) ** GOTO lbl6
                if (!(var4_4 instanceof class_1309)) break block149;
                if (var15_7) ** GOTO lbl6
                var8_11 /* !! */  = (class_1309)var4_4;
                if (var15_7 || var15_7) ** GOTO lbl6
                if (!var8_11 /* !! */ .method_5805()) break block149;
                if (var15_7) ** GOTO lbl6
                if (!this.canAttack(var5_8, var6_9)) break block149;
                if (var15_7 || var15_7) ** GOTO lbl6
                this.cachedRotation = this.limitStraight(var1_1, var2_2, (float)ib.gcjw("gckh", gckg(int ), (int)9));
                return this.cachedRotation;
            }
            if (var15_7 || var15_7) ** GOTO lbl6
            var8_11 /* !! */  = new ov(ib.mc.field_1724.method_36454(), ib.mc.field_1724.method_36455());
            if (var15_7 || var15_7) ** GOTO lbl6
            var9_12 = this.timeSinceAttack();
            if (var15_7 || var15_7) ** GOTO lbl6
            var11_13 = (float)((double)this.randomLerp((float)ib.gcjw("gcki", gckg(int ), (int)10), (float)ib.gcjw("gckj", gckg(int ), (int)11)) * Math.sin((double)System.currentTimeMillis() / ib.gcjw("gckn", gckk(int ), (int)0)));
            if (var15_7 || var15_7) ** GOTO lbl6
            var12_14 /* !! */  = (float)((double)this.randomLerp((float)ib.gcjw("gcko", gckg(int ), (int)12), (float)ib.gcjw("gckp", gckg(int ), (int)13)) * Math.cos((double)System.currentTimeMillis() / ib.gcjw("gckq", gckk(int ), (int)1)));
            if (var15_7 || var15_7) ** GOTO lbl6
            if (!(var4_4 instanceof class_1309)) break block150;
            if (var15_7) ** GOTO lbl6
            var13_15 = (class_1309)var4_4;
            if (var15_7 || var15_7) ** GOTO lbl6
            if (var13_15.method_5805()) ** GOTO lbl71
            if (var15_7) ** GOTO lbl6
        }
        if (var15_7) ** GOTO lbl6
        if (var16_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var16_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var15_7) ** GOTO lbl6
                if (var9_12 < ib.gcjw("gcks", gckr(int ), (int)2)) ** GOTO lbl71
                if (var15_7 || var15_7) ** GOTO lbl6
                var11_13 = 0.0f;
                if (var15_7 || var15_7) ** GOTO lbl6
                var12_14 /* !! */  = 0.0f;
                if (var15_7) ** GOTO lbl6
lbl71:
                // 3 sources

                if (var15_7 || var15_7) ** GOTO lbl6
                if (var9_12 < ib.gcjw("gckt", gckr(int ), (int)3)) ** GOTO lbl78
                if (var15_7) ** GOTO lbl6
                v0 /* !! */  = ib.gcjw("gcku", gckg(int ), (int)14);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl80
lbl78:
                // 1 sources

                if (var15_7 || var15_7) ** GOTO lbl6
                v0 /* !! */  = var13_16 /* !! */  = (CallSite)0.0f;
lbl80:
                // 2 sources

                if (var15_7 || var15_7) ** GOTO lbl6
                var14_17 = this.limitStraight(var1_1, (ov)var8_11 /* !! */ , (float)var13_16 /* !! */ );
                if (var15_7 || var15_7) ** GOTO lbl6
                if (var7_10 <= 0) ** GOTO lbl99
                if (var15_7) ** GOTO lbl6
                if (var7_10 % ib.gcjw("gckv", gcjt(int ), (int)15) != 0) ** GOTO lbl99
                if (var15_7) ** GOTO lbl6
                if (var9_12 >= ib.gcjw("gckw", gckr(int ), (int)4)) ** GOTO lbl99
                if (var15_7 || var15_7) ** GOTO lbl6
                var12_14 /* !! */  = (float)ib.gcjw("gckx", gckg(int ), (int)16);
                if (var15_7 || var15_7) ** GOTO lbl6
                if (var9_12 < ib.gcjw("gcky", gckr(int ), (int)5)) ** GOTO lbl99
                if (var15_7) ** GOTO lbl6
                if (this.lastSwingAttack == var7_10) ** GOTO lbl99
                if (var15_7 || var15_7) ** GOTO lbl6
                ib.mc.field_1724.method_6104(class_1268.field_5808);
                if (var15_7 || var15_7) ** GOTO lbl6
                this.lastSwingAttack = var7_10;
                if (var15_7) ** GOTO lbl6
lbl99:
                // 6 sources

                if (!var15_7 && !var15_7) ** break;
                ** continue;
                this.cachedRotation = new ov(var14_17.getYaw() + var11_13, class_3532.method_15363((float)(var14_17.getPitch() + var12_14 /* !! */ ), (float)ib.gcjw("gckz", gckg(int ), (int)17), (float)ib.gcjw("gcla", gckg(int ), (int)18)));
                return this.cachedRotation;
            }
lbl103:
            // 2 sources

            case 0: {
                var16_6 /* !! */  = (int)ib.gcjw("gclb", gcjt(int ), (int)19);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl133
            }
            case 1: {
                var16_6 /* !! */  = (int)ib.gcjw("gclc", gcjt(int ), (int)20);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl383
            }
lbl113:
            // 3 sources

            case 2: {
                var16_6 /* !! */  = (int)ib.gcjw("gcld", gcjt(int ), (int)21);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl255
            }
            case 3: {
                var16_6 /* !! */  = (int)ib.gcjw("gcle", gcjt(int ), (int)22);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl366
            }
            case 4: {
                var16_6 /* !! */  = (int)ib.gcjw("gclf", gcjt(int ), (int)23);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl128:
            // 2 sources

            case 5: {
                var16_6 /* !! */  = (int)ib.gcjw("gclg", gcjt(int ), (int)24);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl433
            }
lbl133:
            // 2 sources

            case 6: {
                var16_6 /* !! */  = (int)ib.gcjw("gclh", gcjt(int ), (int)25);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl310
            }
lbl138:
            // 2 sources

            case 7: {
                var16_6 /* !! */  = (int)ib.gcjw("gcli", gcjt(int ), (int)26);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl396
            }
            case 8: {
                var16_6 /* !! */  = (int)ib.gcjw("gclj", gcjt(int ), (int)27);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl396
            }
lbl148:
            // 3 sources

            case 9: {
                var16_6 /* !! */  = (int)ib.gcjw("gclk", gcjt(int ), (int)28);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl218
            }
lbl153:
            // 2 sources

            case 10: {
                var16_6 /* !! */  = (int)ib.gcjw("gcll", gcjt(int ), (int)29);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl341
            }
            case 11: {
                var16_6 /* !! */  = (int)ib.gcjw("gclm", gcjt(int ), (int)30);
                if (!var17_5) ** GOTO lbl148
                throw null;
            }
            case 12: {
                var16_6 /* !! */  = (int)ib.gcjw("gcln", gcjt(int ), (int)31);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl167:
            // 2 sources

            case 13: {
                var16_6 /* !! */  = (int)ib.gcjw("gclo", gcjt(int ), (int)32);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl172:
            // 4 sources

            case 14: {
                var16_6 /* !! */  = (int)ib.gcjw("gclp", gcjt(int ), (int)33);
                if (!var17_5) ** GOTO lbl138
                throw null;
            }
            case 15: {
                var16_6 /* !! */  = (int)ib.gcjw("gclq", gcjt(int ), (int)34);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl181:
            // 3 sources

            case 16: {
                var16_6 /* !! */  = (int)ib.gcjw("gclr", gcjt(int ), (int)35);
                if (!var17_5) ** GOTO lbl128
                throw null;
            }
lbl185:
            // 2 sources

            case 17: {
                var16_6 /* !! */  = (int)ib.gcjw("gcls", gcjt(int ), (int)36);
                if (!var17_5) ** GOTO lbl148
                throw null;
            }
lbl189:
            // 2 sources

            case 18: {
                var16_6 /* !! */  = (int)ib.gcjw("gclt", gcjt(int ), (int)37);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl194:
            // 3 sources

            case 19: {
                var16_6 /* !! */  = (int)ib.gcjw("gclu", gcjt(int ), (int)38);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 20: {
                var16_6 /* !! */  = (int)ib.gcjw("gclv", gcjt(int ), (int)39);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl404
            }
lbl204:
            // 2 sources

            case 21: {
                var16_6 /* !! */  = (int)ib.gcjw("gclw", gcjt(int ), (int)40);
                if (var17_5) {
                    throw null;
                }
            }
lbl208:
            // 4 sources

            case 22: {
                var16_6 /* !! */  = (int)ib.gcjw("gclx", gcjt(int ), (int)41);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl213:
            // 2 sources

            case 23: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var16_6 /* !! */  = (int)ib.gcjw("gcly", gcjt(int ), (int)42);
                    if (!var17_5) ** GOTO lbl208
                    throw null;
                }
            }
lbl218:
            // 3 sources

            case 24: {
                var16_6 /* !! */  = (int)ib.gcjw("gclz", gcjt(int ), (int)43);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 25: {
                var16_6 /* !! */  = (int)ib.gcjw("gcma", gcjt(int ), (int)44);
                if (!var17_5) ** GOTO lbl113
                throw null;
            }
            case 26: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmb", gcjt(int ), (int)45);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl232:
            // 2 sources

            case 27: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmc", gcjt(int ), (int)46);
                if (!var17_5) ** GOTO lbl167
                throw null;
            }
lbl236:
            // 4 sources

            case 28: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmd", gcjt(int ), (int)47);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl404
            }
lbl241:
            // 2 sources

            case 29: {
                var16_6 /* !! */  = (int)ib.gcjw("gcme", gcjt(int ), (int)48);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl291
            }
            case 30: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmf", gcjt(int ), (int)49);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl251:
            // 2 sources

            case 31: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmg", gcjt(int ), (int)50);
                if (!var17_5) ** GOTO lbl241
                throw null;
            }
lbl255:
            // 2 sources

            case 32: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmh", gcjt(int ), (int)51);
                if (!var17_5) ** GOTO lbl204
                throw null;
            }
lbl259:
            // 2 sources

            case 33: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmi", gcjt(int ), (int)52);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl366
            }
lbl264:
            // 2 sources

            case 34: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmj", gcjt(int ), (int)53);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl291
            }
lbl269:
            // 2 sources

            case 35: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmk", gcjt(int ), (int)54);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl375
            }
lbl274:
            // 2 sources

            case 36: {
                var16_6 /* !! */  = (int)ib.gcjw("gcml", gcjt(int ), (int)55);
                if (!var17_5) ** GOTO lbl172
                throw null;
            }
lbl278:
            // 3 sources

            case 37: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmm", gcjt(int ), (int)56);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl349
            }
lbl283:
            // 5 sources

            case 38: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmn", gcjt(int ), (int)57);
                if (!var17_5) ** GOTO lbl218
                throw null;
            }
            case 39: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmo", gcjt(int ), (int)58);
                if (!var17_5) ** GOTO lbl269
                throw null;
            }
lbl291:
            // 3 sources

            case 40: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmp", gcjt(int ), (int)59);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl404
            }
lbl296:
            // 3 sources

            case 41: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmq", gcjt(int ), (int)60);
                if (!var17_5) ** GOTO lbl274
                throw null;
            }
            case 42: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmr", gcjt(int ), (int)61);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl413
            }
            case 43: {
                var16_6 /* !! */  = (int)ib.gcjw("gcms", gcjt(int ), (int)62);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl433
            }
lbl310:
            // 2 sources

            case 44: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmt", gcjt(int ), (int)63);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 45: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmu", gcjt(int ), (int)64);
                if (!var17_5) ** GOTO lbl194
                throw null;
            }
lbl319:
            // 4 sources

            case 46: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmv", gcjt(int ), (int)65);
                if (!var17_5) ** GOTO lbl296
                throw null;
            }
lbl323:
            // 2 sources

            case 47: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmw", gcjt(int ), (int)66);
                if (!var17_5) ** GOTO lbl236
                throw null;
            }
            case 48: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmx", gcjt(int ), (int)67);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl425
            }
            case 49: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmy", gcjt(int ), (int)68);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl349
            }
            case 50: {
                var16_6 /* !! */  = (int)ib.gcjw("gcmz", gcjt(int ), (int)69);
                if (!var17_5) ** GOTO lbl264
                throw null;
            }
lbl341:
            // 2 sources

            case 51: {
                var16_6 /* !! */  = (int)ib.gcjw("gcna", gcjt(int ), (int)70);
                if (!var17_5) ** GOTO lbl172
                throw null;
            }
            case 52: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnb", gcjt(int ), (int)71);
                if (!var17_5) ** GOTO lbl236
                throw null;
            }
lbl349:
            // 3 sources

            case 53: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnc", gcjt(int ), (int)72);
                if (!var17_5) ** GOTO lbl213
                throw null;
            }
lbl353:
            // 2 sources

            case 54: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnd", gcjt(int ), (int)73);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl433
            }
            case 55: {
                var16_6 /* !! */  = (int)ib.gcjw("gcne", gcjt(int ), (int)74);
                if (!var17_5) ** GOTO lbl185
                throw null;
            }
lbl362:
            // 2 sources

            case 56: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnf", gcjt(int ), (int)75);
                if (!var17_5) ** GOTO lbl283
                throw null;
            }
lbl366:
            // 3 sources

            case 57: {
                var16_6 /* !! */  = (int)ib.gcjw("gcng", gcjt(int ), (int)76);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl400
            }
            case 58: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnh", gcjt(int ), (int)77);
                if (!var17_5) ** GOTO lbl153
                throw null;
            }
lbl375:
            // 2 sources

            case 59: {
                var16_6 /* !! */  = (int)ib.gcjw("gcni", gcjt(int ), (int)78);
                if (!var17_5) ** GOTO lbl103
                throw null;
            }
            case 60: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnj", gcjt(int ), (int)79);
                if (!var17_5) ** GOTO lbl113
                throw null;
            }
lbl383:
            // 2 sources

            case 61: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnk", gcjt(int ), (int)80);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl425
            }
            case 62: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnl", gcjt(int ), (int)81);
                if (!var17_5) ** GOTO lbl362
                throw null;
            }
            case 63: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnm", gcjt(int ), (int)82);
                if (!var17_5) ** GOTO lbl319
                throw null;
            }
lbl396:
            // 3 sources

            case 64: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnn", gcjt(int ), (int)83);
                if (!var17_5) ** GOTO lbl172
                throw null;
            }
lbl400:
            // 2 sources

            case 65: {
                var16_6 /* !! */  = (int)ib.gcjw("gcno", gcjt(int ), (int)84);
                if (!var17_5) ** GOTO lbl189
                throw null;
            }
lbl404:
            // 4 sources

            case 66: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnp", gcjt(int ), (int)85);
                if (!var17_5) ** GOTO lbl181
                throw null;
            }
lbl408:
            // 2 sources

            case 67: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnq", gcjt(int ), (int)86);
                if (var17_5) {
                    throw null;
                }
                ** GOTO lbl433
            }
lbl413:
            // 2 sources

            case 68: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnr", gcjt(int ), (int)87);
                if (!var17_5) ** GOTO lbl181
                throw null;
            }
            case 69: {
                var16_6 /* !! */  = (int)ib.gcjw("gcns", gcjt(int ), (int)88);
                if (!var17_5) ** GOTO lbl236
                throw null;
            }
            case 70: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnt", gcjt(int ), (int)89);
                if (!var17_5) ** GOTO lbl408
                throw null;
            }
lbl425:
            // 3 sources

            case 71: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnu", gcjt(int ), (int)90);
                if (!var17_5) ** GOTO lbl283
                throw null;
            }
            case 72: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnv", gcjt(int ), (int)91);
                if (!var17_5) ** GOTO lbl194
                throw null;
            }
lbl433:
            // 5 sources

            case 73: {
                var16_6 /* !! */  = (int)ib.gcjw("gcnw", gcjt(int ), (int)92);
                if (!var17_5) ** GOTO lbl251
                throw null;
            }
            case 74: 
        }
        var16_6 /* !! */  = (int)ib.gcjw("gcnx", gcjt(int ), (int)93);
        ** while (!var17_5)
lbl440:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gcyb() {
        ib.gcju[100] = -1948317141;
        ib.gcju[101] = -795150237;
        ib.gcju[102] = -578181621;
        ib.gcju[103] = -1436293237;
        ib.gcju[104] = 668267040;
        ib.gcju[105] = 608649489;
        ib.gcju[106] = 1699523413;
        ib.gcju[107] = -1200769585;
        ib.gcju[108] = 1455987243;
        ib.gcju[109] = 256698137;
        ib.gcju[110] = -450006779;
        ib.gcju[111] = -1357687162;
        ib.gcju[112] = 1919817323;
        ib.gcju[113] = 2072682180;
        ib.gcju[114] = -930940931;
        ib.gcju[115] = 877367143;
        ib.gcju[116] = -558260194;
        ib.gcju[117] = 1240762963;
        ib.gcju[118] = -2084702091;
        ib.gcju[119] = -1309173442;
        ib.gcju[120] = 2111675459;
        ib.gcju[121] = 2057961954;
        ib.gcju[122] = 1957635694;
        ib.gcju[123] = -1945109906;
        ib.gcju[124] = 392551623;
        ib.gcju[125] = 1163665622;
        ib.gcju[126] = 1246590516;
        ib.gcju[127] = -345810692;
        ib.gcju[128] = 1799928164;
        ib.gcju[129] = -1444226607;
        ib.gcju[130] = 1065854547;
        ib.gcju[131] = 848765555;
        ib.gcju[132] = -659350692;
        ib.gcju[133] = -903132415;
        ib.gcju[134] = 652025514;
        ib.gcju[135] = -1909387269;
        ib.gcju[136] = -746213200;
        ib.gcju[137] = 1841909057;
        ib.gcju[138] = -1698288465;
        ib.gcju[139] = -2042216366;
        ib.gcju[140] = -633333186;
        ib.gcju[141] = 1983000977;
        ib.gcju[142] = -1661262069;
        ib.gcju[143] = -1330389607;
        ib.gcju[144] = 961700551;
        ib.gcju[145] = -1892992497;
        ib.gcju[146] = -28549788;
        ib.gcju[147] = -1089596288;
        ib.gcju[148] = 1434458898;
        ib.gcju[149] = -1238622836;
        ib.gcju[150] = -625098380;
        ib.gcju[151] = -890158596;
        ib.gcju[152] = -1270888343;
        ib.gcju[153] = -443471974;
        ib.gcju[154] = -980084487;
        ib.gcju[155] = -1732888318;
        ib.gcju[156] = -1367073828;
        ib.gcju[157] = 70712331;
        ib.gcju[158] = -1966023879;
        ib.gcju[159] = 155136890;
        ib.gcju[160] = 130960382;
        ib.gcju[161] = -1597117120;
        ib.gcju[162] = -265303786;
        ib.gcju[163] = -1625021159;
        ib.gcju[164] = -411115506;
        ib.gcju[165] = 495557625;
        ib.gcju[166] = 2005413925;
        ib.gcju[167] = 274809149;
        ib.gcju[168] = 104093158;
        ib.gcju[169] = -177285567;
        ib.gcju[170] = 445792962;
        ib.gcju[171] = 1568384843;
        ib.gcju[172] = -2068054638;
        ib.gcju[173] = 346034100;
        ib.gcju[174] = -1580650325;
        ib.gcju[175] = 487549915;
        ib.gcju[176] = 1524248372;
        ib.gcju[177] = 91276928;
        ib.gcju[178] = -2077834404;
        ib.gcju[179] = -902205618;
        ib.gcju[180] = 148717615;
        ib.gcju[181] = -1749456316;
        ib.gcju[182] = 1869972381;
        ib.gcju[183] = 880982287;
        ib.gcju[184] = 1749080365;
        ib.gcju[185] = -1922394169;
        ib.gcju[186] = -1138594601;
        ib.gcju[187] = 90745001;
        ib.gcju[188] = 1800960184;
        ib.gcju[189] = -1219387114;
        ib.gcju[190] = -351718836;
        ib.gcju[191] = -402075875;
        ib.gcju[192] = 1240940889;
        ib.gcju[193] = -578452597;
        ib.gcju[194] = 1199196019;
        ib.gcju[195] = -1921576439;
        ib.gcju[196] = 511380823;
        ib.gcju[197] = 1373207740;
        ib.gcju[198] = -1357248985;
        ib.gcju[199] = -1296033192;
    }

    private static /* synthetic */ float gckg(int n2) {
        return Float.intBitsToFloat(gcju[n2] ^ gcjv[n2]);
    }

    public static /* synthetic */ CallSite gcjw(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean canAttack(hn hn2, hu hu2) {
        CallSite callSite;
        Object object = ne;
        boolean bl2 = true;
        block33: while (true) {
            CallSite callSite2;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite2 - ib.gcjw("gcrq", gckr(int ), (int)51);
            }
            switch ((int)object) {
                case -678873937: {
                    break block33;
                }
                case 102122319: {
                    callSite2 = ib.gcjw("gcrr", gckr(int ), (int)52);
                    continue block33;
                }
                case 335764549: {
                    callSite2 = ib.gcjw("gcrs", gckr(int ), (int)53);
                    continue block33;
                }
                case 908165042: {
                    callSite2 = ib.gcjw("gcrt", gckr(int ), (int)54);
                    continue block33;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = ne;
        boolean bl4 = true;
        block34: while (true) {
            CallSite callSite3;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite3 - ib.gcjw("gcru", gckr(int ), (int)55);
            }
            switch ((int)object2) {
                case -1941421379: {
                    callSite3 = ib.gcjw("gcrv", gckr(int ), (int)56);
                    continue block34;
                }
                case -678873937: {
                    break block34;
                }
                case -1640919: {
                    callSite3 = ib.gcjw("gcrw", gckr(int ), (int)57);
                    continue block34;
                }
                case 2125271279: {
                    callSite3 = ib.gcjw("gcrx", gckr(int ), (int)58);
                    continue block34;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = ne;
        boolean bl5 = true;
        block35: while (true) {
            CallSite callSite4;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite4 - ib.gcjw("gcry", gckr(int ), (int)59);
            }
            switch ((int)object3) {
                case -741327680: {
                    callSite4 = ib.gcjw("gcrz", gckr(int ), (int)60);
                    continue block35;
                }
                case -678873937: {
                    break block35;
                }
                case -322174025: {
                    callSite4 = ib.gcjw("gcsa", gckr(int ), (int)61);
                    continue block35;
                }
            }
            break;
        }
        boolean bl6 = a;
        if (bl3) {
            throw null;
        }
        if (bl6 || bl6) return (boolean)ib.gcjw("gcsb", gcjt(int ), (int)145);
        if (hn2 != null) {
            if (bl6) return (boolean)ib.gcjw("gcsb", gcjt(int ), (int)145);
            if (hu2 != null) {
                if (bl6) return (boolean)ib.gcjw("gcsb", gcjt(int ), (int)145);
                Object object4 = ne;
                boolean bl7 = true;
                block36: while (true) {
                    CallSite callSite5;
                    if (!bl7 || (bl7 = false) || !true) {
                        object4 = callSite5 - ib.gcjw("gcsc", gckr(int ), (int)62);
                    }
                    switch ((int)object4) {
                        case -678873937: {
                            break block36;
                        }
                        case -237548491: {
                            callSite5 = ib.gcjw("gcsd", gckr(int ), (int)63);
                            continue block36;
                        }
                        case 1160652430: {
                            callSite5 = ib.gcjw("gcse", gckr(int ), (int)64);
                            continue block36;
                        }
                        case 1505922540: {
                            callSite5 = ib.gcjw("gcsf", gckr(int ), (int)65);
                            continue block36;
                        }
                    }
                    break;
                }
                if (hn2.getTarget() != null) {
                    if (bl6) return (boolean)ib.gcjw("gcsb", gcjt(int ), (int)145);
                    Object object5 = ne;
                    boolean bl8 = true;
                    block37: while (true) {
                        CallSite callSite6;
                        if (!bl8 || (bl8 = false) || !true) {
                            object5 = callSite6 - ib.gcjw("gcsg", gckr(int ), (int)66);
                        }
                        switch ((int)object5) {
                            case -1448332657: {
                                callSite6 = ib.gcjw("gcsh", gckr(int ), (int)67);
                                continue block37;
                            }
                            case -678873937: {
                                break block37;
                            }
                            case -150822900: {
                                callSite6 = ib.gcjw("gcsi", gckr(int ), (int)68);
                                continue block37;
                            }
                            case 1157714152: {
                                callSite6 = ib.gcjw("gcsj", gckr(int ), (int)69);
                                continue block37;
                            }
                        }
                        break;
                    }
                    hv$AttackPerpetratorConfigurable hv$AttackPerpetratorConfigurable = hn2.getConfig();
                    CallSite callSite7 = ib.gcjw("gcsk", gcjt(int ), (int)146);
                    Object object6 = ne;
                    block38: while (true) {
                        switch ((int)object6) {
                            case -678873937: {
                                break block38;
                            }
                            case 2139579125: {
                                object6 = ib.gcjw("gcsm", gckr(int ), (int)71) - ib.gcjw("gcsl", gckr(int ), (int)70);
                                continue block38;
                            }
                        }
                        break;
                    }
                    if (hu2.canAttack(hv$AttackPerpetratorConfigurable, (int)callSite7)) {
                        if (bl6) return (boolean)ib.gcjw("gcsb", gcjt(int ), (int)145);
                        callSite = ib.gcjw("gcsn", gcjt(int ), (int)147);
                        if (!bl3) return (boolean)callSite;
                        throw null;
                    }
                }
            }
        }
        if (bl6 || bl6) {
            return (boolean)ib.gcjw("gcsb", gcjt(int ), (int)145);
        }
        callSite = ib.gcjw("gcso", gcjt(int ), (int)148);
        return (boolean)callSite;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        v0 /* !! */  = ib.ne;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - ib.gcjw("gcxk", gckr(int ), (int)111));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1099985113: {
                    v1 = ib.gcjw("gcxl", gckr(int ), (int)112);
                    continue block21;
                }
                case -678873937: {
                    break block21;
                }
                case 596343000: {
                    v1 = ib.gcjw("gcxm", gckr(int ), (int)113);
                    continue block21;
                }
                case 2096799137: {
                    v1 = ib.gcjw("gcxn", gckr(int ), (int)114);
                    continue block21;
                }
            }
            break;
        }
        var3_1 = ib.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ib.ne - ib.gcjw("gcxo", gckr(int ), (int)115)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ib.gcjw("gcxp", gcjt(int ), (int)235)) break;
            v2 /* !! */  = (long)ib.gcjw("gcxq", gcjt(int ), (int)236);
        }
        var2_2 /* !! */  = ib.b;
        v3 /* !! */  = ib.ne;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(v4 - ib.gcjw("gcxr", gckr(int ), (int)116));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -678873937: {
                    break block23;
                }
                case -547030912: {
                    v4 = ib.gcjw("gcxs", gckr(int ), (int)117);
                    continue block23;
                }
                case 1713884519: {
                    v4 = ib.gcjw("gcxt", gckr(int ), (int)118);
                    continue block23;
                }
            }
            break;
        }
        var1_3 = ib.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v5 /* !! */  = ib.ne;
                if (true) ** GOTO lbl52
                block25: while (true) {
                    v5 /* !! */  = (long)(ib.gcjw("gcxv", gckr(int ), (int)120) - ib.gcjw("gcxu", gckr(int ), (int)119));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1776652220: {
                            continue block25;
                        }
                        case -678873937: {
                            break block25;
                        }
                    }
                    break;
                }
                return class_243.field_1353;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ib.gcjw("gcxw", gcjt(int ), (int)237);
                    if (!var3_1) break block11;
                    throw null;
                }
            }
lbl63:
            // 2 sources

            case 1: {
                do {
                    var2_2 /* !! */  = (int)ib.gcjw("gcxx", gcjt(int ), (int)238);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxy", gcjt(int ), (int)239);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ib.gcjw("gcxz", gcjt(int ), (int)240);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gcyh() {
        ib.gckl[100] = 6390335015192889759L;
        ib.gckl[101] = -5402190063085274812L;
        ib.gckl[102] = -3844347291189540547L;
        ib.gckl[103] = 2928250630283730255L;
        ib.gckl[104] = -3003309765353079385L;
        ib.gckl[105] = -2348081080116553611L;
        ib.gckl[106] = -517543288170056058L;
        ib.gckl[107] = 4745104793969314778L;
        ib.gckl[108] = 3447790305670186315L;
        ib.gckl[109] = -1864124278227768698L;
        ib.gckl[110] = 5387122641812943082L;
        ib.gckl[111] = -3833290756784678445L;
        ib.gckl[112] = 4307363732402342423L;
        ib.gckl[113] = -5437992182860666605L;
        ib.gckl[114] = 5784388080402836127L;
        ib.gckl[115] = 6297057417621008602L;
        ib.gckl[116] = 9123500525848308227L;
        ib.gckl[117] = -7391000292149949116L;
        ib.gckl[118] = 8287073161949890381L;
        ib.gckl[119] = -4802358623630270104L;
        ib.gckl[120] = -3175442236868207461L;
    }

    private static /* synthetic */ void gcyf() {
        ib.gcjv[200] = 438241313;
        ib.gcjv[201] = 451684118;
        ib.gcjv[202] = -1925839752;
        ib.gcjv[203] = 1120900757;
        ib.gcjv[204] = -2021984304;
        ib.gcjv[205] = 918701220;
        ib.gcjv[206] = -379890502;
        ib.gcjv[207] = 1016963886;
        ib.gcjv[208] = 386322637;
        ib.gcjv[209] = -87770476;
        ib.gcjv[210] = 446075849;
        ib.gcjv[211] = -1857603401;
        ib.gcjv[212] = -1357571875;
        ib.gcjv[213] = 1722978850;
        ib.gcjv[214] = -1147857606;
        ib.gcjv[215] = 1595017623;
        ib.gcjv[216] = -1059440788;
        ib.gcjv[217] = -989128948;
        ib.gcjv[218] = 593502298;
        ib.gcjv[219] = -736829570;
        ib.gcjv[220] = 253693405;
        ib.gcjv[221] = -2119371651;
        ib.gcjv[222] = 2044213736;
        ib.gcjv[223] = 1444806214;
        ib.gcjv[224] = -1006637125;
        ib.gcjv[225] = 1695170145;
        ib.gcjv[226] = 2020561592;
        ib.gcjv[227] = -253059441;
        ib.gcjv[228] = 959356532;
        ib.gcjv[229] = -916674375;
        ib.gcjv[230] = -600142228;
        ib.gcjv[231] = -1495743659;
        ib.gcjv[232] = -1247488483;
        ib.gcjv[233] = -709312389;
        ib.gcjv[234] = 101871155;
        ib.gcjv[235] = -1224793709;
        ib.gcjv[236] = 1135982459;
        ib.gcjv[237] = 1074580640;
        ib.gcjv[238] = -280273150;
        ib.gcjv[239] = 986736811;
        ib.gcjv[240] = -1941973929;
    }

    private static /* synthetic */ void gcyd() {
        ib.gcjv[0] = -1988866312;
        ib.gcjv[1] = 550496572;
        ib.gcjv[2] = 317746546;
        ib.gcjv[3] = -1593964929;
        ib.gcjv[4] = 996800627;
        ib.gcjv[5] = 1585556617;
        ib.gcjv[6] = -906170217;
        ib.gcjv[7] = -310449552;
        ib.gcjv[8] = -218423029;
        ib.gcjv[9] = -1924568111;
        ib.gcjv[10] = 643142482;
        ib.gcjv[11] = 626060106;
        ib.gcjv[12] = -752053254;
        ib.gcjv[13] = 1662254716;
        ib.gcjv[14] = -1675799450;
        ib.gcjv[15] = 354769468;
        ib.gcjv[16] = 1945569052;
        ib.gcjv[17] = 778214377;
        ib.gcjv[18] = 179587691;
        ib.gcjv[19] = -640002499;
        ib.gcjv[20] = -1715805704;
        ib.gcjv[21] = 834547620;
        ib.gcjv[22] = 247595336;
        ib.gcjv[23] = -219263256;
        ib.gcjv[24] = 1673927688;
        ib.gcjv[25] = -1684129233;
        ib.gcjv[26] = -1147837538;
        ib.gcjv[27] = -1582524996;
        ib.gcjv[28] = -1460174269;
        ib.gcjv[29] = 48242808;
        ib.gcjv[30] = -2111541866;
        ib.gcjv[31] = -1284217611;
        ib.gcjv[32] = -1191799851;
        ib.gcjv[33] = -1908103416;
        ib.gcjv[34] = -1512079591;
        ib.gcjv[35] = 1981491500;
        ib.gcjv[36] = -1801765819;
        ib.gcjv[37] = -1103705517;
        ib.gcjv[38] = 304541586;
        ib.gcjv[39] = 1852736456;
        ib.gcjv[40] = 1282217686;
        ib.gcjv[41] = -675854255;
        ib.gcjv[42] = -1432380936;
        ib.gcjv[43] = 229605556;
        ib.gcjv[44] = -1840708560;
        ib.gcjv[45] = -679563444;
        ib.gcjv[46] = -311057141;
        ib.gcjv[47] = 1587475282;
        ib.gcjv[48] = -870844864;
        ib.gcjv[49] = 1395721723;
        ib.gcjv[50] = -1983050787;
        ib.gcjv[51] = 2143170223;
        ib.gcjv[52] = 785127003;
        ib.gcjv[53] = -929341232;
        ib.gcjv[54] = -225203565;
        ib.gcjv[55] = -1696166665;
        ib.gcjv[56] = -997742167;
        ib.gcjv[57] = 1906636942;
        ib.gcjv[58] = 1591792492;
        ib.gcjv[59] = -980583894;
        ib.gcjv[60] = 19093440;
        ib.gcjv[61] = 2082641437;
        ib.gcjv[62] = -1052069886;
        ib.gcjv[63] = -1473120753;
        ib.gcjv[64] = -746604657;
        ib.gcjv[65] = 1213491105;
        ib.gcjv[66] = 928641744;
        ib.gcjv[67] = 30130537;
        ib.gcjv[68] = 1114130045;
        ib.gcjv[69] = 751014600;
        ib.gcjv[70] = 1036557555;
        ib.gcjv[71] = -1797019032;
        ib.gcjv[72] = 1200369105;
        ib.gcjv[73] = -474605469;
        ib.gcjv[74] = -1916740556;
        ib.gcjv[75] = -92296094;
        ib.gcjv[76] = 343112275;
        ib.gcjv[77] = -1161503432;
        ib.gcjv[78] = 656229702;
        ib.gcjv[79] = 1652872898;
        ib.gcjv[80] = 1922935348;
        ib.gcjv[81] = 2039016469;
        ib.gcjv[82] = 1945890379;
        ib.gcjv[83] = -857985216;
        ib.gcjv[84] = -614419158;
        ib.gcjv[85] = -1508752088;
        ib.gcjv[86] = 654978460;
        ib.gcjv[87] = -1849228462;
        ib.gcjv[88] = -202509601;
        ib.gcjv[89] = -701772146;
        ib.gcjv[90] = 458953;
        ib.gcjv[91] = -1516086047;
        ib.gcjv[92] = -1336638581;
        ib.gcjv[93] = 1888827945;
        ib.gcjv[94] = -618990462;
        ib.gcjv[95] = -1682050017;
        ib.gcjv[96] = 1790094189;
        ib.gcjv[97] = -803079915;
        ib.gcjv[98] = -347455703;
        ib.gcjv[99] = -1655539931;
    }

    private static /* synthetic */ long gckr(int n2) {
        return gckl[n2] ^ gckm[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int observeAttack(hu var1_1) {
        block88: {
            block87: {
                block86: {
                    v0 /* !! */  = ib.ne;
                    if (true) ** GOTO lbl5
                    block53: while (true) {
                        v0 /* !! */  = (long)(v1 - ib.gcjw("gcpp", gckr(int ), (int)30));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -1941772769: {
                                v1 = ib.gcjw("gcpq", gckr(int ), (int)31);
                                continue block53;
                            }
                            case -678873937: {
                                break block53;
                            }
                            case 1814829905: {
                                v1 = ib.gcjw("gcpr", gckr(int ), (int)32);
                                continue block53;
                            }
                        }
                        break;
                    }
                    var5_2 = ib.c;
                    v2 /* !! */  = ib.ne;
                    if (true) ** GOTO lbl19
                    block54: while (true) {
                        v2 /* !! */  = (long)(v3 - ib.gcjw("gcps", gckr(int ), (int)33));
lbl19:
                        // 2 sources

                        switch ((int)v2 /* !! */ ) {
                            case -678873937: {
                                break block54;
                            }
                            case 239844378: {
                                v3 = ib.gcjw("gcpt", gckr(int ), (int)34);
                                continue block54;
                            }
                            case 567986369: {
                                v3 = ib.gcjw("gcpu", gckr(int ), (int)35);
                                continue block54;
                            }
                        }
                        break;
                    }
                    var4_3 /* !! */  = ib.b;
                    v4 /* !! */  = ib.ne;
                    if (true) ** GOTO lbl33
                    block55: while (true) {
                        v4 /* !! */  = (long)(v5 - ib.gcjw("gcpv", gckr(int ), (int)36));
lbl33:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -814600926: {
                                v5 = ib.gcjw("gcpw", gckr(int ), (int)37);
                                continue block55;
                            }
                            case -678873937: {
                                break block55;
                            }
                            case 265853984: {
                                v5 = ib.gcjw("gcpx", gckr(int ), (int)38);
                                continue block55;
                            }
                            case 762394122: {
                                v5 = ib.gcjw("gcpy", gckr(int ), (int)39);
                                continue block55;
                            }
                        }
                        break;
                    }
                    var3_4 = ib.a;
                    if (var5_2) {
                        throw null;
lbl48:
                        // 11 sources

                        return (int)ib.gcjw("gcpz", gcjt(int ), (int)113);
                    }
                    if (var3_4 || var3_4) ** GOTO lbl48
                    if (var1_1 != null) break block86;
                    if (var3_4) ** GOTO lbl48
                    v6 /* !! */  = ib.gcjw("gcqa", gcjt(int ), (int)114);
                    if (var5_2) {
                        throw null;
                    }
                    break block87;
                }
                if (var3_4 || var3_4) ** GOTO lbl48
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_0 = ib.ne - ib.gcjw("gcqb", gckr(int ), (int)40)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ib.gcjw("gcqc", gcjt(int ), (int)115)) {
                        v6 /* !! */  = (CallSite)var1_1.getCount();
                        break;
                    }
                    v7 /* !! */  = (long)ib.gcjw("gcqd", gcjt(int ), (int)116);
                }
            }
            var2_5 = v6 /* !! */ ;
            if (var3_4 || var3_4) ** GOTO lbl48
            v8 /* !! */  = ib.ne;
            if (true) ** GOTO lbl73
            block58: while (true) {
                v8 /* !! */  = (long)(ib.gcjw("gcqf", gckr(int ), (int)42) - ib.gcjw("gcqe", gckr(int ), (int)41));
lbl73:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -678873937: {
                        break block58;
                    }
                    case -524152611: {
                        continue block58;
                    }
                }
                break;
            }
            if (this.lastObservedAttack >= 0) break block88;
            if (var3_4 || var3_4) ** GOTO lbl48
            v9 /* !! */  = ib.ne;
            if (true) ** GOTO lbl84
            block59: while (true) {
                v9 /* !! */  = (long)(v10 - ib.gcjw("gcqg", gckr(int ), (int)43));
lbl84:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1760316041: {
                        v10 = ib.gcjw("gcqh", gckr(int ), (int)44);
                        continue block59;
                    }
                    case -927524097: {
                        v10 = ib.gcjw("gcqi", gckr(int ), (int)45);
                        continue block59;
                    }
                    case -678873937: {
                        break block59;
                    }
                }
                break;
            }
            this.lastObservedAttack = (int)var2_5;
            if (var3_4) ** GOTO lbl48
            if (var5_2) {
                throw null;
            }
            ** GOTO lbl134
        }
        if (var3_4 || var3_4) ** GOTO lbl48
        v11 /* !! */  = ib.ne;
        if (true) ** GOTO lbl104
        block60: while (true) {
            v11 /* !! */  = (long)(ib.gcjw("gcqk", gckr(int ), (int)47) - ib.gcjw("gcqj", gckr(int ), (int)46));
lbl104:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -678873937: {
                    break block60;
                }
                case -298659824: {
                    continue block60;
                }
            }
            break;
        }
        if (var2_5 == this.lastObservedAttack) ** GOTO lbl134
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl48
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = ib.ne - ib.gcjw("gcql", gckr(int ), (int)48)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ib.gcjw("gcqm", gcjt(int ), (int)117)) break;
                    v12 /* !! */  = (long)ib.gcjw("gcqn", gcjt(int ), (int)118);
                }
                this.lastObservedAttack = (int)var2_5;
                if (var3_4 || var3_4) ** GOTO lbl48
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_2 = ib.ne - ib.gcjw("gcqo", gckr(int ), (int)49)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ib.gcjw("gcqp", gcjt(int ), (int)119)) break;
                    v13 /* !! */  = (long)ib.gcjw("gcqq", gcjt(int ), (int)120);
                }
                v14 = System.currentTimeMillis();
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_3 = ib.ne - ib.gcjw("gcqr", gckr(int ), (int)50)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ib.gcjw("gcqs", gcjt(int ), (int)121)) break;
                    v15 /* !! */  = (long)ib.gcjw("gcqt", gcjt(int ), (int)122);
                }
                this.lastAttackAt = v14;
                if (var3_4) ** GOTO lbl48
lbl134:
                // 3 sources

                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return (int)var2_5;
            }
lbl137:
            // 2 sources

            case 0: {
                var4_3 /* !! */  = (int)ib.gcjw("gcqu", gcjt(int ), (int)123);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl142:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)ib.gcjw("gcqv", gcjt(int ), (int)124);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
            case 2: {
                var4_3 /* !! */  = (int)ib.gcjw("gcqw", gcjt(int ), (int)125);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 3: {
                var4_3 /* !! */  = (int)ib.gcjw("gcqx", gcjt(int ), (int)126);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl157:
            // 4 sources

            case 4: {
                var4_3 /* !! */  = (int)ib.gcjw("gcqy", gcjt(int ), (int)127);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
            case 5: {
                var4_3 /* !! */  = (int)ib.gcjw("gcqz", gcjt(int ), (int)128);
                if (!var5_2) break;
                throw null;
            }
lbl166:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)ib.gcjw("gcra", gcjt(int ), (int)129);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl171:
            // 2 sources

            case 7: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrb", gcjt(int ), (int)130);
                if (var5_2) {
                    throw null;
                }
            }
lbl175:
            // 4 sources

            case 8: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrc", gcjt(int ), (int)131);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl207
            }
            case 9: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrd", gcjt(int ), (int)132);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl185:
            // 3 sources

            case 10: {
                var4_3 /* !! */  = (int)ib.gcjw("gcre", gcjt(int ), (int)133);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl190:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrf", gcjt(int ), (int)134);
                if (!var5_2) ** GOTO lbl185
                throw null;
            }
            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ib.gcjw("gcrg", gcjt(int ), (int)135);
                    if (!var5_2) ** GOTO lbl157
                    throw null;
                }
            }
lbl199:
            // 3 sources

            case 13: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrh", gcjt(int ), (int)136);
                if (!var5_2) break;
                throw null;
            }
            case 14: {
                var4_3 /* !! */  = (int)ib.gcjw("gcri", gcjt(int ), (int)137);
                if (!var5_2) ** GOTO lbl199
                throw null;
            }
lbl207:
            // 2 sources

            case 15: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrj", gcjt(int ), (int)138);
                if (!var5_2) ** GOTO lbl142
                throw null;
            }
lbl211:
            // 3 sources

            case 16: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrk", gcjt(int ), (int)139);
                if (!var5_2) ** GOTO lbl142
                throw null;
            }
            case 17: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrl", gcjt(int ), (int)140);
                if (!var5_2) ** GOTO lbl211
                throw null;
            }
lbl219:
            // 2 sources

            case 18: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrm", gcjt(int ), (int)141);
                if (!var5_2) ** GOTO lbl137
                throw null;
            }
            case 19: {
                var4_3 /* !! */  = (int)ib.gcjw("gcrn", gcjt(int ), (int)142);
                if (!var5_2) ** GOTO lbl171
                throw null;
            }
            case 20: {
                var4_3 /* !! */  = (int)ib.gcjw("gcro", gcjt(int ), (int)143);
                if (!var5_2) ** GOTO lbl157
                throw null;
            }
            case 21: 
        }
        var4_3 /* !! */  = (int)ib.gcjw("gcrp", gcjt(int ), (int)144);
        ** while (!var5_2)
lbl234:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov limitStraight(ov var1_1, ov var2_2, float var3_3) {
        var11_4 = ib.c;
        var10_5 /* !! */  = ib.b;
        var9_6 = ib.a;
        if (var11_4) {
            throw null;
lbl6:
            // 13 sources

            return null;
        }
        if (var9_6) ** GOTO lbl6
        if (var10_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var10_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var9_6) ** GOTO lbl6
                if (var2_2 != null) ** GOTO lbl16
                if (var9_6 || var9_6) ** GOTO lbl6
                return var1_1;
lbl16:
                // 1 sources

                if (var9_6 || var9_6) ** GOTO lbl6
                var4_7 = class_3532.method_15393((float)(var2_2.getYaw() - var1_1.getYaw()));
                if (var9_6 || var9_6) ** GOTO lbl6
                var5_8 = var2_2.getPitch() - var1_1.getPitch();
                if (var9_6 || var9_6) ** GOTO lbl6
                var6_9 = (float)Math.hypot(Math.abs(var4_7), Math.abs(var5_8));
                if (var9_6 || var9_6) ** GOTO lbl6
                if (var6_9 != 0.0f) ** GOTO lbl29
                if (var9_6) ** GOTO lbl6
                v0 = 0.0f;
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl31
lbl29:
                // 1 sources

                if (var9_6 || var9_6) ** GOTO lbl6
                v0 = var7_10 = Math.abs(var4_7 / var6_9) * var3_3;
lbl31:
                // 2 sources

                if (var9_6 || var9_6) ** GOTO lbl6
                if (var6_9 != 0.0f) ** GOTO lbl38
                if (var9_6) ** GOTO lbl6
                v1 = 0.0f;
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl40
lbl38:
                // 1 sources

                if (var9_6 || var9_6) ** GOTO lbl6
                v1 = var8_11 = Math.abs(var5_8 / var6_9) * var3_3;
lbl40:
                // 2 sources

                if (!var9_6 && !var9_6) ** break;
                ** continue;
                return new ov(var1_1.getYaw() + class_3532.method_15363((float)var4_7, (float)(-var7_10), (float)var7_10), var1_1.getPitch() + class_3532.method_15363((float)var5_8, (float)(-var8_11), (float)var8_11));
            }
lbl43:
            // 3 sources

            case 0: {
                var10_5 /* !! */  = (int)ib.gcjw("gcta", gcjt(int ), (int)160);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl58
            }
lbl48:
            // 2 sources

            case 1: {
                var10_5 /* !! */  = (int)ib.gcjw("gctb", gcjt(int ), (int)161);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 2: {
                var10_5 /* !! */  = (int)ib.gcjw("gctc", gcjt(int ), (int)162);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl115
            }
lbl58:
            // 4 sources

            case 3: {
                var10_5 /* !! */  = (int)ib.gcjw("gctd", gcjt(int ), (int)163);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl63:
            // 2 sources

            case 4: {
                do {
                    var10_5 /* !! */  = (int)ib.gcjw("gcte", gcjt(int ), (int)164);
                } while (!var11_4);
                throw null;
            }
lbl68:
            // 4 sources

            case 5: {
                var10_5 /* !! */  = (int)ib.gcjw("gctf", gcjt(int ), (int)165);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl73:
            // 2 sources

            case 6: {
                var10_5 /* !! */  = (int)ib.gcjw("gctg", gcjt(int ), (int)166);
                if (!var11_4) ** GOTO lbl43
                throw null;
            }
            case 7: {
                var10_5 /* !! */  = (int)ib.gcjw("gcth", gcjt(int ), (int)167);
                if (!var11_4) ** GOTO lbl58
                throw null;
            }
            case 8: {
                var10_5 /* !! */  = (int)ib.gcjw("gcti", gcjt(int ), (int)168);
                if (!var11_4) ** GOTO lbl73
                throw null;
            }
lbl85:
            // 2 sources

            case 9: {
                var10_5 /* !! */  = (int)ib.gcjw("gctj", gcjt(int ), (int)169);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl127
            }
lbl90:
            // 2 sources

            case 10: {
                var10_5 /* !! */  = (int)ib.gcjw("gctk", gcjt(int ), (int)170);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 11: {
                do {
                    var10_5 /* !! */  = (int)ib.gcjw("gctl", gcjt(int ), (int)171);
                } while (!var11_4);
                throw null;
            }
lbl100:
            // 2 sources

            case 12: {
                var10_5 /* !! */  = (int)ib.gcjw("gctm", gcjt(int ), (int)172);
                if (var11_4) {
                    throw null;
                }
                ** GOTO lbl135
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var10_5 /* !! */  = (int)ib.gcjw("gctn", gcjt(int ), (int)173);
                    if (!var11_4) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 14: {
                do {
                    var10_5 /* !! */  = (int)ib.gcjw("gcto", gcjt(int ), (int)174);
                } while (!var11_4);
                throw null;
            }
lbl115:
            // 3 sources

            case 15: {
                var10_5 /* !! */  = (int)ib.gcjw("gctp", gcjt(int ), (int)175);
                if (!var11_4) break;
                throw null;
            }
            case 16: {
                var10_5 /* !! */  = (int)ib.gcjw("gctq", gcjt(int ), (int)176);
                if (!var11_4) ** GOTO lbl43
                throw null;
            }
lbl123:
            // 2 sources

            case 17: {
                var10_5 /* !! */  = (int)ib.gcjw("gctr", gcjt(int ), (int)177);
                if (!var11_4) ** GOTO lbl85
                throw null;
            }
lbl127:
            // 2 sources

            case 18: {
                var10_5 /* !! */  = (int)ib.gcjw("gcts", gcjt(int ), (int)178);
                if (!var11_4) ** GOTO lbl58
                throw null;
            }
            case 19: {
                var10_5 /* !! */  = (int)ib.gcjw("gctt", gcjt(int ), (int)179);
                if (!var11_4) ** GOTO lbl48
                throw null;
            }
lbl135:
            // 2 sources

            case 20: {
                var10_5 /* !! */  = (int)ib.gcjw("gctu", gcjt(int ), (int)180);
                if (!var11_4) ** GOTO lbl123
                throw null;
            }
            case 21: {
                var10_5 /* !! */  = (int)ib.gcjw("gctv", gcjt(int ), (int)181);
                if (!var11_4) ** GOTO lbl63
                throw null;
            }
            case 22: {
                var10_5 /* !! */  = (int)ib.gcjw("gctw", gcjt(int ), (int)182);
                if (!var11_4) ** GOTO lbl68
                throw null;
            }
lbl147:
            // 2 sources

            case 23: {
                var10_5 /* !! */  = (int)ib.gcjw("gctx", gcjt(int ), (int)183);
                if (!var11_4) ** GOTO lbl68
                throw null;
            }
            case 24: {
                var10_5 /* !! */  = (int)ib.gcjw("gcty", gcjt(int ), (int)184);
                if (!var11_4) ** GOTO lbl115
                throw null;
            }
            case 25: 
        }
        var10_5 /* !! */  = (int)ib.gcjw("gctz", gcjt(int ), (int)185);
        ** while (!var11_4)
lbl158:
        // 1 sources

        throw null;
    }

    static {
        gcju = new int[241];
        gcjv = new int[241];
        ib.gcya();
        ib.gcyb();
        ib.gcyc();
        ib.gcyd();
        ib.gcye();
        ib.gcyf();
        gckl = new long[121];
        gckm = new long[121];
        ib.gcyg();
        ib.gcyh();
        ib.gcyi();
        ib.gcyj();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private hu getAttackHandler() {
        v0 /* !! */  = ib.ne;
        if (true) ** GOTO lbl5
        block45: while (true) {
            v0 /* !! */  = (long)(v1 - ib.gcjw("gcny", gckr(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1831696365: {
                    v1 = ib.gcjw("gcnz", gckr(int ), (int)7);
                    continue block45;
                }
                case -678873937: {
                    break block45;
                }
                case -175003180: {
                    v1 = ib.gcjw("gcoa", gckr(int ), (int)8);
                    continue block45;
                }
                case 921207212: {
                    v1 = ib.gcjw("gcob", gckr(int ), (int)9);
                    continue block45;
                }
            }
            break;
        }
        var3_1 = ib.c;
        v2 /* !! */  = ib.ne;
        if (true) ** GOTO lbl22
        block46: while (true) {
            v2 /* !! */  = (long)(v3 - ib.gcjw("gcoc", gckr(int ), (int)10));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1541872273: {
                    v3 = ib.gcjw("gcod", gckr(int ), (int)11);
                    continue block46;
                }
                case -1305710016: {
                    v3 = ib.gcjw("gcoe", gckr(int ), (int)12);
                    continue block46;
                }
                case -678873937: {
                    break block46;
                }
                case -232842878: {
                    v3 = ib.gcjw("gcof", gckr(int ), (int)13);
                    continue block46;
                }
            }
            break;
        }
        var2_2 /* !! */  = ib.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ib.ne - ib.gcjw("gcog", gckr(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ib.gcjw("gcoh", gcjt(int ), (int)94)) break;
            v4 /* !! */  = (long)ib.gcjw("gcoi", gcjt(int ), (int)95);
        }
        var1_3 = ib.a;
        if (var3_1) {
            throw null;
lbl43:
            // 6 sources

            return null;
        }
        if (var1_3) ** GOTO lbl43
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl43
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ib.ne - ib.gcjw("gcoj", gckr(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ib.gcjw("gcok", gcjt(int ), (int)96)) break;
                    v5 /* !! */  = (long)ib.gcjw("gcol", gcjt(int ), (int)97);
                }
                if (d.getInstance() == null) ** GOTO lbl82
                if (var1_3) ** GOTO lbl43
                v6 /* !! */  = ib.ne;
                if (true) ** GOTO lbl61
                block50: while (true) {
                    v6 /* !! */  = (long)(ib.gcjw("gcon", gckr(int ), (int)17) - ib.gcjw("gcom", gckr(int ), (int)16));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -678873937: {
                            break block50;
                        }
                        case -195442468: {
                            continue block50;
                        }
                    }
                    break;
                }
                v7 = d.getInstance();
                v8 /* !! */  = ib.ne;
                if (true) ** GOTO lbl71
                block51: while (true) {
                    v8 /* !! */  = (long)(v9 - ib.gcjw("gcoo", gckr(int ), (int)18));
lbl71:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -678873937: {
                            break block51;
                        }
                        case -169083035: {
                            v9 = ib.gcjw("gcop", gckr(int ), (int)19);
                            continue block51;
                        }
                        case -46737425: {
                            v9 = ib.gcjw("gcoq", gckr(int ), (int)20);
                            continue block51;
                        }
                    }
                    break;
                }
                if (v7.getManager() != null) ** GOTO lbl84
                if (var1_3) ** GOTO lbl43
lbl82:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl43
                return null;
lbl84:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = ib.ne - ib.gcjw("gcor", gckr(int ), (int)21)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == ib.gcjw("gcos", gcjt(int ), (int)98)) break;
                    v10 /* !! */  = (long)ib.gcjw("gcot", gcjt(int ), (int)99);
                }
                v11 = d.getInstance();
                v12 /* !! */  = ib.ne;
                if (true) ** GOTO lbl96
                block53: while (true) {
                    v12 /* !! */  = (long)(v13 - ib.gcjw("gcou", gckr(int ), (int)22));
lbl96:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1813916657: {
                            v13 = ib.gcjw("gcov", gckr(int ), (int)23);
                            continue block53;
                        }
                        case -678873937: {
                            break block53;
                        }
                        case 1311482029: {
                            v13 = ib.gcjw("gcow", gckr(int ), (int)24);
                            continue block53;
                        }
                        case 1904955046: {
                            v13 = ib.gcjw("gcox", gckr(int ), (int)25);
                            continue block53;
                        }
                    }
                    break;
                }
                v14 = v11.getManager();
                v15 /* !! */  = ib.ne;
                if (true) ** GOTO lbl113
                block54: while (true) {
                    v15 /* !! */  = (long)(v16 - ib.gcjw("gcoy", gckr(int ), (int)26));
lbl113:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -678873937: {
                            break block54;
                        }
                        case 849343874: {
                            v16 = ib.gcjw("gcoz", gckr(int ), (int)27);
                            continue block54;
                        }
                        case 1624143943: {
                            v16 = ib.gcjw("gcpa", gckr(int ), (int)28);
                            continue block54;
                        }
                    }
                    break;
                }
                v17 = v14.getAttackPerpetrator();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_3 = ib.ne - ib.gcjw("gcpb", gckr(int ), (int)29)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ib.gcjw("gcpc", gcjt(int ), (int)100)) break;
                    v18 /* !! */  = (long)ib.gcjw("gcpd", gcjt(int ), (int)101);
                }
                return v17.getAttackHandler();
            }
lbl129:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ib.gcjw("gcpe", gcjt(int ), (int)102);
                if (!var3_1) break;
                throw null;
            }
lbl133:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ib.gcjw("gcpf", gcjt(int ), (int)103);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl164
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ib.gcjw("gcpg", gcjt(int ), (int)104);
                if (!var3_1) ** GOTO lbl133
                throw null;
            }
lbl143:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ib.gcjw("gcph", gcjt(int ), (int)105);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
lbl147:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ib.gcjw("gcpi", gcjt(int ), (int)106);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl152:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ib.gcjw("gcpj", gcjt(int ), (int)107);
                if (var3_1) {
                    throw null;
                }
            }
lbl156:
            // 4 sources

            case 6: {
                var2_2 /* !! */  = (int)ib.gcjw("gcpk", gcjt(int ), (int)108);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
lbl160:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ib.gcjw("gcpl", gcjt(int ), (int)109);
                if (!var3_1) ** GOTO lbl143
                throw null;
            }
lbl164:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ib.gcjw("gcpm", gcjt(int ), (int)110);
                if (!var3_1) ** GOTO lbl156
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)ib.gcjw("gcpn", gcjt(int ), (int)111);
                if (!var3_1) ** GOTO lbl147
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)ib.gcjw("gcpo", gcjt(int ), (int)112);
        ** while (!var3_1)
lbl175:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private long timeSinceAttack() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ib.ne - ib.gcjw("gcua", gckr(int ), (int)72)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ib.gcjw("gcub", gcjt(int ), (int)186)) break;
            v0 /* !! */  = (long)ib.gcjw("gcuc", gcjt(int ), (int)187);
        }
        var3_1 = ib.c;
        v1 /* !! */  = ib.ne;
        if (true) ** GOTO lbl12
        block30: while (true) {
            v1 /* !! */  = (long)(ib.gcjw("gcue", gckr(int ), (int)74) - ib.gcjw("gcud", gckr(int ), (int)73));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -772863928: {
                    continue block30;
                }
                case -678873937: {
                    break block30;
                }
            }
            break;
        }
        var2_2 /* !! */  = ib.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ib.ne - ib.gcjw("gcuf", gckr(int ), (int)75)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ib.gcjw("gcug", gcjt(int ), (int)188)) break;
                    v2 /* !! */  = (long)ib.gcjw("gcuh", gcjt(int ), (int)189);
                }
                var1_3 = ib.a;
                if (var3_1) {
                    throw null;
lbl30:
                    // 3 sources

                    return (long)ib.gcjw("gcui", gckr(int ), (int)76);
                }
                if (var1_3 || var1_3) ** GOTO lbl30
                v3 /* !! */  = ib.ne;
                if (true) ** GOTO lbl37
                block33: while (true) {
                    v3 /* !! */  = (long)(v4 - ib.gcjw("gcuj", gckr(int ), (int)77));
lbl37:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -678873937: {
                            break block33;
                        }
                        case 386493437: {
                            v4 = ib.gcjw("gcuk", gckr(int ), (int)78);
                            continue block33;
                        }
                        case 607829104: {
                            v4 = ib.gcjw("gcul", gckr(int ), (int)79);
                            continue block33;
                        }
                        case 1340537675: {
                            v4 = ib.gcjw("gcum", gckr(int ), (int)80);
                            continue block33;
                        }
                    }
                    break;
                }
                if (this.lastAttackAt > ib.gcjw("gcun", gckr(int ), (int)81)) ** GOTO lbl55
                if (var1_3 || var1_3) ** GOTO lbl30
                v5 /* !! */  = ib.gcjw("gcuo", gckr(int ), (int)82);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl84
lbl55:
                // 1 sources

                if (var1_3 || var1_3) ** continue;
                v6 = ib.gcjw("gcup", gckr(int ), (int)83);
                v7 /* !! */  = ib.ne;
                if (true) ** GOTO lbl61
                block34: while (true) {
                    v7 /* !! */  = (long)(ib.gcjw("gcur", gckr(int ), (int)85) - ib.gcjw("gcuq", gckr(int ), (int)84));
lbl61:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -678873937: {
                            break block34;
                        }
                        case -384863153: {
                            continue block34;
                        }
                    }
                    break;
                }
                v8 = System.currentTimeMillis();
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = ib.ne - ib.gcjw("gcus", gckr(int ), (int)86)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == ib.gcjw("gcut", gcjt(int ), (int)190)) break;
                    v9 /* !! */  = (long)ib.gcjw("gcuu", gcjt(int ), (int)191);
                }
                v10 = v8 - this.lastAttackAt;
                v11 /* !! */  = ib.ne;
                if (true) ** GOTO lbl78
                block36: while (true) {
                    v11 /* !! */  = (long)(ib.gcjw("gcuw", gckr(int ), (int)88) - ib.gcjw("gcuv", gckr(int ), (int)87));
lbl78:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1968575436: {
                            continue block36;
                        }
                        case -678873937: {
                            break block36;
                        }
                    }
                    break;
                }
                v5 /* !! */  = (CallSite)Math.max((long)v6, v10);
lbl84:
                // 2 sources

                return (long)v5 /* !! */ ;
            }
            case 0: {
                var2_2 /* !! */  = (int)ib.gcjw("gcux", gcjt(int ), (int)192);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ib.gcjw("gcuy", gcjt(int ), (int)193);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl94:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ib.gcjw("gcuz", gcjt(int ), (int)194);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 3: {
                var2_2 /* !! */  = (int)ib.gcjw("gcva", gcjt(int ), (int)195);
                if (!var3_1) break;
                throw null;
            }
lbl103:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ib.gcjw("gcvb", gcjt(int ), (int)196);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl108:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)ib.gcjw("gcvc", gcjt(int ), (int)197);
                } while (!var3_1);
                throw null;
            }
lbl113:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ib.gcjw("gcvd", gcjt(int ), (int)198);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)ib.gcjw("gcve", gcjt(int ), (int)199);
                if (!var3_1) ** GOTO lbl94
                throw null;
            }
            case 8: 
        }
        do {
            var2_2 /* !! */  = (int)ib.gcjw("gcvf", gcjt(int ), (int)200);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ib.ne - ib.gcjw("gcvw", gckr(int ), (int)96)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ib.gcjw("gcvx", gcjt(int ), (int)210)) break;
            v0 /* !! */  = (long)ib.gcjw("gcvy", gcjt(int ), (int)211);
        }
        var3_1 = ib.c;
        v1 /* !! */  = ib.ne;
        if (true) ** GOTO lbl11
        block35: while (true) {
            v1 /* !! */  = (long)(v2 - ib.gcjw("gcvz", gckr(int ), (int)97));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -678873937: {
                    break block35;
                }
                case 56255299: {
                    v2 = ib.gcjw("gcwa", gckr(int ), (int)98);
                    continue block35;
                }
                case 1497698804: {
                    v2 = ib.gcjw("gcwb", gckr(int ), (int)99);
                    continue block35;
                }
            }
            break;
        }
        var2_2 /* !! */  = ib.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ib.ne - ib.gcjw("gcwc", gckr(int ), (int)100)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ib.gcjw("gcwd", gcjt(int ), (int)212)) break;
            v3 /* !! */  = (long)ib.gcjw("gcwe", gcjt(int ), (int)213);
        }
        var1_3 = ib.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl32:
                    // 6 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl32
                v4 = ib.gcjw("gcwf", gcjt(int ), (int)214);
                v5 /* !! */  = ib.ne;
                if (true) ** GOTO lbl40
                block38: while (true) {
                    v5 /* !! */  = (long)(ib.gcjw("gcwh", gckr(int ), (int)102) - ib.gcjw("gcwg", gckr(int ), (int)101));
lbl40:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -678873937: {
                            break block38;
                        }
                        case 311454557: {
                            continue block38;
                        }
                    }
                    break;
                }
                this.lastSwingAttack = (int)v4;
                if (var1_3 || var1_3) ** GOTO lbl32
                v6 = ib.gcjw("gcwi", gcjt(int ), (int)215);
                v7 /* !! */  = ib.ne;
                if (true) ** GOTO lbl52
                block39: while (true) {
                    v7 /* !! */  = (long)(ib.gcjw("gcwk", gckr(int ), (int)104) - ib.gcjw("gcwj", gckr(int ), (int)103));
lbl52:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1241453537: {
                            continue block39;
                        }
                        case -678873937: {
                            break block39;
                        }
                    }
                    break;
                }
                this.lastObservedAttack = (int)v6;
                if (var1_3 || var1_3) ** GOTO lbl32
                v8 = ib.gcjw("gcwl", gcjt(int ), (int)216);
                v9 /* !! */  = ib.ne;
                if (true) ** GOTO lbl64
                block40: while (true) {
                    v9 /* !! */  = (long)(v10 - ib.gcjw("gcwm", gckr(int ), (int)105));
lbl64:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -904720575: {
                            v10 = ib.gcjw("gcwn", gckr(int ), (int)106);
                            continue block40;
                        }
                        case -678873937: {
                            break block40;
                        }
                        case 493018263: {
                            v10 = ib.gcjw("gcwo", gckr(int ), (int)107);
                            continue block40;
                        }
                    }
                    break;
                }
                this.lastUpdateTick = (int)v8;
                if (var1_3 || var1_3) ** GOTO lbl32
                v11 = ib.gcjw("gcwp", gckr(int ), (int)108);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = ib.ne - ib.gcjw("gcwq", gckr(int ), (int)109)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ib.gcjw("gcwr", gcjt(int ), (int)217)) break;
                    v12 /* !! */  = (long)ib.gcjw("gcws", gcjt(int ), (int)218);
                }
                this.lastAttackAt = (long)v11;
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_3 = ib.ne - ib.gcjw("gcwt", gckr(int ), (int)110)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ib.gcjw("gcwu", gcjt(int ), (int)219)) break;
                    v13 /* !! */  = (long)ib.gcjw("gcwv", gcjt(int ), (int)220);
                }
                this.cachedRotation = null;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl91:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ib.gcjw("gcww", gcjt(int ), (int)221);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl96:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ib.gcjw("gcwx", gcjt(int ), (int)222);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl101:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ib.gcjw("gcwy", gcjt(int ), (int)223);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl125
                    break;
                }
            }
lbl107:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ib.gcjw("gcwz", gcjt(int ), (int)224);
                if (!var3_1) ** GOTO lbl101
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxa", gcjt(int ), (int)225);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
            case 5: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxb", gcjt(int ), (int)226);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl141
            }
lbl121:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxc", gcjt(int ), (int)227);
                if (var3_1) {
                    throw null;
                }
            }
lbl125:
            // 5 sources

            case 7: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxd", gcjt(int ), (int)228);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
lbl129:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxe", gcjt(int ), (int)229);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
lbl133:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxf", gcjt(int ), (int)230);
                if (!var3_1) ** GOTO lbl129
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxg", gcjt(int ), (int)231);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
lbl141:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxh", gcjt(int ), (int)232);
                if (!var3_1) ** GOTO lbl121
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ib.gcjw("gcxi", gcjt(int ), (int)233);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)ib.gcjw("gcxj", gcjt(int ), (int)234);
        ** while (!var3_1)
lbl152:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gcyg() {
        ib.gckl[0] = -4478063291001678078L;
        ib.gckl[1] = -8438281754336467370L;
        ib.gckl[2] = -1282152281980517290L;
        ib.gckl[3] = 5878119091923355736L;
        ib.gckl[4] = -9036227638736011671L;
        ib.gckl[5] = 7511477121143876846L;
        ib.gckl[6] = 4137387127506368178L;
        ib.gckl[7] = -3447786299469160787L;
        ib.gckl[8] = 5174426970133388202L;
        ib.gckl[9] = 4554823094819360234L;
        ib.gckl[10] = 5370720489042213966L;
        ib.gckl[11] = 565879650324600248L;
        ib.gckl[12] = 2121467651531054L;
        ib.gckl[13] = -3784935439124499723L;
        ib.gckl[14] = -9025423144969354690L;
        ib.gckl[15] = -1854857066823328634L;
        ib.gckl[16] = 6583392722234449552L;
        ib.gckl[17] = 1734740041175645736L;
        ib.gckl[18] = -3226099316616053042L;
        ib.gckl[19] = -8157888738835372774L;
        ib.gckl[20] = 6365759741935144895L;
        ib.gckl[21] = -7133648364829487879L;
        ib.gckl[22] = 6229912685679829445L;
        ib.gckl[23] = 7862394751161158083L;
        ib.gckl[24] = -2557583622327879017L;
        ib.gckl[25] = 5219013671336618620L;
        ib.gckl[26] = 6104494422921467614L;
        ib.gckl[27] = -6976020020877530167L;
        ib.gckl[28] = -2609060727986059111L;
        ib.gckl[29] = -4712591735274145287L;
        ib.gckl[30] = -5399821729109482758L;
        ib.gckl[31] = 7423652025588579314L;
        ib.gckl[32] = 1445166113656477962L;
        ib.gckl[33] = -2063454420531968874L;
        ib.gckl[34] = 3547710148573818349L;
        ib.gckl[35] = -2517327299396794644L;
        ib.gckl[36] = 223998078680072297L;
        ib.gckl[37] = 1375085861844681327L;
        ib.gckl[38] = 7226190048617405364L;
        ib.gckl[39] = 770218941936274177L;
        ib.gckl[40] = 6164110238886256655L;
        ib.gckl[41] = -3169452204065549402L;
        ib.gckl[42] = -9081025447874979947L;
        ib.gckl[43] = -1278263857876562234L;
        ib.gckl[44] = -8724414357094279478L;
        ib.gckl[45] = -7924869040712455463L;
        ib.gckl[46] = -913300934443349992L;
        ib.gckl[47] = -975109326995278940L;
        ib.gckl[48] = 845077730480149106L;
        ib.gckl[49] = -1275742691561987943L;
        ib.gckl[50] = -3719685327564892539L;
        ib.gckl[51] = 2336282723884496950L;
        ib.gckl[52] = -6613556197192894696L;
        ib.gckl[53] = -4410311409680592598L;
        ib.gckl[54] = 8816725810917809573L;
        ib.gckl[55] = 1050043664072967041L;
        ib.gckl[56] = -4487801329547023129L;
        ib.gckl[57] = -1926858010238539895L;
        ib.gckl[58] = 3224432505890013338L;
        ib.gckl[59] = -1513019388338259750L;
        ib.gckl[60] = 8634411240486367528L;
        ib.gckl[61] = 6252759565103548283L;
        ib.gckl[62] = 3652221379402315740L;
        ib.gckl[63] = -8371474577432187154L;
        ib.gckl[64] = -3278141135686461071L;
        ib.gckl[65] = 2153916658188996589L;
        ib.gckl[66] = 8900275418224358871L;
        ib.gckl[67] = 5582762687735000120L;
        ib.gckl[68] = -7895976667570358395L;
        ib.gckl[69] = 1848942834435721751L;
        ib.gckl[70] = 6493756400791722705L;
        ib.gckl[71] = 5652640971780828144L;
        ib.gckl[72] = 8552948098570087839L;
        ib.gckl[73] = -6834393472628085019L;
        ib.gckl[74] = 2355293251841209410L;
        ib.gckl[75] = -942074650482219588L;
        ib.gckl[76] = 1171056912277399987L;
        ib.gckl[77] = 8091149469540267885L;
        ib.gckl[78] = -6177917358972404725L;
        ib.gckl[79] = -6532987586947941826L;
        ib.gckl[80] = -2997926704991409423L;
        ib.gckl[81] = 1473599022875071205L;
        ib.gckl[82] = -8419354579965011896L;
        ib.gckl[83] = -3230280284460624387L;
        ib.gckl[84] = 3332652004612970198L;
        ib.gckl[85] = 3523818925413352818L;
        ib.gckl[86] = 3924099785158124491L;
        ib.gckl[87] = 1281965783122002123L;
        ib.gckl[88] = -3447713020849727054L;
        ib.gckl[89] = -5549417681635251748L;
        ib.gckl[90] = 5268250413467951950L;
        ib.gckl[91] = 8717780064924036375L;
        ib.gckl[92] = -3143418999578220173L;
        ib.gckl[93] = -6293753408408720388L;
        ib.gckl[94] = 3555781380439806592L;
        ib.gckl[95] = -5056631793009816299L;
        ib.gckl[96] = -3243380680980118314L;
        ib.gckl[97] = 1635678828715469466L;
        ib.gckl[98] = 5771918338200278064L;
        ib.gckl[99] = -1361894362314053629L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ib() {
        var2_1 /* !! */  = ib.b;
        super("Funtime");
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block8: while (true) {
            block10: {
                switch (cfr_temp_0 == -2147483648 ? var2_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        this.lastSwingAttack = (int)ib.gcjw("gcjx", gcjt(int ), (int)0);
                        this.lastObservedAttack = (int)ib.gcjw("gcjy", gcjt(int ), (int)1);
                        this.lastUpdateTick = (int)ib.gcjw("gcjz", gcjt(int ), (int)2);
                        return;
                    }
                    case 2: {
                        ** GOTO lbl20
                    }
                    case 4: {
                        var2_1 /* !! */  = (int)ib.gcjw("gcke", gcjt(int ), (int)7);
                        ** GOTO lbl-1000
                    }
                    case 5: lbl-1000:
                    // 2 sources

                    {
                        var2_1 /* !! */  = (int)ib.gcjw("gckf", gcjt(int ), (int)8);
lbl20:
                        // 2 sources

                        var2_1 /* !! */  = (int)ib.gcjw("gckc", gcjt(int ), (int)5);
                        cfr_temp_0 = 3;
                        break block10;
                    }
                    case 0: {
                        var2_1 /* !! */  = (int)ib.gcjw("gcka", gcjt(int ), (int)3);
                    }
                    case 1: {
                        var2_1 /* !! */  = (int)ib.gcjw("gckb", gcjt(int ), (int)4);
                    }
                    case 3: 
                }
                ** GOTO lbl32
            }
            while (true) {
                if (true) continue block8;
lbl32:
                // 2 sources

                var2_1 /* !! */  = (int)ib.gcjw("gckd", gcjt(int ), (int)6);
                cfr_temp_0 = 0;
            }
            break;
        }
    }

    private static /* synthetic */ void gcye() {
        ib.gcjv[100] = -1948317142;
        ib.gcjv[101] = -1764233987;
        ib.gcjv[102] = -578181623;
        ib.gcjv[103] = -1436293234;
        ib.gcjv[104] = 668267048;
        ib.gcjv[105] = 608649490;
        ib.gcjv[106] = 1699523409;
        ib.gcjv[107] = -1200769586;
        ib.gcjv[108] = 1455987242;
        ib.gcjv[109] = 256698131;
        ib.gcjv[110] = -450006777;
        ib.gcjv[111] = -1357687163;
        ib.gcjv[112] = 1919817315;
        ib.gcjv[113] = 2114577739;
        ib.gcjv[114] = -930940931;
        ib.gcjv[115] = 877367142;
        ib.gcjv[116] = 746307084;
        ib.gcjv[117] = 1240762962;
        ib.gcjv[118] = 320415584;
        ib.gcjv[119] = -1309173441;
        ib.gcjv[120] = -1885834531;
        ib.gcjv[121] = 2057961955;
        ib.gcjv[122] = -1493763783;
        ib.gcjv[123] = -1945109916;
        ib.gcjv[124] = 392551631;
        ib.gcjv[125] = 1163665630;
        ib.gcjv[126] = 1246590500;
        ib.gcjv[127] = -345810693;
        ib.gcjv[128] = 1799928181;
        ib.gcjv[129] = -1444226623;
        ib.gcjv[130] = 1065854559;
        ib.gcjv[131] = 848765558;
        ib.gcjv[132] = -659350704;
        ib.gcjv[133] = -903132410;
        ib.gcjv[134] = 652025505;
        ib.gcjv[135] = -1909387271;
        ib.gcjv[136] = -746213196;
        ib.gcjv[137] = 1841909056;
        ib.gcjv[138] = -1698288450;
        ib.gcjv[139] = -2042216362;
        ib.gcjv[140] = -633333191;
        ib.gcjv[141] = 1983000979;
        ib.gcjv[142] = -1661262074;
        ib.gcjv[143] = -1330389601;
        ib.gcjv[144] = 961700546;
        ib.gcjv[145] = -1892992498;
        ib.gcjv[146] = -28549786;
        ib.gcjv[147] = -1089596287;
        ib.gcjv[148] = 1434458898;
        ib.gcjv[149] = -1238622838;
        ib.gcjv[150] = -625098379;
        ib.gcjv[151] = -890158596;
        ib.gcjv[152] = -1270888342;
        ib.gcjv[153] = -443471981;
        ib.gcjv[154] = -980084487;
        ib.gcjv[155] = -1732888318;
        ib.gcjv[156] = -1367073830;
        ib.gcjv[157] = 70712335;
        ib.gcjv[158] = -1966023888;
        ib.gcjv[159] = 155136890;
        ib.gcjv[160] = 130960377;
        ib.gcjv[161] = -1597117116;
        ib.gcjv[162] = -265303785;
        ib.gcjv[163] = -1625021156;
        ib.gcjv[164] = -411115494;
        ib.gcjv[165] = 495557625;
        ib.gcjv[166] = 2005413939;
        ib.gcjv[167] = 274809124;
        ib.gcjv[168] = 104093173;
        ib.gcjv[169] = -177285560;
        ib.gcjv[170] = 445792982;
        ib.gcjv[171] = 1568384834;
        ib.gcjv[172] = -2068054649;
        ib.gcjv[173] = 346034104;
        ib.gcjv[174] = -1580650336;
        ib.gcjv[175] = 487549907;
        ib.gcjv[176] = 1524248374;
        ib.gcjv[177] = 91276938;
        ib.gcjv[178] = -2077834424;
        ib.gcjv[179] = -902205610;
        ib.gcjv[180] = 148717623;
        ib.gcjv[181] = -1749456301;
        ib.gcjv[182] = 1869972380;
        ib.gcjv[183] = 880982296;
        ib.gcjv[184] = 1749080372;
        ib.gcjv[185] = -1922394166;
        ib.gcjv[186] = 1138594600;
        ib.gcjv[187] = -2013807133;
        ib.gcjv[188] = 1800960185;
        ib.gcjv[189] = -1676580330;
        ib.gcjv[190] = -351718835;
        ib.gcjv[191] = 212532082;
        ib.gcjv[192] = 1240940893;
        ib.gcjv[193] = -578452598;
        ib.gcjv[194] = 1199196017;
        ib.gcjv[195] = -1921576440;
        ib.gcjv[196] = 511380817;
        ib.gcjv[197] = 1373207738;
        ib.gcjv[198] = -1357248986;
        ib.gcjv[199] = -1296033186;
    }

    private static /* synthetic */ void gcya() {
        ib.gcju[0] = 1988866311;
        ib.gcju[1] = -550496573;
        ib.gcju[2] = -1829737102;
        ib.gcju[3] = -1593964934;
        ib.gcju[4] = 996800626;
        ib.gcju[5] = 1585556617;
        ib.gcju[6] = -906170222;
        ib.gcju[7] = -310449547;
        ib.gcju[8] = -218423025;
        ib.gcju[9] = -833917999;
        ib.gcju[10] = 1729467218;
        ib.gcju[11] = 1687219018;
        ib.gcju[12] = -1817406470;
        ib.gcju[13] = 575929980;
        ib.gcju[14] = -567716762;
        ib.gcju[15] = 354769464;
        ib.gcju[16] = -1321007332;
        ib.gcju[17] = -321479703;
        ib.gcju[18] = 1207978603;
        ib.gcju[19] = -640002537;
        ib.gcju[20] = -1715805749;
        ib.gcju[21] = 834547684;
        ib.gcju[22] = 247595355;
        ib.gcju[23] = -219263243;
        ib.gcju[24] = 1673927681;
        ib.gcju[25] = -1684129228;
        ib.gcju[26] = -1147837543;
        ib.gcju[27] = -1582524936;
        ib.gcju[28] = -1460174231;
        ib.gcju[29] = 48242796;
        ib.gcju[30] = -2111541864;
        ib.gcju[31] = -1284217612;
        ib.gcju[32] = -1191799841;
        ib.gcju[33] = -1908103415;
        ib.gcju[34] = -1512079580;
        ib.gcju[35] = 1981491458;
        ib.gcju[36] = -1801765873;
        ib.gcju[37] = -1103705522;
        ib.gcju[38] = 304541598;
        ib.gcju[39] = 1852736488;
        ib.gcju[40] = 1282217674;
        ib.gcju[41] = -675854258;
        ib.gcju[42] = -1432380961;
        ib.gcju[43] = 229605621;
        ib.gcju[44] = -1840708569;
        ib.gcju[45] = -679563408;
        ib.gcju[46] = -311057122;
        ib.gcju[47] = 1587475315;
        ib.gcju[48] = -870844918;
        ib.gcju[49] = 1395721700;
        ib.gcju[50] = -1983050762;
        ib.gcju[51] = 2143170218;
        ib.gcju[52] = 785127032;
        ib.gcju[53] = -929341198;
        ib.gcju[54] = -225203571;
        ib.gcju[55] = -1696166709;
        ib.gcju[56] = -997742195;
        ib.gcju[57] = 1906636929;
        ib.gcju[58] = 1591792505;
        ib.gcju[59] = -980583886;
        ib.gcju[60] = 19093376;
        ib.gcju[61] = 2082641465;
        ib.gcju[62] = -1052069822;
        ib.gcju[63] = -1473120739;
        ib.gcju[64] = -746604598;
        ib.gcju[65] = 1213491114;
        ib.gcju[66] = 928641785;
        ib.gcju[67] = 30130513;
        ib.gcju[68] = 1114130039;
        ib.gcju[69] = 751014650;
        ib.gcju[70] = 1036557499;
        ib.gcju[71] = -1797019030;
        ib.gcju[72] = 1200369100;
        ib.gcju[73] = -474605459;
        ib.gcju[74] = -1916740578;
        ib.gcju[75] = -92296120;
        ib.gcju[76] = 343112258;
        ib.gcju[77] = -1161503461;
        ib.gcju[78] = 656229714;
        ib.gcju[79] = 1652872953;
        ib.gcju[80] = 1922935328;
        ib.gcju[81] = 2039016503;
        ib.gcju[82] = 1945890399;
        ib.gcju[83] = -857985168;
        ib.gcju[84] = -614419165;
        ib.gcju[85] = -1508752088;
        ib.gcju[86] = 654978484;
        ib.gcju[87] = -1849228479;
        ib.gcju[88] = -202509614;
        ib.gcju[89] = -701772136;
        ib.gcju[90] = 458880;
        ib.gcju[91] = -1516086052;
        ib.gcju[92] = -1336638568;
        ib.gcju[93] = 1888827956;
        ib.gcju[94] = -618990461;
        ib.gcju[95] = -260273297;
        ib.gcju[96] = 1790094188;
        ib.gcju[97] = -1156750968;
        ib.gcju[98] = -347455704;
        ib.gcju[99] = 1967639194;
    }

    private static /* synthetic */ int gcjt(int n2) {
        return gcju[n2] ^ gcjv[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float randomLerp(float var1_1, float var2_2) {
        v0 /* !! */  = ib.ne;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(v1 - ib.gcjw("gcvg", gckr(int ), (int)89));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -678873937: {
                    break block15;
                }
                case -463496369: {
                    v1 = ib.gcjw("gcvh", gckr(int ), (int)90);
                    continue block15;
                }
                case -380115340: {
                    v1 = ib.gcjw("gcvi", gckr(int ), (int)91);
                    continue block15;
                }
            }
            break;
        }
        var5_3 = ib.c;
        v2 /* !! */  = ib.ne;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(ib.gcjw("gcvk", gckr(int ), (int)93) - ib.gcjw("gcvj", gckr(int ), (int)92));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -678873937: {
                    break block16;
                }
                case 285397899: {
                    continue block16;
                }
            }
            break;
        }
        var4_4 /* !! */  = ib.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ib.ne - ib.gcjw("gcvl", gckr(int ), (int)94)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ib.gcjw("gcvm", gcjt(int ), (int)201)) break;
            v3 /* !! */  = (long)ib.gcjw("gcvn", gcjt(int ), (int)202);
        }
        var3_5 = ib.a;
        if (var5_3) {
            throw null;
lbl34:
            // 1 sources

            return (float)ib.gcjw("gcvo", gckg(int ), (int)203);
        }
        ** while (var3_5 || var3_5)
lbl37:
        // 1 sources

        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ib.ne - ib.gcjw("gcvp", gckr(int ), (int)95)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ib.gcjw("gcvq", gcjt(int ), (int)204)) break;
                    v4 /* !! */  = (long)ib.gcjw("gcvr", gcjt(int ), (int)205);
                }
                return var1_1 + (float)Math.random() * (var2_2 - var1_1);
            }
            case 0: {
                var4_4 /* !! */  = (int)ib.gcjw("gcvs", gcjt(int ), (int)206);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl56
            }
            case 1: {
                var4_4 /* !! */  = (int)ib.gcjw("gcvt", gcjt(int ), (int)207);
                if (!var5_3) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)ib.gcjw("gcvu", gcjt(int ), (int)208);
                    if (!var5_3) break block9;
                    throw null;
                }
            }
            case 3: 
        }
        var4_4 /* !! */  = (int)ib.gcjw("gcvv", gcjt(int ), (int)209);
        ** while (!var5_3)
lbl64:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void gcyj() {
        ib.gckm[100] = -247681659294855669L;
        ib.gckm[101] = 8366989363460255152L;
        ib.gckm[102] = -397161462773745468L;
        ib.gckm[103] = -6701822395719613368L;
        ib.gckm[104] = -4452073202812994569L;
        ib.gckm[105] = 578842752883672634L;
        ib.gckm[106] = 899942990081207445L;
        ib.gckm[107] = 9089300595507647112L;
        ib.gckm[108] = 3447790305670186315L;
        ib.gckm[109] = 5118061813614905674L;
        ib.gckm[110] = 373780518347148990L;
        ib.gckm[111] = -3149305626817400919L;
        ib.gckm[112] = 6776437387585414162L;
        ib.gckm[113] = 8828072948711058025L;
        ib.gckm[114] = 585373075831546379L;
        ib.gckm[115] = 5716392618228910549L;
        ib.gckm[116] = -9069552637503632500L;
        ib.gckm[117] = -6072981182761803581L;
        ib.gckm[118] = -6454531874335278695L;
        ib.gckm[119] = -8233448462728155861L;
        ib.gckm[120] = -3164173017368109833L;
    }

    private static /* synthetic */ void gcyi() {
        ib.gckm[0] = -9106637808031705342L;
        ib.gckm[1] = -3845736034325404074L;
        ib.gckm[2] = -1282152281980516958L;
        ib.gckm[3] = 5878119091923356139L;
        ib.gckm[4] = -9036227638736011629L;
        ib.gckm[5] = 7511477121143876638L;
        ib.gckm[6] = -3650625039304192448L;
        ib.gckm[7] = -4346221172085164874L;
        ib.gckm[8] = 2188750416206563673L;
        ib.gckm[9] = -7051109639490801123L;
        ib.gckm[10] = 4402356281097975336L;
        ib.gckm[11] = -2790174978094241013L;
        ib.gckm[12] = 5024501935251799149L;
        ib.gckm[13] = 777633207758610365L;
        ib.gckm[14] = -1249802683674397539L;
        ib.gckm[15] = -6355417455980022759L;
        ib.gckm[16] = -3663094816779114334L;
        ib.gckm[17] = 7288984948232304407L;
        ib.gckm[18] = 7153880588116408075L;
        ib.gckm[19] = 2117408344792059395L;
        ib.gckm[20] = 2515760062686826799L;
        ib.gckm[21] = 1869460374247390766L;
        ib.gckm[22] = 2090214777824439995L;
        ib.gckm[23] = 4318162746398414770L;
        ib.gckm[24] = -2340287583731563216L;
        ib.gckm[25] = 5829740181582398462L;
        ib.gckm[26] = -237620860575145403L;
        ib.gckm[27] = 7096667785723800203L;
        ib.gckm[28] = 6958454718984411135L;
        ib.gckm[29] = 6596059589479255394L;
        ib.gckm[30] = 7442840433532061532L;
        ib.gckm[31] = 6015037742346481634L;
        ib.gckm[32] = 6212683839138509444L;
        ib.gckm[33] = 8328901375295533044L;
        ib.gckm[34] = 4535194892935413437L;
        ib.gckm[35] = -1739644838172131898L;
        ib.gckm[36] = -2215801563452960624L;
        ib.gckm[37] = -7139812675869117873L;
        ib.gckm[38] = -6630031342873889450L;
        ib.gckm[39] = -31455641096157588L;
        ib.gckm[40] = -6746076958711791796L;
        ib.gckm[41] = -439599787591369459L;
        ib.gckm[42] = -452349251695791901L;
        ib.gckm[43] = -1005945482104074329L;
        ib.gckm[44] = 4081714707726088007L;
        ib.gckm[45] = 8088641883283961353L;
        ib.gckm[46] = 498348626182603550L;
        ib.gckm[47] = -7982099553899353215L;
        ib.gckm[48] = -5579529403427899530L;
        ib.gckm[49] = -618900817919939893L;
        ib.gckm[50] = -2239275388233774711L;
        ib.gckm[51] = 6181317364904021483L;
        ib.gckm[52] = -3619759427025931333L;
        ib.gckm[53] = 6932255152398836710L;
        ib.gckm[54] = -3839853331560527455L;
        ib.gckm[55] = -4724133711090655334L;
        ib.gckm[56] = 9042832990176668871L;
        ib.gckm[57] = 9183249282665405496L;
        ib.gckm[58] = -2484745945463950762L;
        ib.gckm[59] = 5276210237168888869L;
        ib.gckm[60] = 8891816062373824916L;
        ib.gckm[61] = 3246652779238830554L;
        ib.gckm[62] = 4325383536588750859L;
        ib.gckm[63] = 8667567861007614501L;
        ib.gckm[64] = 4960347887200018639L;
        ib.gckm[65] = 61812394744452809L;
        ib.gckm[66] = 2674812076221343901L;
        ib.gckm[67] = 2795918909905439901L;
        ib.gckm[68] = 5576413625065431070L;
        ib.gckm[69] = -5116891885553106933L;
        ib.gckm[70] = 5530382977451416214L;
        ib.gckm[71] = 6764548049174823980L;
        ib.gckm[72] = 734555979606804786L;
        ib.gckm[73] = 6967459842726663605L;
        ib.gckm[74] = 1259598927533867036L;
        ib.gckm[75] = -5489569736641534173L;
        ib.gckm[76] = -6460833550956512L;
        ib.gckm[77] = 1343044130386856038L;
        ib.gckm[78] = -3774918562522071960L;
        ib.gckm[79] = -8496019603083904339L;
        ib.gckm[80] = 6874519528707699459L;
        ib.gckm[81] = 1473599022875071205L;
        ib.gckm[82] = -804017456889763913L;
        ib.gckm[83] = -3230280284460624387L;
        ib.gckm[84] = 4579766725483145150L;
        ib.gckm[85] = 5285361789325111720L;
        ib.gckm[86] = -5303722751717986887L;
        ib.gckm[87] = -8572420404464580380L;
        ib.gckm[88] = 915838009697733908L;
        ib.gckm[89] = -1649679507850185870L;
        ib.gckm[90] = -6943276496889407340L;
        ib.gckm[91] = 3787650136989117824L;
        ib.gckm[92] = 4599971908488629698L;
        ib.gckm[93] = -8351269863119034487L;
        ib.gckm[94] = 37290421911611423L;
        ib.gckm[95] = 8033487938018503231L;
        ib.gckm[96] = 7369986010827229945L;
        ib.gckm[97] = 6064337914745344537L;
        ib.gckm[98] = 1250388679335270297L;
        ib.gckm[99] = 5472511044348603230L;
    }
}

