/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pbr.mipmap;

import net.irisshaders.iris.pbr.mipmap.ChannelMipmapGenerator$BlendFunction;

public class LinearBlendFunction
implements ChannelMipmapGenerator$BlendFunction {
    public static final LinearBlendFunction INSTANCE = new LinearBlendFunction();

    @Override
    public int blend(int n, int n2, int n3, int n4) {
        return (n + n2 + n3 + n4) / 4;
    }
}

