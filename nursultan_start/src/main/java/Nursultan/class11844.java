/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  Nursultan.class11536
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class11536;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11844
extends Record {
    public class11536<?> setting;
    public class09785<Void> updater;

    public class11844(class11536<?> class115362, class09785<Void> class097852) {
        this.setting = class115362;
        this.updater = class097852;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11844.class, "setting;updater", "setting", "updater"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11844.class, "setting;updater", "setting", "updater"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11844.class, "setting;updater", "setting", "updater"}, this);
    }

    public class11536<?> y() {
        return this.setting;
    }

    public class09785<Void> N() {
        return this.updater;
    }
}

