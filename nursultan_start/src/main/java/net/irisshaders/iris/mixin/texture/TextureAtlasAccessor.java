/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08388
 */
package net.irisshaders.iris.mixin.texture;

import java.util.Map;
import minecraft.class01894;
import minecraft.class08388;

public interface TextureAtlasAccessor {
    public int callGetHeight();

    public Map<class01894, class08388> getTexturesByName();

    public int callGetWidth();

    public int getMaxLevel();
}

