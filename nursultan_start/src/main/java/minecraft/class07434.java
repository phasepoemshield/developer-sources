/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07473
 *  minecraft.class07633
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.List;
import minecraft.class01328;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07633;
import org.jspecify.annotations.Nullable;

public class class07434
extends class07473 {
    private static final class01328 u = class01328.y().N(8.0).u();
    protected final class07633 N;
    private final Class<? extends class07633> i;
    protected final class04782 y;
    protected @Nullable class07633 L;
    private int R;
    private final double M;

    private @Nullable class07633 M() {
        List var1 = this.y.N(this.i, u, (class07438)this.N, this.N.method_5829().M(8.0));
        double d = Double.MAX_VALUE;
        class07633 class076332 = null;
        for (class07633 class076333 : var1) {
            if (!this.N.N(class076333) || class076333.Nk() || !(this.N.method_5858((class07049)class076333) < d)) continue;
            class076332 = class076333;
            d = this.N.method_5858((class07049)class076333);
        }
        return class076332;
    }

    public class07434(class07633 class076332, double d) {
        this(class076332, d, class076332.getClass());
    }

    public class07434(class07633 class076332, double d, Class<? extends class07633> clazz) {
        this.N = class076332;
        this.y = class07434.N((class07049)class076332);
        this.i = clazz;
        this.M = d;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public void i() {
        this.N.p().N((class07049)this.L, 10.0f, this.N.Ni());
        this.N.f().N((class07049)this.L, this.M);
        ++this.R;
        if (this.R >= this.N(60) && this.N.method_5858((class07049)this.L) < 9.0) {
            this.R();
        }
    }

    public void u() {
        this.L = null;
        this.R = 0;
    }

    public boolean y() {
        return this.L.method_5805() && this.L.NX() && this.R < 60 && !this.L.Nk();
    }

    public boolean N() {
        if (!this.N.NX()) {
            return false;
        }
        this.L = this.M();
        return this.L != null;
    }

    protected void R() {
        this.N.N(this.y, this.L);
    }
}

