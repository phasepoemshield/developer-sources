/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class01423
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class01423;

public final class class01143
extends Record {
    private final class01423 pose;
    private final class00500 state;
    private final int lightCoords;
    private final int overlayCoords;
    private final int outlineColor;

    public int L() {
        return this.lightCoords;
    }

    public class01143(class01423 class014232, class00500 class005002, int n, int n2, int n3) {
        this.pose = class014232;
        this.state = class005002;
        this.lightCoords = n;
        this.overlayCoords = n2;
        this.outlineColor = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01143.class, "pose;state;lightCoords;overlayCoords;outlineColor", "pose", "state", "lightCoords", "overlayCoords", "outlineColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01143.class, "pose;state;lightCoords;overlayCoords;outlineColor", "pose", "state", "lightCoords", "overlayCoords", "outlineColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01143.class, "pose;state;lightCoords;overlayCoords;outlineColor", "pose", "state", "lightCoords", "overlayCoords", "outlineColor"}, this);
    }

    public int i() {
        return this.outlineColor;
    }

    public int u() {
        return this.overlayCoords;
    }

    public class00500 y() {
        return this.state;
    }

    public class01423 N() {
        return this.pose;
    }
}

