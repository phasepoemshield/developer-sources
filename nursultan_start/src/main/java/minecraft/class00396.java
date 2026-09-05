/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07269
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class07542
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class07542;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public class class00396
extends class00394 {
    private static final int y = 2;
    private static final int L = 13;
    private static final float u = -0.0375f;
    private static final int i = 16;
    private static final int R = 42;
    private static final int M = 8;
    private static final class00891[] B = new class00891[]{class00869.ZF, class00869.ZA, class00869.zN, class00869.Zf};
    public int N;
    private float Z;
    private boolean m;
    private boolean P;
    private final List<class07209> s = Lists.newArrayList();
    private @Nullable class08372<class07438> T;
    private long b;

    public boolean L() {
        return this.m;
    }

    public class00396(class07209 class072092, class00500 class005002) {
        super(class00404.field_11902, class072092, class005002);
    }

    public boolean u() {
        return this.P;
    }

    private static void y(class07299 class072992, class07209 class072092, List<class07209> list) {
        int n;
        int n2;
        int n3 = list.size() / 7 * 16;
        int n4 = class072092.method_10263();
        class00734 class007342 = new class00734((double)n4, (double)(n2 = class072092.method_10264()), (double)(n = class072092.method_10260()), (double)(n4 + 1), (double)(n2 + 1), (double)(n + 1)).M((double)n3).y(0.0, (double)class072992.method_31605(), 0.0);
        List var9 = class072992.N(class08036.class, class007342);
        if (var9.isEmpty()) {
            return;
        }
        for (class08036 class080362 : var9) {
            if (!class072092.method_19771((class00753)class080362.method_24515(), (double)n3) || !class080362.method_5721()) continue;
            class080362.method_6092(new class07055(class07047.Q, 260, 0, true, true));
        }
    }

    public static void y(class07299 class072992, class07209 class072092, class00500 class005002, class00396 class003962) {
        ++class003962.N;
        long l = class072992.N();
        List<class07209> var6 = class003962.s;
        if (l % 40L == 0L) {
            boolean bl = class00396.N(class072992, class072092, var6);
            if (bl != class003962.m) {
                class04891 class048912 = bl ? class04909.RD : class04909.My;
                class072992.method_8396(null, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
            }
            class003962.m = bl;
            class00396.N(class003962, var6);
            if (bl) {
                class00396.y(class072992, class072092, var6);
                class00396.N((class04782)class072992, class072092, class005002, class003962, var6.size() >= 42);
            }
        }
        if (class003962.L()) {
            if (l % 80L == 0L) {
                class072992.method_8396(null, class072092, class04909.Rh, class04911.field_15245, 1.0f, 1.0f);
            }
            if (l > class003962.b) {
                class003962.b = l + 60L + (long)class072992.method_8409().y(40);
                class072992.method_8396(null, class072092, class04909.Rr, class04911.field_15245, 1.0f, 1.0f);
            }
        }
    }

    private static class00734 N(class07209 class072092) {
        return new class00734(class072092).M(8.0);
    }

    private static void N(class07299 class072992, class07209 class072092, List<class07209> list, @Nullable class07049 class070492, int n) {
        float f;
        class06069 class060692 = class072992.field_9229;
        double d = class04995.m((double)((float)(n + 35) * 0.1f)) / 2.0f + 0.5f;
        d = (d * d + d) * (double)0.3f;
        class06889 class068892 = new class06889((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 1.5 + d, (double)class072092.method_10260() + 0.5);
        for (class07209 class072093 : list) {
            if (class060692.y(50) != 0) continue;
            class07209 class072094 = class072093.method_10059((class00753)class072092);
            f = -0.5f + class060692.z() + (float)class072094.method_10263();
            float f2 = -2.0f + class060692.z() + (float)class072094.method_10264();
            float f3 = -0.5f + class060692.z() + (float)class072094.method_10260();
            class072992.method_8406((class07126)class07107.Nt, class068892.M, class068892.B, class068892.Z, (double)f, (double)f2, (double)f3);
        }
        if (class070492 != null) {
            class06889 class068893 = new class06889(class070492.method_23317(), class070492.method_23320(), class070492.method_23321());
            float f4 = (-0.5f + class060692.z()) * (3.0f + class070492.method_17681());
            float f5 = -1.0f + class060692.z() * class070492.method_17682();
            f = (-0.5f + class060692.z()) * (3.0f + class070492.method_17681());
            class06889 class068894 = new class06889((double)f4, (double)f5, (double)f);
            class072992.method_8406((class07126)class07107.Nt, class068893.M, class068893.B, class068893.Z, class068894.M, class068894.B, class068894.Z);
        }
    }

    @Override
    protected void N(class08299 class082992) {
        super.N(class082992);
        this.T = class08372.N((class08299)class082992, (String)"Target");
    }

    private static @Nullable class08372<class07438> N(@Nullable class08372<class07438> class083722, class04782 class047822, class07209 class072092, boolean bl) {
        if (!bl) {
            return null;
        }
        if (class083722 == null) {
            return class00396.N(class047822, class072092);
        }
        class07438 class074382 = class08372.y(class083722, (class07299)class047822);
        if (class074382 == null || !class074382.method_5805() || !class072092.method_19771((class00753)class074382.method_24515(), 8.0)) {
            return null;
        }
        return class083722;
    }

    public float N(float f) {
        return (this.Z + f) * -0.0375f;
    }

    private void N(boolean bl) {
        this.P = bl;
    }

    private static void N(class00396 class003962, List<class07209> list) {
        class003962.N(list.size() >= 42);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00396 class003962) {
        ++class003962.N;
        long l = class072992.N();
        List<class07209> var6 = class003962.s;
        if (l % 40L == 0L) {
            class003962.m = class00396.N(class072992, class072092, var6);
            class00396.N(class003962, var6);
        }
        class07438 class074382 = class08372.y(class003962.T, (class07299)class072992);
        class00396.N(class072992, class072092, var6, (class07049)class074382, class003962.N);
        if (class003962.L()) {
            class003962.Z += 1.0f;
        }
    }

    @Override
    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    private static @Nullable class08372<class07438> N(class04782 class047822, class07209 class072092) {
        List var2 = class047822.N(class07438.class, class00396.N(class072092), (T class074382) -> class074382 instanceof class07542 && class074382.method_5721());
        if (var2.isEmpty()) {
            return null;
        }
        return class08372.N((class08636)((class07438)class07536.N_77((List)var2, (class06069)class047822.field_9229)));
    }

    @Override
    protected void N(class08329 class083292) {
        super.N(class083292);
        class08372.N(this.T, (class08329)class083292, (String)"Target");
    }

    private static void N(class04782 class047822, class07209 class072092, class00500 class005002, class00396 class003962, boolean bl) {
        class08372<class07438> var5 = class00396.N(class003962.T, class047822, class072092, bl);
        class07438 class074382 = class08372.y(var5, (class07299)class047822);
        if (class074382 != null) {
            class047822.method_43128(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), class04909.MN, class04911.field_15245, 1.0f, 1.0f);
            class074382.method_64397(class047822, class047822.method_48963().T(), 4.0f);
        }
        if (!Objects.equals(var5, class003962.T)) {
            class003962.T = var5;
            class047822.method_8413(class072092, class005002, class005002, 2);
        }
    }

    private static boolean N(class07299 class072992, class07209 class072092, List<class07209> list) {
        int n;
        int n2;
        int n3;
        list.clear();
        for (n3 = -1; n3 <= 1; ++n3) {
            for (n2 = -1; n2 <= 1; ++n2) {
                for (n = -1; n <= 1; ++n) {
                    class07209 class072093 = class072092.method_10069(n3, n2, n);
                    if (class072992.z(class072093)) continue;
                    return false;
                }
            }
        }
        for (n3 = -2; n3 <= 2; ++n3) {
            for (n2 = -2; n2 <= 2; ++n2) {
                for (n = -2; n <= 2; ++n) {
                    int n4 = Math.abs(n3);
                    int n5 = Math.abs(n2);
                    int n6 = Math.abs(n);
                    if (n4 <= 1 && n5 <= 1 && n6 <= 1 || (n3 != 0 || n5 != 2 && n6 != 2) && (n2 != 0 || n4 != 2 && n6 != 2) && (n != 0 || n4 != 2 && n5 != 2)) continue;
                    class07209 class072094 = class072092.method_10069(n3, n2, n);
                    class00500 class005002 = class072992.method_8320(class072094);
                    for (class00891 class008912 : B) {
                        if (!class005002.N(class008912)) continue;
                        list.add(class072094);
                    }
                }
            }
        }
        return list.size() >= 16;
    }
}

