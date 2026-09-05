/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10734
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class06331
 *  minecraft.class06889
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  net.fabricmc.fabric.api.blockview.v2.FabricBlockView
 *  net.fabricmc.fabric.mixin.blockview.BlockGetterMixin
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10734;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06331;
import minecraft.class06889;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07319;
import net.fabricmc.fabric.api.blockview.v2.FabricBlockView;
import net.fabricmc.fabric.mixin.blockview.BlockGetterMixin;
import org.jspecify.annotations.Nullable;

public interface class07290
extends class05474,
FabricBlockView,
BlockGetterMixin {
    default public double L(class07209 class072092) {
        return this.N(this.method_8320(class072092).M(this, class072092), () -> {
            class07209 class072093 = class072092.method_10074();
            return this.method_8320(class072093).M(this, class072093);
        });
    }

    public class00500 method_8320(class07209 var1);

    public class04688 method_8316(class07209 var1);

    private BiFunction u(class05862 class058622) {
        return new class10734(this, class058622);
    }

    default public int y(class07209 class072092) {
        return this.method_8320(class072092).m();
    }

    default public class06183 N(class05862 class058623) {
        class07290 class072902;
        return class07290.N(class058623.y(), class058623.N(), class058623, this instanceof class04782 || (class072902 = this) instanceof class07299 && ((class07299)((Object)class072902)).method_8608() ? this.u(class058623) : (class058622, class072092) -> {
            class00500 class005002 = this.method_8320((class07209)class072092);
            class04688 class046882 = this.method_8316((class07209)class072092);
            class06889 class068892 = class058622.y();
            class06889 class068893 = class058622.N();
            class00494 class004942 = class058622.N(class005002, this, class072092);
            class06183 class061832 = this.N(class068892, class068893, (class07209)class072092, class004942, class005002);
            class06183 class061833 = class058622.N(class046882, this, class072092).method_1092(class068892, class068893, class072092);
            double d = class061832 == null ? Double.MAX_VALUE : class058622.y().M(class061832.y());
            double d2 = class061833 == null ? Double.MAX_VALUE : class058622.y().M(class061833.y());
            return d <= d2 ? class061832 : class061833;
        }, class058622 -> {
            class06889 class068892 = class058622.y().u(class058622.N());
            return class06183.N((class06889)class058622.N(), (class07211)class07211.N((double)class068892.M, (double)class068892.B, (double)class068892.Z), (class07209)class07209.method_49638((class00737)class058622.N()));
        });
    }

    private static int N(LongSet longSet, class06889 class068892, class00734 class007342, class07319 class073192) {
        double d = class007342.y();
        double d2 = class007342.L();
        double d3 = class007342.u();
        class00753 class007532 = class07290.N(class068892);
        class06889 class068893 = class007342.R();
        class06889 class068894 = new class06889(class068893.N() + d * 0.5 * (double)class007532.method_10263(), class068893.y() + d2 * 0.5 * (double)class007532.method_10264(), class068893.L() + d3 * 0.5 * (double)class007532.method_10260());
        class06889 class068895 = class068894.u(class068892);
        int n = class04995.N((double)class068895.M);
        int n2 = class04995.N((double)class068895.B);
        int n3 = class04995.N((double)class068895.Z);
        int n4 = class04995.U((double)class068892.M);
        int n5 = class04995.U((double)class068892.B);
        int n6 = class04995.U((double)class068892.Z);
        double d4 = n4 == 0 ? Double.MAX_VALUE : (double)n4 / class068892.M;
        double d5 = n5 == 0 ? Double.MAX_VALUE : (double)n5 / class068892.B;
        double d6 = n6 == 0 ? Double.MAX_VALUE : (double)n6 / class068892.Z;
        double d7 = d4 * (n4 > 0 ? 1.0 - class04995.R((double)class068895.M) : class04995.R((double)class068895.M));
        double d8 = d5 * (n5 > 0 ? 1.0 - class04995.R((double)class068895.B) : class04995.R((double)class068895.B));
        double d9 = d6 * (n6 > 0 ? 1.0 - class04995.R((double)class068895.Z) : class04995.R((double)class068895.Z));
        int n7 = 0;
        while (d7 <= 1.0 || d8 <= 1.0 || d9 <= 1.0) {
            if (d7 < d8) {
                if (d7 < d9) {
                    n += n4;
                    d7 += d4;
                } else {
                    n3 += n6;
                    d9 += d6;
                }
            } else if (d8 < d9) {
                n2 += n5;
                d8 += d5;
            } else {
                n3 += n6;
                d9 += d6;
            }
            Optional var33 = class00734.N((double)n, (double)n2, (double)n3, (double)(n + 1), (double)(n2 + 1), (double)(n3 + 1), (class06889)class068895, (class06889)class068894);
            if (var33.isEmpty()) continue;
            class06889 class068896 = (class06889)var33.get();
            double d10 = class04995.N((double)class068896.M, (double)((double)n + (double)1.0E-5f), (double)((double)n + 1.0 - (double)1.0E-5f));
            double d11 = class04995.N((double)class068896.B, (double)((double)n2 + (double)1.0E-5f), (double)((double)n2 + 1.0 - (double)1.0E-5f));
            double d12 = class04995.N((double)class068896.Z, (double)((double)n3 + (double)1.0E-5f), (double)((double)n3 + 1.0 - (double)1.0E-5f));
            int n8 = class04995.N((double)(d10 - d * (double)class007532.method_10263()));
            int n9 = class04995.N((double)(d11 - d2 * (double)class007532.method_10264()));
            int n10 = class04995.N((double)(d12 - d3 * (double)class007532.method_10260()));
            int n11 = ++n7;
            for (class07209 class072092 : class07209.method_73158((int)n, (int)n2, (int)n3, (int)n8, (int)n9, (int)n10, (class06889)class068892)) {
                if (!longSet.add(class072092.method_10063()) || class073192.visit(class072092, n11)) continue;
                return -1;
            }
        }
        return n7;
    }

    private static class00753 N(class06889 class068892) {
        int n;
        double d = Math.abs(class06889.u.y(class068892));
        double d2 = Math.abs(class06889.i.y(class068892));
        double d3 = Math.abs(class06889.R.y(class068892));
        int n2 = class068892.M >= 0.0 ? 1 : -1;
        int n3 = class068892.B >= 0.0 ? 1 : -1;
        int n4 = n = class068892.Z >= 0.0 ? 1 : -1;
        if (d <= d2 && d <= d3) {
            return new class00753(-n2, -n, n3);
        }
        if (d2 <= d3) {
            return new class00753(n, -n3, -n2);
        }
        return new class00753(-n3, n2, -n);
    }

    default public class06183 N(class06331 class063313) {
        return class07290.N(class063313.y(), class063313.N(), class063313, (class063312, class072092) -> {
            class00500 class005002 = this.method_8320((class07209)class072092);
            class06889 class068892 = class063312.y().u(class063312.N());
            return class063312.L().test(class005002) ? new class06183(class063312.N(), class07211.N((double)class068892.M, (double)class068892.B, (double)class068892.Z), class07209.method_49638((class00737)class063312.N()), false) : null;
        }, class063312 -> {
            class06889 class068892 = class063312.y().u(class063312.N());
            return class06183.N((class06889)class063312.N(), (class07211)class07211.N((double)class068892.M, (double)class068892.B, (double)class068892.Z), (class07209)class07209.method_49638((class00737)class063312.N()));
        });
    }

    default public Stream<class00500> N(class00734 class007342) {
        return class07209.method_29715((class00734)class007342).map(this::method_8320);
    }

    default public <T extends class00394> Optional<T> N(class07209 class072092, class00404<T> class004042) {
        class00394 class003942 = this.method_8321(class072092);
        if (class003942 == null || class003942.O() != class004042) {
            return Optional.empty();
        }
        return Optional.of(class003942);
    }

    public static boolean N(class06889 class068892, class06889 class068893, class00734 class007342, class07319 class073192) {
        class06889 class068894 = class068893.u(class068892);
        if (class068894.B() < (double)class04995.z((float)class07290.N(1.0E-5f))) {
            for (class07209 class072092 : class07209.method_62671((class00734)class007342)) {
                if (class073192.visit(class072092, 0)) continue;
                return false;
            }
            return true;
        }
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        for (class07209 class072093 : class07209.method_73159((class00734)class007342.L(class068894.L(-1.0)), (class06889)class068894)) {
            if (!class073192.visit(class072093, 0)) {
                return false;
            }
            longOpenHashSet.add(class072093.method_10063());
        }
        int n = class07290.N((LongSet)longOpenHashSet, class068894, class007342, class073192);
        if (n < 0) {
            return false;
        }
        for (class07209 class072094 : class07209.method_73159((class00734)class007342, (class06889)class068894)) {
            if (!longOpenHashSet.add(class072094.method_10063()) || class073192.visit(class072094, n + 1)) continue;
            return false;
        }
        return true;
    }

    private static float N(float f) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_7)) {
            return 0.99999f;
        }
        return f;
    }

    public static <T, C> T N(class06889 class068892, class06889 class068893, C c, BiFunction<C, class07209, @Nullable T> biFunction, Function<C, T> function) {
        int n;
        int n2;
        if (class068892.equals((Object)class068893)) {
            return function.apply(c);
        }
        double d = class04995.u((double)-1.0E-7, (double)class068893.M, (double)class068892.M);
        double d2 = class04995.u((double)-1.0E-7, (double)class068893.B, (double)class068892.B);
        double d3 = class04995.u((double)-1.0E-7, (double)class068893.Z, (double)class068892.Z);
        double d4 = class04995.u((double)-1.0E-7, (double)class068892.M, (double)class068893.M);
        double d5 = class04995.u((double)-1.0E-7, (double)class068892.B, (double)class068893.B);
        double d6 = class04995.u((double)-1.0E-7, (double)class068892.Z, (double)class068893.Z);
        int n3 = class04995.N((double)d4);
        class07218 class072182 = new class07218(n3, n2 = class04995.N((double)d5), n = class04995.N((double)d6));
        T t = biFunction.apply(c, (class07209)class072182);
        if (t != null) {
            return t;
        }
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        int n4 = class04995.U((double)d7);
        int n5 = class04995.U((double)d8);
        int n6 = class04995.U((double)d9);
        double d10 = n4 == 0 ? Double.MAX_VALUE : (double)n4 / d7;
        double d11 = n5 == 0 ? Double.MAX_VALUE : (double)n5 / d8;
        double d12 = n6 == 0 ? Double.MAX_VALUE : (double)n6 / d9;
        double d13 = d10 * (n4 > 0 ? 1.0 - class04995.R((double)d4) : class04995.R((double)d4));
        double d14 = d11 * (n5 > 0 ? 1.0 - class04995.R((double)d5) : class04995.R((double)d5));
        double d15 = d12 * (n6 > 0 ? 1.0 - class04995.R((double)d6) : class04995.R((double)d6));
        while (d13 <= 1.0 || d14 <= 1.0 || d15 <= 1.0) {
            T t2;
            if (d13 < d14) {
                if (d13 < d15) {
                    n3 += n4;
                    d13 += d10;
                } else {
                    n += n6;
                    d15 += d12;
                }
            } else if (d14 < d15) {
                n2 += n5;
                d14 += d11;
            } else {
                n += n6;
                d15 += d12;
            }
            if ((t2 = biFunction.apply(c, (class07209)class072182.N(n3, n2, n))) == null) continue;
            return t2;
        }
        return function.apply(c);
    }

    default public double N(class00494 class004942, Supplier<class00494> supplier) {
        if (!class004942.method_1110()) {
            return class004942.method_1105(class07185.field_11052);
        }
        double d = supplier.get().method_1105(class07185.field_11052);
        if (d >= 1.0) {
            return d - 1.0;
        }
        return Double.NEGATIVE_INFINITY;
    }

    default public @Nullable class06183 N(class06889 class068892, class06889 class068893, class07209 class072092, class00494 class004942, class00500 class005002) {
        class06183 class061832;
        class06183 class061833 = class004942.method_1092(class068892, class068893, class072092);
        if (class061833 != null && (class061832 = class005002.Z(this, class072092).method_1092(class068892, class068893, class072092)) != null && class061832.y().u(class068892).B() < class061833.y().u(class068892).B()) {
            return class061833.N(class061832.i());
        }
        return class061833;
    }

    public @Nullable class00394 method_8321(class07209 var1);
}

