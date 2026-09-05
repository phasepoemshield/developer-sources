/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode
 *  net.fabricmc.fabric.api.util.TriState
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.frapi.wrapper;

import minecraft.class07211;
import minecraft.class08743;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.client.render.model.QuadViewImpl;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;
import net.caffeinemc.mods.sodium.client.render.model.SodiumShadeMode;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.util.TriState;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class QuadViewWrapper
implements QuadView {
    private static final TriState[] TO_FABRIC = new TriState[]{TriState.TRUE, TriState.FALSE, TriState.DEFAULT};
    private final QuadViewImpl quad;

    public int color(int n) {
        return this.quad.getColor(n);
    }

    public QuadViewWrapper(QuadViewImpl quadViewImpl) {
        this.quad = quadViewImpl;
    }

    public float x(int n) {
        return this.quad.getX(n);
    }

    public float v(int n) {
        return this.quad.getTexV(n);
    }

    public float z(int n) {
        return this.quad.getZ(n);
    }

    public float u(int n) {
        return this.quad.getTexU(n);
    }

    public float y(int n) {
        return this.quad.getY(n);
    }

    public int tag() {
        return this.quad.getTag();
    }

    public @Nullable class08915 glint() {
        return this.quad.glint();
    }

    public QuadAtlas atlas() {
        return this.quad.getQuadAtlas() == SodiumQuadAtlas.BLOCK ? QuadAtlas.BLOCK : QuadAtlas.ITEM;
    }

    public float normalZ(int n) {
        return this.quad.normalZ(n);
    }

    public float normalX(int n) {
        return this.quad.normalX(n);
    }

    public float normalY(int n) {
        return this.quad.normalY(n);
    }

    public QuadViewImpl getOriginal() {
        return this.quad;
    }

    public float posByIndex(int n, int n2) {
        return this.quad.posByIndex(n, n2);
    }

    public Vector3f copyPos(int n, @Nullable Vector3f vector3f) {
        return this.quad.copyPos(n, vector3f);
    }

    public Vector2f copyUv(int n, @Nullable Vector2f vector2f) {
        return this.quad.copyUv(n, vector2f);
    }

    public boolean emissive() {
        return this.quad.emissive();
    }

    public @Nullable class07211 cullFace() {
        return this.quad.getCullFace();
    }

    public ShadeMode shadeMode() {
        return this.quad.getShadeMode() == SodiumShadeMode.ENHANCED ? ShadeMode.ENHANCED : ShadeMode.VANILLA;
    }

    public boolean hasNormal(int n) {
        return this.quad.hasNormal(n);
    }

    public @NonNull class07211 lightFace() {
        return this.quad.getLightFace();
    }

    public Vector3fc faceNormal() {
        return this.quad.faceNormal();
    }

    public @Nullable Vector3f copyNormal(int n, @Nullable Vector3f vector3f) {
        return this.quad.copyNormal(n, vector3f);
    }

    public int lightmap(int n) {
        return this.quad.getLight(n);
    }

    public @Nullable class08743 renderLayer() {
        return this.quad.getRenderType();
    }

    public @Nullable class07211 nominalFace() {
        return this.quad.getNominalFace();
    }

    public boolean diffuseShade() {
        return this.quad.diffuseShade();
    }

    public TriState ambientOcclusion() {
        return TO_FABRIC[this.quad.ambientOcclusion().ordinal()];
    }

    public int tintIndex() {
        return this.quad.getTintIndex();
    }
}

