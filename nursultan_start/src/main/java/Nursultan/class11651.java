/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05913
 */
package Nursultan;

import Nursultan.class11652;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05913;

public final class class11651
extends Record
implements class11652 {
    private final class05913 material;

    public class11651(class05913 class059132) {
        this.material = class059132;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11651.class, "material", "material"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11651.class, "material", "material"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11651.class, "material", "material"}, this);
    }

    public class05913 N() {
        return this.material;
    }
}

