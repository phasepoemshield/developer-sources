/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11318;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11326
extends Record {
    public long expiresAtMillis;
    public int activationLimit;
    public class11318 kind;
    public long presetId;

    public int L() {
        return this.activationLimit;
    }

    public class11326(class11318 class113182, long l, long l2, int n) {
        this.kind = class113182;
        this.presetId = l;
        this.expiresAtMillis = l2;
        this.activationLimit = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11326.class, "kind;presetId;expiresAtMillis;activationLimit", "kind", "presetId", "expiresAtMillis", "activationLimit"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11326.class, "kind;presetId;expiresAtMillis;activationLimit", "kind", "presetId", "expiresAtMillis", "activationLimit"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11326.class, "kind;presetId;expiresAtMillis;activationLimit", "kind", "presetId", "expiresAtMillis", "activationLimit"}, this);
    }

    public long i() {
        return this.presetId;
    }

    public long u() {
        return this.expiresAtMillis;
    }

    public static class11326 y(long l) {
        return new class11326(class11318.REFRESH, l, 0L, 0);
    }

    public static class11326 y() {
        return new class11326(class11318.LIST, 0L, 0L, 0);
    }

    public class11318 N() {
        return this.kind;
    }

    public static class11326 N(long l) {
        return new class11326(class11318.DELETE, l, 0L, 0);
    }

    public static class11326 N(long l, long l2, int n) {
        return new class11326(class11318.CREATE, l, l2, n);
    }
}

