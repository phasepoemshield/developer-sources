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

public class class11670
extends Record {
    public String xuid;
    public String token;
    public String hash;

    public String L() {
        return this.xuid;
    }

    class11670(String string, String string2, String string3) {
        this.token = string;
        this.hash = string2;
        this.xuid = string3;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11670.class, "token;hash;xuid", "token", "hash", "xuid"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11670.class, "token;hash;xuid", "token", "hash", "xuid"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11670.class, "token;hash;xuid", "token", "hash", "xuid"}, this);
    }

    public String y() {
        return this.token;
    }

    public String N() {
        return this.hash;
    }
}

