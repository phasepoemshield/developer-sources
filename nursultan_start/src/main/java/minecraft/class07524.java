/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.jtracy.TracyClient;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

class class07524
extends ForkJoinWorkerThread {
    final /* synthetic */ String N;
    final /* synthetic */ String y;

    class07524(ForkJoinPool forkJoinPool, String string, String string2) {
        this.N = string;
        this.y = string2;
        super(forkJoinPool);
    }

    @Override
    protected void onStart() {
        TracyClient.setThreadName((String)this.N, (int)this.y.hashCode());
        super.onStart();
    }

    @Override
    protected void onTermination(@Nullable Throwable throwable) {
        if (throwable != null) {
            class07536.N.warn("{} died", (Object)this.getName(), (Object)throwable);
        } else {
            class07536.N.debug("{} shutdown", (Object)this.getName());
        }
        super.onTermination(throwable);
    }
}

