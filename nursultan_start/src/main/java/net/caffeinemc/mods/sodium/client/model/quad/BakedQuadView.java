/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.model.quad;

import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;

public interface BakedQuadView
extends ModelQuadView {
    public boolean hasAO();

    public boolean hasShade();

    @Override
    public int getFaceNormal();

    public ModelQuadFacing getNormalFace();
}

