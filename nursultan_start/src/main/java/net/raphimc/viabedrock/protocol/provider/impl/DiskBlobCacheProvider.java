/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.ViaBedrock
 */
package net.raphimc.viabedrock.protocol.provider.impl;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.stream.Stream;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.io.BlobDB;
import net.raphimc.viabedrock.protocol.provider.BlobCacheProvider;

public class DiskBlobCacheProvider
extends BlobCacheProvider {
    private static BlobDB BLOB_DB;

    public DiskBlobCacheProvider() {
        if (BLOB_DB != null) {
            return;
        }
        try {
            try {
                BLOB_DB = new BlobDB(ViaBedrock.getPlatform().getBlobCacheFolder());
            }
            catch (Throwable e) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Failed to open BlobDB, deleting it...", e);
                try (Stream<Path> paths = Files.walk(ViaBedrock.getPlatform().getBlobCacheFolder().toPath(), new FileVisitOption[0]);){
                    for (Path path : paths.sorted(Comparator.reverseOrder()).toList()) {
                        Files.delete(path);
                    }
                }
                BLOB_DB = new BlobDB(ViaBedrock.getPlatform().getBlobCacheFolder());
            }
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    BLOB_DB.save();
                    BLOB_DB.close();
                }
                catch (Throwable e) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Failed to close blob cache", e);
                }
            }));
        }
        catch (Throwable e) {
            throw new IllegalStateException("Failed to open or create blob cache", e);
        }
    }

    @Override
    public boolean hasBlob(long hash) {
        return BLOB_DB.contains(hash);
    }

    @Override
    public void addBlob(long hash, byte[] blob) {
        BLOB_DB.queuePut(hash, blob);
    }

    @Override
    public byte[] getBlob(long hash) {
        try {
            return BLOB_DB.get(hash);
        }
        catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

