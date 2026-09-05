/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00544
 *  minecraft.class00549
 *  minecraft.class00558
 *  minecraft.class00611
 *  minecraft.class00734
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01042
 *  minecraft.class01128
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01296
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02209
 *  minecraft.class02236
 *  minecraft.class02237
 *  minecraft.class02248
 *  minecraft.class02796
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04298
 *  minecraft.class04651
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class05087
 *  minecraft.class05517
 *  minecraft.class05527
 *  minecraft.class05795
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07126
 *  minecraft.class07190
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07376
 *  minecraft.class07536
 *  minecraft.class07830
 *  minecraft.class07878
 *  minecraft.class08036
 *  minecraft.class08050
 *  minecraft.class08057
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00544;
import minecraft.class00549;
import minecraft.class00558;
import minecraft.class00611;
import minecraft.class00734;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class01128;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01296;
import minecraft.class01628;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02209;
import minecraft.class02236;
import minecraft.class02237;
import minecraft.class02248;
import minecraft.class02796;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04298;
import minecraft.class04651;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class05087;
import minecraft.class05517;
import minecraft.class05527;
import minecraft.class05795;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07126;
import minecraft.class07190;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07376;
import minecraft.class07536;
import minecraft.class07830;
import minecraft.class07878;
import minecraft.class08036;
import minecraft.class08050;
import minecraft.class08057;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01607
implements class05974 {
    private static final Logger N = LogUtils.getLogger();
    private final class02248<class02236> y;
    private final class08050 L;
    private final class04782 u;
    private final long i;
    private final class05087 M;
    private final class06069 B;
    private final class07376 Z;
    private final class01628<class00891> z = new class01628(class072092 -> this.method_8500((class07209)class072092).P());
    private final class01628<class04651> U = new class01628(class072092 -> this.method_8500((class07209)class072092).s());
    private final class05517 E;
    private final class02237 W;
    private @Nullable Supplier<String> m;
    private final AtomicLong P = new AtomicLong();
    private static final class01894 s = class01894.y((String)"worldgen_region_random");

    public class07321 L() {
        return this.L.R();
    }

    private void P(class07209 class072092) {
        this.method_8500(class072092).u(class072092);
    }

    public class01042 method_30349() {
        return this.u.method_30349();
    }

    public boolean method_8608() {
        return false;
    }

    public int method_31607() {
        return this.u.method_31607();
    }

    public class00500 method_8320(class07209 class072092) {
        return this.method_8392(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260())).method_8320(class072092);
    }

    public void method_32888(class03556<class01194> class035562, class06889 class068892, class01164 class011642) {
    }

    public @Nullable class02796 method_8503() {
        return this.u.method_8503();
    }

    public class08057 method_8621() {
        return this.u.method_8621();
    }

    public void method_8406(class07126 class071262, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    public class04688 method_8316(class07209 class072092) {
        return this.method_8500(class072092).method_8316(class072092);
    }

    public boolean method_8649(class07049 class070492) {
        int n = class01296.N((int)class070492.method_31477());
        int n2 = class01296.N((int)class070492.method_31479());
        this.method_8392(n, n2).N(class070492);
        return true;
    }

    public List<class08036> method_18456() {
        return Collections.emptyList();
    }

    public class01607(class04782 class047822, class02248<class02236> class022482, class02237 class022372, class08050 class080502) {
        this.W = class022372;
        this.y = class022482;
        this.L = class080502;
        this.u = class047822;
        this.i = class047822.method_8412();
        this.M = class047822.method_8401();
        this.B = class047822.method_14178().W().N(s).N(this.L.R().W());
        this.Z = class047822.method_8597();
        this.E = new class05517((class05527)this, class05517.N((long)this.i));
    }

    public boolean u(class07209 class072092) {
        int n = class01296.N((int)class072092.method_10263());
        int n2 = class01296.N((int)class072092.method_10260());
        class07321 class073212 = this.L();
        int n3 = Math.abs(class073212.B - n);
        int n4 = Math.abs(class073212.Z - n2);
        if (n3 > this.W.u() || n4 > this.W.u()) {
            class07536.y((String)("Detected setBlock in a far chunk [" + n + ", " + n2 + "], pos: " + String.valueOf(class072092) + ", status: " + String.valueOf(this.W.N()) + (String)(this.m == null ? "" : ", currently generating: " + this.m.get())));
            return false;
        }
        return !this.L.d() || !this.L.w().method_31601(class072092.method_10264());
    }

    public @Nullable class08036 N(double d, double d2, double d3, double d4, @Nullable Predicate<class07049> predicate) {
        return null;
    }

    public boolean N(int n, int n2) {
        return this.L.R().R(n, n2) < this.W.y().y();
    }

    public void N(@Nullable Supplier<String> supplier) {
        this.m = supplier;
    }

    public boolean N(class07321 class073212, int n) {
        return this.u.method_14178().L.y(class073212, n);
    }

    public class03556<class00780> method_22387(int n, int n2, int n3) {
        return this.u.method_22387(n, n2, n3);
    }

    public class07052 method_8404(class07209 class072092) {
        if (!this.N(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()))) {
            throw new RuntimeException("We are asking a region for a chunk out of bound");
        }
        return new class07052(this.u.y(), this.u.method_8532(), 0L, this.u.method_76332(class072092));
    }

    public @Nullable class08050 method_8402(int n, int n2, class00549 class005492, boolean bl) {
        class07080 class070802;
        class02236 class022362;
        class00549 class005493;
        int n3 = this.L.R().R(n, n2);
        class00549 class005494 = class005493 = n3 >= this.W.y().y() ? null : this.W.y().N(n3);
        if (class005493 != null) {
            class022362 = (class02236)this.y.N(n, n2);
            if (class005492.L(class005493) && (class070802 = class022362.N(class005493)) != null) {
                return class070802;
            }
        } else {
            class022362 = null;
        }
        class070802 = class07080.N((Throwable)new IllegalStateException("Requested chunk unavailable during world generation"), (String)"Exception generating new chunk");
        class07074 class070742 = class070802.N("Chunk request details");
        class070742.N("Requested chunk", (Object)String.format(Locale.ROOT, "%d, %d", n, n2));
        class070742.N("Generating status", () -> this.W.N().R());
        class070742.N("Requested status", () -> ((class00549)class005492).R());
        class070742.N("Actual status", () -> class022362 == null ? "[out of cache bounds]" : class022362.T().R());
        class070742.N("Maximum allowed status", () -> class005493 == null ? "null" : class005493.R());
        class070742.N("Dependencies", () -> ((class02209)this.W.y()).toString());
        class070742.N("Requested distance", (Object)n3);
        class070742.N("Generating chunk", () -> ((class07321)this.L.R()).toString());
        throw new class07878(class070802);
    }

    public int method_8615() {
        return this.u.method_8615();
    }

    public class07376 method_8597() {
        return this.Z;
    }

    public void method_8444(@Nullable class07049 class070492, int n, class07209 class072092, int n2) {
    }

    public float method_24852(class07211 class072112, boolean bl) {
        return 1.0f;
    }

    @Deprecated
    public class04782 method_8410() {
        return this.u;
    }

    public long method_8412() {
        return this.i;
    }

    public class04298<class00891> method_8397() {
        return this.z;
    }

    public class00611 method_75598() {
        return class00611.N;
    }

    public int method_8624(class07830 class078302, int n, int n2) {
        return this.method_8392(class01296.N((int)n), class01296.N((int)n2)).N(class078302, n & 0xF, n2 & 0xF) + 1;
    }

    public class03767 method_45162() {
        return this.u.method_45162();
    }

    public class05087 method_8401() {
        return this.M;
    }

    public class08050 method_8392(int n, int n2) {
        return this.method_22342(n, n2, class00549.L);
    }

    public class04298<class04651> method_8405() {
        return this.U;
    }

    public class00558 method_8398() {
        return this.u.method_14178();
    }

    public boolean method_30092(class07209 class072092, class00500 class005002, int n, int n2) {
        if (!this.u(class072092)) {
            return false;
        }
        class08050 class080502 = this.method_8500(class072092);
        class00500 class005003 = class080502.N(class072092, class005002, n);
        if (class005003 != null) {
            this.u.method_66016(class072092, class005003, class005002);
        }
        if (class005002.k()) {
            if (class080502.E().u() == class00544.field_12807) {
                class00394 class003942 = ((class07190)class005002.i()).N(class072092, class005002);
                if (class003942 != null) {
                    class080502.N(class003942);
                } else {
                    class080502.N(class072092);
                }
            } else {
                class07001 class070012 = new class07001();
                class070012.N("x", class072092.method_10263());
                class070012.N("y", class072092.method_10264());
                class070012.N("z", class072092.method_10260());
                class070012.N_67("id", "DUMMY");
                class080502.N(class070012);
            }
        } else if (class005003 != null && class005003.k()) {
            class080502.N(class072092);
        }
        if (class005002.E((class07290)this, class072092) && (n & 0x10) == 0) {
            this.P(class072092);
        }
        return true;
    }

    public boolean method_8650(class07209 class072092, boolean bl) {
        return this.method_8652(class072092, class00869.N.W(), 3);
    }

    public List<class07049> method_8333(@Nullable class07049 class070492, class00734 class007342, @Nullable Predicate<? super class07049> predicate) {
        return Collections.emptyList();
    }

    public boolean method_30093(class07209 class072092, boolean bl, @Nullable class07049 class070492, int n) {
        class00500 class005002 = this.method_8320(class072092);
        if (class005002.P()) {
            return false;
        }
        if (bl) {
            class00394 class003942 = class005002.k() ? this.method_8321(class072092) : null;
            class00891.N((class00500)class005002, (class07299)this.u, (class07209)class072092, (class00394)class003942, (class07049)class070492, (class06584)class06584.E);
        }
        return this.method_30092(class072092, class00869.N.W(), 3, n);
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        class08050 class080502 = this.method_8500(class072092);
        class00394 class003942 = class080502.method_8321(class072092);
        if (class003942 != null) {
            return class003942;
        }
        class07001 class070012 = class080502.i(class072092);
        class00500 class005002 = class080502.method_8320(class072092);
        if (class070012 != null) {
            if ("DUMMY".equals(class070012.y("id", ""))) {
                if (!class005002.k()) {
                    return null;
                }
                class003942 = ((class07190)class005002.i()).N(class072092, class005002);
            } else {
                class003942 = class00394.N((class07209)class072092, (class00500)class005002, (class07001)class070012, (class01929)this.u.method_30349());
            }
            if (class003942 != null) {
                class080502.N(class003942);
                return class003942;
            }
        }
        if (class005002.k()) {
            N.warn("Tried to access a block entity before it was created. {}", (Object)class072092);
        }
        return null;
    }

    public void method_8396(@Nullable class07049 class070492, class07209 class072092, class04891 class048912, class04911 class049112, float f, float f2) {
    }

    public <T extends class07049> List<T> method_18023(class01128<class07049, T> class011282, class00734 class007342, Predicate<? super T> predicate) {
        return Collections.emptyList();
    }

    public class05795 method_22336() {
        return this.u.method_22336();
    }

    public long method_39224() {
        return this.P.getAndIncrement();
    }

    public class05517 method_22385() {
        return this.E;
    }

    public boolean method_35237(class07209 class072092, Predicate<class04688> predicate) {
        return predicate.test(this.method_8316(class072092));
    }

    public int method_8594() {
        return 0;
    }

    public int method_31605() {
        return this.u.method_31605();
    }

    public class06069 method_8409() {
        return this.B;
    }

    public boolean method_16358(class07209 class072092, Predicate<class00500> predicate) {
        return predicate.test(this.method_8320(class072092));
    }
}

