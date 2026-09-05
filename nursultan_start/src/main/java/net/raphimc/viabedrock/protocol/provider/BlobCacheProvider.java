/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.providers.Provider
 */
package net.raphimc.viabedrock.protocol.provider;

import com.viaversion.viaversion.api.platform.providers.Provider;

public abstract class BlobCacheProvider
implements Provider {
    public abstract boolean hasBlob(long var1);

    public abstract void addBlob(long var1, byte[] var3);

    public abstract byte[] getBlob(long var1);
}

