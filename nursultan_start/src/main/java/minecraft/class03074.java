/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06732
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06732;

final class class03074
extends Record {
    private final class06732 standardPrimitives;
    private final class06732 alwaysOnTopPrimitives;

    class03074(class06732 class067322, class06732 class067323) {
        this.standardPrimitives = class067322;
        this.alwaysOnTopPrimitives = class067323;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03074.class, "standardPrimitives;alwaysOnTopPrimitives", "standardPrimitives", "alwaysOnTopPrimitives"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03074.class, "standardPrimitives;alwaysOnTopPrimitives", "standardPrimitives", "alwaysOnTopPrimitives"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03074.class, "standardPrimitives;alwaysOnTopPrimitives", "standardPrimitives", "alwaysOnTopPrimitives"}, this);
    }

    public class06732 y() {
        return this.alwaysOnTopPrimitives;
    }

    public class06732 N() {
        return this.standardPrimitives;
    }
}

