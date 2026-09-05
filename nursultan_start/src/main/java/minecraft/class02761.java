/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class06884
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 *  net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class06884;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;
import net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class02761 {
    protected final class06884 N;

    protected class02761(class06884 class068842) {
        this.N = class068842;
    }

    protected int y(class07299 class072992, class07209 class072092) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072992, class072092, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        int n = 0;
        for (class07211 class072112 : class07221.field_11062) {
            class07209 class072093;
            class07209 class072094 = class072092.method_10093(class072112);
            class00500 class005002 = class072992.method_8320(class072094);
            n = Math.max(n, this.N(class072094, class005002));
            class07209 class072095 = class072092.method_10084();
            if (class005002.u((class07290)class072992, class072094) && !class072992.method_8320(class072095).u((class07290)class072992, class072095)) {
                class072093 = class072094.method_10084();
                n = Math.max(n, this.N(class072093, class072992.method_8320(class072093)));
                continue;
            }
            if (class005002.u((class07290)class072992, class072094)) continue;
            class072093 = class072094.method_10074();
            n = Math.max(n, this.N(class072093, class072992.method_8320(class072093)));
        }
        return Math.max(0, n - 1);
    }

    private void N(class07299 class072992, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)RedstoneWirePowerCalculations.getNeighborWireSignal((class00891)this.N, (class02761)this, (class07299)class072992, (class07209)class072092));
    }

    public int N(class07209 class072092, class00500 class005002) {
        return class005002.N((class00891)this.N) ? (Integer)class005002.L((class08092)class06884.R) : 0;
    }

    protected int N(class07299 class072992, class07209 class072092) {
        return this.N.N(class072992, class072092);
    }

    public abstract void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class02733 var4, boolean var5);
}

