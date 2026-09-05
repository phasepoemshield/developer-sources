/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.layer;

import net.irisshaders.iris.layer.GbufferPrograms;
import net.irisshaders.iris.layer.RenderingWrapper;

public final class BlockEntityRenderStateShard
implements RenderingWrapper {
    public static final BlockEntityRenderStateShard INSTANCE = new BlockEntityRenderStateShard();

    private BlockEntityRenderStateShard() {
    }

    @Override
    public void clear() {
        GbufferPrograms.endBlockEntities();
    }

    @Override
    public void setup() {
        GbufferPrograms.beginBlockEntities();
    }
}

