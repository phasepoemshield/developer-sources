/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10478
 *  Nursultan.class10480
 *  Nursultan.class10481
 *  minecraft.class00500
 *  minecraft.class03275
 *  minecraft.class03285
 *  minecraft.class05851
 *  minecraft.class05880
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06919
 *  minecraft.class06937
 *  minecraft.class07075
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10478;
import Nursultan.class10480;
import Nursultan.class10481;
import minecraft.class00500;
import minecraft.class03275;
import minecraft.class03285;
import minecraft.class04960;
import minecraft.class05851;
import minecraft.class05880;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06919;
import minecraft.class06937;
import minecraft.class07075;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import org.jspecify.annotations.Nullable;

public abstract class class04977
extends class07482 {
    private static final int N = 9;
    private static final int y = 3;
    private static final int L = 0;
    protected final class05880 i;
    protected final class08036 R;
    protected final class06695 j;
    protected final class06919 v = new class10478(this);
    private final int u;

    private int P() {
        return this.W() + 27;
    }

    private int T() {
        return this.s() + 9;
    }

    public class04977(@Nullable class05851<?> class058512, int n, class08044 class080442, class05880 class058802, class03275 class032752) {
        super(class058512, n);
        this.i = class058802;
        this.R = class080442.z;
        this.j = this.N(class032752.u());
        this.u = class032752.i();
        this.N(class032752);
        this.y(class032752);
        this.L((class06695)class080442, 8, 84);
    }

    private int s() {
        return this.P();
    }

    public int m() {
        return this.u;
    }

    public void y(class06695 class066952) {
        super.y(class066952);
        if (class066952 == this.j) {
            this.E();
        }
    }

    public void y(class08036 class080362) {
        super.y(class080362);
        this.i.N_53((class072992, class072092) -> this.N(class080362, this.j));
    }

    private void y(class03275 class032752) {
        this.N(new class04960(this, (class06695)this.v, class032752.y().N(), class032752.y().y(), class032752.y().L()));
    }

    protected boolean y(class06584 class065842) {
        return true;
    }

    public abstract void E();

    protected boolean N(class08036 class080362, boolean bl) {
        return true;
    }

    private class07075 N(int n) {
        return new class10480(this, n);
    }

    private void N(class03275 class032752) {
        for (class03285 class032852 : class032752.L()) {
            this.N((class06937)new class10481(this, this.j, class032852.N(), class032852.y(), class032852.L(), class032852));
        }
    }

    protected abstract boolean N(class00500 var1);

    protected abstract void N(class08036 var1, class06584 var2);

    public boolean N(class08036 class080362) {
        return (Boolean)this.i.N((class072992, class072092) -> {
            if (!this.N(class072992.method_8320(class072092))) {
                return false;
            }
            return class080362.method_56093(class072092, 4.0);
        }, (Object)true);
    }

    public class06584 N(class08036 class080362, int n) {
        class06584 class065842 = class06584.E;
        class06937 class069372 = (class06937)this.T.get(n);
        if (class069372 != null && class069372.R()) {
            class06584 class065843 = class069372.i();
            class065842 = class065843.t();
            int n2 = this.W();
            int n3 = this.T();
            if (n == this.m()) {
                if (!this.N(class065843, n2, n3, true)) {
                    return class06584.E;
                }
                class069372.y(class065843, class065842);
            } else if (n >= 0 && n < this.m() ? !this.N(class065843, n2, n3, false) : (this.y(class065843) && n >= this.W() && n < this.T() ? !this.N(class065843, 0, this.m(), false) : (n >= this.W() && n < this.P() ? !this.N(class065843, this.s(), this.T(), false) : n >= this.s() && n < this.T() && !this.N(class065843, this.W(), this.P(), false)))) {
                return class06584.E;
            }
            if (class065843.R()) {
                class069372.u(class06584.E);
            } else {
                class069372.M();
            }
            if (class065843.c() == class065842.c()) {
                return class06584.E;
            }
            class069372.N(class080362, class065843);
        }
        return class065842;
    }

    private int W() {
        return this.m() + 1;
    }
}

