/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00912
 *  minecraft.class00947
 *  minecraft.class05237
 *  minecraft.class05247
 *  minecraft.class07948
 *  minecraft.class08280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00912;
import minecraft.class00947;
import minecraft.class05237;
import minecraft.class05247;
import minecraft.class05651;
import minecraft.class07948;
import minecraft.class08280;

final class class05656
extends Record
implements class00947 {
    final float scale;
    final class08280 image;
    final int offsetX;
    final int offsetY;
    final int width;
    final int height;
    private final int advance;
    final int ascent;

    public class08280 L() {
        return this.image;
    }

    public int M() {
        return this.height;
    }

    class05656(float f, class08280 class082802, int n, int n2, int n3, int n4, int n5, int n6) {
        this.scale = f;
        this.image = class082802;
        this.offsetX = n;
        this.offsetY = n2;
        this.width = n3;
        this.height = n4;
        this.advance = n5;
        this.ascent = n6;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05656.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "scale", "image", "offsetX", "offsetY", "width", "height", "advance", "ascent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05656.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "scale", "image", "offsetX", "offsetY", "width", "height", "advance", "ascent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05656.class, "scale;image;offsetX;offsetY;width;height;advance;ascent", "scale", "image", "offsetX", "offsetY", "width", "height", "advance", "ascent"}, this);
    }

    public int B() {
        return this.advance;
    }

    public int Z() {
        return this.ascent;
    }

    public int i() {
        return this.offsetY;
    }

    public int u() {
        return this.offsetX;
    }

    public float y() {
        return this.scale;
    }

    public class07948 N(class00912 class009122) {
        return class009122.N(this.N(), (class05237)new class05651(this));
    }

    public class05247 N() {
        return class05247.N((float)this.advance);
    }

    public int R() {
        return this.width;
    }
}

