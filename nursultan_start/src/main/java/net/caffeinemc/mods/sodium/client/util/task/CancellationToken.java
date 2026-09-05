/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.task;

public interface CancellationToken {
    public boolean isCancelled();

    public void setCancelled();
}

