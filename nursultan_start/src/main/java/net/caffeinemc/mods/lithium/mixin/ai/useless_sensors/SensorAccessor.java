/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.mixin.ai.useless_sensors;

public interface SensorAccessor {
    public long getLastSenseTime();

    public int getSenseInterval();

    public void setLastSenseTime(long var1);
}

