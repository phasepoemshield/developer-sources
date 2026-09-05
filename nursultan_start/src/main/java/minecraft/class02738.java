/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class06884
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 *  net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.HashSet;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class02761;
import minecraft.class06884;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;
import net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02738
extends class02761 {
    private int L(class07299 class072992, class07209 class072092) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072992, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        int n = this.N(class072992, class072092);
        if (n == 15) {
            return n;
        }
        return Math.max(n, this.y(class072992, class072092));
    }

    public class02738(class06884 class068842) {
        super(class068842);
    }

    @Override
    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class02733 class027332, boolean bl) {
        int n = this.L(class072992, class072092);
        if ((Integer)class005002.L((class08092)class06884.R) != n) {
            if (class072992.method_8320(class072092) == class005002) {
                class072992.method_8652(class072092, (class00500)class005002.y((class08092)class06884.R, (Comparable)Integer.valueOf(n)), 2);
            }
            HashSet hashSet = Sets.newHashSet();
            hashSet.add(class072092);
            for (class07211 class072112 : class07211.values()) {
                hashSet.add(class072092.method_10093(class072112));
            }
            for (class07209 class072093 : hashSet) {
                class072992.method_8408(class072093, (class00891)this.N);
            }
        }
    }

    private void N(class07299 class072992, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)RedstoneWirePowerCalculations.getNeighborSignal((class00891)this.N, (class02761)this, (class07299)class072992, (class07209)class072092, (boolean)false, (boolean)false));
    }
}

