/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10312
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01921
 *  minecraft.class02038
 *  minecraft.class03515
 */
package minecraft;

import Nursultan.class10312;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01921;
import minecraft.class02038;
import minecraft.class03515;

public final class class04132<T>
extends Record {
    private final class01921<T> lookup;
    private final class03515<T> opsInfo;

    class04132(class01921<T> class019212, class03515<T> class035152) {
        this.lookup = class019212;
        this.opsInfo = class035152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04132.class, "lookup;opsInfo", "lookup", "opsInfo"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04132.class, "lookup;opsInfo", "lookup", "opsInfo"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04132.class, "lookup;opsInfo", "lookup", "opsInfo"}, this);
    }

    public class03515<T> y() {
        return this.opsInfo;
    }

    public static <T> class04132<T> N(class02038 class020382, class01921<T> class019212) {
        return new class04132<T>(new class10312(class020382.N(), class019212), new class03515(class020382.N(), class019212, class019212.R()));
    }

    public class01921<T> N() {
        return this.lookup;
    }

    public static <T> class04132<T> N(class01921<T> class019212) {
        return new class04132<T>(new class10312(class019212, class019212), class03515.N(class019212));
    }
}

