/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2382
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_3532
 *  net.minecraft.class_3965
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
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_742;
import net.minecraft.class_746;
import ruhack.phobia.aw;
import ruhack.phobia.cn;
import ruhack.phobia.df;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.hb;
import ruhack.phobia.ht$Placement;
import ruhack.phobia.ht$Stage;
import ruhack.phobia.hy;
import ruhack.phobia.jx;
import ruhack.phobia.ka;
import ruhack.phobia.nn;
import ruhack.phobia.nv;
import ruhack.phobia.os;
import ruhack.phobia.ot;
import ruhack.phobia.ow;
import ruhack.phobia.pp;

public class ht
extends ds {
    public static final long dn = -7741184122754272165L;
    private class_1268 hand;
    private int previousSlot;
    public static final int b;
    private static long[] bjyg;
    private ht$Placement placement;
    private final ka webTrapBind;
    private static long[] bjye;
    private static int[] bjwt;
    private final Set<class_2338> anchorFootprint;
    private static final double TARGET_RANGE = 5.0;
    private ht$Stage stage;
    private final os placementRotation;
    public static final boolean c;
    private static int[] bjwr;
    private final ArrayDeque<class_2338> pendingPositions;
    private static final double BOX_EPSILON = 1.0E-5;
    private class_1657 target;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void clearState() {
        v0 /* !! */  = ht.dn;
        if (true) ** GOTO lbl5
        block61: while (true) {
            v0 /* !! */  = (long)(v1 - ht.bjwv("bmkz", bjyc(int ), (int)239));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1777999455: {
                    v1 = ht.bjwv("bmla", bjyc(int ), (int)240);
                    continue block61;
                }
                case 240546907: {
                    break block61;
                }
                case 1025115994: {
                    v1 = ht.bjwv("bmlb", bjyc(int ), (int)241);
                    continue block61;
                }
            }
            break;
        }
        var3_1 = ht.c;
        v2 /* !! */  = ht.dn;
        if (true) ** GOTO lbl19
        block62: while (true) {
            v2 /* !! */  = (long)(ht.bjwv("bmld", bjyc(int ), (int)243) - ht.bjwv("bmlc", bjyc(int ), (int)242));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -681111458: {
                    continue block62;
                }
                case 240546907: {
                    break block62;
                }
            }
            break;
        }
        var2_2 /* !! */  = ht.b;
        v3 /* !! */  = ht.dn;
        if (true) ** GOTO lbl29
        block63: while (true) {
            v3 /* !! */  = (long)(v4 - ht.bjwv("bmle", bjyc(int ), (int)244));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -294231693: {
                    v4 = ht.bjwv("bmlf", bjyc(int ), (int)245);
                    continue block63;
                }
                case 240546907: {
                    break block63;
                }
                case 508855405: {
                    v4 = ht.bjwv("bmlg", bjyc(int ), (int)246);
                    continue block63;
                }
                case 1491528220: {
                    v4 = ht.bjwv("bmlh", bjyc(int ), (int)247);
                    continue block63;
                }
            }
            break;
        }
        var1_3 = ht.a;
        if (var3_1) {
            throw null;
lbl44:
            // 9 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmli", bjyc(int ), (int)248)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ht.bjwv("bmlj", bjwq(int ), (int)537)) break;
            v5 /* !! */  = (long)ht.bjwv("bmlk", bjwq(int ), (int)538);
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmll", bjyc(int ), (int)249)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ht.bjwv("bmlm", bjwq(int ), (int)539)) break;
            v6 /* !! */  = (long)ht.bjwv("bmln", bjwq(int ), (int)540);
        }
        this.stage = ht$Stage.IDLE;
        if (var1_3 || var1_3) ** GOTO lbl44
        v7 /* !! */  = ht.dn;
        if (true) ** GOTO lbl63
        block67: while (true) {
            v7 /* !! */  = (long)(v8 - ht.bjwv("bmlo", bjyc(int ), (int)250));
lbl63:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1584112950: {
                    v8 = ht.bjwv("bmlp", bjyc(int ), (int)251);
                    continue block67;
                }
                case 192695590: {
                    v8 = ht.bjwv("bmlq", bjyc(int ), (int)252);
                    continue block67;
                }
                case 240546907: {
                    break block67;
                }
            }
            break;
        }
        this.target = null;
        if (var1_3 || var1_3) ** GOTO lbl44
        v9 /* !! */  = ht.dn;
        if (true) ** GOTO lbl78
        block68: while (true) {
            v9 /* !! */  = (long)(v10 - ht.bjwv("bmlr", bjyc(int ), (int)253));
lbl78:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case -2124643734: {
                    v10 = ht.bjwv("bmls", bjyc(int ), (int)254);
                    continue block68;
                }
                case -1283238305: {
                    v10 = ht.bjwv("bmlt", bjyc(int ), (int)255);
                    continue block68;
                }
                case -308306583: {
                    v10 = ht.bjwv("bmlu", bjyc(int ), (int)256);
                    continue block68;
                }
                case 240546907: {
                    break block68;
                }
            }
            break;
        }
        this.placement = null;
        if (var1_3 || var1_3) ** GOTO lbl44
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("bmlv", bjyc(int ), (int)257)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ht.bjwv("bmlw", bjwq(int ), (int)541)) break;
            v11 /* !! */  = (long)ht.bjwv("bmlx", bjwq(int ), (int)542);
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("bmly", bjyc(int ), (int)258)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == ht.bjwv("bmlz", bjwq(int ), (int)543)) break;
            v12 /* !! */  = (long)ht.bjwv("bmma", bjwq(int ), (int)544);
        }
        this.pendingPositions.clear();
        if (var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl44
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = ht.dn - ht.bjwv("bmmb", bjyc(int ), (int)259)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ht.bjwv("bmmc", bjwq(int ), (int)545)) break;
                    v13 /* !! */  = (long)ht.bjwv("bmmd", bjwq(int ), (int)546);
                }
                v14 /* !! */  = ht.dn;
                if (true) ** GOTO lbl117
                block72: while (true) {
                    v14 /* !! */  = (long)(v15 - ht.bjwv("bmme", bjyc(int ), (int)260));
lbl117:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -313435798: {
                            v15 = ht.bjwv("bmmf", bjyc(int ), (int)261);
                            continue block72;
                        }
                        case 130307866: {
                            v15 = ht.bjwv("bmmg", bjyc(int ), (int)262);
                            continue block72;
                        }
                        case 240546907: {
                            break block72;
                        }
                        case 1887280257: {
                            v15 = ht.bjwv("bmmh", bjyc(int ), (int)263);
                            continue block72;
                        }
                    }
                    break;
                }
                this.anchorFootprint.clear();
                if (var1_3 || var1_3) ** GOTO lbl44
                v16 /* !! */  = ht.dn;
                if (true) ** GOTO lbl135
                block73: while (true) {
                    v16 /* !! */  = (long)(v17 - ht.bjwv("bmmi", bjyc(int ), (int)264));
lbl135:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -67867351: {
                            v17 = ht.bjwv("bmmj", bjyc(int ), (int)265);
                            continue block73;
                        }
                        case 240546907: {
                            break block73;
                        }
                        case 1907908361: {
                            v17 = ht.bjwv("bmmk", bjyc(int ), (int)266);
                            continue block73;
                        }
                    }
                    break;
                }
                v18 /* !! */  = ht.dn;
                if (true) ** GOTO lbl148
                block74: while (true) {
                    v18 /* !! */  = (long)(ht.bjwv("bmmm", bjyc(int ), (int)268) - ht.bjwv("bmml", bjyc(int ), (int)267));
lbl148:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -571932071: {
                            continue block74;
                        }
                        case 240546907: {
                            break block74;
                        }
                    }
                    break;
                }
                this.hand = class_1268.field_5808;
                if (var1_3 || var1_3) ** GOTO lbl44
                v19 = ht.bjwv("bmmn", bjwq(int ), (int)547);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = ht.dn - ht.bjwv("bmmo", bjyc(int ), (int)269)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ht.bjwv("bmmp", bjwq(int ), (int)548)) break;
                    v20 /* !! */  = (long)ht.bjwv("bmmq", bjwq(int ), (int)549);
                }
                this.previousSlot = (int)v19;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)ht.bjwv("bmmr", bjwq(int ), (int)550);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl198
            }
            case 1: {
                var2_2 /* !! */  = (int)ht.bjwv("bmms", bjwq(int ), (int)551);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl175:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)ht.bjwv("bmmt", bjwq(int ), (int)552);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl180:
            // 4 sources

            case 3: {
                var2_2 /* !! */  = (int)ht.bjwv("bmmu", bjwq(int ), (int)553);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl225
            }
lbl185:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ht.bjwv("bmmv", bjwq(int ), (int)554);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
lbl189:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)ht.bjwv("bmmw", bjwq(int ), (int)555);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl208
            }
lbl194:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ht.bjwv("bmmx", bjwq(int ), (int)556);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
lbl198:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ht.bjwv("bmmy", bjwq(int ), (int)557);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
            case 8: {
                var2_2 /* !! */  = (int)ht.bjwv("bmmz", bjwq(int ), (int)558);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl208:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ht.bjwv("bmna", bjwq(int ), (int)559);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
lbl212:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ht.bjwv("bmnb", bjwq(int ), (int)560);
                if (!var3_1) ** GOTO lbl175
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)ht.bjwv("bmnc", bjwq(int ), (int)561);
                if (!var3_1) ** GOTO lbl194
                throw null;
            }
            case 12: {
                do {
                    var2_2 /* !! */  = (int)ht.bjwv("bmnd", bjwq(int ), (int)562);
                } while (!var3_1);
                throw null;
            }
lbl225:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)ht.bjwv("bmne", bjwq(int ), (int)563);
                if (var3_1) {
                    throw null;
                }
            }
lbl229:
            // 6 sources

            case 14: {
                var2_2 /* !! */  = (int)ht.bjwv("bmnf", bjwq(int ), (int)564);
                if (!var3_1) ** GOTO lbl180
                throw null;
            }
            case 15: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht.bjwv("bmng", bjwq(int ), (int)565);
                    if (!var3_1) ** GOTO lbl189
                    throw null;
                }
            }
            case 16: {
                var2_2 /* !! */  = (int)ht.bjwv("bmnh", bjwq(int ), (int)566);
                if (!var3_1) ** GOTO lbl212
                throw null;
            }
            case 17: 
        }
        var2_2 /* !! */  = (int)ht.bjwv("bmni", bjwq(int ), (int)567);
        ** while (!var3_1)
lbl245:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findNearestTarget$3(class_742 var0) {
        block44: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmoa", bjyc(int ), (int)279)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ht.bjwv("bmob", bjwq(int ), (int)576)) break;
                v0 /* !! */  = (long)ht.bjwv("bmoc", bjwq(int ), (int)577);
            }
            var3_1 = ht.c;
            v1 /* !! */  = ht.dn;
            if (true) ** GOTO lbl11
            block29: while (true) {
                v1 /* !! */  = (long)(ht.bjwv("bmoe", bjyc(int ), (int)281) - ht.bjwv("bmod", bjyc(int ), (int)280));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case 240546907: {
                        break block29;
                    }
                    case 1357631271: {
                        continue block29;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ht.b;
            v2 /* !! */  = ht.dn;
            if (true) ** GOTO lbl21
            block30: while (true) {
                v2 /* !! */  = (long)(v3 - ht.bjwv("bmof", bjyc(int ), (int)282));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1673918210: {
                        v3 = ht.bjwv("bmog", bjyc(int ), (int)283);
                        continue block30;
                    }
                    case 240546907: {
                        break block30;
                    }
                    case 702869841: {
                        v3 = ht.bjwv("bmoh", bjyc(int ), (int)284);
                        continue block30;
                    }
                }
                break;
            }
            var1_3 = ht.a;
            if (var3_1) {
                throw null;
lbl33:
                // 3 sources

                return (boolean)ht.bjwv("bmoi", bjwq(int ), (int)578);
            }
            if (var1_3 || var1_3) ** GOTO lbl33
            v4 /* !! */  = ht.dn;
            if (true) ** GOTO lbl40
            block32: while (true) {
                v4 /* !! */  = (long)(v5 - ht.bjwv("bmoj", bjyc(int ), (int)285));
lbl40:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1756170454: {
                        v5 = ht.bjwv("bmok", bjyc(int ), (int)286);
                        continue block32;
                    }
                    case -966533011: {
                        v5 = ht.bjwv("bmol", bjyc(int ), (int)287);
                        continue block32;
                    }
                    case 240546907: {
                        break block32;
                    }
                }
                break;
            }
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmom", bjyc(int ), (int)288)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == ht.bjwv("bmon", bjwq(int ), (int)579)) break;
                v6 /* !! */  = (long)ht.bjwv("bmoo", bjwq(int ), (int)580);
            }
            v7 = ht.mc.field_1724;
            v8 /* !! */  = ht.dn;
            if (true) ** GOTO lbl59
            block34: while (true) {
                v8 /* !! */  = (long)(ht.bjwv("bmoq", bjyc(int ), (int)290) - ht.bjwv("bmop", bjyc(int ), (int)289));
lbl59:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -344926352: {
                        continue block34;
                    }
                    case 240546907: {
                        break block34;
                    }
                }
                break;
            }
            if (!((double)v7.method_5739((class_1297)var0) <= ht.bjwv("bmor", blpm(int ), (int)291))) break block44;
            if (var1_3) ** GOTO lbl33
            v9 = ht.bjwv("bmos", bjwq(int ), (int)581);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl77
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v9 = ht.bjwv("bmot", bjwq(int ), (int)582);
lbl77:
                // 2 sources

                return (boolean)v9;
            }
            case 0: {
                var2_2 /* !! */  = (int)ht.bjwv("bmou", bjwq(int ), (int)583);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl83:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)ht.bjwv("bmov", bjwq(int ), (int)584);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 2: {
                var2_2 /* !! */  = (int)ht.bjwv("bmow", bjwq(int ), (int)585);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl93:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ht.bjwv("bmox", bjwq(int ), (int)586);
                if (!var3_1) ** GOTO lbl83
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ht.bjwv("bmoy", bjwq(int ), (int)587);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl107
            }
lbl102:
            // 2 sources

            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht.bjwv("bmoz", bjwq(int ), (int)588);
                    if (!var3_1) ** GOTO lbl83
                    throw null;
                }
            }
lbl107:
            // 3 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)ht.bjwv("bmpa", bjwq(int ), (int)589);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ht.bjwv("bmpb", bjwq(int ), (int)590);
        ** while (!var3_1)
lbl115:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite bjwv(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bmsm() {
        ht.bjwt[600] = -103340435;
        ht.bjwt[601] = -2056510968;
        ht.bjwt[602] = -1958282202;
        ht.bjwt[603] = 566915844;
        ht.bjwt[604] = -539252847;
        ht.bjwt[605] = -2058464245;
        ht.bjwt[606] = -1803365304;
        ht.bjwt[607] = 1350975098;
        ht.bjwt[608] = -194180821;
        ht.bjwt[609] = 1332016495;
        ht.bjwt[610] = -548175207;
        ht.bjwt[611] = 690978944;
        ht.bjwt[612] = -1220990419;
        ht.bjwt[613] = 1623821795;
        ht.bjwt[614] = 534716616;
        ht.bjwt[615] = -568563029;
        ht.bjwt[616] = 965723022;
        ht.bjwt[617] = -985093127;
        ht.bjwt[618] = 1713714055;
        ht.bjwt[619] = -1006654391;
        ht.bjwt[620] = -1626248015;
        ht.bjwt[621] = -690624435;
        ht.bjwt[622] = 634467917;
        ht.bjwt[623] = 2051305045;
        ht.bjwt[624] = 1680539515;
        ht.bjwt[625] = -1018842454;
        ht.bjwt[626] = -383955163;
        ht.bjwt[627] = -1943232092;
        ht.bjwt[628] = -281750974;
        ht.bjwt[629] = -315971121;
        ht.bjwt[630] = 760346275;
        ht.bjwt[631] = -170550549;
        ht.bjwt[632] = 33922059;
        ht.bjwt[633] = 71695365;
        ht.bjwt[634] = -1888822759;
        ht.bjwt[635] = 853858156;
        ht.bjwt[636] = -1419547424;
        ht.bjwt[637] = 1638099658;
        ht.bjwt[638] = -322647541;
        ht.bjwt[639] = 1781900600;
        ht.bjwt[640] = 1815290130;
        ht.bjwt[641] = -2019952520;
    }

    private static /* synthetic */ void bmsb() {
        ht.bjwr[200] = 1018342575;
        ht.bjwr[201] = 782941677;
        ht.bjwr[202] = -1402998238;
        ht.bjwr[203] = 1481329545;
        ht.bjwr[204] = 75720294;
        ht.bjwr[205] = 1662491287;
        ht.bjwr[206] = -1840602583;
        ht.bjwr[207] = 4035224;
        ht.bjwr[208] = 691941530;
        ht.bjwr[209] = 619308625;
        ht.bjwr[210] = 2070366968;
        ht.bjwr[211] = -208599131;
        ht.bjwr[212] = -515179052;
        ht.bjwr[213] = 2048676929;
        ht.bjwr[214] = -127003296;
        ht.bjwr[215] = -665892661;
        ht.bjwr[216] = -1131067264;
        ht.bjwr[217] = 1220517656;
        ht.bjwr[218] = 848349112;
        ht.bjwr[219] = 1739293895;
        ht.bjwr[220] = -905910731;
        ht.bjwr[221] = 1345294911;
        ht.bjwr[222] = -2078092739;
        ht.bjwr[223] = -1129942608;
        ht.bjwr[224] = 476353825;
        ht.bjwr[225] = 326389409;
        ht.bjwr[226] = -1335120995;
        ht.bjwr[227] = 538748814;
        ht.bjwr[228] = 920828406;
        ht.bjwr[229] = -198103750;
        ht.bjwr[230] = -1849764385;
        ht.bjwr[231] = 698236481;
        ht.bjwr[232] = 39040021;
        ht.bjwr[233] = -1648189991;
        ht.bjwr[234] = -155138054;
        ht.bjwr[235] = 1940841163;
        ht.bjwr[236] = 918869992;
        ht.bjwr[237] = -914086641;
        ht.bjwr[238] = 1676742041;
        ht.bjwr[239] = -1995750980;
        ht.bjwr[240] = 1660967446;
        ht.bjwr[241] = -854064679;
        ht.bjwr[242] = -1596025789;
        ht.bjwr[243] = -1911092152;
        ht.bjwr[244] = -1624394150;
        ht.bjwr[245] = -1599934681;
        ht.bjwr[246] = 1366697579;
        ht.bjwr[247] = 1392719455;
        ht.bjwr[248] = -546210955;
        ht.bjwr[249] = -113436046;
        ht.bjwr[250] = 2096127344;
        ht.bjwr[251] = 694079342;
        ht.bjwr[252] = -698914187;
        ht.bjwr[253] = -1317954345;
        ht.bjwr[254] = 1494075761;
        ht.bjwr[255] = 487613463;
        ht.bjwr[256] = 2043380497;
        ht.bjwr[257] = -819547258;
        ht.bjwr[258] = 993233126;
        ht.bjwr[259] = 1646362576;
        ht.bjwr[260] = -314575008;
        ht.bjwr[261] = 279591931;
        ht.bjwr[262] = 285296024;
        ht.bjwr[263] = 1496435463;
        ht.bjwr[264] = -1299044556;
        ht.bjwr[265] = 1754776640;
        ht.bjwr[266] = 193571405;
        ht.bjwr[267] = 1661422129;
        ht.bjwr[268] = 1884280149;
        ht.bjwr[269] = -1477224098;
        ht.bjwr[270] = -1991006471;
        ht.bjwr[271] = -1895464971;
        ht.bjwr[272] = 1214057929;
        ht.bjwr[273] = -1914540064;
        ht.bjwr[274] = -1227090878;
        ht.bjwr[275] = 2091743355;
        ht.bjwr[276] = -2062651804;
        ht.bjwr[277] = 924750158;
        ht.bjwr[278] = 1756663344;
        ht.bjwr[279] = -1713045296;
        ht.bjwr[280] = 64145031;
        ht.bjwr[281] = -86790508;
        ht.bjwr[282] = 114660939;
        ht.bjwr[283] = -823947751;
        ht.bjwr[284] = 650265190;
        ht.bjwr[285] = -782877159;
        ht.bjwr[286] = -75016869;
        ht.bjwr[287] = -108553871;
        ht.bjwr[288] = -1726442018;
        ht.bjwr[289] = 2033944004;
        ht.bjwr[290] = -1968862351;
        ht.bjwr[291] = -1396739061;
        ht.bjwr[292] = -385689350;
        ht.bjwr[293] = 1663089214;
        ht.bjwr[294] = -1523021853;
        ht.bjwr[295] = 433903560;
        ht.bjwr[296] = -360640858;
        ht.bjwr[297] = -1844195053;
        ht.bjwr[298] = -1297729309;
        ht.bjwr[299] = -999160789;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void deactivate() {
        v0 /* !! */  = ht.dn;
        if (true) ** GOTO lbl5
        block22: while (true) {
            v0 /* !! */  = (long)(ht.bjwv("bmnk", bjyc(int ), (int)271) - ht.bjwv("bmnj", bjyc(int ), (int)270));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 240546907: {
                    break block22;
                }
                case 1977887470: {
                    continue block22;
                }
            }
            break;
        }
        var3_1 = ht.c;
        v1 /* !! */  = ht.dn;
        if (true) ** GOTO lbl15
        block23: while (true) {
            v1 /* !! */  = (long)(v2 - ht.bjwv("bmnl", bjyc(int ), (int)272));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -512419254: {
                    v2 = ht.bjwv("bmnm", bjyc(int ), (int)273);
                    continue block23;
                }
                case 59593207: {
                    v2 = ht.bjwv("bmnn", bjyc(int ), (int)274);
                    continue block23;
                }
                case 240546907: {
                    break block23;
                }
            }
            break;
        }
        var2_2 /* !! */  = ht.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmno", bjyc(int ), (int)275)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ht.bjwv("bmnp", bjwq(int ), (int)568)) break;
            v3 /* !! */  = (long)ht.bjwv("bmnq", bjwq(int ), (int)569);
        }
        var1_3 = ht.a;
        if (var3_1) {
            throw null;
lbl34:
            // 2 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl34
                v4 /* !! */  = ht.dn;
                if (true) ** GOTO lbl44
                block26: while (true) {
                    v4 /* !! */  = (long)(v5 - ht.bjwv("bmnr", bjyc(int ), (int)276));
lbl44:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1091295859: {
                            v5 = ht.bjwv("bmns", bjyc(int ), (int)277);
                            continue block26;
                        }
                        case -956430994: {
                            v5 = ht.bjwv("bmnt", bjyc(int ), (int)278);
                            continue block26;
                        }
                        case 240546907: {
                            break block26;
                        }
                    }
                    break;
                }
                this.restoreAndClear();
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl56:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht.bjwv("bmnu", bjwq(int ), (int)570);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl66
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ht.bjwv("bmnv", bjwq(int ), (int)571);
                if (var3_1) {
                    throw null;
                }
            }
lbl66:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)ht.bjwv("bmnw", bjwq(int ), (int)572);
                if (!var3_1) ** GOTO lbl56
                throw null;
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)ht.bjwv("bmnx", bjwq(int ), (int)573);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ht.bjwv("bmny", bjwq(int ), (int)574);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ht.bjwv("bmnz", bjwq(int ), (int)575);
        ** while (!var3_1)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isTargetValid() {
        block104: {
            block103: {
                block102: {
                    v0 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl5
                    block69: while (true) {
                        v0 /* !! */  = (long)(v1 - ht.bjwv("blyf", bjyc(int ), (int)121));
lbl5:
                        // 2 sources

                        switch ((int)v0 /* !! */ ) {
                            case -2093056638: {
                                v1 = ht.bjwv("blyg", bjyc(int ), (int)122);
                                continue block69;
                            }
                            case 240546907: {
                                break block69;
                            }
                            case 1789482115: {
                                v1 = ht.bjwv("blyh", bjyc(int ), (int)123);
                                continue block69;
                            }
                        }
                        break;
                    }
                    var4_1 = ht.c;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("blyi", bjyc(int ), (int)124)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                        if (v2 /* !! */  == ht.bjwv("blyj", bjwq(int ), (int)323)) break;
                        v2 /* !! */  = (long)ht.bjwv("blyk", bjwq(int ), (int)324);
                    }
                    var3_2 /* !! */  = ht.b;
                    v3 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl25
                    block71: while (true) {
                        v3 /* !! */  = (long)(v4 - ht.bjwv("blyl", bjyc(int ), (int)125));
lbl25:
                        // 2 sources

                        switch ((int)v3 /* !! */ ) {
                            case -1746482232: {
                                v4 = ht.bjwv("blym", bjyc(int ), (int)126);
                                continue block71;
                            }
                            case -1123553558: {
                                v4 = ht.bjwv("blyn", bjyc(int ), (int)127);
                                continue block71;
                            }
                            case 240546907: {
                                break block71;
                            }
                        }
                        break;
                    }
                    var2_3 = ht.a;
                    if (var4_1) {
                        throw null;
lbl37:
                        // 10 sources

                        return (boolean)ht.bjwv("blyo", bjwq(int ), (int)325);
                    }
                    if (var2_3 || var2_3) ** GOTO lbl37
                    v5 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl44
                    block73: while (true) {
                        v5 /* !! */  = (long)(v6 - ht.bjwv("blyp", bjyc(int ), (int)128));
lbl44:
                        // 2 sources

                        switch ((int)v5 /* !! */ ) {
                            case -2127549676: {
                                v6 = ht.bjwv("blyq", bjyc(int ), (int)129);
                                continue block73;
                            }
                            case 240546907: {
                                break block73;
                            }
                            case 1915460255: {
                                v6 = ht.bjwv("blyr", bjyc(int ), (int)130);
                                continue block73;
                            }
                        }
                        break;
                    }
                    if (this.target == null) break block102;
                    if (var2_3) ** GOTO lbl37
                    v7 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl59
                    block74: while (true) {
                        v7 /* !! */  = (long)(v8 - ht.bjwv("blys", bjyc(int ), (int)131));
lbl59:
                        // 2 sources

                        switch ((int)v7 /* !! */ ) {
                            case 240546907: {
                                break block74;
                            }
                            case 949067424: {
                                v8 = ht.bjwv("blyt", bjyc(int ), (int)132);
                                continue block74;
                            }
                            case 1242874340: {
                                v8 = ht.bjwv("blyu", bjyc(int ), (int)133);
                                continue block74;
                            }
                            case 1508912311: {
                                v8 = ht.bjwv("blyv", bjyc(int ), (int)134);
                                continue block74;
                            }
                        }
                        break;
                    }
                    v9 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl75
                    block75: while (true) {
                        v9 /* !! */  = (long)(v10 - ht.bjwv("blyw", bjyc(int ), (int)135));
lbl75:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1857830442: {
                                v10 = ht.bjwv("blyx", bjyc(int ), (int)136);
                                continue block75;
                            }
                            case 240546907: {
                                break block75;
                            }
                            case 1322289586: {
                                v10 = ht.bjwv("blyy", bjyc(int ), (int)137);
                                continue block75;
                            }
                            case 1378615115: {
                                v10 = ht.bjwv("blyz", bjyc(int ), (int)138);
                                continue block75;
                            }
                        }
                        break;
                    }
                    if (!this.target.method_5805()) break block102;
                    if (var2_3) ** GOTO lbl37
                    v11 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl93
                    block76: while (true) {
                        v11 /* !! */  = (long)(ht.bjwv("blzb", bjyc(int ), (int)140) - ht.bjwv("blza", bjyc(int ), (int)139));
lbl93:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -676827186: {
                                continue block76;
                            }
                            case 240546907: {
                                break block76;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v12 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("blzc", bjyc(int ), (int)141)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                        if (v12 /* !! */  == ht.bjwv("blzd", bjwq(int ), (int)326)) break;
                        v12 /* !! */  = (long)ht.bjwv("blze", bjwq(int ), (int)327);
                    }
                    v13 = ht.mc.field_1724;
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("blzf", bjyc(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == ht.bjwv("blzg", bjwq(int ), (int)328)) break;
                        v14 /* !! */  = (long)ht.bjwv("blzh", bjwq(int ), (int)329);
                    }
                    v15 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl113
                    block79: while (true) {
                        v15 /* !! */  = (long)(ht.bjwv("blzj", bjyc(int ), (int)144) - ht.bjwv("blzi", bjyc(int ), (int)143));
lbl113:
                        // 2 sources

                        switch ((int)v15 /* !! */ ) {
                            case 240546907: {
                                break block79;
                            }
                            case 2137161126: {
                                continue block79;
                            }
                        }
                        break;
                    }
                    if (!((double)v13.method_5739((class_1297)this.target) > ht.bjwv("blzk", blpm(int ), (int)145))) break block103;
                    if (var2_3) ** GOTO lbl37
                }
                if (var2_3 || var2_3) ** GOTO lbl37
                return (boolean)ht.bjwv("blzl", bjwq(int ), (int)330);
            }
            if (var2_3 || var2_3) ** GOTO lbl37
            v16 /* !! */  = ht.dn;
            if (true) ** GOTO lbl129
            block80: while (true) {
                v16 /* !! */  = (long)(ht.bjwv("blzn", bjyc(int ), (int)147) - ht.bjwv("blzm", bjyc(int ), (int)146));
lbl129:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -400961707: {
                        continue block80;
                    }
                    case 240546907: {
                        break block80;
                    }
                }
                break;
            }
            v17 /* !! */  = ht.dn;
            if (true) ** GOTO lbl138
            block81: while (true) {
                v17 /* !! */  = (long)(v18 - ht.bjwv("blzo", bjyc(int ), (int)148));
lbl138:
                // 2 sources

                switch ((int)v17 /* !! */ ) {
                    case -1858435959: {
                        v18 = ht.bjwv("blzp", bjyc(int ), (int)149);
                        continue block81;
                    }
                    case -856138621: {
                        v18 = ht.bjwv("blzq", bjyc(int ), (int)150);
                        continue block81;
                    }
                    case 240546907: {
                        break block81;
                    }
                    case 847780683: {
                        v18 = ht.bjwv("blzr", bjyc(int ), (int)151);
                        continue block81;
                    }
                }
                break;
            }
            var1_4 = this.collectFootprint(this.target);
            if (var2_3 || var2_3) ** GOTO lbl37
            while (true) {
                if ((v19 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("blzs", bjyc(int ), (int)152)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v19 /* !! */  == ht.bjwv("blzt", bjwq(int ), (int)331)) break;
                v19 /* !! */  = (long)ht.bjwv("blzu", bjwq(int ), (int)332);
            }
            if (var1_4.isEmpty()) break block104;
            if (var2_3) ** GOTO lbl37
            v20 /* !! */  = ht.dn;
            if (true) ** GOTO lbl163
            block83: while (true) {
                v20 /* !! */  = (long)(ht.bjwv("blzw", bjyc(int ), (int)154) - ht.bjwv("blzv", bjyc(int ), (int)153));
lbl163:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case 240546907: {
                        break block83;
                    }
                    case 1031270761: {
                        continue block83;
                    }
                }
                break;
            }
            while (true) {
                if ((v21 /* !! */  = (cfr_temp_4 = ht.dn - ht.bjwv("blzx", bjyc(int ), (int)155)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v21 /* !! */  == ht.bjwv("blzy", bjwq(int ), (int)333)) break;
                v21 /* !! */  = (long)ht.bjwv("blzz", bjwq(int ), (int)334);
            }
            if (!this.anchorFootprint.containsAll(var1_4)) break block104;
            if (var2_3) ** GOTO lbl37
            v22 = ht.bjwv("bmaa", bjwq(int ), (int)335);
            if (var4_1) {
                throw null;
            }
            ** GOTO lbl186
        }
        if (!var2_3 && !var2_3) ** break;
        ** while (true)
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v22 = ht.bjwv("bmab", bjwq(int ), (int)336);
lbl186:
                // 2 sources

                return (boolean)v22;
            }
            case 0: {
                do {
                    var3_2 /* !! */  = (int)ht.bjwv("bmac", bjwq(int ), (int)337);
                } while (!var4_1);
                throw null;
            }
lbl192:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)ht.bjwv("bmad", bjwq(int ), (int)338);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl197:
            // 2 sources

            case 2: {
                var3_2 /* !! */  = (int)ht.bjwv("bmae", bjwq(int ), (int)339);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl226
            }
            case 3: {
                var3_2 /* !! */  = (int)ht.bjwv("bmaf", bjwq(int ), (int)340);
                if (!var4_1) ** GOTO lbl192
                throw null;
            }
lbl206:
            // 2 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ht.bjwv("bmag", bjwq(int ), (int)341);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl256
                    break;
                }
            }
lbl212:
            // 3 sources

            case 5: {
                do {
                    var3_2 /* !! */  = (int)ht.bjwv("bmah", bjwq(int ), (int)342);
                } while (!var4_1);
                throw null;
            }
            case 6: {
                var3_2 /* !! */  = (int)ht.bjwv("bmai", bjwq(int ), (int)343);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl248
            }
            case 7: {
                var3_2 /* !! */  = (int)ht.bjwv("bmaj", bjwq(int ), (int)344);
                if (!var4_1) ** GOTO lbl206
                throw null;
            }
lbl226:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)ht.bjwv("bmak", bjwq(int ), (int)345);
                if (!var4_1) ** GOTO lbl192
                throw null;
            }
lbl230:
            // 2 sources

            case 9: {
                var3_2 /* !! */  = (int)ht.bjwv("bmal", bjwq(int ), (int)346);
                if (!var4_1) ** GOTO lbl212
                throw null;
            }
lbl234:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)ht.bjwv("bmam", bjwq(int ), (int)347);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl252
            }
            case 11: {
                var3_2 /* !! */  = (int)ht.bjwv("bman", bjwq(int ), (int)348);
                if (!var4_1) break;
                throw null;
            }
            case 12: {
                do {
                    var3_2 /* !! */  = (int)ht.bjwv("bmao", bjwq(int ), (int)349);
                } while (!var4_1);
                throw null;
            }
lbl248:
            // 2 sources

            case 13: {
                var3_2 /* !! */  = (int)ht.bjwv("bmap", bjwq(int ), (int)350);
                if (!var4_1) ** GOTO lbl234
                throw null;
            }
lbl252:
            // 2 sources

            case 14: {
                var3_2 /* !! */  = (int)ht.bjwv("bmaq", bjwq(int ), (int)351);
                if (!var4_1) ** GOTO lbl230
                throw null;
            }
lbl256:
            // 2 sources

            case 15: {
                var3_2 /* !! */  = (int)ht.bjwv("bmar", bjwq(int ), (int)352);
                if (!var4_1) break;
                throw null;
            }
            case 16: {
                var3_2 /* !! */  = (int)ht.bjwv("bmas", bjwq(int ), (int)353);
                if (!var4_1) ** GOTO lbl197
                throw null;
            }
            case 17: 
        }
        var3_2 /* !! */  = (int)ht.bjwv("bmat", bjwq(int ), (int)354);
        ** while (!var4_1)
lbl267:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findNearestTarget$0(class_742 var0) {
        v0 /* !! */  = ht.dn;
        if (true) ** GOTO lbl5
        block26: while (true) {
            v0 /* !! */  = (long)(v1 - ht.bjwv("bmqy", bjyc(int ), (int)304));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2043620367: {
                    v1 = ht.bjwv("bmqz", bjyc(int ), (int)305);
                    continue block26;
                }
                case -1722746858: {
                    v1 = ht.bjwv("bmra", bjyc(int ), (int)306);
                    continue block26;
                }
                case 240546907: {
                    break block26;
                }
                case 1142207710: {
                    v1 = ht.bjwv("bmrb", bjyc(int ), (int)307);
                    continue block26;
                }
            }
            break;
        }
        var3_1 = ht.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmrc", bjyc(int ), (int)308)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ht.bjwv("bmrd", bjwq(int ), (int)627)) break;
            v2 /* !! */  = (long)ht.bjwv("bmre", bjwq(int ), (int)628);
        }
        var2_2 /* !! */  = ht.b;
        v3 /* !! */  = ht.dn;
        if (true) ** GOTO lbl29
        block28: while (true) {
            v3 /* !! */  = (long)(v4 - ht.bjwv("bmrf", bjyc(int ), (int)309));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1944845170: {
                    v4 = ht.bjwv("bmrg", bjyc(int ), (int)310);
                    continue block28;
                }
                case -575350401: {
                    v4 = ht.bjwv("bmrh", bjyc(int ), (int)311);
                    continue block28;
                }
                case 240546907: {
                    break block28;
                }
            }
            break;
        }
        var1_3 = ht.a;
        if (var3_1) {
            throw null;
lbl41:
            // 4 sources

            return (boolean)ht.bjwv("bmri", bjwq(int ), (int)629);
        }
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl41
                v5 /* !! */  = ht.dn;
                if (true) ** GOTO lbl52
                block30: while (true) {
                    v5 /* !! */  = (long)(v6 - ht.bjwv("bmrj", bjyc(int ), (int)312));
lbl52:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 180020617: {
                            v6 = ht.bjwv("bmrk", bjyc(int ), (int)313);
                            continue block30;
                        }
                        case 240546907: {
                            break block30;
                        }
                        case 389776300: {
                            v6 = ht.bjwv("bmrl", bjyc(int ), (int)314);
                            continue block30;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmrm", bjyc(int ), (int)315)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v7 /* !! */  == ht.bjwv("bmrn", bjwq(int ), (int)630)) break;
                    v7 /* !! */  = (long)ht.bjwv("bmro", bjwq(int ), (int)631);
                }
                if (var0 == ht.mc.field_1724) ** GOTO lbl73
                if (var1_3) ** GOTO lbl41
                v8 = ht.bjwv("bmrp", bjwq(int ), (int)632);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl76
lbl73:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v8 = ht.bjwv("bmrq", bjwq(int ), (int)633);
lbl76:
                // 2 sources

                return (boolean)v8;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ht.bjwv("bmrr", bjwq(int ), (int)634);
                } while (!var3_1);
                throw null;
            }
lbl82:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ht.bjwv("bmrs", bjwq(int ), (int)635);
                if (!var3_1) break;
                throw null;
            }
lbl86:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ht.bjwv("bmrt", bjwq(int ), (int)636);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl95
            }
lbl91:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ht.bjwv("bmru", bjwq(int ), (int)637);
                if (!var3_1) break;
                throw null;
            }
lbl95:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ht.bjwv("bmrv", bjwq(int ), (int)638);
                if (!var3_1) ** GOTO lbl91
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ht.bjwv("bmrw", bjwq(int ), (int)639);
                if (!var3_1) ** GOTO lbl86
                throw null;
            }
            case 6: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht.bjwv("bmrx", bjwq(int ), (int)640);
                    if (!var3_1) ** GOTO lbl82
                    throw null;
                }
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ht.bjwv("bmry", bjwq(int ), (int)641);
        ** while (!var3_1)
lbl111:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isUsableSupport(class_2680 var1_1) {
        v0 /* !! */  = ht.dn;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - ht.bjwv("bmch", bjyc(int ), (int)157));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1699713212: {
                    v1 = ht.bjwv("bmci", bjyc(int ), (int)158);
                    continue block28;
                }
                case -1185974505: {
                    v1 = ht.bjwv("bmcj", bjyc(int ), (int)159);
                    continue block28;
                }
                case 240546907: {
                    break block28;
                }
            }
            break;
        }
        var4_2 = ht.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmck", bjyc(int ), (int)160)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ht.bjwv("bmcl", bjwq(int ), (int)393)) break;
            v2 /* !! */  = (long)ht.bjwv("bmcm", bjwq(int ), (int)394);
        }
        var3_3 /* !! */  = ht.b;
        v3 /* !! */  = ht.dn;
        if (true) ** GOTO lbl25
        block30: while (true) {
            v3 /* !! */  = (long)(v4 - ht.bjwv("bmcn", bjyc(int ), (int)161));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1980532676: {
                    v4 = ht.bjwv("bmco", bjyc(int ), (int)162);
                    continue block30;
                }
                case -605720331: {
                    v4 = ht.bjwv("bmcp", bjyc(int ), (int)163);
                    continue block30;
                }
                case 240546907: {
                    break block30;
                }
                case 550257551: {
                    v4 = ht.bjwv("bmcq", bjyc(int ), (int)164);
                    continue block30;
                }
            }
            break;
        }
        var2_4 = ht.a;
        if (var4_2) {
            throw null;
lbl40:
            // 5 sources

            return (boolean)ht.bjwv("bmcr", bjwq(int ), (int)395);
        }
        if (var2_4 || var2_4) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmcs", bjyc(int ), (int)165)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ht.bjwv("bmct", bjwq(int ), (int)396)) break;
            v5 /* !! */  = (long)ht.bjwv("bmcu", bjwq(int ), (int)397);
        }
        if (var1_1.method_26215()) ** GOTO lbl85
        if (var2_4) ** GOTO lbl40
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("bmcv", bjyc(int ), (int)166)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ht.bjwv("bmcw", bjwq(int ), (int)398)) break;
                    v6 /* !! */  = (long)ht.bjwv("bmcx", bjwq(int ), (int)399);
                }
                v7 = var1_1.method_26227();
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("bmcy", bjyc(int ), (int)167)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ht.bjwv("bmcz", bjwq(int ), (int)400)) break;
                    v8 /* !! */  = (long)ht.bjwv("bmda", bjwq(int ), (int)401);
                }
                if (!v7.method_15769()) ** GOTO lbl85
                if (var2_4) ** GOTO lbl40
                v9 /* !! */  = ht.dn;
                if (true) ** GOTO lbl70
                block35: while (true) {
                    v9 /* !! */  = (long)(v10 - ht.bjwv("bmdb", bjyc(int ), (int)168));
lbl70:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1248317165: {
                            v10 = ht.bjwv("bmdc", bjyc(int ), (int)169);
                            continue block35;
                        }
                        case -973340756: {
                            v10 = ht.bjwv("bmdd", bjyc(int ), (int)170);
                            continue block35;
                        }
                        case 240546907: {
                            break block35;
                        }
                    }
                    break;
                }
                if (var1_1.method_45474()) ** GOTO lbl85
                if (var2_4) ** GOTO lbl40
                v11 = ht.bjwv("bmde", bjwq(int ), (int)402);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl88
lbl85:
                // 3 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v11 = ht.bjwv("bmdf", bjwq(int ), (int)403);
lbl88:
                // 2 sources

                return (boolean)v11;
            }
            case 0: {
                var3_3 /* !! */  = (int)ht.bjwv("bmdg", bjwq(int ), (int)404);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl121
            }
lbl94:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ht.bjwv("bmdh", bjwq(int ), (int)405);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl113
                    break;
                }
            }
lbl100:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)ht.bjwv("bmdi", bjwq(int ), (int)406);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl113
            }
lbl105:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)ht.bjwv("bmdj", bjwq(int ), (int)407);
                if (!var4_2) ** GOTO lbl94
                throw null;
            }
lbl109:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)ht.bjwv("bmdk", bjwq(int ), (int)408);
                if (var4_2) {
                    throw null;
                }
            }
lbl113:
            // 6 sources

            case 5: {
                var3_3 /* !! */  = (int)ht.bjwv("bmdl", bjwq(int ), (int)409);
                if (!var4_2) ** GOTO lbl109
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)ht.bjwv("bmdm", bjwq(int ), (int)410);
                if (!var4_2) ** GOTO lbl100
                throw null;
            }
lbl121:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)ht.bjwv("bmdn", bjwq(int ), (int)411);
                if (!var4_2) ** GOTO lbl105
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)ht.bjwv("bmdo", bjwq(int ), (int)412);
                if (!var4_2) ** GOTO lbl113
                throw null;
            }
            case 9: 
        }
        var3_3 /* !! */  = (int)ht.bjwv("bmdp", bjwq(int ), (int)413);
        ** while (!var4_2)
lbl132:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bmsn() {
        ht.bjye[0] = -1127428792889668831L;
        ht.bjye[1] = -2194775483653891204L;
        ht.bjye[2] = 1810052780844999752L;
        ht.bjye[3] = 315195841808965312L;
        ht.bjye[4] = -612305234833285024L;
        ht.bjye[5] = 9006099866853214484L;
        ht.bjye[6] = -3722930788219000410L;
        ht.bjye[7] = -7200483852612139736L;
        ht.bjye[8] = 6692591528689358628L;
        ht.bjye[9] = 7708687574847186983L;
        ht.bjye[10] = -4411526261743966113L;
        ht.bjye[11] = 5732719357911439838L;
        ht.bjye[12] = -5325496146013357463L;
        ht.bjye[13] = -5498316149592683210L;
        ht.bjye[14] = -4128986089919258507L;
        ht.bjye[15] = -1989485913895336772L;
        ht.bjye[16] = 1653705717189370352L;
        ht.bjye[17] = -5120943787386398319L;
        ht.bjye[18] = -8674206828219231915L;
        ht.bjye[19] = -4904236201474229535L;
        ht.bjye[20] = -7702076697555667843L;
        ht.bjye[21] = -9009365973933170224L;
        ht.bjye[22] = -3834524129795506055L;
        ht.bjye[23] = -3921005668579358091L;
        ht.bjye[24] = -8413627925596522454L;
        ht.bjye[25] = 281740096450157614L;
        ht.bjye[26] = -2924234235144688442L;
        ht.bjye[27] = -4269897045909695938L;
        ht.bjye[28] = 7314713941958094288L;
        ht.bjye[29] = 2488728828494314672L;
        ht.bjye[30] = -4452288525636976971L;
        ht.bjye[31] = -2651096376432233464L;
        ht.bjye[32] = -1520187633224079949L;
        ht.bjye[33] = -5432235641907896028L;
        ht.bjye[34] = -4654310226897528041L;
        ht.bjye[35] = 6521835709256769980L;
        ht.bjye[36] = 9178692016969189455L;
        ht.bjye[37] = -1960018080330672106L;
        ht.bjye[38] = 1166307335006469769L;
        ht.bjye[39] = -2630493497672177035L;
        ht.bjye[40] = 5510291376527531144L;
        ht.bjye[41] = -5136009183319423611L;
        ht.bjye[42] = 7067985274716613308L;
        ht.bjye[43] = 2735244092419554012L;
        ht.bjye[44] = 7931521123534090935L;
        ht.bjye[45] = -1612420385841358906L;
        ht.bjye[46] = 2716126614747510921L;
        ht.bjye[47] = 7013107147920649867L;
        ht.bjye[48] = 5941954818053961470L;
        ht.bjye[49] = -6478007670476820038L;
        ht.bjye[50] = 2844622627040852416L;
        ht.bjye[51] = -8428746764226050729L;
        ht.bjye[52] = -2310058318222679405L;
        ht.bjye[53] = 4655338279188556892L;
        ht.bjye[54] = 3303651171856691331L;
        ht.bjye[55] = -154096524859344603L;
        ht.bjye[56] = -5492515466092152336L;
        ht.bjye[57] = -7338489642834719954L;
        ht.bjye[58] = -6758511925534727088L;
        ht.bjye[59] = 3166175222327680414L;
        ht.bjye[60] = 1091522571617380933L;
        ht.bjye[61] = -164354818713788023L;
        ht.bjye[62] = -2845508643953914401L;
        ht.bjye[63] = -4031450150291928297L;
        ht.bjye[64] = 6997577725861264026L;
        ht.bjye[65] = -2903169058186344768L;
        ht.bjye[66] = 8506483174560826262L;
        ht.bjye[67] = 2592436552142475821L;
        ht.bjye[68] = 845226405075060652L;
        ht.bjye[69] = 1344229593427277483L;
        ht.bjye[70] = 1855812760024474171L;
        ht.bjye[71] = -4045528912987477489L;
        ht.bjye[72] = 3742233054406802958L;
        ht.bjye[73] = 663809253913303484L;
        ht.bjye[74] = -3206210309794871186L;
        ht.bjye[75] = -5273826358749019477L;
        ht.bjye[76] = -4618122509354520593L;
        ht.bjye[77] = 8216890277163820449L;
        ht.bjye[78] = 8588497035395617964L;
        ht.bjye[79] = 1518096840973215225L;
        ht.bjye[80] = 6090204905017846439L;
        ht.bjye[81] = -7987602955477298632L;
        ht.bjye[82] = 6014661581507042100L;
        ht.bjye[83] = 7163244389396362622L;
        ht.bjye[84] = 2681468278308543018L;
        ht.bjye[85] = 3714837279283570122L;
        ht.bjye[86] = 531659941102990697L;
        ht.bjye[87] = -5109117904011569894L;
        ht.bjye[88] = -6170094612759928430L;
        ht.bjye[89] = -3778501364234054138L;
        ht.bjye[90] = -5624693575322910063L;
        ht.bjye[91] = 1408109919306916580L;
        ht.bjye[92] = 3745322670027135658L;
        ht.bjye[93] = -4748755135313510815L;
        ht.bjye[94] = 6526383880113766880L;
        ht.bjye[95] = -2337307062074377645L;
        ht.bjye[96] = -225323168186711337L;
        ht.bjye[97] = -8146422821839720989L;
        ht.bjye[98] = -2184692469088946416L;
        ht.bjye[99] = -4110618058802146068L;
    }

    private static /* synthetic */ void bmsr() {
        ht.bjyg[0] = -8746742472059244389L;
        ht.bjyg[1] = 1470974214368752484L;
        ht.bjyg[2] = 5238292214296117029L;
        ht.bjyg[3] = -1139136143207400050L;
        ht.bjyg[4] = 4758396912935991537L;
        ht.bjyg[5] = 6862053935460945757L;
        ht.bjyg[6] = 6472191721140803582L;
        ht.bjyg[7] = -1998582454858022104L;
        ht.bjyg[8] = -7084865080561215088L;
        ht.bjyg[9] = 7204146535585668934L;
        ht.bjyg[10] = -2656443128014267395L;
        ht.bjyg[11] = -7455651193247029930L;
        ht.bjyg[12] = -2044299369859966621L;
        ht.bjyg[13] = -6203645006901750954L;
        ht.bjyg[14] = 5092307849420397845L;
        ht.bjyg[15] = -2144657484329158073L;
        ht.bjyg[16] = 4505684901553196302L;
        ht.bjyg[17] = -6611659726870667442L;
        ht.bjyg[18] = 1736013767945927530L;
        ht.bjyg[19] = 487687662480960506L;
        ht.bjyg[20] = -8702290699317056465L;
        ht.bjyg[21] = 6439501605834535211L;
        ht.bjyg[22] = -6989267637094222541L;
        ht.bjyg[23] = -3982944306604046095L;
        ht.bjyg[24] = -1870198662318531738L;
        ht.bjyg[25] = 4398901563780117727L;
        ht.bjyg[26] = -1616809027893115849L;
        ht.bjyg[27] = -406801744451634481L;
        ht.bjyg[28] = 6586493730887370017L;
        ht.bjyg[29] = 2048369385848837185L;
        ht.bjyg[30] = 7418287595292549932L;
        ht.bjyg[31] = -6265631658599980350L;
        ht.bjyg[32] = 8897957651118552505L;
        ht.bjyg[33] = -2748302711247182815L;
        ht.bjyg[34] = 5148148279849484238L;
        ht.bjyg[35] = 4119727625187883727L;
        ht.bjyg[36] = -1961560892213487588L;
        ht.bjyg[37] = -8923888915063651837L;
        ht.bjyg[38] = 8750116872183594146L;
        ht.bjyg[39] = 1441909028909059183L;
        ht.bjyg[40] = -3844757730399911015L;
        ht.bjyg[41] = -7328454193272943176L;
        ht.bjyg[42] = 4649216973568098244L;
        ht.bjyg[43] = -6311758774246782973L;
        ht.bjyg[44] = 6230542802791155810L;
        ht.bjyg[45] = -8372522755582496793L;
        ht.bjyg[46] = -5931947129483158514L;
        ht.bjyg[47] = 5398374220578257235L;
        ht.bjyg[48] = -4540309158527626688L;
        ht.bjyg[49] = -4320697949899878738L;
        ht.bjyg[50] = 8838009091769704729L;
        ht.bjyg[51] = -3673472562713864641L;
        ht.bjyg[52] = 3517299513356069326L;
        ht.bjyg[53] = -3075488634222671163L;
        ht.bjyg[54] = 254752270015374475L;
        ht.bjyg[55] = -1899067305966499216L;
        ht.bjyg[56] = 6440581317446773551L;
        ht.bjyg[57] = 4745694586728236470L;
        ht.bjyg[58] = -4052742715397713311L;
        ht.bjyg[59] = 8894989362272911144L;
        ht.bjyg[60] = -4760895340715948198L;
        ht.bjyg[61] = 3040060287140798155L;
        ht.bjyg[62] = 8851272000147467968L;
        ht.bjyg[63] = -5364589443476148739L;
        ht.bjyg[64] = -5411328604612403004L;
        ht.bjyg[65] = 4714546102786675258L;
        ht.bjyg[66] = -5312476573159133066L;
        ht.bjyg[67] = 1430905087579212395L;
        ht.bjyg[68] = 9085561930273281660L;
        ht.bjyg[69] = 502201358404978434L;
        ht.bjyg[70] = -4262118931933750773L;
        ht.bjyg[71] = 1918818999702426649L;
        ht.bjyg[72] = -478869533690002575L;
        ht.bjyg[73] = -3433097062582081329L;
        ht.bjyg[74] = -7273013446688145985L;
        ht.bjyg[75] = -826522386026169181L;
        ht.bjyg[76] = -2068611685044326349L;
        ht.bjyg[77] = 1075784780395979707L;
        ht.bjyg[78] = 6135741453547048130L;
        ht.bjyg[79] = 1314093247454604088L;
        ht.bjyg[80] = 6127484719446966178L;
        ht.bjyg[81] = 1117940052161298259L;
        ht.bjyg[82] = 3002313529826261078L;
        ht.bjyg[83] = -8353291675153579705L;
        ht.bjyg[84] = -4939551684866021004L;
        ht.bjyg[85] = 8127314888854239050L;
        ht.bjyg[86] = -5598538056220359079L;
        ht.bjyg[87] = 7283290221874195313L;
        ht.bjyg[88] = 5609172348962585765L;
        ht.bjyg[89] = -4325036438682467263L;
        ht.bjyg[90] = 7448080164872376553L;
        ht.bjyg[91] = -4817830374706507131L;
        ht.bjyg[92] = -2457945955409385375L;
        ht.bjyg[93] = -6276926977956684966L;
        ht.bjyg[94] = 3575955095968877991L;
        ht.bjyg[95] = 9150372052031737150L;
        ht.bjyg[96] = 2958195612321654120L;
        ht.bjyg[97] = 8634668969588578510L;
        ht.bjyg[98] = -8274859904824921774L;
        ht.bjyg[99] = -1288980551358719191L;
    }

    private static /* synthetic */ double blpm(int n2) {
        return Double.longBitsToDouble(bjye[n2] ^ bjyg[n2]);
    }

    private static /* synthetic */ void bmsj() {
        ht.bjwt[300] = -146061240;
        ht.bjwt[301] = -1738735093;
        ht.bjwt[302] = 2124860231;
        ht.bjwt[303] = 1229137635;
        ht.bjwt[304] = 487871135;
        ht.bjwt[305] = 1342556916;
        ht.bjwt[306] = 1871365297;
        ht.bjwt[307] = -90748115;
        ht.bjwt[308] = -95644931;
        ht.bjwt[309] = -1484787350;
        ht.bjwt[310] = 919130779;
        ht.bjwt[311] = -1007520038;
        ht.bjwt[312] = -1352365577;
        ht.bjwt[313] = -1423000263;
        ht.bjwt[314] = 1092808318;
        ht.bjwt[315] = -404908503;
        ht.bjwt[316] = -622661455;
        ht.bjwt[317] = -810759276;
        ht.bjwt[318] = -1635743145;
        ht.bjwt[319] = 2132527776;
        ht.bjwt[320] = -204902446;
        ht.bjwt[321] = -797205706;
        ht.bjwt[322] = -643062528;
        ht.bjwt[323] = 825576402;
        ht.bjwt[324] = -1830774737;
        ht.bjwt[325] = -1465975142;
        ht.bjwt[326] = 1763762531;
        ht.bjwt[327] = -173837520;
        ht.bjwt[328] = -289430569;
        ht.bjwt[329] = -118532234;
        ht.bjwt[330] = -519323516;
        ht.bjwt[331] = 1085799277;
        ht.bjwt[332] = 939627209;
        ht.bjwt[333] = -314198737;
        ht.bjwt[334] = -1020669109;
        ht.bjwt[335] = 1101090258;
        ht.bjwt[336] = -1307413824;
        ht.bjwt[337] = 87378724;
        ht.bjwt[338] = -1248277452;
        ht.bjwt[339] = -273233861;
        ht.bjwt[340] = 1794955440;
        ht.bjwt[341] = -848678002;
        ht.bjwt[342] = 1005502860;
        ht.bjwt[343] = -1317766032;
        ht.bjwt[344] = 1609374860;
        ht.bjwt[345] = -1565954105;
        ht.bjwt[346] = 1800449193;
        ht.bjwt[347] = -706019218;
        ht.bjwt[348] = 647122893;
        ht.bjwt[349] = -712125972;
        ht.bjwt[350] = 1796140819;
        ht.bjwt[351] = -421715876;
        ht.bjwt[352] = -9218493;
        ht.bjwt[353] = 763371200;
        ht.bjwt[354] = 485398687;
        ht.bjwt[355] = 391687441;
        ht.bjwt[356] = -763856196;
        ht.bjwt[357] = 724512474;
        ht.bjwt[358] = 660626488;
        ht.bjwt[359] = 745115606;
        ht.bjwt[360] = 232103180;
        ht.bjwt[361] = 1979744377;
        ht.bjwt[362] = 984618784;
        ht.bjwt[363] = 491516769;
        ht.bjwt[364] = -182065354;
        ht.bjwt[365] = 992319087;
        ht.bjwt[366] = -672488267;
        ht.bjwt[367] = -896606282;
        ht.bjwt[368] = -524872710;
        ht.bjwt[369] = 132773501;
        ht.bjwt[370] = -699097466;
        ht.bjwt[371] = 543634929;
        ht.bjwt[372] = 1146044805;
        ht.bjwt[373] = -345595032;
        ht.bjwt[374] = 527280757;
        ht.bjwt[375] = 768362608;
        ht.bjwt[376] = -1289768186;
        ht.bjwt[377] = 188317949;
        ht.bjwt[378] = 1888594019;
        ht.bjwt[379] = -1625814928;
        ht.bjwt[380] = 1244239744;
        ht.bjwt[381] = -1635748780;
        ht.bjwt[382] = -1919776982;
        ht.bjwt[383] = 1741285880;
        ht.bjwt[384] = -551032351;
        ht.bjwt[385] = -248527784;
        ht.bjwt[386] = -1192889136;
        ht.bjwt[387] = -2110152203;
        ht.bjwt[388] = -1213284780;
        ht.bjwt[389] = -1655734650;
        ht.bjwt[390] = 402742776;
        ht.bjwt[391] = 1765089958;
        ht.bjwt[392] = -1503555373;
        ht.bjwt[393] = 1288363705;
        ht.bjwt[394] = 439687113;
        ht.bjwt[395] = -242205666;
        ht.bjwt[396] = 884549812;
        ht.bjwt[397] = 266908002;
        ht.bjwt[398] = -930536617;
        ht.bjwt[399] = -472212249;
    }

    private static /* synthetic */ void bmsu() {
        ht.bjyg[300] = 160443316113641878L;
        ht.bjyg[301] = -5457686096536375878L;
        ht.bjyg[302] = 2586843025325718227L;
        ht.bjyg[303] = -834211354431082711L;
        ht.bjyg[304] = 4472119021821871578L;
        ht.bjyg[305] = -3741050304412545236L;
        ht.bjyg[306] = 1297143477010263888L;
        ht.bjyg[307] = 7433020118463257354L;
        ht.bjyg[308] = 3413938679728868141L;
        ht.bjyg[309] = 2761059974202651136L;
        ht.bjyg[310] = -4903866801650853942L;
        ht.bjyg[311] = -5453123035764698549L;
        ht.bjyg[312] = -7041642049240888607L;
        ht.bjyg[313] = 8055906693891500441L;
        ht.bjyg[314] = 7611055951746301591L;
        ht.bjyg[315] = 6513060496398164608L;
    }

    private static /* synthetic */ void bmsi() {
        ht.bjwt[200] = 1018342560;
        ht.bjwt[201] = 782941666;
        ht.bjwt[202] = -1402998232;
        ht.bjwt[203] = 1481329549;
        ht.bjwt[204] = 75720300;
        ht.bjwt[205] = 1662491294;
        ht.bjwt[206] = -1840602575;
        ht.bjwt[207] = 4035227;
        ht.bjwt[208] = 691941534;
        ht.bjwt[209] = 619308629;
        ht.bjwt[210] = 2070366959;
        ht.bjwt[211] = -208599136;
        ht.bjwt[212] = -515179051;
        ht.bjwt[213] = 2048676938;
        ht.bjwt[214] = -127003267;
        ht.bjwt[215] = -665892672;
        ht.bjwt[216] = -1131067247;
        ht.bjwt[217] = 1220517633;
        ht.bjwt[218] = 848349102;
        ht.bjwt[219] = 1739293899;
        ht.bjwt[220] = -905910742;
        ht.bjwt[221] = 1345294886;
        ht.bjwt[222] = -2078092772;
        ht.bjwt[223] = -1129942593;
        ht.bjwt[224] = 476353795;
        ht.bjwt[225] = 326389421;
        ht.bjwt[226] = -1335121023;
        ht.bjwt[227] = 538748817;
        ht.bjwt[228] = 920828415;
        ht.bjwt[229] = -198103750;
        ht.bjwt[230] = -1849764386;
        ht.bjwt[231] = -1026241679;
        ht.bjwt[232] = -39040022;
        ht.bjwt[233] = 1100929466;
        ht.bjwt[234] = 155138053;
        ht.bjwt[235] = -815842465;
        ht.bjwt[236] = -918869993;
        ht.bjwt[237] = -1467104302;
        ht.bjwt[238] = 1676742025;
        ht.bjwt[239] = -1995750995;
        ht.bjwt[240] = 1660967441;
        ht.bjwt[241] = -854064677;
        ht.bjwt[242] = -1596025787;
        ht.bjwt[243] = -1911092156;
        ht.bjwt[244] = -1624394149;
        ht.bjwt[245] = -1599934686;
        ht.bjwt[246] = 1366697593;
        ht.bjwt[247] = 1392719438;
        ht.bjwt[248] = -546210960;
        ht.bjwt[249] = -113436062;
        ht.bjwt[250] = 2096127357;
        ht.bjwt[251] = 694079338;
        ht.bjwt[252] = -698914201;
        ht.bjwt[253] = -1317954364;
        ht.bjwt[254] = 1494075764;
        ht.bjwt[255] = 487613466;
        ht.bjwt[256] = 2043380485;
        ht.bjwt[257] = -819547243;
        ht.bjwt[258] = 993233121;
        ht.bjwt[259] = 1646362569;
        ht.bjwt[260] = -314574990;
        ht.bjwt[261] = 279591905;
        ht.bjwt[262] = 285296000;
        ht.bjwt[263] = 1496435472;
        ht.bjwt[264] = -1299044560;
        ht.bjwt[265] = 1754776667;
        ht.bjwt[266] = 193571411;
        ht.bjwt[267] = 1661422132;
        ht.bjwt[268] = 1884280136;
        ht.bjwt[269] = -1477224065;
        ht.bjwt[270] = -1991006470;
        ht.bjwt[271] = -1895464973;
        ht.bjwt[272] = 1214057925;
        ht.bjwt[273] = -1914540038;
        ht.bjwt[274] = -1227090873;
        ht.bjwt[275] = 2091743359;
        ht.bjwt[276] = -2062651802;
        ht.bjwt[277] = 924750153;
        ht.bjwt[278] = 1756663313;
        ht.bjwt[279] = -1713045302;
        ht.bjwt[280] = 64145038;
        ht.bjwt[281] = -86790497;
        ht.bjwt[282] = 114660936;
        ht.bjwt[283] = -823947772;
        ht.bjwt[284] = 650265215;
        ht.bjwt[285] = -782877173;
        ht.bjwt[286] = -75016886;
        ht.bjwt[287] = -108553887;
        ht.bjwt[288] = -1726442041;
        ht.bjwt[289] = 2033944026;
        ht.bjwt[290] = -1968862348;
        ht.bjwt[291] = -1396739041;
        ht.bjwt[292] = -385689351;
        ht.bjwt[293] = 1663089209;
        ht.bjwt[294] = -1523021830;
        ht.bjwt[295] = 433903559;
        ht.bjwt[296] = -360640864;
        ht.bjwt[297] = -1844195041;
        ht.bjwt[298] = -1297729285;
        ht.bjwt[299] = 999160788;
    }

    private static /* synthetic */ int bjwq(int n2) {
        return bjwr[n2] ^ bjwt[n2];
    }

    private static /* synthetic */ void bmse() {
        ht.bjwr[500] = -1669632209;
        ht.bjwr[501] = -1758983564;
        ht.bjwr[502] = 1328584418;
        ht.bjwr[503] = 1094389070;
        ht.bjwr[504] = 1082924131;
        ht.bjwr[505] = 482893069;
        ht.bjwr[506] = -410880109;
        ht.bjwr[507] = -1320987840;
        ht.bjwr[508] = 310135775;
        ht.bjwr[509] = -969798953;
        ht.bjwr[510] = 1421167653;
        ht.bjwr[511] = -2010033609;
        ht.bjwr[512] = 951900637;
        ht.bjwr[513] = -248040341;
        ht.bjwr[514] = 709999138;
        ht.bjwr[515] = 960955179;
        ht.bjwr[516] = -34097016;
        ht.bjwr[517] = -1963957172;
        ht.bjwr[518] = 1403559029;
        ht.bjwr[519] = -1508344854;
        ht.bjwr[520] = 589937195;
        ht.bjwr[521] = 1113124410;
        ht.bjwr[522] = 272621951;
        ht.bjwr[523] = -391758887;
        ht.bjwr[524] = 993856515;
        ht.bjwr[525] = -71481465;
        ht.bjwr[526] = -1925463847;
        ht.bjwr[527] = 533459927;
        ht.bjwr[528] = -11447246;
        ht.bjwr[529] = 2141753783;
        ht.bjwr[530] = 1265634528;
        ht.bjwr[531] = 2086664084;
        ht.bjwr[532] = -405412209;
        ht.bjwr[533] = 796959196;
        ht.bjwr[534] = -1828777806;
        ht.bjwr[535] = 44707506;
        ht.bjwr[536] = 987581372;
        ht.bjwr[537] = 935155340;
        ht.bjwr[538] = -1802099057;
        ht.bjwr[539] = -1955536234;
        ht.bjwr[540] = -1489013453;
        ht.bjwr[541] = 1848377218;
        ht.bjwr[542] = 1457224853;
        ht.bjwr[543] = -903033123;
        ht.bjwr[544] = -1468231769;
        ht.bjwr[545] = 1034367533;
        ht.bjwr[546] = 1058388271;
        ht.bjwr[547] = -396335284;
        ht.bjwr[548] = 761166768;
        ht.bjwr[549] = -725240292;
        ht.bjwr[550] = -1189247816;
        ht.bjwr[551] = -1718782466;
        ht.bjwr[552] = 1655780830;
        ht.bjwr[553] = -1826105812;
        ht.bjwr[554] = -1852261365;
        ht.bjwr[555] = 1469836852;
        ht.bjwr[556] = -1589295609;
        ht.bjwr[557] = -943873844;
        ht.bjwr[558] = -657232665;
        ht.bjwr[559] = 282466247;
        ht.bjwr[560] = 96867998;
        ht.bjwr[561] = -972723639;
        ht.bjwr[562] = 198319982;
        ht.bjwr[563] = 1580170700;
        ht.bjwr[564] = -1758448199;
        ht.bjwr[565] = -1129794263;
        ht.bjwr[566] = 936635848;
        ht.bjwr[567] = -1392721279;
        ht.bjwr[568] = 645067897;
        ht.bjwr[569] = -2060184035;
        ht.bjwr[570] = 173203201;
        ht.bjwr[571] = 1701917632;
        ht.bjwr[572] = 2099462255;
        ht.bjwr[573] = 148276164;
        ht.bjwr[574] = -70651765;
        ht.bjwr[575] = -1565662863;
        ht.bjwr[576] = -1539211214;
        ht.bjwr[577] = 1033583711;
        ht.bjwr[578] = 377676089;
        ht.bjwr[579] = -1843591307;
        ht.bjwr[580] = -796337217;
        ht.bjwr[581] = 93798604;
        ht.bjwr[582] = 1085502970;
        ht.bjwr[583] = 436740779;
        ht.bjwr[584] = -428006351;
        ht.bjwr[585] = -348547438;
        ht.bjwr[586] = -1612955593;
        ht.bjwr[587] = -1028668415;
        ht.bjwr[588] = -1979252006;
        ht.bjwr[589] = -1093359832;
        ht.bjwr[590] = -1760374282;
        ht.bjwr[591] = 259621580;
        ht.bjwr[592] = 1527880785;
        ht.bjwr[593] = 1347617727;
        ht.bjwr[594] = -2012605470;
        ht.bjwr[595] = 246773770;
        ht.bjwr[596] = 276625267;
        ht.bjwr[597] = -1068742963;
        ht.bjwr[598] = -786125770;
        ht.bjwr[599] = 611705602;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onKey(cn var1_1) {
        block68: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bjyi", bjyc(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ht.bjwv("bjyj", bjwq(int ), (int)15)) break;
                v0 /* !! */  = (long)ht.bjwv("bjyl", bjwq(int ), (int)16);
            }
            var4_2 = ht.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bjym", bjyc(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ht.bjwv("bjyn", bjwq(int ), (int)17)) break;
                v1 /* !! */  = (long)ht.bjwv("bjyp", bjwq(int ), (int)18);
            }
            var3_3 /* !! */  = ht.b;
            v2 /* !! */  = ht.dn;
            if (true) ** GOTO lbl17
            block42: while (true) {
                v2 /* !! */  = (long)(v3 - ht.bjwv("bjyr", bjyc(int ), (int)2));
lbl17:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -479120111: {
                        v3 = ht.bjwv("bjyt", bjyc(int ), (int)3);
                        continue block42;
                    }
                    case 240546907: {
                        break block42;
                    }
                    case 829828036: {
                        v3 = ht.bjwv("bjyu", bjyc(int ), (int)4);
                        continue block42;
                    }
                }
                break;
            }
            var2_4 = ht.a;
            if (var4_2) {
                throw null;
lbl29:
                // 9 sources

                return;
            }
            if (var2_4 || var2_4) ** GOTO lbl29
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("bjyv", bjyc(int ), (int)5)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ht.bjwv("bjyw", bjwq(int ), (int)19)) break;
                v4 /* !! */  = (long)ht.bjwv("bjyx", bjwq(int ), (int)20);
            }
            v5 /* !! */  = ht.dn;
            if (true) ** GOTO lbl41
            block45: while (true) {
                v5 /* !! */  = (long)(v6 - ht.bjwv("bjyy", bjyc(int ), (int)6));
lbl41:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -1838991944: {
                        v6 = ht.bjwv("bjyz", bjyc(int ), (int)7);
                        continue block45;
                    }
                    case -347254709: {
                        v6 = ht.bjwv("bjzb", bjyc(int ), (int)8);
                        continue block45;
                    }
                    case 240546907: {
                        break block45;
                    }
                }
                break;
            }
            if (!var1_1.isBindDown(this.webTrapBind)) break block68;
            if (var2_4) ** GOTO lbl29
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("bjzd", bjyc(int ), (int)9)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ht.bjwv("bjze", bjwq(int ), (int)21)) break;
                v7 /* !! */  = (long)ht.bjwv("bjzf", bjwq(int ), (int)22);
            }
            v8 /* !! */  = ht.dn;
            if (true) ** GOTO lbl61
            block47: while (true) {
                v8 /* !! */  = (long)(v9 - ht.bjwv("bjzh", bjyc(int ), (int)10));
lbl61:
                // 2 sources

                switch ((int)v8 /* !! */ ) {
                    case -2015385281: {
                        v9 = ht.bjwv("bjzi", bjyc(int ), (int)11);
                        continue block47;
                    }
                    case -1147970221: {
                        v9 = ht.bjwv("bjzl", bjyc(int ), (int)12);
                        continue block47;
                    }
                    case 240546907: {
                        break block47;
                    }
                }
                break;
            }
            if (ht.mc.field_1724 == null) break block68;
            if (var2_4) ** GOTO lbl29
            v10 /* !! */  = ht.dn;
            if (true) ** GOTO lbl76
            block48: while (true) {
                v10 /* !! */  = (long)(ht.bjwv("bjzn", bjyc(int ), (int)14) - ht.bjwv("bjzm", bjyc(int ), (int)13));
lbl76:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case 240546907: {
                        break block48;
                    }
                    case 2067831459: {
                        continue block48;
                    }
                }
                break;
            }
            while (true) {
                if ((v11 /* !! */  = (cfr_temp_4 = ht.dn - ht.bjwv("bjzp", bjyc(int ), (int)15)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v11 /* !! */  == ht.bjwv("bjzq", bjwq(int ), (int)23)) break;
                v11 /* !! */  = (long)ht.bjwv("bjzs", bjwq(int ), (int)24);
            }
            if (ht.mc.field_1687 == null) break block68;
            if (var2_4) ** GOTO lbl29
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_5 = ht.dn - ht.bjwv("bjzu", bjyc(int ), (int)16)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == ht.bjwv("bjzx", bjwq(int ), (int)25)) break;
                v12 /* !! */  = (long)ht.bjwv("bjzy", bjwq(int ), (int)26);
            }
            v13 /* !! */  = ht.dn;
            if (true) ** GOTO lbl97
            block51: while (true) {
                v13 /* !! */  = (long)(v14 - ht.bjwv("bjzz", bjyc(int ), (int)17));
lbl97:
                // 2 sources

                switch ((int)v13 /* !! */ ) {
                    case 240546907: {
                        break block51;
                    }
                    case 1013912680: {
                        v14 = ht.bjwv("bkaa", bjyc(int ), (int)18);
                        continue block51;
                    }
                    case 1229742212: {
                        v14 = ht.bjwv("bkab", bjyc(int ), (int)19);
                        continue block51;
                    }
                    case 1474062522: {
                        v14 = ht.bjwv("bkac", bjyc(int ), (int)20);
                        continue block51;
                    }
                }
                break;
            }
            if (ht.mc.field_1761 == null) break block68;
            if (var2_4) ** GOTO lbl29
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_6 = ht.dn - ht.bjwv("bkaf", bjyc(int ), (int)21)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == ht.bjwv("bkah", bjwq(int ), (int)27)) break;
                v15 /* !! */  = (long)ht.bjwv("bkai", bjwq(int ), (int)28);
            }
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_7 = ht.dn - ht.bjwv("bkak", bjyc(int ), (int)22)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == ht.bjwv("bkal", bjwq(int ), (int)29)) break;
                v16 /* !! */  = (long)ht.bjwv("bkan", bjwq(int ), (int)30);
            }
            if (this.stage != ht$Stage.IDLE) break block68;
            if (var2_4 || var2_4) ** GOTO lbl29
            while (true) {
                if ((v17 /* !! */  = (cfr_temp_8 = ht.dn - ht.bjwv("bkap", bjyc(int ), (int)23)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v17 /* !! */  == ht.bjwv("bkaq", bjwq(int ), (int)31)) break;
                v17 /* !! */  = (long)ht.bjwv("bkas", bjwq(int ), (int)32);
            }
            while (true) {
                if ((v18 /* !! */  = (cfr_temp_9 = ht.dn - ht.bjwv("bkau", bjyc(int ), (int)24)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                if (v18 /* !! */  == ht.bjwv("bkav", bjwq(int ), (int)33)) break;
                v18 /* !! */  = (long)ht.bjwv("bkax", bjwq(int ), (int)34);
            }
            this.stage = ht$Stage.REQUESTED;
            if (var2_4) ** GOTO lbl29
        }
        if (var2_4) ** GOTO lbl29
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ht.bjwv("bkaz", bjwq(int ), (int)35);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl148:
            // 3 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)ht.bjwv("bkbc", bjwq(int ), (int)36);
                } while (!var4_2);
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbe", bjwq(int ), (int)37);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl182
            }
            case 3: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbg", bjwq(int ), (int)38);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl163:
            // 3 sources

            case 4: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbh", bjwq(int ), (int)39);
                if (!var4_2) ** GOTO lbl148
                throw null;
            }
            case 5: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbi", bjwq(int ), (int)40);
                if (!var4_2) ** GOTO lbl148
                throw null;
            }
            case 6: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbj", bjwq(int ), (int)41);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ht.bjwv("bkbk", bjwq(int ), (int)42);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl186
                    break;
                }
            }
lbl182:
            // 2 sources

            case 8: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbn", bjwq(int ), (int)43);
                if (var4_2) {
                    throw null;
                }
            }
lbl186:
            // 6 sources

            case 9: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbp", bjwq(int ), (int)44);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl195
            }
            case 10: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbq", bjwq(int ), (int)45);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
lbl195:
            // 3 sources

            case 11: {
                var3_3 /* !! */  = (int)ht.bjwv("bkbr", bjwq(int ), (int)46);
                if (!var4_2) ** GOTO lbl163
                throw null;
            }
            case 12: 
        }
        var3_3 /* !! */  = (int)ht.bjwv("bkbs", bjwq(int ), (int)47);
        ** while (!var4_2)
lbl202:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bmsk() {
        ht.bjwt[400] = -934997019;
        ht.bjwt[401] = 1909944170;
        ht.bjwt[402] = -1620335054;
        ht.bjwt[403] = -1465926227;
        ht.bjwt[404] = -1676275257;
        ht.bjwt[405] = -1175338314;
        ht.bjwt[406] = 904656542;
        ht.bjwt[407] = 552012566;
        ht.bjwt[408] = -1121367065;
        ht.bjwt[409] = 1905466127;
        ht.bjwt[410] = -1640597511;
        ht.bjwt[411] = 1398682459;
        ht.bjwt[412] = 306223695;
        ht.bjwt[413] = 1606165251;
        ht.bjwt[414] = 397970960;
        ht.bjwt[415] = 1321460096;
        ht.bjwt[416] = 1889588940;
        ht.bjwt[417] = -1465640833;
        ht.bjwt[418] = 843420984;
        ht.bjwt[419] = 321330838;
        ht.bjwt[420] = -1542051573;
        ht.bjwt[421] = 1696798996;
        ht.bjwt[422] = 121287078;
        ht.bjwt[423] = 1030615962;
        ht.bjwt[424] = 1456489194;
        ht.bjwt[425] = 1170223837;
        ht.bjwt[426] = -1346199521;
        ht.bjwt[427] = -645177016;
        ht.bjwt[428] = 189009678;
        ht.bjwt[429] = 442718069;
        ht.bjwt[430] = -724030173;
        ht.bjwt[431] = -2031787407;
        ht.bjwt[432] = -499680261;
        ht.bjwt[433] = -857630276;
        ht.bjwt[434] = -1983023694;
        ht.bjwt[435] = 2028405282;
        ht.bjwt[436] = 1889276026;
        ht.bjwt[437] = 49870033;
        ht.bjwt[438] = -1766542019;
        ht.bjwt[439] = -102875341;
        ht.bjwt[440] = 246560072;
        ht.bjwt[441] = -63071036;
        ht.bjwt[442] = -1549667830;
        ht.bjwt[443] = 1822380806;
        ht.bjwt[444] = 1143367611;
        ht.bjwt[445] = 1641967794;
        ht.bjwt[446] = -715033870;
        ht.bjwt[447] = 1221336088;
        ht.bjwt[448] = 1701747002;
        ht.bjwt[449] = -1216960342;
        ht.bjwt[450] = -705904456;
        ht.bjwt[451] = -490429692;
        ht.bjwt[452] = 672331303;
        ht.bjwt[453] = -1216260813;
        ht.bjwt[454] = -1656920660;
        ht.bjwt[455] = -234520312;
        ht.bjwt[456] = 631493204;
        ht.bjwt[457] = -1687206732;
        ht.bjwt[458] = -18386626;
        ht.bjwt[459] = 1385750027;
        ht.bjwt[460] = 1623025846;
        ht.bjwt[461] = -294954218;
        ht.bjwt[462] = -778034989;
        ht.bjwt[463] = 1351273184;
        ht.bjwt[464] = 492528215;
        ht.bjwt[465] = -1256570969;
        ht.bjwt[466] = 407224795;
        ht.bjwt[467] = -137200692;
        ht.bjwt[468] = -613853039;
        ht.bjwt[469] = 302810433;
        ht.bjwt[470] = -809819869;
        ht.bjwt[471] = 1513498437;
        ht.bjwt[472] = 664585848;
        ht.bjwt[473] = 812167338;
        ht.bjwt[474] = 926554983;
        ht.bjwt[475] = 684166396;
        ht.bjwt[476] = -965206632;
        ht.bjwt[477] = -2033925826;
        ht.bjwt[478] = -421125333;
        ht.bjwt[479] = 737372445;
        ht.bjwt[480] = -283250209;
        ht.bjwt[481] = -1182982197;
        ht.bjwt[482] = 1000394698;
        ht.bjwt[483] = 1677613013;
        ht.bjwt[484] = -1969852196;
        ht.bjwt[485] = -263120965;
        ht.bjwt[486] = 1152371150;
        ht.bjwt[487] = 7204116;
        ht.bjwt[488] = -677865430;
        ht.bjwt[489] = 619396728;
        ht.bjwt[490] = -924538750;
        ht.bjwt[491] = -8059756;
        ht.bjwt[492] = 1040965414;
        ht.bjwt[493] = 964586763;
        ht.bjwt[494] = 1257018566;
        ht.bjwt[495] = -570019834;
        ht.bjwt[496] = 1752614178;
        ht.bjwt[497] = -364654172;
        ht.bjwt[498] = 322840348;
        ht.bjwt[499] = -1199611346;
    }

    /*
     * Exception decompiling
     */
    private boolean isFaceVisible(class_2338 var1_1, class_2350 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CASE]], but top level block is 8[SWITCH]
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

    private static /* synthetic */ void bmsp() {
        ht.bjye[200] = -8366034167029522120L;
        ht.bjye[201] = -7674471943039023851L;
        ht.bjye[202] = 6807722051189702401L;
        ht.bjye[203] = 1896250838230960443L;
        ht.bjye[204] = -2582028830539575831L;
        ht.bjye[205] = -2895653137062063638L;
        ht.bjye[206] = -6335817824867944732L;
        ht.bjye[207] = 5565308610764777301L;
        ht.bjye[208] = -5374859869119792909L;
        ht.bjye[209] = -7652642736871314374L;
        ht.bjye[210] = 4580208695544171727L;
        ht.bjye[211] = -9112985306170640238L;
        ht.bjye[212] = 1285429579734958069L;
        ht.bjye[213] = -7123962896962323037L;
        ht.bjye[214] = -848283736272400163L;
        ht.bjye[215] = 2302307718806666300L;
        ht.bjye[216] = 5890172641645664737L;
        ht.bjye[217] = 992229537038787321L;
        ht.bjye[218] = -7677987997871203700L;
        ht.bjye[219] = 4061596090120055377L;
        ht.bjye[220] = -374744718098213745L;
        ht.bjye[221] = -6348156621815507643L;
        ht.bjye[222] = -5772092644099063162L;
        ht.bjye[223] = 7969927086537179909L;
        ht.bjye[224] = 583870201284478589L;
        ht.bjye[225] = 629111568449347612L;
        ht.bjye[226] = -8097827042582274523L;
        ht.bjye[227] = 6124603249798315658L;
        ht.bjye[228] = -3130247000351285243L;
        ht.bjye[229] = 639831400452609162L;
        ht.bjye[230] = 7375186997229799903L;
        ht.bjye[231] = 6527899528454531958L;
        ht.bjye[232] = 3178902682337466827L;
        ht.bjye[233] = -7477000477654577578L;
        ht.bjye[234] = 7823619249566596463L;
        ht.bjye[235] = 4306426687217184535L;
        ht.bjye[236] = -3292375058318519591L;
        ht.bjye[237] = -819832971277750534L;
        ht.bjye[238] = -1883517403833196165L;
        ht.bjye[239] = 1522148412630202967L;
        ht.bjye[240] = 7998887724313452258L;
        ht.bjye[241] = -1603359365383433149L;
        ht.bjye[242] = 4936514945332474618L;
        ht.bjye[243] = -3534072004440404973L;
        ht.bjye[244] = 3078567262473633670L;
        ht.bjye[245] = 6400706240723806140L;
        ht.bjye[246] = -2814299763197395866L;
        ht.bjye[247] = 9026087488571179937L;
        ht.bjye[248] = -2807407387203382198L;
        ht.bjye[249] = 1212401700457511533L;
        ht.bjye[250] = -3638957830123783628L;
        ht.bjye[251] = 8240286244594439694L;
        ht.bjye[252] = -7842938022304606240L;
        ht.bjye[253] = -8084306411872565465L;
        ht.bjye[254] = 41815517865731053L;
        ht.bjye[255] = 2321219546893124536L;
        ht.bjye[256] = 4597070088553844704L;
        ht.bjye[257] = -2446479535274911580L;
        ht.bjye[258] = -4487263253927009270L;
        ht.bjye[259] = -8179498311213302928L;
        ht.bjye[260] = -1952875421688434948L;
        ht.bjye[261] = -4071585634537991330L;
        ht.bjye[262] = -1989012973195744074L;
        ht.bjye[263] = 563615086603035357L;
        ht.bjye[264] = 3736338663449832839L;
        ht.bjye[265] = -5730454821890540511L;
        ht.bjye[266] = 5095008374479918778L;
        ht.bjye[267] = -2542855269010341884L;
        ht.bjye[268] = -1115089055536507626L;
        ht.bjye[269] = 6940227554250953467L;
        ht.bjye[270] = 8270288459305090124L;
        ht.bjye[271] = 6215163450857696025L;
        ht.bjye[272] = 4714462090540002762L;
        ht.bjye[273] = 2847912143871960894L;
        ht.bjye[274] = -4538232375646780066L;
        ht.bjye[275] = 7601155402034140364L;
        ht.bjye[276] = 5921228291935859423L;
        ht.bjye[277] = -7034548408537792666L;
        ht.bjye[278] = -1633410563228972167L;
        ht.bjye[279] = 7581848222488618715L;
        ht.bjye[280] = -5061253181802558305L;
        ht.bjye[281] = -1221280055402107860L;
        ht.bjye[282] = -3613940488128295166L;
        ht.bjye[283] = 4613431534260510936L;
        ht.bjye[284] = 1747271228350069936L;
        ht.bjye[285] = 2751360528713238250L;
        ht.bjye[286] = -6869185883033136614L;
        ht.bjye[287] = -9026093693491719860L;
        ht.bjye[288] = 7157595187755943741L;
        ht.bjye[289] = -8074221887078920006L;
        ht.bjye[290] = 7136982981960697653L;
        ht.bjye[291] = -8352155686475089889L;
        ht.bjye[292] = 3358174856557658907L;
        ht.bjye[293] = 1246152077538750688L;
        ht.bjye[294] = 8946348427750851965L;
        ht.bjye[295] = 4425646356114962904L;
        ht.bjye[296] = 4288894218086413987L;
        ht.bjye[297] = -1379666897518623741L;
        ht.bjye[298] = -1041541145474248988L;
        ht.bjye[299] = 2753968408712065078L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_1657 findNearestTarget() {
        v0 /* !! */  = ht.dn;
        if (true) ** GOTO lbl5
        block73: while (true) {
            v0 /* !! */  = (long)(v1 - ht.bjwv("blvk", bjyc(int ), (int)72));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1374658217: {
                    v1 = ht.bjwv("blvl", bjyc(int ), (int)73);
                    continue block73;
                }
                case 240546907: {
                    break block73;
                }
                case 1647220785: {
                    v1 = ht.bjwv("blvm", bjyc(int ), (int)74);
                    continue block73;
                }
                case 1652151794: {
                    v1 = ht.bjwv("blvn", bjyc(int ), (int)75);
                    continue block73;
                }
            }
            break;
        }
        var3_1 = ht.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("blvo", bjyc(int ), (int)76)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ht.bjwv("blvp", bjwq(int ), (int)299)) break;
            v2 /* !! */  = (long)ht.bjwv("blvq", bjwq(int ), (int)300);
        }
        var2_2 /* !! */  = ht.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("blvr", bjyc(int ), (int)77)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ht.bjwv("blvs", bjwq(int ), (int)301)) break;
            v3 /* !! */  = (long)ht.bjwv("blvt", bjwq(int ), (int)302);
        }
        var1_3 = ht.a;
        if (!var3_1) ** GOTO lbl36
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl36:
                // 1 sources

                if (var1_3 || var1_3) continue block76;
                v4 /* !! */  = ht.dn;
                if (true) ** GOTO lbl41
                block77: while (true) {
                    v4 /* !! */  = (long)(v5 - ht.bjwv("blvu", bjyc(int ), (int)78));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 240546907: {
                            break block77;
                        }
                        case 1217410969: {
                            v5 = ht.bjwv("blvv", bjyc(int ), (int)79);
                            continue block77;
                        }
                        case 2035348425: {
                            v5 = ht.bjwv("blvw", bjyc(int ), (int)80);
                            continue block77;
                        }
                    }
                    break;
                }
                v6 /* !! */  = ht.dn;
                if (true) ** GOTO lbl54
                block78: while (true) {
                    v6 /* !! */  = (long)(v7 - ht.bjwv("blvx", bjyc(int ), (int)81));
lbl54:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1110776405: {
                            v7 = ht.bjwv("blvy", bjyc(int ), (int)82);
                            continue block78;
                        }
                        case 240546907: {
                            break block78;
                        }
                        case 1896951242: {
                            v7 = ht.bjwv("blvz", bjyc(int ), (int)83);
                            continue block78;
                        }
                    }
                    break;
                }
                v8 = ht.mc.field_1687;
                v9 /* !! */  = ht.dn;
                if (true) ** GOTO lbl68
                block79: while (true) {
                    v9 /* !! */  = (long)(ht.bjwv("blwb", bjyc(int ), (int)85) - ht.bjwv("blwa", bjyc(int ), (int)84));
lbl68:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 240546907: {
                            break block79;
                        }
                        case 1804661154: {
                            continue block79;
                        }
                    }
                    break;
                }
                v10 = v8.method_18456();
                v11 /* !! */  = ht.dn;
                if (true) ** GOTO lbl78
                block80: while (true) {
                    v11 /* !! */  = (long)(v12 - ht.bjwv("blwc", bjyc(int ), (int)86));
lbl78:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1814880654: {
                            v12 = ht.bjwv("blwd", bjyc(int ), (int)87);
                            continue block80;
                        }
                        case 240546907: {
                            break block80;
                        }
                        case 344215352: {
                            v12 = ht.bjwv("blwe", bjyc(int ), (int)88);
                            continue block80;
                        }
                    }
                    break;
                }
                v13 = v10.stream();
                v14 /* !! */  = ht.dn;
                if (true) ** GOTO lbl92
                block81: while (true) {
                    v14 /* !! */  = (long)(ht.bjwv("blwg", bjyc(int ), (int)90) - ht.bjwv("blwf", bjyc(int ), (int)89));
lbl92:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 240546907: {
                            break block81;
                        }
                        case 335330088: {
                            continue block81;
                        }
                    }
                    break;
                }
                v15 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findNearestTarget$0(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("blwh", bjyc(int ), (int)91)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ht.bjwv("blwi", bjwq(int ), (int)303)) break;
                    v16 /* !! */  = (long)ht.bjwv("blwj", bjwq(int ), (int)304);
                }
                v17 = v13.filter(v15);
                v18 /* !! */  = ht.dn;
                if (true) ** GOTO lbl108
                block83: while (true) {
                    v18 /* !! */  = (long)(v19 - ht.bjwv("blwk", bjyc(int ), (int)92));
lbl108:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1025068529: {
                            v19 = ht.bjwv("blwl", bjyc(int ), (int)93);
                            continue block83;
                        }
                        case 240546907: {
                            break block83;
                        }
                        case 435610852: {
                            v19 = ht.bjwv("blwm", bjyc(int ), (int)94);
                            continue block83;
                        }
                        case 708632183: {
                            v19 = ht.bjwv("blwn", bjyc(int ), (int)95);
                            continue block83;
                        }
                    }
                    break;
                }
                v20 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method_5805(), (Lnet/minecraft/class_742;)Z)();
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("blwo", bjyc(int ), (int)96)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ht.bjwv("blwp", bjwq(int ), (int)305)) break;
                    v21 /* !! */  = (long)ht.bjwv("blwq", bjwq(int ), (int)306);
                }
                v22 = v17.filter(v20);
                v23 /* !! */  = ht.dn;
                if (true) ** GOTO lbl131
                block85: while (true) {
                    v23 /* !! */  = (long)(ht.bjwv("blws", bjyc(int ), (int)98) - ht.bjwv("blwr", bjyc(int ), (int)97));
lbl131:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case 240546907: {
                            break block85;
                        }
                        case 1894627069: {
                            continue block85;
                        }
                    }
                    break;
                }
                v24 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findNearestTarget$1(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)();
                v25 /* !! */  = ht.dn;
                if (true) ** GOTO lbl141
                block86: while (true) {
                    v25 /* !! */  = (long)(v26 - ht.bjwv("blwt", bjyc(int ), (int)99));
lbl141:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case 141425226: {
                            v26 = ht.bjwv("blwu", bjyc(int ), (int)100);
                            continue block86;
                        }
                        case 240546907: {
                            break block86;
                        }
                        case 1022314817: {
                            v26 = ht.bjwv("blwv", bjyc(int ), (int)101);
                            continue block86;
                        }
                        case 1325276184: {
                            v26 = ht.bjwv("blww", bjyc(int ), (int)102);
                            continue block86;
                        }
                    }
                    break;
                }
                v27 = v22.filter(v24);
                v28 /* !! */  = ht.dn;
                if (true) ** GOTO lbl158
                block87: while (true) {
                    v28 /* !! */  = (long)(v29 - ht.bjwv("blwx", bjyc(int ), (int)103));
lbl158:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 209556580: {
                            v29 = ht.bjwv("blwy", bjyc(int ), (int)104);
                            continue block87;
                        }
                        case 240546907: {
                            break block87;
                        }
                        case 1487981248: {
                            v29 = ht.bjwv("blwz", bjyc(int ), (int)105);
                            continue block87;
                        }
                    }
                    break;
                }
                v30 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findNearestTarget$2(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)();
                v31 /* !! */  = ht.dn;
                if (true) ** GOTO lbl172
                block88: while (true) {
                    v31 /* !! */  = (long)(ht.bjwv("blxb", bjyc(int ), (int)107) - ht.bjwv("blxa", bjyc(int ), (int)106));
lbl172:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1137980475: {
                            continue block88;
                        }
                        case 240546907: {
                            break block88;
                        }
                    }
                    break;
                }
                v32 = v27.filter(v30);
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_4 = ht.dn - ht.bjwv("blxc", bjyc(int ), (int)108)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == ht.bjwv("blxd", bjwq(int ), (int)307)) break;
                    v33 /* !! */  = (long)ht.bjwv("blxe", bjwq(int ), (int)308);
                }
                v34 = (Predicate<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$findNearestTarget$3(net.minecraft.class_742 ), (Lnet/minecraft/class_742;)Z)();
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_5 = ht.dn - ht.bjwv("blxf", bjyc(int ), (int)109)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == ht.bjwv("blxg", bjwq(int ), (int)309)) break;
                    v35 /* !! */  = (long)ht.bjwv("blxh", bjwq(int ), (int)310);
                }
                v36 = v32.filter(v34);
                while (true) {
                    if ((v37 /* !! */  = (cfr_temp_6 = ht.dn - ht.bjwv("blxi", bjyc(int ), (int)110)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v37 /* !! */  == ht.bjwv("blxj", bjwq(int ), (int)311)) break;
                    v37 /* !! */  = (long)ht.bjwv("blxk", bjwq(int ), (int)312);
                }
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_7 = ht.dn - ht.bjwv("blxl", bjyc(int ), (int)111)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == ht.bjwv("blxm", bjwq(int ), (int)313)) break;
                    v38 /* !! */  = (long)ht.bjwv("blxn", bjwq(int ), (int)314);
                }
                v39 = ht.mc.field_1724;
                v40 /* !! */  = ht.dn;
                if (true) ** GOTO lbl205
                block93: while (true) {
                    v40 /* !! */  = (long)(ht.bjwv("blxp", bjyc(int ), (int)113) - ht.bjwv("blxo", bjyc(int ), (int)112));
lbl205:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case 195582183: {
                            continue block93;
                        }
                        case 240546907: {
                            break block93;
                        }
                    }
                    break;
                }
                Objects.requireNonNull(v39);
                v41 /* !! */  = ht.dn;
                if (true) ** GOTO lbl216
                block94: while (true) {
                    v41 /* !! */  = (long)(ht.bjwv("blxr", bjyc(int ), (int)115) - ht.bjwv("blxq", bjyc(int ), (int)114));
lbl216:
                    // 2 sources

                    switch ((int)v41 /* !! */ ) {
                        case 117548235: {
                            continue block94;
                        }
                        case 240546907: {
                            break block94;
                        }
                    }
                    break;
                }
                v42 = (ToDoubleFunction<class_742>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, method_5739(net.minecraft.class_1297 ), (Lnet/minecraft/class_742;)D)((class_746)v39);
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_8 = ht.dn - ht.bjwv("blxs", bjyc(int ), (int)116)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == ht.bjwv("blxt", bjwq(int ), (int)315)) break;
                    v43 /* !! */  = (long)ht.bjwv("blxu", bjwq(int ), (int)316);
                }
                v44 = Comparator.comparingDouble(v42);
                v45 /* !! */  = ht.dn;
                if (true) ** GOTO lbl232
                block96: while (true) {
                    v45 /* !! */  = (long)(v46 - ht.bjwv("blxv", bjyc(int ), (int)117));
lbl232:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -174123492: {
                            v46 = ht.bjwv("blxw", bjyc(int ), (int)118);
                            continue block96;
                        }
                        case 240546907: {
                            break block96;
                        }
                        case 868284804: {
                            v46 = ht.bjwv("blxx", bjyc(int ), (int)119);
                            continue block96;
                        }
                    }
                    break;
                }
                v47 = v36.min(v44);
                while (true) {
                    if ((v48 /* !! */  = (cfr_temp_9 = ht.dn - ht.bjwv("blxy", bjyc(int ), (int)120)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v48 /* !! */  == ht.bjwv("blxz", bjwq(int ), (int)317)) break;
                    v48 /* !! */  = (long)ht.bjwv("blya", bjwq(int ), (int)318);
                }
                return v47.orElse(null);
lbl248:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)ht.bjwv("blyb", bjwq(int ), (int)319);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl257
                }
                case 1: {
                    var2_2 /* !! */  = (int)ht.bjwv("blyc", bjwq(int ), (int)320);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl257:
                // 4 sources

                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ht.bjwv("blyd", bjwq(int ), (int)321);
                        if (!var3_1) ** GOTO lbl248
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ht.bjwv("blye", bjwq(int ), (int)322);
        ** while (!var3_1)
lbl265:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void rotateTo(class_243 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmhs", bjyc(int ), (int)196)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ht.bjwv("bmht", bjwq(int ), (int)495)) break;
            v0 /* !! */  = (long)ht.bjwv("bmhu", bjwq(int ), (int)496);
        }
        var4_2 = ht.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmhv", bjyc(int ), (int)197)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ht.bjwv("bmhw", bjwq(int ), (int)497)) break;
            v1 /* !! */  = (long)ht.bjwv("bmhx", bjwq(int ), (int)498);
        }
        var3_3 /* !! */  = ht.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("bmhy", bjyc(int ), (int)198)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ht.bjwv("bmhz", bjwq(int ), (int)499)) break;
            v2 /* !! */  = (long)ht.bjwv("bmia", bjwq(int ), (int)500);
        }
        var2_4 = ht.a;
        if (var4_2) {
            throw null;
lbl21:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        v3 /* !! */  = ht.dn;
        if (true) ** GOTO lbl28
        block27: while (true) {
            v3 /* !! */  = (long)(ht.bjwv("bmic", bjyc(int ), (int)200) - ht.bjwv("bmib", bjyc(int ), (int)199));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -760416224: {
                    continue block27;
                }
                case 240546907: {
                    break block27;
                }
            }
            break;
        }
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("bmid", bjyc(int ), (int)201)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ht.bjwv("bmie", bjwq(int ), (int)501)) break;
            v4 /* !! */  = (long)ht.bjwv("bmif", bjwq(int ), (int)502);
        }
        v5 = ow.calculateAngle(var1_1);
        v6 = ht.bjwv("bmig", bjwq(int ), (int)503);
        v7 /* !! */  = ht.dn;
        if (true) ** GOTO lbl44
        block29: while (true) {
            v7 /* !! */  = (long)(v8 - ht.bjwv("bmih", bjyc(int ), (int)202));
lbl44:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1511427298: {
                    v8 = ht.bjwv("bmii", bjyc(int ), (int)203);
                    continue block29;
                }
                case -866459395: {
                    v8 = ht.bjwv("bmij", bjyc(int ), (int)204);
                    continue block29;
                }
                case 240546907: {
                    break block29;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = ht.dn - ht.bjwv("bmik", bjyc(int ), (int)205)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ht.bjwv("bmil", bjwq(int ), (int)504)) break;
            v9 /* !! */  = (long)ht.bjwv("bmim", bjwq(int ), (int)505);
        }
        v10 /* !! */  = ht.dn;
        if (true) ** GOTO lbl62
        block31: while (true) {
            v10 /* !! */  = (long)(v11 - ht.bjwv("bmin", bjyc(int ), (int)206));
lbl62:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1631506881: {
                    v11 = ht.bjwv("bmio", bjyc(int ), (int)207);
                    continue block31;
                }
                case -711234580: {
                    v11 = ht.bjwv("bmip", bjyc(int ), (int)208);
                    continue block31;
                }
                case 240546907: {
                    break block31;
                }
                case 1845933257: {
                    v11 = ht.bjwv("bmiq", bjyc(int ), (int)209);
                    continue block31;
                }
            }
            break;
        }
        ot.INSTANCE.rotateTo(v5, (int)v6, this.placementRotation, nn.HIGH_IMPORTANCE_2, this);
        if (var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block15 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)ht.bjwv("bmir", bjwq(int ), (int)506);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl97
            }
            case 1: {
                var3_3 /* !! */  = (int)ht.bjwv("bmis", bjwq(int ), (int)507);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
            case 2: {
                var3_3 /* !! */  = (int)ht.bjwv("bmit", bjwq(int ), (int)508);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl97:
            // 2 sources

            case 3: {
                do {
                    var3_3 /* !! */  = (int)ht.bjwv("bmiu", bjwq(int ), (int)509);
                } while (!var4_2);
                throw null;
            }
lbl102:
            // 3 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)ht.bjwv("bmiv", bjwq(int ), (int)510);
                    if (!var4_2) break block15;
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)ht.bjwv("bmiw", bjwq(int ), (int)511);
        ** while (!var4_2)
lbl110:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bmsc() {
        ht.bjwr[300] = -1413082653;
        ht.bjwr[301] = 1738735092;
        ht.bjwr[302] = 833881756;
        ht.bjwr[303] = -1229137636;
        ht.bjwr[304] = 131001772;
        ht.bjwr[305] = -1342556917;
        ht.bjwr[306] = -1588359899;
        ht.bjwr[307] = 90748114;
        ht.bjwr[308] = 1097808962;
        ht.bjwr[309] = 1484787349;
        ht.bjwr[310] = 317569337;
        ht.bjwr[311] = 1007520037;
        ht.bjwr[312] = -1837420437;
        ht.bjwr[313] = 1423000262;
        ht.bjwr[314] = -1512770559;
        ht.bjwr[315] = 404908502;
        ht.bjwr[316] = -1624611316;
        ht.bjwr[317] = 810759275;
        ht.bjwr[318] = 1087245646;
        ht.bjwr[319] = 2132527777;
        ht.bjwr[320] = -204902447;
        ht.bjwr[321] = -797205705;
        ht.bjwr[322] = -643062527;
        ht.bjwr[323] = -825576403;
        ht.bjwr[324] = 770467140;
        ht.bjwr[325] = -1465975142;
        ht.bjwr[326] = -1763762532;
        ht.bjwr[327] = 633233742;
        ht.bjwr[328] = 289430568;
        ht.bjwr[329] = 1949910630;
        ht.bjwr[330] = -519323516;
        ht.bjwr[331] = -1085799278;
        ht.bjwr[332] = 781362009;
        ht.bjwr[333] = 314198736;
        ht.bjwr[334] = 1791559846;
        ht.bjwr[335] = 1101090259;
        ht.bjwr[336] = -1307413824;
        ht.bjwr[337] = 87378724;
        ht.bjwr[338] = -1248277442;
        ht.bjwr[339] = -273233859;
        ht.bjwr[340] = 1794955449;
        ht.bjwr[341] = -848677985;
        ht.bjwr[342] = 1005502862;
        ht.bjwr[343] = -1317766028;
        ht.bjwr[344] = 1609374856;
        ht.bjwr[345] = -1565954108;
        ht.bjwr[346] = 1800449185;
        ht.bjwr[347] = -706019226;
        ht.bjwr[348] = 647122884;
        ht.bjwr[349] = -712125956;
        ht.bjwr[350] = 1796140828;
        ht.bjwr[351] = -421715884;
        ht.bjwr[352] = -9218478;
        ht.bjwr[353] = 763371205;
        ht.bjwr[354] = 485398683;
        ht.bjwr[355] = 391687441;
        ht.bjwr[356] = -763856196;
        ht.bjwr[357] = 724512505;
        ht.bjwr[358] = 660626481;
        ht.bjwr[359] = 745115614;
        ht.bjwr[360] = 232103176;
        ht.bjwr[361] = 1979744365;
        ht.bjwr[362] = 984618795;
        ht.bjwr[363] = 491516779;
        ht.bjwr[364] = -182065348;
        ht.bjwr[365] = 992319097;
        ht.bjwr[366] = -672488273;
        ht.bjwr[367] = -896606280;
        ht.bjwr[368] = -524872735;
        ht.bjwr[369] = 132773492;
        ht.bjwr[370] = -699097470;
        ht.bjwr[371] = 543634931;
        ht.bjwr[372] = 1146044808;
        ht.bjwr[373] = -345595020;
        ht.bjwr[374] = 527280741;
        ht.bjwr[375] = 768362611;
        ht.bjwr[376] = -1289768169;
        ht.bjwr[377] = 188317924;
        ht.bjwr[378] = 1888594039;
        ht.bjwr[379] = -1625814941;
        ht.bjwr[380] = 1244239764;
        ht.bjwr[381] = -1635748790;
        ht.bjwr[382] = -1919776973;
        ht.bjwr[383] = 1741285862;
        ht.bjwr[384] = -551032322;
        ht.bjwr[385] = -248527789;
        ht.bjwr[386] = -1192889133;
        ht.bjwr[387] = -2110152208;
        ht.bjwr[388] = -1213284793;
        ht.bjwr[389] = -1655734650;
        ht.bjwr[390] = 402742753;
        ht.bjwr[391] = 1765089925;
        ht.bjwr[392] = -1503555380;
        ht.bjwr[393] = -1288363706;
        ht.bjwr[394] = 985019998;
        ht.bjwr[395] = -242205666;
        ht.bjwr[396] = -884549813;
        ht.bjwr[397] = 132117869;
        ht.bjwr[398] = 930536616;
        ht.bjwr[399] = 1681532441;
    }

    static {
        bjwr = new int[642];
        bjwt = new int[642];
        ht.bmrz();
        ht.bmsa();
        ht.bmsb();
        ht.bmsc();
        ht.bmsd();
        ht.bmse();
        ht.bmsf();
        ht.bmsg();
        ht.bmsh();
        ht.bmsi();
        ht.bmsj();
        ht.bmsk();
        ht.bmsl();
        ht.bmsm();
        bjye = new long[316];
        bjyg = new long[316];
        ht.bmsn();
        ht.bmso();
        ht.bmsp();
        ht.bmsq();
        ht.bmsr();
        ht.bmss();
        ht.bmst();
        ht.bmsu();
    }

    private static /* synthetic */ void bmsa() {
        ht.bjwr[100] = -1835878761;
        ht.bjwr[101] = 412466915;
        ht.bjwr[102] = -1199790369;
        ht.bjwr[103] = 156140699;
        ht.bjwr[104] = -134059069;
        ht.bjwr[105] = -511558500;
        ht.bjwr[106] = -1733188553;
        ht.bjwr[107] = 1804954128;
        ht.bjwr[108] = 613887068;
        ht.bjwr[109] = 1774302864;
        ht.bjwr[110] = -1558114142;
        ht.bjwr[111] = -1877107895;
        ht.bjwr[112] = -548478526;
        ht.bjwr[113] = -2022004150;
        ht.bjwr[114] = -1111787990;
        ht.bjwr[115] = -1108703076;
        ht.bjwr[116] = 1760435360;
        ht.bjwr[117] = 1038613797;
        ht.bjwr[118] = 1985981465;
        ht.bjwr[119] = -922515152;
        ht.bjwr[120] = -1985125005;
        ht.bjwr[121] = 926503875;
        ht.bjwr[122] = -1682919093;
        ht.bjwr[123] = 1952639009;
        ht.bjwr[124] = 1593847588;
        ht.bjwr[125] = -2086478340;
        ht.bjwr[126] = -1735293100;
        ht.bjwr[127] = -1494868110;
        ht.bjwr[128] = 862582571;
        ht.bjwr[129] = 1203214856;
        ht.bjwr[130] = -178274536;
        ht.bjwr[131] = -964958622;
        ht.bjwr[132] = -2089512201;
        ht.bjwr[133] = 1549096507;
        ht.bjwr[134] = -1369657645;
        ht.bjwr[135] = 1903359180;
        ht.bjwr[136] = -740642353;
        ht.bjwr[137] = 689565772;
        ht.bjwr[138] = -2126478818;
        ht.bjwr[139] = -1365859894;
        ht.bjwr[140] = 706152062;
        ht.bjwr[141] = 466459296;
        ht.bjwr[142] = -1678665557;
        ht.bjwr[143] = -1477132507;
        ht.bjwr[144] = -172394285;
        ht.bjwr[145] = -207214299;
        ht.bjwr[146] = -1760695763;
        ht.bjwr[147] = -604350257;
        ht.bjwr[148] = -425105089;
        ht.bjwr[149] = -754734437;
        ht.bjwr[150] = -1214554367;
        ht.bjwr[151] = 189479441;
        ht.bjwr[152] = 110425632;
        ht.bjwr[153] = 1569116709;
        ht.bjwr[154] = -1626384757;
        ht.bjwr[155] = -778937522;
        ht.bjwr[156] = -1162172531;
        ht.bjwr[157] = -2023361164;
        ht.bjwr[158] = -684930347;
        ht.bjwr[159] = -87580329;
        ht.bjwr[160] = 183691796;
        ht.bjwr[161] = -1645370957;
        ht.bjwr[162] = -1153710027;
        ht.bjwr[163] = 390695733;
        ht.bjwr[164] = -409129160;
        ht.bjwr[165] = 879103735;
        ht.bjwr[166] = -921424669;
        ht.bjwr[167] = 1173338365;
        ht.bjwr[168] = -33699760;
        ht.bjwr[169] = 1147597296;
        ht.bjwr[170] = 1033954133;
        ht.bjwr[171] = 2116381631;
        ht.bjwr[172] = 1842793935;
        ht.bjwr[173] = -113806475;
        ht.bjwr[174] = 1495272077;
        ht.bjwr[175] = 325674076;
        ht.bjwr[176] = 1691854750;
        ht.bjwr[177] = 1399869006;
        ht.bjwr[178] = -1028144067;
        ht.bjwr[179] = -1719483596;
        ht.bjwr[180] = 438569645;
        ht.bjwr[181] = 1626496098;
        ht.bjwr[182] = 943625911;
        ht.bjwr[183] = -2087661486;
        ht.bjwr[184] = -957579299;
        ht.bjwr[185] = -39579676;
        ht.bjwr[186] = 831627015;
        ht.bjwr[187] = -1172976864;
        ht.bjwr[188] = 1176488268;
        ht.bjwr[189] = -2020825771;
        ht.bjwr[190] = -37618526;
        ht.bjwr[191] = 1132145483;
        ht.bjwr[192] = -841107498;
        ht.bjwr[193] = -1609751288;
        ht.bjwr[194] = -1872605264;
        ht.bjwr[195] = -1760905004;
        ht.bjwr[196] = -251704114;
        ht.bjwr[197] = 568504444;
        ht.bjwr[198] = 816617911;
        ht.bjwr[199] = -224473429;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isWithinReach(class_243 var1_1) {
        v0 /* !! */  = ht.dn;
        if (true) ** GOTO lbl5
        block44: while (true) {
            v0 /* !! */  = (long)(v1 - ht.bjwv("bmdq", bjyc(int ), (int)171));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1500548023: {
                    v1 = ht.bjwv("bmdr", bjyc(int ), (int)172);
                    continue block44;
                }
                case -23394308: {
                    v1 = ht.bjwv("bmds", bjyc(int ), (int)173);
                    continue block44;
                }
                case 240546907: {
                    break block44;
                }
                case 1896376152: {
                    v1 = ht.bjwv("bmdt", bjyc(int ), (int)174);
                    continue block44;
                }
            }
            break;
        }
        var6_2 = ht.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmdu", bjyc(int ), (int)175)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ht.bjwv("bmdv", bjwq(int ), (int)414)) break;
            v2 /* !! */  = (long)ht.bjwv("bmdw", bjwq(int ), (int)415);
        }
        var5_3 /* !! */  = ht.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmdx", bjyc(int ), (int)176)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ht.bjwv("bmdy", bjwq(int ), (int)416)) break;
            v3 /* !! */  = (long)ht.bjwv("bmdz", bjwq(int ), (int)417);
        }
        var4_4 = ht.a;
        if (var6_2) {
            throw null;
lbl34:
            // 5 sources

            return (boolean)ht.bjwv("bmea", bjwq(int ), (int)418);
        }
        if (var4_4) ** GOTO lbl34
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("bmeb", bjyc(int ), (int)177)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ht.bjwv("bmec", bjwq(int ), (int)419)) break;
                    v4 /* !! */  = (long)ht.bjwv("bmed", bjwq(int ), (int)420);
                }
                v5 /* !! */  = ht.dn;
                if (true) ** GOTO lbl51
                block49: while (true) {
                    v5 /* !! */  = (long)(v6 - ht.bjwv("bmee", bjyc(int ), (int)178));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1638444804: {
                            v6 = ht.bjwv("bmef", bjyc(int ), (int)179);
                            continue block49;
                        }
                        case -583064494: {
                            v6 = ht.bjwv("bmeg", bjyc(int ), (int)180);
                            continue block49;
                        }
                        case 240546907: {
                            break block49;
                        }
                        case 2103419448: {
                            v6 = ht.bjwv("bmeh", bjyc(int ), (int)181);
                            continue block49;
                        }
                    }
                    break;
                }
                v7 = ht.mc.field_1724;
                v8 /* !! */  = ht.dn;
                if (true) ** GOTO lbl68
                block50: while (true) {
                    v8 /* !! */  = (long)(v9 - ht.bjwv("bmei", bjyc(int ), (int)182));
lbl68:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case 240546907: {
                            break block50;
                        }
                        case 398057629: {
                            v9 = ht.bjwv("bmej", bjyc(int ), (int)183);
                            continue block50;
                        }
                        case 1711421579: {
                            v9 = ht.bjwv("bmek", bjyc(int ), (int)184);
                            continue block50;
                        }
                    }
                    break;
                }
                var2_5 = v7.method_55754();
                if (var4_4 || var4_4) ** GOTO lbl34
                v10 /* !! */  = ht.dn;
                if (true) ** GOTO lbl83
                block51: while (true) {
                    v10 /* !! */  = (long)(ht.bjwv("bmem", bjyc(int ), (int)186) - ht.bjwv("bmel", bjyc(int ), (int)185));
lbl83:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -497447728: {
                            continue block51;
                        }
                        case 240546907: {
                            break block51;
                        }
                    }
                    break;
                }
                v11 /* !! */  = ht.dn;
                if (true) ** GOTO lbl92
                block52: while (true) {
                    v11 /* !! */  = (long)(v12 - ht.bjwv("bmen", bjyc(int ), (int)187));
lbl92:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1226190518: {
                            v12 = ht.bjwv("bmeo", bjyc(int ), (int)188);
                            continue block52;
                        }
                        case 240546907: {
                            break block52;
                        }
                        case 592189332: {
                            v12 = ht.bjwv("bmep", bjyc(int ), (int)189);
                            continue block52;
                        }
                    }
                    break;
                }
                v13 = ht.mc.field_1724;
                v14 /* !! */  = ht.dn;
                if (true) ** GOTO lbl106
                block53: while (true) {
                    v14 /* !! */  = (long)(v15 - ht.bjwv("bmeq", bjyc(int ), (int)190));
lbl106:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 13054983: {
                            v15 = ht.bjwv("bmer", bjyc(int ), (int)191);
                            continue block53;
                        }
                        case 84439811: {
                            v15 = ht.bjwv("bmes", bjyc(int ), (int)192);
                            continue block53;
                        }
                        case 240546907: {
                            break block53;
                        }
                        case 1113917192: {
                            v15 = ht.bjwv("bmet", bjyc(int ), (int)193);
                            continue block53;
                        }
                    }
                    break;
                }
                v16 = v13.method_33571();
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("bmeu", bjyc(int ), (int)194)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v17 /* !! */  == ht.bjwv("bmev", bjwq(int ), (int)421)) break;
                    v17 /* !! */  = (long)ht.bjwv("bmew", bjwq(int ), (int)422);
                }
                if (!(v16.method_1025(var1_1) <= var2_5 * var2_5)) ** GOTO lbl131
                if (var4_4) ** GOTO lbl34
                v18 = ht.bjwv("bmex", bjwq(int ), (int)423);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl134
lbl131:
                // 1 sources

                if (!var4_4 && !var4_4) ** break;
                ** continue;
                v18 = ht.bjwv("bmey", bjwq(int ), (int)424);
lbl134:
                // 2 sources

                return (boolean)v18;
            }
            case 0: {
                var5_3 /* !! */  = (int)ht.bjwv("bmez", bjwq(int ), (int)425);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl140:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)ht.bjwv("bmfa", bjwq(int ), (int)426);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl160
            }
lbl145:
            // 2 sources

            case 2: {
                do {
                    var5_3 /* !! */  = (int)ht.bjwv("bmfb", bjwq(int ), (int)427);
                } while (!var6_2);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var5_3 /* !! */  = (int)ht.bjwv("bmfc", bjwq(int ), (int)428);
                    if (!var6_2) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 4: {
                var5_3 /* !! */  = (int)ht.bjwv("bmfd", bjwq(int ), (int)429);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl160:
            // 4 sources

            case 5: {
                var5_3 /* !! */  = (int)ht.bjwv("bmfe", bjwq(int ), (int)430);
                if (!var6_2) ** GOTO lbl145
                throw null;
            }
            case 6: {
                var5_3 /* !! */  = (int)ht.bjwv("bmff", bjwq(int ), (int)431);
                if (!var6_2) ** GOTO lbl160
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)ht.bjwv("bmfg", bjwq(int ), (int)432);
                if (!var6_2) break;
                throw null;
            }
lbl172:
            // 2 sources

            case 8: {
                var5_3 /* !! */  = (int)ht.bjwv("bmfh", bjwq(int ), (int)433);
                if (!var6_2) ** GOTO lbl140
                throw null;
            }
            case 9: 
        }
        var5_3 /* !! */  = (int)ht.bjwv("bmfi", bjwq(int ), (int)434);
        ** while (!var6_2)
lbl179:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Set<class_2338> collectFootprint(class_1657 var1_1) {
        var13_2 = ht.c;
        var12_3 /* !! */  = ht.b;
        var11_4 = ht.a;
        if (var13_2) {
            throw null;
lbl6:
            // 19 sources

            return null;
        }
        if (var11_4 || var11_4) ** GOTO lbl6
        var2_5 = var1_1.method_5829();
        if (var11_4 || var11_4) ** GOTO lbl6
        var3_6 = class_3532.method_15357((double)(var2_5.field_1323 + ht.bjwv("blpn", blpm(int ), (int)25)));
        if (var11_4 || var11_4) ** GOTO lbl6
        var4_7 = class_3532.method_15357((double)(var2_5.field_1320 - ht.bjwv("blpo", blpm(int ), (int)26)));
        if (var11_4 || var11_4) ** GOTO lbl6
        var5_8 = class_3532.method_15357((double)(var2_5.field_1321 + ht.bjwv("blpp", blpm(int ), (int)27)));
        if (var11_4 || var11_4) ** GOTO lbl6
        var6_9 = class_3532.method_15357((double)(var2_5.field_1324 - ht.bjwv("blpq", blpm(int ), (int)28)));
        if (var11_4 || var11_4) ** GOTO lbl6
        var7_10 = class_3532.method_15357((double)(var2_5.field_1322 + ht.bjwv("blpr", blpm(int ), (int)29)));
        if (var11_4 || var11_4) ** GOTO lbl6
        var8_11 = new LinkedHashSet<class_2338>();
        if (var11_4 || var11_4) ** GOTO lbl6
        var9_12 = var3_6;
        if (var11_4) ** GOTO lbl6
        block40: while (true) {
            if (var11_4 || var11_4) ** GOTO lbl6
            if (var9_12 > var4_7) ** GOTO lbl50
            if (var11_4 || var11_4) ** GOTO lbl6
            var10_13 = var5_8;
            if (var11_4) ** GOTO lbl6
            block41: while (true) {
                if (var11_4 || var11_4) ** GOTO lbl6
                if (var10_13 > var6_9) ** GOTO lbl45
                if (var11_4 || var11_4) ** GOTO lbl6
                if (var12_3 /* !! */  == 0) ** GOTO lbl-1000
                switch (var12_3 /* !! */ ) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        var8_11.add(new class_2338(var9_12, var7_10, var10_13));
                        if (var11_4 || var11_4) ** GOTO lbl6
                        ++var10_13;
                        if (var11_4) ** GOTO lbl6
                        if (!var13_2) continue block41;
                        throw null;
                    }
lbl45:
                    // 1 sources

                    if (var11_4 || var11_4) ** GOTO lbl6
                    ++var9_12;
                    if (var11_4) ** GOTO lbl6
                    if (!var13_2) continue block40;
                    throw null;
lbl50:
                    // 1 sources

                    if (!var11_4 && !var11_4) ** break;
                    ** continue;
                    return var8_11;
lbl53:
                    // 2 sources

                    case 0: {
                        var12_3 /* !! */  = (int)ht.bjwv("blps", bjwq(int ), (int)193);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl106
                    }
lbl58:
                    // 4 sources

                    case 1: {
                        var12_3 /* !! */  = (int)ht.bjwv("blpt", bjwq(int ), (int)194);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl106
                    }
lbl63:
                    // 2 sources

                    case 2: {
                        var12_3 /* !! */  = (int)ht.bjwv("blpu", bjwq(int ), (int)195);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl119
                    }
                    case 3: {
                        var12_3 /* !! */  = (int)ht.bjwv("blpv", bjwq(int ), (int)196);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl93
                    }
lbl73:
                    // 2 sources

                    case 4: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var12_3 /* !! */  = (int)ht.bjwv("blpw", bjwq(int ), (int)197);
                            if (var13_2) {
                                throw null;
                            }
                            ** GOTO lbl163
                            break;
                        }
                    }
lbl79:
                    // 2 sources

                    case 5: {
                        var12_3 /* !! */  = (int)ht.bjwv("blpx", bjwq(int ), (int)198);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl197
                    }
                    case 6: {
                        var12_3 /* !! */  = (int)ht.bjwv("blpy", bjwq(int ), (int)199);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl131
                    }
lbl89:
                    // 3 sources

                    case 7: {
                        var12_3 /* !! */  = (int)ht.bjwv("blpz", bjwq(int ), (int)200);
                        if (!var13_2) ** GOTO lbl73
                        throw null;
                    }
lbl93:
                    // 2 sources

                    case 8: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqa", bjwq(int ), (int)201);
                        if (!var13_2) ** GOTO lbl79
                        throw null;
                    }
                    case 9: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqb", bjwq(int ), (int)202);
                        if (!var13_2) ** GOTO lbl58
                        throw null;
                    }
lbl101:
                    // 2 sources

                    case 10: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqc", bjwq(int ), (int)203);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl167
                    }
lbl106:
                    // 3 sources

                    case 11: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqd", bjwq(int ), (int)204);
                        if (!var13_2) break block40;
                        throw null;
                    }
                    case 12: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqe", bjwq(int ), (int)205);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl131
                    }
lbl115:
                    // 5 sources

                    case 13: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqf", bjwq(int ), (int)206);
                        if (!var13_2) ** GOTO lbl63
                        throw null;
                    }
lbl119:
                    // 3 sources

                    case 14: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqg", bjwq(int ), (int)207);
                        if (!var13_2) ** GOTO lbl89
                        throw null;
                    }
lbl123:
                    // 2 sources

                    case 15: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqh", bjwq(int ), (int)208);
                        if (!var13_2) ** GOTO lbl115
                        throw null;
                    }
lbl127:
                    // 2 sources

                    case 16: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqi", bjwq(int ), (int)209);
                        if (!var13_2) ** GOTO lbl115
                        throw null;
                    }
lbl131:
                    // 3 sources

                    case 17: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqj", bjwq(int ), (int)210);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl155
                    }
                    case 18: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqk", bjwq(int ), (int)211);
                        if (!var13_2) ** GOTO lbl119
                        throw null;
                    }
lbl140:
                    // 2 sources

                    case 19: {
                        var12_3 /* !! */  = (int)ht.bjwv("blql", bjwq(int ), (int)212);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl167
                    }
                    case 20: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqm", bjwq(int ), (int)213);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl201
                    }
                    case 21: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqn", bjwq(int ), (int)214);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl193
                    }
lbl155:
                    // 2 sources

                    case 22: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqo", bjwq(int ), (int)215);
                        if (!var13_2) ** GOTO lbl123
                        throw null;
                    }
                    case 23: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqp", bjwq(int ), (int)216);
                        if (!var13_2) ** GOTO lbl58
                        throw null;
                    }
lbl163:
                    // 2 sources

                    case 24: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqq", bjwq(int ), (int)217);
                        if (!var13_2) ** GOTO lbl140
                        throw null;
                    }
lbl167:
                    // 3 sources

                    case 25: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqr", bjwq(int ), (int)218);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl205
                    }
                    case 26: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqs", bjwq(int ), (int)219);
                        if (!var13_2) ** GOTO lbl115
                        throw null;
                    }
                    case 27: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqt", bjwq(int ), (int)220);
                        if (!var13_2) ** GOTO lbl89
                        throw null;
                    }
                    case 28: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqu", bjwq(int ), (int)221);
                        if (!var13_2) ** GOTO lbl53
                        throw null;
                    }
                    case 29: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqv", bjwq(int ), (int)222);
                        if (var13_2) {
                            throw null;
                        }
                        ** GOTO lbl193
                    }
                    case 30: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqw", bjwq(int ), (int)223);
                        if (!var13_2) break block40;
                        throw null;
                    }
lbl193:
                    // 3 sources

                    case 31: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqx", bjwq(int ), (int)224);
                        if (!var13_2) ** GOTO lbl115
                        throw null;
                    }
lbl197:
                    // 2 sources

                    case 32: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqy", bjwq(int ), (int)225);
                        if (!var13_2) ** GOTO lbl58
                        throw null;
                    }
lbl201:
                    // 2 sources

                    case 33: {
                        var12_3 /* !! */  = (int)ht.bjwv("blqz", bjwq(int ), (int)226);
                        if (!var13_2) ** GOTO lbl127
                        throw null;
                    }
lbl205:
                    // 3 sources

                    case 34: {
                        var12_3 /* !! */  = (int)ht.bjwv("blra", bjwq(int ), (int)227);
                        if (!var13_2) ** GOTO lbl101
                        throw null;
                    }
                    case 35: {
                        var12_3 /* !! */  = (int)ht.bjwv("blrb", bjwq(int ), (int)228);
                        if (!var13_2) ** GOTO lbl205
                        throw null;
                    }
                    case 36: 
                }
                break;
            }
            break;
        }
        var12_3 /* !! */  = (int)ht.bjwv("blrc", bjwq(int ), (int)229);
        ** while (!var13_2)
lbl216:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bmsd() {
        ht.bjwr[400] = -934997020;
        ht.bjwr[401] = 1135935519;
        ht.bjwr[402] = -1620335053;
        ht.bjwr[403] = -1465926227;
        ht.bjwr[404] = -1676275249;
        ht.bjwr[405] = -1175338320;
        ht.bjwr[406] = 904656542;
        ht.bjwr[407] = 552012567;
        ht.bjwr[408] = -1121367072;
        ht.bjwr[409] = 1905466123;
        ht.bjwr[410] = -1640597511;
        ht.bjwr[411] = 1398682458;
        ht.bjwr[412] = 306223695;
        ht.bjwr[413] = 1606165258;
        ht.bjwr[414] = -397970961;
        ht.bjwr[415] = -1479363333;
        ht.bjwr[416] = -1889588941;
        ht.bjwr[417] = 24176918;
        ht.bjwr[418] = 843420984;
        ht.bjwr[419] = -321330839;
        ht.bjwr[420] = 1198736856;
        ht.bjwr[421] = 1696798997;
        ht.bjwr[422] = -112563549;
        ht.bjwr[423] = 1030615963;
        ht.bjwr[424] = 1456489194;
        ht.bjwr[425] = 1170223835;
        ht.bjwr[426] = -1346199527;
        ht.bjwr[427] = -645177013;
        ht.bjwr[428] = 189009670;
        ht.bjwr[429] = 442718066;
        ht.bjwr[430] = -724030172;
        ht.bjwr[431] = -2031787407;
        ht.bjwr[432] = -499680264;
        ht.bjwr[433] = -857630283;
        ht.bjwr[434] = -1983023694;
        ht.bjwr[435] = 2028405282;
        ht.bjwr[436] = 1889276027;
        ht.bjwr[437] = 49870033;
        ht.bjwr[438] = -1766542020;
        ht.bjwr[439] = -102875341;
        ht.bjwr[440] = 246560073;
        ht.bjwr[441] = -63071036;
        ht.bjwr[442] = -1549667829;
        ht.bjwr[443] = 1822380806;
        ht.bjwr[444] = 1143367610;
        ht.bjwr[445] = 1641967794;
        ht.bjwr[446] = -715033869;
        ht.bjwr[447] = 1221336088;
        ht.bjwr[448] = 1701746976;
        ht.bjwr[449] = -1216960350;
        ht.bjwr[450] = -705904470;
        ht.bjwr[451] = -490429658;
        ht.bjwr[452] = 672331264;
        ht.bjwr[453] = -1216260803;
        ht.bjwr[454] = -1656920666;
        ht.bjwr[455] = -234520297;
        ht.bjwr[456] = 631493234;
        ht.bjwr[457] = -1687206736;
        ht.bjwr[458] = -18386640;
        ht.bjwr[459] = 1385750042;
        ht.bjwr[460] = 1623025822;
        ht.bjwr[461] = -294954218;
        ht.bjwr[462] = -778034952;
        ht.bjwr[463] = 1351273154;
        ht.bjwr[464] = 492528241;
        ht.bjwr[465] = -1256570997;
        ht.bjwr[466] = 407224794;
        ht.bjwr[467] = -137200668;
        ht.bjwr[468] = -613853026;
        ht.bjwr[469] = 302810476;
        ht.bjwr[470] = -809819854;
        ht.bjwr[471] = 1513498459;
        ht.bjwr[472] = 664585820;
        ht.bjwr[473] = 812167347;
        ht.bjwr[474] = 926554977;
        ht.bjwr[475] = 684166375;
        ht.bjwr[476] = -965206647;
        ht.bjwr[477] = -2033925844;
        ht.bjwr[478] = -421125329;
        ht.bjwr[479] = 737372426;
        ht.bjwr[480] = -283250185;
        ht.bjwr[481] = -1182982189;
        ht.bjwr[482] = 1000394720;
        ht.bjwr[483] = 1677613021;
        ht.bjwr[484] = -1969852198;
        ht.bjwr[485] = -263120999;
        ht.bjwr[486] = 1152371170;
        ht.bjwr[487] = 7204154;
        ht.bjwr[488] = -677865459;
        ht.bjwr[489] = 619396688;
        ht.bjwr[490] = -924538734;
        ht.bjwr[491] = -8059715;
        ht.bjwr[492] = 1040965390;
        ht.bjwr[493] = 964586790;
        ht.bjwr[494] = 1257018597;
        ht.bjwr[495] = 570019833;
        ht.bjwr[496] = 932427792;
        ht.bjwr[497] = 364654171;
        ht.bjwr[498] = -2128554589;
        ht.bjwr[499] = 1199611345;
    }

    private static /* synthetic */ void bmrz() {
        ht.bjwr[0] = -1997715535;
        ht.bjwr[1] = 1356838042;
        ht.bjwr[2] = -113806981;
        ht.bjwr[3] = -232149379;
        ht.bjwr[4] = 1498627585;
        ht.bjwr[5] = 405517548;
        ht.bjwr[6] = -938636354;
        ht.bjwr[7] = 1677237767;
        ht.bjwr[8] = 1992816546;
        ht.bjwr[9] = -328064426;
        ht.bjwr[10] = -1604533831;
        ht.bjwr[11] = -666378699;
        ht.bjwr[12] = -806648383;
        ht.bjwr[13] = 875256161;
        ht.bjwr[14] = -900020493;
        ht.bjwr[15] = -971155791;
        ht.bjwr[16] = -966504269;
        ht.bjwr[17] = -2019637134;
        ht.bjwr[18] = 302123077;
        ht.bjwr[19] = -1375607537;
        ht.bjwr[20] = 636586369;
        ht.bjwr[21] = 1989163567;
        ht.bjwr[22] = 546841194;
        ht.bjwr[23] = -1930842780;
        ht.bjwr[24] = -1034976346;
        ht.bjwr[25] = -1698400986;
        ht.bjwr[26] = -1170901987;
        ht.bjwr[27] = -1483394575;
        ht.bjwr[28] = -1054507919;
        ht.bjwr[29] = 1568549307;
        ht.bjwr[30] = -121084115;
        ht.bjwr[31] = 373711384;
        ht.bjwr[32] = -505715458;
        ht.bjwr[33] = -1207328048;
        ht.bjwr[34] = -1447995449;
        ht.bjwr[35] = -1019885624;
        ht.bjwr[36] = 1368027791;
        ht.bjwr[37] = 244116024;
        ht.bjwr[38] = -1286383953;
        ht.bjwr[39] = -1519738633;
        ht.bjwr[40] = -1852940966;
        ht.bjwr[41] = -1102953566;
        ht.bjwr[42] = -79346045;
        ht.bjwr[43] = -1081478790;
        ht.bjwr[44] = -1987333344;
        ht.bjwr[45] = 2119876412;
        ht.bjwr[46] = -1047239036;
        ht.bjwr[47] = -122800653;
        ht.bjwr[48] = -2080263076;
        ht.bjwr[49] = -861478680;
        ht.bjwr[50] = -1239638427;
        ht.bjwr[51] = 324473447;
        ht.bjwr[52] = -1520312345;
        ht.bjwr[53] = -1026023897;
        ht.bjwr[54] = -1635694419;
        ht.bjwr[55] = 1984827856;
        ht.bjwr[56] = -1423568166;
        ht.bjwr[57] = 1363677631;
        ht.bjwr[58] = 1257683827;
        ht.bjwr[59] = 836627956;
        ht.bjwr[60] = 1967195170;
        ht.bjwr[61] = 1224794750;
        ht.bjwr[62] = 163614022;
        ht.bjwr[63] = 718456927;
        ht.bjwr[64] = 1328132819;
        ht.bjwr[65] = 377349255;
        ht.bjwr[66] = 917065615;
        ht.bjwr[67] = 188478097;
        ht.bjwr[68] = -1464362949;
        ht.bjwr[69] = 8893735;
        ht.bjwr[70] = -959467700;
        ht.bjwr[71] = 223227770;
        ht.bjwr[72] = 1544467545;
        ht.bjwr[73] = 2063554267;
        ht.bjwr[74] = -965725753;
        ht.bjwr[75] = 1632603046;
        ht.bjwr[76] = 1245169531;
        ht.bjwr[77] = 1218450124;
        ht.bjwr[78] = 353501008;
        ht.bjwr[79] = -1302055091;
        ht.bjwr[80] = 619858941;
        ht.bjwr[81] = 1761091885;
        ht.bjwr[82] = 1743811231;
        ht.bjwr[83] = -1448738709;
        ht.bjwr[84] = -1626142923;
        ht.bjwr[85] = 357850839;
        ht.bjwr[86] = -773693965;
        ht.bjwr[87] = -1452911793;
        ht.bjwr[88] = -23379562;
        ht.bjwr[89] = -933522695;
        ht.bjwr[90] = 245054735;
        ht.bjwr[91] = -569055751;
        ht.bjwr[92] = -1981678209;
        ht.bjwr[93] = -1394997138;
        ht.bjwr[94] = 1412548007;
        ht.bjwr[95] = 490959247;
        ht.bjwr[96] = 1961475663;
        ht.bjwr[97] = 285638644;
        ht.bjwr[98] = -325416310;
        ht.bjwr[99] = 1877024289;
    }

    private static /* synthetic */ void bmss() {
        ht.bjyg[100] = 8109091550906649129L;
        ht.bjyg[101] = -470455844870251706L;
        ht.bjyg[102] = 4047398408109183264L;
        ht.bjyg[103] = 5558864165102450183L;
        ht.bjyg[104] = 1347011402403502514L;
        ht.bjyg[105] = 3934903881844882992L;
        ht.bjyg[106] = -2601408157231675679L;
        ht.bjyg[107] = 4571703985603734910L;
        ht.bjyg[108] = -2471285107368004499L;
        ht.bjyg[109] = -2275954212002005182L;
        ht.bjyg[110] = -6674801926558129871L;
        ht.bjyg[111] = 6461226845904393187L;
        ht.bjyg[112] = 9059615147005374218L;
        ht.bjyg[113] = 1824604959371475129L;
        ht.bjyg[114] = 9094687077557876184L;
        ht.bjyg[115] = 5938916960711160031L;
        ht.bjyg[116] = -5203737554213959756L;
        ht.bjyg[117] = 7864956603572873259L;
        ht.bjyg[118] = -6137187253174636921L;
        ht.bjyg[119] = 765263906236387876L;
        ht.bjyg[120] = 8193002929777386917L;
        ht.bjyg[121] = -4226820632163228629L;
        ht.bjyg[122] = 4541873272727122639L;
        ht.bjyg[123] = 515210217627078452L;
        ht.bjyg[124] = -5789945099011339998L;
        ht.bjyg[125] = -310291275981203083L;
        ht.bjyg[126] = -3158123051436267600L;
        ht.bjyg[127] = -1790757194432181224L;
        ht.bjyg[128] = 4486327886404584977L;
        ht.bjyg[129] = -224737828941400532L;
        ht.bjyg[130] = 1167579514346874496L;
        ht.bjyg[131] = -3624937388626363394L;
        ht.bjyg[132] = -6289483570005918514L;
        ht.bjyg[133] = 7891598635043826279L;
        ht.bjyg[134] = -4984787737473042861L;
        ht.bjyg[135] = -5989124205635174336L;
        ht.bjyg[136] = -3905383038612418479L;
        ht.bjyg[137] = 2395532085804564167L;
        ht.bjyg[138] = 1528883221326676604L;
        ht.bjyg[139] = 1302702035059442118L;
        ht.bjyg[140] = 5514554468694265275L;
        ht.bjyg[141] = 2036786596610831860L;
        ht.bjyg[142] = 3767907625627603354L;
        ht.bjyg[143] = 8978933498913747833L;
        ht.bjyg[144] = -7460116050471578071L;
        ht.bjyg[145] = -1188308056604439574L;
        ht.bjyg[146] = 1217952851087131221L;
        ht.bjyg[147] = -5267957814995713551L;
        ht.bjyg[148] = 2104811754149708582L;
        ht.bjyg[149] = -8918789135542225583L;
        ht.bjyg[150] = 2615587290248376407L;
        ht.bjyg[151] = 8284608122634327132L;
        ht.bjyg[152] = -8456563418263178855L;
        ht.bjyg[153] = 123923770479893501L;
        ht.bjyg[154] = -5868553763179038497L;
        ht.bjyg[155] = -7799391069063257946L;
        ht.bjyg[156] = 1169084636902779343L;
        ht.bjyg[157] = -8204463457598050149L;
        ht.bjyg[158] = -6244387966917580545L;
        ht.bjyg[159] = -3530502615259048456L;
        ht.bjyg[160] = 4943958112674309939L;
        ht.bjyg[161] = 7822534967727066838L;
        ht.bjyg[162] = 154337183913665718L;
        ht.bjyg[163] = 8984696412610421232L;
        ht.bjyg[164] = -333834175953688562L;
        ht.bjyg[165] = -8845876714178724360L;
        ht.bjyg[166] = -1791647551914359301L;
        ht.bjyg[167] = -7441892756311955632L;
        ht.bjyg[168] = 5098403645264960094L;
        ht.bjyg[169] = 5098675387527846847L;
        ht.bjyg[170] = 2696167499182057353L;
        ht.bjyg[171] = 7529910787894579454L;
        ht.bjyg[172] = 2916104917546538128L;
        ht.bjyg[173] = -6032900968281157240L;
        ht.bjyg[174] = -1867358854372887100L;
        ht.bjyg[175] = 7449380415074564012L;
        ht.bjyg[176] = -3948068463414748244L;
        ht.bjyg[177] = 1078134900779843532L;
        ht.bjyg[178] = 2155605892178539423L;
        ht.bjyg[179] = -5592511699441475280L;
        ht.bjyg[180] = -3090146747019464928L;
        ht.bjyg[181] = -8590233329362172700L;
        ht.bjyg[182] = 8973581331439145228L;
        ht.bjyg[183] = -4561955063933530810L;
        ht.bjyg[184] = -5254065690869444907L;
        ht.bjyg[185] = 6328352851314677840L;
        ht.bjyg[186] = -3892364688393985355L;
        ht.bjyg[187] = -2017582426272901372L;
        ht.bjyg[188] = -6961734561779382523L;
        ht.bjyg[189] = 1238816857641560805L;
        ht.bjyg[190] = 278995513515479758L;
        ht.bjyg[191] = -5553264762469161304L;
        ht.bjyg[192] = -3861930193795920992L;
        ht.bjyg[193] = 6496096128956196395L;
        ht.bjyg[194] = 1702204112547348642L;
        ht.bjyg[195] = -4772123437966130460L;
        ht.bjyg[196] = -8942303770737489945L;
        ht.bjyg[197] = -6493528787159479441L;
        ht.bjyg[198] = 6639337048694412573L;
        ht.bjyg[199] = -5426404574229839514L;
    }

    private static /* synthetic */ void bmsl() {
        ht.bjwt[500] = 385075661;
        ht.bjwt[501] = 1758983563;
        ht.bjwt[502] = -967811649;
        ht.bjwt[503] = 1094389071;
        ht.bjwt[504] = -1082924132;
        ht.bjwt[505] = 1623715931;
        ht.bjwt[506] = -410880110;
        ht.bjwt[507] = -1320987836;
        ht.bjwt[508] = 310135775;
        ht.bjwt[509] = -969798954;
        ht.bjwt[510] = 1421167653;
        ht.bjwt[511] = -2010033610;
        ht.bjwt[512] = -951900638;
        ht.bjwt[513] = 248040340;
        ht.bjwt[514] = -732786528;
        ht.bjwt[515] = -960955180;
        ht.bjwt[516] = -601530989;
        ht.bjwt[517] = 1963957171;
        ht.bjwt[518] = -2000491448;
        ht.bjwt[519] = 1508344853;
        ht.bjwt[520] = -614283988;
        ht.bjwt[521] = 1113124403;
        ht.bjwt[522] = 272621946;
        ht.bjwt[523] = -391758895;
        ht.bjwt[524] = 993856514;
        ht.bjwt[525] = -71481467;
        ht.bjwt[526] = -1925463849;
        ht.bjwt[527] = 533459929;
        ht.bjwt[528] = -11447237;
        ht.bjwt[529] = 2141753787;
        ht.bjwt[530] = 1265634536;
        ht.bjwt[531] = 2086664094;
        ht.bjwt[532] = -405412214;
        ht.bjwt[533] = 796959189;
        ht.bjwt[534] = -1828777806;
        ht.bjwt[535] = 44707506;
        ht.bjwt[536] = 987581368;
        ht.bjwt[537] = -935155341;
        ht.bjwt[538] = -1897527577;
        ht.bjwt[539] = 1955536233;
        ht.bjwt[540] = -326771015;
        ht.bjwt[541] = 1848377219;
        ht.bjwt[542] = -1779891439;
        ht.bjwt[543] = 903033122;
        ht.bjwt[544] = -1341471198;
        ht.bjwt[545] = 1034367532;
        ht.bjwt[546] = 499029905;
        ht.bjwt[547] = 396335283;
        ht.bjwt[548] = -761166769;
        ht.bjwt[549] = -341023014;
        ht.bjwt[550] = -1189247817;
        ht.bjwt[551] = -1718782466;
        ht.bjwt[552] = 1655780818;
        ht.bjwt[553] = -1826105811;
        ht.bjwt[554] = -1852261369;
        ht.bjwt[555] = 1469836836;
        ht.bjwt[556] = -1589295611;
        ht.bjwt[557] = -943873845;
        ht.bjwt[558] = -657232670;
        ht.bjwt[559] = 282466252;
        ht.bjwt[560] = 96867995;
        ht.bjwt[561] = -972723637;
        ht.bjwt[562] = 198319976;
        ht.bjwt[563] = 1580170693;
        ht.bjwt[564] = -1758448201;
        ht.bjwt[565] = -1129794267;
        ht.bjwt[566] = 936635864;
        ht.bjwt[567] = -1392721273;
        ht.bjwt[568] = -645067898;
        ht.bjwt[569] = 1145574021;
        ht.bjwt[570] = 173203201;
        ht.bjwt[571] = 1701917633;
        ht.bjwt[572] = 2099462254;
        ht.bjwt[573] = 148276166;
        ht.bjwt[574] = -70651761;
        ht.bjwt[575] = -1565662864;
        ht.bjwt[576] = -1539211213;
        ht.bjwt[577] = -587939635;
        ht.bjwt[578] = 377676089;
        ht.bjwt[579] = -1843591308;
        ht.bjwt[580] = 1681790380;
        ht.bjwt[581] = 93798605;
        ht.bjwt[582] = 1085502970;
        ht.bjwt[583] = 436740777;
        ht.bjwt[584] = -428006345;
        ht.bjwt[585] = -348547434;
        ht.bjwt[586] = -1612955596;
        ht.bjwt[587] = -1028668412;
        ht.bjwt[588] = -1979252001;
        ht.bjwt[589] = -1093359827;
        ht.bjwt[590] = -1760374282;
        ht.bjwt[591] = -259621581;
        ht.bjwt[592] = -1555944262;
        ht.bjwt[593] = 1347617727;
        ht.bjwt[594] = 2012605469;
        ht.bjwt[595] = -1219844912;
        ht.bjwt[596] = 276625266;
        ht.bjwt[597] = 1416252265;
        ht.bjwt[598] = -786125769;
        ht.bjwt[599] = 611705602;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findNearestTarget$2(class_742 var0) {
        block35: {
            v0 /* !! */  = ht.dn;
            if (true) ** GOTO lbl5
            block19: while (true) {
                v0 /* !! */  = (long)(v1 - ht.bjwv("bmpc", bjyc(int ), (int)292));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -1822799047: {
                        v1 = ht.bjwv("bmpd", bjyc(int ), (int)293);
                        continue block19;
                    }
                    case 240546907: {
                        break block19;
                    }
                    case 969974097: {
                        v1 = ht.bjwv("bmpe", bjyc(int ), (int)294);
                        continue block19;
                    }
                }
                break;
            }
            var3_1 = ht.c;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmpf", bjyc(int ), (int)295)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ht.bjwv("bmpg", bjwq(int ), (int)591)) break;
                v2 /* !! */  = (long)ht.bjwv("bmph", bjwq(int ), (int)592);
            }
            var2_2 /* !! */  = ht.b;
            v3 /* !! */  = ht.dn;
            if (true) ** GOTO lbl25
            block21: while (true) {
                v3 /* !! */  = (long)(ht.bjwv("bmpj", bjyc(int ), (int)297) - ht.bjwv("bmpi", bjyc(int ), (int)296));
lbl25:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -1961029634: {
                        continue block21;
                    }
                    case 240546907: {
                        break block21;
                    }
                }
                break;
            }
            var1_3 = ht.a;
            if (var3_1) {
                throw null;
lbl33:
                // 4 sources

                return (boolean)ht.bjwv("bmpk", bjwq(int ), (int)593);
            }
            if (var1_3 || var1_3) ** GOTO lbl33
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmpl", bjyc(int ), (int)298)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ht.bjwv("bmpm", bjwq(int ), (int)594)) break;
                v4 /* !! */  = (long)ht.bjwv("bmpn", bjwq(int ), (int)595);
            }
            v5 = hb.getInstance();
            while (true) {
                if ((v6 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("bmpo", bjyc(int ), (int)299)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v6 /* !! */  == ht.bjwv("bmpp", bjwq(int ), (int)596)) break;
                v6 /* !! */  = (long)ht.bjwv("bmpq", bjwq(int ), (int)597);
            }
            if (v5.isBot((class_1657)var0)) break block35;
            if (var1_3) ** GOTO lbl33
            v7 = ht.bjwv("bmpr", bjwq(int ), (int)598);
            if (var3_1) {
                throw null;
            }
            ** GOTO lbl61
        }
        if (var1_3) ** GOTO lbl33
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var1_3) ** break;
                ** continue;
                v7 = ht.bjwv("bmps", bjwq(int ), (int)599);
lbl61:
                // 2 sources

                return (boolean)v7;
            }
lbl62:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht.bjwv("bmpt", bjwq(int ), (int)600);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl90
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ht.bjwv("bmpu", bjwq(int ), (int)601);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl86
            }
            case 2: {
                var2_2 /* !! */  = (int)ht.bjwv("bmpv", bjwq(int ), (int)602);
                if (var3_1) {
                    throw null;
                }
            }
            case 3: {
                do {
                    var2_2 /* !! */  = (int)ht.bjwv("bmpw", bjwq(int ), (int)603);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ht.bjwv("bmpx", bjwq(int ), (int)604);
                if (var3_1) {
                    throw null;
                }
            }
lbl86:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)ht.bjwv("bmpy", bjwq(int ), (int)605);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
lbl90:
            // 2 sources

            case 6: {
                do {
                    var2_2 /* !! */  = (int)ht.bjwv("bmpz", bjwq(int ), (int)606);
                } while (!var3_1);
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ht.bjwv("bmqa", bjwq(int ), (int)607);
        ** while (!var3_1)
lbl98:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Set<class_2338> collectHitboxVolume(class_1657 var1_1) {
        block139: {
            v0 /* !! */  = ht.dn;
            if (true) ** GOTO lbl5
            block91: while (true) {
                v0 /* !! */  = (long)(ht.bjwv("blre", bjyc(int ), (int)31) - ht.bjwv("blrd", bjyc(int ), (int)30));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -418504293: {
                        continue block91;
                    }
                    case 240546907: {
                        break block91;
                    }
                }
                break;
            }
            var7_2 = ht.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("blrf", bjyc(int ), (int)32)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v1 /* !! */  == ht.bjwv("blrg", bjwq(int ), (int)230)) break;
                v1 /* !! */  = (long)ht.bjwv("blrh", bjwq(int ), (int)231);
            }
            var6_3 /* !! */  = ht.b;
            v2 /* !! */  = ht.dn;
            if (true) ** GOTO lbl22
            block93: while (true) {
                v2 /* !! */  = (long)(v3 - ht.bjwv("blri", bjyc(int ), (int)33));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -122591374: {
                        v3 = ht.bjwv("blrj", bjyc(int ), (int)34);
                        continue block93;
                    }
                    case 240546907: {
                        break block93;
                    }
                    case 768533932: {
                        v3 = ht.bjwv("blrk", bjyc(int ), (int)35);
                        continue block93;
                    }
                }
                break;
            }
            var5_4 = ht.a;
            if (var7_2) {
                throw null;
lbl34:
                // 15 sources

                return null;
            }
            if (var5_4 || var5_4) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("blrl", bjyc(int ), (int)36)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == ht.bjwv("blrm", bjwq(int ), (int)232)) break;
                v4 /* !! */  = (long)ht.bjwv("blrn", bjwq(int ), (int)233);
            }
            v5 /* !! */  = ht.dn;
            if (true) ** GOTO lbl47
            block96: while (true) {
                v5 /* !! */  = (long)(v6 - ht.bjwv("blro", bjyc(int ), (int)37));
lbl47:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -732017591: {
                        v6 = ht.bjwv("blrp", bjyc(int ), (int)38);
                        continue block96;
                    }
                    case 240546907: {
                        break block96;
                    }
                    case 1958582783: {
                        v6 = ht.bjwv("blrq", bjyc(int ), (int)39);
                        continue block96;
                    }
                }
                break;
            }
            var2_5 = new LinkedHashSet<class_2338>();
            if (var5_4 || var5_4) ** GOTO lbl34
            v7 /* !! */  = ht.dn;
            if (true) ** GOTO lbl62
            block97: while (true) {
                v7 /* !! */  = (long)(v8 - ht.bjwv("blrr", bjyc(int ), (int)40));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1641579953: {
                        v8 = ht.bjwv("blrs", bjyc(int ), (int)41);
                        continue block97;
                    }
                    case -229149743: {
                        v8 = ht.bjwv("blrt", bjyc(int ), (int)42);
                        continue block97;
                    }
                    case 240546907: {
                        break block97;
                    }
                }
                break;
            }
            v9 = this.collectFootprint(var1_1);
            v10 /* !! */  = ht.dn;
            if (true) ** GOTO lbl76
            block98: while (true) {
                v10 /* !! */  = (long)(v11 - ht.bjwv("blru", bjyc(int ), (int)43));
lbl76:
                // 2 sources

                switch ((int)v10 /* !! */ ) {
                    case -1841912162: {
                        v11 = ht.bjwv("blrv", bjyc(int ), (int)44);
                        continue block98;
                    }
                    case -948278347: {
                        v11 = ht.bjwv("blrw", bjyc(int ), (int)45);
                        continue block98;
                    }
                    case 240546907: {
                        break block98;
                    }
                    case 1648495564: {
                        v11 = ht.bjwv("blrx", bjyc(int ), (int)46);
                        continue block98;
                    }
                }
                break;
            }
            var3_6 = v9.iterator();
            if (var5_4) ** GOTO lbl34
            do {
                if (var5_4 || var5_4) ** GOTO lbl34
                v12 /* !! */  = ht.dn;
                if (true) ** GOTO lbl96
                block100: while (true) {
                    v12 /* !! */  = (long)(v13 - ht.bjwv("blry", bjyc(int ), (int)47));
lbl96:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case 240546907: {
                            break block100;
                        }
                        case 1047121947: {
                            v13 = ht.bjwv("blrz", bjyc(int ), (int)48);
                            continue block100;
                        }
                        case 1416527166: {
                            v13 = ht.bjwv("blsa", bjyc(int ), (int)49);
                            continue block100;
                        }
                        case 1485725703: {
                            v13 = ht.bjwv("blsb", bjyc(int ), (int)50);
                            continue block100;
                        }
                    }
                    break;
                }
                if (!var3_6.hasNext()) break block139;
                if (var5_4) ** GOTO lbl34
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("blsc", bjyc(int ), (int)51)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v14 /* !! */  == ht.bjwv("blsd", bjwq(int ), (int)234)) break;
                    v14 /* !! */  = (long)ht.bjwv("blse", bjwq(int ), (int)235);
                }
                var4_7 = var3_6.next();
                if (var5_4 || var5_4) ** GOTO lbl34
                v15 /* !! */  = ht.dn;
                if (true) ** GOTO lbl122
                block102: while (true) {
                    v15 /* !! */  = (long)(v16 - ht.bjwv("blsf", bjyc(int ), (int)52));
lbl122:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -2112541407: {
                            v16 = ht.bjwv("blsg", bjyc(int ), (int)53);
                            continue block102;
                        }
                        case -1285226847: {
                            v16 = ht.bjwv("blsh", bjyc(int ), (int)54);
                            continue block102;
                        }
                        case 240546907: {
                            break block102;
                        }
                        case 313909795: {
                            v16 = ht.bjwv("blsi", bjyc(int ), (int)55);
                            continue block102;
                        }
                    }
                    break;
                }
                var2_5.add(var4_7);
                if (var5_4 || var5_4) ** GOTO lbl34
            } while (!var7_2);
            throw null;
        }
        if (var5_4 || var5_4) ** GOTO lbl34
        v17 /* !! */  = ht.dn;
        if (true) ** GOTO lbl145
        block103: while (true) {
            v17 /* !! */  = (long)(ht.bjwv("blsk", bjyc(int ), (int)57) - ht.bjwv("blsj", bjyc(int ), (int)56));
lbl145:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -969541314: {
                    continue block103;
                }
                case 240546907: {
                    break block103;
                }
            }
            break;
        }
        v18 = this.collectFootprint(var1_1);
        v19 /* !! */  = ht.dn;
        if (true) ** GOTO lbl155
        block104: while (true) {
            v19 /* !! */  = (long)(ht.bjwv("blsm", bjyc(int ), (int)59) - ht.bjwv("blsl", bjyc(int ), (int)58));
lbl155:
            // 2 sources

            switch ((int)v19 /* !! */ ) {
                case 240546907: {
                    break block104;
                }
                case 1942480705: {
                    continue block104;
                }
            }
            break;
        }
        var3_6 = v18.iterator();
        if (var5_4) ** GOTO lbl34
        block105: while (true) {
            if (var5_4) ** GOTO lbl34
            if (var6_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var5_4) ** GOTO lbl34
                    while (true) {
                        if ((v20 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("blsn", bjyc(int ), (int)60)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v20 /* !! */  == ht.bjwv("blso", bjwq(int ), (int)236)) break;
                        v20 /* !! */  = (long)ht.bjwv("blsp", bjwq(int ), (int)237);
                    }
                    if (!var3_6.hasNext()) ** GOTO lbl229
                    if (var5_4) ** GOTO lbl34
                    v21 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl180
                    block107: while (true) {
                        v21 /* !! */  = (long)(v22 - ht.bjwv("blsq", bjyc(int ), (int)61));
lbl180:
                        // 2 sources

                        switch ((int)v21 /* !! */ ) {
                            case -2011095680: {
                                v22 = ht.bjwv("blsr", bjyc(int ), (int)62);
                                continue block107;
                            }
                            case -860393223: {
                                v22 = ht.bjwv("blss", bjyc(int ), (int)63);
                                continue block107;
                            }
                            case 240546907: {
                                break block107;
                            }
                            case 1222725852: {
                                v22 = ht.bjwv("blst", bjyc(int ), (int)64);
                                continue block107;
                            }
                        }
                        break;
                    }
                    var4_7 = var3_6.next();
                    if (var5_4 || var5_4) ** GOTO lbl34
                    v23 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl198
                    block108: while (true) {
                        v23 /* !! */  = (long)(v24 - ht.bjwv("blsu", bjyc(int ), (int)65));
lbl198:
                        // 2 sources

                        switch ((int)v23 /* !! */ ) {
                            case -812806550: {
                                v24 = ht.bjwv("blsv", bjyc(int ), (int)66);
                                continue block108;
                            }
                            case 240546907: {
                                break block108;
                            }
                            case 656100068: {
                                v24 = ht.bjwv("blsw", bjyc(int ), (int)67);
                                continue block108;
                            }
                        }
                        break;
                    }
                    v25 = var4_7.method_10084();
                    v26 /* !! */  = ht.dn;
                    if (true) ** GOTO lbl212
                    block109: while (true) {
                        v26 /* !! */  = (long)(v27 - ht.bjwv("blsx", bjyc(int ), (int)68));
lbl212:
                        // 2 sources

                        switch ((int)v26 /* !! */ ) {
                            case -1267969112: {
                                v27 = ht.bjwv("blsy", bjyc(int ), (int)69);
                                continue block109;
                            }
                            case -100390969: {
                                v27 = ht.bjwv("blsz", bjyc(int ), (int)70);
                                continue block109;
                            }
                            case 240546907: {
                                break block109;
                            }
                            case 1837609846: {
                                v27 = ht.bjwv("blta", bjyc(int ), (int)71);
                                continue block109;
                            }
                        }
                        break;
                    }
                    var2_5.add(v25);
                    if (var5_4 || var5_4) ** GOTO lbl34
                    if (!var7_2) continue block105;
                    throw null;
lbl229:
                    // 1 sources

                    if (!var5_4 && !var5_4) ** break;
                    ** continue;
                    return var2_5;
                }
lbl232:
                // 2 sources

                case 0: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltb", bjwq(int ), (int)238);
                    if (var7_2) {
                        throw null;
                    }
                }
lbl236:
                // 4 sources

                case 1: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltc", bjwq(int ), (int)239);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl284
                }
                case 2: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltd", bjwq(int ), (int)240);
                    if (var7_2) {
                        throw null;
                    }
                }
                case 3: {
                    var6_3 /* !! */  = (int)ht.bjwv("blte", bjwq(int ), (int)241);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl324
                }
lbl250:
                // 3 sources

                case 4: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltf", bjwq(int ), (int)242);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl315
                }
                case 5: {
                    do {
                        var6_3 /* !! */  = (int)ht.bjwv("bltg", bjwq(int ), (int)243);
                    } while (!var7_2);
                    throw null;
                }
lbl260:
                // 3 sources

                case 6: {
                    var6_3 /* !! */  = (int)ht.bjwv("blth", bjwq(int ), (int)244);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl279
                }
lbl265:
                // 3 sources

                case 7: {
                    var6_3 /* !! */  = (int)ht.bjwv("blti", bjwq(int ), (int)245);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl293
                }
                case 8: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltj", bjwq(int ), (int)246);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl324
                }
lbl275:
                // 2 sources

                case 9: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltk", bjwq(int ), (int)247);
                    if (!var7_2) ** GOTO lbl236
                    throw null;
                }
lbl279:
                // 2 sources

                case 10: {
                    do {
                        var6_3 /* !! */  = (int)ht.bjwv("bltl", bjwq(int ), (int)248);
                    } while (!var7_2);
                    throw null;
                }
lbl284:
                // 2 sources

                case 11: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltm", bjwq(int ), (int)249);
                    if (!var7_2) ** GOTO lbl275
                    throw null;
                }
                case 12: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltn", bjwq(int ), (int)250);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl333
                }
lbl293:
                // 2 sources

                case 13: {
                    var6_3 /* !! */  = (int)ht.bjwv("blto", bjwq(int ), (int)251);
                    if (!var7_2) ** GOTO lbl260
                    throw null;
                }
                case 14: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltp", bjwq(int ), (int)252);
                    if (!var7_2) ** GOTO lbl260
                    throw null;
                }
                case 15: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltq", bjwq(int ), (int)253);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl337
                }
                case 16: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltr", bjwq(int ), (int)254);
                    if (var7_2) {
                        throw null;
                    }
                    ** GOTO lbl315
                }
lbl311:
                // 2 sources

                case 17: {
                    var6_3 /* !! */  = (int)ht.bjwv("blts", bjwq(int ), (int)255);
                    if (!var7_2) ** GOTO lbl265
                    throw null;
                }
lbl315:
                // 3 sources

                case 18: {
                    do {
                        var6_3 /* !! */  = (int)ht.bjwv("bltt", bjwq(int ), (int)256);
                    } while (!var7_2);
                    throw null;
                }
lbl320:
                // 2 sources

                case 19: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltu", bjwq(int ), (int)257);
                    if (var7_2) {
                        throw null;
                    }
                }
lbl324:
                // 5 sources

                case 20: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltv", bjwq(int ), (int)258);
                    if (!var7_2) ** GOTO lbl311
                    throw null;
                }
                case 21: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var6_3 /* !! */  = (int)ht.bjwv("bltw", bjwq(int ), (int)259);
                        if (!var7_2) ** GOTO lbl250
                        throw null;
                    }
                }
lbl333:
                // 2 sources

                case 22: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltx", bjwq(int ), (int)260);
                    if (!var7_2) ** GOTO lbl250
                    throw null;
                }
lbl337:
                // 2 sources

                case 23: {
                    var6_3 /* !! */  = (int)ht.bjwv("blty", bjwq(int ), (int)261);
                    if (!var7_2) ** GOTO lbl320
                    throw null;
                }
                case 24: {
                    var6_3 /* !! */  = (int)ht.bjwv("bltz", bjwq(int ), (int)262);
                    if (!var7_2) ** GOTO lbl232
                    throw null;
                }
                case 25: {
                    var6_3 /* !! */  = (int)ht.bjwv("blua", bjwq(int ), (int)263);
                    if (!var7_2) ** GOTO lbl265
                    throw null;
                }
                case 26: 
            }
            break;
        }
        var6_3 /* !! */  = (int)ht.bjwv("blub", bjwq(int ), (int)264);
        ** while (!var7_2)
lbl352:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bmsh() {
        ht.bjwt[100] = -1835878783;
        ht.bjwt[101] = 412466887;
        ht.bjwt[102] = -1199790383;
        ht.bjwt[103] = 156140698;
        ht.bjwt[104] = -134059045;
        ht.bjwt[105] = -511558501;
        ht.bjwt[106] = -1733188549;
        ht.bjwt[107] = 1804954131;
        ht.bjwt[108] = 613887052;
        ht.bjwt[109] = 1774302864;
        ht.bjwt[110] = -1558114169;
        ht.bjwt[111] = -1877107902;
        ht.bjwt[112] = -548478506;
        ht.bjwt[113] = -2022004150;
        ht.bjwt[114] = -1111788000;
        ht.bjwt[115] = -1108703084;
        ht.bjwt[116] = 1760435329;
        ht.bjwt[117] = 1038613801;
        ht.bjwt[118] = 1985981468;
        ht.bjwt[119] = -922515156;
        ht.bjwt[120] = -1985125013;
        ht.bjwt[121] = 926503887;
        ht.bjwt[122] = -1682919061;
        ht.bjwt[123] = 1952638985;
        ht.bjwt[124] = 1593847586;
        ht.bjwt[125] = -2086478370;
        ht.bjwt[126] = -1735293107;
        ht.bjwt[127] = -1494868120;
        ht.bjwt[128] = 862582582;
        ht.bjwt[129] = 1203214854;
        ht.bjwt[130] = -178274556;
        ht.bjwt[131] = -964958618;
        ht.bjwt[132] = 2089512200;
        ht.bjwt[133] = 1549096510;
        ht.bjwt[134] = -1369657653;
        ht.bjwt[135] = 1903359209;
        ht.bjwt[136] = -740642328;
        ht.bjwt[137] = 689565776;
        ht.bjwt[138] = -2126478842;
        ht.bjwt[139] = -1365859903;
        ht.bjwt[140] = 706152031;
        ht.bjwt[141] = 466459291;
        ht.bjwt[142] = -1678665542;
        ht.bjwt[143] = -1477132535;
        ht.bjwt[144] = -172394296;
        ht.bjwt[145] = -207214316;
        ht.bjwt[146] = -1760695746;
        ht.bjwt[147] = -604350253;
        ht.bjwt[148] = -425105115;
        ht.bjwt[149] = -754734451;
        ht.bjwt[150] = -1214554318;
        ht.bjwt[151] = 189479427;
        ht.bjwt[152] = 110425647;
        ht.bjwt[153] = 1569116730;
        ht.bjwt[154] = -1626384720;
        ht.bjwt[155] = -778937477;
        ht.bjwt[156] = -1162172498;
        ht.bjwt[157] = -2023361168;
        ht.bjwt[158] = -684930367;
        ht.bjwt[159] = -87580296;
        ht.bjwt[160] = 183691787;
        ht.bjwt[161] = -1645370962;
        ht.bjwt[162] = -1153710062;
        ht.bjwt[163] = 390695739;
        ht.bjwt[164] = -409129181;
        ht.bjwt[165] = 879103713;
        ht.bjwt[166] = -921424665;
        ht.bjwt[167] = 1173338347;
        ht.bjwt[168] = -33699747;
        ht.bjwt[169] = 1147597283;
        ht.bjwt[170] = 1033954128;
        ht.bjwt[171] = 2116381625;
        ht.bjwt[172] = 1842793982;
        ht.bjwt[173] = -113806524;
        ht.bjwt[174] = 1495272089;
        ht.bjwt[175] = 325674053;
        ht.bjwt[176] = 1691854779;
        ht.bjwt[177] = 1399869005;
        ht.bjwt[178] = -1028144122;
        ht.bjwt[179] = -1719483585;
        ht.bjwt[180] = 438569615;
        ht.bjwt[181] = 1626496065;
        ht.bjwt[182] = 943625919;
        ht.bjwt[183] = -2087661487;
        ht.bjwt[184] = -957579314;
        ht.bjwt[185] = -39579674;
        ht.bjwt[186] = 831627017;
        ht.bjwt[187] = -1172976836;
        ht.bjwt[188] = 1176488314;
        ht.bjwt[189] = -2020825789;
        ht.bjwt[190] = -37618505;
        ht.bjwt[191] = 1132145473;
        ht.bjwt[192] = -841107499;
        ht.bjwt[193] = -1609751291;
        ht.bjwt[194] = -1872605295;
        ht.bjwt[195] = -1760905004;
        ht.bjwt[196] = -251704114;
        ht.bjwt[197] = 568504445;
        ht.bjwt[198] = 816617879;
        ht.bjwt[199] = -224473411;
    }

    private static /* synthetic */ void bmsg() {
        ht.bjwt[0] = -1997715536;
        ht.bjwt[1] = 1356838043;
        ht.bjwt[2] = -113806981;
        ht.bjwt[3] = 232149378;
        ht.bjwt[4] = 1498627587;
        ht.bjwt[5] = 405517547;
        ht.bjwt[6] = -938636364;
        ht.bjwt[7] = 1677237775;
        ht.bjwt[8] = 1992816554;
        ht.bjwt[9] = -328064431;
        ht.bjwt[10] = -1604533832;
        ht.bjwt[11] = -666378704;
        ht.bjwt[12] = -806648381;
        ht.bjwt[13] = 875256162;
        ht.bjwt[14] = -900020492;
        ht.bjwt[15] = 971155790;
        ht.bjwt[16] = -710161997;
        ht.bjwt[17] = 2019637133;
        ht.bjwt[18] = -1554335752;
        ht.bjwt[19] = 1375607536;
        ht.bjwt[20] = 1609557851;
        ht.bjwt[21] = -1989163568;
        ht.bjwt[22] = -763422516;
        ht.bjwt[23] = 1930842779;
        ht.bjwt[24] = -1013113053;
        ht.bjwt[25] = 1698400985;
        ht.bjwt[26] = -1600310708;
        ht.bjwt[27] = 1483394574;
        ht.bjwt[28] = -1038666479;
        ht.bjwt[29] = -1568549308;
        ht.bjwt[30] = 465773187;
        ht.bjwt[31] = -373711385;
        ht.bjwt[32] = -644327067;
        ht.bjwt[33] = 1207328047;
        ht.bjwt[34] = -1468799300;
        ht.bjwt[35] = -1019885631;
        ht.bjwt[36] = 1368027784;
        ht.bjwt[37] = 244116030;
        ht.bjwt[38] = -1286383963;
        ht.bjwt[39] = -1519738636;
        ht.bjwt[40] = -1852940970;
        ht.bjwt[41] = -1102953561;
        ht.bjwt[42] = -79346042;
        ht.bjwt[43] = -1081478788;
        ht.bjwt[44] = -1987333332;
        ht.bjwt[45] = 2119876404;
        ht.bjwt[46] = -1047239033;
        ht.bjwt[47] = -122800654;
        ht.bjwt[48] = -2080263081;
        ht.bjwt[49] = -861478685;
        ht.bjwt[50] = -1239638464;
        ht.bjwt[51] = 324473470;
        ht.bjwt[52] = -1520312340;
        ht.bjwt[53] = -1026023886;
        ht.bjwt[54] = -1635694413;
        ht.bjwt[55] = 1984827841;
        ht.bjwt[56] = -1423568171;
        ht.bjwt[57] = 1363677596;
        ht.bjwt[58] = 1257683836;
        ht.bjwt[59] = 836627956;
        ht.bjwt[60] = 1967195180;
        ht.bjwt[61] = 1224794722;
        ht.bjwt[62] = 163614023;
        ht.bjwt[63] = 718456913;
        ht.bjwt[64] = 1328132811;
        ht.bjwt[65] = 377349262;
        ht.bjwt[66] = 917065601;
        ht.bjwt[67] = 188478129;
        ht.bjwt[68] = -1464362973;
        ht.bjwt[69] = 8893748;
        ht.bjwt[70] = -959467695;
        ht.bjwt[71] = 223227766;
        ht.bjwt[72] = 1544467533;
        ht.bjwt[73] = 2063554299;
        ht.bjwt[74] = -965725751;
        ht.bjwt[75] = 1632603050;
        ht.bjwt[76] = 1245169502;
        ht.bjwt[77] = 1218450139;
        ht.bjwt[78] = 353501016;
        ht.bjwt[79] = -1302055064;
        ht.bjwt[80] = 619858942;
        ht.bjwt[81] = 1761091879;
        ht.bjwt[82] = 1743811203;
        ht.bjwt[83] = -1448738694;
        ht.bjwt[84] = -1626142917;
        ht.bjwt[85] = 357850830;
        ht.bjwt[86] = -773693996;
        ht.bjwt[87] = -1452911805;
        ht.bjwt[88] = -23379558;
        ht.bjwt[89] = -933522723;
        ht.bjwt[90] = 245054738;
        ht.bjwt[91] = -569055777;
        ht.bjwt[92] = -1981678225;
        ht.bjwt[93] = -1394997177;
        ht.bjwt[94] = 1412548017;
        ht.bjwt[95] = 490959240;
        ht.bjwt[96] = 1961475694;
        ht.bjwt[97] = 285638632;
        ht.bjwt[98] = -325416308;
        ht.bjwt[99] = 1877024315;
    }

    private static /* synthetic */ long bjyc(int n2) {
        return bjye[n2] ^ bjyg[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void placePrepared() {
        block89: {
            var6_1 = ht.c;
            var5_2 /* !! */  = ht.b;
            var4_3 = ht.a;
            if (var6_1) {
                throw null;
lbl6:
                // 26 sources

                return;
            }
            if (var4_3 || var4_3) ** GOTO lbl6
            if (this.placement == null) break block89;
            if (var4_3) ** GOTO lbl6
            if (!this.isTargetValid()) break block89;
            if (var4_3) ** GOTO lbl6
            if (ht.mc.field_1724.method_5998(this.hand).method_31574(class_1802.field_8786)) ** GOTO lbl24
            if (var4_3) ** GOTO lbl6
        }
        if (var4_3 || var4_3) ** GOTO lbl6
        this.stage = ht$Stage.RESTORE;
        if (var4_3) ** GOTO lbl6
        if (var5_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_3) ** GOTO lbl6
                return;
            }
lbl24:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl6
            var1_4 = this.collectHitboxVolume(this.target);
            if (var4_3 || var4_3) ** GOTO lbl6
            if (var1_4.contains(this.placement.placePos())) ** GOTO lbl36
            if (var4_3 || var4_3) ** GOTO lbl6
            this.placement = null;
            if (var4_3 || var4_3) ** GOTO lbl6
            this.stage = ht$Stage.PREPARE_PLACEMENT;
            if (var4_3 || var4_3) ** GOTO lbl6
            this.prepareNextPlacement();
            if (var4_3 || var4_3) ** GOTO lbl6
            return;
lbl36:
            // 1 sources

            if (var4_3 || var4_3) ** GOTO lbl6
            var2_5 = ht.mc.field_1687.method_8320(this.placement.placePos());
            if (var4_3 || var4_3) ** GOTO lbl6
            var3_6 = ht.mc.field_1687.method_8320(this.placement.supportPos());
            if (var4_3 || var4_3) ** GOTO lbl6
            if (!var2_5.method_45474()) ** GOTO lbl54
            if (var4_3) ** GOTO lbl6
            if (!this.isUsableSupport(var3_6)) ** GOTO lbl54
            if (var4_3) ** GOTO lbl6
            if (!this.isWithinReach(this.placement.hitVec())) ** GOTO lbl54
            if (var4_3) ** GOTO lbl6
            if (!this.isFaceVisible(this.placement.supportPos(), this.placement.hitResult().method_17780())) ** GOTO lbl54
            if (var4_3 || var4_3) ** GOTO lbl6
            ht.mc.field_1761.method_2896(ht.mc.field_1724, this.hand, this.placement.hitResult());
            if (var4_3 || var4_3) ** GOTO lbl6
            ht.mc.field_1724.method_6104(this.hand);
            if (var4_3) ** GOTO lbl6
lbl54:
            // 5 sources

            if (var4_3 || var4_3) ** GOTO lbl6
            this.placement = null;
            if (var4_3 || var4_3) ** GOTO lbl6
            this.stage = ht$Stage.PREPARE_PLACEMENT;
            if (var4_3 || var4_3) ** GOTO lbl6
            this.prepareNextPlacement();
            if (!var4_3 && !var4_3) ** break;
            ** continue;
            return;
lbl63:
            // 4 sources

            case 0: {
                var5_2 /* !! */  = (int)ht.bjwv("bkfh", bjwq(int ), (int)86);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl100
            }
            case 1: {
                var5_2 /* !! */  = (int)ht.bjwv("bkfi", bjwq(int ), (int)87);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
lbl73:
            // 2 sources

            case 2: {
                var5_2 /* !! */  = (int)ht.bjwv("bkfj", bjwq(int ), (int)88);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl167
            }
            case 3: {
                var5_2 /* !! */  = (int)ht.bjwv("bkfk", bjwq(int ), (int)89);
                if (!var6_1) ** GOTO lbl63
                throw null;
            }
lbl82:
            // 2 sources

            case 4: {
                do {
                    var5_2 /* !! */  = (int)ht.bjwv("bkfp", bjwq(int ), (int)90);
                } while (!var6_1);
                throw null;
            }
            case 5: {
                var5_2 /* !! */  = (int)ht.bjwv("bkfr", bjwq(int ), (int)91);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl135
            }
lbl92:
            // 3 sources

            case 6: {
                var5_2 /* !! */  = (int)ht.bjwv("bkft", bjwq(int ), (int)92);
                if (!var6_1) ** GOTO lbl63
                throw null;
            }
lbl96:
            // 2 sources

            case 7: {
                var5_2 /* !! */  = (int)ht.bjwv("bkfv", bjwq(int ), (int)93);
                if (!var6_1) ** GOTO lbl92
                throw null;
            }
lbl100:
            // 3 sources

            case 8: {
                var5_2 /* !! */  = (int)ht.bjwv("bkfw", bjwq(int ), (int)94);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl105:
            // 3 sources

            case 9: {
                var5_2 /* !! */  = (int)ht.bjwv("bkfx", bjwq(int ), (int)95);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl241
            }
lbl110:
            // 2 sources

            case 10: {
                do {
                    var5_2 /* !! */  = (int)ht.bjwv("bkgb", bjwq(int ), (int)96);
                } while (!var6_1);
                throw null;
            }
lbl115:
            // 2 sources

            case 11: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgd", bjwq(int ), (int)97);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl120:
            // 2 sources

            case 12: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgf", bjwq(int ), (int)98);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl163
            }
            case 13: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgh", bjwq(int ), (int)99);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl249
            }
lbl130:
            // 3 sources

            case 14: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgj", bjwq(int ), (int)100);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl135:
            // 2 sources

            case 15: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgk", bjwq(int ), (int)101);
                if (!var6_1) ** GOTO lbl130
                throw null;
            }
lbl139:
            // 2 sources

            case 16: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgl", bjwq(int ), (int)102);
                if (!var6_1) ** GOTO lbl92
                throw null;
            }
lbl143:
            // 4 sources

            case 17: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgo", bjwq(int ), (int)103);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl229
            }
lbl148:
            // 2 sources

            case 18: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgp", bjwq(int ), (int)104);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl211
            }
            case 19: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgq", bjwq(int ), (int)105);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
            case 20: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgs", bjwq(int ), (int)106);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl163:
            // 3 sources

            case 21: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgu", bjwq(int ), (int)107);
                if (!var6_1) ** GOTO lbl96
                throw null;
            }
lbl167:
            // 2 sources

            case 22: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgx", bjwq(int ), (int)108);
                if (!var6_1) ** GOTO lbl120
                throw null;
            }
            case 23: {
                var5_2 /* !! */  = (int)ht.bjwv("bkgz", bjwq(int ), (int)109);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
lbl176:
            // 2 sources

            case 24: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhb", bjwq(int ), (int)110);
                if (!var6_1) ** GOTO lbl82
                throw null;
            }
            case 25: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhd", bjwq(int ), (int)111);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl216
            }
lbl185:
            // 2 sources

            case 26: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhe", bjwq(int ), (int)112);
                if (!var6_1) ** GOTO lbl176
                throw null;
            }
lbl189:
            // 2 sources

            case 27: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhf", bjwq(int ), (int)113);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl261
            }
            case 28: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhh", bjwq(int ), (int)114);
                if (!var6_1) ** GOTO lbl143
                throw null;
            }
            case 29: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhl", bjwq(int ), (int)115);
                if (!var6_1) ** GOTO lbl100
                throw null;
            }
            case 30: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhm", bjwq(int ), (int)116);
                if (!var6_1) ** GOTO lbl143
                throw null;
            }
lbl206:
            // 3 sources

            case 31: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhn", bjwq(int ), (int)117);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl211:
            // 4 sources

            case 32: {
                var5_2 /* !! */  = (int)ht.bjwv("bkho", bjwq(int ), (int)118);
                if (var6_1) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl216:
            // 2 sources

            case 33: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhp", bjwq(int ), (int)119);
                if (!var6_1) ** GOTO lbl211
                throw null;
            }
            case 34: {
                do {
                    var5_2 /* !! */  = (int)ht.bjwv("bkhq", bjwq(int ), (int)120);
                } while (!var6_1);
                throw null;
            }
            case 35: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhr", bjwq(int ), (int)121);
                if (!var6_1) ** GOTO lbl130
                throw null;
            }
lbl229:
            // 2 sources

            case 36: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhv", bjwq(int ), (int)122);
                if (!var6_1) ** GOTO lbl115
                throw null;
            }
            case 37: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhw", bjwq(int ), (int)123);
                if (!var6_1) ** GOTO lbl211
                throw null;
            }
            case 38: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhx", bjwq(int ), (int)124);
                if (!var6_1) ** GOTO lbl105
                throw null;
            }
lbl241:
            // 2 sources

            case 39: {
                var5_2 /* !! */  = (int)ht.bjwv("bkhy", bjwq(int ), (int)125);
                if (!var6_1) ** GOTO lbl105
                throw null;
            }
            case 40: {
                var5_2 /* !! */  = (int)ht.bjwv("bkib", bjwq(int ), (int)126);
                if (!var6_1) ** GOTO lbl110
                throw null;
            }
lbl249:
            // 2 sources

            case 41: {
                var5_2 /* !! */  = (int)ht.bjwv("bkie", bjwq(int ), (int)127);
                if (!var6_1) ** GOTO lbl206
                throw null;
            }
lbl253:
            // 3 sources

            case 42: {
                var5_2 /* !! */  = (int)ht.bjwv("bkih", bjwq(int ), (int)128);
                if (!var6_1) ** GOTO lbl63
                throw null;
            }
            case 43: {
                var5_2 /* !! */  = (int)ht.bjwv("bkij", bjwq(int ), (int)129);
                if (!var6_1) ** GOTO lbl139
                throw null;
            }
lbl261:
            // 3 sources

            case 44: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_2 /* !! */  = (int)ht.bjwv("bkim", bjwq(int ), (int)130);
                    if (!var6_1) ** GOTO lbl73
                    throw null;
                }
            }
            case 45: 
        }
        var5_2 /* !! */  = (int)ht.bjwv("bkio", bjwq(int ), (int)131);
        ** while (!var6_1)
lbl269:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bmso() {
        ht.bjye[100] = 246481312774569952L;
        ht.bjye[101] = 2625571355656834454L;
        ht.bjye[102] = -9088285228414028549L;
        ht.bjye[103] = 343734732989104100L;
        ht.bjye[104] = -2790204633570603668L;
        ht.bjye[105] = -6697307944706602440L;
        ht.bjye[106] = -9046911265974011537L;
        ht.bjye[107] = -2861724873972521058L;
        ht.bjye[108] = 2217870725418139226L;
        ht.bjye[109] = 6308661441674362039L;
        ht.bjye[110] = 7159730886670537307L;
        ht.bjye[111] = -7290333417253096595L;
        ht.bjye[112] = 3991865591254386355L;
        ht.bjye[113] = 851175297765613356L;
        ht.bjye[114] = -2370642338729370316L;
        ht.bjye[115] = -125754684245520685L;
        ht.bjye[116] = -6510290306815711724L;
        ht.bjye[117] = -3117377896932949296L;
        ht.bjye[118] = 7696960627606775997L;
        ht.bjye[119] = -2859476766133767671L;
        ht.bjye[120] = -2806169941877373695L;
        ht.bjye[121] = -2380461173429890638L;
        ht.bjye[122] = -8231075294335486774L;
        ht.bjye[123] = 2821653538615358635L;
        ht.bjye[124] = 2112015752747634241L;
        ht.bjye[125] = 7196942099313106921L;
        ht.bjye[126] = 8013480603332595508L;
        ht.bjye[127] = 5910726485265428255L;
        ht.bjye[128] = -5768676466391689416L;
        ht.bjye[129] = -4289757898613551832L;
        ht.bjye[130] = -856590164835928042L;
        ht.bjye[131] = -5931022509507729991L;
        ht.bjye[132] = -2523254333324163519L;
        ht.bjye[133] = 5317615672197607929L;
        ht.bjye[134] = -2994913296601884456L;
        ht.bjye[135] = 4877619564823129652L;
        ht.bjye[136] = 1650082219603910012L;
        ht.bjye[137] = -7871946580551911021L;
        ht.bjye[138] = -8398561585157650776L;
        ht.bjye[139] = -2060633778634946622L;
        ht.bjye[140] = 4385297560553718828L;
        ht.bjye[141] = -8918263037824390518L;
        ht.bjye[142] = -2277246285517751567L;
        ht.bjye[143] = -3356469956709776749L;
        ht.bjye[144] = 839057171828415517L;
        ht.bjye[145] = -5793238675590771734L;
        ht.bjye[146] = -1277620703335979904L;
        ht.bjye[147] = 6817337660929352054L;
        ht.bjye[148] = -1110543780833832358L;
        ht.bjye[149] = 7919099793055405589L;
        ht.bjye[150] = -6594828108300722231L;
        ht.bjye[151] = -4246180547803193713L;
        ht.bjye[152] = -6287002194930726113L;
        ht.bjye[153] = -6871235637012469080L;
        ht.bjye[154] = -2071408612950864269L;
        ht.bjye[155] = 9057073237675143934L;
        ht.bjye[156] = 3447906048352250319L;
        ht.bjye[157] = 5532766408875166664L;
        ht.bjye[158] = 6418034396389740303L;
        ht.bjye[159] = -4486252078555444350L;
        ht.bjye[160] = 406526167807360169L;
        ht.bjye[161] = 4431814328849807200L;
        ht.bjye[162] = -4478502969481793434L;
        ht.bjye[163] = -8205066450823040029L;
        ht.bjye[164] = -163440701696548487L;
        ht.bjye[165] = -8283382494771192739L;
        ht.bjye[166] = -1115674294902607537L;
        ht.bjye[167] = 847198292937563163L;
        ht.bjye[168] = 5747579693698628178L;
        ht.bjye[169] = -802329700612737175L;
        ht.bjye[170] = 5840152893131217558L;
        ht.bjye[171] = -1635403050282582459L;
        ht.bjye[172] = -6722175153278021523L;
        ht.bjye[173] = 3254666200326921949L;
        ht.bjye[174] = -67362146520877942L;
        ht.bjye[175] = 5964824779924333683L;
        ht.bjye[176] = 6216215239802391787L;
        ht.bjye[177] = -5776038620165976953L;
        ht.bjye[178] = -8781572299668179550L;
        ht.bjye[179] = -5920625221761000155L;
        ht.bjye[180] = -4180678124268412503L;
        ht.bjye[181] = 8453463747669480988L;
        ht.bjye[182] = 335084465278056313L;
        ht.bjye[183] = -5276184364219940101L;
        ht.bjye[184] = -8179893156389492545L;
        ht.bjye[185] = 6595576657479828764L;
        ht.bjye[186] = 226931586693039373L;
        ht.bjye[187] = -6744807748851880320L;
        ht.bjye[188] = 2016430829954085800L;
        ht.bjye[189] = 7963769978476542500L;
        ht.bjye[190] = -6337363991803504450L;
        ht.bjye[191] = -982465263229496872L;
        ht.bjye[192] = -5530363070362544287L;
        ht.bjye[193] = -424419870704138292L;
        ht.bjye[194] = -7234779588049378030L;
        ht.bjye[195] = -9017273088778518071L;
        ht.bjye[196] = 2601920655460408668L;
        ht.bjye[197] = -942600747231774450L;
        ht.bjye[198] = -7039766689030328247L;
        ht.bjye[199] = -3318335366399614112L;
    }

    private static /* synthetic */ void bmst() {
        ht.bjyg[200] = -4925140707027657295L;
        ht.bjyg[201] = -1752686017115548732L;
        ht.bjyg[202] = 6103459333512149564L;
        ht.bjyg[203] = -7048778037004410549L;
        ht.bjyg[204] = -4110693235634555363L;
        ht.bjyg[205] = -8023451065911569961L;
        ht.bjyg[206] = 7687225901865127597L;
        ht.bjyg[207] = -1164316799497100344L;
        ht.bjyg[208] = 8106768219661006131L;
        ht.bjyg[209] = -7256784175891993853L;
        ht.bjyg[210] = -4416130941843226914L;
        ht.bjyg[211] = 8829579673629380120L;
        ht.bjyg[212] = 2293060701704825969L;
        ht.bjyg[213] = 5707659963701927227L;
        ht.bjyg[214] = 9004971104911482811L;
        ht.bjyg[215] = 4154785970854071283L;
        ht.bjyg[216] = 8418940016771430186L;
        ht.bjyg[217] = 8027171471307002014L;
        ht.bjyg[218] = -2137383260451905268L;
        ht.bjyg[219] = -5262056380670755867L;
        ht.bjyg[220] = -6471557868405764235L;
        ht.bjyg[221] = -7937712422620714687L;
        ht.bjyg[222] = -8347414879758117140L;
        ht.bjyg[223] = -4389474990871508635L;
        ht.bjyg[224] = 6720611073818264918L;
        ht.bjyg[225] = -8721516409986729096L;
        ht.bjyg[226] = 1152609256074943306L;
        ht.bjyg[227] = -2104372220690364951L;
        ht.bjyg[228] = -4385755045790803469L;
        ht.bjyg[229] = -5450651467021531197L;
        ht.bjyg[230] = -3304429079511965049L;
        ht.bjyg[231] = -6086650809935263233L;
        ht.bjyg[232] = 4140973169190167008L;
        ht.bjyg[233] = 2473056394391021370L;
        ht.bjyg[234] = 7821872008359878988L;
        ht.bjyg[235] = -1167055684804265304L;
        ht.bjyg[236] = -9025400652192789944L;
        ht.bjyg[237] = -2004067078792978343L;
        ht.bjyg[238] = -3251461441804892148L;
        ht.bjyg[239] = 1016878252949124211L;
        ht.bjyg[240] = 3301301999798661300L;
        ht.bjyg[241] = 8325571311561232853L;
        ht.bjyg[242] = -2307589769007269907L;
        ht.bjyg[243] = 175973658289543009L;
        ht.bjyg[244] = 217345932562500580L;
        ht.bjyg[245] = 3408104538150121265L;
        ht.bjyg[246] = 8138836980481476348L;
        ht.bjyg[247] = 2786993834766376169L;
        ht.bjyg[248] = -2798550272973732716L;
        ht.bjyg[249] = -5285294637156356265L;
        ht.bjyg[250] = 8786877005042737362L;
        ht.bjyg[251] = 5449317983181905103L;
        ht.bjyg[252] = -2772607995271420346L;
        ht.bjyg[253] = 3424394018641904497L;
        ht.bjyg[254] = -4349620403297337665L;
        ht.bjyg[255] = -1840938442814743310L;
        ht.bjyg[256] = -4146598156156279195L;
        ht.bjyg[257] = 6498763026899429670L;
        ht.bjyg[258] = 8460473412716490256L;
        ht.bjyg[259] = 1120555929029156832L;
        ht.bjyg[260] = -4221292375900629989L;
        ht.bjyg[261] = 3682040511712255555L;
        ht.bjyg[262] = 6652591437255980059L;
        ht.bjyg[263] = 4693573331969505694L;
        ht.bjyg[264] = 3942794240535814842L;
        ht.bjyg[265] = -5916597142092988322L;
        ht.bjyg[266] = -7989617946153367222L;
        ht.bjyg[267] = 1343326069165234345L;
        ht.bjyg[268] = 6073290397013360583L;
        ht.bjyg[269] = 344100271375298096L;
        ht.bjyg[270] = -309783437187200433L;
        ht.bjyg[271] = 913383450041879156L;
        ht.bjyg[272] = -1727522273430210773L;
        ht.bjyg[273] = -572185463454939552L;
        ht.bjyg[274] = -95276546117220961L;
        ht.bjyg[275] = -2962412768187932077L;
        ht.bjyg[276] = -3952234408680776563L;
        ht.bjyg[277] = -2522671526111599034L;
        ht.bjyg[278] = -3466234518010033975L;
        ht.bjyg[279] = -2300207819448116478L;
        ht.bjyg[280] = 5630078318463364296L;
        ht.bjyg[281] = 3260180182160791538L;
        ht.bjyg[282] = -2866096071526235027L;
        ht.bjyg[283] = 2655580256898883967L;
        ht.bjyg[284] = 6690110143497828053L;
        ht.bjyg[285] = 2004707384969894532L;
        ht.bjyg[286] = 9082075155117544817L;
        ht.bjyg[287] = -9015898533546404081L;
        ht.bjyg[288] = -1452344695368374119L;
        ht.bjyg[289] = -3466227005088387460L;
        ht.bjyg[290] = 9074236020434854430L;
        ht.bjyg[291] = -3746099167581915105L;
        ht.bjyg[292] = -8454410983694794619L;
        ht.bjyg[293] = -710896438689610573L;
        ht.bjyg[294] = 6633435667196021797L;
        ht.bjyg[295] = -8224930701193089668L;
        ht.bjyg[296] = 863267236020023698L;
        ht.bjyg[297] = -6323760076885018128L;
        ht.bjyg[298] = -980500236490524731L;
        ht.bjyg[299] = -6091903715197218244L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ boolean lambda$findNearestTarget$1(class_742 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmqb", bjyc(int ), (int)300)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ht.bjwv("bmqc", bjwq(int ), (int)608)) break;
            v0 /* !! */  = (long)ht.bjwv("bmqd", bjwq(int ), (int)609);
        }
        var3_1 = ht.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmqe", bjyc(int ), (int)301)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ht.bjwv("bmqf", bjwq(int ), (int)610)) break;
            v1 /* !! */  = (long)ht.bjwv("bmqg", bjwq(int ), (int)611);
        }
        var2_2 /* !! */  = ht.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("bmqh", bjyc(int ), (int)302)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ht.bjwv("bmqi", bjwq(int ), (int)612)) break;
            v2 /* !! */  = (long)ht.bjwv("bmqj", bjwq(int ), (int)613);
        }
        var1_3 = ht.a;
        if (var3_1) {
            throw null;
lbl24:
            // 4 sources

            return (boolean)ht.bjwv("bmqk", bjwq(int ), (int)614);
        }
        if (var1_3) ** GOTO lbl24
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("bmql", bjyc(int ), (int)303)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ht.bjwv("bmqm", bjwq(int ), (int)615)) break;
                    v3 /* !! */  = (long)ht.bjwv("bmqn", bjwq(int ), (int)616);
                }
                if (dl.isFriend((class_1297)var0)) ** GOTO lbl43
                if (var1_3) ** GOTO lbl24
                v4 = ht.bjwv("bmqo", bjwq(int ), (int)617);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl46
lbl43:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v4 = ht.bjwv("bmqp", bjwq(int ), (int)618);
lbl46:
                // 2 sources

                return (boolean)v4;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht.bjwv("bmqq", bjwq(int ), (int)619);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl74
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ht.bjwv("bmqr", bjwq(int ), (int)620);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl62
            }
lbl58:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ht.bjwv("bmqs", bjwq(int ), (int)621);
                if (var3_1) {
                    throw null;
                }
            }
lbl62:
            // 5 sources

            case 3: {
                var2_2 /* !! */  = (int)ht.bjwv("bmqt", bjwq(int ), (int)622);
                if (!var3_1) break;
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ht.bjwv("bmqu", bjwq(int ), (int)623);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)ht.bjwv("bmqv", bjwq(int ), (int)624);
                if (!var3_1) ** GOTO lbl62
                throw null;
            }
lbl74:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ht.bjwv("bmqw", bjwq(int ), (int)625);
                if (!var3_1) ** GOTO lbl58
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)ht.bjwv("bmqx", bjwq(int ), (int)626);
        ** while (!var3_1)
lbl81:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bmsq() {
        ht.bjye[300] = -5649404645457388901L;
        ht.bjye[301] = 5579551285307074462L;
        ht.bjye[302] = 8132814430057392991L;
        ht.bjye[303] = 1043109372137320104L;
        ht.bjye[304] = -620994453834930760L;
        ht.bjye[305] = 645829773549144701L;
        ht.bjye[306] = -4930238528400267484L;
        ht.bjye[307] = -2865524321205512937L;
        ht.bjye[308] = -7961300712799927250L;
        ht.bjye[309] = 1266457109287726359L;
        ht.bjye[310] = -5636692401564159500L;
        ht.bjye[311] = 2547155211588727142L;
        ht.bjye[312] = -986026319253481734L;
        ht.bjye[313] = 3887439434641529004L;
        ht.bjye[314] = -2746236695913765619L;
        ht.bjye[315] = 1722387634271581337L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void restoreAndClear() {
        v0 /* !! */  = ht.dn;
        if (true) ** GOTO lbl5
        block59: while (true) {
            v0 /* !! */  = (long)(v1 - ht.bjwv("bmix", bjyc(int ), (int)210));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1958410248: {
                    v1 = ht.bjwv("bmiy", bjyc(int ), (int)211);
                    continue block59;
                }
                case -1813429535: {
                    v1 = ht.bjwv("bmiz", bjyc(int ), (int)212);
                    continue block59;
                }
                case -218600850: {
                    v1 = ht.bjwv("bmja", bjyc(int ), (int)213);
                    continue block59;
                }
                case 240546907: {
                    break block59;
                }
            }
            break;
        }
        var3_1 = ht.c;
        v2 /* !! */  = ht.dn;
        if (true) ** GOTO lbl22
        block60: while (true) {
            v2 /* !! */  = (long)(v3 - ht.bjwv("bmjb", bjyc(int ), (int)214));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1601217239: {
                    v3 = ht.bjwv("bmjc", bjyc(int ), (int)215);
                    continue block60;
                }
                case 240546907: {
                    break block60;
                }
                case 1824368381: {
                    v3 = ht.bjwv("bmjd", bjyc(int ), (int)216);
                    continue block60;
                }
            }
            break;
        }
        var2_2 /* !! */  = ht.b;
        v4 /* !! */  = ht.dn;
        if (true) ** GOTO lbl36
        block61: while (true) {
            v4 /* !! */  = (long)(ht.bjwv("bmjf", bjyc(int ), (int)218) - ht.bjwv("bmje", bjyc(int ), (int)217));
lbl36:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -165400403: {
                    continue block61;
                }
                case 240546907: {
                    break block61;
                }
            }
            break;
        }
        var1_3 = ht.a;
        if (var3_1) {
            throw null;
lbl44:
            // 8 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        v5 /* !! */  = ht.dn;
        if (true) ** GOTO lbl51
        block63: while (true) {
            v5 /* !! */  = (long)(v6 - ht.bjwv("bmjg", bjyc(int ), (int)219));
lbl51:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1168547237: {
                    v6 = ht.bjwv("bmjh", bjyc(int ), (int)220);
                    continue block63;
                }
                case -585769478: {
                    v6 = ht.bjwv("bmji", bjyc(int ), (int)221);
                    continue block63;
                }
                case 240546907: {
                    break block63;
                }
            }
            break;
        }
        if (this.previousSlot == ht.bjwv("bmjj", bjwq(int ), (int)512)) ** GOTO lbl130
        if (var1_3) ** GOTO lbl44
        v7 /* !! */  = ht.dn;
        if (true) ** GOTO lbl66
        block64: while (true) {
            v7 /* !! */  = (long)(ht.bjwv("bmjl", bjyc(int ), (int)223) - ht.bjwv("bmjk", bjyc(int ), (int)222));
lbl66:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 240546907: {
                    break block64;
                }
                case 1157082636: {
                    continue block64;
                }
            }
            break;
        }
        v8 /* !! */  = ht.dn;
        if (true) ** GOTO lbl75
        block65: while (true) {
            v8 /* !! */  = (long)(v9 - ht.bjwv("bmjm", bjyc(int ), (int)224));
lbl75:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 240546907: {
                    break block65;
                }
                case 1491699265: {
                    v9 = ht.bjwv("bmjn", bjyc(int ), (int)225);
                    continue block65;
                }
                case 1908904339: {
                    v9 = ht.bjwv("bmjo", bjyc(int ), (int)226);
                    continue block65;
                }
                case 2050771348: {
                    v9 = ht.bjwv("bmjp", bjyc(int ), (int)227);
                    continue block65;
                }
            }
            break;
        }
        if (ht.mc.field_1724 == null) ** GOTO lbl130
        if (var1_3 || var1_3) ** GOTO lbl44
        v10 /* !! */  = ht.dn;
        if (true) ** GOTO lbl93
        block66: while (true) {
            v10 /* !! */  = (long)(v11 - ht.bjwv("bmjq", bjyc(int ), (int)228));
lbl93:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -350810523: {
                    v11 = ht.bjwv("bmjr", bjyc(int ), (int)229);
                    continue block66;
                }
                case 45968775: {
                    v11 = ht.bjwv("bmjs", bjyc(int ), (int)230);
                    continue block66;
                }
                case 240546907: {
                    break block66;
                }
                case 1189459899: {
                    v11 = ht.bjwv("bmjt", bjyc(int ), (int)231);
                    continue block66;
                }
            }
            break;
        }
        v12 /* !! */  = ht.dn;
        if (true) ** GOTO lbl109
        block67: while (true) {
            v12 /* !! */  = (long)(v13 - ht.bjwv("bmju", bjyc(int ), (int)232));
lbl109:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -579947633: {
                    v13 = ht.bjwv("bmjv", bjyc(int ), (int)233);
                    continue block67;
                }
                case 240546907: {
                    break block67;
                }
                case 1838128605: {
                    v13 = ht.bjwv("bmjw", bjyc(int ), (int)234);
                    continue block67;
                }
            }
            break;
        }
        nv.selectSlot(this.previousSlot);
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_0 = ht.dn - ht.bjwv("bmjx", bjyc(int ), (int)235)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == ht.bjwv("bmjy", bjwq(int ), (int)513)) break;
                    v14 /* !! */  = (long)ht.bjwv("bmjz", bjwq(int ), (int)514);
                }
                nv.updateSlots();
                if (var1_3) ** GOTO lbl44
lbl130:
                // 3 sources

                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v15 /* !! */  = (cfr_temp_1 = ht.dn - ht.bjwv("bmka", bjyc(int ), (int)236)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v15 /* !! */  == ht.bjwv("bmkb", bjwq(int ), (int)515)) break;
                    v15 /* !! */  = (long)ht.bjwv("bmkc", bjwq(int ), (int)516);
                }
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_2 = ht.dn - ht.bjwv("bmkd", bjyc(int ), (int)237)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == ht.bjwv("bmke", bjwq(int ), (int)517)) break;
                    v16 /* !! */  = (long)ht.bjwv("bmkf", bjwq(int ), (int)518);
                }
                ot.INSTANCE.releaseProvider(this);
                if (var1_3 || var1_3) ** GOTO lbl44
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_3 = ht.dn - ht.bjwv("bmkg", bjyc(int ), (int)238)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ht.bjwv("bmkh", bjwq(int ), (int)519)) break;
                    v17 /* !! */  = (long)ht.bjwv("bmki", bjwq(int ), (int)520);
                }
                this.clearState();
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl152:
            // 4 sources

            case 0: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkj", bjwq(int ), (int)521);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl210
            }
            case 1: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkk", bjwq(int ), (int)522);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkl", bjwq(int ), (int)523);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl188
            }
lbl166:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkm", bjwq(int ), (int)524);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
lbl170:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkn", bjwq(int ), (int)525);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl193
            }
            case 5: {
                var2_2 /* !! */  = (int)ht.bjwv("bmko", bjwq(int ), (int)526);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl197
            }
            case 6: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkp", bjwq(int ), (int)527);
                if (var3_1) {
                    throw null;
                }
            }
            case 7: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkq", bjwq(int ), (int)528);
                if (!var3_1) break;
                throw null;
            }
lbl188:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkr", bjwq(int ), (int)529);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl206
            }
lbl193:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ht.bjwv("bmks", bjwq(int ), (int)530);
                if (!var3_1) ** GOTO lbl166
                throw null;
            }
lbl197:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkt", bjwq(int ), (int)531);
                if (!var3_1) ** GOTO lbl188
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ht.bjwv("bmku", bjwq(int ), (int)532);
                    if (!var3_1) ** GOTO lbl152
                    throw null;
                }
            }
lbl206:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkv", bjwq(int ), (int)533);
                if (!var3_1) ** GOTO lbl170
                throw null;
            }
lbl210:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkw", bjwq(int ), (int)534);
                if (!var3_1) ** GOTO lbl152
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)ht.bjwv("bmkx", bjwq(int ), (int)535);
                if (!var3_1) ** GOTO lbl170
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)ht.bjwv("bmky", bjwq(int ), (int)536);
        ** while (!var3_1)
lbl221:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void initializeTrap() {
        boolean bl2 = c;
        int n2 = b;
        boolean bl3 = a;
        if (bl2) {
            throw null;
        }
        if (bl3 || bl3) return;
        this.target = this.findNearestTarget();
        if (bl3 || bl3) return;
        if (this.target == null) {
            if (bl3 || bl3) return;
            pp.brandmessage("\u0426\u0435\u043b\u044c \u0434\u043b\u044f WebTrap \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u0430");
            if (bl3 || bl3) return;
            this.clearState();
            if (bl3 || bl3) return;
            return;
        }
        if (bl3 || bl3) return;
        this.anchorFootprint.addAll(this.collectFootprint(this.target));
        if (bl3 || bl3) return;
        this.pendingPositions.addAll(this.collectHitboxVolume(this.target));
        if (bl3 || bl3) return;
        if (this.pendingPositions.isEmpty()) {
            if (bl3 || bl3) return;
            pp.brandmessage("\u041d\u0435\u0442 \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u044b\u0445 \u0431\u043b\u043e\u043a\u043e\u0432 \u0434\u043b\u044f WebTrap");
            if (bl3 || bl3) return;
            this.clearState();
            if (bl3 || bl3) return;
            return;
        }
        if (bl3 || bl3) return;
        if (ht.mc.field_1724.method_6079().method_31574(class_1802.field_8786)) {
            if (bl3 || bl3) return;
            this.hand = class_1268.field_5810;
            if (bl3) return;
            if (bl2) {
                throw null;
            }
        } else {
            if (bl3 || bl3) return;
            int n3 = nv.findHotbarItem(class_1802.field_8786);
            if (bl3 || bl3) return;
            if (n3 == ht.bjwv("bkjb", bjwq(int ), (int)132)) {
                if (bl3 || bl3) return;
                pp.brandmessage("\u041f\u0430\u0443\u0442\u0438\u043d\u0430 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u0430 \u0432 \u0445\u043e\u0442\u0431\u0430\u0440\u0435");
                if (bl3 || bl3) return;
                this.clearState();
                if (bl3 || bl3) return;
                return;
            }
            if (bl3 || bl3) return;
            this.hand = class_1268.field_5808;
            if (bl3 || bl3) return;
            int n4 = ht.mc.field_1724.method_31548().method_67532();
            if (bl3 || bl3) return;
            if (n4 != n3) {
                if (bl3 || bl3) return;
                this.previousSlot = n4;
                if (bl3 || bl3) return;
                nv.selectSlot(n3);
                if (bl3 || bl3) return;
                nv.updateSlots();
                if (bl3) return;
            }
        }
        if (bl3 || bl3) return;
        this.stage = ht$Stage.PREPARE_PLACEMENT;
        if (bl3 || bl3) return;
        this.prepareNextPlacement();
        if (!bl3 && !bl3) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @aw
    public void onTick(df df2) {
        boolean bl2;
        boolean bl3;
        block30: {
            block29: {
                bl3 = c;
                int n2 = b;
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                if (bl2 || bl2) return;
                if (this.stage == ht$Stage.IDLE) {
                    if (bl2 || bl2) return;
                    return;
                }
                if (bl2 || bl2) return;
                if (ht.mc.field_1724 == null) break block29;
                if (bl2) return;
                if (ht.mc.field_1687 == null) break block29;
                if (bl2) return;
                if (ht.mc.field_1761 != null) break block30;
                if (bl2) return;
            }
            if (bl2 || bl2) return;
            this.restoreAndClear();
            if (bl2 || bl2) return;
            return;
        }
        if (bl2 || bl2) return;
        switch (this.stage.ordinal()) {
            case 1: {
                if (bl2 || bl2) return;
                this.initializeTrap();
                if (bl2) return;
                if (!bl3) break;
                throw null;
            }
            case 2: {
                if (bl2 || bl2) return;
                this.prepareNextPlacement();
                if (bl2) return;
                if (!bl3) break;
                throw null;
            }
            case 3: {
                if (bl2 || bl2) return;
                this.stage = ht$Stage.READY_TO_PLACE;
                if (bl2) return;
                if (!bl3) break;
                throw null;
            }
            case 4: {
                if (bl2 || bl2) return;
                this.placePrepared();
                if (bl2) return;
                if (!bl3) break;
                throw null;
            }
            case 5: {
                if (bl2 || bl2) return;
                this.restoreAndClear();
                if (bl2) return;
                if (!bl3) break;
                throw null;
            }
        }
        if (!bl2 && !bl2) return;
    }

    private static /* synthetic */ void bmsf() {
        ht.bjwr[600] = -103340433;
        ht.bjwr[601] = -2056510963;
        ht.bjwr[602] = -1958282206;
        ht.bjwr[603] = 566915840;
        ht.bjwr[604] = -539252846;
        ht.bjwr[605] = -2058464244;
        ht.bjwr[606] = -1803365302;
        ht.bjwr[607] = 1350975097;
        ht.bjwr[608] = 194180820;
        ht.bjwr[609] = 920695258;
        ht.bjwr[610] = 548175206;
        ht.bjwr[611] = -1433660677;
        ht.bjwr[612] = 1220990418;
        ht.bjwr[613] = 1282471727;
        ht.bjwr[614] = 534716617;
        ht.bjwr[615] = 568563028;
        ht.bjwr[616] = -1726024280;
        ht.bjwr[617] = -985093128;
        ht.bjwr[618] = 1713714055;
        ht.bjwr[619] = -1006654385;
        ht.bjwr[620] = -1626248012;
        ht.bjwr[621] = -690624436;
        ht.bjwr[622] = 634467917;
        ht.bjwr[623] = 2051305047;
        ht.bjwr[624] = 1680539512;
        ht.bjwr[625] = -1018842452;
        ht.bjwr[626] = -383955161;
        ht.bjwr[627] = 1943232091;
        ht.bjwr[628] = -8389697;
        ht.bjwr[629] = -315971122;
        ht.bjwr[630] = -760346276;
        ht.bjwr[631] = -39343407;
        ht.bjwr[632] = 33922058;
        ht.bjwr[633] = 71695365;
        ht.bjwr[634] = -1888822757;
        ht.bjwr[635] = 853858154;
        ht.bjwr[636] = -1419547423;
        ht.bjwr[637] = 1638099656;
        ht.bjwr[638] = -322647544;
        ht.bjwr[639] = 1781900602;
        ht.bjwr[640] = 1815290130;
        ht.bjwr[641] = -2019952518;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void prepareNextPlacement() {
        block66: {
            block67: {
                block68: {
                    var4_1 = ht.c;
                    var3_2 /* !! */  = ht.b;
                    var2_3 = ht.a;
                    if (var4_1) {
                        throw null;
lbl6:
                        // 16 sources

                        return;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl6
                    if (this.isTargetValid()) break block68;
                    if (var2_3 || var2_3) ** GOTO lbl6
                    this.stage = ht$Stage.RESTORE;
                    if (var2_3 || var2_3) ** GOTO lbl6
                    return;
                }
                do lbl-1000:
                // 3 sources

                {
                    block69: {
                        if (var2_3 || var2_3) ** GOTO lbl6
                        if (this.pendingPositions.isEmpty()) break block66;
                        if (var2_3 || var2_3) ** GOTO lbl6
                        var1_4 = this.pendingPositions.removeFirst();
                        if (var2_3 || var2_3) ** GOTO lbl6
                        if (ht.mc.field_1687.method_8320(var1_4).method_45474()) break block69;
                        if (var2_3 || var2_3) ** GOTO lbl6
                        if (!var4_1) ** GOTO lbl-1000
                        throw null;
                    }
                    if (var2_3 || var2_3) ** GOTO lbl6
                    this.placement = this.findPlacement(var1_4);
                    if (var2_3 || var2_3) ** GOTO lbl6
                    if (this.placement != null) break block67;
                    if (var2_3 || var2_3) ** GOTO lbl6
                } while (!var4_1);
                throw null;
            }
            if (var2_3 || var2_3) ** GOTO lbl6
            this.rotateTo(this.placement.hitVec());
            if (var2_3 || var2_3) ** GOTO lbl6
            this.stage = ht$Stage.WAIT_ROTATION;
            if (var2_3 || var2_3) ** GOTO lbl6
            return;
        }
        if (var2_3 || var2_3) ** GOTO lbl6
        this.stage = ht$Stage.RESTORE;
        if (var2_3) ** GOTO lbl6
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_3) ** break;
                ** continue;
                return;
            }
lbl50:
            // 2 sources

            case 0: {
                var3_2 /* !! */  = (int)ht.bjwv("bluc", bjwq(int ), (int)265);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl55:
            // 3 sources

            case 1: {
                var3_2 /* !! */  = (int)ht.bjwv("blud", bjwq(int ), (int)266);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl60:
            // 3 sources

            case 2: {
                var3_2 /* !! */  = (int)ht.bjwv("blue", bjwq(int ), (int)267);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl164
            }
            case 3: {
                var3_2 /* !! */  = (int)ht.bjwv("bluf", bjwq(int ), (int)268);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl90
            }
lbl70:
            // 2 sources

            case 4: {
                var3_2 /* !! */  = (int)ht.bjwv("blug", bjwq(int ), (int)269);
                if (!var4_1) ** GOTO lbl50
                throw null;
            }
lbl74:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)ht.bjwv("bluh", bjwq(int ), (int)270);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 6: {
                var3_2 /* !! */  = (int)ht.bjwv("blui", bjwq(int ), (int)271);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl155
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)ht.bjwv("bluj", bjwq(int ), (int)272);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl181
                    break;
                }
            }
lbl90:
            // 2 sources

            case 8: {
                var3_2 /* !! */  = (int)ht.bjwv("bluk", bjwq(int ), (int)273);
                if (!var4_1) ** GOTO lbl55
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)ht.bjwv("blul", bjwq(int ), (int)274);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl99:
            // 2 sources

            case 10: {
                var3_2 /* !! */  = (int)ht.bjwv("blum", bjwq(int ), (int)275);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl108
            }
lbl104:
            // 5 sources

            case 11: {
                var3_2 /* !! */  = (int)ht.bjwv("blun", bjwq(int ), (int)276);
                if (!var4_1) break;
                throw null;
            }
lbl108:
            // 2 sources

            case 12: {
                var3_2 /* !! */  = (int)ht.bjwv("bluo", bjwq(int ), (int)277);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
            case 13: {
                var3_2 /* !! */  = (int)ht.bjwv("blup", bjwq(int ), (int)278);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 14: {
                var3_2 /* !! */  = (int)ht.bjwv("bluq", bjwq(int ), (int)279);
                if (!var4_1) ** GOTO lbl60
                throw null;
            }
            case 15: {
                var3_2 /* !! */  = (int)ht.bjwv("blur", bjwq(int ), (int)280);
                if (!var4_1) ** GOTO lbl55
                throw null;
            }
            case 16: {
                var3_2 /* !! */  = (int)ht.bjwv("blus", bjwq(int ), (int)281);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl189
            }
            case 17: {
                var3_2 /* !! */  = (int)ht.bjwv("blut", bjwq(int ), (int)282);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl159
            }
            case 18: {
                var3_2 /* !! */  = (int)ht.bjwv("bluu", bjwq(int ), (int)283);
                if (!var4_1) ** GOTO lbl99
                throw null;
            }
lbl139:
            // 2 sources

            case 19: {
                var3_2 /* !! */  = (int)ht.bjwv("bluv", bjwq(int ), (int)284);
                if (!var4_1) break;
                throw null;
            }
            case 20: {
                var3_2 /* !! */  = (int)ht.bjwv("bluw", bjwq(int ), (int)285);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
lbl147:
            // 2 sources

            case 21: {
                var3_2 /* !! */  = (int)ht.bjwv("blux", bjwq(int ), (int)286);
                if (!var4_1) ** GOTO lbl139
                throw null;
            }
lbl151:
            // 2 sources

            case 22: {
                var3_2 /* !! */  = (int)ht.bjwv("bluy", bjwq(int ), (int)287);
                if (!var4_1) ** GOTO lbl104
                throw null;
            }
lbl155:
            // 2 sources

            case 23: {
                var3_2 /* !! */  = (int)ht.bjwv("bluz", bjwq(int ), (int)288);
                if (!var4_1) ** GOTO lbl70
                throw null;
            }
lbl159:
            // 2 sources

            case 24: {
                var3_2 /* !! */  = (int)ht.bjwv("blva", bjwq(int ), (int)289);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl172
            }
lbl164:
            // 3 sources

            case 25: {
                var3_2 /* !! */  = (int)ht.bjwv("blvb", bjwq(int ), (int)290);
                if (!var4_1) break;
                throw null;
            }
            case 26: {
                var3_2 /* !! */  = (int)ht.bjwv("blvc", bjwq(int ), (int)291);
                if (!var4_1) ** GOTO lbl164
                throw null;
            }
lbl172:
            // 4 sources

            case 27: {
                var3_2 /* !! */  = (int)ht.bjwv("blvd", bjwq(int ), (int)292);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
            case 28: {
                var3_2 /* !! */  = (int)ht.bjwv("blve", bjwq(int ), (int)293);
                if (!var4_1) ** GOTO lbl172
                throw null;
            }
lbl181:
            // 3 sources

            case 29: {
                var3_2 /* !! */  = (int)ht.bjwv("blvf", bjwq(int ), (int)294);
                if (!var4_1) ** GOTO lbl147
                throw null;
            }
lbl185:
            // 3 sources

            case 30: {
                var3_2 /* !! */  = (int)ht.bjwv("blvg", bjwq(int ), (int)295);
                if (!var4_1) ** GOTO lbl74
                throw null;
            }
lbl189:
            // 3 sources

            case 31: {
                var3_2 /* !! */  = (int)ht.bjwv("blvh", bjwq(int ), (int)296);
                if (!var4_1) ** GOTO lbl181
                throw null;
            }
            case 32: {
                var3_2 /* !! */  = (int)ht.bjwv("blvi", bjwq(int ), (int)297);
                if (!var4_1) ** GOTO lbl60
                throw null;
            }
            case 33: 
        }
        var3_2 /* !! */  = (int)ht.bjwv("blvj", bjwq(int ), (int)298);
        ** while (!var4_1)
lbl200:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ht() {
        var2_1 /* !! */  = ht.b;
        super("WebTrap", "\u0421\u0442\u0430\u0432\u0438\u0442 \u043f\u0430\u0443\u0442\u0438\u043d\u0443 \u0432\u043e \u0432\u0441\u0435 \u0431\u043b\u043e\u043a\u0438 \u0445\u0438\u0442\u0431\u043e\u043a\u0441\u0430 \u043f\u0440\u043e\u0442\u0438\u0432\u043d\u0438\u043a\u0430 \u043d\u0430 \u0432\u044b\u0441\u043e\u0442\u0435 \u0434\u0432\u0443\u0445 \u0431\u043b\u043e\u043a\u043e\u0432", du.RAGE);
        this.webTrapBind = new ka("\u041a\u043d\u043e\u043f\u043a\u0430 \u0432\u0435\u0431\u0442\u0440\u0430\u043f\u0430", "\u0417\u0430\u043f\u043e\u043b\u043d\u0438\u0442\u044c \u043f\u0430\u0443\u0442\u0438\u043d\u043e\u0439 \u0432\u0435\u0441\u044c \u0445\u0438\u0442\u0431\u043e\u043a\u0441 \u0431\u043b\u0438\u0436\u0430\u0439\u0448\u0435\u0433\u043e \u043f\u0440\u043e\u0442\u0438\u0432\u043d\u0438\u043a\u0430");
        this.placementRotation = new os(new hy(), (boolean)ht.bjwv("bjwy", bjwq(int ), (int)0), (boolean)ht.bjwv("bjxa", bjwq(int ), (int)1), (boolean)ht.bjwv("bjxb", bjwq(int ), (int)2));
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.pendingPositions = new ArrayDeque<E>();
                this.anchorFootprint = new LinkedHashSet<class_2338>();
                this.stage = ht$Stage.IDLE;
                this.hand = class_1268.field_5808;
                this.previousSlot = (int)ht.bjwv("bjxe", bjwq(int ), (int)3);
                this.settings(new jx[]{this.webTrapBind});
                return;
            }
            case 0: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxg", bjwq(int ), (int)4);
                break;
            }
            case 1: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxh", bjwq(int ), (int)5);
                ** GOTO lbl32
            }
lbl21:
            // 3 sources

            case 2: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxk", bjwq(int ), (int)6);
            }
            case 3: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxl", bjwq(int ), (int)7);
                ** GOTO lbl21
            }
lbl26:
            // 2 sources

            case 4: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxm", bjwq(int ), (int)8);
                ** GOTO lbl38
            }
lbl29:
            // 2 sources

            case 5: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxn", bjwq(int ), (int)9);
                break;
            }
lbl32:
            // 2 sources

            case 6: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxo", bjwq(int ), (int)10);
                ** GOTO lbl29
            }
            case 7: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxp", bjwq(int ), (int)11);
                ** GOTO lbl26
            }
lbl38:
            // 2 sources

            case 8: {
                var2_1 /* !! */  = (int)ht.bjwv("bjxq", bjwq(int ), (int)12);
                break;
            }
            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ht.bjwv("bjxs", bjwq(int ), (int)13);
                    ** GOTO lbl21
                    break;
                }
            }
            case 10: 
        }
        var2_1 /* !! */  = (int)ht.bjwv("bjxz", bjwq(int ), (int)14);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ht$Placement findPlacement(class_2338 var1_1) {
        var12_2 = ht.c;
        var11_3 /* !! */  = ht.b;
        var10_4 = ht.a;
        if (var12_2) {
            throw null;
lbl6:
            // 20 sources

            return null;
        }
        if (var10_4 || var10_4) ** GOTO lbl6
        var2_5 = class_2350.values();
        if (var10_4) ** GOTO lbl6
        var3_6 = var2_5.length;
        if (var10_4) ** GOTO lbl6
        var4_7 = ht.bjwv("bmau", bjwq(int ), (int)355);
        if (var10_4) ** GOTO lbl6
        block39: while (true) {
            if (var10_4 || var10_4) ** GOTO lbl6
            if (var4_7 >= var3_6) ** GOTO lbl53
            if (var10_4) ** GOTO lbl6
            var5_8 = var2_5[var4_7];
            if (var10_4 || var10_4) ** GOTO lbl6
            var6_9 = var1_1.method_10093(var5_8);
            if (var10_4 || var10_4) ** GOTO lbl6
            var7_10 = ht.mc.field_1687.method_8320(var6_9);
            if (var10_4 || var10_4) ** GOTO lbl6
            if (this.isUsableSupport(var7_10)) ** GOTO lbl34
            if (var10_4) ** GOTO lbl6
            if (var11_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var11_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var10_4) ** GOTO lbl6
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl48
                }
lbl34:
                // 1 sources

                if (var10_4 || var10_4) ** GOTO lbl6
                var8_11 = var5_8.method_10153();
                if (var10_4 || var10_4) ** GOTO lbl6
                var9_12 = class_243.method_24953((class_2382)var6_9).method_1019(class_243.method_24954((class_2382)var8_11.method_62675()).method_1021((double)ht.bjwv("bmav", blpm(int ), (int)156)));
                if (var10_4 || var10_4) ** GOTO lbl6
                if (!this.isWithinReach(var9_12)) ** GOTO lbl48
                if (var10_4) ** GOTO lbl6
                if (this.isFaceVisible(var6_9, var8_11)) ** GOTO lbl46
                if (var10_4 || var10_4) ** GOTO lbl6
                if (var12_2) {
                    throw null;
                }
                ** GOTO lbl48
lbl46:
                // 1 sources

                if (var10_4 || var10_4) ** GOTO lbl6
                return new ht$Placement(var1_1.method_10062(), var6_9.method_10062(), var9_12, new class_3965(var9_12, var8_11, var6_9, (boolean)ht.bjwv("bmaw", bjwq(int ), (int)356)));
lbl48:
                // 3 sources

                if (var10_4 || var10_4) ** GOTO lbl6
                ++var4_7;
                if (var10_4) ** GOTO lbl6
                if (!var12_2) continue block39;
                throw null;
lbl53:
                // 1 sources

                if (!var10_4 && !var10_4) ** break;
                ** continue;
                return null;
lbl56:
                // 3 sources

                case 0: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmax", bjwq(int ), (int)357);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
lbl61:
                // 3 sources

                case 1: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmay", bjwq(int ), (int)358);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl155
                }
lbl66:
                // 3 sources

                case 2: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmaz", bjwq(int ), (int)359);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl189
                }
                case 3: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmba", bjwq(int ), (int)360);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var11_3 /* !! */  = (int)ht.bjwv("bmbb", bjwq(int ), (int)361);
                        if (!var12_2) ** GOTO lbl66
                        throw null;
                    }
                }
                case 5: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbc", bjwq(int ), (int)362);
                    if (!var12_2) break block39;
                    throw null;
                }
lbl85:
                // 2 sources

                case 6: {
                    do {
                        var11_3 /* !! */  = (int)ht.bjwv("bmbd", bjwq(int ), (int)363);
                    } while (!var12_2);
                    throw null;
                }
                case 7: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbe", bjwq(int ), (int)364);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl163
                }
lbl95:
                // 2 sources

                case 8: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbf", bjwq(int ), (int)365);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl209
                }
                case 9: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbg", bjwq(int ), (int)366);
                    if (!var12_2) break block39;
                    throw null;
                }
lbl104:
                // 2 sources

                case 10: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbh", bjwq(int ), (int)367);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl137
                }
                case 11: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbi", bjwq(int ), (int)368);
                    if (!var12_2) break block39;
                    throw null;
                }
                case 12: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbj", bjwq(int ), (int)369);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl176
                }
                case 13: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbk", bjwq(int ), (int)370);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl209
                }
lbl123:
                // 2 sources

                case 14: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbl", bjwq(int ), (int)371);
                    if (!var12_2) ** GOTO lbl104
                    throw null;
                }
lbl127:
                // 2 sources

                case 15: {
                    do {
                        var11_3 /* !! */  = (int)ht.bjwv("bmbm", bjwq(int ), (int)372);
                    } while (!var12_2);
                    throw null;
                }
                case 16: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbn", bjwq(int ), (int)373);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl180
                }
lbl137:
                // 4 sources

                case 17: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbo", bjwq(int ), (int)374);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl201
                }
                case 18: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbp", bjwq(int ), (int)375);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl155
                }
                case 19: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbq", bjwq(int ), (int)376);
                    if (!var12_2) ** GOTO lbl137
                    throw null;
                }
lbl151:
                // 2 sources

                case 20: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbr", bjwq(int ), (int)377);
                    if (!var12_2) ** GOTO lbl123
                    throw null;
                }
lbl155:
                // 3 sources

                case 21: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbs", bjwq(int ), (int)378);
                    if (!var12_2) ** GOTO lbl61
                    throw null;
                }
                case 22: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbt", bjwq(int ), (int)379);
                    if (!var12_2) ** GOTO lbl85
                    throw null;
                }
lbl163:
                // 2 sources

                case 23: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbu", bjwq(int ), (int)380);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl205
                }
                case 24: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbv", bjwq(int ), (int)381);
                    if (!var12_2) ** GOTO lbl95
                    throw null;
                }
                case 25: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbw", bjwq(int ), (int)382);
                    if (!var12_2) ** GOTO lbl56
                    throw null;
                }
lbl176:
                // 3 sources

                case 26: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbx", bjwq(int ), (int)383);
                    if (!var12_2) ** GOTO lbl127
                    throw null;
                }
lbl180:
                // 3 sources

                case 27: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmby", bjwq(int ), (int)384);
                    if (!var12_2) ** GOTO lbl56
                    throw null;
                }
                case 28: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmbz", bjwq(int ), (int)385);
                    if (var12_2) {
                        throw null;
                    }
                    ** GOTO lbl197
                }
lbl189:
                // 3 sources

                case 29: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmca", bjwq(int ), (int)386);
                    if (var12_2) {
                        throw null;
                    }
                }
                case 30: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmcb", bjwq(int ), (int)387);
                    if (!var12_2) ** GOTO lbl151
                    throw null;
                }
lbl197:
                // 2 sources

                case 31: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmcc", bjwq(int ), (int)388);
                    if (!var12_2) ** GOTO lbl137
                    throw null;
                }
lbl201:
                // 2 sources

                case 32: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmcd", bjwq(int ), (int)389);
                    if (!var12_2) ** GOTO lbl66
                    throw null;
                }
lbl205:
                // 2 sources

                case 33: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmce", bjwq(int ), (int)390);
                    if (!var12_2) ** GOTO lbl189
                    throw null;
                }
lbl209:
                // 3 sources

                case 34: {
                    var11_3 /* !! */  = (int)ht.bjwv("bmcf", bjwq(int ), (int)391);
                    if (!var12_2) ** GOTO lbl61
                    throw null;
                }
                case 35: 
            }
            break;
        }
        var11_3 /* !! */  = (int)ht.bjwv("bmcg", bjwq(int ), (int)392);
        ** while (!var12_2)
lbl216:
        // 1 sources

        throw null;
    }
}

