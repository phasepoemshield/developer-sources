/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;

public final class class10549
extends Record {
    public final class01894 registry;
    public final class01894 identifier;

    public class10549(class01894 class018942, class01894 class018943) {
        this.registry = class018942;
        this.identifier = class018943;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10549.class, "registry;identifier", "registry", "identifier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10549.class, "registry;identifier", "registry", "identifier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10549.class, "registry;identifier", "registry", "identifier"}, this);
    }

    public class01894 y() {
        return this.identifier;
    }

    public class01894 N() {
        return this.registry;
    }
}

