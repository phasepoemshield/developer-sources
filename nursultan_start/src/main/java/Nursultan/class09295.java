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
import java.util.Objects;

public class class09295
extends Record {
    public boolean premium;
    public String login;
    public String minecraftName;

    public boolean L() {
        return this.premium;
    }

    public class09295(String string, String string2, boolean bl) {
        this.login = string;
        this.minecraftName = string2;
        this.premium = bl;
    }

    public boolean equals(Object object) {
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        class09295 class092952 = (class09295)((Object)object);
        return Objects.equals(this.login, class092952.login);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09295.class, "login;minecraftName;premium", "login", "minecraftName", "premium"}, this);
    }

    public int hashCode() {
        return Objects.hashCode(this.login);
    }

    public String y() {
        return this.login;
    }

    public String N() {
        return this.minecraftName;
    }
}

