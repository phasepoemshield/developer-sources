/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 */
package net.irisshaders.iris.pipeline.programs;

import com.mojang.blaze3d.textures.GpuTextureView;

public interface IrisProgram {
    public int iris$getBlockIndex(int var1, CharSequence var2);

    public boolean iris$isSetUp();

    public void iris$setupState(GpuTextureView var1);

    public void iris$clearState();
}

