/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11472
 *  Nursultan.class11938
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11472;
import Nursultan.class11938;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class class11878
extends Record {
    public String username;
    public String avatarRef;
    public long subscribeMinutes;

    public String L() {
        return this.username;
    }

    public class11878(String string, String string2, long l) {
        this.avatarRef = string;
        this.username = string2;
        this.subscribeMinutes = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11878.class, "avatarRef;username;subscribeMinutes", "avatarRef", "username", "subscribeMinutes"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11878.class, "avatarRef;username;subscribeMinutes", "avatarRef", "username", "subscribeMinutes"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11878.class, "avatarRef;username;subscribeMinutes", "avatarRef", "username", "subscribeMinutes"}, this);
    }

    public String u() {
        return this.avatarRef;
    }

    public long y() {
        return this.subscribeMinutes;
    }

    public String N() {
        Locale locale = Locale.forLanguageTag(class11938.P().N().N());
        return LocalDate.now().plusDays(((class11472)class11938.L_2).z() / 1440L).format(DateTimeFormatter.ofPattern("d MMMM yyyy", locale)).toLowerCase(locale);
    }
}

