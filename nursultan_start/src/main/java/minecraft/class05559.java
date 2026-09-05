/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class07080
 *  minecraft.class07878
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class07080;
import minecraft.class07878;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05559 {
    private static final Logger N = LogUtils.getLogger();
    private final String y;
    private final Semaphore L = new Semaphore(1);
    private final Lock u = new ReentrantLock();
    private volatile @Nullable Thread i;
    private volatile @Nullable class07878 R;

    public class05559(String string) {
        this.y = string;
    }

    public void y() {
        try {
            this.u.lock();
            Thread thread = this.i;
            if (thread != null) {
                class07878 class078782;
                this.R = class078782 = class05559.N(this.y, thread);
                this.L.release();
                throw class078782;
            }
            this.L.release();
        }
        finally {
            this.u.unlock();
        }
    }

    public static class07878 N(String string, @Nullable Thread thread) {
        String string2 = Stream.of(Thread.currentThread(), thread).filter(Objects::nonNull).map(class05559::N).collect(Collectors.joining("\n"));
        String string3 = "Accessing " + string + " from multiple threads";
        class07080 class070802 = new class07080(string3, (Throwable)new IllegalStateException(string3));
        class070802.N("Thread dumps").N("Thread dumps", (Object)string2);
        N.error("Thread dumps: \n{}", (Object)string2);
        return new class07878(class070802);
    }

    private static String N(Thread thread) {
        return thread.getName() + ": \n\tat " + Arrays.stream(thread.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat "));
    }

    public void N() {
        block6: {
            boolean bl = false;
            try {
                this.u.lock();
                if (this.L.tryAcquire()) break block6;
                this.i = Thread.currentThread();
                bl = true;
                this.u.unlock();
                try {
                    this.L.acquire();
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw this.R;
            }
            finally {
                if (!bl) {
                    this.u.unlock();
                }
            }
        }
    }
}

