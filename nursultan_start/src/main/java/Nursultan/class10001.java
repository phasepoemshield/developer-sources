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

public final class class10001
extends Record {
    private final float trackWidth;
    private final float trackPadding;
    private final float trackPaddingY;
    private final float thumbMinHeight;
    private final int trackColor;
    private final int trackHoverColor;
    private final int trackActiveColor;
    private final int thumbColor;
    private final int thumbHoverColor;
    private final int thumbActiveColor;

    public float L() {
        return this.trackPaddingY;
    }

    public class10001 L(int n) {
        return new class10001(this.trackWidth, this.trackPadding, this.trackPaddingY, this.thumbMinHeight, this.trackColor, this.trackHoverColor, n, this.thumbColor, this.thumbHoverColor, this.thumbActiveColor);
    }

    public class10001 L(float f) {
        return new class10001(this.trackWidth, this.trackPadding, f, this.thumbMinHeight, this.trackColor, this.trackHoverColor, this.trackActiveColor, this.thumbColor, this.thumbHoverColor, this.thumbActiveColor);
    }

    public int M() {
        return this.trackActiveColor;
    }

    public class10001(float f, float f2, float f3, float f4, int n, int n2, int n3, int n4, int n5, int n6) {
        f = Math.max(0.0f, f);
        f2 = Math.max(0.0f, f2);
        f3 = Math.max(0.0f, f3);
        f4 = Math.max(0.0f, f4);
        this.trackWidth = f;
        this.trackPadding = f2;
        this.trackPaddingY = f3;
        this.thumbMinHeight = f4;
        this.trackColor = n;
        this.trackHoverColor = n2;
        this.trackActiveColor = n3;
        this.thumbColor = n4;
        this.thumbHoverColor = n5;
        this.thumbActiveColor = n6;
    }

    public class10001(float f, float f2, float f3, int n, int n2, int n3, int n4, int n5, int n6) {
        this(f, f2, f2, f3, n, n2, n3, n4, n5, n6);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10001.class, "trackWidth;trackPadding;trackPaddingY;thumbMinHeight;trackColor;trackHoverColor;trackActiveColor;thumbColor;thumbHoverColor;thumbActiveColor", "trackWidth", "trackPadding", "trackPaddingY", "thumbMinHeight", "trackColor", "trackHoverColor", "trackActiveColor", "thumbColor", "thumbHoverColor", "thumbActiveColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10001.class, "trackWidth;trackPadding;trackPaddingY;thumbMinHeight;trackColor;trackHoverColor;trackActiveColor;thumbColor;thumbHoverColor;thumbActiveColor", "trackWidth", "trackPadding", "trackPaddingY", "thumbMinHeight", "trackColor", "trackHoverColor", "trackActiveColor", "thumbColor", "thumbHoverColor", "thumbActiveColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10001.class, "trackWidth;trackPadding;trackPaddingY;thumbMinHeight;trackColor;trackHoverColor;trackActiveColor;thumbColor;thumbHoverColor;thumbActiveColor", "trackWidth", "trackPadding", "trackPaddingY", "thumbMinHeight", "trackColor", "trackHoverColor", "trackActiveColor", "thumbColor", "thumbHoverColor", "thumbActiveColor"}, this);
    }

    public int B() {
        return this.thumbColor;
    }

    public int Z() {
        return this.thumbHoverColor;
    }

    public class10001 i(int n) {
        return new class10001(this.trackWidth, this.trackPadding, this.trackPaddingY, this.thumbMinHeight, this.trackColor, this.trackHoverColor, this.trackActiveColor, this.thumbColor, n, this.thumbActiveColor);
    }

    public int i() {
        return this.trackColor;
    }

    public int z() {
        return this.thumbActiveColor;
    }

    public float u() {
        return this.thumbMinHeight;
    }

    public class10001 u(float f) {
        return new class10001(this.trackWidth, this.trackPadding, this.trackPaddingY, f, this.trackColor, this.trackHoverColor, this.trackActiveColor, this.thumbColor, this.thumbHoverColor, this.thumbActiveColor);
    }

    public class10001 u(int n) {
        return new class10001(this.trackWidth, this.trackPadding, this.trackPaddingY, this.thumbMinHeight, this.trackColor, this.trackHoverColor, this.trackActiveColor, n, this.thumbHoverColor, this.thumbActiveColor);
    }

    public boolean y(class10001 class100012) {
        if (class100012 == null) {
            return false;
        }
        return Float.compare(this.trackPadding, class100012.trackPadding) == 0 && Float.compare(this.trackPaddingY, class100012.trackPaddingY) == 0 && Float.compare(this.thumbMinHeight, class100012.thumbMinHeight) == 0 && this.trackColor == class100012.trackColor && this.trackHoverColor == class100012.trackHoverColor && this.trackActiveColor == class100012.trackActiveColor && this.thumbColor == class100012.thumbColor && this.thumbHoverColor == class100012.thumbHoverColor && this.thumbActiveColor == class100012.thumbActiveColor;
    }

    public class10001 y(int n) {
        return new class10001(this.trackWidth, this.trackPadding, this.trackPaddingY, this.thumbMinHeight, this.trackColor, n, this.trackActiveColor, this.thumbColor, this.thumbHoverColor, this.thumbActiveColor);
    }

    public class10001 y(float f) {
        return new class10001(this.trackWidth, f, f, this.thumbMinHeight, this.trackColor, this.trackHoverColor, this.trackActiveColor, this.thumbColor, this.thumbHoverColor, this.thumbActiveColor);
    }

    public float y() {
        return this.trackPadding;
    }

    public boolean N(class10001 class100012) {
        if (class100012 == null) {
            return false;
        }
        return Float.compare(this.trackWidth, class100012.trackWidth) == 0;
    }

    public class10001 N(float f) {
        return new class10001(f, this.trackPadding, this.trackPaddingY, this.thumbMinHeight, this.trackColor, this.trackHoverColor, this.trackActiveColor, this.thumbColor, this.thumbHoverColor, this.thumbActiveColor);
    }

    public float N() {
        return this.trackWidth;
    }

    public class10001 N(int n) {
        return new class10001(this.trackWidth, this.trackPadding, this.trackPaddingY, this.thumbMinHeight, n, this.trackHoverColor, this.trackActiveColor, this.thumbColor, this.thumbHoverColor, this.thumbActiveColor);
    }

    public class10001 R(int n) {
        return new class10001(this.trackWidth, this.trackPadding, this.trackPaddingY, this.thumbMinHeight, this.trackColor, this.trackHoverColor, this.trackActiveColor, this.thumbColor, this.thumbHoverColor, n);
    }

    public int R() {
        return this.trackHoverColor;
    }
}

