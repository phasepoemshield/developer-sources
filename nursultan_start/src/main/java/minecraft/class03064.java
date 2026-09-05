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
import minecraft.class03048;
import minecraft.class03058;

public final class class03064
extends Record {
    private final class03048 lastSeen;
    private final class03058 update;

    public class03064(class03048 class030482, class03058 class030582) {
        this.lastSeen = class030482;
        this.update = class030582;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03064.class, "lastSeen;update", "lastSeen", "update"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03064.class, "lastSeen;update", "lastSeen", "update"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03064.class, "lastSeen;update", "lastSeen", "update"}, this);
    }

    public class03058 y() {
        return this.update;
    }

    public class03048 N() {
        return this.lastSeen;
    }
}

