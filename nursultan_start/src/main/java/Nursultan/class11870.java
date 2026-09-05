/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class12018;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11870
extends Record {
    public Runnable onClick;
    public class12018 key;

    public class11870(class12018 class120182, Runnable runnable) {
        this.key = class120182;
        this.onClick = runnable;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11870.class, "key;onClick", "key", "onClick"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11870.class, "key;onClick", "key", "onClick"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11870.class, "key;onClick", "key", "onClick"}, this);
    }

    public class12018 y() {
        return this.key;
    }

    public Runnable N() {
        return this.onClick;
    }
}

