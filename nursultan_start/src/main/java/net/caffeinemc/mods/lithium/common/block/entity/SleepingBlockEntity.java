/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class01099
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 */
package net.caffeinemc.mods.lithium.common.block.entity;

import minecraft.class00394;
import minecraft.class01099;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.block.entity.SleepUntilTimeBlockEntityTickInvoker;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity$1;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;

public interface SleepingBlockEntity {
    public static final class01099 SLEEPING_BLOCK_ENTITY_TICKER = new SleepingBlockEntity$1();

    public class01099 lithium$getSleepingTicker();

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1);

    public void lithium$setSleepingTicker(class01099 var1);

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper();

    default public void sleepOnlyCurrentTick() {
        class01099 class010992 = this.lithium$getSleepingTicker();
        WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor = this.lithium$getTickWrapper();
        if (class010992 == null) {
            class010992 = wrappedBlockEntityTickInvokerAccessor.getWrapped();
        }
        class07299 class072992 = ((class00394)this).G();
        wrappedBlockEntityTickInvokerAccessor.callSetWrapped((class01099)new SleepUntilTimeBlockEntityTickInvoker((class00394)this, class072992.N() + 1L, class010992));
        this.lithium$setSleepingTicker(null);
    }

    default public boolean isSleeping() {
        return this.lithium$getSleepingTicker() != null;
    }

    default public void wakeUpNow() {
        class01099 class010992 = this.lithium$getSleepingTicker();
        if (class010992 == null) {
            return;
        }
        this.setTicker(class010992);
        this.lithium$setSleepingTicker(null);
    }

    default public void setTicker(class01099 class010992) {
        WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor = this.lithium$getTickWrapper();
        if (wrappedBlockEntityTickInvokerAccessor == null) {
            return;
        }
        wrappedBlockEntityTickInvokerAccessor.callSetWrapped(class010992);
    }

    default public boolean lithium$startSleeping() {
        if (this.isSleeping()) {
            return false;
        }
        WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor = this.lithium$getTickWrapper();
        if (wrappedBlockEntityTickInvokerAccessor == null) {
            return false;
        }
        this.lithium$setSleepingTicker(wrappedBlockEntityTickInvokerAccessor.getWrapped());
        wrappedBlockEntityTickInvokerAccessor.callSetWrapped(SLEEPING_BLOCK_ENTITY_TICKER);
        return true;
    }
}

