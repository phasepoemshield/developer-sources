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
import java.net.URI;
import java.util.List;
import minecraft.class07389;

public final class class07425<T>
extends Record {
    private final String name;
    private final URI ref;
    private final class07389<T> schema;

    public String L() {
        return this.name;
    }

    public class07425(String string, URI uRI, class07389<T> class073892) {
        this.name = string;
        this.ref = uRI;
        this.schema = class073892;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07425.class, "name;ref;schema", "name", "ref", "schema"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07425.class, "name;ref;schema", "name", "ref", "schema"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07425.class, "name;ref;schema", "name", "ref", "schema"}, this);
    }

    public class07389<T> i() {
        return this.schema;
    }

    public URI u() {
        return this.ref;
    }

    public class07389<List<T>> y() {
        return class07389.N(this.N(), this.schema.z());
    }

    public class07389<T> N() {
        return class07389.N(this.ref, this.schema.z());
    }
}

