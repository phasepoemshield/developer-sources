/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00457
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class01383
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class07049
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import minecraft.class00457;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class07049;
import minecraft.class07536;

public class class01872
implements class01857 {
    private final class06202 N;
    private double y = Double.MIN_VALUE;
    private List<class00494> L = Collections.emptyList();

    public class01872(class06202 class062022) {
        this.N = class062022;
    }

    @Override
    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        double d4 = class07536.u();
        if (d4 - this.y > 1.0E8) {
            this.y = d4;
            class07049 class070492 = ((class03386)this.N.i_5).s().B();
            this.L = ImmutableList.copyOf((Iterable)class070492.method_73183().method_8600(class070492, class070492.method_5829().M(6.0)));
        }
        for (class00494 class004942 : this.L) {
            class06747 class067472 = class06747.N((int)-1);
            Iterator var15 = class004942.method_1090().iterator();
            while (var15.hasNext()) {
                class06724.N((class00734)((class00734)var15.next()), (class06747)class067472);
            }
        }
    }
}

