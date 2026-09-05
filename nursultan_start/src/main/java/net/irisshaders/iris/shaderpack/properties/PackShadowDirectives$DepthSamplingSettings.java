/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.properties;

import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives$SamplingSettings;

public class PackShadowDirectives$DepthSamplingSettings
extends PackShadowDirectives$SamplingSettings {
    private boolean hardwareFiltering = false;

    @Override
    public String toString() {
        return "DepthSamplingSettings{mipmap=" + this.getMipmap() + ", nearest=" + this.getNearest() + ", hardwareFiltering=" + this.hardwareFiltering + "}";
    }

    public boolean getHardwareFiltering() {
        return this.hardwareFiltering;
    }

    void setHardwareFiltering(boolean bl) {
        this.hardwareFiltering = bl;
    }
}

