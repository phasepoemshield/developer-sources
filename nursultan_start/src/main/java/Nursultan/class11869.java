/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09777
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09991
 *  Nursultan.class11938
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class09777;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09991;
import Nursultan.class11834;
import Nursultan.class11849;
import Nursultan.class11867;
import Nursultan.class11938;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06584;

public class class11869
extends Record
implements class11849 {
    public class06584 stack;
    public static Object y_0;
    public static Object y_1;

    private static void L() {
        y_0 = 16;
    }

    public class11869(class06584 class065842) {
        this.stack = class065842;
    }

    static {
        class11869.L();
        y_1 = class09991.N().u(16.0f, 16.0f);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11869.class, "stack", "stack"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11869.class, "stack", "stack"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11869.class, "stack", "stack"}, this);
    }

    public class06584 N() {
        return this.stack;
    }

    @Override
    public class09798 N(class09809 class098092, class11834 class118342) {
        String string = "notify-item-" + class118342.N();
        class11867 class118672 = class11938.k().N(this.stack);
        if (!class118672.L()) {
            return class09778.N(class097842 -> ((class09784)class097842.N(string)).N((class09991)y_1));
        }
        class09991 class099912 = class09991.N((class09991[])new class09991[]{(class09991)y_1, class09991.N().N(class118672.y(), class118672.N(), class118672.R(), class118672.i())});
        return ((class09777)((class09777)class09778.y((String)class11938.k().y()).N(string)).N(class099912)).i();
    }
}

