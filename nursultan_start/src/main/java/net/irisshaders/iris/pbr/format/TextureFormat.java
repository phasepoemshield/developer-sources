/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08918
 */
package net.irisshaders.iris.pbr.format;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import minecraft.class08918;
import net.irisshaders.iris.pbr.mipmap.CustomMipmapGenerator;
import net.irisshaders.iris.pbr.texture.PBRType;

public interface TextureFormat {
    public String name();

    public String version();

    default public List<String> getDefines() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = this.name().toUpperCase(Locale.ROOT).replaceAll("-", "_");
        String string2 = "MC_TEXTURE_FORMAT_" + string;
        arrayList.add(string2);
        String string3 = this.version();
        if (string3 != null) {
            String string4 = string3.replaceAll("[.-]", "_");
            String string5 = string2 + "_" + string4;
            arrayList.add(string5);
        }
        return arrayList;
    }

    public CustomMipmapGenerator getMipmapGenerator(PBRType var1);

    default public void setupTextureParameters(PBRType pBRType, class08918 class089182) {
        if (!this.canInterpolateValues(pBRType)) {
            class089182.method_68004().iris$markMipmapNonLinear();
        }
    }

    public boolean canInterpolateValues(PBRType var1);
}

