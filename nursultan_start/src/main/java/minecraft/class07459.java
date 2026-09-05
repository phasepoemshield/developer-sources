/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07473
 *  minecraft.class07633
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class07049;
import minecraft.class07473;
import minecraft.class07633;
import org.jspecify.annotations.Nullable;

public class class07459
extends class07473 {
    public static final int N = 8;
    public static final int y = 4;
    public static final int L = 3;
    private final class07633 u;
    private @Nullable class07633 i;
    private final double R;
    private int M;

    public void L() {
        this.M = 0;
    }

    public class07459(class07633 class076332, double d) {
        this.u = class076332;
        this.R = d;
    }

    public void i() {
        if (--this.M > 0) {
            return;
        }
        this.M = this.N(10);
        this.u.f().N((class07049)this.i, this.R);
    }

    public void u() {
        this.i = null;
    }

    public boolean y() {
        if (this.u.K() >= 0) {
            return false;
        }
        if (!this.i.method_5805()) {
            return false;
        }
        double d = this.u.method_5858((class07049)this.i);
        return !(d < 9.0) && !(d > 256.0);
    }

    public boolean N() {
        if (this.u.K() >= 0) {
            return false;
        }
        List var1 = this.u.method_73183().N(this.u.getClass(), this.u.method_5829().L(8.0, 4.0, 8.0));
        class07633 class076332 = null;
        double d = Double.MAX_VALUE;
        for (class07633 class076333 : var1) {
            double d2;
            if (class076333.K() < 0 || (d2 = this.u.method_5858((class07049)class076333)) > d) continue;
            d = d2;
            class076332 = class076333;
        }
        if (class076332 == null) {
            return false;
        }
        if (d < 9.0) {
            return false;
        }
        this.i = class076332;
        return true;
    }
}

