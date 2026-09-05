/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.function.Predicate;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07962
extends class07473 {
    public static final float N = 0.02f;
    protected final class07079 y;
    protected @Nullable class07049 L;
    protected final float u;
    private int B;
    protected final float i;
    private final boolean Z;
    protected final Class<? extends class07438> R;
    protected final class01328 M;

    public void L() {
        this.B = this.N(40 + this.y.method_59922().y(40));
    }

    public class07962(class07079 class070792, Class<? extends class07438> clazz, float f) {
        this(class070792, clazz, f, 0.02f);
    }

    public class07962(class07079 class070792, Class<? extends class07438> clazz, float f, float f2, boolean bl) {
        this.y = class070792;
        this.R = clazz;
        this.u = f;
        this.i = f2;
        this.Z = bl;
        this.N_71(EnumSet.of(class07430.field_18406));
        if (clazz == class08036.class) {
            Predicate predicate = class07042.y((class07049)class070792);
            this.M = class01328.y().N((double)f).N((class074382, class047822) -> predicate.test(class074382));
        } else {
            this.M = class01328.y().N((double)f);
        }
    }

    public class07962(class07079 class070792, Class<? extends class07438> clazz, float f, float f2) {
        this(class070792, clazz, f, f2, false);
    }

    public void i() {
        if (!this.L.method_5805()) {
            return;
        }
        double d = this.Z ? this.y.method_23320() : this.L.method_23320();
        this.y.p().N(this.L.method_23317(), d, this.L.method_23321());
        --this.B;
    }

    public void u() {
        this.L = null;
    }

    public boolean y() {
        if (!this.L.method_5805()) {
            return false;
        }
        if (this.y.method_5858(this.L) > (double)(this.u * this.u)) {
            return false;
        }
        return this.B > 0;
    }

    public boolean N() {
        if (this.y.method_59922().z() >= this.i) {
            return false;
        }
        if (this.y.T() != null) {
            this.L = this.y.T();
        }
        class04782 class047822 = class07962.N((class07049)this.y);
        this.L = this.R == class08036.class ? class047822.N(this.M, (class07438)this.y, this.y.method_23317(), this.y.method_23320(), this.y.method_23321()) : class047822.N(this.y.method_73183().N(this.R, this.y.method_5829().L((double)this.u, 3.0, (double)this.u), (T class074382) -> true), this.M, (class07438)this.y, this.y.method_23317(), this.y.method_23320(), this.y.method_23321());
        return this.L != null;
    }
}

