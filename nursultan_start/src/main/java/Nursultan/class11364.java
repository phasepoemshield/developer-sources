/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09378;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11364
extends Record {
    public class09378 kind;

    public class11364(class09378 class093782) {
        this.kind = class093782;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11364.class, "kind", "kind"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11364.class, "kind", "kind"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11364.class, "kind", "kind"}, this);
    }

    public static class11364 N(class09378 class093782) {
        return new class11364(class093782);
    }

    public class09378 N() {
        return this.kind;
    }
}

