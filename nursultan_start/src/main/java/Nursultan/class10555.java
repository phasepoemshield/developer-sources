/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class06069
 *  minecraft.class06091
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07623
 *  minecraft.class07830
 */
package Nursultan;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class06069;
import minecraft.class06091;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07623;
import minecraft.class07830;

public class class10555<T extends class06091>
extends class07473 {
    private static final int N = 200;
    private final T y;
    private final double L;
    private final double u;
    private long i;

    public void L() {
    }

    private List<class06091> M() {
        return this.y.method_73183().N(class06091.class, this.y.method_5829().M(16.0), class060912 -> class060912.O() && !class060912.method_5779(this.y));
    }

    public class10555(T t, double d, double d2) {
        this.y = t;
        this.L = d;
        this.u = d2;
        this.i = -1L;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    private boolean Z() {
        class06069 class060692 = this.y.method_59922();
        class07209 class072092 = this.y.method_73183().N(class07830.field_13203, this.y.method_24515().method_10069(-8 + class060692.y(16), 0, -8 + class060692.y(16)));
        return this.y.f().N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), this.L);
    }

    public void i() {
        boolean bl = this.y.Q();
        class07623 class076232 = this.y.f();
        if (class076232.U()) {
            List<class06091> var3 = this.M();
            if (this.y.o() && var3.isEmpty()) {
                this.y.B(false);
            } else if (!bl || !this.y.l().method_19769((class00737)this.y.method_73189(), 10.0)) {
                class06889 class068892 = class06889.L((class00753)this.y.l());
                class06889 class068893 = this.y.method_73189();
                class068892 = class068893.u(class068892).y(90.0f).L(0.4).i(class068892);
                class07209 class072092 = class07209.method_49638((class00737)class068892.u(class068893).u().L(10.0).i(class068893));
                class072092 = this.y.method_73183().N(class07830.field_13203, class072092);
                if (!class076232.N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), bl ? this.u : this.L)) {
                    this.Z();
                    this.i = this.y.method_73183().N() + 200L;
                } else if (bl) {
                    Iterator<class06091> var9 = var3.iterator();
                    while (var9.hasNext()) {
                        var9.next().N(class072092);
                    }
                }
            } else {
                this.y.I();
            }
        }
    }

    public void u() {
    }

    public boolean N() {
        boolean bl = this.y.method_73183().N() < this.i;
        return this.y.o() && this.y.T() == null && !this.y.method_42148() && this.y.d() && !bl;
    }
}

