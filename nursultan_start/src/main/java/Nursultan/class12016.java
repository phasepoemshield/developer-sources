/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class11938;
import Nursultan.class12040;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06202;

public class class12016
extends Record
implements class12040 {
    public int delay;

    public class12016(int n) {
        this.delay = class11938.j().y() + n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class12016.class, "delay", "delay"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class12016.class, "delay", "delay"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class12016.class, "delay", "delay"}, this);
    }

    @Override
    public void accept(class06202 class062022) {
    }

    public int N() {
        return this.delay;
    }

    @Override
    public boolean test(class06202 class062022) {
        return class11938.j().y() > this.delay;
    }
}

