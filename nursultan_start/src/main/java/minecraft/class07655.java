/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class01763
 *  minecraft.class04425
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07068
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07955
 */
package minecraft;

import minecraft.class00143;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class01763;
import minecraft.class04425;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07068;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07623;
import minecraft.class07955;

public class class07655
extends class07623 {
    private boolean N;
    private boolean T;

    @Override
    protected class06889 L() {
        return new class06889(this.y.method_23317(), (double)this.j(), this.y.method_23321());
    }

    public void L(boolean bl) {
        this.N = bl;
    }

    public class07655(class07079 class070792, class07299 class072992) {
        super(class070792, class072992);
    }

    public void i(boolean bl) {
        this.T = bl;
    }

    @Override
    protected void m() {
        super.m();
        if (this.N) {
            if (this.L.N_17(class07209.method_49637((double)this.y.method_23317(), (double)(this.y.method_23318() + 0.5), (double)this.y.method_23321()))) {
                return;
            }
            for (int i = 0; i < this.u.i(); ++i) {
                class01763 class017632 = this.u.N(i);
                if (!this.L.N_17(new class07209(class017632.N, class017632.y, class017632.L))) continue;
                this.u.y(i);
                return;
            }
        }
    }

    private int j() {
        if (!this.y.method_5799() || !this.s()) {
            return class04995.N((double)(this.y.method_23318() + 0.5));
        }
        int n = this.y.method_31478();
        class00500 class005002 = this.L.method_8320(class07209.method_49637((double)this.y.method_23317(), (double)n, (double)this.y.method_23321()));
        int n2 = 0;
        while (class005002.N(class00869.K)) {
            class005002 = this.L.method_8320(class07209.method_49637((double)this.y.method_23317(), (double)(++n), (double)this.y.method_23321()));
            if (++n2 <= 16) continue;
            return this.y.method_31478();
        }
        return n;
    }

    public void u(boolean bl) {
        this.s.u(bl);
    }

    @Override
    public boolean u() {
        return true;
    }

    protected boolean y(class04425 class044252) {
        if (class044252 == class04425.field_18) {
            return false;
        }
        if (class044252 == class04425.field_14) {
            return false;
        }
        return class044252 != class04425.field_7;
    }

    @Override
    protected boolean y() {
        return this.y.method_24828() || this.y.method_52535() || this.y.method_5765();
    }

    @Override
    public class00143 N(class07209 class072092, int n) {
        class00570 class005702 = this.L.method_8398().N(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()));
        if (class005702 == null) {
            return null;
        }
        if (!this.T) {
            class072092 = this.N(class005702, class072092, n);
        }
        return super.N(class072092, n);
    }

    public final class07209 N(class00570 class005702, class07209 class072092, int n) {
        class07218 class072182;
        if (class005702.method_8320(class072092).P()) {
            class072182 = class072092.method_25503().N(class07211.field_11033);
            while (class072182.method_10264() >= this.L.method_31607() && class005702.method_8320((class07209)class072182).P()) {
                class072182.N(class07211.field_11033);
            }
            if (class072182.method_10264() >= this.L.method_31607()) {
                return class072182.method_10084();
            }
            class072182.method_10099(class072092.method_10264() + 1);
            while (class072182.method_10264() <= this.L.method_31600() && class005702.method_8320((class07209)class072182).P()) {
                class072182.N(class07211.field_11036);
            }
            class072092 = class072182;
        }
        if (class005702.method_8320(class072092).B()) {
            class072182 = class072092.method_25503().N(class07211.field_11036);
            while (class072182.method_10264() <= this.L.method_31600() && class005702.method_8320((class07209)class072182).B()) {
                class072182.N(class07211.field_11036);
            }
            return class072182.method_10062();
        }
        return class072092;
    }

    @Override
    protected class07068 N(int n) {
        this.s = new class07955();
        return new class07068(this.s, n);
    }

    @Override
    public class00143 N(class07049 class070492, int n) {
        return this.N(class070492.method_24515(), n);
    }
}

