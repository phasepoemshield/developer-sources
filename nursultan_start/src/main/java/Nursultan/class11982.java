/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11940;
import Nursultan.class11942;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class11982
extends Record
implements class11942 {
    public int activationLimit;
    public long expiresAtMillis;
    public long presetId;

    public long L() {
        return this.presetId;
    }

    public class11982(long l, long l2, int n) {
        this.presetId = l;
        this.expiresAtMillis = l2;
        this.activationLimit = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11982.class, "presetId;expiresAtMillis;activationLimit", "presetId", "expiresAtMillis", "activationLimit"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11982.class, "presetId;expiresAtMillis;activationLimit", "presetId", "expiresAtMillis", "activationLimit"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11982.class, "presetId;expiresAtMillis;activationLimit", "presetId", "expiresAtMillis", "activationLimit"}, this);
    }

    public static class11982 y(class11940 class119402) {
        return new class11982(class119402.M(), class119402.M(), class119402.R());
    }

    public int y() {
        return this.activationLimit;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N(this.presetId);
        class119402.N(this.expiresAtMillis);
        class119402.y(this.activationLimit);
    }

    public long N() {
        return this.expiresAtMillis;
    }
}

