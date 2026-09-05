/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class12040;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06202;

public class class12008
extends Record
implements class12040 {
    public Runnable runnable;

    public class12008(Runnable runnable) {
        this.runnable = runnable;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class12008.class, "runnable", "runnable"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class12008.class, "runnable", "runnable"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class12008.class, "runnable", "runnable"}, this);
    }

    @Override
    public void accept(class06202 class062022) {
        this.runnable.run();
    }

    public Runnable N() {
        return this.runnable;
    }
}

