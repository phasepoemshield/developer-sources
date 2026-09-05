/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView
 */
package net.fabricmc.fabric.impl.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
interface QuadSpriteBaker$VertexModifier {
    public void apply(MutableQuadView var1, int var2);
}

