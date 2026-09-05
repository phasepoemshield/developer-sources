/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09838
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09838;
import Nursultan.class09924;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09902
extends Record
implements class09924 {
    private final String text;
    private final float x;
    private final float y;
    private final int color;
    private final float fontSize;
    private final class09838 fontSpec;

    public float L() {
        return this.y;
    }

    public class09902(String string, float f, float f2, int n, float f3, class09838 class098382) {
        this.text = string;
        this.x = f;
        this.y = f2;
        this.color = n;
        this.fontSize = f3;
        this.fontSpec = class098382;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09902.class, "text;x;y;color;fontSize;fontSpec", "text", "x", "y", "color", "fontSize", "fontSpec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09902.class, "text;x;y;color;fontSize;fontSpec", "text", "x", "y", "color", "fontSize", "fontSpec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09902.class, "text;x;y;color;fontSize;fontSpec", "text", "x", "y", "color", "fontSize", "fontSpec"}, this);
    }

    public float i() {
        return this.fontSize;
    }

    public int u() {
        return this.color;
    }

    public float y() {
        return this.x;
    }

    public String N() {
        return this.text;
    }

    public class09838 R() {
        return this.fontSpec;
    }
}

