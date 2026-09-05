/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03804
 *  minecraft.class05071
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.time.ZonedDateTime;
import minecraft.class03804;
import minecraft.class05071;

public final class class04779
extends Record {
    final Path path;

    public Path L() {
        return this.N(class05071.R);
    }

    public class04779(Path path) {
        this.path = path;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04779.class, "path", "path"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04779.class, "path", "path"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04779.class, "path", "path"}, this);
    }

    public Path i() {
        return this.N(class05071.B);
    }

    public Path u() {
        return this.N(class05071.M);
    }

    public Path y() {
        return this.N(class05071.i);
    }

    public Path y(ZonedDateTime zonedDateTime) {
        return this.path.resolve(class05071.i.N() + "_raw_" + zonedDateTime.format(class03804.N));
    }

    public String N() {
        return this.path.getFileName().toString();
    }

    public Path N(class05071 class050712) {
        return this.path.resolve(class050712.N());
    }

    public Path N(ZonedDateTime zonedDateTime) {
        return this.path.resolve(class05071.i.N() + "_corrupted_" + zonedDateTime.format(class03804.N));
    }

    public Path R() {
        return this.path;
    }
}

