/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03255
 *  minecraft.class08647
 *  minecraft.class08650
 *  org.joml.Matrix3x2f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03255;
import minecraft.class08647;
import minecraft.class08650;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public final class class08778
extends Record
implements class08647 {
    private final class08650 guiItemRenderState;
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;

    public int M() {
        return this.x1;
    }

    public class08778(class08650 class086502, int n, int n2, int n3, int n4) {
        this.guiItemRenderState = class086502;
        this.x0 = n;
        this.y0 = n2;
        this.x1 = n3;
        this.y1 = n4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08778.class, "guiItemRenderState;x0;y0;x1;y1", "guiItemRenderState", "x0", "y0", "x1", "y1"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08778.class, "guiItemRenderState;x0;y0;x1;y1", "guiItemRenderState", "x0", "y0", "x1", "y1"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08778.class, "guiItemRenderState;x0;y0;x1;y1", "guiItemRenderState", "x0", "y0", "x1", "y1"}, this);
    }

    public int B() {
        return this.y1;
    }

    public @Nullable class03255 Z() {
        return this.guiItemRenderState.R();
    }

    public int i() {
        return this.x0;
    }

    public class08650 y() {
        return this.guiItemRenderState;
    }

    public Matrix3x2f E() {
        return this.guiItemRenderState.y();
    }

    public float N() {
        return 16.0f;
    }

    public @Nullable class03255 comp_4274() {
        return this.guiItemRenderState.comp_4274();
    }

    public int R() {
        return this.y0;
    }
}

