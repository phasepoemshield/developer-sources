/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pbr.format;

import java.util.Objects;
import net.irisshaders.iris.pbr.format.TextureFormat;
import net.irisshaders.iris.pbr.mipmap.ChannelMipmapGenerator;
import net.irisshaders.iris.pbr.mipmap.CustomMipmapGenerator;
import net.irisshaders.iris.pbr.mipmap.DiscreteBlendFunction;
import net.irisshaders.iris.pbr.mipmap.LinearBlendFunction;
import net.irisshaders.iris.pbr.texture.PBRType;

public record LabPBRTextureFormat(String name, String version) implements TextureFormat
{
    public static final ChannelMipmapGenerator SPECULAR_MIPMAP_GENERATOR = new ChannelMipmapGenerator(LinearBlendFunction.INSTANCE, new DiscreteBlendFunction(n -> n < 230 ? 0 : n - 229), new DiscreteBlendFunction(n -> n < 65 ? 0 : 1), new DiscreteBlendFunction(n -> n < 255 ? 0 : 1));

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        LabPBRTextureFormat labPBRTextureFormat = (LabPBRTextureFormat)object;
        return Objects.equals(this.name, labPBRTextureFormat.name) && Objects.equals(this.version, labPBRTextureFormat.version);
    }

    @Override
    public CustomMipmapGenerator getMipmapGenerator(PBRType pBRType) {
        if (pBRType == PBRType.SPECULAR) {
            return SPECULAR_MIPMAP_GENERATOR;
        }
        return null;
    }

    @Override
    public boolean canInterpolateValues(PBRType pBRType) {
        return pBRType != PBRType.SPECULAR;
    }
}

