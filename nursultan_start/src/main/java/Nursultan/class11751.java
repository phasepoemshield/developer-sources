/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class06584
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class06584;

public class class11751
extends Record {
    public class06584 stack;
    public class01894 groupId;
    public int remainingTicks;

    public class06584 L() {
        return this.stack;
    }

    class11751(class01894 class018942, class06584 class065842, int n) {
        this.groupId = class018942;
        this.stack = class065842;
        this.remainingTicks = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11751.class, "groupId;stack;remainingTicks", "groupId", "stack", "remainingTicks"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11751.class, "groupId;stack;remainingTicks", "groupId", "stack", "remainingTicks"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11751.class, "groupId;stack;remainingTicks", "groupId", "stack", "remainingTicks"}, this);
    }

    public class01894 y() {
        return this.groupId;
    }

    public int N() {
        return this.remainingTicks;
    }
}

