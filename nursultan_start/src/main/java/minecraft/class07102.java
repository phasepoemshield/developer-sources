/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07104
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import minecraft.class07104;
import org.apache.commons.lang3.mutable.MutableInt;

class class07102
extends SimpleFileVisitor<Path> {
    final /* synthetic */ MutableInt N;
    final /* synthetic */ Set y;
    final /* synthetic */ MutableInt L;
    final /* synthetic */ class07104 u;

    class07102(class07104 class071042, MutableInt mutableInt, Set set, MutableInt mutableInt2) {
        this.u = class071042;
        this.N = mutableInt;
        this.y = set;
        this.L = mutableInt2;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        if (this.u.y.contains(path)) {
            return FileVisitResult.CONTINUE;
        }
        this.N.increment();
        if (this.y.contains(path)) {
            return FileVisitResult.CONTINUE;
        }
        try {
            Files.delete(path);
        }
        catch (IOException iOException) {
            class07104.N.warn("Failed to delete file {}", (Object)path, (Object)iOException);
        }
        this.L.increment();
        return FileVisitResult.CONTINUE;
    }
}

