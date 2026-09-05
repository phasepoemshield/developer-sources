/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class11301
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11301;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11283
extends Record {
    public class09378 configKind;
    public class11301 kind;

    public class09378 L() {
        return this.configKind;
    }

    public class11283(class11301 class113012, class09378 class093782) {
        this.kind = class113012;
        this.configKind = class093782;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11283.class, "kind;configKind", "kind", "configKind"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11283.class, "kind;configKind", "kind", "configKind"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11283.class, "kind;configKind", "kind", "configKind"}, this);
    }

    public class11301 y() {
        return this.kind;
    }

    public static class11283 y(class09378 class093782) {
        return new class11283(class11301.PUSH, class093782);
    }

    public static class11283 N(class09378 class093782) {
        return new class11283(class11301.PULL, class093782);
    }

    public static class11283 N() {
        return new class11283(class11301.LIST, null);
    }
}

