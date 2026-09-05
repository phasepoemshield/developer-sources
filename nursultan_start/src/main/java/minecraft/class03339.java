/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06260
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06260;

final class class03339
extends Record {
    private final class06260 standing;
    private final class06260 wall;

    class03339(class06260 class062602, class06260 class062603) {
        this.standing = class062602;
        this.wall = class062603;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03339.class, "standing;wall", "standing", "wall"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03339.class, "standing;wall", "standing", "wall"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03339.class, "standing;wall", "standing", "wall"}, this);
    }

    public class06260 y() {
        return this.wall;
    }

    public class06260 N() {
        return this.standing;
    }
}

