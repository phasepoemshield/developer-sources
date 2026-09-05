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

public final class class02353<T>
extends Record {
    private final String name;

    public class02353(String string) {
        this.name = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02353.class, "name", "name"}, this, object);
    }

    public String toString() {
        return "<" + this.name + ">";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02353.class, "name", "name"}, this);
    }

    public static <T> class02353<T> N(String string) {
        return new class02353<T>(string);
    }

    public String N() {
        return this.name;
    }
}

