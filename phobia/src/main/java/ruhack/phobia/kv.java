/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import net.minecraft.class_2960;
import ruhack.phobia.kq;
import ruhack.phobia.ks;

public class kv {
    static public ks LOGO;
    static public final boolean c;
    static public final boolean a;
    static private int[] gwkp;
    static public ks SANSATION;
    static public ks INTER_MEDIUM;
    static private long[] gwmq;
    static public ks ICON2;
    static public ks SUISSE;
    static public ks INTER_SEMIBOLD;
    static public ks HUI;
    static public ks HEARTS;
    static public ks PHOBIA;
    static private long[] gwmp;
    static public final int b;
    static private int[] gwkq;
    static public ks ICONS;
    static public ks WEB;
    static public ks PHOBIA_NEW;
    static public ks HAMBURG_BOLD;
    static private final Map<String, ks> fonts;
    static public ks BOLD;
    static public ks HAMBURG_REGULAR;
    static public ks INTER_REGULAR;
    static public ks GUI_ICON;
    static private ks defaultFont;
    static protected final long nq = 1719328104494079824L;
    static private boolean initialized;

    public static CallSite gwkr(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ks getDefault() {
        v0 /* !! */  = kv.nq;
        if (true) ** GOTO lbl5
        block15: while (true) {
            v0 /* !! */  = (long)(kv.gwkr("gwpy", gwmo(int ), (int)32) - kv.gwkr("gwpx", gwmo(int ), (int)31));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 951525200: {
                    break block15;
                }
                case 1117420396: {
                    continue block15;
                }
            }
            break;
        }
        var2 = kv.c;
        v1 /* !! */  = kv.nq;
        if (true) ** GOTO lbl15
        block16: while (true) {
            v1 /* !! */  = (long)(v2 - kv.gwkr("gwpz", gwmo(int ), (int)33));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 701712922: {
                    v2 = kv.gwkr("gwqa", gwmo(int ), (int)34);
                    continue block16;
                }
                case 951525200: {
                    break block16;
                }
                case 1373728974: {
                    v2 = kv.gwkr("gwqb", gwmo(int ), (int)35);
                    continue block16;
                }
            }
            break;
        }
        var1_1 /* !! */  = kv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_0 = kv.nq - kv.gwkr("gwqc", gwmo(int ), (int)36)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kv.gwkr("gwqi", gwko(int ), (int)87)) break;
            v3 /* !! */  = (long)kv.gwkr("gwqk", gwko(int ), (int)88);
        }
        var0_2 = kv.a;
        if (var2) {
            throw null;
lbl34:
            // 2 sources

            return null;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block9 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** continue;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_1 = kv.nq - kv.gwkr("gwqm", gwmo(int ), (int)37)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == kv.gwkr("gwqn", gwko(int ), (int)89)) break;
                    v4 /* !! */  = (long)kv.gwkr("gwqo", gwko(int ), (int)90);
                }
                return kv.defaultFont;
            }
lbl48:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kv.gwkr("gwqp", gwko(int ), (int)91);
                    if (!var2) break block9;
                    throw null;
                }
            }
            case 1: {
                var1_1 /* !! */  = (int)kv.gwkr("gwqq", gwko(int ), (int)92);
                if (!var2) break;
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)kv.gwkr("gwqt", gwko(int ), (int)93);
                if (!var2) ** GOTO lbl48
                throw null;
            }
            case 3: 
        }
        var1_1 /* !! */  = (int)kv.gwkr("gwqv", gwko(int ), (int)94);
        ** while (!var2)
lbl64:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void shutdown() {
        var2 = kv.c;
        var1_1 /* !! */  = kv.b;
        var0_2 = kv.a;
        if (var2) {
            throw null;
lbl6:
            // 24 sources

            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl6
        kq.invalidateFontCache();
        if (var0_2) ** GOTO lbl6
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl6
                kv.fonts.values().forEach((Consumer<ks>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, shutdown(), (Lruhack/phobia/ks;)V)());
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.fonts.clear();
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.defaultFont = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.SANSATION = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.HAMBURG_BOLD = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.HAMBURG_REGULAR = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.BOLD = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.SUISSE = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.ICONS = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.PHOBIA = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.PHOBIA_NEW = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.HEARTS = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.GUI_ICON = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.HUI = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.LOGO = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.WEB = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.ICON2 = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.INTER_REGULAR = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.INTER_MEDIUM = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.INTER_SEMIBOLD = null;
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.initialized = kv.gwkr("gwsv", gwko(int ), (int)114);
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl59:
            // 2 sources

            case 0: {
                var1_1 /* !! */  = (int)kv.gwkr("gwsx", gwko(int ), (int)115);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl186
            }
lbl64:
            // 2 sources

            case 1: {
                var1_1 /* !! */  = (int)kv.gwkr("gwsy", gwko(int ), (int)116);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl210
            }
lbl69:
            // 4 sources

            case 2: {
                var1_1 /* !! */  = (int)kv.gwkr("gwsz", gwko(int ), (int)117);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl205
            }
lbl74:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)kv.gwkr("gwth", gwko(int ), (int)118);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl79:
            // 4 sources

            case 4: {
                var1_1 /* !! */  = (int)kv.gwkr("gwti", gwko(int ), (int)119);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl222
            }
lbl84:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)kv.gwkr("gwtj", gwko(int ), (int)120);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 6: {
                var1_1 /* !! */  = (int)kv.gwkr("gwtk", gwko(int ), (int)121);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl257
            }
lbl94:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)kv.gwkr("gwtl", gwko(int ), (int)122);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl226
            }
lbl99:
            // 2 sources

            case 8: {
                var1_1 /* !! */  = (int)kv.gwkr("gwtm", gwko(int ), (int)123);
                if (!var2) ** GOTO lbl79
                throw null;
            }
            case 9: {
                var1_1 /* !! */  = (int)kv.gwkr("gwto", gwko(int ), (int)124);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl131
            }
lbl108:
            // 2 sources

            case 10: {
                var1_1 /* !! */  = (int)kv.gwkr("gwts", gwko(int ), (int)125);
                if (!var2) ** GOTO lbl94
                throw null;
            }
lbl112:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)kv.gwkr("gwtu", gwko(int ), (int)126);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl117:
            // 3 sources

            case 12: {
                var1_1 /* !! */  = (int)kv.gwkr("gwtw", gwko(int ), (int)127);
                if (!var2) ** GOTO lbl59
                throw null;
            }
            case 13: {
                var1_1 /* !! */  = (int)kv.gwkr("gwtx", gwko(int ), (int)128);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl126:
            // 2 sources

            case 14: {
                var1_1 /* !! */  = (int)kv.gwkr("gwtz", gwko(int ), (int)129);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl214
            }
lbl131:
            // 2 sources

            case 15: {
                var1_1 /* !! */  = (int)kv.gwkr("gwua", gwko(int ), (int)130);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl166
            }
            case 16: {
                var1_1 /* !! */  = (int)kv.gwkr("gwub", gwko(int ), (int)131);
                if (!var2) ** GOTO lbl117
                throw null;
            }
            case 17: {
                var1_1 /* !! */  = (int)kv.gwkr("gwue", gwko(int ), (int)132);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 18: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuf", gwko(int ), (int)133);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl150:
            // 2 sources

            case 19: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuh", gwko(int ), (int)134);
                if (!var2) ** GOTO lbl99
                throw null;
            }
lbl154:
            // 3 sources

            case 20: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuj", gwko(int ), (int)135);
                if (!var2) ** GOTO lbl117
                throw null;
            }
            case 21: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuk", gwko(int ), (int)136);
                if (!var2) ** GOTO lbl126
                throw null;
            }
            case 22: {
                var1_1 /* !! */  = (int)kv.gwkr("gwum", gwko(int ), (int)137);
                if (!var2) ** GOTO lbl108
                throw null;
            }
lbl166:
            // 5 sources

            case 23: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuo", gwko(int ), (int)138);
                if (!var2) ** GOTO lbl150
                throw null;
            }
            case 24: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuq", gwko(int ), (int)139);
                if (!var2) ** GOTO lbl69
                throw null;
            }
            case 25: {
                var1_1 /* !! */  = (int)kv.gwkr("gwur", gwko(int ), (int)140);
                if (!var2) ** GOTO lbl166
                throw null;
            }
lbl178:
            // 2 sources

            case 26: {
                var1_1 /* !! */  = (int)kv.gwkr("gwut", gwko(int ), (int)141);
                if (!var2) ** GOTO lbl84
                throw null;
            }
            case 27: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuv", gwko(int ), (int)142);
                if (!var2) ** GOTO lbl166
                throw null;
            }
lbl186:
            // 2 sources

            case 28: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuw", gwko(int ), (int)143);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl231
            }
lbl191:
            // 3 sources

            case 29: {
                var1_1 /* !! */  = (int)kv.gwkr("gwux", gwko(int ), (int)144);
                if (!var2) ** GOTO lbl69
                throw null;
            }
            case 30: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuy", gwko(int ), (int)145);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl218
            }
            case 31: {
                var1_1 /* !! */  = (int)kv.gwkr("gwuz", gwko(int ), (int)146);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl265
            }
lbl205:
            // 2 sources

            case 32: {
                var1_1 /* !! */  = (int)kv.gwkr("gwva", gwko(int ), (int)147);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl210:
            // 2 sources

            case 33: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvb", gwko(int ), (int)148);
                if (!var2) ** GOTO lbl79
                throw null;
            }
lbl214:
            // 2 sources

            case 34: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvc", gwko(int ), (int)149);
                if (!var2) ** GOTO lbl166
                throw null;
            }
lbl218:
            // 3 sources

            case 35: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvd", gwko(int ), (int)150);
                if (!var2) ** GOTO lbl178
                throw null;
            }
lbl222:
            // 2 sources

            case 36: {
                var1_1 /* !! */  = (int)kv.gwkr("gwve", gwko(int ), (int)151);
                if (!var2) ** GOTO lbl154
                throw null;
            }
lbl226:
            // 2 sources

            case 37: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvf", gwko(int ), (int)152);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl236
            }
lbl231:
            // 3 sources

            case 38: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kv.gwkr("gwvg", gwko(int ), (int)153);
                    if (!var2) ** GOTO lbl64
                    throw null;
                }
            }
lbl236:
            // 3 sources

            case 39: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvh", gwko(int ), (int)154);
                if (!var2) ** GOTO lbl218
                throw null;
            }
lbl240:
            // 3 sources

            case 40: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvi", gwko(int ), (int)155);
                if (!var2) ** GOTO lbl236
                throw null;
            }
            case 41: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvj", gwko(int ), (int)156);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl257
            }
            case 42: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvk", gwko(int ), (int)157);
                if (!var2) ** GOTO lbl69
                throw null;
            }
lbl253:
            // 2 sources

            case 43: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvl", gwko(int ), (int)158);
                if (!var2) ** GOTO lbl112
                throw null;
            }
lbl257:
            // 3 sources

            case 44: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvm", gwko(int ), (int)159);
                if (!var2) ** GOTO lbl79
                throw null;
            }
            case 45: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvn", gwko(int ), (int)160);
                if (!var2) ** GOTO lbl240
                throw null;
            }
lbl265:
            // 3 sources

            case 46: {
                var1_1 /* !! */  = (int)kv.gwkr("gwvo", gwko(int ), (int)161);
                if (!var2) ** GOTO lbl74
                throw null;
            }
            case 47: 
        }
        var1_1 /* !! */  = (int)kv.gwkr("gwvp", gwko(int ), (int)162);
        ** while (!var2)
lbl272:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void setDefault(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kv.nq - kv.gwkr("gwqw", gwmo(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kv.gwkr("gwqx", gwko(int ), (int)95)) break;
            v0 /* !! */  = (long)kv.gwkr("gwra", gwko(int ), (int)96);
        }
        var4_1 = kv.c;
        v1 /* !! */  = kv.nq;
        if (true) ** GOTO lbl12
        block22: while (true) {
            v1 /* !! */  = (long)(kv.gwkr("gwrd", gwmo(int ), (int)40) - kv.gwkr("gwrc", gwmo(int ), (int)39));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case 951525200: {
                    break block22;
                }
                case 1615782828: {
                    continue block22;
                }
            }
            break;
        }
        var3_2 /* !! */  = kv.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = kv.nq - kv.gwkr("gwre", gwmo(int ), (int)41)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == kv.gwkr("gwrf", gwko(int ), (int)97)) break;
            v2 /* !! */  = (long)kv.gwkr("gwrg", gwko(int ), (int)98);
        }
        var2_3 = kv.a;
        if (var4_1) {
            throw null;
lbl27:
            // 6 sources

            return;
        }
        if (var2_3) ** GOTO lbl27
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl27
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = kv.nq - kv.gwkr("gwri", gwmo(int ), (int)42)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == kv.gwkr("gwrk", gwko(int ), (int)99)) break;
                    v3 /* !! */  = (long)kv.gwkr("gwrl", gwko(int ), (int)100);
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = kv.nq - kv.gwkr("gwrm", gwmo(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == kv.gwkr("gwrn", gwko(int ), (int)101)) break;
                    v4 /* !! */  = (long)kv.gwkr("gwro", gwko(int ), (int)102);
                }
                var1_4 = kv.fonts.get(var0);
                if (var2_3 || var2_3) ** GOTO lbl27
                if (var1_4 == null) ** GOTO lbl61
                if (var2_3 || var2_3) ** GOTO lbl27
                v5 /* !! */  = kv.nq;
                if (true) ** GOTO lbl54
                block27: while (true) {
                    v5 /* !! */  = (long)(kv.gwkr("gwrr", gwmo(int ), (int)45) - kv.gwkr("gwrp", gwmo(int ), (int)44));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case 951525200: {
                            break block27;
                        }
                        case 1239692356: {
                            continue block27;
                        }
                    }
                    break;
                }
                kv.defaultFont = var1_4;
                if (var2_3) ** GOTO lbl27
lbl61:
                // 2 sources

                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return;
            }
lbl64:
            // 3 sources

            case 0: {
                var3_2 /* !! */  = (int)kv.gwkr("gwrv", gwko(int ), (int)103);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl83
            }
            case 1: {
                var3_2 /* !! */  = (int)kv.gwkr("gwrx", gwko(int ), (int)104);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl88
            }
            case 2: {
                var3_2 /* !! */  = (int)kv.gwkr("gwrz", gwko(int ), (int)105);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl93
            }
lbl79:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)kv.gwkr("gwsa", gwko(int ), (int)106);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
lbl83:
            // 3 sources

            case 4: {
                var3_2 /* !! */  = (int)kv.gwkr("gwsb", gwko(int ), (int)107);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl88:
            // 2 sources

            case 5: {
                var3_2 /* !! */  = (int)kv.gwkr("gwsd", gwko(int ), (int)108);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl101
            }
lbl93:
            // 2 sources

            case 6: {
                var3_2 /* !! */  = (int)kv.gwkr("gwse", gwko(int ), (int)109);
                if (!var4_1) ** GOTO lbl64
                throw null;
            }
            case 7: {
                var3_2 /* !! */  = (int)kv.gwkr("gwsf", gwko(int ), (int)110);
                if (!var4_1) ** GOTO lbl79
                throw null;
            }
lbl101:
            // 4 sources

            case 8: {
                var3_2 /* !! */  = (int)kv.gwkr("gwsg", gwko(int ), (int)111);
                if (!var4_1) ** GOTO lbl83
                throw null;
            }
            case 9: {
                var3_2 /* !! */  = (int)kv.gwkr("gwsi", gwko(int ), (int)112);
                if (!var4_1) ** GOTO lbl101
                throw null;
            }
            case 10: 
        }
        do {
            var3_2 /* !! */  = (int)kv.gwkr("gwsk", gwko(int ), (int)113);
        } while (!var4_1);
        throw null;
    }

    private static void gwvq() {
        kv.gwkp[0] = -2034266681;
        kv.gwkp[1] = -541276973;
        kv.gwkp[2] = 344541785;
        kv.gwkp[3] = 678762515;
        kv.gwkp[4] = -2030740112;
        kv.gwkp[5] = 760098960;
        kv.gwkp[6] = 421165981;
        kv.gwkp[7] = -570061001;
        kv.gwkp[8] = -1571966769;
        kv.gwkp[9] = 850796389;
        kv.gwkp[10] = -1925004244;
        kv.gwkp[11] = 1464795417;
        kv.gwkp[12] = -982809396;
        kv.gwkp[13] = 538179956;
        kv.gwkp[14] = -2071402630;
        kv.gwkp[15] = -881096445;
        kv.gwkp[16] = -786043628;
        kv.gwkp[17] = -1831220981;
        kv.gwkp[18] = 1884562809;
        kv.gwkp[19] = -1566605952;
        kv.gwkp[20] = -1113872226;
        kv.gwkp[21] = -1856331609;
        kv.gwkp[22] = 1748427738;
        kv.gwkp[23] = 1990839790;
        kv.gwkp[24] = -387061596;
        kv.gwkp[25] = 8110449;
        kv.gwkp[26] = 2044216679;
        kv.gwkp[27] = 1074613906;
        kv.gwkp[28] = 326717968;
        kv.gwkp[29] = -1179830776;
        kv.gwkp[30] = 668291868;
        kv.gwkp[31] = 1111018737;
        kv.gwkp[32] = 592476169;
        kv.gwkp[33] = 1483068056;
        kv.gwkp[34] = -916939573;
        kv.gwkp[35] = 385678092;
        kv.gwkp[36] = -1960093263;
        kv.gwkp[37] = 2041172114;
        kv.gwkp[38] = -1632537898;
        kv.gwkp[39] = 576489702;
        kv.gwkp[40] = -1036803522;
        kv.gwkp[41] = -320701455;
        kv.gwkp[42] = 136453801;
        kv.gwkp[43] = -483131721;
        kv.gwkp[44] = 1112388241;
        kv.gwkp[45] = 1589682000;
        kv.gwkp[46] = -575750746;
        kv.gwkp[47] = -169071169;
        kv.gwkp[48] = -300229223;
        kv.gwkp[49] = -1783309480;
        kv.gwkp[50] = -640565695;
        kv.gwkp[51] = -463559349;
        kv.gwkp[52] = -1738666633;
        kv.gwkp[53] = 1873183744;
        kv.gwkp[54] = 1745175105;
        kv.gwkp[55] = 1710825032;
        kv.gwkp[56] = 1920935232;
        kv.gwkp[57] = -1582122389;
        kv.gwkp[58] = 1161651020;
        kv.gwkp[59] = 1561056707;
        kv.gwkp[60] = -1132285530;
        kv.gwkp[61] = -2043159255;
        kv.gwkp[62] = 1078368051;
        kv.gwkp[63] = 1934667974;
        kv.gwkp[64] = 1084585519;
        kv.gwkp[65] = 974853653;
        kv.gwkp[66] = 1459762632;
        kv.gwkp[67] = 1831158469;
        kv.gwkp[68] = -1948651795;
        kv.gwkp[69] = -829936104;
        kv.gwkp[70] = 726798618;
        kv.gwkp[71] = 1846705036;
        kv.gwkp[72] = 492014474;
        kv.gwkp[73] = -247948759;
        kv.gwkp[74] = -771383631;
        kv.gwkp[75] = 384544691;
        kv.gwkp[76] = -460514349;
        kv.gwkp[77] = 897225528;
        kv.gwkp[78] = 1963931453;
        kv.gwkp[79] = -432376091;
        kv.gwkp[80] = -1459245410;
        kv.gwkp[81] = -505580029;
        kv.gwkp[82] = 2069230956;
        kv.gwkp[83] = 1194682068;
        kv.gwkp[84] = -1745764585;
        kv.gwkp[85] = -286132559;
        kv.gwkp[86] = 1514796751;
        kv.gwkp[87] = 831214796;
        kv.gwkp[88] = 1192195886;
        kv.gwkp[89] = -1321507245;
        kv.gwkp[90] = 180548633;
        kv.gwkp[91] = -1476234799;
        kv.gwkp[92] = 66858465;
        kv.gwkp[93] = -1498211438;
        kv.gwkp[94] = 77366112;
        kv.gwkp[95] = -1366266768;
        kv.gwkp[96] = 691688661;
        kv.gwkp[97] = -2078883273;
        kv.gwkp[98] = 1408527746;
        kv.gwkp[99] = 2109349677;
    }

    private static void gwwi() {
        kv.gwkq[100] = -1435656241;
        kv.gwkq[101] = -1751834706;
        kv.gwkq[102] = -1861163578;
        kv.gwkq[103] = 756104572;
        kv.gwkq[104] = 1678802894;
        kv.gwkq[105] = -935618355;
        kv.gwkq[106] = 2019223826;
        kv.gwkq[107] = 1966037176;
        kv.gwkq[108] = -2118241846;
        kv.gwkq[109] = 473443860;
        kv.gwkq[110] = 1075272896;
        kv.gwkq[111] = 1921627634;
        kv.gwkq[112] = 526804438;
        kv.gwkq[113] = 108082017;
        kv.gwkq[114] = -934814688;
        kv.gwkq[115] = 701005560;
        kv.gwkq[116] = 1488333690;
        kv.gwkq[117] = -1675533613;
        kv.gwkq[118] = 1349294268;
        kv.gwkq[119] = 1102228274;
        kv.gwkq[120] = -1409889283;
        kv.gwkq[121] = 2141570783;
        kv.gwkq[122] = 2037577341;
        kv.gwkq[123] = -427968522;
        kv.gwkq[124] = 671792686;
        kv.gwkq[125] = 1759747279;
        kv.gwkq[126] = 1031483140;
        kv.gwkq[127] = 837816859;
        kv.gwkq[128] = 1516212833;
        kv.gwkq[129] = -620402067;
        kv.gwkq[130] = 1288324955;
        kv.gwkq[131] = -867695413;
        kv.gwkq[132] = 1329863352;
        kv.gwkq[133] = -939050245;
        kv.gwkq[134] = 2016623564;
        kv.gwkq[135] = -425573987;
        kv.gwkq[136] = 406999971;
        kv.gwkq[137] = 1570060133;
        kv.gwkq[138] = 1351386641;
        kv.gwkq[139] = -1749527069;
        kv.gwkq[140] = 1745932457;
        kv.gwkq[141] = -1891693127;
        kv.gwkq[142] = 611672493;
        kv.gwkq[143] = -394223297;
        kv.gwkq[144] = 1386721639;
        kv.gwkq[145] = 188079062;
        kv.gwkq[146] = 1275097752;
        kv.gwkq[147] = 884908412;
        kv.gwkq[148] = -834575655;
        kv.gwkq[149] = -135163549;
        kv.gwkq[150] = 1661973025;
        kv.gwkq[151] = -1255430246;
        kv.gwkq[152] = 1607446744;
        kv.gwkq[153] = 762707203;
        kv.gwkq[154] = -108542448;
        kv.gwkq[155] = 852314666;
        kv.gwkq[156] = 1592912867;
        kv.gwkq[157] = 331282630;
        kv.gwkq[158] = 171910666;
        kv.gwkq[159] = -1232066340;
        kv.gwkq[160] = 1795237665;
        kv.gwkq[161] = 475949538;
        kv.gwkq[162] = -1997556935;
    }

    private static int gwko(int n2) {
        return gwkp[n2] ^ gwkq[n2];
    }

    public kv() {
    }

    private static void gwwp() {
        kv.gwmp[0] = -3748409594589542877L;
        kv.gwmp[1] = 4685831273496335823L;
        kv.gwmp[2] = 4248742132712694302L;
        kv.gwmp[3] = 6443572602303595013L;
        kv.gwmp[4] = -1449488653935769413L;
        kv.gwmp[5] = 3023484178528197087L;
        kv.gwmp[6] = 7644369408332244724L;
        kv.gwmp[7] = 4927508732975349713L;
        kv.gwmp[8] = 4864717271569471022L;
        kv.gwmp[9] = -1954169968315573545L;
        kv.gwmp[10] = -7256426184527117874L;
        kv.gwmp[11] = -9078988785292596192L;
        kv.gwmp[12] = 3733264314808865684L;
        kv.gwmp[13] = 4753845654624962383L;
        kv.gwmp[14] = -425794481622919893L;
        kv.gwmp[15] = -2943099040409314204L;
        kv.gwmp[16] = 2547874648058218591L;
        kv.gwmp[17] = 5979318827463312356L;
        kv.gwmp[18] = -5566670928742008822L;
        kv.gwmp[19] = 8152851155461778407L;
        kv.gwmp[20] = -1955131438374177296L;
        kv.gwmp[21] = -7141859658144845562L;
        kv.gwmp[22] = -7416761806718348698L;
        kv.gwmp[23] = -7581672682523668270L;
        kv.gwmp[24] = -4204947576332335647L;
        kv.gwmp[25] = -9206038418195056433L;
        kv.gwmp[26] = 4108238255667014965L;
        kv.gwmp[27] = 7198685366132821799L;
        kv.gwmp[28] = -7206738806713867300L;
        kv.gwmp[29] = -5621750919101617627L;
        kv.gwmp[30] = 7114019391337540289L;
        kv.gwmp[31] = -749858315780037568L;
        kv.gwmp[32] = 5026989175870340174L;
        kv.gwmp[33] = -873886126389264147L;
        kv.gwmp[34] = -778970112712200128L;
        kv.gwmp[35] = -9064298650275638998L;
        kv.gwmp[36] = -4536063673106501012L;
        kv.gwmp[37] = -4880104114593231797L;
        kv.gwmp[38] = -8331090671118616062L;
        kv.gwmp[39] = 1005378750253966642L;
        kv.gwmp[40] = -8212552482935015778L;
        kv.gwmp[41] = -5063768139014676642L;
        kv.gwmp[42] = 3056939953021094006L;
        kv.gwmp[43] = -1119777790699710186L;
        kv.gwmp[44] = -5838764117258856091L;
        kv.gwmp[45] = -5545523995094497619L;
    }

    static {
        gwkp = new int[163];
        gwkq = new int[163];
        kv.gwvq();
        kv.gwvr();
        kv.gwvv();
        kv.gwwi();
        gwmp = new long[46];
        gwmq = new long[46];
        kv.gwwp();
        kv.gwwu();
        fonts = new HashMap<String, ks>();
        initialized = false;
    }

    private static void gwvv() {
        kv.gwkq[0] = -2034266682;
        kv.gwkq[1] = -541276936;
        kv.gwkq[2] = 344541820;
        kv.gwkq[3] = 678762507;
        kv.gwkq[4] = -2030740140;
        kv.gwkq[5] = 760098966;
        kv.gwkq[6] = 421166000;
        kv.gwkq[7] = -570061031;
        kv.gwkq[8] = -1571966741;
        kv.gwkq[9] = 850796353;
        kv.gwkq[10] = -1925004249;
        kv.gwkq[11] = 1464795419;
        kv.gwkq[12] = -982809365;
        kv.gwkq[13] = 538179956;
        kv.gwkq[14] = -2071402646;
        kv.gwkq[15] = -881096445;
        kv.gwkq[16] = -786043600;
        kv.gwkq[17] = -1831220979;
        kv.gwkq[18] = 1884562810;
        kv.gwkq[19] = -1566605922;
        kv.gwkq[20] = -1113872234;
        kv.gwkq[21] = -1856331637;
        kv.gwkq[22] = 1748427761;
        kv.gwkq[23] = 1990839780;
        kv.gwkq[24] = -387061569;
        kv.gwkq[25] = 8110456;
        kv.gwkq[26] = 2044216679;
        kv.gwkq[27] = 1074613906;
        kv.gwkq[28] = 326717971;
        kv.gwkq[29] = -1179830748;
        kv.gwkq[30] = 668291863;
        kv.gwkq[31] = 1111018742;
        kv.gwkq[32] = 592476168;
        kv.gwkq[33] = 1483068051;
        kv.gwkq[34] = -916939583;
        kv.gwkq[35] = 385678089;
        kv.gwkq[36] = -1960093277;
        kv.gwkq[37] = 2041172152;
        kv.gwkq[38] = -1632537903;
        kv.gwkq[39] = 576489666;
        kv.gwkq[40] = -1036803523;
        kv.gwkq[41] = -320701470;
        kv.gwkq[42] = 136453823;
        kv.gwkq[43] = -483131736;
        kv.gwkq[44] = 1112388234;
        kv.gwkq[45] = 1589682037;
        kv.gwkq[46] = -575750727;
        kv.gwkq[47] = -169071191;
        kv.gwkq[48] = 300229222;
        kv.gwkq[49] = -620780927;
        kv.gwkq[50] = 640565694;
        kv.gwkq[51] = -1677012087;
        kv.gwkq[52] = 1738666632;
        kv.gwkq[53] = -2113716143;
        kv.gwkq[54] = -1745175106;
        kv.gwkq[55] = 1760021844;
        kv.gwkq[56] = 1920935233;
        kv.gwkq[57] = -1832529883;
        kv.gwkq[58] = 1161651021;
        kv.gwkq[59] = -1429444303;
        kv.gwkq[60] = -1132285523;
        kv.gwkq[61] = -2043159250;
        kv.gwkq[62] = 1078368056;
        kv.gwkq[63] = 1934667969;
        kv.gwkq[64] = 1084585517;
        kv.gwkq[65] = 974853657;
        kv.gwkq[66] = 1459762630;
        kv.gwkq[67] = 1831158477;
        kv.gwkq[68] = -1948651803;
        kv.gwkq[69] = -829936100;
        kv.gwkq[70] = 726798609;
        kv.gwkq[71] = 1846705036;
        kv.gwkq[72] = 492014477;
        kv.gwkq[73] = -247948768;
        kv.gwkq[74] = -771383625;
        kv.gwkq[75] = 384544690;
        kv.gwkq[76] = 1295951194;
        kv.gwkq[77] = -897225529;
        kv.gwkq[78] = 1837302952;
        kv.gwkq[79] = 432376090;
        kv.gwkq[80] = -353869631;
        kv.gwkq[81] = -505580030;
        kv.gwkq[82] = -1112238997;
        kv.gwkq[83] = 1194682070;
        kv.gwkq[84] = -1745764585;
        kv.gwkq[85] = -286132557;
        kv.gwkq[86] = 1514796748;
        kv.gwkq[87] = 831214797;
        kv.gwkq[88] = 1068109950;
        kv.gwkq[89] = 1321507244;
        kv.gwkq[90] = 331388664;
        kv.gwkq[91] = -1476234799;
        kv.gwkq[92] = 66858466;
        kv.gwkq[93] = -1498211437;
        kv.gwkq[94] = 77366113;
        kv.gwkq[95] = 1366266767;
        kv.gwkq[96] = -874048659;
        kv.gwkq[97] = 2078883272;
        kv.gwkq[98] = -428133935;
        kv.gwkq[99] = -2109349678;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void init() {
        block93: {
            var2 = kv.c;
            var1_1 /* !! */  = kv.b;
            var0_2 = kv.a;
            if (var2) {
                throw null;
lbl6:
                // 23 sources

                return;
            }
            if (var0_2 || var0_2) ** GOTO lbl6
            if (!kv.initialized) break block93;
            if (var0_2 || var0_2) ** GOTO lbl6
            return;
        }
        if (var0_2 || var0_2) ** GOTO lbl6
        System.out.println("[MSDF] Initializing MsdfManager...");
        if (var0_2 || var0_2) ** GOTO lbl6
        kv.SANSATION = kv.register("sansation", "sansation.png", "sansation.json");
        if (var0_2 || var0_2) ** GOTO lbl6
        kv.HAMBURG_BOLD = kv.register("hamburghandbold", "hamburghandbold.png", "hamburghandbold.json");
        if (var0_2 || var0_2) ** GOTO lbl6
        kv.HAMBURG_REGULAR = kv.register("hamburghandregular", "hamburghandregular.png", "hamburghandregular.json");
        if (var0_2 || var0_2) ** GOTO lbl6
        kv.BOLD = kv.register("bold", "bold.png", "bold.json");
        if (var0_2) ** GOTO lbl6
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl6
                kv.SUISSE = kv.register("suisse", "suisse.png", "suisse.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.ICONS = kv.register("icons", "icons.png", "icons.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.ICON2 = kv.register("icon2", "icon2.png", "icon2.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.PHOBIA = kv.register("phobia", "phobia_font.png", "phobia_font.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.PHOBIA_NEW = kv.register("phobia_new", "phobia_new.png", "phobia_new.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.HEARTS = kv.register("hearts", "hearts.png", "hearts.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.GUI_ICON = kv.register("gui_icon", "gui_icon.png", "gui_icon.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.HUI = kv.register("hui", "hui.png", "hui.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.LOGO = kv.register("logo", "logo.png", "logo.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.WEB = kv.register("web", "web.png", "web.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.INTER_REGULAR = kv.register("inter_regular", "inter_regular.png", "inter_regular.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.INTER_MEDIUM = kv.register("inter_medium", "inter_medium.png", "inter_medium.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.INTER_SEMIBOLD = kv.register("inter_semibold", "inter_semibold.png", "inter_semibold.json");
                if (var0_2 || var0_2) ** GOTO lbl6
                kv.initialized = kv.gwkr("gwks", gwko(int ), (int)0);
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
            case 0: {
                var1_1 /* !! */  = (int)kv.gwkr("gwkt", gwko(int ), (int)1);
                if (!var2) break;
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)kv.gwkr("gwku", gwko(int ), (int)2);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl67:
            // 2 sources

            case 2: {
                var1_1 /* !! */  = (int)kv.gwkr("gwkv", gwko(int ), (int)3);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl199
            }
            case 3: {
                var1_1 /* !! */  = (int)kv.gwkr("gwkw", gwko(int ), (int)4);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl105
            }
lbl77:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)kv.gwkr("gwkx", gwko(int ), (int)5);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl171
            }
            case 5: {
                var1_1 /* !! */  = (int)kv.gwkr("gwky", gwko(int ), (int)6);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl253
            }
lbl87:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)kv.gwkr("gwkz", gwko(int ), (int)7);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl167
            }
lbl92:
            // 2 sources

            case 7: {
                var1_1 /* !! */  = (int)kv.gwkr("gwla", gwko(int ), (int)8);
                if (!var2) ** GOTO lbl67
                throw null;
            }
            case 8: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlb", gwko(int ), (int)9);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl262
            }
            case 9: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlc", gwko(int ), (int)10);
                if (!var2) ** GOTO lbl77
                throw null;
            }
lbl105:
            // 2 sources

            case 10: {
                var1_1 /* !! */  = (int)kv.gwkr("gwld", gwko(int ), (int)11);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl154
            }
lbl110:
            // 2 sources

            case 11: {
                var1_1 /* !! */  = (int)kv.gwkr("gwle", gwko(int ), (int)12);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 12: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlf", gwko(int ), (int)13);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl232
            }
            case 13: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlg", gwko(int ), (int)14);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl125:
            // 3 sources

            case 14: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlh", gwko(int ), (int)15);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl203
            }
            case 15: {
                var1_1 /* !! */  = (int)kv.gwkr("gwli", gwko(int ), (int)16);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl223
            }
            case 16: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlj", gwko(int ), (int)17);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 17: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlk", gwko(int ), (int)18);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl158
            }
lbl145:
            // 2 sources

            case 18: {
                var1_1 /* !! */  = (int)kv.gwkr("gwll", gwko(int ), (int)19);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl163
            }
lbl150:
            // 3 sources

            case 19: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlm", gwko(int ), (int)20);
                if (!var2) break;
                throw null;
            }
lbl154:
            // 3 sources

            case 20: {
                var1_1 /* !! */  = (int)kv.gwkr("gwln", gwko(int ), (int)21);
                if (var2) {
                    throw null;
                }
            }
lbl158:
            // 4 sources

            case 21: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlo", gwko(int ), (int)22);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl163:
            // 4 sources

            case 22: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlp", gwko(int ), (int)23);
                if (!var2) ** GOTO lbl92
                throw null;
            }
lbl167:
            // 2 sources

            case 23: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlq", gwko(int ), (int)24);
                if (!var2) break;
                throw null;
            }
lbl171:
            // 3 sources

            case 24: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlr", gwko(int ), (int)25);
                if (!var2) ** GOTO lbl150
                throw null;
            }
            case 25: {
                var1_1 /* !! */  = (int)kv.gwkr("gwls", gwko(int ), (int)26);
                if (!var2) ** GOTO lbl110
                throw null;
            }
lbl179:
            // 2 sources

            case 26: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlt", gwko(int ), (int)27);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl194
            }
            case 27: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlu", gwko(int ), (int)28);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl209
            }
            case 28: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlv", gwko(int ), (int)29);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl244
            }
lbl194:
            // 2 sources

            case 29: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlw", gwko(int ), (int)30);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl209
            }
lbl199:
            // 2 sources

            case 30: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlx", gwko(int ), (int)31);
                if (!var2) ** GOTO lbl125
                throw null;
            }
lbl203:
            // 2 sources

            case 31: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)kv.gwkr("gwly", gwko(int ), (int)32);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl240
                    break;
                }
            }
lbl209:
            // 4 sources

            case 32: {
                var1_1 /* !! */  = (int)kv.gwkr("gwlz", gwko(int ), (int)33);
                if (!var2) ** GOTO lbl179
                throw null;
            }
lbl213:
            // 2 sources

            case 33: {
                var1_1 /* !! */  = (int)kv.gwkr("gwma", gwko(int ), (int)34);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl253
            }
            case 34: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmb", gwko(int ), (int)35);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl228
            }
lbl223:
            // 3 sources

            case 35: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmc", gwko(int ), (int)36);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl240
            }
lbl228:
            // 3 sources

            case 36: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmd", gwko(int ), (int)37);
                if (!var2) ** GOTO lbl171
                throw null;
            }
lbl232:
            // 3 sources

            case 37: {
                var1_1 /* !! */  = (int)kv.gwkr("gwme", gwko(int ), (int)38);
                if (!var2) ** GOTO lbl228
                throw null;
            }
            case 38: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmf", gwko(int ), (int)39);
                if (!var2) ** GOTO lbl232
                throw null;
            }
lbl240:
            // 3 sources

            case 39: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmg", gwko(int ), (int)40);
                if (!var2) ** GOTO lbl87
                throw null;
            }
lbl244:
            // 2 sources

            case 40: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmh", gwko(int ), (int)41);
                if (!var2) ** GOTO lbl163
                throw null;
            }
            case 41: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmi", gwko(int ), (int)42);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl258
            }
lbl253:
            // 3 sources

            case 42: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmj", gwko(int ), (int)43);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl266
            }
lbl258:
            // 2 sources

            case 43: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmk", gwko(int ), (int)44);
                if (!var2) ** GOTO lbl150
                throw null;
            }
lbl262:
            // 2 sources

            case 44: {
                var1_1 /* !! */  = (int)kv.gwkr("gwml", gwko(int ), (int)45);
                if (!var2) ** GOTO lbl145
                throw null;
            }
lbl266:
            // 2 sources

            case 45: {
                var1_1 /* !! */  = (int)kv.gwkr("gwmm", gwko(int ), (int)46);
                if (!var2) ** GOTO lbl163
                throw null;
            }
            case 46: 
        }
        var1_1 /* !! */  = (int)kv.gwkr("gwmn", gwko(int ), (int)47);
        ** while (!var2)
lbl273:
        // 1 sources

        throw null;
    }

    private static long gwmo(int n2) {
        return gwmp[n2] ^ gwmq[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ks register(String var0, String var1_1, String var2_2) {
        v0 /* !! */  = kv.nq;
        if (true) ** GOTO lbl5
        block47: while (true) {
            v0 /* !! */  = (long)(v1 - kv.gwkr("gwmr", gwmo(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1932841476: {
                    v1 = kv.gwkr("gwms", gwmo(int ), (int)1);
                    continue block47;
                }
                case -1466224546: {
                    v1 = kv.gwkr("gwmt", gwmo(int ), (int)2);
                    continue block47;
                }
                case 951525200: {
                    break block47;
                }
                case 1738764564: {
                    v1 = kv.gwkr("gwmu", gwmo(int ), (int)3);
                    continue block47;
                }
            }
            break;
        }
        var6_3 = kv.c;
        v2 /* !! */  = kv.nq;
        if (true) ** GOTO lbl22
        block48: while (true) {
            v2 /* !! */  = (long)(v3 - kv.gwkr("gwmv", gwmo(int ), (int)4));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -175205820: {
                    v3 = kv.gwkr("gwmw", gwmo(int ), (int)5);
                    continue block48;
                }
                case 113860959: {
                    v3 = kv.gwkr("gwmx", gwmo(int ), (int)6);
                    continue block48;
                }
                case 951525200: {
                    break block48;
                }
            }
            break;
        }
        var5_4 /* !! */  = kv.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = kv.nq - kv.gwkr("gwmy", gwmo(int ), (int)7)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == kv.gwkr("gwmz", gwko(int ), (int)48)) break;
            v4 /* !! */  = (long)kv.gwkr("gwna", gwko(int ), (int)49);
        }
        var4_5 = kv.a;
        if (var6_3) {
            throw null;
lbl40:
            // 7 sources

            return null;
        }
        if (var4_5 || var4_5) ** GOTO lbl40
        if (var5_4 /* !! */  == 0) ** GOTO lbl-1000
        block11 : switch (var5_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = kv.nq - kv.gwkr("gwnb", gwmo(int ), (int)8)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == kv.gwkr("gwnc", gwko(int ), (int)50)) break;
                    v5 /* !! */  = (long)kv.gwkr("gwnd", gwko(int ), (int)51);
                }
                v6 /* !! */  = kv.nq;
                if (true) ** GOTO lbl55
                block52: while (true) {
                    v6 /* !! */  = (long)(kv.gwkr("gwnf", gwmo(int ), (int)10) - kv.gwkr("gwne", gwmo(int ), (int)9));
lbl55:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1088008125: {
                            continue block52;
                        }
                        case 951525200: {
                            break block52;
                        }
                    }
                    break;
                }
                var3_6 = new ks(var0);
                if (var4_5 || var4_5) ** GOTO lbl40
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_2 = kv.nq - kv.gwkr("gwng", gwmo(int ), (int)11)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == kv.gwkr("gwnh", gwko(int ), (int)52)) break;
                    v7 /* !! */  = (long)kv.gwkr("gwni", gwko(int ), (int)53);
                }
                v8 = class_2960.method_60655((String)"phobia", (String)var1_1);
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_3 = kv.nq - kv.gwkr("gwnj", gwmo(int ), (int)12)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == kv.gwkr("gwnk", gwko(int ), (int)54)) break;
                    v9 /* !! */  = (long)kv.gwkr("gwnl", gwko(int ), (int)55);
                }
                v10 = class_2960.method_60655((String)"phobia", (String)var2_2);
                v11 /* !! */  = kv.nq;
                if (true) ** GOTO lbl78
                block55: while (true) {
                    v11 /* !! */  = (long)(v12 - kv.gwkr("gwnm", gwmo(int ), (int)13));
lbl78:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1083037299: {
                            v12 = kv.gwkr("gwnn", gwmo(int ), (int)14);
                            continue block55;
                        }
                        case -545546121: {
                            v12 = kv.gwkr("gwno", gwmo(int ), (int)15);
                            continue block55;
                        }
                        case -165364091: {
                            v12 = kv.gwkr("gwnp", gwmo(int ), (int)16);
                            continue block55;
                        }
                        case 951525200: {
                            break block55;
                        }
                    }
                    break;
                }
                var3_6.load(v8, v10);
                if (var4_5 || var4_5) ** GOTO lbl40
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = kv.nq - kv.gwkr("gwnq", gwmo(int ), (int)17)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == kv.gwkr("gwnr", gwko(int ), (int)56)) break;
                    v13 /* !! */  = (long)kv.gwkr("gwns", gwko(int ), (int)57);
                }
                v14 /* !! */  = kv.nq;
                if (true) ** GOTO lbl101
                block57: while (true) {
                    v14 /* !! */  = (long)(v15 - kv.gwkr("gwnt", gwmo(int ), (int)18));
lbl101:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case 93137059: {
                            v15 = kv.gwkr("gwnu", gwmo(int ), (int)19);
                            continue block57;
                        }
                        case 727969380: {
                            v15 = kv.gwkr("gwnv", gwmo(int ), (int)20);
                            continue block57;
                        }
                        case 951525200: {
                            break block57;
                        }
                    }
                    break;
                }
                kv.fonts.put(var0, var3_6);
                if (var4_5 || var4_5) ** GOTO lbl40
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_5 = kv.nq - kv.gwkr("gwnw", gwmo(int ), (int)21)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == kv.gwkr("gwnx", gwko(int ), (int)58)) break;
                    v16 /* !! */  = (long)kv.gwkr("gwny", gwko(int ), (int)59);
                }
                if (kv.defaultFont != null) ** GOTO lbl131
                if (var4_5 || var4_5) ** GOTO lbl40
                v17 /* !! */  = kv.nq;
                if (true) ** GOTO lbl124
                block59: while (true) {
                    v17 /* !! */  = (long)(kv.gwkr("gwoa", gwmo(int ), (int)23) - kv.gwkr("gwnz", gwmo(int ), (int)22));
lbl124:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -1986370199: {
                            continue block59;
                        }
                        case 951525200: {
                            break block59;
                        }
                    }
                    break;
                }
                kv.defaultFont = var3_6;
                if (var4_5) ** GOTO lbl40
lbl131:
                // 2 sources

                if (!var4_5 && !var4_5) ** break;
                ** continue;
                return var3_6;
            }
lbl134:
            // 3 sources

            case 0: {
                var5_4 /* !! */  = (int)kv.gwkr("gwob", gwko(int ), (int)60);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl151
            }
            case 1: {
                var5_4 /* !! */  = (int)kv.gwkr("gwoc", gwko(int ), (int)61);
                if (!var6_3) break;
                throw null;
            }
lbl143:
            // 2 sources

            case 2: {
                var5_4 /* !! */  = (int)kv.gwkr("gwod", gwko(int ), (int)62);
                if (!var6_3) ** GOTO lbl134
                throw null;
            }
            case 3: {
                var5_4 /* !! */  = (int)kv.gwkr("gwoe", gwko(int ), (int)63);
                if (var6_3) {
                    throw null;
                }
            }
lbl151:
            // 5 sources

            case 4: {
                var5_4 /* !! */  = (int)kv.gwkr("gwof", gwko(int ), (int)64);
                if (!var6_3) ** GOTO lbl143
                throw null;
            }
            case 5: {
                var5_4 /* !! */  = (int)kv.gwkr("gwog", gwko(int ), (int)65);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl192
            }
            case 6: {
                var5_4 /* !! */  = (int)kv.gwkr("gwoh", gwko(int ), (int)66);
                if (!var6_3) ** GOTO lbl134
                throw null;
            }
            case 7: {
                var5_4 /* !! */  = (int)kv.gwkr("gwoi", gwko(int ), (int)67);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 8: {
                var5_4 /* !! */  = (int)kv.gwkr("gwoj", gwko(int ), (int)68);
                if (var6_3) {
                    throw null;
                }
            }
lbl173:
            // 4 sources

            case 9: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var5_4 /* !! */  = (int)kv.gwkr("gwok", gwko(int ), (int)69);
                    if (!var6_3) break block11;
                    throw null;
                }
            }
            case 10: {
                var5_4 /* !! */  = (int)kv.gwkr("gwol", gwko(int ), (int)70);
                if (var6_3) {
                    throw null;
                }
                ** GOTO lbl188
            }
            case 11: {
                do {
                    var5_4 /* !! */  = (int)kv.gwkr("gwom", gwko(int ), (int)71);
                } while (!var6_3);
                throw null;
            }
lbl188:
            // 3 sources

            case 12: {
                var5_4 /* !! */  = (int)kv.gwkr("gwon", gwko(int ), (int)72);
                if (!var6_3) ** GOTO lbl173
                throw null;
            }
lbl192:
            // 2 sources

            case 13: {
                var5_4 /* !! */  = (int)kv.gwkr("gwoo", gwko(int ), (int)73);
                if (!var6_3) ** GOTO lbl151
                throw null;
            }
            case 14: 
        }
        var5_4 /* !! */  = (int)kv.gwkr("gwop", gwko(int ), (int)74);
        ** while (!var6_3)
lbl199:
        // 1 sources

        throw null;
    }

    private static void gwwu() {
        kv.gwmq[0] = -1298525605703537443L;
        kv.gwmq[1] = -2941798884407293910L;
        kv.gwmq[2] = -148540094895960896L;
        kv.gwmq[3] = -3644437329090316193L;
        kv.gwmq[4] = -2502192631419744398L;
        kv.gwmq[5] = 5644935031476651995L;
        kv.gwmq[6] = -2169354546787438419L;
        kv.gwmq[7] = 1763196308796566634L;
        kv.gwmq[8] = 934729089722994206L;
        kv.gwmq[9] = -7227956700933662041L;
        kv.gwmq[10] = 8855507458688377951L;
        kv.gwmq[11] = -7345607126464005656L;
        kv.gwmq[12] = 9024038988110575558L;
        kv.gwmq[13] = -7457803293029796030L;
        kv.gwmq[14] = 76455362585732920L;
        kv.gwmq[15] = -816925129635577143L;
        kv.gwmq[16] = 5669243104456104477L;
        kv.gwmq[17] = -6755371113106387510L;
        kv.gwmq[18] = -4524267756161795191L;
        kv.gwmq[19] = -145632341016680854L;
        kv.gwmq[20] = 8308580812587695922L;
        kv.gwmq[21] = 4348174239815949618L;
        kv.gwmq[22] = -9122399674494183583L;
        kv.gwmq[23] = 7771243900939122112L;
        kv.gwmq[24] = 8274780773428967940L;
        kv.gwmq[25] = 6527032774550829205L;
        kv.gwmq[26] = 6408696992075686527L;
        kv.gwmq[27] = 5765469735734167676L;
        kv.gwmq[28] = -345433728229496135L;
        kv.gwmq[29] = -431703930958501882L;
        kv.gwmq[30] = 7483341243856788088L;
        kv.gwmq[31] = 1468054265830359301L;
        kv.gwmq[32] = -7916267051349864884L;
        kv.gwmq[33] = 42568844702603491L;
        kv.gwmq[34] = 2332942914791102619L;
        kv.gwmq[35] = 4917964317156376179L;
        kv.gwmq[36] = -3238217435937730825L;
        kv.gwmq[37] = -1430289837380900177L;
        kv.gwmq[38] = -2818867587486878580L;
        kv.gwmq[39] = 8580827276647469506L;
        kv.gwmq[40] = -8072540492528666138L;
        kv.gwmq[41] = -8691117300087587524L;
        kv.gwmq[42] = 6030484528161625364L;
        kv.gwmq[43] = -9051020811815438387L;
        kv.gwmq[44] = 7200249694512052886L;
        kv.gwmq[45] = 3725504479727029440L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ks get(String var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = kv.nq - kv.gwkr("gwoq", gwmo(int ), (int)24)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == kv.gwkr("gwor", gwko(int ), (int)75)) break;
            v0 /* !! */  = (long)kv.gwkr("gwos", gwko(int ), (int)76);
        }
        var3_1 = kv.c;
        v1 /* !! */  = kv.nq;
        if (true) ** GOTO lbl12
        block6: while (true) {
            v1 /* !! */  = (long)(v2 - kv.gwkr("gwot", gwmo(int ), (int)25));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -2054850496: {
                    v2 = kv.gwkr("gwou", gwmo(int ), (int)26);
                    continue block6;
                }
                case 951525200: {
                    break block6;
                }
                case 1016562841: {
                    v2 = kv.gwkr("gwov", gwmo(int ), (int)27);
                    continue block6;
                }
            }
            break;
        }
        var2_2 = kv.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = kv.nq - kv.gwkr("gwow", gwmo(int ), (int)28)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == kv.gwkr("gwoy", gwko(int ), (int)77)) break;
            v3 /* !! */  = (long)kv.gwkr("gwoz", gwko(int ), (int)78);
        }
        var1_3 = kv.a;
        if (var3_1) {
            throw null;
lbl31:
            // 1 sources

            return null;
        }
        ** while (var1_3 || var1_3)
lbl34:
        // 1 sources

        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = kv.nq - kv.gwkr("gwpb", gwmo(int ), (int)29)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v4 /* !! */  == kv.gwkr("gwpc", gwko(int ), (int)79)) break;
            v4 /* !! */  = (long)kv.gwkr("gwpf", gwko(int ), (int)80);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = kv.nq - kv.gwkr("gwpj", gwmo(int ), (int)30)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v5 /* !! */  == kv.gwkr("gwpk", gwko(int ), (int)81)) break;
            v5 /* !! */  = (long)kv.gwkr("gwpl", gwko(int ), (int)82);
        }
        return kv.fonts.get(var0);
    }

    private static void gwvr() {
        kv.gwkp[100] = -1334322419;
        kv.gwkp[101] = 1751834705;
        kv.gwkp[102] = -1237692128;
        kv.gwkp[103] = 756104574;
        kv.gwkp[104] = 1678802890;
        kv.gwkp[105] = -935618354;
        kv.gwkp[106] = 2019223830;
        kv.gwkp[107] = 1966037181;
        kv.gwkp[108] = -2118241843;
        kv.gwkp[109] = 473443862;
        kv.gwkp[110] = 1075272898;
        kv.gwkp[111] = 1921627636;
        kv.gwkp[112] = 526804446;
        kv.gwkp[113] = 108082027;
        kv.gwkp[114] = -934814688;
        kv.gwkp[115] = 701005555;
        kv.gwkp[116] = 1488333695;
        kv.gwkp[117] = -1675533622;
        kv.gwkp[118] = 1349294259;
        kv.gwkp[119] = 1102228264;
        kv.gwkp[120] = -1409889311;
        kv.gwkp[121] = 2141570765;
        kv.gwkp[122] = 2037577318;
        kv.gwkp[123] = -427968546;
        kv.gwkp[124] = 671792655;
        kv.gwkp[125] = 1759747291;
        kv.gwkp[126] = 1031483159;
        kv.gwkp[127] = 837816860;
        kv.gwkp[128] = 1516212845;
        kv.gwkp[129] = -620402053;
        kv.gwkp[130] = 1288324937;
        kv.gwkp[131] = -867695394;
        kv.gwkp[132] = 1329863333;
        kv.gwkp[133] = -939050279;
        kv.gwkp[134] = 2016623577;
        kv.gwkp[135] = -425573966;
        kv.gwkp[136] = 406999989;
        kv.gwkp[137] = 1570060104;
        kv.gwkp[138] = 1351386677;
        kv.gwkp[139] = -1749527060;
        kv.gwkp[140] = 1745932474;
        kv.gwkp[141] = -1891693148;
        kv.gwkp[142] = 611672449;
        kv.gwkp[143] = -394223306;
        kv.gwkp[144] = 1386721610;
        kv.gwkp[145] = 188079045;
        kv.gwkp[146] = 1275097747;
        kv.gwkp[147] = 884908381;
        kv.gwkp[148] = -834575619;
        kv.gwkp[149] = -135163552;
        kv.gwkp[150] = 1661973030;
        kv.gwkp[151] = -1255430221;
        kv.gwkp[152] = 1607446748;
        kv.gwkp[153] = 762707211;
        kv.gwkp[154] = -108542464;
        kv.gwkp[155] = 852314661;
        kv.gwkp[156] = 1592912833;
        kv.gwkp[157] = 331282666;
        kv.gwkp[158] = 171910681;
        kv.gwkp[159] = -1232066320;
        kv.gwkp[160] = 1795237643;
        kv.gwkp[161] = 475949515;
        kv.gwkp[162] = -1997556976;
    }
}

