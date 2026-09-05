/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 *  net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableMeshImpl
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.accessor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.MutableMeshImpl;

@Environment(value=EnvType.CLIENT)
public interface AccessLayerRenderState {
    public void fabric_setRenderTypeGetter(ItemRenderTypeGetter var1);

    public MutableMeshImpl fabric_getMutableMesh();
}

