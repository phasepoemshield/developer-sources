/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01423
 *  minecraft.class08800
 *  org.joml.Quaternionf
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01423;
import minecraft.class08800;
import org.joml.Quaternionf;

public final class class06031
extends Record {
    private final class01423 pose;
    private final class08800 entityRenderState;
    private final Quaternionf rotation;

    public Quaternionf L() {
        return this.rotation;
    }

    public class06031(class01423 class014232, class08800 class088002, Quaternionf quaternionf) {
        this.pose = class014232;
        this.entityRenderState = class088002;
        this.rotation = quaternionf;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06031.class, "pose;entityRenderState;rotation", "pose", "entityRenderState", "rotation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06031.class, "pose;entityRenderState;rotation", "pose", "entityRenderState", "rotation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06031.class, "pose;entityRenderState;rotation", "pose", "entityRenderState", "rotation"}, this);
    }

    public class08800 y() {
        return this.entityRenderState;
    }

    public class01423 N() {
        return this.pose;
    }
}

