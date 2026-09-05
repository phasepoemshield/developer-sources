/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 */
package net.irisshaders.iris.pbr.mipmap;

import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.irisshaders.iris.pbr.mipmap.AbstractMipmapGenerator;
import net.irisshaders.iris.pbr.mipmap.ChannelMipmapGenerator$BlendFunction;

public class ChannelMipmapGenerator
extends AbstractMipmapGenerator {
    protected final ChannelMipmapGenerator$BlendFunction redFunc;
    protected final ChannelMipmapGenerator$BlendFunction greenFunc;
    protected final ChannelMipmapGenerator$BlendFunction blueFunc;
    protected final ChannelMipmapGenerator$BlendFunction alphaFunc;

    public ChannelMipmapGenerator(ChannelMipmapGenerator$BlendFunction channelMipmapGenerator$BlendFunction, ChannelMipmapGenerator$BlendFunction channelMipmapGenerator$BlendFunction2, ChannelMipmapGenerator$BlendFunction channelMipmapGenerator$BlendFunction3, ChannelMipmapGenerator$BlendFunction channelMipmapGenerator$BlendFunction4) {
        this.redFunc = channelMipmapGenerator$BlendFunction;
        this.greenFunc = channelMipmapGenerator$BlendFunction2;
        this.blueFunc = channelMipmapGenerator$BlendFunction3;
        this.alphaFunc = channelMipmapGenerator$BlendFunction4;
    }

    @Override
    public int blend(int n, int n2, int n3, int n4) {
        return this.packABGR(this.alphaFunc.blend(ColorABGR.unpackAlpha((int)n), ColorABGR.unpackAlpha((int)n2), ColorABGR.unpackAlpha((int)n3), ColorABGR.unpackAlpha((int)n4)), this.blueFunc.blend(ColorABGR.unpackBlue((int)n), ColorABGR.unpackBlue((int)n2), ColorABGR.unpackBlue((int)n3), ColorABGR.unpackBlue((int)n4)), this.greenFunc.blend(ColorABGR.unpackGreen((int)n), ColorABGR.unpackGreen((int)n2), ColorABGR.unpackGreen((int)n3), ColorABGR.unpackGreen((int)n4)), this.redFunc.blend(ColorABGR.unpackRed((int)n), ColorABGR.unpackRed((int)n2), ColorABGR.unpackRed((int)n3), ColorABGR.unpackRed((int)n4)));
    }

    private int packABGR(int n, int n2, int n3, int n4) {
        return ColorABGR.pack((int)n4, (int)n3, (int)n2, (int)n);
    }
}

