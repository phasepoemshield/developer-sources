/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pbr.texture;

import net.irisshaders.iris.pbr.texture.PBRAtlasHolder;

public interface TextureAtlasExtension {
    public PBRAtlasHolder getPBRHolder();

    public PBRAtlasHolder getOrCreatePBRHolder();
}

