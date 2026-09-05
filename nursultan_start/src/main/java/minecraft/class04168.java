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

public final class class04168
extends Record {
    private final Path link;
    private final Path target;

    public class04168(Path path, Path path2) {
        this.link = path;
        this.target = path2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04168.class, "link;target", "link", "target"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04168.class, "link;target", "link", "target"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04168.class, "link;target", "link", "target"}, this);
    }

    public Path y() {
        return this.target;
    }

    public Path N() {
        return this.link;
    }
}

