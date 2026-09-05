/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11067;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11846
extends Record {
    public class11067 module;
    public String anchorKey;
    public String description;

    public class11067 L() {
        return this.module;
    }

    public class11846(class11067 class110672, String string, String string2) {
        this.module = class110672;
        this.description = string;
        this.anchorKey = string2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11846.class, "module;description;anchorKey", "module", "description", "anchorKey"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11846.class, "module;description;anchorKey", "module", "description", "anchorKey"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11846.class, "module;description;anchorKey", "module", "description", "anchorKey"}, this);
    }

    public String y() {
        return this.description;
    }

    public String N() {
        return this.anchorKey;
    }
}

