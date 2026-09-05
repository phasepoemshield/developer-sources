/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01423
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import minecraft.class01391;
import minecraft.class01423;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableQuadViewImpl;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.AbstractRenderContext$1;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;

@Environment(value=EnvType.CLIENT)
public abstract class AbstractRenderContext {
    private final MutableQuadViewImpl editorQuad = new AbstractRenderContext$1(this);
    private final Vector4f posVec = new Vector4f();
    private final Vector3f normalVec = new Vector3f();
    protected class01423 matrices;
    protected int overlay;

    protected void bufferQuad(MutableQuadViewImpl mutableQuadViewImpl, class01391 class013912) {
        Vector4f vector4f = this.posVec;
        Vector3f vector3f = this.normalVec;
        class01423 class014232 = this.matrices;
        Matrix4f matrix4f = class014232.N();
        boolean bl = mutableQuadViewImpl.hasVertexNormals();
        if (bl) {
            mutableQuadViewImpl.populateMissingNormals();
        } else {
            class014232.N(mutableQuadViewImpl.faceNormal(), vector3f);
        }
        for (int i = 0; i < 4; ++i) {
            vector4f.set(mutableQuadViewImpl.x(i), mutableQuadViewImpl.y(i), mutableQuadViewImpl.z(i), 1.0f);
            vector4f.mul((Matrix4fc)matrix4f);
            if (bl) {
                mutableQuadViewImpl.copyNormal(i, vector3f);
                class014232.N((Vector3fc)vector3f, vector3f);
            }
            class013912.N(vector4f.x(), vector4f.y(), vector4f.z(), mutableQuadViewImpl.color(i), mutableQuadViewImpl.u(i), mutableQuadViewImpl.v(i), this.overlay, mutableQuadViewImpl.lightmap(i), vector3f.x(), vector3f.y(), vector3f.z());
        }
    }

    protected abstract void bufferQuad(MutableQuadViewImpl var1);

    protected QuadEmitter getEmitter() {
        this.editorQuad.clear();
        return this.editorQuad;
    }
}

