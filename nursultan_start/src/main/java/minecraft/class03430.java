/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00869
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class00869;

public final class class03430
extends Record {
    final int fluidLevel;
    final class00500 fluidType;

    public class03430(int n, class00500 class005002) {
        this.fluidLevel = n;
        this.fluidType = class005002;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03430.class, "fluidLevel;fluidType", "fluidLevel", "fluidType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03430.class, "fluidLevel;fluidType", "fluidLevel", "fluidType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03430.class, "fluidLevel;fluidType", "fluidLevel", "fluidType"}, this);
    }

    public class00500 y() {
        return this.fluidType;
    }

    public int N() {
        return this.fluidLevel;
    }

    public class00500 N(int n) {
        return n < this.fluidLevel ? this.fluidType : class00869.N.W();
    }
}

