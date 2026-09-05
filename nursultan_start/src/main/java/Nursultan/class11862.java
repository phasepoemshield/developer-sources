/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  Nursultan.class11512
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class11512;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11862
extends Record {
    public class09785<Boolean> opened;
    public class11512 settingRegistrable;

    public class11862(class11512 class115122, class09785<Boolean> class097852) {
        this.settingRegistrable = class115122;
        this.opened = class097852;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11862.class, "settingRegistrable;opened", "settingRegistrable", "opened"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11862.class, "settingRegistrable;opened", "settingRegistrable", "opened"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11862.class, "settingRegistrable;opened", "settingRegistrable", "opened"}, this);
    }

    public class11512 y() {
        return this.settingRegistrable;
    }

    public class09785<Boolean> N() {
        return this.opened;
    }
}

