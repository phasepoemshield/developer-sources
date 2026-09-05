/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import minecraft.class01270;
import org.jspecify.annotations.Nullable;

class class01273
implements AutoCloseable {
    private final WatchService N;
    private final Path y;

    public class01273(Path path) throws IOException {
        this.y = path;
        this.N = path.getFileSystem().newWatchService();
        try {
            this.y(path);
            try (DirectoryStream<Path> var2 = Files.newDirectoryStream(path);){
                for (Path path2 : var2) {
                    if (!Files.isDirectory(path2, LinkOption.NOFOLLOW_LINKS)) continue;
                    this.y(path2);
                }
            }
        }
        catch (Exception exception) {
            this.N.close();
            throw exception;
        }
    }

    @Override
    public void close() throws IOException {
        this.N.close();
    }

    private void y(Path path) throws IOException {
        path.register(this.N, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
    }

    public boolean N() throws IOException {
        WatchKey watchKey;
        boolean bl = false;
        while ((watchKey = this.N.poll()) != null) {
            for (WatchEvent<?> var5 : watchKey.pollEvents()) {
                Path path;
                bl = true;
                if (watchKey.watchable() != this.y || var5.kind() != StandardWatchEventKinds.ENTRY_CREATE || !Files.isDirectory(path = this.y.resolve((Path)var5.context()), LinkOption.NOFOLLOW_LINKS)) continue;
                this.y(path);
            }
            watchKey.reset();
        }
        return bl;
    }

    public static @Nullable class01273 N(Path path) {
        try {
            return new class01273(path);
        }
        catch (IOException iOException) {
            class01270.N.warn("Failed to initialize pack directory {} monitoring", (Object)path, (Object)iOException);
            return null;
        }
    }
}

