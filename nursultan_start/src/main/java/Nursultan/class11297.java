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

public class class11297
extends Record {
    public int index;
    public class06584 itemStack;

    public class11297(class06584 class065842, int n) {
        this.itemStack = class065842;
        this.index = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11297.class, "itemStack;index", "itemStack", "index"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11297.class, "itemStack;index", "itemStack", "index"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11297.class, "itemStack;index", "itemStack", "index"}, this);
    }

    public int y() {
        return this.index;
    }

    public class06584 N() {
        return this.itemStack;
    }
}

