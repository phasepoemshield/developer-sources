/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11423
 *  io.netty.channel.Channel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11423;
import Nursultan.class11876;
import Nursultan.class11880;
import io.netty.channel.Channel;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11841 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public static Object y_0;

    private void L() {
    }

    public class11841(class11880 class118802, class11423 class114232, class11876 class118762, AtomicBoolean atomicBoolean) {
        this.L();
        this.N_0 = class118802;
        this.N_1 = class114232;
        this.N_2 = class118762;
        this.N_3 = atomicBoolean;
    }

    static {
        class11841.B();
        y_0 = LogManager.getLogger(String.class);
    }

    private static void B() {
        y_0 = null;
    }

    public CompletableFuture<Void> y() {
        ((AtomicBoolean)this.N_3).set(false);
        ((class11423)this.N_1).i();
        Channel channel = ((class11880)this.N_0).N();
        ((class11880)this.N_0).y();
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if (channel == null) {
            this.N(completableFuture);
            return completableFuture;
        }
        (channel.isOpen() ? channel.close() : channel.newSucceededFuture()).addListener(future -> this.N(completableFuture));
        return completableFuture;
    }

    private void N(CompletableFuture<Void> completableFuture) {
        ((class11876)this.N_2).N().whenComplete((void_, throwable) -> {
            if (throwable == null) {
                completableFuture.complete(null);
            } else {
                completableFuture.completeExceptionally((Throwable)throwable);
            }
        });
    }

    public void N() {
        try {
            this.y().join();
        }
        catch (CompletionException completionException) {
            ((Logger)y_0).error("Error during shutdown", completionException.getCause());
        }
    }
}

