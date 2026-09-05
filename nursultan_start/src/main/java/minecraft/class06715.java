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
import java.util.OptionalDouble;

public final class class06715
extends Record {
    final int color;
    final float scale;
    final OptionalDouble adjustLeft;
    public static final float u = 0.32f;

    public float L() {
        return this.scale;
    }

    public class06715(int n, float f, OptionalDouble optionalDouble) {
        this.color = n;
        this.scale = f;
        this.adjustLeft = optionalDouble;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06715.class, "color;scale;adjustLeft", "color", "scale", "adjustLeft"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06715.class, "color;scale;adjustLeft", "color", "scale", "adjustLeft"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06715.class, "color;scale;adjustLeft", "color", "scale", "adjustLeft"}, this);
    }

    public OptionalDouble u() {
        return this.adjustLeft;
    }

    public int y() {
        return this.color;
    }

    public class06715 y(float f) {
        return new class06715(this.color, this.scale, OptionalDouble.of(f));
    }

    public static class06715 y(int n) {
        return new class06715(n, 0.32f, OptionalDouble.of(0.0));
    }

    public static class06715 N() {
        return new class06715(-1, 0.32f, OptionalDouble.empty());
    }

    public class06715 N(float f) {
        return new class06715(this.color, f, this.adjustLeft);
    }

    public static class06715 N(int n) {
        return new class06715(n, 0.32f, OptionalDouble.empty());
    }
}

