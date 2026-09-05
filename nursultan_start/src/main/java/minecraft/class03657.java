/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01404
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01404;
import minecraft.class03664;
import minecraft.class03665;
import minecraft.class03679;

public final class class03657
extends Record {
    final class03665<class01404> transformation;
    private final class03679 billboardConstraints;
    private final int brightnessOverride;
    final class03664 shadowRadius;
    final class03664 shadowStrength;
    private final int glowColorOverride;

    public int L() {
        return this.brightnessOverride;
    }

    public class03657(class03665<class01404> class036652, class03679 class036792, int n, class03664 class036642, class03664 class036643, int n2) {
        this.transformation = class036652;
        this.billboardConstraints = class036792;
        this.brightnessOverride = n;
        this.shadowRadius = class036642;
        this.shadowStrength = class036643;
        this.glowColorOverride = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03657.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "transformation", "billboardConstraints", "brightnessOverride", "shadowRadius", "shadowStrength", "glowColorOverride"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03657.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "transformation", "billboardConstraints", "brightnessOverride", "shadowRadius", "shadowStrength", "glowColorOverride"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03657.class, "transformation;billboardConstraints;brightnessOverride;shadowRadius;shadowStrength;glowColorOverride", "transformation", "billboardConstraints", "brightnessOverride", "shadowRadius", "shadowStrength", "glowColorOverride"}, this);
    }

    public class03664 i() {
        return this.shadowStrength;
    }

    public class03664 u() {
        return this.shadowRadius;
    }

    public class03679 y() {
        return this.billboardConstraints;
    }

    public class03665<class01404> N() {
        return this.transformation;
    }

    public int R() {
        return this.glowColorOverride;
    }
}

