/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class03519
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class06925
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07269
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07713
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Objects;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class01979;
import minecraft.class03519;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06925;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07713;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01965
extends class00394 {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = "LootTable";
    private static final String L = "LootTableSeed";
    private static final String u = "hit_direction";
    private static final String i = "item";
    private static final int R = 10;
    private static final int M = 40;
    private static final int B = 10;
    private int Z;
    private long m;
    private long P;
    private class06584 s = class06584.E;
    private @Nullable class07211 T;
    private @Nullable class05946<class05074> b;
    private long j;

    private void L(class04782 class047822, class07438 class074382, class06584 class065842) {
        this.N(class047822, class074382, class065842);
        if (!this.s.R()) {
            double d = class07078.Nt.z();
            double d2 = 1.0 - d;
            double d3 = d / 2.0;
            class07211 class072112 = Objects.requireNonNullElse(this.T, class07211.field_11036);
            class07209 class072092 = this.U.method_10079(class072112, 1);
            double d4 = (double)class072092.method_10263() + 0.5 * d2 + d3;
            double d5 = (double)class072092.method_10264() + 0.5 + (double)(class07078.Nt.U() / 2.0f);
            double d6 = (double)class072092.method_10260() + 0.5 * d2 + d3;
            class00717 class007172 = new class00717((class07299)class047822, d4, d5, d6, this.s.N(class047822.field_9229.y(21) + 10));
            class007172.method_18799(class06889.L);
            class047822.method_8649((class07049)class007172);
            this.s = class06584.E;
        }
    }

    public @Nullable class07211 L() {
        return this.T;
    }

    public class01965(class07209 class072092, class00500 class005002) {
        super(class00404.field_42780, class072092, class005002);
    }

    private boolean B(class08329 class083292) {
        if (this.b == null) {
            return false;
        }
        class083292.N(y, class05074.N, this.b);
        if (this.j != 0L) {
            class083292.N(L, this.j);
        }
        return true;
    }

    private boolean u(class08299 class082992) {
        this.b = class082992.N(y, class05074.N).orElse(null);
        this.j = class082992.N(L, 0L);
        return this.b != null;
    }

    public class06584 u() {
        return this.s;
    }

    private void y(class04782 class047822, class07438 class074382, class06584 class065842) {
        this.L(class047822, class074382, class065842);
        class00500 class005002 = this.w();
        class047822.N(3008, this.d(), class00891.W((class00500)class005002));
        class00891 class008912 = this.w().i();
        class00891 class008913 = class008912 instanceof class01979 ? ((class01979)class008912).y() : class00869.N;
        class047822.method_8652(this.U, class008913.W(), 3);
    }

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    public boolean N(long l, class04782 class047822, class07438 class074382, class07211 class072112, class06584 class065842) {
        if (this.T == null) {
            this.T = class072112;
        }
        this.m = l + 40L;
        if (l < this.P) {
            return false;
        }
        this.P = l + 10L;
        this.N(class047822, class074382, class065842);
        int n = this.R();
        if (++this.Z >= 10) {
            this.y(class047822, class074382, class065842);
            return true;
        }
        class047822.N(this.d(), this.w().i(), 2);
        int n2 = this.R();
        if (n != n2) {
            class00500 class005002 = (class00500)this.w().y((class08092)class06665.yk, (Comparable)Integer.valueOf(n2));
            class047822.method_8652(this.d(), class005002, 3);
        }
        return false;
    }

    public void N(class05946<class05074> class059462, long l) {
        this.b = class059462;
        this.j = l;
    }

    public void N(class04782 class047822) {
        if (this.Z != 0 && class047822.N() >= this.m) {
            int n = this.R();
            this.Z = Math.max(0, this.Z - 2);
            int n2 = this.R();
            if (n != n2) {
                class047822.method_8652(this.d(), (class00500)this.w().y((class08092)class06665.yk, (Comparable)Integer.valueOf(n2)), 3);
            }
            int n3 = 4;
            this.m = class047822.N() + 4L;
        }
        if (this.Z == 0) {
            this.T = null;
            this.m = 0L;
            this.P = 0L;
        } else {
            class047822.N(this.d(), this.w().i(), 2);
        }
    }

    public class07001 N(class01929 class019292) {
        class07001 class070012 = super.N(class019292);
        class070012.y(u, class07211.field_57037, (Object)this.T);
        if (!this.s.R()) {
            class03519 class035192 = class019292.N((DynamicOps)class07713.N);
            class070012.N(i, class06584.y, (DynamicOps)class035192, (Object)this.s);
        }
        return class070012;
    }

    private void N(class04782 class047822, class07438 class074382, class06584 class065842) {
        class04770 class047702;
        if (this.b == null) {
            return;
        }
        class05074 class050742 = class047822.method_8503().yd().N(this.b);
        if (class074382 instanceof class04770) {
            class047702 = (class04770)class074382;
            class06912.F.N(class047702, this.b);
        }
        class047702 = new class04160(class047822).N(class06551.B, (Object)class06889.y((class00753)this.U)).N(class074382.method_7292()).N(class06551.N, (Object)class074382).N(class06551.U, (Object)class065842).N(class06925.z);
        ObjectArrayList var6 = class050742.N((class04162)class047702, this.j);
        this.s = switch (var6.size()) {
            case 0 -> class06584.E;
            case 1 -> (class06584)var6.getFirst();
            default -> {
                N.warn("Expected max 1 loot from loot table {}, but got {}", (Object)this.b.N(), (Object)var6.size());
                yield (class06584)var6.getFirst();
            }
        };
        this.b = null;
        this.method_5431();
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.s = !this.u(class082992) ? class082992.N(i, class06584.y).orElse(class06584.E) : class06584.E;
        this.T = class082992.N(u, class07211.field_57037).orElse(null);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.B(class083292) && !this.s.R()) {
            class083292.N(i, class06584.y, (Object)this.s);
        }
    }

    private int R() {
        if (this.Z == 0) {
            return 0;
        }
        if (this.Z < 3) {
            return 1;
        }
        if (this.Z < 6) {
            return 2;
        }
        return 3;
    }
}

