/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11298;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public class class11323
extends Record {
    public UUID clientId;
    public class11298 kind;

    public static class11323 L(UUID uUID) {
        return new class11323(class11298.UPDATE, uUID);
    }

    public class11323(class11298 class112982, UUID uUID) {
        this.kind = class112982;
        this.clientId = uUID;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11323.class, "kind;clientId", "kind", "clientId"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11323.class, "kind;clientId", "kind", "clientId"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11323.class, "kind;clientId", "kind", "clientId"}, this);
    }

    public static class11323 i(UUID uUID) {
        return new class11323(class11298.RENAME, uUID);
    }

    public static class11323 u(UUID uUID) {
        return new class11323(class11298.LOAD, uUID);
    }

    public class11298 y() {
        return this.kind;
    }

    public static class11323 y(UUID uUID) {
        return new class11323(class11298.CREATE, uUID);
    }

    public static class11323 N(UUID uUID) {
        return new class11323(class11298.DELETE, uUID);
    }

    public UUID N() {
        return this.clientId;
    }
}

