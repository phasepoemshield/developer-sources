/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.ViaBedrock
 */
package net.raphimc.viabedrock.protocol.provider.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.resourcepack.ResourcePack;
import net.raphimc.viabedrock.api.resourcepack.content.ZipContent;
import net.raphimc.viabedrock.protocol.provider.ResourcePackProvider;

public class DiskResourcePackProvider
extends ResourcePackProvider {
    @Override
    public boolean has(ResourcePack.Key key) {
        return Files.isRegularFile(this.getPath(key), new LinkOption[0]);
    }

    @Override
    public ResourcePack load(ResourcePack.Key key) throws IOException {
        if (!this.has(key)) {
            throw new IOException("Resource pack not found");
        }
        return new ResourcePack(new ZipContent(Files.readAllBytes(this.getPath(key))));
    }

    @Override
    public void save(ResourcePack resourcePack) throws IOException {
        Files.write(this.getPath(resourcePack.key()), resourcePack.content().toZip(), new OpenOption[0]);
    }

    private Path getPath(ResourcePack.Key key) {
        Path basePath = ViaBedrock.getPlatform().getServerPacksFolder().toPath();
        Path resolvedPath = basePath.resolve(key.toString() + ".mcpack").normalize();
        if (!resolvedPath.startsWith(basePath)) {
            throw new IllegalArgumentException("Path traversal attempt: " + String.valueOf((Object)key));
        }
        return resolvedPath;
    }
}

