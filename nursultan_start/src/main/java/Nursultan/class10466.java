/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04777
 *  minecraft.class04785
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import minecraft.class04777;
import minecraft.class04785;
import org.jspecify.annotations.Nullable;

public class class10466
extends SimpleFileVisitor<Path> {
    final /* synthetic */ Path N;
    final /* synthetic */ class04785 y;

    public class10466(class04785 class047852, Path path) {
        this.y = class047852;
        this.N = path;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (!path.equals(this.N)) {
            class04777.N.debug("Deleting {}", (Object)path);
            Files.delete(path);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path path, @Nullable IOException iOException) throws IOException {
        if (iOException != null) {
            throw iOException;
        }
        if (path.equals(this.y.y.R())) {
            this.y.N.close();
            Files.deleteIfExists(this.N);
        }
        Files.delete(path);
        return FileVisitResult.CONTINUE;
    }
}

