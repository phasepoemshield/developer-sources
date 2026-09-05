/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  minecraft.class00457
 *  minecraft.class00753
 *  minecraft.class00772
 *  minecraft.class01296
 *  minecraft.class01383
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import minecraft.class00457;
import minecraft.class00753;
import minecraft.class00772;
import minecraft.class01296;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06889;
import minecraft.class07209;

public class class01867
implements class01857 {
    private final class06202 N;
    private final boolean y;
    private final boolean L;
    private static final int u = 10;

    public class01867(class06202 class062022, boolean bl, boolean bl2) {
        this.N = class062022;
        this.y = bl;
        this.L = bl2;
    }

    @Override
    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class03448 class034482 = (class03448)this.N.T_3;
        class07209 class072092 = class07209.method_49637((double)d, (double)d2, (double)d3);
        LongOpenHashSet longOpenHashSet = new LongOpenHashSet();
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-10, -10, -10), (class07209)class072092.method_10069(10, 10, 10))) {
            int n;
            int n2 = class034482.method_8314(class00772.field_9284, class072093);
            long l = class01296.i((long)class072093.method_10063());
            if (longOpenHashSet.add(l)) {
                class06724.N((String)class034482.method_8398().L().N(class00772.field_9284, class01296.N((long)l)), (class06889)new class06889((double)class01296.N((int)class01296.y((long)l), (int)8), (double)class01296.N((int)class01296.L((long)l), (int)8), (double)class01296.N((int)class01296.u((long)l), (int)8)), (class06715)class06715.N((int)-65536).N(4.8f));
            }
            if (n2 != 15 && this.L) {
                n = class02566.N((float)((float)n2 / 15.0f), (int)-16776961, (int)-16711681);
                class06724.N((String)String.valueOf(n2), (class06889)class06889.N((class00753)class072093, (double)0.5, (double)0.25, (double)0.5), (class06715)class06715.N((int)n));
            }
            if (!this.y || (n = class034482.method_8314(class00772.field_9282, class072093)) == 0) continue;
            int n3 = class02566.N((float)((float)n / 15.0f), (int)-5636096, (int)-256);
            class06724.N((String)String.valueOf(class034482.method_8314(class00772.field_9282, class072093)), (class06889)class06889.y((class00753)class072093), (class06715)class06715.N((int)n3));
        }
    }
}

