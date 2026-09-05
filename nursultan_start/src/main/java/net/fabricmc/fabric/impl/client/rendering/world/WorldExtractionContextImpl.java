/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01383
 *  minecraft.class02233
 *  minecraft.class03063
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class05363
 *  minecraft.class05932
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.rendering.world;

import minecraft.class01383;
import minecraft.class02233;
import minecraft.class03063;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class05363;
import minecraft.class05932;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class WorldExtractionContextImpl
implements WorldExtractionContext {
    private class03386 gameRenderer;
    private class03063 worldRenderer;
    private class05932 worldRenderState;
    private class03448 world;
    private class05363 camera;
    private @Nullable class01383 frustum;
    private class02233 tickCounter;
    private Matrix4f viewMatrix;
    private Matrix4f cullProjectionMatrix;
    private boolean blockOutlines;

    public void prepare(class03386 class033862, class03063 class030632, class05932 class059322, class03448 class034482, class02233 class022332, boolean bl, class05363 class053632, Matrix4f matrix4f, Matrix4f matrix4f2) {
        this.gameRenderer = class033862;
        this.worldRenderer = class030632;
        this.worldRenderState = class059322;
        this.world = class034482;
        this.tickCounter = class022332;
        this.blockOutlines = bl;
        this.camera = class053632;
        this.viewMatrix = matrix4f;
        this.cullProjectionMatrix = matrix4f2;
        this.frustum = null;
    }

    public @Nullable class01383 frustum() {
        return this.frustum;
    }

    public class05363 camera() {
        return this.camera;
    }

    public void setFrustum(@Nullable class01383 class013832) {
        this.frustum = class013832;
    }

    public class03448 world() {
        return this.world;
    }

    public Matrix4fc cullProjectionMatrix() {
        return this.cullProjectionMatrix;
    }

    public class05932 worldState() {
        return this.worldRenderState;
    }

    public Matrix4fc viewMatrix() {
        return this.viewMatrix;
    }

    public boolean blockOutlines() {
        return this.blockOutlines;
    }

    public class03063 worldRenderer() {
        return this.worldRenderer;
    }

    public class02233 tickCounter() {
        return this.tickCounter;
    }

    public class03386 gameRenderer() {
        return this.gameRenderer;
    }
}

