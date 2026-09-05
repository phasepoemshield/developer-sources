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
import minecraft.class02769;

final class class02744
extends Record {
    final float partialTicksInStep;
    final class02769 currentStep;
    final class02769 previousStep;

    public class02769 L() {
        return this.previousStep;
    }

    class02744(float f, class02769 class027692, class02769 class027693) {
        this.partialTicksInStep = f;
        this.currentStep = class027692;
        this.previousStep = class027693;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02744.class, "partialTicksInStep;currentStep;previousStep", "partialTicksInStep", "currentStep", "previousStep"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02744.class, "partialTicksInStep;currentStep;previousStep", "partialTicksInStep", "currentStep", "previousStep"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02744.class, "partialTicksInStep;currentStep;previousStep", "partialTicksInStep", "currentStep", "previousStep"}, this);
    }

    public class02769 y() {
        return this.currentStep;
    }

    public float N() {
        return this.partialTicksInStep;
    }
}

