/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
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
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import ruhack.phobia.c;
import ruhack.phobia.hy;
import ruhack.phobia.ot;
import ruhack.phobia.ow;
import ruhack.phobia.ox;
import ruhack.phobia.oy;

public class ik
implements c {
    public static final boolean a;
    private static int[] sou;
    public static final boolean c;
    private Stream<class_1309> potentialTargets;
    private static long[] spd;
    private final ox pointFinder;
    private class_1309 currentTarget;
    private static int[] sot;
    public static final int b;
    private static long[] spc;
    protected static final long bb = -2360644135902744288L;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void validateTarget(Predicate<class_1309> var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("sqs", spb(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ik.sov("sqt", sos(int ), (int)28)) break;
            v0 /* !! */  = (long)ik.sov("squ", sos(int ), (int)29);
        }
        var4_2 = ik.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("sqv", spb(int ), (int)18)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ik.sov("sqw", sos(int ), (int)30)) break;
            v1 /* !! */  = (long)ik.sov("sqx", sos(int ), (int)31);
        }
        var3_3 /* !! */  = ik.b;
        v2 /* !! */  = ik.bb;
        if (true) ** GOTO lbl17
        block37: while (true) {
            v2 /* !! */  = (long)(v3 - ik.sov("sqy", spb(int ), (int)19));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -2002998913: {
                    v3 = ik.sov("sqz", spb(int ), (int)20);
                    continue block37;
                }
                case -1526552021: {
                    v3 = ik.sov("sra", spb(int ), (int)21);
                    continue block37;
                }
                case -1340508441: {
                    v3 = ik.sov("srb", spb(int ), (int)22);
                    continue block37;
                }
                case 1718120736: {
                    break block37;
                }
            }
            break;
        }
        var2_4 = ik.a;
        if (!var4_2) ** GOTO lbl36
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl36:
                // 1 sources

                if (var2_4 || var2_4) continue block38;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = ik.bb - ik.sov("src", spb(int ), (int)23)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == ik.sov("srd", sos(int ), (int)32)) break;
                    v4 /* !! */  = (long)ik.sov("sre", sos(int ), (int)33);
                }
                v5 = this.findFirstMatch(var1_1);
                v6 /* !! */  = ik.bb;
                if (true) ** GOTO lbl47
                block40: while (true) {
                    v6 /* !! */  = (long)(v7 - ik.sov("srf", spb(int ), (int)24));
lbl47:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1523989495: {
                            v7 = ik.sov("srg", spb(int ), (int)25);
                            continue block40;
                        }
                        case -1306218171: {
                            v7 = ik.sov("srh", spb(int ), (int)26);
                            continue block40;
                        }
                        case 1718120736: {
                            break block40;
                        }
                    }
                    break;
                }
                v8 = (Consumer<class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lockTarget(net.minecraft.class_1309 ), (Lnet/minecraft/class_1309;)V)((ik)this);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = ik.bb - ik.sov("sri", spb(int ), (int)27)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == ik.sov("srj", sos(int ), (int)34)) break;
                    v9 /* !! */  = (long)ik.sov("srk", sos(int ), (int)35);
                }
                v5.ifPresent(v8);
                if (var2_4 || var2_4) continue block38;
                v10 /* !! */  = ik.bb;
                if (true) ** GOTO lbl68
                block42: while (true) {
                    v10 /* !! */  = (long)(ik.sov("srm", spb(int ), (int)29) - ik.sov("srl", spb(int ), (int)28));
lbl68:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2047650080: {
                            continue block42;
                        }
                        case 1718120736: {
                            break block42;
                        }
                    }
                    break;
                }
                if (this.currentTarget == null) ** GOTO lbl105
                if (var2_4) continue block38;
                v11 /* !! */  = ik.bb;
                if (true) ** GOTO lbl79
                block43: while (true) {
                    v11 /* !! */  = (long)(v12 - ik.sov("srn", spb(int ), (int)30));
lbl79:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1934752923: {
                            v12 = ik.sov("sro", spb(int ), (int)31);
                            continue block43;
                        }
                        case 194660590: {
                            v12 = ik.sov("srp", spb(int ), (int)32);
                            continue block43;
                        }
                        case 1718120736: {
                            break block43;
                        }
                        case 1967975544: {
                            v12 = ik.sov("srq", spb(int ), (int)33);
                            continue block43;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = ik.bb - ik.sov("srr", spb(int ), (int)34)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == ik.sov("srs", sos(int ), (int)36)) break;
                    v13 /* !! */  = (long)ik.sov("srt", sos(int ), (int)37);
                }
                if (!var1_1.test(this.currentTarget)) {
                    if (var2_4 || var2_4) continue block38;
                    while (true) {
                        if ((v14 /* !! */  = (cfr_temp_5 = ik.bb - ik.sov("sru", spb(int ), (int)35)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                        if (v14 /* !! */  == ik.sov("srv", sos(int ), (int)38)) break;
                        v14 /* !! */  = (long)ik.sov("srw", sos(int ), (int)39);
                    }
                    this.releaseTarget();
                    if (var2_4) continue block38;
                }
lbl105:
                // 4 sources

                if (!var2_4 && !var2_4) ** break;
                continue block38;
                return;
lbl108:
                // 3 sources

                case 0: {
                    var3_3 /* !! */  = (int)ik.sov("srx", sos(int ), (int)40);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)ik.sov("sry", sos(int ), (int)41);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl129
                }
lbl117:
                // 2 sources

                case 2: {
                    var3_3 /* !! */  = (int)ik.sov("srz", sos(int ), (int)42);
                    if (!var4_2) break block38;
                    throw null;
                }
lbl121:
                // 3 sources

                case 3: {
                    var3_3 /* !! */  = (int)ik.sov("ssa", sos(int ), (int)43);
                    if (!var4_2) ** GOTO lbl108
                    throw null;
                }
                case 4: {
                    var3_3 /* !! */  = (int)ik.sov("ssb", sos(int ), (int)44);
                    if (var4_2) {
                        throw null;
                    }
                }
lbl129:
                // 5 sources

                case 5: {
                    var3_3 /* !! */  = (int)ik.sov("ssc", sos(int ), (int)45);
                    if (!var4_2) ** GOTO lbl121
                    throw null;
                }
lbl133:
                // 2 sources

                case 6: {
                    var3_3 /* !! */  = (int)ik.sov("ssd", sos(int ), (int)46);
                    if (!var4_2) ** GOTO lbl121
                    throw null;
                }
                case 7: {
                    var3_3 /* !! */  = (int)ik.sov("sse", sos(int ), (int)47);
                    if (!var4_2) ** GOTO lbl108
                    throw null;
                }
                case 8: {
                    var3_3 /* !! */  = (int)ik.sov("ssf", sos(int ), (int)48);
                    if (!var4_2) ** GOTO lbl133
                    throw null;
                }
                case 9: {
                    var3_3 /* !! */  = (int)ik.sov("ssg", sos(int ), (int)49);
                    if (!var4_2) ** GOTO lbl129
                    throw null;
                }
                case 10: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)ik.sov("ssh", sos(int ), (int)50);
                        if (!var4_2) ** GOTO lbl117
                        throw null;
                    }
                }
                case 11: 
            }
        }
        var3_3 /* !! */  = (int)ik.sov("ssi", sos(int ), (int)51);
        ** while (!var4_2)
lbl157:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private double getFov(class_1309 var1_1, float var2_2, boolean var3_3) {
        v0 /* !! */  = ik.bb;
        if (true) ** GOTO lbl5
        block61: while (true) {
            v0 /* !! */  = (long)(v1 - ik.sov("suj", spb(int ), (int)64));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 1038334317: {
                    v1 = ik.sov("suk", spb(int ), (int)65);
                    continue block61;
                }
                case 1718120736: {
                    break block61;
                }
                case 2076412964: {
                    v1 = ik.sov("sul", spb(int ), (int)66);
                    continue block61;
                }
            }
            break;
        }
        var7_4 = ik.c;
        v2 /* !! */  = ik.bb;
        if (true) ** GOTO lbl19
        block62: while (true) {
            v2 /* !! */  = (long)(v3 - ik.sov("sum", spb(int ), (int)67));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1775473272: {
                    v3 = ik.sov("sun", spb(int ), (int)68);
                    continue block62;
                }
                case 492408661: {
                    v3 = ik.sov("suo", spb(int ), (int)69);
                    continue block62;
                }
                case 1718120736: {
                    break block62;
                }
            }
            break;
        }
        var6_5 /* !! */  = ik.b;
        v4 /* !! */  = ik.bb;
        if (true) ** GOTO lbl33
        block63: while (true) {
            v4 /* !! */  = (long)(v5 - ik.sov("sup", spb(int ), (int)70));
lbl33:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -416443719: {
                    v5 = ik.sov("suq", spb(int ), (int)71);
                    continue block63;
                }
                case 1240773153: {
                    v5 = ik.sov("sur", spb(int ), (int)72);
                    continue block63;
                }
                case 1718120736: {
                    break block63;
                }
                case 1867349767: {
                    v5 = ik.sov("sus", spb(int ), (int)73);
                    continue block63;
                }
            }
            break;
        }
        var5_6 = ik.a;
        if (var7_4) {
            throw null;
lbl48:
            // 4 sources

            return (double)ik.sov("suu", sut(int ), (int)74);
        }
        if (var5_6 || var5_6) ** GOTO lbl48
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("suv", spb(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == ik.sov("suw", sos(int ), (int)76)) break;
            v6 /* !! */  = (long)ik.sov("szd", sos(int ), (int)77);
        }
        v7 /* !! */  = ik.bb;
        if (true) ** GOTO lbl60
        block66: while (true) {
            v7 /* !! */  = (long)(v8 - ik.sov("sze", spb(int ), (int)76));
lbl60:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case 644258289: {
                    v8 = ik.sov("szf", spb(int ), (int)77);
                    continue block66;
                }
                case 1321491082: {
                    v8 = ik.sov("szg", spb(int ), (int)78);
                    continue block66;
                }
                case 1718120736: {
                    break block66;
                }
            }
            break;
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("szh", spb(int ), (int)79)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == ik.sov("szi", sos(int ), (int)78)) break;
            v9 /* !! */  = (long)ik.sov("szj", sos(int ), (int)79);
        }
        v10 = ot.INSTANCE.getRotation();
        v11 /* !! */  = ik.bb;
        if (true) ** GOTO lbl79
        block68: while (true) {
            v11 /* !! */  = (long)(ik.sov("szl", spb(int ), (int)81) - ik.sov("szk", spb(int ), (int)80));
lbl79:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -2095556159: {
                    continue block68;
                }
                case 1718120736: {
                    break block68;
                }
            }
            break;
        }
        v12 /* !! */  = ik.bb;
        if (true) ** GOTO lbl88
        block69: while (true) {
            v12 /* !! */  = (long)(ik.sov("szn", spb(int ), (int)83) - ik.sov("szm", spb(int ), (int)82));
lbl88:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1091355096: {
                    continue block69;
                }
                case 1718120736: {
                    break block69;
                }
            }
            break;
        }
        v13 = new hy();
        v14 /* !! */  = ik.bb;
        if (true) ** GOTO lbl98
        block70: while (true) {
            v14 /* !! */  = (long)(v15 - ik.sov("szo", spb(int ), (int)84));
lbl98:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1868918297: {
                    v15 = ik.sov("szp", spb(int ), (int)85);
                    continue block70;
                }
                case -1087186671: {
                    v15 = ik.sov("szq", spb(int ), (int)86);
                    continue block70;
                }
                case 1718120736: {
                    break block70;
                }
            }
            break;
        }
        v16 = v13.randomValue();
        v17 /* !! */  = ik.bb;
        if (true) ** GOTO lbl112
        block71: while (true) {
            v17 /* !! */  = (long)(ik.sov("szs", spb(int ), (int)88) - ik.sov("szr", spb(int ), (int)87));
lbl112:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case 1518066987: {
                    continue block71;
                }
                case 1718120736: {
                    break block71;
                }
            }
            break;
        }
        v18 = this.pointFinder.computeVector(var1_1, var2_2, v10, v16, var3_3);
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_2 = ik.bb - ik.sov("szt", spb(int ), (int)89)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == ik.sov("szu", sos(int ), (int)80)) break;
            v19 /* !! */  = (long)ik.sov("szv", sos(int ), (int)81);
        }
        var4_7 = (class_243)v18.method_15442();
        if (var5_6 || var5_6) ** GOTO lbl48
        if (var6_5 /* !! */  == 0) ** GOTO lbl-1000
        switch (var6_5 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v20 = var2_2;
                v21 /* !! */  = ik.bb;
                if (true) ** GOTO lbl133
                block73: while (true) {
                    v21 /* !! */  = (long)(v22 - ik.sov("szw", spb(int ), (int)90));
lbl133:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1045131891: {
                            v22 = ik.sov("szx", spb(int ), (int)91);
                            continue block73;
                        }
                        case -932611057: {
                            v22 = ik.sov("szy", spb(int ), (int)92);
                            continue block73;
                        }
                        case -89369761: {
                            v22 = ik.sov("szz", spb(int ), (int)93);
                            continue block73;
                        }
                        case 1718120736: {
                            break block73;
                        }
                    }
                    break;
                }
                v23 = var1_1.method_5829();
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_3 = ik.bb - ik.sov("taa", spb(int ), (int)94)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == ik.sov("tab", sos(int ), (int)82)) break;
                    v24 /* !! */  = (long)ik.sov("tac", sos(int ), (int)83);
                }
                if (!oy.rayTrace(v20, v23)) ** GOTO lbl157
                if (var5_6) ** GOTO lbl48
                v25 = 0.0;
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl186
lbl157:
                // 1 sources

                if (!var5_6 && !var5_6) ** break;
                ** continue;
                v26 /* !! */  = ik.bb;
                if (true) ** GOTO lbl163
                block75: while (true) {
                    v26 /* !! */  = (long)(v27 - ik.sov("tad", spb(int ), (int)95));
lbl163:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case 112394542: {
                            v27 = ik.sov("tae", spb(int ), (int)96);
                            continue block75;
                        }
                        case 657105011: {
                            v27 = ik.sov("taf", spb(int ), (int)97);
                            continue block75;
                        }
                        case 1718120736: {
                            break block75;
                        }
                    }
                    break;
                }
                v28 = ow.cameraAngle();
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_4 = ik.bb - ik.sov("tag", spb(int ), (int)98)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == ik.sov("tah", sos(int ), (int)84)) break;
                    v29 /* !! */  = (long)ik.sov("tai", sos(int ), (int)85);
                }
                v30 = ow.calculateAngle(var4_7);
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_5 = ik.bb - ik.sov("taj", spb(int ), (int)99)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == ik.sov("tak", sos(int ), (int)86)) {
                        v25 = ot.computeRotationDifference(v28, v30);
                        break;
                    }
                    v31 /* !! */  = (long)ik.sov("tal", sos(int ), (int)87);
                }
lbl186:
                // 2 sources

                return v25;
            }
            case 0: {
                var6_5 /* !! */  = (int)ik.sov("tam", sos(int ), (int)88);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl192:
            // 3 sources

            case 1: {
                var6_5 /* !! */  = (int)ik.sov("tan", sos(int ), (int)89);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl201
            }
            case 2: {
                var6_5 /* !! */  = (int)ik.sov("tao", sos(int ), (int)90);
                if (!var7_4) break;
                throw null;
            }
lbl201:
            // 2 sources

            case 3: {
                var6_5 /* !! */  = (int)ik.sov("tap", sos(int ), (int)91);
                if (var7_4) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl206:
            // 3 sources

            case 4: {
                var6_5 /* !! */  = (int)ik.sov("taq", sos(int ), (int)92);
                if (!var7_4) break;
                throw null;
            }
lbl210:
            // 2 sources

            case 5: {
                var6_5 /* !! */  = (int)ik.sov("tar", sos(int ), (int)93);
                if (!var7_4) ** GOTO lbl192
                throw null;
            }
lbl214:
            // 2 sources

            case 6: {
                var6_5 /* !! */  = (int)ik.sov("tas", sos(int ), (int)94);
                if (!var7_4) ** GOTO lbl192
                throw null;
            }
            case 7: {
                var6_5 /* !! */  = (int)ik.sov("tat", sos(int ), (int)95);
                if (!var7_4) ** GOTO lbl206
                throw null;
            }
            case 8: {
                var6_5 /* !! */  = (int)ik.sov("tau", sos(int ), (int)96);
                if (!var7_4) ** GOTO lbl206
                throw null;
            }
            case 9: 
        }
        do {
            var6_5 /* !! */  = (int)ik.sov("tav", sos(int ), (int)97);
        } while (!var7_4);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void lockTarget(class_1309 var1_1) {
        v0 /* !! */  = ik.bb;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(ik.sov("spf", spb(int ), (int)1) - ik.sov("spe", spb(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -507804292: {
                    continue block24;
                }
                case 1718120736: {
                    break block24;
                }
            }
            break;
        }
        var4_2 = ik.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("spg", spb(int ), (int)2)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ik.sov("sph", sos(int ), (int)5)) break;
            v1 /* !! */  = (long)ik.sov("spi", sos(int ), (int)6);
        }
        var3_3 /* !! */  = ik.b;
        v2 /* !! */  = ik.bb;
        if (true) ** GOTO lbl22
        block26: while (true) {
            v2 /* !! */  = (long)(ik.sov("spk", spb(int ), (int)4) - ik.sov("spj", spb(int ), (int)3));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case 1401213666: {
                    continue block26;
                }
                case 1718120736: {
                    break block26;
                }
            }
            break;
        }
        var2_4 = ik.a;
        if (!var4_2) ** GOTO lbl34
        throw null;
        {
            if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_3 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return;
                }
lbl34:
                // 1 sources

                if (var2_4 || var2_4) continue block27;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("spl", spb(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == ik.sov("spm", sos(int ), (int)7)) break;
                    v3 /* !! */  = (long)ik.sov("spn", sos(int ), (int)8);
                }
                if (this.currentTarget != null) ** GOTO lbl58
                if (var2_4 || var2_4) continue block27;
                v4 /* !! */  = ik.bb;
                if (true) ** GOTO lbl47
                block29: while (true) {
                    v4 /* !! */  = (long)(v5 - ik.sov("spo", spb(int ), (int)6));
lbl47:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case 257683528: {
                            v5 = ik.sov("spp", spb(int ), (int)7);
                            continue block29;
                        }
                        case 977657163: {
                            v5 = ik.sov("spq", spb(int ), (int)8);
                            continue block29;
                        }
                        case 1718120736: {
                            break block29;
                        }
                    }
                    break;
                }
                this.currentTarget = var1_1;
                if (var2_4) continue block27;
lbl58:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                continue block27;
                return;
lbl61:
                // 2 sources

                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var3_3 /* !! */  = (int)ik.sov("spr", sos(int ), (int)9);
                        if (var4_2) {
                            throw null;
                        }
                        ** GOTO lbl77
                        break;
                    }
                }
                case 1: {
                    var3_3 /* !! */  = (int)ik.sov("sps", sos(int ), (int)10);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl91
                }
lbl72:
                // 2 sources

                case 2: {
                    var3_3 /* !! */  = (int)ik.sov("spt", sos(int ), (int)11);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl82
                }
lbl77:
                // 2 sources

                case 3: {
                    var3_3 /* !! */  = (int)ik.sov("spu", sos(int ), (int)12);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl95
                }
lbl82:
                // 2 sources

                case 4: {
                    var3_3 /* !! */  = (int)ik.sov("spv", sos(int ), (int)13);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 5: {
                    var3_3 /* !! */  = (int)ik.sov("spw", sos(int ), (int)14);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl95
                }
lbl91:
                // 2 sources

                case 6: {
                    var3_3 /* !! */  = (int)ik.sov("spx", sos(int ), (int)15);
                    if (!var4_2) ** GOTO lbl72
                    throw null;
                }
lbl95:
                // 3 sources

                case 7: {
                    var3_3 /* !! */  = (int)ik.sov("spy", sos(int ), (int)16);
                    if (!var4_2) ** GOTO lbl61
                    throw null;
                }
                case 8: 
            }
        }
        var3_3 /* !! */  = (int)ik.sov("spz", sos(int ), (int)17);
        ** while (!var4_2)
lbl102:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ double sut(int n2) {
        return Double.longBitsToDouble(spc[n2] ^ spd[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public class_1309 getCurrentTarget() {
        v0 /* !! */  = ik.bb;
        if (true) ** GOTO lbl5
        block16: while (true) {
            v0 /* !! */  = (long)(ik.sov("tel", spb(int ), (int)160) - ik.sov("tek", spb(int ), (int)159));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1181593365: {
                    continue block16;
                }
                case 1718120736: {
                    break block16;
                }
            }
            break;
        }
        var3_1 = ik.c;
        v1 /* !! */  = ik.bb;
        if (true) ** GOTO lbl15
        block17: while (true) {
            v1 /* !! */  = (long)(v2 - ik.sov("tem", spb(int ), (int)161));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2063421176: {
                    v2 = ik.sov("ten", spb(int ), (int)162);
                    continue block17;
                }
                case -1874300047: {
                    v2 = ik.sov("teo", spb(int ), (int)163);
                    continue block17;
                }
                case -1033556027: {
                    v2 = ik.sov("tep", spb(int ), (int)164);
                    continue block17;
                }
                case 1718120736: {
                    break block17;
                }
            }
            break;
        }
        var2_2 /* !! */  = ik.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("teq", spb(int ), (int)165)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == ik.sov("ter", sos(int ), (int)131)) break;
            v3 /* !! */  = (long)ik.sov("tes", sos(int ), (int)132);
        }
        var1_3 = ik.a;
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

                if (var1_3 || var1_3) continue block19;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("tet", spb(int ), (int)166)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == ik.sov("teu", sos(int ), (int)133)) break;
                    v4 /* !! */  = (long)ik.sov("tev", sos(int ), (int)134);
                }
                return this.currentTarget;
                case 0: {
                    var2_2 /* !! */  = (int)ik.sov("tew", sos(int ), (int)135);
                    if (var3_1) {
                        throw null;
                    }
                }
lbl53:
                // 4 sources

                case 1: {
                    var2_2 /* !! */  = (int)ik.sov("tex", sos(int ), (int)136);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)ik.sov("tey", sos(int ), (int)137);
                        if (!var3_1) ** GOTO lbl53
                        throw null;
                    }
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)ik.sov("tez", sos(int ), (int)138);
        ** while (!var3_1)
lbl65:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void thw() {
        ik.spc[100] = 7682992220719422278L;
        ik.spc[101] = 3492352363140568472L;
        ik.spc[102] = -8220057892528410557L;
        ik.spc[103] = -7935881036970990261L;
        ik.spc[104] = 8149416140071858438L;
        ik.spc[105] = -3315255747057216570L;
        ik.spc[106] = 4512386444512829126L;
        ik.spc[107] = -5484432721917111506L;
        ik.spc[108] = -1366913104595857617L;
        ik.spc[109] = 8634662291876236747L;
        ik.spc[110] = 3607490947240159549L;
        ik.spc[111] = 7334659314011041967L;
        ik.spc[112] = -362150192039077620L;
        ik.spc[113] = 1819506049694328631L;
        ik.spc[114] = -606063571241152097L;
        ik.spc[115] = 6001424400233307813L;
        ik.spc[116] = -2977038946526028389L;
        ik.spc[117] = -4048824731885999565L;
        ik.spc[118] = -2638877911123096558L;
        ik.spc[119] = -6960422280262330701L;
        ik.spc[120] = -7981936058285088315L;
        ik.spc[121] = -2155663030872134731L;
        ik.spc[122] = 1941082386460983437L;
        ik.spc[123] = 956098605046284362L;
        ik.spc[124] = 43274099832025116L;
        ik.spc[125] = -4484281390825876750L;
        ik.spc[126] = 96735802493804436L;
        ik.spc[127] = 809373548656450001L;
        ik.spc[128] = -1739345526988894178L;
        ik.spc[129] = 8135543128560814706L;
        ik.spc[130] = 7134187412613620194L;
        ik.spc[131] = 78045584208889034L;
        ik.spc[132] = -8589384229011871457L;
        ik.spc[133] = 5349933442118363318L;
        ik.spc[134] = -5969059208771933725L;
        ik.spc[135] = 8405359134369114304L;
        ik.spc[136] = 3493882689253444896L;
        ik.spc[137] = -380206072449998909L;
        ik.spc[138] = 871371503160577709L;
        ik.spc[139] = -2517454811012289515L;
        ik.spc[140] = -4168084894217985427L;
        ik.spc[141] = -8270440525610282111L;
        ik.spc[142] = 7938870851525876515L;
        ik.spc[143] = 8813199929267160035L;
        ik.spc[144] = 705490183670818390L;
        ik.spc[145] = -8483282924350894791L;
        ik.spc[146] = 1473503871761458546L;
        ik.spc[147] = 6072178562096623493L;
        ik.spc[148] = 8462232937234291376L;
        ik.spc[149] = -604303537345640852L;
        ik.spc[150] = 1608178269902545214L;
        ik.spc[151] = 3936770333071171326L;
        ik.spc[152] = 6338597751301165815L;
        ik.spc[153] = 7858871822758747757L;
        ik.spc[154] = 6860051326166056820L;
        ik.spc[155] = -3919185455524630852L;
        ik.spc[156] = -6324008578206827048L;
        ik.spc[157] = 4306427222883388227L;
        ik.spc[158] = -943973969429527423L;
        ik.spc[159] = 2714089066854949543L;
        ik.spc[160] = 7805612745117638329L;
        ik.spc[161] = 5222911350659149379L;
        ik.spc[162] = 658190952526985551L;
        ik.spc[163] = -3975784093835225621L;
        ik.spc[164] = -2493972563334223048L;
        ik.spc[165] = -2281991751282073897L;
        ik.spc[166] = -8987137499958656876L;
        ik.spc[167] = 6555612017233320323L;
        ik.spc[168] = 1841583432029363258L;
        ik.spc[169] = 857876729789783725L;
        ik.spc[170] = -2926157778670872705L;
        ik.spc[171] = 1102202504937783746L;
        ik.spc[172] = 2465559925070770311L;
        ik.spc[173] = 6669508554247501328L;
        ik.spc[174] = 8842062792098928526L;
        ik.spc[175] = -9031022118387013346L;
        ik.spc[176] = -6642145259440483076L;
        ik.spc[177] = 2650742044731942974L;
        ik.spc[178] = 4476413292655956300L;
        ik.spc[179] = 8898791958594813309L;
        ik.spc[180] = -1366365415653490724L;
        ik.spc[181] = 6799736986231270174L;
        ik.spc[182] = -1294693392927287197L;
        ik.spc[183] = -6293940596590393791L;
        ik.spc[184] = 6922037638546849921L;
        ik.spc[185] = -8523130008513605102L;
        ik.spc[186] = 4606214180349349201L;
        ik.spc[187] = -4953752352088948182L;
        ik.spc[188] = -9191471261036376706L;
        ik.spc[189] = -1833699192196301418L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Stream<class_1309> createStreamFromEntities(Iterable<class_1297> var1_1, float var2_2, float var3_3, boolean var4_4) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("taw", spb(int ), (int)100)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ik.sov("tax", sos(int ), (int)98)) break;
            v0 /* !! */  = (long)ik.sov("tay", sos(int ), (int)99);
        }
        var7_5 = ik.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("taz", spb(int ), (int)101)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ik.sov("tba", sos(int ), (int)100)) break;
            v1 /* !! */  = (long)ik.sov("tbb", sos(int ), (int)101);
        }
        var6_6 /* !! */  = ik.b;
        v2 /* !! */  = ik.bb;
        if (true) ** GOTO lbl17
        block60: while (true) {
            v2 /* !! */  = (long)(v3 - ik.sov("tbc", spb(int ), (int)102));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1119624051: {
                    v3 = ik.sov("tbd", spb(int ), (int)103);
                    continue block60;
                }
                case 1059758861: {
                    v3 = ik.sov("tbe", spb(int ), (int)104);
                    continue block60;
                }
                case 1612414788: {
                    v3 = ik.sov("tbf", spb(int ), (int)105);
                    continue block60;
                }
                case 1718120736: {
                    break block60;
                }
            }
            break;
        }
        var5_7 = ik.a;
        if (!var7_5) ** GOTO lbl36
        throw null;
        {
            if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
            switch (var6_6 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl36:
                // 1 sources

                if (var5_7 || var5_7) continue block61;
                v4 /* !! */  = ik.bb;
                if (true) ** GOTO lbl41
                block62: while (true) {
                    v4 /* !! */  = (long)(v5 - ik.sov("tbg", spb(int ), (int)106));
lbl41:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -493625526: {
                            v5 = ik.sov("tbh", spb(int ), (int)107);
                            continue block62;
                        }
                        case -96682191: {
                            v5 = ik.sov("tbi", spb(int ), (int)108);
                            continue block62;
                        }
                        case 1377132888: {
                            v5 = ik.sov("tbj", spb(int ), (int)109);
                            continue block62;
                        }
                        case 1718120736: {
                            break block62;
                        }
                    }
                    break;
                }
                v6 = var1_1.spliterator();
                v7 = ik.sov("tbk", sos(int ), (int)102);
                v8 /* !! */  = ik.bb;
                if (true) ** GOTO lbl59
                block63: while (true) {
                    v8 /* !! */  = (long)(v9 - ik.sov("tbl", spb(int ), (int)110));
lbl59:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1919116011: {
                            v9 = ik.sov("tbm", spb(int ), (int)111);
                            continue block63;
                        }
                        case -1510351976: {
                            v9 = ik.sov("tbn", spb(int ), (int)112);
                            continue block63;
                        }
                        case 66113337: {
                            v9 = ik.sov("tbo", spb(int ), (int)113);
                            continue block63;
                        }
                        case 1718120736: {
                            break block63;
                        }
                    }
                    break;
                }
                v10 = StreamSupport.stream(v6, (boolean)v7);
                v11 /* !! */  = ik.bb;
                if (true) ** GOTO lbl76
                block64: while (true) {
                    v11 /* !! */  = (long)(v12 - ik.sov("tbp", spb(int ), (int)114));
lbl76:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -909506011: {
                            v12 = ik.sov("tbq", spb(int ), (int)115);
                            continue block64;
                        }
                        case -487885683: {
                            v12 = ik.sov("tbr", spb(int ), (int)116);
                            continue block64;
                        }
                        case 946177811: {
                            v12 = ik.sov("tbs", spb(int ), (int)117);
                            continue block64;
                        }
                        case 1718120736: {
                            break block64;
                        }
                    }
                    break;
                }
                Objects.requireNonNull(class_1309.class);
                v13 /* !! */  = ik.bb;
                if (true) ** GOTO lbl94
                block65: while (true) {
                    v13 /* !! */  = (long)(v14 - ik.sov("tbt", spb(int ), (int)118));
lbl94:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -1900820903: {
                            v14 = ik.sov("tbu", spb(int ), (int)119);
                            continue block65;
                        }
                        case -769230778: {
                            v14 = ik.sov("tbv", spb(int ), (int)120);
                            continue block65;
                        }
                        case 1436179682: {
                            v14 = ik.sov("tbw", spb(int ), (int)121);
                            continue block65;
                        }
                        case 1718120736: {
                            break block65;
                        }
                    }
                    break;
                }
                v15 = (Predicate<class_1297>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isInstance(java.lang.Object ), (Lnet/minecraft/class_1297;)Z)(class_1309.class);
                v16 /* !! */  = ik.bb;
                if (true) ** GOTO lbl111
                block66: while (true) {
                    v16 /* !! */  = (long)(ik.sov("tby", spb(int ), (int)123) - ik.sov("tbx", spb(int ), (int)122));
lbl111:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -633777979: {
                            continue block66;
                        }
                        case 1718120736: {
                            break block66;
                        }
                    }
                    break;
                }
                v17 = v10.filter(v15);
                v18 /* !! */  = ik.bb;
                if (true) ** GOTO lbl121
                block67: while (true) {
                    v18 /* !! */  = (long)(ik.sov("tca", spb(int ), (int)125) - ik.sov("tbz", spb(int ), (int)124));
lbl121:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -1754602744: {
                            continue block67;
                        }
                        case 1718120736: {
                            break block67;
                        }
                    }
                    break;
                }
                Objects.requireNonNull(class_1309.class);
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_2 = ik.bb - ik.sov("tcb", spb(int ), (int)126)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == ik.sov("tcc", sos(int ), (int)103)) break;
                    v19 /* !! */  = (long)ik.sov("tcd", sos(int ), (int)104);
                }
                v20 = (Function<class_1297, class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, cast(java.lang.Object ), (Lnet/minecraft/class_1297;)Lnet/minecraft/class_1309;)(class_1309.class);
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_3 = ik.bb - ik.sov("tce", spb(int ), (int)127)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == ik.sov("tcf", sos(int ), (int)105)) break;
                    v21 /* !! */  = (long)ik.sov("tcg", sos(int ), (int)106);
                }
                v22 = v17.map(v20);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_4 = ik.bb - ik.sov("tch", spb(int ), (int)128)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == ik.sov("tci", sos(int ), (int)107)) break;
                    v23 /* !! */  = (long)ik.sov("tcj", sos(int ), (int)108);
                }
                v24 = (Predicate<class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$createStreamFromEntities$0(float boolean float net.minecraft.class_1309 ), (Lnet/minecraft/class_1309;)Z)((ik)this, (float)var2_2, (boolean)var4_4, (float)var3_3);
                v25 /* !! */  = ik.bb;
                if (true) ** GOTO lbl150
                block71: while (true) {
                    v25 /* !! */  = (long)(v26 - ik.sov("tck", spb(int ), (int)129));
lbl150:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1458038354: {
                            v26 = ik.sov("tcl", spb(int ), (int)130);
                            continue block71;
                        }
                        case -731953475: {
                            v26 = ik.sov("tcm", spb(int ), (int)131);
                            continue block71;
                        }
                        case 111907805: {
                            v26 = ik.sov("tcn", spb(int ), (int)132);
                            continue block71;
                        }
                        case 1718120736: {
                            break block71;
                        }
                    }
                    break;
                }
                v27 = v22.filter(v24);
                v28 /* !! */  = ik.bb;
                if (true) ** GOTO lbl167
                block72: while (true) {
                    v28 /* !! */  = (long)(ik.sov("tcp", spb(int ), (int)134) - ik.sov("tco", spb(int ), (int)133));
lbl167:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case 1419289854: {
                            continue block72;
                        }
                        case 1718120736: {
                            break block72;
                        }
                    }
                    break;
                }
                v29 = (ToDoubleFunction<class_1309>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$createStreamFromEntities$1(net.minecraft.class_1309 ), (Lnet/minecraft/class_1309;)D)();
                v30 /* !! */  = ik.bb;
                if (true) ** GOTO lbl177
                block73: while (true) {
                    v30 /* !! */  = (long)(ik.sov("tcr", spb(int ), (int)136) - ik.sov("tcq", spb(int ), (int)135));
lbl177:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case 274617673: {
                            continue block73;
                        }
                        case 1718120736: {
                            break block73;
                        }
                    }
                    break;
                }
                v31 = Comparator.comparingDouble(v29);
                while (true) {
                    if ((v32 /* !! */  = (cfr_temp_5 = ik.bb - ik.sov("tcs", spb(int ), (int)137)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v32 /* !! */  == ik.sov("tct", sos(int ), (int)109)) break;
                    v32 /* !! */  = (long)ik.sov("tcu", sos(int ), (int)110);
                }
                return v27.sorted(v31);
                case 0: {
                    do {
                        var6_6 /* !! */  = (int)ik.sov("tcv", sos(int ), (int)111);
                    } while (!var7_5);
                    throw null;
                }
                case 1: {
                    var6_6 /* !! */  = (int)ik.sov("tcw", sos(int ), (int)112);
                    if (!var7_5) break block61;
                    throw null;
                }
                case 2: {
                    var6_6 /* !! */  = (int)ik.sov("tcx", sos(int ), (int)113);
                    if (!var7_5) break block61;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var6_6 /* !! */  = (int)ik.sov("tcy", sos(int ), (int)114);
        } while (!var7_5);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Stream<class_1309> getPotentialTargets() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("tfa", spb(int ), (int)167)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ik.sov("tfb", sos(int ), (int)139)) break;
            v0 /* !! */  = (long)ik.sov("tfc", sos(int ), (int)140);
        }
        var3_1 = ik.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("tfd", spb(int ), (int)168)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == ik.sov("tfe", sos(int ), (int)141)) break;
            v1 /* !! */  = (long)ik.sov("tff", sos(int ), (int)142);
        }
        var2_2 /* !! */  = ik.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = ik.bb - ik.sov("tfg", spb(int ), (int)169)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == ik.sov("tfh", sos(int ), (int)143)) break;
            v2 /* !! */  = (long)ik.sov("tfi", sos(int ), (int)144);
        }
        var1_3 = ik.a;
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
                v3 /* !! */  = ik.bb;
                if (true) ** GOTO lbl35
                block14: while (true) {
                    v3 /* !! */  = (long)(ik.sov("tfk", spb(int ), (int)171) - ik.sov("tfj", spb(int ), (int)170));
lbl35:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -537995132: {
                            continue block14;
                        }
                        case 1718120736: {
                            break block14;
                        }
                    }
                    break;
                }
                return this.potentialTargets;
            }
            case 0: {
                var2_2 /* !! */  = (int)ik.sov("tfl", sos(int ), (int)145);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)ik.sov("tfm", sos(int ), (int)146);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)ik.sov("tfn", sos(int ), (int)147);
                if (!var3_1) break;
                throw null;
            }
            case 3: 
        }
        var2_2 /* !! */  = (int)ik.sov("tfo", sos(int ), (int)148);
        ** while (!var3_1)
lbl57:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void thr() {
        ik.sot[0] = -2004641017;
        ik.sot[1] = 680723930;
        ik.sot[2] = 108668603;
        ik.sot[3] = 2034757735;
        ik.sot[4] = -1656654733;
        ik.sot[5] = -189524530;
        ik.sot[6] = 1046879337;
        ik.sot[7] = -1375540623;
        ik.sot[8] = -269072969;
        ik.sot[9] = -887654352;
        ik.sot[10] = 1054694406;
        ik.sot[11] = -375297700;
        ik.sot[12] = 385789709;
        ik.sot[13] = -1341925818;
        ik.sot[14] = 1597688364;
        ik.sot[15] = -1888359270;
        ik.sot[16] = -630205561;
        ik.sot[17] = 1956421743;
        ik.sot[18] = -2144620016;
        ik.sot[19] = -1204861191;
        ik.sot[20] = 517585540;
        ik.sot[21] = 2065530683;
        ik.sot[22] = -1112380446;
        ik.sot[23] = -1706331149;
        ik.sot[24] = -328678038;
        ik.sot[25] = -82164675;
        ik.sot[26] = 1003344029;
        ik.sot[27] = -1969069334;
        ik.sot[28] = 1308208100;
        ik.sot[29] = 1273494780;
        ik.sot[30] = 372257008;
        ik.sot[31] = -1595093494;
        ik.sot[32] = -593817026;
        ik.sot[33] = 1886926762;
        ik.sot[34] = 81885586;
        ik.sot[35] = 567040775;
        ik.sot[36] = -1675551149;
        ik.sot[37] = -571021279;
        ik.sot[38] = -306849823;
        ik.sot[39] = 92323598;
        ik.sot[40] = 1016266610;
        ik.sot[41] = 1852081724;
        ik.sot[42] = -862225715;
        ik.sot[43] = -2014592891;
        ik.sot[44] = 1956443942;
        ik.sot[45] = 899719083;
        ik.sot[46] = 1889466317;
        ik.sot[47] = -2084239204;
        ik.sot[48] = 762275807;
        ik.sot[49] = 360003120;
        ik.sot[50] = -567102054;
        ik.sot[51] = 138781683;
        ik.sot[52] = 1774732692;
        ik.sot[53] = 398884832;
        ik.sot[54] = 1060299668;
        ik.sot[55] = -1155963738;
        ik.sot[56] = 79155218;
        ik.sot[57] = -2040695418;
        ik.sot[58] = 11980848;
        ik.sot[59] = -786609185;
        ik.sot[60] = -236696693;
        ik.sot[61] = 1186617794;
        ik.sot[62] = 2028120570;
        ik.sot[63] = 650508383;
        ik.sot[64] = 2037066909;
        ik.sot[65] = 6931067;
        ik.sot[66] = -1446126189;
        ik.sot[67] = -1380996204;
        ik.sot[68] = -928160532;
        ik.sot[69] = -1390479758;
        ik.sot[70] = -594911651;
        ik.sot[71] = 1162295812;
        ik.sot[72] = 1552882498;
        ik.sot[73] = -886971333;
        ik.sot[74] = 2011225735;
        ik.sot[75] = -941072100;
        ik.sot[76] = -2046809206;
        ik.sot[77] = -1253124688;
        ik.sot[78] = 1427018351;
        ik.sot[79] = 1160354827;
        ik.sot[80] = -370386214;
        ik.sot[81] = 1182478249;
        ik.sot[82] = 1190562056;
        ik.sot[83] = 516627000;
        ik.sot[84] = 1545993005;
        ik.sot[85] = 1511599534;
        ik.sot[86] = 256672885;
        ik.sot[87] = 136807019;
        ik.sot[88] = 658581006;
        ik.sot[89] = 1402057813;
        ik.sot[90] = 146355650;
        ik.sot[91] = 1315972684;
        ik.sot[92] = 1505510921;
        ik.sot[93] = -1227750742;
        ik.sot[94] = -1419862729;
        ik.sot[95] = -665219709;
        ik.sot[96] = -61945306;
        ik.sot[97] = 571792485;
        ik.sot[98] = -154676896;
        ik.sot[99] = 2035261652;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void searchTargets(Iterable<class_1297> var1_1, float var2_2, float var3_3, boolean var4_4) {
        block91: {
            block89: {
                block90: {
                    v0 /* !! */  = ik.bb;
                    block53: while (true) {
                        switch ((int)v0 /* !! */ ) {
                            case 1680450808: {
                                v0 /* !! */  = (long)(ik.sov("ssk", spb(int ), (int)37) - ik.sov("ssj", spb(int ), (int)36));
                                continue block53;
                            }
                            case 1718120736: {
                                break block53;
                            }
                        }
                        break;
                    }
                    var7_5 = ik.c;
                    v1 /* !! */  = ik.bb;
                    block54: while (true) {
                        switch ((int)v1 /* !! */ ) {
                            case -506904804: {
                                v1 /* !! */  = (long)(ik.sov("ssm", spb(int ), (int)39) - ik.sov("ssl", spb(int ), (int)38));
                                continue block54;
                            }
                            case 1718120736: {
                                break block54;
                            }
                        }
                        break;
                    }
                    var6_6 /* !! */  = ik.b;
                    while (true) {
                        if ((v2 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("ssn", spb(int ), (int)40)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v2 /* !! */  == ik.sov("sso", sos(int ), (int)52)) {
                            var5_7 = ik.a;
                            if (var7_5) {
                                throw null;
                            }
                            break;
                        }
                        v2 /* !! */  = (long)ik.sov("ssp", sos(int ), (int)53);
                    }
                    if (var5_7 || var5_7) return;
                    while (true) {
                        if ((v3 /* !! */  = (cfr_temp_2 = ik.bb - ik.sov("ssq", spb(int ), (int)41)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v3 /* !! */  == ik.sov("ssr", sos(int ), (int)54)) {
                            if (this.currentTarget != null) {
                                break;
                            }
                            break block89;
                        }
                        v3 /* !! */  = (long)ik.sov("sss", sos(int ), (int)55);
                    }
                    if (var5_7) return;
                    v4 /* !! */  = ik.bb;
                    if (true) ** GOTO lbl44
                    block57: while (true) {
                        v4 /* !! */  = (long)(v5 - ik.sov("sst", spb(int ), (int)42));
lbl44:
                        // 2 sources

                        switch ((int)v4 /* !! */ ) {
                            case -1266620536: {
                                v5 = ik.sov("ssu", spb(int ), (int)43);
                                continue block57;
                            }
                            case -331808985: {
                                v5 = ik.sov("ssv", spb(int ), (int)44);
                                continue block57;
                            }
                            case 1062766441: {
                                v5 = ik.sov("ssw", spb(int ), (int)45);
                                continue block57;
                            }
                            case 1718120736: {
                                break block57;
                            }
                        }
                        break;
                    }
                    v6 /* !! */  = ik.bb;
                    if (true) ** GOTO lbl60
                    block58: while (true) {
                        v6 /* !! */  = (long)(v7 - ik.sov("ssx", spb(int ), (int)46));
lbl60:
                        // 2 sources

                        switch ((int)v6 /* !! */ ) {
                            case -926100912: {
                                v7 = ik.sov("ssy", spb(int ), (int)47);
                                continue block58;
                            }
                            case -582428269: {
                                v7 = ik.sov("ssz", spb(int ), (int)48);
                                continue block58;
                            }
                            case 338540303: {
                                v7 = ik.sov("sta", spb(int ), (int)49);
                                continue block58;
                            }
                            case 1718120736: {
                                break block58;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v8 /* !! */  = (cfr_temp_3 = ik.bb - ik.sov("stb", spb(int ), (int)50)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v8 /* !! */  == ik.sov("stc", sos(int ), (int)56)) {
                            if (this.pointFinder.hasValidPoint(this.currentTarget, var2_2, var4_4)) {
                                break;
                            }
                            break block90;
                        }
                        v8 /* !! */  = (long)ik.sov("std", sos(int ), (int)57);
                    }
                    if (var5_7) return;
                    v9 /* !! */  = ik.bb;
                    if (true) ** GOTO lbl86
                    block60: while (true) {
                        v9 /* !! */  = (long)(v10 - ik.sov("ste", spb(int ), (int)51));
lbl86:
                        // 2 sources

                        switch ((int)v9 /* !! */ ) {
                            case -1990144735: {
                                v10 = ik.sov("stf", spb(int ), (int)52);
                                continue block60;
                            }
                            case 1094087437: {
                                v10 = ik.sov("stg", spb(int ), (int)53);
                                continue block60;
                            }
                            case 1194583666: {
                                v10 = ik.sov("sth", spb(int ), (int)54);
                                continue block60;
                            }
                            case 1718120736: {
                                break block60;
                            }
                        }
                        break;
                    }
                    while (true) {
                        if ((v11 /* !! */  = (cfr_temp_4 = ik.bb - ik.sov("sti", spb(int ), (int)55)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                            continue;
                        }
                        if (v11 /* !! */  == ik.sov("stj", sos(int ), (int)58)) {
                            if (this.getFov(this.currentTarget, var2_2, var4_4) > (double)var3_3) {
                                break;
                            }
                            break block89;
                        }
                        v11 /* !! */  = (long)ik.sov("stk", sos(int ), (int)59);
                    }
                    if (var5_7) return;
                }
                if (var5_7 || var5_7) return;
                v12 /* !! */  = ik.bb;
                if (true) ** GOTO lbl114
                block62: while (true) {
                    v12 /* !! */  = (long)(v13 - ik.sov("stl", spb(int ), (int)56));
lbl114:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1769697433: {
                            v13 = ik.sov("stm", spb(int ), (int)57);
                            continue block62;
                        }
                        case 757554941: {
                            v13 = ik.sov("stn", spb(int ), (int)58);
                            continue block62;
                        }
                        case 1718120736: {
                            break block62;
                        }
                        case 1800892205: {
                            v13 = ik.sov("sto", spb(int ), (int)59);
                            continue block62;
                        }
                    }
                    break;
                }
                this.releaseTarget();
                if (var5_7) return;
            }
            if (var5_7) return;
            if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            block63: do {
                switch (cfr_temp_0 == -2147483648 ? var6_6 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var5_7) return;
                        v14 /* !! */  = ik.bb;
                        block64: while (true) {
                            switch ((int)v14 /* !! */ ) {
                                case 957695046: {
                                    v15 = ik.sov("stq", spb(int ), (int)61);
                                    ** GOTO lbl146
                                }
                                case 1718120736: {
                                    break block64;
                                }
                                case 1904507947: {
                                    v15 = ik.sov("str", spb(int ), (int)62);
lbl146:
                                    // 2 sources

                                    v14 /* !! */  = (long)(v15 - ik.sov("stp", spb(int ), (int)60));
                                    continue block64;
                                }
                            }
                            break;
                        }
                        v16 = this.createStreamFromEntities(var1_1, var2_2, var3_3, var4_4);
                        while (true) {
                            if ((v17 /* !! */  = (cfr_temp_5 = ik.bb - ik.sov("sts", spb(int ), (int)63)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v17 /* !! */  == ik.sov("stt", sos(int ), (int)60)) {
                                this.potentialTargets = v16;
                                if (var5_7) return;
                                break;
                            }
                            v17 /* !! */  = (long)ik.sov("stu", sos(int ), (int)61);
                        }
                        if (!var5_7) return;
                        return;
                    }
                    case 0: {
                        var6_6 /* !! */  = (int)ik.sov("stv", sos(int ), (int)62);
                        cfr_temp_0 = 8;
                        if (!var7_5) continue block63;
                        throw null;
                    }
                    case 1: {
                        var6_6 /* !! */  = (int)ik.sov("stw", sos(int ), (int)63);
                        cfr_temp_0 = 5;
                        if (!var7_5) continue block63;
                        throw null;
                    }
                    case 3: {
                        var6_6 /* !! */  = (int)ik.sov("sty", sos(int ), (int)65);
                        cfr_temp_0 = 8;
                        if (!var7_5) continue block63;
                        throw null;
                    }
                    case 4: {
                        var6_6 /* !! */  = (int)ik.sov("stz", sos(int ), (int)66);
                        cfr_temp_0 = 7;
                        if (!var7_5) continue block63;
                        throw null;
                    }
                    case 8: {
                        var6_6 /* !! */  = (int)ik.sov("sud", sos(int ), (int)70);
                        if (var7_5) {
                            throw null;
                        }
                    }
                    case 2: {
                        var6_6 /* !! */  = (int)ik.sov("stx", sos(int ), (int)64);
                        cfr_temp_0 = 5;
                        if (!var7_5) continue block63;
                        throw null;
                    }
                    case 9: {
                        var6_6 /* !! */  = (int)ik.sov("sue", sos(int ), (int)71);
                        cfr_temp_0 = 6;
                        if (!var7_5) continue block63;
                        throw null;
                    }
                    case 10: {
                        ** break;
                    }
                    case 12: {
                        do {
                            var6_6 /* !! */  = (int)ik.sov("suh", sos(int ), (int)74);
                        } while (!var7_5);
                        throw null;
                    }
                    case 13: {
                        break block91;
                    }
                    case 5: {
                        var6_6 /* !! */  = (int)ik.sov("sua", sos(int ), (int)67);
                        if (var7_5) {
                            throw null;
                        }
                    }
                    case 6: {
                        var6_6 /* !! */  = (int)ik.sov("sub", sos(int ), (int)68);
                        if (var7_5) {
                            throw null;
                        }
                    }
                    case 7: {
                        var6_6 /* !! */  = (int)ik.sov("suc", sos(int ), (int)69);
                        cfr_temp_0 = 5;
                        if (!var7_5) continue block63;
                        throw null;
                    }
lbl216:
                    // 2 sources

                    while (true) {
                        var6_6 /* !! */  = (int)ik.sov("suf", sos(int ), (int)72);
                        cfr_temp_0 = 11;
                        if (!var7_5) continue block63;
                        throw null;
                    }
                    case 11: 
                }
                break;
            } while (true);
            var6_6 /* !! */  = (int)ik.sov("sug", sos(int ), (int)73);
            if (!var7_5) ** break;
            throw null;
        }
        var6_6 /* !! */  = (int)ik.sov("sui", sos(int ), (int)75);
        ** while (!var7_5)
lbl230:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int sos(int n2) {
        return sot[n2] ^ sou[n2];
    }

    private static /* synthetic */ void thy() {
        ik.spd[100] = -802778793484068517L;
        ik.spd[101] = -3692495106545841234L;
        ik.spd[102] = -9031528253042167243L;
        ik.spd[103] = -5703572340661963965L;
        ik.spd[104] = -2371173758969911903L;
        ik.spd[105] = -9007979515346486887L;
        ik.spd[106] = 7688513980869760767L;
        ik.spd[107] = -6112458022460213075L;
        ik.spd[108] = -835841321075683489L;
        ik.spd[109] = -3542302135507136838L;
        ik.spd[110] = 4284407283955136463L;
        ik.spd[111] = 6885629911886605013L;
        ik.spd[112] = -7300072143470806493L;
        ik.spd[113] = 4801005569825749861L;
        ik.spd[114] = 7988942435329670717L;
        ik.spd[115] = -6925648975195131287L;
        ik.spd[116] = 3218945070805125799L;
        ik.spd[117] = 4119818348876688154L;
        ik.spd[118] = -3863504028926835900L;
        ik.spd[119] = -6921503502204729651L;
        ik.spd[120] = 4098828256115645864L;
        ik.spd[121] = -8826281062676501660L;
        ik.spd[122] = 6380143416583702179L;
        ik.spd[123] = 3825346394974237959L;
        ik.spd[124] = 6797578801277422879L;
        ik.spd[125] = 1379727492724690708L;
        ik.spd[126] = -44934148860746197L;
        ik.spd[127] = -6114486213547876777L;
        ik.spd[128] = -210729636999492543L;
        ik.spd[129] = 6865705480657328240L;
        ik.spd[130] = -8418619788730463829L;
        ik.spd[131] = -9215560948989039008L;
        ik.spd[132] = -5174322058094993138L;
        ik.spd[133] = -4224730356001985827L;
        ik.spd[134] = -8979519637046393993L;
        ik.spd[135] = -4572300659705341036L;
        ik.spd[136] = -2589982944583447946L;
        ik.spd[137] = -2203561581128965146L;
        ik.spd[138] = 1124442956245284647L;
        ik.spd[139] = -8646316059007229772L;
        ik.spd[140] = 5233816060642318935L;
        ik.spd[141] = -346076168994407664L;
        ik.spd[142] = -2771504898189093822L;
        ik.spd[143] = -7656099754064761101L;
        ik.spd[144] = 7089984448435571810L;
        ik.spd[145] = 8230955989556548506L;
        ik.spd[146] = -6091187825711376503L;
        ik.spd[147] = 2956427698435003954L;
        ik.spd[148] = 6163509171194120888L;
        ik.spd[149] = 6062831698809471789L;
        ik.spd[150] = -8393377889848682245L;
        ik.spd[151] = 5269131016972131175L;
        ik.spd[152] = 2926184739481083618L;
        ik.spd[153] = 6492101366161471213L;
        ik.spd[154] = 8061911133409257096L;
        ik.spd[155] = -7480926281835387584L;
        ik.spd[156] = 6433370090346208932L;
        ik.spd[157] = -2584677933119061856L;
        ik.spd[158] = 1991628546373993590L;
        ik.spd[159] = 6595528490851388393L;
        ik.spd[160] = -6220553531540642899L;
        ik.spd[161] = 4657108707008644557L;
        ik.spd[162] = -4520455894945485764L;
        ik.spd[163] = -6035315613721628266L;
        ik.spd[164] = -5594125673306810793L;
        ik.spd[165] = -2962347900092904130L;
        ik.spd[166] = 4737442247250595877L;
        ik.spd[167] = 4300580295181185715L;
        ik.spd[168] = 1022983478681809204L;
        ik.spd[169] = -600124483105804463L;
        ik.spd[170] = -73406437648495493L;
        ik.spd[171] = -6013565484995334831L;
        ik.spd[172] = 4610862082925813580L;
        ik.spd[173] = -4246644021074455359L;
        ik.spd[174] = -7199675762244362231L;
        ik.spd[175] = 6509978383848324836L;
        ik.spd[176] = 8616555184743608057L;
        ik.spd[177] = 1951053673547512474L;
        ik.spd[178] = -1558281484139859254L;
        ik.spd[179] = -4721497726054980230L;
        ik.spd[180] = -5842290425122084085L;
        ik.spd[181] = -1094816810330836712L;
        ik.spd[182] = -6371673645366989864L;
        ik.spd[183] = 5470523996441367372L;
        ik.spd[184] = -1324570500476703740L;
        ik.spd[185] = -8965994561749446131L;
        ik.spd[186] = -7681026841916883472L;
        ik.spd[187] = -8491027693422668369L;
        ik.spd[188] = 4255744144072091863L;
        ik.spd[189] = -6298697436758125631L;
    }

    private static /* synthetic */ void tht() {
        ik.sou[0] = -2004641017;
        ik.sou[1] = 680723931;
        ik.sou[2] = 108668601;
        ik.sou[3] = 2034757732;
        ik.sou[4] = -1656654733;
        ik.sou[5] = 189524529;
        ik.sou[6] = 968381031;
        ik.sou[7] = -1375540624;
        ik.sou[8] = 1416000867;
        ik.sou[9] = -887654350;
        ik.sou[10] = 1054694405;
        ik.sou[11] = -375297699;
        ik.sou[12] = 385789711;
        ik.sou[13] = -1341925819;
        ik.sou[14] = 1597688365;
        ik.sou[15] = -1888359272;
        ik.sou[16] = -630205567;
        ik.sou[17] = 1956421737;
        ik.sou[18] = 2144620015;
        ik.sou[19] = -830327682;
        ik.sou[20] = 517585541;
        ik.sou[21] = -1219459182;
        ik.sou[22] = -1112380446;
        ik.sou[23] = -1706331146;
        ik.sou[24] = -328678038;
        ik.sou[25] = -82164680;
        ik.sou[26] = 1003344024;
        ik.sou[27] = -1969069333;
        ik.sou[28] = 1308208101;
        ik.sou[29] = 742985601;
        ik.sou[30] = 372257009;
        ik.sou[31] = 807062865;
        ik.sou[32] = 593817025;
        ik.sou[33] = -1737444316;
        ik.sou[34] = -81885587;
        ik.sou[35] = 1595493111;
        ik.sou[36] = 1675551148;
        ik.sou[37] = 474323406;
        ik.sou[38] = 306849822;
        ik.sou[39] = 1314086840;
        ik.sou[40] = 1016266615;
        ik.sou[41] = 1852081718;
        ik.sou[42] = -862225723;
        ik.sou[43] = -2014592892;
        ik.sou[44] = 1956443939;
        ik.sou[45] = 899719074;
        ik.sou[46] = 1889466319;
        ik.sou[47] = -2084239208;
        ik.sou[48] = 762275806;
        ik.sou[49] = 360003122;
        ik.sou[50] = -567102055;
        ik.sou[51] = 138781686;
        ik.sou[52] = -1774732693;
        ik.sou[53] = 979040347;
        ik.sou[54] = -1060299669;
        ik.sou[55] = 365113345;
        ik.sou[56] = 79155219;
        ik.sou[57] = 481481018;
        ik.sou[58] = -11980849;
        ik.sou[59] = 1033492288;
        ik.sou[60] = -236696694;
        ik.sou[61] = 640676404;
        ik.sou[62] = 2028120566;
        ik.sou[63] = 650508379;
        ik.sou[64] = 2037066909;
        ik.sou[65] = 6931069;
        ik.sou[66] = -1446126189;
        ik.sou[67] = -1380996199;
        ik.sou[68] = -928160539;
        ik.sou[69] = -1390479754;
        ik.sou[70] = -594911654;
        ik.sou[71] = 1162295817;
        ik.sou[72] = 1552882511;
        ik.sou[73] = -886971337;
        ik.sou[74] = 2011225728;
        ik.sou[75] = -941072108;
        ik.sou[76] = 2046809205;
        ik.sou[77] = -553679432;
        ik.sou[78] = -1427018352;
        ik.sou[79] = 745033296;
        ik.sou[80] = -370386213;
        ik.sou[81] = -18939769;
        ik.sou[82] = -1190562057;
        ik.sou[83] = 1811512913;
        ik.sou[84] = -1545993006;
        ik.sou[85] = 810074708;
        ik.sou[86] = 256672884;
        ik.sou[87] = -1727981368;
        ik.sou[88] = 658581007;
        ik.sou[89] = 1402057809;
        ik.sou[90] = 146355655;
        ik.sou[91] = 1315972686;
        ik.sou[92] = 1505510913;
        ik.sou[93] = -1227750741;
        ik.sou[94] = -1419862721;
        ik.sou[95] = -665219707;
        ik.sou[96] = -61945308;
        ik.sou[97] = 571792482;
        ik.sou[98] = -154676895;
        ik.sou[99] = 232161980;
    }

    private static /* synthetic */ void ths() {
        ik.sot[100] = -950748493;
        ik.sot[101] = 527894398;
        ik.sot[102] = 1224289384;
        ik.sot[103] = -595501075;
        ik.sot[104] = -471055544;
        ik.sot[105] = 1143869446;
        ik.sot[106] = 190994728;
        ik.sot[107] = -656148387;
        ik.sot[108] = 1234208811;
        ik.sot[109] = -253679602;
        ik.sot[110] = -367776541;
        ik.sot[111] = 916065163;
        ik.sot[112] = -1396335874;
        ik.sot[113] = 315688676;
        ik.sot[114] = 224474592;
        ik.sot[115] = -260076933;
        ik.sot[116] = -833878385;
        ik.sot[117] = 287525507;
        ik.sot[118] = 1357737215;
        ik.sot[119] = -867313923;
        ik.sot[120] = 1592505393;
        ik.sot[121] = -1467184081;
        ik.sot[122] = -1622988888;
        ik.sot[123] = 833446244;
        ik.sot[124] = -200251900;
        ik.sot[125] = -1086410416;
        ik.sot[126] = 298694078;
        ik.sot[127] = 992405592;
        ik.sot[128] = -1657527452;
        ik.sot[129] = 696628606;
        ik.sot[130] = -259513091;
        ik.sot[131] = 738017373;
        ik.sot[132] = 468008536;
        ik.sot[133] = 150517424;
        ik.sot[134] = 116311399;
        ik.sot[135] = -507224624;
        ik.sot[136] = -31387063;
        ik.sot[137] = -943550814;
        ik.sot[138] = -1654597124;
        ik.sot[139] = -1043986822;
        ik.sot[140] = 1441418500;
        ik.sot[141] = 6813667;
        ik.sot[142] = 336720762;
        ik.sot[143] = -774654375;
        ik.sot[144] = -2137101416;
        ik.sot[145] = -1334648134;
        ik.sot[146] = 1405161856;
        ik.sot[147] = 1928164939;
        ik.sot[148] = -91707885;
        ik.sot[149] = -788733710;
        ik.sot[150] = 967283670;
        ik.sot[151] = 1023783314;
        ik.sot[152] = 1867440718;
        ik.sot[153] = 171923834;
        ik.sot[154] = 2045336696;
        ik.sot[155] = 1683894746;
        ik.sot[156] = 183834383;
        ik.sot[157] = -1198152353;
        ik.sot[158] = -669310416;
        ik.sot[159] = -682525674;
        ik.sot[160] = 251311375;
        ik.sot[161] = -1990017957;
        ik.sot[162] = -1059977629;
        ik.sot[163] = -1488321747;
        ik.sot[164] = 814364485;
        ik.sot[165] = -740153189;
        ik.sot[166] = 1671430737;
        ik.sot[167] = 623417013;
        ik.sot[168] = 1305135482;
        ik.sot[169] = -486230520;
        ik.sot[170] = -1559619879;
        ik.sot[171] = -1669336086;
        ik.sot[172] = -961154713;
        ik.sot[173] = 550337790;
        ik.sot[174] = -64326245;
        ik.sot[175] = 806408555;
        ik.sot[176] = -352382077;
        ik.sot[177] = 1231471926;
        ik.sot[178] = -1914579172;
        ik.sot[179] = 171656388;
        ik.sot[180] = -1962114309;
        ik.sot[181] = -915073261;
        ik.sot[182] = 1476608402;
        ik.sot[183] = 1567169945;
        ik.sot[184] = 627240704;
    }

    public static /* synthetic */ CallSite sov(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void thu() {
        ik.sou[100] = 950748492;
        ik.sou[101] = 108328667;
        ik.sou[102] = 1224289384;
        ik.sou[103] = 595501074;
        ik.sou[104] = -1352062893;
        ik.sou[105] = 1143869447;
        ik.sou[106] = 1465562734;
        ik.sou[107] = 656148386;
        ik.sou[108] = 1743666335;
        ik.sou[109] = 253679601;
        ik.sou[110] = -487765133;
        ik.sou[111] = 916065162;
        ik.sou[112] = -1396335873;
        ik.sou[113] = 315688677;
        ik.sou[114] = 224474594;
        ik.sou[115] = 260076932;
        ik.sou[116] = -1888447473;
        ik.sou[117] = 287525506;
        ik.sou[118] = -723129242;
        ik.sou[119] = -867313922;
        ik.sou[120] = 1592505394;
        ik.sou[121] = -1467184083;
        ik.sou[122] = -1622988888;
        ik.sou[123] = 833446245;
        ik.sou[124] = -2141017889;
        ik.sou[125] = 1086410415;
        ik.sou[126] = 1767782252;
        ik.sou[127] = 992405592;
        ik.sou[128] = -1657527452;
        ik.sou[129] = 696628605;
        ik.sou[130] = -259513092;
        ik.sou[131] = -738017374;
        ik.sou[132] = -539947407;
        ik.sou[133] = 150517425;
        ik.sou[134] = -588950315;
        ik.sou[135] = -507224622;
        ik.sou[136] = -31387063;
        ik.sou[137] = -943550816;
        ik.sou[138] = -1654597123;
        ik.sou[139] = 1043986821;
        ik.sou[140] = -2044031964;
        ik.sou[141] = -6813668;
        ik.sou[142] = 98396698;
        ik.sou[143] = 774654374;
        ik.sou[144] = -57151658;
        ik.sou[145] = -1334648133;
        ik.sou[146] = 1405161859;
        ik.sou[147] = 1928164939;
        ik.sou[148] = -91707887;
        ik.sou[149] = 788733709;
        ik.sou[150] = -649249789;
        ik.sou[151] = 1023783315;
        ik.sou[152] = -1129526514;
        ik.sou[153] = -171923835;
        ik.sou[154] = -54940510;
        ik.sou[155] = -1683894747;
        ik.sou[156] = 705313148;
        ik.sou[157] = -1198152355;
        ik.sou[158] = -669310413;
        ik.sou[159] = -682525675;
        ik.sou[160] = 251311372;
        ik.sou[161] = -1990017958;
        ik.sou[162] = 1312877521;
        ik.sou[163] = 1488321746;
        ik.sou[164] = 941779386;
        ik.sou[165] = -740153190;
        ik.sou[166] = 1795226549;
        ik.sou[167] = 623417012;
        ik.sou[168] = -1305135483;
        ik.sou[169] = 2006210318;
        ik.sou[170] = -1559619880;
        ik.sou[171] = -410891904;
        ik.sou[172] = 961154712;
        ik.sou[173] = 1767564873;
        ik.sou[174] = -64326246;
        ik.sou[175] = 806408555;
        ik.sou[176] = -352382079;
        ik.sou[177] = 1231471934;
        ik.sou[178] = -1914579171;
        ik.sou[179] = 171656387;
        ik.sou[180] = -1962114317;
        ik.sou[181] = -915073263;
        ik.sou[182] = 1476608405;
        ik.sou[183] = 1567169937;
        ik.sou[184] = 627240712;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private Optional<class_1309> findFirstMatch(Predicate<class_1309> var1_1) {
        v0 /* !! */  = ik.bb;
        if (true) ** GOTO lbl5
        block24: while (true) {
            v0 /* !! */  = (long)(v1 - ik.sov("tcz", spb(int ), (int)138));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 979981606: {
                    v1 = ik.sov("tda", spb(int ), (int)139);
                    continue block24;
                }
                case 1718120736: {
                    break block24;
                }
                case 1972433434: {
                    v1 = ik.sov("tdb", spb(int ), (int)140);
                    continue block24;
                }
            }
            break;
        }
        var4_2 = ik.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("tdc", spb(int ), (int)141)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == ik.sov("tdd", sos(int ), (int)115)) break;
            v2 /* !! */  = (long)ik.sov("tde", sos(int ), (int)116);
        }
        var3_3 /* !! */  = ik.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_2 = ik.bb - ik.sov("tdf", spb(int ), (int)142)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ik.sov("tdg", sos(int ), (int)117)) {
                var2_4 = ik.a;
                if (var4_2) {
                    throw null;
                }
                break;
            }
            v3 /* !! */  = (long)ik.sov("tdh", sos(int ), (int)118);
        }
        if (var2_4 != false) return null;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var3_3 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    if (var2_4 != false) return null;
                    v4 /* !! */  = ik.bb;
                    block28: while (true) {
                        switch ((int)v4 /* !! */ ) {
                            case 1718120736: {
                                break block28;
                            }
                            case 1821213145: {
                                v4 /* !! */  = (long)(ik.sov("tdj", spb(int ), (int)144) - ik.sov("tdi", spb(int ), (int)143));
                                continue block28;
                            }
                        }
                        break;
                    }
                    v5 /* !! */  = ik.bb;
                    block29: while (true) {
                        switch ((int)v5 /* !! */ ) {
                            case -916577788: {
                                v6 = ik.sov("tdl", spb(int ), (int)146);
                                ** GOTO lbl53
                            }
                            case 684371925: {
                                v6 = ik.sov("tdm", spb(int ), (int)147);
lbl53:
                                // 2 sources

                                v5 /* !! */  = (long)(v6 - ik.sov("tdk", spb(int ), (int)145));
                                continue block29;
                            }
                            case 1718120736: {
                                break block29;
                            }
                        }
                        break;
                    }
                    v7 = this.potentialTargets.filter(var1_1);
                    v8 /* !! */  = ik.bb;
                    block30: while (true) {
                        switch ((int)v8 /* !! */ ) {
                            case 1159593595: {
                                v8 /* !! */  = (long)(ik.sov("tdo", spb(int ), (int)149) - ik.sov("tdn", spb(int ), (int)148));
                                continue block30;
                            }
                            case 1718120736: {
                                return v7.findFirst();
                            }
                        }
                        break;
                    }
                    return v7.findFirst();
                }
                case 3: {
                    var3_3 /* !! */  = (int)ik.sov("tds", sos(int ), (int)122);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl-1000
                }
                case 0: {
                    var3_3 /* !! */  = (int)ik.sov("tdp", sos(int ), (int)119);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 1: lbl-1000:
                // 2 sources

                {
                    var3_3 /* !! */  = (int)ik.sov("tdq", sos(int ), (int)120);
                    if (var4_2) {
                        throw null;
                    }
                }
                case 2: 
            }
            if (true) ** GOTO lbl84
            break;
        }
        do {
            if (true) ** continue;
lbl84:
            // 2 sources

            var3_3 /* !! */  = (int)ik.sov("tdr", sos(int ), (int)121);
            cfr_temp_0 = 0;
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void releaseTarget() {
        v0 /* !! */  = ik.bb;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(v1 - ik.sov("sqa", spb(int ), (int)9));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1288423504: {
                    v1 = ik.sov("sqb", spb(int ), (int)10);
                    continue block18;
                }
                case -697100834: {
                    v1 = ik.sov("sqc", spb(int ), (int)11);
                    continue block18;
                }
                case 236700190: {
                    v1 = ik.sov("sqd", spb(int ), (int)12);
                    continue block18;
                }
                case 1718120736: {
                    break block18;
                }
            }
            break;
        }
        var3_1 = ik.c;
        v2 /* !! */  = ik.bb;
        if (true) ** GOTO lbl22
        block19: while (true) {
            v2 /* !! */  = (long)(ik.sov("sqf", spb(int ), (int)14) - ik.sov("sqe", spb(int ), (int)13));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1365670351: {
                    continue block19;
                }
                case 1718120736: {
                    break block19;
                }
            }
            break;
        }
        var2_2 /* !! */  = ik.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("sqg", spb(int ), (int)15)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == ik.sov("sqh", sos(int ), (int)18)) break;
            v3 /* !! */  = (long)ik.sov("sqi", sos(int ), (int)19);
        }
        var1_3 = ik.a;
        if (var3_1) {
            throw null;
lbl36:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl36
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("sqj", spb(int ), (int)16)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == ik.sov("sqk", sos(int ), (int)20)) break;
            v4 /* !! */  = (long)ik.sov("sql", sos(int ), (int)21);
        }
        this.currentTarget = null;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)ik.sov("sqm", sos(int ), (int)22);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl66
                    break;
                }
            }
            case 1: {
                var2_2 /* !! */  = (int)ik.sov("sqn", sos(int ), (int)23);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl66
            }
            case 2: {
                do {
                    var2_2 /* !! */  = (int)ik.sov("sqo", sos(int ), (int)24);
                } while (!var3_1);
                throw null;
            }
lbl66:
            // 3 sources

            case 3: {
                do {
                    var2_2 /* !! */  = (int)ik.sov("sqp", sos(int ), (int)25);
                } while (!var3_1);
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)ik.sov("sqq", sos(int ), (int)26);
                if (!var3_1) break;
                throw null;
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)ik.sov("sqr", sos(int ), (int)27);
        ** while (!var3_1)
lbl78:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void thx() {
        ik.spd[0] = 3389470803661463787L;
        ik.spd[1] = 2656399657801232466L;
        ik.spd[2] = -6469152666607651142L;
        ik.spd[3] = 766422061892158035L;
        ik.spd[4] = -3534608935082467209L;
        ik.spd[5] = 3832317541011170955L;
        ik.spd[6] = 5325900612192332306L;
        ik.spd[7] = -8697333197491801736L;
        ik.spd[8] = -2081757182506036760L;
        ik.spd[9] = 984703916034278169L;
        ik.spd[10] = -6747550699120268755L;
        ik.spd[11] = -8609834913859335682L;
        ik.spd[12] = -8371858025581162898L;
        ik.spd[13] = 6136259591341960190L;
        ik.spd[14] = 687117664322219517L;
        ik.spd[15] = -7845823359885215062L;
        ik.spd[16] = 8388172168952862709L;
        ik.spd[17] = 9124392948019080816L;
        ik.spd[18] = -5934207828064356576L;
        ik.spd[19] = 6327019109264735291L;
        ik.spd[20] = 3859009019154350L;
        ik.spd[21] = -8627435735329298656L;
        ik.spd[22] = 2065458736628156573L;
        ik.spd[23] = -1765633058864198337L;
        ik.spd[24] = 5628999028986492674L;
        ik.spd[25] = -6457908145077447737L;
        ik.spd[26] = -3936184504248094487L;
        ik.spd[27] = 8246608289543134799L;
        ik.spd[28] = -654755737782147123L;
        ik.spd[29] = -3309448891233818036L;
        ik.spd[30] = -7556750349372701219L;
        ik.spd[31] = 7536464056517906707L;
        ik.spd[32] = -6404188820934921169L;
        ik.spd[33] = -2017039807006916450L;
        ik.spd[34] = -7228431673414320829L;
        ik.spd[35] = 5010203876870204275L;
        ik.spd[36] = 9123347841070280393L;
        ik.spd[37] = 2476643777166758370L;
        ik.spd[38] = -1706450097703310601L;
        ik.spd[39] = -1209793425536160056L;
        ik.spd[40] = -1175731231539347590L;
        ik.spd[41] = -8382726133453058298L;
        ik.spd[42] = 5225337526443363656L;
        ik.spd[43] = 6848520518769377133L;
        ik.spd[44] = -6861652105916125656L;
        ik.spd[45] = -1194408800567065715L;
        ik.spd[46] = 4954288545408976206L;
        ik.spd[47] = -4181762724942421593L;
        ik.spd[48] = 7040720788786878952L;
        ik.spd[49] = 3846117605078911678L;
        ik.spd[50] = -9091076938976988503L;
        ik.spd[51] = 4243919771342970388L;
        ik.spd[52] = -651792085684325177L;
        ik.spd[53] = -8352257261968016647L;
        ik.spd[54] = 1349495299605792892L;
        ik.spd[55] = -3323366182760626881L;
        ik.spd[56] = 8733248723181628132L;
        ik.spd[57] = 1342017999870437993L;
        ik.spd[58] = -3461979419030115006L;
        ik.spd[59] = 7788719046712235685L;
        ik.spd[60] = 4639212078655361683L;
        ik.spd[61] = -5113359466253929699L;
        ik.spd[62] = 913241285519403959L;
        ik.spd[63] = -8795207863331938601L;
        ik.spd[64] = -3291277321804266224L;
        ik.spd[65] = 3931458517658321586L;
        ik.spd[66] = -8130059992381236L;
        ik.spd[67] = 3679260559610606675L;
        ik.spd[68] = -7882088895625389766L;
        ik.spd[69] = -4620513935440766973L;
        ik.spd[70] = -913368884490595864L;
        ik.spd[71] = -7239137681548155960L;
        ik.spd[72] = -7399850732841652175L;
        ik.spd[73] = 5521759730077809486L;
        ik.spd[74] = 7646771630571159418L;
        ik.spd[75] = -7614995413489696827L;
        ik.spd[76] = -286166418865391094L;
        ik.spd[77] = 433868534703846452L;
        ik.spd[78] = -6719266028641254652L;
        ik.spd[79] = -636692521054592878L;
        ik.spd[80] = -7412113268949677553L;
        ik.spd[81] = 8521601049908050720L;
        ik.spd[82] = 8842202584955645705L;
        ik.spd[83] = 8942790206635036512L;
        ik.spd[84] = 322548175876699844L;
        ik.spd[85] = 1580808558107672857L;
        ik.spd[86] = 2859219384059802474L;
        ik.spd[87] = 8943048244486091290L;
        ik.spd[88] = 6801617375654608979L;
        ik.spd[89] = 7831391997644063188L;
        ik.spd[90] = 4799169689565845894L;
        ik.spd[91] = -476570190723694208L;
        ik.spd[92] = -6053862191955224935L;
        ik.spd[93] = -1595335539597851085L;
        ik.spd[94] = 8455994323608074060L;
        ik.spd[95] = -4854379651464499821L;
        ik.spd[96] = -5499974657435079223L;
        ik.spd[97] = 4401838270158355516L;
        ik.spd[98] = 6916661027390965906L;
        ik.spd[99] = 3641444192908904102L;
    }

    private static /* synthetic */ void thv() {
        ik.spc[0] = -8620179735498285500L;
        ik.spc[1] = 1408805786717246468L;
        ik.spc[2] = -5292948753647843114L;
        ik.spc[3] = 8359604768462167186L;
        ik.spc[4] = -4485687600935325561L;
        ik.spc[5] = -5236703207823609088L;
        ik.spc[6] = -7117882129097950182L;
        ik.spc[7] = -3282515897826858743L;
        ik.spc[8] = 975975650741679706L;
        ik.spc[9] = -5315039040766458208L;
        ik.spc[10] = -1242393375395653708L;
        ik.spc[11] = -2483687885147117908L;
        ik.spc[12] = -1540348404759602009L;
        ik.spc[13] = 899930881484275357L;
        ik.spc[14] = -2566304755824174974L;
        ik.spc[15] = -2990258744766695248L;
        ik.spc[16] = -3952187662556358608L;
        ik.spc[17] = -4387373519608751262L;
        ik.spc[18] = 143071831654523737L;
        ik.spc[19] = -7736104270560867946L;
        ik.spc[20] = 4492492803744832391L;
        ik.spc[21] = 3141809932294927705L;
        ik.spc[22] = 2622169752905441931L;
        ik.spc[23] = -1534341985313412556L;
        ik.spc[24] = -7346462685583479267L;
        ik.spc[25] = 5406187982127226657L;
        ik.spc[26] = 2918650753238336844L;
        ik.spc[27] = 5112981457693508425L;
        ik.spc[28] = -8249171219182503548L;
        ik.spc[29] = -5551617168120793909L;
        ik.spc[30] = 1551286448804879549L;
        ik.spc[31] = 5457358806572678687L;
        ik.spc[32] = 6390074406595345751L;
        ik.spc[33] = 4920144810420992666L;
        ik.spc[34] = 9026176288604070889L;
        ik.spc[35] = 4850818141840060943L;
        ik.spc[36] = 3325281249358503204L;
        ik.spc[37] = 3808751817190076273L;
        ik.spc[38] = 862364981347045964L;
        ik.spc[39] = -7403912571730557747L;
        ik.spc[40] = -577581433953991870L;
        ik.spc[41] = -8939031620833852345L;
        ik.spc[42] = 1369695277065176646L;
        ik.spc[43] = 5418894529573489260L;
        ik.spc[44] = 5738256136772013511L;
        ik.spc[45] = 3274183504359203466L;
        ik.spc[46] = 6005575993221633020L;
        ik.spc[47] = -8423774378620510275L;
        ik.spc[48] = -1377563140205905947L;
        ik.spc[49] = -5596520938718023067L;
        ik.spc[50] = 1233677090725836365L;
        ik.spc[51] = -5920723630204884457L;
        ik.spc[52] = -8223826969858748880L;
        ik.spc[53] = 7750619523263404500L;
        ik.spc[54] = -2600020386519590779L;
        ik.spc[55] = -8496074234181165428L;
        ik.spc[56] = 268963042841673712L;
        ik.spc[57] = 6435239504436226317L;
        ik.spc[58] = -8593699751535124712L;
        ik.spc[59] = 7654144879732247307L;
        ik.spc[60] = 3235599325363335471L;
        ik.spc[61] = 8420074778809137830L;
        ik.spc[62] = -6531740353335229249L;
        ik.spc[63] = 1672210210500777811L;
        ik.spc[64] = -2504596309337490796L;
        ik.spc[65] = 4854265105030375979L;
        ik.spc[66] = 1592262420796089799L;
        ik.spc[67] = 43430233426252439L;
        ik.spc[68] = -4507987174599338266L;
        ik.spc[69] = -2692083067622125923L;
        ik.spc[70] = 2028514471837835151L;
        ik.spc[71] = -9188507268256958323L;
        ik.spc[72] = -3286077832709528348L;
        ik.spc[73] = -3424457805087750308L;
        ik.spc[74] = 6195470417862579750L;
        ik.spc[75] = -420030259397324714L;
        ik.spc[76] = 9066962226003388898L;
        ik.spc[77] = 5564535475655173997L;
        ik.spc[78] = -3772959858306334687L;
        ik.spc[79] = -7138536543351849358L;
        ik.spc[80] = 341388014576896637L;
        ik.spc[81] = -843660172999699381L;
        ik.spc[82] = 7543742701204953785L;
        ik.spc[83] = 2354107757389917254L;
        ik.spc[84] = 8314695998020875237L;
        ik.spc[85] = -8403519366419538937L;
        ik.spc[86] = -5889467246524757816L;
        ik.spc[87] = -3851960539398594683L;
        ik.spc[88] = -4800386057094968261L;
        ik.spc[89] = -4784716876782174471L;
        ik.spc[90] = -7065978637118658837L;
        ik.spc[91] = -4074420429737006126L;
        ik.spc[92] = -1210742474406091121L;
        ik.spc[93] = -9207128596123270495L;
        ik.spc[94] = 6016122826421662349L;
        ik.spc[95] = -3544142614543209383L;
        ik.spc[96] = -5173788514779257170L;
        ik.spc[97] = -685514940040986896L;
        ik.spc[98] = 7913072752070672906L;
        ik.spc[99] = -6470721167347407279L;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public ik() {
        var2_1 /* !! */  = ik.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.pointFinder = new ox();
                this.currentTarget = null;
                return;
            }
            case 2: {
                ** GOTO lbl13
            }
            case 4: {
                var2_1 /* !! */  = (int)ik.sov("spa", sos(int ), (int)4);
lbl13:
                // 2 sources

                var2_1 /* !! */  = (int)ik.sov("soy", sos(int ), (int)2);
            }
            case 3: {
                var2_1 /* !! */  = (int)ik.sov("soz", sos(int ), (int)3);
            }
            case 1: {
                var2_1 /* !! */  = (int)ik.sov("sox", sos(int ), (int)1);
            }
            case 0: 
        }
        while (true) {
            var2_1 /* !! */  = (int)ik.sov("sow", sos(int ), (int)0);
        }
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean lambda$createStreamFromEntities$0(float var1_1, boolean var2_2, float var3_3, class_1309 var4_4) {
        block38: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("tgn", spb(int ), (int)184)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == ik.sov("tgo", sos(int ), (int)161)) break;
                v0 /* !! */  = (long)ik.sov("tgp", sos(int ), (int)162);
            }
            var7_5 = ik.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_2 = ik.bb - ik.sov("tgq", spb(int ), (int)185)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == ik.sov("tgr", sos(int ), (int)163)) break;
                v1 /* !! */  = (long)ik.sov("tgs", sos(int ), (int)164);
            }
            var6_6 /* !! */  = ik.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_3 = ik.bb - ik.sov("tgt", spb(int ), (int)186)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == ik.sov("tgu", sos(int ), (int)165)) {
                    var5_7 = ik.a;
                    if (var7_5) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)ik.sov("tgv", sos(int ), (int)166);
            }
            if (var5_7 || var5_7) return (boolean)ik.sov("tgw", sos(int ), (int)167);
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_4 = ik.bb - ik.sov("tgx", spb(int ), (int)187)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == ik.sov("tgy", sos(int ), (int)168)) break;
                v3 /* !! */  = (long)ik.sov("tgz", sos(int ), (int)169);
            }
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_5 = ik.bb - ik.sov("tha", spb(int ), (int)188)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == ik.sov("thb", sos(int ), (int)170)) {
                    if (this.pointFinder.hasValidPoint(var4_4, var1_1, var2_2)) {
                        break;
                    }
                    break block38;
                }
                v4 /* !! */  = (long)ik.sov("thc", sos(int ), (int)171);
            }
            if (var5_7) return (boolean)ik.sov("tgw", sos(int ), (int)167);
            while (true) {
                if ((v5 /* !! */  = (cfr_temp_6 = ik.bb - ik.sov("thd", spb(int ), (int)189)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v5 /* !! */  == ik.sov("the", sos(int ), (int)172)) {
                    if (this.getFov(var4_4, var1_1, var2_2) < (double)var3_3) {
                        break;
                    }
                    break block38;
                }
                v5 /* !! */  = (long)ik.sov("thf", sos(int ), (int)173);
            }
            if (var5_7) return (boolean)ik.sov("tgw", sos(int ), (int)167);
            v6 = ik.sov("thg", sos(int ), (int)174);
            if (!var7_5) return (boolean)v6;
            throw null;
        }
        if (var5_7 || var5_7) {
            return (boolean)ik.sov("tgw", sos(int ), (int)167);
        }
        if (var6_6 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block17: while (true) {
            block39: {
                switch (cfr_temp_0 == -2147483648 ? var6_6 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v6 = ik.sov("thh", sos(int ), (int)175);
                        return (boolean)v6;
                    }
                    case 2: {
                        var6_6 /* !! */  = (int)ik.sov("thk", sos(int ), (int)178);
                        if (var7_5) {
                            throw null;
                        }
                    }
                    case 5: {
                        var6_6 /* !! */  = (int)ik.sov("thn", sos(int ), (int)181);
                        cfr_temp_0 = 6;
                        if (var7_5) {
                            throw null;
                        }
                        break block39;
                    }
                    case 7: {
                        var6_6 /* !! */  = (int)ik.sov("thp", sos(int ), (int)183);
                        if (var7_5) {
                            throw null;
                        }
                    }
                    case 3: {
                        var6_6 /* !! */  = (int)ik.sov("thl", sos(int ), (int)179);
                        if (var7_5) {
                            throw null;
                        }
                    }
                    case 4: {
                        var6_6 /* !! */  = (int)ik.sov("thm", sos(int ), (int)180);
                        if (var7_5) {
                            throw null;
                        }
                    }
                    case 6: {
                        var6_6 /* !! */  = (int)ik.sov("tho", sos(int ), (int)182);
                        if (var7_5) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 8: lbl-1000:
                    // 2 sources

                    {
                        var6_6 /* !! */  = (int)ik.sov("thq", sos(int ), (int)184);
                        if (var7_5) {
                            throw null;
                        }
                        ** GOTO lbl-1000
                    }
                    case 0: lbl-1000:
                    // 2 sources

                    {
                        var6_6 /* !! */  = (int)ik.sov("thi", sos(int ), (int)176);
                        if (var7_5) {
                            throw null;
                        }
                    }
                    case 1: 
                }
                ** GOTO lbl100
            }
            do {
                if (true) continue block17;
lbl100:
                // 2 sources

                var6_6 /* !! */  = (int)ik.sov("thj", sos(int ), (int)177);
                cfr_temp_0 = 0;
            } while (!var7_5);
            break;
        }
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ox getPointFinder() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("tdt", spb(int ), (int)150)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == ik.sov("tdu", sos(int ), (int)123)) break;
            v0 /* !! */  = (long)ik.sov("tdv", sos(int ), (int)124);
        }
        var3_1 = ik.c;
        v1 /* !! */  = ik.bb;
        if (true) ** GOTO lbl12
        block12: while (true) {
            v1 /* !! */  = (long)(v2 - ik.sov("tdw", spb(int ), (int)151));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 161648989: {
                    v2 = ik.sov("tdx", spb(int ), (int)152);
                    continue block12;
                }
                case 1468472463: {
                    v2 = ik.sov("tdy", spb(int ), (int)153);
                    continue block12;
                }
                case 1718120736: {
                    break block12;
                }
            }
            break;
        }
        var2_2 = ik.b;
        v3 /* !! */  = ik.bb;
        if (true) ** GOTO lbl26
        block13: while (true) {
            v3 /* !! */  = (long)(v4 - ik.sov("tdz", spb(int ), (int)154));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1918674929: {
                    v4 = ik.sov("tea", spb(int ), (int)155);
                    continue block13;
                }
                case -1550587836: {
                    v4 = ik.sov("teb", spb(int ), (int)156);
                    continue block13;
                }
                case 649224451: {
                    v4 = ik.sov("tec", spb(int ), (int)157);
                    continue block13;
                }
                case 1718120736: {
                    break block13;
                }
            }
            break;
        }
        var1_3 = ik.a;
        if (var3_1) {
            throw null;
lbl41:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl44:
        // 1 sources

        while (true) {
            if ((v5 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("ted", spb(int ), (int)158)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == ik.sov("tee", sos(int ), (int)125)) break;
            v5 /* !! */  = (long)ik.sov("tef", sos(int ), (int)126);
        }
        return this.pointFinder;
    }

    private static /* synthetic */ long spb(int n2) {
        return spc[n2] ^ spd[n2];
    }

    static {
        sot = new int[185];
        sou = new int[185];
        ik.thr();
        ik.ths();
        ik.tht();
        ik.thu();
        spc = new long[190];
        spd = new long[190];
        ik.thv();
        ik.thw();
        ik.thx();
        ik.thy();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ double lambda$createStreamFromEntities$1(class_1309 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = ik.bb - ik.sov("tfp", spb(int ), (int)172)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == ik.sov("tfq", sos(int ), (int)149)) break;
            v0 /* !! */  = (long)ik.sov("tfr", sos(int ), (int)150);
        }
        var3_1 = ik.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = ik.bb - ik.sov("tfs", spb(int ), (int)173)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == ik.sov("tft", sos(int ), (int)151)) break;
            v1 /* !! */  = (long)ik.sov("tfu", sos(int ), (int)152);
        }
        var2_2 /* !! */  = ik.b;
        v2 /* !! */  = ik.bb;
        if (true) ** GOTO lbl17
        block19: while (true) {
            v2 /* !! */  = (long)(v3 - ik.sov("tfv", spb(int ), (int)174));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -334082820: {
                    v3 = ik.sov("tfw", spb(int ), (int)175);
                    continue block19;
                }
                case -292089139: {
                    v3 = ik.sov("tfx", spb(int ), (int)176);
                    continue block19;
                }
                case 1718120736: {
                    break block19;
                }
            }
            break;
        }
        var1_3 = ik.a;
        if (var3_1) {
            throw null;
            return (double)ik.sov("tfy", sut(int ), (int)177);
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                v4 /* !! */  = ik.bb;
                if (true) ** GOTO lbl39
                block21: while (true) {
                    v4 /* !! */  = (long)(v5 - ik.sov("tfz", spb(int ), (int)178));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -593387001: {
                            v5 = ik.sov("tga", spb(int ), (int)179);
                            continue block21;
                        }
                        case 481058136: {
                            v5 = ik.sov("tgb", spb(int ), (int)180);
                            continue block21;
                        }
                        case 1718120736: {
                            break block21;
                        }
                        case 2076780531: {
                            v5 = ik.sov("tgc", spb(int ), (int)181);
                            continue block21;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = ik.bb - ik.sov("tgd", spb(int ), (int)182)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == ik.sov("tge", sos(int ), (int)153)) break;
                    v6 /* !! */  = (long)ik.sov("tgf", sos(int ), (int)154);
                }
                v7 = ik.mc.field_1724;
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_3 = ik.bb - ik.sov("tgg", spb(int ), (int)183)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == ik.sov("tgh", sos(int ), (int)155)) break;
                    v8 /* !! */  = (long)ik.sov("tgi", sos(int ), (int)156);
                }
                return var0.method_5739((class_1297)v7);
            }
lbl63:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)ik.sov("tgj", sos(int ), (int)157);
                if (var3_1) {
                    throw null;
                }
            }
            case 1: {
                do {
                    var2_2 /* !! */  = (int)ik.sov("tgk", sos(int ), (int)158);
                } while (!var3_1);
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)ik.sov("tgl", sos(int ), (int)159);
                if (!var3_1) ** GOTO lbl63
                throw null;
            }
            case 3: 
        }
        do {
            var2_2 /* !! */  = (int)ik.sov("tgm", sos(int ), (int)160);
        } while (!var3_1);
        throw null;
    }
}

