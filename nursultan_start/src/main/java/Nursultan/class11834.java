/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11845;
import Nursultan.class11849;
import Nursultan.class11868;
import Nursultan.class11874;

public class class11834 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public boolean y_init;

    public class11849 L() {
        return (class11849)this.N_1;
    }

    public long M() {
        return (Long)this.N_3;
    }

    private void T() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = 0;
            this.y_2 = 0L;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_3 = 0L;
            this.N_4 = false;
            this.N_5 = 0L;
            this.N_6 = false;
            this.N_7 = 0L;
        }
    }

    public class11834(class11845 class118452, int n, class11874 class118742, class11849 class118492, class11868 class118682, long l, boolean bl) {
        this.T();
        this.y_0 = class118452;
        this.y_1 = n;
        this.y_2 = System.currentTimeMillis();
        this.N_0 = class118742;
        this.N_1 = class118492;
        this.N_2 = class118682;
        this.N_3 = l;
        this.N_4 = bl;
        this.N_5 = class11834.N((Long)this.y_2, l);
    }

    public class11874 B() {
        if (this.N_0 == null) {
            return class11874.L != null ? class11874.L : () -> 0xFF29B6F6;
        }
        return (class11874)this.N_0;
    }

    public long Z() {
        return (Long)this.N_5;
    }

    public long i() {
        return (Long)this.y_2;
    }

    public boolean U() {
        return (Boolean)this.N_6;
    }

    public long z() {
        return (Boolean)this.N_6 != false ? ((Long)this.N_7).longValue() : ((Long)this.N_5).longValue();
    }

    public class11834 u() {
        this.N_5 = class11834.N(System.currentTimeMillis(), (Long)this.N_3);
        return this;
    }

    public class11834 y(class11868 class118682) {
        return this.N(class118682).u();
    }

    public class11834 y(long l) {
        this.N_3 = l;
        return this;
    }

    public class11868 y() {
        return (class11868)this.N_2;
    }

    public boolean E() {
        return (Boolean)this.N_6 == false && System.currentTimeMillis() < (Long)this.N_5;
    }

    public class11834 N(class11874 class118742) {
        this.N_0 = class118742;
        return this;
    }

    public class11834 N(long l) {
        this.N_5 = l;
        return this;
    }

    public class11834 N(class11849 class118492) {
        this.N_1 = class118492;
        return this;
    }

    public class11834 N(class11868 class118682) {
        this.N_2 = class118682;
        return this;
    }

    private static long N(long l, long l2) {
        return l2 <= 0L ? Long.MAX_VALUE : l + l2;
    }

    public int N() {
        return (Integer)this.y_1;
    }

    public boolean W() {
        return (Boolean)this.N_4;
    }

    public void R() {
        if (((Boolean)this.N_6).booleanValue() || ((Boolean)this.N_4).booleanValue()) {
            return;
        }
        this.N_6 = true;
        this.N_7 = System.currentTimeMillis();
        ((class11845)this.y_0).L();
    }
}

