/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.map;

public interface ClientChunkEventListener {
    public void onChunkStatusAdded(int var1, int var2, int var3);

    public void updateMapCenter(int var1, int var2);

    public void updateLoadDistance(int var1);

    public void onChunkStatusRemoved(int var1, int var2, int var3);
}

