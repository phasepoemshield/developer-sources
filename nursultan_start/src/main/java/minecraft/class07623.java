/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00143
 *  minecraft.class00429
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00783
 *  minecraft.class01210
 *  minecraft.class01763
 *  minecraft.class02119
 *  minecraft.class04425
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06889
 *  minecraft.class06954
 *  minecraft.class07049
 *  minecraft.class07068
 *  minecraft.class07079
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07955
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.entity.NavigatingEntity
 *  net.caffeinemc.mods.lithium.common.world.ServerWorldExtended
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00143;
import minecraft.class00429;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00783;
import minecraft.class01210;
import minecraft.class01763;
import minecraft.class02119;
import minecraft.class04425;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06889;
import minecraft.class06954;
import minecraft.class07049;
import minecraft.class07068;
import minecraft.class07079;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07955;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07623 {
    private static final int N = 20;
    private static final int T = 100;
    private static final float b = 0.25f;
    protected final class07079 y;
    protected final class07299 L;
    protected @Nullable class00143 u;
    protected double i;
    protected int R;
    protected int M;
    protected class06889 B = class06889.L;
    protected class00753 Z = class00753.field_11176;
    protected long z;
    protected long U;
    protected double E;
    protected float W = 0.5f;
    protected boolean m;
    protected long P;
    protected class02119 s;
    private @Nullable class07209 j;
    private int v;
    private float n = 1.0f;
    private final class07068 t;
    private boolean G;
    private float l = 16.0f;

    protected abstract class06889 L();

    private boolean L(class06889 class068892) {
        boolean bl;
        if (this.u.R() + 1 >= this.u.i()) {
            return false;
        }
        class06889 class068893 = class06889.L((class00753)this.u.M());
        if (!class068892.N((class00737)class068893, 2.0)) {
            return false;
        }
        if (this.N(class068892, this.u.N((class07049)this.y))) {
            return true;
        }
        class06889 class068894 = class06889.L((class00753)this.u.u(this.u.R() + 1));
        class06889 class068895 = class068893.u(class068892);
        class06889 class068896 = class068894.u(class068892);
        double d = class068895.B();
        boolean bl2 = class068896.B() < d;
        boolean bl3 = bl = d < 0.5;
        if (bl2 || bl) {
            class06889 class068897 = class068895.u();
            return class068896.u().y(class068897) < 0.0;
        }
        return false;
    }

    public @Nullable class07209 M() {
        return this.j;
    }

    public class02119 P() {
        return this.s;
    }

    public float T() {
        return this.W;
    }

    public class07623(class07079 class070792, class07299 class072992) {
        this.y = class070792;
        this.L = class072992;
        this.t = this.N(class04995.N((double)(class070792.method_45326(class05298.P) * 16.0)));
        if (class072992 instanceof class04782) {
            class06954 class069542 = ((class04782)class072992).method_8503().yV();
            this.t.N(() -> class069542.N(class00429.R));
        }
    }

    public void B() {
        if (this.L.N() - this.P > 20L) {
            if (this.j != null) {
                this.u = null;
                this.u = this.N(this.j, this.v);
                this.N((CallbackInfo)null);
                this.P = this.L.N();
                this.m = false;
            }
        } else {
            this.m = true;
        }
    }

    public @Nullable class00143 Z() {
        return this.u;
    }

    public void i() {
        int n = class04995.y((float)(this.j() * 16.0f));
        this.t.N(n);
    }

    public boolean b() {
        return this.G;
    }

    public boolean s() {
        return this.s.R();
    }

    private void n() {
        this.Z = class00753.field_11176;
        this.z = 0L;
        this.E = 0.0;
        this.G = false;
    }

    protected void m() {
        if (this.u == null) {
            return;
        }
        for (int i = 0; i < this.u.i(); ++i) {
            class01763 class017632;
            class01763 class017633 = this.u.N(i);
            class01763 class017634 = class017632 = i + 1 < this.u.i() ? this.u.N(i + 1) : null;
            if (!this.L.method_8320(new class07209(class017633.N, class017633.y, class017633.L)).N(class01210.yd)) continue;
            this.u.N(i, class017633.N(class017633.N, class017633.y + 1, class017633.L));
            if (class017632 == null || class017633.y < class017632.y) continue;
            this.u.N(i + 1, class017633.N(class017632.N, class017633.y + 1, class017632.L));
        }
    }

    private void v() {
        this.n();
        this.W();
    }

    private float j() {
        return Math.max((float)this.y.method_45325(class05298.P), this.l);
    }

    public boolean U() {
        return this.u == null || this.u.L();
    }

    protected void z() {
        class06889 class068892 = this.L();
        this.W = this.y.method_17681() > 0.75f ? this.y.method_17681() / 2.0f : 0.75f - this.y.method_17681() / 2.0f;
        class07209 class072092 = this.u.M();
        double d = Math.abs(this.y.method_23317() - ((double)class072092.method_10263() + 0.5));
        double d2 = Math.abs(this.y.method_23318() - (double)class072092.method_10264());
        double d3 = Math.abs(this.y.method_23321() - ((double)class072092.method_10260() + 0.5));
        if (d < (double)this.W && d3 < (double)this.W && d2 < 1.0 || this.N(this.u.B().E) && this.L(class068892)) {
            this.u.N();
        }
        this.y(class068892);
    }

    public abstract boolean u();

    protected void y(class06889 class068892) {
        if (this.R - this.M > 100) {
            float f = this.y.method_6029() >= 1.0f ? this.y.method_6029() : this.y.method_6029() * this.y.method_6029();
            float f2 = f * 100.0f * 0.25f;
            if (class068892.M(this.B) < (double)(f2 * f2)) {
                this.G = true;
                this.W();
            } else {
                this.G = false;
            }
            this.M = this.R;
            this.B = class068892;
        }
        if (this.u != null && !this.u.L()) {
            class07209 class072092 = this.u.M();
            long l = this.L.N();
            if (class072092.equals((Object)this.Z)) {
                this.z += l - this.U;
            } else {
                this.Z = class072092;
                double d = class068892.R(class06889.L((class00753)this.Z));
                double d2 = this.E = this.y.method_6029() > 0.0f ? d / (double)this.y.method_6029() * 20.0 : 0.0;
            }
            if (this.E > 0.0 && (double)this.z > this.E * 3.0) {
                this.v();
            }
            this.U = l;
        }
    }

    private void y(CallbackInfo callbackInfo) {
        if (((NavigatingEntity)this.y).lithium$isRegisteredToWorld()) {
            ((ServerWorldExtended)this.L).lithium$setNavigationInactive(this.y);
        }
    }

    public boolean y(class07209 class072092) {
        if (this.m) {
            return false;
        }
        if (this.u == null || this.u.L() || this.u.i() == 0) {
            return false;
        }
        class01763 class017632 = this.u.u();
        class06889 class068892 = new class06889(((double)class017632.N + this.y.method_23317()) / 2.0, ((double)class017632.y + this.y.method_23318()) / 2.0, ((double)class017632.L + this.y.method_23321()) / 2.0);
        return class072092.method_19769((class00737)class068892, (double)(this.u.i() - this.u.R()));
    }

    protected abstract boolean y();

    public void y(float f) {
        this.n = f;
    }

    public void y(boolean bl) {
        this.s.y(bl);
    }

    public boolean E() {
        return !this.U();
    }

    public void N(boolean bl) {
        this.s.L(bl);
    }

    public @Nullable class00143 N(class07209 class072092, int n, int n2) {
        return this.N((Set<class07209>)ImmutableSet.of((Object)class072092), 8, false, n, n2);
    }

    public @Nullable class00143 N(class07209 class072092, int n) {
        return this.N((Set<class07209>)ImmutableSet.of((Object)class072092), 8, false, n);
    }

    public @Nullable class00143 N(Set<class07209> set, int n) {
        return this.N(set, 8, false, n);
    }

    public void N(float f) {
        this.l = f;
        this.i();
    }

    public boolean N(class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        return this.L.method_8320(class072093).t();
    }

    protected static boolean N(class07079 class070792, class06889 class068892, class06889 class068893, boolean bl) {
        class06889 class068894 = new class06889(class068893.M, class068893.B + (double)class070792.method_17682() * 0.5, class068893.Z);
        return class070792.method_73183().N(new class05862(class068892, class068894, class05849.field_17558, bl ? class05835.field_1347 : class05835.field_1348, (class07049)class070792)).N() == class07113.field_1333;
    }

    public void N(double d) {
        this.i = d;
    }

    private void N(CallbackInfo callbackInfo) {
        if (((NavigatingEntity)this.y).lithium$isRegisteredToWorld()) {
            if (this.u == null) {
                ((ServerWorldExtended)this.L).lithium$setNavigationInactive(this.y);
            } else {
                ((ServerWorldExtended)this.L).lithium$setNavigationActive(this.y);
            }
        }
    }

    private void N(class00143 class001432, double d, CallbackInfoReturnable callbackInfoReturnable) {
        if (((NavigatingEntity)this.y).lithium$isRegisteredToWorld()) {
            if (this.u == null) {
                ((ServerWorldExtended)this.L).lithium$setNavigationInactive(this.y);
            } else {
                ((ServerWorldExtended)this.L).lithium$setNavigationActive(this.y);
            }
        }
    }

    public final @Nullable class00143 N(double d, double d2, double d3, int n) {
        return this.N(class07209.method_49637((double)d, (double)d2, (double)d3), n);
    }

    public @Nullable class00143 N(Stream<class07209> stream, int n) {
        return this.N(stream.collect(Collectors.toSet()), 8, false, n);
    }

    protected abstract class07068 N(int var1);

    public boolean N(double d, double d2, double d3, double d4) {
        return this.N(this.N(d, d2, d3, 1), d4);
    }

    public boolean N(double d, double d2, double d3, int n, double d4) {
        return this.N(this.N(d, d2, d3, n), d4);
    }

    public boolean N(class07049 class070492, double d) {
        class00143 class001432 = this.N(class070492, 1);
        return class001432 != null && this.N(class001432, d);
    }

    public boolean N(@Nullable class00143 class001432, double d) {
        if (class001432 == null) {
            this.u = null;
            this.N(class001432, d, null);
            return false;
        }
        if (!class001432.N(this.u)) {
            this.u = class001432;
        }
        if (this.U()) {
            this.N(class001432, d, null);
            return false;
        }
        this.m();
        if (this.u.i() <= 0) {
            this.N(class001432, d, null);
            return false;
        }
        this.i = d;
        class06889 class068892 = this.L();
        this.M = this.R;
        this.B = class068892;
        this.N(class001432, d, null);
        return true;
    }

    public void N() {
        class06889 class068892;
        ++this.R;
        if (this.m) {
            this.B();
        }
        if (this.U()) {
            return;
        }
        if (this.y()) {
            this.z();
        } else if (this.u != null && !this.u.L()) {
            class068892 = this.L();
            class06889 class068893 = this.u.N((class07049)this.y);
            if (class068892.B > class068893.B && !this.y.method_24828() && class04995.N((double)class068892.M) == class04995.N((double)class068893.M) && class04995.N((double)class068892.Z) == class04995.N((double)class068893.Z)) {
                this.u.N();
            }
        }
        if (this.U()) {
            return;
        }
        class068892 = this.u.N((class07049)this.y);
        this.y.F().N(class068892.M, this.N(class068892), class068892.Z, this.i);
    }

    protected double N(class06889 class068892) {
        class07209 class072092 = class07209.method_49638((class00737)class068892);
        return this.L.method_8320(class072092.method_10074()).P() ? class068892.B : class07955.N((class07290)this.L, (class07209)class072092);
    }

    protected boolean N(class06889 class068892, class06889 class068893) {
        return false;
    }

    public boolean N(class04425 class044252) {
        return class044252 != class04425.field_9 && class044252 != class04425.field_5 && class044252 != class04425.field_26446;
    }

    protected @Nullable class00143 N(Set<class07209> set, int n, boolean bl, int n2) {
        return this.N(set, n, bl, n2, this.j());
    }

    public @Nullable class00143 N(class07049 class070492, int n) {
        return this.N((Set<class07209>)ImmutableSet.of((Object)class070492.method_24515()), 16, true, n);
    }

    protected @Nullable class00143 N(Set<class07209> set, int n, boolean bl, int n2, float f) {
        if (set.isEmpty()) {
            return null;
        }
        if (this.y.method_23318() < (double)this.L.method_31607()) {
            return null;
        }
        if (!this.y()) {
            return null;
        }
        if (this.u != null && !this.u.L() && set.contains(this.j)) {
            return this.u;
        }
        class04643 class046432 = class08700.N();
        class046432.N("pathfind");
        class07209 class072092 = bl ? this.y.method_24515().method_10084() : this.y.method_24515();
        int n3 = (int)(f + (float)n);
        class00783 class007832 = new class00783(this.L, class072092.method_10069(-n3, -n3, -n3), class072092.method_10069(n3, n3, n3));
        class00143 class001432 = this.t.N(class007832, this.y, set, f, n2, this.n);
        class046432.L();
        if (class001432 != null && class001432.E() != null) {
            this.j = class001432.E();
            this.v = n2;
            this.n();
        }
        return class001432;
    }

    public void W() {
        this.u = null;
        this.y((CallbackInfo)null);
    }

    public void R() {
        this.n = 1.0f;
    }
}

