/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  Nursultan.class11067
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class11067;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11866
extends Record {
    public class09785<Boolean> opened;
    public class11067 module;

    public class11866(class11067 class110672, class09785<Boolean> class097852) {
        this.module = class110672;
        this.opened = class097852;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11866.class, "module;opened", "module", "opened"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11866.class, "module;opened", "module", "opened"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11866.class, "module;opened", "module", "opened"}, this);
    }

    public class11067 y() {
        return this.module;
    }

    public class09785<Boolean> N() {
        return this.opened;
    }
}

