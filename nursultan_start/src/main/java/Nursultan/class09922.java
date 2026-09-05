/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09914;
import Nursultan.class09916;
import Nursultan.class09935;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;

public final class class09922
extends Record
implements class09935 {
    private final class09916 bounds;
    private final class09914 effect;
    private final List<class09935> children;

    public List<class09935> L() {
        return this.children;
    }

    public class09922(class09916 class099162, class09914 class099142, List<class09935> list) {
        Objects.requireNonNull(class099162, "bounds");
        Objects.requireNonNull(class099142, "effect");
        Objects.requireNonNull(list, "children");
        this.bounds = class099162;
        this.effect = class099142;
        this.children = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09922.class, "bounds;effect;children", "bounds", "effect", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09922.class, "bounds;effect;children", "bounds", "effect", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09922.class, "bounds;effect;children", "bounds", "effect", "children"}, this);
    }

    public class09914 y() {
        return this.effect;
    }

    public class09916 N() {
        return this.bounds;
    }
}

