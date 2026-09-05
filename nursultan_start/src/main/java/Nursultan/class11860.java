/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  Nursultan.class12002
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class12002;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.ObjIntConsumer;

public class class11860
extends Record {
    public ObjIntConsumer<class12002> onChange;
    public class09785<Boolean> active;
    public int mods;
    public class12002 key;

    public int L() {
        return this.mods;
    }

    public class11860(class12002 class120022, int n, ObjIntConsumer<class12002> objIntConsumer, class09785<Boolean> class097852) {
        this.key = class120022;
        this.mods = n;
        this.onChange = objIntConsumer;
        this.active = class097852;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11860.class, "key;mods;onChange;active", "key", "mods", "onChange", "active"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11860.class, "key;mods;onChange;active", "key", "mods", "onChange", "active"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11860.class, "key;mods;onChange;active", "key", "mods", "onChange", "active"}, this);
    }

    public class09785<Boolean> u() {
        return this.active;
    }

    public class12002 y() {
        return this.key;
    }

    public ObjIntConsumer<class12002> N() {
        return this.onChange;
    }
}

