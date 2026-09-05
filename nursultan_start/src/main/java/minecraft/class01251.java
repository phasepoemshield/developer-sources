/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class05298
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07305
 *  minecraft.class07473
 */
package minecraft;

import java.util.List;
import minecraft.class00734;
import minecraft.class01279;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07305;
import minecraft.class07473;

public class class01251<T extends class07079>
extends class07473 {
    private static final int N = 10;
    private final T y;
    private final boolean L;
    private int u;

    public void L() {
        this.u = this.y.method_6117();
        ((class01279)this.y).Q_();
        if (this.L) {
            this.Z().stream().filter(class070792 -> class070792 != this.y).map(class070792 -> (class01279)class070792).forEach(class01279::Q_);
        }
        super.L();
    }

    private boolean M() {
        return this.y.method_6065() != null && this.y.method_6065().method_5864() == class07078.Ly && this.y.method_6117() > this.u;
    }

    public class01251(T t, boolean bl) {
        this.y = t;
        this.L = bl;
    }

    private List<? extends class07079> Z() {
        double d = this.y.method_45325(class05298.P);
        class00734 class007342 = class00734.N((class06889)this.y.method_73189()).L(d, 10.0, d);
        return this.y.method_73183().N(this.y.getClass(), class007342, class07042.R);
    }

    public boolean N() {
        return (Boolean)class01251.N(this.y).method_64395().N(class07305.NR) != false && this.M();
    }
}

