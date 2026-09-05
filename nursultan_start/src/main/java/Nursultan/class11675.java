/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11675
extends Record {
    @SerializedName(value="name")
    private final String name;
    @SerializedName(value="password")
    private final String password;
    @SerializedName(value="last-login")
    private final String lastLogin;

    @SerializedName(value="name")
    public String L() {
        return this.name;
    }

    public class11675(String string, String string2, String string3) {
        this.name = string;
        this.password = string2;
        this.lastLogin = string3;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11675.class, "name;password;lastLogin", "name", "password", "lastLogin"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11675.class, "name;password;lastLogin", "name", "password", "lastLogin"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11675.class, "name;password;lastLogin", "name", "password", "lastLogin"}, this);
    }

    @SerializedName(value="password")
    public String y() {
        return this.password;
    }

    @SerializedName(value="last-login")
    public String N() {
        return this.lastLogin;
    }
}

