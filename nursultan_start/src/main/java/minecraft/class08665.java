/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03255
 *  minecraft.class08647
 *  minecraft.class08800
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03255;
import minecraft.class08647;
import minecraft.class08800;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public final class class08665
extends Record
implements class08647 {
    private final class08800 renderState;
    private final Vector3f translation;
    private final Quaternionf rotation;
    private final @Nullable Quaternionf overrideCameraAngle;
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;
    private final float scale;
    private final @Nullable class03255 scissorArea;
    private final @Nullable class03255 bounds;

    public Vector3f L() {
        return this.translation;
    }

    public int M() {
        return this.x1;
    }

    public class08665(class08800 class088002, Vector3f vector3f, Quaternionf quaternionf, @Nullable Quaternionf quaternionf2, int n, int n2, int n3, int n4, float f, @Nullable class03255 class032552) {
        this(class088002, vector3f, quaternionf, quaternionf2, n, n2, n3, n4, f, class032552, class08647.N((int)n, (int)n2, (int)n3, (int)n4, (class03255)class032552));
    }

    public class08665(class08800 class088002, Vector3f vector3f, Quaternionf quaternionf, @Nullable Quaternionf quaternionf2, int n, int n2, int n3, int n4, float f, @Nullable class03255 class032552, @Nullable class03255 class032553) {
        this.renderState = class088002;
        this.translation = vector3f;
        this.rotation = quaternionf;
        this.overrideCameraAngle = quaternionf2;
        this.x0 = n;
        this.y0 = n2;
        this.x1 = n3;
        this.y1 = n4;
        this.scale = f;
        this.scissorArea = class032552;
        this.bounds = class032553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08665.class, "renderState;translation;rotation;overrideCameraAngle;x0;y0;x1;y1;scale;scissorArea;bounds", "renderState", "translation", "rotation", "overrideCameraAngle", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08665.class, "renderState;translation;rotation;overrideCameraAngle;x0;y0;x1;y1;scale;scissorArea;bounds", "renderState", "translation", "rotation", "overrideCameraAngle", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08665.class, "renderState;translation;rotation;overrideCameraAngle;x0;y0;x1;y1;scale;scissorArea;bounds", "renderState", "translation", "rotation", "overrideCameraAngle", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this);
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

    public @Nullable Quaternionf z() {
        return this.overrideCameraAngle;
    }

    public Quaternionf u() {
        return this.rotation;
    }

    public class08800 y() {
        return this.renderState;
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

