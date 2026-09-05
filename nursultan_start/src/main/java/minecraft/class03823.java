/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Comparator;

final class class03823
extends Record {
    final Path path;
    private final FileTime modifiedTime;
    public static final Comparator<class03823> y = Comparator.comparing(class03823::y).reversed();

    class03823(Path path, FileTime fileTime) {
        this.path = path;
        this.modifiedTime = fileTime;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03823.class, "path;modifiedTime", "path", "modifiedTime"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03823.class, "path;modifiedTime", "path", "modifiedTime"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03823.class, "path;modifiedTime", "path", "modifiedTime"}, this);
    }

    public FileTime y() {
        return this.modifiedTime;
    }

    public Path N() {
        return this.path;
    }
}

