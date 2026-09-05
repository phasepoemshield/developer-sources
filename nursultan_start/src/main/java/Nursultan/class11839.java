/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class11854;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11839
extends Record {
    public String icon;
    public String key;
    public class09785<class11854> state;
    public class11854 menuCategory;

    public String L() {
        return this.key;
    }

    public class11839(String string, String string2, class11854 class118542, class09785<class11854> class097852) {
        this.key = string;
        this.icon = string2;
        this.menuCategory = class118542;
        this.state = class097852;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11839.class, "key;icon;menuCategory;state", "key", "icon", "menuCategory", "state"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11839.class, "key;icon;menuCategory;state", "key", "icon", "menuCategory", "state"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11839.class, "key;icon;menuCategory;state", "key", "icon", "menuCategory", "state"}, this);
    }

    public String u() {
        return this.icon;
    }

    public class09785<class11854> y() {
        return this.state;
    }

    public class11854 N() {
        return this.menuCategory;
    }
}

