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

public final class class04159
extends Record {
    private final String id;

    public class04159(String string) {
        this.id = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04159.class, "id", "id"}, this, object);
    }

    public String toString() {
        return this.id;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04159.class, "id", "id"}, this);
    }

    public String N() {
        return this.id;
    }
}

