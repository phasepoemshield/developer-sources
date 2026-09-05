/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00517
 *  minecraft.class00734
 *  minecraft.class00742
 *  minecraft.class02678
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06581
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08400
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant
 *  net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes
 *  net.fabricmc.fabric.impl.transfer.fluid.FluidVariantCache
 *  net.fabricmc.fabric.impl.transfer.fluid.FluidVariantImpl
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00517;
import minecraft.class00734;
import minecraft.class00742;
import minecraft.class02678;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class04206;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06581;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08400;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import net.fabricmc.fabric.impl.transfer.fluid.FluidVariantCache;
import net.fabricmc.fabric.impl.transfer.fluid.FluidVariantImpl;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class04651
implements FluidVariantCache {
    public static final class00742<class04688> L = new class00742();
    protected final class00507<class04651, class04688> u;
    private class04688 N;
    private final class03529<class04651> y;
    private final FluidVariant i = new FluidVariantImpl(this, class02678.N);

    public abstract float L();

    public abstract boolean L(class04688 var1);

    public @Nullable class00734 L(class04688 class046882, class07290 class072902, class07209 class072092) {
        if (this.y()) {
            return null;
        }
        float f = class046882.N(class072902, class072092);
        return new class00734((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), (double)class072092.method_10263() + 1.0, (double)((float)class072092.method_10264() + f), (double)class072092.method_10260() + 1.0);
    }

    public final class04688 M() {
        return this.N;
    }

    public class04651() {
        this.y = class04206.L.R((Object)this);
        class00517 class005172 = new class00517((Object)this);
        this.N((class00517<class04651, class04688>)class005172);
        this.u = class005172.N(class04651::M, class04688::new);
        this.R((class04688)this.u.y());
    }

    public @Nullable class07126 B() {
        return null;
    }

    public boolean Z() {
        return false;
    }

    @Deprecated
    public class03529<class04651> U() {
        return this.y;
    }

    public Optional<class04891> z() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (Optional)callbackInfoReturnable.getReturnValue();
        }
        return Optional.empty();
    }

    public abstract int u(class04688 var1);

    public abstract class00500 y(class04688 var1);

    public boolean y() {
        return false;
    }

    public abstract class00494 y(class04688 var1, class07290 var2, class07209 var3);

    public void y(class04782 class047822, class07209 class072092, class00500 class005002, class04688 class046882) {
    }

    @Deprecated
    public boolean N(class03530<class04651> class035302) {
        return this.y.N(class035302);
    }

    public boolean N(class04651 class046512) {
        return class046512 == this;
    }

    public void N(CallbackInfoReturnable callbackInfoReturnable) {
        class04651 class046512 = this;
        Optional optional = FluidVariantAttributes.getHandlerOrDefault((class04651)class046512).getFillSound(FluidVariant.of((class04651)class046512));
        if (optional.isPresent()) {
            callbackInfoReturnable.setReturnValue((Object)optional);
        }
    }

    public void N(class07299 class072992, class07209 class072092, class04688 class046882, class06069 class060692) {
    }

    public abstract class06581 N();

    protected void N(class00517<class04651, class04688> class005172) {
    }

    public abstract float N(class04688 var1, class07290 var2, class07209 var3);

    public abstract boolean N(class04688 var1, class07290 var2, class07209 var3, class04651 var4, class07211 var5);

    public abstract int N(class05487 var1);

    public abstract class06889 N(class07290 var1, class07209 var2, class04688 var3);

    public void N(class04782 class047822, class07209 class072092, class04688 class046882, class06069 class060692) {
    }

    public void N(class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002) {
    }

    public abstract float N(class04688 var1);

    protected final void R(class04688 class046882) {
        this.N = class046882;
    }

    public class00507<class04651, class04688> R() {
        return this.u;
    }

    public FluidVariant fabric_getCachedFluidVariant() {
        return this.i;
    }
}

