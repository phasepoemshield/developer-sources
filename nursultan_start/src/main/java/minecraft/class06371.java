/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01099
 *  minecraft.class01157
 *  minecraft.class01171
 *  minecraft.class03481
 *  minecraft.class03485
 *  minecraft.class03502
 *  minecraft.class03508
 *  minecraft.class07209
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01099;
import minecraft.class01157;
import minecraft.class01171;
import minecraft.class03481;
import minecraft.class03485;
import minecraft.class03502;
import minecraft.class03508;
import minecraft.class07209;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06371
extends class00394
implements class01171<class03485>,
class03502,
SleepingBlockEntity {
    private static final int N = 0;
    private class03508 y;
    private final class03485 L;
    private final class03481 u = this.N();
    private int i = 0;
    private WrappedBlockEntityTickInvokerAccessor R = null;
    private class01099 M = null;

    public class03508 L() {
        return this.y;
    }

    public class03485 B() {
        return this.L;
    }

    protected class06371(class00404<?> class004042, class07209 class072092, class00500 class005002) {
        super(class004042, class072092, class005002);
        this.y = new class03508();
        this.L = new class03485((class03502)this);
        this.N(class004042, class072092, class005002, null);
    }

    public class06371(class07209 class072092, class00500 class005002) {
        this(class00404.field_28117, class072092, class005002);
    }

    public class03481 u() {
        return this.u;
    }

    public void N(int n) {
        this.i = n;
    }

    private void N(class08299 class082992, CallbackInfo callbackInfo) {
        if (this.y.N().N(Long.MAX_VALUE).isPresent()) {
            this.wakeUpNow();
        }
    }

    private void N(class00404 class004042, class07209 class072092, class00500 class005002, CallbackInfo callbackInfo) {
        ((GameEventListenerWithCallback)this.L).lithium$setGameEventCallback(() -> ((class06371)this).wakeUpNow());
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.i = class082992.N("last_vibration_frequency", 0);
        this.y = class082992.N("listener", class03508.N).orElseGet(class03508::new);
        this.N(class082992, null);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("last_vibration_frequency", this.i);
        class083292.N("listener", class03508.N, (Object)this.y);
    }

    public class03481 N() {
        return new class01157(this, this.d());
    }

    public class01099 lithium$getSleepingTicker() {
        return this.M;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.R = wrappedBlockEntityTickInvokerAccessor;
        this.lithium$setSleepingTicker(null);
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.M = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.R;
    }

    public int R() {
        return this.i;
    }
}

