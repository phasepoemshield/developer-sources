/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.debug;

import java.util.concurrent.ConcurrentHashMap;

public class CooldownTimer {
    private static ConcurrentHashMap<String, Long> cooldowns = new ConcurrentHashMap();

    public static void run(String string, long l, Runnable runnable) {
        if (System.currentTimeMillis() - cooldowns.getOrDefault(string, 0L) > l) {
            cooldowns.put(string, System.currentTimeMillis());
            runnable.run();
        }
    }

    public static void run(String string, Runnable runnable) {
        CooldownTimer.run(string, 10000L, runnable);
    }
}

