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
import java.util.UUID;

public final class class03821
extends Record {
    private final UUID id;
    private final Path path;

    public class03821(UUID uUID, Path path) {
        this.id = uUID;
        this.path = path;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03821.class, "id;path", "id", "path"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03821.class, "id;path", "id", "path"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03821.class, "id;path", "id", "path"}, this);
    }

    public Path y() {
        return this.path;
    }

    public UUID N() {
        return this.id;
    }
}

