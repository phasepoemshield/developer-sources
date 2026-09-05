/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.api.resourcepack.ResourcePack
 *  net.raphimc.viabedrock.api.resourcepack.ResourcePack$Key
 *  net.raphimc.viabedrock.protocol.provider.ResourcePackProvider
 */
package net.raphimc.viabedrock.protocol.provider.impl;

import net.raphimc.viabedrock.api.resourcepack.ResourcePack;
import net.raphimc.viabedrock.protocol.provider.ResourcePackProvider;

public class NoOpResourcePackProvider
extends ResourcePackProvider {
    public boolean has(ResourcePack.Key key) {
        return false;
    }

    public ResourcePack load(ResourcePack.Key key) {
        throw new UnsupportedOperationException("NoOpResourcePackProvider cannot load packs");
    }

    public void save(ResourcePack resourcePack) {
    }
}

