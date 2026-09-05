/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.mixinterface;

public interface GpuTextureInterface {
    default public int iris$getGlId() {
        throw new AssertionError((Object)"Not accessible.");
    }

    default public void iris$markMipmapNonLinear() {
        throw new AssertionError((Object)"Not accessible.");
    }
}

