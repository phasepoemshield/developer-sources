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

public final class class06166
extends Record {
    private final String name;
    public static final class06166 N = new class06166("SINGLE_QUADS");
    public static final class06166 y = new class06166("ITEM_PICKUP");
    public static final class06166 L = new class06166("ELDER_GUARDIANS");
    public static final class06166 u = new class06166("NO_RENDER");

    public class06166(String string) {
        this.name = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06166.class, "name", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06166.class, "name", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06166.class, "name", "name"}, this);
    }

    public String N() {
        return this.name;
    }
}

