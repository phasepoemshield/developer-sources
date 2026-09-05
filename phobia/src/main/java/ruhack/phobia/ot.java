/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_2708
 *  net.minecraft.class_2828
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import net.minecraft.class_2828;
import net.minecraft.class_3532;
import ruhack.phobia.aw;
import ruhack.phobia.ax;
import ruhack.phobia.c;
import ruhack.phobia.cr;
import ruhack.phobia.cx;
import ruhack.phobia.d;
import ruhack.phobia.da;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.nn;
import ruhack.phobia.no;
import ruhack.phobia.no$Task;
import ruhack.phobia.os;
import ruhack.phobia.ou;
import ruhack.phobia.ov;
import ruhack.phobia.ov$VecRotation;
import ruhack.phobia.ow;

public class ot
implements c {
    private ov serverAngle;
    public static final boolean a;
    private static final long so = 6122508993374161360L;
    private static long[] klqy;
    private final no<ou> rotationPlanTaskProcessor;
    private static long[] klqw;
    private static int[] klpz;
    private ov previousAngle;
    private ou lastRotationPlan;
    public static ot INSTANCE;
    public static final boolean c;
    private ov currentAngle;
    private static int[] klqc;
    public static final int b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPacket(cr var1_1) {
        block66: {
            var8_2 = ot.c;
            var7_3 /* !! */  = ot.b;
            var6_4 = ot.a;
            if (var8_2) {
                throw null;
lbl6:
                // 16 sources

                return;
            }
            if (var6_4 || var6_4) ** GOTO lbl6
            if (var1_1.isCancelled()) break block66;
            if (var6_4 || var6_4) ** GOTO lbl6
            v0 = var1_1.getPacket();
            Objects.requireNonNull(v0);
            var4_5 = v0;
            if (var6_4) ** GOTO lbl6
            var5_6 = ot.klqe("kmvv", klpy(int ), (int)366);
            if (var6_4) ** GOTO lbl6
            block38: while (true) {
                if (var6_4 || var6_4) ** GOTO lbl6
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class_2828.class, class_2708.class}, var4_5, (int)var5_6)) {
                    case 0: {
                        if (var6_4 || var6_4) ** GOTO lbl6
                        var2_7 = (class_2828)var4_5;
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (var2_7.method_36172()) ** GOTO lbl31
                        if (var6_4) ** GOTO lbl6
                        var5_6 = ot.klqe("kmvw", klpy(int ), (int)367);
                        if (var6_4) ** GOTO lbl6
                        if (!var8_2) continue block38;
                        throw null;
lbl31:
                        // 1 sources

                        if (var6_4 || var6_4) ** GOTO lbl6
                        this.serverAngle = new ov(var2_7.method_12271(1.0f), var2_7.method_12270(1.0f));
                        if (var6_4) ** GOTO lbl6
                        if (!var8_2) break block38;
                        throw null;
                    }
                    case 1: {
                        if (var6_4 || var6_4) ** GOTO lbl6
                        var3_8 = (class_2708)var4_5;
                        if (var6_4 || var6_4) ** GOTO lbl6
                        this.serverAngle = new ov(var3_8.comp_3228().comp_3150(), var3_8.comp_3228().comp_3151());
                        if (var6_4) ** GOTO lbl6
                        if (!var8_2) break block38;
                        throw null;
                    }
                    default: {
                        if (var6_4 || var6_4) ** GOTO lbl6
                        if (!var8_2) break block38;
                        throw null;
                    }
                }
                break;
            }
        }
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var7_3 /* !! */  = (int)ot.klqe("kmvx", klpy(int ), (int)368);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl110
            }
lbl60:
            // 2 sources

            case 1: {
                var7_3 /* !! */  = (int)ot.klqe("kmvy", klpy(int ), (int)369);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl65:
            // 6 sources

            case 2: {
                var7_3 /* !! */  = (int)ot.klqe("kmvz", klpy(int ), (int)370);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl70:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)ot.klqe("kmwa", klpy(int ), (int)371);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl75:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)ot.klqe("kmwb", klpy(int ), (int)372);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 5: {
                var7_3 /* !! */  = (int)ot.klqe("kmwc", klpy(int ), (int)373);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl85:
            // 3 sources

            case 6: {
                var7_3 /* !! */  = (int)ot.klqe("kmwd", klpy(int ), (int)374);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl157
            }
lbl90:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)ot.klqe("kmwe", klpy(int ), (int)375);
                if (!var8_2) ** GOTO lbl65
                throw null;
            }
lbl94:
            // 4 sources

            case 8: {
                var7_3 /* !! */  = (int)ot.klqe("kmwf", klpy(int ), (int)376);
                if (!var8_2) ** GOTO lbl70
                throw null;
            }
            case 9: {
                var7_3 /* !! */  = (int)ot.klqe("kmwg", klpy(int ), (int)377);
                if (!var8_2) ** GOTO lbl94
                throw null;
            }
            case 10: {
                var7_3 /* !! */  = (int)ot.klqe("kmwh", klpy(int ), (int)378);
                if (!var8_2) ** GOTO lbl94
                throw null;
            }
            case 11: {
                var7_3 /* !! */  = (int)ot.klqe("kmwi", klpy(int ), (int)379);
                if (!var8_2) ** GOTO lbl75
                throw null;
            }
lbl110:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ot.klqe("kmwj", klpy(int ), (int)380);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl121
                    break;
                }
            }
            case 13: {
                var7_3 /* !! */  = (int)ot.klqe("kmwk", klpy(int ), (int)381);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl121:
            // 3 sources

            case 14: {
                var7_3 /* !! */  = (int)ot.klqe("kmwl", klpy(int ), (int)382);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl126:
            // 2 sources

            case 15: {
                var7_3 /* !! */  = (int)ot.klqe("kmwm", klpy(int ), (int)383);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
            case 16: {
                var7_3 /* !! */  = (int)ot.klqe("kmwn", klpy(int ), (int)384);
                if (!var8_2) ** GOTO lbl65
                throw null;
            }
            case 17: {
                do {
                    var7_3 /* !! */  = (int)ot.klqe("kmwo", klpy(int ), (int)385);
                } while (!var8_2);
                throw null;
            }
lbl140:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)ot.klqe("kmwp", klpy(int ), (int)386);
                if (!var8_2) ** GOTO lbl65
                throw null;
            }
            case 19: {
                var7_3 /* !! */  = (int)ot.klqe("kmwq", klpy(int ), (int)387);
                if (!var8_2) ** GOTO lbl85
                throw null;
            }
            case 20: {
                var7_3 /* !! */  = (int)ot.klqe("kmwr", klpy(int ), (int)388);
                if (!var8_2) ** GOTO lbl65
                throw null;
            }
lbl152:
            // 2 sources

            case 21: {
                var7_3 /* !! */  = (int)ot.klqe("kmws", klpy(int ), (int)389);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl162
            }
lbl157:
            // 2 sources

            case 22: {
                do {
                    var7_3 /* !! */  = (int)ot.klqe("kmwt", klpy(int ), (int)390);
                } while (!var8_2);
                throw null;
            }
lbl162:
            // 3 sources

            case 23: {
                var7_3 /* !! */  = (int)ot.klqe("kmwu", klpy(int ), (int)391);
                if (!var8_2) ** GOTO lbl152
                throw null;
            }
lbl166:
            // 2 sources

            case 24: {
                var7_3 /* !! */  = (int)ot.klqe("kmwv", klpy(int ), (int)392);
                if (var8_2) {
                    throw null;
                }
            }
lbl170:
            // 4 sources

            case 25: {
                var7_3 /* !! */  = (int)ot.klqe("kmww", klpy(int ), (int)393);
                if (!var8_2) ** GOTO lbl140
                throw null;
            }
            case 26: {
                var7_3 /* !! */  = (int)ot.klqe("kmwx", klpy(int ), (int)394);
                if (!var8_2) ** GOTO lbl121
                throw null;
            }
            case 27: {
                var7_3 /* !! */  = (int)ot.klqe("kmwy", klpy(int ), (int)395);
                if (!var8_2) ** GOTO lbl60
                throw null;
            }
            case 28: {
                var7_3 /* !! */  = (int)ot.klqe("kmwz", klpy(int ), (int)396);
                if (!var8_2) ** GOTO lbl166
                throw null;
            }
lbl186:
            // 3 sources

            case 29: {
                var7_3 /* !! */  = (int)ot.klqe("kmxa", klpy(int ), (int)397);
                if (!var8_2) ** GOTO lbl65
                throw null;
            }
            case 30: 
        }
        var7_3 /* !! */  = (int)ot.klqe("kmxb", klpy(int ), (int)398);
        ** while (!var8_2)
lbl193:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov getPreviousRotation() {
        block67: {
            v0 /* !! */  = ot.so;
            if (true) ** GOTO lbl5
            block42: while (true) {
                v0 /* !! */  = (long)(ot.klqe("klye", klqv(int ), (int)50) - ot.klqe("klyd", klqv(int ), (int)49));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1271690800: {
                        break block42;
                    }
                    case -673818474: {
                        continue block42;
                    }
                }
                break;
            }
            var3_1 = ot.c;
            v1 /* !! */  = ot.so;
            if (true) ** GOTO lbl15
            block43: while (true) {
                v1 /* !! */  = (long)(ot.klqe("klyg", klqv(int ), (int)52) - ot.klqe("klyf", klqv(int ), (int)51));
lbl15:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1271690800: {
                        break block43;
                    }
                    case -75639513: {
                        continue block43;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ot.b;
            v2 /* !! */  = ot.so;
            if (true) ** GOTO lbl25
            block44: while (true) {
                v2 /* !! */  = (long)(v3 - ot.klqe("klyh", klqv(int ), (int)53));
lbl25:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1271690800: {
                        break block44;
                    }
                    case -894344039: {
                        v3 = ot.klqe("klyi", klqv(int ), (int)54);
                        continue block44;
                    }
                    case 2127787645: {
                        v3 = ot.klqe("klyj", klqv(int ), (int)55);
                        continue block44;
                    }
                }
                break;
            }
            var1_3 = ot.a;
            if (var3_1) {
                throw null;
lbl37:
                // 5 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl37
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("klyk", klqv(int ), (int)56)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ot.klqe("klyl", klpy(int ), (int)52)) break;
                v4 /* !! */  = (long)ot.klqe("klym", klpy(int ), (int)53);
            }
            if (this.currentAngle == null) break block67;
            if (var1_3) ** GOTO lbl37
            v5 /* !! */  = ot.so;
            if (true) ** GOTO lbl51
            block47: while (true) {
                v5 /* !! */  = (long)(ot.klqe("klyo", klqv(int ), (int)58) - ot.klqe("klyn", klqv(int ), (int)57));
lbl51:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1645857243: {
                        continue block47;
                    }
                    case -1271690800: {
                        break block47;
                    }
                }
                break;
            }
            if (this.previousAngle == null) break block67;
            if (var1_3) ** GOTO lbl37
            v6 /* !! */  = ot.so;
            if (true) ** GOTO lbl62
            block48: while (true) {
                v6 /* !! */  = (long)(v7 - ot.klqe("klyp", klqv(int ), (int)59));
lbl62:
                // 2 sources

                switch ((int)v6 /* !! */ ) {
                    case -1271690800: {
                        break block48;
                    }
                    case 42522198: {
                        v7 = ot.klqe("klyq", klqv(int ), (int)60);
                        continue block48;
                    }
                    case 2102117371: {
                        v7 = ot.klqe("klyr", klqv(int ), (int)61);
                        continue block48;
                    }
                }
                break;
            }
            v8 = this.previousAngle;
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl141
        }
        if (var1_3) ** GOTO lbl37
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block22 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("klys", klqv(int ), (int)62)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ot.klqe("klyt", klpy(int ), (int)54)) break;
                    v9 /* !! */  = (long)ot.klqe("klyu", klpy(int ), (int)55);
                }
                v8 = v10;
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("klyv", klqv(int ), (int)63)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ot.klqe("klyw", klpy(int ), (int)56)) break;
                    v11 /* !! */  = (long)ot.klqe("klyx", klpy(int ), (int)57);
                }
                v12 /* !! */  = ot.so;
                if (true) ** GOTO lbl97
                block51: while (true) {
                    v12 /* !! */  = (long)(ot.klqe("klyz", klqv(int ), (int)65) - ot.klqe("klyy", klqv(int ), (int)64));
lbl97:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1271690800: {
                            break block51;
                        }
                        case 1960946368: {
                            continue block51;
                        }
                    }
                    break;
                }
                v13 = ot.mc.field_1724;
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("klza", klqv(int ), (int)66)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ot.klqe("klzb", klpy(int ), (int)58)) break;
                    v14 /* !! */  = (long)ot.klqe("klzc", klpy(int ), (int)59);
                }
                v15 = v13.field_5982;
                v16 /* !! */  = ot.so;
                if (true) ** GOTO lbl113
                block53: while (true) {
                    v16 /* !! */  = (long)(v17 - ot.klqe("klzd", klqv(int ), (int)67));
lbl113:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -1706139435: {
                            v17 = ot.klqe("klze", klqv(int ), (int)68);
                            continue block53;
                        }
                        case -1271690800: {
                            break block53;
                        }
                        case -975081687: {
                            v17 = ot.klqe("klzf", klqv(int ), (int)69);
                            continue block53;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = ot.so - ot.klqe("klzg", klqv(int ), (int)70)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == ot.klqe("klzh", klpy(int ), (int)60)) break;
                    v18 /* !! */  = (long)ot.klqe("klzi", klpy(int ), (int)61);
                }
                v19 = ot.mc.field_1724;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = ot.so - ot.klqe("klzj", klqv(int ), (int)71)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ot.klqe("klzk", klpy(int ), (int)62)) break;
                    v20 /* !! */  = (long)ot.klqe("klzl", klpy(int ), (int)63);
                }
                v21 = v19.field_6004;
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_6 = ot.so - ot.klqe("klzm", klqv(int ), (int)72)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ot.klqe("klzn", klpy(int ), (int)64)) {
                        v10 = new ov(v15, v21);
                        break;
                    }
                    v22 /* !! */  = (long)ot.klqe("klzo", klpy(int ), (int)65);
                }
lbl141:
                // 2 sources

                return v8;
            }
lbl142:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ot.klqe("klzp", klpy(int ), (int)66);
                    if (!var3_1) break block22;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ot.klqe("klzq", klpy(int ), (int)67);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 2: {
                var2_2 /* !! */  = (int)ot.klqe("klzr", klpy(int ), (int)68);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl174
            }
            case 3: {
                var2_2 /* !! */  = (int)ot.klqe("klzs", klpy(int ), (int)69);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
lbl161:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ot.klqe("klzt", klpy(int ), (int)70);
                if (!var3_1) break;
                throw null;
            }
lbl165:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ot.klqe("klzu", klpy(int ), (int)71);
                if (!var3_1) ** GOTO lbl161
                throw null;
            }
            case 6: {
                do {
                    var2_2 /* !! */  = (int)ot.klqe("klzv", klpy(int ), (int)72);
                } while (!var3_1);
                throw null;
            }
lbl174:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ot.klqe("klzw", klpy(int ), (int)73);
                if (!var3_1) ** GOTO lbl165
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)ot.klqe("klzx", klpy(int ), (int)74);
        ** while (!var3_1)
lbl181:
        // 1 sources

        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void setRotation(ov var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("klsz", klqv(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ot.klqe("kltb", klpy(int ), (int)15)) break;
            v0 /* !! */  = (long)ot.klqe("kltd", klpy(int ), (int)16);
        }
        var4_2 = ot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kltf", klqv(int ), (int)15)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ot.klqe("kltg", klpy(int ), (int)17)) break;
            v1 /* !! */  = (long)ot.klqe("klth", klpy(int ), (int)18);
        }
        var3_3 /* !! */  = ot.b;
        while (true) {
            block81: {
                if ((v2 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kltj", klqv(int ), (int)16)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  != ot.klqe("kltl", klpy(int ), (int)19)) break block81;
                var2_4 = ot.a;
                if (var3_3 /* !! */  != 0) {
                    break;
                }
                ** GOTO lbl-1000
            }
            v2 /* !! */  = (long)ot.klqe("kltn", klpy(int ), (int)20);
        }
        cfr_temp_0 = -2147483648;
        block50: while (true) {
            block82: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var4_2) {
                            throw null;
                        }
                        if (var2_4 || var2_4) ** GOTO lbl169
                        if (var1_1 != null) ** GOTO lbl34
                        if (var2_4 || var2_4) ** GOTO lbl169
                        v3 /* !! */  = ot.so;
                        if (true) ** GOTO lbl85
lbl34:
                        // 1 sources

                        if (var2_4 || var2_4) ** GOTO lbl169
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_4 = ot.so - ot.klqe("klum", klqv(int ), (int)29)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != ot.klqe("kluo", klpy(int ), (int)21)) ** GOTO lbl40
                            v5 /* !! */  = ot.so;
                            if (true) ** GOTO lbl144
lbl40:
                            // 1 sources

                            v4 /* !! */  = (long)ot.klqe("kluq", klpy(int ), (int)22);
                        }
                    }
                    case 1: {
                        var3_3 /* !! */  = (int)ot.klqe("klvg", klpy(int ), (int)24);
                        cfr_temp_0 = 4;
                        if (var4_2) {
                            throw null;
                        }
                        break block82;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)ot.klqe("klvj", klpy(int ), (int)25);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)ot.klqe("klvm", klpy(int ), (int)27);
                        cfr_temp_0 = 5;
                        if (var4_2) {
                            throw null;
                        }
                        break block82;
                    }
                    case 7: {
                        var3_3 /* !! */  = (int)ot.klqe("klvt", klpy(int ), (int)30);
                        cfr_temp_0 = 3;
                        if (var4_2) {
                            throw null;
                        }
                        break block82;
                    }
                    case 8: {
                        ** GOTO lbl188
                    }
                    case 10: {
                        var3_3 /* !! */  = (int)ot.klqe("klvz", klpy(int ), (int)33);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl185
                    }
                    case 11: {
                        var3_3 /* !! */  = (int)ot.klqe("klwa", klpy(int ), (int)34);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl185
                    }
                    case 13: {
                        var3_3 /* !! */  = (int)ot.klqe("klwg", klpy(int ), (int)36);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl185
                    }
                    case 14: {
                        ** GOTO lbl185
                    }
                    block52: while (true) {
                        v3 /* !! */  = (long)(v6 - ot.klqe("klto", klqv(int ), (int)17));
lbl85:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1271690800: {
                                break block52;
                            }
                            case -422797746: {
                                v6 = ot.klqe("kltq", klqv(int ), (int)18);
                                continue block52;
                            }
                            case 1115234072: {
                                v6 = ot.klqe("klts", klqv(int ), (int)19);
                                continue block52;
                            }
                        }
                        break;
                    }
                    if (this.currentAngle != null) ** GOTO lbl97
                    v7 /* !! */  = ot.so;
                    if (true) ** GOTO lbl111
lbl97:
                    // 1 sources

                    v8 /* !! */  = ot.so;
                    block53: while (true) {
                        switch ((int)v8 /* !! */ ) {
                            case -1271690800: {
                                break block53;
                            }
                            case 2082791381: {
                                v8 /* !! */  = (long)(ot.klqe("kltu", klqv(int ), (int)21) - ot.klqe("kltt", klqv(int ), (int)20));
                                continue block53;
                            }
                        }
                        break;
                    }
                    v9 = this.currentAngle;
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl124
                    block54: while (true) {
                        v7 /* !! */  = (long)(v10 - ot.klqe("kltw", klqv(int ), (int)22));
lbl111:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case -1271690800: {
                                break block54;
                            }
                            case -585626893: {
                                v10 = ot.klqe("kltz", klqv(int ), (int)23);
                                continue block54;
                            }
                            case 1625876322: {
                                v10 = ot.klqe("kluc", klqv(int ), (int)24);
                                continue block54;
                            }
                            case 1765173247: {
                                v10 = ot.klqe("klue", klqv(int ), (int)25);
                                continue block54;
                            }
                        }
                        break;
                    }
                    v9 = ow.cameraAngle();
lbl124:
                    // 2 sources

                    v11 /* !! */  = ot.so;
                    if (true) ** GOTO lbl128
                    block55: while (true) {
                        v11 /* !! */  = (long)(v12 - ot.klqe("klug", klqv(int ), (int)26));
lbl128:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1271690800: {
                                break block55;
                            }
                            case 916849807: {
                                v12 = ot.klqe("kluh", klqv(int ), (int)27);
                                continue block55;
                            }
                            case 1785388347: {
                                v12 = ot.klqe("klui", klqv(int ), (int)28);
                                continue block55;
                            }
                        }
                        break;
                    }
                    this.previousAngle = v9;
                    if (var2_4) ** GOTO lbl169
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl158
                    block56: while (true) {
                        v5 /* !! */  = (long)(v13 - ot.klqe("klur", klqv(int ), (int)30));
lbl144:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -1271690800: {
                                break block56;
                            }
                            case -837595499: {
                                v13 = ot.klqe("klut", klqv(int ), (int)31);
                                continue block56;
                            }
                            case 874866394: {
                                v13 = ot.klqe("kluv", klqv(int ), (int)32);
                                continue block56;
                            }
                            case 1696250767: {
                                v13 = ot.klqe("klux", klqv(int ), (int)33);
                                continue block56;
                            }
                        }
                        break;
                    }
                    this.previousAngle = this.currentAngle;
                    if (var2_4) ** GOTO lbl169
lbl158:
                    // 2 sources

                    if (var2_4 || var2_4) ** GOTO lbl169
                    v14 /* !! */  = ot.so;
                    block57: while (true) {
                        switch ((int)v14 /* !! */ ) {
                            case -1271690800: {
                                break block57;
                            }
                            case 1621081724: {
                                v14 /* !! */  = (long)(ot.klqe("kluz", klqv(int ), (int)35) - ot.klqe("kluy", klqv(int ), (int)34));
                                continue block57;
                            }
                        }
                        break;
                    }
                    this.currentAngle = var1_1;
                    if (!var2_4 && !var2_4) ** GOTO lbl170
lbl169:
                    // 7 sources

                    return;
lbl170:
                    // 1 sources

                    return;
                    case 0: {
                        var3_3 /* !! */  = (int)ot.klqe("klvd", klpy(int ), (int)23);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 12: {
                        var3_3 /* !! */  = (int)ot.klqe("klwd", klpy(int ), (int)35);
                        cfr_temp_0 = 0;
                        if (var4_2) {
                            throw null;
                        }
                        break block82;
                    }
                    case 3: {
                        var3_3 /* !! */  = (int)ot.klqe("klvl", klpy(int ), (int)26);
                        if (var4_2) {
                            throw null;
                        }
lbl185:
                        // 6 sources

                        var3_3 /* !! */  = (int)ot.klqe("klwj", klpy(int ), (int)37);
                        if (var4_2) {
                            throw null;
                        }
lbl188:
                        // 3 sources

                        var3_3 /* !! */  = (int)ot.klqe("klvv", klpy(int ), (int)31);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 9: {
                        var3_3 /* !! */  = (int)ot.klqe("klvy", klpy(int ), (int)32);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)ot.klqe("klvp", klpy(int ), (int)28);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl204
            }
            do {
                if (true) continue block50;
lbl204:
                // 2 sources

                var3_3 /* !! */  = (int)ot.klqe("klvr", klpy(int ), (int)29);
                cfr_temp_0 = 3;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void init() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("klqz", klqv(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ot.klqe("klra", klpy(int ), (int)4)) break;
            v0 /* !! */  = (long)ot.klqe("klrb", klpy(int ), (int)5);
        }
        var3_1 = ot.c;
        v1 /* !! */  = ot.so;
        if (true) ** GOTO lbl11
        block32: while (true) {
            v1 /* !! */  = (long)(ot.klqe("klre", klqv(int ), (int)2) - ot.klqe("klrc", klqv(int ), (int)1));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1913357615: {
                    continue block32;
                }
                case -1271690800: {
                    break block32;
                }
            }
            break;
        }
        var2_2 /* !! */  = ot.b;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl21
        block33: while (true) {
            v2 /* !! */  = (long)(v3 - ot.klqe("klrg", klqv(int ), (int)3));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1953342119: {
                    v3 = ot.klqe("klri", klqv(int ), (int)4);
                    continue block33;
                }
                case -1271690800: {
                    break block33;
                }
                case 366703994: {
                    v3 = ot.klqe("klrj", klqv(int ), (int)5);
                    continue block33;
                }
                case 1627264045: {
                    v3 = ot.klqe("klrk", klqv(int ), (int)6);
                    continue block33;
                }
            }
            break;
        }
        var1_3 = ot.a;
        if (var3_1) {
            throw null;
lbl36:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        v4 /* !! */  = ot.so;
        if (true) ** GOTO lbl43
        block35: while (true) {
            v4 /* !! */  = (long)(ot.klqe("klrp", klqv(int ), (int)8) - ot.klqe("klrn", klqv(int ), (int)7));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1271690800: {
                    break block35;
                }
                case -440047241: {
                    continue block35;
                }
            }
            break;
        }
        v5 = d.getInstance();
        v6 /* !! */  = ot.so;
        if (true) ** GOTO lbl53
        block36: while (true) {
            v6 /* !! */  = (long)(ot.klqe("klrt", klqv(int ), (int)10) - ot.klqe("klrr", klqv(int ), (int)9));
lbl53:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1271690800: {
                    break block36;
                }
                case 1599633741: {
                    continue block36;
                }
            }
            break;
        }
        v7 = v5.getManager();
        v8 /* !! */  = ot.so;
        if (true) ** GOTO lbl63
        block37: while (true) {
            v8 /* !! */  = (long)(ot.klqe("klrw", klqv(int ), (int)12) - ot.klqe("klru", klqv(int ), (int)11));
lbl63:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1271690800: {
                    break block37;
                }
                case 1138428169: {
                    continue block37;
                }
            }
            break;
        }
        v7.getEventManager();
        if (var1_3) ** GOTO lbl36
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("klry", klqv(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ot.klqe("klsb", klpy(int ), (int)6)) break;
            v9 /* !! */  = (long)ot.klqe("klsc", klpy(int ), (int)7);
        }
        ax.register(this);
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                return;
            }
lbl84:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)ot.klqe("klsf", klpy(int ), (int)8);
                if (var3_1) {
                    throw null;
                }
            }
lbl88:
            // 4 sources

            case 1: {
                var2_2 /* !! */  = (int)ot.klqe("klsh", klpy(int ), (int)9);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ot.klqe("klsj", klpy(int ), (int)10);
                if (!var3_1) ** GOTO lbl88
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ot.klqe("klsl", klpy(int ), (int)11);
                    if (!var3_1) ** GOTO lbl84
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)ot.klqe("klsm", klpy(int ), (int)12);
                if (!var3_1) ** GOTO lbl84
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ot.klqe("klsn", klpy(int ), (int)13);
                if (!var3_1) break;
                throw null;
            }
            case 6: 
        }
        var2_2 /* !! */  = (int)ot.klqe("klsp", klpy(int ), (int)14);
        ** while (!var3_1)
lbl112:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void knaj() {
        ot.klpz[100] = 1135241440;
        ot.klpz[101] = -746424399;
        ot.klpz[102] = -1591637413;
        ot.klpz[103] = -310191139;
        ot.klpz[104] = -2145298640;
        ot.klpz[105] = 189840608;
        ot.klpz[106] = -21607676;
        ot.klpz[107] = -1194347374;
        ot.klpz[108] = 664660657;
        ot.klpz[109] = -1352087348;
        ot.klpz[110] = 110313890;
        ot.klpz[111] = 337901345;
        ot.klpz[112] = -1964699063;
        ot.klpz[113] = 635023957;
        ot.klpz[114] = -628998299;
        ot.klpz[115] = -196770946;
        ot.klpz[116] = 852723969;
        ot.klpz[117] = 175678685;
        ot.klpz[118] = 683155596;
        ot.klpz[119] = 1226537865;
        ot.klpz[120] = 1124968009;
        ot.klpz[121] = -1659993579;
        ot.klpz[122] = 380995359;
        ot.klpz[123] = 579717293;
        ot.klpz[124] = -691865108;
        ot.klpz[125] = 1567463386;
        ot.klpz[126] = 4356408;
        ot.klpz[127] = 1835684095;
        ot.klpz[128] = -1018583531;
        ot.klpz[129] = -1051216630;
        ot.klpz[130] = 1382002221;
        ot.klpz[131] = 653000912;
        ot.klpz[132] = -2145952404;
        ot.klpz[133] = -43675175;
        ot.klpz[134] = -260325677;
        ot.klpz[135] = -1511367831;
        ot.klpz[136] = 1470639189;
        ot.klpz[137] = 753818790;
        ot.klpz[138] = -884664457;
        ot.klpz[139] = -1540517052;
        ot.klpz[140] = 1113981049;
        ot.klpz[141] = -797534253;
        ot.klpz[142] = -587247918;
        ot.klpz[143] = 737079241;
        ot.klpz[144] = 768233195;
        ot.klpz[145] = 996682143;
        ot.klpz[146] = 711628607;
        ot.klpz[147] = 1445976231;
        ot.klpz[148] = -1392627674;
        ot.klpz[149] = 316141012;
        ot.klpz[150] = 1252608550;
        ot.klpz[151] = -454588900;
        ot.klpz[152] = 81598714;
        ot.klpz[153] = 626086272;
        ot.klpz[154] = 1007865598;
        ot.klpz[155] = 39359219;
        ot.klpz[156] = 1890772099;
        ot.klpz[157] = 2121817984;
        ot.klpz[158] = 2120714631;
        ot.klpz[159] = -1170435278;
        ot.klpz[160] = -1744570202;
        ot.klpz[161] = -1125123718;
        ot.klpz[162] = 1069383727;
        ot.klpz[163] = -1467271016;
        ot.klpz[164] = -333500292;
        ot.klpz[165] = 724074213;
        ot.klpz[166] = -170467426;
        ot.klpz[167] = 882829390;
        ot.klpz[168] = -1676363233;
        ot.klpz[169] = -807281838;
        ot.klpz[170] = -988766649;
        ot.klpz[171] = -454119166;
        ot.klpz[172] = -848707379;
        ot.klpz[173] = 1162937465;
        ot.klpz[174] = 1363970056;
        ot.klpz[175] = -1135915961;
        ot.klpz[176] = 1616985410;
        ot.klpz[177] = 590525780;
        ot.klpz[178] = 132162701;
        ot.klpz[179] = -182740467;
        ot.klpz[180] = 764494521;
        ot.klpz[181] = 701299133;
        ot.klpz[182] = 408627451;
        ot.klpz[183] = 1450016325;
        ot.klpz[184] = 859906010;
        ot.klpz[185] = 1040819320;
        ot.klpz[186] = 921696753;
        ot.klpz[187] = 1594216664;
        ot.klpz[188] = 1893817204;
        ot.klpz[189] = -1713677116;
        ot.klpz[190] = -504209384;
        ot.klpz[191] = 80163344;
        ot.klpz[192] = -730151004;
        ot.klpz[193] = 825962864;
        ot.klpz[194] = 1153683695;
        ot.klpz[195] = -1276061346;
        ot.klpz[196] = -1476249069;
        ot.klpz[197] = 779609304;
        ot.klpz[198] = -1781861642;
        ot.klpz[199] = 1211347085;
    }

    private static /* synthetic */ void knar() {
        ot.klqc[400] = 1588269506;
        ot.klqc[401] = 129565871;
        ot.klqc[402] = 241958833;
        ot.klqc[403] = -805522939;
        ot.klqc[404] = -839355567;
        ot.klqc[405] = -2053199409;
        ot.klqc[406] = -2086196194;
        ot.klqc[407] = 1672930561;
        ot.klqc[408] = 891933170;
        ot.klqc[409] = -1152128201;
        ot.klqc[410] = -1303648149;
        ot.klqc[411] = 338209800;
        ot.klqc[412] = -1484778459;
        ot.klqc[413] = 896832302;
        ot.klqc[414] = -1293072470;
        ot.klqc[415] = -1684576630;
        ot.klqc[416] = -1371739818;
        ot.klqc[417] = 871610196;
        ot.klqc[418] = 752125445;
        ot.klqc[419] = -1824997506;
        ot.klqc[420] = -1803815856;
        ot.klqc[421] = 1066858178;
        ot.klqc[422] = 1395985975;
        ot.klqc[423] = -1008683316;
        ot.klqc[424] = -543028333;
        ot.klqc[425] = 479249153;
        ot.klqc[426] = -1169488354;
        ot.klqc[427] = 1221722164;
        ot.klqc[428] = -171782192;
        ot.klqc[429] = 1719125236;
        ot.klqc[430] = 603683116;
        ot.klqc[431] = 1210138228;
        ot.klqc[432] = 896195671;
        ot.klqc[433] = -345869409;
        ot.klqc[434] = 614726458;
        ot.klqc[435] = -221707703;
        ot.klqc[436] = -1943833872;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ou getCurrentRotationPlan() {
        block47: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmbi", klqv(int ), (int)89)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == ot.klqe("kmbj", klpy(int ), (int)95)) break;
                v0 /* !! */  = (long)ot.klqe("kmbk", klpy(int ), (int)96);
            }
            var3_1 = ot.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmbl", klqv(int ), (int)90)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ot.klqe("kmbm", klpy(int ), (int)97)) break;
                v1 /* !! */  = (long)ot.klqe("kmbn", klpy(int ), (int)98);
            }
            var2_2 /* !! */  = ot.b;
            v2 /* !! */  = ot.so;
            if (true) ** GOTO lbl19
            block22: while (true) {
                v2 /* !! */  = (long)(v3 - ot.klqe("kmbo", klqv(int ), (int)91));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1271690800: {
                        break block22;
                    }
                    case -943235763: {
                        v3 = ot.klqe("kmbp", klqv(int ), (int)92);
                        continue block22;
                    }
                    case 770662176: {
                        v3 = ot.klqe("kmbq", klqv(int ), (int)93);
                        continue block22;
                    }
                }
                break;
            }
            var1_3 = ot.a;
            if (var3_1) {
                throw null;
lbl31:
                // 4 sources

                return null;
            }
            if (var1_3 || var1_3) ** GOTO lbl31
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmbr", klqv(int ), (int)94)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ot.klqe("kmbs", klpy(int ), (int)99)) break;
                v4 /* !! */  = (long)ot.klqe("kmbt", klpy(int ), (int)100);
            }
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kmbu", klqv(int ), (int)95)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v5 /* !! */  == ot.klqe("kmbv", klpy(int ), (int)101)) break;
                v5 /* !! */  = (long)ot.klqe("kmbw", klpy(int ), (int)102);
            }
            if (this.rotationPlanTaskProcessor.fetchActiveTaskValue() == null) break block47;
            if (var1_3 || var1_3) ** GOTO lbl31
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_4 = ot.so - ot.klqe("kmbx", klqv(int ), (int)96)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v6 /* !! */  == ot.klqe("kmby", klpy(int ), (int)103)) break;
                v6 /* !! */  = (long)ot.klqe("kmbz", klpy(int ), (int)104);
            }
            v7 /* !! */  = ot.so;
            if (true) ** GOTO lbl58
            block27: while (true) {
                v7 /* !! */  = (long)(ot.klqe("kmcb", klqv(int ), (int)98) - ot.klqe("kmca", klqv(int ), (int)97));
lbl58:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1271690800: {
                        break block27;
                    }
                    case 681764049: {
                        continue block27;
                    }
                }
                break;
            }
            v8 = this.rotationPlanTaskProcessor.fetchActiveTaskValue();
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl82
        }
        if (var1_3) ** GOTO lbl31
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = ot.so - ot.klqe("kmcc", klqv(int ), (int)99)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == ot.klqe("kmcd", klpy(int ), (int)105)) {
                        v8 = this.lastRotationPlan;
                        break;
                    }
                    v9 /* !! */  = (long)ot.klqe("kmce", klpy(int ), (int)106);
                }
lbl82:
                // 2 sources

                return v8;
            }
lbl83:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ot.klqe("kmcf", klpy(int ), (int)107);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 1: {
                var2_2 /* !! */  = (int)ot.klqe("kmcg", klpy(int ), (int)108);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 2: {
                var2_2 /* !! */  = (int)ot.klqe("kmch", klpy(int ), (int)109);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
            case 3: {
                var2_2 /* !! */  = (int)ot.klqe("kmci", klpy(int ), (int)110);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl103:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ot.klqe("kmcj", klpy(int ), (int)111);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl117
            }
            case 5: {
                do {
                    var2_2 /* !! */  = (int)ot.klqe("kmck", klpy(int ), (int)112);
                } while (!var3_1);
                throw null;
            }
lbl113:
            // 5 sources

            case 6: {
                var2_2 /* !! */  = (int)ot.klqe("kmcl", klpy(int ), (int)113);
                if (!var3_1) ** GOTO lbl103
                throw null;
            }
lbl117:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ot.klqe("kmcm", klpy(int ), (int)114);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
            case 8: 
        }
        do {
            var2_2 /* !! */  = (int)ot.klqe("kmcn", klpy(int ), (int)115);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ void knan() {
        ot.klqc[0] = -1981171334;
        ot.klqc[1] = -1084358467;
        ot.klqc[2] = -1361104310;
        ot.klqc[3] = -1687988746;
        ot.klqc[4] = 615962883;
        ot.klqc[5] = 388716897;
        ot.klqc[6] = 1828099197;
        ot.klqc[7] = 1862085989;
        ot.klqc[8] = 178777824;
        ot.klqc[9] = 1833838937;
        ot.klqc[10] = 1991749413;
        ot.klqc[11] = -1802867573;
        ot.klqc[12] = -1823116246;
        ot.klqc[13] = -981165101;
        ot.klqc[14] = 637672318;
        ot.klqc[15] = 556485938;
        ot.klqc[16] = -651634617;
        ot.klqc[17] = -433975193;
        ot.klqc[18] = 35474152;
        ot.klqc[19] = -642605480;
        ot.klqc[20] = -1021765197;
        ot.klqc[21] = 288812200;
        ot.klqc[22] = -458942276;
        ot.klqc[23] = 474061776;
        ot.klqc[24] = -1731955717;
        ot.klqc[25] = 1581040048;
        ot.klqc[26] = 1166072280;
        ot.klqc[27] = 279662024;
        ot.klqc[28] = -1354773210;
        ot.klqc[29] = -1967635056;
        ot.klqc[30] = 1696344191;
        ot.klqc[31] = -74849971;
        ot.klqc[32] = -329639197;
        ot.klqc[33] = -62027311;
        ot.klqc[34] = 955961185;
        ot.klqc[35] = -1283939946;
        ot.klqc[36] = -1865087491;
        ot.klqc[37] = -1702754889;
        ot.klqc[38] = -1157450400;
        ot.klqc[39] = 873664742;
        ot.klqc[40] = 847517621;
        ot.klqc[41] = -934795251;
        ot.klqc[42] = 787407913;
        ot.klqc[43] = -2022163186;
        ot.klqc[44] = -980507433;
        ot.klqc[45] = -2068836557;
        ot.klqc[46] = 1922403801;
        ot.klqc[47] = 714954249;
        ot.klqc[48] = 1107719519;
        ot.klqc[49] = 1765115244;
        ot.klqc[50] = 197950612;
        ot.klqc[51] = -1180533421;
        ot.klqc[52] = -34082854;
        ot.klqc[53] = -2027633238;
        ot.klqc[54] = 156017371;
        ot.klqc[55] = 1319327168;
        ot.klqc[56] = -1093210374;
        ot.klqc[57] = 554925225;
        ot.klqc[58] = 898108612;
        ot.klqc[59] = 942836767;
        ot.klqc[60] = -2044281605;
        ot.klqc[61] = -308427756;
        ot.klqc[62] = 317274550;
        ot.klqc[63] = -1628929028;
        ot.klqc[64] = 1916612398;
        ot.klqc[65] = -176410218;
        ot.klqc[66] = 951492755;
        ot.klqc[67] = 592818408;
        ot.klqc[68] = 1422076016;
        ot.klqc[69] = 1741986975;
        ot.klqc[70] = -467100416;
        ot.klqc[71] = -1849909960;
        ot.klqc[72] = -2052981350;
        ot.klqc[73] = -1017905600;
        ot.klqc[74] = 1177350065;
        ot.klqc[75] = -721986429;
        ot.klqc[76] = 575517302;
        ot.klqc[77] = -1842794237;
        ot.klqc[78] = 1170505812;
        ot.klqc[79] = 1300973283;
        ot.klqc[80] = -1815663005;
        ot.klqc[81] = 1295675961;
        ot.klqc[82] = -1010006790;
        ot.klqc[83] = -641982803;
        ot.klqc[84] = -1458702322;
        ot.klqc[85] = -111846411;
        ot.klqc[86] = -1625804512;
        ot.klqc[87] = 1304466192;
        ot.klqc[88] = 1663176705;
        ot.klqc[89] = -457643760;
        ot.klqc[90] = -346890381;
        ot.klqc[91] = -2023487379;
        ot.klqc[92] = 642699198;
        ot.klqc[93] = 662020200;
        ot.klqc[94] = 859626612;
        ot.klqc[95] = -1301900202;
        ot.klqc[96] = -296720777;
        ot.klqc[97] = 1563071917;
        ot.klqc[98] = -236062693;
        ot.klqc[99] = -2111837566;
    }

    private static /* synthetic */ void knaq() {
        ot.klqc[300] = -652232156;
        ot.klqc[301] = 1935834257;
        ot.klqc[302] = 1040598874;
        ot.klqc[303] = 668320935;
        ot.klqc[304] = -1606839467;
        ot.klqc[305] = -636853060;
        ot.klqc[306] = -757452113;
        ot.klqc[307] = -920401909;
        ot.klqc[308] = 4510402;
        ot.klqc[309] = -2079610153;
        ot.klqc[310] = 370852028;
        ot.klqc[311] = 1201624098;
        ot.klqc[312] = 1484577940;
        ot.klqc[313] = -914155989;
        ot.klqc[314] = -1216506161;
        ot.klqc[315] = -1413644754;
        ot.klqc[316] = -1931529168;
        ot.klqc[317] = 383669306;
        ot.klqc[318] = -1173492762;
        ot.klqc[319] = 2088032042;
        ot.klqc[320] = -1897912500;
        ot.klqc[321] = -1028938600;
        ot.klqc[322] = -521529000;
        ot.klqc[323] = -728367845;
        ot.klqc[324] = 655177636;
        ot.klqc[325] = 1941408956;
        ot.klqc[326] = 561954685;
        ot.klqc[327] = 378678689;
        ot.klqc[328] = 706202227;
        ot.klqc[329] = 1568296616;
        ot.klqc[330] = -888355391;
        ot.klqc[331] = 691902193;
        ot.klqc[332] = -167762135;
        ot.klqc[333] = 1952558801;
        ot.klqc[334] = -669362692;
        ot.klqc[335] = -1018285984;
        ot.klqc[336] = -360645787;
        ot.klqc[337] = -487517075;
        ot.klqc[338] = 802557477;
        ot.klqc[339] = -350346135;
        ot.klqc[340] = -2071085096;
        ot.klqc[341] = 728236349;
        ot.klqc[342] = 1874198460;
        ot.klqc[343] = -1294177145;
        ot.klqc[344] = 552156501;
        ot.klqc[345] = 1501047333;
        ot.klqc[346] = 1328461678;
        ot.klqc[347] = 1762342094;
        ot.klqc[348] = -1273188272;
        ot.klqc[349] = 1794312970;
        ot.klqc[350] = 1198869336;
        ot.klqc[351] = -1514741675;
        ot.klqc[352] = 1232630377;
        ot.klqc[353] = -906769144;
        ot.klqc[354] = 1869027200;
        ot.klqc[355] = -1192468789;
        ot.klqc[356] = 1539511931;
        ot.klqc[357] = 534643868;
        ot.klqc[358] = 381639134;
        ot.klqc[359] = -799215562;
        ot.klqc[360] = -1353965047;
        ot.klqc[361] = -731985326;
        ot.klqc[362] = -2065890049;
        ot.klqc[363] = 336440851;
        ot.klqc[364] = -1649304912;
        ot.klqc[365] = 1261847474;
        ot.klqc[366] = -1927611137;
        ot.klqc[367] = 126315091;
        ot.klqc[368] = 1696181244;
        ot.klqc[369] = -918725284;
        ot.klqc[370] = 646324446;
        ot.klqc[371] = 76877496;
        ot.klqc[372] = 89079495;
        ot.klqc[373] = -363913492;
        ot.klqc[374] = -1111888289;
        ot.klqc[375] = 530857200;
        ot.klqc[376] = 925374906;
        ot.klqc[377] = 715856678;
        ot.klqc[378] = -1400307662;
        ot.klqc[379] = -49849371;
        ot.klqc[380] = -1290926572;
        ot.klqc[381] = 51523440;
        ot.klqc[382] = 489474644;
        ot.klqc[383] = -742742445;
        ot.klqc[384] = 846134442;
        ot.klqc[385] = 1168852608;
        ot.klqc[386] = -1266009930;
        ot.klqc[387] = 173215386;
        ot.klqc[388] = -1047224530;
        ot.klqc[389] = 1348801109;
        ot.klqc[390] = -674294756;
        ot.klqc[391] = -36238379;
        ot.klqc[392] = -1734114893;
        ot.klqc[393] = 191164778;
        ot.klqc[394] = 126243144;
        ot.klqc[395] = 900637738;
        ot.klqc[396] = 1065814128;
        ot.klqc[397] = -2040368343;
        ot.klqc[398] = -880824745;
        ot.klqc[399] = -613481151;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static double computeRotationDifference(ov var0, ov var1_1) {
        v0 /* !! */  = ot.so;
        if (true) ** GOTO lbl5
        block25: while (true) {
            v0 /* !! */  = (long)(ot.klqe("kmix", klqv(int ), (int)156) - ot.klqe("kmiw", klqv(int ), (int)155));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1271690800: {
                    break block25;
                }
                case 1033576532: {
                    continue block25;
                }
            }
            break;
        }
        var4_2 = ot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmiy", klqv(int ), (int)157)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ot.klqe("kmiz", klpy(int ), (int)225)) break;
            v1 /* !! */  = (long)ot.klqe("kmja", klpy(int ), (int)226);
        }
        var3_3 /* !! */  = ot.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmjb", klqv(int ), (int)158)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == ot.klqe("kmjc", klpy(int ), (int)227)) break;
                    v2 /* !! */  = (long)ot.klqe("kmjd", klpy(int ), (int)228);
                }
                var2_4 = ot.a;
                if (var4_2) {
                    throw null;
                    return (double)ot.klqe("kmjf", kmje(int ), (int)159);
                }
                if (var2_4 || var2_4) ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmjg", klqv(int ), (int)160)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ot.klqe("kmjh", klpy(int ), (int)229)) break;
                    v3 /* !! */  = (long)ot.klqe("kmji", klpy(int ), (int)230);
                }
                v4 = var0.getYaw();
                v5 /* !! */  = ot.so;
                if (true) ** GOTO lbl41
                block30: while (true) {
                    v5 /* !! */  = (long)(v6 - ot.klqe("kmjj", klqv(int ), (int)161));
lbl41:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1271690800: {
                            break block30;
                        }
                        case -622061926: {
                            v6 = ot.klqe("kmjk", klqv(int ), (int)162);
                            continue block30;
                        }
                        case 1183598682: {
                            v6 = ot.klqe("kmjl", klqv(int ), (int)163);
                            continue block30;
                        }
                        case 1243018353: {
                            v6 = ot.klqe("kmjm", klqv(int ), (int)164);
                            continue block30;
                        }
                    }
                    break;
                }
                v7 = var1_1.getYaw();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kmjn", klqv(int ), (int)165)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ot.klqe("kmjo", klpy(int ), (int)231)) break;
                    v8 /* !! */  = (long)ot.klqe("kmjp", klpy(int ), (int)232);
                }
                v9 = ot.computeAngleDifference(v4, v7);
                v10 /* !! */  = ot.so;
                if (true) ** GOTO lbl64
                block32: while (true) {
                    v10 /* !! */  = (long)(ot.klqe("kmjr", klqv(int ), (int)167) - ot.klqe("kmjq", klqv(int ), (int)166));
lbl64:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2121553314: {
                            continue block32;
                        }
                        case -1271690800: {
                            break block32;
                        }
                    }
                    break;
                }
                v11 = Math.abs(v9);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_4 = ot.so - ot.klqe("kmjs", klqv(int ), (int)168)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == ot.klqe("kmjt", klpy(int ), (int)233)) break;
                    v12 /* !! */  = (long)ot.klqe("kmju", klpy(int ), (int)234);
                }
                v13 = var0.getPitch();
                v14 /* !! */  = ot.so;
                if (true) ** GOTO lbl80
                block34: while (true) {
                    v14 /* !! */  = (long)(v15 - ot.klqe("kmjv", klqv(int ), (int)169));
lbl80:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -2123539885: {
                            v15 = ot.klqe("kmjw", klqv(int ), (int)170);
                            continue block34;
                        }
                        case -1271690800: {
                            break block34;
                        }
                        case -999226315: {
                            v15 = ot.klqe("kmjx", klqv(int ), (int)171);
                            continue block34;
                        }
                    }
                    break;
                }
                v16 = v13 - var1_1.getPitch();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_5 = ot.so - ot.klqe("kmjy", klqv(int ), (int)172)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ot.klqe("kmjz", klpy(int ), (int)235)) break;
                    v17 /* !! */  = (long)ot.klqe("kmka", klpy(int ), (int)236);
                }
                v18 = Math.abs(v16);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_6 = ot.so - ot.klqe("kmkb", klqv(int ), (int)173)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ot.klqe("kmkc", klpy(int ), (int)237)) break;
                    v19 /* !! */  = (long)ot.klqe("kmkd", klpy(int ), (int)238);
                }
                return Math.hypot(v11, v18);
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ot.klqe("kmke", klpy(int ), (int)239);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
            case 1: {
                var3_3 /* !! */  = (int)ot.klqe("kmkf", klpy(int ), (int)240);
                if (!var4_2) break;
                throw null;
            }
lbl112:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ot.klqe("kmkg", klpy(int ), (int)241);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        var3_3 /* !! */  = (int)ot.klqe("kmkh", klpy(int ), (int)242);
        ** while (!var4_2)
lbl119:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov getCurrentAngle() {
        v0 /* !! */  = ot.so;
        if (true) ** GOTO lbl5
        block10: while (true) {
            v0 /* !! */  = (long)(ot.klqe("kmyk", klqv(int ), (int)289) - ot.klqe("kmyj", klqv(int ), (int)288));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1271690800: {
                    break block10;
                }
                case 1064739002: {
                    continue block10;
                }
            }
            break;
        }
        var3_1 = ot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmyl", klqv(int ), (int)290)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ot.klqe("kmym", klpy(int ), (int)417)) break;
            v1 /* !! */  = (long)ot.klqe("kmyn", klpy(int ), (int)418);
        }
        var2_2 /* !! */  = ot.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmyo", klqv(int ), (int)291)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ot.klqe("kmyp", klpy(int ), (int)419)) break;
            v2 /* !! */  = (long)ot.klqe("kmyq", klpy(int ), (int)420);
        }
        var1_3 = ot.a;
        if (var3_1) {
            throw null;
lbl27:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl30:
        // 1 sources

        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmyr", klqv(int ), (int)292)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ot.klqe("kmys", klpy(int ), (int)421)) break;
                    v3 /* !! */  = (long)ot.klqe("kmyt", klpy(int ), (int)422);
                }
                return this.currentAngle;
            }
            case 0: {
                var2_2 /* !! */  = (int)ot.klqe("kmyu", klpy(int ), (int)423);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ot.klqe("kmyv", klpy(int ), (int)424);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ot.klqe("kmyw", klpy(int ), (int)425);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ot.klqe("kmyx", klpy(int ), (int)426);
        ** while (!var3_1)
lbl56:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void knao() {
        ot.klqc[100] = -2131820075;
        ot.klqc[101] = 746424398;
        ot.klqc[102] = 391123344;
        ot.klqc[103] = -310191140;
        ot.klqc[104] = -528955738;
        ot.klqc[105] = 189840609;
        ot.klqc[106] = -835530300;
        ot.klqc[107] = -1194347373;
        ot.klqc[108] = 664660660;
        ot.klqc[109] = -1352087346;
        ot.klqc[110] = 110313894;
        ot.klqc[111] = 337901349;
        ot.klqc[112] = -1964699071;
        ot.klqc[113] = 635023955;
        ot.klqc[114] = -628998304;
        ot.klqc[115] = -196770949;
        ot.klqc[116] = 852723968;
        ot.klqc[117] = -137477099;
        ot.klqc[118] = 683155597;
        ot.klqc[119] = 470520037;
        ot.klqc[120] = 1124968013;
        ot.klqc[121] = -1659993584;
        ot.klqc[122] = 380995354;
        ot.klqc[123] = 579717288;
        ot.klqc[124] = -691865105;
        ot.klqc[125] = 1567463384;
        ot.klqc[126] = 4356409;
        ot.klqc[127] = 1701668661;
        ot.klqc[128] = 1018583530;
        ot.klqc[129] = 1080917203;
        ot.klqc[130] = -1382002222;
        ot.klqc[131] = -2111036872;
        ot.klqc[132] = 2145952403;
        ot.klqc[133] = 317406033;
        ot.klqc[134] = -260325678;
        ot.klqc[135] = 1220742070;
        ot.klqc[136] = 1470639189;
        ot.klqc[137] = 753818787;
        ot.klqc[138] = -884664460;
        ot.klqc[139] = -1540517049;
        ot.klqc[140] = 1113981050;
        ot.klqc[141] = -797534249;
        ot.klqc[142] = -587247917;
        ot.klqc[143] = -526038276;
        ot.klqc[144] = 768233194;
        ot.klqc[145] = -996682144;
        ot.klqc[146] = 1717560903;
        ot.klqc[147] = 1445976227;
        ot.klqc[148] = -1392627675;
        ot.klqc[149] = 316141012;
        ot.klqc[150] = 1252608549;
        ot.klqc[151] = -454588898;
        ot.klqc[152] = 81598715;
        ot.klqc[153] = 626086273;
        ot.klqc[154] = -2047746942;
        ot.klqc[155] = 39359218;
        ot.klqc[156] = 855805779;
        ot.klqc[157] = 2121817985;
        ot.klqc[158] = 982409937;
        ot.klqc[159] = -1170435277;
        ot.klqc[160] = -1744570201;
        ot.klqc[161] = -1643451875;
        ot.klqc[162] = 1069383722;
        ot.klqc[163] = -1467271012;
        ot.klqc[164] = -333500295;
        ot.klqc[165] = 724074212;
        ot.klqc[166] = -170467426;
        ot.klqc[167] = 882829391;
        ot.klqc[168] = -1676363234;
        ot.klqc[169] = -807281838;
        ot.klqc[170] = -988766649;
        ot.klqc[171] = -454119165;
        ot.klqc[172] = -848707345;
        ot.klqc[173] = 1162937425;
        ot.klqc[174] = 1363970106;
        ot.klqc[175] = -1135915921;
        ot.klqc[176] = 1616985443;
        ot.klqc[177] = 590525781;
        ot.klqc[178] = 132162720;
        ot.klqc[179] = -182740417;
        ot.klqc[180] = 764494480;
        ot.klqc[181] = 701299084;
        ot.klqc[182] = 408627421;
        ot.klqc[183] = 1450016367;
        ot.klqc[184] = 859906033;
        ot.klqc[185] = 1040819283;
        ot.klqc[186] = 921696756;
        ot.klqc[187] = 1594216668;
        ot.klqc[188] = 1893817193;
        ot.klqc[189] = -1713677076;
        ot.klqc[190] = -504209367;
        ot.klqc[191] = 80163352;
        ot.klqc[192] = -730151032;
        ot.klqc[193] = 825962862;
        ot.klqc[194] = 1153683687;
        ot.klqc[195] = -1276061315;
        ot.klqc[196] = -1476249076;
        ot.klqc[197] = 779609340;
        ot.klqc[198] = -1781861660;
        ot.klqc[199] = 1211347076;
    }

    private static /* synthetic */ int klpy(int n2) {
        return klpz[n2] ^ klqc[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov getServerAngle() {
        v0 /* !! */  = ot.so;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - ot.klqe("kmzr", klqv(int ), (int)306));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1641486516: {
                    v1 = ot.klqe("kmzs", klqv(int ), (int)307);
                    continue block27;
                }
                case -1271690800: {
                    break block27;
                }
                case 1615784199: {
                    v1 = ot.klqe("kmzt", klqv(int ), (int)308);
                    continue block27;
                }
            }
            break;
        }
        var3_1 = ot.c;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl19
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - ot.klqe("kmzu", klqv(int ), (int)309));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1587302082: {
                    v3 = ot.klqe("kmzv", klqv(int ), (int)310);
                    continue block28;
                }
                case -1271690800: {
                    break block28;
                }
                case 1153093958: {
                    v3 = ot.klqe("kmzw", klqv(int ), (int)311);
                    continue block28;
                }
                case 1424388071: {
                    v3 = ot.klqe("kmzx", klqv(int ), (int)312);
                    continue block28;
                }
            }
            break;
        }
        var2_2 /* !! */  = ot.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ot.so;
                if (true) ** GOTO lbl39
                block29: while (true) {
                    v4 /* !! */  = (long)(v5 - ot.klqe("kmzy", klqv(int ), (int)313));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1727858484: {
                            v5 = ot.klqe("kmzz", klqv(int ), (int)314);
                            continue block29;
                        }
                        case -1497875529: {
                            v5 = ot.klqe("knaa", klqv(int ), (int)315);
                            continue block29;
                        }
                        case -1271690800: {
                            break block29;
                        }
                    }
                    break;
                }
                var1_3 = ot.a;
                if (var3_1) {
                    throw null;
                    return null;
                }
                if (var1_3 || var1_3) ** continue;
                v6 /* !! */  = ot.so;
                if (true) ** GOTO lbl58
                block31: while (true) {
                    v6 /* !! */  = (long)(v7 - ot.klqe("knab", klqv(int ), (int)316));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1912171438: {
                            v7 = ot.klqe("knac", klqv(int ), (int)317);
                            continue block31;
                        }
                        case -1271690800: {
                            break block31;
                        }
                        case -146287014: {
                            v7 = ot.klqe("knad", klqv(int ), (int)318);
                            continue block31;
                        }
                    }
                    break;
                }
                return this.serverAngle;
            }
lbl68:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ot.klqe("knae", klpy(int ), (int)433);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl79
                    break;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ot.klqe("knaf", klpy(int ), (int)434);
                } while (!var3_1);
                throw null;
            }
lbl79:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ot.klqe("knag", klpy(int ), (int)435);
                if (!var3_1) ** GOTO lbl68
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ot.klqe("knah", klpy(int ), (int)436);
        ** while (!var3_1)
lbl86:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void rotateTo(ou var1_1, nn var2_2, ds var3_3) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmfo", klqv(int ), (int)141)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ot.klqe("kmfp", klpy(int ), (int)153)) break;
            v0 /* !! */  = (long)ot.klqe("kmfq", klpy(int ), (int)154);
        }
        var6_4 = ot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmfr", klqv(int ), (int)142)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ot.klqe("kmfs", klpy(int ), (int)155)) break;
            v1 /* !! */  = (long)ot.klqe("kmft", klpy(int ), (int)156);
        }
        var5_5 /* !! */  = ot.b;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl17
        block28: while (true) {
            v2 /* !! */  = (long)(ot.klqe("kmfv", klqv(int ), (int)144) - ot.klqe("kmfu", klqv(int ), (int)143));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1271690800: {
                    break block28;
                }
                case -1209809413: {
                    continue block28;
                }
            }
            break;
        }
        var4_6 = ot.a;
        if (var5_5 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var5_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4) {
                    throw null;
lbl28:
                    // 2 sources

                    return;
                }
                if (var4_6 || var4_6) ** GOTO lbl28
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmfw", klqv(int ), (int)145)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ot.klqe("kmfx", klpy(int ), (int)157)) break;
                    v3 /* !! */  = (long)ot.klqe("kmfy", klpy(int ), (int)158);
                }
                v4 /* !! */  = ot.so;
                if (true) ** GOTO lbl40
                block31: while (true) {
                    v4 /* !! */  = (long)(ot.klqe("kmga", klqv(int ), (int)147) - ot.klqe("kmfz", klqv(int ), (int)146));
lbl40:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1271690800: {
                            break block31;
                        }
                        case 121117720: {
                            continue block31;
                        }
                    }
                    break;
                }
                v5 = ot.klqe("kmgb", klpy(int ), (int)159);
                v6 /* !! */  = ot.so;
                if (true) ** GOTO lbl50
                block32: while (true) {
                    v6 /* !! */  = (long)(v7 - ot.klqe("kmgc", klqv(int ), (int)148));
lbl50:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1271690800: {
                            break block32;
                        }
                        case -176272243: {
                            v7 = ot.klqe("kmgd", klqv(int ), (int)149);
                            continue block32;
                        }
                        case 535372715: {
                            v7 = ot.klqe("kmge", klqv(int ), (int)150);
                            continue block32;
                        }
                        case 1043351265: {
                            v7 = ot.klqe("kmgf", klqv(int ), (int)151);
                            continue block32;
                        }
                    }
                    break;
                }
                v8 = var2_2.getPriority();
                v9 /* !! */  = ot.so;
                if (true) ** GOTO lbl67
                block33: while (true) {
                    v9 /* !! */  = (long)(ot.klqe("kmgh", klqv(int ), (int)153) - ot.klqe("kmgg", klqv(int ), (int)152));
lbl67:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1818815773: {
                            continue block33;
                        }
                        case -1271690800: {
                            break block33;
                        }
                    }
                    break;
                }
                v10 = new no$Task<ou>((int)v5, v8, var3_3, var1_1);
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kmgi", klqv(int ), (int)154)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ot.klqe("kmgj", klpy(int ), (int)160)) break;
                    v11 /* !! */  = (long)ot.klqe("kmgk", klpy(int ), (int)161);
                }
                this.rotationPlanTaskProcessor.addTask(v10);
                if (var4_6 || var4_6) ** continue;
                return;
            }
lbl81:
            // 2 sources

            case 0: {
                var5_5 /* !! */  = (int)ot.klqe("kmgl", klpy(int ), (int)162);
                if (var6_4) {
                    throw null;
                }
                ** GOTO lbl91
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_5 /* !! */  = (int)ot.klqe("kmgm", klpy(int ), (int)163);
                    if (!var6_4) break block4;
                    throw null;
                }
            }
lbl91:
            // 2 sources

            case 2: {
                var5_5 /* !! */  = (int)ot.klqe("kmgn", klpy(int ), (int)164);
                if (!var6_4) ** GOTO lbl81
                throw null;
            }
            case 3: {
                var5_5 /* !! */  = (int)ot.klqe("kmgo", klpy(int ), (int)165);
                if (!var6_4) break;
                throw null;
            }
            case 4: {
                do {
                    var5_5 /* !! */  = (int)ot.klqe("kmgp", klpy(int ), (int)166);
                } while (!var6_4);
                throw null;
            }
            case 5: 
        }
        var5_5 /* !! */  = (int)ot.klqe("kmgq", klpy(int ), (int)167);
        ** while (!var6_4)
lbl107:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite klqe(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void rotateTo(ov$VecRotation var1_1, class_1309 var2_2, int var3_3, os var4_4, nn var5_5, ds var6_6) {
        v0 /* !! */  = ot.so;
        if (true) ** GOTO lbl5
        block36: while (true) {
            v0 /* !! */  = (long)(v1 - ot.klqe("kmco", klqv(int ), (int)100));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1599429447: {
                    v1 = ot.klqe("kmcp", klqv(int ), (int)101);
                    continue block36;
                }
                case -1271690800: {
                    break block36;
                }
                case -1064740155: {
                    v1 = ot.klqe("kmcq", klqv(int ), (int)102);
                    continue block36;
                }
            }
            break;
        }
        var9_7 = ot.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmcr", klqv(int ), (int)103)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ot.klqe("kmcs", klpy(int ), (int)116)) break;
            v2 /* !! */  = (long)ot.klqe("kmct", klpy(int ), (int)117);
        }
        var8_8 /* !! */  = ot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmcu", klqv(int ), (int)104)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ot.klqe("kmcv", klpy(int ), (int)118)) break;
            v3 /* !! */  = (long)ot.klqe("kmcw", klpy(int ), (int)119);
        }
        var7_9 = ot.a;
        if (var9_7) {
            throw null;
lbl31:
            // 2 sources

            return;
        }
        if (var7_9 || var7_9) ** GOTO lbl31
        if (var8_8 /* !! */  == 0) ** GOTO lbl-1000
        switch (var8_8 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v4 /* !! */  = ot.so;
                if (true) ** GOTO lbl41
                block40: while (true) {
                    v4 /* !! */  = (long)(v5 - ot.klqe("kmcx", klqv(int ), (int)105));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1901259836: {
                            v5 = ot.klqe("kmcy", klqv(int ), (int)106);
                            continue block40;
                        }
                        case -1893252700: {
                            v5 = ot.klqe("kmcz", klqv(int ), (int)107);
                            continue block40;
                        }
                        case -1858040010: {
                            v5 = ot.klqe("kmda", klqv(int ), (int)108);
                            continue block40;
                        }
                        case -1271690800: {
                            break block40;
                        }
                    }
                    break;
                }
                v6 = var1_1.getAngle();
                v7 /* !! */  = ot.so;
                if (true) ** GOTO lbl58
                block41: while (true) {
                    v7 /* !! */  = (long)(v8 - ot.klqe("kmdb", klqv(int ), (int)109));
lbl58:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1290887391: {
                            v8 = ot.klqe("kmdc", klqv(int ), (int)110);
                            continue block41;
                        }
                        case -1271690800: {
                            break block41;
                        }
                        case 803190778: {
                            v8 = ot.klqe("kmdd", klqv(int ), (int)111);
                            continue block41;
                        }
                        case 1975701503: {
                            v8 = ot.klqe("kmde", klqv(int ), (int)112);
                            continue block41;
                        }
                    }
                    break;
                }
                v9 = var1_1.getVec();
                v10 /* !! */  = ot.so;
                if (true) ** GOTO lbl75
                block42: while (true) {
                    v10 /* !! */  = (long)(v11 - ot.klqe("kmdf", klqv(int ), (int)113));
lbl75:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1271690800: {
                            break block42;
                        }
                        case 353281702: {
                            v11 = ot.klqe("kmdg", klqv(int ), (int)114);
                            continue block42;
                        }
                        case 728874895: {
                            v11 = ot.klqe("kmdh", klqv(int ), (int)115);
                            continue block42;
                        }
                        case 1147466809: {
                            v11 = ot.klqe("kmdi", klqv(int ), (int)116);
                            continue block42;
                        }
                    }
                    break;
                }
                v12 = var4_4.createRotationPlan(v6, v9, (class_1297)var2_2, var3_3);
                v13 /* !! */  = ot.so;
                if (true) ** GOTO lbl92
                block43: while (true) {
                    v13 /* !! */  = (long)(v14 - ot.klqe("kmdj", klqv(int ), (int)117));
lbl92:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1271690800: {
                            break block43;
                        }
                        case -1244705913: {
                            v14 = ot.klqe("kmdk", klqv(int ), (int)118);
                            continue block43;
                        }
                        case -375193653: {
                            v14 = ot.klqe("kmdl", klqv(int ), (int)119);
                            continue block43;
                        }
                    }
                    break;
                }
                this.rotateTo(v12, var5_5, var6_6);
                if (var7_9 || var7_9) ** continue;
                return;
            }
            case 0: {
                var8_8 /* !! */  = (int)ot.klqe("kmdm", klpy(int ), (int)120);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 1: {
                var8_8 /* !! */  = (int)ot.klqe("kmdn", klpy(int ), (int)121);
                if (var9_7) {
                    throw null;
                }
                ** GOTO lbl118
            }
lbl114:
            // 3 sources

            case 2: {
                var8_8 /* !! */  = (int)ot.klqe("kmdo", klpy(int ), (int)122);
                if (!var9_7) break;
                throw null;
            }
lbl118:
            // 2 sources

            case 3: {
                var8_8 /* !! */  = (int)ot.klqe("kmdp", klpy(int ), (int)123);
                if (!var9_7) ** GOTO lbl114
                throw null;
            }
lbl122:
            // 2 sources

            case 4: {
                var8_8 /* !! */  = (int)ot.klqe("kmdq", klpy(int ), (int)124);
                if (!var9_7) ** GOTO lbl114
                throw null;
            }
            case 5: 
        }
        do {
            var8_8 /* !! */  = (int)ot.klqe("kmdr", klpy(int ), (int)125);
        } while (!var9_7);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ou getLastRotationPlan() {
        v0 /* !! */  = ot.so;
        if (true) ** GOTO lbl5
        block17: while (true) {
            v0 /* !! */  = (long)(v1 - ot.klqe("kmxc", klqv(int ), (int)273));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1873660114: {
                    v1 = ot.klqe("kmxd", klqv(int ), (int)274);
                    continue block17;
                }
                case -1442324317: {
                    v1 = ot.klqe("kmxe", klqv(int ), (int)275);
                    continue block17;
                }
                case -1271690800: {
                    break block17;
                }
                case 748978832: {
                    v1 = ot.klqe("kmxf", klqv(int ), (int)276);
                    continue block17;
                }
            }
            break;
        }
        var3_1 = ot.c;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl22
        block18: while (true) {
            v2 /* !! */  = (long)(v3 - ot.klqe("kmxg", klqv(int ), (int)277));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1271690800: {
                    break block18;
                }
                case -426224552: {
                    v3 = ot.klqe("kmxh", klqv(int ), (int)278);
                    continue block18;
                }
                case -201368305: {
                    v3 = ot.klqe("kmxi", klqv(int ), (int)279);
                    continue block18;
                }
            }
            break;
        }
        var2_2 /* !! */  = ot.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmxj", klqv(int ), (int)280)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == ot.klqe("kmxk", klpy(int ), (int)399)) break;
            v4 /* !! */  = (long)ot.klqe("kmxl", klpy(int ), (int)400);
        }
        var1_3 = ot.a;
        if (var3_1) {
            throw null;
lbl41:
            // 2 sources

            return null;
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmxm", klqv(int ), (int)281)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == ot.klqe("kmxn", klpy(int ), (int)401)) break;
                    v5 /* !! */  = (long)ot.klqe("kmxo", klpy(int ), (int)402);
                }
                return this.lastRotationPlan;
            }
lbl55:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ot.klqe("kmxp", klpy(int ), (int)403);
                if (!var3_1) break;
                throw null;
            }
            case 1: {
                var2_2 /* !! */  = (int)ot.klqe("kmxq", klpy(int ), (int)404);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ot.klqe("kmxr", klpy(int ), (int)405);
                if (!var3_1) ** GOTO lbl55
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ot.klqe("kmxs", klpy(int ), (int)406);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ long klqv(int n2) {
        return klqw[n2] ^ klqy[n2];
    }

    private static /* synthetic */ void knal() {
        ot.klpz[300] = 1205975675;
        ot.klpz[301] = 1935834256;
        ot.klpz[302] = -1307846903;
        ot.klpz[303] = 668320934;
        ot.klpz[304] = 1386474376;
        ot.klpz[305] = -636853059;
        ot.klpz[306] = 652301105;
        ot.klpz[307] = -920401909;
        ot.klpz[308] = -4510403;
        ot.klpz[309] = 258534300;
        ot.klpz[310] = -370852029;
        ot.klpz[311] = -1037775023;
        ot.klpz[312] = 1484577943;
        ot.klpz[313] = -914155989;
        ot.klpz[314] = -1216506161;
        ot.klpz[315] = -1413644762;
        ot.klpz[316] = -1931529167;
        ot.klpz[317] = 383669307;
        ot.klpz[318] = -1173492768;
        ot.klpz[319] = 2088032034;
        ot.klpz[320] = -1897912503;
        ot.klpz[321] = -1028938604;
        ot.klpz[322] = -521528997;
        ot.klpz[323] = -728367843;
        ot.klpz[324] = 655177635;
        ot.klpz[325] = 1941408949;
        ot.klpz[326] = 561954684;
        ot.klpz[327] = -2056633893;
        ot.klpz[328] = 706202226;
        ot.klpz[329] = -1940851261;
        ot.klpz[330] = -888355392;
        ot.klpz[331] = 187498407;
        ot.klpz[332] = -167762136;
        ot.klpz[333] = 1202706324;
        ot.klpz[334] = -669362698;
        ot.klpz[335] = -1018285979;
        ot.klpz[336] = -360645777;
        ot.klpz[337] = -487517077;
        ot.klpz[338] = 802557478;
        ot.klpz[339] = -350346144;
        ot.klpz[340] = -2071085093;
        ot.klpz[341] = 728236344;
        ot.klpz[342] = 1874198462;
        ot.klpz[343] = -1294177137;
        ot.klpz[344] = 552156498;
        ot.klpz[345] = 1501047335;
        ot.klpz[346] = 1328461679;
        ot.klpz[347] = -2143708913;
        ot.klpz[348] = -1273188272;
        ot.klpz[349] = 1794312971;
        ot.klpz[350] = 574220884;
        ot.klpz[351] = 1514741674;
        ot.klpz[352] = -128133808;
        ot.klpz[353] = -906769142;
        ot.klpz[354] = 1869027201;
        ot.klpz[355] = 1914657212;
        ot.klpz[356] = 1539511930;
        ot.klpz[357] = 534643866;
        ot.klpz[358] = 381639133;
        ot.klpz[359] = -799215565;
        ot.klpz[360] = -1353965043;
        ot.klpz[361] = -731985317;
        ot.klpz[362] = -2065890058;
        ot.klpz[363] = 336440853;
        ot.klpz[364] = -1649304909;
        ot.klpz[365] = 1261847482;
        ot.klpz[366] = -1927611137;
        ot.klpz[367] = 126315090;
        ot.klpz[368] = 1696181240;
        ot.klpz[369] = -918725303;
        ot.klpz[370] = 646324439;
        ot.klpz[371] = 76877491;
        ot.klpz[372] = 89079492;
        ot.klpz[373] = -363913474;
        ot.klpz[374] = -1111888300;
        ot.klpz[375] = 530857213;
        ot.klpz[376] = 925374890;
        ot.klpz[377] = 715856701;
        ot.klpz[378] = -1400307678;
        ot.klpz[379] = -49849346;
        ot.klpz[380] = -1290926579;
        ot.klpz[381] = 51523438;
        ot.klpz[382] = 489474624;
        ot.klpz[383] = -742742464;
        ot.klpz[384] = 846134433;
        ot.klpz[385] = 1168852622;
        ot.klpz[386] = -1266009939;
        ot.klpz[387] = 173215370;
        ot.klpz[388] = -1047224525;
        ot.klpz[389] = 1348801116;
        ot.klpz[390] = -674294760;
        ot.klpz[391] = -36238393;
        ot.klpz[392] = -1734114881;
        ot.klpz[393] = 191164769;
        ot.klpz[394] = 126243164;
        ot.klpz[395] = 900637743;
        ot.klpz[396] = 1065814141;
        ot.klpz[397] = -2040368332;
        ot.klpz[398] = -880824759;
        ot.klpz[399] = -613481152;
    }

    private static /* synthetic */ void knaw() {
        ot.klqy[0] = -3207200695131177397L;
        ot.klqy[1] = -8394523669048469440L;
        ot.klqy[2] = -5685884955167207493L;
        ot.klqy[3] = -1180302270289089740L;
        ot.klqy[4] = -5083519920159619188L;
        ot.klqy[5] = 7955606847874545467L;
        ot.klqy[6] = 255213165971074015L;
        ot.klqy[7] = -2319748216548585789L;
        ot.klqy[8] = 4379344382052860214L;
        ot.klqy[9] = -8097429333267292512L;
        ot.klqy[10] = -3909266622169563715L;
        ot.klqy[11] = -8804672358622469275L;
        ot.klqy[12] = -1460374176788238141L;
        ot.klqy[13] = 9084419852184051701L;
        ot.klqy[14] = -783668015471427172L;
        ot.klqy[15] = 7262055898279282463L;
        ot.klqy[16] = 3230572756205412890L;
        ot.klqy[17] = -8575683861700293795L;
        ot.klqy[18] = -6166562639597738388L;
        ot.klqy[19] = -7230675780810473664L;
        ot.klqy[20] = -6302412168263258869L;
        ot.klqy[21] = -1945228968243411957L;
        ot.klqy[22] = 7352187198073129663L;
        ot.klqy[23] = 1165754581124887192L;
        ot.klqy[24] = 3293938154431770934L;
        ot.klqy[25] = -7799703159958543049L;
        ot.klqy[26] = -6072509949708170725L;
        ot.klqy[27] = -2762473861666737967L;
        ot.klqy[28] = 9197263652437249760L;
        ot.klqy[29] = -8788760593695093681L;
        ot.klqy[30] = -2897988734121063876L;
        ot.klqy[31] = 800104743273770231L;
        ot.klqy[32] = -4058922341945702232L;
        ot.klqy[33] = -8462892937710565019L;
        ot.klqy[34] = 8569013541062933328L;
        ot.klqy[35] = -1243081749071137489L;
        ot.klqy[36] = 3963312403712416392L;
        ot.klqy[37] = -1541951481714463636L;
        ot.klqy[38] = 6597186002231427127L;
        ot.klqy[39] = -2782041945460857119L;
        ot.klqy[40] = -5389208593610130481L;
        ot.klqy[41] = 4727723432834604820L;
        ot.klqy[42] = 1042524332921856622L;
        ot.klqy[43] = 9132765827094476077L;
        ot.klqy[44] = 1023233073214574084L;
        ot.klqy[45] = -7559350724895130356L;
        ot.klqy[46] = 8718591271450840457L;
        ot.klqy[47] = 5813340386705112628L;
        ot.klqy[48] = -4833693799446184185L;
        ot.klqy[49] = 1714988395016414299L;
        ot.klqy[50] = -5587713766018191832L;
        ot.klqy[51] = 133810861142268629L;
        ot.klqy[52] = 2639638698089296388L;
        ot.klqy[53] = -5199568316563778736L;
        ot.klqy[54] = -8221205879988863183L;
        ot.klqy[55] = 3822053806042908306L;
        ot.klqy[56] = 695897271785548961L;
        ot.klqy[57] = 5076051793489383165L;
        ot.klqy[58] = 2998492490937233188L;
        ot.klqy[59] = 4858207915675996925L;
        ot.klqy[60] = 1546041739555259255L;
        ot.klqy[61] = 4534004708765018362L;
        ot.klqy[62] = -9125808261740983102L;
        ot.klqy[63] = 1635681925799988663L;
        ot.klqy[64] = 6131325150421216215L;
        ot.klqy[65] = 5296331582439536358L;
        ot.klqy[66] = -8481123001176405793L;
        ot.klqy[67] = -2019151952470671486L;
        ot.klqy[68] = 4392274211861880895L;
        ot.klqy[69] = 1966074654887950167L;
        ot.klqy[70] = 4307381798889482888L;
        ot.klqy[71] = -1462337685520512531L;
        ot.klqy[72] = 2347975353738365600L;
        ot.klqy[73] = 3147978193329171614L;
        ot.klqy[74] = -7210615162157893052L;
        ot.klqy[75] = 5249149648159416181L;
        ot.klqy[76] = -6240587663370549579L;
        ot.klqy[77] = -5500016646570594567L;
        ot.klqy[78] = 277385088136895985L;
        ot.klqy[79] = -7337892756307934456L;
        ot.klqy[80] = -8596228322497789830L;
        ot.klqy[81] = 869360819896147396L;
        ot.klqy[82] = -2860478236247294639L;
        ot.klqy[83] = 6295890135268843144L;
        ot.klqy[84] = -4474438660301406812L;
        ot.klqy[85] = 2041298517884538776L;
        ot.klqy[86] = -651464059785428116L;
        ot.klqy[87] = 4356521117862041929L;
        ot.klqy[88] = -439707626326633595L;
        ot.klqy[89] = -3115116919703212951L;
        ot.klqy[90] = -5257757920905537034L;
        ot.klqy[91] = 4667646920901165988L;
        ot.klqy[92] = -2212010783469920665L;
        ot.klqy[93] = 6411970728011401417L;
        ot.klqy[94] = -2099103305174479569L;
        ot.klqy[95] = -271370070619220548L;
        ot.klqy[96] = 7853382979203326891L;
        ot.klqy[97] = -1637795772858325995L;
        ot.klqy[98] = 5814420678819516773L;
        ot.klqy[99] = -7594659282650694928L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        v0 /* !! */  = ot.so;
        if (true) ** GOTO lbl5
        block42: while (true) {
            v0 /* !! */  = (long)(ot.klqe("kmug", klqv(int ), (int)252) - ot.klqe("kmuf", klqv(int ), (int)251));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1271690800: {
                    break block42;
                }
                case 702080310: {
                    continue block42;
                }
            }
            break;
        }
        var4_2 = ot.c;
        v1 /* !! */  = ot.so;
        if (true) ** GOTO lbl15
        block43: while (true) {
            v1 /* !! */  = (long)(v2 - ot.klqe("kmuh", klqv(int ), (int)253));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1271690800: {
                    break block43;
                }
                case 624163704: {
                    v2 = ot.klqe("kmui", klqv(int ), (int)254);
                    continue block43;
                }
                case 1638565142: {
                    v2 = ot.klqe("kmuj", klqv(int ), (int)255);
                    continue block43;
                }
            }
            break;
        }
        var3_3 /* !! */  = ot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmuk", klqv(int ), (int)256)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ot.klqe("kmul", klpy(int ), (int)346)) break;
            v3 /* !! */  = (long)ot.klqe("kmum", klpy(int ), (int)347);
        }
        var2_4 = ot.a;
        if (!var4_2) ** GOTO lbl37
        throw null;
lbl-1000:
        // 4 sources

        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl37:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl-1000
                v4 /* !! */  = ot.so;
                if (true) ** GOTO lbl42
                block46: while (true) {
                    v4 /* !! */  = (long)(v5 - ot.klqe("kmun", klqv(int ), (int)257));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1271690800: {
                            break block46;
                        }
                        case -247044878: {
                            v5 = ot.klqe("kmuo", klqv(int ), (int)258);
                            continue block46;
                        }
                        case 252539923: {
                            v5 = ot.klqe("kmup", klqv(int ), (int)259);
                            continue block46;
                        }
                        case 1535636356: {
                            v5 = ot.klqe("kmuq", klqv(int ), (int)260);
                            continue block46;
                        }
                    }
                    break;
                }
                v6 = ot.klqe("kmur", klpy(int ), (int)348);
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmus", klqv(int ), (int)261)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ot.klqe("kmut", klpy(int ), (int)349)) break;
                    v7 /* !! */  = (long)ot.klqe("kmuu", klpy(int ), (int)350);
                }
                v8 = new da((byte)v6);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmuv", klqv(int ), (int)262)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ot.klqe("kmuw", klpy(int ), (int)351)) break;
                    v9 /* !! */  = (long)ot.klqe("kmux", klpy(int ), (int)352);
                }
                ax.callEvent(v8);
                if (var2_4 || var2_4) ** GOTO lbl-1000
                v10 /* !! */  = ot.so;
                if (true) ** GOTO lbl72
                block49: while (true) {
                    v10 /* !! */  = (long)(v11 - ot.klqe("kmuy", klqv(int ), (int)263));
lbl72:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1271690800: {
                            break block49;
                        }
                        case -870370947: {
                            v11 = ot.klqe("kmuz", klqv(int ), (int)264);
                            continue block49;
                        }
                        case -41365606: {
                            v11 = ot.klqe("kmva", klqv(int ), (int)265);
                            continue block49;
                        }
                        case 1976241735: {
                            v11 = ot.klqe("kmvb", klqv(int ), (int)266);
                            continue block49;
                        }
                    }
                    break;
                }
                this.update();
                if (var2_4 || var2_4) ** GOTO lbl-1000
                v12 /* !! */  = ot.so;
                if (true) ** GOTO lbl90
                block50: while (true) {
                    v12 /* !! */  = (long)(v13 - ot.klqe("kmvc", klqv(int ), (int)267));
lbl90:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1271690800: {
                            break block50;
                        }
                        case 1340257797: {
                            v13 = ot.klqe("kmvd", klqv(int ), (int)268);
                            continue block50;
                        }
                        case 1775138087: {
                            v13 = ot.klqe("kmve", klqv(int ), (int)269);
                            continue block50;
                        }
                    }
                    break;
                }
                v14 = ot.klqe("kmvf", klpy(int ), (int)353);
                v15 /* !! */  = ot.so;
                if (true) ** GOTO lbl104
                block51: while (true) {
                    v15 /* !! */  = (long)(ot.klqe("kmvh", klqv(int ), (int)271) - ot.klqe("kmvg", klqv(int ), (int)270));
lbl104:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1271690800: {
                            break block51;
                        }
                        case 46757368: {
                            continue block51;
                        }
                    }
                    break;
                }
                v16 = new da((byte)v14);
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kmvi", klqv(int ), (int)272)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ot.klqe("kmvj", klpy(int ), (int)354)) break;
                    v17 /* !! */  = (long)ot.klqe("kmvk", klpy(int ), (int)355);
                }
                ax.callEvent(v16);
                if (var2_4 || var2_4) continue block45;
                return;
lbl118:
                // 2 sources

                case 0: {
                    do {
                        var3_3 /* !! */  = (int)ot.klqe("kmvl", klpy(int ), (int)356);
                    } while (!var4_2);
                    throw null;
                }
lbl123:
                // 2 sources

                case 1: {
                    var3_3 /* !! */  = (int)ot.klqe("kmvm", klpy(int ), (int)357);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl137
                }
                case 2: {
                    var3_3 /* !! */  = (int)ot.klqe("kmvn", klpy(int ), (int)358);
                    if (!var4_2) break block45;
                    throw null;
                }
                case 3: {
                    var3_3 /* !! */  = (int)ot.klqe("kmvo", klpy(int ), (int)359);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl141
                }
lbl137:
                // 3 sources

                case 4: {
                    var3_3 /* !! */  = (int)ot.klqe("kmvp", klpy(int ), (int)360);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl141:
                // 4 sources

                case 5: {
                    var3_3 /* !! */  = (int)ot.klqe("kmvq", klpy(int ), (int)361);
                    if (!var4_2) ** GOTO lbl118
                    throw null;
                }
                case 6: {
                    do {
                        var3_3 /* !! */  = (int)ot.klqe("kmvr", klpy(int ), (int)362);
                    } while (!var4_2);
                    throw null;
                }
                case 7: {
                    var3_3 /* !! */  = (int)ot.klqe("kmvs", klpy(int ), (int)363);
                    if (!var4_2) ** GOTO lbl123
                    throw null;
                }
                case 8: {
                    var3_3 /* !! */  = (int)ot.klqe("kmvt", klpy(int ), (int)364);
                    if (!var4_2) ** GOTO lbl137
                    throw null;
                }
                case 9: 
            }
        }
        do {
            var3_3 /* !! */  = (int)ot.klqe("kmvu", klpy(int ), (int)365);
        } while (!var4_2);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void update() {
        var9_1 = ot.c;
        var8_2 /* !! */  = ot.b;
        var7_3 = ot.a;
        if (var9_1) {
            throw null;
        }
        if (var7_3 || var7_3) return;
        var1_4 = this.rotationPlanTaskProcessor.fetchActiveTaskValue();
        if (var7_3 || var7_3) return;
        if (var1_4 == null) {
            if (var7_3) return;
            v0 = ot.klqe("kmgr", klpy(int ), (int)168);
            if (var9_1) {
                throw null;
            }
        } else {
            if (var7_3 || var7_3) return;
            v0 = var2_5 = ot.klqe("kmgs", klpy(int ), (int)169);
        }
        if (var7_3 || var7_3) return;
        if (var2_5 != false) {
            if (var7_3) return;
            v1 = this.lastRotationPlan;
            if (var9_1) {
                throw null;
            }
        } else {
            if (var7_3 || var7_3) return;
            v1 = var3_6 = var1_4;
        }
        if (var7_3 || var7_3) return;
        if (var3_6 == null) {
            if (var7_3 || var7_3) return;
            return;
        }
        if (var7_3 || var7_3) return;
        var4_7 = new ov(ot.mc.field_1724.method_36454(), ot.mc.field_1724.method_36455());
        if (var7_3 || var7_3) return;
        if (this.lastRotationPlan != null) {
            if (var7_3) return;
            if (var2_5 != false) {
                if (var7_3 || var7_3) return;
                var5_8 = ot.computeRotationDifference(this.serverAngle, var4_7);
                if (var7_3 || var7_3) return;
                if (var3_6.getTicksUntilReset() <= this.rotationPlanTaskProcessor.tickCounter) {
                    if (var7_3) return;
                    if (var5_8 < 1.0) {
                        if (var7_3 || var7_3) return;
                        this.setRotation(null);
                        if (var7_3 || var7_3) return;
                        this.lastRotationPlan = null;
                        if (var7_3 || var7_3) return;
                        this.rotationPlanTaskProcessor.tickCounter = (int)ot.klqe("kmgt", klpy(int ), (int)170);
                        if (var7_3 || var7_3) return;
                        return;
                    }
                }
            }
        }
        if (var7_3 || var7_3) return;
        if (this.currentAngle != null) {
            v2 = this.currentAngle;
            if (var9_1) {
                throw null;
            }
        } else {
            v2 = var4_7;
        }
        var5_9 = var3_6.nextRotation(v2, (boolean)var2_5);
        if (var7_3 || var7_3) return;
        if (!var3_6.getAngleSmooth().skipSensitivityAdjust()) {
            if (var7_3 || var7_3) return;
            var5_9 = var5_9.adjustSensitivity();
            if (var7_3) return;
        }
        if (var7_3 || var7_3) return;
        this.setRotation(var5_9);
        if (var7_3) return;
        if (var8_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block55: while (true) {
            block135: {
                switch (cfr_temp_0 == -2147483648 ? var8_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var7_3) return;
                        this.lastRotationPlan = var3_6;
                        if (var7_3 || var7_3) return;
                        this.rotationPlanTaskProcessor.tick((int)ot.klqe("kmgu", klpy(int ), (int)171));
                        if (!var7_3 && !var7_3) return;
                        return;
                    }
                    case 2: {
                        var8_2 /* !! */  = (int)ot.klqe("kmgx", klpy(int ), (int)174);
                        cfr_temp_0 = 0;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 6: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhb", klpy(int ), (int)178);
                        cfr_temp_0 = 17;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 8: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhd", klpy(int ), (int)180);
                        cfr_temp_0 = 40;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 10: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhf", klpy(int ), (int)182);
                        cfr_temp_0 = 35;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 12: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhh", klpy(int ), (int)184);
                        cfr_temp_0 = 38;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 13: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhi", klpy(int ), (int)185);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 4: {
                        ** GOTO lbl283
                    }
                    case 16: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhl", klpy(int ), (int)188);
                        cfr_temp_0 = 19;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 17: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhm", klpy(int ), (int)189);
                        cfr_temp_0 = 28;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 20: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhp", klpy(int ), (int)192);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 11: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhg", klpy(int ), (int)183);
                        cfr_temp_0 = 14;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 21: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhq", klpy(int ), (int)193);
                        cfr_temp_0 = 37;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 22: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhr", klpy(int ), (int)194);
                        cfr_temp_0 = 46;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 24: {
                        var8_2 /* !! */  = (int)ot.klqe("kmht", klpy(int ), (int)196);
                        cfr_temp_0 = 51;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 25: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhu", klpy(int ), (int)197);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 19: {
                        var8_2 /* !! */  = (int)ot.klqe("kmho", klpy(int ), (int)191);
                        cfr_temp_0 = 44;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 30: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhz", klpy(int ), (int)202);
                        cfr_temp_0 = 37;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 32: {
                        var8_2 /* !! */  = (int)ot.klqe("kmib", klpy(int ), (int)204);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        var8_2 /* !! */  = (int)ot.klqe("kmgv", klpy(int ), (int)172);
                        cfr_temp_0 = 3;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 33: {
                        var8_2 /* !! */  = (int)ot.klqe("kmic", klpy(int ), (int)205);
                        cfr_temp_0 = 28;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 35: {
                        var8_2 /* !! */  = (int)ot.klqe("kmie", klpy(int ), (int)207);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 34: {
                        var8_2 /* !! */  = (int)ot.klqe("kmid", klpy(int ), (int)206);
                        cfr_temp_0 = 23;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 39: {
                        var8_2 /* !! */  = (int)ot.klqe("kmii", klpy(int ), (int)211);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 40: {
                        var8_2 /* !! */  = (int)ot.klqe("kmij", klpy(int ), (int)212);
                        cfr_temp_0 = 51;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 41: {
                        var8_2 /* !! */  = (int)ot.klqe("kmik", klpy(int ), (int)213);
                        cfr_temp_0 = 26;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 43: {
                        var8_2 /* !! */  = (int)ot.klqe("kmim", klpy(int ), (int)215);
                        cfr_temp_0 = 26;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 45: {
                        var8_2 /* !! */  = (int)ot.klqe("kmio", klpy(int ), (int)217);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 1: {
                        var8_2 /* !! */  = (int)ot.klqe("kmgw", klpy(int ), (int)173);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 7: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhc", klpy(int ), (int)179);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 26: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhv", klpy(int ), (int)198);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 14: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhj", klpy(int ), (int)186);
                        cfr_temp_0 = 5;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 46: {
                        var8_2 /* !! */  = (int)ot.klqe("kmip", klpy(int ), (int)218);
                        cfr_temp_0 = 28;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 47: {
                        var8_2 /* !! */  = (int)ot.klqe("kmiq", klpy(int ), (int)219);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 37: {
                        var8_2 /* !! */  = (int)ot.klqe("kmig", klpy(int ), (int)209);
                        cfr_temp_0 = 5;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 49: {
                        var8_2 /* !! */  = (int)ot.klqe("kmis", klpy(int ), (int)221);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 29: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhy", klpy(int ), (int)201);
                        cfr_temp_0 = 51;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 50: {
                        var8_2 /* !! */  = (int)ot.klqe("kmit", klpy(int ), (int)222);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 27: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhw", klpy(int ), (int)199);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 31: {
                        var8_2 /* !! */  = (int)ot.klqe("kmia", klpy(int ), (int)203);
                        cfr_temp_0 = 44;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 52: {
                        var8_2 /* !! */  = (int)ot.klqe("kmiv", klpy(int ), (int)224);
                        if (var9_1) {
                            throw null;
                        }
lbl283:
                        // 3 sources

                        var8_2 /* !! */  = (int)ot.klqe("kmgz", klpy(int ), (int)176);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 38: {
                        var8_2 /* !! */  = (int)ot.klqe("kmih", klpy(int ), (int)210);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 9: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhe", klpy(int ), (int)181);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 42: {
                        var8_2 /* !! */  = (int)ot.klqe("kmil", klpy(int ), (int)214);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 23: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhs", klpy(int ), (int)195);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 51: {
                        var8_2 /* !! */  = (int)ot.klqe("kmiu", klpy(int ), (int)223);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var8_2 /* !! */  = (int)ot.klqe("kmha", klpy(int ), (int)177);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var8_2 /* !! */  = (int)ot.klqe("kmgy", klpy(int ), (int)175);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 28: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhx", klpy(int ), (int)200);
                        cfr_temp_0 = 18;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 15: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhk", klpy(int ), (int)187);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 36: {
                        var8_2 /* !! */  = (int)ot.klqe("kmif", klpy(int ), (int)208);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 18: {
                        var8_2 /* !! */  = (int)ot.klqe("kmhn", klpy(int ), (int)190);
                        cfr_temp_0 = 15;
                        if (var9_1) {
                            throw null;
                        }
                        break block135;
                    }
                    case 44: {
                        var8_2 /* !! */  = (int)ot.klqe("kmin", klpy(int ), (int)216);
                        if (var9_1) {
                            throw null;
                        }
                    }
                    case 48: 
                }
                ** GOTO lbl343
            }
            do {
                if (true) continue block55;
lbl343:
                // 2 sources

                var8_2 /* !! */  = (int)ot.klqe("kmir", klpy(int ), (int)220);
                cfr_temp_0 = 44;
            } while (!var9_1);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public no<ou> getRotationPlanTaskProcessor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmxt", klqv(int ), (int)282)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ot.klqe("kmxu", klpy(int ), (int)407)) break;
            v0 /* !! */  = (long)ot.klqe("kmxv", klpy(int ), (int)408);
        }
        var3_1 = ot.c;
        v1 /* !! */  = ot.so;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - ot.klqe("kmxw", klqv(int ), (int)283));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2138353019: {
                    v2 = ot.klqe("kmxx", klqv(int ), (int)284);
                    continue block12;
                }
                case -1271690800: {
                    break block12;
                }
                case 2026163425: {
                    v2 = ot.klqe("kmxy", klqv(int ), (int)285);
                    continue block12;
                }
            }
            break;
        }
        var2_2 /* !! */  = ot.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmxz", klqv(int ), (int)286)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ot.klqe("kmya", klpy(int ), (int)409)) break;
            v3 /* !! */  = (long)ot.klqe("kmyb", klpy(int ), (int)410);
        }
        var1_3 = ot.a;
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
                    if ((v4 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmyc", klqv(int ), (int)287)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ot.klqe("kmyd", klpy(int ), (int)411)) break;
                    v4 /* !! */  = (long)ot.klqe("kmye", klpy(int ), (int)412);
                }
                return this.rotationPlanTaskProcessor;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ot.klqe("kmyf", klpy(int ), (int)413);
                } while (!var3_1);
                throw null;
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ot.klqe("kmyg", klpy(int ), (int)414);
                } while (!var3_1);
                throw null;
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ot.klqe("kmyh", klpy(int ), (int)415);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ot.klqe("kmyi", klpy(int ), (int)416);
        ** while (!var3_1)
lbl62:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float kmkq(int n2) {
        return Float.intBitsToFloat(klpz[n2] ^ klqc[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ot() {
        var2_1 /* !! */  = ot.b;
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.rotationPlanTaskProcessor = new no<T>();
                this.serverAngle = ov.DEFAULT;
                return;
            }
lbl9:
            // 2 sources

            case 0: {
                while (true) {
                    var2_1 /* !! */  = (int)ot.klqe("klqg", klpy(int ), (int)0);
                }
            }
lbl13:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ot.klqe("klqi", klpy(int ), (int)1);
                    ** GOTO lbl9
                    break;
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)ot.klqe("klqk", klpy(int ), (int)2);
                ** GOTO lbl13
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)ot.klqe("klqm", klpy(int ), (int)3);
        ** while (true)
    }

    private static /* synthetic */ void knav() {
        ot.klqw[300] = 2828354845360287848L;
        ot.klqw[301] = 4543802314194393203L;
        ot.klqw[302] = -3344772832149287069L;
        ot.klqw[303] = -1256859046271260285L;
        ot.klqw[304] = 8024652284744350467L;
        ot.klqw[305] = -3218807321402568174L;
        ot.klqw[306] = 3615188465248049078L;
        ot.klqw[307] = 519408907447243008L;
        ot.klqw[308] = 8840772824699505056L;
        ot.klqw[309] = -5722118139144033392L;
        ot.klqw[310] = 1244510504306008827L;
        ot.klqw[311] = -4246065421426055777L;
        ot.klqw[312] = 7657361510774058838L;
        ot.klqw[313] = -3108354313403271771L;
        ot.klqw[314] = -3064255169404025502L;
        ot.klqw[315] = 1768371477035015018L;
        ot.klqw[316] = 4863835888804461969L;
        ot.klqw[317] = -7882617233882758791L;
        ot.klqw[318] = -4810688160246767952L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ov getMoveRotation() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("klzy", klqv(int ), (int)73)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ot.klqe("klzz", klpy(int ), (int)75)) break;
            v0 /* !! */  = (long)ot.klqe("kmaa", klpy(int ), (int)76);
        }
        var4_1 = ot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmab", klqv(int ), (int)74)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ot.klqe("kmac", klpy(int ), (int)77)) break;
            v1 /* !! */  = (long)ot.klqe("kmad", klpy(int ), (int)78);
        }
        var3_2 /* !! */  = ot.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kmae", klqv(int ), (int)75)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ot.klqe("kmaf", klpy(int ), (int)79)) {
                var2_3 = ot.a;
                if (var4_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)ot.klqe("kmag", klpy(int ), (int)80);
        }
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block37: while (true) {
            block62: {
                switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var2_3 || var2_3) return null;
                        v3 /* !! */  = ot.so;
                        block38: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -1271690800: {
                                    break block38;
                                }
                                case -1205903188: {
                                    v4 = ot.klqe("kmai", klqv(int ), (int)77);
                                    ** GOTO lbl38
                                }
                                case -842046632: {
                                    v4 = ot.klqe("kmaj", klqv(int ), (int)78);
lbl38:
                                    // 2 sources

                                    v3 /* !! */  = (long)(v4 - ot.klqe("kmah", klqv(int ), (int)76));
                                    continue block38;
                                }
                            }
                            break;
                        }
                        var1_4 = this.getCurrentRotationPlan();
                        if (var2_3 || var2_3) return null;
                        v5 /* !! */  = ot.so;
                        block39: while (true) {
                            switch ((int)v5 /* !! */ ) {
                                case -1271690800: {
                                    break block39;
                                }
                                case 1542687014: {
                                    v5 /* !! */  = (long)(ot.klqe("kmal", klqv(int ), (int)80) - ot.klqe("kmak", klqv(int ), (int)79));
                                    continue block39;
                                }
                            }
                            break;
                        }
                        if (this.currentAngle == null) ** GOTO lbl69
                        if (var2_3) return null;
                        if (var1_4 == null) ** GOTO lbl69
                        if (var2_3) return null;
                        v6 /* !! */  = ot.so;
                        block40: while (true) {
                            switch ((int)v6 /* !! */ ) {
                                case -2146658208: {
                                    v7 = ot.klqe("kman", klqv(int ), (int)82);
                                    ** GOTO lbl64
                                }
                                case -1271690800: {
                                    break block40;
                                }
                                case 2021620676: {
                                    v7 = ot.klqe("kmao", klqv(int ), (int)83);
lbl64:
                                    // 2 sources

                                    v6 /* !! */  = (long)(v7 - ot.klqe("kmam", klqv(int ), (int)81));
                                    continue block40;
                                }
                            }
                            break;
                        }
                        if (!var1_4.isMoveCorrection()) ** GOTO lbl69
                        if (var2_3) return null;
                        ** GOTO lbl142
lbl69:
                        // 3 sources

                        if (var2_3 || var2_3) {
                            return null;
                        }
                        v8 /* !! */  = ot.so;
                        block41: while (true) {
                            switch ((int)v8 /* !! */ ) {
                                case -1271690800: {
                                    break block41;
                                }
                                case -237226786: {
                                    v9 = ot.klqe("kmat", klqv(int ), (int)86);
                                    ** GOTO lbl84
                                }
                                case 233158232: {
                                    v9 = ot.klqe("kmau", klqv(int ), (int)87);
                                    ** GOTO lbl84
                                }
                                case 261045804: {
                                    v9 = ot.klqe("kmav", klqv(int ), (int)88);
lbl84:
                                    // 3 sources

                                    v8 /* !! */  = (long)(v9 - ot.klqe("kmas", klqv(int ), (int)85));
                                    continue block41;
                                }
                            }
                            break;
                        }
                        v10 = ow.cameraAngle();
                        return v10;
                    }
                    case 1: {
                        var3_2 /* !! */  = (int)ot.klqe("kmax", klpy(int ), (int)84);
                        cfr_temp_0 = 0;
                        if (var4_1) {
                            throw null;
                        }
                        break block62;
                    }
                    case 2: {
                        var3_2 /* !! */  = (int)ot.klqe("kmay", klpy(int ), (int)85);
                        cfr_temp_0 = 10;
                        if (var4_1) {
                            throw null;
                        }
                        break block62;
                    }
                    case 3: {
                        var3_2 /* !! */  = (int)ot.klqe("kmaz", klpy(int ), (int)86);
                        cfr_temp_0 = 10;
                        if (var4_1) {
                            throw null;
                        }
                        break block62;
                    }
                    case 4: {
                        ** GOTO lbl133
                    }
                    case 7: {
                        var3_2 /* !! */  = (int)ot.klqe("kmbd", klpy(int ), (int)90);
                        cfr_temp_0 = 0;
                        if (var4_1) {
                            throw null;
                        }
                        break block62;
                    }
                    case 9: {
                        var3_2 /* !! */  = (int)ot.klqe("kmbf", klpy(int ), (int)92);
                        cfr_temp_0 = 5;
                        if (var4_1) {
                            throw null;
                        }
                        break block62;
                    }
                    case 10: {
                        var3_2 /* !! */  = (int)ot.klqe("kmbg", klpy(int ), (int)93);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_2 /* !! */  = (int)ot.klqe("kmbc", klpy(int ), (int)89);
                        if (!var4_1) ** break;
                        throw null;
                    }
                    case 11: {
                        var3_2 /* !! */  = (int)ot.klqe("kmbh", klpy(int ), (int)94);
                        if (var4_1) {
                            throw null;
                        }
lbl133:
                        // 3 sources

                        var3_2 /* !! */  = (int)ot.klqe("kmba", klpy(int ), (int)87);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 8: {
                        var3_2 /* !! */  = (int)ot.klqe("kmbe", klpy(int ), (int)91);
                        cfr_temp_0 = 5;
                        if (var4_1) {
                            throw null;
                        }
                        break block62;
                    }
lbl142:
                    // 1 sources

                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_4 = ot.so - ot.klqe("kmap", klqv(int ), (int)84)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == ot.klqe("kmaq", klpy(int ), (int)81)) {
                            v10 = this.currentAngle;
                            if (!var4_1) ** continue;
                            throw null;
                        }
                        v11 /* !! */  = (long)ot.klqe("kmar", klpy(int ), (int)82);
                    }
                    case 0: {
                        var3_2 /* !! */  = (int)ot.klqe("kmaw", klpy(int ), (int)83);
                        if (var4_1) {
                            throw null;
                        }
                    }
                    case 5: 
                }
                ** GOTO lbl159
            }
            do {
                if (true) continue block37;
lbl159:
                // 2 sources

                var3_2 /* !! */  = (int)ot.klqe("kmbb", klpy(int ), (int)88);
                cfr_temp_0 = 0;
            } while (!var4_1);
            break;
        }
        throw null;
    }

    private static /* synthetic */ void knas() {
        ot.klqw[0] = 7575918718277845895L;
        ot.klqw[1] = 8308452409205349714L;
        ot.klqw[2] = -593538904175185691L;
        ot.klqw[3] = 6653516195932953849L;
        ot.klqw[4] = -135398255227445321L;
        ot.klqw[5] = -6902643708590798536L;
        ot.klqw[6] = 2296448093964933292L;
        ot.klqw[7] = 8947312663651385009L;
        ot.klqw[8] = -2548792140035332745L;
        ot.klqw[9] = -3389162527000147399L;
        ot.klqw[10] = 5291918058917362976L;
        ot.klqw[11] = 6164671705853374613L;
        ot.klqw[12] = -2426926286579238494L;
        ot.klqw[13] = -4017781929326555895L;
        ot.klqw[14] = -556470763324197479L;
        ot.klqw[15] = -1221525674445388077L;
        ot.klqw[16] = -6492631590637112227L;
        ot.klqw[17] = 5038213832817420094L;
        ot.klqw[18] = 4134088601966125664L;
        ot.klqw[19] = -1000912996390608406L;
        ot.klqw[20] = -8879546928023067120L;
        ot.klqw[21] = -2676157956810376045L;
        ot.klqw[22] = 8131408254367938747L;
        ot.klqw[23] = 454898576513687835L;
        ot.klqw[24] = 2284654771763764082L;
        ot.klqw[25] = 4126341364662987932L;
        ot.klqw[26] = 660569335809414713L;
        ot.klqw[27] = 3831140153989154126L;
        ot.klqw[28] = -6555465274268621885L;
        ot.klqw[29] = 4171092050091585445L;
        ot.klqw[30] = -1018912590513130370L;
        ot.klqw[31] = 1986138697863661478L;
        ot.klqw[32] = 4338982950497444976L;
        ot.klqw[33] = 4663612476441746061L;
        ot.klqw[34] = 7909403308222851237L;
        ot.klqw[35] = 7899231943127157433L;
        ot.klqw[36] = -1567642950658445031L;
        ot.klqw[37] = 5201614716752677975L;
        ot.klqw[38] = 4303720603669283244L;
        ot.klqw[39] = 3783584914919049518L;
        ot.klqw[40] = 5723022683073756274L;
        ot.klqw[41] = 5846354200887414709L;
        ot.klqw[42] = -9036335964165027448L;
        ot.klqw[43] = 3711662970727772233L;
        ot.klqw[44] = -655608766524467604L;
        ot.klqw[45] = 3222086177586957939L;
        ot.klqw[46] = -5347931269143925674L;
        ot.klqw[47] = -2345988632093151673L;
        ot.klqw[48] = -207520200255254487L;
        ot.klqw[49] = 6966586697644029918L;
        ot.klqw[50] = 4948889470692732434L;
        ot.klqw[51] = -4193147145281246709L;
        ot.klqw[52] = 7283287099403286581L;
        ot.klqw[53] = 5315210918340849437L;
        ot.klqw[54] = -1244482347075913803L;
        ot.klqw[55] = 3275973678766558510L;
        ot.klqw[56] = -4503620447542677014L;
        ot.klqw[57] = -8659410447455891942L;
        ot.klqw[58] = -4899451914929393993L;
        ot.klqw[59] = 6362985643518315831L;
        ot.klqw[60] = -3536283729369676464L;
        ot.klqw[61] = -5909425432404717462L;
        ot.klqw[62] = 2482839819774917608L;
        ot.klqw[63] = -6218408077765537451L;
        ot.klqw[64] = -2361453782434826346L;
        ot.klqw[65] = -7355213104084722201L;
        ot.klqw[66] = 540972077148120054L;
        ot.klqw[67] = 1192208713636052797L;
        ot.klqw[68] = 2853277551670507883L;
        ot.klqw[69] = 7434971853217120851L;
        ot.klqw[70] = 9012756818259377596L;
        ot.klqw[71] = 5852634881983524413L;
        ot.klqw[72] = -7135402886246115237L;
        ot.klqw[73] = -3513134196279409619L;
        ot.klqw[74] = -1035213294844064638L;
        ot.klqw[75] = -2981782000671286901L;
        ot.klqw[76] = -8696833872882975069L;
        ot.klqw[77] = 2172206508310089791L;
        ot.klqw[78] = -7360109933083112745L;
        ot.klqw[79] = 806060969425884860L;
        ot.klqw[80] = 3527096127121338776L;
        ot.klqw[81] = -1556919411371289947L;
        ot.klqw[82] = -6997769753298513497L;
        ot.klqw[83] = 6099010410566583056L;
        ot.klqw[84] = 3428599767797301263L;
        ot.klqw[85] = -467339365638037887L;
        ot.klqw[86] = -3718237068756948929L;
        ot.klqw[87] = -6749859597934459923L;
        ot.klqw[88] = 232150991103393969L;
        ot.klqw[89] = 772834768779579807L;
        ot.klqw[90] = 3729283142257708065L;
        ot.klqw[91] = 2526631507740377811L;
        ot.klqw[92] = 6744856886738143505L;
        ot.klqw[93] = 3767363653937380540L;
        ot.klqw[94] = -7136984855212191533L;
        ot.klqw[95] = -7937597407864825993L;
        ot.klqw[96] = 5670447748864886027L;
        ot.klqw[97] = 8015701878030345374L;
        ot.klqw[98] = 4217203634148698672L;
        ot.klqw[99] = -6036805782275527949L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void clear() {
        v0 /* !! */  = ot.so;
        block27: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1271690800: {
                    break block27;
                }
                case 766570826: {
                    v0 /* !! */  = (long)(ot.klqe("kmmd", klqv(int ), (int)182) - ot.klqe("kmmc", klqv(int ), (int)181));
                    continue block27;
                }
            }
            break;
        }
        var3_1 = ot.c;
        while (true) {
            block42: {
                if ((v1 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmme", klqv(int ), (int)183)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  != ot.klqe("kmmf", klpy(int ), (int)281)) break block42;
                var2_2 /* !! */  = ot.b;
                v2 /* !! */  = ot.so;
                if (true) ** GOTO lbl21
            }
            v1 /* !! */  = (long)ot.klqe("kmmg", klpy(int ), (int)282);
        }
        block29: while (true) {
            v2 /* !! */  = (long)(v3 - ot.klqe("kmmh", klqv(int ), (int)184));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2038663387: {
                    v3 = ot.klqe("kmmi", klqv(int ), (int)185);
                    continue block29;
                }
                case -1271690800: {
                    break block29;
                }
                case 191023468: {
                    v3 = ot.klqe("kmmj", klqv(int ), (int)186);
                    continue block29;
                }
            }
            break;
        }
        var1_3 = ot.a;
        if (var3_1) {
            throw null;
        }
        if (var1_3 || var1_3) ** GOTO lbl71
        v4 /* !! */  = ot.so;
        if (true) ** GOTO lbl38
        block30: while (true) {
            v4 /* !! */  = (long)(v5 - ot.klqe("kmmk", klqv(int ), (int)187));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1856888085: {
                    v5 = ot.klqe("kmml", klqv(int ), (int)188);
                    continue block30;
                }
                case -1271690800: {
                    break block30;
                }
                case 290352343: {
                    v5 = ot.klqe("kmmm", klqv(int ), (int)189);
                    continue block30;
                }
                case 494236048: {
                    v5 = ot.klqe("kmmn", klqv(int ), (int)190);
                    continue block30;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmmo", klqv(int ), (int)191)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ot.klqe("kmmp", klpy(int ), (int)283)) break;
            v6 /* !! */  = (long)ot.klqe("kmmq", klpy(int ), (int)284);
        }
        v7 = this.rotationPlanTaskProcessor.activeTasks;
        v8 /* !! */  = ot.so;
        block32: while (true) {
            switch ((int)v8 /* !! */ ) {
                case -1468568469: {
                    v8 /* !! */  = (long)(ot.klqe("kmms", klqv(int ), (int)193) - ot.klqe("kmmr", klqv(int ), (int)192));
                    continue block32;
                }
                case -1271690800: {
                    break block32;
                }
            }
            break;
        }
        v7.clear();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block33: do {
            switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (!var1_3 && !var1_3) ** GOTO lbl72
lbl71:
                    // 2 sources

                    return;
lbl72:
                    // 1 sources

                    return;
                }
                case 2: {
                    var2_2 /* !! */  = (int)ot.klqe("kmmv", klpy(int ), (int)287);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block33;
                    throw null;
                }
                case 3: {
                    var2_2 /* !! */  = (int)ot.klqe("kmmw", klpy(int ), (int)288);
                    cfr_temp_0 = 1;
                    if (!var3_1) continue block33;
                    throw null;
                }
                case 4: {
                    var2_2 /* !! */  = (int)ot.klqe("kmmx", klpy(int ), (int)289);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 0: {
                    ** GOTO lbl93
                }
                case 5: {
                    var2_2 /* !! */  = (int)ot.klqe("kmmy", klpy(int ), (int)290);
                    if (var3_1) {
                        throw null;
                    }
lbl93:
                    // 3 sources

                    var2_2 /* !! */  = (int)ot.klqe("kmmt", klpy(int ), (int)285);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 1: 
            }
            break;
        } while (true);
        do {
            var2_2 /* !! */  = (int)ot.klqe("kmmu", klpy(int ), (int)286);
        } while (!var3_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov getRotation() {
        block27: {
            block26: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("klwr", klqv(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == ot.klqe("klwt", klpy(int ), (int)38)) break;
                    v0 /* !! */  = (long)ot.klqe("klwu", klpy(int ), (int)39);
                }
                var3_1 = ot.c;
                v1 /* !! */  = ot.so;
                if (true) ** GOTO lbl11
                block17: while (true) {
                    v1 /* !! */  = (long)(v2 - ot.klqe("klww", klqv(int ), (int)37));
lbl11:
                    // 2 sources

                    switch ((int)v1 /* !! */ ) {
                        case -2008708227: {
                            v2 = ot.klqe("klwy", klqv(int ), (int)38);
                            continue block17;
                        }
                        case -1271690800: {
                            break block17;
                        }
                        case 968116226: {
                            v2 = ot.klqe("klxa", klqv(int ), (int)39);
                            continue block17;
                        }
                        case 1853810975: {
                            v2 = ot.klqe("klxc", klqv(int ), (int)40);
                            continue block17;
                        }
                    }
                    break;
                }
                var2_2 = ot.b;
                v3 /* !! */  = ot.so;
                if (true) ** GOTO lbl28
                block18: while (true) {
                    v3 /* !! */  = (long)(ot.klqe("klxe", klqv(int ), (int)42) - ot.klqe("klxd", klqv(int ), (int)41));
lbl28:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1271690800: {
                            break block18;
                        }
                        case -861064345: {
                            continue block18;
                        }
                    }
                    break;
                }
                var1_3 = ot.a;
                if (var3_1) {
                    throw null;
lbl36:
                    // 3 sources

                    return null;
                }
                if (var1_3 || var1_3) ** GOTO lbl36
                v4 /* !! */  = ot.so;
                if (true) ** GOTO lbl43
                block20: while (true) {
                    v4 /* !! */  = (long)(v5 - ot.klqe("klxg", klqv(int ), (int)43));
lbl43:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2127881925: {
                            v5 = ot.klqe("klxh", klqv(int ), (int)44);
                            continue block20;
                        }
                        case -2087878140: {
                            v5 = ot.klqe("klxi", klqv(int ), (int)45);
                            continue block20;
                        }
                        case -1271690800: {
                            break block20;
                        }
                        case 152512688: {
                            v5 = ot.klqe("klxj", klqv(int ), (int)46);
                            continue block20;
                        }
                    }
                    break;
                }
                if (this.currentAngle == null) break block26;
                if (var1_3) ** GOTO lbl36
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("klxk", klqv(int ), (int)47)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ot.klqe("klxl", klpy(int ), (int)40)) break;
                    v6 /* !! */  = (long)ot.klqe("klxm", klpy(int ), (int)41);
                }
                v7 = this.currentAngle;
                if (var3_1) {
                    throw null;
                }
                break block27;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("klxo", klqv(int ), (int)48)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ot.klqe("klxp", klpy(int ), (int)42)) {
                    v7 = ow.cameraAngle();
                    break;
                }
                v8 /* !! */  = (long)ot.klqe("klxr", klpy(int ), (int)43);
            }
        }
        return v7;
    }

    private static /* synthetic */ void knap() {
        ot.klqc[200] = -1621973335;
        ot.klqc[201] = 1047489849;
        ot.klqc[202] = 1888764034;
        ot.klqc[203] = 716001111;
        ot.klqc[204] = 1265082892;
        ot.klqc[205] = 1910395642;
        ot.klqc[206] = 1399843960;
        ot.klqc[207] = -1463963996;
        ot.klqc[208] = -661745379;
        ot.klqc[209] = -210245059;
        ot.klqc[210] = 385281201;
        ot.klqc[211] = 564503219;
        ot.klqc[212] = -1411053436;
        ot.klqc[213] = 641045850;
        ot.klqc[214] = 404442995;
        ot.klqc[215] = 1361671098;
        ot.klqc[216] = -2065751953;
        ot.klqc[217] = -881162376;
        ot.klqc[218] = 1896234692;
        ot.klqc[219] = -715905168;
        ot.klqc[220] = 301514897;
        ot.klqc[221] = 680311362;
        ot.klqc[222] = 877155848;
        ot.klqc[223] = -97693729;
        ot.klqc[224] = -2006898579;
        ot.klqc[225] = -288202114;
        ot.klqc[226] = 1948859307;
        ot.klqc[227] = -1061024412;
        ot.klqc[228] = -523812112;
        ot.klqc[229] = 574336405;
        ot.klqc[230] = -1938872111;
        ot.klqc[231] = -957422643;
        ot.klqc[232] = 140072882;
        ot.klqc[233] = -884584901;
        ot.klqc[234] = -328198238;
        ot.klqc[235] = -2112274319;
        ot.klqc[236] = -1956982959;
        ot.klqc[237] = 862342717;
        ot.klqc[238] = 140585216;
        ot.klqc[239] = 1968606403;
        ot.klqc[240] = -393458465;
        ot.klqc[241] = -1042351327;
        ot.klqc[242] = 1828183551;
        ot.klqc[243] = 833816454;
        ot.klqc[244] = 451677353;
        ot.klqc[245] = -74238100;
        ot.klqc[246] = -213356189;
        ot.klqc[247] = 1320768946;
        ot.klqc[248] = 304091038;
        ot.klqc[249] = -1067902903;
        ot.klqc[250] = -1382495442;
        ot.klqc[251] = 1865320547;
        ot.klqc[252] = 2027227228;
        ot.klqc[253] = -1238265295;
        ot.klqc[254] = -1680389284;
        ot.klqc[255] = -680411869;
        ot.klqc[256] = -1711199465;
        ot.klqc[257] = 189571245;
        ot.klqc[258] = 400326084;
        ot.klqc[259] = -1822669300;
        ot.klqc[260] = 307440547;
        ot.klqc[261] = 118166619;
        ot.klqc[262] = -721656009;
        ot.klqc[263] = -2133326119;
        ot.klqc[264] = -1642660566;
        ot.klqc[265] = -1621373914;
        ot.klqc[266] = -187764095;
        ot.klqc[267] = -1989737470;
        ot.klqc[268] = 1674931204;
        ot.klqc[269] = -2055282612;
        ot.klqc[270] = 435476500;
        ot.klqc[271] = 1892757324;
        ot.klqc[272] = -770433991;
        ot.klqc[273] = 689936537;
        ot.klqc[274] = 491268654;
        ot.klqc[275] = 32008982;
        ot.klqc[276] = -1288147901;
        ot.klqc[277] = 207294935;
        ot.klqc[278] = -330891461;
        ot.klqc[279] = 1664675570;
        ot.klqc[280] = -949010409;
        ot.klqc[281] = -1101841580;
        ot.klqc[282] = -347006432;
        ot.klqc[283] = -178316521;
        ot.klqc[284] = -471880266;
        ot.klqc[285] = 1792932084;
        ot.klqc[286] = 1326747624;
        ot.klqc[287] = -25063065;
        ot.klqc[288] = -1036735647;
        ot.klqc[289] = 1730736563;
        ot.klqc[290] = -780537672;
        ot.klqc[291] = -1117282153;
        ot.klqc[292] = -40326915;
        ot.klqc[293] = -2068583113;
        ot.klqc[294] = -1348859033;
        ot.klqc[295] = -177177036;
        ot.klqc[296] = 174209464;
        ot.klqc[297] = -127496970;
        ot.klqc[298] = 175867547;
        ot.klqc[299] = -338372295;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onPlayerVelocityStrafe(cx var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmsp", klqv(int ), (int)229)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ot.klqe("kmsq", klpy(int ), (int)326)) break;
            v0 /* !! */  = (long)ot.klqe("kmsr", klpy(int ), (int)327);
        }
        var5_2 = ot.c;
        v1 /* !! */  = ot.so;
        if (true) ** GOTO lbl11
        block45: while (true) {
            v1 /* !! */  = (long)(ot.klqe("kmst", klqv(int ), (int)231) - ot.klqe("kmss", klqv(int ), (int)230));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1271690800: {
                    break block45;
                }
                case 2060351529: {
                    continue block45;
                }
            }
            break;
        }
        var4_3 /* !! */  = ot.b;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl21
        block46: while (true) {
            v2 /* !! */  = (long)(v3 - ot.klqe("kmsu", klqv(int ), (int)232));
lbl21:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1271690800: {
                    break block46;
                }
                case 375619578: {
                    v3 = ot.klqe("kmsv", klqv(int ), (int)233);
                    continue block46;
                }
                case 415571145: {
                    v3 = ot.klqe("kmsw", klqv(int ), (int)234);
                    continue block46;
                }
                case 1026974031: {
                    v3 = ot.klqe("kmsx", klqv(int ), (int)235);
                    continue block46;
                }
            }
            break;
        }
        var3_4 = ot.a;
        if (var5_2) {
            throw null;
lbl36:
            // 6 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl36
        v4 /* !! */  = ot.so;
        if (true) ** GOTO lbl43
        block48: while (true) {
            v4 /* !! */  = (long)(ot.klqe("kmsz", klqv(int ), (int)237) - ot.klqe("kmsy", klqv(int ), (int)236));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -2127636108: {
                    continue block48;
                }
                case -1271690800: {
                    break block48;
                }
            }
            break;
        }
        var2_5 = this.getCurrentRotationPlan();
        if (var3_4 || var3_4) ** GOTO lbl36
        if (var2_5 == null) ** GOTO lbl-1000
        if (var3_4) ** GOTO lbl36
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmta", klqv(int ), (int)238)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ot.klqe("kmtb", klpy(int ), (int)328)) break;
            v5 /* !! */  = (long)ot.klqe("kmtc", klpy(int ), (int)329);
        }
        if (!var2_5.isMoveCorrection()) ** GOTO lbl-1000
        if (var3_4 || var3_4) ** GOTO lbl36
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmtd", klqv(int ), (int)239)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ot.klqe("kmte", klpy(int ), (int)330)) break;
            v6 /* !! */  = (long)ot.klqe("kmtf", klpy(int ), (int)331);
        }
        v7 = var1_1.getVelocity();
        v8 /* !! */  = ot.so;
        if (true) ** GOTO lbl69
        block51: while (true) {
            v8 /* !! */  = (long)(v9 - ot.klqe("kmtg", klqv(int ), (int)240));
lbl69:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -1271690800: {
                    break block51;
                }
                case 977726484: {
                    v9 = ot.klqe("kmth", klqv(int ), (int)241);
                    continue block51;
                }
                case 1458934348: {
                    v9 = ot.klqe("kmti", klqv(int ), (int)242);
                    continue block51;
                }
                case 1830092622: {
                    v9 = ot.klqe("kmtj", klqv(int ), (int)243);
                    continue block51;
                }
            }
            break;
        }
        v10 = var1_1.getMovementInput();
        v11 /* !! */  = ot.so;
        if (true) ** GOTO lbl86
        block52: while (true) {
            v11 /* !! */  = (long)(v12 - ot.klqe("kmtk", klqv(int ), (int)244));
lbl86:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1271690800: {
                    break block52;
                }
                case -261207829: {
                    v12 = ot.klqe("kmtl", klqv(int ), (int)245);
                    continue block52;
                }
                case 1215148563: {
                    v12 = ot.klqe("kmtm", klqv(int ), (int)246);
                    continue block52;
                }
            }
            break;
        }
        v13 = var1_1.getSpeed();
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kmtn", klqv(int ), (int)247)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ot.klqe("kmto", klpy(int ), (int)332)) break;
            v14 /* !! */  = (long)ot.klqe("kmtp", klpy(int ), (int)333);
        }
        v15 = this.fixVelocity(v7, v10, v13);
        v16 /* !! */  = ot.so;
        if (true) ** GOTO lbl106
        block54: while (true) {
            v16 /* !! */  = (long)(v17 - ot.klqe("kmtq", klqv(int ), (int)248));
lbl106:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1271690800: {
                    break block54;
                }
                case 386024559: {
                    v17 = ot.klqe("kmtr", klqv(int ), (int)249);
                    continue block54;
                }
                case 1186388728: {
                    v17 = ot.klqe("kmts", klqv(int ), (int)250);
                    continue block54;
                }
            }
            break;
        }
        var1_1.setVelocity(v15);
        if (var3_4) ** GOTO lbl36
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 4 sources

            {
                if (!var3_4 && !var3_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)ot.klqe("kmtt", klpy(int ), (int)334);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl146
            }
lbl128:
            // 2 sources

            case 1: {
                var4_3 /* !! */  = (int)ot.klqe("kmtu", klpy(int ), (int)335);
                if (var5_2) {
                    throw null;
                }
            }
lbl132:
            // 4 sources

            case 2: {
                var4_3 /* !! */  = (int)ot.klqe("kmtv", klpy(int ), (int)336);
                if (!var5_2) break;
                throw null;
            }
            case 3: {
                var4_3 /* !! */  = (int)ot.klqe("kmtw", klpy(int ), (int)337);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl141:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_3 /* !! */  = (int)ot.klqe("kmtx", klpy(int ), (int)338);
                    if (!var5_2) ** GOTO lbl128
                    throw null;
                }
            }
lbl146:
            // 2 sources

            case 5: {
                var4_3 /* !! */  = (int)ot.klqe("kmty", klpy(int ), (int)339);
                if (!var5_2) ** GOTO lbl141
                throw null;
            }
            case 6: {
                var4_3 /* !! */  = (int)ot.klqe("kmtz", klpy(int ), (int)340);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 7: {
                var4_3 /* !! */  = (int)ot.klqe("kmua", klpy(int ), (int)341);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl160:
            // 2 sources

            case 8: {
                do {
                    var4_3 /* !! */  = (int)ot.klqe("kmub", klpy(int ), (int)342);
                } while (!var5_2);
                throw null;
            }
            case 9: {
                var4_3 /* !! */  = (int)ot.klqe("kmuc", klpy(int ), (int)343);
                if (!var5_2) ** GOTO lbl132
                throw null;
            }
lbl169:
            // 3 sources

            case 10: {
                do {
                    var4_3 /* !! */  = (int)ot.klqe("kmud", klpy(int ), (int)344);
                } while (!var5_2);
                throw null;
            }
            case 11: 
        }
        var4_3 /* !! */  = (int)ot.klqe("kmue", klpy(int ), (int)345);
        ** while (!var5_2)
lbl177:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void knak() {
        ot.klpz[200] = -1621973366;
        ot.klpz[201] = 1047489801;
        ot.klpz[202] = 1888764080;
        ot.klpz[203] = 716001148;
        ot.klpz[204] = 1265082923;
        ot.klpz[205] = 1910395632;
        ot.klpz[206] = 1399843966;
        ot.klpz[207] = -1463964024;
        ot.klpz[208] = -661745356;
        ot.klpz[209] = -210245066;
        ot.klpz[210] = 385281200;
        ot.klpz[211] = 564503203;
        ot.klpz[212] = -1411053435;
        ot.klpz[213] = 641045886;
        ot.klpz[214] = 404443003;
        ot.klpz[215] = 1361671077;
        ot.klpz[216] = -2065751996;
        ot.klpz[217] = -881162403;
        ot.klpz[218] = 1896234711;
        ot.klpz[219] = -715905216;
        ot.klpz[220] = 301514896;
        ot.klpz[221] = 680311366;
        ot.klpz[222] = 877155878;
        ot.klpz[223] = -97693755;
        ot.klpz[224] = -2006898596;
        ot.klpz[225] = -288202113;
        ot.klpz[226] = -2078851180;
        ot.klpz[227] = -1061024411;
        ot.klpz[228] = 2026308749;
        ot.klpz[229] = 574336404;
        ot.klpz[230] = 305838670;
        ot.klpz[231] = -957422644;
        ot.klpz[232] = 176474999;
        ot.klpz[233] = -884584902;
        ot.klpz[234] = 1923012136;
        ot.klpz[235] = -2112274320;
        ot.klpz[236] = 1968705913;
        ot.klpz[237] = -862342718;
        ot.klpz[238] = -2069588902;
        ot.klpz[239] = 1968606403;
        ot.klpz[240] = -393458466;
        ot.klpz[241] = -1042351325;
        ot.klpz[242] = 1828183551;
        ot.klpz[243] = 833816455;
        ot.klpz[244] = -264735920;
        ot.klpz[245] = -74238099;
        ot.klpz[246] = 1163954824;
        ot.klpz[247] = 1931860962;
        ot.klpz[248] = 304091039;
        ot.klpz[249] = -1067902902;
        ot.klpz[250] = -1382495444;
        ot.klpz[251] = 1865320545;
        ot.klpz[252] = 1146876521;
        ot.klpz[253] = -1967167484;
        ot.klpz[254] = -1680389298;
        ot.klpz[255] = -680411859;
        ot.klpz[256] = -1711199482;
        ot.klpz[257] = 189571236;
        ot.klpz[258] = 400326102;
        ot.klpz[259] = -1822669282;
        ot.klpz[260] = 307440547;
        ot.klpz[261] = 118166613;
        ot.klpz[262] = -721656011;
        ot.klpz[263] = -2133326132;
        ot.klpz[264] = -1642660549;
        ot.klpz[265] = -1621373912;
        ot.klpz[266] = -187764087;
        ot.klpz[267] = -1989737463;
        ot.klpz[268] = 1674931221;
        ot.klpz[269] = -2055282620;
        ot.klpz[270] = 435476493;
        ot.klpz[271] = 1892757341;
        ot.klpz[272] = -770433995;
        ot.klpz[273] = 689936525;
        ot.klpz[274] = 491268644;
        ot.klpz[275] = 32008964;
        ot.klpz[276] = -1288147884;
        ot.klpz[277] = 207294942;
        ot.klpz[278] = -330891478;
        ot.klpz[279] = 1664675557;
        ot.klpz[280] = -949010414;
        ot.klpz[281] = -1101841579;
        ot.klpz[282] = 1112169797;
        ot.klpz[283] = -178316522;
        ot.klpz[284] = 389009340;
        ot.klpz[285] = 1792932080;
        ot.klpz[286] = 1326747624;
        ot.klpz[287] = -25063066;
        ot.klpz[288] = -1036735643;
        ot.klpz[289] = 1730736567;
        ot.klpz[290] = -780537668;
        ot.klpz[291] = -1117282154;
        ot.klpz[292] = 2050891101;
        ot.klpz[293] = -2068583113;
        ot.klpz[294] = -1348859034;
        ot.klpz[295] = -177177035;
        ot.klpz[296] = 174209469;
        ot.klpz[297] = -127496969;
        ot.klpz[298] = 175867551;
        ot.klpz[299] = -338372296;
    }

    private static /* synthetic */ void knai() {
        ot.klpz[0] = -1981171334;
        ot.klpz[1] = -1084358468;
        ot.klpz[2] = -1361104310;
        ot.klpz[3] = -1687988746;
        ot.klpz[4] = 615962882;
        ot.klpz[5] = -1767099871;
        ot.klpz[6] = 1828099196;
        ot.klpz[7] = 348890332;
        ot.klpz[8] = 178777826;
        ot.klpz[9] = 1833838943;
        ot.klpz[10] = 1991749408;
        ot.klpz[11] = -1802867571;
        ot.klpz[12] = -1823116247;
        ot.klpz[13] = -981165103;
        ot.klpz[14] = 637672318;
        ot.klpz[15] = 556485939;
        ot.klpz[16] = 1603609690;
        ot.klpz[17] = -433975194;
        ot.klpz[18] = -271770594;
        ot.klpz[19] = -642605479;
        ot.klpz[20] = -841457197;
        ot.klpz[21] = 288812201;
        ot.klpz[22] = 964793401;
        ot.klpz[23] = 474061788;
        ot.klpz[24] = -1731955717;
        ot.klpz[25] = 1581040062;
        ot.klpz[26] = 1166072275;
        ot.klpz[27] = 279662029;
        ot.klpz[28] = -1354773212;
        ot.klpz[29] = -1967635054;
        ot.klpz[30] = 1696344182;
        ot.klpz[31] = -74849971;
        ot.klpz[32] = -329639191;
        ot.klpz[33] = -62027299;
        ot.klpz[34] = 955961188;
        ot.klpz[35] = -1283939942;
        ot.klpz[36] = -1865087503;
        ot.klpz[37] = -1702754889;
        ot.klpz[38] = -1157450399;
        ot.klpz[39] = 797659628;
        ot.klpz[40] = 847517620;
        ot.klpz[41] = 547048766;
        ot.klpz[42] = 787407912;
        ot.klpz[43] = -1741791696;
        ot.klpz[44] = -980507439;
        ot.klpz[45] = -2068836556;
        ot.klpz[46] = 1922403800;
        ot.klpz[47] = 714954250;
        ot.klpz[48] = 1107719512;
        ot.klpz[49] = 1765115242;
        ot.klpz[50] = 197950613;
        ot.klpz[51] = -1180533420;
        ot.klpz[52] = -34082853;
        ot.klpz[53] = 1415197298;
        ot.klpz[54] = 156017370;
        ot.klpz[55] = 1042009083;
        ot.klpz[56] = -1093210373;
        ot.klpz[57] = -125425034;
        ot.klpz[58] = 898108613;
        ot.klpz[59] = -372752404;
        ot.klpz[60] = -2044281606;
        ot.klpz[61] = 1104123159;
        ot.klpz[62] = 317274551;
        ot.klpz[63] = -1606867311;
        ot.klpz[64] = 1916612399;
        ot.klpz[65] = 826571255;
        ot.klpz[66] = 951492752;
        ot.klpz[67] = 592818415;
        ot.klpz[68] = 1422076018;
        ot.klpz[69] = 1741986972;
        ot.klpz[70] = -467100412;
        ot.klpz[71] = -1849909953;
        ot.klpz[72] = -2052981351;
        ot.klpz[73] = -1017905593;
        ot.klpz[74] = 1177350071;
        ot.klpz[75] = -721986430;
        ot.klpz[76] = -1066352056;
        ot.klpz[77] = 1842794236;
        ot.klpz[78] = 145293320;
        ot.klpz[79] = 1300973282;
        ot.klpz[80] = 1797868950;
        ot.klpz[81] = 1295675960;
        ot.klpz[82] = -372542131;
        ot.klpz[83] = -641982809;
        ot.klpz[84] = -1458702328;
        ot.klpz[85] = -111846404;
        ot.klpz[86] = -1625804506;
        ot.klpz[87] = 1304466192;
        ot.klpz[88] = 1663176709;
        ot.klpz[89] = -457643756;
        ot.klpz[90] = -346890380;
        ot.klpz[91] = -2023487380;
        ot.klpz[92] = 642699188;
        ot.klpz[93] = 662020207;
        ot.klpz[94] = 859626613;
        ot.klpz[95] = -1301900201;
        ot.klpz[96] = -30364400;
        ot.klpz[97] = 1563071916;
        ot.klpz[98] = -1121770129;
        ot.klpz[99] = 2111837565;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void rotateTo(ov var1_1, os var2_2, nn var3_3, ds var4_4) {
        v0 /* !! */  = ot.so;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - ot.klqe("kmep", klqv(int ), (int)127));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1455637661: {
                    v1 = ot.klqe("kmeq", klqv(int ), (int)128);
                    continue block28;
                }
                case -1271690800: {
                    break block28;
                }
                case 1643927676: {
                    v1 = ot.klqe("kmer", klqv(int ), (int)129);
                    continue block28;
                }
                case 2062842400: {
                    v1 = ot.klqe("kmes", klqv(int ), (int)130);
                    continue block28;
                }
            }
            break;
        }
        var7_5 = ot.c;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl22
        block29: while (true) {
            v2 /* !! */  = (long)(ot.klqe("kmeu", klqv(int ), (int)132) - ot.klqe("kmet", klqv(int ), (int)131));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1271690800: {
                    break block29;
                }
                case -657618334: {
                    continue block29;
                }
            }
            break;
        }
        var6_6 /* !! */  = ot.b;
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var6_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmev", klqv(int ), (int)133)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == ot.klqe("kmew", klpy(int ), (int)142)) break;
                    v3 /* !! */  = (long)ot.klqe("kmex", klpy(int ), (int)143);
                }
                var5_7 = ot.a;
                if (var7_5) {
                    throw null;
lbl39:
                    // 2 sources

                    return;
                }
                if (var5_7 || var5_7) ** GOTO lbl39
                v4 /* !! */  = ot.so;
                if (true) ** GOTO lbl46
                block32: while (true) {
                    v4 /* !! */  = (long)(v5 - ot.klqe("kmey", klqv(int ), (int)134));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -2056813770: {
                            v5 = ot.klqe("kmez", klqv(int ), (int)135);
                            continue block32;
                        }
                        case -1271690800: {
                            break block32;
                        }
                        case 712203746: {
                            v5 = ot.klqe("kmfa", klqv(int ), (int)136);
                            continue block32;
                        }
                    }
                    break;
                }
                v6 = var1_1.toVector();
                v7 = ot.klqe("kmfb", klpy(int ), (int)144);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmfc", klqv(int ), (int)137)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ot.klqe("kmfd", klpy(int ), (int)145)) break;
                    v8 /* !! */  = (long)ot.klqe("kmfe", klpy(int ), (int)146);
                }
                v9 = var2_2.createRotationPlan(var1_1, v6, null, (int)v7);
                v10 /* !! */  = ot.so;
                if (true) ** GOTO lbl67
                block34: while (true) {
                    v10 /* !! */  = (long)(v11 - ot.klqe("kmff", klqv(int ), (int)138));
lbl67:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1271690800: {
                            break block34;
                        }
                        case 263170112: {
                            v11 = ot.klqe("kmfg", klqv(int ), (int)139);
                            continue block34;
                        }
                        case 767141615: {
                            v11 = ot.klqe("kmfh", klqv(int ), (int)140);
                            continue block34;
                        }
                    }
                    break;
                }
                this.rotateTo(v9, var3_3, var4_4);
                if (var5_7 || var5_7) ** continue;
                return;
            }
lbl79:
            // 2 sources

            case 0: {
                var6_6 /* !! */  = (int)ot.klqe("kmfi", klpy(int ), (int)147);
                if (var7_5) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_6 /* !! */  = (int)ot.klqe("kmfj", klpy(int ), (int)148);
                    if (!var7_5) break block10;
                    throw null;
                }
            }
            case 2: {
                var6_6 /* !! */  = (int)ot.klqe("kmfk", klpy(int ), (int)149);
                if (!var7_5) break;
                throw null;
            }
            case 3: {
                var6_6 /* !! */  = (int)ot.klqe("kmfl", klpy(int ), (int)150);
                if (!var7_5) ** GOTO lbl79
                throw null;
            }
            case 4: {
                do {
                    var6_6 /* !! */  = (int)ot.klqe("kmfm", klpy(int ), (int)151);
                } while (!var7_5);
                throw null;
            }
            case 5: 
        }
        var6_6 /* !! */  = (int)ot.klqe("kmfn", klpy(int ), (int)152);
        ** while (!var7_5)
lbl104:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void knau() {
        ot.klqw[200] = 1154638508442077546L;
        ot.klqw[201] = -8933396727840748764L;
        ot.klqw[202] = 8378364862257080171L;
        ot.klqw[203] = -2031168832221898762L;
        ot.klqw[204] = 2911922090054028918L;
        ot.klqw[205] = 8730290143792592135L;
        ot.klqw[206] = 7963529268069307649L;
        ot.klqw[207] = -4078519898105361477L;
        ot.klqw[208] = -5932169408004414179L;
        ot.klqw[209] = 1545059501457514741L;
        ot.klqw[210] = 3517518237412424360L;
        ot.klqw[211] = 314161161035673642L;
        ot.klqw[212] = -3335840201501145999L;
        ot.klqw[213] = 657948285196162457L;
        ot.klqw[214] = -1532705619736181112L;
        ot.klqw[215] = -6157270522001034081L;
        ot.klqw[216] = 4029325457301781858L;
        ot.klqw[217] = -2454330505718911614L;
        ot.klqw[218] = 9096947784514807156L;
        ot.klqw[219] = 8066571346532245505L;
        ot.klqw[220] = 2726470775152895453L;
        ot.klqw[221] = 8320121736022193127L;
        ot.klqw[222] = -2689646963258346781L;
        ot.klqw[223] = -2815636830799389700L;
        ot.klqw[224] = -4992406328775975771L;
        ot.klqw[225] = -2729309508556133699L;
        ot.klqw[226] = 6538072900257027678L;
        ot.klqw[227] = -3327346013080070889L;
        ot.klqw[228] = -4756833814031837674L;
        ot.klqw[229] = 5473470198648393596L;
        ot.klqw[230] = -8336572240744441734L;
        ot.klqw[231] = 2368314486692511042L;
        ot.klqw[232] = 3120440492631267218L;
        ot.klqw[233] = -4256107544789352153L;
        ot.klqw[234] = 8579541824241939478L;
        ot.klqw[235] = -6973514445038479514L;
        ot.klqw[236] = 4114121211141131751L;
        ot.klqw[237] = 8675377848980827922L;
        ot.klqw[238] = 8731713167268802655L;
        ot.klqw[239] = -3769625142328863553L;
        ot.klqw[240] = 9217236877702650698L;
        ot.klqw[241] = 950677806212124616L;
        ot.klqw[242] = 618285206475142494L;
        ot.klqw[243] = -2409706038911054965L;
        ot.klqw[244] = -8104527300820007642L;
        ot.klqw[245] = 345760266972543522L;
        ot.klqw[246] = -1922582309821164467L;
        ot.klqw[247] = 7471864305950536635L;
        ot.klqw[248] = -8846661640587260217L;
        ot.klqw[249] = 5587486307065667098L;
        ot.klqw[250] = -7582773998649065299L;
        ot.klqw[251] = -6987545351551272251L;
        ot.klqw[252] = 6992441036563060775L;
        ot.klqw[253] = 1961179410014549671L;
        ot.klqw[254] = 6191951965537607974L;
        ot.klqw[255] = 2701895009782632365L;
        ot.klqw[256] = -5506461403885514686L;
        ot.klqw[257] = 6874704364525246688L;
        ot.klqw[258] = 3469479790625190757L;
        ot.klqw[259] = 5461570040597536712L;
        ot.klqw[260] = 7983900187373923218L;
        ot.klqw[261] = -1825562095462577083L;
        ot.klqw[262] = -6560589168782096697L;
        ot.klqw[263] = -8805352584719325831L;
        ot.klqw[264] = -8183420760759294371L;
        ot.klqw[265] = 1218336563503330076L;
        ot.klqw[266] = -4845792080842303585L;
        ot.klqw[267] = -5834811255846209598L;
        ot.klqw[268] = -4092538757598049780L;
        ot.klqw[269] = 3813964511803188523L;
        ot.klqw[270] = -804110525620228578L;
        ot.klqw[271] = 8261595555447684L;
        ot.klqw[272] = -9148859732578134158L;
        ot.klqw[273] = -5819502902963460652L;
        ot.klqw[274] = -1733759567552788315L;
        ot.klqw[275] = 6871145361163552300L;
        ot.klqw[276] = 2186101003179278552L;
        ot.klqw[277] = 2835508752557348508L;
        ot.klqw[278] = 9045552904494822433L;
        ot.klqw[279] = 7356040746015080264L;
        ot.klqw[280] = 1011002795153380524L;
        ot.klqw[281] = 261122978497095482L;
        ot.klqw[282] = 4911844900158285366L;
        ot.klqw[283] = 1506735942316156477L;
        ot.klqw[284] = -457562334051844405L;
        ot.klqw[285] = -20671557149213728L;
        ot.klqw[286] = 9164870282536379586L;
        ot.klqw[287] = 3039718687772576916L;
        ot.klqw[288] = -4418728821149199457L;
        ot.klqw[289] = -3208302149673372175L;
        ot.klqw[290] = 2789596959876514244L;
        ot.klqw[291] = -5816371664171956591L;
        ot.klqw[292] = -1180034589058561244L;
        ot.klqw[293] = -1316962167540452291L;
        ot.klqw[294] = -4113877113022304488L;
        ot.klqw[295] = 4504315489324561112L;
        ot.klqw[296] = -8154661171557264394L;
        ot.klqw[297] = 2610406503539890384L;
        ot.klqw[298] = 2584759131437174241L;
        ot.klqw[299] = -3188670463951109163L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void releaseProvider(ds var1_1) {
        v0 /* !! */  = ot.so;
        if (true) ** GOTO lbl5
        block27: while (true) {
            v0 /* !! */  = (long)(v1 - ot.klqe("kmnd", klqv(int ), (int)194));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1858726872: {
                    v1 = ot.klqe("kmnf", klqv(int ), (int)195);
                    continue block27;
                }
                case -1271690800: {
                    break block27;
                }
                case -26123375: {
                    v1 = ot.klqe("kmng", klqv(int ), (int)196);
                    continue block27;
                }
                case 65843729: {
                    v1 = ot.klqe("kmnj", klqv(int ), (int)197);
                    continue block27;
                }
            }
            break;
        }
        var4_2 = ot.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmnm", klqv(int ), (int)198)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ot.klqe("kmnn", klpy(int ), (int)291)) break;
            v2 /* !! */  = (long)ot.klqe("kmnp", klpy(int ), (int)292);
        }
        var3_3 /* !! */  = ot.b;
        v3 /* !! */  = ot.so;
        if (true) ** GOTO lbl29
        block29: while (true) {
            v3 /* !! */  = (long)(v4 - ot.klqe("kmnr", klqv(int ), (int)199));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1714233975: {
                    v4 = ot.klqe("kmns", klqv(int ), (int)200);
                    continue block29;
                }
                case -1271690800: {
                    break block29;
                }
                case -81250448: {
                    v4 = ot.klqe("kmnv", klqv(int ), (int)201);
                    continue block29;
                }
            }
            break;
        }
        var2_4 = ot.a;
        if (var4_2) {
            throw null;
lbl41:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl41
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl41
                v5 /* !! */  = ot.so;
                if (true) ** GOTO lbl52
                block31: while (true) {
                    v5 /* !! */  = (long)(ot.klqe("kmoa", klqv(int ), (int)203) - ot.klqe("kmnz", klqv(int ), (int)202));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1271690800: {
                            break block31;
                        }
                        case 1651935873: {
                            continue block31;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ot.so;
                if (true) ** GOTO lbl61
                block32: while (true) {
                    v6 /* !! */  = (long)(ot.klqe("kmof", klqv(int ), (int)205) - ot.klqe("kmoc", klqv(int ), (int)204));
lbl61:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1271690800: {
                            break block32;
                        }
                        case 127161995: {
                            continue block32;
                        }
                    }
                    break;
                }
                this.rotationPlanTaskProcessor.releaseProvider(var1_1);
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ot.klqe("kmoh", klpy(int ), (int)293);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)ot.klqe("kmoj", klpy(int ), (int)294);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
            case 2: {
                var3_3 /* !! */  = (int)ot.klqe("kmok", klpy(int ), (int)295);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl89
            }
lbl84:
            // 2 sources

            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ot.klqe("kmom", klpy(int ), (int)296);
                    if (!var4_2) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl89:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)ot.klqe("kmoo", klpy(int ), (int)297);
                if (!var4_2) ** GOTO lbl84
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ot.klqe("kmop", klpy(int ), (int)298);
        ** while (!var4_2)
lbl96:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public ov getPreviousAngle() {
        Object object = so;
        boolean bl2 = true;
        block18: while (true) {
            CallSite callSite;
            if (!bl2 || (bl2 = false) || !true) {
                object = callSite - ot.klqe("kmyy", klqv(int ), (int)293);
            }
            switch ((int)object) {
                case -1271690800: {
                    break block18;
                }
                case 838827727: {
                    callSite = ot.klqe("kmyz", klqv(int ), (int)294);
                    continue block18;
                }
                case 1010986768: {
                    callSite = ot.klqe("kmza", klqv(int ), (int)295);
                    continue block18;
                }
                case 1449292623: {
                    callSite = ot.klqe("kmzb", klqv(int ), (int)296);
                    continue block18;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = so;
        boolean bl4 = true;
        block19: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object2 = callSite - ot.klqe("kmzc", klqv(int ), (int)297);
            }
            switch ((int)object2) {
                case -2040892404: {
                    callSite = ot.klqe("kmzd", klqv(int ), (int)298);
                    continue block19;
                }
                case -1271690800: {
                    break block19;
                }
                case 295758875: {
                    callSite = ot.klqe("kmze", klqv(int ), (int)299);
                    continue block19;
                }
                case 396044029: {
                    callSite = ot.klqe("kmzf", klqv(int ), (int)300);
                    continue block19;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = so;
        boolean bl5 = true;
        block20: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object3 = callSite - ot.klqe("kmzg", klqv(int ), (int)301);
            }
            switch ((int)object3) {
                case -1271690800: {
                    break block20;
                }
                case 10774517: {
                    callSite = ot.klqe("kmzh", klqv(int ), (int)302);
                    continue block20;
                }
                case 1483100294: {
                    callSite = ot.klqe("kmzi", klqv(int ), (int)303);
                    continue block20;
                }
                case 2126351971: {
                    callSite = ot.klqe("kmzj", klqv(int ), (int)304);
                    continue block20;
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
            if ((object4 = (l2 = so - ot.klqe("kmzk", klqv(int ), (int)305)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == ot.klqe("kmzl", klpy(int ), (int)427)) {
                return this.previousAngle;
            }
            object4 = ot.klqe("kmzm", klpy(int ), (int)428);
        }
    }

    private static /* synthetic */ void knaz() {
        ot.klqy[300] = 4776755490517312138L;
        ot.klqy[301] = 6584928189454643527L;
        ot.klqy[302] = 7211364618198728383L;
        ot.klqy[303] = 608549407391153239L;
        ot.klqy[304] = 3894319319268543776L;
        ot.klqy[305] = 5357722871940621661L;
        ot.klqy[306] = 3299242191747419751L;
        ot.klqy[307] = -2926821563054422143L;
        ot.klqy[308] = -4204515235501314561L;
        ot.klqy[309] = 989883899040328582L;
        ot.klqy[310] = -2795453443760160775L;
        ot.klqy[311] = 6929126228492315754L;
        ot.klqy[312] = 9197436902237372532L;
        ot.klqy[313] = 661149495977041574L;
        ot.klqy[314] = -2177597463825465110L;
        ot.klqy[315] = 6281401553796756488L;
        ot.klqy[316] = -4382929384378910283L;
        ot.klqy[317] = -4143059727918263593L;
        ot.klqy[318] = -6573377382691590187L;
    }

    private static /* synthetic */ void knat() {
        ot.klqw[100] = 2845314445248285031L;
        ot.klqw[101] = 3657491920596246662L;
        ot.klqw[102] = -6796614647749310486L;
        ot.klqw[103] = 3902777620571587765L;
        ot.klqw[104] = 2623898861905288538L;
        ot.klqw[105] = -2345281922524365229L;
        ot.klqw[106] = 2666343950148221489L;
        ot.klqw[107] = -3609912884150121503L;
        ot.klqw[108] = 4086931854348153991L;
        ot.klqw[109] = 534026837839642468L;
        ot.klqw[110] = -9005821241089400953L;
        ot.klqw[111] = -5570748240654328203L;
        ot.klqw[112] = -6633702404398254901L;
        ot.klqw[113] = 6064283390611746274L;
        ot.klqw[114] = -6744465787401372042L;
        ot.klqw[115] = -5909526098571044474L;
        ot.klqw[116] = 6250537096872453592L;
        ot.klqw[117] = 7087544690514767108L;
        ot.klqw[118] = 682495459934571827L;
        ot.klqw[119] = 3866932761750498442L;
        ot.klqw[120] = 7915208672187901435L;
        ot.klqw[121] = 271490954254935856L;
        ot.klqw[122] = 2505985312292932616L;
        ot.klqw[123] = -5293488159133462639L;
        ot.klqw[124] = 8472067704541779418L;
        ot.klqw[125] = -1038265060219054263L;
        ot.klqw[126] = 1123951916484096636L;
        ot.klqw[127] = -5002387311210449786L;
        ot.klqw[128] = 3215172870684267059L;
        ot.klqw[129] = -7465834943938895011L;
        ot.klqw[130] = 5367195285035180113L;
        ot.klqw[131] = -844591422887241494L;
        ot.klqw[132] = 2118833410158942112L;
        ot.klqw[133] = 5220438771433945645L;
        ot.klqw[134] = 591878328858123872L;
        ot.klqw[135] = 4059998669043411768L;
        ot.klqw[136] = 5553704688524929946L;
        ot.klqw[137] = 6732469584523664980L;
        ot.klqw[138] = 7738807787669981213L;
        ot.klqw[139] = -4369039403953170561L;
        ot.klqw[140] = -6692194296813660675L;
        ot.klqw[141] = 7527511854716138013L;
        ot.klqw[142] = 2409699882494578788L;
        ot.klqw[143] = 2630891359742727544L;
        ot.klqw[144] = -3647499157968375496L;
        ot.klqw[145] = 6235582476872987283L;
        ot.klqw[146] = 1828734859602355160L;
        ot.klqw[147] = 8297305713533887660L;
        ot.klqw[148] = 6243795646585941329L;
        ot.klqw[149] = -7569608131001396382L;
        ot.klqw[150] = -6447942958922336503L;
        ot.klqw[151] = 370333931581945246L;
        ot.klqw[152] = -904590031384976795L;
        ot.klqw[153] = 6021218741928232168L;
        ot.klqw[154] = 8593723271877968114L;
        ot.klqw[155] = -2340316802758533919L;
        ot.klqw[156] = -7275614372935244147L;
        ot.klqw[157] = 5606201947208314937L;
        ot.klqw[158] = -2845947606663499827L;
        ot.klqw[159] = 2238033662256501075L;
        ot.klqw[160] = 8475775652191601350L;
        ot.klqw[161] = -5027471298074527050L;
        ot.klqw[162] = 1527398282925839517L;
        ot.klqw[163] = 1316271836131452341L;
        ot.klqw[164] = -5910985985032040281L;
        ot.klqw[165] = 7290069824248539521L;
        ot.klqw[166] = 7213544461132229251L;
        ot.klqw[167] = 9080930737496538250L;
        ot.klqw[168] = -7524144616282403125L;
        ot.klqw[169] = 9165197707989447611L;
        ot.klqw[170] = -6994079105487221692L;
        ot.klqw[171] = 5518414657174042632L;
        ot.klqw[172] = 6091469219414911322L;
        ot.klqw[173] = -7051564723653075486L;
        ot.klqw[174] = 1259795700968561052L;
        ot.klqw[175] = 7491274625871145109L;
        ot.klqw[176] = -4116306201954223774L;
        ot.klqw[177] = 3883065720995287297L;
        ot.klqw[178] = -266263092937732164L;
        ot.klqw[179] = -5749656326404606991L;
        ot.klqw[180] = 380333168155275664L;
        ot.klqw[181] = 3817745766670876885L;
        ot.klqw[182] = -8575841324458103917L;
        ot.klqw[183] = -3974522872805470883L;
        ot.klqw[184] = -1960693130253108866L;
        ot.klqw[185] = -2179676158483472338L;
        ot.klqw[186] = 4722730448352726402L;
        ot.klqw[187] = 688812611127636095L;
        ot.klqw[188] = -4852289933900122868L;
        ot.klqw[189] = 6969692930151692231L;
        ot.klqw[190] = 5581255101405759952L;
        ot.klqw[191] = 7237529955127065192L;
        ot.klqw[192] = 8633995502468563447L;
        ot.klqw[193] = -7956994481470166518L;
        ot.klqw[194] = 3550984421355286195L;
        ot.klqw[195] = 6698985253417255821L;
        ot.klqw[196] = 3195116993110522550L;
        ot.klqw[197] = -4296675522051771994L;
        ot.klqw[198] = -6319385196655024641L;
        ot.klqw[199] = -6716813411255130283L;
    }

    private static /* synthetic */ void knax() {
        ot.klqy[100] = 8213410129983488907L;
        ot.klqy[101] = -694332281818555780L;
        ot.klqy[102] = -4729130051585254522L;
        ot.klqy[103] = 354610844553052291L;
        ot.klqy[104] = 2528860533256386894L;
        ot.klqy[105] = 3717330523801816892L;
        ot.klqy[106] = -8755147321601762354L;
        ot.klqy[107] = -7491622337591977545L;
        ot.klqy[108] = -3273129550981369235L;
        ot.klqy[109] = -2822187615992006930L;
        ot.klqy[110] = 5788460884924647663L;
        ot.klqy[111] = 8276485451083001031L;
        ot.klqy[112] = -6532970984297282001L;
        ot.klqy[113] = 4218294642093516052L;
        ot.klqy[114] = 972537599418219779L;
        ot.klqy[115] = 3111445202421659908L;
        ot.klqy[116] = -8959501091131054381L;
        ot.klqy[117] = -5227774677721514021L;
        ot.klqy[118] = -295245973865991318L;
        ot.klqy[119] = -5650785620620471067L;
        ot.klqy[120] = -6509001769129037480L;
        ot.klqy[121] = 7365663410164010639L;
        ot.klqy[122] = -7002372515029339075L;
        ot.klqy[123] = -106575235272825436L;
        ot.klqy[124] = 3214984298570363100L;
        ot.klqy[125] = -8679922539484044568L;
        ot.klqy[126] = -4903205643102228082L;
        ot.klqy[127] = -7209439231057828015L;
        ot.klqy[128] = 993967606179489065L;
        ot.klqy[129] = -2123363563395836893L;
        ot.klqy[130] = -3565362005906300259L;
        ot.klqy[131] = 7964854477718193121L;
        ot.klqy[132] = -6570514564227924179L;
        ot.klqy[133] = 4783198217274195607L;
        ot.klqy[134] = 2124008098149668752L;
        ot.klqy[135] = -1860939609698625839L;
        ot.klqy[136] = 7101656372203101160L;
        ot.klqy[137] = 3475818773527050607L;
        ot.klqy[138] = 2290920637457988233L;
        ot.klqy[139] = -1616022124648921517L;
        ot.klqy[140] = -3058864497732536121L;
        ot.klqy[141] = 6764703792055778214L;
        ot.klqy[142] = -4931877824034908368L;
        ot.klqy[143] = -4571070488100609100L;
        ot.klqy[144] = 1754175646008014273L;
        ot.klqy[145] = -4124866907776924783L;
        ot.klqy[146] = 8874735181489296698L;
        ot.klqy[147] = 7516913292122653577L;
        ot.klqy[148] = -4036428041322624650L;
        ot.klqy[149] = 5177479776909665313L;
        ot.klqy[150] = -240969354114773451L;
        ot.klqy[151] = 2375911886565652479L;
        ot.klqy[152] = -923195128162230769L;
        ot.klqy[153] = -1574440017151156060L;
        ot.klqy[154] = -505487230808838885L;
        ot.klqy[155] = 5601082489746959854L;
        ot.klqy[156] = -3387705832981383213L;
        ot.klqy[157] = 6526756045776044685L;
        ot.klqy[158] = 1228791952536737737L;
        ot.klqy[159] = 2358164118815293435L;
        ot.klqy[160] = -1677677897314516993L;
        ot.klqy[161] = 6158226886475676178L;
        ot.klqy[162] = 5592491850349859441L;
        ot.klqy[163] = -2291896266938903802L;
        ot.klqy[164] = 785502194439607524L;
        ot.klqy[165] = -2614270657741675164L;
        ot.klqy[166] = -5656721415340343650L;
        ot.klqy[167] = 2139258232259665864L;
        ot.klqy[168] = 89536006151682456L;
        ot.klqy[169] = -6516349514263904918L;
        ot.klqy[170] = -4921315509762034267L;
        ot.klqy[171] = 317031060490544228L;
        ot.klqy[172] = -8974559305557056308L;
        ot.klqy[173] = -100083028479454329L;
        ot.klqy[174] = -7936529105096540195L;
        ot.klqy[175] = -9129437772722906836L;
        ot.klqy[176] = -8298939355263069443L;
        ot.klqy[177] = -901583605754440926L;
        ot.klqy[178] = -3051506324763641505L;
        ot.klqy[179] = 8748581126789459308L;
        ot.klqy[180] = 4268815355067834072L;
        ot.klqy[181] = 3136553196769762935L;
        ot.klqy[182] = 4720583259616442470L;
        ot.klqy[183] = -1687320691650735401L;
        ot.klqy[184] = 1740055882525067305L;
        ot.klqy[185] = 6331858388844636729L;
        ot.klqy[186] = -2516613536002009479L;
        ot.klqy[187] = -2474915390788959826L;
        ot.klqy[188] = 116079029647663031L;
        ot.klqy[189] = 6960998227458792906L;
        ot.klqy[190] = 8840463479778059158L;
        ot.klqy[191] = 6826939001089798309L;
        ot.klqy[192] = -73499941484366355L;
        ot.klqy[193] = 7461204016669475332L;
        ot.klqy[194] = -4039921931989315455L;
        ot.klqy[195] = -9070987728839633951L;
        ot.klqy[196] = -7029613567763631339L;
        ot.klqy[197] = 2658019180309040136L;
        ot.klqy[198] = 4200231606484565292L;
        ot.klqy[199] = 8920926306525151446L;
    }

    static {
        klpz = new int[437];
        klqc = new int[437];
        ot.knai();
        ot.knaj();
        ot.knak();
        ot.knal();
        ot.knam();
        ot.knan();
        ot.knao();
        ot.knap();
        ot.knaq();
        ot.knar();
        klqw = new long[319];
        klqy = new long[319];
        ot.knas();
        ot.knat();
        ot.knau();
        ot.knav();
        ot.knaw();
        ot.knax();
        ot.knay();
        ot.knaz();
        INSTANCE = new ot();
    }

    private static /* synthetic */ double kmje(int n2) {
        return Double.longBitsToDouble(klqw[n2] ^ klqy[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static float computeAngleDifference(float var0, float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmki", klqv(int ), (int)174)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ot.klqe("kmkj", klpy(int ), (int)243)) break;
            v0 /* !! */  = (long)ot.klqe("kmkk", klpy(int ), (int)244);
        }
        var4_2 = ot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmkl", klqv(int ), (int)175)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ot.klqe("kmkm", klpy(int ), (int)245)) break;
            v1 /* !! */  = (long)ot.klqe("kmkn", klpy(int ), (int)246);
        }
        var3_3 /* !! */  = ot.b;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl19
        block16: while (true) {
            v2 /* !! */  = (long)(ot.klqe("kmkp", klqv(int ), (int)177) - ot.klqe("kmko", klqv(int ), (int)176));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1271690800: {
                    break block16;
                }
                case 1991727555: {
                    continue block16;
                }
            }
            break;
        }
        var2_4 = ot.a;
        if (var4_2) {
            throw null;
lbl27:
            // 2 sources

            return (float)ot.klqe("kmkr", kmkq(int ), (int)247);
        }
        if (var2_4) ** GOTO lbl27
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v3 /* !! */  = ot.so;
                if (true) ** GOTO lbl38
                block18: while (true) {
                    v3 /* !! */  = (long)(ot.klqe("kmkt", klqv(int ), (int)179) - ot.klqe("kmks", klqv(int ), (int)178));
lbl38:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1271690800: {
                            break block18;
                        }
                        case 767025213: {
                            continue block18;
                        }
                    }
                    break;
                }
                return class_3532.method_15393((float)(var0 - var1_1));
            }
            case 0: {
                do {
                    var3_3 /* !! */  = (int)ot.klqe("kmku", klpy(int ), (int)248);
                } while (!var4_2);
                throw null;
            }
            case 1: {
                do {
                    var3_3 /* !! */  = (int)ot.klqe("kmkv", klpy(int ), (int)249);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)ot.klqe("kmkw", klpy(int ), (int)250);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)ot.klqe("kmkx", klpy(int ), (int)251);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void knam() {
        ot.klpz[400] = 1285775860;
        ot.klpz[401] = -129565872;
        ot.klpz[402] = -1216020589;
        ot.klpz[403] = -805522938;
        ot.klpz[404] = -839355565;
        ot.klpz[405] = -2053199409;
        ot.klpz[406] = -2086196194;
        ot.klpz[407] = 1672930560;
        ot.klpz[408] = -655093491;
        ot.klpz[409] = -1152128202;
        ot.klpz[410] = -13535886;
        ot.klpz[411] = 338209801;
        ot.klpz[412] = -467082575;
        ot.klpz[413] = 896832303;
        ot.klpz[414] = -1293072470;
        ot.klpz[415] = -1684576632;
        ot.klpz[416] = -1371739818;
        ot.klpz[417] = 871610197;
        ot.klpz[418] = 1259285028;
        ot.klpz[419] = -1824997505;
        ot.klpz[420] = -1147196702;
        ot.klpz[421] = -1066858179;
        ot.klpz[422] = -896985569;
        ot.klpz[423] = -1008683315;
        ot.klpz[424] = -543028333;
        ot.klpz[425] = 479249152;
        ot.klpz[426] = -1169488353;
        ot.klpz[427] = 1221722165;
        ot.klpz[428] = 1209430888;
        ot.klpz[429] = 1719125239;
        ot.klpz[430] = 603683119;
        ot.klpz[431] = 1210138231;
        ot.klpz[432] = 896195668;
        ot.klpz[433] = -345869412;
        ot.klpz[434] = 614726458;
        ot.klpz[435] = -221707701;
        ot.klpz[436] = -1943833872;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void rotateTo(ov var1_1, int var2_2, os var3_3, nn var4_4, ds var5_5) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmds", klqv(int ), (int)120)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ot.klqe("kmdt", klpy(int ), (int)126)) break;
            v0 /* !! */  = (long)ot.klqe("kmdu", klpy(int ), (int)127);
        }
        var8_6 = ot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmdv", klqv(int ), (int)121)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ot.klqe("kmdw", klpy(int ), (int)128)) break;
            v1 /* !! */  = (long)ot.klqe("kmdx", klpy(int ), (int)129);
        }
        var7_7 /* !! */  = ot.b;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl17
        block14: while (true) {
            v2 /* !! */  = (long)(ot.klqe("kmdz", klqv(int ), (int)123) - ot.klqe("kmdy", klqv(int ), (int)122));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1271690800: {
                    break block14;
                }
                case 28100551: {
                    continue block14;
                }
            }
            break;
        }
        var6_8 = ot.a;
        if (var8_6) {
            throw null;
lbl25:
            // 2 sources

            return;
        }
        if (var6_8 || var6_8) ** GOTO lbl25
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmea", klqv(int ), (int)124)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ot.klqe("kmeb", klpy(int ), (int)130)) break;
            v3 /* !! */  = (long)ot.klqe("kmec", klpy(int ), (int)131);
        }
        v4 = var1_1.toVector();
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kmed", klqv(int ), (int)125)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ot.klqe("kmee", klpy(int ), (int)132)) break;
            v5 /* !! */  = (long)ot.klqe("kmef", klpy(int ), (int)133);
        }
        v6 = var3_3.createRotationPlan(var1_1, v4, null, var2_2);
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = ot.so - ot.klqe("kmeg", klqv(int ), (int)126)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v7 /* !! */  == ot.klqe("kmeh", klpy(int ), (int)134)) break;
            v7 /* !! */  = (long)ot.klqe("kmei", klpy(int ), (int)135);
        }
        this.rotateTo(v6, var4_4, var5_5);
        ** while (var6_8 || var6_8)
lbl47:
        // 1 sources

        if (var7_7 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_7 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
lbl51:
            // 3 sources

            case 0: {
                var7_7 /* !! */  = (int)ot.klqe("kmej", klpy(int ), (int)136);
                if (var8_6) {
                    throw null;
                }
                ** GOTO lbl68
            }
            case 1: {
                var7_7 /* !! */  = (int)ot.klqe("kmek", klpy(int ), (int)137);
                if (!var8_6) ** GOTO lbl51
                throw null;
            }
lbl60:
            // 2 sources

            case 2: {
                var7_7 /* !! */  = (int)ot.klqe("kmel", klpy(int ), (int)138);
                if (!var8_6) ** GOTO lbl51
                throw null;
            }
            case 3: {
                var7_7 /* !! */  = (int)ot.klqe("kmem", klpy(int ), (int)139);
                if (var8_6) {
                    throw null;
                }
            }
lbl68:
            // 4 sources

            case 4: {
                var7_7 /* !! */  = (int)ot.klqe("kmen", klpy(int ), (int)140);
                if (!var8_6) ** GOTO lbl60
                throw null;
            }
            case 5: 
        }
        do {
            var7_7 /* !! */  = (int)ot.klqe("kmeo", klpy(int ), (int)141);
        } while (!var8_6);
        throw null;
    }

    private static /* synthetic */ void knay() {
        ot.klqy[200] = 1506748558083078651L;
        ot.klqy[201] = -4676975585154970102L;
        ot.klqy[202] = -3004959715160248274L;
        ot.klqy[203] = 2502617478696288969L;
        ot.klqy[204] = -5506229883249547916L;
        ot.klqy[205] = 8410431773048912258L;
        ot.klqy[206] = 5079346529917374177L;
        ot.klqy[207] = -2967358538345682543L;
        ot.klqy[208] = -8248423851245211945L;
        ot.klqy[209] = -2233740533658384929L;
        ot.klqy[210] = -6029817259036452377L;
        ot.klqy[211] = 5090265916864378849L;
        ot.klqy[212] = 2964939003054756857L;
        ot.klqy[213] = -3448946069565358436L;
        ot.klqy[214] = -8107056042434238865L;
        ot.klqy[215] = -2055459798176689374L;
        ot.klqy[216] = -4335812693725762755L;
        ot.klqy[217] = -2084015834737342626L;
        ot.klqy[218] = 7701390734203035525L;
        ot.klqy[219] = -3377957579955323776L;
        ot.klqy[220] = -6624167623341832018L;
        ot.klqy[221] = -4263898987298378895L;
        ot.klqy[222] = 6585708524629836586L;
        ot.klqy[223] = 8906483009588995645L;
        ot.klqy[224] = -1910209099288720239L;
        ot.klqy[225] = -6296008184739749617L;
        ot.klqy[226] = 2938884315286820274L;
        ot.klqy[227] = 4915601692941872108L;
        ot.klqy[228] = -3614530961789371710L;
        ot.klqy[229] = -3042404510147946360L;
        ot.klqy[230] = 2511451673884310347L;
        ot.klqy[231] = 6488290581499719865L;
        ot.klqy[232] = 2035864962676496554L;
        ot.klqy[233] = 5286147647483285536L;
        ot.klqy[234] = -7356065292912186711L;
        ot.klqy[235] = 1255481818695118356L;
        ot.klqy[236] = -8378375874955175783L;
        ot.klqy[237] = -8798652891233161307L;
        ot.klqy[238] = -3537720858929040652L;
        ot.klqy[239] = 7192762739952654444L;
        ot.klqy[240] = -9158601242794665919L;
        ot.klqy[241] = 3215127215439758016L;
        ot.klqy[242] = -5771744466261088814L;
        ot.klqy[243] = 3255070947811863163L;
        ot.klqy[244] = 8740353360640143735L;
        ot.klqy[245] = 590992556218186653L;
        ot.klqy[246] = 6033772316127197837L;
        ot.klqy[247] = -4796503939967735058L;
        ot.klqy[248] = -7190348786155956748L;
        ot.klqy[249] = -8743051309315495183L;
        ot.klqy[250] = 1289869923325953961L;
        ot.klqy[251] = -6613863865056101389L;
        ot.klqy[252] = -8297296523829634061L;
        ot.klqy[253] = 8055578789248706173L;
        ot.klqy[254] = 4949489109832750381L;
        ot.klqy[255] = -2491716423373026145L;
        ot.klqy[256] = -5215057426779545020L;
        ot.klqy[257] = 3370356039332825352L;
        ot.klqy[258] = 6818259780132398611L;
        ot.klqy[259] = -6239975331700951201L;
        ot.klqy[260] = 2169686014924101594L;
        ot.klqy[261] = -3744275588823639538L;
        ot.klqy[262] = -3630611972297612930L;
        ot.klqy[263] = -5159414800495964327L;
        ot.klqy[264] = 3132464439235715903L;
        ot.klqy[265] = -1262638259430505605L;
        ot.klqy[266] = -3544783954837025343L;
        ot.klqy[267] = -5954186354724098967L;
        ot.klqy[268] = 7405370003007627910L;
        ot.klqy[269] = 1163237435994104686L;
        ot.klqy[270] = 3426049206953742842L;
        ot.klqy[271] = -4139539205027677977L;
        ot.klqy[272] = 8432472984477404142L;
        ot.klqy[273] = -4838756735909438013L;
        ot.klqy[274] = 1284141194469261930L;
        ot.klqy[275] = -7751446211717020551L;
        ot.klqy[276] = -8090181903161760888L;
        ot.klqy[277] = 5714587438878673484L;
        ot.klqy[278] = 5130471900461762242L;
        ot.klqy[279] = 5783776196237467308L;
        ot.klqy[280] = 1459329084943957655L;
        ot.klqy[281] = 6840576663383489434L;
        ot.klqy[282] = 7623223171493908832L;
        ot.klqy[283] = 2393045969156085479L;
        ot.klqy[284] = 5188774494940883806L;
        ot.klqy[285] = -7014080316274062297L;
        ot.klqy[286] = -6593481797462264289L;
        ot.klqy[287] = -645306813868984318L;
        ot.klqy[288] = -4606970659976520303L;
        ot.klqy[289] = 1073816350638429747L;
        ot.klqy[290] = 898171749601915212L;
        ot.klqy[291] = 4056945073171949330L;
        ot.klqy[292] = -5274587072550940290L;
        ot.klqy[293] = 8850322718306807553L;
        ot.klqy[294] = -2600763964808249967L;
        ot.klqy[295] = -5355694246973822298L;
        ot.klqy[296] = -5190094703812351645L;
        ot.klqy[297] = -2095958986557063849L;
        ot.klqy[298] = 5766509117984265242L;
        ot.klqy[299] = 731086447603669215L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 fixVelocity(class_243 var1_1, class_243 var2_2, float var3_3) {
        block55: {
            block54: {
                block53: {
                    var12_4 = ot.c;
                    var11_5 /* !! */  = ot.b;
                    var10_6 = ot.a;
                    if (var12_4) {
                        throw null;
lbl6:
                        // 13 sources

                        return null;
                    }
                    if (var10_6 || var10_6) ** GOTO lbl6
                    if (this.currentAngle == null) ** GOTO lbl41
                    if (var10_6 || var10_6) ** GOTO lbl6
                    var4_7 = this.currentAngle.getYaw();
                    if (var10_6 || var10_6) ** GOTO lbl6
                    var5_8 = var2_2.method_1027();
                    if (var10_6 || var10_6) ** GOTO lbl6
                    if (!(var5_8 < ot.klqe("kmky", kmje(int ), (int)180))) break block53;
                    if (var10_6 || var10_6) ** GOTO lbl6
                    return class_243.field_1353;
                }
                if (var10_6 || var10_6) ** GOTO lbl6
                if (!(var5_8 > 1.0)) break block54;
                if (var10_6) ** GOTO lbl6
                v0 = var2_2.method_1029();
                if (var12_4) {
                    throw null;
                }
                break block55;
            }
            if (var10_6 || var10_6) ** GOTO lbl6
            v0 = var2_2;
        }
        var7_9 = v0.method_1021((double)var3_3);
        if (var10_6) ** GOTO lbl6
        if (var11_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var11_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var10_6) ** GOTO lbl6
                var8_10 = class_3532.method_15374((double)(var4_7 * ot.klqe("kmkz", kmkq(int ), (int)252)));
                if (var10_6 || var10_6) ** GOTO lbl6
                var9_11 = class_3532.method_15362((double)(var4_7 * ot.klqe("kmla", kmkq(int ), (int)253)));
                if (var10_6 || var10_6) ** GOTO lbl6
                return new class_243(var7_9.method_10216() * (double)var9_11 - var7_9.method_10215() * (double)var8_10, var7_9.method_10214(), var7_9.method_10215() * (double)var9_11 + var7_9.method_10216() * (double)var8_10);
            }
lbl41:
            // 1 sources

            if (!var10_6 && !var10_6) ** break;
            ** continue;
            return var1_1;
lbl44:
            // 2 sources

            case 0: {
                var11_5 /* !! */  = (int)ot.klqe("kmlb", klpy(int ), (int)254);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl63
            }
lbl49:
            // 2 sources

            case 1: {
                var11_5 /* !! */  = (int)ot.klqe("kmlc", klpy(int ), (int)255);
                if (var12_4) {
                    throw null;
                }
            }
            case 2: {
                var11_5 /* !! */  = (int)ot.klqe("kmld", klpy(int ), (int)256);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl114
            }
            case 3: {
                var11_5 /* !! */  = (int)ot.klqe("kmle", klpy(int ), (int)257);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl87
            }
lbl63:
            // 5 sources

            case 4: {
                var11_5 /* !! */  = (int)ot.klqe("kmlf", klpy(int ), (int)258);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl73
            }
lbl68:
            // 4 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var11_5 /* !! */  = (int)ot.klqe("kmlg", klpy(int ), (int)259);
                    if (!var12_4) ** GOTO lbl63
                    throw null;
                }
            }
lbl73:
            // 3 sources

            case 6: {
                var11_5 /* !! */  = (int)ot.klqe("kmlh", klpy(int ), (int)260);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 7: {
                var11_5 /* !! */  = (int)ot.klqe("kmli", klpy(int ), (int)261);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl101
            }
            case 8: {
                var11_5 /* !! */  = (int)ot.klqe("kmlj", klpy(int ), (int)262);
                if (!var12_4) ** GOTO lbl63
                throw null;
            }
lbl87:
            // 2 sources

            case 9: {
                var11_5 /* !! */  = (int)ot.klqe("kmlk", klpy(int ), (int)263);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl92:
            // 2 sources

            case 10: {
                var11_5 /* !! */  = (int)ot.klqe("kmll", klpy(int ), (int)264);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl133
            }
lbl97:
            // 2 sources

            case 11: {
                var11_5 /* !! */  = (int)ot.klqe("kmlm", klpy(int ), (int)265);
                if (!var12_4) ** GOTO lbl49
                throw null;
            }
lbl101:
            // 2 sources

            case 12: {
                var11_5 /* !! */  = (int)ot.klqe("kmln", klpy(int ), (int)266);
                if (!var12_4) ** GOTO lbl63
                throw null;
            }
lbl105:
            // 2 sources

            case 13: {
                var11_5 /* !! */  = (int)ot.klqe("kmlo", klpy(int ), (int)267);
                if (!var12_4) ** GOTO lbl68
                throw null;
            }
            case 14: {
                var11_5 /* !! */  = (int)ot.klqe("kmlp", klpy(int ), (int)268);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl114:
            // 2 sources

            case 15: {
                var11_5 /* !! */  = (int)ot.klqe("kmlq", klpy(int ), (int)269);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl124
            }
            case 16: {
                var11_5 /* !! */  = (int)ot.klqe("kmlr", klpy(int ), (int)270);
                if (var12_4) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl124:
            // 2 sources

            case 17: {
                do {
                    var11_5 /* !! */  = (int)ot.klqe("kmls", klpy(int ), (int)271);
                } while (!var12_4);
                throw null;
            }
lbl129:
            // 3 sources

            case 18: {
                var11_5 /* !! */  = (int)ot.klqe("kmlt", klpy(int ), (int)272);
                if (!var12_4) ** GOTO lbl73
                throw null;
            }
lbl133:
            // 2 sources

            case 19: {
                var11_5 /* !! */  = (int)ot.klqe("kmlu", klpy(int ), (int)273);
                if (!var12_4) ** GOTO lbl129
                throw null;
            }
            case 20: {
                var11_5 /* !! */  = (int)ot.klqe("kmlv", klpy(int ), (int)274);
                if (!var12_4) ** GOTO lbl129
                throw null;
            }
            case 21: {
                var11_5 /* !! */  = (int)ot.klqe("kmlw", klpy(int ), (int)275);
                if (!var12_4) ** GOTO lbl68
                throw null;
            }
            case 22: {
                var11_5 /* !! */  = (int)ot.klqe("kmlx", klpy(int ), (int)276);
                if (!var12_4) ** GOTO lbl92
                throw null;
            }
lbl149:
            // 3 sources

            case 23: {
                var11_5 /* !! */  = (int)ot.klqe("kmly", klpy(int ), (int)277);
                if (!var12_4) break;
                throw null;
            }
            case 24: {
                var11_5 /* !! */  = (int)ot.klqe("kmlz", klpy(int ), (int)278);
                if (!var12_4) ** GOTO lbl68
                throw null;
            }
            case 25: {
                var11_5 /* !! */  = (int)ot.klqe("kmma", klpy(int ), (int)279);
                if (!var12_4) ** GOTO lbl44
                throw null;
            }
            case 26: 
        }
        var11_5 /* !! */  = (int)ot.klqe("kmmb", klpy(int ), (int)280);
        ** while (!var12_4)
lbl164:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void forceStop() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ot.so - ot.klqe("kmot", klqv(int ), (int)206)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ot.klqe("kmov", klpy(int ), (int)299)) break;
            v0 /* !! */  = (long)ot.klqe("kmow", klpy(int ), (int)300);
        }
        var3_1 = ot.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ot.so - ot.klqe("kmoy", klqv(int ), (int)207)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ot.klqe("kmpa", klpy(int ), (int)301)) break;
            v1 /* !! */  = (long)ot.klqe("kmpb", klpy(int ), (int)302);
        }
        var2_2 /* !! */  = ot.b;
        v2 /* !! */  = ot.so;
        if (true) ** GOTO lbl17
        block45: while (true) {
            v2 /* !! */  = (long)(v3 - ot.klqe("kmpc", klqv(int ), (int)208));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1271690800: {
                    break block45;
                }
                case 549984381: {
                    v3 = ot.klqe("kmpe", klqv(int ), (int)209);
                    continue block45;
                }
                case 874935215: {
                    v3 = ot.klqe("kmpg", klqv(int ), (int)210);
                    continue block45;
                }
                case 994332174: {
                    v3 = ot.klqe("kmpi", klqv(int ), (int)211);
                    continue block45;
                }
            }
            break;
        }
        var1_3 = ot.a;
        if (var3_1) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 /* !! */  = ot.so;
        if (true) ** GOTO lbl39
        block47: while (true) {
            v4 /* !! */  = (long)(ot.klqe("kmpo", klqv(int ), (int)213) - ot.klqe("kmpm", klqv(int ), (int)212));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1271690800: {
                    break block47;
                }
                case 491128105: {
                    continue block47;
                }
            }
            break;
        }
        v5 /* !! */  = ot.so;
        if (true) ** GOTO lbl48
        block48: while (true) {
            v5 /* !! */  = (long)(v6 - ot.klqe("kmpp", klqv(int ), (int)214));
lbl48:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1271690800: {
                    break block48;
                }
                case -1080312048: {
                    v6 = ot.klqe("kmpq", klqv(int ), (int)215);
                    continue block48;
                }
                case 522807319: {
                    v6 = ot.klqe("kmpr", klqv(int ), (int)216);
                    continue block48;
                }
                case 757505155: {
                    v6 = ot.klqe("kmps", klqv(int ), (int)217);
                    continue block48;
                }
            }
            break;
        }
        v7 = this.rotationPlanTaskProcessor.activeTasks;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_2 = ot.so - ot.klqe("kmpt", klqv(int ), (int)218)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == ot.klqe("kmpu", klpy(int ), (int)303)) break;
            v8 /* !! */  = (long)ot.klqe("kmpw", klpy(int ), (int)304);
        }
        v7.clear();
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_3 = ot.so - ot.klqe("kmpx", klqv(int ), (int)219)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ot.klqe("kmpy", klpy(int ), (int)305)) break;
            v9 /* !! */  = (long)ot.klqe("kmpz", klpy(int ), (int)306);
        }
        v10 = ot.klqe("kmqa", klpy(int ), (int)307);
        v11 /* !! */  = ot.so;
        if (true) ** GOTO lbl78
        block51: while (true) {
            v11 /* !! */  = (long)(v12 - ot.klqe("kmqc", klqv(int ), (int)220));
lbl78:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1501639299: {
                    v12 = ot.klqe("kmqf", klqv(int ), (int)221);
                    continue block51;
                }
                case -1271690800: {
                    break block51;
                }
                case 353940108: {
                    v12 = ot.klqe("kmqh", klqv(int ), (int)222);
                    continue block51;
                }
                case 1521675796: {
                    v12 = ot.klqe("kmqj", klqv(int ), (int)223);
                    continue block51;
                }
            }
            break;
        }
        this.rotationPlanTaskProcessor.tickCounter = (int)v10;
        if (var1_3 || var1_3) ** GOTO lbl32
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_4 = ot.so - ot.klqe("kmqm", klqv(int ), (int)224)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ot.klqe("kmqo", klpy(int ), (int)308)) break;
            v13 /* !! */  = (long)ot.klqe("kmqq", klpy(int ), (int)309);
        }
        this.lastRotationPlan = null;
        if (var1_3 || var1_3) ** GOTO lbl32
        v14 /* !! */  = ot.so;
        if (true) ** GOTO lbl103
        block53: while (true) {
            v14 /* !! */  = (long)(v15 - ot.klqe("kmqt", klqv(int ), (int)225));
lbl103:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1271690800: {
                    break block53;
                }
                case 964941038: {
                    v15 = ot.klqe("kmqv", klqv(int ), (int)226);
                    continue block53;
                }
                case 1092545367: {
                    v15 = ot.klqe("kmqw", klqv(int ), (int)227);
                    continue block53;
                }
            }
            break;
        }
        this.currentAngle = null;
        if (var1_3 || var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = ot.so - ot.klqe("kmqz", klqv(int ), (int)228)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ot.klqe("kmrc", klpy(int ), (int)310)) break;
                    v16 /* !! */  = (long)ot.klqe("kmre", klpy(int ), (int)311);
                }
                this.previousAngle = null;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl125:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ot.klqe("kmrg", klpy(int ), (int)312);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 1: {
                var2_2 /* !! */  = (int)ot.klqe("kmri", klpy(int ), (int)313);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl149
            }
lbl135:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ot.klqe("kmrj", klpy(int ), (int)314);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl144
            }
            case 3: {
                var2_2 /* !! */  = (int)ot.klqe("kmrk", klpy(int ), (int)315);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
lbl144:
            // 4 sources

            case 4: {
                var2_2 /* !! */  = (int)ot.klqe("kmrm", klpy(int ), (int)316);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl149:
            // 3 sources

            case 5: {
                var2_2 /* !! */  = (int)ot.klqe("kmro", klpy(int ), (int)317);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ot.klqe("kmrr", klpy(int ), (int)318);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl167
                    break;
                }
            }
lbl159:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)ot.klqe("kmrt", klpy(int ), (int)319);
                if (!var3_1) ** GOTO lbl125
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)ot.klqe("kmsj", klpy(int ), (int)320);
                if (!var3_1) ** GOTO lbl159
                throw null;
            }
lbl167:
            // 3 sources

            case 9: {
                var2_2 /* !! */  = (int)ot.klqe("kmsk", klpy(int ), (int)321);
                if (!var3_1) ** GOTO lbl149
                throw null;
            }
            case 10: {
                do {
                    var2_2 /* !! */  = (int)ot.klqe("kmsl", klpy(int ), (int)322);
                } while (!var3_1);
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)ot.klqe("kmsm", klpy(int ), (int)323);
                if (!var3_1) ** GOTO lbl144
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)ot.klqe("kmsn", klpy(int ), (int)324);
                if (!var3_1) break;
                throw null;
            }
            case 13: 
        }
        var2_2 /* !! */  = (int)ot.klqe("kmso", klpy(int ), (int)325);
        ** while (!var3_1)
lbl187:
        // 1 sources

        throw null;
    }
}

