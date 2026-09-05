/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09250
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09250;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11757
extends Record {
    public class09250 account;

    public class11757(class09250 class092502) {
        this.account = class092502;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11757.class, "account", "account"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11757.class, "account", "account"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11757.class, "account", "account"}, this);
    }

    public class09250 N() {
        return this.account;
    }
}

