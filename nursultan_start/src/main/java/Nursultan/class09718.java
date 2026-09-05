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

public final class class09718
extends Record {
    private final double ascent;
    private final double descent;
    private final double lineHeight;

    public double L() {
        return this.lineHeight;
    }

    public class09718(double d, double d2, double d3) {
        this.ascent = d;
        this.descent = d2;
        this.lineHeight = d3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09718.class, "ascent;descent;lineHeight", "ascent", "descent", "lineHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09718.class, "ascent;descent;lineHeight", "ascent", "descent", "lineHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09718.class, "ascent;descent;lineHeight", "ascent", "descent", "lineHeight"}, this);
    }

    public double y() {
        return this.descent;
    }

    public double N() {
        return this.ascent;
    }
}

