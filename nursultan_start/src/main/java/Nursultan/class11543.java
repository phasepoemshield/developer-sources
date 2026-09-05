/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06584;

public class class11543
extends Record {
    public int startTick;
    public class06584 itemStack;

    class11543(int n, class06584 class065842) {
        this.startTick = n;
        this.itemStack = class065842;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11543.class, "startTick;itemStack", "startTick", "itemStack"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11543.class, "startTick;itemStack", "startTick", "itemStack"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11543.class, "startTick;itemStack", "startTick", "itemStack"}, this);
    }

    public int y() {
        return this.startTick;
    }

    public class06584 N() {
        return this.itemStack;
    }
}

