/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.protocol.provider.impl;

import net.raphimc.viabedrock.protocol.provider.BlobCacheProvider;

public class NoOpBlobCacheProvider
extends BlobCacheProvider {
    @Override
    public boolean hasBlob(long hash) {
        return false;
    }

    @Override
    public void addBlob(long hash, byte[] blob) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] getBlob(long hash) {
        throw new UnsupportedOperationException();
    }
}

