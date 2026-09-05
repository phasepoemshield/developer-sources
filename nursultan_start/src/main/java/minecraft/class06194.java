/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05096
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05096;

final class class06194
extends Record {
    private final long time;
    private final class05096 screen;

    class06194(long l, class05096 class050962) {
        this.time = l;
        this.screen = class050962;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06194.class, "time;screen", "time", "screen"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06194.class, "time;screen", "time", "screen"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06194.class, "time;screen", "time", "screen"}, this);
    }

    public class05096 y() {
        return this.screen;
    }

    public long N() {
        return this.time;
    }
}

