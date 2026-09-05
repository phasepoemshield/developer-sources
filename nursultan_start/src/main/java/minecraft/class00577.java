/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03255
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import minecraft.class03255;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class class00577
extends Record {
    private final Matrix3x2fc pose;
    private final float opacity;
    private final @Nullable class03255 scissor;

    public @Nullable class03255 L() {
        return this.scissor;
    }

    public class00577(Matrix3x2fc matrix3x2fc) {
        this(matrix3x2fc, 1.0f, null);
    }

    public class00577(Matrix3x2fc matrix3x2fc, float f, @Nullable class03255 class032552) {
        this.pose = matrix3x2fc;
        this.opacity = f;
        this.scissor = class032552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00577.class, "pose;opacity;scissor", "pose", "opacity", "scissor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00577.class, "pose;opacity;scissor", "pose", "opacity", "scissor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00577.class, "pose;opacity;scissor", "pose", "opacity", "scissor"}, this);
    }

    public class00577 y(float f) {
        if (this.opacity == f) {
            return this;
        }
        return new class00577(this.pose, f, this.scissor);
    }

    public float y() {
        return this.opacity;
    }

    public class00577 N(int n, int n2, int n3, int n4) {
        class03255 class032552 = new class03255(n, n3, n2 - n, n4 - n3).N(this.pose);
        if (this.scissor != null) {
            class032552 = Objects.requireNonNullElse(this.scissor.y(class032552), class03255.N());
        }
        return this.N(class032552);
    }

    public Matrix3x2fc N() {
        return this.pose;
    }

    public class00577 N(Matrix3x2fc matrix3x2fc) {
        return new class00577(matrix3x2fc, this.opacity, this.scissor);
    }

    public class00577 N(class03255 class032552) {
        if (class032552.equals((Object)this.scissor)) {
            return this;
        }
        return new class00577(this.pose, this.opacity, class032552);
    }

    public class00577 N(float f) {
        return this.N((Matrix3x2fc)this.pose.scale(f, f, new Matrix3x2f()));
    }
}

