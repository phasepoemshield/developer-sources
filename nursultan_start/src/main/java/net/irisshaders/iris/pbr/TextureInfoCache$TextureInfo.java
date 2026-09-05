/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 */
package net.irisshaders.iris.pbr;

import com.mojang.blaze3d.opengl.GlStateManager;

public class TextureInfoCache$TextureInfo {
    private final int id;
    int internalFormat = -1;
    int width = -1;
    int height = -1;

    TextureInfoCache$TextureInfo(int n) {
        this.id = n;
    }

    public int getId() {
        return this.id;
    }

    public int getWidth() {
        if (this.width == -1) {
            this.width = this.fetchLevelParameter(4096);
        }
        return this.width;
    }

    public int getInternalFormat() {
        if (this.internalFormat == -1) {
            this.internalFormat = this.fetchLevelParameter(4099);
        }
        return this.internalFormat;
    }

    private int fetchLevelParameter(int n) {
        int n2 = GlStateManager._getInteger((int)32873);
        GlStateManager._bindTexture((int)this.id);
        int n3 = GlStateManager._getTexLevelParameter((int)3553, (int)0, (int)n);
        GlStateManager._bindTexture((int)n2);
        return n3;
    }

    public int getHeight() {
        if (this.height == -1) {
            this.height = this.fetchLevelParameter(4097);
        }
        return this.height;
    }
}

