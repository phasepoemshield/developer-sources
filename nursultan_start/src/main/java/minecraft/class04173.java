/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10322
 */
package minecraft;

import Nursultan.class10322;
import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import minecraft.class04168;

public class class04173 {
    private final PathMatcher N;

    public class04173(PathMatcher pathMatcher) {
        this.N = pathMatcher;
    }

    public void y(Path path, List<class04168> list) throws IOException {
        Files.walkFileTree(path, (FileVisitor<? super Path>)new class10322(this, list));
    }

    public void N(Path path, List<class04168> list) throws IOException {
        Path path2 = Files.readSymbolicLink(path);
        if (!this.N.matches(path2)) {
            list.add(new class04168(path, path2));
        }
    }

    public List<class04168> N(Path path, boolean bl) throws IOException {
        BasicFileAttributes basicFileAttributes;
        ArrayList<class04168> arrayList = new ArrayList<class04168>();
        try {
            basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        }
        catch (NoSuchFileException noSuchFileException) {
            return arrayList;
        }
        if (basicFileAttributes.isRegularFile()) {
            throw new IOException("Path " + String.valueOf(path) + " is not a directory");
        }
        if (basicFileAttributes.isSymbolicLink()) {
            if (bl) {
                path = Files.readSymbolicLink(path);
            } else {
                this.N(path, arrayList);
                return arrayList;
            }
        }
        this.y(path, arrayList);
        return arrayList;
    }

    public List<class04168> N(Path path) throws IOException {
        ArrayList<class04168> arrayList = new ArrayList<class04168>();
        this.N(path, arrayList);
        return arrayList;
    }
}

