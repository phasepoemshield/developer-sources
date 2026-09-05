/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class03168
 *  minecraft.class03238
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class03168;
import minecraft.class03238;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public final class class03707 {
    private static final Map<String, class03707> E = new Object2ObjectArrayMap();
    public static final Codec<class03707> N = Codec.stringResolver(class037072 -> class037072.W, E::get);
    public static final class03707 y = new class03707("oak", 0.1f, Optional.empty(), Optional.empty(), Optional.of(class03168.M), Optional.of(class03168.T), Optional.of(class03168.I), Optional.of(class03168.H));
    public static final class03707 L = new class03707("spruce", 0.5f, Optional.of(class03168.v), Optional.of(class03168.n), Optional.of(class03168.m), Optional.empty(), Optional.empty(), Optional.empty());
    public static final class03707 u = new class03707("mangrove", 0.85f, Optional.empty(), Optional.empty(), Optional.of(class03168.k), Optional.of(class03168.Y), Optional.empty(), Optional.empty());
    public static final class03707 i = new class03707("azalea", Optional.empty(), Optional.of(class03168.w), Optional.empty());
    public static final class03707 R = new class03707("birch", Optional.empty(), Optional.of(class03168.E), Optional.of(class03168.K));
    public static final class03707 M = new class03707("jungle", Optional.of(class03168.j), Optional.of(class03168.b), Optional.empty());
    public static final class03707 B = new class03707("acacia", Optional.empty(), Optional.of(class03168.W), Optional.empty());
    public static final class03707 Z = new class03707("cherry", Optional.empty(), Optional.of(class03168.Q), Optional.of(class03168.X));
    public static final class03707 z = new class03707("dark_oak", Optional.of(class03168.B), Optional.empty(), Optional.empty());
    public static final class03707 U = new class03707("pale_oak", Optional.of(class03168.z), Optional.empty(), Optional.empty());
    private final String W;
    private final float m;
    private final Optional<class05946<class03238<?, ?>>> P;
    private final Optional<class05946<class03238<?, ?>>> s;
    private final Optional<class05946<class03238<?, ?>>> T;
    private final Optional<class05946<class03238<?, ?>>> b;
    private final Optional<class05946<class03238<?, ?>>> j;
    private final Optional<class05946<class03238<?, ?>>> v;

    public class03707(String string, Optional<class05946<class03238<?, ?>>> optional, Optional<class05946<class03238<?, ?>>> optional2, Optional<class05946<class03238<?, ?>>> optional3) {
        this(string, 0.0f, optional, Optional.empty(), optional2, Optional.empty(), optional3, Optional.empty());
    }

    public class03707(String string, float f, Optional<class05946<class03238<?, ?>>> optional, Optional<class05946<class03238<?, ?>>> optional2, Optional<class05946<class03238<?, ?>>> optional3, Optional<class05946<class03238<?, ?>>> optional4, Optional<class05946<class03238<?, ?>>> optional5, Optional<class05946<class03238<?, ?>>> optional6) {
        this.W = string;
        this.m = f;
        this.P = optional;
        this.s = optional2;
        this.T = optional3;
        this.b = optional4;
        this.j = optional5;
        this.v = optional6;
        E.put(string, this);
    }

    public boolean N(class04782 class047822, class08088 class080882, class07209 class072092, class00500 class005002, class06069 class060692) {
        class05946<class03238<?, ?>> var7;
        class03556 class035562;
        class05946<class03238<?, ?>> var6 = this.N(class060692);
        if (var6 != null && (class035562 = (class03556)class047822.method_30349().L(class04227.Nh).N(var6).orElse(null)) != null) {
            for (int i = 0; i >= -1; --i) {
                for (int j = 0; j >= -1; --j) {
                    if (!class03707.N(class005002, (class07290)class047822, class072092, i, j)) continue;
                    class03238 class032382 = (class03238)class035562.N();
                    class00500 class005003 = class00869.N.W();
                    class047822.method_8652(class072092.method_10069(i, 0, j), class005003, 260);
                    class047822.method_8652(class072092.method_10069(i + 1, 0, j), class005003, 260);
                    class047822.method_8652(class072092.method_10069(i, 0, j + 1), class005003, 260);
                    class047822.method_8652(class072092.method_10069(i + 1, 0, j + 1), class005003, 260);
                    if (class032382.N((class05974)class047822, class080882, class060692, class072092.method_10069(i, 0, j))) {
                        return true;
                    }
                    class047822.method_8652(class072092.method_10069(i, 0, j), class005002, 260);
                    class047822.method_8652(class072092.method_10069(i + 1, 0, j), class005002, 260);
                    class047822.method_8652(class072092.method_10069(i, 0, j + 1), class005002, 260);
                    class047822.method_8652(class072092.method_10069(i + 1, 0, j + 1), class005002, 260);
                    return false;
                }
            }
        }
        if ((var7 = this.N(class060692, this.N((class07284)class047822, class072092))) == null) {
            return false;
        }
        class03556 class035563 = class047822.method_30349().L(class04227.Nh).N(var7).orElse(null);
        if (class035563 == null) {
            return false;
        }
        class03238 class032383 = (class03238)class035563.N();
        class00500 class005004 = class047822.method_8316(class072092).B();
        class047822.method_8652(class072092, class005004, 260);
        if (class032383.N((class05974)class047822, class080882, class060692, class072092)) {
            if (class047822.method_8320(class072092) == class005004) {
                class047822.method_8413(class072092, class005002, class005004, 2);
            }
            return true;
        }
        class047822.method_8652(class072092, class005002, 260);
        return false;
    }

    private boolean N(class07284 class072842, class07209 class072092) {
        for (class07209 class072093 : class07218.method_10097((class07209)class072092.method_10074().method_10076(2).method_10088(2), (class07209)class072092.method_10084().method_10077(2).method_10089(2))) {
            if (!class072842.method_8320(class072093).N(class01210.p)) continue;
            return true;
        }
        return false;
    }

    private static boolean N(class00500 class005002, class07290 class072902, class07209 class072092, int n, int n2) {
        class00891 class008912 = class005002.i();
        return class072902.method_8320(class072092.method_10069(n, 0, n2)).N(class008912) && class072902.method_8320(class072092.method_10069(n + 1, 0, n2)).N(class008912) && class072902.method_8320(class072092.method_10069(n, 0, n2 + 1)).N(class008912) && class072902.method_8320(class072092.method_10069(n + 1, 0, n2 + 1)).N(class008912);
    }

    private @Nullable class05946<class03238<?, ?>> N(class06069 class060692, boolean bl) {
        if (class060692.z() < this.m) {
            if (bl && this.v.isPresent()) {
                return this.v.get();
            }
            if (this.b.isPresent()) {
                return this.b.get();
            }
        }
        if (bl && this.j.isPresent()) {
            return this.j.get();
        }
        return this.T.orElse(null);
    }

    private @Nullable class05946<class03238<?, ?>> N(class06069 class060692) {
        if (this.s.isPresent() && class060692.z() < this.m) {
            return this.s.get();
        }
        return this.P.orElse(null);
    }
}

