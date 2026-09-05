/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class06202
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3d
 */
package net.irisshaders.iris.uniforms;

import minecraft.class03448;
import minecraft.class06202;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3d;

public class CapturedRenderingState {
    public static final CapturedRenderingState INSTANCE = new CapturedRenderingState();
    private static final Vector3d ZERO_VECTOR_3d = new Vector3d();
    private Matrix4fc gbufferModelView;
    private Matrix4fc gbufferProjection;
    private Vector3d fogColor;
    private float fogDensity;
    private float darknessLightFactor;
    private float tickDelta;
    private float realTickDelta;
    private int currentRenderedBlockEntity;
    private int currentRenderedEntity = -1;
    private int currentRenderedItem = -1;
    private int textureReloadCount = 0;
    private float currentAlphaTest;
    private float cloudTime;

    private CapturedRenderingState() {
    }

    public void incrementTextureReloadCount() {
        ++this.textureReloadCount;
    }

    public int getCurrentRenderedEntity() {
        return this.currentRenderedEntity;
    }

    public int getCurrentRenderedItem() {
        return this.currentRenderedItem;
    }

    public void setCurrentBlockEntity(int n) {
        this.currentRenderedBlockEntity = n;
    }

    public void setDarknessLightFactor(float f) {
        this.darknessLightFactor = f;
    }

    public void setFogColor(float f, float f2, float f3) {
        this.fogColor = new Vector3d((double)f, (double)f2, (double)f3);
    }

    public void setFogDensity(float f) {
        this.fogDensity = f;
    }

    public void setRealTickDelta(float f) {
        this.realTickDelta = f;
    }

    public void setCurrentRenderedItem(int n) {
        this.currentRenderedItem = n;
    }

    public void setCurrentEntity(int n) {
        this.currentRenderedEntity = n;
    }

    public int getCurrentRenderedBlockEntity() {
        return this.currentRenderedBlockEntity;
    }

    public float getTickDelta() {
        return this.tickDelta;
    }

    public float getRealTickDelta() {
        return this.realTickDelta;
    }

    public Vector3d getFogColor() {
        if ((class03448)class06202.Nq().T_3 == null || this.fogColor == null) {
            return ZERO_VECTOR_3d;
        }
        return this.fogColor;
    }

    public float getFogDensity() {
        return this.fogDensity;
    }

    public float getCurrentAlphaTest() {
        return this.currentAlphaTest;
    }

    public float getDarknessLightFactor() {
        return this.darknessLightFactor;
    }

    public int getTextureReloadCount() {
        return this.textureReloadCount;
    }

    public void setCloudTime(float f) {
        this.cloudTime = f;
    }

    public void setTickDelta(float f) {
        this.tickDelta = f;
    }

    public void setGbufferModelView(Matrix4fc matrix4fc) {
        this.gbufferModelView = matrix4fc;
    }

    public void setGbufferProjection(Matrix4f matrix4f) {
        this.gbufferProjection = new Matrix4f((Matrix4fc)matrix4f);
    }

    public float getCloudTime() {
        return this.cloudTime;
    }

    public void resetTextureReloadCount() {
        this.textureReloadCount = 0;
    }

    public Matrix4fc getGbufferModelView() {
        return this.gbufferModelView;
    }

    public void setCurrentAlphaTest(float f) {
        this.currentAlphaTest = f;
    }

    public Matrix4fc getGbufferProjection() {
        return this.gbufferProjection;
    }
}

