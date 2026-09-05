/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

public interface UploadResourceBudget {
    public void consume(long var1, long var3);

    public boolean isAvailable();
}

