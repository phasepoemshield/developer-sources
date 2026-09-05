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

public class class11114
extends Record {
    public class06584 itemStack;
    public long price;
    public String seller;

    public String L() {
        return this.seller;
    }

    class11114(class06584 class065842, String string, long l) {
        this.itemStack = class065842;
        this.seller = string;
        this.price = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11114.class, "itemStack;seller;price", "itemStack", "seller", "price"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11114.class, "itemStack;seller;price", "itemStack", "seller", "price"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11114.class, "itemStack;seller;price", "itemStack", "seller", "price"}, this);
    }

    public class06584 y() {
        return this.itemStack;
    }

    public long N() {
        return this.price;
    }
}

