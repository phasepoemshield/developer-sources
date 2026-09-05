/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09830
extends Record {
    private final float trackX;
    private final float trackY;
    private final float trackWidth;
    private final float trackHeight;
    private final float trackContentX;
    private final float trackContentY;
    private final float trackContentWidth;
    private final float trackContentHeight;
    private final float thumbX;
    private final float thumbY;
    private final float thumbWidth;
    private final float thumbHeight;
    private final float thumbTravel;

    public float L() {
        return this.trackWidth;
    }

    public float M() {
        return this.trackContentWidth;
    }

    public class09830(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.trackX = f;
        this.trackY = f2;
        this.trackWidth = f3;
        this.trackHeight = f4;
        this.trackContentX = f5;
        this.trackContentY = f6;
        this.trackContentWidth = f7;
        this.trackContentHeight = f8;
        this.thumbX = f9;
        this.thumbY = f10;
        this.thumbWidth = f11;
        this.thumbHeight = f12;
        this.thumbTravel = f13;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09830.class, "trackX;trackY;trackWidth;trackHeight;trackContentX;trackContentY;trackContentWidth;trackContentHeight;thumbX;thumbY;thumbWidth;thumbHeight;thumbTravel", "trackX", "trackY", "trackWidth", "trackHeight", "trackContentX", "trackContentY", "trackContentWidth", "trackContentHeight", "thumbX", "thumbY", "thumbWidth", "thumbHeight", "thumbTravel"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09830.class, "trackX;trackY;trackWidth;trackHeight;trackContentX;trackContentY;trackContentWidth;trackContentHeight;thumbX;thumbY;thumbWidth;thumbHeight;thumbTravel", "trackX", "trackY", "trackWidth", "trackHeight", "trackContentX", "trackContentY", "trackContentWidth", "trackContentHeight", "thumbX", "thumbY", "thumbWidth", "thumbHeight", "thumbTravel"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09830.class, "trackX;trackY;trackWidth;trackHeight;trackContentX;trackContentY;trackContentWidth;trackContentHeight;thumbX;thumbY;thumbWidth;thumbHeight;thumbTravel", "trackX", "trackY", "trackWidth", "trackHeight", "trackContentX", "trackContentY", "trackContentWidth", "trackContentHeight", "thumbX", "thumbY", "thumbWidth", "thumbHeight", "thumbTravel"}, this);
    }

    public float B() {
        return this.trackContentHeight;
    }

    public float Z() {
        return this.thumbX;
    }

    public float i() {
        return this.trackContentX;
    }

    public float U() {
        return this.thumbWidth;
    }

    public float z() {
        return this.thumbY;
    }

    public float u() {
        return this.trackHeight;
    }

    public float y() {
        return this.trackY;
    }

    public float E() {
        return this.thumbHeight;
    }

    public float N() {
        return this.trackX;
    }

    public float W() {
        return this.thumbTravel;
    }

    public float R() {
        return this.trackContentY;
    }
}

