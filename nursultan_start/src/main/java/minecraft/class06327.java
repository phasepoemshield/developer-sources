/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01423
 *  minecraft.class07311
 *  minecraft.class08887
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01423;
import minecraft.class07311;
import minecraft.class08887;

public final class class06327
extends Record {
    private final class01423 pose;
    private final class07311 renderType;
    private final class08887 model;
    private final float r;
    private final float g;
    private final float b;
    private final int lightCoords;
    private final int overlayCoords;
    private final int outlineColor;

    public class08887 L() {
        return this.model;
    }

    public int M() {
        return this.lightCoords;
    }

    public class06327(class01423 class014232, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3) {
        this.pose = class014232;
        this.renderType = class073112;
        this.model = class088872;
        this.r = f;
        this.g = f2;
        this.b = f3;
        this.lightCoords = n;
        this.overlayCoords = n2;
        this.outlineColor = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06327.class, "pose;renderType;model;r;g;b;lightCoords;overlayCoords;outlineColor", "pose", "renderType", "model", "r", "g", "b", "lightCoords", "overlayCoords", "outlineColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06327.class, "pose;renderType;model;r;g;b;lightCoords;overlayCoords;outlineColor", "pose", "renderType", "model", "r", "g", "b", "lightCoords", "overlayCoords", "outlineColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06327.class, "pose;renderType;model;r;g;b;lightCoords;overlayCoords;outlineColor", "pose", "renderType", "model", "r", "g", "b", "lightCoords", "overlayCoords", "outlineColor"}, this);
    }

    public int B() {
        return this.overlayCoords;
    }

    public int Z() {
        return this.outlineColor;
    }

    public float i() {
        return this.g;
    }

    public float u() {
        return this.r;
    }

    public class07311 y() {
        return this.renderType;
    }

    public class01423 N() {
        return this.pose;
    }

    public float R() {
        return this.b;
    }
}

