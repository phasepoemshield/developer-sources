/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalInt;
import minecraft.class02627;
import minecraft.class02632;

public final class class02649
extends Record {
    private final class02627 positionFunction;
    private final float uncertainty;
    private final float power;
    private final OptionalInt overrideDispenseEvent;
    public static final class02649 N = class02649.N().N();

    public float L() {
        return this.uncertainty;
    }

    public class02649(class02627 class026272, float f, float f2, OptionalInt optionalInt) {
        this.positionFunction = class026272;
        this.uncertainty = f;
        this.power = f2;
        this.overrideDispenseEvent = optionalInt;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02649.class, "positionFunction;uncertainty;power;overrideDispenseEvent", "positionFunction", "uncertainty", "power", "overrideDispenseEvent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02649.class, "positionFunction;uncertainty;power;overrideDispenseEvent", "positionFunction", "uncertainty", "power", "overrideDispenseEvent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02649.class, "positionFunction;uncertainty;power;overrideDispenseEvent", "positionFunction", "uncertainty", "power", "overrideDispenseEvent"}, this);
    }

    public OptionalInt i() {
        return this.overrideDispenseEvent;
    }

    public float u() {
        return this.power;
    }

    public class02627 y() {
        return this.positionFunction;
    }

    public static class02632 N() {
        return new class02632();
    }
}

