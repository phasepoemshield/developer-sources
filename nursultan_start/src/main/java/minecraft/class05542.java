/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04480
 *  minecraft.class07491
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class04480;
import minecraft.class07491;

public final class class05542
extends Record
implements class04480 {
    private final Set<class07491<?>> notProvided;

    public class05542(Set<class07491<?>> set) {
        this.notProvided = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05542.class, "notProvided", "notProvided"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05542.class, "notProvided", "notProvided"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05542.class, "notProvided", "notProvided"}, this);
    }

    public Set<class07491<?>> y() {
        return this.notProvided;
    }

    public String N() {
        return "Parameters " + String.valueOf(this.notProvided) + " are not provided in this context";
    }
}

