/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09177
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09177;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11487
extends Record {
    public String localeKey;
    public class09177 phase;

    public class11487(class09177 class091772, String string) {
        this.phase = class091772;
        this.localeKey = string;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11487.class, "phase;localeKey", "phase", "localeKey"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11487.class, "phase;localeKey", "phase", "localeKey"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11487.class, "phase;localeKey", "phase", "localeKey"}, this);
    }

    public String y() {
        return this.localeKey;
    }

    public class09177 N() {
        return this.phase;
    }
}

