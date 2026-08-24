/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.scissor;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record A(float y, float width, float x, float height) {
    public A(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public final boolean equals(Object o) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "x;y;width;height", "x", "y", "width", "height"}, this, o);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public A intersection(A other) {
        float x1 = Math.max(this.x, other.x);
        float y1 = Math.max(this.y, other.y);
        float x2 = Math.min(this.x + this.width, other.x + other.width);
        float y2 = Math.min(this.y + this.height, other.y + other.height);
        if (x2 < x1 || y2 < y1) {
            return new A(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return new A(x1, y1, x2 - x1, y2 - y1);
    }
}

