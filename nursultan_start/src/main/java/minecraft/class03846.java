/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.List;
import minecraft.class03823;

class class03846
extends SimpleFileVisitor<Path> {
    final /* synthetic */ Path N;
    final /* synthetic */ List y;

    class03846(Path path, List list) {
        this.N = path;
        this.y = list;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes.isRegularFile() && !path.getParent().equals(this.N)) {
            FileTime fileTime = basicFileAttributes.lastModifiedTime();
            this.y.add(new class03823(path, fileTime));
        }
        return FileVisitResult.CONTINUE;
    }
}

