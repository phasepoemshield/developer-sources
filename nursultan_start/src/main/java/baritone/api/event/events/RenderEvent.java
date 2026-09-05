/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  org.joml.Matrix4f
 */
package baritone.api.event.events;

import minecraft.class01421;
import org.joml.Matrix4f;

public final class RenderEvent {
    private final float partialTicks;
    private final Matrix4f projectionMatrix;
    private final class01421 modelViewStack;

    public RenderEvent(float f, class01421 class014212, Matrix4f matrix4f) {
        this.partialTicks = f;
        this.modelViewStack = class014212;
        this.projectionMatrix = matrix4f;
    }

    public class01421 getModelViewStack() {
        return this.modelViewStack;
    }

    public final float getPartialTicks() {
        return this.partialTicks;
    }

    public Matrix4f getProjectionMatrix() {
        return this.projectionMatrix;
    }
}

