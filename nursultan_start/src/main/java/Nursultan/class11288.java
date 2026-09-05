/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05194
 *  minecraft.class05216
 *  minecraft.class06541
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11287;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05194;
import minecraft.class05216;
import minecraft.class06541;

public class class11288
extends Record
implements class11287 {
    public class11067 module;
    private static String[] y;

    private static void L() {
        y = new String[1];
        class11288.y[0] = " \u21e8 ";
    }

    public class11288(class11067 class110672) {
        this.module = class110672;
    }

    static {
        class11288.L();
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11288.class, "module", "module"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11288.class, "module", "module"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11288.class, "module", "module"}, this);
    }

    public class11067 y() {
        return this.module;
    }

    @Override
    public class05216 N() {
        class05216 class052162 = class00392.y((String)y[0]).y(class00405.N.N(class05194.N((class06541)class06541.field_1080)));
        return class00392.y((String)this.module.N()).y((class00392)class052162);
    }
}

