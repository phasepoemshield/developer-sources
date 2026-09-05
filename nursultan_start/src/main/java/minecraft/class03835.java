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
import java.util.Comparator;

final class class03835
extends Record {
    final Path path;
    final int removalPriority;
    public static final Comparator<class03835> L = Comparator.comparing(class03835::y).reversed();

    class03835(Path path, int n) {
        this.path = path;
        this.removalPriority = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03835.class, "path;removalPriority", "path", "removalPriority"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03835.class, "path;removalPriority", "path", "removalPriority"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03835.class, "path;removalPriority", "path", "removalPriority"}, this);
    }

    public int y() {
        return this.removalPriority;
    }

    public Path N() {
        return this.path;
    }
}

