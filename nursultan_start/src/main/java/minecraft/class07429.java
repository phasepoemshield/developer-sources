/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  minecraft.class07473
 *  minecraft.class07643
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class07473;
import minecraft.class07643;

public class class07429
extends class07473 {
    private static final int N = 200;
    private final class07643 y;
    private int L;
    private int u;

    public void L() {
        this.L = 0;
    }

    public class07429(class07643 class076432) {
        this.y = class076432;
        this.u = this.N(class076432);
    }

    public void i() {
        if (--this.L > 0) {
            return;
        }
        this.L = this.N(10);
        this.y.w();
    }

    public void u() {
        this.y.t();
    }

    public boolean y() {
        return this.y.n() && this.y.d();
    }

    public boolean N() {
        if (this.y.l()) {
            return false;
        }
        if (this.y.n()) {
            return true;
        }
        if (this.u > 0) {
            --this.u;
            return false;
        }
        this.u = this.N(this.y);
        Predicate<class07643> predicate = class076432 -> class076432.G() || !class076432.n();
        List var2 = this.y.method_73183().N(this.y.getClass(), this.y.method_5829().L(8.0, 8.0, 8.0), predicate);
        ((class07643)DataFixUtils.orElse(var2.stream().filter(class07643::G).findAny(), (Object)this.y)).N(var2.stream().filter(class076432 -> !class076432.n()));
        return this.y.n();
    }

    protected int N(class07643 class076432) {
        return class07429.y((int)(200 + class076432.method_59922().y(200) % 20));
    }
}

