/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.Files
 *  minecraft.class04785
 */
package Nursultan;

import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import minecraft.class04785;

public class class10469
extends SimpleFileVisitor<Path> {
    final /* synthetic */ Path N;
    final /* synthetic */ ZipOutputStream y;
    final /* synthetic */ class04785 L;

    public class10469(class04785 class047852, Path path, ZipOutputStream zipOutputStream) {
        this.L = class047852;
        this.N = path;
        this.y = zipOutputStream;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (path.endsWith("session.lock")) {
            return FileVisitResult.CONTINUE;
        }
        String string = this.N.resolve(this.L.y.R().relativize(path)).toString().replace('\\', '/');
        ZipEntry zipEntry = new ZipEntry(string);
        this.y.putNextEntry(zipEntry);
        Files.asByteSource((File)path.toFile()).copyTo((OutputStream)this.y);
        this.y.closeEntry();
        return FileVisitResult.CONTINUE;
    }
}

