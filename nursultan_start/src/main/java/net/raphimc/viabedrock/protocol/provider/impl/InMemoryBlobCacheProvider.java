/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.protocol.provider.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.raphimc.viabedrock.protocol.provider.BlobCacheProvider;

public class InMemoryBlobCacheProvider
extends BlobCacheProvider {
    private final Map<Long, byte[]> blobs = new ConcurrentHashMap<Long, byte[]>();

    @Override
    public boolean hasBlob(long hash) {
        return this.blobs.containsKey(hash);
    }

    @Override
    public void addBlob(long hash, byte[] blob) {
        this.blobs.put(hash, blob);
    }

    @Override
    public byte[] getBlob(long hash) {
        return this.blobs.get(hash);
    }
}

