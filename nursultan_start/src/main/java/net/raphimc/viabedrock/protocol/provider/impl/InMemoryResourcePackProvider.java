/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.protocol.provider.impl;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.raphimc.viabedrock.api.resourcepack.ResourcePack;
import net.raphimc.viabedrock.api.resourcepack.content.ZipContent;
import net.raphimc.viabedrock.protocol.provider.ResourcePackProvider;

public class InMemoryResourcePackProvider
extends ResourcePackProvider {
    private final Map<String, byte[]> resourcePacks = new ConcurrentHashMap<String, byte[]>();

    @Override
    public boolean has(ResourcePack.Key key) {
        return this.resourcePacks.containsKey(key.toString());
    }

    @Override
    public ResourcePack load(ResourcePack.Key key) throws IOException {
        if (!this.has(key)) {
            throw new IOException("Pack not found");
        }
        return new ResourcePack(new ZipContent(this.resourcePacks.get(key.toString())));
    }

    @Override
    public void save(ResourcePack resourcePack) throws IOException {
        this.resourcePacks.put(resourcePack.key().toString(), resourcePack.content().toZip());
    }
}

