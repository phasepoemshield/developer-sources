/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import minecraft.class00753;
import minecraft.class04782;
import minecraft.class04868;
import minecraft.class04877;
import minecraft.class04882;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;

public class class04845<T extends class04882>
extends class07473 {
    private static final int N = 20;
    private static final float y = 1.0f;
    private final T L;
    private int u;

    public class04845(T t) {
        this.L = t;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        if (((class04882)((Object)this.L)).NQ()) {
            class06889 class068892;
            class04877 class048772 = ((class04882)((Object)this.L)).K();
            if (((class04882)((Object)this.L)).field_6012 > this.u) {
                this.u = ((class04882)((Object)this.L)).field_6012 + 20;
                this.N(class048772);
            }
            if (!this.L.Nw() && (class068892 = class05475.N(this.L, (int)15, (int)4, (class06889)class06889.L((class00753)class048772.s()), (double)1.5707963705062866)) != null) {
                this.L.f().N(class068892.M, class068892.B, class068892.Z, 1.0);
            }
        }
    }

    public boolean y() {
        return ((class04882)((Object)this.L)).NQ() && !((class04882)((Object)this.L)).K().N() && !class04845.N_18((class07299)this.L.method_73183()).method_19500(this.L.method_24515());
    }

    private void N(class04877 class048772) {
        if (class048772.T()) {
            class04782 class047822 = class04845.N_18((class07299)this.L.method_73183());
            HashSet hashSet = Sets.newHashSet();
            List var4 = class047822.N(class04882.class, this.L.method_5829().M(16.0), class048822 -> !class048822.NQ() && class04868.N(class048822));
            hashSet.addAll(var4);
            for (class04882 class048823 : hashSet) {
                class048772.N(class047822, class048772.z(), class048823, null, true);
            }
        }
    }

    public boolean N() {
        return this.L.T() == null && !this.L.method_42148() && ((class04882)((Object)this.L)).NQ() && !((class04882)((Object)this.L)).K().N() && !class04845.N_18((class07299)this.L.method_73183()).method_19500(this.L.method_24515());
    }
}

