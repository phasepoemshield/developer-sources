/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public class class11789
extends Record {
    public boolean stale;
    public byte[] token;
    public int activationCount;
    public int activationLimit;
    public long expiresAtMillis;
    public UUID presetClientId;
    public long createdAtMillis;
    public long presetId;

    public int L() {
        return this.activationCount;
    }

    public long M() {
        return this.createdAtMillis;
    }

    public class11789(long l, UUID uUID, byte[] byArray, long l2, int n, int n2, long l3, boolean bl) {
        this.presetId = l;
        this.presetClientId = uUID;
        this.token = byArray;
        this.expiresAtMillis = l2;
        this.activationLimit = n;
        this.activationCount = n2;
        this.createdAtMillis = l3;
        this.stale = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11789.class, "presetId;presetClientId;token;expiresAtMillis;activationLimit;activationCount;createdAtMillis;stale", "presetId", "presetClientId", "token", "expiresAtMillis", "activationLimit", "activationCount", "createdAtMillis", "stale"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11789.class, "presetId;presetClientId;token;expiresAtMillis;activationLimit;activationCount;createdAtMillis;stale", "presetId", "presetClientId", "token", "expiresAtMillis", "activationLimit", "activationCount", "createdAtMillis", "stale"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11789.class, "presetId;presetClientId;token;expiresAtMillis;activationLimit;activationCount;createdAtMillis;stale", "presetId", "presetClientId", "token", "expiresAtMillis", "activationLimit", "activationCount", "createdAtMillis", "stale"}, this);
    }

    public long B() {
        return this.presetId;
    }

    public int i() {
        return this.activationLimit;
    }

    public byte[] u() {
        return this.token;
    }

    public long y() {
        return this.expiresAtMillis;
    }

    public void y(class11940 class119402) {
        class119402.N(this.presetId);
        class119402.N(this.presetClientId);
        class119402.N(this.token);
        class119402.N(this.expiresAtMillis);
        class119402.y(this.activationLimit);
        class119402.y(this.activationCount);
        class119402.N(this.createdAtMillis);
        if (class119402.z() >= 16) {
            class119402.N(this.stale);
        }
    }

    public boolean N() {
        return this.stale;
    }

    public static class11789 N(class11940 class119402) {
        return new class11789(class119402.M(), class119402.U(), class119402.u(64), class119402.M(), class119402.R(), class119402.R(), class119402.M(), class119402.z() >= 16 && class119402.B());
    }

    public UUID R() {
        return this.presetClientId;
    }
}

