/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11281
 *  Nursultan.class11938
 *  minecraft.class00743
 *  minecraft.class02484
 *  minecraft.class02824
 *  minecraft.class02833
 *  minecraft.class04453
 *  minecraft.class05298
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class11092;
import Nursultan.class11281;
import Nursultan.class11938;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02824;
import minecraft.class02833;
import minecraft.class04453;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07510;

public class class11061 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public boolean y_init;

    public void L() {
        if (this.B()) {
            this.N((Integer)this.y_1);
        }
        this.s();
    }

    private boolean L(class06584 class065842) {
        return class065842.B() == class06570.la || class065842.B() == class06570.Gw;
    }

    public void M() {
        if (class11281.y((int)((Integer)this.y_1))) {
            return;
        }
        this.P();
    }

    private void P() {
        this.N((Integer)this.y_1);
        this.s();
    }

    public class11061() {
        this.E();
        this.y_0 = class06202.Nq();
        this.y_1 = -1;
        this.y_2 = class06584.E;
    }

    static {
        class11061.W();
    }

    private boolean B() {
        return (class04453)((class06202)this.y_0).T_4 != null && !class11281.y((int)((Integer)this.y_1)) && (this.u() || class11938.m().u());
    }

    public void i() {
        if (class11281.y((int)((Integer)this.y_1))) {
            return;
        }
        this.y_3 = (Integer)this.y_3 + 1;
        int n = (Integer)this.y_5 - 1;
        this.y_5 = n;
        if (n <= 0) {
            this.P();
        }
    }

    private void s() {
        this.y_1 = -1;
        this.y_2 = class06584.E;
        this.y_3 = 0;
        this.y_5 = 0;
    }

    private int z() {
        class07469 class074692 = ((class04453)((class06202)this.y_0).T_4).method_5996(class05298.u);
        if (class074692 == null) {
            return -1;
        }
        List<class07471> var2 = this.N(((class04453)((class06202)this.y_0).T_4).method_6079());
        Set set = var2.stream().map(class07471::N).collect(Collectors.toSet());
        List var4 = class074692.L().stream().filter(class074712 -> !set.contains(class074712.N())).toList();
        double d = class074692.y();
        double d2 = this.N(d, var4, var2);
        int n = -1;
        class00743 var10 = ((class04453)((class06202)this.y_0).T_4).method_31548().u();
        int n2 = ((class04453)((class06202)this.y_0).T_4).method_31548().N();
        for (int i = 0; i < var10.size(); ++i) {
            double d3;
            List<class07471> var14;
            class06584 class065842;
            if (i == n2 || (class065842 = (class06584)var10.get(i)).R() || !this.L(class065842) || (var14 = this.N(class065842)).isEmpty() || !((d3 = this.N(d, var4, var14)) > d2)) continue;
            d2 = d3;
            n = i;
        }
        return n;
    }

    public boolean u() {
        return !class11281.y((int)((Integer)this.y_1)) && (class04453)((class06202)this.y_0).T_4 != null && !((class06584)this.y_2).R() && ((class04453)((class06202)this.y_0).T_4).method_6079().N(((class06584)this.y_2).B());
    }

    private boolean y(class06584 class065842) {
        return class065842.B() == class06570.la || class065842.L(class02484.e);
    }

    public boolean y() {
        return class11281.y((int)((Integer)this.y_1)) || (Integer)this.y_3 >= (Integer)this.y_4;
    }

    private void E() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = 0;
            this.y_3 = 0;
            this.y_4 = 0;
            this.y_5 = 0;
        }
    }

    private double N(double d, List<class07471> list, List<class07471> list2) {
        Set set = list2.stream().map(class07471::N).collect(Collectors.toSet());
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 1.0;
        for (class07471 class074713 : Stream.concat(list.stream().filter(class074712 -> !set.contains(class074712.N())), list2.stream()).toList()) {
            switch (((int[])class11092.N_0)[class074713.L().ordinal()]) {
                case 1: {
                    d2 += class074713.y();
                    break;
                }
                case 2: {
                    d3 += class074713.y();
                    break;
                }
                case 3: {
                    d4 *= 1.0 + class074713.y();
                }
            }
        }
        double d5 = d + d2;
        return (d5 + d5 * d3) * d4;
    }

    public void N() {
        if (class11281.y((int)((Integer)this.y_1)) || class11938.m().u()) {
            return;
        }
        if (!this.u()) {
            this.s();
        }
    }

    private List<class07471> N(class06584 class065842) {
        return ((class02833)class065842.a_(class02484.b, (Object)class02833.N)).y().stream().filter(class028242 -> class028242.N() == class05298.u && class028242.L().y(class07085.field_6171)).map(class02824::y).toList();
    }

    private void N(int n) {
        class11938.m().N(0, class11281.L((int)n), 40, class07510.field_7791).y();
    }

    private static void W() {
        N_0 = 40;
        N_1 = 5;
        N_2 = 1;
        N_3 = 2;
    }

    public void R() {
        if (!class11281.y((int)((Integer)this.y_1))) {
            this.y_5 = 5;
            return;
        }
        if (this.y(((class04453)((class06202)this.y_0).T_4).method_6079())) {
            return;
        }
        int n = this.z();
        if (class11281.y((int)n)) {
            return;
        }
        this.y_2 = (class06584)((class04453)((class06202)this.y_0).T_4).method_31548().u().get(n);
        this.N(n);
        this.y_1 = n;
        this.y_3 = 0;
        this.y_4 = class11938.m().u() ? 2 : 1;
        this.y_5 = 5;
    }
}

