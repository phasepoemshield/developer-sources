/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04242
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import minecraft.class04200;
import minecraft.class04213;
import minecraft.class04215;
import minecraft.class04242;
import org.jspecify.annotations.Nullable;

public final class class04209
extends Record
implements class04200 {
    private final Path path;
    private final class04215 id;

    @Override
    public Path L() {
        return this.path;
    }

    public class04209(Path path, class04215 class042152) {
        this.path = path;
        this.id = class042152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04209.class, "path;id", "path", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04209.class, "path;id", "path", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04209.class, "path;id", "path", "id"}, this);
    }

    public FileChannel i() throws IOException {
        return FileChannel.open(this.path, StandardOpenOption.WRITE, StandardOpenOption.READ);
    }

    @Override
    public class04215 u() {
        return this.id;
    }

    @Override
    public class04213 y() throws IOException {
        Path path = this.path.resolveSibling(this.path.getFileName().toString() + ".gz");
        class04242.N((Path)this.path, (Path)path);
        return new class04213(path, this.id);
    }

    @Override
    public @Nullable Reader N() throws IOException {
        return Files.exists(this.path, new LinkOption[0]) ? Files.newBufferedReader(this.path) : null;
    }
}

