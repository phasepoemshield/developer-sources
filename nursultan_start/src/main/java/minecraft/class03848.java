/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.hash.HashCode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URL;
import org.jspecify.annotations.Nullable;

public final class class03848
extends Record {
    final URL url;
    final @Nullable HashCode hash;

    public class03848(URL uRL, @Nullable HashCode hashCode) {
        this.url = uRL;
        this.hash = hashCode;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03848.class, "url;hash", "url", "hash"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03848.class, "url;hash", "url", "hash"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03848.class, "url;hash", "url", "hash"}, this);
    }

    public @Nullable HashCode y() {
        return this.hash;
    }

    public URL N() {
        return this.url;
    }
}

