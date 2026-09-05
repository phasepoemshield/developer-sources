/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import minecraft.class04168;
import minecraft.class04173;
import org.jspecify.annotations.Nullable;

public abstract class class04181<T> {
    private final class04173 N;

    protected abstract @Nullable T L(Path var1) throws IOException;

    protected class04181(class04173 class041732) {
        this.N = class041732;
    }

    protected abstract @Nullable T u(Path var1) throws IOException;

    public @Nullable T N(Path path, List<class04168> list) throws IOException {
        BasicFileAttributes basicFileAttributes;
        Path path2 = path;
        try {
            basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        }
        catch (NoSuchFileException noSuchFileException) {
            return null;
        }
        if (basicFileAttributes.isSymbolicLink()) {
            this.N.N(path, list);
            if (!list.isEmpty()) {
                return null;
            }
            path2 = Files.readSymbolicLink(path);
            basicFileAttributes = Files.readAttributes(path2, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        }
        if (basicFileAttributes.isDirectory()) {
            this.N.y(path2, list);
            if (!list.isEmpty()) {
                return null;
            }
            if (!Files.isRegularFile(path2.resolve("pack.mcmeta"), new LinkOption[0])) {
                return null;
            }
            return this.L(path2);
        }
        if (basicFileAttributes.isRegularFile() && path2.getFileName().toString().endsWith(".zip")) {
            return this.u(path2);
        }
        return null;
    }
}

