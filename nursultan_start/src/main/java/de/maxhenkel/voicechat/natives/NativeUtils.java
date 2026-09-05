/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.voicechat.natives.NativeUtils$SafeSupplier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class NativeUtils {
    @Nullable
    public static <T> T createSafe(NativeUtils$SafeSupplier<T> nativeUtils$SafeSupplier) {
        return NativeUtils.createSafe(nativeUtils$SafeSupplier, null);
    }

    @Nullable
    public static <T> T createSafe(NativeUtils$SafeSupplier<T> nativeUtils$SafeSupplier, @Nullable Consumer<Throwable> consumer) {
        return NativeUtils.createSafe(nativeUtils$SafeSupplier, consumer, 5000L);
    }

    @Nullable
    public static <T> T createSafe(NativeUtils$SafeSupplier<T> nativeUtils$SafeSupplier, @Nullable Consumer<Throwable> consumer, long l) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        Thread thread = new Thread(() -> {
            if (consumer != null) {
                Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> atomicReference.set(throwable));
            }
            try {
                atomicReference2.set(nativeUtils$SafeSupplier.get());
            }
            catch (Throwable throwable2) {
                atomicReference.set(throwable2);
            }
        }, "NativeInitializationThread");
        thread.start();
        try {
            thread.join(l);
        }
        catch (InterruptedException interruptedException) {
            return null;
        }
        Throwable throwable = (Throwable)atomicReference.get();
        if (consumer != null && throwable != null) {
            consumer.accept(throwable);
        }
        return (T)atomicReference2.get();
    }
}

