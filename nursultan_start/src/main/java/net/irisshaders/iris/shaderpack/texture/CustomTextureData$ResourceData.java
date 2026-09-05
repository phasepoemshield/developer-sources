/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.texture;

import net.irisshaders.iris.shaderpack.texture.CustomTextureData;

public final class CustomTextureData$ResourceData
extends CustomTextureData {
    private final String namespace;
    private final String location;

    public CustomTextureData$ResourceData(String string, String string2) {
        this.namespace = string;
        this.location = string2;
    }

    public String getLocation() {
        return this.location;
    }

    public String getNamespace() {
        return this.namespace;
    }
}

