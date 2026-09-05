/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02721
 *  minecraft.class03255
 *  minecraft.class08647
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02721;
import minecraft.class03255;
import minecraft.class08647;
import org.jspecify.annotations.Nullable;

public final class class08676
extends Record
implements class08647 {
    private final class02721 playerModel;
    private final class01894 texture;
    private final float rotationX;
    private final float rotationY;
    private final float pivotY;
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;
    private final float scale;
    private final @Nullable class03255 scissorArea;
    private final @Nullable class03255 bounds;

    public class01894 L() {
        return this.texture;
    }

    public int M() {
        return this.x1;
    }

    public class08676(class02721 class027212, class01894 class018942, float f, float f2, float f3, int n, int n2, int n3, int n4, float f4, @Nullable class03255 class032552) {
        this(class027212, class018942, f, f2, f3, n, n2, n3, n4, f4, class032552, class08647.N((int)n, (int)n2, (int)n3, (int)n4, (class03255)class032552));
    }

    public class08676(class02721 class027212, class01894 class018942, float f, float f2, float f3, int n, int n2, int n3, int n4, float f4, @Nullable class03255 class032552, @Nullable class03255 class032553) {
        this.playerModel = class027212;
        this.texture = class018942;
        this.rotationX = f;
        this.rotationY = f2;
        this.pivotY = f3;
        this.x0 = n;
        this.y0 = n2;
        this.x1 = n3;
        this.y1 = n4;
        this.scale = f4;
        this.scissorArea = class032552;
        this.bounds = class032553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08676.class, "playerModel;texture;rotationX;rotationY;pivotY;x0;y0;x1;y1;scale;scissorArea;bounds", "playerModel", "texture", "rotationX", "rotationY", "pivotY", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08676.class, "playerModel;texture;rotationX;rotationY;pivotY;x0;y0;x1;y1;scale;scissorArea;bounds", "playerModel", "texture", "rotationX", "rotationY", "pivotY", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08676.class, "playerModel;texture;rotationX;rotationY;pivotY;x0;y0;x1;y1;scale;scissorArea;bounds", "playerModel", "texture", "rotationX", "rotationY", "pivotY", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this);
    }

    public int B() {
        return this.y1;
    }

    public @Nullable class03255 Z() {
        return this.scissorArea;
    }

    public int i() {
        return this.x0;
    }

    public float U() {
        return this.pivotY;
    }

    public float z() {
        return this.rotationY;
    }

    public float u() {
        return this.rotationX;
    }

    public class02721 y() {
        return this.playerModel;
    }

    public float N() {
        return this.scale;
    }

    public @Nullable class03255 comp_4274() {
        return this.bounds;
    }

    public int R() {
        return this.y0;
    }
}

