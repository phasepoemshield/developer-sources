/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02022
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.util.TriState
 *  org.joml.Vector2f
 *  org.joml.Vector2fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.renderer.v1.mesh;

import minecraft.class02022;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08915;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadTransform;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.util.TriState;
import org.joml.Vector2f;
import org.joml.Vector2fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface QuadEmitter
extends MutableQuadView {
    public static final float CULL_FACE_EPSILON = 1.0E-5f;

    @Override
    default public QuadEmitter color(int n, int n2, int n3, int n4) {
        MutableQuadView.super.color(n, n2, n3, n4);
        return this;
    }

    @Override
    public QuadEmitter color(int var1, int var2);

    @Override
    default public QuadEmitter pos(int n, Vector3f vector3f) {
        MutableQuadView.super.pos(n, vector3f);
        return this;
    }

    @Override
    public QuadEmitter pos(int var1, float var2, float var3, float var4);

    @Override
    default public QuadEmitter pos(int n, Vector3fc vector3fc) {
        MutableQuadView.super.pos(n, vector3fc);
        return this;
    }

    @Override
    default public QuadEmitter normal(int n, Vector3f vector3f) {
        MutableQuadView.super.normal(n, vector3f);
        return this;
    }

    @Override
    default public QuadEmitter normal(int n, Vector3fc vector3fc) {
        MutableQuadView.super.normal(n, vector3fc);
        return this;
    }

    @Override
    public QuadEmitter normal(int var1, float var2, float var3, float var4);

    @Override
    public QuadEmitter tag(int var1);

    @Override
    public QuadEmitter copyFrom(QuadView var1);

    public void popTransform();

    public void pushTransform(QuadTransform var1);

    @Override
    public QuadEmitter glint(@Nullable class08915 var1);

    @Override
    public QuadEmitter atlas(QuadAtlas var1);

    public QuadEmitter emit();

    default public QuadEmitter square(class07211 class072112, float f, float f2, float f3, float f4, float f5) {
        if (Math.abs(f5) < 1.0E-5f) {
            this.cullFace(class072112);
            f5 = 0.0f;
        } else {
            this.cullFace(null);
        }
        this.nominalFace(class072112);
        switch (class072112) {
            case field_11036: {
                f5 = 1.0f - f5;
                f4 = 1.0f - f4;
                f2 = 1.0f - f2;
            }
            case field_11033: {
                this.pos(0, f, f5, f4);
                this.pos(1, f, f5, f2);
                this.pos(2, f3, f5, f2);
                this.pos(3, f3, f5, f4);
                break;
            }
            case field_11034: {
                f5 = 1.0f - f5;
                f = 1.0f - f;
                f3 = 1.0f - f3;
            }
            case field_11039: {
                this.pos(0, f5, f4, f);
                this.pos(1, f5, f2, f);
                this.pos(2, f5, f2, f3);
                this.pos(3, f5, f4, f3);
                break;
            }
            case field_11035: {
                f5 = 1.0f - f5;
                f = 1.0f - f;
                f3 = 1.0f - f3;
            }
            case field_11043: {
                this.pos(0, 1.0f - f, f4, f5);
                this.pos(1, 1.0f - f, f2, f5);
                this.pos(2, 1.0f - f3, f2, f5);
                this.pos(3, 1.0f - f3, f4, f5);
            }
        }
        return this;
    }

    @Override
    default public QuadEmitter uv(int n, Vector2fc vector2fc) {
        MutableQuadView.super.uv(n, vector2fc);
        return this;
    }

    @Override
    public QuadEmitter uv(int var1, float var2, float var3);

    @Override
    default public QuadEmitter uv(int n, Vector2f vector2f) {
        MutableQuadView.super.uv(n, vector2f);
        return this;
    }

    default public QuadEmitter uvUnitSquare() {
        this.uv(0, 0.0f, 0.0f);
        this.uv(1, 0.0f, 1.0f);
        this.uv(2, 1.0f, 1.0f);
        this.uv(3, 1.0f, 0.0f);
        return this;
    }

    @Override
    default public QuadEmitter spriteBake(class08388 class083882, int n) {
        MutableQuadView.super.spriteBake(class083882, n);
        return this;
    }

    @Override
    public QuadEmitter emissive(boolean var1);

    @Override
    public QuadEmitter cullFace(@Nullable class07211 var1);

    @Override
    public QuadEmitter shadeMode(ShadeMode var1);

    @Override
    default public QuadEmitter lightmap(int n, int n2, int n3, int n4) {
        MutableQuadView.super.lightmap(n, n2, n3, n4);
        return this;
    }

    @Override
    public QuadEmitter lightmap(int var1, int var2);

    @Override
    public QuadEmitter renderLayer(@Nullable class08743 var1);

    @Override
    public QuadEmitter nominalFace(@Nullable class07211 var1);

    @Override
    public QuadEmitter fromBakedQuad(class02022 var1);

    @Override
    public QuadEmitter diffuseShade(boolean var1);

    @Override
    public QuadEmitter ambientOcclusion(TriState var1);

    @Override
    public QuadEmitter tintIndex(int var1);
}

