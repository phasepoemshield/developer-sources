/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01113
 *  minecraft.class01129
 *  minecraft.class01210
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06900
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07451
 *  minecraft.class07504
 *  minecraft.class07625
 *  minecraft.class07760
 *  minecraft.class08036
 *  minecraft.class08080
 *  minecraft.class08092
 *  minecraft.class08382
 *  net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate
 *  net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.EntityAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.base.Predicates;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01113;
import minecraft.class01129;
import minecraft.class01210;
import minecraft.class02736;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06900;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07451;
import minecraft.class07504;
import minecraft.class07625;
import minecraft.class07760;
import minecraft.class08036;
import minecraft.class08080;
import minecraft.class08092;
import minecraft.class08382;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.caffeinemc.mods.lithium.mixin.block.hopper.EntityAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02757
extends class02736 {
    private static final double y = 0.01;
    private static final double L = 0.2;
    private static final double u = 0.4;
    private static final double i = 0.4;
    private final class08382 R;
    private class06889 M = class06889.L;
    private class06889 B;
    private int Z;

    public @Nullable class06889 L(double d, double d2, double d3) {
        class00500 class005002;
        int n = class04995.N((double)d);
        int n2 = class04995.N((double)d2);
        int n3 = class04995.N((double)d3);
        if (this.L().method_8320(new class07209(n, n2 - 1, n3)).N(class01210.e)) {
            --n2;
        }
        if (class07760.U((class00500)(class005002 = this.L().method_8320(new class07209(n, n2, n3))))) {
            double d4;
            Pair var12 = class07504.N((class08080)((class08080)class005002.L(((class07760)class005002.i()).L())));
            class00753 class007532 = (class00753)var12.getFirst();
            class00753 class007533 = (class00753)var12.getSecond();
            double d5 = (double)n + 0.5 + (double)class007532.method_10263() * 0.5;
            double d6 = (double)n2 + 0.0625 + (double)class007532.method_10264() * 0.5;
            double d7 = (double)n3 + 0.5 + (double)class007532.method_10260() * 0.5;
            double d8 = (double)n + 0.5 + (double)class007533.method_10263() * 0.5;
            double d9 = (double)n2 + 0.0625 + (double)class007533.method_10264() * 0.5;
            double d10 = (double)n3 + 0.5 + (double)class007533.method_10260() * 0.5;
            double d11 = d8 - d5;
            double d12 = (d9 - d6) * 2.0;
            double d13 = d10 - d7;
            if (d11 == 0.0) {
                d4 = d3 - (double)n3;
            } else if (d13 == 0.0) {
                d4 = d - (double)n;
            } else {
                double d14 = d - d5;
                double d15 = d3 - d7;
                d4 = (d14 * d11 + d15 * d13) * 2.0;
            }
            d = d5 + d11 * d4;
            d2 = d6 + d12 * d4;
            d3 = d7 + d13 * d4;
            if (d12 < 0.0) {
                d2 += 1.0;
            } else if (d12 > 0.0) {
                d2 += 0.5;
            }
            return new class06889(d, d2, d3);
        }
        return null;
    }

    public class02757(class07504 class075042) {
        super(class075042);
        this.R = new class08382((class07049)class075042, this::N);
    }

    @Override
    public class06889 u(class06889 class068892) {
        if (Double.isNaN(class068892.M) || Double.isNaN(class068892.B) || Double.isNaN(class068892.Z)) {
            return class06889.L;
        }
        return new class06889(class04995.N((double)class068892.M, (double)-0.4, (double)0.4), class068892.B, class04995.N((double)class068892.Z, (double)-0.4, (double)0.4));
    }

    @Override
    public boolean u() {
        block4: {
            class00734 class007342;
            block3: {
                class007342 = this.N.method_5829().L((double)0.2f, 0.0, (double)0.2f);
                if (!this.N.Z() || !(this.i().z() >= 0.01)) break block3;
                Predicate var8 = class07042.N((class07049)this.N);
                class00734 class007343 = class007342;
                class07504 class075042 = this.N;
                class07299 class072992 = this.L();
                List list = this.N(class072992, (class07049)class075042, class007343, var8);
                if (list.isEmpty()) break block4;
                for (class07049 class070492 : list) {
                    if (class070492 instanceof class08036 || class070492 instanceof class07625 || class070492 instanceof class07504 || this.N.method_5782() || class070492.method_5765()) {
                        class070492.method_5697((class07049)this.N);
                        continue;
                    }
                    class070492.method_5804((class07049)this.N);
                }
                break block4;
            }
            class00734 class007344 = class007342;
            class07504 class075043 = this.N;
            class07299 class072993 = this.L();
            for (class07049 class070493 : this.N(class072993, (class07049)class075043, class007344)) {
                if (this.N.method_5626(class070493) || !class070493.method_5810() || !(class070493 instanceof class07504)) continue;
                class070493.method_5697((class07049)this.N);
            }
        }
        return false;
    }

    @Override
    public double y(class04782 class047822) {
        return this.N.method_5799() ? 0.2 : 0.4;
    }

    private void y(class04782 class047822, CallbackInfo callbackInfo) {
        if (this instanceof class06695) {
            class01113 class011132 = ((EntityAccessor)this).getChangeListener();
            if (class011132 instanceof ToggleableMovementTracker) {
                ToggleableMovementTracker toggleableMovementTracker = (ToggleableMovementTracker)class011132;
                this.Z = toggleableMovementTracker.lithium$setNotificationMask(this.Z);
                if (!this.B.equals((Object)this.R())) {
                    class011132.N();
                }
            }
            this.B = null;
        }
    }

    @Override
    public void y() {
        double d;
        class07299 class072992 = this.L();
        if (!(class072992 instanceof class04782)) {
            if (this.R.method_66270()) {
                this.R.method_66271();
            } else {
                this.N.method_23311();
                this.N(this.z() % 360.0f);
                this.y(this.U() % 360.0f);
            }
            return;
        }
        class04782 class047822 = (class04782)class072992;
        this.N.method_56990();
        class072992 = this.N.L();
        class00500 class005002 = this.L().method_8320((class07209)class072992);
        boolean bl = class07760.U((class00500)class005002);
        this.N.N(bl);
        if (bl) {
            this.N(class047822);
            if (class005002.N(class00869.Bh)) {
                this.N.N(class047822, class072992.method_10263(), class072992.method_10264(), class072992.method_10260(), ((Boolean)class005002.L((class08092)class06900.u)).booleanValue());
            }
        } else {
            this.N.L(class047822);
        }
        this.N.method_61409();
        this.N(0.0f);
        double d2 = this.N.field_6014 - this.M();
        double d3 = this.N.field_5969 - this.Z();
        if (d2 * d2 + d3 * d3 > 0.001) {
            this.y((float)(class04995.u((double)d3, (double)d2) * 180.0 / Math.PI));
            if (this.N.u()) {
                this.y(this.U() + 180.0f);
            }
        }
        if ((d = (double)class04995.R((float)(this.U() - this.N.field_5982))) < -170.0 || d >= 170.0) {
            this.y(this.U() + 180.0f);
            this.N.y(!this.N.u());
        }
        this.N(this.z() % 360.0f);
        this.y(this.U() % 360.0f);
        this.u();
    }

    @Override
    public class07211 E() {
        return this.N.u() ? this.N.method_5735().b().R() : this.N.method_5735().R();
    }

    private List N(class07299 class072992, class07049 class070492, class00734 class007342) {
        return class072992.N(class07504.class, class007342, class075042 -> class075042 != class070492);
    }

    private void N(class04782 class047822, CallbackInfo callbackInfo) {
        if (this instanceof class06695) {
            this.B = this.R();
            class01113 class011132 = ((EntityAccessor)this).getChangeListener();
            if (class011132 instanceof ToggleableMovementTracker) {
                ToggleableMovementTracker toggleableMovementTracker = (ToggleableMovementTracker)class011132;
                this.Z = toggleableMovementTracker.lithium$setNotificationMask(0);
            }
        }
    }

    private List N(class07299 class072992, class07049 class070492, class00734 class007342, Predicate predicate) {
        if (predicate == Predicates.alwaysFalse()) {
            return Collections.emptyList();
        }
        if (predicate instanceof EntityPushablePredicate) {
            EntityPushablePredicate entityPushablePredicate = (EntityPushablePredicate)predicate;
            class01129 var6 = WorldHelper.getEntityCacheOrNull((class07299)class072992);
            if (var6 != null) {
                return WorldHelper.getPushableEntities((class07299)class072992, (class01129)var6, (class07049)class070492, (class00734)class007342, (EntityPushablePredicate)entityPushablePredicate);
            }
        }
        return class072992.method_8333(class070492, class007342, predicate);
    }

    @Override
    public double N(class07209 class072092, class08080 class080802, double d) {
        return 0.0;
    }

    @Override
    public void N(class06889 class068892) {
        this.M = class068892;
        this.y(this.M);
    }

    public @Nullable class06889 N(double d, double d2, double d3, double d4) {
        class00500 class005002;
        int n = class04995.N((double)d);
        int n2 = class04995.N((double)d2);
        int n3 = class04995.N((double)d3);
        if (this.L().method_8320(new class07209(n, n2 - 1, n3)).N(class01210.e)) {
            --n2;
        }
        if (class07760.U((class00500)(class005002 = this.L().method_8320(new class07209(n, n2, n3))))) {
            class08080 class080802 = (class08080)class005002.L(((class07760)class005002.i()).L());
            d2 = n2;
            if (class080802.y()) {
                d2 = n2 + 1;
            }
            Pair var14 = class07504.N((class08080)class080802);
            class00753 class007532 = (class00753)var14.getFirst();
            class00753 class007533 = (class00753)var14.getSecond();
            double d5 = class007533.method_10263() - class007532.method_10263();
            double d6 = class007533.method_10260() - class007532.method_10260();
            double d7 = Math.sqrt(d5 * d5 + d6 * d6);
            if (class007532.method_10264() != 0 && class04995.N((double)(d += (d5 /= d7) * d4)) - n == class007532.method_10263() && class04995.N((double)(d3 += (d6 /= d7) * d4)) - n3 == class007532.method_10260()) {
                d2 += (double)class007532.method_10264();
            } else if (class007533.method_10264() != 0 && class04995.N((double)d) - n == class007533.method_10263() && class04995.N((double)d3) - n3 == class007533.method_10260()) {
                d2 += (double)class007533.method_10264();
            }
            return this.L(d, d2, d3);
        }
        return null;
    }

    @Override
    public void N(class04782 class047822) {
        double d;
        class06889 class068892;
        double d2;
        double d3;
        double d4;
        class06889 class068893;
        class04770 class047702;
        this.N(class047822, null);
        class07209 class072092 = this.N.L();
        class00500 class005002 = this.L().method_8320(class072092);
        this.N.method_38785();
        double d5 = this.N.method_23317();
        double d6 = this.N.method_23318();
        double d7 = this.N.method_23321();
        class06889 class068894 = this.L(d5, d6, d7);
        d6 = class072092.method_10264();
        boolean bl = false;
        boolean bl2 = false;
        if (class005002.N(class00869.yG)) {
            bl = (Boolean)class005002.L((class08092)class06900.u);
            bl2 = !bl;
        }
        double d8 = 0.0078125;
        if (this.N.method_5799()) {
            d8 *= 0.2;
        }
        class06889 class068895 = this.i();
        class08080 class080802 = (class08080)class005002.L(((class07760)class005002.i()).L());
        switch (class080802) {
            case field_12667: {
                this.y(class068895.y(-d8, 0.0, 0.0));
                d6 += 1.0;
                break;
            }
            case field_12666: {
                this.y(class068895.y(d8, 0.0, 0.0));
                d6 += 1.0;
                break;
            }
            case field_12670: {
                this.y(class068895.y(0.0, 0.0, d8));
                d6 += 1.0;
                break;
            }
            case field_12668: {
                this.y(class068895.y(0.0, 0.0, -d8));
                d6 += 1.0;
            }
        }
        class068895 = this.i();
        Pair var17 = class07504.N((class08080)class080802);
        class00753 class007532 = (class00753)var17.getFirst();
        class00753 class007533 = (class00753)var17.getSecond();
        double d9 = class007533.method_10263() - class007532.method_10263();
        double d10 = class007533.method_10260() - class007532.method_10260();
        double d11 = Math.sqrt(d9 * d9 + d10 * d10);
        if (class068895.M * d9 + class068895.Z * d10 < 0.0) {
            d9 = -d9;
            d10 = -d10;
        }
        double d12 = Math.min(2.0, class068895.Z());
        class068895 = new class06889(d12 * d9 / d11, class068895.B, d12 * d10 / d11);
        this.y(class068895);
        class07049 class070492 = this.N.method_31483();
        class07049 class070493 = this.N.method_31483();
        if (class070493 instanceof class04770) {
            class047702 = (class04770)class070493;
            class068893 = class047702.method_63563();
        } else {
            class068893 = class06889.L;
        }
        if (class070492 instanceof class08036 && class068893.B() > 0.0) {
            class047702 = class068893.u();
            double d13 = this.i().z();
            if (class047702.B() > 0.0 && d13 < 0.01) {
                this.y(this.i().y(class068893.M * 0.001, 0.0, class068893.Z * 0.001));
                bl2 = false;
            }
        }
        if (bl2) {
            double d14 = this.i().Z();
            if (d14 < 0.03) {
                this.y(class06889.L);
            } else {
                this.y(this.i().u(0.5, 0.0, 0.5));
            }
        }
        double d15 = (double)class072092.method_10263() + 0.5 + (double)class007532.method_10263() * 0.5;
        double d16 = (double)class072092.method_10260() + 0.5 + (double)class007532.method_10260() * 0.5;
        double d17 = (double)class072092.method_10263() + 0.5 + (double)class007533.method_10263() * 0.5;
        double d18 = (double)class072092.method_10260() + 0.5 + (double)class007533.method_10260() * 0.5;
        d9 = d17 - d15;
        d10 = d18 - d16;
        if (d9 == 0.0) {
            d4 = d7 - (double)class072092.method_10260();
        } else if (d10 == 0.0) {
            d4 = d5 - (double)class072092.method_10263();
        } else {
            d3 = d5 - d15;
            d2 = d7 - d16;
            d4 = (d3 * d9 + d2 * d10) * 2.0;
        }
        d5 = d15 + d9 * d4;
        d7 = d16 + d10 * d4;
        this.y(d5, d6, d7);
        d3 = this.N.method_5782() ? 0.75 : 1.0;
        d2 = this.N.N_73(class047822);
        class068895 = this.i();
        this.N.method_5784(class07451.field_6308, new class06889(class04995.N((double)(d3 * class068895.M), (double)(-d2), (double)d2), 0.0, class04995.N((double)(d3 * class068895.Z), (double)(-d2), (double)d2)));
        if (class007532.method_10264() != 0 && class04995.N((double)this.N.method_23317()) - class072092.method_10263() == class007532.method_10263() && class04995.N((double)this.N.method_23321()) - class072092.method_10260() == class007532.method_10260()) {
            this.y(this.N.method_23317(), this.N.method_23318() + (double)class007532.method_10264(), this.N.method_23321());
        } else if (class007533.method_10264() != 0 && class04995.N((double)this.N.method_23317()) - class072092.method_10263() == class007533.method_10263() && class04995.N((double)this.N.method_23321()) - class072092.method_10260() == class007533.method_10260()) {
            this.y(this.N.method_23317(), this.N.method_23318() + (double)class007533.method_10264(), this.N.method_23321());
        }
        this.y(this.N.N(this.i()));
        class06889 class068896 = this.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
        if (class068896 != null && class068894 != null) {
            double d19 = (class068894.B - class068896.B) * 0.05;
            class068892 = this.i();
            d = class068892.Z();
            if (d > 0.0) {
                this.y(class068892.u((d + d19) / d, 1.0, (d + d19) / d));
            }
            this.y(this.N.method_23317(), class068896.B, this.N.method_23321());
        }
        int n = class04995.N((double)this.N.method_23317());
        int n2 = class04995.N((double)this.N.method_23321());
        if (n != class072092.method_10263() || n2 != class072092.method_10260()) {
            class068892 = this.i();
            d = class068892.Z();
            this.N(d * (double)(n - class072092.method_10263()), class068892.B, d * (double)(n2 - class072092.method_10260()));
        }
        if (bl) {
            class068892 = this.i();
            d = class068892.Z();
            if (d > 0.01) {
                double d20 = 0.06;
                this.y(class068892.y(class068892.M / d * 0.06, 0.0, class068892.Z / d * 0.06));
            } else {
                class06889 class068897 = this.i();
                double d21 = class068897.M;
                double d22 = class068897.Z;
                if (class080802 == class08080.field_12674) {
                    if (this.N.y(class072092.method_10067())) {
                        d21 = 0.02;
                    } else if (this.N.y(class072092.method_10078())) {
                        d21 = -0.02;
                    }
                } else if (class080802 == class08080.field_12665) {
                    if (this.N.y(class072092.method_10095())) {
                        d22 = 0.02;
                    } else if (this.N.y(class072092.method_10072())) {
                        d22 = -0.02;
                    }
                } else {
                    this.y(class047822, null);
                    return;
                }
                this.N(d21, class068897.B, d22);
            }
        }
        this.y(class047822, null);
    }

    public void N(class08382 class083822) {
        this.y(this.M);
    }

    @Override
    public class08382 N() {
        return this.R;
    }

    @Override
    public double W() {
        return this.N.method_5782() ? 0.997 : 0.96;
    }
}

