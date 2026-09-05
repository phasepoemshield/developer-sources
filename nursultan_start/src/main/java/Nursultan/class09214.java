/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11854
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11854;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09214
extends Record {
    public class11854 category;
    public String query;

    public class09214(String string, class11854 class118542) {
        this.query = string;
        this.category = class118542;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09214.class, "query;category", "query", "category"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09214.class, "query;category", "query", "category"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09214.class, "query;category", "query", "category"}, this);
    }

    public class11854 y() {
        return this.category;
    }

    public String N() {
        return this.query;
    }
}

