/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.layer;

import net.irisshaders.iris.layer.GbufferPrograms;
import net.irisshaders.iris.layer.RenderingWrapper;

public final class EntityRenderStateShard
implements RenderingWrapper {
    public static final EntityRenderStateShard INSTANCE = new EntityRenderStateShard();

    private EntityRenderStateShard() {
    }

    @Override
    public void clear() {
        GbufferPrograms.endEntities();
    }

    @Override
    public void setup() {
        GbufferPrograms.beginEntities();
    }
}

