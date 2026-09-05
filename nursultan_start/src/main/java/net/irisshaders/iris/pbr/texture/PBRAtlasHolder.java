/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pbr.texture;

import net.irisshaders.iris.pbr.texture.PBRAtlasTexture;

public class PBRAtlasHolder {
    protected PBRAtlasTexture normalAtlas;
    protected PBRAtlasTexture specularAtlas;

    public PBRAtlasTexture getNormalAtlas() {
        return this.normalAtlas;
    }

    public void setNormalAtlas(PBRAtlasTexture pBRAtlasTexture) {
        this.normalAtlas = pBRAtlasTexture;
    }

    public void setSpecularAtlas(PBRAtlasTexture pBRAtlasTexture) {
        this.specularAtlas = pBRAtlasTexture;
    }

    public PBRAtlasTexture getSpecularAtlas() {
        return this.specularAtlas;
    }

    public void cycleAnimationFrames() {
        if (this.normalAtlas != null) {
            this.normalAtlas.cycleAnimationFrames();
        }
        if (this.specularAtlas != null) {
            this.specularAtlas.cycleAnimationFrames();
        }
    }
}

