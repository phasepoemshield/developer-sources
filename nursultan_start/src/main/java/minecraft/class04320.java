/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.logging.LogUtils
 *  minecraft.class00751
 *  minecraft.class03238
 *  minecraft.class04782
 *  minecraft.class05946
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import minecraft.class00751;
import minecraft.class03238;
import minecraft.class04227;
import minecraft.class04301;
import minecraft.class04313;
import minecraft.class04318;
import minecraft.class04336;
import minecraft.class04782;
import minecraft.class05946;
import org.slf4j.Logger;

public class class04320 {
    private static final Logger N = LogUtils.getLogger();
    private static final LoadingCache<class04782, class04313> y = CacheBuilder.newBuilder().weakKeys().expireAfterAccess(5L, TimeUnit.MINUTES).build((CacheLoader)new class04301());

    public static void y() {
        N.debug("Logging feature counts:");
        y.asMap().forEach((class047822, class043132) -> {
            String string = class047822.method_27983().N().toString();
            boolean bl = class047822.method_8503().Nj();
            class00751 class007512 = class047822.method_30349().L(class04227.ys);
            String string2 = (bl ? "running" : "dead") + " " + string;
            int n = class043132.y().intValue();
            N.debug("{} total_chunks: {}", (Object)string2, (Object)n);
            class043132.N().forEach((class043182, n2) -> {
                Object[] objectArray = new Object[6];
                objectArray[0] = string2;
                objectArray[1] = String.format(Locale.ROOT, "%10d", n2);
                objectArray[2] = String.format(Locale.ROOT, "%10f", (double)n2 / (double)n);
                objectArray[3] = class043182.y().flatMap(arg_0 -> ((class00751)class007512).u(arg_0)).map(class05946::N);
                objectArray[4] = class043182.N().y();
                objectArray[5] = class043182.N();
                N.debug("{} {} {} {} {} {}", objectArray);
            });
        });
    }

    public static void N(class04782 class047822, class03238<?, ?> class032382, Optional<class04336> optional) {
        try {
            ((class04313)((Object)y.get((Object)class047822))).N().computeInt((Object)new class04318(class032382, optional), (class043182, n) -> n == null ? 1 : n + 1);
        }
        catch (Exception exception) {
            N.error("Failed to increment feature count", (Throwable)exception);
        }
    }

    public static void N(class04782 class047822) {
        try {
            ((class04313)((Object)y.get((Object)class047822))).y().increment();
        }
        catch (Exception exception) {
            N.error("Failed to increment chunk count", (Throwable)exception);
        }
    }

    public static void N() {
        y.invalidateAll();
        N.debug("Cleared feature counts");
    }
}

