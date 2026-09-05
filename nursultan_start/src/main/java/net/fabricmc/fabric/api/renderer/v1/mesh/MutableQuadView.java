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
 *  net.fabricmc.fabric.impl.renderer.QuadSpriteBaker
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
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.util.TriState;
import net.fabricmc.fabric.impl.renderer.QuadSpriteBaker;
import org.joml.Vector2f;
import org.joml.Vector2fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface MutableQuadView
extends QuadView {
    public static final int BAKE_ROTATE_NONE = 0;
    public static final int BAKE_ROTATE_90 = 1;
    public static final int BAKE_ROTATE_180 = 2;
    public static final int BAKE_ROTATE_270 = 3;
    public static final int BAKE_LOCK_UV = 4;
    public static final int BAKE_FLIP_U = 8;
    public static final int BAKE_FLIP_V = 16;
    public static final int BAKE_NORMALIZED = 32;

    default public MutableQuadView color(int n, int n2, int n3, int n4) {
        this.color(0, n);
        this.color(1, n2);
        this.color(2, n3);
        this.color(3, n4);
        return this;
    }

    public MutableQuadView color(int var1, int var2);

    public MutableQuadView pos(int var1, float var2, float var3, float var4);

    default public MutableQuadView pos(int n, Vector3fc vector3fc) {
        return this.pos(n, vector3fc.x(), vector3fc.y(), vector3fc.z());
    }

    default public MutableQuadView pos(int n, Vector3f vector3f) {
        return this.pos(n, vector3f.x, vector3f.y, vector3f.z);
    }

    default public MutableQuadView normal(int n, Vector3f vector3f) {
        return this.normal(n, vector3f.x, vector3f.y, vector3f.z);
    }

    public MutableQuadView normal(int var1, float var2, float var3, float var4);

    default public MutableQuadView normal(int n, Vector3fc vector3fc) {
        return this.normal(n, vector3fc.x(), vector3fc.y(), vector3fc.z());
    }

    public MutableQuadView tag(int var1);

    public MutableQuadView copyFrom(QuadView var1);

    public MutableQuadView glint(@Nullable class08915 var1);

    public MutableQuadView atlas(QuadAtlas var1);

    public MutableQuadView uv(int var1, float var2, float var3);

    default public MutableQuadView uv(int n, Vector2f vector2f) {
        return this.uv(n, vector2f.x, vector2f.y);
    }

    default public MutableQuadView uv(int n, Vector2fc vector2fc) {
        return this.uv(n, vector2fc.x(), vector2fc.y());
    }

    default public MutableQuadView spriteBake(class08388 class083882, int n) {
        QuadSpriteBaker.bakeSprite((MutableQuadView)this, (class08388)class083882, (int)n);
        QuadAtlas quadAtlas = QuadAtlas.of(class083882.method_45852());
        if (quadAtlas == null) {
            quadAtlas = QuadAtlas.BLOCK;
        }
        this.atlas(quadAtlas);
        return this;
    }

    public MutableQuadView emissive(boolean var1);

    public MutableQuadView cullFace(@Nullable class07211 var1);

    public MutableQuadView shadeMode(ShadeMode var1);

    public MutableQuadView lightmap(int var1, int var2);

    default public MutableQuadView lightmap(int n, int n2, int n3, int n4) {
        this.lightmap(0, n);
        this.lightmap(1, n2);
        this.lightmap(2, n3);
        this.lightmap(3, n4);
        return this;
    }

    public MutableQuadView renderLayer(@Nullable class08743 var1);

    public MutableQuadView nominalFace(@Nullable class07211 var1);

    public MutableQuadView fromBakedQuad(class02022 var1);

    public MutableQuadView diffuseShade(boolean var1);

    public MutableQuadView ambientOcclusion(TriState var1);

    public MutableQuadView tintIndex(int var1);
}

