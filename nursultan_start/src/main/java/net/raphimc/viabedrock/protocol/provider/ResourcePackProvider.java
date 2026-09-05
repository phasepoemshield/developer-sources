/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.providers.Provider
 */
package net.raphimc.viabedrock.protocol.provider;

import com.viaversion.viaversion.api.platform.providers.Provider;
import net.raphimc.viabedrock.api.resourcepack.ResourcePack;

public abstract class ResourcePackProvider
implements Provider {
    public abstract boolean has(ResourcePack.Key var1);

    public abstract ResourcePack load(ResourcePack.Key var1) throws Exception;

    public abstract void save(ResourcePack var1) throws Exception;
}

