/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.parameters;

import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.parameters.AlphaCutoffParameter;

public class MaterialParameters {
    public static final int OFFSET_USE_MIP = 0;
    public static final int OFFSET_ALPHA_CUTOFF = 1;

    public static int pack(AlphaCutoffParameter alphaCutoffParameter, boolean bl) {
        return (bl ? 1 : 0) << 0 | alphaCutoffParameter.ordinal() << 1;
    }
}

