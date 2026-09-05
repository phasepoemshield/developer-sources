/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class01328
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07623
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.function.Predicate;
import minecraft.class00143;
import minecraft.class01328;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import org.jspecify.annotations.Nullable;

public class class07464<T extends class07438>
extends class07473 {
    protected final class07475 N;
    private final double Z;
    private final double z;
    protected @Nullable T y;
    protected final float L;
    protected @Nullable class00143 u;
    protected final class07623 i;
    protected final Class<T> R;
    protected final Predicate<? super class07438> M;
    protected final Predicate<? super class07438> B;
    private final class01328 U;

    @Override
    public void L() {
        this.i.N(this.u, this.Z);
    }

    public class07464(class07475 class074752, Class<T> clazz, float f, double d, double d2) {
        this(class074752, clazz, class074382 -> true, f, d, d2, class07042.i);
    }

    public class07464(class07475 class074752, Class<T> clazz, Predicate<class07438> predicate, float f, double d, double d2, Predicate<? super class07438> predicate2) {
        this.N = class074752;
        this.R = clazz;
        this.M = predicate;
        this.L = f;
        this.Z = d;
        this.z = d2;
        this.B = predicate2;
        this.i = class074752.f();
        this.N_71(EnumSet.of(class07430.field_18405));
        this.U = class01328.N().N((double)f).N((class074382, class047822) -> predicate2.test(class074382) && predicate.test(class074382));
    }

    public class07464(class07475 class074752, Class<T> clazz, float f, double d, double d2, Predicate<? super class07438> predicate) {
        this(class074752, clazz, class074382 -> true, f, d, d2, predicate);
    }

    @Override
    public void i() {
        if (this.N.method_5858((class07049)this.y) < 49.0) {
            this.N.f().N(this.z);
        } else {
            this.N.f().N(this.Z);
        }
    }

    @Override
    public void u() {
        this.y = null;
    }

    @Override
    public boolean y() {
        return !this.i.U();
    }

    @Override
    public boolean N() {
        this.y = class07464.N((class07049)this.N).N(this.N.method_73183().N(this.R, this.N.method_5829().L((double)this.L, 3.0, (double)this.L), class074382 -> true), this.U, (class07438)this.N, this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
        if (this.y == null) {
            return false;
        }
        class06889 class068892 = class05475.N((class07475)this.N, (int)16, (int)7, (class06889)this.y.method_73189());
        if (class068892 == null) {
            return false;
        }
        if (this.y.method_5649(class068892.M, class068892.B, class068892.Z) < this.y.method_5858((class07049)this.N)) {
            return false;
        }
        this.u = this.i.N(class068892.M, class068892.B, class068892.Z, 0);
        return this.u != null;
    }
}

