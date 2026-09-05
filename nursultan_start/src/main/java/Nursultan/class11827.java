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

public class class11827
extends Record {
    public UUID clientId;
    public long id;
    public String creator;
    public String name;
    public long rowVersion;
    public long lastUpdate;

    public String L() {
        return this.name;
    }

    public class11827(long l, UUID uUID, String string, String string2, long l2, long l3) {
        this.id = l;
        this.clientId = uUID;
        this.name = string;
        this.creator = string2;
        this.lastUpdate = l2;
        this.rowVersion = l3;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11827.class, "id;clientId;name;creator;lastUpdate;rowVersion", "id", "clientId", "name", "creator", "lastUpdate", "rowVersion"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11827.class, "id;clientId;name;creator;lastUpdate;rowVersion", "id", "clientId", "name", "creator", "lastUpdate", "rowVersion"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11827.class, "id;clientId;name;creator;lastUpdate;rowVersion", "id", "clientId", "name", "creator", "lastUpdate", "rowVersion"}, this);
    }

    public long i() {
        return this.rowVersion;
    }

    public UUID u() {
        return this.clientId;
    }

    public String y() {
        return this.creator;
    }

    public static class11827 y(class11940 class119402) {
        return new class11827(class119402.M(), class119402.U(), class119402.P(), class119402.P(), class119402.M(), class119402.M());
    }

    public void N(class11940 class119402) {
        class119402.N(this.id);
        class119402.N(this.clientId);
        class119402.N(this.name);
        class119402.N(this.creator);
        class119402.N(this.lastUpdate);
        class119402.N(this.rowVersion);
    }

    public long N() {
        return this.lastUpdate;
    }

    public long R() {
        return this.id;
    }
}

