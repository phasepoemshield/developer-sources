/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01099
 *  minecraft.class01114
 *  minecraft.class01142
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class08036
 *  minecraft.class08978
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01099;
import minecraft.class01114;
import minecraft.class01142;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07250;
import minecraft.class07274;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08978;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07281
extends class00394
implements class07274,
SleepingBlockEntity {
    private final class01142 N = new class01142();
    private final class01114 y = new class07250(this);
    private WrappedBlockEntityTickInvokerAccessor L = null;
    private class01099 u = null;

    private void L() {
        if (this.N(0.0f) == this.N(1.0f)) {
            this.lithium$startSleeping();
        }
    }

    public class07281(class07209 class072092, class00500 class005002) {
        super(class00404.field_11901, class072092, class005002);
    }

    public void y(class08978 class089782) {
        if (!this.E && !class089782.aB_().method_7325()) {
            this.y.N(class089782.aB_(), this.G(), this.d(), this.w());
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07281 class072812) {
        class072812.N.N();
        class07281.N(class072992, class072092, class005002, class072812, null);
    }

    @Override
    public float N(float f) {
        return this.N.N(f);
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07281 class072812, CallbackInfo callbackInfo) {
        class072812.L();
    }

    private void N(int n, int n2, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.u != null) {
            this.wakeUpNow();
        }
    }

    public boolean N(int n, int n2) {
        if (n == 1) {
            boolean bl = n2 > 0;
            this.N(n, n2, null);
            this.N.N(bl);
            return true;
        }
        return super.N(n, n2);
    }

    public void N(class08978 class089782) {
        if (!this.E && !class089782.aB_().method_7325()) {
            this.y.N(class089782.aB_(), this.G(), this.d(), this.w(), class089782.method_72381());
        }
    }

    public void N() {
        if (!this.E) {
            this.y.L(this.G(), this.d(), this.w());
        }
    }

    public boolean N(class08036 class080362) {
        return class06695.N((class00394)this, (class08036)class080362);
    }

    public class01099 lithium$getSleepingTicker() {
        return this.u;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.L = wrappedBlockEntityTickInvokerAccessor;
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.u = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.L;
    }
}

