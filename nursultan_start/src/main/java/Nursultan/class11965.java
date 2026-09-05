/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11940;
import Nursultan.class11946;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public non-sealed class class11965
extends Record
implements class11946 {
    public int formatVersion;
    public String name;
    public UUID clientId;
    public byte[] data;

    public byte[] L() {
        return this.data;
    }

    public class11965(UUID uUID, int n, String string, byte[] byArray) {
        this.clientId = uUID;
        this.formatVersion = n;
        this.name = string;
        this.data = byArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11965.class, "clientId;formatVersion;name;data", "clientId", "formatVersion", "name", "data"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11965.class, "clientId;formatVersion;name;data", "clientId", "formatVersion", "name", "data"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11965.class, "clientId;formatVersion;name;data", "clientId", "formatVersion", "name", "data"}, this);
    }

    public UUID u() {
        return this.clientId;
    }

    public String y() {
        return this.name;
    }

    public static class11965 y(class11940 class119402) {
        return new class11965(class119402.U(), class119402.R(), class119402.P(), class119402.u(0x100000));
    }

    public int N() {
        return this.formatVersion;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N(this.clientId);
        class119402.y(this.formatVersion);
        class119402.N(this.name);
        class119402.N(this.data);
    }
}

