/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.jtracy.Zone
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07529
 */
package minecraft;

import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import minecraft.class07529;

public final class class08717
extends Record
implements Executor {
    private final ExecutorService service;

    public class08717(ExecutorService executorService) {
        this.service = executorService;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08717.class, "service", "service"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08717.class, "service", "service"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08717.class, "service", "service"}, this);
    }

    @Override
    public void execute(Runnable runnable) {
        this.service.execute(class08717.N(runnable));
    }

    public Executor N(String string) {
        if (class07529.ND) {
            return runnable -> this.service.execute(() -> {
                Thread thread = Thread.currentThread();
                String string2 = thread.getName();
                thread.setName(string);
                try (Zone zone = TracyClient.beginZone((String)string, (boolean)class07529.ND);){
                    runnable.run();
                }
                finally {
                    thread.setName(string2);
                }
            });
        }
        if (TracyClient.isAvailable()) {
            return runnable -> this.service.execute(() -> {
                try (Zone zone = TracyClient.beginZone((String)string, (boolean)class07529.ND);){
                    runnable.run();
                }
            });
        }
        return this.service;
    }

    public void N(long l, TimeUnit timeUnit) {
        boolean bl;
        this.service.shutdown();
        try {
            bl = this.service.awaitTermination(l, timeUnit);
        }
        catch (InterruptedException interruptedException) {
            bl = false;
        }
        if (!bl) {
            this.service.shutdownNow();
        }
    }

    public ExecutorService N() {
        return this.service;
    }

    private static Runnable N(Runnable runnable) {
        if (!TracyClient.isAvailable()) {
            return runnable;
        }
        return () -> {
            try (Zone zone = TracyClient.beginZone((String)"task", (boolean)class07529.ND);){
                runnable.run();
            }
        };
    }
}

