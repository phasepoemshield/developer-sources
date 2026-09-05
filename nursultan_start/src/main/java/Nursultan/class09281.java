/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09279;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public non-sealed class class09281
extends Record
implements class09279 {
    public UUID clientId;
    public int errorCode;
    public long id;

    public int L() {
        return this.errorCode;
    }

    public class09281(long l, UUID uUID, int n) {
        this.id = l;
        this.clientId = uUID;
        this.errorCode = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09281.class, "id;clientId;errorCode", "id", "clientId", "errorCode"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09281.class, "id;clientId;errorCode", "id", "clientId", "errorCode"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09281.class, "id;clientId;errorCode", "id", "clientId", "errorCode"}, this);
    }

    @Override
    public void y(class11940 class119402) {
        class119402.N(this.id);
        class119402.N(this.clientId);
        class119402.y(this.errorCode);
    }

    public long y() {
        return this.id;
    }

    public UUID N() {
        return this.clientId;
    }

    public static class09281 N(class11940 class119402) {
        return new class09281(class119402.M(), class119402.U(), class119402.R());
    }
}

