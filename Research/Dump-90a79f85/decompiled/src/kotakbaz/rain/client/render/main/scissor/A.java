/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.scissor;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class A
extends Record {
    private final float a;
    private final float A;
    private final float b;
    private final float B;

    public A(float f2, float f3, float f4, float f5) {
        super();
        this.a = f2;
        this.A = f3;
        this.b = f4;
        this.B = f5;
    }

    public A intersection(A a2) {
        float f2 = Math.max(this.a, a2.a);
        float f3 = Math.max(this.A, a2.A);
        float f4 = Math.min(this.a + this.b, a2.a + a2.b);
        float f5 = Math.min(this.A + this.B, a2.A + a2.B);
        if (f4 < f2 || f5 < f3) {
            return new A(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return new A(f2, f3, f4 - f2, f5 - f3);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "x;y;width;height", "a", "A", "b", "B"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "x;y;width;height", "a", "A", "b", "B"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "x;y;width;height", "a", "A", "b", "B"}, this, object);
    }

    public float x() {
        return this.a;
    }

    public float y() {
        return this.A;
    }

    public float width() {
        return this.b;
    }

    public float height() {
        return this.B;
    }
}

