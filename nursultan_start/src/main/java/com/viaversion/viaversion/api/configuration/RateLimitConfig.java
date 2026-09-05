/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.api.configuration;

public record RateLimitConfig(boolean enabled, int maxRate, String maxRateKickMessage, int warningRate, int maxWarnings, long trackingPeriodNanos, String warningKickMessage, String ratePlaceholder) {
}

