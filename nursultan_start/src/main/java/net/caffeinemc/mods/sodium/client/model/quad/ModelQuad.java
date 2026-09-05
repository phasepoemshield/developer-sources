/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.client.util.ModelQuadUtil
 */
package net.caffeinemc.mods.sodium.client.model.quad;

import minecraft.class07211;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadViewMutable;
import net.caffeinemc.mods.sodium.client.util.ModelQuadUtil;

public class ModelQuad
implements ModelQuadViewMutable {
    private final int[] data = new int[32];
    private int flags;
    private class08388 sprite;
    private class07211 direction;
    private int tintIdx;
    private int faceNormal;

    @Override
    public int getFlags() {
        return this.flags;
    }

    @Override
    public void setFlags(int n) {
        this.flags = n;
    }

    @Override
    public int getLight(int n) {
        return this.data[ModelQuadUtil.vertexOffset((int)n) + 6];
    }

    @Override
    public void setLight(int n, int n2) {
        this.data[ModelQuadUtil.vertexOffset((int)n) + 6] = n2;
    }

    @Override
    public void setColor(int n, int n2) {
        this.data[ModelQuadUtil.vertexOffset((int)n) + 3] = n2;
    }

    @Override
    public void setZ(int n, float f) {
        this.data[ModelQuadUtil.vertexOffset((int)n) + 0 + 2] = Float.floatToRawIntBits(f);
    }

    @Override
    public void setX(int n, float f) {
        this.data[ModelQuadUtil.vertexOffset((int)n) + 0] = Float.floatToRawIntBits(f);
    }

    @Override
    public void setY(int n, float f) {
        this.data[ModelQuadUtil.vertexOffset((int)n) + 0 + 1] = Float.floatToRawIntBits(f);
    }

    @Override
    public float getY(int n) {
        return Float.intBitsToFloat(this.data[ModelQuadUtil.vertexOffset((int)n) + 0 + 1]);
    }

    @Override
    public float getX(int n) {
        return Float.intBitsToFloat(this.data[ModelQuadUtil.vertexOffset((int)n) + 0]);
    }

    @Override
    public float getZ(int n) {
        return Float.intBitsToFloat(this.data[ModelQuadUtil.vertexOffset((int)n) + 0 + 2]);
    }

    @Override
    public int getColor(int n) {
        return this.data[ModelQuadUtil.vertexOffset((int)n) + 3];
    }

    @Override
    public void setLightFace(class07211 class072112) {
        this.direction = class072112;
    }

    @Override
    public void setFaceNormal(int n) {
        this.faceNormal = n;
    }

    @Override
    public float getTexU(int n) {
        return Float.intBitsToFloat(this.data[ModelQuadUtil.vertexOffset((int)n) + 4]);
    }

    @Override
    public void setNormal(int n, int n2) {
        this.data[ModelQuadUtil.vertexOffset((int)n) + 7] = n2;
    }

    @Override
    public float getTexV(int n) {
        return Float.intBitsToFloat(this.data[ModelQuadUtil.vertexOffset((int)n) + 4 + 1]);
    }

    @Override
    public void setTexU(int n, float f) {
        this.data[ModelQuadUtil.vertexOffset((int)n) + 4] = Float.floatToRawIntBits(f);
    }

    @Override
    public void setTexV(int n, float f) {
        this.data[ModelQuadUtil.vertexOffset((int)n) + 4 + 1] = Float.floatToRawIntBits(f);
    }

    @Override
    public void setSprite(class08388 class083882) {
        this.sprite = class083882;
    }

    @Override
    public class08388 getSprite() {
        return this.sprite;
    }

    @Override
    public int getVertexNormal(int n) {
        return this.data[ModelQuadUtil.vertexOffset((int)n) + 7];
    }

    @Override
    public int getMaxLightQuad(int n) {
        return this.getLight(n);
    }

    @Override
    public void setTintIndex(int n) {
        this.tintIdx = n;
    }

    @Override
    public int getFaceNormal() {
        return this.faceNormal;
    }

    @Override
    public class07211 getLightFace() {
        return this.direction;
    }

    @Override
    public int getTintIndex() {
        return this.tintIdx;
    }
}

