/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00570
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class03155
 *  minecraft.class03238
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06386
 *  minecraft.class06391
 *  minecraft.class06414
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07269
 *  minecraft.class07279
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class03155;
import minecraft.class03238;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06386;
import minecraft.class06391;
import minecraft.class06414;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07269;
import minecraft.class07279;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00491
extends class07279 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 200;
    private static final int L = 40;
    private static final int u = 2400;
    private static final int i = 1;
    private static final int R = 10;
    private static final long M = 0L;
    private static final boolean B = false;
    private long Z = 0L;
    private int m;
    private @Nullable class07209 P;
    private boolean s = false;

    public boolean L() {
        return this.m > 0;
    }

    private static class06889 L(class04782 class047822, class07209 class072092) {
        class06889 class068892 = new class06889((double)class072092.method_10263(), 0.0, (double)class072092.method_10260()).u();
        int n = 1024;
        class06889 class068893 = class068892.L(1024.0);
        int n2 = 16;
        while (!class00491.N(class047822, class068893) && n2-- > 0) {
            N.debug("Skipping backwards past nonempty chunk at {}", (Object)class068893);
            class068893 = class068893.i(class068892.L(-16.0));
        }
        n2 = 16;
        while (class00491.N(class047822, class068893) && n2-- > 0) {
            N.debug("Skipping forward past empty chunk at {}", (Object)class068893);
            class068893 = class068893.i(class068892.L(16.0));
        }
        N.debug("Found chunk at {}", (Object)class068893);
        return class068893;
    }

    public static void L(class07299 class072992, class07209 class072092, class00500 class005002, class00491 class004912) {
        if (!class072992.method_8608()) {
            class004912.m = 40;
            class072992.method_8427(class072092, class005002.i(), 1, 0);
            class00491.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
        }
    }

    public class00491(class07209 class072092, class00500 class005002) {
        super(class00404.field_11906, class072092, class005002);
    }

    public class07269 i() {
        return class07269.N((class00394)((Object)this));
    }

    public float y(float f) {
        return 1.0f - class04995.N((float)(((float)this.m - f) / 40.0f), (float)0.0f, (float)1.0f);
    }

    public static void y(class07299 class072992, class07209 class072092, class00500 class005002, class00491 class004912) {
        boolean bl = class004912.N();
        boolean bl2 = class004912.L();
        ++class004912.Z;
        if (bl2) {
            --class004912.m;
        } else if (class004912.Z % 2400L == 0L) {
            class00491.L(class072992, class072092, class005002, class004912);
        }
        if (bl != class004912.N() || bl2 != class004912.L()) {
            class00491.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
        }
    }

    private static class07209 y(class04782 class047822, class07209 class072092) {
        class06889 class068892 = class00491.L(class047822, class072092);
        class07209 class072093 = class00491.N(class00491.N((class07299)class047822, class068892));
        if (class072093 == null) {
            class07209 class072094 = class07209.method_49637((double)(class068892.M + 0.5), (double)75.0, (double)(class068892.Z + 0.5));
            N.debug("Failed to find a suitable block to teleport to, spawning an island on {}", (Object)class072094);
            class047822.method_30349().method_46759(class04227.Nh).flatMap(class007512 -> class007512.N(class03155.R)).ifPresent(class035292 -> ((class03238)class035292.N()).N((class05974)class047822, class047822.method_14178().U(), class06069.y((long)class072094.method_10063()), class072094));
            class072093 = class072094;
        } else {
            N.debug("Found suitable block to teleport to: {}", (Object)class072093);
        }
        return class00491.N((class07290)class047822, class072093, 16, true);
    }

    private static void N(class04782 class047822, class07209 class072092, class06414 class064142) {
        class06391.K.N((class06386)class064142, (class05974)class047822, class047822.method_14178().U(), class06069.u(), class072092);
    }

    private static @Nullable class07209 N(class00570 class005702) {
        class07321 class073212 = class005702.R();
        class07209 class072092 = new class07209(class073212.i(), 30, class073212.R());
        int n = class005702.y() + 16 - 1;
        class07209 class072093 = new class07209(class073212.M(), n, class073212.B());
        class07209 class072094 = null;
        double d = 0.0;
        for (class07209 class072095 : class07209.method_10097((class07209)class072092, (class07209)class072093)) {
            class00500 class005002 = class005702.method_8320(class072095);
            class07209 class072096 = class072095.method_10084();
            class07209 class072097 = class072095.method_10086(2);
            if (!class005002.N(class00869.MP) || class005702.method_8320(class072096).W((class07290)class005702, class072096) || class005702.method_8320(class072097).W((class07290)class005702, class072097)) continue;
            double d2 = class072095.method_10268(0.0, 0.0, 0.0);
            if (class072094 != null && !(d2 < d)) continue;
            class072094 = class072095;
            d = d2;
        }
        return class072094;
    }

    private static class07209 N(class07290 class072902, class07209 class072092, int n, boolean bl) {
        class07209 class072093 = null;
        for (int i = -n; i <= n; ++i) {
            block1: for (int j = -n; j <= n; ++j) {
                if (i == 0 && j == 0 && !bl) continue;
                for (int k = class072902.method_31600(); k > (class072093 == null ? class072902.method_31607() : class072093.method_10264()); --k) {
                    class07209 class072094 = new class07209(class072092.method_10263() + i, k, class072092.method_10260() + j);
                    class00500 class005002 = class072902.method_8320(class072094);
                    if (!class005002.W(class072902, class072094) || !bl && class005002.N(class00869.q)) continue;
                    class072093 = class072094;
                    continue block1;
                }
            }
        }
        return class072093 == null ? class072092 : class072093;
    }

    private static class00570 N(class07299 class072992, class06889 class068892) {
        return class072992.method_8497(class04995.N((double)(class068892.M / 16.0)), class04995.N((double)(class068892.Z / 16.0)));
    }

    private static class07209 N(class07299 class072992, class07209 class072092) {
        class07209 class072093 = class00491.N((class07290)class072992, class072092.method_10069(0, 2, 0), 5, false);
        N.debug("Best exit position for portal at {} is {}", (Object)class072092, (Object)class072093);
        return class072093.method_10084();
    }

    public void N(class07209 class072092, boolean bl) {
        this.s = bl;
        this.P = class072092;
        this.method_5431();
    }

    public boolean N(class07211 class072112) {
        return class00891.N((class00500)this.w(), (class00500)this.z.method_8320(this.d().method_10093(class072112)), (class07211)class072112);
    }

    public boolean N(int n, int n2) {
        if (n == 1) {
            this.m = 40;
            return true;
        }
        return super.N(n, n2);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00491 class004912) {
        ++class004912.Z;
        if (class004912.L()) {
            --class004912.m;
        }
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    public float N(float f) {
        return class04995.N((float)(((float)this.Z + f) / 200.0f), (float)0.0f, (float)1.0f);
    }

    public boolean N() {
        return this.Z < 200L;
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("Age", this.Z);
        class083292.y("exit_portal", class07209.field_25064, (Object)this.P);
        if (this.s) {
            class083292.N("ExactTeleport", true);
        }
    }

    private static boolean N(class04782 class047822, class06889 class068892) {
        return class00491.N((class07299)class047822, class068892).N() == -1;
    }

    public @Nullable class06889 N(class04782 class047822, class07209 class072092) {
        class07209 class072093;
        if (this.P == null && class047822.method_27983() == class07299.field_25181) {
            class072093 = class00491.y(class047822, class072092);
            class072093 = class072093.method_10086(10);
            N.debug("Creating portal at {}", (Object)class072093);
            class00491.N(class047822, class072093, class06414.N((class07209)class072092, (boolean)false));
            this.N(class072093, this.s);
        }
        if (this.P != null) {
            class072093 = this.s ? this.P : class00491.N((class07299)class047822, this.P);
            return class072093.method_61082();
        }
        return null;
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.Z = class082992.N("Age", 0L);
        this.P = class082992.N("exit_portal", class07209.field_25064).filter(class07299::method_25953).orElse(null);
        this.s = class082992.N("ExactTeleport", false);
    }

    public int R() {
        int n = 0;
        for (class07211 class072112 : class07211.values()) {
            n += this.N(class072112) ? 1 : 0;
        }
        return n;
    }
}

