/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07172
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class04995;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07172;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import org.jspecify.annotations.Nullable;

public class class07984
extends class07473 {
    private final class07079 N;
    private final class07172 y;
    private @Nullable class07438 L;
    private int u = -1;
    private final double i;
    private int R;
    private final int M;
    private final int B;
    private final float Z;
    private final float z;

    public class07984(class07172 class071722, double d, int n, float f) {
        this(class071722, d, n, n, f);
    }

    public class07984(class07172 class071722, double d, int n, int n2, float f) {
        if (!(class071722 instanceof class07438)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.y = class071722;
        this.N = (class07079)class071722;
        this.i = d;
        this.M = n;
        this.B = n2;
        this.Z = f;
        this.z = f * f;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        double d = this.N.method_5649(this.L.method_23317(), this.L.method_23318(), this.L.method_23321());
        boolean bl = this.N.C().N((class07049)this.L);
        this.R = bl ? ++this.R : 0;
        if (d > (double)this.z || this.R < 5) {
            this.N.f().N((class07049)this.L, this.i);
        } else {
            this.N.f().W();
        }
        this.N.p().N((class07049)this.L, 30.0f, 30.0f);
        if (--this.u == 0) {
            if (!bl) {
                return;
            }
            float f = (float)Math.sqrt(d) / this.Z;
            float f2 = class04995.N((float)f, (float)0.1f, (float)1.0f);
            this.y.N(this.L, f2);
            this.u = class04995.y((float)(f * (float)(this.B - this.M) + (float)this.M));
        } else if (this.u < 0) {
            this.u = class04995.N((double)class04995.u((double)(Math.sqrt(d) / (double)this.Z), (double)this.M, (double)this.B));
        }
    }

    public void u() {
        this.L = null;
        this.R = 0;
        this.u = -1;
    }

    public boolean y() {
        return this.N() || this.L.method_5805() && !this.N.f().U();
    }

    public boolean N() {
        class07438 class074382 = this.N.T();
        if (class074382 == null || !class074382.method_5805()) {
            return false;
        }
        this.L = class074382;
        return true;
    }
}

