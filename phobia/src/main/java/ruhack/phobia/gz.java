/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1753
 *  net.minecraft.class_1764
 *  net.minecraft.class_1799
 *  net.minecraft.class_1835
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2886
 *  net.minecraft.class_3532
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1835;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2886;
import net.minecraft.class_3532;
import net.minecraft.class_742;
import net.minecraft.class_746;
import ruhack.phobia.aw;
import ruhack.phobia.cr;
import ruhack.phobia.da;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.gz$AimSmoothMode;
import ruhack.phobia.gz$WeaponState;
import ruhack.phobia.hb;
import ruhack.phobia.jx;
import ruhack.phobia.kb;
import ruhack.phobia.ke;
import ruhack.phobia.kg;
import ruhack.phobia.nj;
import ruhack.phobia.nn;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ov;

public final class gz
extends ds {
    private static final double PROJECTILE_GRAVITY = 0.05;
    public static final int b;
    private class_243 smoothedTargetVelocity;
    private class_1657 target;
    private static int[] fisx;
    private static final long me = -5540250963081084044L;
    private int velocityTargetId;
    private ov aimAngle;
    private final kg aimDistance;
    private static int[] fisy;
    private class_243 lastTargetPosition;
    public static final boolean c;
    private final ke weapons;
    private static final double PROJECTILE_DRAG = 0.99;
    public static final boolean a;
    private static long[] fitt;
    private final kb predict;
    private boolean replacingCrossbowPacket;
    private static long[] fits;
    private final gz$AimSmoothMode smoothMode;
    private int lastTargetAge;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onRotationUpdate(da var1_1) {
        block110: {
            block109: {
                var5_2 = gz.c;
                var4_3 /* !! */  = gz.b;
                var3_4 = gz.a;
                if (var5_2) {
                    throw null;
lbl6:
                    // 26 sources

                    return;
                }
                if (var3_4 || var3_4) ** GOTO lbl6
                if (var1_1.getType() == 0) break block109;
                if (var3_4) ** GOTO lbl6
                return;
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            if (gz.mc.field_1724 == null) break block110;
            if (var3_4) ** GOTO lbl6
            if (gz.mc.field_1687 == null) break block110;
            if (var3_4) ** GOTO lbl6
            if (gz.mc.field_1755 == null) ** GOTO lbl29
            if (var3_4) ** GOTO lbl6
        }
        if (var3_4) ** GOTO lbl6
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4) ** GOTO lbl6
                this.clearTarget();
                if (var3_4 || var3_4) ** GOTO lbl6
                return;
            }
lbl29:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            var2_5 = this.getActiveWeapon();
            if (var3_4 || var3_4) ** GOTO lbl6
            if (var2_5 != null) ** GOTO lbl37
            if (var3_4 || var3_4) ** GOTO lbl6
            this.clearTarget();
            if (var3_4 || var3_4) ** GOTO lbl6
            return;
lbl37:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            if (this.isValidTarget(this.target, (boolean)gz.fisz("fiyl", fitc(int ), (int)85))) ** GOTO lbl72
            if (var3_4 || var3_4) ** GOTO lbl6
            this.target = this.findTarget();
            if (var3_4 || var3_4) ** GOTO lbl6
            if (this.target == null) {
                v0 = class_243.field_1353;
                if (var5_2) {
                    throw null;
                }
            } else {
                v0 = this.smoothedTargetVelocity = this.target.method_18798();
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            if (this.target == null) {
                v1 /* !! */  = gz.fisz("fiym", fitc(int ), (int)86);
                if (var5_2) {
                    throw null;
                }
            } else {
                v1 /* !! */  = (CallSite)this.target.method_5628();
            }
            this.velocityTargetId = (int)v1 /* !! */ ;
            if (var3_4 || var3_4) ** GOTO lbl6
            if (this.target == null) {
                v2 = null;
                if (var5_2) {
                    throw null;
                }
            } else {
                v2 = this.lastTargetPosition = this.target.method_73189();
            }
            if (var3_4 || var3_4) ** GOTO lbl6
            if (this.target == null) {
                v3 /* !! */  = gz.fisz("fiyn", fitc(int ), (int)87);
                if (var5_2) {
                    throw null;
                }
            } else {
                v3 /* !! */  = (CallSite)this.target.field_6012;
            }
            this.lastTargetAge = (int)v3 /* !! */ ;
            if (var3_4) ** GOTO lbl6
lbl72:
            // 2 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            if (this.target != null) ** GOTO lbl78
            if (var3_4 || var3_4) ** GOTO lbl6
            this.clearTarget();
            if (var3_4 || var3_4) ** GOTO lbl6
            return;
lbl78:
            // 1 sources

            if (var3_4 || var3_4) ** GOTO lbl6
            this.aimAngle = this.calculateProjectileAngle(this.target, var2_5);
            if (var3_4 || var3_4) ** GOTO lbl6
            ot.INSTANCE.rotateTo(this.aimAngle, (int)gz.fisz("fiyo", fitc(int ), (int)88), new os(this.smoothMode, (boolean)gz.fisz("fiyp", fitc(int ), (int)89), (boolean)gz.fisz("fiyq", fitc(int ), (int)90), (boolean)gz.fisz("fiyr", fitc(int ), (int)91)), nn.HIGH_IMPORTANCE_2, this);
            if (!var3_4 && !var3_4) ** break;
            ** continue;
            return;
            case 0: {
                var4_3 /* !! */  = (int)gz.fisz("fiys", fitc(int ), (int)92);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl90:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)gz.fisz("fiyt", fitc(int ), (int)93);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl99
            }
lbl95:
            // 3 sources

            case 2: {
                var4_3 /* !! */  = (int)gz.fisz("fiyu", fitc(int ), (int)94);
                if (!var5_2) break;
                throw null;
            }
lbl99:
            // 3 sources

            case 3: {
                var4_3 /* !! */  = (int)gz.fisz("fiyv", fitc(int ), (int)95);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl104:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)gz.fisz("fiyw", fitc(int ), (int)96);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl175
            }
lbl109:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)gz.fisz("fiyx", fitc(int ), (int)97);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl293
            }
lbl114:
            // 2 sources

            case 6: {
                var4_3 /* !! */  = (int)gz.fisz("fiyy", fitc(int ), (int)98);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
            case 7: {
                var4_3 /* !! */  = (int)gz.fisz("fiyz", fitc(int ), (int)99);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl171
            }
lbl124:
            // 4 sources

            case 8: {
                var4_3 /* !! */  = (int)gz.fisz("fiza", fitc(int ), (int)100);
                if (!var5_2) ** GOTO lbl90
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)gz.fisz("fizb", fitc(int ), (int)101);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
            case 10: {
                var4_3 /* !! */  = (int)gz.fisz("fizc", fitc(int ), (int)102);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl138:
            // 2 sources

            case 11: {
                var4_3 /* !! */  = (int)gz.fisz("fizd", fitc(int ), (int)103);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl143:
            // 2 sources

            case 12: {
                var4_3 /* !! */  = (int)gz.fisz("fize", fitc(int ), (int)104);
                if (!var5_2) ** GOTO lbl104
                throw null;
            }
            case 13: {
                var4_3 /* !! */  = (int)gz.fisz("fizf", fitc(int ), (int)105);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl190
            }
lbl152:
            // 2 sources

            case 14: {
                var4_3 /* !! */  = (int)gz.fisz("fizg", fitc(int ), (int)106);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 15: {
                var4_3 /* !! */  = (int)gz.fisz("fizh", fitc(int ), (int)107);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 16: {
                var4_3 /* !! */  = (int)gz.fisz("fizi", fitc(int ), (int)108);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 17: {
                var4_3 /* !! */  = (int)gz.fisz("fizj", fitc(int ), (int)109);
                if (var5_2) {
                    throw null;
                }
            }
lbl171:
            // 4 sources

            case 18: {
                var4_3 /* !! */  = (int)gz.fisz("fizk", fitc(int ), (int)110);
                if (!var5_2) ** GOTO lbl95
                throw null;
            }
lbl175:
            // 3 sources

            case 19: {
                var4_3 /* !! */  = (int)gz.fisz("fizl", fitc(int ), (int)111);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl180:
            // 2 sources

            case 20: {
                var4_3 /* !! */  = (int)gz.fisz("fizm", fitc(int ), (int)112);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
lbl185:
            // 4 sources

            case 21: {
                var4_3 /* !! */  = (int)gz.fisz("fizn", fitc(int ), (int)113);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl269
            }
lbl190:
            // 3 sources

            case 22: {
                var4_3 /* !! */  = (int)gz.fisz("fizo", fitc(int ), (int)114);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 23: {
                var4_3 /* !! */  = (int)gz.fisz("fizp", fitc(int ), (int)115);
                if (!var5_2) ** GOTO lbl124
                throw null;
            }
            case 24: {
                var4_3 /* !! */  = (int)gz.fisz("fizq", fitc(int ), (int)116);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl204:
            // 3 sources

            case 25: {
                var4_3 /* !! */  = (int)gz.fisz("fizr", fitc(int ), (int)117);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 26: {
                var4_3 /* !! */  = (int)gz.fisz("fizs", fitc(int ), (int)118);
                if (!var5_2) ** GOTO lbl109
                throw null;
            }
lbl213:
            // 2 sources

            case 27: {
                var4_3 /* !! */  = (int)gz.fisz("fizt", fitc(int ), (int)119);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl218:
            // 3 sources

            case 28: {
                var4_3 /* !! */  = (int)gz.fisz("fizu", fitc(int ), (int)120);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl289
            }
lbl223:
            // 3 sources

            case 29: {
                var4_3 /* !! */  = (int)gz.fisz("fizv", fitc(int ), (int)121);
                if (!var5_2) ** GOTO lbl124
                throw null;
            }
lbl227:
            // 2 sources

            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)gz.fisz("fizw", fitc(int ), (int)122);
                    if (!var5_2) ** GOTO lbl185
                    throw null;
                }
            }
            case 31: {
                var4_3 /* !! */  = (int)gz.fisz("fizx", fitc(int ), (int)123);
                if (!var5_2) ** GOTO lbl180
                throw null;
            }
lbl236:
            // 3 sources

            case 32: {
                var4_3 /* !! */  = (int)gz.fisz("fizy", fitc(int ), (int)124);
                if (var5_2) {
                    throw null;
                }
            }
lbl240:
            // 4 sources

            case 33: {
                var4_3 /* !! */  = (int)gz.fisz("fizz", fitc(int ), (int)125);
                if (!var5_2) ** GOTO lbl124
                throw null;
            }
lbl244:
            // 2 sources

            case 34: {
                var4_3 /* !! */  = (int)gz.fisz("fjaa", fitc(int ), (int)126);
                if (!var5_2) ** GOTO lbl223
                throw null;
            }
lbl248:
            // 2 sources

            case 35: {
                var4_3 /* !! */  = (int)gz.fisz("fjab", fitc(int ), (int)127);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl253:
            // 2 sources

            case 36: {
                var4_3 /* !! */  = (int)gz.fisz("fjac", fitc(int ), (int)128);
                if (!var5_2) ** GOTO lbl175
                throw null;
            }
            case 37: {
                var4_3 /* !! */  = (int)gz.fisz("fjad", fitc(int ), (int)129);
                if (!var5_2) ** GOTO lbl204
                throw null;
            }
lbl261:
            // 2 sources

            case 38: {
                var4_3 /* !! */  = (int)gz.fisz("fjae", fitc(int ), (int)130);
                if (!var5_2) ** GOTO lbl90
                throw null;
            }
            case 39: {
                var4_3 /* !! */  = (int)gz.fisz("fjaf", fitc(int ), (int)131);
                if (!var5_2) ** GOTO lbl240
                throw null;
            }
lbl269:
            // 2 sources

            case 40: {
                var4_3 /* !! */  = (int)gz.fisz("fjag", fitc(int ), (int)132);
                if (!var5_2) ** GOTO lbl227
                throw null;
            }
lbl273:
            // 2 sources

            case 41: {
                var4_3 /* !! */  = (int)gz.fisz("fjah", fitc(int ), (int)133);
                if (!var5_2) ** GOTO lbl236
                throw null;
            }
lbl277:
            // 2 sources

            case 42: {
                var4_3 /* !! */  = (int)gz.fisz("fjai", fitc(int ), (int)134);
                if (!var5_2) ** GOTO lbl95
                throw null;
            }
lbl281:
            // 2 sources

            case 43: {
                var4_3 /* !! */  = (int)gz.fisz("fjaj", fitc(int ), (int)135);
                if (!var5_2) ** GOTO lbl218
                throw null;
            }
            case 44: {
                var4_3 /* !! */  = (int)gz.fisz("fjak", fitc(int ), (int)136);
                if (!var5_2) ** GOTO lbl248
                throw null;
            }
lbl289:
            // 2 sources

            case 45: {
                var4_3 /* !! */  = (int)gz.fisz("fjal", fitc(int ), (int)137);
                if (!var5_2) ** GOTO lbl99
                throw null;
            }
lbl293:
            // 2 sources

            case 46: {
                var4_3 /* !! */  = (int)gz.fisz("fjam", fitc(int ), (int)138);
                if (!var5_2) ** GOTO lbl277
                throw null;
            }
            case 47: {
                var4_3 /* !! */  = (int)gz.fisz("fjan", fitc(int ), (int)139);
                if (!var5_2) ** GOTO lbl190
                throw null;
            }
            case 48: 
        }
        var4_3 /* !! */  = (int)gz.fisz("fjao", fitc(int ), (int)140);
        ** while (!var5_2)
lbl304:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov getAimAngle() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gz.me - gz.fisz("fivc", fitr(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gz.fisz("fivd", fitc(int ), (int)34)) break;
            v0 /* !! */  = (long)gz.fisz("five", fitc(int ), (int)35);
        }
        var3_1 = gz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gz.me - gz.fisz("fivf", fitr(int ), (int)17)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == gz.fisz("fivg", fitc(int ), (int)36)) break;
            v1 /* !! */  = (long)gz.fisz("fivh", fitc(int ), (int)37);
        }
        var2_2 /* !! */  = gz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gz.me - gz.fisz("fivi", fitr(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gz.fisz("fivj", fitc(int ), (int)38)) break;
            v2 /* !! */  = (long)gz.fisz("fivk", fitc(int ), (int)39);
        }
        var1_3 = gz.a;
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

                if (var1_3 || var1_3) continue block22;
                v3 /* !! */  = gz.me;
                if (true) ** GOTO lbl33
                block23: while (true) {
                    v3 /* !! */  = (long)(gz.fisz("fivm", fitr(int ), (int)20) - gz.fisz("fivl", fitr(int ), (int)19));
lbl33:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1124680564: {
                            break block23;
                        }
                        case 2032743765: {
                            continue block23;
                        }
                    }
                    break;
                }
                if (this.target == null) ** GOTO lbl57
                if (var1_3) continue block22;
                v4 /* !! */  = gz.me;
                if (true) ** GOTO lbl44
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - gz.fisz("fivn", fitr(int ), (int)21));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 308003946: {
                            v5 = gz.fisz("fivo", fitr(int ), (int)22);
                            continue block24;
                        }
                        case 1124680564: {
                            break block24;
                        }
                        case 1842735765: {
                            v5 = gz.fisz("fivp", fitr(int ), (int)23);
                            continue block24;
                        }
                    }
                    break;
                }
                v6 = this.aimAngle;
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl60
lbl57:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                continue block22;
                v6 = null;
lbl60:
                // 2 sources

                return v6;
lbl61:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)gz.fisz("fivq", fitc(int ), (int)40);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl84
                }
                case 1: {
                    var2_2 /* !! */  = (int)gz.fisz("fivr", fitc(int ), (int)41);
                    if (!var3_1) ** GOTO lbl61
                    throw null;
                }
lbl70:
                // 2 sources

                case 2: {
                    var2_2 /* !! */  = (int)gz.fisz("fivs", fitc(int ), (int)42);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl89
                }
                case 3: {
                    var2_2 /* !! */  = (int)gz.fisz("fivt", fitc(int ), (int)43);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl89
                }
lbl80:
                // 2 sources

                case 4: {
                    var2_2 /* !! */  = (int)gz.fisz("fivu", fitc(int ), (int)44);
                    if (!var3_1) break block22;
                    throw null;
                }
lbl84:
                // 2 sources

                case 5: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)gz.fisz("fivv", fitc(int ), (int)45);
                        if (!var3_1) ** GOTO lbl70
                        throw null;
                    }
                }
lbl89:
                // 3 sources

                case 6: {
                    var2_2 /* !! */  = (int)gz.fisz("fivw", fitc(int ), (int)46);
                    if (!var3_1) ** GOTO lbl80
                    throw null;
                }
                case 7: 
            }
        }
        var2_2 /* !! */  = (int)gz.fisz("fivx", fitc(int ), (int)47);
        ** while (!var3_1)
lbl96:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fkbx() {
        gz.fisx[300] = -1006467202;
        gz.fisx[301] = -217438067;
        gz.fisx[302] = 644894205;
        gz.fisx[303] = -85170548;
        gz.fisx[304] = -773575031;
        gz.fisx[305] = -1386509702;
        gz.fisx[306] = 666330065;
        gz.fisx[307] = -1534014856;
        gz.fisx[308] = -836411791;
        gz.fisx[309] = 504029949;
        gz.fisx[310] = -1975922194;
        gz.fisx[311] = 762890228;
        gz.fisx[312] = 1154454968;
        gz.fisx[313] = 9613735;
        gz.fisx[314] = -618949168;
        gz.fisx[315] = 1378647947;
        gz.fisx[316] = 1823701752;
        gz.fisx[317] = -905556641;
        gz.fisx[318] = -1513033830;
        gz.fisx[319] = -796995888;
        gz.fisx[320] = -1963124688;
        gz.fisx[321] = 980933191;
        gz.fisx[322] = -1345653253;
        gz.fisx[323] = 1636456012;
        gz.fisx[324] = 513973594;
        gz.fisx[325] = -465520297;
        gz.fisx[326] = 1668916305;
        gz.fisx[327] = -1430392385;
        gz.fisx[328] = -445003601;
        gz.fisx[329] = 1461171303;
        gz.fisx[330] = 1452674081;
        gz.fisx[331] = -1882453636;
        gz.fisx[332] = -1833199756;
        gz.fisx[333] = -1590155890;
        gz.fisx[334] = 1859208372;
        gz.fisx[335] = 22435885;
        gz.fisx[336] = 2001640946;
        gz.fisx[337] = -1715422089;
        gz.fisx[338] = 456181238;
        gz.fisx[339] = 1961505389;
        gz.fisx[340] = 1276137420;
        gz.fisx[341] = 1965420604;
        gz.fisx[342] = 1471709682;
        gz.fisx[343] = -1339149288;
        gz.fisx[344] = 850280475;
        gz.fisx[345] = -1140542565;
        gz.fisx[346] = 852369484;
        gz.fisx[347] = 283703443;
        gz.fisx[348] = -1146530491;
        gz.fisx[349] = 628404254;
        gz.fisx[350] = -37387490;
        gz.fisx[351] = 1938821287;
        gz.fisx[352] = 140831750;
        gz.fisx[353] = 1441156109;
        gz.fisx[354] = -1775910571;
        gz.fisx[355] = 605630782;
        gz.fisx[356] = -1617281947;
        gz.fisx[357] = -130669334;
        gz.fisx[358] = -600068895;
        gz.fisx[359] = 490218666;
        gz.fisx[360] = -1236061741;
        gz.fisx[361] = 957476623;
        gz.fisx[362] = -669461295;
        gz.fisx[363] = -2130142847;
        gz.fisx[364] = -1744811728;
        gz.fisx[365] = 2115367898;
        gz.fisx[366] = -962060355;
        gz.fisx[367] = -25159393;
        gz.fisx[368] = -277794175;
        gz.fisx[369] = 80321318;
        gz.fisx[370] = -680566341;
        gz.fisx[371] = -1074412372;
        gz.fisx[372] = -1599063799;
        gz.fisx[373] = 219462456;
        gz.fisx[374] = 1260886433;
        gz.fisx[375] = 2110955971;
        gz.fisx[376] = -1791182769;
        gz.fisx[377] = 1714331259;
        gz.fisx[378] = 1238085868;
        gz.fisx[379] = 1851168743;
        gz.fisx[380] = -1054793109;
        gz.fisx[381] = -274533350;
        gz.fisx[382] = -1235753619;
        gz.fisx[383] = 1703633498;
        gz.fisx[384] = -198879089;
        gz.fisx[385] = -1592253902;
        gz.fisx[386] = 1836205585;
        gz.fisx[387] = -2143282449;
        gz.fisx[388] = -148480331;
        gz.fisx[389] = 1715840630;
        gz.fisx[390] = 1289149252;
        gz.fisx[391] = -277011169;
        gz.fisx[392] = 2124982382;
        gz.fisx[393] = -129989639;
        gz.fisx[394] = -1847039344;
        gz.fisx[395] = -1064725254;
        gz.fisx[396] = -1588951013;
        gz.fisx[397] = 1966008367;
        gz.fisx[398] = 678490649;
        gz.fisx[399] = -40345163;
    }

    private static /* synthetic */ double fjcs(int n2) {
        return Double.longBitsToDouble(fits[n2] ^ fitt[n2]);
    }

    private static /* synthetic */ void fkcg() {
        gz.fits[0] = -5513327330425711939L;
        gz.fits[1] = -9151136113544901570L;
        gz.fits[2] = 9219807652688585929L;
        gz.fits[3] = 4367537043154006466L;
        gz.fits[4] = -1001944332691890870L;
        gz.fits[5] = -657932587571016697L;
        gz.fits[6] = -7954304513121425586L;
        gz.fits[7] = 3814676188634858413L;
        gz.fits[8] = -4720175129531263217L;
        gz.fits[9] = -300436688749184010L;
        gz.fits[10] = -8918413525528408645L;
        gz.fits[11] = -184994797616609037L;
        gz.fits[12] = 7961518482187091197L;
        gz.fits[13] = -4577582624930760966L;
        gz.fits[14] = -6817440262006812489L;
        gz.fits[15] = 3113494316244919838L;
        gz.fits[16] = 6171242838733634921L;
        gz.fits[17] = -2282168024064844386L;
        gz.fits[18] = -5288684276900338403L;
        gz.fits[19] = 5982123597197896327L;
        gz.fits[20] = -7931167089180882903L;
        gz.fits[21] = -3198531742908427329L;
        gz.fits[22] = -2832094060497162276L;
        gz.fits[23] = 2627698809687283611L;
        gz.fits[24] = 7561275015644150616L;
        gz.fits[25] = -1232212565660282676L;
        gz.fits[26] = -7239652566261306132L;
        gz.fits[27] = 8665719024220523109L;
        gz.fits[28] = -6123580612594102020L;
        gz.fits[29] = -6705088065984998998L;
        gz.fits[30] = -1479148749288003377L;
        gz.fits[31] = 8522175315821723649L;
        gz.fits[32] = -3813739362646011316L;
        gz.fits[33] = 3307189011119738917L;
        gz.fits[34] = 7092818327253296428L;
        gz.fits[35] = 1891413875230826065L;
        gz.fits[36] = 2467768731657668343L;
        gz.fits[37] = 452035493077575426L;
        gz.fits[38] = -3196182636575535643L;
        gz.fits[39] = 8413079717384984784L;
        gz.fits[40] = -3959773688011099411L;
        gz.fits[41] = -3197015741753904176L;
        gz.fits[42] = -8356556963246418688L;
        gz.fits[43] = -5145560311862688456L;
        gz.fits[44] = 319775608243361180L;
        gz.fits[45] = 3580910452163137794L;
        gz.fits[46] = 1292133898227973214L;
        gz.fits[47] = -9126765129677951216L;
        gz.fits[48] = -4474033147320478092L;
        gz.fits[49] = 4183246181637511767L;
        gz.fits[50] = -8446612040320613771L;
        gz.fits[51] = -5148335156659782188L;
        gz.fits[52] = -538222960421406338L;
        gz.fits[53] = -5218842469585657783L;
        gz.fits[54] = -3861899125052784896L;
        gz.fits[55] = 4872967949095306390L;
        gz.fits[56] = 927391015989979355L;
        gz.fits[57] = 6855052904002991554L;
        gz.fits[58] = -8474234237118287015L;
        gz.fits[59] = -2325350938472702095L;
        gz.fits[60] = 8720927779697429098L;
        gz.fits[61] = 1003540998248671979L;
        gz.fits[62] = 3665842098812188837L;
        gz.fits[63] = 7926005947938485969L;
        gz.fits[64] = 1654928555446160417L;
        gz.fits[65] = 3830900155225718474L;
        gz.fits[66] = 1418804220663982518L;
        gz.fits[67] = 2364891828545503515L;
        gz.fits[68] = 3751591322987996895L;
        gz.fits[69] = 1585841749220764290L;
        gz.fits[70] = -9178405329287645463L;
        gz.fits[71] = -4422455631505863690L;
        gz.fits[72] = -7609844781095784136L;
        gz.fits[73] = -2960074006395312459L;
        gz.fits[74] = -4793078924656711488L;
        gz.fits[75] = -8963555031709658642L;
        gz.fits[76] = 6741775926217058926L;
        gz.fits[77] = 7377483492128285926L;
        gz.fits[78] = 3892090378631970602L;
        gz.fits[79] = 3433998771964278584L;
        gz.fits[80] = -6460468734112245197L;
        gz.fits[81] = -4310293504369088842L;
        gz.fits[82] = 2318254223811732797L;
        gz.fits[83] = -2352287476465398507L;
        gz.fits[84] = 8834973931336168877L;
        gz.fits[85] = -4276367583629665908L;
        gz.fits[86] = -1393097825708515745L;
        gz.fits[87] = 3297440200028706220L;
        gz.fits[88] = 8081814897311552709L;
        gz.fits[89] = 1866263142955850437L;
        gz.fits[90] = 5947509441987028241L;
        gz.fits[91] = 5197609291142485860L;
        gz.fits[92] = -4116346454061101315L;
        gz.fits[93] = 4828310652159825453L;
        gz.fits[94] = 378845250652904731L;
        gz.fits[95] = 4339449692159777960L;
        gz.fits[96] = 4645075445797736480L;
        gz.fits[97] = -1746988895524448053L;
        gz.fits[98] = 7756283210278920211L;
        gz.fits[99] = 5221776205218223264L;
    }

    private static /* synthetic */ void fkcb() {
        gz.fisy[100] = 471551079;
        gz.fisy[101] = 560034903;
        gz.fisy[102] = 254168073;
        gz.fisy[103] = -1946989802;
        gz.fisy[104] = -1926041956;
        gz.fisy[105] = -2121023106;
        gz.fisy[106] = -2026863693;
        gz.fisy[107] = 1167906250;
        gz.fisy[108] = -1415555787;
        gz.fisy[109] = -1025166224;
        gz.fisy[110] = -634109055;
        gz.fisy[111] = 1153499566;
        gz.fisy[112] = -1194204934;
        gz.fisy[113] = 601857930;
        gz.fisy[114] = -920088511;
        gz.fisy[115] = 1351235691;
        gz.fisy[116] = 688783475;
        gz.fisy[117] = 1243638147;
        gz.fisy[118] = -1253862120;
        gz.fisy[119] = 103697813;
        gz.fisy[120] = 2027512749;
        gz.fisy[121] = -1576095773;
        gz.fisy[122] = 1584105196;
        gz.fisy[123] = -1283774396;
        gz.fisy[124] = 1202071614;
        gz.fisy[125] = 682400949;
        gz.fisy[126] = -28845567;
        gz.fisy[127] = -24383005;
        gz.fisy[128] = -1954856571;
        gz.fisy[129] = -398728325;
        gz.fisy[130] = -344085018;
        gz.fisy[131] = -576594361;
        gz.fisy[132] = -1502371530;
        gz.fisy[133] = 796432737;
        gz.fisy[134] = 1676448658;
        gz.fisy[135] = 775479555;
        gz.fisy[136] = 1458103317;
        gz.fisy[137] = 1739381942;
        gz.fisy[138] = 1383010761;
        gz.fisy[139] = -1558060039;
        gz.fisy[140] = 1310033665;
        gz.fisy[141] = 1259536279;
        gz.fisy[142] = 519343044;
        gz.fisy[143] = 2079413044;
        gz.fisy[144] = 1530325043;
        gz.fisy[145] = -232576532;
        gz.fisy[146] = -50303472;
        gz.fisy[147] = 1302991349;
        gz.fisy[148] = -1158178617;
        gz.fisy[149] = -960190824;
        gz.fisy[150] = 116704694;
        gz.fisy[151] = 846867723;
        gz.fisy[152] = 812565116;
        gz.fisy[153] = 1730826220;
        gz.fisy[154] = 1917625755;
        gz.fisy[155] = -1377837465;
        gz.fisy[156] = 243901879;
        gz.fisy[157] = 312790875;
        gz.fisy[158] = -1672675799;
        gz.fisy[159] = -119360017;
        gz.fisy[160] = -2105510963;
        gz.fisy[161] = -2010340236;
        gz.fisy[162] = -839333073;
        gz.fisy[163] = -663356526;
        gz.fisy[164] = 38275457;
        gz.fisy[165] = -1542379764;
        gz.fisy[166] = -1149256699;
        gz.fisy[167] = -2083086692;
        gz.fisy[168] = 1090932171;
        gz.fisy[169] = 1465448634;
        gz.fisy[170] = -1389577740;
        gz.fisy[171] = -83343798;
        gz.fisy[172] = -5818149;
        gz.fisy[173] = 1261672839;
        gz.fisy[174] = 1347154132;
        gz.fisy[175] = -742762591;
        gz.fisy[176] = 1158465372;
        gz.fisy[177] = 480449510;
        gz.fisy[178] = -1412022795;
        gz.fisy[179] = 1578566779;
        gz.fisy[180] = 1345609213;
        gz.fisy[181] = 1132458977;
        gz.fisy[182] = 153758018;
        gz.fisy[183] = -796149790;
        gz.fisy[184] = 55599404;
        gz.fisy[185] = -1956053611;
        gz.fisy[186] = -1694970717;
        gz.fisy[187] = 985363360;
        gz.fisy[188] = -1317206748;
        gz.fisy[189] = 1481856736;
        gz.fisy[190] = -1106293341;
        gz.fisy[191] = 2042688278;
        gz.fisy[192] = 2107873834;
        gz.fisy[193] = -1970857896;
        gz.fisy[194] = 789302611;
        gz.fisy[195] = -2081446068;
        gz.fisy[196] = 1495822220;
        gz.fisy[197] = 1137425258;
        gz.fisy[198] = -973653831;
        gz.fisy[199] = -1060663204;
    }

    private static /* synthetic */ int fitc(int n2) {
        return fisx[n2] ^ fisy[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ boolean lambda$findTarget$0(class_742 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gz.me - gz.fisz("fkax", fitr(int ), (int)174)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == gz.fisz("fkay", fitc(int ), (int)571)) break;
            v0 /* !! */  = (long)gz.fisz("fkaz", fitc(int ), (int)572);
        }
        var4_2 = gz.c;
        v1 /* !! */  = gz.me;
        if (true) ** GOTO lbl12
        block13: while (true) {
            v1 /* !! */  = (long)(v2 - gz.fisz("fkba", fitr(int ), (int)175));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1820026698: {
                    v2 = gz.fisz("fkbb", fitr(int ), (int)176);
                    continue block13;
                }
                case -1712186517: {
                    v2 = gz.fisz("fkbc", fitr(int ), (int)177);
                    continue block13;
                }
                case -683004795: {
                    v2 = gz.fisz("fkbd", fitr(int ), (int)178);
                    continue block13;
                }
                case 1124680564: {
                    break block13;
                }
            }
            break;
        }
        var3_3 = gz.b;
        v3 /* !! */  = gz.me;
        if (true) ** GOTO lbl29
        block14: while (true) {
            v3 /* !! */  = (long)(v4 - gz.fisz("fkbe", fitr(int ), (int)179));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1933858813: {
                    v4 = gz.fisz("fkbf", fitr(int ), (int)180);
                    continue block14;
                }
                case -1002793004: {
                    v4 = gz.fisz("fkbg", fitr(int ), (int)181);
                    continue block14;
                }
                case 1124680564: {
                    break block14;
                }
                case 2126212657: {
                    v4 = gz.fisz("fkbh", fitr(int ), (int)182);
                    continue block14;
                }
            }
            break;
        }
        var2_4 = gz.a;
        if (var4_2) {
            throw null;
lbl44:
            // 1 sources

            return (boolean)gz.fisz("fkbi", fitc(int ), (int)573);
        }
        ** while (var2_4 || var2_4)
lbl47:
        // 1 sources

        v5 = gz.fisz("fkbj", fitc(int ), (int)574);
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = gz.me - gz.fisz("fkbk", fitr(int ), (int)183)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == gz.fisz("fkbl", fitc(int ), (int)575)) break;
            v6 /* !! */  = (long)gz.fisz("fkbn", fitc(int ), (int)576);
        }
        return this.isValidTarget((class_1657)var1_1, (boolean)v5);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block108: {
            block107: {
                block106: {
                    block105: {
                        block104: {
                            block103: {
                                var8_2 = gz.c;
                                var7_3 /* !! */  = gz.b;
                                var6_4 = gz.a;
                                if (var8_2) {
                                    throw null;
lbl6:
                                    // 29 sources

                                    return;
                                }
                                if (var6_4 || var6_4) ** GOTO lbl6
                                if (!var1_1.isSend()) break block103;
                                if (var6_4) ** GOTO lbl6
                                if (this.replacingCrossbowPacket) break block103;
                                if (var6_4) ** GOTO lbl6
                                if (this.aimAngle == null) break block103;
                                if (var6_4) ** GOTO lbl6
                                if (gz.mc.field_1724 == null) break block103;
                                if (var6_4 || var6_4) ** GOTO lbl6
                                var3_5 = var1_1.getPacket();
                                if (var6_4) ** GOTO lbl6
                                if (!(var3_5 instanceof class_2886)) break block103;
                                if (var6_4) ** GOTO lbl6
                                var2_6 = (class_2886)var3_5;
                                if (var6_4 || var6_4) ** GOTO lbl6
                                if (var8_2) {
                                    throw null;
                                }
                                break block104;
                            }
                            if (var6_4 || var6_4) ** GOTO lbl6
                            return;
                        }
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (var2_6.method_12551() != class_1268.field_5808) break block105;
                        if (var6_4 || var6_4) ** GOTO lbl6
                        v0 = gz.mc.field_1724.method_6047();
                        if (var8_2) {
                            throw null;
                        }
                        break block106;
                    }
                    if (var6_4 || var6_4) ** GOTO lbl6
                    v0 = var3_5 = gz.mc.field_1724.method_6079();
                }
                if (var6_4 || var6_4) ** GOTO lbl6
                if (!(var3_5.method_7909() instanceof class_1764)) break block107;
                if (var6_4) ** GOTO lbl6
                if (class_1764.method_7781((class_1799)var3_5)) break block108;
                if (var6_4) ** GOTO lbl6
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            return;
        }
        if (var6_4) ** GOTO lbl6
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) ** GOTO lbl6
                var4_7 = this.getAimAngle();
                if (var6_4 || var6_4) ** GOTO lbl6
                if (var4_7 != null) ** GOTO lbl60
                if (var6_4) ** GOTO lbl6
                return;
lbl60:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl6
                var1_1.setCancelled((boolean)gz.fisz("fjap", fitc(int ), (int)141));
                if (var6_4 || var6_4) ** GOTO lbl6
                this.replacingCrossbowPacket = gz.fisz("fjaq", fitc(int ), (int)142);
                if (var6_4) ** GOTO lbl6
                try {
                    if (var6_4) ** GOTO lbl6
                    gz.mc.method_1562().method_52787((class_2596)new class_2886(var2_6.method_12551(), var2_6.method_42081(), var4_7.getYaw(), var4_7.getPitch()));
                    if (var6_4 || var6_4) ** GOTO lbl6
                }
                catch (Throwable var5_8) {
                    if (var6_4 || var6_4) ** GOTO lbl6
                    this.replacingCrossbowPacket = gz.fisz("fjas", fitc(int ), (int)144);
                    if (var6_4 || var6_4) ** GOTO lbl6
                    throw var5_8;
                }
                this.replacingCrossbowPacket = gz.fisz("fjar", fitc(int ), (int)143);
                if (var6_4 || var6_4) ** GOTO lbl6
                if (var8_2) {
                    throw null;
                }
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_3 /* !! */  = (int)gz.fisz("fjat", fitc(int ), (int)145);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 1: {
                var7_3 /* !! */  = (int)gz.fisz("fjau", fitc(int ), (int)146);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl92:
            // 3 sources

            case 2: {
                var7_3 /* !! */  = (int)gz.fisz("fjav", fitc(int ), (int)147);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl281
            }
            case 3: {
                var7_3 /* !! */  = (int)gz.fisz("fjaw", fitc(int ), (int)148);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 4: {
                var7_3 /* !! */  = (int)gz.fisz("fjax", fitc(int ), (int)149);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl107:
            // 3 sources

            case 5: {
                var7_3 /* !! */  = (int)gz.fisz("fjay", fitc(int ), (int)150);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl136
            }
lbl112:
            // 2 sources

            case 6: {
                var7_3 /* !! */  = (int)gz.fisz("fjaz", fitc(int ), (int)151);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 7: {
                var7_3 /* !! */  = (int)gz.fisz("fjba", fitc(int ), (int)152);
                if (!var8_2) ** GOTO lbl107
                throw null;
            }
lbl121:
            // 3 sources

            case 8: {
                var7_3 /* !! */  = (int)gz.fisz("fjbb", fitc(int ), (int)153);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl126:
            // 2 sources

            case 9: {
                var7_3 /* !! */  = (int)gz.fisz("fjbc", fitc(int ), (int)154);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
lbl131:
            // 3 sources

            case 10: {
                var7_3 /* !! */  = (int)gz.fisz("fjbd", fitc(int ), (int)155);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl136:
            // 3 sources

            case 11: {
                var7_3 /* !! */  = (int)gz.fisz("fjbe", fitc(int ), (int)156);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl141:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)gz.fisz("fjbf", fitc(int ), (int)157);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 13: {
                var7_3 /* !! */  = (int)gz.fisz("fjbg", fitc(int ), (int)158);
                if (!var8_2) ** GOTO lbl92
                throw null;
            }
            case 14: {
                var7_3 /* !! */  = (int)gz.fisz("fjbh", fitc(int ), (int)159);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl155:
            // 3 sources

            case 15: {
                var7_3 /* !! */  = (int)gz.fisz("fjbi", fitc(int ), (int)160);
                if (!var8_2) ** GOTO lbl92
                throw null;
            }
            case 16: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)gz.fisz("fjbj", fitc(int ), (int)161);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl210
                    break;
                }
            }
            case 17: {
                var7_3 /* !! */  = (int)gz.fisz("fjbk", fitc(int ), (int)162);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl170:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)gz.fisz("fjbl", fitc(int ), (int)163);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl273
            }
            case 19: {
                var7_3 /* !! */  = (int)gz.fisz("fjbm", fitc(int ), (int)164);
                if (!var8_2) ** GOTO lbl155
                throw null;
            }
lbl179:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)gz.fisz("fjbn", fitc(int ), (int)165);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 21: {
                var7_3 /* !! */  = (int)gz.fisz("fjbo", fitc(int ), (int)166);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl301
            }
            case 22: {
                var7_3 /* !! */  = (int)gz.fisz("fjbp", fitc(int ), (int)167);
                if (var8_2) {
                    throw null;
                }
            }
            case 23: {
                var7_3 /* !! */  = (int)gz.fisz("fjbq", fitc(int ), (int)168);
                if (!var8_2) ** GOTO lbl131
                throw null;
            }
            case 24: {
                var7_3 /* !! */  = (int)gz.fisz("fjbr", fitc(int ), (int)169);
                if (!var8_2) ** GOTO lbl112
                throw null;
            }
            case 25: {
                var7_3 /* !! */  = (int)gz.fisz("fjbs", fitc(int ), (int)170);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 26: {
                var7_3 /* !! */  = (int)gz.fisz("fjbt", fitc(int ), (int)171);
                if (!var8_2) ** GOTO lbl179
                throw null;
            }
lbl210:
            // 4 sources

            case 27: {
                var7_3 /* !! */  = (int)gz.fisz("fjbu", fitc(int ), (int)172);
                if (!var8_2) ** GOTO lbl131
                throw null;
            }
lbl214:
            // 4 sources

            case 28: {
                var7_3 /* !! */  = (int)gz.fisz("fjbv", fitc(int ), (int)173);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl219:
            // 2 sources

            case 29: {
                var7_3 /* !! */  = (int)gz.fisz("fjbw", fitc(int ), (int)174);
                if (var8_2) {
                    throw null;
                }
            }
            case 30: {
                var7_3 /* !! */  = (int)gz.fisz("fjbx", fitc(int ), (int)175);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl228:
            // 3 sources

            case 31: {
                var7_3 /* !! */  = (int)gz.fisz("fjby", fitc(int ), (int)176);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
lbl232:
            // 2 sources

            case 32: {
                var7_3 /* !! */  = (int)gz.fisz("fjbz", fitc(int ), (int)177);
                if (var8_2) {
                    throw null;
                }
            }
lbl236:
            // 5 sources

            case 33: {
                var7_3 /* !! */  = (int)gz.fisz("fjca", fitc(int ), (int)178);
                if (!var8_2) ** GOTO lbl141
                throw null;
            }
lbl240:
            // 2 sources

            case 34: {
                var7_3 /* !! */  = (int)gz.fisz("fjcb", fitc(int ), (int)179);
                if (!var8_2) ** GOTO lbl219
                throw null;
            }
lbl244:
            // 4 sources

            case 35: {
                var7_3 /* !! */  = (int)gz.fisz("fjcc", fitc(int ), (int)180);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl265
            }
            case 36: {
                var7_3 /* !! */  = (int)gz.fisz("fjcd", fitc(int ), (int)181);
                if (!var8_2) ** GOTO lbl126
                throw null;
            }
lbl253:
            // 2 sources

            case 37: {
                var7_3 /* !! */  = (int)gz.fisz("fjce", fitc(int ), (int)182);
                if (!var8_2) ** GOTO lbl214
                throw null;
            }
lbl257:
            // 5 sources

            case 38: {
                var7_3 /* !! */  = (int)gz.fisz("fjcf", fitc(int ), (int)183);
                if (!var8_2) ** GOTO lbl214
                throw null;
            }
            case 39: {
                var7_3 /* !! */  = (int)gz.fisz("fjcg", fitc(int ), (int)184);
                if (!var8_2) ** GOTO lbl107
                throw null;
            }
lbl265:
            // 2 sources

            case 40: {
                var7_3 /* !! */  = (int)gz.fisz("fjch", fitc(int ), (int)185);
                if (!var8_2) ** GOTO lbl228
                throw null;
            }
            case 41: {
                var7_3 /* !! */  = (int)gz.fisz("fjci", fitc(int ), (int)186);
                if (!var8_2) ** GOTO lbl155
                throw null;
            }
lbl273:
            // 4 sources

            case 42: {
                var7_3 /* !! */  = (int)gz.fisz("fjcj", fitc(int ), (int)187);
                if (!var8_2) ** GOTO lbl257
                throw null;
            }
            case 43: {
                var7_3 /* !! */  = (int)gz.fisz("fjck", fitc(int ), (int)188);
                if (!var8_2) ** GOTO lbl273
                throw null;
            }
lbl281:
            // 2 sources

            case 44: {
                var7_3 /* !! */  = (int)gz.fisz("fjcl", fitc(int ), (int)189);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
lbl285:
            // 2 sources

            case 45: {
                var7_3 /* !! */  = (int)gz.fisz("fjcm", fitc(int ), (int)190);
                if (!var8_2) ** GOTO lbl257
                throw null;
            }
            case 46: {
                var7_3 /* !! */  = (int)gz.fisz("fjcn", fitc(int ), (int)191);
                if (!var8_2) ** GOTO lbl141
                throw null;
            }
            case 47: {
                var7_3 /* !! */  = (int)gz.fisz("fjco", fitc(int ), (int)192);
                if (!var8_2) ** GOTO lbl136
                throw null;
            }
            case 48: {
                var7_3 /* !! */  = (int)gz.fisz("fjcp", fitc(int ), (int)193);
                if (!var8_2) ** GOTO lbl240
                throw null;
            }
lbl301:
            // 3 sources

            case 49: {
                var7_3 /* !! */  = (int)gz.fisz("fjcq", fitc(int ), (int)194);
                if (!var8_2) ** GOTO lbl170
                throw null;
            }
            case 50: 
        }
        var7_3 /* !! */  = (int)gz.fisz("fjcr", fitc(int ), (int)195);
        ** while (!var8_2)
lbl308:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1657 findTarget() {
        v0 /* !! */  = gz.me;
        if (true) ** GOTO lbl5
        block31: while (true) {
            v0 /* !! */  = (long)(v1 - gz.fisz("fjff", fitr(int ), (int)56));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1930463141: {
                    v1 = gz.fisz("fjfk", fitr(int ), (int)57);
                    continue block31;
                }
                case 1124680564: {
                    break block31;
                }
                case 1524524129: {
                    v1 = gz.fisz("fjfl", fitr(int ), (int)58);
                    continue block31;
                }
            }
            break;
        }
        var3_1 = gz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gz.me - gz.fisz("fjfm", fitr(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gz.fisz("fjfn", fitc(int ), (int)230)) break;
            v2 /* !! */  = (long)gz.fisz("fjfo", fitc(int ), (int)231);
        }
        var2_2 = gz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gz.me - gz.fisz("fjfp", fitr(int ), (int)60)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gz.fisz("fjfq", fitc(int ), (int)232)) break;
            v3 /* !! */  = (long)gz.fisz("fjfu", fitc(int ), (int)233);
        }
        var1_3 = gz.a;
        if (var3_1) {
            throw null;
lbl29:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl32:
        // 1 sources

        v4 /* !! */  = gz.me;
        if (true) ** GOTO lbl36
        block35: while (true) {
            v4 /* !! */  = (long)(v5 - gz.fisz("fjfw", fitr(int ), (int)61));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 905710295: {
                    v5 = gz.fisz("fjfx", fitr(int ), (int)62);
                    continue block35;
                }
                case 990030771: {
                    v5 = gz.fisz("fjfz", fitr(int ), (int)63);
                    continue block35;
                }
                case 1124680564: {
                    break block35;
                }
                case 1514312844: {
                    v5 = gz.fisz("fjgb", fitr(int ), (int)64);
                    continue block35;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = gz.me - gz.fisz("fjgc", fitr(int ), (int)65)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == gz.fisz("fjgd", fitc(int ), (int)234)) break;
            v6 /* !! */  = (long)gz.fisz("fjge", fitc(int ), (int)235);
        }
        v7 = gz.mc.field_1687;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = gz.me - gz.fisz("fjgf", fitr(int ), (int)66)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gz.fisz("fjgg", fitc(int ), (int)236)) break;
            v8 /* !! */  = (long)gz.fisz("fjgi", fitc(int ), (int)237);
        }
        v9 = v7.method_18456();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_4 = gz.me - gz.fisz("fjgk", fitr(int ), (int)67)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gz.fisz("fjgm", fitc(int ), (int)238)) break;
            v10 /* !! */  = (long)gz.fisz("fjgr", fitc(int ), (int)239);
        }
        v11 = v9.stream();
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_5 = gz.me - gz.fisz("fjgs", fitr(int ), (int)68)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == gz.fisz("fjgt", fitc(int ), (int)240)) break;
            v12 /* !! */  = (long)gz.fisz("fjgu", fitc(int ), (int)241);
        }
        v13 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findTarget$0(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)((gz)this);
        v14 /* !! */  = gz.me;
        if (true) ** GOTO lbl76
        block40: while (true) {
            v14 /* !! */  = (long)(v15 - gz.fisz("fjgv", fitr(int ), (int)69));
lbl76:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -486848575: {
                    v15 = gz.fisz("fjgw", fitr(int ), (int)70);
                    continue block40;
                }
                case 414974592: {
                    v15 = gz.fisz("fjgx", fitr(int ), (int)71);
                    continue block40;
                }
                case 1124680564: {
                    break block40;
                }
            }
            break;
        }
        v16 = v11.filter(v13);
        v17 /* !! */  = gz.me;
        if (true) ** GOTO lbl90
        block41: while (true) {
            v17 /* !! */  = (long)(v18 - gz.fisz("fjgz", fitr(int ), (int)72));
lbl90:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1277480745: {
                    v18 = gz.fisz("fjhc", fitr(int ), (int)73);
                    continue block41;
                }
                case -223944234: {
                    v18 = gz.fisz("fjhe", fitr(int ), (int)74);
                    continue block41;
                }
                case 747036332: {
                    v18 = gz.fisz("fjhg", fitr(int ), (int)75);
                    continue block41;
                }
                case 1124680564: {
                    break block41;
                }
            }
            break;
        }
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_6 = gz.me - gz.fisz("fjhi", fitr(int ), (int)76)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == gz.fisz("fjhj", fitc(int ), (int)242)) break;
            v19 /* !! */  = (long)gz.fisz("fjhk", fitc(int ), (int)243);
        }
        v20 = gz.mc.field_1724;
        v21 /* !! */  = gz.me;
        if (true) ** GOTO lbl112
        block43: while (true) {
            v21 /* !! */  = (long)(v22 - gz.fisz("fjhl", fitr(int ), (int)77));
lbl112:
            // 2 sources

            switch ((int)v21 /* !! */ ) {
                case 61617209: {
                    v22 = gz.fisz("fjhm", fitr(int ), (int)78);
                    continue block43;
                }
                case 260462223: {
                    v22 = gz.fisz("fjhs", fitr(int ), (int)79);
                    continue block43;
                }
                case 1124680564: {
                    break block43;
                }
            }
            break;
        }
        Objects.requireNonNull(v20);
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_7 = gz.me - gz.fisz("fjht", fitr(int ), (int)80)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == gz.fisz("fjhu", fitc(int ), (int)244)) break;
            v23 /* !! */  = (long)gz.fisz("fjhv", fitc(int ), (int)245);
        }
        v24 = (ToDoubleFunction<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, method_5858(net.minecraft.class_1297 ), (Lnet/minecraft/class_742;)D)((class_746)v20);
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_8 = gz.me - gz.fisz("fjhw", fitr(int ), (int)81)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == gz.fisz("fjic", fitc(int ), (int)246)) break;
            v25 /* !! */  = (long)gz.fisz("fjie", fitc(int ), (int)247);
        }
        v26 = Comparator.comparingDouble(v24);
        v27 /* !! */  = gz.me;
        if (true) ** GOTO lbl139
        block46: while (true) {
            v27 /* !! */  = (long)(gz.fisz("fjig", fitr(int ), (int)83) - gz.fisz("fjif", fitr(int ), (int)82));
lbl139:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case 1124680564: {
                    break block46;
                }
                case 1558418299: {
                    continue block46;
                }
            }
            break;
        }
        v28 = v16.min(v26);
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_9 = gz.me - gz.fisz("fjih", fitr(int ), (int)84)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == gz.fisz("fjii", fitc(int ), (int)248)) break;
            v29 /* !! */  = (long)gz.fisz("fjij", fitc(int ), (int)249);
        }
        return v28.orElse(null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov calculateProjectileAngle(class_1657 var1_1, gz$WeaponState var2_2) {
        var13_3 = gz.c;
        var12_4 /* !! */  = gz.b;
        var11_5 = gz.a;
        if (var13_3) {
            throw null;
lbl6:
            // 14 sources

            return null;
        }
        if (var11_5 || var11_5) ** GOTO lbl6
        var3_6 = gz.mc.field_1724.method_33571().method_1031(0.0, (double)gz.fisz("fjki", fjcs(int ), (int)85), 0.0);
        if (var12_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var12_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var11_5 || var11_5) ** GOTO lbl6
                var4_7 = var1_1.method_5829().method_1005();
                if (var11_5 || var11_5) ** GOTO lbl6
                if (!this.predict.isValue()) ** GOTO lbl26
                if (var11_5 || var11_5) ** GOTO lbl6
                this.updateTargetVelocity(var1_1);
                if (var11_5 || var11_5) ** GOTO lbl6
                var5_8 = this.calculateInterceptTicks(var3_6, var4_7, this.smoothedTargetVelocity, var2_2.speed());
                if (var11_5 || var11_5) ** GOTO lbl6
                var7_10 = Math.min((double)gz.fisz("fjkj", fjcs(int ), (int)86), var5_8 + this.getNetworkDelayTicks() + gz.fisz("fjkk", fjcs(int ), (int)87));
                if (var11_5 || var11_5) ** GOTO lbl6
                var4_7 = var4_7.method_1031(this.smoothedTargetVelocity.field_1352 * var7_10, 0.0, this.smoothedTargetVelocity.field_1350 * var7_10);
                if (var11_5) ** GOTO lbl6
lbl26:
                // 2 sources

                if (var11_5 || var11_5) ** GOTO lbl6
                var5_9 = var4_7.method_1020(var3_6);
                if (var11_5 || var11_5) ** GOTO lbl6
                var6_11 = Math.hypot(var5_9.field_1352, var5_9.field_1350);
                if (var11_5 || var11_5) ** GOTO lbl6
                var8_12 = class_3532.method_15393((float)((float)Math.toDegrees(Math.atan2(var5_9.field_1350, var5_9.field_1352)) - gz.fisz("fjkl", fisw(int ), (int)292)));
                if (var11_5 || var11_5) ** GOTO lbl6
                var9_13 = class_3532.method_15363((float)((float)(-Math.toDegrees(Math.atan2(var5_9.field_1351, var6_11)))), (float)gz.fisz("fjkm", fisw(int ), (int)293), (float)gz.fisz("fjkn", fisw(int ), (int)294));
                if (var11_5 || var11_5) ** GOTO lbl6
                var10_14 = this.calculateLowBallisticPitch(var6_11, var5_9.field_1351, var2_2.speed(), var9_13);
                if (!var11_5 && !var11_5) ** break;
                ** continue;
                return new ov(var8_12, var10_14);
            }
lbl39:
            // 2 sources

            case 0: {
                var12_4 /* !! */  = (int)gz.fisz("fjko", fitc(int ), (int)295);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl49
            }
lbl44:
            // 3 sources

            case 1: {
                var12_4 /* !! */  = (int)gz.fisz("fjkp", fitc(int ), (int)296);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl49:
            // 2 sources

            case 2: {
                var12_4 /* !! */  = (int)gz.fisz("fjkq", fitc(int ), (int)297);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 3: {
                var12_4 /* !! */  = (int)gz.fisz("fjkr", fitc(int ), (int)298);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl78
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var12_4 /* !! */  = (int)gz.fisz("fjks", fitc(int ), (int)299);
                    if (var13_3) {
                        throw null;
                    }
                    ** GOTO lbl118
                    break;
                }
            }
lbl65:
            // 3 sources

            case 5: {
                var12_4 /* !! */  = (int)gz.fisz("fjkt", fitc(int ), (int)300);
                if (!var13_3) ** GOTO lbl39
                throw null;
            }
lbl69:
            // 2 sources

            case 6: {
                do {
                    var12_4 /* !! */  = (int)gz.fisz("fjku", fitc(int ), (int)301);
                } while (!var13_3);
                throw null;
            }
            case 7: {
                var12_4 /* !! */  = (int)gz.fisz("fjkv", fitc(int ), (int)302);
                if (!var13_3) ** GOTO lbl44
                throw null;
            }
lbl78:
            // 2 sources

            case 8: {
                var12_4 /* !! */  = (int)gz.fisz("fjkw", fitc(int ), (int)303);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl130
            }
            case 9: {
                var12_4 /* !! */  = (int)gz.fisz("fjkx", fitc(int ), (int)304);
                if (!var13_3) break;
                throw null;
            }
            case 10: {
                var12_4 /* !! */  = (int)gz.fisz("fjky", fitc(int ), (int)305);
                if (!var13_3) ** GOTO lbl44
                throw null;
            }
lbl91:
            // 3 sources

            case 11: {
                var12_4 /* !! */  = (int)gz.fisz("fjkz", fitc(int ), (int)306);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 12: {
                var12_4 /* !! */  = (int)gz.fisz("fjla", fitc(int ), (int)307);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 13: {
                var12_4 /* !! */  = (int)gz.fisz("fjlb", fitc(int ), (int)308);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl114
            }
lbl106:
            // 2 sources

            case 14: {
                var12_4 /* !! */  = (int)gz.fisz("fjlc", fitc(int ), (int)309);
                if (var13_3) {
                    throw null;
                }
            }
lbl110:
            // 4 sources

            case 15: {
                var12_4 /* !! */  = (int)gz.fisz("fjld", fitc(int ), (int)310);
                if (!var13_3) ** GOTO lbl106
                throw null;
            }
lbl114:
            // 2 sources

            case 16: {
                var12_4 /* !! */  = (int)gz.fisz("fjle", fitc(int ), (int)311);
                if (!var13_3) ** GOTO lbl91
                throw null;
            }
lbl118:
            // 2 sources

            case 17: {
                var12_4 /* !! */  = (int)gz.fisz("fjlf", fitc(int ), (int)312);
                if (!var13_3) ** GOTO lbl69
                throw null;
            }
lbl122:
            // 3 sources

            case 18: {
                var12_4 /* !! */  = (int)gz.fisz("fjlg", fitc(int ), (int)313);
                if (!var13_3) ** GOTO lbl110
                throw null;
            }
lbl126:
            // 2 sources

            case 19: {
                var12_4 /* !! */  = (int)gz.fisz("fjlh", fitc(int ), (int)314);
                if (!var13_3) ** GOTO lbl91
                throw null;
            }
lbl130:
            // 2 sources

            case 20: {
                var12_4 /* !! */  = (int)gz.fisz("fjli", fitc(int ), (int)315);
                if (!var13_3) ** GOTO lbl65
                throw null;
            }
lbl134:
            // 2 sources

            case 21: {
                var12_4 /* !! */  = (int)gz.fisz("fjlj", fitc(int ), (int)316);
                if (var13_3) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl139:
            // 2 sources

            case 22: {
                var12_4 /* !! */  = (int)gz.fisz("fjlk", fitc(int ), (int)317);
                if (!var13_3) ** GOTO lbl65
                throw null;
            }
lbl143:
            // 2 sources

            case 23: {
                var12_4 /* !! */  = (int)gz.fisz("fjll", fitc(int ), (int)318);
                if (!var13_3) ** GOTO lbl134
                throw null;
            }
lbl147:
            // 2 sources

            case 24: {
                var12_4 /* !! */  = (int)gz.fisz("fjlm", fitc(int ), (int)319);
                if (!var13_3) ** GOTO lbl139
                throw null;
            }
            case 25: {
                var12_4 /* !! */  = (int)gz.fisz("fjln", fitc(int ), (int)320);
                if (var13_3) {
                    throw null;
                }
            }
lbl155:
            // 4 sources

            case 26: {
                do {
                    var12_4 /* !! */  = (int)gz.fisz("fjlo", fitc(int ), (int)321);
                } while (!var13_3);
                throw null;
            }
            case 27: {
                var12_4 /* !! */  = (int)gz.fisz("fjlp", fitc(int ), (int)322);
                if (!var13_3) ** GOTO lbl143
                throw null;
            }
            case 28: 
        }
        var12_4 /* !! */  = (int)gz.fisz("fjlq", fitc(int ), (int)323);
        ** while (!var13_3)
lbl167:
        // 1 sources

        throw null;
    }

    static {
        fisx = new int[581];
        fisy = new int[581];
        gz.fkbt();
        gz.fkbv();
        gz.fkbw();
        gz.fkbx();
        gz.fkby();
        gz.fkbz();
        gz.fkca();
        gz.fkcb();
        gz.fkcc();
        gz.fkcd();
        gz.fkce();
        gz.fkcf();
        fits = new long[184];
        fitt = new long[184];
        gz.fkcg();
        gz.fkch();
        gz.fkci();
        gz.fkcj();
    }

    private static /* synthetic */ void fkbw() {
        gz.fisx[200] = -1250097248;
        gz.fisx[201] = -674922233;
        gz.fisx[202] = 2014322289;
        gz.fisx[203] = 2082095075;
        gz.fisx[204] = -1797773881;
        gz.fisx[205] = 1530267532;
        gz.fisx[206] = -513786148;
        gz.fisx[207] = -1142541162;
        gz.fisx[208] = 1904519706;
        gz.fisx[209] = -1084053111;
        gz.fisx[210] = 372794270;
        gz.fisx[211] = 382086360;
        gz.fisx[212] = -826405539;
        gz.fisx[213] = -1963096474;
        gz.fisx[214] = -542564246;
        gz.fisx[215] = 450188468;
        gz.fisx[216] = 237182952;
        gz.fisx[217] = 832675039;
        gz.fisx[218] = -327056163;
        gz.fisx[219] = -1272718503;
        gz.fisx[220] = -2137004112;
        gz.fisx[221] = -16703252;
        gz.fisx[222] = 627869680;
        gz.fisx[223] = 1435915880;
        gz.fisx[224] = -365403384;
        gz.fisx[225] = -471432740;
        gz.fisx[226] = -2143907154;
        gz.fisx[227] = -1274575107;
        gz.fisx[228] = 376845248;
        gz.fisx[229] = 1346097767;
        gz.fisx[230] = -396863819;
        gz.fisx[231] = -1759134758;
        gz.fisx[232] = 687458850;
        gz.fisx[233] = -98060923;
        gz.fisx[234] = 769658569;
        gz.fisx[235] = 1237956405;
        gz.fisx[236] = -62446145;
        gz.fisx[237] = -1094432363;
        gz.fisx[238] = 332350170;
        gz.fisx[239] = -445243456;
        gz.fisx[240] = -2144075645;
        gz.fisx[241] = 1899716531;
        gz.fisx[242] = -581678388;
        gz.fisx[243] = -1003412105;
        gz.fisx[244] = 1877820996;
        gz.fisx[245] = -1269014339;
        gz.fisx[246] = -1793306893;
        gz.fisx[247] = 2008970798;
        gz.fisx[248] = 700469542;
        gz.fisx[249] = -529217080;
        gz.fisx[250] = 776346102;
        gz.fisx[251] = 317575352;
        gz.fisx[252] = 606910809;
        gz.fisx[253] = 35746523;
        gz.fisx[254] = -576906750;
        gz.fisx[255] = -746290636;
        gz.fisx[256] = 1136553226;
        gz.fisx[257] = 1819515055;
        gz.fisx[258] = -1043941463;
        gz.fisx[259] = 828228148;
        gz.fisx[260] = -983316444;
        gz.fisx[261] = -1349336095;
        gz.fisx[262] = 2092260289;
        gz.fisx[263] = 0x25D225D5;
        gz.fisx[264] = 1713162128;
        gz.fisx[265] = -614340215;
        gz.fisx[266] = 471688793;
        gz.fisx[267] = 644982154;
        gz.fisx[268] = 1194596677;
        gz.fisx[269] = -57174429;
        gz.fisx[270] = -2095457506;
        gz.fisx[271] = -964920422;
        gz.fisx[272] = 2064569695;
        gz.fisx[273] = -612597603;
        gz.fisx[274] = -300408930;
        gz.fisx[275] = -600347431;
        gz.fisx[276] = 935616802;
        gz.fisx[277] = -1713793811;
        gz.fisx[278] = 528714923;
        gz.fisx[279] = 60748119;
        gz.fisx[280] = 1454301318;
        gz.fisx[281] = 159913907;
        gz.fisx[282] = 737269970;
        gz.fisx[283] = -1472204816;
        gz.fisx[284] = 1615256041;
        gz.fisx[285] = 556509319;
        gz.fisx[286] = -1726112285;
        gz.fisx[287] = 154403229;
        gz.fisx[288] = 866316137;
        gz.fisx[289] = 617038126;
        gz.fisx[290] = 336363593;
        gz.fisx[291] = 128610025;
        gz.fisx[292] = -846591755;
        gz.fisx[293] = -1650858888;
        gz.fisx[294] = 658757072;
        gz.fisx[295] = -2026019391;
        gz.fisx[296] = 785275102;
        gz.fisx[297] = -936580139;
        gz.fisx[298] = -1224147211;
        gz.fisx[299] = 1340322536;
    }

    private static /* synthetic */ void fkby() {
        gz.fisx[400] = -2028961244;
        gz.fisx[401] = -623673012;
        gz.fisx[402] = 1705722537;
        gz.fisx[403] = -37422097;
        gz.fisx[404] = -1243773337;
        gz.fisx[405] = 2054436022;
        gz.fisx[406] = 157376062;
        gz.fisx[407] = -982772579;
        gz.fisx[408] = -1006282414;
        gz.fisx[409] = -1264111272;
        gz.fisx[410] = -1115588438;
        gz.fisx[411] = -1687768279;
        gz.fisx[412] = -469259771;
        gz.fisx[413] = -1261663742;
        gz.fisx[414] = 1447413072;
        gz.fisx[415] = 1903878995;
        gz.fisx[416] = -144302447;
        gz.fisx[417] = 275015104;
        gz.fisx[418] = 526569597;
        gz.fisx[419] = 930441057;
        gz.fisx[420] = -1237561180;
        gz.fisx[421] = -1191979297;
        gz.fisx[422] = 1607204126;
        gz.fisx[423] = -1644040850;
        gz.fisx[424] = -2052307176;
        gz.fisx[425] = -1864803425;
        gz.fisx[426] = -1237752702;
        gz.fisx[427] = 1786781082;
        gz.fisx[428] = -985596303;
        gz.fisx[429] = 2030589386;
        gz.fisx[430] = 230315120;
        gz.fisx[431] = 536090642;
        gz.fisx[432] = -437092709;
        gz.fisx[433] = -1096728032;
        gz.fisx[434] = 1859906207;
        gz.fisx[435] = -1452986342;
        gz.fisx[436] = 747571465;
        gz.fisx[437] = 256188989;
        gz.fisx[438] = -702229641;
        gz.fisx[439] = -1044656361;
        gz.fisx[440] = 2036700873;
        gz.fisx[441] = -108742730;
        gz.fisx[442] = 392732360;
        gz.fisx[443] = 1630842232;
        gz.fisx[444] = -665827386;
        gz.fisx[445] = -993040710;
        gz.fisx[446] = -2014579801;
        gz.fisx[447] = 44257627;
        gz.fisx[448] = 1560520995;
        gz.fisx[449] = -1641099718;
        gz.fisx[450] = -115138175;
        gz.fisx[451] = 669583506;
        gz.fisx[452] = 1756470951;
        gz.fisx[453] = -603611739;
        gz.fisx[454] = -1975735895;
        gz.fisx[455] = -334994742;
        gz.fisx[456] = 286208765;
        gz.fisx[457] = 655575381;
        gz.fisx[458] = 1482794704;
        gz.fisx[459] = -1454529560;
        gz.fisx[460] = 646512455;
        gz.fisx[461] = -1908369227;
        gz.fisx[462] = 976403139;
        gz.fisx[463] = -222528933;
        gz.fisx[464] = 2030307877;
        gz.fisx[465] = -1249733040;
        gz.fisx[466] = -1789255137;
        gz.fisx[467] = -1929149773;
        gz.fisx[468] = 814324171;
        gz.fisx[469] = -59455848;
        gz.fisx[470] = 1593228224;
        gz.fisx[471] = 1963363541;
        gz.fisx[472] = 36139503;
        gz.fisx[473] = -342993957;
        gz.fisx[474] = 1467601475;
        gz.fisx[475] = -1980104723;
        gz.fisx[476] = 222306337;
        gz.fisx[477] = -2102941670;
        gz.fisx[478] = -719450654;
        gz.fisx[479] = -39143715;
        gz.fisx[480] = 156507969;
        gz.fisx[481] = -2069633548;
        gz.fisx[482] = -533203385;
        gz.fisx[483] = -1221267359;
        gz.fisx[484] = -577449839;
        gz.fisx[485] = 22344601;
        gz.fisx[486] = -1379752136;
        gz.fisx[487] = -1115544535;
        gz.fisx[488] = 287215862;
        gz.fisx[489] = -857207306;
        gz.fisx[490] = 361863318;
        gz.fisx[491] = 470732939;
        gz.fisx[492] = 1019703669;
        gz.fisx[493] = 1720981346;
        gz.fisx[494] = -1799707567;
        gz.fisx[495] = 855021084;
        gz.fisx[496] = 172249257;
        gz.fisx[497] = -1776151448;
        gz.fisx[498] = 1079617585;
        gz.fisx[499] = 1146500057;
    }

    public static /* synthetic */ CallSite fisz(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void fkcd() {
        gz.fisy[300] = -1006467213;
        gz.fisy[301] = -217438056;
        gz.fisy[302] = 644894197;
        gz.fisy[303] = -85170546;
        gz.fisy[304] = -773575014;
        gz.fisy[305] = -1386509697;
        gz.fisy[306] = 666330072;
        gz.fisy[307] = -1534014860;
        gz.fisy[308] = -836411807;
        gz.fisy[309] = 504029932;
        gz.fisy[310] = -1975922194;
        gz.fisy[311] = 762890215;
        gz.fisy[312] = 1154454968;
        gz.fisy[313] = 9613746;
        gz.fisy[314] = -618949163;
        gz.fisy[315] = 1378647948;
        gz.fisy[316] = 1823701729;
        gz.fisy[317] = -905556658;
        gz.fisy[318] = -1513033836;
        gz.fisy[319] = -796995899;
        gz.fisy[320] = -1963124686;
        gz.fisy[321] = 980933213;
        gz.fisy[322] = -1345653249;
        gz.fisy[323] = 1636456007;
        gz.fisy[324] = 541630744;
        gz.fisy[325] = 652261719;
        gz.fisy[326] = 582067281;
        gz.fisy[327] = -400690753;
        gz.fisy[328] = -1542862673;
        gz.fisy[329] = 1461171303;
        gz.fisy[330] = 1452674137;
        gz.fisy[331] = -1308572239;
        gz.fisy[332] = -1833199818;
        gz.fisy[333] = -1590155881;
        gz.fisy[334] = 1859208324;
        gz.fisy[335] = 22435937;
        gz.fisy[336] = 2001640953;
        gz.fisy[337] = -1715422105;
        gz.fisy[338] = 456181231;
        gz.fisy[339] = 1961505346;
        gz.fisy[340] = 1276137355;
        gz.fisy[341] = 1965420588;
        gz.fisy[342] = 1471709692;
        gz.fisy[343] = -1339149272;
        gz.fisy[344] = 850280488;
        gz.fisy[345] = -1140542553;
        gz.fisy[346] = 852369419;
        gz.fisy[347] = 283703487;
        gz.fisy[348] = -1146530547;
        gz.fisy[349] = 628404276;
        gz.fisy[350] = -37387497;
        gz.fisy[351] = 1938821344;
        gz.fisy[352] = 140831802;
        gz.fisy[353] = 1441156158;
        gz.fisy[354] = -1775910632;
        gz.fisy[355] = 605630757;
        gz.fisy[356] = -1617281927;
        gz.fisy[357] = -130669324;
        gz.fisy[358] = -600068951;
        gz.fisy[359] = 490218687;
        gz.fisy[360] = -1236061794;
        gz.fisy[361] = 957476668;
        gz.fisy[362] = -669461269;
        gz.fisy[363] = -2130142842;
        gz.fisy[364] = -1744811761;
        gz.fisy[365] = 2115367912;
        gz.fisy[366] = -962060376;
        gz.fisy[367] = -25159343;
        gz.fisy[368] = -277794170;
        gz.fisy[369] = 80321319;
        gz.fisy[370] = -680566342;
        gz.fisy[371] = -1074412409;
        gz.fisy[372] = -1599063787;
        gz.fisy[373] = 219462461;
        gz.fisy[374] = 1260886446;
        gz.fisy[375] = 2110956022;
        gz.fisy[376] = -1791182742;
        gz.fisy[377] = 1714331254;
        gz.fisy[378] = 1238085795;
        gz.fisy[379] = 1851168739;
        gz.fisy[380] = -1054793132;
        gz.fisy[381] = -274533289;
        gz.fisy[382] = -1235753608;
        gz.fisy[383] = 1703633505;
        gz.fisy[384] = -198879099;
        gz.fisy[385] = -1592253929;
        gz.fisy[386] = 1836205606;
        gz.fisy[387] = -2143282458;
        gz.fisy[388] = -148480359;
        gz.fisy[389] = 1715840589;
        gz.fisy[390] = 1289149289;
        gz.fisy[391] = -277011174;
        gz.fisy[392] = 2124982358;
        gz.fisy[393] = -129989654;
        gz.fisy[394] = -1847039323;
        gz.fisy[395] = -1064725262;
        gz.fisy[396] = -1588950987;
        gz.fisy[397] = 1966008424;
        gz.fisy[398] = 678490632;
        gz.fisy[399] = -40345091;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean isValidTarget(class_1657 var1_1, boolean var2_2) {
        block88: {
            block87: {
                var8_3 = gz.c;
                var7_4 /* !! */  = gz.b;
                var6_5 = gz.a;
                if (var8_3) {
                    throw null;
                }
                if (var6_5 || var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                if (var1_1 == null) break block87;
                if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                if (var1_1 == gz.mc.field_1724) break block87;
                if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                if (!var1_1.method_5805()) break block87;
                if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                if (!var1_1.method_7325()) break block88;
                if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
            }
            if (var6_5 || var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
            return (boolean)gz.fisz("fjiu", fitc(int ), (int)255);
        }
        if (var6_5 || var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
        if (dl.isFriend((class_1297)var1_1)) {
            if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
            return (boolean)gz.fisz("fjiv", fitc(int ), (int)256);
        }
        if (var6_5 || var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
        var3_6 = hb.getInstance();
        if (var6_5 || var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
        if (var3_6 != null) {
            if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
            if (var3_6.isBot(var1_1)) {
                if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                return (boolean)gz.fisz("fjiw", fitc(int ), (int)257);
            }
        }
        if (var6_5 || var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
        var4_7 = this.aimDistance.getValue() * this.aimDistance.getValue();
        if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
        if (var7_4 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block34: while (true) {
            block89: {
                switch (cfr_temp_0 == -2147483648 ? var7_4 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                        if (!(gz.mc.field_1724.method_5858((class_1297)var1_1) <= var4_7)) ** GOTO lbl50
                        if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                        if (!var2_2) ** GOTO lbl46
                        if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                        if (!gz.mc.field_1724.method_6057((class_1297)var1_1)) ** GOTO lbl50
                        if (var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
lbl46:
                        // 2 sources

                        if (var6_5 || var6_5) return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                        v0 = gz.fisz("fjiy", fitc(int ), (int)258);
                        if (!var8_3) return (boolean)v0;
                        throw null;
lbl50:
                        // 2 sources

                        if (var6_5 || var6_5) {
                            return (boolean)gz.fisz("fjit", fitc(int ), (int)254);
                        }
                        v0 = gz.fisz("fjiz", fitc(int ), (int)259);
                        return (boolean)v0;
                    }
                    case 0: {
                        var7_4 /* !! */  = (int)gz.fisz("fjja", fitc(int ), (int)260);
                        cfr_temp_0 = 9;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 2: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjc", fitc(int ), (int)262);
                        cfr_temp_0 = 27;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 5: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjg", fitc(int ), (int)265);
                        cfr_temp_0 = 30;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 11: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjn", fitc(int ), (int)271);
                        cfr_temp_0 = 1;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 12: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjo", fitc(int ), (int)272);
                        cfr_temp_0 = 25;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 14: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjq", fitc(int ), (int)274);
                        cfr_temp_0 = 6;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 16: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjs", fitc(int ), (int)276);
                        cfr_temp_0 = 15;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 17: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjt", fitc(int ), (int)277);
                        cfr_temp_0 = 9;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 18: {
                        ** GOTO lbl144
                    }
                    case 20: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjw", fitc(int ), (int)280);
                        cfr_temp_0 = 13;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 24: {
                        var7_4 /* !! */  = (int)gz.fisz("fjka", fitc(int ), (int)284);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 13: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjp", fitc(int ), (int)273);
                        cfr_temp_0 = 1;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 26: {
                        var7_4 /* !! */  = (int)gz.fisz("fjkc", fitc(int ), (int)286);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 7: {
                        var7_4 /* !! */  = (int)gz.fisz("fjji", fitc(int ), (int)267);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 4: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjf", fitc(int ), (int)264);
                        cfr_temp_0 = 8;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 29: {
                        var7_4 /* !! */  = (int)gz.fisz("fjkf", fitc(int ), (int)289);
                        cfr_temp_0 = 6;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 31: {
                        var7_4 /* !! */  = (int)gz.fisz("fjkh", fitc(int ), (int)291);
                        if (var8_3) {
                            throw null;
                        }
lbl144:
                        // 3 sources

                        var7_4 /* !! */  = (int)gz.fisz("fjju", fitc(int ), (int)278);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 28: {
                        var7_4 /* !! */  = (int)gz.fisz("fjke", fitc(int ), (int)288);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 19: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjv", fitc(int ), (int)279);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 3: {
                        var7_4 /* !! */  = (int)gz.fisz("fjje", fitc(int ), (int)263);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 27: {
                        var7_4 /* !! */  = (int)gz.fisz("fjkd", fitc(int ), (int)287);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 8: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjj", fitc(int ), (int)268);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 21: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjx", fitc(int ), (int)281);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 9: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjk", fitc(int ), (int)269);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 22: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjy", fitc(int ), (int)282);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 23: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjz", fitc(int ), (int)283);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 6: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjh", fitc(int ), (int)266);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 15: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjr", fitc(int ), (int)275);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 25: {
                        var7_4 /* !! */  = (int)gz.fisz("fjkb", fitc(int ), (int)285);
                        cfr_temp_0 = 10;
                        if (var8_3) {
                            throw null;
                        }
                        break block89;
                    }
                    case 1: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjb", fitc(int ), (int)261);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 10: {
                        var7_4 /* !! */  = (int)gz.fisz("fjjm", fitc(int ), (int)270);
                        if (var8_3) {
                            throw null;
                        }
                    }
                    case 30: 
                }
                ** GOTO lbl210
            }
            do {
                if (true) continue block34;
lbl210:
                // 2 sources

                var7_4 /* !! */  = (int)gz.fisz("fjkg", fitc(int ), (int)290);
                cfr_temp_0 = 1;
            } while (!var8_3);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void fkbz() {
        gz.fisx[500] = -1606525318;
        gz.fisx[501] = 75205849;
        gz.fisx[502] = -486446689;
        gz.fisx[503] = 1777875354;
        gz.fisx[504] = 739199640;
        gz.fisx[505] = 2112996330;
        gz.fisx[506] = 1581490456;
        gz.fisx[507] = 406487652;
        gz.fisx[508] = -1736792901;
        gz.fisx[509] = -794035557;
        gz.fisx[510] = 2079608983;
        gz.fisx[511] = 1801964974;
        gz.fisx[512] = 1092562963;
        gz.fisx[513] = 2063588813;
        gz.fisx[514] = -1827790471;
        gz.fisx[515] = 1330175016;
        gz.fisx[516] = -432973726;
        gz.fisx[517] = 1372537807;
        gz.fisx[518] = 1377434154;
        gz.fisx[519] = 618345942;
        gz.fisx[520] = -954176008;
        gz.fisx[521] = -1792021518;
        gz.fisx[522] = -596866185;
        gz.fisx[523] = -1479638067;
        gz.fisx[524] = 16378591;
        gz.fisx[525] = -421306953;
        gz.fisx[526] = -2125055388;
        gz.fisx[527] = -1895460475;
        gz.fisx[528] = -2056617460;
        gz.fisx[529] = -2120928985;
        gz.fisx[530] = -2006984432;
        gz.fisx[531] = 1212286339;
        gz.fisx[532] = -1020240779;
        gz.fisx[533] = -1949551947;
        gz.fisx[534] = 977668885;
        gz.fisx[535] = -1700228578;
        gz.fisx[536] = 306060295;
        gz.fisx[537] = 2104760613;
        gz.fisx[538] = 863507277;
        gz.fisx[539] = -543695269;
        gz.fisx[540] = 1288426268;
        gz.fisx[541] = -926910906;
        gz.fisx[542] = 1289443259;
        gz.fisx[543] = 61307965;
        gz.fisx[544] = 800235560;
        gz.fisx[545] = -766288373;
        gz.fisx[546] = 1882757249;
        gz.fisx[547] = -602746375;
        gz.fisx[548] = -1409854287;
        gz.fisx[549] = 1197651337;
        gz.fisx[550] = 457520757;
        gz.fisx[551] = -999022503;
        gz.fisx[552] = -1961776060;
        gz.fisx[553] = -1624859613;
        gz.fisx[554] = -1102653500;
        gz.fisx[555] = 898708679;
        gz.fisx[556] = 503495143;
        gz.fisx[557] = 221545310;
        gz.fisx[558] = -985229652;
        gz.fisx[559] = 1212286986;
        gz.fisx[560] = -1355090143;
        gz.fisx[561] = -2136782823;
        gz.fisx[562] = 1798567528;
        gz.fisx[563] = 1963464590;
        gz.fisx[564] = -1798289403;
        gz.fisx[565] = 1087649710;
        gz.fisx[566] = -5589926;
        gz.fisx[567] = -1127395434;
        gz.fisx[568] = 1730099554;
        gz.fisx[569] = -686067074;
        gz.fisx[570] = -1175459115;
        gz.fisx[571] = -1589927868;
        gz.fisx[572] = 1706127627;
        gz.fisx[573] = -1027097398;
        gz.fisx[574] = -548560344;
        gz.fisx[575] = -773376035;
        gz.fisx[576] = -95911601;
        gz.fisx[577] = -1017526764;
        gz.fisx[578] = -1496343075;
        gz.fisx[579] = -1014919173;
        gz.fisx[580] = -54080272;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private double getNetworkDelayTicks() {
        v0 /* !! */  = gz.me;
        if (true) ** GOTO lbl5
        block60: while (true) {
            v0 /* !! */  = (long)(v1 - gz.fisz("fjtw", fitr(int ), (int)112));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1222993475: {
                    v1 = gz.fisz("fjtx", fitr(int ), (int)113);
                    continue block60;
                }
                case -840981153: {
                    v1 = gz.fisz("fjty", fitr(int ), (int)114);
                    continue block60;
                }
                case 1124680564: {
                    break block60;
                }
            }
            break;
        }
        var4_1 = gz.c;
        v2 /* !! */  = gz.me;
        if (true) ** GOTO lbl19
        block61: while (true) {
            v2 /* !! */  = (long)(v3 - gz.fisz("fjtz", fitr(int ), (int)115));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1124680564: {
                    break block61;
                }
                case 1621510384: {
                    v3 = gz.fisz("fjua", fitr(int ), (int)116);
                    continue block61;
                }
                case 2033726302: {
                    v3 = gz.fisz("fjub", fitr(int ), (int)117);
                    continue block61;
                }
                case 2103960702: {
                    v3 = gz.fisz("fjuc", fitr(int ), (int)118);
                    continue block61;
                }
            }
            break;
        }
        var3_2 /* !! */  = gz.b;
        v4 /* !! */  = gz.me;
        block62: while (true) {
            switch ((int)v4 /* !! */ ) {
                case -772530482: {
                    v4 /* !! */  = (long)(gz.fisz("fjue", fitr(int ), (int)120) - gz.fisz("fjud", fitr(int ), (int)119));
                    continue block62;
                }
                case 1124680564: {
                    break block62;
                }
            }
            break;
        }
        var2_3 = gz.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block63: while (true) {
            block97: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_1) {
                            throw null;
                        }
                        if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                        if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                        while (true) {
                            if ((v5 /* !! */  = (cfr_temp_1 = gz.me - gz.fisz("fjug", fitr(int ), (int)122)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v5 /* !! */  != gz.fisz("fjuh", fitc(int ), (int)513)) ** GOTO lbl56
                            v6 /* !! */  = gz.me;
                            ** GOTO lbl108
lbl56:
                            // 1 sources

                            v5 /* !! */  = (long)gz.fisz("fjui", fitc(int ), (int)514);
                        }
                    }
                    case 4: {
                        var3_2 /* !! */  = (int)gz.fisz("fjvu", fitc(int ), (int)528);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_2 /* !! */  = (int)gz.fisz("fjvy", fitc(int ), (int)529);
                        cfr_temp_0 = 8;
                        if (var4_1) {
                            throw null;
                        }
                        break block97;
                    }
                    case 7: {
                        var3_2 /* !! */  = (int)gz.fisz("fjwb", fitc(int ), (int)531);
                        cfr_temp_0 = 0;
                        if (var4_1) {
                            throw null;
                        }
                        break block97;
                    }
                    case 9: {
                        var3_2 /* !! */  = (int)gz.fisz("fjwd", fitc(int ), (int)533);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 10: {
                        var3_2 /* !! */  = (int)gz.fisz("fjwe", fitc(int ), (int)534);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_2 /* !! */  = (int)gz.fisz("fjwa", fitc(int ), (int)530);
                        cfr_temp_0 = 3;
                        if (var4_1) {
                            throw null;
                        }
                        break block97;
                    }
                    case 11: {
                        var3_2 /* !! */  = (int)gz.fisz("fjwf", fitc(int ), (int)535);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)gz.fisz("fjvr", fitc(int ), (int)525);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var3_2 /* !! */  = (int)gz.fisz("fjwc", fitc(int ), (int)532);
                        cfr_temp_0 = 0;
                        if (var4_1) {
                            throw null;
                        }
                        break block97;
                    }
                    case 12: lbl-1000:
                    // 2 sources

                    {
                        var3_2 /* !! */  = (int)gz.fisz("fjwi", fitc(int ), (int)536);
                        if (var4_1) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
lbl108:
                    // 1 sources

                    block65: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case -1354290578: {
                                v6 /* !! */  = (long)(gz.fisz("fjuk", fitr(int ), (int)124) - gz.fisz("fjuj", fitr(int ), (int)123));
                                continue block65;
                            }
                            case 1124680564: {
                                break block65;
                            }
                        }
                        break;
                    }
                    if (gz.mc.method_1562() == null) {
                        if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                        return 0.0;
                    }
                    if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                    if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                    while (true) {
                        if ((v7 /* !! */  = (cfr_temp_2 = gz.me - gz.fisz("fjul", fitr(int ), (int)125)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v7 /* !! */  == gz.fisz("fjum", fitc(int ), (int)515)) break;
                        v7 /* !! */  = (long)gz.fisz("fjun", fitc(int ), (int)516);
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_3 = gz.me - gz.fisz("fjuo", fitr(int ), (int)126)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v8 /* !! */  != gz.fisz("fjup", fitc(int ), (int)517)) ** GOTO lbl133
                        v9 = gz.mc.method_1562();
                        v10 /* !! */  = gz.me;
                        if (true) ** GOTO lbl137
lbl133:
                        // 1 sources

                        v8 /* !! */  = (long)gz.fisz("fjuq", fitc(int ), (int)518);
                    }
                    block68: while (true) {
                        v10 /* !! */  = (long)(v11 - gz.fisz("fjur", fitr(int ), (int)127));
lbl137:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case 236959691: {
                                v11 = gz.fisz("fjus", fitr(int ), (int)128);
                                continue block68;
                            }
                            case 1039329932: {
                                v11 = gz.fisz("fjut", fitr(int ), (int)129);
                                continue block68;
                            }
                            case 1124680564: {
                                break block68;
                            }
                            case 1644869631: {
                                v11 = gz.fisz("fjuu", fitr(int ), (int)130);
                                continue block68;
                            }
                        }
                        break;
                    }
                    v12 /* !! */  = gz.me;
                    block69: while (true) {
                        switch ((int)v12 /* !! */ ) {
                            case 1124680564: {
                                break block69;
                            }
                            case 1126479926: {
                                v12 /* !! */  = (long)(gz.fisz("fjuw", fitr(int ), (int)132) - gz.fisz("fjuv", fitr(int ), (int)131));
                                continue block69;
                            }
                        }
                        break;
                    }
                    v13 = gz.mc.field_1724;
                    v14 /* !! */  = gz.me;
                    if (true) ** GOTO lbl162
                    block70: while (true) {
                        v14 /* !! */  = (long)(v15 - gz.fisz("fjux", fitr(int ), (int)133));
lbl162:
                        // 2 sources

                        switch ((int)v14 /* !! */ ) {
                            case -470004246: {
                                v15 = gz.fisz("fjuy", fitr(int ), (int)134);
                                continue block70;
                            }
                            case 400265623: {
                                v15 = gz.fisz("fjuz", fitr(int ), (int)135);
                                continue block70;
                            }
                            case 1124680564: {
                                break block70;
                            }
                            case 1759813949: {
                                v15 = gz.fisz("fjva", fitr(int ), (int)136);
                                continue block70;
                            }
                        }
                        break;
                    }
                    v16 = v13.method_5667();
                    while (true) {
                        if ((v17 /* !! */  = (cfr_temp_4 = gz.me - gz.fisz("fjvb", fitr(int ), (int)137)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v17 /* !! */  != gz.fisz("fjvc", fitc(int ), (int)519)) ** GOTO lbl185
                        var1_4 = v9.method_2871(v16);
                        if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                        if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                        if (var1_4 == null) {
                            break;
                        }
                        ** GOTO lbl191
lbl185:
                        // 1 sources

                        v17 /* !! */  = (long)gz.fisz("fjvd", fitc(int ), (int)520);
                    }
                    if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                    v18 = 0.0;
                    if (var4_1 == false) return v18;
                    throw null;
lbl191:
                    // 1 sources

                    if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                    if (var2_3 != false) return (double)gz.fisz("fjuf", fjcs(int ), (int)121);
                    v19 = gz.fisz("fjve", fjcs(int ), (int)138);
                    v20 = gz.fisz("fjvf", fitc(int ), (int)521);
                    v21 /* !! */  = gz.me;
                    block72: while (true) {
                        switch ((int)v21 /* !! */ ) {
                            case 1124680564: {
                                break block72;
                            }
                            case 1909684891: {
                                v21 /* !! */  = (long)(gz.fisz("fjvh", fitr(int ), (int)140) - gz.fisz("fjvg", fitr(int ), (int)139));
                                continue block72;
                            }
                        }
                        break;
                    }
                    v22 = var1_4.method_2959();
                    v23 /* !! */  = gz.me;
                    if (true) ** GOTO lbl208
                    block73: while (true) {
                        v23 /* !! */  = (long)(v24 - gz.fisz("fjvi", fitr(int ), (int)141));
lbl208:
                        // 2 sources

                        switch ((int)v23 /* !! */ ) {
                            case -2064036391: {
                                v24 = gz.fisz("fjvj", fitr(int ), (int)142);
                                continue block73;
                            }
                            case -1704893221: {
                                v24 = gz.fisz("fjvk", fitr(int ), (int)143);
                                continue block73;
                            }
                            case -696372003: {
                                v24 = gz.fisz("fjvl", fitr(int ), (int)144);
                                continue block73;
                            }
                            case 1124680564: {
                                break block73;
                            }
                        }
                        break;
                    }
                    v25 = (double)Math.max((int)v20, v22) / gz.fisz("fjvm", fjcs(int ), (int)145);
                    while (true) {
                        if ((v26 /* !! */  = (cfr_temp_5 = gz.me - gz.fisz("fjvn", fitr(int ), (int)146)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v26 /* !! */  == gz.fisz("fjvo", fitc(int ), (int)522)) {
                            v18 = Math.min((double)v19, v25);
                            return v18;
                        }
                        v26 /* !! */  = (long)gz.fisz("fjvp", fitc(int ), (int)523);
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)gz.fisz("fjvq", fitc(int ), (int)524);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 2: lbl-1000:
                    // 2 sources

                    {
                        var3_2 /* !! */  = (int)gz.fisz("fjvs", fitc(int ), (int)526);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl242
            }
            do {
                if (true) continue block63;
lbl242:
                // 2 sources

                var3_2 /* !! */  = (int)gz.fisz("fjvt", fitc(int ), (int)527);
                cfr_temp_0 = 0;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1657 getTarget() {
        v0 /* !! */  = gz.me;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - gz.fisz("fiuk", fitr(int ), (int)6));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1483788857: {
                    v1 = gz.fisz("fiul", fitr(int ), (int)7);
                    continue block18;
                }
                case -653534590: {
                    v1 = gz.fisz("fium", fitr(int ), (int)8);
                    continue block18;
                }
                case 1124680564: {
                    break block18;
                }
                case 1163833781: {
                    v1 = gz.fisz("fiun", fitr(int ), (int)9);
                    continue block18;
                }
            }
            break;
        }
        var3_1 = gz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gz.me - gz.fisz("fiuo", fitr(int ), (int)10)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gz.fisz("fiup", fitc(int ), (int)26)) break;
            v2 /* !! */  = (long)gz.fisz("fiuq", fitc(int ), (int)27);
        }
        var2_2 /* !! */  = gz.b;
        v3 /* !! */  = gz.me;
        if (true) ** GOTO lbl29
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - gz.fisz("fiur", fitr(int ), (int)11));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1266488008: {
                    v4 = gz.fisz("fius", fitr(int ), (int)12);
                    continue block20;
                }
                case -843869443: {
                    v4 = gz.fisz("fiut", fitr(int ), (int)13);
                    continue block20;
                }
                case 1124680564: {
                    break block20;
                }
                case 1894560516: {
                    v4 = gz.fisz("fiuu", fitr(int ), (int)14);
                    continue block20;
                }
            }
            break;
        }
        var1_3 = gz.a;
        if (var3_1) {
            throw null;
lbl44:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = gz.me - gz.fisz("fiuv", fitr(int ), (int)15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == gz.fisz("fiuw", fitc(int ), (int)28)) break;
                    v5 /* !! */  = (long)gz.fisz("fiux", fitc(int ), (int)29);
                }
                return this.target;
            }
            case 0: {
                var2_2 /* !! */  = (int)gz.fisz("fiuy", fitc(int ), (int)30);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)gz.fisz("fiuz", fitc(int ), (int)31);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl68:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)gz.fisz("fiva", fitc(int ), (int)32);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)gz.fisz("fivb", fitc(int ), (int)33);
        ** while (!var3_1)
lbl75:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private gz$WeaponState getActiveWeapon() {
        var5_1 = gz.c;
        var4_2 /* !! */  = gz.b;
        var3_3 = gz.a;
        if (var5_1) {
            throw null;
lbl6:
            // 16 sources

            return null;
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        if (!gz.mc.field_1724.method_6115()) ** GOTO lbl27
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_4 = gz.mc.field_1724.method_6030();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!this.weapons.isSelected("\u041b\u0443\u043a\u043e\u043c")) ** GOTO lbl21
                if (var3_3) ** GOTO lbl6
                if (!(var1_4.method_7909() instanceof class_1753)) ** GOTO lbl21
                if (var3_3 || var3_3) ** GOTO lbl6
                return new gz$WeaponState((double)gz.fisz("fjct", fjcs(int ), (int)52));
lbl21:
                // 2 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                if (!this.weapons.isSelected("\u0422\u0440\u0435\u0437\u0443\u0431\u0446\u0435\u043c")) ** GOTO lbl27
                if (var3_3) ** GOTO lbl6
                if (!(var1_4.method_7909() instanceof class_1835)) ** GOTO lbl27
                if (var3_3 || var3_3) ** GOTO lbl6
                return new gz$WeaponState((double)gz.fisz("fjcu", fjcs(int ), (int)53));
lbl27:
                // 3 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                if (!this.weapons.isSelected("\u0410\u0440\u0431\u0430\u043b\u0435\u0442\u043e\u043c")) ** GOTO lbl41
                if (var3_3 || var3_3) ** GOTO lbl6
                var1_4 = gz.mc.field_1724.method_6047();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!(var1_4.method_7909() instanceof class_1764)) ** GOTO lbl35
                if (var3_3 || var3_3) ** GOTO lbl6
                return new gz$WeaponState((double)gz.fisz("fjcv", fjcs(int ), (int)54));
lbl35:
                // 1 sources

                if (var3_3 || var3_3) ** GOTO lbl6
                var2_5 = gz.mc.field_1724.method_6079();
                if (var3_3 || var3_3) ** GOTO lbl6
                if (!(var2_5.method_7909() instanceof class_1764)) ** GOTO lbl41
                if (var3_3 || var3_3) ** GOTO lbl6
                return new gz$WeaponState((double)gz.fisz("fjcw", fjcs(int ), (int)55));
lbl41:
                // 2 sources

                if (!var3_3 && !var3_3) ** break;
                ** continue;
                return null;
            }
            case 0: {
                var4_2 /* !! */  = (int)gz.fisz("fjcx", fitc(int ), (int)196);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl89
            }
lbl49:
            // 2 sources

            case 1: {
                var4_2 /* !! */  = (int)gz.fisz("fjcy", fitc(int ), (int)197);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 2: {
                var4_2 /* !! */  = (int)gz.fisz("fjcz", fitc(int ), (int)198);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
            case 3: {
                var4_2 /* !! */  = (int)gz.fisz("fjda", fitc(int ), (int)199);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
            case 4: {
                var4_2 /* !! */  = (int)gz.fisz("fjdb", fitc(int ), (int)200);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl69:
            // 2 sources

            case 5: {
                var4_2 /* !! */  = (int)gz.fisz("fjdd", fitc(int ), (int)201);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 6: {
                var4_2 /* !! */  = (int)gz.fisz("fjdf", fitc(int ), (int)202);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 7: {
                var4_2 /* !! */  = (int)gz.fisz("fjdh", fitc(int ), (int)203);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl182
            }
lbl84:
            // 2 sources

            case 8: {
                var4_2 /* !! */  = (int)gz.fisz("fjdi", fitc(int ), (int)204);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl89:
            // 3 sources

            case 9: {
                var4_2 /* !! */  = (int)gz.fisz("fjdj", fitc(int ), (int)205);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl94:
            // 4 sources

            case 10: {
                var4_2 /* !! */  = (int)gz.fisz("fjdk", fitc(int ), (int)206);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
            case 11: {
                var4_2 /* !! */  = (int)gz.fisz("fjdl", fitc(int ), (int)207);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl104:
            // 3 sources

            case 12: {
                var4_2 /* !! */  = (int)gz.fisz("fjdm", fitc(int ), (int)208);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
lbl109:
            // 2 sources

            case 13: {
                var4_2 /* !! */  = (int)gz.fisz("fjdn", fitc(int ), (int)209);
                if (!var5_1) ** GOTO lbl89
                throw null;
            }
lbl113:
            // 4 sources

            case 14: {
                var4_2 /* !! */  = (int)gz.fisz("fjdo", fitc(int ), (int)210);
                if (!var5_1) ** GOTO lbl94
                throw null;
            }
            case 15: {
                var4_2 /* !! */  = (int)gz.fisz("fjdr", fitc(int ), (int)211);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl166
            }
lbl122:
            // 2 sources

            case 16: {
                var4_2 /* !! */  = (int)gz.fisz("fjdx", fitc(int ), (int)212);
                if (!var5_1) ** GOTO lbl49
                throw null;
            }
            case 17: {
                var4_2 /* !! */  = (int)gz.fisz("fjdy", fitc(int ), (int)213);
                if (!var5_1) ** GOTO lbl84
                throw null;
            }
            case 18: {
                var4_2 /* !! */  = (int)gz.fisz("fjdz", fitc(int ), (int)214);
                if (!var5_1) break;
                throw null;
            }
lbl134:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)gz.fisz("fjea", fitc(int ), (int)215);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl139:
            // 3 sources

            case 20: {
                var4_2 /* !! */  = (int)gz.fisz("fjeb", fitc(int ), (int)216);
                if (!var5_1) ** GOTO lbl94
                throw null;
            }
            case 21: {
                do {
                    var4_2 /* !! */  = (int)gz.fisz("fjec", fitc(int ), (int)217);
                } while (!var5_1);
                throw null;
            }
lbl148:
            // 2 sources

            case 22: {
                var4_2 /* !! */  = (int)gz.fisz("fjed", fitc(int ), (int)218);
                if (!var5_1) break;
                throw null;
            }
lbl152:
            // 3 sources

            case 23: {
                var4_2 /* !! */  = (int)gz.fisz("fjek", fitc(int ), (int)219);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl191
            }
lbl157:
            // 2 sources

            case 24: {
                var4_2 /* !! */  = (int)gz.fisz("fjel", fitc(int ), (int)220);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl187
            }
lbl162:
            // 2 sources

            case 25: {
                var4_2 /* !! */  = (int)gz.fisz("fjem", fitc(int ), (int)221);
                if (!var5_1) ** GOTO lbl109
                throw null;
            }
lbl166:
            // 2 sources

            case 26: {
                var4_2 /* !! */  = (int)gz.fisz("fjen", fitc(int ), (int)222);
                if (!var5_1) ** GOTO lbl162
                throw null;
            }
lbl170:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)gz.fisz("fjeq", fitc(int ), (int)223);
                if (!var5_1) ** GOTO lbl134
                throw null;
            }
lbl174:
            // 2 sources

            case 28: {
                var4_2 /* !! */  = (int)gz.fisz("fjet", fitc(int ), (int)224);
                if (!var5_1) ** GOTO lbl152
                throw null;
            }
            case 29: {
                var4_2 /* !! */  = (int)gz.fisz("fjev", fitc(int ), (int)225);
                if (!var5_1) ** GOTO lbl139
                throw null;
            }
lbl182:
            // 3 sources

            case 30: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)gz.fisz("fjez", fitc(int ), (int)226);
                    if (!var5_1) ** GOTO lbl113
                    throw null;
                }
            }
lbl187:
            // 2 sources

            case 31: {
                var4_2 /* !! */  = (int)gz.fisz("fjfa", fitc(int ), (int)227);
                if (!var5_1) ** GOTO lbl69
                throw null;
            }
lbl191:
            // 2 sources

            case 32: {
                var4_2 /* !! */  = (int)gz.fisz("fjfb", fitc(int ), (int)228);
                if (!var5_1) ** GOTO lbl113
                throw null;
            }
            case 33: 
        }
        var4_2 /* !! */  = (int)gz.fisz("fjfc", fitc(int ), (int)229);
        ** while (!var5_1)
lbl198:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float fisw(int n2) {
        return Float.intBitsToFloat(fisx[n2] ^ fisy[n2]);
    }

    private static /* synthetic */ long fitr(int n2) {
        return fits[n2] ^ fitt[n2];
    }

    private static /* synthetic */ void fkbv() {
        gz.fisx[100] = 471551088;
        gz.fisx[101] = 560034884;
        gz.fisx[102] = 254168087;
        gz.fisx[103] = -1946989807;
        gz.fisx[104] = -1926041966;
        gz.fisx[105] = -2121023127;
        gz.fisx[106] = -2026863685;
        gz.fisx[107] = 1167906255;
        gz.fisx[108] = -1415555791;
        gz.fisx[109] = -1025166231;
        gz.fisx[110] = -634109048;
        gz.fisx[111] = 1153499582;
        gz.fisx[112] = -1194204947;
        gz.fisx[113] = 601857935;
        gz.fisx[114] = -920088508;
        gz.fisx[115] = 1351235703;
        gz.fisx[116] = 688783455;
        gz.fisx[117] = 1243638150;
        gz.fisx[118] = -1253862130;
        gz.fisx[119] = 103697796;
        gz.fisx[120] = 2027512760;
        gz.fisx[121] = -1576095805;
        gz.fisx[122] = 1584105167;
        gz.fisx[123] = -1283774357;
        gz.fisx[124] = 1202071615;
        gz.fisx[125] = 682400956;
        gz.fisx[126] = -28845530;
        gz.fisx[127] = -24382994;
        gz.fisx[128] = -1954856533;
        gz.fisx[129] = -398728344;
        gz.fisx[130] = -344085003;
        gz.fisx[131] = -576594347;
        gz.fisx[132] = -1502371578;
        gz.fisx[133] = 796432753;
        gz.fisx[134] = 1676448669;
        gz.fisx[135] = 775479570;
        gz.fisx[136] = 1458103327;
        gz.fisx[137] = 1739381924;
        gz.fisx[138] = 1383010791;
        gz.fisx[139] = -1558060043;
        gz.fisx[140] = 1310033692;
        gz.fisx[141] = 1259536278;
        gz.fisx[142] = 519343045;
        gz.fisx[143] = 2079413044;
        gz.fisx[144] = 1530325043;
        gz.fisx[145] = -232576530;
        gz.fisx[146] = -50303440;
        gz.fisx[147] = 1302991351;
        gz.fisx[148] = -1158178606;
        gz.fisx[149] = -960190846;
        gz.fisx[150] = 116704664;
        gz.fisx[151] = 846867721;
        gz.fisx[152] = 812565089;
        gz.fisx[153] = 1730826225;
        gz.fisx[154] = 1917625782;
        gz.fisx[155] = -1377837483;
        gz.fisx[156] = 243901866;
        gz.fisx[157] = 312790862;
        gz.fisx[158] = -1672675783;
        gz.fisx[159] = -119360012;
        gz.fisx[160] = -2105510939;
        gz.fisx[161] = -2010340232;
        gz.fisx[162] = -839333108;
        gz.fisx[163] = -663356509;
        gz.fisx[164] = 38275457;
        gz.fisx[165] = -1542379767;
        gz.fisx[166] = -1149256696;
        gz.fisx[167] = -2083086700;
        gz.fisx[168] = 1090932175;
        gz.fisx[169] = 1465448636;
        gz.fisx[170] = -1389577770;
        gz.fisx[171] = -83343784;
        gz.fisx[172] = -5818124;
        gz.fisx[173] = 1261672847;
        gz.fisx[174] = 1347154122;
        gz.fisx[175] = -742762574;
        gz.fisx[176] = 1158465392;
        gz.fisx[177] = 480449509;
        gz.fisx[178] = -1412022831;
        gz.fisx[179] = 1578566758;
        gz.fisx[180] = 1345609190;
        gz.fisx[181] = 1132458947;
        gz.fisx[182] = 153758028;
        gz.fisx[183] = -796149819;
        gz.fisx[184] = 55599369;
        gz.fisx[185] = -1956053629;
        gz.fisx[186] = -1694970742;
        gz.fisx[187] = 985363336;
        gz.fisx[188] = -1317206778;
        gz.fisx[189] = 1481856760;
        gz.fisx[190] = -1106293364;
        gz.fisx[191] = 2042688307;
        gz.fisx[192] = 2107873819;
        gz.fisx[193] = -1970857870;
        gz.fisx[194] = 789302613;
        gz.fisx[195] = -2081446061;
        gz.fisx[196] = 1495822230;
        gz.fisx[197] = 1137425264;
        gz.fisx[198] = -973653829;
        gz.fisx[199] = -1060663201;
    }

    private static /* synthetic */ void fkcc() {
        gz.fisy[200] = -1250097218;
        gz.fisy[201] = -674922210;
        gz.fisy[202] = 2014322297;
        gz.fisy[203] = 2082095076;
        gz.fisy[204] = -1797773861;
        gz.fisy[205] = 1530267526;
        gz.fisy[206] = -513786170;
        gz.fisy[207] = -1142541184;
        gz.fisy[208] = 1904519687;
        gz.fisy[209] = -1084053113;
        gz.fisy[210] = 372794252;
        gz.fisy[211] = 382086358;
        gz.fisy[212] = -826405556;
        gz.fisy[213] = -1963096470;
        gz.fisy[214] = -542564234;
        gz.fisy[215] = 450188479;
        gz.fisy[216] = 237182946;
        gz.fisy[217] = 832675022;
        gz.fisy[218] = -327056167;
        gz.fisy[219] = -1272718498;
        gz.fisy[220] = -2137004112;
        gz.fisy[221] = -16703264;
        gz.fisy[222] = 627869648;
        gz.fisy[223] = 1435915891;
        gz.fisy[224] = -365403374;
        gz.fisy[225] = -471432760;
        gz.fisy[226] = -2143907161;
        gz.fisy[227] = -1274575119;
        gz.fisy[228] = 376845277;
        gz.fisy[229] = 1346097766;
        gz.fisy[230] = 396863818;
        gz.fisy[231] = 293092687;
        gz.fisy[232] = -687458851;
        gz.fisy[233] = -1694178575;
        gz.fisy[234] = -769658570;
        gz.fisy[235] = -1465645695;
        gz.fisy[236] = 62446144;
        gz.fisy[237] = -1767860458;
        gz.fisy[238] = -332350171;
        gz.fisy[239] = -502347684;
        gz.fisy[240] = 2144075644;
        gz.fisy[241] = 356037887;
        gz.fisy[242] = 581678387;
        gz.fisy[243] = 666809107;
        gz.fisy[244] = -1877820997;
        gz.fisy[245] = -566235534;
        gz.fisy[246] = 1793306892;
        gz.fisy[247] = -354110846;
        gz.fisy[248] = -700469543;
        gz.fisy[249] = -439579272;
        gz.fisy[250] = 776346102;
        gz.fisy[251] = 317575355;
        gz.fisy[252] = 606910810;
        gz.fisy[253] = 35746520;
        gz.fisy[254] = -576906749;
        gz.fisy[255] = -746290636;
        gz.fisy[256] = 1136553226;
        gz.fisy[257] = 1819515055;
        gz.fisy[258] = -1043941464;
        gz.fisy[259] = 828228148;
        gz.fisy[260] = -983316434;
        gz.fisy[261] = -1349336085;
        gz.fisy[262] = 2092260310;
        gz.fisy[263] = 634529222;
        gz.fisy[264] = 1713162134;
        gz.fisy[265] = -614340212;
        gz.fisy[266] = 471688792;
        gz.fisy[267] = 644982149;
        gz.fisy[268] = 1194596679;
        gz.fisy[269] = -57174410;
        gz.fisy[270] = -2095457517;
        gz.fisy[271] = -964920428;
        gz.fisy[272] = 2064569690;
        gz.fisy[273] = -612597623;
        gz.fisy[274] = -300408945;
        gz.fisy[275] = -600347440;
        gz.fisy[276] = 935616803;
        gz.fisy[277] = -1713793810;
        gz.fisy[278] = 528714933;
        gz.fisy[279] = 60748105;
        gz.fisy[280] = 1454301332;
        gz.fisy[281] = 159913907;
        gz.fisy[282] = 737269978;
        gz.fisy[283] = -1472204819;
        gz.fisy[284] = 1615256035;
        gz.fisy[285] = 556509338;
        gz.fisy[286] = -1726112260;
        gz.fisy[287] = 154403205;
        gz.fisy[288] = 866316139;
        gz.fisy[289] = 617038125;
        gz.fisy[290] = 336363594;
        gz.fisy[291] = 128610021;
        gz.fisy[292] = -1891759883;
        gz.fisy[293] = 1596843128;
        gz.fisy[294] = 1710740944;
        gz.fisy[295] = -2026019375;
        gz.fisy[296] = 785275077;
        gz.fisy[297] = -936580130;
        gz.fisy[298] = -1224147218;
        gz.fisy[299] = 1340322554;
    }

    private static /* synthetic */ void fkci() {
        gz.fitt[0] = 4530162869379486272L;
        gz.fitt[1] = 5025970031475580071L;
        gz.fitt[2] = 5495684496432791382L;
        gz.fitt[3] = 5088879632915746477L;
        gz.fitt[4] = -2027249288893855478L;
        gz.fitt[5] = -7554070043837722377L;
        gz.fitt[6] = 4529219351134937601L;
        gz.fitt[7] = -2371961346809879001L;
        gz.fitt[8] = 8788596954314771175L;
        gz.fitt[9] = 3282117361245780744L;
        gz.fitt[10] = 1503291969453622870L;
        gz.fitt[11] = -760814902901512425L;
        gz.fitt[12] = 6740003836376400394L;
        gz.fitt[13] = 3693320207223565397L;
        gz.fitt[14] = 2891934473979649402L;
        gz.fitt[15] = 3743782055706319545L;
        gz.fitt[16] = -6390437353840855014L;
        gz.fitt[17] = -7939144757406810376L;
        gz.fitt[18] = 6566346867461714334L;
        gz.fitt[19] = -1784447466877172739L;
        gz.fitt[20] = -542743642148572287L;
        gz.fitt[21] = -7773549926833944520L;
        gz.fitt[22] = -2532506234517110632L;
        gz.fitt[23] = 6713237426944972916L;
        gz.fitt[24] = 425279726253688552L;
        gz.fitt[25] = -1941884639782551643L;
        gz.fitt[26] = 8001354954258658456L;
        gz.fitt[27] = 5361512873199724450L;
        gz.fitt[28] = -4367072529207447724L;
        gz.fitt[29] = -5972313351938193591L;
        gz.fitt[30] = 8099848003141344789L;
        gz.fitt[31] = -8914107338489068814L;
        gz.fitt[32] = 6248635016013445663L;
        gz.fitt[33] = 7853192917529251341L;
        gz.fitt[34] = 377896235738441453L;
        gz.fitt[35] = 4047612265012157071L;
        gz.fitt[36] = -101745516383031904L;
        gz.fitt[37] = -5945249272922082381L;
        gz.fitt[38] = 6893776422347421259L;
        gz.fitt[39] = -8117481202568837646L;
        gz.fitt[40] = -5735015127229925503L;
        gz.fitt[41] = -5375222508961216351L;
        gz.fitt[42] = -8604981590348803164L;
        gz.fitt[43] = 7069993771173946693L;
        gz.fitt[44] = 4348390039508977976L;
        gz.fitt[45] = 299452993190733000L;
        gz.fitt[46] = -3672838707530329266L;
        gz.fitt[47] = -4528005130421500787L;
        gz.fitt[48] = 3861585074694885527L;
        gz.fitt[49] = 4514887299520575606L;
        gz.fitt[50] = 6960358978942061571L;
        gz.fitt[51] = 5566850875680810886L;
        gz.fitt[52] = -5147657179035108994L;
        gz.fitt[53] = -606030551251427255L;
        gz.fitt[54] = -8471565534647481293L;
        gz.fitt[55] = 263867101763319717L;
        gz.fitt[56] = 1942966223074054861L;
        gz.fitt[57] = -6424535917740717763L;
        gz.fitt[58] = -4220415859667302376L;
        gz.fitt[59] = -8809803751416607825L;
        gz.fitt[60] = -5531322684002224022L;
        gz.fitt[61] = -3594566333853244126L;
        gz.fitt[62] = 7541685128461834834L;
        gz.fitt[63] = 7384975667074073472L;
        gz.fitt[64] = -18113039564626513L;
        gz.fitt[65] = -1063815831598210727L;
        gz.fitt[66] = -10155970222802909L;
        gz.fitt[67] = 1714062299199307684L;
        gz.fitt[68] = 5981947197900666859L;
        gz.fitt[69] = -8496418160203637116L;
        gz.fitt[70] = -4069231146232856393L;
        gz.fitt[71] = -7384012940506823962L;
        gz.fitt[72] = -6732473391453633830L;
        gz.fitt[73] = -2679282319508394448L;
        gz.fitt[74] = 6284179860367497016L;
        gz.fitt[75] = -2351078535010840044L;
        gz.fitt[76] = 8721442967574882343L;
        gz.fitt[77] = 4041918713704039900L;
        gz.fitt[78] = -4294005559981145622L;
        gz.fitt[79] = -8707030323850944772L;
        gz.fitt[80] = 8361386229864601675L;
        gz.fitt[81] = -2813226936271008560L;
        gz.fitt[82] = -4755340253233999316L;
        gz.fitt[83] = -1594910406358204130L;
        gz.fitt[84] = -5764848991566637661L;
        gz.fitt[85] = 8871761200256090134L;
        gz.fitt[86] = -6011539243576959393L;
        gz.fitt[87] = 1313604564172002732L;
        gz.fitt[88] = 5729078239153786207L;
        gz.fitt[89] = 2765163894355788639L;
        gz.fitt[90] = 3271358995240377070L;
        gz.fitt[91] = 8528491606669391916L;
        gz.fitt[92] = -490783911931115181L;
        gz.fitt[93] = 9002190844485816707L;
        gz.fitt[94] = 4244770355750306945L;
        gz.fitt[95] = 269275215160314067L;
        gz.fitt[96] = 28885827742978080L;
        gz.fitt[97] = -2870637002553386805L;
        gz.fitt[98] = 6085447748524466195L;
        gz.fitt[99] = 8621993923882947744L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public gz() {
        var2_1 /* !! */  = gz.b;
        super("AimBot", "\u041d\u0430\u0432\u043e\u0434\u0438\u0442 \u043b\u0443\u043a, \u0442\u0440\u0435\u0437\u0443\u0431\u0435\u0446 \u0438\u043b\u0438 \u0430\u0440\u0431\u0430\u043b\u0435\u0442 \u043d\u0430 \u0431\u043b\u0438\u0436\u0430\u0439\u0448\u0435\u0433\u043e \u0438\u0433\u0440\u043e\u043a\u0430", du.RAGE);
        this.weapons = new ke("\u0427\u0435\u043c \u043d\u0430\u0432\u043e\u0434\u0438\u0442\u044c\u0441\u044f", "\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u043e\u0440\u0443\u0436\u0438\u0435 \u0434\u043b\u044f \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u043d\u0430\u0432\u0435\u0434\u0435\u043d\u0438\u044f").value(new String[]{"\u041b\u0443\u043a\u043e\u043c", "\u0422\u0440\u0435\u0437\u0443\u0431\u0446\u0435\u043c", "\u0410\u0440\u0431\u0430\u043b\u0435\u0442\u043e\u043c"}).selected(new String[]{"\u041b\u0443\u043a\u043e\u043c", "\u0422\u0440\u0435\u0437\u0443\u0431\u0446\u0435\u043c", "\u0410\u0440\u0431\u0430\u043b\u0435\u0442\u043e\u043c"});
        this.aimDistance = new kg("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043d\u0430\u0432\u043e\u0434\u043a\u0438", "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u0430\u044f \u0434\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043f\u043e\u0438\u0441\u043a\u0430 \u0438\u0433\u0440\u043e\u043a\u0430", (float)gz.fisz("fita", fisw(int ), (int)0)).range(1.0f, (float)gz.fisz("fitb", fisw(int ), (int)1)).step(1.0f);
        this.predict = new kb("\u041f\u0440\u0435\u0434\u0438\u043a\u0442", "\u0423\u0447\u0438\u0442\u044b\u0432\u0430\u0442\u044c \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0438 \u043d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0438\u0433\u0440\u043e\u043a\u0430").setValue((boolean)gz.fisz("fitd", fitc(int ), (int)2));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.smoothedTargetVelocity = class_243.field_1353;
                this.velocityTargetId = (int)gz.fisz("fite", fitc(int ), (int)3);
                this.lastTargetAge = (int)gz.fisz("fitf", fitc(int ), (int)4);
                this.smoothMode = new gz$AimSmoothMode();
                this.settings(new jx[]{this.weapons, this.aimDistance, this.predict});
                return;
            }
lbl15:
            // 2 sources

            case 0: {
                var2_1 /* !! */  = (int)gz.fisz("fitg", fitc(int ), (int)5);
                ** GOTO lbl27
            }
lbl18:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)gz.fisz("fith", fitc(int ), (int)6);
                ** GOTO lbl32
            }
            case 2: {
                var2_1 /* !! */  = (int)gz.fisz("fiti", fitc(int ), (int)7);
                ** GOTO lbl39
            }
lbl24:
            // 2 sources

            case 3: {
                var2_1 /* !! */  = (int)gz.fisz("fitj", fitc(int ), (int)8);
                ** GOTO lbl29
            }
lbl27:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)gz.fisz("fitk", fitc(int ), (int)9);
            }
lbl29:
            // 3 sources

            case 5: {
                var2_1 /* !! */  = (int)gz.fisz("fitl", fitc(int ), (int)10);
                ** GOTO lbl35
            }
lbl32:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)gz.fisz("fitm", fitc(int ), (int)11);
                ** GOTO lbl24
            }
lbl35:
            // 2 sources

            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)gz.fisz("fitn", fitc(int ), (int)12);
                    ** GOTO lbl18
                    break;
                }
            }
lbl39:
            // 3 sources

            case 8: {
                var2_1 /* !! */  = (int)gz.fisz("fito", fitc(int ), (int)13);
                ** GOTO lbl15
            }
            case 9: {
                var2_1 /* !! */  = (int)gz.fisz("fitp", fitc(int ), (int)14);
                ** GOTO lbl39
            }
            case 10: 
        }
        var2_1 /* !! */  = (int)gz.fisz("fitq", fitc(int ), (int)15);
        ** while (true)
    }

    private static /* synthetic */ void fkca() {
        gz.fisy[0] = -1680297694;
        gz.fisy[1] = 1564802589;
        gz.fisy[2] = 426813743;
        gz.fisy[3] = 648634241;
        gz.fisy[4] = -628982049;
        gz.fisy[5] = 717021514;
        gz.fisy[6] = 1719811892;
        gz.fisy[7] = 1526824525;
        gz.fisy[8] = 172763166;
        gz.fisy[9] = 1415158586;
        gz.fisy[10] = 2082702383;
        gz.fisy[11] = 1622740295;
        gz.fisy[12] = -1989440239;
        gz.fisy[13] = 1315936884;
        gz.fisy[14] = -447680405;
        gz.fisy[15] = 1040591339;
        gz.fisy[16] = 1077730453;
        gz.fisy[17] = 1203930072;
        gz.fisy[18] = 1661817136;
        gz.fisy[19] = 400625283;
        gz.fisy[20] = 721920162;
        gz.fisy[21] = 357794080;
        gz.fisy[22] = -1228205998;
        gz.fisy[23] = 1638462831;
        gz.fisy[24] = -2017510252;
        gz.fisy[25] = 658950719;
        gz.fisy[26] = 1620060429;
        gz.fisy[27] = -1735310222;
        gz.fisy[28] = -1391229530;
        gz.fisy[29] = -457606231;
        gz.fisy[30] = -1144186887;
        gz.fisy[31] = -1457368397;
        gz.fisy[32] = 295393292;
        gz.fisy[33] = 613297452;
        gz.fisy[34] = 1116200131;
        gz.fisy[35] = 1731031547;
        gz.fisy[36] = 1422557297;
        gz.fisy[37] = 170624103;
        gz.fisy[38] = 488193135;
        gz.fisy[39] = 1915608907;
        gz.fisy[40] = 2075313622;
        gz.fisy[41] = 1619641539;
        gz.fisy[42] = 9721672;
        gz.fisy[43] = 1203948018;
        gz.fisy[44] = 407812173;
        gz.fisy[45] = -1566771181;
        gz.fisy[46] = 1656737632;
        gz.fisy[47] = -1988985504;
        gz.fisy[48] = -324995837;
        gz.fisy[49] = 1055907947;
        gz.fisy[50] = -1722664679;
        gz.fisy[51] = 1657858918;
        gz.fisy[52] = -192295842;
        gz.fisy[53] = -913638361;
        gz.fisy[54] = -1278544069;
        gz.fisy[55] = 1767104357;
        gz.fisy[56] = 1837767615;
        gz.fisy[57] = -1350742428;
        gz.fisy[58] = 965357141;
        gz.fisy[59] = 1495889280;
        gz.fisy[60] = 507188038;
        gz.fisy[61] = 503950894;
        gz.fisy[62] = 1325757100;
        gz.fisy[63] = -857257095;
        gz.fisy[64] = 341925905;
        gz.fisy[65] = -1574320215;
        gz.fisy[66] = 1352553412;
        gz.fisy[67] = -1829647521;
        gz.fisy[68] = -929875123;
        gz.fisy[69] = 1167495108;
        gz.fisy[70] = 194436197;
        gz.fisy[71] = -257502099;
        gz.fisy[72] = 771778842;
        gz.fisy[73] = -188799892;
        gz.fisy[74] = -1916764631;
        gz.fisy[75] = 1646982355;
        gz.fisy[76] = 841786033;
        gz.fisy[77] = 1310143211;
        gz.fisy[78] = 670037508;
        gz.fisy[79] = 547927462;
        gz.fisy[80] = -160928663;
        gz.fisy[81] = -95730410;
        gz.fisy[82] = 1904241153;
        gz.fisy[83] = -1695392780;
        gz.fisy[84] = -694664392;
        gz.fisy[85] = -274482567;
        gz.fisy[86] = -1186186141;
        gz.fisy[87] = -95017193;
        gz.fisy[88] = -184377735;
        gz.fisy[89] = -1493065517;
        gz.fisy[90] = -490902259;
        gz.fisy[91] = 2051514446;
        gz.fisy[92] = 1599457775;
        gz.fisy[93] = -1796464700;
        gz.fisy[94] = 1631071523;
        gz.fisy[95] = -2003447927;
        gz.fisy[96] = 77782025;
        gz.fisy[97] = 1566337988;
        gz.fisy[98] = 321423600;
        gz.fisy[99] = -1492162173;
    }

    private static /* synthetic */ void fkch() {
        gz.fits[100] = 933151066429478930L;
        gz.fits[101] = 1280598108546510539L;
        gz.fits[102] = -7096082007889875133L;
        gz.fits[103] = -6962653425155180002L;
        gz.fits[104] = -4171848842923576655L;
        gz.fits[105] = 1316067485272944012L;
        gz.fits[106] = 5463650449407958307L;
        gz.fits[107] = -783717644226244303L;
        gz.fits[108] = -2767631919089526791L;
        gz.fits[109] = 8690746848530399526L;
        gz.fits[110] = 8472736879322592409L;
        gz.fits[111] = -42614184147622056L;
        gz.fits[112] = 4068003862615632791L;
        gz.fits[113] = -1720240661579302507L;
        gz.fits[114] = 203568454146513931L;
        gz.fits[115] = 2527769820633164929L;
        gz.fits[116] = 5971183334747320581L;
        gz.fits[117] = 7460589502392219936L;
        gz.fits[118] = -6255507056364343250L;
        gz.fits[119] = 3947465145909916011L;
        gz.fits[120] = -5711220892449984952L;
        gz.fits[121] = -2836267218653967700L;
        gz.fits[122] = 8527116850790377574L;
        gz.fits[123] = 6878529161847610365L;
        gz.fits[124] = -9162590628786019591L;
        gz.fits[125] = -2006925733184735588L;
        gz.fits[126] = 1258986992734487827L;
        gz.fits[127] = -8625811098017271439L;
        gz.fits[128] = 3397202054072908051L;
        gz.fits[129] = 8821548396896690343L;
        gz.fits[130] = 6374635435205004761L;
        gz.fits[131] = 5526650529594827325L;
        gz.fits[132] = -1633305062171899517L;
        gz.fits[133] = 3850217750305785598L;
        gz.fits[134] = -2075193357603903275L;
        gz.fits[135] = 3882244710931002753L;
        gz.fits[136] = 2614450630996718656L;
        gz.fits[137] = 3931849545383490417L;
        gz.fits[138] = 4607063099009051344L;
        gz.fits[139] = 4682681697826465002L;
        gz.fits[140] = -8594199267657822446L;
        gz.fits[141] = 8074782307974839636L;
        gz.fits[142] = 143059999271906529L;
        gz.fits[143] = 3614327589753719335L;
        gz.fits[144] = -2238681371743070350L;
        gz.fits[145] = -7460128875267605946L;
        gz.fits[146] = 2802940809926818512L;
        gz.fits[147] = 8133091307236151367L;
        gz.fits[148] = 5224752562493100216L;
        gz.fits[149] = 6600788406703946101L;
        gz.fits[150] = 6330141857328765364L;
        gz.fits[151] = -160510107322749131L;
        gz.fits[152] = 1089982730658427012L;
        gz.fits[153] = -7929855977415125781L;
        gz.fits[154] = 5225904736964039245L;
        gz.fits[155] = -2806015914057956202L;
        gz.fits[156] = -164302332136130002L;
        gz.fits[157] = -4710619085723378213L;
        gz.fits[158] = 7929572407218536333L;
        gz.fits[159] = -4651250492380029895L;
        gz.fits[160] = -7543728697432447373L;
        gz.fits[161] = -8945933641506389252L;
        gz.fits[162] = -997578043227904497L;
        gz.fits[163] = 9097822279730165696L;
        gz.fits[164] = 7488521335950067811L;
        gz.fits[165] = 7419790272734520902L;
        gz.fits[166] = 4431732719530914951L;
        gz.fits[167] = 169801673314849045L;
        gz.fits[168] = 5617215840793500252L;
        gz.fits[169] = 5538170061262779024L;
        gz.fits[170] = 8227371402929712901L;
        gz.fits[171] = 3071350109551208335L;
        gz.fits[172] = 2096486378889106928L;
        gz.fits[173] = -157131101414833836L;
        gz.fits[174] = -4993118240427393652L;
        gz.fits[175] = 256873214477890975L;
        gz.fits[176] = -6486723757331134843L;
        gz.fits[177] = 4907343021012781819L;
        gz.fits[178] = -3028082867231361725L;
        gz.fits[179] = 8988760959819026609L;
        gz.fits[180] = -5699513984424159608L;
        gz.fits[181] = 500978710861038325L;
        gz.fits[182] = -1720462238572748257L;
        gz.fits[183] = 4178103215625804838L;
    }

    private static /* synthetic */ void fkce() {
        gz.fisy[400] = -2028961247;
        gz.fisy[401] = -623673021;
        gz.fisy[402] = 1705722603;
        gz.fisy[403] = -37422083;
        gz.fisy[404] = -1243773314;
        gz.fisy[405] = 2054436008;
        gz.fisy[406] = 157376125;
        gz.fisy[407] = -982772551;
        gz.fisy[408] = -1006282388;
        gz.fisy[409] = -1264111252;
        gz.fisy[410] = -1115588446;
        gz.fisy[411] = -1687768303;
        gz.fisy[412] = -469259700;
        gz.fisy[413] = -1261663681;
        gz.fisy[414] = 1447413016;
        gz.fisy[415] = 1903878994;
        gz.fisy[416] = -144302453;
        gz.fisy[417] = 275015133;
        gz.fisy[418] = 526569585;
        gz.fisy[419] = 930441024;
        gz.fisy[420] = -1237561173;
        gz.fisy[421] = -1191979314;
        gz.fisy[422] = 1607204114;
        gz.fisy[423] = -1644040860;
        gz.fisy[424] = -2052307192;
        gz.fisy[425] = -1864803443;
        gz.fisy[426] = -1237752690;
        gz.fisy[427] = 1786781076;
        gz.fisy[428] = -985596302;
        gz.fisy[429] = 2030589403;
        gz.fisy[430] = 230315126;
        gz.fisy[431] = 536090672;
        gz.fisy[432] = -437092720;
        gz.fisy[433] = -1096728013;
        gz.fisy[434] = 1859906237;
        gz.fisy[435] = -1452986350;
        gz.fisy[436] = 747571456;
        gz.fisy[437] = 256188956;
        gz.fisy[438] = -702229639;
        gz.fisy[439] = -1044656381;
        gz.fisy[440] = 2036700866;
        gz.fisy[441] = -108742721;
        gz.fisy[442] = 392732395;
        gz.fisy[443] = 1630842224;
        gz.fisy[444] = -665827371;
        gz.fisy[445] = -993040712;
        gz.fisy[446] = -2014579780;
        gz.fisy[447] = 44257628;
        gz.fisy[448] = 1560520994;
        gz.fisy[449] = -1641099728;
        gz.fisy[450] = -115138167;
        gz.fisy[451] = 669583512;
        gz.fisy[452] = 1756470956;
        gz.fisy[453] = -603611766;
        gz.fisy[454] = -1975735918;
        gz.fisy[455] = -334994741;
        gz.fisy[456] = 286208761;
        gz.fisy[457] = 655575410;
        gz.fisy[458] = 1482794740;
        gz.fisy[459] = -1454529582;
        gz.fisy[460] = 646512455;
        gz.fisy[461] = -1908369256;
        gz.fisy[462] = 976403163;
        gz.fisy[463] = -222528900;
        gz.fisy[464] = 2030307863;
        gz.fisy[465] = -1249733036;
        gz.fisy[466] = -1789255128;
        gz.fisy[467] = -1929149800;
        gz.fisy[468] = 814324163;
        gz.fisy[469] = -59455853;
        gz.fisy[470] = 1593228269;
        gz.fisy[471] = 1963363546;
        gz.fisy[472] = 36139458;
        gz.fisy[473] = -342993978;
        gz.fisy[474] = 1467601494;
        gz.fisy[475] = -1980104719;
        gz.fisy[476] = 222306346;
        gz.fisy[477] = -2102941668;
        gz.fisy[478] = -719450682;
        gz.fisy[479] = -39143719;
        gz.fisy[480] = 156508022;
        gz.fisy[481] = -2069633550;
        gz.fisy[482] = -533203392;
        gz.fisy[483] = -1221267347;
        gz.fisy[484] = -577449847;
        gz.fisy[485] = 22344586;
        gz.fisy[486] = -1379752184;
        gz.fisy[487] = -1115544513;
        gz.fisy[488] = 287215858;
        gz.fisy[489] = -857207301;
        gz.fisy[490] = 361863305;
        gz.fisy[491] = 470732972;
        gz.fisy[492] = 1019703665;
        gz.fisy[493] = 1720981352;
        gz.fisy[494] = -1799707527;
        gz.fisy[495] = 855021098;
        gz.fisy[496] = 172249274;
        gz.fisy[497] = -1776151436;
        gz.fisy[498] = 1079617594;
        gz.fisy[499] = 1146500067;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void deactivate() {
        while (true) {
            block109: {
                if ((v0 /* !! */  = (cfr_temp_1 = gz.me - gz.fisz("fivy", fitr(int ), (int)24)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  != gz.fisz("fivz", fitc(int ), (int)48)) break block109;
                var3_1 = gz.c;
                v1 /* !! */  = gz.me;
                if (true) ** GOTO lbl12
            }
            v0 /* !! */  = (long)gz.fisz("fiwa", fitc(int ), (int)49);
        }
        block63: while (true) {
            v1 /* !! */  = (long)(v2 - gz.fisz("fiwb", fitr(int ), (int)25));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 494017777: {
                    v2 = gz.fisz("fiwc", fitr(int ), (int)26);
                    continue block63;
                }
                case 1124680564: {
                    break block63;
                }
                case 2145047426: {
                    v2 = gz.fisz("fiwd", fitr(int ), (int)27);
                    continue block63;
                }
            }
            break;
        }
        var2_2 /* !! */  = gz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = gz.me - gz.fisz("fiwe", fitr(int ), (int)28)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == gz.fisz("fiwf", fitc(int ), (int)50)) {
                var1_3 = gz.a;
                if (var3_1) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)gz.fisz("fiwg", fitc(int ), (int)51);
        }
        if (var1_3 || var1_3) return;
        v4 /* !! */  = gz.me;
        block65: while (true) {
            switch ((int)v4 /* !! */ ) {
                case -408391635: {
                    v4 /* !! */  = (long)(gz.fisz("fiwi", fitr(int ), (int)30) - gz.fisz("fiwh", fitr(int ), (int)29));
                    continue block65;
                }
                case 1124680564: {
                    break block65;
                }
            }
            break;
        }
        this.target = null;
        if (var1_3 || var1_3) return;
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = gz.me - gz.fisz("fiwj", fitr(int ), (int)31)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == gz.fisz("fiwk", fitc(int ), (int)52)) {
                this.aimAngle = null;
                if (var1_3) return;
                break;
            }
            v5 /* !! */  = (long)gz.fisz("fiwl", fitc(int ), (int)53);
        }
        if (var1_3) return;
        v6 = gz.fisz("fiwm", fitc(int ), (int)54);
        v7 /* !! */  = gz.me;
        if (true) ** GOTO lbl56
        block67: while (true) {
            v7 /* !! */  = (long)(v8 - gz.fisz("fiwn", fitr(int ), (int)32));
lbl56:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -370048101: {
                    v8 = gz.fisz("fiwo", fitr(int ), (int)33);
                    continue block67;
                }
                case 888256040: {
                    v8 = gz.fisz("fiwp", fitr(int ), (int)34);
                    continue block67;
                }
                case 1124680564: {
                    break block67;
                }
            }
            break;
        }
        this.replacingCrossbowPacket = v6;
        if (var1_3 || var1_3) return;
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = gz.me - gz.fisz("fiwq", fitr(int ), (int)35)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == gz.fisz("fiwr", fitc(int ), (int)55)) break;
            v9 /* !! */  = (long)gz.fisz("fiws", fitc(int ), (int)56);
        }
        v10 /* !! */  = gz.me;
        block69: while (true) {
            switch ((int)v10 /* !! */ ) {
                case -370264497: {
                    v10 /* !! */  = (long)(gz.fisz("fiwu", fitr(int ), (int)37) - gz.fisz("fiwt", fitr(int ), (int)36));
                    continue block69;
                }
                case 1124680564: {
                    break block69;
                }
            }
            break;
        }
        this.smoothedTargetVelocity = class_243.field_1353;
        if (var1_3) return;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block70: while (true) {
            block108: {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var1_3) return;
                        v11 = gz.fisz("fiwv", fitc(int ), (int)57);
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_5 = gz.me - gz.fisz("fiww", fitr(int ), (int)38)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  == gz.fisz("fiwx", fitc(int ), (int)58)) {
                                this.velocityTargetId = (int)v11;
                                if (var1_3) return;
                                break;
                            }
                            v12 /* !! */  = (long)gz.fisz("fiwy", fitc(int ), (int)59);
                        }
                        if (var1_3) return;
                        v13 /* !! */  = gz.me;
                        block72: while (true) {
                            switch ((int)v13 /* !! */ ) {
                                case -1845651431: {
                                    v14 = gz.fisz("fixa", fitr(int ), (int)40);
                                    ** GOTO lbl106
                                }
                                case -102045387: {
                                    v14 = gz.fisz("fixb", fitr(int ), (int)41);
lbl106:
                                    // 2 sources

                                    v13 /* !! */  = (long)(v14 - gz.fisz("fiwz", fitr(int ), (int)39));
                                    continue block72;
                                }
                                case 1124680564: {
                                    break block72;
                                }
                            }
                            break;
                        }
                        this.lastTargetPosition = null;
                        if (var1_3 || var1_3) return;
                        v15 = gz.fisz("fixc", fitc(int ), (int)60);
                        while (true) {
                            if ((v16 /* !! */  = (cfr_temp_6 = gz.me - gz.fisz("fixd", fitr(int ), (int)42)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v16 /* !! */  == gz.fisz("fixe", fitc(int ), (int)61)) {
                                this.lastTargetAge = (int)v15;
                                if (var1_3) return;
                                break;
                            }
                            v16 /* !! */  = (long)gz.fisz("fixf", fitc(int ), (int)62);
                        }
                        if (var1_3) return;
                        v17 /* !! */  = gz.me;
                        block74: while (true) {
                            switch ((int)v17 /* !! */ ) {
                                case -1794294665: {
                                    v17 /* !! */  = (long)(gz.fisz("fixh", fitr(int ), (int)44) - gz.fisz("fixg", fitr(int ), (int)43));
                                    continue block74;
                                }
                                case 1124680564: {
                                    break block74;
                                }
                            }
                            break;
                        }
                        v18 /* !! */  = gz.me;
                        block75: while (true) {
                            switch ((int)v18 /* !! */ ) {
                                case -1488015191: {
                                    v19 = gz.fisz("fixj", fitr(int ), (int)46);
                                    ** GOTO lbl143
                                }
                                case -761383206: {
                                    v19 = gz.fisz("fixk", fitr(int ), (int)47);
                                    ** GOTO lbl143
                                }
                                case 1124680564: {
                                    break block75;
                                }
                                case 1692173846: {
                                    v19 = gz.fisz("fixl", fitr(int ), (int)48);
lbl143:
                                    // 3 sources

                                    v18 /* !! */  = (long)(v19 - gz.fisz("fixi", fitr(int ), (int)45));
                                    continue block75;
                                }
                            }
                            break;
                        }
                        ot.INSTANCE.releaseProvider(this);
                        if (var1_3 || var1_3) return;
                        v20 /* !! */  = gz.me;
                        block76: while (true) {
                            switch ((int)v20 /* !! */ ) {
                                case -1533199080: {
                                    v21 = gz.fisz("fixn", fitr(int ), (int)50);
                                    ** GOTO lbl155
                                }
                                case -1359545674: {
                                    v21 = gz.fisz("fixo", fitr(int ), (int)51);
lbl155:
                                    // 2 sources

                                    v20 /* !! */  = (long)(v21 - gz.fisz("fixm", fitr(int ), (int)49));
                                    continue block76;
                                }
                                case 1124680564: {
                                    break block76;
                                }
                            }
                            break;
                        }
                        super.deactivate();
                        if (!var1_3 && !var1_3) return;
                        return;
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)gz.fisz("fixs", fitc(int ), (int)66);
                        cfr_temp_0 = 13;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)gz.fisz("fixw", fitc(int ), (int)70);
                        cfr_temp_0 = 16;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 8: {
                        var2_2 /* !! */  = (int)gz.fisz("fixx", fitc(int ), (int)71);
                        cfr_temp_0 = 2;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 11: {
                        var2_2 /* !! */  = (int)gz.fisz("fiya", fitc(int ), (int)74);
                        if (!var3_1) ** break;
                        throw null;
                    }
                    case 13: {
                        var2_2 /* !! */  = (int)gz.fisz("fiyc", fitc(int ), (int)76);
                        cfr_temp_0 = 4;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 14: {
                        var2_2 /* !! */  = (int)gz.fisz("fiyd", fitc(int ), (int)77);
                        cfr_temp_0 = 6;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 16: {
                        var2_2 /* !! */  = (int)gz.fisz("fiyf", fitc(int ), (int)79);
                        cfr_temp_0 = 12;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 19: {
                        var2_2 /* !! */  = (int)gz.fisz("fiyi", fitc(int ), (int)82);
                        cfr_temp_0 = 15;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                    }
                    case 20: {
                        var2_2 /* !! */  = (int)gz.fisz("fiyj", fitc(int ), (int)83);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 10: {
                        var2_2 /* !! */  = (int)gz.fisz("fixz", fitc(int ), (int)73);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var2_2 /* !! */  = (int)gz.fisz("fixy", fitc(int ), (int)72);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)gz.fisz("fixv", fitc(int ), (int)69);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** break;
                    }
                    case 21: {
                        ** GOTO lbl246
                    }
lbl228:
                    // 2 sources

                    while (true) {
                        var2_2 /* !! */  = (int)gz.fisz("fixp", fitc(int ), (int)63);
                        cfr_temp_0 = 18;
                        if (var3_1) {
                            throw null;
                        }
                        break block108;
                        break;
                    }
                    case 18: {
                        var2_2 /* !! */  = (int)gz.fisz("fiyh", fitc(int ), (int)81);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var2_2 /* !! */  = (int)gz.fisz("fixq", fitc(int ), (int)64);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)gz.fisz("fixu", fitc(int ), (int)68);
                        if (!var3_1) ** break;
                        throw null;
lbl246:
                        // 3 sources

                        var2_2 /* !! */  = (int)gz.fisz("fiyk", fitc(int ), (int)84);
                        if (!var3_1) ** continue;
                        throw null;
                    }
                    case 2: {
                        var2_2 /* !! */  = (int)gz.fisz("fixr", fitc(int ), (int)65);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 12: {
                        var2_2 /* !! */  = (int)gz.fisz("fiyb", fitc(int ), (int)75);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        var2_2 /* !! */  = (int)gz.fisz("fixt", fitc(int ), (int)67);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 15: {
                        var2_2 /* !! */  = (int)gz.fisz("fiye", fitc(int ), (int)78);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 17: 
                }
                ** GOTO lbl270
            }
            do {
                if (true) continue block70;
lbl270:
                // 2 sources

                var2_2 /* !! */  = (int)gz.fisz("fiyg", fitc(int ), (int)80);
                cfr_temp_0 = 2;
            } while (!var3_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void updateTargetVelocity(class_1657 var1_1) {
        var9_2 = gz.c;
        var8_3 /* !! */  = gz.b;
        var7_4 = gz.a;
        if (var9_2) {
            throw null;
lbl6:
            // 19 sources

            return;
        }
        if (var7_4 || var7_4) ** GOTO lbl6
        var2_5 = var1_1.method_73189();
        if (var7_4 || var7_4) ** GOTO lbl6
        var3_6 = var1_1.method_18798();
        if (var7_4 || var7_4) ** GOTO lbl6
        if (this.velocityTargetId != var1_1.method_5628()) ** GOTO lbl20
        if (var7_4) ** GOTO lbl6
        if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (this.lastTargetPosition != null) ** GOTO lbl28
                if (var7_4) ** GOTO lbl6
lbl20:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.smoothedTargetVelocity = var3_6;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.velocityTargetId = var1_1.method_5628();
                if (var7_4) ** GOTO lbl6
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl42
lbl28:
                // 1 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var4_7 = Math.max((int)gz.fisz("fjpm", fitc(int ), (int)415), var1_1.field_6012 - this.lastTargetAge);
                if (var7_4 || var7_4) ** GOTO lbl6
                var5_8 = var2_5.method_1020(this.lastTargetPosition).method_1021(1.0 / (double)var4_7);
                if (var7_4 || var7_4) ** GOTO lbl6
                if (!(var5_8.method_37268() > gz.fisz("fjpn", fjcs(int ), (int)96))) ** GOTO lbl37
                if (var7_4 || var7_4) ** GOTO lbl6
                var5_8 = var3_6;
                if (var7_4) ** GOTO lbl6
lbl37:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                var6_9 = var5_8.method_1021((double)gz.fisz("fjpo", fjcs(int ), (int)97)).method_1019(var3_6.method_1021((double)gz.fisz("fjpp", fjcs(int ), (int)98)));
                if (var7_4 || var7_4) ** GOTO lbl6
                this.smoothedTargetVelocity = this.smoothedTargetVelocity.method_1021((double)gz.fisz("fjpq", fjcs(int ), (int)99)).method_1019(var6_9.method_1021((double)gz.fisz("fjpr", fjcs(int ), (int)100)));
                if (var7_4) ** GOTO lbl6
lbl42:
                // 2 sources

                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastTargetPosition = var2_5;
                if (var7_4 || var7_4) ** GOTO lbl6
                this.lastTargetAge = var1_1.field_6012;
                if (!var7_4 && !var7_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var8_3 /* !! */  = (int)gz.fisz("fjps", fitc(int ), (int)416);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl181
            }
lbl54:
            // 3 sources

            case 1: {
                var8_3 /* !! */  = (int)gz.fisz("fjpt", fitc(int ), (int)417);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 2: {
                var8_3 /* !! */  = (int)gz.fisz("fjpu", fitc(int ), (int)418);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 3: {
                var8_3 /* !! */  = (int)gz.fisz("fjpv", fitc(int ), (int)419);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl78
            }
lbl69:
            // 2 sources

            case 4: {
                var8_3 /* !! */  = (int)gz.fisz("fjpw", fitc(int ), (int)420);
                if (!var9_2) ** GOTO lbl54
                throw null;
            }
lbl73:
            // 2 sources

            case 5: {
                var8_3 /* !! */  = (int)gz.fisz("fjpx", fitc(int ), (int)421);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl156
            }
lbl78:
            // 2 sources

            case 6: {
                var8_3 /* !! */  = (int)gz.fisz("fjpy", fitc(int ), (int)422);
                if (!var9_2) ** GOTO lbl54
                throw null;
            }
lbl82:
            // 3 sources

            case 7: {
                var8_3 /* !! */  = (int)gz.fisz("fjpz", fitc(int ), (int)423);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl147
            }
lbl87:
            // 2 sources

            case 8: {
                var8_3 /* !! */  = (int)gz.fisz("fjqa", fitc(int ), (int)424);
                if (!var9_2) ** GOTO lbl82
                throw null;
            }
            case 9: {
                var8_3 /* !! */  = (int)gz.fisz("fjqb", fitc(int ), (int)425);
                if (!var9_2) ** GOTO lbl87
                throw null;
            }
lbl95:
            // 2 sources

            case 10: {
                var8_3 /* !! */  = (int)gz.fisz("fjqc", fitc(int ), (int)426);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl100:
            // 2 sources

            case 11: {
                var8_3 /* !! */  = (int)gz.fisz("fjqd", fitc(int ), (int)427);
                if (!var9_2) ** GOTO lbl82
                throw null;
            }
lbl104:
            // 2 sources

            case 12: {
                var8_3 /* !! */  = (int)gz.fisz("fjqe", fitc(int ), (int)428);
                if (!var9_2) ** GOTO lbl100
                throw null;
            }
            case 13: {
                var8_3 /* !! */  = (int)gz.fisz("fjqf", fitc(int ), (int)429);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl138
            }
lbl113:
            // 2 sources

            case 14: {
                var8_3 /* !! */  = (int)gz.fisz("fjqg", fitc(int ), (int)430);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var8_3 /* !! */  = (int)gz.fisz("fjqh", fitc(int ), (int)431);
                    if (var9_2) {
                        throw null;
                    }
                    ** GOTO lbl152
                    break;
                }
            }
            case 16: {
                var8_3 /* !! */  = (int)gz.fisz("fjqi", fitc(int ), (int)432);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 17: {
                var8_3 /* !! */  = (int)gz.fisz("fjqj", fitc(int ), (int)433);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl168
            }
lbl134:
            // 4 sources

            case 18: {
                var8_3 /* !! */  = (int)gz.fisz("fjqk", fitc(int ), (int)434);
                if (!var9_2) break;
                throw null;
            }
lbl138:
            // 3 sources

            case 19: {
                var8_3 /* !! */  = (int)gz.fisz("fjql", fitc(int ), (int)435);
                if (!var9_2) ** GOTO lbl113
                throw null;
            }
lbl142:
            // 2 sources

            case 20: {
                var8_3 /* !! */  = (int)gz.fisz("fjqm", fitc(int ), (int)436);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl147:
            // 3 sources

            case 21: {
                do {
                    var8_3 /* !! */  = (int)gz.fisz("fjqn", fitc(int ), (int)437);
                } while (!var9_2);
                throw null;
            }
lbl152:
            // 3 sources

            case 22: {
                var8_3 /* !! */  = (int)gz.fisz("fjqo", fitc(int ), (int)438);
                if (!var9_2) ** GOTO lbl134
                throw null;
            }
lbl156:
            // 2 sources

            case 23: {
                var8_3 /* !! */  = (int)gz.fisz("fjqp", fitc(int ), (int)439);
                if (!var9_2) ** GOTO lbl73
                throw null;
            }
lbl160:
            // 2 sources

            case 24: {
                var8_3 /* !! */  = (int)gz.fisz("fjqq", fitc(int ), (int)440);
                if (!var9_2) ** GOTO lbl142
                throw null;
            }
            case 25: {
                var8_3 /* !! */  = (int)gz.fisz("fjqr", fitc(int ), (int)441);
                if (!var9_2) ** GOTO lbl147
                throw null;
            }
lbl168:
            // 2 sources

            case 26: {
                var8_3 /* !! */  = (int)gz.fisz("fjqs", fitc(int ), (int)442);
                if (var9_2) {
                    throw null;
                }
                ** GOTO lbl198
            }
lbl173:
            // 3 sources

            case 27: {
                var8_3 /* !! */  = (int)gz.fisz("fjqt", fitc(int ), (int)443);
                if (!var9_2) ** GOTO lbl134
                throw null;
            }
lbl177:
            // 2 sources

            case 28: {
                var8_3 /* !! */  = (int)gz.fisz("fjqu", fitc(int ), (int)444);
                if (!var9_2) ** GOTO lbl173
                throw null;
            }
lbl181:
            // 2 sources

            case 29: {
                var8_3 /* !! */  = (int)gz.fisz("fjqv", fitc(int ), (int)445);
                if (!var9_2) ** GOTO lbl134
                throw null;
            }
lbl185:
            // 2 sources

            case 30: {
                do {
                    var8_3 /* !! */  = (int)gz.fisz("fjqw", fitc(int ), (int)446);
                } while (!var9_2);
                throw null;
            }
lbl190:
            // 2 sources

            case 31: {
                var8_3 /* !! */  = (int)gz.fisz("fjqx", fitc(int ), (int)447);
                if (!var9_2) ** GOTO lbl138
                throw null;
            }
            case 32: {
                var8_3 /* !! */  = (int)gz.fisz("fjqy", fitc(int ), (int)448);
                if (!var9_2) ** GOTO lbl69
                throw null;
            }
lbl198:
            // 2 sources

            case 33: {
                var8_3 /* !! */  = (int)gz.fisz("fjqz", fitc(int ), (int)449);
                if (!var9_2) ** GOTO lbl190
                throw null;
            }
            case 34: {
                var8_3 /* !! */  = (int)gz.fisz("fjra", fitc(int ), (int)450);
                if (!var9_2) ** GOTO lbl95
                throw null;
            }
            case 35: 
        }
        var8_3 /* !! */  = (int)gz.fisz("fjrb", fitc(int ), (int)451);
        ** while (!var9_2)
lbl209:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fkbt() {
        gz.fisx[0] = -634867422;
        gz.fisx[1] = 520945181;
        gz.fisx[2] = 426813742;
        gz.fisx[3] = -1498849407;
        gz.fisx[4] = 1518501599;
        gz.fisx[5] = 717021504;
        gz.fisx[6] = 1719811901;
        gz.fisx[7] = 1526824521;
        gz.fisx[8] = 172763162;
        gz.fisx[9] = 1415158578;
        gz.fisx[10] = 2082702380;
        gz.fisx[11] = 1622740294;
        gz.fisx[12] = -1989440229;
        gz.fisx[13] = 1315936880;
        gz.fisx[14] = -447680414;
        gz.fisx[15] = 1040591342;
        gz.fisx[16] = -1077730454;
        gz.fisx[17] = -170900884;
        gz.fisx[18] = -1661817137;
        gz.fisx[19] = -1258631483;
        gz.fisx[20] = -721920163;
        gz.fisx[21] = -13067265;
        gz.fisx[22] = -1228205998;
        gz.fisx[23] = 1638462830;
        gz.fisx[24] = -2017510249;
        gz.fisx[25] = 658950719;
        gz.fisx[26] = 1620060428;
        gz.fisx[27] = -1453538523;
        gz.fisx[28] = 1391229529;
        gz.fisx[29] = 1110291371;
        gz.fisx[30] = -1144186885;
        gz.fisx[31] = -1457368399;
        gz.fisx[32] = 295393294;
        gz.fisx[33] = 613297452;
        gz.fisx[34] = -1116200132;
        gz.fisx[35] = -635568314;
        gz.fisx[36] = -1422557298;
        gz.fisx[37] = 202900441;
        gz.fisx[38] = -488193136;
        gz.fisx[39] = 1239081321;
        gz.fisx[40] = 2075313621;
        gz.fisx[41] = 1619641539;
        gz.fisx[42] = 9721676;
        gz.fisx[43] = 1203948019;
        gz.fisx[44] = 407812172;
        gz.fisx[45] = -1566771178;
        gz.fisx[46] = 1656737633;
        gz.fisx[47] = -1988985502;
        gz.fisx[48] = 324995836;
        gz.fisx[49] = 1729303409;
        gz.fisx[50] = 1722664678;
        gz.fisx[51] = -2021120494;
        gz.fisx[52] = 192295841;
        gz.fisx[53] = 1628662658;
        gz.fisx[54] = -1278544069;
        gz.fisx[55] = -1767104358;
        gz.fisx[56] = -1065466029;
        gz.fisx[57] = 796741220;
        gz.fisx[58] = 965357140;
        gz.fisx[59] = 359076414;
        gz.fisx[60] = -1640295610;
        gz.fisx[61] = -503950895;
        gz.fisx[62] = 1466047015;
        gz.fisx[63] = -857257110;
        gz.fisx[64] = 341925906;
        gz.fisx[65] = -1574320197;
        gz.fisx[66] = 1352553423;
        gz.fisx[67] = -1829647533;
        gz.fisx[68] = -929875105;
        gz.fisx[69] = 1167495104;
        gz.fisx[70] = 194436199;
        gz.fisx[71] = -257502083;
        gz.fisx[72] = 771778845;
        gz.fisx[73] = -188799902;
        gz.fisx[74] = -1916764635;
        gz.fisx[75] = 1646982354;
        gz.fisx[76] = 841786033;
        gz.fisx[77] = 1310143226;
        gz.fisx[78] = 670037505;
        gz.fisx[79] = 547927462;
        gz.fisx[80] = -160928646;
        gz.fisx[81] = -95730413;
        gz.fisx[82] = 1904241169;
        gz.fisx[83] = -1695392774;
        gz.fisx[84] = -694664392;
        gz.fisx[85] = -274482567;
        gz.fisx[86] = 961297507;
        gz.fisx[87] = 2052466455;
        gz.fisx[88] = -184377736;
        gz.fisx[89] = -1493065518;
        gz.fisx[90] = -490902259;
        gz.fisx[91] = 2051514446;
        gz.fisx[92] = 1599457773;
        gz.fisx[93] = -1796464672;
        gz.fisx[94] = 1631071536;
        gz.fisx[95] = -2003447892;
        gz.fisx[96] = 77782055;
        gz.fisx[97] = 1566338031;
        gz.fisx[98] = 321423578;
        gz.fisx[99] = -1492162138;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static gz getInstance() {
        v0 /* !! */  = gz.me;
        if (true) ** GOTO lbl5
        block11: while (true) {
            v0 /* !! */  = (long)(v1 - gz.fisz("fitu", fitr(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -723729647: {
                    v1 = gz.fisz("fitv", fitr(int ), (int)1);
                    continue block11;
                }
                case -362203716: {
                    v1 = gz.fisz("fitw", fitr(int ), (int)2);
                    continue block11;
                }
                case 1124680564: {
                    break block11;
                }
            }
            break;
        }
        var2 = gz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = gz.me - gz.fisz("fitx", fitr(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == gz.fisz("fity", fitc(int ), (int)16)) break;
            v2 /* !! */  = (long)gz.fisz("fitz", fitc(int ), (int)17);
        }
        var1_1 /* !! */  = gz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = gz.me - gz.fisz("fiua", fitr(int ), (int)4)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == gz.fisz("fiub", fitc(int ), (int)18)) break;
            v3 /* !! */  = (long)gz.fisz("fiuc", fitc(int ), (int)19);
        }
        var0_2 = gz.a;
        if (var2) {
            throw null;
lbl31:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl31
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = gz.me - gz.fisz("fiud", fitr(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == gz.fisz("fiue", fitc(int ), (int)20)) break;
                    v4 /* !! */  = (long)gz.fisz("fiuf", fitc(int ), (int)21);
                }
                return nj.get(gz.class);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var1_1 /* !! */  = (int)gz.fisz("fiug", fitc(int ), (int)22);
                    if (!var2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl50:
            // 2 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)gz.fisz("fiuh", fitc(int ), (int)23);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)gz.fisz("fiui", fitc(int ), (int)24);
                if (!var2) ** GOTO lbl50
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)gz.fisz("fiuj", fitc(int ), (int)25);
        ** while (!var2)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fkcj() {
        gz.fitt[100] = 3682598638939166738L;
        gz.fitt[101] = 3346724935918252075L;
        gz.fitt[102] = -6743903353456766414L;
        gz.fitt[103] = -2350967406727792098L;
        gz.fitt[104] = -458518282283783381L;
        gz.fitt[105] = 3186661315378545348L;
        gz.fitt[106] = 8478060178558808683L;
        gz.fitt[107] = -5399907262281002703L;
        gz.fitt[108] = -7379317937516914695L;
        gz.fitt[109] = 4079060830103011622L;
        gz.fitt[110] = 755138757159553894L;
        gz.fitt[111] = -9185261452334524249L;
        gz.fitt[112] = 3880470444107285736L;
        gz.fitt[113] = -4277847932490535095L;
        gz.fitt[114] = 8947850469037108288L;
        gz.fitt[115] = -7480731329025610513L;
        gz.fitt[116] = 4966169247795896937L;
        gz.fitt[117] = -5061110690105195567L;
        gz.fitt[118] = 5622384794383079034L;
        gz.fitt[119] = 4143795012624985043L;
        gz.fitt[120] = 3032219113205772122L;
        gz.fitt[121] = -1793592739803787532L;
        gz.fitt[122] = -3585200138812976545L;
        gz.fitt[123] = -2492251504997322697L;
        gz.fitt[124] = 7286296829142761691L;
        gz.fitt[125] = -7338512564536804341L;
        gz.fitt[126] = 7918801648026104032L;
        gz.fitt[127] = 3326860344333486401L;
        gz.fitt[128] = 8661980022326585913L;
        gz.fitt[129] = -2274046213316817637L;
        gz.fitt[130] = 7050732268965447214L;
        gz.fitt[131] = 896469313796676071L;
        gz.fitt[132] = -6831354555508465749L;
        gz.fitt[133] = -8917147839730349811L;
        gz.fitt[134] = 5632860251778542591L;
        gz.fitt[135] = 7718276160722114695L;
        gz.fitt[136] = -6666395881826691336L;
        gz.fitt[137] = -6358322788687251003L;
        gz.fitt[138] = 9223252717063809744L;
        gz.fitt[139] = -1225592849592959717L;
        gz.fitt[140] = -169731945750594050L;
        gz.fitt[141] = -8086087165678091140L;
        gz.fitt[142] = -2966691193562757380L;
        gz.fitt[143] = 5070613469743577813L;
        gz.fitt[144] = 6612275080056910228L;
        gz.fitt[145] = -2868427580186674618L;
        gz.fitt[146] = -3173247976693792404L;
        gz.fitt[147] = 3907625113771438984L;
        gz.fitt[148] = 7007972968676090026L;
        gz.fitt[149] = -8158552157476509233L;
        gz.fitt[150] = 76260312087834110L;
        gz.fitt[151] = -8641416041425556189L;
        gz.fitt[152] = -2561502984386857292L;
        gz.fitt[153] = 4988372045130362451L;
        gz.fitt[154] = 7601714835978339043L;
        gz.fitt[155] = -2349551491623552798L;
        gz.fitt[156] = 4339409806289993277L;
        gz.fitt[157] = 806158960022231749L;
        gz.fitt[158] = -5329558403351222095L;
        gz.fitt[159] = 1029986665175511605L;
        gz.fitt[160] = 7625032625781506169L;
        gz.fitt[161] = 5948699491614569815L;
        gz.fitt[162] = 2633905873160126432L;
        gz.fitt[163] = 6208360529384230171L;
        gz.fitt[164] = -1735782501915620562L;
        gz.fitt[165] = -1579340868397297420L;
        gz.fitt[166] = -68778879352583388L;
        gz.fitt[167] = 6346439312174585767L;
        gz.fitt[168] = -4728192295080404153L;
        gz.fitt[169] = -2016479881375974133L;
        gz.fitt[170] = -8057847292373109234L;
        gz.fitt[171] = 2385451595098030109L;
        gz.fitt[172] = 3592530354229454984L;
        gz.fitt[173] = 889788542516202413L;
        gz.fitt[174] = -3636196376914281822L;
        gz.fitt[175] = 873171329594583525L;
        gz.fitt[176] = -3002514767157882654L;
        gz.fitt[177] = -3683404347461397625L;
        gz.fitt[178] = -9049689481088406516L;
        gz.fitt[179] = 7933542823383460391L;
        gz.fitt[180] = -7339983608749570002L;
        gz.fitt[181] = -6195005500953576717L;
        gz.fitt[182] = -6069324643656986237L;
        gz.fitt[183] = -1669882252734380947L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float calculateLowBallisticPitch(double var1_1, double var3_2, double var5_3, float var7_4) {
        block164: {
            block163: {
                var39_5 = gz.c;
                var38_6 /* !! */  = gz.b;
                var37_7 = gz.a;
                if (var39_5) {
                    throw null;
lbl6:
                    // 43 sources

                    return (float)gz.fisz("fjlr", fisw(int ), (int)324);
                }
                if (var37_7 || var37_7) ** GOTO lbl6
                if (var1_1 < gz.fisz("fjls", fjcs(int ), (int)88)) break block163;
                if (var37_7) ** GOTO lbl6
                if (!(var5_3 <= gz.fisz("fjlt", fjcs(int ), (int)89))) break block164;
                if (var37_7) ** GOTO lbl6
            }
            if (var37_7 || var37_7) ** GOTO lbl6
            return var7_4;
        }
        if (var38_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var38_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var37_7 || var37_7) ** GOTO lbl6
                var8_8 = Math.max((float)gz.fisz("fjlu", fisw(int ), (int)325), var7_4 - gz.fisz("fjlv", fisw(int ), (int)326));
                if (var37_7 || var37_7) ** GOTO lbl6
                var9_9 = Math.min((float)gz.fisz("fjlw", fisw(int ), (int)327), var7_4 + gz.fisz("fjlx", fisw(int ), (int)328));
                if (var37_7 || var37_7) ** GOTO lbl6
                var10_10 = var7_4;
                if (var37_7 || var37_7) ** GOTO lbl6
                var11_11 /* !! */  = gz.fisz("fjly", fjcs(int ), (int)90);
                if (var37_7 || var37_7) ** GOTO lbl6
                var13_12 = var8_8;
                if (var37_7) ** GOTO lbl6
                do {
                    if (var37_7 || var37_7) ** GOTO lbl6
                    if (!(var13_12 <= var9_9)) ** GOTO lbl105
                    if (var37_7 || var37_7) ** GOTO lbl6
                    var14_13 = Math.toRadians(var13_12);
                    if (var37_7 || var37_7) ** GOTO lbl6
                    var16_14 = var5_3 * Math.cos(var14_13);
                    if (var37_7 || var37_7) ** GOTO lbl6
                    var18_15 = -var5_3 * Math.sin(var14_13);
                    if (var37_7 || var37_7) ** GOTO lbl6
                    var20_16 = 0.0;
                    if (var37_7 || var37_7) ** GOTO lbl6
                    var22_17 = 0.0;
                    if (var37_7 || var37_7) ** GOTO lbl6
                    var24_18 = gz.fisz("fjlz", fitc(int ), (int)329);
                    if (var37_7) ** GOTO lbl6
                    do {
                        if (var37_7 || var37_7) ** GOTO lbl6
                        if (var24_18 >= gz.fisz("fjma", fitc(int ), (int)330)) ** GOTO lbl100
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var25_19 = var20_16;
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var27_20 = var22_17;
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var20_16 += var16_14;
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var22_17 += var18_15;
                        if (var37_7 || var37_7) ** GOTO lbl6
                        if (!(var20_16 >= var1_1)) ** GOTO lbl85
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var29_21 = var20_16 - var25_19;
                        if (var37_7 || var37_7) ** GOTO lbl6
                        if (!(var29_21 <= gz.fisz("fjmb", fjcs(int ), (int)91))) ** GOTO lbl69
                        if (var37_7 || var37_7) ** GOTO lbl6
                        v0 = 1.0;
                        if (var39_5) {
                            throw null;
                        }
                        ** GOTO lbl71
lbl69:
                        // 1 sources

                        if (var37_7 || var37_7) ** GOTO lbl6
                        v0 = var31_22 = (var1_1 - var25_19) / var29_21;
lbl71:
                        // 2 sources

                        if (var37_7 || var37_7) ** GOTO lbl6
                        var33_23 = var27_20 + (var22_17 - var27_20) * var31_22;
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var35_24 = Math.abs(var33_23 - var3_2);
                        if (var37_7 || var37_7) ** GOTO lbl6
                        if (!(var35_24 < var11_11 /* !! */ )) ** GOTO lbl100
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var11_11 /* !! */  = (CallSite)var35_24;
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var10_10 = var13_12;
                        if (var37_7) ** GOTO lbl6
                        if (var39_5) {
                            throw null;
                        }
                        ** GOTO lbl100
lbl85:
                        // 1 sources

                        if (var37_7 || var37_7) ** GOTO lbl6
                        var16_14 *= gz.fisz("fjmc", fjcs(int ), (int)92);
                        if (var37_7 || var37_7) ** GOTO lbl6
                        var18_15 = var18_15 * gz.fisz("fjmd", fjcs(int ), (int)93) - gz.fisz("fjme", fjcs(int ), (int)94);
                        if (var37_7 || var37_7) ** GOTO lbl6
                        if (!(var16_14 < gz.fisz("fjmf", fjcs(int ), (int)95))) ** GOTO lbl95
                        if (var37_7) ** GOTO lbl6
                        if (var39_5) {
                            throw null;
                        }
                        ** GOTO lbl100
lbl95:
                        // 1 sources

                        if (var37_7 || var37_7) ** GOTO lbl6
                        ++var24_18;
                        if (var37_7) ** GOTO lbl6
                    } while (!var39_5);
                    throw null;
lbl100:
                    // 4 sources

                    if (var37_7 || var37_7) ** GOTO lbl6
                    var13_12 += gz.fisz("fjmg", fisw(int ), (int)331);
                    if (var37_7) ** GOTO lbl6
                } while (!var39_5);
                throw null;
lbl105:
                // 1 sources

                if (!var37_7 && !var37_7) ** break;
                ** continue;
                return var10_10;
            }
lbl108:
            // 3 sources

            case 0: {
                var38_6 /* !! */  = (int)gz.fisz("fjmh", fitc(int ), (int)332);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl402
            }
lbl113:
            // 2 sources

            case 1: {
                var38_6 /* !! */  = (int)gz.fisz("fjmi", fitc(int ), (int)333);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl455
            }
lbl118:
            // 2 sources

            case 2: {
                var38_6 /* !! */  = (int)gz.fisz("fjmj", fitc(int ), (int)334);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl156
            }
            case 3: {
                var38_6 /* !! */  = (int)gz.fisz("fjmk", fitc(int ), (int)335);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl247
            }
            case 4: {
                var38_6 /* !! */  = (int)gz.fisz("fjml", fitc(int ), (int)336);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl133:
            // 3 sources

            case 5: {
                var38_6 /* !! */  = (int)gz.fisz("fjmm", fitc(int ), (int)337);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl341
            }
lbl138:
            // 2 sources

            case 6: {
                var38_6 /* !! */  = (int)gz.fisz("fjmn", fitc(int ), (int)338);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl143:
            // 4 sources

            case 7: {
                var38_6 /* !! */  = (int)gz.fisz("fjmo", fitc(int ), (int)339);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl341
            }
lbl148:
            // 2 sources

            case 8: {
                var38_6 /* !! */  = (int)gz.fisz("fjmp", fitc(int ), (int)340);
                if (!var39_5) ** GOTO lbl133
                throw null;
            }
            case 9: {
                var38_6 /* !! */  = (int)gz.fisz("fjmq", fitc(int ), (int)341);
                if (!var39_5) ** GOTO lbl133
                throw null;
            }
lbl156:
            // 3 sources

            case 10: {
                var38_6 /* !! */  = (int)gz.fisz("fjmr", fitc(int ), (int)342);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl367
            }
            case 11: {
                var38_6 /* !! */  = (int)gz.fisz("fjms", fitc(int ), (int)343);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl166:
            // 5 sources

            case 12: {
                var38_6 /* !! */  = (int)gz.fisz("fjmt", fitc(int ), (int)344);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 13: {
                var38_6 /* !! */  = (int)gz.fisz("fjmu", fitc(int ), (int)345);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl328
            }
            case 14: {
                var38_6 /* !! */  = (int)gz.fisz("fjmv", fitc(int ), (int)346);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl181:
            // 2 sources

            case 15: {
                var38_6 /* !! */  = (int)gz.fisz("fjmw", fitc(int ), (int)347);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl463
            }
lbl186:
            // 2 sources

            case 16: {
                var38_6 /* !! */  = (int)gz.fisz("fjmx", fitc(int ), (int)348);
                if (!var39_5) ** GOTO lbl166
                throw null;
            }
lbl190:
            // 3 sources

            case 17: {
                var38_6 /* !! */  = (int)gz.fisz("fjmy", fitc(int ), (int)349);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl467
            }
            case 18: {
                var38_6 /* !! */  = (int)gz.fisz("fjmz", fitc(int ), (int)350);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl443
            }
lbl200:
            // 2 sources

            case 19: {
                var38_6 /* !! */  = (int)gz.fisz("fjna", fitc(int ), (int)351);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl275
            }
lbl205:
            // 3 sources

            case 20: {
                var38_6 /* !! */  = (int)gz.fisz("fjnb", fitc(int ), (int)352);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl210:
            // 3 sources

            case 21: {
                var38_6 /* !! */  = (int)gz.fisz("fjnc", fitc(int ), (int)353);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl237
            }
            case 22: {
                var38_6 /* !! */  = (int)gz.fisz("fjnd", fitc(int ), (int)354);
                if (!var39_5) ** GOTO lbl166
                throw null;
            }
            case 23: {
                var38_6 /* !! */  = (int)gz.fisz("fjne", fitc(int ), (int)355);
                if (!var39_5) ** GOTO lbl143
                throw null;
            }
lbl223:
            // 4 sources

            case 24: {
                var38_6 /* !! */  = (int)gz.fisz("fjnf", fitc(int ), (int)356);
                if (!var39_5) ** GOTO lbl210
                throw null;
            }
            case 25: {
                var38_6 /* !! */  = (int)gz.fisz("fjng", fitc(int ), (int)357);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl463
            }
lbl232:
            // 2 sources

            case 26: {
                var38_6 /* !! */  = (int)gz.fisz("fjnh", fitc(int ), (int)358);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl363
            }
lbl237:
            // 3 sources

            case 27: {
                var38_6 /* !! */  = (int)gz.fisz("fjni", fitc(int ), (int)359);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl384
            }
            case 28: {
                var38_6 /* !! */  = (int)gz.fisz("fjnj", fitc(int ), (int)360);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl247:
            // 4 sources

            case 29: {
                var38_6 /* !! */  = (int)gz.fisz("fjnk", fitc(int ), (int)361);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl380
            }
            case 30: {
                var38_6 /* !! */  = (int)gz.fisz("fjnl", fitc(int ), (int)362);
                if (!var39_5) ** GOTO lbl210
                throw null;
            }
lbl256:
            // 2 sources

            case 31: {
                var38_6 /* !! */  = (int)gz.fisz("fjnm", fitc(int ), (int)363);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl261:
            // 2 sources

            case 32: {
                var38_6 /* !! */  = (int)gz.fisz("fjnn", fitc(int ), (int)364);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl266:
            // 3 sources

            case 33: {
                var38_6 /* !! */  = (int)gz.fisz("fjno", fitc(int ), (int)365);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl447
            }
            case 34: {
                var38_6 /* !! */  = (int)gz.fisz("fjnp", fitc(int ), (int)366);
                if (!var39_5) break;
                throw null;
            }
lbl275:
            // 3 sources

            case 35: {
                var38_6 /* !! */  = (int)gz.fisz("fjnq", fitc(int ), (int)367);
                if (!var39_5) ** GOTO lbl108
                throw null;
            }
lbl279:
            // 2 sources

            case 36: {
                var38_6 /* !! */  = (int)gz.fisz("fjnr", fitc(int ), (int)368);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl393
            }
lbl284:
            // 2 sources

            case 37: {
                var38_6 /* !! */  = (int)gz.fisz("fjns", fitc(int ), (int)369);
                if (!var39_5) ** GOTO lbl166
                throw null;
            }
            case 38: {
                var38_6 /* !! */  = (int)gz.fisz("fjnt", fitc(int ), (int)370);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl346
            }
            case 39: {
                var38_6 /* !! */  = (int)gz.fisz("fjnu", fitc(int ), (int)371);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl419
            }
            case 40: {
                var38_6 /* !! */  = (int)gz.fisz("fjnv", fitc(int ), (int)372);
                if (!var39_5) ** GOTO lbl138
                throw null;
            }
lbl302:
            // 2 sources

            case 41: {
                var38_6 /* !! */  = (int)gz.fisz("fjnw", fitc(int ), (int)373);
                if (!var39_5) ** GOTO lbl247
                throw null;
            }
            case 42: {
                var38_6 /* !! */  = (int)gz.fisz("fjnx", fitc(int ), (int)374);
                if (!var39_5) ** GOTO lbl113
                throw null;
            }
            case 43: {
                var38_6 /* !! */  = (int)gz.fisz("fjny", fitc(int ), (int)375);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl315:
            // 2 sources

            case 44: {
                var38_6 /* !! */  = (int)gz.fisz("fjnz", fitc(int ), (int)376);
                if (!var39_5) ** GOTO lbl143
                throw null;
            }
lbl319:
            // 2 sources

            case 45: {
                var38_6 /* !! */  = (int)gz.fisz("fjoa", fitc(int ), (int)377);
                if (!var39_5) ** GOTO lbl266
                throw null;
            }
            case 46: {
                do {
                    var38_6 /* !! */  = (int)gz.fisz("fjob", fitc(int ), (int)378);
                } while (!var39_5);
                throw null;
            }
lbl328:
            // 2 sources

            case 47: {
                var38_6 /* !! */  = (int)gz.fisz("fjoc", fitc(int ), (int)379);
                if (!var39_5) ** GOTO lbl181
                throw null;
            }
lbl332:
            // 2 sources

            case 48: {
                var38_6 /* !! */  = (int)gz.fisz("fjod", fitc(int ), (int)380);
                if (!var39_5) ** GOTO lbl256
                throw null;
            }
lbl336:
            // 2 sources

            case 49: {
                var38_6 /* !! */  = (int)gz.fisz("fjoe", fitc(int ), (int)381);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl447
            }
lbl341:
            // 3 sources

            case 50: {
                var38_6 /* !! */  = (int)gz.fisz("fjof", fitc(int ), (int)382);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl459
            }
lbl346:
            // 3 sources

            case 51: {
                var38_6 /* !! */  = (int)gz.fisz("fjog", fitc(int ), (int)383);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl398
            }
lbl351:
            // 3 sources

            case 52: {
                var38_6 /* !! */  = (int)gz.fisz("fjoh", fitc(int ), (int)384);
                if (!var39_5) ** GOTO lbl205
                throw null;
            }
            case 53: {
                var38_6 /* !! */  = (int)gz.fisz("fjoi", fitc(int ), (int)385);
                if (!var39_5) ** GOTO lbl186
                throw null;
            }
            case 54: {
                var38_6 /* !! */  = (int)gz.fisz("fjoj", fitc(int ), (int)386);
                if (!var39_5) ** GOTO lbl261
                throw null;
            }
lbl363:
            // 2 sources

            case 55: {
                var38_6 /* !! */  = (int)gz.fisz("fjok", fitc(int ), (int)387);
                if (!var39_5) ** GOTO lbl156
                throw null;
            }
lbl367:
            // 2 sources

            case 56: {
                var38_6 /* !! */  = (int)gz.fisz("fjol", fitc(int ), (int)388);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl402
            }
            case 57: {
                var38_6 /* !! */  = (int)gz.fisz("fjom", fitc(int ), (int)389);
                if (!var39_5) ** GOTO lbl275
                throw null;
            }
lbl376:
            // 2 sources

            case 58: {
                var38_6 /* !! */  = (int)gz.fisz("fjon", fitc(int ), (int)390);
                if (!var39_5) ** GOTO lbl190
                throw null;
            }
lbl380:
            // 2 sources

            case 59: {
                var38_6 /* !! */  = (int)gz.fisz("fjoo", fitc(int ), (int)391);
                if (!var39_5) ** GOTO lbl279
                throw null;
            }
lbl384:
            // 2 sources

            case 60: {
                var38_6 /* !! */  = (int)gz.fisz("fjop", fitc(int ), (int)392);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl443
            }
            case 61: {
                var38_6 /* !! */  = (int)gz.fisz("fjoq", fitc(int ), (int)393);
                if (!var39_5) ** GOTO lbl190
                throw null;
            }
lbl393:
            // 3 sources

            case 62: {
                var38_6 /* !! */  = (int)gz.fisz("fjor", fitc(int ), (int)394);
                if (var39_5) {
                    throw null;
                }
                ** GOTO lbl467
            }
lbl398:
            // 2 sources

            case 63: {
                var38_6 /* !! */  = (int)gz.fisz("fjos", fitc(int ), (int)395);
                if (!var39_5) ** GOTO lbl302
                throw null;
            }
lbl402:
            // 3 sources

            case 64: {
                var38_6 /* !! */  = (int)gz.fisz("fjot", fitc(int ), (int)396);
                if (!var39_5) ** GOTO lbl351
                throw null;
            }
            case 65: {
                var38_6 /* !! */  = (int)gz.fisz("fjou", fitc(int ), (int)397);
                if (!var39_5) ** GOTO lbl223
                throw null;
            }
lbl410:
            // 2 sources

            case 66: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var38_6 /* !! */  = (int)gz.fisz("fjov", fitc(int ), (int)398);
                    if (!var39_5) ** GOTO lbl148
                    throw null;
                }
            }
lbl415:
            // 2 sources

            case 67: {
                var38_6 /* !! */  = (int)gz.fisz("fjow", fitc(int ), (int)399);
                if (var39_5) {
                    throw null;
                }
            }
lbl419:
            // 5 sources

            case 68: {
                var38_6 /* !! */  = (int)gz.fisz("fjox", fitc(int ), (int)400);
                if (!var39_5) ** GOTO lbl118
                throw null;
            }
            case 69: {
                var38_6 /* !! */  = (int)gz.fisz("fjoy", fitc(int ), (int)401);
                if (!var39_5) ** GOTO lbl351
                throw null;
            }
            case 70: {
                var38_6 /* !! */  = (int)gz.fisz("fjoz", fitc(int ), (int)402);
                if (!var39_5) ** GOTO lbl247
                throw null;
            }
            case 71: {
                var38_6 /* !! */  = (int)gz.fisz("fjpa", fitc(int ), (int)403);
                if (!var39_5) ** GOTO lbl284
                throw null;
            }
            case 72: {
                var38_6 /* !! */  = (int)gz.fisz("fjpb", fitc(int ), (int)404);
                if (!var39_5) ** GOTO lbl332
                throw null;
            }
            case 73: {
                var38_6 /* !! */  = (int)gz.fisz("fjpc", fitc(int ), (int)405);
                if (!var39_5) ** GOTO lbl200
                throw null;
            }
lbl443:
            // 3 sources

            case 74: {
                var38_6 /* !! */  = (int)gz.fisz("fjpd", fitc(int ), (int)406);
                if (!var39_5) ** GOTO lbl205
                throw null;
            }
lbl447:
            // 3 sources

            case 75: {
                var38_6 /* !! */  = (int)gz.fisz("fjpe", fitc(int ), (int)407);
                if (!var39_5) ** GOTO lbl166
                throw null;
            }
            case 76: {
                var38_6 /* !! */  = (int)gz.fisz("fjpf", fitc(int ), (int)408);
                if (!var39_5) ** GOTO lbl415
                throw null;
            }
lbl455:
            // 2 sources

            case 77: {
                var38_6 /* !! */  = (int)gz.fisz("fjpg", fitc(int ), (int)409);
                if (!var39_5) ** GOTO lbl410
                throw null;
            }
lbl459:
            // 2 sources

            case 78: {
                var38_6 /* !! */  = (int)gz.fisz("fjph", fitc(int ), (int)410);
                if (!var39_5) ** GOTO lbl346
                throw null;
            }
lbl463:
            // 3 sources

            case 79: {
                var38_6 /* !! */  = (int)gz.fisz("fjpi", fitc(int ), (int)411);
                if (!var39_5) ** GOTO lbl376
                throw null;
            }
lbl467:
            // 3 sources

            case 80: {
                var38_6 /* !! */  = (int)gz.fisz("fjpj", fitc(int ), (int)412);
                if (!var39_5) ** GOTO lbl393
                throw null;
            }
            case 81: {
                var38_6 /* !! */  = (int)gz.fisz("fjpk", fitc(int ), (int)413);
                if (!var39_5) ** GOTO lbl108
                throw null;
            }
            case 82: 
        }
        var38_6 /* !! */  = (int)gz.fisz("fjpl", fitc(int ), (int)414);
        ** while (!var39_5)
lbl478:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fkcf() {
        gz.fisy[500] = -1606525320;
        gz.fisy[501] = 75205876;
        gz.fisy[502] = -486446717;
        gz.fisy[503] = 1777875335;
        gz.fisy[504] = 739199636;
        gz.fisy[505] = 2112996326;
        gz.fisy[506] = 1581490495;
        gz.fisy[507] = 406487646;
        gz.fisy[508] = -1736792906;
        gz.fisy[509] = -794035550;
        gz.fisy[510] = 2079609013;
        gz.fisy[511] = 1801964956;
        gz.fisy[512] = 1092562955;
        gz.fisy[513] = -2063588814;
        gz.fisy[514] = -282662258;
        gz.fisy[515] = -1330175017;
        gz.fisy[516] = 259989179;
        gz.fisy[517] = -1372537808;
        gz.fisy[518] = 875215283;
        gz.fisy[519] = 618345943;
        gz.fisy[520] = 2126235233;
        gz.fisy[521] = -1792021518;
        gz.fisy[522] = 596866184;
        gz.fisy[523] = -483901105;
        gz.fisy[524] = 16378590;
        gz.fisy[525] = -421306947;
        gz.fisy[526] = -2125055390;
        gz.fisy[527] = -1895460475;
        gz.fisy[528] = -2056617466;
        gz.fisy[529] = -2120928988;
        gz.fisy[530] = -2006984422;
        gz.fisy[531] = 1212286338;
        gz.fisy[532] = -1020240782;
        gz.fisy[533] = -1949551947;
        gz.fisy[534] = 977668881;
        gz.fisy[535] = -1700228579;
        gz.fisy[536] = 306060301;
        gz.fisy[537] = -2104760614;
        gz.fisy[538] = -115780893;
        gz.fisy[539] = 543695268;
        gz.fisy[540] = -1307066688;
        gz.fisy[541] = 926910905;
        gz.fisy[542] = 969022230;
        gz.fisy[543] = -61307966;
        gz.fisy[544] = 1416377034;
        gz.fisy[545] = -766288374;
        gz.fisy[546] = 921549821;
        gz.fisy[547] = 1544737273;
        gz.fisy[548] = 1409854286;
        gz.fisy[549] = 1726722946;
        gz.fisy[550] = -1689962891;
        gz.fisy[551] = -999022504;
        gz.fisy[552] = -182529460;
        gz.fisy[553] = -1624859612;
        gz.fisy[554] = -1102653499;
        gz.fisy[555] = 898708685;
        gz.fisy[556] = 503495158;
        gz.fisy[557] = 221545305;
        gz.fisy[558] = -985229636;
        gz.fisy[559] = 1212286989;
        gz.fisy[560] = -1355090141;
        gz.fisy[561] = -2136782830;
        gz.fisy[562] = 1798567534;
        gz.fisy[563] = 1963464590;
        gz.fisy[564] = -1798289387;
        gz.fisy[565] = 1087649710;
        gz.fisy[566] = -5589942;
        gz.fisy[567] = -1127395437;
        gz.fisy[568] = 1730099555;
        gz.fisy[569] = -686067074;
        gz.fisy[570] = -1175459117;
        gz.fisy[571] = 1589927867;
        gz.fisy[572] = 1207216256;
        gz.fisy[573] = -1027097398;
        gz.fisy[574] = -548560343;
        gz.fisy[575] = 773376034;
        gz.fisy[576] = 889783259;
        gz.fisy[577] = -1017526761;
        gz.fisy[578] = -1496343075;
        gz.fisy[579] = -1014919176;
        gz.fisy[580] = -54080270;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double calculateInterceptTicks(class_243 var1_1, class_243 var2_2, class_243 var3_3, double var4_4) {
        block114: {
            block117: {
                block116: {
                    block115: {
                        var36_5 = gz.c;
                        var35_6 /* !! */  = gz.b;
                        var34_7 = gz.a;
                        if (var36_5) {
                            throw null;
lbl6:
                            // 33 sources

                            return (double)gz.fisz("fjrc", fjcs(int ), (int)101);
                        }
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var6_8 = var2_2.field_1352 - var1_1.field_1352;
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var8_9 = var2_2.field_1350 - var1_1.field_1350;
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var10_10 = var3_3.field_1352;
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var12_11 = var3_3.field_1350;
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var14_12 = var4_4 * gz.fisz("fjrd", fjcs(int ), (int)102);
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var16_13 = var10_10 * var10_10 + var12_11 * var12_11 - var14_12 * var14_12;
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var18_14 = gz.fisz("fjre", fjcs(int ), (int)103) * (var6_8 * var10_10 + var8_9 * var12_11);
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var20_15 = var6_8 * var6_8 + var8_9 * var8_9;
                        if (var34_7 || var34_7) ** GOTO lbl6
                        var22_16 = Math.sqrt(var20_15) / Math.max((double)gz.fisz("fjrf", fjcs(int ), (int)104), var14_12);
                        if (var34_7 || var34_7) ** GOTO lbl6
                        if (!(Math.abs(var16_13) < gz.fisz("fjrg", fjcs(int ), (int)105))) break block114;
                        if (var34_7 || var34_7) ** GOTO lbl6
                        if (!(Math.abs((double)var18_14) < gz.fisz("fjrh", fjcs(int ), (int)106))) break block115;
                        if (var34_7) ** GOTO lbl6
                        return var22_16;
                    }
                    if (var34_7 || var34_7) ** GOTO lbl6
                    var24_17 = -var20_15 / var18_14;
                    if (var34_7 || var34_7) ** GOTO lbl6
                    if (!(var24_17 > 0.0)) break block116;
                    if (var34_7) ** GOTO lbl6
                    v0 = var24_17;
                    if (var36_5) {
                        throw null;
                    }
                    break block117;
                }
                if (var34_7 || var34_7) ** GOTO lbl6
                v0 = var22_16;
            }
            return v0;
        }
        if (var34_7 || var34_7) ** GOTO lbl6
        var24_18 = var18_14 * var18_14 - gz.fisz("fjri", fjcs(int ), (int)107) * var16_13 * var20_15;
        if (var34_7) ** GOTO lbl6
        if (var35_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var35_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var34_7) ** GOTO lbl6
                if (!(var24_18 < 0.0)) ** GOTO lbl58
                if (var34_7) ** GOTO lbl6
                return var22_16;
lbl58:
                // 1 sources

                if (var34_7 || var34_7) ** GOTO lbl6
                var26_19 = Math.sqrt((double)var24_18);
                if (var34_7 || var34_7) ** GOTO lbl6
                var28_20 = (-var18_14 - var26_19) / (gz.fisz("fjrj", fjcs(int ), (int)108) * var16_13);
                if (var34_7 || var34_7) ** GOTO lbl6
                var30_21 = (-var18_14 + var26_19) / (gz.fisz("fjrk", fjcs(int ), (int)109) * var16_13);
                if (var34_7 || var34_7) ** GOTO lbl6
                var32_22 /* !! */  = gz.fisz("fjrl", fjcs(int ), (int)110);
                if (var34_7 || var34_7) ** GOTO lbl6
                if (!(var28_20 > 0.0)) ** GOTO lbl71
                if (var34_7) ** GOTO lbl6
                var32_22 /* !! */  = var28_20;
                if (var34_7) ** GOTO lbl6
lbl71:
                // 2 sources

                if (var34_7 || var34_7) ** GOTO lbl6
                if (!(var30_21 > 0.0)) ** GOTO lbl76
                if (var34_7) ** GOTO lbl6
                var32_22 /* !! */  = (reference)Math.min((double)var32_22 /* !! */ , (double)var30_21);
                if (var34_7) ** GOTO lbl6
lbl76:
                // 2 sources

                if (var34_7 || var34_7) ** GOTO lbl6
                if (var32_22 /* !! */  != gz.fisz("fjrm", fjcs(int ), (int)111)) ** GOTO lbl83
                if (var34_7) ** GOTO lbl6
                v1 /* !! */  = var22_16;
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl86
lbl83:
                // 1 sources

                if (!var34_7 && !var34_7) ** break;
                ** continue;
                v1 /* !! */  = (double)var32_22 /* !! */ ;
lbl86:
                // 2 sources

                return v1 /* !! */ ;
            }
            case 0: {
                var35_6 /* !! */  = (int)gz.fisz("fjrn", fitc(int ), (int)452);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 1: {
                var35_6 /* !! */  = (int)gz.fisz("fjro", fitc(int ), (int)453);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl252
            }
lbl97:
            // 2 sources

            case 2: {
                var35_6 /* !! */  = (int)gz.fisz("fjrp", fitc(int ), (int)454);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var35_6 /* !! */  = (int)gz.fisz("fjrq", fitc(int ), (int)455);
                    if (!var36_5) ** GOTO lbl97
                    throw null;
                }
            }
lbl107:
            // 2 sources

            case 4: {
                var35_6 /* !! */  = (int)gz.fisz("fjrr", fitc(int ), (int)456);
                if (var36_5) {
                    throw null;
                }
            }
lbl111:
            // 6 sources

            case 5: {
                var35_6 /* !! */  = (int)gz.fisz("fjrs", fitc(int ), (int)457);
                if (!var36_5) break;
                throw null;
            }
            case 6: {
                var35_6 /* !! */  = (int)gz.fisz("fjrt", fitc(int ), (int)458);
                if (!var36_5) ** GOTO lbl111
                throw null;
            }
            case 7: {
                var35_6 /* !! */  = (int)gz.fisz("fjru", fitc(int ), (int)459);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl124:
            // 2 sources

            case 8: {
                var35_6 /* !! */  = (int)gz.fisz("fjrv", fitc(int ), (int)460);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl129:
            // 2 sources

            case 9: {
                var35_6 /* !! */  = (int)gz.fisz("fjrw", fitc(int ), (int)461);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl283
            }
lbl134:
            // 2 sources

            case 10: {
                var35_6 /* !! */  = (int)gz.fisz("fjrx", fitc(int ), (int)462);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl307
            }
lbl139:
            // 4 sources

            case 11: {
                var35_6 /* !! */  = (int)gz.fisz("fjry", fitc(int ), (int)463);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 12: {
                var35_6 /* !! */  = (int)gz.fisz("fjrz", fitc(int ), (int)464);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl149:
            // 5 sources

            case 13: {
                var35_6 /* !! */  = (int)gz.fisz("fjsa", fitc(int ), (int)465);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl154:
            // 2 sources

            case 14: {
                var35_6 /* !! */  = (int)gz.fisz("fjsb", fitc(int ), (int)466);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 15: {
                var35_6 /* !! */  = (int)gz.fisz("fjsc", fitc(int ), (int)467);
                if (!var36_5) ** GOTO lbl111
                throw null;
            }
lbl163:
            // 2 sources

            case 16: {
                var35_6 /* !! */  = (int)gz.fisz("fjsd", fitc(int ), (int)468);
                if (!var36_5) ** GOTO lbl154
                throw null;
            }
lbl167:
            // 4 sources

            case 17: {
                var35_6 /* !! */  = (int)gz.fisz("fjse", fitc(int ), (int)469);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl230
            }
lbl172:
            // 2 sources

            case 18: {
                var35_6 /* !! */  = (int)gz.fisz("fjsf", fitc(int ), (int)470);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl311
            }
            case 19: {
                var35_6 /* !! */  = (int)gz.fisz("fjsg", fitc(int ), (int)471);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 20: {
                var35_6 /* !! */  = (int)gz.fisz("fjsh", fitc(int ), (int)472);
                if (!var36_5) ** GOTO lbl139
                throw null;
            }
lbl186:
            // 2 sources

            case 21: {
                var35_6 /* !! */  = (int)gz.fisz("fjsi", fitc(int ), (int)473);
                if (!var36_5) ** GOTO lbl167
                throw null;
            }
            case 22: {
                var35_6 /* !! */  = (int)gz.fisz("fjsj", fitc(int ), (int)474);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl287
            }
lbl195:
            // 2 sources

            case 23: {
                var35_6 /* !! */  = (int)gz.fisz("fjsk", fitc(int ), (int)475);
                if (!var36_5) ** GOTO lbl124
                throw null;
            }
lbl199:
            // 4 sources

            case 24: {
                var35_6 /* !! */  = (int)gz.fisz("fjsl", fitc(int ), (int)476);
                if (!var36_5) ** GOTO lbl195
                throw null;
            }
            case 25: {
                var35_6 /* !! */  = (int)gz.fisz("fjsm", fitc(int ), (int)477);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl243
            }
            case 26: {
                var35_6 /* !! */  = (int)gz.fisz("fjsn", fitc(int ), (int)478);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 27: {
                var35_6 /* !! */  = (int)gz.fisz("fjso", fitc(int ), (int)479);
                if (!var36_5) ** GOTO lbl107
                throw null;
            }
lbl217:
            // 2 sources

            case 28: {
                var35_6 /* !! */  = (int)gz.fisz("fjsp", fitc(int ), (int)480);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl315
            }
            case 29: {
                var35_6 /* !! */  = (int)gz.fisz("fjsq", fitc(int ), (int)481);
                if (var36_5) {
                    throw null;
                }
            }
lbl226:
            // 5 sources

            case 30: {
                var35_6 /* !! */  = (int)gz.fisz("fjsr", fitc(int ), (int)482);
                if (!var36_5) ** GOTO lbl149
                throw null;
            }
lbl230:
            // 2 sources

            case 31: {
                var35_6 /* !! */  = (int)gz.fisz("fjss", fitc(int ), (int)483);
                if (!var36_5) ** GOTO lbl149
                throw null;
            }
            case 32: {
                var35_6 /* !! */  = (int)gz.fisz("fjst", fitc(int ), (int)484);
                if (!var36_5) ** GOTO lbl199
                throw null;
            }
lbl238:
            // 2 sources

            case 33: {
                var35_6 /* !! */  = (int)gz.fisz("fjsu", fitc(int ), (int)485);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl278
            }
lbl243:
            // 2 sources

            case 34: {
                var35_6 /* !! */  = (int)gz.fisz("fjsv", fitc(int ), (int)486);
                if (!var36_5) ** GOTO lbl167
                throw null;
            }
lbl247:
            // 2 sources

            case 35: {
                var35_6 /* !! */  = (int)gz.fisz("fjsw", fitc(int ), (int)487);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl327
            }
lbl252:
            // 4 sources

            case 36: {
                var35_6 /* !! */  = (int)gz.fisz("fjsx", fitc(int ), (int)488);
                if (!var36_5) ** GOTO lbl163
                throw null;
            }
lbl256:
            // 3 sources

            case 37: {
                var35_6 /* !! */  = (int)gz.fisz("fjsy", fitc(int ), (int)489);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl339
            }
            case 38: {
                var35_6 /* !! */  = (int)gz.fisz("fjsz", fitc(int ), (int)490);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl303
            }
            case 39: {
                var35_6 /* !! */  = (int)gz.fisz("fjta", fitc(int ), (int)491);
                if (!var36_5) ** GOTO lbl226
                throw null;
            }
            case 40: {
                var35_6 /* !! */  = (int)gz.fisz("fjtb", fitc(int ), (int)492);
                if (!var36_5) ** GOTO lbl256
                throw null;
            }
lbl274:
            // 2 sources

            case 41: {
                var35_6 /* !! */  = (int)gz.fisz("fjtc", fitc(int ), (int)493);
                if (!var36_5) ** GOTO lbl217
                throw null;
            }
lbl278:
            // 4 sources

            case 42: {
                var35_6 /* !! */  = (int)gz.fisz("fjtd", fitc(int ), (int)494);
                if (var36_5) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl283:
            // 2 sources

            case 43: {
                var35_6 /* !! */  = (int)gz.fisz("fjte", fitc(int ), (int)495);
                if (var36_5) {
                    throw null;
                }
            }
lbl287:
            // 4 sources

            case 44: {
                var35_6 /* !! */  = (int)gz.fisz("fjtf", fitc(int ), (int)496);
                if (!var36_5) ** GOTO lbl247
                throw null;
            }
            case 45: {
                var35_6 /* !! */  = (int)gz.fisz("fjtg", fitc(int ), (int)497);
                if (!var36_5) ** GOTO lbl256
                throw null;
            }
            case 46: {
                var35_6 /* !! */  = (int)gz.fisz("fjth", fitc(int ), (int)498);
                if (!var36_5) ** GOTO lbl199
                throw null;
            }
            case 47: {
                var35_6 /* !! */  = (int)gz.fisz("fjti", fitc(int ), (int)499);
                if (!var36_5) ** GOTO lbl199
                throw null;
            }
lbl303:
            // 2 sources

            case 48: {
                var35_6 /* !! */  = (int)gz.fisz("fjtj", fitc(int ), (int)500);
                if (!var36_5) ** GOTO lbl139
                throw null;
            }
lbl307:
            // 2 sources

            case 49: {
                var35_6 /* !! */  = (int)gz.fisz("fjtk", fitc(int ), (int)501);
                if (!var36_5) ** GOTO lbl238
                throw null;
            }
lbl311:
            // 3 sources

            case 50: {
                var35_6 /* !! */  = (int)gz.fisz("fjtl", fitc(int ), (int)502);
                if (!var36_5) ** GOTO lbl226
                throw null;
            }
lbl315:
            // 5 sources

            case 51: {
                var35_6 /* !! */  = (int)gz.fisz("fjtm", fitc(int ), (int)503);
                if (!var36_5) ** GOTO lbl278
                throw null;
            }
lbl319:
            // 2 sources

            case 52: {
                var35_6 /* !! */  = (int)gz.fisz("fjtn", fitc(int ), (int)504);
                if (!var36_5) ** GOTO lbl139
                throw null;
            }
lbl323:
            // 2 sources

            case 53: {
                var35_6 /* !! */  = (int)gz.fisz("fjto", fitc(int ), (int)505);
                if (!var36_5) ** GOTO lbl149
                throw null;
            }
lbl327:
            // 2 sources

            case 54: {
                var35_6 /* !! */  = (int)gz.fisz("fjtp", fitc(int ), (int)506);
                if (!var36_5) ** GOTO lbl278
                throw null;
            }
            case 55: {
                var35_6 /* !! */  = (int)gz.fisz("fjtq", fitc(int ), (int)507);
                if (!var36_5) ** GOTO lbl111
                throw null;
            }
            case 56: {
                var35_6 /* !! */  = (int)gz.fisz("fjtr", fitc(int ), (int)508);
                if (!var36_5) ** GOTO lbl172
                throw null;
            }
lbl339:
            // 2 sources

            case 57: {
                var35_6 /* !! */  = (int)gz.fisz("fjts", fitc(int ), (int)509);
                if (!var36_5) ** GOTO lbl134
                throw null;
            }
            case 58: {
                var35_6 /* !! */  = (int)gz.fisz("fjtt", fitc(int ), (int)510);
                if (!var36_5) ** GOTO lbl149
                throw null;
            }
            case 59: {
                var35_6 /* !! */  = (int)gz.fisz("fjtu", fitc(int ), (int)511);
                if (!var36_5) ** GOTO lbl311
                throw null;
            }
            case 60: 
        }
        var35_6 /* !! */  = (int)gz.fisz("fjtv", fitc(int ), (int)512);
        ** while (!var36_5)
lbl354:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clearTarget() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = gz.me - gz.fisz("fjwm", fitr(int ), (int)147)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == gz.fisz("fjwn", fitc(int ), (int)537)) break;
            v0 /* !! */  = (long)gz.fisz("fjwo", fitc(int ), (int)538);
        }
        var3_1 = gz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = gz.me - gz.fisz("fjwp", fitr(int ), (int)148)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == gz.fisz("fjwq", fitc(int ), (int)539)) break;
            v1 /* !! */  = (long)gz.fisz("fjwr", fitc(int ), (int)540);
        }
        var2_2 /* !! */  = gz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = gz.me - gz.fisz("fjwu", fitr(int ), (int)149)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == gz.fisz("fjww", fitc(int ), (int)541)) break;
            v2 /* !! */  = (long)gz.fisz("fjwy", fitc(int ), (int)542);
        }
        var1_3 = gz.a;
        if (var3_1) {
            throw null;
lbl21:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        v3 /* !! */  = gz.me;
        if (true) ** GOTO lbl28
        block54: while (true) {
            v3 /* !! */  = (long)(v4 - gz.fisz("fjxc", fitr(int ), (int)150));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1467527434: {
                    v4 = gz.fisz("fjxd", fitr(int ), (int)151);
                    continue block54;
                }
                case 301323252: {
                    v4 = gz.fisz("fjxe", fitr(int ), (int)152);
                    continue block54;
                }
                case 1124680564: {
                    break block54;
                }
                case 2029002365: {
                    v4 = gz.fisz("fjxf", fitr(int ), (int)153);
                    continue block54;
                }
            }
            break;
        }
        this.target = null;
        if (var1_3 || var1_3) ** GOTO lbl21
        v5 /* !! */  = gz.me;
        if (true) ** GOTO lbl46
        block55: while (true) {
            v5 /* !! */  = (long)(v6 - gz.fisz("fjxg", fitr(int ), (int)154));
lbl46:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -2118984074: {
                    v6 = gz.fisz("fjxh", fitr(int ), (int)155);
                    continue block55;
                }
                case -1496564357: {
                    v6 = gz.fisz("fjxj", fitr(int ), (int)156);
                    continue block55;
                }
                case -1121499724: {
                    v6 = gz.fisz("fjxq", fitr(int ), (int)157);
                    continue block55;
                }
                case 1124680564: {
                    break block55;
                }
            }
            break;
        }
        this.aimAngle = null;
        if (var1_3 || var1_3) ** GOTO lbl21
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_3 = gz.me - gz.fisz("fjxr", fitr(int ), (int)158)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == gz.fisz("fjxs", fitc(int ), (int)543)) break;
            v7 /* !! */  = (long)gz.fisz("fjxt", fitc(int ), (int)544);
        }
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_4 = gz.me - gz.fisz("fjxu", fitr(int ), (int)159)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == gz.fisz("fjxv", fitc(int ), (int)545)) break;
            v8 /* !! */  = (long)gz.fisz("fjyd", fitc(int ), (int)546);
        }
        this.smoothedTargetVelocity = class_243.field_1353;
        if (var1_3 || var1_3) ** GOTO lbl21
        v9 = gz.fisz("fjye", fitc(int ), (int)547);
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = gz.me - gz.fisz("fjyf", fitr(int ), (int)160)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == gz.fisz("fjyg", fitc(int ), (int)548)) break;
            v10 /* !! */  = (long)gz.fisz("fjym", fitc(int ), (int)549);
        }
        this.velocityTargetId = (int)v9;
        if (var1_3 || var1_3) ** GOTO lbl21
        v11 /* !! */  = gz.me;
        if (true) ** GOTO lbl84
        block59: while (true) {
            v11 /* !! */  = (long)(v12 - gz.fisz("fjyo", fitr(int ), (int)161));
lbl84:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1710919238: {
                    v12 = gz.fisz("fjyp", fitr(int ), (int)162);
                    continue block59;
                }
                case -696195779: {
                    v12 = gz.fisz("fjyq", fitr(int ), (int)163);
                    continue block59;
                }
                case 33166854: {
                    v12 = gz.fisz("fjyr", fitr(int ), (int)164);
                    continue block59;
                }
                case 1124680564: {
                    break block59;
                }
            }
            break;
        }
        this.lastTargetPosition = null;
        if (var1_3 || var1_3) ** GOTO lbl21
        v13 = gz.fisz("fjys", fitc(int ), (int)550);
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = gz.me - gz.fisz("fjyu", fitr(int ), (int)165)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == gz.fisz("fjyw", fitc(int ), (int)551)) break;
            v14 /* !! */  = (long)gz.fisz("fjyy", fitc(int ), (int)552);
        }
        this.lastTargetAge = (int)v13;
        if (var1_3 || var1_3) ** GOTO lbl21
        v15 /* !! */  = gz.me;
        if (true) ** GOTO lbl110
        block61: while (true) {
            v15 /* !! */  = (long)(v16 - gz.fisz("fjza", fitr(int ), (int)166));
lbl110:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -950090775: {
                    v16 = gz.fisz("fjzc", fitr(int ), (int)167);
                    continue block61;
                }
                case 644764902: {
                    v16 = gz.fisz("fjzd", fitr(int ), (int)168);
                    continue block61;
                }
                case 1124680564: {
                    break block61;
                }
                case 1637138746: {
                    v16 = gz.fisz("fjzf", fitr(int ), (int)169);
                    continue block61;
                }
            }
            break;
        }
        v17 /* !! */  = gz.me;
        if (true) ** GOTO lbl126
        block62: while (true) {
            v17 /* !! */  = (long)(v18 - gz.fisz("fjzh", fitr(int ), (int)170));
lbl126:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -79941785: {
                    v18 = gz.fisz("fjzj", fitr(int ), (int)171);
                    continue block62;
                }
                case 1062204877: {
                    v18 = gz.fisz("fjzl", fitr(int ), (int)172);
                    continue block62;
                }
                case 1124680564: {
                    break block62;
                }
                case 1254109360: {
                    v18 = gz.fisz("fjzn", fitr(int ), (int)173);
                    continue block62;
                }
            }
            break;
        }
        ot.INSTANCE.releaseProvider(this);
        if (var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl146:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)gz.fisz("fjzp", fitc(int ), (int)553);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl160
            }
            case 1: {
                var2_2 /* !! */  = (int)gz.fisz("fjzr", fitc(int ), (int)554);
                if (!var3_1) ** GOTO lbl146
                throw null;
            }
lbl155:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)gz.fisz("fjzt", fitc(int ), (int)555);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl160:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)gz.fisz("fjzu", fitc(int ), (int)556);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 4: {
                var2_2 /* !! */  = (int)gz.fisz("fjzv", fitc(int ), (int)557);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
lbl170:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)gz.fisz("fjzw", fitc(int ), (int)558);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 6: {
                var2_2 /* !! */  = (int)gz.fisz("fjzx", fitc(int ), (int)559);
                if (!var3_1) ** GOTO lbl155
                throw null;
            }
            case 7: {
                var2_2 /* !! */  = (int)gz.fisz("fjzz", fitc(int ), (int)560);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl184:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)gz.fisz("fkad", fitc(int ), (int)561);
                if (!var3_1) ** GOTO lbl170
                throw null;
            }
lbl188:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)gz.fisz("fkaf", fitc(int ), (int)562);
                if (!var3_1) ** GOTO lbl155
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)gz.fisz("fkah", fitc(int ), (int)563);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
lbl197:
            // 3 sources

            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)gz.fisz("fkaj", fitc(int ), (int)564);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl207
                    break;
                }
            }
lbl203:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)gz.fisz("fkak", fitc(int ), (int)565);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
lbl207:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)gz.fisz("fkan", fitc(int ), (int)566);
                if (!var3_1) ** GOTO lbl184
                throw null;
            }
lbl211:
            // 3 sources

            case 14: {
                var2_2 /* !! */  = (int)gz.fisz("fkap", fitc(int ), (int)567);
                if (!var3_1) ** GOTO lbl146
                throw null;
            }
lbl215:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)gz.fisz("fkar", fitc(int ), (int)568);
                if (!var3_1) ** GOTO lbl146
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)gz.fisz("fkat", fitc(int ), (int)569);
                if (!var3_1) ** GOTO lbl215
                throw null;
            }
            case 17: 
        }
        var2_2 /* !! */  = (int)gz.fisz("fkav", fitc(int ), (int)570);
        ** while (!var3_1)
lbl226:
        // 1 sources

        throw null;
    }
}

