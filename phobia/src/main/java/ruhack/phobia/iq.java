/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import ruhack.phobia.iq$1;
import ruhack.phobia.ir;
import ruhack.phobia.it$Stage;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

public class iq {
    private final ir predictor;
    private static final class_310 mc;
    private float height;
    public static final int b;
    private static int[] gtd;
    public static final long ae = -6652272904597222479L;
    private static long[] gtr;
    public static final boolean c;
    private static long[] gtq;
    private boolean predictionEnabled;
    private static int[] gte;
    public static final boolean a;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ov calculateAngle(class_1309 var1_1, it$Stage var2_2) {
        block134: {
            block133: {
                v0 /* !! */  = iq.ae;
                if (true) ** GOTO lbl5
                block91: while (true) {
                    v0 /* !! */  = (long)(v1 - iq.gtf("gwv", gtp(int ), (int)29));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1868669424: {
                            v1 = iq.gtf("gww", gtp(int ), (int)30);
                            continue block91;
                        }
                        case -1284536530: {
                            v1 = iq.gtf("gwx", gtp(int ), (int)31);
                            continue block91;
                        }
                        case -595145807: {
                            break block91;
                        }
                        case 808044080: {
                            v1 = iq.gtf("gwy", gtp(int ), (int)32);
                            continue block91;
                        }
                    }
                    break;
                }
                var7_3 = iq.c;
                v2 /* !! */  = iq.ae;
                if (true) ** GOTO lbl22
                block92: while (true) {
                    v2 /* !! */  = (long)(iq.gtf("gxa", gtp(int ), (int)34) - iq.gtf("gwz", gtp(int ), (int)33));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -595145807: {
                            break block92;
                        }
                        case -445548298: {
                            continue block92;
                        }
                    }
                    break;
                }
                var6_4 /* !! */  = iq.b;
                v3 /* !! */  = iq.ae;
                if (true) ** GOTO lbl32
                block93: while (true) {
                    v3 /* !! */  = (long)(iq.gtf("gxc", gtp(int ), (int)36) - iq.gtf("gxb", gtp(int ), (int)35));
lbl32:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -595145807: {
                            break block93;
                        }
                        case -529844289: {
                            continue block93;
                        }
                    }
                    break;
                }
                var5_5 = iq.a;
                if (var7_3) {
                    throw null;
lbl40:
                    // 10 sources

                    return null;
                }
                if (var5_5 || var5_5) ** GOTO lbl40
                if (var1_1 == null) break block133;
                if (var5_5) ** GOTO lbl40
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = iq.ae - iq.gtf("gxd", gtp(int ), (int)37)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == iq.gtf("gxe", gtc(int ), (int)60)) break;
                    v4 /* !! */  = (long)iq.gtf("gxf", gtc(int ), (int)61);
                }
                v5 /* !! */  = iq.ae;
                if (true) ** GOTO lbl54
                block96: while (true) {
                    v5 /* !! */  = (long)(v6 - iq.gtf("gxg", gtp(int ), (int)38));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -595145807: {
                            break block96;
                        }
                        case -575710684: {
                            v6 = iq.gtf("gxh", gtp(int ), (int)39);
                            continue block96;
                        }
                        case -352191649: {
                            v6 = iq.gtf("gxi", gtp(int ), (int)40);
                            continue block96;
                        }
                    }
                    break;
                }
                if (iq.mc.field_1724 != null) break block134;
                if (var5_5) ** GOTO lbl40
            }
            if (var5_5 || var5_5) ** GOTO lbl40
            v7 /* !! */  = iq.ae;
            if (true) ** GOTO lbl71
            block97: while (true) {
                v7 /* !! */  = (long)(v8 - iq.gtf("gxj", gtp(int ), (int)41));
lbl71:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1043004206: {
                        v8 = iq.gtf("gxk", gtp(int ), (int)42);
                        continue block97;
                    }
                    case -595145807: {
                        break block97;
                    }
                    case 851065277: {
                        v8 = iq.gtf("gxl", gtp(int ), (int)43);
                        continue block97;
                    }
                }
                break;
            }
            return ow.cameraAngle();
        }
        if (var5_5 || var5_5) ** GOTO lbl40
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = iq.ae - iq.gtf("gxm", gtp(int ), (int)44)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == iq.gtf("gxn", gtc(int ), (int)62)) break;
            v9 /* !! */  = (long)iq.gtf("gxo", gtc(int ), (int)63);
        }
        var3_6 = this.getTargetPosition(var1_1, var2_2);
        if (var5_5 || var5_5) ** GOTO lbl40
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        block24 : switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = iq.ae - iq.gtf("gxp", gtp(int ), (int)45)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == iq.gtf("gxq", gtc(int ), (int)64)) break;
                    v10 /* !! */  = (long)iq.gtf("gxr", gtc(int ), (int)65);
                }
                while (true) {
                    if ((v11 = (cfr_temp_3 = iq.ae - iq.gtf("gxs", gtp(int ), (int)46)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v11 == iq.gtf("gxt", gtc(int ), (int)66)) break;
                    v11 = -1975791441;
                }
                switch (iq$1.$SwitchMap$ruhack$phobia$system$modulesystem$impl$rage$macetarget$state$MaceState$Stage[var2_2.ordinal()]) {
                    case 1: {
                        if (var5_5 || var5_5) ** GOTO lbl40
                        while (true) {
                            if ((v12 /* !! */  = (cfr_temp_4 = iq.ae - iq.gtf("gxu", gtp(int ), (int)47)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v12 /* !! */  == iq.gtf("gxv", gtc(int ), (int)67)) break;
                            v12 /* !! */  = (long)iq.gtf("gxw", gtc(int ), (int)68);
                        }
                        v13 = this.height;
                        while (true) {
                            if ((v14 /* !! */  = (cfr_temp_5 = iq.ae - iq.gtf("gxx", gtp(int ), (int)48)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v14 /* !! */  == iq.gtf("gxy", gtc(int ), (int)69)) break;
                            v14 /* !! */  = (long)iq.gtf("gxz", gtc(int ), (int)70);
                        }
                        var4_7 = var3_6.method_1031(0.0, v13, 0.0);
                        if (var5_5 || var5_5) ** GOTO lbl40
                        while (true) {
                            if ((v15 /* !! */  = (cfr_temp_6 = iq.ae - iq.gtf("gya", gtp(int ), (int)49)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v15 /* !! */  == iq.gtf("gyb", gtc(int ), (int)71)) break;
                            v15 /* !! */  = (long)iq.gtf("gyc", gtc(int ), (int)72);
                        }
                        while (true) {
                            if ((v16 /* !! */  = (cfr_temp_7 = iq.ae - iq.gtf("gyd", gtp(int ), (int)50)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v16 /* !! */  == iq.gtf("gye", gtc(int ), (int)73)) break;
                            v16 /* !! */  = (long)iq.gtf("gyf", gtc(int ), (int)74);
                        }
                        v17 = iq.mc.field_1724;
                        v18 /* !! */  = iq.ae;
                        if (true) ** GOTO lbl134
                        block105: while (true) {
                            v18 /* !! */  = (long)(v19 - iq.gtf("gyg", gtp(int ), (int)51));
lbl134:
                            // 2 sources

                            switch ((int)v18 /* !! */ ) {
                                case -921629544: {
                                    v19 = iq.gtf("gyh", gtp(int ), (int)52);
                                    continue block105;
                                }
                                case -595145807: {
                                    break block105;
                                }
                                case -384007722: {
                                    v19 = iq.gtf("gyi", gtp(int ), (int)53);
                                    continue block105;
                                }
                            }
                            break;
                        }
                        v20 = v17.method_33571();
                        v21 /* !! */  = iq.ae;
                        if (true) ** GOTO lbl148
                        block106: while (true) {
                            v21 /* !! */  = (long)(v22 - iq.gtf("gyj", gtp(int ), (int)54));
lbl148:
                            // 2 sources

                            switch ((int)v21 /* !! */ ) {
                                case -595145807: {
                                    break block106;
                                }
                                case 104473187: {
                                    v22 = iq.gtf("gyk", gtp(int ), (int)55);
                                    continue block106;
                                }
                                case 425444499: {
                                    v22 = iq.gtf("gyl", gtp(int ), (int)56);
                                    continue block106;
                                }
                                case 1430232114: {
                                    v22 = iq.gtf("gym", gtp(int ), (int)57);
                                    continue block106;
                                }
                            }
                            break;
                        }
                        v23 = var4_7.method_1020(v20);
                        v24 /* !! */  = iq.ae;
                        if (true) ** GOTO lbl165
                        block107: while (true) {
                            v24 /* !! */  = (long)(v25 - iq.gtf("gyn", gtp(int ), (int)58));
lbl165:
                            // 2 sources

                            switch ((int)v24 /* !! */ ) {
                                case -823493140: {
                                    v25 = iq.gtf("gyo", gtp(int ), (int)59);
                                    continue block107;
                                }
                                case -595145807: {
                                    break block107;
                                }
                                case 126646588: {
                                    v25 = iq.gtf("gyp", gtp(int ), (int)60);
                                    continue block107;
                                }
                            }
                            break;
                        }
                        return ow.fromVec3d(v23);
                    }
                    case 2: 
                    case 3: {
                        if (var5_5 || var5_5) ** GOTO lbl40
                        while (true) {
                            if ((v26 /* !! */  = (cfr_temp_8 = iq.ae - iq.gtf("gyq", gtp(int ), (int)61)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                            if (v26 /* !! */  == iq.gtf("gyr", gtc(int ), (int)75)) break;
                            v26 /* !! */  = (long)iq.gtf("gys", gtc(int ), (int)76);
                        }
                        v27 /* !! */  = iq.ae;
                        if (true) ** GOTO lbl186
                        block109: while (true) {
                            v27 /* !! */  = (long)(v28 - iq.gtf("gyt", gtp(int ), (int)62));
lbl186:
                            // 2 sources

                            switch ((int)v27 /* !! */ ) {
                                case -595145807: {
                                    break block109;
                                }
                                case -279765333: {
                                    v28 = iq.gtf("gyu", gtp(int ), (int)63);
                                    continue block109;
                                }
                                case -56797671: {
                                    v28 = iq.gtf("gyv", gtp(int ), (int)64);
                                    continue block109;
                                }
                                case 1645933543: {
                                    v28 = iq.gtf("gyw", gtp(int ), (int)65);
                                    continue block109;
                                }
                            }
                            break;
                        }
                        v29 = iq.mc.field_1724;
                        v30 /* !! */  = iq.ae;
                        if (true) ** GOTO lbl203
                        block110: while (true) {
                            v30 /* !! */  = (long)(v31 - iq.gtf("gyx", gtp(int ), (int)66));
lbl203:
                            // 2 sources

                            switch ((int)v30 /* !! */ ) {
                                case -1306280885: {
                                    v31 = iq.gtf("gyy", gtp(int ), (int)67);
                                    continue block110;
                                }
                                case -595145807: {
                                    break block110;
                                }
                                case 922075826: {
                                    v31 = iq.gtf("gyz", gtp(int ), (int)68);
                                    continue block110;
                                }
                                case 1536020352: {
                                    v31 = iq.gtf("gza", gtp(int ), (int)69);
                                    continue block110;
                                }
                            }
                            break;
                        }
                        v32 = v29.method_33571();
                        while (true) {
                            if ((v33 /* !! */  = (cfr_temp_9 = iq.ae - iq.gtf("gzb", gtp(int ), (int)70)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                            if (v33 /* !! */  == iq.gtf("gzc", gtc(int ), (int)77)) break;
                            v33 /* !! */  = (long)iq.gtf("gzd", gtc(int ), (int)78);
                        }
                        v34 = var3_6.method_1020(v32);
                        v35 /* !! */  = iq.ae;
                        if (true) ** GOTO lbl226
                        block112: while (true) {
                            v35 /* !! */  = (long)(v36 - iq.gtf("gze", gtp(int ), (int)71));
lbl226:
                            // 2 sources

                            switch ((int)v35 /* !! */ ) {
                                case -1582445159: {
                                    v36 = iq.gtf("gzf", gtp(int ), (int)72);
                                    continue block112;
                                }
                                case -595145807: {
                                    break block112;
                                }
                                case 745424692: {
                                    v36 = iq.gtf("gzg", gtp(int ), (int)73);
                                    continue block112;
                                }
                            }
                            break;
                        }
                        return ow.fromVec3d(v34);
                    }
                }
                if (!var5_5 && !var5_5) ** break;
                ** continue;
                v37 /* !! */  = iq.ae;
                if (true) ** GOTO lbl242
                block113: while (true) {
                    v37 /* !! */  = (long)(v38 - iq.gtf("gzh", gtp(int ), (int)74));
lbl242:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -937048284: {
                            v38 = iq.gtf("gzi", gtp(int ), (int)75);
                            continue block113;
                        }
                        case -595145807: {
                            break block113;
                        }
                        case -574437362: {
                            v38 = iq.gtf("gzj", gtp(int ), (int)76);
                            continue block113;
                        }
                        case 83700072: {
                            v38 = iq.gtf("gzk", gtp(int ), (int)77);
                            continue block113;
                        }
                    }
                    break;
                }
                return ow.cameraAngle();
            }
lbl255:
            // 2 sources

            case 0: {
                var6_4 /* !! */  = (int)iq.gtf("gzl", gtc(int ), (int)79);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl284
            }
lbl260:
            // 2 sources

            case 1: {
                var6_4 /* !! */  = (int)iq.gtf("gzm", gtc(int ), (int)80);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl306
            }
lbl265:
            // 3 sources

            case 2: {
                var6_4 /* !! */  = (int)iq.gtf("gzn", gtc(int ), (int)81);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl270:
            // 2 sources

            case 3: {
                var6_4 /* !! */  = (int)iq.gtf("gzo", gtc(int ), (int)82);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 4: {
                var6_4 /* !! */  = (int)iq.gtf("gzp", gtc(int ), (int)83);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl319
            }
lbl280:
            // 2 sources

            case 5: {
                var6_4 /* !! */  = (int)iq.gtf("gzq", gtc(int ), (int)84);
                if (!var7_3) ** GOTO lbl265
                throw null;
            }
lbl284:
            // 2 sources

            case 6: {
                var6_4 /* !! */  = (int)iq.gtf("gzr", gtc(int ), (int)85);
                if (!var7_3) break;
                throw null;
            }
            case 7: {
                var6_4 /* !! */  = (int)iq.gtf("gzs", gtc(int ), (int)86);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl340
            }
            case 8: {
                var6_4 /* !! */  = (int)iq.gtf("gzt", gtc(int ), (int)87);
                if (!var7_3) ** GOTO lbl260
                throw null;
            }
            case 9: {
                var6_4 /* !! */  = (int)iq.gtf("gzu", gtc(int ), (int)88);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 10: {
                var6_4 /* !! */  = (int)iq.gtf("gzv", gtc(int ), (int)89);
                if (!var7_3) ** GOTO lbl265
                throw null;
            }
lbl306:
            // 3 sources

            case 11: {
                var6_4 /* !! */  = (int)iq.gtf("gzw", gtc(int ), (int)90);
                if (!var7_3) ** GOTO lbl270
                throw null;
            }
            case 12: {
                var6_4 /* !! */  = (int)iq.gtf("gzx", gtc(int ), (int)91);
                if (!var7_3) break;
                throw null;
            }
            case 13: {
                var6_4 /* !! */  = (int)iq.gtf("gzy", gtc(int ), (int)92);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl336
            }
lbl319:
            // 3 sources

            case 14: {
                var6_4 /* !! */  = (int)iq.gtf("gzz", gtc(int ), (int)93);
                if (!var7_3) ** GOTO lbl306
                throw null;
            }
lbl323:
            // 2 sources

            case 15: {
                var6_4 /* !! */  = (int)iq.gtf("haa", gtc(int ), (int)94);
                if (!var7_3) ** GOTO lbl319
                throw null;
            }
            case 16: {
                var6_4 /* !! */  = (int)iq.gtf("hab", gtc(int ), (int)95);
                if (!var7_3) ** GOTO lbl280
                throw null;
            }
lbl331:
            // 2 sources

            case 17: {
                var6_4 /* !! */  = (int)iq.gtf("hac", gtc(int ), (int)96);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl340
            }
lbl336:
            // 2 sources

            case 18: {
                var6_4 /* !! */  = (int)iq.gtf("had", gtc(int ), (int)97);
                if (!var7_3) ** GOTO lbl255
                throw null;
            }
lbl340:
            // 5 sources

            case 19: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_4 /* !! */  = (int)iq.gtf("hae", gtc(int ), (int)98);
                    if (!var7_3) break block24;
                    throw null;
                }
            }
            case 20: {
                var6_4 /* !! */  = (int)iq.gtf("haf", gtc(int ), (int)99);
                if (!var7_3) ** GOTO lbl340
                throw null;
            }
            case 21: 
        }
        var6_4 /* !! */  = (int)iq.gtf("hag", gtc(int ), (int)100);
        ** while (!var7_3)
lbl352:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float getHeight() {
        boolean bl2;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ae - iq.gtf("hbk", gtp(int ), (int)92)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == iq.gtf("hbl", gtc(int ), (int)116)) break;
            object = iq.gtf("hbm", gtc(int ), (int)117);
        }
        boolean bl3 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ae - iq.gtf("hbn", gtp(int ), (int)93)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == iq.gtf("hbo", gtc(int ), (int)118)) break;
            object = iq.gtf("hbp", gtc(int ), (int)119);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ae - iq.gtf("hbq", gtp(int ), (int)94)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == iq.gtf("hbr", gtc(int ), (int)120)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object = iq.gtf("hbs", gtc(int ), (int)121);
        }
        if (bl2) return (float)iq.gtf("hbt", gth(int ), (int)122);
        if (bl2) return (float)iq.gtf("hbt", gth(int ), (int)122);
        Object object = ae;
        block7: while (true) {
            switch ((int)object) {
                case -595145807: {
                    return this.height;
                }
                case 732312740: {
                    object = iq.gtf("hbv", gtp(int ), (int)96) - iq.gtf("hbu", gtp(int ), (int)95);
                    continue block7;
                }
            }
            break;
        }
        return this.height;
    }

    public static /* synthetic */ CallSite gtf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long gtp(int n2) {
        return gtq[n2] ^ gtr[n2];
    }

    private static /* synthetic */ void hce() {
        iq.gtq[0] = 7736963866157092940L;
        iq.gtq[1] = -3433196299760706764L;
        iq.gtq[2] = -1846979350994450653L;
        iq.gtq[3] = -3017096611967312459L;
        iq.gtq[4] = -2444555290420689445L;
        iq.gtq[5] = 1114795244010612990L;
        iq.gtq[6] = 1079644594734114776L;
        iq.gtq[7] = -9211243402809195719L;
        iq.gtq[8] = 8554914951466628245L;
        iq.gtq[9] = 67775604269349873L;
        iq.gtq[10] = -4531879391475983526L;
        iq.gtq[11] = 3792528919673138838L;
        iq.gtq[12] = -1811253048566218249L;
        iq.gtq[13] = -2497886546231217553L;
        iq.gtq[14] = 8394130375911268837L;
        iq.gtq[15] = 3015168081643081859L;
        iq.gtq[16] = 3708208354886484887L;
        iq.gtq[17] = -9178022762780705186L;
        iq.gtq[18] = -5229944988725564065L;
        iq.gtq[19] = 901463818278351106L;
        iq.gtq[20] = -5215920893621108743L;
        iq.gtq[21] = -7145056464396958970L;
        iq.gtq[22] = -6352004888266474035L;
        iq.gtq[23] = 7091598313286010344L;
        iq.gtq[24] = 4590813195568352482L;
        iq.gtq[25] = 911008142574464479L;
        iq.gtq[26] = -1490687946815776305L;
        iq.gtq[27] = -8473795363180414179L;
        iq.gtq[28] = -5068700466051092747L;
        iq.gtq[29] = 5617089177676108825L;
        iq.gtq[30] = -1601443057189404827L;
        iq.gtq[31] = 9113487867579904411L;
        iq.gtq[32] = -2904975585252284905L;
        iq.gtq[33] = -358771777401949768L;
        iq.gtq[34] = 1128418468051137008L;
        iq.gtq[35] = -8910143199755076272L;
        iq.gtq[36] = -3270640683557701401L;
        iq.gtq[37] = -2021769532971327236L;
        iq.gtq[38] = 4888351273319072246L;
        iq.gtq[39] = -4180814920046437687L;
        iq.gtq[40] = -8968191426343576302L;
        iq.gtq[41] = 5478327640433665460L;
        iq.gtq[42] = -332552698659491769L;
        iq.gtq[43] = 8176926239538333668L;
        iq.gtq[44] = -7085934116854510121L;
        iq.gtq[45] = -7531977994284303225L;
        iq.gtq[46] = 4344689681398422959L;
        iq.gtq[47] = 5856697160890622632L;
        iq.gtq[48] = -5071284508525537665L;
        iq.gtq[49] = -796755419728659192L;
        iq.gtq[50] = 1174539041474570953L;
        iq.gtq[51] = -6863894451249558425L;
        iq.gtq[52] = -2691193590251053139L;
        iq.gtq[53] = -3663221598500855713L;
        iq.gtq[54] = 1914718442064165450L;
        iq.gtq[55] = -5488914761173353041L;
        iq.gtq[56] = 3854155997825718753L;
        iq.gtq[57] = 5295329836850839932L;
        iq.gtq[58] = 3887569703079504829L;
        iq.gtq[59] = -5746122442074122692L;
        iq.gtq[60] = -8387453846720039120L;
        iq.gtq[61] = 5595964510168699683L;
        iq.gtq[62] = -2001588396002799654L;
        iq.gtq[63] = -8427602644007224398L;
        iq.gtq[64] = 7858474369060131417L;
        iq.gtq[65] = -5239906237083165218L;
        iq.gtq[66] = 5898147473544030402L;
        iq.gtq[67] = 6615630591694996219L;
        iq.gtq[68] = -6287767030439041124L;
        iq.gtq[69] = 4053897406344916677L;
        iq.gtq[70] = -102803910318860705L;
        iq.gtq[71] = 8825719454620112768L;
        iq.gtq[72] = -950665575438062325L;
        iq.gtq[73] = -8451804158358821314L;
        iq.gtq[74] = -4780604078062933012L;
        iq.gtq[75] = -5836958608798035415L;
        iq.gtq[76] = 7997429008208769762L;
        iq.gtq[77] = 796385169362427570L;
        iq.gtq[78] = 2697758435258734668L;
        iq.gtq[79] = 2728816861267697607L;
        iq.gtq[80] = -3018306004873189899L;
        iq.gtq[81] = 6747698957384446122L;
        iq.gtq[82] = 4810782046925724003L;
        iq.gtq[83] = -71664754197639786L;
        iq.gtq[84] = -7804036192199539115L;
        iq.gtq[85] = -8025165799693766312L;
        iq.gtq[86] = -3971599046918540215L;
        iq.gtq[87] = -2931555314361833065L;
        iq.gtq[88] = 8238929078809264962L;
        iq.gtq[89] = 5475995047544613723L;
        iq.gtq[90] = 8629037977655514307L;
        iq.gtq[91] = 4589184331979912772L;
        iq.gtq[92] = 6995540187045737875L;
        iq.gtq[93] = 7131801252128571752L;
        iq.gtq[94] = -7629382260455264496L;
        iq.gtq[95] = 4149197909402035098L;
        iq.gtq[96] = 71068828138754194L;
    }

    private static /* synthetic */ void hcd() {
        iq.gte[100] = -1214496498;
        iq.gte[101] = 1194266622;
        iq.gte[102] = 1721409333;
        iq.gte[103] = -78210516;
        iq.gte[104] = -214671501;
        iq.gte[105] = -2049641520;
        iq.gte[106] = 1022477306;
        iq.gte[107] = 1713692842;
        iq.gte[108] = 1122957135;
        iq.gte[109] = -2082150707;
        iq.gte[110] = -773163437;
        iq.gte[111] = -1344717471;
        iq.gte[112] = -500368253;
        iq.gte[113] = 505152061;
        iq.gte[114] = -412475878;
        iq.gte[115] = 618841381;
        iq.gte[116] = 38634538;
        iq.gte[117] = -523634533;
        iq.gte[118] = -1817703278;
        iq.gte[119] = 497986170;
        iq.gte[120] = 395468110;
        iq.gte[121] = -100824416;
        iq.gte[122] = -1062937546;
        iq.gte[123] = 1223974595;
        iq.gte[124] = -904103725;
        iq.gte[125] = 1378441227;
        iq.gte[126] = 487910897;
    }

    static {
        gtd = new int[127];
        gte = new int[127];
        iq.hca();
        iq.hcb();
        iq.hcc();
        iq.hcd();
        gtq = new long[97];
        gtr = new long[97];
        iq.hce();
        iq.hcf();
        mc = class_310.method_1551();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_243 getTargetPosition(class_1309 var1_1, it$Stage var2_2) {
        block57: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = iq.ae - iq.gtf("gve", gtp(int ), (int)16)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v0 /* !! */  == iq.gtf("gvf", gtc(int ), (int)30)) break;
                v0 /* !! */  = (long)iq.gtf("gvg", gtc(int ), (int)31);
            }
            var5_3 = iq.c;
            v1 /* !! */  = iq.ae;
            if (true) ** GOTO lbl12
            block26: while (true) {
                v1 /* !! */  = (long)(v2 - iq.gtf("gvh", gtp(int ), (int)17));
lbl12:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -595145807: {
                        break block26;
                    }
                    case 145125265: {
                        v2 = iq.gtf("gvi", gtp(int ), (int)18);
                        continue block26;
                    }
                    case 969318710: {
                        v2 = iq.gtf("gvj", gtp(int ), (int)19);
                        continue block26;
                    }
                }
                break;
            }
            var4_4 /* !! */  = iq.b;
            v3 /* !! */  = iq.ae;
            if (true) ** GOTO lbl26
            block27: while (true) {
                v3 /* !! */  = (long)(iq.gtf("gvl", gtp(int ), (int)21) - iq.gtf("gvk", gtp(int ), (int)20));
lbl26:
                // 2 sources

                switch ((int)v3 /* !! */ ) {
                    case -595145807: {
                        break block27;
                    }
                    case 1559430246: {
                        continue block27;
                    }
                }
                break;
            }
            var3_5 = iq.a;
            if (var5_3) {
                throw null;
lbl34:
                // 7 sources

                return null;
            }
            if (var3_5 || var3_5) ** GOTO lbl34
            if (var1_1 != null) break block57;
            if (var3_5 || var3_5) ** GOTO lbl34
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = iq.ae - iq.gtf("gvm", gtp(int ), (int)22)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == iq.gtf("gvn", gtc(int ), (int)32)) break;
                v4 /* !! */  = (long)iq.gtf("gvo", gtc(int ), (int)33);
            }
            return class_243.field_1353;
        }
        if (var3_5 || var3_5) ** GOTO lbl34
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_2 = iq.ae - iq.gtf("gvp", gtp(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == iq.gtf("gvq", gtc(int ), (int)34)) break;
            v5 /* !! */  = (long)iq.gtf("gvr", gtc(int ), (int)35);
        }
        if (!this.predictionEnabled) ** GOTO lbl87
        if (var3_5) ** GOTO lbl34
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_3 = iq.ae - iq.gtf("gvs", gtp(int ), (int)24)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v6 /* !! */  == iq.gtf("gvt", gtc(int ), (int)36)) break;
            v6 /* !! */  = (long)iq.gtf("gvu", gtc(int ), (int)37);
        }
        while (true) {
            if ((v7 /* !! */  = (cfr_temp_4 = iq.ae - iq.gtf("gvv", gtp(int ), (int)25)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v7 /* !! */  == iq.gtf("gvw", gtc(int ), (int)38)) break;
            v7 /* !! */  = (long)iq.gtf("gvx", gtc(int ), (int)39);
        }
        if (!this.predictor.isMoving()) ** GOTO lbl87
        if (var3_5) ** GOTO lbl34
        if (var4_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_5) ** GOTO lbl34
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_5 = iq.ae - iq.gtf("gvy", gtp(int ), (int)26)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v8 /* !! */  == iq.gtf("gvz", gtc(int ), (int)40)) break;
                    v8 /* !! */  = (long)iq.gtf("gwa", gtc(int ), (int)41);
                }
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_6 = iq.ae - iq.gtf("gwb", gtp(int ), (int)27)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v9 /* !! */  == iq.gtf("gwc", gtc(int ), (int)42)) break;
                    v9 /* !! */  = (long)iq.gtf("gwd", gtc(int ), (int)43);
                }
                return this.predictor.getPredictedPosition(var1_1, var2_2);
            }
lbl87:
            // 2 sources

            if (!var3_5 && !var3_5) ** break;
            ** continue;
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_7 = iq.ae - iq.gtf("gwe", gtp(int ), (int)28)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v10 /* !! */  == iq.gtf("gwf", gtc(int ), (int)44)) break;
                v10 /* !! */  = (long)iq.gtf("gwg", gtc(int ), (int)45);
            }
            return var1_1.method_33571();
lbl96:
            // 2 sources

            case 0: {
                var4_4 /* !! */  = (int)iq.gtf("gwh", gtc(int ), (int)46);
                if (!var5_3) break;
                throw null;
            }
            case 1: {
                var4_4 /* !! */  = (int)iq.gtf("gwi", gtc(int ), (int)47);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl124
            }
lbl105:
            // 3 sources

            case 2: {
                var4_4 /* !! */  = (int)iq.gtf("gwj", gtc(int ), (int)48);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl134
            }
lbl110:
            // 2 sources

            case 3: {
                var4_4 /* !! */  = (int)iq.gtf("gwk", gtc(int ), (int)49);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 4: {
                var4_4 /* !! */  = (int)iq.gtf("gwl", gtc(int ), (int)50);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl143
            }
            case 5: {
                var4_4 /* !! */  = (int)iq.gtf("gwm", gtc(int ), (int)51);
                if (!var5_3) ** GOTO lbl110
                throw null;
            }
lbl124:
            // 3 sources

            case 6: {
                var4_4 /* !! */  = (int)iq.gtf("gwn", gtc(int ), (int)52);
                if (var5_3) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 7: {
                do {
                    var4_4 /* !! */  = (int)iq.gtf("gwo", gtc(int ), (int)53);
                } while (!var5_3);
                throw null;
            }
lbl134:
            // 2 sources

            case 8: {
                do {
                    var4_4 /* !! */  = (int)iq.gtf("gwp", gtc(int ), (int)54);
                } while (!var5_3);
                throw null;
            }
            case 9: {
                var4_4 /* !! */  = (int)iq.gtf("gwq", gtc(int ), (int)55);
                if (!var5_3) ** GOTO lbl96
                throw null;
            }
lbl143:
            // 3 sources

            case 10: {
                var4_4 /* !! */  = (int)iq.gtf("gwr", gtc(int ), (int)56);
                if (!var5_3) ** GOTO lbl105
                throw null;
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_4 /* !! */  = (int)iq.gtf("gws", gtc(int ), (int)57);
                    if (!var5_3) ** GOTO lbl105
                    throw null;
                }
            }
lbl152:
            // 2 sources

            case 12: {
                var4_4 /* !! */  = (int)iq.gtf("gwt", gtc(int ), (int)58);
                if (!var5_3) ** GOTO lbl124
                throw null;
            }
            case 13: 
        }
        var4_4 /* !! */  = (int)iq.gtf("gwu", gtc(int ), (int)59);
        ** while (!var5_3)
lbl159:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ir getPredictor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iq.ae - iq.gtf("hah", gtp(int ), (int)78)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iq.gtf("hai", gtc(int ), (int)101)) break;
            v0 /* !! */  = (long)iq.gtf("haj", gtc(int ), (int)102);
        }
        var3_1 = iq.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = iq.ae - iq.gtf("hak", gtp(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == iq.gtf("hal", gtc(int ), (int)103)) break;
            v1 /* !! */  = (long)iq.gtf("ham", gtc(int ), (int)104);
        }
        var2_2 = iq.b;
        v2 /* !! */  = iq.ae;
        if (true) ** GOTO lbl19
        block11: while (true) {
            v2 /* !! */  = (long)(v3 - iq.gtf("han", gtp(int ), (int)80));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -595145807: {
                    break block11;
                }
                case 553143109: {
                    v3 = iq.gtf("hao", gtp(int ), (int)81);
                    continue block11;
                }
                case 1909978920: {
                    v3 = iq.gtf("hap", gtp(int ), (int)82);
                    continue block11;
                }
            }
            break;
        }
        var1_3 = iq.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        v4 /* !! */  = iq.ae;
        if (true) ** GOTO lbl38
        block13: while (true) {
            v4 /* !! */  = (long)(iq.gtf("har", gtp(int ), (int)84) - iq.gtf("haq", gtp(int ), (int)83));
lbl38:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1374241280: {
                    continue block13;
                }
                case -595145807: {
                    break block13;
                }
            }
            break;
        }
        return this.predictor;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void setHeight(float var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iq.ae - iq.gtf("guk", gtp(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iq.gtf("gul", gtc(int ), (int)20)) break;
            v0 /* !! */  = (long)iq.gtf("gum", gtc(int ), (int)21);
        }
        var4_2 = iq.c;
        v1 /* !! */  = iq.ae;
        if (true) ** GOTO lbl12
        block21: while (true) {
            v1 /* !! */  = (long)(v2 - iq.gtf("gun", gtp(int ), (int)7));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -595145807: {
                    break block21;
                }
                case 405380368: {
                    v2 = iq.gtf("guo", gtp(int ), (int)8);
                    continue block21;
                }
                case 1392475908: {
                    v2 = iq.gtf("gup", gtp(int ), (int)9);
                    continue block21;
                }
                case 1785961492: {
                    v2 = iq.gtf("guq", gtp(int ), (int)10);
                    continue block21;
                }
            }
            break;
        }
        var3_3 /* !! */  = iq.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = iq.ae - iq.gtf("gur", gtp(int ), (int)11)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == iq.gtf("gus", gtc(int ), (int)22)) break;
            v3 /* !! */  = (long)iq.gtf("gut", gtc(int ), (int)23);
        }
        var2_4 = iq.a;
        if (var4_2) {
            throw null;
lbl34:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl34
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl34
                v4 /* !! */  = iq.ae;
                if (true) ** GOTO lbl45
                block24: while (true) {
                    v4 /* !! */  = (long)(v5 - iq.gtf("guu", gtp(int ), (int)12));
lbl45:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1628877308: {
                            v5 = iq.gtf("guv", gtp(int ), (int)13);
                            continue block24;
                        }
                        case -1497617895: {
                            v5 = iq.gtf("guw", gtp(int ), (int)14);
                            continue block24;
                        }
                        case -595145807: {
                            break block24;
                        }
                        case 394102694: {
                            v5 = iq.gtf("gux", gtp(int ), (int)15);
                            continue block24;
                        }
                    }
                    break;
                }
                this.height = var1_1;
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var3_3 /* !! */  = (int)iq.gtf("guy", gtc(int ), (int)24);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl79
            }
            case 1: {
                var3_3 /* !! */  = (int)iq.gtf("guz", gtc(int ), (int)25);
                if (var4_2) {
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)iq.gtf("gva", gtc(int ), (int)26);
                } while (!var4_2);
                throw null;
            }
lbl75:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)iq.gtf("gvb", gtc(int ), (int)27);
                if (var4_2) {
                    throw null;
                }
            }
lbl79:
            // 4 sources

            case 4: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)iq.gtf("gvc", gtc(int ), (int)28);
                    if (!var4_2) ** GOTO lbl75
                    throw null;
                }
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)iq.gtf("gvd", gtc(int ), (int)29);
        ** while (!var4_2)
lbl87:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void hcb() {
        iq.gtd[100] = -1214496481;
        iq.gtd[101] = -1194266623;
        iq.gtd[102] = -1802484164;
        iq.gtd[103] = 78210515;
        iq.gtd[104] = -1924064383;
        iq.gtd[105] = -2049641518;
        iq.gtd[106] = 1022477306;
        iq.gtd[107] = 1713692841;
        iq.gtd[108] = 1122957134;
        iq.gtd[109] = -2082150708;
        iq.gtd[110] = -343867224;
        iq.gtd[111] = -1344717471;
        iq.gtd[112] = -500368256;
        iq.gtd[113] = 505152062;
        iq.gtd[114] = -412475879;
        iq.gtd[115] = 618841381;
        iq.gtd[116] = -38634539;
        iq.gtd[117] = -833645219;
        iq.gtd[118] = 1817703277;
        iq.gtd[119] = -1068178461;
        iq.gtd[120] = -395468111;
        iq.gtd[121] = 2101878656;
        iq.gtd[122] = -49656258;
        iq.gtd[123] = 1223974595;
        iq.gtd[124] = -904103726;
        iq.gtd[125] = 1378441224;
        iq.gtd[126] = 487910896;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isPredictionEnabled() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = iq.ae - iq.gtf("haw", gtp(int ), (int)85)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == iq.gtf("hax", gtc(int ), (int)109)) break;
            v0 /* !! */  = (long)iq.gtf("hay", gtc(int ), (int)110);
        }
        var3_1 = iq.c;
        v1 /* !! */  = iq.ae;
        if (true) ** GOTO lbl12
        block19: while (true) {
            v1 /* !! */  = (long)(iq.gtf("hba", gtp(int ), (int)87) - iq.gtf("haz", gtp(int ), (int)86));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -595145807: {
                    break block19;
                }
                case 2138840287: {
                    continue block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = iq.b;
        v2 /* !! */  = iq.ae;
        if (true) ** GOTO lbl22
        block20: while (true) {
            v2 /* !! */  = (long)(iq.gtf("hbc", gtp(int ), (int)89) - iq.gtf("hbb", gtp(int ), (int)88));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -595145807: {
                    break block20;
                }
                case 151415537: {
                    continue block20;
                }
            }
            break;
        }
        var1_3 = iq.a;
        if (var3_1) {
            throw null;
lbl30:
            // 2 sources

            return (boolean)iq.gtf("hbd", gtc(int ), (int)111);
        }
        if (var1_3) ** GOTO lbl30
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** continue;
                v3 /* !! */  = iq.ae;
                if (true) ** GOTO lbl41
                block22: while (true) {
                    v3 /* !! */  = (long)(iq.gtf("hbf", gtp(int ), (int)91) - iq.gtf("hbe", gtp(int ), (int)90));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -595145807: {
                            break block22;
                        }
                        case 1172683516: {
                            continue block22;
                        }
                    }
                    break;
                }
                return this.predictionEnabled;
            }
lbl47:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)iq.gtf("hbg", gtc(int ), (int)112);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl56
            }
            case 1: {
                var2_2 /* !! */  = (int)iq.gtf("hbh", gtc(int ), (int)113);
                if (!var3_1) break;
                throw null;
            }
lbl56:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)iq.gtf("hbi", gtc(int ), (int)114);
                if (!var3_1) ** GOTO lbl47
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)iq.gtf("hbj", gtc(int ), (int)115);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int gtc(int n2) {
        return gtd[n2] ^ gte[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setPredictionEnabled(boolean bl2) {
        boolean bl3;
        while (true) {
            long l2;
            Object object;
            if ((object = (l2 = ae - iq.gtf("gts", gtp(int ), (int)0)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object == iq.gtf("gtt", gtc(int ), (int)8)) break;
            object = iq.gtf("gtu", gtc(int ), (int)9);
        }
        boolean bl4 = c;
        while (true) {
            long l3;
            Object object;
            if ((object = (l3 = ae - iq.gtf("gtv", gtp(int ), (int)1)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object == iq.gtf("gtw", gtc(int ), (int)10)) break;
            object = iq.gtf("gtx", gtc(int ), (int)11);
        }
        int n2 = b;
        while (true) {
            long l4;
            Object object;
            if ((object = (l4 = ae - iq.gtf("gty", gtp(int ), (int)2)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object == iq.gtf("gtz", gtc(int ), (int)12)) {
                bl3 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object = iq.gtf("gua", gtc(int ), (int)13);
        }
        if (bl3 || bl3) return;
        Object object = ae;
        boolean bl5 = true;
        block8: while (true) {
            CallSite callSite;
            if (!bl5 || (bl5 = false) || !true) {
                object = callSite - iq.gtf("gub", gtp(int ), (int)3);
            }
            switch ((int)object) {
                case -595145807: {
                    break block8;
                }
                case -547032038: {
                    callSite = iq.gtf("guc", gtp(int ), (int)4);
                    continue block8;
                }
                case 1072454249: {
                    callSite = iq.gtf("gud", gtp(int ), (int)5);
                    continue block8;
                }
            }
            break;
        }
        this.predictionEnabled = bl2;
        if (!bl3 && !bl3) return;
    }

    private static /* synthetic */ float gth(int n2) {
        return Float.intBitsToFloat(gtd[n2] ^ gte[n2]);
    }

    private static /* synthetic */ void hca() {
        iq.gtd[0] = -2008488506;
        iq.gtd[1] = -1732511206;
        iq.gtd[2] = -1199389617;
        iq.gtd[3] = 2081769640;
        iq.gtd[4] = 1362596530;
        iq.gtd[5] = 1956751582;
        iq.gtd[6] = -1351635788;
        iq.gtd[7] = -1878575625;
        iq.gtd[8] = -2008246660;
        iq.gtd[9] = -169163527;
        iq.gtd[10] = 2013843063;
        iq.gtd[11] = 994791477;
        iq.gtd[12] = 1211286098;
        iq.gtd[13] = 239037564;
        iq.gtd[14] = 423089691;
        iq.gtd[15] = 1821452709;
        iq.gtd[16] = -266981498;
        iq.gtd[17] = 914687389;
        iq.gtd[18] = 645593484;
        iq.gtd[19] = -465573632;
        iq.gtd[20] = -727026151;
        iq.gtd[21] = 1704565376;
        iq.gtd[22] = 270240439;
        iq.gtd[23] = 1311430947;
        iq.gtd[24] = 741345353;
        iq.gtd[25] = -1328230495;
        iq.gtd[26] = 609821886;
        iq.gtd[27] = -594149239;
        iq.gtd[28] = -1367929832;
        iq.gtd[29] = 1609972516;
        iq.gtd[30] = -1121522958;
        iq.gtd[31] = -203163605;
        iq.gtd[32] = -2090534927;
        iq.gtd[33] = -818752640;
        iq.gtd[34] = 89130265;
        iq.gtd[35] = 1065983879;
        iq.gtd[36] = -1632122028;
        iq.gtd[37] = 1264543231;
        iq.gtd[38] = 52403105;
        iq.gtd[39] = -851569976;
        iq.gtd[40] = -1814328916;
        iq.gtd[41] = -1106499469;
        iq.gtd[42] = -1499172868;
        iq.gtd[43] = -491057343;
        iq.gtd[44] = 1317571294;
        iq.gtd[45] = 247321495;
        iq.gtd[46] = 2108467203;
        iq.gtd[47] = 421057895;
        iq.gtd[48] = -1374901777;
        iq.gtd[49] = 1889112106;
        iq.gtd[50] = 1593106007;
        iq.gtd[51] = 892052211;
        iq.gtd[52] = -2047220021;
        iq.gtd[53] = 1840912169;
        iq.gtd[54] = -1373349040;
        iq.gtd[55] = -381438256;
        iq.gtd[56] = -170217229;
        iq.gtd[57] = -957356701;
        iq.gtd[58] = -1283872357;
        iq.gtd[59] = 340415745;
        iq.gtd[60] = 2129015557;
        iq.gtd[61] = -1413458131;
        iq.gtd[62] = 2032838954;
        iq.gtd[63] = -1589427018;
        iq.gtd[64] = -533578711;
        iq.gtd[65] = -1195002764;
        iq.gtd[66] = -971030330;
        iq.gtd[67] = 1614617274;
        iq.gtd[68] = 1931238125;
        iq.gtd[69] = -1337229455;
        iq.gtd[70] = 744579265;
        iq.gtd[71] = 1092930288;
        iq.gtd[72] = -1709942365;
        iq.gtd[73] = -1289559258;
        iq.gtd[74] = 249443843;
        iq.gtd[75] = -318438280;
        iq.gtd[76] = -380622918;
        iq.gtd[77] = -1837158074;
        iq.gtd[78] = 1465354818;
        iq.gtd[79] = -1229150579;
        iq.gtd[80] = -2124268722;
        iq.gtd[81] = 1217424483;
        iq.gtd[82] = -964536605;
        iq.gtd[83] = 372747304;
        iq.gtd[84] = 676902668;
        iq.gtd[85] = 1075094092;
        iq.gtd[86] = 213113824;
        iq.gtd[87] = -1636939672;
        iq.gtd[88] = 661435656;
        iq.gtd[89] = 411408570;
        iq.gtd[90] = -1939529984;
        iq.gtd[91] = 1585924531;
        iq.gtd[92] = -1791597691;
        iq.gtd[93] = 1812131309;
        iq.gtd[94] = -1777007605;
        iq.gtd[95] = -1654345566;
        iq.gtd[96] = -749400998;
        iq.gtd[97] = 1627172156;
        iq.gtd[98] = 938808323;
        iq.gtd[99] = -511463843;
    }

    private static /* synthetic */ void hcf() {
        iq.gtr[0] = -3138045502055203402L;
        iq.gtr[1] = 195997085223933621L;
        iq.gtr[2] = 4799002174076008462L;
        iq.gtr[3] = -8266133003360902152L;
        iq.gtr[4] = -4436664638927468018L;
        iq.gtr[5] = 560220332162698456L;
        iq.gtr[6] = -1364855336731077521L;
        iq.gtr[7] = -5027858240477541500L;
        iq.gtr[8] = 4956981733805293253L;
        iq.gtr[9] = -7830422952564339631L;
        iq.gtr[10] = -5052378496414411811L;
        iq.gtr[11] = -1466791727446484759L;
        iq.gtr[12] = -2922867171927337056L;
        iq.gtr[13] = -8657853326050799621L;
        iq.gtr[14] = 92465091085282545L;
        iq.gtr[15] = -7882149648450076303L;
        iq.gtr[16] = 2179190764488110464L;
        iq.gtr[17] = -2646457048107175475L;
        iq.gtr[18] = 4383740191166305266L;
        iq.gtr[19] = -5495227761704630358L;
        iq.gtr[20] = 434719431138593932L;
        iq.gtr[21] = -9179668800869251629L;
        iq.gtr[22] = -6096995220391764699L;
        iq.gtr[23] = -4743439570577193164L;
        iq.gtr[24] = 7806524363902835317L;
        iq.gtr[25] = 3599659649422207760L;
        iq.gtr[26] = 1220456334474692089L;
        iq.gtr[27] = -5156858860127942759L;
        iq.gtr[28] = 5293650477213235374L;
        iq.gtr[29] = -6428276086291475618L;
        iq.gtr[30] = -2866001480655845335L;
        iq.gtr[31] = -5424447833540145477L;
        iq.gtr[32] = -1950558254204446814L;
        iq.gtr[33] = -5267447860075523752L;
        iq.gtr[34] = -7597240674457075585L;
        iq.gtr[35] = 738334524226880658L;
        iq.gtr[36] = -1890534391001131968L;
        iq.gtr[37] = 2271223262962455750L;
        iq.gtr[38] = -879225470883006187L;
        iq.gtr[39] = -4754249935454974504L;
        iq.gtr[40] = -1015383281513122970L;
        iq.gtr[41] = 8501868630995106433L;
        iq.gtr[42] = 7809235052833950896L;
        iq.gtr[43] = -5864322989397874371L;
        iq.gtr[44] = -2124386831659429511L;
        iq.gtr[45] = -1895825965190131047L;
        iq.gtr[46] = -2985589006439059901L;
        iq.gtr[47] = 1774124656923761850L;
        iq.gtr[48] = -908771435342414706L;
        iq.gtr[49] = 8318871210281763790L;
        iq.gtr[50] = -7307330785127604337L;
        iq.gtr[51] = 7073336741104345369L;
        iq.gtr[52] = 6131626816380326235L;
        iq.gtr[53] = 5339799730295309312L;
        iq.gtr[54] = 7246451643988132738L;
        iq.gtr[55] = -5642694226753453707L;
        iq.gtr[56] = 5634722235301418991L;
        iq.gtr[57] = 5489828091954070745L;
        iq.gtr[58] = 5282708676082870641L;
        iq.gtr[59] = -6677308751083334254L;
        iq.gtr[60] = -2583171485137386117L;
        iq.gtr[61] = 6499624493779241506L;
        iq.gtr[62] = 7969443159940700277L;
        iq.gtr[63] = -3882503106086554949L;
        iq.gtr[64] = 2049231346846062457L;
        iq.gtr[65] = 1360457813672239411L;
        iq.gtr[66] = -638734667785812492L;
        iq.gtr[67] = 1265736792267888480L;
        iq.gtr[68] = -2319208060781221231L;
        iq.gtr[69] = -2927464157042486009L;
        iq.gtr[70] = 7917714945159979323L;
        iq.gtr[71] = 5236983668485908909L;
        iq.gtr[72] = -2219837020657455702L;
        iq.gtr[73] = -7580933864608969911L;
        iq.gtr[74] = 5643353049947983709L;
        iq.gtr[75] = -5745232686822759895L;
        iq.gtr[76] = -5831665116467845857L;
        iq.gtr[77] = 8563322166232967540L;
        iq.gtr[78] = 1623846991478905671L;
        iq.gtr[79] = 54928908110712971L;
        iq.gtr[80] = -3012202519773374157L;
        iq.gtr[81] = 7314436031199781883L;
        iq.gtr[82] = -244778758950240545L;
        iq.gtr[83] = -756843203183789501L;
        iq.gtr[84] = -9182612532615370168L;
        iq.gtr[85] = 3673113981291887417L;
        iq.gtr[86] = -8288799880087927304L;
        iq.gtr[87] = 8864267105571794626L;
        iq.gtr[88] = 5616491715168963779L;
        iq.gtr[89] = -4507540973083822350L;
        iq.gtr[90] = -6957066727114322616L;
        iq.gtr[91] = -8280583486414011032L;
        iq.gtr[92] = -3893488027903097763L;
        iq.gtr[93] = 5392125764096462605L;
        iq.gtr[94] = -8013784039361471272L;
        iq.gtr[95] = -3201624394279741322L;
        iq.gtr[96] = 2087674483380599828L;
    }

    private static /* synthetic */ void hcc() {
        iq.gte[0] = -2008488506;
        iq.gte[1] = -649332198;
        iq.gte[2] = -1199389619;
        iq.gte[3] = 2081769640;
        iq.gte[4] = 1362596530;
        iq.gte[5] = 1956751581;
        iq.gte[6] = -1351635787;
        iq.gte[7] = -1878575630;
        iq.gte[8] = 2008246659;
        iq.gte[9] = 187807737;
        iq.gte[10] = -2013843064;
        iq.gte[11] = -2057648289;
        iq.gte[12] = -1211286099;
        iq.gte[13] = -898345134;
        iq.gte[14] = 423089689;
        iq.gte[15] = 1821452709;
        iq.gte[16] = -266981502;
        iq.gte[17] = 914687390;
        iq.gte[18] = 645593486;
        iq.gte[19] = -465573630;
        iq.gte[20] = 727026150;
        iq.gte[21] = 915747114;
        iq.gte[22] = -270240440;
        iq.gte[23] = -1787035164;
        iq.gte[24] = 741345355;
        iq.gte[25] = -1328230494;
        iq.gte[26] = 609821882;
        iq.gte[27] = -594149239;
        iq.gte[28] = -1367929832;
        iq.gte[29] = 1609972518;
        iq.gte[30] = 1121522957;
        iq.gte[31] = 1569891393;
        iq.gte[32] = 2090534926;
        iq.gte[33] = 815294349;
        iq.gte[34] = -89130266;
        iq.gte[35] = -363861783;
        iq.gte[36] = 1632122027;
        iq.gte[37] = -280027319;
        iq.gte[38] = -52403106;
        iq.gte[39] = -723118557;
        iq.gte[40] = 1814328915;
        iq.gte[41] = -603982844;
        iq.gte[42] = 1499172867;
        iq.gte[43] = -405951528;
        iq.gte[44] = -1317571295;
        iq.gte[45] = 1251212904;
        iq.gte[46] = 2108467206;
        iq.gte[47] = 421057903;
        iq.gte[48] = -1374901782;
        iq.gte[49] = 1889112099;
        iq.gte[50] = 1593106002;
        iq.gte[51] = 892052210;
        iq.gte[52] = -2047220031;
        iq.gte[53] = 1840912160;
        iq.gte[54] = -1373349030;
        iq.gte[55] = -381438254;
        iq.gte[56] = -170217222;
        iq.gte[57] = -957356701;
        iq.gte[58] = -1283872359;
        iq.gte[59] = 340415756;
        iq.gte[60] = -2129015558;
        iq.gte[61] = 1206198785;
        iq.gte[62] = -2032838955;
        iq.gte[63] = -293850122;
        iq.gte[64] = 533578710;
        iq.gte[65] = -966523481;
        iq.gte[66] = 971030329;
        iq.gte[67] = -1614617275;
        iq.gte[68] = 455942633;
        iq.gte[69] = 1337229454;
        iq.gte[70] = 1510765579;
        iq.gte[71] = 1092930289;
        iq.gte[72] = 280223093;
        iq.gte[73] = -1289559257;
        iq.gte[74] = 1141844319;
        iq.gte[75] = 318438279;
        iq.gte[76] = 2135910239;
        iq.gte[77] = -1837158073;
        iq.gte[78] = 1040462989;
        iq.gte[79] = -1229150585;
        iq.gte[80] = -2124268709;
        iq.gte[81] = 1217424492;
        iq.gte[82] = -964536590;
        iq.gte[83] = 372747323;
        iq.gte[84] = 676902684;
        iq.gte[85] = 1075094088;
        iq.gte[86] = 213113825;
        iq.gte[87] = -1636939678;
        iq.gte[88] = 661435656;
        iq.gte[89] = 411408575;
        iq.gte[90] = -1939529976;
        iq.gte[91] = 1585924534;
        iq.gte[92] = -1791597684;
        iq.gte[93] = 1812131298;
        iq.gte[94] = -1777007603;
        iq.gte[95] = -1654345561;
        iq.gte[96] = -749401000;
        iq.gte[97] = 1627172145;
        iq.gte[98] = 938808323;
        iq.gte[99] = -511463842;
    }

    public iq(ir ir2) {
        int n2 = b;
        this.predictionEnabled = iq.gtf("gtg", gtc(int ), (int)0);
        this.height = (float)iq.gtf("gti", gth(int ), (int)1);
        this.predictor = ir2;
    }
}

