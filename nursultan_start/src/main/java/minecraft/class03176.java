/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00394
 *  minecraft.class00570
 *  minecraft.class01296
 *  minecraft.class03498
 *  minecraft.class07209
 *  minecraft.class07299
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.blockview.client.RenderDataMapConsumer
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class00394;
import minecraft.class00570;
import minecraft.class01296;
import minecraft.class03150;
import minecraft.class03498;
import minecraft.class07209;
import minecraft.class07299;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.blockview.client.RenderDataMapConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class03176 {
    private final Long2ObjectMap<class03150> N = new Long2ObjectOpenHashMap();
    private static final AtomicInteger y = new AtomicInteger();
    private static final Logger L = LoggerFactory.getLogger(class03176.class);

    private void N(class07299 class072992, long l, CallbackInfoReturnable callbackInfoReturnable, LocalRef localRef, int n, int n2, int n3) {
        while (true) {
            try {
                localRef.set((Object)class03176.N(class072992.method_8497(n, n3), class01296.N((long)l), (Long2ObjectOpenHashMap)localRef.get()));
            }
            catch (ConcurrentModificationException concurrentModificationException) {
                int n4 = y.incrementAndGet();
                if (n4 > 5) continue;
                L.warn("[Block Entity Render Data] Encountered CME during render region build. A mod is accessing or changing chunk data outside the main thread. Retrying.", (Throwable)concurrentModificationException);
                if (n4 != 5) continue;
                L.info("[Block Entity Render Data] Subsequent exceptions will be suppressed.");
                continue;
            }
            break;
        }
    }

    private static Long2ObjectOpenHashMap N(class00570 class005702, class01296 class012962, Long2ObjectOpenHashMap long2ObjectOpenHashMap) {
        if (class005702.o().isEmpty()) {
            return long2ObjectOpenHashMap;
        }
        int n = class01296.L((int)(class012962.N() - 1));
        int n2 = class01296.L((int)(class012962.y() - 1));
        int n3 = class01296.L((int)(class012962.L() - 1));
        int n4 = class01296.L((int)(class012962.N() + 1));
        int n5 = class01296.L((int)(class012962.y() + 1));
        int n6 = class01296.L((int)(class012962.L() + 1));
        for (Map.Entry entry : class005702.o().entrySet()) {
            Object object;
            class07209 class072092 = (class07209)entry.getKey();
            if (class072092.method_10263() < n || class072092.method_10263() > n4 || class072092.method_10264() < n2 || class072092.method_10264() > n5 || class072092.method_10260() < n3 || class072092.method_10260() > n6 || (object = ((class00394)entry.getValue()).getRenderData()) == null) continue;
            if (long2ObjectOpenHashMap == null) {
                long2ObjectOpenHashMap = new Long2ObjectOpenHashMap();
            }
            long2ObjectOpenHashMap.put(class072092.method_10063(), object);
        }
        return long2ObjectOpenHashMap;
    }

    private void N(class07299 class072992, long l, CallbackInfoReturnable callbackInfoReturnable, LocalRef localRef) {
        class03498 class034982 = (class03498)callbackInfoReturnable.getReturnValue();
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = (Long2ObjectOpenHashMap)localRef.get();
        if (long2ObjectOpenHashMap != null) {
            ((RenderDataMapConsumer)class034982).fabric_acceptRenderDataMap((Long2ObjectMap)long2ObjectOpenHashMap);
        }
    }

    public class03498 N(class07299 class072992, long l) {
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init(null);
        int n = class01296.y((long)l);
        int n2 = class01296.L((long)l);
        int n3 = class01296.u((long)l);
        int n4 = n - 1;
        int n5 = n2 - 1;
        int n6 = n3 - 1;
        int n7 = n + 1;
        int n8 = n2 + 1;
        int n9 = n3 + 1;
        class03150[] class03150Array = new class03150[27];
        for (int i = n6; i <= n9; ++i) {
            for (int j = n5; j <= n8; ++j) {
                for (int k = n4; k <= n7; ++k) {
                    int n10 = class03498.N((int)n4, (int)n5, (int)n6, (int)k, (int)j, (int)i);
                    this.N(class072992, l, null, (LocalRef)localRefImpl, k, j, i);
                    class03150Array[n10] = this.N(class072992, k, j, i);
                }
            }
        }
        class03498 class034982 = new class03498(class072992, n4, n5, n6, class03150Array);
        this.N(class072992, l, new CallbackInfoReturnable("", false, (Object)class034982), (LocalRef)localRefImpl);
        return class034982;
    }

    private class03150 N(class07299 class072992, int n, int n2, int n3) {
        return (class03150)this.N.computeIfAbsent(class01296.y((int)n, (int)n2, (int)n3), l -> {
            class00570 class005702 = class072992.method_8497(n, n3);
            return new class03150(class005702, class005702.method_31603(n2));
        });
    }
}

