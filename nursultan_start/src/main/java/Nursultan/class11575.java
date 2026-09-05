/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11472
 *  Nursultan.class11938
 *  fun.crashsystem.jdrpc.DiscordIPC
 *  fun.crashsystem.jdrpc.DiscordIPCConfig
 *  fun.crashsystem.jdrpc.activity.Activity$Builder
 *  fun.crashsystem.jdrpc.activity.ActivityType
 *  fun.crashsystem.jdrpc.entity.DiscordBuild
 *  fun.crashsystem.jdrpc.event.DiscordEventListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11472;
import Nursultan.class11558;
import Nursultan.class11938;
import fun.crashsystem.jdrpc.DiscordIPC;
import fun.crashsystem.jdrpc.DiscordIPCConfig;
import fun.crashsystem.jdrpc.activity.Activity;
import fun.crashsystem.jdrpc.activity.ActivityType;
import fun.crashsystem.jdrpc.entity.DiscordBuild;
import fun.crashsystem.jdrpc.event.DiscordEventListener;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11575 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;

    public void L() {
        if (!((AtomicBoolean)this.y_2).compareAndSet(false, true)) {
            return;
        }
        ((ScheduledExecutorService)this.y_4).shutdownNow();
        try {
            ((DiscordIPC)this.y_3).close();
        }
        catch (Exception exception) {
            ((Logger)N_0).warn("Failed to close Discord RPC: {}", (Object)exception.getMessage());
        }
    }

    public class11575() {
        this.W();
        this.y_0 = new AtomicBoolean(false);
        this.y_1 = new AtomicBoolean(false);
        this.y_2 = new AtomicBoolean(false);
        this.y_3 = DiscordIPC.create((DiscordIPCConfig)DiscordIPCConfig.builder().clientId(1228305955943612468L).reconnectBaseDelayMs(30000L).reconnectMaxDelayMs(30000L).preferredBuilds(List.of(DiscordBuild.ANY)).reconnect(true).build());
        this.y_4 = Executors.newSingleThreadScheduledExecutor(runnable -> {
            Thread thread = new Thread(runnable, "DiscordActivity-Retry");
            thread.setDaemon(true);
            return thread;
        });
        ((DiscordIPC)this.y_3).addListener((DiscordEventListener)new class11558(this));
        this.E();
    }

    static {
        class11575.Z();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void Z() {
        N_0 = null;
        N_1 = 30L;
        N_2 = 1228305955943612468L;
    }

    private void z() {
        if (((AtomicBoolean)this.y_2).get()) {
            return;
        }
        try {
            ((ScheduledExecutorService)this.y_4).schedule(this::E, 30L, TimeUnit.SECONDS);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void y() {
        ((AtomicBoolean)this.y_0).set(false);
        if (((DiscordIPC)this.y_3).isConnected()) {
            try {
                ((DiscordIPC)this.y_3).clearActivityAsync();
            }
            catch (Exception exception) {
                ((Logger)N_0).warn("Failed to clear RPC: {}", (Object)exception.getMessage());
            }
        }
    }

    private void E() {
        if (((AtomicBoolean)this.y_2).get()) {
            return;
        }
        if (!((AtomicBoolean)this.y_1).compareAndSet(false, true)) {
            return;
        }
        ((DiscordIPC)this.y_3).connectAsync().whenComplete((void_, throwable) -> {
            ((AtomicBoolean)this.y_1).set(false);
            if (((AtomicBoolean)this.y_2).get()) {
                return;
            }
            if (throwable != null) {
                this.z();
            }
        });
    }

    public void N() {
        ((AtomicBoolean)this.y_0).set(true);
        if (((DiscordIPC)this.y_3).isConnected()) {
            this.R();
        }
    }

    private void W() {
    }

    void R() {
        if (((AtomicBoolean)this.y_2).get()) {
            return;
        }
        try {
            long l = (System.currentTimeMillis() - ManagementFactory.getRuntimeMXBean().getUptime()) / 1000L;
            ((DiscordIPC)this.y_3).setActivityAsync(new Activity.Builder().setType(ActivityType.PLAYING).setState("UID: " + ((class11472)class11938.L_2).M()).setDetails("Build: 1.21.11").setStartTimestamp(l).setLargeImage("https://github.com/CrashSystemZ/nursultan-gif/blob/main/RPC.gif?raw=true", ((class11472)class11938.L_2).Z()).addButton("Website", "https://nursultan.fun").addButton("News", "https://t.me/nursultan_mc").build());
        }
        catch (Exception exception) {
            ((Logger)N_0).warn("Failed to set RPC activity: {}", (Object)exception.getMessage());
        }
    }
}

