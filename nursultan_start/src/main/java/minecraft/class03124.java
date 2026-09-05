/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03106;
import minecraft.class04248;
import minecraft.class07280;

public final class class03124
extends Record
implements class00381<class07280> {
    private final int tickSteps;
    public static final class02362<class00667, class03124> N = class00381.N(class03124::N, class03124::new);

    private class03124(class00667 class006672) {
        this(class006672.E());
    }

    public class03124(int n) {
        this.tickSteps = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03124.class, "tickSteps", "tickSteps"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03124.class, "tickSteps", "tickSteps"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03124.class, "tickSteps", "tickSteps"}, this);
    }

    private void N(class00667 class006672) {
        class006672.L(this.tickSteps);
    }

    public int N() {
        return this.tickSteps;
    }

    public static class03124 N(class03106 class031062) {
        return new class03124(class031062.U());
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class03124> method_65080() {
        return class04248.Ld;
    }
}

