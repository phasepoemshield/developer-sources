/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  minecraft.class00189
 *  minecraft.class00909
 *  minecraft.class01631
 *  minecraft.class01894
 *  minecraft.class02689
 *  minecraft.class03359
 *  minecraft.class07311
 *  minecraft.class07907
 *  minecraft.class07922
 *  minecraft.class07923
 *  minecraft.class08555
 *  minecraft.class08627
 */
package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import minecraft.class00189;
import minecraft.class00909;
import minecraft.class01631;
import minecraft.class01894;
import minecraft.class02689;
import minecraft.class03359;
import minecraft.class07311;
import minecraft.class07907;
import minecraft.class07922;
import minecraft.class07923;
import minecraft.class08555;
import minecraft.class08627;

public class class07949 {
    public static final class07311 N = class07949.N(class00189.y());
    public static final Duration y = Duration.ofMinutes(5L);
    private final LoadingCache<class02689, CompletableFuture<Optional<class07923>>> R = CacheBuilder.newBuilder().expireAfterAccess(y).build((CacheLoader)new class07922(this));
    private final LoadingCache<class02689, class07923> M = CacheBuilder.newBuilder().expireAfterAccess(y).build((CacheLoader)new class07907(this));
    final class08627 L;
    final class08555 u;
    final class00909 i;

    public CompletableFuture<Optional<class07923>> L(class02689 class026892) {
        return (CompletableFuture)this.R.getUnchecked((Object)class026892);
    }

    public class07949(class08627 class086272, class08555 class085552, class00909 class009092) {
        this.L = class086272;
        this.u = class085552;
        this.i = class009092;
    }

    public Supplier<class07923> y(class02689 class026892) {
        class07923 class079232 = (class07923)this.M.getUnchecked((Object)class026892);
        CompletableFuture var3 = (CompletableFuture)this.R.getUnchecked((Object)class026892);
        Optional var4 = var3.getNow(null);
        if (var4 != null) {
            return () -> class07949.N(var4.orElse(class079232));
        }
        return () -> var3.getNow(Optional.empty()).orElse(class079232);
    }

    static class07311 N(class01631 class016312) {
        return class03359.N((class01894)class016312.N().y());
    }

    private static /* synthetic */ class07923 N(class07923 class079232) {
        return class079232;
    }

    public class07923 N(class02689 class026892) {
        class07923 class079232 = this.L(class026892).getNow(Optional.empty()).orElse(null);
        if (class079232 != null) {
            return class079232;
        }
        return (class07923)this.M.getUnchecked((Object)class026892);
    }
}

