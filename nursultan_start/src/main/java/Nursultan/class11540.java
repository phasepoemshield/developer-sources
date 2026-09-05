/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;

public class class11540
extends Record {
    public String token;
    public UUID uuid;
    public String refresh;
    public String xuid;
    public String name;

    public String L() {
        return this.xuid;
    }

    public class11540(UUID uUID, String string, String string2, String string3, String string4) {
        this.uuid = uUID;
        this.name = string;
        this.token = string2;
        this.refresh = string3;
        this.xuid = string4;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11540.class, "uuid;name;token;refresh;xuid", "uuid", "name", "token", "refresh", "xuid"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11540.class, "uuid;name;token;refresh;xuid", "uuid", "name", "token", "refresh", "xuid"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11540.class, "uuid;name;token;refresh;xuid", "uuid", "name", "token", "refresh", "xuid"}, this);
    }

    public String i() {
        return this.name;
    }

    public String u() {
        return this.refresh;
    }

    public String y() {
        return this.token;
    }

    public UUID N() {
        return this.uuid;
    }
}

