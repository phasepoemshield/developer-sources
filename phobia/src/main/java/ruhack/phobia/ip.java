/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_2868
 *  net.minecraft.class_310
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
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2868;
import net.minecraft.class_310;
import ruhack.phobia.nv;

public class ip {
    private static long[] hkk;
    public static final int b;
    public static final long ag = 4314728068723542537L;
    private static int[] hiq;
    public static final boolean a;
    private static long[] hkj;
    public static final boolean c;
    private static final class_310 mc;
    private static final double MAX_ATTACK_RANGE = 6.0;
    private static int[] hir;
    private int savedSlot;
    private static final double ATTACK_RANGE = 4.5;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean shouldAttack(class_1309 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ip.ag - ip.his("hmb", hki(int ), (int)18)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ip.his("hmc", hip(int ), (int)65)) break;
            v0 /* !! */  = (long)ip.his("hmd", hip(int ), (int)66);
        }
        var8_2 = ip.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ip.ag - ip.his("hme", hki(int ), (int)19)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ip.his("hmf", hip(int ), (int)67)) break;
            v1 /* !! */  = (long)ip.his("hmg", hip(int ), (int)68);
        }
        var7_3 /* !! */  = ip.b;
        v2 /* !! */  = ip.ag;
        if (true) ** GOTO lbl17
        block73: while (true) {
            v2 /* !! */  = (long)(ip.his("hmi", hki(int ), (int)21) - ip.his("hmh", hki(int ), (int)20));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2019632789: {
                    continue block73;
                }
                case 1856801289: {
                    break block73;
                }
            }
            break;
        }
        var6_4 = ip.a;
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_2) {
                    throw null;
lbl28:
                    // 14 sources

                    return (boolean)ip.his("hmj", hip(int ), (int)69);
                }
                if (var6_4 || var6_4) ** GOTO lbl28
                v3 /* !! */  = ip.ag;
                if (true) ** GOTO lbl35
                block75: while (true) {
                    v3 /* !! */  = (long)(v4 - ip.his("hmk", hki(int ), (int)22));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case 1070649413: {
                            v4 = ip.his("hml", hki(int ), (int)23);
                            continue block75;
                        }
                        case 1331886259: {
                            v4 = ip.his("hmm", hki(int ), (int)24);
                            continue block75;
                        }
                        case 1856801289: {
                            break block75;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = ip.ag - ip.his("hmn", hki(int ), (int)25)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == ip.his("hmo", hip(int ), (int)70)) break;
                    v5 /* !! */  = (long)ip.his("hmp", hip(int ), (int)71);
                }
                if (ip.mc.field_1724 == null) ** GOTO lbl53
                if (var6_4) ** GOTO lbl28
                if (var1_1 != null) ** GOTO lbl55
                if (var6_4) ** GOTO lbl28
lbl53:
                // 2 sources

                if (var6_4 || var6_4) ** GOTO lbl28
                return (boolean)ip.his("hmq", hip(int ), (int)72);
lbl55:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl28
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_3 = ip.ag - ip.his("hmr", hki(int ), (int)26)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ip.his("hms", hip(int ), (int)73)) break;
                    v6 /* !! */  = (long)ip.his("hmt", hip(int ), (int)74);
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = ip.ag - ip.his("hmu", hki(int ), (int)27)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == ip.his("hmv", hip(int ), (int)75)) break;
                    v7 /* !! */  = (long)ip.his("hmw", hip(int ), (int)76);
                }
                v8 = ip.mc.field_1724;
                v9 /* !! */  = ip.ag;
                if (true) ** GOTO lbl71
                block79: while (true) {
                    v9 /* !! */  = (long)(ip.his("hmy", hki(int ), (int)29) - ip.his("hmx", hki(int ), (int)28));
lbl71:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case 1300653163: {
                            continue block79;
                        }
                        case 1856801289: {
                            break block79;
                        }
                    }
                    break;
                }
                var2_5 = v8.method_5739((class_1297)var1_1);
                if (var6_4 || var6_4) ** GOTO lbl28
                if (!(var2_5 < ip.his("hna", hmz(int ), (int)30))) ** GOTO lbl81
                if (var6_4) ** GOTO lbl28
                return (boolean)ip.his("hnb", hip(int ), (int)77);
lbl81:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl28
                if (!(var2_5 < ip.his("hnc", hmz(int ), (int)31))) ** GOTO lbl197
                if (var6_4 || var6_4) ** GOTO lbl28
                v10 /* !! */  = ip.ag;
                if (true) ** GOTO lbl88
                block80: while (true) {
                    v10 /* !! */  = (long)(ip.his("hne", hki(int ), (int)33) - ip.his("hnd", hki(int ), (int)32));
lbl88:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case 1856801289: {
                            break block80;
                        }
                        case 2089489127: {
                            continue block80;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_5 = ip.ag - ip.his("hnf", hki(int ), (int)34)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == ip.his("hng", hip(int ), (int)78)) break;
                    v11 /* !! */  = (long)ip.his("hnh", hip(int ), (int)79);
                }
                v12 = ip.mc.field_1724;
                v13 /* !! */  = ip.ag;
                if (true) ** GOTO lbl103
                block82: while (true) {
                    v13 /* !! */  = (long)(v14 - ip.his("hni", hki(int ), (int)35));
lbl103:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case 101642513: {
                            v14 = ip.his("hnj", hki(int ), (int)36);
                            continue block82;
                        }
                        case 563675876: {
                            v14 = ip.his("hnk", hki(int ), (int)37);
                            continue block82;
                        }
                        case 1856801289: {
                            break block82;
                        }
                    }
                    break;
                }
                v15 = v12.method_73189();
                v16 /* !! */  = ip.ag;
                if (true) ** GOTO lbl117
                block83: while (true) {
                    v16 /* !! */  = (long)(ip.his("hnm", hki(int ), (int)39) - ip.his("hnl", hki(int ), (int)38));
lbl117:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -499777469: {
                            continue block83;
                        }
                        case 1856801289: {
                            break block83;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_6 = ip.ag - ip.his("hnn", hki(int ), (int)40)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == ip.his("hno", hip(int ), (int)80)) break;
                    v17 /* !! */  = (long)ip.his("hnp", hip(int ), (int)81);
                }
                v18 = ip.mc.field_1724;
                v19 /* !! */  = ip.ag;
                if (true) ** GOTO lbl132
                block85: while (true) {
                    v19 /* !! */  = (long)(v20 - ip.his("hnq", hki(int ), (int)41));
lbl132:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case -324168918: {
                            v20 = ip.his("hnr", hki(int ), (int)42);
                            continue block85;
                        }
                        case -10745088: {
                            v20 = ip.his("hns", hki(int ), (int)43);
                            continue block85;
                        }
                        case 1856801289: {
                            break block85;
                        }
                    }
                    break;
                }
                v21 = v18.method_18798();
                v22 /* !! */  = ip.ag;
                if (true) ** GOTO lbl146
                block86: while (true) {
                    v22 /* !! */  = (long)(v23 - ip.his("hnt", hki(int ), (int)44));
lbl146:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -221822316: {
                            v23 = ip.his("hnu", hki(int ), (int)45);
                            continue block86;
                        }
                        case 1660615196: {
                            v23 = ip.his("hnv", hki(int ), (int)46);
                            continue block86;
                        }
                        case 1856801289: {
                            break block86;
                        }
                        case 1922241984: {
                            v23 = ip.his("hnw", hki(int ), (int)47);
                            continue block86;
                        }
                    }
                    break;
                }
                var4_6 = v15.method_1019(v21);
                if (var6_4 || var6_4) ** GOTO lbl28
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_7 = ip.ag - ip.his("hnx", hki(int ), (int)48)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ip.his("hny", hip(int ), (int)82)) break;
                    v24 /* !! */  = (long)ip.his("hnz", hip(int ), (int)83);
                }
                v25 = var1_1.method_73189();
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_8 = ip.ag - ip.his("hoa", hki(int ), (int)49)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == ip.his("hob", hip(int ), (int)84)) break;
                    v26 /* !! */  = (long)ip.his("hoc", hip(int ), (int)85);
                }
                v27 = var1_1.method_18798();
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_9 = ip.ag - ip.his("hod", hki(int ), (int)50)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == ip.his("hoe", hip(int ), (int)86)) break;
                    v28 /* !! */  = (long)ip.his("hof", hip(int ), (int)87);
                }
                var5_7 = v25.method_1019(v27);
                if (var6_4 || var6_4) ** GOTO lbl28
                v29 /* !! */  = ip.ag;
                if (true) ** GOTO lbl183
                block90: while (true) {
                    v29 /* !! */  = (long)(ip.his("hoh", hki(int ), (int)52) - ip.his("hog", hki(int ), (int)51));
lbl183:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1049842865: {
                            continue block90;
                        }
                        case 1856801289: {
                            break block90;
                        }
                    }
                    break;
                }
                if (!(var4_6.method_1022(var5_7) > var2_5)) ** GOTO lbl194
                if (var6_4) ** GOTO lbl28
                v30 = ip.his("hoi", hip(int ), (int)88);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl196
lbl194:
                // 1 sources

                if (var6_4 || var6_4) ** GOTO lbl28
                v30 = ip.his("hoj", hip(int ), (int)89);
lbl196:
                // 2 sources

                return (boolean)v30;
lbl197:
                // 1 sources

                if (!var6_4 && !var6_4) ** break;
                ** continue;
                return (boolean)ip.his("hok", hip(int ), (int)90);
            }
lbl200:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)ip.his("hol", hip(int ), (int)91);
                    if (var8_2) {
                        throw null;
                    }
                    ** GOTO lbl216
                    break;
                }
            }
            case 1: {
                var7_3 /* !! */  = (int)ip.his("hom", hip(int ), (int)92);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl279
            }
            case 2: {
                var7_3 /* !! */  = (int)ip.his("hon", hip(int ), (int)93);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl216:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)ip.his("hoo", hip(int ), (int)94);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl256
            }
lbl221:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)ip.his("hop", hip(int ), (int)95);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl288
            }
lbl226:
            // 3 sources

            case 5: {
                var7_3 /* !! */  = (int)ip.his("hoq", hip(int ), (int)96);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl283
            }
            case 6: {
                var7_3 /* !! */  = (int)ip.his("hor", hip(int ), (int)97);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl236:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)ip.his("hos", hip(int ), (int)98);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl319
            }
            case 8: {
                do {
                    var7_3 /* !! */  = (int)ip.his("hot", hip(int ), (int)99);
                } while (!var8_2);
                throw null;
            }
            case 9: {
                var7_3 /* !! */  = (int)ip.his("hou", hip(int ), (int)100);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 10: {
                var7_3 /* !! */  = (int)ip.his("hov", hip(int ), (int)101);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl274
            }
lbl256:
            // 2 sources

            case 11: {
                var7_3 /* !! */  = (int)ip.his("how", hip(int ), (int)102);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl323
            }
            case 12: {
                var7_3 /* !! */  = (int)ip.his("hox", hip(int ), (int)103);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl315
            }
lbl266:
            // 2 sources

            case 13: {
                var7_3 /* !! */  = (int)ip.his("hoy", hip(int ), (int)104);
                if (!var8_2) ** GOTO lbl200
                throw null;
            }
lbl270:
            // 4 sources

            case 14: {
                var7_3 /* !! */  = (int)ip.his("hoz", hip(int ), (int)105);
                if (var8_2) {
                    throw null;
                }
            }
lbl274:
            // 4 sources

            case 15: {
                var7_3 /* !! */  = (int)ip.his("hpa", hip(int ), (int)106);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl296
            }
lbl279:
            // 2 sources

            case 16: {
                var7_3 /* !! */  = (int)ip.his("hpb", hip(int ), (int)107);
                if (!var8_2) ** GOTO lbl270
                throw null;
            }
lbl283:
            // 2 sources

            case 17: {
                var7_3 /* !! */  = (int)ip.his("hpc", hip(int ), (int)108);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl292
            }
lbl288:
            // 2 sources

            case 18: {
                var7_3 /* !! */  = (int)ip.his("hpd", hip(int ), (int)109);
                if (!var8_2) ** GOTO lbl266
                throw null;
            }
lbl292:
            // 2 sources

            case 19: {
                var7_3 /* !! */  = (int)ip.his("hpe", hip(int ), (int)110);
                if (!var8_2) ** GOTO lbl221
                throw null;
            }
lbl296:
            // 2 sources

            case 20: {
                var7_3 /* !! */  = (int)ip.his("hpf", hip(int ), (int)111);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl306
            }
            case 21: {
                var7_3 /* !! */  = (int)ip.his("hpg", hip(int ), (int)112);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl323
            }
lbl306:
            // 3 sources

            case 22: {
                do {
                    var7_3 /* !! */  = (int)ip.his("hph", hip(int ), (int)113);
                } while (!var8_2);
                throw null;
            }
            case 23: {
                var7_3 /* !! */  = (int)ip.his("hpi", hip(int ), (int)114);
                if (!var8_2) ** GOTO lbl270
                throw null;
            }
lbl315:
            // 3 sources

            case 24: {
                var7_3 /* !! */  = (int)ip.his("hpj", hip(int ), (int)115);
                if (!var8_2) ** GOTO lbl226
                throw null;
            }
lbl319:
            // 2 sources

            case 25: {
                var7_3 /* !! */  = (int)ip.his("hpk", hip(int ), (int)116);
                if (!var8_2) ** GOTO lbl236
                throw null;
            }
lbl323:
            // 3 sources

            case 26: {
                var7_3 /* !! */  = (int)ip.his("hpl", hip(int ), (int)117);
                if (!var8_2) ** GOTO lbl270
                throw null;
            }
            case 27: 
        }
        var7_3 /* !! */  = (int)ip.his("hpm", hip(int ), (int)118);
        ** while (!var8_2)
lbl330:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void attackWithInventoryMace(int var1_1, class_1309 var2_2) {
        v0 /* !! */  = ip.ag;
        if (true) ** GOTO lbl5
        block72: while (true) {
            v0 /* !! */  = (long)(v1 - ip.his("htr", hki(int ), (int)84));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1127909564: {
                    v1 = ip.his("hts", hki(int ), (int)85);
                    continue block72;
                }
                case 921319822: {
                    v1 = ip.his("htt", hki(int ), (int)86);
                    continue block72;
                }
                case 1477326560: {
                    v1 = ip.his("htu", hki(int ), (int)87);
                    continue block72;
                }
                case 1856801289: {
                    break block72;
                }
            }
            break;
        }
        var7_3 = ip.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = ip.ag - ip.his("htv", hki(int ), (int)88)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ip.his("htw", hip(int ), (int)196)) break;
            v2 /* !! */  = (long)ip.his("htx", hip(int ), (int)197);
        }
        var6_4 /* !! */  = ip.b;
        v3 /* !! */  = ip.ag;
        if (true) ** GOTO lbl28
        block74: while (true) {
            v3 /* !! */  = (long)(v4 - ip.his("hty", hki(int ), (int)89));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -2036364972: {
                    v4 = ip.his("htz", hki(int ), (int)90);
                    continue block74;
                }
                case 1856801289: {
                    break block74;
                }
                case 1966932619: {
                    v4 = ip.his("hua", hki(int ), (int)91);
                    continue block74;
                }
            }
            break;
        }
        var5_5 = ip.a;
        if (var7_3) {
            throw null;
lbl40:
            // 8 sources

            return;
        }
        if (var5_5 || var5_5) ** GOTO lbl40
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ip.ag - ip.his("hub", hki(int ), (int)92)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == ip.his("huc", hip(int ), (int)198)) break;
            v5 /* !! */  = (long)ip.his("hud", hip(int ), (int)199);
        }
        v6 /* !! */  = ip.ag;
        if (true) ** GOTO lbl52
        block77: while (true) {
            v6 /* !! */  = (long)(v7 - ip.his("hue", hki(int ), (int)93));
lbl52:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -317192547: {
                    v7 = ip.his("huf", hki(int ), (int)94);
                    continue block77;
                }
                case 116353344: {
                    v7 = ip.his("hug", hki(int ), (int)95);
                    continue block77;
                }
                case 1388541402: {
                    v7 = ip.his("huh", hki(int ), (int)96);
                    continue block77;
                }
                case 1856801289: {
                    break block77;
                }
            }
            break;
        }
        v8 = ip.mc.field_1724;
        v9 /* !! */  = ip.ag;
        if (true) ** GOTO lbl69
        block78: while (true) {
            v9 /* !! */  = (long)(ip.his("huj", hki(int ), (int)98) - ip.his("hui", hki(int ), (int)97));
lbl69:
            // 2 sources

            switch ((int)v9 /* !! */ ) {
                case 1156683464: {
                    continue block78;
                }
                case 1856801289: {
                    break block78;
                }
            }
            break;
        }
        v10 = v8.method_31548();
        while (true) {
            if ((v11 /* !! */  = (cfr_temp_2 = ip.ag - ip.his("huk", hki(int ), (int)99)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v11 /* !! */  == ip.his("hul", hip(int ), (int)200)) break;
            v11 /* !! */  = (long)ip.his("hum", hip(int ), (int)201);
        }
        var3_6 = v10.method_67532();
        if (var5_5 || var5_5) ** GOTO lbl40
        v12 /* !! */  = ip.ag;
        if (true) ** GOTO lbl86
        block80: while (true) {
            v12 /* !! */  = (long)(v13 - ip.his("hun", hki(int ), (int)100));
lbl86:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -577713051: {
                    v13 = ip.his("huo", hki(int ), (int)101);
                    continue block80;
                }
                case -324793571: {
                    v13 = ip.his("hup", hki(int ), (int)102);
                    continue block80;
                }
                case 569827026: {
                    v13 = ip.his("huq", hki(int ), (int)103);
                    continue block80;
                }
                case 1856801289: {
                    break block80;
                }
            }
            break;
        }
        var4_7 = nv.wrapSlot(var1_1);
        if (var5_5 || var5_5) ** GOTO lbl40
        v14 /* !! */  = ip.ag;
        if (true) ** GOTO lbl104
        block81: while (true) {
            v14 /* !! */  = (long)(v15 - ip.his("hur", hki(int ), (int)104));
lbl104:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case 1277053821: {
                    v15 = ip.his("hus", hki(int ), (int)105);
                    continue block81;
                }
                case 1430536333: {
                    v15 = ip.his("hut", hki(int ), (int)106);
                    continue block81;
                }
                case 1856801289: {
                    break block81;
                }
            }
            break;
        }
        v16 /* !! */  = ip.ag;
        if (true) ** GOTO lbl117
        block82: while (true) {
            v16 /* !! */  = (long)(v17 - ip.his("huu", hki(int ), (int)107));
lbl117:
            // 2 sources

            switch ((int)v16 /* !! */ ) {
                case -1847745453: {
                    v17 = ip.his("huv", hki(int ), (int)108);
                    continue block82;
                }
                case -1607451298: {
                    v17 = ip.his("huw", hki(int ), (int)109);
                    continue block82;
                }
                case 1856801289: {
                    break block82;
                }
            }
            break;
        }
        nv.click(var4_7, var3_6, class_1713.field_7791);
        if (var5_5 || var5_5) ** GOTO lbl40
        v18 /* !! */  = ip.ag;
        if (true) ** GOTO lbl132
        block83: while (true) {
            v18 /* !! */  = (long)(v19 - ip.his("hux", hki(int ), (int)110));
lbl132:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -815794209: {
                    v19 = ip.his("huy", hki(int ), (int)111);
                    continue block83;
                }
                case 1375062563: {
                    v19 = ip.his("huz", hki(int ), (int)112);
                    continue block83;
                }
                case 1856801289: {
                    break block83;
                }
                case 2070164127: {
                    v19 = ip.his("hva", hki(int ), (int)113);
                    continue block83;
                }
            }
            break;
        }
        this.attack(var2_2);
        if (var5_5) ** GOTO lbl40
        if (var6_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var5_5) ** GOTO lbl40
                v20 /* !! */  = ip.ag;
                if (true) ** GOTO lbl154
                block84: while (true) {
                    v20 /* !! */  = (long)(v21 - ip.his("hvb", hki(int ), (int)114));
lbl154:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -285680076: {
                            v21 = ip.his("hvc", hki(int ), (int)115);
                            continue block84;
                        }
                        case 1527219171: {
                            v21 = ip.his("hvd", hki(int ), (int)116);
                            continue block84;
                        }
                        case 1856801289: {
                            break block84;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_3 = ip.ag - ip.his("hve", hki(int ), (int)117)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ip.his("hvf", hip(int ), (int)202)) break;
                    v22 /* !! */  = (long)ip.his("hvg", hip(int ), (int)203);
                }
                nv.click(var4_7, var3_6, class_1713.field_7791);
                if (var5_5 || var5_5) ** GOTO lbl40
                v23 /* !! */  = ip.ag;
                if (true) ** GOTO lbl174
                block86: while (true) {
                    v23 /* !! */  = (long)(v24 - ip.his("hvh", hki(int ), (int)118));
lbl174:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -1545669101: {
                            v24 = ip.his("hvi", hki(int ), (int)119);
                            continue block86;
                        }
                        case 543326694: {
                            v24 = ip.his("hvj", hki(int ), (int)120);
                            continue block86;
                        }
                        case 639224081: {
                            v24 = ip.his("hvk", hki(int ), (int)121);
                            continue block86;
                        }
                        case 1856801289: {
                            break block86;
                        }
                    }
                    break;
                }
                nv.closeScreen();
                if (!var5_5 && !var5_5) ** break;
                ** continue;
                return;
            }
lbl190:
            // 2 sources

            case 0: {
                var6_4 /* !! */  = (int)ip.his("hvl", hip(int ), (int)204);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl195:
            // 2 sources

            case 1: {
                var6_4 /* !! */  = (int)ip.his("hvm", hip(int ), (int)205);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl228
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var6_4 /* !! */  = (int)ip.his("hvn", hip(int ), (int)206);
                    if (!var7_3) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 3: {
                var6_4 /* !! */  = (int)ip.his("hvo", hip(int ), (int)207);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 4: {
                var6_4 /* !! */  = (int)ip.his("hvp", hip(int ), (int)208);
                if (!var7_3) break;
                throw null;
            }
lbl214:
            // 3 sources

            case 5: {
                var6_4 /* !! */  = (int)ip.his("hvq", hip(int ), (int)209);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl246
            }
            case 6: {
                var6_4 /* !! */  = (int)ip.his("hvr", hip(int ), (int)210);
                if (!var7_3) ** GOTO lbl214
                throw null;
            }
lbl223:
            // 2 sources

            case 7: {
                var6_4 /* !! */  = (int)ip.his("hvs", hip(int ), (int)211);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl237
            }
lbl228:
            // 2 sources

            case 8: {
                var6_4 /* !! */  = (int)ip.his("hvt", hip(int ), (int)212);
                if (!var7_3) break;
                throw null;
            }
            case 9: {
                var6_4 /* !! */  = (int)ip.his("hvu", hip(int ), (int)213);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl246
            }
lbl237:
            // 3 sources

            case 10: {
                var6_4 /* !! */  = (int)ip.his("hvv", hip(int ), (int)214);
                if (!var7_3) ** GOTO lbl195
                throw null;
            }
lbl241:
            // 2 sources

            case 11: {
                var6_4 /* !! */  = (int)ip.his("hvw", hip(int ), (int)215);
                if (var7_3) {
                    throw null;
                }
                ** GOTO lbl250
            }
lbl246:
            // 3 sources

            case 12: {
                var6_4 /* !! */  = (int)ip.his("hvx", hip(int ), (int)216);
                if (!var7_3) ** GOTO lbl190
                throw null;
            }
lbl250:
            // 2 sources

            case 13: {
                var6_4 /* !! */  = (int)ip.his("hvy", hip(int ), (int)217);
                if (!var7_3) ** GOTO lbl214
                throw null;
            }
            case 14: {
                var6_4 /* !! */  = (int)ip.his("hvz", hip(int ), (int)218);
                if (!var7_3) ** GOTO lbl241
                throw null;
            }
            case 15: 
        }
        var6_4 /* !! */  = (int)ip.his("hwa", hip(int ), (int)219);
        ** while (!var7_3)
lbl261:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void icb() {
        ip.hir[0] = -2008103757;
        ip.hir[1] = -1804816774;
        ip.hir[2] = -1927577256;
        ip.hir[3] = -1358905388;
        ip.hir[4] = -1086812245;
        ip.hir[5] = -1166483417;
        ip.hir[6] = -416535673;
        ip.hir[7] = 89117975;
        ip.hir[8] = 1974291623;
        ip.hir[9] = 52190395;
        ip.hir[10] = -881831621;
        ip.hir[11] = 617476146;
        ip.hir[12] = 1855895737;
        ip.hir[13] = -169958268;
        ip.hir[14] = -1820671997;
        ip.hir[15] = -216193069;
        ip.hir[16] = 825243748;
        ip.hir[17] = 852843545;
        ip.hir[18] = -1193388809;
        ip.hir[19] = 2060412424;
        ip.hir[20] = 1845425762;
        ip.hir[21] = -1297252912;
        ip.hir[22] = -1971961057;
        ip.hir[23] = -1499842355;
        ip.hir[24] = -502879583;
        ip.hir[25] = -594432398;
        ip.hir[26] = -1652433900;
        ip.hir[27] = -1885431834;
        ip.hir[28] = 1583173007;
        ip.hir[29] = -1361794767;
        ip.hir[30] = 1478606568;
        ip.hir[31] = -553208849;
        ip.hir[32] = 1591753623;
        ip.hir[33] = -1438517542;
        ip.hir[34] = -1556180669;
        ip.hir[35] = -1127669071;
        ip.hir[36] = -1030648598;
        ip.hir[37] = 0xF666446;
        ip.hir[38] = -406870323;
        ip.hir[39] = -1031668554;
        ip.hir[40] = -552819326;
        ip.hir[41] = 1500357134;
        ip.hir[42] = -1162014143;
        ip.hir[43] = -972447513;
        ip.hir[44] = 157687742;
        ip.hir[45] = 2111061792;
        ip.hir[46] = 713787636;
        ip.hir[47] = -1039502510;
        ip.hir[48] = -1694953788;
        ip.hir[49] = 747016078;
        ip.hir[50] = 551881896;
        ip.hir[51] = -1221262101;
        ip.hir[52] = 1212889071;
        ip.hir[53] = 860790013;
        ip.hir[54] = 803642105;
        ip.hir[55] = -1350250850;
        ip.hir[56] = -188997779;
        ip.hir[57] = 1417675509;
        ip.hir[58] = 1985338642;
        ip.hir[59] = -2040619048;
        ip.hir[60] = -2115545056;
        ip.hir[61] = 1504185811;
        ip.hir[62] = -622756090;
        ip.hir[63] = 1418479914;
        ip.hir[64] = 530665773;
        ip.hir[65] = -824208941;
        ip.hir[66] = 440830256;
        ip.hir[67] = 29646311;
        ip.hir[68] = 1120951571;
        ip.hir[69] = -1876073175;
        ip.hir[70] = 524596800;
        ip.hir[71] = -823604620;
        ip.hir[72] = -625811995;
        ip.hir[73] = -142659226;
        ip.hir[74] = -772721321;
        ip.hir[75] = 1551668632;
        ip.hir[76] = 864958658;
        ip.hir[77] = -1133052269;
        ip.hir[78] = -254510208;
        ip.hir[79] = 400865496;
        ip.hir[80] = 46603497;
        ip.hir[81] = -95249915;
        ip.hir[82] = 1709363379;
        ip.hir[83] = 397445290;
        ip.hir[84] = -1143708987;
        ip.hir[85] = -1045502178;
        ip.hir[86] = -1439289268;
        ip.hir[87] = 1643944557;
        ip.hir[88] = -2082992135;
        ip.hir[89] = -1967887141;
        ip.hir[90] = -511892935;
        ip.hir[91] = -1783544504;
        ip.hir[92] = -679814924;
        ip.hir[93] = -26672697;
        ip.hir[94] = 789117277;
        ip.hir[95] = 722286929;
        ip.hir[96] = -1333341527;
        ip.hir[97] = -48682879;
        ip.hir[98] = -336272965;
        ip.hir[99] = 739047898;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getSavedSlot() {
        v0 /* !! */  = ip.ag;
        if (true) ** GOTO lbl5
        block20: while (true) {
            v0 /* !! */  = (long)(v1 - ip.his("iar", hki(int ), (int)185));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1289013318: {
                    v1 = ip.his("ias", hki(int ), (int)186);
                    continue block20;
                }
                case 1051899863: {
                    v1 = ip.his("iat", hki(int ), (int)187);
                    continue block20;
                }
                case 1856801289: {
                    break block20;
                }
                case 2116483764: {
                    v1 = ip.his("iau", hki(int ), (int)188);
                    continue block20;
                }
            }
            break;
        }
        var3_1 = ip.c;
        v2 /* !! */  = ip.ag;
        if (true) ** GOTO lbl22
        block21: while (true) {
            v2 /* !! */  = (long)(ip.his("iaw", hki(int ), (int)190) - ip.his("iav", hki(int ), (int)189));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 152463146: {
                    continue block21;
                }
                case 1856801289: {
                    break block21;
                }
            }
            break;
        }
        var2_2 /* !! */  = ip.b;
        v3 /* !! */  = ip.ag;
        if (true) ** GOTO lbl32
        block22: while (true) {
            v3 /* !! */  = (long)(ip.his("iay", hki(int ), (int)192) - ip.his("iax", hki(int ), (int)191));
lbl32:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -840814028: {
                    continue block22;
                }
                case 1856801289: {
                    break block22;
                }
            }
            break;
        }
        var1_3 = ip.a;
        if (var3_1) {
            throw null;
            return (int)ip.his("iaz", hip(int ), (int)277);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block14 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = ip.ag - ip.his("iba", hki(int ), (int)193)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ip.his("ibb", hip(int ), (int)278)) break;
                    v4 /* !! */  = (long)ip.his("ibc", hip(int ), (int)279);
                }
                return this.savedSlot;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ip.his("ibd", hip(int ), (int)280);
                    if (!var3_1) break block14;
                    throw null;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ip.his("ibe", hip(int ), (int)281);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ip.his("ibf", hip(int ), (int)282);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ip.his("ibg", hip(int ), (int)283);
        ** while (!var3_1)
lbl69:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void ich() {
        ip.hkk[0] = 2037012512464583379L;
        ip.hkk[1] = -8122312165015862941L;
        ip.hkk[2] = 2234919690900611108L;
        ip.hkk[3] = 2408032392627650851L;
        ip.hkk[4] = 6515190377958279996L;
        ip.hkk[5] = -7895499282658379092L;
        ip.hkk[6] = 5963594109165755044L;
        ip.hkk[7] = 5200946915820667288L;
        ip.hkk[8] = -6349661057449542146L;
        ip.hkk[9] = -636938140643538795L;
        ip.hkk[10] = -2975232126532390315L;
        ip.hkk[11] = -8807471515395597906L;
        ip.hkk[12] = 2236307791573141110L;
        ip.hkk[13] = -7125424234208211381L;
        ip.hkk[14] = 8188443628778121085L;
        ip.hkk[15] = -1321766997782468923L;
        ip.hkk[16] = 88657786607145550L;
        ip.hkk[17] = -463496657854458241L;
        ip.hkk[18] = -7868732999384031869L;
        ip.hkk[19] = -7833885089716287209L;
        ip.hkk[20] = -6718163159601989097L;
        ip.hkk[21] = -3387658676650362736L;
        ip.hkk[22] = 816381618714488448L;
        ip.hkk[23] = 1411538683803399707L;
        ip.hkk[24] = 6094117574061306442L;
        ip.hkk[25] = 6971365667883235729L;
        ip.hkk[26] = -336784429287321111L;
        ip.hkk[27] = -4899946363445852432L;
        ip.hkk[28] = -8047194791575153661L;
        ip.hkk[29] = -3684431433204585068L;
        ip.hkk[30] = 6090323446601222612L;
        ip.hkk[31] = 7311755255819583741L;
        ip.hkk[32] = -3918341715367789824L;
        ip.hkk[33] = 5120842150362524792L;
        ip.hkk[34] = -6003850181955353248L;
        ip.hkk[35] = -2330124417122258153L;
        ip.hkk[36] = -5309132664234630002L;
        ip.hkk[37] = -3166306017681665584L;
        ip.hkk[38] = 8532122734367422196L;
        ip.hkk[39] = 8415013244022513295L;
        ip.hkk[40] = -8734839718259417220L;
        ip.hkk[41] = -917467307647757268L;
        ip.hkk[42] = -1756263137794585050L;
        ip.hkk[43] = -26539962438458551L;
        ip.hkk[44] = -5037534560916989704L;
        ip.hkk[45] = 7490542211346361426L;
        ip.hkk[46] = -1409734623195410258L;
        ip.hkk[47] = 7756916478679168048L;
        ip.hkk[48] = 607324544864834805L;
        ip.hkk[49] = 6289511585315152268L;
        ip.hkk[50] = 6844449564616029722L;
        ip.hkk[51] = -6897126757568993477L;
        ip.hkk[52] = -1718133640176319433L;
        ip.hkk[53] = 2659572982647100244L;
        ip.hkk[54] = -7008832035591241731L;
        ip.hkk[55] = -5821013571189484243L;
        ip.hkk[56] = 4780941582174885877L;
        ip.hkk[57] = -6126324024008236089L;
        ip.hkk[58] = 3726058180314786462L;
        ip.hkk[59] = -4784167735227342173L;
        ip.hkk[60] = 4520753030252155235L;
        ip.hkk[61] = -2766254674400278561L;
        ip.hkk[62] = -5614748039297068385L;
        ip.hkk[63] = 4850369319895587179L;
        ip.hkk[64] = 3573259158515147994L;
        ip.hkk[65] = -9053388873604770825L;
        ip.hkk[66] = -3570572447784238029L;
        ip.hkk[67] = 7105930963913729595L;
        ip.hkk[68] = 4983289504605879923L;
        ip.hkk[69] = 5129957983393655779L;
        ip.hkk[70] = -7931819074546664928L;
        ip.hkk[71] = -4991594239352438607L;
        ip.hkk[72] = -3578370472692541651L;
        ip.hkk[73] = 4772152895633228902L;
        ip.hkk[74] = 3341250349769447570L;
        ip.hkk[75] = 510779035754178825L;
        ip.hkk[76] = -6722380391618143719L;
        ip.hkk[77] = 6221677139661712303L;
        ip.hkk[78] = 3368048086967181905L;
        ip.hkk[79] = 6288719035444199333L;
        ip.hkk[80] = 6956289569723444348L;
        ip.hkk[81] = -5311207506793941317L;
        ip.hkk[82] = 4726075540227372243L;
        ip.hkk[83] = 7058833320452924418L;
        ip.hkk[84] = 2141671873321399412L;
        ip.hkk[85] = 4715777091643532225L;
        ip.hkk[86] = -6064715588329411648L;
        ip.hkk[87] = -8983228639767713796L;
        ip.hkk[88] = -2133552548751145204L;
        ip.hkk[89] = -1689507857804149199L;
        ip.hkk[90] = 7773723668198348323L;
        ip.hkk[91] = -7735100027322662322L;
        ip.hkk[92] = -4705055532017553462L;
        ip.hkk[93] = -8938335698849920211L;
        ip.hkk[94] = -5507465491139521850L;
        ip.hkk[95] = 7734577861694497079L;
        ip.hkk[96] = -1004209250640814377L;
        ip.hkk[97] = 6932555292182050883L;
        ip.hkk[98] = 6075094553395916277L;
        ip.hkk[99] = -8195579501565411782L;
    }

    private static /* synthetic */ void icd() {
        ip.hir[200] = 440605844;
        ip.hir[201] = -558163282;
        ip.hir[202] = -1393309191;
        ip.hir[203] = 1027843529;
        ip.hir[204] = 1963620506;
        ip.hir[205] = 252197938;
        ip.hir[206] = -1245760627;
        ip.hir[207] = 215798518;
        ip.hir[208] = -1711743638;
        ip.hir[209] = 1126896033;
        ip.hir[210] = -1093933936;
        ip.hir[211] = 443494833;
        ip.hir[212] = 558575740;
        ip.hir[213] = -1238442082;
        ip.hir[214] = 1104020670;
        ip.hir[215] = 1626947158;
        ip.hir[216] = -1101817054;
        ip.hir[217] = -1187568641;
        ip.hir[218] = -1163977151;
        ip.hir[219] = 327124481;
        ip.hir[220] = 408057998;
        ip.hir[221] = 2023744490;
        ip.hir[222] = 714242761;
        ip.hir[223] = -840286726;
        ip.hir[224] = -380173095;
        ip.hir[225] = 294910911;
        ip.hir[226] = 305433710;
        ip.hir[227] = 864396514;
        ip.hir[228] = 1371243949;
        ip.hir[229] = 1884858770;
        ip.hir[230] = -858582318;
        ip.hir[231] = 2056820627;
        ip.hir[232] = -242199015;
        ip.hir[233] = -667186831;
        ip.hir[234] = -21383461;
        ip.hir[235] = -1977032749;
        ip.hir[236] = -1883664207;
        ip.hir[237] = -1817694431;
        ip.hir[238] = 137584234;
        ip.hir[239] = -413883604;
        ip.hir[240] = -1888463940;
        ip.hir[241] = 922387828;
        ip.hir[242] = 755343823;
        ip.hir[243] = -929157358;
        ip.hir[244] = 721647907;
        ip.hir[245] = -1026959260;
        ip.hir[246] = -215239633;
        ip.hir[247] = -1254066820;
        ip.hir[248] = 22183745;
        ip.hir[249] = 1856093513;
        ip.hir[250] = 1452925942;
        ip.hir[251] = -1415938778;
        ip.hir[252] = 1506544697;
        ip.hir[253] = 354765963;
        ip.hir[254] = 370899229;
        ip.hir[255] = 162408574;
        ip.hir[256] = 1879533959;
        ip.hir[257] = -606638265;
        ip.hir[258] = 662830559;
        ip.hir[259] = 1567556538;
        ip.hir[260] = 444316570;
        ip.hir[261] = 1631886199;
        ip.hir[262] = 696593506;
        ip.hir[263] = 896722794;
        ip.hir[264] = 160141085;
        ip.hir[265] = -511507724;
        ip.hir[266] = 1282950766;
        ip.hir[267] = 817022092;
        ip.hir[268] = 375076383;
        ip.hir[269] = -841755802;
        ip.hir[270] = -26688221;
        ip.hir[271] = 1325016622;
        ip.hir[272] = -1589748983;
        ip.hir[273] = 1080004823;
        ip.hir[274] = 893301349;
        ip.hir[275] = -3021114;
        ip.hir[276] = 388961612;
        ip.hir[277] = -380827122;
        ip.hir[278] = 604903532;
        ip.hir[279] = -49466777;
        ip.hir[280] = -459184404;
        ip.hir[281] = -1016578754;
        ip.hir[282] = 1600862538;
        ip.hir[283] = -910188768;
        ip.hir[284] = -1903822578;
        ip.hir[285] = 707779128;
        ip.hir[286] = -653050442;
        ip.hir[287] = 1543493074;
        ip.hir[288] = -1949527656;
        ip.hir[289] = 1727660123;
        ip.hir[290] = 998547358;
        ip.hir[291] = 1416928857;
        ip.hir[292] = -47148994;
    }

    private static /* synthetic */ void iby() {
        ip.hiq[0] = 2008103756;
        ip.hiq[1] = -1804816774;
        ip.hiq[2] = -1927577255;
        ip.hiq[3] = -1358905388;
        ip.hiq[4] = 1086812244;
        ip.hiq[5] = 1166483416;
        ip.hiq[6] = 416535672;
        ip.hiq[7] = 89117977;
        ip.hiq[8] = 1974291620;
        ip.hiq[9] = 52190396;
        ip.hiq[10] = -881831631;
        ip.hiq[11] = 617476131;
        ip.hiq[12] = 1855895725;
        ip.hiq[13] = -169958235;
        ip.hiq[14] = -1820671982;
        ip.hiq[15] = -216193069;
        ip.hiq[16] = 825243763;
        ip.hiq[17] = 852843525;
        ip.hiq[18] = -1193388842;
        ip.hiq[19] = 2060412424;
        ip.hiq[20] = 1845425761;
        ip.hiq[21] = -1297252916;
        ip.hiq[22] = -1971961065;
        ip.hiq[23] = -1499842360;
        ip.hiq[24] = -502879555;
        ip.hiq[25] = -594432395;
        ip.hiq[26] = -1652433912;
        ip.hiq[27] = -1885431812;
        ip.hiq[28] = 1583172995;
        ip.hiq[29] = -1361794800;
        ip.hiq[30] = 1478606578;
        ip.hiq[31] = -553208863;
        ip.hiq[32] = 1591753618;
        ip.hiq[33] = -1438517565;
        ip.hiq[34] = -1556180670;
        ip.hiq[35] = -1127669060;
        ip.hiq[36] = -1030648595;
        ip.hiq[37] = 258368586;
        ip.hiq[38] = -406870316;
        ip.hiq[39] = -1031668551;
        ip.hiq[40] = -552819298;
        ip.hiq[41] = -1500357135;
        ip.hiq[42] = -1141795414;
        ip.hiq[43] = -972447514;
        ip.hiq[44] = 805314542;
        ip.hiq[45] = -2111061793;
        ip.hiq[46] = 713787637;
        ip.hiq[47] = 606762473;
        ip.hiq[48] = -1694953787;
        ip.hiq[49] = -2130724692;
        ip.hiq[50] = -551881897;
        ip.hiq[51] = 1844993392;
        ip.hiq[52] = -1212889072;
        ip.hiq[53] = 860790011;
        ip.hiq[54] = 803642097;
        ip.hiq[55] = -1350250854;
        ip.hiq[56] = -188997786;
        ip.hiq[57] = 1417675507;
        ip.hiq[58] = 1985338648;
        ip.hiq[59] = -2040619055;
        ip.hiq[60] = -2115545050;
        ip.hiq[61] = 1504185813;
        ip.hiq[62] = -622756083;
        ip.hiq[63] = 1418479919;
        ip.hiq[64] = 530665773;
        ip.hiq[65] = -824208942;
        ip.hiq[66] = 518477124;
        ip.hiq[67] = 29646310;
        ip.hiq[68] = 1054514051;
        ip.hiq[69] = -1876073176;
        ip.hiq[70] = -524596801;
        ip.hiq[71] = 1618485305;
        ip.hiq[72] = -625811995;
        ip.hiq[73] = -142659225;
        ip.hiq[74] = -1795713771;
        ip.hiq[75] = 1551668633;
        ip.hiq[76] = 678535623;
        ip.hiq[77] = -1133052270;
        ip.hiq[78] = 254510207;
        ip.hiq[79] = 1918933276;
        ip.hiq[80] = -46603498;
        ip.hiq[81] = 1214776886;
        ip.hiq[82] = 1709363378;
        ip.hiq[83] = -745225790;
        ip.hiq[84] = -1143708988;
        ip.hiq[85] = -154347358;
        ip.hiq[86] = -1439289267;
        ip.hiq[87] = -1755418535;
        ip.hiq[88] = -2082992136;
        ip.hiq[89] = -1967887141;
        ip.hiq[90] = -511892935;
        ip.hiq[91] = -1783544496;
        ip.hiq[92] = -679814921;
        ip.hiq[93] = -26672675;
        ip.hiq[94] = 789117260;
        ip.hiq[95] = 722286920;
        ip.hiq[96] = -1333341521;
        ip.hiq[97] = -48682873;
        ip.hiq[98] = -336272978;
        ip.hiq[99] = 739047895;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ip.ag - ip.his("iaa", hki(int ), (int)179)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ip.his("iab", hip(int ), (int)266)) break;
            v0 /* !! */  = (long)ip.his("iac", hip(int ), (int)267);
        }
        var3_1 = ip.c;
        v1 /* !! */  = ip.ag;
        if (true) ** GOTO lbl12
        block17: while (true) {
            v1 /* !! */  = (long)(ip.his("iae", hki(int ), (int)181) - ip.his("iad", hki(int ), (int)180));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 1414177071: {
                    continue block17;
                }
                case 1856801289: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ip.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = ip.ag - ip.his("iaf", hki(int ), (int)182)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v2 /* !! */  == ip.his("iag", hip(int ), (int)268)) break;
                    v2 /* !! */  = (long)ip.his("iah", hip(int ), (int)269);
                }
                var1_3 = ip.a;
                if (var3_1) {
                    throw null;
lbl30:
                    // 2 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl30
                v3 = ip.his("iai", hip(int ), (int)270);
                v4 /* !! */  = ip.ag;
                if (true) ** GOTO lbl38
                block20: while (true) {
                    v4 /* !! */  = (long)(ip.his("iak", hki(int ), (int)184) - ip.his("iaj", hki(int ), (int)183));
lbl38:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1270341788: {
                            continue block20;
                        }
                        case 1856801289: {
                            break block20;
                        }
                    }
                    break;
                }
                this.savedSlot = (int)v3;
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: {
                do {
                    var2_2 /* !! */  = (int)ip.his("ial", hip(int ), (int)271);
                } while (!var3_1);
                throw null;
            }
lbl51:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)ip.his("iam", hip(int ), (int)272);
                if (var3_1) {
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ip.his("ian", hip(int ), (int)273);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl65
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ip.his("iao", hip(int ), (int)274);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl65:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ip.his("iap", hip(int ), (int)275);
                if (!var3_1) ** GOTO lbl51
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ip.his("iaq", hip(int ), (int)276);
        ** while (!var3_1)
lbl72:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double hmz(int n2) {
        return Double.longBitsToDouble(hkj[n2] ^ hkk[n2]);
    }

    private static /* synthetic */ void ici() {
        ip.hkk[100] = 7038239952834146271L;
        ip.hkk[101] = 5240192017673944272L;
        ip.hkk[102] = -8465391067800395415L;
        ip.hkk[103] = 1641736867047765533L;
        ip.hkk[104] = -2210800956483830703L;
        ip.hkk[105] = -6176906061496101313L;
        ip.hkk[106] = 2691549275418723949L;
        ip.hkk[107] = 1884309152055167481L;
        ip.hkk[108] = -2929491914562599362L;
        ip.hkk[109] = -3757595176864609889L;
        ip.hkk[110] = 4218312038328604805L;
        ip.hkk[111] = -5403191237872567608L;
        ip.hkk[112] = -4816263170421306597L;
        ip.hkk[113] = -5689269148094383807L;
        ip.hkk[114] = -8780643038975160062L;
        ip.hkk[115] = 6000667723514035012L;
        ip.hkk[116] = -6693065846016318538L;
        ip.hkk[117] = -8216629077032074008L;
        ip.hkk[118] = 6140686262080347867L;
        ip.hkk[119] = -5375527516335990098L;
        ip.hkk[120] = 9131630341152097359L;
        ip.hkk[121] = -3233478227972323372L;
        ip.hkk[122] = 3825515240936459689L;
        ip.hkk[123] = -106499707519567362L;
        ip.hkk[124] = -62819215465179757L;
        ip.hkk[125] = -1042776383183391071L;
        ip.hkk[126] = 6666012486711497766L;
        ip.hkk[127] = 824356737727866854L;
        ip.hkk[128] = -2819745039263681586L;
        ip.hkk[129] = -7496524649780019340L;
        ip.hkk[130] = 7193947856614438306L;
        ip.hkk[131] = -6383189837369146239L;
        ip.hkk[132] = -1421441952239173285L;
        ip.hkk[133] = 3522742264103923672L;
        ip.hkk[134] = 265158353121336096L;
        ip.hkk[135] = 9219452716308399623L;
        ip.hkk[136] = 7151098539055393464L;
        ip.hkk[137] = -3642880318225040155L;
        ip.hkk[138] = 4345951020234963169L;
        ip.hkk[139] = 7121177737375080075L;
        ip.hkk[140] = -9105945797432029273L;
        ip.hkk[141] = -2319495685527059059L;
        ip.hkk[142] = 6907641118009285834L;
        ip.hkk[143] = 6921781664736625325L;
        ip.hkk[144] = 193093207589060483L;
        ip.hkk[145] = 5919933995417732659L;
        ip.hkk[146] = -2828159393343417739L;
        ip.hkk[147] = -4106603575335640506L;
        ip.hkk[148] = -6615911064201769852L;
        ip.hkk[149] = -7256573642968600826L;
        ip.hkk[150] = 6822092659115579839L;
        ip.hkk[151] = 3064405590450365840L;
        ip.hkk[152] = -7682255135896624918L;
        ip.hkk[153] = -6268726965774861368L;
        ip.hkk[154] = 4746330666347722668L;
        ip.hkk[155] = 595583291692843355L;
        ip.hkk[156] = 729629830825369278L;
        ip.hkk[157] = 5421933786478362043L;
        ip.hkk[158] = -7252053624409448826L;
        ip.hkk[159] = 2425571875353173519L;
        ip.hkk[160] = -3677886207795304732L;
        ip.hkk[161] = -4928197201340304592L;
        ip.hkk[162] = 5219290765237678731L;
        ip.hkk[163] = 6130856714595747425L;
        ip.hkk[164] = -7152731974170818779L;
        ip.hkk[165] = 3225642026421430031L;
        ip.hkk[166] = 4953527403189858104L;
        ip.hkk[167] = 6742872937970890389L;
        ip.hkk[168] = -4444161376216796600L;
        ip.hkk[169] = 7826889677073736819L;
        ip.hkk[170] = 1905026242558755156L;
        ip.hkk[171] = -634284229969868019L;
        ip.hkk[172] = -939813724071600299L;
        ip.hkk[173] = -3362279899055442324L;
        ip.hkk[174] = -1540182784645113242L;
        ip.hkk[175] = -8527946789515516673L;
        ip.hkk[176] = -2815481601522564187L;
        ip.hkk[177] = 7314330604336065031L;
        ip.hkk[178] = -626845305925083333L;
        ip.hkk[179] = 2421416313189831243L;
        ip.hkk[180] = -5403669649014504655L;
        ip.hkk[181] = -4474341378157645331L;
        ip.hkk[182] = 6761427771806313798L;
        ip.hkk[183] = -6651427459625296492L;
        ip.hkk[184] = 9080564176616320143L;
        ip.hkk[185] = -2824748041625808588L;
        ip.hkk[186] = -3710473259056453841L;
        ip.hkk[187] = 2573930912460795641L;
        ip.hkk[188] = 7679144933013681512L;
        ip.hkk[189] = -7633366868727595106L;
        ip.hkk[190] = 6048953149795155639L;
        ip.hkk[191] = 8718572446064331716L;
        ip.hkk[192] = 7380861011823397453L;
        ip.hkk[193] = 4108865890363128864L;
        ip.hkk[194] = 3710463715210593130L;
        ip.hkk[195] = 189764963485359242L;
        ip.hkk[196] = -1044676387227268794L;
        ip.hkk[197] = -1748569715998848070L;
        ip.hkk[198] = 5729773093291238115L;
        ip.hkk[199] = 6690126022561931049L;
    }

    private static /* synthetic */ void icg() {
        ip.hkj[200] = -8370301230318469317L;
        ip.hkj[201] = 3806229752147658949L;
    }

    private static /* synthetic */ void ibz() {
        ip.hiq[100] = -193351361;
        ip.hiq[101] = -73602744;
        ip.hiq[102] = 339625808;
        ip.hiq[103] = 1540775015;
        ip.hiq[104] = 1193120997;
        ip.hiq[105] = -1768677977;
        ip.hiq[106] = 2119034583;
        ip.hiq[107] = -1733877699;
        ip.hiq[108] = 738352404;
        ip.hiq[109] = 2135186580;
        ip.hiq[110] = -2005761706;
        ip.hiq[111] = 1972944489;
        ip.hiq[112] = -363906090;
        ip.hiq[113] = 110140602;
        ip.hiq[114] = -953861424;
        ip.hiq[115] = -1509682561;
        ip.hiq[116] = 1007055326;
        ip.hiq[117] = -1729585334;
        ip.hiq[118] = -224515548;
        ip.hiq[119] = -1684213014;
        ip.hiq[120] = -789533482;
        ip.hiq[121] = -2057602905;
        ip.hiq[122] = -710681433;
        ip.hiq[123] = 29222635;
        ip.hiq[124] = 1828256378;
        ip.hiq[125] = -1864775439;
        ip.hiq[126] = -320286132;
        ip.hiq[127] = -1986755012;
        ip.hiq[128] = -1867886884;
        ip.hiq[129] = 40467603;
        ip.hiq[130] = -638175797;
        ip.hiq[131] = 1745619764;
        ip.hiq[132] = 1566195607;
        ip.hiq[133] = -19520816;
        ip.hiq[134] = 1725125889;
        ip.hiq[135] = 3389776;
        ip.hiq[136] = -898278723;
        ip.hiq[137] = 2139501529;
        ip.hiq[138] = -57827785;
        ip.hiq[139] = 1303621164;
        ip.hiq[140] = -1966858160;
        ip.hiq[141] = -774973644;
        ip.hiq[142] = -2034424759;
        ip.hiq[143] = -345302094;
        ip.hiq[144] = 1014479601;
        ip.hiq[145] = 262471436;
        ip.hiq[146] = 1969090863;
        ip.hiq[147] = -22349126;
        ip.hiq[148] = -235341135;
        ip.hiq[149] = 824438428;
        ip.hiq[150] = 353805857;
        ip.hiq[151] = -1609209795;
        ip.hiq[152] = -1968194164;
        ip.hiq[153] = 1296989048;
        ip.hiq[154] = -1064750630;
        ip.hiq[155] = -419880506;
        ip.hiq[156] = 230106154;
        ip.hiq[157] = 284270725;
        ip.hiq[158] = 1943183281;
        ip.hiq[159] = -310127371;
        ip.hiq[160] = 953498029;
        ip.hiq[161] = -505136996;
        ip.hiq[162] = 1244348411;
        ip.hiq[163] = 580728381;
        ip.hiq[164] = -229445222;
        ip.hiq[165] = 742977332;
        ip.hiq[166] = 527457302;
        ip.hiq[167] = -1472643941;
        ip.hiq[168] = -1769188435;
        ip.hiq[169] = -659438623;
        ip.hiq[170] = 981106488;
        ip.hiq[171] = -1420979676;
        ip.hiq[172] = 1281606949;
        ip.hiq[173] = -1174273085;
        ip.hiq[174] = 502349299;
        ip.hiq[175] = 1337439797;
        ip.hiq[176] = -1611298240;
        ip.hiq[177] = 463590225;
        ip.hiq[178] = -1656170673;
        ip.hiq[179] = 586345832;
        ip.hiq[180] = -786549317;
        ip.hiq[181] = 853635760;
        ip.hiq[182] = -1545304943;
        ip.hiq[183] = -633403511;
        ip.hiq[184] = -26488399;
        ip.hiq[185] = -1687994092;
        ip.hiq[186] = 240282050;
        ip.hiq[187] = 1031580510;
        ip.hiq[188] = 1834444230;
        ip.hiq[189] = -78263193;
        ip.hiq[190] = -1568659339;
        ip.hiq[191] = 745576159;
        ip.hiq[192] = -652824020;
        ip.hiq[193] = 853461166;
        ip.hiq[194] = -979563230;
        ip.hiq[195] = -2113295763;
        ip.hiq[196] = -1570782814;
        ip.hiq[197] = -767553245;
        ip.hiq[198] = 1755973840;
        ip.hiq[199] = -1607438036;
    }

    private static /* synthetic */ void icj() {
        ip.hkk[200] = -5191155230560061877L;
        ip.hkk[201] = 2244789962803366284L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void performAttack(class_1309 var1_1) {
        block93: {
            block92: {
                block91: {
                    block90: {
                        var6_2 = ip.c;
                        var5_3 /* !! */  = ip.b;
                        var4_4 = ip.a;
                        if (var6_2) {
                            throw null;
lbl6:
                            // 22 sources

                            return;
                        }
                        if (var4_4 || var4_4) ** GOTO lbl6
                        if (ip.mc.field_1724 == null) break block90;
                        if (var4_4) ** GOTO lbl6
                        if (var1_1 == null) break block90;
                        if (var4_4) ** GOTO lbl6
                        if (ip.mc.field_1761 == null) break block90;
                        if (var4_4) ** GOTO lbl6
                        if (ip.mc.method_1562() != null) break block91;
                        if (var4_4) ** GOTO lbl6
                    }
                    if (var4_4 || var4_4) ** GOTO lbl6
                    return;
                }
                if (var4_4 || var4_4) ** GOTO lbl6
                if (ip.mc.field_1724.method_6047().method_7909() != class_1802.field_49814) break block92;
                if (var4_4 || var4_4) ** GOTO lbl6
                this.attack(var1_1);
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
            }
            if (var4_4 || var4_4) ** GOTO lbl6
            var2_5 = nv.findItemInHotbar(class_1802.field_49814);
            if (var4_4 || var4_4) ** GOTO lbl6
            if (var2_5 == ip.his("hpn", hip(int ), (int)119)) break block93;
            if (var4_4 || var4_4) ** GOTO lbl6
            this.attackWithHotbarMace(var2_5, var1_1);
            if (var4_4 || var4_4) ** GOTO lbl6
            return;
        }
        if (var4_4 || var4_4) ** GOTO lbl6
        var3_6 = nv.findItemInInventory(class_1802.field_49814);
        if (var5_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_4 || var4_4) ** GOTO lbl6
                if (var3_6 == ip.his("hpo", hip(int ), (int)120)) ** GOTO lbl48
                if (var4_4 || var4_4) ** GOTO lbl6
                this.attackWithInventoryMace(var3_6, var1_1);
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl48:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                if (ip.mc.field_1724.method_6079().method_7909() != class_1802.field_49814) ** GOTO lbl54
                if (var4_4 || var4_4) ** GOTO lbl6
                this.attackWithOffhandMace(var1_1);
                if (var4_4 || var4_4) ** GOTO lbl6
                return;
lbl54:
                // 1 sources

                if (var4_4 || var4_4) ** GOTO lbl6
                this.attack(var1_1);
                if (!var4_4 && !var4_4) ** break;
                ** continue;
                return;
            }
            case 0: {
                var5_3 /* !! */  = (int)ip.his("hpp", hip(int ), (int)121);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl170
            }
lbl64:
            // 2 sources

            case 1: {
                var5_3 /* !! */  = (int)ip.his("hpq", hip(int ), (int)122);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl69:
            // 2 sources

            case 2: {
                var5_3 /* !! */  = (int)ip.his("hpr", hip(int ), (int)123);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl74:
            // 2 sources

            case 3: {
                var5_3 /* !! */  = (int)ip.his("hps", hip(int ), (int)124);
                if (!var6_2) ** GOTO lbl69
                throw null;
            }
lbl78:
            // 2 sources

            case 4: {
                var5_3 /* !! */  = (int)ip.his("hpt", hip(int ), (int)125);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 5: {
                var5_3 /* !! */  = (int)ip.his("hpu", hip(int ), (int)126);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl111
            }
lbl88:
            // 2 sources

            case 6: {
                var5_3 /* !! */  = (int)ip.his("hpv", hip(int ), (int)127);
                if (!var6_2) ** GOTO lbl74
                throw null;
            }
            case 7: {
                var5_3 /* !! */  = (int)ip.his("hpw", hip(int ), (int)128);
                if (var6_2) {
                    throw null;
                }
            }
lbl96:
            // 5 sources

            case 8: {
                do {
                    var5_3 /* !! */  = (int)ip.his("hpx", hip(int ), (int)129);
                } while (!var6_2);
                throw null;
            }
lbl101:
            // 2 sources

            case 9: {
                var5_3 /* !! */  = (int)ip.his("hpy", hip(int ), (int)130);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl106:
            // 2 sources

            case 10: {
                var5_3 /* !! */  = (int)ip.his("hpz", hip(int ), (int)131);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl111:
            // 3 sources

            case 11: {
                var5_3 /* !! */  = (int)ip.his("hqa", hip(int ), (int)132);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl116:
            // 2 sources

            case 12: {
                var5_3 /* !! */  = (int)ip.his("hqb", hip(int ), (int)133);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl121:
            // 2 sources

            case 13: {
                var5_3 /* !! */  = (int)ip.his("hqc", hip(int ), (int)134);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 14: {
                var5_3 /* !! */  = (int)ip.his("hqd", hip(int ), (int)135);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl131:
            // 6 sources

            case 15: {
                var5_3 /* !! */  = (int)ip.his("hqe", hip(int ), (int)136);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl136:
            // 3 sources

            case 16: {
                var5_3 /* !! */  = (int)ip.his("hqf", hip(int ), (int)137);
                if (!var6_2) ** GOTO lbl131
                throw null;
            }
            case 17: {
                var5_3 /* !! */  = (int)ip.his("hqg", hip(int ), (int)138);
                if (!var6_2) ** GOTO lbl96
                throw null;
            }
            case 18: {
                var5_3 /* !! */  = (int)ip.his("hqh", hip(int ), (int)139);
                if (!var6_2) ** GOTO lbl131
                throw null;
            }
            case 19: {
                var5_3 /* !! */  = (int)ip.his("hqi", hip(int ), (int)140);
                if (!var6_2) ** GOTO lbl64
                throw null;
            }
lbl152:
            // 2 sources

            case 20: {
                var5_3 /* !! */  = (int)ip.his("hqj", hip(int ), (int)141);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl240
            }
            case 21: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_3 /* !! */  = (int)ip.his("hqk", hip(int ), (int)142);
                    if (!var6_2) ** GOTO lbl96
                    throw null;
                }
            }
            case 22: {
                var5_3 /* !! */  = (int)ip.his("hql", hip(int ), (int)143);
                if (var6_2) {
                    throw null;
                }
            }
            case 23: {
                var5_3 /* !! */  = (int)ip.his("hqm", hip(int ), (int)144);
                if (!var6_2) ** GOTO lbl121
                throw null;
            }
lbl170:
            // 3 sources

            case 24: {
                var5_3 /* !! */  = (int)ip.his("hqn", hip(int ), (int)145);
                if (!var6_2) ** GOTO lbl88
                throw null;
            }
lbl174:
            // 2 sources

            case 25: {
                var5_3 /* !! */  = (int)ip.his("hqo", hip(int ), (int)146);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 26: {
                var5_3 /* !! */  = (int)ip.his("hqp", hip(int ), (int)147);
                if (!var6_2) ** GOTO lbl131
                throw null;
            }
            case 27: {
                var5_3 /* !! */  = (int)ip.his("hqq", hip(int ), (int)148);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
            case 28: {
                var5_3 /* !! */  = (int)ip.his("hqr", hip(int ), (int)149);
                if (!var6_2) ** GOTO lbl116
                throw null;
            }
            case 29: {
                var5_3 /* !! */  = (int)ip.his("hqs", hip(int ), (int)150);
                if (!var6_2) ** GOTO lbl174
                throw null;
            }
            case 30: {
                var5_3 /* !! */  = (int)ip.his("hqt", hip(int ), (int)151);
                if (var6_2) {
                    throw null;
                }
            }
lbl199:
            // 4 sources

            case 31: {
                var5_3 /* !! */  = (int)ip.his("hqu", hip(int ), (int)152);
                if (!var6_2) ** GOTO lbl170
                throw null;
            }
lbl203:
            // 4 sources

            case 32: {
                var5_3 /* !! */  = (int)ip.his("hqv", hip(int ), (int)153);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl208:
            // 2 sources

            case 33: {
                var5_3 /* !! */  = (int)ip.his("hqw", hip(int ), (int)154);
                if (!var6_2) ** GOTO lbl136
                throw null;
            }
            case 34: {
                var5_3 /* !! */  = (int)ip.his("hqx", hip(int ), (int)155);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl232
            }
lbl217:
            // 2 sources

            case 35: {
                var5_3 /* !! */  = (int)ip.his("hqy", hip(int ), (int)156);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl236
            }
            case 36: {
                var5_3 /* !! */  = (int)ip.his("hqz", hip(int ), (int)157);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl244
            }
            case 37: {
                var5_3 /* !! */  = (int)ip.his("hra", hip(int ), (int)158);
                if (var6_2) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl232:
            // 4 sources

            case 38: {
                var5_3 /* !! */  = (int)ip.his("hrb", hip(int ), (int)159);
                if (!var6_2) ** GOTO lbl208
                throw null;
            }
lbl236:
            // 2 sources

            case 39: {
                var5_3 /* !! */  = (int)ip.his("hrc", hip(int ), (int)160);
                if (!var6_2) ** GOTO lbl78
                throw null;
            }
lbl240:
            // 3 sources

            case 40: {
                var5_3 /* !! */  = (int)ip.his("hrd", hip(int ), (int)161);
                if (!var6_2) ** GOTO lbl111
                throw null;
            }
lbl244:
            // 4 sources

            case 41: {
                var5_3 /* !! */  = (int)ip.his("hre", hip(int ), (int)162);
                if (!var6_2) ** GOTO lbl106
                throw null;
            }
            case 42: {
                var5_3 /* !! */  = (int)ip.his("hrf", hip(int ), (int)163);
                if (!var6_2) ** GOTO lbl203
                throw null;
            }
            case 43: {
                do {
                    var5_3 /* !! */  = (int)ip.his("hrg", hip(int ), (int)164);
                } while (!var6_2);
                throw null;
            }
            case 44: 
        }
        var5_3 /* !! */  = (int)ip.his("hrh", hip(int ), (int)165);
        ** while (!var6_2)
lbl260:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void holdMace() {
        block70: {
            block69: {
                block68: {
                    var5_1 = ip.c;
                    var4_2 /* !! */  = ip.b;
                    var3_3 = ip.a;
                    if (var5_1) {
                        throw null;
lbl6:
                        // 17 sources

                        return;
                    }
                    if (var3_3 || var3_3) ** GOTO lbl6
                    if (ip.mc.field_1724 != null) break block68;
                    if (var3_3) ** GOTO lbl6
                    return;
                }
                if (var3_3 || var3_3) ** GOTO lbl6
                if (ip.mc.field_1724.method_6047().method_7909() != class_1802.field_49814) break block69;
                if (var3_3) ** GOTO lbl6
                return;
            }
            if (var3_3 || var3_3) ** GOTO lbl6
            var1_4 = nv.findItemInHotbar(class_1802.field_49814);
            if (var3_3 || var3_3) ** GOTO lbl6
            if (var1_4 == ip.his("hix", hip(int ), (int)4)) ** GOTO lbl35
            if (var3_3 || var3_3) ** GOTO lbl6
            if (this.savedSlot != ip.his("hiy", hip(int ), (int)5)) break block70;
            if (var3_3 || var3_3) ** GOTO lbl6
            this.savedSlot = ip.mc.field_1724.method_31548().method_67532();
            if (var3_3) ** GOTO lbl6
        }
        if (var3_3 || var3_3) ** GOTO lbl6
        nv.selectSlot(var1_4);
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3 || var3_3) ** GOTO lbl6
                return;
            }
lbl35:
            // 1 sources

            if (var3_3 || var3_3) ** GOTO lbl6
            var2_5 = nv.findItemInInventory(class_1802.field_49814);
            if (var3_3 || var3_3) ** GOTO lbl6
            if (var2_5 == ip.his("hiz", hip(int ), (int)6)) ** GOTO lbl44
            if (var3_3 || var3_3) ** GOTO lbl6
            nv.click(nv.wrapSlot(var2_5), ip.mc.field_1724.method_31548().method_67532(), class_1713.field_7791);
            if (var3_3 || var3_3) ** GOTO lbl6
            nv.closeScreen();
            if (var3_3) ** GOTO lbl6
lbl44:
            // 2 sources

            if (!var3_3 && !var3_3) ** break;
            ** continue;
            return;
lbl47:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)ip.his("hja", hip(int ), (int)7);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl58
            }
lbl52:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)ip.his("hjb", hip(int ), (int)8);
                    if (var5_1) {
                        throw null;
                    }
                    ** GOTO lbl78
                    break;
                }
            }
lbl58:
            // 2 sources

            case 2: {
                var4_2 /* !! */  = (int)ip.his("hjc", hip(int ), (int)9);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl181
            }
            case 3: {
                var4_2 /* !! */  = (int)ip.his("hjd", hip(int ), (int)10);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl68:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)ip.his("hje", hip(int ), (int)11);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl73:
            // 3 sources

            case 5: {
                var4_2 /* !! */  = (int)ip.his("hjf", hip(int ), (int)12);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl78:
            // 2 sources

            case 6: {
                var4_2 /* !! */  = (int)ip.his("hjg", hip(int ), (int)13);
                if (!var5_1) ** GOTO lbl73
                throw null;
            }
lbl82:
            // 3 sources

            case 7: {
                var4_2 /* !! */  = (int)ip.his("hjh", hip(int ), (int)14);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl161
            }
            case 8: {
                var4_2 /* !! */  = (int)ip.his("hji", hip(int ), (int)15);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 9: {
                var4_2 /* !! */  = (int)ip.his("hjj", hip(int ), (int)16);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl185
            }
lbl97:
            // 2 sources

            case 10: {
                var4_2 /* !! */  = (int)ip.his("hjk", hip(int ), (int)17);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl102:
            // 2 sources

            case 11: {
                var4_2 /* !! */  = (int)ip.his("hjl", hip(int ), (int)18);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 12: {
                var4_2 /* !! */  = (int)ip.his("hjm", hip(int ), (int)19);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl126
            }
            case 13: {
                var4_2 /* !! */  = (int)ip.his("hjn", hip(int ), (int)20);
                if (!var5_1) ** GOTO lbl82
                throw null;
            }
            case 14: {
                var4_2 /* !! */  = (int)ip.his("hjo", hip(int ), (int)21);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
            case 15: {
                var4_2 /* !! */  = (int)ip.his("hjp", hip(int ), (int)22);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl152
            }
lbl126:
            // 4 sources

            case 16: {
                var4_2 /* !! */  = (int)ip.his("hjq", hip(int ), (int)23);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl140
            }
lbl131:
            // 3 sources

            case 17: {
                var4_2 /* !! */  = (int)ip.his("hjr", hip(int ), (int)24);
                if (!var5_1) ** GOTO lbl126
                throw null;
            }
lbl135:
            // 2 sources

            case 18: {
                var4_2 /* !! */  = (int)ip.his("hjs", hip(int ), (int)25);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl148
            }
lbl140:
            // 2 sources

            case 19: {
                var4_2 /* !! */  = (int)ip.his("hjt", hip(int ), (int)26);
                if (!var5_1) ** GOTO lbl82
                throw null;
            }
            case 20: {
                var4_2 /* !! */  = (int)ip.his("hju", hip(int ), (int)27);
                if (!var5_1) ** GOTO lbl52
                throw null;
            }
lbl148:
            // 5 sources

            case 21: {
                var4_2 /* !! */  = (int)ip.his("hjv", hip(int ), (int)28);
                if (!var5_1) break;
                throw null;
            }
lbl152:
            // 4 sources

            case 22: {
                var4_2 /* !! */  = (int)ip.his("hjw", hip(int ), (int)29);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
            case 23: {
                var4_2 /* !! */  = (int)ip.his("hjx", hip(int ), (int)30);
                if (!var5_1) ** GOTO lbl126
                throw null;
            }
lbl161:
            // 3 sources

            case 24: {
                var4_2 /* !! */  = (int)ip.his("hjy", hip(int ), (int)31);
                if (!var5_1) ** GOTO lbl97
                throw null;
            }
            case 25: {
                var4_2 /* !! */  = (int)ip.his("hjz", hip(int ), (int)32);
                if (!var5_1) ** GOTO lbl68
                throw null;
            }
lbl169:
            // 2 sources

            case 26: {
                var4_2 /* !! */  = (int)ip.his("hka", hip(int ), (int)33);
                if (!var5_1) ** GOTO lbl73
                throw null;
            }
lbl173:
            // 2 sources

            case 27: {
                var4_2 /* !! */  = (int)ip.his("hkb", hip(int ), (int)34);
                if (!var5_1) ** GOTO lbl161
                throw null;
            }
            case 28: {
                var4_2 /* !! */  = (int)ip.his("hkc", hip(int ), (int)35);
                if (!var5_1) ** GOTO lbl135
                throw null;
            }
lbl181:
            // 2 sources

            case 29: {
                var4_2 /* !! */  = (int)ip.his("hkd", hip(int ), (int)36);
                if (!var5_1) ** GOTO lbl131
                throw null;
            }
lbl185:
            // 3 sources

            case 30: {
                var4_2 /* !! */  = (int)ip.his("hke", hip(int ), (int)37);
                if (!var5_1) ** GOTO lbl47
                throw null;
            }
            case 31: {
                var4_2 /* !! */  = (int)ip.his("hkf", hip(int ), (int)38);
                if (!var5_1) ** GOTO lbl152
                throw null;
            }
            case 32: {
                var4_2 /* !! */  = (int)ip.his("hkg", hip(int ), (int)39);
                if (!var5_1) ** GOTO lbl185
                throw null;
            }
            case 33: 
        }
        var4_2 /* !! */  = (int)ip.his("hkh", hip(int ), (int)40);
        ** while (!var5_1)
lbl200:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void icc() {
        ip.hir[100] = -193351374;
        ip.hir[101] = -73602733;
        ip.hir[102] = 339625793;
        ip.hir[103] = 1540775031;
        ip.hir[104] = 1193121012;
        ip.hir[105] = -1768677978;
        ip.hir[106] = 2119034580;
        ip.hir[107] = -1733877703;
        ip.hir[108] = 738352388;
        ip.hir[109] = 2135186579;
        ip.hir[110] = -2005761713;
        ip.hir[111] = 1972944487;
        ip.hir[112] = -363906107;
        ip.hir[113] = 110140602;
        ip.hir[114] = -953861429;
        ip.hir[115] = -1509682578;
        ip.hir[116] = 1007055317;
        ip.hir[117] = -1729585326;
        ip.hir[118] = -224515551;
        ip.hir[119] = 1684213013;
        ip.hir[120] = 789533481;
        ip.hir[121] = -2057602942;
        ip.hir[122] = -710681428;
        ip.hir[123] = 29222644;
        ip.hir[124] = 1828256374;
        ip.hir[125] = -1864775442;
        ip.hir[126] = -320286125;
        ip.hir[127] = -1986755034;
        ip.hir[128] = -1867886894;
        ip.hir[129] = 40467603;
        ip.hir[130] = -638175802;
        ip.hir[131] = 1745619773;
        ip.hir[132] = 1566195611;
        ip.hir[133] = -19520809;
        ip.hir[134] = 1725125894;
        ip.hir[135] = 3389814;
        ip.hir[136] = -898278761;
        ip.hir[137] = 2139501531;
        ip.hir[138] = -57827797;
        ip.hir[139] = 1303621165;
        ip.hir[140] = -1966858148;
        ip.hir[141] = -774973676;
        ip.hir[142] = -2034424735;
        ip.hir[143] = -345302126;
        ip.hir[144] = 1014479602;
        ip.hir[145] = 262471449;
        ip.hir[146] = 1969090867;
        ip.hir[147] = -22349155;
        ip.hir[148] = -235341130;
        ip.hir[149] = 824438461;
        ip.hir[150] = 353805835;
        ip.hir[151] = -1609209793;
        ip.hir[152] = -1968194176;
        ip.hir[153] = 1296989024;
        ip.hir[154] = -1064750599;
        ip.hir[155] = -419880487;
        ip.hir[156] = 230106120;
        ip.hir[157] = 284270722;
        ip.hir[158] = 1943183283;
        ip.hir[159] = -310127375;
        ip.hir[160] = 953497989;
        ip.hir[161] = -505137000;
        ip.hir[162] = 1244348380;
        ip.hir[163] = 580728354;
        ip.hir[164] = -229445226;
        ip.hir[165] = 742977314;
        ip.hir[166] = 527457303;
        ip.hir[167] = -2092828708;
        ip.hir[168] = -1769188436;
        ip.hir[169] = 668685341;
        ip.hir[170] = 981106489;
        ip.hir[171] = -60575698;
        ip.hir[172] = -1281606950;
        ip.hir[173] = -477540824;
        ip.hir[174] = -502349300;
        ip.hir[175] = 678662678;
        ip.hir[176] = -1611298239;
        ip.hir[177] = 663046638;
        ip.hir[178] = -1656170674;
        ip.hir[179] = -895880426;
        ip.hir[180] = 786549316;
        ip.hir[181] = -1597260555;
        ip.hir[182] = -1545304944;
        ip.hir[183] = -934982161;
        ip.hir[184] = -26488398;
        ip.hir[185] = -1687994093;
        ip.hir[186] = 240282052;
        ip.hir[187] = 1031580510;
        ip.hir[188] = 1834444236;
        ip.hir[189] = -78263187;
        ip.hir[190] = -1568659343;
        ip.hir[191] = 745576157;
        ip.hir[192] = -652824026;
        ip.hir[193] = 853461157;
        ip.hir[194] = -979563226;
        ip.hir[195] = -2113295771;
        ip.hir[196] = 1570782813;
        ip.hir[197] = 279835122;
        ip.hir[198] = 1755973841;
        ip.hir[199] = 807551740;
    }

    private static /* synthetic */ void ica() {
        ip.hiq[200] = -440605845;
        ip.hiq[201] = -23185169;
        ip.hiq[202] = -1393309192;
        ip.hiq[203] = 203492166;
        ip.hiq[204] = 1963620500;
        ip.hiq[205] = 252197941;
        ip.hiq[206] = -1245760628;
        ip.hiq[207] = 215798523;
        ip.hiq[208] = -1711743645;
        ip.hiq[209] = 1126896038;
        ip.hiq[210] = -1093933922;
        ip.hiq[211] = 443494847;
        ip.hiq[212] = 558575728;
        ip.hiq[213] = -1238442084;
        ip.hiq[214] = 1104020659;
        ip.hiq[215] = 1626947155;
        ip.hiq[216] = -1101817054;
        ip.hiq[217] = -1187568643;
        ip.hiq[218] = -1163977144;
        ip.hiq[219] = 327124487;
        ip.hiq[220] = 408057999;
        ip.hiq[221] = 1950113111;
        ip.hiq[222] = 714242760;
        ip.hiq[223] = -917070544;
        ip.hiq[224] = -380173096;
        ip.hiq[225] = -1834899640;
        ip.hiq[226] = 305433711;
        ip.hiq[227] = -945793547;
        ip.hiq[228] = 1371243909;
        ip.hiq[229] = -1884858771;
        ip.hiq[230] = 473854141;
        ip.hiq[231] = 2056820667;
        ip.hiq[232] = 242199014;
        ip.hiq[233] = 250922968;
        ip.hiq[234] = -21383471;
        ip.hiq[235] = -1977032748;
        ip.hiq[236] = -1883664197;
        ip.hiq[237] = -1817694420;
        ip.hiq[238] = 137584232;
        ip.hiq[239] = -413883611;
        ip.hiq[240] = -1888463943;
        ip.hiq[241] = 922387825;
        ip.hiq[242] = 755343820;
        ip.hiq[243] = -929157352;
        ip.hiq[244] = 721647913;
        ip.hiq[245] = -1026959259;
        ip.hiq[246] = -215239642;
        ip.hiq[247] = -1254066822;
        ip.hiq[248] = -22183746;
        ip.hiq[249] = -1413589155;
        ip.hiq[250] = 1452925943;
        ip.hiq[251] = 2023494191;
        ip.hiq[252] = 1506544696;
        ip.hiq[253] = -1027880691;
        ip.hiq[254] = 370899228;
        ip.hiq[255] = -544616103;
        ip.hiq[256] = 1879533958;
        ip.hiq[257] = -1992392803;
        ip.hiq[258] = 662830555;
        ip.hiq[259] = 1567556537;
        ip.hiq[260] = 444316568;
        ip.hiq[261] = 1631886197;
        ip.hiq[262] = 696593509;
        ip.hiq[263] = 896722795;
        ip.hiq[264] = 160141086;
        ip.hiq[265] = -511507721;
        ip.hiq[266] = 1282950767;
        ip.hiq[267] = -864225118;
        ip.hiq[268] = 375076382;
        ip.hiq[269] = -1115527856;
        ip.hiq[270] = 26688220;
        ip.hiq[271] = 1325016622;
        ip.hiq[272] = -1589748984;
        ip.hiq[273] = 1080004821;
        ip.hiq[274] = 893301349;
        ip.hiq[275] = -3021115;
        ip.hiq[276] = 388961614;
        ip.hiq[277] = 1147673800;
        ip.hiq[278] = 604903533;
        ip.hiq[279] = -1928486985;
        ip.hiq[280] = -459184401;
        ip.hiq[281] = -1016578755;
        ip.hiq[282] = 1600862536;
        ip.hiq[283] = -910188767;
        ip.hiq[284] = -1903822577;
        ip.hiq[285] = -1936951842;
        ip.hiq[286] = -653050441;
        ip.hiq[287] = -92075692;
        ip.hiq[288] = -1949527656;
        ip.hiq[289] = 1727660120;
        ip.hiq[290] = 998547354;
        ip.hiq[291] = 1416928856;
        ip.hiq[292] = -47148996;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setSavedSlot(int n2) {
        boolean bl2;
        Object object = ag;
        block10: while (true) {
            switch ((int)object) {
                case -407803651: {
                    object = ip.his("ibi", hki(int ), (int)195) - ip.his("ibh", hki(int ), (int)194);
                    continue block10;
                }
                case 1856801289: {
                    break block10;
                }
            }
            break;
        }
        boolean bl3 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = ag - ip.his("ibj", hki(int ), (int)196)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == ip.his("ibk", hip(int ), (int)284)) break;
            object2 = ip.his("ibl", hip(int ), (int)285);
        }
        int n3 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = ag - ip.his("ibm", hki(int ), (int)197)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == ip.his("ibn", hip(int ), (int)286)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = ip.his("ibo", hip(int ), (int)287);
        }
        if (bl2 || bl2) return;
        Object object4 = ag;
        boolean bl4 = true;
        block13: while (true) {
            CallSite callSite;
            if (!bl4 || (bl4 = false) || !true) {
                object4 = callSite - ip.his("ibp", hki(int ), (int)198);
            }
            switch ((int)object4) {
                case -1250941648: {
                    callSite = ip.his("ibq", hki(int ), (int)199);
                    continue block13;
                }
                case 20832226: {
                    callSite = ip.his("ibr", hki(int ), (int)200);
                    continue block13;
                }
                case 560341804: {
                    callSite = ip.his("ibs", hki(int ), (int)201);
                    continue block13;
                }
                case 1856801289: {
                    break block13;
                }
            }
            break;
        }
        this.savedSlot = n2;
        if (!bl2) return;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void attack(class_1309 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_1 = ip.ag - ip.his("hyk", hki(int ), (int)155)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ip.his("hyl", hip(int ), (int)248)) break;
            v0 /* !! */  = (long)ip.his("hym", hip(int ), (int)249);
        }
        var4_2 = ip.c;
        v1 /* !! */  = ip.ag;
        block44: while (true) {
            switch ((int)v1 /* !! */ ) {
                case 1856801289: {
                    break block44;
                }
                case 1869705329: {
                    v1 /* !! */  = (long)(ip.his("hyo", hki(int ), (int)157) - ip.his("hyn", hki(int ), (int)156));
                    continue block44;
                }
            }
            break;
        }
        var3_3 /* !! */  = ip.b;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block45: while (true) {
            block71: {
                switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            if ((v2 /* !! */  = (cfr_temp_2 = ip.ag - ip.his("hyp", hki(int ), (int)158)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                            if (v2 /* !! */  == ip.his("hyq", hip(int ), (int)250)) {
                                var2_4 = ip.a;
                                if (var4_2) {
                                    throw null;
                                }
                                break;
                            }
                            v2 /* !! */  = (long)ip.his("hyr", hip(int ), (int)251);
                        }
                        if (var2_4 || var2_4) return;
                        v3 /* !! */  = ip.ag;
                        block47: while (true) {
                            switch ((int)v3 /* !! */ ) {
                                case -2140324472: {
                                    v3 /* !! */  = (long)(ip.his("hyt", hki(int ), (int)160) - ip.his("hys", hki(int ), (int)159));
                                    continue block47;
                                }
                                case 1856801289: {
                                    break block47;
                                }
                            }
                            break;
                        }
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_3 = ip.ag - ip.his("hyu", hki(int ), (int)161)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v4 /* !! */  != ip.his("hyv", hip(int ), (int)252)) ** GOTO lbl45
                            v5 = ip.mc.field_1761;
                            v6 /* !! */  = ip.ag;
                            if (true) ** GOTO lbl69
lbl45:
                            // 1 sources

                            v4 /* !! */  = (long)ip.his("hyw", hip(int ), (int)253);
                        }
                    }
                    case 1: {
                        ** GOTO lbl58
                    }
                    case 4: {
                        var3_3 /* !! */  = (int)ip.his("hzw", hip(int ), (int)262);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 7: lbl-1000:
                    // 2 sources

                    {
                        var3_3 /* !! */  = (int)ip.his("hzz", hip(int ), (int)265);
                        if (var4_2) {
                            throw null;
                        }
lbl58:
                        // 3 sources

                        var3_3 /* !! */  = (int)ip.his("hzt", hip(int ), (int)259);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 6: {
                        var3_3 /* !! */  = (int)ip.his("hzy", hip(int ), (int)264);
                        cfr_temp_0 = 2;
                        if (var4_2) {
                            throw null;
                        }
                        break block71;
                    }
                    block49: while (true) {
                        v6 /* !! */  = (long)(v7 - ip.his("hyx", hki(int ), (int)162));
lbl69:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case 370623278: {
                                v7 = ip.his("hyy", hki(int ), (int)163);
                                continue block49;
                            }
                            case 1765850437: {
                                v7 = ip.his("hyz", hki(int ), (int)164);
                                continue block49;
                            }
                            case 1856801289: {
                                break block49;
                            }
                        }
                        break;
                    }
                    v8 /* !! */  = ip.ag;
                    if (true) ** GOTO lbl82
                    block50: while (true) {
                        v8 /* !! */  = (long)(v9 - ip.his("hza", hki(int ), (int)165));
lbl82:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -631037196: {
                                v9 = ip.his("hzb", hki(int ), (int)166);
                                continue block50;
                            }
                            case 1533387569: {
                                v9 = ip.his("hzc", hki(int ), (int)167);
                                continue block50;
                            }
                            case 1856801289: {
                                break block50;
                            }
                        }
                        break;
                    }
                    v10 = ip.mc.field_1724;
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_4 = ip.ag - ip.his("hzd", hki(int ), (int)168)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                        if (v11 /* !! */  == ip.his("hze", hip(int ), (int)254)) {
                            v5.method_2918((class_1657)v10, (class_1297)var1_1);
                            if (var2_4) return;
                            break;
                        }
                        v11 /* !! */  = (long)ip.his("hzf", hip(int ), (int)255);
                    }
                    if (var2_4) return;
                    v12 /* !! */  = ip.ag;
                    block52: while (true) {
                        switch ((int)v12 /* !! */ ) {
                            case 690726117: {
                                v12 /* !! */  = (long)(ip.his("hzh", hki(int ), (int)170) - ip.his("hzg", hki(int ), (int)169));
                                continue block52;
                            }
                            case 1856801289: {
                                break block52;
                            }
                        }
                        break;
                    }
                    v13 /* !! */  = ip.ag;
                    if (true) ** GOTO lbl113
                    block53: while (true) {
                        v13 /* !! */  = (long)(v14 - ip.his("hzi", hki(int ), (int)171));
lbl113:
                        // 2 sources

                        switch ((int)v13 /* !! */ ) {
                            case -1821037736: {
                                v14 = ip.his("hzj", hki(int ), (int)172);
                                continue block53;
                            }
                            case -1487408926: {
                                v14 = ip.his("hzk", hki(int ), (int)173);
                                continue block53;
                            }
                            case 851926999: {
                                v14 = ip.his("hzl", hki(int ), (int)174);
                                continue block53;
                            }
                            case 1856801289: {
                                break block53;
                            }
                        }
                        break;
                    }
                    v15 = ip.mc.field_1724;
                    while (true) {
                        if ((v16 /* !! */  = (cfr_temp_5 = ip.ag - ip.his("hzm", hki(int ), (int)175)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v16 /* !! */  != ip.his("hzn", hip(int ), (int)256)) ** GOTO lbl131
                        v17 /* !! */  = ip.ag;
                        if (true) ** GOTO lbl135
lbl131:
                        // 1 sources

                        v16 /* !! */  = (long)ip.his("hzo", hip(int ), (int)257);
                    }
                    block55: while (true) {
                        v17 /* !! */  = (long)(v18 - ip.his("hzp", hki(int ), (int)176));
lbl135:
                        // 2 sources

                        switch ((int)v17 /* !! */ ) {
                            case -685753601: {
                                v18 = ip.his("hzq", hki(int ), (int)177);
                                continue block55;
                            }
                            case 467266653: {
                                v18 = ip.his("hzr", hki(int ), (int)178);
                                continue block55;
                            }
                            case 1856801289: {
                                break block55;
                            }
                        }
                        break;
                    }
                    v15.method_6104(class_1268.field_5808);
                    if (!var2_4 && !var2_4) return;
                    return;
                    case 0: {
                        var3_3 /* !! */  = (int)ip.his("hzs", hip(int ), (int)258);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 5: {
                        var3_3 /* !! */  = (int)ip.his("hzx", hip(int ), (int)263);
                        cfr_temp_0 = 0;
                        if (var4_2) {
                            throw null;
                        }
                        break block71;
                    }
                    case 2: {
                        var3_3 /* !! */  = (int)ip.his("hzu", hip(int ), (int)260);
                        if (var4_2) {
                            throw null;
                        }
                    }
                    case 3: 
                }
                ** GOTO lbl166
            }
            do {
                if (true) continue block45;
lbl166:
                // 2 sources

                var3_3 /* !! */  = (int)ip.his("hzv", hip(int ), (int)261);
                cfr_temp_0 = 2;
            } while (!var4_2);
            break;
        }
        throw null;
    }

    public static /* synthetic */ CallSite his(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void attackWithHotbarMace(int var1_1, class_1309 var2_2) {
        v0 /* !! */  = ip.ag;
        if (true) ** GOTO lbl5
        block54: while (true) {
            v0 /* !! */  = (long)(ip.his("hrj", hki(int ), (int)54) - ip.his("hri", hki(int ), (int)53));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -206295855: {
                    continue block54;
                }
                case 1856801289: {
                    break block54;
                }
            }
            break;
        }
        var6_3 = ip.c;
        v1 /* !! */  = ip.ag;
        if (true) ** GOTO lbl15
        block55: while (true) {
            v1 /* !! */  = (long)(ip.his("hrl", hki(int ), (int)56) - ip.his("hrk", hki(int ), (int)55));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1730942845: {
                    continue block55;
                }
                case 1856801289: {
                    break block55;
                }
            }
            break;
        }
        var5_4 /* !! */  = ip.b;
        v2 /* !! */  = ip.ag;
        if (true) ** GOTO lbl25
        block56: while (true) {
            v2 /* !! */  = (long)(v3 - ip.his("hrm", hki(int ), (int)57));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -468783695: {
                    v3 = ip.his("hrn", hki(int ), (int)58);
                    continue block56;
                }
                case 251522740: {
                    v3 = ip.his("hro", hki(int ), (int)59);
                    continue block56;
                }
                case 1856801289: {
                    break block56;
                }
            }
            break;
        }
        var4_5 = ip.a;
        if (var6_3) {
            throw null;
lbl37:
            // 5 sources

            return;
        }
        if (var4_5 || var4_5) ** GOTO lbl37
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = ip.ag - ip.his("hrp", hki(int ), (int)60)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ip.his("hrq", hip(int ), (int)166)) break;
            v4 /* !! */  = (long)ip.his("hrr", hip(int ), (int)167);
        }
        v5 /* !! */  = ip.ag;
        if (true) ** GOTO lbl49
        block59: while (true) {
            v5 /* !! */  = (long)(v6 - ip.his("hrs", hki(int ), (int)61));
lbl49:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -987551695: {
                    v6 = ip.his("hrt", hki(int ), (int)62);
                    continue block59;
                }
                case -932747049: {
                    v6 = ip.his("hru", hki(int ), (int)63);
                    continue block59;
                }
                case 1856801289: {
                    break block59;
                }
            }
            break;
        }
        v7 = ip.mc.field_1724;
        v8 /* !! */  = ip.ag;
        if (true) ** GOTO lbl63
        block60: while (true) {
            v8 /* !! */  = (long)(ip.his("hrw", hki(int ), (int)65) - ip.his("hrv", hki(int ), (int)64));
lbl63:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case 1856801289: {
                    break block60;
                }
                case 2024550822: {
                    continue block60;
                }
            }
            break;
        }
        v9 = v7.method_31548();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_1 = ip.ag - ip.his("hrx", hki(int ), (int)66)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ip.his("hry", hip(int ), (int)168)) break;
            v10 /* !! */  = (long)ip.his("hrz", hip(int ), (int)169);
        }
        var3_6 = v9.method_67532();
        if (var4_5 || var4_5) ** GOTO lbl37
        v11 /* !! */  = ip.ag;
        if (true) ** GOTO lbl80
        block62: while (true) {
            v11 /* !! */  = (long)(v12 - ip.his("hsa", hki(int ), (int)67));
lbl80:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1218838715: {
                    v12 = ip.his("hsb", hki(int ), (int)68);
                    continue block62;
                }
                case 1856801289: {
                    break block62;
                }
                case 1914539382: {
                    v12 = ip.his("hsc", hki(int ), (int)69);
                    continue block62;
                }
            }
            break;
        }
        while (true) {
            if ((v13 /* !! */  = (cfr_temp_2 = ip.ag - ip.his("hsd", hki(int ), (int)70)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v13 /* !! */  == ip.his("hse", hip(int ), (int)170)) break;
            v13 /* !! */  = (long)ip.his("hsf", hip(int ), (int)171);
        }
        v14 = ip.mc.method_1562();
        while (true) {
            if ((v15 /* !! */  = (cfr_temp_3 = ip.ag - ip.his("hsg", hki(int ), (int)71)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v15 /* !! */  == ip.his("hsh", hip(int ), (int)172)) break;
            v15 /* !! */  = (long)ip.his("hsi", hip(int ), (int)173);
        }
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_4 = ip.ag - ip.his("hsj", hki(int ), (int)72)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == ip.his("hsk", hip(int ), (int)174)) break;
            v16 /* !! */  = (long)ip.his("hsl", hip(int ), (int)175);
        }
        v17 = new class_2868(var1_1);
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_5 = ip.ag - ip.his("hsm", hki(int ), (int)73)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == ip.his("hsn", hip(int ), (int)176)) break;
            v18 /* !! */  = (long)ip.his("hso", hip(int ), (int)177);
        }
        v14.method_52787((class_2596)v17);
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_5 || var4_5) ** GOTO lbl37
                v19 /* !! */  = ip.ag;
                if (true) ** GOTO lbl120
                block67: while (true) {
                    v19 /* !! */  = (long)(ip.his("hsq", hki(int ), (int)75) - ip.his("hsp", hki(int ), (int)74));
lbl120:
                    // 2 sources

                    switch ((int)v19 /* !! */ ) {
                        case 98821204: {
                            continue block67;
                        }
                        case 1856801289: {
                            break block67;
                        }
                    }
                    break;
                }
                this.attack(var2_2);
                if (var4_5 || var4_5) ** GOTO lbl37
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = ip.ag - ip.his("hsr", hki(int ), (int)76)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == ip.his("hss", hip(int ), (int)178)) break;
                    v20 /* !! */  = (long)ip.his("hst", hip(int ), (int)179);
                }
                v21 /* !! */  = ip.ag;
                if (true) ** GOTO lbl136
                block69: while (true) {
                    v21 /* !! */  = (long)(ip.his("hsv", hki(int ), (int)78) - ip.his("hsu", hki(int ), (int)77));
lbl136:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case 107250942: {
                            continue block69;
                        }
                        case 1856801289: {
                            break block69;
                        }
                    }
                    break;
                }
                v22 = ip.mc.method_1562();
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = ip.ag - ip.his("hsw", hki(int ), (int)79)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ip.his("hsx", hip(int ), (int)180)) break;
                    v23 /* !! */  = (long)ip.his("hsy", hip(int ), (int)181);
                }
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = ip.ag - ip.his("hsz", hki(int ), (int)80)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ip.his("hta", hip(int ), (int)182)) break;
                    v24 /* !! */  = (long)ip.his("htb", hip(int ), (int)183);
                }
                v25 = new class_2868(var3_6);
                v26 /* !! */  = ip.ag;
                if (true) ** GOTO lbl157
                block72: while (true) {
                    v26 /* !! */  = (long)(v27 - ip.his("htc", hki(int ), (int)81));
lbl157:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -232535229: {
                            v27 = ip.his("htd", hki(int ), (int)82);
                            continue block72;
                        }
                        case 1377762004: {
                            v27 = ip.his("hte", hki(int ), (int)83);
                            continue block72;
                        }
                        case 1856801289: {
                            break block72;
                        }
                    }
                    break;
                }
                v22.method_52787((class_2596)v25);
                if (var4_5 || var4_5) ** continue;
                return;
            }
            case 0: {
                var5_4 /* !! */  = (int)ip.his("htf", hip(int ), (int)184);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl174:
            // 2 sources

            case 1: {
                var5_4 /* !! */  = (int)ip.his("htg", hip(int ), (int)185);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)ip.his("hth", hip(int ), (int)186);
                    if (var6_3) {
                        throw null;
                    }
                    ** GOTO lbl212
                    break;
                }
            }
lbl185:
            // 3 sources

            case 3: {
                var5_4 /* !! */  = (int)ip.his("hti", hip(int ), (int)187);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl195
            }
lbl190:
            // 2 sources

            case 4: {
                var5_4 /* !! */  = (int)ip.his("htj", hip(int ), (int)188);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl203
            }
lbl195:
            // 2 sources

            case 5: {
                var5_4 /* !! */  = (int)ip.his("htk", hip(int ), (int)189);
                if (!var6_3) ** GOTO lbl174
                throw null;
            }
lbl199:
            // 2 sources

            case 6: {
                var5_4 /* !! */  = (int)ip.his("htl", hip(int ), (int)190);
                if (!var6_3) ** GOTO lbl185
                throw null;
            }
lbl203:
            // 2 sources

            case 7: {
                var5_4 /* !! */  = (int)ip.his("htm", hip(int ), (int)191);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl212
            }
lbl208:
            // 2 sources

            case 8: {
                var5_4 /* !! */  = (int)ip.his("htn", hip(int ), (int)192);
                if (!var6_3) ** GOTO lbl185
                throw null;
            }
lbl212:
            // 4 sources

            case 9: {
                var5_4 /* !! */  = (int)ip.his("hto", hip(int ), (int)193);
                if (!var6_3) ** GOTO lbl190
                throw null;
            }
            case 10: {
                var5_4 /* !! */  = (int)ip.his("htp", hip(int ), (int)194);
                if (!var6_3) ** GOTO lbl208
                throw null;
            }
            case 11: 
        }
        var5_4 /* !! */  = (int)ip.his("htq", hip(int ), (int)195);
        ** while (!var6_3)
lbl223:
        // 1 sources

        throw null;
    }

    static {
        hiq = new int[293];
        hir = new int[293];
        ip.iby();
        ip.ibz();
        ip.ica();
        ip.icb();
        ip.icc();
        ip.icd();
        hkj = new long[202];
        hkk = new long[202];
        ip.ice();
        ip.icf();
        ip.icg();
        ip.ich();
        ip.ici();
        ip.icj();
        mc = class_310.method_1551();
    }

    private static /* synthetic */ int hip(int n2) {
        return hiq[n2] ^ hir[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void attackWithOffhandMace(class_1309 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ip.ag - ip.his("hwb", hki(int ), (int)122)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ip.his("hwc", hip(int ), (int)220)) break;
            v0 /* !! */  = (long)ip.his("hwd", hip(int ), (int)221);
        }
        var5_2 = ip.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ip.ag - ip.his("hwe", hki(int ), (int)123)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ip.his("hwf", hip(int ), (int)222)) break;
            v1 /* !! */  = (long)ip.his("hwg", hip(int ), (int)223);
        }
        var4_3 /* !! */  = ip.b;
        v2 /* !! */  = ip.ag;
        if (true) ** GOTO lbl17
        block61: while (true) {
            v2 /* !! */  = (long)(v3 - ip.his("hwh", hki(int ), (int)124));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -23484310: {
                    v3 = ip.his("hwi", hki(int ), (int)125);
                    continue block61;
                }
                case 1754062280: {
                    v3 = ip.his("hwj", hki(int ), (int)126);
                    continue block61;
                }
                case 1787740560: {
                    v3 = ip.his("hwk", hki(int ), (int)127);
                    continue block61;
                }
                case 1856801289: {
                    break block61;
                }
            }
            break;
        }
        var3_4 = ip.a;
        if (var5_2) {
            throw null;
lbl32:
            // 6 sources

            return;
        }
        if (var3_4 || var3_4) ** GOTO lbl32
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = ip.ag - ip.his("hwl", hki(int ), (int)128)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ip.his("hwm", hip(int ), (int)224)) break;
            v4 /* !! */  = (long)ip.his("hwn", hip(int ), (int)225);
        }
        v5 /* !! */  = ip.ag;
        if (true) ** GOTO lbl44
        block64: while (true) {
            v5 /* !! */  = (long)(ip.his("hwp", hki(int ), (int)130) - ip.his("hwo", hki(int ), (int)129));
lbl44:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 378101229: {
                    continue block64;
                }
                case 1856801289: {
                    break block64;
                }
            }
            break;
        }
        v6 = ip.mc.field_1724;
        v7 /* !! */  = ip.ag;
        if (true) ** GOTO lbl54
        block65: while (true) {
            v7 /* !! */  = (long)(v8 - ip.his("hwq", hki(int ), (int)131));
lbl54:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1447486777: {
                    v8 = ip.his("hwr", hki(int ), (int)132);
                    continue block65;
                }
                case -1338267376: {
                    v8 = ip.his("hws", hki(int ), (int)133);
                    continue block65;
                }
                case 846332532: {
                    v8 = ip.his("hwt", hki(int ), (int)134);
                    continue block65;
                }
                case 1856801289: {
                    break block65;
                }
            }
            break;
        }
        v9 = v6.method_31548();
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_3 = ip.ag - ip.his("hwu", hki(int ), (int)135)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == ip.his("hwv", hip(int ), (int)226)) break;
            v10 /* !! */  = (long)ip.his("hww", hip(int ), (int)227);
        }
        v11 = v9.method_67532();
        v12 /* !! */  = ip.ag;
        if (true) ** GOTO lbl77
        block67: while (true) {
            v12 /* !! */  = (long)(ip.his("hwy", hki(int ), (int)137) - ip.his("hwx", hki(int ), (int)136));
lbl77:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case 1746152027: {
                    continue block67;
                }
                case 1856801289: {
                    break block67;
                }
            }
            break;
        }
        var2_5 = nv.wrapSlot(v11);
        if (var3_4 || var3_4) ** GOTO lbl32
        v13 = ip.his("hwz", hip(int ), (int)228);
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_4 = ip.ag - ip.his("hxa", hki(int ), (int)138)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == ip.his("hxb", hip(int ), (int)229)) break;
            v14 /* !! */  = (long)ip.his("hxc", hip(int ), (int)230);
        }
        v15 /* !! */  = ip.ag;
        if (true) ** GOTO lbl94
        block69: while (true) {
            v15 /* !! */  = (long)(v16 - ip.his("hxd", hki(int ), (int)139));
lbl94:
            // 2 sources

            switch ((int)v15 /* !! */ ) {
                case -361652277: {
                    v16 = ip.his("hxe", hki(int ), (int)140);
                    continue block69;
                }
                case 248509134: {
                    v16 = ip.his("hxf", hki(int ), (int)141);
                    continue block69;
                }
                case 1856801289: {
                    break block69;
                }
                case 2099948302: {
                    v16 = ip.his("hxg", hki(int ), (int)142);
                    continue block69;
                }
            }
            break;
        }
        nv.click(var2_5, (int)v13, class_1713.field_7791);
        if (var4_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_4 || var3_4) ** GOTO lbl32
                v17 /* !! */  = ip.ag;
                if (true) ** GOTO lbl115
                block70: while (true) {
                    v17 /* !! */  = (long)(v18 - ip.his("hxh", hki(int ), (int)143));
lbl115:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1612002250: {
                            v18 = ip.his("hxi", hki(int ), (int)144);
                            continue block70;
                        }
                        case -1325817836: {
                            v18 = ip.his("hxj", hki(int ), (int)145);
                            continue block70;
                        }
                        case 1856801289: {
                            break block70;
                        }
                    }
                    break;
                }
                this.attack(var1_1);
                if (var3_4 || var3_4) ** GOTO lbl32
                v19 = ip.his("hxk", hip(int ), (int)231);
                v20 /* !! */  = ip.ag;
                if (true) ** GOTO lbl131
                block71: while (true) {
                    v20 /* !! */  = (long)(v21 - ip.his("hxl", hki(int ), (int)146));
lbl131:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1471713062: {
                            v21 = ip.his("hxm", hki(int ), (int)147);
                            continue block71;
                        }
                        case -1091059890: {
                            v21 = ip.his("hxn", hki(int ), (int)148);
                            continue block71;
                        }
                        case 1618148814: {
                            v21 = ip.his("hxo", hki(int ), (int)149);
                            continue block71;
                        }
                        case 1856801289: {
                            break block71;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v22 /* !! */  = (cfr_temp_5 = ip.ag - ip.his("hxp", hki(int ), (int)150)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v22 /* !! */  == ip.his("hxq", hip(int ), (int)232)) break;
                    v22 /* !! */  = (long)ip.his("hxr", hip(int ), (int)233);
                }
                nv.click(var2_5, (int)v19, class_1713.field_7791);
                if (var3_4 || var3_4) ** GOTO lbl32
                v23 /* !! */  = ip.ag;
                if (true) ** GOTO lbl154
                block73: while (true) {
                    v23 /* !! */  = (long)(v24 - ip.his("hxs", hki(int ), (int)151));
lbl154:
                    // 2 sources

                    switch ((int)v23 /* !! */ ) {
                        case -433568529: {
                            v24 = ip.his("hxt", hki(int ), (int)152);
                            continue block73;
                        }
                        case 1007428014: {
                            v24 = ip.his("hxu", hki(int ), (int)153);
                            continue block73;
                        }
                        case 1207155370: {
                            v24 = ip.his("hxv", hki(int ), (int)154);
                            continue block73;
                        }
                        case 1856801289: {
                            break block73;
                        }
                    }
                    break;
                }
                nv.closeScreen();
                if (var3_4 || var3_4) ** continue;
                return;
            }
            case 0: {
                var4_3 /* !! */  = (int)ip.his("hxw", hip(int ), (int)234);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl174:
            // 3 sources

            case 1: {
                var4_3 /* !! */  = (int)ip.his("hxx", hip(int ), (int)235);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
            case 2: {
                var4_3 /* !! */  = (int)ip.his("hxy", hip(int ), (int)236);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
            case 3: {
                var4_3 /* !! */  = (int)ip.his("hxz", hip(int ), (int)237);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl189:
            // 2 sources

            case 4: {
                var4_3 /* !! */  = (int)ip.his("hya", hip(int ), (int)238);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl221
            }
            case 5: {
                do {
                    var4_3 /* !! */  = (int)ip.his("hyb", hip(int ), (int)239);
                } while (!var5_2);
                throw null;
            }
lbl199:
            // 3 sources

            case 6: {
                var4_3 /* !! */  = (int)ip.his("hyc", hip(int ), (int)240);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 7: {
                var4_3 /* !! */  = (int)ip.his("hyd", hip(int ), (int)241);
                if (var5_2) {
                    throw null;
                }
                ** GOTO lbl217
            }
lbl209:
            // 2 sources

            case 8: {
                var4_3 /* !! */  = (int)ip.his("hye", hip(int ), (int)242);
                if (!var5_2) ** GOTO lbl189
                throw null;
            }
lbl213:
            // 2 sources

            case 9: {
                var4_3 /* !! */  = (int)ip.his("hyf", hip(int ), (int)243);
                if (!var5_2) ** GOTO lbl174
                throw null;
            }
lbl217:
            // 3 sources

            case 10: {
                var4_3 /* !! */  = (int)ip.his("hyg", hip(int ), (int)244);
                if (var5_2) {
                    throw null;
                }
            }
lbl221:
            // 4 sources

            case 11: {
                var4_3 /* !! */  = (int)ip.his("hyh", hip(int ), (int)245);
                if (!var5_2) break;
                throw null;
            }
            case 12: {
                var4_3 /* !! */  = (int)ip.his("hyi", hip(int ), (int)246);
                if (!var5_2) ** GOTO lbl174
                throw null;
            }
            case 13: 
        }
        do {
            var4_3 /* !! */  = (int)ip.his("hyj", hip(int ), (int)247);
        } while (!var5_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void releaseMace() {
        block56: {
            v0 /* !! */  = ip.ag;
            if (true) ** GOTO lbl5
            block35: while (true) {
                v0 /* !! */  = (long)(v1 - ip.his("hkl", hki(int ), (int)0));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case 232291546: {
                        v1 = ip.his("hkm", hki(int ), (int)1);
                        continue block35;
                    }
                    case 1420008881: {
                        v1 = ip.his("hkn", hki(int ), (int)2);
                        continue block35;
                    }
                    case 1856801289: {
                        break block35;
                    }
                    case 2051037778: {
                        v1 = ip.his("hko", hki(int ), (int)3);
                        continue block35;
                    }
                }
                break;
            }
            var3_1 = ip.c;
            v2 /* !! */  = ip.ag;
            if (true) ** GOTO lbl22
            block36: while (true) {
                v2 /* !! */  = (long)(ip.his("hkq", hki(int ), (int)5) - ip.his("hkp", hki(int ), (int)4));
lbl22:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -212106049: {
                        continue block36;
                    }
                    case 1856801289: {
                        break block36;
                    }
                }
                break;
            }
            var2_2 /* !! */  = ip.b;
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_0 = ip.ag - ip.his("hkr", hki(int ), (int)6)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ip.his("hks", hip(int ), (int)41)) break;
                v3 /* !! */  = (long)ip.his("hkt", hip(int ), (int)42);
            }
            var1_3 = ip.a;
            if (var3_1) {
                throw null;
lbl36:
                // 7 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl36
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_1 = ip.ag - ip.his("hku", hki(int ), (int)7)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ip.his("hkv", hip(int ), (int)43)) break;
                v4 /* !! */  = (long)ip.his("hkw", hip(int ), (int)44);
            }
            if (this.savedSlot == ip.his("hkx", hip(int ), (int)45)) break block56;
            if (var1_3) ** GOTO lbl36
            v5 /* !! */  = ip.ag;
            if (true) ** GOTO lbl50
            block40: while (true) {
                v5 /* !! */  = (long)(v6 - ip.his("hky", hki(int ), (int)8));
lbl50:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -626549284: {
                        v6 = ip.his("hkz", hki(int ), (int)9);
                        continue block40;
                    }
                    case 1481066027: {
                        v6 = ip.his("hla", hki(int ), (int)10);
                        continue block40;
                    }
                    case 1856801289: {
                        break block40;
                    }
                }
                break;
            }
            while (true) {
                if ((v7 /* !! */  = (cfr_temp_2 = ip.ag - ip.his("hlb", hki(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v7 /* !! */  == ip.his("hlc", hip(int ), (int)46)) break;
                v7 /* !! */  = (long)ip.his("hld", hip(int ), (int)47);
            }
            if (ip.mc.field_1724 == null) break block56;
            if (var1_3 || var1_3) ** GOTO lbl36
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = ip.ag - ip.his("hle", hki(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == ip.his("hlf", hip(int ), (int)48)) break;
                v8 /* !! */  = (long)ip.his("hlg", hip(int ), (int)49);
            }
            while (true) {
                if ((v9 /* !! */  = (cfr_temp_4 = ip.ag - ip.his("hlh", hki(int ), (int)13)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v9 /* !! */  == ip.his("hli", hip(int ), (int)50)) break;
                v9 /* !! */  = (long)ip.his("hlj", hip(int ), (int)51);
            }
            nv.selectSlot(this.savedSlot);
            if (var1_3) ** GOTO lbl36
        }
        if (var1_3) ** GOTO lbl36
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl36
                v10 = ip.his("hlk", hip(int ), (int)52);
                v11 /* !! */  = ip.ag;
                if (true) ** GOTO lbl89
                block44: while (true) {
                    v11 /* !! */  = (long)(v12 - ip.his("hll", hki(int ), (int)14));
lbl89:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1440218522: {
                            v12 = ip.his("hlm", hki(int ), (int)15);
                            continue block44;
                        }
                        case 26624528: {
                            v12 = ip.his("hln", hki(int ), (int)16);
                            continue block44;
                        }
                        case 635497818: {
                            v12 = ip.his("hlo", hki(int ), (int)17);
                            continue block44;
                        }
                        case 1856801289: {
                            break block44;
                        }
                    }
                    break;
                }
                this.savedSlot = (int)v10;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl105:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ip.his("hlp", hip(int ), (int)53);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl151
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ip.his("hlq", hip(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl143
            }
lbl116:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)ip.his("hlr", hip(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl147
            }
            case 3: {
                var2_2 /* !! */  = (int)ip.his("hls", hip(int ), (int)56);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl151
            }
lbl126:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)ip.his("hlt", hip(int ), (int)57);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)ip.his("hlu", hip(int ), (int)58);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl139
            }
lbl135:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)ip.his("hlv", hip(int ), (int)59);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl139:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)ip.his("hlw", hip(int ), (int)60);
                if (!var3_1) ** GOTO lbl116
                throw null;
            }
lbl143:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)ip.his("hlx", hip(int ), (int)61);
                if (!var3_1) ** GOTO lbl126
                throw null;
            }
lbl147:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)ip.his("hly", hip(int ), (int)62);
                if (!var3_1) break;
                throw null;
            }
lbl151:
            // 3 sources

            case 10: {
                var2_2 /* !! */  = (int)ip.his("hlz", hip(int ), (int)63);
                if (!var3_1) ** GOTO lbl135
                throw null;
            }
            case 11: 
        }
        var2_2 /* !! */  = (int)ip.his("hma", hip(int ), (int)64);
        ** while (!var3_1)
lbl158:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ long hki(int n2) {
        return hkj[n2] ^ hkk[n2];
    }

    private static /* synthetic */ void ice() {
        ip.hkj[0] = -4509056013385436031L;
        ip.hkj[1] = -4969259998757420905L;
        ip.hkj[2] = -180856486167664201L;
        ip.hkj[3] = 8561248877304775769L;
        ip.hkj[4] = -5659869426921705056L;
        ip.hkj[5] = -2792342772685218779L;
        ip.hkj[6] = 4292350204230384601L;
        ip.hkj[7] = -2493264246400561654L;
        ip.hkj[8] = -6810077720528181738L;
        ip.hkj[9] = -9136407141848102445L;
        ip.hkj[10] = -8941904483401684455L;
        ip.hkj[11] = 1218081759546078754L;
        ip.hkj[12] = -7718058717018127548L;
        ip.hkj[13] = -1209518701704139196L;
        ip.hkj[14] = -2212011942988391098L;
        ip.hkj[15] = 9078525263600001622L;
        ip.hkj[16] = -6070754655673803125L;
        ip.hkj[17] = 1473496530817052878L;
        ip.hkj[18] = 46044140701980694L;
        ip.hkj[19] = -7584730133112123235L;
        ip.hkj[20] = 5454860047589638091L;
        ip.hkj[21] = -7967976948161215741L;
        ip.hkj[22] = 6786305690956533301L;
        ip.hkj[23] = -1814464298822106866L;
        ip.hkj[24] = 8306010323627431423L;
        ip.hkj[25] = 80592869851518028L;
        ip.hkj[26] = 1535721088834538776L;
        ip.hkj[27] = -5678015497406287282L;
        ip.hkj[28] = 238520412873895071L;
        ip.hkj[29] = 4947644433398479715L;
        ip.hkj[30] = 1483703977754626516L;
        ip.hkj[31] = 2693313837951140093L;
        ip.hkj[32] = 1734465706037270390L;
        ip.hkj[33] = -4097859146877006435L;
        ip.hkj[34] = -572760194112460644L;
        ip.hkj[35] = -626357202079817597L;
        ip.hkj[36] = 392386117768905878L;
        ip.hkj[37] = -7462855308357403142L;
        ip.hkj[38] = -3467953306287570582L;
        ip.hkj[39] = -1549675714501348388L;
        ip.hkj[40] = -1234484369986633512L;
        ip.hkj[41] = 5961305238752383480L;
        ip.hkj[42] = 7861778988661780492L;
        ip.hkj[43] = -6310997404268301469L;
        ip.hkj[44] = 2274696304763858302L;
        ip.hkj[45] = 8832709351392317495L;
        ip.hkj[46] = -2690925166372038927L;
        ip.hkj[47] = -1132650606365915532L;
        ip.hkj[48] = -1873877798929590875L;
        ip.hkj[49] = -5755263334819419279L;
        ip.hkj[50] = -9174989640153166540L;
        ip.hkj[51] = -4990564474496587454L;
        ip.hkj[52] = -3726339167955162975L;
        ip.hkj[53] = 1810612933009215415L;
        ip.hkj[54] = -159665130337441390L;
        ip.hkj[55] = -2271734916242601424L;
        ip.hkj[56] = -1779677942641914167L;
        ip.hkj[57] = -5185255447394189609L;
        ip.hkj[58] = 1075560898356058364L;
        ip.hkj[59] = -732911728468742232L;
        ip.hkj[60] = 426714774226036872L;
        ip.hkj[61] = 934762442674547042L;
        ip.hkj[62] = 7907582779425284761L;
        ip.hkj[63] = 6327860059348302904L;
        ip.hkj[64] = 5439344298264900877L;
        ip.hkj[65] = 1631808702785034830L;
        ip.hkj[66] = 6874881458654259687L;
        ip.hkj[67] = 5660714372625350972L;
        ip.hkj[68] = 7935388953299133859L;
        ip.hkj[69] = -175281932294825722L;
        ip.hkj[70] = 2217164567898264886L;
        ip.hkj[71] = -3281614279446435816L;
        ip.hkj[72] = -6853716797626981214L;
        ip.hkj[73] = -4778041351855937853L;
        ip.hkj[74] = -6864248299434142665L;
        ip.hkj[75] = 5673485574909354292L;
        ip.hkj[76] = 8187112176052652348L;
        ip.hkj[77] = -5968861671839895053L;
        ip.hkj[78] = 2500907268328978749L;
        ip.hkj[79] = 10729625486127169L;
        ip.hkj[80] = 8046791589419305112L;
        ip.hkj[81] = 3430194300116220796L;
        ip.hkj[82] = -235138807299348172L;
        ip.hkj[83] = -2896776873928010064L;
        ip.hkj[84] = 891312396162470809L;
        ip.hkj[85] = 323919081415000520L;
        ip.hkj[86] = -3940111498541021894L;
        ip.hkj[87] = -192414092431907348L;
        ip.hkj[88] = -8732652236194886438L;
        ip.hkj[89] = 1087044653043050516L;
        ip.hkj[90] = 3908251457540866058L;
        ip.hkj[91] = 4481342848906423181L;
        ip.hkj[92] = 8706303718432368446L;
        ip.hkj[93] = 9177550056835558515L;
        ip.hkj[94] = -7000248095371332089L;
        ip.hkj[95] = 8463183352100544137L;
        ip.hkj[96] = -1180421623323514576L;
        ip.hkj[97] = 8249077919177592850L;
        ip.hkj[98] = -2475042542960129770L;
        ip.hkj[99] = -3560364427526380806L;
    }

    private static /* synthetic */ void icf() {
        ip.hkj[100] = 7485298802533717062L;
        ip.hkj[101] = 8591033593616442282L;
        ip.hkj[102] = 5256515194222958563L;
        ip.hkj[103] = 3949388307276491033L;
        ip.hkj[104] = 2366438166736027226L;
        ip.hkj[105] = 2481017592216294032L;
        ip.hkj[106] = 5427928959965569989L;
        ip.hkj[107] = 1650620613624892144L;
        ip.hkj[108] = 3658015152620050303L;
        ip.hkj[109] = -5266634042888009258L;
        ip.hkj[110] = 2919755845437196872L;
        ip.hkj[111] = -3110496458775336157L;
        ip.hkj[112] = -8393346199542017250L;
        ip.hkj[113] = 6081721372536182267L;
        ip.hkj[114] = -9108238012643270671L;
        ip.hkj[115] = -7787942653891559441L;
        ip.hkj[116] = -7158908346520759222L;
        ip.hkj[117] = 6346580533572543431L;
        ip.hkj[118] = 7666778474225356708L;
        ip.hkj[119] = 3800563560622990669L;
        ip.hkj[120] = 6233428294486908688L;
        ip.hkj[121] = 6222714245553690603L;
        ip.hkj[122] = 1575964140797878295L;
        ip.hkj[123] = 1776004598896932835L;
        ip.hkj[124] = -992717513841541009L;
        ip.hkj[125] = 4069204361441794332L;
        ip.hkj[126] = 3094841255897422284L;
        ip.hkj[127] = -1347674079397851064L;
        ip.hkj[128] = 7891864734485964970L;
        ip.hkj[129] = -4602222230248847706L;
        ip.hkj[130] = 1744578815882483239L;
        ip.hkj[131] = -1480783859230066524L;
        ip.hkj[132] = -166275554818325875L;
        ip.hkj[133] = 3090764649441736665L;
        ip.hkj[134] = -1259978111434436191L;
        ip.hkj[135] = 8682034978917556436L;
        ip.hkj[136] = -5227814945253494340L;
        ip.hkj[137] = -8873197474490594129L;
        ip.hkj[138] = 68613038324522199L;
        ip.hkj[139] = -7182399063889311381L;
        ip.hkj[140] = -155356771577133036L;
        ip.hkj[141] = -272134992547234596L;
        ip.hkj[142] = 2247308417668510560L;
        ip.hkj[143] = -1976768238272452797L;
        ip.hkj[144] = -4348094345112865365L;
        ip.hkj[145] = 3343404311802934482L;
        ip.hkj[146] = -6404207310195595105L;
        ip.hkj[147] = -1526530606587618517L;
        ip.hkj[148] = -7369840497388767021L;
        ip.hkj[149] = -3574953160497670567L;
        ip.hkj[150] = 2987727159696042034L;
        ip.hkj[151] = 2321536133785239699L;
        ip.hkj[152] = 6021358094141964261L;
        ip.hkj[153] = -6424051728934920306L;
        ip.hkj[154] = 6433750826105112377L;
        ip.hkj[155] = 8939550032321558745L;
        ip.hkj[156] = -1533053665908332095L;
        ip.hkj[157] = 4103171959465468982L;
        ip.hkj[158] = 3738499147669855404L;
        ip.hkj[159] = -5331694929551302402L;
        ip.hkj[160] = 6298268650267622269L;
        ip.hkj[161] = 6384527443742468124L;
        ip.hkj[162] = 1038887519719396480L;
        ip.hkj[163] = 12562068323810211L;
        ip.hkj[164] = 873687712566615284L;
        ip.hkj[165] = -3631636518340073761L;
        ip.hkj[166] = 5591356607309478165L;
        ip.hkj[167] = -2007931450245693881L;
        ip.hkj[168] = -2615227723987515974L;
        ip.hkj[169] = -5950765262821521763L;
        ip.hkj[170] = -2627897890957618098L;
        ip.hkj[171] = -6319150988896544302L;
        ip.hkj[172] = -8584256755250932847L;
        ip.hkj[173] = -192256865338582927L;
        ip.hkj[174] = -720628566174108425L;
        ip.hkj[175] = 1733623847913120537L;
        ip.hkj[176] = -5410640691536798678L;
        ip.hkj[177] = 2089912122800421160L;
        ip.hkj[178] = 3228761072583506281L;
        ip.hkj[179] = -7800993635451403046L;
        ip.hkj[180] = -8785682895496981750L;
        ip.hkj[181] = 5078323844447055983L;
        ip.hkj[182] = -5392570190224211353L;
        ip.hkj[183] = -4533327530690993760L;
        ip.hkj[184] = -6089231237861790528L;
        ip.hkj[185] = -390666761338936588L;
        ip.hkj[186] = 7238652300307829870L;
        ip.hkj[187] = -74698637571558892L;
        ip.hkj[188] = -7052017186463551568L;
        ip.hkj[189] = 1124520600494596507L;
        ip.hkj[190] = -4303815449131497050L;
        ip.hkj[191] = 3169790407029782127L;
        ip.hkj[192] = 4734468391555055497L;
        ip.hkj[193] = -2764253958377788153L;
        ip.hkj[194] = 5028127996617368703L;
        ip.hkj[195] = -5018426665719001787L;
        ip.hkj[196] = -456703297898028765L;
        ip.hkj[197] = 3663425261290932335L;
        ip.hkj[198] = 970459937567781581L;
        ip.hkj[199] = -9219263030362419642L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ip() {
        var2_1 /* !! */  = ip.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.savedSlot = (int)ip.his("hit", hip(int ), (int)0);
                return;
            }
lbl8:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)ip.his("hiu", hip(int ), (int)1);
                    continue;
                    break;
                }
            }
            case 1: {
                var2_1 /* !! */  = (int)ip.his("hiv", hip(int ), (int)2);
                ** GOTO lbl8
            }
            case 2: 
        }
        var2_1 /* !! */  = (int)ip.his("hiw", hip(int ), (int)3);
        ** while (true)
    }
}

