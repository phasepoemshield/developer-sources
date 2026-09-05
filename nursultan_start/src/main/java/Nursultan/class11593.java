/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11829
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11829;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11593
extends Record {
    public String detail;
    public class11829 phase;
    public String localeKey;

    public String L() {
        return this.detail;
    }

    public class11593(class11829 class118292, String string, String string2) {
        this.phase = class118292;
        this.localeKey = string;
        this.detail = string2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11593.class, "phase;localeKey;detail", "phase", "localeKey", "detail"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11593.class, "phase;localeKey;detail", "phase", "localeKey", "detail"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11593.class, "phase;localeKey;detail", "phase", "localeKey", "detail"}, this);
    }

    public class11829 y() {
        return this.phase;
    }

    public String N() {
        return this.localeKey;
    }
}

