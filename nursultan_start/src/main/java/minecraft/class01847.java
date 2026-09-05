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
import java.net.URL;
import java.util.UUID;

final class class01847
extends Record {
    final UUID id;
    final URL url;
    final String hash;

    public String L() {
        return this.hash;
    }

    class01847(UUID uUID, URL uRL, String string) {
        this.id = uUID;
        this.url = uRL;
        this.hash = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01847.class, "id;url;hash", "id", "url", "hash"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01847.class, "id;url;hash", "id", "url", "hash"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01847.class, "id;url;hash", "id", "url", "hash"}, this);
    }

    public URL y() {
        return this.url;
    }

    public UUID N() {
        return this.id;
    }
}

