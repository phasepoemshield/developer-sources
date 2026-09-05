/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.blending;

import net.irisshaders.iris.gl.blending.BlendMode;
import net.irisshaders.iris.gl.blending.BlendModeStorage;

public class BufferBlendOverride {
    private final int drawBuffer;
    private final BlendMode blendMode;

    public BufferBlendOverride(int n, BlendMode blendMode) {
        this.drawBuffer = n;
        this.blendMode = blendMode;
    }

    public void apply() {
        BlendModeStorage.overrideBufferBlend(this.drawBuffer, this.blendMode);
    }
}

