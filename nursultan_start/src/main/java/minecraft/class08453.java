/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00494
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00494;

public final class class08453
extends Record {
    private final float relativeX;
    private final float relativeY;
    private final float relativeZ;
    private final class00494 shapeBelow;
    private final float alpha;

    public float L() {
        return this.relativeZ;
    }

    public class08453(float f, float f2, float f3, class00494 class004942, float f4) {
        this.relativeX = f;
        this.relativeY = f2;
        this.relativeZ = f3;
        this.shapeBelow = class004942;
        this.alpha = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08453.class, "relativeX;relativeY;relativeZ;shapeBelow;alpha", "relativeX", "relativeY", "relativeZ", "shapeBelow", "alpha"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08453.class, "relativeX;relativeY;relativeZ;shapeBelow;alpha", "relativeX", "relativeY", "relativeZ", "shapeBelow", "alpha"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08453.class, "relativeX;relativeY;relativeZ;shapeBelow;alpha", "relativeX", "relativeY", "relativeZ", "shapeBelow", "alpha"}, this);
    }

    public float i() {
        return this.alpha;
    }

    public class00494 u() {
        return this.shapeBelow;
    }

    public float y() {
        return this.relativeY;
    }

    public float N() {
        return this.relativeX;
    }
}

