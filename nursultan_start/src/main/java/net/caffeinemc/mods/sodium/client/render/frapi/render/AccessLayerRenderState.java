/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 */
package net.caffeinemc.mods.sodium.client.render.frapi.render;

import net.caffeinemc.mods.sodium.client.render.frapi.mesh.MutableMeshImpl;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;

public interface AccessLayerRenderState {
    public void fabric_setRenderTypeGetter(ItemRenderTypeGetter var1);

    public MutableMeshImpl fabric_getMutableMesh();
}

