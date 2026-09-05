/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00457
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class04453
 *  minecraft.class06092
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoubleSupplier;
import minecraft.class00457;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06092;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07536;

public class class03472
implements class01857 {
    private final class06202 N;
    private double y = Double.MIN_VALUE;
    private List<class07049> L = Collections.emptyList();

    public class03472(class06202 class062022) {
        this.N = class062022;
    }

    private void N(class07209 class072092, double d, int n) {
        double d2 = (double)class072092.method_10263() - 2.0 * d;
        double d3 = (double)class072092.method_10264() - 2.0 * d;
        double d4 = (double)class072092.method_10260() - 2.0 * d;
        double d5 = d2 + 1.0 + 4.0 * d;
        double d6 = d3 + 1.0 + 4.0 * d;
        double d7 = d4 + 1.0 + 4.0 * d;
        class06724.N((class00734)new class00734(d2, d3, d4, d5, d6, d7), (class06747)class06747.N((int)class02566.N((float)0.4f, (int)n)));
        class00494 class004942 = ((class03448)((Object)this.N.T_3)).method_8320(class072092).y((class07290)((class03448)((Object)this.N.T_3)), class072092, class06092.N()).method_66507((class00753)class072092);
        class06747 class067472 = class06747.N((int)n);
        Iterator var19 = class004942.method_1090().iterator();
        while (var19.hasNext()) {
            class06724.N((class00734)((class00734)var19.next()), (class06747)class067472);
        }
    }

    private double N(class07049 class070492) {
        return 0.02 * (double)(String.valueOf((double)class070492.method_5628() + 0.132453657).hashCode() % 1000) / 1000.0;
    }

    private void N(class07049 class070492, DoubleSupplier doubleSupplier, int n) {
        class070492.field_44784.ifPresent(class072092 -> {
            double d = doubleSupplier.getAsDouble();
            class07209 class072093 = class070492.method_23312();
            this.N(class072093, 0.02 + d, n);
            class07209 class072094 = class070492.method_43260();
            if (!class072094.equals((Object)class072093)) {
                this.N(class072094, 0.04 + d, -16711681);
            }
        });
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class04453 class044532;
        double d4 = class07536.u();
        if (d4 - this.y > 1.0E8) {
            this.y = d4;
            class044532 = ((class03386)this.N.i_5).s().B();
            this.L = ImmutableList.copyOf((Collection)class044532.method_73183().N_70((class07049)class044532, class044532.method_5829().M(16.0)));
        }
        if ((class044532 = (class04453)this.N.T_4) != null && class044532.field_44784.isPresent()) {
            this.N((class07049)class044532, () -> 0.0, -65536);
        }
        for (class07049 class070492 : this.L) {
            if (class070492 == class044532) continue;
            this.N(class070492, () -> this.N(class070492), -16711936);
        }
    }
}

