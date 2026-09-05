/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.layer;

import net.irisshaders.iris.layer.GbufferPrograms;
import net.irisshaders.iris.layer.RenderingWrapper;

public class IsOutlineRenderStateShard
implements RenderingWrapper {
    public static final IsOutlineRenderStateShard INSTANCE = new IsOutlineRenderStateShard();

    private IsOutlineRenderStateShard() {
    }

    @Override
    public void clear() {
        GbufferPrograms.endOutline();
    }

    @Override
    public void setup() {
        GbufferPrograms.beginOutline();
    }
}

