/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00778
 *  minecraft.class00808
 *  minecraft.class01001
 *  minecraft.class01128
 *  minecraft.class01194
 *  minecraft.class01929
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04540
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06837
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07448
 *  minecraft.class08299
 *  minecraft.class08308
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Optional;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00778;
import minecraft.class00808;
import minecraft.class01001;
import minecraft.class01128;
import minecraft.class01194;
import minecraft.class01929;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04540;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06837;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07448;
import minecraft.class08299;
import minecraft.class08308;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class07308 {
    private static final Logger N = LogUtils.getLogger();
    public static final String y = "SpawnData";
    private static final int L = 1;
    private static final int u = 20;
    private static final int i = 200;
    private static final int R = 800;
    private static final int M = 4;
    private static final int B = 6;
    private static final int Z = 16;
    private static final int z = 4;
    private int U = 20;
    private class04540<class00808> E = class04540.N();
    private @Nullable class00808 W;
    private double m;
    private double P;
    private int s = 200;
    private int T = 800;
    private int b = 4;
    private @Nullable class07049 j;
    private int v = 6;
    private int n = 16;
    private int t = 4;

    private boolean L(class07299 class072992, class07209 class072092) {
        return class072992.N((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, this.n);
    }

    private void u(class07299 class072992, class07209 class072092) {
        class06069 class060692 = class072992.field_9229;
        this.U = this.T <= this.s ? this.s : this.s + class060692.y(this.T - this.s);
        this.E.N(class060692).ifPresent(class008082 -> this.N(class072992, class072092, (class00808)class008082));
        this.N(class072992, class072092, 1);
    }

    public @Nullable class07049 y(class07299 class072992, class07209 class072092) {
        if (this.j == null) {
            class07001 class070012 = this.N(class072992, class072992.method_8409(), class072092).N();
            if (class070012.Z("id").isEmpty()) {
                return null;
            }
            this.j = class07078.N((class07001)class070012, (class07299)class072992, (class06113)class06113.field_16469, (class06837)class06837.N);
            if (class070012.Z() != 1 || this.j instanceof class07079) {
                // empty if block
            }
        }
        return this.j;
    }

    public double y() {
        return this.P;
    }

    public void N(class07299 class072992, class07209 class072092) {
        if (!this.L(class072992, class072092)) {
            this.P = this.m;
        } else if (this.j != null) {
            class06069 class060692 = class072992.method_8409();
            double d = (double)class072092.method_10263() + class060692.U();
            double d2 = (double)class072092.method_10264() + class060692.U();
            double d3 = (double)class072092.method_10260() + class060692.U();
            class072992.method_8406((class07126)class07107.NZ, d, d2, d3, 0.0, 0.0, 0.0);
            class072992.method_8406((class07126)class07107.J, d, d2, d3, 0.0, 0.0, 0.0);
            if (this.U > 0) {
                --this.U;
            }
            this.P = this.m;
            this.m = (this.m + (double)(1000.0f / ((float)this.U + 200.0f))) % 360.0;
        }
    }

    protected void N(@Nullable class07299 class072992, class07209 class072092, class00808 class008082) {
        this.W = class008082;
    }

    public void N(class07078<?> class070782, @Nullable class07299 class072992, class06069 class060692, class07209 class072092) {
        this.N(class072992, class060692, class072092).N().N_67("id", class04206.M.y(class070782).toString());
    }

    public void N(class04782 class047822, class07209 class072092) {
        if (!this.L((class07299)class047822, class072092) || !class047822.method_75001()) {
            return;
        }
        if (this.U == -1) {
            this.u((class07299)class047822, class072092);
        }
        if (this.U > 0) {
            --this.U;
            return;
        }
        boolean bl = false;
        class06069 class060692 = class047822.method_8409();
        class00808 class008082 = this.N((class07299)class047822, class060692, class072092);
        for (int i = 0; i < this.b; ++i) {
            try (class04495 class044952 = new class04495(this::toString, N);){
                class00778 class007782;
                class08299 class082992 = class08308.N((class04490)class044952, (class01929)class047822.method_30349(), (class07001)class008082.N());
                Optional var9 = class07078.N((class08299)class082992);
                if (var9.isEmpty()) {
                    this.u((class07299)class047822, class072092);
                    return;
                }
                class06889 class068892 = class082992.N("Pos", class06889.N).orElseGet(() -> new class06889((double)class072092.method_10263() + (class060692.U() - class060692.U()) * (double)this.t + 0.5, (double)(class072092.method_10264() + class060692.y(3) - 1), (double)class072092.method_10260() + (class060692.U() - class060692.U()) * (double)this.t + 0.5));
                if (!class047822.y(((class07078)var9.get()).N(class068892.M, class068892.B, class068892.Z))) continue;
                class07209 class072093 = class07209.method_49638((class00737)class068892);
                if (class008082.y().isPresent()) {
                    if (!((class07078)var9.get()).i().L() && class047822.y() == class07086.field_5801 || !(class007782 = (class00778)class008082.y().get()).N(class072093, class047822)) continue;
                } else if (!class07448.N((class07078)((class07078)var9.get()), (class01001)class047822, (class06113)class06113.field_16469, (class07209)class072093, (class06069)class047822.method_8409())) continue;
                class007782 = class07078.N((class08299)class082992, (class07299)class047822, (class06113)class06113.field_16469, class070492 -> {
                    class070492.method_5808(class068892.M, class068892.B, class068892.Z, class070492.method_36454(), class070492.method_36455());
                    return class070492;
                });
                if (class007782 == null) {
                    this.u((class07299)class047822, class072092);
                    return;
                }
                if (class047822.method_18023(class01128.y(class007782.getClass()), new class00734((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), (double)(class072092.method_10263() + 1), (double)(class072092.method_10264() + 1), (double)(class072092.method_10260() + 1)).M((double)this.t), class07042.R).size() >= this.v) {
                    this.u((class07299)class047822, class072092);
                    return;
                }
                class007782.method_5808(class007782.method_23317(), class007782.method_23318(), class007782.method_23321(), class060692.z() * 360.0f, 0.0f);
                if (class007782 instanceof class07079) {
                    class07079 class070792 = (class07079)class007782;
                    if (class008082.y().isEmpty() && !class070792.N((class07284)class047822, class06113.field_16469) || !class070792.N((class05487)class047822)) continue;
                    if (class008082.N().Z() == 1 && class008082.N().Z("id").isPresent()) {
                        ((class07079)class007782).N((class01001)class047822, class047822.method_8404(class007782.method_24515()), class06113.field_16469, null);
                    }
                    class008082.L().ifPresent(arg_0 -> ((class07079)class070792).N(arg_0));
                }
                if (!class047822.method_30736((class07049)class007782)) {
                    this.u((class07299)class047822, class072092);
                    return;
                }
                class047822.N(2004, class072092, 0);
                class047822.N((class07049)class007782, (class03556)class01194.v, class072093);
                if (class007782 instanceof class07079) {
                    ((class07079)class007782).h();
                }
                bl = true;
                continue;
            }
        }
        if (bl) {
            this.u((class07299)class047822, class072092);
        }
    }

    public boolean N(class07299 class072992, int n) {
        if (n == 1) {
            if (class072992.method_8608()) {
                this.U = this.s;
            }
            return true;
        }
        return false;
    }

    public void N(class08329 class083292) {
        class083292.N("Delay", (short)this.U);
        class083292.N("MinSpawnDelay", (short)this.s);
        class083292.N("MaxSpawnDelay", (short)this.T);
        class083292.N("SpawnCount", (short)this.b);
        class083292.N("MaxNearbyEntities", (short)this.v);
        class083292.N("RequiredPlayerRange", (short)this.n);
        class083292.N("SpawnRange", (short)this.t);
        class083292.y(y, class00808.y, (Object)this.W);
        class083292.N("SpawnPotentials", class00808.L, this.E);
    }

    public void N(@Nullable class07299 class072992, class07209 class072092, class08299 class082992) {
        this.U = class082992.N("Delay", (short)20);
        class082992.N(y, class00808.y).ifPresent(class008082 -> this.N(class072992, class072092, (class00808)class008082));
        this.E = class082992.N("SpawnPotentials", class00808.L).orElseGet(() -> class04540.N((Object)(this.W != null ? this.W : new class00808())));
        this.s = class082992.N("MinSpawnDelay", 200);
        this.T = class082992.N("MaxSpawnDelay", 800);
        this.b = class082992.N("SpawnCount", 4);
        this.v = class082992.N("MaxNearbyEntities", 6);
        this.n = class082992.N("RequiredPlayerRange", 16);
        this.t = class082992.N("SpawnRange", 4);
        this.j = null;
    }

    private class00808 N(@Nullable class07299 class072992, class06069 class060692, class07209 class072092) {
        if (this.W != null) {
            return this.W;
        }
        this.N(class072992, class072092, this.E.N(class060692).orElseGet(class00808::new));
        return this.W;
    }

    public abstract void N(class07299 var1, class07209 var2, int var3);

    public double N() {
        return this.m;
    }
}

