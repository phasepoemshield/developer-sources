/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00245
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01487
 *  minecraft.class01929
 *  minecraft.class03556
 *  minecraft.class04000
 *  minecraft.class04011
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05543
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07126
 *  minecraft.class07192
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07269
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08630
 *  org.apache.commons.lang3.mutable.Mutable
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00245;
import minecraft.class00303;
import minecraft.class00325;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01487;
import minecraft.class01929;
import minecraft.class03556;
import minecraft.class04000;
import minecraft.class04011;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05543;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07126;
import minecraft.class07192;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08630;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class00327
extends class00394 {
    private static final int y = 32;
    public static final int N = 32;
    private static final int L = 34;
    private static final int u = 16;
    private static final int i = 8;
    private static final int R = 5;
    private static final int M = 20;
    private static final int B = 5;
    private static final int Z = 100;
    private static final int m = 10;
    private static final int P = 10;
    private static final int s = 50;
    private static final int T = 2;
    private static final int b = 64;
    private static final int j = 30;
    private static final Optional<class00245> v = Optional.empty();
    private @Nullable Either<class00245, UUID> n;
    private long t;
    private int G;
    private int l;
    private @Nullable class06889 d;
    private int w;

    public int L() {
        return this.w;
    }

    private void M() {
        this.n = null;
        this.method_5431();
    }

    public class00327(class07209 class072092, class00500 class005002) {
        super(class00404.field_54774, class072092, class005002);
    }

    private Optional<class00245> B() {
        Object object;
        class00245 class002452;
        if (this.n == null) {
            return v;
        }
        if (this.n.left().isPresent()) {
            class002452 = (class00245)this.n.left().get();
            if (!class002452.method_31481()) {
                return Optional.of(class002452);
            }
            this.N(class002452.method_5667());
        }
        if ((object = this.z) instanceof class04782) {
            class002452 = (class04782)object;
            if (this.n.right().isPresent()) {
                object = (UUID)this.n.right().get();
                class07049 class070492 = class002452.method_66347((UUID)object);
                if (class070492 instanceof class00245) {
                    class00245 class002453 = (class00245)class070492;
                    this.N(class002453);
                    return Optional.of(class002453);
                }
                if (this.t >= 30L) {
                    this.M();
                }
                return v;
            }
        }
        return v;
    }

    public int u() {
        if (this.n == null || this.B().isEmpty()) {
            return 0;
        }
        double d = Math.clamp((double)this.R(), (double)0.0, (double)32.0) / 32.0;
        return 15 - (int)Math.floor(d * 15.0);
    }

    public void y() {
        class04782 class047822 = this.B().orElse(null);
        if (!(class047822 instanceof class00245)) {
            return;
        }
        class00245 class002452 = (class00245)class047822;
        class07299 class072992 = this.z;
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class047822 = (class04782)class072992;
        if (this.l > 0) {
            return;
        }
        this.N(class047822, 20, false);
        if (this.w().L(class00325.L) == class08630.field_55833) {
            int n = this.z.method_8409().N(2, 3);
            for (int i = 0; i < n; ++i) {
                this.N(class047822).ifPresent(class072092 -> {
                    this.z.method_8396(null, class072092, class04909.dz, class04911.field_15245, 1.0f, 1.0f);
                    this.z.N((class03556)class01194.Z, class072092, class01164.N((class00500)this.w()));
                });
            }
        }
        this.l = 100;
        this.d = class002452.method_5829().R();
    }

    public boolean y(class00245 class002452) {
        return this.B().map(class002453 -> class002453 == class002452).orElse(false);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        class082992.N("creaking", class01487.N).ifPresentOrElse(this::N, this::M);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        if (this.n != null) {
            class083292.N("creaking", class01487.N, (Object)((UUID)this.n.map(class07049::method_5667, uUID -> uUID)));
        }
    }

    public void N(@Nullable class07072 class070722) {
        Object var3_2 = this.B().orElse(null);
        if (var3_2 instanceof class00245) {
            class00245 class002452 = var3_2;
            if (class070722 == null) {
                class002452.Z();
            } else {
                class002452.y(class070722);
                class002452.E();
                class002452.method_6033(0.0f);
            }
            this.M();
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00327 class003272) {
        class00245 class002453;
        class06889 class068892;
        ++class003272.t;
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        int n = class003272.u();
        if (class003272.w != n) {
            class003272.w = n;
            class072992.method_8455(class072092, class00869.Lp);
        }
        if (class003272.l > 0) {
            if (class003272.l > 50) {
                class003272.N(class047822, 1, true);
                class003272.N(class047822, 1, false);
            }
            if (class003272.l % 10 == 0 && class003272.d != null) {
                class003272.B().ifPresent(class002452 -> {
                    class003272.d = class002452.method_5829().R();
                });
                class068892 = class06889.y((class00753)class072092);
                float f = 0.2f + 0.8f * (float)(100 - class003272.l) / 100.0f;
                class002453 = class068892.u(class003272.d).L((double)f).i(class003272.d);
                class07209 class072093 = class07209.method_49638((class00737)class002453);
                float f2 = (float)class003272.l / 2.0f / 100.0f + 0.5f;
                class047822.method_8396(null, class072093, class04909.BY, class04911.field_15245, f2, 1.0f);
            }
            --class003272.l;
        }
        if (class003272.G-- >= 0) {
            return;
        }
        class003272.G = class003272.z == null ? 20 : class003272.z.field_9229.y(5) + 20;
        class068892 = class00327.N(class072992, class005002, class072092, class003272);
        if (class068892 != class005002) {
            class072992.method_8652(class072092, (class00500)class068892, 3);
            if (class068892.L(class00325.L) == class08630.field_55831) {
                return;
            }
        }
        if (class003272.n != null) {
            Optional<class00245> var7 = class003272.B();
            if (var7.isPresent()) {
                class002453 = var7.get();
                if ((Boolean)class072992.method_75728().N(class00608.e, class072092) == false && !class002453.Nm() || class003272.R() > 34.0 || class002453.z()) {
                    class003272.N((class07072)null);
                }
            }
            return;
        }
        if (class068892.L(class00325.L) != class08630.field_55833) {
            return;
        }
        if (!class047822.method_74962()) {
            return;
        }
        class08036 class080362 = class072992.N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), 32.0, false);
        if (class080362 != null && (class002453 = class00327.N(class047822, class003272)) != null) {
            class003272.N(class002453);
            class002453.method_56078(class04909.Bt);
            class072992.method_8396(null, class003272.d(), class04909.BI, class04911.field_15245, 1.0f, 1.0f);
        }
    }

    private static /* synthetic */ class07192 N(class04782 class047822, Mutable mutable, class07209 class072092) {
        if (!class047822.method_8320(class072092).N(class01210.v)) {
            return class07192.field_55165;
        }
        for (class07211 class072112 : class07536.y((Object[])class07211.values(), (class06069)class047822.field_9229)) {
            class07209 class072093 = class072092.method_10093(class072112);
            class00500 class005002 = class047822.method_8320(class072093);
            class07211 class072113 = class072112.b();
            if (class005002.P()) {
                class005002 = class00869.Ra.W();
            } else if (class005002.N(class00869.K) && class005002.Y().u()) {
                class005002 = (class00500)class00869.Ra.W().y((class08092)class05543.L, (Comparable)Boolean.valueOf(true));
            }
            if (!class005002.N(class00869.Ra) || class05543.N((class00500)class005002, (class07211)class072113)) continue;
            class047822.method_8652(class072093, (class00500)class005002.y((class08092)class05543.y((class07211)class072113), (Comparable)Boolean.valueOf(true)), 3);
            mutable.setValue((Object)class072093);
            return class07192.field_55167;
        }
        return class07192.field_55165;
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    private static @Nullable class00245 N(class04782 class047822, class00327 class003272) {
        class07209 class072092 = class003272.d();
        Optional var3 = class04011.N((class07078)class07078.o, (class06113)class06113.field_16469, (class04782)class047822, (class07209)class072092, (int)5, (int)16, (int)8, (class04000)class04000.L, (boolean)true);
        if (var3.isEmpty()) {
            return null;
        }
        class00245 class002452 = (class00245)var3.get();
        class047822.N((class07049)class002452, (class03556)class01194.v, class002452.method_73189());
        class047822.method_8421((class07049)class002452, (byte)60);
        class002452.N(class072092);
        return class002452;
    }

    public void N(UUID uUID) {
        this.n = Either.right((Object)uUID);
        this.t = 0L;
        this.method_5431();
    }

    public void N(class00245 class002452) {
        this.n = Either.left((Object)class002452);
        this.method_5431();
    }

    private static class00500 N(class07299 class072992, class00500 class005002, class07209 class072092, class00327 class003272) {
        if (!class00325.N(class005002, (class05487)class072992, class072092) && class003272.n == null) {
            return (class00500)class005002.y(class00325.L, (Comparable)class08630.field_55831);
        }
        class08630 class086302 = (Boolean)class072992.method_75728().N(class00608.e, class072092) != false ? class08630.field_55833 : class08630.field_55832;
        return (class00500)class005002.y(class00325.L, (Comparable)class086302);
    }

    public void N(class07209 class072092, class00500 class005002) {
        this.N((class07072)null);
    }

    private void N(class04782 class047822, int n, boolean bl) {
        Object var5_4 = this.B().orElse(null);
        if (!(var5_4 instanceof class00245)) {
            return;
        }
        class00245 class002452 = var5_4;
        int n2 = bl ? 16545810 : 0x5F5F5F;
        class06069 class060692 = class047822.field_9229;
        for (double d = 0.0; d < (double)n; d += 1.0) {
            Object object;
            class00734 class007342 = class002452.method_5829();
            class06889 class068892 = class007342.B().y(class060692.U() * class007342.y(), class060692.U() * class007342.L(), class060692.U() * class007342.u());
            class06889 class068893 = class06889.N((class00753)this.d()).y(class060692.U(), class060692.U(), class060692.U());
            if (bl) {
                object = class068892;
                class068892 = class068893;
                class068893 = object;
            }
            object = new class00303(class068893, n2, class060692.y(40) + 10);
            class047822.method_14199((class07126)object, true, true, class068892.M, class068892.B, class068892.Z, 1, 0.0, 0.0, 0.0, 0.0);
        }
    }

    private Optional<class07209> N(class04782 class047822) {
        MutableObject mutableObject = new MutableObject(null);
        class07209.method_49925((class07209)this.U, (int)2, (int)64, (class072092, consumer) -> {
            for (class07211 class072112 : class07536.y((Object[])class07211.values(), (class06069)class047822.field_9229)) {
                class07209 class072093 = class072092.method_10093(class072112);
                if (!class047822.method_8320(class072093).N(class01210.v)) continue;
                consumer.accept(class072093);
            }
        }, arg_0 -> class00327.N(class047822, (Mutable)mutableObject, arg_0));
        return Optional.ofNullable((class07209)mutableObject.get());
    }

    private double R() {
        return this.B().map(class002452 -> Math.sqrt(class002452.method_5707(class06889.L((class00753)this.d())))).orElse(0.0);
    }
}

