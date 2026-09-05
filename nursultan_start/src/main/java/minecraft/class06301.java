/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00753
 *  minecraft.class04128
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class05378
 *  minecraft.class07438
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import minecraft.class00753;
import minecraft.class04128;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class05378;
import minecraft.class06289;
import minecraft.class07438;
import org.apache.commons.lang3.mutable.MutableInt;

public class class06301 {
    private static final int N = 300;

    private static /* synthetic */ App N(MutableInt mutableInt, int n, int n2, class04128 class041282) {
        return class041282.group((App)class041282.y(class05378.O), (App)class041282.y(class05378.g)).apply((Applicative)class041282, (class041392, class041393) -> (class047822, class074382, l) -> {
            boolean bl;
            boolean bl2 = bl = (Long)class041282.y(class041393) + 300L <= l;
            if (mutableInt.intValue() > n || bl) {
                class041393.y();
                class041392.y();
                class074382.method_18868().N(class047822.method_75728(), class047822.N(), class074382.method_73189());
                mutableInt.setValue(0);
                return true;
            }
            if (((class06289)((Object)((Object)((Object)class041282.y(class041392))))).y().method_19771((class00753)class074382.method_24515(), (double)n2)) {
                mutableInt.increment();
            }
            return true;
        });
    }

    public static class04142<class07438> N(int n, int n2) {
        int n3 = n * 20;
        return class04137.N_42(arg_0 -> class06301.N(new MutableInt(0), n3, n2, arg_0));
    }
}

