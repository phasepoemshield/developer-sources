/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.mesh;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface QuadTransform {
    public boolean transform(MutableQuadView var1);
}

