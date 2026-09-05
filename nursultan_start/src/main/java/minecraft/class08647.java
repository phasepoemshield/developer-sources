/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03255
 *  minecraft.class08320
 *  org.joml.Matrix3x2f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class03255;
import minecraft.class08320;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public interface class08647
extends class08320 {
    public static final Matrix3x2f N = new Matrix3x2f();

    public int M();

    public int B();

    public @Nullable class03255 Z();

    public int i();

    default public Matrix3x2f E() {
        return N;
    }

    public float N();

    public static @Nullable class03255 N(int n, int n2, int n3, int n4, @Nullable class03255 class032552) {
        class03255 class032553 = new class03255(n, n2, n3 - n, n4 - n2);
        return class032552 != null ? class032552.y(class032553) : class032553;
    }

    public int R();
}

