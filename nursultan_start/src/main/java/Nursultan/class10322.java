/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04173
 */
package Nursultan;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import minecraft.class04173;

public class class10322
extends SimpleFileVisitor<Path> {
    final /* synthetic */ List N;
    final /* synthetic */ class04173 y;

    private void L(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (basicFileAttributes.isSymbolicLink()) {
            this.y.N(path, this.N);
        }
    }

    public class10322(class04173 class041732, List list) {
        this.y = class041732;
        this.N = list;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        this.L(path, basicFileAttributes);
        return super.visitFile(path, basicFileAttributes);
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        this.L(path, basicFileAttributes);
        return super.preVisitDirectory(path, basicFileAttributes);
    }
}

