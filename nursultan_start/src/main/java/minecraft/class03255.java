/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03283
 *  minecraft.class03287
 *  minecraft.class04995
 *  org.joml.Matrix3x2fc
 *  org.joml.Vector2f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03249;
import minecraft.class03283;
import minecraft.class03287;
import minecraft.class04995;
import org.joml.Matrix3x2fc;
import org.joml.Vector2f;
import org.jspecify.annotations.Nullable;

public final class class03255
extends Record {
    private final class03283 position;
    private final int width;
    private final int height;
    private static final class03255 u = new class03255(0, 0, 0, 0);

    public boolean L(class03255 class032552) {
        return this.u() < class032552.i() && this.i() > class032552.u() && this.y() < class032552.L() && this.L() > class032552.y();
    }

    public class03255 L(class03249 class032492) {
        int n = this.y(class032492);
        class03287 class032872 = class032492.N().N();
        int n2 = this.y(class032872.L());
        int n3 = this.N(class032872);
        return class03255.N(class032492.N(), n, n2, 1, n3).N(class032492);
    }

    public int L() {
        return this.position.y() + this.height;
    }

    public int M() {
        return this.width;
    }

    public class03255(int n, int n2, int n3, int n4) {
        this(new class03283(n, n2), n3, n4);
    }

    public class03255(class03283 class032832, int n, int n2) {
        this.position = class032832;
        this.width = n;
        this.height = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03255.class, "position;width;height", "position", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03255.class, "position;width;height", "position", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03255.class, "position;width;height", "position", "width", "height"}, this);
    }

    public int B() {
        return this.height;
    }

    public int i() {
        return this.position.N() + this.width;
    }

    public int u() {
        return this.position.N();
    }

    public boolean u(class03255 class032552) {
        return class032552.u() >= this.u() && class032552.y() >= this.y() && class032552.i() <= this.i() && class032552.L() <= this.L();
    }

    public int y(class03249 class032492) {
        class03287 class032872 = class032492.N();
        if (class032492.L()) {
            return this.position.N(class032872) + this.N(class032872) - 1;
        }
        return this.position.N(class032872);
    }

    public int y() {
        return this.position.y();
    }

    public class03255 y(Matrix3x2fc matrix3x2fc) {
        Vector2f vector2f = matrix3x2fc.transformPosition((float)this.u(), (float)this.y(), new Vector2f());
        Vector2f vector2f2 = matrix3x2fc.transformPosition((float)this.i(), (float)this.y(), new Vector2f());
        Vector2f vector2f3 = matrix3x2fc.transformPosition((float)this.u(), (float)this.L(), new Vector2f());
        Vector2f vector2f4 = matrix3x2fc.transformPosition((float)this.i(), (float)this.L(), new Vector2f());
        float f = Math.min(Math.min(vector2f.x(), vector2f3.x()), Math.min(vector2f2.x(), vector2f4.x()));
        float f2 = Math.max(Math.max(vector2f.x(), vector2f3.x()), Math.max(vector2f2.x(), vector2f4.x()));
        float f3 = Math.min(Math.min(vector2f.y(), vector2f3.y()), Math.min(vector2f2.y(), vector2f4.y()));
        float f4 = Math.max(Math.max(vector2f.y(), vector2f3.y()), Math.max(vector2f2.y(), vector2f4.y()));
        return new class03255(class04995.y((float)f), class04995.y((float)f3), class04995.u((float)(f2 - f)), class04995.u((float)(f4 - f3)));
    }

    public int y(class03287 class032872) {
        return (this.y(class032872.y()) + this.y(class032872.L())) / 2;
    }

    public @Nullable class03255 y(class03255 class032552) {
        int n = Math.max(this.u(), class032552.u());
        int n2 = Math.max(this.y(), class032552.y());
        int n3 = Math.min(this.i(), class032552.i());
        int n4 = Math.min(this.L(), class032552.L());
        if (n >= n3 || n2 >= n4) {
            return null;
        }
        return new class03255(n, n2, n3 - n, n4 - n2);
    }

    public static class03255 N(class03287 class032872, int n, int n2, int n3, int n4) {
        return switch (class032872) {
            default -> throw new MatchException(null, null);
            case class03287.field_41822 -> new class03255(n, n2, n3, n4);
            case class03287.field_41823 -> new class03255(n2, n, n4, n3);
        };
    }

    public static class03255 N() {
        return u;
    }

    public boolean N(class03255 class032552, class03287 class032872) {
        int n = this.y(class032872.L());
        int n2 = class032552.y(class032872.L());
        int n3 = this.y(class032872.y());
        int n4 = class032552.y(class032872.y());
        return Math.max(n, n2) <= Math.min(n3, n4);
    }

    public boolean N(class03255 class032552) {
        return this.N(class032552, class03287.field_41822) && this.N(class032552, class03287.field_41823);
    }

    public boolean N(int n, int n2) {
        return n >= this.u() && n < this.i() && n2 >= this.y() && n2 < this.L();
    }

    public class03255 N(Matrix3x2fc matrix3x2fc) {
        Vector2f vector2f = matrix3x2fc.transformPosition((float)this.u(), (float)this.y(), new Vector2f());
        Vector2f vector2f2 = matrix3x2fc.transformPosition((float)this.i(), (float)this.L(), new Vector2f());
        return new class03255(class04995.y((float)vector2f.x), class04995.y((float)vector2f.y), class04995.y((float)(vector2f2.x - vector2f.x)), class04995.y((float)(vector2f2.y - vector2f.y)));
    }

    public class03255 N(class03249 class032492) {
        return new class03255(this.position.N(class032492), this.width, this.height);
    }

    public int N(class03287 class032872) {
        return switch (class032872) {
            default -> throw new MatchException(null, null);
            case class03287.field_41822 -> this.width;
            case class03287.field_41823 -> this.height;
        };
    }

    public class03283 R() {
        return this.position;
    }
}

