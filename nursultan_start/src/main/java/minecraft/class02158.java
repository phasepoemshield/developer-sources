/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10285
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00751
 *  minecraft.class00753
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class03322
 *  minecraft.class03460
 *  minecraft.class03556
 *  minecraft.class03875
 *  minecraft.class04206
 *  minecraft.class04389
 *  minecraft.class04521
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class06034
 *  minecraft.class06057
 *  minecraft.class06062
 *  minecraft.class06069
 *  minecraft.class06072
 *  minecraft.class06080
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class07809
 *  minecraft.class07811
 *  minecraft.class07829
 *  minecraft.class08050
 *  minecraft.class08092
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10285;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00751;
import minecraft.class00753;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class03322;
import minecraft.class03460;
import minecraft.class03556;
import minecraft.class03875;
import minecraft.class04206;
import minecraft.class04389;
import minecraft.class04521;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class06034;
import minecraft.class06057;
import minecraft.class06062;
import minecraft.class06069;
import minecraft.class06072;
import minecraft.class06080;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class07809;
import minecraft.class07811;
import minecraft.class07829;
import minecraft.class08050;
import minecraft.class08092;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public abstract class class02158<C extends class06034> {
    public static final class02158<class04389> N = class02158.N("cave", new class07811(class04389.L));
    public static final class02158<class04389> y = class02158.N("nether_cave", new class07809(class04389.L));
    public static final class02158<class06072> L = class02158.N("canyon", new class06062(class06072.L));
    protected static final class00500 u = class00869.N.W();
    protected static final class00500 i = class00869.mr.W();
    protected static final class04688 R = class04684.L.M();
    protected static final class04688 M = class04684.i.M();
    protected Set<class04651> B = ImmutableSet.of((Object)class04684.L);
    private final MapCodec<class07829<C>> Z;

    public MapCodec<class07829<C>> L() {
        return this.Z;
    }

    public class02158(Codec<C> codec) {
        this.Z = codec.fieldOf("config").xmap(this::N, class07829::y);
    }

    public int u() {
        return 4;
    }

    private static boolean y(class06034 class060342) {
        return class07529.r || class060342.U.N();
    }

    private static class00500 y(class06034 class060342, class00500 class005002) {
        if (class005002.N(class00869.N)) {
            return class060342.U.y();
        }
        if (class005002.N(class00869.K)) {
            class00500 class005003 = class060342.U.L();
            if (class005003.y((class08092)class06665.q)) {
                return (class00500)class005003.y((class08092)class06665.q, (Comparable)Boolean.valueOf(true));
            }
            return class005003;
        }
        if (class005002.N(class00869.V)) {
            return class060342.U.u();
        }
        return class005002;
    }

    protected boolean N(C c, class00500 class005002) {
        return class005002.N(((class06034)c).E);
    }

    protected static boolean N(class07321 class073212, double d, double d2, int n, int n2, float f) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7 = class073212.L();
        double d8 = d - d7;
        return d8 * d8 + (d6 = d2 - (d5 = (double)class073212.u())) * d6 - (d4 = (double)(n2 - n)) * d4 <= (d3 = (double)(f + 2.0f + 16.0f)) * d3;
    }

    public class07829<C> N(C c) {
        return new class07829(this, c);
    }

    private static <C extends class06034, F extends class02158<C>> F N(String string, F f) {
        return (F)((class02158)class00751.N((class00751)class04206.c, (String)string, f));
    }

    protected boolean N(class06080 class060802, C c, class08050 class080502, Function<class07209, class03556<class00780>> function, class03322 class033222, class07218 class072182, class07218 class072183, class03460 class034602, MutableBoolean mutableBoolean) {
        class00500 class005003 = class080502.method_8320((class07209)class072182);
        if (class005003.N(class00869.Z) || class005003.N(class00869.RC)) {
            mutableBoolean.setTrue();
        }
        if (!this.N(c, class005003) && !class02158.y(c)) {
            return false;
        }
        class00500 class005004 = this.N(class060802, c, (class07209)class072182, class034602);
        if (class005004 == null) {
            return false;
        }
        class080502.N((class07209)class072182, class005004);
        if (class034602.N() && !class005004.Y().W()) {
            class080502.u((class07209)class072182);
        }
        if (mutableBoolean.isTrue()) {
            class072183.N((class00753)class072182, class07211.field_11033);
            if (class080502.method_8320((class07209)class072183).N(class00869.z)) {
                class060802.N(function, class080502, (class07209)class072183, !class005004.Y().W()).ifPresent(class005002 -> {
                    class080502.N((class07209)class072183, class005002);
                    if (!class005002.Y().W()) {
                        class080502.u((class07209)class072183);
                    }
                });
            }
        }
        return true;
    }

    private @Nullable class00500 N(class06080 class060802, C c, class07209 class072092, class03460 class034602) {
        if (class072092.method_10264() <= ((class06034)c).z.N((class06057)class060802)) {
            return M.B();
        }
        class00500 class005002 = class034602.N((class03875)new class10285(class072092.method_10263(), class072092.method_10264(), class072092.method_10260()), 0.0);
        if (class005002 == null) {
            return class02158.y(c) ? ((class06034)c).U.i() : null;
        }
        return class02158.y(c) ? class02158.y(c, class005002) : class005002;
    }

    protected boolean N(class06080 class060802, C c, class08050 class080502, Function<class07209, class03556<class00780>> function, class03460 class034602, double d, double d2, double d3, double d4, double d5, class03322 class033222, class04521 class045212) {
        class07321 class073212 = class080502.R();
        double d6 = class073212.L();
        double d7 = class073212.u();
        double d8 = 16.0 + d4 * 2.0;
        if (Math.abs(d - d6) > d8 || Math.abs(d3 - d7) > d8) {
            return false;
        }
        int n = class073212.i();
        int n2 = class073212.R();
        int n3 = Math.max(class04995.N((double)(d - d4)) - n - 1, 0);
        int n4 = Math.min(class04995.N((double)(d + d4)) - n, 15);
        int n5 = Math.max(class04995.N((double)(d2 - d5)) - 1, class060802.i() + 1);
        int n6 = class080502.d() ? 0 : 7;
        int n7 = Math.min(class04995.N((double)(d2 + d5)) + 1, class060802.i() + class060802.R() - 1 - n6);
        int n8 = Math.max(class04995.N((double)(d3 - d4)) - n2 - 1, 0);
        int n9 = Math.min(class04995.N((double)(d3 + d4)) - n2, 15);
        boolean bl = false;
        class07218 class072182 = new class07218();
        class07218 class072183 = new class07218();
        for (int i = n3; i <= n4; ++i) {
            int n10 = class073212.N(i);
            double d9 = ((double)n10 + 0.5 - d) / d4;
            for (int j = n8; j <= n9; ++j) {
                int n11 = class073212.y(j);
                double d10 = ((double)n11 + 0.5 - d3) / d4;
                if (d9 * d9 + d10 * d10 >= 1.0) continue;
                MutableBoolean mutableBoolean = new MutableBoolean(false);
                for (int k = n7; k > n5; --k) {
                    double d11 = ((double)k - 0.5 - d2) / d5;
                    if (class045212.shouldSkip(class060802, d9, d11, d10, k) || class033222.y(i, k, j) && !class02158.y(c)) continue;
                    class033222.N(i, k, j);
                    class072182.N(n10, k, n11);
                    bl |= this.N(class060802, c, class080502, function, class033222, class072182, class072183, class034602, mutableBoolean);
                }
            }
        }
        return bl;
    }

    public abstract boolean N(class06080 var1, C var2, class08050 var3, Function<class07209, class03556<class00780>> var4, class06069 var5, class03460 var6, class07321 var7, class03322 var8);

    public abstract boolean N(C var1, class06069 var2);
}

