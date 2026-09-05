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
import jdk.jfr.consumer.RecordedEvent;

public final class class03226
extends Record {
    private final double jvm;
    private final double userJvm;
    private final double system;

    public double L() {
        return this.system;
    }

    public class03226(double d, double d2, double d3) {
        this.jvm = d;
        this.userJvm = d2;
        this.system = d3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03226.class, "jvm;userJvm;system", "jvm", "userJvm", "system"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03226.class, "jvm;userJvm;system", "jvm", "userJvm", "system"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03226.class, "jvm;userJvm;system", "jvm", "userJvm", "system"}, this);
    }

    public double y() {
        return this.userJvm;
    }

    public double N() {
        return this.jvm;
    }

    public static class03226 N(RecordedEvent recordedEvent) {
        return new class03226(recordedEvent.getFloat("jvmSystem"), recordedEvent.getFloat("jvmUser"), recordedEvent.getFloat("machineTotal"));
    }
}

