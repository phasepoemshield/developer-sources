/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10191
 *  com.mojang.datafixers.util.Either
 *  minecraft.class03375
 *  minecraft.class03377
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10191;
import com.mojang.datafixers.util.Either;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import minecraft.class03375;
import minecraft.class03377;
import minecraft.class03390;
import org.jspecify.annotations.Nullable;

public class class03416<T> {
    private final String L;
    private final Callable<T> u;
    private final long i;
    private final class03375 R;
    private @Nullable CompletableFuture<class10191<T>> M;
    @Nullable class03390<T> N;
    private long B = -1L;
    final /* synthetic */ class03377 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03416(class03377 class033772, String string, Callable callable, long l, class03375 class033752) {
        this.y = class033772;
        this.L = string;
        this.u = callable;
        this.i = l;
        this.R = class033752;
    }

    void N(long l) {
        if (this.M != null) {
            class10191 class101912 = this.M.getNow(null);
            if (class101912 == null) {
                return;
            }
            this.M = null;
            long l2 = class101912.y();
            class101912.N().ifLeft(object -> {
                this.N = new class03390<Object>(object, l2);
                this.B = l2 + this.i * this.R.N();
            }).ifRight(exception -> {
                long l2 = this.R.y();
                class03377.N.warn("Failed to process task {}, will repeat after {} cycles", new Object[]{this.L, l2, exception});
                this.B = l2 + this.i * l2;
            });
        }
        if (this.B <= l) {
            this.M = CompletableFuture.supplyAsync(() -> {
                try {
                    T t = this.u.call();
                    long l = this.y.u.get(this.y.L);
                    return new class10191(Either.left(t), l);
                }
                catch (Exception exception) {
                    long l = this.y.u.get(this.y.L);
                    return new class10191(Either.right((Object)exception), l);
                }
            }, this.y.y);
        }
    }

    public void N() {
        this.M = null;
        this.N = null;
        this.B = -1L;
    }
}

