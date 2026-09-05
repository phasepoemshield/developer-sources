/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class08036
 *  org.apache.commons.lang3.math.Fraction
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class02830;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class08036;
import org.apache.commons.lang3.math.Fraction;
import org.jspecify.annotations.Nullable;

public class class02822 {
    private final List<class06584> N;
    private Fraction y;
    private int L;

    private int L(class06584 class065842) {
        return Math.max(Fraction.ONE.subtract(this.y).divideBy(class02830.N(class065842)).intValue(), 0);
    }

    public Fraction L() {
        return this.y;
    }

    public class02822(class02830 class028302) {
        this.N = new ArrayList<class06584>(class028302.i);
        this.y = class028302.R;
        this.L = class028302.M;
    }

    public class02830 u() {
        return new class02830(List.copyOf(this.N), this.y, this.L);
    }

    public @Nullable class06584 y() {
        if (this.N.isEmpty()) {
            return null;
        }
        int n = this.y(this.L) ? 0 : this.L;
        class06584 class065842 = this.N.remove(n).t();
        this.y = this.y.subtract(class02830.N(class065842).multiplyBy(Fraction.getFraction((int)class065842.c(), (int)1)));
        this.N(-1);
        return class065842;
    }

    private int y(class06584 class065842) {
        if (!class065842.E()) {
            return -1;
        }
        for (int i = 0; i < this.N.size(); ++i) {
            if (!class06584.L((class06584)this.N.get(i), (class06584)class065842)) continue;
            return i;
        }
        return -1;
    }

    private boolean y(int n) {
        return n < 0 || n >= this.N.size();
    }

    public class02822 N() {
        this.N.clear();
        this.y = Fraction.ZERO;
        this.L = -1;
        return this;
    }

    public int N(class06937 class069372, class08036 class080362) {
        class06584 class065842 = class069372.i();
        int n = this.L(class065842);
        return class02830.y(class065842) ? this.N(class069372.y(class065842.c(), n, class080362)) : 0;
    }

    public int N(class06584 class065842) {
        if (!class02830.y(class065842)) {
            return 0;
        }
        int n = Math.min(class065842.c(), this.L(class065842));
        if (n == 0) {
            return 0;
        }
        this.y = this.y.add(class02830.N(class065842).multiplyBy(Fraction.getFraction((int)n, (int)1)));
        int n2 = this.y(class065842);
        if (n2 != -1) {
            class06584 class065843 = this.N.remove(n2);
            class06584 class065844 = class065843.L(class065843.c() + n);
            class065842.B(n);
            this.N.add(0, class065844);
        } else {
            this.N.add(0, class065842.N(n));
        }
        return n;
    }

    public void N(int n) {
        this.L = this.L == n || this.y(n) ? -1 : n;
    }
}

