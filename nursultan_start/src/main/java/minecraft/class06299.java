/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00002
 *  minecraft.class01894
 *  minecraft.class02857
 *  minecraft.class04965
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import minecraft.class00002;
import minecraft.class01894;
import minecraft.class02857;
import minecraft.class04965;
import minecraft.class06304;
import minecraft.class06312;
import minecraft.class06322;
import minecraft.class07536;

public class class06299 {
    private final class02857 N;
    private final Map<class01894, CompletableFuture<class06312>> y = Maps.newHashMap();

    public class06299(class02857 class028572) {
        this.N = class028572;
    }

    public CompletableFuture<class06304> N(class01894 class018942, boolean bl) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                InputStream inputStream = this.N.u(class018942);
                return bl ? new class04965(class06322::new, inputStream) : new class06322(inputStream);
            }
            catch (IOException iOException) {
                throw new CompletionException(iOException);
            }
        }, (Executor)class07536.z());
    }

    public void N() {
        this.y.values().forEach(completableFuture -> completableFuture.thenAccept(class06312::y));
        this.y.clear();
    }

    public CompletableFuture<?> N(Collection<class00002> collection) {
        return CompletableFuture.allOf((CompletableFuture[])collection.stream().map(class000022 -> this.N(class000022.y())).toArray(CompletableFuture[]::new));
    }

    public CompletableFuture<class06312> N(class01894 class018943) {
        return this.y.computeIfAbsent(class018943, class018942 -> CompletableFuture.supplyAsync(() -> {
            try (InputStream inputStream = this.N.u(class018942);){
                class06312 class063122;
                try (class06322 class063222 = new class06322(inputStream);){
                    ByteBuffer byteBuffer = class063222.y();
                    class063122 = new class06312(byteBuffer, class063222.N());
                }
                return class063122;
            }
            catch (IOException iOException) {
                throw new CompletionException(iOException);
            }
        }, (Executor)class07536.z()));
    }
}

