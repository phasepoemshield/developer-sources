/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  net.minecraft.class_4267
 *  net.minecraft.class_4267$class_4270
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Mutable
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import net.minecraft.class_4267;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4267.class})
public class bj {
    @Mutable
    @Final
    @Shadow
    static ThreadPoolExecutor field_19105;
    @Unique
    private static final int PINGER_THREAD_COUNT_OVERHEAD = 5;
    @Final
    @Shadow
    private List<class_4267.class_4270> field_19109;
    @Unique
    private static boolean threadpoolInitialized;

    @Inject(method={"method_20131"}, at={@At(value="HEAD")})
    private void updateEntriesInject(CallbackInfo ci2) {
        if (!threadpoolInitialized) {
            threadpoolInitialized = true;
            this.clearServerPingerThreadPool();
        }
        if (field_19105.getActiveCount() >= 5) {
            this.clearServerPingerThreadPool();
        }
    }

    @Unique
    private void clearServerPingerThreadPool() {
        field_19105.shutdownNow();
        field_19105 = new ScheduledThreadPoolExecutor(this.field_19109.size() + 5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
    }

    static {
        threadpoolInitialized = false;
    }
}

