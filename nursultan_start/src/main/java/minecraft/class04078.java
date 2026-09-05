/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01099
 *  minecraft.class01155
 *  minecraft.class01171
 *  minecraft.class01190
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
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
import minecraft.class01155;
import minecraft.class01171;
import minecraft.class01190;
import minecraft.class04080;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04078
extends class00394
implements class01171<class04080>,
SleepingBlockEntity {
    private final class04080 N;
    private WrappedBlockEntityTickInvokerAccessor y = null;
    private class01099 L = null;

    public class04078(class07209 class072092, class00500 class005002) {
        super(class00404.field_37647, class072092, class005002);
        this.N = new class04080(class005002, (class01190)new class01155(class072092));
        this.N(class072092, class005002, null);
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class04078 class040782, CallbackInfo callbackInfo) {
        if (class040782.B().u().Z().isEmpty()) {
            ((SleepingBlockEntity)class040782).lithium$startSleeping();
        }
    }

    private void N(class08299 class082992, CallbackInfo callbackInfo) {
        if (!this.B().u().Z().isEmpty()) {
            this.wakeUpNow();
        }
    }

    private void N(class07209 class072092, class00500 class005002, CallbackInfo callbackInfo) {
        ((GameEventListenerWithCallback)this.N.u()).lithium$setGameEventCallback(() -> ((class04078)this).wakeUpNow());
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class04078 class040782) {
        class040782.N.u().N((class07284)class072992, class072092, class072992.method_8409(), true);
        class04078.N(class072992, class072092, class005002, class040782, null);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.N.y.N(class082992);
        this.N(class082992, null);
    }

    public class04080 B() {
        return this.N;
    }

    protected void N(class08329 class083292) {
        this.N.y.N(class083292);
        super.N(class083292);
    }

    public class01099 lithium$getSleepingTicker() {
        return this.L;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.y = wrappedBlockEntityTickInvokerAccessor;
        this.lithium$setSleepingTicker(null);
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.L = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.y;
    }
}

