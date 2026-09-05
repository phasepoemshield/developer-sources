/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pbr.texture;

import net.irisshaders.iris.pbr.texture.PBRSpriteHolder;

public interface SpriteContentsExtension {
    public PBRSpriteHolder getPBRHolder();

    public PBRSpriteHolder getOrCreatePBRHolder();
}

