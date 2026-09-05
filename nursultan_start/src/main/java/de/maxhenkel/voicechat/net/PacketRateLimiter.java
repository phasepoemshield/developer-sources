/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.PacketRateLimiter$RateLimiter;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class04770;

public class PacketRateLimiter {
    private final ConcurrentHashMap<UUID, PacketRateLimiter$RateLimiter> rateLimiters = new ConcurrentHashMap();
    private final int maxPacketsPerSecond;
    private final int timeWindowSeconds;

    public PacketRateLimiter(int n) {
        this.timeWindowSeconds = 5;
        this.maxPacketsPerSecond = n;
    }

    public boolean allow(UUID uUID2) {
        if (this.maxPacketsPerSecond <= 0) {
            return true;
        }
        PacketRateLimiter$RateLimiter packetRateLimiter$RateLimiter = this.rateLimiters.computeIfAbsent(uUID2, uUID -> new PacketRateLimiter$RateLimiter(this.maxPacketsPerSecond * 5, 5000L));
        return packetRateLimiter$RateLimiter.tryAcquire();
    }

    public void onPlayerLoggedOut(class04770 class047702) {
        this.rateLimiters.remove(class047702.method_5667());
    }
}

