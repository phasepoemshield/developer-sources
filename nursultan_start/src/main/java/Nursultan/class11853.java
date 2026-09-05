/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11856;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11853
extends Record {
    public class11856 segment;
    public Runnable onClick;
    public boolean active;
    public String label;

    public String L() {
        return this.label;
    }

    public class11853(String string, boolean bl, Runnable runnable, class11856 class118562) {
        this.label = string;
        this.active = bl;
        this.onClick = runnable;
        this.segment = class118562;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11853.class, "label;active;onClick;segment", "label", "active", "onClick", "segment"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11853.class, "label;active;onClick;segment", "label", "active", "onClick", "segment"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11853.class, "label;active;onClick;segment", "label", "active", "onClick", "segment"}, this);
    }

    public boolean u() {
        return this.active;
    }

    public class11856 y() {
        return this.segment;
    }

    public Runnable N() {
        return this.onClick;
    }
}

