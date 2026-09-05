/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09173
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09173;
import Nursultan.class11386;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11398
extends Record {
    public class11386 change;
    public class09173 bind;

    public class11398(class09173 class091732, class11386 class113862) {
        this.bind = class091732;
        this.change = class113862;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11398.class, "bind;change", "bind", "change"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11398.class, "bind;change", "bind", "change"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11398.class, "bind;change", "bind", "change"}, this);
    }

    public class09173 y() {
        return this.bind;
    }

    public static class11398 N(class09173 class091732, class11386 class113862) {
        return new class11398(class091732, class113862);
    }

    public class11386 N() {
        return this.change;
    }
}

