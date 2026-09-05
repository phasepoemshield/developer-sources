/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.sampler;

import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;

public class GlSampler
extends GlResource {
    public static final GlSampler MIPPED_LINEAR_HW = new GlSampler(true, true, true, true, true, true);
    public static final GlSampler LINEAR_HW = new GlSampler(true, true, false, true, true, true);
    public static final GlSampler MIPPED_NEAREST_HW = new GlSampler(false, true, true, true, true, true);
    public static final GlSampler NEAREST_HW = new GlSampler(false, true, false, true, true, true);
    public static final GlSampler MIPPED_LINEAR = new GlSampler(true, true, true, false, false, true);
    public static final GlSampler LINEAR = new GlSampler(true, true, false, false, false, true);
    public static final GlSampler MIPPED_NEAREST = new GlSampler(false, true, true, false, false, true);
    public static final GlSampler NEAREST = new GlSampler(false, true, false, false, false, true);
    public static final GlSampler NEAREST_REPEAT = new GlSampler(false, true, false, false, false, false);
    public static final GlSampler LINEAR_REPEAT = new GlSampler(true, true, false, false, false, false);
    public static final GlSampler MIPPED_NEAREST_NEAREST = new GlSampler(false, false, true, false, false, true);
    public static final GlSampler MIPPED_NEAREST_REPEAT = new GlSampler(false, true, true, false, false, false);

    public GlSampler(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        block2: {
            block1: {
                super(IrisRenderSystem.genSampler());
                IrisRenderSystem.samplerParameteri(this.getId(), 10240, bl ? 9729 : 9728);
                IrisRenderSystem.samplerParameteri(this.getId(), 10242, bl6 ? 33071 : 10497);
                IrisRenderSystem.samplerParameteri(this.getId(), 10243, bl6 ? 33071 : 10497);
                if (!bl3) break block1;
                IrisRenderSystem.samplerParameteri(this.getId(), 10241, bl2 ? (bl ? 9987 : 9986) : (bl ? 9985 : 9984));
                break block2;
            }
            IrisRenderSystem.samplerParameteri(this.getId(), 10241, bl ? 9729 : 9728);
        }
        if (bl5) {
            IrisRenderSystem.samplerParameteri(this.getId(), 34892, 34894);
        }
    }

    public GlSampler(int n) {
        super(n);
    }

    public int getId() {
        return this.getGlId();
    }

    @Override
    public void destroyInternal() {
        IrisRenderSystem.destroySampler(this.getGlId());
    }
}

