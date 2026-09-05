/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07942
 *  org.joml.Matrix4f
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07942;
import org.joml.Matrix4f;

public final class class08121
extends Record {
    private final Matrix4f pose;
    private final class07942 movingBlockRenderState;

    public class08121(Matrix4f matrix4f, class07942 class079422) {
        this.pose = matrix4f;
        this.movingBlockRenderState = class079422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08121.class, "pose;movingBlockRenderState", "pose", "movingBlockRenderState"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08121.class, "pose;movingBlockRenderState", "pose", "movingBlockRenderState"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08121.class, "pose;movingBlockRenderState", "pose", "movingBlockRenderState"}, this);
    }

    public class07942 y() {
        return this.movingBlockRenderState;
    }

    public Matrix4f N() {
        return this.pose;
    }
}

