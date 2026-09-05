/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10498
 *  com.google.common.collect.Lists
 *  minecraft.class07209
 */
package minecraft;

import Nursultan.class10498;
import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class07209;

public class class05214 {
    private final List<class10498> N = Lists.newArrayList();

    public double y(class07209 class072092, double d) {
        if (d == 0.0) {
            return 0.0;
        }
        double d2 = 0.0;
        for (class10498 class104982 : this.N) {
            d2 += class104982.N(class072092);
        }
        return d2 * d;
    }

    public void N(class07209 class072092, double d) {
        if (d != 0.0) {
            this.N.add(new class10498(class072092, d));
        }
    }
}

